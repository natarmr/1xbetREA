.class public final La/k0h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/k0h0;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/k0h0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/k0h0;->a:La/k0h0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "androidx.savedstate.SavedState"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/k0h0;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of p0, p1, La/tzg0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    check-cast p1, La/tzg0;

    .line 6
    .line 7
    iget-object p0, p1, La/tzg0;->n:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    iget-object v0, p1, La/tzg0;->l:Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object p0, p1, La/tzg0;->n:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, p0}, La/b8k0;->L(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, La/l0h0;->a:La/inv;

    .line 28
    .line 29
    invoke-interface {p1, p0}, La/rkj;->w(La/jiy;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/util/Map;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-instance v0, La/jo20;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/jo20;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_19

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ljava/util/Map$Entry;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/chi0;

    .line 78
    .line 79
    instance-of v2, p1, La/wm8;

    .line 80
    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    check-cast p1, La/wm8;

    .line 84
    .line 85
    iget-boolean p1, p1, La/wm8;->a:Z

    .line 86
    .line 87
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_2
    instance-of v2, p1, La/tvb;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    check-cast p1, La/tvb;

    .line 98
    .line 99
    iget-char p1, p1, La/tvb;->a:C

    .line 100
    .line 101
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_3
    instance-of v2, p1, La/wbl;

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    check-cast p1, La/wbl;

    .line 112
    .line 113
    iget-wide v2, p1, La/wbl;->a:D

    .line 114
    .line 115
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :cond_4
    instance-of v2, p1, La/qlq;

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    check-cast p1, La/qlq;

    .line 126
    .line 127
    iget p1, p1, La/qlq;->a:F

    .line 128
    .line 129
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    goto/16 :goto_1

    .line 134
    .line 135
    :cond_5
    instance-of v2, p1, La/wkx;

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    check-cast p1, La/wkx;

    .line 140
    .line 141
    iget p1, p1, La/wkx;->a:I

    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_6
    instance-of v2, p1, La/y710;

    .line 150
    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    check-cast p1, La/y710;

    .line 154
    .line 155
    iget-wide v2, p1, La/y710;->a:J

    .line 156
    .line 157
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :cond_7
    sget-object v2, La/m860;->INSTANCE:La/m860;

    .line 164
    .line 165
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const/4 v3, 0x0

    .line 170
    if-eqz v2, :cond_8

    .line 171
    .line 172
    move-object p1, v3

    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :cond_8
    instance-of v2, p1, La/itm0;

    .line 176
    .line 177
    if-eqz v2, :cond_9

    .line 178
    .line 179
    check-cast p1, La/itm0;

    .line 180
    .line 181
    iget-object p1, p1, La/itm0;->a:Ljava/lang/String;

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_9
    instance-of v2, p1, La/ovb;

    .line 186
    .line 187
    if-eqz v2, :cond_a

    .line 188
    .line 189
    check-cast p1, La/ovb;

    .line 190
    .line 191
    iget-object p1, p1, La/ovb;->a:Ljava/lang/String;

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :cond_a
    instance-of v2, p1, La/qm8;

    .line 196
    .line 197
    if-eqz v2, :cond_b

    .line 198
    .line 199
    check-cast p1, La/qm8;

    .line 200
    .line 201
    iget-object p1, p1, La/qm8;->a:[Z

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_b
    instance-of v2, p1, La/nub;

    .line 206
    .line 207
    if-eqz v2, :cond_c

    .line 208
    .line 209
    check-cast p1, La/nub;

    .line 210
    .line 211
    iget-object p1, p1, La/nub;->a:[C

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_c
    instance-of v2, p1, La/kbl;

    .line 216
    .line 217
    if-eqz v2, :cond_d

    .line 218
    .line 219
    check-cast p1, La/kbl;

    .line 220
    .line 221
    iget-object p1, p1, La/kbl;->a:[D

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_d
    instance-of v2, p1, La/elq;

    .line 226
    .line 227
    if-eqz v2, :cond_e

    .line 228
    .line 229
    check-cast p1, La/elq;

    .line 230
    .line 231
    iget-object p1, p1, La/elq;->a:[F

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_e
    instance-of v2, p1, La/xjx;

    .line 235
    .line 236
    if-eqz v2, :cond_f

    .line 237
    .line 238
    check-cast p1, La/xjx;

    .line 239
    .line 240
    iget-object p1, p1, La/xjx;->a:[I

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_f
    instance-of v2, p1, La/b710;

    .line 244
    .line 245
    if-eqz v2, :cond_10

    .line 246
    .line 247
    check-cast p1, La/b710;

    .line 248
    .line 249
    iget-object p1, p1, La/b710;->a:[J

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_10
    instance-of v2, p1, La/ism0;

    .line 253
    .line 254
    if-eqz v2, :cond_11

    .line 255
    .line 256
    check-cast p1, La/ism0;

    .line 257
    .line 258
    iget-object p1, p1, La/ism0;->a:[Ljava/lang/String;

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_11
    instance-of v2, p1, La/fvb;

    .line 262
    .line 263
    if-eqz v2, :cond_12

    .line 264
    .line 265
    check-cast p1, La/fvb;

    .line 266
    .line 267
    iget-object p1, p1, La/fvb;->a:[Ljava/lang/String;

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_12
    instance-of v2, p1, La/nzg0;

    .line 271
    .line 272
    if-eqz v2, :cond_13

    .line 273
    .line 274
    check-cast p1, La/nzg0;

    .line 275
    .line 276
    iget-object p1, p1, La/nzg0;->a:[Landroid/os/Bundle;

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_13
    instance-of v2, p1, La/ekx;

    .line 280
    .line 281
    if-eqz v2, :cond_14

    .line 282
    .line 283
    check-cast p1, La/ekx;

    .line 284
    .line 285
    iget-object p1, p1, La/ekx;->a:Ljava/util/List;

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_14
    instance-of v2, p1, La/usm0;

    .line 289
    .line 290
    if-eqz v2, :cond_15

    .line 291
    .line 292
    check-cast p1, La/usm0;

    .line 293
    .line 294
    iget-object p1, p1, La/usm0;->a:Ljava/util/List;

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_15
    instance-of v2, p1, La/kvb;

    .line 298
    .line 299
    if-eqz v2, :cond_16

    .line 300
    .line 301
    check-cast p1, La/kvb;

    .line 302
    .line 303
    iget-object p1, p1, La/kvb;->a:Ljava/util/List;

    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_16
    instance-of v2, p1, La/e0h0;

    .line 307
    .line 308
    if-eqz v2, :cond_17

    .line 309
    .line 310
    check-cast p1, La/e0h0;

    .line 311
    .line 312
    iget-object p1, p1, La/e0h0;->a:Ljava/util/List;

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_17
    instance-of v2, p1, La/o0h0;

    .line 316
    .line 317
    if-eqz v2, :cond_18

    .line 318
    .line 319
    check-cast p1, La/o0h0;

    .line 320
    .line 321
    iget-object p1, p1, La/o0h0;->a:Landroid/os/Bundle;

    .line 322
    .line 323
    :goto_1
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 329
    .line 330
    .line 331
    return-object v3

    .line 332
    :cond_19
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    invoke-virtual {p0}, La/jo20;->isEmpty()Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    const/4 v0, 0x0

    .line 341
    if-eqz p1, :cond_1a

    .line 342
    .line 343
    new-array p0, v0, [Lkotlin/Pair;

    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_1a
    new-instance p1, Ljava/util/ArrayList;

    .line 347
    .line 348
    iget v1, p0, La/jo20;->i:I

    .line 349
    .line 350
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0}, La/jo20;->entrySet()Ljava/util/Set;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    check-cast p0, La/ko20;

    .line 358
    .line 359
    invoke-virtual {p0}, La/ko20;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    :goto_2
    move-object v1, p0

    .line 364
    check-cast v1, La/io20;

    .line 365
    .line 366
    invoke-virtual {v1}, La/io20;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_1b

    .line 371
    .line 372
    move-object v1, p0

    .line 373
    check-cast v1, La/go20;

    .line 374
    .line 375
    invoke-virtual {v1}, La/go20;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    check-cast v1, Ljava/util/Map$Entry;

    .line 380
    .line 381
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Ljava/lang/String;

    .line 386
    .line 387
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    new-instance v3, Lkotlin/Pair;

    .line 392
    .line 393
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_2

    .line 400
    :cond_1b
    new-array p0, v0, [Lkotlin/Pair;

    .line 401
    .line 402
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    check-cast p0, [Lkotlin/Pair;

    .line 407
    .line 408
    :goto_3
    array-length p1, p0

    .line 409
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    check-cast p0, [Lkotlin/Pair;

    .line 414
    .line 415
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/k0h0;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of p0, p1, La/uzg0;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    check-cast p1, La/uzg0;

    .line 11
    .line 12
    iget-object p0, p1, La/uzg0;->w:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iget-object v0, p1, La/uzg0;->u:Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object p0, p1, La/uzg0;->w:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-static {p2}, La/b8k0;->a0(Landroid/os/Bundle;)La/jo20;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget p2, p0, La/jo20;->i:I

    .line 42
    .line 43
    new-instance v0, La/jo20;

    .line 44
    .line 45
    invoke-direct {v0, p2}, La/jo20;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/jo20;->entrySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/ko20;

    .line 53
    .line 54
    invoke-virtual {p0}, La/ko20;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    move-object p2, p0

    .line 59
    check-cast p2, La/io20;

    .line 60
    .line 61
    invoke-virtual {p2}, La/io20;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_20

    .line 66
    .line 67
    move-object p2, p0

    .line 68
    check-cast p2, La/go20;

    .line 69
    .line 70
    invoke-virtual {p2}, La/go20;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Ljava/util/Map$Entry;

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-nez p2, :cond_2

    .line 87
    .line 88
    sget-object p2, La/m860;->INSTANCE:La/m860;

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_2
    instance-of v2, p2, Ljava/lang/Boolean;

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    new-instance v2, La/wm8;

    .line 97
    .line 98
    check-cast p2, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-direct {v2, p2}, La/wm8;-><init>(Z)V

    .line 105
    .line 106
    .line 107
    :goto_1
    move-object p2, v2

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_3
    instance-of v2, p2, Ljava/lang/Character;

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    new-instance v2, La/tvb;

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Character;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-direct {v2, p2}, La/tvb;-><init>(C)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    instance-of v2, p2, Ljava/lang/Double;

    .line 127
    .line 128
    if-eqz v2, :cond_5

    .line 129
    .line 130
    new-instance v2, La/wbl;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-direct {v2, v3, v4}, La/wbl;-><init>(D)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    instance-of v2, p2, Ljava/lang/Float;

    .line 143
    .line 144
    if-eqz v2, :cond_6

    .line 145
    .line 146
    new-instance v2, La/qlq;

    .line 147
    .line 148
    check-cast p2, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    invoke-direct {v2, p2}, La/qlq;-><init>(F)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    instance-of v2, p2, Ljava/lang/Integer;

    .line 159
    .line 160
    if-eqz v2, :cond_7

    .line 161
    .line 162
    new-instance v2, La/wkx;

    .line 163
    .line 164
    check-cast p2, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-direct {v2, p2}, La/wkx;-><init>(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    instance-of v2, p2, Ljava/lang/Long;

    .line 175
    .line 176
    if-eqz v2, :cond_8

    .line 177
    .line 178
    new-instance v2, La/y710;

    .line 179
    .line 180
    check-cast p2, Ljava/lang/Number;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 183
    .line 184
    .line 185
    move-result-wide v3

    .line 186
    invoke-direct {v2, v3, v4}, La/y710;-><init>(J)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_8
    instance-of v2, p2, Ljava/lang/String;

    .line 191
    .line 192
    if-eqz v2, :cond_9

    .line 193
    .line 194
    new-instance v2, La/itm0;

    .line 195
    .line 196
    check-cast p2, Ljava/lang/String;

    .line 197
    .line 198
    invoke-direct {v2, p2}, La/itm0;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_9
    instance-of v2, p2, Ljava/lang/CharSequence;

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    new-instance v2, La/ovb;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-direct {v2, p2}, La/ovb;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_a
    instance-of v2, p2, [Z

    .line 217
    .line 218
    if-eqz v2, :cond_b

    .line 219
    .line 220
    new-instance v2, La/qm8;

    .line 221
    .line 222
    check-cast p2, [Z

    .line 223
    .line 224
    invoke-direct {v2, p2}, La/qm8;-><init>([Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_b
    instance-of v2, p2, [C

    .line 229
    .line 230
    if-eqz v2, :cond_c

    .line 231
    .line 232
    new-instance v2, La/nub;

    .line 233
    .line 234
    check-cast p2, [C

    .line 235
    .line 236
    invoke-direct {v2, p2}, La/nub;-><init>([C)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :cond_c
    instance-of v2, p2, [D

    .line 242
    .line 243
    if-eqz v2, :cond_d

    .line 244
    .line 245
    new-instance v2, La/kbl;

    .line 246
    .line 247
    check-cast p2, [D

    .line 248
    .line 249
    invoke-direct {v2, p2}, La/kbl;-><init>([D)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :cond_d
    instance-of v2, p2, [F

    .line 255
    .line 256
    if-eqz v2, :cond_e

    .line 257
    .line 258
    new-instance v2, La/elq;

    .line 259
    .line 260
    check-cast p2, [F

    .line 261
    .line 262
    invoke-direct {v2, p2}, La/elq;-><init>([F)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_e
    instance-of v2, p2, [I

    .line 268
    .line 269
    if-eqz v2, :cond_f

    .line 270
    .line 271
    new-instance v2, La/xjx;

    .line 272
    .line 273
    check-cast p2, [I

    .line 274
    .line 275
    invoke-direct {v2, p2}, La/xjx;-><init>([I)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :cond_f
    instance-of v2, p2, [J

    .line 281
    .line 282
    if-eqz v2, :cond_10

    .line 283
    .line 284
    new-instance v2, La/b710;

    .line 285
    .line 286
    check-cast p2, [J

    .line 287
    .line 288
    invoke-direct {v2, p2}, La/b710;-><init>([J)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :cond_10
    instance-of v2, p2, [Ljava/lang/Object;

    .line 294
    .line 295
    if-eqz v2, :cond_17

    .line 296
    .line 297
    check-cast p2, [Ljava/lang/Object;

    .line 298
    .line 299
    array-length v2, p2

    .line 300
    const/4 v3, 0x0

    .line 301
    if-nez v2, :cond_11

    .line 302
    .line 303
    new-instance p2, La/ism0;

    .line 304
    .line 305
    new-array v2, v3, [Ljava/lang/String;

    .line 306
    .line 307
    invoke-direct {p2, v2}, La/ism0;-><init>([Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_4

    .line 311
    .line 312
    :cond_11
    invoke-static {p2}, La/tx3;->A([Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    instance-of v4, v2, Ljava/lang/Integer;

    .line 317
    .line 318
    if-eqz v4, :cond_12

    .line 319
    .line 320
    new-instance v2, La/xjx;

    .line 321
    .line 322
    check-cast p2, [I

    .line 323
    .line 324
    invoke-direct {v2, p2}, La/xjx;-><init>([I)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_12
    instance-of v4, v2, Ljava/lang/String;

    .line 330
    .line 331
    if-eqz v4, :cond_13

    .line 332
    .line 333
    new-instance v2, La/ism0;

    .line 334
    .line 335
    check-cast p2, [Ljava/lang/String;

    .line 336
    .line 337
    invoke-direct {v2, p2}, La/ism0;-><init>([Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto/16 :goto_1

    .line 341
    .line 342
    :cond_13
    instance-of v4, v2, Ljava/lang/CharSequence;

    .line 343
    .line 344
    if-eqz v4, :cond_15

    .line 345
    .line 346
    new-instance v2, Ljava/util/ArrayList;

    .line 347
    .line 348
    array-length v4, p2

    .line 349
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 350
    .line 351
    .line 352
    array-length v4, p2

    .line 353
    :goto_2
    if-ge v3, v4, :cond_14

    .line 354
    .line 355
    aget-object v5, p2, v3

    .line 356
    .line 357
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    add-int/lit8 v3, v3, 0x1

    .line 365
    .line 366
    goto :goto_2

    .line 367
    :cond_14
    new-instance p2, La/kvb;

    .line 368
    .line 369
    invoke-direct {p2, v2}, La/kvb;-><init>(Ljava/util/ArrayList;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_4

    .line 373
    .line 374
    :cond_15
    instance-of v3, v2, Landroid/os/Bundle;

    .line 375
    .line 376
    if-eqz v3, :cond_16

    .line 377
    .line 378
    new-instance v2, La/e0h0;

    .line 379
    .line 380
    check-cast p2, Ljava/util/List;

    .line 381
    .line 382
    invoke-direct {v2, p2}, La/e0h0;-><init>(Ljava/util/List;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_1

    .line 386
    .line 387
    :cond_16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string p1, "Unsupported Array type: "

    .line 390
    .line 391
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    sget-object p2, La/sre0;->a:La/tre0;

    .line 402
    .line 403
    invoke-static {p2, p1, p0}, La/kng0;->g(La/tre0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :cond_17
    instance-of v2, p2, Ljava/util/List;

    .line 412
    .line 413
    if-eqz v2, :cond_1e

    .line 414
    .line 415
    check-cast p2, Ljava/util/List;

    .line 416
    .line 417
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    if-eqz v2, :cond_18

    .line 422
    .line 423
    new-instance p2, La/usm0;

    .line 424
    .line 425
    sget-object v2, La/iun;->a:La/iun;

    .line 426
    .line 427
    invoke-direct {p2, v2}, La/usm0;-><init>(Ljava/util/List;)V

    .line 428
    .line 429
    .line 430
    goto/16 :goto_4

    .line 431
    .line 432
    :cond_18
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    instance-of v3, v2, Ljava/lang/Integer;

    .line 437
    .line 438
    if-eqz v3, :cond_19

    .line 439
    .line 440
    new-instance v2, La/ekx;

    .line 441
    .line 442
    invoke-direct {v2, p2}, La/ekx;-><init>(Ljava/util/List;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_1

    .line 446
    .line 447
    :cond_19
    instance-of v3, v2, Ljava/lang/String;

    .line 448
    .line 449
    if-eqz v3, :cond_1a

    .line 450
    .line 451
    new-instance v2, La/usm0;

    .line 452
    .line 453
    invoke-direct {v2, p2}, La/usm0;-><init>(Ljava/util/List;)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_1

    .line 457
    .line 458
    :cond_1a
    instance-of v3, v2, Ljava/lang/CharSequence;

    .line 459
    .line 460
    if-eqz v3, :cond_1c

    .line 461
    .line 462
    new-instance v2, Ljava/util/ArrayList;

    .line 463
    .line 464
    const/16 v3, 0xa

    .line 465
    .line 466
    invoke-static {p2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 471
    .line 472
    .line 473
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object p2

    .line 477
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_1b

    .line 482
    .line 483
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Ljava/lang/CharSequence;

    .line 488
    .line 489
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    goto :goto_3

    .line 497
    :cond_1b
    new-instance p2, La/kvb;

    .line 498
    .line 499
    invoke-direct {p2, v2}, La/kvb;-><init>(Ljava/util/ArrayList;)V

    .line 500
    .line 501
    .line 502
    goto :goto_4

    .line 503
    :cond_1c
    instance-of v3, v2, Landroid/os/Bundle;

    .line 504
    .line 505
    if-eqz v3, :cond_1d

    .line 506
    .line 507
    new-instance v2, La/e0h0;

    .line 508
    .line 509
    invoke-direct {v2, p2}, La/e0h0;-><init>(Ljava/util/List;)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_1

    .line 513
    .line 514
    :cond_1d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string p1, "Unsupported List type: "

    .line 517
    .line 518
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    sget-object p2, La/sre0;->a:La/tre0;

    .line 529
    .line 530
    invoke-static {p2, p1, p0}, La/kng0;->g(La/tre0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :cond_1e
    instance-of v2, p2, Landroid/os/Bundle;

    .line 539
    .line 540
    if-eqz v2, :cond_1f

    .line 541
    .line 542
    new-instance v2, La/o0h0;

    .line 543
    .line 544
    check-cast p2, Landroid/os/Bundle;

    .line 545
    .line 546
    invoke-direct {v2, p2}, La/o0h0;-><init>(Landroid/os/Bundle;)V

    .line 547
    .line 548
    .line 549
    goto/16 :goto_1

    .line 550
    .line 551
    :goto_4
    invoke-virtual {v0, v1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    goto/16 :goto_0

    .line 555
    .line 556
    :cond_1f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    const-string p1, "Unsupported type in SavedState: "

    .line 559
    .line 560
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    sget-object p2, La/sre0;->a:La/tre0;

    .line 568
    .line 569
    invoke-static {p2, p1, p0}, La/kng0;->g(La/tre0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :cond_20
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    sget-object p2, La/l0h0;->a:La/inv;

    .line 582
    .line 583
    invoke-interface {p1, p2, p0}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-void
.end method
