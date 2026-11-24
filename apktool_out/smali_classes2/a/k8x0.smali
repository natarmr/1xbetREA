.class public final La/k8x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w6x0;
.implements La/g5x0;


# virtual methods
.method public a(La/atm0;)La/vkr0;
    .locals 4

    .line 1
    check-cast p1, La/h8x0;

    .line 2
    .line 3
    invoke-static {}, La/ldx0;->y()La/jdx0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p1, La/h8x0;->a:La/p8x0;

    .line 8
    .line 9
    invoke-static {}, La/wdx0;->x()La/udx0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, v0, La/p8x0;->b:I

    .line 14
    .line 15
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 19
    .line 20
    check-cast v3, La/wdx0;

    .line 21
    .line 22
    invoke-static {v3, v2}, La/wdx0;->u(La/wdx0;I)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/g9x0;->a:La/okt0;

    .line 26
    .line 27
    iget-object v0, v0, La/p8x0;->d:La/o8x0;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/mdx0;

    .line 34
    .line 35
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 39
    .line 40
    check-cast v2, La/wdx0;

    .line 41
    .line 42
    invoke-static {v2, v0}, La/wdx0;->v(La/wdx0;La/mdx0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/wdx0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/hkw0;->d()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, La/hkw0;->b:La/jkw0;

    .line 55
    .line 56
    check-cast v1, La/ldx0;

    .line 57
    .line 58
    invoke-static {v1, v0}, La/ldx0;->x(La/ldx0;La/wdx0;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p1, La/h8x0;->b:La/rkt0;

    .line 62
    .line 63
    iget-object v0, v0, La/rkt0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/icw0;

    .line 66
    .line 67
    invoke-virtual {v0}, La/icw0;->b()[B

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v1, 0x0

    .line 72
    array-length v2, v0

    .line 73
    invoke-static {v0, v1, v2}, La/sjw0;->h([BII)La/vjw0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, La/hkw0;->d()V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/hkw0;->b:La/jkw0;

    .line 81
    .line 82
    check-cast v1, La/ldx0;

    .line 83
    .line 84
    invoke-static {v1, v0}, La/ldx0;->w(La/ldx0;La/sjw0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/hkw0;->c()La/jkw0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/ldx0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/ojw0;->a()La/vjw0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object v0, La/hbb;->j:La/hbb;

    .line 98
    .line 99
    iget-object v1, p1, La/h8x0;->a:La/p8x0;

    .line 100
    .line 101
    iget-object v1, v1, La/p8x0;->c:La/arw0;

    .line 102
    .line 103
    invoke-static {v1}, La/g9x0;->a(La/arw0;)La/lpw0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object p1, p1, La/h8x0;->d:Ljava/lang/Integer;

    .line 108
    .line 109
    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 110
    .line 111
    invoke-static {v2, p0, v0, v1, p1}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
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
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

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
    invoke-static {p0, v0}, La/aax0;->u(La/sjw0;La/dkw0;)La/aax0;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    invoke-static {}, La/g8x0;->b()La/x4w0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, La/aax0;->t()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, La/x4w0;->f(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/aax0;->y()La/dax0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, La/dax0;->t()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {v0, p0}, La/x4w0;->g(I)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p1, La/x4w0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, La/lpw0;

    .line 48
    .line 49
    invoke-static {p0}, La/c9x0;->a(La/lpw0;)La/hbb;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iput-object p0, v0, La/x4w0;->c:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v0}, La/x4w0;->e()La/g8x0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :catch_0
    move-exception p0

    .line 61
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 62
    .line 63
    const-string v0, "Parsing AesCmacParameters failed: "

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_0
    const-string p1, "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: "

    .line 70
    .line 71
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0
.end method
