package br.javai.proxy;

import lombok.Getter;


@Getter
public class ProxyService implements Proxy{
  RealService realService;

  private String lastIp;

  private Integer countAcess;

  public ProxyService(){
    realService = new RealService();
  }

  @Override
  public void showIp(String ip) {
    this.lastIp = ip;
    realService.showIp(ip);
  }

  @Override
  public void showName(String name) {
    realService.showName(name.toUpperCase());
  }

  @Override
  public void checkpoint() {
    countAcess += 1;

    if (countAcess >= 5){
      realService.checkpoint();
    }
  }
}
