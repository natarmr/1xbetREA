.class public final La/j6k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/k6k0;

.field public final synthetic c:La/t5k0;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(ILa/k6k0;La/t5k0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/j6k0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, La/j6k0;->b:La/k6k0;

    .line 7
    .line 8
    iput-object p3, p0, La/j6k0;->c:La/t5k0;

    .line 9
    .line 10
    iput p4, p0, La/j6k0;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "-"

    .line 4
    .line 5
    const-string v2, "z9hG4bK"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, La/a7k0;

    .line 10
    .line 11
    iget-object v4, v0, La/j6k0;->b:La/k6k0;

    .line 12
    .line 13
    iget-object v5, v4, La/k6k0;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget v6, v0, La/j6k0;->a:I

    .line 20
    .line 21
    if-eq v6, v5, :cond_0

    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    sget-object v5, La/z6k0;->a:La/z6k0;

    .line 27
    .line 28
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v7, 0x0

    .line 33
    if-eqz v5, :cond_4

    .line 34
    .line 35
    iget v12, v0, La/j6k0;->d:I

    .line 36
    .line 37
    iget-object v3, v4, La/k6k0;->b:La/t6k0;

    .line 38
    .line 39
    iget-object v5, v3, La/t6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    iget-object v9, v3, La/t6k0;->a:La/r6k0;

    .line 42
    .line 43
    iget-object v10, v9, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 44
    .line 45
    if-eqz v10, :cond_2

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v9}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v10, v3, La/t6k0;->h:La/s6k0;

    .line 52
    .line 53
    if-eqz v10, :cond_1

    .line 54
    .line 55
    invoke-interface {v9, v10}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iput-object v7, v3, La/t6k0;->h:La/s6k0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    :catch_0
    invoke-virtual {v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    iget-object v3, v4, La/k6k0;->f:La/u24;

    .line 68
    .line 69
    invoke-virtual {v3}, La/u24;->a()V

    .line 70
    .line 71
    .line 72
    iget-object v3, v4, La/k6k0;->a:La/r6k0;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, La/r6k0;->b()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    sget-object v3, La/e6k0;->a:La/e6k0;

    .line 82
    .line 83
    invoke-virtual {v4, v3}, La/k6k0;->b(La/g6k0;)V

    .line 84
    .line 85
    .line 86
    iget-object v3, v4, La/k6k0;->c:La/x5k0;

    .line 87
    .line 88
    iget-object v0, v0, La/j6k0;->c:La/t5k0;

    .line 89
    .line 90
    iget-object v5, v0, La/t5k0;->a:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v7, v0, La/t5k0;->c:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v9, v0, La/t5k0;->b:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v14, v0, La/t5k0;->d:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v13, v0, La/t5k0;->e:Ljava/util/Map;

    .line 99
    .line 100
    iget-object v10, v3, La/x5k0;->c:La/jt2;

    .line 101
    .line 102
    iget-object v0, v3, La/x5k0;->h:La/g090;

    .line 103
    .line 104
    iget-object v11, v3, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v8, 0x10

    .line 122
    .line 123
    move-object/from16 v17, v7

    .line 124
    .line 125
    sget-object v7, La/i99;->b:La/i99;

    .line 126
    .line 127
    move-object/from16 v24, v4

    .line 128
    .line 129
    const/4 v4, 0x1

    .line 130
    move-object/from16 v18, v9

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    invoke-static {v9, v8, v7, v4}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    iget-object v8, v3, La/x5k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 138
    .line 139
    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :try_start_1
    iget-object v9, v3, La/x5k0;->a:La/r6k0;

    .line 143
    .line 144
    invoke-virtual {v9}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v16

    .line 152
    move-object/from16 v4, v16

    .line 153
    .line 154
    check-cast v4, La/y5k0;

    .line 155
    .line 156
    iget-object v4, v4, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 157
    .line 158
    if-eqz v4, :cond_3

    .line 159
    .line 160
    invoke-interface {v9, v4}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    move-object v4, v10

    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v25, v8

    .line 180
    .line 181
    const/16 v8, 0x8

    .line 182
    .line 183
    move-object/from16 v20, v9

    .line 184
    .line 185
    const/4 v9, 0x0

    .line 186
    invoke-virtual {v4, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    new-instance v8, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v9, "@"

    .line 199
    .line 200
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v19

    .line 216
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const/4 v8, 0x4

    .line 228
    const/4 v9, 0x0

    .line 229
    invoke-virtual {v4, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    new-instance v9, La/u5k0;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 234
    .line 235
    move-object/from16 v16, v5

    .line 236
    .line 237
    move-object v5, v11

    .line 238
    move-object v11, v15

    .line 239
    move-object/from16 v8, v20

    .line 240
    .line 241
    move-object v15, v4

    .line 242
    move-object v4, v10

    .line 243
    move-object v10, v14

    .line 244
    move-object/from16 v14, v19

    .line 245
    .line 246
    :try_start_2
    invoke-direct/range {v9 .. v18}, La/u5k0;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v19, v14

    .line 250
    .line 251
    move-object/from16 v20, v15

    .line 252
    .line 253
    move-object v14, v10

    .line 254
    move-object v15, v11

    .line 255
    move-object v10, v9

    .line 256
    move-object/from16 v9, v16

    .line 257
    .line 258
    invoke-virtual {v5, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const-string v11, ""

    .line 273
    .line 274
    move-object/from16 v26, v5

    .line 275
    .line 276
    const/4 v5, 0x0

    .line 277
    invoke-static {v10, v1, v11, v5}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v21

    .line 285
    invoke-virtual {v0, v12, v15, v9}, La/g090;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v22

    .line 289
    move-object/from16 v23, v13

    .line 290
    .line 291
    iget-object v13, v3, La/x5k0;->i:La/pox;

    .line 292
    .line 293
    move-object/from16 v16, v9

    .line 294
    .line 295
    invoke-virtual/range {v13 .. v23}, La/pox;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/javax/sip/message/Request;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    new-instance v16, La/m6k0;

    .line 300
    .line 301
    iget-object v2, v3, La/x5k0;->a:La/r6k0;

    .line 302
    .line 303
    iget-object v5, v3, La/x5k0;->c:La/jt2;

    .line 304
    .line 305
    iget-object v9, v3, La/x5k0;->b:Ljava/lang/String;

    .line 306
    .line 307
    move-object/from16 v18, v0

    .line 308
    .line 309
    move-object/from16 v19, v2

    .line 310
    .line 311
    move-object/from16 v17, v5

    .line 312
    .line 313
    move-object/from16 v20, v8

    .line 314
    .line 315
    move-object/from16 v21, v9

    .line 316
    .line 317
    move-object/from16 v23, v25

    .line 318
    .line 319
    move-object/from16 v22, v26

    .line 320
    .line 321
    invoke-direct/range {v16 .. v23}, La/m6k0;-><init>(La/jt2;La/g090;La/r6k0;Landroid/javax/sip/SipProvider;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 322
    .line 323
    .line 324
    move-object/from16 v0, v16

    .line 325
    .line 326
    move-object/from16 v8, v20

    .line 327
    .line 328
    move-object/from16 v5, v22

    .line 329
    .line 330
    invoke-interface {v8, v0}, Landroid/javax/sip/SipProvider;->addSipListener(Landroid/javax/sip/SipListener;)V

    .line 331
    .line 332
    .line 333
    new-instance v2, La/kmk;

    .line 334
    .line 335
    const/4 v9, 0x1

    .line 336
    invoke-direct {v2, v0, v9}, La/kmk;-><init>(Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    invoke-interface {v8, v1}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    new-instance v1, La/v5k0;

    .line 350
    .line 351
    const/4 v9, 0x0

    .line 352
    invoke-direct {v1, v0, v9}, La/v5k0;-><init>(Landroid/javax/sip/ClientTransaction;B)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-interface {v0}, Landroid/javax/sip/ClientTransaction;->sendRequest()V

    .line 359
    .line 360
    .line 361
    const-string v0, "inviteSent"

    .line 362
    .line 363
    const-string v1, "INVITE sent"

    .line 364
    .line 365
    iget-object v2, v4, La/jt2;->a:La/n6k0;

    .line 366
    .line 367
    invoke-virtual {v2, v0, v1}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 368
    .line 369
    .line 370
    goto :goto_3

    .line 371
    :catch_2
    move-exception v0

    .line 372
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v1, v4, La/jt2;->a:La/n6k0;

    .line 381
    .line 382
    const-string v2, "inviteFailed"

    .line 383
    .line 384
    invoke-virtual {v1, v2, v0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3}, La/x5k0;->a()V

    .line 388
    .line 389
    .line 390
    new-instance v0, La/w6k0;

    .line 391
    .line 392
    const-string v1, "Failed to initiate call"

    .line 393
    .line 394
    invoke-direct {v0, v1}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    :goto_3
    new-instance v0, La/n6d;

    .line 401
    .line 402
    move-object/from16 v1, v24

    .line 403
    .line 404
    invoke-direct {v0, v6, v1}, La/n6d;-><init>(ILa/k6k0;)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v1, p2

    .line 408
    .line 409
    invoke-static {v7, v0, v1}, La/qoj0;->o(La/qoj0;La/kmq;La/yje;)V

    .line 410
    .line 411
    .line 412
    sget-object v0, La/wne;->a:La/wne;

    .line 413
    .line 414
    return-object v0

    .line 415
    :cond_4
    move-object v1, v4

    .line 416
    instance-of v0, v3, La/y6k0;

    .line 417
    .line 418
    if-eqz v0, :cond_5

    .line 419
    .line 420
    iget-object v0, v1, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 421
    .line 422
    const/4 v9, 0x0

    .line 423
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 424
    .line 425
    .line 426
    new-instance v0, La/f6k0;

    .line 427
    .line 428
    check-cast v3, La/y6k0;

    .line 429
    .line 430
    iget-boolean v2, v3, La/y6k0;->a:Z

    .line 431
    .line 432
    invoke-direct {v0, v2}, La/f6k0;-><init>(Z)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v0}, La/k6k0;->b(La/g6k0;)V

    .line 436
    .line 437
    .line 438
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 442
    .line 443
    .line 444
    return-object v7
.end method
