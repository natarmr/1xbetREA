.class public final La/p72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s72;


# direct methods
.method public synthetic constructor <init>(La/s72;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p72;->a:B

    iput-object p1, p0, La/p72;->b:La/s72;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p72;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/p72;->b:La/s72;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 19
    .line 20
    sget v2, La/s72;->I:I

    .line 21
    .line 22
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v6, v2

    .line 34
    move-object v2, v4

    .line 35
    check-cast v2, La/g72;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    const v15, 0x7fffb

    .line 42
    .line 43
    .line 44
    move-object v7, v3

    .line 45
    const/4 v3, 0x0

    .line 46
    move-object v8, v4

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v9, v6

    .line 49
    const/4 v6, 0x0

    .line 50
    move-object v10, v7

    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v11, v8

    .line 53
    const/4 v8, 0x0

    .line 54
    move-object v12, v9

    .line 55
    const/4 v9, 0x0

    .line 56
    move-object v13, v10

    .line 57
    const/4 v10, 0x0

    .line 58
    move-object/from16 v16, v11

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    move-object/from16 v17, v12

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move-object/from16 v18, v13

    .line 65
    .line 66
    const/4 v13, 0x0

    .line 67
    move-object/from16 p0, v1

    .line 68
    .line 69
    move-object/from16 v1, v16

    .line 70
    .line 71
    move-object/from16 v16, v0

    .line 72
    .line 73
    move-object/from16 v0, v18

    .line 74
    .line 75
    invoke-static/range {v2 .. v15}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    if-nez v5, :cond_1

    .line 86
    .line 87
    invoke-virtual/range {v16 .. v16}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/g72;

    .line 92
    .line 93
    iget-object v0, v0, La/g72;->d:La/f72;

    .line 94
    .line 95
    instance-of v0, v0, La/e72;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    move-object/from16 v6, v17

    .line 100
    .line 101
    iget-object v0, v6, La/ocj;->a:La/p7m0;

    .line 102
    .line 103
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-object v2, v1

    .line 111
    check-cast v2, La/g72;

    .line 112
    .line 113
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v6, La/c72;

    .line 117
    .line 118
    new-instance v3, Ljava/net/UnknownHostException;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/net/UnknownHostException;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-direct {v6, v3}, La/c72;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, 0x7ffef

    .line 128
    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    invoke-static/range {v2 .. v15}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_0

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_1
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-virtual/range {v16 .. v16}, La/i3t0;->D()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/g72;

    .line 158
    .line 159
    iget-object v0, v0, La/g72;->d:La/f72;

    .line 160
    .line 161
    instance-of v0, v0, La/d72;

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    invoke-virtual/range {v16 .. v16}, La/i3t0;->D()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, La/g72;

    .line 170
    .line 171
    iget-object v0, v0, La/g72;->d:La/f72;

    .line 172
    .line 173
    instance-of v1, v0, La/d72;

    .line 174
    .line 175
    if-eqz v1, :cond_2

    .line 176
    .line 177
    check-cast v0, La/d72;

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_2
    const/4 v0, 0x0

    .line 181
    :goto_1
    if-eqz v0, :cond_5

    .line 182
    .line 183
    iget-object v0, v0, La/d72;->b:Ljava/util/Date;

    .line 184
    .line 185
    if-eqz v0, :cond_5

    .line 186
    .line 187
    invoke-virtual/range {v16 .. v16}, La/i3t0;->D()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, La/g72;

    .line 192
    .line 193
    iget-object v1, v1, La/g72;->b:Ljava/util/Date;

    .line 194
    .line 195
    if-nez v1, :cond_3

    .line 196
    .line 197
    new-instance v1, Ljava/util/Date;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 200
    .line 201
    .line 202
    :cond_3
    invoke-static {v0, v1}, La/ntb;->V(Ljava/util/Date;Ljava/util/Date;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_5

    .line 207
    .line 208
    :cond_4
    const/4 v0, 0x0

    .line 209
    move-object/from16 v1, v16

    .line 210
    .line 211
    invoke-virtual {v1, v0}, La/s72;->M(Z)V

    .line 212
    .line 213
    .line 214
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :cond_6
    move-object/from16 v1, p0

    .line 218
    .line 219
    move-object v3, v0

    .line 220
    move-object/from16 v0, v16

    .line 221
    .line 222
    move-object/from16 v2, v17

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :pswitch_0
    move-object v1, v0

    .line 227
    move-object/from16 v0, p1

    .line 228
    .line 229
    check-cast v0, Ljava/util/Date;

    .line 230
    .line 231
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, La/g72;

    .line 236
    .line 237
    iget-object v2, v2, La/g72;->b:Ljava/util/Date;

    .line 238
    .line 239
    if-eqz v0, :cond_7

    .line 240
    .line 241
    if-eqz v2, :cond_7

    .line 242
    .line 243
    invoke-static {v0, v2}, La/ntb;->V(Ljava/util/Date;Ljava/util/Date;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_9

    .line 248
    .line 249
    :cond_7
    if-nez v0, :cond_8

    .line 250
    .line 251
    if-nez v2, :cond_9

    .line 252
    .line 253
    :cond_8
    if-eqz v0, :cond_a

    .line 254
    .line 255
    if-nez v2, :cond_a

    .line 256
    .line 257
    :cond_9
    new-instance v2, La/o00;

    .line 258
    .line 259
    const/16 v3, 0x1b

    .line 260
    .line 261
    invoke-direct {v2, v0, v3}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 265
    .line 266
    .line 267
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_1
    move-object v1, v0

    .line 271
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_c

    .line 280
    .line 281
    sget v0, La/s72;->I:I

    .line 282
    .line 283
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 284
    .line 285
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 286
    .line 287
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 295
    .line 296
    move-object v4, v2

    .line 297
    check-cast v4, La/g72;

    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    const/16 v16, 0x0

    .line 303
    .line 304
    const v17, 0x77fff

    .line 305
    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    const/4 v6, 0x0

    .line 309
    const/4 v7, 0x0

    .line 310
    const/4 v8, 0x0

    .line 311
    const/4 v9, 0x0

    .line 312
    const/4 v10, 0x0

    .line 313
    const/4 v11, 0x0

    .line 314
    const/4 v12, 0x0

    .line 315
    const/4 v13, 0x1

    .line 316
    const/4 v14, 0x0

    .line 317
    const/4 v15, 0x0

    .line 318
    invoke-static/range {v4 .. v17}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_b

    .line 327
    .line 328
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_2
    move-object v1, v0

    .line 332
    move-object/from16 v13, p1

    .line 333
    .line 334
    check-cast v13, Ljava/util/List;

    .line 335
    .line 336
    sget v0, La/s72;->I:I

    .line 337
    .line 338
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 339
    .line 340
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 341
    .line 342
    :goto_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 350
    .line 351
    move-object v4, v2

    .line 352
    move-object v2, v4

    .line 353
    check-cast v2, La/g72;

    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const v15, 0x5ffff

    .line 360
    .line 361
    .line 362
    const/4 v3, 0x0

    .line 363
    move-object v5, v4

    .line 364
    const/4 v4, 0x0

    .line 365
    move-object v6, v5

    .line 366
    const/4 v5, 0x0

    .line 367
    move-object v7, v6

    .line 368
    const/4 v6, 0x0

    .line 369
    move-object v8, v7

    .line 370
    const/4 v7, 0x0

    .line 371
    move-object v9, v8

    .line 372
    const/4 v8, 0x0

    .line 373
    move-object v10, v9

    .line 374
    const/4 v9, 0x0

    .line 375
    move-object v11, v10

    .line 376
    const/4 v10, 0x0

    .line 377
    move-object v12, v11

    .line 378
    const/4 v11, 0x0

    .line 379
    move-object/from16 v16, v12

    .line 380
    .line 381
    const/4 v12, 0x0

    .line 382
    move-object/from16 v17, v1

    .line 383
    .line 384
    move-object/from16 v1, v16

    .line 385
    .line 386
    invoke-static/range {v2 .. v15}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-eqz v1, :cond_d

    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :cond_d
    move-object/from16 v1, v17

    .line 400
    .line 401
    goto :goto_3

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
