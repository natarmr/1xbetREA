.class public final La/xqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ksk;

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:La/y78;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;

.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(La/ksk;La/ctf0;La/g2v;La/y78;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xqk;->a:La/ksk;

    .line 8
    .line 9
    iput-object p2, p0, La/xqk;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/xqk;->c:La/g2v;

    .line 12
    .line 13
    iput-object p4, p0, La/xqk;->d:La/y78;

    .line 14
    .line 15
    new-instance p2, La/wqk;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p0, p3}, La/wqk;-><init>(La/xqk;B)V

    .line 19
    .line 20
    .line 21
    new-instance p3, La/yw9;

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    const/16 v0, 0x14

    .line 25
    .line 26
    invoke-direct {p3, p4, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, La/xqk;->e:La/n0o0;

    .line 34
    .line 35
    invoke-static {p1}, La/vzb;->p0(La/ksk;)La/sqk;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance p3, La/wqk;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {p3, p0, v1}, La/wqk;-><init>(La/xqk;B)V

    .line 43
    .line 44
    .line 45
    new-instance v1, La/yw9;

    .line 46
    .line 47
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, La/xqk;->f:La/n0o0;

    .line 55
    .line 56
    iget-object p1, p1, La/ksk;->d:La/j0g0;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    instance-of p3, p2, La/g0g0;

    .line 63
    .line 64
    if-eqz p3, :cond_0

    .line 65
    .line 66
    move-object p2, p4

    .line 67
    :cond_0
    check-cast p2, La/kuk;

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    iget-object p2, p2, La/kuk;->g:La/j0g0;

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    iget-object p2, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    sget-object p3, La/iun;->a:La/iun;

    .line 78
    .line 79
    instance-of v1, p2, La/g0g0;

    .line 80
    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    move-object p2, p3

    .line 84
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 85
    .line 86
    if-nez p2, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move-object v1, p3

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_0
    sget-object p3, La/iun;->a:La/iun;

    .line 92
    .line 93
    move-object p2, p3

    .line 94
    move-object v1, p2

    .line 95
    :goto_1
    new-instance v2, La/vbk;

    .line 96
    .line 97
    const/16 v3, 0xd

    .line 98
    .line 99
    invoke-direct {v2, v3}, La/vbk;-><init>(B)V

    .line 100
    .line 101
    .line 102
    new-instance v3, La/yw9;

    .line 103
    .line 104
    invoke-direct {v3, p2, v2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iput-object p2, p0, La/xqk;->g:La/n0o0;

    .line 112
    .line 113
    const-string p2, ""

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    iget-object v2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 118
    .line 119
    instance-of v3, v2, La/g0g0;

    .line 120
    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    move-object v2, p4

    .line 124
    :cond_4
    check-cast v2, La/kuk;

    .line 125
    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    iget-object v2, v2, La/kuk;->c:La/j0g0;

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    instance-of v3, v2, La/g0g0;

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    move-object v2, p4

    .line 139
    :cond_5
    check-cast v2, La/btk;

    .line 140
    .line 141
    if-nez v2, :cond_7

    .line 142
    .line 143
    :cond_6
    new-instance v2, La/btk;

    .line 144
    .line 145
    invoke-direct {v2, p3, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    new-instance v3, La/wqk;

    .line 149
    .line 150
    const/4 v4, 0x2

    .line 151
    invoke-direct {v3, p0, v4}, La/wqk;-><init>(La/xqk;B)V

    .line 152
    .line 153
    .line 154
    new-instance v4, La/yw9;

    .line 155
    .line 156
    invoke-direct {v4, v2, v3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iput-object v2, p0, La/xqk;->h:La/n0o0;

    .line 164
    .line 165
    if-eqz p1, :cond_a

    .line 166
    .line 167
    iget-object v2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 168
    .line 169
    instance-of v3, v2, La/g0g0;

    .line 170
    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    move-object v2, p4

    .line 174
    :cond_8
    check-cast v2, La/kuk;

    .line 175
    .line 176
    if-eqz v2, :cond_a

    .line 177
    .line 178
    iget-object v2, v2, La/kuk;->d:La/j0g0;

    .line 179
    .line 180
    if-eqz v2, :cond_a

    .line 181
    .line 182
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 183
    .line 184
    instance-of v3, v2, La/g0g0;

    .line 185
    .line 186
    if-eqz v3, :cond_9

    .line 187
    .line 188
    move-object v2, p4

    .line 189
    :cond_9
    check-cast v2, La/btk;

    .line 190
    .line 191
    if-nez v2, :cond_b

    .line 192
    .line 193
    :cond_a
    new-instance v2, La/btk;

    .line 194
    .line 195
    invoke-direct {v2, p3, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_b
    new-instance p2, La/wqk;

    .line 199
    .line 200
    const/4 v3, 0x3

    .line 201
    invoke-direct {p2, p0, v3}, La/wqk;-><init>(La/xqk;B)V

    .line 202
    .line 203
    .line 204
    new-instance v3, La/yw9;

    .line 205
    .line 206
    invoke-direct {v3, v2, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    iput-object p2, p0, La/xqk;->i:La/n0o0;

    .line 214
    .line 215
    if-eqz p1, :cond_d

    .line 216
    .line 217
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 218
    .line 219
    instance-of v2, p2, La/g0g0;

    .line 220
    .line 221
    if-eqz v2, :cond_c

    .line 222
    .line 223
    move-object p2, p4

    .line 224
    :cond_c
    check-cast p2, La/kuk;

    .line 225
    .line 226
    if-eqz p2, :cond_d

    .line 227
    .line 228
    invoke-static {p2}, La/u1c;->S(La/kuk;)La/tqk;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    goto :goto_2

    .line 233
    :cond_d
    new-instance p2, La/tqk;

    .line 234
    .line 235
    invoke-direct {p2, v1, v1}, La/tqk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    :goto_2
    new-instance v1, La/wqk;

    .line 239
    .line 240
    const/4 v2, 0x4

    .line 241
    invoke-direct {v1, p0, v2}, La/wqk;-><init>(La/xqk;B)V

    .line 242
    .line 243
    .line 244
    new-instance v2, La/yw9;

    .line 245
    .line 246
    invoke-direct {v2, p2, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 247
    .line 248
    .line 249
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    iput-object p2, p0, La/xqk;->j:La/n0o0;

    .line 254
    .line 255
    if-eqz p1, :cond_10

    .line 256
    .line 257
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 258
    .line 259
    instance-of v1, p2, La/g0g0;

    .line 260
    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    move-object p2, p4

    .line 264
    :cond_e
    check-cast p2, La/kuk;

    .line 265
    .line 266
    if-eqz p2, :cond_10

    .line 267
    .line 268
    iget-object p2, p2, La/kuk;->j:Ljava/lang/Object;

    .line 269
    .line 270
    instance-of v1, p2, La/g0g0;

    .line 271
    .line 272
    if-eqz v1, :cond_f

    .line 273
    .line 274
    move-object p2, p4

    .line 275
    :cond_f
    check-cast p2, Ljava/util/List;

    .line 276
    .line 277
    if-nez p2, :cond_11

    .line 278
    .line 279
    :cond_10
    move-object p2, p3

    .line 280
    :cond_11
    invoke-static {p2}, La/qzb;->f1(Ljava/util/List;)La/tqk;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    new-instance v1, La/wqk;

    .line 285
    .line 286
    const/4 v2, 0x5

    .line 287
    invoke-direct {v1, p0, v2}, La/wqk;-><init>(La/xqk;B)V

    .line 288
    .line 289
    .line 290
    new-instance v2, La/yw9;

    .line 291
    .line 292
    invoke-direct {v2, p2, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 293
    .line 294
    .line 295
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    iput-object p2, p0, La/xqk;->k:La/n0o0;

    .line 300
    .line 301
    if-eqz p1, :cond_14

    .line 302
    .line 303
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 304
    .line 305
    instance-of v1, p2, La/g0g0;

    .line 306
    .line 307
    if-eqz v1, :cond_12

    .line 308
    .line 309
    move-object p2, p4

    .line 310
    :cond_12
    check-cast p2, La/kuk;

    .line 311
    .line 312
    if-eqz p2, :cond_14

    .line 313
    .line 314
    iget-object p2, p2, La/kuk;->h:La/j0g0;

    .line 315
    .line 316
    if-eqz p2, :cond_14

    .line 317
    .line 318
    iget-object p2, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 319
    .line 320
    instance-of v1, p2, La/g0g0;

    .line 321
    .line 322
    if-eqz v1, :cond_13

    .line 323
    .line 324
    move-object p2, p4

    .line 325
    :cond_13
    check-cast p2, Ljava/util/List;

    .line 326
    .line 327
    if-nez p2, :cond_15

    .line 328
    .line 329
    :cond_14
    move-object p2, p3

    .line 330
    :cond_15
    new-instance v1, La/wqk;

    .line 331
    .line 332
    const/4 v2, 0x6

    .line 333
    invoke-direct {v1, p0, v2}, La/wqk;-><init>(La/xqk;B)V

    .line 334
    .line 335
    .line 336
    new-instance v2, La/yw9;

    .line 337
    .line 338
    invoke-direct {v2, p2, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 339
    .line 340
    .line 341
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    iput-object p2, p0, La/xqk;->l:La/n0o0;

    .line 346
    .line 347
    if-eqz p1, :cond_19

    .line 348
    .line 349
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 350
    .line 351
    instance-of p2, p1, La/g0g0;

    .line 352
    .line 353
    if-eqz p2, :cond_16

    .line 354
    .line 355
    move-object p1, p4

    .line 356
    :cond_16
    check-cast p1, La/kuk;

    .line 357
    .line 358
    if-eqz p1, :cond_19

    .line 359
    .line 360
    iget-object p1, p1, La/kuk;->i:La/j0g0;

    .line 361
    .line 362
    if-eqz p1, :cond_19

    .line 363
    .line 364
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 365
    .line 366
    instance-of p2, p1, La/g0g0;

    .line 367
    .line 368
    if-eqz p2, :cond_17

    .line 369
    .line 370
    goto :goto_3

    .line 371
    :cond_17
    move-object p4, p1

    .line 372
    :goto_3
    check-cast p4, Ljava/util/List;

    .line 373
    .line 374
    if-nez p4, :cond_18

    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_18
    move-object p3, p4

    .line 378
    :cond_19
    :goto_4
    new-instance p1, La/wqk;

    .line 379
    .line 380
    const/4 p2, 0x7

    .line 381
    invoke-direct {p1, p0, p2}, La/wqk;-><init>(La/xqk;B)V

    .line 382
    .line 383
    .line 384
    new-instance p2, La/yw9;

    .line 385
    .line 386
    invoke-direct {p2, p3, p1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 387
    .line 388
    .line 389
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    iput-object p1, p0, La/xqk;->m:La/n0o0;

    .line 394
    .line 395
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/ksk;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, La/ksk;->d:La/j0g0;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    instance-of v1, v0, La/g0g0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object v0, v2

    .line 18
    :cond_0
    check-cast v0, La/kuk;

    .line 19
    .line 20
    invoke-static {v0}, La/hic;->w(La/kuk;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, La/xqk;->e:La/n0o0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/fee;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p1, La/ksk;->c:La/j0g0;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v4, v0, La/g0g0;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v2, v0

    .line 50
    :goto_0
    check-cast v2, La/jtk;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-boolean v0, v2, La/jtk;->a:Z

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/fee;

    .line 66
    .line 67
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v2, v0

    .line 72
    check-cast v2, Ljava/lang/Boolean;

    .line 73
    .line 74
    :cond_3
    :goto_1
    invoke-virtual {v3, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v0, p0, La/xqk;->f:La/n0o0;

    .line 78
    .line 79
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/fee;

    .line 84
    .line 85
    invoke-static {p1}, La/vzb;->p0(La/ksk;)La/sqk;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, La/tsk;

    .line 93
    .line 94
    iget-object v2, p0, La/xqk;->a:La/ksk;

    .line 95
    .line 96
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 97
    .line 98
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 99
    .line 100
    iget-object v2, v2, La/ech;->q:La/n2o;

    .line 101
    .line 102
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/fee;

    .line 107
    .line 108
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 109
    .line 110
    iget-object v3, p1, La/ksk;->b:La/sff0;

    .line 111
    .line 112
    iget-object v4, v3, La/sff0;->c:La/ech;

    .line 113
    .line 114
    iget-object v5, v4, La/ech;->q:La/n2o;

    .line 115
    .line 116
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 117
    .line 118
    iget-object v6, v3, La/mum0;->y:La/v5l0;

    .line 119
    .line 120
    iget-object v7, p1, La/ksk;->d:La/j0g0;

    .line 121
    .line 122
    iget-object v9, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 123
    .line 124
    new-instance v11, La/vef;

    .line 125
    .line 126
    const/16 v3, 0x1d

    .line 127
    .line 128
    invoke-direct {v11, p0, p1, v3}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    iget-object v8, p0, La/xqk;->c:La/g2v;

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    invoke-static/range {v5 .. v11}, La/xbc;->P(La/n2o;La/v5l0;La/j0g0;La/g2v;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;ZLkotlin/jvm/functions/Function0;)La/gsk;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-direct {v1, v2, v0, p0}, La/tsk;-><init>(La/n2o;La/l7m0;La/gsk;)V

    .line 139
    .line 140
    .line 141
    return-object v1
.end method
