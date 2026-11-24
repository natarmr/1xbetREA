.class public final synthetic La/t13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/xyl;Ljava/util/List;ZLjava/lang/Integer;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput-byte v0, p0, La/t13;->a:B

    sget-object v0, La/wxl;->j:La/wxl;

    sget-object v0, La/uyl;->a:La/uyl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t13;->c:Ljava/lang/Object;

    iput-object p2, p0, La/t13;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/t13;->b:Z

    iput-object p4, p0, La/t13;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/t13;->a:B

    iput-object p1, p0, La/t13;->c:Ljava/lang/Object;

    iput-object p2, p0, La/t13;->d:Ljava/lang/Object;

    iput-object p3, p0, La/t13;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/t13;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/t13;->a:B

    iput-object p1, p0, La/t13;->c:Ljava/lang/Object;

    iput-object p2, p0, La/t13;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/t13;->b:Z

    iput-object p4, p0, La/t13;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p5, p0, La/t13;->a:B

    iput-object p1, p0, La/t13;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/t13;->b:Z

    iput-object p3, p0, La/t13;->d:Ljava/lang/Object;

    iput-object p4, p0, La/t13;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 5
    iput-byte p5, p0, La/t13;->a:B

    iput-boolean p1, p0, La/t13;->b:Z

    iput-object p2, p0, La/t13;->c:Ljava/lang/Object;

    iput-object p3, p0, La/t13;->d:Ljava/lang/Object;

    iput-object p4, p0, La/t13;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t13;->a:B

    .line 4
    .line 5
    const/16 v5, 0x14

    .line 6
    .line 7
    const/16 v6, 0xa

    .line 8
    .line 9
    const/4 v7, 0x5

    .line 10
    const v9, 0x799532c4

    .line 11
    .line 12
    .line 13
    const/16 v10, 0x9

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/high16 v13, 0x3f800000    # 1.0f

    .line 17
    .line 18
    const/4 v14, 0x0

    .line 19
    const/4 v15, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    iget-boolean v3, v0, La/t13;->b:Z

    .line 22
    .line 23
    iget-object v12, v0, La/t13;->e:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v8, v0, La/t13;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v4, v0, La/t13;->c:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v4, La/og00;

    .line 33
    .line 34
    check-cast v8, Ljava/lang/String;

    .line 35
    .line 36
    check-cast v12, La/nqv0;

    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, Ljava/lang/Throwable;

    .line 41
    .line 42
    instance-of v1, v0, La/eqv0;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    check-cast v0, La/eqv0;

    .line 47
    .line 48
    iget v0, v0, La/eqv0;->a:I

    .line 49
    .line 50
    iget-object v1, v4, La/og00;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    .line 52
    const/16 v2, -0x100

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 55
    .line 56
    .line 57
    :cond_0
    if-eqz v3, :cond_8

    .line 58
    .line 59
    if-eqz v8, :cond_8

    .line 60
    .line 61
    iget-object v0, v12, La/nqv0;->a:La/ppv0;

    .line 62
    .line 63
    invoke-virtual {v0}, La/ppv0;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v2, 0x1d

    .line 70
    .line 71
    const/16 v3, 0x7f

    .line 72
    .line 73
    if-lt v1, v2, :cond_2

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-gt v1, v3, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v8, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    :goto_0
    invoke-static {v0, v8}, La/sf3;->e(ILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-gt v1, v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-virtual {v8, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    :goto_1
    const-string v1, "asyncTraceEnd"

    .line 102
    .line 103
    :try_start_0
    sget-object v2, La/afn0;->d:Ljava/lang/reflect/Method;

    .line 104
    .line 105
    if-nez v2, :cond_4

    .line 106
    .line 107
    const-class v2, Landroid/os/Trace;

    .line 108
    .line 109
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 110
    .line 111
    const-class v4, Ljava/lang/String;

    .line 112
    .line 113
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    filled-new-array {v3, v4, v5}, [Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    sput-object v2, La/afn0;->d:Ljava/lang/reflect/Method;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catch_0
    move-exception v0

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    :goto_2
    if-eqz v2, :cond_5

    .line 129
    .line 130
    sget-wide v3, La/afn0;->a:J

    .line 131
    .line 132
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    filled-new-array {v1, v8, v0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v2, v15, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    const-string v0, "Required value was null."

    .line 149
    .line 150
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 157
    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 167
    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_6
    throw v0

    .line 175
    :cond_7
    const-string v1, "Trace"

    .line 176
    .line 177
    const-string v2, "Unable to call asyncTraceEnd via reflection"

    .line 178
    .line 179
    invoke-static {v1, v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 180
    .line 181
    .line 182
    :cond_8
    :goto_4
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    :goto_5
    return-object v15

    .line 185
    :pswitch_0
    check-cast v4, La/ngj0;

    .line 186
    .line 187
    check-cast v8, Ljava/lang/String;

    .line 188
    .line 189
    check-cast v12, Ljava/lang/String;

    .line 190
    .line 191
    move-object/from16 v0, p1

    .line 192
    .line 193
    check-cast v0, La/k0w0;

    .line 194
    .line 195
    iget-object v1, v4, La/ngj0;->G0:La/rek0;

    .line 196
    .line 197
    new-instance v2, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 198
    .line 199
    invoke-direct {v2, v8, v3, v12}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v1, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 206
    .line 207
    invoke-direct {v1, v2}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 211
    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_1
    check-cast v4, Lorg/xplatform/settings/impl/presentation/a;

    .line 217
    .line 218
    check-cast v8, Ljava/lang/String;

    .line 219
    .line 220
    check-cast v12, Ljava/lang/String;

    .line 221
    .line 222
    move-object/from16 v0, p1

    .line 223
    .line 224
    check-cast v0, La/k0w0;

    .line 225
    .line 226
    iget-object v1, v4, Lorg/xplatform/settings/impl/presentation/a;->t0:La/rek0;

    .line 227
    .line 228
    new-instance v2, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 229
    .line 230
    invoke-direct {v2, v8, v3, v12}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v1, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 237
    .line 238
    invoke-direct {v1, v2}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 242
    .line 243
    .line 244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_2
    check-cast v4, La/odj0;

    .line 248
    .line 249
    check-cast v8, Ljava/lang/String;

    .line 250
    .line 251
    check-cast v12, Ljava/lang/String;

    .line 252
    .line 253
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, La/k0w0;

    .line 256
    .line 257
    iget-object v1, v4, La/odj0;->D0:La/rek0;

    .line 258
    .line 259
    new-instance v2, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 260
    .line 261
    invoke-direct {v2, v8, v3, v12}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v1, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 268
    .line 269
    invoke-direct {v1, v2}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 273
    .line 274
    .line 275
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_3
    check-cast v4, La/xxi0;

    .line 279
    .line 280
    check-cast v8, Ljava/lang/String;

    .line 281
    .line 282
    check-cast v12, Ljava/lang/String;

    .line 283
    .line 284
    move-object/from16 v0, p1

    .line 285
    .line 286
    check-cast v0, La/k0w0;

    .line 287
    .line 288
    iget-object v1, v4, La/xxi0;->G0:La/rek0;

    .line 289
    .line 290
    new-instance v2, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 291
    .line 292
    invoke-direct {v2, v8, v3, v12}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    new-instance v1, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 299
    .line 300
    invoke-direct {v1, v2}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 304
    .line 305
    .line 306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_4
    check-cast v4, Ljava/util/ArrayList;

    .line 310
    .line 311
    check-cast v8, Ljava/util/ArrayList;

    .line 312
    .line 313
    check-cast v12, Ljava/util/ArrayList;

    .line 314
    .line 315
    move-object/from16 v0, p1

    .line 316
    .line 317
    check-cast v0, La/ou90;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    move v2, v14

    .line 327
    :goto_6
    if-ge v2, v1, :cond_a

    .line 328
    .line 329
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    check-cast v5, La/pu90;

    .line 334
    .line 335
    if-eqz v3, :cond_9

    .line 336
    .line 337
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    check-cast v6, Ljava/lang/Number;

    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    invoke-virtual {v0, v5, v6, v14, v13}, La/ou90;->g(La/pu90;IIF)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_9
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    check-cast v6, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-virtual {v0, v5, v6, v14, v13}, La/ou90;->m(La/pu90;IIF)V

    .line 362
    .line 363
    .line 364
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    move v2, v14

    .line 372
    :goto_8
    if-ge v2, v1, :cond_c

    .line 373
    .line 374
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    check-cast v4, La/pu90;

    .line 379
    .line 380
    if-eqz v3, :cond_b

    .line 381
    .line 382
    invoke-virtual {v0, v4, v14, v14, v11}, La/ou90;->g(La/pu90;IIF)V

    .line 383
    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_b
    invoke-virtual {v0, v4, v14, v14, v11}, La/ou90;->m(La/pu90;IIF)V

    .line 387
    .line 388
    .line 389
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_5
    check-cast v4, La/tjb0;

    .line 396
    .line 397
    check-cast v8, La/ygs;

    .line 398
    .line 399
    check-cast v12, La/rbb;

    .line 400
    .line 401
    move-object/from16 v1, p1

    .line 402
    .line 403
    check-cast v1, La/k0w0;

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    iget-object v2, v4, La/tjb0;->p:La/qv2;

    .line 409
    .line 410
    sget-object v26, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 411
    .line 412
    sget-object v27, La/grs;->b:La/grs;

    .line 413
    .line 414
    sget-object v30, La/ors;->a:La/ors;

    .line 415
    .line 416
    sget-object v33, La/k1g;->h:La/k1g;

    .line 417
    .line 418
    iget-wide v14, v8, La/ygs;->a:J

    .line 419
    .line 420
    iget-wide v3, v12, La/rbb;->n:J

    .line 421
    .line 422
    iget-object v5, v12, La/rbb;->p:Ljava/util/List;

    .line 423
    .line 424
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    check-cast v5, La/ygs;

    .line 429
    .line 430
    if-eqz v5, :cond_d

    .line 431
    .line 432
    iget-wide v5, v5, La/ygs;->B:J

    .line 433
    .line 434
    :goto_a
    move-wide/from16 v20, v5

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_d
    const-wide/16 v5, 0x0

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :goto_b
    iget-wide v5, v12, La/rbb;->a:J

    .line 441
    .line 442
    iget-boolean v7, v12, La/rbb;->m:Z

    .line 443
    .line 444
    new-instance v13, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 445
    .line 446
    iget-boolean v0, v0, La/t13;->b:Z

    .line 447
    .line 448
    const-string v28, "main_screen"

    .line 449
    .line 450
    const-string v29, ""

    .line 451
    .line 452
    const/16 v31, 0x0

    .line 453
    .line 454
    const/16 v32, 0x0

    .line 455
    .line 456
    move-wide/from16 v16, v14

    .line 457
    .line 458
    move/from16 v22, v0

    .line 459
    .line 460
    move-wide/from16 v18, v3

    .line 461
    .line 462
    move-wide/from16 v23, v5

    .line 463
    .line 464
    move/from16 v25, v7

    .line 465
    .line 466
    invoke-direct/range {v13 .. v33}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v13}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 474
    .line 475
    .line 476
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_6
    check-cast v4, La/g9b0;

    .line 480
    .line 481
    check-cast v8, La/a570;

    .line 482
    .line 483
    check-cast v12, Ljava/lang/String;

    .line 484
    .line 485
    move-object/from16 v0, p1

    .line 486
    .line 487
    check-cast v0, La/k0w0;

    .line 488
    .line 489
    new-instance v1, La/ck60;

    .line 490
    .line 491
    invoke-direct {v1, v4, v8, v12, v10}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    new-instance v2, La/a1w0;

    .line 498
    .line 499
    invoke-direct {v2, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, La/c8d;

    .line 509
    .line 510
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 511
    .line 512
    new-instance v2, La/v7d;

    .line 513
    .line 514
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 515
    .line 516
    .line 517
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 518
    .line 519
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_7
    check-cast v4, La/a4x;

    .line 523
    .line 524
    move-object v5, v8

    .line 525
    check-cast v5, La/k6z;

    .line 526
    .line 527
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 528
    .line 529
    move-object/from16 v1, p1

    .line 530
    .line 531
    check-cast v1, La/hcz;

    .line 532
    .line 533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    new-instance v3, La/jfa0;

    .line 537
    .line 538
    invoke-direct {v3, v2}, La/jfa0;-><init>(B)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    new-instance v11, La/zu90;

    .line 546
    .line 547
    invoke-direct {v11, v7, v3, v4}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    new-instance v13, La/a580;

    .line 551
    .line 552
    const/16 v3, 0x16

    .line 553
    .line 554
    invoke-direct {v13, v4, v3}, La/a580;-><init>(Ljava/util/List;B)V

    .line 555
    .line 556
    .line 557
    new-instance v3, La/vfe;

    .line 558
    .line 559
    const/4 v8, 0x5

    .line 560
    iget-boolean v6, v0, La/t13;->b:Z

    .line 561
    .line 562
    move-object v7, v12

    .line 563
    invoke-direct/range {v3 .. v8}, La/vfe;-><init>(Ljava/util/List;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;B)V

    .line 564
    .line 565
    .line 566
    new-instance v0, La/ugd;

    .line 567
    .line 568
    invoke-direct {v0, v9, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v10, v11, v13, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 572
    .line 573
    .line 574
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_8
    check-cast v4, La/l7m0;

    .line 578
    .line 579
    check-cast v8, La/qdz;

    .line 580
    .line 581
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 582
    .line 583
    move-object/from16 v0, p1

    .line 584
    .line 585
    check-cast v0, La/hcz;

    .line 586
    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, La/a4x;

    .line 595
    .line 596
    new-instance v4, La/ev80;

    .line 597
    .line 598
    invoke-direct {v4, v10}, La/ev80;-><init>(B)V

    .line 599
    .line 600
    .line 601
    new-instance v7, La/ev80;

    .line 602
    .line 603
    invoke-direct {v7, v6}, La/ev80;-><init>(B)V

    .line 604
    .line 605
    .line 606
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    new-instance v9, La/m160;

    .line 611
    .line 612
    invoke-direct {v9, v4, v1, v5}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 613
    .line 614
    .line 615
    new-instance v4, La/m160;

    .line 616
    .line 617
    const/16 v5, 0x15

    .line 618
    .line 619
    invoke-direct {v4, v7, v1, v5}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 620
    .line 621
    .line 622
    new-instance v5, La/vfe;

    .line 623
    .line 624
    invoke-direct {v5, v1, v3, v8, v12}, La/vfe;-><init>(La/a4x;ZLa/qdz;Lkotlin/jvm/functions/Function1;)V

    .line 625
    .line 626
    .line 627
    new-instance v1, La/ugd;

    .line 628
    .line 629
    const v3, 0x2fd4df92

    .line 630
    .line 631
    .line 632
    invoke-direct {v1, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0, v6, v9, v4, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 636
    .line 637
    .line 638
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0

    .line 641
    :pswitch_9
    check-cast v4, La/f47;

    .line 642
    .line 643
    move-object v5, v8

    .line 644
    check-cast v5, La/z470;

    .line 645
    .line 646
    move-object v7, v12

    .line 647
    check-cast v7, Ljava/lang/String;

    .line 648
    .line 649
    move-object/from16 v1, p1

    .line 650
    .line 651
    check-cast v1, La/k0w0;

    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    new-instance v3, La/je2;

    .line 657
    .line 658
    const/4 v8, 0x0

    .line 659
    iget-boolean v6, v0, La/t13;->b:Z

    .line 660
    .line 661
    invoke-direct/range {v3 .. v8}, La/je2;-><init>(La/f47;La/z470;ZLjava/lang/String;La/yje;)V

    .line 662
    .line 663
    .line 664
    new-instance v0, La/b1w0;

    .line 665
    .line 666
    invoke-direct {v0, v3}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v0, La/c8d;

    .line 676
    .line 677
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 678
    .line 679
    new-instance v3, La/v7d;

    .line 680
    .line 681
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 682
    .line 683
    .line 684
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 685
    .line 686
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_a
    check-cast v4, La/pm60;

    .line 690
    .line 691
    check-cast v8, La/a570;

    .line 692
    .line 693
    check-cast v12, Ljava/lang/String;

    .line 694
    .line 695
    move-object/from16 v0, p1

    .line 696
    .line 697
    check-cast v0, La/k0w0;

    .line 698
    .line 699
    new-instance v1, La/ck60;

    .line 700
    .line 701
    const/4 v2, 0x2

    .line 702
    invoke-direct {v1, v4, v8, v12, v2}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    new-instance v2, La/a1w0;

    .line 709
    .line 710
    invoke-direct {v2, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, La/c8d;

    .line 720
    .line 721
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 722
    .line 723
    new-instance v2, La/v7d;

    .line 724
    .line 725
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 726
    .line 727
    .line 728
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 729
    .line 730
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_b
    move-object v1, v4

    .line 734
    check-cast v1, Landroid/view/Window;

    .line 735
    .line 736
    check-cast v8, Landroid/app/Activity;

    .line 737
    .line 738
    check-cast v12, La/l7m0;

    .line 739
    .line 740
    move-object/from16 v0, p1

    .line 741
    .line 742
    check-cast v0, La/ilz;

    .line 743
    .line 744
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    if-eqz v1, :cond_e

    .line 748
    .line 749
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    check-cast v0, Ljava/lang/Boolean;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 756
    .line 757
    .line 758
    move-result v5

    .line 759
    xor-int/lit8 v6, v3, 0x1

    .line 760
    .line 761
    const v3, 0x7f040b5d

    .line 762
    .line 763
    .line 764
    const v4, 0x7f040b5d

    .line 765
    .line 766
    .line 767
    move-object v2, v8

    .line 768
    invoke-static/range {v1 .. v6}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 769
    .line 770
    .line 771
    :cond_e
    new-instance v0, La/pa2;

    .line 772
    .line 773
    invoke-direct {v0, v10}, La/pa2;-><init>(B)V

    .line 774
    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_c
    move-object v2, v4

    .line 778
    check-cast v2, La/w03;

    .line 779
    .line 780
    check-cast v8, La/w03;

    .line 781
    .line 782
    check-cast v12, La/i9q;

    .line 783
    .line 784
    iget-object v0, v12, La/i9q;->c:La/a4x;

    .line 785
    .line 786
    move-object/from16 v1, p1

    .line 787
    .line 788
    check-cast v1, La/fhl;

    .line 789
    .line 790
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2}, La/w03;->i()V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v8}, La/w03;->i()V

    .line 797
    .line 798
    .line 799
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 800
    .line 801
    .line 802
    move-result-object v9

    .line 803
    invoke-virtual {v9}, La/nr;->p()J

    .line 804
    .line 805
    .line 806
    move-result-wide v4

    .line 807
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 808
    .line 809
    .line 810
    move-result-object v6

    .line 811
    invoke-interface {v6}, La/x5a;->l()V

    .line 812
    .line 813
    .line 814
    :try_start_1
    iget-object v6, v9, La/nr;->b:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v6, La/fvt0;

    .line 817
    .line 818
    if-eqz v3, :cond_f

    .line 819
    .line 820
    const/high16 v13, -0x40800000    # -1.0f

    .line 821
    .line 822
    :cond_f
    iget-object v3, v6, La/fvt0;->a:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v3, La/nr;

    .line 825
    .line 826
    invoke-virtual {v3}, La/nr;->p()J

    .line 827
    .line 828
    .line 829
    move-result-wide v18

    .line 830
    move-object v10, v15

    .line 831
    invoke-static/range {v18 .. v19}, La/p7x;->u(J)J

    .line 832
    .line 833
    .line 834
    move-result-wide v14

    .line 835
    const/high16 v3, -0x40800000    # -1.0f

    .line 836
    .line 837
    invoke-virtual {v6, v13, v3, v14, v15}, La/fvt0;->z(FFJ)V

    .line 838
    .line 839
    .line 840
    invoke-interface {v1}, La/fhl;->d()J

    .line 841
    .line 842
    .line 843
    move-result-wide v6

    .line 844
    const-wide v13, 0xffffffffL

    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    and-long/2addr v6, v13

    .line 850
    long-to-int v3, v6

    .line 851
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    invoke-static {v1, v3}, La/qcc;->R(La/fhl;F)V

    .line 856
    .line 857
    .line 858
    iget-wide v6, v12, La/i9q;->j:J

    .line 859
    .line 860
    move-wide/from16 p0, v13

    .line 861
    .line 862
    iget-wide v13, v12, La/i9q;->g:J

    .line 863
    .line 864
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 865
    .line 866
    .line 867
    move-result-object v3

    .line 868
    const/16 v20, 0x0

    .line 869
    .line 870
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 871
    .line 872
    .line 873
    move-result v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 874
    const/16 v16, 0x20

    .line 875
    .line 876
    if-eqz v15, :cond_12

    .line 877
    .line 878
    :try_start_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v15

    .line 882
    add-int/lit8 v17, v20, 0x1

    .line 883
    .line 884
    if-ltz v20, :cond_11

    .line 885
    .line 886
    check-cast v15, La/p9q;

    .line 887
    .line 888
    move-object/from16 v21, v10

    .line 889
    .line 890
    iget-wide v10, v15, La/p9q;->b:J

    .line 891
    .line 892
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 893
    .line 894
    .line 895
    move-result-object v10

    .line 896
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    invoke-interface {v1}, La/fhl;->d()J

    .line 900
    .line 901
    .line 902
    move-result-wide v22
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 903
    move-wide/from16 v24, v4

    .line 904
    .line 905
    move-object v5, v3

    .line 906
    shr-long v3, v22, v16

    .line 907
    .line 908
    long-to-int v3, v3

    .line 909
    :try_start_3
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    invoke-static {v13, v14}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 921
    .line 922
    .line 923
    move-result-object v11

    .line 924
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    invoke-static {v10, v3, v11, v4}, La/tdc;->P(Ljava/math/BigDecimal;FLjava/math/BigDecimal;Ljava/math/BigDecimal;)D

    .line 928
    .line 929
    .line 930
    move-result-wide v3

    .line 931
    double-to-float v3, v3

    .line 932
    new-instance v4, Ljava/math/BigDecimal;

    .line 933
    .line 934
    iget v10, v15, La/p9q;->a:F

    .line 935
    .line 936
    invoke-static {v10}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v10

    .line 940
    invoke-direct {v4, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    invoke-interface {v1}, La/fhl;->d()J

    .line 944
    .line 945
    .line 946
    move-result-wide v10

    .line 947
    and-long v10, v10, p0

    .line 948
    .line 949
    long-to-int v10, v10

    .line 950
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 951
    .line 952
    .line 953
    move-result v10

    .line 954
    new-instance v11, Ljava/math/BigDecimal;

    .line 955
    .line 956
    move-wide/from16 v22, v6

    .line 957
    .line 958
    move-object v7, v5

    .line 959
    iget-wide v5, v12, La/i9q;->b:D

    .line 960
    .line 961
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v5

    .line 965
    invoke-direct {v11, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    new-instance v5, Ljava/math/BigDecimal;

    .line 969
    .line 970
    move-object v15, v7

    .line 971
    iget-wide v6, v12, La/i9q;->a:D

    .line 972
    .line 973
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    invoke-static {v4, v10, v5, v11}, La/tdc;->P(Ljava/math/BigDecimal;FLjava/math/BigDecimal;Ljava/math/BigDecimal;)D

    .line 981
    .line 982
    .line 983
    move-result-wide v4

    .line 984
    double-to-float v4, v4

    .line 985
    if-nez v20, :cond_10

    .line 986
    .line 987
    invoke-virtual {v2, v3, v4}, La/w03;->f(FF)V

    .line 988
    .line 989
    .line 990
    goto :goto_e

    .line 991
    :catchall_0
    move-exception v0

    .line 992
    :goto_d
    move-wide/from16 v10, v24

    .line 993
    .line 994
    goto/16 :goto_10

    .line 995
    .line 996
    :cond_10
    invoke-virtual {v2, v3, v4}, La/w03;->e(FF)V

    .line 997
    .line 998
    .line 999
    :goto_e
    move-object v3, v15

    .line 1000
    move/from16 v20, v17

    .line 1001
    .line 1002
    move-object/from16 v10, v21

    .line 1003
    .line 1004
    move-wide/from16 v6, v22

    .line 1005
    .line 1006
    move-wide/from16 v4, v24

    .line 1007
    .line 1008
    const/4 v11, 0x0

    .line 1009
    goto/16 :goto_c

    .line 1010
    .line 1011
    :catchall_1
    move-exception v0

    .line 1012
    move-wide/from16 v24, v4

    .line 1013
    .line 1014
    goto :goto_d

    .line 1015
    :cond_11
    move-wide/from16 v24, v4

    .line 1016
    .line 1017
    move-object/from16 v21, v10

    .line 1018
    .line 1019
    invoke-static {}, La/q3d;->p()V

    .line 1020
    .line 1021
    .line 1022
    throw v21

    .line 1023
    :cond_12
    move-wide/from16 v24, v4

    .line 1024
    .line 1025
    move-wide/from16 v22, v6

    .line 1026
    .line 1027
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 1028
    .line 1029
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v3

    .line 1033
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1034
    .line 1035
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v3

    .line 1039
    new-instance v6, La/vtm0;

    .line 1040
    .line 1041
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1042
    .line 1043
    const/high16 v5, 0x40000000    # 2.0f

    .line 1044
    .line 1045
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 1046
    .line 1047
    .line 1048
    move-result v27

    .line 1049
    const/16 v31, 0x0

    .line 1050
    .line 1051
    const/16 v32, 0x16

    .line 1052
    .line 1053
    const/16 v28, 0x0

    .line 1054
    .line 1055
    const/16 v29, 0x0

    .line 1056
    .line 1057
    const/16 v30, 0x1

    .line 1058
    .line 1059
    move-object/from16 v26, v6

    .line 1060
    .line 1061
    invoke-direct/range {v26 .. v32}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1062
    .line 1063
    .line 1064
    const/16 v7, 0x34

    .line 1065
    .line 1066
    const/4 v5, 0x0

    .line 1067
    move-wide/from16 v10, v24

    .line 1068
    .line 1069
    :try_start_4
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v8, v2}, La/w03;->a(La/w03;La/w03;)V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    check-cast v0, La/p9q;

    .line 1080
    .line 1081
    if-nez v0, :cond_13

    .line 1082
    .line 1083
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1084
    .line 1085
    invoke-static {v9, v10, v11}, Lc;->g(La/nr;J)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_f

    .line 1089
    :catchall_2
    move-exception v0

    .line 1090
    goto :goto_10

    .line 1091
    :cond_13
    :try_start_5
    iget-wide v2, v0, La/p9q;->b:J

    .line 1092
    .line 1093
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    invoke-interface {v1}, La/fhl;->d()J

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v2

    .line 1104
    shr-long v2, v2, v16

    .line 1105
    .line 1106
    long-to-int v2, v2

    .line 1107
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    invoke-static {v13, v14}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v3

    .line 1115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    invoke-static/range {v22 .. v23}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1123
    .line 1124
    .line 1125
    invoke-static {v0, v2, v4, v3}, La/tdc;->P(Ljava/math/BigDecimal;FLjava/math/BigDecimal;Ljava/math/BigDecimal;)D

    .line 1126
    .line 1127
    .line 1128
    move-result-wide v2

    .line 1129
    double-to-float v0, v2

    .line 1130
    const/4 v2, 0x0

    .line 1131
    invoke-virtual {v8, v0, v2}, La/w03;->e(FF)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v8, v2, v2}, La/w03;->e(FF)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v8}, La/w03;->c()V

    .line 1138
    .line 1139
    .line 1140
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1145
    .line 1146
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary20-0d7_KjU()J

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v20

    .line 1150
    const/16 v23, 0x0

    .line 1151
    .line 1152
    const/16 v24, 0x3c

    .line 1153
    .line 1154
    const/16 v22, 0x0

    .line 1155
    .line 1156
    move-object/from16 v18, v1

    .line 1157
    .line 1158
    move-object/from16 v19, v8

    .line 1159
    .line 1160
    invoke-static/range {v18 .. v24}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1161
    .line 1162
    .line 1163
    invoke-static {v9, v10, v11}, Lc;->g(La/nr;J)V

    .line 1164
    .line 1165
    .line 1166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1167
    .line 1168
    :goto_f
    return-object v0

    .line 1169
    :catchall_3
    move-exception v0

    .line 1170
    move-wide v10, v4

    .line 1171
    :goto_10
    invoke-static {v9, v10, v11}, Lc;->g(La/nr;J)V

    .line 1172
    .line 1173
    .line 1174
    throw v0

    .line 1175
    :pswitch_d
    check-cast v4, La/odd;

    .line 1176
    .line 1177
    check-cast v8, La/jzj;

    .line 1178
    .line 1179
    check-cast v12, La/vpq;

    .line 1180
    .line 1181
    move-object/from16 v0, p1

    .line 1182
    .line 1183
    check-cast v0, Ljava/lang/Throwable;

    .line 1184
    .line 1185
    const-string v1, "CXCP"

    .line 1186
    .line 1187
    if-eqz v0, :cond_15

    .line 1188
    .line 1189
    invoke-static {}, La/l8x;->j0()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v2

    .line 1193
    if-eqz v2, :cond_14

    .line 1194
    .line 1195
    const-string v2, "propagateToFocusMeteringResultDeferred: completed exceptionally!"

    .line 1196
    .line 1197
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1198
    .line 1199
    .line 1200
    :cond_14
    invoke-virtual {v4, v0}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 1201
    .line 1202
    .line 1203
    goto/16 :goto_13

    .line 1204
    .line 1205
    :cond_15
    invoke-interface {v8}, La/jzj;->getCompleted()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    check-cast v0, La/k0g0;

    .line 1210
    .line 1211
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v5

    .line 1215
    if-eqz v5, :cond_16

    .line 1216
    .line 1217
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    const-string v6, "propagateToFocusMeteringResultDeferred: result3A = "

    .line 1220
    .line 1221
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v5

    .line 1231
    invoke-static {v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1232
    .line 1233
    .line 1234
    :cond_16
    iget-byte v1, v0, La/k0g0;->a:B

    .line 1235
    .line 1236
    const/4 v5, 0x4

    .line 1237
    if-ne v1, v5, :cond_17

    .line 1238
    .line 1239
    const-string v0, "Camera is not active."

    .line 1240
    .line 1241
    invoke-static {v0, v4}, La/dw9;->z(Ljava/lang/String;La/odd;)V

    .line 1242
    .line 1243
    .line 1244
    goto :goto_13

    .line 1245
    :cond_17
    const/4 v5, 0x2

    .line 1246
    if-ne v1, v5, :cond_18

    .line 1247
    .line 1248
    new-instance v0, La/sek;

    .line 1249
    .line 1250
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v4, v0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    goto :goto_13

    .line 1257
    :cond_18
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1258
    .line 1259
    .line 1260
    iget-byte v1, v0, La/k0g0;->a:B

    .line 1261
    .line 1262
    if-nez v1, :cond_1c

    .line 1263
    .line 1264
    iget-object v0, v0, La/k0g0;->b:La/pz2;

    .line 1265
    .line 1266
    if-eqz v0, :cond_19

    .line 1267
    .line 1268
    sget-object v1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 1269
    .line 1270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1271
    .line 1272
    .line 1273
    iget-object v0, v0, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 1274
    .line 1275
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    check-cast v0, Ljava/lang/Integer;

    .line 1280
    .line 1281
    :cond_19
    if-nez v3, :cond_1a

    .line 1282
    .line 1283
    goto :goto_11

    .line 1284
    :cond_1a
    sget-object v0, La/q70;->b:Ljava/util/List;

    .line 1285
    .line 1286
    iget-object v0, v12, La/vpq;->m:Ljava/util/ArrayList;

    .line 1287
    .line 1288
    if-nez v0, :cond_1b

    .line 1289
    .line 1290
    goto :goto_11

    .line 1291
    :cond_1b
    new-instance v1, La/q70;

    .line 1292
    .line 1293
    invoke-direct {v1, v2}, La/q70;-><init>(I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    :goto_11
    new-instance v0, La/sek;

    .line 1300
    .line 1301
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_12

    .line 1305
    :cond_1c
    new-instance v0, La/sek;

    .line 1306
    .line 1307
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    :goto_12
    invoke-virtual {v4, v0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1314
    .line 1315
    return-object v0

    .line 1316
    :pswitch_e
    move-object/from16 v21, v15

    .line 1317
    .line 1318
    check-cast v4, La/a4x;

    .line 1319
    .line 1320
    check-cast v8, La/xcz;

    .line 1321
    .line 1322
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 1323
    .line 1324
    move-object/from16 v0, p1

    .line 1325
    .line 1326
    check-cast v0, La/hcz;

    .line 1327
    .line 1328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    if-eqz v1, :cond_1d

    .line 1336
    .line 1337
    invoke-virtual {v1}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v15

    .line 1341
    goto :goto_14

    .line 1342
    :cond_1d
    move-object/from16 v15, v21

    .line 1343
    .line 1344
    :goto_14
    invoke-static {v1}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v6

    .line 1348
    :try_start_6
    invoke-virtual {v8}, La/xcz;->h()I

    .line 1349
    .line 1350
    .line 1351
    move-result v7

    .line 1352
    invoke-virtual {v8}, La/xcz;->i()I

    .line 1353
    .line 1354
    .line 1355
    move-result v9

    .line 1356
    invoke-virtual {v8, v7, v9}, La/xcz;->k(II)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1357
    .line 1358
    .line 1359
    invoke-static {v1, v6, v15}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 1360
    .line 1361
    .line 1362
    new-instance v1, La/mmn;

    .line 1363
    .line 1364
    invoke-direct {v1, v2}, La/mmn;-><init>(B)V

    .line 1365
    .line 1366
    .line 1367
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1368
    .line 1369
    .line 1370
    move-result v6

    .line 1371
    new-instance v7, La/ctl;

    .line 1372
    .line 1373
    const/16 v8, 0x15

    .line 1374
    .line 1375
    invoke-direct {v7, v1, v4, v8}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1376
    .line 1377
    .line 1378
    new-instance v1, La/v2m;

    .line 1379
    .line 1380
    invoke-direct {v1, v4, v5}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 1381
    .line 1382
    .line 1383
    new-instance v5, La/cz0;

    .line 1384
    .line 1385
    const/4 v8, 0x4

    .line 1386
    invoke-direct {v5, v4, v3, v12, v8}, La/cz0;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;B)V

    .line 1387
    .line 1388
    .line 1389
    new-instance v3, La/ugd;

    .line 1390
    .line 1391
    const v4, 0x2fd4df92

    .line 1392
    .line 1393
    .line 1394
    invoke-direct {v3, v4, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v0, v6, v7, v1, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1398
    .line 1399
    .line 1400
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1401
    .line 1402
    return-object v0

    .line 1403
    :catchall_4
    move-exception v0

    .line 1404
    invoke-static {v1, v6, v15}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 1405
    .line 1406
    .line 1407
    throw v0

    .line 1408
    :pswitch_f
    move-object/from16 v21, v15

    .line 1409
    .line 1410
    check-cast v4, La/a4x;

    .line 1411
    .line 1412
    move-object v9, v8

    .line 1413
    check-cast v9, La/u3n;

    .line 1414
    .line 1415
    move-object v11, v12

    .line 1416
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 1417
    .line 1418
    move-object/from16 v1, p1

    .line 1419
    .line 1420
    check-cast v1, La/hcz;

    .line 1421
    .line 1422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1426
    .line 1427
    .line 1428
    move-result v3

    .line 1429
    new-instance v5, La/v2m;

    .line 1430
    .line 1431
    const/16 v6, 0xe

    .line 1432
    .line 1433
    invoke-direct {v5, v4, v6}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 1434
    .line 1435
    .line 1436
    new-instance v7, La/vfe;

    .line 1437
    .line 1438
    const/4 v12, 0x1

    .line 1439
    iget-boolean v10, v0, La/t13;->b:Z

    .line 1440
    .line 1441
    move-object v8, v4

    .line 1442
    invoke-direct/range {v7 .. v12}, La/vfe;-><init>(Ljava/util/List;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;B)V

    .line 1443
    .line 1444
    .line 1445
    new-instance v0, La/ugd;

    .line 1446
    .line 1447
    const v4, 0x2fd4df92

    .line 1448
    .line 1449
    .line 1450
    invoke-direct {v0, v4, v2, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1451
    .line 1452
    .line 1453
    move-object/from16 v10, v21

    .line 1454
    .line 1455
    invoke-virtual {v1, v3, v10, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1456
    .line 1457
    .line 1458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1459
    .line 1460
    return-object v0

    .line 1461
    :pswitch_10
    sget-object v0, La/wxl;->j:La/wxl;

    .line 1462
    .line 1463
    check-cast v4, La/xyl;

    .line 1464
    .line 1465
    check-cast v8, Ljava/util/List;

    .line 1466
    .line 1467
    sget-object v1, La/uyl;->a:La/uyl;

    .line 1468
    .line 1469
    check-cast v12, Ljava/lang/Integer;

    .line 1470
    .line 1471
    move-object/from16 v5, p1

    .line 1472
    .line 1473
    check-cast v5, Lorg/xplatform/uikit/components/chips/DsChips;

    .line 1474
    .line 1475
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v5, v0}, Lorg/xplatform/uikit/components/chips/DsChips;->setStyle(La/wxl;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v5, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v5, v4}, Lorg/xplatform/uikit/components/chips/DsChips;->setDsChipsType(La/xyl;)V

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v5, v8}, Lorg/xplatform/uikit/components/chips/DsChips;->setChips(Ljava/util/List;)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v5, v1}, Lorg/xplatform/uikit/components/chips/DsChips;->setSelectionMode(La/uyl;)V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v5, v3}, Lorg/xplatform/uikit/components/chips/DsChips;->setLoading(Z)V

    .line 1494
    .line 1495
    .line 1496
    if-eqz v12, :cond_1e

    .line 1497
    .line 1498
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1499
    .line 1500
    .line 1501
    move-result v0

    .line 1502
    invoke-virtual {v5, v0}, Lorg/xplatform/uikit/components/chips/DsChips;->setCustomHorizontalMargin(I)V

    .line 1503
    .line 1504
    .line 1505
    :cond_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1506
    .line 1507
    return-object v0

    .line 1508
    :pswitch_11
    check-cast v4, La/ebl;

    .line 1509
    .line 1510
    check-cast v8, La/m9s;

    .line 1511
    .line 1512
    move-object/from16 v20, v12

    .line 1513
    .line 1514
    check-cast v20, Ljava/lang/String;

    .line 1515
    .line 1516
    move-object/from16 v0, p1

    .line 1517
    .line 1518
    check-cast v0, La/k0w0;

    .line 1519
    .line 1520
    iget-object v1, v4, La/ebl;->N:La/qgh;

    .line 1521
    .line 1522
    sget-object v2, La/sip;->a:La/bek;

    .line 1523
    .line 1524
    iget-object v5, v4, La/ebl;->r:Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 1525
    .line 1526
    iget-boolean v7, v5, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->b:Z

    .line 1527
    .line 1528
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1529
    .line 1530
    .line 1531
    invoke-static {v7}, La/bek;->f(Z)La/sip;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v14

    .line 1535
    iget-wide v9, v5, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->d:J

    .line 1536
    .line 1537
    sget-object v2, La/e9l;->f:La/c0o;

    .line 1538
    .line 1539
    invoke-static {v2, v3}, La/e3c;->w(La/c0o;Z)Ljava/util/ArrayList;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v2

    .line 1543
    new-instance v5, Ljava/util/ArrayList;

    .line 1544
    .line 1545
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1546
    .line 1547
    .line 1548
    move-result v6

    .line 1549
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v2

    .line 1556
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1557
    .line 1558
    .line 1559
    move-result v6

    .line 1560
    if-eqz v6, :cond_1f

    .line 1561
    .line 1562
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v6

    .line 1566
    check-cast v6, La/e9l;

    .line 1567
    .line 1568
    iget-object v6, v6, La/e9l;->a:La/t9m0;

    .line 1569
    .line 1570
    iget-short v6, v6, La/t9m0;->a:S

    .line 1571
    .line 1572
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v6

    .line 1576
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1577
    .line 1578
    .line 1579
    goto :goto_15

    .line 1580
    :cond_1f
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    check-cast v2, La/f9l;

    .line 1585
    .line 1586
    iget-object v2, v2, La/f9l;->m:Ljava/util/List;

    .line 1587
    .line 1588
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v6

    .line 1592
    check-cast v6, La/f9l;

    .line 1593
    .line 1594
    iget-object v6, v6, La/f9l;->d:La/x9l;

    .line 1595
    .line 1596
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v4

    .line 1600
    check-cast v4, La/f9l;

    .line 1601
    .line 1602
    iget-object v4, v4, La/f9l;->v:La/yws;

    .line 1603
    .line 1604
    invoke-static {v2, v6, v8, v4, v3}, La/ckb;->L(Ljava/util/List;La/x9l;La/m9s;La/yws;Z)Ljava/util/List;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v22

    .line 1608
    sget-object v15, La/dam0;->a:La/dam0;

    .line 1609
    .line 1610
    new-instance v13, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1611
    .line 1612
    const-wide/16 v16, 0x28

    .line 1613
    .line 1614
    move-object/from16 v21, v5

    .line 1615
    .line 1616
    move-wide/from16 v18, v9

    .line 1617
    .line 1618
    invoke-direct/range {v13 .. v22}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1622
    .line 1623
    .line 1624
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1625
    .line 1626
    invoke-direct {v1, v13}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1630
    .line 1631
    .line 1632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1633
    .line 1634
    return-object v0

    .line 1635
    :pswitch_12
    check-cast v4, La/omv;

    .line 1636
    .line 1637
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1638
    .line 1639
    check-cast v12, La/yk9;

    .line 1640
    .line 1641
    move-object/from16 v0, p1

    .line 1642
    .line 1643
    check-cast v0, La/qk9;

    .line 1644
    .line 1645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    if-eqz v3, :cond_20

    .line 1649
    .line 1650
    const/4 v0, 0x3

    .line 1651
    invoke-static {v4, v0}, La/ckb;->a0(La/omv;I)V

    .line 1652
    .line 1653
    .line 1654
    iget-wide v0, v12, La/yk9;->a:J

    .line 1655
    .line 1656
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    invoke-interface {v8, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1661
    .line 1662
    .line 1663
    :cond_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1664
    .line 1665
    return-object v0

    .line 1666
    :pswitch_13
    check-cast v4, La/q2r0;

    .line 1667
    .line 1668
    move-object/from16 v21, v8

    .line 1669
    .line 1670
    check-cast v21, La/mm40;

    .line 1671
    .line 1672
    move-object/from16 v23, v12

    .line 1673
    .line 1674
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 1675
    .line 1676
    move-object/from16 v1, p1

    .line 1677
    .line 1678
    check-cast v1, La/hcz;

    .line 1679
    .line 1680
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1681
    .line 1682
    .line 1683
    iget-object v3, v4, La/q2r0;->b:La/a4x;

    .line 1684
    .line 1685
    new-instance v4, La/jyf;

    .line 1686
    .line 1687
    const/16 v5, 0x1b

    .line 1688
    .line 1689
    invoke-direct {v4, v5}, La/jyf;-><init>(B)V

    .line 1690
    .line 1691
    .line 1692
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1693
    .line 1694
    .line 1695
    move-result v5

    .line 1696
    new-instance v6, La/vtf;

    .line 1697
    .line 1698
    const/4 v7, 0x2

    .line 1699
    invoke-direct {v6, v4, v3, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1700
    .line 1701
    .line 1702
    new-instance v4, La/dx8;

    .line 1703
    .line 1704
    const/16 v7, 0x19

    .line 1705
    .line 1706
    invoke-direct {v4, v3, v7}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1707
    .line 1708
    .line 1709
    new-instance v19, La/ezg;

    .line 1710
    .line 1711
    const/16 v24, 0x1

    .line 1712
    .line 1713
    iget-boolean v0, v0, La/t13;->b:Z

    .line 1714
    .line 1715
    move/from16 v22, v0

    .line 1716
    .line 1717
    move-object/from16 v20, v3

    .line 1718
    .line 1719
    invoke-direct/range {v19 .. v24}, La/ezg;-><init>(Ljava/util/List;La/mm40;ZLkotlin/jvm/functions/Function1;B)V

    .line 1720
    .line 1721
    .line 1722
    move-object/from16 v0, v19

    .line 1723
    .line 1724
    new-instance v3, La/ugd;

    .line 1725
    .line 1726
    invoke-direct {v3, v9, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v1, v5, v6, v4, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1730
    .line 1731
    .line 1732
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1733
    .line 1734
    return-object v0

    .line 1735
    :pswitch_14
    check-cast v4, La/p2r0;

    .line 1736
    .line 1737
    move-object v15, v8

    .line 1738
    check-cast v15, La/mm40;

    .line 1739
    .line 1740
    move-object/from16 v17, v12

    .line 1741
    .line 1742
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 1743
    .line 1744
    move-object/from16 v1, p1

    .line 1745
    .line 1746
    check-cast v1, La/hcz;

    .line 1747
    .line 1748
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1749
    .line 1750
    .line 1751
    iget-object v14, v4, La/p2r0;->b:La/a4x;

    .line 1752
    .line 1753
    new-instance v3, La/jyf;

    .line 1754
    .line 1755
    const/16 v4, 0x1a

    .line 1756
    .line 1757
    invoke-direct {v3, v4}, La/jyf;-><init>(B)V

    .line 1758
    .line 1759
    .line 1760
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1761
    .line 1762
    .line 1763
    move-result v4

    .line 1764
    new-instance v5, La/vtf;

    .line 1765
    .line 1766
    invoke-direct {v5, v3, v14, v2}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1767
    .line 1768
    .line 1769
    new-instance v3, La/dx8;

    .line 1770
    .line 1771
    const/16 v6, 0x18

    .line 1772
    .line 1773
    invoke-direct {v3, v14, v6}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1774
    .line 1775
    .line 1776
    new-instance v13, La/ezg;

    .line 1777
    .line 1778
    const/16 v18, 0x0

    .line 1779
    .line 1780
    iget-boolean v0, v0, La/t13;->b:Z

    .line 1781
    .line 1782
    move/from16 v16, v0

    .line 1783
    .line 1784
    invoke-direct/range {v13 .. v18}, La/ezg;-><init>(Ljava/util/List;La/mm40;ZLkotlin/jvm/functions/Function1;B)V

    .line 1785
    .line 1786
    .line 1787
    new-instance v0, La/ugd;

    .line 1788
    .line 1789
    invoke-direct {v0, v9, v2, v13}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1793
    .line 1794
    .line 1795
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1796
    .line 1797
    return-object v0

    .line 1798
    :pswitch_15
    move-object v10, v15

    .line 1799
    check-cast v4, La/f3d;

    .line 1800
    .line 1801
    check-cast v8, Ljava/util/List;

    .line 1802
    .line 1803
    check-cast v12, La/pz40;

    .line 1804
    .line 1805
    move-object/from16 v0, p1

    .line 1806
    .line 1807
    check-cast v0, La/ou90;

    .line 1808
    .line 1809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    iget-object v1, v4, La/f3d;->a:La/agk0;

    .line 1813
    .line 1814
    invoke-virtual {v1}, La/agk0;->l()F

    .line 1815
    .line 1816
    .line 1817
    move-result v1

    .line 1818
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1819
    .line 1820
    .line 1821
    move-result v2

    .line 1822
    const/4 v4, 0x0

    .line 1823
    :goto_16
    if-ge v4, v2, :cond_27

    .line 1824
    .line 1825
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v5

    .line 1829
    check-cast v5, La/pu90;

    .line 1830
    .line 1831
    invoke-virtual {v5}, La/pu90;->n()Ljava/lang/Object;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v6

    .line 1835
    instance-of v7, v6, La/p6z;

    .line 1836
    .line 1837
    if-eqz v7, :cond_21

    .line 1838
    .line 1839
    move-object/from16 v21, v6

    .line 1840
    .line 1841
    check-cast v21, La/p6z;

    .line 1842
    .line 1843
    goto :goto_17

    .line 1844
    :cond_21
    move-object/from16 v21, v10

    .line 1845
    .line 1846
    :goto_17
    if-eqz v21, :cond_22

    .line 1847
    .line 1848
    invoke-interface/range {v21 .. v21}, La/p6z;->g0()Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v21

    .line 1852
    move-object/from16 v6, v21

    .line 1853
    .line 1854
    goto :goto_18

    .line 1855
    :cond_22
    move-object v6, v10

    .line 1856
    :goto_18
    const-string v7, "BACKGROUND_KEY"

    .line 1857
    .line 1858
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1859
    .line 1860
    .line 1861
    move-result v7

    .line 1862
    if-eqz v7, :cond_24

    .line 1863
    .line 1864
    if-eqz v3, :cond_23

    .line 1865
    .line 1866
    invoke-static {v1}, La/si30;->b(F)I

    .line 1867
    .line 1868
    .line 1869
    move-result v6

    .line 1870
    neg-int v6, v6

    .line 1871
    :goto_19
    const/4 v7, 0x0

    .line 1872
    const/4 v9, 0x0

    .line 1873
    goto :goto_1a

    .line 1874
    :cond_23
    const/4 v6, 0x0

    .line 1875
    goto :goto_19

    .line 1876
    :goto_1a
    invoke-virtual {v0, v5, v9, v6, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 1877
    .line 1878
    .line 1879
    goto :goto_1b

    .line 1880
    :cond_24
    const/4 v7, 0x0

    .line 1881
    const/4 v9, 0x0

    .line 1882
    const-string v11, "COLLAPSING_HEADER_KEY"

    .line 1883
    .line 1884
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v11

    .line 1888
    if-eqz v11, :cond_25

    .line 1889
    .line 1890
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v6

    .line 1894
    check-cast v6, Ljava/lang/Number;

    .line 1895
    .line 1896
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1897
    .line 1898
    .line 1899
    move-result v6

    .line 1900
    invoke-static {v1}, La/si30;->b(F)I

    .line 1901
    .line 1902
    .line 1903
    move-result v11

    .line 1904
    sub-int/2addr v6, v11

    .line 1905
    invoke-virtual {v0, v5, v9, v6, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 1906
    .line 1907
    .line 1908
    goto :goto_1b

    .line 1909
    :cond_25
    const-string v11, "TOOLBAR_KEY"

    .line 1910
    .line 1911
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1912
    .line 1913
    .line 1914
    move-result v6

    .line 1915
    if-eqz v6, :cond_26

    .line 1916
    .line 1917
    invoke-virtual {v0, v5, v9, v9, v13}, La/ou90;->m(La/pu90;IIF)V

    .line 1918
    .line 1919
    .line 1920
    :cond_26
    :goto_1b
    add-int/lit8 v4, v4, 0x1

    .line 1921
    .line 1922
    goto :goto_16

    .line 1923
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1924
    .line 1925
    return-object v0

    .line 1926
    :pswitch_16
    check-cast v4, Ljava/util/Calendar;

    .line 1927
    .line 1928
    check-cast v8, La/hdj;

    .line 1929
    .line 1930
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 1931
    .line 1932
    move-object/from16 v0, p1

    .line 1933
    .line 1934
    check-cast v0, Ljava/lang/Long;

    .line 1935
    .line 1936
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1937
    .line 1938
    .line 1939
    move-result-wide v0

    .line 1940
    if-nez v3, :cond_28

    .line 1941
    .line 1942
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1943
    .line 1944
    goto :goto_1d

    .line 1945
    :cond_28
    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1946
    .line 1947
    .line 1948
    new-instance v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1949
    .line 1950
    invoke-virtual {v4, v2}, Ljava/util/Calendar;->get(I)I

    .line 1951
    .line 1952
    .line 1953
    move-result v1

    .line 1954
    const/4 v5, 0x2

    .line 1955
    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    .line 1956
    .line 1957
    .line 1958
    move-result v3

    .line 1959
    add-int/2addr v3, v2

    .line 1960
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    .line 1961
    .line 1962
    .line 1963
    move-result v2

    .line 1964
    invoke-direct {v0, v1, v3, v2}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 1965
    .line 1966
    .line 1967
    iget-object v1, v8, La/hdj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1968
    .line 1969
    invoke-static {v0, v1}, La/bsr0;->W(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)I

    .line 1970
    .line 1971
    .line 1972
    move-result v1

    .line 1973
    if-ltz v1, :cond_2b

    .line 1974
    .line 1975
    iget-object v1, v8, La/hdj;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1976
    .line 1977
    invoke-static {v0, v1}, La/bsr0;->W(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)I

    .line 1978
    .line 1979
    .line 1980
    move-result v1

    .line 1981
    if-lez v1, :cond_29

    .line 1982
    .line 1983
    goto :goto_1c

    .line 1984
    :cond_29
    invoke-virtual {v8}, La/hdj;->a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v1

    .line 1988
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->equals(Ljava/lang/Object;)Z

    .line 1989
    .line 1990
    .line 1991
    move-result v1

    .line 1992
    if-nez v1, :cond_2a

    .line 1993
    .line 1994
    iget-object v1, v8, La/hdj;->d:La/pz40;

    .line 1995
    .line 1996
    invoke-interface {v1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1997
    .line 1998
    .line 1999
    invoke-interface {v12, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    :cond_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2003
    .line 2004
    goto :goto_1d

    .line 2005
    :cond_2b
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2006
    .line 2007
    :goto_1d
    return-object v0

    .line 2008
    :pswitch_17
    check-cast v4, La/lf8;

    .line 2009
    .line 2010
    move-object/from16 v16, v8

    .line 2011
    .line 2012
    check-cast v16, La/a570;

    .line 2013
    .line 2014
    move-object/from16 v17, v12

    .line 2015
    .line 2016
    check-cast v17, Ljava/lang/String;

    .line 2017
    .line 2018
    move-object/from16 v1, p1

    .line 2019
    .line 2020
    check-cast v1, La/k0w0;

    .line 2021
    .line 2022
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2023
    .line 2024
    .line 2025
    iget-object v13, v4, La/lf8;->F:La/bbw0;

    .line 2026
    .line 2027
    invoke-static/range {v16 .. v16}, La/x1x;->D(La/a570;)J

    .line 2028
    .line 2029
    .line 2030
    move-result-wide v14

    .line 2031
    iget-boolean v0, v0, La/t13;->b:Z

    .line 2032
    .line 2033
    move/from16 v18, v0

    .line 2034
    .line 2035
    invoke-virtual/range {v13 .. v18}, La/bbw0;->f(JLa/a570;Ljava/lang/String;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v0

    .line 2039
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2040
    .line 2041
    .line 2042
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2043
    .line 2044
    return-object v0

    .line 2045
    :pswitch_18
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 2046
    .line 2047
    move-object/from16 v19, v8

    .line 2048
    .line 2049
    check-cast v19, La/vz2;

    .line 2050
    .line 2051
    move-object/from16 v23, v12

    .line 2052
    .line 2053
    check-cast v23, La/m78;

    .line 2054
    .line 2055
    move-object/from16 v0, p1

    .line 2056
    .line 2057
    check-cast v0, La/g7z;

    .line 2058
    .line 2059
    invoke-virtual {v0}, La/g7z;->a()V

    .line 2060
    .line 2061
    .line 2062
    iget-object v1, v0, La/g7z;->a:La/a6a;

    .line 2063
    .line 2064
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v2

    .line 2068
    check-cast v2, Ljava/lang/Boolean;

    .line 2069
    .line 2070
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2071
    .line 2072
    .line 2073
    move-result v2

    .line 2074
    if-nez v2, :cond_2c

    .line 2075
    .line 2076
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2077
    .line 2078
    goto :goto_1f

    .line 2079
    :cond_2c
    if-eqz v3, :cond_2d

    .line 2080
    .line 2081
    invoke-interface {v1}, La/fhl;->E0()J

    .line 2082
    .line 2083
    .line 2084
    move-result-wide v2

    .line 2085
    iget-object v1, v1, La/a6a;->b:La/nr;

    .line 2086
    .line 2087
    invoke-virtual {v1}, La/nr;->p()J

    .line 2088
    .line 2089
    .line 2090
    move-result-wide v4

    .line 2091
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v6

    .line 2095
    invoke-interface {v6}, La/x5a;->l()V

    .line 2096
    .line 2097
    .line 2098
    :try_start_7
    iget-object v6, v1, La/nr;->b:Ljava/lang/Object;

    .line 2099
    .line 2100
    check-cast v6, La/fvt0;

    .line 2101
    .line 2102
    const/high16 v7, -0x40800000    # -1.0f

    .line 2103
    .line 2104
    invoke-virtual {v6, v7, v13, v2, v3}, La/fvt0;->z(FFJ)V

    .line 2105
    .line 2106
    .line 2107
    const/16 v24, 0x0

    .line 2108
    .line 2109
    const/16 v25, 0x2e

    .line 2110
    .line 2111
    const-wide/16 v20, 0x0

    .line 2112
    .line 2113
    const/16 v22, 0x0

    .line 2114
    .line 2115
    move-object/from16 v18, v0

    .line 2116
    .line 2117
    invoke-static/range {v18 .. v25}, La/fhl;->m0(La/fhl;La/vz2;JFLa/a4d;II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 2118
    .line 2119
    .line 2120
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 2121
    .line 2122
    .line 2123
    goto :goto_1e

    .line 2124
    :catchall_5
    move-exception v0

    .line 2125
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 2126
    .line 2127
    .line 2128
    throw v0

    .line 2129
    :cond_2d
    move-object/from16 v18, v0

    .line 2130
    .line 2131
    const/16 v24, 0x0

    .line 2132
    .line 2133
    const/16 v25, 0x2e

    .line 2134
    .line 2135
    const-wide/16 v20, 0x0

    .line 2136
    .line 2137
    const/16 v22, 0x0

    .line 2138
    .line 2139
    invoke-static/range {v18 .. v25}, La/fhl;->m0(La/fhl;La/vz2;JFLa/a4d;II)V

    .line 2140
    .line 2141
    .line 2142
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2143
    .line 2144
    :goto_1f
    return-object v0

    .line 2145
    :pswitch_data_0
    .packed-switch 0x0
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
