.class public abstract La/jsb0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/iay;

.field public static final b:La/iay;

.field public static final c:La/iay;

.field public static final d:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, La/iay;

    .line 2
    .line 3
    sget-object v1, La/p860;->b:La/p860;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/iay;-><init>(La/p860;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/jsb0;->a:La/iay;

    .line 10
    .line 11
    new-instance v0, La/iay;

    .line 12
    .line 13
    sget-object v1, La/p860;->c:La/p860;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/iay;-><init>(La/p860;Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/jsb0;->b:La/iay;

    .line 19
    .line 20
    new-instance v0, La/iay;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v0, v1, v3}, La/iay;-><init>(La/p860;Z)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/jsb0;->c:La/iay;

    .line 27
    .line 28
    new-instance v0, La/ea70;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, v1}, La/ea70;-><init>(B)V

    .line 32
    .line 33
    .line 34
    new-instance v4, La/fuj0;

    .line 35
    .line 36
    const-string v5, "java/util/Iterator"

    .line 37
    .line 38
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, La/gsb0;

    .line 42
    .line 43
    const-string v6, "java/util/function/Consumer"

    .line 44
    .line 45
    invoke-direct {v5, v6, v2}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 46
    .line 47
    .line 48
    const-string v7, "forEachRemaining"

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-virtual {v4, v7, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La/fuj0;

    .line 55
    .line 56
    const-string v5, "java/lang/Iterable"

    .line 57
    .line 58
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v5, La/pnk0;

    .line 62
    .line 63
    const/16 v7, 0x16

    .line 64
    .line 65
    invoke-direct {v5, v7}, La/pnk0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    const-string v9, "spliterator"

    .line 69
    .line 70
    invoke-virtual {v4, v9, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, La/fuj0;

    .line 74
    .line 75
    const-string v5, "java/util/Collection"

    .line 76
    .line 77
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v5, La/gsb0;

    .line 81
    .line 82
    const/16 v9, 0x11

    .line 83
    .line 84
    const-string v10, "java/util/function/Predicate"

    .line 85
    .line 86
    invoke-direct {v5, v10, v9}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 87
    .line 88
    .line 89
    const-string v9, "removeIf"

    .line 90
    .line 91
    invoke-virtual {v4, v9, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 92
    .line 93
    .line 94
    new-instance v5, La/gsb0;

    .line 95
    .line 96
    const/16 v9, 0x1a

    .line 97
    .line 98
    const-string v11, "java/util/stream/Stream"

    .line 99
    .line 100
    invoke-direct {v5, v11, v9}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 101
    .line 102
    .line 103
    const-string v9, "stream"

    .line 104
    .line 105
    invoke-virtual {v4, v9, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 106
    .line 107
    .line 108
    new-instance v5, La/isb0;

    .line 109
    .line 110
    invoke-direct {v5, v11, v3}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 111
    .line 112
    .line 113
    const-string v9, "parallelStream"

    .line 114
    .line 115
    invoke-virtual {v4, v9, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    new-instance v4, La/fuj0;

    .line 119
    .line 120
    const-string v5, "java/util/List"

    .line 121
    .line 122
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v5, La/isb0;

    .line 126
    .line 127
    const-string v9, "java/util/function/UnaryOperator"

    .line 128
    .line 129
    invoke-direct {v5, v9, v1}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 130
    .line 131
    .line 132
    const-string v9, "replaceAll"

    .line 133
    .line 134
    invoke-virtual {v4, v9, v8, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 135
    .line 136
    .line 137
    new-instance v5, La/isb0;

    .line 138
    .line 139
    const-string v11, "java/lang/Object"

    .line 140
    .line 141
    const/4 v12, 0x3

    .line 142
    invoke-direct {v5, v11, v12}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 143
    .line 144
    .line 145
    const-string v13, "addFirst"

    .line 146
    .line 147
    const-string v14, "2.1"

    .line 148
    .line 149
    invoke-virtual {v4, v13, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 150
    .line 151
    .line 152
    new-instance v5, La/isb0;

    .line 153
    .line 154
    const/4 v15, 0x4

    .line 155
    invoke-direct {v5, v11, v15}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 156
    .line 157
    .line 158
    const-string v7, "addLast"

    .line 159
    .line 160
    invoke-virtual {v4, v7, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 161
    .line 162
    .line 163
    new-instance v5, La/isb0;

    .line 164
    .line 165
    const/4 v2, 0x5

    .line 166
    invoke-direct {v5, v11, v2}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 167
    .line 168
    .line 169
    const-string v8, "removeFirst"

    .line 170
    .line 171
    invoke-virtual {v4, v8, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 172
    .line 173
    .line 174
    new-instance v5, La/isb0;

    .line 175
    .line 176
    const/4 v2, 0x6

    .line 177
    invoke-direct {v5, v11, v2}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 178
    .line 179
    .line 180
    const-string v2, "removeLast"

    .line 181
    .line 182
    invoke-virtual {v4, v2, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 183
    .line 184
    .line 185
    new-instance v4, La/fuj0;

    .line 186
    .line 187
    const-string v5, "java/util/LinkedList"

    .line 188
    .line 189
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    new-instance v5, La/gsb0;

    .line 193
    .line 194
    invoke-direct {v5, v11, v3}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v13, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    new-instance v5, La/gsb0;

    .line 201
    .line 202
    invoke-direct {v5, v11, v1}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v7, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 206
    .line 207
    .line 208
    new-instance v5, La/gsb0;

    .line 209
    .line 210
    invoke-direct {v5, v11, v12}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v8, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 214
    .line 215
    .line 216
    new-instance v5, La/gsb0;

    .line 217
    .line 218
    invoke-direct {v5, v11, v15}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v2, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 222
    .line 223
    .line 224
    new-instance v4, La/fuj0;

    .line 225
    .line 226
    const-string v5, "java/util/LinkedHashSet"

    .line 227
    .line 228
    invoke-direct {v4, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    new-instance v5, La/gsb0;

    .line 232
    .line 233
    const/4 v14, 0x5

    .line 234
    invoke-direct {v5, v11, v14}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 235
    .line 236
    .line 237
    const-string v14, "2.2"

    .line 238
    .line 239
    invoke-virtual {v4, v13, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 240
    .line 241
    .line 242
    new-instance v5, La/gsb0;

    .line 243
    .line 244
    const/4 v13, 0x6

    .line 245
    invoke-direct {v5, v11, v13}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4, v7, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 249
    .line 250
    .line 251
    new-instance v5, La/gsb0;

    .line 252
    .line 253
    const/4 v7, 0x7

    .line 254
    invoke-direct {v5, v11, v7}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v8, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 258
    .line 259
    .line 260
    new-instance v5, La/gsb0;

    .line 261
    .line 262
    const/16 v7, 0x8

    .line 263
    .line 264
    invoke-direct {v5, v11, v7}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v2, v14, v5}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 268
    .line 269
    .line 270
    new-instance v2, La/gsb0;

    .line 271
    .line 272
    const/16 v5, 0x9

    .line 273
    .line 274
    invoke-direct {v2, v11, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 275
    .line 276
    .line 277
    const-string v5, "getFirst"

    .line 278
    .line 279
    invoke-virtual {v4, v5, v14, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 280
    .line 281
    .line 282
    new-instance v2, La/gsb0;

    .line 283
    .line 284
    const/16 v5, 0xa

    .line 285
    .line 286
    invoke-direct {v2, v11, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 287
    .line 288
    .line 289
    const-string v5, "getLast"

    .line 290
    .line 291
    invoke-virtual {v4, v5, v14, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 292
    .line 293
    .line 294
    new-instance v2, La/fuj0;

    .line 295
    .line 296
    const-string v4, "java/util/Map"

    .line 297
    .line 298
    invoke-direct {v2, v0, v4}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    new-instance v4, La/gsb0;

    .line 302
    .line 303
    const/16 v5, 0xb

    .line 304
    .line 305
    const-string v7, "java/util/function/BiConsumer"

    .line 306
    .line 307
    invoke-direct {v4, v7, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 308
    .line 309
    .line 310
    const-string v5, "forEach"

    .line 311
    .line 312
    const/4 v8, 0x0

    .line 313
    invoke-virtual {v2, v5, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 314
    .line 315
    .line 316
    new-instance v4, La/gsb0;

    .line 317
    .line 318
    const/16 v5, 0xc

    .line 319
    .line 320
    invoke-direct {v4, v11, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 321
    .line 322
    .line 323
    const-string v5, "putIfAbsent"

    .line 324
    .line 325
    invoke-virtual {v2, v5, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 326
    .line 327
    .line 328
    new-instance v4, La/gsb0;

    .line 329
    .line 330
    const/16 v5, 0xd

    .line 331
    .line 332
    invoke-direct {v4, v11, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 333
    .line 334
    .line 335
    const-string v5, "replace"

    .line 336
    .line 337
    invoke-virtual {v2, v5, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 338
    .line 339
    .line 340
    new-instance v4, La/gsb0;

    .line 341
    .line 342
    const/16 v13, 0xe

    .line 343
    .line 344
    invoke-direct {v4, v11, v13}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v5, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 348
    .line 349
    .line 350
    new-instance v4, La/gsb0;

    .line 351
    .line 352
    const/16 v5, 0xf

    .line 353
    .line 354
    const-string v13, "java/util/function/BiFunction"

    .line 355
    .line 356
    invoke-direct {v4, v13, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v9, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 360
    .line 361
    .line 362
    new-instance v4, La/hsb0;

    .line 363
    .line 364
    const/4 v5, 0x0

    .line 365
    invoke-direct {v4, v11, v13, v5}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 366
    .line 367
    .line 368
    const-string v5, "compute"

    .line 369
    .line 370
    invoke-virtual {v2, v5, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 371
    .line 372
    .line 373
    new-instance v4, La/hsb0;

    .line 374
    .line 375
    const-string v5, "java/util/function/Function"

    .line 376
    .line 377
    invoke-direct {v4, v11, v5, v3}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 378
    .line 379
    .line 380
    const-string v3, "computeIfAbsent"

    .line 381
    .line 382
    invoke-virtual {v2, v3, v8, v4}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 383
    .line 384
    .line 385
    new-instance v3, La/hsb0;

    .line 386
    .line 387
    invoke-direct {v3, v11, v13, v1}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 388
    .line 389
    .line 390
    const-string v1, "computeIfPresent"

    .line 391
    .line 392
    invoke-virtual {v2, v1, v8, v3}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 393
    .line 394
    .line 395
    new-instance v1, La/hsb0;

    .line 396
    .line 397
    invoke-direct {v1, v11, v13, v12}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 398
    .line 399
    .line 400
    const-string v3, "merge"

    .line 401
    .line 402
    invoke-virtual {v2, v3, v8, v1}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 403
    .line 404
    .line 405
    new-instance v1, La/fuj0;

    .line 406
    .line 407
    const-string v2, "java/util/LinkedHashMap"

    .line 408
    .line 409
    invoke-direct {v1, v0, v2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    new-instance v2, La/gsb0;

    .line 413
    .line 414
    const/16 v3, 0x10

    .line 415
    .line 416
    invoke-direct {v2, v11, v3}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 417
    .line 418
    .line 419
    const-string v3, "putFirst"

    .line 420
    .line 421
    invoke-virtual {v1, v3, v14, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 422
    .line 423
    .line 424
    new-instance v2, La/gsb0;

    .line 425
    .line 426
    const/16 v3, 0x12

    .line 427
    .line 428
    invoke-direct {v2, v11, v3}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 429
    .line 430
    .line 431
    const-string v3, "putLast"

    .line 432
    .line 433
    invoke-virtual {v1, v3, v14, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 434
    .line 435
    .line 436
    new-instance v1, La/fuj0;

    .line 437
    .line 438
    const-string v2, "java/util/Optional"

    .line 439
    .line 440
    invoke-direct {v1, v0, v2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    new-instance v3, La/gsb0;

    .line 444
    .line 445
    const/16 v4, 0x13

    .line 446
    .line 447
    invoke-direct {v3, v2, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 448
    .line 449
    .line 450
    const-string v4, "empty"

    .line 451
    .line 452
    const/4 v8, 0x0

    .line 453
    invoke-virtual {v1, v4, v8, v3}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 454
    .line 455
    .line 456
    new-instance v3, La/hsb0;

    .line 457
    .line 458
    invoke-direct {v3, v11, v2, v15}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 459
    .line 460
    .line 461
    const-string v4, "of"

    .line 462
    .line 463
    invoke-virtual {v1, v4, v8, v3}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 464
    .line 465
    .line 466
    new-instance v3, La/hsb0;

    .line 467
    .line 468
    const/4 v14, 0x5

    .line 469
    invoke-direct {v3, v11, v2, v14}, La/hsb0;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    .line 470
    .line 471
    .line 472
    const-string v2, "ofNullable"

    .line 473
    .line 474
    invoke-virtual {v1, v2, v8, v3}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 475
    .line 476
    .line 477
    new-instance v2, La/gsb0;

    .line 478
    .line 479
    const/16 v3, 0x14

    .line 480
    .line 481
    invoke-direct {v2, v11, v3}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 482
    .line 483
    .line 484
    const-string v3, "get"

    .line 485
    .line 486
    invoke-virtual {v1, v3, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 487
    .line 488
    .line 489
    new-instance v2, La/gsb0;

    .line 490
    .line 491
    const/16 v4, 0x15

    .line 492
    .line 493
    invoke-direct {v2, v6, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 494
    .line 495
    .line 496
    const-string v4, "ifPresent"

    .line 497
    .line 498
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 499
    .line 500
    .line 501
    new-instance v1, La/fuj0;

    .line 502
    .line 503
    const-string v2, "java/lang/ref/Reference"

    .line 504
    .line 505
    invoke-direct {v1, v0, v2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    new-instance v2, La/gsb0;

    .line 509
    .line 510
    const/16 v4, 0x16

    .line 511
    .line 512
    invoke-direct {v2, v11, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v3, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 516
    .line 517
    .line 518
    new-instance v1, La/fuj0;

    .line 519
    .line 520
    invoke-direct {v1, v0, v10}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    new-instance v2, La/gsb0;

    .line 524
    .line 525
    const/16 v4, 0x17

    .line 526
    .line 527
    invoke-direct {v2, v11, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 528
    .line 529
    .line 530
    const-string v4, "test"

    .line 531
    .line 532
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 533
    .line 534
    .line 535
    new-instance v1, La/fuj0;

    .line 536
    .line 537
    const-string v2, "java/util/function/BiPredicate"

    .line 538
    .line 539
    invoke-direct {v1, v0, v2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    new-instance v2, La/gsb0;

    .line 543
    .line 544
    const/16 v9, 0x18

    .line 545
    .line 546
    invoke-direct {v2, v11, v9}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 550
    .line 551
    .line 552
    new-instance v1, La/fuj0;

    .line 553
    .line 554
    invoke-direct {v1, v0, v6}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    new-instance v2, La/gsb0;

    .line 558
    .line 559
    const/16 v4, 0x19

    .line 560
    .line 561
    invoke-direct {v2, v11, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 562
    .line 563
    .line 564
    const-string v4, "accept"

    .line 565
    .line 566
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    new-instance v1, La/fuj0;

    .line 570
    .line 571
    invoke-direct {v1, v0, v7}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    new-instance v2, La/gsb0;

    .line 575
    .line 576
    const/16 v6, 0x1b

    .line 577
    .line 578
    invoke-direct {v2, v11, v6}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 582
    .line 583
    .line 584
    new-instance v1, La/fuj0;

    .line 585
    .line 586
    invoke-direct {v1, v0, v5}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    new-instance v2, La/gsb0;

    .line 590
    .line 591
    const/16 v4, 0x1c

    .line 592
    .line 593
    invoke-direct {v2, v11, v4}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 594
    .line 595
    .line 596
    const-string v4, "apply"

    .line 597
    .line 598
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 599
    .line 600
    .line 601
    new-instance v1, La/fuj0;

    .line 602
    .line 603
    invoke-direct {v1, v0, v13}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    new-instance v2, La/gsb0;

    .line 607
    .line 608
    const/16 v5, 0x1d

    .line 609
    .line 610
    invoke-direct {v2, v11, v5}, La/gsb0;-><init>(Ljava/lang/String;B)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1, v4, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 614
    .line 615
    .line 616
    new-instance v1, La/fuj0;

    .line 617
    .line 618
    const-string v2, "java/util/function/Supplier"

    .line 619
    .line 620
    invoke-direct {v1, v0, v2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    new-instance v2, La/isb0;

    .line 624
    .line 625
    const/4 v5, 0x0

    .line 626
    invoke-direct {v2, v11, v5}, La/isb0;-><init>(Ljava/lang/String;B)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1, v3, v8, v2}, La/fuj0;->o(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 630
    .line 631
    .line 632
    iget-object v0, v0, La/ea70;->a:Ljava/util/LinkedHashMap;

    .line 633
    .line 634
    sput-object v0, La/jsb0;->d:Ljava/util/LinkedHashMap;

    .line 635
    .line 636
    return-void
.end method
