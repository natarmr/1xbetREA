.class public final Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "androidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1",
        "Landroid/os/ResultReceiver;",
        "credentials-play-services-auth"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:La/c0u;


# direct methods
.method public constructor <init>(La/c0u;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;->a:La/c0u;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ens;

    .line 5
    .line 6
    sget-object v2, La/ecf;->a:La/acf;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v1, 0x2

    .line 11
    const-class v3, La/acf;

    .line 12
    .line 13
    const-string v4, "getCredentialExceptionTypeToException"

    .line 14
    .line 15
    const-string v5, "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;"

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, La/ens;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;->a:La/c0u;

    .line 21
    .line 22
    iget-object v1, p0, La/c0u;->f:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    const-string v2, "executor"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_14

    .line 28
    .line 29
    iget-object v4, p0, La/c0u;->e:La/ybf;

    .line 30
    .line 31
    const-string v5, "callback"

    .line 32
    .line 33
    if-eqz v4, :cond_13

    .line 34
    .line 35
    iget-object v6, p0, La/c0u;->g:Landroid/os/CancellationSignal;

    .line 36
    .line 37
    invoke-static {p2, v0, v1, v4, v6}, La/ecf;->b(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;La/ybf;Landroid/os/CancellationSignal;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    const-string v0, "ACTIVITY_REQUEST_CODE"

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const-string v1, "RESULT_DATA"

    .line 52
    .line 53
    const-class v4, Landroid/content/Intent;

    .line 54
    .line 55
    invoke-static {p2, v1, v4}, La/knx;->P(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Landroid/content/Intent;

    .line 60
    .line 61
    iget-object v1, p0, La/c0u;->f:Ljava/util/concurrent/Executor;

    .line 62
    .line 63
    if-eqz v1, :cond_12

    .line 64
    .line 65
    iget-object v2, p0, La/c0u;->e:La/ybf;

    .line 66
    .line 67
    if-eqz v2, :cond_11

    .line 68
    .line 69
    iget-object p0, p0, La/c0u;->g:Landroid/os/CancellationSignal;

    .line 70
    .line 71
    sget-boolean v4, La/ecf;->c:Z

    .line 72
    .line 73
    if-eq v0, v4, :cond_1

    .line 74
    .line 75
    new-instance p0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string p1, "Returned request code "

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p1, " which  does not match what was given "

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "GetCredentialController"

    .line 98
    .line 99
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_1
    const/4 v0, -0x1

    .line 104
    if-eq p1, v0, :cond_4

    .line 105
    .line 106
    new-instance p2, La/mie0;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v0, La/d0u;

    .line 112
    .line 113
    invoke-static {p1}, La/hkb;->C(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const/4 v4, 0x3

    .line 118
    invoke-direct {v0, v3, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    if-nez p1, :cond_2

    .line 124
    .line 125
    new-instance p1, La/b0u;

    .line 126
    .line 127
    const-string v0, "activity is cancelled by the user."

    .line 128
    .line 129
    invoke-direct {p1, v0}, La/b0u;-><init>(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p2, La/mie0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    :cond_2
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {p0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_3

    .line 144
    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :cond_3
    iget-object p0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, La/e0u;

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance p1, La/stf0;

    .line 155
    .line 156
    const/4 p2, 0x0

    .line 157
    invoke-direct {p1, v2, p0, p2}, La/stf0;-><init>(La/ybf;La/e0u;B)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_4
    if-nez p2, :cond_6

    .line 165
    .line 166
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {p0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-eqz p0, :cond_5

    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :cond_5
    new-instance p0, La/kcf;

    .line 180
    .line 181
    const/16 p1, 0x8

    .line 182
    .line 183
    invoke-direct {p0, v2, p1}, La/kcf;-><init>(La/ybf;B)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 191
    .line 192
    const/16 v0, 0x22

    .line 193
    .line 194
    if-lt p1, v0, :cond_7

    .line 195
    .line 196
    invoke-static {p2}, La/r6;->c(Landroid/content/Intent;)La/g0u;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    goto :goto_1

    .line 201
    :cond_7
    const-string v4, "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE"

    .line 202
    .line 203
    invoke-virtual {p2, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    if-nez v4, :cond_8

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_8
    const-string v5, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE"

    .line 211
    .line 212
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    if-nez v5, :cond_9

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_9
    const-string v6, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA"

    .line 220
    .line 221
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    if-nez v4, :cond_a

    .line 226
    .line 227
    :goto_0
    move-object v4, v3

    .line 228
    goto :goto_1

    .line 229
    :cond_a
    new-instance v6, La/g0u;

    .line 230
    .line 231
    invoke-static {v4, v5}, La/gkb;->S(Landroid/os/Bundle;Ljava/lang/String;)La/c2;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-direct {v6, v4}, La/g0u;-><init>(La/c2;)V

    .line 236
    .line 237
    .line 238
    move-object v4, v6

    .line 239
    :goto_1
    if-eqz v4, :cond_c

    .line 240
    .line 241
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {p0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-eqz p0, :cond_b

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_b
    new-instance p0, La/oh60;

    .line 254
    .line 255
    const/16 p1, 0x10

    .line 256
    .line 257
    invoke-direct {p0, v2, v4, p1}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_c
    if-lt p1, v0, :cond_d

    .line 265
    .line 266
    invoke-static {p2}, La/r6;->b(Landroid/content/Intent;)La/e0u;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    goto :goto_2

    .line 271
    :cond_d
    sget p1, La/e0u;->a:I

    .line 272
    .line 273
    const-string p1, "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION"

    .line 274
    .line 275
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    if-nez p1, :cond_e

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_e
    const-string p2, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE"

    .line 283
    .line 284
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    if-eqz p2, :cond_10

    .line 289
    .line 290
    const-string v0, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"

    .line 291
    .line 292
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-static {p1, p2}, La/dub;->v0(Ljava/lang/CharSequence;Ljava/lang/String;)La/e0u;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    :goto_2
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {p0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    if-eqz p0, :cond_f

    .line 310
    .line 311
    :goto_3
    return-void

    .line 312
    :cond_f
    new-instance p0, La/stf0;

    .line 313
    .line 314
    const/4 p1, 0x1

    .line 315
    invoke-direct {p0, v2, v3, p1}, La/stf0;-><init>(La/ybf;La/e0u;B)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_10
    const-string p0, "Bundle was missing exception type."

    .line 323
    .line 324
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :cond_11
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v3

    .line 332
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v3

    .line 336
    :cond_13
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v3

    .line 340
    :cond_14
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v3
.end method
