.class public final Lcom/appsflyer/internal/AFd1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static registerClient(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, Lkotlin/text/Regex;

    .line 16
    .line 17
    const-string v2, "(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)La/bh30;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x3

    .line 28
    const v4, 0xf4240

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    iget-object v1, v1, La/bh30;->c:La/g3;

    .line 36
    .line 37
    invoke-virtual {v1, v5}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    iget-object v7, v7, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v7, :cond_0

    .line 46
    .line 47
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    move-object v8, v7

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v8, v6

    .line 54
    :goto_0
    const/4 v7, 0x2

    .line 55
    invoke-virtual {v1, v7}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    iget-object v7, v7, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    move-object v9, v7

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v9, v6

    .line 72
    :goto_1
    invoke-virtual {v1, v3}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    iget-object v7, v7, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v7, :cond_2

    .line 81
    .line 82
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    move-object v10, v7

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move-object v10, v6

    .line 89
    :goto_2
    invoke-virtual {v1, v2}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    if-eqz v7, :cond_3

    .line 94
    .line 95
    iget-object v7, v7, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v7, :cond_3

    .line 98
    .line 99
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    move-object v11, v7

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    move-object v11, v6

    .line 106
    :goto_3
    const/4 v7, 0x5

    .line 107
    invoke-virtual {v1, v7}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    if-eqz v7, :cond_4

    .line 112
    .line 113
    iget-object v7, v7, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v7, :cond_4

    .line 116
    .line 117
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    move-object v12, v7

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    move-object v12, v6

    .line 124
    :goto_4
    const/4 v7, 0x6

    .line 125
    invoke-virtual {v1, v7}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    iget-object v1, v1, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    move-object v13, v1

    .line 140
    goto :goto_5

    .line 141
    :cond_5
    move-object v13, v6

    .line 142
    :goto_5
    filled-new-array/range {v8 .. v13}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v7, v13

    .line 147
    invoke-static {v6, v1}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_6

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    mul-int/2addr v1, v4

    .line 161
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    mul-int/lit16 v8, v8, 0x3e8

    .line 169
    .line 170
    add-int/2addr v8, v1

    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    add-int/2addr v1, v8

    .line 179
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    mul-int/2addr v8, v4

    .line 191
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    mul-int/lit16 v9, v9, 0x3e8

    .line 199
    .line 200
    add-int/2addr v9, v8

    .line 201
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    add-int/2addr v7, v9

    .line 209
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    new-instance v8, Lkotlin/Pair;

    .line 214
    .line 215
    invoke-direct {v8, v1, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_6
    move-object v8, v6

    .line 220
    :goto_6
    new-instance v1, Lkotlin/text/Regex;

    .line 221
    .line 222
    const-string v7, "^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$"

    .line 223
    .line 224
    invoke-direct {v1, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, p1}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)La/bh30;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-eqz p1, :cond_b

    .line 232
    .line 233
    iget-object p1, p1, La/bh30;->c:La/g3;

    .line 234
    .line 235
    invoke-virtual {p1, v5}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_7

    .line 240
    .line 241
    iget-object v1, v1, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 242
    .line 243
    if-eqz v1, :cond_7

    .line 244
    .line 245
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    goto :goto_7

    .line 250
    :cond_7
    move-object v1, v6

    .line 251
    :goto_7
    invoke-virtual {p1, v3}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    if-eqz v3, :cond_8

    .line 256
    .line 257
    iget-object v3, v3, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 258
    .line 259
    if-eqz v3, :cond_8

    .line 260
    .line 261
    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    goto :goto_8

    .line 266
    :cond_8
    move-object v3, v6

    .line 267
    :goto_8
    invoke-virtual {p1, v2}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    if-eqz p1, :cond_9

    .line 272
    .line 273
    iget-object p1, p1, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 274
    .line 275
    if-eqz p1, :cond_9

    .line 276
    .line 277
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    goto :goto_9

    .line 282
    :cond_9
    move-object p1, v6

    .line 283
    :goto_9
    if-eqz v1, :cond_a

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    mul-int/2addr p1, v4

    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    add-int/2addr v1, v5

    .line 299
    mul-int/2addr v1, v4

    .line 300
    sub-int/2addr v1, v5

    .line 301
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    new-instance v6, Lkotlin/Pair;

    .line 306
    .line 307
    invoke-direct {v6, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_a
    if-eqz v3, :cond_b

    .line 312
    .line 313
    if-eqz p1, :cond_b

    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    mul-int/2addr v1, v4

    .line 320
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    mul-int/lit16 v2, v2, 0x3e8

    .line 325
    .line 326
    add-int/2addr v2, v1

    .line 327
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    mul-int/2addr v2, v4

    .line 336
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    add-int/2addr p1, v5

    .line 341
    mul-int/lit16 p1, p1, 0x3e8

    .line 342
    .line 343
    add-int/2addr p1, v2

    .line 344
    sub-int/2addr p1, v5

    .line 345
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v6, Lkotlin/Pair;

    .line 350
    .line 351
    invoke-direct {v6, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_b
    :goto_a
    const/4 p1, -0x1

    .line 355
    if-eq v0, p1, :cond_c

    .line 356
    .line 357
    if-nez v8, :cond_c

    .line 358
    .line 359
    if-ne v0, p0, :cond_e

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_c
    if-eqz v6, :cond_d

    .line 363
    .line 364
    iget-object p1, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p1, Ljava/lang/Number;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    if-gt p1, p0, :cond_e

    .line 373
    .line 374
    iget-object p1, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast p1, Ljava/lang/Number;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-gt p0, p1, :cond_e

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_d
    if-eqz v8, :cond_e

    .line 386
    .line 387
    iget-object p1, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast p1, Ljava/lang/Number;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    if-gt p1, p0, :cond_e

    .line 396
    .line 397
    iget-object p1, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast p1, Ljava/lang/Number;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    if-gt p0, p1, :cond_e

    .line 406
    .line 407
    :goto_b
    return v5

    .line 408
    :cond_e
    const/4 p0, 0x0

    .line 409
    return p0
.end method
