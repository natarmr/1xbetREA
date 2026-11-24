.class final Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;
.super Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1ExchangeCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChunkedSource"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;",
        "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;",
        "Lokhttp3/internal/http1/Http1ExchangeCodec;",
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


# instance fields
.field public e:J

.field public f:Z

.field public final synthetic g:Lokhttp3/internal/http1/Http1ExchangeCodec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p1, -0x1

    .line 10
    .line 11
    iput-wide p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final Y(La/f99;J)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    iget-object v3, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 6
    .line 7
    iget-object v4, v3, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    cmp-long v7, v1, v5

    .line 15
    .line 16
    if-ltz v7, :cond_c

    .line 17
    .line 18
    iget-boolean v7, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->c:Z

    .line 19
    .line 20
    if-nez v7, :cond_b

    .line 21
    .line 22
    iget-boolean v7, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 23
    .line 24
    const-wide/16 v8, -0x1

    .line 25
    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    iget-wide v10, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 31
    .line 32
    cmp-long v7, v10, v5

    .line 33
    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    cmp-long v7, v10, v8

    .line 37
    .line 38
    if-nez v7, :cond_8

    .line 39
    .line 40
    :cond_1
    const-string v7, "expected chunk size and optional extensions but was \""

    .line 41
    .line 42
    cmp-long v10, v10, v8

    .line 43
    .line 44
    if-eqz v10, :cond_2

    .line 45
    .line 46
    invoke-interface {v4}, Lokhttp3/internal/connection/BufferedSocket;->b()La/u99;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    invoke-interface {v10}, La/u99;->M()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    :cond_2
    :try_start_0
    invoke-interface {v4}, Lokhttp3/internal/connection/BufferedSocket;->b()La/u99;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-interface {v10}, La/u99;->Y0()J

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    iput-wide v10, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 62
    .line 63
    invoke-interface {v4}, Lokhttp3/internal/connection/BufferedSocket;->b()La/u99;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-interface {v4}, La/u99;->M()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget-wide v10, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 80
    .line 81
    cmp-long v10, v10, v5

    .line 82
    .line 83
    if-ltz v10, :cond_a

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    const/4 v11, 0x0

    .line 90
    if-lez v10, :cond_3

    .line 91
    .line 92
    const-string v10, ";"

    .line 93
    .line 94
    invoke-static {v4, v10, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v10
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    if-eqz v10, :cond_a

    .line 99
    .line 100
    :cond_3
    iget-wide v12, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 101
    .line 102
    cmp-long v4, v12, v5

    .line 103
    .line 104
    if-nez v4, :cond_7

    .line 105
    .line 106
    iput-boolean v11, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 107
    .line 108
    iget-object v4, v3, Lokhttp3/internal/http1/Http1ExchangeCodec;->e:Lokhttp3/internal/http1/HeadersReader;

    .line 109
    .line 110
    new-instance v5, Lokhttp3/Headers$Builder;

    .line 111
    .line 112
    invoke-direct {v5}, Lokhttp3/Headers$Builder;-><init>()V

    .line 113
    .line 114
    .line 115
    :goto_0
    iget-object v6, v4, Lokhttp3/internal/http1/HeadersReader;->a:La/u99;

    .line 116
    .line 117
    iget-wide v12, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 118
    .line 119
    invoke-interface {v6, v12, v13}, La/u99;->A(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    iget-wide v12, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    int-to-long v14, v7

    .line 130
    sub-long/2addr v12, v14

    .line 131
    iput-wide v12, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-nez v7, :cond_4

    .line 138
    .line 139
    invoke-static {v5}, Lokhttp3/internal/_HeadersCommonKt;->b(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0, v4}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a(Lokhttp3/Headers;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    const/4 v7, 0x4

    .line 148
    const/16 v10, 0x3a

    .line 149
    .line 150
    const/4 v12, 0x1

    .line 151
    invoke-static {v10, v12, v7, v6}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    const/4 v13, -0x1

    .line 156
    if-eq v7, v13, :cond_5

    .line 157
    .line 158
    invoke-virtual {v6, v11, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-static {v5, v10, v6}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_5
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    const-string v13, ""

    .line 177
    .line 178
    if-ne v7, v10, :cond_6

    .line 179
    .line 180
    invoke-virtual {v6, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-static {v5, v13, v6}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_6
    invoke-static {v5, v13, v6}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_7
    :goto_1
    iget-boolean v4, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 193
    .line 194
    if-nez v4, :cond_8

    .line 195
    .line 196
    :goto_2
    return-wide v8

    .line 197
    :cond_8
    iget-wide v4, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 198
    .line 199
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    move-object/from16 v4, p1

    .line 204
    .line 205
    invoke-super {v0, v4, v1, v2}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->Y(La/f99;J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v1

    .line 209
    cmp-long v4, v1, v8

    .line 210
    .line 211
    if-eqz v4, :cond_9

    .line 212
    .line 213
    iget-wide v3, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 214
    .line 215
    sub-long/2addr v3, v1

    .line 216
    iput-wide v3, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 217
    .line 218
    return-wide v1

    .line 219
    :cond_9
    iget-object v1, v3, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 220
    .line 221
    invoke-interface {v1}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->c()V

    .line 222
    .line 223
    .line 224
    new-instance v1, Ljava/net/ProtocolException;

    .line 225
    .line 226
    const-string v2, "unexpected end of stream"

    .line 227
    .line 228
    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    sget-object v2, Lokhttp3/internal/http1/Http1ExchangeCodec;->f:Lokhttp3/Headers;

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a(Lokhttp3/Headers;)V

    .line 234
    .line 235
    .line 236
    throw v1

    .line 237
    :cond_a
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    .line 238
    .line 239
    new-instance v2, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-wide v5, v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 245
    .line 246
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const/16 v0, 0x22

    .line 253
    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 265
    :catch_0
    move-exception v0

    .line 266
    new-instance v1, Ljava/net/ProtocolException;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_b
    const-string v0, "closed"

    .line 277
    .line 278
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-wide v5

    .line 282
    :cond_c
    const-string v0, "byteCount < 0: "

    .line 283
    .line 284
    invoke-static {v1, v2, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, La/c99;->s(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-wide v5
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lokhttp3/internal/_UtilJvmKt;->a:Ljava/util/TimeZone;

    .line 11
    .line 12
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x64

    .line 18
    .line 19
    :try_start_0
    invoke-static {p0, v0}, Lokhttp3/internal/_UtilJvmKt;->g(La/emk0;I)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 28
    .line 29
    iget-object v0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 30
    .line 31
    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->c()V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->f:Lokhttp3/Headers;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a(Lokhttp3/Headers;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->c:Z

    .line 41
    .line 42
    return-void
.end method
