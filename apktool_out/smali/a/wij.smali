.class public final La/wij;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/wij;->j:B

    iput-object p1, p0, La/wij;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wij;->j:B

    iput-object p1, p0, La/wij;->m:Ljava/lang/Object;

    iput-object p2, p0, La/wij;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wij;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/wij;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wij;

    .line 9
    .line 10
    iget-object p0, p0, La/wij;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/xoa0;

    .line 13
    .line 14
    check-cast v1, La/mie0;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v0, p0, v1, p2, v2}, La/wij;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/wij;->l:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p0, La/wij;

    .line 24
    .line 25
    check-cast v1, La/p5q0;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-direct {p0, v1, p2, v0}, La/wij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/wij;->l:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance v0, La/wij;

    .line 35
    .line 36
    iget-object p0, p0, La/wij;->m:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lkotlin/coroutines/CoroutineContext;

    .line 39
    .line 40
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, p0, v1, p2, v2}, La/wij;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v0, La/wij;->l:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_2
    new-instance p0, La/wij;

    .line 50
    .line 51
    check-cast v1, La/xij;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, v1, p2, v0}, La/wij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, La/wij;->l:Ljava/lang/Object;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

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
    iget-byte v0, p0, La/wij;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wij;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wij;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wij;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wij;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wij;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wij;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wij;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wij;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wij;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wij;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wij;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wij;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/wij;->j:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v1, La/wij;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v6, La/mie0;

    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v2, v1, La/wij;->k:B

    .line 22
    .line 23
    sget-object v9, La/h710;->a:La/h710;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    if-eq v2, v5, :cond_1

    .line 28
    .line 29
    if-ne v2, v7, :cond_0

    .line 30
    .line 31
    iget-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/inn0;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v4, p1

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    iget-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, La/inn0;

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/inn0;

    .line 63
    .line 64
    :cond_3
    iget-object v4, v1, La/wij;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, La/xoa0;

    .line 67
    .line 68
    iput-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 69
    .line 70
    iput-byte v5, v1, La/wij;->k:B

    .line 71
    .line 72
    invoke-virtual {v2, v4, v1}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-ne v4, v0, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    :goto_0
    check-cast v4, La/woa0;

    .line 80
    .line 81
    iget-object v8, v4, La/woa0;->a:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    move v11, v3

    .line 88
    :goto_1
    if-ge v11, v10, :cond_c

    .line 89
    .line 90
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, La/dpa0;

    .line 95
    .line 96
    invoke-static {v12}, La/x2x;->K(La/dpa0;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-nez v12, :cond_b

    .line 101
    .line 102
    iget v4, v4, La/woa0;->c:I

    .line 103
    .line 104
    if-ne v4, v7, :cond_5

    .line 105
    .line 106
    sget-object v0, La/j710;->a:La/j710;

    .line 107
    .line 108
    iput-object v0, v6, La/mie0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_5
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    move v10, v3

    .line 117
    :goto_2
    if-ge v10, v4, :cond_8

    .line 118
    .line 119
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    check-cast v11, La/dpa0;

    .line 124
    .line 125
    invoke-virtual {v11}, La/dpa0;->c()Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_7

    .line 130
    .line 131
    iget-object v12, v2, La/inn0;->f:La/jnn0;

    .line 132
    .line 133
    iget-wide v12, v12, La/jnn0;->x:J

    .line 134
    .line 135
    invoke-virtual {v2}, La/inn0;->c()J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    invoke-static {v11, v12, v13, v14, v15}, La/x2x;->h0(La/dpa0;JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_6

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    :goto_3
    iput-object v9, v6, La/mie0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_8
    sget-object v4, La/xoa0;->c:La/xoa0;

    .line 153
    .line 154
    iput-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 155
    .line 156
    iput-byte v7, v1, La/wij;->k:B

    .line 157
    .line 158
    invoke-virtual {v2, v4, v1}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-ne v4, v0, :cond_9

    .line 163
    .line 164
    :goto_4
    move-object v8, v0

    .line 165
    goto :goto_8

    .line 166
    :cond_9
    :goto_5
    check-cast v4, La/woa0;

    .line 167
    .line 168
    iget-object v4, v4, La/woa0;->a:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    move v10, v3

    .line 175
    :goto_6
    if-ge v10, v8, :cond_3

    .line 176
    .line 177
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    check-cast v11, La/dpa0;

    .line 182
    .line 183
    invoke-virtual {v11}, La/dpa0;->c()Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_a

    .line 188
    .line 189
    iput-object v9, v6, La/mie0;->a:Ljava/lang/Object;

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_c
    new-instance v0, La/i710;

    .line 199
    .line 200
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, La/dpa0;

    .line 205
    .line 206
    invoke-direct {v0, v1}, La/i710;-><init>(La/dpa0;)V

    .line 207
    .line 208
    .line 209
    iput-object v0, v6, La/mie0;->a:Ljava/lang/Object;

    .line 210
    .line 211
    :goto_7
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_8
    return-object v8

    .line 214
    :pswitch_0
    check-cast v6, La/p5q0;

    .line 215
    .line 216
    sget-object v0, La/wne;->a:La/wne;

    .line 217
    .line 218
    iget-byte v2, v1, La/wij;->k:B

    .line 219
    .line 220
    if-eqz v2, :cond_f

    .line 221
    .line 222
    if-eq v2, v5, :cond_e

    .line 223
    .line 224
    if-ne v2, v7, :cond_d

    .line 225
    .line 226
    iget-object v2, v1, La/wij;->m:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v2, La/dpa0;

    .line 229
    .line 230
    iget-object v4, v1, La/wij;->l:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v4, La/inn0;

    .line 233
    .line 234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v5, p1

    .line 238
    .line 239
    goto :goto_c

    .line 240
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_e

    .line 244
    :cond_e
    iget-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, La/inn0;

    .line 247
    .line 248
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v4, p1

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    iget-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, La/inn0;

    .line 260
    .line 261
    iput-object v2, v1, La/wij;->l:Ljava/lang/Object;

    .line 262
    .line 263
    iput-byte v5, v1, La/wij;->k:B

    .line 264
    .line 265
    invoke-static {v2, v3, v1, v7}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-ne v4, v0, :cond_10

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_10
    :goto_9
    check-cast v4, La/dpa0;

    .line 273
    .line 274
    iget-wide v8, v4, La/dpa0;->c:J

    .line 275
    .line 276
    invoke-interface {v6}, La/p5q0;->b()V

    .line 277
    .line 278
    .line 279
    move-object/from16 v18, v4

    .line 280
    .line 281
    move-object v4, v2

    .line 282
    move-object/from16 v2, v18

    .line 283
    .line 284
    :goto_a
    iput-object v4, v1, La/wij;->l:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v2, v1, La/wij;->m:Ljava/lang/Object;

    .line 287
    .line 288
    iput-byte v7, v1, La/wij;->k:B

    .line 289
    .line 290
    sget-object v5, La/xoa0;->b:La/xoa0;

    .line 291
    .line 292
    invoke-virtual {v4, v5, v1}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    if-ne v5, v0, :cond_11

    .line 297
    .line 298
    :goto_b
    move-object v8, v0

    .line 299
    goto :goto_e

    .line 300
    :cond_11
    :goto_c
    check-cast v5, La/woa0;

    .line 301
    .line 302
    iget-object v5, v5, La/woa0;->a:Ljava/util/List;

    .line 303
    .line 304
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    move v9, v3

    .line 309
    :goto_d
    if-ge v9, v8, :cond_13

    .line 310
    .line 311
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    check-cast v10, La/dpa0;

    .line 316
    .line 317
    iget-wide v11, v10, La/dpa0;->a:J

    .line 318
    .line 319
    iget-wide v13, v2, La/dpa0;->a:J

    .line 320
    .line 321
    invoke-static {v11, v12, v13, v14}, La/b5x;->I(JJ)Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-eqz v11, :cond_12

    .line 326
    .line 327
    iget-boolean v10, v10, La/dpa0;->d:Z

    .line 328
    .line 329
    if-eqz v10, :cond_12

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_13
    invoke-interface {v6}, La/p5q0;->d()V

    .line 336
    .line 337
    .line 338
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    :goto_e
    return-object v8

    .line 341
    :pswitch_1
    iget-object v0, v1, La/wij;->m:Ljava/lang/Object;

    .line 342
    .line 343
    move-object v3, v0

    .line 344
    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    .line 345
    .line 346
    sget-object v9, La/wne;->a:La/wne;

    .line 347
    .line 348
    iget-byte v0, v1, La/wij;->k:B

    .line 349
    .line 350
    if-eqz v0, :cond_17

    .line 351
    .line 352
    if-eq v0, v5, :cond_16

    .line 353
    .line 354
    if-eq v0, v7, :cond_15

    .line 355
    .line 356
    if-ne v0, v2, :cond_14

    .line 357
    .line 358
    iget-object v0, v1, La/wij;->l:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, La/inn0;

    .line 361
    .line 362
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto :goto_f

    .line 366
    :cond_14
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_14

    .line 370
    :cond_15
    iget-object v0, v1, La/wij;->l:Ljava/lang/Object;

    .line 371
    .line 372
    move-object v4, v0

    .line 373
    check-cast v4, La/inn0;

    .line 374
    .line 375
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    .line 377
    .line 378
    goto :goto_10

    .line 379
    :catch_0
    move-exception v0

    .line 380
    goto :goto_12

    .line 381
    :cond_16
    iget-object v0, v1, La/wij;->l:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v4, v0

    .line 384
    check-cast v4, La/inn0;

    .line 385
    .line 386
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 387
    .line 388
    .line 389
    goto :goto_11

    .line 390
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object v0, v1, La/wij;->l:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, La/inn0;

    .line 396
    .line 397
    :goto_f
    move-object v4, v0

    .line 398
    :cond_18
    :goto_10
    invoke-static {v3}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_1b

    .line 403
    .line 404
    :try_start_2
    move-object v0, v6

    .line 405
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 406
    .line 407
    iput-object v4, v1, La/wij;->l:Ljava/lang/Object;

    .line 408
    .line 409
    iput-byte v5, v1, La/wij;->k:B

    .line 410
    .line 411
    invoke-interface {v0, v4, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-ne v0, v9, :cond_19

    .line 416
    .line 417
    goto :goto_13

    .line 418
    :cond_19
    :goto_11
    iput-object v4, v1, La/wij;->l:Ljava/lang/Object;

    .line 419
    .line 420
    iput-byte v7, v1, La/wij;->k:B

    .line 421
    .line 422
    sget-object v0, La/xoa0;->c:La/xoa0;

    .line 423
    .line 424
    invoke-static {v4, v0, v1}, La/ebc;->X(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 428
    if-ne v0, v9, :cond_18

    .line 429
    .line 430
    goto :goto_13

    .line 431
    :goto_12
    invoke-static {v3}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    if-eqz v8, :cond_1a

    .line 436
    .line 437
    iput-object v4, v1, La/wij;->l:Ljava/lang/Object;

    .line 438
    .line 439
    iput-byte v2, v1, La/wij;->k:B

    .line 440
    .line 441
    sget-object v0, La/xoa0;->c:La/xoa0;

    .line 442
    .line 443
    invoke-static {v4, v0, v1}, La/ebc;->X(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    if-ne v0, v9, :cond_18

    .line 448
    .line 449
    :goto_13
    move-object v8, v9

    .line 450
    goto :goto_14

    .line 451
    :cond_1a
    throw v0

    .line 452
    :cond_1b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    :goto_14
    return-object v8

    .line 455
    :pswitch_2
    sget-object v0, La/f1t0;->f:La/mtc;

    .line 456
    .line 457
    iget-object v9, v1, La/wij;->l:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v9, La/inn0;

    .line 460
    .line 461
    sget-object v10, La/wne;->a:La/wne;

    .line 462
    .line 463
    iget-byte v11, v1, La/wij;->k:B

    .line 464
    .line 465
    if-eqz v11, :cond_1e

    .line 466
    .line 467
    if-eq v11, v5, :cond_1d

    .line 468
    .line 469
    if-ne v11, v7, :cond_1c

    .line 470
    .line 471
    iget-object v4, v1, La/wij;->m:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v4, La/woa0;

    .line 474
    .line 475
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v11, p1

    .line 479
    .line 480
    goto :goto_18

    .line 481
    :cond_1c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_21

    .line 485
    .line 486
    :cond_1d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v4, p1

    .line 490
    .line 491
    goto :goto_16

    .line 492
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    :goto_15
    sget-object v4, La/xoa0;->a:La/xoa0;

    .line 496
    .line 497
    iput-object v9, v1, La/wij;->l:Ljava/lang/Object;

    .line 498
    .line 499
    iput-object v8, v1, La/wij;->m:Ljava/lang/Object;

    .line 500
    .line 501
    iput-byte v5, v1, La/wij;->k:B

    .line 502
    .line 503
    invoke-virtual {v9, v4, v1}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    if-ne v4, v10, :cond_1f

    .line 508
    .line 509
    goto :goto_17

    .line 510
    :cond_1f
    :goto_16
    check-cast v4, La/woa0;

    .line 511
    .line 512
    iget v11, v4, La/woa0;->f:I

    .line 513
    .line 514
    if-ne v11, v5, :cond_20

    .line 515
    .line 516
    goto :goto_15

    .line 517
    :cond_20
    if-ne v11, v2, :cond_22

    .line 518
    .line 519
    sget-object v11, La/xoa0;->c:La/xoa0;

    .line 520
    .line 521
    iput-object v9, v1, La/wij;->l:Ljava/lang/Object;

    .line 522
    .line 523
    iput-object v4, v1, La/wij;->m:Ljava/lang/Object;

    .line 524
    .line 525
    iput-byte v7, v1, La/wij;->k:B

    .line 526
    .line 527
    invoke-virtual {v9, v11, v1}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    if-ne v11, v10, :cond_21

    .line 532
    .line 533
    :goto_17
    move-object v8, v10

    .line 534
    goto/16 :goto_21

    .line 535
    .line 536
    :cond_21
    :goto_18
    check-cast v11, La/woa0;

    .line 537
    .line 538
    iget-object v11, v11, La/woa0;->a:Ljava/util/List;

    .line 539
    .line 540
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    check-cast v11, La/dpa0;

    .line 545
    .line 546
    if-eqz v11, :cond_22

    .line 547
    .line 548
    invoke-virtual {v11}, La/dpa0;->c()Z

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    if-ne v11, v5, :cond_22

    .line 553
    .line 554
    goto/16 :goto_20

    .line 555
    .line 556
    :cond_22
    iget v11, v4, La/woa0;->f:I

    .line 557
    .line 558
    iget-object v12, v4, La/woa0;->a:Ljava/util/List;

    .line 559
    .line 560
    if-ne v11, v7, :cond_23

    .line 561
    .line 562
    move v11, v5

    .line 563
    goto :goto_19

    .line 564
    :cond_23
    move v11, v3

    .line 565
    :goto_19
    if-eqz v11, :cond_2a

    .line 566
    .line 567
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    check-cast v13, La/dpa0;

    .line 572
    .line 573
    if-eqz v13, :cond_2a

    .line 574
    .line 575
    invoke-virtual {v13}, La/dpa0;->c()Z

    .line 576
    .line 577
    .line 578
    move-result v13

    .line 579
    xor-int/2addr v13, v5

    .line 580
    if-ne v13, v5, :cond_2a

    .line 581
    .line 582
    move-object v13, v6

    .line 583
    check-cast v13, La/xij;

    .line 584
    .line 585
    iget-object v13, v13, La/xij;->q:La/ltc;

    .line 586
    .line 587
    if-eqz v13, :cond_29

    .line 588
    .line 589
    instance-of v14, v13, La/jtc;

    .line 590
    .line 591
    if-eqz v14, :cond_26

    .line 592
    .line 593
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 594
    .line 595
    .line 596
    move-result-wide v14

    .line 597
    iget-wide v2, v0, La/mtc;->a:J

    .line 598
    .line 599
    sub-long v2, v14, v2

    .line 600
    .line 601
    check-cast v13, La/jtc;

    .line 602
    .line 603
    sget-object v13, La/ymx;->b:La/ymx;

    .line 604
    .line 605
    const-wide/16 v16, 0x1f4

    .line 606
    .line 607
    cmp-long v2, v2, v16

    .line 608
    .line 609
    if-lez v2, :cond_24

    .line 610
    .line 611
    move-object v2, v0

    .line 612
    goto :goto_1a

    .line 613
    :cond_24
    move-object v2, v8

    .line 614
    :goto_1a
    if-eqz v2, :cond_25

    .line 615
    .line 616
    iput-wide v14, v2, La/mtc;->a:J

    .line 617
    .line 618
    goto :goto_1b

    .line 619
    :cond_25
    move-object v2, v8

    .line 620
    :goto_1b
    if-nez v2, :cond_2a

    .line 621
    .line 622
    move-object v15, v6

    .line 623
    goto :goto_1e

    .line 624
    :cond_26
    instance-of v2, v13, La/ktc;

    .line 625
    .line 626
    if-eqz v2, :cond_29

    .line 627
    .line 628
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 629
    .line 630
    .line 631
    move-result-wide v2

    .line 632
    check-cast v13, La/ktc;

    .line 633
    .line 634
    iget-object v14, v13, La/ktc;->b:La/mtc;

    .line 635
    .line 636
    move-object v15, v6

    .line 637
    iget-wide v5, v14, La/mtc;->a:J

    .line 638
    .line 639
    sub-long v5, v2, v5

    .line 640
    .line 641
    iget-object v13, v13, La/ktc;->a:La/ymx;

    .line 642
    .line 643
    iget-short v13, v13, La/ymx;->a:S

    .line 644
    .line 645
    int-to-long v7, v13

    .line 646
    cmp-long v5, v5, v7

    .line 647
    .line 648
    if-lez v5, :cond_27

    .line 649
    .line 650
    goto :goto_1c

    .line 651
    :cond_27
    const/4 v14, 0x0

    .line 652
    :goto_1c
    if-eqz v14, :cond_28

    .line 653
    .line 654
    iput-wide v2, v14, La/mtc;->a:J

    .line 655
    .line 656
    iput-wide v2, v0, La/mtc;->a:J

    .line 657
    .line 658
    goto :goto_1d

    .line 659
    :cond_28
    const/4 v14, 0x0

    .line 660
    :goto_1d
    if-nez v14, :cond_2b

    .line 661
    .line 662
    :goto_1e
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    check-cast v2, La/dpa0;

    .line 667
    .line 668
    if-eqz v2, :cond_2b

    .line 669
    .line 670
    invoke-virtual {v2}, La/dpa0;->a()V

    .line 671
    .line 672
    .line 673
    goto :goto_1f

    .line 674
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 675
    .line 676
    .line 677
    const/4 v8, 0x0

    .line 678
    goto :goto_21

    .line 679
    :cond_2a
    move-object v15, v6

    .line 680
    :cond_2b
    :goto_1f
    if-nez v11, :cond_2d

    .line 681
    .line 682
    invoke-virtual {v4}, La/woa0;->a()Landroid/view/MotionEvent;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    if-nez v2, :cond_2c

    .line 687
    .line 688
    goto :goto_20

    .line 689
    :cond_2c
    move-object v6, v15

    .line 690
    const/4 v2, 0x3

    .line 691
    const/4 v3, 0x0

    .line 692
    const/4 v5, 0x1

    .line 693
    const/4 v7, 0x2

    .line 694
    const/4 v8, 0x0

    .line 695
    goto/16 :goto_15

    .line 696
    .line 697
    :cond_2d
    :goto_20
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    :goto_21
    return-object v8

    .line 700
    nop

    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
