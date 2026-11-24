.class public final La/ken0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:I

.field public final b:La/n0o0;

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/mdm;


# direct methods
.method public constructor <init>(La/jen0;La/g2v;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    move/from16 v2, p3

    .line 9
    .line 10
    iput v2, v0, La/ken0;->a:I

    .line 11
    .line 12
    iget-object v2, v1, La/jen0;->d:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, La/ken0;->b:La/n0o0;

    .line 19
    .line 20
    iget-object v2, v1, La/jen0;->e:La/een0;

    .line 21
    .line 22
    invoke-static {v2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v0, La/ken0;->c:La/n0o0;

    .line 27
    .line 28
    iget-boolean v2, v1, La/jen0;->a:Z

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, v0, La/ken0;->d:La/n0o0;

    .line 39
    .line 40
    iget-boolean v2, v1, La/jen0;->b:Z

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v2, v0, La/ken0;->e:La/n0o0;

    .line 51
    .line 52
    iget-boolean v1, v1, La/jen0;->c:Z

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, v0, La/ken0;->f:La/n0o0;

    .line 63
    .line 64
    sget-object v3, La/pb10;->g:La/pb10;

    .line 65
    .line 66
    const-wide/16 v13, 0x0

    .line 67
    .line 68
    const/16 v15, 0x25e

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const v8, 0x7f130677

    .line 75
    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const v10, 0x7f131690

    .line 79
    .line 80
    .line 81
    const-wide/16 v11, 0x2710

    .line 82
    .line 83
    move-object/from16 v2, p2

    .line 84
    .line 85
    invoke-static/range {v2 .. v15}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v0, La/ken0;->g:La/mdm;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/jen0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/ken0;->b:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/fee;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, La/fee;->a()La/pz40;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v3}, La/fee;->a()La/pz40;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v3, v1, La/jen0;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v4, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, La/ken0;->c:La/n0o0;

    .line 44
    .line 45
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/fee;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, La/een0;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v4, v1, La/jen0;->e:La/een0;

    .line 72
    .line 73
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v4, v0, La/ken0;->d:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, La/fee;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-boolean v4, v1, La/jen0;->a:Z

    .line 105
    .line 106
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v4, v0, La/ken0;->e:La/n0o0;

    .line 114
    .line 115
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, La/fee;

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-boolean v4, v1, La/jen0;->b:Z

    .line 142
    .line 143
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object v4, v0, La/ken0;->f:La/n0o0;

    .line 151
    .line 152
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, La/fee;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5}, La/fee;->a()La/pz40;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v5}, La/fee;->a()La/pz40;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-boolean v1, v1, La/jen0;->c:Z

    .line 179
    .line 180
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v6, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, La/fee;

    .line 192
    .line 193
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    sget-object v5, La/een0;->b:La/een0;

    .line 198
    .line 199
    if-ne v1, v5, :cond_0

    .line 200
    .line 201
    new-instance v1, La/men0;

    .line 202
    .line 203
    iget-object v0, v0, La/ken0;->g:La/mdm;

    .line 204
    .line 205
    invoke-direct {v1, v0}, La/men0;-><init>(La/mdm;)V

    .line 206
    .line 207
    .line 208
    return-object v1

    .line 209
    :cond_0
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, La/fee;

    .line 214
    .line 215
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    sget-object v5, La/een0;->d:La/een0;

    .line 220
    .line 221
    if-ne v1, v5, :cond_1

    .line 222
    .line 223
    new-instance v1, La/len0;

    .line 224
    .line 225
    iget v0, v0, La/ken0;->a:I

    .line 226
    .line 227
    invoke-direct {v1, v0}, La/len0;-><init>(I)V

    .line 228
    .line 229
    .line 230
    return-object v1

    .line 231
    :cond_1
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, La/fee;

    .line 236
    .line 237
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, Ljava/util/Collection;

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_a

    .line 248
    .line 249
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, La/fee;

    .line 254
    .line 255
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget-object v1, La/een0;->c:La/een0;

    .line 260
    .line 261
    if-ne v0, v1, :cond_a

    .line 262
    .line 263
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, La/fee;

    .line 268
    .line 269
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Ljava/lang/Iterable;

    .line 274
    .line 275
    new-instance v1, Ljava/util/ArrayList;

    .line 276
    .line 277
    const/16 v2, 0xa

    .line 278
    .line 279
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_9

    .line 295
    .line 296
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, La/nmp0;

    .line 301
    .line 302
    new-instance v3, La/aan0;

    .line 303
    .line 304
    iget-wide v4, v2, La/nmp0;->a:J

    .line 305
    .line 306
    iget-object v6, v2, La/nmp0;->d:Ljava/util/List;

    .line 307
    .line 308
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    check-cast v6, Ljava/lang/String;

    .line 313
    .line 314
    new-instance v7, La/zrm;

    .line 315
    .line 316
    new-instance v8, La/e2l0;

    .line 317
    .line 318
    iget-object v9, v2, La/nmp0;->b:Ljava/lang/String;

    .line 319
    .line 320
    sget-object v10, La/s6t0;->a:La/pz40;

    .line 321
    .line 322
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    iget-object v10, v10, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 327
    .line 328
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 329
    .line 330
    .line 331
    move-result-wide v10

    .line 332
    invoke-direct {v8, v9, v10, v11}, La/e2l0;-><init>(Ljava/lang/String;J)V

    .line 333
    .line 334
    .line 335
    sget-object v9, La/p1l0;->b:La/p1l0;

    .line 336
    .line 337
    sget-object v11, La/p1l0;->d:La/p1l0;

    .line 338
    .line 339
    const-string v9, ""

    .line 340
    .line 341
    if-eqz v6, :cond_7

    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    if-nez v10, :cond_2

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_2
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 351
    .line 352
    const/4 v12, 0x0

    .line 353
    invoke-static {v6, v10, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    if-eqz v10, :cond_3

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-nez v10, :cond_4

    .line 365
    .line 366
    goto :goto_1

    .line 367
    :cond_4
    sget-object v10, La/u0d;->a:Ljava/util/List;

    .line 368
    .line 369
    invoke-static {v6}, La/u0d;->c(Ljava/lang/String;)Z

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    if-eqz v10, :cond_5

    .line 374
    .line 375
    :goto_1
    move-object v6, v9

    .line 376
    goto :goto_3

    .line 377
    :cond_5
    const-string v10, "playerlogo/"

    .line 378
    .line 379
    const/4 v12, 0x1

    .line 380
    invoke-static {v6, v10, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-eqz v10, :cond_6

    .line 385
    .line 386
    const-string v10, "%s/%s"

    .line 387
    .line 388
    goto :goto_2

    .line 389
    :cond_6
    const-string v10, "%s/playerlogo/%s"

    .line 390
    .line 391
    :goto_2
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 392
    .line 393
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 394
    .line 395
    filled-new-array {v13, v6}, [Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    const/4 v13, 0x2

    .line 400
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    invoke-static {v12, v10, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    :goto_3
    move-object v13, v6

    .line 409
    goto :goto_5

    .line 410
    :cond_7
    :goto_4
    const/4 v6, 0x0

    .line 411
    goto :goto_3

    .line 412
    :goto_5
    iget-wide v14, v2, La/nmp0;->c:J

    .line 413
    .line 414
    const-wide/16 v16, 0x0

    .line 415
    .line 416
    cmp-long v6, v14, v16

    .line 417
    .line 418
    if-eqz v6, :cond_8

    .line 419
    .line 420
    const-string v6, "svg"

    .line 421
    .line 422
    const-string v9, "sports_v2"

    .line 423
    .line 424
    const-string v10, "static"

    .line 425
    .line 426
    invoke-static {v10, v6, v9}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    const-string v9, ".svg"

    .line 431
    .line 432
    invoke-static {v14, v15, v9, v6}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 433
    .line 434
    .line 435
    iget-object v6, v6, La/bzu;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v6, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    :cond_8
    move-object v14, v9

    .line 444
    new-instance v9, La/s1l0;

    .line 445
    .line 446
    const/4 v15, 0x0

    .line 447
    const/16 v16, 0x64

    .line 448
    .line 449
    const/4 v12, 0x0

    .line 450
    move-object v10, v9

    .line 451
    invoke-direct/range {v10 .. v16}, La/s1l0;-><init>(La/p1l0;La/uf5;Ljava/lang/String;Ljava/lang/String;La/y3d;I)V

    .line 452
    .line 453
    .line 454
    new-instance v10, La/f3l0;

    .line 455
    .line 456
    iget-boolean v6, v2, La/nmp0;->f:Z

    .line 457
    .line 458
    iget-boolean v2, v2, La/nmp0;->e:Z

    .line 459
    .line 460
    invoke-direct {v10, v6, v2}, La/f3l0;-><init>(ZZ)V

    .line 461
    .line 462
    .line 463
    new-instance v12, La/l3l0;

    .line 464
    .line 465
    sget-object v2, La/qmk;->a:La/zcl;

    .line 466
    .line 467
    const/high16 v2, 0x41800000    # 16.0f

    .line 468
    .line 469
    invoke-direct {v12, v2}, La/l3l0;-><init>(F)V

    .line 470
    .line 471
    .line 472
    const/16 v13, 0x8

    .line 473
    .line 474
    const/4 v11, 0x0

    .line 475
    invoke-direct/range {v7 .. v13}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 476
    .line 477
    .line 478
    invoke-direct {v3, v4, v5, v7}, La/aan0;-><init>(JLa/zrm;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    goto/16 :goto_0

    .line 485
    .line 486
    :cond_9
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    new-instance v1, La/oen0;

    .line 491
    .line 492
    invoke-direct {v1, v0}, La/oen0;-><init>(La/i4;)V

    .line 493
    .line 494
    .line 495
    return-object v1

    .line 496
    :cond_a
    new-instance v0, La/nen0;

    .line 497
    .line 498
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, La/fee;

    .line 503
    .line 504
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    check-cast v1, Ljava/lang/Boolean;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    invoke-direct {v0, v1}, La/nen0;-><init>(Z)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
