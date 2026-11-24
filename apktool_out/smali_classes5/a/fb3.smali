.class public final La/fb3;
.super La/guy;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:La/lwf;

.field public final synthetic c:La/nie0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:F

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/l7m0;


# direct methods
.method public constructor <init>(La/pz40;La/lwf;La/nie0;La/l7m0;FLkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fb3;->a:La/pz40;

    .line 2
    .line 3
    iput-object p2, p0, La/fb3;->b:La/lwf;

    .line 4
    .line 5
    iput-object p3, p0, La/fb3;->c:La/nie0;

    .line 6
    .line 7
    iput-object p4, p0, La/fb3;->d:La/l7m0;

    .line 8
    .line 9
    iput p5, p0, La/fb3;->e:F

    .line 10
    .line 11
    iput-object p6, p0, La/fb3;->f:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iput-object p7, p0, La/fb3;->g:La/l7m0;

    .line 14
    .line 15
    iput-object p8, p0, La/fb3;->h:La/l7m0;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/nt40;

    .line 6
    .line 7
    move-object/from16 v7, p2

    .line 8
    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    move-object/from16 v1, p3

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    iget-object v2, v0, La/fb3;->a:La/pz40;

    .line 21
    .line 22
    invoke-interface {v2, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, La/fb3;->b:La/lwf;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, La/fb3;->c:La/nie0;

    .line 31
    .line 32
    iget-object v3, v2, La/nie0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v4, La/cmd;->a:La/cmd;

    .line 35
    .line 36
    if-ne v3, v4, :cond_0

    .line 37
    .line 38
    sget-object v3, La/cmd;->b:La/cmd;

    .line 39
    .line 40
    iput-object v3, v2, La/nie0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_0
    const v2, -0x6e283004

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 46
    .line 47
    .line 48
    sget-object v2, La/jm40;->b:La/jm40;

    .line 49
    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sget-object v5, La/lt40;->a:La/lt40;

    .line 57
    .line 58
    invoke-static {v4, v5}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v5, La/gqw0;->b:La/zx7;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-static {v5, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget-wide v8, v7, La/fet;->T:J

    .line 70
    .line 71
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v7, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, La/fet;->i0()V

    .line 89
    .line 90
    .line 91
    iget-boolean v9, v7, La/fet;->S:Z

    .line 92
    .line 93
    if-eqz v9, :cond_1

    .line 94
    .line 95
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 96
    .line 97
    invoke-virtual {v7, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v7}, La/fet;->r0()V

    .line 102
    .line 103
    .line 104
    :goto_0
    sget-object v9, La/gqw0;->x:La/shd;

    .line 105
    .line 106
    invoke-static {v7, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v5, La/gqw0;->w:La/shd;

    .line 110
    .line 111
    invoke-static {v7, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    sget-object v6, La/gqw0;->y:La/shd;

    .line 119
    .line 120
    invoke-static {v7, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 124
    .line 125
    .line 126
    sget-object v5, La/gqw0;->v:La/shd;

    .line 127
    .line 128
    invoke-static {v7, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    iget-object v4, v0, La/fb3;->g:La/l7m0;

    .line 132
    .line 133
    invoke-static {v4, v7, v10}, La/j47;->N(La/l7m0;La/fet;I)V

    .line 134
    .line 135
    .line 136
    sget-object v4, La/o7k0;->c:La/n0q;

    .line 137
    .line 138
    iget-object v5, v0, La/fb3;->h:La/l7m0;

    .line 139
    .line 140
    invoke-virtual {v7, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    sget-object v9, La/ukd;->a:La/cl5;

    .line 149
    .line 150
    if-nez v6, :cond_2

    .line 151
    .line 152
    if-ne v8, v9, :cond_3

    .line 153
    .line 154
    :cond_2
    new-instance v8, La/eb3;

    .line 155
    .line 156
    invoke-direct {v8, v5, v10}, La/eb3;-><init>(La/l7m0;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_3
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 163
    .line 164
    invoke-static {v4, v8}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 169
    .line 170
    invoke-virtual {v7, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 175
    .line 176
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    sget-object v8, La/jd8;->n:La/ljc;

    .line 181
    .line 182
    invoke-static {v4, v5, v6, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-static {v10, v7, v4}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 187
    .line 188
    .line 189
    const/4 v4, 0x1

    .line 190
    invoke-virtual {v7, v4}, La/fet;->r(Z)V

    .line 191
    .line 192
    .line 193
    iget-object v4, v0, La/fb3;->d:La/l7m0;

    .line 194
    .line 195
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, La/t9f0;

    .line 200
    .line 201
    iget-object v5, v5, La/t9f0;->a:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v5, v7, v10}, La/j47;->r0(Ljava/lang/String;La/fet;I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, La/t9f0;

    .line 211
    .line 212
    iget-boolean v5, v5, La/t9f0;->d:Z

    .line 213
    .line 214
    if-eqz v5, :cond_6

    .line 215
    .line 216
    const v5, -0x6e1d84df

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v5}, La/fet;->e0(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    sget-object v2, La/qmk;->a:La/zcl;

    .line 227
    .line 228
    const/4 v15, 0x0

    .line 229
    const/16 v16, 0xd

    .line 230
    .line 231
    const/4 v12, 0x0

    .line 232
    const/high16 v13, 0x41000000    # 8.0f

    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const/high16 v3, 0x42400000    # 48.0f

    .line 240
    .line 241
    invoke-static {v2, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    sget-object v3, La/lt40;->c:La/lt40;

    .line 246
    .line 247
    invoke-static {v2, v3}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    move-object v3, v4

    .line 252
    sget-object v4, La/vxl;->c:La/vxl;

    .line 253
    .line 254
    new-instance v11, La/fyl;

    .line 255
    .line 256
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, La/t9f0;

    .line 261
    .line 262
    iget-object v12, v3, La/t9f0;->e:La/a4x;

    .line 263
    .line 264
    iget v3, v0, La/fb3;->e:F

    .line 265
    .line 266
    const/16 v5, 0xa

    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    invoke-static {v3, v6, v3, v6, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 270
    .line 271
    .line 272
    move-result-object v15

    .line 273
    const/16 v16, 0x0

    .line 274
    .line 275
    const/16 v17, 0x6

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const/4 v14, 0x0

    .line 279
    invoke-direct/range {v11 .. v17}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 280
    .line 281
    .line 282
    move-object v3, v11

    .line 283
    iget-object v0, v0, La/fb3;->f:Lkotlin/jvm/functions/Function1;

    .line 284
    .line 285
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    if-nez v5, :cond_4

    .line 294
    .line 295
    if-ne v6, v9, :cond_5

    .line 296
    .line 297
    :cond_4
    new-instance v6, La/qr0;

    .line 298
    .line 299
    const/16 v5, 0xe

    .line 300
    .line 301
    invoke-direct {v6, v0, v5}, La/qr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_5
    move-object v5, v6

    .line 308
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 309
    .line 310
    const/16 v8, 0x180

    .line 311
    .line 312
    const/16 v9, 0x28

    .line 313
    .line 314
    const/4 v6, 0x0

    .line 315
    invoke-static/range {v2 .. v9}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    goto :goto_1

    .line 322
    :cond_6
    const v0, -0x6e107272

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    :goto_1
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    return-object v1
.end method
