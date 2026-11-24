.class public final La/vgv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:La/pz40;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/a4x;La/pz40;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vgv;->a:La/a4x;

    .line 5
    .line 6
    iput-object p2, p0, La/vgv;->b:La/pz40;

    .line 7
    .line 8
    iput p3, p0, La/vgv;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/vgv;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v6, p3

    .line 10
    check-cast v6, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    and-int/lit8 p4, p3, 0x6

    .line 22
    .line 23
    if-nez p4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v6, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-eqz p4, :cond_0

    .line 30
    .line 31
    const/4 p4, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p4, 0x2

    .line 34
    :goto_0
    or-int/2addr p4, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p4, p3

    .line 37
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 38
    .line 39
    if-nez p3, :cond_3

    .line 40
    .line 41
    invoke-virtual {v6, p2}, La/fet;->e(I)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    const/16 p3, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 p3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr p4, p3

    .line 53
    :cond_3
    and-int/lit16 p3, p4, 0x93

    .line 54
    .line 55
    const/16 v0, 0x92

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x1

    .line 59
    if-eq p3, v0, :cond_4

    .line 60
    .line 61
    move p3, v10

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move p3, v9

    .line 64
    :goto_3
    and-int/2addr p4, v10

    .line 65
    invoke-virtual {v6, p4, p3}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-eqz p3, :cond_b

    .line 70
    .line 71
    iget-object p3, p0, La/vgv;->a:La/a4x;

    .line 72
    .line 73
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, La/ecv0;

    .line 78
    .line 79
    const p3, 0x77ce42ff

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, p3}, La/fet;->e0(I)V

    .line 83
    .line 84
    .line 85
    iget-object p3, p0, La/vgv;->b:La/pz40;

    .line 86
    .line 87
    invoke-interface {p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, La/kcv0;

    .line 92
    .line 93
    iget-object p3, p3, La/kcv0;->a:La/a4x;

    .line 94
    .line 95
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    sget-object p4, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    if-ne p3, v10, :cond_5

    .line 102
    .line 103
    invoke-static {p1}, La/g9z;->e(La/g9z;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    iget p1, p0, La/vgv;->c:F

    .line 109
    .line 110
    const p3, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    mul-float/2addr p1, p3

    .line 114
    invoke-static {p4, p1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object p3, La/qmk;->a:La/zcl;

    .line 119
    .line 120
    const/high16 p3, 0x43c80000    # 400.0f

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-static {p1, v0, p3, v10}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_4
    sget-object p3, La/s6t0;->a:La/pz40;

    .line 128
    .line 129
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    iget-object p3, p3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 134
    .line 135
    invoke-virtual {p3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    sget-object p3, La/qmk;->i:La/zcl;

    .line 140
    .line 141
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 142
    .line 143
    new-instance v2, La/ugg0;

    .line 144
    .line 145
    invoke-direct {v2, p3, p3, p3, p3}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1, v0, v1, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    sget-object p3, La/uc9;->c:La/mw3;

    .line 153
    .line 154
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 155
    .line 156
    invoke-static {p3, v0, v6, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    iget-wide v0, v6, La/fet;->T:J

    .line 161
    .line 162
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v6, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    sget-object v2, La/mkd;->c0:La/gqw0;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, La/fet;->i0()V

    .line 180
    .line 181
    .line 182
    iget-boolean v2, v6, La/fet;->S:Z

    .line 183
    .line 184
    if-eqz v2, :cond_6

    .line 185
    .line 186
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 187
    .line 188
    invoke-virtual {v6, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_6
    invoke-virtual {v6}, La/fet;->r0()V

    .line 193
    .line 194
    .line 195
    :goto_5
    sget-object v2, La/gqw0;->x:La/shd;

    .line 196
    .line 197
    invoke-static {v6, p3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    sget-object p3, La/gqw0;->w:La/shd;

    .line 201
    .line 202
    invoke-static {v6, v1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    sget-object v0, La/gqw0;->y:La/shd;

    .line 210
    .line 211
    invoke-static {v6, p3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 215
    .line 216
    .line 217
    sget-object p3, La/gqw0;->v:La/shd;

    .line 218
    .line 219
    invoke-static {v6, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p2, La/ecv0;->b:La/jjm;

    .line 223
    .line 224
    const/high16 p3, 0x3f800000    # 1.0f

    .line 225
    .line 226
    if-nez p1, :cond_7

    .line 227
    .line 228
    const p1, -0xdbfc837

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, p1}, La/fet;->e0(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_7
    const p1, -0xdbfc836

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, p1}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {p4, p3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const/4 v4, 0x0

    .line 249
    const/16 v5, 0x8

    .line 250
    .line 251
    const/high16 v1, 0x41400000    # 12.0f

    .line 252
    .line 253
    const/high16 v2, 0x41000000    # 8.0f

    .line 254
    .line 255
    const/high16 v3, 0x41400000    # 12.0f

    .line 256
    .line 257
    invoke-static/range {v0 .. v5}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v1, p2, La/ecv0;->b:La/jjm;

    .line 262
    .line 263
    sget-object v2, La/kjm;->a:La/kjm;

    .line 264
    .line 265
    const/16 v7, 0x180

    .line 266
    .line 267
    const/16 v8, 0x38

    .line 268
    .line 269
    const/4 v3, 0x0

    .line 270
    const/4 v4, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    invoke-static/range {v0 .. v8}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 276
    .line 277
    .line 278
    :goto_6
    invoke-static {p4, p3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    const/high16 p3, 0x42700000    # 60.0f

    .line 283
    .line 284
    invoke-static {p1, p3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    const p3, -0x638a0c50

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6, p3}, La/fet;->e0(I)V

    .line 292
    .line 293
    .line 294
    iget-object p2, p2, La/ecv0;->c:La/a4x;

    .line 295
    .line 296
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result p3

    .line 304
    if-eqz p3, :cond_a

    .line 305
    .line 306
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p3

    .line 310
    check-cast p3, La/wbv0;

    .line 311
    .line 312
    const v0, 0x2c77c267

    .line 313
    .line 314
    .line 315
    iget-object v1, p3, La/wbv0;->a:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v6, v0, v1}, La/fet;->b0(ILjava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-static {p3, v6}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v6, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    if-nez v1, :cond_8

    .line 333
    .line 334
    sget-object v1, La/ukd;->a:La/cl5;

    .line 335
    .line 336
    if-ne v2, v1, :cond_9

    .line 337
    .line 338
    :cond_8
    new-instance v2, La/w0;

    .line 339
    .line 340
    const/16 v1, 0x16

    .line 341
    .line 342
    invoke-direct {v2, p3, v1}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 349
    .line 350
    invoke-static {p4, v2}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 351
    .line 352
    .line 353
    move-result-object p3

    .line 354
    invoke-interface {p1, p3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 355
    .line 356
    .line 357
    move-result-object p3

    .line 358
    iget-object v1, p0, La/vgv;->d:Lkotlin/jvm/functions/Function1;

    .line 359
    .line 360
    invoke-static {p3, v0, v1, v6, v9}, La/jtm0;->i(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 364
    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_a
    invoke-static {v6, v9, v10, v9}, La/ohs0;->x(La/fet;ZZZ)V

    .line 368
    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_b
    invoke-virtual {v6}, La/fet;->X()V

    .line 372
    .line 373
    .line 374
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0
.end method
