package com.aluracursos.conversordemoneda.api;

public record MedidaDeConversion(String base_code,
                                 String target_code,
                                 double conversion_rate,
                                 double conversion_result)
{
}
