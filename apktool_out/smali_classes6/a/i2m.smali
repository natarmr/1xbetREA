.class public abstract La/i2m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[La/iiy;

.field public static final b:La/zai0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/i2m;

    .line 4
    .line 5
    const-string v2, "isActive"

    .line 6
    .line 7
    const-string v3, "isActive(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-array v1, v4, [La/iiy;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, La/i2m;->a:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zai0;

    .line 21
    .line 22
    const-string v1, "IsActive"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/zai0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/i2m;->b:La/zai0;

    .line 28
    .line 29
    return-void
.end method

.method public static final a(La/mm40;JJLa/fet;I)V
    .locals 8

    .line 1
    const v0, 0x74e1e875

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p6

    .line 17
    invoke-virtual {p5, p1, p2}, La/fet;->f(J)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p5, p3, p4}, La/fet;->f(J)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v2, 0x92

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x1

    .line 47
    if-eq v1, v2, :cond_3

    .line 48
    .line 49
    move v1, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move v1, v3

    .line 52
    :goto_3
    and-int/2addr v0, v4

    .line 53
    invoke-virtual {p5, v0, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    sget-object v0, La/qmk;->a:La/zcl;

    .line 60
    .line 61
    const/high16 v0, 0x41000000    # 8.0f

    .line 62
    .line 63
    invoke-static {p0, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/high16 v1, 0x40c00000    # 6.0f

    .line 68
    .line 69
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/high16 v1, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-static {v1}, La/vgg0;->a(F)La/ugg0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v0, p1, p2, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/high16 v2, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-static {v1}, La/vgg0;->a(F)La/ugg0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v0, v2, p3, p4, v1}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "DS_CUSTOM_VERTICAL_INDICATOR_ITEM_BOX"

    .line 94
    .line 95
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v3, p5, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_4
    invoke-virtual {p5}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_4
    invoke-virtual {p5}, La/fet;->u()La/yfe0;

    .line 107
    .line 108
    .line 109
    move-result-object p5

    .line 110
    if-eqz p5, :cond_5

    .line 111
    .line 112
    new-instance v0, La/hzh;

    .line 113
    .line 114
    const/4 v7, 0x1

    .line 115
    move-object v1, p0

    .line 116
    move-wide v2, p1

    .line 117
    move-wide v4, p3

    .line 118
    move v6, p6

    .line 119
    invoke-direct/range {v0 .. v7}, La/hzh;-><init>(La/mm40;JJIB)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p5, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 123
    .line 124
    :cond_5
    return-void
.end method

.method public static final b(La/mm40;La/j2m;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v9, p3

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v2, 0x391c948b

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v2}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v2, v9, 0x6

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move v2, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v9

    .line 35
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 36
    .line 37
    if-nez v4, :cond_4

    .line 38
    .line 39
    and-int/lit8 v4, v9, 0x40

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v7, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    :goto_2
    if-eqz v4, :cond_3

    .line 53
    .line 54
    const/16 v4, 0x20

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    const/16 v4, 0x10

    .line 58
    .line 59
    :goto_3
    or-int/2addr v2, v4

    .line 60
    :cond_4
    and-int/lit8 v4, v2, 0x13

    .line 61
    .line 62
    const/16 v5, 0x12

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x1

    .line 66
    if-eq v4, v5, :cond_5

    .line 67
    .line 68
    move v4, v11

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    move v4, v10

    .line 71
    :goto_4
    and-int/2addr v2, v11

    .line 72
    invoke-virtual {v7, v2, v4}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_d

    .line 77
    .line 78
    iget v2, v1, La/j2m;->a:I

    .line 79
    .line 80
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 81
    .line 82
    invoke-direct {v4, v11, v3, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v4}, La/l1e0;->e(ILkotlin/ranges/IntRange;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iget v4, v1, La/j2m;->b:I

    .line 90
    .line 91
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 92
    .line 93
    invoke-direct {v5, v10, v3, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-static {v4, v5}, La/l1e0;->e(ILkotlin/ranges/IntRange;)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 101
    .line 102
    invoke-direct {v4, v11, v2, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 103
    .line 104
    .line 105
    new-instance v12, Lkotlin/ranges/IntRange;

    .line 106
    .line 107
    invoke-direct {v12, v10, v3, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 108
    .line 109
    .line 110
    sget-object v2, La/qmk;->a:La/zcl;

    .line 111
    .line 112
    new-instance v2, La/qw3;

    .line 113
    .line 114
    new-instance v3, La/jf4;

    .line 115
    .line 116
    const/16 v5, 0xe

    .line 117
    .line 118
    invoke-direct {v3, v5}, La/jf4;-><init>(B)V

    .line 119
    .line 120
    .line 121
    const/high16 v5, 0x40000000    # 2.0f

    .line 122
    .line 123
    invoke-direct {v2, v5, v11, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 124
    .line 125
    .line 126
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 127
    .line 128
    invoke-static {v2, v3, v7, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-wide v5, v7, La/fet;->T:J

    .line 133
    .line 134
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v7, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, La/fet;->i0()V

    .line 152
    .line 153
    .line 154
    iget-boolean v8, v7, La/fet;->S:Z

    .line 155
    .line 156
    if-eqz v8, :cond_6

    .line 157
    .line 158
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 159
    .line 160
    invoke-virtual {v7, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_6
    invoke-virtual {v7}, La/fet;->r0()V

    .line 165
    .line 166
    .line 167
    :goto_5
    sget-object v8, La/gqw0;->x:La/shd;

    .line 168
    .line 169
    invoke-static {v7, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    sget-object v2, La/gqw0;->w:La/shd;

    .line 173
    .line 174
    invoke-static {v7, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    sget-object v3, La/gqw0;->y:La/shd;

    .line 182
    .line 183
    invoke-static {v7, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 187
    .line 188
    .line 189
    sget-object v2, La/gqw0;->v:La/shd;

    .line 190
    .line 191
    invoke-static {v7, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    const v2, -0x6aae9c0f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    iget v13, v4, Lkotlin/ranges/a;->b:I

    .line 201
    .line 202
    if-gt v11, v13, :cond_c

    .line 203
    .line 204
    move v14, v11

    .line 205
    :goto_6
    iget v2, v12, Lkotlin/ranges/a;->b:I

    .line 206
    .line 207
    if-gt v14, v2, :cond_7

    .line 208
    .line 209
    iget v2, v12, Lkotlin/ranges/a;->a:I

    .line 210
    .line 211
    if-gt v2, v14, :cond_7

    .line 212
    .line 213
    move v2, v11

    .line 214
    goto :goto_7

    .line 215
    :cond_7
    move v2, v10

    .line 216
    :goto_7
    invoke-virtual {v7, v2}, La/fet;->h(Z)Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-nez v3, :cond_8

    .line 225
    .line 226
    sget-object v3, La/ukd;->a:La/cl5;

    .line 227
    .line 228
    if-ne v4, v3, :cond_9

    .line 229
    .line 230
    :cond_8
    new-instance v4, La/z;

    .line 231
    .line 232
    const/16 v3, 0x13

    .line 233
    .line 234
    invoke-direct {v4, v3, v2}, La/z;-><init>(BZ)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 241
    .line 242
    sget-object v3, La/jm40;->b:La/jm40;

    .line 243
    .line 244
    invoke-static {v3, v10, v4}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    if-eqz v2, :cond_a

    .line 249
    .line 250
    const v4, -0x6aae8044

    .line 251
    .line 252
    .line 253
    invoke-static {v7, v4, v7, v10}, La/cs0;->e(La/fet;ILa/fet;Z)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    goto :goto_8

    .line 258
    :cond_a
    const v4, -0x6aae7c5a

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v4}, La/fet;->e0(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {v7}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 269
    .line 270
    .line 271
    move-result-wide v4

    .line 272
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 273
    .line 274
    .line 275
    :goto_8
    if-eqz v2, :cond_b

    .line 276
    .line 277
    const v2, -0x6aae7244

    .line 278
    .line 279
    .line 280
    invoke-static {v7, v2, v7, v10}, La/cs0;->e(La/fet;ILa/fet;Z)J

    .line 281
    .line 282
    .line 283
    move-result-wide v15

    .line 284
    goto :goto_9

    .line 285
    :cond_b
    const v2, -0x6aae6e62

    .line 286
    .line 287
    .line 288
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v7}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v15

    .line 299
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    :goto_9
    const/4 v8, 0x0

    .line 303
    move-object v2, v3

    .line 304
    move-wide v3, v4

    .line 305
    move-wide v5, v15

    .line 306
    invoke-static/range {v2 .. v8}, La/i2m;->a(La/mm40;JJLa/fet;I)V

    .line 307
    .line 308
    .line 309
    if-eq v14, v13, :cond_c

    .line 310
    .line 311
    add-int/lit8 v14, v14, 0x1

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_c
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_d
    invoke-virtual {v7}, La/fet;->X()V

    .line 322
    .line 323
    .line 324
    :goto_a
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-eqz v2, :cond_e

    .line 329
    .line 330
    new-instance v3, La/kkl;

    .line 331
    .line 332
    const/16 v4, 0xc

    .line 333
    .line 334
    invoke-direct {v3, v0, v1, v9, v4}, La/kkl;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 335
    .line 336
    .line 337
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 338
    .line 339
    :cond_e
    return-void
.end method
