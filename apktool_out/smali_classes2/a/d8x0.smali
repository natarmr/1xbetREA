.class public final synthetic La/d8x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c7x0;
.implements La/g5x0;
.implements La/d5x0;


# virtual methods
.method public a(La/atm0;)La/vkr0;
    .locals 3

    .line 1
    check-cast p1, La/v7x0;

    .line 2
    .line 3
    invoke-static {}, La/x9x0;->x()La/w9x0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p1, La/v7x0;->a:La/g8x0;

    .line 8
    .line 9
    invoke-static {}, La/dax0;->v()La/cax0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v0, v0, La/g8x0;->b:I

    .line 14
    .line 15
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 19
    .line 20
    check-cast v2, La/dax0;

    .line 21
    .line 22
    invoke-static {v2, v0}, La/dax0;->u(La/dax0;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/dax0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/hkw0;->d()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/hkw0;->b:La/jkw0;

    .line 35
    .line 36
    check-cast v1, La/x9x0;

    .line 37
    .line 38
    invoke-static {v1, v0}, La/x9x0;->w(La/x9x0;La/dax0;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/v7x0;->b:La/rkt0;

    .line 42
    .line 43
    iget-object v0, v0, La/rkt0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/icw0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/icw0;->b()[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    array-length v2, v0

    .line 53
    invoke-static {v0, v1, v2}, La/sjw0;->h([BII)La/vjw0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, La/hkw0;->d()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/hkw0;->b:La/jkw0;

    .line 61
    .line 62
    check-cast v1, La/x9x0;

    .line 63
    .line 64
    invoke-static {v1, v0}, La/x9x0;->v(La/x9x0;La/vjw0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/hkw0;->c()La/jkw0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/x9x0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/ojw0;->a()La/vjw0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    sget-object v0, La/hbb;->j:La/hbb;

    .line 78
    .line 79
    iget-object v1, p1, La/v7x0;->a:La/g8x0;

    .line 80
    .line 81
    iget-object v1, v1, La/g8x0;->c:La/hbb;

    .line 82
    .line 83
    invoke-static {v1}, La/c9x0;->b(La/hbb;)La/lpw0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object p1, p1, La/v7x0;->d:Ljava/lang/Integer;

    .line 88
    .line 89
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 90
    .line 91
    invoke-static {v2, p0, v0, v1, p1}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public a(La/atm0;)Ljava/lang/Object;
    .locals 2

    check-cast p1, La/v7x0;

    .line 96
    iget-object p0, p1, La/v7x0;->a:La/g8x0;

    .line 97
    iget p0, p0, La/g8x0;->a:I

    const/16 v0, 0x20

    const/4 v1, 0x0

    if-ne p0, v0, :cond_2

    const/4 p0, 0x1

    .line 98
    invoke-static {p0}, La/esw0;->d(I)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 99
    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 100
    :try_start_0
    invoke-static {p1, p0}, La/f9x0;->a(La/v7x0;Ljava/security/Provider;)La/f9x0;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 101
    :catch_0
    :cond_0
    new-instance p0, La/f9x0;

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 103
    :cond_1
    const-string p0, "Cannot use AES-CMAC in FIPS-mode."

    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    return-object v1

    .line 104
    :cond_2
    const-string p0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    return-object v1
.end method

.method public c(La/vkr0;)La/atm0;
    .locals 4

    .line 1
    iget-object p0, p1, La/vkr0;->b:Ljava/lang/Object;

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
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    :try_start_0
    iget-object p0, p1, La/vkr0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/sjw0;

    .line 17
    .line 18
    sget-object v1, La/dkw0;->b:La/dkw0;

    .line 19
    .line 20
    invoke-static {p0, v1}, La/ldx0;->v(La/sjw0;La/dkw0;)La/ldx0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, La/ldx0;->u()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-static {}, La/p8x0;->b()La/h0q0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0}, La/ldx0;->B()La/sjw0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, La/sjw0;->e()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-object v2, v1, La/h0q0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {p0}, La/ldx0;->A()La/wdx0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, La/wdx0;->t()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, v1, La/h0q0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object v2, La/g9x0;->a:La/okt0;

    .line 63
    .line 64
    invoke-virtual {p0}, La/ldx0;->A()La/wdx0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, La/wdx0;->w()La/mdx0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, La/o8x0;

    .line 77
    .line 78
    iput-object v2, v1, La/h0q0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v2, p1, La/vkr0;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, La/lpw0;

    .line 83
    .line 84
    invoke-static {v2}, La/g9x0;->b(La/lpw0;)La/arw0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iput-object v2, v1, La/h0q0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v1}, La/h0q0;->F()La/p8x0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, La/l8w0;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, v2, La/l8w0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v0, v2, La/l8w0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v1, v2, La/l8w0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-virtual {p0}, La/ldx0;->B()La/sjw0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, La/sjw0;->r()[B

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    new-instance v1, La/rkt0;

    .line 114
    .line 115
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const/16 v3, 0xb

    .line 120
    .line 121
    invoke-direct {v1, p0, v3}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    iput-object v1, v2, La/l8w0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object p0, p1, La/vkr0;->f:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Ljava/lang/Integer;

    .line 129
    .line 130
    iput-object p0, v2, La/l8w0;->c:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v2}, La/l8w0;->d()La/h8x0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 138
    .line 139
    const-string p1, "Only version 0 keys are accepted"

    .line 140
    .line 141
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p0
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :catch_0
    const-string p0, "Parsing HmacKey failed"

    .line 146
    .line 147
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_1
    const-string p0, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    .line 152
    .line 153
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v0
.end method
