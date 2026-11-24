.class public final La/kxi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xxi0;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/xxi0;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kxi0;->i:B

    iput-object p1, p0, La/kxi0;->k:La/xxi0;

    iput-object p2, p0, La/kxi0;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/kxi0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/kxi0;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/kxi0;->k:La/xxi0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/kxi0;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/kxi0;-><init>(La/xxi0;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/kxi0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/kxi0;-><init>(La/xxi0;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/kxi0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/kxi0;-><init>(La/xxi0;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kxi0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kxi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kxi0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kxi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kxi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kxi0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kxi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/kxi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/kxi0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/kxi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kxi0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/kxi0;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, La/kxi0;->k:La/xxi0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/kxi0;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, La/xxi0;->o0:La/nv20;

    .line 36
    .line 37
    iget-object v3, v3, La/xxi0;->M:La/x4u;

    .line 38
    .line 39
    iget-object v3, v3, La/x4u;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, La/okt0;

    .line 42
    .line 43
    iget-object v3, v3, La/okt0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, La/btt0;

    .line 46
    .line 47
    iget-object v3, v3, La/btt0;->a:La/vwb0;

    .line 48
    .line 49
    const-string v5, "refresh_token"

    .line 50
    .line 51
    invoke-static {v3, v5}, La/vwb0;->d(La/vwb0;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-boolean v6, v0, La/kxi0;->j:Z

    .line 56
    .line 57
    invoke-virtual {v4, v2, v3, v0}, La/nv20;->e(Ljava/lang/String;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v1, :cond_2

    .line 62
    .line 63
    move-object v4, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    return-object v4

    .line 68
    :pswitch_0
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 69
    .line 70
    sget-object v7, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v8, v0, La/kxi0;->j:Z

    .line 73
    .line 74
    if-eqz v8, :cond_4

    .line 75
    .line 76
    if-ne v8, v6, :cond_3

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget v4, La/xxi0;->Y0:I

    .line 92
    .line 93
    iget-object v8, v1, La/ocj;->a:La/p7m0;

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-object v9, v4

    .line 103
    check-cast v9, La/twi0;

    .line 104
    .line 105
    const/16 v41, -0x2

    .line 106
    .line 107
    const v42, 0x1fffff

    .line 108
    .line 109
    .line 110
    const/4 v10, 0x1

    .line 111
    const/4 v11, 0x0

    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v14, 0x0

    .line 115
    const/4 v15, 0x0

    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    const/16 v21, 0x0

    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/16 v23, 0x0

    .line 131
    .line 132
    const/16 v24, 0x0

    .line 133
    .line 134
    const/16 v25, 0x0

    .line 135
    .line 136
    const/16 v26, 0x0

    .line 137
    .line 138
    const/16 v27, 0x0

    .line 139
    .line 140
    const/16 v28, 0x0

    .line 141
    .line 142
    const/16 v29, 0x0

    .line 143
    .line 144
    const/16 v30, 0x0

    .line 145
    .line 146
    const/16 v31, 0x0

    .line 147
    .line 148
    const/16 v32, 0x0

    .line 149
    .line 150
    const/16 v33, 0x0

    .line 151
    .line 152
    const/16 v34, 0x0

    .line 153
    .line 154
    const/16 v35, 0x0

    .line 155
    .line 156
    const/16 v36, 0x0

    .line 157
    .line 158
    const/16 v37, 0x0

    .line 159
    .line 160
    const/16 v38, 0x0

    .line 161
    .line 162
    const/16 v39, 0x0

    .line 163
    .line 164
    const/16 v40, 0x0

    .line 165
    .line 166
    invoke-static/range {v9 .. v42}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v8, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_5

    .line 175
    .line 176
    iget-object v3, v3, La/xxi0;->J0:La/im4;

    .line 177
    .line 178
    new-instance v4, La/tl4;

    .line 179
    .line 180
    new-instance v5, La/ru4;

    .line 181
    .line 182
    invoke-direct {v5, v2}, La/ru4;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v4, v5}, La/tl4;-><init>(La/ru4;)V

    .line 186
    .line 187
    .line 188
    iput-boolean v6, v0, La/kxi0;->j:Z

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4, v0}, La/im4;->j(La/xl4;La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-ne v0, v7, :cond_6

    .line 198
    .line 199
    move-object v4, v7

    .line 200
    goto :goto_3

    .line 201
    :cond_6
    :goto_2
    sget v0, La/xxi0;->Y0:I

    .line 202
    .line 203
    iget-object v4, v1, La/ocj;->a:La/p7m0;

    .line 204
    .line 205
    :cond_7
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-object v5, v0

    .line 213
    check-cast v5, La/twi0;

    .line 214
    .line 215
    const/16 v37, -0x2

    .line 216
    .line 217
    const v38, 0x1fffff

    .line 218
    .line 219
    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v9, 0x0

    .line 224
    const/4 v10, 0x0

    .line 225
    const/4 v11, 0x0

    .line 226
    const/4 v12, 0x0

    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const/16 v19, 0x0

    .line 237
    .line 238
    const/16 v20, 0x0

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const/16 v22, 0x0

    .line 243
    .line 244
    const/16 v23, 0x0

    .line 245
    .line 246
    const/16 v24, 0x0

    .line 247
    .line 248
    const/16 v25, 0x0

    .line 249
    .line 250
    const/16 v26, 0x0

    .line 251
    .line 252
    const/16 v27, 0x0

    .line 253
    .line 254
    const/16 v28, 0x0

    .line 255
    .line 256
    const/16 v29, 0x0

    .line 257
    .line 258
    const/16 v30, 0x0

    .line 259
    .line 260
    const/16 v31, 0x0

    .line 261
    .line 262
    const/16 v32, 0x0

    .line 263
    .line 264
    const/16 v33, 0x0

    .line 265
    .line 266
    const/16 v34, 0x0

    .line 267
    .line 268
    const/16 v35, 0x0

    .line 269
    .line 270
    const/16 v36, 0x0

    .line 271
    .line 272
    invoke-static/range {v5 .. v38}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_7

    .line 281
    .line 282
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    :goto_3
    return-object v4

    .line 285
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 286
    .line 287
    iget-boolean v7, v0, La/kxi0;->j:Z

    .line 288
    .line 289
    if-eqz v7, :cond_9

    .line 290
    .line 291
    if-ne v7, v6, :cond_8

    .line 292
    .line 293
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v0, p1

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_8
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iget-object v4, v3, La/xxi0;->l0:La/bbw0;

    .line 307
    .line 308
    iput-boolean v6, v0, La/kxi0;->j:Z

    .line 309
    .line 310
    invoke-virtual {v4, v2, v0}, La/bbw0;->q(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-ne v0, v1, :cond_a

    .line 315
    .line 316
    move-object v4, v1

    .line 317
    goto :goto_7

    .line 318
    :cond_a
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_c

    .line 325
    .line 326
    sget v0, La/xxi0;->Y0:I

    .line 327
    .line 328
    iget-object v0, v3, La/xxi0;->A:La/i1w0;

    .line 329
    .line 330
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iget-object v2, v3, La/xxi0;->h0:La/s9m0;

    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    new-instance v2, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$TestSectionScreen;

    .line 340
    .line 341
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 342
    .line 343
    .line 344
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 345
    .line 346
    if-eqz v3, :cond_b

    .line 347
    .line 348
    new-instance v3, La/e1w0;

    .line 349
    .line 350
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 351
    .line 352
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, La/c8d;

    .line 356
    .line 357
    sget-object v4, La/y7d;->a:La/v7d;

    .line 358
    .line 359
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_b
    new-instance v3, La/w0w0;

    .line 367
    .line 368
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 369
    .line 370
    .line 371
    new-instance v2, La/c8d;

    .line 372
    .line 373
    sget-object v4, La/y7d;->a:La/v7d;

    .line 374
    .line 375
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    :goto_5
    const/4 v2, 0x0

    .line 382
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    :goto_6
    move-object v2, v1

    .line 387
    check-cast v2, La/paw;

    .line 388
    .line 389
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-eqz v3, :cond_c

    .line 394
    .line 395
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, La/oe50;

    .line 400
    .line 401
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 402
    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    :goto_7
    return-object v4

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
