.class public final synthetic La/qvm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d7b;

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/xcz;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/d7b;La/mm40;La/pz40;La/xcz;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/qvm0;->a:B

    iput-object p1, p0, La/qvm0;->b:La/d7b;

    iput-object p2, p0, La/qvm0;->c:La/mm40;

    iput-object p3, p0, La/qvm0;->d:La/pz40;

    iput-object p4, p0, La/qvm0;->e:La/xcz;

    iput-object p5, p0, La/qvm0;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qvm0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/qvm0;->f:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v6, v0, La/qvm0;->b:La/d7b;

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v8, p2

    .line 22
    .line 23
    check-cast v8, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    and-int/lit8 v9, v8, 0x3

    .line 30
    .line 31
    if-eq v9, v7, :cond_0

    .line 32
    .line 33
    move v2, v4

    .line 34
    :cond_0
    and-int/2addr v4, v8

    .line 35
    invoke-virtual {v1, v4, v2}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_d

    .line 40
    .line 41
    check-cast v6, La/z6b;

    .line 42
    .line 43
    iget-object v10, v6, La/z6b;->a:La/udl0;

    .line 44
    .line 45
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    if-ne v4, v3, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v4, La/zbm0;

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v4, v5, v2}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v13, v4

    .line 67
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    if-ne v4, v3, :cond_4

    .line 80
    .line 81
    :cond_3
    new-instance v4, La/zbm0;

    .line 82
    .line 83
    const/4 v2, 0x4

    .line 84
    invoke-direct {v4, v5, v2}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    move-object v14, v4

    .line 91
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 92
    .line 93
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-nez v2, :cond_5

    .line 102
    .line 103
    if-ne v4, v3, :cond_6

    .line 104
    .line 105
    :cond_5
    new-instance v4, La/nc40;

    .line 106
    .line 107
    const/16 v2, 0xe

    .line 108
    .line 109
    invoke-direct {v4, v5, v2}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    move-object v15, v4

    .line 116
    check-cast v15, La/xdr;

    .line 117
    .line 118
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    if-ne v4, v3, :cond_8

    .line 129
    .line 130
    :cond_7
    new-instance v4, La/nc40;

    .line 131
    .line 132
    const/16 v2, 0xf

    .line 133
    .line 134
    invoke-direct {v4, v5, v2}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    move-object/from16 v16, v4

    .line 141
    .line 142
    check-cast v16, La/xdr;

    .line 143
    .line 144
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v2, :cond_9

    .line 153
    .line 154
    if-ne v4, v3, :cond_a

    .line 155
    .line 156
    :cond_9
    new-instance v4, La/nc40;

    .line 157
    .line 158
    const/16 v2, 0x10

    .line 159
    .line 160
    invoke-direct {v4, v5, v2}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_a
    move-object/from16 v17, v4

    .line 167
    .line 168
    check-cast v17, La/xdr;

    .line 169
    .line 170
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    if-nez v2, :cond_b

    .line 179
    .line 180
    if-ne v4, v3, :cond_c

    .line 181
    .line 182
    :cond_b
    new-instance v4, La/zbm0;

    .line 183
    .line 184
    const/4 v2, 0x5

    .line 185
    invoke-direct {v4, v5, v2}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_c
    move-object/from16 v18, v4

    .line 192
    .line 193
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 194
    .line 195
    const/16 v21, 0x0

    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    iget-object v8, v0, La/qvm0;->c:La/mm40;

    .line 200
    .line 201
    iget-object v9, v0, La/qvm0;->d:La/pz40;

    .line 202
    .line 203
    const/4 v11, 0x1

    .line 204
    iget-object v12, v0, La/qvm0;->e:La/xcz;

    .line 205
    .line 206
    const/16 v20, 0xc00

    .line 207
    .line 208
    move-object/from16 v19, v1

    .line 209
    .line 210
    invoke-static/range {v8 .. v22}, La/idx;->d(La/mm40;La/l7m0;La/udl0;ZLa/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;III)V

    .line 211
    .line 212
    .line 213
    goto :goto_0

    .line 214
    :cond_d
    move-object/from16 v19, v1

    .line 215
    .line 216
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 217
    .line 218
    .line 219
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_0
    move-object/from16 v10, p1

    .line 223
    .line 224
    check-cast v10, La/fet;

    .line 225
    .line 226
    move-object/from16 v1, p2

    .line 227
    .line 228
    check-cast v1, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    and-int/lit8 v8, v1, 0x3

    .line 235
    .line 236
    if-eq v8, v7, :cond_e

    .line 237
    .line 238
    move v2, v4

    .line 239
    :cond_e
    and-int/2addr v1, v4

    .line 240
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_15

    .line 245
    .line 246
    check-cast v6, La/y6b;

    .line 247
    .line 248
    iget-object v1, v6, La/y6b;->a:La/udl0;

    .line 249
    .line 250
    sget-object v2, La/qmk;->a:La/zcl;

    .line 251
    .line 252
    const/high16 v2, 0x41c00000    # 24.0f

    .line 253
    .line 254
    const/4 v4, 0x7

    .line 255
    const/4 v6, 0x0

    .line 256
    invoke-static {v6, v6, v6, v2, v4}, La/s5x0;->u(FFFFI)La/lh80;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-static {v2, v10}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    if-nez v2, :cond_f

    .line 273
    .line 274
    if-ne v4, v3, :cond_10

    .line 275
    .line 276
    :cond_f
    new-instance v4, La/zbm0;

    .line 277
    .line 278
    const/4 v2, 0x6

    .line 279
    invoke-direct {v4, v5, v2}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_10
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 286
    .line 287
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    if-nez v2, :cond_11

    .line 296
    .line 297
    if-ne v8, v3, :cond_12

    .line 298
    .line 299
    :cond_11
    new-instance v8, La/zbm0;

    .line 300
    .line 301
    invoke-direct {v8, v5, v7}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 308
    .line 309
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    if-nez v2, :cond_13

    .line 318
    .line 319
    if-ne v7, v3, :cond_14

    .line 320
    .line 321
    :cond_13
    new-instance v7, La/nc40;

    .line 322
    .line 323
    const/16 v2, 0xd

    .line 324
    .line 325
    invoke-direct {v7, v5, v2}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v10, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :cond_14
    move-object v9, v7

    .line 332
    check-cast v9, La/xdr;

    .line 333
    .line 334
    const/16 v11, 0xc00

    .line 335
    .line 336
    const/4 v12, 0x0

    .line 337
    move-object v3, v1

    .line 338
    iget-object v1, v0, La/qvm0;->c:La/mm40;

    .line 339
    .line 340
    iget-object v2, v0, La/qvm0;->d:La/pz40;

    .line 341
    .line 342
    move-object v7, v4

    .line 343
    const/4 v4, 0x1

    .line 344
    iget-object v5, v0, La/qvm0;->e:La/xcz;

    .line 345
    .line 346
    invoke-static/range {v1 .. v12}, La/fww;->c(La/mm40;La/pz40;La/udl0;ZLa/xcz;La/hh80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;II)V

    .line 347
    .line 348
    .line 349
    goto :goto_1

    .line 350
    :cond_15
    invoke-virtual {v10}, La/fet;->X()V

    .line 351
    .line 352
    .line 353
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object v0

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
