.class public final synthetic La/mxn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/t33;La/y9q0;JJLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/mxn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mxn;->d:Ljava/lang/Object;

    iput-object p2, p0, La/mxn;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/mxn;->b:J

    iput-wide p5, p0, La/mxn;->c:J

    iput-object p7, p0, La/mxn;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/w2d;JLa/pl7;Lkotlin/jvm/functions/Function1;J)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/mxn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mxn;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/mxn;->b:J

    iput-object p4, p0, La/mxn;->e:Ljava/lang/Object;

    iput-object p5, p0, La/mxn;->f:Ljava/lang/Object;

    iput-wide p6, p0, La/mxn;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mxn;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/mxn;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, v0, La/mxn;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, v0, La/mxn;->d:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v10, v8

    .line 20
    check-cast v10, La/w2d;

    .line 21
    .line 22
    move-object v11, v7

    .line 23
    check-cast v11, La/pl7;

    .line 24
    .line 25
    move-object v15, v6

    .line 26
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/fet;

    .line 31
    .line 32
    move-object/from16 v6, p2

    .line 33
    .line 34
    check-cast v6, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    and-int/lit8 v7, v6, 0x3

    .line 41
    .line 42
    if-eq v7, v3, :cond_0

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v3, v5

    .line 47
    :goto_0
    and-int/2addr v6, v4

    .line 48
    invoke-virtual {v1, v6, v3}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    sget-object v3, La/uc9;->c:La/mw3;

    .line 55
    .line 56
    sget-object v6, La/gqw0;->m:La/xx7;

    .line 57
    .line 58
    invoke-static {v3, v6, v1, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-wide v5, v1, La/fet;->T:J

    .line 63
    .line 64
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, La/fet;->i0()V

    .line 82
    .line 83
    .line 84
    iget-boolean v7, v1, La/fet;->S:Z

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 89
    .line 90
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 98
    .line 99
    invoke-static {v1, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    sget-object v3, La/gqw0;->w:La/shd;

    .line 103
    .line 104
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    sget-object v5, La/gqw0;->y:La/shd;

    .line 112
    .line 113
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 117
    .line 118
    .line 119
    sget-object v3, La/gqw0;->v:La/shd;

    .line 120
    .line 121
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    move-object v12, v11

    .line 125
    new-instance v11, La/my2;

    .line 126
    .line 127
    const/16 v16, 0xd

    .line 128
    .line 129
    iget-wide v13, v0, La/mxn;->b:J

    .line 130
    .line 131
    invoke-direct/range {v11 .. v16}, La/my2;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    const v2, -0x2e9d81a3

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v11, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    new-instance v9, La/mvg0;

    .line 142
    .line 143
    move-object v6, v15

    .line 144
    const/4 v15, 0x2

    .line 145
    iget-wide v13, v0, La/mxn;->c:J

    .line 146
    .line 147
    move-object v11, v12

    .line 148
    move-object v12, v6

    .line 149
    invoke-direct/range {v9 .. v15}, La/mvg0;-><init>(La/w2d;La/pl7;Lkotlin/jvm/functions/Function1;JB)V

    .line 150
    .line 151
    .line 152
    const v0, 0x2f09a23c

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v9, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    const/16 v14, 0xdc0

    .line 160
    .line 161
    const/4 v9, 0x0

    .line 162
    move-object v13, v1

    .line 163
    move-object v11, v2

    .line 164
    invoke-static/range {v9 .. v14}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 165
    .line 166
    .line 167
    const/16 v20, 0x6

    .line 168
    .line 169
    const/16 v21, 0x6

    .line 170
    .line 171
    sget-object v16, La/zfi0;->a:La/zfi0;

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    move-object/from16 v19, v13

    .line 178
    .line 179
    invoke-static/range {v16 .. v21}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v13, v4}, La/fet;->r(Z)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_2
    move-object v13, v1

    .line 187
    invoke-virtual {v13}, La/fet;->X()V

    .line 188
    .line 189
    .line 190
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_0
    check-cast v8, La/t33;

    .line 194
    .line 195
    move-object v9, v7

    .line 196
    check-cast v9, La/y9q0;

    .line 197
    .line 198
    check-cast v6, Ljava/lang/String;

    .line 199
    .line 200
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/fet;

    .line 203
    .line 204
    move-object/from16 v7, p2

    .line 205
    .line 206
    check-cast v7, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    and-int/lit8 v10, v7, 0x3

    .line 213
    .line 214
    if-eq v10, v3, :cond_3

    .line 215
    .line 216
    move v5, v4

    .line 217
    :cond_3
    and-int/lit8 v3, v7, 0x1

    .line 218
    .line 219
    invoke-virtual {v1, v3, v5}, La/fet;->U(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_6

    .line 224
    .line 225
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    if-nez v3, :cond_4

    .line 234
    .line 235
    sget-object v3, La/ukd;->a:La/cl5;

    .line 236
    .line 237
    if-ne v4, v3, :cond_5

    .line 238
    .line 239
    :cond_4
    new-instance v4, La/m53;

    .line 240
    .line 241
    const/16 v3, 0xd

    .line 242
    .line 243
    invoke-direct {v4, v8, v3}, La/m53;-><init>(La/t33;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 250
    .line 251
    invoke-static {v2, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    const/16 v26, 0x0

    .line 256
    .line 257
    const v27, 0xfeeffc

    .line 258
    .line 259
    .line 260
    iget-wide v10, v0, La/mxn;->b:J

    .line 261
    .line 262
    iget-wide v12, v0, La/mxn;->c:J

    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const/4 v15, 0x0

    .line 266
    const/16 v16, 0x0

    .line 267
    .line 268
    const-wide/16 v17, 0x0

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    sget-object v20, La/k5q0;->d:La/k5q0;

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const/16 v22, 0x1

    .line 277
    .line 278
    const-wide/16 v23, 0x0

    .line 279
    .line 280
    const/16 v25, 0x0

    .line 281
    .line 282
    invoke-static/range {v9 .. v27}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    const/16 v22, 0x3f8

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const/4 v15, 0x0

    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const/16 v18, 0x0

    .line 296
    .line 297
    move-object/from16 v20, v1

    .line 298
    .line 299
    move-object v11, v2

    .line 300
    move-object v10, v6

    .line 301
    invoke-static/range {v10 .. v22}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_6
    move-object/from16 v20, v1

    .line 306
    .line 307
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 308
    .line 309
    .line 310
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
