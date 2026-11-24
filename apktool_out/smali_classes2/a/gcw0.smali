.class public final La/gcw0;
.super La/dwb;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/Set;

.field public static final g:La/cmt0;

.field public static final h:La/dcw0;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/logging/Level;

.field public final d:Ljava/util/Set;

.field public final e:La/cmt0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    sget-object v1, La/xfx0;->a:La/vgx0;

    .line 4
    .line 5
    sget-object v2, La/nhx0;->a:La/vgx0;

    .line 6
    .line 7
    sget-object v3, La/phx0;->a:La/vgx0;

    .line 8
    .line 9
    filled-new-array {v1, v2, v3}, [La/vgx0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, La/gcw0;->f:Ljava/util/Set;

    .line 25
    .line 26
    invoke-static {v0}, La/y0x0;->P(Ljava/util/Set;)La/oif0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, La/cmt0;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v3, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v3, v2, La/cmt0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v4, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v4, v2, La/cmt0;->b:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v5, v1, La/oif0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v1, La/oif0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, La/oif0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/dix0;

    .line 66
    .line 67
    iput-object v1, v2, La/cmt0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    sput-object v2, La/gcw0;->g:La/cmt0;

    .line 70
    .line 71
    new-instance v1, La/dcw0;

    .line 72
    .line 73
    sget-object v3, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 74
    .line 75
    invoke-direct {v1, v3, v0, v2}, La/dcw0;-><init>(Ljava/util/logging/Level;Ljava/util/Set;La/cmt0;)V

    .line 76
    .line 77
    .line 78
    sput-object v1, La/gcw0;->h:La/dcw0;

    .line 79
    .line 80
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;La/cmt0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/dwb;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/aem0;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/gcw0;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, La/gcw0;->c:Ljava/util/logging/Level;

    .line 11
    .line 12
    iput-object p3, p0, La/gcw0;->d:Ljava/util/Set;

    .line 13
    .line 14
    iput-object p4, p0, La/gcw0;->e:La/cmt0;

    .line 15
    .line 16
    return-void
.end method

.method public static d(La/lfx0;Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;La/cmt0;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/lfx0;->c()La/wgm0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v3, v0, La/lfx0;->a:Ljava/util/logging/Level;

    .line 8
    .line 9
    sget-object v4, La/phx0;->a:La/vgx0;

    .line 10
    .line 11
    invoke-virtual {v2, v4}, La/wgm0;->C(La/vgx0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget-object v2, La/rbw0;->a:La/sbw0;

    .line 27
    .line 28
    check-cast v2, La/wbw0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v2, La/ccw0;->b:La/ccw0;

    .line 34
    .line 35
    invoke-virtual {v2}, La/ccw0;->c()La/wgm0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0}, La/lfx0;->c()La/wgm0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, La/wgm0;->y()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    sget-object v2, La/qbw0;->a:La/iix0;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/16 v6, 0x1c

    .line 53
    .line 54
    if-gt v5, v6, :cond_2

    .line 55
    .line 56
    new-instance v5, La/mix0;

    .line 57
    .line 58
    invoke-direct {v5, v2, v4}, La/mix0;-><init>(La/wgm0;La/wgm0;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    move-object v2, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v5, La/nix0;

    .line 64
    .line 65
    invoke-direct {v5, v2, v4}, La/nix0;-><init>(La/wgm0;La/wgm0;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    invoke-virtual {v3}, Ljava/util/logging/Level;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual/range {p2 .. p2}, Ljava/util/logging/Level;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, 0x0

    .line 78
    if-ge v4, v5, :cond_3

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    move v4, v6

    .line 83
    :goto_2
    const-string v10, "cannot get literal argument before calling log()"

    .line 84
    .line 85
    const-string v11, "cannot get literal argument if a template context exists"

    .line 86
    .line 87
    const/4 v12, 0x2

    .line 88
    if-nez v4, :cond_8

    .line 89
    .line 90
    sget v13, La/tbw0;->a:I

    .line 91
    .line 92
    iget-object v13, v0, La/lfx0;->f:La/ubw0;

    .line 93
    .line 94
    if-nez v13, :cond_8

    .line 95
    .line 96
    invoke-virtual {v2}, La/qbw0;->b()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    invoke-interface/range {p3 .. p3}, Ljava/util/Set;->size()I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    if-gt v13, v14, :cond_8

    .line 105
    .line 106
    invoke-virtual {v2}, La/qbw0;->c()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    move-object/from16 v14, p3

    .line 111
    .line 112
    invoke-interface {v14, v13}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-nez v13, :cond_4

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    iget-object v2, v0, La/lfx0;->f:La/ubw0;

    .line 120
    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    const/4 v7, 0x1

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    move v7, v6

    .line 126
    :goto_3
    if-eqz v7, :cond_7

    .line 127
    .line 128
    iget-object v2, v0, La/lfx0;->g:[Ljava/lang/Object;

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    aget-object v2, v2, v6

    .line 133
    .line 134
    invoke-static {v2}, La/yhx0;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object/from16 v20, v3

    .line 139
    .line 140
    goto/16 :goto_1d

    .line 141
    .line 142
    :cond_6
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_7
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    :goto_4
    new-instance v13, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object v14, v0, La/lfx0;->d:La/jgx0;

    .line 156
    .line 157
    if-eqz v14, :cond_4c

    .line 158
    .line 159
    invoke-static {v12, v14, v13}, La/ofm0;->D(ILa/jgx0;Ljava/lang/StringBuilder;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_9

    .line 164
    .line 165
    const-string v14, " "

    .line 166
    .line 167
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    :cond_9
    if-eqz v4, :cond_a

    .line 171
    .line 172
    iget-object v4, v0, La/lfx0;->f:La/ubw0;

    .line 173
    .line 174
    if-eqz v4, :cond_a

    .line 175
    .line 176
    const-string v2, "(REDACTED) "

    .line 177
    .line 178
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, La/lfx0;->f:La/ubw0;

    .line 182
    .line 183
    iget-object v2, v2, La/ubw0;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-object/from16 v20, v3

    .line 189
    .line 190
    goto/16 :goto_1c

    .line 191
    .line 192
    :cond_a
    iget-object v4, v0, La/lfx0;->f:La/ubw0;

    .line 193
    .line 194
    if-eqz v4, :cond_42

    .line 195
    .line 196
    new-instance v10, La/zdx0;

    .line 197
    .line 198
    if-eqz v4, :cond_b

    .line 199
    .line 200
    const/4 v11, 0x1

    .line 201
    goto :goto_5

    .line 202
    :cond_b
    move v11, v6

    .line 203
    :goto_5
    const-string v14, "cannot get arguments unless a template context exists"

    .line 204
    .line 205
    if-eqz v11, :cond_41

    .line 206
    .line 207
    iget-object v11, v0, La/lfx0;->g:[Ljava/lang/Object;

    .line 208
    .line 209
    const-string v15, "cannot get arguments before calling log()"

    .line 210
    .line 211
    if-eqz v11, :cond_40

    .line 212
    .line 213
    invoke-direct {v10, v4, v11, v13}, La/zdx0;-><init>(La/ubw0;[Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 214
    .line 215
    .line 216
    iget-object v4, v10, La/zdx0;->g:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v4, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    iget-object v11, v10, La/zdx0;->e:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v11, La/ubw0;

    .line 223
    .line 224
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    sget-object v16, La/wcw0;->b:La/wcw0;

    .line 228
    .line 229
    iget-object v11, v11, La/ubw0;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v6, v11}, La/xcw0;->b(ILjava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    move/from16 v5, v16

    .line 236
    .line 237
    const/4 v8, -0x1

    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    :goto_6
    if-ltz v5, :cond_3a

    .line 241
    .line 242
    add-int/lit8 v12, v5, 0x1

    .line 243
    .line 244
    move v7, v12

    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    :goto_7
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    const-string v6, "unterminated parameter"

    .line 252
    .line 253
    if-ge v7, v9, :cond_39

    .line 254
    .line 255
    add-int/lit8 v9, v7, 0x1

    .line 256
    .line 257
    move-object/from16 v20, v3

    .line 258
    .line 259
    invoke-virtual {v11, v7}, Ljava/lang/String;->charAt(I)C

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    move/from16 v21, v7

    .line 264
    .line 265
    add-int/lit8 v7, v3, -0x30

    .line 266
    .line 267
    int-to-char v7, v7

    .line 268
    move-object/from16 v22, v14

    .line 269
    .line 270
    const/16 v14, 0xa

    .line 271
    .line 272
    if-ge v7, v14, :cond_d

    .line 273
    .line 274
    mul-int/lit8 v17, v17, 0xa

    .line 275
    .line 276
    add-int v3, v17, v7

    .line 277
    .line 278
    const v6, 0xf4240

    .line 279
    .line 280
    .line 281
    if-ge v3, v6, :cond_c

    .line 282
    .line 283
    move/from16 v17, v3

    .line 284
    .line 285
    move v7, v9

    .line 286
    move-object/from16 v3, v20

    .line 287
    .line 288
    move-object/from16 v14, v22

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_c
    const-string v0, "index too large"

    .line 292
    .line 293
    invoke-static {v5, v0, v9, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    throw v0

    .line 298
    :cond_d
    const/16 v7, 0x24

    .line 299
    .line 300
    const/16 v14, 0x30

    .line 301
    .line 302
    if-ne v3, v7, :cond_11

    .line 303
    .line 304
    sub-int v7, v21, v12

    .line 305
    .line 306
    if-eqz v7, :cond_10

    .line 307
    .line 308
    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eq v3, v14, :cond_f

    .line 313
    .line 314
    add-int/lit8 v17, v17, -0x1

    .line 315
    .line 316
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eq v9, v3, :cond_e

    .line 321
    .line 322
    add-int/lit8 v7, v21, 0x2

    .line 323
    .line 324
    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    .line 325
    .line 326
    .line 327
    move v12, v9

    .line 328
    move/from16 v8, v17

    .line 329
    .line 330
    move v9, v7

    .line 331
    const/4 v7, -0x1

    .line 332
    goto :goto_8

    .line 333
    :cond_e
    new-instance v0, La/tiu0;

    .line 334
    .line 335
    const/4 v7, -0x1

    .line 336
    invoke-static {v5, v6, v7, v11}, La/tiu0;->d(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    const/4 v2, 0x3

    .line 341
    invoke-direct {v0, v1, v2}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :cond_f
    const-string v0, "index has leading zero"

    .line 346
    .line 347
    invoke-static {v5, v0, v9, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    throw v0

    .line 352
    :cond_10
    const-string v0, "missing index"

    .line 353
    .line 354
    invoke-static {v5, v0, v9, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    throw v0

    .line 359
    :cond_11
    const/4 v7, -0x1

    .line 360
    const/16 v14, 0x3c

    .line 361
    .line 362
    if-ne v3, v14, :cond_14

    .line 363
    .line 364
    if-eq v8, v7, :cond_13

    .line 365
    .line 366
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-eq v9, v3, :cond_12

    .line 371
    .line 372
    add-int/lit8 v3, v21, 0x2

    .line 373
    .line 374
    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    .line 375
    .line 376
    .line 377
    move v12, v9

    .line 378
    move v9, v3

    .line 379
    goto :goto_8

    .line 380
    :cond_12
    new-instance v0, La/tiu0;

    .line 381
    .line 382
    invoke-static {v5, v6, v7, v11}, La/tiu0;->d(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    const/4 v2, 0x3

    .line 387
    invoke-direct {v0, v1, v2}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :cond_13
    const-string v0, "invalid relative parameter"

    .line 392
    .line 393
    invoke-static {v5, v0, v9, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    throw v0

    .line 398
    :cond_14
    add-int/lit8 v3, v16, 0x1

    .line 399
    .line 400
    move/from16 v8, v16

    .line 401
    .line 402
    move/from16 v16, v3

    .line 403
    .line 404
    :goto_8
    add-int/2addr v9, v7

    .line 405
    :goto_9
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-ge v9, v3, :cond_38

    .line 410
    .line 411
    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    and-int/lit8 v3, v3, -0x21

    .line 416
    .line 417
    add-int/lit8 v3, v3, -0x41

    .line 418
    .line 419
    int-to-char v3, v3

    .line 420
    const/16 v7, 0x1a

    .line 421
    .line 422
    if-ge v3, v7, :cond_37

    .line 423
    .line 424
    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    and-int/lit8 v6, v3, 0x20

    .line 429
    .line 430
    if-nez v6, :cond_15

    .line 431
    .line 432
    const/4 v7, 0x1

    .line 433
    goto :goto_a

    .line 434
    :cond_15
    const/4 v7, 0x0

    .line 435
    :goto_a
    sget-object v14, La/uhx0;->e:La/uhx0;

    .line 436
    .line 437
    if-ne v12, v9, :cond_16

    .line 438
    .line 439
    if-eqz v7, :cond_17

    .line 440
    .line 441
    :cond_16
    const/4 v14, 0x1

    .line 442
    goto :goto_c

    .line 443
    :cond_17
    sget-object v7, La/uhx0;->e:La/uhx0;

    .line 444
    .line 445
    move-object/from16 v17, v2

    .line 446
    .line 447
    move/from16 v24, v6

    .line 448
    .line 449
    :goto_b
    move-object/from16 v25, v15

    .line 450
    .line 451
    goto/16 :goto_11

    .line 452
    .line 453
    :goto_c
    if-eq v14, v7, :cond_18

    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    goto :goto_d

    .line 457
    :cond_18
    const/16 v7, 0x80

    .line 458
    .line 459
    :goto_d
    if-ne v12, v9, :cond_19

    .line 460
    .line 461
    new-instance v12, La/uhx0;

    .line 462
    .line 463
    const/4 v14, -0x1

    .line 464
    invoke-direct {v12, v7, v14, v14}, La/uhx0;-><init>(III)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v17, v2

    .line 468
    .line 469
    move/from16 v24, v6

    .line 470
    .line 471
    move-object v7, v12

    .line 472
    goto :goto_b

    .line 473
    :cond_19
    add-int/lit8 v14, v12, 0x1

    .line 474
    .line 475
    move/from16 v24, v6

    .line 476
    .line 477
    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    move-object/from16 v25, v15

    .line 482
    .line 483
    const-string v15, "invalid flag"

    .line 484
    .line 485
    const/16 v1, 0x20

    .line 486
    .line 487
    if-lt v6, v1, :cond_1a

    .line 488
    .line 489
    const/16 v1, 0x30

    .line 490
    .line 491
    if-le v6, v1, :cond_1b

    .line 492
    .line 493
    :cond_1a
    move-object/from16 v17, v2

    .line 494
    .line 495
    goto :goto_f

    .line 496
    :cond_1b
    add-int/lit8 v17, v6, -0x20

    .line 497
    .line 498
    sget-wide v26, La/uhx0;->d:J

    .line 499
    .line 500
    const/16 v19, 0x3

    .line 501
    .line 502
    mul-int/lit8 v17, v17, 0x3

    .line 503
    .line 504
    ushr-long v26, v26, v17

    .line 505
    .line 506
    const-wide/16 v28, 0x7

    .line 507
    .line 508
    move-object/from16 v17, v2

    .line 509
    .line 510
    and-long v1, v26, v28

    .line 511
    .line 512
    long-to-int v1, v1

    .line 513
    const/4 v2, -0x1

    .line 514
    add-int/2addr v1, v2

    .line 515
    if-gez v1, :cond_1d

    .line 516
    .line 517
    const/16 v2, 0x2e

    .line 518
    .line 519
    if-ne v6, v2, :cond_1c

    .line 520
    .line 521
    new-instance v1, La/uhx0;

    .line 522
    .line 523
    invoke-static {v14, v9, v11}, La/uhx0;->e(IILjava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    const/4 v14, -0x1

    .line 528
    invoke-direct {v1, v7, v14, v2}, La/uhx0;-><init>(III)V

    .line 529
    .line 530
    .line 531
    :goto_e
    move-object v7, v1

    .line 532
    goto :goto_11

    .line 533
    :cond_1c
    invoke-static {v12, v15, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    throw v0

    .line 538
    :cond_1d
    const/16 v18, 0x1

    .line 539
    .line 540
    shl-int v1, v18, v1

    .line 541
    .line 542
    and-int v2, v7, v1

    .line 543
    .line 544
    if-nez v2, :cond_1e

    .line 545
    .line 546
    or-int/2addr v7, v1

    .line 547
    move v12, v14

    .line 548
    move-object/from16 v2, v17

    .line 549
    .line 550
    move/from16 v6, v24

    .line 551
    .line 552
    move-object/from16 v15, v25

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_1e
    const-string v0, "repeated flag"

    .line 556
    .line 557
    invoke-static {v12, v0, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    throw v0

    .line 562
    :goto_f
    const/16 v1, 0x39

    .line 563
    .line 564
    if-gt v6, v1, :cond_36

    .line 565
    .line 566
    add-int/lit8 v6, v6, -0x30

    .line 567
    .line 568
    :goto_10
    if-ne v14, v9, :cond_1f

    .line 569
    .line 570
    new-instance v1, La/uhx0;

    .line 571
    .line 572
    const/4 v14, -0x1

    .line 573
    invoke-direct {v1, v7, v6, v14}, La/uhx0;-><init>(III)V

    .line 574
    .line 575
    .line 576
    goto :goto_e

    .line 577
    :cond_1f
    add-int/lit8 v1, v14, 0x1

    .line 578
    .line 579
    invoke-virtual {v11, v14}, Ljava/lang/String;->charAt(I)C

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    const/16 v15, 0x2e

    .line 584
    .line 585
    if-ne v2, v15, :cond_33

    .line 586
    .line 587
    new-instance v2, La/uhx0;

    .line 588
    .line 589
    invoke-static {v1, v9, v11}, La/uhx0;->e(IILjava/lang/String;)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    invoke-direct {v2, v7, v6, v1}, La/uhx0;-><init>(III)V

    .line 594
    .line 595
    .line 596
    move-object v7, v2

    .line 597
    :goto_11
    sget-object v1, La/rhx0;->f:[La/rhx0;

    .line 598
    .line 599
    or-int/lit8 v2, v3, 0x20

    .line 600
    .line 601
    add-int/lit8 v2, v2, -0x61

    .line 602
    .line 603
    aget-object v1, v1, v2

    .line 604
    .line 605
    const/4 v2, 0x0

    .line 606
    if-nez v24, :cond_21

    .line 607
    .line 608
    if-eqz v1, :cond_20

    .line 609
    .line 610
    iget v6, v1, La/rhx0;->c:I

    .line 611
    .line 612
    const/16 v12, 0x80

    .line 613
    .line 614
    and-int/2addr v6, v12

    .line 615
    if-eqz v6, :cond_20

    .line 616
    .line 617
    goto :goto_12

    .line 618
    :cond_20
    move-object v1, v2

    .line 619
    :cond_21
    :goto_12
    add-int/lit8 v6, v9, 0x1

    .line 620
    .line 621
    if-eqz v1, :cond_27

    .line 622
    .line 623
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    iget v3, v1, La/rhx0;->c:I

    .line 627
    .line 628
    iget v9, v1, La/rhx0;->b:I

    .line 629
    .line 630
    const/4 v14, 0x1

    .line 631
    if-eq v9, v14, :cond_22

    .line 632
    .line 633
    const/4 v12, 0x2

    .line 634
    if-eq v9, v12, :cond_24

    .line 635
    .line 636
    const/4 v12, 0x3

    .line 637
    if-eq v9, v12, :cond_24

    .line 638
    .line 639
    const/4 v12, 0x4

    .line 640
    if-eq v9, v12, :cond_24

    .line 641
    .line 642
    const/4 v12, 0x5

    .line 643
    if-ne v9, v12, :cond_23

    .line 644
    .line 645
    :cond_22
    const/4 v2, 0x1

    .line 646
    goto :goto_13

    .line 647
    :cond_23
    throw v2

    .line 648
    :cond_24
    const/4 v2, 0x0

    .line 649
    :goto_13
    invoke-virtual {v7, v3, v2}, La/uhx0;->b(IZ)Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    if-eqz v2, :cond_26

    .line 654
    .line 655
    const/16 v2, 0xa

    .line 656
    .line 657
    if-ge v8, v2, :cond_25

    .line 658
    .line 659
    sget-object v2, La/ucw0;->d:Ljava/util/Map;

    .line 660
    .line 661
    invoke-virtual {v7}, La/uhx0;->a()Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_25

    .line 666
    .line 667
    sget-object v2, La/ucw0;->d:Ljava/util/Map;

    .line 668
    .line 669
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    check-cast v1, [La/ucw0;

    .line 674
    .line 675
    const-string v2, "default parameter"

    .line 676
    .line 677
    invoke-static {v1, v2}, La/fem0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    aget-object v1, v1, v8

    .line 681
    .line 682
    goto :goto_17

    .line 683
    :cond_25
    new-instance v2, La/ucw0;

    .line 684
    .line 685
    invoke-direct {v2, v8, v1, v7}, La/ucw0;-><init>(ILa/rhx0;La/uhx0;)V

    .line 686
    .line 687
    .line 688
    goto :goto_15

    .line 689
    :cond_26
    const-string v0, "invalid format specifier"

    .line 690
    .line 691
    invoke-static {v5, v0, v6, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    throw v0

    .line 696
    :cond_27
    const/16 v1, 0x74

    .line 697
    .line 698
    const/16 v2, 0xa0

    .line 699
    .line 700
    const-string v12, "invalid format specification"

    .line 701
    .line 702
    if-eq v3, v1, :cond_28

    .line 703
    .line 704
    const/16 v1, 0x54

    .line 705
    .line 706
    if-ne v3, v1, :cond_29

    .line 707
    .line 708
    :cond_28
    const/4 v1, 0x0

    .line 709
    goto :goto_16

    .line 710
    :cond_29
    const/16 v1, 0x68

    .line 711
    .line 712
    if-eq v3, v1, :cond_2a

    .line 713
    .line 714
    const/16 v1, 0x48

    .line 715
    .line 716
    if-ne v3, v1, :cond_2b

    .line 717
    .line 718
    :cond_2a
    const/4 v1, 0x0

    .line 719
    goto :goto_14

    .line 720
    :cond_2b
    invoke-static {v5, v12, v6, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    throw v0

    .line 725
    :goto_14
    invoke-virtual {v7, v2, v1}, La/uhx0;->b(IZ)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    if-eqz v2, :cond_2c

    .line 730
    .line 731
    new-instance v2, La/vcw0;

    .line 732
    .line 733
    invoke-direct {v2, v7, v8}, La/oyc;-><init>(La/uhx0;I)V

    .line 734
    .line 735
    .line 736
    :goto_15
    move-object v1, v2

    .line 737
    goto :goto_17

    .line 738
    :cond_2c
    invoke-static {v5, v12, v6, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    throw v0

    .line 743
    :goto_16
    invoke-virtual {v7, v2, v1}, La/uhx0;->b(IZ)Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    if-eqz v2, :cond_32

    .line 748
    .line 749
    add-int/lit8 v9, v9, 0x2

    .line 750
    .line 751
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-gt v9, v1, :cond_31

    .line 756
    .line 757
    invoke-virtual {v11, v6}, Ljava/lang/String;->charAt(I)C

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    sget-object v2, La/scw0;->b:Ljava/util/Map;

    .line 762
    .line 763
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    check-cast v1, La/scw0;

    .line 772
    .line 773
    if-eqz v1, :cond_30

    .line 774
    .line 775
    new-instance v2, La/tcw0;

    .line 776
    .line 777
    invoke-direct {v2, v7, v8, v1}, La/tcw0;-><init>(La/uhx0;ILa/scw0;)V

    .line 778
    .line 779
    .line 780
    move-object v1, v2

    .line 781
    move v6, v9

    .line 782
    :goto_17
    iget v2, v1, La/oyc;->a:I

    .line 783
    .line 784
    const/16 v3, 0x20

    .line 785
    .line 786
    if-ge v2, v3, :cond_2d

    .line 787
    .line 788
    iget v3, v10, La/zdx0;->b:I

    .line 789
    .line 790
    const/16 v18, 0x1

    .line 791
    .line 792
    shl-int v7, v18, v2

    .line 793
    .line 794
    or-int/2addr v3, v7

    .line 795
    iput v3, v10, La/zdx0;->b:I

    .line 796
    .line 797
    :cond_2d
    iget v3, v10, La/zdx0;->c:I

    .line 798
    .line 799
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    iput v2, v10, La/zdx0;->c:I

    .line 804
    .line 805
    iget v2, v10, La/zdx0;->d:I

    .line 806
    .line 807
    invoke-static {v2, v5, v11, v4}, La/xcw0;->a(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 808
    .line 809
    .line 810
    iget-object v2, v10, La/zdx0;->f:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v2, [Ljava/lang/Object;

    .line 813
    .line 814
    iget v3, v1, La/oyc;->a:I

    .line 815
    .line 816
    array-length v5, v2

    .line 817
    if-ge v3, v5, :cond_2f

    .line 818
    .line 819
    aget-object v2, v2, v3

    .line 820
    .line 821
    if-eqz v2, :cond_2e

    .line 822
    .line 823
    invoke-virtual {v1, v10, v2}, La/oyc;->H(La/zdx0;Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    goto :goto_18

    .line 827
    :cond_2e
    const-string v1, "null"

    .line 828
    .line 829
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    goto :goto_18

    .line 833
    :cond_2f
    const-string v1, "[ERROR: MISSING LOG ARGUMENT]"

    .line 834
    .line 835
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    :goto_18
    iput v6, v10, La/zdx0;->d:I

    .line 839
    .line 840
    invoke-static {v6, v11}, La/xcw0;->b(ILjava/lang/String;)I

    .line 841
    .line 842
    .line 843
    move-result v5

    .line 844
    move-object/from16 v2, v17

    .line 845
    .line 846
    move-object/from16 v3, v20

    .line 847
    .line 848
    move-object/from16 v14, v22

    .line 849
    .line 850
    move-object/from16 v15, v25

    .line 851
    .line 852
    const/4 v12, 0x2

    .line 853
    goto/16 :goto_6

    .line 854
    .line 855
    :cond_30
    const-string v0, "illegal date/time conversion"

    .line 856
    .line 857
    invoke-static {v6, v0, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    throw v0

    .line 862
    :cond_31
    const-string v0, "truncated format specifier"

    .line 863
    .line 864
    invoke-static {v5, v0, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    throw v0

    .line 869
    :cond_32
    invoke-static {v5, v12, v6, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    throw v0

    .line 874
    :cond_33
    const/16 v21, 0x20

    .line 875
    .line 876
    const/16 v23, 0x80

    .line 877
    .line 878
    add-int/lit8 v2, v2, -0x30

    .line 879
    .line 880
    int-to-char v2, v2

    .line 881
    const/16 v15, 0xa

    .line 882
    .line 883
    if-ge v2, v15, :cond_35

    .line 884
    .line 885
    mul-int/lit8 v6, v6, 0xa

    .line 886
    .line 887
    add-int/2addr v6, v2

    .line 888
    const v2, 0xf423f

    .line 889
    .line 890
    .line 891
    if-gt v6, v2, :cond_34

    .line 892
    .line 893
    move v14, v1

    .line 894
    goto/16 :goto_10

    .line 895
    .line 896
    :cond_34
    const-string v0, "width too large"

    .line 897
    .line 898
    invoke-static {v12, v0, v9, v11}, La/tiu0;->a(ILjava/lang/String;ILjava/lang/String;)La/tiu0;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    throw v0

    .line 903
    :cond_35
    const-string v0, "invalid width character"

    .line 904
    .line 905
    invoke-static {v14, v0, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    throw v0

    .line 910
    :cond_36
    invoke-static {v12, v15, v11}, La/tiu0;->b(ILjava/lang/String;Ljava/lang/String;)La/tiu0;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    throw v0

    .line 915
    :cond_37
    move-object/from16 v17, v2

    .line 916
    .line 917
    move-object/from16 v25, v15

    .line 918
    .line 919
    const/16 v15, 0xa

    .line 920
    .line 921
    add-int/lit8 v9, v9, 0x1

    .line 922
    .line 923
    move-object/from16 v15, v25

    .line 924
    .line 925
    goto/16 :goto_9

    .line 926
    .line 927
    :cond_38
    new-instance v0, La/tiu0;

    .line 928
    .line 929
    const/4 v14, -0x1

    .line 930
    invoke-static {v5, v6, v14, v11}, La/tiu0;->d(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    const/4 v2, 0x3

    .line 935
    invoke-direct {v0, v1, v2}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 936
    .line 937
    .line 938
    throw v0

    .line 939
    :cond_39
    const/4 v2, 0x3

    .line 940
    const/4 v14, -0x1

    .line 941
    new-instance v0, La/tiu0;

    .line 942
    .line 943
    invoke-static {v5, v6, v14, v11}, La/tiu0;->d(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-direct {v0, v1, v2}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 948
    .line 949
    .line 950
    throw v0

    .line 951
    :cond_3a
    move-object/from16 v17, v2

    .line 952
    .line 953
    move-object/from16 v20, v3

    .line 954
    .line 955
    move-object/from16 v22, v14

    .line 956
    .line 957
    move-object/from16 v25, v15

    .line 958
    .line 959
    const/4 v14, -0x1

    .line 960
    iget v1, v10, La/zdx0;->b:I

    .line 961
    .line 962
    add-int/lit8 v2, v1, 0x1

    .line 963
    .line 964
    and-int/2addr v2, v1

    .line 965
    if-nez v2, :cond_3f

    .line 966
    .line 967
    iget v2, v10, La/zdx0;->c:I

    .line 968
    .line 969
    const/16 v3, 0x1f

    .line 970
    .line 971
    if-le v2, v3, :cond_3b

    .line 972
    .line 973
    if-ne v1, v14, :cond_3f

    .line 974
    .line 975
    :cond_3b
    iget v1, v10, La/zdx0;->d:I

    .line 976
    .line 977
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 978
    .line 979
    .line 980
    move-result v2

    .line 981
    invoke-static {v1, v2, v11, v4}, La/xcw0;->a(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 982
    .line 983
    .line 984
    iget-object v1, v0, La/lfx0;->f:La/ubw0;

    .line 985
    .line 986
    if-eqz v1, :cond_3c

    .line 987
    .line 988
    const/4 v6, 0x1

    .line 989
    goto :goto_19

    .line 990
    :cond_3c
    const/4 v6, 0x0

    .line 991
    :goto_19
    if-eqz v6, :cond_3e

    .line 992
    .line 993
    iget-object v1, v0, La/lfx0;->g:[Ljava/lang/Object;

    .line 994
    .line 995
    if-eqz v1, :cond_3d

    .line 996
    .line 997
    array-length v1, v1

    .line 998
    iget v2, v10, La/zdx0;->c:I

    .line 999
    .line 1000
    const/16 v18, 0x1

    .line 1001
    .line 1002
    add-int/lit8 v2, v2, 0x1

    .line 1003
    .line 1004
    if-le v1, v2, :cond_44

    .line 1005
    .line 1006
    const-string v1, " [ERROR: UNUSED LOG ARGUMENTS]"

    .line 1007
    .line 1008
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    .line 1011
    goto :goto_1b

    .line 1012
    :cond_3d
    invoke-static/range {v25 .. v25}, La/jf4;->n(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    return-void

    .line 1016
    :cond_3e
    invoke-static/range {v22 .. v22}, La/jf4;->n(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    return-void

    .line 1020
    :cond_3f
    not-int v0, v1

    .line 1021
    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 1022
    .line 1023
    .line 1024
    move-result v0

    .line 1025
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    const-string v1, "unreferenced arguments [first missing index=%d]"

    .line 1034
    .line 1035
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    new-instance v1, La/tiu0;

    .line 1040
    .line 1041
    const/4 v2, 0x3

    .line 1042
    invoke-direct {v1, v0, v2}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 1043
    .line 1044
    .line 1045
    throw v1

    .line 1046
    :cond_40
    move-object/from16 v25, v15

    .line 1047
    .line 1048
    invoke-static/range {v25 .. v25}, La/jf4;->n(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    return-void

    .line 1052
    :cond_41
    move-object/from16 v22, v14

    .line 1053
    .line 1054
    invoke-static/range {v22 .. v22}, La/jf4;->n(Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    return-void

    .line 1058
    :cond_42
    move-object/from16 v17, v2

    .line 1059
    .line 1060
    move-object/from16 v20, v3

    .line 1061
    .line 1062
    const/16 v18, 0x1

    .line 1063
    .line 1064
    if-nez v4, :cond_43

    .line 1065
    .line 1066
    move/from16 v7, v18

    .line 1067
    .line 1068
    goto :goto_1a

    .line 1069
    :cond_43
    const/4 v7, 0x0

    .line 1070
    :goto_1a
    if-eqz v7, :cond_4b

    .line 1071
    .line 1072
    iget-object v1, v0, La/lfx0;->g:[Ljava/lang/Object;

    .line 1073
    .line 1074
    if-eqz v1, :cond_4a

    .line 1075
    .line 1076
    const/4 v2, 0x0

    .line 1077
    aget-object v1, v1, v2

    .line 1078
    .line 1079
    invoke-static {v1}, La/yhx0;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    :cond_44
    :goto_1b
    sget v1, La/tbw0;->a:I

    .line 1087
    .line 1088
    new-instance v1, La/whx0;

    .line 1089
    .line 1090
    invoke-direct {v1, v13}, La/whx0;-><init>(Ljava/lang/StringBuilder;)V

    .line 1091
    .line 1092
    .line 1093
    move-object/from16 v2, p4

    .line 1094
    .line 1095
    move-object/from16 v5, v17

    .line 1096
    .line 1097
    invoke-virtual {v5, v2, v1}, La/qbw0;->a(La/cmt0;La/whx0;)V

    .line 1098
    .line 1099
    .line 1100
    iget-boolean v1, v1, La/whx0;->b:Z

    .line 1101
    .line 1102
    if-eqz v1, :cond_45

    .line 1103
    .line 1104
    const-string v1, " ]"

    .line 1105
    .line 1106
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1107
    .line 1108
    .line 1109
    :cond_45
    :goto_1c
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v2

    .line 1113
    :goto_1d
    invoke-virtual {v0}, La/lfx0;->c()La/wgm0;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    sget-object v1, La/xfx0;->a:La/vgx0;

    .line 1118
    .line 1119
    invoke-virtual {v0, v1}, La/wgm0;->C(La/vgx0;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    check-cast v0, Ljava/lang/Throwable;

    .line 1124
    .line 1125
    invoke-static/range {v20 .. v20}, La/aem0;->D(Ljava/util/logging/Level;)I

    .line 1126
    .line 1127
    .line 1128
    move-result v1

    .line 1129
    const/4 v12, 0x2

    .line 1130
    if-eq v1, v12, :cond_49

    .line 1131
    .line 1132
    const/4 v12, 0x3

    .line 1133
    if-eq v1, v12, :cond_48

    .line 1134
    .line 1135
    const/4 v12, 0x4

    .line 1136
    if-eq v1, v12, :cond_47

    .line 1137
    .line 1138
    const/4 v12, 0x5

    .line 1139
    if-eq v1, v12, :cond_46

    .line 1140
    .line 1141
    move-object/from16 v1, p1

    .line 1142
    .line 1143
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1144
    .line 1145
    .line 1146
    return-void

    .line 1147
    :cond_46
    move-object/from16 v1, p1

    .line 1148
    .line 1149
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1150
    .line 1151
    .line 1152
    return-void

    .line 1153
    :cond_47
    move-object/from16 v1, p1

    .line 1154
    .line 1155
    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1156
    .line 1157
    .line 1158
    return-void

    .line 1159
    :cond_48
    move-object/from16 v1, p1

    .line 1160
    .line 1161
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1162
    .line 1163
    .line 1164
    return-void

    .line 1165
    :cond_49
    move-object/from16 v1, p1

    .line 1166
    .line 1167
    invoke-static {v1, v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1168
    .line 1169
    .line 1170
    return-void

    .line 1171
    :cond_4a
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    return-void

    .line 1175
    :cond_4b
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    return-void

    .line 1179
    :cond_4c
    const-string v0, "cannot request log site information prior to postProcess()"

    .line 1180
    .line 1181
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/logging/Level;)Z
    .locals 0

    .line 1
    invoke-static {p1}, La/aem0;->D(Ljava/util/logging/Level;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p0, p0, La/gcw0;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    const-string p0, "all"

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public final b(La/lfx0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/gcw0;->e:La/cmt0;

    .line 2
    .line 3
    iget-object v1, p0, La/gcw0;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/gcw0;->c:Ljava/util/logging/Level;

    .line 6
    .line 7
    iget-object p0, p0, La/gcw0;->d:Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {p1, v1, v2, p0, v0}, La/gcw0;->d(La/lfx0;Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;La/cmt0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
