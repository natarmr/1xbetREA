.class public final synthetic La/kbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k7h;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/k7h;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kbg;->a:B

    iput-object p1, p0, La/kbg;->b:La/k7h;

    iput-object p2, p0, La/kbg;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kbg;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    sget-object v4, La/ukd;->a:La/cl5;

    .line 9
    .line 10
    iget-object v5, v0, La/kbg;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object v0, v0, La/kbg;->b:La/k7h;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    move-object/from16 v11, p1

    .line 17
    .line 18
    check-cast v11, La/fet;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
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
    and-int/lit8 v8, v1, 0x3

    .line 32
    .line 33
    if-eq v8, v3, :cond_0

    .line 34
    .line 35
    move v3, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v3, v7

    .line 38
    :goto_0
    and-int/2addr v1, v6

    .line 39
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_5

    .line 44
    .line 45
    iget-object v1, v0, La/k7h;->a:La/a4x;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, La/h7h;

    .line 62
    .line 63
    iget-wide v8, v3, La/h7h;->a:J

    .line 64
    .line 65
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const v9, -0x2d7b9fff

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11, v9, v8}, La/fet;->b0(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v8, La/qmk;->a:La/zcl;

    .line 76
    .line 77
    const/high16 v8, 0x42200000    # 40.0f

    .line 78
    .line 79
    invoke-static {v2, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-virtual {v11, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    or-int/2addr v8, v9

    .line 92
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    if-nez v8, :cond_1

    .line 97
    .line 98
    if-ne v9, v4, :cond_2

    .line 99
    .line 100
    :cond_1
    new-instance v9, La/sgh;

    .line 101
    .line 102
    invoke-direct {v9, v5, v3, v7}, La/sgh;-><init>(Lkotlin/jvm/functions/Function1;La/h7h;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    move-object/from16 v17, v9

    .line 109
    .line 110
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 111
    .line 112
    const/16 v18, 0x1c

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget-object v9, v3, La/h7h;->b:Ljava/lang/String;

    .line 124
    .line 125
    const-string v10, "MARKET_CATEGORIES_SUBGAME"

    .line 126
    .line 127
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-static {v8, v9}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    invoke-virtual {v11, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    or-int/2addr v9, v10

    .line 144
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    if-nez v9, :cond_3

    .line 149
    .line 150
    if-ne v10, v4, :cond_4

    .line 151
    .line 152
    :cond_3
    new-instance v10, La/ngh;

    .line 153
    .line 154
    invoke-direct {v10, v3, v0, v6}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    invoke-static {v8, v7, v10}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    new-instance v9, La/rgh;

    .line 167
    .line 168
    invoke-direct {v9, v3, v0}, La/rgh;-><init>(La/h7h;La/k7h;)V

    .line 169
    .line 170
    .line 171
    const v3, -0x3db3d114

    .line 172
    .line 173
    .line 174
    invoke-static {v3, v9, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    const/16 v12, 0x180

    .line 179
    .line 180
    const/16 v13, 0xa

    .line 181
    .line 182
    const/4 v9, 0x0

    .line 183
    invoke-static/range {v8 .. v13}, La/fww;->l(La/mm40;La/xdr;La/ugd;La/fet;II)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11, v7}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_5
    invoke-virtual {v11}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_0
    move-object/from16 v1, p2

    .line 198
    .line 199
    check-cast v1, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    and-int/lit8 v8, v1, 0x3

    .line 206
    .line 207
    if-eq v8, v3, :cond_7

    .line 208
    .line 209
    move v3, v6

    .line 210
    goto :goto_2

    .line 211
    :cond_7
    move v3, v7

    .line 212
    :goto_2
    and-int/2addr v1, v6

    .line 213
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_b

    .line 218
    .line 219
    iget-object v0, v0, La/k7h;->b:La/a4x;

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_c

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, La/q5h;

    .line 236
    .line 237
    iget-wide v8, v1, La/q5h;->a:J

    .line 238
    .line 239
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const v8, 0x3cd5ffcf

    .line 244
    .line 245
    .line 246
    invoke-virtual {v11, v8, v3}, La/fet;->b0(ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    sget-object v3, La/qmk;->a:La/zcl;

    .line 250
    .line 251
    const/high16 v3, 0x42400000    # 48.0f

    .line 252
    .line 253
    invoke-static {v2, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-virtual {v11, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    or-int/2addr v3, v8

    .line 266
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    if-nez v3, :cond_8

    .line 271
    .line 272
    if-ne v8, v4, :cond_9

    .line 273
    .line 274
    :cond_8
    new-instance v8, La/lbg;

    .line 275
    .line 276
    invoke-direct {v8, v5, v1, v7}, La/lbg;-><init>(Lkotlin/jvm/functions/Function1;La/q5h;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_9
    move-object/from16 v17, v8

    .line 283
    .line 284
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 285
    .line 286
    const/16 v18, 0x1c

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const/4 v15, 0x0

    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    iget-boolean v3, v1, La/q5h;->d:Z

    .line 298
    .line 299
    if-eqz v3, :cond_a

    .line 300
    .line 301
    const v3, 0x5df3744f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v11, v3}, La/fet;->e0(I)V

    .line 305
    .line 306
    .line 307
    new-instance v3, La/mbg;

    .line 308
    .line 309
    invoke-direct {v3, v1, v7}, La/mbg;-><init>(La/q5h;B)V

    .line 310
    .line 311
    .line 312
    const v9, -0x6ec191c5

    .line 313
    .line 314
    .line 315
    invoke-static {v9, v3, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual {v11, v7}, La/fet;->r(Z)V

    .line 320
    .line 321
    .line 322
    :goto_4
    move-object v9, v3

    .line 323
    goto :goto_5

    .line 324
    :cond_a
    const v3, 0x5df54647

    .line 325
    .line 326
    .line 327
    invoke-virtual {v11, v3}, La/fet;->e0(I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v7}, La/fet;->r(Z)V

    .line 331
    .line 332
    .line 333
    const/4 v3, 0x0

    .line 334
    goto :goto_4

    .line 335
    :goto_5
    new-instance v3, La/mbg;

    .line 336
    .line 337
    invoke-direct {v3, v1, v6}, La/mbg;-><init>(La/q5h;B)V

    .line 338
    .line 339
    .line 340
    const v1, -0x36a815f

    .line 341
    .line 342
    .line 343
    invoke-static {v1, v3, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    const/16 v12, 0x180

    .line 348
    .line 349
    const/16 v13, 0x8

    .line 350
    .line 351
    invoke-static/range {v8 .. v13}, La/fww;->l(La/mm40;La/xdr;La/ugd;La/fet;II)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v11, v7}, La/fet;->r(Z)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_3

    .line 358
    .line 359
    :cond_b
    invoke-virtual {v11}, La/fet;->X()V

    .line 360
    .line 361
    .line 362
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
