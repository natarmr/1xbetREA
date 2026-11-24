.class public final synthetic La/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a0;->a:B

    iput-boolean p1, p0, La/a0;->b:Z

    iput-object p2, p0, La/a0;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/a0;->a:B

    iput-boolean p1, p0, La/a0;->b:Z

    iput-object p2, p0, La/a0;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, v0, La/a0;->c:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iget-boolean v5, v0, La/a0;->b:Z

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    check-cast v0, La/fet;

    .line 18
    .line 19
    move-object/from16 v1, p2

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v6}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v5, v4, v0, v1}, La/rsr0;->v(ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v4, p1

    .line 37
    .line 38
    check-cast v4, La/fet;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit8 v5, v1, 0x3

    .line 49
    .line 50
    if-eq v5, v3, :cond_0

    .line 51
    .line 52
    move v2, v6

    .line 53
    :cond_0
    and-int/2addr v1, v6

    .line 54
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    sget-object v7, La/oe9;->c:La/oe9;

    .line 61
    .line 62
    new-instance v8, La/te9;

    .line 63
    .line 64
    const v1, 0x7f08081b

    .line 65
    .line 66
    .line 67
    invoke-direct {v8, v1}, La/te9;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sget-object v6, La/qul;->e:La/qul;

    .line 71
    .line 72
    new-instance v2, La/wul;

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x0

    .line 76
    iget-boolean v9, v0, La/a0;->b:Z

    .line 77
    .line 78
    move-object v5, v2

    .line 79
    invoke-direct/range {v5 .. v11}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 80
    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x1

    .line 84
    const/4 v1, 0x0

    .line 85
    iget-object v3, v0, La/a0;->c:Lkotlin/jvm/functions/Function0;

    .line 86
    .line 87
    invoke-static/range {v1 .. v6}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {v4}, La/fet;->X()V

    .line 92
    .line 93
    .line 94
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_1
    move-object/from16 v12, p1

    .line 98
    .line 99
    check-cast v12, La/fet;

    .line 100
    .line 101
    move-object/from16 v1, p2

    .line 102
    .line 103
    check-cast v1, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    and-int/lit8 v4, v1, 0x3

    .line 110
    .line 111
    if-eq v4, v3, :cond_2

    .line 112
    .line 113
    move v3, v6

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    move v3, v2

    .line 116
    :goto_1
    and-int/2addr v1, v6

    .line 117
    invoke-virtual {v12, v1, v3}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    sget-object v1, La/qmk;->a:La/zcl;

    .line 124
    .line 125
    const/high16 v1, 0x42400000    # 48.0f

    .line 126
    .line 127
    sget-object v3, La/jm40;->b:La/jm40;

    .line 128
    .line 129
    invoke-static {v3, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v19, 0x18

    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x0

    .line 139
    iget-boolean v1, v0, La/a0;->b:Z

    .line 140
    .line 141
    iget-object v0, v0, La/a0;->c:Lkotlin/jvm/functions/Function0;

    .line 142
    .line 143
    move-object/from16 v18, v0

    .line 144
    .line 145
    move/from16 v16, v1

    .line 146
    .line 147
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 152
    .line 153
    invoke-static {v1, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-wide v4, v12, La/fet;->T:J

    .line 158
    .line 159
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, La/fet;->i0()V

    .line 177
    .line 178
    .line 179
    iget-boolean v7, v12, La/fet;->S:Z

    .line 180
    .line 181
    if-eqz v7, :cond_3

    .line 182
    .line 183
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 184
    .line 185
    invoke-virtual {v12, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_3
    invoke-virtual {v12}, La/fet;->r0()V

    .line 190
    .line 191
    .line 192
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 193
    .line 194
    invoke-static {v12, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    sget-object v1, La/gqw0;->w:La/shd;

    .line 198
    .line 199
    invoke-static {v12, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    sget-object v4, La/gqw0;->y:La/shd;

    .line 207
    .line 208
    invoke-static {v12, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 212
    .line 213
    .line 214
    sget-object v1, La/gqw0;->v:La/shd;

    .line 215
    .line 216
    invoke-static {v12, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    const v0, 0x7f0809d9

    .line 220
    .line 221
    .line 222
    invoke-static {v0, v2, v12}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    if-eqz v16, :cond_4

    .line 227
    .line 228
    const v0, 0x4d5a5f25    # 2.2897928E8f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 232
    .line 233
    .line 234
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 235
    .line 236
    invoke-virtual {v12, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 241
    .line 242
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 243
    .line 244
    .line 245
    move-result-wide v0

    .line 246
    :goto_3
    invoke-virtual {v12, v2}, La/fet;->r(Z)V

    .line 247
    .line 248
    .line 249
    move-wide v10, v0

    .line 250
    goto :goto_4

    .line 251
    :cond_4
    const v0, 0x4d5a6347    # 2.2899621E8f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 255
    .line 256
    .line 257
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 258
    .line 259
    invoke-virtual {v12, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 264
    .line 265
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    goto :goto_3

    .line 270
    :goto_4
    const/high16 v0, 0x41c00000    # 24.0f

    .line 271
    .line 272
    invoke-static {v3, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    const/16 v13, 0x38

    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const/4 v8, 0x0

    .line 280
    invoke-static/range {v7 .. v14}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 288
    .line 289
    .line 290
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_2
    move-object/from16 v0, p1

    .line 294
    .line 295
    check-cast v0, La/fet;

    .line 296
    .line 297
    move-object/from16 v1, p2

    .line 298
    .line 299
    check-cast v1, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-static {v6}, La/x8x;->L(I)I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    invoke-static {v5, v4, v0, v1}, La/ay3;->i(ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 309
    .line 310
    .line 311
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_3
    move-object/from16 v0, p1

    .line 315
    .line 316
    check-cast v0, La/fet;

    .line 317
    .line 318
    move-object/from16 v1, p2

    .line 319
    .line 320
    check-cast v1, Ljava/lang/Integer;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {v6}, La/x8x;->L(I)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    invoke-static {v5, v4, v0, v1}, La/ay3;->b(ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 330
    .line 331
    .line 332
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
