.class public final La/ef70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/qf70;


# direct methods
.method public synthetic constructor <init>(La/qf70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ef70;->i:B

    iput-object p1, p0, La/ef70;->k:La/qf70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ef70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ef70;->k:La/qf70;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ef70;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ef70;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/ef70;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/ef70;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/ef70;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ef70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ef70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ef70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ef70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ef70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ef70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ef70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ef70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ef70;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ef70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/ef70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ef70;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ef70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/ef70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/ef70;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/ef70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ef70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/ef70;->k:La/qf70;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

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
    iget-byte v6, p0, La/ef70;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v4, :cond_1

    .line 20
    .line 21
    if-ne v6, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v2, La/qf70;->k:La/gmt;

    .line 40
    .line 41
    invoke-virtual {p1}, La/gmt;->a()La/ql5;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    iget-wide v5, p1, La/ql5;->a:J

    .line 48
    .line 49
    new-instance p1, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-direct {p1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 52
    .line 53
    .line 54
    move-object v5, p1

    .line 55
    :cond_3
    if-eqz v5, :cond_6

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    iget-object p1, v2, La/qf70;->z:La/wsf0;

    .line 62
    .line 63
    iget-object p1, p1, La/wsf0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, La/g45;

    .line 66
    .line 67
    invoke-virtual {p1}, La/g45;->q()La/nrt;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-byte v4, p0, La/ef70;->j:B

    .line 72
    .line 73
    invoke-static {p1, v5, v6, p0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_0
    check-cast p1, La/ql5;

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    :goto_1
    move-object v3, p1

    .line 86
    goto :goto_5

    .line 87
    :cond_6
    :goto_2
    iput-byte v3, p0, La/ef70;->j:B

    .line 88
    .line 89
    invoke-virtual {v2, p0}, La/qf70;->z(La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_7

    .line 94
    .line 95
    :goto_3
    move-object v5, v0

    .line 96
    goto :goto_7

    .line 97
    :cond_7
    :goto_4
    check-cast p1, La/ql5;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :goto_5
    iget-object p0, v2, La/qf70;->p:La/ztt;

    .line 101
    .line 102
    invoke-virtual {p0}, La/ztt;->a()La/csr;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object p0, p0, La/csr;->a:La/bsr;

    .line 107
    .line 108
    iget-object p0, p0, La/bsr;->a:La/esr;

    .line 109
    .line 110
    invoke-virtual {p0}, La/esr;->a()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_8

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    iget-wide p0, v3, La/ql5;->b:D

    .line 118
    .line 119
    iget-object v0, v2, La/qf70;->o:La/qiu;

    .line 120
    .line 121
    iget-object v0, v0, La/qiu;->a:La/pbt;

    .line 122
    .line 123
    iget-object v0, v0, La/pbt;->a:La/j5t;

    .line 124
    .line 125
    iget-wide v0, v0, La/j5t;->n:D

    .line 126
    .line 127
    new-instance v4, Ljava/math/BigDecimal;

    .line 128
    .line 129
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-direct {v4, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    new-instance p0, Ljava/math/BigDecimal;

    .line 137
    .line 138
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, p0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    const/4 v7, 0x0

    .line 157
    const/16 v8, 0x1ffd

    .line 158
    .line 159
    const/4 v6, 0x0

    .line 160
    invoke-static/range {v3 .. v8}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {v2, p0}, La/qf70;->F(La/ql5;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, v2, La/qf70;->j:La/zmi0;

    .line 168
    .line 169
    invoke-static/range {v3 .. v8}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p0, p1}, La/zmi0;->a(La/ql5;)V

    .line 174
    .line 175
    .line 176
    iget-object p0, v2, La/qf70;->z:La/wsf0;

    .line 177
    .line 178
    invoke-virtual {p0}, La/wsf0;->a()La/ilt0;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iget-wide v0, v3, La/ql5;->a:J

    .line 183
    .line 184
    invoke-virtual {p0, v4, v5, v0, v1}, La/ilt0;->a(DJ)V

    .line 185
    .line 186
    .line 187
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_7
    return-object v5

    .line 190
    :pswitch_0
    iget-object v0, v2, La/qf70;->z:La/wsf0;

    .line 191
    .line 192
    sget-object v6, La/wne;->a:La/wne;

    .line 193
    .line 194
    iget-byte v7, p0, La/ef70;->j:B

    .line 195
    .line 196
    if-eqz v7, :cond_b

    .line 197
    .line 198
    if-eq v7, v4, :cond_a

    .line 199
    .line 200
    if-ne v7, v3, :cond_9

    .line 201
    .line 202
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_b

    .line 210
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p1, La/g45;

    .line 220
    .line 221
    invoke-virtual {p1}, La/g45;->y()La/ahu;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    sget-object v1, La/bm5;->d:La/bm5;

    .line 226
    .line 227
    iput-byte v4, p0, La/ef70;->j:B

    .line 228
    .line 229
    invoke-virtual {p1, v1, p0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    if-ne p1, v6, :cond_c

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_c
    :goto_8
    check-cast p1, La/ql5;

    .line 237
    .line 238
    invoke-virtual {v0}, La/wsf0;->s()La/trm0;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    sget-object v1, La/bm5;->d:La/bm5;

    .line 243
    .line 244
    invoke-virtual {v0, v1, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, v2, La/qf70;->g:La/g9c;

    .line 248
    .line 249
    invoke-virtual {v0, p1}, La/g9c;->a(La/ql5;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_d

    .line 254
    .line 255
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_d
    new-instance v0, La/er60;

    .line 259
    .line 260
    const/4 v1, 0x6

    .line 261
    invoke-direct {v0, v2, v5, v1}, La/er60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 262
    .line 263
    .line 264
    iput-byte v3, p0, La/ef70;->j:B

    .line 265
    .line 266
    invoke-virtual {v2, p1, v4, v0, p0}, La/qf70;->J(La/ql5;ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    if-ne p0, v6, :cond_e

    .line 271
    .line 272
    :goto_9
    move-object v5, v6

    .line 273
    goto :goto_b

    .line 274
    :cond_e
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    :goto_b
    return-object v5

    .line 277
    :pswitch_1
    iget-object v0, v2, La/qf70;->g:La/g9c;

    .line 278
    .line 279
    iget-object v6, v2, La/qf70;->z:La/wsf0;

    .line 280
    .line 281
    sget-object v7, La/wne;->a:La/wne;

    .line 282
    .line 283
    iget-byte v8, p0, La/ef70;->j:B

    .line 284
    .line 285
    const/4 v9, 0x3

    .line 286
    if-eqz v8, :cond_12

    .line 287
    .line 288
    if-eq v8, v4, :cond_11

    .line 289
    .line 290
    if-eq v8, v3, :cond_10

    .line 291
    .line 292
    if-ne v8, v9, :cond_f

    .line 293
    .line 294
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_10

    .line 298
    .line 299
    :cond_f
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_11

    .line 303
    .line 304
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto :goto_e

    .line 308
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object p1, v6, La/wsf0;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p1, La/g45;

    .line 318
    .line 319
    invoke-virtual {p1}, La/g45;->E()La/nou;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    iput-byte v4, p0, La/ef70;->j:B

    .line 324
    .line 325
    invoke-static {p1, p0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-ne p1, v7, :cond_13

    .line 330
    .line 331
    goto :goto_f

    .line 332
    :cond_13
    :goto_c
    move-object v1, p1

    .line 333
    check-cast v1, La/ql5;

    .line 334
    .line 335
    invoke-virtual {v0, v1}, La/g9c;->a(La/ql5;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-nez v1, :cond_14

    .line 340
    .line 341
    goto :goto_d

    .line 342
    :cond_14
    move-object p1, v5

    .line 343
    :goto_d
    check-cast p1, La/ql5;

    .line 344
    .line 345
    if-nez p1, :cond_18

    .line 346
    .line 347
    invoke-virtual {v6}, La/wsf0;->g()La/urt;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    iput-byte v3, p0, La/ef70;->j:B

    .line 352
    .line 353
    invoke-static {p1, p0}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    if-ne p1, v7, :cond_15

    .line 358
    .line 359
    goto :goto_f

    .line 360
    :cond_15
    :goto_e
    check-cast p1, Ljava/lang/Iterable;

    .line 361
    .line 362
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    :cond_16
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_17

    .line 371
    .line 372
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    move-object v3, v1

    .line 377
    check-cast v3, La/ql5;

    .line 378
    .line 379
    invoke-virtual {v0, v3}, La/g9c;->a(La/ql5;)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-nez v3, :cond_16

    .line 384
    .line 385
    move-object v5, v1

    .line 386
    :cond_17
    move-object p1, v5

    .line 387
    check-cast p1, La/ql5;

    .line 388
    .line 389
    :cond_18
    if-eqz p1, :cond_19

    .line 390
    .line 391
    iget-object v0, v2, La/qf70;->G:La/kyg0;

    .line 392
    .line 393
    iget-wide v3, p1, La/ql5;->a:J

    .line 394
    .line 395
    invoke-virtual {v0, v3, v4}, La/kyg0;->a(J)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v2, La/qf70;->d:La/fq;

    .line 399
    .line 400
    new-instance v1, La/hle;

    .line 401
    .line 402
    const/4 v2, 0x0

    .line 403
    invoke-direct {v1, p1, v2}, La/hle;-><init>(La/ql5;Z)V

    .line 404
    .line 405
    .line 406
    iput-byte v9, p0, La/ef70;->j:B

    .line 407
    .line 408
    invoke-virtual {v0, v1, p0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    if-ne p0, v7, :cond_19

    .line 413
    .line 414
    :goto_f
    move-object v5, v7

    .line 415
    goto :goto_11

    .line 416
    :cond_19
    :goto_10
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    :goto_11
    return-object v5

    .line 419
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 420
    .line 421
    iget-byte v6, p0, La/ef70;->j:B

    .line 422
    .line 423
    if-eqz v6, :cond_1c

    .line 424
    .line 425
    if-eq v6, v4, :cond_1b

    .line 426
    .line 427
    if-ne v6, v3, :cond_1a

    .line 428
    .line 429
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    goto :goto_14

    .line 433
    :cond_1a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    goto :goto_15

    .line 437
    :cond_1b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    goto :goto_12

    .line 441
    :cond_1c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iput-byte v4, p0, La/ef70;->j:B

    .line 445
    .line 446
    invoke-virtual {v2, p0}, La/qf70;->y(La/zje;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    if-ne p1, v0, :cond_1d

    .line 451
    .line 452
    goto :goto_13

    .line 453
    :cond_1d
    :goto_12
    check-cast p1, Ljava/lang/Number;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    iget-object v1, v2, La/qf70;->L:La/p7m0;

    .line 460
    .line 461
    iget-object v6, v2, La/qf70;->N:La/p7m0;

    .line 462
    .line 463
    iget-object v7, v2, La/qf70;->M:La/p7m0;

    .line 464
    .line 465
    iget-object v8, v2, La/qf70;->y:La/m1e;

    .line 466
    .line 467
    invoke-interface {v8}, La/m1e;->b()La/gmq;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    new-instance v9, La/gf70;

    .line 472
    .line 473
    const/4 v10, 0x5

    .line 474
    invoke-direct {v9, v10, v5}, La/bnn0;-><init>(ILa/yje;)V

    .line 475
    .line 476
    .line 477
    invoke-static {v1, v6, v7, v8, v9}, La/dub;->e0(La/gmq;La/gmq;La/gmq;La/gmq;La/zdr;)La/a1g;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    new-instance v5, La/n6d;

    .line 482
    .line 483
    invoke-direct {v5, v2, p1, v4}, La/n6d;-><init>(Ljava/lang/Object;IB)V

    .line 484
    .line 485
    .line 486
    iput-byte v3, p0, La/ef70;->j:B

    .line 487
    .line 488
    invoke-virtual {v1, v5, p0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    if-ne p0, v0, :cond_1e

    .line 493
    .line 494
    :goto_13
    move-object v5, v0

    .line 495
    goto :goto_15

    .line 496
    :cond_1e
    :goto_14
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    :goto_15
    return-object v5

    .line 499
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 500
    .line 501
    iget-byte v6, p0, La/ef70;->j:B

    .line 502
    .line 503
    if-eqz v6, :cond_21

    .line 504
    .line 505
    if-eq v6, v4, :cond_20

    .line 506
    .line 507
    if-ne v6, v3, :cond_1f

    .line 508
    .line 509
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    goto :goto_18

    .line 513
    :cond_1f
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    goto :goto_19

    .line 517
    :cond_20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto :goto_16

    .line 521
    :cond_21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    iget-object p1, v2, La/qf70;->k:La/gmt;

    .line 525
    .line 526
    invoke-virtual {p1}, La/gmt;->a()La/ql5;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    if-nez p1, :cond_23

    .line 531
    .line 532
    iget-object p1, v2, La/qf70;->n:La/qpt;

    .line 533
    .line 534
    invoke-virtual {p1}, La/qpt;->a()La/ql5;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    if-nez p1, :cond_23

    .line 539
    .line 540
    iget-object p1, v2, La/qf70;->z:La/wsf0;

    .line 541
    .line 542
    iget-object p1, p1, La/wsf0;->b:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast p1, La/g45;

    .line 545
    .line 546
    invoke-virtual {p1}, La/g45;->G()La/khf0;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    sget-object v1, La/bm5;->d:La/bm5;

    .line 551
    .line 552
    iput-byte v4, p0, La/ef70;->j:B

    .line 553
    .line 554
    sget-object v6, La/tl5;->c:La/tl5;

    .line 555
    .line 556
    invoke-virtual {p1, v1, v6, p0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    if-ne p1, v0, :cond_22

    .line 561
    .line 562
    goto :goto_17

    .line 563
    :cond_22
    :goto_16
    check-cast p1, La/ql5;

    .line 564
    .line 565
    :cond_23
    new-instance v1, La/ku60;

    .line 566
    .line 567
    const/16 v6, 0xa

    .line 568
    .line 569
    invoke-direct {v1, v2, v5, v6}, La/ku60;-><init>(La/diu0;La/yje;B)V

    .line 570
    .line 571
    .line 572
    iput-byte v3, p0, La/ef70;->j:B

    .line 573
    .line 574
    invoke-virtual {v2, p1, v4, v1, p0}, La/qf70;->J(La/ql5;ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    if-ne p0, v0, :cond_24

    .line 579
    .line 580
    :goto_17
    move-object v5, v0

    .line 581
    goto :goto_19

    .line 582
    :cond_24
    :goto_18
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    :goto_19
    return-object v5

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
