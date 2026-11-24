.class public final synthetic La/tja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/mm40;La/mm40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tja;->a:B

    iput-object p1, p0, La/tja;->b:La/pz40;

    iput-object p2, p0, La/tja;->c:La/mm40;

    iput-object p3, p0, La/tja;->d:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tja;->a:B

    .line 4
    .line 5
    const/16 v2, 0x9

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
    iget-object v7, v0, La/tja;->d:La/mm40;

    .line 13
    .line 14
    iget-object v8, v0, La/tja;->c:La/mm40;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v10, p1

    .line 21
    .line 22
    check-cast v10, La/mm40;

    .line 23
    .line 24
    move-object/from16 v14, p2

    .line 25
    .line 26
    check-cast v14, La/fet;

    .line 27
    .line 28
    move-object/from16 v1, p3

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v2, v1, 0x6

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v14, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    move v5, v6

    .line 50
    :cond_0
    or-int/2addr v1, v5

    .line 51
    :cond_1
    and-int/lit8 v2, v1, 0x13

    .line 52
    .line 53
    if-eq v2, v4, :cond_2

    .line 54
    .line 55
    move v3, v9

    .line 56
    :cond_2
    and-int/lit8 v2, v1, 0x1

    .line 57
    .line 58
    invoke-virtual {v14, v2, v3}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    new-instance v2, La/ft0;

    .line 65
    .line 66
    const/16 v3, 0xb

    .line 67
    .line 68
    invoke-direct {v2, v8, v3}, La/ft0;-><init>(La/mm40;B)V

    .line 69
    .line 70
    .line 71
    const v3, -0x1a1ad234

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    new-instance v2, La/fp0;

    .line 79
    .line 80
    const/16 v3, 0xa

    .line 81
    .line 82
    invoke-direct {v2, v7, v3}, La/fp0;-><init>(La/mm40;B)V

    .line 83
    .line 84
    .line 85
    const v3, 0x7a1b52ce

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v2, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    and-int/lit8 v1, v1, 0xe

    .line 93
    .line 94
    or-int/lit16 v15, v1, 0xd80

    .line 95
    .line 96
    iget-object v11, v0, La/tja;->b:La/pz40;

    .line 97
    .line 98
    invoke-static/range {v10 .. v15}, La/b5x;->m(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_0
    move-object/from16 v1, p1

    .line 109
    .line 110
    check-cast v1, La/mm40;

    .line 111
    .line 112
    move v10, v5

    .line 113
    move-object/from16 v5, p2

    .line 114
    .line 115
    check-cast v5, La/fet;

    .line 116
    .line 117
    move-object/from16 v11, p3

    .line 118
    .line 119
    check-cast v11, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 v12, v11, 0x6

    .line 129
    .line 130
    if-nez v12, :cond_5

    .line 131
    .line 132
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    if-eqz v12, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    move v6, v10

    .line 140
    :goto_1
    or-int/2addr v11, v6

    .line 141
    :cond_5
    and-int/lit8 v6, v11, 0x13

    .line 142
    .line 143
    if-eq v6, v4, :cond_6

    .line 144
    .line 145
    move v3, v9

    .line 146
    :cond_6
    and-int/lit8 v4, v11, 0x1

    .line 147
    .line 148
    invoke-virtual {v5, v4, v3}, La/fet;->U(IZ)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    new-instance v3, La/ft0;

    .line 155
    .line 156
    const/16 v4, 0xc

    .line 157
    .line 158
    invoke-direct {v3, v8, v4}, La/ft0;-><init>(La/mm40;B)V

    .line 159
    .line 160
    .line 161
    const v4, -0x39b9d4d6

    .line 162
    .line 163
    .line 164
    invoke-static {v4, v3, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-instance v4, La/fp0;

    .line 169
    .line 170
    invoke-direct {v4, v7, v2}, La/fp0;-><init>(La/mm40;B)V

    .line 171
    .line 172
    .line 173
    const v2, 0x77296ce8

    .line 174
    .line 175
    .line 176
    invoke-static {v2, v4, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    and-int/lit8 v2, v11, 0xe

    .line 181
    .line 182
    or-int/lit16 v6, v2, 0xd80

    .line 183
    .line 184
    iget-object v2, v0, La/tja;->b:La/pz40;

    .line 185
    .line 186
    invoke-static/range {v1 .. v6}, La/q5x;->r(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_7
    invoke-virtual {v5}, La/fet;->X()V

    .line 191
    .line 192
    .line 193
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_1
    move v10, v5

    .line 197
    move-object/from16 v1, p1

    .line 198
    .line 199
    check-cast v1, La/mm40;

    .line 200
    .line 201
    move-object/from16 v5, p2

    .line 202
    .line 203
    check-cast v5, La/fet;

    .line 204
    .line 205
    move-object/from16 v11, p3

    .line 206
    .line 207
    check-cast v11, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    and-int/lit8 v12, v11, 0x6

    .line 217
    .line 218
    if-nez v12, :cond_9

    .line 219
    .line 220
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    if-eqz v12, :cond_8

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_8
    move v6, v10

    .line 228
    :goto_3
    or-int/2addr v11, v6

    .line 229
    :cond_9
    and-int/lit8 v6, v11, 0x13

    .line 230
    .line 231
    if-eq v6, v4, :cond_a

    .line 232
    .line 233
    move v3, v9

    .line 234
    :cond_a
    and-int/lit8 v4, v11, 0x1

    .line 235
    .line 236
    invoke-virtual {v5, v4, v3}, La/fet;->U(IZ)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_b

    .line 241
    .line 242
    new-instance v3, La/ft0;

    .line 243
    .line 244
    invoke-direct {v3, v8, v2}, La/ft0;-><init>(La/mm40;B)V

    .line 245
    .line 246
    .line 247
    const v2, 0x5f50a3b0

    .line 248
    .line 249
    .line 250
    invoke-static {v2, v3, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    new-instance v2, La/fp0;

    .line 255
    .line 256
    const/4 v4, 0x7

    .line 257
    invoke-direct {v2, v7, v4}, La/fp0;-><init>(La/mm40;B)V

    .line 258
    .line 259
    .line 260
    const v4, 0x53b2e5ee

    .line 261
    .line 262
    .line 263
    invoke-static {v4, v2, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    and-int/lit8 v2, v11, 0xe

    .line 268
    .line 269
    or-int/lit16 v6, v2, 0xd80

    .line 270
    .line 271
    iget-object v2, v0, La/tja;->b:La/pz40;

    .line 272
    .line 273
    invoke-static/range {v1 .. v6}, La/n6x;->d(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_b
    invoke-virtual {v5}, La/fet;->X()V

    .line 278
    .line 279
    .line 280
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_2
    move v10, v5

    .line 284
    move-object/from16 v1, p1

    .line 285
    .line 286
    check-cast v1, La/mm40;

    .line 287
    .line 288
    move-object/from16 v5, p2

    .line 289
    .line 290
    check-cast v5, La/fet;

    .line 291
    .line 292
    move-object/from16 v2, p3

    .line 293
    .line 294
    check-cast v2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    and-int/lit8 v11, v2, 0x6

    .line 304
    .line 305
    if-nez v11, :cond_d

    .line 306
    .line 307
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    if-eqz v11, :cond_c

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_c
    move v6, v10

    .line 315
    :goto_5
    or-int/2addr v2, v6

    .line 316
    :cond_d
    and-int/lit8 v6, v2, 0x13

    .line 317
    .line 318
    if-eq v6, v4, :cond_e

    .line 319
    .line 320
    move v3, v9

    .line 321
    :cond_e
    and-int/lit8 v4, v2, 0x1

    .line 322
    .line 323
    invoke-virtual {v5, v4, v3}, La/fet;->U(IZ)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_f

    .line 328
    .line 329
    new-instance v3, La/ft0;

    .line 330
    .line 331
    invoke-direct {v3, v8, v9}, La/ft0;-><init>(La/mm40;B)V

    .line 332
    .line 333
    .line 334
    const v4, -0x513008e0

    .line 335
    .line 336
    .line 337
    invoke-static {v4, v3, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    new-instance v4, La/fp0;

    .line 342
    .line 343
    invoke-direct {v4, v7, v9}, La/fp0;-><init>(La/mm40;B)V

    .line 344
    .line 345
    .line 346
    const v6, 0x34c10d5e

    .line 347
    .line 348
    .line 349
    invoke-static {v6, v4, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    and-int/lit8 v2, v2, 0xe

    .line 354
    .line 355
    or-int/lit16 v6, v2, 0xd80

    .line 356
    .line 357
    iget-object v2, v0, La/tja;->b:La/pz40;

    .line 358
    .line 359
    invoke-static/range {v1 .. v6}, La/d7x;->f(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 360
    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_f
    invoke-virtual {v5}, La/fet;->X()V

    .line 364
    .line 365
    .line 366
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
