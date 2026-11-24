.class public final synthetic La/m1b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/m1b;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/m1b;->a:B

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    check-cast v0, La/abi0;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const v1, 0x7f080839

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, La/cbi0;->c(La/abi0;I)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object v0, v1

    .line 31
    check-cast v0, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    move-object v0, v1

    .line 43
    check-cast v0, La/sjb;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v1, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_2
    move-object v0, v1

    .line 60
    check-cast v0, La/sjb;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :pswitch_3
    move-object v0, v1

    .line 71
    check-cast v0, La/nll0;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v1, La/vkb;

    .line 77
    .line 78
    invoke-direct {v1, v0}, La/vkb;-><init>(La/nll0;)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_4
    move-object v0, v1

    .line 83
    check-cast v0, La/sjd;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v1, La/ukb;

    .line 89
    .line 90
    invoke-direct {v1, v0}, La/ukb;-><init>(La/sjd;)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_5
    move-object v0, v1

    .line 95
    check-cast v0, Lokhttp3/tls/internal/der/PrivateKeyInfo;

    .line 96
    .line 97
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-wide v1, v0, Lokhttp3/tls/internal/der/PrivateKeyInfo;->a:J

    .line 103
    .line 104
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, v0, Lokhttp3/tls/internal/der/PrivateKeyInfo;->b:Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 109
    .line 110
    iget-object v0, v0, Lokhttp3/tls/internal/der/PrivateKeyInfo;->c:La/qg9;

    .line 111
    .line 112
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0

    .line 121
    :pswitch_6
    move-object v0, v1

    .line 122
    check-cast v0, Ljava/util/List;

    .line 123
    .line 124
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v1, Lokhttp3/tls/internal/der/Certificate;

    .line 130
    .line 131
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v2, Lokhttp3/tls/internal/der/TbsCertificate;

    .line 139
    .line 140
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast v3, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 148
    .line 149
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    check-cast v0, Lokhttp3/tls/internal/der/BitString;

    .line 157
    .line 158
    invoke-direct {v1, v2, v3, v0}, Lokhttp3/tls/internal/der/Certificate;-><init>(Lokhttp3/tls/internal/der/TbsCertificate;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :pswitch_7
    move-object v0, v1

    .line 163
    check-cast v0, Lokhttp3/tls/internal/der/Certificate;

    .line 164
    .line 165
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v1, v0, Lokhttp3/tls/internal/der/Certificate;->a:Lokhttp3/tls/internal/der/TbsCertificate;

    .line 171
    .line 172
    iget-object v2, v0, Lokhttp3/tls/internal/der/Certificate;->b:Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 173
    .line 174
    iget-object v0, v0, Lokhttp3/tls/internal/der/Certificate;->c:Lokhttp3/tls/internal/der/BitString;

    .line 175
    .line 176
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    return-object v0

    .line 185
    :pswitch_8
    move-object v0, v1

    .line 186
    check-cast v0, Ljava/util/List;

    .line 187
    .line 188
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v7, Lokhttp3/tls/internal/der/TbsCertificate;

    .line 194
    .line 195
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    check-cast v1, Ljava/lang/Long;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 205
    .line 206
    .line 207
    move-result-wide v8

    .line 208
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-object v10, v1

    .line 216
    check-cast v10, Ljava/math/BigInteger;

    .line 217
    .line 218
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-object v11, v1

    .line 226
    check-cast v11, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 227
    .line 228
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    check-cast v1, Lkotlin/Pair;

    .line 236
    .line 237
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object v12, v1

    .line 243
    check-cast v12, Ljava/util/List;

    .line 244
    .line 245
    const/4 v1, 0x4

    .line 246
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-object v13, v1

    .line 254
    check-cast v13, Lokhttp3/tls/internal/der/Validity;

    .line 255
    .line 256
    const/4 v1, 0x5

    .line 257
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast v1, Lkotlin/Pair;

    .line 265
    .line 266
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-object v14, v1

    .line 272
    check-cast v14, Ljava/util/List;

    .line 273
    .line 274
    const/4 v1, 0x6

    .line 275
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object v15, v1

    .line 283
    check-cast v15, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;

    .line 284
    .line 285
    const/4 v1, 0x7

    .line 286
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    move-object/from16 v16, v1

    .line 291
    .line 292
    check-cast v16, Lokhttp3/tls/internal/der/BitString;

    .line 293
    .line 294
    const/16 v1, 0x8

    .line 295
    .line 296
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    move-object/from16 v17, v1

    .line 301
    .line 302
    check-cast v17, Lokhttp3/tls/internal/der/BitString;

    .line 303
    .line 304
    const/16 v1, 0x9

    .line 305
    .line 306
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-object/from16 v18, v0

    .line 314
    .line 315
    check-cast v18, Ljava/util/List;

    .line 316
    .line 317
    invoke-direct/range {v7 .. v18}, Lokhttp3/tls/internal/der/TbsCertificate;-><init>(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Ljava/util/List;Lokhttp3/tls/internal/der/Validity;Ljava/util/List;Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;Lokhttp3/tls/internal/der/BitString;Lokhttp3/tls/internal/der/BitString;Ljava/util/List;)V

    .line 318
    .line 319
    .line 320
    return-object v7

    .line 321
    :pswitch_9
    move-object v0, v1

    .line 322
    check-cast v0, Lokhttp3/tls/internal/der/TbsCertificate;

    .line 323
    .line 324
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-wide v1, v0, Lokhttp3/tls/internal/der/TbsCertificate;->a:J

    .line 330
    .line 331
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    iget-object v4, v0, Lokhttp3/tls/internal/der/TbsCertificate;->b:Ljava/math/BigInteger;

    .line 336
    .line 337
    iget-object v5, v0, Lokhttp3/tls/internal/der/TbsCertificate;->c:Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 338
    .line 339
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->e:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 340
    .line 341
    iget-object v2, v0, Lokhttp3/tls/internal/der/TbsCertificate;->d:Ljava/util/List;

    .line 342
    .line 343
    new-instance v6, Lkotlin/Pair;

    .line 344
    .line 345
    invoke-direct {v6, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    iget-object v7, v0, Lokhttp3/tls/internal/der/TbsCertificate;->e:Lokhttp3/tls/internal/der/Validity;

    .line 349
    .line 350
    iget-object v2, v0, Lokhttp3/tls/internal/der/TbsCertificate;->f:Ljava/util/List;

    .line 351
    .line 352
    new-instance v8, Lkotlin/Pair;

    .line 353
    .line 354
    invoke-direct {v8, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iget-object v9, v0, Lokhttp3/tls/internal/der/TbsCertificate;->g:Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;

    .line 358
    .line 359
    iget-object v10, v0, Lokhttp3/tls/internal/der/TbsCertificate;->h:Lokhttp3/tls/internal/der/BitString;

    .line 360
    .line 361
    iget-object v11, v0, Lokhttp3/tls/internal/der/TbsCertificate;->i:Lokhttp3/tls/internal/der/BitString;

    .line 362
    .line 363
    iget-object v12, v0, Lokhttp3/tls/internal/der/TbsCertificate;->j:Ljava/util/List;

    .line 364
    .line 365
    filled-new-array/range {v3 .. v12}, [Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    return-object v0

    .line 374
    :pswitch_a
    move-object v0, v1

    .line 375
    check-cast v0, Ljava/util/List;

    .line 376
    .line 377
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v1, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;

    .line 383
    .line 384
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    check-cast v2, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 392
    .line 393
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    check-cast v0, Lokhttp3/tls/internal/der/BitString;

    .line 401
    .line 402
    invoke-direct {v1, v2, v0}, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;-><init>(Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V

    .line 403
    .line 404
    .line 405
    return-object v1

    .line 406
    :pswitch_b
    move-object v0, v1

    .line 407
    check-cast v0, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;

    .line 408
    .line 409
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v1, v0, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;->a:Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 415
    .line 416
    iget-object v0, v0, Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;->b:Lokhttp3/tls/internal/der/BitString;

    .line 417
    .line 418
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    return-object v0

    .line 427
    :pswitch_c
    move-object v0, v1

    .line 428
    check-cast v0, Ljava/util/List;

    .line 429
    .line 430
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    new-instance v1, Lokhttp3/tls/internal/der/AttributeTypeAndValue;

    .line 436
    .line 437
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    check-cast v2, Ljava/lang/String;

    .line 445
    .line 446
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-direct {v1, v2, v0}, Lokhttp3/tls/internal/der/AttributeTypeAndValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    return-object v1

    .line 454
    :pswitch_d
    move-object v0, v1

    .line 455
    check-cast v0, Lokhttp3/tls/internal/der/AttributeTypeAndValue;

    .line 456
    .line 457
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 458
    .line 459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    iget-object v1, v0, Lokhttp3/tls/internal/der/AttributeTypeAndValue;->a:Ljava/lang/String;

    .line 463
    .line 464
    iget-object v0, v0, Lokhttp3/tls/internal/der/AttributeTypeAndValue;->b:Ljava/lang/Object;

    .line 465
    .line 466
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :pswitch_e
    move-object v0, v1

    .line 476
    check-cast v0, Ljava/util/List;

    .line 477
    .line 478
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    new-instance v1, Lokhttp3/tls/internal/der/Extension;

    .line 484
    .line 485
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    check-cast v2, Ljava/lang/String;

    .line 493
    .line 494
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    check-cast v3, Ljava/lang/Boolean;

    .line 502
    .line 503
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-direct {v1, v2, v0, v3}, Lokhttp3/tls/internal/der/Extension;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 512
    .line 513
    .line 514
    return-object v1

    .line 515
    :pswitch_f
    move-object v0, v1

    .line 516
    check-cast v0, Lokhttp3/tls/internal/der/Extension;

    .line 517
    .line 518
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    iget-object v1, v0, Lokhttp3/tls/internal/der/Extension;->a:Ljava/lang/String;

    .line 524
    .line 525
    iget-boolean v2, v0, Lokhttp3/tls/internal/der/Extension;->b:Z

    .line 526
    .line 527
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    iget-object v0, v0, Lokhttp3/tls/internal/der/Extension;->c:Ljava/lang/Object;

    .line 532
    .line 533
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    return-object v0

    .line 542
    :pswitch_10
    sget-object v0, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 543
    .line 544
    const-string v0, "2.5.29.17"

    .line 545
    .line 546
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-eqz v0, :cond_0

    .line 551
    .line 552
    sget-object v3, Lokhttp3/tls/internal/der/CertificateAdapters;->d:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 553
    .line 554
    goto :goto_0

    .line 555
    :cond_0
    const-string v0, "2.5.29.19"

    .line 556
    .line 557
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-eqz v0, :cond_1

    .line 562
    .line 563
    sget-object v3, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 564
    .line 565
    :cond_1
    :goto_0
    return-object v3

    .line 566
    :pswitch_11
    move-object v0, v1

    .line 567
    check-cast v0, Ljava/util/List;

    .line 568
    .line 569
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    new-instance v1, Lokhttp3/tls/internal/der/BasicConstraints;

    .line 575
    .line 576
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    check-cast v2, Ljava/lang/Boolean;

    .line 584
    .line 585
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    check-cast v0, Ljava/lang/Long;

    .line 594
    .line 595
    invoke-direct {v1, v0, v2}, Lokhttp3/tls/internal/der/BasicConstraints;-><init>(Ljava/lang/Long;Z)V

    .line 596
    .line 597
    .line 598
    return-object v1

    .line 599
    :pswitch_12
    move-object v0, v1

    .line 600
    check-cast v0, Lokhttp3/tls/internal/der/BasicConstraints;

    .line 601
    .line 602
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    iget-boolean v1, v0, Lokhttp3/tls/internal/der/BasicConstraints;->a:Z

    .line 608
    .line 609
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    iget-object v0, v0, Lokhttp3/tls/internal/der/BasicConstraints;->b:Ljava/lang/Long;

    .line 614
    .line 615
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    return-object v0

    .line 624
    :pswitch_13
    move-object v0, v1

    .line 625
    check-cast v0, Ljava/util/List;

    .line 626
    .line 627
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    new-instance v1, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 633
    .line 634
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    check-cast v2, Ljava/lang/String;

    .line 642
    .line 643
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-direct {v1, v2, v0}, Lokhttp3/tls/internal/der/AlgorithmIdentifier;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    return-object v1

    .line 651
    :pswitch_14
    move-object v0, v1

    .line 652
    check-cast v0, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 653
    .line 654
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 655
    .line 656
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    iget-object v1, v0, Lokhttp3/tls/internal/der/AlgorithmIdentifier;->a:Ljava/lang/String;

    .line 660
    .line 661
    iget-object v0, v0, Lokhttp3/tls/internal/der/AlgorithmIdentifier;->b:Ljava/lang/Object;

    .line 662
    .line 663
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    return-object v0

    .line 672
    :pswitch_15
    sget-object v0, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 673
    .line 674
    const-string v0, "1.2.840.113549.1.1.11"

    .line 675
    .line 676
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_2

    .line 681
    .line 682
    sget-object v3, Lokhttp3/tls/internal/der/Adapters;->f:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 683
    .line 684
    goto :goto_1

    .line 685
    :cond_2
    const-string v0, "1.2.840.113549.1.1.1"

    .line 686
    .line 687
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_3

    .line 692
    .line 693
    sget-object v3, Lokhttp3/tls/internal/der/Adapters;->f:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 694
    .line 695
    goto :goto_1

    .line 696
    :cond_3
    const-string v0, "1.2.840.10045.2.1"

    .line 697
    .line 698
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-eqz v0, :cond_4

    .line 703
    .line 704
    sget-object v3, Lokhttp3/tls/internal/der/Adapters;->g:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 705
    .line 706
    :cond_4
    :goto_1
    return-object v3

    .line 707
    :pswitch_16
    move-object v0, v1

    .line 708
    check-cast v0, Ljava/util/List;

    .line 709
    .line 710
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    new-instance v1, Lokhttp3/tls/internal/der/Validity;

    .line 716
    .line 717
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    check-cast v2, Ljava/lang/Long;

    .line 725
    .line 726
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 727
    .line 728
    .line 729
    move-result-wide v2

    .line 730
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    check-cast v0, Ljava/lang/Long;

    .line 738
    .line 739
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 740
    .line 741
    .line 742
    move-result-wide v4

    .line 743
    invoke-direct {v1, v2, v3, v4, v5}, Lokhttp3/tls/internal/der/Validity;-><init>(JJ)V

    .line 744
    .line 745
    .line 746
    return-object v1

    .line 747
    :pswitch_17
    move-object v0, v1

    .line 748
    check-cast v0, Ljava/util/List;

    .line 749
    .line 750
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    new-instance v1, Lokhttp3/tls/internal/der/PrivateKeyInfo;

    .line 756
    .line 757
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    check-cast v2, Ljava/lang/Long;

    .line 765
    .line 766
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 767
    .line 768
    .line 769
    move-result-wide v2

    .line 770
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v5

    .line 774
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    check-cast v5, Lokhttp3/tls/internal/der/AlgorithmIdentifier;

    .line 778
    .line 779
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    check-cast v0, La/qg9;

    .line 787
    .line 788
    invoke-direct {v1, v2, v3, v5, v0}, Lokhttp3/tls/internal/der/PrivateKeyInfo;-><init>(JLokhttp3/tls/internal/der/AlgorithmIdentifier;La/qg9;)V

    .line 789
    .line 790
    .line 791
    return-object v1

    .line 792
    :pswitch_18
    move-object v0, v1

    .line 793
    check-cast v0, Lokhttp3/tls/internal/der/Validity;

    .line 794
    .line 795
    sget-object v1, Lokhttp3/tls/internal/der/CertificateAdapters;->a:Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 796
    .line 797
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-wide v1, v0, Lokhttp3/tls/internal/der/Validity;->a:J

    .line 801
    .line 802
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    iget-wide v2, v0, Lokhttp3/tls/internal/der/Validity;->b:J

    .line 807
    .line 808
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    filled-new-array {v1, v0}, [Ljava/lang/Long;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    return-object v0

    .line 821
    :pswitch_19
    move-object v0, v1

    .line 822
    check-cast v0, La/y130;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    new-instance v1, La/o6b;

    .line 828
    .line 829
    invoke-direct {v1, v0}, La/o6b;-><init>(La/y130;)V

    .line 830
    .line 831
    .line 832
    return-object v1

    .line 833
    :pswitch_1a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    move-object v0, v1

    .line 837
    check-cast v0, Ljava/util/Collection;

    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_1b
    move-object v0, v1

    .line 841
    check-cast v0, La/hcz;

    .line 842
    .line 843
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    :goto_2
    const/16 v1, 0x14

    .line 847
    .line 848
    if-ge v6, v1, :cond_5

    .line 849
    .line 850
    sget-object v1, La/qjj;->a:La/ugd;

    .line 851
    .line 852
    invoke-static {v0, v3, v3, v1, v2}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 853
    .line 854
    .line 855
    add-int/lit8 v6, v6, 0x1

    .line 856
    .line 857
    goto :goto_2

    .line 858
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_1c
    move-object v0, v1

    .line 862
    check-cast v0, Ljava/lang/Throwable;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 868
    .line 869
    .line 870
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 871
    .line 872
    return-object v0

    .line 873
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
