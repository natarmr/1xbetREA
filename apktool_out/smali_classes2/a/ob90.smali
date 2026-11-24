.class public final La/ob90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a4x0;Ljava/io/Serializable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 18
    iput-byte p6, p0, La/ob90;->a:B

    iput-object p2, p0, La/ob90;->b:Ljava/lang/Object;

    iput-object p3, p0, La/ob90;->c:Ljava/lang/Object;

    iput-object p4, p0, La/ob90;->d:Ljava/lang/Object;

    iput-object p5, p0, La/ob90;->e:Ljava/lang/Object;

    iput-object p1, p0, La/ob90;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/oyw0;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;La/mtw0;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ob90;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ob90;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/ob90;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/ob90;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/ob90;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, La/ob90;->f:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/qb90;Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
    .locals 0

    const/4 p6, 0x0

    iput-byte p6, p0, La/ob90;->a:B

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/ob90;->f:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, La/ob90;->b:Ljava/lang/Object;

    .line 22
    iput-object p3, p0, La/ob90;->c:Ljava/lang/Object;

    .line 23
    iput-object p4, p0, La/ob90;->d:Ljava/lang/Object;

    .line 24
    iput-object p5, p0, La/ob90;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-byte v0, p0, La/ob90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ob90;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/gpw0;

    .line 9
    .line 10
    iget-object v1, p0, La/ob90;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, La/ob90;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p0, La/ob90;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, La/a4x0;

    .line 21
    .line 22
    iget-object v4, v3, La/p4;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, La/kxw0;

    .line 25
    .line 26
    new-instance v5, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v6, v3, La/a4x0;->e:La/gtw0;

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    iget-object p0, v4, La/kxw0;->f:La/uuw0;

    .line 36
    .line 37
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/uuw0;->g:La/quw0;

    .line 41
    .line 42
    const-string v3, "Failed to get conditional properties; not connected to service"

    .line 43
    .line 44
    invoke-virtual {p0, v2, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iget-object p0, v4, La/kxw0;->i:La/x6x0;

    .line 48
    .line 49
    :goto_0
    invoke-static {p0}, La/kxw0;->e(La/p4;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, v5}, La/x6x0;->f2(La/gpw0;Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    :try_start_1
    iget-object p0, p0, La/ob90;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 59
    .line 60
    invoke-interface {v6, v2, v1, p0}, La/gtw0;->A(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, La/x6x0;->g2(Ljava/util/List;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v3}, La/a4x0;->y1()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_3

    .line 74
    :catch_0
    move-exception p0

    .line 75
    :try_start_2
    iget-object v3, v4, La/kxw0;->f:La/uuw0;

    .line 76
    .line 77
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, v3, La/uuw0;->g:La/quw0;

    .line 81
    .line 82
    const-string v6, "Failed to get conditional properties; remote exception"

    .line 83
    .line 84
    invoke-virtual {v3, v6, v2, v1, p0}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    :goto_1
    iget-object p0, v4, La/kxw0;->i:La/x6x0;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :goto_2
    return-void

    .line 91
    :goto_3
    iget-object v1, v4, La/kxw0;->i:La/x6x0;

    .line 92
    .line 93
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v0, v5}, La/x6x0;->f2(La/gpw0;Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :pswitch_0
    iget-object v0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 103
    .line 104
    monitor-enter v0

    .line 105
    const/4 v1, 0x0

    .line 106
    :try_start_3
    iget-object v2, p0, La/ob90;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, La/a4x0;

    .line 109
    .line 110
    iget-object v3, v2, La/a4x0;->e:La/gtw0;

    .line 111
    .line 112
    if-nez v3, :cond_1

    .line 113
    .line 114
    iget-object v2, v2, La/p4;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, La/kxw0;

    .line 117
    .line 118
    iget-object v2, v2, La/kxw0;->f:La/uuw0;

    .line 119
    .line 120
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 121
    .line 122
    .line 123
    iget-object v2, v2, La/uuw0;->g:La/quw0;

    .line 124
    .line 125
    const-string v3, "(legacy) Failed to get conditional properties; not connected to service"

    .line 126
    .line 127
    iget-object v4, p0, La/ob90;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/lang/String;

    .line 130
    .line 131
    iget-object v5, p0, La/ob90;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v2, v3, v1, v4, v5}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 141
    .line 142
    .line 143
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 144
    .line 145
    .line 146
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    goto :goto_8

    .line 148
    :catchall_1
    move-exception p0

    .line 149
    goto :goto_a

    .line 150
    :catchall_2
    move-exception v1

    .line 151
    goto :goto_9

    .line 152
    :catch_1
    move-exception v2

    .line 153
    goto :goto_6

    .line 154
    :cond_1
    :try_start_5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_2

    .line 159
    .line 160
    iget-object v4, p0, La/ob90;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzr;

    .line 163
    .line 164
    iget-object v5, p0, La/ob90;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Ljava/lang/String;

    .line 167
    .line 168
    iget-object v6, p0, La/ob90;->d:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {v3, v5, v6, v4}, La/gtw0;->A(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_2
    iget-object v4, p0, La/ob90;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v4, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v5, p0, La/ob90;->d:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Ljava/lang/String;

    .line 187
    .line 188
    invoke-interface {v3, v1, v4, v5}, La/gtw0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-virtual {v2}, La/a4x0;->y1()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 196
    .line 197
    .line 198
    :try_start_6
    iget-object p0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :goto_6
    :try_start_7
    iget-object v3, p0, La/ob90;->f:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v3, La/a4x0;

    .line 209
    .line 210
    iget-object v3, v3, La/p4;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, La/kxw0;

    .line 213
    .line 214
    iget-object v3, v3, La/kxw0;->f:La/uuw0;

    .line 215
    .line 216
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 217
    .line 218
    .line 219
    iget-object v3, v3, La/uuw0;->g:La/quw0;

    .line 220
    .line 221
    const-string v4, "(legacy) Failed to get conditional properties; remote exception"

    .line 222
    .line 223
    iget-object v5, p0, La/ob90;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v5, Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v3, v4, v1, v5, v2}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    iget-object v1, p0, La/ob90;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 233
    .line 234
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 237
    .line 238
    .line 239
    :try_start_8
    iget-object p0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :goto_7
    monitor-exit v0

    .line 245
    :goto_8
    return-void

    .line 246
    :goto_9
    iget-object p0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 249
    .line 250
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 251
    .line 252
    .line 253
    throw v1

    .line 254
    :goto_a
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 255
    throw p0

    .line 256
    :pswitch_1
    iget-object v0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, La/oyw0;

    .line 259
    .line 260
    iget-object v1, p0, La/ob90;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 263
    .line 264
    iget-object v2, p0, La/ob90;->d:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v2, Landroid/os/Bundle;

    .line 267
    .line 268
    iget-object v3, p0, La/ob90;->e:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v3, La/mtw0;

    .line 271
    .line 272
    iget-object p0, p0, La/ob90;->f:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p0, Ljava/lang/String;

    .line 275
    .line 276
    iget-object v0, v0, La/oyw0;->a:La/m6x0;

    .line 277
    .line 278
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2, v1}, La/m6x0;->d0(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    :try_start_9
    invoke-interface {v3, v1}, La/mtw0;->n(Ljava/util/List;)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2

    .line 286
    .line 287
    .line 288
    goto :goto_b

    .line 289
    :catch_2
    move-exception v1

    .line 290
    invoke-virtual {v0}, La/m6x0;->r()La/uuw0;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 295
    .line 296
    const-string v2, "Failed to return trigger URIs for app"

    .line 297
    .line 298
    invoke-virtual {v0, p0, v1, v2}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :goto_b
    return-void

    .line 302
    :pswitch_2
    iget-object v0, p0, La/ob90;->e:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;

    .line 305
    .line 306
    iget-object v1, p0, La/ob90;->d:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, Landroid/os/CancellationSignal;

    .line 309
    .line 310
    invoke-virtual {v1}, Landroid/os/CancellationSignal;->isCanceled()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_3

    .line 315
    .line 316
    invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutCancelled()V

    .line 317
    .line 318
    .line 319
    goto :goto_c

    .line 320
    :cond_3
    new-instance v1, Landroid/print/PrintDocumentInfo$Builder;

    .line 321
    .line 322
    iget-object v2, p0, La/ob90;->f:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v2, La/qb90;

    .line 325
    .line 326
    iget-object v2, v2, La/qb90;->c:Ljava/lang/String;

    .line 327
    .line 328
    invoke-direct {v1, v2}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const/4 v2, 0x0

    .line 332
    invoke-virtual {v1, v2}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    const/4 v3, -0x1

    .line 337
    invoke-virtual {v2, v3}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v2}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v2, p0, La/ob90;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v2, Landroid/print/PrintAttributes;

    .line 351
    .line 352
    iget-object p0, p0, La/ob90;->b:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, Landroid/print/PrintAttributes;

    .line 355
    .line 356
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    xor-int/lit8 p0, p0, 0x1

    .line 361
    .line 362
    invoke-virtual {v0, v1, p0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V

    .line 363
    .line 364
    .line 365
    :goto_c
    return-void

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
