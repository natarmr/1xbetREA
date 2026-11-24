.class public final La/vl00;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pmi;

.field public final b:La/uqe;


# direct methods
.method public constructor <init>(La/pmi;La/uqe;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vl00;->a:La/pmi;

    .line 5
    .line 6
    iput-object p2, p0, La/vl00;->b:La/uqe;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 14

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, La/wp20;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    move-object v3, v1

    .line 36
    check-cast v3, La/cm90;

    .line 37
    .line 38
    iget v3, v3, La/cm90;->a:I

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/tkt;

    .line 72
    .line 73
    iget v1, v0, La/tkt;->a:I

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/cm90;

    .line 84
    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    sget-object v1, La/cm90;->Companion:La/am90;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, La/am90;->a()La/cm90;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :cond_2
    new-instance v3, La/yqe;

    .line 97
    .line 98
    iget v4, v0, La/tkt;->a:I

    .line 99
    .line 100
    iget-object v5, v0, La/tkt;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget v6, v0, La/tkt;->c:I

    .line 103
    .line 104
    iget-object v7, v0, La/tkt;->d:Ljava/lang/String;

    .line 105
    .line 106
    iget-wide v8, v0, La/tkt;->e:J

    .line 107
    .line 108
    iget-object v10, v0, La/tkt;->f:Ljava/lang/String;

    .line 109
    .line 110
    iget v11, v1, La/cm90;->b:I

    .line 111
    .line 112
    iget v12, v1, La/cm90;->c:I

    .line 113
    .line 114
    iget-object v13, v1, La/cm90;->d:Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct/range {v3 .. v13}, La/yqe;-><init>(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;IILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    return-object p1
.end method


# virtual methods
.method public final b(ZLa/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, La/vl00;->b:La/uqe;

    .line 6
    .line 7
    iget-object v3, v2, La/uqe;->e:La/mne;

    .line 8
    .line 9
    instance-of v4, v0, La/sl00;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, La/sl00;

    .line 15
    .line 16
    iget v5, v4, La/sl00;->r:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/sl00;->r:I

    .line 26
    .line 27
    :goto_0
    move-object v11, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v4, La/sl00;

    .line 30
    .line 31
    invoke-direct {v4, v1, v0}, La/sl00;-><init>(La/vl00;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v11, La/sl00;->p:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v4, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v5, v11, La/sl00;->r:I

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v14, 0x1

    .line 44
    const/4 v15, 0x0

    .line 45
    packed-switch v5, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v15

    .line 54
    :pswitch_0
    iget-object v1, v11, La/sl00;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/util/List;

    .line 57
    .line 58
    iget-object v1, v11, La/sl00;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_1d

    .line 66
    .line 67
    :pswitch_1
    iget-boolean v1, v11, La/sl00;->j:Z

    .line 68
    .line 69
    iget-boolean v5, v11, La/sl00;->i:Z

    .line 70
    .line 71
    iget-object v6, v11, La/sl00;->m:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, La/vl00;

    .line 74
    .line 75
    iget-object v7, v11, La/sl00;->l:Ljava/util/List;

    .line 76
    .line 77
    iget-object v8, v11, La/sl00;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v8, Ljava/util/List;

    .line 80
    .line 81
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move v14, v1

    .line 85
    move-object v1, v6

    .line 86
    goto/16 :goto_1a

    .line 87
    .line 88
    :pswitch_2
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 89
    .line 90
    iget-boolean v6, v11, La/sl00;->i:Z

    .line 91
    .line 92
    iget-object v7, v11, La/sl00;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v7, Ljava/util/List;

    .line 95
    .line 96
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    check-cast v0, La/j0g0;

    .line 100
    .line 101
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    move v14, v5

    .line 104
    move v5, v6

    .line 105
    goto/16 :goto_19

    .line 106
    .line 107
    :pswitch_3
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 108
    .line 109
    iget-boolean v6, v11, La/sl00;->i:Z

    .line 110
    .line 111
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    check-cast v0, La/j0g0;

    .line 115
    .line 116
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 117
    .line 118
    move v14, v5

    .line 119
    move v13, v6

    .line 120
    goto/16 :goto_18

    .line 121
    .line 122
    :pswitch_4
    iget-object v1, v11, La/sl00;->l:Ljava/util/List;

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Throwable;

    .line 125
    .line 126
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_17

    .line 130
    .line 131
    :pswitch_5
    iget-boolean v1, v11, La/sl00;->j:Z

    .line 132
    .line 133
    iget-boolean v5, v11, La/sl00;->i:Z

    .line 134
    .line 135
    iget-object v6, v11, La/sl00;->m:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v6, La/vl00;

    .line 138
    .line 139
    iget-object v6, v11, La/sl00;->l:Ljava/util/List;

    .line 140
    .line 141
    check-cast v6, Ljava/lang/Throwable;

    .line 142
    .line 143
    iget-object v6, v11, La/sl00;->k:Ljava/lang/Object;

    .line 144
    .line 145
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    goto/16 :goto_13

    .line 149
    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto/16 :goto_14

    .line 152
    .line 153
    :pswitch_6
    iget-boolean v1, v11, La/sl00;->j:Z

    .line 154
    .line 155
    iget-boolean v5, v11, La/sl00;->i:Z

    .line 156
    .line 157
    iget-object v6, v11, La/sl00;->n:Ljava/util/List;

    .line 158
    .line 159
    check-cast v6, Ljava/lang/Throwable;

    .line 160
    .line 161
    iget-object v6, v11, La/sl00;->k:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_11

    .line 167
    .line 168
    :pswitch_7
    iget-boolean v1, v11, La/sl00;->j:Z

    .line 169
    .line 170
    iget-boolean v5, v11, La/sl00;->i:Z

    .line 171
    .line 172
    iget-object v7, v11, La/sl00;->o:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v7, La/uqe;

    .line 175
    .line 176
    iget-object v9, v11, La/sl00;->n:Ljava/util/List;

    .line 177
    .line 178
    check-cast v9, Ljava/lang/Throwable;

    .line 179
    .line 180
    iget-object v9, v11, La/sl00;->m:Ljava/lang/Object;

    .line 181
    .line 182
    iget-object v10, v11, La/sl00;->k:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object v6, v10

    .line 188
    goto/16 :goto_f

    .line 189
    .line 190
    :pswitch_8
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 191
    .line 192
    iget-boolean v7, v11, La/sl00;->i:Z

    .line 193
    .line 194
    iget-object v9, v11, La/sl00;->o:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v9, Ljava/util/List;

    .line 197
    .line 198
    iget-object v9, v11, La/sl00;->m:Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v10, v11, La/sl00;->l:Ljava/util/List;

    .line 201
    .line 202
    iget-object v12, v11, La/sl00;->k:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_d

    .line 208
    .line 209
    :pswitch_9
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 210
    .line 211
    iget-boolean v7, v11, La/sl00;->i:Z

    .line 212
    .line 213
    iget-object v9, v11, La/sl00;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v9, La/vl00;

    .line 216
    .line 217
    iget-object v10, v11, La/sl00;->n:Ljava/util/List;

    .line 218
    .line 219
    iget-object v12, v11, La/sl00;->m:Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v6, v11, La/sl00;->l:Ljava/util/List;

    .line 222
    .line 223
    iget-object v13, v11, La/sl00;->k:Ljava/lang/Object;

    .line 224
    .line 225
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :pswitch_a
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 231
    .line 232
    iget-boolean v6, v11, La/sl00;->i:Z

    .line 233
    .line 234
    iget-object v7, v11, La/sl00;->m:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v7, La/vl00;

    .line 237
    .line 238
    iget-object v7, v11, La/sl00;->l:Ljava/util/List;

    .line 239
    .line 240
    iget-object v9, v11, La/sl00;->k:Ljava/lang/Object;

    .line 241
    .line 242
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 243
    .line 244
    .line 245
    goto/16 :goto_7

    .line 246
    .line 247
    :catchall_1
    move-exception v0

    .line 248
    goto/16 :goto_9

    .line 249
    .line 250
    :pswitch_b
    iget-boolean v5, v11, La/sl00;->j:Z

    .line 251
    .line 252
    iget-boolean v6, v11, La/sl00;->i:Z

    .line 253
    .line 254
    iget-object v9, v11, La/sl00;->k:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v9, La/vl00;

    .line 257
    .line 258
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :catchall_2
    move-exception v0

    .line 263
    goto :goto_5

    .line 264
    :pswitch_c
    iget-boolean v5, v11, La/sl00;->i:Z

    .line 265
    .line 266
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move v13, v5

    .line 270
    goto :goto_2

    .line 271
    :pswitch_d
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    move/from16 v0, p1

    .line 275
    .line 276
    iput-boolean v0, v11, La/sl00;->i:Z

    .line 277
    .line 278
    iput v14, v11, La/sl00;->r:I

    .line 279
    .line 280
    iget-object v5, v3, La/mne;->b:La/dvj;

    .line 281
    .line 282
    new-instance v6, La/pqe;

    .line 283
    .line 284
    invoke-direct {v6, v2, v15, v7}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v5, v6, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    if-ne v5, v4, :cond_1

    .line 292
    .line 293
    goto/16 :goto_1c

    .line 294
    .line 295
    :cond_1
    move v13, v0

    .line 296
    move-object v0, v5

    .line 297
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_10

    .line 304
    .line 305
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 306
    .line 307
    iget-object v0, v1, La/vl00;->a:La/pmi;

    .line 308
    .line 309
    iput-object v15, v11, La/sl00;->k:Ljava/lang/Object;

    .line 310
    .line 311
    iput-boolean v13, v11, La/sl00;->i:Z

    .line 312
    .line 313
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 314
    .line 315
    iput v8, v11, La/sl00;->r:I

    .line 316
    .line 317
    iget-object v6, v0, La/pmi;->e:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v6, La/mne;

    .line 320
    .line 321
    iget-object v6, v6, La/mne;->b:La/dvj;

    .line 322
    .line 323
    new-instance v9, La/wlk;

    .line 324
    .line 325
    invoke-direct {v9, v0, v15, v14}, La/wlk;-><init>(La/pmi;La/yje;B)V

    .line 326
    .line 327
    .line 328
    invoke-static {v6, v9, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 332
    if-ne v0, v4, :cond_2

    .line 333
    .line 334
    goto/16 :goto_1c

    .line 335
    .line 336
    :cond_2
    move v6, v13

    .line 337
    :goto_3
    :try_start_4
    check-cast v0, Ljava/util/List;

    .line 338
    .line 339
    sget-object v9, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 340
    .line 341
    move-object v9, v0

    .line 342
    goto :goto_6

    .line 343
    :goto_4
    move v6, v13

    .line 344
    goto :goto_5

    .line 345
    :catchall_3
    move-exception v0

    .line 346
    goto :goto_4

    .line 347
    :goto_5
    sget-object v9, La/j0g0;->b:La/e0g0;

    .line 348
    .line 349
    new-instance v9, La/g0g0;

    .line 350
    .line 351
    invoke-direct {v9, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    :goto_6
    instance-of v0, v9, La/g0g0;

    .line 355
    .line 356
    if-nez v0, :cond_c

    .line 357
    .line 358
    move-object v10, v9

    .line 359
    check-cast v10, Ljava/util/List;

    .line 360
    .line 361
    :try_start_5
    iput-object v9, v11, La/sl00;->k:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v10, v11, La/sl00;->l:Ljava/util/List;

    .line 364
    .line 365
    iput-object v15, v11, La/sl00;->m:Ljava/lang/Object;

    .line 366
    .line 367
    iput-boolean v6, v11, La/sl00;->i:Z

    .line 368
    .line 369
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 370
    .line 371
    iput v7, v11, La/sl00;->r:I

    .line 372
    .line 373
    iget-object v0, v3, La/mne;->b:La/dvj;

    .line 374
    .line 375
    new-instance v7, La/pqe;

    .line 376
    .line 377
    invoke-direct {v7, v2, v15, v8}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 378
    .line 379
    .line 380
    invoke-static {v0, v7, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 384
    if-ne v0, v4, :cond_3

    .line 385
    .line 386
    goto/16 :goto_1c

    .line 387
    .line 388
    :cond_3
    move-object v7, v10

    .line 389
    :goto_7
    :try_start_6
    check-cast v0, Ljava/util/List;

    .line 390
    .line 391
    sget-object v10, La/j0g0;->b:La/e0g0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 392
    .line 393
    goto :goto_a

    .line 394
    :goto_8
    move-object v7, v10

    .line 395
    goto :goto_9

    .line 396
    :catchall_4
    move-exception v0

    .line 397
    goto :goto_8

    .line 398
    :goto_9
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 399
    .line 400
    new-instance v10, La/g0g0;

    .line 401
    .line 402
    invoke-direct {v10, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 403
    .line 404
    .line 405
    move-object v0, v10

    .line 406
    :goto_a
    nop

    .line 407
    instance-of v10, v0, La/g0g0;

    .line 408
    .line 409
    if-nez v10, :cond_7

    .line 410
    .line 411
    move-object v10, v0

    .line 412
    check-cast v10, Ljava/util/List;

    .line 413
    .line 414
    iput-object v9, v11, La/sl00;->k:Ljava/lang/Object;

    .line 415
    .line 416
    iput-object v7, v11, La/sl00;->l:Ljava/util/List;

    .line 417
    .line 418
    iput-object v0, v11, La/sl00;->m:Ljava/lang/Object;

    .line 419
    .line 420
    iput-object v10, v11, La/sl00;->n:Ljava/util/List;

    .line 421
    .line 422
    iput-object v1, v11, La/sl00;->o:Ljava/lang/Object;

    .line 423
    .line 424
    iput-boolean v6, v11, La/sl00;->i:Z

    .line 425
    .line 426
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 427
    .line 428
    const/4 v12, 0x4

    .line 429
    iput v12, v11, La/sl00;->r:I

    .line 430
    .line 431
    invoke-virtual {v1, v11, v7, v6}, La/vl00;->c(La/zje;Ljava/util/List;Z)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    if-ne v12, v4, :cond_4

    .line 436
    .line 437
    goto/16 :goto_1c

    .line 438
    .line 439
    :cond_4
    move-object v13, v12

    .line 440
    move-object v12, v0

    .line 441
    move-object v0, v13

    .line 442
    move-object v13, v7

    .line 443
    move v7, v6

    .line 444
    move-object v6, v13

    .line 445
    move-object v13, v9

    .line 446
    move-object v9, v1

    .line 447
    :goto_b
    check-cast v0, Ljava/util/List;

    .line 448
    .line 449
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v0, v10}, La/vl00;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    iput-object v13, v11, La/sl00;->k:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v6, v11, La/sl00;->l:Ljava/util/List;

    .line 459
    .line 460
    iput-object v12, v11, La/sl00;->m:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v15, v11, La/sl00;->n:Ljava/util/List;

    .line 463
    .line 464
    iput-object v15, v11, La/sl00;->o:Ljava/lang/Object;

    .line 465
    .line 466
    iput-boolean v7, v11, La/sl00;->i:Z

    .line 467
    .line 468
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 469
    .line 470
    const/4 v9, 0x5

    .line 471
    iput v9, v11, La/sl00;->r:I

    .line 472
    .line 473
    iget-object v9, v3, La/mne;->b:La/dvj;

    .line 474
    .line 475
    new-instance v10, La/jtb;

    .line 476
    .line 477
    const/16 v14, 0x1a

    .line 478
    .line 479
    invoke-direct {v10, v2, v0, v15, v14}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 480
    .line 481
    .line 482
    invoke-static {v9, v10, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sget-object v9, La/wne;->a:La/wne;

    .line 487
    .line 488
    if-ne v0, v9, :cond_5

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    :goto_c
    if-ne v0, v4, :cond_6

    .line 494
    .line 495
    goto/16 :goto_1c

    .line 496
    .line 497
    :cond_6
    move-object v10, v6

    .line 498
    move-object v9, v12

    .line 499
    move-object v12, v13

    .line 500
    :goto_d
    move v6, v7

    .line 501
    move-object v7, v10

    .line 502
    goto :goto_e

    .line 503
    :cond_7
    move-object v12, v9

    .line 504
    move-object v9, v0

    .line 505
    :goto_e
    invoke-static {v9}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    if-eqz v0, :cond_b

    .line 510
    .line 511
    iput-object v12, v11, La/sl00;->k:Ljava/lang/Object;

    .line 512
    .line 513
    iput-object v15, v11, La/sl00;->l:Ljava/util/List;

    .line 514
    .line 515
    iput-object v9, v11, La/sl00;->m:Ljava/lang/Object;

    .line 516
    .line 517
    iput-object v15, v11, La/sl00;->n:Ljava/util/List;

    .line 518
    .line 519
    iput-object v2, v11, La/sl00;->o:Ljava/lang/Object;

    .line 520
    .line 521
    iput-boolean v6, v11, La/sl00;->i:Z

    .line 522
    .line 523
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 524
    .line 525
    const/4 v0, 0x6

    .line 526
    iput v0, v11, La/sl00;->r:I

    .line 527
    .line 528
    invoke-virtual {v1, v11, v7, v6}, La/vl00;->c(La/zje;Ljava/util/List;Z)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    if-ne v0, v4, :cond_8

    .line 533
    .line 534
    goto/16 :goto_1c

    .line 535
    .line 536
    :cond_8
    move-object v7, v2

    .line 537
    move v1, v5

    .line 538
    move v5, v6

    .line 539
    move-object v6, v12

    .line 540
    :goto_f
    check-cast v0, Ljava/util/List;

    .line 541
    .line 542
    iput-object v6, v11, La/sl00;->k:Ljava/lang/Object;

    .line 543
    .line 544
    iput-object v15, v11, La/sl00;->l:Ljava/util/List;

    .line 545
    .line 546
    iput-object v9, v11, La/sl00;->m:Ljava/lang/Object;

    .line 547
    .line 548
    iput-object v15, v11, La/sl00;->n:Ljava/util/List;

    .line 549
    .line 550
    iput-object v15, v11, La/sl00;->o:Ljava/lang/Object;

    .line 551
    .line 552
    iput-boolean v5, v11, La/sl00;->i:Z

    .line 553
    .line 554
    iput-boolean v1, v11, La/sl00;->j:Z

    .line 555
    .line 556
    const/4 v9, 0x7

    .line 557
    iput v9, v11, La/sl00;->r:I

    .line 558
    .line 559
    iget-object v9, v7, La/uqe;->e:La/mne;

    .line 560
    .line 561
    iget-object v9, v9, La/mne;->b:La/dvj;

    .line 562
    .line 563
    new-instance v10, La/tqe;

    .line 564
    .line 565
    const/4 v12, 0x0

    .line 566
    invoke-direct {v10, v7, v0, v15, v12}, La/tqe;-><init>(La/uqe;Ljava/util/List;La/yje;B)V

    .line 567
    .line 568
    .line 569
    invoke-static {v9, v10, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    sget-object v7, La/wne;->a:La/wne;

    .line 574
    .line 575
    if-ne v0, v7, :cond_9

    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    :goto_10
    if-ne v0, v4, :cond_a

    .line 581
    .line 582
    goto/16 :goto_1c

    .line 583
    .line 584
    :cond_a
    :goto_11
    move-object v12, v6

    .line 585
    move v6, v5

    .line 586
    move v5, v1

    .line 587
    :cond_b
    move v1, v5

    .line 588
    move v5, v6

    .line 589
    move-object v6, v12

    .line 590
    goto :goto_12

    .line 591
    :cond_c
    move v1, v5

    .line 592
    move v5, v6

    .line 593
    move-object v6, v9

    .line 594
    :goto_12
    invoke-static {v6}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_f

    .line 599
    .line 600
    :try_start_7
    iput-object v6, v11, La/sl00;->k:Ljava/lang/Object;

    .line 601
    .line 602
    iput-object v15, v11, La/sl00;->l:Ljava/util/List;

    .line 603
    .line 604
    iput-object v15, v11, La/sl00;->m:Ljava/lang/Object;

    .line 605
    .line 606
    iput-object v15, v11, La/sl00;->n:Ljava/util/List;

    .line 607
    .line 608
    iput-object v15, v11, La/sl00;->o:Ljava/lang/Object;

    .line 609
    .line 610
    iput-boolean v5, v11, La/sl00;->i:Z

    .line 611
    .line 612
    iput-boolean v1, v11, La/sl00;->j:Z

    .line 613
    .line 614
    const/16 v0, 0x8

    .line 615
    .line 616
    iput v0, v11, La/sl00;->r:I

    .line 617
    .line 618
    iget-object v0, v3, La/mne;->b:La/dvj;

    .line 619
    .line 620
    new-instance v7, La/pqe;

    .line 621
    .line 622
    invoke-direct {v7, v2, v15, v8}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 623
    .line 624
    .line 625
    invoke-static {v0, v7, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    if-ne v0, v4, :cond_d

    .line 630
    .line 631
    goto/16 :goto_1c

    .line 632
    .line 633
    :cond_d
    :goto_13
    check-cast v0, Ljava/util/List;

    .line 634
    .line 635
    sget-object v7, La/j0g0;->b:La/e0g0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 636
    .line 637
    goto :goto_15

    .line 638
    :goto_14
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 639
    .line 640
    new-instance v7, La/g0g0;

    .line 641
    .line 642
    invoke-direct {v7, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 643
    .line 644
    .line 645
    move-object v0, v7

    .line 646
    :goto_15
    nop

    .line 647
    instance-of v7, v0, La/g0g0;

    .line 648
    .line 649
    if-nez v7, :cond_f

    .line 650
    .line 651
    move-object v7, v0

    .line 652
    check-cast v7, Ljava/util/List;

    .line 653
    .line 654
    iput-object v6, v11, La/sl00;->k:Ljava/lang/Object;

    .line 655
    .line 656
    iput-object v15, v11, La/sl00;->l:Ljava/util/List;

    .line 657
    .line 658
    iput-object v0, v11, La/sl00;->m:Ljava/lang/Object;

    .line 659
    .line 660
    iput-object v15, v11, La/sl00;->n:Ljava/util/List;

    .line 661
    .line 662
    iput-object v15, v11, La/sl00;->o:Ljava/lang/Object;

    .line 663
    .line 664
    iput-boolean v5, v11, La/sl00;->i:Z

    .line 665
    .line 666
    iput-boolean v1, v11, La/sl00;->j:Z

    .line 667
    .line 668
    const/16 v0, 0x9

    .line 669
    .line 670
    iput v0, v11, La/sl00;->r:I

    .line 671
    .line 672
    iget-object v0, v3, La/mne;->b:La/dvj;

    .line 673
    .line 674
    new-instance v1, La/tqe;

    .line 675
    .line 676
    const/4 v3, 0x1

    .line 677
    invoke-direct {v1, v2, v7, v15, v3}, La/tqe;-><init>(La/uqe;Ljava/util/List;La/yje;B)V

    .line 678
    .line 679
    .line 680
    invoke-static {v0, v1, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sget-object v1, La/wne;->a:La/wne;

    .line 685
    .line 686
    if-ne v0, v1, :cond_e

    .line 687
    .line 688
    goto :goto_16

    .line 689
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 690
    .line 691
    :goto_16
    if-ne v0, v4, :cond_f

    .line 692
    .line 693
    goto/16 :goto_1c

    .line 694
    .line 695
    :cond_f
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object v0

    .line 698
    :cond_10
    new-instance v10, La/tl00;

    .line 699
    .line 700
    const/4 v12, 0x0

    .line 701
    invoke-direct {v10, v1, v15, v12}, La/tl00;-><init>(La/vl00;La/yje;B)V

    .line 702
    .line 703
    .line 704
    iput-boolean v13, v11, La/sl00;->i:Z

    .line 705
    .line 706
    iput-boolean v5, v11, La/sl00;->j:Z

    .line 707
    .line 708
    const/16 v0, 0xa

    .line 709
    .line 710
    iput v0, v11, La/sl00;->r:I

    .line 711
    .line 712
    move v6, v5

    .line 713
    const-string v5, "getCountries"

    .line 714
    .line 715
    move v8, v6

    .line 716
    const-wide/16 v6, 0x5

    .line 717
    .line 718
    move v12, v8

    .line 719
    const-wide/16 v8, 0x0

    .line 720
    .line 721
    move v14, v12

    .line 722
    const/16 v12, 0xc

    .line 723
    .line 724
    invoke-static/range {v5 .. v12}, La/j0x;->I(Ljava/lang/String;JJLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    if-ne v0, v4, :cond_11

    .line 729
    .line 730
    goto/16 :goto_1c

    .line 731
    .line 732
    :cond_11
    :goto_18
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    check-cast v0, Ljava/util/List;

    .line 736
    .line 737
    new-instance v10, La/tl00;

    .line 738
    .line 739
    const/4 v5, 0x1

    .line 740
    invoke-direct {v10, v1, v15, v5}, La/tl00;-><init>(La/vl00;La/yje;B)V

    .line 741
    .line 742
    .line 743
    iput-object v0, v11, La/sl00;->k:Ljava/lang/Object;

    .line 744
    .line 745
    iput-boolean v13, v11, La/sl00;->i:Z

    .line 746
    .line 747
    iput-boolean v14, v11, La/sl00;->j:Z

    .line 748
    .line 749
    const/16 v5, 0xb

    .line 750
    .line 751
    iput v5, v11, La/sl00;->r:I

    .line 752
    .line 753
    const-string v5, "getPhoneMasksFromRemote"

    .line 754
    .line 755
    const-wide/16 v6, 0x5

    .line 756
    .line 757
    const-wide/16 v8, 0x0

    .line 758
    .line 759
    const/16 v12, 0xc

    .line 760
    .line 761
    invoke-static/range {v5 .. v12}, La/j0x;->I(Ljava/lang/String;JJLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    if-ne v5, v4, :cond_12

    .line 766
    .line 767
    goto :goto_1c

    .line 768
    :cond_12
    move-object v7, v0

    .line 769
    move-object v0, v5

    .line 770
    move v5, v13

    .line 771
    :goto_19
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    check-cast v0, Ljava/util/List;

    .line 775
    .line 776
    iput-object v15, v11, La/sl00;->k:Ljava/lang/Object;

    .line 777
    .line 778
    iput-object v0, v11, La/sl00;->l:Ljava/util/List;

    .line 779
    .line 780
    iput-object v1, v11, La/sl00;->m:Ljava/lang/Object;

    .line 781
    .line 782
    iput-boolean v5, v11, La/sl00;->i:Z

    .line 783
    .line 784
    iput-boolean v14, v11, La/sl00;->j:Z

    .line 785
    .line 786
    const/16 v6, 0xc

    .line 787
    .line 788
    iput v6, v11, La/sl00;->r:I

    .line 789
    .line 790
    invoke-virtual {v1, v11, v7, v5}, La/vl00;->c(La/zje;Ljava/util/List;Z)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    if-ne v6, v4, :cond_13

    .line 795
    .line 796
    goto :goto_1c

    .line 797
    :cond_13
    move-object v7, v0

    .line 798
    move-object v0, v6

    .line 799
    :goto_1a
    check-cast v0, Ljava/util/List;

    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    invoke-static {v0, v7}, La/vl00;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    iput-object v15, v11, La/sl00;->k:Ljava/lang/Object;

    .line 809
    .line 810
    iput-object v15, v11, La/sl00;->l:Ljava/util/List;

    .line 811
    .line 812
    iput-object v15, v11, La/sl00;->m:Ljava/lang/Object;

    .line 813
    .line 814
    iput-boolean v5, v11, La/sl00;->i:Z

    .line 815
    .line 816
    iput-boolean v14, v11, La/sl00;->j:Z

    .line 817
    .line 818
    const/16 v1, 0xd

    .line 819
    .line 820
    iput v1, v11, La/sl00;->r:I

    .line 821
    .line 822
    iget-object v1, v3, La/mne;->b:La/dvj;

    .line 823
    .line 824
    new-instance v3, La/jtb;

    .line 825
    .line 826
    const/16 v14, 0x1a

    .line 827
    .line 828
    invoke-direct {v3, v2, v0, v15, v14}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 829
    .line 830
    .line 831
    invoke-static {v1, v3, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    if-ne v0, v4, :cond_14

    .line 836
    .line 837
    goto :goto_1b

    .line 838
    :cond_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    :goto_1b
    if-ne v0, v4, :cond_15

    .line 841
    .line 842
    :goto_1c
    return-object v4

    .line 843
    :cond_15
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 844
    .line 845
    return-object v0

    .line 846
    nop

    .line 847
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La/zje;Ljava/util/List;Z)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v1, La/ul00;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, La/ul00;

    .line 13
    .line 14
    iget v4, v3, La/ul00;->m:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/ul00;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/ul00;

    .line 27
    .line 28
    invoke-direct {v3, v0, v1}, La/ul00;-><init>(La/vl00;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v3, La/ul00;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/ul00;->m:I

    .line 36
    .line 37
    iget-object v0, v0, La/vl00;->b:La/uqe;

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x1

    .line 41
    const/4 v8, 0x0

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    if-eq v5, v7, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    iget-object v2, v3, La/ul00;->i:Ljava/util/List;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_5

    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v8

    .line 62
    :cond_2
    iget-boolean v2, v3, La/ul00;->j:Z

    .line 63
    .line 64
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    if-nez v2, :cond_4

    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_4
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    iput-boolean v2, v3, La/ul00;->j:Z

    .line 81
    .line 82
    iput v7, v3, La/ul00;->m:I

    .line 83
    .line 84
    iget-object v1, v0, La/uqe;->e:La/mne;

    .line 85
    .line 86
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 87
    .line 88
    new-instance v5, La/pqe;

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-direct {v5, v0, v8, v7}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v5, v3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, v4, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    move-object/from16 v1, p2

    .line 105
    .line 106
    :goto_2
    :try_start_1
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 107
    .line 108
    iput-object v1, v3, La/ul00;->i:Ljava/util/List;

    .line 109
    .line 110
    iput-boolean v2, v3, La/ul00;->j:Z

    .line 111
    .line 112
    iput v6, v3, La/ul00;->m:I

    .line 113
    .line 114
    invoke-virtual {v0, v3}, La/uqe;->b(La/zje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    if-ne v0, v4, :cond_7

    .line 119
    .line 120
    :goto_3
    return-object v4

    .line 121
    :cond_7
    move-object v2, v1

    .line 122
    move-object v1, v0

    .line 123
    :goto_4
    :try_start_2
    check-cast v1, Ljava/util/List;

    .line 124
    .line 125
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    move-object v2, v1

    .line 130
    :goto_5
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 131
    .line 132
    new-instance v1, La/g0g0;

    .line 133
    .line 134
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :goto_6
    instance-of v0, v1, La/g0g0;

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_8
    move-object v8, v1

    .line 143
    :goto_7
    check-cast v8, Ljava/util/List;

    .line 144
    .line 145
    if-eqz v8, :cond_e

    .line 146
    .line 147
    const/16 v0, 0xa

    .line 148
    .line 149
    invoke-static {v8, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-static {v1}, La/wp20;->a(I)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    const/16 v3, 0x10

    .line 158
    .line 159
    if-ge v1, v3, :cond_9

    .line 160
    .line 161
    move v1, v3

    .line 162
    :cond_9
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_a

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v5, v4

    .line 182
    check-cast v5, La/p52;

    .line 183
    .line 184
    iget v5, v5, La/p52;->a:I

    .line 185
    .line 186
    new-instance v6, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v3, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-static {v2, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_d

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, La/tkt;

    .line 219
    .line 220
    iget v4, v2, La/tkt;->a:I

    .line 221
    .line 222
    iget-wide v5, v2, La/tkt;->e:J

    .line 223
    .line 224
    new-instance v7, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-direct {v7, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, La/p52;

    .line 234
    .line 235
    if-eqz v4, :cond_b

    .line 236
    .line 237
    iget v4, v4, La/p52;->d:I

    .line 238
    .line 239
    int-to-long v7, v4

    .line 240
    move-wide v15, v7

    .line 241
    goto :goto_a

    .line 242
    :cond_b
    move-wide v15, v5

    .line 243
    :goto_a
    cmp-long v4, v15, v5

    .line 244
    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    iget v11, v2, La/tkt;->a:I

    .line 248
    .line 249
    iget-object v10, v2, La/tkt;->b:Ljava/lang/String;

    .line 250
    .line 251
    iget v14, v2, La/tkt;->c:I

    .line 252
    .line 253
    iget-object v12, v2, La/tkt;->d:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v13, v2, La/tkt;->f:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v9, La/tkt;

    .line 267
    .line 268
    invoke-direct/range {v9 .. v16}, La/tkt;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJ)V

    .line 269
    .line 270
    .line 271
    move-object v2, v9

    .line 272
    :cond_c
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_d
    move-object v2, v1

    .line 277
    :cond_e
    return-object v2
.end method
