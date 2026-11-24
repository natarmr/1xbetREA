.class public final La/ytq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:J


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/cpv0;

.field public final c:La/o470;

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, La/wv00;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/ytq;->e:Ljava/lang/String;

    .line 8
    .line 9
    const-wide v0, 0x496cebb800L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sput-wide v0, La/ytq;->f:J

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/cpv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/ytq;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, La/ytq;->b:La/cpv0;

    .line 11
    .line 12
    iget-object p1, p2, La/cpv0;->g:La/o470;

    .line 13
    .line 14
    iput-object p1, p0, La/ytq;->c:La/o470;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, La/ytq;->d:I

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, La/ytq;->f:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "last_force_stop_ms"

    .line 4
    .line 5
    iget-object v2, v0, La/ytq;->c:La/o470;

    .line 6
    .line 7
    iget-object v3, v0, La/ytq;->b:La/cpv0;

    .line 8
    .line 9
    iget-object v4, v3, La/cpv0;->b:La/wsd;

    .line 10
    .line 11
    iget-object v5, v3, La/cpv0;->g:La/o470;

    .line 12
    .line 13
    iget-object v6, v3, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 14
    .line 15
    sget-object v7, La/x9o0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, v0, La/ytq;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, La/fby;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-static {v0, v7}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()La/s9o0;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    iget-object v9, v9, La/s9o0;->a:La/aeg0;

    .line 32
    .line 33
    new-instance v10, La/rgn0;

    .line 34
    .line 35
    const/16 v11, 0x15

    .line 36
    .line 37
    invoke-direct {v10, v11}, La/rgn0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    const/4 v12, 0x1

    .line 41
    const/4 v13, 0x0

    .line 42
    invoke-static {v9, v12, v13, v10}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v10, v13

    .line 56
    :goto_0
    new-instance v14, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v14, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 59
    .line 60
    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-eqz v10, :cond_2

    .line 78
    .line 79
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    check-cast v10, Landroid/app/job/JobInfo;

    .line 84
    .line 85
    invoke-static {v10}, La/x9o0;->f(Landroid/app/job/JobInfo;)La/xov0;

    .line 86
    .line 87
    .line 88
    move-result-object v15

    .line 89
    if-eqz v15, :cond_1

    .line 90
    .line 91
    iget-object v10, v15, La/xov0;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v14, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v10}, Landroid/app/job/JobInfo;->getId()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    invoke-static {v7, v10}, La/x9o0;->a(Landroid/app/job/JobScheduler;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v14, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_3

    .line 126
    .line 127
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sget-object v8, La/x9o0;->e:Ljava/lang/String;

    .line 132
    .line 133
    const-string v10, "Reconciling jobs"

    .line 134
    .line 135
    invoke-virtual {v7, v8, v10}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    move v7, v12

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move v7, v13

    .line 141
    :goto_2
    const-wide/16 v14, -0x1

    .line 142
    .line 143
    if-eqz v7, :cond_6

    .line 144
    .line 145
    invoke-virtual {v6}, La/aeg0;->b()V

    .line 146
    .line 147
    .line 148
    :try_start_0
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_5

    .line 161
    .line 162
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    check-cast v10, Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v8, v14, v15, v10}, La/upv0;->g(JLjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    goto :goto_4

    .line 174
    :cond_5
    invoke-virtual {v6}, La/aeg0;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, La/aeg0;->m()V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :goto_4
    invoke-virtual {v6}, La/aeg0;->m()V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_6
    :goto_5
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->x()La/ipv0;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v6}, La/aeg0;->b()V

    .line 194
    .line 195
    .line 196
    :try_start_1
    iget-object v10, v8, La/upv0;->a:La/aeg0;

    .line 197
    .line 198
    new-instance v11, La/ejv0;

    .line 199
    .line 200
    const/16 v14, 0xe

    .line 201
    .line 202
    invoke-direct {v11, v14}, La/ejv0;-><init>(B)V

    .line 203
    .line 204
    .line 205
    invoke-static {v10, v12, v13, v11}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    check-cast v10, Ljava/util/List;

    .line 210
    .line 211
    if-eqz v10, :cond_7

    .line 212
    .line 213
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-nez v11, :cond_7

    .line 218
    .line 219
    move v11, v12

    .line 220
    goto :goto_6

    .line 221
    :catchall_1
    move-exception v0

    .line 222
    goto/16 :goto_f

    .line 223
    .line 224
    :cond_7
    move v11, v13

    .line 225
    :goto_6
    if-eqz v11, :cond_8

    .line 226
    .line 227
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    if-eqz v14, :cond_8

    .line 236
    .line 237
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    check-cast v14, La/ppv0;

    .line 242
    .line 243
    sget-object v15, La/zov0;->a:La/zov0;

    .line 244
    .line 245
    iget-object v14, v14, La/ppv0;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v8, v15, v14}, La/upv0;->j(La/zov0;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const/16 v15, -0x200

    .line 251
    .line 252
    invoke-virtual {v8, v15, v14}, La/upv0;->k(ILjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-wide/16 v12, -0x1

    .line 256
    .line 257
    invoke-virtual {v8, v12, v13, v14}, La/upv0;->g(JLjava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const/4 v12, 0x1

    .line 261
    const/4 v13, 0x0

    .line 262
    goto :goto_7

    .line 263
    :cond_8
    iget-object v8, v9, La/ipv0;->a:La/aeg0;

    .line 264
    .line 265
    new-instance v9, La/ejv0;

    .line 266
    .line 267
    const/4 v10, 0x6

    .line 268
    invoke-direct {v9, v10}, La/ejv0;-><init>(B)V

    .line 269
    .line 270
    .line 271
    const/4 v10, 0x0

    .line 272
    const/4 v15, 0x1

    .line 273
    invoke-static {v8, v10, v15, v9}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6}, La/aeg0;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6}, La/aeg0;->m()V

    .line 280
    .line 281
    .line 282
    if-nez v11, :cond_a

    .line 283
    .line 284
    if-eqz v7, :cond_9

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_9
    const/4 v7, 0x0

    .line 288
    goto :goto_9

    .line 289
    :cond_a
    :goto_8
    const/4 v7, 0x1

    .line 290
    :goto_9
    iget-object v8, v5, La/o470;->a:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v8, Landroidx/work/impl/WorkDatabase;

    .line 293
    .line 294
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    const-string v9, "reschedule_needed"

    .line 299
    .line 300
    invoke-virtual {v8, v9}, La/vsb0;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    const-wide/16 v10, 0x0

    .line 305
    .line 306
    sget-object v12, La/ytq;->e:Ljava/lang/String;

    .line 307
    .line 308
    if-eqz v8, :cond_b

    .line 309
    .line 310
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 311
    .line 312
    .line 313
    move-result-wide v13

    .line 314
    const-wide/16 v16, 0x1

    .line 315
    .line 316
    cmp-long v8, v13, v16

    .line 317
    .line 318
    if-nez v8, :cond_b

    .line 319
    .line 320
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    const-string v1, "Rescheduling Workers."

    .line 325
    .line 326
    invoke-virtual {v0, v12, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3}, La/cpv0;->g()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    new-instance v0, La/usb0;

    .line 336
    .line 337
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-direct {v0, v9, v1}, La/usb0;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 342
    .line 343
    .line 344
    iget-object v1, v5, La/o470;->a:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 347
    .line 348
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iget-object v2, v1, La/vsb0;->a:La/aeg0;

    .line 353
    .line 354
    new-instance v3, La/zga0;

    .line 355
    .line 356
    const/16 v4, 0x15

    .line 357
    .line 358
    invoke-direct {v3, v1, v0, v4}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 359
    .line 360
    .line 361
    const/4 v10, 0x0

    .line 362
    const/4 v15, 0x1

    .line 363
    invoke-static {v2, v10, v15, v3}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :cond_b
    :try_start_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 368
    .line 369
    const/16 v8, 0x1f

    .line 370
    .line 371
    if-lt v5, v8, :cond_c

    .line 372
    .line 373
    const/high16 v8, 0x22000000

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_c
    const/high16 v8, 0x20000000

    .line 377
    .line 378
    :goto_a
    new-instance v9, Landroid/content/Intent;

    .line 379
    .line 380
    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 381
    .line 382
    .line 383
    new-instance v13, Landroid/content/ComponentName;

    .line 384
    .line 385
    const-class v14, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 386
    .line 387
    invoke-direct {v13, v0, v14}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    const-string v13, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 394
    .line 395
    invoke-virtual {v9, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 396
    .line 397
    .line 398
    const/4 v13, -0x1

    .line 399
    invoke-static {v0, v13, v9, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    const/16 v9, 0x1e

    .line 404
    .line 405
    if-lt v5, v9, :cond_10

    .line 406
    .line 407
    if-eqz v8, :cond_d

    .line 408
    .line 409
    invoke-virtual {v8}, Landroid/app/PendingIntent;->cancel()V

    .line 410
    .line 411
    .line 412
    goto :goto_b

    .line 413
    :catch_0
    move-exception v0

    .line 414
    goto :goto_d

    .line 415
    :catch_1
    move-exception v0

    .line 416
    goto :goto_d

    .line 417
    :cond_d
    :goto_b
    const-string v5, "activity"

    .line 418
    .line 419
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Landroid/app/ActivityManager;

    .line 424
    .line 425
    invoke-static {v0}, La/a7;->n(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_11

    .line 430
    .line 431
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-nez v5, :cond_11

    .line 436
    .line 437
    iget-object v5, v2, La/o470;->a:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v5, Landroidx/work/impl/WorkDatabase;

    .line 440
    .line 441
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-virtual {v5, v1}, La/vsb0;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    if-eqz v5, :cond_e

    .line 450
    .line 451
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 452
    .line 453
    .line 454
    move-result-wide v10

    .line 455
    :cond_e
    const/4 v5, 0x0

    .line 456
    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    if-ge v5, v8, :cond_11

    .line 461
    .line 462
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    invoke-static {v8}, La/a7;->e(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-static {v8}, La/a7;->b(Landroid/app/ApplicationExitInfo;)I

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    const/16 v13, 0xa

    .line 475
    .line 476
    if-ne v9, v13, :cond_f

    .line 477
    .line 478
    invoke-static {v8}, La/a7;->d(Landroid/app/ApplicationExitInfo;)J

    .line 479
    .line 480
    .line 481
    move-result-wide v8

    .line 482
    cmp-long v8, v8, v10

    .line 483
    .line 484
    if-ltz v8, :cond_f

    .line 485
    .line 486
    goto :goto_e

    .line 487
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_10
    if-nez v8, :cond_11

    .line 491
    .line 492
    invoke-static {v0}, La/ytq;->c(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 493
    .line 494
    .line 495
    goto :goto_e

    .line 496
    :cond_11
    if-eqz v7, :cond_12

    .line 497
    .line 498
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    const-string v1, "Found unfinished work, scheduling it."

    .line 503
    .line 504
    invoke-virtual {v0, v12, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    iget-object v0, v3, La/cpv0;->e:Ljava/util/List;

    .line 508
    .line 509
    invoke-static {v4, v6, v0}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 510
    .line 511
    .line 512
    :cond_12
    return-void

    .line 513
    :goto_d
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    const-string v6, "Ignoring exception"

    .line 518
    .line 519
    invoke-virtual {v5, v0, v12, v6}, La/wv00;->i(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :goto_e
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    const-string v5, "Application was force-stopped, rescheduling."

    .line 527
    .line 528
    invoke-virtual {v0, v12, v5}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, La/cpv0;->g()V

    .line 532
    .line 533
    .line 534
    iget-object v0, v4, La/wsd;->d:La/s2m0;

    .line 535
    .line 536
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 537
    .line 538
    .line 539
    move-result-wide v3

    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    new-instance v0, La/usb0;

    .line 544
    .line 545
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    invoke-direct {v0, v1, v3}, La/usb0;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 550
    .line 551
    .line 552
    iget-object v1, v2, La/o470;->a:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 555
    .line 556
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    iget-object v2, v1, La/vsb0;->a:La/aeg0;

    .line 561
    .line 562
    new-instance v3, La/zga0;

    .line 563
    .line 564
    const/16 v4, 0x15

    .line 565
    .line 566
    invoke-direct {v3, v1, v0, v4}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 567
    .line 568
    .line 569
    const/4 v10, 0x0

    .line 570
    const/4 v15, 0x1

    .line 571
    invoke-static {v2, v10, v15, v3}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :goto_f
    invoke-virtual {v6}, La/aeg0;->m()V

    .line 576
    .line 577
    .line 578
    throw v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-object v0, p0, La/ytq;->b:La/cpv0;

    .line 2
    .line 3
    iget-object v0, v0, La/cpv0;->b:La/wsd;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, La/ytq;->e:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "The default process name was not specified."

    .line 22
    .line 23
    invoke-virtual {p0, v2, v0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    iget-object p0, p0, La/ytq;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {p0, v0}, La/zyb0;->a(Landroid/content/Context;La/wsd;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Is default app process = "

    .line 41
    .line 42
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v2, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return p0
.end method

.method public final run()V
    .locals 12

    .line 1
    iget-object v0, p0, La/ytq;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, La/ytq;->b:La/cpv0;

    .line 4
    .line 5
    iget-object v2, v1, La/cpv0;->b:La/wsd;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, La/ytq;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, La/cpv0;->f()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    invoke-static {v0}, La/tnq0;->n(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    sget-object v4, La/ytq;->e:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    :catch_0
    :goto_0
    :try_start_2
    invoke-static {v0}, La/iom0;->p(Landroid/content/Context;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    .line 28
    :try_start_3
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v5, "Performing cleanup operations."

    .line 33
    .line 34
    invoke-virtual {v3, v4, v5}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    .line 36
    .line 37
    :try_start_4
    invoke-virtual {p0}, La/ytq;->a()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, La/cpv0;->f()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :catch_1
    move-exception v3

    .line 48
    :try_start_5
    iget v5, p0, La/ytq;->d:I

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    iput v5, p0, La/ytq;->d:I

    .line 53
    .line 54
    iget v5, p0, La/ytq;->d:I

    .line 55
    .line 56
    const/4 v6, 0x3

    .line 57
    if-lt v5, v6, :cond_3

    .line 58
    .line 59
    instance-of p0, v3, Landroid/database/sqlite/SQLiteAccessPermException;

    .line 60
    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    instance-of p0, v3, Landroid/database/sqlite/SQLiteCantOpenDatabaseException;

    .line 64
    .line 65
    if-nez p0, :cond_2

    .line 66
    .line 67
    instance-of p0, v3, Landroid/database/sqlite/SQLiteConstraintException;

    .line 68
    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    instance-of p0, v3, Landroid/database/sqlite/SQLiteDatabaseCorruptException;

    .line 72
    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    instance-of p0, v3, Landroid/database/sqlite/SQLiteDatabaseLockedException;

    .line 76
    .line 77
    if-nez p0, :cond_2

    .line 78
    .line 79
    instance-of p0, v3, Landroid/database/sqlite/SQLiteDiskIOException;

    .line 80
    .line 81
    if-nez p0, :cond_2

    .line 82
    .line 83
    instance-of p0, v3, Landroid/database/sqlite/SQLiteFullException;

    .line 84
    .line 85
    if-nez p0, :cond_2

    .line 86
    .line 87
    instance-of p0, v3, Landroid/database/sqlite/SQLiteTableLockedException;

    .line 88
    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    throw v3

    .line 93
    :cond_2
    :goto_1
    const-string p0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 94
    .line 95
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, v4, p0, v3}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    invoke-direct {v0, p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_3
    iget v5, p0, La/ytq;->d:I

    .line 112
    .line 113
    int-to-long v5, v5

    .line 114
    const-wide/16 v7, 0x12c

    .line 115
    .line 116
    mul-long/2addr v5, v7

    .line 117
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    new-instance v10, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v11, "Retrying after "

    .line 127
    .line 128
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v9, v4, v5, v3}, La/wv00;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    iget v3, p0, La/ytq;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 142
    .line 143
    int-to-long v5, v3

    .line 144
    mul-long/2addr v5, v7

    .line 145
    :try_start_6
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :catch_2
    move-exception p0

    .line 150
    :try_start_7
    const-string v0, "Unexpected SQLite exception during migrations"

    .line 151
    .line 152
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3, v4, v0}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {v3, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    throw v3

    .line 168
    :cond_4
    const-string p0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 169
    .line 170
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0, v4, p0}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 186
    :goto_2
    invoke-virtual {v1}, La/cpv0;->f()V

    .line 187
    .line 188
    .line 189
    throw p0
.end method
