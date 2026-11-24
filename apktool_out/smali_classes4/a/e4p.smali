.class public final synthetic La/e4p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/e4p;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p0, p0, La/e4p;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/sjd;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, La/ump;

    .line 14
    .line 15
    invoke-direct {p0, p1}, La/ump;-><init>(La/sjd;)V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, La/grq;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p0, p1, La/grq;->a:I

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p1, La/grq;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget p0, p1, La/grq;->a:I

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p1, La/zs2;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p1, La/zs2;->a:Ljava/lang/String;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_3
    check-cast p1, La/zs2;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p1, La/zs2;->a:Ljava/lang/String;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_4
    check-cast p1, La/zs2;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object p0, p1, La/zs2;->a:Ljava/lang/String;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_5
    check-cast p1, La/tn60;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance p0, La/rct;

    .line 73
    .line 74
    invoke-direct {p0, p1}, La/rct;-><init>(La/tn60;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_6
    check-cast p1, Ljava/lang/Long;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_7
    sget-object p0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    instance-of p0, p1, La/b0s;

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_8
    check-cast p1, La/abi0;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_9
    check-cast p1, La/abi0;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_a
    check-cast p1, La/abi0;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_b
    check-cast p1, La/sjd;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    new-instance p0, La/yc80;

    .line 131
    .line 132
    invoke-direct {p0, p1}, La/yc80;-><init>(La/sjd;)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_d
    check-cast p1, La/tn60;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance p0, La/zc80;

    .line 153
    .line 154
    invoke-direct {p0, p1}, La/zc80;-><init>(La/tn60;)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_e
    instance-of p0, p1, La/b0s;

    .line 159
    .line 160
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :pswitch_f
    check-cast p1, La/ofp;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p0, p1, La/ofp;->a:Ljava/lang/String;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_10
    check-cast p1, La/ofp;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object p0, p1, La/ofp;->a:Ljava/lang/String;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_11
    check-cast p1, La/ofp;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object p0, p1, La/ofp;->a:Ljava/lang/String;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_12
    check-cast p1, La/zia;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_13
    check-cast p1, La/fee;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    check-cast p0, Ljava/util/Collection;

    .line 207
    .line 208
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    xor-int/2addr p0, v1

    .line 213
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_15
    check-cast p1, La/cp;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance p0, La/bb;

    .line 235
    .line 236
    const/4 v0, 0x4

    .line 237
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 241
    .line 242
    .line 243
    new-instance p0, La/bb;

    .line 244
    .line 245
    const/4 v0, 0x5

    .line 246
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p0}, La/cp;->y(Lkotlin/jvm/functions/Function0;)V

    .line 250
    .line 251
    .line 252
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    new-instance v0, La/imm;

    .line 261
    .line 262
    new-instance v1, La/ilm;

    .line 263
    .line 264
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 265
    .line 266
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 271
    .line 272
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v2

    .line 276
    invoke-direct {v1, v2, v3}, La/ilm;-><init>(J)V

    .line 277
    .line 278
    .line 279
    new-instance v2, La/plm;

    .line 280
    .line 281
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 286
    .line 287
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 288
    .line 289
    .line 290
    move-result-wide v3

    .line 291
    sget-object p0, La/fa50;->a:La/fa50;

    .line 292
    .line 293
    invoke-direct {v2, p1, v3, v4, p0}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 294
    .line 295
    .line 296
    new-instance v3, La/dmm;

    .line 297
    .line 298
    new-instance p0, La/ta50;

    .line 299
    .line 300
    new-instance v4, La/wkm;

    .line 301
    .line 302
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 307
    .line 308
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v9

    .line 312
    const/4 v5, 0x0

    .line 313
    const v6, 0x7f0809ee

    .line 314
    .line 315
    .line 316
    const/4 v7, 0x1

    .line 317
    sget-object v8, La/ra50;->a:La/ra50;

    .line 318
    .line 319
    invoke-direct/range {v4 .. v10}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 320
    .line 321
    .line 322
    invoke-direct {p0, v4}, La/ta50;-><init>(La/wkm;)V

    .line 323
    .line 324
    .line 325
    invoke-direct {v3, p0}, La/dmm;-><init>(La/wa50;)V

    .line 326
    .line 327
    .line 328
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 333
    .line 334
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 335
    .line 336
    .line 337
    move-result-wide v4

    .line 338
    const/4 v6, 0x1

    .line 339
    const/4 v7, 0x0

    .line 340
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 341
    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    if-eqz p0, :cond_0

    .line 351
    .line 352
    goto :goto_0

    .line 353
    :cond_0
    move v0, v1

    .line 354
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    return-object p0

    .line 359
    :pswitch_18
    check-cast p1, La/cp;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    new-instance p0, La/bb;

    .line 365
    .line 366
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, p0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 370
    .line 371
    .line 372
    new-instance p0, La/bb;

    .line 373
    .line 374
    const/4 v0, 0x3

    .line 375
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, p0}, La/cp;->y(Lkotlin/jvm/functions/Function0;)V

    .line 379
    .line 380
    .line 381
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_19
    check-cast p1, La/sjd;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance p0, La/b5p;

    .line 390
    .line 391
    invoke-direct {p0, p1}, La/b5p;-><init>(La/sjd;)V

    .line 392
    .line 393
    .line 394
    return-object p0

    .line 395
    :pswitch_1a
    check-cast p1, La/bem;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_1b
    check-cast p1, La/cp;

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_1c
    check-cast p1, Ljava/util/List;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object p0

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
.end method
