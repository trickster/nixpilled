{
  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };
  outputs = { self, ... }: {
    templates = {
      scala = {
        path = ./scala;
        description = "Scala project";
      };
      python = {
        path = ./python;
        description = "Python project";
      };
    };
  };
}
