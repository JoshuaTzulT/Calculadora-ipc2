<%-- 
    Documento   : vista_principal
    Created el : 26/09/2020
    Autor    : Joshua Tzul
--%>

<body>
    <div>

        <form action="${pageContext.request.contextPath}/Gestion" method="POST">
            <div>
                <div>
                    <div style="width: 100px;">
                        <b>Primer Número (n1)</b>
                    </div>
                    <div style="margin-right: 0px;margin-left: 200px;margin-top: -20px;">
                        <input type="text" placeholder="" name="primerNumero" required="">						
                    </div>
                </div>
                <div>
                    <div class="col" style="width: 100px;">
                        <b>Segundo Número (n2)</b>
                    </div>

                    <div style="padding-left: 200px;margin-top: -20px;">
                        <input type="text" placeholder="" name="segundoNumero" required="" style="margin-left: 0px;">						
                    </div>

                </div>
                <div>

                    <div style="margin-top: 50px;margin-left: 15px;">
                        <input type="submit" name="sumar" value="Sumar" />
                        <input type="submit" name="multiplicar" value="Multiplicar" />
                        <input type="submit" name="mayor" value="Obtener Número Mayor" />
                        <input type="submit" name="potencia" value="Potencia (n1)^(n2)" />
                        <input type="submit" name="binario" value="Valor Binario" />
                    </div>


                </div>
            </div>		
        </form>		
    </div>
</body>