.class public final synthetic La/s6x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a7x0;
.implements La/c7x0;
.implements La/w6x0;
.implements La/lix0;


# virtual methods
.method public a(La/atm0;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/o5x0;

    .line 2
    .line 3
    sget-object p0, La/gfk0;->h:La/gfk0;

    .line 4
    .line 5
    iget-object p1, p1, La/o5x0;->a:La/vkr0;

    .line 6
    .line 7
    invoke-static {p1, p0}, La/o5x0;->u(La/vkr0;La/gfk0;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, La/a5x0;->d:La/a5x0;

    .line 11
    .line 12
    iget-object v0, p1, La/vkr0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    const-class v1, La/xow0;

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, La/a5x0;->a(Ljava/lang/Class;Ljava/lang/String;)La/l5x0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object v0, p1, La/vkr0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/sjw0;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/l5x0;->a(La/sjw0;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/xow0;

    .line 31
    .line 32
    iget-object p0, p1, La/vkr0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/lpw0;

    .line 35
    .line 36
    invoke-static {p0}, La/bcm0;->D(La/lpw0;)I

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, La/vkr0;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-static {p0, p1}, La/bcm0;->F(La/lpw0;Ljava/lang/Integer;)La/icw0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 48
    .line 49
    .line 50
    new-instance p0, La/m9x0;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public synthetic b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyAgreement;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public e(La/x4w0;)La/fpw0;
    .locals 2

    .line 1
    iget-object p0, p1, La/x4w0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :try_start_0
    iget-object p0, p1, La/x4w0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/sjw0;

    .line 16
    .line 17
    sget-object v0, La/dkw0;->b:La/dkw0;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/qdx0;->u(La/sjw0;La/dkw0;)La/qdx0;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    invoke-virtual {p0}, La/qdx0;->x()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-static {}, La/p8x0;->b()La/h0q0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, La/qdx0;->t()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p0}, La/qdx0;->A()La/wdx0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, La/wdx0;->t()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    sget-object v1, La/g9x0;->a:La/okt0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/qdx0;->A()La/wdx0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, La/wdx0;->w()La/mdx0;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v1, p0}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/o8x0;

    .line 72
    .line 73
    iput-object p0, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p0, p1, La/x4w0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, La/lpw0;

    .line 78
    .line 79
    invoke-static {p0}, La/g9x0;->b(La/lpw0;)La/arw0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iput-object p0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v0}, La/h0q0;->F()La/p8x0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 91
    .line 92
    invoke-virtual {p0}, La/qdx0;->x()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const-string v0, "Parsing HmacParameters failed: unknown Version "

    .line 97
    .line 98
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :catch_0
    move-exception p0

    .line 107
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 108
    .line 109
    const-string v0, "Parsing HmacParameters failed: "

    .line 110
    .line 111
    invoke-direct {p1, v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_1
    const-string p1, "Wrong type URL in call to HmacProtoSerialization.parseParameters: "

    .line 116
    .line 117
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0
.end method

.method public h(La/fpw0;)La/x4w0;
    .locals 0

    .line 1
    check-cast p1, La/t5x0;

    .line 2
    .line 3
    iget-object p0, p1, La/t5x0;->a:La/x4w0;

    .line 4
    .line 5
    return-object p0
.end method
