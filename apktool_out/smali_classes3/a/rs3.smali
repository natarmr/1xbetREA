.class public La/rs3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kxq;

.field public final b:I

.field public final c:Landroidx/fragment/app/e;

.field public final d:La/m1r;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La/kxq;ILandroidx/fragment/app/e;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 35
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    move-result-object p3

    .line 36
    :cond_0
    invoke-virtual {p3}, Landroidx/fragment/app/e;->S()La/m1r;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0, p1, p2, p3, p4}, La/rs3;-><init>(La/kxq;ILandroidx/fragment/app/e;La/m1r;)V

    return-void
.end method

.method public constructor <init>(La/kxq;ILandroidx/fragment/app/e;La/m1r;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/rs3;->a:La/kxq;

    .line 11
    .line 12
    iput p2, p0, La/rs3;->b:I

    .line 13
    .line 14
    iput-object p3, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 15
    .line 16
    iput-object p4, p0, La/rs3;->d:La/m1r;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, La/ur3;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    invoke-direct {p1, p0, p2}, La/ur3;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p1, p2}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a(La/t7d;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/e;->F()V

    .line 7
    .line 8
    .line 9
    instance-of v1, p1, La/x4m0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p1, La/x4m0;

    .line 15
    .line 16
    iget-object p1, p1, La/x4m0;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rs3;->g(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/rs3;->e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of v1, p1, La/gn50;

    .line 37
    .line 38
    const-string v3, "_childScreen"

    .line 39
    .line 40
    iget-object v4, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 41
    .line 42
    const/4 v5, -0x1

    .line 43
    const/4 v6, 0x0

    .line 44
    if-eqz v1, :cond_6

    .line 45
    .line 46
    check-cast p1, La/gn50;

    .line 47
    .line 48
    iget-object p1, p1, La/gn50;->a:Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v7, v3, v6}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    :cond_3
    if-ltz v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-ge v5, v1, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0, p1}, La/rs3;->g(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    add-int/lit8 v1, v5, 0x1

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, v6, v2}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/xkf0;

    .line 115
    .line 116
    invoke-direct {v0, p1}, La/xkf0;-><init>(La/m7h0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/rs3;->h(La/xkf0;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    invoke-virtual {p0, p1}, La/rs3;->g(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 128
    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/rs3;->e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_5
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 138
    .line 139
    if-eqz v0, :cond_3d

    .line 140
    .line 141
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 142
    .line 143
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    instance-of v1, p1, La/afq;

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    if-eqz v1, :cond_b

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :cond_7
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_8

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v1, v3, v6}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_7

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/ListIterator;->nextIndex()I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    goto :goto_0

    .line 183
    :cond_8
    move p1, v5

    .line 184
    :goto_0
    sub-int/2addr p1, v2

    .line 185
    if-ltz p1, :cond_9

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    invoke-virtual {v4, p1, p0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {v0, v6, p1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_9
    if-ne p1, v5, :cond_a

    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v2, v7}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_a
    invoke-virtual {p0}, La/rs3;->c()V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_b
    instance-of v1, p1, La/bc5;

    .line 226
    .line 227
    if-eqz v1, :cond_10

    .line 228
    .line 229
    check-cast p1, La/bc5;

    .line 230
    .line 231
    iget-object p1, p1, La/bc5;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    move v7, v6

    .line 238
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-eqz v8, :cond_d

    .line 243
    .line 244
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    check-cast v8, Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v8, v3}, Lkotlin/text/StringsKt;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_c

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_d
    move v7, v5

    .line 269
    :goto_2
    if-eq v7, v5, :cond_e

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    invoke-virtual {v4, v7, p0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {v0, v6, p1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_e
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 297
    .line 298
    if-eqz v0, :cond_f

    .line 299
    .line 300
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, La/rs3;->e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_f
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_10
    instance-of v1, p1, La/lvk;

    .line 311
    .line 312
    iget v8, p0, La/rs3;->b:I

    .line 313
    .line 314
    if-eqz v1, :cond_12

    .line 315
    .line 316
    check-cast p1, La/lvk;

    .line 317
    .line 318
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    if-nez p0, :cond_11

    .line 323
    .line 324
    goto/16 :goto_f

    .line 325
    .line 326
    :cond_11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    throw v7

    .line 334
    :cond_12
    instance-of v1, p1, La/kvk;

    .line 335
    .line 336
    if-eqz v1, :cond_1c

    .line 337
    .line 338
    check-cast p1, La/kvk;

    .line 339
    .line 340
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    if-nez p0, :cond_13

    .line 345
    .line 346
    goto/16 :goto_f

    .line 347
    .line 348
    :cond_13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v1, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 356
    .line 357
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-static {v1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    :cond_14
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_15

    .line 374
    .line 375
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    instance-of v4, v3, La/of80;

    .line 380
    .line 381
    if-eqz v4, :cond_14

    .line 382
    .line 383
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_15
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_16

    .line 392
    .line 393
    goto/16 :goto_f

    .line 394
    .line 395
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-eqz v3, :cond_18

    .line 404
    .line 405
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    move-object v4, v3

    .line 410
    check-cast v4, La/of80;

    .line 411
    .line 412
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    if-eqz v4, :cond_17

    .line 419
    .line 420
    move-object v7, v3

    .line 421
    :cond_18
    check-cast v7, La/of80;

    .line 422
    .line 423
    if-nez v7, :cond_19

    .line 424
    .line 425
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    move-object v7, v1

    .line 430
    check-cast v7, La/of80;

    .line 431
    .line 432
    :cond_19
    iget-boolean v1, p1, La/kvk;->b:Z

    .line 433
    .line 434
    if-eqz v1, :cond_1a

    .line 435
    .line 436
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    if-eqz v1, :cond_1a

    .line 441
    .line 442
    new-instance v2, La/zb5;

    .line 443
    .line 444
    invoke-direct {v2, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v1}, La/zb5;->j(Landroidx/fragment/app/Fragment;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2}, La/zb5;->f()V

    .line 451
    .line 452
    .line 453
    new-instance v2, La/zb5;

    .line 454
    .line 455
    invoke-direct {v2, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 456
    .line 457
    .line 458
    new-instance v0, La/h6r;

    .line 459
    .line 460
    const/4 v3, 0x7

    .line 461
    invoke-direct {v0, v3, v1}, La/h6r;-><init>(ILandroidx/fragment/app/Fragment;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v0}, La/zb5;->b(La/h6r;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, La/zb5;->f()V

    .line 468
    .line 469
    .line 470
    :cond_1a
    iget-boolean p1, p1, La/kvk;->a:Z

    .line 471
    .line 472
    if-eqz p1, :cond_1b

    .line 473
    .line 474
    invoke-virtual {v7}, La/sik;->y0()V

    .line 475
    .line 476
    .line 477
    goto :goto_4

    .line 478
    :cond_1b
    invoke-virtual {v7, v6, v6, v6}, La/sik;->z0(ZZZ)V

    .line 479
    .line 480
    .line 481
    :goto_4
    invoke-virtual {p0}, Landroidx/fragment/app/e;->F()V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_1c
    instance-of v1, p1, La/psj0;

    .line 486
    .line 487
    if-eqz v1, :cond_21

    .line 488
    .line 489
    check-cast p1, La/psj0;

    .line 490
    .line 491
    iget-object v1, p1, La/psj0;->a:Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 492
    .line 493
    iget-object p0, p0, La/rs3;->d:La/m1r;

    .line 494
    .line 495
    invoke-interface {v1, p0}, Lorg/xplatform/core/navigation/dialog/DialogScreen;->d(La/m1r;)La/of80;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    invoke-interface {v1}, La/m7h0;->b()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    if-eqz v2, :cond_1e

    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    if-nez v2, :cond_1d

    .line 514
    .line 515
    goto :goto_5

    .line 516
    :cond_1d
    move-object v0, v2

    .line 517
    :cond_1e
    :goto_5
    iget-boolean v2, p1, La/psj0;->c:Z

    .line 518
    .line 519
    if-nez v2, :cond_1f

    .line 520
    .line 521
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    if-eqz v2, :cond_1f

    .line 526
    .line 527
    goto/16 :goto_f

    .line 528
    .line 529
    :cond_1f
    iget-boolean p1, p1, La/psj0;->b:Z

    .line 530
    .line 531
    if-eqz p1, :cond_20

    .line 532
    .line 533
    invoke-static {p0, v0, v1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :cond_20
    invoke-virtual {p0, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :cond_21
    instance-of v1, p1, La/gw70;

    .line 542
    .line 543
    iget-object v9, p0, La/rs3;->a:La/kxq;

    .line 544
    .line 545
    if-eqz v1, :cond_2e

    .line 546
    .line 547
    check-cast p1, La/gw70;

    .line 548
    .line 549
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    instance-of p0, v9, La/evv0;

    .line 553
    .line 554
    if-eqz p0, :cond_22

    .line 555
    .line 556
    check-cast v9, La/evv0;

    .line 557
    .line 558
    goto :goto_6

    .line 559
    :cond_22
    move-object v9, v7

    .line 560
    :goto_6
    if-nez v9, :cond_23

    .line 561
    .line 562
    goto/16 :goto_f

    .line 563
    .line 564
    :cond_23
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    iget-object v0, p1, La/gw70;->b:Lkotlin/jvm/functions/Function2;

    .line 569
    .line 570
    iget-object p1, p1, La/gw70;->a:La/lwv0;

    .line 571
    .line 572
    if-eqz v0, :cond_26

    .line 573
    .line 574
    move-object v1, v9

    .line 575
    check-cast v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 576
    .line 577
    iget-object v1, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->Y:La/fwv0;

    .line 578
    .line 579
    if-eqz v1, :cond_25

    .line 580
    .line 581
    if-eqz p0, :cond_24

    .line 582
    .line 583
    invoke-static {p0}, La/ltt0;->v(Landroidx/fragment/app/Fragment;)La/kvv0;

    .line 584
    .line 585
    .line 586
    move-result-object v7

    .line 587
    :cond_24
    invoke-interface {v0, v1, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    check-cast v0, La/vsv0;

    .line 592
    .line 593
    if-eqz v0, :cond_26

    .line 594
    .line 595
    goto :goto_7

    .line 596
    :cond_25
    const-string p0, "xBottomSheetResultReceiver"

    .line 597
    .line 598
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    throw v7

    .line 602
    :cond_26
    sget-object v0, La/vsv0;->a:La/vsv0;

    .line 603
    .line 604
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    if-eqz v0, :cond_2c

    .line 609
    .line 610
    if-eq v0, v2, :cond_28

    .line 611
    .line 612
    const/4 p0, 0x2

    .line 613
    if-ne v0, p0, :cond_27

    .line 614
    .line 615
    goto/16 :goto_f

    .line 616
    .line 617
    :cond_27
    invoke-static {}, La/t9f;->b()V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :cond_28
    if-eqz p0, :cond_3d

    .line 622
    .line 623
    check-cast v9, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 624
    .line 625
    invoke-virtual {v9}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->G()La/hsv0;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    iget-object v1, v0, La/hsv0;->b:La/jvv0;

    .line 630
    .line 631
    iget-object v3, v0, La/hsv0;->d:Ljava/util/ArrayList;

    .line 632
    .line 633
    iget-object v4, v0, La/hsv0;->c:La/u950;

    .line 634
    .line 635
    if-eqz v4, :cond_29

    .line 636
    .line 637
    invoke-virtual {v4, p1}, La/u950;->contains(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    if-ne v4, v2, :cond_29

    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_29
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    if-eqz v2, :cond_2a

    .line 649
    .line 650
    :goto_8
    invoke-virtual {v1, p1, p0}, La/jvv0;->a(La/lwv0;Landroidx/fragment/app/Fragment;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :cond_2a
    iget-object v2, v0, La/hsv0;->c:La/u950;

    .line 655
    .line 656
    if-nez v2, :cond_2b

    .line 657
    .line 658
    invoke-virtual {v0, v3, p1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    goto :goto_9

    .line 665
    :cond_2b
    invoke-virtual {v0, v2, p1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2, p1}, La/u950;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    :goto_9
    invoke-virtual {v1, p1, p0}, La/jvv0;->a(La/lwv0;Landroidx/fragment/app/Fragment;)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :cond_2c
    check-cast v9, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 676
    .line 677
    invoke-virtual {v9}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->G()La/hsv0;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    iget-object v1, v0, La/hsv0;->c:La/u950;

    .line 682
    .line 683
    if-nez v1, :cond_2d

    .line 684
    .line 685
    iget-object v1, v0, La/hsv0;->d:Ljava/util/ArrayList;

    .line 686
    .line 687
    invoke-virtual {v0, v1, p1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    goto :goto_a

    .line 694
    :cond_2d
    invoke-virtual {v0, v1, p1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, p1}, La/u950;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    :goto_a
    if-eqz p0, :cond_3d

    .line 701
    .line 702
    iget-object v0, v0, La/hsv0;->b:La/jvv0;

    .line 703
    .line 704
    invoke-virtual {v0, p1, p0}, La/jvv0;->a(La/lwv0;Landroidx/fragment/app/Fragment;)V

    .line 705
    .line 706
    .line 707
    return-void

    .line 708
    :cond_2e
    instance-of v1, p1, La/ivk;

    .line 709
    .line 710
    if-eqz v1, :cond_31

    .line 711
    .line 712
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    instance-of p0, v9, La/evv0;

    .line 716
    .line 717
    if-eqz p0, :cond_2f

    .line 718
    .line 719
    check-cast v9, La/evv0;

    .line 720
    .line 721
    goto :goto_b

    .line 722
    :cond_2f
    move-object v9, v7

    .line 723
    :goto_b
    if-nez v9, :cond_30

    .line 724
    .line 725
    goto/16 :goto_f

    .line 726
    .line 727
    :cond_30
    check-cast v9, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 728
    .line 729
    invoke-virtual {v9}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->G()La/hsv0;

    .line 730
    .line 731
    .line 732
    check-cast p1, La/ivk;

    .line 733
    .line 734
    throw v7

    .line 735
    :cond_31
    instance-of v1, p1, La/jvk;

    .line 736
    .line 737
    if-eqz v1, :cond_34

    .line 738
    .line 739
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    instance-of p0, v9, La/evv0;

    .line 743
    .line 744
    if-eqz p0, :cond_32

    .line 745
    .line 746
    check-cast v9, La/evv0;

    .line 747
    .line 748
    goto :goto_c

    .line 749
    :cond_32
    move-object v9, v7

    .line 750
    :goto_c
    if-nez v9, :cond_33

    .line 751
    .line 752
    goto/16 :goto_f

    .line 753
    .line 754
    :cond_33
    check-cast v9, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 755
    .line 756
    invoke-virtual {v9}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->G()La/hsv0;

    .line 757
    .line 758
    .line 759
    check-cast p1, La/jvk;

    .line 760
    .line 761
    throw v7

    .line 762
    :cond_34
    instance-of v1, p1, La/dwq;

    .line 763
    .line 764
    if-eqz v1, :cond_36

    .line 765
    .line 766
    check-cast p1, La/dwq;

    .line 767
    .line 768
    iget-object p1, p1, La/dwq;->a:La/m7h0;

    .line 769
    .line 770
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 771
    .line 772
    if-eqz v0, :cond_35

    .line 773
    .line 774
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 775
    .line 776
    invoke-virtual {p0, p1}, La/rs3;->e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    :cond_35
    instance-of v0, p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 781
    .line 782
    if-eqz v0, :cond_3d

    .line 783
    .line 784
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 785
    .line 786
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 787
    .line 788
    .line 789
    return-void

    .line 790
    :cond_36
    instance-of v1, p1, La/xkf0;

    .line 791
    .line 792
    if-eqz v1, :cond_37

    .line 793
    .line 794
    check-cast p1, La/xkf0;

    .line 795
    .line 796
    invoke-virtual {p0, p1}, La/rs3;->h(La/xkf0;)V

    .line 797
    .line 798
    .line 799
    return-void

    .line 800
    :cond_37
    instance-of v1, p1, La/ac5;

    .line 801
    .line 802
    if-eqz v1, :cond_3c

    .line 803
    .line 804
    check-cast p1, La/ac5;

    .line 805
    .line 806
    iget-object p1, p1, La/ac5;->a:La/m7h0;

    .line 807
    .line 808
    if-nez p1, :cond_38

    .line 809
    .line 810
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0, v2, v7}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 814
    .line 815
    .line 816
    return-void

    .line 817
    :cond_38
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    move v2, v6

    .line 822
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 823
    .line 824
    .line 825
    move-result v7

    .line 826
    if-eqz v7, :cond_3a

    .line 827
    .line 828
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v7

    .line 832
    check-cast v7, Ljava/lang/String;

    .line 833
    .line 834
    invoke-static {v7, v3}, Lkotlin/text/StringsKt;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    if-eqz v7, :cond_39

    .line 847
    .line 848
    goto :goto_e

    .line 849
    :cond_39
    add-int/lit8 v2, v2, 0x1

    .line 850
    .line 851
    goto :goto_d

    .line 852
    :cond_3a
    move v2, v5

    .line 853
    :goto_e
    if-eq v2, v5, :cond_3b

    .line 854
    .line 855
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 856
    .line 857
    .line 858
    move-result p0

    .line 859
    invoke-virtual {v4, v2, p0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 860
    .line 861
    .line 862
    move-result-object p0

    .line 863
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object p1

    .line 867
    check-cast p1, Ljava/lang/String;

    .line 868
    .line 869
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    invoke-virtual {v0, v6, p1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    :cond_3b
    invoke-virtual {p0, p1}, La/rs3;->d(La/m7h0;)V

    .line 881
    .line 882
    .line 883
    return-void

    .line 884
    :cond_3c
    instance-of p1, p1, La/nb5;

    .line 885
    .line 886
    if-eqz p1, :cond_3d

    .line 887
    .line 888
    invoke-virtual {p0}, La/rs3;->c()V

    .line 889
    .line 890
    .line 891
    :cond_3d
    :goto_f
    return-void
.end method

.method public final b([La/t7d;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/e;->F()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-lez v2, :cond_1

    .line 20
    .line 21
    move v4, v3

    .line 22
    :goto_0
    add-int/lit8 v5, v4, 0x1

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v4, v4, La/zb5;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    if-lt v5, v2, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v4, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    array-length v0, p1

    .line 42
    :goto_2
    if-ge v3, v0, :cond_2

    .line 43
    .line 44
    aget-object v1, p1, v3

    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {p0, v1}, La/rs3;->a(La/t7d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catch_0
    move-exception p0

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    return-void
.end method

.method public c()V
    .locals 5

    .line 1
    iget-object v0, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, La/t1r;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v1, p0, v2, v3, v4}, La/t1r;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v4}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/lit8 p0, p0, -0x1

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p0, p0, La/rs3;->a:La/kxq;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public d(La/m7h0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/4 v0, 0x1

    .line 11
    iget-object p0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;

    .line 2
    .line 3
    iget-object p0, p0, La/rs3;->a:La/kxq;

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;->c(Landroid/content/Context;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, "_dialogScreen"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v1, p0, La/rs3;->d:La/m1r;

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v3, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v4, La/zb5;

    .line 46
    .line 47
    invoke-direct {v4, v3}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    iput-boolean v5, v4, La/zb5;->p:Z

    .line 52
    .line 53
    iget v6, p0, La/rs3;->b:I

    .line 54
    .line 55
    invoke-virtual {v3, v6}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {p0, p1, v4, v3, v1}, La/rs3;->i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    .line 60
    .line 61
    .line 62
    instance-of p0, v1, La/sik;

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v3, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_0
    if-nez p0, :cond_3

    .line 80
    .line 81
    invoke-interface {p1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->g()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {v4, v6, v1, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v4, v6, v1, v0, v5}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-virtual {v4, v0}, La/zb5;->c(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    if-eqz p0, :cond_5

    .line 103
    .line 104
    check-cast v1, La/sik;

    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    iput-boolean p0, v1, La/sik;->V1:Z

    .line 108
    .line 109
    iput-boolean v5, v1, La/sik;->W1:Z

    .line 110
    .line 111
    invoke-virtual {v4, p0, v1, v0, v5}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    iput-boolean p0, v1, La/sik;->U1:Z

    .line 115
    .line 116
    invoke-virtual {v4, p0, v5}, La/zb5;->g(ZZ)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    iput p0, v1, La/sik;->P1:I

    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    invoke-virtual {v4}, La/zb5;->f()V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final g(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 3

    .line 1
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "_childScreen"

    .line 6
    .line 7
    invoke-static {v0, v1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/uq;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p1, p0, v2}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, v0, v1, p1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public h(La/xkf0;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    const-string v3, "_childScreen"

    .line 13
    .line 14
    invoke-static {v1, v3, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    new-instance v1, La/xkf0;

    .line 21
    .line 22
    iget-object p1, p1, La/xkf0;->a:La/m7h0;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v4, p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/rs3;->g(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v4, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 43
    .line 44
    move-object v4, p1

    .line 45
    check-cast v4, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;

    .line 46
    .line 47
    iget-object v4, v4, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, La/uq;

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    invoke-direct {v4, p1, p0, v5}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;

    .line 60
    .line 61
    invoke-direct {p1, v3, v4}, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/uq;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    invoke-direct {v1, p1}, La/xkf0;-><init>(La/m7h0;)V

    .line 65
    .line 66
    .line 67
    move-object p1, v1

    .line 68
    :cond_3
    iget-object p1, p1, La/xkf0;->a:La/m7h0;

    .line 69
    .line 70
    instance-of v1, p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, La/rs3;->e(Lcom/github/terrakok/cicerone/androidx/ActivityScreen;)V

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, La/rs3;->a:La/kxq;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    instance-of v1, p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    iget-object v1, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v3, La/t1r;

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, -0x1

    .line 104
    invoke-direct {v3, v1, v4, v5, v2}, La/t1r;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3, v2}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const/4 v2, 0x1

    .line 115
    sub-int/2addr v1, v2

    .line 116
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_5
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 126
    .line 127
    invoke-virtual {p0, p1, v2}, La/rs3;->f(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Z)V

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
.end method

.method public i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
