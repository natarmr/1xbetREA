.class public final synthetic La/vsm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/q1n;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/q1n;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vsm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vsm;->b:La/mm40;

    iput-object p2, p0, La/vsm;->c:La/q1n;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/q1n;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/vsm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vsm;->b:La/mm40;

    iput-object p2, p0, La/vsm;->c:La/q1n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vsm;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/vsm;->c:La/q1n;

    .line 7
    .line 8
    iget-object v0, v0, La/vsm;->b:La/mm40;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/fet;

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    check-cast v4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v0, v3, v1, v2}, La/jcb;->m(La/mm40;La/q1n;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v9, p1

    .line 35
    .line 36
    check-cast v9, La/fet;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    and-int/lit8 v4, v1, 0x3

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x2

    .line 50
    if-eq v4, v6, :cond_0

    .line 51
    .line 52
    move v4, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v4, v5

    .line 55
    :goto_0
    and-int/2addr v1, v2

    .line 56
    invoke-virtual {v9, v1, v4}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_7

    .line 61
    .line 62
    const/high16 v1, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v4, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-static {v0, v4, v7, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    const/high16 v14, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/4 v15, 0x7

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v8, La/uc9;->c:La/mw3;

    .line 88
    .line 89
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 90
    .line 91
    invoke-static {v8, v10, v9, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    iget-wide v10, v9, La/fet;->T:J

    .line 96
    .line 97
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-static {v9, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 110
    .line 111
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, La/fet;->i0()V

    .line 115
    .line 116
    .line 117
    iget-boolean v12, v9, La/fet;->S:Z

    .line 118
    .line 119
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    if-eqz v12, :cond_1

    .line 122
    .line 123
    invoke-virtual {v9, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {v9}, La/fet;->r0()V

    .line 128
    .line 129
    .line 130
    :goto_1
    sget-object v12, La/gqw0;->x:La/shd;

    .line 131
    .line 132
    invoke-static {v9, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    sget-object v8, La/gqw0;->w:La/shd;

    .line 136
    .line 137
    invoke-static {v9, v11, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    sget-object v11, La/gqw0;->y:La/shd;

    .line 145
    .line 146
    invoke-static {v9, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 150
    .line 151
    .line 152
    sget-object v10, La/gqw0;->v:La/shd;

    .line 153
    .line 154
    invoke-static {v9, v0, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, La/jm40;->b:La/jm40;

    .line 158
    .line 159
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    const/high16 v15, 0x42580000    # 54.0f

    .line 164
    .line 165
    invoke-static {v14, v15}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    sget-object v15, La/gqw0;->k:La/yx7;

    .line 170
    .line 171
    sget-object v4, La/uc9;->a:La/lw3;

    .line 172
    .line 173
    const/16 v6, 0x30

    .line 174
    .line 175
    invoke-static {v4, v15, v9, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    iget-wide v5, v9, La/fet;->T:J

    .line 180
    .line 181
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-static {v9, v14}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v9}, La/fet;->i0()V

    .line 194
    .line 195
    .line 196
    iget-boolean v15, v9, La/fet;->S:Z

    .line 197
    .line 198
    if-eqz v15, :cond_2

    .line 199
    .line 200
    invoke-virtual {v9, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    invoke-virtual {v9}, La/fet;->r0()V

    .line 205
    .line 206
    .line 207
    :goto_2
    invoke-static {v9, v4, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v9, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v9, v11, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v9, v14, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    const v4, 0x3eb33333    # 0.35f

    .line 220
    .line 221
    .line 222
    float-to-double v5, v4

    .line 223
    const-wide/16 v10, 0x0

    .line 224
    .line 225
    cmpl-double v5, v5, v10

    .line 226
    .line 227
    const-string v6, "invalid weight; must be greater than zero"

    .line 228
    .line 229
    if-lez v5, :cond_3

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_3
    invoke-static {v6}, La/vcx;->a(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_3
    new-instance v5, La/x7z;

    .line 236
    .line 237
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 238
    .line 239
    .line 240
    cmpl-float v12, v4, v8

    .line 241
    .line 242
    if-lez v12, :cond_4

    .line 243
    .line 244
    move v12, v8

    .line 245
    goto :goto_4

    .line 246
    :cond_4
    move v12, v4

    .line 247
    :goto_4
    invoke-direct {v5, v12, v2}, La/x7z;-><init>(FZ)V

    .line 248
    .line 249
    .line 250
    invoke-static {v5, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-object v5, v3, La/q1n;->a:La/w1n;

    .line 255
    .line 256
    iget-object v12, v3, La/q1n;->c:La/t1n;

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    invoke-static {v1, v5, v9, v13}, La/jcb;->y(La/mm40;La/w1n;La/fet;I)V

    .line 260
    .line 261
    .line 262
    const/high16 v1, 0x41000000    # 8.0f

    .line 263
    .line 264
    const/4 v5, 0x2

    .line 265
    invoke-static {v0, v1, v7, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    new-instance v1, La/kpm;

    .line 270
    .line 271
    new-instance v5, La/hpm;

    .line 272
    .line 273
    const-wide/16 v13, 0x0

    .line 274
    .line 275
    const/4 v7, 0x3

    .line 276
    invoke-direct {v5, v13, v14, v7}, La/hpm;-><init>(JI)V

    .line 277
    .line 278
    .line 279
    iget-object v15, v12, La/t1n;->a:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v7, v15}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v15

    .line 285
    iget-object v12, v12, La/t1n;->b:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v7, v12}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    move/from16 p0, v8

    .line 292
    .line 293
    new-instance v8, La/hpm;

    .line 294
    .line 295
    invoke-direct {v8, v13, v14, v7}, La/hpm;-><init>(JI)V

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    invoke-static {v15, v12, v13, v13, v8}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    sget-object v8, La/opm;->a:La/opm;

    .line 304
    .line 305
    invoke-direct {v1, v8, v5, v7}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 306
    .line 307
    .line 308
    iget-boolean v5, v3, La/q1n;->g:Z

    .line 309
    .line 310
    invoke-static {v0, v1, v5, v9, v13}, La/n4c;->l(La/mm40;La/mpm;ZLa/fet;I)V

    .line 311
    .line 312
    .line 313
    float-to-double v0, v4

    .line 314
    cmpl-double v0, v0, v10

    .line 315
    .line 316
    if-lez v0, :cond_5

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_5
    invoke-static {v6}, La/vcx;->a(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :goto_5
    new-instance v0, La/x7z;

    .line 323
    .line 324
    cmpl-float v1, v4, p0

    .line 325
    .line 326
    if-lez v1, :cond_6

    .line 327
    .line 328
    move/from16 v4, p0

    .line 329
    .line 330
    :cond_6
    invoke-direct {v0, v4, v2}, La/x7z;-><init>(FZ)V

    .line 331
    .line 332
    .line 333
    iget-object v1, v3, La/q1n;->b:La/w1n;

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    invoke-static {v0, v1, v9, v13}, La/jcb;->z(La/mm40;La/w1n;La/fet;I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 340
    .line 341
    .line 342
    iget-object v4, v3, La/q1n;->d:La/jwm;

    .line 343
    .line 344
    iget-object v5, v3, La/q1n;->e:La/jwm;

    .line 345
    .line 346
    iget-object v6, v3, La/q1n;->f:La/jwm;

    .line 347
    .line 348
    const/4 v10, 0x0

    .line 349
    const/16 v11, 0x11

    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    const-wide/16 v7, 0x0

    .line 353
    .line 354
    invoke-static/range {v3 .. v11}, La/tlb;->l(La/mm40;La/jwm;La/jwm;La/jwm;JLa/fet;II)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 358
    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_7
    invoke-virtual {v9}, La/fet;->X()V

    .line 362
    .line 363
    .line 364
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
