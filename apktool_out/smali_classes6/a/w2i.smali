.class public final La/w2i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/c4i;

.field public final synthetic b:La/u3i;

.field public final synthetic c:La/u3i;

.field public final synthetic d:La/u3i;

.field public final synthetic e:La/u3i;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public constructor <init>(La/c4i;La/u3i;La/u3i;La/u3i;La/u3i;IIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w2i;->a:La/c4i;

    .line 5
    .line 6
    iput-object p2, p0, La/w2i;->b:La/u3i;

    .line 7
    .line 8
    iput-object p3, p0, La/w2i;->c:La/u3i;

    .line 9
    .line 10
    iput-object p4, p0, La/w2i;->d:La/u3i;

    .line 11
    .line 12
    iput-object p5, p0, La/w2i;->e:La/u3i;

    .line 13
    .line 14
    iput p6, p0, La/w2i;->f:I

    .line 15
    .line 16
    iput p7, p0, La/w2i;->g:I

    .line 17
    .line 18
    iput p8, p0, La/w2i;->h:I

    .line 19
    .line 20
    iput p9, p0, La/w2i;->i:I

    .line 21
    .line 22
    iput p10, p0, La/w2i;->j:I

    .line 23
    .line 24
    iput p11, p0, La/w2i;->k:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 9
    .line 10
    .line 11
    move-result v11

    .line 12
    iget-object v2, v0, La/w2i;->a:La/c4i;

    .line 13
    .line 14
    iget-object v3, v2, La/c4i;->c:La/o0x;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-boolean v2, v2, La/c4i;->b:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La/pj30;

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0xa

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    const/4 v15, 0x0

    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    move-wide/from16 v12, p3

    .line 39
    .line 40
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    invoke-interface {v2, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v6, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v2, v4

    .line 51
    move v6, v5

    .line 52
    :goto_0
    if-eqz v3, :cond_1

    .line 53
    .line 54
    add-int/lit8 v3, v6, 0x1

    .line 55
    .line 56
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, La/pj30;

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0xa

    .line 65
    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    move-wide/from16 v12, p3

    .line 71
    .line 72
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move v3, v6

    .line 82
    move-object v6, v4

    .line 83
    :goto_1
    add-int/lit8 v7, v3, 0x1

    .line 84
    .line 85
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, La/pj30;

    .line 90
    .line 91
    iget-object v9, v0, La/w2i;->b:La/u3i;

    .line 92
    .line 93
    instance-of v9, v9, La/v3i;

    .line 94
    .line 95
    if-eqz v9, :cond_3

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x2

    .line 98
    .line 99
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, La/pj30;

    .line 104
    .line 105
    if-eqz v7, :cond_2

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0xa

    .line 110
    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    move-wide/from16 v12, p3

    .line 116
    .line 117
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    invoke-interface {v7, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    goto :goto_3

    .line 126
    :cond_2
    :goto_2
    move-object v7, v4

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move v3, v7

    .line 129
    goto :goto_2

    .line 130
    :goto_3
    iget-object v9, v0, La/w2i;->c:La/u3i;

    .line 131
    .line 132
    instance-of v9, v9, La/z3i;

    .line 133
    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    add-int/lit8 v9, v3, 0x1

    .line 137
    .line 138
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, La/pj30;

    .line 143
    .line 144
    if-eqz v3, :cond_4

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0xa

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    const/4 v15, 0x0

    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    move-wide/from16 v12, p3

    .line 155
    .line 156
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 157
    .line 158
    .line 159
    move-result-wide v14

    .line 160
    invoke-interface {v3, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    goto :goto_5

    .line 165
    :cond_4
    :goto_4
    move-object v3, v4

    .line 166
    goto :goto_5

    .line 167
    :cond_5
    move v9, v3

    .line 168
    goto :goto_4

    .line 169
    :goto_5
    iget-object v10, v0, La/w2i;->d:La/u3i;

    .line 170
    .line 171
    instance-of v10, v10, La/x3i;

    .line 172
    .line 173
    if-eqz v10, :cond_7

    .line 174
    .line 175
    add-int/lit8 v10, v9, 0x1

    .line 176
    .line 177
    invoke-static {v9, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, La/pj30;

    .line 182
    .line 183
    if-eqz v9, :cond_6

    .line 184
    .line 185
    const/16 v17, 0x0

    .line 186
    .line 187
    const/16 v18, 0xa

    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    move-wide/from16 v12, p3

    .line 194
    .line 195
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 196
    .line 197
    .line 198
    move-result-wide v14

    .line 199
    invoke-interface {v9, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    goto :goto_7

    .line 204
    :cond_6
    :goto_6
    move-object v9, v4

    .line 205
    goto :goto_7

    .line 206
    :cond_7
    move v10, v9

    .line 207
    goto :goto_6

    .line 208
    :goto_7
    iget-object v12, v0, La/w2i;->e:La/u3i;

    .line 209
    .line 210
    instance-of v12, v12, La/s3i;

    .line 211
    .line 212
    if-eqz v12, :cond_8

    .line 213
    .line 214
    invoke-static {v10, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, La/pj30;

    .line 219
    .line 220
    if-eqz v1, :cond_8

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const/16 v18, 0xa

    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    move-wide/from16 v12, p3

    .line 231
    .line 232
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 233
    .line 234
    .line 235
    move-result-wide v12

    .line 236
    invoke-interface {v1, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    :cond_8
    move-object v10, v4

    .line 241
    filled-new-array {v7, v3, v9, v10}, [La/pu90;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    move v4, v5

    .line 256
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    if-eqz v12, :cond_9

    .line 261
    .line 262
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    check-cast v12, La/pu90;

    .line 267
    .line 268
    iget v12, v12, La/pu90;->a:I

    .line 269
    .line 270
    add-int/2addr v4, v12

    .line 271
    goto :goto_8

    .line 272
    :cond_9
    if-eqz v2, :cond_a

    .line 273
    .line 274
    iget v1, v2, La/pu90;->a:I

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_a
    move v1, v5

    .line 278
    :goto_9
    if-eqz v6, :cond_b

    .line 279
    .line 280
    iget v12, v6, La/pu90;->a:I

    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_b
    move v12, v5

    .line 284
    :goto_a
    add-int/2addr v1, v12

    .line 285
    if-eqz v2, :cond_c

    .line 286
    .line 287
    iget v12, v0, La/w2i;->g:I

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_c
    move v12, v5

    .line 291
    :goto_b
    if-eqz v6, :cond_d

    .line 292
    .line 293
    iget v13, v0, La/w2i;->h:I

    .line 294
    .line 295
    :goto_c
    move-object v14, v3

    .line 296
    move-object v3, v2

    .line 297
    goto :goto_d

    .line 298
    :cond_d
    move v13, v5

    .line 299
    goto :goto_c

    .line 300
    :goto_d
    iget v2, v0, La/w2i;->f:I

    .line 301
    .line 302
    sub-int v15, v11, v2

    .line 303
    .line 304
    sub-int/2addr v15, v1

    .line 305
    sub-int/2addr v15, v12

    .line 306
    sub-int/2addr v15, v13

    .line 307
    iget v1, v0, La/w2i;->i:I

    .line 308
    .line 309
    sub-int/2addr v15, v1

    .line 310
    sub-int/2addr v15, v4

    .line 311
    if-gez v15, :cond_e

    .line 312
    .line 313
    move v1, v5

    .line 314
    goto :goto_e

    .line 315
    :cond_e
    move v1, v15

    .line 316
    :goto_e
    if-gez v15, :cond_f

    .line 317
    .line 318
    move v15, v5

    .line 319
    :cond_f
    const/16 v4, 0xc

    .line 320
    .line 321
    invoke-static {v1, v15, v5, v5, v4}, La/r4e;->b(IIIII)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-interface {v8, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    new-instance v1, La/v2i;

    .line 330
    .line 331
    move-object v4, v6

    .line 332
    iget v6, v0, La/w2i;->k:I

    .line 333
    .line 334
    iget v12, v0, La/w2i;->h:I

    .line 335
    .line 336
    iget v13, v0, La/w2i;->g:I

    .line 337
    .line 338
    move-object v8, v14

    .line 339
    iget v14, v0, La/w2i;->h:I

    .line 340
    .line 341
    invoke-direct/range {v1 .. v14}, La/v2i;-><init>(ILa/pu90;La/pu90;La/pu90;ILa/pu90;La/pu90;La/pu90;La/pu90;IIII)V

    .line 342
    .line 343
    .line 344
    iget v0, v0, La/w2i;->j:I

    .line 345
    .line 346
    move-object/from16 v2, p1

    .line 347
    .line 348
    invoke-static {v2, v11, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0
.end method
