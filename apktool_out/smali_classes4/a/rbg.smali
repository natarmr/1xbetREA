.class public final synthetic La/rbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/h7h;La/l7m0;La/wbg;La/ngk0;La/b7h;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/rbg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/rbg;->b:I

    iput-object p2, p0, La/rbg;->d:Ljava/lang/Object;

    iput-object p3, p0, La/rbg;->e:Ljava/lang/Object;

    iput-object p4, p0, La/rbg;->f:Ljava/lang/Object;

    iput-object p5, p0, La/rbg;->g:Ljava/lang/Object;

    iput-object p6, p0, La/rbg;->h:Ljava/lang/Object;

    iput-object p7, p0, La/rbg;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;La/fqm;ILa/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/rbg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rbg;->d:Ljava/lang/Object;

    iput-object p2, p0, La/rbg;->e:Ljava/lang/Object;

    iput p3, p0, La/rbg;->b:I

    iput-object p4, p0, La/rbg;->f:Ljava/lang/Object;

    iput-object p5, p0, La/rbg;->g:Ljava/lang/Object;

    iput-object p6, p0, La/rbg;->h:Ljava/lang/Object;

    iput-object p7, p0, La/rbg;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rbg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/rbg;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/rbg;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/rbg;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, La/rbg;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, La/rbg;->d:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v11, v9

    .line 23
    check-cast v11, Ljava/util/ArrayList;

    .line 24
    .line 25
    move-object v12, v8

    .line 26
    check-cast v12, La/fqm;

    .line 27
    .line 28
    move-object v14, v7

    .line 29
    check-cast v14, La/xdr;

    .line 30
    .line 31
    move-object v15, v6

    .line 32
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 33
    .line 34
    move-object/from16 v16, v5

    .line 35
    .line 36
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, La/g9z;

    .line 41
    .line 42
    move-object/from16 v5, p2

    .line 43
    .line 44
    check-cast v5, La/fet;

    .line 45
    .line 46
    move-object/from16 v6, p3

    .line 47
    .line 48
    check-cast v6, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    and-int/lit8 v1, v6, 0x11

    .line 58
    .line 59
    if-eq v1, v3, :cond_0

    .line 60
    .line 61
    move v2, v4

    .line 62
    :cond_0
    and-int/lit8 v1, v6, 0x1

    .line 63
    .line 64
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    const/16 v19, 0x200

    .line 72
    .line 73
    iget v13, v0, La/rbg;->b:I

    .line 74
    .line 75
    iget-object v0, v0, La/rbg;->c:Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    move-object/from16 v17, v0

    .line 78
    .line 79
    move-object/from16 v18, v5

    .line 80
    .line 81
    invoke-static/range {v10 .. v19}, La/y860;->N(La/mm40;Ljava/util/ArrayList;La/fqm;ILa/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-object/from16 v18, v5

    .line 86
    .line 87
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_0
    check-cast v9, La/h7h;

    .line 94
    .line 95
    check-cast v8, La/l7m0;

    .line 96
    .line 97
    check-cast v7, La/wbg;

    .line 98
    .line 99
    check-cast v6, La/ngk0;

    .line 100
    .line 101
    move-object v11, v5

    .line 102
    check-cast v11, La/b7h;

    .line 103
    .line 104
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/g9z;

    .line 107
    .line 108
    move-object/from16 v13, p2

    .line 109
    .line 110
    check-cast v13, La/fet;

    .line 111
    .line 112
    move-object/from16 v5, p3

    .line 113
    .line 114
    check-cast v5, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    and-int/lit8 v1, v5, 0x11

    .line 124
    .line 125
    if-eq v1, v3, :cond_2

    .line 126
    .line 127
    move v1, v4

    .line 128
    goto :goto_1

    .line 129
    :cond_2
    move v1, v2

    .line 130
    :goto_1
    and-int/lit8 v3, v5, 0x1

    .line 131
    .line 132
    invoke-virtual {v13, v3, v1}, La/fet;->U(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_a

    .line 137
    .line 138
    iget-object v1, v9, La/h7h;->g:La/a4x;

    .line 139
    .line 140
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    iget v3, v0, La/rbg;->b:I

    .line 145
    .line 146
    if-ne v3, v1, :cond_3

    .line 147
    .line 148
    move v1, v4

    .line 149
    goto :goto_2

    .line 150
    :cond_3
    move v1, v2

    .line 151
    :goto_2
    invoke-virtual {v13, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    if-nez v5, :cond_4

    .line 160
    .line 161
    sget-object v5, La/ukd;->a:La/cl5;

    .line 162
    .line 163
    if-ne v9, v5, :cond_5

    .line 164
    .line 165
    :cond_4
    new-instance v5, La/eka;

    .line 166
    .line 167
    const/16 v9, 0xd

    .line 168
    .line 169
    invoke-direct {v5, v8, v9}, La/eka;-><init>(La/l7m0;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v5}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    check-cast v9, La/l7m0;

    .line 180
    .line 181
    iget-boolean v5, v7, La/wbg;->b:Z

    .line 182
    .line 183
    if-nez v5, :cond_7

    .line 184
    .line 185
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_6

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    const v0, 0x4e2a6b74    # 7.147922E8f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v13, v2}, La/fet;->r(Z)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_7
    :goto_3
    const v5, 0x4e1c4c71    # 6.5556384E8f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v13, v5}, La/fet;->e0(I)V

    .line 213
    .line 214
    .line 215
    sget-object v5, La/jm40;->b:La/jm40;

    .line 216
    .line 217
    invoke-static {v5}, La/lgb;->K(La/mm40;)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    new-instance v7, La/y26;

    .line 222
    .line 223
    const/4 v9, 0x2

    .line 224
    invoke-direct {v7, v6, v3, v8, v9}, La/y26;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 225
    .line 226
    .line 227
    invoke-static {v5, v7}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    sget-object v5, La/qmk;->a:La/zcl;

    .line 232
    .line 233
    const/high16 v5, 0x40000000    # 2.0f

    .line 234
    .line 235
    if-eqz v1, :cond_8

    .line 236
    .line 237
    move v1, v5

    .line 238
    goto :goto_4

    .line 239
    :cond_8
    const/4 v1, 0x0

    .line 240
    :goto_4
    const/high16 v6, 0x41000000    # 8.0f

    .line 241
    .line 242
    invoke-static {v3, v6, v5, v6, v1}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    new-instance v3, La/qw3;

    .line 247
    .line 248
    new-instance v6, La/jf4;

    .line 249
    .line 250
    const/16 v7, 0xe

    .line 251
    .line 252
    invoke-direct {v6, v7}, La/jf4;-><init>(B)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v3, v5, v4, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 256
    .line 257
    .line 258
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 259
    .line 260
    invoke-static {v3, v5, v13, v2}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    iget-wide v5, v13, La/fet;->T:J

    .line 265
    .line 266
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-static {v13, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 279
    .line 280
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v13}, La/fet;->i0()V

    .line 284
    .line 285
    .line 286
    iget-boolean v7, v13, La/fet;->S:Z

    .line 287
    .line 288
    if-eqz v7, :cond_9

    .line 289
    .line 290
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 291
    .line 292
    invoke-virtual {v13, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_9
    invoke-virtual {v13}, La/fet;->r0()V

    .line 297
    .line 298
    .line 299
    :goto_5
    sget-object v7, La/gqw0;->x:La/shd;

    .line 300
    .line 301
    invoke-static {v13, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    sget-object v3, La/gqw0;->w:La/shd;

    .line 305
    .line 306
    invoke-static {v13, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    sget-object v5, La/gqw0;->y:La/shd;

    .line 314
    .line 315
    invoke-static {v13, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 319
    .line 320
    .line 321
    sget-object v3, La/gqw0;->v:La/shd;

    .line 322
    .line 323
    invoke-static {v13, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    const/4 v1, 0x0

    .line 327
    invoke-static {v1, v11, v13, v2}, La/uzb;->i(La/mm40;La/b7h;La/fet;I)V

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/4 v15, 0x1

    .line 332
    const/4 v10, 0x0

    .line 333
    iget-object v12, v0, La/rbg;->c:Lkotlin/jvm/functions/Function1;

    .line 334
    .line 335
    invoke-static/range {v10 .. v15}, La/uzb;->f(La/mm40;La/b7h;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v13, v4}, La/fet;->r(Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13, v2}, La/fet;->r(Z)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_a
    invoke-virtual {v13}, La/fet;->X()V

    .line 346
    .line 347
    .line 348
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
