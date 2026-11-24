.class public final La/le80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/a4x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/le80;->a:B

    iput-object p1, p0, La/le80;->b:Ljava/util/List;

    iput-object p2, p0, La/le80;->c:La/a4x;

    iput-object p3, p0, La/le80;->d:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, La/le80;->e:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/le80;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/le80;->c:La/a4x;

    .line 6
    .line 7
    iget-object v3, v0, La/le80;->b:Ljava/util/List;

    .line 8
    .line 9
    const/16 v4, 0x92

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v8, 0x4

    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/g9z;

    .line 25
    .line 26
    move-object/from16 v11, p2

    .line 27
    .line 28
    check-cast v11, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v11

    .line 34
    move-object/from16 v12, p3

    .line 35
    .line 36
    check-cast v12, La/fet;

    .line 37
    .line 38
    move-object/from16 v13, p4

    .line 39
    .line 40
    check-cast v13, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v13

    .line 46
    and-int/lit8 v14, v13, 0x6

    .line 47
    .line 48
    if-nez v14, :cond_1

    .line 49
    .line 50
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    move v7, v8

    .line 57
    :cond_0
    or-int v1, v13, v7

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v1, v13

    .line 61
    :goto_0
    and-int/lit8 v7, v13, 0x30

    .line 62
    .line 63
    if-nez v7, :cond_3

    .line 64
    .line 65
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    move v5, v6

    .line 72
    :cond_2
    or-int/2addr v1, v5

    .line 73
    :cond_3
    and-int/lit16 v5, v1, 0x93

    .line 74
    .line 75
    if-eq v5, v4, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move v9, v10

    .line 79
    :goto_1
    and-int/lit8 v4, v1, 0x1

    .line 80
    .line 81
    invoke-virtual {v12, v4, v9}, La/fet;->U(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    and-int/lit8 v1, v1, 0x7e

    .line 92
    .line 93
    check-cast v3, La/zhr0;

    .line 94
    .line 95
    const v4, -0x83b91ba

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v4}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    shr-int/lit8 v1, v1, 0x3

    .line 102
    .line 103
    and-int/lit8 v1, v1, 0xe

    .line 104
    .line 105
    invoke-static {v11, v2, v3, v12, v1}, La/nia0;->X(ILa/a4x;La/zhr0;La/fet;I)V

    .line 106
    .line 107
    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    iget-object v13, v0, La/le80;->d:Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    iget-object v14, v0, La/le80;->e:Lkotlin/jvm/functions/Function2;

    .line 114
    .line 115
    move-object/from16 v16, v12

    .line 116
    .line 117
    move-object v12, v3

    .line 118
    invoke-static/range {v12 .. v17}, La/nia0;->W(La/zhr0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/mm40;La/fet;I)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v0, v16

    .line 122
    .line 123
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move-object v0, v12

    .line 128
    invoke-virtual {v0}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/g9z;

    .line 137
    .line 138
    move-object/from16 v11, p2

    .line 139
    .line 140
    check-cast v11, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    move-object/from16 v12, p3

    .line 147
    .line 148
    check-cast v12, La/fet;

    .line 149
    .line 150
    move-object/from16 v13, p4

    .line 151
    .line 152
    check-cast v13, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    and-int/lit8 v14, v13, 0x6

    .line 159
    .line 160
    if-nez v14, :cond_7

    .line 161
    .line 162
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    move v7, v8

    .line 169
    :cond_6
    or-int v1, v13, v7

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    move v1, v13

    .line 173
    :goto_3
    and-int/lit8 v7, v13, 0x30

    .line 174
    .line 175
    if-nez v7, :cond_9

    .line 176
    .line 177
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_8

    .line 182
    .line 183
    move v5, v6

    .line 184
    :cond_8
    or-int/2addr v1, v5

    .line 185
    :cond_9
    and-int/lit16 v5, v1, 0x93

    .line 186
    .line 187
    if-eq v5, v4, :cond_a

    .line 188
    .line 189
    move v4, v9

    .line 190
    goto :goto_4

    .line 191
    :cond_a
    move v4, v10

    .line 192
    :goto_4
    and-int/2addr v1, v9

    .line 193
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_11

    .line 198
    .line 199
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, La/zhr0;

    .line 204
    .line 205
    const v3, 0x4f8abe80

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 209
    .line 210
    .line 211
    if-eqz v1, :cond_10

    .line 212
    .line 213
    instance-of v3, v1, La/ecb;

    .line 214
    .line 215
    const/high16 v4, 0x3f800000    # 1.0f

    .line 216
    .line 217
    sget-object v5, La/jm40;->b:La/jm40;

    .line 218
    .line 219
    const/high16 v6, 0x40800000    # 4.0f

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    const v0, 0x4f8b84ba

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 229
    .line 230
    .line 231
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    sget-object v0, La/qmk;->a:La/zcl;

    .line 236
    .line 237
    new-instance v0, La/ycl;

    .line 238
    .line 239
    invoke-direct {v0, v6}, La/ycl;-><init>(F)V

    .line 240
    .line 241
    .line 242
    if-eqz v11, :cond_b

    .line 243
    .line 244
    move-object v7, v0

    .line 245
    :cond_b
    if-eqz v7, :cond_c

    .line 246
    .line 247
    iget v8, v7, La/ycl;->a:F

    .line 248
    .line 249
    :cond_c
    move v15, v8

    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/16 v18, 0xd

    .line 253
    .line 254
    const/4 v14, 0x0

    .line 255
    const/16 v16, 0x0

    .line 256
    .line 257
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v1, La/ecb;

    .line 262
    .line 263
    invoke-static {v1, v0, v12, v10}, La/hxm0;->j(La/ecb;La/mm40;La/fet;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 267
    .line 268
    .line 269
    move-object v0, v12

    .line 270
    goto :goto_5

    .line 271
    :cond_d
    instance-of v3, v1, La/ae80;

    .line 272
    .line 273
    if-eqz v3, :cond_10

    .line 274
    .line 275
    const v3, 0x4f9033cc

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 279
    .line 280
    .line 281
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    sget-object v3, La/qmk;->a:La/zcl;

    .line 286
    .line 287
    new-instance v3, La/ycl;

    .line 288
    .line 289
    invoke-direct {v3, v6}, La/ycl;-><init>(F)V

    .line 290
    .line 291
    .line 292
    if-eqz v11, :cond_e

    .line 293
    .line 294
    sub-int/2addr v11, v9

    .line 295
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    instance-of v2, v2, La/ae80;

    .line 300
    .line 301
    if-eqz v2, :cond_e

    .line 302
    .line 303
    move-object v7, v3

    .line 304
    :cond_e
    if-eqz v7, :cond_f

    .line 305
    .line 306
    iget v8, v7, La/ycl;->a:F

    .line 307
    .line 308
    :cond_f
    move v15, v8

    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/16 v18, 0xd

    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 317
    .line 318
    .line 319
    move-result-object v15

    .line 320
    check-cast v1, La/ae80;

    .line 321
    .line 322
    iget-object v14, v0, La/le80;->e:Lkotlin/jvm/functions/Function2;

    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    iget-object v13, v0, La/le80;->d:Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    move-object/from16 v16, v12

    .line 329
    .line 330
    move-object v12, v1

    .line 331
    invoke-static/range {v12 .. v17}, La/q0x;->q(La/ae80;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/mm40;La/fet;I)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v0, v16

    .line 335
    .line 336
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 337
    .line 338
    .line 339
    :goto_5
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_10
    move-object v0, v12

    .line 344
    const v1, 0x1314fde3

    .line 345
    .line 346
    .line 347
    invoke-static {v1, v0, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    throw v0

    .line 352
    :cond_11
    move-object v0, v12

    .line 353
    invoke-virtual {v0}, La/fet;->X()V

    .line 354
    .line 355
    .line 356
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
