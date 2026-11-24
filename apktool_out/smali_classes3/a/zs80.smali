.class public final La/zs80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/jt80;


# direct methods
.method public synthetic constructor <init>(La/jt80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zs80;->i:B

    iput-object p1, p0, La/zs80;->k:La/jt80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zs80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zs80;->k:La/jt80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zs80;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/zs80;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/zs80;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/zs80;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/zs80;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/zs80;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/zs80;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/zs80;-><init>(La/jt80;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/zs80;->j:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
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
    iget-byte v0, p0, La/zs80;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zs80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/zs80;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/zs80;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/zs80;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/cm80;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/zs80;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/zs80;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/zs80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/zs80;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/zs80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zs80;->i:B

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/zs80;->k:La/jt80;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v5, La/jt80;->G:La/mne;

    .line 15
    .line 16
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/sw00;

    .line 21
    .line 22
    sget-object v6, La/wne;->a:La/wne;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-boolean v6, v0, La/sw00;->b:Z

    .line 28
    .line 29
    iget-boolean v7, v0, La/sw00;->a:Z

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    sget v6, La/jt80;->s0:I

    .line 37
    .line 38
    iget-object v9, v2, La/ocj;->a:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-object v10, v2

    .line 48
    check-cast v10, La/rs80;

    .line 49
    .line 50
    iget-boolean v14, v0, La/sw00;->a:Z

    .line 51
    .line 52
    const/16 v29, 0x0

    .line 53
    .line 54
    const v30, 0x7fffff7

    .line 55
    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    const/16 v23, 0x0

    .line 76
    .line 77
    const/16 v24, 0x0

    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    const/16 v26, 0x0

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/16 v28, 0x0

    .line 86
    .line 87
    invoke-static/range {v10 .. v30}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v9, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_0

    .line 96
    .line 97
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 102
    .line 103
    sget-object v11, La/ct80;->a:La/ct80;

    .line 104
    .line 105
    new-instance v14, La/ft80;

    .line 106
    .line 107
    invoke-direct {v14, v5, v8, v4}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 108
    .line 109
    .line 110
    const/16 v15, 0xa

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, La/jt80;->X()V

    .line 117
    .line 118
    .line 119
    iput-boolean v3, v5, La/jt80;->r0:Z

    .line 120
    .line 121
    const-wide/16 v0, 0xa

    .line 122
    .line 123
    invoke-virtual {v5, v0, v1}, La/jt80;->e0(J)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    if-eqz v6, :cond_3

    .line 128
    .line 129
    if-nez v7, :cond_3

    .line 130
    .line 131
    sget v3, La/jt80;->s0:I

    .line 132
    .line 133
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 134
    .line 135
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-object v9, v3

    .line 143
    check-cast v9, La/rs80;

    .line 144
    .line 145
    iget-boolean v13, v0, La/sw00;->a:Z

    .line 146
    .line 147
    const/16 v28, 0x0

    .line 148
    .line 149
    const v29, 0x7fffff7

    .line 150
    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    const/16 v20, 0x0

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const/16 v22, 0x0

    .line 170
    .line 171
    const/16 v23, 0x0

    .line 172
    .line 173
    const/16 v24, 0x0

    .line 174
    .line 175
    const/16 v25, 0x0

    .line 176
    .line 177
    const/16 v26, 0x0

    .line 178
    .line 179
    const/16 v27, 0x0

    .line 180
    .line 181
    invoke-static/range {v9 .. v29}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_2

    .line 190
    .line 191
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 196
    .line 197
    sget-object v10, La/ct80;->a:La/ct80;

    .line 198
    .line 199
    new-instance v13, La/ft80;

    .line 200
    .line 201
    invoke-direct {v13, v5, v8, v4}, La/ft80;-><init>(La/jt80;La/yje;B)V

    .line 202
    .line 203
    .line 204
    const/16 v14, 0xa

    .line 205
    .line 206
    const/4 v11, 0x0

    .line 207
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5}, La/jt80;->X()V

    .line 211
    .line 212
    .line 213
    iput-boolean v4, v5, La/jt80;->r0:Z

    .line 214
    .line 215
    :cond_3
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_0
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Ljava/lang/Throwable;

    .line 221
    .line 222
    sget-object v1, La/wne;->a:La/wne;

    .line 223
    .line 224
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v5, La/jt80;->H:La/duj;

    .line 228
    .line 229
    new-instance v2, La/ht80;

    .line 230
    .line 231
    invoke-direct {v2, v4}, La/ht80;-><init>(B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_1
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Ljava/lang/Throwable;

    .line 243
    .line 244
    sget-object v1, La/wne;->a:La/wne;

    .line 245
    .line 246
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v5, La/jt80;->H:La/duj;

    .line 250
    .line 251
    new-instance v3, La/zc70;

    .line 252
    .line 253
    invoke-direct {v3, v2}, La/zc70;-><init>(B)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_2
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Ljava/lang/Throwable;

    .line 265
    .line 266
    sget-object v1, La/wne;->a:La/wne;

    .line 267
    .line 268
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 272
    .line 273
    .line 274
    sget v0, La/jt80;->s0:I

    .line 275
    .line 276
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 277
    .line 278
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 279
    .line 280
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-object v6, v0

    .line 288
    check-cast v6, La/rs80;

    .line 289
    .line 290
    const/16 v25, 0x0

    .line 291
    .line 292
    const v26, 0x7fffffc

    .line 293
    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    const/4 v8, 0x1

    .line 297
    const/4 v9, 0x0

    .line 298
    const/4 v10, 0x0

    .line 299
    const/4 v11, 0x0

    .line 300
    const/4 v12, 0x0

    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v16, 0x0

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const/16 v18, 0x0

    .line 309
    .line 310
    const/16 v19, 0x0

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    const/16 v21, 0x0

    .line 315
    .line 316
    const/16 v22, 0x0

    .line 317
    .line 318
    const/16 v23, 0x0

    .line 319
    .line 320
    const/16 v24, 0x0

    .line 321
    .line 322
    invoke-static/range {v6 .. v26}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_4

    .line 331
    .line 332
    iput-boolean v4, v5, La/jt80;->q0:Z

    .line 333
    .line 334
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_3
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, La/cm80;

    .line 340
    .line 341
    sget-object v1, La/wne;->a:La/wne;

    .line 342
    .line 343
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    new-instance v1, La/uj1;

    .line 347
    .line 348
    const/4 v2, 0x2

    .line 349
    invoke-direct {v1, v0, v2}, La/uj1;-><init>(La/cm80;B)V

    .line 350
    .line 351
    .line 352
    sget v2, La/jt80;->s0:I

    .line 353
    .line 354
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 355
    .line 356
    .line 357
    instance-of v0, v0, La/tl80;

    .line 358
    .line 359
    xor-int/2addr v0, v3

    .line 360
    iput-boolean v0, v5, La/jt80;->q0:Z

    .line 361
    .line 362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_4
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Ljava/lang/Throwable;

    .line 368
    .line 369
    sget-object v1, La/wne;->a:La/wne;

    .line 370
    .line 371
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object v1, v5, La/jt80;->H:La/duj;

    .line 375
    .line 376
    new-instance v2, La/zc70;

    .line 377
    .line 378
    const/16 v3, 0x1c

    .line 379
    .line 380
    invoke-direct {v2, v3}, La/zc70;-><init>(B)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_5
    iget-object v0, v0, La/zs80;->j:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Ljava/util/List;

    .line 392
    .line 393
    sget-object v1, La/wne;->a:La/wne;

    .line 394
    .line 395
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    new-instance v1, La/bo0;

    .line 399
    .line 400
    invoke-direct {v1, v0, v2}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 401
    .line 402
    .line 403
    sget v0, La/jt80;->s0:I

    .line 404
    .line 405
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 406
    .line 407
    .line 408
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
