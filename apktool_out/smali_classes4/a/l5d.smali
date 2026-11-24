.class public final synthetic La/l5d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(FJZFFF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/l5d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/l5d;->c:F

    iput-wide p2, p0, La/l5d;->g:J

    iput-boolean p4, p0, La/l5d;->b:Z

    iput p5, p0, La/l5d;->d:F

    iput p6, p0, La/l5d;->e:F

    iput p7, p0, La/l5d;->f:F

    return-void
.end method

.method public synthetic constructor <init>(ZFFFFJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/l5d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/l5d;->b:Z

    iput p2, p0, La/l5d;->c:F

    iput p3, p0, La/l5d;->d:F

    iput p4, p0, La/l5d;->e:F

    iput p5, p0, La/l5d;->f:F

    iput-wide p6, p0, La/l5d;->g:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l5d;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x40000000    # 2.0f

    .line 6
    .line 7
    const-wide v4, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iget-wide v6, v0, La/l5d;->g:J

    .line 13
    .line 14
    iget v8, v0, La/l5d;->f:F

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget v10, v0, La/l5d;->e:F

    .line 18
    .line 19
    iget v11, v0, La/l5d;->d:F

    .line 20
    .line 21
    iget v12, v0, La/l5d;->c:F

    .line 22
    .line 23
    iget-boolean v0, v0, La/l5d;->b:Z

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/fhl;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    invoke-virtual {v13}, La/nr;->i()La/x5a;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    neg-float v0, v0

    .line 50
    mul-float v15, v0, v2

    .line 51
    .line 52
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    neg-float v0, v0

    .line 57
    mul-float/2addr v0, v2

    .line 58
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    sub-float v16, v0, v13

    .line 63
    .line 64
    invoke-interface {v1}, La/fhl;->d()J

    .line 65
    .line 66
    .line 67
    move-result-wide v17

    .line 68
    move v13, v2

    .line 69
    const/16 v20, 0x20

    .line 70
    .line 71
    shr-long v2, v17, v20

    .line 72
    .line 73
    long-to-int v0, v2

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    mul-float/2addr v2, v13

    .line 83
    add-float v17, v2, v0

    .line 84
    .line 85
    invoke-interface {v1}, La/fhl;->d()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    and-long/2addr v2, v4

    .line 90
    long-to-int v0, v2

    .line 91
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result v18

    .line 95
    const/16 v19, 0x1

    .line 96
    .line 97
    invoke-interface/range {v14 .. v19}, La/x5a;->f(FFFFI)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    const/16 v20, 0x20

    .line 102
    .line 103
    :goto_0
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v2, v0, La/ucs0;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Landroid/graphics/Paint;

    .line 110
    .line 111
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    sub-float v10, v9, v3

    .line 116
    .line 117
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    add-float v15, v13, v10

    .line 122
    .line 123
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    add-float v16, v13, v10

    .line 128
    .line 129
    invoke-interface {v1}, La/fhl;->d()J

    .line 130
    .line 131
    .line 132
    move-result-wide v17

    .line 133
    move-wide/from16 v21, v4

    .line 134
    .line 135
    shr-long v4, v17, v20

    .line 136
    .line 137
    long-to-int v4, v4

    .line 138
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    add-float/2addr v4, v3

    .line 143
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    add-float v17, v5, v4

    .line 148
    .line 149
    invoke-interface {v1}, La/fhl;->d()J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    and-long v4, v4, v21

    .line 154
    .line 155
    long-to-int v4, v4

    .line 156
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    add-float/2addr v4, v3

    .line 161
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    add-float v18, v3, v4

    .line 166
    .line 167
    invoke-static {v8, v9}, La/ycl;->b(FF)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_1

    .line 172
    .line 173
    new-instance v3, Landroid/graphics/BlurMaskFilter;

    .line 174
    .line 175
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    sget-object v5, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 180
    .line 181
    invoke-direct {v3, v4, v5}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 185
    .line 186
    .line 187
    :cond_1
    invoke-static {v6, v7}, La/fbc;->U(J)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 195
    .line 196
    .line 197
    move-result v19

    .line 198
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 199
    .line 200
    .line 201
    move-result v20

    .line 202
    move-object/from16 v21, v0

    .line 203
    .line 204
    invoke-interface/range {v14 .. v21}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_0
    move v13, v2

    .line 211
    move-wide/from16 v21, v4

    .line 212
    .line 213
    const/16 v20, 0x20

    .line 214
    .line 215
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, La/fhl;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    cmpl-float v2, v12, v9

    .line 223
    .line 224
    if-lez v2, :cond_2

    .line 225
    .line 226
    invoke-static {v12, v6, v7}, La/y3d;->c(FJ)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    goto :goto_1

    .line 231
    :cond_2
    move-wide v2, v6

    .line 232
    :goto_1
    invoke-static {v2, v3}, La/fbc;->U(J)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-static {v9, v6, v7}, La/y3d;->c(FJ)J

    .line 237
    .line 238
    .line 239
    move-result-wide v3

    .line 240
    invoke-static {v3, v4}, La/fbc;->U(J)I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    if-eqz v0, :cond_3

    .line 253
    .line 254
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    neg-float v0, v0

    .line 259
    mul-float v15, v0, v13

    .line 260
    .line 261
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    neg-float v0, v0

    .line 266
    mul-float/2addr v0, v13

    .line 267
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    sub-float v16, v0, v4

    .line 272
    .line 273
    invoke-interface {v1}, La/fhl;->d()J

    .line 274
    .line 275
    .line 276
    move-result-wide v4

    .line 277
    shr-long v4, v4, v20

    .line 278
    .line 279
    long-to-int v0, v4

    .line 280
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    mul-float/2addr v4, v13

    .line 289
    add-float v17, v4, v0

    .line 290
    .line 291
    invoke-interface {v1}, La/fhl;->d()J

    .line 292
    .line 293
    .line 294
    move-result-wide v4

    .line 295
    and-long v4, v4, v21

    .line 296
    .line 297
    long-to-int v0, v4

    .line 298
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 299
    .line 300
    .line 301
    move-result v18

    .line 302
    const/16 v19, 0x1

    .line 303
    .line 304
    invoke-interface/range {v14 .. v19}, La/x5a;->f(FFFFI)V

    .line 305
    .line 306
    .line 307
    :cond_3
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iget-object v4, v0, La/ucs0;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v4, Landroid/graphics/Paint;

    .line 314
    .line 315
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    invoke-virtual {v4, v3, v5, v6, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v1}, La/fhl;->d()J

    .line 334
    .line 335
    .line 336
    move-result-wide v2

    .line 337
    shr-long v2, v2, v20

    .line 338
    .line 339
    long-to-int v2, v2

    .line 340
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 341
    .line 342
    .line 343
    move-result v26

    .line 344
    invoke-interface {v1}, La/fhl;->d()J

    .line 345
    .line 346
    .line 347
    move-result-wide v2

    .line 348
    and-long v2, v2, v21

    .line 349
    .line 350
    long-to-int v2, v2

    .line 351
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 352
    .line 353
    .line 354
    move-result v27

    .line 355
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 356
    .line 357
    .line 358
    move-result v28

    .line 359
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 360
    .line 361
    .line 362
    move-result v29

    .line 363
    const/16 v24, 0x0

    .line 364
    .line 365
    const/16 v25, 0x0

    .line 366
    .line 367
    move-object/from16 v30, v0

    .line 368
    .line 369
    move-object/from16 v23, v14

    .line 370
    .line 371
    invoke-interface/range {v23 .. v30}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 372
    .line 373
    .line 374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
