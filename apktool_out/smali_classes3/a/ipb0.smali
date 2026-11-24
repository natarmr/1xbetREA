.class public final La/ipb0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/lpb0;


# direct methods
.method public synthetic constructor <init>(La/lpb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ipb0;->i:B

    iput-object p1, p0, La/ipb0;->k:La/lpb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ipb0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ipb0;->k:La/lpb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ipb0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ipb0;-><init>(La/lpb0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/ipb0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/ipb0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/ipb0;-><init>(La/lpb0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ipb0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/ipb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/ipb0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/ipb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/ipb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ipb0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ipb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/ipb0;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/ipb0;->k:La/lpb0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v8, v5, La/ipb0;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/zob0;

    .line 24
    .line 25
    iget-object v1, v1, La/zob0;->k:La/sob0;

    .line 26
    .line 27
    sget-object v2, La/rob0;->a:La/rob0;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/zob0;

    .line 40
    .line 41
    iget-object v1, v1, La/zob0;->k:La/sob0;

    .line 42
    .line 43
    sget-object v2, La/qob0;->a:La/qob0;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    invoke-virtual {v6}, La/lpb0;->M()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v15, La/pob0;->a:La/pob0;

    .line 58
    .line 59
    if-nez v8, :cond_2

    .line 60
    .line 61
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/zob0;

    .line 66
    .line 67
    iget-object v1, v1, La/zob0;->k:La/sob0;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-object v9, v2

    .line 85
    check-cast v9, La/zob0;

    .line 86
    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x77ff

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    invoke-static/range {v9 .. v18}, La/zob0;->a(La/zob0;ZZLa/cit0;Ljava/lang/String;La/ql5;La/sob0;Ljava/util/List;Ljava/util/List;I)La/zob0;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, La/zob0;

    .line 114
    .line 115
    iget-object v1, v1, La/zob0;->k:La/sob0;

    .line 116
    .line 117
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, La/zob0;

    .line 128
    .line 129
    iget-object v1, v1, La/zob0;->h:La/cit0;

    .line 130
    .line 131
    if-nez v1, :cond_3

    .line 132
    .line 133
    invoke-virtual {v6}, La/lpb0;->M()V

    .line 134
    .line 135
    .line 136
    :cond_3
    :goto_0
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 137
    .line 138
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object v7, v1

    .line 146
    check-cast v7, La/zob0;

    .line 147
    .line 148
    const/4 v15, 0x0

    .line 149
    const/16 v16, 0x7ffe

    .line 150
    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    invoke-static/range {v7 .. v16}, La/zob0;->a(La/zob0;ZZLa/cit0;Ljava/lang/String;La/ql5;La/sob0;Ljava/util/List;Ljava/util/List;I)La/zob0;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_4

    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_0
    iget-object v7, v6, La/i3t0;->i:La/ocj;

    .line 171
    .line 172
    sget-object v8, La/wne;->a:La/wne;

    .line 173
    .line 174
    iget-boolean v0, v5, La/ipb0;->j:Z

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v1, 0x1

    .line 178
    if-eqz v0, :cond_6

    .line 179
    .line 180
    if-ne v0, v1, :cond_5

    .line 181
    .line 182
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v0, p1

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 189
    .line 190
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object v8, v9

    .line 194
    goto/16 :goto_3

    .line 195
    .line 196
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget v0, La/lpb0;->G:I

    .line 200
    .line 201
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 202
    .line 203
    :goto_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-object v10, v2

    .line 211
    check-cast v10, La/zob0;

    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const/16 v19, 0x7ffd

    .line 216
    .line 217
    const/4 v11, 0x0

    .line 218
    const/4 v12, 0x1

    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    invoke-static/range {v10 .. v19}, La/zob0;->a(La/zob0;ZZLa/cit0;Ljava/lang/String;La/ql5;La/sob0;Ljava/util/List;Ljava/util/List;I)La/zob0;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_a

    .line 235
    .line 236
    iget-object v0, v6, La/lpb0;->w:La/g320;

    .line 237
    .line 238
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, La/zob0;

    .line 243
    .line 244
    iget-object v10, v2, La/zob0;->h:La/cit0;

    .line 245
    .line 246
    if-eqz v10, :cond_9

    .line 247
    .line 248
    iget-object v2, v6, La/lpb0;->z:La/x1u;

    .line 249
    .line 250
    invoke-virtual {v2}, La/x1u;->a()J

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    iget-wide v13, v6, La/lpb0;->p:J

    .line 255
    .line 256
    iget-object v2, v6, La/lpb0;->x:La/k7u;

    .line 257
    .line 258
    iget-object v2, v2, La/k7u;->a:La/uzc;

    .line 259
    .line 260
    invoke-virtual {v2}, La/uzc;->b()La/jvn;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, La/jvn;->getId()I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    iget-object v2, v6, La/lpb0;->o:Ljava/lang/String;

    .line 269
    .line 270
    move-object/from16 v16, v2

    .line 271
    .line 272
    invoke-static/range {v10 .. v16}, La/r8x;->a0(La/cit0;JJILjava/lang/String;)La/ouj0;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    iget-object v3, v6, La/lpb0;->v:La/pru;

    .line 277
    .line 278
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    iget-object v3, v3, La/sff0;->I1:La/oxk0;

    .line 283
    .line 284
    iget-byte v4, v3, La/oxk0;->a:B

    .line 285
    .line 286
    iput-boolean v1, v5, La/ipb0;->j:Z

    .line 287
    .line 288
    move-object v1, v2

    .line 289
    const-wide/16 v2, 0x0

    .line 290
    .line 291
    invoke-virtual/range {v0 .. v5}, La/g320;->b(La/ouj0;JILa/yje;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-ne v0, v8, :cond_7

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_7
    :goto_2
    check-cast v0, La/pa20;

    .line 299
    .line 300
    sget v1, La/lpb0;->G:I

    .line 301
    .line 302
    iget-object v1, v7, La/ocj;->a:La/p7m0;

    .line 303
    .line 304
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-object v10, v2

    .line 312
    check-cast v10, La/zob0;

    .line 313
    .line 314
    const/16 v18, 0x0

    .line 315
    .line 316
    const/16 v19, 0x7ffd

    .line 317
    .line 318
    const/4 v11, 0x0

    .line 319
    const/4 v12, 0x0

    .line 320
    const/4 v13, 0x0

    .line 321
    const/4 v14, 0x0

    .line 322
    const/4 v15, 0x0

    .line 323
    const/16 v16, 0x0

    .line 324
    .line 325
    const/16 v17, 0x0

    .line 326
    .line 327
    invoke-static/range {v10 .. v19}, La/zob0;->a(La/zob0;ZZLa/cit0;Ljava/lang/String;La/ql5;La/sob0;Ljava/util/List;Ljava/util/List;I)La/zob0;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-eqz v2, :cond_8

    .line 336
    .line 337
    iget-object v1, v6, La/lpb0;->s:La/mne;

    .line 338
    .line 339
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 340
    .line 341
    new-instance v2, La/r72;

    .line 342
    .line 343
    const/16 v3, 0xe

    .line 344
    .line 345
    invoke-direct {v2, v0, v6, v9, v3}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 346
    .line 347
    .line 348
    const/4 v0, 0x2

    .line 349
    invoke-static {v6, v1, v9, v2, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 350
    .line 351
    .line 352
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    :goto_3
    return-object v8

    .line 358
    :cond_a
    move-object/from16 v5, p0

    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
