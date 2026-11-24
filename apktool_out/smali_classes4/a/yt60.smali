.class public final synthetic La/yt60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cu60;


# direct methods
.method public synthetic constructor <init>(La/cu60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yt60;->a:B

    iput-object p1, p0, La/yt60;->b:La/cu60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/cu60;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/yt60;->a:B

    iput-object p1, p0, La/yt60;->b:La/cu60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/yt60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "games_cashback"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/yt60;->b:La/cu60;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/cu60;->U1:La/evz;

    .line 14
    .line 15
    invoke-static {p0}, La/qxw;->y(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object v0, La/cu60;->U1:La/evz;

    .line 21
    .line 22
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object v0, p0, La/h2b;->j:La/ih5;

    .line 27
    .line 28
    sget-object v1, La/k7k;->h:La/k7k;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/ih5;->f(La/k7k;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/h2b;->F:La/l7k;

    .line 34
    .line 35
    sget-object v1, La/y1p;->b:La/y1p;

    .line 36
    .line 37
    iget-object v1, p0, La/h2b;->G:La/cmt;

    .line 38
    .line 39
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v3, v1}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, La/d2b;->a:La/d2b;

    .line 51
    .line 52
    new-instance v9, La/a2b;

    .line 53
    .line 54
    invoke-direct {v9, p0, v4, v2}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 55
    .line 56
    .line 57
    const/16 v10, 0xe

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    sget-object v0, La/cu60;->U1:La/evz;

    .line 68
    .line 69
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object v0, p0, La/h2b;->l:La/ih5;

    .line 74
    .line 75
    invoke-virtual {v0, v3}, La/ih5;->c(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/h2b;->k:La/gg5;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, La/gg5;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, La/w1b;->a:La/w1b;

    .line 84
    .line 85
    invoke-virtual {p0, v0}, La/h2b;->A(La/y1b;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_2
    sget-object v0, La/cu60;->U1:La/evz;

    .line 92
    .line 93
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, La/h2b;->C()V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_3
    sget-object v0, La/cu60;->U1:La/evz;

    .line 104
    .line 105
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object v0, p0, La/h2b;->b:La/i1w0;

    .line 110
    .line 111
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object p0, p0, La/h2b;->o:La/uf3;

    .line 116
    .line 117
    iget-object p0, p0, La/uf3;->a:La/oct;

    .line 118
    .line 119
    invoke-virtual {p0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 124
    .line 125
    if-eqz v3, :cond_0

    .line 126
    .line 127
    new-instance v3, La/e1w0;

    .line 128
    .line 129
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 130
    .line 131
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 132
    .line 133
    .line 134
    new-instance p0, La/c8d;

    .line 135
    .line 136
    sget-object v4, La/y7d;->a:La/v7d;

    .line 137
    .line 138
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_0
    new-instance v3, La/w0w0;

    .line 146
    .line 147
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 148
    .line 149
    .line 150
    new-instance p0, La/c8d;

    .line 151
    .line 152
    sget-object v4, La/y7d;->a:La/v7d;

    .line 153
    .line 154
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_0
    invoke-static {v0, v2, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    :goto_1
    move-object v1, p0

    .line 165
    check-cast v1, La/paw;

    .line 166
    .line 167
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_1

    .line 172
    .line 173
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, La/oe50;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_4
    sget-object v0, La/cu60;->U1:La/evz;

    .line 187
    .line 188
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget-object v2, p0, La/cu60;->K1:La/phf0;

    .line 193
    .line 194
    sget-object v3, La/cu60;->V1:[La/iiy;

    .line 195
    .line 196
    aget-object v1, v3, v1

    .line 197
    .line 198
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sget-object v2, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 206
    .line 207
    invoke-static {v0, v2, v1}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {p0}, La/h2b;->B()V

    .line 215
    .line 216
    .line 217
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_5
    sget-object v0, La/cu60;->U1:La/evz;

    .line 221
    .line 222
    new-instance v0, La/ry3;

    .line 223
    .line 224
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object p0, p0, La/cu60;->O1:La/tbi;

    .line 229
    .line 230
    if-eqz p0, :cond_2

    .line 231
    .line 232
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_2
    const-string p0, "cashbackViewModelFactory"

    .line 237
    .line 238
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v4

    .line 242
    :pswitch_6
    sget-object v0, La/cu60;->U1:La/evz;

    .line 243
    .line 244
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    iget-object v0, p0, La/h2b;->L:La/bby;

    .line 249
    .line 250
    if-eqz v0, :cond_3

    .line 251
    .line 252
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-ne v0, v2, :cond_3

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_3
    iget-object v0, p0, La/h2b;->i:La/u58;

    .line 260
    .line 261
    iget-object v0, v0, La/u58;->a:La/kt2;

    .line 262
    .line 263
    const-string v1, "games_cashback_withdraw_call"

    .line 264
    .line 265
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-object v0, p0, La/h2b;->D:La/ix0;

    .line 269
    .line 270
    iget-object v0, v0, La/ix0;->a:La/s1p;

    .line 271
    .line 272
    const-wide/16 v1, 0xd08

    .line 273
    .line 274
    sget-object v3, La/xun;->a:La/xun;

    .line 275
    .line 276
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 277
    .line 278
    .line 279
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    new-instance v6, La/j1b;

    .line 284
    .line 285
    const/4 v0, 0x3

    .line 286
    invoke-direct {v6, p0, v0}, La/j1b;-><init>(La/h2b;B)V

    .line 287
    .line 288
    .line 289
    new-instance v9, La/a2b;

    .line 290
    .line 291
    const/4 v0, 0x2

    .line 292
    invoke-direct {v9, p0, v4, v0}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 293
    .line 294
    .line 295
    const/16 v10, 0xe

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/4 v8, 0x0

    .line 299
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iput-object v0, p0, La/h2b;->L:La/bby;

    .line 304
    .line 305
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
