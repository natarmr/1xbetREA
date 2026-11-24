.class public final La/zg1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;IJLa/yje;B)V
    .locals 0

    .line 15
    iput-byte p6, p0, La/zg1;->i:B

    iput-object p1, p0, La/zg1;->l:La/diu0;

    iput p2, p0, La/zg1;->k:I

    iput-wide p3, p0, La/zg1;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/po6;JILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/zg1;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/zg1;->l:La/diu0;

    .line 5
    .line 6
    iput-wide p2, p0, La/zg1;->j:J

    .line 7
    .line 8
    iput p4, p0, La/zg1;->k:I

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


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/zg1;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/zg1;->l:La/diu0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zg1;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/d650;

    .line 12
    .line 13
    iget-wide v4, p0, La/zg1;->j:J

    .line 14
    .line 15
    const/4 v7, 0x3

    .line 16
    iget v3, p0, La/zg1;->k:I

    .line 17
    .line 18
    move-object v6, p2

    .line 19
    invoke-direct/range {v1 .. v7}, La/zg1;-><init>(La/diu0;IJLa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v7, p2

    .line 24
    new-instance v2, La/zg1;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, La/nob;

    .line 28
    .line 29
    iget-wide v5, p0, La/zg1;->j:J

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    iget v4, p0, La/zg1;->k:I

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, La/zg1;-><init>(La/diu0;IJLa/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_1
    move-object v7, p2

    .line 39
    new-instance v2, La/zg1;

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, La/po6;

    .line 43
    .line 44
    iget-wide v4, p0, La/zg1;->j:J

    .line 45
    .line 46
    iget v6, p0, La/zg1;->k:I

    .line 47
    .line 48
    invoke-direct/range {v2 .. v7}, La/zg1;-><init>(La/po6;JILa/yje;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :pswitch_2
    move-object v7, p2

    .line 53
    new-instance v2, La/zg1;

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    check-cast v3, La/mh1;

    .line 57
    .line 58
    iget-wide v5, p0, La/zg1;->j:J

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    iget v4, p0, La/zg1;->k:I

    .line 62
    .line 63
    invoke-direct/range {v2 .. v8}, La/zg1;-><init>(La/diu0;IJLa/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
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
    iget-byte v0, p0, La/zg1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zg1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zg1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/zg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/zg1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/zg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/zg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/zg1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/zg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zg1;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-wide v5, v0, La/zg1;->j:J

    .line 9
    .line 10
    iget v7, v0, La/zg1;->k:I

    .line 11
    .line 12
    iget-object v0, v0, La/zg1;->l:La/diu0;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, La/d650;

    .line 23
    .line 24
    iget-object v0, v0, La/d650;->X:La/f3j;

    .line 25
    .line 26
    const-class v1, La/o450;

    .line 27
    .line 28
    sget-object v8, La/sre0;->a:La/tre0;

    .line 29
    .line 30
    invoke-virtual {v8, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/sgy;->J()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    const-string v1, ""

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v8, v0, La/f3j;->l:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, La/b4j;

    .line 48
    .line 49
    invoke-virtual {v8, v7, v1}, La/b4j;->e(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v8, v0, La/f3j;->m:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v8, La/je;

    .line 55
    .line 56
    invoke-virtual {v8, v7, v1}, La/je;->c(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, La/hm1;

    .line 60
    .line 61
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-direct {v1, v3, v4, v5}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v0, La/f3j;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, La/oeg0;

    .line 75
    .line 76
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    new-instance v5, La/vef;

    .line 85
    .line 86
    const/16 v6, 0x12

    .line 87
    .line 88
    invoke-direct {v5, v0, v1, v6}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    new-instance v0, La/a1w0;

    .line 92
    .line 93
    invoke-direct {v0, v5}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/c8d;

    .line 97
    .line 98
    sget-object v5, La/y7d;->a:La/v7d;

    .line 99
    .line 100
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v1, v3, v4, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_0
    move-object v1, v0

    .line 108
    check-cast v1, La/paw;

    .line 109
    .line 110
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, La/oe50;

    .line 121
    .line 122
    invoke-virtual {v3, v1}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 130
    .line 131
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    check-cast v0, La/nob;

    .line 135
    .line 136
    iget-object v1, v0, La/nob;->b:La/hst;

    .line 137
    .line 138
    iget-object v1, v1, La/hst;->a:La/oif0;

    .line 139
    .line 140
    invoke-virtual {v1}, La/oif0;->n()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v8, v0, La/nob;->c:La/o4a;

    .line 149
    .line 150
    iget-object v8, v8, La/o4a;->a:La/g45;

    .line 151
    .line 152
    iget-object v8, v8, La/g45;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v8, La/lye;

    .line 155
    .line 156
    iput-wide v5, v8, La/lye;->i:J

    .line 157
    .line 158
    iput v7, v8, La/lye;->j:I

    .line 159
    .line 160
    new-instance v5, Ljava/util/ArrayList;

    .line 161
    .line 162
    const/16 v6, 0xa

    .line 163
    .line 164
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    move v8, v2

    .line 176
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_6

    .line 181
    .line 182
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    add-int/lit8 v10, v8, 0x1

    .line 187
    .line 188
    if-ltz v8, :cond_5

    .line 189
    .line 190
    check-cast v9, La/hf6;

    .line 191
    .line 192
    iget v11, v9, La/hf6;->a:I

    .line 193
    .line 194
    if-ne v7, v11, :cond_2

    .line 195
    .line 196
    move v11, v3

    .line 197
    goto :goto_2

    .line 198
    :cond_2
    move v11, v2

    .line 199
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    sub-int/2addr v12, v3

    .line 204
    if-ne v8, v12, :cond_3

    .line 205
    .line 206
    move v8, v3

    .line 207
    goto :goto_3

    .line 208
    :cond_3
    move v8, v2

    .line 209
    :goto_3
    iget-object v12, v0, La/nob;->d:La/ctf0;

    .line 210
    .line 211
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    new-instance v13, La/lob;

    .line 215
    .line 216
    iget v14, v9, La/hf6;->a:I

    .line 217
    .line 218
    iget-boolean v15, v9, La/hf6;->e:Z

    .line 219
    .line 220
    if-eqz v15, :cond_4

    .line 221
    .line 222
    new-array v9, v2, [Ljava/lang/Object;

    .line 223
    .line 224
    iget-object v12, v12, La/ctf0;->b:La/lsm0;

    .line 225
    .line 226
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    const v15, 0x7f130b49

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v15, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    goto :goto_4

    .line 238
    :cond_4
    new-array v15, v2, [Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v3, v12, La/ctf0;->b:La/lsm0;

    .line 241
    .line 242
    invoke-static {v15, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v15

    .line 246
    const v2, 0x7f1302ad

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v2, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    iget v3, v9, La/hf6;->b:I

    .line 254
    .line 255
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v12, v2, v3}, La/ctf0;->e(La/ctf0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    :goto_4
    invoke-direct {v13, v11, v8, v9, v14}, La/lob;-><init>(ZZLjava/lang/String;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move v8, v10

    .line 274
    const/4 v2, 0x0

    .line 275
    const/4 v3, 0x1

    .line 276
    goto :goto_1

    .line 277
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 278
    .line 279
    .line 280
    throw v4

    .line 281
    :cond_6
    iget-object v0, v0, La/nob;->e:La/p7m0;

    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v4, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 293
    .line 294
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    check-cast v0, La/po6;

    .line 298
    .line 299
    iget-object v1, v0, La/po6;->o:La/qtt;

    .line 300
    .line 301
    iget-object v1, v1, La/qtt;->a:La/so6;

    .line 302
    .line 303
    iget-object v1, v1, La/so6;->b:La/gs6;

    .line 304
    .line 305
    iget-object v1, v1, La/gs6;->e:Ljava/util/HashMap;

    .line 306
    .line 307
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    iget-object v1, v0, La/po6;->f:La/qtt;

    .line 319
    .line 320
    invoke-virtual {v1}, La/qtt;->a()Ljava/util/ArrayList;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    iget-object v1, v0, La/po6;->r:La/vn7;

    .line 325
    .line 326
    iget-object v1, v1, La/vn7;->a:La/uzc;

    .line 327
    .line 328
    invoke-virtual {v1}, La/uzc;->a()Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    iget-object v1, v0, La/po6;->n:La/x4u;

    .line 333
    .line 334
    invoke-virtual {v1}, La/x4u;->d()Ljava/util/HashMap;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    const/4 v9, 0x0

    .line 339
    iget-object v10, v0, La/po6;->B:La/ctf0;

    .line 340
    .line 341
    move-object v6, v5

    .line 342
    invoke-static/range {v5 .. v10}, La/o050;->L(Ljava/util/List;Ljava/util/List;ZLjava/util/HashMap;ZLa/ctf0;)Ljava/util/ArrayList;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    iget-object v3, v0, La/po6;->R:La/p7m0;

    .line 351
    .line 352
    new-instance v5, La/yv7;

    .line 353
    .line 354
    invoke-virtual {v0}, La/po6;->x()Ljava/util/ArrayList;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-direct {v5, v0, v2}, La/yv7;-><init>(Ljava/util/ArrayList;Z)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v4, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v0

    .line 374
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 375
    .line 376
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    move-object v8, v0

    .line 380
    check-cast v8, La/mh1;

    .line 381
    .line 382
    iget-object v9, v8, La/mh1;->r:La/g3j;

    .line 383
    .line 384
    new-instance v10, La/p2j;

    .line 385
    .line 386
    sget-object v0, La/mh1;->E0:Ljava/lang/String;

    .line 387
    .line 388
    invoke-direct {v10, v0, v7, v5, v6}, La/p2j;-><init>(Ljava/lang/String;IJ)V

    .line 389
    .line 390
    .line 391
    const/4 v12, 0x0

    .line 392
    const/4 v13, 0x6

    .line 393
    const/4 v11, 0x0

    .line 394
    invoke-static/range {v8 .. v13}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 395
    .line 396
    .line 397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object v0

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
