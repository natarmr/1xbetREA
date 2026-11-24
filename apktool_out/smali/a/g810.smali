.class public final synthetic La/g810;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i810;


# direct methods
.method public synthetic constructor <init>(La/i810;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g810;->a:B

    iput-object p1, p0, La/g810;->b:La/i810;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/g810;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/g810;->b:La/i810;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/i810;->f:La/i7z;

    .line 10
    .line 11
    iget-object v2, v0, La/i7z;->a:La/e7z;

    .line 12
    .line 13
    invoke-static {v2}, La/p7x;->E(La/e7z;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-boolean v2, v0, La/i7z;->c:Z

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v2, v2, La/s460;->w:La/s460;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, La/s460;->e1()La/e810;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v1, v2, La/c810;->p:La/d810;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, La/s460;->w:La/s460;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v1, v2, La/c810;->p:La/d810;

    .line 49
    .line 50
    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 51
    .line 52
    iget-object v1, v0, La/i7z;->a:La/e7z;

    .line 53
    .line 54
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, La/cg80;->getPlacementScope()La/ou90;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_2
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, La/s460;->e1()La/e810;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-wide v2, p0, La/i810;->o:J

    .line 74
    .line 75
    invoke-static {v1, v0, v2, v3}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_0
    iget-object v0, p0, La/i810;->f:La/i7z;

    .line 82
    .line 83
    invoke-virtual {v0}, La/i7z;->a()La/s460;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, La/s460;->e1()La/e810;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-wide v1, p0, La/i810;->z:J

    .line 95
    .line 96
    invoke-interface {v0, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1
    iget-object v0, p0, La/i810;->f:La/i7z;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    iput v2, v0, La/i7z;->h:I

    .line 106
    .line 107
    iget-object v0, v0, La/i7z;->a:La/e7z;

    .line 108
    .line 109
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, v3, La/xz40;->a:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v3, v3, La/xz40;->c:I

    .line 116
    .line 117
    move v5, v2

    .line 118
    :goto_1
    const v6, 0x7fffffff

    .line 119
    .line 120
    .line 121
    if-ge v5, v3, :cond_4

    .line 122
    .line 123
    aget-object v7, v4, v5

    .line 124
    .line 125
    check-cast v7, La/e7z;

    .line 126
    .line 127
    iget-object v7, v7, La/e7z;->i1:La/i7z;

    .line 128
    .line 129
    iget-object v7, v7, La/i7z;->q:La/i810;

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget v8, v7, La/i810;->i:I

    .line 135
    .line 136
    iput v8, v7, La/i810;->h:I

    .line 137
    .line 138
    iput v6, v7, La/i810;->i:I

    .line 139
    .line 140
    iget-object v6, v7, La/i810;->j:La/c7z;

    .line 141
    .line 142
    sget-object v8, La/c7z;->b:La/c7z;

    .line 143
    .line 144
    if-ne v6, v8, :cond_3

    .line 145
    .line 146
    sget-object v6, La/c7z;->c:La/c7z;

    .line 147
    .line 148
    iput-object v6, v7, La/i810;->j:La/c7z;

    .line 149
    .line 150
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-object v4, v3, La/xz40;->a:[Ljava/lang/Object;

    .line 158
    .line 159
    iget v3, v3, La/xz40;->c:I

    .line 160
    .line 161
    move v5, v2

    .line 162
    :goto_2
    if-ge v5, v3, :cond_5

    .line 163
    .line 164
    aget-object v7, v4, v5

    .line 165
    .line 166
    check-cast v7, La/e7z;

    .line 167
    .line 168
    iget-object v7, v7, La/e7z;->i1:La/i7z;

    .line 169
    .line 170
    iget-object v7, v7, La/i7z;->q:La/i810;

    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v7, v7, La/i810;->s:La/f7z;

    .line 176
    .line 177
    iput-boolean v2, v7, La/f7z;->d:Z

    .line 178
    .line 179
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    invoke-virtual {p0}, La/i810;->H()La/rdx;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    iget-object p0, p0, La/rdx;->E1:La/qdx;

    .line 187
    .line 188
    if-eqz p0, :cond_10

    .line 189
    .line 190
    new-instance v1, La/mie0;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, La/e7z;->o()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    check-cast v3, La/ty40;

    .line 200
    .line 201
    iget-object v4, v3, La/ty40;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v4, La/xz40;

    .line 204
    .line 205
    iget v4, v4, La/xz40;->c:I

    .line 206
    .line 207
    move v5, v2

    .line 208
    :goto_3
    if-ge v5, v4, :cond_9

    .line 209
    .line 210
    invoke-virtual {v3, v5}, La/ty40;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    check-cast v7, La/e7z;

    .line 215
    .line 216
    iget-object v8, v7, La/e7z;->h1:La/tzi;

    .line 217
    .line 218
    iget-object v8, v8, La/tzi;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v8, La/s460;

    .line 221
    .line 222
    invoke-virtual {v8}, La/s460;->e1()La/e810;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    if-nez v8, :cond_6

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_6
    iget-boolean v9, v8, La/c810;->o:Z

    .line 230
    .line 231
    if-eqz v9, :cond_8

    .line 232
    .line 233
    iget-object v9, v1, La/mie0;->a:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v9, La/vy40;

    .line 236
    .line 237
    if-nez v9, :cond_7

    .line 238
    .line 239
    new-instance v9, La/vy40;

    .line 240
    .line 241
    invoke-direct {v9}, La/vy40;-><init>()V

    .line 242
    .line 243
    .line 244
    iput-object v9, v1, La/mie0;->a:Ljava/lang/Object;

    .line 245
    .line 246
    :cond_7
    iput-object v9, v1, La/mie0;->a:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-virtual {v9, v7}, La/vy40;->a(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :cond_8
    iget-boolean v7, p0, La/c810;->o:Z

    .line 252
    .line 253
    iput-boolean v7, v8, La/c810;->o:Z

    .line 254
    .line 255
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_9
    invoke-virtual {p0}, La/e810;->N0()La/uj30;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, La/uj30;->b()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, La/e7z;->o()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/ty40;

    .line 270
    .line 271
    iget-object v3, p0, La/ty40;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v3, La/xz40;

    .line 274
    .line 275
    iget v3, v3, La/xz40;->c:I

    .line 276
    .line 277
    move v4, v2

    .line 278
    :goto_5
    const/4 v5, 0x1

    .line 279
    if-ge v4, v3, :cond_c

    .line 280
    .line 281
    invoke-virtual {p0, v4}, La/ty40;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    check-cast v7, La/e7z;

    .line 286
    .line 287
    iget-object v8, v1, La/mie0;->a:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v8, La/vy40;

    .line 290
    .line 291
    if-eqz v8, :cond_a

    .line 292
    .line 293
    invoke-virtual {v8, v7}, La/vy40;->e(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-ne v8, v5, :cond_a

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_a
    move v5, v2

    .line 301
    :goto_6
    iget-object v7, v7, La/e7z;->h1:La/tzi;

    .line 302
    .line 303
    iget-object v7, v7, La/tzi;->e:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v7, La/s460;

    .line 306
    .line 307
    invoke-virtual {v7}, La/s460;->e1()La/e810;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    if-eqz v7, :cond_b

    .line 312
    .line 313
    iput-boolean v5, v7, La/c810;->o:Z

    .line 314
    .line 315
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_c
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    iget-object v1, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 323
    .line 324
    iget p0, p0, La/xz40;->c:I

    .line 325
    .line 326
    move v3, v2

    .line 327
    :goto_7
    if-ge v3, p0, :cond_e

    .line 328
    .line 329
    aget-object v4, v1, v3

    .line 330
    .line 331
    check-cast v4, La/e7z;

    .line 332
    .line 333
    iget-object v4, v4, La/e7z;->i1:La/i7z;

    .line 334
    .line 335
    iget-object v4, v4, La/i7z;->q:La/i810;

    .line 336
    .line 337
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget v7, v4, La/i810;->h:I

    .line 341
    .line 342
    iget v8, v4, La/i810;->i:I

    .line 343
    .line 344
    if-eq v7, v8, :cond_d

    .line 345
    .line 346
    if-ne v8, v6, :cond_d

    .line 347
    .line 348
    invoke-virtual {v4, v5}, La/i810;->y0(Z)V

    .line 349
    .line 350
    .line 351
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_e
    invoke-virtual {v0}, La/e7z;->A()La/xz40;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 359
    .line 360
    iget p0, p0, La/xz40;->c:I

    .line 361
    .line 362
    :goto_8
    if-ge v2, p0, :cond_f

    .line 363
    .line 364
    aget-object v1, v0, v2

    .line 365
    .line 366
    check-cast v1, La/e7z;

    .line 367
    .line 368
    iget-object v1, v1, La/e7z;->i1:La/i7z;

    .line 369
    .line 370
    iget-object v1, v1, La/i7z;->q:La/i810;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget-object v1, v1, La/i810;->s:La/f7z;

    .line 376
    .line 377
    iget-boolean v3, v1, La/f7z;->d:Z

    .line 378
    .line 379
    iput-boolean v3, v1, La/f7z;->e:Z

    .line 380
    .line 381
    add-int/lit8 v2, v2, 0x1

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_10
    const-string p0, "Expected lookahead delegate"

    .line 388
    .line 389
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :goto_9
    return-object v1

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
