.class public final synthetic La/kom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/tht;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/kom;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/kom;->b:F

    iput-object p2, p0, La/kom;->c:Ljava/lang/Object;

    iput-object p3, p0, La/kom;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/kom;->a:B

    iput-object p1, p0, La/kom;->c:Ljava/lang/Object;

    iput p2, p0, La/kom;->b:F

    iput-object p3, p0, La/kom;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kom;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    sget-object v4, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget v7, v0, La/kom;->b:F

    .line 13
    .line 14
    iget-object v8, v0, La/kom;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, La/kom;->c:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v9, La/t33;

    .line 22
    .line 23
    check-cast v8, La/ugd;

    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, La/u63;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, La/fet;

    .line 32
    .line 33
    move-object/from16 v10, p3

    .line 34
    .line 35
    check-cast v10, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    and-int/lit8 v0, v10, 0x11

    .line 45
    .line 46
    const/16 v11, 0x10

    .line 47
    .line 48
    if-eq v0, v11, :cond_0

    .line 49
    .line 50
    move v0, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v0, v6

    .line 53
    :goto_0
    and-int/2addr v10, v5

    .line 54
    invoke-virtual {v1, v10, v0}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1, v7}, La/fet;->d(F)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    or-int/2addr v0, v10

    .line 69
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    if-ne v10, v3, :cond_2

    .line 76
    .line 77
    :cond_1
    new-instance v10, La/ntf;

    .line 78
    .line 79
    invoke-direct {v10, v2, v7, v9}, La/ntf;-><init>(BFLa/t33;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    invoke-static {v4, v10}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 92
    .line 93
    invoke-static {v2, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-wide v3, v1, La/fet;->T:J

    .line 98
    .line 99
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 112
    .line 113
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, La/fet;->i0()V

    .line 117
    .line 118
    .line 119
    iget-boolean v7, v1, La/fet;->S:Z

    .line 120
    .line 121
    if-eqz v7, :cond_3

    .line 122
    .line 123
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 124
    .line 125
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 130
    .line 131
    .line 132
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 133
    .line 134
    invoke-static {v1, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    sget-object v2, La/gqw0;->w:La/shd;

    .line 138
    .line 139
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    sget-object v3, La/gqw0;->y:La/shd;

    .line 147
    .line 148
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 152
    .line 153
    .line 154
    sget-object v2, La/gqw0;->v:La/shd;

    .line 155
    .line 156
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v6, v8, v1, v5}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_0
    check-cast v9, La/tht;

    .line 170
    .line 171
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/ir8;

    .line 176
    .line 177
    move-object/from16 v13, p2

    .line 178
    .line 179
    check-cast v13, La/fet;

    .line 180
    .line 181
    move-object/from16 v7, p3

    .line 182
    .line 183
    check-cast v7, Ljava/lang/Integer;

    .line 184
    .line 185
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    and-int/lit8 v10, v7, 0x6

    .line 193
    .line 194
    if-nez v10, :cond_6

    .line 195
    .line 196
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-eqz v10, :cond_5

    .line 201
    .line 202
    const/4 v2, 0x4

    .line 203
    :cond_5
    or-int/2addr v7, v2

    .line 204
    :cond_6
    and-int/lit8 v2, v7, 0x13

    .line 205
    .line 206
    const/16 v10, 0x12

    .line 207
    .line 208
    if-eq v2, v10, :cond_7

    .line 209
    .line 210
    move v6, v5

    .line 211
    :cond_7
    and-int/lit8 v2, v7, 0x1

    .line 212
    .line 213
    invoke-virtual {v13, v2, v6}, La/fet;->U(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 220
    .line 221
    invoke-interface {v1, v4, v2}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const/high16 v2, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    invoke-static {v13}, La/xfn;->a(La/fet;)La/wfn;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iget v15, v1, La/wfn;->d:F

    .line 236
    .line 237
    invoke-static {v13}, La/xfn;->a(La/fet;)La/wfn;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iget v1, v1, La/wfn;->d:F

    .line 242
    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    const/16 v19, 0x2

    .line 246
    .line 247
    iget v0, v0, La/kom;->b:F

    .line 248
    .line 249
    move/from16 v18, v0

    .line 250
    .line 251
    move/from16 v17, v1

    .line 252
    .line 253
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    iget-object v11, v9, La/tht;->b:La/wul;

    .line 258
    .line 259
    invoke-virtual {v13, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    if-nez v0, :cond_8

    .line 268
    .line 269
    if-ne v1, v3, :cond_9

    .line 270
    .line 271
    :cond_8
    new-instance v1, La/hcr;

    .line 272
    .line 273
    const/16 v0, 0x1d

    .line 274
    .line 275
    invoke-direct {v1, v8, v0}, La/hcr;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_9
    move-object v12, v1

    .line 282
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x0

    .line 286
    invoke-static/range {v10 .. v15}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_a
    invoke-virtual {v13}, La/fet;->X()V

    .line 291
    .line 292
    .line 293
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_1
    check-cast v9, La/wom;

    .line 297
    .line 298
    check-cast v8, La/yjj0;

    .line 299
    .line 300
    move-object/from16 v0, p1

    .line 301
    .line 302
    check-cast v0, La/vj30;

    .line 303
    .line 304
    move-object/from16 v1, p2

    .line 305
    .line 306
    check-cast v1, La/pj30;

    .line 307
    .line 308
    move-object/from16 v2, p3

    .line 309
    .line 310
    check-cast v2, La/p4e;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-wide v2, v2, La/p4e;->a:J

    .line 319
    .line 320
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    iget v2, v1, La/pu90;->a:I

    .line 325
    .line 326
    iget v3, v1, La/pu90;->b:I

    .line 327
    .line 328
    new-instance v4, La/gom;

    .line 329
    .line 330
    invoke-direct {v4, v1, v9, v7, v8}, La/gom;-><init>(La/pu90;La/wom;FLa/yjj0;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
