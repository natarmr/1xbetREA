.class public final synthetic La/qbh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/ugd;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/ugd;IIIZLa/pz40;La/ugd;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qbh0;->a:La/ugd;

    iput p2, p0, La/qbh0;->b:I

    iput p3, p0, La/qbh0;->c:I

    iput p4, p0, La/qbh0;->d:I

    iput-boolean p5, p0, La/qbh0;->e:Z

    iput-object p6, p0, La/qbh0;->f:La/pz40;

    iput-object p7, p0, La/qbh0;->g:La/ugd;

    iput p8, p0, La/qbh0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/c5n0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/p4e;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v3, La/vbh0;->a:La/vbh0;

    .line 15
    .line 16
    iget-object v4, v0, La/qbh0;->a:La/ugd;

    .line 17
    .line 18
    invoke-interface {v1, v3, v4}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_d

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, La/pj30;

    .line 37
    .line 38
    const v6, 0x7fffffff

    .line 39
    .line 40
    .line 41
    invoke-interface {v5, v6}, La/pj30;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    :goto_0
    move v11, v5

    .line 46
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, La/pj30;

    .line 57
    .line 58
    invoke-interface {v5, v6}, La/pj30;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-ge v11, v5, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-wide v7, v2, La/p4e;->a:J

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v13, 0x2

    .line 69
    const/4 v9, 0x0

    .line 70
    move v12, v11

    .line 71
    invoke-static/range {v7 .. v13}, La/p4e;->b(JIIIII)J

    .line 72
    .line 73
    .line 74
    move-result-wide v15

    .line 75
    new-instance v5, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    const/4 v4, 0x0

    .line 89
    move v6, v4

    .line 90
    :goto_1
    const/16 v19, 0x1

    .line 91
    .line 92
    if-ge v6, v2, :cond_2

    .line 93
    .line 94
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    move-object v14, v7

    .line 99
    check-cast v14, La/pj30;

    .line 100
    .line 101
    move-object/from16 v17, v5

    .line 102
    .line 103
    move/from16 v18, v6

    .line 104
    .line 105
    invoke-static/range {v14 .. v19}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move/from16 v6, v19

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    move v3, v4

    .line 117
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_3

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, La/pu90;

    .line 128
    .line 129
    iget v7, v7, La/pu90;->a:I

    .line 130
    .line 131
    add-int/2addr v3, v7

    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    sub-int/2addr v2, v6

    .line 138
    iget v7, v0, La/qbh0;->b:I

    .line 139
    .line 140
    mul-int/2addr v2, v7

    .line 141
    add-int/2addr v2, v3

    .line 142
    iget v3, v0, La/qbh0;->c:I

    .line 143
    .line 144
    add-int/2addr v2, v3

    .line 145
    iget v8, v0, La/qbh0;->d:I

    .line 146
    .line 147
    add-int/2addr v2, v8

    .line 148
    move v8, v7

    .line 149
    iget-boolean v7, v0, La/qbh0;->e:Z

    .line 150
    .line 151
    if-eqz v7, :cond_4

    .line 152
    .line 153
    sub-int v3, v2, v3

    .line 154
    .line 155
    :cond_4
    move v9, v8

    .line 156
    new-instance v8, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    move v12, v4

    .line 170
    :goto_3
    if-ge v12, v10, :cond_6

    .line 171
    .line 172
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    check-cast v13, La/pu90;

    .line 177
    .line 178
    if-eqz v7, :cond_5

    .line 179
    .line 180
    iget v13, v13, La/pu90;->a:I

    .line 181
    .line 182
    sub-int/2addr v3, v13

    .line 183
    sub-int v13, v3, v9

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    iget v13, v13, La/pu90;->a:I

    .line 187
    .line 188
    add-int/2addr v13, v9

    .line 189
    add-int/2addr v13, v3

    .line 190
    :goto_4
    invoke-static {v3, v12, v6, v8}, La/w6x;->c(IIILjava/util/ArrayList;)I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    move v3, v13

    .line 195
    goto :goto_3

    .line 196
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    move v10, v4

    .line 210
    :goto_5
    if-ge v10, v9, :cond_7

    .line 211
    .line 212
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    check-cast v12, La/pu90;

    .line 217
    .line 218
    new-instance v13, La/ovx;

    .line 219
    .line 220
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    check-cast v14, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    invoke-interface {v1, v14}, La/w6k;->r0(I)F

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    iget v12, v12, La/pu90;->a:I

    .line 235
    .line 236
    invoke-interface {v1, v12}, La/w6k;->r0(I)F

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    invoke-direct {v13, v14, v12}, La/ovx;-><init>(FF)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    add-int/lit8 v10, v10, 0x1

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_7
    iget-object v9, v0, La/qbh0;->f:La/pz40;

    .line 250
    .line 251
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    if-nez v10, :cond_8

    .line 260
    .line 261
    invoke-interface {v9, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_8
    sget-object v3, La/vbh0;->b:La/vbh0;

    .line 265
    .line 266
    new-instance v10, La/sbh0;

    .line 267
    .line 268
    iget-object v12, v0, La/qbh0;->g:La/ugd;

    .line 269
    .line 270
    iget v0, v0, La/qbh0;->h:I

    .line 271
    .line 272
    invoke-direct {v10, v12, v0, v9, v4}, La/sbh0;-><init>(La/ugd;ILa/pz40;B)V

    .line 273
    .line 274
    .line 275
    new-instance v0, La/ugd;

    .line 276
    .line 277
    const v9, -0x7ad066de

    .line 278
    .line 279
    .line 280
    invoke-direct {v0, v9, v6, v10}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v1, v3, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    new-instance v3, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    move v10, v4

    .line 301
    :goto_6
    if-ge v10, v9, :cond_c

    .line 302
    .line 303
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    move-object/from16 v17, v12

    .line 308
    .line 309
    check-cast v17, La/pj30;

    .line 310
    .line 311
    if-ltz v2, :cond_9

    .line 312
    .line 313
    move/from16 v19, v6

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_9
    move/from16 v19, v4

    .line 317
    .line 318
    :goto_7
    if-ltz v11, :cond_a

    .line 319
    .line 320
    move v12, v6

    .line 321
    goto :goto_8

    .line 322
    :cond_a
    move v12, v4

    .line 323
    :goto_8
    and-int v12, v19, v12

    .line 324
    .line 325
    if-nez v12, :cond_b

    .line 326
    .line 327
    const-string v12, "width and height must be >= 0"

    .line 328
    .line 329
    invoke-static {v12}, La/zcx;->a(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_b
    invoke-static {v2, v2, v11, v11}, La/r4e;->h(IIII)J

    .line 333
    .line 334
    .line 335
    move-result-wide v18

    .line 336
    move-object/from16 v20, v3

    .line 337
    .line 338
    move/from16 v22, v6

    .line 339
    .line 340
    move/from16 v21, v10

    .line 341
    .line 342
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    goto :goto_6

    .line 347
    :cond_c
    move-object/from16 v20, v3

    .line 348
    .line 349
    new-instance v4, La/t13;

    .line 350
    .line 351
    const/16 v9, 0x14

    .line 352
    .line 353
    move-object/from16 v6, v20

    .line 354
    .line 355
    invoke-direct/range {v4 .. v9}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 356
    .line 357
    .line 358
    invoke-static {v1, v2, v11, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    return-object v0

    .line 363
    :cond_d
    invoke-static {}, La/itt0;->a()V

    .line 364
    .line 365
    .line 366
    const/4 v0, 0x0

    .line 367
    return-object v0
.end method
