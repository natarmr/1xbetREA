.class public abstract La/wsw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zow0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/tsw0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/wsw0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/vow0;

    .line 18
    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/u6x0;

    .line 25
    .line 26
    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/wsw0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/qow0;

    .line 34
    .line 35
    const/16 v1, 0x11

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/j5x0;

    .line 41
    .line 42
    const-class v3, La/usw0;

    .line 43
    .line 44
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/wsw0;->c:La/j5x0;

    .line 48
    .line 49
    new-instance v0, La/epw0;

    .line 50
    .line 51
    const/16 v1, 0x11

    .line 52
    .line 53
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/e5x0;

    .line 57
    .line 58
    invoke-direct {v1, v2, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, La/wsw0;->d:La/e5x0;

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/ogx0;La/lpw0;)La/tsw0;
    .locals 10

    .line 1
    sget-object v0, La/hbb;->o:La/hbb;

    .line 2
    .line 3
    sget-object v1, La/pfw;->o:La/pfw;

    .line 4
    .line 5
    sget-object v2, La/pfw;->n:La/pfw;

    .line 6
    .line 7
    sget-object v3, La/pfw;->m:La/pfw;

    .line 8
    .line 9
    sget-object v4, La/pfw;->k:La/pfw;

    .line 10
    .line 11
    sget-object v5, La/pfw;->l:La/pfw;

    .line 12
    .line 13
    sget-object v6, La/pfw;->j:La/pfw;

    .line 14
    .line 15
    invoke-static {}, La/bfx0;->t()La/zex0;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-virtual {p0}, La/ogx0;->t()La/bfx0;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    invoke-virtual {v8}, La/bfx0;->C()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v7, v8}, La/zex0;->g(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/ogx0;->t()La/bfx0;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v8}, La/bfx0;->B()La/sjw0;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v7, v8}, La/zex0;->f(La/sjw0;)V

    .line 39
    .line 40
    .line 41
    const/4 v8, 0x4

    .line 42
    invoke-virtual {v7, v8}, La/zex0;->h(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, La/hkw0;->c()La/jkw0;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, La/bfx0;

    .line 50
    .line 51
    invoke-virtual {v7}, La/ojw0;->c()[B

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-static {v7}, La/ktt0;->E([B)La/fpw0;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    instance-of v8, v7, La/mrw0;

    .line 60
    .line 61
    if-eqz v8, :cond_0

    .line 62
    .line 63
    move-object v8, v6

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    instance-of v8, v7, La/vrw0;

    .line 66
    .line 67
    if-eqz v8, :cond_1

    .line 68
    .line 69
    move-object v8, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    instance-of v8, v7, La/muw0;

    .line 72
    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    move-object v8, v4

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    instance-of v8, v7, La/brw0;

    .line 78
    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    move-object v8, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_3
    instance-of v8, v7, La/jrw0;

    .line 84
    .line 85
    if-eqz v8, :cond_4

    .line 86
    .line 87
    move-object v8, v2

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    instance-of v8, v7, La/srw0;

    .line 90
    .line 91
    if-eqz v8, :cond_14

    .line 92
    .line 93
    move-object v8, v1

    .line 94
    :goto_0
    sget-object v9, La/lpw0;->c:La/lpw0;

    .line 95
    .line 96
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    sget-object v0, La/hbb;->n:La/hbb;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    sget-object v9, La/lpw0;->e:La/lpw0;

    .line 106
    .line 107
    if-ne p1, v9, :cond_13

    .line 108
    .line 109
    :goto_1
    invoke-virtual {p0}, La/ogx0;->z()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast v7, La/sqw0;

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    if-eqz p0, :cond_12

    .line 117
    .line 118
    invoke-virtual {v7}, La/fpw0;->a()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_11

    .line 123
    .line 124
    if-eq v8, v6, :cond_6

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    instance-of p1, v7, La/mrw0;

    .line 128
    .line 129
    if-eqz p1, :cond_7

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_7
    :goto_2
    if-eq v8, v5, :cond_8

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_8
    instance-of p1, v7, La/vrw0;

    .line 136
    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_9
    :goto_3
    if-eq v8, v4, :cond_a

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_a
    instance-of p1, v7, La/muw0;

    .line 144
    .line 145
    if-eqz p1, :cond_b

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_b
    :goto_4
    if-eq v8, v3, :cond_c

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_c
    instance-of p1, v7, La/brw0;

    .line 152
    .line 153
    if-eqz p1, :cond_d

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_d
    :goto_5
    if-eq v8, v2, :cond_e

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_e
    instance-of p1, v7, La/jrw0;

    .line 160
    .line 161
    if-eqz p1, :cond_f

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_f
    :goto_6
    if-ne v8, v1, :cond_10

    .line 165
    .line 166
    instance-of p1, v7, La/srw0;

    .line 167
    .line 168
    if-eqz p1, :cond_10

    .line 169
    .line 170
    :goto_7
    new-instance p1, La/tsw0;

    .line 171
    .line 172
    invoke-direct {p1, v0, p0, v8, v7}, La/tsw0;-><init>(La/hbb;Ljava/lang/String;La/pfw;La/sqw0;)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_10
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 177
    .line 178
    iget-object p1, v8, La/pfw;->b:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, " when new keys are picked according to "

    .line 185
    .line 186
    const-string v2, "."

    .line 187
    .line 188
    const-string v3, "Cannot use parsing strategy "

    .line 189
    .line 190
    invoke-static {v3, p1, v1, v0, v2}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0

    .line 198
    :cond_11
    const-string p0, "dekParametersForNewKeys must not have ID Requirements"

    .line 199
    .line 200
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-object p1

    .line 204
    :cond_12
    const-string p0, "kekUri must be set"

    .line 205
    .line 206
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_13
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 211
    .line 212
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v0, "Unable to parse OutputPrefixType: "

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_14
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 227
    .line 228
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    const-string v0, "Unsupported DEK parameters when parsing "

    .line 233
    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p0
.end method

.method public static b(La/tsw0;)La/ogx0;
    .locals 3

    .line 1
    iget-object v0, p0, La/tsw0;->d:La/sqw0;

    .line 2
    .line 3
    invoke-static {v0}, La/ktt0;->F(La/fpw0;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    sget-object v1, La/dkw0;->b:La/dkw0;

    .line 8
    .line 9
    invoke-static {v0, v1}, La/bfx0;->v([BLa/dkw0;)La/bfx0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, La/ogx0;->x()La/ngx0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object p0, p0, La/tsw0;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 23
    .line 24
    check-cast v2, La/ogx0;

    .line 25
    .line 26
    invoke-static {v2, p0}, La/ogx0;->w(La/ogx0;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 30
    .line 31
    .line 32
    iget-object p0, v1, La/hkw0;->b:La/jkw0;

    .line 33
    .line 34
    check-cast p0, La/ogx0;

    .line 35
    .line 36
    invoke-static {p0, v0}, La/ogx0;->v(La/ogx0;La/bfx0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/ogx0;
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :catch_0
    move-exception p0

    .line 47
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 48
    .line 49
    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    .line 50
    .line 51
    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method
