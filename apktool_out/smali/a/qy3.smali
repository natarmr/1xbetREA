.class public final La/qy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/oqp;


# instance fields
.field public final synthetic a:B

.field public final b:La/aot0;

.field public final c:La/a780;


# direct methods
.method public synthetic constructor <init>(La/aot0;La/a780;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qy3;->a:B

    iput-object p1, p0, La/qy3;->b:La/aot0;

    iput-object p2, p0, La/qy3;->c:La/a780;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/pyn;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qy3;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x6

    .line 9
    const/16 v5, 0x2f

    .line 10
    .line 11
    const/16 v6, 0x3f

    .line 12
    .line 13
    const/16 v7, 0x23

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x0

    .line 17
    const-string v10, ""

    .line 18
    .line 19
    const/16 v11, 0x2e

    .line 20
    .line 21
    const/4 v12, 0x1

    .line 22
    iget-object v13, v0, La/qy3;->b:La/aot0;

    .line 23
    .line 24
    iget-object v0, v0, La/qy3;->c:La/a780;

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    iget-object v1, v13, La/aot0;->d:Ljava/lang/String;

    .line 31
    .line 32
    const-string v2, "Invalid android.resource URI: "

    .line 33
    .line 34
    if-eqz v1, :cond_f

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v14

    .line 44
    :goto_0
    if-eqz v1, :cond_f

    .line 45
    .line 46
    invoke-static {v13}, La/dqm0;->q(La/aot0;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v3, :cond_e

    .line 57
    .line 58
    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_e

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v3, v0, La/a780;->a:Landroid/content/Context;

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    :goto_1
    new-instance v13, Landroid/util/TypedValue;

    .line 94
    .line 95
    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v2, v13, v12}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 99
    .line 100
    .line 101
    iget-object v13, v13, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-static {v13}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v15

    .line 111
    if-eqz v15, :cond_2

    .line 112
    .line 113
    :goto_2
    move-object v6, v14

    .line 114
    goto :goto_3

    .line 115
    :cond_2
    invoke-static {v13, v7}, Lkotlin/text/StringsKt;->s0(Ljava/lang/String;C)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-static {v7, v6}, Lkotlin/text/StringsKt;->s0(Ljava/lang/String;C)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v5, v6, v6}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-static {v11, v5, v10}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    sget-object v6, La/ng40;->a:La/jo20;

    .line 148
    .line 149
    invoke-virtual {v6, v5}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Ljava/lang/String;

    .line 154
    .line 155
    if-nez v6, :cond_4

    .line 156
    .line 157
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v6, v5}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    :cond_4
    :goto_3
    const-string v5, "text/xml"

    .line 166
    .line 167
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_d

    .line 172
    .line 173
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_5

    .line 182
    .line 183
    invoke-static {v2, v3}, La/vtb;->V(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :goto_4
    move-object v15, v1

    .line 188
    goto :goto_6

    .line 189
    :cond_5
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    :goto_5
    if-eq v5, v8, :cond_6

    .line 198
    .line 199
    if-eq v5, v12, :cond_6

    .line 200
    .line 201
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    goto :goto_5

    .line 206
    :cond_6
    if-ne v5, v8, :cond_c

    .line 207
    .line 208
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    sget-object v5, La/itf0;->a:Ljava/lang/ThreadLocal;

    .line 213
    .line 214
    invoke-virtual {v4, v2, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    if-eqz v1, :cond_b

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :goto_6
    sget-object v1, La/lut0;->a:[Landroid/graphics/Bitmap$Config;

    .line 222
    .line 223
    instance-of v1, v15, Landroid/graphics/drawable/VectorDrawable;

    .line 224
    .line 225
    if-nez v1, :cond_8

    .line 226
    .line 227
    instance-of v1, v15, La/n4u0;

    .line 228
    .line 229
    if-eqz v1, :cond_7

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_7
    move v1, v9

    .line 233
    goto :goto_8

    .line 234
    :cond_8
    :goto_7
    move v1, v12

    .line 235
    :goto_8
    new-instance v14, La/wzw;

    .line 236
    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    sget-object v2, La/t1x;->b:La/kuo;

    .line 240
    .line 241
    invoke-static {v0, v2}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move-object/from16 v16, v2

    .line 246
    .line 247
    check-cast v16, Landroid/graphics/Bitmap$Config;

    .line 248
    .line 249
    iget-object v2, v0, La/a780;->b:La/f7k0;

    .line 250
    .line 251
    iget-object v4, v0, La/a780;->c:La/j1h0;

    .line 252
    .line 253
    sget-object v5, La/q1x;->b:La/kuo;

    .line 254
    .line 255
    invoke-static {v0, v5}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    move-object/from16 v19, v5

    .line 260
    .line 261
    check-cast v19, La/f7k0;

    .line 262
    .line 263
    iget-object v0, v0, La/a780;->d:La/asb0;

    .line 264
    .line 265
    sget-object v5, La/asb0;->b:La/asb0;

    .line 266
    .line 267
    if-ne v0, v5, :cond_9

    .line 268
    .line 269
    move/from16 v20, v12

    .line 270
    .line 271
    :goto_9
    move-object/from16 v17, v2

    .line 272
    .line 273
    move-object/from16 v18, v4

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_9
    move/from16 v20, v9

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :goto_a
    invoke-static/range {v15 .. v20}, La/vic;->u(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;La/f7k0;La/j1h0;La/f7k0;Z)Landroid/graphics/Bitmap;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    new-instance v15, Landroid/graphics/drawable/BitmapDrawable;

    .line 288
    .line 289
    invoke-direct {v15, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 290
    .line 291
    .line 292
    :cond_a
    invoke-static {v15}, La/c3x;->r(Landroid/graphics/drawable/Drawable;)La/dyw;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    sget-object v2, La/ibj;->c:La/ibj;

    .line 297
    .line 298
    invoke-direct {v14, v0, v1, v2}, La/wzw;-><init>(La/dyw;ZLa/ibj;)V

    .line 299
    .line 300
    .line 301
    goto :goto_b

    .line 302
    :cond_b
    const-string v0, "Invalid resource ID: "

    .line 303
    .line 304
    invoke-static {v2, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, La/c99;->v(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_c
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 313
    .line 314
    const-string v1, "No start tag found."

    .line 315
    .line 316
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :cond_d
    new-instance v3, Landroid/util/TypedValue;

    .line 321
    .line 322
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4, v2, v3}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    new-instance v14, La/hmk0;

    .line 330
    .line 331
    invoke-static {v3}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    new-instance v4, La/zae0;

    .line 336
    .line 337
    invoke-direct {v4, v3}, La/zae0;-><init>(La/emk0;)V

    .line 338
    .line 339
    .line 340
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 341
    .line 342
    new-instance v3, La/etf0;

    .line 343
    .line 344
    invoke-direct {v3, v1, v2}, La/etf0;-><init>(Ljava/lang/String;I)V

    .line 345
    .line 346
    .line 347
    new-instance v1, La/imk0;

    .line 348
    .line 349
    invoke-direct {v1, v4, v0, v3}, La/imk0;-><init>(La/u99;La/yzp;La/x1x;)V

    .line 350
    .line 351
    .line 352
    sget-object v0, La/ibj;->c:La/ibj;

    .line 353
    .line 354
    invoke-direct {v14, v1, v6, v0}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 355
    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_e
    invoke-static {v13, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_f
    invoke-static {v13, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :goto_b
    return-object v14

    .line 366
    :pswitch_0
    iget-object v1, v13, La/aot0;->e:Ljava/lang/String;

    .line 367
    .line 368
    if-nez v1, :cond_10

    .line 369
    .line 370
    move-object v1, v10

    .line 371
    :cond_10
    const/16 v5, 0x21

    .line 372
    .line 373
    invoke-static {v5, v9, v4, v1}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eq v4, v3, :cond_13

    .line 378
    .line 379
    sget-object v3, La/y190;->b:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v1, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-static {v3}, La/rl70;->b(Ljava/lang/String;)La/y190;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    add-int/2addr v4, v12

    .line 390
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-static {v1}, La/rl70;->b(Ljava/lang/String;)La/y190;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    new-instance v4, La/hmk0;

    .line 403
    .line 404
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance v5, La/ejv0;

    .line 410
    .line 411
    const/16 v6, 0x16

    .line 412
    .line 413
    invoke-direct {v5, v6}, La/ejv0;-><init>(B)V

    .line 414
    .line 415
    .line 416
    invoke-static {v3, v0, v5}, La/s7n0;->t(La/y190;La/yzp;Lkotlin/jvm/functions/Function1;)La/e3w0;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v1, v0, v14, v14, v2}, La/z1x;->b(La/y190;La/yzp;Ljava/lang/String;La/abe0;I)La/izp;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v1}, La/y190;->b()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-static {v11, v1, v10}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_11

    .line 437
    .line 438
    goto :goto_c

    .line 439
    :cond_11
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 440
    .line 441
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    sget-object v2, La/ng40;->a:La/jo20;

    .line 449
    .line 450
    invoke-virtual {v2, v1}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    move-object v14, v2

    .line 455
    check-cast v14, Ljava/lang/String;

    .line 456
    .line 457
    if-nez v14, :cond_12

    .line 458
    .line 459
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    :cond_12
    :goto_c
    sget-object v1, La/ibj;->c:La/ibj;

    .line 468
    .line 469
    invoke-direct {v4, v0, v14, v1}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 470
    .line 471
    .line 472
    move-object v14, v4

    .line 473
    goto :goto_d

    .line 474
    :cond_13
    const-string v0, "Invalid jar:file URI: "

    .line 475
    .line 476
    invoke-static {v13, v0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    :goto_d
    return-object v14

    .line 480
    :pswitch_1
    sget-object v1, La/y190;->b:Ljava/lang/String;

    .line 481
    .line 482
    invoke-static {v13}, La/dqm0;->p(La/aot0;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    if-eqz v1, :cond_16

    .line 487
    .line 488
    invoke-static {v1}, La/rl70;->b(Ljava/lang/String;)La/y190;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    new-instance v3, La/hmk0;

    .line 493
    .line 494
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 495
    .line 496
    invoke-static {v1, v0, v14, v14, v2}, La/z1x;->b(La/y190;La/yzp;Ljava/lang/String;La/abe0;I)La/izp;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v1}, La/y190;->b()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-static {v11, v1, v10}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    if-eqz v2, :cond_14

    .line 513
    .line 514
    goto :goto_e

    .line 515
    :cond_14
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 516
    .line 517
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    sget-object v2, La/ng40;->a:La/jo20;

    .line 525
    .line 526
    invoke-virtual {v2, v1}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    move-object v14, v2

    .line 531
    check-cast v14, Ljava/lang/String;

    .line 532
    .line 533
    if-nez v14, :cond_15

    .line 534
    .line 535
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v14

    .line 543
    :cond_15
    :goto_e
    sget-object v1, La/ibj;->c:La/ibj;

    .line 544
    .line 545
    invoke-direct {v3, v0, v14, v1}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 546
    .line 547
    .line 548
    move-object v14, v3

    .line 549
    goto :goto_f

    .line 550
    :cond_16
    const-string v0, "filePath == null"

    .line 551
    .line 552
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    :goto_f
    return-object v14

    .line 556
    :pswitch_2
    iget-object v1, v13, La/aot0;->a:Ljava/lang/String;

    .line 557
    .line 558
    const-string v2, ";base64,"

    .line 559
    .line 560
    invoke-static {v1, v2, v9, v9, v4}, Lkotlin/text/StringsKt;->V(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    const-string v5, "invalid data uri: "

    .line 565
    .line 566
    if-eq v2, v3, :cond_38

    .line 567
    .line 568
    const/16 v6, 0x3a

    .line 569
    .line 570
    invoke-static {v6, v9, v4, v1}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eq v6, v3, :cond_37

    .line 575
    .line 576
    add-int/2addr v6, v12

    .line 577
    invoke-virtual {v1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    sget-object v6, La/dv5;->c:La/cv5;

    .line 582
    .line 583
    const/16 v7, 0x8

    .line 584
    .line 585
    add-int/2addr v2, v7

    .line 586
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget-boolean v10, v6, La/dv5;->b:Z

    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    sget-object v13, La/b3;->a:La/x2;

    .line 600
    .line 601
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-static {v2, v8, v11}, La/x2;->a(III)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    sget-object v2, Lkotlin/text/Charsets;->d:Ljava/nio/charset/Charset;

    .line 612
    .line 613
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    array-length v2, v1

    .line 621
    array-length v8, v1

    .line 622
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-static {v9, v2, v8}, La/x2;->a(III)V

    .line 626
    .line 627
    .line 628
    const/16 v8, 0x3d

    .line 629
    .line 630
    const/4 v11, -0x2

    .line 631
    if-nez v2, :cond_17

    .line 632
    .line 633
    move/from16 p1, v4

    .line 634
    .line 635
    move v13, v10

    .line 636
    goto :goto_13

    .line 637
    :cond_17
    if-eq v2, v12, :cond_36

    .line 638
    .line 639
    if-eqz v10, :cond_1b

    .line 640
    .line 641
    move v15, v2

    .line 642
    move v13, v9

    .line 643
    :goto_10
    move/from16 p1, v4

    .line 644
    .line 645
    if-ge v13, v2, :cond_18

    .line 646
    .line 647
    aget-byte v4, v1, v13

    .line 648
    .line 649
    and-int/lit16 v4, v4, 0xff

    .line 650
    .line 651
    sget-object v16, La/fv5;->a:[I

    .line 652
    .line 653
    aget v4, v16, v4

    .line 654
    .line 655
    if-gez v4, :cond_1a

    .line 656
    .line 657
    if-ne v4, v11, :cond_19

    .line 658
    .line 659
    sub-int v4, v2, v13

    .line 660
    .line 661
    sub-int/2addr v15, v4

    .line 662
    :cond_18
    :goto_11
    move v13, v10

    .line 663
    goto :goto_12

    .line 664
    :cond_19
    add-int/lit8 v15, v15, -0x1

    .line 665
    .line 666
    :cond_1a
    add-int/lit8 v13, v13, 0x1

    .line 667
    .line 668
    move/from16 v4, p1

    .line 669
    .line 670
    goto :goto_10

    .line 671
    :cond_1b
    move/from16 p1, v4

    .line 672
    .line 673
    add-int/lit8 v4, v2, -0x1

    .line 674
    .line 675
    aget-byte v4, v1, v4

    .line 676
    .line 677
    if-ne v4, v8, :cond_1c

    .line 678
    .line 679
    add-int/lit8 v15, v2, -0x1

    .line 680
    .line 681
    add-int/lit8 v4, v2, -0x2

    .line 682
    .line 683
    aget-byte v4, v1, v4

    .line 684
    .line 685
    if-ne v4, v8, :cond_18

    .line 686
    .line 687
    add-int/lit8 v15, v2, -0x2

    .line 688
    .line 689
    goto :goto_11

    .line 690
    :cond_1c
    move v15, v2

    .line 691
    goto :goto_11

    .line 692
    :goto_12
    int-to-long v9, v15

    .line 693
    const-wide/16 v15, 0x6

    .line 694
    .line 695
    mul-long/2addr v9, v15

    .line 696
    const-wide/16 v15, 0x8

    .line 697
    .line 698
    div-long/2addr v9, v15

    .line 699
    long-to-int v9, v9

    .line 700
    :goto_13
    new-array v10, v9, [B

    .line 701
    .line 702
    iget-boolean v6, v6, La/dv5;->a:Z

    .line 703
    .line 704
    if-eqz v6, :cond_1d

    .line 705
    .line 706
    sget-object v6, La/fv5;->b:[I

    .line 707
    .line 708
    goto :goto_14

    .line 709
    :cond_1d
    sget-object v6, La/fv5;->a:[I

    .line 710
    .line 711
    :goto_14
    const/4 v15, -0x8

    .line 712
    move/from16 v16, v7

    .line 713
    .line 714
    move/from16 v18, v12

    .line 715
    .line 716
    move v7, v15

    .line 717
    const/4 v4, 0x0

    .line 718
    const/4 v12, 0x0

    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    :goto_15
    const-string v14, ") at index "

    .line 722
    .line 723
    const-string v8, "\'("

    .line 724
    .line 725
    if-ge v4, v2, :cond_2c

    .line 726
    .line 727
    if-ne v7, v15, :cond_1e

    .line 728
    .line 729
    add-int/lit8 v3, v4, 0x3

    .line 730
    .line 731
    if-ge v3, v2, :cond_1e

    .line 732
    .line 733
    add-int/lit8 v21, v4, 0x1

    .line 734
    .line 735
    aget-byte v15, v1, v4

    .line 736
    .line 737
    and-int/lit16 v15, v15, 0xff

    .line 738
    .line 739
    aget v15, v6, v15

    .line 740
    .line 741
    add-int/lit8 v22, v4, 0x2

    .line 742
    .line 743
    aget-byte v11, v1, v21

    .line 744
    .line 745
    and-int/lit16 v11, v11, 0xff

    .line 746
    .line 747
    aget v11, v6, v11

    .line 748
    .line 749
    move-object/from16 v21, v1

    .line 750
    .line 751
    aget-byte v1, v21, v22

    .line 752
    .line 753
    and-int/lit16 v1, v1, 0xff

    .line 754
    .line 755
    aget v1, v6, v1

    .line 756
    .line 757
    add-int/lit8 v22, v4, 0x4

    .line 758
    .line 759
    aget-byte v3, v21, v3

    .line 760
    .line 761
    and-int/lit16 v3, v3, 0xff

    .line 762
    .line 763
    aget v3, v6, v3

    .line 764
    .line 765
    shl-int/lit8 v15, v15, 0x12

    .line 766
    .line 767
    shl-int/lit8 v11, v11, 0xc

    .line 768
    .line 769
    or-int/2addr v11, v15

    .line 770
    shl-int/lit8 v1, v1, 0x6

    .line 771
    .line 772
    or-int/2addr v1, v11

    .line 773
    or-int/2addr v1, v3

    .line 774
    if-ltz v1, :cond_1f

    .line 775
    .line 776
    add-int/lit8 v3, v12, 0x1

    .line 777
    .line 778
    shr-int/lit8 v4, v1, 0x10

    .line 779
    .line 780
    int-to-byte v4, v4

    .line 781
    aput-byte v4, v10, v12

    .line 782
    .line 783
    add-int/lit8 v4, v12, 0x2

    .line 784
    .line 785
    shr-int/lit8 v8, v1, 0x8

    .line 786
    .line 787
    int-to-byte v8, v8

    .line 788
    aput-byte v8, v10, v3

    .line 789
    .line 790
    add-int/lit8 v12, v12, 0x3

    .line 791
    .line 792
    int-to-byte v1, v1

    .line 793
    aput-byte v1, v10, v4

    .line 794
    .line 795
    move-object/from16 v1, v21

    .line 796
    .line 797
    move/from16 v4, v22

    .line 798
    .line 799
    const/4 v3, -0x1

    .line 800
    const/16 v8, 0x3d

    .line 801
    .line 802
    :goto_16
    const/4 v11, -0x2

    .line 803
    const/4 v15, -0x8

    .line 804
    goto :goto_15

    .line 805
    :cond_1e
    move-object/from16 v21, v1

    .line 806
    .line 807
    :cond_1f
    aget-byte v1, v21, v4

    .line 808
    .line 809
    and-int/lit16 v1, v1, 0xff

    .line 810
    .line 811
    aget v3, v6, v1

    .line 812
    .line 813
    if-gez v3, :cond_2a

    .line 814
    .line 815
    const/4 v11, -0x2

    .line 816
    if-ne v3, v11, :cond_28

    .line 817
    .line 818
    const/4 v3, -0x8

    .line 819
    if-eq v7, v3, :cond_27

    .line 820
    .line 821
    const/4 v1, -0x6

    .line 822
    if-eq v7, v1, :cond_26

    .line 823
    .line 824
    const/4 v1, -0x4

    .line 825
    if-eq v7, v1, :cond_21

    .line 826
    .line 827
    if-ne v7, v11, :cond_20

    .line 828
    .line 829
    :goto_17
    add-int/lit8 v4, v4, 0x1

    .line 830
    .line 831
    goto :goto_1b

    .line 832
    :cond_20
    const-string v0, "Unreachable"

    .line 833
    .line 834
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    :goto_18
    const/4 v14, 0x0

    .line 838
    goto/16 :goto_22

    .line 839
    .line 840
    :cond_21
    sget-object v1, Lkotlin/io/encoding/Base64$PaddingOption;->a:[Lkotlin/io/encoding/Base64$PaddingOption;

    .line 841
    .line 842
    add-int/lit8 v4, v4, 0x1

    .line 843
    .line 844
    if-nez v13, :cond_22

    .line 845
    .line 846
    goto :goto_1a

    .line 847
    :cond_22
    :goto_19
    if-ge v4, v2, :cond_24

    .line 848
    .line 849
    aget-byte v1, v21, v4

    .line 850
    .line 851
    and-int/lit16 v1, v1, 0xff

    .line 852
    .line 853
    sget-object v3, La/fv5;->a:[I

    .line 854
    .line 855
    aget v1, v3, v1

    .line 856
    .line 857
    const/4 v3, -0x1

    .line 858
    if-eq v1, v3, :cond_23

    .line 859
    .line 860
    goto :goto_1a

    .line 861
    :cond_23
    add-int/lit8 v4, v4, 0x1

    .line 862
    .line 863
    goto :goto_19

    .line 864
    :cond_24
    :goto_1a
    if-eq v4, v2, :cond_25

    .line 865
    .line 866
    aget-byte v1, v21, v4

    .line 867
    .line 868
    const/16 v11, 0x3d

    .line 869
    .line 870
    if-ne v1, v11, :cond_25

    .line 871
    .line 872
    add-int/lit8 v4, v4, 0x1

    .line 873
    .line 874
    goto :goto_1b

    .line 875
    :cond_25
    const-string v0, "Missing one pad character at index "

    .line 876
    .line 877
    invoke-static {v4, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    goto :goto_18

    .line 885
    :cond_26
    sget-object v1, Lkotlin/io/encoding/Base64$PaddingOption;->a:[Lkotlin/io/encoding/Base64$PaddingOption;

    .line 886
    .line 887
    goto :goto_17

    .line 888
    :goto_1b
    move/from16 v1, v18

    .line 889
    .line 890
    const/4 v11, -0x2

    .line 891
    goto :goto_1d

    .line 892
    :cond_27
    const-string v0, "Redundant pad character at index "

    .line 893
    .line 894
    invoke-static {v4, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    goto :goto_18

    .line 902
    :cond_28
    const/16 v11, 0x3d

    .line 903
    .line 904
    if-eqz v13, :cond_29

    .line 905
    .line 906
    add-int/lit8 v4, v4, 0x1

    .line 907
    .line 908
    :goto_1c
    move v8, v11

    .line 909
    move-object/from16 v1, v21

    .line 910
    .line 911
    const/4 v3, -0x1

    .line 912
    goto :goto_16

    .line 913
    :cond_29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 914
    .line 915
    const-string v2, "Invalid symbol \'"

    .line 916
    .line 917
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    int-to-char v2, v1

    .line 921
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 925
    .line 926
    .line 927
    invoke-static/range {v16 .. v16}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 928
    .line 929
    .line 930
    move-result v2

    .line 931
    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-static {v4, v14, v0}, La/b1j;->h(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    goto :goto_18

    .line 949
    :cond_2a
    const/16 v11, 0x3d

    .line 950
    .line 951
    add-int/lit8 v4, v4, 0x1

    .line 952
    .line 953
    shl-int/lit8 v1, v17, 0x6

    .line 954
    .line 955
    or-int v17, v1, v3

    .line 956
    .line 957
    add-int/lit8 v3, v7, 0x6

    .line 958
    .line 959
    if-ltz v3, :cond_2b

    .line 960
    .line 961
    add-int/lit8 v1, v12, 0x1

    .line 962
    .line 963
    ushr-int v8, v17, v3

    .line 964
    .line 965
    int-to-byte v8, v8

    .line 966
    aput-byte v8, v10, v12

    .line 967
    .line 968
    shl-int v3, v18, v3

    .line 969
    .line 970
    add-int/lit8 v3, v3, -0x1

    .line 971
    .line 972
    and-int v17, v17, v3

    .line 973
    .line 974
    add-int/lit8 v7, v7, -0x2

    .line 975
    .line 976
    move v12, v1

    .line 977
    goto :goto_1c

    .line 978
    :cond_2b
    move v7, v3

    .line 979
    goto :goto_1c

    .line 980
    :cond_2c
    move-object/from16 v21, v1

    .line 981
    .line 982
    const/4 v1, 0x0

    .line 983
    :goto_1d
    if-eq v7, v11, :cond_35

    .line 984
    .line 985
    const/4 v3, -0x8

    .line 986
    if-eq v7, v3, :cond_2e

    .line 987
    .line 988
    if-eqz v1, :cond_2d

    .line 989
    .line 990
    goto :goto_1e

    .line 991
    :cond_2d
    sget-object v0, Lkotlin/io/encoding/Base64$PaddingOption;->a:[Lkotlin/io/encoding/Base64$PaddingOption;

    .line 992
    .line 993
    const-string v0, "The padding option is set to PRESENT, but the input is not properly padded"

    .line 994
    .line 995
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    goto/16 :goto_18

    .line 999
    .line 1000
    :cond_2e
    :goto_1e
    if-nez v17, :cond_34

    .line 1001
    .line 1002
    if-nez v13, :cond_2f

    .line 1003
    .line 1004
    goto :goto_20

    .line 1005
    :cond_2f
    :goto_1f
    if-ge v4, v2, :cond_31

    .line 1006
    .line 1007
    aget-byte v1, v21, v4

    .line 1008
    .line 1009
    and-int/lit16 v1, v1, 0xff

    .line 1010
    .line 1011
    sget-object v3, La/fv5;->a:[I

    .line 1012
    .line 1013
    aget v1, v3, v1

    .line 1014
    .line 1015
    const/4 v3, -0x1

    .line 1016
    if-eq v1, v3, :cond_30

    .line 1017
    .line 1018
    goto :goto_20

    .line 1019
    :cond_30
    add-int/lit8 v4, v4, 0x1

    .line 1020
    .line 1021
    goto :goto_1f

    .line 1022
    :cond_31
    :goto_20
    if-lt v4, v2, :cond_33

    .line 1023
    .line 1024
    if-ne v12, v9, :cond_32

    .line 1025
    .line 1026
    new-instance v1, La/f99;

    .line 1027
    .line 1028
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v1, v10, v9}, La/f99;->U([BI)V

    .line 1032
    .line 1033
    .line 1034
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 1035
    .line 1036
    new-instance v2, La/imk0;

    .line 1037
    .line 1038
    const/4 v3, 0x0

    .line 1039
    invoke-direct {v2, v1, v0, v3}, La/imk0;-><init>(La/u99;La/yzp;La/x1x;)V

    .line 1040
    .line 1041
    .line 1042
    sget-object v0, La/ibj;->b:La/ibj;

    .line 1043
    .line 1044
    new-instance v14, La/hmk0;

    .line 1045
    .line 1046
    invoke-direct {v14, v2, v5, v0}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 1047
    .line 1048
    .line 1049
    goto :goto_22

    .line 1050
    :cond_32
    const/4 v3, 0x0

    .line 1051
    const-string v0, "Check failed."

    .line 1052
    .line 1053
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    :goto_21
    move-object v14, v3

    .line 1057
    goto :goto_22

    .line 1058
    :cond_33
    aget-byte v0, v21, v4

    .line 1059
    .line 1060
    and-int/lit16 v0, v0, 0xff

    .line 1061
    .line 1062
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1063
    .line 1064
    int-to-char v2, v0

    .line 1065
    invoke-static/range {v16 .. v16}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    add-int/lit8 v4, v4, -0x1

    .line 1077
    .line 1078
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    const-string v5, "Symbol \'"

    .line 1081
    .line 1082
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    const-string v0, " is prohibited after the pad character"

    .line 1101
    .line 1102
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    throw v1

    .line 1113
    :cond_34
    const/4 v3, 0x0

    .line 1114
    const-string v0, "The pad bits must be zeros"

    .line 1115
    .line 1116
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_21

    .line 1120
    :cond_35
    const/4 v3, 0x0

    .line 1121
    const-string v0, "The last unit of input does not have enough bits"

    .line 1122
    .line 1123
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_21

    .line 1127
    :cond_36
    move-object v3, v14

    .line 1128
    const-string v0, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "

    .line 1129
    .line 1130
    invoke-static {v2, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_22

    .line 1138
    :cond_37
    move-object v3, v14

    .line 1139
    invoke-static {v13, v5}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_22

    .line 1143
    :cond_38
    move-object v3, v14

    .line 1144
    invoke-static {v13, v5}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    :goto_22
    return-object v14

    .line 1148
    :pswitch_3
    move/from16 v18, v12

    .line 1149
    .line 1150
    move-object v3, v14

    .line 1151
    iget-object v1, v13, La/aot0;->a:Ljava/lang/String;

    .line 1152
    .line 1153
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    iget-object v2, v0, La/a780;->a:Landroid/content/Context;

    .line 1158
    .line 1159
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    iget-object v4, v13, La/aot0;->d:Ljava/lang/String;

    .line 1164
    .line 1165
    const-string v5, "com.android.contacts"

    .line 1166
    .line 1167
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v5

    .line 1171
    const-string v6, "r"

    .line 1172
    .line 1173
    const-string v7, "\'."

    .line 1174
    .line 1175
    if-eqz v5, :cond_3a

    .line 1176
    .line 1177
    invoke-static {v13}, La/dqm0;->q(La/aot0;)Ljava/util/List;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v5

    .line 1181
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v5

    .line 1185
    const-string v9, "display_photo"

    .line 1186
    .line 1187
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v5

    .line 1191
    if-eqz v5, :cond_3a

    .line 1192
    .line 1193
    invoke-virtual {v2, v1, v6}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v4

    .line 1197
    if-eqz v4, :cond_39

    .line 1198
    .line 1199
    goto/16 :goto_28

    .line 1200
    .line 1201
    :cond_39
    const-string v0, "Unable to find a contact photo associated with \'"

    .line 1202
    .line 1203
    invoke-static {v1, v7, v0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1204
    .line 1205
    .line 1206
    :goto_23
    move-object v14, v3

    .line 1207
    goto/16 :goto_29

    .line 1208
    .line 1209
    :cond_3a
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1210
    .line 1211
    const/16 v9, 0x1d

    .line 1212
    .line 1213
    if-lt v5, v9, :cond_40

    .line 1214
    .line 1215
    const-string v5, "media"

    .line 1216
    .line 1217
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    if-nez v4, :cond_3b

    .line 1222
    .line 1223
    goto/16 :goto_27

    .line 1224
    .line 1225
    :cond_3b
    invoke-static {v13}, La/dqm0;->q(La/aot0;)Ljava/util/List;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v4

    .line 1229
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    const/4 v9, 0x3

    .line 1234
    if-lt v5, v9, :cond_40

    .line 1235
    .line 1236
    add-int/lit8 v9, v5, -0x3

    .line 1237
    .line 1238
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v9

    .line 1242
    const-string v10, "audio"

    .line 1243
    .line 1244
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v9

    .line 1248
    if-eqz v9, :cond_40

    .line 1249
    .line 1250
    sub-int/2addr v5, v8

    .line 1251
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    const-string v5, "albums"

    .line 1256
    .line 1257
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v4

    .line 1261
    if-eqz v4, :cond_40

    .line 1262
    .line 1263
    iget-object v4, v0, La/a780;->b:La/f7k0;

    .line 1264
    .line 1265
    iget-object v5, v4, La/f7k0;->a:La/umk;

    .line 1266
    .line 1267
    instance-of v6, v5, La/rmk;

    .line 1268
    .line 1269
    if-eqz v6, :cond_3c

    .line 1270
    .line 1271
    check-cast v5, La/rmk;

    .line 1272
    .line 1273
    goto :goto_24

    .line 1274
    :cond_3c
    move-object v5, v3

    .line 1275
    :goto_24
    if-eqz v5, :cond_3e

    .line 1276
    .line 1277
    iget v5, v5, La/rmk;->a:I

    .line 1278
    .line 1279
    iget-object v4, v4, La/f7k0;->b:La/umk;

    .line 1280
    .line 1281
    instance-of v6, v4, La/rmk;

    .line 1282
    .line 1283
    if-eqz v6, :cond_3d

    .line 1284
    .line 1285
    check-cast v4, La/rmk;

    .line 1286
    .line 1287
    goto :goto_25

    .line 1288
    :cond_3d
    move-object v4, v3

    .line 1289
    :goto_25
    if-eqz v4, :cond_3e

    .line 1290
    .line 1291
    iget v4, v4, La/rmk;->a:I

    .line 1292
    .line 1293
    new-instance v6, Landroid/os/Bundle;

    .line 1294
    .line 1295
    move/from16 v8, v18

    .line 1296
    .line 1297
    invoke-direct {v6, v8}, Landroid/os/Bundle;-><init>(I)V

    .line 1298
    .line 1299
    .line 1300
    new-instance v8, Landroid/graphics/Point;

    .line 1301
    .line 1302
    invoke-direct {v8, v5, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 1303
    .line 1304
    .line 1305
    const-string v4, "android.content.extra.SIZE"

    .line 1306
    .line 1307
    invoke-virtual {v6, v4, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1308
    .line 1309
    .line 1310
    goto :goto_26

    .line 1311
    :cond_3e
    move-object v6, v3

    .line 1312
    :goto_26
    invoke-static {v2, v1, v6}, La/y5a;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v4

    .line 1316
    if-eqz v4, :cond_3f

    .line 1317
    .line 1318
    goto :goto_28

    .line 1319
    :cond_3f
    const-string v0, "Unable to find a music thumbnail associated with \'"

    .line 1320
    .line 1321
    invoke-static {v1, v7, v0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    goto :goto_23

    .line 1325
    :cond_40
    :goto_27
    invoke-virtual {v2, v1, v6}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v4

    .line 1329
    if-eqz v4, :cond_41

    .line 1330
    .line 1331
    :goto_28
    new-instance v14, La/hmk0;

    .line 1332
    .line 1333
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    invoke-static {v3}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    new-instance v5, La/zae0;

    .line 1342
    .line 1343
    invoke-direct {v5, v3}, La/zae0;-><init>(La/emk0;)V

    .line 1344
    .line 1345
    .line 1346
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 1347
    .line 1348
    new-instance v3, La/xfe;

    .line 1349
    .line 1350
    invoke-direct {v3, v4}, La/xfe;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    .line 1351
    .line 1352
    .line 1353
    new-instance v4, La/imk0;

    .line 1354
    .line 1355
    invoke-direct {v4, v5, v0, v3}, La/imk0;-><init>(La/u99;La/yzp;La/x1x;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    sget-object v1, La/ibj;->c:La/ibj;

    .line 1363
    .line 1364
    invoke-direct {v14, v4, v0, v1}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 1365
    .line 1366
    .line 1367
    goto :goto_29

    .line 1368
    :cond_41
    const-string v0, "Unable to open \'"

    .line 1369
    .line 1370
    invoke-static {v1, v7, v0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    goto/16 :goto_23

    .line 1374
    .line 1375
    :goto_29
    return-object v14

    .line 1376
    :pswitch_4
    move-object v3, v14

    .line 1377
    invoke-static {v13}, La/dqm0;->q(La/aot0;)Ljava/util/List;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v1

    .line 1381
    const/4 v8, 0x1

    .line 1382
    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v12

    .line 1386
    const/16 v16, 0x0

    .line 1387
    .line 1388
    const/16 v17, 0x3e

    .line 1389
    .line 1390
    const-string v13, "/"

    .line 1391
    .line 1392
    const/4 v14, 0x0

    .line 1393
    const/4 v15, 0x0

    .line 1394
    invoke-static/range {v12 .. v17}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    new-instance v2, La/hmk0;

    .line 1399
    .line 1400
    iget-object v4, v0, La/a780;->a:Landroid/content/Context;

    .line 1401
    .line 1402
    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v4

    .line 1406
    invoke-virtual {v4, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    invoke-static {v4}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v4

    .line 1414
    new-instance v8, La/zae0;

    .line 1415
    .line 1416
    invoke-direct {v8, v4}, La/zae0;-><init>(La/emk0;)V

    .line 1417
    .line 1418
    .line 1419
    iget-object v0, v0, La/a780;->f:La/yzp;

    .line 1420
    .line 1421
    new-instance v4, La/oy3;

    .line 1422
    .line 1423
    invoke-direct {v4, v1}, La/oy3;-><init>(Ljava/lang/String;)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v9, La/imk0;

    .line 1427
    .line 1428
    invoke-direct {v9, v8, v0, v4}, La/imk0;-><init>(La/u99;La/yzp;La/x1x;)V

    .line 1429
    .line 1430
    .line 1431
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v0

    .line 1435
    if-eqz v0, :cond_42

    .line 1436
    .line 1437
    :goto_2a
    move-object v14, v3

    .line 1438
    goto :goto_2b

    .line 1439
    :cond_42
    invoke-static {v1, v7}, Lkotlin/text/StringsKt;->s0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    invoke-static {v0, v6}, Lkotlin/text/StringsKt;->s0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    invoke-static {v5, v0, v0}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-static {v11, v0, v10}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1456
    .line 1457
    .line 1458
    move-result v1

    .line 1459
    if-eqz v1, :cond_43

    .line 1460
    .line 1461
    goto :goto_2a

    .line 1462
    :cond_43
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1463
    .line 1464
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    sget-object v1, La/ng40;->a:La/jo20;

    .line 1472
    .line 1473
    invoke-virtual {v1, v0}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    move-object v14, v1

    .line 1478
    check-cast v14, Ljava/lang/String;

    .line 1479
    .line 1480
    if-nez v14, :cond_44

    .line 1481
    .line 1482
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v1

    .line 1486
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v14

    .line 1490
    :cond_44
    :goto_2b
    sget-object v0, La/ibj;->c:La/ibj;

    .line 1491
    .line 1492
    invoke-direct {v2, v9, v14, v0}, La/hmk0;-><init>(La/y1x;Ljava/lang/String;La/ibj;)V

    .line 1493
    .line 1494
    .line 1495
    return-object v2

    .line 1496
    nop

    .line 1497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
