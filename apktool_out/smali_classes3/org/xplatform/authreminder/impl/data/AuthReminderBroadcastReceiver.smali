.class public final Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public a:La/nw20;

.field public b:La/nhf0;

.field public c:La/h760;

.field public d:La/ctf0;

.field public e:La/qu;

.field public f:La/s64;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v2, v0, Landroid/app/Application;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/app/Application;

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v4

    .line 23
    :goto_0
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_1
    const-string v0, "TYPE_NOTIFY_VALUE_KEY"

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    move-object/from16 v5, p2

    .line 31
    .line 32
    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v3, La/fzs0;->c:La/c0o;

    .line 37
    .line 38
    invoke-static {v3, v3}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :cond_2
    invoke-virtual {v3}, La/y2;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3}, La/y2;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    move-object v6, v5

    .line 53
    check-cast v6, La/fzs0;

    .line 54
    .line 55
    invoke-virtual {v6}, La/fzs0;->b()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-ne v6, v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object v5, v4

    .line 63
    :goto_1
    move-object v3, v5

    .line 64
    check-cast v3, La/fzs0;

    .line 65
    .line 66
    if-nez v3, :cond_4

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_4
    instance-of v0, v2, La/af3;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    move-object v0, v2

    .line 75
    check-cast v0, La/af3;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    move-object v0, v4

    .line 79
    :goto_2
    const-class v5, La/nn4;

    .line 80
    .line 81
    if-eqz v0, :cond_11

    .line 82
    .line 83
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/o5d0;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/ze3;

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    move-object v0, v4

    .line 103
    :goto_3
    instance-of v6, v0, La/nn4;

    .line 104
    .line 105
    if-nez v6, :cond_7

    .line 106
    .line 107
    move-object v0, v4

    .line 108
    :cond_7
    check-cast v0, La/nn4;

    .line 109
    .line 110
    if-eqz v0, :cond_11

    .line 111
    .line 112
    iget-object v5, v0, La/nn4;->a:La/hn4;

    .line 113
    .line 114
    iget-object v6, v0, La/nn4;->b:La/h760;

    .line 115
    .line 116
    iget-object v7, v0, La/nn4;->c:La/ctf0;

    .line 117
    .line 118
    iget-object v8, v0, La/nn4;->d:La/s64;

    .line 119
    .line 120
    iget-object v0, v0, La/nn4;->e:La/qu;

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-interface {v5}, La/hn4;->g()La/nw20;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    iput-object v9, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->a:La/nw20;

    .line 136
    .line 137
    invoke-interface {v5}, La/hn4;->b()La/nhf0;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    iput-object v5, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->b:La/nhf0;

    .line 142
    .line 143
    iput-object v6, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->c:La/h760;

    .line 144
    .line 145
    iput-object v7, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->d:La/ctf0;

    .line 146
    .line 147
    iput-object v0, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->e:La/qu;

    .line 148
    .line 149
    iput-object v8, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->f:La/s64;

    .line 150
    .line 151
    iget-object v0, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->a:La/nw20;

    .line 152
    .line 153
    if-eqz v0, :cond_10

    .line 154
    .line 155
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const/16 v6, 0xb

    .line 160
    .line 161
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->get(I)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    sget-object v6, La/on4;->e:Lkotlin/ranges/IntRange;

    .line 166
    .line 167
    iget v7, v6, Lkotlin/ranges/a;->a:I

    .line 168
    .line 169
    iget v6, v6, Lkotlin/ranges/a;->b:I

    .line 170
    .line 171
    sget-object v8, La/lsj0;->a:La/lsj0;

    .line 172
    .line 173
    sget-object v9, La/jsj0;->a:La/jsj0;

    .line 174
    .line 175
    sget-object v10, La/ksj0;->a:La/ksj0;

    .line 176
    .line 177
    if-gt v5, v6, :cond_8

    .line 178
    .line 179
    if-gt v7, v5, :cond_8

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    sget-object v6, La/on4;->d:Lkotlin/ranges/IntRange;

    .line 183
    .line 184
    iget v7, v6, Lkotlin/ranges/a;->a:I

    .line 185
    .line 186
    iget v6, v6, Lkotlin/ranges/a;->b:I

    .line 187
    .line 188
    if-gt v5, v6, :cond_a

    .line 189
    .line 190
    if-gt v7, v5, :cond_a

    .line 191
    .line 192
    :goto_4
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, v0

    .line 195
    check-cast v5, La/c5c;

    .line 196
    .line 197
    iget-object v13, v5, La/c5c;->a:La/on4;

    .line 198
    .line 199
    iget-object v6, v5, La/c5c;->b:La/rrc;

    .line 200
    .line 201
    iget-object v0, v6, La/rrc;->b:Ljava/lang/Object;

    .line 202
    .line 203
    move-object v7, v0

    .line 204
    check-cast v7, La/tgk;

    .line 205
    .line 206
    new-instance v11, La/b0c0;

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v18, 0x19

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    const-class v14, La/on4;

    .line 214
    .line 215
    const-string v15, "canScheduleExactAlarms"

    .line 216
    .line 217
    const-string v16, "canScheduleExactAlarms()Z"

    .line 218
    .line 219
    invoke-direct/range {v11 .. v18}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 220
    .line 221
    .line 222
    :try_start_0
    invoke-virtual {v11}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    invoke-virtual {v13, v3}, La/on4;->e(La/fzs0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 240
    .line 241
    .line 242
    :cond_9
    iget-object v0, v5, La/c5c;->c:La/ik4;

    .line 243
    .line 244
    invoke-virtual {v6}, La/rrc;->H()I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-virtual {v0, v5, v6}, La/ik4;->a(ILjava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :goto_5
    move-object v0, v10

    .line 267
    goto :goto_6

    .line 268
    :cond_a
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, La/gqt;

    .line 271
    .line 272
    invoke-virtual {v0}, La/gqt;->a()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_b

    .line 277
    .line 278
    move-object v0, v9

    .line 279
    goto :goto_6

    .line 280
    :cond_b
    move-object v0, v8

    .line 281
    :goto_6
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-nez v5, :cond_f

    .line 286
    .line 287
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_c

    .line 292
    .line 293
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sget-object v5, La/tvk;->a:La/rwj;

    .line 298
    .line 299
    invoke-static {v5}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    sget-object v7, La/gn4;->a:La/gn4;

    .line 304
    .line 305
    new-instance v8, La/en4;

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    invoke-direct {v8, v0, v5}, La/en4;-><init>(Landroid/content/BroadcastReceiver$PendingResult;B)V

    .line 309
    .line 310
    .line 311
    new-instance v0, La/ac4;

    .line 312
    .line 313
    const/16 v5, 0xc

    .line 314
    .line 315
    invoke-direct/range {v0 .. v5}, La/ac4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 316
    .line 317
    .line 318
    const/16 v11, 0xc

    .line 319
    .line 320
    const/4 v9, 0x0

    .line 321
    move-object v10, v0

    .line 322
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_c
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_e

    .line 331
    .line 332
    iget-object v0, v1, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;->b:La/nhf0;

    .line 333
    .line 334
    if-eqz v0, :cond_d

    .line 335
    .line 336
    invoke-virtual {v0, v3}, La/nhf0;->x(La/fzs0;)V

    .line 337
    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_d
    const-string v0, "completeAuthReminderNotificationScenario"

    .line 341
    .line 342
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v4

    .line 346
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 347
    .line 348
    .line 349
    :cond_f
    :goto_7
    return-void

    .line 350
    :cond_10
    const-string v0, "showAuthReminderNotificationScenario"

    .line 351
    .line 352
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v4

    .line 356
    :cond_11
    const-string v0, "Cannot create dependency "

    .line 357
    .line 358
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    return-void
.end method
