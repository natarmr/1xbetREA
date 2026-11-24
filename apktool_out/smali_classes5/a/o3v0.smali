.class public final La/o3v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/nwc0;

.field public final c:La/nwc0;

.field public final d:La/ppb0;

.field public final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(La/vby;La/nwc0;La/nwc0;La/ppb0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/o3v0;->a:La/vby;

    .line 8
    .line 9
    iput-object p2, p0, La/o3v0;->b:La/nwc0;

    .line 10
    .line 11
    iput-object p3, p0, La/o3v0;->c:La/nwc0;

    .line 12
    .line 13
    iput-object p4, p0, La/o3v0;->d:La/ppb0;

    .line 14
    .line 15
    new-instance v0, La/wzu0;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x7

    .line 19
    const/4 v1, 0x1

    .line 20
    const-class v3, La/o3v0;

    .line 21
    .line 22
    const-string v4, "parsePromoPageDeeplink"

    .line 23
    .line 24
    const-string v5, "parsePromoPageDeeplink(Ljava/lang/String;)Ljava/lang/String;"

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    invoke-direct/range {v0 .. v7}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lkotlin/Pair;

    .line 31
    .line 32
    const-string p1, "IFRAME_OPEN_PROMOPAGE"

    .line 33
    .line 34
    invoke-direct {p0, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/n3v0;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-direct {p1, v2, p2}, La/n3v0;-><init>(La/o3v0;B)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Lkotlin/Pair;

    .line 44
    .line 45
    const-string p3, "IFRAME_OPEN_CASINO"

    .line 46
    .line 47
    invoke-direct {p2, p3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/n3v0;

    .line 51
    .line 52
    const/4 p3, 0x1

    .line 53
    invoke-direct {p1, v2, p3}, La/n3v0;-><init>(La/o3v0;B)V

    .line 54
    .line 55
    .line 56
    new-instance p3, Lkotlin/Pair;

    .line 57
    .line 58
    const-string p4, "IFRAME_OPEN_BETTING"

    .line 59
    .line 60
    invoke-direct {p3, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, La/n3v0;

    .line 64
    .line 65
    const/4 p4, 0x2

    .line 66
    invoke-direct {p1, v2, p4}, La/n3v0;-><init>(La/o3v0;B)V

    .line 67
    .line 68
    .line 69
    new-instance p4, Lkotlin/Pair;

    .line 70
    .line 71
    const-string v0, "IFRAME_OPEN_LINK_IN_BROWSER"

    .line 72
    .line 73
    invoke-direct {p4, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/n3v0;

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    invoke-direct {p1, v2, v0}, La/n3v0;-><init>(La/o3v0;B)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lkotlin/Pair;

    .line 83
    .line 84
    const-string v1, "IFRAME_OPEN_ALL_GAMES_ENTRANCE"

    .line 85
    .line 86
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    filled-new-array {p0, p2, p3, p4, v0}, [Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iput-object p0, v2, La/o3v0;->e:Ljava/util/Map;

    .line 98
    .line 99
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
    iget-object v0, p0, La/o3v0;->a:La/vby;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, La/g740;->Companion:La/d740;

    .line 13
    .line 14
    invoke-virtual {v1}, La/d740;->serializer()La/jiy;

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
    check-cast v0, La/g740;

    .line 25
    .line 26
    iget-object v0, v0, La/g740;->a:Ljava/lang/String;
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
    iget-object v2, p0, La/o3v0;->d:La/ppb0;

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
    iget-object p0, p0, La/o3v0;->c:La/nwc0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/nwc0;->invoke()Ljava/lang/Object;

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
    if-nez v1, :cond_c

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
    if-nez v1, :cond_c

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
    goto :goto_1

    .line 182
    :sswitch_8
    const-string p0, "IFRAME_AUTHORIZATION"

    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-nez p0, :cond_9

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_9
    const-string p0, "://open/login"

    .line 192
    .line 193
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :sswitch_9
    const-string p0, "IFRAME_OPEN_HOME"

    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-nez p0, :cond_a

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_a
    const-string p0, "://open/popular"

    .line 207
    .line 208
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :sswitch_a
    const-string v1, "IFRAME_OPEN_PROMOPAGE"

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-nez v1, :cond_c

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :sswitch_b
    const-string v1, "IFRAME_OPEN_ALL_GAMES_ENTRANCE"

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_c

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :sswitch_c
    const-string p1, "IFRAME_OPEN_INFORMATION"

    .line 231
    .line 232
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-nez p1, :cond_b

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_b
    iget-object p0, p0, La/o3v0;->b:La/nwc0;

    .line 240
    .line 241
    invoke-virtual {p0}, La/nwc0;->invoke()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :sswitch_d
    const-string v1, "IFRAME_OPEN_BETTING"

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-nez v1, :cond_c

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_c
    iget-object p0, p0, La/o3v0;->e:Ljava/util/Map;

    .line 255
    .line 256
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 261
    .line 262
    if-eqz p0, :cond_d

    .line 263
    .line 264
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    check-cast p0, Ljava/lang/String;

    .line 269
    .line 270
    if-eqz p0, :cond_d

    .line 271
    .line 272
    invoke-virtual {v2, p0}, La/ppb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    :cond_d
    :goto_1
    return-void

    .line 276
    nop

    .line 277
    :sswitch_data_0
    .sparse-switch
        -0x7d4e9c5b -> :sswitch_d
        -0x61bb112e -> :sswitch_c
        -0x287b5b74 -> :sswitch_b
        -0x160744bc -> :sswitch_a
        -0x15c4a627 -> :sswitch_9
        0x511d1fe -> :sswitch_8
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
