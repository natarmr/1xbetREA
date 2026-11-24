.class public final synthetic La/npb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w2d;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/w2d;La/l7m0;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/npb0;->a:B

    iput-object p1, p0, La/npb0;->b:La/w2d;

    iput-object p2, p0, La/npb0;->c:La/l7m0;

    iput-object p3, p0, La/npb0;->d:La/l7m0;

    iput-object p4, p0, La/npb0;->e:La/l7m0;

    iput-object p5, p0, La/npb0;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/npb0;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/npb0;->f:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v8, v0, La/npb0;->e:La/l7m0;

    .line 15
    .line 16
    iget-object v9, v0, La/npb0;->d:La/l7m0;

    .line 17
    .line 18
    iget-object v10, v0, La/npb0;->c:La/l7m0;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v14, p1

    .line 24
    .line 25
    check-cast v14, La/fet;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v11, v1, 0x3

    .line 36
    .line 37
    if-eq v11, v4, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v6

    .line 42
    :goto_0
    and-int/2addr v1, v5

    .line 43
    invoke-virtual {v14, v1, v4}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    sget-object v1, La/uc9;->c:La/mw3;

    .line 50
    .line 51
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 52
    .line 53
    invoke-static {v1, v4, v14, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-wide v11, v14, La/fet;->T:J

    .line 58
    .line 59
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v14, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v14}, La/fet;->i0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v11, v14, La/fet;->S:Z

    .line 80
    .line 81
    if-eqz v11, :cond_1

    .line 82
    .line 83
    invoke-virtual {v14, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v14}, La/fet;->r0()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 91
    .line 92
    invoke-static {v14, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, La/gqw0;->w:La/shd;

    .line 96
    .line 97
    invoke-static {v14, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, La/gqw0;->y:La/shd;

    .line 105
    .line 106
    invoke-static {v14, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v14}, La/jpm0;->n(La/fet;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/gqw0;->v:La/shd;

    .line 113
    .line 114
    invoke-static {v14, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, La/ay;

    .line 118
    .line 119
    const/4 v2, 0x4

    .line 120
    invoke-direct {v1, v10, v9, v8, v2}, La/ay;-><init>(La/l7m0;La/l7m0;La/l7m0;B)V

    .line 121
    .line 122
    .line 123
    const v2, -0x7f6fb3b3

    .line 124
    .line 125
    .line 126
    invoke-static {v2, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    new-instance v1, La/ru80;

    .line 131
    .line 132
    const/16 v2, 0x13

    .line 133
    .line 134
    invoke-direct {v1, v7, v2}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 135
    .line 136
    .line 137
    const v2, 0x7c0b17ec

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const/16 v16, 0xdc0

    .line 145
    .line 146
    const/4 v11, 0x0

    .line 147
    iget-object v12, v0, La/npb0;->b:La/w2d;

    .line 148
    .line 149
    move-object v15, v14

    .line 150
    move-object v14, v1

    .line 151
    invoke-static/range {v11 .. v16}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 152
    .line 153
    .line 154
    move-object v14, v15

    .line 155
    const/4 v15, 0x6

    .line 156
    const/16 v16, 0x6

    .line 157
    .line 158
    sget-object v11, La/zfi0;->a:La/zfi0;

    .line 159
    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    invoke-static/range {v11 .. v16}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v14, v5}, La/fet;->r(Z)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    invoke-virtual {v14}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_0
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, La/fet;

    .line 178
    .line 179
    move-object/from16 v11, p2

    .line 180
    .line 181
    check-cast v11, Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    and-int/lit8 v12, v11, 0x3

    .line 188
    .line 189
    if-eq v12, v4, :cond_3

    .line 190
    .line 191
    move v4, v5

    .line 192
    goto :goto_3

    .line 193
    :cond_3
    move v4, v6

    .line 194
    :goto_3
    and-int/2addr v11, v5

    .line 195
    invoke-virtual {v1, v11, v4}, La/fet;->U(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_5

    .line 200
    .line 201
    sget-object v4, La/uc9;->c:La/mw3;

    .line 202
    .line 203
    sget-object v11, La/gqw0;->m:La/xx7;

    .line 204
    .line 205
    invoke-static {v4, v11, v1, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    iget-wide v11, v1, La/fet;->T:J

    .line 210
    .line 211
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 224
    .line 225
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, La/fet;->i0()V

    .line 229
    .line 230
    .line 231
    iget-boolean v12, v1, La/fet;->S:Z

    .line 232
    .line 233
    if-eqz v12, :cond_4

    .line 234
    .line 235
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_4
    invoke-virtual {v1}, La/fet;->r0()V

    .line 240
    .line 241
    .line 242
    :goto_4
    sget-object v2, La/gqw0;->x:La/shd;

    .line 243
    .line 244
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    sget-object v2, La/gqw0;->w:La/shd;

    .line 248
    .line 249
    invoke-static {v1, v11, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    sget-object v4, La/gqw0;->y:La/shd;

    .line 257
    .line 258
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 262
    .line 263
    .line 264
    sget-object v2, La/gqw0;->v:La/shd;

    .line 265
    .line 266
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 267
    .line 268
    .line 269
    new-instance v2, La/ay;

    .line 270
    .line 271
    const/4 v3, 0x3

    .line 272
    invoke-direct {v2, v10, v9, v8, v3}, La/ay;-><init>(La/l7m0;La/l7m0;La/l7m0;B)V

    .line 273
    .line 274
    .line 275
    const v4, -0x612eb53b

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    new-instance v2, La/ru80;

    .line 283
    .line 284
    invoke-direct {v2, v7, v3}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 285
    .line 286
    .line 287
    const v3, -0x6f96b75c

    .line 288
    .line 289
    .line 290
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    const/16 v11, 0xdc0

    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    iget-object v7, v0, La/npb0;->b:La/w2d;

    .line 298
    .line 299
    move-object v10, v1

    .line 300
    invoke-static/range {v6 .. v11}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 301
    .line 302
    .line 303
    move-object v9, v10

    .line 304
    const/4 v10, 0x6

    .line 305
    const/4 v11, 0x6

    .line 306
    sget-object v6, La/zfi0;->a:La/zfi0;

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    const/4 v8, 0x0

    .line 310
    invoke-static/range {v6 .. v11}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v9, v5}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_5
    move-object v9, v1

    .line 318
    invoke-virtual {v9}, La/fet;->X()V

    .line 319
    .line 320
    .line 321
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
