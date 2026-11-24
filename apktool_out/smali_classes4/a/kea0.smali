.class public final synthetic La/kea0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lea0;


# direct methods
.method public synthetic constructor <init>(La/lea0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kea0;->a:B

    iput-object p1, p0, La/kea0;->b:La/lea0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kea0;->a:B

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v0, v0, La/kea0;->b:La/lea0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/lea0;->c:La/ctf0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v5, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_5

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    move-object v7, v6

    .line 43
    check-cast v7, La/fea0;

    .line 44
    .line 45
    iget-object v8, v7, La/fea0;->c:La/kda0;

    .line 46
    .line 47
    iget-object v8, v8, La/kda0;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-lez v8, :cond_0

    .line 54
    .line 55
    iget-wide v8, v7, La/fea0;->b:J

    .line 56
    .line 57
    const-wide/16 v10, 0x0

    .line 58
    .line 59
    cmp-long v8, v8, v10

    .line 60
    .line 61
    if-lez v8, :cond_0

    .line 62
    .line 63
    iget-object v8, v7, La/fea0;->d:La/aea0;

    .line 64
    .line 65
    iget-object v9, v8, La/aea0;->b:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v8, v8, La/aea0;->e:La/fks0;

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-lez v9, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v8}, La/fks0;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-nez v9, :cond_2

    .line 81
    .line 82
    sget-object v9, La/fks0;->c:La/fks0;

    .line 83
    .line 84
    if-ne v8, v9, :cond_0

    .line 85
    .line 86
    :cond_2
    :goto_1
    iget-object v7, v7, La/fea0;->e:La/aea0;

    .line 87
    .line 88
    iget-object v8, v7, La/aea0;->b:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v7, v7, La/aea0;->e:La/fks0;

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-lez v8, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {v7}, La/fks0;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_4

    .line 104
    .line 105
    sget-object v8, La/fks0;->c:La/fks0;

    .line 106
    .line 107
    if-ne v7, v8, :cond_0

    .line 108
    .line 109
    :cond_4
    :goto_2
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    new-instance v1, La/lk30;

    .line 114
    .line 115
    const/16 v6, 0x12

    .line 116
    .line 117
    invoke-direct {v1, v6}, La/lk30;-><init>(B)V

    .line 118
    .line 119
    .line 120
    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v5, Ljava/util/ArrayList;

    .line 125
    .line 126
    const/16 v6, 0xa

    .line 127
    .line 128
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const/4 v6, 0x0

    .line 140
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_8

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    add-int/lit8 v8, v6, 0x1

    .line 151
    .line 152
    if-ltz v6, :cond_7

    .line 153
    .line 154
    check-cast v7, La/fea0;

    .line 155
    .line 156
    new-instance v9, La/ica0;

    .line 157
    .line 158
    new-instance v10, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-class v6, La/ica0;

    .line 167
    .line 168
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    new-instance v10, La/ycm;

    .line 176
    .line 177
    new-instance v11, La/icm;

    .line 178
    .line 179
    new-instance v12, La/jcm;

    .line 180
    .line 181
    iget-wide v13, v7, La/fea0;->b:J

    .line 182
    .line 183
    iget-object v15, v7, La/fea0;->d:La/aea0;

    .line 184
    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget-object v17, La/rdj;->a:La/rdj;

    .line 192
    .line 193
    invoke-static {v13, v14}, La/rdj;->k(J)Ljava/util/Date;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    invoke-virtual {v2, v13}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 198
    .line 199
    .line 200
    new-instance v13, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    const/4 v4, 0x2

    .line 207
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    add-int/2addr v4, v3

    .line 212
    const/4 v3, 0x5

    .line 213
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-direct {v13, v14, v4, v2}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v12, v13}, La/jcm;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 221
    .line 222
    .line 223
    new-instance v2, La/xcm;

    .line 224
    .line 225
    const/4 v3, 0x1

    .line 226
    invoke-static {v15, v3}, La/w9x;->S(La/aea0;Z)La/qcm;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v15, v0, v4}, La/w9x;->T(La/aea0;La/ctf0;La/qcm;)La/ucm;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v4, v7, La/fea0;->e:La/aea0;

    .line 235
    .line 236
    iget-object v7, v15, La/aea0;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-lez v7, :cond_6

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    goto :goto_4

    .line 246
    :cond_6
    const/4 v7, 0x0

    .line 247
    :goto_4
    invoke-static {v4, v7}, La/w9x;->S(La/aea0;Z)La/qcm;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-static {v4, v0, v7}, La/w9x;->T(La/aea0;La/ctf0;La/qcm;)La/ucm;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-direct {v2, v3, v4}, La/xcm;-><init>(La/ucm;La/ucm;)V

    .line 256
    .line 257
    .line 258
    invoke-direct {v11, v12, v2}, La/icm;-><init>(La/jcm;La/xcm;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {v10, v11}, La/ycm;-><init>(La/icm;)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v9, v6, v10}, La/ica0;-><init>(Ljava/lang/String;La/edm;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move v6, v8

    .line 271
    const/4 v3, 0x1

    .line 272
    goto/16 :goto_3

    .line 273
    .line 274
    :cond_7
    const/16 v16, 0x0

    .line 275
    .line 276
    invoke-static {}, La/q3d;->p()V

    .line 277
    .line 278
    .line 279
    throw v16

    .line 280
    :cond_8
    return-object v5

    .line 281
    :pswitch_0
    const/16 v16, 0x0

    .line 282
    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, La/kda0;

    .line 286
    .line 287
    if-eqz v1, :cond_b

    .line 288
    .line 289
    iget-object v0, v0, La/lea0;->c:La/ctf0;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    new-instance v2, La/rhs0;

    .line 295
    .line 296
    new-instance v3, La/n0x;

    .line 297
    .line 298
    iget-object v4, v1, La/kda0;->d:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v4}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-direct {v3, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    new-instance v4, La/n0x;

    .line 308
    .line 309
    iget-object v5, v1, La/kda0;->e:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v5}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-direct {v4, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    iget-object v5, v1, La/kda0;->a:Ljava/lang/String;

    .line 319
    .line 320
    iget-object v6, v1, La/kda0;->b:Ljava/lang/String;

    .line 321
    .line 322
    iget v7, v1, La/kda0;->f:I

    .line 323
    .line 324
    iget-boolean v1, v1, La/kda0;->g:Z

    .line 325
    .line 326
    const/4 v8, -0x1

    .line 327
    if-eq v7, v8, :cond_a

    .line 328
    .line 329
    if-eqz v1, :cond_9

    .line 330
    .line 331
    const-string v1, "$%,d"

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_9
    const-string v1, "%,d$"

    .line 335
    .line 336
    :goto_5
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 337
    .line 338
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    const/4 v9, 0x1

    .line 347
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-static {v8, v1, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    const-string v7, ","

    .line 356
    .line 357
    const-string v8, " "

    .line 358
    .line 359
    const/4 v9, 0x0

    .line 360
    invoke-static {v1, v7, v8, v9}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    new-array v7, v9, [Ljava/lang/Object;

    .line 365
    .line 366
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 367
    .line 368
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    const v8, 0x7f131004

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-string v7, ": "

    .line 380
    .line 381
    invoke-static {v0, v7, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    :goto_6
    move-object v7, v0

    .line 386
    goto :goto_7

    .line 387
    :cond_a
    const-string v0, ""

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :goto_7
    invoke-direct/range {v2 .. v7}, La/rhs0;-><init>(La/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_b
    move-object/from16 v2, v16

    .line 395
    .line 396
    :goto_8
    return-object v2

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
