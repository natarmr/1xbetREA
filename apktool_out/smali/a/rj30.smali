.class public final synthetic La/rj30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sj30;


# direct methods
.method public synthetic constructor <init>(La/sj30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rj30;->a:B

    iput-object p1, p0, La/rj30;->b:La/sj30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/rj30;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rj30;->b:La/sj30;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/sj30;->f:La/i7z;

    .line 9
    .line 10
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, La/s460;->w:La/s460;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v1, La/c810;->p:La/d810;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, v0, La/i7z;->a:La/e7z;

    .line 22
    .line 23
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, La/cg80;->getPlacementScope()La/ou90;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iget-object v2, p0, La/sj30;->i1:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v3, p0, La/sj30;->j1:La/dfv;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-wide v4, p0, La/sj30;->k1:J

    .line 42
    .line 43
    iget p0, p0, La/sj30;->l1:F

    .line 44
    .line 45
    invoke-virtual {v1, v0}, La/ou90;->e(La/pu90;)V

    .line 46
    .line 47
    .line 48
    iget-wide v1, v0, La/pu90;->e:J

    .line 49
    .line 50
    invoke-static {v4, v5, v1, v2}, La/ikx;->d(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {v0, v1, v2, p0, v3}, La/s460;->l0(JFLa/dfv;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    if-nez v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-wide v2, p0, La/sj30;->k1:J

    .line 65
    .line 66
    iget p0, p0, La/sj30;->l1:F

    .line 67
    .line 68
    invoke-virtual {v1, v0}, La/ou90;->e(La/pu90;)V

    .line 69
    .line 70
    .line 71
    iget-wide v4, v0, La/pu90;->e:J

    .line 72
    .line 73
    invoke-static {v2, v3, v4, v5}, La/ikx;->d(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual {v0, v1, v2, p0, v3}, La/pu90;->n0(JFLkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-wide v3, p0, La/sj30;->k1:J

    .line 87
    .line 88
    iget p0, p0, La/sj30;->l1:F

    .line 89
    .line 90
    invoke-virtual {v1, v0}, La/ou90;->e(La/pu90;)V

    .line 91
    .line 92
    .line 93
    iget-wide v5, v0, La/pu90;->e:J

    .line 94
    .line 95
    invoke-static {v3, v4, v5, v6}, La/ikx;->d(JJ)J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    invoke-virtual {v0, v3, v4, p0, v2}, La/pu90;->n0(JFLkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_0
    iget-object v0, p0, La/sj30;->f:La/i7z;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    iput v1, v0, La/i7z;->i:I

    .line 109
    .line 110
    iget-object v0, v0, La/i7z;->a:La/e7z;

    .line 111
    .line 112
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 117
    .line 118
    iget v2, v2, La/xz40;->c:I

    .line 119
    .line 120
    move v4, v1

    .line 121
    :goto_2
    const v5, 0x7fffffff

    .line 122
    .line 123
    .line 124
    if-ge v4, v2, :cond_4

    .line 125
    .line 126
    aget-object v6, v3, v4

    .line 127
    .line 128
    check-cast v6, La/e7z;

    .line 129
    .line 130
    iget-object v6, v6, La/e7z;->i1:La/i7z;

    .line 131
    .line 132
    iget-object v6, v6, La/i7z;->p:La/sj30;

    .line 133
    .line 134
    iget v7, v6, La/sj30;->i:I

    .line 135
    .line 136
    iput v7, v6, La/sj30;->h:I

    .line 137
    .line 138
    iput v5, v6, La/sj30;->i:I

    .line 139
    .line 140
    iput-boolean v1, v6, La/sj30;->u:Z

    .line 141
    .line 142
    iget-object v5, v6, La/sj30;->l:La/c7z;

    .line 143
    .line 144
    sget-object v7, La/c7z;->b:La/c7z;

    .line 145
    .line 146
    if-ne v5, v7, :cond_3

    .line 147
    .line 148
    sget-object v5, La/c7z;->c:La/c7z;

    .line 149
    .line 150
    iput-object v5, v6, La/sj30;->l:La/c7z;

    .line 151
    .line 152
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v2, v2, La/xz40;->c:I

    .line 162
    .line 163
    move v4, v1

    .line 164
    :goto_3
    if-ge v4, v2, :cond_5

    .line 165
    .line 166
    aget-object v6, v3, v4

    .line 167
    .line 168
    check-cast v6, La/e7z;

    .line 169
    .line 170
    iget-object v6, v6, La/e7z;->i1:La/i7z;

    .line 171
    .line 172
    iget-object v6, v6, La/i7z;->p:La/sj30;

    .line 173
    .line 174
    iget-object v6, v6, La/sj30;->y:La/f7z;

    .line 175
    .line 176
    iput-boolean v1, v6, La/f7z;->d:Z

    .line 177
    .line 178
    add-int/lit8 v4, v4, 0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    new-instance v2, La/mie0;

    .line 182
    .line 183
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, La/e7z;->o()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    check-cast v3, La/ty40;

    .line 191
    .line 192
    iget-object v4, v3, La/ty40;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v4, La/xz40;

    .line 195
    .line 196
    iget v4, v4, La/xz40;->c:I

    .line 197
    .line 198
    move v6, v1

    .line 199
    :goto_4
    if-ge v6, v4, :cond_8

    .line 200
    .line 201
    invoke-virtual {v3, v6}, La/ty40;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, La/e7z;

    .line 206
    .line 207
    iget-object v8, v7, La/e7z;->h1:La/tzi;

    .line 208
    .line 209
    iget-object v8, v8, La/tzi;->e:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v8, La/s460;

    .line 212
    .line 213
    iget-boolean v8, v8, La/c810;->o:Z

    .line 214
    .line 215
    if-eqz v8, :cond_7

    .line 216
    .line 217
    iget-object v8, v2, La/mie0;->a:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v8, La/vy40;

    .line 220
    .line 221
    if-nez v8, :cond_6

    .line 222
    .line 223
    new-instance v8, La/vy40;

    .line 224
    .line 225
    invoke-direct {v8}, La/vy40;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v8, v2, La/mie0;->a:Ljava/lang/Object;

    .line 229
    .line 230
    :cond_6
    iput-object v8, v2, La/mie0;->a:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-virtual {v8, v7}, La/vy40;->a(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_7
    iget-object v7, v7, La/e7z;->h1:La/tzi;

    .line 236
    .line 237
    iget-object v7, v7, La/tzi;->e:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v7, La/s460;

    .line 240
    .line 241
    invoke-virtual {p0}, La/sj30;->H()La/rdx;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    iget-boolean v8, v8, La/c810;->o:Z

    .line 246
    .line 247
    iput-boolean v8, v7, La/c810;->o:Z

    .line 248
    .line 249
    add-int/lit8 v6, v6, 0x1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_8
    invoke-virtual {p0}, La/sj30;->H()La/rdx;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0}, La/s460;->N0()La/uj30;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-interface {p0}, La/uj30;->b()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, La/e7z;->o()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    check-cast p0, La/ty40;

    .line 268
    .line 269
    iget-object v3, p0, La/ty40;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v3, La/xz40;

    .line 272
    .line 273
    iget v3, v3, La/xz40;->c:I

    .line 274
    .line 275
    move v4, v1

    .line 276
    :goto_5
    if-ge v4, v3, :cond_a

    .line 277
    .line 278
    invoke-virtual {p0, v4}, La/ty40;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    check-cast v6, La/e7z;

    .line 283
    .line 284
    iget-object v7, v2, La/mie0;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v7, La/vy40;

    .line 287
    .line 288
    if-eqz v7, :cond_9

    .line 289
    .line 290
    invoke-virtual {v7, v6}, La/vy40;->e(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    const/4 v8, 0x1

    .line 295
    if-ne v7, v8, :cond_9

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_9
    move v8, v1

    .line 299
    :goto_6
    iget-object v6, v6, La/e7z;->h1:La/tzi;

    .line 300
    .line 301
    iget-object v6, v6, La/tzi;->e:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v6, La/s460;

    .line 304
    .line 305
    iput-boolean v8, v6, La/c810;->o:Z

    .line 306
    .line 307
    add-int/lit8 v4, v4, 0x1

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_a
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    iget-object v2, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 315
    .line 316
    iget p0, p0, La/xz40;->c:I

    .line 317
    .line 318
    move v3, v1

    .line 319
    :goto_7
    if-ge v3, p0, :cond_e

    .line 320
    .line 321
    aget-object v4, v2, v3

    .line 322
    .line 323
    check-cast v4, La/e7z;

    .line 324
    .line 325
    iget-object v6, v4, La/e7z;->i1:La/i7z;

    .line 326
    .line 327
    iget-object v7, v6, La/i7z;->p:La/sj30;

    .line 328
    .line 329
    iget v7, v7, La/sj30;->h:I

    .line 330
    .line 331
    invoke-virtual {v4}, La/e7z;->w()I

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eq v7, v8, :cond_d

    .line 336
    .line 337
    invoke-virtual {v0}, La/e7z;->P()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, La/e7z;->D()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4}, La/e7z;->w()I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-ne v7, v5, :cond_d

    .line 348
    .line 349
    iget-boolean v7, v6, La/i7z;->c:Z

    .line 350
    .line 351
    if-nez v7, :cond_b

    .line 352
    .line 353
    invoke-static {v4}, La/p7x;->E(La/e7z;)Z

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    if-eqz v4, :cond_c

    .line 358
    .line 359
    :cond_b
    iget-object v4, v6, La/i7z;->q:La/i810;

    .line 360
    .line 361
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v1}, La/i810;->y0(Z)V

    .line 365
    .line 366
    .line 367
    :cond_c
    iget-object v4, v6, La/i7z;->p:La/sj30;

    .line 368
    .line 369
    invoke-virtual {v4}, La/sj30;->z0()V

    .line 370
    .line 371
    .line 372
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_e
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 380
    .line 381
    iget p0, p0, La/xz40;->c:I

    .line 382
    .line 383
    :goto_8
    if-ge v1, p0, :cond_f

    .line 384
    .line 385
    aget-object v2, v0, v1

    .line 386
    .line 387
    check-cast v2, La/e7z;

    .line 388
    .line 389
    iget-object v2, v2, La/e7z;->i1:La/i7z;

    .line 390
    .line 391
    iget-object v2, v2, La/i7z;->p:La/sj30;

    .line 392
    .line 393
    iget-object v2, v2, La/sj30;->y:La/f7z;

    .line 394
    .line 395
    iget-boolean v3, v2, La/f7z;->d:Z

    .line 396
    .line 397
    iput-boolean v3, v2, La/f7z;->e:Z

    .line 398
    .line 399
    add-int/lit8 v1, v1, 0x1

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object p0

    .line 405
    :pswitch_1
    iget-object v0, p0, La/sj30;->f:La/i7z;

    .line 406
    .line 407
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-wide v1, p0, La/sj30;->Y:J

    .line 412
    .line 413
    invoke-interface {v0, v1, v2}, La/pj30;->S(J)La/pu90;

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
