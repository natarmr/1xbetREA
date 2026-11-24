.class public final synthetic La/vts0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/wts0;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/wts0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vts0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vts0;->b:La/mm40;

    iput-object p2, p0, La/vts0;->c:La/wts0;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/wts0;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/vts0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vts0;->b:La/mm40;

    iput-object p2, p0, La/vts0;->c:La/wts0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vts0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/vts0;->c:La/wts0;

    .line 6
    .line 7
    iget-object v0, v0, La/vts0;->b:La/mm40;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/fet;

    .line 15
    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x7

    .line 24
    invoke-static {v3}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v0, v2, v1, v3}, La/hxm0;->a(La/mm40;La/wts0;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    move-object/from16 v3, p2

    .line 39
    .line 40
    check-cast v3, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    and-int/lit8 v4, v3, 0x3

    .line 47
    .line 48
    const/4 v5, 0x2

    .line 49
    const/4 v6, 0x1

    .line 50
    const/4 v7, 0x0

    .line 51
    if-eq v4, v5, :cond_0

    .line 52
    .line 53
    move v4, v6

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v4, v7

    .line 56
    :goto_0
    and-int/2addr v3, v6

    .line 57
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    sget-object v3, La/qmk;->a:La/zcl;

    .line 64
    .line 65
    const/high16 v3, 0x42000000    # 32.0f

    .line 66
    .line 67
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    const/4 v12, 0x0

    .line 72
    const/16 v13, 0xd

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/high16 v10, 0x3f800000    # 1.0f

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sget-object v3, La/uc9;->e:La/nw3;

    .line 83
    .line 84
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 85
    .line 86
    const/16 v5, 0x36

    .line 87
    .line 88
    invoke-static {v3, v4, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-wide v4, v1, La/fet;->T:J

    .line 93
    .line 94
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, La/fet;->i0()V

    .line 112
    .line 113
    .line 114
    iget-boolean v8, v1, La/fet;->S:Z

    .line 115
    .line 116
    if-eqz v8, :cond_1

    .line 117
    .line 118
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 119
    .line 120
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 128
    .line 129
    invoke-static {v1, v3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    sget-object v3, La/gqw0;->w:La/shd;

    .line 133
    .line 134
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    sget-object v4, La/gqw0;->y:La/shd;

    .line 142
    .line 143
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 147
    .line 148
    .line 149
    sget-object v3, La/gqw0;->v:La/shd;

    .line 150
    .line 151
    invoke-static {v1, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    const-string v0, "TWENTY_ONE_TIMER_TITLE"

    .line 155
    .line 156
    sget-object v3, La/jm40;->b:La/jm40;

    .line 157
    .line 158
    invoke-static {v3, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    move-object/from16 v22, v1

    .line 163
    .line 164
    iget-object v1, v2, La/wts0;->a:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v2, v2, La/wts0;->b:La/wnq0;

    .line 167
    .line 168
    sget-object v29, La/j1t0;->b:La/qrq;

    .line 169
    .line 170
    sget-wide v26, La/qmk;->p:J

    .line 171
    .line 172
    sget-wide v35, La/qmk;->C:J

    .line 173
    .line 174
    new-instance v21, La/y9q0;

    .line 175
    .line 176
    const/16 v34, 0x0

    .line 177
    .line 178
    const v37, 0xfdffdd

    .line 179
    .line 180
    .line 181
    const-wide/16 v24, 0x0

    .line 182
    .line 183
    const/16 v28, 0x0

    .line 184
    .line 185
    const-wide/16 v30, 0x0

    .line 186
    .line 187
    const/16 v32, 0x0

    .line 188
    .line 189
    const/16 v33, 0x0

    .line 190
    .line 191
    move-object/from16 v23, v21

    .line 192
    .line 193
    invoke-direct/range {v23 .. v37}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 194
    .line 195
    .line 196
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 197
    .line 198
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    const/16 v24, 0x6000

    .line 203
    .line 204
    const v25, 0x1bff8

    .line 205
    .line 206
    .line 207
    move-object v8, v3

    .line 208
    move-wide v3, v4

    .line 209
    const/4 v5, 0x0

    .line 210
    move v9, v6

    .line 211
    move v10, v7

    .line 212
    const-wide/16 v6, 0x0

    .line 213
    .line 214
    move-object v11, v8

    .line 215
    const/4 v8, 0x0

    .line 216
    move v12, v9

    .line 217
    const/4 v9, 0x0

    .line 218
    move v13, v10

    .line 219
    const/4 v10, 0x0

    .line 220
    move-object v15, v11

    .line 221
    move v14, v12

    .line 222
    const-wide/16 v11, 0x0

    .line 223
    .line 224
    move/from16 v16, v13

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    move/from16 v17, v14

    .line 228
    .line 229
    move-object/from16 v18, v15

    .line 230
    .line 231
    const-wide/16 v14, 0x0

    .line 232
    .line 233
    move/from16 v19, v16

    .line 234
    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    move/from16 v20, v17

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    move-object/from16 v23, v18

    .line 242
    .line 243
    const/16 v18, 0x1

    .line 244
    .line 245
    move/from16 v26, v19

    .line 246
    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    move/from16 v27, v20

    .line 250
    .line 251
    const/16 v20, 0x0

    .line 252
    .line 253
    move-object/from16 v28, v23

    .line 254
    .line 255
    const/16 v23, 0x30

    .line 256
    .line 257
    move-object/from16 v38, v2

    .line 258
    .line 259
    move-object v2, v0

    .line 260
    move-object/from16 v0, v38

    .line 261
    .line 262
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v1, v22

    .line 266
    .line 267
    iget-boolean v2, v0, La/wnq0;->a:Z

    .line 268
    .line 269
    if-eqz v2, :cond_2

    .line 270
    .line 271
    const v2, -0x3c4350be

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 275
    .line 276
    .line 277
    const/4 v12, 0x0

    .line 278
    const/16 v13, 0xe

    .line 279
    .line 280
    const/high16 v9, 0x41000000    # 8.0f

    .line 281
    .line 282
    const/4 v10, 0x0

    .line 283
    const/4 v11, 0x0

    .line 284
    move-object/from16 v8, v28

    .line 285
    .line 286
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const/4 v13, 0x0

    .line 291
    invoke-static {v0, v2, v1, v13}, La/q5x;->f(La/wnq0;La/mm40;La/fet;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 295
    .line 296
    .line 297
    :goto_2
    const/4 v14, 0x1

    .line 298
    goto :goto_3

    .line 299
    :cond_2
    const/4 v13, 0x0

    .line 300
    const v0, -0x3c40b84d

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :goto_3
    invoke-virtual {v1, v14}, La/fet;->r(Z)V

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 315
    .line 316
    .line 317
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
