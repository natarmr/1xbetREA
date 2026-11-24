.class public Landroid/gov/nist/javax/sip/header/NameMap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/header/SIPHeaderNames;
.implements Landroid/gov/nist/core/PackageNames;


# static fields
.field static nameMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/header/NameMap;->initializeNameMap()V

    .line 2
    .line 3
    .line 4
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

.method public static addExtensionHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/header/NameMap;->nameMap:Ljava/util/Map;

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

.method public static getClassFromName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/header/NameMap;->nameMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    return-object v0
.end method

.method private static initializeNameMap()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0x3f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroid/gov/nist/javax/sip/header/NameMap;->nameMap:Ljava/util/Map;

    .line 9
    .line 10
    const-class v0, Landroid/gov/nist/javax/sip/header/MinExpires;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Min-Expires"

    .line 17
    .line 18
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-class v0, Landroid/gov/nist/javax/sip/header/ErrorInfo;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Error-Info"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-class v0, Landroid/gov/nist/javax/sip/header/MimeVersion;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Landroid/gov/nist/javax/sip/header/Allow;

    .line 39
    .line 40
    const-string v2, "MIME-Version"

    .line 41
    .line 42
    const-class v3, Landroid/gov/nist/javax/sip/header/InReplyTo;

    .line 43
    .line 44
    const-string v4, "In-Reply-To"

    .line 45
    .line 46
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-class v1, Landroid/gov/nist/javax/sip/header/CallInfo;

    .line 51
    .line 52
    const-string v2, "Allow"

    .line 53
    .line 54
    const-class v3, Landroid/gov/nist/javax/sip/header/ContentLanguage;

    .line 55
    .line 56
    const-string v4, "Content-Language"

    .line 57
    .line 58
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-class v1, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 63
    .line 64
    const-string v2, "Call-Info"

    .line 65
    .line 66
    const-class v3, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 67
    .line 68
    const-string v4, "CSeq"

    .line 69
    .line 70
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-class v1, Landroid/gov/nist/javax/sip/header/Accept;

    .line 75
    .line 76
    const-string v2, "Alert-Info"

    .line 77
    .line 78
    const-class v3, Landroid/gov/nist/javax/sip/header/AcceptEncoding;

    .line 79
    .line 80
    const-string v4, "Accept-Encoding"

    .line 81
    .line 82
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-class v1, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 87
    .line 88
    const-string v2, "Accept"

    .line 89
    .line 90
    const-class v3, Landroid/gov/nist/javax/sip/header/AcceptLanguage;

    .line 91
    .line 92
    const-string v4, "Accept-Language"

    .line 93
    .line 94
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-class v1, Landroid/gov/nist/javax/sip/header/To;

    .line 99
    .line 100
    const-string v2, "Record-Route"

    .line 101
    .line 102
    const-class v3, Landroid/gov/nist/javax/sip/header/TimeStamp;

    .line 103
    .line 104
    const-string v4, "Timestamp"

    .line 105
    .line 106
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-class v1, Landroid/gov/nist/javax/sip/header/From;

    .line 111
    .line 112
    const-string v2, "To"

    .line 113
    .line 114
    const-class v3, Landroid/gov/nist/javax/sip/header/Via;

    .line 115
    .line 116
    const-string v4, "Via"

    .line 117
    .line 118
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-class v1, Landroid/gov/nist/javax/sip/header/Authorization;

    .line 123
    .line 124
    const-string v2, "From"

    .line 125
    .line 126
    const-class v3, Landroid/gov/nist/javax/sip/header/CallID;

    .line 127
    .line 128
    const-string v4, "Call-ID"

    .line 129
    .line 130
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-class v1, Landroid/gov/nist/javax/sip/header/Server;

    .line 135
    .line 136
    const-string v2, "Authorization"

    .line 137
    .line 138
    const-class v3, Landroid/gov/nist/javax/sip/header/ProxyAuthenticate;

    .line 139
    .line 140
    const-string v4, "Proxy-Authenticate"

    .line 141
    .line 142
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-class v1, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 147
    .line 148
    const-string v2, "Server"

    .line 149
    .line 150
    const-class v3, Landroid/gov/nist/javax/sip/header/Unsupported;

    .line 151
    .line 152
    const-string v4, "Unsupported"

    .line 153
    .line 154
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-class v1, Landroid/gov/nist/javax/sip/header/ContentEncoding;

    .line 159
    .line 160
    const-string v2, "Retry-After"

    .line 161
    .line 162
    const-class v3, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 163
    .line 164
    const-string v4, "Content-Type"

    .line 165
    .line 166
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-class v1, Landroid/gov/nist/javax/sip/header/Route;

    .line 171
    .line 172
    const-string v2, "Content-Encoding"

    .line 173
    .line 174
    const-class v3, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 175
    .line 176
    const-string v4, "Content-Length"

    .line 177
    .line 178
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-class v1, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 183
    .line 184
    const-string v2, "Route"

    .line 185
    .line 186
    const-class v3, Landroid/gov/nist/javax/sip/header/Contact;

    .line 187
    .line 188
    const-string v4, "Contact"

    .line 189
    .line 190
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-class v1, Landroid/gov/nist/javax/sip/header/Organization;

    .line 195
    .line 196
    const-string v2, "WWW-Authenticate"

    .line 197
    .line 198
    const-class v3, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 199
    .line 200
    const-string v4, "Max-Forwards"

    .line 201
    .line 202
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-class v1, Landroid/gov/nist/javax/sip/header/ProxyRequire;

    .line 207
    .line 208
    const-string v2, "Organization"

    .line 209
    .line 210
    const-class v3, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;

    .line 211
    .line 212
    const-string v4, "Proxy-Authorization"

    .line 213
    .line 214
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const-class v1, Landroid/gov/nist/javax/sip/header/ContentDisposition;

    .line 219
    .line 220
    const-string v2, "Proxy-Require"

    .line 221
    .line 222
    const-class v3, Landroid/gov/nist/javax/sip/header/Require;

    .line 223
    .line 224
    const-string v4, "Require"

    .line 225
    .line 226
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-class v1, Landroid/gov/nist/javax/sip/header/UserAgent;

    .line 231
    .line 232
    const-string v2, "Content-Disposition"

    .line 233
    .line 234
    const-class v3, Landroid/gov/nist/javax/sip/header/Subject;

    .line 235
    .line 236
    const-string v4, "Subject"

    .line 237
    .line 238
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-class v1, Landroid/gov/nist/javax/sip/header/Priority;

    .line 243
    .line 244
    const-string v2, "User-Agent"

    .line 245
    .line 246
    const-class v3, Landroid/gov/nist/javax/sip/header/Warning;

    .line 247
    .line 248
    const-string v4, "Warning"

    .line 249
    .line 250
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-class v1, Landroid/gov/nist/javax/sip/header/Expires;

    .line 255
    .line 256
    const-string v2, "Priority"

    .line 257
    .line 258
    const-class v3, Landroid/gov/nist/javax/sip/header/SIPDateHeader;

    .line 259
    .line 260
    const-string v4, "Date"

    .line 261
    .line 262
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-class v1, Landroid/gov/nist/javax/sip/header/ReplyTo;

    .line 267
    .line 268
    const-string v2, "Expires"

    .line 269
    .line 270
    const-class v3, Landroid/gov/nist/javax/sip/header/Supported;

    .line 271
    .line 272
    const-string v4, "Supported"

    .line 273
    .line 274
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-class v1, Landroid/gov/nist/javax/sip/header/Event;

    .line 279
    .line 280
    const-string v2, "Reply-To"

    .line 281
    .line 282
    const-class v3, Landroid/gov/nist/javax/sip/header/SubscriptionState;

    .line 283
    .line 284
    const-string v4, "Subscription-State"

    .line 285
    .line 286
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const-string v1, "Event"

    .line 291
    .line 292
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-class v0, Landroid/gov/nist/javax/sip/header/AllowEvents;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const-string v1, "Allow-Events"

    .line 302
    .line 303
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const-string v0, "Referred-By"

    .line 307
    .line 308
    const-string v1, "ReferredBy"

    .line 309
    .line 310
    invoke-static {v0, v1}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    const-string v0, "Session-Expires"

    .line 314
    .line 315
    const-string v1, "SessionExpires"

    .line 316
    .line 317
    invoke-static {v0, v1}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const-string v0, "Min-SE"

    .line 321
    .line 322
    const-string v1, "MinSE"

    .line 323
    .line 324
    invoke-static {v0, v1}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v0, "Replaces"

    .line 328
    .line 329
    invoke-static {v0, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    const-string v0, "Join"

    .line 333
    .line 334
    invoke-static {v0, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const-class v0, Landroid/gov/nist/javax/sip/header/ims/PAccessNetworkInfo;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PAssociatedURI;

    .line 344
    .line 345
    const-string v2, "P-Access-Network-Info"

    .line 346
    .line 347
    const-class v3, Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentity;

    .line 348
    .line 349
    const-string v4, "P-Asserted-Identity"

    .line 350
    .line 351
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PChargingFunctionAddresses;

    .line 356
    .line 357
    const-string v2, "P-Associated-URI"

    .line 358
    .line 359
    const-class v3, Landroid/gov/nist/javax/sip/header/ims/PCalledPartyID;

    .line 360
    .line 361
    const-string v4, "P-Called-Party-ID"

    .line 362
    .line 363
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorization;

    .line 368
    .line 369
    const-string v2, "P-Charging-Function-Addresses"

    .line 370
    .line 371
    const-class v3, Landroid/gov/nist/javax/sip/header/ims/PChargingVector;

    .line 372
    .line 373
    const-string v4, "P-Charging-Vector"

    .line 374
    .line 375
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PPreferredIdentity;

    .line 380
    .line 381
    const-string v2, "P-Media-Authorization"

    .line 382
    .line 383
    const-class v3, Landroid/gov/nist/javax/sip/header/ims/Path;

    .line 384
    .line 385
    const-string v4, "Path"

    .line 386
    .line 387
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/ServiceRoute;

    .line 392
    .line 393
    const-string v2, "P-Preferred-Identity"

    .line 394
    .line 395
    const-class v3, Landroid/gov/nist/javax/sip/header/ims/Privacy;

    .line 396
    .line 397
    const-string v4, "Privacy"

    .line 398
    .line 399
    invoke-static {v2, v0, v3, v4, v1}, La/f140;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const-string v1, "Service-Route"

    .line 404
    .line 405
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    const-class v0, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const-string v1, "P-Visited-Network-ID"

    .line 415
    .line 416
    invoke-static {v1, v0}, Landroid/gov/nist/javax/sip/header/NameMap;->putNameMap(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    return-void
.end method

.method public static putNameMap(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/header/NameMap;->nameMap:Ljava/util/Map;

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
