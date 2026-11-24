.class public final La/dlb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLjava/lang/Float;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/dlb;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/dlb;->b:F

    .line 8
    .line 9
    iput-object p2, p0, La/dlb;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/cms0;F)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/dlb;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dlb;->c:Ljava/lang/Object;

    iput p2, p0, La/dlb;->b:F

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, La/dlb;->a:B

    .line 8
    .line 9
    iget-object v4, v0, La/dlb;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, v0, La/dlb;->b:F

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v3, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    const/16 v5, 0xd

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static {v6, v3, v6, v6, v5}, La/r4e;->b(IIIII)J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, La/pj30;

    .line 39
    .line 40
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/4 v9, 0x1

    .line 45
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    check-cast v9, La/pj30;

    .line 50
    .line 51
    invoke-interface {v9, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const/4 v10, 0x3

    .line 56
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    check-cast v10, La/pj30;

    .line 61
    .line 62
    invoke-interface {v10, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v7, v5, La/pu90;->b:I

    .line 71
    .line 72
    add-int/2addr v0, v7

    .line 73
    check-cast v4, Ljava/lang/Float;

    .line 74
    .line 75
    const/4 v7, 0x2

    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-static {v4}, La/si30;->b(F)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    iget v8, v9, La/pu90;->b:I

    .line 87
    .line 88
    div-int/2addr v8, v7

    .line 89
    sub-int/2addr v4, v8

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    iget v4, v9, La/pu90;->b:I

    .line 92
    .line 93
    sub-int v4, v11, v4

    .line 94
    .line 95
    div-int/2addr v4, v7

    .line 96
    :goto_0
    if-ge v4, v0, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move v0, v4

    .line 100
    :goto_1
    iget v4, v10, La/pu90;->b:I

    .line 101
    .line 102
    sub-int v4, v11, v4

    .line 103
    .line 104
    sget-object v8, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    const/high16 v8, 0x41400000    # 12.0f

    .line 107
    .line 108
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    sub-int/2addr v4, v8

    .line 113
    sub-int/2addr v4, v0

    .line 114
    iget v8, v9, La/pu90;->b:I

    .line 115
    .line 116
    sub-int/2addr v4, v8

    .line 117
    if-gez v4, :cond_2

    .line 118
    .line 119
    move v4, v6

    .line 120
    :cond_2
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, La/pj30;

    .line 125
    .line 126
    const/4 v7, 0x5

    .line 127
    invoke-static {v6, v3, v6, v4, v7}, La/r4e;->b(IIIII)J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    invoke-interface {v2, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    move-object v6, v5

    .line 136
    new-instance v5, La/jm10;

    .line 137
    .line 138
    move v7, v0

    .line 139
    move-object v8, v9

    .line 140
    move-object v9, v2

    .line 141
    invoke-direct/range {v5 .. v11}, La/jm10;-><init>(La/pu90;ILa/pu90;La/pu90;La/pu90;I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v3, v11, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :pswitch_0
    check-cast v4, La/l7m0;

    .line 150
    .line 151
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, La/ycl;

    .line 156
    .line 157
    iget v3, v3, La/ycl;->a:F

    .line 158
    .line 159
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    add-int v11, v0, v6

    .line 168
    .line 169
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/4 v4, 0x0

    .line 178
    if-eqz v3, :cond_4

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    move-object v5, v3

    .line 185
    check-cast v5, La/pj30;

    .line 186
    .line 187
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    sget-object v7, La/kwq0;->a:La/kwq0;

    .line 192
    .line 193
    if-ne v5, v7, :cond_3

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_4
    move-object v3, v4

    .line 197
    :goto_2
    check-cast v3, La/pj30;

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_6

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    move-object v7, v5

    .line 214
    check-cast v7, La/pj30;

    .line 215
    .line 216
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    sget-object v8, La/kwq0;->b:La/kwq0;

    .line 221
    .line 222
    if-ne v7, v8, :cond_5

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    move-object v5, v4

    .line 226
    :goto_3
    check-cast v5, La/pj30;

    .line 227
    .line 228
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_8

    .line 237
    .line 238
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    move-object v8, v7

    .line 243
    check-cast v8, La/pj30;

    .line 244
    .line 245
    invoke-static {v8}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    sget-object v9, La/kwq0;->c:La/kwq0;

    .line 250
    .line 251
    if-ne v8, v9, :cond_7

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_8
    move-object v7, v4

    .line 255
    :goto_4
    move-object v0, v7

    .line 256
    check-cast v0, La/pj30;

    .line 257
    .line 258
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-eqz v7, :cond_a

    .line 267
    .line 268
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    move-object v8, v7

    .line 273
    check-cast v8, La/pj30;

    .line 274
    .line 275
    invoke-static {v8}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    sget-object v9, La/kwq0;->d:La/kwq0;

    .line 280
    .line 281
    if-ne v8, v9, :cond_9

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_a
    move-object v7, v4

    .line 285
    :goto_5
    move-object v2, v7

    .line 286
    check-cast v2, La/pj30;

    .line 287
    .line 288
    if-eqz v3, :cond_b

    .line 289
    .line 290
    const/4 v10, 0x0

    .line 291
    const/4 v13, 0x3

    .line 292
    const/4 v9, 0x0

    .line 293
    move v12, v11

    .line 294
    move-wide/from16 v7, p3

    .line 295
    .line 296
    invoke-static/range {v7 .. v13}, La/p4e;->b(JIIIII)J

    .line 297
    .line 298
    .line 299
    move-result-wide v9

    .line 300
    invoke-interface {v3, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    goto :goto_6

    .line 305
    :cond_b
    move-object v3, v4

    .line 306
    :goto_6
    if-eqz v5, :cond_c

    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    const/4 v13, 0x3

    .line 310
    const/4 v9, 0x0

    .line 311
    move v12, v11

    .line 312
    move-wide/from16 v7, p3

    .line 313
    .line 314
    invoke-static/range {v7 .. v13}, La/p4e;->b(JIIIII)J

    .line 315
    .line 316
    .line 317
    move-result-wide v9

    .line 318
    invoke-interface {v5, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    move-object v8, v5

    .line 323
    goto :goto_7

    .line 324
    :cond_c
    move-object v8, v4

    .line 325
    :goto_7
    move-wide/from16 v12, p3

    .line 326
    .line 327
    if-eqz v0, :cond_d

    .line 328
    .line 329
    invoke-interface {v0, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    move-object v9, v0

    .line 334
    goto :goto_8

    .line 335
    :cond_d
    move-object v9, v4

    .line 336
    :goto_8
    if-eqz v2, :cond_e

    .line 337
    .line 338
    sget-object v0, La/qmk;->a:La/zcl;

    .line 339
    .line 340
    const/high16 v0, 0x43700000    # 240.0f

    .line 341
    .line 342
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 343
    .line 344
    .line 345
    move-result v17

    .line 346
    const/16 v18, 0x3

    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 353
    .line 354
    .line 355
    move-result-wide v4

    .line 356
    invoke-interface {v2, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    :cond_e
    move-object v10, v4

    .line 361
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    new-instance v4, La/kc0;

    .line 366
    .line 367
    const/4 v5, 0x1

    .line 368
    move-object v7, v3

    .line 369
    invoke-direct/range {v4 .. v10}, La/kc0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v1, v0, v11, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    return-object v0

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
