.class public final La/ie2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/le2;


# direct methods
.method public synthetic constructor <init>(La/le2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ie2;->i:B

    iput-object p1, p0, La/ie2;->k:La/le2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ie2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ie2;->k:La/le2;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ie2;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ie2;-><init>(La/le2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ie2;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ie2;-><init>(La/le2;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ie2;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ie2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ie2;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ie2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ie2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ie2;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ie2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ie2;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/ie2;->k:La/le2;

    .line 9
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
    iget-boolean v6, v0, La/ie2;->j:Z

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
    iget-object v2, v4, La/le2;->s:La/m1e;

    .line 34
    .line 35
    invoke-interface {v2}, La/m1e;->a()La/gmq;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/he2;

    .line 40
    .line 41
    invoke-direct {v3, v4, v5}, La/he2;-><init>(La/le2;B)V

    .line 42
    .line 43
    .line 44
    iput-boolean v5, v0, La/ie2;->j:Z

    .line 45
    .line 46
    invoke-interface {v2, v3, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-ne v0, v1, :cond_2

    .line 51
    .line 52
    move-object v2, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v2

    .line 57
    :pswitch_0
    iget-object v1, v4, La/le2;->B:La/n0o0;

    .line 58
    .line 59
    sget-object v6, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v7, v0, La/ie2;->j:Z

    .line 62
    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    if-ne v7, v5, :cond_3

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v2, v4, La/le2;->r:La/n660;

    .line 81
    .line 82
    iget-object v3, v4, La/le2;->p:Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;

    .line 83
    .line 84
    iget-object v3, v3, Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;->a:Ljava/util/Set;

    .line 85
    .line 86
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, La/sff0;

    .line 91
    .line 92
    iget-boolean v12, v7, La/sff0;->J1:Z

    .line 93
    .line 94
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/sff0;

    .line 99
    .line 100
    iget-boolean v13, v1, La/sff0;->O1:Z

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v1, v2, La/n660;->a:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v11, v1

    .line 108
    check-cast v11, La/nr;

    .line 109
    .line 110
    new-instance v1, La/fhq;

    .line 111
    .line 112
    const/16 v7, 0xa

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-direct {v1, v11, v3, v10, v7}, La/fhq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 116
    .line 117
    .line 118
    const-wide/16 v7, 0x8

    .line 119
    .line 120
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 121
    .line 122
    invoke-static {v7, v8, v3, v1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v8, La/b9u;

    .line 127
    .line 128
    const/4 v9, 0x3

    .line 129
    invoke-direct/range {v8 .. v13}, La/b9u;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object v3, v2, La/n660;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v3, La/i9u;

    .line 139
    .line 140
    iget-object v3, v3, La/i9u;->a:La/kki;

    .line 141
    .line 142
    iget-object v3, v3, La/kki;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, La/abp;

    .line 145
    .line 146
    iget-object v7, v3, La/abp;->b:La/p7m0;

    .line 147
    .line 148
    invoke-static {v7}, La/abp;->d(La/gmq;)La/rwk;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    iget-object v3, v3, La/abp;->f:La/p7m0;

    .line 153
    .line 154
    new-instance v8, La/h2c;

    .line 155
    .line 156
    const/4 v9, 0x6

    .line 157
    invoke-direct {v8, v3, v9}, La/h2c;-><init>(La/p7m0;B)V

    .line 158
    .line 159
    .line 160
    new-instance v3, La/y8p;

    .line 161
    .line 162
    const/4 v9, 0x3

    .line 163
    const/4 v11, 0x0

    .line 164
    invoke-direct {v3, v9, v10, v11}, La/y8p;-><init>(ILa/yje;B)V

    .line 165
    .line 166
    .line 167
    new-instance v9, La/p6d;

    .line 168
    .line 169
    invoke-direct {v9, v7, v8, v3, v5}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v9}, La/i120;->W(La/gmq;)La/gmq;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    iget-object v7, v2, La/n660;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v7, La/b3c;

    .line 179
    .line 180
    iget-object v7, v7, La/b3c;->a:La/nvu;

    .line 181
    .line 182
    iget-object v7, v7, La/nvu;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v7, La/g8n0;

    .line 185
    .line 186
    iget-object v7, v7, La/g8n0;->a:La/p7m0;

    .line 187
    .line 188
    invoke-static {v7}, La/vtb;->N(La/qz40;)La/xae0;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-static {v7}, La/i120;->W(La/gmq;)La/gmq;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    new-instance v8, La/qaf0;

    .line 197
    .line 198
    const/16 v9, 0xe

    .line 199
    .line 200
    invoke-direct {v8, v7, v9}, La/qaf0;-><init>(La/gmq;B)V

    .line 201
    .line 202
    .line 203
    new-instance v7, La/eu4;

    .line 204
    .line 205
    const/16 v9, 0x15

    .line 206
    .line 207
    invoke-direct {v7, v8, v9}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    new-instance v8, La/fl9;

    .line 211
    .line 212
    const/16 v9, 0x9

    .line 213
    .line 214
    invoke-direct {v8, v2, v10, v9}, La/fl9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v3, v7, v8}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const-class v1, La/zhi0;

    .line 222
    .line 223
    const-class v3, Ljava/net/UnknownHostException;

    .line 224
    .line 225
    const-class v7, La/oqt0;

    .line 226
    .line 227
    filled-new-array {v7, v1, v3}, [Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v17

    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    const/16 v20, 0x34

    .line 238
    .line 239
    const-string v13, "GamesLiveResultsViewModel.loadData"

    .line 240
    .line 241
    const/4 v14, 0x3

    .line 242
    const-wide/16 v15, 0x0

    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    invoke-static/range {v12 .. v20}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iget-object v2, v2, La/n660;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v2, La/mne;

    .line 253
    .line 254
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 255
    .line 256
    invoke-static {v1, v2}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    new-instance v2, La/he2;

    .line 261
    .line 262
    invoke-direct {v2, v4, v11}, La/he2;-><init>(La/le2;B)V

    .line 263
    .line 264
    .line 265
    iput-boolean v5, v0, La/ie2;->j:Z

    .line 266
    .line 267
    invoke-interface {v1, v2, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-ne v0, v6, :cond_5

    .line 272
    .line 273
    move-object v2, v6

    .line 274
    goto :goto_3

    .line 275
    :cond_5
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    :goto_3
    return-object v2

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
