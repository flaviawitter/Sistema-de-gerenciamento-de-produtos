Diagrama de Classes – Sistema de Gerenciamento de Produtos

[CatalogoProduto||+adicionar(produto:Produto):void;+remover(produto:Produto):void;+atualizar(produto:Produto):void;+buscarPorNome(nome:String):List≪Produto≫;+buscarPorCategoria(categoria:String):List≪Produto≫;+buscarTodos():List≪Produto≫;+calcularValorTotal():List≪Produto≫]

[Produto|-nome:String;-codigo:String;-descricao:String;-preco:String;-quatidadeEstoque:String;-categoria:String|]

[CatalogoProduto]++->*[Produto]
