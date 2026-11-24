.class public final synthetic La/npd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/opd;


# direct methods
.method public synthetic constructor <init>(La/opd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/npd;->a:B

    iput-object p1, p0, La/npd;->b:La/opd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/npd;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/16 v4, 0x20

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, v0, La/npd;->b:La/opd;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/y5d;

    .line 20
    .line 21
    move-object/from16 v7, p2

    .line 22
    .line 23
    check-cast v7, La/mm40;

    .line 24
    .line 25
    move-object/from16 v8, p3

    .line 26
    .line 27
    check-cast v8, La/fet;

    .line 28
    .line 29
    move-object/from16 v9, p4

    .line 30
    .line 31
    check-cast v9, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    and-int/lit8 v10, v9, 0x6

    .line 38
    .line 39
    if-nez v10, :cond_1

    .line 40
    .line 41
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    const/4 v10, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v10, 0x2

    .line 50
    :goto_0
    or-int/2addr v10, v9

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v10, v9

    .line 53
    :goto_1
    and-int/lit8 v9, v9, 0x30

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    move v3, v4

    .line 64
    :cond_2
    or-int/2addr v10, v3

    .line 65
    :cond_3
    and-int/lit16 v3, v10, 0x93

    .line 66
    .line 67
    const/16 v4, 0x92

    .line 68
    .line 69
    if-eq v3, v4, :cond_4

    .line 70
    .line 71
    move v3, v5

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move v3, v6

    .line 74
    :goto_2
    and-int/lit8 v4, v10, 0x1

    .line 75
    .line 76
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    invoke-static {v1, v7}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 87
    .line 88
    invoke-static {v3, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-wide v6, v8, La/fet;->T:J

    .line 93
    .line 94
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, La/fet;->i0()V

    .line 112
    .line 113
    .line 114
    iget-boolean v7, v8, La/fet;->S:Z

    .line 115
    .line 116
    if-eqz v7, :cond_5

    .line 117
    .line 118
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 119
    .line 120
    invoke-virtual {v8, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    invoke-virtual {v8}, La/fet;->r0()V

    .line 125
    .line 126
    .line 127
    :goto_3
    sget-object v7, La/gqw0;->x:La/shd;

    .line 128
    .line 129
    invoke-static {v8, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    sget-object v3, La/gqw0;->w:La/shd;

    .line 133
    .line 134
    invoke-static {v8, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    sget-object v4, La/gqw0;->y:La/shd;

    .line 142
    .line 143
    invoke-static {v8, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 147
    .line 148
    .line 149
    sget-object v3, La/gqw0;->v:La/shd;

    .line 150
    .line 151
    invoke-static {v8, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v29, v8

    .line 155
    .line 156
    iget-object v8, v0, La/opd;->a:Ljava/lang/String;

    .line 157
    .line 158
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 159
    .line 160
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v10

    .line 164
    sget-object v18, La/j1t0;->c:La/qrq;

    .line 165
    .line 166
    sget-wide v15, La/qmk;->t:J

    .line 167
    .line 168
    const/16 v0, 0x16

    .line 169
    .line 170
    invoke-static {v0}, La/idm0;->t(I)J

    .line 171
    .line 172
    .line 173
    move-result-wide v24

    .line 174
    new-instance v12, La/y9q0;

    .line 175
    .line 176
    const/16 v23, 0x0

    .line 177
    .line 178
    const v26, 0xfdffdd

    .line 179
    .line 180
    .line 181
    const-wide/16 v13, 0x0

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const-wide/16 v19, 0x0

    .line 186
    .line 187
    const/16 v21, 0x0

    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    invoke-direct/range {v12 .. v26}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 192
    .line 193
    .line 194
    sget-wide v14, La/qmk;->q:J

    .line 195
    .line 196
    sget-wide v16, La/qmk;->v:J

    .line 197
    .line 198
    sget-wide v18, La/qmk;->n:J

    .line 199
    .line 200
    new-instance v13, La/n05;

    .line 201
    .line 202
    invoke-direct/range {v13 .. v19}, La/n05;-><init>(JJJ)V

    .line 203
    .line 204
    .line 205
    new-instance v0, La/f2q0;

    .line 206
    .line 207
    invoke-direct {v0, v2}, La/f2q0;-><init>(I)V

    .line 208
    .line 209
    .line 210
    const/16 v31, 0x6180

    .line 211
    .line 212
    const v32, 0x1abf2

    .line 213
    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    move-object/from16 v28, v12

    .line 217
    .line 218
    move-object v12, v13

    .line 219
    const-wide/16 v13, 0x0

    .line 220
    .line 221
    const/4 v15, 0x0

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const-wide/16 v18, 0x0

    .line 227
    .line 228
    const-wide/16 v21, 0x0

    .line 229
    .line 230
    const/16 v23, 0x2

    .line 231
    .line 232
    const/16 v24, 0x0

    .line 233
    .line 234
    const/16 v25, 0x3

    .line 235
    .line 236
    const/16 v26, 0x0

    .line 237
    .line 238
    const/16 v27, 0x0

    .line 239
    .line 240
    const/16 v30, 0x0

    .line 241
    .line 242
    move-object/from16 v20, v0

    .line 243
    .line 244
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v0, v29

    .line 248
    .line 249
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_6
    move-object v0, v8

    .line 254
    invoke-virtual {v0}, La/fet;->X()V

    .line 255
    .line 256
    .line 257
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_0
    iget-object v0, v0, La/opd;->b:La/j83;

    .line 261
    .line 262
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, La/y5d;

    .line 265
    .line 266
    move-object/from16 v7, p2

    .line 267
    .line 268
    check-cast v7, La/mm40;

    .line 269
    .line 270
    move-object/from16 v8, p3

    .line 271
    .line 272
    check-cast v8, La/fet;

    .line 273
    .line 274
    move-object/from16 v9, p4

    .line 275
    .line 276
    check-cast v9, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    and-int/lit8 v9, v1, 0x30

    .line 283
    .line 284
    if-nez v9, :cond_8

    .line 285
    .line 286
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_7

    .line 291
    .line 292
    move v3, v4

    .line 293
    :cond_7
    or-int/2addr v1, v3

    .line 294
    :cond_8
    and-int/lit16 v3, v1, 0x91

    .line 295
    .line 296
    const/16 v4, 0x90

    .line 297
    .line 298
    if-eq v3, v4, :cond_9

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_9
    move v5, v6

    .line 302
    :goto_5
    and-int/lit8 v3, v1, 0x1

    .line 303
    .line 304
    invoke-virtual {v8, v3, v5}, La/fet;->U(IZ)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    if-eqz v3, :cond_b

    .line 309
    .line 310
    iget-object v3, v0, La/j83;->b:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-lez v3, :cond_a

    .line 317
    .line 318
    const v3, -0x2bac074f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v8, v3}, La/fet;->e0(I)V

    .line 322
    .line 323
    .line 324
    shr-int/2addr v1, v2

    .line 325
    and-int/lit8 v1, v1, 0xe

    .line 326
    .line 327
    invoke-static {v7, v0, v8, v1}, La/vic;->a(La/mm40;La/j83;La/fet;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 331
    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_a
    const v0, -0x2ba98ce6

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_b
    invoke-virtual {v8}, La/fet;->X()V

    .line 345
    .line 346
    .line 347
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
