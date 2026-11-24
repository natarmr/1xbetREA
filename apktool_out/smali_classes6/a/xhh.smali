.class public final synthetic La/xhh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIJLa/mm40;Ljava/lang/Object;)V
    .locals 0

    .line 3
    iput-byte p1, p0, La/xhh;->a:B

    iput-object p5, p0, La/xhh;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/xhh;->b:J

    iput-object p6, p0, La/xhh;->e:Ljava/lang/Object;

    iput p2, p0, La/xhh;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;La/wdr;IB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/xhh;->a:B

    iput-wide p1, p0, La/xhh;->b:J

    iput-object p3, p0, La/xhh;->d:Ljava/lang/Object;

    iput-object p4, p0, La/xhh;->e:Ljava/lang/Object;

    iput p5, p0, La/xhh;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/c5n0;ILkotlin/jvm/functions/Function0;J)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    iput-byte v0, p0, La/xhh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xhh;->d:Ljava/lang/Object;

    iput p2, p0, La/xhh;->c:I

    iput-object p3, p0, La/xhh;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/xhh;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JIB)V
    .locals 0

    .line 4
    iput-byte p6, p0, La/xhh;->a:B

    iput-object p1, p0, La/xhh;->d:Ljava/lang/Object;

    iput-object p2, p0, La/xhh;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/xhh;->b:J

    iput p5, p0, La/xhh;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/xhh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/xhh;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, La/xhh;->c:I

    .line 7
    .line 8
    iget-object v4, p0, La/xhh;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, La/c5n0;

    .line 14
    .line 15
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    check-cast p1, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-eq v0, v5, :cond_0

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v6

    .line 34
    :goto_0
    and-int/2addr p2, v1

    .line 35
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    sget-object p2, La/jm40;->b:La/jm40;

    .line 42
    .line 43
    invoke-interface {v4, v3}, La/w6k;->r0(I)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const/high16 v0, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-static {p2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    sget-object v0, La/ukd;->a:La/cl5;

    .line 68
    .line 69
    if-ne v1, v0, :cond_2

    .line 70
    .line 71
    :cond_1
    new-instance v1, La/vpj0;

    .line 72
    .line 73
    const/16 v0, 0xe

    .line 74
    .line 75
    invoke-direct {v1, v2, v0}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    invoke-static {p2, v1}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    sget-object v0, La/jd8;->n:La/ljc;

    .line 88
    .line 89
    iget-wide v1, p0, La/xhh;->b:J

    .line 90
    .line 91
    invoke-static {p2, v1, v2, v0}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v6, p1, p0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

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
    move-object v0, v4

    .line 106
    check-cast v0, La/mm40;

    .line 107
    .line 108
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 109
    .line 110
    move-object v4, p1

    .line 111
    check-cast v4, La/fet;

    .line 112
    .line 113
    check-cast p2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    or-int/lit8 p1, v3, 0x1

    .line 119
    .line 120
    invoke-static {p1}, La/x8x;->L(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    move-object v3, v2

    .line 125
    iget-wide v1, p0, La/xhh;->b:J

    .line 126
    .line 127
    invoke-static/range {v0 .. v5}, La/l8x;->p(La/mm40;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_1
    check-cast v4, La/y9q0;

    .line 134
    .line 135
    check-cast v2, La/ugd;

    .line 136
    .line 137
    check-cast p1, La/fet;

    .line 138
    .line 139
    check-cast p2, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    or-int/lit8 p2, v3, 0x1

    .line 145
    .line 146
    invoke-static {p2}, La/x8x;->L(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget-wide v0, p0, La/xhh;->b:J

    .line 151
    .line 152
    move-object v3, v2

    .line 153
    move-object v2, v4

    .line 154
    move-object v4, p1

    .line 155
    invoke-static/range {v0 .. v5}, La/q8x;->o(JLa/y9q0;La/ugd;La/fet;I)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_2
    move-object v0, v4

    .line 162
    check-cast v0, La/mm40;

    .line 163
    .line 164
    check-cast v2, La/qol;

    .line 165
    .line 166
    move-object v4, p1

    .line 167
    check-cast v4, La/fet;

    .line 168
    .line 169
    check-cast p2, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    or-int/lit8 p1, v3, 0x1

    .line 175
    .line 176
    invoke-static {p1}, La/x8x;->L(I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    move-object v3, v2

    .line 181
    iget-wide v1, p0, La/xhh;->b:J

    .line 182
    .line 183
    invoke-static/range {v0 .. v5}, La/jiq0;->h0(La/mm40;JLa/qol;La/fet;I)V

    .line 184
    .line 185
    .line 186
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_3
    move-object v0, v4

    .line 190
    check-cast v0, La/mm40;

    .line 191
    .line 192
    check-cast v2, La/ri40;

    .line 193
    .line 194
    move-object v4, p1

    .line 195
    check-cast v4, La/fet;

    .line 196
    .line 197
    check-cast p2, Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    or-int/lit8 p1, v3, 0x1

    .line 203
    .line 204
    invoke-static {p1}, La/x8x;->L(I)I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    move-object v1, v2

    .line 209
    iget-wide v2, p0, La/xhh;->b:J

    .line 210
    .line 211
    invoke-static/range {v0 .. v5}, La/bdx;->K(La/mm40;La/ri40;JLa/fet;I)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_4
    move-object v0, v4

    .line 218
    check-cast v0, La/mm40;

    .line 219
    .line 220
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 221
    .line 222
    move-object v4, p1

    .line 223
    check-cast v4, La/fet;

    .line 224
    .line 225
    check-cast p2, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    or-int/lit8 p1, v3, 0x1

    .line 231
    .line 232
    invoke-static {p1}, La/x8x;->L(I)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    move-object v3, v2

    .line 237
    iget-wide v1, p0, La/xhh;->b:J

    .line 238
    .line 239
    invoke-static/range {v0 .. v5}, La/hmw0;->A(La/mm40;JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 240
    .line 241
    .line 242
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_5
    move-object v0, v4

    .line 246
    check-cast v0, La/mm40;

    .line 247
    .line 248
    check-cast v2, La/dwh0;

    .line 249
    .line 250
    move-object v4, p1

    .line 251
    check-cast v4, La/fet;

    .line 252
    .line 253
    check-cast p2, Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    or-int/lit8 p1, v3, 0x1

    .line 259
    .line 260
    invoke-static {p1}, La/x8x;->L(I)I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    move-object v1, v2

    .line 265
    iget-wide v2, p0, La/xhh;->b:J

    .line 266
    .line 267
    invoke-static/range {v0 .. v5}, La/ibc;->I(La/mm40;La/dwh0;JLa/fet;I)V

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_6
    move-object v0, v4

    .line 274
    check-cast v0, La/mm40;

    .line 275
    .line 276
    check-cast v2, La/jwm;

    .line 277
    .line 278
    move-object v4, p1

    .line 279
    check-cast v4, La/fet;

    .line 280
    .line 281
    check-cast p2, Ljava/lang/Integer;

    .line 282
    .line 283
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    or-int/lit8 p1, v3, 0x1

    .line 287
    .line 288
    invoke-static {p1}, La/x8x;->L(I)I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    move-object v1, v2

    .line 293
    iget-wide v2, p0, La/xhh;->b:J

    .line 294
    .line 295
    invoke-static/range {v0 .. v5}, La/tlb;->u(La/mm40;La/jwm;JLa/fet;I)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_7
    move-object v0, v4

    .line 302
    check-cast v0, La/mm40;

    .line 303
    .line 304
    check-cast v2, La/a4x;

    .line 305
    .line 306
    move-object v4, p1

    .line 307
    check-cast v4, La/fet;

    .line 308
    .line 309
    check-cast p2, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    or-int/lit8 p1, v3, 0x1

    .line 315
    .line 316
    invoke-static {p1}, La/x8x;->L(I)I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    move-object v1, v2

    .line 321
    iget-wide v2, p0, La/xhh;->b:J

    .line 322
    .line 323
    invoke-static/range {v0 .. v5}, La/kbc;->F(La/mm40;La/a4x;JLa/fet;I)V

    .line 324
    .line 325
    .line 326
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    return-object p0

    .line 329
    :pswitch_8
    check-cast v4, La/y8m;

    .line 330
    .line 331
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 332
    .line 333
    check-cast p1, La/fet;

    .line 334
    .line 335
    check-cast p2, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    or-int/lit8 p2, v3, 0x1

    .line 341
    .line 342
    invoke-static {p2}, La/x8x;->L(I)I

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    iget-wide v0, p0, La/xhh;->b:J

    .line 347
    .line 348
    move-object v3, v2

    .line 349
    move-object v2, v4

    .line 350
    move-object v4, p1

    .line 351
    invoke-static/range {v0 .. v5}, La/b9m;->a(JLa/y8m;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 352
    .line 353
    .line 354
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    return-object p0

    .line 357
    :pswitch_9
    move-object v0, v4

    .line 358
    check-cast v0, La/qwv0;

    .line 359
    .line 360
    check-cast v2, La/mm40;

    .line 361
    .line 362
    move-object v4, p1

    .line 363
    check-cast v4, La/fet;

    .line 364
    .line 365
    check-cast p2, Ljava/lang/Integer;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    or-int/lit8 p1, v3, 0x1

    .line 371
    .line 372
    invoke-static {p1}, La/x8x;->L(I)I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    move-object v1, v2

    .line 377
    iget-wide v2, p0, La/xhh;->b:J

    .line 378
    .line 379
    invoke-static/range {v0 .. v5}, La/sj3;->l(La/qwv0;La/mm40;JLa/fet;I)V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_a
    check-cast v4, Ljava/lang/Long;

    .line 386
    .line 387
    check-cast v2, La/ugd;

    .line 388
    .line 389
    check-cast p1, La/fet;

    .line 390
    .line 391
    check-cast p2, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    or-int/lit8 p2, v3, 0x1

    .line 397
    .line 398
    invoke-static {p2}, La/x8x;->L(I)I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    iget-wide v0, p0, La/xhh;->b:J

    .line 403
    .line 404
    move-object v3, v2

    .line 405
    move-object v2, v4

    .line 406
    move-object v4, p1

    .line 407
    invoke-static/range {v0 .. v5}, La/yhh;->b(JLjava/lang/Long;La/ugd;La/fet;I)V

    .line 408
    .line 409
    .line 410
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object p0

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
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
