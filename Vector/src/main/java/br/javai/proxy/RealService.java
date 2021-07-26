package br.javai.proxy;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RealService implements Proxy {

  @Override
  public void showIp(String ip) {
    System.out.println("Seu IP é ".concat(ip));
  }

  @Override
  public void showName(String name) {
    System.out.println("Seu nome é ".concat(name));
  }

  @Override
  public void checkpoint() {
    System.out.println("você chegou até aqui");
  }
}
