.class public final synthetic La/lm20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:D

.field public final synthetic e:D


# direct methods
.method public synthetic constructor <init>(La/gx4;DZD)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/lm20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lm20;->b:Ljava/lang/Object;

    iput-wide p2, p0, La/lm20;->d:D

    iput-boolean p4, p0, La/lm20;->c:Z

    iput-wide p5, p0, La/lm20;->e:D

    return-void
.end method

.method public synthetic constructor <init>(La/jdc0;ZDDB)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/lm20;->a:B

    iput-object p1, p0, La/lm20;->b:Ljava/lang/Object;

    iput-boolean p2, p0, La/lm20;->c:Z

    iput-wide p3, p0, La/lm20;->d:D

    iput-wide p5, p0, La/lm20;->e:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lm20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x2e

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-boolean v6, v0, La/lm20;->c:Z

    .line 11
    .line 12
    iget-object v7, v0, La/lm20;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v8, v7

    .line 18
    check-cast v8, La/gx4;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/oyg0;

    .line 23
    .line 24
    move-object/from16 v3, p2

    .line 25
    .line 26
    check-cast v3, La/b820;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v1, v8, La/gx4;->c:La/dx6;

    .line 35
    .line 36
    iget-object v9, v1, La/dx6;->b:La/vw6;

    .line 37
    .line 38
    new-instance v4, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 39
    .line 40
    iget-wide v10, v0, La/lm20;->e:D

    .line 41
    .line 42
    invoke-direct {v4, v10, v11, v6}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 43
    .line 44
    .line 45
    const/16 v27, 0x0

    .line 46
    .line 47
    const v28, 0xfefe

    .line 48
    .line 49
    .line 50
    iget-wide v10, v0, La/lm20;->d:D

    .line 51
    .line 52
    const-wide/16 v12, 0x0

    .line 53
    .line 54
    const-wide/16 v14, 0x0

    .line 55
    .line 56
    const-wide/16 v16, 0x0

    .line 57
    .line 58
    const-wide/16 v18, 0x0

    .line 59
    .line 60
    const/16 v20, 0x0

    .line 61
    .line 62
    const/16 v21, 0x0

    .line 63
    .line 64
    const/16 v22, 0x0

    .line 65
    .line 66
    const/16 v24, 0x0

    .line 67
    .line 68
    const/16 v25, 0x0

    .line 69
    .line 70
    const/16 v26, 0x0

    .line 71
    .line 72
    move-object/from16 v23, v4

    .line 73
    .line 74
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v1, v2, v0, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    const/4 v13, 0x0

    .line 83
    const/16 v14, 0x1b

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    const/16 v22, 0x1fdf

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x0

    .line 105
    .line 106
    move-object v9, v3

    .line 107
    invoke-static/range {v9 .. v22}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :pswitch_0
    check-cast v7, La/jdc0;

    .line 113
    .line 114
    move-object/from16 v1, p1

    .line 115
    .line 116
    check-cast v1, La/oyg0;

    .line 117
    .line 118
    move-object/from16 v8, p2

    .line 119
    .line 120
    check-cast v8, La/a820;

    .line 121
    .line 122
    iget-object v9, v8, La/a820;->f:La/dzc0;

    .line 123
    .line 124
    iget-object v1, v9, La/dzc0;->a:La/syc0;

    .line 125
    .line 126
    iget-object v2, v7, La/jdc0;->a:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v1, v2, v5, v4, v3}, La/syc0;->a(La/syc0;La/pz40;ZZI)La/syc0;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    iget-wide v12, v7, La/jdc0;->b:D

    .line 137
    .line 138
    iget-object v14, v7, La/jdc0;->c:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v15, v7, La/jdc0;->d:Ljava/lang/String;

    .line 141
    .line 142
    iget v1, v7, La/jdc0;->e:I

    .line 143
    .line 144
    if-eqz v1, :cond_0

    .line 145
    .line 146
    if-nez v6, :cond_0

    .line 147
    .line 148
    move/from16 v21, v5

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_0
    move/from16 v21, v4

    .line 152
    .line 153
    :goto_0
    xor-int/lit8 v20, v6, 0x1

    .line 154
    .line 155
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    new-instance v11, La/olc0;

    .line 162
    .line 163
    iget-wide v1, v0, La/lm20;->d:D

    .line 164
    .line 165
    iget-wide v3, v0, La/lm20;->e:D

    .line 166
    .line 167
    const/16 v22, 0x1

    .line 168
    .line 169
    move-wide/from16 v16, v1

    .line 170
    .line 171
    move-wide/from16 v18, v3

    .line 172
    .line 173
    invoke-direct/range {v11 .. v22}, La/olc0;-><init>(DLjava/lang/String;Ljava/lang/String;DDZZZ)V

    .line 174
    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const/16 v15, 0x2a

    .line 178
    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v13, 0x1

    .line 181
    invoke-static/range {v9 .. v15}, La/dzc0;->a(La/dzc0;La/syc0;La/olc0;ZZZI)La/dzc0;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    const/16 v24, 0x0

    .line 186
    .line 187
    const v25, 0x3ffdf

    .line 188
    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    const/4 v10, 0x0

    .line 192
    const/4 v11, 0x0

    .line 193
    const/4 v12, 0x0

    .line 194
    const/4 v14, 0x0

    .line 195
    const/4 v15, 0x0

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    const/16 v21, 0x0

    .line 207
    .line 208
    const/16 v22, 0x0

    .line 209
    .line 210
    const/16 v23, 0x0

    .line 211
    .line 212
    invoke-static/range {v8 .. v25}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :pswitch_1
    check-cast v7, La/jdc0;

    .line 218
    .line 219
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, La/oyg0;

    .line 222
    .line 223
    move-object/from16 v8, p2

    .line 224
    .line 225
    check-cast v8, La/b820;

    .line 226
    .line 227
    iget-object v9, v8, La/b820;->e:La/czc0;

    .line 228
    .line 229
    if-eqz v9, :cond_2

    .line 230
    .line 231
    iget-object v1, v9, La/czc0;->a:La/tyc0;

    .line 232
    .line 233
    iget-object v2, v7, La/jdc0;->a:Ljava/lang/String;

    .line 234
    .line 235
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-static {v1, v2, v5, v4, v3}, La/tyc0;->a(La/tyc0;La/pz40;ZZI)La/tyc0;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    iget-object v1, v8, La/b820;->e:La/czc0;

    .line 244
    .line 245
    iget-object v11, v1, La/czc0;->c:La/qlc0;

    .line 246
    .line 247
    iget-wide v12, v7, La/jdc0;->b:D

    .line 248
    .line 249
    iget-object v14, v7, La/jdc0;->c:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v15, v7, La/jdc0;->d:Ljava/lang/String;

    .line 252
    .line 253
    iget v1, v7, La/jdc0;->e:I

    .line 254
    .line 255
    if-eqz v1, :cond_1

    .line 256
    .line 257
    if-nez v6, :cond_1

    .line 258
    .line 259
    move/from16 v21, v5

    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_1
    move/from16 v21, v4

    .line 263
    .line 264
    :goto_1
    const/16 v22, 0x1

    .line 265
    .line 266
    const/16 v23, 0x20

    .line 267
    .line 268
    iget-wide v1, v0, La/lm20;->d:D

    .line 269
    .line 270
    iget-wide v3, v0, La/lm20;->e:D

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    move-wide/from16 v16, v1

    .line 275
    .line 276
    move-wide/from16 v18, v3

    .line 277
    .line 278
    invoke-static/range {v11 .. v23}, La/qlc0;->a(La/qlc0;DLjava/lang/String;Ljava/lang/String;DDZZZI)La/qlc0;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    const/4 v13, 0x1

    .line 283
    const/16 v14, 0xa

    .line 284
    .line 285
    const/4 v12, 0x0

    .line 286
    invoke-static/range {v9 .. v14}, La/czc0;->a(La/czc0;La/tyc0;La/qlc0;ZZI)La/czc0;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :cond_2
    move-object v13, v2

    .line 291
    const/16 v20, 0x0

    .line 292
    .line 293
    const/16 v21, 0x1fef

    .line 294
    .line 295
    const/4 v9, 0x0

    .line 296
    const/4 v10, 0x0

    .line 297
    const/4 v11, 0x0

    .line 298
    const/4 v12, 0x0

    .line 299
    const/4 v14, 0x0

    .line 300
    const/4 v15, 0x0

    .line 301
    const/16 v16, 0x0

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    const/16 v18, 0x0

    .line 306
    .line 307
    const/16 v19, 0x0

    .line 308
    .line 309
    invoke-static/range {v8 .. v21}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :pswitch_2
    check-cast v7, La/jdc0;

    .line 315
    .line 316
    move-object/from16 v1, p1

    .line 317
    .line 318
    check-cast v1, La/oyg0;

    .line 319
    .line 320
    move-object/from16 v8, p2

    .line 321
    .line 322
    check-cast v8, La/sg20;

    .line 323
    .line 324
    iget-object v9, v8, La/sg20;->f:La/ifc0;

    .line 325
    .line 326
    iget-object v1, v9, La/ifc0;->a:La/azc0;

    .line 327
    .line 328
    iget-object v2, v7, La/jdc0;->a:Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-static {v1, v2, v5, v3}, La/azc0;->a(La/azc0;La/pz40;ZI)La/azc0;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    iget-object v1, v8, La/sg20;->f:La/ifc0;

    .line 339
    .line 340
    iget-object v11, v1, La/ifc0;->c:La/plc0;

    .line 341
    .line 342
    iget-wide v12, v7, La/jdc0;->b:D

    .line 343
    .line 344
    iget-object v14, v7, La/jdc0;->c:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v15, v7, La/jdc0;->d:Ljava/lang/String;

    .line 347
    .line 348
    iget v1, v7, La/jdc0;->e:I

    .line 349
    .line 350
    if-eqz v1, :cond_3

    .line 351
    .line 352
    if-nez v6, :cond_3

    .line 353
    .line 354
    move/from16 v21, v5

    .line 355
    .line 356
    goto :goto_2

    .line 357
    :cond_3
    move/from16 v21, v4

    .line 358
    .line 359
    :goto_2
    const/16 v22, 0x1

    .line 360
    .line 361
    const/16 v23, 0x20

    .line 362
    .line 363
    iget-wide v1, v0, La/lm20;->d:D

    .line 364
    .line 365
    iget-wide v3, v0, La/lm20;->e:D

    .line 366
    .line 367
    const/16 v20, 0x0

    .line 368
    .line 369
    move-wide/from16 v16, v1

    .line 370
    .line 371
    move-wide/from16 v18, v3

    .line 372
    .line 373
    invoke-static/range {v11 .. v23}, La/plc0;->a(La/plc0;DLjava/lang/String;Ljava/lang/String;DDZZZI)La/plc0;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    const/4 v15, 0x0

    .line 378
    const/16 v16, 0x6a

    .line 379
    .line 380
    const/4 v12, 0x0

    .line 381
    const/4 v13, 0x1

    .line 382
    const/4 v14, 0x0

    .line 383
    invoke-static/range {v9 .. v16}, La/ifc0;->a(La/ifc0;La/azc0;La/plc0;ZZZZI)La/ifc0;

    .line 384
    .line 385
    .line 386
    move-result-object v13

    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const/16 v18, 0x7df

    .line 390
    .line 391
    const/4 v9, 0x0

    .line 392
    const/4 v10, 0x0

    .line 393
    const/4 v11, 0x0

    .line 394
    const/4 v12, 0x0

    .line 395
    const/16 v16, 0x0

    .line 396
    .line 397
    invoke-static/range {v8 .. v18}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    return-object v0

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
