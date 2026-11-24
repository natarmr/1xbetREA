.class public final synthetic La/hv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/SessionReadyListener;
.implements Lcom/appsflyer/share/deeplink/DeepLinkListener;


# instance fields
.field public final synthetic a:La/rv3;


# direct methods
.method public synthetic constructor <init>(La/rv3;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hv3;->a:La/rv3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeepLinking(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .locals 8

    .line 1
    iget-object p0, p0, La/hv3;->a:La/rv3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, La/iv3;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const-class v1, La/rv3;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    if-eq v0, p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x3

    .line 27
    if-ne v0, p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getError()Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "UDL error: "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getError()Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v2, "UDL: "

    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, " "

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "UDL FOUND but deepLink is null"

    .line 108
    .line 109
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    iget-object v0, p0, La/rv3;->b:La/z7z;

    .line 114
    .line 115
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/gst0;

    .line 120
    .line 121
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_17

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getMediaSource()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/4 v1, 0x0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-nez v3, :cond_4

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_4
    move v3, v1

    .line 142
    goto :goto_1

    .line 143
    :cond_5
    :goto_0
    move v3, v2

    .line 144
    :goto_1
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getCampaign()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    const-string v5, "nr_cid"

    .line 149
    .line 150
    invoke-virtual {p1, v5}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-nez v6, :cond_6

    .line 155
    .line 156
    const-string v6, ""

    .line 157
    .line 158
    :cond_6
    if-eqz v4, :cond_8

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-nez v7, :cond_7

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_7
    iget-object v1, p0, La/rv3;->c:La/k9b0;

    .line 168
    .line 169
    const-string v7, "referral_dl"

    .line 170
    .line 171
    iget-object v1, v1, La/k9b0;->a:La/vwb0;

    .line 172
    .line 173
    invoke-virtual {v1, v7, v4}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move v1, v3

    .line 177
    :cond_8
    :goto_2
    if-eqz v0, :cond_a

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-nez v4, :cond_9

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_9
    iget-object v4, p0, La/rv3;->c:La/k9b0;

    .line 187
    .line 188
    iget-object v4, v4, La/k9b0;->a:La/vwb0;

    .line 189
    .line 190
    const-string v7, "MEDIA_SOURCE_ID"

    .line 191
    .line 192
    invoke-virtual {v4, v7, v0}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_a
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-lez v0, :cond_b

    .line 200
    .line 201
    iget-object v0, p0, La/rv3;->c:La/k9b0;

    .line 202
    .line 203
    const-string v1, "promo"

    .line 204
    .line 205
    iget-object v0, v0, La/k9b0;->a:La/vwb0;

    .line 206
    .line 207
    invoke-virtual {v0, v1, v6}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    move v1, v2

    .line 211
    :cond_b
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getAfSub1()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    if-eqz v4, :cond_c

    .line 221
    .line 222
    const-string v6, "af_sub1"

    .line 223
    .line 224
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Ljava/lang/String;

    .line 229
    .line 230
    :cond_c
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getAfSub2()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    if-eqz v4, :cond_d

    .line 235
    .line 236
    const-string v6, "af_sub2"

    .line 237
    .line 238
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    check-cast v4, Ljava/lang/String;

    .line 243
    .line 244
    :cond_d
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getAfSub3()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-eqz v4, :cond_e

    .line 249
    .line 250
    const-string v6, "af_sub3"

    .line 251
    .line 252
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, Ljava/lang/String;

    .line 257
    .line 258
    :cond_e
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getAfSub4()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    if-eqz v4, :cond_f

    .line 263
    .line 264
    const-string v6, "af_sub4"

    .line 265
    .line 266
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    check-cast v4, Ljava/lang/String;

    .line 271
    .line 272
    :cond_f
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getAfSub5()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-eqz v4, :cond_10

    .line 277
    .line 278
    const-string v6, "af_sub5"

    .line 279
    .line 280
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Ljava/lang/String;

    .line 285
    .line 286
    :cond_10
    const-string v4, "af_sub6"

    .line 287
    .line 288
    invoke-virtual {p1, v4}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    if-eqz v6, :cond_11

    .line 293
    .line 294
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    :cond_11
    const-string v4, "af_sub7"

    .line 298
    .line 299
    invoke-virtual {p1, v4}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    if-eqz v6, :cond_12

    .line 304
    .line 305
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    :cond_12
    invoke-virtual {p1, v5}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    if-eqz v4, :cond_13

    .line 313
    .line 314
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    :cond_13
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getCampaign()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    if-eqz v4, :cond_14

    .line 322
    .line 323
    const-string v5, "campaign"

    .line 324
    .line 325
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    :cond_14
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->getMediaSource()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    if-eqz p1, :cond_15

    .line 333
    .line 334
    const-string v4, "media_source"

    .line 335
    .line 336
    invoke-interface {v0, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_15
    invoke-static {v0}, La/rv3;->b(Ljava/util/LinkedHashMap;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    iget-object v0, p0, La/rv3;->c:La/k9b0;

    .line 344
    .line 345
    iget-object v0, v0, La/k9b0;->a:La/vwb0;

    .line 346
    .line 347
    const-string v4, "post_back"

    .line 348
    .line 349
    invoke-virtual {v0, v4, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    if-eqz v1, :cond_17

    .line 353
    .line 354
    iget-boolean p1, p0, La/rv3;->l:Z

    .line 355
    .line 356
    if-eqz p1, :cond_16

    .line 357
    .line 358
    iget-object p1, p0, La/rv3;->c:La/k9b0;

    .line 359
    .line 360
    iget-object p1, p1, La/k9b0;->a:La/vwb0;

    .line 361
    .line 362
    const-string v0, "IS_ORGANIC"

    .line 363
    .line 364
    invoke-virtual {p1, v0, v3}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p0}, La/rv3;->c()V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_16
    iput-boolean v2, p0, La/rv3;->m:Z

    .line 372
    .line 373
    :cond_17
    return-void
.end method

.method public onSessionReady()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hv3;->a:La/rv3;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/rv3;->a(Lcom/appsflyer/AppsFlyerLib;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
