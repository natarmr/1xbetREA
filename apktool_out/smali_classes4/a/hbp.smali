.class public final synthetic La/hbp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ccp;


# direct methods
.method public synthetic constructor <init>(La/ccp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hbp;->a:B

    iput-object p1, p0, La/hbp;->b:La/ccp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/hbp;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/hbp;->b:La/ccp;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/ccp;->c0:La/vjp;

    .line 15
    .line 16
    sget-object v1, La/j700;->b:La/j700;

    .line 17
    .line 18
    new-instance v2, La/d8h0;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, v3, p0}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/xun;->a:La/xun;

    .line 26
    .line 27
    const-string v6, ""

    .line 28
    .line 29
    const-wide/16 v4, -0x1

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v6}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, La/ccp;->f0:La/peg0;

    .line 47
    .line 48
    new-instance v0, La/hr1;

    .line 49
    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    const/4 v3, 0x3

    .line 53
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, La/ccp;->R:La/oct;

    .line 72
    .line 73
    sget-object v5, La/t270;->d:La/t270;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/16 v7, 0x17

    .line 77
    .line 78
    const-wide/16 v1, 0x0

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v0 .. v7}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v0, Lorg/xplatform/favorites/impl/presentation/all_champs/screen/FavoriteChampsScreen;

    .line 98
    .line 99
    iget-object v1, p0, La/ccp;->a0:La/r9u;

    .line 100
    .line 101
    sget-object v2, La/ygp;->o:La/ygp;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, La/m1q0;->d(La/ygp;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iget-object p0, p0, La/ccp;->v:La/pru;

    .line 118
    .line 119
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 124
    .line 125
    iget-object p0, p0, La/mum0;->B:La/vcp;

    .line 126
    .line 127
    invoke-direct {v0, v1, p0}, Lorg/xplatform/favorites/impl/presentation/all_champs/screen/FavoriteChampsScreen;-><init>(ZLa/vcp;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object p0, p0, La/ccp;->P:La/duj;

    .line 142
    .line 143
    new-instance v0, La/jbp;

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    invoke-direct {v0, v1}, La/jbp;-><init>(B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    iget-object v0, p0, La/ccp;->M:La/m1e;

    .line 162
    .line 163
    invoke-interface {v0}, La/m1e;->c()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_0

    .line 168
    .line 169
    new-instance v0, La/bd80;

    .line 170
    .line 171
    iget-object v2, p0, La/ccp;->t:La/ctf0;

    .line 172
    .line 173
    new-array v3, v1, [Ljava/lang/Object;

    .line 174
    .line 175
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 176
    .line 177
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v2, p1, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {v0, p1}, La/bd80;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_0
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 193
    .line 194
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 195
    .line 196
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 204
    .line 205
    move-object v2, p1

    .line 206
    check-cast v2, La/dd80;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const/4 v11, 0x0

    .line 212
    const/16 v12, 0x1fbd

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v5, 0x0

    .line 217
    const/4 v6, 0x0

    .line 218
    const/4 v7, 0x0

    .line 219
    const/4 v8, 0x1

    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v10, 0x0

    .line 222
    invoke-static/range {v2 .. v12}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_1

    .line 231
    .line 232
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_5
    check-cast p1, La/k0w0;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, La/ccp;->R:La/oct;

    .line 241
    .line 242
    sget-object v5, La/t270;->a:La/t270;

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    const/16 v7, 0x17

    .line 246
    .line 247
    const-wide/16 v1, 0x0

    .line 248
    .line 249
    const/4 v3, 0x0

    .line 250
    const/4 v4, 0x0

    .line 251
    invoke-static/range {v0 .. v7}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 256
    .line 257
    .line 258
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    new-instance v0, La/bd80;

    .line 268
    .line 269
    iget-object v2, p0, La/ccp;->t:La/ctf0;

    .line 270
    .line 271
    new-array v3, v1, [Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 274
    .line 275
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v2, p1, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-direct {v0, p1}, La/bd80;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_7
    check-cast p1, La/k0w0;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object p0, p0, La/ccp;->b0:La/rrc;

    .line 298
    .line 299
    sget-object v0, La/m7r0;->a:La/m7r0;

    .line 300
    .line 301
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    new-instance v1, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

    .line 305
    .line 306
    invoke-direct {v1, p0, v0}, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;-><init>(La/rrc;La/m7r0;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 310
    .line 311
    .line 312
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
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
