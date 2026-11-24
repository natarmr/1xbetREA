.class public final synthetic La/rj7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tj7;


# direct methods
.method public synthetic constructor <init>(La/tj7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rj7;->a:B

    iput-object p1, p0, La/rj7;->b:La/tj7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rj7;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v0, v0, La/rj7;->b:La/tj7;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/g9z;

    .line 18
    .line 19
    move-object/from16 v6, p2

    .line 20
    .line 21
    check-cast v6, La/fet;

    .line 22
    .line 23
    move-object/from16 v7, p3

    .line 24
    .line 25
    check-cast v7, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    sget-object v8, La/tj7;->t2:La/gl5;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v1, v7, 0x11

    .line 37
    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    move v1, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v4

    .line 43
    :goto_0
    and-int/lit8 v2, v7, 0x1

    .line 44
    .line 45
    invoke-virtual {v6, v2, v1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    sget-object v1, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    const/high16 v11, 0x41000000    # 8.0f

    .line 54
    .line 55
    const/4 v12, 0x7

    .line 56
    sget-object v7, La/jm40;->b:La/jm40;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v7, La/f3w;

    .line 66
    .line 67
    const v2, 0x7f1309d1

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v4, v6}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    sget-object v2, La/pn40;->a:La/pn40;

    .line 75
    .line 76
    iget-object v2, v0, La/tj7;->p2:La/chf0;

    .line 77
    .line 78
    sget-object v5, La/tj7;->u2:[La/iiy;

    .line 79
    .line 80
    const/4 v8, 0x3

    .line 81
    aget-object v8, v5, v8

    .line 82
    .line 83
    invoke-virtual {v2, v0, v8}, La/chf0;->K(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Double;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 92
    .line 93
    invoke-static {v10, v11, v2}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    iget-object v2, v0, La/tj7;->o2:La/phf0;

    .line 98
    .line 99
    aget-object v3, v5, v3

    .line 100
    .line 101
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    sget-object v12, La/e3w;->a:La/e3w;

    .line 106
    .line 107
    const-string v8, "downGradeBet"

    .line 108
    .line 109
    invoke-direct/range {v7 .. v12}, La/f3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/e3w;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v7, v6, v4}, La/hp4;->c(La/mm40;La/f3w;La/fet;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-virtual {v6}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_0
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, La/y5d;

    .line 125
    .line 126
    move-object/from16 v13, p2

    .line 127
    .line 128
    check-cast v13, La/fet;

    .line 129
    .line 130
    move-object/from16 v2, p3

    .line 131
    .line 132
    check-cast v2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    sget-object v6, La/tj7;->t2:La/gl5;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    and-int/lit8 v6, v2, 0x6

    .line 144
    .line 145
    if-nez v6, :cond_3

    .line 146
    .line 147
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_2

    .line 152
    .line 153
    const/4 v3, 0x4

    .line 154
    :cond_2
    or-int/2addr v2, v3

    .line 155
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 156
    .line 157
    const/16 v6, 0x12

    .line 158
    .line 159
    if-eq v3, v6, :cond_4

    .line 160
    .line 161
    move v4, v5

    .line 162
    :cond_4
    and-int/2addr v2, v5

    .line 163
    invoke-virtual {v13, v2, v4}, La/fet;->U(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_6

    .line 168
    .line 169
    sget-object v2, La/jm40;->b:La/jm40;

    .line 170
    .line 171
    const/high16 v3, 0x3f800000    # 1.0f

    .line 172
    .line 173
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 178
    .line 179
    invoke-virtual {v1, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    sget-object v1, La/qmk;->a:La/zcl;

    .line 184
    .line 185
    const/4 v8, 0x0

    .line 186
    const/16 v9, 0xd

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    const/high16 v6, 0x41c00000    # 24.0f

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget-object v2, v0, La/tj7;->s2:La/cgx0;

    .line 201
    .line 202
    sget-object v3, La/tj7;->u2:[La/iiy;

    .line 203
    .line 204
    const/4 v4, 0x6

    .line 205
    aget-object v3, v3, v4

    .line 206
    .line 207
    invoke-virtual {v2, v0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_5

    .line 216
    .line 217
    const v0, 0x7f1304d1

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    const v0, 0x7f1304db

    .line 222
    .line 223
    .line 224
    :goto_2
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    const/16 v15, 0x1c

    .line 233
    .line 234
    const-wide/16 v8, 0x0

    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    const-wide/16 v11, 0x0

    .line 238
    .line 239
    invoke-static/range {v6 .. v15}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_6
    invoke-virtual {v13}, La/fet;->X()V

    .line 244
    .line 245
    .line 246
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_1
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, La/g9z;

    .line 252
    .line 253
    move-object/from16 v6, p2

    .line 254
    .line 255
    check-cast v6, La/fet;

    .line 256
    .line 257
    move-object/from16 v7, p3

    .line 258
    .line 259
    check-cast v7, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    sget-object v8, La/tj7;->t2:La/gl5;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    and-int/lit8 v1, v7, 0x11

    .line 271
    .line 272
    if-eq v1, v2, :cond_7

    .line 273
    .line 274
    move v1, v5

    .line 275
    goto :goto_4

    .line 276
    :cond_7
    move v1, v4

    .line 277
    :goto_4
    and-int/lit8 v2, v7, 0x1

    .line 278
    .line 279
    invoke-virtual {v6, v2, v1}, La/fet;->U(IZ)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_8

    .line 284
    .line 285
    sget-object v1, La/qmk;->a:La/zcl;

    .line 286
    .line 287
    const/high16 v11, 0x41000000    # 8.0f

    .line 288
    .line 289
    const/4 v12, 0x7

    .line 290
    sget-object v7, La/jm40;->b:La/jm40;

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    const/4 v9, 0x0

    .line 294
    const/4 v10, 0x0

    .line 295
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    new-instance v7, La/f3w;

    .line 300
    .line 301
    const v2, 0x7f13023c

    .line 302
    .line 303
    .line 304
    invoke-static {v2, v4, v6}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    sget-object v2, La/pn40;->a:La/pn40;

    .line 309
    .line 310
    iget-object v2, v0, La/tj7;->r2:La/chf0;

    .line 311
    .line 312
    sget-object v5, La/tj7;->u2:[La/iiy;

    .line 313
    .line 314
    const/4 v8, 0x5

    .line 315
    aget-object v8, v5, v8

    .line 316
    .line 317
    invoke-virtual {v2, v0, v8}, La/chf0;->K(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Double;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 322
    .line 323
    .line 324
    move-result-wide v10

    .line 325
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 326
    .line 327
    invoke-static {v10, v11, v2}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    iget-object v2, v0, La/tj7;->o2:La/phf0;

    .line 332
    .line 333
    aget-object v3, v5, v3

    .line 334
    .line 335
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    sget-object v12, La/e3w;->a:La/e3w;

    .line 340
    .line 341
    const-string v8, "autoSaleSum"

    .line 342
    .line 343
    invoke-direct/range {v7 .. v12}, La/f3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/e3w;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v1, v7, v6, v4}, La/hp4;->c(La/mm40;La/f3w;La/fet;I)V

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_8
    invoke-virtual {v6}, La/fet;->X()V

    .line 351
    .line 352
    .line 353
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object v0

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
