.class public final synthetic La/h7m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/h7m;->a:B

    iput p1, p0, La/h7m;->b:F

    iput-object p2, p0, La/h7m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/q7m;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/h7m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h7m;->c:Ljava/lang/Object;

    iput p2, p0, La/h7m;->b:F

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h7m;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, La/h7m;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, v0, La/h7m;->b:F

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, La/f3d;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/w03;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, La/h7k0;

    .line 27
    .line 28
    move-object/from16 v3, p3

    .line 29
    .line 30
    check-cast v3, La/k6z;

    .line 31
    .line 32
    sget-object v5, La/fpk0;->V1:La/zie0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, La/f3d;->d()F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-float/2addr v4, v3

    .line 45
    mul-float/2addr v4, v0

    .line 46
    const-wide/16 v5, 0x0

    .line 47
    .line 48
    iget-wide v2, v2, La/h7k0;->a:J

    .line 49
    .line 50
    invoke-static {v5, v6, v2, v3}, La/k9x;->r(JJ)La/jge0;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-long v2, v0

    .line 59
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v5, v0

    .line 64
    const/16 v0, 0x20

    .line 65
    .line 66
    shl-long/2addr v2, v0

    .line 67
    const-wide v8, 0xffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v5, v8

    .line 73
    or-long/2addr v2, v5

    .line 74
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    int-to-long v5, v5

    .line 79
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    int-to-long v10, v4

    .line 84
    shl-long v4, v5, v0

    .line 85
    .line 86
    and-long/2addr v8, v10

    .line 87
    or-long v10, v4, v8

    .line 88
    .line 89
    const-wide/16 v12, 0x0

    .line 90
    .line 91
    const-wide/16 v14, 0x0

    .line 92
    .line 93
    move-wide v8, v2

    .line 94
    invoke-static/range {v7 .. v15}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v1, v0}, La/w03;->b(La/w03;La/wfg0;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_0
    check-cast v6, La/kec0;

    .line 105
    .line 106
    move-object/from16 v1, p1

    .line 107
    .line 108
    check-cast v1, La/g9z;

    .line 109
    .line 110
    move-object/from16 v11, p2

    .line 111
    .line 112
    check-cast v11, La/fet;

    .line 113
    .line 114
    move-object/from16 v7, p3

    .line 115
    .line 116
    check-cast v7, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    and-int/lit8 v1, v7, 0x11

    .line 126
    .line 127
    if-eq v1, v2, :cond_0

    .line 128
    .line 129
    move v1, v3

    .line 130
    goto :goto_0

    .line 131
    :cond_0
    move v1, v5

    .line 132
    :goto_0
    and-int/lit8 v2, v7, 0x1

    .line 133
    .line 134
    invoke-virtual {v11, v2, v1}, La/fet;->U(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    sget-object v1, La/jm40;->b:La/jm40;

    .line 141
    .line 142
    invoke-static {v1, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    sget-object v1, La/qmk;->a:La/zcl;

    .line 147
    .line 148
    const/high16 v1, 0x41400000    # 12.0f

    .line 149
    .line 150
    add-float v13, v0, v1

    .line 151
    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    const/16 v17, 0x8

    .line 155
    .line 156
    const/high16 v14, 0x42200000    # 40.0f

    .line 157
    .line 158
    move v15, v13

    .line 159
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 164
    .line 165
    invoke-static {v1, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iget-wide v4, v11, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11}, La/fet;->i0()V

    .line 189
    .line 190
    .line 191
    iget-boolean v5, v11, La/fet;->S:Z

    .line 192
    .line 193
    if-eqz v5, :cond_1

    .line 194
    .line 195
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 196
    .line 197
    invoke-virtual {v11, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_1
    invoke-virtual {v11}, La/fet;->r0()V

    .line 202
    .line 203
    .line 204
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 205
    .line 206
    invoke-static {v11, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object v1, La/gqw0;->w:La/shd;

    .line 210
    .line 211
    invoke-static {v11, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    sget-object v2, La/gqw0;->y:La/shd;

    .line 219
    .line 220
    invoke-static {v11, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 224
    .line 225
    .line 226
    sget-object v1, La/gqw0;->v:La/shd;

    .line 227
    .line 228
    invoke-static {v11, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    iget-object v8, v6, La/kec0;->d:La/mdm;

    .line 232
    .line 233
    const/16 v12, 0x180

    .line 234
    .line 235
    const/16 v13, 0x9

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/4 v9, 0x1

    .line 239
    const/4 v10, 0x0

    .line 240
    invoke-static/range {v7 .. v13}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_2
    invoke-virtual {v11}, La/fet;->X()V

    .line 248
    .line 249
    .line 250
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_1
    check-cast v6, La/l7m0;

    .line 254
    .line 255
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, La/vj30;

    .line 258
    .line 259
    move-object/from16 v2, p2

    .line 260
    .line 261
    check-cast v2, La/pj30;

    .line 262
    .line 263
    move-object/from16 v3, p3

    .line 264
    .line 265
    check-cast v3, La/p4e;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-wide v7, v3, La/p4e;->a:J

    .line 274
    .line 275
    invoke-static {v7, v8}, La/p4e;->i(J)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    int-to-float v7, v4

    .line 280
    mul-float/2addr v0, v7

    .line 281
    float-to-int v10, v0

    .line 282
    iget-wide v8, v3, La/p4e;->a:J

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    const/16 v14, 0xc

    .line 286
    .line 287
    const/4 v12, 0x0

    .line 288
    move v11, v10

    .line 289
    invoke-static/range {v8 .. v14}, La/p4e;->b(JIIIII)J

    .line 290
    .line 291
    .line 292
    move-result-wide v8

    .line 293
    invoke-interface {v2, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    check-cast v2, Ljava/lang/Number;

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    mul-float/2addr v2, v7

    .line 308
    float-to-int v2, v2

    .line 309
    sub-int/2addr v4, v10

    .line 310
    if-gez v4, :cond_3

    .line 311
    .line 312
    move v4, v5

    .line 313
    :cond_3
    invoke-static {v2, v5, v4}, La/l1e0;->d(III)I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    iget v3, v0, La/pu90;->b:I

    .line 318
    .line 319
    new-instance v4, La/n7;

    .line 320
    .line 321
    const/16 v5, 0xd

    .line 322
    .line 323
    invoke-direct {v4, v0, v2, v5}, La/n7;-><init>(La/pu90;IB)V

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v10, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    return-object v0

    .line 331
    :pswitch_2
    check-cast v6, La/q7m;

    .line 332
    .line 333
    move-object/from16 v1, p1

    .line 334
    .line 335
    check-cast v1, La/g9z;

    .line 336
    .line 337
    move-object/from16 v4, p2

    .line 338
    .line 339
    check-cast v4, La/fet;

    .line 340
    .line 341
    move-object/from16 v7, p3

    .line 342
    .line 343
    check-cast v7, Ljava/lang/Integer;

    .line 344
    .line 345
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    and-int/lit8 v1, v7, 0x11

    .line 353
    .line 354
    if-eq v1, v2, :cond_4

    .line 355
    .line 356
    move v1, v3

    .line 357
    goto :goto_3

    .line 358
    :cond_4
    move v1, v5

    .line 359
    :goto_3
    and-int/lit8 v2, v7, 0x1

    .line 360
    .line 361
    invoke-virtual {v4, v2, v1}, La/fet;->U(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_5

    .line 366
    .line 367
    invoke-static {v6, v0, v4, v5}, La/dub;->Y(La/q7m;FLa/fet;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_5
    invoke-virtual {v4}, La/fet;->X()V

    .line 372
    .line 373
    .line 374
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
