.class public final La/gvt0;
.super La/bsr0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 13
    const/4 v0, 0x1

    iput-byte v0, p0, La/gvt0;->h:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/fvt0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/gvt0;->h:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/gvt0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final Z(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gvt0;->h:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p2, Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p2, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Lcom/yandex/authsdk/YandexAuthOptions;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, La/kys0;

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    invoke-direct {v0, p2, v2}, La/kys0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/gvt0;->i:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance p0, Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 27
    .line 28
    sget-object v0, La/vw00;->a:La/vw00;

    .line 29
    .line 30
    invoke-direct {p0, v0, v1}, Lcom/yandex/authsdk/YandexAuthLoginOptions;-><init>(La/vw00;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/yandex/authsdk/YandexAuthLoginOptions;->b:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v1, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 45
    .line 46
    iget-object v2, p2, Lcom/yandex/authsdk/YandexAuthOptions;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-boolean v3, p2, Lcom/yandex/authsdk/YandexAuthOptions;->d:Z

    .line 49
    .line 50
    iget-boolean p2, p2, Lcom/yandex/authsdk/YandexAuthOptions;->b:Z

    .line 51
    .line 52
    invoke-direct {v1, v0, v2, p2, v3}, Lcom/yandex/authsdk/YandexAuthOptions;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 53
    .line 54
    .line 55
    move-object p2, v1

    .line 56
    :cond_1
    :goto_0
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Landroid/content/Intent;

    .line 61
    .line 62
    const-class v2, Lcom/yandex/authsdk/internal/AuthSdkActivity;

    .line 63
    .line 64
    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    const-string p1, "com.yandex.authsdk.EXTRA_OPTIONS"

    .line 68
    .line 69
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    const-string p1, "com.yandex.authsdk.EXTRA_LOGIN_OPTIONS"

    .line 73
    .line 74
    invoke-virtual {v1, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    const-string p0, "com.yandex.authsdk.EXTRA_STATE"

    .line 78
    .line 79
    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_0
    check-cast p2, Ljava/util/Collection;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v0, La/xvt0;->a:La/xvt0;

    .line 89
    .line 90
    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    const-string v0, "VKAuthResultContract"

    .line 97
    .line 98
    const-string v2, " Don\'t use OFFLINE scope, if you registered app as embedded. Read more https://dev.vk.com/reference/access-rights"

    .line 99
    .line 100
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    :cond_2
    :try_start_0
    sget-object v0, La/tut0;->b:La/vkr0;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    iget-object v0, v0, La/vkr0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, La/wut0;

    .line 110
    .line 111
    iget v0, v0, La/wut0;->b:I

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    const-string v0, "apiManager"

    .line 115
    .line 116
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    :catch_0
    sget v0, La/tut0;->e:I

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const v2, 0x7f0b0009

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    sput v0, La/tut0;->e:I

    .line 139
    .line 140
    :goto_1
    if-eqz v0, :cond_9

    .line 141
    .line 142
    new-instance v2, Ljava/util/HashSet;

    .line 143
    .line 144
    invoke-direct {v2, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    const-string v8, "https://oauth.vk.com/blank.html"

    .line 152
    .line 153
    if-eqz p2, :cond_7

    .line 154
    .line 155
    new-instance v3, Landroid/content/Intent;

    .line 156
    .line 157
    const-string v4, "com.vkontakte.android.action.SDK_AUTH"

    .line 158
    .line 159
    invoke-direct {v3, v4, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 160
    .line 161
    .line 162
    const/high16 v5, 0x10000

    .line 163
    .line 164
    invoke-virtual {p2, v3, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-eqz p2, :cond_7

    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_5

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 192
    .line 193
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 194
    .line 195
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 196
    .line 197
    const-string v5, "com.vkontakte.android"

    .line 198
    .line 199
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_6

    .line 204
    .line 205
    iget-object p0, p0, La/gvt0;->i:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast p0, La/fvt0;

    .line 208
    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance p0, Landroid/content/Intent;

    .line 213
    .line 214
    invoke-direct {p0, v4, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    .line 219
    .line 220
    new-instance p1, Landroid/os/Bundle;

    .line 221
    .line 222
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string p2, "client_id"

    .line 226
    .line 227
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    const-string p2, "revoke"

    .line 231
    .line 232
    const/4 v0, 0x1

    .line 233
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    const/4 v6, 0x0

    .line 237
    const/16 v7, 0x3e

    .line 238
    .line 239
    const-string v3, ","

    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    const/4 v5, 0x0

    .line 243
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    const-string v0, "scope"

    .line 248
    .line 249
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const-string p2, "redirect_url"

    .line 253
    .line 254
    invoke-virtual {p1, p2, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 258
    .line 259
    .line 260
    :goto_2
    move-object v1, p0

    .line 261
    goto :goto_5

    .line 262
    :cond_7
    :goto_3
    sget-object p0, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;->d:La/dvt0;

    .line 263
    .line 264
    new-instance p0, Landroid/content/Intent;

    .line 265
    .line 266
    const-class p2, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;

    .line 267
    .line 268
    invoke-direct {p0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 269
    .line 270
    .line 271
    new-instance p1, Landroid/os/Bundle;

    .line 272
    .line 273
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string p2, "vk_app_id"

    .line 277
    .line 278
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 279
    .line 280
    .line 281
    new-instance p2, Ljava/util/ArrayList;

    .line 282
    .line 283
    const/16 v0, 0xa

    .line 284
    .line 285
    invoke-static {v2, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_8

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, La/xvt0;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 319
    .line 320
    .line 321
    const-string p2, "vk_app_scope"

    .line 322
    .line 323
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 324
    .line 325
    .line 326
    const-string p2, "vk_app_redirect_url"

    .line 327
    .line 328
    invoke-virtual {p1, p2, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const-string p2, "vk_auth_params"

    .line 332
    .line 333
    invoke-virtual {p0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_9
    const-string p0, "AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token"

    .line 342
    .line 343
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_a
    const-string p0, "<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml"

    .line 348
    .line 349
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :goto_5
    return-object v1

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i0(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/gvt0;->h:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v4, La/s2w0;->a:La/s2w0;

    .line 10
    .line 11
    if-ne p1, v3, :cond_8

    .line 12
    .line 13
    :try_start_0
    iget-object p0, p0, La/gvt0;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/kys0;

    .line 16
    .line 17
    if-eqz p0, :cond_3

    .line 18
    .line 19
    sget-object p0, La/f2w0;->a:La/f2w0;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    if-eq p1, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p2}, La/x2x;->V(Landroid/content/Intent;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, La/d2w0;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    new-instance p0, La/g2w0;

    .line 35
    .line 36
    invoke-direct {p0, p1}, La/g2w0;-><init>(La/d2w0;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    move-object v2, p0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string p1, "com.yandex.authsdk.EXTRA_TOKEN"

    .line 42
    .line 43
    const-class v0, Lcom/yandex/authsdk/YandexAuthToken;

    .line 44
    .line 45
    invoke-static {p2, p1, v0}, La/x2x;->U(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/yandex/authsdk/YandexAuthToken;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    new-instance p0, La/h2w0;

    .line 54
    .line 55
    invoke-direct {p0, p1}, La/h2w0;-><init>(Lcom/yandex/authsdk/YandexAuthToken;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 60
    if-nez v2, :cond_4

    .line 61
    .line 62
    move v1, v3

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    instance-of p1, v2, La/h2w0;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    instance-of p1, v2, La/f2w0;

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    move v1, p0

    .line 74
    goto :goto_2

    .line 75
    :cond_6
    const/4 v1, -0x2

    .line 76
    :goto_2
    if-eqz v1, :cond_7

    .line 77
    .line 78
    if-eq v1, p0, :cond_8

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_7
    new-instance p0, La/t2w0;

    .line 82
    .line 83
    check-cast v2, La/h2w0;

    .line 84
    .line 85
    iget-object p1, v2, La/h2w0;->a:Lcom/yandex/authsdk/YandexAuthToken;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/yandex/authsdk/YandexAuthToken;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-direct {p0, p1}, La/t2w0;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    move-object v4, p0

    .line 93
    goto :goto_3

    .line 94
    :catch_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_8
    sget-object v4, La/r2w0;->a:La/r2w0;

    .line 101
    .line 102
    :goto_3
    return-object v4

    .line 103
    :pswitch_0
    iget-object p0, p0, La/gvt0;->i:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, La/fvt0;

    .line 106
    .line 107
    if-eq p1, v3, :cond_9

    .line 108
    .line 109
    new-instance p2, La/hvt0;

    .line 110
    .line 111
    new-instance v0, La/evt0;

    .line 112
    .line 113
    const-string v3, "Authentication cancelled with activity code = "

    .line 114
    .line 115
    invoke-static {p1, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {v0, v1, p1}, La/evt0;-><init>(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p2, v0}, La/hvt0;-><init>(La/evt0;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_8

    .line 126
    .line 127
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    if-nez p2, :cond_a

    .line 131
    .line 132
    new-instance p1, La/hvt0;

    .line 133
    .line 134
    new-instance p2, La/evt0;

    .line 135
    .line 136
    const-string v0, "No result from caller provided"

    .line 137
    .line 138
    invoke-direct {p2, v1, v0}, La/evt0;-><init>(ILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p1, p2}, La/hvt0;-><init>(La/evt0;)V

    .line 142
    .line 143
    .line 144
    :goto_4
    move-object p2, p1

    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_a
    const-string p1, "extra-token-data"

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_b

    .line 154
    .line 155
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {p1}, La/ibm0;->k(Ljava/lang/String;)Ljava/util/HashMap;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_6

    .line 164
    :cond_b
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_c

    .line 169
    .line 170
    new-instance p1, Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_d

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_c
    move-object p1, v2

    .line 225
    :cond_d
    :goto_6
    const-string v0, "error"

    .line 226
    .line 227
    if-eqz p1, :cond_e

    .line 228
    .line 229
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    if-nez v3, :cond_e

    .line 234
    .line 235
    :try_start_1
    new-instance p2, La/ivt0;

    .line 236
    .line 237
    new-instance v0, La/uut0;

    .line 238
    .line 239
    invoke-direct {v0, p1}, La/uut0;-><init>(Ljava/util/HashMap;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {p2, v0}, La/ivt0;-><init>(La/uut0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 243
    .line 244
    .line 245
    goto :goto_8

    .line 246
    :catch_1
    move-exception v0

    .line 247
    move-object p1, v0

    .line 248
    const-class p2, La/fvt0;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    const-string v0, "Failed to get VK token"

    .line 255
    .line 256
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 257
    .line 258
    .line 259
    new-instance p2, La/hvt0;

    .line 260
    .line 261
    new-instance v0, La/evt0;

    .line 262
    .line 263
    new-instance v3, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    const-string v4, "Auth failed due to exception: "

    .line 266
    .line 267
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-direct {v0, v1, p1}, La/evt0;-><init>(ILjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-direct {p2, v0}, La/hvt0;-><init>(La/evt0;)V

    .line 285
    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_e
    new-instance p1, La/hvt0;

    .line 289
    .line 290
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    if-eqz v3, :cond_f

    .line 295
    .line 296
    const-string v1, "vw_login_error"

    .line 297
    .line 298
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    :cond_f
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    if-eqz p2, :cond_10

    .line 307
    .line 308
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    goto :goto_7

    .line 313
    :cond_10
    move-object p2, v2

    .line 314
    :goto_7
    new-instance v0, La/evt0;

    .line 315
    .line 316
    invoke-direct {v0, v1, p2}, La/evt0;-><init>(ILjava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {p1, v0}, La/hvt0;-><init>(La/evt0;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_4

    .line 323
    .line 324
    :goto_8
    instance-of p1, p2, La/ivt0;

    .line 325
    .line 326
    if-eqz p1, :cond_16

    .line 327
    .line 328
    move-object p1, p2

    .line 329
    check-cast p1, La/ivt0;

    .line 330
    .line 331
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast p0, La/nmt0;

    .line 337
    .line 338
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p0, Landroid/content/SharedPreferences;

    .line 344
    .line 345
    new-instance v0, Ljava/util/HashMap;

    .line 346
    .line 347
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v1, "access_token"

    .line 351
    .line 352
    iget-object p1, p1, La/ivt0;->a:La/uut0;

    .line 353
    .line 354
    iget-object v3, p1, La/uut0;->b:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    const-string v1, "secret"

    .line 360
    .line 361
    iget-object v3, p1, La/uut0;->c:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    iget-boolean v1, p1, La/uut0;->i:Z

    .line 367
    .line 368
    if-eqz v1, :cond_11

    .line 369
    .line 370
    const-string v1, "1"

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_11
    const-string v1, "0"

    .line 374
    .line 375
    :goto_9
    const-string v3, "https_required"

    .line 376
    .line 377
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    iget-wide v3, p1, La/uut0;->d:J

    .line 381
    .line 382
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    const-string v3, "created"

    .line 387
    .line 388
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    iget v1, p1, La/uut0;->h:I

    .line 392
    .line 393
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    const-string v3, "expires_in"

    .line 398
    .line 399
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    iget-object v1, p1, La/uut0;->a:Lcom/vk/dto/common/id/UserId;

    .line 403
    .line 404
    iget-wide v3, v1, Lcom/vk/dto/common/id/UserId;->a:J

    .line 405
    .line 406
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    const-string v3, "user_id"

    .line 411
    .line 412
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    const-string v1, "email"

    .line 416
    .line 417
    iget-object v3, p1, La/uut0;->e:Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    const-string v1, "phone"

    .line 423
    .line 424
    iget-object v3, p1, La/uut0;->f:Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    const-string v1, "phone_access_key"

    .line 430
    .line 431
    iget-object v3, p1, La/uut0;->g:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    :cond_12
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-eqz v1, :cond_14

    .line 449
    .line 450
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    check-cast v1, Ljava/util/Map$Entry;

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    check-cast v3, Ljava/lang/String;

    .line 461
    .line 462
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    if-eqz v1, :cond_13

    .line 472
    .line 473
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    invoke-interface {v4, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 482
    .line 483
    .line 484
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    goto :goto_b

    .line 487
    :cond_13
    move-object v1, v2

    .line 488
    :goto_b
    if-nez v1, :cond_12

    .line 489
    .line 490
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 499
    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_14
    sget-object p0, La/tut0;->b:La/vkr0;

    .line 503
    .line 504
    if-eqz p0, :cond_15

    .line 505
    .line 506
    new-instance v3, La/xut0;

    .line 507
    .line 508
    iget-object v8, p1, La/uut0;->b:Ljava/lang/String;

    .line 509
    .line 510
    iget-object v9, p1, La/uut0;->c:Ljava/lang/String;

    .line 511
    .line 512
    iget v4, p1, La/uut0;->h:I

    .line 513
    .line 514
    iget-wide v5, p1, La/uut0;->d:J

    .line 515
    .line 516
    iget-object v7, p1, La/uut0;->a:Lcom/vk/dto/common/id/UserId;

    .line 517
    .line 518
    invoke-direct/range {v3 .. v9}, La/xut0;-><init>(IJLcom/vk/dto/common/id/UserId;Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    invoke-virtual {p0, p1}, La/vkr0;->A(Ljava/util/List;)V

    .line 526
    .line 527
    .line 528
    new-instance p0, La/kvt0;

    .line 529
    .line 530
    const-string p1, "stats.trackVisitor"

    .line 531
    .line 532
    invoke-direct {p0, p1}, La/vvt0;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    sget-object p1, La/wvt0;->c:La/n0o0;

    .line 536
    .line 537
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 545
    .line 546
    new-instance v0, La/qaq0;

    .line 547
    .line 548
    const/16 v1, 0x9

    .line 549
    .line 550
    invoke-direct {v0, p0, v2, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 551
    .line 552
    .line 553
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 554
    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_15
    const-string p0, "apiManager"

    .line 558
    .line 559
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    throw v2

    .line 563
    :cond_16
    :goto_c
    return-object p2

    .line 564
    nop

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
