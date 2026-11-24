.class public final La/pb90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/b1x0;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput-byte v0, p0, La/pb90;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/pb90;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, La/pb90;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p4, p0, La/pb90;->d:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/pb90;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/qb90;[Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;Landroid/content/Context;)V
    .locals 0

    const/4 p2, 0x0

    iput-byte p2, p0, La/pb90;->a:B

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, La/pb90;->e:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, La/pb90;->b:Ljava/lang/Object;

    .line 25
    iput-object p4, p0, La/pb90;->c:Ljava/lang/Object;

    .line 26
    iput-object p5, p0, La/pb90;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 21
    iput-byte p5, p0, La/pb90;->a:B

    iput-object p1, p0, La/pb90;->b:Ljava/lang/Object;

    iput-object p2, p0, La/pb90;->c:Ljava/lang/Object;

    iput-object p3, p0, La/pb90;->d:Ljava/lang/Object;

    iput-object p4, p0, La/pb90;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 20
    iput-byte p6, p0, La/pb90;->a:B

    iput-object p1, p0, La/pb90;->e:Ljava/lang/Object;

    iput-object p2, p0, La/pb90;->b:Ljava/lang/Object;

    iput-object p3, p0, La/pb90;->c:Ljava/lang/Object;

    iput-object p4, p0, La/pb90;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pb90;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    const/16 v5, 0x8

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/zlt0;

    .line 20
    .line 21
    iget-object v1, v1, La/zlt0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/m6x0;

    .line 24
    .line 25
    invoke-virtual {v1}, La/m6x0;->k0()La/x6x0;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    invoke-virtual {v1}, La/m6x0;->S()La/lwf;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v13

    .line 40
    invoke-virtual {v1}, La/m6x0;->e0()La/bkw0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v5, La/btw0;->e1:La/atw0;

    .line 45
    .line 46
    invoke-virtual {v2, v8, v5}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, La/m6x0;->S()La/lwf;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    :cond_0
    move-wide v15, v3

    .line 64
    iget-object v2, v0, La/pb90;->d:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v11, v2

    .line 67
    check-cast v11, Landroid/os/Bundle;

    .line 68
    .line 69
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v10, v2

    .line 72
    check-cast v10, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v0, v0, La/pb90;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    const-string v12, "auto"

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    invoke-virtual/range {v9 .. v17}, La/x6x0;->T1(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JJZ)Lcom/google/android/gms/measurement/internal/zzbh;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2, v0}, La/m6x0;->c(Lcom/google/android/gms/measurement/internal/zzbh;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_0
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, La/a4x0;

    .line 96
    .line 97
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 100
    .line 101
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzr;

    .line 104
    .line 105
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzoo;

    .line 108
    .line 109
    monitor-enter v2

    .line 110
    :try_start_0
    iget-object v4, v1, La/a4x0;->e:La/gtw0;

    .line 111
    .line 112
    if-nez v4, :cond_1

    .line 113
    .line 114
    iget-object v0, v1, La/p4;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/kxw0;

    .line 117
    .line 118
    iget-object v0, v0, La/kxw0;->f:La/uuw0;

    .line 119
    .line 120
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 124
    .line 125
    const-string v3, "[sgtm] Failed to get upload batches; not connected to service"

    .line 126
    .line 127
    invoke-virtual {v0, v3}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    goto :goto_2

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    goto :goto_3

    .line 134
    :catch_0
    move-exception v0

    .line 135
    goto :goto_0

    .line 136
    :cond_1
    :try_start_2
    new-instance v5, La/j2x0;

    .line 137
    .line 138
    invoke-direct {v5, v1, v2}, La/j2x0;-><init>(La/a4x0;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v3, v0, v5}, La/gtw0;->g(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzoo;La/ttw0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, La/a4x0;->y1()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :goto_0
    :try_start_3
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, La/kxw0;

    .line 151
    .line 152
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 153
    .line 154
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 158
    .line 159
    const-string v3, "[sgtm] Failed to get upload batches; remote exception"

    .line 160
    .line 161
    invoke-virtual {v1, v0, v3}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 165
    .line 166
    .line 167
    :goto_1
    monitor-exit v2

    .line 168
    :goto_2
    return-void

    .line 169
    :goto_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    throw v0

    .line 171
    :pswitch_1
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, La/a4x0;

    .line 174
    .line 175
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzr;

    .line 182
    .line 183
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroid/os/Bundle;

    .line 186
    .line 187
    monitor-enter v2

    .line 188
    :try_start_4
    iget-object v4, v1, La/a4x0;->e:La/gtw0;

    .line 189
    .line 190
    if-nez v4, :cond_2

    .line 191
    .line 192
    iget-object v0, v1, La/p4;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, La/kxw0;

    .line 195
    .line 196
    iget-object v0, v0, La/kxw0;->f:La/uuw0;

    .line 197
    .line 198
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 202
    .line 203
    const-string v3, "Failed to request trigger URIs; not connected to service"

    .line 204
    .line 205
    invoke-virtual {v0, v3}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 206
    .line 207
    .line 208
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 209
    goto :goto_6

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    goto :goto_7

    .line 212
    :catch_1
    move-exception v0

    .line 213
    goto :goto_4

    .line 214
    :cond_2
    :try_start_6
    new-instance v5, La/h2x0;

    .line 215
    .line 216
    invoke-direct {v5, v1, v2}, La/h2x0;-><init>(La/a4x0;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v4, v3, v0, v5}, La/gtw0;->k(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;La/mtw0;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, La/a4x0;->y1()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :goto_4
    :try_start_7
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, La/kxw0;

    .line 229
    .line 230
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 231
    .line 232
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 233
    .line 234
    .line 235
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 236
    .line 237
    const-string v3, "Failed to request trigger URIs; remote exception"

    .line 238
    .line 239
    invoke-virtual {v1, v0, v3}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 243
    .line 244
    .line 245
    :goto_5
    monitor-exit v2

    .line 246
    :goto_6
    return-void

    .line 247
    :goto_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 248
    throw v0

    .line 249
    :pswitch_2
    iget-object v1, v0, La/pb90;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, La/gpw0;

    .line 252
    .line 253
    iget-object v2, v0, La/pb90;->e:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, La/a4x0;

    .line 256
    .line 257
    iget-object v3, v2, La/p4;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v3, La/kxw0;

    .line 260
    .line 261
    :try_start_8
    iget-object v4, v2, La/a4x0;->e:La/gtw0;

    .line 262
    .line 263
    if-nez v4, :cond_3

    .line 264
    .line 265
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 266
    .line 267
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 268
    .line 269
    .line 270
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 271
    .line 272
    const-string v2, "Discarding data. Failed to send event to service to bundle"

    .line 273
    .line 274
    invoke-virtual {v0, v2}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 275
    .line 276
    .line 277
    iget-object v0, v3, La/kxw0;->i:La/x6x0;

    .line 278
    .line 279
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v1, v8}, La/x6x0;->c2(La/gpw0;[B)V

    .line 283
    .line 284
    .line 285
    goto :goto_9

    .line 286
    :cond_3
    :try_start_9
    iget-object v5, v0, La/pb90;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 289
    .line 290
    iget-object v0, v0, La/pb90;->c:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Ljava/lang/String;

    .line 293
    .line 294
    invoke-interface {v4, v5, v0}, La/gtw0;->h(Lcom/google/android/gms/measurement/internal/zzbh;Ljava/lang/String;)[B

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-virtual {v2}, La/a4x0;->y1()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 299
    .line 300
    .line 301
    goto :goto_8

    .line 302
    :catchall_2
    move-exception v0

    .line 303
    goto :goto_a

    .line 304
    :catch_2
    move-exception v0

    .line 305
    :try_start_a
    iget-object v2, v3, La/kxw0;->f:La/uuw0;

    .line 306
    .line 307
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 308
    .line 309
    .line 310
    iget-object v2, v2, La/uuw0;->g:La/quw0;

    .line 311
    .line 312
    const-string v4, "Failed to send event to the service to bundle"

    .line 313
    .line 314
    invoke-virtual {v2, v0, v4}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 315
    .line 316
    .line 317
    :goto_8
    iget-object v0, v3, La/kxw0;->i:La/x6x0;

    .line 318
    .line 319
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v1, v8}, La/x6x0;->c2(La/gpw0;[B)V

    .line 323
    .line 324
    .line 325
    :goto_9
    return-void

    .line 326
    :goto_a
    iget-object v2, v3, La/kxw0;->i:La/x6x0;

    .line 327
    .line 328
    invoke-static {v2}, La/kxw0;->e(La/p4;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v1, v8}, La/x6x0;->c2(La/gpw0;[B)V

    .line 332
    .line 333
    .line 334
    throw v0

    .line 335
    :pswitch_3
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 338
    .line 339
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 340
    .line 341
    invoke-virtual {v1}, La/kxw0;->i()La/a4x0;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 346
    .line 347
    move-object v7, v1

    .line 348
    check-cast v7, La/gpw0;

    .line 349
    .line 350
    iget-object v1, v0, La/pb90;->c:Ljava/lang/Object;

    .line 351
    .line 352
    move-object v4, v1

    .line 353
    check-cast v4, Ljava/lang/String;

    .line 354
    .line 355
    iget-object v0, v0, La/pb90;->d:Ljava/lang/Object;

    .line 356
    .line 357
    move-object v5, v0

    .line 358
    check-cast v5, Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {v3}, La/zrw0;->m1()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3}, La/etw0;->n1()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v9}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    new-instance v2, La/ob90;

    .line 371
    .line 372
    const/4 v8, 0x3

    .line 373
    invoke-direct/range {v2 .. v8}, La/ob90;-><init>(La/a4x0;Ljava/io/Serializable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3, v2}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :pswitch_4
    sget-object v1, La/v1x0;->a:La/do20;

    .line 381
    .line 382
    iget-object v2, v0, La/pb90;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, Ljava/util/logging/Level;

    .line 385
    .line 386
    iget-object v3, v1, La/do20;->a:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v3, La/dwb;

    .line 389
    .line 390
    invoke-virtual {v3, v2}, La/dwb;->a(Ljava/util/logging/Level;)Z

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    iget-object v3, v3, La/dwb;->a:Ljava/lang/String;

    .line 395
    .line 396
    sget-object v5, La/rbw0;->a:La/sbw0;

    .line 397
    .line 398
    check-cast v5, La/wbw0;

    .line 399
    .line 400
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    sget-object v5, La/ccw0;->b:La/ccw0;

    .line 404
    .line 405
    invoke-virtual {v5, v3, v2, v4}, La/ccw0;->a(Ljava/lang/String;Ljava/util/logging/Level;Z)V

    .line 406
    .line 407
    .line 408
    if-nez v4, :cond_4

    .line 409
    .line 410
    sget-object v1, La/do20;->c:La/nfx0;

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_4
    new-instance v3, La/lfx0;

    .line 414
    .line 415
    invoke-direct {v3, v1, v2}, La/lfx0;-><init>(La/do20;Ljava/util/logging/Level;)V

    .line 416
    .line 417
    .line 418
    move-object v1, v3

    .line 419
    :goto_b
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v2, Ljava/lang/Throwable;

    .line 422
    .line 423
    invoke-interface {v1, v2}, La/rgx0;->a(Ljava/lang/Throwable;)La/rgx0;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, La/gfx0;

    .line 428
    .line 429
    invoke-interface {v1}, La/rgx0;->zzn()La/rgx0;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, La/gfx0;

    .line 434
    .line 435
    iget-object v2, v0, La/pb90;->d:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v2, Ljava/lang/String;

    .line 438
    .line 439
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, [Ljava/lang/Object;

    .line 442
    .line 443
    invoke-interface {v1, v2, v0}, La/rgx0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :pswitch_5
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v1, La/fui0;

    .line 450
    .line 451
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 454
    .line 455
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v3, Landroid/content/Context;

    .line 458
    .line 459
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, La/k0x0;

    .line 462
    .line 463
    iget-object v1, v1, La/r2;->a:Ljava/lang/Object;

    .line 464
    .line 465
    instance-of v1, v1, La/e2;

    .line 466
    .line 467
    if-eqz v1, :cond_5

    .line 468
    .line 469
    invoke-virtual {v2, v9, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_5

    .line 474
    .line 475
    :try_start_b
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_b} :catch_3

    .line 476
    .line 477
    .line 478
    goto :goto_c

    .line 479
    :catch_3
    move-exception v0

    .line 480
    const-string v1, "DirectBootUtils"

    .line 481
    .line 482
    const-string v2, "Failed to unregister receiver"

    .line 483
    .line 484
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 485
    .line 486
    .line 487
    :cond_5
    :goto_c
    return-void

    .line 488
    :pswitch_6
    iget-object v1, v0, La/pb90;->c:Ljava/lang/Object;

    .line 489
    .line 490
    move-object v5, v1

    .line 491
    check-cast v5, Ljava/lang/String;

    .line 492
    .line 493
    iget-object v1, v0, La/pb90;->d:Ljava/lang/Object;

    .line 494
    .line 495
    move-object v6, v1

    .line 496
    check-cast v6, Ljava/lang/String;

    .line 497
    .line 498
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, La/b1x0;

    .line 501
    .line 502
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, La/kxw0;

    .line 505
    .line 506
    invoke-virtual {v1}, La/kxw0;->i()La/a4x0;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    iget-object v0, v0, La/pb90;->b:Ljava/lang/Object;

    .line 511
    .line 512
    move-object v4, v0

    .line 513
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 514
    .line 515
    invoke-virtual {v3}, La/zrw0;->m1()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3}, La/etw0;->n1()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v9}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    new-instance v2, La/ob90;

    .line 526
    .line 527
    const/4 v8, 0x2

    .line 528
    invoke-direct/range {v2 .. v8}, La/ob90;-><init>(La/a4x0;Ljava/io/Serializable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v2}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_7
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v1, La/oyw0;

    .line 538
    .line 539
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 540
    .line 541
    move-object/from16 v20, v2

    .line 542
    .line 543
    check-cast v20, Landroid/os/Bundle;

    .line 544
    .line 545
    iget-object v2, v0, La/pb90;->d:Ljava/lang/Object;

    .line 546
    .line 547
    move-object v12, v2

    .line 548
    check-cast v12, Ljava/lang/String;

    .line 549
    .line 550
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 551
    .line 552
    move-object v2, v0

    .line 553
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 554
    .line 555
    invoke-virtual/range {v20 .. v20}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    iget-object v1, v1, La/oyw0;->a:La/m6x0;

    .line 560
    .line 561
    if-eqz v0, :cond_6

    .line 562
    .line 563
    iget-object v1, v1, La/m6x0;->c:La/zlw0;

    .line 564
    .line 565
    invoke-static {v1}, La/m6x0;->T(La/u5x0;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1}, La/p4;->m1()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1}, La/u5x0;->n1()V

    .line 572
    .line 573
    .line 574
    :try_start_c
    invoke-virtual {v1}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    const-string v2, "delete from default_event_params where app_id=?"

    .line 579
    .line 580
    filled-new-array {v12}, [Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_4

    .line 585
    .line 586
    .line 587
    goto/16 :goto_e

    .line 588
    .line 589
    :catch_4
    move-exception v0

    .line 590
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v1, La/kxw0;

    .line 593
    .line 594
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 595
    .line 596
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 597
    .line 598
    .line 599
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 600
    .line 601
    const-string v2, "Error clearing default event params"

    .line 602
    .line 603
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_e

    .line 607
    .line 608
    :cond_6
    iget-object v0, v1, La/m6x0;->c:La/zlw0;

    .line 609
    .line 610
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 611
    .line 612
    .line 613
    iget-object v5, v0, La/p4;->b:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v5, La/kxw0;

    .line 616
    .line 617
    invoke-virtual {v0}, La/p4;->m1()V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, La/u5x0;->n1()V

    .line 621
    .line 622
    .line 623
    iget-object v6, v0, La/p4;->b:Ljava/lang/Object;

    .line 624
    .line 625
    move-object v10, v6

    .line 626
    check-cast v10, La/kxw0;

    .line 627
    .line 628
    const-string v13, "dep"

    .line 629
    .line 630
    new-instance v9, La/lmw0;

    .line 631
    .line 632
    const-string v11, ""

    .line 633
    .line 634
    const-wide/16 v16, 0x0

    .line 635
    .line 636
    const-wide/16 v18, 0x0

    .line 637
    .line 638
    const-wide/16 v14, 0x0

    .line 639
    .line 640
    invoke-direct/range {v9 .. v20}, La/lmw0;-><init>(La/kxw0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLandroid/os/Bundle;)V

    .line 641
    .line 642
    .line 643
    move-object/from16 v6, v20

    .line 644
    .line 645
    iget-object v7, v0, La/k5x0;->c:La/m6x0;

    .line 646
    .line 647
    iget-object v7, v7, La/m6x0;->g:La/r6x0;

    .line 648
    .line 649
    invoke-static {v7}, La/m6x0;->T(La/u5x0;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v7, v9}, La/r6x0;->M1(La/lmw0;)La/sww0;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    invoke-virtual {v7}, La/jdw0;->a()[B

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    iget-object v5, v5, La/kxw0;->f:La/uuw0;

    .line 661
    .line 662
    invoke-static {v5}, La/kxw0;->g(La/ryw0;)V

    .line 663
    .line 664
    .line 665
    iget-object v9, v5, La/uuw0;->o:La/quw0;

    .line 666
    .line 667
    array-length v10, v7

    .line 668
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 669
    .line 670
    .line 671
    move-result-object v10

    .line 672
    const-string v11, "Saving default event parameters, appId, data size"

    .line 673
    .line 674
    invoke-virtual {v9, v12, v10, v11}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    new-instance v9, Landroid/content/ContentValues;

    .line 678
    .line 679
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 680
    .line 681
    .line 682
    const-string v10, "app_id"

    .line 683
    .line 684
    invoke-virtual {v9, v10, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    const-string v10, "parameters"

    .line 688
    .line 689
    invoke-virtual {v9, v10, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 690
    .line 691
    .line 692
    :try_start_d
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    const-string v7, "default_event_params"

    .line 697
    .line 698
    const/4 v10, 0x5

    .line 699
    invoke-virtual {v0, v7, v8, v9, v10}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 700
    .line 701
    .line 702
    move-result-wide v9

    .line 703
    const-wide/16 v13, -0x1

    .line 704
    .line 705
    cmp-long v0, v9, v13

    .line 706
    .line 707
    if-nez v0, :cond_7

    .line 708
    .line 709
    invoke-static {v5}, La/kxw0;->g(La/ryw0;)V

    .line 710
    .line 711
    .line 712
    iget-object v0, v5, La/uuw0;->g:La/quw0;

    .line 713
    .line 714
    const-string v7, "Failed to insert default event parameters (got -1). appId"

    .line 715
    .line 716
    invoke-static {v12}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    invoke-virtual {v0, v9, v7}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_5

    .line 721
    .line 722
    .line 723
    goto :goto_d

    .line 724
    :catch_5
    move-exception v0

    .line 725
    invoke-static {v5}, La/kxw0;->g(La/ryw0;)V

    .line 726
    .line 727
    .line 728
    iget-object v5, v5, La/uuw0;->g:La/quw0;

    .line 729
    .line 730
    invoke-static {v12}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 731
    .line 732
    .line 733
    move-result-object v7

    .line 734
    const-string v9, "Error storing default event parameters. appId"

    .line 735
    .line 736
    invoke-virtual {v5, v7, v0, v9}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    :cond_7
    :goto_d
    iget-object v5, v1, La/m6x0;->c:La/zlw0;

    .line 740
    .line 741
    invoke-static {v5}, La/m6x0;->T(La/u5x0;)V

    .line 742
    .line 743
    .line 744
    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->Z:J

    .line 745
    .line 746
    :try_start_e
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;"

    .line 747
    .line 748
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    filled-new-array {v12, v2}, [Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-virtual {v5, v0, v2, v3, v4}, La/zlw0;->J1(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 757
    .line 758
    .line 759
    move-result-wide v13

    .line 760
    cmp-long v0, v13, v3

    .line 761
    .line 762
    if-lez v0, :cond_8

    .line 763
    .line 764
    goto :goto_e

    .line 765
    :cond_8
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;"

    .line 766
    .line 767
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    filled-new-array {v12, v2}, [Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-virtual {v5, v0, v2, v3, v4}, La/zlw0;->J1(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 776
    .line 777
    .line 778
    move-result-wide v13
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_6

    .line 779
    cmp-long v0, v13, v3

    .line 780
    .line 781
    if-lez v0, :cond_9

    .line 782
    .line 783
    iget-object v0, v1, La/m6x0;->c:La/zlw0;

    .line 784
    .line 785
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 786
    .line 787
    .line 788
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    invoke-virtual {v0, v12, v1, v8, v6}, La/zlw0;->F1(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 793
    .line 794
    .line 795
    goto :goto_e

    .line 796
    :catch_6
    move-exception v0

    .line 797
    iget-object v1, v5, La/p4;->b:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v1, La/kxw0;

    .line 800
    .line 801
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 802
    .line 803
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 804
    .line 805
    .line 806
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 807
    .line 808
    const-string v2, "Error checking backfill conditions"

    .line 809
    .line 810
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    :cond_9
    :goto_e
    return-void

    .line 814
    :pswitch_8
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 817
    .line 818
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 819
    .line 820
    invoke-virtual {v1}, La/kxw0;->i()La/a4x0;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 825
    .line 826
    move-object v6, v1

    .line 827
    check-cast v6, La/gpw0;

    .line 828
    .line 829
    iget-object v1, v0, La/pb90;->c:Ljava/lang/Object;

    .line 830
    .line 831
    move-object v4, v1

    .line 832
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 833
    .line 834
    iget-object v0, v0, La/pb90;->d:Ljava/lang/Object;

    .line 835
    .line 836
    move-object v5, v0

    .line 837
    check-cast v5, Ljava/lang/String;

    .line 838
    .line 839
    invoke-virtual {v3}, La/zrw0;->m1()V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v3}, La/etw0;->n1()V

    .line 843
    .line 844
    .line 845
    iget-object v0, v3, La/p4;->b:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v0, La/kxw0;

    .line 848
    .line 849
    iget-object v1, v0, La/kxw0;->i:La/x6x0;

    .line 850
    .line 851
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 852
    .line 853
    .line 854
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v1, La/kxw0;

    .line 857
    .line 858
    sget-object v2, La/pav;->b:La/pav;

    .line 859
    .line 860
    iget-object v1, v1, La/kxw0;->a:Landroid/content/Context;

    .line 861
    .line 862
    const v7, 0xbdfcb8

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2, v1, v7}, La/pav;->c(Landroid/content/Context;I)I

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-eqz v1, :cond_a

    .line 870
    .line 871
    iget-object v1, v0, La/kxw0;->f:La/uuw0;

    .line 872
    .line 873
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 874
    .line 875
    .line 876
    iget-object v1, v1, La/uuw0;->j:La/quw0;

    .line 877
    .line 878
    const-string v2, "Not bundling data. Service unavailable or out of date"

    .line 879
    .line 880
    invoke-virtual {v1, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    iget-object v0, v0, La/kxw0;->i:La/x6x0;

    .line 884
    .line 885
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 886
    .line 887
    .line 888
    new-array v1, v9, [B

    .line 889
    .line 890
    invoke-virtual {v0, v6, v1}, La/x6x0;->c2(La/gpw0;[B)V

    .line 891
    .line 892
    .line 893
    goto :goto_f

    .line 894
    :cond_a
    new-instance v2, La/pb90;

    .line 895
    .line 896
    const/16 v8, 0xd

    .line 897
    .line 898
    const/4 v7, 0x0

    .line 899
    invoke-direct/range {v2 .. v8}, La/pb90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v3, v2}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 903
    .line 904
    .line 905
    :goto_f
    return-void

    .line 906
    :pswitch_9
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v1, La/oyw0;

    .line 909
    .line 910
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v2, Ljava/lang/String;

    .line 913
    .line 914
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzoo;

    .line 917
    .line 918
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v0, La/ttw0;

    .line 921
    .line 922
    iget-object v1, v1, La/oyw0;->a:La/m6x0;

    .line 923
    .line 924
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v1}, La/m6x0;->J()La/fxw0;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    invoke-virtual {v4}, La/fxw0;->m1()V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v1}, La/m6x0;->l0()V

    .line 935
    .line 936
    .line 937
    iget-object v4, v1, La/m6x0;->c:La/zlw0;

    .line 938
    .line 939
    invoke-static {v4}, La/m6x0;->T(La/u5x0;)V

    .line 940
    .line 941
    .line 942
    sget-object v5, La/btw0;->B:La/atw0;

    .line 943
    .line 944
    invoke-virtual {v5, v8}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v5

    .line 948
    check-cast v5, Ljava/lang/Integer;

    .line 949
    .line 950
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 951
    .line 952
    .line 953
    move-result v5

    .line 954
    invoke-virtual {v4, v2, v3, v5}, La/zlw0;->r1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;I)Ljava/util/List;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    new-instance v4, Ljava/util/ArrayList;

    .line 959
    .line 960
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 961
    .line 962
    .line 963
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 964
    .line 965
    .line 966
    move-result-object v3

    .line 967
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    if-eqz v5, :cond_12

    .line 972
    .line 973
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v5

    .line 977
    check-cast v5, La/p6x0;

    .line 978
    .line 979
    iget-object v7, v5, La/p6x0;->c:Ljava/lang/String;

    .line 980
    .line 981
    iget-wide v10, v5, La/p6x0;->h:J

    .line 982
    .line 983
    iget-wide v12, v5, La/p6x0;->a:J

    .line 984
    .line 985
    invoke-virtual {v1, v2, v7}, La/m6x0;->n(Ljava/lang/String;Ljava/lang/String;)Z

    .line 986
    .line 987
    .line 988
    move-result v7

    .line 989
    if-nez v7, :cond_b

    .line 990
    .line 991
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 992
    .line 993
    .line 994
    move-result-object v7

    .line 995
    iget-object v7, v7, La/uuw0;->o:La/quw0;

    .line 996
    .line 997
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 998
    .line 999
    .line 1000
    move-result-object v10

    .line 1001
    iget-object v5, v5, La/p6x0;->c:Ljava/lang/String;

    .line 1002
    .line 1003
    const-string v11, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    .line 1004
    .line 1005
    invoke-virtual {v7, v11, v2, v10, v5}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_10

    .line 1009
    :cond_b
    iget v7, v5, La/p6x0;->i:I

    .line 1010
    .line 1011
    if-gtz v7, :cond_c

    .line 1012
    .line 1013
    goto :goto_11

    .line 1014
    :cond_c
    sget-object v14, La/btw0;->z:La/atw0;

    .line 1015
    .line 1016
    invoke-virtual {v14, v8}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v14

    .line 1020
    check-cast v14, Ljava/lang/Integer;

    .line 1021
    .line 1022
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1023
    .line 1024
    .line 1025
    move-result v14

    .line 1026
    if-le v7, v14, :cond_d

    .line 1027
    .line 1028
    goto/16 :goto_15

    .line 1029
    .line 1030
    :cond_d
    sget-object v14, La/btw0;->x:La/atw0;

    .line 1031
    .line 1032
    invoke-virtual {v14, v8}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v14

    .line 1036
    check-cast v14, Ljava/lang/Long;

    .line 1037
    .line 1038
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v14

    .line 1042
    add-int/lit8 v7, v7, -0x1

    .line 1043
    .line 1044
    const-wide/16 v16, 0x1

    .line 1045
    .line 1046
    shl-long v16, v16, v7

    .line 1047
    .line 1048
    mul-long v14, v14, v16

    .line 1049
    .line 1050
    sget-object v7, La/btw0;->y:La/atw0;

    .line 1051
    .line 1052
    invoke-virtual {v7, v8}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v7

    .line 1056
    check-cast v7, Ljava/lang/Long;

    .line 1057
    .line 1058
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v8

    .line 1062
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 1063
    .line 1064
    .line 1065
    move-result-wide v7

    .line 1066
    invoke-virtual {v1}, La/m6x0;->S()La/lwf;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v9

    .line 1070
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v14

    .line 1077
    add-long/2addr v7, v10

    .line 1078
    cmp-long v7, v14, v7

    .line 1079
    .line 1080
    if-ltz v7, :cond_11

    .line 1081
    .line 1082
    :goto_11
    new-instance v7, Landroid/os/Bundle;

    .line 1083
    .line 1084
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1085
    .line 1086
    .line 1087
    iget-object v8, v5, La/p6x0;->d:Ljava/util/HashMap;

    .line 1088
    .line 1089
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v8

    .line 1093
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v8

    .line 1097
    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v9

    .line 1101
    if-eqz v9, :cond_e

    .line 1102
    .line 1103
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v9

    .line 1107
    check-cast v9, Ljava/util/Map$Entry;

    .line 1108
    .line 1109
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v10

    .line 1113
    check-cast v10, Ljava/lang/String;

    .line 1114
    .line 1115
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v9

    .line 1119
    check-cast v9, Ljava/lang/String;

    .line 1120
    .line 1121
    invoke-virtual {v7, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    goto :goto_12

    .line 1125
    :cond_e
    iget-wide v8, v5, La/p6x0;->a:J

    .line 1126
    .line 1127
    iget-object v10, v5, La/p6x0;->b:La/ixw0;

    .line 1128
    .line 1129
    iget-object v11, v5, La/p6x0;->c:Ljava/lang/String;

    .line 1130
    .line 1131
    iget-object v12, v5, La/p6x0;->e:La/q1x0;

    .line 1132
    .line 1133
    iget-wide v13, v5, La/p6x0;->g:J

    .line 1134
    .line 1135
    new-instance v18, Lcom/google/android/gms/measurement/internal/zzom;

    .line 1136
    .line 1137
    invoke-virtual {v10}, La/jdw0;->a()[B

    .line 1138
    .line 1139
    .line 1140
    move-result-object v21

    .line 1141
    iget-byte v5, v12, La/q1x0;->a:B

    .line 1142
    .line 1143
    const-string v27, ""

    .line 1144
    .line 1145
    move/from16 v24, v5

    .line 1146
    .line 1147
    move-object/from16 v23, v7

    .line 1148
    .line 1149
    move-wide/from16 v19, v8

    .line 1150
    .line 1151
    move-object/from16 v22, v11

    .line 1152
    .line 1153
    move-wide/from16 v25, v13

    .line 1154
    .line 1155
    invoke-direct/range {v18 .. v27}, Lcom/google/android/gms/measurement/internal/zzom;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    move-object/from16 v5, v18

    .line 1159
    .line 1160
    :try_start_f
    invoke-static {}, La/ixw0;->y()La/exw0;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v7

    .line 1164
    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/zzom;->b:[B

    .line 1165
    .line 1166
    invoke-static {v7, v8}, La/r6x0;->X1(La/iew0;[B)La/iew0;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v7

    .line 1170
    check-cast v7, La/exw0;

    .line 1171
    .line 1172
    const/4 v8, 0x0

    .line 1173
    :goto_13
    iget-object v9, v7, La/iew0;->b:La/mew0;

    .line 1174
    .line 1175
    check-cast v9, La/ixw0;

    .line 1176
    .line 1177
    invoke-virtual {v9}, La/ixw0;->s()I

    .line 1178
    .line 1179
    .line 1180
    move-result v9

    .line 1181
    if-ge v8, v9, :cond_f

    .line 1182
    .line 1183
    iget-object v9, v7, La/iew0;->b:La/mew0;

    .line 1184
    .line 1185
    check-cast v9, La/ixw0;

    .line 1186
    .line 1187
    invoke-virtual {v9, v8}, La/ixw0;->t(I)La/mxw0;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v9

    .line 1191
    invoke-virtual {v9}, La/mew0;->i()La/iew0;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v9

    .line 1195
    check-cast v9, La/jxw0;

    .line 1196
    .line 1197
    invoke-virtual {v1}, La/m6x0;->S()La/lwf;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v10

    .line 1201
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v10

    .line 1208
    invoke-virtual {v9}, La/iew0;->c()V

    .line 1209
    .line 1210
    .line 1211
    iget-object v12, v9, La/iew0;->b:La/mew0;

    .line 1212
    .line 1213
    check-cast v12, La/mxw0;

    .line 1214
    .line 1215
    invoke-virtual {v12, v10, v11}, La/mxw0;->h0(J)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v7}, La/iew0;->c()V

    .line 1219
    .line 1220
    .line 1221
    iget-object v10, v7, La/iew0;->b:La/mew0;

    .line 1222
    .line 1223
    check-cast v10, La/ixw0;

    .line 1224
    .line 1225
    invoke-virtual {v9}, La/iew0;->e()La/mew0;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v9

    .line 1229
    check-cast v9, La/mxw0;

    .line 1230
    .line 1231
    invoke-virtual {v10, v8, v9}, La/ixw0;->A(ILa/mxw0;)V

    .line 1232
    .line 1233
    .line 1234
    add-int/lit8 v8, v8, 0x1

    .line 1235
    .line 1236
    goto :goto_13

    .line 1237
    :cond_f
    invoke-virtual {v7}, La/iew0;->e()La/mew0;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v8

    .line 1241
    check-cast v8, La/ixw0;

    .line 1242
    .line 1243
    invoke-virtual {v8}, La/jdw0;->a()[B

    .line 1244
    .line 1245
    .line 1246
    move-result-object v8

    .line 1247
    iput-object v8, v5, Lcom/google/android/gms/measurement/internal/zzom;->b:[B

    .line 1248
    .line 1249
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v8

    .line 1253
    invoke-virtual {v8}, La/uuw0;->s1()Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v8

    .line 1257
    invoke-static {v8, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v8

    .line 1261
    if-eqz v8, :cond_10

    .line 1262
    .line 1263
    iget-object v8, v1, La/m6x0;->g:La/r6x0;

    .line 1264
    .line 1265
    invoke-static {v8}, La/m6x0;->T(La/u5x0;)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v7}, La/iew0;->e()La/mew0;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v7

    .line 1272
    check-cast v7, La/ixw0;

    .line 1273
    .line 1274
    invoke-virtual {v8, v7}, La/r6x0;->N1(La/ixw0;)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v7

    .line 1278
    iput-object v7, v5, Lcom/google/android/gms/measurement/internal/zzom;->g:Ljava/lang/String;
    :try_end_f
    .catch La/zew0; {:try_start_f .. :try_end_f} :catch_7

    .line 1279
    .line 1280
    :cond_10
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1281
    .line 1282
    .line 1283
    :goto_14
    const/4 v8, 0x0

    .line 1284
    const/4 v9, 0x0

    .line 1285
    goto/16 :goto_10

    .line 1286
    .line 1287
    :catch_7
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v5

    .line 1291
    iget-object v5, v5, La/uuw0;->j:La/quw0;

    .line 1292
    .line 1293
    const-string v7, "Failed to parse queued batch. appId"

    .line 1294
    .line 1295
    invoke-virtual {v5, v2, v7}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    goto :goto_14

    .line 1299
    :cond_11
    :goto_15
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v5

    .line 1303
    iget-object v5, v5, La/uuw0;->o:La/quw0;

    .line 1304
    .line 1305
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v7

    .line 1309
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v8

    .line 1313
    const-string v9, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    .line 1314
    .line 1315
    invoke-virtual {v5, v9, v2, v7, v8}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_14

    .line 1319
    :cond_12
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzoq;

    .line 1320
    .line 1321
    invoke-direct {v3, v4}, Lcom/google/android/gms/measurement/internal/zzoq;-><init>(Ljava/util/ArrayList;)V

    .line 1322
    .line 1323
    .line 1324
    :try_start_10
    invoke-interface {v0, v3}, La/ttw0;->w(Lcom/google/android/gms/measurement/internal/zzoq;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 1332
    .line 1333
    const-string v3, "[sgtm] Sending queued upload batches to client. appId, count"

    .line 1334
    .line 1335
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1336
    .line 1337
    .line 1338
    move-result v4

    .line 1339
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v4

    .line 1343
    invoke-virtual {v0, v2, v4, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_10
    .catch Landroid/os/RemoteException; {:try_start_10 .. :try_end_10} :catch_8

    .line 1344
    .line 1345
    .line 1346
    goto :goto_16

    .line 1347
    :catch_8
    move-exception v0

    .line 1348
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 1353
    .line 1354
    const-string v3, "[sgtm] Failed to return upload batches for app"

    .line 1355
    .line 1356
    invoke-virtual {v1, v2, v0, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    :goto_16
    return-void

    .line 1360
    :pswitch_a
    iget-object v1, v0, La/pb90;->b:Ljava/lang/Object;

    .line 1361
    .line 1362
    check-cast v1, Landroid/view/View;

    .line 1363
    .line 1364
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v2, La/div0;

    .line 1367
    .line 1368
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1369
    .line 1370
    check-cast v3, La/hcp0;

    .line 1371
    .line 1372
    invoke-static {v1, v2, v3}, La/yhv0;->i(Landroid/view/View;La/div0;La/hcp0;)V

    .line 1373
    .line 1374
    .line 1375
    iget-object v0, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 1378
    .line 1379
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1380
    .line 1381
    .line 1382
    return-void

    .line 1383
    :pswitch_b
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1384
    .line 1385
    check-cast v1, Landroid/view/View;

    .line 1386
    .line 1387
    iget-object v3, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1388
    .line 1389
    check-cast v3, La/xiv0;

    .line 1390
    .line 1391
    iget-object v3, v3, La/xiv0;->a:La/uiv0;

    .line 1392
    .line 1393
    iget-object v4, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v4, La/stl;

    .line 1396
    .line 1397
    iget-object v0, v0, La/pb90;->b:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v0, Landroid/view/View;

    .line 1400
    .line 1401
    sget-object v8, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 1402
    .line 1403
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    if-eqz v0, :cond_13

    .line 1408
    .line 1409
    iget-object v8, v0, La/xiv0;->a:La/uiv0;

    .line 1410
    .line 1411
    invoke-virtual {v8, v5}, La/uiv0;->u(I)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v8

    .line 1415
    if-ne v8, v7, :cond_13

    .line 1416
    .line 1417
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v8

    .line 1421
    if-eqz v8, :cond_13

    .line 1422
    .line 1423
    iget-object v4, v4, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1424
    .line 1425
    if-eqz v4, :cond_13

    .line 1426
    .line 1427
    invoke-virtual {v4, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 1428
    .line 1429
    .line 1430
    :cond_13
    if-eqz v0, :cond_14

    .line 1431
    .line 1432
    iget-object v2, v0, La/xiv0;->a:La/uiv0;

    .line 1433
    .line 1434
    invoke-virtual {v2, v5}, La/uiv0;->u(I)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v2

    .line 1438
    if-ne v2, v7, :cond_14

    .line 1439
    .line 1440
    invoke-virtual {v3, v5}, La/uiv0;->i(I)La/pfx;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    iget v2, v2, La/pfx;->d:I

    .line 1445
    .line 1446
    goto :goto_17

    .line 1447
    :cond_14
    invoke-virtual {v3, v6}, La/uiv0;->i(I)La/pfx;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v2

    .line 1451
    iget v2, v2, La/pfx;->d:I

    .line 1452
    .line 1453
    :goto_17
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 1454
    .line 1455
    .line 1456
    move-result v3

    .line 1457
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 1458
    .line 1459
    .line 1460
    move-result v4

    .line 1461
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 1462
    .line 1463
    .line 1464
    move-result v5

    .line 1465
    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v1

    .line 1472
    instance-of v2, v1, Landroid/view/View;

    .line 1473
    .line 1474
    if-eqz v2, :cond_15

    .line 1475
    .line 1476
    move-object v8, v1

    .line 1477
    check-cast v8, Landroid/view/View;

    .line 1478
    .line 1479
    goto :goto_18

    .line 1480
    :cond_15
    const/4 v8, 0x0

    .line 1481
    :goto_18
    if-eqz v8, :cond_17

    .line 1482
    .line 1483
    if-eqz v0, :cond_16

    .line 1484
    .line 1485
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 1486
    .line 1487
    invoke-virtual {v0, v7}, La/uiv0;->i(I)La/pfx;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    if-eqz v0, :cond_16

    .line 1492
    .line 1493
    iget v9, v0, La/pfx;->b:I

    .line 1494
    .line 1495
    goto :goto_19

    .line 1496
    :cond_16
    const/4 v9, 0x0

    .line 1497
    :goto_19
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 1498
    .line 1499
    .line 1500
    move-result v0

    .line 1501
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 1502
    .line 1503
    .line 1504
    move-result v1

    .line 1505
    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    .line 1506
    .line 1507
    .line 1508
    move-result v2

    .line 1509
    invoke-virtual {v8, v0, v9, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1510
    .line 1511
    .line 1512
    :cond_17
    return-void

    .line 1513
    :pswitch_c
    iget-object v1, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1514
    .line 1515
    move-object v8, v1

    .line 1516
    check-cast v8, La/m7l;

    .line 1517
    .line 1518
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1519
    .line 1520
    check-cast v1, La/x23;

    .line 1521
    .line 1522
    iget-object v2, v1, La/x23;->c:Ljava/lang/Object;

    .line 1523
    .line 1524
    check-cast v2, Landroid/widget/ImageView;

    .line 1525
    .line 1526
    iget-object v0, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v0, La/o5l;

    .line 1529
    .line 1530
    iget-boolean v3, v0, La/o5l;->f:Z

    .line 1531
    .line 1532
    if-eqz v3, :cond_1b

    .line 1533
    .line 1534
    invoke-virtual {v8}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v4

    .line 1538
    if-nez v4, :cond_18

    .line 1539
    .line 1540
    goto :goto_1a

    .line 1541
    :cond_18
    const/4 v7, 0x0

    .line 1542
    :goto_1a
    if-eqz v7, :cond_19

    .line 1543
    .line 1544
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 1545
    .line 1546
    iget-object v9, v0, La/o5l;->b:Ljava/lang/String;

    .line 1547
    .line 1548
    const/4 v14, 0x0

    .line 1549
    const/16 v15, 0x1fe

    .line 1550
    .line 1551
    const/4 v10, 0x0

    .line 1552
    const/4 v11, 0x0

    .line 1553
    const/4 v12, 0x0

    .line 1554
    const/4 v13, 0x0

    .line 1555
    invoke-static/range {v8 .. v15}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1556
    .line 1557
    .line 1558
    iget-boolean v4, v0, La/o5l;->c:Z

    .line 1559
    .line 1560
    invoke-virtual {v8, v4}, La/m7l;->setRadiant(Z)V

    .line 1561
    .line 1562
    .line 1563
    :cond_19
    iget v4, v0, La/o5l;->d:I

    .line 1564
    .line 1565
    int-to-float v4, v4

    .line 1566
    const/high16 v9, 0x42c80000    # 100.0f

    .line 1567
    .line 1568
    div-float/2addr v4, v9

    .line 1569
    iget v0, v0, La/o5l;->e:I

    .line 1570
    .line 1571
    int-to-float v0, v0

    .line 1572
    div-float/2addr v0, v9

    .line 1573
    iget v9, v1, La/x23;->b:I

    .line 1574
    .line 1575
    div-int/2addr v9, v6

    .line 1576
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 1577
    .line 1578
    .line 1579
    move-result v6

    .line 1580
    int-to-float v6, v6

    .line 1581
    mul-float/2addr v6, v4

    .line 1582
    int-to-float v4, v9

    .line 1583
    sub-float/2addr v6, v4

    .line 1584
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 1585
    .line 1586
    .line 1587
    move-result v9

    .line 1588
    int-to-float v9, v9

    .line 1589
    mul-float/2addr v9, v0

    .line 1590
    sub-float/2addr v9, v4

    .line 1591
    if-nez v7, :cond_1a

    .line 1592
    .line 1593
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v0

    .line 1597
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 1598
    .line 1599
    .line 1600
    move-result v1

    .line 1601
    int-to-float v1, v1

    .line 1602
    add-float/2addr v1, v6

    .line 1603
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1608
    .line 1609
    .line 1610
    move-result v1

    .line 1611
    int-to-float v1, v1

    .line 1612
    add-float/2addr v1, v9

    .line 1613
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1618
    .line 1619
    .line 1620
    goto :goto_1b

    .line 1621
    :cond_1a
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 1622
    .line 1623
    .line 1624
    move-result v0

    .line 1625
    int-to-float v0, v0

    .line 1626
    add-float/2addr v0, v6

    .line 1627
    float-to-int v0, v0

    .line 1628
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1629
    .line 1630
    .line 1631
    move-result v4

    .line 1632
    int-to-float v4, v4

    .line 1633
    add-float/2addr v4, v9

    .line 1634
    float-to-int v4, v4

    .line 1635
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 1636
    .line 1637
    .line 1638
    move-result v7

    .line 1639
    int-to-float v7, v7

    .line 1640
    add-float/2addr v7, v6

    .line 1641
    iget v6, v1, La/x23;->b:I

    .line 1642
    .line 1643
    int-to-float v6, v6

    .line 1644
    add-float/2addr v7, v6

    .line 1645
    float-to-int v6, v7

    .line 1646
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1647
    .line 1648
    .line 1649
    move-result v2

    .line 1650
    int-to-float v2, v2

    .line 1651
    add-float/2addr v2, v9

    .line 1652
    iget v1, v1, La/x23;->b:I

    .line 1653
    .line 1654
    int-to-float v1, v1

    .line 1655
    add-float/2addr v2, v1

    .line 1656
    float-to-int v1, v2

    .line 1657
    invoke-virtual {v8, v0, v4, v6, v1}, Landroid/view/View;->layout(IIII)V

    .line 1658
    .line 1659
    .line 1660
    :cond_1b
    :goto_1b
    if-eqz v3, :cond_1c

    .line 1661
    .line 1662
    const/4 v5, 0x0

    .line 1663
    :cond_1c
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1664
    .line 1665
    .line 1666
    return-void

    .line 1667
    :pswitch_d
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v1, La/r7v;

    .line 1670
    .line 1671
    iget-object v1, v1, La/r7v;->a:Ljava/lang/Object;

    .line 1672
    .line 1673
    check-cast v1, La/wva;

    .line 1674
    .line 1675
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1676
    .line 1677
    check-cast v2, La/hz30;

    .line 1678
    .line 1679
    iget-object v3, v0, La/pb90;->b:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v3, La/vva;

    .line 1682
    .line 1683
    if-eqz v3, :cond_1d

    .line 1684
    .line 1685
    iput-boolean v7, v1, La/wva;->A:Z

    .line 1686
    .line 1687
    iget-object v3, v3, La/vva;->b:La/ox30;

    .line 1688
    .line 1689
    const/4 v4, 0x0

    .line 1690
    invoke-virtual {v3, v4}, La/ox30;->c(Z)V

    .line 1691
    .line 1692
    .line 1693
    iput-boolean v4, v1, La/wva;->A:Z

    .line 1694
    .line 1695
    :cond_1d
    invoke-virtual {v2}, La/hz30;->isEnabled()Z

    .line 1696
    .line 1697
    .line 1698
    move-result v1

    .line 1699
    if-eqz v1, :cond_1e

    .line 1700
    .line 1701
    invoke-virtual {v2}, La/hz30;->hasSubMenu()Z

    .line 1702
    .line 1703
    .line 1704
    move-result v1

    .line 1705
    if-eqz v1, :cond_1e

    .line 1706
    .line 1707
    iget-object v0, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1708
    .line 1709
    check-cast v0, La/ox30;

    .line 1710
    .line 1711
    const/4 v1, 0x4

    .line 1712
    const/4 v3, 0x0

    .line 1713
    invoke-virtual {v0, v2, v3, v1}, La/ox30;->q(Landroid/view/MenuItem;La/c040;I)Z

    .line 1714
    .line 1715
    .line 1716
    :cond_1e
    return-void

    .line 1717
    :pswitch_e
    move-object v3, v8

    .line 1718
    move v4, v9

    .line 1719
    iget-object v1, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1720
    .line 1721
    check-cast v1, La/nw5;

    .line 1722
    .line 1723
    iget-object v8, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1724
    .line 1725
    check-cast v8, Landroid/view/View;

    .line 1726
    .line 1727
    iget-object v9, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1728
    .line 1729
    check-cast v9, La/xiv0;

    .line 1730
    .line 1731
    iget-object v9, v9, La/xiv0;->a:La/uiv0;

    .line 1732
    .line 1733
    iget-object v0, v0, La/pb90;->b:Ljava/lang/Object;

    .line 1734
    .line 1735
    check-cast v0, Landroid/view/View;

    .line 1736
    .line 1737
    sget-object v10, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 1738
    .line 1739
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    if-eqz v0, :cond_1f

    .line 1744
    .line 1745
    iget-object v10, v0, La/xiv0;->a:La/uiv0;

    .line 1746
    .line 1747
    invoke-virtual {v10, v5}, La/uiv0;->u(I)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v10

    .line 1751
    if-ne v10, v7, :cond_1f

    .line 1752
    .line 1753
    invoke-virtual {v9, v5}, La/uiv0;->i(I)La/pfx;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v6

    .line 1757
    iget v6, v6, La/pfx;->d:I

    .line 1758
    .line 1759
    goto :goto_1c

    .line 1760
    :cond_1f
    invoke-virtual {v9, v6}, La/uiv0;->i(I)La/pfx;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v6

    .line 1764
    iget v6, v6, La/pfx;->d:I

    .line 1765
    .line 1766
    :goto_1c
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 1767
    .line 1768
    .line 1769
    move-result v9

    .line 1770
    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    .line 1771
    .line 1772
    .line 1773
    move-result v10

    .line 1774
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 1775
    .line 1776
    .line 1777
    move-result v11

    .line 1778
    invoke-virtual {v8, v9, v10, v11, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 1779
    .line 1780
    .line 1781
    if-eqz v0, :cond_20

    .line 1782
    .line 1783
    iget-object v6, v0, La/xiv0;->a:La/uiv0;

    .line 1784
    .line 1785
    invoke-virtual {v6, v5}, La/uiv0;->u(I)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v5

    .line 1789
    if-ne v5, v7, :cond_20

    .line 1790
    .line 1791
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 1792
    .line 1793
    .line 1794
    move-result v5

    .line 1795
    if-eqz v5, :cond_20

    .line 1796
    .line 1797
    invoke-virtual {v1}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v1

    .line 1801
    if-eqz v1, :cond_20

    .line 1802
    .line 1803
    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 1804
    .line 1805
    .line 1806
    :cond_20
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v1

    .line 1810
    instance-of v2, v1, Landroid/view/View;

    .line 1811
    .line 1812
    if-eqz v2, :cond_21

    .line 1813
    .line 1814
    move-object v8, v1

    .line 1815
    check-cast v8, Landroid/view/View;

    .line 1816
    .line 1817
    goto :goto_1d

    .line 1818
    :cond_21
    move-object v8, v3

    .line 1819
    :goto_1d
    if-eqz v8, :cond_23

    .line 1820
    .line 1821
    if-eqz v0, :cond_22

    .line 1822
    .line 1823
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 1824
    .line 1825
    invoke-virtual {v0, v7}, La/uiv0;->i(I)La/pfx;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    if-eqz v0, :cond_22

    .line 1830
    .line 1831
    iget v9, v0, La/pfx;->b:I

    .line 1832
    .line 1833
    goto :goto_1e

    .line 1834
    :cond_22
    move v9, v4

    .line 1835
    :goto_1e
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 1836
    .line 1837
    .line 1838
    move-result v0

    .line 1839
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 1840
    .line 1841
    .line 1842
    move-result v1

    .line 1843
    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    .line 1844
    .line 1845
    .line 1846
    move-result v2

    .line 1847
    invoke-virtual {v8, v0, v9, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1848
    .line 1849
    .line 1850
    :cond_23
    return-void

    .line 1851
    :pswitch_f
    iget-object v1, v0, La/pb90;->d:Ljava/lang/Object;

    .line 1852
    .line 1853
    check-cast v1, Landroid/print/PrintDocumentAdapter$WriteResultCallback;

    .line 1854
    .line 1855
    iget-object v2, v0, La/pb90;->c:Ljava/lang/Object;

    .line 1856
    .line 1857
    check-cast v2, Landroid/os/CancellationSignal;

    .line 1858
    .line 1859
    iget-object v3, v0, La/pb90;->e:Ljava/lang/Object;

    .line 1860
    .line 1861
    check-cast v3, La/qb90;

    .line 1862
    .line 1863
    iget-object v3, v3, La/qb90;->d:La/nr00;

    .line 1864
    .line 1865
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 1866
    .line 1867
    iget-object v3, v3, La/nr00;->a:Ljava/lang/Object;

    .line 1868
    .line 1869
    check-cast v3, [B

    .line 1870
    .line 1871
    invoke-direct {v4, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1872
    .line 1873
    .line 1874
    :try_start_11
    new-instance v3, Ljava/io/FileOutputStream;

    .line 1875
    .line 1876
    iget-object v0, v0, La/pb90;->b:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    .line 1879
    .line 1880
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v0

    .line 1884
    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 1885
    .line 1886
    .line 1887
    :try_start_12
    invoke-virtual {v2}, Landroid/os/CancellationSignal;->isCanceled()Z

    .line 1888
    .line 1889
    .line 1890
    move-result v0

    .line 1891
    if-nez v0, :cond_24

    .line 1892
    .line 1893
    const/16 v0, 0x4000

    .line 1894
    .line 1895
    invoke-static {v4, v3, v0}, La/wha0;->J(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    .line 1896
    .line 1897
    .line 1898
    goto :goto_1f

    .line 1899
    :catchall_3
    move-exception v0

    .line 1900
    move-object v1, v0

    .line 1901
    goto :goto_22

    .line 1902
    :catch_9
    move-exception v0

    .line 1903
    goto :goto_20

    .line 1904
    :cond_24
    :goto_1f
    invoke-virtual {v2}, Landroid/os/CancellationSignal;->isCanceled()Z

    .line 1905
    .line 1906
    .line 1907
    move-result v0

    .line 1908
    if-eqz v0, :cond_25

    .line 1909
    .line 1910
    invoke-virtual {v1}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteCancelled()V

    .line 1911
    .line 1912
    .line 1913
    goto :goto_21

    .line 1914
    :cond_25
    sget-object v0, Landroid/print/PageRange;->ALL_PAGES:Landroid/print/PageRange;

    .line 1915
    .line 1916
    filled-new-array {v0}, [Landroid/print/PageRange;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v0

    .line 1920
    invoke-virtual {v1, v0}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFinished([Landroid/print/PageRange;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 1921
    .line 1922
    .line 1923
    goto :goto_21

    .line 1924
    :goto_20
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v2

    .line 1928
    invoke-virtual {v1, v2}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFailed(Ljava/lang/CharSequence;)V

    .line 1929
    .line 1930
    .line 1931
    const-class v1, La/pb90;

    .line 1932
    .line 1933
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v1

    .line 1937
    const-string v2, "Exception printing PDF"

    .line 1938
    .line 1939
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 1940
    .line 1941
    .line 1942
    :goto_21
    :try_start_14
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual {v4}, Ljava/io/ByteArrayInputStream;->close()V

    .line 1946
    .line 1947
    .line 1948
    return-void

    .line 1949
    :catchall_4
    move-exception v0

    .line 1950
    move-object v1, v0

    .line 1951
    goto :goto_23

    .line 1952
    :goto_22
    :try_start_15
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 1953
    :catchall_5
    move-exception v0

    .line 1954
    :try_start_16
    invoke-static {v3, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1955
    .line 1956
    .line 1957
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 1958
    :goto_23
    :try_start_17
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 1959
    :catchall_6
    move-exception v0

    .line 1960
    invoke-static {v4, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1961
    .line 1962
    .line 1963
    throw v0

    .line 1964
    nop

    .line 1965
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
