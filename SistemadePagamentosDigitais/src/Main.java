import java.time.LocalDate;

void main() {
    // --- BOLETO ---
    Pagamento boleto = new Boleto(
            990.00,
            "1234567890123",
            LocalDate.now().plusDays(5)
    );

    // --- PIX ---
    Pagamento pix = new Pix(
            200.0,
            "Pablo"
    );

    // --- CARTÃO DE CRÉDITO ---
    Pagamento cartao = new Cartao(
            200.0,           // valor da compra
            "Nathalia",
            600.0            // limite do cartão
    );

    System.out.println("=== Tentativa de pagamento Boleto ===");
    if (boleto.validar()) {
        boleto.processar();
    } else {
        System.out.println("Boleto inválido!");
    }
}

