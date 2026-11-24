.class public final La/uzg0;
.super La/j47;
.source "SourceFile"


# instance fields
.field public final u:Landroid/os/Bundle;

.field public final v:La/rzg0;

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;La/rzg0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 8
    .line 9
    iput-object p2, p0, La/uzg0;->v:La/rzg0;

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    iput-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C(La/jiy;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/pzg0;->a:La/ugi0;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object p1, La/lvb;->a:La/lvb;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p2, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-static {p0, p2}, La/lvb;->b(La/bwn;Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v1, La/pzg0;->b:La/ugi0;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    sget-object p1, La/lwj;->b:La/lwj;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast p2, Landroid/os/Parcelable;

    .line 41
    .line 42
    invoke-virtual {p1, p0, p2}, La/lwj;->b(La/bwn;Landroid/os/Parcelable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    sget-object v1, La/pzg0;->c:La/ugi0;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    sget-object p1, La/lvj;->b:La/lvj;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p2, Ljava/io/Serializable;

    .line 60
    .line 61
    invoke-virtual {p1, p0, p2}, La/lvj;->b(La/bwn;Ljava/io/Serializable;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    sget-object v1, La/pzg0;->d:La/ugi0;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    sget-object p1, La/huw;->a:La/wgi0;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast p2, Landroid/os/IBinder;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    instance-of p1, p0, La/uzg0;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 93
    .line 94
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    sget-object p1, La/huw;->a:La/wgi0;

    .line 99
    .line 100
    iget-object p1, p1, La/wgi0;->a:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {p1, p0}, La/h8x;->G(Ljava/lang/String;La/bwn;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    return-void

    .line 110
    :cond_4
    sget-object v1, La/pzg0;->i:La/uw3;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_1e

    .line 117
    .line 118
    sget-object v1, La/pzg0;->j:La/uw3;

    .line 119
    .line 120
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_5
    sget-object v1, La/pzg0;->k:La/uw3;

    .line 129
    .line 130
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_1d

    .line 135
    .line 136
    sget-object v1, La/pzg0;->l:La/uw3;

    .line 137
    .line 138
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_6
    sget-object v1, La/pzg0;->e:La/uw3;

    .line 147
    .line 148
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_1b

    .line 153
    .line 154
    sget-object v1, La/pzg0;->f:La/uw3;

    .line 155
    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_7
    sget-object v1, La/pzg0;->g:La/uw3;

    .line 165
    .line 166
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_1a

    .line 171
    .line 172
    sget-object v1, La/pzg0;->h:La/uw3;

    .line 173
    .line 174
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_8

    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :cond_8
    sget-object v1, La/pzg0;->m:La/ugi0;

    .line 183
    .line 184
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-nez v1, :cond_19

    .line 189
    .line 190
    sget-object v1, La/pzg0;->n:La/ugi0;

    .line 191
    .line 192
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_19

    .line 197
    .line 198
    sget-object v1, La/pzg0;->o:La/ugi0;

    .line 199
    .line 200
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_9

    .line 205
    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_9
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget-object v1, La/ozg0;->a:La/uw3;

    .line 213
    .line 214
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    iget-object v2, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 219
    .line 220
    if-eqz v1, :cond_a

    .line 221
    .line 222
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    check-cast p2, Ljava/util/List;

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {p2}, La/l8x;->q0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {v2, p0, p1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_a
    sget-object v1, La/ozg0;->b:La/uw3;

    .line 241
    .line 242
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_b

    .line 247
    .line 248
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    check-cast p2, Ljava/util/List;

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-static {p2}, La/l8x;->q0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {v2, p0, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_b
    sget-object v1, La/ozg0;->c:La/uw3;

    .line 267
    .line 268
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_c

    .line 273
    .line 274
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    check-cast p2, Ljava/util/List;

    .line 280
    .line 281
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->F0(Ljava/util/List;)[Z

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, p0, p1}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_c
    sget-object v1, La/ozg0;->d:La/uw3;

    .line 293
    .line 294
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_d

    .line 299
    .line 300
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast p2, Ljava/util/List;

    .line 306
    .line 307
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->M0(Ljava/util/Collection;)[J

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, p0, p1}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_d
    sget-object v1, La/ozg0;->e:La/uw3;

    .line 319
    .line 320
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_e

    .line 325
    .line 326
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    check-cast p2, Ljava/util/List;

    .line 332
    .line 333
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->I0(Ljava/util/Collection;)[F

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, p0, p1}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_e
    sget-object v1, La/ozg0;->f:La/uw3;

    .line 345
    .line 346
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_10

    .line 351
    .line 352
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    check-cast p2, Ljava/util/List;

    .line 358
    .line 359
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    new-array p1, p1, [D

    .line 364
    .line 365
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    const/4 v0, 0x0

    .line 370
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_f

    .line 375
    .line 376
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/lang/Number;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 383
    .line 384
    .line 385
    move-result-wide v3

    .line 386
    add-int/lit8 v1, v0, 0x1

    .line 387
    .line 388
    aput-wide v3, p1, v0

    .line 389
    .line 390
    move v0, v1

    .line 391
    goto :goto_1

    .line 392
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, p0, p1}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :cond_10
    sget-object v1, La/ozg0;->g:La/uw3;

    .line 400
    .line 401
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_11

    .line 406
    .line 407
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    check-cast p2, Ljava/util/List;

    .line 413
    .line 414
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->H0(Ljava/util/List;)[C

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, p0, p1}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_11
    sget-object v1, La/ozg0;->h:La/vvb0;

    .line 426
    .line 427
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_12

    .line 432
    .line 433
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    check-cast p2, [Z

    .line 439
    .line 440
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, p0, p2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :cond_12
    sget-object v1, La/ozg0;->i:La/vvb0;

    .line 448
    .line 449
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_13

    .line 454
    .line 455
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 456
    .line 457
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    check-cast p2, [C

    .line 461
    .line 462
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2, p0, p2}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_13
    sget-object v1, La/ozg0;->j:La/vvb0;

    .line 470
    .line 471
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-eqz v1, :cond_14

    .line 476
    .line 477
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    check-cast p2, [D

    .line 483
    .line 484
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, p0, p2}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :cond_14
    sget-object v1, La/ozg0;->k:La/vvb0;

    .line 492
    .line 493
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-eqz v1, :cond_15

    .line 498
    .line 499
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    check-cast p2, [F

    .line 505
    .line 506
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, p0, p2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :cond_15
    sget-object v1, La/ozg0;->l:La/vvb0;

    .line 514
    .line 515
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_16

    .line 520
    .line 521
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    check-cast p2, [I

    .line 527
    .line 528
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, p0, p2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :cond_16
    sget-object v1, La/ozg0;->m:La/vvb0;

    .line 536
    .line 537
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    if-eqz v1, :cond_17

    .line 542
    .line 543
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 544
    .line 545
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    check-cast p2, [J

    .line 549
    .line 550
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, p0, p2}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_17
    sget-object v1, La/ozg0;->n:La/uw3;

    .line 558
    .line 559
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_18

    .line 564
    .line 565
    iget-object p0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 566
    .line 567
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    check-cast p2, [Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2, p0, p2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :cond_18
    invoke-interface {p1, p0, p2}, La/jiy;->serialize(La/bwn;Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :cond_19
    :goto_2
    sget-object p1, La/knk0;->a:La/knk0;

    .line 584
    .line 585
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    check-cast p2, Landroid/util/SparseArray;

    .line 589
    .line 590
    invoke-virtual {p1, p0, p2}, La/knk0;->b(La/bwn;Landroid/util/SparseArray;)V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :cond_1a
    :goto_3
    sget-object p1, La/dp80;->a:La/dp80;

    .line 595
    .line 596
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    check-cast p2, Ljava/util/List;

    .line 600
    .line 601
    invoke-virtual {p1, p0, p2}, La/dp80;->b(La/bwn;Ljava/util/List;)V

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :cond_1b
    :goto_4
    sget-object p1, La/cp80;->a:La/wgi0;

    .line 606
    .line 607
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    check-cast p2, [Landroid/os/Parcelable;

    .line 611
    .line 612
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    instance-of p1, p0, La/uzg0;

    .line 616
    .line 617
    if-eqz p1, :cond_1c

    .line 618
    .line 619
    iget-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 620
    .line 621
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 625
    .line 626
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 627
    .line 628
    .line 629
    goto :goto_5

    .line 630
    :cond_1c
    sget-object p1, La/cp80;->a:La/wgi0;

    .line 631
    .line 632
    iget-object p1, p1, La/wgi0;->a:Ljava/lang/String;

    .line 633
    .line 634
    invoke-static {p1, p0}, La/h8x;->G(Ljava/lang/String;La/bwn;)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    :goto_5
    return-void

    .line 642
    :cond_1d
    :goto_6
    sget-object p1, La/hvb;->a:La/hvb;

    .line 643
    .line 644
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    check-cast p2, Ljava/util/List;

    .line 648
    .line 649
    invoke-virtual {p1, p0, p2}, La/hvb;->b(La/bwn;Ljava/util/List;)V

    .line 650
    .line 651
    .line 652
    return-void

    .line 653
    :cond_1e
    :goto_7
    sget-object p1, La/cvb;->a:La/wgi0;

    .line 654
    .line 655
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    check-cast p2, [Ljava/lang/CharSequence;

    .line 659
    .line 660
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    instance-of p1, p0, La/uzg0;

    .line 664
    .line 665
    if-eqz p1, :cond_1f

    .line 666
    .line 667
    iget-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 673
    .line 674
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 675
    .line 676
    .line 677
    goto :goto_8

    .line 678
    :cond_1f
    sget-object p1, La/cvb;->a:La/wgi0;

    .line 679
    .line 680
    iget-object p1, p1, La/wgi0;->a:Ljava/lang/String;

    .line 681
    .line 682
    invoke-static {p1, p0}, La/h8x;->G(Ljava/lang/String;La/bwn;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    :goto_8
    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final a(La/ugi0;)La/cld;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, La/uzg0;->v:La/rzg0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p1, La/lun;->a:La/lun;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    new-array v1, p1, [Lkotlin/Pair;

    .line 27
    .line 28
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Lkotlin/Pair;

    .line 33
    .line 34
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p0, La/uzg0;

    .line 52
    .line 53
    invoke-direct {p0, p1, v0}, La/uzg0;-><init>(Landroid/os/Bundle;La/rzg0;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final b()La/qaj;
    .locals 0

    .line 1
    iget-object p0, p0, La/uzg0;->v:La/rzg0;

    .line 2
    .line 3
    iget-object p0, p0, La/rzg0;->a:La/qaj;

    .line 4
    .line 5
    return-object p0
.end method

.method public final g(D)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h(B)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final l(J)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(S)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(F)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final u(La/ugi0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/uzg0;->v:La/rzg0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final v0(La/ugi0;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, La/ugi0;->e(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, La/uzg0;->v:La/rzg0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final w(C)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uzg0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y(La/ugi0;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/uzg0;->w:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/uzg0;->u:Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
