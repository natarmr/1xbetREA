.class public final La/hs3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Lorg/platform/app/ApplicationLoader;


# direct methods
.method public synthetic constructor <init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hs3;->i:B

    iput-object p1, p0, La/hs3;->k:Lorg/platform/app/ApplicationLoader;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/hs3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/hs3;->k:Lorg/platform/app/ApplicationLoader;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/hs3;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/hs3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/hs3;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/hs3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

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
    iget-byte v0, p0, La/hs3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hs3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hs3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hs3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hs3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hs3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hs3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/hs3;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/hs3;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, La/wen;->b:La/uen;

    .line 31
    .line 32
    const-wide/16 v4, 0x9c4

    .line 33
    .line 34
    sget-object p1, La/bfn;->d:La/bfn;

    .line 35
    .line 36
    invoke-static {v4, v5, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iput-boolean v2, p0, La/hs3;->j:Z

    .line 41
    .line 42
    invoke-static {v4, v5, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    move-object v3, v0

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_2
    :goto_0
    iget-object p0, p0, La/hs3;->k:Lorg/platform/app/ApplicationLoader;

    .line 52
    .line 53
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, La/g8i;->X3:La/n5d0;

    .line 58
    .line 59
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/rv3;

    .line 64
    .line 65
    iget-boolean p1, p0, La/rv3;->n:Z

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, ""

    .line 75
    .line 76
    const-string v1, "appsflyersdk.com"

    .line 77
    .line 78
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v2}, Lcom/appsflyer/AppsFlyerLib;->setCollectAndroidID(Z)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/rv3;->g:La/knf0;

    .line 89
    .line 90
    invoke-virtual {v1}, La/knf0;->a()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->setAndroidIdData(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, La/ov3;

    .line 98
    .line 99
    invoke-direct {v1, p0}, La/ov3;-><init>(La/rv3;)V

    .line 100
    .line 101
    .line 102
    iget-object v4, p0, La/rv3;->a:La/us00;

    .line 103
    .line 104
    const-string v5, "iGjRWepvHRRUkVX6DYuTPC"

    .line 105
    .line 106
    invoke-virtual {p1, v5, v1, v4}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;

    .line 107
    .line 108
    .line 109
    new-instance v1, La/hv3;

    .line 110
    .line 111
    invoke-direct {v1, p0}, La/hv3;-><init>(La/rv3;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V

    .line 115
    .line 116
    .line 117
    const-wide/16 v4, 0x1388

    .line 118
    .line 119
    invoke-virtual {p1, v4, v5}, Lcom/appsflyer/AppsFlyerLib;->setDeepLinkTimeout(J)V

    .line 120
    .line 121
    .line 122
    new-instance v1, La/hv3;

    .line 123
    .line 124
    invoke-direct {v1, p0}, La/hv3;-><init>(La/rv3;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, La/rv3;->a:La/us00;

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    iget-object v4, p0, La/rv3;->c:La/k9b0;

    .line 139
    .line 140
    iget-object v4, v4, La/k9b0;->a:La/vwb0;

    .line 141
    .line 142
    const-string v5, "APPS_FLYER_ID"

    .line 143
    .line 144
    invoke-virtual {v4, v5, v1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    iput-object p1, p0, La/rv3;->s:Lcom/appsflyer/AppsFlyerLib;

    .line 148
    .line 149
    iput-boolean v2, p0, La/rv3;->n:Z

    .line 150
    .line 151
    invoke-virtual {p0, p1}, La/rv3;->a(Lcom/appsflyer/AppsFlyerLib;)V

    .line 152
    .line 153
    .line 154
    iget-object v6, p0, La/rv3;->r:La/sje;

    .line 155
    .line 156
    sget-object v7, La/pv3;->a:La/pv3;

    .line 157
    .line 158
    new-instance v10, La/qv3;

    .line 159
    .line 160
    invoke-direct {v10, p0, v3, v0}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 161
    .line 162
    .line 163
    const/16 v11, 0xe

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 167
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 168
    .line 169
    .line 170
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    :goto_2
    return-object v3

    .line 173
    :pswitch_0
    iget-object v0, p0, La/hs3;->k:Lorg/platform/app/ApplicationLoader;

    .line 174
    .line 175
    sget-object v4, La/wne;->a:La/wne;

    .line 176
    .line 177
    iget-boolean v5, p0, La/hs3;->j:Z

    .line 178
    .line 179
    if-eqz v5, :cond_6

    .line 180
    .line 181
    if-ne v5, v2, :cond_5

    .line 182
    .line 183
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object p1, v0, Lorg/platform/app/ApplicationLoader;->k:La/z7z;

    .line 195
    .line 196
    if-eqz p1, :cond_9

    .line 197
    .line 198
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, La/y58;

    .line 203
    .line 204
    invoke-interface {p1}, La/y58;->j()La/krc;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object p1, p1, La/krc;->a:La/a1d;

    .line 209
    .line 210
    iget-object v1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, La/xwb0;

    .line 213
    .line 214
    invoke-virtual {p1}, La/a1d;->i()Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    xor-int/2addr p1, v2

    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v1, v1, La/xwb0;->c:La/n0o0;

    .line 223
    .line 224
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Landroid/content/SharedPreferences;

    .line 229
    .line 230
    const-string v5, "biometrics_passed"

    .line 231
    .line 232
    invoke-interface {v1, v5, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-eqz p1, :cond_8

    .line 237
    .line 238
    iget-object p1, v0, Lorg/platform/app/ApplicationLoader;->j:La/z7z;

    .line 239
    .line 240
    if-eqz p1, :cond_7

    .line 241
    .line 242
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, La/c1d0;

    .line 247
    .line 248
    invoke-interface {p1}, La/c1d0;->e()La/ylt0;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iput-boolean v2, p0, La/hs3;->j:Z

    .line 253
    .line 254
    invoke-virtual {p1, v2, p0}, La/ylt0;->a(ZLa/zje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-ne p0, v4, :cond_8

    .line 259
    .line 260
    move-object v3, v4

    .line 261
    goto :goto_4

    .line 262
    :cond_7
    const-string p0, "prophylaxisFeature"

    .line 263
    .line 264
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v3

    .line 268
    :cond_8
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    :goto_4
    return-object v3

    .line 271
    :cond_9
    const-string p0, "biometryFeature"

    .line 272
    .line 273
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v3

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
