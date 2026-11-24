.class public final La/xn;
.super La/bsr0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/xn;->h:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 10

    .line 1
    iget-byte p0, p0, La/xn;->h:B

    .line 2
    .line 3
    const-string v0, "android.intent.extra.MIME_TYPES"

    .line 4
    .line 5
    const-string v1, "*/*"

    .line 6
    .line 7
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 8
    .line 9
    const-string v3, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 10
    .line 11
    const-string v4, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const-string v6, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const-string v8, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast p2, Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 p2, 0x1a

    .line 31
    .line 32
    const-string v0, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 33
    .line 34
    if-lt p0, p2, :cond_0

    .line 35
    .line 36
    new-instance p0, Landroid/content/Intent;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p2, "android.provider.extra.APP_PACKAGE"

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string p2, "app_package"

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 73
    .line 74
    const-string p2, "app_uid"

    .line 75
    .line 76
    invoke-virtual {p0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    :goto_0
    return-object p0

    .line 80
    :pswitch_0
    check-cast p2, Landroidx/activity/result/IntentSenderRequest;

    .line 81
    .line 82
    new-instance p0, Landroid/content/Intent;

    .line 83
    .line 84
    invoke-direct {p0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p2, Landroidx/activity/result/IntentSenderRequest;->b:Landroid/content/Intent;

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    const-string v0, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 106
    .line 107
    invoke-virtual {p1, v0, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    iget-object p1, p2, Landroidx/activity/result/IntentSenderRequest;->a:Landroid/content/IntentSender;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget v0, p2, Landroidx/activity/result/IntentSenderRequest;->d:I

    .line 119
    .line 120
    iget p2, p2, Landroidx/activity/result/IntentSenderRequest;->c:I

    .line 121
    .line 122
    new-instance v1, Landroidx/activity/result/IntentSenderRequest;

    .line 123
    .line 124
    invoke-direct {v1, p1, v9, p2, v0}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 125
    .line 126
    .line 127
    move-object p2, v1

    .line 128
    :cond_1
    invoke-virtual {p0, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    invoke-static {v5}, Landroidx/fragment/app/e;->V(I)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_2

    .line 136
    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string p2, "CreateIntent created the following intent: "

    .line 140
    .line 141
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-string p2, "FragmentManager"

    .line 152
    .line 153
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_2
    return-object p0

    .line 157
    :pswitch_1
    check-cast p2, Landroidx/activity/result/IntentSenderRequest;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p0, Landroid/content/Intent;

    .line 163
    .line 164
    invoke-direct {p0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_2
    check-cast p2, Landroid/content/Intent;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    return-object p2

    .line 181
    :pswitch_3
    check-cast p2, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    filled-new-array {p2}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance p1, Landroid/content/Intent;

    .line 191
    .line 192
    invoke-direct {p1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_4
    check-cast p2, [Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    new-instance p0, Landroid/content/Intent;

    .line 209
    .line 210
    invoke-direct {p0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_5
    check-cast p2, La/kn90;

    .line 222
    .line 223
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 227
    .line 228
    const/16 v3, 0x21

    .line 229
    .line 230
    const/16 v4, 0xa

    .line 231
    .line 232
    const/4 v6, 0x1

    .line 233
    if-lt p0, v3, :cond_3

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_3
    const/16 v3, 0x1e

    .line 237
    .line 238
    if-lt p0, v3, :cond_5

    .line 239
    .line 240
    invoke-static {}, La/a7;->a()I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    if-lt p0, v5, :cond_5

    .line 245
    .line 246
    :goto_1
    new-instance p0, Landroid/content/Intent;

    .line 247
    .line 248
    const-string p1, "android.provider.action.PICK_IMAGES"

    .line 249
    .line 250
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p2, La/kn90;->a:La/ao;

    .line 254
    .line 255
    invoke-static {p1}, La/rsr0;->Y(La/ao;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 260
    .line 261
    .line 262
    iget p1, p2, La/kn90;->b:I

    .line 263
    .line 264
    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-le p1, v6, :cond_4

    .line 269
    .line 270
    invoke-static {}, La/c7;->b()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-gt p1, v0, :cond_4

    .line 275
    .line 276
    const-string v0, "android.provider.extra.PICK_IMAGES_MAX"

    .line 277
    .line 278
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 279
    .line 280
    .line 281
    iget-object p1, p2, La/kn90;->c:La/lwf;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    const-string p1, "android.provider.extra.PICK_IMAGES_LAUNCH_TAB"

    .line 287
    .line 288
    invoke-virtual {p0, p1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 289
    .line 290
    .line 291
    const-string p1, "android.provider.extra.PICK_IMAGES_IN_ORDER"

    .line 292
    .line 293
    invoke-virtual {p0, p1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 294
    .line 295
    .line 296
    move-object v9, p0

    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :cond_4
    const-string p0, "Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()"

    .line 300
    .line 301
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_2

    .line 305
    .line 306
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    new-instance v3, Landroid/content/Intent;

    .line 311
    .line 312
    const-string v5, "androidx.activity.result.contract.action.PICK_IMAGES"

    .line 313
    .line 314
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/high16 v8, 0x110000

    .line 318
    .line 319
    invoke-virtual {p0, v3, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    if-eqz p0, :cond_8

    .line 324
    .line 325
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    new-instance p1, Landroid/content/Intent;

    .line 330
    .line 331
    invoke-direct {p1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0, p1, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    if-eqz p0, :cond_7

    .line 339
    .line 340
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 341
    .line 342
    new-instance p1, Landroid/content/Intent;

    .line 343
    .line 344
    invoke-direct {p1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-object v0, p0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 348
    .line 349
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 350
    .line 351
    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {p1, v0, p0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 354
    .line 355
    .line 356
    iget-object p0, p2, La/kn90;->a:La/ao;

    .line 357
    .line 358
    invoke-static {p0}, La/rsr0;->Y(La/ao;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-virtual {p1, p0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 363
    .line 364
    .line 365
    iget p0, p2, La/kn90;->b:I

    .line 366
    .line 367
    invoke-static {v4, p0}, Ljava/lang/Math;->min(II)I

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    if-le p0, v6, :cond_6

    .line 372
    .line 373
    const-string v0, "androidx.activity.result.contract.extra.PICK_IMAGES_MAX"

    .line 374
    .line 375
    invoke-virtual {p1, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 376
    .line 377
    .line 378
    iget-object p0, p2, La/kn90;->c:La/lwf;

    .line 379
    .line 380
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    const-string p0, "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB"

    .line 384
    .line 385
    invoke-virtual {p1, p0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 386
    .line 387
    .line 388
    const-string p0, "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER"

    .line 389
    .line 390
    invoke-virtual {p1, p0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    move-object v9, p1

    .line 394
    goto :goto_2

    .line 395
    :cond_6
    const-string p0, "Max items must be greater than 1"

    .line 396
    .line 397
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_7
    const-string p0, "Required value was null."

    .line 402
    .line 403
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    goto :goto_2

    .line 407
    :cond_8
    new-instance v9, Landroid/content/Intent;

    .line 408
    .line 409
    invoke-direct {v9, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-object p0, p2, La/kn90;->a:La/ao;

    .line 413
    .line 414
    invoke-static {p0}, La/rsr0;->Y(La/ao;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    invoke-virtual {v9, p0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    .line 420
    .line 421
    const-string p0, "android.intent.extra.ALLOW_MULTIPLE"

    .line 422
    .line 423
    invoke-virtual {v9, p0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v9}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    if-nez p0, :cond_9

    .line 431
    .line 432
    invoke-virtual {v9, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    const-string p0, "image/*"

    .line 436
    .line 437
    const-string p1, "video/*"

    .line 438
    .line 439
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    invoke-virtual {v9, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 444
    .line 445
    .line 446
    :cond_9
    :goto_2
    return-object v9

    .line 447
    :pswitch_6
    check-cast p2, [Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    new-instance p0, Landroid/content/Intent;

    .line 453
    .line 454
    invoke-direct {p0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-virtual {p0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    return-object p0

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b0(Landroid/content/Context;Ljava/lang/Object;)La/r7v;
    .locals 4

    .line 1
    iget-byte v0, p0, La/xn;->h:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, La/bsr0;->b0(Landroid/content/Context;Ljava/lang/Object;)La/r7v;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :pswitch_0
    check-cast p2, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    new-instance v1, La/r7v;

    .line 24
    .line 25
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-direct {v1, p0}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object v1

    .line 31
    :pswitch_1
    check-cast p2, [Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length p0, p2

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    new-instance v1, La/r7v;

    .line 40
    .line 41
    sget-object p0, La/lun;->a:La/lun;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p0}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    array-length p0, p2

    .line 51
    const/4 v0, 0x0

    .line 52
    move v2, v0

    .line 53
    :goto_0
    if-ge v2, p0, :cond_2

    .line 54
    .line 55
    aget-object v3, p2, v2

    .line 56
    .line 57
    invoke-static {p1, v3}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    array-length p0, p2

    .line 67
    invoke-static {p0}, La/wp20;->a(I)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    const/16 p1, 0x10

    .line 72
    .line 73
    if-ge p0, p1, :cond_3

    .line 74
    .line 75
    move p0, p1

    .line 76
    :cond_3
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-direct {p1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 79
    .line 80
    .line 81
    array-length p0, p2

    .line 82
    :goto_1
    if-ge v0, p0, :cond_4

    .line 83
    .line 84
    aget-object v1, p2, v0

    .line 85
    .line 86
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    new-instance v1, La/r7v;

    .line 95
    .line 96
    invoke-direct {v1, p1}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_2
    return-object v1

    .line 100
    :pswitch_2
    check-cast p2, La/kn90;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :pswitch_3
    check-cast p2, [Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i0(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p0, p0, La/xn;->h:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance p0, Landroidx/activity/result/ActivityResult;

    .line 16
    .line 17
    invoke-direct {p0, p1, p2}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    new-instance p0, Landroidx/activity/result/ActivityResult;

    .line 22
    .line 23
    invoke-direct {p0, p1, p2}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_2
    new-instance p0, Landroidx/activity/result/ActivityResult;

    .line 28
    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_3
    if-eqz p2, :cond_3

    .line 34
    .line 35
    if-eq p1, v4, :cond_0

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    array-length p1, p0

    .line 45
    move p2, v2

    .line 46
    :goto_0
    if-ge p2, p1, :cond_2

    .line 47
    .line 48
    aget v0, p0, p2

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    :goto_3
    return-object p0

    .line 65
    :pswitch_4
    if-eq p1, v4, :cond_4

    .line 66
    .line 67
    sget-object p0, La/lun;->a:La/lun;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_7

    .line 73
    :cond_4
    if-nez p2, :cond_5

    .line 74
    .line 75
    sget-object p0, La/lun;->a:La/lun;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    goto :goto_7

    .line 81
    :cond_5
    const-string p0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 82
    .line 83
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_9

    .line 92
    .line 93
    if-nez p0, :cond_6

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    .line 97
    .line 98
    array-length v0, p1

    .line 99
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    array-length v0, p1

    .line 103
    move v1, v2

    .line 104
    :goto_4
    if-ge v1, v0, :cond_8

    .line 105
    .line 106
    aget v4, p1, v1

    .line 107
    .line 108
    if-nez v4, :cond_7

    .line 109
    .line 110
    move v4, v3

    .line 111
    goto :goto_5

    .line 112
    :cond_7
    move v4, v2

    .line 113
    :goto_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    invoke-static {p0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0, p2}, Lkotlin/collections/CollectionsKt;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    goto :goto_7

    .line 136
    :cond_9
    :goto_6
    sget-object p0, La/lun;->a:La/lun;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    :goto_7
    return-object p0

    .line 142
    :pswitch_5
    if-ne p1, v4, :cond_a

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_a
    move-object p2, v0

    .line 146
    :goto_8
    if-eqz p2, :cond_f

    .line 147
    .line 148
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 149
    .line 150
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_b

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_b
    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-nez p1, :cond_c

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_c

    .line 173
    .line 174
    sget-object p0, La/iun;->a:La/iun;

    .line 175
    .line 176
    goto :goto_a

    .line 177
    :cond_c
    if-eqz p1, :cond_e

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    :goto_9
    if-ge v2, p2, :cond_e

    .line 184
    .line 185
    invoke-virtual {p1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 204
    .line 205
    .line 206
    move-object p0, p1

    .line 207
    :goto_a
    if-nez p0, :cond_10

    .line 208
    .line 209
    :cond_f
    sget-object p0, La/iun;->a:La/iun;

    .line 210
    .line 211
    :cond_10
    return-object p0

    .line 212
    :pswitch_6
    if-ne p1, v4, :cond_11

    .line 213
    .line 214
    goto :goto_b

    .line 215
    :cond_11
    move-object p2, v0

    .line 216
    :goto_b
    if-eqz p2, :cond_12

    .line 217
    .line 218
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :cond_12
    return-object v0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
