.class public Lcom/google/firebase/messaging/FirebaseMessagingService;
.super La/vyn;
.source "SourceFile"


# static fields
.field public static final ACTION_DIRECT_BOOT_REMOTE_INTENT:Ljava/lang/String; = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

.field static final ACTION_FCM_REGISTERED:Ljava/lang/String; = "com.google.firebase.messaging.FCM_REGISTERED"

.field static final ACTION_FCM_UNREGISTERED:Ljava/lang/String; = "com.google.firebase.messaging.FCM_UNREGISTERED"

.field static final ACTION_NEW_TOKEN:Ljava/lang/String; = "com.google.firebase.messaging.NEW_TOKEN"

.field static final ACTION_REMOTE_INTENT:Ljava/lang/String; = "com.google.android.c2dm.intent.RECEIVE"

.field static final EXTRA_TOKEN:Ljava/lang/String; = "token"

.field private static final RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE:I = 0xa

.field private static final recentlyReceivedMessageIds:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private rpc:La/cig0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->recentlyReceivedMessageIds:Ljava/util/Queue;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/vyn;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static resetForTesting()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->recentlyReceivedMessageIds:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getStartCommandIntent(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {}, La/mii0;->u()La/mii0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/mii0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/content/Intent;

    .line 14
    .line 15
    return-object p0
.end method

.method public handleIntent(Landroid/content/Intent;)V
    .locals 8

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    const-string v1, "token"

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "com.google.android.c2dm.intent.RECEIVE"

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_4

    .line 16
    .line 17
    const-string v3, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v3, "com.google.firebase.messaging.NEW_TOKEN"

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onNewToken(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string v3, "com.google.firebase.messaging.FCM_REGISTERED"

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onRegistered(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    const-string v3, "com.google.firebase.messaging.FCM_UNREGISTERED"

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onUnregistered(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, "Unknown intent action: "

    .line 77
    .line 78
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    :goto_0
    const-string v1, "google.message_id"

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/4 v4, 0x3

    .line 107
    const/4 v5, 0x0

    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    sget-object v3, Lcom/google/firebase/messaging/FirebaseMessagingService;->recentlyReceivedMessageIds:Ljava/util/Queue;

    .line 112
    .line 113
    invoke-interface {v3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_6

    .line 118
    .line 119
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_12

    .line 124
    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v6, "Received duplicate message: "

    .line 128
    .line 129
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_6
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    const/16 v7, 0xa

    .line 149
    .line 150
    if-lt v6, v7, :cond_7

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_7
    invoke-interface {v3, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :goto_1
    const-string v2, "message_type"

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-nez v2, :cond_8

    .line 165
    .line 166
    const-string v2, "gcm"

    .line 167
    .line 168
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    const/4 v6, -0x1

    .line 173
    sparse-switch v3, :sswitch_data_0

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :sswitch_0
    const-string v3, "send_event"

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-nez v3, :cond_9

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_9
    move v6, v4

    .line 187
    goto :goto_2

    .line 188
    :sswitch_1
    const-string v3, "send_error"

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-nez v3, :cond_a

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_a
    const/4 v6, 0x2

    .line 198
    goto :goto_2

    .line 199
    :sswitch_2
    const-string v3, "gcm"

    .line 200
    .line 201
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_b

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_b
    const/4 v6, 0x1

    .line 209
    goto :goto_2

    .line 210
    :sswitch_3
    const-string v3, "deleted_messages"

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-nez v3, :cond_c

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_c
    move v6, v5

    .line 220
    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 221
    .line 222
    .line 223
    const-string v3, "Received message with unknown type: "

    .line 224
    .line 225
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :pswitch_0
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onMessageSent(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_5

    .line 242
    .line 243
    :pswitch_1
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-nez v0, :cond_d

    .line 248
    .line 249
    const-string v0, "message_id"

    .line 250
    .line 251
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    :cond_d
    new-instance v2, La/c44;

    .line 256
    .line 257
    const-string v3, "error"

    .line 258
    .line 259
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    const/16 v6, 0xc

    .line 264
    .line 265
    invoke-direct {v2, v3, v6}, La/c44;-><init>(Ljava/lang/String;B)V

    .line 266
    .line 267
    .line 268
    if-nez v3, :cond_e

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_e
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 272
    .line 273
    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    :goto_3
    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onSendError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :pswitch_2
    invoke-static {p1}, La/x0x;->X(Landroid/content/Intent;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-nez v0, :cond_f

    .line 292
    .line 293
    new-instance v0, Landroid/os/Bundle;

    .line 294
    .line 295
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 296
    .line 297
    .line 298
    :cond_f
    const-string v2, "androidx.content.wakelockid"

    .line 299
    .line 300
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v0}, La/pyu;->l(Landroid/os/Bundle;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_11

    .line 308
    .line 309
    new-instance v2, La/pyu;

    .line 310
    .line 311
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    new-instance v3, Landroid/os/Bundle;

    .line 315
    .line 316
    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 317
    .line 318
    .line 319
    iput-object v3, v2, La/pyu;->a:Ljava/lang/Object;

    .line 320
    .line 321
    new-instance v3, La/n950;

    .line 322
    .line 323
    const-string v6, "Firebase-Messaging-Network-Io"

    .line 324
    .line 325
    invoke-direct {v3, v6}, La/n950;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    new-instance v6, La/khf0;

    .line 333
    .line 334
    invoke-direct {v6, p0, v2, v3}, La/khf0;-><init>(Lcom/google/firebase/messaging/FirebaseMessagingService;La/pyu;Ljava/util/concurrent/ExecutorService;)V

    .line 335
    .line 336
    .line 337
    :try_start_0
    invoke-virtual {v6}, La/khf0;->x()Z

    .line 338
    .line 339
    .line 340
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    if-eqz v2, :cond_10

    .line 342
    .line 343
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_10
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 348
    .line 349
    .line 350
    invoke-static {p1}, La/x0x;->d0(Landroid/content/Intent;)Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-eqz v2, :cond_11

    .line 355
    .line 356
    const-string v2, "_nf"

    .line 357
    .line 358
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static {v3, v2}, La/x0x;->Y(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :catchall_0
    move-exception p0

    .line 367
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 368
    .line 369
    .line 370
    throw p0

    .line 371
    :cond_11
    :goto_4
    new-instance v2, Lcom/google/firebase/messaging/RemoteMessage;

    .line 372
    .line 373
    invoke-direct {v2, v0}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, v2}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V

    .line 377
    .line 378
    .line 379
    goto :goto_5

    .line 380
    :pswitch_3
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onDeletedMessages()V

    .line 381
    .line 382
    .line 383
    :cond_12
    :goto_5
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->rpc:La/cig0;

    .line 384
    .line 385
    if-nez v0, :cond_13

    .line 386
    .line 387
    new-instance v0, La/cig0;

    .line 388
    .line 389
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-direct {v0, v2}, La/cig0;-><init>(Landroid/content/Context;)V

    .line 394
    .line 395
    .line 396
    iput-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->rpc:La/cig0;

    .line 397
    .line 398
    :cond_13
    iget-object p0, v0, La/cig0;->c:La/cf60;

    .line 399
    .line 400
    invoke-virtual {p0}, La/cf60;->t()I

    .line 401
    .line 402
    .line 403
    move-result p0

    .line 404
    const v2, 0xdedfaa0

    .line 405
    .line 406
    .line 407
    if-lt p0, v2, :cond_17

    .line 408
    .line 409
    new-instance p0, Landroid/os/Bundle;

    .line 410
    .line 411
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 412
    .line 413
    .line 414
    const-string v2, "google.message_id"

    .line 415
    .line 416
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    if-nez v2, :cond_14

    .line 421
    .line 422
    const-string v2, "message_id"

    .line 423
    .line 424
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    :cond_14
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    const-string v1, "google.product_id"

    .line 432
    .line 433
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    if-eqz v2, :cond_15

    .line 438
    .line 439
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    goto :goto_6

    .line 448
    :cond_15
    const/4 p1, 0x0

    .line 449
    :goto_6
    if-eqz p1, :cond_16

    .line 450
    .line 451
    const-string v1, "google.product_id"

    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    invoke-virtual {p0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 458
    .line 459
    .line 460
    :cond_16
    iget-object p1, v0, La/cig0;->b:Landroid/content/Context;

    .line 461
    .line 462
    invoke-static {p1}, La/sbx0;->m(Landroid/content/Context;)La/sbx0;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    new-instance v0, La/f8x0;

    .line 467
    .line 468
    monitor-enter p1

    .line 469
    :try_start_1
    iget v1, p1, La/sbx0;->b:I

    .line 470
    .line 471
    add-int/lit8 v2, v1, 0x1

    .line 472
    .line 473
    iput v2, p1, La/sbx0;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 474
    .line 475
    monitor-exit p1

    .line 476
    invoke-direct {v0, v1, v4, p0, v5}, La/f8x0;-><init>(IILandroid/os/Bundle;B)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1, v0}, La/sbx0;->n(La/f8x0;)Lcom/google/android/gms/tasks/Task;

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :catchall_1
    move-exception p0

    .line 484
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 485
    throw p0

    .line 486
    :cond_17
    new-instance p0, Ljava/io/IOException;

    .line 487
    .line 488
    const-string p1, "SERVICE_NOT_AVAILABLE"

    .line 489
    .line 490
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :sswitch_data_0
    .sparse-switch
        -0x7aedf14e -> :sswitch_3
        0x18f11 -> :sswitch_2
        0x308f3e91 -> :sswitch_1
        0x3090df23 -> :sswitch_0
    .end sparse-switch

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onDeletedMessages()V
    .locals 0

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 0

    return-void
.end method

.method public onMessageSent(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onRegistered(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onSendError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onUnregistered(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setRpcForTesting(La/cig0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->rpc:La/cig0;

    .line 2
    .line 3
    return-void
.end method
