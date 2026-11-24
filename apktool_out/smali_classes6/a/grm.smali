.class public final synthetic La/grm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:F

.field public final synthetic g:Z

.field public final synthetic h:F

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:J

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(JJFJLjava/util/List;FZFJJFFFJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/grm;->a:J

    iput-wide p3, p0, La/grm;->b:J

    iput p5, p0, La/grm;->c:F

    iput-wide p6, p0, La/grm;->d:J

    iput-object p8, p0, La/grm;->e:Ljava/util/List;

    iput p9, p0, La/grm;->f:F

    iput-boolean p10, p0, La/grm;->g:Z

    iput p11, p0, La/grm;->h:F

    iput-wide p12, p0, La/grm;->i:J

    iput-wide p14, p0, La/grm;->j:J

    move/from16 p1, p16

    iput p1, p0, La/grm;->k:F

    move/from16 p1, p17

    iput p1, p0, La/grm;->l:F

    move/from16 p1, p18

    iput p1, p0, La/grm;->m:F

    move-wide/from16 p1, p19

    iput-wide p1, p0, La/grm;->n:J

    move-wide/from16 p1, p21

    iput-wide p1, p0, La/grm;->o:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fhl;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/16 v11, 0x1e0

    .line 12
    .line 13
    iget-wide v2, v0, La/grm;->d:J

    .line 14
    .line 15
    iget-wide v4, v0, La/grm;->a:J

    .line 16
    .line 17
    iget-wide v6, v0, La/grm;->b:J

    .line 18
    .line 19
    iget v8, v0, La/grm;->c:F

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 23
    .line 24
    .line 25
    move-wide v10, v4

    .line 26
    move-wide v12, v6

    .line 27
    move v14, v8

    .line 28
    iget-object v15, v0, La/grm;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, v0, La/grm;->f:F

    .line 35
    .line 36
    iget-boolean v4, v0, La/grm;->g:Z

    .line 37
    .line 38
    iget-wide v5, v0, La/grm;->i:J

    .line 39
    .line 40
    const/16 v16, 0x20

    .line 41
    .line 42
    const-wide v17, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    if-nez v2, :cond_7

    .line 48
    .line 49
    iget v2, v0, La/grm;->h:F

    .line 50
    .line 51
    const/high16 v7, 0x40000000    # 2.0f

    .line 52
    .line 53
    div-float/2addr v2, v7

    .line 54
    invoke-interface {v1}, La/fhl;->d()J

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    and-long v8, v8, v17

    .line 59
    .line 60
    long-to-int v8, v8

    .line 61
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    div-float v19, v8, v7

    .line 66
    .line 67
    sget-object v7, La/qmk;->a:La/zcl;

    .line 68
    .line 69
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v20

    .line 73
    const/4 v7, 0x0

    .line 74
    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_7

    .line 79
    .line 80
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    add-int/lit8 v21, v7, 0x1

    .line 85
    .line 86
    if-ltz v7, :cond_6

    .line 87
    .line 88
    check-cast v8, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    add-int/lit8 v9, v9, -0x1

    .line 99
    .line 100
    if-nez v7, :cond_0

    .line 101
    .line 102
    if-nez v4, :cond_0

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    const/high16 v22, -0x3f800000    # -4.0f

    .line 106
    .line 107
    if-nez v7, :cond_1

    .line 108
    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    if-ne v7, v9, :cond_2

    .line 113
    .line 114
    if-nez v4, :cond_2

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    if-ne v7, v9, :cond_3

    .line 118
    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    :goto_1
    const/high16 v22, 0x40800000    # 4.0f

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    const/16 v22, 0x0

    .line 125
    .line 126
    :goto_2
    add-float v8, v8, v22

    .line 127
    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    cmpl-float v7, v8, v3

    .line 131
    .line 132
    if-ltz v7, :cond_4

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    move-object/from16 p1, v1

    .line 136
    .line 137
    move v7, v2

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    cmpg-float v7, v8, v3

    .line 140
    .line 141
    if-gtz v7, :cond_4

    .line 142
    .line 143
    :goto_3
    move-object/from16 p1, v1

    .line 144
    .line 145
    move v7, v2

    .line 146
    move-wide v1, v5

    .line 147
    goto :goto_5

    .line 148
    :goto_4
    iget-wide v1, v0, La/grm;->j:J

    .line 149
    .line 150
    :goto_5
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    int-to-long v8, v8

    .line 155
    move-wide/from16 v22, v1

    .line 156
    .line 157
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    int-to-long v1, v1

    .line 162
    shl-long v8, v8, v16

    .line 163
    .line 164
    and-long v1, v1, v17

    .line 165
    .line 166
    or-long/2addr v1, v8

    .line 167
    const/4 v8, 0x0

    .line 168
    const/16 v9, 0x78

    .line 169
    .line 170
    move/from16 v24, v4

    .line 171
    .line 172
    move v4, v7

    .line 173
    const/4 v7, 0x0

    .line 174
    move-wide/from16 v25, v5

    .line 175
    .line 176
    move-wide v5, v1

    .line 177
    move-object/from16 v1, p1

    .line 178
    .line 179
    move-wide/from16 v27, v22

    .line 180
    .line 181
    move/from16 v22, v3

    .line 182
    .line 183
    move-wide/from16 v2, v27

    .line 184
    .line 185
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 186
    .line 187
    .line 188
    move v2, v4

    .line 189
    move/from16 v7, v21

    .line 190
    .line 191
    move/from16 v3, v22

    .line 192
    .line 193
    move/from16 v4, v24

    .line 194
    .line 195
    move-wide/from16 v5, v25

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 199
    .line 200
    .line 201
    const/4 v0, 0x0

    .line 202
    throw v0

    .line 203
    :cond_7
    move/from16 v22, v3

    .line 204
    .line 205
    move/from16 v24, v4

    .line 206
    .line 207
    move-wide/from16 v25, v5

    .line 208
    .line 209
    iget v15, v0, La/grm;->k:F

    .line 210
    .line 211
    if-eqz v24, :cond_8

    .line 212
    .line 213
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    int-to-long v2, v2

    .line 218
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    int-to-long v4, v4

    .line 223
    shl-long v2, v2, v16

    .line 224
    .line 225
    and-long v4, v4, v17

    .line 226
    .line 227
    or-long/2addr v4, v2

    .line 228
    goto :goto_6

    .line 229
    :cond_8
    move-wide v4, v10

    .line 230
    :goto_6
    if-eqz v24, :cond_9

    .line 231
    .line 232
    move-wide v6, v12

    .line 233
    goto :goto_7

    .line 234
    :cond_9
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    int-to-long v2, v2

    .line 239
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    int-to-long v6, v6

    .line 244
    shl-long v2, v2, v16

    .line 245
    .line 246
    and-long v6, v6, v17

    .line 247
    .line 248
    or-long/2addr v6, v2

    .line 249
    :goto_7
    const/4 v10, 0x0

    .line 250
    const/16 v11, 0x1e0

    .line 251
    .line 252
    const/4 v9, 0x1

    .line 253
    move v8, v14

    .line 254
    move-wide/from16 v2, v25

    .line 255
    .line 256
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 257
    .line 258
    .line 259
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-long v2, v2

    .line 264
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    int-to-long v4, v4

    .line 269
    shl-long v2, v2, v16

    .line 270
    .line 271
    and-long v4, v4, v17

    .line 272
    .line 273
    or-long v5, v2, v4

    .line 274
    .line 275
    const/4 v8, 0x0

    .line 276
    const/16 v9, 0x78

    .line 277
    .line 278
    iget-wide v2, v0, La/grm;->n:J

    .line 279
    .line 280
    iget v4, v0, La/grm;->m:F

    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 284
    .line 285
    .line 286
    move v3, v4

    .line 287
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    int-to-long v4, v2

    .line 292
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    int-to-long v6, v2

    .line 297
    shl-long v4, v4, v16

    .line 298
    .line 299
    and-long v6, v6, v17

    .line 300
    .line 301
    or-long/2addr v4, v6

    .line 302
    new-instance v6, La/vtm0;

    .line 303
    .line 304
    const/4 v11, 0x0

    .line 305
    const/16 v12, 0x1e

    .line 306
    .line 307
    iget v7, v0, La/grm;->l:F

    .line 308
    .line 309
    const/4 v8, 0x0

    .line 310
    const/4 v9, 0x0

    .line 311
    const/4 v10, 0x0

    .line 312
    invoke-direct/range {v6 .. v12}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 313
    .line 314
    .line 315
    const/16 v8, 0x68

    .line 316
    .line 317
    iget-wide v9, v0, La/grm;->o:J

    .line 318
    .line 319
    move-object v7, v6

    .line 320
    const/4 v6, 0x0

    .line 321
    move-object v0, v1

    .line 322
    move-wide v1, v9

    .line 323
    invoke-static/range {v0 .. v8}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 324
    .line 325
    .line 326
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    return-object v0
.end method
