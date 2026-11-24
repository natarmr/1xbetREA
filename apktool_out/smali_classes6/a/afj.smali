.class public final synthetic La/afj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bfj;


# direct methods
.method public synthetic constructor <init>(La/bfj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/afj;->a:B

    iput-object p1, p0, La/afj;->b:La/bfj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/afj;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/afj;->b:La/bfj;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v10, p1

    .line 14
    .line 15
    check-cast v10, La/fet;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v5, v1, 0x3

    .line 26
    .line 27
    if-eq v5, v2, :cond_0

    .line 28
    .line 29
    move v2, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v4

    .line 32
    :goto_0
    and-int/2addr v1, v3

    .line 33
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const-string v1, "DESCRIPTION_TEXT"

    .line 40
    .line 41
    sget-object v11, La/jm40;->b:La/jm40;

    .line 42
    .line 43
    invoke-static {v11, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v2, La/gqw0;->k:La/yx7;

    .line 48
    .line 49
    sget-object v5, La/uc9;->a:La/lw3;

    .line 50
    .line 51
    const/16 v6, 0x30

    .line 52
    .line 53
    invoke-static {v5, v2, v10, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-wide v5, v10, La/fet;->T:J

    .line 58
    .line 59
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10}, La/fet;->i0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v7, v10, La/fet;->S:Z

    .line 80
    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 84
    .line 85
    invoke-virtual {v10, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v10}, La/fet;->r0()V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 93
    .line 94
    invoke-static {v10, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object v2, La/gqw0;->w:La/shd;

    .line 98
    .line 99
    invoke-static {v10, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sget-object v5, La/gqw0;->y:La/shd;

    .line 107
    .line 108
    invoke-static {v10, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 112
    .line 113
    .line 114
    sget-object v2, La/gqw0;->v:La/shd;

    .line 115
    .line 116
    invoke-static {v10, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    sget-object v1, La/qmk;->a:La/zcl;

    .line 120
    .line 121
    const/4 v15, 0x0

    .line 122
    const/16 v16, 0xb

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    const/4 v13, 0x0

    .line 126
    const/high16 v14, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const/high16 v2, 0x41800000    # 16.0f

    .line 133
    .line 134
    invoke-static {v1, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    iget v1, v0, La/bfj;->c:I

    .line 139
    .line 140
    invoke-static {v1, v4, v10}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    iget-wide v8, v0, La/bfj;->d:J

    .line 145
    .line 146
    const/16 v11, 0x38

    .line 147
    .line 148
    const/4 v12, 0x0

    .line 149
    const/4 v6, 0x0

    .line 150
    invoke-static/range {v5 .. v12}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 151
    .line 152
    .line 153
    iget-object v5, v0, La/bfj;->b:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v17, La/j1t0;->b:La/qrq;

    .line 156
    .line 157
    sget-wide v14, La/qmk;->q:J

    .line 158
    .line 159
    sget-wide v23, La/qmk;->D:J

    .line 160
    .line 161
    new-instance v25, La/y9q0;

    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    move-object/from16 v11, v25

    .line 166
    .line 167
    const v25, 0xfdff9d

    .line 168
    .line 169
    .line 170
    const-wide/16 v12, 0x0

    .line 171
    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    const-wide/16 v18, 0x0

    .line 175
    .line 176
    const/16 v20, 0x0

    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    invoke-direct/range {v11 .. v25}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 181
    .line 182
    .line 183
    iget-wide v7, v0, La/bfj;->d:J

    .line 184
    .line 185
    const/16 v28, 0x6180

    .line 186
    .line 187
    const v29, 0x1affa

    .line 188
    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    move-object/from16 v26, v10

    .line 192
    .line 193
    move-object/from16 v25, v11

    .line 194
    .line 195
    const-wide/16 v10, 0x0

    .line 196
    .line 197
    const/4 v12, 0x0

    .line 198
    const/4 v13, 0x0

    .line 199
    const/4 v14, 0x0

    .line 200
    const-wide/16 v15, 0x0

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/16 v20, 0x2

    .line 205
    .line 206
    const/16 v22, 0x1

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const/16 v24, 0x0

    .line 211
    .line 212
    const/16 v27, 0x0

    .line 213
    .line 214
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 215
    .line 216
    .line 217
    move-object/from16 v10, v26

    .line 218
    .line 219
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_2
    invoke-virtual {v10}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_0
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, La/fet;

    .line 232
    .line 233
    move-object/from16 v5, p2

    .line 234
    .line 235
    check-cast v5, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    and-int/lit8 v6, v5, 0x3

    .line 242
    .line 243
    if-eq v6, v2, :cond_3

    .line 244
    .line 245
    move v4, v3

    .line 246
    :cond_3
    and-int/lit8 v2, v5, 0x1

    .line 247
    .line 248
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_4

    .line 253
    .line 254
    sget-object v2, La/jm40;->b:La/jm40;

    .line 255
    .line 256
    const-string v3, "TITLE_TEXT"

    .line 257
    .line 258
    invoke-static {v2, v3}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget-object v0, v0, La/bfj;->a:Ljava/lang/String;

    .line 263
    .line 264
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 265
    .line 266
    sget-wide v6, La/qmk;->p:J

    .line 267
    .line 268
    sget-wide v15, La/qmk;->C:J

    .line 269
    .line 270
    new-instance v3, La/y9q0;

    .line 271
    .line 272
    const/4 v14, 0x0

    .line 273
    const v17, 0xfdffdd

    .line 274
    .line 275
    .line 276
    const-wide/16 v4, 0x0

    .line 277
    .line 278
    const/4 v8, 0x0

    .line 279
    const-wide/16 v10, 0x0

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    const/4 v13, 0x0

    .line 283
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3, v1}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 287
    .line 288
    .line 289
    move-result-object v21

    .line 290
    const/16 v24, 0x6180

    .line 291
    .line 292
    const v25, 0x1affc

    .line 293
    .line 294
    .line 295
    const-wide/16 v3, 0x0

    .line 296
    .line 297
    const/4 v5, 0x0

    .line 298
    const-wide/16 v6, 0x0

    .line 299
    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v10, 0x0

    .line 302
    const-wide/16 v11, 0x0

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const-wide/16 v14, 0x0

    .line 306
    .line 307
    const/16 v16, 0x2

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/16 v18, 0x1

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    const/16 v20, 0x0

    .line 316
    .line 317
    const/16 v23, 0x30

    .line 318
    .line 319
    move-object/from16 v22, v1

    .line 320
    .line 321
    move-object v1, v0

    .line 322
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 323
    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_4
    move-object/from16 v22, v1

    .line 327
    .line 328
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 329
    .line 330
    .line 331
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
