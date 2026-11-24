.class public final La/maw0;
.super La/f9w0;
.source "SourceFile"


# instance fields
.field public final synthetic b:B

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/RevocationBoundService;)V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, La/maw0;->b:B

    .line 23
    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, La/f9w0;-><init>(Ljava/lang/String;B)V

    .line 24
    iput-object p1, p0, La/maw0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/maw0;->b:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/maw0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, La/f9w0;-><init>(Ljava/lang/String;B)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iput-object p1, p0, La/maw0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback"

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, La/f9w0;-><init>(Ljava/lang/String;B)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final E(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 6

    .line 1
    iget-byte p3, p0, La/maw0;->b:B

    .line 2
    .line 3
    iget-object v0, p0, La/maw0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 11
    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, La/maw0;->G()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, La/bbw0;->t(Landroid/content/Context;)La/bbw0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, La/bbw0;->u()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, La/maw0;->G()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, La/xqm0;->a(Landroid/content/Context;)La/xqm0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, La/xqm0;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->k:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 44
    .line 45
    const/4 p3, 0x0

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    const-string p2, "defaultGoogleSignInAccount"

    .line 49
    .line 50
    invoke-virtual {p0, p2}, La/xqm0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const-string v3, "googleSignInOptions"

    .line 62
    .line 63
    invoke-static {v3, p2}, La/xqm0;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p0, p2}, La/xqm0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->m(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    move-object p2, p0

    .line 78
    goto :goto_1

    .line 79
    :catch_0
    :cond_3
    :goto_0
    move-object p2, p3

    .line 80
    :cond_4
    :goto_1
    new-instance p0, La/mmx;

    .line 81
    .line 82
    invoke-static {p2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, La/rek0;

    .line 86
    .line 87
    const/16 v4, 0x16

    .line 88
    .line 89
    invoke-direct {v3, v4}, La/rek0;-><init>(B)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    new-instance v5, La/mav;

    .line 97
    .line 98
    invoke-direct {v5, v3, v4}, La/mav;-><init>(La/rek0;Landroid/os/Looper;)V

    .line 99
    .line 100
    .line 101
    sget-object v3, La/q44;->a:La/yzn0;

    .line 102
    .line 103
    invoke-direct {p0, v0, v3, p2, v5}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 104
    .line 105
    .line 106
    const/16 p2, 0x15

    .line 107
    .line 108
    const/4 v0, 0x3

    .line 109
    iget-object v3, p0, La/nav;->a:Landroid/content/Context;

    .line 110
    .line 111
    iget-object v4, p0, La/nav;->i:La/j9w0;

    .line 112
    .line 113
    if-eqz p1, :cond_9

    .line 114
    .line 115
    invoke-virtual {p0}, La/mmx;->d()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-ne p0, v0, :cond_5

    .line 120
    .line 121
    move p0, v1

    .line 122
    goto :goto_2

    .line 123
    :cond_5
    move p0, v2

    .line 124
    :goto_2
    sget-object p1, La/abw0;->a:La/zz2;

    .line 125
    .line 126
    new-array v2, v2, [Ljava/lang/Object;

    .line 127
    .line 128
    iget v5, p1, La/zz2;->a:I

    .line 129
    .line 130
    if-gt v5, v0, :cond_6

    .line 131
    .line 132
    iget-object v0, p1, La/zz2;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/lang/String;

    .line 135
    .line 136
    const-string v5, "Revoking access"

    .line 137
    .line 138
    invoke-virtual {p1, v5, v2}, La/zz2;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-static {v3}, La/xqm0;->a(Landroid/content/Context;)La/xqm0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string v0, "refreshToken"

    .line 150
    .line 151
    invoke-virtual {p1, v0}, La/xqm0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v3}, La/abw0;->a(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    if-eqz p0, :cond_8

    .line 159
    .line 160
    if-nez p1, :cond_7

    .line 161
    .line 162
    sget-object p0, La/raw0;->c:La/zz2;

    .line 163
    .line 164
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 165
    .line 166
    const/4 p1, 0x4

    .line 167
    invoke-direct {p0, p1, p3, p3, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->m()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    xor-int/2addr p1, v1

    .line 175
    const-string p3, "Status code must not be SUCCESS"

    .line 176
    .line 177
    invoke-static {p3, p1}, La/s0x;->B(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/t9w0;

    .line 181
    .line 182
    invoke-direct {p1, p0}, La/t9w0;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(La/m0g0;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    new-instance p0, La/raw0;

    .line 190
    .line 191
    invoke-direct {p0, p1}, La/raw0;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance p1, Ljava/lang/Thread;

    .line 195
    .line 196
    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, La/raw0;->b:La/com0;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_8
    new-instance p1, La/zaw0;

    .line 206
    .line 207
    invoke-direct {p1, v4, v1}, La/zaw0;-><init>(La/j9w0;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, p1}, La/j9w0;->a(La/zaw0;)La/zaw0;

    .line 211
    .line 212
    .line 213
    :goto_3
    new-instance p0, La/svs0;

    .line 214
    .line 215
    invoke-direct {p0, p2}, La/svs0;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 219
    .line 220
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance p3, La/law0;

    .line 224
    .line 225
    invoke-direct {p3, p1, p2, p0}, La/law0;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lcom/google/android/gms/tasks/TaskCompletionSource;La/svs0;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(La/law0;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_9
    invoke-virtual {p0}, La/mmx;->d()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    if-ne p0, v0, :cond_a

    .line 240
    .line 241
    move p0, v1

    .line 242
    goto :goto_4

    .line 243
    :cond_a
    move p0, v2

    .line 244
    :goto_4
    sget-object p1, La/abw0;->a:La/zz2;

    .line 245
    .line 246
    new-array p3, v2, [Ljava/lang/Object;

    .line 247
    .line 248
    iget v5, p1, La/zz2;->a:I

    .line 249
    .line 250
    if-gt v5, v0, :cond_b

    .line 251
    .line 252
    iget-object v0, p1, La/zz2;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Ljava/lang/String;

    .line 255
    .line 256
    const-string v5, "Signing out"

    .line 257
    .line 258
    invoke-virtual {p1, v5, p3}, La/zz2;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-static {v3}, La/abw0;->a(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    if-eqz p0, :cond_c

    .line 269
    .line 270
    new-instance p0, La/com0;

    .line 271
    .line 272
    invoke-direct {p0, v4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(La/j9w0;)V

    .line 273
    .line 274
    .line 275
    sget-object p1, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 276
    .line 277
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(La/m0g0;)V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_c
    new-instance p0, La/zaw0;

    .line 282
    .line 283
    invoke-direct {p0, v4, v2}, La/zaw0;-><init>(La/j9w0;B)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, p0}, La/j9w0;->a(La/zaw0;)La/zaw0;

    .line 287
    .line 288
    .line 289
    :goto_5
    new-instance p1, La/svs0;

    .line 290
    .line 291
    invoke-direct {p1, p2}, La/svs0;-><init>(B)V

    .line 292
    .line 293
    .line 294
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 295
    .line 296
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 297
    .line 298
    .line 299
    new-instance p3, La/law0;

    .line 300
    .line 301
    invoke-direct {p3, p0, p2, p1}, La/law0;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lcom/google/android/gms/tasks/TaskCompletionSource;La/svs0;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(La/law0;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 308
    .line 309
    .line 310
    :goto_6
    return v1

    .line 311
    :pswitch_0
    if-ne p1, v1, :cond_d

    .line 312
    .line 313
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 314
    .line 315
    invoke-static {p2, p0}, La/taw0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 320
    .line 321
    sget-object p1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 322
    .line 323
    invoke-static {p2, p1}, La/taw0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    check-cast p1, Landroid/app/PendingIntent;

    .line 328
    .line 329
    invoke-static {p2}, La/taw0;->b(Landroid/os/Parcel;)V

    .line 330
    .line 331
    .line 332
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 333
    .line 334
    invoke-static {p0, p1, v0}, La/dqm0;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_d
    move v1, v2

    .line 339
    :goto_7
    return v1

    .line 340
    :pswitch_1
    if-ne p1, v1, :cond_e

    .line 341
    .line 342
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 343
    .line 344
    invoke-static {p2, p0}, La/taw0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 349
    .line 350
    sget-object p1, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 351
    .line 352
    invoke-static {p2, p1}, La/taw0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    check-cast p1, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 357
    .line 358
    invoke-static {p2}, La/taw0;->b(Landroid/os/Parcel;)V

    .line 359
    .line 360
    .line 361
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 362
    .line 363
    invoke-static {p0, p1, v0}, La/dqm0;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 364
    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_e
    move v1, v2

    .line 368
    :goto_8
    return v1

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public G()V
    .locals 3

    .line 1
    iget-object p0, p0, La/maw0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0, p0}, La/bcm0;->q(ILandroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/SecurityException;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "Calling UID "

    .line 23
    .line 24
    const-string v2, " is not Google Play services."

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method
