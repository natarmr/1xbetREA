.class public final La/uig;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xig;


# direct methods
.method public synthetic constructor <init>(La/xig;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uig;->i:B

    iput-object p1, p0, La/uig;->k:La/xig;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/uig;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/uig;->k:La/xig;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/uig;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/uig;-><init>(La/xig;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/uig;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/uig;-><init>(La/xig;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/uig;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/uig;-><init>(La/xig;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/uig;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/uig;-><init>(La/xig;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, La/uig;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p1, v1}, La/uig;-><init>(La/xig;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uig;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/uig;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/uig;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/uig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/uig;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/uig;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/uig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/uig;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/uig;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/uig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/uig;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/uig;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/uig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/uig;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/uig;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/uig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uig;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v5, v0, La/uig;->k:La/xig;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v2, v0, La/uig;->j:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-ne v2, v7, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v5, La/xig;->A:La/yk50;

    .line 36
    .line 37
    iget-object v2, v2, La/yk50;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/rch;

    .line 40
    .line 41
    iget-object v2, v2, La/rch;->a:La/op1;

    .line 42
    .line 43
    iget-object v2, v2, La/op1;->a:La/p7m0;

    .line 44
    .line 45
    sget-object v3, La/sip;->c:La/sip;

    .line 46
    .line 47
    sget-object v4, La/iun;->a:La/iun;

    .line 48
    .line 49
    new-instance v8, Lkotlin/Pair;

    .line 50
    .line 51
    invoke-direct {v8, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v3, La/sip;->b:La/sip;

    .line 55
    .line 56
    new-instance v9, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-direct {v9, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v8, v9}, [Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v6, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object v2, v5, La/xig;->C:La/bqc;

    .line 73
    .line 74
    iput-boolean v7, v0, La/uig;->j:Z

    .line 75
    .line 76
    iget-object v0, v2, La/bqc;->a:La/cog;

    .line 77
    .line 78
    iget-object v0, v0, La/cog;->a:La/dog;

    .line 79
    .line 80
    iget-object v0, v0, La/dog;->c:La/p7m0;

    .line 81
    .line 82
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    if-ne v0, v1, :cond_2

    .line 90
    .line 91
    move-object v6, v1

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_1
    return-object v6

    .line 96
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v2, v0, La/uig;->j:Z

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    if-ne v2, v7, :cond_3

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v5, La/xig;->B:La/bqc;

    .line 116
    .line 117
    iput-boolean v7, v0, La/uig;->j:Z

    .line 118
    .line 119
    invoke-virtual {v2}, La/bqc;->a()Lkotlin/Unit;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-ne v0, v1, :cond_5

    .line 124
    .line 125
    move-object v6, v1

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    :goto_3
    return-object v6

    .line 130
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 131
    .line 132
    iget-boolean v8, v0, La/uig;->j:Z

    .line 133
    .line 134
    if-eqz v8, :cond_7

    .line 135
    .line 136
    if-ne v8, v7, :cond_6

    .line 137
    .line 138
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v5, La/xig;->z:La/lhf0;

    .line 150
    .line 151
    iget-object v8, v5, La/xig;->o:La/sip;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v9, v4, La/lhf0;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v9, La/uyn;

    .line 162
    .line 163
    iget-object v9, v9, La/uyn;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v9, La/dhg;

    .line 166
    .line 167
    iget-object v9, v9, La/dhg;->a:La/chg;

    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v9, v9, La/chg;->a:La/p7m0;

    .line 173
    .line 174
    new-instance v10, La/bhg;

    .line 175
    .line 176
    invoke-direct {v10, v9, v8, v3}, La/bhg;-><init>(La/p7m0;La/sip;B)V

    .line 177
    .line 178
    .line 179
    iget-object v9, v4, La/lhf0;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v9, La/vsu;

    .line 182
    .line 183
    iget-object v9, v9, La/vsu;->a:La/rch;

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v9, v9, La/rch;->a:La/op1;

    .line 189
    .line 190
    iget-object v9, v9, La/op1;->a:La/p7m0;

    .line 191
    .line 192
    new-instance v11, La/bhg;

    .line 193
    .line 194
    invoke-direct {v11, v9, v8, v7}, La/bhg;-><init>(La/p7m0;La/sip;B)V

    .line 195
    .line 196
    .line 197
    new-instance v9, La/sch;

    .line 198
    .line 199
    invoke-direct {v9, v4, v8, v6, v3}, La/sch;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 200
    .line 201
    .line 202
    new-instance v4, La/vig;

    .line 203
    .line 204
    invoke-direct {v4, v5, v7}, La/vig;-><init>(La/xig;B)V

    .line 205
    .line 206
    .line 207
    iput-boolean v7, v0, La/uig;->j:Z

    .line 208
    .line 209
    new-array v2, v2, [La/gmq;

    .line 210
    .line 211
    aput-object v10, v2, v3

    .line 212
    .line 213
    aput-object v11, v2, v7

    .line 214
    .line 215
    sget-object v3, La/pul;->j:La/pul;

    .line 216
    .line 217
    new-instance v5, La/kh1;

    .line 218
    .line 219
    const/16 v7, 0x9

    .line 220
    .line 221
    invoke-direct {v5, v9, v6, v7}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v4, v5, v3, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    sget-object v2, La/wne;->a:La/wne;

    .line 229
    .line 230
    if-ne v0, v2, :cond_8

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    :goto_4
    if-ne v0, v1, :cond_9

    .line 236
    .line 237
    move-object v6, v1

    .line 238
    goto :goto_6

    .line 239
    :cond_9
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    :goto_6
    return-object v6

    .line 242
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 243
    .line 244
    iget-boolean v2, v0, La/uig;->j:Z

    .line 245
    .line 246
    if-eqz v2, :cond_b

    .line 247
    .line 248
    if-ne v2, v7, :cond_a

    .line 249
    .line 250
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v2, v5, La/xig;->D:La/bqc;

    .line 264
    .line 265
    iget-object v2, v2, La/bqc;->a:La/cog;

    .line 266
    .line 267
    iget-object v2, v2, La/cog;->a:La/dog;

    .line 268
    .line 269
    iget-object v2, v2, La/dog;->c:La/p7m0;

    .line 270
    .line 271
    new-instance v4, La/vig;

    .line 272
    .line 273
    invoke-direct {v4, v5, v3}, La/vig;-><init>(La/xig;B)V

    .line 274
    .line 275
    .line 276
    iput-boolean v7, v0, La/uig;->j:Z

    .line 277
    .line 278
    invoke-virtual {v2, v4, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-object v6, v1

    .line 282
    :goto_7
    return-object v6

    .line 283
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 284
    .line 285
    iget-boolean v8, v0, La/uig;->j:Z

    .line 286
    .line 287
    if-eqz v8, :cond_d

    .line 288
    .line 289
    if-ne v8, v7, :cond_c

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_c

    .line 295
    .line 296
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_d

    .line 300
    .line 301
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object v11, v5, La/xig;->t:La/o3c;

    .line 305
    .line 306
    iget-object v4, v5, La/xig;->p:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 307
    .line 308
    iget-object v6, v4, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 309
    .line 310
    iget-byte v6, v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 311
    .line 312
    iget-object v8, v4, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->d:Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-nez v9, :cond_e

    .line 319
    .line 320
    :goto_8
    move-object v14, v8

    .line 321
    goto :goto_9

    .line 322
    :cond_e
    iget-wide v8, v4, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->b:J

    .line 323
    .line 324
    const-wide/16 v12, 0x28

    .line 325
    .line 326
    cmp-long v4, v8, v12

    .line 327
    .line 328
    if-nez v4, :cond_f

    .line 329
    .line 330
    sget-object v8, La/iun;->a:La/iun;

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_f
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    goto :goto_8

    .line 342
    :goto_9
    iget-object v13, v5, La/xig;->o:La/sip;

    .line 343
    .line 344
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-static {v6}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    iget-object v4, v11, La/o3c;->d:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v4, La/viu;

    .line 360
    .line 361
    invoke-virtual {v4}, La/viu;->a()J

    .line 362
    .line 363
    .line 364
    move-result-wide v15

    .line 365
    new-instance v4, La/t2h;

    .line 366
    .line 367
    const/4 v8, 0x0

    .line 368
    invoke-direct {v4, v11, v8, v3}, La/t2h;-><init>(La/o3c;La/yje;B)V

    .line 369
    .line 370
    .line 371
    new-instance v3, La/vsg0;

    .line 372
    .line 373
    invoke-direct {v3, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 374
    .line 375
    .line 376
    new-instance v9, La/r2h;

    .line 377
    .line 378
    const/4 v10, 0x0

    .line 379
    invoke-direct/range {v9 .. v16}, La/r2h;-><init>(La/yje;La/o3c;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;J)V

    .line 380
    .line 381
    .line 382
    invoke-static {v3, v9}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    new-instance v4, La/zo1;

    .line 387
    .line 388
    const/16 v9, 0xd

    .line 389
    .line 390
    invoke-direct {v4, v8, v11, v9}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 391
    .line 392
    .line 393
    invoke-static {v3, v4}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    new-instance v9, La/ic1;

    .line 398
    .line 399
    const/16 v14, 0x15

    .line 400
    .line 401
    move-object v12, v11

    .line 402
    move-object v11, v8

    .line 403
    invoke-direct/range {v9 .. v14}, La/ic1;-><init>(La/gmq;La/yje;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 404
    .line 405
    .line 406
    move-object v3, v11

    .line 407
    move-object v11, v12

    .line 408
    new-instance v4, La/vsg0;

    .line 409
    .line 410
    invoke-direct {v4, v9}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 411
    .line 412
    .line 413
    new-instance v8, La/rl2;

    .line 414
    .line 415
    const/4 v9, 0x3

    .line 416
    invoke-direct {v8, v9, v3, v7}, La/rl2;-><init>(ILa/yje;B)V

    .line 417
    .line 418
    .line 419
    new-instance v12, La/dnq;

    .line 420
    .line 421
    invoke-direct {v12, v4, v8, v7}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 422
    .line 423
    .line 424
    iget-object v4, v11, La/o3c;->h:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v4, La/ocl;

    .line 427
    .line 428
    iget-object v4, v4, La/ocl;->a:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, La/m0o0;

    .line 431
    .line 432
    invoke-virtual {v4}, La/m0o0;->b()La/gmq;

    .line 433
    .line 434
    .line 435
    move-result-object v13

    .line 436
    new-instance v4, La/t2h;

    .line 437
    .line 438
    invoke-direct {v4, v11, v3, v7}, La/t2h;-><init>(La/o3c;La/yje;B)V

    .line 439
    .line 440
    .line 441
    new-instance v14, La/vsg0;

    .line 442
    .line 443
    invoke-direct {v14, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 444
    .line 445
    .line 446
    iget-object v4, v11, La/o3c;->g:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v4, La/x2u;

    .line 449
    .line 450
    iget-object v4, v4, La/x2u;->a:La/cog;

    .line 451
    .line 452
    iget-object v4, v4, La/cog;->a:La/dog;

    .line 453
    .line 454
    iget-object v15, v4, La/dog;->d:La/p7m0;

    .line 455
    .line 456
    new-instance v4, La/u2h;

    .line 457
    .line 458
    invoke-direct {v4, v11, v6, v3}, La/u2h;-><init>(La/o3c;ILa/yje;)V

    .line 459
    .line 460
    .line 461
    new-instance v6, La/vsg0;

    .line 462
    .line 463
    invoke-direct {v6, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 464
    .line 465
    .line 466
    new-instance v4, La/q2h;

    .line 467
    .line 468
    invoke-direct {v4, v3}, La/q2h;-><init>(La/yje;)V

    .line 469
    .line 470
    .line 471
    move-object/from16 v17, v4

    .line 472
    .line 473
    move-object/from16 v16, v6

    .line 474
    .line 475
    invoke-static/range {v12 .. v17}, La/dub;->d0(La/gmq;La/gmq;La/gmq;La/gmq;La/gmq;La/aer;)La/a1g;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    new-instance v6, La/e9g;

    .line 480
    .line 481
    const/4 v8, 0x5

    .line 482
    invoke-direct {v6, v5, v3, v8}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 483
    .line 484
    .line 485
    iput-boolean v7, v0, La/uig;->j:Z

    .line 486
    .line 487
    new-instance v3, La/vnq;

    .line 488
    .line 489
    sget-object v5, La/h660;->a:La/h660;

    .line 490
    .line 491
    invoke-direct {v3, v5, v6, v2}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4, v3, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-ne v0, v1, :cond_10

    .line 499
    .line 500
    goto :goto_a

    .line 501
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    :goto_a
    if-ne v0, v1, :cond_11

    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    :goto_b
    if-ne v0, v1, :cond_12

    .line 509
    .line 510
    move-object v6, v1

    .line 511
    goto :goto_d

    .line 512
    :cond_12
    :goto_c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    :goto_d
    return-object v6

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
