.class public final synthetic La/xq40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/vz2;ZI)V
    .locals 0

    .line 1
    const/4 p4, 0x2

    iput-byte p4, p0, La/xq40;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/xq40;->b:F

    iput-object p2, p0, La/xq40;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/xq40;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(FZLkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/xq40;->a:B

    iput p1, p0, La/xq40;->b:F

    iput-boolean p2, p0, La/xq40;->c:Z

    iput-object p3, p0, La/xq40;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xq40;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-boolean v6, v0, La/xq40;->c:Z

    .line 11
    .line 12
    iget-object v7, v0, La/xq40;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iget v8, v0, La/xq40;->b:F

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, La/vz2;

    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    check-cast v0, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    invoke-static {v1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v8, v7, v6, v0, v1}, La/y0x0;->C(FLa/vz2;ZLa/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, La/fet;

    .line 48
    .line 49
    move-object/from16 v1, p2

    .line 50
    .line 51
    check-cast v1, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    and-int/lit8 v9, v1, 0x3

    .line 58
    .line 59
    if-eq v9, v3, :cond_0

    .line 60
    .line 61
    move v3, v5

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v3, v4

    .line 64
    :goto_0
    and-int/2addr v1, v5

    .line 65
    invoke-virtual {v0, v1, v3}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_9

    .line 70
    .line 71
    sget-object v1, La/uc9;->c:La/mw3;

    .line 72
    .line 73
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 74
    .line 75
    invoke-static {v1, v3, v0, v4}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-wide v9, v0, La/fet;->T:J

    .line 80
    .line 81
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-static {v0, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 94
    .line 95
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, La/fet;->i0()V

    .line 99
    .line 100
    .line 101
    iget-boolean v11, v0, La/fet;->S:Z

    .line 102
    .line 103
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 104
    .line 105
    if-eqz v11, :cond_1

    .line 106
    .line 107
    invoke-virtual {v0, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-virtual {v0}, La/fet;->r0()V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object v11, La/gqw0;->x:La/shd;

    .line 115
    .line 116
    invoke-static {v0, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    sget-object v1, La/gqw0;->w:La/shd;

    .line 120
    .line 121
    invoke-static {v0, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v9, La/gqw0;->y:La/shd;

    .line 129
    .line 130
    invoke-static {v0, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 134
    .line 135
    .line 136
    sget-object v3, La/gqw0;->v:La/shd;

    .line 137
    .line 138
    invoke-static {v0, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    if-eqz v6, :cond_2

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_2
    const/4 v10, 0x0

    .line 149
    :goto_2
    if-eqz v10, :cond_3

    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    goto :goto_3

    .line 156
    :cond_3
    const/high16 v10, 0x3f800000    # 1.0f

    .line 157
    .line 158
    :goto_3
    invoke-static {v10, v0, v4}, La/lv00;->k(FLa/fet;I)V

    .line 159
    .line 160
    .line 161
    sget-object v10, La/gqw0;->a:La/zx7;

    .line 162
    .line 163
    invoke-static {v10, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    const/high16 p1, 0x3f800000    # 1.0f

    .line 168
    .line 169
    iget-wide v13, v0, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-static {v0, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-virtual {v0}, La/fet;->i0()V

    .line 184
    .line 185
    .line 186
    iget-boolean v5, v0, La/fet;->S:Z

    .line 187
    .line 188
    if-eqz v5, :cond_4

    .line 189
    .line 190
    invoke-virtual {v0, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_4
    invoke-virtual {v0}, La/fet;->r0()V

    .line 195
    .line 196
    .line 197
    :goto_4
    invoke-static {v0, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v14, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v13, v0, v9, v0}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v15, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eqz v6, :cond_5

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_5
    const/4 v1, 0x0

    .line 217
    :goto_5
    if-eqz v1, :cond_6

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    goto :goto_6

    .line 224
    :cond_6
    move/from16 v1, p1

    .line 225
    .line 226
    :goto_6
    invoke-static {v2, v1}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const v3, 0x7f130de1

    .line 231
    .line 232
    .line 233
    invoke-static {v3, v0}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-static {v1, v3, v7, v0, v4}, La/lv00;->r(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 238
    .line 239
    .line 240
    sub-float v14, p1, v8

    .line 241
    .line 242
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    if-eqz v6, :cond_7

    .line 247
    .line 248
    move-object v13, v1

    .line 249
    goto :goto_7

    .line 250
    :cond_7
    const/4 v13, 0x0

    .line 251
    :goto_7
    if-eqz v13, :cond_8

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    goto :goto_8

    .line 258
    :cond_8
    const/4 v1, 0x0

    .line 259
    :goto_8
    invoke-static {v2, v1}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v4, v0, v1, v7}, La/lv00;->D(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 264
    .line 265
    .line 266
    const/4 v1, 0x1

    .line 267
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_9
    invoke-virtual {v0}, La/fet;->X()V

    .line 275
    .line 276
    .line 277
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_1
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 281
    .line 282
    move-object/from16 v1, p1

    .line 283
    .line 284
    check-cast v1, La/fet;

    .line 285
    .line 286
    move-object/from16 v5, p2

    .line 287
    .line 288
    check-cast v5, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    and-int/lit8 v6, v5, 0x3

    .line 295
    .line 296
    if-eq v6, v3, :cond_a

    .line 297
    .line 298
    const/4 v4, 0x1

    .line 299
    :cond_a
    const/16 v16, 0x1

    .line 300
    .line 301
    and-int/lit8 v3, v5, 0x1

    .line 302
    .line 303
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-eqz v3, :cond_b

    .line 308
    .line 309
    invoke-static {v2, v8}, La/a8k0;->I(La/mm40;F)La/mm40;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    sget-object v10, La/oe9;->c:La/oe9;

    .line 314
    .line 315
    new-instance v11, La/te9;

    .line 316
    .line 317
    const v3, 0x7f080819

    .line 318
    .line 319
    .line 320
    invoke-direct {v11, v3}, La/te9;-><init>(I)V

    .line 321
    .line 322
    .line 323
    sget-object v9, La/qul;->e:La/qul;

    .line 324
    .line 325
    new-instance v8, La/wul;

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const/4 v14, 0x0

    .line 329
    iget-boolean v12, v0, La/xq40;->c:Z

    .line 330
    .line 331
    invoke-direct/range {v8 .. v14}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 332
    .line 333
    .line 334
    const/4 v5, 0x0

    .line 335
    const/4 v6, 0x0

    .line 336
    move-object v4, v1

    .line 337
    move-object v1, v2

    .line 338
    move-object v3, v7

    .line 339
    move-object v2, v8

    .line 340
    invoke-static/range {v1 .. v6}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 341
    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_b
    move-object v4, v1

    .line 345
    invoke-virtual {v4}, La/fet;->X()V

    .line 346
    .line 347
    .line 348
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
