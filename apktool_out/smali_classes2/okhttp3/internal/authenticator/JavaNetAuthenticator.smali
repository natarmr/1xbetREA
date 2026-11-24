.class public final Lokhttp3/internal/authenticator/JavaNetAuthenticator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Authenticator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/authenticator/JavaNetAuthenticator$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/authenticator/JavaNetAuthenticator;",
        "Lokhttp3/Authenticator;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lokhttp3/internal/authenticator/JavaNetAuthenticator$WhenMappings;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    iget-object p0, p1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p2, p0}, Lokhttp3/Dns;->a(Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/net/InetAddress;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast p0, Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0
.end method


# virtual methods
.method public final d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;
    .locals 18

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v3, v2, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 6
    .line 7
    iget v0, v2, Lokhttp3/Response;->d:I

    .line 8
    .line 9
    const/16 v4, 0x191

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x197

    .line 13
    .line 14
    if-eq v0, v4, :cond_1

    .line 15
    .line 16
    if-eq v0, v6, :cond_0

    .line 17
    .line 18
    sget-object v0, La/iun;->a:La/iun;

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const-string v0, "Proxy-Authenticate"

    .line 22
    .line 23
    :goto_0
    move-object v4, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-string v0, "WWW-Authenticate"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    sget-object v0, Lokhttp3/internal/http/HttpHeaders;->a:La/qg9;

    .line 29
    .line 30
    new-instance v7, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    move v9, v5

    .line 40
    :goto_2
    if-ge v9, v8, :cond_3

    .line 41
    .line 42
    invoke-static {v3, v9}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    new-instance v0, La/f99;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v9}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v0, v10}, La/f99;->c0(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :try_start_0
    invoke-static {v0, v7}, Lokhttp3/internal/http/HttpHeaders;->b(La/f99;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception v0

    .line 69
    sget-object v10, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 70
    .line 71
    sget-object v10, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 72
    .line 73
    const-string v11, "Unable to parse challenge"

    .line 74
    .line 75
    const/4 v12, 0x5

    .line 76
    invoke-virtual {v10, v12, v11, v0}, Lokhttp3/internal/platform/Platform;->k(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    move-object v0, v7

    .line 83
    :goto_4
    iget-object v3, v2, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 84
    .line 85
    iget-object v4, v3, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 86
    .line 87
    iget v2, v2, Lokhttp3/Response;->d:I

    .line 88
    .line 89
    if-ne v2, v6, :cond_4

    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    :cond_4
    if-eqz v1, :cond_5

    .line 93
    .line 94
    iget-object v2, v1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 95
    .line 96
    if-nez v2, :cond_6

    .line 97
    .line 98
    :cond_5
    sget-object v2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 99
    .line 100
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    const/4 v7, 0x0

    .line 109
    if-eqz v6, :cond_e

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, Lokhttp3/Challenge;

    .line 116
    .line 117
    const-string v8, "Basic"

    .line 118
    .line 119
    iget-object v9, v6, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    if-eqz v1, :cond_a

    .line 129
    .line 130
    iget-object v8, v1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 131
    .line 132
    if-eqz v8, :cond_a

    .line 133
    .line 134
    iget-object v8, v8, Lokhttp3/Address;->a:Lokhttp3/Dns;

    .line 135
    .line 136
    if-nez v8, :cond_9

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_9
    move-object v7, v8

    .line 140
    :cond_a
    :goto_6
    const-string v8, "realm"

    .line 141
    .line 142
    if-eqz v5, :cond_b

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v9, Ljava/net/InetSocketAddress;

    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-static {v2, v4, v7}, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->a(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    iget-object v13, v4, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v7, v6, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 168
    .line 169
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    move-object v14, v7

    .line 174
    check-cast v14, Ljava/lang/String;

    .line 175
    .line 176
    iget-object v15, v6, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->j()Ljava/net/URL;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    sget-object v17, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    .line 183
    .line 184
    invoke-static/range {v10 .. v17}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    goto :goto_7

    .line 189
    :cond_b
    iget-object v9, v4, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v4, v7}, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->a(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    iget v10, v4, Lokhttp3/HttpUrl;->e:I

    .line 199
    .line 200
    iget-object v11, v4, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v12, v6, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 203
    .line 204
    invoke-interface {v12, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    move-object v12, v8

    .line 209
    check-cast v12, Ljava/lang/String;

    .line 210
    .line 211
    iget-object v13, v6, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->j()Ljava/net/URL;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    sget-object v15, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    .line 218
    .line 219
    move-object v8, v9

    .line 220
    move-object v9, v7

    .line 221
    invoke-static/range {v8 .. v15}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    :goto_7
    if-eqz v7, :cond_7

    .line 226
    .line 227
    if-eqz v5, :cond_c

    .line 228
    .line 229
    const-string v0, "Proxy-Authorization"

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_c
    const-string v0, "Authorization"

    .line 233
    .line 234
    :goto_8
    invoke-virtual {v7}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v4, Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([C)V

    .line 251
    .line 252
    .line 253
    iget-object v2, v6, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 254
    .line 255
    const-string v5, "charset"

    .line 256
    .line 257
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, Ljava/lang/String;

    .line 262
    .line 263
    if-eqz v2, :cond_d

    .line 264
    .line 265
    :try_start_1
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :catch_1
    :cond_d
    sget-object v2, Lkotlin/text/Charsets;->d:Ljava/nio/charset/Charset;

    .line 274
    .line 275
    :goto_9
    invoke-static {v1, v4, v2}, Lokhttp3/Credentials;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v3}, Lokhttp3/Request;->a()Lokhttp3/Request$Builder;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v2, v0, v1}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    new-instance v0, Lokhttp3/Request;

    .line 287
    .line 288
    invoke-direct {v0, v2}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :cond_e
    return-object v7
.end method
