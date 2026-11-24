.class public final La/x0t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:Lokhttp3/OkHttpClient;

.field public final c:La/mne;


# direct methods
.method public constructor <init>(La/us00;Lokhttp3/OkHttpClient;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x0t0;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/x0t0;->b:Lokhttp3/OkHttpClient;

    .line 7
    .line 8
    iput-object p3, p0, La/x0t0;->c:La/mne;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/w0t0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/w0t0;

    .line 7
    .line 8
    iget v1, v0, La/w0t0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/w0t0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w0t0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/w0t0;-><init>(La/x0t0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/w0t0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w0t0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/w0t0;->j:Ljava/io/File;

    .line 38
    .line 39
    iget-object p2, v0, La/w0t0;->i:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p3, Ljava/io/File;

    .line 56
    .line 57
    iget-object v2, p0, La/x0t0;->a:La/us00;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p3, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    return-object p2

    .line 82
    :cond_4
    iput-object p2, v0, La/w0t0;->i:Ljava/lang/String;

    .line 83
    .line 84
    iput-object p3, v0, La/w0t0;->j:Ljava/io/File;

    .line 85
    .line 86
    iput v3, v0, La/w0t0;->m:I

    .line 87
    .line 88
    new-instance v2, Lokhttp3/Request$Builder;

    .line 89
    .line 90
    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v5, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    const/4 v7, 0x0

    .line 108
    if-nez v6, :cond_5

    .line 109
    .line 110
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {p1, v6, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_8

    .line 121
    .line 122
    const-string v6, "https://"

    .line 123
    .line 124
    invoke-static {p1, v6, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    const/16 v8, 0x2f

    .line 136
    .line 137
    if-lez v6, :cond_7

    .line 138
    .line 139
    const-string v6, "/"

    .line 140
    .line 141
    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_7

    .line 146
    .line 147
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    :cond_7
    new-array v3, v3, [C

    .line 151
    .line 152
    aput-char v8, v3, v7

    .line 153
    .line 154
    invoke-static {p1, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    :goto_1
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v2, p1}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Lokhttp3/Request;

    .line 176
    .line 177
    invoke-direct {p1, v2}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, p0, La/x0t0;->c:La/mne;

    .line 181
    .line 182
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 183
    .line 184
    new-instance v3, La/rtq0;

    .line 185
    .line 186
    const/16 v5, 0xf

    .line 187
    .line 188
    invoke-direct {v3, p0, p1, v4, v5}, La/rtq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 189
    .line 190
    .line 191
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, v1, :cond_9

    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_9
    move-object v9, p3

    .line 199
    move-object p3, p0

    .line 200
    move-object p0, v9

    .line 201
    :goto_3
    check-cast p3, Lokhttp3/Response;

    .line 202
    .line 203
    iget-boolean p1, p3, Lokhttp3/Response;->q:Z

    .line 204
    .line 205
    const-string v0, "Failed to load font"

    .line 206
    .line 207
    if-eqz p1, :cond_b

    .line 208
    .line 209
    iget-object p1, p3, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 210
    .line 211
    if-eqz p1, :cond_a

    .line 212
    .line 213
    :try_start_0
    new-instance p3, Ljava/io/FileOutputStream;

    .line 214
    .line 215
    invoke-direct {p3, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 216
    .line 217
    .line 218
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->a()Ljava/io/InputStream;

    .line 219
    .line 220
    .line 221
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    const/16 v1, 0x2000

    .line 223
    .line 224
    :try_start_2
    invoke-static {p0, p3, v1}, La/wha0;->J(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    .line 227
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 228
    .line 229
    .line 230
    :try_start_4
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 231
    .line 232
    .line 233
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 234
    .line 235
    .line 236
    if-eqz p2, :cond_a

    .line 237
    .line 238
    return-object p2

    .line 239
    :catchall_0
    move-exception p0

    .line 240
    goto :goto_4

    .line 241
    :catchall_1
    move-exception p2

    .line 242
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 243
    :catchall_2
    move-exception v0

    .line 244
    :try_start_6
    invoke-static {p0, p2}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 248
    :goto_4
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 249
    :catchall_3
    move-exception p2

    .line 250
    :try_start_8
    invoke-static {p3, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 254
    :catchall_4
    move-exception p0

    .line 255
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 256
    :catchall_5
    move-exception p2

    .line 257
    invoke-static {p1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    throw p2

    .line 261
    :cond_a
    new-instance p0, Ljava/lang/Exception;

    .line 262
    .line 263
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw p0

    .line 267
    :cond_b
    new-instance p0, Ljava/lang/Exception;

    .line 268
    .line 269
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw p0
.end method
