.class public final La/f0l;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/n0l;

.field public k:B

.field public final synthetic l:La/l0l;


# direct methods
.method public synthetic constructor <init>(La/l0l;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/f0l;->i:B

    iput-object p1, p0, La/f0l;->l:La/l0l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/f0l;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/f0l;

    .line 7
    .line 8
    iget-object p0, p0, La/f0l;->l:La/l0l;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/f0l;-><init>(La/l0l;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/f0l;

    .line 16
    .line 17
    iget-object p0, p0, La/f0l;->l:La/l0l;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/f0l;-><init>(La/l0l;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/f0l;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/f0l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/f0l;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/f0l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/f0l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/f0l;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/f0l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/f0l;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/f0l;->l:La/l0l;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/f0l;->k:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, La/f0l;->j:La/n0l;

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_5

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v10, p0

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v2, La/l0l;->i:La/haf;

    .line 42
    .line 43
    iput-byte v3, p0, La/f0l;->k:B

    .line 44
    .line 45
    iget-object v1, p1, La/haf;->b:La/ztt;

    .line 46
    .line 47
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    iget-object v5, p1, La/haf;->a:La/v0l;

    .line 52
    .line 53
    iget-object v1, p1, La/haf;->d:La/gmt;

    .line 54
    .line 55
    invoke-virtual {v1}, La/gmt;->a()La/ql5;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    iget-wide v8, v1, La/ql5;->a:J

    .line 62
    .line 63
    iget-object v1, v11, La/csr;->a:La/bsr;

    .line 64
    .line 65
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 66
    .line 67
    invoke-virtual {v1}, La/esr;->a()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    const-wide/16 v6, 0x0

    .line 74
    .line 75
    :goto_0
    move-object v10, p0

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-object p1, p1, La/haf;->c:La/itt;

    .line 78
    .line 79
    invoke-virtual {p1}, La/itt;->a()D

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    goto :goto_0

    .line 84
    :goto_1
    invoke-virtual/range {v5 .. v11}, La/v0l;->b(DJLa/zje;La/csr;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    move-object p0, p1

    .line 92
    check-cast p0, La/n0l;

    .line 93
    .line 94
    iget-object p1, v2, La/l0l;->e:La/fq;

    .line 95
    .line 96
    iput-object p0, v10, La/f0l;->j:La/n0l;

    .line 97
    .line 98
    iput-byte v4, v10, La/f0l;->k:B

    .line 99
    .line 100
    sget-object v1, La/my5;->a:La/my5;

    .line 101
    .line 102
    invoke-virtual {p1, v1, v10}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_5

    .line 107
    .line 108
    :goto_3
    move-object v5, v0

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    :goto_4
    iget-object p1, v2, La/l0l;->o:La/ooi0;

    .line 111
    .line 112
    invoke-virtual {p1, p0}, La/ooi0;->a(La/n0l;)V

    .line 113
    .line 114
    .line 115
    sget-object p1, La/tzk;->b:La/tzk;

    .line 116
    .line 117
    invoke-virtual {v2, p1}, La/l0l;->A(La/tzk;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/yzk;

    .line 121
    .line 122
    invoke-direct {p1, p0}, La/yzk;-><init>(La/n0l;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p1}, La/l0l;->B(La/b0l;)V

    .line 126
    .line 127
    .line 128
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_5
    return-object v5

    .line 131
    :cond_6
    new-instance p0, La/ss3;

    .line 132
    .line 133
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :pswitch_0
    move-object v10, p0

    .line 138
    sget-object p0, La/wne;->a:La/wne;

    .line 139
    .line 140
    iget-byte v0, v10, La/f0l;->k:B

    .line 141
    .line 142
    const/4 v6, 0x5

    .line 143
    const/4 v7, 0x4

    .line 144
    const/4 v8, 0x3

    .line 145
    if-eqz v0, :cond_c

    .line 146
    .line 147
    if-eq v0, v3, :cond_b

    .line 148
    .line 149
    if-eq v0, v4, :cond_a

    .line 150
    .line 151
    if-eq v0, v8, :cond_9

    .line 152
    .line 153
    if-eq v0, v7, :cond_8

    .line 154
    .line 155
    if-ne v0, v6, :cond_7

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_b

    .line 161
    .line 162
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_c

    .line 166
    .line 167
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_9

    .line 171
    .line 172
    :cond_9
    iget-object v0, v10, La/f0l;->j:La/n0l;

    .line 173
    .line 174
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_a
    iget-object v0, v10, La/f0l;->j:La/n0l;

    .line 179
    .line 180
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, v2, La/l0l;->g:La/chu;

    .line 192
    .line 193
    iget-object v0, v2, La/l0l;->q:La/y5s;

    .line 194
    .line 195
    iget-object v0, v0, La/y5s;->a:La/s470;

    .line 196
    .line 197
    invoke-virtual {v0}, La/s470;->a()J

    .line 198
    .line 199
    .line 200
    move-result-wide v0

    .line 201
    iput-byte v3, v10, La/f0l;->k:B

    .line 202
    .line 203
    iget-object p1, p1, La/chu;->a:La/v0l;

    .line 204
    .line 205
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-virtual {p1, v0, v1, v10, v9}, La/v0l;->c(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-ne p1, p0, :cond_d

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_d
    :goto_6
    check-cast p1, La/n0l;

    .line 217
    .line 218
    iget-object v0, v2, La/l0l;->o:La/ooi0;

    .line 219
    .line 220
    invoke-virtual {v0, p1}, La/ooi0;->a(La/n0l;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v2, La/l0l;->p:La/qni0;

    .line 224
    .line 225
    iget-wide v11, p1, La/n0l;->g:D

    .line 226
    .line 227
    invoke-virtual {v0, v11, v12}, La/qni0;->a(D)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v2, La/l0l;->e:La/fq;

    .line 231
    .line 232
    new-instance v1, La/oy5;

    .line 233
    .line 234
    iget-wide v11, p1, La/n0l;->p:J

    .line 235
    .line 236
    invoke-direct {v1, v11, v12}, La/oy5;-><init>(J)V

    .line 237
    .line 238
    .line 239
    iput-object p1, v10, La/f0l;->j:La/n0l;

    .line 240
    .line 241
    iput-byte v4, v10, La/f0l;->k:B

    .line 242
    .line 243
    invoke-virtual {v0, v1, v10}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, p0, :cond_e

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_e
    move-object v0, p1

    .line 251
    :goto_7
    iget-object p1, v2, La/l0l;->e:La/fq;

    .line 252
    .line 253
    new-instance v1, La/xy5;

    .line 254
    .line 255
    invoke-direct {v1, v3}, La/xy5;-><init>(Z)V

    .line 256
    .line 257
    .line 258
    iput-object v0, v10, La/f0l;->j:La/n0l;

    .line 259
    .line 260
    iput-byte v8, v10, La/f0l;->k:B

    .line 261
    .line 262
    invoke-virtual {p1, v1, v10}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, p0, :cond_f

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_f
    :goto_8
    iget-object p1, v2, La/l0l;->e:La/fq;

    .line 270
    .line 271
    new-instance v1, La/iy5;

    .line 272
    .line 273
    iget-object v0, v0, La/n0l;->o:La/csr;

    .line 274
    .line 275
    invoke-direct {v1, v0}, La/iy5;-><init>(La/csr;)V

    .line 276
    .line 277
    .line 278
    iput-object v5, v10, La/f0l;->j:La/n0l;

    .line 279
    .line 280
    iput-byte v7, v10, La/f0l;->k:B

    .line 281
    .line 282
    invoke-virtual {p1, v1, v10}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    if-ne p1, p0, :cond_10

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_10
    :goto_9
    iget-object p1, v2, La/l0l;->f:La/s7t0;

    .line 290
    .line 291
    iput-object v5, v10, La/f0l;->j:La/n0l;

    .line 292
    .line 293
    iput-byte v6, v10, La/f0l;->k:B

    .line 294
    .line 295
    invoke-virtual {p1, v3, v10}, La/s7t0;->a(ZLa/zje;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    if-ne p1, p0, :cond_11

    .line 300
    .line 301
    :goto_a
    move-object v5, p0

    .line 302
    goto :goto_c

    .line 303
    :cond_11
    :goto_b
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    :goto_c
    return-object v5

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
