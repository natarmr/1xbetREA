.class public final Lcom/yandex/authsdk/internal/AuthSdkActivity;
.super La/yc3;
.source "SourceFile"


# static fields
.field public static final synthetic Z:I


# instance fields
.field public B:La/vw00;

.field public Y:Lcom/yandex/authsdk/YandexAuthOptions;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/yc3;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/kxq;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v3, La/k2w0;

    .line 14
    .line 15
    const-string v4, "com.yandex.authsdk.EXTRA_OPTIONS"

    .line 16
    .line 17
    const-class v5, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 18
    .line 19
    invoke-static {v0, v4, v5}, La/x2x;->U(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v4, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 27
    .line 28
    const-string v5, "com.yandex.authsdk.EXTRA_LOGIN_OPTIONS"

    .line 29
    .line 30
    const-class v6, Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 31
    .line 32
    invoke-static {v0, v5, v6}, La/x2x;->U(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v5, Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 40
    .line 41
    const-string v6, "com.yandex.authsdk.EXTRA_STATE"

    .line 42
    .line 43
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, v4, v5, v0}, La/k2w0;-><init>(Lcom/yandex/authsdk/YandexAuthOptions;Lcom/yandex/authsdk/YandexAuthLoginOptions;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v4, v1, Lcom/yandex/authsdk/internal/AuthSdkActivity;->Y:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v7, La/ouu;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v0, v8, v4}, La/ouu;-><init>(Ljava/lang/String;Landroid/content/pm/PackageManager;Lcom/yandex/authsdk/YandexAuthOptions;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v7, La/ouu;->c:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v4, v0

    .line 84
    check-cast v4, Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    sget-object v0, La/vw00;->b:La/vw00;

    .line 87
    .line 88
    sget-object v8, La/vw00;->c:La/vw00;

    .line 89
    .line 90
    sget-object v9, La/vw00;->a:La/vw00;

    .line 91
    .line 92
    filled-new-array {v9, v0, v8}, [La/vw00;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v5, v5, Lcom/yandex/authsdk/YandexAuthLoginOptions;->a:La/vw00;

    .line 101
    .line 102
    invoke-interface {v0, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const/4 v10, -0x1

    .line 111
    if-eq v5, v10, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const/4 v8, 0x0

    .line 115
    :goto_0
    if-eqz v8, :cond_1

    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    goto :goto_1

    .line 122
    :cond_1
    const/4 v8, 0x0

    .line 123
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    invoke-interface {v0, v8, v11}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_1e

    .line 140
    .line 141
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, La/vw00;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const/16 v11, 0x21

    .line 152
    .line 153
    if-eqz v0, :cond_d

    .line 154
    .line 155
    const/4 v12, 0x1

    .line 156
    const/4 v13, 0x2

    .line 157
    if-eq v0, v12, :cond_3

    .line 158
    .line 159
    if-ne v0, v13, :cond_2

    .line 160
    .line 161
    new-instance v0, La/f5v0;

    .line 162
    .line 163
    invoke-direct {v0}, La/f5v0;-><init>()V

    .line 164
    .line 165
    .line 166
    move-object/from16 v17, v6

    .line 167
    .line 168
    move-object/from16 v18, v7

    .line 169
    .line 170
    move-object/from16 v19, v8

    .line 171
    .line 172
    :goto_3
    const/16 v16, 0x0

    .line 173
    .line 174
    goto/16 :goto_13

    .line 175
    .line 176
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_3
    iget-object v0, v3, La/k2w0;->a:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 181
    .line 182
    iget-boolean v12, v0, Lcom/yandex/authsdk/YandexAuthOptions;->d:Z

    .line 183
    .line 184
    if-eqz v12, :cond_4

    .line 185
    .line 186
    move-object/from16 v17, v6

    .line 187
    .line 188
    move-object/from16 v18, v7

    .line 189
    .line 190
    move-object/from16 v19, v8

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    goto :goto_3

    .line 194
    :cond_4
    sget-object v12, La/xic;->d:Ljava/util/Set;

    .line 195
    .line 196
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    const-string v14, "https://ya.ru"

    .line 201
    .line 202
    invoke-static {v14}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    new-instance v15, Landroid/content/Intent;

    .line 207
    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    const-string v9, "android.intent.action.VIEW"

    .line 211
    .line 212
    invoke-direct {v15, v9, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {v12, v15}, La/wwb;->N(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    new-instance v14, Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_8

    .line 236
    .line 237
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v15

    .line 241
    move-object v10, v15

    .line 242
    check-cast v10, Landroid/content/pm/ResolveInfo;

    .line 243
    .line 244
    iget-object v10, v10, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 245
    .line 246
    iget-object v10, v10, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 247
    .line 248
    sget-object v13, La/xic;->d:Ljava/util/Set;

    .line 249
    .line 250
    invoke-interface {v13, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-nez v13, :cond_5

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    goto :goto_6

    .line 258
    :cond_5
    new-instance v13, Landroid/content/Intent;

    .line 259
    .line 260
    invoke-direct {v13}, Landroid/content/Intent;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v5, "android.support.customtabs.action.CustomTabsService"

    .line 264
    .line 265
    invoke-virtual {v13, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 269
    .line 270
    .line 271
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 272
    .line 273
    if-lt v5, v11, :cond_6

    .line 274
    .line 275
    invoke-static {}, La/uq6;->p()Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {v12, v13, v5}, La/uq6;->q(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Landroid/content/pm/ResolveInfo;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    move-object v10, v5

    .line 284
    const/4 v5, 0x0

    .line 285
    goto :goto_5

    .line 286
    :cond_6
    const/4 v5, 0x0

    .line 287
    invoke-virtual {v12, v13, v5}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    :goto_5
    if-eqz v10, :cond_7

    .line 292
    .line 293
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    :cond_7
    :goto_6
    const/4 v10, -0x1

    .line 297
    const/4 v13, 0x2

    .line 298
    goto :goto_4

    .line 299
    :cond_8
    const/4 v5, 0x0

    .line 300
    invoke-static {v5, v14}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 305
    .line 306
    if-eqz v9, :cond_9

    .line 307
    .line 308
    iget-object v5, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 309
    .line 310
    if-eqz v5, :cond_9

    .line 311
    .line 312
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_9
    move-object/from16 v5, v16

    .line 316
    .line 317
    :goto_7
    if-eqz v5, :cond_b

    .line 318
    .line 319
    new-instance v9, La/xic;

    .line 320
    .line 321
    invoke-direct {v9, v5}, La/xic;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v5, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v10, "yx"

    .line 327
    .line 328
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object v10, v0, Lcom/yandex/authsdk/YandexAuthOptions;->a:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v10, 0x2e

    .line 337
    .line 338
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    iget-object v0, v0, Lcom/yandex/authsdk/YandexAuthOptions;->c:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 351
    .line 352
    const/16 v10, 0x1f

    .line 353
    .line 354
    if-lt v5, v10, :cond_c

    .line 355
    .line 356
    :try_start_0
    invoke-static {}, La/kn4;->D()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-virtual {v6, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-static {v5}, La/kn4;->d(Ljava/lang/Object;)Landroid/content/pm/verify/domain/DomainVerificationManager;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    if-eqz v5, :cond_b

    .line 369
    .line 370
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    invoke-static {v5, v10}, La/kn4;->e(Landroid/content/pm/verify/domain/DomainVerificationManager;Ljava/lang/String;)Landroid/content/pm/verify/domain/DomainVerificationUserState;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    if-eqz v5, :cond_b

    .line 379
    .line 380
    invoke-static {v5}, La/kn4;->y(Landroid/content/pm/verify/domain/DomainVerificationUserState;)Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-eqz v10, :cond_b

    .line 385
    .line 386
    invoke-static {v5}, La/kn4;->q(Landroid/content/pm/verify/domain/DomainVerificationUserState;)Ljava/util/Map;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, Ljava/lang/Integer;

    .line 395
    .line 396
    if-nez v0, :cond_a

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 403
    const/4 v5, 0x2

    .line 404
    if-ne v0, v5, :cond_b

    .line 405
    .line 406
    goto :goto_9

    .line 407
    :catch_0
    :cond_b
    :goto_8
    move-object/from16 v0, v16

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_c
    :goto_9
    move-object v0, v9

    .line 411
    :goto_a
    move-object/from16 v17, v6

    .line 412
    .line 413
    move-object/from16 v18, v7

    .line 414
    .line 415
    move-object/from16 v19, v8

    .line 416
    .line 417
    goto/16 :goto_13

    .line 418
    .line 419
    :cond_d
    const/16 v16, 0x0

    .line 420
    .line 421
    iget-object v0, v7, La/ouu;->d:Ljava/lang/Object;

    .line 422
    .line 423
    move-object v5, v0

    .line 424
    check-cast v5, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 425
    .line 426
    iget-boolean v9, v5, Lcom/yandex/authsdk/YandexAuthOptions;->b:Z

    .line 427
    .line 428
    new-instance v10, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 437
    .line 438
    if-lt v0, v11, :cond_e

    .line 439
    .line 440
    invoke-static {}, La/e4e0;->d()Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {v4, v0}, La/uq6;->n(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_e
    const/16 v0, 0x80

    .line 453
    .line 454
    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    :goto_b
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    const-string v12, "com.yandex.auth.action.YA_SDK_LOGIN"

    .line 470
    .line 471
    if-eqz v0, :cond_19

    .line 472
    .line 473
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    move-object v13, v0

    .line 478
    check-cast v13, Landroid/content/pm/ApplicationInfo;

    .line 479
    .line 480
    iget-object v0, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 481
    .line 482
    iget-object v14, v7, La/ouu;->b:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v14, Ljava/lang/String;

    .line 485
    .line 486
    invoke-static {v0, v14}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-eqz v0, :cond_f

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_f
    iget-boolean v0, v13, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 494
    .line 495
    if-nez v0, :cond_10

    .line 496
    .line 497
    goto :goto_c

    .line 498
    :cond_10
    iget-object v14, v13, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 499
    .line 500
    iget-object v15, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 501
    .line 502
    if-nez v14, :cond_11

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :cond_11
    move-object/from16 v17, v6

    .line 506
    .line 507
    const-string v6, "com.yandex.auth.LOGIN_SDK_VERSION"

    .line 508
    .line 509
    invoke-virtual {v14, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-nez v0, :cond_12

    .line 514
    .line 515
    move-object/from16 v6, v17

    .line 516
    .line 517
    goto :goto_c

    .line 518
    :cond_12
    move-object/from16 v18, v7

    .line 519
    .line 520
    const-string v7, "com.yandex.auth.VERSION"

    .line 521
    .line 522
    invoke-virtual {v14, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-nez v0, :cond_13

    .line 527
    .line 528
    move-object/from16 v6, v17

    .line 529
    .line 530
    move-object/from16 v7, v18

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_13
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-object/from16 v19, v8

    .line 537
    .line 538
    const-string v8, "Error getting fingerprint"

    .line 539
    .line 540
    move/from16 v20, v9

    .line 541
    .line 542
    const-string v9, "ouu"

    .line 543
    .line 544
    :try_start_1
    invoke-static {v4, v15}, La/wwb;->G(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 545
    .line 546
    .line 547
    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_3

    .line 548
    move-object/from16 v21, v11

    .line 549
    .line 550
    :try_start_2
    new-instance v11, Ljava/util/ArrayList;

    .line 551
    .line 552
    const/16 v2, 0xa

    .line 553
    .line 554
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    if-eqz v2, :cond_15

    .line 570
    .line 571
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    check-cast v2, [B

    .line 576
    .line 577
    invoke-static {v2}, La/c3x;->G([B)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_1

    .line 582
    .line 583
    .line 584
    goto :goto_d

    .line 585
    :catch_1
    move-exception v0

    .line 586
    goto :goto_e

    .line 587
    :catch_2
    move-exception v0

    .line 588
    goto :goto_f

    .line 589
    :catch_3
    move-exception v0

    .line 590
    move-object/from16 v21, v11

    .line 591
    .line 592
    :goto_e
    if-eqz v20, :cond_14

    .line 593
    .line 594
    invoke-static {v9, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 595
    .line 596
    .line 597
    goto :goto_10

    .line 598
    :catch_4
    move-exception v0

    .line 599
    move-object/from16 v21, v11

    .line 600
    .line 601
    :goto_f
    if-eqz v20, :cond_14

    .line 602
    .line 603
    invoke-static {v9, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 604
    .line 605
    .line 606
    :cond_14
    :goto_10
    move-object/from16 v11, v16

    .line 607
    .line 608
    :cond_15
    if-nez v11, :cond_16

    .line 609
    .line 610
    :goto_11
    move-object/from16 v6, v17

    .line 611
    .line 612
    move-object/from16 v7, v18

    .line 613
    .line 614
    move-object/from16 v8, v19

    .line 615
    .line 616
    move/from16 v9, v20

    .line 617
    .line 618
    move-object/from16 v11, v21

    .line 619
    .line 620
    goto/16 :goto_c

    .line 621
    .line 622
    :cond_16
    const-string v0, "5D224274D9377C35DA777AD934C65C8CCA6E7A20"

    .line 623
    .line 624
    invoke-interface {v11, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-nez v0, :cond_17

    .line 629
    .line 630
    goto :goto_11

    .line 631
    :cond_17
    iget-object v0, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    new-instance v2, Landroid/content/Intent;

    .line 637
    .line 638
    invoke-direct {v2, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 642
    .line 643
    .line 644
    invoke-static {v4, v2}, La/wwb;->N(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-eqz v0, :cond_18

    .line 653
    .line 654
    goto :goto_11

    .line 655
    :cond_18
    new-instance v0, La/sg80;

    .line 656
    .line 657
    invoke-virtual {v14, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 658
    .line 659
    .line 660
    invoke-virtual {v14, v7}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    const-string v6, "com.yandex.auth.INTERNAL_VERSION"

    .line 665
    .line 666
    const/4 v7, -0x1

    .line 667
    invoke-virtual {v14, v6, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 668
    .line 669
    .line 670
    move-result v6

    .line 671
    invoke-direct {v0, v2, v6, v15}, La/sg80;-><init>(FILjava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    goto :goto_11

    .line 678
    :cond_19
    move-object/from16 v17, v6

    .line 679
    .line 680
    move-object/from16 v18, v7

    .line 681
    .line 682
    move-object/from16 v19, v8

    .line 683
    .line 684
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    move-object/from16 v2, v16

    .line 689
    .line 690
    :cond_1a
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v6

    .line 694
    if-eqz v6, :cond_1c

    .line 695
    .line 696
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v6

    .line 700
    check-cast v6, La/sg80;

    .line 701
    .line 702
    if-eqz v2, :cond_1b

    .line 703
    .line 704
    iget v7, v6, La/sg80;->b:F

    .line 705
    .line 706
    iget v8, v2, La/sg80;->b:F

    .line 707
    .line 708
    cmpl-float v7, v7, v8

    .line 709
    .line 710
    if-gtz v7, :cond_1b

    .line 711
    .line 712
    iget v7, v6, La/sg80;->c:F

    .line 713
    .line 714
    iget v8, v2, La/sg80;->c:F

    .line 715
    .line 716
    cmpl-float v7, v7, v8

    .line 717
    .line 718
    if-lez v7, :cond_1a

    .line 719
    .line 720
    :cond_1b
    move-object v2, v6

    .line 721
    goto :goto_12

    .line 722
    :cond_1c
    if-eqz v2, :cond_1d

    .line 723
    .line 724
    iget-object v0, v2, La/sg80;->a:Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    new-instance v2, Landroid/content/Intent;

    .line 730
    .line 731
    invoke-direct {v2, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 735
    .line 736
    .line 737
    new-instance v0, La/q950;

    .line 738
    .line 739
    iget-object v5, v5, Lcom/yandex/authsdk/YandexAuthOptions;->a:Ljava/lang/String;

    .line 740
    .line 741
    invoke-direct {v0, v2, v5}, La/q950;-><init>(Landroid/content/Intent;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    goto :goto_13

    .line 745
    :cond_1d
    move-object/from16 v0, v16

    .line 746
    .line 747
    :goto_13
    if-nez v0, :cond_1f

    .line 748
    .line 749
    move-object/from16 v6, v17

    .line 750
    .line 751
    move-object/from16 v7, v18

    .line 752
    .line 753
    move-object/from16 v8, v19

    .line 754
    .line 755
    const/4 v10, -0x1

    .line 756
    goto/16 :goto_2

    .line 757
    .line 758
    :cond_1e
    const/16 v16, 0x0

    .line 759
    .line 760
    move-object/from16 v0, v16

    .line 761
    .line 762
    :cond_1f
    if-eqz v0, :cond_23

    .line 763
    .line 764
    invoke-virtual {v0}, La/r8x;->K()La/bsr0;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    new-instance v4, La/yn4;

    .line 769
    .line 770
    const/4 v5, 0x0

    .line 771
    invoke-direct {v4, v1, v5}, La/yn4;-><init>(Ljava/lang/Object;B)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    iget-object v5, v1, La/agd;->i:La/yfd;

    .line 778
    .line 779
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    new-instance v6, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    const-string v7, "activity_rq#"

    .line 785
    .line 786
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    iget-object v7, v1, La/agd;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 790
    .line 791
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    invoke-virtual {v5, v6, v1, v2, v4}, La/yfd;->c(Ljava/lang/String;La/clz;La/bsr0;La/wn;)La/go;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    if-nez p1, :cond_22

    .line 807
    .line 808
    :try_start_3
    invoke-virtual {v0}, La/r8x;->P()La/vw00;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    iput-object v0, v1, Lcom/yandex/authsdk/internal/AuthSdkActivity;->B:La/vw00;

    .line 813
    .line 814
    invoke-virtual {v2, v3}, La/go;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 815
    .line 816
    .line 817
    goto :goto_14

    .line 818
    :catch_5
    move-exception v0

    .line 819
    iget-object v2, v1, Lcom/yandex/authsdk/internal/AuthSdkActivity;->Y:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 820
    .line 821
    if-eqz v2, :cond_21

    .line 822
    .line 823
    iget-boolean v2, v2, Lcom/yandex/authsdk/YandexAuthOptions;->b:Z

    .line 824
    .line 825
    if-eqz v2, :cond_20

    .line 826
    .line 827
    const-string v2, "AuthSdkActivity"

    .line 828
    .line 829
    const-string v3, "Unknown error:"

    .line 830
    .line 831
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 832
    .line 833
    .line 834
    :cond_20
    new-instance v0, Landroid/content/Intent;

    .line 835
    .line 836
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 837
    .line 838
    .line 839
    new-instance v2, La/d2w0;

    .line 840
    .line 841
    const-string v3, "unknown.error"

    .line 842
    .line 843
    filled-new-array {v3}, [Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    invoke-direct {v2, v3}, La/d2w0;-><init>([Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    const-string v3, "com.yandex.authsdk.EXTRA_ERROR"

    .line 851
    .line 852
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 853
    .line 854
    .line 855
    const/4 v7, -0x1

    .line 856
    invoke-virtual {v1, v7, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 860
    .line 861
    .line 862
    goto :goto_14

    .line 863
    :cond_21
    const-string v0, "options"

    .line 864
    .line 865
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    throw v16

    .line 869
    :cond_22
    invoke-static {}, La/vw00;->values()[La/vw00;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    const-string v2, "com.yandex.authsdk.STATE_LOGIN_TYPE"

    .line 874
    .line 875
    move-object/from16 v3, p1

    .line 876
    .line 877
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    aget-object v0, v0, v2

    .line 882
    .line 883
    iput-object v0, v1, Lcom/yandex/authsdk/internal/AuthSdkActivity;->B:La/vw00;

    .line 884
    .line 885
    :goto_14
    return-void

    .line 886
    :cond_23
    const-string v0, "No element of the collection was transformed to a non-null value."

    .line 887
    .line 888
    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/agd;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/yandex/authsdk/internal/AuthSdkActivity;->B:La/vw00;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const-string v0, "com.yandex.authsdk.STATE_LOGIN_TYPE"

    .line 16
    .line 17
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "loginType"

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method
