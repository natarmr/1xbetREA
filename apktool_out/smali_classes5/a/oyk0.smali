.class public final La/oyk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/tyk0;


# direct methods
.method public synthetic constructor <init>(La/tyk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oyk0;->i:B

    iput-object p1, p0, La/oyk0;->k:La/tyk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/oyk0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oyk0;->k:La/tyk0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/oyk0;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/oyk0;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/oyk0;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/oyk0;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/oyk0;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance p1, La/oyk0;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, p2, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oyk0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oyk0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oyk0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/oyk0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/oyk0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/oyk0;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/oyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/oyk0;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/oyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
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
    iget-byte v1, v0, La/oyk0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/oyk0;->k:La/tyk0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v3, v2, La/tyk0;->G:La/qoj0;

    .line 34
    .line 35
    new-instance v5, La/kav0;

    .line 36
    .line 37
    iget-object v2, v2, La/tyk0;->m:La/o1u;

    .line 38
    .line 39
    iget-object v2, v2, La/o1u;->a:La/bzk0;

    .line 40
    .line 41
    iget-object v2, v2, La/bzk0;->d:La/uyk0;

    .line 42
    .line 43
    iget-object v2, v2, La/uyk0;->c:La/vyk0;

    .line 44
    .line 45
    iget-object v2, v2, La/vyk0;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/yxk0;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v5, v6, v2}, La/kav0;-><init>(ZLa/yxk0;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 58
    .line 59
    invoke-virtual {v3, v5, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v1, :cond_2

    .line 64
    .line 65
    move-object v5, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    return-object v5

    .line 70
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 73
    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    if-ne v6, v4, :cond_3

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v2, La/tyk0;->D:La/qoj0;

    .line 90
    .line 91
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 92
    .line 93
    sget-object v3, La/pl60;->a:La/pl60;

    .line 94
    .line 95
    invoke-virtual {v2, v3, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v1, :cond_5

    .line 100
    .line 101
    move-object v5, v1

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_3
    return-object v5

    .line 106
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 107
    .line 108
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 109
    .line 110
    if-eqz v6, :cond_7

    .line 111
    .line 112
    if-ne v6, v4, :cond_6

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v0, p1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v2, La/tyk0;->o:La/muu;

    .line 128
    .line 129
    invoke-virtual {v3}, La/muu;->a()La/p7m0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 134
    .line 135
    invoke-static {v3, v0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v1, :cond_8

    .line 140
    .line 141
    move-object v5, v1

    .line 142
    goto :goto_6

    .line 143
    :cond_8
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    new-instance v1, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v3, 0xa

    .line 150
    .line 151
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_9

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, La/xxk0;

    .line 173
    .line 174
    invoke-static {v3, v4}, La/xxk0;->a(La/xxk0;Z)La/xxk0;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    new-instance v0, La/pc7;

    .line 183
    .line 184
    invoke-direct {v0, v1}, La/pc7;-><init>(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, La/tyk0;->C(La/qc7;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_6
    return-object v5

    .line 193
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 194
    .line 195
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 196
    .line 197
    if-eqz v6, :cond_c

    .line 198
    .line 199
    if-ne v6, v4, :cond_b

    .line 200
    .line 201
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v0, p1

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object v3, v2, La/tyk0;->o:La/muu;

    .line 215
    .line 216
    invoke-virtual {v3}, La/muu;->a()La/p7m0;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 221
    .line 222
    invoke-static {v3, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v1, :cond_d

    .line 227
    .line 228
    move-object v5, v1

    .line 229
    goto :goto_8

    .line 230
    :cond_d
    :goto_7
    check-cast v0, Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_f

    .line 237
    .line 238
    new-instance v1, La/bcs;

    .line 239
    .line 240
    invoke-direct {v1, v0}, La/bcs;-><init>(Ljava/util/List;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v1}, La/tyk0;->D(La/dcs;)V

    .line 244
    .line 245
    .line 246
    iget-object v0, v2, La/tyk0;->A:La/c4m0;

    .line 247
    .line 248
    if-eqz v0, :cond_e

    .line 249
    .line 250
    invoke-virtual {v0, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 251
    .line 252
    .line 253
    :cond_e
    invoke-virtual {v2}, La/tyk0;->z()V

    .line 254
    .line 255
    .line 256
    :cond_f
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    :goto_8
    return-object v5

    .line 259
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 260
    .line 261
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 262
    .line 263
    if-eqz v6, :cond_11

    .line 264
    .line 265
    if-ne v6, v4, :cond_10

    .line 266
    .line 267
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v0, p1

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_10
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget-object v3, v2, La/tyk0;->o:La/muu;

    .line 281
    .line 282
    invoke-virtual {v3}, La/muu;->a()La/p7m0;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 287
    .line 288
    invoke-static {v3, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-ne v0, v1, :cond_12

    .line 293
    .line 294
    move-object v5, v1

    .line 295
    goto :goto_a

    .line 296
    :cond_12
    :goto_9
    check-cast v0, Ljava/util/List;

    .line 297
    .line 298
    iget-object v1, v2, La/tyk0;->n:La/ysu;

    .line 299
    .line 300
    iget-object v1, v1, La/ysu;->a:La/bzk0;

    .line 301
    .line 302
    iget-object v1, v1, La/bzk0;->d:La/uyk0;

    .line 303
    .line 304
    iget-object v1, v1, La/uyk0;->b:La/yxk0;

    .line 305
    .line 306
    sget-object v3, La/yxk0;->g:La/yxk0;

    .line 307
    .line 308
    if-ne v1, v3, :cond_13

    .line 309
    .line 310
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_13

    .line 315
    .line 316
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    new-instance v7, La/ejk0;

    .line 321
    .line 322
    const/16 v0, 0xe

    .line 323
    .line 324
    invoke-direct {v7, v0}, La/ejk0;-><init>(B)V

    .line 325
    .line 326
    .line 327
    new-instance v10, La/oyk0;

    .line 328
    .line 329
    const/4 v0, 0x4

    .line 330
    invoke-direct {v10, v2, v5, v0}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 331
    .line 332
    .line 333
    const/16 v11, 0xe

    .line 334
    .line 335
    const/4 v8, 0x0

    .line 336
    const/4 v9, 0x0

    .line 337
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 338
    .line 339
    .line 340
    :cond_13
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    :goto_a
    return-object v5

    .line 343
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 344
    .line 345
    iget-boolean v6, v0, La/oyk0;->j:Z

    .line 346
    .line 347
    if-eqz v6, :cond_15

    .line 348
    .line 349
    if-ne v6, v4, :cond_14

    .line 350
    .line 351
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_14
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    goto :goto_c

    .line 359
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    new-instance v3, La/jav0;

    .line 363
    .line 364
    invoke-direct {v3, v4}, La/jav0;-><init>(Z)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v3}, La/tyk0;->E(La/lav0;)V

    .line 368
    .line 369
    .line 370
    iget-object v3, v2, La/tyk0;->m:La/o1u;

    .line 371
    .line 372
    iget-object v3, v3, La/o1u;->a:La/bzk0;

    .line 373
    .line 374
    iget-object v3, v3, La/bzk0;->d:La/uyk0;

    .line 375
    .line 376
    iget-object v3, v3, La/uyk0;->c:La/vyk0;

    .line 377
    .line 378
    iget-object v5, v2, La/tyk0;->f:La/fq;

    .line 379
    .line 380
    new-instance v6, La/ly5;

    .line 381
    .line 382
    iget-wide v7, v3, La/vyk0;->f:D

    .line 383
    .line 384
    sget-object v9, La/lnm0;->b:La/lnm0;

    .line 385
    .line 386
    iget-wide v11, v3, La/vyk0;->c:D

    .line 387
    .line 388
    iget-wide v13, v3, La/vyk0;->b:D

    .line 389
    .line 390
    iget-object v2, v2, La/tyk0;->e:La/ztt;

    .line 391
    .line 392
    invoke-virtual {v2}, La/ztt;->a()La/csr;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    iget-object v2, v2, La/csr;->a:La/bsr;

    .line 397
    .line 398
    iget-object v15, v2, La/bsr;->a:La/esr;

    .line 399
    .line 400
    iget-wide v2, v3, La/vyk0;->a:J

    .line 401
    .line 402
    const/4 v10, 0x0

    .line 403
    move-wide/from16 v16, v2

    .line 404
    .line 405
    invoke-direct/range {v6 .. v17}, La/ly5;-><init>(DLa/lnm0;ZDDLa/esr;J)V

    .line 406
    .line 407
    .line 408
    iput-boolean v4, v0, La/oyk0;->j:Z

    .line 409
    .line 410
    invoke-virtual {v5, v6, v0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-ne v0, v1, :cond_16

    .line 415
    .line 416
    move-object v5, v1

    .line 417
    goto :goto_c

    .line 418
    :cond_16
    :goto_b
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    :goto_c
    return-object v5

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
