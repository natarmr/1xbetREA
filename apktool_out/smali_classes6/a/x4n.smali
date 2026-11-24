.class public final synthetic La/x4n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/umm0;


# direct methods
.method public synthetic constructor <init>(La/umm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x4n;->a:B

    iput-object p1, p0, La/x4n;->b:La/umm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x4n;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x30000000

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v0, v0, La/x4n;->b:La/umm0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p1

    .line 19
    .line 20
    check-cast v8, La/mm40;

    .line 21
    .line 22
    move-object/from16 v15, p2

    .line 23
    .line 24
    check-cast v15, La/fet;

    .line 25
    .line 26
    move-object/from16 v1, p3

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v9, v1, 0x6

    .line 38
    .line 39
    if-nez v9, :cond_1

    .line 40
    .line 41
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    move v5, v6

    .line 48
    :cond_0
    or-int/2addr v1, v5

    .line 49
    :cond_1
    and-int/lit8 v5, v1, 0x13

    .line 50
    .line 51
    if-eq v5, v4, :cond_2

    .line 52
    .line 53
    move v3, v7

    .line 54
    :cond_2
    and-int/lit8 v4, v1, 0x1

    .line 55
    .line 56
    invoke-virtual {v15, v4, v3}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    check-cast v0, La/tmm0;

    .line 63
    .line 64
    iget-object v9, v0, La/tmm0;->a:La/i1n;

    .line 65
    .line 66
    iget-object v10, v0, La/tmm0;->b:La/i1n;

    .line 67
    .line 68
    iget-object v13, v0, La/tmm0;->e:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v14, v0, La/tmm0;->f:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v11, v0, La/tmm0;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v12, v0, La/tmm0;->d:Ljava/lang/String;

    .line 75
    .line 76
    sget-object v0, La/x0m;->a:La/x0m;

    .line 77
    .line 78
    and-int/lit8 v0, v1, 0xe

    .line 79
    .line 80
    or-int v16, v0, v2

    .line 81
    .line 82
    invoke-static/range {v8 .. v16}, La/d5c;->m(La/mm40;La/i1n;La/i1n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 87
    .line 88
    .line 89
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, La/mm40;

    .line 95
    .line 96
    move-object/from16 v8, p2

    .line 97
    .line 98
    check-cast v8, La/fet;

    .line 99
    .line 100
    move-object/from16 v9, p3

    .line 101
    .line 102
    check-cast v9, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    and-int/lit8 v10, v9, 0x6

    .line 112
    .line 113
    if-nez v10, :cond_5

    .line 114
    .line 115
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_4

    .line 120
    .line 121
    move v5, v6

    .line 122
    :cond_4
    or-int/2addr v9, v5

    .line 123
    :cond_5
    and-int/lit8 v5, v9, 0x13

    .line 124
    .line 125
    if-eq v5, v4, :cond_6

    .line 126
    .line 127
    move v3, v7

    .line 128
    :cond_6
    and-int/lit8 v4, v9, 0x1

    .line 129
    .line 130
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_7

    .line 135
    .line 136
    check-cast v0, La/smm0;

    .line 137
    .line 138
    move v10, v2

    .line 139
    iget-object v2, v0, La/smm0;->a:La/i1n;

    .line 140
    .line 141
    iget-object v3, v0, La/smm0;->b:La/i1n;

    .line 142
    .line 143
    iget-object v6, v0, La/smm0;->e:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v7, v0, La/smm0;->f:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v4, v0, La/smm0;->c:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v5, v0, La/smm0;->d:Ljava/lang/String;

    .line 150
    .line 151
    sget-object v0, La/x0m;->a:La/x0m;

    .line 152
    .line 153
    and-int/lit8 v0, v9, 0xe

    .line 154
    .line 155
    or-int v9, v0, v10

    .line 156
    .line 157
    invoke-static/range {v1 .. v9}, La/d5c;->m(La/mm40;La/i1n;La/i1n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    invoke-virtual {v8}, La/fet;->X()V

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_1
    move v10, v2

    .line 168
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, La/mm40;

    .line 171
    .line 172
    move-object/from16 v8, p2

    .line 173
    .line 174
    check-cast v8, La/fet;

    .line 175
    .line 176
    move-object/from16 v2, p3

    .line 177
    .line 178
    check-cast v2, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    and-int/lit8 v9, v2, 0x6

    .line 188
    .line 189
    if-nez v9, :cond_9

    .line 190
    .line 191
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-eqz v9, :cond_8

    .line 196
    .line 197
    move v5, v6

    .line 198
    :cond_8
    or-int/2addr v2, v5

    .line 199
    :cond_9
    and-int/lit8 v5, v2, 0x13

    .line 200
    .line 201
    if-eq v5, v4, :cond_a

    .line 202
    .line 203
    move v3, v7

    .line 204
    :cond_a
    and-int/lit8 v4, v2, 0x1

    .line 205
    .line 206
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_b

    .line 211
    .line 212
    check-cast v0, La/rmm0;

    .line 213
    .line 214
    move v3, v2

    .line 215
    iget-object v2, v0, La/rmm0;->a:La/i1n;

    .line 216
    .line 217
    move v4, v3

    .line 218
    iget-object v3, v0, La/rmm0;->b:La/i1n;

    .line 219
    .line 220
    iget-object v6, v0, La/rmm0;->e:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v7, v0, La/rmm0;->f:Ljava/lang/String;

    .line 223
    .line 224
    move v5, v4

    .line 225
    iget-object v4, v0, La/rmm0;->c:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v0, v0, La/rmm0;->d:Ljava/lang/String;

    .line 228
    .line 229
    sget-object v9, La/x0m;->a:La/x0m;

    .line 230
    .line 231
    and-int/lit8 v5, v5, 0xe

    .line 232
    .line 233
    or-int v9, v5, v10

    .line 234
    .line 235
    move-object v5, v0

    .line 236
    invoke-static/range {v1 .. v9}, La/d5c;->m(La/mm40;La/i1n;La/i1n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_b
    invoke-virtual {v8}, La/fet;->X()V

    .line 241
    .line 242
    .line 243
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_2
    move-object/from16 v1, p1

    .line 247
    .line 248
    check-cast v1, La/mm40;

    .line 249
    .line 250
    move v2, v5

    .line 251
    move-object/from16 v5, p2

    .line 252
    .line 253
    check-cast v5, La/fet;

    .line 254
    .line 255
    move-object/from16 v8, p3

    .line 256
    .line 257
    check-cast v8, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    and-int/lit8 v9, v8, 0x6

    .line 267
    .line 268
    if-nez v9, :cond_d

    .line 269
    .line 270
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_c

    .line 275
    .line 276
    move v2, v6

    .line 277
    :cond_c
    or-int/2addr v8, v2

    .line 278
    :cond_d
    and-int/lit8 v2, v8, 0x13

    .line 279
    .line 280
    if-eq v2, v4, :cond_e

    .line 281
    .line 282
    move v3, v7

    .line 283
    :cond_e
    and-int/lit8 v2, v8, 0x1

    .line 284
    .line 285
    invoke-virtual {v5, v2, v3}, La/fet;->U(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_f

    .line 290
    .line 291
    check-cast v0, La/pmm0;

    .line 292
    .line 293
    iget-object v2, v0, La/pmm0;->a:La/jxm;

    .line 294
    .line 295
    iget-object v3, v0, La/pmm0;->b:La/jxm;

    .line 296
    .line 297
    iget-object v4, v0, La/pmm0;->c:Ljava/lang/String;

    .line 298
    .line 299
    and-int/lit8 v6, v8, 0xe

    .line 300
    .line 301
    invoke-static/range {v1 .. v6}, La/xbc;->n(La/mm40;La/jxm;La/jxm;Ljava/lang/String;La/fet;I)V

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_f
    invoke-virtual {v5}, La/fet;->X()V

    .line 306
    .line 307
    .line 308
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_3
    move v10, v2

    .line 312
    move v2, v5

    .line 313
    move-object/from16 v1, p1

    .line 314
    .line 315
    check-cast v1, La/mm40;

    .line 316
    .line 317
    move-object/from16 v8, p2

    .line 318
    .line 319
    check-cast v8, La/fet;

    .line 320
    .line 321
    move-object/from16 v5, p3

    .line 322
    .line 323
    check-cast v5, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    and-int/lit8 v9, v5, 0x6

    .line 333
    .line 334
    if-nez v9, :cond_11

    .line 335
    .line 336
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    if-eqz v9, :cond_10

    .line 341
    .line 342
    move v2, v6

    .line 343
    :cond_10
    or-int/2addr v5, v2

    .line 344
    :cond_11
    and-int/lit8 v2, v5, 0x13

    .line 345
    .line 346
    if-eq v2, v4, :cond_12

    .line 347
    .line 348
    move v3, v7

    .line 349
    :cond_12
    and-int/lit8 v2, v5, 0x1

    .line 350
    .line 351
    invoke-virtual {v8, v2, v3}, La/fet;->U(IZ)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_13

    .line 356
    .line 357
    check-cast v0, La/omm0;

    .line 358
    .line 359
    iget-object v2, v0, La/omm0;->a:La/i1n;

    .line 360
    .line 361
    iget-object v3, v0, La/omm0;->b:La/i1n;

    .line 362
    .line 363
    iget-object v6, v0, La/omm0;->d:Ljava/lang/String;

    .line 364
    .line 365
    iget-object v7, v0, La/omm0;->e:Ljava/lang/String;

    .line 366
    .line 367
    iget-object v0, v0, La/omm0;->c:Ljava/lang/String;

    .line 368
    .line 369
    sget-object v4, La/x0m;->a:La/x0m;

    .line 370
    .line 371
    and-int/lit8 v4, v5, 0xe

    .line 372
    .line 373
    or-int v9, v4, v10

    .line 374
    .line 375
    const-string v4, ""

    .line 376
    .line 377
    move-object v5, v0

    .line 378
    invoke-static/range {v1 .. v9}, La/d5c;->m(La/mm40;La/i1n;La/i1n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 379
    .line 380
    .line 381
    goto :goto_4

    .line 382
    :cond_13
    invoke-virtual {v8}, La/fet;->X()V

    .line 383
    .line 384
    .line 385
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object v0

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
