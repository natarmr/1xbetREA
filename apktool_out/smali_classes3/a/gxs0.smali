.class public final synthetic La/gxs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o580;


# direct methods
.method public synthetic constructor <init>(La/o580;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gxs0;->a:B

    iput-object p1, p0, La/gxs0;->b:La/o580;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gxs0;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 10
    .line 11
    const/16 v5, 0x30

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    iget-object v0, v0, La/gxs0;->b:La/o580;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v15, p1

    .line 24
    .line 25
    check-cast v15, La/fet;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    if-eq v2, v7, :cond_0

    .line 38
    .line 39
    move v10, v9

    .line 40
    :cond_0
    and-int/2addr v1, v9

    .line 41
    invoke-virtual {v15, v1, v10}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 48
    .line 49
    sget-object v2, La/uc9;->a:La/lw3;

    .line 50
    .line 51
    invoke-static {v2, v1, v15, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-wide v10, v15, La/fet;->T:J

    .line 56
    .line 57
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v7, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    invoke-static {v15, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v15}, La/fet;->i0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v11, v15, La/fet;->S:Z

    .line 80
    .line 81
    if-eqz v11, :cond_1

    .line 82
    .line 83
    invoke-virtual {v15, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v15}, La/fet;->r0()V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object v4, La/gqw0;->x:La/shd;

    .line 91
    .line 92
    invoke-static {v15, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, La/gqw0;->w:La/shd;

    .line 96
    .line 97
    invoke-static {v15, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, La/gqw0;->y:La/shd;

    .line 105
    .line 106
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/gqw0;->v:La/shd;

    .line 113
    .line 114
    invoke-static {v15, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v7, v6, v8}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iget-object v2, v0, La/o580;->e:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v4, v0, La/o580;->f:Ljava/lang/String;

    .line 124
    .line 125
    const/4 v5, 0x6

    .line 126
    invoke-static {v5, v15, v1, v2, v4}, La/qim0;->b(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, La/qmk;->a:La/zcl;

    .line 130
    .line 131
    const/16 v20, 0x0

    .line 132
    .line 133
    const/16 v21, 0xe

    .line 134
    .line 135
    const/high16 v17, 0x41000000    # 8.0f

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    move-object/from16 v16, v7

    .line 142
    .line 143
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v3, v1, v9}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    iget-object v12, v0, La/o580;->b:Ljava/lang/String;

    .line 152
    .line 153
    sget-object v13, La/gqw0;->d:La/zx7;

    .line 154
    .line 155
    const/16 v16, 0x180

    .line 156
    .line 157
    const/16 v17, 0x8

    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    invoke-static/range {v11 .. v17}, La/hxm0;->h(La/mm40;Ljava/lang/String;La/zx7;ILa/fet;II)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v15, v9}, La/fet;->r(Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    invoke-virtual {v15}, La/fet;->X()V

    .line 168
    .line 169
    .line 170
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_0
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/fet;

    .line 176
    .line 177
    move-object/from16 v3, p2

    .line 178
    .line 179
    check-cast v3, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    and-int/lit8 v4, v3, 0x3

    .line 186
    .line 187
    if-eq v4, v7, :cond_3

    .line 188
    .line 189
    move v4, v9

    .line 190
    goto :goto_2

    .line 191
    :cond_3
    move v4, v10

    .line 192
    :goto_2
    and-int/2addr v3, v9

    .line 193
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_4

    .line 198
    .line 199
    sget-object v3, La/qmk;->a:La/zcl;

    .line 200
    .line 201
    const/high16 v3, 0x41000000    # 8.0f

    .line 202
    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-static {v2, v3, v4, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v0, v0, La/o580;->g:La/lpm;

    .line 209
    .line 210
    invoke-static {v2, v0, v1, v10}, La/qim0;->c(La/mm40;La/lpm;La/fet;I)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 215
    .line 216
    .line 217
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_1
    move-object/from16 v15, p1

    .line 221
    .line 222
    check-cast v15, La/fet;

    .line 223
    .line 224
    move-object/from16 v1, p2

    .line 225
    .line 226
    check-cast v1, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    and-int/lit8 v11, v1, 0x3

    .line 233
    .line 234
    if-eq v11, v7, :cond_5

    .line 235
    .line 236
    move v7, v9

    .line 237
    goto :goto_4

    .line 238
    :cond_5
    move v7, v10

    .line 239
    :goto_4
    and-int/2addr v1, v9

    .line 240
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_7

    .line 245
    .line 246
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 247
    .line 248
    sget-object v7, La/uc9;->a:La/lw3;

    .line 249
    .line 250
    invoke-static {v7, v1, v15, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-wide v11, v15, La/fet;->T:J

    .line 255
    .line 256
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-static {v15, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 269
    .line 270
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v15}, La/fet;->i0()V

    .line 274
    .line 275
    .line 276
    iget-boolean v12, v15, La/fet;->S:Z

    .line 277
    .line 278
    if-eqz v12, :cond_6

    .line 279
    .line 280
    invoke-virtual {v15, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_6
    invoke-virtual {v15}, La/fet;->r0()V

    .line 285
    .line 286
    .line 287
    :goto_5
    sget-object v4, La/gqw0;->x:La/shd;

    .line 288
    .line 289
    invoke-static {v15, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    sget-object v1, La/gqw0;->w:La/shd;

    .line 293
    .line 294
    invoke-static {v15, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    sget-object v4, La/gqw0;->y:La/shd;

    .line 302
    .line 303
    invoke-static {v15, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 307
    .line 308
    .line 309
    sget-object v1, La/gqw0;->v:La/shd;

    .line 310
    .line 311
    invoke-static {v15, v11, v1, v3, v9}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    iget-object v12, v0, La/o580;->a:Ljava/lang/String;

    .line 316
    .line 317
    sget-object v13, La/gqw0;->f:La/zx7;

    .line 318
    .line 319
    const/16 v16, 0x180

    .line 320
    .line 321
    const/16 v17, 0x8

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    invoke-static/range {v11 .. v17}, La/hxm0;->h(La/mm40;Ljava/lang/String;La/zx7;ILa/fet;II)V

    .line 325
    .line 326
    .line 327
    invoke-static {v2, v6, v8}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 328
    .line 329
    .line 330
    move-result-object v16

    .line 331
    sget-object v1, La/qmk;->a:La/zcl;

    .line 332
    .line 333
    const/16 v20, 0x0

    .line 334
    .line 335
    const/16 v21, 0xe

    .line 336
    .line 337
    const/high16 v17, 0x41000000    # 8.0f

    .line 338
    .line 339
    const/16 v18, 0x0

    .line 340
    .line 341
    const/16 v19, 0x0

    .line 342
    .line 343
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v2, v0, La/o580;->c:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v0, v0, La/o580;->d:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v10, v15, v1, v2, v0}, La/qim0;->b(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v15, v9}, La/fet;->r(Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_7
    invoke-virtual {v15}, La/fet;->X()V

    .line 359
    .line 360
    .line 361
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
