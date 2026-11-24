.class public final Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "androidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1",
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
.field public final synthetic a:La/icf;


# direct methods
.method public constructor <init>(La/icf;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;->a:La/icf;

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
    new-instance v0, La/mhc;

    .line 5
    .line 6
    sget-object v2, La/ecf;->a:La/acf;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/16 v7, 0x10

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const-class v3, La/acf;

    .line 13
    .line 14
    const-string v4, "getCredentialExceptionTypeToException"

    .line 15
    .line 16
    const-string v5, "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;"

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;->a:La/icf;

    .line 22
    .line 23
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, La/icf;->d()La/ybf;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 32
    .line 33
    invoke-static {p2, v0, v1, v2, v3}, La/ecf;->b(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;La/ybf;Landroid/os/CancellationSignal;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_0
    const-string v0, "ACTIVITY_REQUEST_CODE"

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v1, "RESULT_DATA"

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Landroid/content/Intent;

    .line 54
    .line 55
    sget-boolean v1, La/ecf;->c:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_1

    .line 58
    .line 59
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p1, "Returned request code "

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, " which  does not match what was given "

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p1, "GetSignInIntent"

    .line 82
    .line 83
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    new-instance v0, La/ejd;

    .line 88
    .line 89
    const/16 v1, 0x16

    .line 90
    .line 91
    invoke-direct {v0, p0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 95
    .line 96
    const/4 v2, -0x1

    .line 97
    const/4 v3, 0x1

    .line 98
    const/4 v4, 0x3

    .line 99
    if-eq p1, v2, :cond_4

    .line 100
    .line 101
    new-instance v2, La/mie0;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v5, La/d0u;

    .line 107
    .line 108
    invoke-static {p1}, La/hkb;->C(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-direct {v5, v6, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 113
    .line 114
    .line 115
    iput-object v5, v2, La/mie0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    if-nez p1, :cond_2

    .line 118
    .line 119
    new-instance p1, La/b0u;

    .line 120
    .line 121
    const-string v5, "activity is cancelled by the user."

    .line 122
    .line 123
    invoke-direct {p1, v5}, La/b0u;-><init>(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    :cond_2
    new-instance p1, La/yw9;

    .line 129
    .line 130
    const/16 v5, 0x1d

    .line 131
    .line 132
    invoke-direct {p1, v0, v2, v5}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v1}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_3
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    :goto_0
    move p1, v3

    .line 151
    goto :goto_1

    .line 152
    :cond_4
    const/4 p1, 0x0

    .line 153
    :goto_1
    if-eqz p1, :cond_5

    .line 154
    .line 155
    goto/16 :goto_6

    .line 156
    .line 157
    :cond_5
    :try_start_0
    iget-object p1, p0, La/icf;->d:Landroid/content/Context;

    .line 158
    .line 159
    invoke-static {p1}, La/qxw;->F(Landroid/content/Context;)La/oaw0;

    .line 160
    .line 161
    .line 162
    invoke-static {p2}, La/oaw0;->c(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/identity/SignInCredential;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p0, p1}, La/icf;->c(Lcom/google/android/gms/auth/api/identity/SignInCredential;)La/g0u;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object p2, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 171
    .line 172
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {p2}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_6

    .line 182
    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_6
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    new-instance v0, La/a4e;

    .line 190
    .line 191
    const/16 v1, 0xa

    .line 192
    .line 193
    invoke-direct {v0, p0, p1, v1}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch La/qa3; {:try_start_0 .. :try_end_0} :catch_1
    .catch La/e0u; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    move-object p1, v0

    .line 202
    goto :goto_2

    .line 203
    :catch_0
    move-exception v0

    .line 204
    move-object p1, v0

    .line 205
    goto :goto_3

    .line 206
    :catch_1
    move-exception v0

    .line 207
    move-object p1, v0

    .line 208
    goto :goto_4

    .line 209
    :goto_2
    new-instance p2, La/d0u;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-direct {p2, p1, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 219
    .line 220
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {p1}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_7

    .line 230
    .line 231
    goto/16 :goto_6

    .line 232
    .line 233
    :cond_7
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance v0, La/a4e;

    .line 238
    .line 239
    const/16 v1, 0xc

    .line 240
    .line 241
    invoke-direct {v0, p0, p2, v1}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_6

    .line 248
    .line 249
    :goto_3
    iget-object p2, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 250
    .line 251
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {p2}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    if-eqz p2, :cond_8

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_8
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    new-instance v0, La/hcf;

    .line 268
    .line 269
    invoke-direct {v0, p0, p1, v3}, La/hcf;-><init>(La/icf;La/e0u;B)V

    .line 270
    .line 271
    .line 272
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :goto_4
    new-instance p2, La/mie0;

    .line 277
    .line 278
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    new-instance v0, La/d0u;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-direct {v0, v1, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 288
    .line 289
    .line 290
    iput-object v0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 291
    .line 292
    invoke-virtual {p1}, La/qa3;->getStatusCode()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    const/16 v1, 0x10

    .line 297
    .line 298
    if-ne v0, v1, :cond_9

    .line 299
    .line 300
    new-instance v0, La/b0u;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-direct {v0, p1}, La/b0u;-><init>(Ljava/lang/CharSequence;)V

    .line 307
    .line 308
    .line 309
    iput-object v0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    sget-object v0, La/ecf;->b:Ljava/util/Set;

    .line 313
    .line 314
    invoke-virtual {p1}, La/qa3;->getStatusCode()I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-eqz v0, :cond_a

    .line 327
    .line 328
    new-instance v0, La/d0u;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-direct {v0, p1, v3}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 335
    .line 336
    .line 337
    iput-object v0, p2, La/mie0;->a:Ljava/lang/Object;

    .line 338
    .line 339
    :cond_a
    :goto_5
    iget-object p1, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 340
    .line 341
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {p1}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    if-eqz p1, :cond_b

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_b
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    new-instance v0, La/a4e;

    .line 358
    .line 359
    const/16 v1, 0x9

    .line 360
    .line 361
    invoke-direct {v0, p0, p2, v1}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 362
    .line 363
    .line 364
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 365
    .line 366
    .line 367
    :goto_6
    return-void
.end method
