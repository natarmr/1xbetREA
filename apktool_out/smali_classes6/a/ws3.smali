.class public final synthetic La/ws3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z7z;


# direct methods
.method public synthetic constructor <init>(La/z7z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ws3;->a:B

    iput-object p1, p0, La/ws3;->b:La/z7z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ws3;->a:B

    .line 4
    .line 5
    const-wide/32 v2, 0x493e0

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, La/ws3;->b:La/z7z;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/gii0;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, La/euc;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object v0, v1, La/euc;->k:La/duc;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    iget-object v0, v1, La/euc;->d:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La/euc;->b(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v2, La/duc;

    .line 39
    .line 40
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v1, La/euc;->k:La/duc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    :goto_0
    monitor-exit v1

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget-wide v6, v0, La/duc;->b:J

    .line 54
    .line 55
    sub-long/2addr v4, v6

    .line 56
    cmp-long v2, v4, v2

    .line 57
    .line 58
    if-gez v2, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, La/duc;->a:Lokhttp3/OkHttpClient;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, v1, La/euc;->d:Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, La/euc;->b(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v2, La/duc;

    .line 70
    .line 71
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 72
    .line 73
    .line 74
    iput-object v2, v1, La/euc;->k:La/duc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_1
    return-object v0

    .line 78
    :goto_2
    monitor-exit v1

    .line 79
    throw v0

    .line 80
    :pswitch_1
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/wyu;

    .line 85
    .line 86
    invoke-virtual {v0}, La/wyu;->a()La/uaq0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v1, La/xb70;

    .line 91
    .line 92
    const-string v3, ""

    .line 93
    .line 94
    sget-object v10, La/x870;->a:La/x870;

    .line 95
    .line 96
    new-instance v15, La/fa70;

    .line 97
    .line 98
    const/16 v19, 0x1

    .line 99
    .line 100
    const/16 v20, 0x0

    .line 101
    .line 102
    const/4 v12, 0x0

    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    move-object v11, v15

    .line 106
    const/4 v15, 0x0

    .line 107
    const-wide/16 v16, -0x1

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    invoke-direct/range {v11 .. v20}, La/fa70;-><init>(ZZZZJZZZ)V

    .line 112
    .line 113
    .line 114
    new-instance v16, La/f970;

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    move-object/from16 v12, v16

    .line 119
    .line 120
    const-wide/16 v16, 0x0

    .line 121
    .line 122
    invoke-direct/range {v12 .. v20}, La/f970;-><init>(ZZZDZZZ)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/c970;

    .line 126
    .line 127
    sget-object v4, La/csr;->e:La/csr;

    .line 128
    .line 129
    sget-object v5, La/b970;->c:La/b970;

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-direct {v0, v6, v4, v5}, La/c970;-><init>(ZLa/csr;La/b970;)V

    .line 133
    .line 134
    .line 135
    new-instance v18, La/z870;

    .line 136
    .line 137
    sget-object v15, La/bm5;->d:La/bm5;

    .line 138
    .line 139
    sget-object v31, La/txs0;->b:La/txs0;

    .line 140
    .line 141
    new-instance v19, La/ql5;

    .line 142
    .line 143
    const-string v28, ""

    .line 144
    .line 145
    const-string v29, ""

    .line 146
    .line 147
    const-string v32, ""

    .line 148
    .line 149
    const-string v33, ""

    .line 150
    .line 151
    const/16 v34, 0x0

    .line 152
    .line 153
    const-string v35, ""

    .line 154
    .line 155
    const-wide/16 v20, 0x0

    .line 156
    .line 157
    const-wide/16 v22, 0x0

    .line 158
    .line 159
    const/16 v24, 0x0

    .line 160
    .line 161
    const/16 v25, 0x0

    .line 162
    .line 163
    const-wide/16 v26, 0x0

    .line 164
    .line 165
    const/16 v30, 0x0

    .line 166
    .line 167
    invoke-direct/range {v19 .. v35}, La/ql5;-><init>(JDZZJLjava/lang/String;Ljava/lang/String;ILa/txs0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    move-object/from16 v13, v18

    .line 176
    .line 177
    move-object/from16 v18, v19

    .line 178
    .line 179
    move/from16 v19, v4

    .line 180
    .line 181
    invoke-direct/range {v13 .. v19}, La/z870;-><init>(ILa/bm5;ZZLa/ql5;Z)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v18, v13

    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    const/4 v5, 0x0

    .line 188
    const/4 v7, 0x1

    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x0

    .line 191
    move-object v15, v11

    .line 192
    const/4 v11, 0x0

    .line 193
    move-object/from16 v16, v12

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    move-object/from16 v17, v0

    .line 198
    .line 199
    invoke-direct/range {v1 .. v18}, La/xb70;-><init>(La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;)V

    .line 200
    .line 201
    .line 202
    return-object v1

    .line 203
    :pswitch_2
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    move-object v1, v0

    .line 208
    check-cast v1, La/euc;

    .line 209
    .line 210
    monitor-enter v1

    .line 211
    :try_start_2
    iget-object v0, v1, La/euc;->g:La/duc;

    .line 212
    .line 213
    if-nez v0, :cond_2

    .line 214
    .line 215
    iget-object v0, v1, La/euc;->b:Ljava/util/List;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v2, La/duc;

    .line 222
    .line 223
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 224
    .line 225
    .line 226
    iput-object v2, v1, La/euc;->g:La/duc;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 227
    .line 228
    :goto_3
    monitor-exit v1

    .line 229
    goto :goto_4

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    goto :goto_5

    .line 232
    :cond_2
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 233
    .line 234
    .line 235
    move-result-wide v4

    .line 236
    iget-wide v6, v0, La/duc;->b:J

    .line 237
    .line 238
    sub-long/2addr v4, v6

    .line 239
    cmp-long v2, v4, v2

    .line 240
    .line 241
    if-gez v2, :cond_3

    .line 242
    .line 243
    iget-object v0, v0, La/duc;->a:Lokhttp3/OkHttpClient;

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_3
    iget-object v0, v1, La/euc;->b:Ljava/util/List;

    .line 247
    .line 248
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    new-instance v2, La/duc;

    .line 253
    .line 254
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 255
    .line 256
    .line 257
    iput-object v2, v1, La/euc;->g:La/duc;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :goto_4
    return-object v0

    .line 261
    :goto_5
    monitor-exit v1

    .line 262
    throw v0

    .line 263
    :pswitch_3
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    move-object v1, v0

    .line 268
    check-cast v1, La/euc;

    .line 269
    .line 270
    monitor-enter v1

    .line 271
    :try_start_4
    iget-object v0, v1, La/euc;->i:La/duc;

    .line 272
    .line 273
    if-nez v0, :cond_4

    .line 274
    .line 275
    iget-object v0, v1, La/euc;->b:Ljava/util/List;

    .line 276
    .line 277
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    new-instance v2, La/duc;

    .line 282
    .line 283
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 284
    .line 285
    .line 286
    iput-object v2, v1, La/euc;->i:La/duc;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 287
    .line 288
    :goto_6
    monitor-exit v1

    .line 289
    goto :goto_7

    .line 290
    :catchall_2
    move-exception v0

    .line 291
    goto :goto_8

    .line 292
    :cond_4
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    iget-wide v6, v0, La/duc;->b:J

    .line 297
    .line 298
    sub-long/2addr v4, v6

    .line 299
    cmp-long v2, v4, v2

    .line 300
    .line 301
    if-gez v2, :cond_5

    .line 302
    .line 303
    iget-object v0, v0, La/duc;->a:Lokhttp3/OkHttpClient;

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_5
    iget-object v0, v1, La/euc;->b:Ljava/util/List;

    .line 307
    .line 308
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    new-instance v2, La/duc;

    .line 313
    .line 314
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 315
    .line 316
    .line 317
    iput-object v2, v1, La/euc;->i:La/duc;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :goto_7
    return-object v0

    .line 321
    :goto_8
    monitor-exit v1

    .line 322
    throw v0

    .line 323
    :pswitch_4
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, La/bzt;

    .line 328
    .line 329
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 330
    .line 331
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    return-object v0

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
