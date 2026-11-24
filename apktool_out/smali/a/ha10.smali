.class public final synthetic La/ha10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ha10;->a:B

    iput-object p1, p0, La/ha10;->b:Landroid/content/Context;

    iput-object p2, p0, La/ha10;->c:Ljava/lang/String;

    iput-object p3, p0, La/ha10;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ha10;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ha10;->b:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, La/ha10;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, La/ha10;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, p0}, La/ka10;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)La/ob10;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object v2, p0, La/ha10;->b:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v3, p0, La/ha10;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/ha10;->d:Ljava/lang/String;

    .line 22
    .line 23
    sget-object p0, La/idx;->a:La/yk50;

    .line 24
    .line 25
    if-nez p0, :cond_3

    .line 26
    .line 27
    const-class v1, La/yk50;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    sget-object p0, La/idx;->a:La/yk50;

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    new-instance p0, La/yk50;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v4, La/idx;->b:La/ok50;

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    const-class v4, La/ok50;

    .line 45
    .line 46
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    :try_start_1
    sget-object v5, La/idx;->b:La/ok50;

    .line 48
    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    new-instance v5, La/ok50;

    .line 52
    .line 53
    new-instance v7, La/qty;

    .line 54
    .line 55
    invoke-direct {v7, v0}, La/qty;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v7}, La/ok50;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sput-object v5, La/idx;->b:La/ok50;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    monitor-exit v4

    .line 68
    move-object v4, v5

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :try_start_2
    throw p0

    .line 72
    :cond_1
    :goto_2
    new-instance v0, La/kud;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, v4, v0}, La/yk50;-><init>(La/ok50;La/kud;)V

    .line 78
    .line 79
    .line 80
    sput-object p0, La/idx;->a:La/yk50;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catchall_1
    move-exception v0

    .line 84
    move-object p0, v0

    .line 85
    goto :goto_4

    .line 86
    :cond_2
    :goto_3
    monitor-exit v1

    .line 87
    :cond_3
    move-object v1, p0

    .line 88
    goto :goto_5

    .line 89
    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    throw p0

    .line 91
    :goto_5
    const/4 p0, 0x2

    .line 92
    const/4 v4, 0x1

    .line 93
    const/4 v5, 0x0

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    iget-object v0, v1, La/yk50;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/ok50;

    .line 99
    .line 100
    :try_start_3
    invoke-virtual {v0, v3}, La/ok50;->i(Ljava/lang/String;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    :catch_0
    move-object v0, v5

    .line 107
    goto :goto_7

    .line 108
    :cond_4
    new-instance v7, Ljava/io/FileInputStream;

    .line 109
    .line 110
    invoke-direct {v7, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v9, ".zip"

    .line 118
    .line 119
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_5

    .line 124
    .line 125
    sget-object v8, La/gzp;->c:La/gzp;

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    const-string v9, ".gz"

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_6

    .line 139
    .line 140
    sget-object v8, La/gzp;->d:La/gzp;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_6
    sget-object v8, La/gzp;->b:La/gzp;

    .line 144
    .line 145
    :goto_6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-static {}, La/xv00;->a()V

    .line 149
    .line 150
    .line 151
    new-instance v0, Landroid/util/Pair;

    .line 152
    .line 153
    invoke-direct {v0, v8, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :goto_7
    if-nez v0, :cond_8

    .line 157
    .line 158
    :cond_7
    move-object v0, v5

    .line 159
    goto :goto_9

    .line 160
    :cond_8
    iget-object v7, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v7, La/gzp;

    .line 163
    .line 164
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ljava/io/InputStream;

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-eq v7, v4, :cond_a

    .line 173
    .line 174
    if-eq v7, p0, :cond_9

    .line 175
    .line 176
    invoke-static {v0}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0, v6}, La/ka10;->e(La/hfx;Ljava/lang/String;)La/ob10;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    goto :goto_8

    .line 185
    :cond_9
    :try_start_4
    new-instance v7, Ljava/util/zip/GZIPInputStream;

    .line 186
    .line 187
    invoke-direct {v7, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v7}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0, v6}, La/ka10;->e(La/hfx;Ljava/lang/String;)La/ob10;

    .line 195
    .line 196
    .line 197
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 198
    goto :goto_8

    .line 199
    :catch_1
    move-exception v0

    .line 200
    new-instance v7, La/ob10;

    .line 201
    .line 202
    invoke-direct {v7, v0}, La/ob10;-><init>(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    move-object v0, v7

    .line 206
    goto :goto_8

    .line 207
    :cond_a
    new-instance v7, Ljava/util/zip/ZipInputStream;

    .line 208
    .line 209
    invoke-direct {v7, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v2, v7, v6}, La/ka10;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)La/ob10;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_8
    iget-object v0, v0, La/ob10;->a:La/fa10;

    .line 217
    .line 218
    if-eqz v0, :cond_7

    .line 219
    .line 220
    :goto_9
    if-eqz v0, :cond_b

    .line 221
    .line 222
    new-instance p0, La/ob10;

    .line 223
    .line 224
    invoke-direct {p0, v0}, La/ob10;-><init>(La/fa10;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_e

    .line 228
    .line 229
    :cond_b
    invoke-static {}, La/xv00;->a()V

    .line 230
    .line 231
    .line 232
    const-string v7, "LottieFetchResult close failed "

    .line 233
    .line 234
    invoke-static {}, La/xv00;->a()V

    .line 235
    .line 236
    .line 237
    :try_start_5
    invoke-static {v3}, La/kud;->b(Ljava/lang/String;)La/zvj;

    .line 238
    .line 239
    .line 240
    move-result-object v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 241
    :try_start_6
    iget-object v0, v8, La/zvj;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 244
    .line 245
    :try_start_7
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    div-int/lit8 v5, v5, 0x64
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 250
    .line 251
    if-ne v5, p0, :cond_c

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :catch_2
    :cond_c
    const/4 v4, 0x0

    .line 255
    :goto_a
    if-eqz v4, :cond_d

    .line 256
    .line 257
    :try_start_8
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual/range {v1 .. v6}, La/yk50;->b(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)La/ob10;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-object v0, p0, La/ob10;->a:La/fa10;

    .line 270
    .line 271
    invoke-static {}, La/xv00;->a()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 272
    .line 273
    .line 274
    :goto_b
    :try_start_9
    invoke-virtual {v8}, La/zvj;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 275
    .line 276
    .line 277
    goto :goto_e

    .line 278
    :catch_3
    move-exception v0

    .line 279
    invoke-static {v7, v0}, La/xv00;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 280
    .line 281
    .line 282
    goto :goto_e

    .line 283
    :catchall_2
    move-exception v0

    .line 284
    move-object p0, v0

    .line 285
    move-object v5, v8

    .line 286
    goto :goto_f

    .line 287
    :catch_4
    move-exception v0

    .line 288
    move-object p0, v0

    .line 289
    move-object v5, v8

    .line 290
    goto :goto_c

    .line 291
    :cond_d
    :try_start_a
    new-instance p0, La/ob10;

    .line 292
    .line 293
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    invoke-virtual {v8}, La/zvj;->a()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {p0, v0}, La/ob10;-><init>(Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 303
    .line 304
    .line 305
    goto :goto_b

    .line 306
    :catchall_3
    move-exception v0

    .line 307
    move-object p0, v0

    .line 308
    goto :goto_f

    .line 309
    :catch_5
    move-exception v0

    .line 310
    move-object p0, v0

    .line 311
    :goto_c
    :try_start_b
    new-instance v1, La/ob10;

    .line 312
    .line 313
    invoke-direct {v1, p0}, La/ob10;-><init>(Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 314
    .line 315
    .line 316
    if-eqz v5, :cond_e

    .line 317
    .line 318
    :try_start_c
    invoke-virtual {v5}, La/zvj;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 319
    .line 320
    .line 321
    goto :goto_d

    .line 322
    :catch_6
    move-exception v0

    .line 323
    move-object p0, v0

    .line 324
    invoke-static {v7, p0}, La/xv00;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    :cond_e
    :goto_d
    move-object p0, v1

    .line 328
    :goto_e
    if-eqz v6, :cond_f

    .line 329
    .line 330
    iget-object v0, p0, La/ob10;->a:La/fa10;

    .line 331
    .line 332
    if-eqz v0, :cond_f

    .line 333
    .line 334
    sget-object v1, La/ga10;->b:La/ga10;

    .line 335
    .line 336
    iget-object v1, v1, La/ga10;->a:La/dj10;

    .line 337
    .line 338
    invoke-virtual {v1, v6, v0}, La/dj10;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_f
    return-object p0

    .line 342
    :goto_f
    if-eqz v5, :cond_10

    .line 343
    .line 344
    :try_start_d
    invoke-virtual {v5}, La/zvj;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 345
    .line 346
    .line 347
    goto :goto_10

    .line 348
    :catch_7
    move-exception v0

    .line 349
    invoke-static {v7, v0}, La/xv00;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 350
    .line 351
    .line 352
    :cond_10
    :goto_10
    throw p0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
