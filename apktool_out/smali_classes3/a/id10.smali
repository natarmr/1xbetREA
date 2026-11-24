.class public final La/id10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:Ljava/lang/String;

.field public o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public constructor <init>(La/abu;Ljava/util/List;JJLjava/lang/String;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/id10;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/id10;->p:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/id10;->q:Ljava/util/List;

    .line 7
    .line 8
    iput-wide p3, p0, La/id10;->k:J

    .line 9
    .line 10
    iput-wide p5, p0, La/id10;->l:J

    .line 11
    .line 12
    iput-object p7, p0, La/id10;->n:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p8, p0, La/id10;->m:J

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/ywu;JJJLjava/lang/String;Ljava/util/ArrayList;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/id10;->i:B

    .line 21
    iput-object p1, p0, La/id10;->p:Ljava/lang/Object;

    iput-wide p2, p0, La/id10;->k:J

    iput-wide p4, p0, La/id10;->l:J

    iput-wide p6, p0, La/id10;->m:J

    iput-object p8, p0, La/id10;->n:Ljava/lang/String;

    iput-object p9, p0, La/id10;->q:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 14

    .line 1
    iget-byte v0, p0, La/id10;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/id10;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/id10;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/ywu;

    .line 12
    .line 13
    iget-object v0, p0, La/id10;->q:Ljava/util/List;

    .line 14
    .line 15
    move-object v11, v0

    .line 16
    check-cast v11, Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-wide v4, p0, La/id10;->k:J

    .line 19
    .line 20
    iget-wide v6, p0, La/id10;->l:J

    .line 21
    .line 22
    iget-wide v8, p0, La/id10;->m:J

    .line 23
    .line 24
    iget-object v10, p0, La/id10;->n:Ljava/lang/String;

    .line 25
    .line 26
    move-object/from16 v12, p2

    .line 27
    .line 28
    invoke-direct/range {v2 .. v12}, La/id10;-><init>(La/ywu;JJJLjava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_0
    new-instance v3, La/id10;

    .line 33
    .line 34
    move-object v4, v1

    .line 35
    check-cast v4, La/abu;

    .line 36
    .line 37
    iget-object v10, p0, La/id10;->n:Ljava/lang/String;

    .line 38
    .line 39
    iget-wide v11, p0, La/id10;->m:J

    .line 40
    .line 41
    iget-object v5, p0, La/id10;->q:Ljava/util/List;

    .line 42
    .line 43
    iget-wide v6, p0, La/id10;->k:J

    .line 44
    .line 45
    iget-wide v8, p0, La/id10;->l:J

    .line 46
    .line 47
    move-object/from16 v13, p2

    .line 48
    .line 49
    invoke-direct/range {v3 .. v13}, La/id10;-><init>(La/abu;Ljava/util/List;JJLjava/lang/String;JLa/yje;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v3, La/id10;->o:Ljava/lang/Object;

    .line 53
    .line 54
    return-object v3

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/id10;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/we60;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/id10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/id10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/id10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/v1z;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/id10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/id10;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/id10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    iget-byte v0, v14, La/id10;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v2, v14, La/id10;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v0, v2

    .line 15
    check-cast v0, La/ywu;

    .line 16
    .line 17
    iget-object v2, v0, La/ywu;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La/knf0;

    .line 20
    .line 21
    sget-object v5, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v6, v14, La/id10;->j:Z

    .line 24
    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    if-ne v6, v3, :cond_0

    .line 28
    .line 29
    iget-object v0, v14, La/id10;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/ywu;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v18, v0

    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, La/ywu;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, La/fck0;

    .line 52
    .line 53
    iget-object v6, v0, La/ywu;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, La/btt0;

    .line 56
    .line 57
    invoke-virtual {v6}, La/btt0;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    iput-object v0, v14, La/id10;->o:Ljava/lang/Object;

    .line 72
    .line 73
    iput-boolean v3, v14, La/id10;->j:Z

    .line 74
    .line 75
    iget-object v1, v1, La/fck0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/qir0;

    .line 78
    .line 79
    invoke-virtual {v1}, La/qir0;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/bor0;

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    const-string v13, "application/vnd.xenvelop+json"

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    const/16 v3, 0x16

    .line 90
    .line 91
    move-object v8, v4

    .line 92
    move-object v7, v5

    .line 93
    iget-wide v4, v14, La/id10;->k:J

    .line 94
    .line 95
    move-object v10, v0

    .line 96
    move-object v0, v1

    .line 97
    move-object v1, v6

    .line 98
    move-object v9, v7

    .line 99
    iget-wide v6, v14, La/id10;->l:J

    .line 100
    .line 101
    move-object/from16 v17, v8

    .line 102
    .line 103
    move-object/from16 v16, v9

    .line 104
    .line 105
    iget-wide v8, v14, La/id10;->m:J

    .line 106
    .line 107
    move-object/from16 v18, v10

    .line 108
    .line 109
    iget-object v10, v14, La/id10;->n:Ljava/lang/String;

    .line 110
    .line 111
    move-object/from16 v15, v16

    .line 112
    .line 113
    invoke-interface/range {v0 .. v14}, La/bor0;->b(Ljava/lang/String;IIJJJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-ne v0, v15, :cond_2

    .line 118
    .line 119
    move-object v4, v15

    .line 120
    goto :goto_4

    .line 121
    :cond_2
    :goto_0
    check-cast v0, La/dx5;

    .line 122
    .line 123
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, La/sor0;

    .line 128
    .line 129
    iget-object v0, v0, La/sor0;->a:Ljava/util/List;

    .line 130
    .line 131
    iget-object v1, v14, La/id10;->q:Ljava/util/List;

    .line 132
    .line 133
    check-cast v1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-nez v2, :cond_5

    .line 145
    .line 146
    new-instance v2, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_4

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    move-object v4, v3

    .line 166
    check-cast v4, La/lor0;

    .line 167
    .line 168
    iget-object v4, v4, La/lor0;->k:Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_3

    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_4
    move-object v0, v2

    .line 181
    :cond_5
    if-eqz v0, :cond_7

    .line 182
    .line 183
    new-instance v1, Ljava/util/ArrayList;

    .line 184
    .line 185
    const/16 v4, 0xa

    .line 186
    .line 187
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_6

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, La/lor0;

    .line 209
    .line 210
    invoke-static {v2}, La/n8n0;->n(La/lor0;)La/for0;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_6
    move-object v4, v1

    .line 219
    goto :goto_3

    .line 220
    :cond_7
    const/4 v4, 0x0

    .line 221
    :goto_3
    if-nez v4, :cond_8

    .line 222
    .line 223
    sget-object v4, La/iun;->a:La/iun;

    .line 224
    .line 225
    :cond_8
    :goto_4
    return-object v4

    .line 226
    :pswitch_0
    const/16 v4, 0xa

    .line 227
    .line 228
    iget-object v0, v14, La/id10;->o:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, La/v1z;

    .line 231
    .line 232
    sget-object v5, La/wne;->a:La/wne;

    .line 233
    .line 234
    iget-boolean v6, v14, La/id10;->j:Z

    .line 235
    .line 236
    const-wide/16 v19, 0x0

    .line 237
    .line 238
    if-eqz v6, :cond_a

    .line 239
    .line 240
    if-ne v6, v3, :cond_9

    .line 241
    .line 242
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v1, p1

    .line 246
    .line 247
    goto/16 :goto_8

    .line 248
    .line 249
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    goto/16 :goto_15

    .line 254
    .line 255
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    check-cast v2, La/abu;

    .line 259
    .line 260
    iget-object v1, v2, La/abu;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, La/ieu;

    .line 263
    .line 264
    iget-object v2, v2, La/abu;->c:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v2, La/btt0;

    .line 267
    .line 268
    invoke-virtual {v2}, La/btt0;->a()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iget-object v0, v0, La/v1z;->a:Ljava/lang/Long;

    .line 273
    .line 274
    if-eqz v0, :cond_b

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 277
    .line 278
    .line 279
    move-result-wide v6

    .line 280
    goto :goto_5

    .line 281
    :cond_b
    move-wide/from16 v6, v19

    .line 282
    .line 283
    :goto_5
    iget-object v8, v14, La/id10;->q:Ljava/util/List;

    .line 284
    .line 285
    if-eqz v8, :cond_c

    .line 286
    .line 287
    const/4 v12, 0x0

    .line 288
    const/16 v13, 0x3e

    .line 289
    .line 290
    const-string v9, ","

    .line 291
    .line 292
    const/4 v10, 0x0

    .line 293
    const/4 v11, 0x0

    .line 294
    invoke-static/range {v8 .. v13}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :goto_6
    const/4 v8, 0x0

    .line 299
    goto :goto_7

    .line 300
    :cond_c
    const/4 v0, 0x0

    .line 301
    goto :goto_6

    .line 302
    :goto_7
    iput-object v8, v14, La/id10;->o:Ljava/lang/Object;

    .line 303
    .line 304
    iput-boolean v3, v14, La/id10;->j:Z

    .line 305
    .line 306
    iget-object v1, v1, La/ieu;->c:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, La/rx00;

    .line 309
    .line 310
    invoke-virtual {v1}, La/rx00;->invoke()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, La/ic10;

    .line 315
    .line 316
    const-string v11, "all"

    .line 317
    .line 318
    const-string v12, "all"

    .line 319
    .line 320
    move v9, v3

    .line 321
    move/from16 v16, v4

    .line 322
    .line 323
    move-object v10, v5

    .line 324
    move-wide v5, v6

    .line 325
    move-object/from16 v17, v8

    .line 326
    .line 327
    iget-wide v7, v14, La/id10;->k:J

    .line 328
    .line 329
    move v15, v9

    .line 330
    move-object v13, v10

    .line 331
    iget-wide v9, v14, La/id10;->l:J

    .line 332
    .line 333
    move-object/from16 v18, v13

    .line 334
    .line 335
    iget-object v13, v14, La/id10;->n:Ljava/lang/String;

    .line 336
    .line 337
    iget-wide v3, v14, La/id10;->m:J

    .line 338
    .line 339
    move-wide v15, v3

    .line 340
    move-object/from16 v17, v14

    .line 341
    .line 342
    const/16 v3, 0x269

    .line 343
    .line 344
    const/16 v4, 0xf

    .line 345
    .line 346
    move-object v14, v0

    .line 347
    move-object/from16 v0, v18

    .line 348
    .line 349
    invoke-interface/range {v1 .. v17}, La/ic10;->a(Ljava/lang/String;IIJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/yje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    if-ne v1, v0, :cond_d

    .line 354
    .line 355
    move-object v4, v0

    .line 356
    goto/16 :goto_15

    .line 357
    .line 358
    :cond_d
    :goto_8
    check-cast v1, La/qc10;

    .line 359
    .line 360
    iget-object v0, v1, La/qc10;->b:Ljava/lang/String;

    .line 361
    .line 362
    iget-object v2, v1, La/qc10;->a:Ljava/util/List;

    .line 363
    .line 364
    if-eqz v0, :cond_e

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-gtz v3, :cond_f

    .line 371
    .line 372
    :cond_e
    const/4 v8, 0x0

    .line 373
    goto :goto_9

    .line 374
    :cond_f
    new-instance v2, La/zhi0;

    .line 375
    .line 376
    iget-object v1, v1, La/qc10;->c:La/kuw;

    .line 377
    .line 378
    const/16 v3, 0xc

    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    invoke-direct {v2, v0, v1, v8, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 382
    .line 383
    .line 384
    throw v2

    .line 385
    :goto_9
    if-nez v2, :cond_10

    .line 386
    .line 387
    sget-object v2, La/iun;->a:La/iun;

    .line 388
    .line 389
    :cond_10
    new-instance v4, Ljava/util/ArrayList;

    .line 390
    .line 391
    const/16 v0, 0xa

    .line 392
    .line 393
    invoke-static {v2, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_1b

    .line 409
    .line 410
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    check-cast v1, La/mc10;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v2, v1, La/mc10;->a:Ljava/lang/Long;

    .line 420
    .line 421
    if-eqz v2, :cond_11

    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 424
    .line 425
    .line 426
    move-result-wide v2

    .line 427
    move-wide v14, v2

    .line 428
    goto :goto_b

    .line 429
    :cond_11
    move-wide/from16 v14, v19

    .line 430
    .line 431
    :goto_b
    iget-object v2, v1, La/mc10;->c:Ljava/lang/String;

    .line 432
    .line 433
    const-string v3, ""

    .line 434
    .line 435
    if-nez v2, :cond_12

    .line 436
    .line 437
    move-object v10, v3

    .line 438
    goto :goto_c

    .line 439
    :cond_12
    move-object v10, v2

    .line 440
    :goto_c
    iget-object v2, v1, La/mc10;->e:Ljava/lang/String;

    .line 441
    .line 442
    if-nez v2, :cond_13

    .line 443
    .line 444
    move-object v11, v3

    .line 445
    goto :goto_d

    .line 446
    :cond_13
    move-object v11, v2

    .line 447
    :goto_d
    iget-object v2, v1, La/mc10;->h:Ljava/lang/Integer;

    .line 448
    .line 449
    if-nez v2, :cond_14

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :cond_14
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-nez v3, :cond_15

    .line 457
    .line 458
    sget-object v2, La/rc10;->a:La/rc10;

    .line 459
    .line 460
    move-object v12, v2

    .line 461
    const/4 v5, 0x1

    .line 462
    goto :goto_11

    .line 463
    :cond_15
    :goto_e
    if-nez v2, :cond_16

    .line 464
    .line 465
    const/4 v5, 0x1

    .line 466
    goto :goto_10

    .line 467
    :cond_16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    const/4 v5, 0x1

    .line 472
    if-ne v3, v5, :cond_17

    .line 473
    .line 474
    sget-object v2, La/rc10;->b:La/rc10;

    .line 475
    .line 476
    :goto_f
    move-object v12, v2

    .line 477
    goto :goto_11

    .line 478
    :cond_17
    :goto_10
    if-eqz v2, :cond_1a

    .line 479
    .line 480
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    const/4 v3, 0x2

    .line 485
    if-ne v2, v3, :cond_1a

    .line 486
    .line 487
    sget-object v2, La/rc10;->c:La/rc10;

    .line 488
    .line 489
    goto :goto_f

    .line 490
    :goto_11
    iget-object v2, v1, La/mc10;->i:Ljava/lang/Long;

    .line 491
    .line 492
    if-eqz v2, :cond_19

    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 495
    .line 496
    .line 497
    move-result-wide v2

    .line 498
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v13

    .line 502
    sget-object v2, La/q4f;->a:La/nwd;

    .line 503
    .line 504
    iget-object v1, v1, La/mc10;->b:Ljava/lang/Double;

    .line 505
    .line 506
    if-eqz v1, :cond_18

    .line 507
    .line 508
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 509
    .line 510
    .line 511
    move-result-wide v1

    .line 512
    :goto_12
    move-wide/from16 v16, v1

    .line 513
    .line 514
    goto :goto_13

    .line 515
    :cond_18
    const-wide/16 v1, 0x0

    .line 516
    .line 517
    goto :goto_12

    .line 518
    :goto_13
    new-instance v9, La/nc10;

    .line 519
    .line 520
    invoke-direct/range {v9 .. v17}, La/nc10;-><init>(Ljava/lang/String;Ljava/lang/String;La/rc10;Ljava/lang/String;JD)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_19
    invoke-static {v8}, La/jf4;->k(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :goto_14
    move-object v4, v8

    .line 531
    goto :goto_15

    .line 532
    :cond_1a
    invoke-static {v8}, La/jf4;->k(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    goto :goto_14

    .line 536
    :cond_1b
    :goto_15
    return-object v4

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
