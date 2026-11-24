.class public final La/vut0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# static fields
.field public static final b:La/vut0;

.field public static final c:La/vut0;

.field public static final d:La/vut0;

.field public static final e:La/vut0;

.field public static final f:La/vut0;

.field public static final g:La/vut0;

.field public static final h:La/vut0;

.field public static final i:La/vut0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/vut0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/vut0;->b:La/vut0;

    .line 9
    .line 10
    new-instance v0, La/vut0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/vut0;->c:La/vut0;

    .line 17
    .line 18
    new-instance v0, La/vut0;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/vut0;->d:La/vut0;

    .line 25
    .line 26
    new-instance v0, La/vut0;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/vut0;->e:La/vut0;

    .line 33
    .line 34
    new-instance v0, La/vut0;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 38
    .line 39
    .line 40
    sput-object v0, La/vut0;->f:La/vut0;

    .line 41
    .line 42
    new-instance v0, La/vut0;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 46
    .line 47
    .line 48
    sput-object v0, La/vut0;->g:La/vut0;

    .line 49
    .line 50
    new-instance v0, La/vut0;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/vut0;->h:La/vut0;

    .line 57
    .line 58
    new-instance v0, La/vut0;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v0, v1, v2}, La/vut0;-><init>(IB)V

    .line 62
    .line 63
    .line 64
    sput-object v0, La/vut0;->i:La/vut0;

    .line 65
    .line 66
    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/vut0;->a:B

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vut0;->a:B

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte p0, p0, La/vut0;->a:B

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    const-string v1, "/proc/cpuinfo"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const-wide/16 v5, 0x3e8

    .line 11
    .line 12
    const-string v7, ""

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, La/jdk0;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance p0, Ljava/util/UUID;

    .line 24
    .line 25
    const-wide v0, -0x121074568629b532L    # -3.563403477674908E221

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const-wide v2, -0x5c37d8232ae2de13L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, v1, v2, v3}, Ljava/util/UUID;-><init>(JJ)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/media/MediaDrm;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V

    .line 41
    .line 42
    .line 43
    const-string p0, "deviceUniqueId"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Landroid/media/MediaDrm;->getPropertyByteArray(Ljava/lang/String;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v2, 0x1c

    .line 55
    .line 56
    if-lt v1, v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/media/MediaDrm;->release()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaDrm;->release()V

    .line 63
    .line 64
    .line 65
    :goto_0
    const-string v0, "SHA-256"

    .line 66
    .line 67
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v0, La/gvy;->A:La/gvy;

    .line 85
    .line 86
    const/16 v1, 0x1e

    .line 87
    .line 88
    invoke-static {p0, v7, v0, v1}, La/tx3;->L([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_1
    new-instance p0, La/eoq0;

    .line 94
    .line 95
    sget-object v0, La/w7f;->f:La/w7f;

    .line 96
    .line 97
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 102
    .line 103
    instance-of v1, v0, La/g0g0;

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    move-object v7, v0

    .line 109
    :goto_1
    check-cast v7, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p0, v7}, La/eoq0;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    new-instance p0, La/lsh0;

    .line 116
    .line 117
    sget-object v0, La/w7f;->g:La/w7f;

    .line 118
    .line 119
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget-object v1, La/iun;->a:La/iun;

    .line 124
    .line 125
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 126
    .line 127
    instance-of v2, v0, La/g0g0;

    .line 128
    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    move-object v0, v1

    .line 132
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 133
    .line 134
    invoke-direct {p0, v0}, La/lsh0;-><init>(Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_3
    new-instance p0, La/vch0;

    .line 139
    .line 140
    sget-object v0, La/w7f;->u:La/w7f;

    .line 141
    .line 142
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 147
    .line 148
    instance-of v1, v0, La/g0g0;

    .line 149
    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    move-object v7, v0

    .line 154
    :goto_2
    check-cast v7, Ljava/lang/String;

    .line 155
    .line 156
    invoke-direct {p0, v7}, La/vch0;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_4
    new-instance p0, La/im40;

    .line 161
    .line 162
    sget-object v0, La/w7f;->t:La/w7f;

    .line 163
    .line 164
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 169
    .line 170
    instance-of v1, v0, La/g0g0;

    .line 171
    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    move-object v7, v0

    .line 176
    :goto_3
    check-cast v7, Ljava/lang/String;

    .line 177
    .line 178
    invoke-direct {p0, v7}, La/im40;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_5
    new-instance p0, La/eo20;

    .line 183
    .line 184
    sget-object v0, La/w7f;->s:La/w7f;

    .line 185
    .line 186
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 191
    .line 192
    instance-of v1, v0, La/g0g0;

    .line 193
    .line 194
    if-eqz v1, :cond_5

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    move-object v7, v0

    .line 198
    :goto_4
    check-cast v7, Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {p0, v7}, La/eo20;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_6
    new-instance p0, La/pjy;

    .line 205
    .line 206
    sget-object v0, La/w7f;->r:La/w7f;

    .line 207
    .line 208
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 213
    .line 214
    instance-of v1, v0, La/g0g0;

    .line 215
    .line 216
    if-eqz v1, :cond_6

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_6
    move-object v7, v0

    .line 220
    :goto_5
    check-cast v7, Ljava/lang/String;

    .line 221
    .line 222
    invoke-direct {p0, v7}, La/pjy;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_7
    new-instance p0, La/leq;

    .line 227
    .line 228
    sget-object v0, La/w7f;->q:La/w7f;

    .line 229
    .line 230
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 235
    .line 236
    instance-of v1, v0, La/g0g0;

    .line 237
    .line 238
    if-eqz v1, :cond_7

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_7
    move-object v7, v0

    .line 242
    :goto_6
    check-cast v7, Ljava/lang/String;

    .line 243
    .line 244
    invoke-direct {p0, v7}, La/leq;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_8
    new-instance p0, La/nvj;

    .line 249
    .line 250
    sget-object v0, La/w7f;->e:La/w7f;

    .line 251
    .line 252
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 257
    .line 258
    instance-of v1, v0, La/g0g0;

    .line 259
    .line 260
    if-eqz v1, :cond_8

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_8
    move-object v7, v0

    .line 264
    :goto_7
    check-cast v7, Ljava/lang/String;

    .line 265
    .line 266
    invoke-direct {p0, v7}, La/nvj;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_9
    new-instance p0, La/bne;

    .line 271
    .line 272
    sget-object v0, La/w7f;->c:La/w7f;

    .line 273
    .line 274
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 283
    .line 284
    instance-of v2, v0, La/g0g0;

    .line 285
    .line 286
    if-eqz v2, :cond_9

    .line 287
    .line 288
    move-object v0, v1

    .line 289
    :cond_9
    check-cast v0, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-direct {p0, v0}, La/bne;-><init>(I)V

    .line 296
    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_a
    new-instance p0, La/y23;

    .line 300
    .line 301
    sget-object v0, La/w7f;->p:La/w7f;

    .line 302
    .line 303
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 308
    .line 309
    instance-of v1, v0, La/g0g0;

    .line 310
    .line 311
    if-eqz v1, :cond_a

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_a
    move-object v7, v0

    .line 315
    :goto_8
    check-cast v7, Ljava/lang/String;

    .line 316
    .line 317
    invoke-direct {p0, v7}, La/y23;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-object p0

    .line 321
    :pswitch_b
    new-instance p0, La/q;

    .line 322
    .line 323
    sget-object v0, La/w7f;->b:La/w7f;

    .line 324
    .line 325
    invoke-static {v5, v6, v0}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 330
    .line 331
    instance-of v1, v0, La/g0g0;

    .line 332
    .line 333
    if-eqz v1, :cond_b

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_b
    move-object v7, v0

    .line 337
    :goto_9
    check-cast v7, Ljava/lang/String;

    .line 338
    .line 339
    invoke-direct {p0, v7}, La/q;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_c
    new-instance p0, La/heq;

    .line 344
    .line 345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    .line 347
    .line 348
    return-object p0

    .line 349
    :pswitch_d
    new-instance p0, Ljava/io/File;

    .line 350
    .line 351
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-static {p0}, La/i0q;->b(Ljava/io/File;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {p0}, Lkotlin/text/StringsKt;->Z(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    new-instance v0, Ljava/util/ArrayList;

    .line 379
    .line 380
    const/16 v1, 0xa

    .line 381
    .line 382
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    move v6, v3

    .line 394
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-eqz v8, :cond_d

    .line 399
    .line 400
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    add-int/lit8 v9, v6, 0x1

    .line 405
    .line 406
    if-ltz v6, :cond_c

    .line 407
    .line 408
    check-cast v8, Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    new-instance v10, Lkotlin/Pair;

    .line 415
    .line 416
    invoke-direct {v10, v8, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move v6, v9

    .line 423
    goto :goto_a

    .line 424
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 425
    .line 426
    .line 427
    throw v2

    .line 428
    :cond_d
    sget-object v5, La/fpd;->o:La/fpd;

    .line 429
    .line 430
    const/4 v6, 0x2

    .line 431
    invoke-static {v0, v6, v4, v3, v5}, Lkotlin/collections/CollectionsKt;->R0(Ljava/util/ArrayList;IIZLkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    new-instance v5, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    move v8, v3

    .line 449
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v9

    .line 453
    if-eqz v9, :cond_10

    .line 454
    .line 455
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    add-int/lit8 v10, v8, 0x1

    .line 460
    .line 461
    if-ltz v8, :cond_f

    .line 462
    .line 463
    move-object v11, v9

    .line 464
    check-cast v11, Ljava/lang/String;

    .line 465
    .line 466
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    if-nez v8, :cond_e

    .line 475
    .line 476
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    :cond_e
    move v8, v10

    .line 480
    goto :goto_b

    .line 481
    :cond_f
    invoke-static {}, La/q3d;->p()V

    .line 482
    .line 483
    .line 484
    throw v2

    .line 485
    :cond_10
    new-instance p0, Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-static {v5, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    move v8, v3

    .line 499
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    if-eqz v9, :cond_13

    .line 504
    .line 505
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    add-int/lit8 v10, v8, 0x1

    .line 510
    .line 511
    if-ltz v8, :cond_12

    .line 512
    .line 513
    check-cast v9, Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    invoke-static {v9}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    if-eqz v9, :cond_11

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :cond_11
    move-object v8, v2

    .line 527
    :goto_d
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move v8, v10

    .line 531
    goto :goto_c

    .line 532
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 533
    .line 534
    .line 535
    throw v2

    .line 536
    :cond_13
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    new-instance v0, La/r53;

    .line 541
    .line 542
    invoke-direct {v0, v5, v4}, La/r53;-><init>(Ljava/util/ArrayList;B)V

    .line 543
    .line 544
    .line 545
    invoke-static {p0, v6, v4, v3, v0}, Lkotlin/collections/CollectionsKt;->R0(Ljava/util/ArrayList;IIZLkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    new-instance v0, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    if-eqz v5, :cond_1d

    .line 567
    .line 568
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    check-cast v5, Ljava/util/List;

    .line 573
    .line 574
    new-instance v8, Ljava/util/ArrayList;

    .line 575
    .line 576
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 577
    .line 578
    .line 579
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    :cond_14
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v9

    .line 587
    if-eqz v9, :cond_1c

    .line 588
    .line 589
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v9

    .line 593
    check-cast v9, Ljava/lang/String;

    .line 594
    .line 595
    const-string v10, ":"

    .line 596
    .line 597
    filled-new-array {v10}, [Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v10

    .line 601
    invoke-static {v9, v10, v6, v6}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    if-ne v10, v6, :cond_15

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_15
    move-object v9, v2

    .line 613
    :goto_10
    if-eqz v9, :cond_1b

    .line 614
    .line 615
    new-instance v10, Ljava/util/ArrayList;

    .line 616
    .line 617
    invoke-static {v9, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 625
    .line 626
    .line 627
    move-result-object v9

    .line 628
    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    if-eqz v11, :cond_1a

    .line 633
    .line 634
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v11

    .line 638
    check-cast v11, Ljava/lang/String;

    .line 639
    .line 640
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 641
    .line 642
    .line 643
    move-result v12

    .line 644
    move v13, v3

    .line 645
    :goto_12
    if-ge v13, v12, :cond_17

    .line 646
    .line 647
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    .line 648
    .line 649
    .line 650
    move-result v14

    .line 651
    invoke-static {v14}, Lkotlin/text/CharsKt;->d(C)Z

    .line 652
    .line 653
    .line 654
    move-result v14

    .line 655
    if-nez v14, :cond_16

    .line 656
    .line 657
    invoke-virtual {v11, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v11

    .line 661
    goto :goto_13

    .line 662
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 663
    .line 664
    goto :goto_12

    .line 665
    :cond_17
    move-object v11, v7

    .line 666
    :goto_13
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 667
    .line 668
    .line 669
    move-result v12

    .line 670
    sub-int/2addr v12, v4

    .line 671
    :goto_14
    const/4 v13, -0x1

    .line 672
    if-ge v13, v12, :cond_19

    .line 673
    .line 674
    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    .line 675
    .line 676
    .line 677
    move-result v13

    .line 678
    invoke-static {v13}, Lkotlin/text/CharsKt;->d(C)Z

    .line 679
    .line 680
    .line 681
    move-result v13

    .line 682
    if-nez v13, :cond_18

    .line 683
    .line 684
    add-int/lit8 v12, v12, 0x1

    .line 685
    .line 686
    invoke-virtual {v11, v3, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v11

    .line 690
    goto :goto_15

    .line 691
    :cond_18
    add-int/lit8 v12, v12, -0x1

    .line 692
    .line 693
    goto :goto_14

    .line 694
    :cond_19
    move-object v11, v7

    .line 695
    :goto_15
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    goto :goto_11

    .line 699
    :cond_1a
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v10

    .line 707
    new-instance v11, Lkotlin/Pair;

    .line 708
    .line 709
    invoke-direct {v11, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    goto :goto_16

    .line 713
    :cond_1b
    move-object v11, v2

    .line 714
    :goto_16
    if-eqz v11, :cond_14

    .line 715
    .line 716
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    goto/16 :goto_f

    .line 720
    .line 721
    :cond_1c
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    goto/16 :goto_e

    .line 725
    .line 726
    :cond_1d
    new-instance p0, Ljava/util/ArrayList;

    .line 727
    .line 728
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    :cond_1e
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_1f

    .line 740
    .line 741
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    move-object v5, v2

    .line 746
    check-cast v5, Ljava/util/List;

    .line 747
    .line 748
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    if-nez v5, :cond_1e

    .line 753
    .line 754
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_17

    .line 758
    :cond_1f
    new-instance v0, Ljava/util/ArrayList;

    .line 759
    .line 760
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    if-eqz v5, :cond_23

    .line 776
    .line 777
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    check-cast v5, Ljava/util/List;

    .line 782
    .line 783
    new-instance v6, Ljava/util/ArrayList;

    .line 784
    .line 785
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 786
    .line 787
    .line 788
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    move v7, v3

    .line 793
    :cond_20
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 794
    .line 795
    .line 796
    move-result v8

    .line 797
    if-eqz v8, :cond_22

    .line 798
    .line 799
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    if-eqz v7, :cond_21

    .line 804
    .line 805
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto :goto_19

    .line 809
    :cond_21
    move-object v9, v8

    .line 810
    check-cast v9, Lkotlin/Pair;

    .line 811
    .line 812
    invoke-static {v9}, La/bkb;->d0(Lkotlin/Pair;)Z

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    if-eqz v9, :cond_20

    .line 817
    .line 818
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move v7, v4

    .line 822
    goto :goto_19

    .line 823
    :cond_22
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    goto :goto_18

    .line 827
    :cond_23
    new-instance v2, Ljava/util/ArrayList;

    .line 828
    .line 829
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    :cond_24
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-eqz v3, :cond_25

    .line 841
    .line 842
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    move-object v4, v3

    .line 847
    check-cast v4, Ljava/util/List;

    .line 848
    .line 849
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-nez v4, :cond_24

    .line 854
    .line 855
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    goto :goto_1a

    .line 859
    :cond_25
    new-instance v0, Ljava/util/ArrayList;

    .line 860
    .line 861
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    if-eqz v3, :cond_28

    .line 877
    .line 878
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    check-cast v3, Ljava/util/List;

    .line 883
    .line 884
    new-instance v4, Ljava/util/ArrayList;

    .line 885
    .line 886
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 887
    .line 888
    .line 889
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    :cond_26
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 894
    .line 895
    .line 896
    move-result v5

    .line 897
    if-eqz v5, :cond_27

    .line 898
    .line 899
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    move-object v6, v5

    .line 904
    check-cast v6, Lkotlin/Pair;

    .line 905
    .line 906
    invoke-static {v6}, La/bkb;->d0(Lkotlin/Pair;)Z

    .line 907
    .line 908
    .line 909
    move-result v6

    .line 910
    if-nez v6, :cond_26

    .line 911
    .line 912
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 913
    .line 914
    .line 915
    goto :goto_1c

    .line 916
    :cond_27
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    goto :goto_1b

    .line 920
    :cond_28
    new-instance v2, Ljava/util/ArrayList;

    .line 921
    .line 922
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 930
    .line 931
    .line 932
    move-result-object p0

    .line 933
    :goto_1d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    if-eqz v1, :cond_2b

    .line 938
    .line 939
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v1

    .line 943
    check-cast v1, Ljava/util/List;

    .line 944
    .line 945
    new-instance v3, Ljava/util/ArrayList;

    .line 946
    .line 947
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 948
    .line 949
    .line 950
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 955
    .line 956
    .line 957
    move-result v4

    .line 958
    if-eqz v4, :cond_2a

    .line 959
    .line 960
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    move-object v5, v4

    .line 965
    check-cast v5, Lkotlin/Pair;

    .line 966
    .line 967
    invoke-static {v5}, La/bkb;->d0(Lkotlin/Pair;)Z

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    if-eqz v5, :cond_29

    .line 972
    .line 973
    goto :goto_1f

    .line 974
    :cond_29
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    goto :goto_1e

    .line 978
    :cond_2a
    :goto_1f
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    goto :goto_1d

    .line 982
    :cond_2b
    new-instance p0, Ljava/util/ArrayList;

    .line 983
    .line 984
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    :cond_2c
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 992
    .line 993
    .line 994
    move-result v2

    .line 995
    if-eqz v2, :cond_2d

    .line 996
    .line 997
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    move-object v3, v2

    .line 1002
    check-cast v3, Ljava/util/List;

    .line 1003
    .line 1004
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    if-nez v3, :cond_2c

    .line 1009
    .line 1010
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    goto :goto_20

    .line 1014
    :cond_2d
    invoke-static {p0}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p0

    .line 1018
    new-instance v1, La/v7f;

    .line 1019
    .line 1020
    invoke-direct {v1, p0, v0}, La/v7f;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 1021
    .line 1022
    .line 1023
    return-object v1

    .line 1024
    :pswitch_e
    new-instance p0, Ljava/util/HashMap;

    .line 1025
    .line 1026
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 1027
    .line 1028
    .line 1029
    new-instance v2, Ljava/util/Scanner;

    .line 1030
    .line 1031
    new-instance v5, Ljava/io/File;

    .line 1032
    .line 1033
    invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-direct {v2, v5}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    .line 1037
    .line 1038
    .line 1039
    :cond_2e
    :goto_21
    :try_start_0
    invoke-virtual {v2}, Ljava/util/Scanner;->hasNextLine()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    if-eqz v1, :cond_3b

    .line 1044
    .line 1045
    invoke-virtual {v2}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    const-string v5, ": "

    .line 1053
    .line 1054
    filled-new-array {v5}, [Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    const/4 v6, 0x6

    .line 1059
    invoke-static {v1, v5, v3, v6}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v1

    .line 1063
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1064
    .line 1065
    .line 1066
    move-result v5

    .line 1067
    if-le v5, v4, :cond_2e

    .line 1068
    .line 1069
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    check-cast v5, Ljava/lang/String;

    .line 1074
    .line 1075
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    sub-int/2addr v6, v4

    .line 1080
    move v7, v3

    .line 1081
    move v8, v7

    .line 1082
    :goto_22
    if-gt v7, v6, :cond_34

    .line 1083
    .line 1084
    if-nez v8, :cond_2f

    .line 1085
    .line 1086
    move v9, v7

    .line 1087
    goto :goto_23

    .line 1088
    :cond_2f
    move v9, v6

    .line 1089
    :goto_23
    invoke-virtual {v5, v9}, Ljava/lang/String;->charAt(I)C

    .line 1090
    .line 1091
    .line 1092
    move-result v9

    .line 1093
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1094
    .line 1095
    .line 1096
    move-result v9

    .line 1097
    if-gtz v9, :cond_30

    .line 1098
    .line 1099
    move v9, v4

    .line 1100
    goto :goto_24

    .line 1101
    :cond_30
    move v9, v3

    .line 1102
    :goto_24
    if-nez v8, :cond_32

    .line 1103
    .line 1104
    if-nez v9, :cond_31

    .line 1105
    .line 1106
    move v8, v4

    .line 1107
    goto :goto_22

    .line 1108
    :cond_31
    add-int/lit8 v7, v7, 0x1

    .line 1109
    .line 1110
    goto :goto_22

    .line 1111
    :cond_32
    if-nez v9, :cond_33

    .line 1112
    .line 1113
    goto :goto_25

    .line 1114
    :cond_33
    add-int/lit8 v6, v6, -0x1

    .line 1115
    .line 1116
    goto :goto_22

    .line 1117
    :catchall_0
    move-exception p0

    .line 1118
    goto :goto_2a

    .line 1119
    :cond_34
    :goto_25
    add-int/lit8 v6, v6, 0x1

    .line 1120
    .line 1121
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v5

    .line 1125
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v5

    .line 1129
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    check-cast v1, Ljava/lang/String;

    .line 1134
    .line 1135
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1136
    .line 1137
    .line 1138
    move-result v6

    .line 1139
    sub-int/2addr v6, v4

    .line 1140
    move v7, v3

    .line 1141
    move v8, v7

    .line 1142
    :goto_26
    if-gt v7, v6, :cond_3a

    .line 1143
    .line 1144
    if-nez v8, :cond_35

    .line 1145
    .line 1146
    move v9, v7

    .line 1147
    goto :goto_27

    .line 1148
    :cond_35
    move v9, v6

    .line 1149
    :goto_27
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 1150
    .line 1151
    .line 1152
    move-result v9

    .line 1153
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1154
    .line 1155
    .line 1156
    move-result v9

    .line 1157
    if-gtz v9, :cond_36

    .line 1158
    .line 1159
    move v9, v4

    .line 1160
    goto :goto_28

    .line 1161
    :cond_36
    move v9, v3

    .line 1162
    :goto_28
    if-nez v8, :cond_38

    .line 1163
    .line 1164
    if-nez v9, :cond_37

    .line 1165
    .line 1166
    move v8, v4

    .line 1167
    goto :goto_26

    .line 1168
    :cond_37
    add-int/lit8 v7, v7, 0x1

    .line 1169
    .line 1170
    goto :goto_26

    .line 1171
    :cond_38
    if-nez v9, :cond_39

    .line 1172
    .line 1173
    goto :goto_29

    .line 1174
    :cond_39
    add-int/lit8 v6, v6, -0x1

    .line 1175
    .line 1176
    goto :goto_26

    .line 1177
    :cond_3a
    :goto_29
    add-int/lit8 v6, v6, 0x1

    .line 1178
    .line 1179
    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    invoke-virtual {p0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1188
    .line 1189
    .line 1190
    goto/16 :goto_21

    .line 1191
    .line 1192
    :cond_3b
    invoke-virtual {v2}, Ljava/util/Scanner;->close()V

    .line 1193
    .line 1194
    .line 1195
    return-object p0

    .line 1196
    :goto_2a
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1197
    :catchall_1
    move-exception v0

    .line 1198
    invoke-static {v2, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1199
    .line 1200
    .line 1201
    throw v0

    .line 1202
    :pswitch_f
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 1203
    .line 1204
    .line 1205
    move-result p0

    .line 1206
    new-instance v0, Ljava/util/LinkedList;

    .line 1207
    .line 1208
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 1209
    .line 1210
    .line 1211
    :goto_2b
    if-ge v3, p0, :cond_3e

    .line 1212
    .line 1213
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    .line 1214
    .line 1215
    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 1216
    .line 1217
    .line 1218
    invoke-static {v3, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 1219
    .line 1220
    .line 1221
    iget v2, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 1222
    .line 1223
    if-eqz v2, :cond_3d

    .line 1224
    .line 1225
    if-eq v2, v4, :cond_3c

    .line 1226
    .line 1227
    move-object v2, v7

    .line 1228
    goto :goto_2c

    .line 1229
    :cond_3c
    const-string v2, "front"

    .line 1230
    .line 1231
    goto :goto_2c

    .line 1232
    :cond_3d
    const-string v2, "back"

    .line 1233
    .line 1234
    :goto_2c
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 1235
    .line 1236
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    new-instance v5, La/i0a;

    .line 1241
    .line 1242
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v6

    .line 1246
    invoke-direct {v5, v6, v2, v1}, La/i0a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    add-int/lit8 v3, v3, 0x1

    .line 1253
    .line 1254
    goto :goto_2b

    .line 1255
    :cond_3e
    return-object v0

    .line 1256
    :pswitch_10
    new-instance p0, Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1259
    .line 1260
    .line 1261
    return-object p0

    .line 1262
    :pswitch_11
    new-instance p0, La/stt0;

    .line 1263
    .line 1264
    invoke-direct {p0, v4}, La/stt0;-><init>(B)V

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v0, p0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 1268
    .line 1269
    .line 1270
    move-result-object p0

    .line 1271
    return-object p0

    .line 1272
    :pswitch_12
    new-instance p0, Landroid/os/Handler;

    .line 1273
    .line 1274
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1279
    .line 1280
    .line 1281
    return-object p0

    .line 1282
    :pswitch_13
    return-object v2

    .line 1283
    :pswitch_14
    const-string p0, "https://api.vk.com/method"

    .line 1284
    .line 1285
    return-object p0

    .line 1286
    :pswitch_15
    const-string p0, "en"

    .line 1287
    .line 1288
    return-object p0

    .line 1289
    :pswitch_16
    const-string p0, "api.vk.com"

    .line 1290
    .line 1291
    return-object p0

    .line 1292
    nop

    .line 1293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
