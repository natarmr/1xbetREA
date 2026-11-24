.class public final synthetic La/u57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/fqj0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/u57;->a:B

    iput p1, p0, La/u57;->b:F

    iput-object p2, p0, La/u57;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/omm;F)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/u57;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u57;->c:Ljava/lang/Object;

    iput p2, p0, La/u57;->b:F

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/u57;->a:B

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    iget v2, p0, La/u57;->b:F

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, p0, La/u57;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, La/omm;

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/rk80;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    move-object/from16 v2, p3

    .line 32
    .line 33
    check-cast v2, La/fet;

    .line 34
    .line 35
    move-object/from16 v8, p4

    .line 36
    .line 37
    check-cast v8, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    and-int/lit8 v0, v8, 0x30

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/16 v0, 0x20

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/16 v0, 0x10

    .line 60
    .line 61
    :goto_0
    or-int/2addr v8, v0

    .line 62
    :cond_1
    and-int/lit16 v0, v8, 0x91

    .line 63
    .line 64
    const/16 v9, 0x90

    .line 65
    .line 66
    if-eq v0, v9, :cond_2

    .line 67
    .line 68
    move v0, v5

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v0, v6

    .line 71
    :goto_1
    and-int/2addr v8, v5

    .line 72
    invoke-virtual {v2, v8, v0}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v8, La/qw3;

    .line 83
    .line 84
    new-instance v9, La/jf4;

    .line 85
    .line 86
    const/16 v10, 0xe

    .line 87
    .line 88
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 89
    .line 90
    .line 91
    const/high16 v10, -0x3e100000    # -30.0f

    .line 92
    .line 93
    invoke-direct {v8, v10, v5, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 94
    .line 95
    .line 96
    sget-object v9, La/gqw0;->m:La/xx7;

    .line 97
    .line 98
    const/4 v10, 0x6

    .line 99
    invoke-static {v8, v9, v2, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    iget-wide v9, v2, La/fet;->T:J

    .line 104
    .line 105
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, La/fet;->i0()V

    .line 123
    .line 124
    .line 125
    iget-boolean v11, v2, La/fet;->S:Z

    .line 126
    .line 127
    if-eqz v11, :cond_3

    .line 128
    .line 129
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 130
    .line 131
    invoke-virtual {v2, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {v2}, La/fet;->r0()V

    .line 136
    .line 137
    .line 138
    :goto_2
    sget-object v11, La/gqw0;->x:La/shd;

    .line 139
    .line 140
    invoke-static {v2, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    sget-object v8, La/gqw0;->w:La/shd;

    .line 144
    .line 145
    invoke-static {v2, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    sget-object v9, La/gqw0;->y:La/shd;

    .line 153
    .line 154
    invoke-static {v2, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 158
    .line 159
    .line 160
    sget-object v8, La/gqw0;->v:La/shd;

    .line 161
    .line 162
    invoke-static {v2, v0, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, v7, La/omm;->a:La/a4x;

    .line 166
    .line 167
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/uj60;

    .line 172
    .line 173
    invoke-static {v0, v2, v6}, La/dub;->a(La/uj60;La/fet;I)V

    .line 174
    .line 175
    .line 176
    sget-object v0, La/qmk;->a:La/zcl;

    .line 177
    .line 178
    const/high16 v0, 0x43a00000    # 320.0f

    .line 179
    .line 180
    invoke-static {v3, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    const/4 v11, 0x0

    .line 189
    const/4 v13, 0x5

    .line 190
    const/4 v9, 0x0

    .line 191
    const/high16 v10, 0x42000000    # 32.0f

    .line 192
    .line 193
    iget v12, p0, La/u57;->b:F

    .line 194
    .line 195
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    iget-object v0, v7, La/omm;->a:La/a4x;

    .line 200
    .line 201
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/uj60;

    .line 206
    .line 207
    invoke-static {p0, v0, v2, v6}, La/dub;->M(La/mm40;La/uj60;La/fet;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_4
    invoke-virtual {v2}, La/fet;->X()V

    .line 215
    .line 216
    .line 217
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_0
    check-cast v7, La/fqj0;

    .line 221
    .line 222
    move-object p0, p1

    .line 223
    check-cast p0, La/g9z;

    .line 224
    .line 225
    move-object/from16 v0, p2

    .line 226
    .line 227
    check-cast v0, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-object/from16 v0, p3

    .line 233
    .line 234
    check-cast v0, La/fet;

    .line 235
    .line 236
    move-object/from16 v3, p4

    .line 237
    .line 238
    check-cast v3, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    and-int/lit16 p0, v3, 0x81

    .line 248
    .line 249
    if-eq p0, v1, :cond_5

    .line 250
    .line 251
    move p0, v5

    .line 252
    goto :goto_4

    .line 253
    :cond_5
    move p0, v6

    .line 254
    :goto_4
    and-int/lit8 v1, v3, 0x1

    .line 255
    .line 256
    invoke-virtual {v0, v1, p0}, La/fet;->U(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    if-eqz p0, :cond_6

    .line 261
    .line 262
    sget-object p0, La/qmk;->a:La/zcl;

    .line 263
    .line 264
    const/4 v12, 0x0

    .line 265
    const/16 v13, 0xd

    .line 266
    .line 267
    sget-object v8, La/jm40;->b:La/jm40;

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    const/high16 v10, 0x41000000    # 8.0f

    .line 271
    .line 272
    const/4 v11, 0x0

    .line 273
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {p0, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {p0, v7, v0, v6}, La/p7x;->h(La/mm40;La/fqj0;La/fet;I)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_6
    invoke-virtual {v0}, La/fet;->X()V

    .line 286
    .line 287
    .line 288
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_1
    check-cast v7, La/fqj0;

    .line 292
    .line 293
    move-object p0, p1

    .line 294
    check-cast p0, La/g9z;

    .line 295
    .line 296
    move-object/from16 v0, p2

    .line 297
    .line 298
    check-cast v0, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-object/from16 v0, p3

    .line 304
    .line 305
    check-cast v0, La/fet;

    .line 306
    .line 307
    move-object/from16 v8, p4

    .line 308
    .line 309
    check-cast v8, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    and-int/lit16 p0, v8, 0x81

    .line 319
    .line 320
    if-eq p0, v1, :cond_7

    .line 321
    .line 322
    move p0, v5

    .line 323
    goto :goto_6

    .line 324
    :cond_7
    move p0, v6

    .line 325
    :goto_6
    and-int/lit8 v1, v8, 0x1

    .line 326
    .line 327
    invoke-virtual {v0, v1, p0}, La/fet;->U(IZ)Z

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    if-eqz p0, :cond_8

    .line 332
    .line 333
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    iget p0, p0, La/wfn;->d:F

    .line 338
    .line 339
    sget-object v1, La/qmk;->a:La/zcl;

    .line 340
    .line 341
    const/high16 v1, 0x40800000    # 4.0f

    .line 342
    .line 343
    invoke-static {v3, p0, v1}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-static {p0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    const/4 v1, 0x2

    .line 352
    const/4 v3, 0x0

    .line 353
    invoke-static {p0, v2, v3, v1}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    sget-object v1, La/qmk;->i:La/zcl;

    .line 358
    .line 359
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 360
    .line 361
    invoke-static {v1, v1, v1, v1, p0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-static {p0, v7}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-static {v6, v0, p0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 370
    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_8
    invoke-virtual {v0}, La/fet;->X()V

    .line 374
    .line 375
    .line 376
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object p0

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
