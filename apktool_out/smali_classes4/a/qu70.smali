.class public final La/qu70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bv70;


# direct methods
.method public synthetic constructor <init>(La/bv70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qu70;->i:B

    iput-object p1, p0, La/qu70;->k:La/bv70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qu70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qu70;->k:La/bv70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qu70;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qu70;-><init>(La/bv70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qu70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qu70;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/qu70;-><init>(La/bv70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/qu70;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/qu70;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/qu70;-><init>(La/bv70;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/qu70;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/qu70;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/qu70;-><init>(La/bv70;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/qu70;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qu70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/suy;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qu70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qu70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qu70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/qu70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qu70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qu70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/fr70;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/qu70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/qu70;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/qu70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/qu70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/qu70;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/qu70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qu70;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/qu70;->k:La/bv70;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/qu70;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object/from16 v21, v0

    .line 13
    .line 14
    check-cast v21, La/suy;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v0, La/bv70;->g0:I

    .line 22
    .line 23
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v3, v0

    .line 35
    check-cast v3, La/hu70;

    .line 36
    .line 37
    const/16 v22, 0x0

    .line 38
    .line 39
    const v23, 0x17ffff

    .line 40
    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    const/16 v18, 0x0

    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/16 v20, 0x0

    .line 63
    .line 64
    invoke-static/range {v3 .. v23}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object/from16 v4, v21

    .line 69
    .line 70
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    iget-boolean v0, v4, La/suy;->e:Z

    .line 77
    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    iget-wide v0, v4, La/suy;->c:J

    .line 81
    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    cmp-long v0, v0, v3

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    invoke-virtual {v2}, La/bv70;->Q()V

    .line 89
    .line 90
    .line 91
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_1
    move-object/from16 v21, v4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_0
    iget-object v0, v0, La/qu70;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ljava/util/List;

    .line 100
    .line 101
    sget-object v1, La/wne;->a:La/wne;

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    sget v0, La/bv70;->g0:I

    .line 113
    .line 114
    sget-object v0, La/xt70;->a:La/xt70;

    .line 115
    .line 116
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 120
    .line 121
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 122
    .line 123
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-object v2, v0

    .line 131
    check-cast v2, La/hu70;

    .line 132
    .line 133
    sget-object v19, La/iun;->a:La/iun;

    .line 134
    .line 135
    const/16 v21, 0x0

    .line 136
    .line 137
    const v22, 0x1dbfe3

    .line 138
    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    const/16 v20, 0x0

    .line 160
    .line 161
    invoke-static/range {v2 .. v22}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_2

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    new-instance v1, La/jt50;

    .line 173
    .line 174
    const/16 v3, 0x16

    .line 175
    .line 176
    invoke-direct {v1, v0, v2, v3}, La/jt50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 177
    .line 178
    .line 179
    sget v0, La/bv70;->g0:I

    .line 180
    .line 181
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_1
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 188
    .line 189
    iget-object v3, v2, La/i3t0;->i:La/ocj;

    .line 190
    .line 191
    iget-object v0, v0, La/qu70;->j:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, La/fr70;

    .line 194
    .line 195
    sget-object v4, La/wne;->a:La/wne;

    .line 196
    .line 197
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    if-eqz v0, :cond_e

    .line 201
    .line 202
    instance-of v4, v0, La/cr70;

    .line 203
    .line 204
    if-eqz v4, :cond_4

    .line 205
    .line 206
    goto/16 :goto_3

    .line 207
    .line 208
    :cond_4
    instance-of v4, v0, La/dr70;

    .line 209
    .line 210
    const/4 v5, 0x1

    .line 211
    if-eqz v4, :cond_5

    .line 212
    .line 213
    new-instance v0, La/vt70;

    .line 214
    .line 215
    invoke-direct {v0, v5}, La/vt70;-><init>(Z)V

    .line 216
    .line 217
    .line 218
    sget v1, La/bv70;->g0:I

    .line 219
    .line 220
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_3

    .line 224
    .line 225
    :cond_5
    instance-of v4, v0, La/ar70;

    .line 226
    .line 227
    if-eqz v4, :cond_6

    .line 228
    .line 229
    sget v0, La/bv70;->g0:I

    .line 230
    .line 231
    sget-object v0, La/tt70;->a:La/tt70;

    .line 232
    .line 233
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, La/bv70;->N()V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_6
    instance-of v4, v0, La/zq70;

    .line 242
    .line 243
    if-eqz v4, :cond_7

    .line 244
    .line 245
    sget v0, La/bv70;->g0:I

    .line 246
    .line 247
    invoke-virtual {v2}, La/bv70;->P()V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_3

    .line 251
    .line 252
    :cond_7
    instance-of v4, v0, La/br70;

    .line 253
    .line 254
    sget-object v6, La/wt70;->a:La/wt70;

    .line 255
    .line 256
    if-eqz v4, :cond_8

    .line 257
    .line 258
    sget v0, La/bv70;->g0:I

    .line 259
    .line 260
    invoke-virtual {v2}, La/bv70;->P()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v6}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :cond_8
    instance-of v4, v0, La/er70;

    .line 269
    .line 270
    if-eqz v4, :cond_e

    .line 271
    .line 272
    check-cast v0, La/er70;

    .line 273
    .line 274
    iget-boolean v0, v0, La/er70;->a:Z

    .line 275
    .line 276
    if-eqz v0, :cond_d

    .line 277
    .line 278
    sget v0, La/bv70;->g0:I

    .line 279
    .line 280
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 281
    .line 282
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-object v7, v4

    .line 290
    check-cast v7, La/hu70;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget v8, v7, La/hu70;->b:I

    .line 296
    .line 297
    add-int/lit8 v9, v8, 0x1

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    const v27, 0x1ffffd

    .line 302
    .line 303
    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v10, 0x0

    .line 306
    const/4 v11, 0x0

    .line 307
    const/4 v12, 0x0

    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const/16 v19, 0x0

    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    const/16 v24, 0x0

    .line 328
    .line 329
    const/16 v25, 0x0

    .line 330
    .line 331
    invoke-static/range {v7 .. v27}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-virtual {v0, v4, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-eqz v4, :cond_9

    .line 340
    .line 341
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, La/hu70;

    .line 346
    .line 347
    iget v0, v0, La/hu70;->b:I

    .line 348
    .line 349
    iget-object v4, v2, La/bv70;->E:La/pmu;

    .line 350
    .line 351
    iget-object v4, v4, La/pmu;->a:La/tq70;

    .line 352
    .line 353
    invoke-virtual {v4}, La/tq70;->a()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-le v0, v4, :cond_c

    .line 362
    .line 363
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 364
    .line 365
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-object v7, v4

    .line 373
    check-cast v7, La/hu70;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    const/16 v26, 0x0

    .line 379
    .line 380
    const v27, 0x1ffffd

    .line 381
    .line 382
    .line 383
    const/4 v8, 0x0

    .line 384
    const/4 v9, 0x0

    .line 385
    const/4 v10, 0x0

    .line 386
    const/4 v11, 0x0

    .line 387
    const/4 v12, 0x0

    .line 388
    const/4 v13, 0x0

    .line 389
    const/4 v14, 0x0

    .line 390
    const/4 v15, 0x0

    .line 391
    const/16 v16, 0x0

    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    const/16 v18, 0x0

    .line 396
    .line 397
    const/16 v19, 0x0

    .line 398
    .line 399
    const/16 v20, 0x0

    .line 400
    .line 401
    const/16 v21, 0x0

    .line 402
    .line 403
    const/16 v22, 0x0

    .line 404
    .line 405
    const/16 v23, 0x0

    .line 406
    .line 407
    const/16 v24, 0x0

    .line 408
    .line 409
    const/16 v25, 0x0

    .line 410
    .line 411
    invoke-static/range {v7 .. v27}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-virtual {v0, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-eqz v4, :cond_a

    .line 420
    .line 421
    iget-object v0, v2, La/bv70;->w:La/wri0;

    .line 422
    .line 423
    const/4 v4, 0x0

    .line 424
    invoke-virtual {v0, v4}, La/wri0;->a(Z)V

    .line 425
    .line 426
    .line 427
    new-instance v0, La/vt70;

    .line 428
    .line 429
    invoke-direct {v0, v4}, La/vt70;-><init>(Z)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iget-object v4, v3, La/ocj;->a:La/p7m0;

    .line 436
    .line 437
    :cond_b
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-object v7, v0

    .line 445
    check-cast v7, La/hu70;

    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    const/16 v26, 0x0

    .line 451
    .line 452
    const v27, 0xfffff

    .line 453
    .line 454
    .line 455
    const/4 v8, 0x0

    .line 456
    const/4 v9, 0x0

    .line 457
    const/4 v10, 0x0

    .line 458
    const/4 v11, 0x0

    .line 459
    const/4 v12, 0x0

    .line 460
    const/4 v13, 0x0

    .line 461
    const/4 v14, 0x0

    .line 462
    const/4 v15, 0x0

    .line 463
    const/16 v16, 0x0

    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const/16 v18, 0x0

    .line 468
    .line 469
    const/16 v19, 0x0

    .line 470
    .line 471
    const/16 v20, 0x0

    .line 472
    .line 473
    const/16 v21, 0x0

    .line 474
    .line 475
    const/16 v22, 0x0

    .line 476
    .line 477
    const/16 v23, 0x0

    .line 478
    .line 479
    const/16 v24, 0x0

    .line 480
    .line 481
    const/16 v25, 0x0

    .line 482
    .line 483
    invoke-static/range {v7 .. v27}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-virtual {v4, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_b

    .line 492
    .line 493
    goto :goto_2

    .line 494
    :cond_c
    iget-object v0, v2, La/bv70;->q:La/uq70;

    .line 495
    .line 496
    invoke-interface {v0}, La/uq70;->a()V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, La/bv70;->M()V

    .line 500
    .line 501
    .line 502
    goto :goto_2

    .line 503
    :cond_d
    sget v0, La/bv70;->g0:I

    .line 504
    .line 505
    invoke-virtual {v2}, La/bv70;->R()V

    .line 506
    .line 507
    .line 508
    :goto_2
    invoke-virtual {v2, v6}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    goto :goto_4

    .line 514
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 515
    .line 516
    .line 517
    const/4 v0, 0x0

    .line 518
    :goto_4
    return-object v0

    .line 519
    :pswitch_2
    iget-object v0, v0, La/qu70;->j:Ljava/lang/Object;

    .line 520
    .line 521
    move-object v14, v0

    .line 522
    check-cast v14, Ljava/lang/String;

    .line 523
    .line 524
    sget-object v0, La/wne;->a:La/wne;

    .line 525
    .line 526
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    sget v0, La/bv70;->g0:I

    .line 530
    .line 531
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 532
    .line 533
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 534
    .line 535
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    move-object v3, v1

    .line 543
    check-cast v3, La/hu70;

    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const v23, 0x1ff7ff

    .line 548
    .line 549
    .line 550
    const/4 v4, 0x0

    .line 551
    const/4 v5, 0x0

    .line 552
    const/4 v6, 0x0

    .line 553
    const/4 v7, 0x0

    .line 554
    const/4 v8, 0x0

    .line 555
    const/4 v9, 0x0

    .line 556
    const/4 v10, 0x0

    .line 557
    const/4 v11, 0x0

    .line 558
    const/4 v12, 0x0

    .line 559
    const/4 v13, 0x0

    .line 560
    const/4 v15, 0x0

    .line 561
    const/16 v16, 0x0

    .line 562
    .line 563
    const/16 v17, 0x0

    .line 564
    .line 565
    const/16 v18, 0x0

    .line 566
    .line 567
    const/16 v19, 0x0

    .line 568
    .line 569
    const/16 v20, 0x0

    .line 570
    .line 571
    const/16 v21, 0x0

    .line 572
    .line 573
    invoke-static/range {v3 .. v23}, La/hu70;->a(La/hu70;IIZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;La/suy;ZI)La/hu70;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    if-eqz v1, :cond_f

    .line 582
    .line 583
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object v0

    .line 586
    nop

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
