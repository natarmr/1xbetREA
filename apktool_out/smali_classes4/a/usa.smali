.class public final La/usa;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wsa;


# direct methods
.method public synthetic constructor <init>(La/wsa;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/usa;->i:B

    iput-object p1, p0, La/usa;->k:La/wsa;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/usa;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/usa;->k:La/wsa;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/usa;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/usa;-><init>(La/wsa;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/usa;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/usa;-><init>(La/wsa;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/usa;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/usa;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/usa;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/usa;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/usa;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/usa;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/usa;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/usa;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/usa;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v5, p0, La/usa;->j:Z

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    if-ne v5, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/usa;->k:La/wsa;

    .line 32
    .line 33
    iget-object v5, p1, La/wsa;->v:La/phf0;

    .line 34
    .line 35
    invoke-virtual {v5}, La/phf0;->m()La/i89;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object v6, p1, La/wsa;->w:La/jqt;

    .line 40
    .line 41
    invoke-virtual {v6}, La/jqt;->a()La/h2c;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, La/ko0;

    .line 46
    .line 47
    const/4 v8, 0x4

    .line 48
    invoke-direct {v7, p1, v3, v8}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    new-instance v8, La/k19;

    .line 52
    .line 53
    const/16 v9, 0x16

    .line 54
    .line 55
    invoke-direct {v8, p1, v9}, La/k19;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    iput-boolean v4, p0, La/usa;->j:Z

    .line 59
    .line 60
    new-array p1, v2, [La/gmq;

    .line 61
    .line 62
    aput-object v5, p1, v1

    .line 63
    .line 64
    aput-object v6, p1, v4

    .line 65
    .line 66
    sget-object v1, La/pul;->j:La/pul;

    .line 67
    .line 68
    new-instance v2, La/kh1;

    .line 69
    .line 70
    const/16 v4, 0x9

    .line 71
    .line 72
    invoke-direct {v2, v7, v3, v4}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v8, v2, v1, p1}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v0, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_0
    if-ne p0, v0, :cond_3

    .line 85
    .line 86
    move-object v3, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_2
    return-object v3

    .line 91
    :pswitch_0
    iget-boolean v0, p0, La/usa;->j:Z

    .line 92
    .line 93
    sget-object v5, La/wne;->a:La/wne;

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v6, p0, La/usa;->k:La/wsa;

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    sget p0, La/wsa;->Q:I

    .line 103
    .line 104
    iget-object p0, v6, La/wsa;->P:La/bby;

    .line 105
    .line 106
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 107
    .line 108
    .line 109
    iget-object v7, v6, La/wsa;->u:La/hjd;

    .line 110
    .line 111
    new-instance v10, La/im8;

    .line 112
    .line 113
    const/16 p0, 0x1c

    .line 114
    .line 115
    invoke-direct {v10, p0}, La/im8;-><init>(B)V

    .line 116
    .line 117
    .line 118
    const/16 v11, 0x77

    .line 119
    .line 120
    const/4 v8, 0x0

    .line 121
    const/4 v9, 0x0

    .line 122
    invoke-static/range {v6 .. v11}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    iput-object p0, v6, La/wsa;->P:La/bby;

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    iget-object p1, v6, La/wsa;->O:La/c4m0;

    .line 133
    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-ne p1, v4, :cond_4

    .line 141
    .line 142
    goto/16 :goto_7

    .line 143
    .line 144
    :cond_4
    iget-object p1, v6, La/wsa;->B:La/wdu;

    .line 145
    .line 146
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/gsa;

    .line 151
    .line 152
    iget-object v0, v0, La/gsa;->a:La/rra;

    .line 153
    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    iget-boolean v0, v0, La/rra;->h:Z

    .line 157
    .line 158
    if-ne v0, v4, :cond_5

    .line 159
    .line 160
    move v0, v4

    .line 161
    goto :goto_3

    .line 162
    :cond_5
    move v0, v1

    .line 163
    :goto_3
    invoke-static {p1, v4, v4, v0}, La/wdu;->y(La/wdu;ZZZ)La/utb;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    new-instance v0, La/lsa;

    .line 168
    .line 169
    invoke-direct {v0, p1, v2}, La/lsa;-><init>(La/utb;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, La/gsa;

    .line 177
    .line 178
    iget-object p1, p1, La/gsa;->a:La/rra;

    .line 179
    .line 180
    const/16 v5, 0xc

    .line 181
    .line 182
    const/4 v7, 0x3

    .line 183
    if-eqz p1, :cond_6

    .line 184
    .line 185
    iget-boolean p1, p1, La/rra;->d:Z

    .line 186
    .line 187
    if-ne p1, v4, :cond_6

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_6
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, La/gsa;

    .line 195
    .line 196
    iget-object p1, p1, La/gsa;->a:La/rra;

    .line 197
    .line 198
    if-eqz p1, :cond_7

    .line 199
    .line 200
    iget-boolean p1, p1, La/rra;->e:Z

    .line 201
    .line 202
    if-ne p1, v4, :cond_7

    .line 203
    .line 204
    :goto_4
    iget-object p1, v6, La/wsa;->A:La/w5z;

    .line 205
    .line 206
    invoke-virtual {p1}, La/w5z;->O()La/utb;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v8, La/lsa;

    .line 211
    .line 212
    invoke-direct {v8, p1, v1}, La/lsa;-><init>(La/utb;B)V

    .line 213
    .line 214
    .line 215
    new-instance p1, La/oz0;

    .line 216
    .line 217
    invoke-direct {p1, v7, v3, v2}, La/oz0;-><init>(ILa/yje;B)V

    .line 218
    .line 219
    .line 220
    new-instance v1, La/dnq;

    .line 221
    .line 222
    invoke-direct {v1, v8, p1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_7
    new-instance v1, La/eu4;

    .line 227
    .line 228
    invoke-direct {v1, p0, v5}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 229
    .line 230
    .line 231
    :goto_5
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, La/gsa;

    .line 236
    .line 237
    iget-object p1, p1, La/gsa;->a:La/rra;

    .line 238
    .line 239
    if-eqz p1, :cond_8

    .line 240
    .line 241
    iget-boolean p1, p1, La/rra;->b:Z

    .line 242
    .line 243
    if-ne p1, v4, :cond_8

    .line 244
    .line 245
    iget-object p0, v6, La/wsa;->z:La/zpu;

    .line 246
    .line 247
    invoke-virtual {p0}, La/zpu;->g()La/utb;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    new-instance p1, La/lsa;

    .line 252
    .line 253
    invoke-direct {p1, p0, v4}, La/lsa;-><init>(La/utb;B)V

    .line 254
    .line 255
    .line 256
    new-instance p0, La/oz0;

    .line 257
    .line 258
    invoke-direct {p0, v7, v3, v7}, La/oz0;-><init>(ILa/yje;B)V

    .line 259
    .line 260
    .line 261
    new-instance v2, La/dnq;

    .line 262
    .line 263
    invoke-direct {v2, p1, p0, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_8
    new-instance v2, La/eu4;

    .line 268
    .line 269
    invoke-direct {v2, p0, v5}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 270
    .line 271
    .line 272
    :goto_6
    new-instance p0, La/tsa;

    .line 273
    .line 274
    invoke-direct {p0, v6, v3}, La/tsa;-><init>(La/wsa;La/yje;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v1, v2, p0}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    iget-object v0, v6, La/wsa;->q:La/mne;

    .line 286
    .line 287
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 288
    .line 289
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    move-object v8, v6

    .line 294
    new-instance v6, La/c48;

    .line 295
    .line 296
    const/4 v12, 0x4

    .line 297
    const/16 v13, 0x9

    .line 298
    .line 299
    const/4 v7, 0x2

    .line 300
    const-class v9, La/wsa;

    .line 301
    .line 302
    const-string v10, "onDataLoadingError"

    .line 303
    .line 304
    const-string v11, "onDataLoadingError(Ljava/lang/Throwable;)V"

    .line 305
    .line 306
    invoke-direct/range {v6 .. v13}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 307
    .line 308
    .line 309
    invoke-static {p0, p1, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    iput-object p0, v8, La/wsa;->O:La/c4m0;

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_9
    move-object v8, v6

    .line 317
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    check-cast p0, La/gsa;

    .line 322
    .line 323
    iget-boolean p0, p0, La/gsa;->c:Z

    .line 324
    .line 325
    if-eqz p0, :cond_b

    .line 326
    .line 327
    iget-object p0, v8, La/i3t0;->i:La/ocj;

    .line 328
    .line 329
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 330
    .line 331
    :cond_a
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-object v0, p1

    .line 339
    check-cast v0, La/gsa;

    .line 340
    .line 341
    const/4 v10, 0x0

    .line 342
    const/16 v11, 0xff7

    .line 343
    .line 344
    const/4 v1, 0x0

    .line 345
    const/4 v2, 0x0

    .line 346
    const/4 v3, 0x1

    .line 347
    const/4 v4, 0x0

    .line 348
    const/4 v5, 0x0

    .line 349
    const/4 v6, 0x0

    .line 350
    const/4 v7, 0x0

    .line 351
    const/4 v8, 0x0

    .line 352
    const/4 v9, 0x0

    .line 353
    invoke-static/range {v0 .. v11}, La/gsa;->a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result p1

    .line 361
    if-eqz p1, :cond_a

    .line 362
    .line 363
    :cond_b
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object p0

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
