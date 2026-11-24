.class public final La/pox;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:La/r6k0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "BYE"

    .line 2
    .line 3
    const-string v1, "OPTIONS"

    .line 4
    .line 5
    const-string v2, "INVITE"

    .line 6
    .line 7
    const-string v3, "ACK"

    .line 8
    .line 9
    const-string v4, "CANCEL"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/pox;->b:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(La/r6k0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pox;->a:La/r6k0;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/javax/sip/message/Request;Landroid/javax/sip/header/HeaderFactory;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v0}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v1}, La/n7x;->J(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-interface {p0, v1}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    invoke-interface {p1, v1, v0}, Landroid/javax/sip/header/HeaderFactory;->createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p0, v0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/mmk;La/nmk;Ljava/lang/String;Ljava/util/Map;I)Landroid/javax/sip/message/Request;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    move-object/from16 v5, p9

    .line 12
    .line 13
    move-object/from16 v6, p3

    .line 14
    .line 15
    invoke-static {v0, v1, v6, v2, v3}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object/from16 v7, p0

    .line 25
    .line 26
    iget-object v7, v7, La/pox;->a:La/r6k0;

    .line 27
    .line 28
    invoke-virtual {v7}, La/r6k0;->d()Landroid/javax/sip/header/HeaderFactory;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-virtual {v7}, La/r6k0;->c()Landroid/javax/sip/address/AddressFactory;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v7}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    invoke-static {v6}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    new-instance v11, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v12, "sip:"

    .line 47
    .line 48
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v13, "@"

    .line 55
    .line 56
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v9, v2}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v11, ""

    .line 74
    .line 75
    if-nez p5, :cond_0

    .line 76
    .line 77
    move-object v14, v11

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object/from16 v14, p5

    .line 80
    .line 81
    :goto_0
    invoke-static {v14}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    if-lez v15, :cond_1

    .line 90
    .line 91
    invoke-interface {v2, v14}, Landroid/javax/sip/address/Address;->setDisplayName(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {v12, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    invoke-interface {v9, v14}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    invoke-interface {v9, v15}, Landroid/javax/sip/address/AddressFactory;->createURI(Ljava/lang/String;)Landroid/javax/sip/address/URI;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 114
    .line 115
    .line 116
    move-result-object v16

    .line 117
    move-object/from16 p0, v7

    .line 118
    .line 119
    invoke-virtual/range {v16 .. v16}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-object/from16 v16, v10

    .line 127
    .line 128
    const-string v10, "-"

    .line 129
    .line 130
    move-object/from16 p3, v12

    .line 131
    .line 132
    const/4 v12, 0x0

    .line 133
    invoke-static {v7, v10, v11, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-string v10, "z9hG4bK"

    .line 138
    .line 139
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-interface {v8, v2, v3}, Landroid/javax/sip/header/HeaderFactory;->createFromHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/FromHeader;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    invoke-interface {v8, v14, v3}, Landroid/javax/sip/header/HeaderFactory;->createToHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/ToHeader;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-object/from16 v10, p7

    .line 159
    .line 160
    invoke-interface {v8, v10}, Landroid/javax/sip/header/HeaderFactory;->createCallIdHeader(Ljava/lang/String;)Landroid/javax/sip/header/CallIdHeader;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const-string v11, "INVITE"

    .line 168
    .line 169
    move-object/from16 p4, v2

    .line 170
    .line 171
    move-object/from16 p5, v3

    .line 172
    .line 173
    const-wide/16 v2, 0x2

    .line 174
    .line 175
    invoke-interface {v8, v2, v3, v11}, Landroid/javax/sip/header/HeaderFactory;->createCSeqHeader(JLjava/lang/String;)Landroid/javax/sip/header/CSeqHeader;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {p0 .. p0}, La/r6k0;->i()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const-string v3, "UDP"

    .line 187
    .line 188
    invoke-interface {v8, v1, v2, v3, v7}, Landroid/javax/sip/header/HeaderFactory;->createViaHeader(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ViaHeader;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-interface {v2}, Landroid/javax/sip/header/ViaHeader;->setRPort()V

    .line 196
    .line 197
    .line 198
    const/16 v3, 0x46

    .line 199
    .line 200
    invoke-interface {v8, v3}, Landroid/javax/sip/header/HeaderFactory;->createMaxForwardsHeader(I)Landroid/javax/sip/header/MaxForwardsHeader;

    .line 201
    .line 202
    .line 203
    move-result-object v18

    .line 204
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    const-string v12, "INVITE"

    .line 208
    .line 209
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v17

    .line 213
    move-object/from16 v2, p3

    .line 214
    .line 215
    move-object v3, v13

    .line 216
    move-object v11, v15

    .line 217
    move-object/from16 v15, p4

    .line 218
    .line 219
    move-object v13, v10

    .line 220
    move-object/from16 v10, v16

    .line 221
    .line 222
    move-object/from16 v16, p5

    .line 223
    .line 224
    invoke-interface/range {v10 .. v18}, Landroid/javax/sip/message/MessageFactory;->createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;)Landroid/javax/sip/message/Request;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {p0 .. p0}, La/r6k0;->i()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    const-string v11, ":"

    .line 236
    .line 237
    invoke-static {v2, v6, v3, v1, v11}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-interface {v9, v1}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-interface {v8, v1}, Landroid/javax/sip/header/HeaderFactory;->createContactHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ContactHeader;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-interface {v7, v1}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 257
    .line 258
    .line 259
    const-string v1, "gruu"

    .line 260
    .line 261
    const-string v3, "path"

    .line 262
    .line 263
    const-string v10, "replaces"

    .line 264
    .line 265
    const-string v11, "outbound"

    .line 266
    .line 267
    filled-new-array {v10, v11, v1, v3}, [Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_2

    .line 284
    .line 285
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    check-cast v3, Ljava/lang/String;

    .line 290
    .line 291
    invoke-interface {v8, v3}, Landroid/javax/sip/header/HeaderFactory;->createSupportedHeader(Ljava/lang/String;)Landroid/javax/sip/header/SupportedHeader;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-interface {v7, v3}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_2
    sget-object v1, La/pox;->b:Ljava/util/List;

    .line 300
    .line 301
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_3

    .line 310
    .line 311
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    check-cast v3, Ljava/lang/String;

    .line 316
    .line 317
    invoke-interface {v8, v3}, Landroid/javax/sip/header/HeaderFactory;->createAllowHeader(Ljava/lang/String;)Landroid/javax/sip/header/AllowHeader;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-interface {v7, v3}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_3
    const/16 v1, 0x197

    .line 326
    .line 327
    const-string v3, "Digest"

    .line 328
    .line 329
    move/from16 v10, p12

    .line 330
    .line 331
    if-ne v10, v1, :cond_4

    .line 332
    .line 333
    invoke-interface {v8, v3}, Landroid/javax/sip/header/HeaderFactory;->createProxyAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_4
    invoke-interface {v8, v3}, Landroid/javax/sip/header/HeaderFactory;->createAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/AuthorizationHeader;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    :goto_3
    invoke-interface {v1, v6}, Landroid/javax/sip/header/AuthorizationHeader;->setUsername(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    iget-object v3, v4, La/mmk;->a:Ljava/lang/String;

    .line 352
    .line 353
    invoke-interface {v1, v3}, Landroid/javax/sip/header/AuthorizationHeader;->setRealm(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    iget-object v3, v4, La/mmk;->b:Ljava/lang/String;

    .line 357
    .line 358
    invoke-interface {v1, v3}, Landroid/javax/sip/header/AuthorizationHeader;->setNonce(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-interface {v9, v0}, Landroid/javax/sip/address/AddressFactory;->createURI(Ljava/lang/String;)Landroid/javax/sip/address/URI;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setURI(Landroid/javax/sip/address/URI;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v5, La/nmk;->a:Ljava/lang/String;

    .line 373
    .line 374
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setResponse(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    iget-object v0, v4, La/mmk;->c:Ljava/lang/String;

    .line 378
    .line 379
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setAlgorithm(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v5, La/nmk;->b:Ljava/lang/String;

    .line 383
    .line 384
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setCNonce(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, v5, La/nmk;->c:Ljava/lang/String;

    .line 388
    .line 389
    const/16 v2, 0x10

    .line 390
    .line 391
    invoke-static {v2}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-static {v0, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setNonceCount(I)V

    .line 400
    .line 401
    .line 402
    iget-object v0, v4, La/mmk;->d:Ljava/lang/String;

    .line 403
    .line 404
    invoke-interface {v1, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setQop(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    iget-object v0, v4, La/mmk;->e:Ljava/lang/String;

    .line 408
    .line 409
    if-eqz v0, :cond_5

    .line 410
    .line 411
    const-string v2, "opaque"

    .line 412
    .line 413
    invoke-interface {v1, v2, v0}, Landroid/javax/sip/header/Parameters;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_5
    invoke-interface {v7, v1}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 417
    .line 418
    .line 419
    const-string v0, "Session-Expires"

    .line 420
    .line 421
    const-string v1, "1800;refresher=uac"

    .line 422
    .line 423
    invoke-interface {v8, v0, v1}, Landroid/javax/sip/header/HeaderFactory;->createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-interface {v7, v0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v0, p11

    .line 431
    .line 432
    invoke-static {v7, v8, v0}, La/pox;->a(Landroid/javax/sip/message/Request;Landroid/javax/sip/header/HeaderFactory;Ljava/util/Map;)V

    .line 433
    .line 434
    .line 435
    const-string v0, "application"

    .line 436
    .line 437
    const-string v1, "sdp"

    .line 438
    .line 439
    invoke-interface {v8, v0, v1}, Landroid/javax/sip/header/HeaderFactory;->createContentTypeHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ContentTypeHeader;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 447
    .line 448
    move-object/from16 v2, p10

    .line 449
    .line 450
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-interface {v7, v1, v0}, Landroid/javax/sip/message/Message;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 458
    .line 459
    .line 460
    return-object v7
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/javax/sip/message/Request;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p0

    .line 15
    .line 16
    iget-object v2, v2, La/pox;->a:La/r6k0;

    .line 17
    .line 18
    invoke-virtual {v2}, La/r6k0;->d()Landroid/javax/sip/header/HeaderFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2}, La/r6k0;->c()Landroid/javax/sip/address/AddressFactory;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v2}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static/range {p3 .. p3}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v14

    .line 34
    if-nez p4, :cond_0

    .line 35
    .line 36
    move-object v6, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object/from16 v6, p4

    .line 39
    .line 40
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v15, "sip:"

    .line 43
    .line 44
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v8, "@"

    .line 51
    .line 52
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v4, v6}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    if-nez p5, :cond_1

    .line 70
    .line 71
    const-string v7, ""

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object/from16 v7, p5

    .line 75
    .line 76
    :goto_1
    invoke-static {v7}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-lez v9, :cond_2

    .line 85
    .line 86
    invoke-interface {v6, v7}, Landroid/javax/sip/address/Address;->setDisplayName(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-interface {v4, v7}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v4, v0}, Landroid/javax/sip/address/AddressFactory;->createURI(Ljava/lang/String;)Landroid/javax/sip/address/URI;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object/from16 v9, p7

    .line 109
    .line 110
    invoke-interface {v3, v6, v9}, Landroid/javax/sip/header/HeaderFactory;->createFromHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/FromHeader;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-interface {v3, v7, v6}, Landroid/javax/sip/header/HeaderFactory;->createToHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/ToHeader;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-object/from16 v6, p6

    .line 126
    .line 127
    invoke-interface {v3, v6}, Landroid/javax/sip/header/HeaderFactory;->createCallIdHeader(Ljava/lang/String;)Landroid/javax/sip/header/CallIdHeader;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const-string v7, "INVITE"

    .line 135
    .line 136
    const-wide/16 v12, 0x1

    .line 137
    .line 138
    invoke-interface {v3, v12, v13, v7}, Landroid/javax/sip/header/HeaderFactory;->createCSeqHeader(JLjava/lang/String;)Landroid/javax/sip/header/CSeqHeader;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, La/r6k0;->i()I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    const-string v12, "UDP"

    .line 150
    .line 151
    move-object/from16 v13, p8

    .line 152
    .line 153
    invoke-interface {v3, v1, v7, v12, v13}, Landroid/javax/sip/header/HeaderFactory;->createViaHeader(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ViaHeader;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-interface {v7}, Landroid/javax/sip/header/ViaHeader;->setRPort()V

    .line 161
    .line 162
    .line 163
    const/16 v12, 0x46

    .line 164
    .line 165
    invoke-interface {v3, v12}, Landroid/javax/sip/header/HeaderFactory;->createMaxForwardsHeader(I)Landroid/javax/sip/header/MaxForwardsHeader;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-object v12, v7

    .line 173
    const-string v7, "INVITE"

    .line 174
    .line 175
    invoke-static {v12}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    move-object/from16 v16, v6

    .line 180
    .line 181
    move-object v6, v0

    .line 182
    move-object v0, v8

    .line 183
    move-object/from16 v8, v16

    .line 184
    .line 185
    invoke-interface/range {v5 .. v13}, Landroid/javax/sip/message/MessageFactory;->createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;)Landroid/javax/sip/message/Request;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, La/r6k0;->i()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    const-string v7, ":"

    .line 208
    .line 209
    invoke-static {v15, v14, v0, v1, v7}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v1, ";gr=urn:uuid:"

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v4, v0}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v3, v0}, Landroid/javax/sip/header/HeaderFactory;->createContactHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ContactHeader;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v2, "\"<urn:uuid:"

    .line 239
    .line 240
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v2, ">\""

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const-string v2, "+sip.instance"

    .line 256
    .line 257
    invoke-interface {v0, v2, v1}, Landroid/javax/sip/header/Parameters;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v5, v0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 261
    .line 262
    .line 263
    const-string v0, "gruu"

    .line 264
    .line 265
    const-string v1, "path"

    .line 266
    .line 267
    const-string v2, "replaces"

    .line 268
    .line 269
    const-string v4, "outbound"

    .line 270
    .line 271
    filled-new-array {v2, v4, v0, v1}, [Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_3

    .line 288
    .line 289
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, Ljava/lang/String;

    .line 294
    .line 295
    invoke-interface {v3, v1}, Landroid/javax/sip/header/HeaderFactory;->createSupportedHeader(Ljava/lang/String;)Landroid/javax/sip/header/SupportedHeader;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-interface {v5, v1}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_3
    sget-object v0, La/pox;->b:Ljava/util/List;

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_4

    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, Ljava/lang/String;

    .line 320
    .line 321
    invoke-interface {v3, v1}, Landroid/javax/sip/header/HeaderFactory;->createAllowHeader(Ljava/lang/String;)Landroid/javax/sip/header/AllowHeader;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-interface {v5, v1}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_4
    const-string v0, "Session-Expires"

    .line 330
    .line 331
    const-string v1, "1800;refresher=uac"

    .line 332
    .line 333
    invoke-interface {v3, v0, v1}, Landroid/javax/sip/header/HeaderFactory;->createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-interface {v5, v0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v0, p10

    .line 341
    .line 342
    invoke-static {v5, v3, v0}, La/pox;->a(Landroid/javax/sip/message/Request;Landroid/javax/sip/header/HeaderFactory;Ljava/util/Map;)V

    .line 343
    .line 344
    .line 345
    const-string v0, "application"

    .line 346
    .line 347
    const-string v1, "sdp"

    .line 348
    .line 349
    invoke-interface {v3, v0, v1}, Landroid/javax/sip/header/HeaderFactory;->createContentTypeHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ContentTypeHeader;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 357
    .line 358
    move-object/from16 v2, p9

    .line 359
    .line 360
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-interface {v5, v1, v0}, Landroid/javax/sip/message/Message;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 368
    .line 369
    .line 370
    return-object v5
.end method
