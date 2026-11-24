.class public final La/c4o;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d4o;


# direct methods
.method public synthetic constructor <init>(La/d4o;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c4o;->i:B

    iput-object p1, p0, La/c4o;->k:La/d4o;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/c4o;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/c4o;->k:La/d4o;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/c4o;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/c4o;-><init>(La/d4o;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/c4o;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/c4o;-><init>(La/d4o;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/c4o;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/c4o;-><init>(La/d4o;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/c4o;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/c4o;-><init>(La/d4o;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c4o;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/c4o;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/c4o;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/c4o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/c4o;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/c4o;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/c4o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/c4o;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/c4o;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/c4o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/c4o;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/c4o;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/c4o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/c4o;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/c4o;->k:La/d4o;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/c4o;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v3, La/d4o;->w:La/nsu;

    .line 34
    .line 35
    iput-boolean v5, v0, La/c4o;->j:Z

    .line 36
    .line 37
    invoke-virtual {v2}, La/nsu;->a()Lkotlin/Unit;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    move-object v4, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    sget v0, La/d4o;->H:I

    .line 46
    .line 47
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 48
    .line 49
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 50
    .line 51
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, La/y3o;

    .line 60
    .line 61
    iget-boolean v2, v6, La/y3o;->m:Z

    .line 62
    .line 63
    xor-int/lit8 v19, v2, 0x1

    .line 64
    .line 65
    const/16 v21, 0x0

    .line 66
    .line 67
    const v22, 0xefff

    .line 68
    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x0

    .line 78
    const-wide/16 v15, 0x0

    .line 79
    .line 80
    const-wide/16 v17, 0x0

    .line 81
    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    invoke-static/range {v6 .. v22}, La/y3o;->a(La/y3o;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;IZZLa/ygq0;Ljava/lang/String;JJZZZI)La/y3o;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    :goto_1
    return-object v4

    .line 97
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget-boolean v6, v0, La/c4o;->j:Z

    .line 100
    .line 101
    if-eqz v6, :cond_5

    .line 102
    .line 103
    if-ne v6, v5, :cond_4

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v2, v3, La/d4o;->y:La/pmi0;

    .line 117
    .line 118
    iput-boolean v5, v0, La/c4o;->j:Z

    .line 119
    .line 120
    invoke-virtual {v2}, La/pmi0;->f()Lkotlin/Unit;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v0, v1, :cond_6

    .line 125
    .line 126
    move-object v4, v1

    .line 127
    goto :goto_3

    .line 128
    :cond_6
    :goto_2
    sget v0, La/d4o;->H:I

    .line 129
    .line 130
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 131
    .line 132
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 133
    .line 134
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-object v6, v0

    .line 142
    check-cast v6, La/y3o;

    .line 143
    .line 144
    iget-boolean v2, v6, La/y3o;->n:Z

    .line 145
    .line 146
    xor-int/lit8 v20, v2, 0x1

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, 0xdfff

    .line 151
    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const-wide/16 v15, 0x0

    .line 162
    .line 163
    const-wide/16 v17, 0x0

    .line 164
    .line 165
    const/16 v19, 0x0

    .line 166
    .line 167
    invoke-static/range {v6 .. v22}, La/y3o;->a(La/y3o;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;IZZLa/ygq0;Ljava/lang/String;JJZZZI)La/y3o;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_3
    return-object v4

    .line 180
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 181
    .line 182
    iget-boolean v6, v0, La/c4o;->j:Z

    .line 183
    .line 184
    if-eqz v6, :cond_9

    .line 185
    .line 186
    if-ne v6, v5, :cond_8

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v3, La/d4o;->p:La/a6u;

    .line 200
    .line 201
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, La/y3o;

    .line 206
    .line 207
    iget-object v6, v6, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v7, La/fns;

    .line 213
    .line 214
    const/16 v8, 0x16

    .line 215
    .line 216
    invoke-direct {v7, v2, v6, v4, v8}, La/fns;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 217
    .line 218
    .line 219
    new-instance v2, La/vsg0;

    .line 220
    .line 221
    invoke-direct {v2, v7}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    new-instance v6, La/rl2;

    .line 225
    .line 226
    const/4 v7, 0x3

    .line 227
    const/16 v8, 0x12

    .line 228
    .line 229
    invoke-direct {v6, v7, v4, v8}, La/rl2;-><init>(ILa/yje;B)V

    .line 230
    .line 231
    .line 232
    new-instance v7, La/dnq;

    .line 233
    .line 234
    invoke-direct {v7, v2, v6, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 235
    .line 236
    .line 237
    new-instance v2, La/sxk;

    .line 238
    .line 239
    const/4 v6, 0x7

    .line 240
    invoke-direct {v2, v3, v4, v6}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 241
    .line 242
    .line 243
    iput-boolean v5, v0, La/c4o;->j:Z

    .line 244
    .line 245
    new-instance v3, La/vnq;

    .line 246
    .line 247
    const/4 v4, 0x2

    .line 248
    sget-object v5, La/h660;->a:La/h660;

    .line 249
    .line 250
    invoke-direct {v3, v5, v2, v4}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v3, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v1, :cond_a

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    :goto_4
    if-ne v0, v1, :cond_b

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_5
    if-ne v0, v1, :cond_c

    .line 268
    .line 269
    move-object v4, v1

    .line 270
    goto :goto_7

    .line 271
    :cond_c
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    :goto_7
    return-object v4

    .line 274
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 275
    .line 276
    iget-boolean v6, v0, La/c4o;->j:Z

    .line 277
    .line 278
    if-eqz v6, :cond_e

    .line 279
    .line 280
    if-ne v6, v5, :cond_d

    .line 281
    .line 282
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto :goto_9

    .line 290
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    new-instance v2, La/cr2;

    .line 294
    .line 295
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 296
    .line 297
    .line 298
    iget-object v3, v3, La/d4o;->u:La/hjd;

    .line 299
    .line 300
    new-instance v4, La/cid;

    .line 301
    .line 302
    invoke-static {v2}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-direct {v4, v6, v2}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v5, v0, La/c4o;->j:Z

    .line 310
    .line 311
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v4, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-ne v0, v1, :cond_f

    .line 319
    .line 320
    move-object v4, v1

    .line 321
    goto :goto_9

    .line 322
    :cond_f
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    :goto_9
    return-object v4

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
