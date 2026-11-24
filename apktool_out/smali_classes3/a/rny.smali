.class public final La/rny;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ony;


# static fields
.field public static final m:Lokhttp3/MediaType;


# instance fields
.field public final a:La/us00;

.field public final b:La/tgk;

.field public final c:La/trm0;

.field public final d:La/knf0;

.field public final e:La/kuy;

.field public final f:La/mne;

.field public final g:La/gst0;

.field public final h:La/us3;

.field public final i:La/po;

.field public final j:La/z7z;

.field public final k:La/sje;

.field public final l:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v0, "application/json; charset=utf-8"

    .line 4
    .line 5
    :try_start_0
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    sput-object v0, La/rny;->m:Lokhttp3/MediaType;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/us00;La/tgk;La/trm0;La/knf0;La/kuy;La/mne;La/gst0;La/us3;La/po;La/z7z;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/rny;->a:La/us00;

    .line 26
    .line 27
    iput-object p2, p0, La/rny;->b:La/tgk;

    .line 28
    .line 29
    iput-object p3, p0, La/rny;->c:La/trm0;

    .line 30
    .line 31
    iput-object p4, p0, La/rny;->d:La/knf0;

    .line 32
    .line 33
    iput-object p5, p0, La/rny;->e:La/kuy;

    .line 34
    .line 35
    iput-object p6, p0, La/rny;->f:La/mne;

    .line 36
    .line 37
    iput-object p7, p0, La/rny;->g:La/gst0;

    .line 38
    .line 39
    iput-object p8, p0, La/rny;->h:La/us3;

    .line 40
    .line 41
    iput-object p9, p0, La/rny;->i:La/po;

    .line 42
    .line 43
    iput-object p10, p0, La/rny;->j:La/z7z;

    .line 44
    .line 45
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p2, p6, La/mne;->b:La/dvj;

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/rny;->k:La/sje;

    .line 60
    .line 61
    new-instance p1, La/y2x;

    .line 62
    .line 63
    const/16 p2, 0x13

    .line 64
    .line 65
    invoke-direct {p1, p0, p2}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, La/rny;->l:La/n0o0;

    .line 73
    .line 74
    return-void
.end method

.method public static c(Ljava/util/Map;)La/edy;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/mcy;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/mcy;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p0, La/edy;

    .line 52
    .line 53
    invoke-direct {p0, v0}, La/edy;-><init>(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/tny;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v1, La/pny;->a:La/pny;

    .line 5
    .line 6
    iget-object v0, p0, La/rny;->f:La/mne;

    .line 7
    .line 8
    iget-object v3, v0, La/mne;->b:La/dvj;

    .line 9
    .line 10
    new-instance v4, La/c6y;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x7

    .line 14
    move-object v5, p0

    .line 15
    move-object v6, p1

    .line 16
    move-object v7, p2

    .line 17
    invoke-direct/range {v4 .. v9}, La/c6y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 p0, 0xa

    .line 21
    .line 22
    iget-object v0, v5, La/rny;->k:La/sje;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move v5, p0

    .line 26
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Ljava/lang/String;La/tny;La/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, La/qny;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/qny;

    .line 13
    .line 14
    iget v4, v3, La/qny;->k:I

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
    iput v4, v3, La/qny;->k:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/qny;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, La/qny;-><init>(La/rny;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/qny;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/qny;->k:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_e

    .line 47
    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v7

    .line 54
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v1, La/rny;->i:La/po;

    .line 58
    .line 59
    iget-object v2, v2, La/po;->a:La/p7m0;

    .line 60
    .line 61
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1a

    .line 72
    .line 73
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-static {v2}, Lokhttp3/HttpUrl$Companion;->b(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 79
    .line 80
    .line 81
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-object v2, v7

    .line 84
    :goto_1
    if-eqz v2, :cond_1a

    .line 85
    .line 86
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 87
    .line 88
    const-string v5, "https://mob-experience.space"

    .line 89
    .line 90
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_1a

    .line 95
    .line 96
    iget-object v2, v0, La/tny;->b:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v5, v0, La/tny;->a:Ljava/util/Map;

    .line 99
    .line 100
    const-string v8, "wifi"

    .line 101
    .line 102
    iget-object v0, v1, La/rny;->b:La/tgk;

    .line 103
    .line 104
    invoke-virtual {v0}, La/tgk;->e()Lkotlin/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget-object v10, v0, La/tgk;->g:La/n0o0;

    .line 109
    .line 110
    iget-object v11, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v11, Ljava/lang/String;

    .line 113
    .line 114
    iget-object v9, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v9, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v12, v1, La/rny;->l:La/n0o0;

    .line 119
    .line 120
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    check-cast v12, La/m9d;

    .line 125
    .line 126
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v13, La/bzu;

    .line 136
    .line 137
    const/16 v14, 0x13

    .line 138
    .line 139
    invoke-direct {v13, v14}, La/bzu;-><init>(B)V

    .line 140
    .line 141
    .line 142
    const-string v14, "applicationGUID"

    .line 143
    .line 144
    iget-object v15, v12, La/m9d;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const-string v14, "deviceSystemVersion"

    .line 150
    .line 151
    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget v14, v12, La/m9d;->b:I

    .line 157
    .line 158
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    const-string v15, "deviceSystemVersionMajor"

    .line 163
    .line 164
    invoke-static {v13, v15, v14}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 165
    .line 166
    .line 167
    const-string v14, "applicationName"

    .line 168
    .line 169
    iget-object v15, v12, La/m9d;->c:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v14, "applicationVersion"

    .line 175
    .line 176
    iget-object v15, v12, La/m9d;->d:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v14, "deviceManufacturer"

    .line 182
    .line 183
    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v14, "deviceModel"

    .line 189
    .line 190
    iget-object v15, v12, La/m9d;->e:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v14, "deviceArchitecture"

    .line 196
    .line 197
    iget-object v15, v12, La/m9d;->f:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v13, v14, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const-string v14, "deviceCompanyMarketingName"

    .line 203
    .line 204
    invoke-static {v13, v14, v11}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v11, "deviceMarketingModel"

    .line 208
    .line 209
    invoke-static {v13, v11, v9}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v9, "deviceABI"

    .line 213
    .line 214
    iget-object v11, v12, La/m9d;->g:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v13, v9, v11}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v13}, La/bzu;->a()La/edy;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 224
    .line 225
    invoke-direct {v11, v9}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 226
    .line 227
    .line 228
    iget-object v9, v1, La/rny;->a:La/us00;

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    :try_start_1
    const-string v13, "connectivity"

    .line 232
    .line 233
    invoke-virtual {v9, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    instance-of v14, v13, Landroid/net/ConnectivityManager;

    .line 238
    .line 239
    if-eqz v14, :cond_3

    .line 240
    .line 241
    check-cast v13, Landroid/net/ConnectivityManager;

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_3
    move-object v13, v7

    .line 245
    :goto_2
    if-eqz v13, :cond_4

    .line 246
    .line 247
    invoke-virtual {v13, v6}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 248
    .line 249
    .line 250
    move-result-object v14

    .line 251
    goto :goto_3

    .line 252
    :cond_4
    move-object v14, v7

    .line 253
    :goto_3
    if-eqz v13, :cond_5

    .line 254
    .line 255
    invoke-virtual {v13, v12}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    goto :goto_4

    .line 260
    :cond_5
    move-object v13, v7

    .line 261
    :goto_4
    if-eqz v14, :cond_6

    .line 262
    .line 263
    invoke-virtual {v14}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    if-ne v14, v6, :cond_6

    .line 268
    .line 269
    move-object v13, v8

    .line 270
    goto :goto_5

    .line 271
    :cond_6
    if-eqz v13, :cond_7

    .line 272
    .line 273
    invoke-virtual {v13}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-ne v13, v6, :cond_7

    .line 278
    .line 279
    const-string v13, "cell"

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_7
    const-string v13, "noNetwork"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :catch_1
    const-string v13, "fail"

    .line 286
    .line 287
    :goto_5
    invoke-virtual {v13, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-static {v13}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    const-string v14, "deviceWiFiOn"

    .line 300
    .line 301
    invoke-interface {v11, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    const-string v13, "logType"

    .line 305
    .line 306
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-interface {v11, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    iget-object v2, v1, La/rny;->e:La/kuy;

    .line 314
    .line 315
    invoke-virtual {v2}, La/kuy;->a()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    const-string v13, "deviseLanguage"

    .line 324
    .line 325
    invoke-interface {v11, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    iget-object v2, v1, La/rny;->d:La/knf0;

    .line 329
    .line 330
    iget-object v2, v2, La/knf0;->b:La/q7d0;

    .line 331
    .line 332
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const-string v13, "WEB_VIEW_USER_AGENT"

    .line 340
    .line 341
    const-string v14, ""

    .line 342
    .line 343
    invoke-interface {v2, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    if-nez v2, :cond_8

    .line 348
    .line 349
    move-object v2, v14

    .line 350
    :cond_8
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const-string v13, "webViewUserAgent"

    .line 355
    .line 356
    invoke-interface {v11, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, La/tgk;->d()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    const-string v2, "deviceFormFactor"

    .line 368
    .line 369
    invoke-interface {v11, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    iget-object v0, v1, La/rny;->g:La/gst0;

    .line 373
    .line 374
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-nez v2, :cond_9

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_9
    :try_start_2
    const-string v2, "userId"

    .line 382
    .line 383
    iget-object v0, v0, La/gst0;->a:La/rrt0;

    .line 384
    .line 385
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iget-wide v6, v0, La/krt0;->a:J

    .line 390
    .line 391
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v0}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-interface {v11, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :catch_2
    move-exception v0

    .line 404
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 405
    .line 406
    .line 407
    :goto_6
    invoke-virtual {v9, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    instance-of v2, v0, Landroid/net/wifi/WifiManager;

    .line 412
    .line 413
    if-eqz v2, :cond_a

    .line 414
    .line 415
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_a
    const/4 v0, 0x0

    .line 419
    :goto_7
    if-eqz v0, :cond_d

    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    if-nez v0, :cond_b

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_b
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v2}, Landroid/net/wifi/WifiInfo;->getDetailedStateOf(Landroid/net/wifi/SupplicantState;)Landroid/net/NetworkInfo$DetailedState;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    sget-object v6, Landroid/net/NetworkInfo$DetailedState;->CONNECTED:Landroid/net/NetworkInfo$DetailedState;

    .line 437
    .line 438
    if-eq v2, v6, :cond_c

    .line 439
    .line 440
    sget-object v6, Landroid/net/NetworkInfo$DetailedState;->OBTAINING_IPADDR:Landroid/net/NetworkInfo$DetailedState;

    .line 441
    .line 442
    if-ne v2, v6, :cond_d

    .line 443
    .line 444
    :cond_c
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-static {v0}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    const-string v2, "wifiName"

    .line 453
    .line 454
    invoke-interface {v11, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    :cond_d
    :goto_8
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 462
    .line 463
    if-eqz v0, :cond_e

    .line 464
    .line 465
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    goto :goto_9

    .line 470
    :cond_e
    const/4 v0, 0x0

    .line 471
    :goto_9
    if-nez v0, :cond_f

    .line 472
    .line 473
    move-object v0, v14

    .line 474
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-lez v2, :cond_13

    .line 479
    .line 480
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 481
    .line 482
    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    const-string v6, "MTS"

    .line 490
    .line 491
    invoke-static {v2, v6, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 492
    .line 493
    .line 494
    move-result v7

    .line 495
    if-eqz v7, :cond_10

    .line 496
    .line 497
    move-object v0, v6

    .line 498
    goto :goto_a

    .line 499
    :cond_10
    const-string v6, "MEGAFON"

    .line 500
    .line 501
    invoke-static {v2, v6, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 502
    .line 503
    .line 504
    move-result v6

    .line 505
    if-eqz v6, :cond_11

    .line 506
    .line 507
    const-string v0, "MegaFon"

    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_11
    const-string v6, "TELE2"

    .line 511
    .line 512
    invoke-static {v2, v6, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    if-eqz v2, :cond_12

    .line 517
    .line 518
    const-string v0, "Tele2"

    .line 519
    .line 520
    :cond_12
    :goto_a
    invoke-static {v0}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    const-string v2, "carrierName"

    .line 525
    .line 526
    invoke-interface {v11, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    :cond_13
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 534
    .line 535
    if-eqz v0, :cond_14

    .line 536
    .line 537
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v7

    .line 541
    goto :goto_b

    .line 542
    :cond_14
    const/4 v7, 0x0

    .line 543
    :goto_b
    if-nez v7, :cond_15

    .line 544
    .line 545
    goto :goto_c

    .line 546
    :cond_15
    move-object v14, v7

    .line 547
    :goto_c
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-lez v0, :cond_16

    .line 552
    .line 553
    const-string v0, "carrierCC"

    .line 554
    .line 555
    invoke-static {v14}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-interface {v11, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    :cond_16
    invoke-static {v11}, La/rny;->c(Ljava/util/Map;)La/edy;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 567
    .line 568
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-nez v0, :cond_17

    .line 576
    .line 577
    invoke-interface {v2, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 578
    .line 579
    .line 580
    goto :goto_d

    .line 581
    :cond_17
    const-string v0, "eventName"

    .line 582
    .line 583
    invoke-static/range {p1 .. p1}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-nez v0, :cond_18

    .line 595
    .line 596
    const-string v0, "eventParameters"

    .line 597
    .line 598
    invoke-static {v5}, La/rny;->c(Ljava/util/Map;)La/edy;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    :cond_18
    :goto_d
    invoke-static {v2}, La/rny;->c(Ljava/util/Map;)La/edy;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    sget v2, Lokhttp3/RequestBody;->a:I

    .line 610
    .line 611
    invoke-virtual {v0}, La/edy;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    sget-object v2, La/rny;->m:Lokhttp3/MediaType;

    .line 616
    .line 617
    invoke-static {v0, v2}, Lokhttp3/RequestBody$Companion;->a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody$Companion$toRequestBody$3;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    const/4 v13, 0x1

    .line 622
    iput v13, v3, La/qny;->k:I

    .line 623
    .line 624
    iget-object v1, v1, La/rny;->c:La/trm0;

    .line 625
    .line 626
    const-string v2, "Basic YW5kcm9pZF91c2VyOmVpR2hvb0I0YWwteWllM1RoYWV0aC1lZVBodWRpdWI5"

    .line 627
    .line 628
    invoke-virtual {v1, v0, v2, v3}, La/trm0;->m(Lokhttp3/RequestBody$Companion$toRequestBody$3;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    if-ne v0, v4, :cond_19

    .line 633
    .line 634
    return-object v4

    .line 635
    :cond_19
    :goto_e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 636
    .line 637
    return-object v0

    .line 638
    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 639
    .line 640
    return-object v0
.end method
