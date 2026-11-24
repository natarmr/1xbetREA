.class public final La/ft80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/jt80;


# direct methods
.method public synthetic constructor <init>(La/jt80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ft80;->i:B

    iput-object p1, p0, La/ft80;->k:La/jt80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ft80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ft80;->k:La/jt80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ft80;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/ft80;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/ft80;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/ft80;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    iput-boolean p0, v0, La/ft80;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance p1, La/ft80;

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    invoke-direct {p1, p0, p2, v0}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_3
    new-instance p1, La/ft80;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_4
    new-instance p1, La/ft80;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-direct {p1, p0, p2, v0}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    nop

    .line 67
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
    iget-byte v0, p0, La/ft80;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ft80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ft80;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/ft80;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, La/vne;

    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/ft80;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, La/vne;

    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/ft80;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_4
    check-cast p1, La/vne;

    .line 98
    .line 99
    check-cast p2, La/yje;

    .line 100
    .line 101
    invoke-virtual {p0, p1, p2}, La/ft80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/ft80;

    .line 106
    .line 107
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, La/ft80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    nop

    .line 115
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
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ft80;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/ft80;->k:La/jt80;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/ft80;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

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
    iget-object v2, v5, La/jt80;->Y:La/kd30;

    .line 34
    .line 35
    iput-boolean v3, v0, La/ft80;->j:Z

    .line 36
    .line 37
    invoke-virtual {v2}, La/kd30;->N()Lkotlin/Unit;

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
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    :goto_1
    return-object v4

    .line 48
    :pswitch_0
    iget-boolean v10, v0, La/ft80;->j:Z

    .line 49
    .line 50
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/rs80;

    .line 60
    .line 61
    iget-boolean v0, v0, La/rs80;->e:Z

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    if-eqz v10, :cond_5

    .line 66
    .line 67
    iget-boolean v0, v5, La/jt80;->q0:Z

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v5}, La/jt80;->c0()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/rs80;

    .line 80
    .line 81
    iget-object v0, v0, La/rs80;->t:La/pr80;

    .line 82
    .line 83
    instance-of v0, v0, La/nr80;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v5}, La/jt80;->V()V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {v5}, La/jt80;->X()V

    .line 91
    .line 92
    .line 93
    :cond_5
    :goto_2
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 94
    .line 95
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v5, v0

    .line 105
    check-cast v5, La/rs80;

    .line 106
    .line 107
    const/16 v24, 0x0

    .line 108
    .line 109
    const v25, 0x7ffffef

    .line 110
    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v14, 0x0

    .line 120
    const/4 v15, 0x0

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const/16 v23, 0x0

    .line 136
    .line 137
    invoke-static/range {v5 .. v25}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_1
    iget-boolean v0, v0, La/ft80;->j:Z

    .line 151
    .line 152
    sget-object v1, La/wne;->a:La/wne;

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v5, La/i3t0;->f:La/oyg0;

    .line 158
    .line 159
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 160
    .line 161
    iget-object v3, v5, La/jt80;->n0:La/r3q;

    .line 162
    .line 163
    if-eqz v3, :cond_b

    .line 164
    .line 165
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, La/rs80;

    .line 170
    .line 171
    iget-object v3, v3, La/rs80;->r:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_b

    .line 178
    .line 179
    iget-object v3, v5, La/jt80;->m0:Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 180
    .line 181
    sget-object v6, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;->d:Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 182
    .line 183
    invoke-virtual {v3, v6}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-nez v3, :cond_b

    .line 188
    .line 189
    iget-object v3, v5, La/jt80;->n0:La/r3q;

    .line 190
    .line 191
    if-eqz v3, :cond_7

    .line 192
    .line 193
    iget-object v3, v3, La/r3q;->b:Ljava/util/List;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    move-object v3, v4

    .line 197
    :goto_3
    if-nez v3, :cond_8

    .line 198
    .line 199
    sget-object v3, La/iun;->a:La/iun;

    .line 200
    .line 201
    :cond_8
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_b

    .line 206
    .line 207
    iget-object v3, v5, La/jt80;->n0:La/r3q;

    .line 208
    .line 209
    if-eqz v3, :cond_9

    .line 210
    .line 211
    iget-object v3, v3, La/r3q;->c:Ljava/util/List;

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_9
    move-object v3, v4

    .line 215
    :goto_4
    if-nez v3, :cond_a

    .line 216
    .line 217
    sget-object v3, La/iun;->a:La/iun;

    .line 218
    .line 219
    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_b

    .line 224
    .line 225
    if-eqz v0, :cond_12

    .line 226
    .line 227
    :cond_b
    invoke-virtual {v5}, La/jt80;->X()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/rs80;

    .line 235
    .line 236
    iget-object v0, v0, La/rs80;->t:La/pr80;

    .line 237
    .line 238
    instance-of v0, v0, La/nr80;

    .line 239
    .line 240
    if-eqz v0, :cond_c

    .line 241
    .line 242
    invoke-virtual {v5}, La/jt80;->V()V

    .line 243
    .line 244
    .line 245
    :cond_c
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, La/rs80;

    .line 250
    .line 251
    iget-boolean v0, v0, La/rs80;->f:Z

    .line 252
    .line 253
    if-eqz v0, :cond_11

    .line 254
    .line 255
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 256
    .line 257
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-object v6, v3

    .line 265
    check-cast v6, La/rs80;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    const/16 v25, 0x0

    .line 271
    .line 272
    const v26, 0x7bfffff

    .line 273
    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    const/4 v8, 0x0

    .line 277
    const/4 v9, 0x0

    .line 278
    const/4 v10, 0x0

    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v12, 0x0

    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const/16 v16, 0x0

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const/16 v18, 0x0

    .line 289
    .line 290
    const/16 v19, 0x0

    .line 291
    .line 292
    const/16 v20, 0x0

    .line 293
    .line 294
    sget-object v21, La/vr80;->a:La/vr80;

    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/16 v23, 0x0

    .line 299
    .line 300
    const/16 v24, 0x0

    .line 301
    .line 302
    invoke-static/range {v6 .. v26}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-virtual {v0, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_d

    .line 311
    .line 312
    iget-object v0, v5, La/jt80;->x:La/xoc;

    .line 313
    .line 314
    iget-object v0, v0, La/xoc;->a:La/jr0;

    .line 315
    .line 316
    iget-object v0, v0, La/jr0;->b:La/ap0;

    .line 317
    .line 318
    iget-object v3, v0, La/ap0;->a:Ljava/util/LinkedHashMap;

    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 321
    .line 322
    .line 323
    iput-object v4, v0, La/ap0;->c:La/mi1;

    .line 324
    .line 325
    iget-object v0, v5, La/jt80;->s:La/xoc;

    .line 326
    .line 327
    iget-object v0, v0, La/xoc;->a:La/jr0;

    .line 328
    .line 329
    iget-object v0, v0, La/jr0;->b:La/ap0;

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    iput-boolean v3, v0, La/ap0;->d:Z

    .line 333
    .line 334
    iget-object v0, v5, La/jt80;->D:La/fuu;

    .line 335
    .line 336
    iget-wide v3, v5, La/jt80;->o:J

    .line 337
    .line 338
    sget-object v6, La/iun;->a:La/iun;

    .line 339
    .line 340
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v0, v0, La/fuu;->a:La/jr0;

    .line 347
    .line 348
    iget-object v0, v0, La/jr0;->b:La/ap0;

    .line 349
    .line 350
    invoke-virtual {v0, v3, v4, v6}, La/ap0;->a(JLjava/util/List;)V

    .line 351
    .line 352
    .line 353
    iget-object v0, v5, La/jt80;->n0:La/r3q;

    .line 354
    .line 355
    if-eqz v0, :cond_12

    .line 356
    .line 357
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    check-cast v3, La/rs80;

    .line 362
    .line 363
    iget-object v3, v3, La/rs80;->r:Ljava/util/List;

    .line 364
    .line 365
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-eqz v3, :cond_f

    .line 370
    .line 371
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 372
    .line 373
    :cond_e
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-object v6, v4

    .line 381
    check-cast v6, La/rs80;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    const/16 v25, 0x0

    .line 387
    .line 388
    const v26, 0x7fffff8

    .line 389
    .line 390
    .line 391
    const/4 v7, 0x1

    .line 392
    const/4 v8, 0x0

    .line 393
    const/4 v9, 0x0

    .line 394
    const/4 v10, 0x0

    .line 395
    const/4 v11, 0x0

    .line 396
    const/4 v12, 0x0

    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/16 v18, 0x0

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    const/16 v21, 0x0

    .line 411
    .line 412
    const/16 v22, 0x0

    .line 413
    .line 414
    const/16 v23, 0x0

    .line 415
    .line 416
    const/16 v24, 0x0

    .line 417
    .line 418
    invoke-static/range {v6 .. v26}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-virtual {v3, v4, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_e

    .line 427
    .line 428
    :cond_f
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 429
    .line 430
    :cond_10
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-object v6, v3

    .line 438
    check-cast v6, La/rs80;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    const/16 v25, 0x0

    .line 444
    .line 445
    const v26, 0x7ffffbf

    .line 446
    .line 447
    .line 448
    const/4 v7, 0x0

    .line 449
    const/4 v8, 0x0

    .line 450
    const/4 v9, 0x0

    .line 451
    const/4 v10, 0x0

    .line 452
    const/4 v11, 0x0

    .line 453
    const/4 v12, 0x0

    .line 454
    const/4 v13, 0x1

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const/16 v19, 0x0

    .line 464
    .line 465
    const/16 v20, 0x0

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    const/16 v23, 0x0

    .line 472
    .line 473
    const/16 v24, 0x0

    .line 474
    .line 475
    invoke-static/range {v6 .. v26}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    if-eqz v3, :cond_10

    .line 484
    .line 485
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, La/rs80;

    .line 490
    .line 491
    iget-object v1, v1, La/rs80;->q:Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 492
    .line 493
    invoke-virtual {v5, v1, v0}, La/jt80;->Y(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;La/r3q;)V

    .line 494
    .line 495
    .line 496
    goto :goto_5

    .line 497
    :cond_11
    iget-object v0, v5, La/jt80;->n0:La/r3q;

    .line 498
    .line 499
    if-eqz v0, :cond_12

    .line 500
    .line 501
    invoke-virtual {v5}, La/jt80;->Z()V

    .line 502
    .line 503
    .line 504
    :cond_12
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 508
    .line 509
    iget-boolean v6, v0, La/ft80;->j:Z

    .line 510
    .line 511
    if-eqz v6, :cond_14

    .line 512
    .line 513
    if-ne v6, v3, :cond_13

    .line 514
    .line 515
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_13
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    goto :goto_8

    .line 523
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    iget-object v2, v5, La/jt80;->R:La/kb0;

    .line 527
    .line 528
    new-instance v4, La/cb0;

    .line 529
    .line 530
    iget-object v6, v5, La/jt80;->b0:Ljava/lang/String;

    .line 531
    .line 532
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iget-wide v7, v5, La/jt80;->o:J

    .line 536
    .line 537
    sget-object v5, La/nw80;->b:La/nw80;

    .line 538
    .line 539
    invoke-virtual {v5}, La/nw80;->getId()J

    .line 540
    .line 541
    .line 542
    move-result-wide v9

    .line 543
    cmp-long v5, v7, v9

    .line 544
    .line 545
    if-nez v5, :cond_15

    .line 546
    .line 547
    const-string v5, "aggregator_slots"

    .line 548
    .line 549
    goto :goto_6

    .line 550
    :cond_15
    sget-object v5, La/nw80;->a:La/nw80;

    .line 551
    .line 552
    invoke-virtual {v5}, La/nw80;->getId()J

    .line 553
    .line 554
    .line 555
    move-result-wide v9

    .line 556
    cmp-long v5, v7, v9

    .line 557
    .line 558
    if-nez v5, :cond_16

    .line 559
    .line 560
    const-string v5, "aggregator_live"

    .line 561
    .line 562
    goto :goto_6

    .line 563
    :cond_16
    const-string v5, ""

    .line 564
    .line 565
    :goto_6
    invoke-direct {v4, v6, v5}, La/cb0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    iput-boolean v3, v0, La/ft80;->j:Z

    .line 569
    .line 570
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v4, v0}, La/kb0;->o(La/fb0;La/yje;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    if-ne v0, v1, :cond_17

    .line 578
    .line 579
    move-object v4, v1

    .line 580
    goto :goto_8

    .line 581
    :cond_17
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 582
    .line 583
    :goto_8
    return-object v4

    .line 584
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 585
    .line 586
    iget-boolean v6, v0, La/ft80;->j:Z

    .line 587
    .line 588
    if-eqz v6, :cond_19

    .line 589
    .line 590
    if-ne v6, v3, :cond_18

    .line 591
    .line 592
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    goto :goto_a

    .line 596
    :cond_18
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    iget-object v2, v5, La/jt80;->R:La/kb0;

    .line 604
    .line 605
    new-instance v4, La/db0;

    .line 606
    .line 607
    iget-object v6, v5, La/jt80;->b0:Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    iget-wide v7, v5, La/jt80;->o:J

    .line 613
    .line 614
    sget-object v9, La/nw80;->b:La/nw80;

    .line 615
    .line 616
    invoke-virtual {v9}, La/nw80;->getId()J

    .line 617
    .line 618
    .line 619
    move-result-wide v9

    .line 620
    cmp-long v9, v7, v9

    .line 621
    .line 622
    if-nez v9, :cond_1a

    .line 623
    .line 624
    sget-object v7, La/k7k;->d:La/k7k;

    .line 625
    .line 626
    goto :goto_9

    .line 627
    :cond_1a
    sget-object v9, La/nw80;->a:La/nw80;

    .line 628
    .line 629
    invoke-virtual {v9}, La/nw80;->getId()J

    .line 630
    .line 631
    .line 632
    move-result-wide v9

    .line 633
    cmp-long v7, v7, v9

    .line 634
    .line 635
    if-nez v7, :cond_1b

    .line 636
    .line 637
    sget-object v7, La/k7k;->e:La/k7k;

    .line 638
    .line 639
    goto :goto_9

    .line 640
    :cond_1b
    sget-object v7, La/k7k;->s1:La/k7k;

    .line 641
    .line 642
    :goto_9
    iget-object v5, v5, La/jt80;->a0:La/cmt;

    .line 643
    .line 644
    invoke-virtual {v5}, La/cmt;->g()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v5

    .line 648
    invoke-direct {v4, v6, v7, v5}, La/db0;-><init>(Ljava/lang/String;La/k7k;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    iput-boolean v3, v0, La/ft80;->j:Z

    .line 652
    .line 653
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v4, v0}, La/kb0;->o(La/fb0;La/yje;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    if-ne v0, v1, :cond_1c

    .line 661
    .line 662
    move-object v4, v1

    .line 663
    goto :goto_b

    .line 664
    :cond_1c
    :goto_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 665
    .line 666
    :goto_b
    return-object v4

    .line 667
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 668
    .line 669
    iget-boolean v6, v0, La/ft80;->j:Z

    .line 670
    .line 671
    if-eqz v6, :cond_1e

    .line 672
    .line 673
    if-ne v6, v3, :cond_1d

    .line 674
    .line 675
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    goto :goto_c

    .line 679
    :cond_1d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    goto :goto_d

    .line 683
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    iget-object v2, v5, La/jt80;->O:La/bnt;

    .line 687
    .line 688
    iget-object v2, v2, La/bnt;->a:La/cu5;

    .line 689
    .line 690
    iget-object v2, v2, La/cu5;->b:La/jr5;

    .line 691
    .line 692
    iget-object v2, v2, La/jr5;->d:La/p7m0;

    .line 693
    .line 694
    new-instance v4, La/wk30;

    .line 695
    .line 696
    const/16 v6, 0xb

    .line 697
    .line 698
    invoke-direct {v4, v2, v6}, La/wk30;-><init>(La/gmq;B)V

    .line 699
    .line 700
    .line 701
    iput-boolean v3, v0, La/ft80;->j:Z

    .line 702
    .line 703
    invoke-static {v4, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    if-ne v0, v1, :cond_1f

    .line 708
    .line 709
    move-object v4, v1

    .line 710
    goto :goto_d

    .line 711
    :cond_1f
    :goto_c
    sget v0, La/jt80;->s0:I

    .line 712
    .line 713
    invoke-virtual {v5}, La/jt80;->V()V

    .line 714
    .line 715
    .line 716
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    :goto_d
    return-object v4

    .line 719
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
