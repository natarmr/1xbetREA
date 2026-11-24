.class public final La/wnp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/eop;


# direct methods
.method public synthetic constructor <init>(La/eop;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wnp;->i:B

    iput-object p1, p0, La/wnp;->k:La/eop;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wnp;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wnp;->k:La/eop;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wnp;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wnp;-><init>(La/eop;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wnp;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wnp;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wnp;-><init>(La/eop;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wnp;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/wnp;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/wnp;-><init>(La/eop;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/wnp;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/wnp;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/wnp;-><init>(La/eop;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/wnp;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wnp;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/x5r0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wnp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wnp;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wnp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ghq0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wnp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wnp;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wnp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wnp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wnp;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wnp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/zmb;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/wnp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/wnp;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/wnp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wnp;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/wnp;->k:La/eop;

    .line 8
    .line 9
    iget-object v0, v0, La/wnp;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/x5r0;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v1, v0, La/x5r0;->a:Z

    .line 22
    .line 23
    if-eqz v1, :cond_15

    .line 24
    .line 25
    iget-object v0, v0, La/x5r0;->b:La/nas;

    .line 26
    .line 27
    sget v1, La/eop;->Z:I

    .line 28
    .line 29
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/pnp;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, La/hfm0;->w(La/pnp;)La/j700;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v6, v1, La/pnp;->d:La/f9h0;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x2

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    if-eq v7, v3, :cond_1

    .line 53
    .line 54
    if-eq v7, v9, :cond_1

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    if-ne v7, v2, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_a

    .line 64
    .line 65
    :cond_1
    :goto_0
    move/from16 v19, v3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move/from16 v19, v2

    .line 69
    .line 70
    :goto_1
    sget-object v2, La/y8h0;->a:La/y8h0;

    .line 71
    .line 72
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    sget-object v2, La/z8h0;->a:La/z8h0;

    .line 79
    .line 80
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    instance-of v2, v6, La/d8h0;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    iget-object v1, v1, La/pnp;->m:La/a4x;

    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :goto_2
    move-object/from16 v18, v1

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_4
    instance-of v1, v6, La/m8h0;

    .line 101
    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    instance-of v1, v6, La/p8h0;

    .line 105
    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_a

    .line 113
    .line 114
    :cond_6
    :goto_3
    move-object/from16 v18, v8

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    :goto_4
    sget-object v1, La/iun;->a:La/iun;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :goto_5
    if-eqz v18, :cond_13

    .line 121
    .line 122
    if-eqz v0, :cond_13

    .line 123
    .line 124
    instance-of v1, v6, La/d8h0;

    .line 125
    .line 126
    if-eqz v1, :cond_c

    .line 127
    .line 128
    check-cast v6, La/d8h0;

    .line 129
    .line 130
    iget-object v1, v6, La/d8h0;->a:Ljava/util/Set;

    .line 131
    .line 132
    check-cast v1, Ljava/util/Collection;

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_8

    .line 139
    .line 140
    sget-object v1, La/v5r0;->k:La/v5r0;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    sget-object v1, La/j700;->b:La/j700;

    .line 144
    .line 145
    if-ne v5, v1, :cond_9

    .line 146
    .line 147
    sget-object v1, La/v5r0;->h:La/v5r0;

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_9
    sget-object v1, La/j700;->a:La/j700;

    .line 151
    .line 152
    if-ne v5, v1, :cond_a

    .line 153
    .line 154
    sget-object v1, La/v5r0;->i:La/v5r0;

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_a
    sget-object v1, La/j700;->c:La/j700;

    .line 158
    .line 159
    if-ne v5, v1, :cond_b

    .line 160
    .line 161
    sget-object v1, La/v5r0;->j:La/v5r0;

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_b
    sget-object v1, La/v5r0;->i:La/v5r0;

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_c
    instance-of v1, v6, La/y8h0;

    .line 168
    .line 169
    if-eqz v1, :cond_10

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_f

    .line 176
    .line 177
    if-eq v1, v3, :cond_e

    .line 178
    .line 179
    if-eq v1, v9, :cond_d

    .line 180
    .line 181
    sget-object v1, La/v5r0;->e:La/v5r0;

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_d
    sget-object v1, La/v5r0;->f:La/v5r0;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_e
    sget-object v1, La/v5r0;->d:La/v5r0;

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_f
    sget-object v1, La/v5r0;->e:La/v5r0;

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_10
    instance-of v1, v6, La/z8h0;

    .line 194
    .line 195
    if-eqz v1, :cond_11

    .line 196
    .line 197
    sget-object v1, La/v5r0;->g:La/v5r0;

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_11
    sget-object v1, La/v5r0;->c:La/v5r0;

    .line 201
    .line 202
    :goto_6
    iget-object v1, v1, La/v5r0;->a:Ljava/lang/String;

    .line 203
    .line 204
    iget-wide v11, v0, La/nas;->a:J

    .line 205
    .line 206
    iget-wide v13, v0, La/nas;->x:J

    .line 207
    .line 208
    iget-object v0, v0, La/nas;->w:Ljava/lang/Long;

    .line 209
    .line 210
    if-eqz v0, :cond_12

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    :goto_7
    move-wide v15, v2

    .line 217
    goto :goto_8

    .line 218
    :cond_12
    const-wide/16 v2, 0x0

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :goto_8
    new-instance v10, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 222
    .line 223
    move-object/from16 v17, v1

    .line 224
    .line 225
    invoke-direct/range {v10 .. v19}, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;-><init>(JJJLjava/lang/String;Ljava/util/List;Z)V

    .line 226
    .line 227
    .line 228
    move-object v8, v10

    .line 229
    :cond_13
    if-nez v8, :cond_14

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_14
    new-instance v0, La/dkp;

    .line 233
    .line 234
    invoke-direct {v0, v8}, La/dkp;-><init>(Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_15
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    :goto_a
    return-object v8

    .line 243
    :pswitch_0
    check-cast v0, La/ghq0;

    .line 244
    .line 245
    sget-object v1, La/wne;->a:La/wne;

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, v0, La/ghq0;->a:La/ygq0;

    .line 251
    .line 252
    sget v5, La/eop;->Z:I

    .line 253
    .line 254
    sget-object v5, La/ygq0;->c:La/ygq0;

    .line 255
    .line 256
    if-eq v1, v5, :cond_16

    .line 257
    .line 258
    move/from16 v19, v3

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_16
    move/from16 v19, v2

    .line 262
    .line 263
    :goto_b
    iget-object v1, v4, La/eop;->o:La/vzg0;

    .line 264
    .line 265
    const-string v2, "KEY_TIME_ACTIVE_STATE"

    .line 266
    .line 267
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 275
    .line 276
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 277
    .line 278
    :goto_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    move-object v5, v2

    .line 286
    check-cast v5, La/pnp;

    .line 287
    .line 288
    const/16 v20, 0x0

    .line 289
    .line 290
    const v22, 0xbffff

    .line 291
    .line 292
    .line 293
    const/4 v6, 0x0

    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x0

    .line 296
    const/4 v9, 0x0

    .line 297
    const/4 v10, 0x0

    .line 298
    const/4 v11, 0x0

    .line 299
    const/4 v12, 0x0

    .line 300
    const/4 v13, 0x0

    .line 301
    const/4 v14, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    move-object/from16 v21, v0

    .line 310
    .line 311
    invoke-static/range {v5 .. v22}, La/pnp;->a(La/pnp;La/hop;ZLa/f9h0;Ljava/lang/String;ZZLa/a4x;ZILa/a4x;ZZZZLa/zmb;La/ghq0;I)La/pnp;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_17

    .line 320
    .line 321
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :cond_17
    move-object/from16 v0, v21

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :pswitch_1
    check-cast v0, Ljava/lang/String;

    .line 328
    .line 329
    sget-object v1, La/wne;->a:La/wne;

    .line 330
    .line 331
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, La/pnp;

    .line 339
    .line 340
    iget-object v1, v1, La/pnp;->d:La/f9h0;

    .line 341
    .line 342
    instance-of v2, v1, La/m8h0;

    .line 343
    .line 344
    if-eqz v2, :cond_18

    .line 345
    .line 346
    check-cast v1, La/m8h0;

    .line 347
    .line 348
    iget-object v2, v1, La/m8h0;->b:Ljava/util/Set;

    .line 349
    .line 350
    iget-boolean v1, v1, La/m8h0;->c:Z

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    new-instance v3, La/m8h0;

    .line 359
    .line 360
    invoke-direct {v3, v0, v2, v1}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 361
    .line 362
    .line 363
    move-object v8, v3

    .line 364
    goto :goto_d

    .line 365
    :cond_18
    move-object v8, v1

    .line 366
    :goto_d
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 367
    .line 368
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 369
    .line 370
    :cond_19
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-object v5, v0

    .line 378
    check-cast v5, La/pnp;

    .line 379
    .line 380
    const/16 v21, 0x0

    .line 381
    .line 382
    const v22, 0x1ffff7

    .line 383
    .line 384
    .line 385
    const/4 v6, 0x0

    .line 386
    const/4 v7, 0x0

    .line 387
    const/4 v9, 0x0

    .line 388
    const/4 v10, 0x0

    .line 389
    const/4 v11, 0x0

    .line 390
    const/4 v12, 0x0

    .line 391
    const/4 v13, 0x0

    .line 392
    const/4 v14, 0x0

    .line 393
    const/4 v15, 0x0

    .line 394
    const/16 v16, 0x0

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const/16 v18, 0x0

    .line 399
    .line 400
    const/16 v19, 0x0

    .line 401
    .line 402
    const/16 v20, 0x0

    .line 403
    .line 404
    invoke-static/range {v5 .. v22}, La/pnp;->a(La/pnp;La/hop;ZLa/f9h0;Ljava/lang/String;ZZLa/a4x;ZILa/a4x;ZZZZLa/zmb;La/ghq0;I)La/pnp;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_19

    .line 413
    .line 414
    iget-object v0, v4, La/eop;->o:La/vzg0;

    .line 415
    .line 416
    const-string v1, "KEY_SCREEN_STATE"

    .line 417
    .line 418
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-virtual {v0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_2
    move-object/from16 v20, v0

    .line 429
    .line 430
    check-cast v20, La/zmb;

    .line 431
    .line 432
    sget-object v0, La/wne;->a:La/wne;

    .line 433
    .line 434
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    sget v0, La/eop;->Z:I

    .line 438
    .line 439
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 440
    .line 441
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 442
    .line 443
    :goto_e
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    move-object v5, v1

    .line 451
    check-cast v5, La/pnp;

    .line 452
    .line 453
    const/16 v21, 0x0

    .line 454
    .line 455
    const v22, 0x17ffff

    .line 456
    .line 457
    .line 458
    const/4 v6, 0x0

    .line 459
    const/4 v7, 0x0

    .line 460
    const/4 v8, 0x0

    .line 461
    const/4 v9, 0x0

    .line 462
    const/4 v10, 0x0

    .line 463
    const/4 v11, 0x0

    .line 464
    const/4 v12, 0x0

    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const/16 v16, 0x0

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/16 v18, 0x0

    .line 473
    .line 474
    const/16 v19, 0x0

    .line 475
    .line 476
    invoke-static/range {v5 .. v22}, La/pnp;->a(La/pnp;La/hop;ZLa/f9h0;Ljava/lang/String;ZZLa/a4x;ZILa/a4x;ZZZZLa/zmb;La/ghq0;I)La/pnp;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    move-object/from16 v3, v20

    .line 481
    .line 482
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    if-eqz v1, :cond_1a

    .line 487
    .line 488
    iget-object v0, v4, La/eop;->o:La/vzg0;

    .line 489
    .line 490
    const-string v1, "KEY_CHAMP_SORT_TYPE"

    .line 491
    .line 492
    invoke-virtual {v0, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    return-object v0

    .line 498
    :cond_1a
    move-object/from16 v20, v3

    .line 499
    .line 500
    goto :goto_e

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
