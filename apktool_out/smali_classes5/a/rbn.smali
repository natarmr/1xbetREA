.class public final synthetic La/rbn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/vbn;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/vbn;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rbn;->a:B

    iput-object p1, p0, La/rbn;->b:La/l7m0;

    iput-object p2, p0, La/rbn;->c:La/vbn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rbn;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41800000    # 16.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x2

    .line 16
    iget-object v9, v0, La/rbn;->c:La/vbn;

    .line 17
    .line 18
    iget-object v0, v0, La/rbn;->b:La/l7m0;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/y5d;

    .line 26
    .line 27
    move-object/from16 v10, p2

    .line 28
    .line 29
    check-cast v10, La/fet;

    .line 30
    .line 31
    move-object/from16 v11, p3

    .line 32
    .line 33
    check-cast v11, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    sget-object v12, La/vbn;->n2:La/nek;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    and-int/lit8 v1, v11, 0x11

    .line 45
    .line 46
    if-eq v1, v5, :cond_0

    .line 47
    .line 48
    move v1, v7

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v1, v6

    .line 51
    :goto_0
    and-int/lit8 v5, v11, 0x1

    .line 52
    .line 53
    invoke-virtual {v10, v5, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    invoke-static {v6, v6, v10, v6, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-static {v11, v10}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-static {v4, v1, v5}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v4, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    const/high16 v4, 0x40800000    # 4.0f

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-static {v1, v4, v5, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v5, v3, v7}, La/s5x0;->t(FFI)La/lh80;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {v10, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    or-int/2addr v3, v4

    .line 95
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-nez v3, :cond_1

    .line 100
    .line 101
    if-ne v4, v2, :cond_2

    .line 102
    .line 103
    :cond_1
    new-instance v4, La/dpl;

    .line 104
    .line 105
    const/16 v2, 0x19

    .line 106
    .line 107
    invoke-direct {v4, v0, v9, v2}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    move-object/from16 v18, v4

    .line 114
    .line 115
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    const/16 v21, 0x1f8

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    move-object/from16 v19, v10

    .line 129
    .line 130
    move-object v10, v1

    .line 131
    invoke-static/range {v10 .. v21}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move-object/from16 v19, v10

    .line 136
    .line 137
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 138
    .line 139
    .line 140
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_0
    move-object/from16 v1, p1

    .line 144
    .line 145
    check-cast v1, La/ir8;

    .line 146
    .line 147
    move-object/from16 v13, p2

    .line 148
    .line 149
    check-cast v13, La/fet;

    .line 150
    .line 151
    move-object/from16 v10, p3

    .line 152
    .line 153
    check-cast v10, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    sget-object v11, La/vbn;->n2:La/nek;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    and-int/lit8 v1, v10, 0x11

    .line 165
    .line 166
    if-eq v1, v5, :cond_4

    .line 167
    .line 168
    move v1, v7

    .line 169
    goto :goto_2

    .line 170
    :cond_4
    move v1, v6

    .line 171
    :goto_2
    and-int/lit8 v5, v10, 0x1

    .line 172
    .line 173
    invoke-virtual {v13, v5, v1}, La/fet;->U(IZ)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    sget-object v1, La/uc9;->c:La/mw3;

    .line 180
    .line 181
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 182
    .line 183
    invoke-static {v1, v5, v13, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-wide v5, v13, La/fet;->T:J

    .line 188
    .line 189
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-static {v13, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 202
    .line 203
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13}, La/fet;->i0()V

    .line 207
    .line 208
    .line 209
    iget-boolean v11, v13, La/fet;->S:Z

    .line 210
    .line 211
    if-eqz v11, :cond_5

    .line 212
    .line 213
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 214
    .line 215
    invoke-virtual {v13, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_5
    invoke-virtual {v13}, La/fet;->r0()V

    .line 220
    .line 221
    .line 222
    :goto_3
    sget-object v11, La/gqw0;->x:La/shd;

    .line 223
    .line 224
    invoke-static {v13, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/gqw0;->w:La/shd;

    .line 228
    .line 229
    invoke-static {v13, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    sget-object v5, La/gqw0;->y:La/shd;

    .line 237
    .line 238
    invoke-static {v13, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 242
    .line 243
    .line 244
    sget-object v1, La/gqw0;->v:La/shd;

    .line 245
    .line 246
    invoke-static {v13, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 247
    .line 248
    .line 249
    const/high16 v1, 0x3f800000    # 1.0f

    .line 250
    .line 251
    invoke-static {v4, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    const/16 v14, 0x36

    .line 256
    .line 257
    const/4 v15, 0x4

    .line 258
    sget-object v10, La/zfi0;->a:La/zfi0;

    .line 259
    .line 260
    const/4 v12, 0x0

    .line 261
    invoke-static/range {v10 .. v15}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 262
    .line 263
    .line 264
    invoke-static {v4, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    sget-object v4, La/qmk;->a:La/zcl;

    .line 269
    .line 270
    const/high16 v4, 0x41000000    # 8.0f

    .line 271
    .line 272
    invoke-static {v1, v3, v4}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, La/zbn;

    .line 281
    .line 282
    iget-object v11, v0, La/zbn;->c:La/wul;

    .line 283
    .line 284
    invoke-virtual {v13, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-nez v0, :cond_6

    .line 293
    .line 294
    if-ne v1, v2, :cond_7

    .line 295
    .line 296
    :cond_6
    new-instance v1, La/sbn;

    .line 297
    .line 298
    invoke-direct {v1, v9, v8}, La/sbn;-><init>(La/vbn;B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_7
    move-object v12, v1

    .line 305
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const/4 v15, 0x0

    .line 309
    invoke-static/range {v10 .. v15}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v13, v7}, La/fet;->r(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_8
    invoke-virtual {v13}, La/fet;->X()V

    .line 317
    .line 318
    .line 319
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
