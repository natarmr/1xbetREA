.class public abstract La/jcp0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ccp0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, La/ccp0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/zfn;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/jcp0;->a:La/zfn;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/wdp0;Lkotlin/jvm/functions/Function2;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v2, v0, La/xcp0;

    .line 14
    .line 15
    const/high16 v7, 0x3f800000    # 1.0f

    .line 16
    .line 17
    sget-object v3, La/jcp0;->a:La/zfn;

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    sget-object v11, La/jm40;->b:La/jm40;

    .line 23
    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    const v1, -0x4766d690

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 30
    .line 31
    .line 32
    check-cast v0, La/xcp0;

    .line 33
    .line 34
    sget-object v1, La/fap;->b:La/zfn;

    .line 35
    .line 36
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/w6n;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    sget-object v1, La/w6n;->d:La/w6n;

    .line 45
    .line 46
    :cond_0
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, La/ycl;

    .line 51
    .line 52
    instance-of v3, v0, La/qcp0;

    .line 53
    .line 54
    const/16 v5, 0x38

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const v3, -0x3ca7af0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 62
    .line 63
    .line 64
    sget-object v3, La/bmd;->n:La/zfn;

    .line 65
    .line 66
    sget-object v6, La/k6z;->a:La/k6z;

    .line 67
    .line 68
    invoke-virtual {v3, v6}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v6, La/dn80;

    .line 73
    .line 74
    invoke-direct {v6, v11, v0, v1, v10}, La/dn80;-><init>(La/mm40;La/xcp0;La/w6n;B)V

    .line 75
    .line 76
    .line 77
    const v1, -0x4a88886e

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v6, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v3, v1, v4, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v11, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    iget v2, v2, La/ycl;->a:F

    .line 94
    .line 95
    invoke-static {v11, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-static {v11, v9, v10, v8}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_0
    invoke-interface {v1, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v0, La/qcp0;

    .line 109
    .line 110
    iget-object v0, v0, La/qcp0;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v10, v4, v1, v0}, La/ggp0;->a(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    instance-of v2, v0, La/tcp0;

    .line 120
    .line 121
    if-eqz v2, :cond_3

    .line 122
    .line 123
    const v2, -0x3bc8196

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 127
    .line 128
    .line 129
    sget-object v2, La/bmd;->n:La/zfn;

    .line 130
    .line 131
    sget-object v3, La/k6z;->a:La/k6z;

    .line 132
    .line 133
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    new-instance v3, La/dn80;

    .line 138
    .line 139
    const/4 v6, 0x1

    .line 140
    invoke-direct {v3, v11, v0, v1, v6}, La/dn80;-><init>(La/mm40;La/xcp0;La/w6n;B)V

    .line 141
    .line 142
    .line 143
    const v0, -0x63da4a37

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v3, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v2, v0, v4, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    :goto_1
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_3
    const v0, -0x8616223

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v4, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    throw v0

    .line 168
    :cond_4
    instance-of v2, v0, La/rdp0;

    .line 169
    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    const v2, -0x4766c67d

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 176
    .line 177
    .line 178
    check-cast v0, La/rdp0;

    .line 179
    .line 180
    and-int/lit16 v2, v1, 0x3fe

    .line 181
    .line 182
    sget-object v5, La/fap;->b:La/zfn;

    .line 183
    .line 184
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, La/w6n;

    .line 189
    .line 190
    if-nez v5, :cond_5

    .line 191
    .line 192
    sget-object v5, La/w6n;->d:La/w6n;

    .line 193
    .line 194
    :cond_5
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    move-object v12, v3

    .line 199
    check-cast v12, La/ycl;

    .line 200
    .line 201
    instance-of v3, v0, La/jdp0;

    .line 202
    .line 203
    if-eqz v3, :cond_8

    .line 204
    .line 205
    const v3, 0x5e919b6b

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 209
    .line 210
    .line 211
    move-object v13, v0

    .line 212
    check-cast v13, La/jdp0;

    .line 213
    .line 214
    iget-object v14, v13, La/jdp0;->c:La/vy;

    .line 215
    .line 216
    iget-object v1, v13, La/jdp0;->b:La/i5a0;

    .line 217
    .line 218
    and-int/lit8 v0, p3, 0xe

    .line 219
    .line 220
    shl-int/2addr v2, v8

    .line 221
    and-int/lit16 v2, v2, 0x1c00

    .line 222
    .line 223
    or-int/2addr v0, v2

    .line 224
    const/4 v6, 0x0

    .line 225
    move-object/from16 v3, p1

    .line 226
    .line 227
    move-object v2, v5

    .line 228
    move v5, v0

    .line 229
    move-object v0, v11

    .line 230
    invoke-static/range {v0 .. v6}, La/x2x;->t(La/mm40;La/i5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-eqz v12, :cond_6

    .line 238
    .line 239
    iget v2, v12, La/ycl;->a:F

    .line 240
    .line 241
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    goto :goto_2

    .line 246
    :cond_6
    invoke-static {v0, v9, v10, v8}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    :goto_2
    invoke-interface {v1, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-object v2, v13, La/jdp0;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v10, v4, v1, v2}, La/ggp0;->a(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    if-nez v14, :cond_7

    .line 260
    .line 261
    const v0, 0x5e99df68

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_7
    const v1, 0x5e99df69

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 275
    .line 276
    .line 277
    sget-object v1, La/qmk;->a:La/zcl;

    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    const/16 v16, 0xd

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    const/high16 v13, 0x40800000    # 4.0f

    .line 284
    .line 285
    move-object v1, v14

    .line 286
    const/4 v14, 0x0

    .line 287
    move-object v11, v0

    .line 288
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0, v1, v4, v10}, La/xf0;->a(La/mm40;La/vy;La/fet;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 296
    .line 297
    .line 298
    :goto_3
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_8
    move v1, v2

    .line 303
    move-object v2, v5

    .line 304
    instance-of v3, v0, La/odp0;

    .line 305
    .line 306
    if-eqz v3, :cond_9

    .line 307
    .line 308
    const v3, -0xd76c853

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 312
    .line 313
    .line 314
    check-cast v0, La/odp0;

    .line 315
    .line 316
    iget-object v0, v0, La/odp0;->a:La/d5a0;

    .line 317
    .line 318
    and-int/lit8 v3, p3, 0xe

    .line 319
    .line 320
    shl-int/2addr v1, v8

    .line 321
    and-int/lit16 v1, v1, 0x1c00

    .line 322
    .line 323
    or-int v5, v3, v1

    .line 324
    .line 325
    const/4 v6, 0x0

    .line 326
    move-object/from16 v3, p1

    .line 327
    .line 328
    move-object v1, v0

    .line 329
    move-object v0, v11

    .line 330
    invoke-static/range {v0 .. v6}, La/x2x;->t(La/mm40;La/i5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 334
    .line 335
    .line 336
    :goto_4
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :cond_9
    const v0, -0xd773359

    .line 341
    .line 342
    .line 343
    invoke-static {v0, v4, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    throw v0

    .line 348
    :cond_a
    const v0, -0x4766dc62

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v4, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    throw v0
.end method
