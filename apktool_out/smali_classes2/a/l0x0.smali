.class public abstract La/l0x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;

.field public static final e:La/j5x0;

.field public static final f:La/e5x0;

.field public static final g:La/okt0;

.field public static final h:La/okt0;

.field public static final i:La/okt0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/epw0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/e0x0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/l0x0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/tow0;

    .line 18
    .line 19
    const/16 v1, 0x1a

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/u6x0;

    .line 25
    .line 26
    const-string v3, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, La/l0x0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/qow0;

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/j5x0;

    .line 39
    .line 40
    const-class v4, La/q0x0;

    .line 41
    .line 42
    invoke-direct {v2, v4, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 43
    .line 44
    .line 45
    sput-object v2, La/l0x0;->c:La/j5x0;

    .line 46
    .line 47
    new-instance v0, La/zow0;

    .line 48
    .line 49
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/e5x0;

    .line 53
    .line 54
    const-string v4, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    .line 55
    .line 56
    invoke-direct {v2, v4, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 57
    .line 58
    .line 59
    sput-object v2, La/l0x0;->d:La/e5x0;

    .line 60
    .line 61
    new-instance v0, La/vow0;

    .line 62
    .line 63
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 64
    .line 65
    .line 66
    new-instance v2, La/j5x0;

    .line 67
    .line 68
    const-class v4, La/g0x0;

    .line 69
    .line 70
    invoke-direct {v2, v4, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 71
    .line 72
    .line 73
    sput-object v2, La/l0x0;->e:La/j5x0;

    .line 74
    .line 75
    new-instance v0, La/cpw0;

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/e5x0;

    .line 81
    .line 82
    invoke-direct {v1, v3, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 83
    .line 84
    .line 85
    sput-object v1, La/l0x0;->f:La/e5x0;

    .line 86
    .line 87
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, La/cex0;->d:La/cex0;

    .line 92
    .line 93
    sget-object v2, La/d0x0;->c:La/d0x0;

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v1, La/cex0;->e:La/cex0;

    .line 99
    .line 100
    sget-object v2, La/d0x0;->d:La/d0x0;

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/cex0;->f:La/cex0;

    .line 106
    .line 107
    sget-object v2, La/d0x0;->e:La/d0x0;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/cex0;->c:La/cex0;

    .line 113
    .line 114
    sget-object v2, La/d0x0;->f:La/d0x0;

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v1, La/cex0;->g:La/cex0;

    .line 120
    .line 121
    sget-object v2, La/d0x0;->g:La/d0x0;

    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, La/l0x0;->g:La/okt0;

    .line 131
    .line 132
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, La/dex0;->c:La/dex0;

    .line 137
    .line 138
    sget-object v2, La/c0x0;->c:La/c0x0;

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v1, La/dex0;->d:La/dex0;

    .line 144
    .line 145
    sget-object v2, La/c0x0;->d:La/c0x0;

    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v1, La/dex0;->e:La/dex0;

    .line 151
    .line 152
    sget-object v2, La/c0x0;->e:La/c0x0;

    .line 153
    .line 154
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sput-object v0, La/l0x0;->h:La/okt0;

    .line 162
    .line 163
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sget-object v1, La/aex0;->c:La/aex0;

    .line 168
    .line 169
    sget-object v2, La/b0x0;->c:La/b0x0;

    .line 170
    .line 171
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object v1, La/aex0;->d:La/aex0;

    .line 175
    .line 176
    sget-object v2, La/b0x0;->d:La/b0x0;

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object v1, La/aex0;->e:La/aex0;

    .line 182
    .line 183
    sget-object v2, La/b0x0;->e:La/b0x0;

    .line 184
    .line 185
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sput-object v0, La/l0x0;->i:La/okt0;

    .line 193
    .line 194
    return-void
.end method

.method public static a(La/d0x0;[B)La/icw0;
    .locals 1

    .line 1
    invoke-static {p1}, La/ibm0;->E([B)Ljava/math/BigInteger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, La/c3x0;->a:[B

    .line 6
    .line 7
    sget-object v0, La/d0x0;->f:La/d0x0;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x20

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, La/d0x0;->c:La/d0x0;

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    const/16 p0, 0x41

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, La/d0x0;->d:La/d0x0;

    .line 22
    .line 23
    if-ne p0, v0, :cond_2

    .line 24
    .line 25
    const/16 p0, 0x61

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object v0, La/d0x0;->e:La/d0x0;

    .line 29
    .line 30
    if-ne p0, v0, :cond_3

    .line 31
    .line 32
    const/16 p0, 0x85

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    sget-object v0, La/d0x0;->g:La/d0x0;

    .line 36
    .line 37
    if-ne p0, v0, :cond_4

    .line 38
    .line 39
    const/16 p0, 0x4c0

    .line 40
    .line 41
    :goto_0
    invoke-static {p1, p0}, La/ibm0;->G(Ljava/math/BigInteger;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_4
    const-string p0, "Unrecognized HPKE KEM identifier"

    .line 51
    .line 52
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static b(La/m60;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/m60;->m:La/m60;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, La/m60;->k:La/m60;

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    sget-object v0, La/m60;->l:La/m60;

    .line 17
    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    sget-object p0, La/lpw0;->f:La/lpw0;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "unknown variant: "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_2
    sget-object p0, La/lpw0;->c:La/lpw0;

    .line 40
    .line 41
    return-object p0
.end method

.method public static c(La/lpw0;La/jex0;)La/e0x0;
    .locals 2

    .line 1
    invoke-static {}, La/e0x0;->b()La/h0q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/lpw0;->e:La/lpw0;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object p0, La/m60;->m:La/m60;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v1, La/lpw0;->c:La/lpw0;

    .line 17
    .line 18
    if-eq p0, v1, :cond_3

    .line 19
    .line 20
    sget-object v1, La/lpw0;->f:La/lpw0;

    .line 21
    .line 22
    if-eq p0, v1, :cond_2

    .line 23
    .line 24
    sget-object v1, La/lpw0;->d:La/lpw0;

    .line 25
    .line 26
    if-ne p0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "unknown variant: "

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    :goto_0
    sget-object p0, La/m60;->l:La/m60;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    sget-object p0, La/m60;->k:La/m60;

    .line 49
    .line 50
    :goto_1
    iput-object p0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p0, La/l0x0;->g:La/okt0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/jex0;->y()La/cex0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0, v1}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/d0x0;

    .line 63
    .line 64
    iput-object p0, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object p0, La/l0x0;->h:La/okt0;

    .line 67
    .line 68
    invoke-virtual {p1}, La/jex0;->x()La/dex0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p0, v1}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, La/c0x0;

    .line 77
    .line 78
    iput-object p0, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object p0, La/l0x0;->i:La/okt0;

    .line 81
    .line 82
    invoke-virtual {p1}, La/jex0;->t()La/aex0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/b0x0;

    .line 91
    .line 92
    iput-object p0, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {v0}, La/h0q0;->E()La/e0x0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public static d(La/q0x0;)La/tex0;
    .locals 3

    .line 1
    invoke-static {}, La/tex0;->A()La/sex0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 9
    .line 10
    check-cast v1, La/tex0;

    .line 11
    .line 12
    invoke-static {v1}, La/tex0;->w(La/tex0;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/q0x0;->a:La/e0x0;

    .line 16
    .line 17
    invoke-static {v1}, La/l0x0;->e(La/e0x0;)La/jex0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 25
    .line 26
    check-cast v2, La/tex0;

    .line 27
    .line 28
    invoke-static {v2, v1}, La/tex0;->y(La/tex0;La/jex0;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/q0x0;->b:La/icw0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    array-length v1, p0

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {p0, v2, v1}, La/sjw0;->h([BII)La/vjw0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 47
    .line 48
    check-cast v1, La/tex0;

    .line 49
    .line 50
    invoke-static {v1, p0}, La/tex0;->x(La/tex0;La/vjw0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/tex0;

    .line 58
    .line 59
    return-object p0
.end method

.method public static e(La/e0x0;)La/jex0;
    .locals 3

    .line 1
    invoke-static {}, La/jex0;->z()La/iex0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/l0x0;->g:La/okt0;

    .line 6
    .line 7
    iget-object v2, p0, La/e0x0;->a:La/d0x0;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/cex0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 19
    .line 20
    check-cast v2, La/jex0;

    .line 21
    .line 22
    invoke-static {v2, v1}, La/jex0;->v(La/jex0;La/cex0;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/l0x0;->h:La/okt0;

    .line 26
    .line 27
    iget-object v2, p0, La/e0x0;->b:La/c0x0;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/dex0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 39
    .line 40
    check-cast v2, La/jex0;

    .line 41
    .line 42
    invoke-static {v2, v1}, La/jex0;->w(La/jex0;La/dex0;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, La/l0x0;->i:La/okt0;

    .line 46
    .line 47
    iget-object p0, p0, La/e0x0;->c:La/b0x0;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/aex0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 59
    .line 60
    check-cast v1, La/jex0;

    .line 61
    .line 62
    invoke-static {v1, p0}, La/jex0;->u(La/jex0;La/aex0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/jex0;

    .line 70
    .line 71
    return-object p0
.end method
