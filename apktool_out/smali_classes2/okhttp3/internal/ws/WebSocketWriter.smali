.class public final Lokhttp3/internal/ws/WebSocketWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketWriter;",
        "Ljava/io/Closeable;",
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
.field public final a:La/t99;

.field public final b:Ljava/util/Random;

.field public final c:Z

.field public final d:Z

.field public final e:S

.field public final f:La/f99;

.field public final g:La/f99;

.field public h:Z

.field public i:Lokhttp3/internal/ws/MessageDeflater;

.field public final j:[B

.field public final k:La/d99;


# direct methods
.method public constructor <init>(La/t99;Ljava/util/Random;ZZJ)V
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
    iput-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:La/t99;

    .line 8
    .line 9
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->b:Ljava/util/Random;

    .line 10
    .line 11
    iput-boolean p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, Lokhttp3/internal/ws/WebSocketWriter;->d:Z

    .line 14
    .line 15
    long-to-int p2, p5

    .line 16
    iput-short p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->e:S

    .line 17
    .line 18
    new-instance p2, La/f99;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->f:La/f99;

    .line 24
    .line 25
    invoke-interface {p1}, La/t99;->g()La/f99;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:La/f99;

    .line 30
    .line 31
    const/4 p1, 0x4

    .line 32
    new-array p1, p1, [B

    .line 33
    .line 34
    iput-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->j:[B

    .line 35
    .line 36
    new-instance p1, La/d99;

    .line 37
    .line 38
    invoke-direct {p1}, La/d99;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:La/d99;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(ILa/qg9;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p2}, La/qg9;->e()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v1, v0

    .line 10
    const-wide/16 v3, 0x7d

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-gtz v1, :cond_1

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x80

    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:La/f99;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, La/f99;->V(I)V

    .line 21
    .line 22
    .line 23
    or-int/lit16 p1, v0, 0x80

    .line 24
    .line 25
    invoke-virtual {v1, p1}, La/f99;->V(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->j:[B

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->b:Ljava/util/Random;

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/util/Random;->nextBytes([B)V

    .line 36
    .line 37
    .line 38
    array-length v2, p1

    .line 39
    invoke-virtual {v1, p1, v2}, La/f99;->U([BI)V

    .line 40
    .line 41
    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    iget-wide v2, v1, La/f99;->b:J

    .line 45
    .line 46
    invoke-virtual {v1, p2}, La/f99;->T(La/qg9;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:La/d99;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p2}, La/f99;->H(La/d99;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v2, v3}, La/d99;->c(J)I

    .line 58
    .line 59
    .line 60
    invoke-static {p2, p1}, Lokhttp3/internal/ws/WebSocketProtocol;->b(La/d99;[B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, La/d99;->close()V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:La/t99;

    .line 67
    .line 68
    invoke-interface {p0}, La/t99;->flush()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    const-string p0, "Payload size must be less than or equal to 125"

    .line 73
    .line 74
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const-string p0, "closed"

    .line 79
    .line 80
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final c(La/qg9;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lokhttp3/internal/ws/WebSocketWriter;->h:Z

    .line 6
    .line 7
    if-nez v2, :cond_8

    .line 8
    .line 9
    iget-object v2, v0, Lokhttp3/internal/ws/WebSocketWriter;->f:La/f99;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, La/f99;->T(La/qg9;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v3, v0, Lokhttp3/internal/ws/WebSocketWriter;->c:Z

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    if-eqz v3, :cond_4

    .line 19
    .line 20
    iget-object v1, v1, La/qg9;->a:[B

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    int-to-long v6, v1

    .line 24
    iget-short v1, v0, Lokhttp3/internal/ws/WebSocketWriter;->e:S

    .line 25
    .line 26
    int-to-long v8, v1

    .line 27
    cmp-long v1, v6, v8

    .line 28
    .line 29
    if-ltz v1, :cond_4

    .line 30
    .line 31
    iget-object v1, v0, Lokhttp3/internal/ws/WebSocketWriter;->i:Lokhttp3/internal/ws/MessageDeflater;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    new-instance v1, Lokhttp3/internal/ws/MessageDeflater;

    .line 36
    .line 37
    iget-boolean v3, v0, Lokhttp3/internal/ws/WebSocketWriter;->d:Z

    .line 38
    .line 39
    invoke-direct {v1, v3}, Lokhttp3/internal/ws/MessageDeflater;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Lokhttp3/internal/ws/WebSocketWriter;->i:Lokhttp3/internal/ws/MessageDeflater;

    .line 43
    .line 44
    :cond_0
    iget-object v3, v1, Lokhttp3/internal/ws/MessageDeflater;->d:La/uzj;

    .line 45
    .line 46
    iget-object v6, v1, Lokhttp3/internal/ws/MessageDeflater;->b:La/f99;

    .line 47
    .line 48
    iget-wide v7, v6, La/f99;->b:J

    .line 49
    .line 50
    cmp-long v7, v7, v4

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    iget-boolean v7, v1, Lokhttp3/internal/ws/MessageDeflater;->a:Z

    .line 55
    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    iget-object v1, v1, Lokhttp3/internal/ws/MessageDeflater;->c:Ljava/util/zip/Deflater;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->reset()V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-wide v7, v2, La/f99;->b:J

    .line 64
    .line 65
    invoke-virtual {v3, v2, v7, v8}, La/uzj;->F0(La/f99;J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, La/uzj;->flush()V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lokhttp3/internal/ws/MessageDeflaterKt;->a:La/qg9;

    .line 72
    .line 73
    iget-wide v7, v6, La/f99;->b:J

    .line 74
    .line 75
    iget-object v3, v1, La/qg9;->a:[B

    .line 76
    .line 77
    array-length v3, v3

    .line 78
    int-to-long v9, v3

    .line 79
    sub-long/2addr v7, v9

    .line 80
    invoke-virtual {v1}, La/qg9;->e()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {v6, v3, v7, v8, v1}, La/f99;->F(IJLa/qg9;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    iget-wide v7, v6, La/f99;->b:J

    .line 91
    .line 92
    const-wide/16 v9, 0x4

    .line 93
    .line 94
    sub-long/2addr v7, v9

    .line 95
    new-instance v1, La/d99;

    .line 96
    .line 97
    invoke-direct {v1}, La/d99;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v1}, La/f99;->H(La/d99;)V

    .line 101
    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v1, v7, v8}, La/d99;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, La/d99;->close()V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    move-object v2, v0

    .line 112
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    invoke-static {v1, v2}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v0

    .line 118
    :cond_2
    const/4 v1, 0x0

    .line 119
    invoke-virtual {v6, v1}, La/f99;->V(I)V

    .line 120
    .line 121
    .line 122
    :goto_0
    iget-wide v7, v6, La/f99;->b:J

    .line 123
    .line 124
    invoke-virtual {v2, v6, v7, v8}, La/f99;->F0(La/f99;J)V

    .line 125
    .line 126
    .line 127
    const/16 v1, 0xc1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    const-string v0, "Failed requirement."

    .line 131
    .line 132
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    const/16 v1, 0x81

    .line 137
    .line 138
    :goto_1
    iget-wide v6, v2, La/f99;->b:J

    .line 139
    .line 140
    iget-object v3, v0, Lokhttp3/internal/ws/WebSocketWriter;->g:La/f99;

    .line 141
    .line 142
    invoke-virtual {v3, v1}, La/f99;->V(I)V

    .line 143
    .line 144
    .line 145
    const-wide/16 v8, 0x7d

    .line 146
    .line 147
    cmp-long v1, v6, v8

    .line 148
    .line 149
    if-gtz v1, :cond_5

    .line 150
    .line 151
    long-to-int v1, v6

    .line 152
    const/16 v8, 0x80

    .line 153
    .line 154
    or-int/2addr v1, v8

    .line 155
    invoke-virtual {v3, v1}, La/f99;->V(I)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :cond_5
    const-wide/32 v8, 0xffff

    .line 161
    .line 162
    .line 163
    cmp-long v1, v6, v8

    .line 164
    .line 165
    if-gtz v1, :cond_6

    .line 166
    .line 167
    const/16 v1, 0xfe

    .line 168
    .line 169
    invoke-virtual {v3, v1}, La/f99;->V(I)V

    .line 170
    .line 171
    .line 172
    long-to-int v1, v6

    .line 173
    invoke-virtual {v3, v1}, La/f99;->a0(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    const/16 v1, 0xff

    .line 178
    .line 179
    invoke-virtual {v3, v1}, La/f99;->V(I)V

    .line 180
    .line 181
    .line 182
    const/16 v1, 0x8

    .line 183
    .line 184
    invoke-virtual {v3, v1}, La/f99;->S(I)La/uvh0;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    iget-object v9, v8, La/uvh0;->a:[B

    .line 189
    .line 190
    iget v10, v8, La/uvh0;->c:I

    .line 191
    .line 192
    add-int/lit8 v11, v10, 0x1

    .line 193
    .line 194
    const/16 v12, 0x38

    .line 195
    .line 196
    ushr-long v12, v6, v12

    .line 197
    .line 198
    const-wide/16 v14, 0xff

    .line 199
    .line 200
    and-long/2addr v12, v14

    .line 201
    long-to-int v12, v12

    .line 202
    int-to-byte v12, v12

    .line 203
    aput-byte v12, v9, v10

    .line 204
    .line 205
    add-int/lit8 v12, v10, 0x2

    .line 206
    .line 207
    const/16 v13, 0x30

    .line 208
    .line 209
    ushr-long v16, v6, v13

    .line 210
    .line 211
    move-wide/from16 v18, v14

    .line 212
    .line 213
    and-long v14, v16, v18

    .line 214
    .line 215
    long-to-int v13, v14

    .line 216
    int-to-byte v13, v13

    .line 217
    aput-byte v13, v9, v11

    .line 218
    .line 219
    add-int/lit8 v11, v10, 0x3

    .line 220
    .line 221
    const/16 v13, 0x28

    .line 222
    .line 223
    ushr-long v13, v6, v13

    .line 224
    .line 225
    and-long v13, v13, v18

    .line 226
    .line 227
    long-to-int v13, v13

    .line 228
    int-to-byte v13, v13

    .line 229
    aput-byte v13, v9, v12

    .line 230
    .line 231
    add-int/lit8 v12, v10, 0x4

    .line 232
    .line 233
    const/16 v13, 0x20

    .line 234
    .line 235
    ushr-long v13, v6, v13

    .line 236
    .line 237
    and-long v13, v13, v18

    .line 238
    .line 239
    long-to-int v13, v13

    .line 240
    int-to-byte v13, v13

    .line 241
    aput-byte v13, v9, v11

    .line 242
    .line 243
    add-int/lit8 v11, v10, 0x5

    .line 244
    .line 245
    const/16 v13, 0x18

    .line 246
    .line 247
    ushr-long v13, v6, v13

    .line 248
    .line 249
    and-long v13, v13, v18

    .line 250
    .line 251
    long-to-int v13, v13

    .line 252
    int-to-byte v13, v13

    .line 253
    aput-byte v13, v9, v12

    .line 254
    .line 255
    add-int/lit8 v12, v10, 0x6

    .line 256
    .line 257
    const/16 v13, 0x10

    .line 258
    .line 259
    ushr-long v13, v6, v13

    .line 260
    .line 261
    and-long v13, v13, v18

    .line 262
    .line 263
    long-to-int v13, v13

    .line 264
    int-to-byte v13, v13

    .line 265
    aput-byte v13, v9, v11

    .line 266
    .line 267
    add-int/lit8 v11, v10, 0x7

    .line 268
    .line 269
    ushr-long v13, v6, v1

    .line 270
    .line 271
    and-long v13, v13, v18

    .line 272
    .line 273
    long-to-int v13, v13

    .line 274
    int-to-byte v13, v13

    .line 275
    aput-byte v13, v9, v12

    .line 276
    .line 277
    add-int/2addr v10, v1

    .line 278
    and-long v12, v6, v18

    .line 279
    .line 280
    long-to-int v1, v12

    .line 281
    int-to-byte v1, v1

    .line 282
    aput-byte v1, v9, v11

    .line 283
    .line 284
    iput v10, v8, La/uvh0;->c:I

    .line 285
    .line 286
    iget-wide v8, v3, La/f99;->b:J

    .line 287
    .line 288
    const-wide/16 v10, 0x8

    .line 289
    .line 290
    add-long/2addr v8, v10

    .line 291
    iput-wide v8, v3, La/f99;->b:J

    .line 292
    .line 293
    :goto_2
    iget-object v1, v0, Lokhttp3/internal/ws/WebSocketWriter;->j:[B

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v8, v0, Lokhttp3/internal/ws/WebSocketWriter;->b:Ljava/util/Random;

    .line 299
    .line 300
    invoke-virtual {v8, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 301
    .line 302
    .line 303
    array-length v8, v1

    .line 304
    invoke-virtual {v3, v1, v8}, La/f99;->U([BI)V

    .line 305
    .line 306
    .line 307
    cmp-long v8, v6, v4

    .line 308
    .line 309
    if-lez v8, :cond_7

    .line 310
    .line 311
    iget-object v8, v0, Lokhttp3/internal/ws/WebSocketWriter;->k:La/d99;

    .line 312
    .line 313
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v8}, La/f99;->H(La/d99;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8, v4, v5}, La/d99;->c(J)I

    .line 320
    .line 321
    .line 322
    invoke-static {v8, v1}, Lokhttp3/internal/ws/WebSocketProtocol;->b(La/d99;[B)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8}, La/d99;->close()V

    .line 326
    .line 327
    .line 328
    :cond_7
    invoke-virtual {v3, v2, v6, v7}, La/f99;->F0(La/f99;J)V

    .line 329
    .line 330
    .line 331
    iget-object v0, v0, Lokhttp3/internal/ws/WebSocketWriter;->a:La/t99;

    .line 332
    .line 333
    invoke-interface {v0}, La/t99;->flush()V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :cond_8
    const-string v0, "closed"

    .line 338
    .line 339
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->i:Lokhttp3/internal/ws/MessageDeflater;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:La/t99;

    .line 9
    .line 10
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
