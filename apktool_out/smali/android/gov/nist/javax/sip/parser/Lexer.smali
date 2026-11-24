.class public Landroid/gov/nist/javax/sip/parser/Lexer;
.super Landroid/gov/nist/core/LexerCore;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/core/LexerCore;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/Lexer;->selectLexer(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static getHeaderName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p0

    .line 24
    :catch_0
    :cond_1
    return-object v0
.end method

.method public static getHeaderValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p0

    .line 18
    :catch_0
    return-object v0
.end method


# virtual methods
.method public selectLexer(Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Landroid/gov/nist/core/LexerCore;->lexerTables:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    iput-object v1, v0, Landroid/gov/nist/core/LexerCore;->currentLexerName:Ljava/lang/String;

    .line 14
    .line 15
    if-nez v3, :cond_6

    .line 16
    .line 17
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 23
    .line 24
    const-string v4, "method_keywordLexer"

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x858

    .line 31
    .line 32
    const-string v6, "sips"

    .line 33
    .line 34
    const/16 v7, 0x803

    .line 35
    .line 36
    const-string v8, "sip"

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    const-string v4, "REGISTER"

    .line 41
    .line 42
    const/16 v9, 0x804

    .line 43
    .line 44
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    const-string v4, "ACK"

    .line 48
    .line 49
    const/16 v9, 0x806

    .line 50
    .line 51
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    const-string v4, "OPTIONS"

    .line 55
    .line 56
    const/16 v9, 0x808

    .line 57
    .line 58
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    const-string v4, "BYE"

    .line 62
    .line 63
    const/16 v9, 0x807

    .line 64
    .line 65
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    const-string v4, "INVITE"

    .line 69
    .line 70
    const/16 v9, 0x805

    .line 71
    .line 72
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v8, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v6, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    const-string v4, "SUBSCRIBE"

    .line 82
    .line 83
    const/16 v5, 0x835

    .line 84
    .line 85
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    const-string v4, "NOTIFY"

    .line 89
    .line 90
    const/16 v5, 0x836

    .line 91
    .line 92
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    const-string v4, "MESSAGE"

    .line 96
    .line 97
    const/16 v5, 0x846

    .line 98
    .line 99
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    const-string v4, "PUBLISH"

    .line 103
    .line 104
    const/16 v5, 0x843

    .line 105
    .line 106
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_0
    const-string v4, "command_keywordLexer"

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_1

    .line 118
    .line 119
    const-string v4, "Error-Info"

    .line 120
    .line 121
    const/16 v5, 0x80a

    .line 122
    .line 123
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    const-string v4, "Allow-Events"

    .line 127
    .line 128
    const/16 v5, 0x841

    .line 129
    .line 130
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    const-string v4, "Authentication-Info"

    .line 134
    .line 135
    const/16 v6, 0x840

    .line 136
    .line 137
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    const-string v4, "Event"

    .line 141
    .line 142
    const/16 v6, 0x83f

    .line 143
    .line 144
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    const-string v4, "Min-Expires"

    .line 148
    .line 149
    const/16 v7, 0x83e

    .line 150
    .line 151
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 152
    .line 153
    .line 154
    const-string v4, "RSeq"

    .line 155
    .line 156
    const/16 v7, 0x83c

    .line 157
    .line 158
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    const-string v4, "RAck"

    .line 162
    .line 163
    const/16 v7, 0x83d

    .line 164
    .line 165
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    const-string v4, "Reason"

    .line 169
    .line 170
    const/16 v7, 0x83b

    .line 171
    .line 172
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    const-string v4, "Reply-To"

    .line 176
    .line 177
    const/16 v7, 0x83a

    .line 178
    .line 179
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 180
    .line 181
    .line 182
    const-string v4, "Subscription-State"

    .line 183
    .line 184
    const/16 v7, 0x838

    .line 185
    .line 186
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 187
    .line 188
    .line 189
    const-string v4, "Timestamp"

    .line 190
    .line 191
    const/16 v7, 0x837

    .line 192
    .line 193
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    const-string v4, "In-Reply-To"

    .line 197
    .line 198
    const/16 v7, 0x80b

    .line 199
    .line 200
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    const-string v4, "MIME-Version"

    .line 204
    .line 205
    const/16 v7, 0x80c

    .line 206
    .line 207
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 208
    .line 209
    .line 210
    const-string v4, "Alert-Info"

    .line 211
    .line 212
    const/16 v7, 0x80d

    .line 213
    .line 214
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 215
    .line 216
    .line 217
    const-string v4, "From"

    .line 218
    .line 219
    const/16 v7, 0x80e

    .line 220
    .line 221
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 222
    .line 223
    .line 224
    const-string v4, "To"

    .line 225
    .line 226
    const/16 v8, 0x80f

    .line 227
    .line 228
    invoke-virtual {v0, v4, v8}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    const-string v4, "Refer-To"

    .line 232
    .line 233
    const/16 v9, 0x842

    .line 234
    .line 235
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 236
    .line 237
    .line 238
    const-string v4, "Via"

    .line 239
    .line 240
    const/16 v10, 0x810

    .line 241
    .line 242
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 243
    .line 244
    .line 245
    const-string v4, "User-Agent"

    .line 246
    .line 247
    const/16 v11, 0x811

    .line 248
    .line 249
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 250
    .line 251
    .line 252
    const-string v4, "Server"

    .line 253
    .line 254
    const/16 v11, 0x812

    .line 255
    .line 256
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    const-string v4, "Accept-Encoding"

    .line 260
    .line 261
    const/16 v11, 0x813

    .line 262
    .line 263
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 264
    .line 265
    .line 266
    const-string v4, "Accept"

    .line 267
    .line 268
    const/16 v11, 0x814

    .line 269
    .line 270
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    const-string v4, "Allow"

    .line 274
    .line 275
    const/16 v12, 0x815

    .line 276
    .line 277
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 278
    .line 279
    .line 280
    const-string v4, "Route"

    .line 281
    .line 282
    const/16 v12, 0x816

    .line 283
    .line 284
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 285
    .line 286
    .line 287
    const-string v4, "Authorization"

    .line 288
    .line 289
    const/16 v12, 0x817

    .line 290
    .line 291
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 292
    .line 293
    .line 294
    const-string v4, "Proxy-Authorization"

    .line 295
    .line 296
    const/16 v12, 0x818

    .line 297
    .line 298
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 299
    .line 300
    .line 301
    const-string v4, "Retry-After"

    .line 302
    .line 303
    const/16 v12, 0x819

    .line 304
    .line 305
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 306
    .line 307
    .line 308
    const-string v4, "Proxy-Require"

    .line 309
    .line 310
    const/16 v12, 0x81a

    .line 311
    .line 312
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 313
    .line 314
    .line 315
    const-string v4, "Content-Language"

    .line 316
    .line 317
    const/16 v12, 0x81b

    .line 318
    .line 319
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 320
    .line 321
    .line 322
    const-string v4, "Unsupported"

    .line 323
    .line 324
    const/16 v12, 0x81c

    .line 325
    .line 326
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 327
    .line 328
    .line 329
    const-string v4, "Supported"

    .line 330
    .line 331
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 332
    .line 333
    .line 334
    const-string v4, "Warning"

    .line 335
    .line 336
    const/16 v12, 0x81e

    .line 337
    .line 338
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 339
    .line 340
    .line 341
    const-string v4, "Max-Forwards"

    .line 342
    .line 343
    const/16 v12, 0x81f

    .line 344
    .line 345
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 346
    .line 347
    .line 348
    const-string v4, "Date"

    .line 349
    .line 350
    const/16 v12, 0x820

    .line 351
    .line 352
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 353
    .line 354
    .line 355
    const-string v4, "Priority"

    .line 356
    .line 357
    const/16 v12, 0x821

    .line 358
    .line 359
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 360
    .line 361
    .line 362
    const-string v4, "Proxy-Authenticate"

    .line 363
    .line 364
    const/16 v12, 0x822

    .line 365
    .line 366
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 367
    .line 368
    .line 369
    const-string v4, "Content-Encoding"

    .line 370
    .line 371
    const/16 v12, 0x823

    .line 372
    .line 373
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 374
    .line 375
    .line 376
    const-string v4, "Content-Length"

    .line 377
    .line 378
    const/16 v13, 0x824

    .line 379
    .line 380
    invoke-virtual {v0, v4, v13}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 381
    .line 382
    .line 383
    const-string v4, "Subject"

    .line 384
    .line 385
    const/16 v14, 0x825

    .line 386
    .line 387
    invoke-virtual {v0, v4, v14}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 388
    .line 389
    .line 390
    const-string v4, "Content-Type"

    .line 391
    .line 392
    const/16 v15, 0x826

    .line 393
    .line 394
    invoke-virtual {v0, v4, v15}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 395
    .line 396
    .line 397
    const-string v4, "Contact"

    .line 398
    .line 399
    const/16 v6, 0x827

    .line 400
    .line 401
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 402
    .line 403
    .line 404
    const-string v4, "Call-ID"

    .line 405
    .line 406
    const/16 v9, 0x828

    .line 407
    .line 408
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 409
    .line 410
    .line 411
    const-string v4, "Require"

    .line 412
    .line 413
    const/16 v10, 0x829

    .line 414
    .line 415
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 416
    .line 417
    .line 418
    const-string v4, "Expires"

    .line 419
    .line 420
    const/16 v10, 0x82a

    .line 421
    .line 422
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 423
    .line 424
    .line 425
    const-string v4, "Record-Route"

    .line 426
    .line 427
    const/16 v10, 0x82c

    .line 428
    .line 429
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 430
    .line 431
    .line 432
    const-string v4, "Organization"

    .line 433
    .line 434
    const/16 v10, 0x82d

    .line 435
    .line 436
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 437
    .line 438
    .line 439
    const-string v4, "CSeq"

    .line 440
    .line 441
    const/16 v10, 0x82e

    .line 442
    .line 443
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 444
    .line 445
    .line 446
    const-string v4, "Accept-Language"

    .line 447
    .line 448
    const/16 v10, 0x82f

    .line 449
    .line 450
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 451
    .line 452
    .line 453
    const-string v4, "WWW-Authenticate"

    .line 454
    .line 455
    const/16 v10, 0x830

    .line 456
    .line 457
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 458
    .line 459
    .line 460
    const-string v4, "Call-Info"

    .line 461
    .line 462
    const/16 v10, 0x833

    .line 463
    .line 464
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 465
    .line 466
    .line 467
    const-string v4, "Content-Disposition"

    .line 468
    .line 469
    const/16 v10, 0x834

    .line 470
    .line 471
    invoke-virtual {v0, v4, v10}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 472
    .line 473
    .line 474
    const-string v4, "K"

    .line 475
    .line 476
    invoke-virtual {v0, v4, v11}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 477
    .line 478
    .line 479
    const-string v4, "C"

    .line 480
    .line 481
    invoke-virtual {v0, v4, v15}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 482
    .line 483
    .line 484
    const-string v4, "E"

    .line 485
    .line 486
    invoke-virtual {v0, v4, v12}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 487
    .line 488
    .line 489
    const-string v4, "F"

    .line 490
    .line 491
    invoke-virtual {v0, v4, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 492
    .line 493
    .line 494
    const-string v4, "I"

    .line 495
    .line 496
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 497
    .line 498
    .line 499
    const-string v4, "M"

    .line 500
    .line 501
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 502
    .line 503
    .line 504
    const-string v4, "L"

    .line 505
    .line 506
    invoke-virtual {v0, v4, v13}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 507
    .line 508
    .line 509
    const-string v4, "S"

    .line 510
    .line 511
    invoke-virtual {v0, v4, v14}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 512
    .line 513
    .line 514
    const-string v4, "T"

    .line 515
    .line 516
    invoke-virtual {v0, v4, v8}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 517
    .line 518
    .line 519
    const-string v4, "U"

    .line 520
    .line 521
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 522
    .line 523
    .line 524
    const-string v4, "V"

    .line 525
    .line 526
    const/16 v5, 0x810

    .line 527
    .line 528
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 529
    .line 530
    .line 531
    const-string v4, "R"

    .line 532
    .line 533
    const/16 v5, 0x842

    .line 534
    .line 535
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 536
    .line 537
    .line 538
    const-string v4, "O"

    .line 539
    .line 540
    const/16 v5, 0x83f

    .line 541
    .line 542
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 543
    .line 544
    .line 545
    const-string v4, "X"

    .line 546
    .line 547
    const/16 v5, 0x855

    .line 548
    .line 549
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 550
    .line 551
    .line 552
    const-string v4, "SIP-ETag"

    .line 553
    .line 554
    const/16 v6, 0x844

    .line 555
    .line 556
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 557
    .line 558
    .line 559
    const-string v4, "SIP-If-Match"

    .line 560
    .line 561
    const/16 v6, 0x845

    .line 562
    .line 563
    invoke-virtual {v0, v4, v6}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 564
    .line 565
    .line 566
    const-string v4, "Session-Expires"

    .line 567
    .line 568
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 569
    .line 570
    .line 571
    const-string v4, "Min-SE"

    .line 572
    .line 573
    const/16 v5, 0x856

    .line 574
    .line 575
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 576
    .line 577
    .line 578
    const-string v4, "Referred-By"

    .line 579
    .line 580
    const/16 v5, 0x854

    .line 581
    .line 582
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 583
    .line 584
    .line 585
    const-string v4, "Replaces"

    .line 586
    .line 587
    const/16 v5, 0x857

    .line 588
    .line 589
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 590
    .line 591
    .line 592
    const-string v4, "Join"

    .line 593
    .line 594
    const/16 v5, 0x85c

    .line 595
    .line 596
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 597
    .line 598
    .line 599
    const-string v4, "Path"

    .line 600
    .line 601
    const/16 v5, 0x847

    .line 602
    .line 603
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 604
    .line 605
    .line 606
    const-string v4, "Service-Route"

    .line 607
    .line 608
    const/16 v5, 0x848

    .line 609
    .line 610
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 611
    .line 612
    .line 613
    const-string v4, "P-Asserted-Identity"

    .line 614
    .line 615
    const/16 v5, 0x849

    .line 616
    .line 617
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    const-string v4, "P-Preferred-Identity"

    .line 621
    .line 622
    const/16 v5, 0x84a

    .line 623
    .line 624
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 625
    .line 626
    .line 627
    const-string v4, "Privacy"

    .line 628
    .line 629
    const/16 v5, 0x84e

    .line 630
    .line 631
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 632
    .line 633
    .line 634
    const-string v4, "P-Called-Party-ID"

    .line 635
    .line 636
    const/16 v5, 0x850

    .line 637
    .line 638
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 639
    .line 640
    .line 641
    const-string v4, "P-Associated-URI"

    .line 642
    .line 643
    const/16 v5, 0x851

    .line 644
    .line 645
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 646
    .line 647
    .line 648
    const-string v4, "P-Visited-Network-ID"

    .line 649
    .line 650
    const/16 v5, 0x84b

    .line 651
    .line 652
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 653
    .line 654
    .line 655
    const-string v4, "P-Charging-Function-Addresses"

    .line 656
    .line 657
    const/16 v5, 0x84c

    .line 658
    .line 659
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 660
    .line 661
    .line 662
    const-string v4, "P-Charging-Vector"

    .line 663
    .line 664
    const/16 v5, 0x84d

    .line 665
    .line 666
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 667
    .line 668
    .line 669
    const-string v4, "P-Access-Network-Info"

    .line 670
    .line 671
    const/16 v5, 0x84f

    .line 672
    .line 673
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 674
    .line 675
    .line 676
    const-string v4, "P-Media-Authorization"

    .line 677
    .line 678
    const/16 v5, 0x852

    .line 679
    .line 680
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 681
    .line 682
    .line 683
    const-string v4, "Security-Server"

    .line 684
    .line 685
    const/16 v5, 0x859

    .line 686
    .line 687
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 688
    .line 689
    .line 690
    const-string v4, "Security-Verify"

    .line 691
    .line 692
    const/16 v5, 0x85b

    .line 693
    .line 694
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 695
    .line 696
    .line 697
    const-string v4, "Security-Client"

    .line 698
    .line 699
    const/16 v5, 0x85a

    .line 700
    .line 701
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 702
    .line 703
    .line 704
    const-string v4, "P-User-Database"

    .line 705
    .line 706
    const/16 v5, 0x85d    # 3.0E-42f

    .line 707
    .line 708
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 709
    .line 710
    .line 711
    const-string v4, "P-Profile-Key"

    .line 712
    .line 713
    const/16 v5, 0x85e

    .line 714
    .line 715
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 716
    .line 717
    .line 718
    const-string v4, "P-Served-User"

    .line 719
    .line 720
    const/16 v5, 0x85f

    .line 721
    .line 722
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 723
    .line 724
    .line 725
    const-string v4, "P-Preferred-Service"

    .line 726
    .line 727
    const/16 v5, 0x860

    .line 728
    .line 729
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 730
    .line 731
    .line 732
    const-string v4, "P-Asserted-Service"

    .line 733
    .line 734
    const/16 v5, 0x861

    .line 735
    .line 736
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 737
    .line 738
    .line 739
    const-string v4, "References"

    .line 740
    .line 741
    const/16 v5, 0x862

    .line 742
    .line 743
    invoke-virtual {v0, v4, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 744
    .line 745
    .line 746
    goto :goto_0

    .line 747
    :cond_1
    const-string v4, "status_lineLexer"

    .line 748
    .line 749
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    if-eqz v4, :cond_2

    .line 754
    .line 755
    invoke-virtual {v0, v8, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 756
    .line 757
    .line 758
    goto :goto_0

    .line 759
    :cond_2
    const-string v4, "request_lineLexer"

    .line 760
    .line 761
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v4

    .line 765
    if-eqz v4, :cond_3

    .line 766
    .line 767
    invoke-virtual {v0, v8, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 768
    .line 769
    .line 770
    goto :goto_0

    .line 771
    :cond_3
    const-string v4, "sip_urlLexer"

    .line 772
    .line 773
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-eqz v4, :cond_4

    .line 778
    .line 779
    const-string v4, "tel"

    .line 780
    .line 781
    const/16 v9, 0x839

    .line 782
    .line 783
    invoke-virtual {v0, v4, v9}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0, v8, v7}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v6, v5}, Landroid/gov/nist/core/LexerCore;->addKeyword(Ljava/lang/String;I)V

    .line 790
    .line 791
    .line 792
    :cond_4
    :goto_0
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 797
    .line 798
    if-nez v1, :cond_5

    .line 799
    .line 800
    goto :goto_1

    .line 801
    :cond_5
    move-object v3, v1

    .line 802
    :goto_1
    iput-object v3, v0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 803
    .line 804
    return-void

    .line 805
    :cond_6
    iput-object v3, v0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 806
    .line 807
    return-void
.end method
