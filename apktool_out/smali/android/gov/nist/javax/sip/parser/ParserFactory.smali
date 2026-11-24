.class public Landroid/gov/nist/javax/sip/parser/ParserFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static constructorArgs:[Ljava/lang/Class;

.field private static parserConstructorCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Constructor;",
            ">;"
        }
    .end annotation
.end field

.field private static parserTable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/gov/nist/javax/sip/parser/HeaderParser;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x5a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserConstructorCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    new-array v0, v0, [Ljava/lang/Class;

    .line 19
    .line 20
    sput-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->constructorArgs:[Ljava/lang/Class;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const-class v2, Ljava/lang/String;

    .line 24
    .line 25
    aput-object v2, v0, v1

    .line 26
    .line 27
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 28
    .line 29
    const-string v1, "Reply-To"

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, Landroid/gov/nist/javax/sip/parser/ReplyToParser;

    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 41
    .line 42
    const-string v1, "In-Reply-To"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-class v2, Landroid/gov/nist/javax/sip/parser/InReplyToParser;

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 54
    .line 55
    const-string v1, "Accept-Encoding"

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-class v2, Landroid/gov/nist/javax/sip/parser/AcceptEncodingParser;

    .line 62
    .line 63
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 67
    .line 68
    const-string v1, "Accept-Language"

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-class v2, Landroid/gov/nist/javax/sip/parser/AcceptLanguageParser;

    .line 75
    .line 76
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 80
    .line 81
    const-string v1, "t"

    .line 82
    .line 83
    const-class v2, Landroid/gov/nist/javax/sip/parser/ToParser;

    .line 84
    .line 85
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 89
    .line 90
    const-string v1, "To"

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 100
    .line 101
    const-string v1, "From"

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-class v2, Landroid/gov/nist/javax/sip/parser/FromParser;

    .line 108
    .line 109
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 113
    .line 114
    const-string v1, "f"

    .line 115
    .line 116
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 120
    .line 121
    const-string v1, "CSeq"

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-class v2, Landroid/gov/nist/javax/sip/parser/CSeqParser;

    .line 128
    .line 129
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 133
    .line 134
    const-string v1, "Via"

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-class v2, Landroid/gov/nist/javax/sip/parser/ViaParser;

    .line 141
    .line 142
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 146
    .line 147
    const-string v1, "v"

    .line 148
    .line 149
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 153
    .line 154
    const-string v1, "Contact"

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContactParser;

    .line 161
    .line 162
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 166
    .line 167
    const-string v1, "m"

    .line 168
    .line 169
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 173
    .line 174
    const-string v1, "Content-Type"

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContentTypeParser;

    .line 181
    .line 182
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 186
    .line 187
    const-string v1, "c"

    .line 188
    .line 189
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 193
    .line 194
    const-string v1, "Content-Length"

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContentLengthParser;

    .line 201
    .line 202
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 206
    .line 207
    const-string v1, "l"

    .line 208
    .line 209
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 213
    .line 214
    const-string v1, "Authorization"

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-class v2, Landroid/gov/nist/javax/sip/parser/AuthorizationParser;

    .line 221
    .line 222
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 226
    .line 227
    const-string v1, "WWW-Authenticate"

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    const-class v2, Landroid/gov/nist/javax/sip/parser/WWWAuthenticateParser;

    .line 234
    .line 235
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 239
    .line 240
    const-string v1, "Call-ID"

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    const-class v2, Landroid/gov/nist/javax/sip/parser/CallIDParser;

    .line 247
    .line 248
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 252
    .line 253
    const-string v1, "i"

    .line 254
    .line 255
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 259
    .line 260
    const-string v1, "Route"

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    const-class v2, Landroid/gov/nist/javax/sip/parser/RouteParser;

    .line 267
    .line 268
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 272
    .line 273
    const-string v1, "Record-Route"

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    const-class v2, Landroid/gov/nist/javax/sip/parser/RecordRouteParser;

    .line 280
    .line 281
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 285
    .line 286
    const-string v1, "Date"

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-class v2, Landroid/gov/nist/javax/sip/parser/DateParser;

    .line 293
    .line 294
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 298
    .line 299
    const-string v1, "Proxy-Authorization"

    .line 300
    .line 301
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    const-class v2, Landroid/gov/nist/javax/sip/parser/ProxyAuthorizationParser;

    .line 306
    .line 307
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 311
    .line 312
    const-string v1, "Proxy-Authenticate"

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    const-class v2, Landroid/gov/nist/javax/sip/parser/ProxyAuthenticateParser;

    .line 319
    .line 320
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 324
    .line 325
    const-string v1, "Retry-After"

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const-class v2, Landroid/gov/nist/javax/sip/parser/RetryAfterParser;

    .line 332
    .line 333
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 337
    .line 338
    const-string v1, "Require"

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    const-class v2, Landroid/gov/nist/javax/sip/parser/RequireParser;

    .line 345
    .line 346
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 350
    .line 351
    const-string v1, "Proxy-Require"

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    const-class v2, Landroid/gov/nist/javax/sip/parser/ProxyRequireParser;

    .line 358
    .line 359
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 363
    .line 364
    const-string v1, "Timestamp"

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    const-class v2, Landroid/gov/nist/javax/sip/parser/TimeStampParser;

    .line 371
    .line 372
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 376
    .line 377
    const-string v1, "Unsupported"

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    const-class v2, Landroid/gov/nist/javax/sip/parser/UnsupportedParser;

    .line 384
    .line 385
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 389
    .line 390
    const-string v1, "User-Agent"

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    const-class v2, Landroid/gov/nist/javax/sip/parser/UserAgentParser;

    .line 397
    .line 398
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 402
    .line 403
    const-string v1, "Supported"

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    const-class v2, Landroid/gov/nist/javax/sip/parser/SupportedParser;

    .line 410
    .line 411
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 415
    .line 416
    const-string v1, "k"

    .line 417
    .line 418
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 422
    .line 423
    const-string v1, "Server"

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    const-class v2, Landroid/gov/nist/javax/sip/parser/ServerParser;

    .line 430
    .line 431
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 435
    .line 436
    const-string v1, "Subject"

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const-class v2, Landroid/gov/nist/javax/sip/parser/SubjectParser;

    .line 443
    .line 444
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 448
    .line 449
    const-string v1, "s"

    .line 450
    .line 451
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 455
    .line 456
    const-string v1, "Subscription-State"

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    const-class v2, Landroid/gov/nist/javax/sip/parser/SubscriptionStateParser;

    .line 463
    .line 464
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 468
    .line 469
    const-string v1, "Max-Forwards"

    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    const-class v2, Landroid/gov/nist/javax/sip/parser/MaxForwardsParser;

    .line 476
    .line 477
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 481
    .line 482
    const-string v1, "MIME-Version"

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const-class v2, Landroid/gov/nist/javax/sip/parser/MimeVersionParser;

    .line 489
    .line 490
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 494
    .line 495
    const-string v1, "Min-Expires"

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    const-class v2, Landroid/gov/nist/javax/sip/parser/MinExpiresParser;

    .line 502
    .line 503
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 507
    .line 508
    const-string v1, "Organization"

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    const-class v2, Landroid/gov/nist/javax/sip/parser/OrganizationParser;

    .line 515
    .line 516
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 520
    .line 521
    const-string v1, "Priority"

    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    const-class v2, Landroid/gov/nist/javax/sip/parser/PriorityParser;

    .line 528
    .line 529
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 533
    .line 534
    const-string v1, "RAck"

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    const-class v2, Landroid/gov/nist/javax/sip/parser/RAckParser;

    .line 541
    .line 542
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 546
    .line 547
    const-string v1, "RSeq"

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    const-class v2, Landroid/gov/nist/javax/sip/parser/RSeqParser;

    .line 554
    .line 555
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 559
    .line 560
    const-string v1, "Reason"

    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    const-class v2, Landroid/gov/nist/javax/sip/parser/ReasonParser;

    .line 567
    .line 568
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 572
    .line 573
    const-string v1, "Warning"

    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    const-class v2, Landroid/gov/nist/javax/sip/parser/WarningParser;

    .line 580
    .line 581
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 585
    .line 586
    const-string v1, "Expires"

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    const-class v2, Landroid/gov/nist/javax/sip/parser/ExpiresParser;

    .line 593
    .line 594
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 598
    .line 599
    const-string v1, "Event"

    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    const-class v2, Landroid/gov/nist/javax/sip/parser/EventParser;

    .line 606
    .line 607
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 611
    .line 612
    const-string v1, "o"

    .line 613
    .line 614
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 618
    .line 619
    const-string v1, "Error-Info"

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    const-class v2, Landroid/gov/nist/javax/sip/parser/ErrorInfoParser;

    .line 626
    .line 627
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 631
    .line 632
    const-string v1, "Content-Language"

    .line 633
    .line 634
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContentLanguageParser;

    .line 639
    .line 640
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 644
    .line 645
    const-string v1, "Content-Encoding"

    .line 646
    .line 647
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContentEncodingParser;

    .line 652
    .line 653
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 657
    .line 658
    const-string v1, "e"

    .line 659
    .line 660
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 664
    .line 665
    const-string v1, "Content-Disposition"

    .line 666
    .line 667
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    const-class v2, Landroid/gov/nist/javax/sip/parser/ContentDispositionParser;

    .line 672
    .line 673
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 677
    .line 678
    const-string v1, "Call-Info"

    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    const-class v2, Landroid/gov/nist/javax/sip/parser/CallInfoParser;

    .line 685
    .line 686
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 690
    .line 691
    const-string v1, "Authentication-Info"

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    const-class v2, Landroid/gov/nist/javax/sip/parser/AuthenticationInfoParser;

    .line 698
    .line 699
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 703
    .line 704
    const-string v1, "Allow"

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    const-class v2, Landroid/gov/nist/javax/sip/parser/AllowParser;

    .line 711
    .line 712
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 716
    .line 717
    const-string v1, "Allow-Events"

    .line 718
    .line 719
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    const-class v2, Landroid/gov/nist/javax/sip/parser/AllowEventsParser;

    .line 724
    .line 725
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 729
    .line 730
    const-string v1, "u"

    .line 731
    .line 732
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 736
    .line 737
    const-string v1, "Alert-Info"

    .line 738
    .line 739
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    const-class v2, Landroid/gov/nist/javax/sip/parser/AlertInfoParser;

    .line 744
    .line 745
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 749
    .line 750
    const-string v1, "Accept"

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    const-class v2, Landroid/gov/nist/javax/sip/parser/AcceptParser;

    .line 757
    .line 758
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 762
    .line 763
    const-string v1, "Refer-To"

    .line 764
    .line 765
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    const-class v2, Landroid/gov/nist/javax/sip/parser/ReferToParser;

    .line 770
    .line 771
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 775
    .line 776
    const-string v1, "r"

    .line 777
    .line 778
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 782
    .line 783
    const-string v1, "SIP-ETag"

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    const-class v3, Landroid/gov/nist/javax/sip/parser/SIPETagParser;

    .line 790
    .line 791
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 795
    .line 796
    const-string v1, "SIP-If-Match"

    .line 797
    .line 798
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    const-class v3, Landroid/gov/nist/javax/sip/parser/SIPIfMatchParser;

    .line 803
    .line 804
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 808
    .line 809
    const-string v1, "P-Access-Network-Info"

    .line 810
    .line 811
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PAccessNetworkInfoParser;

    .line 816
    .line 817
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 821
    .line 822
    const-string v1, "P-Asserted-Identity"

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PAssertedIdentityParser;

    .line 829
    .line 830
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 834
    .line 835
    const-string v1, "P-Preferred-Identity"

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PPreferredIdentityParser;

    .line 842
    .line 843
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 847
    .line 848
    const-string v1, "P-Charging-Vector"

    .line 849
    .line 850
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PChargingVectorParser;

    .line 855
    .line 856
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 860
    .line 861
    const-string v1, "P-Charging-Function-Addresses"

    .line 862
    .line 863
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PChargingFunctionAddressesParser;

    .line 868
    .line 869
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 873
    .line 874
    const-string v1, "P-Media-Authorization"

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PMediaAuthorizationParser;

    .line 881
    .line 882
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 886
    .line 887
    const-string v1, "Path"

    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PathParser;

    .line 894
    .line 895
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 899
    .line 900
    const-string v1, "Privacy"

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PrivacyParser;

    .line 907
    .line 908
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 912
    .line 913
    const-string v1, "Service-Route"

    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/ServiceRouteParser;

    .line 920
    .line 921
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 925
    .line 926
    const-string v1, "P-Visited-Network-ID"

    .line 927
    .line 928
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PVisitedNetworkIDParser;

    .line 933
    .line 934
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 938
    .line 939
    const-string v1, "P-Served-User"

    .line 940
    .line 941
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PServedUserParser;

    .line 946
    .line 947
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 951
    .line 952
    const-string v1, "P-Preferred-Service"

    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PPreferredServiceParser;

    .line 959
    .line 960
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 964
    .line 965
    const-string v1, "P-Asserted-Service"

    .line 966
    .line 967
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PAssertedServiceParser;

    .line 972
    .line 973
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 977
    .line 978
    const-string v1, "P-Profile-Key"

    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PProfileKeyParser;

    .line 985
    .line 986
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 990
    .line 991
    const-string v1, "P-User-Database"

    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PUserDatabaseParser;

    .line 998
    .line 999
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1003
    .line 1004
    const-string v1, "P-Associated-URI"

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PAssociatedURIParser;

    .line 1011
    .line 1012
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1016
    .line 1017
    const-string v1, "P-Called-Party-ID"

    .line 1018
    .line 1019
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/PCalledPartyIDParser;

    .line 1024
    .line 1025
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1029
    .line 1030
    const-string v1, "Security-Server"

    .line 1031
    .line 1032
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/SecurityServerParser;

    .line 1037
    .line 1038
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1042
    .line 1043
    const-string v1, "Security-Client"

    .line 1044
    .line 1045
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/SecurityClientParser;

    .line 1050
    .line 1051
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1055
    .line 1056
    const-string v1, "Security-Verify"

    .line 1057
    .line 1058
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    const-class v3, Landroid/gov/nist/javax/sip/parser/ims/SecurityVerifyParser;

    .line 1063
    .line 1064
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1068
    .line 1069
    const-string v1, "Referred-By"

    .line 1070
    .line 1071
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    const-class v3, Landroid/gov/nist/javax/sip/parser/extensions/ReferredByParser;

    .line 1076
    .line 1077
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1081
    .line 1082
    const-string v1, "b"

    .line 1083
    .line 1084
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1088
    .line 1089
    const-string v1, "Session-Expires"

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    const-class v2, Landroid/gov/nist/javax/sip/parser/extensions/SessionExpiresParser;

    .line 1096
    .line 1097
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1101
    .line 1102
    const-string v1, "x"

    .line 1103
    .line 1104
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1108
    .line 1109
    const-string v1, "Min-SE"

    .line 1110
    .line 1111
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    const-class v2, Landroid/gov/nist/javax/sip/parser/extensions/MinSEParser;

    .line 1116
    .line 1117
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1121
    .line 1122
    const-string v1, "Replaces"

    .line 1123
    .line 1124
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    const-class v2, Landroid/gov/nist/javax/sip/parser/extensions/ReplacesParser;

    .line 1129
    .line 1130
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1134
    .line 1135
    const-string v1, "Join"

    .line 1136
    .line 1137
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    const-class v2, Landroid/gov/nist/javax/sip/parser/extensions/JoinParser;

    .line 1142
    .line 1143
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 1147
    .line 1148
    const-string v1, "References"

    .line 1149
    .line 1150
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    const-class v2, Landroid/gov/nist/javax/sip/parser/extensions/ReferencesParser;

    .line 1155
    .line 1156
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addToParserTable(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/gov/nist/javax/sip/parser/HeaderParser;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static createParser(Ljava/lang/String;)Landroid/gov/nist/javax/sip/parser/HeaderParser;
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/Lexer;->getHeaderName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/Lexer;->getHeaderValue(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    sget-object v1, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserTable:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserConstructorCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    sget-object v1, Landroid/gov/nist/javax/sip/parser/ParserFactory;->constructorArgs:[Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v3, Landroid/gov/nist/javax/sip/parser/ParserFactory;->parserConstructorCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Landroid/gov/nist/javax/sip/parser/HeaderParser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    return-object p0

    .line 63
    :goto_1
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_1
    new-instance v0, Landroid/gov/nist/javax/sip/parser/HeaderParser;

    .line 68
    .line 69
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    const-string p0, "The header name or value is null"

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-static {v0, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v2
.end method
