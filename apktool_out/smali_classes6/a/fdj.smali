.class public final synthetic La/fdj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Locale;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/Long;

.field public final synthetic g:J

.field public final synthetic h:La/omv;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Locale;JJZLjava/lang/Long;JLa/omv;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/fdj;->a:I

    iput-object p2, p0, La/fdj;->b:Ljava/util/Locale;

    iput-wide p3, p0, La/fdj;->c:J

    iput-wide p5, p0, La/fdj;->d:J

    iput-boolean p7, p0, La/fdj;->e:Z

    iput-object p8, p0, La/fdj;->f:Ljava/lang/Long;

    iput-wide p9, p0, La/fdj;->g:J

    iput-object p11, p0, La/fdj;->h:La/omv;

    iput-object p12, p0, La/fdj;->i:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/rk80;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v9, p3

    .line 16
    .line 17
    check-cast v9, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 v1, v3, 0x30

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_0
    or-int/2addr v3, v1

    .line 46
    :cond_1
    and-int/lit16 v1, v3, 0x91

    .line 47
    .line 48
    const/16 v4, 0x90

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x1

    .line 52
    if-eq v1, v4, :cond_2

    .line 53
    .line 54
    move v1, v12

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v1, v11

    .line 57
    :goto_1
    and-int/2addr v3, v12

    .line 58
    invoke-virtual {v9, v3, v1}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_9

    .line 63
    .line 64
    iget v1, v0, La/fdj;->a:I

    .line 65
    .line 66
    add-int/2addr v1, v2

    .line 67
    invoke-static {v1}, La/bsr0;->d0(I)La/w2w0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget-object v3, v0, La/fdj;->b:Ljava/util/Locale;

    .line 76
    .line 77
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    or-int/2addr v2, v4

    .line 82
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    sget-object v2, La/ukd;->a:La/cl5;

    .line 89
    .line 90
    if-ne v4, v2, :cond_4

    .line 91
    .line 92
    :cond_3
    iget v2, v1, La/w2w0;->a:I

    .line 93
    .line 94
    iget v1, v1, La/w2w0;->b:I

    .line 95
    .line 96
    invoke-static {v2, v1, v3}, La/bsr0;->S(IILjava/util/Locale;)La/il9;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    move-object v1, v4

    .line 104
    check-cast v1, La/il9;

    .line 105
    .line 106
    sget-object v2, La/jm40;->b:La/jm40;

    .line 107
    .line 108
    const/high16 v13, 0x3f800000    # 1.0f

    .line 109
    .line 110
    invoke-static {v2, v13}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    sget-object v4, La/uc9;->c:La/mw3;

    .line 115
    .line 116
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 117
    .line 118
    invoke-static {v4, v5, v9, v11}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    iget-wide v5, v9, La/fet;->T:J

    .line 123
    .line 124
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v9, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9}, La/fet;->i0()V

    .line 142
    .line 143
    .line 144
    iget-boolean v7, v9, La/fet;->S:Z

    .line 145
    .line 146
    if-eqz v7, :cond_5

    .line 147
    .line 148
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 149
    .line 150
    invoke-virtual {v9, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-virtual {v9}, La/fet;->r0()V

    .line 155
    .line 156
    .line 157
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 158
    .line 159
    invoke-static {v9, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    sget-object v4, La/gqw0;->w:La/shd;

    .line 163
    .line 164
    invoke-static {v9, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    sget-object v5, La/gqw0;->y:La/shd;

    .line 172
    .line 173
    invoke-static {v9, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 177
    .line 178
    .line 179
    sget-object v4, La/gqw0;->v:La/shd;

    .line 180
    .line 181
    invoke-static {v9, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 182
    .line 183
    .line 184
    const v3, -0x16468c9c

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 188
    .line 189
    .line 190
    iget-object v3, v1, La/il9;->c:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    move v15, v11

    .line 197
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_8

    .line 202
    .line 203
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    add-int/lit8 v16, v15, 0x1

    .line 208
    .line 209
    if-ltz v15, :cond_7

    .line 210
    .line 211
    move-object/from16 v18, v3

    .line 212
    .line 213
    check-cast v18, Ljava/util/List;

    .line 214
    .line 215
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    sget-object v3, La/qmk;->a:La/zcl;

    .line 220
    .line 221
    const/high16 v3, 0x41000000    # 8.0f

    .line 222
    .line 223
    const/4 v5, 0x2

    .line 224
    const/4 v6, 0x0

    .line 225
    invoke-static {v3, v6, v5}, La/s5x0;->t(FFI)La/lh80;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-static {v2, v13}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    new-instance v17, La/ycj;

    .line 234
    .line 235
    iget-wide v5, v0, La/fdj;->c:J

    .line 236
    .line 237
    move-object/from16 p2, v14

    .line 238
    .line 239
    iget-wide v13, v0, La/fdj;->d:J

    .line 240
    .line 241
    iget-boolean v8, v0, La/fdj;->e:Z

    .line 242
    .line 243
    iget-object v10, v0, La/fdj;->f:Ljava/lang/Long;

    .line 244
    .line 245
    move/from16 p3, v12

    .line 246
    .line 247
    move-wide/from16 v21, v13

    .line 248
    .line 249
    iget-wide v12, v0, La/fdj;->g:J

    .line 250
    .line 251
    iget-object v14, v0, La/fdj;->h:La/omv;

    .line 252
    .line 253
    iget-object v11, v0, La/fdj;->i:Lkotlin/jvm/functions/Function1;

    .line 254
    .line 255
    move-wide/from16 v19, v5

    .line 256
    .line 257
    move/from16 v23, v8

    .line 258
    .line 259
    move-object/from16 v24, v10

    .line 260
    .line 261
    move-object/from16 v28, v11

    .line 262
    .line 263
    move-wide/from16 v25, v12

    .line 264
    .line 265
    move-object/from16 v27, v14

    .line 266
    .line 267
    invoke-direct/range {v17 .. v28}, La/ycj;-><init>(Ljava/util/List;JJZLjava/lang/Long;JLa/omv;Lkotlin/jvm/functions/Function1;)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v5, v17

    .line 271
    .line 272
    const v6, -0x45dca16b

    .line 273
    .line 274
    .line 275
    invoke-static {v6, v5, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    const v10, 0x30006

    .line 280
    .line 281
    .line 282
    const/high16 v5, 0x42000000    # 32.0f

    .line 283
    .line 284
    const/high16 v6, 0x42200000    # 40.0f

    .line 285
    .line 286
    invoke-static/range {v3 .. v10}, La/cwr0;->b(La/mm40;IFFLa/hh80;La/ugd;La/fet;I)V

    .line 287
    .line 288
    .line 289
    iget-object v3, v1, La/il9;->c:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    add-int/lit8 v3, v3, -0x1

    .line 296
    .line 297
    if-eq v3, v15, :cond_6

    .line 298
    .line 299
    const v3, 0x516de42e

    .line 300
    .line 301
    .line 302
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 303
    .line 304
    .line 305
    const/high16 v3, 0x40800000    # 4.0f

    .line 306
    .line 307
    invoke-static {v2, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-static {v9, v3}, La/qxw;->o(La/fet;La/mm40;)V

    .line 312
    .line 313
    .line 314
    const/4 v3, 0x0

    .line 315
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_6
    const/4 v3, 0x0

    .line 320
    const v4, 0x51701b05

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 327
    .line 328
    .line 329
    :goto_4
    move-object/from16 v14, p2

    .line 330
    .line 331
    move/from16 v12, p3

    .line 332
    .line 333
    move v11, v3

    .line 334
    move/from16 v15, v16

    .line 335
    .line 336
    const/high16 v13, 0x3f800000    # 1.0f

    .line 337
    .line 338
    goto/16 :goto_3

    .line 339
    .line 340
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 341
    .line 342
    .line 343
    const/4 v0, 0x0

    .line 344
    throw v0

    .line 345
    :cond_8
    move v3, v11

    .line 346
    move/from16 p3, v12

    .line 347
    .line 348
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 349
    .line 350
    .line 351
    move/from16 v0, p3

    .line 352
    .line 353
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 354
    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_9
    invoke-virtual {v9}, La/fet;->X()V

    .line 358
    .line 359
    .line 360
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object v0
.end method
