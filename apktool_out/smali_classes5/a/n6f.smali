.class public final La/n6f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/eiz;JILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/n6f;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/n6f;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/n6f;->k:J

    .line 7
    .line 8
    iput p4, p0, La/n6f;->l:I

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IJLa/yje;B)V
    .locals 0

    .line 15
    iput-byte p6, p0, La/n6f;->i:B

    iput-object p1, p0, La/n6f;->m:Ljava/lang/Object;

    iput p2, p0, La/n6f;->l:I

    iput-wide p3, p0, La/n6f;->k:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/n6f;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/n6f;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/n6f;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/oue0;

    .line 12
    .line 13
    iget-wide v4, p0, La/n6f;->k:J

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    iget v3, p0, La/n6f;->l:I

    .line 17
    .line 18
    move-object v6, p2

    .line 19
    invoke-direct/range {v1 .. v7}, La/n6f;-><init>(Ljava/lang/Object;IJLa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v7, p2

    .line 24
    new-instance v2, La/n6f;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, La/eiz;

    .line 28
    .line 29
    iget-wide v4, p0, La/n6f;->k:J

    .line 30
    .line 31
    iget v6, p0, La/n6f;->l:I

    .line 32
    .line 33
    invoke-direct/range {v2 .. v7}, La/n6f;-><init>(La/eiz;JILa/yje;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :pswitch_1
    move-object v7, p2

    .line 38
    new-instance v2, La/n6f;

    .line 39
    .line 40
    move-object v3, v0

    .line 41
    check-cast v3, La/r7f;

    .line 42
    .line 43
    iget-wide v5, p0, La/n6f;->k:J

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    iget v4, p0, La/n6f;->l:I

    .line 47
    .line 48
    invoke-direct/range {v2 .. v8}, La/n6f;-><init>(Ljava/lang/Object;IJLa/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n6f;->i:B

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
    invoke-virtual {p0, p1, p2}, La/n6f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/n6f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/n6f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/n6f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/n6f;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/n6f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/n6f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/n6f;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/n6f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/n6f;->i:B

    .line 4
    .line 5
    iget-wide v7, v6, La/n6f;->k:J

    .line 6
    .line 7
    iget v9, v6, La/n6f;->l:I

    .line 8
    .line 9
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iget-object v3, v6, La/n6f;->m:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v11, v3

    .line 19
    check-cast v11, La/oue0;

    .line 20
    .line 21
    iget-object v0, v11, La/oue0;->c:La/knf0;

    .line 22
    .line 23
    sget-object v12, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v3, v6, La/n6f;->j:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-ne v3, v2, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object/from16 v0, p1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v11, La/oue0;->a:La/wsf0;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    iput-boolean v2, v6, La/n6f;->j:Z

    .line 55
    .line 56
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/zm;

    .line 59
    .line 60
    invoke-virtual {v0}, La/zm;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/di8;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    iget v2, v6, La/n6f;->l:I

    .line 68
    .line 69
    iget-wide v3, v6, La/n6f;->k:J

    .line 70
    .line 71
    invoke-interface/range {v0 .. v6}, La/di8;->a(IIJLjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-ne v0, v12, :cond_2

    .line 76
    .line 77
    move-object v10, v12

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_0
    check-cast v0, La/q16;

    .line 80
    .line 81
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/Iterable;

    .line 86
    .line 87
    new-instance v1, Ljava/util/ArrayList;

    .line 88
    .line 89
    const/16 v2, 0xa

    .line 90
    .line 91
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_7

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, La/eg8;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v3, Lorg/xplatform/registration/api/domain/models/BonusInfoModel;

    .line 118
    .line 119
    iget-object v4, v2, La/eg8;->a:Ljava/lang/Integer;

    .line 120
    .line 121
    if-eqz v4, :cond_6

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    iget-object v5, v2, La/eg8;->b:Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    iget-object v6, v2, La/eg8;->c:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v6, :cond_3

    .line 134
    .line 135
    const-string v6, ""

    .line 136
    .line 137
    :cond_3
    iget-object v2, v2, La/eg8;->d:Ljava/lang/Boolean;

    .line 138
    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    const/4 v2, 0x0

    .line 147
    :goto_2
    invoke-direct {v3, v4, v5, v6, v2}, Lorg/xplatform/registration/api/domain/models/BonusInfoModel;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    invoke-static {v10}, La/jf4;->k(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    invoke-static {v10}, La/jf4;->k(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    iget-object v0, v11, La/oue0;->b:La/zj8;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v2, La/be8;

    .line 168
    .line 169
    invoke-direct {v2, v9, v7, v8, v1}, La/be8;-><init>(IJLjava/util/ArrayList;)V

    .line 170
    .line 171
    .line 172
    iput-object v2, v0, La/zj8;->a:La/be8;

    .line 173
    .line 174
    move-object v10, v1

    .line 175
    :goto_3
    return-object v10

    .line 176
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget-boolean v4, v6, La/n6f;->j:Z

    .line 179
    .line 180
    if-eqz v4, :cond_9

    .line 181
    .line 182
    if-ne v4, v2, :cond_8

    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v0, p1

    .line 188
    .line 189
    check-cast v0, La/j0g0;

    .line 190
    .line 191
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    check-cast v3, La/eiz;

    .line 202
    .line 203
    iget-object v1, v3, La/eiz;->t:La/cmt;

    .line 204
    .line 205
    iput-boolean v2, v6, La/n6f;->j:Z

    .line 206
    .line 207
    invoke-virtual {v1, v9, v7, v8, v6}, La/cmt;->h(IJLa/zje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-ne v1, v0, :cond_a

    .line 212
    .line 213
    move-object v10, v0

    .line 214
    goto :goto_5

    .line 215
    :cond_a
    move-object v0, v1

    .line 216
    :goto_4
    new-instance v10, La/j0g0;

    .line 217
    .line 218
    invoke-direct {v10, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :goto_5
    return-object v10

    .line 222
    :pswitch_1
    check-cast v3, La/r7f;

    .line 223
    .line 224
    sget-object v0, La/wne;->a:La/wne;

    .line 225
    .line 226
    iget-boolean v4, v6, La/n6f;->j:Z

    .line 227
    .line 228
    if-eqz v4, :cond_c

    .line 229
    .line 230
    if-ne v4, v2, :cond_b

    .line 231
    .line 232
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v1, p1

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_b
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_8

    .line 242
    .line 243
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iget-object v1, v3, La/r7f;->I:La/lhf0;

    .line 247
    .line 248
    iput-boolean v2, v6, La/n6f;->j:Z

    .line 249
    .line 250
    invoke-virtual {v1, v9, v6}, La/lhf0;->v(ILa/zje;)Ljava/lang/Enum;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-ne v1, v0, :cond_d

    .line 255
    .line 256
    move-object v10, v0

    .line 257
    goto :goto_8

    .line 258
    :cond_d
    :goto_6
    check-cast v1, La/u4k;

    .line 259
    .line 260
    iget-object v0, v3, La/r7f;->d2:La/ol60;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_11

    .line 267
    .line 268
    if-eq v1, v2, :cond_10

    .line 269
    .line 270
    const/4 v2, 0x2

    .line 271
    if-eq v1, v2, :cond_f

    .line 272
    .line 273
    const/4 v2, 0x3

    .line 274
    if-ne v1, v2, :cond_e

    .line 275
    .line 276
    new-instance v3, La/o3f;

    .line 277
    .line 278
    const v5, 0x7f130162

    .line 279
    .line 280
    .line 281
    const v1, 0x7f130511

    .line 282
    .line 283
    .line 284
    iget v4, v6, La/n6f;->l:I

    .line 285
    .line 286
    iget-wide v7, v6, La/n6f;->k:J

    .line 287
    .line 288
    const/4 v9, 0x1

    .line 289
    move v6, v1

    .line 290
    invoke-direct/range {v3 .. v9}, La/o3f;-><init>(IIIJZ)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_f
    new-instance v4, La/o3f;

    .line 299
    .line 300
    const v1, 0x7f130162

    .line 301
    .line 302
    .line 303
    const v7, 0x7f130539

    .line 304
    .line 305
    .line 306
    iget v5, v6, La/n6f;->l:I

    .line 307
    .line 308
    iget-wide v8, v6, La/n6f;->k:J

    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    move v6, v1

    .line 312
    invoke-direct/range {v4 .. v10}, La/o3f;-><init>(IIIJZ)V

    .line 313
    .line 314
    .line 315
    move-object v3, v4

    .line 316
    goto :goto_7

    .line 317
    :cond_10
    new-instance v3, La/u3f;

    .line 318
    .line 319
    invoke-direct {v3, v9, v7, v8, v2}, La/u3f;-><init>(IJZ)V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_11
    new-instance v10, La/o3f;

    .line 324
    .line 325
    const v12, 0x7f131153

    .line 326
    .line 327
    .line 328
    const v13, 0x7f130514

    .line 329
    .line 330
    .line 331
    iget v11, v6, La/n6f;->l:I

    .line 332
    .line 333
    iget-wide v14, v6, La/n6f;->k:J

    .line 334
    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    invoke-direct/range {v10 .. v16}, La/o3f;-><init>(IIIJZ)V

    .line 338
    .line 339
    .line 340
    move-object v3, v10

    .line 341
    :goto_7
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_8
    return-object v10

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
