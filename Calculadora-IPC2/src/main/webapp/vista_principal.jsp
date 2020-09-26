<%-- 
    Documento   : vista_principal
    Created el : 26/09/2020
    Autor    : Joshua Tzul
--%>

<body>
	<div class="bgr">
		<form action="<%=request.getContextPath()%>/login" method="POST">
			<div class="container">
				<div class="row">
					<div class="col" style="width: 100px;">
						<b>Primer Número (n1)</b>
					</div>
					<div class="col" style="margin-right: 0px;margin-left: 200px;margin-top: -20px;">
						<input type="text" placeholder="" name="primerNumero" required="">						
					</div>
				</div>
				<div class="row">
					<div class="col" style="width: 100px;">
						<b>Segundo Número (n2)</b>
					</div>
                                    
                                    <div class="col" style="padding-left: 200px;margin-top: -20px;">
                                        <input type="text" placeholder="" name="segundoNumero" required="" style="margin-left: 0px;">						
                                    </div>
					
				</div>
				<div class="row">

                                        <div class="col" style="margin-top: 50px;margin-left: 15px;">			 
                                                <button type="submit">Sumar</button>
                                                <button type="submit">Multiplicar</button>
                                                <button type="submit">Obtener el número mayor</button>
                                                <button type="submit">Potencia (n1)^(n2) </button>
                                                <button type="submit">Valor Binario</button>
                                        </div>
                                        
					
				</div>
			</div>		
		</form>		
	</div>
</body>