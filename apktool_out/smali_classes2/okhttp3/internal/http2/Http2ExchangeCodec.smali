.class public final Lokhttp3/internal/http2/Http2ExchangeCodec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http/ExchangeCodec;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/http2/Http2ExchangeCodec;",
        "Lokhttp3/internal/http/ExchangeCodec;",
        "Companion",
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


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lokhttp3/internal/connection/RealConnection;

.field public final b:Lokhttp3/internal/http/RealInterceptorChain;

.field public final c:Lokhttp3/internal/http2/Http2Connection;

.field public volatile d:Lokhttp3/internal/http2/Http2Stream;

.field public final e:Lokhttp3/Protocol;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->g:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->h:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->a:Lokhttp3/internal/connection/RealConnection;

    .line 8
    .line 9
    iput-object p3, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->b:Lokhttp3/internal/http/RealInterceptorChain;

    .line 10
    .line 11
    iput-object p4, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 12
    .line 13
    iget-object p1, p1, Lokhttp3/OkHttpClient;->s:Ljava/util/List;

    .line 14
    .line 15
    sget-object p2, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p2, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 25
    .line 26
    :goto_0
    iput-object p2, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->e:Lokhttp3/Protocol;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lokhttp3/internal/http2/Http2Stream;->i:Lokhttp3/internal/http2/Http2Stream$FramingSink;

    .line 7
    .line 8
    invoke-virtual {p0}, Lokhttp3/internal/http2/Http2Stream$FramingSink;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lokhttp3/Response;)La/emk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lokhttp3/internal/http2/Http2Stream;->h:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 7
    .line 8
    return-object p0
.end method

.method public final c(Lokhttp3/Response;)J
    .locals 0

    .line 1
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->e(Lokhttp3/Response;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->f:Z

    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->h:Lokhttp3/internal/http2/ErrorCode;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lokhttp3/internal/http2/Http2Stream;->g(Lokhttp3/internal/http2/ErrorCode;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final d(Lokhttp3/Request;J)La/s5k0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lokhttp3/internal/http2/Http2Stream;->i:Lokhttp3/internal/http2/Http2Stream$FramingSink;

    .line 10
    .line 11
    return-object p0
.end method

.method public final e(Lokhttp3/Request;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p1, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_0
    iget-object v3, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    add-int/lit8 v5, v5, 0x4

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 32
    .line 33
    sget-object v6, Lokhttp3/internal/http2/Header;->f:La/qg9;

    .line 34
    .line 35
    iget-object v7, p1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v5, v6, v7}, Lokhttp3/internal/http2/Header;-><init>(La/qg9;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 44
    .line 45
    sget-object v6, Lokhttp3/internal/http2/Header;->g:La/qg9;

    .line 46
    .line 47
    iget-object v7, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Lokhttp3/HttpUrl;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v7}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    new-instance v10, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/16 v8, 0x3f

    .line 68
    .line 69
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    :cond_2
    invoke-direct {v5, v6, v8}, Lokhttp3/internal/http2/Header;-><init>(La/qg9;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    const-string v5, "Host"

    .line 86
    .line 87
    iget-object p1, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 88
    .line 89
    invoke-virtual {p1, v5}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 96
    .line 97
    sget-object v6, Lokhttp3/internal/http2/Header;->i:La/qg9;

    .line 98
    .line 99
    invoke-direct {v5, v6, p1}, Lokhttp3/internal/http2/Header;-><init>(La/qg9;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_3
    new-instance p1, Lokhttp3/internal/http2/Header;

    .line 106
    .line 107
    sget-object v5, Lokhttp3/internal/http2/Header;->h:La/qg9;

    .line 108
    .line 109
    iget-object v6, v7, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p1, v5, v6}, Lokhttp3/internal/http2/Header;-><init>(La/qg9;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    move v5, v1

    .line 122
    :goto_1
    if-ge v5, p1, :cond_6

    .line 123
    .line 124
    invoke-static {v3, v5}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget-object v7, Lokhttp3/internal/http2/Http2ExchangeCodec;->g:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_4

    .line 147
    .line 148
    const-string v7, "te"

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_5

    .line 155
    .line 156
    invoke-static {v3, v5}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    const-string v8, "trailers"

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    :cond_4
    new-instance v7, Lokhttp3/internal/http2/Header;

    .line 169
    .line 170
    invoke-static {v3, v5}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-direct {v7, v6, v8}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    iget-object v8, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 184
    .line 185
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    xor-int/lit8 v9, v0, 0x1

    .line 189
    .line 190
    iget-object p1, v8, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 191
    .line 192
    monitor-enter p1

    .line 193
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 194
    :try_start_1
    iget v3, v8, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 195
    .line 196
    const v5, 0x3fffffff    # 1.9999999f

    .line 197
    .line 198
    .line 199
    if-le v3, v5, :cond_7

    .line 200
    .line 201
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->g:Lokhttp3/internal/http2/ErrorCode;

    .line 202
    .line 203
    invoke-virtual {v8, v3}, Lokhttp3/internal/http2/Http2Connection;->e(Lokhttp3/internal/http2/ErrorCode;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :catchall_0
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    goto/16 :goto_3

    .line 210
    .line 211
    :cond_7
    :goto_2
    iget-boolean v3, v8, Lokhttp3/internal/http2/Http2Connection;->f:Z

    .line 212
    .line 213
    if-nez v3, :cond_d

    .line 214
    .line 215
    iget v7, v8, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 216
    .line 217
    add-int/lit8 v3, v7, 0x2

    .line 218
    .line 219
    iput v3, v8, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 220
    .line 221
    new-instance v6, Lokhttp3/internal/http2/Http2Stream;

    .line 222
    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v10, 0x0

    .line 225
    invoke-direct/range {v6 .. v11}, Lokhttp3/internal/http2/Http2Stream;-><init>(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V

    .line 226
    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    iget-wide v10, v8, Lokhttp3/internal/http2/Http2Connection;->u:J

    .line 231
    .line 232
    iget-wide v12, v8, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 233
    .line 234
    cmp-long v0, v10, v12

    .line 235
    .line 236
    if-gez v0, :cond_8

    .line 237
    .line 238
    iget-wide v10, v6, Lokhttp3/internal/http2/Http2Stream;->d:J

    .line 239
    .line 240
    iget-wide v12, v6, Lokhttp3/internal/http2/Http2Stream;->e:J

    .line 241
    .line 242
    cmp-long v0, v10, v12

    .line 243
    .line 244
    if-ltz v0, :cond_9

    .line 245
    .line 246
    :cond_8
    move v1, v2

    .line 247
    :cond_9
    invoke-virtual {v6}, Lokhttp3/internal/http2/Http2Stream;->j()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_a

    .line 252
    .line 253
    iget-object v0, v8, Lokhttp3/internal/http2/Http2Connection;->b:Ljava/util/LinkedHashMap;

    .line 254
    .line 255
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 260
    .line 261
    .line 262
    :cond_a
    :try_start_2
    monitor-exit v8

    .line 263
    iget-object v0, v8, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 264
    .line 265
    invoke-virtual {v0, v7, v4, v9}, Lokhttp3/internal/http2/Http2Writer;->k(ILjava/util/ArrayList;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 266
    .line 267
    .line 268
    monitor-exit p1

    .line 269
    if-eqz v1, :cond_b

    .line 270
    .line 271
    iget-object p1, v8, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 272
    .line 273
    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Writer;->flush()V

    .line 274
    .line 275
    .line 276
    :cond_b
    iput-object v6, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 277
    .line 278
    iget-boolean p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->f:Z

    .line 279
    .line 280
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 281
    .line 282
    if-nez p1, :cond_c

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object p1, v0, Lokhttp3/internal/http2/Http2Stream;->j:Lokhttp3/internal/http2/Http2Stream$StreamTimeout;

    .line 288
    .line 289
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->b:Lokhttp3/internal/http/RealInterceptorChain;

    .line 290
    .line 291
    iget v0, v0, Lokhttp3/internal/http/RealInterceptorChain;->g:I

    .line 292
    .line 293
    int-to-long v0, v0

    .line 294
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 295
    .line 296
    invoke-virtual {p1, v0, v1, v2}, La/fmq0;->g(JLjava/util/concurrent/TimeUnit;)La/fmq0;

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object p1, p1, Lokhttp3/internal/http2/Http2Stream;->k:Lokhttp3/internal/http2/Http2Stream$StreamTimeout;

    .line 305
    .line 306
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->b:Lokhttp3/internal/http/RealInterceptorChain;

    .line 307
    .line 308
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->h:I

    .line 309
    .line 310
    int-to-long v0, p0

    .line 311
    invoke-virtual {p1, v0, v1, v2}, La/fmq0;->g(JLjava/util/concurrent/TimeUnit;)La/fmq0;

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    sget-object p0, Lokhttp3/internal/http2/ErrorCode;->h:Lokhttp3/internal/http2/ErrorCode;

    .line 319
    .line 320
    invoke-virtual {v0, p0}, Lokhttp3/internal/http2/Http2Stream;->g(Lokhttp3/internal/http2/ErrorCode;)V

    .line 321
    .line 322
    .line 323
    const-string p0, "Canceled"

    .line 324
    .line 325
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :catchall_1
    move-exception v0

    .line 330
    move-object p0, v0

    .line 331
    goto :goto_4

    .line 332
    :cond_d
    :try_start_3
    new-instance p0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 333
    .line 334
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 335
    .line 336
    .line 337
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 338
    :goto_3
    :try_start_4
    monitor-exit v8

    .line 339
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 340
    :goto_4
    monitor-exit p1

    .line 341
    throw p0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Stream;->h:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 8
    .line 9
    iget-boolean v2, v1, Lokhttp3/internal/http2/Http2Stream$FramingSource;->b:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Stream$FramingSource;->d:La/f99;

    .line 15
    .line 16
    invoke-virtual {v1}, La/f99;->v0()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    return v3

    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    throw v0

    .line 33
    :cond_1
    return v0
.end method

.method public final g(Z)Lokhttp3/Response$Builder;
    .locals 9

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_f

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->f:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Stream;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_7

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez p1, :cond_3

    .line 24
    .line 25
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Stream;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Stream;->i:Lokhttp3/internal/http2/Http2Stream$FramingSink;

    .line 31
    .line 32
    iget-boolean v5, v4, Lokhttp3/internal/http2/Http2Stream$FramingSink;->c:Z

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    iget-boolean v4, v4, Lokhttp3/internal/http2/Http2Stream$FramingSink;->a:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v2

    .line 44
    :goto_2
    if-eqz v4, :cond_4

    .line 45
    .line 46
    :cond_3
    move v3, v2

    .line 47
    :cond_4
    if-eqz v3, :cond_5

    .line 48
    .line 49
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->j:Lokhttp3/internal/http2/Http2Stream$StreamTimeout;

    .line 50
    .line 51
    invoke-virtual {v2}, La/j04;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_5
    :goto_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    :try_start_2
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->j:Lokhttp3/internal/http2/Http2Stream$StreamTimeout;

    .line 64
    .line 65
    invoke-virtual {v2}, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->l()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    goto :goto_4

    .line 71
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 76
    .line 77
    .line 78
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    :goto_4
    if-eqz v3, :cond_6

    .line 85
    .line 86
    :try_start_4
    iget-object p1, v0, Lokhttp3/internal/http2/Http2Stream;->j:Lokhttp3/internal/http2/Http2Stream$StreamTimeout;

    .line 87
    .line 88
    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->l()V

    .line 89
    .line 90
    .line 91
    :cond_6
    throw p0

    .line 92
    :cond_7
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->f:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_d

    .line 99
    .line 100
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->f:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast v2, Lokhttp3/Headers;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 110
    .line 111
    monitor-exit v0

    .line 112
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->e:Lokhttp3/Protocol;

    .line 113
    .line 114
    new-instance v0, Lokhttp3/Headers$Builder;

    .line 115
    .line 116
    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lokhttp3/Headers;->size()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    move-object v5, v1

    .line 124
    :goto_5
    if-ge v3, v4, :cond_a

    .line 125
    .line 126
    invoke-static {v2, v3}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v2, v3}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    const-string v8, ":status"

    .line 135
    .line 136
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_8

    .line 141
    .line 142
    const-string v5, "HTTP/1.1 "

    .line 143
    .line 144
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v5}, Lokhttp3/internal/http/StatusLine$Companion;->a(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    goto :goto_6

    .line 153
    :cond_8
    sget-object v8, Lokhttp3/internal/http2/Http2ExchangeCodec;->h:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v8, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-nez v8, :cond_9

    .line 160
    .line 161
    invoke-static {v0, v6, v7}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_a
    if-eqz v5, :cond_c

    .line 168
    .line 169
    new-instance v2, Lokhttp3/Response$Builder;

    .line 170
    .line 171
    invoke-direct {v2}, Lokhttp3/Response$Builder;-><init>()V

    .line 172
    .line 173
    .line 174
    iput-object p0, v2, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 175
    .line 176
    iget p0, v5, Lokhttp3/internal/http/StatusLine;->b:I

    .line 177
    .line 178
    iput p0, v2, Lokhttp3/Response$Builder;->c:I

    .line 179
    .line 180
    iget-object p0, v5, Lokhttp3/internal/http/StatusLine;->c:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iput-object p0, v2, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v0}, Lokhttp3/internal/_HeadersCommonKt;->b(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, Lokhttp3/internal/_HeadersCommonKt;->d(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iput-object p0, v2, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 196
    .line 197
    if-eqz p1, :cond_b

    .line 198
    .line 199
    iget p0, v2, Lokhttp3/Response$Builder;->c:I

    .line 200
    .line 201
    const/16 p1, 0x64

    .line 202
    .line 203
    if-ne p0, p1, :cond_b

    .line 204
    .line 205
    return-object v1

    .line 206
    :cond_b
    return-object v2

    .line 207
    :cond_c
    const-string p0, "Expected \':status\' header not present"

    .line 208
    .line 209
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v1

    .line 213
    :cond_d
    :try_start_5
    iget-object p0, v0, Lokhttp3/internal/http2/Http2Stream;->m:Ljava/io/IOException;

    .line 214
    .line 215
    if-eqz p0, :cond_e

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_e
    new-instance p0, Lokhttp3/internal/http2/StreamResetException;

    .line 219
    .line 220
    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Stream;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-direct {p0, p1}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lokhttp3/internal/http2/ErrorCode;)V

    .line 228
    .line 229
    .line 230
    :goto_7
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 231
    :goto_8
    monitor-exit v0

    .line 232
    throw p0

    .line 233
    :cond_f
    const-string p0, "stream wasn\'t created"

    .line 234
    .line 235
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    return-object v1
.end method

.method public final h()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->c:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    iget-object p0, p0, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 4
    .line 5
    invoke-virtual {p0}, Lokhttp3/internal/http2/Http2Writer;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final i()La/njk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->d:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final j()Lokhttp3/internal/http/ExchangeCodec$Carrier;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->a:Lokhttp3/internal/connection/RealConnection;

    .line 2
    .line 3
    return-object p0
.end method
