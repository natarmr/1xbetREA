.class public final La/qdn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/rdn0;


# direct methods
.method public synthetic constructor <init>(La/rdn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qdn0;->i:B

    iput-object p1, p0, La/qdn0;->k:La/rdn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qdn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qdn0;->k:La/rdn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qdn0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qdn0;-><init>(La/rdn0;La/yje;B)V

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
    iput-boolean p0, v0, La/qdn0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/qdn0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/qdn0;-><init>(La/rdn0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/qdn0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/qdn0;-><init>(La/rdn0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qdn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qdn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/qdn0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/qdn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qdn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qdn0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/qdn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/qdn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/qdn0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/qdn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qdn0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/qdn0;->k:La/rdn0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v0, La/qdn0;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v1, La/rdn0;->I:I

    .line 22
    .line 23
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v6, v3

    .line 35
    check-cast v6, La/hdn0;

    .line 36
    .line 37
    const/16 v19, 0x0

    .line 38
    .line 39
    const/16 v20, 0x17ff

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    const/16 v17, 0x0

    .line 53
    .line 54
    move/from16 v18, v0

    .line 55
    .line 56
    invoke-static/range {v6 .. v20}, La/hdn0;->a(La/hdn0;Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/hdn0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    if-eqz v18, :cond_0

    .line 67
    .line 68
    invoke-virtual {v5}, La/rdn0;->N()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_0
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/hdn0;

    .line 77
    .line 78
    iget-object v0, v0, La/hdn0;->d:La/cdn0;

    .line 79
    .line 80
    sget-object v2, La/cdn0;->a:La/cdn0;

    .line 81
    .line 82
    if-ne v0, v2, :cond_2

    .line 83
    .line 84
    invoke-virtual {v5}, La/rdn0;->O()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v5}, La/rdn0;->N()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v2, v1

    .line 105
    check-cast v2, La/hdn0;

    .line 106
    .line 107
    sget-object v6, La/cdn0;->b:La/cdn0;

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    const/16 v16, 0x1ff7

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v11, 0x0

    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    invoke-static/range {v2 .. v16}, La/hdn0;->a(La/hdn0;Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/hdn0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_3

    .line 132
    .line 133
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_4
    move/from16 v0, v18

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_0
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 140
    .line 141
    sget-object v6, La/wne;->a:La/wne;

    .line 142
    .line 143
    iget-boolean v7, v0, La/qdn0;->j:Z

    .line 144
    .line 145
    if-eqz v7, :cond_6

    .line 146
    .line 147
    if-ne v7, v3, :cond_5

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget v2, La/rdn0;->I:I

    .line 164
    .line 165
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 166
    .line 167
    :cond_7
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-object v8, v2

    .line 175
    check-cast v8, La/hdn0;

    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const/16 v22, 0x1f7f

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v10, 0x0

    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v12, 0x0

    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const/16 v16, 0x1

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const/16 v19, 0x0

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    invoke-static/range {v8 .. v22}, La/hdn0;->a(La/hdn0;Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/hdn0;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v7, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_7

    .line 207
    .line 208
    iget-object v2, v5, La/rdn0;->q:La/dj9;

    .line 209
    .line 210
    iput-boolean v3, v0, La/qdn0;->j:Z

    .line 211
    .line 212
    iget-object v2, v2, La/dj9;->a:La/nvu;

    .line 213
    .line 214
    invoke-virtual {v2, v0}, La/nvu;->t(La/zje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-ne v0, v6, :cond_8

    .line 219
    .line 220
    move-object v4, v6

    .line 221
    goto :goto_5

    .line 222
    :cond_8
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    sget v0, La/rdn0;->I:I

    .line 231
    .line 232
    invoke-virtual {v5}, La/rdn0;->N()V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_9
    sget v0, La/rdn0;->I:I

    .line 237
    .line 238
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 239
    .line 240
    :cond_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-object v3, v0

    .line 248
    check-cast v3, La/hdn0;

    .line 249
    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    const/16 v17, 0x1f7f

    .line 253
    .line 254
    const/4 v4, 0x0

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v10, 0x0

    .line 261
    const/4 v11, 0x0

    .line 262
    const/4 v12, 0x0

    .line 263
    const/4 v13, 0x0

    .line 264
    const/4 v14, 0x0

    .line 265
    const/4 v15, 0x0

    .line 266
    invoke-static/range {v3 .. v17}, La/hdn0;->a(La/hdn0;Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/hdn0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_a

    .line 275
    .line 276
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    :goto_5
    return-object v4

    .line 279
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 280
    .line 281
    iget-boolean v6, v0, La/qdn0;->j:Z

    .line 282
    .line 283
    if-eqz v6, :cond_c

    .line 284
    .line 285
    if-ne v6, v3, :cond_b

    .line 286
    .line 287
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object v2, v5, La/rdn0;->u:La/yhi;

    .line 299
    .line 300
    invoke-virtual {v5}, La/rdn0;->O()Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    invoke-virtual {v5}, La/rdn0;->O()Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    iget-object v8, v5, La/rdn0;->E:La/a8z;

    .line 309
    .line 310
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, La/sff0;

    .line 315
    .line 316
    iget-boolean v8, v8, La/sff0;->J1:Z

    .line 317
    .line 318
    invoke-virtual {v2, v6, v7, v8}, La/yhi;->d(ZZZ)La/mdq;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    new-instance v6, La/za60;

    .line 323
    .line 324
    const/16 v7, 0xe

    .line 325
    .line 326
    invoke-direct {v6, v4, v5, v7}, La/za60;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 327
    .line 328
    .line 329
    invoke-static {v2, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    new-instance v4, La/r0m0;

    .line 334
    .line 335
    const/16 v6, 0x11

    .line 336
    .line 337
    invoke-direct {v4, v5, v6}, La/r0m0;-><init>(Ljava/lang/Object;B)V

    .line 338
    .line 339
    .line 340
    iput-boolean v3, v0, La/qdn0;->j:Z

    .line 341
    .line 342
    invoke-virtual {v2, v4, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-ne v0, v1, :cond_d

    .line 347
    .line 348
    move-object v4, v1

    .line 349
    goto :goto_7

    .line 350
    :cond_d
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    :goto_7
    return-object v4

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
