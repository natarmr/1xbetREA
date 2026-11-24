.class public final synthetic La/yw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z

.field public final synthetic f:La/fy8;


# direct methods
.method public synthetic constructor <init>(La/fy8;FFLkotlin/jvm/functions/Function1;ZB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/yw8;->a:B

    iput-object p1, p0, La/yw8;->f:La/fy8;

    iput p2, p0, La/yw8;->b:F

    iput p3, p0, La/yw8;->c:F

    iput-object p4, p0, La/yw8;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, La/yw8;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yw8;->a:B

    .line 4
    .line 5
    const/high16 v4, 0x70000

    .line 6
    .line 7
    const/16 v5, 0x482

    .line 8
    .line 9
    const/16 v6, 0x80

    .line 10
    .line 11
    const/16 v7, 0x100

    .line 12
    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x4

    .line 15
    const/4 v10, 0x1

    .line 16
    const/4 v11, 0x0

    .line 17
    iget-boolean v12, v0, La/yw8;->e:Z

    .line 18
    .line 19
    iget-object v13, v0, La/yw8;->f:La/fy8;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v13, La/dy8;

    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/l7m0;

    .line 29
    .line 30
    move-object/from16 v14, p2

    .line 31
    .line 32
    check-cast v14, La/l7m0;

    .line 33
    .line 34
    move-object/from16 v15, p3

    .line 35
    .line 36
    check-cast v15, La/ycl;

    .line 37
    .line 38
    move-object/from16 v2, p4

    .line 39
    .line 40
    check-cast v2, La/fet;

    .line 41
    .line 42
    move-object/from16 v16, p5

    .line 43
    .line 44
    check-cast v16, Ljava/lang/Integer;

    .line 45
    .line 46
    const/high16 v17, 0xe000000

    .line 47
    .line 48
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v14, v3, 0x6

    .line 59
    .line 60
    if-nez v14, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-eqz v14, :cond_0

    .line 67
    .line 68
    move v8, v9

    .line 69
    :cond_0
    or-int/2addr v8, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v8, v3

    .line 72
    :goto_0
    and-int/lit16 v3, v3, 0x180

    .line 73
    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    iget v3, v15, La/ycl;->a:F

    .line 77
    .line 78
    invoke-virtual {v2, v3}, La/fet;->d(F)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    move v6, v7

    .line 85
    :cond_2
    or-int/2addr v8, v6

    .line 86
    :cond_3
    and-int/lit16 v3, v8, 0x483

    .line 87
    .line 88
    if-eq v3, v5, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move v10, v11

    .line 92
    :goto_1
    and-int/lit8 v3, v8, 0x1

    .line 93
    .line 94
    invoke-virtual {v2, v3, v10}, La/fet;->U(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    iget-object v3, v13, La/dy8;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v5, v13, La/dy8;->f:La/imm;

    .line 103
    .line 104
    iget-object v6, v13, La/dy8;->c:La/imm;

    .line 105
    .line 106
    iget-object v7, v13, La/dy8;->d:La/vu8;

    .line 107
    .line 108
    iget v9, v15, La/ycl;->a:F

    .line 109
    .line 110
    new-instance v10, La/m87;

    .line 111
    .line 112
    const/16 v11, 0x14

    .line 113
    .line 114
    invoke-direct {v10, v13, v11}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    const v11, 0x7b700046

    .line 118
    .line 119
    .line 120
    invoke-static {v11, v10, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 121
    .line 122
    .line 123
    move-result-object v24

    .line 124
    shl-int/lit8 v10, v8, 0xf

    .line 125
    .line 126
    and-int/2addr v4, v10

    .line 127
    shl-int/lit8 v10, v8, 0x12

    .line 128
    .line 129
    and-int v10, v10, v17

    .line 130
    .line 131
    or-int v26, v4, v10

    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    iget v4, v0, La/yw8;->b:F

    .line 135
    .line 136
    iget v10, v0, La/yw8;->c:F

    .line 137
    .line 138
    iget-object v0, v0, La/yw8;->d:Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    move-object/from16 v23, v0

    .line 141
    .line 142
    move-object/from16 v19, v1

    .line 143
    .line 144
    move-object/from16 v25, v2

    .line 145
    .line 146
    move-object v15, v3

    .line 147
    move/from16 v20, v4

    .line 148
    .line 149
    move-object/from16 v16, v5

    .line 150
    .line 151
    move-object/from16 v17, v6

    .line 152
    .line 153
    move-object/from16 v18, v7

    .line 154
    .line 155
    move/from16 v22, v9

    .line 156
    .line 157
    move/from16 v21, v10

    .line 158
    .line 159
    invoke-static/range {v14 .. v26}, La/xf0;->f(La/mm40;Ljava/lang/String;La/imm;La/imm;La/vu8;La/l7m0;FFFLkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v0, v19

    .line 163
    .line 164
    move-object/from16 v1, v25

    .line 165
    .line 166
    if-eqz v12, :cond_5

    .line 167
    .line 168
    const v2, 0x7f040ae3

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    const v2, 0x7f040ae1

    .line 173
    .line 174
    .line 175
    :goto_2
    and-int/lit8 v3, v8, 0xe

    .line 176
    .line 177
    invoke-static {v0, v2, v1, v3}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    move-object v1, v2

    .line 182
    invoke-virtual {v1}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_0
    const/high16 v17, 0xe000000

    .line 189
    .line 190
    check-cast v13, La/cy8;

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, La/l7m0;

    .line 195
    .line 196
    move-object/from16 v2, p2

    .line 197
    .line 198
    check-cast v2, La/l7m0;

    .line 199
    .line 200
    move-object/from16 v3, p3

    .line 201
    .line 202
    check-cast v3, La/ycl;

    .line 203
    .line 204
    move-object/from16 v14, p4

    .line 205
    .line 206
    check-cast v14, La/fet;

    .line 207
    .line 208
    move-object/from16 v15, p5

    .line 209
    .line 210
    check-cast v15, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    and-int/lit8 v2, v15, 0x6

    .line 223
    .line 224
    if-nez v2, :cond_8

    .line 225
    .line 226
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_7

    .line 231
    .line 232
    move v8, v9

    .line 233
    :cond_7
    or-int v2, v15, v8

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    move v2, v15

    .line 237
    :goto_4
    and-int/lit16 v8, v15, 0x180

    .line 238
    .line 239
    if-nez v8, :cond_a

    .line 240
    .line 241
    iget v8, v3, La/ycl;->a:F

    .line 242
    .line 243
    invoke-virtual {v14, v8}, La/fet;->d(F)Z

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-eqz v8, :cond_9

    .line 248
    .line 249
    move v6, v7

    .line 250
    :cond_9
    or-int/2addr v2, v6

    .line 251
    :cond_a
    and-int/lit16 v6, v2, 0x483

    .line 252
    .line 253
    if-eq v6, v5, :cond_b

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_b
    move v10, v11

    .line 257
    :goto_5
    and-int/lit8 v5, v2, 0x1

    .line 258
    .line 259
    invoke-virtual {v14, v5, v10}, La/fet;->U(IZ)Z

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-eqz v5, :cond_d

    .line 264
    .line 265
    iget-object v5, v13, La/cy8;->b:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v6, v13, La/cy8;->f:La/imm;

    .line 268
    .line 269
    iget-object v7, v13, La/cy8;->c:La/imm;

    .line 270
    .line 271
    iget-object v8, v13, La/cy8;->d:La/vu8;

    .line 272
    .line 273
    iget v3, v3, La/ycl;->a:F

    .line 274
    .line 275
    new-instance v9, La/m87;

    .line 276
    .line 277
    const/16 v10, 0x13

    .line 278
    .line 279
    invoke-direct {v9, v13, v10}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 280
    .line 281
    .line 282
    const v10, -0x3f94d0fe

    .line 283
    .line 284
    .line 285
    invoke-static {v10, v9, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 286
    .line 287
    .line 288
    move-result-object v37

    .line 289
    shl-int/lit8 v9, v2, 0xf

    .line 290
    .line 291
    and-int/2addr v4, v9

    .line 292
    shl-int/lit8 v9, v2, 0x12

    .line 293
    .line 294
    and-int v9, v9, v17

    .line 295
    .line 296
    or-int v39, v4, v9

    .line 297
    .line 298
    const/16 v27, 0x0

    .line 299
    .line 300
    iget v4, v0, La/yw8;->b:F

    .line 301
    .line 302
    iget v9, v0, La/yw8;->c:F

    .line 303
    .line 304
    iget-object v0, v0, La/yw8;->d:Lkotlin/jvm/functions/Function1;

    .line 305
    .line 306
    move-object/from16 v36, v0

    .line 307
    .line 308
    move-object/from16 v32, v1

    .line 309
    .line 310
    move/from16 v35, v3

    .line 311
    .line 312
    move/from16 v33, v4

    .line 313
    .line 314
    move-object/from16 v28, v5

    .line 315
    .line 316
    move-object/from16 v29, v6

    .line 317
    .line 318
    move-object/from16 v30, v7

    .line 319
    .line 320
    move-object/from16 v31, v8

    .line 321
    .line 322
    move/from16 v34, v9

    .line 323
    .line 324
    move-object/from16 v38, v14

    .line 325
    .line 326
    invoke-static/range {v27 .. v39}, La/xf0;->f(La/mm40;Ljava/lang/String;La/imm;La/imm;La/vu8;La/l7m0;FFFLkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 327
    .line 328
    .line 329
    move-object/from16 v0, v32

    .line 330
    .line 331
    move-object/from16 v1, v38

    .line 332
    .line 333
    if-eqz v12, :cond_c

    .line 334
    .line 335
    const v3, 0x7f040ae3

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_c
    const v3, 0x7f040b5d

    .line 340
    .line 341
    .line 342
    :goto_6
    and-int/lit8 v2, v2, 0xe

    .line 343
    .line 344
    invoke-static {v0, v3, v1, v2}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 345
    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_d
    move-object v1, v14

    .line 349
    invoke-virtual {v1}, La/fet;->X()V

    .line 350
    .line 351
    .line 352
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
