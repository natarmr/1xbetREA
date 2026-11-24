.class public final La/qtf;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Z

.field public final synthetic l:La/t33;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(ZLa/t33;ZLa/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/qtf;->i:B

    iput-boolean p1, p0, La/qtf;->k:Z

    iput-object p2, p0, La/qtf;->l:La/t33;

    iput-boolean p3, p0, La/qtf;->m:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZZLa/t33;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/qtf;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/qtf;->k:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/qtf;->m:Z

    .line 7
    .line 8
    iput-object p3, p0, La/qtf;->l:La/t33;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/qtf;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/qtf;

    .line 7
    .line 8
    iget-boolean v0, p0, La/qtf;->m:Z

    .line 9
    .line 10
    iget-object v1, p0, La/qtf;->l:La/t33;

    .line 11
    .line 12
    iget-boolean p0, p0, La/qtf;->k:Z

    .line 13
    .line 14
    invoke-direct {p1, p0, v0, v1, p2}, La/qtf;-><init>(ZZLa/t33;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v2, La/qtf;

    .line 19
    .line 20
    iget-boolean v5, p0, La/qtf;->m:Z

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    iget-boolean v3, p0, La/qtf;->k:Z

    .line 24
    .line 25
    iget-object v4, p0, La/qtf;->l:La/t33;

    .line 26
    .line 27
    move-object v6, p2

    .line 28
    invoke-direct/range {v2 .. v7}, La/qtf;-><init>(ZLa/t33;ZLa/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_1
    move-object v6, p2

    .line 33
    new-instance v3, La/qtf;

    .line 34
    .line 35
    move-object v7, v6

    .line 36
    iget-boolean v6, p0, La/qtf;->m:Z

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    iget-boolean v4, p0, La/qtf;->k:Z

    .line 40
    .line 41
    iget-object v5, p0, La/qtf;->l:La/t33;

    .line 42
    .line 43
    invoke-direct/range {v3 .. v8}, La/qtf;-><init>(ZLa/t33;ZLa/yje;B)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qtf;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qtf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qtf;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qtf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qtf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qtf;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qtf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qtf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qtf;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qtf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/qtf;->i:B

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    const/high16 v2, 0x43480000    # 200.0f

    .line 7
    .line 8
    const/high16 v3, 0x3f400000    # 0.75f

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object v6, v5, La/qtf;->l:La/t33;

    .line 13
    .line 14
    iget-boolean v7, v5, La/qtf;->m:Z

    .line 15
    .line 16
    iget-boolean v8, v5, La/qtf;->k:Z

    .line 17
    .line 18
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x2

    .line 22
    const/4 v12, 0x3

    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x0

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    sget-object v15, La/wne;->a:La/wne;

    .line 29
    .line 30
    iget-byte v0, v5, La/qtf;->j:B

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    if-eq v0, v10, :cond_2

    .line 35
    .line 36
    if-eq v0, v11, :cond_1

    .line 37
    .line 38
    if-ne v0, v12, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-nez v8, :cond_4

    .line 57
    .line 58
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_4
    if-eqz v7, :cond_6

    .line 62
    .line 63
    new-instance v0, Ljava/lang/Float;

    .line 64
    .line 65
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 66
    .line 67
    .line 68
    iput-byte v10, v5, La/qtf;->j:B

    .line 69
    .line 70
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v15, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/Float;

    .line 78
    .line 79
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v2, v14, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iput-byte v11, v5, La/qtf;->j:B

    .line 87
    .line 88
    move-object v1, v0

    .line 89
    iget-object v0, v5, La/qtf;->l:La/t33;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v4, 0x0

    .line 93
    const/16 v6, 0xc

    .line 94
    .line 95
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v15, :cond_7

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    new-instance v0, Ljava/lang/Float;

    .line 103
    .line 104
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 105
    .line 106
    .line 107
    iput-byte v12, v5, La/qtf;->j:B

    .line 108
    .line 109
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-ne v0, v15, :cond_7

    .line 114
    .line 115
    :goto_2
    move-object v14, v15

    .line 116
    goto :goto_4

    .line 117
    :cond_7
    :goto_3
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    :goto_4
    return-object v14

    .line 120
    :pswitch_0
    sget-object v15, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-byte v0, v5, La/qtf;->j:B

    .line 123
    .line 124
    if-eqz v0, :cond_c

    .line 125
    .line 126
    if-eq v0, v10, :cond_b

    .line 127
    .line 128
    if-eq v0, v11, :cond_a

    .line 129
    .line 130
    if-eq v0, v12, :cond_9

    .line 131
    .line 132
    if-ne v0, v1, :cond_8

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_8
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_a

    .line 139
    :cond_9
    :goto_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    if-nez v8, :cond_e

    .line 155
    .line 156
    new-instance v0, Ljava/lang/Float;

    .line 157
    .line 158
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 159
    .line 160
    .line 161
    iput-byte v10, v5, La/qtf;->j:B

    .line 162
    .line 163
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v15, :cond_d

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_d
    :goto_6
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_e
    if-eqz v7, :cond_10

    .line 174
    .line 175
    new-instance v0, Ljava/lang/Float;

    .line 176
    .line 177
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 178
    .line 179
    .line 180
    iput-byte v11, v5, La/qtf;->j:B

    .line 181
    .line 182
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-ne v0, v15, :cond_f

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_f
    :goto_7
    new-instance v0, Ljava/lang/Float;

    .line 190
    .line 191
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 192
    .line 193
    .line 194
    invoke-static {v3, v2, v14, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iput-byte v12, v5, La/qtf;->j:B

    .line 199
    .line 200
    move-object v1, v0

    .line 201
    iget-object v0, v5, La/qtf;->l:La/t33;

    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    const/4 v4, 0x0

    .line 205
    const/16 v6, 0xc

    .line 206
    .line 207
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v15, :cond_11

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_10
    new-instance v0, Ljava/lang/Float;

    .line 215
    .line 216
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 217
    .line 218
    .line 219
    iput-byte v1, v5, La/qtf;->j:B

    .line 220
    .line 221
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v15, :cond_11

    .line 226
    .line 227
    :goto_8
    move-object v14, v15

    .line 228
    goto :goto_a

    .line 229
    :cond_11
    :goto_9
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    :goto_a
    return-object v14

    .line 232
    :pswitch_1
    sget-object v15, La/wne;->a:La/wne;

    .line 233
    .line 234
    iget-byte v0, v5, La/qtf;->j:B

    .line 235
    .line 236
    if-eqz v0, :cond_16

    .line 237
    .line 238
    if-eq v0, v10, :cond_15

    .line 239
    .line 240
    if-eq v0, v11, :cond_14

    .line 241
    .line 242
    if-eq v0, v12, :cond_13

    .line 243
    .line 244
    if-ne v0, v1, :cond_12

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_12
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto :goto_10

    .line 251
    :cond_13
    :goto_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_f

    .line 255
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_d

    .line 259
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    if-nez v8, :cond_18

    .line 267
    .line 268
    new-instance v0, Ljava/lang/Float;

    .line 269
    .line 270
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 271
    .line 272
    .line 273
    iput-byte v10, v5, La/qtf;->j:B

    .line 274
    .line 275
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-ne v0, v15, :cond_17

    .line 280
    .line 281
    goto :goto_e

    .line 282
    :cond_17
    :goto_c
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    goto :goto_10

    .line 285
    :cond_18
    if-eqz v7, :cond_1a

    .line 286
    .line 287
    new-instance v0, Ljava/lang/Float;

    .line 288
    .line 289
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 290
    .line 291
    .line 292
    iput-byte v11, v5, La/qtf;->j:B

    .line 293
    .line 294
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    if-ne v0, v15, :cond_19

    .line 299
    .line 300
    goto :goto_e

    .line 301
    :cond_19
    :goto_d
    new-instance v0, Ljava/lang/Float;

    .line 302
    .line 303
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 304
    .line 305
    .line 306
    invoke-static {v3, v2, v14, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    iput-byte v12, v5, La/qtf;->j:B

    .line 311
    .line 312
    move-object v1, v0

    .line 313
    iget-object v0, v5, La/qtf;->l:La/t33;

    .line 314
    .line 315
    const/4 v3, 0x0

    .line 316
    const/4 v4, 0x0

    .line 317
    const/16 v6, 0xc

    .line 318
    .line 319
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-ne v0, v15, :cond_1b

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_1a
    new-instance v0, Ljava/lang/Float;

    .line 327
    .line 328
    invoke-direct {v0, v13}, Ljava/lang/Float;-><init>(F)V

    .line 329
    .line 330
    .line 331
    iput-byte v1, v5, La/qtf;->j:B

    .line 332
    .line 333
    invoke-virtual {v6, v5, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-ne v0, v15, :cond_1b

    .line 338
    .line 339
    :goto_e
    move-object v14, v15

    .line 340
    goto :goto_10

    .line 341
    :cond_1b
    :goto_f
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    :goto_10
    return-object v14

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
