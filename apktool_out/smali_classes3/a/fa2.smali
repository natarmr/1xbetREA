.class public final synthetic La/fa2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ta5;I)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    iput-byte p2, p0, La/fa2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fa2;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/fa2;->a:B

    iput-object p1, p0, La/fa2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/fa2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xnb0;

    .line 4
    .line 5
    check-cast p1, La/fet;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    and-int/lit8 v0, p2, 0x3

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    and-int/2addr p2, v3

    .line 24
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, La/xnb0;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, La/xnb0;->b:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v2, p1, v0, p2, p0}, La/rsr0;->H(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/fa2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/wnb0;

    .line 4
    .line 5
    check-cast p1, La/fet;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    and-int/lit8 v0, p2, 0x3

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    and-int/2addr p2, v3

    .line 24
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, La/wnb0;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, La/wnb0;->b:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v2, p1, v0, p2, p0}, La/cwr0;->B(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fa2;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    sget-object v5, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x2

    .line 16
    iget-object v10, v0, La/fa2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v10, La/p580;

    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, La/fet;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    if-eq v2, v9, :cond_0

    .line 38
    .line 39
    move v2, v7

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v2, v8

    .line 42
    :goto_0
    and-int/2addr v1, v7

    .line 43
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    sget-object v1, La/qmk;->a:La/zcl;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/16 v7, 0xd

    .line 53
    .line 54
    sget-object v2, La/jm40;->b:La/jm40;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    const/high16 v4, 0x40800000    # 4.0f

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1, v10, v0, v8}, La/bdx;->p(La/mm40;La/p580;La/fet;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v0}, La/fet;->X()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    invoke-direct/range {p0 .. p2}, La/fa2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_1
    invoke-direct/range {p0 .. p2}, La/fa2;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_2
    check-cast v10, La/wr6;

    .line 85
    .line 86
    move-object/from16 v0, p1

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Throwable;

    .line 89
    .line 90
    move-object/from16 v1, p2

    .line 91
    .line 92
    check-cast v1, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    instance-of v0, v0, La/ff5;

    .line 101
    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    new-instance v0, La/gh5;

    .line 105
    .line 106
    const/16 v1, 0x18

    .line 107
    .line 108
    invoke-direct {v0, v1}, La/gh5;-><init>(B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    new-instance v0, La/gh5;

    .line 116
    .line 117
    const/16 v1, 0x19

    .line 118
    .line 119
    invoke-direct {v0, v1}, La/gh5;-><init>(B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_3
    check-cast v10, La/er6;

    .line 129
    .line 130
    move-object/from16 v0, p1

    .line 131
    .line 132
    check-cast v0, Ljava/lang/String;

    .line 133
    .line 134
    move-object/from16 v1, p2

    .line 135
    .line 136
    check-cast v1, Landroid/os/Bundle;

    .line 137
    .line 138
    sget-object v2, La/er6;->S1:La/kl5;

    .line 139
    .line 140
    const-string v2, "REQUEST_TEAM_SELECTOR_KEY"

    .line 141
    .line 142
    invoke-static {v1, v0, v2}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_3

    .line 147
    .line 148
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_3
    const-string v0, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 152
    .line 153
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_4

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    check-cast v0, La/ojp0;

    .line 167
    .line 168
    invoke-virtual {v10}, La/er6;->H0()La/as6;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    new-instance v15, La/ur6;

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    const/16 v18, 0x4

    .line 181
    .line 182
    const/4 v12, 0x1

    .line 183
    const-class v14, La/as6;

    .line 184
    .line 185
    move-object v11, v15

    .line 186
    const-string v15, "emitShowSnackBarWithDefaultErrorMessage"

    .line 187
    .line 188
    const-string v16, "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V"

    .line 189
    .line 190
    invoke-direct/range {v11 .. v18}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 191
    .line 192
    .line 193
    new-instance v2, La/yp6;

    .line 194
    .line 195
    invoke-direct {v2, v13, v0, v3, v9}, La/yp6;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 196
    .line 197
    .line 198
    const/16 v19, 0xe

    .line 199
    .line 200
    const/16 v16, 0x0

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    move-object v14, v1

    .line 205
    move-object/from16 v18, v2

    .line 206
    .line 207
    move-object v15, v11

    .line 208
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 209
    .line 210
    .line 211
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_3
    return-object v0

    .line 214
    :pswitch_4
    check-cast v10, La/l46;

    .line 215
    .line 216
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, La/fet;

    .line 219
    .line 220
    move-object/from16 v1, p2

    .line 221
    .line 222
    check-cast v1, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    sget-object v2, La/l46;->O1:La/kl5;

    .line 229
    .line 230
    and-int/lit8 v2, v1, 0x3

    .line 231
    .line 232
    if-eq v2, v9, :cond_5

    .line 233
    .line 234
    move v2, v7

    .line 235
    goto :goto_4

    .line 236
    :cond_5
    move v2, v8

    .line 237
    :goto_4
    and-int/2addr v1, v7

    .line 238
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_8

    .line 243
    .line 244
    iget-object v1, v10, La/l46;->N1:La/a8z;

    .line 245
    .line 246
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    move-object v11, v1

    .line 251
    check-cast v11, La/k3t0;

    .line 252
    .line 253
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    if-nez v1, :cond_6

    .line 262
    .line 263
    if-ne v2, v5, :cond_7

    .line 264
    .line 265
    :cond_6
    new-instance v9, La/yj5;

    .line 266
    .line 267
    const/4 v15, 0x0

    .line 268
    const/16 v16, 0x7

    .line 269
    .line 270
    const/4 v10, 0x1

    .line 271
    const-class v12, La/k3t0;

    .line 272
    .line 273
    const-string v13, "onAction"

    .line 274
    .line 275
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 276
    .line 277
    invoke-direct/range {v9 .. v16}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object v2, v9

    .line 284
    :cond_7
    check-cast v2, La/jhy;

    .line 285
    .line 286
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 287
    .line 288
    invoke-static {v2, v0, v8}, La/o050;->d(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_8
    invoke-virtual {v0}, La/fet;->X()V

    .line 293
    .line 294
    .line 295
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_5
    check-cast v10, La/d06;

    .line 299
    .line 300
    iget-object v0, v10, La/d06;->p:La/ol60;

    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    check-cast v1, Ljava/lang/Throwable;

    .line 305
    .line 306
    move-object/from16 v13, p2

    .line 307
    .line 308
    check-cast v13, Ljava/lang/String;

    .line 309
    .line 310
    sget-object v15, La/rek0;->b:La/rek0;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    instance-of v3, v1, La/zhi0;

    .line 319
    .line 320
    if-eqz v3, :cond_a

    .line 321
    .line 322
    iget-object v3, v10, La/d06;->q:Ljava/util/List;

    .line 323
    .line 324
    move-object v4, v1

    .line 325
    check-cast v4, La/zhi0;

    .line 326
    .line 327
    iget-object v4, v4, La/zhi0;->c:La/kuw;

    .line 328
    .line 329
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_a

    .line 334
    .line 335
    new-instance v3, La/p0o;

    .line 336
    .line 337
    new-instance v14, La/xdk0;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-nez v1, :cond_9

    .line 344
    .line 345
    move-object/from16 v16, v2

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_9
    move-object/from16 v16, v1

    .line 349
    .line 350
    :goto_6
    const/16 v20, 0x0

    .line 351
    .line 352
    const/16 v21, 0x7c

    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/16 v18, 0x0

    .line 357
    .line 358
    const/16 v19, 0x0

    .line 359
    .line 360
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 361
    .line 362
    .line 363
    invoke-direct {v3, v14}, La/p0o;-><init>(La/xdk0;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    iget-object v0, v10, La/d06;->o:La/ol60;

    .line 370
    .line 371
    sget-object v1, La/j320;->a:La/j320;

    .line 372
    .line 373
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_a
    new-instance v1, La/p0o;

    .line 378
    .line 379
    new-instance v11, La/xdk0;

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    const/16 v18, 0x7c

    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    move-object v12, v15

    .line 387
    const/4 v15, 0x0

    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 391
    .line 392
    .line 393
    invoke-direct {v1, v11}, La/p0o;-><init>(La/xdk0;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_6
    check-cast v10, La/ol5;

    .line 403
    .line 404
    move-object/from16 v0, p1

    .line 405
    .line 406
    check-cast v0, La/fet;

    .line 407
    .line 408
    move-object/from16 v1, p2

    .line 409
    .line 410
    check-cast v1, Ljava/lang/Integer;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    sget-object v2, La/ol5;->R1:La/kl5;

    .line 417
    .line 418
    and-int/lit8 v2, v1, 0x3

    .line 419
    .line 420
    if-eq v2, v9, :cond_b

    .line 421
    .line 422
    move v8, v7

    .line 423
    :cond_b
    and-int/2addr v1, v7

    .line 424
    invoke-virtual {v0, v1, v8}, La/fet;->U(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_e

    .line 429
    .line 430
    invoke-virtual {v10}, La/ol5;->G0()La/dk5;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    if-nez v2, :cond_c

    .line 443
    .line 444
    if-ne v3, v5, :cond_d

    .line 445
    .line 446
    :cond_c
    new-instance v5, La/pw4;

    .line 447
    .line 448
    const/4 v11, 0x0

    .line 449
    const/4 v12, 0x4

    .line 450
    const/4 v6, 0x0

    .line 451
    const-class v8, La/ol5;

    .line 452
    .line 453
    const-string v9, "showChangeBalance"

    .line 454
    .line 455
    move-object v7, v10

    .line 456
    const-string v10, "showChangeBalance()V"

    .line 457
    .line 458
    invoke-direct/range {v5 .. v12}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    move-object v3, v5

    .line 465
    :cond_d
    check-cast v3, La/jhy;

    .line 466
    .line 467
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 468
    .line 469
    invoke-static {v1, v3, v0, v4}, La/y0x0;->z(La/dk5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 470
    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_e
    invoke-virtual {v0}, La/fet;->X()V

    .line 474
    .line 475
    .line 476
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_7
    check-cast v10, La/il5;

    .line 480
    .line 481
    move-object/from16 v0, p1

    .line 482
    .line 483
    check-cast v0, La/fet;

    .line 484
    .line 485
    move-object/from16 v1, p2

    .line 486
    .line 487
    check-cast v1, Ljava/lang/Integer;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    sget-object v2, La/il5;->Q1:La/gl5;

    .line 494
    .line 495
    and-int/lit8 v2, v1, 0x3

    .line 496
    .line 497
    if-eq v2, v9, :cond_f

    .line 498
    .line 499
    move v8, v7

    .line 500
    :cond_f
    and-int/2addr v1, v7

    .line 501
    invoke-virtual {v0, v1, v8}, La/fet;->U(IZ)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_10

    .line 506
    .line 507
    iget-object v1, v10, La/il5;->O1:La/kiu0;

    .line 508
    .line 509
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, La/dk5;

    .line 514
    .line 515
    invoke-static {v1, v0, v4}, La/xia0;->x(La/dk5;La/fet;I)V

    .line 516
    .line 517
    .line 518
    goto :goto_9

    .line 519
    :cond_10
    invoke-virtual {v0}, La/fet;->X()V

    .line 520
    .line 521
    .line 522
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_8
    check-cast v10, La/fl5;

    .line 526
    .line 527
    move-object/from16 v0, p1

    .line 528
    .line 529
    check-cast v0, La/fet;

    .line 530
    .line 531
    move-object/from16 v1, p2

    .line 532
    .line 533
    check-cast v1, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    sget-object v2, La/fl5;->P1:La/cl5;

    .line 540
    .line 541
    and-int/lit8 v2, v1, 0x3

    .line 542
    .line 543
    if-eq v2, v9, :cond_11

    .line 544
    .line 545
    move v8, v7

    .line 546
    :cond_11
    and-int/2addr v1, v7

    .line 547
    invoke-virtual {v0, v1, v8}, La/fet;->U(IZ)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-eqz v1, :cond_12

    .line 552
    .line 553
    iget-object v1, v10, La/fl5;->N1:La/kiu0;

    .line 554
    .line 555
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, La/dk5;

    .line 560
    .line 561
    invoke-static {v1, v0, v4}, La/ckb;->e(La/dk5;La/fet;I)V

    .line 562
    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_12
    invoke-virtual {v0}, La/fet;->X()V

    .line 566
    .line 567
    .line 568
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_9
    check-cast v10, La/bl5;

    .line 572
    .line 573
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, La/fet;

    .line 576
    .line 577
    move-object/from16 v1, p2

    .line 578
    .line 579
    check-cast v1, Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    sget-object v2, La/bl5;->R1:La/yk5;

    .line 586
    .line 587
    and-int/lit8 v2, v1, 0x3

    .line 588
    .line 589
    if-eq v2, v9, :cond_13

    .line 590
    .line 591
    move v8, v7

    .line 592
    :cond_13
    and-int/2addr v1, v7

    .line 593
    invoke-virtual {v0, v1, v8}, La/fet;->U(IZ)Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-eqz v1, :cond_18

    .line 598
    .line 599
    invoke-virtual {v10}, La/bl5;->G0()La/dk5;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    if-nez v2, :cond_15

    .line 612
    .line 613
    if-ne v3, v5, :cond_14

    .line 614
    .line 615
    goto :goto_b

    .line 616
    :cond_14
    move-object v8, v10

    .line 617
    goto :goto_c

    .line 618
    :cond_15
    :goto_b
    new-instance v6, La/pw4;

    .line 619
    .line 620
    const/4 v12, 0x0

    .line 621
    const/4 v13, 0x3

    .line 622
    const/4 v7, 0x0

    .line 623
    const-class v9, La/bl5;

    .line 624
    .line 625
    move-object v8, v10

    .line 626
    const-string v10, "showChangeBalance"

    .line 627
    .line 628
    const-string v11, "showChangeBalance()V"

    .line 629
    .line 630
    invoke-direct/range {v6 .. v13}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    move-object v3, v6

    .line 637
    :goto_c
    check-cast v3, La/jhy;

    .line 638
    .line 639
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 640
    .line 641
    invoke-virtual {v8}, La/bl5;->G0()La/dk5;

    .line 642
    .line 643
    .line 644
    move-result-object v11

    .line 645
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    if-nez v2, :cond_16

    .line 654
    .line 655
    if-ne v6, v5, :cond_17

    .line 656
    .line 657
    :cond_16
    new-instance v9, La/yj5;

    .line 658
    .line 659
    const/4 v15, 0x0

    .line 660
    const/16 v16, 0x5

    .line 661
    .line 662
    const/4 v10, 0x1

    .line 663
    const-class v12, La/dk5;

    .line 664
    .line 665
    const-string v13, "onFullHistoryClick"

    .line 666
    .line 667
    const-string v14, "onFullHistoryClick(Z)V"

    .line 668
    .line 669
    invoke-direct/range {v9 .. v16}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    move-object v6, v9

    .line 676
    :cond_17
    check-cast v6, La/jhy;

    .line 677
    .line 678
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 679
    .line 680
    invoke-static {v1, v3, v6, v0, v4}, La/oja0;->o(La/dk5;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 681
    .line 682
    .line 683
    goto :goto_d

    .line 684
    :cond_18
    invoke-virtual {v0}, La/fet;->X()V

    .line 685
    .line 686
    .line 687
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 688
    .line 689
    return-object v0

    .line 690
    :pswitch_a
    move-object v12, v10

    .line 691
    check-cast v12, La/si5;

    .line 692
    .line 693
    move-object/from16 v0, p1

    .line 694
    .line 695
    check-cast v0, La/fet;

    .line 696
    .line 697
    move-object/from16 v1, p2

    .line 698
    .line 699
    check-cast v1, Ljava/lang/Integer;

    .line 700
    .line 701
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    sget-object v2, La/si5;->Q1:La/hfk0;

    .line 706
    .line 707
    and-int/lit8 v2, v1, 0x3

    .line 708
    .line 709
    if-eq v2, v9, :cond_19

    .line 710
    .line 711
    move v2, v7

    .line 712
    goto :goto_e

    .line 713
    :cond_19
    move v2, v8

    .line 714
    :goto_e
    and-int/2addr v1, v7

    .line 715
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    if-eqz v1, :cond_25

    .line 720
    .line 721
    invoke-virtual {v12}, La/si5;->G0()La/k3t0;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    if-nez v2, :cond_1a

    .line 734
    .line 735
    if-ne v3, v5, :cond_1b

    .line 736
    .line 737
    :cond_1a
    new-instance v10, La/j94;

    .line 738
    .line 739
    const/16 v16, 0x0

    .line 740
    .line 741
    const/16 v17, 0x17

    .line 742
    .line 743
    const/4 v11, 0x1

    .line 744
    const-class v13, La/si5;

    .line 745
    .line 746
    const-string v14, "handleSideEffect"

    .line 747
    .line 748
    const-string v15, "handleSideEffect(Lorg/xplatform/feature/balance_management/impl/balance_management/presentation/single_page/model/SinglePageBalanceManagementSideEffect;)V"

    .line 749
    .line 750
    invoke-direct/range {v10 .. v17}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    move-object v3, v10

    .line 757
    :cond_1b
    check-cast v3, La/jhy;

    .line 758
    .line 759
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 760
    .line 761
    sget-object v2, La/lkz;->a:La/lkz;

    .line 762
    .line 763
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 764
    .line 765
    .line 766
    move-result-object v13

    .line 767
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    or-int/2addr v2, v3

    .line 776
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    or-int/2addr v2, v3

    .line 781
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    or-int/2addr v2, v3

    .line 786
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    const/4 v14, 0x0

    .line 791
    if-nez v2, :cond_1c

    .line 792
    .line 793
    if-ne v3, v5, :cond_1d

    .line 794
    .line 795
    :cond_1c
    new-instance v10, La/l10;

    .line 796
    .line 797
    const/16 v15, 0x1a

    .line 798
    .line 799
    move-object v11, v1

    .line 800
    invoke-direct/range {v10 .. v15}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    move-object v3, v10

    .line 807
    :cond_1d
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 808
    .line 809
    invoke-static {v0, v12, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, La/si5;->G0()La/k3t0;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    check-cast v1, La/i3t0;

    .line 817
    .line 818
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    check-cast v1, La/wk5;

    .line 827
    .line 828
    if-eqz v1, :cond_24

    .line 829
    .line 830
    const v2, -0x2943141d

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12}, La/si5;->G0()La/k3t0;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    if-nez v3, :cond_1e

    .line 849
    .line 850
    if-ne v4, v5, :cond_1f

    .line 851
    .line 852
    :cond_1e
    new-instance v15, La/j94;

    .line 853
    .line 854
    const/16 v21, 0x0

    .line 855
    .line 856
    const/16 v22, 0x18

    .line 857
    .line 858
    const/16 v16, 0x1

    .line 859
    .line 860
    const-class v18, La/k3t0;

    .line 861
    .line 862
    const-string v19, "onAction"

    .line 863
    .line 864
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 865
    .line 866
    move-object/from16 v17, v2

    .line 867
    .line 868
    invoke-direct/range {v15 .. v22}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    move-object v4, v15

    .line 875
    :cond_1f
    check-cast v4, La/jhy;

    .line 876
    .line 877
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 878
    .line 879
    invoke-static {v14, v1, v4, v0, v8}, La/xf0;->A(La/mm40;La/wk5;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v1

    .line 889
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    if-nez v1, :cond_20

    .line 894
    .line 895
    if-ne v2, v5, :cond_21

    .line 896
    .line 897
    :cond_20
    new-instance v2, La/qi5;

    .line 898
    .line 899
    invoke-direct {v2, v12, v9}, La/qi5;-><init>(La/si5;B)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    :cond_21
    move-object v13, v2

    .line 906
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 907
    .line 908
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    if-nez v1, :cond_22

    .line 917
    .line 918
    if-ne v2, v5, :cond_23

    .line 919
    .line 920
    :cond_22
    new-instance v2, La/qi5;

    .line 921
    .line 922
    invoke-direct {v2, v12, v6}, La/qi5;-><init>(La/si5;B)V

    .line 923
    .line 924
    .line 925
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 926
    .line 927
    .line 928
    :cond_23
    move-object v14, v2

    .line 929
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 930
    .line 931
    const/16 v17, 0x0

    .line 932
    .line 933
    const/16 v18, 0x4

    .line 934
    .line 935
    const/4 v15, 0x0

    .line 936
    move-object/from16 v16, v0

    .line 937
    .line 938
    invoke-static/range {v13 .. v18}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 939
    .line 940
    .line 941
    goto :goto_f

    .line 942
    :cond_24
    const v1, -0x29432731

    .line 943
    .line 944
    .line 945
    invoke-static {v1, v0, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    throw v0

    .line 950
    :cond_25
    invoke-virtual {v0}, La/fet;->X()V

    .line 951
    .line 952
    .line 953
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 954
    .line 955
    return-object v0

    .line 956
    :pswitch_b
    check-cast v10, La/kb0;

    .line 957
    .line 958
    move-object/from16 v0, p1

    .line 959
    .line 960
    check-cast v0, Ljava/lang/Throwable;

    .line 961
    .line 962
    move-object/from16 v1, p2

    .line 963
    .line 964
    check-cast v1, Ljava/lang/String;

    .line 965
    .line 966
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    new-instance v0, La/bi5;

    .line 973
    .line 974
    invoke-direct {v0, v1}, La/bi5;-><init>(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v10, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_c
    check-cast v10, La/ta5;

    .line 984
    .line 985
    move-object/from16 v0, p1

    .line 986
    .line 987
    check-cast v0, La/fet;

    .line 988
    .line 989
    move-object/from16 v1, p2

    .line 990
    .line 991
    check-cast v1, Ljava/lang/Integer;

    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    invoke-static {v7}, La/x8x;->L(I)I

    .line 997
    .line 998
    .line 999
    move-result v1

    .line 1000
    invoke-static {v10, v0, v1}, La/ntr;->i(La/ta5;La/fet;I)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1004
    .line 1005
    return-object v0

    .line 1006
    :pswitch_d
    check-cast v10, La/g85;

    .line 1007
    .line 1008
    move-object/from16 v0, p1

    .line 1009
    .line 1010
    check-cast v0, Ljava/lang/Throwable;

    .line 1011
    .line 1012
    move-object/from16 v1, p2

    .line 1013
    .line 1014
    check-cast v1, Ljava/lang/String;

    .line 1015
    .line 1016
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    if-eqz v2, :cond_26

    .line 1027
    .line 1028
    iget-object v1, v10, La/g85;->p:La/ctf0;

    .line 1029
    .line 1030
    invoke-static {v0, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    :cond_26
    new-instance v0, La/q75;

    .line 1035
    .line 1036
    invoke-direct {v0, v1}, La/q75;-><init>(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v10, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1040
    .line 1041
    .line 1042
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1043
    .line 1044
    return-object v0

    .line 1045
    :pswitch_e
    check-cast v10, La/ur4;

    .line 1046
    .line 1047
    move-object/from16 v0, p1

    .line 1048
    .line 1049
    check-cast v0, La/fet;

    .line 1050
    .line 1051
    move-object/from16 v1, p2

    .line 1052
    .line 1053
    check-cast v1, Ljava/lang/Integer;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1056
    .line 1057
    .line 1058
    move-result v1

    .line 1059
    sget-object v2, La/ur4;->P1:La/qek0;

    .line 1060
    .line 1061
    and-int/lit8 v2, v1, 0x3

    .line 1062
    .line 1063
    if-eq v2, v9, :cond_27

    .line 1064
    .line 1065
    move v2, v7

    .line 1066
    goto :goto_10

    .line 1067
    :cond_27
    move v2, v8

    .line 1068
    :goto_10
    and-int/2addr v1, v7

    .line 1069
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v1

    .line 1073
    if-eqz v1, :cond_2b

    .line 1074
    .line 1075
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    if-ne v1, v5, :cond_28

    .line 1080
    .line 1081
    iget-object v1, v10, La/ur4;->L1:La/n0o0;

    .line 1082
    .line 1083
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    check-cast v1, La/i9i;

    .line 1088
    .line 1089
    iget-object v11, v1, La/i9i;->d:La/g2v;

    .line 1090
    .line 1091
    sget-object v12, La/pb10;->g:La/pb10;

    .line 1092
    .line 1093
    const/16 v17, 0x0

    .line 1094
    .line 1095
    const/16 v18, 0x1de

    .line 1096
    .line 1097
    const/4 v13, 0x0

    .line 1098
    const/4 v14, 0x0

    .line 1099
    const v15, 0x7f1307bb

    .line 1100
    .line 1101
    .line 1102
    const/16 v16, 0x0

    .line 1103
    .line 1104
    invoke-static/range {v11 .. v18}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v1

    .line 1108
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1109
    .line 1110
    .line 1111
    :cond_28
    check-cast v1, La/jkm;

    .line 1112
    .line 1113
    iget-object v2, v10, La/ur4;->M1:La/kiu0;

    .line 1114
    .line 1115
    invoke-virtual {v2}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    move-object v13, v2

    .line 1120
    check-cast v13, La/zr4;

    .line 1121
    .line 1122
    invoke-virtual {v0, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v3

    .line 1130
    if-nez v2, :cond_29

    .line 1131
    .line 1132
    if-ne v3, v5, :cond_2a

    .line 1133
    .line 1134
    :cond_29
    new-instance v11, La/f8;

    .line 1135
    .line 1136
    const/16 v17, 0x0

    .line 1137
    .line 1138
    const/16 v18, 0x15

    .line 1139
    .line 1140
    const/4 v12, 0x0

    .line 1141
    const-class v14, La/zr4;

    .line 1142
    .line 1143
    const-string v15, "onCloseBtnClicked"

    .line 1144
    .line 1145
    const-string v16, "onCloseBtnClicked()V"

    .line 1146
    .line 1147
    invoke-direct/range {v11 .. v18}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    move-object v3, v11

    .line 1154
    :cond_2a
    check-cast v3, La/jhy;

    .line 1155
    .line 1156
    iget-object v2, v10, La/ur4;->O1:La/phf0;

    .line 1157
    .line 1158
    sget-object v4, La/ur4;->Q1:[La/iiy;

    .line 1159
    .line 1160
    aget-object v4, v4, v9

    .line 1161
    .line 1162
    invoke-virtual {v2, v10, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 1167
    .line 1168
    invoke-static {v3, v2, v1, v0, v8}, La/i4w0;->c(Lkotlin/jvm/functions/Function0;Ljava/lang/String;La/jkm;La/fet;I)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_11

    .line 1172
    :cond_2b
    invoke-virtual {v0}, La/fet;->X()V

    .line 1173
    .line 1174
    .line 1175
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1176
    .line 1177
    return-object v0

    .line 1178
    :pswitch_f
    move-object v3, v10

    .line 1179
    check-cast v3, La/qp4;

    .line 1180
    .line 1181
    move-object/from16 v14, p1

    .line 1182
    .line 1183
    check-cast v14, La/fet;

    .line 1184
    .line 1185
    move-object/from16 v0, p2

    .line 1186
    .line 1187
    check-cast v0, Ljava/lang/Integer;

    .line 1188
    .line 1189
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1190
    .line 1191
    .line 1192
    move-result v0

    .line 1193
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 1194
    .line 1195
    and-int/lit8 v1, v0, 0x3

    .line 1196
    .line 1197
    if-eq v1, v9, :cond_2c

    .line 1198
    .line 1199
    move v8, v7

    .line 1200
    :cond_2c
    and-int/2addr v0, v7

    .line 1201
    invoke-virtual {v14, v0, v8}, La/fet;->U(IZ)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    if-eqz v0, :cond_31

    .line 1206
    .line 1207
    invoke-virtual {v3}, La/qp4;->H0()La/ku4;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    invoke-virtual {v14, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v1

    .line 1215
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    if-nez v1, :cond_2d

    .line 1220
    .line 1221
    if-ne v2, v5, :cond_2e

    .line 1222
    .line 1223
    :cond_2d
    new-instance v6, La/j94;

    .line 1224
    .line 1225
    const/4 v12, 0x0

    .line 1226
    const/16 v13, 0xa

    .line 1227
    .line 1228
    const/4 v7, 0x1

    .line 1229
    const-class v9, La/qp4;

    .line 1230
    .line 1231
    const-string v10, "onCopyClick"

    .line 1232
    .line 1233
    const-string v11, "onCopyClick(Lorg/xplatform/authenticator/impl/ui/fragments/authenticator/models/AuthenticatorActiveUiItem;)V"

    .line 1234
    .line 1235
    move-object v8, v3

    .line 1236
    invoke-direct/range {v6 .. v13}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v14, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    move-object v2, v6

    .line 1243
    :cond_2e
    check-cast v2, La/jhy;

    .line 1244
    .line 1245
    move-object v11, v2

    .line 1246
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 1247
    .line 1248
    invoke-virtual {v14, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    if-nez v1, :cond_2f

    .line 1257
    .line 1258
    if-ne v2, v5, :cond_30

    .line 1259
    .line 1260
    :cond_2f
    new-instance v1, La/f8;

    .line 1261
    .line 1262
    const/4 v7, 0x0

    .line 1263
    const/16 v8, 0x11

    .line 1264
    .line 1265
    const/4 v2, 0x0

    .line 1266
    const-class v4, La/qp4;

    .line 1267
    .line 1268
    const-string v5, "showOptions"

    .line 1269
    .line 1270
    const-string v6, "showOptions()V"

    .line 1271
    .line 1272
    invoke-direct/range {v1 .. v8}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    move-object v2, v1

    .line 1279
    :cond_30
    check-cast v2, La/jhy;

    .line 1280
    .line 1281
    move-object v12, v2

    .line 1282
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 1283
    .line 1284
    sget-object v1, La/ku4;->J:La/qq4;

    .line 1285
    .line 1286
    const/16 v15, 0x8

    .line 1287
    .line 1288
    const/4 v13, 0x0

    .line 1289
    move-object v10, v0

    .line 1290
    invoke-static/range {v10 .. v15}, La/knx;->h(La/ku4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/mm40;La/fet;I)V

    .line 1291
    .line 1292
    .line 1293
    goto :goto_12

    .line 1294
    :cond_31
    invoke-virtual {v14}, La/fet;->X()V

    .line 1295
    .line 1296
    .line 1297
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    return-object v0

    .line 1300
    :pswitch_10
    move-object v11, v10

    .line 1301
    check-cast v11, La/cp4;

    .line 1302
    .line 1303
    iget-object v0, v11, La/cp4;->O1:La/a8z;

    .line 1304
    .line 1305
    move-object/from16 v1, p1

    .line 1306
    .line 1307
    check-cast v1, La/fet;

    .line 1308
    .line 1309
    move-object/from16 v2, p2

    .line 1310
    .line 1311
    check-cast v2, Ljava/lang/Integer;

    .line 1312
    .line 1313
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1314
    .line 1315
    .line 1316
    move-result v2

    .line 1317
    sget-object v3, La/cp4;->P1:La/gfk0;

    .line 1318
    .line 1319
    and-int/lit8 v3, v2, 0x3

    .line 1320
    .line 1321
    if-eq v3, v9, :cond_32

    .line 1322
    .line 1323
    move v3, v7

    .line 1324
    goto :goto_13

    .line 1325
    :cond_32
    move v3, v8

    .line 1326
    :goto_13
    and-int/2addr v2, v7

    .line 1327
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v2

    .line 1331
    if-eqz v2, :cond_39

    .line 1332
    .line 1333
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v2

    .line 1337
    check-cast v2, La/k3t0;

    .line 1338
    .line 1339
    check-cast v2, La/i3t0;

    .line 1340
    .line 1341
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v3

    .line 1349
    check-cast v3, La/k3t0;

    .line 1350
    .line 1351
    invoke-virtual {v1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v4

    .line 1355
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v7

    .line 1359
    if-nez v4, :cond_33

    .line 1360
    .line 1361
    if-ne v7, v5, :cond_34

    .line 1362
    .line 1363
    :cond_33
    new-instance v9, La/j94;

    .line 1364
    .line 1365
    const/4 v15, 0x0

    .line 1366
    const/16 v16, 0x8

    .line 1367
    .line 1368
    const/4 v10, 0x1

    .line 1369
    const-class v12, La/cp4;

    .line 1370
    .line 1371
    const-string v13, "handleSideEffect"

    .line 1372
    .line 1373
    const-string v14, "handleSideEffect(Lorg/xplatform/authenticator/impl/ui/models/AuthHistorySideEffects;)V"

    .line 1374
    .line 1375
    invoke-direct/range {v9 .. v16}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1379
    .line 1380
    .line 1381
    move-object v7, v9

    .line 1382
    :cond_34
    check-cast v7, La/jhy;

    .line 1383
    .line 1384
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1385
    .line 1386
    sget-object v4, La/or00;->a:La/zfn;

    .line 1387
    .line 1388
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v4

    .line 1392
    move-object v14, v4

    .line 1393
    check-cast v14, La/clz;

    .line 1394
    .line 1395
    sget-object v4, La/lkz;->a:La/lkz;

    .line 1396
    .line 1397
    invoke-static {v7, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v15

    .line 1401
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v4

    .line 1405
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1406
    .line 1407
    .line 1408
    move-result v7

    .line 1409
    or-int/2addr v4, v7

    .line 1410
    invoke-virtual {v1, v6}, La/fet;->e(I)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v6

    .line 1414
    or-int/2addr v4, v6

    .line 1415
    invoke-virtual {v1, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v6

    .line 1419
    or-int/2addr v4, v6

    .line 1420
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v6

    .line 1424
    if-nez v4, :cond_35

    .line 1425
    .line 1426
    if-ne v6, v5, :cond_36

    .line 1427
    .line 1428
    :cond_35
    new-instance v12, La/pc;

    .line 1429
    .line 1430
    const/16 v16, 0x0

    .line 1431
    .line 1432
    const/16 v17, 0x2

    .line 1433
    .line 1434
    move-object v13, v3

    .line 1435
    invoke-direct/range {v12 .. v17}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1439
    .line 1440
    .line 1441
    move-object v6, v12

    .line 1442
    :cond_36
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 1443
    .line 1444
    invoke-static {v1, v14, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1445
    .line 1446
    .line 1447
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    move-object v11, v0

    .line 1452
    check-cast v11, La/k3t0;

    .line 1453
    .line 1454
    invoke-virtual {v1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v0

    .line 1458
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    if-nez v0, :cond_37

    .line 1463
    .line 1464
    if-ne v3, v5, :cond_38

    .line 1465
    .line 1466
    :cond_37
    new-instance v9, La/j94;

    .line 1467
    .line 1468
    const/4 v15, 0x0

    .line 1469
    const/16 v16, 0x9

    .line 1470
    .line 1471
    const/4 v10, 0x1

    .line 1472
    const-class v12, La/k3t0;

    .line 1473
    .line 1474
    const-string v13, "onAction"

    .line 1475
    .line 1476
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 1477
    .line 1478
    invoke-direct/range {v9 .. v16}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    move-object v3, v9

    .line 1485
    :cond_38
    check-cast v3, La/jhy;

    .line 1486
    .line 1487
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1488
    .line 1489
    invoke-static {v2, v3, v1, v8}, La/ahy;->e(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1490
    .line 1491
    .line 1492
    goto :goto_14

    .line 1493
    :cond_39
    invoke-virtual {v1}, La/fet;->X()V

    .line 1494
    .line 1495
    .line 1496
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1497
    .line 1498
    return-object v0

    .line 1499
    :pswitch_11
    check-cast v10, La/il4;

    .line 1500
    .line 1501
    move-object/from16 v0, p1

    .line 1502
    .line 1503
    check-cast v0, Ljava/lang/Throwable;

    .line 1504
    .line 1505
    move-object/from16 v1, p2

    .line 1506
    .line 1507
    check-cast v1, Ljava/lang/String;

    .line 1508
    .line 1509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1513
    .line 1514
    .line 1515
    iget-object v0, v10, La/il4;->h:La/p7m0;

    .line 1516
    .line 1517
    new-instance v2, La/zk4;

    .line 1518
    .line 1519
    invoke-direct {v2, v1}, La/zk4;-><init>(Ljava/lang/String;)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v0, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1529
    .line 1530
    return-object v0

    .line 1531
    :pswitch_12
    check-cast v10, La/hl4;

    .line 1532
    .line 1533
    move-object/from16 v0, p1

    .line 1534
    .line 1535
    check-cast v0, Ljava/lang/Throwable;

    .line 1536
    .line 1537
    move-object/from16 v1, p2

    .line 1538
    .line 1539
    check-cast v1, Ljava/lang/String;

    .line 1540
    .line 1541
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1545
    .line 1546
    .line 1547
    iget-object v0, v10, La/hl4;->h:La/p7m0;

    .line 1548
    .line 1549
    new-instance v2, La/yk4;

    .line 1550
    .line 1551
    invoke-direct {v2, v1}, La/yk4;-><init>(Ljava/lang/String;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v0, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1561
    .line 1562
    return-object v0

    .line 1563
    :pswitch_13
    move-object v11, v10

    .line 1564
    check-cast v11, La/b84;

    .line 1565
    .line 1566
    move-object/from16 v0, p1

    .line 1567
    .line 1568
    check-cast v0, La/fet;

    .line 1569
    .line 1570
    move-object/from16 v1, p2

    .line 1571
    .line 1572
    check-cast v1, Ljava/lang/Integer;

    .line 1573
    .line 1574
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1575
    .line 1576
    .line 1577
    move-result v1

    .line 1578
    sget-object v2, La/b84;->P1:La/gfk0;

    .line 1579
    .line 1580
    and-int/lit8 v2, v1, 0x3

    .line 1581
    .line 1582
    if-eq v2, v9, :cond_3a

    .line 1583
    .line 1584
    move v2, v7

    .line 1585
    goto :goto_15

    .line 1586
    :cond_3a
    move v2, v8

    .line 1587
    :goto_15
    and-int/2addr v1, v7

    .line 1588
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v1

    .line 1592
    if-eqz v1, :cond_41

    .line 1593
    .line 1594
    invoke-virtual {v11}, La/b84;->G0()La/k3t0;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v1

    .line 1598
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v2

    .line 1602
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v3

    .line 1606
    if-nez v2, :cond_3b

    .line 1607
    .line 1608
    if-ne v3, v5, :cond_3c

    .line 1609
    .line 1610
    :cond_3b
    new-instance v9, La/bk2;

    .line 1611
    .line 1612
    const/4 v15, 0x0

    .line 1613
    const/16 v16, 0x1b

    .line 1614
    .line 1615
    const/4 v10, 0x1

    .line 1616
    const-class v12, La/b84;

    .line 1617
    .line 1618
    const-string v13, "handleSideEffect"

    .line 1619
    .line 1620
    const-string v14, "handleSideEffect(Lorg/xplatform/auth_history/impl/presentation/models/AuthHistorySideEffect;)V"

    .line 1621
    .line 1622
    invoke-direct/range {v9 .. v16}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1626
    .line 1627
    .line 1628
    move-object v3, v9

    .line 1629
    :cond_3c
    check-cast v3, La/jhy;

    .line 1630
    .line 1631
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1632
    .line 1633
    sget-object v2, La/lkz;->a:La/lkz;

    .line 1634
    .line 1635
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v12

    .line 1639
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v2

    .line 1643
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v3

    .line 1647
    or-int/2addr v2, v3

    .line 1648
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v3

    .line 1652
    or-int/2addr v2, v3

    .line 1653
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v3

    .line 1657
    or-int/2addr v2, v3

    .line 1658
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v3

    .line 1662
    if-nez v2, :cond_3d

    .line 1663
    .line 1664
    if-ne v3, v5, :cond_3e

    .line 1665
    .line 1666
    :cond_3d
    new-instance v9, La/l10;

    .line 1667
    .line 1668
    const/4 v13, 0x0

    .line 1669
    const/16 v14, 0x17

    .line 1670
    .line 1671
    move-object v10, v1

    .line 1672
    invoke-direct/range {v9 .. v14}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1676
    .line 1677
    .line 1678
    move-object v3, v9

    .line 1679
    :cond_3e
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 1680
    .line 1681
    invoke-static {v0, v11, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v11}, La/b84;->G0()La/k3t0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    check-cast v1, La/i3t0;

    .line 1689
    .line 1690
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v1

    .line 1694
    iget-object v2, v11, La/b84;->K1:La/cgx0;

    .line 1695
    .line 1696
    sget-object v3, La/b84;->Q1:[La/iiy;

    .line 1697
    .line 1698
    aget-object v3, v3, v8

    .line 1699
    .line 1700
    invoke-virtual {v2, v11, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v2

    .line 1704
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1705
    .line 1706
    .line 1707
    move-result v2

    .line 1708
    invoke-virtual {v11}, La/b84;->G0()La/k3t0;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v14

    .line 1712
    invoke-virtual {v0, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v3

    .line 1716
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v4

    .line 1720
    if-nez v3, :cond_3f

    .line 1721
    .line 1722
    if-ne v4, v5, :cond_40

    .line 1723
    .line 1724
    :cond_3f
    new-instance v12, La/bk2;

    .line 1725
    .line 1726
    const/16 v18, 0x0

    .line 1727
    .line 1728
    const/16 v19, 0x1c

    .line 1729
    .line 1730
    const/4 v13, 0x1

    .line 1731
    const-class v15, La/k3t0;

    .line 1732
    .line 1733
    const-string v16, "onAction"

    .line 1734
    .line 1735
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 1736
    .line 1737
    invoke-direct/range {v12 .. v19}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1741
    .line 1742
    .line 1743
    move-object v4, v12

    .line 1744
    :cond_40
    check-cast v4, La/jhy;

    .line 1745
    .line 1746
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 1747
    .line 1748
    invoke-static {v1, v2, v4, v0, v8}, La/tke;->j(La/l7m0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1749
    .line 1750
    .line 1751
    goto :goto_16

    .line 1752
    :cond_41
    invoke-virtual {v0}, La/fet;->X()V

    .line 1753
    .line 1754
    .line 1755
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1756
    .line 1757
    return-object v0

    .line 1758
    :pswitch_14
    check-cast v10, La/q93;

    .line 1759
    .line 1760
    move-object/from16 v0, p1

    .line 1761
    .line 1762
    check-cast v0, La/fet;

    .line 1763
    .line 1764
    move-object/from16 v1, p2

    .line 1765
    .line 1766
    check-cast v1, Ljava/lang/Integer;

    .line 1767
    .line 1768
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1769
    .line 1770
    .line 1771
    move-result v1

    .line 1772
    sget-object v2, La/q93;->Q1:La/pek0;

    .line 1773
    .line 1774
    and-int/lit8 v2, v1, 0x3

    .line 1775
    .line 1776
    if-eq v2, v9, :cond_42

    .line 1777
    .line 1778
    move v2, v7

    .line 1779
    goto :goto_17

    .line 1780
    :cond_42
    move v2, v8

    .line 1781
    :goto_17
    and-int/2addr v1, v7

    .line 1782
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v1

    .line 1786
    if-eqz v1, :cond_45

    .line 1787
    .line 1788
    iget-object v1, v10, La/q93;->M1:La/a8z;

    .line 1789
    .line 1790
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v1

    .line 1794
    check-cast v1, La/k3t0;

    .line 1795
    .line 1796
    check-cast v1, La/i3t0;

    .line 1797
    .line 1798
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v2

    .line 1806
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v3

    .line 1810
    if-nez v2, :cond_43

    .line 1811
    .line 1812
    if-ne v3, v5, :cond_44

    .line 1813
    .line 1814
    :cond_43
    new-instance v3, La/b33;

    .line 1815
    .line 1816
    invoke-direct {v3, v10, v9}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1820
    .line 1821
    .line 1822
    :cond_44
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1823
    .line 1824
    invoke-static {v1, v3, v0, v8}, La/kc5;->L(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1825
    .line 1826
    .line 1827
    goto :goto_18

    .line 1828
    :cond_45
    invoke-virtual {v0}, La/fet;->X()V

    .line 1829
    .line 1830
    .line 1831
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1832
    .line 1833
    return-object v0

    .line 1834
    :pswitch_15
    check-cast v10, La/v4i0;

    .line 1835
    .line 1836
    move-object/from16 v0, p1

    .line 1837
    .line 1838
    check-cast v0, Landroid/graphics/RectF;

    .line 1839
    .line 1840
    move-object/from16 v1, p2

    .line 1841
    .line 1842
    check-cast v1, Landroid/graphics/RectF;

    .line 1843
    .line 1844
    invoke-static {v0}, La/e9x;->Y(Landroid/graphics/RectF;)La/jge0;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    invoke-static {v1}, La/e9x;->Y(Landroid/graphics/RectF;)La/jge0;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v1

    .line 1852
    iget-byte v2, v10, La/v4i0;->a:B

    .line 1853
    .line 1854
    packed-switch v2, :pswitch_data_1

    .line 1855
    .line 1856
    .line 1857
    invoke-virtual {v0}, La/jge0;->e()J

    .line 1858
    .line 1859
    .line 1860
    move-result-wide v2

    .line 1861
    invoke-virtual {v1, v2, v3}, La/jge0;->a(J)Z

    .line 1862
    .line 1863
    .line 1864
    move-result v0

    .line 1865
    goto :goto_19

    .line 1866
    :pswitch_16
    invoke-virtual {v0, v1}, La/jge0;->k(La/jge0;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v0

    .line 1870
    :goto_19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0

    .line 1874
    return-object v0

    .line 1875
    :pswitch_17
    check-cast v10, La/pz40;

    .line 1876
    .line 1877
    move-object/from16 v0, p1

    .line 1878
    .line 1879
    check-cast v0, La/fet;

    .line 1880
    .line 1881
    move-object/from16 v1, p2

    .line 1882
    .line 1883
    check-cast v1, Ljava/lang/Integer;

    .line 1884
    .line 1885
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1886
    .line 1887
    .line 1888
    move-result v1

    .line 1889
    and-int/lit8 v2, v1, 0x3

    .line 1890
    .line 1891
    if-eq v2, v9, :cond_46

    .line 1892
    .line 1893
    move v2, v7

    .line 1894
    goto :goto_1a

    .line 1895
    :cond_46
    move v2, v8

    .line 1896
    :goto_1a
    and-int/2addr v1, v7

    .line 1897
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1898
    .line 1899
    .line 1900
    move-result v1

    .line 1901
    if-eqz v1, :cond_48

    .line 1902
    .line 1903
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v1

    .line 1907
    if-ne v1, v5, :cond_47

    .line 1908
    .line 1909
    new-instance v1, La/sy2;

    .line 1910
    .line 1911
    invoke-direct {v1, v8}, La/sy2;-><init>(B)V

    .line 1912
    .line 1913
    .line 1914
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1915
    .line 1916
    .line 1917
    :cond_47
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1918
    .line 1919
    sget-object v2, La/jm40;->b:La/jm40;

    .line 1920
    .line 1921
    invoke-static {v2, v8, v1}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v1

    .line 1925
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v2

    .line 1929
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 1930
    .line 1931
    invoke-static {v1, v2, v0, v8}, La/y9a;->r(La/mm40;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1932
    .line 1933
    .line 1934
    goto :goto_1b

    .line 1935
    :cond_48
    invoke-virtual {v0}, La/fet;->X()V

    .line 1936
    .line 1937
    .line 1938
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1939
    .line 1940
    return-object v0

    .line 1941
    :pswitch_18
    check-cast v10, La/yn2;

    .line 1942
    .line 1943
    move-object/from16 v0, p1

    .line 1944
    .line 1945
    check-cast v0, Ljava/lang/Throwable;

    .line 1946
    .line 1947
    move-object/from16 v1, p2

    .line 1948
    .line 1949
    check-cast v1, Ljava/lang/String;

    .line 1950
    .line 1951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1952
    .line 1953
    .line 1954
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1958
    .line 1959
    .line 1960
    new-instance v0, La/in2;

    .line 1961
    .line 1962
    invoke-direct {v0, v1}, La/in2;-><init>(Ljava/lang/String;)V

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v10, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1966
    .line 1967
    .line 1968
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1969
    .line 1970
    return-object v0

    .line 1971
    :pswitch_19
    move-object v11, v10

    .line 1972
    check-cast v11, La/ef2;

    .line 1973
    .line 1974
    move-object/from16 v0, p1

    .line 1975
    .line 1976
    check-cast v0, La/fet;

    .line 1977
    .line 1978
    move-object/from16 v1, p2

    .line 1979
    .line 1980
    check-cast v1, Ljava/lang/Integer;

    .line 1981
    .line 1982
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1983
    .line 1984
    .line 1985
    move-result v1

    .line 1986
    sget-object v3, La/ef2;->V1:La/hfk0;

    .line 1987
    .line 1988
    and-int/lit8 v3, v1, 0x3

    .line 1989
    .line 1990
    if-eq v3, v9, :cond_49

    .line 1991
    .line 1992
    move v3, v7

    .line 1993
    goto :goto_1c

    .line 1994
    :cond_49
    move v3, v8

    .line 1995
    :goto_1c
    and-int/2addr v1, v7

    .line 1996
    invoke-virtual {v0, v1, v3}, La/fet;->U(IZ)Z

    .line 1997
    .line 1998
    .line 1999
    move-result v1

    .line 2000
    if-eqz v1, :cond_5b

    .line 2001
    .line 2002
    invoke-virtual {v11}, La/ef2;->L0()La/k3t0;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v1

    .line 2006
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2007
    .line 2008
    .line 2009
    move-result v3

    .line 2010
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v4

    .line 2014
    if-nez v3, :cond_4a

    .line 2015
    .line 2016
    if-ne v4, v5, :cond_4b

    .line 2017
    .line 2018
    :cond_4a
    new-instance v9, La/ln1;

    .line 2019
    .line 2020
    const/4 v15, 0x0

    .line 2021
    const/16 v16, 0x18

    .line 2022
    .line 2023
    const/4 v10, 0x1

    .line 2024
    const-class v12, La/ef2;

    .line 2025
    .line 2026
    const-string v13, "handleSideEffect"

    .line 2027
    .line 2028
    const-string v14, "handleSideEffect(Lorg/xplatform/results/impl/presentation/screen/alt/models/AltResultsSideEffect;)V"

    .line 2029
    .line 2030
    invoke-direct/range {v9 .. v16}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2031
    .line 2032
    .line 2033
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2034
    .line 2035
    .line 2036
    move-object v4, v9

    .line 2037
    :cond_4b
    check-cast v4, La/jhy;

    .line 2038
    .line 2039
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 2040
    .line 2041
    sget-object v3, La/lkz;->a:La/lkz;

    .line 2042
    .line 2043
    invoke-static {v4, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v12

    .line 2047
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    move-result v3

    .line 2051
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2052
    .line 2053
    .line 2054
    move-result v4

    .line 2055
    or-int/2addr v3, v4

    .line 2056
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 2057
    .line 2058
    .line 2059
    move-result v4

    .line 2060
    or-int/2addr v3, v4

    .line 2061
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2062
    .line 2063
    .line 2064
    move-result v4

    .line 2065
    or-int/2addr v3, v4

    .line 2066
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v4

    .line 2070
    const/4 v13, 0x0

    .line 2071
    if-nez v3, :cond_4d

    .line 2072
    .line 2073
    if-ne v4, v5, :cond_4c

    .line 2074
    .line 2075
    goto :goto_1d

    .line 2076
    :cond_4c
    move-object v1, v13

    .line 2077
    goto :goto_1e

    .line 2078
    :cond_4d
    :goto_1d
    new-instance v9, La/l10;

    .line 2079
    .line 2080
    const/16 v14, 0x13

    .line 2081
    .line 2082
    move-object v10, v1

    .line 2083
    invoke-direct/range {v9 .. v14}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2084
    .line 2085
    .line 2086
    move-object v1, v13

    .line 2087
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2088
    .line 2089
    .line 2090
    move-object v4, v9

    .line 2091
    :goto_1e
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 2092
    .line 2093
    invoke-static {v0, v11, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v11}, La/ef2;->K0()La/k3t0;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v3

    .line 2100
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2101
    .line 2102
    .line 2103
    move-result v4

    .line 2104
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v7

    .line 2108
    if-nez v4, :cond_4e

    .line 2109
    .line 2110
    if-ne v7, v5, :cond_4f

    .line 2111
    .line 2112
    :cond_4e
    new-instance v9, La/ln1;

    .line 2113
    .line 2114
    const/4 v15, 0x0

    .line 2115
    const/16 v16, 0x19

    .line 2116
    .line 2117
    const/4 v10, 0x1

    .line 2118
    const-class v12, La/ef2;

    .line 2119
    .line 2120
    const-string v13, "handleSideEffectLive"

    .line 2121
    .line 2122
    const-string v14, "handleSideEffectLive(Lorg/xplatform/results/impl/presentation/alt_live/models/AltLiveResultsSideEffect;)V"

    .line 2123
    .line 2124
    invoke-direct/range {v9 .. v16}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2125
    .line 2126
    .line 2127
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2128
    .line 2129
    .line 2130
    move-object v7, v9

    .line 2131
    :cond_4f
    check-cast v7, La/jhy;

    .line 2132
    .line 2133
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2134
    .line 2135
    invoke-static {v7, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v12

    .line 2139
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2140
    .line 2141
    .line 2142
    move-result v4

    .line 2143
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2144
    .line 2145
    .line 2146
    move-result v7

    .line 2147
    or-int/2addr v4, v7

    .line 2148
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 2149
    .line 2150
    .line 2151
    move-result v7

    .line 2152
    or-int/2addr v4, v7

    .line 2153
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2154
    .line 2155
    .line 2156
    move-result v7

    .line 2157
    or-int/2addr v4, v7

    .line 2158
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v7

    .line 2162
    if-nez v4, :cond_50

    .line 2163
    .line 2164
    if-ne v7, v5, :cond_51

    .line 2165
    .line 2166
    :cond_50
    new-instance v9, La/l10;

    .line 2167
    .line 2168
    const/16 v14, 0x14

    .line 2169
    .line 2170
    move-object v13, v1

    .line 2171
    move-object v10, v3

    .line 2172
    invoke-direct/range {v9 .. v14}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2173
    .line 2174
    .line 2175
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2176
    .line 2177
    .line 2178
    move-object v7, v9

    .line 2179
    :cond_51
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 2180
    .line 2181
    invoke-static {v0, v11, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2182
    .line 2183
    .line 2184
    invoke-virtual {v11}, La/ef2;->J0()La/k3t0;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v3

    .line 2188
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2189
    .line 2190
    .line 2191
    move-result v4

    .line 2192
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v7

    .line 2196
    if-nez v4, :cond_52

    .line 2197
    .line 2198
    if-ne v7, v5, :cond_53

    .line 2199
    .line 2200
    :cond_52
    new-instance v9, La/ln1;

    .line 2201
    .line 2202
    const/4 v15, 0x0

    .line 2203
    const/16 v16, 0x1a

    .line 2204
    .line 2205
    const/4 v10, 0x1

    .line 2206
    const-class v12, La/ef2;

    .line 2207
    .line 2208
    const-string v13, "handleSideEffectHistory"

    .line 2209
    .line 2210
    const-string v14, "handleSideEffectHistory(Lorg/xplatform/results/impl/presentation/alt_history/models/AltHistoryResultsSideEffect;)V"

    .line 2211
    .line 2212
    invoke-direct/range {v9 .. v16}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2213
    .line 2214
    .line 2215
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2216
    .line 2217
    .line 2218
    move-object v7, v9

    .line 2219
    :cond_53
    check-cast v7, La/jhy;

    .line 2220
    .line 2221
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2222
    .line 2223
    invoke-static {v7, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v12

    .line 2227
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2228
    .line 2229
    .line 2230
    move-result v4

    .line 2231
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2232
    .line 2233
    .line 2234
    move-result v7

    .line 2235
    or-int/2addr v4, v7

    .line 2236
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 2237
    .line 2238
    .line 2239
    move-result v6

    .line 2240
    or-int/2addr v4, v6

    .line 2241
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2242
    .line 2243
    .line 2244
    move-result v6

    .line 2245
    or-int/2addr v4, v6

    .line 2246
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2247
    .line 2248
    .line 2249
    move-result-object v6

    .line 2250
    if-nez v4, :cond_54

    .line 2251
    .line 2252
    if-ne v6, v5, :cond_55

    .line 2253
    .line 2254
    :cond_54
    new-instance v9, La/l10;

    .line 2255
    .line 2256
    const/16 v14, 0x15

    .line 2257
    .line 2258
    move-object v13, v1

    .line 2259
    move-object v10, v3

    .line 2260
    invoke-direct/range {v9 .. v14}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2264
    .line 2265
    .line 2266
    move-object v6, v9

    .line 2267
    :cond_55
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 2268
    .line 2269
    invoke-static {v0, v11, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2270
    .line 2271
    .line 2272
    invoke-virtual {v11}, La/ef2;->L0()La/k3t0;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v1

    .line 2276
    check-cast v1, La/i3t0;

    .line 2277
    .line 2278
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v1

    .line 2282
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v1

    .line 2286
    check-cast v1, La/kf2;

    .line 2287
    .line 2288
    iget-object v3, v1, La/kf2;->d:Ljava/util/Map;

    .line 2289
    .line 2290
    sget-object v4, La/b9g0;->d:La/b9g0;

    .line 2291
    .line 2292
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v4

    .line 2296
    check-cast v4, Ljava/lang/String;

    .line 2297
    .line 2298
    if-nez v4, :cond_56

    .line 2299
    .line 2300
    move-object v4, v2

    .line 2301
    :cond_56
    iget-object v6, v11, La/ef2;->R1:La/a8z;

    .line 2302
    .line 2303
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v6

    .line 2307
    check-cast v6, La/k3t0;

    .line 2308
    .line 2309
    new-instance v7, La/l3g0;

    .line 2310
    .line 2311
    invoke-direct {v7, v4}, La/l3g0;-><init>(Ljava/lang/String;)V

    .line 2312
    .line 2313
    .line 2314
    invoke-virtual {v6, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2315
    .line 2316
    .line 2317
    sget-object v4, La/b9g0;->b:La/b9g0;

    .line 2318
    .line 2319
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v4

    .line 2323
    check-cast v4, Ljava/lang/String;

    .line 2324
    .line 2325
    if-nez v4, :cond_57

    .line 2326
    .line 2327
    move-object v4, v2

    .line 2328
    :cond_57
    invoke-virtual {v11}, La/ef2;->J0()La/k3t0;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v6

    .line 2332
    new-instance v7, La/rb2;

    .line 2333
    .line 2334
    invoke-direct {v7, v4}, La/rb2;-><init>(Ljava/lang/String;)V

    .line 2335
    .line 2336
    .line 2337
    invoke-virtual {v6, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2338
    .line 2339
    .line 2340
    sget-object v4, La/b9g0;->c:La/b9g0;

    .line 2341
    .line 2342
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v3

    .line 2346
    check-cast v3, Ljava/lang/String;

    .line 2347
    .line 2348
    if-nez v3, :cond_58

    .line 2349
    .line 2350
    goto :goto_1f

    .line 2351
    :cond_58
    move-object v2, v3

    .line 2352
    :goto_1f
    invoke-virtual {v11}, La/ef2;->K0()La/k3t0;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v3

    .line 2356
    new-instance v4, La/sc2;

    .line 2357
    .line 2358
    invoke-direct {v4, v2}, La/sc2;-><init>(Ljava/lang/String;)V

    .line 2359
    .line 2360
    .line 2361
    invoke-virtual {v3, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2362
    .line 2363
    .line 2364
    iget-boolean v2, v1, La/kf2;->b:Z

    .line 2365
    .line 2366
    invoke-virtual {v11}, La/ef2;->K0()La/k3t0;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v3

    .line 2370
    new-instance v4, La/pc2;

    .line 2371
    .line 2372
    invoke-direct {v4, v2}, La/pc2;-><init>(Z)V

    .line 2373
    .line 2374
    .line 2375
    invoke-virtual {v3, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2376
    .line 2377
    .line 2378
    invoke-virtual {v11}, La/ef2;->J0()La/k3t0;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v3

    .line 2382
    new-instance v4, La/ob2;

    .line 2383
    .line 2384
    invoke-direct {v4, v2}, La/ob2;-><init>(Z)V

    .line 2385
    .line 2386
    .line 2387
    invoke-virtual {v3, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2388
    .line 2389
    .line 2390
    invoke-virtual {v11}, La/ef2;->L0()La/k3t0;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v14

    .line 2394
    invoke-virtual {v0, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2395
    .line 2396
    .line 2397
    move-result v2

    .line 2398
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v3

    .line 2402
    if-nez v2, :cond_59

    .line 2403
    .line 2404
    if-ne v3, v5, :cond_5a

    .line 2405
    .line 2406
    :cond_59
    new-instance v12, La/ln1;

    .line 2407
    .line 2408
    const/16 v18, 0x0

    .line 2409
    .line 2410
    const/16 v19, 0x1b

    .line 2411
    .line 2412
    const/4 v13, 0x1

    .line 2413
    const-class v15, La/k3t0;

    .line 2414
    .line 2415
    const-string v16, "onAction"

    .line 2416
    .line 2417
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 2418
    .line 2419
    invoke-direct/range {v12 .. v19}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2420
    .line 2421
    .line 2422
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2423
    .line 2424
    .line 2425
    move-object v3, v12

    .line 2426
    :cond_5a
    check-cast v3, La/jhy;

    .line 2427
    .line 2428
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2429
    .line 2430
    new-instance v2, La/ze2;

    .line 2431
    .line 2432
    invoke-direct {v2, v11, v8}, La/ze2;-><init>(Ljava/lang/Object;B)V

    .line 2433
    .line 2434
    .line 2435
    const v4, 0x5b27609e

    .line 2436
    .line 2437
    .line 2438
    invoke-static {v4, v2, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v2

    .line 2442
    const/16 v4, 0xc06

    .line 2443
    .line 2444
    invoke-static {v1, v3, v2, v0, v4}, La/cwr0;->f(La/kf2;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 2445
    .line 2446
    .line 2447
    goto :goto_20

    .line 2448
    :cond_5b
    invoke-virtual {v0}, La/fet;->X()V

    .line 2449
    .line 2450
    .line 2451
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2452
    .line 2453
    return-object v0

    .line 2454
    :pswitch_1a
    move-object v0, v10

    .line 2455
    check-cast v0, La/le2;

    .line 2456
    .line 2457
    move-object/from16 v1, p1

    .line 2458
    .line 2459
    check-cast v1, Ljava/lang/Throwable;

    .line 2460
    .line 2461
    move-object/from16 v2, p2

    .line 2462
    .line 2463
    check-cast v2, Ljava/lang/String;

    .line 2464
    .line 2465
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2466
    .line 2467
    .line 2468
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2469
    .line 2470
    .line 2471
    instance-of v3, v1, La/zhi0;

    .line 2472
    .line 2473
    if-eqz v3, :cond_5c

    .line 2474
    .line 2475
    check-cast v1, La/zhi0;

    .line 2476
    .line 2477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2478
    .line 2479
    .line 2480
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 2481
    .line 2482
    sget-object v3, La/i2o;->D2:La/i2o;

    .line 2483
    .line 2484
    if-ne v1, v3, :cond_5c

    .line 2485
    .line 2486
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2487
    .line 2488
    .line 2489
    move-result v1

    .line 2490
    if-lez v1, :cond_5c

    .line 2491
    .line 2492
    new-instance v1, La/ae2;

    .line 2493
    .line 2494
    invoke-direct {v1, v2}, La/ae2;-><init>(Ljava/lang/String;)V

    .line 2495
    .line 2496
    .line 2497
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2498
    .line 2499
    .line 2500
    :cond_5c
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 2501
    .line 2502
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 2503
    .line 2504
    :cond_5d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v2

    .line 2508
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2509
    .line 2510
    .line 2511
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 2512
    .line 2513
    move-object v4, v2

    .line 2514
    check-cast v4, La/ce2;

    .line 2515
    .line 2516
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2517
    .line 2518
    .line 2519
    const/4 v13, 0x0

    .line 2520
    const/16 v14, 0x3ff9

    .line 2521
    .line 2522
    const/4 v5, 0x0

    .line 2523
    const/4 v6, 0x0

    .line 2524
    sget-object v7, La/ihe;->a:La/ihe;

    .line 2525
    .line 2526
    const/4 v8, 0x0

    .line 2527
    const/4 v9, 0x0

    .line 2528
    const/4 v10, 0x0

    .line 2529
    const/4 v11, 0x0

    .line 2530
    const/4 v12, 0x0

    .line 2531
    invoke-static/range {v4 .. v14}, La/ce2;->a(La/ce2;Ljava/lang/String;ZLa/hie;IZLjava/util/List;La/wcb;ZZI)La/ce2;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v3

    .line 2535
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2536
    .line 2537
    .line 2538
    move-result v2

    .line 2539
    if-eqz v2, :cond_5d

    .line 2540
    .line 2541
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2542
    .line 2543
    return-object v0

    .line 2544
    :pswitch_1b
    check-cast v10, La/vd2;

    .line 2545
    .line 2546
    iget-object v0, v10, La/vd2;->N1:La/a8z;

    .line 2547
    .line 2548
    move-object/from16 v15, p1

    .line 2549
    .line 2550
    check-cast v15, La/fet;

    .line 2551
    .line 2552
    move-object/from16 v1, p2

    .line 2553
    .line 2554
    check-cast v1, Ljava/lang/Integer;

    .line 2555
    .line 2556
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2557
    .line 2558
    .line 2559
    move-result v1

    .line 2560
    sget-object v2, La/vd2;->R1:La/gfk0;

    .line 2561
    .line 2562
    and-int/lit8 v2, v1, 0x3

    .line 2563
    .line 2564
    if-eq v2, v9, :cond_5e

    .line 2565
    .line 2566
    move v8, v7

    .line 2567
    :cond_5e
    and-int/2addr v1, v7

    .line 2568
    invoke-virtual {v15, v1, v8}, La/fet;->U(IZ)Z

    .line 2569
    .line 2570
    .line 2571
    move-result v1

    .line 2572
    if-eqz v1, :cond_65

    .line 2573
    .line 2574
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v1

    .line 2578
    check-cast v1, La/k3t0;

    .line 2579
    .line 2580
    invoke-virtual {v15, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2581
    .line 2582
    .line 2583
    move-result v2

    .line 2584
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v3

    .line 2588
    if-nez v2, :cond_60

    .line 2589
    .line 2590
    if-ne v3, v5, :cond_5f

    .line 2591
    .line 2592
    goto :goto_21

    .line 2593
    :cond_5f
    move-object v9, v10

    .line 2594
    goto :goto_22

    .line 2595
    :cond_60
    :goto_21
    new-instance v7, La/ln1;

    .line 2596
    .line 2597
    const/4 v13, 0x0

    .line 2598
    const/16 v14, 0x11

    .line 2599
    .line 2600
    const/4 v8, 0x1

    .line 2601
    move-object v9, v10

    .line 2602
    const-class v10, La/vd2;

    .line 2603
    .line 2604
    const-string v11, "handleSideEffect"

    .line 2605
    .line 2606
    const-string v12, "handleSideEffect(Lorg/xplatform/results/impl/presentation/alt_live_games/models/AltResultLiveGamesSideEffect;)V"

    .line 2607
    .line 2608
    invoke-direct/range {v7 .. v14}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2609
    .line 2610
    .line 2611
    invoke-virtual {v15, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2612
    .line 2613
    .line 2614
    move-object v3, v7

    .line 2615
    :goto_22
    check-cast v3, La/jhy;

    .line 2616
    .line 2617
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2618
    .line 2619
    sget-object v2, La/lkz;->a:La/lkz;

    .line 2620
    .line 2621
    invoke-static {v3, v15}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v2

    .line 2625
    invoke-virtual {v15, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2626
    .line 2627
    .line 2628
    move-result v3

    .line 2629
    invoke-virtual {v15, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2630
    .line 2631
    .line 2632
    move-result v4

    .line 2633
    or-int/2addr v3, v4

    .line 2634
    invoke-virtual {v15, v6}, La/fet;->e(I)Z

    .line 2635
    .line 2636
    .line 2637
    move-result v4

    .line 2638
    or-int/2addr v3, v4

    .line 2639
    invoke-virtual {v15, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2640
    .line 2641
    .line 2642
    move-result v4

    .line 2643
    or-int/2addr v3, v4

    .line 2644
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v4

    .line 2648
    if-nez v3, :cond_61

    .line 2649
    .line 2650
    if-ne v4, v5, :cond_62

    .line 2651
    .line 2652
    :cond_61
    new-instance v6, La/l10;

    .line 2653
    .line 2654
    const/4 v10, 0x0

    .line 2655
    const/16 v11, 0x12

    .line 2656
    .line 2657
    move-object v7, v1

    .line 2658
    move-object v8, v9

    .line 2659
    move-object v9, v2

    .line 2660
    invoke-direct/range {v6 .. v11}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2661
    .line 2662
    .line 2663
    move-object v9, v8

    .line 2664
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2665
    .line 2666
    .line 2667
    move-object v4, v6

    .line 2668
    :cond_62
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 2669
    .line 2670
    invoke-static {v15, v9, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2671
    .line 2672
    .line 2673
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v1

    .line 2677
    check-cast v1, La/k3t0;

    .line 2678
    .line 2679
    check-cast v1, La/i3t0;

    .line 2680
    .line 2681
    invoke-virtual {v1, v15}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v1

    .line 2685
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v1

    .line 2689
    move-object v12, v1

    .line 2690
    check-cast v12, La/fe2;

    .line 2691
    .line 2692
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v0

    .line 2696
    check-cast v0, La/k3t0;

    .line 2697
    .line 2698
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2699
    .line 2700
    .line 2701
    move-result v1

    .line 2702
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v2

    .line 2706
    if-nez v1, :cond_63

    .line 2707
    .line 2708
    if-ne v2, v5, :cond_64

    .line 2709
    .line 2710
    :cond_63
    new-instance v16, La/ln1;

    .line 2711
    .line 2712
    const/16 v22, 0x0

    .line 2713
    .line 2714
    const/16 v23, 0x12

    .line 2715
    .line 2716
    const/16 v17, 0x1

    .line 2717
    .line 2718
    const-class v19, La/k3t0;

    .line 2719
    .line 2720
    const-string v20, "onAction"

    .line 2721
    .line 2722
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 2723
    .line 2724
    move-object/from16 v18, v0

    .line 2725
    .line 2726
    invoke-direct/range {v16 .. v23}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2727
    .line 2728
    .line 2729
    move-object/from16 v2, v16

    .line 2730
    .line 2731
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2732
    .line 2733
    .line 2734
    :cond_64
    check-cast v2, La/jhy;

    .line 2735
    .line 2736
    iget-object v0, v9, La/vd2;->O1:La/a8z;

    .line 2737
    .line 2738
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2739
    .line 2740
    .line 2741
    move-result-object v0

    .line 2742
    move-object v13, v0

    .line 2743
    check-cast v13, La/qdz;

    .line 2744
    .line 2745
    move-object v14, v2

    .line 2746
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 2747
    .line 2748
    const/16 v16, 0x0

    .line 2749
    .line 2750
    const/4 v11, 0x0

    .line 2751
    invoke-static/range {v11 .. v16}, La/rsr0;->b(La/mm40;La/fe2;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2752
    .line 2753
    .line 2754
    goto :goto_23

    .line 2755
    :cond_65
    invoke-virtual {v15}, La/fet;->X()V

    .line 2756
    .line 2757
    .line 2758
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2759
    .line 2760
    return-object v0

    .line 2761
    :pswitch_1c
    move-object v0, v10

    .line 2762
    check-cast v0, La/hd2;

    .line 2763
    .line 2764
    move-object/from16 v1, p1

    .line 2765
    .line 2766
    check-cast v1, Ljava/lang/Throwable;

    .line 2767
    .line 2768
    move-object/from16 v2, p2

    .line 2769
    .line 2770
    check-cast v2, Ljava/lang/String;

    .line 2771
    .line 2772
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2773
    .line 2774
    .line 2775
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2776
    .line 2777
    .line 2778
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 2779
    .line 2780
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 2781
    .line 2782
    :cond_66
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v3

    .line 2786
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2787
    .line 2788
    .line 2789
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 2790
    .line 2791
    move-object v5, v3

    .line 2792
    check-cast v5, La/ad2;

    .line 2793
    .line 2794
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2795
    .line 2796
    .line 2797
    const/4 v12, 0x0

    .line 2798
    const/16 v13, 0xfc7

    .line 2799
    .line 2800
    const/4 v6, 0x0

    .line 2801
    const/4 v7, 0x0

    .line 2802
    const/4 v8, 0x0

    .line 2803
    const/4 v9, 0x0

    .line 2804
    const/4 v10, 0x1

    .line 2805
    const/4 v11, 0x0

    .line 2806
    invoke-static/range {v5 .. v13}, La/ad2;->a(La/ad2;Ljava/util/List;Ljava/util/Set;ZZZZLjava/lang/String;I)La/ad2;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v4

    .line 2810
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2811
    .line 2812
    .line 2813
    move-result v3

    .line 2814
    if-eqz v3, :cond_66

    .line 2815
    .line 2816
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2817
    .line 2818
    .line 2819
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2820
    .line 2821
    return-object v0

    .line 2822
    :pswitch_1d
    check-cast v10, La/ia2;

    .line 2823
    .line 2824
    move-object/from16 v15, p1

    .line 2825
    .line 2826
    check-cast v15, La/fet;

    .line 2827
    .line 2828
    move-object/from16 v0, p2

    .line 2829
    .line 2830
    check-cast v0, Ljava/lang/Integer;

    .line 2831
    .line 2832
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2833
    .line 2834
    .line 2835
    move-result v0

    .line 2836
    sget-object v1, La/ia2;->Q1:La/rek0;

    .line 2837
    .line 2838
    and-int/lit8 v1, v0, 0x3

    .line 2839
    .line 2840
    if-eq v1, v9, :cond_67

    .line 2841
    .line 2842
    move v8, v7

    .line 2843
    :cond_67
    and-int/2addr v0, v7

    .line 2844
    invoke-virtual {v15, v0, v8}, La/fet;->U(IZ)Z

    .line 2845
    .line 2846
    .line 2847
    move-result v0

    .line 2848
    if-eqz v0, :cond_6e

    .line 2849
    .line 2850
    invoke-virtual {v10}, La/ia2;->G0()La/k3t0;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v0

    .line 2854
    invoke-virtual {v15, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2855
    .line 2856
    .line 2857
    move-result v1

    .line 2858
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v2

    .line 2862
    if-nez v1, :cond_69

    .line 2863
    .line 2864
    if-ne v2, v5, :cond_68

    .line 2865
    .line 2866
    goto :goto_24

    .line 2867
    :cond_68
    move-object v9, v10

    .line 2868
    goto :goto_25

    .line 2869
    :cond_69
    :goto_24
    new-instance v7, La/ln1;

    .line 2870
    .line 2871
    const/4 v13, 0x0

    .line 2872
    const/16 v14, 0xe

    .line 2873
    .line 2874
    const/4 v8, 0x1

    .line 2875
    move-object v9, v10

    .line 2876
    const-class v10, La/ia2;

    .line 2877
    .line 2878
    const-string v11, "handleSideEffect"

    .line 2879
    .line 2880
    const-string v12, "handleSideEffect(Lorg/xplatform/results/impl/presentation/alt_result_games/models/AltGamesHistoryResultsSideEffect;)V"

    .line 2881
    .line 2882
    invoke-direct/range {v7 .. v14}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2883
    .line 2884
    .line 2885
    invoke-virtual {v15, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2886
    .line 2887
    .line 2888
    move-object v2, v7

    .line 2889
    :goto_25
    check-cast v2, La/jhy;

    .line 2890
    .line 2891
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2892
    .line 2893
    sget-object v1, La/lkz;->a:La/lkz;

    .line 2894
    .line 2895
    invoke-static {v2, v15}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2896
    .line 2897
    .line 2898
    move-result-object v1

    .line 2899
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2900
    .line 2901
    .line 2902
    move-result v2

    .line 2903
    invoke-virtual {v15, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2904
    .line 2905
    .line 2906
    move-result v3

    .line 2907
    or-int/2addr v2, v3

    .line 2908
    invoke-virtual {v15, v6}, La/fet;->e(I)Z

    .line 2909
    .line 2910
    .line 2911
    move-result v3

    .line 2912
    or-int/2addr v2, v3

    .line 2913
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2914
    .line 2915
    .line 2916
    move-result v3

    .line 2917
    or-int/2addr v2, v3

    .line 2918
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v3

    .line 2922
    if-nez v2, :cond_6a

    .line 2923
    .line 2924
    if-ne v3, v5, :cond_6b

    .line 2925
    .line 2926
    :cond_6a
    new-instance v6, La/l10;

    .line 2927
    .line 2928
    const/4 v10, 0x0

    .line 2929
    const/16 v11, 0x11

    .line 2930
    .line 2931
    move-object v7, v0

    .line 2932
    move-object v8, v9

    .line 2933
    move-object v9, v1

    .line 2934
    invoke-direct/range {v6 .. v11}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2935
    .line 2936
    .line 2937
    move-object v9, v8

    .line 2938
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2939
    .line 2940
    .line 2941
    move-object v3, v6

    .line 2942
    :cond_6b
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 2943
    .line 2944
    invoke-static {v15, v9, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2945
    .line 2946
    .line 2947
    invoke-virtual {v9}, La/ia2;->G0()La/k3t0;

    .line 2948
    .line 2949
    .line 2950
    move-result-object v0

    .line 2951
    check-cast v0, La/i3t0;

    .line 2952
    .line 2953
    invoke-virtual {v0, v15}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2954
    .line 2955
    .line 2956
    move-result-object v0

    .line 2957
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2958
    .line 2959
    .line 2960
    move-result-object v0

    .line 2961
    move-object v12, v0

    .line 2962
    check-cast v12, La/bb2;

    .line 2963
    .line 2964
    iget-object v0, v9, La/ia2;->L1:La/a8z;

    .line 2965
    .line 2966
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v0

    .line 2970
    move-object v13, v0

    .line 2971
    check-cast v13, La/qdz;

    .line 2972
    .line 2973
    invoke-virtual {v9}, La/ia2;->G0()La/k3t0;

    .line 2974
    .line 2975
    .line 2976
    move-result-object v0

    .line 2977
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2978
    .line 2979
    .line 2980
    move-result v1

    .line 2981
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v2

    .line 2985
    if-nez v1, :cond_6c

    .line 2986
    .line 2987
    if-ne v2, v5, :cond_6d

    .line 2988
    .line 2989
    :cond_6c
    new-instance v16, La/ln1;

    .line 2990
    .line 2991
    const/16 v22, 0x0

    .line 2992
    .line 2993
    const/16 v23, 0xf

    .line 2994
    .line 2995
    const/16 v17, 0x1

    .line 2996
    .line 2997
    const-class v19, La/k3t0;

    .line 2998
    .line 2999
    const-string v20, "onAction"

    .line 3000
    .line 3001
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 3002
    .line 3003
    move-object/from16 v18, v0

    .line 3004
    .line 3005
    invoke-direct/range {v16 .. v23}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 3006
    .line 3007
    .line 3008
    move-object/from16 v2, v16

    .line 3009
    .line 3010
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 3011
    .line 3012
    .line 3013
    :cond_6d
    check-cast v2, La/jhy;

    .line 3014
    .line 3015
    move-object v14, v2

    .line 3016
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 3017
    .line 3018
    const/16 v16, 0x0

    .line 3019
    .line 3020
    const/4 v11, 0x0

    .line 3021
    invoke-static/range {v11 .. v16}, La/bsr0;->b(La/mm40;La/bb2;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 3022
    .line 3023
    .line 3024
    goto :goto_26

    .line 3025
    :cond_6e
    invoke-virtual {v15}, La/fet;->X()V

    .line 3026
    .line 3027
    .line 3028
    :goto_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3029
    .line 3030
    return-object v0

    .line 3031
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    :pswitch_data_1
    .packed-switch 0xb
        :pswitch_16
    .end packed-switch
.end method
