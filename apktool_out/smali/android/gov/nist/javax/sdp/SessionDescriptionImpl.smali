.class public Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mji0;


# instance fields
.field protected attributesList:Ljava/util/Vector;

.field protected bandwidthList:Ljava/util/Vector;

.field protected connectionImpl:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

.field private currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

.field private currentTimeDescription:Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

.field protected emailList:Ljava/util/Vector;

.field protected infoImpl:Landroid/gov/nist/javax/sdp/fields/InformationField;

.field protected keyImpl:Landroid/gov/nist/javax/sdp/fields/KeyField;

.field protected mediaDescriptions:Ljava/util/Vector;

.field protected originImpl:Landroid/gov/nist/javax/sdp/fields/OriginField;

.field protected phoneList:Ljava/util/Vector;

.field protected sessionNameImpl:Landroid/gov/nist/javax/sdp/fields/SessionNameField;

.field protected timeDescriptions:Ljava/util/Vector;

.field protected uriImpl:Landroid/gov/nist/javax/sdp/fields/URIField;

.field protected versionImpl:Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

.field protected zoneAdjustments:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 669
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/mji0;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_b

    .line 7
    .line 8
    :cond_0
    invoke-interface {p1}, La/mji0;->getVersion()La/vbu0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/vbu0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setVersion(La/vbu0;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {p1}, La/mji0;->getOrigin()La/ta80;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/ta80;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setOrigin(La/ta80;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-interface {p1}, La/mji0;->getSessionName()La/cki0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/cki0;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setSessionName(La/cki0;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-interface {p1}, La/mji0;->getInfo()La/f8x;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/f8x;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setInfo(La/f8x;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-interface {p1}, La/mji0;->getURI()La/o2t0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    new-instance v1, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 77
    .line 78
    invoke-direct {v1}, Landroid/gov/nist/javax/sdp/fields/URIField;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/URIField;->get()Ljava/net/URL;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sdp/fields/URIField;->set(Ljava/net/URL;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setURI(La/o2t0;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-interface {p1}, La/mji0;->getConnection()La/j1e;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, La/j1e;

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setConnection(La/j1e;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-interface {p1}, La/mji0;->getKey()La/sjy;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    invoke-interface {v0}, La/qqp;->clone()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/sjy;

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setKey(La/sjy;)V

    .line 119
    .line 120
    .line 121
    :cond_7
    const/4 v0, 0x0

    .line 122
    invoke-interface {p1, v0}, La/mji0;->getTimeDescriptions(Z)Ljava/util/Vector;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_c

    .line 127
    .line 128
    new-instance v2, Ljava/util/Vector;

    .line 129
    .line 130
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :cond_8
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_b

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 148
    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->getTime()La/qgq0;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-interface {v4}, La/qqp;->clone()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 160
    .line 161
    new-instance v5, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 162
    .line 163
    invoke-direct {v5, v4}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;-><init>(Landroid/gov/nist/javax/sdp/fields/TimeField;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->getRepeatTimes(Z)Ljava/util/Vector;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    if-eqz v3, :cond_a

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    :cond_9
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_a

    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 187
    .line 188
    if-eqz v4, :cond_9

    .line 189
    .line 190
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/RepeatField;->clone()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 195
    .line 196
    invoke-virtual {v5, v4}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->addRepeatField(Landroid/gov/nist/javax/sdp/fields/RepeatField;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    invoke-virtual {v2, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_b
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setTimeDescriptions(Ljava/util/Vector;)V

    .line 205
    .line 206
    .line 207
    :cond_c
    invoke-interface {p1, v0}, La/mji0;->getEmails(Z)Ljava/util/Vector;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-eqz v1, :cond_f

    .line 212
    .line 213
    new-instance v2, Ljava/util/Vector;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    :cond_d
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_e

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/EmailField;

    .line 233
    .line 234
    if-eqz v3, :cond_d

    .line 235
    .line 236
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/EmailField;->clone()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/EmailField;

    .line 241
    .line 242
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_e
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setEmails(Ljava/util/Vector;)V

    .line 247
    .line 248
    .line 249
    :cond_f
    invoke-interface {p1, v0}, La/mji0;->getPhones(Z)Ljava/util/Vector;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    if-eqz v1, :cond_12

    .line 254
    .line 255
    new-instance v2, Ljava/util/Vector;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    :cond_10
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_11

    .line 269
    .line 270
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/PhoneField;

    .line 275
    .line 276
    if-eqz v3, :cond_10

    .line 277
    .line 278
    invoke-virtual {v3}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/PhoneField;

    .line 283
    .line 284
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_11
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setPhones(Ljava/util/Vector;)V

    .line 289
    .line 290
    .line 291
    :cond_12
    invoke-interface {p1, v0}, La/mji0;->getZoneAdjustments(Z)Ljava/util/Vector;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_15

    .line 296
    .line 297
    new-instance v2, Ljava/util/Vector;

    .line 298
    .line 299
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    :cond_13
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_14

    .line 311
    .line 312
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/ZoneField;

    .line 317
    .line 318
    if-eqz v3, :cond_13

    .line 319
    .line 320
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/ZoneField;->clone()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/ZoneField;

    .line 325
    .line 326
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_14
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setZoneAdjustments(Ljava/util/Vector;)V

    .line 331
    .line 332
    .line 333
    :cond_15
    invoke-interface {p1, v0}, La/mji0;->getBandwidths(Z)Ljava/util/Vector;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    if-eqz v1, :cond_18

    .line 338
    .line 339
    new-instance v2, Ljava/util/Vector;

    .line 340
    .line 341
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    :cond_16
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_17

    .line 353
    .line 354
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 359
    .line 360
    if-eqz v3, :cond_16

    .line 361
    .line 362
    invoke-virtual {v3}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 367
    .line 368
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_17
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setBandwidths(Ljava/util/Vector;)V

    .line 373
    .line 374
    .line 375
    :cond_18
    invoke-interface {p1, v0}, La/mji0;->getAttributes(Z)Ljava/util/Vector;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    if-eqz v1, :cond_1b

    .line 380
    .line 381
    new-instance v2, Ljava/util/Vector;

    .line 382
    .line 383
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    :cond_19
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-eqz v3, :cond_1a

    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 401
    .line 402
    if-eqz v3, :cond_19

    .line 403
    .line 404
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->clone()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 409
    .line 410
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    goto :goto_6

    .line 414
    :cond_1a
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setAttributes(Ljava/util/Vector;)V

    .line 415
    .line 416
    .line 417
    :cond_1b
    invoke-interface {p1, v0}, La/mji0;->getMediaDescriptions(Z)Ljava/util/Vector;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    if-eqz p1, :cond_2b

    .line 422
    .line 423
    new-instance v1, Ljava/util/Vector;

    .line 424
    .line 425
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    :cond_1c
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_2a

    .line 437
    .line 438
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 443
    .line 444
    if-eqz v2, :cond_1c

    .line 445
    .line 446
    new-instance v3, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 447
    .line 448
    invoke-direct {v3}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getMediaField()Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    if-eqz v4, :cond_20

    .line 456
    .line 457
    new-instance v5, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 458
    .line 459
    invoke-direct {v5}, Landroid/gov/nist/javax/sdp/fields/MediaField;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getMedia()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sdp/fields/MediaField;->setMedia(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getPort()I

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sdp/fields/MediaField;->setPort(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getNports()I

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sdp/fields/MediaField;->setNports(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getProto()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sdp/fields/MediaField;->setProto(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getFormats()Ljava/util/Vector;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    if-eqz v4, :cond_1f

    .line 495
    .line 496
    new-instance v6, Ljava/util/Vector;

    .line 497
    .line 498
    invoke-direct {v6}, Ljava/util/Vector;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    :cond_1d
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    if-eqz v7, :cond_1e

    .line 510
    .line 511
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    if-eqz v7, :cond_1d

    .line 516
    .line 517
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-virtual {v6, v7}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    goto :goto_8

    .line 525
    :cond_1e
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sdp/fields/MediaField;->setFormats(Ljava/util/Vector;)V

    .line 526
    .line 527
    .line 528
    :cond_1f
    invoke-virtual {v3, v5}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setMedia(La/zl30;)V

    .line 529
    .line 530
    .line 531
    :cond_20
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getInformationField()Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    if-eqz v4, :cond_21

    .line 536
    .line 537
    invoke-virtual {v4}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 542
    .line 543
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setInformationField(Landroid/gov/nist/javax/sdp/fields/InformationField;)V

    .line 544
    .line 545
    .line 546
    :cond_21
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getConnectionField()Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    if-eqz v4, :cond_22

    .line 551
    .line 552
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->clone()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 557
    .line 558
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setConnectionField(Landroid/gov/nist/javax/sdp/fields/ConnectionField;)V

    .line 559
    .line 560
    .line 561
    :cond_22
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getBandwidths(Z)Ljava/util/Vector;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    if-eqz v4, :cond_25

    .line 566
    .line 567
    new-instance v5, Ljava/util/Vector;

    .line 568
    .line 569
    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v4}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    :cond_23
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 577
    .line 578
    .line 579
    move-result v6

    .line 580
    if-eqz v6, :cond_24

    .line 581
    .line 582
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    check-cast v6, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 587
    .line 588
    if-eqz v6, :cond_23

    .line 589
    .line 590
    invoke-virtual {v6}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    check-cast v6, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 595
    .line 596
    invoke-virtual {v5, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    goto :goto_9

    .line 600
    :cond_24
    invoke-virtual {v3, v5}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setBandwidths(Ljava/util/Vector;)V

    .line 601
    .line 602
    .line 603
    :cond_25
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getKeyField()Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    if-eqz v4, :cond_26

    .line 608
    .line 609
    invoke-virtual {v4}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 614
    .line 615
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setKeyField(Landroid/gov/nist/javax/sdp/fields/KeyField;)V

    .line 616
    .line 617
    .line 618
    :cond_26
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttributeFields()Ljava/util/Vector;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    if-eqz v2, :cond_29

    .line 623
    .line 624
    new-instance v4, Ljava/util/Vector;

    .line 625
    .line 626
    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    :cond_27
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-eqz v5, :cond_28

    .line 638
    .line 639
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    check-cast v5, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 644
    .line 645
    if-eqz v5, :cond_27

    .line 646
    .line 647
    invoke-virtual {v5}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->clone()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    check-cast v5, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 652
    .line 653
    invoke-virtual {v4, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    goto :goto_a

    .line 657
    :cond_28
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setAttributeFields(Ljava/util/Vector;)V

    .line 658
    .line 659
    .line 660
    :cond_29
    invoke-virtual {v1, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    goto/16 :goto_7

    .line 664
    .line 665
    :cond_2a
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->setMediaDescriptions(Ljava/util/Vector;)V

    .line 666
    .line 667
    .line 668
    :cond_2b
    :goto_b
    return-void
.end method

.method private encodeVector(Ljava/util/Vector;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public addField(Landroid/gov/nist/javax/sdp/fields/SDPField;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 8
    .line 9
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->versionImpl:Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 18
    .line 19
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->originImpl:Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 28
    .line 29
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->sessionNameImpl:Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    move-object p0, p1

    .line 41
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setInformationField(Landroid/gov/nist/javax/sdp/fields/InformationField;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    move-object v1, p1

    .line 48
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 49
    .line 50
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->infoImpl:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    move-object v1, p1

    .line 58
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 59
    .line 60
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->uriImpl:Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 64
    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 68
    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    move-object p0, p1

    .line 72
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setConnectionField(Landroid/gov/nist/javax/sdp/fields/ConnectionField;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_6
    move-object v1, p1

    .line 79
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 80
    .line 81
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->connectionImpl:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_7
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 85
    .line 86
    if-eqz v1, :cond_9

    .line 87
    .line 88
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 89
    .line 90
    if-eqz v1, :cond_8

    .line 91
    .line 92
    move-object p0, p1

    .line 93
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 94
    .line 95
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setKey(La/sjy;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_8
    move-object v1, p1

    .line 100
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 101
    .line 102
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->keyImpl:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_9
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/EmailField;

    .line 106
    .line 107
    const/4 v2, 0x1

    .line 108
    if-eqz v1, :cond_a

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getEmails(Z)Ljava/util/Vector;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_a
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/PhoneField;

    .line 119
    .line 120
    if-eqz v1, :cond_b

    .line 121
    .line 122
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getPhones(Z)Ljava/util/Vector;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_b
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 131
    .line 132
    if-eqz v1, :cond_c

    .line 133
    .line 134
    new-instance v1, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 135
    .line 136
    move-object v3, p1

    .line 137
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 138
    .line 139
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;-><init>(Landroid/gov/nist/javax/sdp/fields/TimeField;)V

    .line 140
    .line 141
    .line 142
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentTimeDescription:Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 143
    .line 144
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getTimeDescriptions(Z)Ljava/util/Vector;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentTimeDescription:Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 149
    .line 150
    invoke-virtual {v1, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_c
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 155
    .line 156
    if-eqz v1, :cond_e

    .line 157
    .line 158
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentTimeDescription:Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;

    .line 159
    .line 160
    if-eqz p0, :cond_d

    .line 161
    .line 162
    move-object v1, p1

    .line 163
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 164
    .line 165
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->addRepeatField(Landroid/gov/nist/javax/sdp/fields/RepeatField;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_d
    new-instance p0, Ljava/text/ParseException;

    .line 170
    .line 171
    const-string v1, "no time specified"

    .line 172
    .line 173
    invoke-direct {p0, v1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    throw p0

    .line 177
    :cond_e
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/ZoneField;

    .line 178
    .line 179
    if-eqz v1, :cond_f

    .line 180
    .line 181
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getZoneAdjustments(Z)Ljava/util/Vector;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_f
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 190
    .line 191
    if-eqz v1, :cond_11

    .line 192
    .line 193
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 194
    .line 195
    if-eqz v1, :cond_10

    .line 196
    .line 197
    move-object p0, p1

    .line 198
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 199
    .line 200
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->addBandwidthField(Landroid/gov/nist/javax/sdp/fields/BandwidthField;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_10
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getBandwidths(Z)Ljava/util/Vector;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_11
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 213
    .line 214
    if-eqz v1, :cond_13

    .line 215
    .line 216
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 217
    .line 218
    if-eqz v1, :cond_12

    .line 219
    .line 220
    move-object v1, p1

    .line 221
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 227
    .line 228
    move-object v1, p1

    .line 229
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 230
    .line 231
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->addAttribute(Landroid/gov/nist/javax/sdp/fields/AttributeField;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_12
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getAttributes(Z)Ljava/util/Vector;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_13
    instance-of v1, p1, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 244
    .line 245
    if-eqz v1, :cond_14

    .line 246
    .line 247
    new-instance v1, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 248
    .line 249
    invoke-direct {v1}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 253
    .line 254
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getMediaDescriptions(Z)Ljava/util/Vector;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->currentMediaDescription:Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;

    .line 264
    .line 265
    move-object v1, p1

    .line 266
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 267
    .line 268
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setMediaField(Landroid/gov/nist/javax/sdp/fields/MediaField;)V
    :try_end_0
    .catch La/wch0; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    :cond_14
    return-void

    .line 272
    :catch_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sdp/fields/SDPField;->encode()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {v0, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;-><init>(La/mji0;)V
    :try_end_0
    .catch La/wch0; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-object v0

    .line 7
    :catch_0
    new-instance p0, Ljava/lang/CloneNotSupportedException;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/CloneNotSupportedException;-><init>()V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_1
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_3

    .line 18
    .line 19
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v3, v2, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-object v0
.end method

.method public getAttributes(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getBandwidth(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    return v0

    .line 10
    :cond_1
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_3

    .line 18
    .line 19
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v3, v2, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getType()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getValue()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return v0
.end method

.method public getBandwidths(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getConnection()La/j1e;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->connectionImpl:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEmails(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->emailList:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->emailList:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getInfo()La/f8x;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->infoImpl:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getKey()La/sjy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->keyImpl:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMediaDescriptions(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->mediaDescriptions:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->mediaDescriptions:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getOrigin()La/ta80;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->originImpl:Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPhones(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->phoneList:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->phoneList:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getSessionName()La/cki0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->sessionNameImpl:Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTimeDescriptions(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->timeDescriptions:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->timeDescriptions:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getURI()La/o2t0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->uriImpl:Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getVersion()La/vbu0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->versionImpl:Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getZoneAdjustments(Z)Ljava/util/Vector;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->zoneAdjustments:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->zoneAdjustments:Ljava/util/Vector;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public removeAttribute(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public removeBandwidth(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getType()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    instance-of v2, v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, p2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setValue(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    const-string p0, "The parameter is null"

    .line 50
    .line 51
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public setAttributes(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->attributesList:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setBandwidth(Ljava/lang/String;I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getType()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, p2}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->setValue(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void

    .line 47
    :cond_2
    const-string p0, "The parameter is null"

    .line 48
    .line 49
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setBandwidths(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->bandwidthList:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setConnection(La/j1e;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->connectionImpl:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "Bad implementation class ConnectionField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setEmails(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->emailList:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setInfo(La/f8x;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->infoImpl:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of InformationField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setKey(La/sjy;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->keyImpl:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of KeyField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setMediaDescriptions(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->mediaDescriptions:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setOrigin(La/ta80;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->originImpl:Landroid/gov/nist/javax/sdp/fields/OriginField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of OriginField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setPhones(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->phoneList:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSessionName(La/cki0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->sessionNameImpl:Landroid/gov/nist/javax/sdp/fields/SessionNameField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of SessionNameField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setTimeDescriptions(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->timeDescriptions:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setURI(La/o2t0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->uriImpl:Landroid/gov/nist/javax/sdp/fields/URIField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of URIField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setVersion(La/vbu0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->versionImpl:Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter must be an instance of VersionField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setZoneAdjustments(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->zoneAdjustments:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getVersion()La/vbu0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, ""

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getVersion()La/vbu0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getOrigin()La/ta80;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    move-object v1, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getOrigin()La/ta80;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getSessionName()La/cki0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    move-object v1, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getSessionName()La/cki0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getInfo()La/f8x;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    move-object v1, v2

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getInfo()La/f8x;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getURI()La/o2t0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    move-object v1, v2

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getURI()La/o2t0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getEmails(Z)Ljava/util/Vector;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-nez v3, :cond_5

    .line 109
    .line 110
    move-object v3, v2

    .line 111
    goto :goto_5

    .line 112
    :cond_5
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getEmails(Z)Ljava/util/Vector;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :goto_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getPhones(Z)Ljava/util/Vector;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-nez v3, :cond_6

    .line 128
    .line 129
    move-object v3, v2

    .line 130
    goto :goto_6

    .line 131
    :cond_6
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getPhones(Z)Ljava/util/Vector;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :goto_6
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getConnection()La/j1e;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-nez v3, :cond_7

    .line 147
    .line 148
    move-object v3, v2

    .line 149
    goto :goto_7

    .line 150
    :cond_7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getConnection()La/j1e;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    :goto_7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getBandwidths(Z)Ljava/util/Vector;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-nez v3, :cond_8

    .line 166
    .line 167
    move-object v3, v2

    .line 168
    goto :goto_8

    .line 169
    :cond_8
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getBandwidths(Z)Ljava/util/Vector;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    :goto_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getTimeDescriptions(Z)Ljava/util/Vector;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    move-object v3, v2

    .line 187
    goto :goto_9

    .line 188
    :cond_9
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getTimeDescriptions(Z)Ljava/util/Vector;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    :goto_9
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getZoneAdjustments(Z)Ljava/util/Vector;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v3, :cond_a

    .line 204
    .line 205
    move-object v3, v2

    .line 206
    goto :goto_a

    .line 207
    :cond_a
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getZoneAdjustments(Z)Ljava/util/Vector;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    :goto_a
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getKey()La/sjy;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-nez v3, :cond_b

    .line 223
    .line 224
    move-object v3, v2

    .line 225
    goto :goto_b

    .line 226
    :cond_b
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getKey()La/sjy;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    :goto_b
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getAttributes(Z)Ljava/util/Vector;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    if-nez v3, :cond_c

    .line 242
    .line 243
    move-object v3, v2

    .line 244
    goto :goto_c

    .line 245
    :cond_c
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getAttributes(Z)Ljava/util/Vector;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    :goto_c
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getMediaDescriptions(Z)Ljava/util/Vector;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    if-nez v3, :cond_d

    .line 261
    .line 262
    goto :goto_d

    .line 263
    :cond_d
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->getMediaDescriptions(Z)Ljava/util/Vector;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->encodeVector(Ljava/util/Vector;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    :goto_d
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch La/wch0; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    .line 273
    .line 274
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0
.end method
