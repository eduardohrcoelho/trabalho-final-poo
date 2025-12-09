package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Agendamento {
  private int id;
  private LocalDate prazo;
  private LocalTime horario;
  private int prioridade;
  private Cliente cliente;
  private List<Servico> servicos;

  public Agendamento(int id, LocalDate prize, LocalTime horario, Cliente cliente){
    this.id = id;
    this.prazo = prazo;
    this.horario = horario;
    this.cliente = cliente;
    this.servicos = new ArrayList<>();
  }
}


