.class public final synthetic La/dh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(JLa/mn20;JLa/l1g;La/j1g;JB)V
    .locals 0

    .line 2
    iput-byte p10, p0, La/dh20;->a:B

    iput-wide p1, p0, La/dh20;->b:J

    iput-object p3, p0, La/dh20;->c:Ljava/lang/Object;

    iput-wide p4, p0, La/dh20;->d:J

    iput-object p6, p0, La/dh20;->e:Ljava/lang/Object;

    iput-object p7, p0, La/dh20;->f:Ljava/lang/Object;

    iput-wide p8, p0, La/dh20;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/iil0;La/l7m0;La/l7m0;JJJ)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/dh20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dh20;->c:Ljava/lang/Object;

    iput-object p2, p0, La/dh20;->e:Ljava/lang/Object;

    iput-object p3, p0, La/dh20;->f:Ljava/lang/Object;

    iput-wide p4, p0, La/dh20;->b:J

    iput-wide p6, p0, La/dh20;->d:J

    iput-wide p8, p0, La/dh20;->g:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dh20;->a:B

    .line 4
    .line 5
    iget-wide v2, v0, La/dh20;->g:J

    .line 6
    .line 7
    iget-wide v4, v0, La/dh20;->d:J

    .line 8
    .line 9
    iget-wide v6, v0, La/dh20;->b:J

    .line 10
    .line 11
    iget-object v8, v0, La/dh20;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v9, v0, La/dh20;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v10, v0, La/dh20;->c:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v10, La/iil0;

    .line 21
    .line 22
    check-cast v9, La/l7m0;

    .line 23
    .line 24
    check-cast v8, La/l7m0;

    .line 25
    .line 26
    iget-wide v12, v0, La/dh20;->g:J

    .line 27
    .line 28
    move-object/from16 v14, p1

    .line 29
    .line 30
    check-cast v14, La/fhl;

    .line 31
    .line 32
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget v0, v10, La/iil0;->a:F

    .line 36
    .line 37
    invoke-interface {v14, v0}, La/w6k;->w0(F)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v1, v10, La/iil0;->b:F

    .line 42
    .line 43
    invoke-interface {v14, v1}, La/w6k;->w0(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget v2, v10, La/iil0;->c:F

    .line 48
    .line 49
    invoke-interface {v14, v2}, La/w6k;->w0(F)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget v3, v10, La/iil0;->d:F

    .line 54
    .line 55
    invoke-interface {v14, v3}, La/w6k;->w0(F)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {}, La/z03;->a()La/w03;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-interface {v14}, La/fhl;->d()J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    const/16 v21, 0x20

    .line 68
    .line 69
    shr-long v10, v10, v21

    .line 70
    .line 71
    long-to-int v10, v10

    .line 72
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v25

    .line 76
    invoke-interface {v14}, La/fhl;->d()J

    .line 77
    .line 78
    .line 79
    move-result-wide v10

    .line 80
    const-wide v35, 0xffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long v10, v10, v35

    .line 86
    .line 87
    long-to-int v10, v10

    .line 88
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v26

    .line 92
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    int-to-long v10, v10

    .line 97
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    move/from16 p0, v1

    .line 102
    .line 103
    int-to-long v0, v0

    .line 104
    shl-long v10, v10, v21

    .line 105
    .line 106
    and-long v0, v0, v35

    .line 107
    .line 108
    or-long v27, v10, v0

    .line 109
    .line 110
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    int-to-long v0, v0

    .line 115
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    int-to-long v10, v10

    .line 120
    shl-long v0, v0, v21

    .line 121
    .line 122
    and-long v10, v10, v35

    .line 123
    .line 124
    or-long v29, v0, v10

    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    int-to-long v0, v0

    .line 131
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    int-to-long v10, v2

    .line 136
    shl-long v0, v0, v21

    .line 137
    .line 138
    and-long v10, v10, v35

    .line 139
    .line 140
    or-long v31, v0, v10

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    int-to-long v0, v0

    .line 147
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v2, v2

    .line 152
    shl-long v0, v0, v21

    .line 153
    .line 154
    and-long v2, v2, v35

    .line 155
    .line 156
    or-long v33, v0, v2

    .line 157
    .line 158
    new-instance v22, La/wfg0;

    .line 159
    .line 160
    const/16 v23, 0x0

    .line 161
    .line 162
    const/16 v24, 0x0

    .line 163
    .line 164
    invoke-direct/range {v22 .. v34}, La/wfg0;-><init>(FFFFJJJJ)V

    .line 165
    .line 166
    .line 167
    move-object/from16 v0, v22

    .line 168
    .line 169
    invoke-static {v15, v0}, La/w03;->b(La/w03;La/wfg0;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_0

    .line 183
    .line 184
    move-wide/from16 v16, v4

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_0
    move-wide/from16 v16, v6

    .line 188
    .line 189
    :goto_0
    const/16 v19, 0x0

    .line 190
    .line 191
    const/16 v20, 0x3c

    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    invoke-static/range {v14 .. v20}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_1

    .line 209
    .line 210
    sget-object v0, La/qmk;->a:La/zcl;

    .line 211
    .line 212
    const/high16 v0, 0x40000000    # 2.0f

    .line 213
    .line 214
    invoke-interface {v14, v0}, La/w6k;->w0(F)F

    .line 215
    .line 216
    .line 217
    move-result v18

    .line 218
    invoke-interface {v14}, La/fhl;->A0()La/nr;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, La/nr;->p()J

    .line 223
    .line 224
    .line 225
    move-result-wide v2

    .line 226
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-interface {v4}, La/x5a;->l()V

    .line 231
    .line 232
    .line 233
    :try_start_0
    iget-object v4, v1, La/nr;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v4, La/fvt0;

    .line 236
    .line 237
    invoke-virtual {v4, v15}, La/fvt0;->i(La/w03;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v14}, La/fhl;->d()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    and-long v4, v4, v35

    .line 245
    .line 246
    long-to-int v4, v4

    .line 247
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    div-float v0, v18, v0

    .line 252
    .line 253
    sub-float/2addr v4, v0

    .line 254
    const/4 v5, 0x0

    .line 255
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    int-to-long v5, v5

    .line 260
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    int-to-long v7, v4

    .line 265
    shl-long v4, v5, v21

    .line 266
    .line 267
    and-long v6, v7, v35

    .line 268
    .line 269
    or-long/2addr v4, v6

    .line 270
    invoke-interface {v14}, La/fhl;->d()J

    .line 271
    .line 272
    .line 273
    move-result-wide v6

    .line 274
    shr-long v6, v6, v21

    .line 275
    .line 276
    long-to-int v6, v6

    .line 277
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    invoke-interface {v14}, La/fhl;->d()J

    .line 282
    .line 283
    .line 284
    move-result-wide v7

    .line 285
    and-long v7, v7, v35

    .line 286
    .line 287
    long-to-int v7, v7

    .line 288
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    sub-float/2addr v7, v0

    .line 293
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    int-to-long v8, v0

    .line 298
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    int-to-long v6, v0

    .line 303
    shl-long v8, v8, v21

    .line 304
    .line 305
    and-long v6, v6, v35

    .line 306
    .line 307
    or-long v16, v8, v6

    .line 308
    .line 309
    const/16 v20, 0x0

    .line 310
    .line 311
    const/16 v21, 0x1f0

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    move-object v11, v14

    .line 316
    move-wide v14, v4

    .line 317
    invoke-static/range {v11 .. v21}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    .line 319
    .line 320
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :catchall_0
    move-exception v0

    .line 325
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 326
    .line 327
    .line 328
    throw v0

    .line 329
    :cond_1
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_0
    check-cast v10, La/mn20;

    .line 333
    .line 334
    check-cast v9, La/l1g;

    .line 335
    .line 336
    check-cast v8, La/j1g;

    .line 337
    .line 338
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, La/n1g;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {v0, v1}, La/n1g;->b(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    iget-object v1, v10, La/mn20;->h:La/ms2;

    .line 353
    .line 354
    invoke-virtual {v0, v1}, La/n1g;->a(La/ms2;)V

    .line 355
    .line 356
    .line 357
    iput-wide v4, v0, La/n1g;->c:J

    .line 358
    .line 359
    invoke-virtual {v0, v9}, La/n1g;->c(La/l1g;)V

    .line 360
    .line 361
    .line 362
    iput-object v8, v0, La/n1g;->d:La/j1g;

    .line 363
    .line 364
    iput-wide v2, v0, La/n1g;->b:J

    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_1
    check-cast v10, La/mn20;

    .line 370
    .line 371
    check-cast v9, La/l1g;

    .line 372
    .line 373
    check-cast v8, La/j1g;

    .line 374
    .line 375
    move-object/from16 v0, p1

    .line 376
    .line 377
    check-cast v0, La/n1g;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-virtual {v0, v1}, La/n1g;->b(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v10, La/mn20;->h:La/ms2;

    .line 390
    .line 391
    invoke-virtual {v0, v1}, La/n1g;->a(La/ms2;)V

    .line 392
    .line 393
    .line 394
    iput-wide v4, v0, La/n1g;->c:J

    .line 395
    .line 396
    invoke-virtual {v0, v9}, La/n1g;->c(La/l1g;)V

    .line 397
    .line 398
    .line 399
    iput-object v8, v0, La/n1g;->d:La/j1g;

    .line 400
    .line 401
    iput-wide v2, v0, La/n1g;->b:J

    .line 402
    .line 403
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object v0

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
