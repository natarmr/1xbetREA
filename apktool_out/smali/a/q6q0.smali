.class public final synthetic La/q6q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/q6q0;->a:B

    iput-object p1, p0, La/q6q0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/q6q0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/q6q0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/q6q0;->e:Ljava/lang/Object;

    iput-object p5, p0, La/q6q0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q6q0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/q6q0;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, La/q6q0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/q6q0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/q6q0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/q6q0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, La/pz40;

    .line 21
    .line 22
    check-cast v7, La/mie0;

    .line 23
    .line 24
    check-cast v6, La/vne;

    .line 25
    .line 26
    check-cast v5, La/t33;

    .line 27
    .line 28
    check-cast v4, La/o6s0;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/ne60;

    .line 33
    .line 34
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/bby;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {v1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-interface {v0, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, La/j6u0;

    .line 49
    .line 50
    invoke-direct {v0}, La/j6u0;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, v7, La/mie0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance v0, La/wbl0;

    .line 56
    .line 57
    const/16 v1, 0xc

    .line 58
    .line 59
    invoke-direct {v0, v5, v4, v3, v1}, La/wbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v6, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    check-cast v0, La/fwf;

    .line 69
    .line 70
    check-cast v7, La/qe60;

    .line 71
    .line 72
    check-cast v6, La/a8q0;

    .line 73
    .line 74
    check-cast v5, La/djz;

    .line 75
    .line 76
    check-cast v4, La/skk0;

    .line 77
    .line 78
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, La/g7z;

    .line 81
    .line 82
    invoke-virtual {v1}, La/g7z;->a()V

    .line 83
    .line 84
    .line 85
    iget-object v8, v1, La/g7z;->a:La/a6a;

    .line 86
    .line 87
    iget-object v0, v0, La/fwf;->c:La/agk0;

    .line 88
    .line 89
    invoke-virtual {v0}, La/agk0;->l()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v9, 0x0

    .line 94
    cmpg-float v10, v0, v9

    .line 95
    .line 96
    if-nez v10, :cond_1

    .line 97
    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :cond_1
    iget-wide v10, v6, La/a8q0;->b:J

    .line 101
    .line 102
    sget v6, La/o9q0;->c:I

    .line 103
    .line 104
    const/16 v6, 0x20

    .line 105
    .line 106
    shr-long/2addr v10, v6

    .line 107
    long-to-int v10, v10

    .line 108
    invoke-interface {v7, v10}, La/qe60;->s(I)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-virtual {v5}, La/djz;->d()La/b9q0;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-eqz v5, :cond_2

    .line 117
    .line 118
    iget-object v5, v5, La/b9q0;->a:La/a9q0;

    .line 119
    .line 120
    invoke-virtual {v5, v7}, La/a9q0;->c(I)La/jge0;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    goto :goto_0

    .line 125
    :cond_2
    new-instance v5, La/jge0;

    .line 126
    .line 127
    invoke-direct {v5, v9, v9, v9, v9}, La/jge0;-><init>(FFFF)V

    .line 128
    .line 129
    .line 130
    :goto_0
    const/high16 v7, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-virtual {v1, v7}, La/g7z;->w0(F)F

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    float-to-double v9, v1

    .line 137
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    .line 138
    .line 139
    .line 140
    move-result-wide v9

    .line 141
    double-to-float v1, v9

    .line 142
    const/high16 v9, 0x3f800000    # 1.0f

    .line 143
    .line 144
    cmpg-float v10, v1, v9

    .line 145
    .line 146
    if-gez v10, :cond_3

    .line 147
    .line 148
    move v1, v9

    .line 149
    :cond_3
    iget v9, v5, La/jge0;->a:F

    .line 150
    .line 151
    div-float v7, v1, v7

    .line 152
    .line 153
    add-float/2addr v9, v7

    .line 154
    invoke-interface {v8}, La/fhl;->d()J

    .line 155
    .line 156
    .line 157
    move-result-wide v10

    .line 158
    shr-long/2addr v10, v6

    .line 159
    long-to-int v10, v10

    .line 160
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    sub-float/2addr v10, v7

    .line 165
    cmpl-float v11, v9, v10

    .line 166
    .line 167
    if-lez v11, :cond_4

    .line 168
    .line 169
    move v9, v10

    .line 170
    :cond_4
    cmpg-float v10, v9, v7

    .line 171
    .line 172
    if-gez v10, :cond_5

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_5
    move v7, v9

    .line 176
    :goto_1
    float-to-int v9, v1

    .line 177
    rem-int/lit8 v9, v9, 0x2

    .line 178
    .line 179
    const/4 v10, 0x1

    .line 180
    if-ne v9, v10, :cond_6

    .line 181
    .line 182
    float-to-double v11, v7

    .line 183
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 184
    .line 185
    .line 186
    move-result-wide v11

    .line 187
    double-to-float v7, v11

    .line 188
    const/high16 v9, 0x3f000000    # 0.5f

    .line 189
    .line 190
    add-float/2addr v7, v9

    .line 191
    goto :goto_2

    .line 192
    :cond_6
    float-to-double v11, v7

    .line 193
    invoke-static {v11, v12}, Ljava/lang/Math;->rint(D)D

    .line 194
    .line 195
    .line 196
    move-result-wide v11

    .line 197
    double-to-float v7, v11

    .line 198
    :goto_2
    iget v9, v5, La/jge0;->b:F

    .line 199
    .line 200
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    int-to-long v11, v11

    .line 205
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    int-to-long v13, v9

    .line 210
    shl-long/2addr v11, v6

    .line 211
    const-wide v15, 0xffffffffL

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    and-long/2addr v13, v15

    .line 217
    or-long v18, v11, v13

    .line 218
    .line 219
    iget v5, v5, La/jge0;->d:F

    .line 220
    .line 221
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    int-to-long v11, v7

    .line 226
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    int-to-long v13, v5

    .line 231
    shl-long v5, v11, v6

    .line 232
    .line 233
    and-long v11, v13, v15

    .line 234
    .line 235
    or-long v20, v5, v11

    .line 236
    .line 237
    iget-object v5, v8, La/a6a;->a:La/z5a;

    .line 238
    .line 239
    iget-object v5, v5, La/z5a;->c:La/x5a;

    .line 240
    .line 241
    iget-object v6, v8, La/a6a;->d:La/ucs0;

    .line 242
    .line 243
    if-nez v6, :cond_7

    .line 244
    .line 245
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6, v10}, La/ucs0;->A(I)V

    .line 250
    .line 251
    .line 252
    iput-object v6, v8, La/a6a;->d:La/ucs0;

    .line 253
    .line 254
    :cond_7
    iget-object v7, v6, La/ucs0;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v7, Landroid/graphics/Paint;

    .line 257
    .line 258
    invoke-interface {v8}, La/fhl;->d()J

    .line 259
    .line 260
    .line 261
    move-result-wide v8

    .line 262
    invoke-virtual {v4, v0, v8, v9, v6}, La/skk0;->a(FJLa/ucs0;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v6, La/ucs0;->e:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/a4d;

    .line 268
    .line 269
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_8

    .line 274
    .line 275
    invoke-virtual {v6, v3}, La/ucs0;->t(La/a4d;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    iget v0, v6, La/ucs0;->b:I

    .line 279
    .line 280
    if-ne v0, v2, :cond_9

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_9
    invoke-virtual {v6, v2}, La/ucs0;->r(I)V

    .line 284
    .line 285
    .line 286
    :goto_3
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    cmpg-float v0, v0, v1

    .line 291
    .line 292
    if-nez v0, :cond_a

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_a
    invoke-virtual {v6, v1}, La/ucs0;->z(F)V

    .line 296
    .line 297
    .line 298
    :goto_4
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    const/high16 v1, 0x40800000    # 4.0f

    .line 303
    .line 304
    cmpg-float v0, v0, v1

    .line 305
    .line 306
    if-nez v0, :cond_b

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_b
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 310
    .line 311
    .line 312
    :goto_5
    invoke-virtual {v6}, La/ucs0;->m()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    const/4 v1, 0x0

    .line 317
    if-nez v0, :cond_c

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_c
    invoke-virtual {v6, v1}, La/ucs0;->x(I)V

    .line 321
    .line 322
    .line 323
    :goto_6
    invoke-virtual {v6}, La/ucs0;->n()I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_d

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_d
    invoke-virtual {v6, v1}, La/ucs0;->y(I)V

    .line 331
    .line 332
    .line 333
    :goto_7
    iget-object v0, v6, La/ucs0;->f:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, La/x03;

    .line 336
    .line 337
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_e

    .line 342
    .line 343
    invoke-virtual {v6, v3}, La/ucs0;->v(La/x03;)V

    .line 344
    .line 345
    .line 346
    :cond_e
    invoke-virtual {v7}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-ne v0, v10, :cond_f

    .line 351
    .line 352
    :goto_8
    move-object/from16 v17, v5

    .line 353
    .line 354
    move-object/from16 v22, v6

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_f
    invoke-virtual {v6, v10}, La/ucs0;->u(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :goto_9
    invoke-interface/range {v17 .. v22}, La/x5a;->b(JJLa/ucs0;)V

    .line 362
    .line 363
    .line 364
    :goto_a
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
