.class public final synthetic La/pp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f3w;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/f3w;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pp2;->a:B

    iput-object p1, p0, La/pp2;->b:La/f3w;

    iput-wide p2, p0, La/pp2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pp2;->a:B

    .line 4
    .line 5
    const-string v2, "DESCRIPTION_TEXT"

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, La/pp2;->b:La/f3w;

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v8, p2

    .line 22
    .line 23
    check-cast v8, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    and-int/lit8 v9, v8, 0x3

    .line 30
    .line 31
    if-eq v9, v7, :cond_0

    .line 32
    .line 33
    move v7, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v5

    .line 36
    :goto_0
    and-int/2addr v8, v4

    .line 37
    invoke-virtual {v1, v8, v7}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    invoke-static {v3, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v7, La/qmk;->a:La/zcl;

    .line 48
    .line 49
    new-instance v7, La/qw3;

    .line 50
    .line 51
    new-instance v8, La/jf4;

    .line 52
    .line 53
    const/16 v9, 0xe

    .line 54
    .line 55
    invoke-direct {v8, v9}, La/jf4;-><init>(B)V

    .line 56
    .line 57
    .line 58
    const/high16 v9, 0x40000000    # 2.0f

    .line 59
    .line 60
    invoke-direct {v7, v9, v4, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 61
    .line 62
    .line 63
    sget-object v8, La/gqw0;->j:La/yx7;

    .line 64
    .line 65
    invoke-static {v7, v8, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    iget-wide v8, v1, La/fet;->T:J

    .line 70
    .line 71
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, La/fet;->i0()V

    .line 89
    .line 90
    .line 91
    iget-boolean v10, v1, La/fet;->S:Z

    .line 92
    .line 93
    if-eqz v10, :cond_1

    .line 94
    .line 95
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 96
    .line 97
    invoke-virtual {v1, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 102
    .line 103
    .line 104
    :goto_1
    sget-object v10, La/gqw0;->x:La/shd;

    .line 105
    .line 106
    invoke-static {v1, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v7, La/gqw0;->w:La/shd;

    .line 110
    .line 111
    invoke-static {v1, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    sget-object v8, La/gqw0;->y:La/shd;

    .line 119
    .line 120
    invoke-static {v1, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 124
    .line 125
    .line 126
    sget-object v7, La/gqw0;->v:La/shd;

    .line 127
    .line 128
    const/high16 v8, 0x3f800000    # 1.0f

    .line 129
    .line 130
    invoke-static {v1, v2, v7, v8, v5}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v5, "SUM_VALUE_TEST_TAG"

    .line 135
    .line 136
    invoke-static {v2, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    iget-object v8, v6, La/f3w;->c:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 143
    .line 144
    .line 145
    move-result-object v28

    .line 146
    const/16 v31, 0x6180

    .line 147
    .line 148
    const v32, 0x1aff8

    .line 149
    .line 150
    .line 151
    iget-wide v10, v0, La/pp2;->c:J

    .line 152
    .line 153
    const/4 v12, 0x0

    .line 154
    const-wide/16 v13, 0x0

    .line 155
    .line 156
    const/4 v15, 0x0

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const-wide/16 v18, 0x0

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const-wide/16 v21, 0x0

    .line 166
    .line 167
    const/16 v23, 0x2

    .line 168
    .line 169
    const/16 v24, 0x0

    .line 170
    .line 171
    const/16 v25, 0x1

    .line 172
    .line 173
    const/16 v26, 0x0

    .line 174
    .line 175
    const/16 v27, 0x0

    .line 176
    .line 177
    const/16 v30, 0x180

    .line 178
    .line 179
    move-object/from16 v29, v1

    .line 180
    .line 181
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 182
    .line 183
    .line 184
    const-string v0, "CURRENCY_VALUE_TEST_TAG"

    .line 185
    .line 186
    invoke-static {v3, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    iget-object v8, v6, La/f3w;->d:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 193
    .line 194
    .line 195
    move-result-object v28

    .line 196
    const/16 v30, 0x1b0

    .line 197
    .line 198
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v0, v29

    .line 202
    .line 203
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_2
    move-object v0, v1

    .line 208
    invoke-virtual {v0}, La/fet;->X()V

    .line 209
    .line 210
    .line 211
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_0
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, La/fet;

    .line 217
    .line 218
    move-object/from16 v2, p2

    .line 219
    .line 220
    check-cast v2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    and-int/lit8 v3, v2, 0x3

    .line 227
    .line 228
    if-eq v3, v7, :cond_3

    .line 229
    .line 230
    move v5, v4

    .line 231
    :cond_3
    and-int/2addr v2, v4

    .line 232
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_4

    .line 237
    .line 238
    sget-object v2, La/bmd;->n:La/zfn;

    .line 239
    .line 240
    sget-object v3, La/k6z;->a:La/k6z;

    .line 241
    .line 242
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    new-instance v3, La/pp2;

    .line 247
    .line 248
    iget-wide v4, v0, La/pp2;->c:J

    .line 249
    .line 250
    invoke-direct {v3, v6, v4, v5, v7}, La/pp2;-><init>(La/f3w;JB)V

    .line 251
    .line 252
    .line 253
    const v0, -0x3609c53f

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const/16 v3, 0x38

    .line 261
    .line 262
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 267
    .line 268
    .line 269
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_1
    move-object/from16 v11, p1

    .line 273
    .line 274
    check-cast v11, La/fet;

    .line 275
    .line 276
    move-object/from16 v1, p2

    .line 277
    .line 278
    check-cast v1, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    and-int/lit8 v8, v1, 0x3

    .line 285
    .line 286
    if-eq v8, v7, :cond_5

    .line 287
    .line 288
    move v5, v4

    .line 289
    :cond_5
    and-int/2addr v1, v4

    .line 290
    invoke-virtual {v11, v1, v5}, La/fet;->U(IZ)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_6

    .line 295
    .line 296
    invoke-static {v3, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    iget-object v2, v6, La/f3w;->c:Ljava/lang/String;

    .line 301
    .line 302
    iget-object v3, v6, La/f3w;->d:Ljava/lang/String;

    .line 303
    .line 304
    const/16 v12, 0xc06

    .line 305
    .line 306
    const/16 v13, 0xe0

    .line 307
    .line 308
    iget-wide v4, v0, La/pp2;->c:J

    .line 309
    .line 310
    const-wide/16 v6, 0x0

    .line 311
    .line 312
    const-wide/16 v8, 0x0

    .line 313
    .line 314
    const/4 v10, 0x0

    .line 315
    invoke-static/range {v1 .. v13}, La/y9a;->h(La/mm40;Ljava/lang/String;Ljava/lang/String;JJJLa/y9q0;La/fet;II)V

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_6
    invoke-virtual {v11}, La/fet;->X()V

    .line 320
    .line 321
    .line 322
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
