.class public final La/r3v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/hxc0;

.field public final c:La/hxc0;

.field public final d:La/ppb0;

.field public final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(La/vby;La/hxc0;La/hxc0;La/ppb0;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r3v0;->a:La/vby;

    .line 8
    .line 9
    iput-object p2, p0, La/r3v0;->b:La/hxc0;

    .line 10
    .line 11
    iput-object p3, p0, La/r3v0;->c:La/hxc0;

    .line 12
    .line 13
    iput-object p4, p0, La/r3v0;->d:La/ppb0;

    .line 14
    .line 15
    new-instance v0, La/wzu0;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v7, 0x8

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const-class v3, La/r3v0;

    .line 22
    .line 23
    const-string v4, "parsePromoPageDeeplink"

    .line 24
    .line 25
    const-string v5, "parsePromoPageDeeplink(Ljava/lang/String;)Ljava/lang/String;"

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    invoke-direct/range {v0 .. v7}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lkotlin/Pair;

    .line 32
    .line 33
    const-string p0, "IFRAME_OPEN_PROMOPAGE"

    .line 34
    .line 35
    invoke-direct {v3, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/q3v0;

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lkotlin/Pair;

    .line 45
    .line 46
    const-string p1, "IFRAME_OPEN_CASINO"

    .line 47
    .line 48
    invoke-direct {v4, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, La/q3v0;

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lkotlin/Pair;

    .line 58
    .line 59
    const-string p1, "IFRAME_OPEN_BETTING"

    .line 60
    .line 61
    invoke-direct {v5, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/q3v0;

    .line 65
    .line 66
    const/4 p1, 0x2

    .line 67
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 68
    .line 69
    .line 70
    new-instance v6, Lkotlin/Pair;

    .line 71
    .line 72
    const-string p1, "IFRAME_OPEN_LINK_IN_BROWSER"

    .line 73
    .line 74
    invoke-direct {v6, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, La/q3v0;

    .line 78
    .line 79
    const/4 p1, 0x3

    .line 80
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 81
    .line 82
    .line 83
    new-instance v7, Lkotlin/Pair;

    .line 84
    .line 85
    const-string p1, "IFRAME_OPEN_ALL_GAMES_ENTRANCE"

    .line 86
    .line 87
    invoke-direct {v7, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance p0, La/q3v0;

    .line 91
    .line 92
    const/4 p1, 0x4

    .line 93
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Lkotlin/Pair;

    .line 97
    .line 98
    const-string p1, "IFRAME_OPEN_TEAM_LINE_AND_LIVE"

    .line 99
    .line 100
    invoke-direct {v8, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/q3v0;

    .line 104
    .line 105
    const/4 p1, 0x5

    .line 106
    invoke-direct {p0, v2, p1}, La/q3v0;-><init>(La/r3v0;B)V

    .line 107
    .line 108
    .line 109
    new-instance v9, Lkotlin/Pair;

    .line 110
    .line 111
    const-string p1, "IFRAME_BET_ON_OWN"

    .line 112
    .line 113
    invoke-direct {v9, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    filled-new-array/range {v3 .. v9}, [Lkotlin/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    iput-object p0, v2, La/r3v0;->e:Ljava/util/Map;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final postMessage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    iget-object v0, p0, La/r3v0;->a:La/vby;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, La/f740;->Companion:La/c740;

    .line 13
    .line 14
    invoke-virtual {v1}, La/c740;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/f740;

    .line 25
    .line 26
    iget-object v0, v0, La/f740;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    new-instance v1, La/g0g0;

    .line 33
    .line 34
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v1

    .line 38
    :goto_0
    nop

    .line 39
    instance-of v1, v0, La/g0g0;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v2, p0, La/r3v0;->d:La/ppb0;

    .line 55
    .line 56
    sparse-switch v1, :sswitch_data_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_0
    const-string p1, "IFRAME_PAGE_NOT_FOUND"

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_3
    iget-object p0, p0, La/r3v0;->c:La/hxc0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/hxc0;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :sswitch_1
    const-string p0, "IFRAME_OPEN_PROMO_STORE"

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_4

    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :cond_4
    const-string p0, "://open/promoshop"

    .line 89
    .line 90
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :sswitch_2
    const-string p0, "IFRAME_OPEN_TOP_UP"

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-nez p0, :cond_5

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_5
    const-string p0, "://open/paysystems"

    .line 106
    .line 107
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :sswitch_3
    const-string p0, "IFRAME_OPEN_OFFICE"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_6

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_6
    const-string p0, "://open/editprofile"

    .line 123
    .line 124
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :sswitch_4
    const-string v1, "IFRAME_OPEN_LINK_IN_BROWSER"

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_d

    .line 136
    .line 137
    goto/16 :goto_1

    .line 138
    .line 139
    :sswitch_5
    const-string v1, "IFRAME_OPEN_CASINO"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_d

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :sswitch_6
    const-string p0, "IFRAME_REGISTRATION"

    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-nez p0, :cond_7

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :cond_7
    const-string p0, "://open/registration"

    .line 160
    .line 161
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto/16 :goto_1

    .line 165
    .line 166
    :sswitch_7
    const-string p0, "IFRAME_OPEN_SUPPORT"

    .line 167
    .line 168
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_8

    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :cond_8
    const-string p0, "://open/support"

    .line 177
    .line 178
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :sswitch_8
    const-string p0, "IFRAME_OPEN_FAST_GAMES"

    .line 184
    .line 185
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-nez p0, :cond_9

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_9
    const-string p0, "://open/fastgames"

    .line 194
    .line 195
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :sswitch_9
    const-string v1, "IFRAME_BET_ON_OWN"

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-nez v1, :cond_d

    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :sswitch_a
    const-string p0, "IFRAME_AUTHORIZATION"

    .line 211
    .line 212
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-nez p0, :cond_a

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_a
    const-string p0, "://open/login"

    .line 220
    .line 221
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :sswitch_b
    const-string p0, "IFRAME_OPEN_HOME"

    .line 226
    .line 227
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-nez p0, :cond_b

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_b
    const-string p0, "://open/popular"

    .line 235
    .line 236
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :sswitch_c
    const-string v1, "IFRAME_OPEN_PROMOPAGE"

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-nez v1, :cond_d

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :sswitch_d
    const-string v1, "IFRAME_OPEN_ALL_GAMES_ENTRANCE"

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-nez v1, :cond_d

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :sswitch_e
    const-string v1, "IFRAME_OPEN_TEAM_LINE_AND_LIVE"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_d

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :sswitch_f
    const-string p1, "IFRAME_OPEN_INFORMATION"

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-nez p1, :cond_c

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_c
    iget-object p0, p0, La/r3v0;->b:La/hxc0;

    .line 277
    .line 278
    invoke-virtual {p0}, La/hxc0;->invoke()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    goto :goto_1

    .line 282
    :sswitch_10
    const-string v1, "IFRAME_OPEN_BETTING"

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_d

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_d
    iget-object p0, p0, La/r3v0;->e:Ljava/util/Map;

    .line 292
    .line 293
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 298
    .line 299
    if-eqz p0, :cond_e

    .line 300
    .line 301
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    check-cast p0, Ljava/lang/String;

    .line 306
    .line 307
    if-eqz p0, :cond_e

    .line 308
    .line 309
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_e
    :goto_1
    return-void

    .line 313
    :sswitch_data_0
    .sparse-switch
        -0x7d4e9c5b -> :sswitch_10
        -0x61bb112e -> :sswitch_f
        -0x55691089 -> :sswitch_e
        -0x287b5b74 -> :sswitch_d
        -0x160744bc -> :sswitch_c
        -0x15c4a627 -> :sswitch_b
        0x511d1fe -> :sswitch_a
        0x150e410f -> :sswitch_9
        0x1e540278 -> :sswitch_8
        0x210ec475 -> :sswitch_7
        0x25f4ae74 -> :sswitch_6
        0x3f81966f -> :sswitch_5
        0x4ae3d219 -> :sswitch_4
        0x543c4936 -> :sswitch_3
        0x5d48385f -> :sswitch_2
        0x69536b37 -> :sswitch_1
        0x6c0d2821 -> :sswitch_0
    .end sparse-switch
.end method
