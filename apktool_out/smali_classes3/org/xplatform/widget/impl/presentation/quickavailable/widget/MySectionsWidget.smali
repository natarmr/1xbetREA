.class public final Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# instance fields
.field public final a:La/sje;

.field public b:Z

.field public c:La/ih5;

.field public d:La/pru;

.field public e:La/au0;

.field public f:La/yfu;

.field public g:La/ctf0;

.field public h:La/bby;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/tvk;->a:La/rwj;

    .line 5
    .line 6
    sget-object v0, La/dvj;->c:La/dvj;

    .line 7
    .line 8
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->a:La/sje;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application;)V
    .locals 3

    .line 1
    const-string v0, "Cannot create dependency "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    instance-of v1, p1, La/af3;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast p1, La/af3;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_3

    .line 20
    :cond_1
    move-object p1, v2

    .line 21
    :goto_0
    if-eqz p1, :cond_4

    .line 22
    .line 23
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-class v1, La/jld0;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/o5d0;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object p1, v2

    .line 45
    :goto_1
    instance-of v1, p1, La/jld0;

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move-object v2, p1

    .line 51
    :goto_2
    check-cast v2, La/jld0;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v2}, La/jld0;->a()La/g45;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, p0}, La/g45;->R(Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :cond_4
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-class v1, La/jld0;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    :goto_3
    monitor-exit p0

    .line 92
    throw p1
.end method

.method public final onDeleted(Landroid/content/Context;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onDeleted(Landroid/content/Context;[I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->a:La/sje;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p0, p1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Landroid/app/Application;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/app/Application;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, v0}, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->a(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object v0, v2

    .line 32
    :goto_1
    if-eqz v0, :cond_16

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const v3, -0x4ef1d852

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    const/4 v5, 0x1

    .line 43
    if-eq v1, v3, :cond_9

    .line 44
    .line 45
    const v3, -0x122164c

    .line 46
    .line 47
    .line 48
    if-eq v1, v3, :cond_6

    .line 49
    .line 50
    const v3, 0x7707dfbe

    .line 51
    .line 52
    .line 53
    if-eq v1, v3, :cond_3

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_3
    const-string v1, "widget_settings"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_4
    invoke-static {p1}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    const-string v1, "REQUEST_WIDGET_SETTINGS"

    .line 74
    .line 75
    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :cond_5
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_6
    const-string v1, "android.intent.action.LOCALE_CHANGED"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_7

    .line 91
    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_7
    iget-object v0, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->h:La/bby;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-ne v0, v5, :cond_8

    .line 103
    .line 104
    iget-object v0, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->h:La/bby;

    .line 105
    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 109
    .line 110
    .line 111
    :cond_8
    sget-object v6, La/s850;->a:La/s850;

    .line 112
    .line 113
    new-instance v9, La/vc3;

    .line 114
    .line 115
    invoke-direct {v9, p1, v2, v4}, La/vc3;-><init>(Landroid/content/Context;La/yje;B)V

    .line 116
    .line 117
    .line 118
    const/16 v10, 0xe

    .line 119
    .line 120
    iget-object v5, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->a:La/sje;

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->h:La/bby;

    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_9
    const-string v1, "section_click"

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_a

    .line 139
    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :cond_a
    const-string v0, "key_saved_bundle"

    .line 143
    .line 144
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_16

    .line 149
    .line 150
    const-string v1, "key_select_section"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    sget-object v1, La/nev0;->b:La/kys0;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, La/kys0;->c(I)La/nev0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-nez v0, :cond_b

    .line 166
    .line 167
    const/4 v1, -0x1

    .line 168
    goto :goto_2

    .line 169
    :cond_b
    sget-object v1, La/r850;->a:[I

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    aget v1, v1, v3

    .line 176
    .line 177
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 178
    .line 179
    .line 180
    :pswitch_0
    invoke-static {}, La/t9f;->b()V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_1
    sget-object v1, La/k9h0;->Y:La/k9h0;

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :pswitch_2
    sget-object v1, La/k9h0;->p1:La/k9h0;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :pswitch_3
    sget-object v1, La/k9h0;->n1:La/k9h0;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :pswitch_4
    sget-object v1, La/k9h0;->m1:La/k9h0;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :pswitch_5
    sget-object v1, La/k9h0;->o1:La/k9h0;

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_6
    sget-object v1, La/k9h0;->q:La/k9h0;

    .line 200
    .line 201
    :goto_3
    iget-object v3, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->e:La/au0;

    .line 202
    .line 203
    if-eqz v3, :cond_15

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    const-string v7, "XGAMES"

    .line 210
    .line 211
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    const-string v7, "games"

    .line 216
    .line 217
    if-eqz v6, :cond_c

    .line 218
    .line 219
    move-object v6, v7

    .line 220
    goto :goto_4

    .line 221
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 226
    .line 227
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    :goto_4
    iget-object v3, v3, La/au0;->a:La/s1p;

    .line 235
    .line 236
    const-wide/16 v8, 0xbca

    .line 237
    .line 238
    invoke-static {v6, v3, v8, v9}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 239
    .line 240
    .line 241
    iget-object v3, p0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->c:La/ih5;

    .line 242
    .line 243
    if-eqz v3, :cond_14

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_12

    .line 250
    .line 251
    if-eq v0, v5, :cond_11

    .line 252
    .line 253
    if-eq v0, v4, :cond_10

    .line 254
    .line 255
    const/4 v4, 0x3

    .line 256
    if-eq v0, v4, :cond_f

    .line 257
    .line 258
    const/4 v4, 0x4

    .line 259
    if-eq v0, v4, :cond_e

    .line 260
    .line 261
    const/4 v4, 0x5

    .line 262
    if-ne v0, v4, :cond_d

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_e
    const-string v7, "aggregator"

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_f
    const-string v7, "search"

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_10
    const-string v7, "cyber"

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_11
    const-string v7, "results"

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_12
    const-string v7, "live"

    .line 282
    .line 283
    :goto_5
    iget-object v0, v3, La/ih5;->a:La/kt2;

    .line 284
    .line 285
    new-instance v3, Lkotlin/Pair;

    .line 286
    .line 287
    const-string v4, "point"

    .line 288
    .line 289
    invoke-direct {v3, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    const-string v4, "widget_fastaccess_open"

    .line 297
    .line 298
    invoke-interface {v0, v4, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 299
    .line 300
    .line 301
    invoke-static {p1}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-eqz v0, :cond_13

    .line 306
    .line 307
    const-string v3, "REQUEST_SECTION_FROM_WIDGET"

    .line 308
    .line 309
    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-eqz v0, :cond_13

    .line 314
    .line 315
    const-string v2, "OPEN_SCREEN"

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :cond_13
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 326
    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_14
    const-string p0, "widgetQuickAvailableAnalytics"

    .line 330
    .line 331
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v2

    .line 335
    :cond_15
    const-string p0, "widgetFatmanLogger"

    .line 336
    .line 337
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v2

    .line 341
    :goto_6
    :pswitch_7
    return-void

    .line 342
    :cond_16
    :goto_7
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, Landroid/app/Application;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    check-cast v2, Landroid/app/Application;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-nez v2, :cond_1

    .line 27
    .line 28
    goto/16 :goto_d

    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0, v2}, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->a(Landroid/app/Application;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, La/rdj;->a:La/rdj;

    .line 34
    .line 35
    iget-object v2, v0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->g:La/ctf0;

    .line 36
    .line 37
    const-string v3, "resourceManager"

    .line 38
    .line 39
    if-eqz v2, :cond_12

    .line 40
    .line 41
    invoke-virtual {v2}, La/ctf0;->h()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v2}, La/rdj;->l(Z)V

    .line 46
    .line 47
    .line 48
    array-length v2, v1

    .line 49
    const/4 v6, 0x0

    .line 50
    :goto_1
    if-ge v6, v2, :cond_11

    .line 51
    .line 52
    aget v7, v1, v6

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    iget-object v9, v0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->f:La/yfu;

    .line 59
    .line 60
    if-eqz v9, :cond_10

    .line 61
    .line 62
    iget-object v10, v0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->d:La/pru;

    .line 63
    .line 64
    const-string v11, "getRemoteConfigUseCase"

    .line 65
    .line 66
    if-eqz v10, :cond_f

    .line 67
    .line 68
    invoke-virtual {v10}, La/pru;->a()La/sff0;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    invoke-virtual {v9, v10}, La/yfu;->i(La/sff0;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    new-instance v10, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v12, 0xa

    .line 79
    .line 80
    invoke-static {v9, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_4

    .line 96
    .line 97
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    check-cast v12, La/nev0;

    .line 102
    .line 103
    iget-object v13, v0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->d:La/pru;

    .line 104
    .line 105
    if-eqz v13, :cond_3

    .line 106
    .line 107
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    iget-object v13, v13, La/sff0;->d:La/q1w0;

    .line 112
    .line 113
    iget-object v13, v13, La/q1w0;->a:La/dyv0;

    .line 114
    .line 115
    iget-object v13, v13, La/dyv0;->b:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v14, v0, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;->g:La/ctf0;

    .line 118
    .line 119
    if-eqz v14, :cond_2

    .line 120
    .line 121
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v15, La/kev0;

    .line 125
    .line 126
    sget-object v16, La/nev0;->b:La/kys0;

    .line 127
    .line 128
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const/16 p2, 0x0

    .line 132
    .line 133
    iget-byte v4, v12, La/nev0;->a:B

    .line 134
    .line 135
    invoke-static {v12, v14, v13}, La/hxm0;->t(La/nev0;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-static {v12}, La/hxm0;->s(La/nev0;)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    invoke-direct {v15, v4, v12, v13}, La/kev0;-><init>(IILjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    const/16 p2, 0x0

    .line 151
    .line 152
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p2

    .line 156
    :cond_3
    const/16 p2, 0x0

    .line 157
    .line 158
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p2

    .line 162
    :cond_4
    const/16 p2, 0x0

    .line 163
    .line 164
    invoke-static {v8}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    new-instance v9, Landroid/widget/RemoteViews;

    .line 169
    .line 170
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    const v12, 0x7f0d003e

    .line 175
    .line 176
    .line 177
    invoke-direct {v9, v11, v12}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    const v11, 0x7f1317f4

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const v11, 0x7f0a0f54

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9, v11, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    const v4, 0x7f0a0ed5

    .line 194
    .line 195
    .line 196
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    const v11, 0x7f0a0ed8

    .line 201
    .line 202
    .line 203
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    const/4 v15, 0x3

    .line 212
    if-ne v12, v15, :cond_5

    .line 213
    .line 214
    const v12, 0x7f0a0ed7

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_5
    const v12, 0x7f0a0ed6

    .line 219
    .line 220
    .line 221
    :goto_3
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    const v16, 0x7f0a0ed0

    .line 226
    .line 227
    .line 228
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    filled-new-array {v4, v11, v12, v5}, [Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    const v5, 0x7f0a0f4b

    .line 241
    .line 242
    .line 243
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    const v11, 0x7f0a0f55

    .line 248
    .line 249
    .line 250
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    if-ne v12, v15, :cond_6

    .line 259
    .line 260
    const v12, 0x7f0a0f53

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_6
    const v12, 0x7f0a0f52

    .line 265
    .line 266
    .line 267
    :goto_4
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    const v16, 0x7f0a0f46

    .line 272
    .line 273
    .line 274
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    filled-new-array {v5, v11, v12, v14}, [Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    const v11, 0x7f0a0761

    .line 287
    .line 288
    .line 289
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    const v12, 0x7f0a0772

    .line 294
    .line 295
    .line 296
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    if-ne v14, v15, :cond_7

    .line 305
    .line 306
    const v14, 0x7f0a0771

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_7
    const v14, 0x7f0a0770

    .line 311
    .line 312
    .line 313
    :goto_5
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    const v16, 0x7f0a075c

    .line 318
    .line 319
    .line 320
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    filled-new-array {v11, v12, v14, v13}, [Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-static {v11}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    const/16 v14, 0x8

    .line 341
    .line 342
    if-eqz v13, :cond_8

    .line 343
    .line 344
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    check-cast v13, Ljava/lang/Number;

    .line 349
    .line 350
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v13

    .line 354
    invoke-virtual {v9, v13, v14}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_8
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    if-ne v12, v15, :cond_9

    .line 363
    .line 364
    const v12, 0x7f0a0ed6

    .line 365
    .line 366
    .line 367
    invoke-virtual {v9, v12, v14}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_9
    const v12, 0x7f0a0ed7

    .line 372
    .line 373
    .line 374
    invoke-virtual {v9, v12, v14}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 375
    .line 376
    .line 377
    :goto_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    const/4 v12, 0x0

    .line 382
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    const/high16 v17, 0x8000000

    .line 387
    .line 388
    const-class v15, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;

    .line 389
    .line 390
    if-eqz v13, :cond_d

    .line 391
    .line 392
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    add-int/lit8 v18, v12, 0x1

    .line 397
    .line 398
    if-ltz v12, :cond_c

    .line 399
    .line 400
    check-cast v13, La/kev0;

    .line 401
    .line 402
    invoke-static {v12, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v19

    .line 406
    check-cast v19, Ljava/lang/Integer;

    .line 407
    .line 408
    invoke-static {v12, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v20

    .line 412
    check-cast v20, Ljava/lang/Integer;

    .line 413
    .line 414
    invoke-static {v12, v11}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v12

    .line 418
    check-cast v12, Ljava/lang/Integer;

    .line 419
    .line 420
    if-eqz v19, :cond_b

    .line 421
    .line 422
    if-eqz v20, :cond_b

    .line 423
    .line 424
    if-eqz v12, :cond_b

    .line 425
    .line 426
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v14

    .line 430
    const/4 v0, 0x0

    .line 431
    invoke-virtual {v9, v14, v0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    iget-object v14, v13, La/kev0;->b:Ljava/lang/String;

    .line 439
    .line 440
    iget-byte v1, v13, La/kev0;->a:B

    .line 441
    .line 442
    invoke-virtual {v9, v0, v14}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    iget v12, v13, La/kev0;->c:I

    .line 450
    .line 451
    invoke-virtual {v9, v0, v12}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    new-instance v13, Lkotlin/Pair;

    .line 467
    .line 468
    const-string v14, "key_select_section"

    .line 469
    .line 470
    invoke-direct {v13, v14, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    filled-new-array {v13}, [Lkotlin/Pair;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    new-instance v13, Landroid/content/Intent;

    .line 485
    .line 486
    invoke-direct {v13, v8, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 487
    .line 488
    .line 489
    const-string v14, "key_saved_bundle"

    .line 490
    .line 491
    invoke-virtual {v13, v14, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 492
    .line 493
    .line 494
    const-string v1, "section_click"

    .line 495
    .line 496
    invoke-virtual {v13, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v13, v12, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 500
    .line 501
    .line 502
    const/4 v1, 0x1

    .line 503
    invoke-virtual {v13, v1}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-virtual {v13, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 512
    .line 513
    .line 514
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 515
    .line 516
    const/16 v12, 0x1f

    .line 517
    .line 518
    if-lt v1, v12, :cond_a

    .line 519
    .line 520
    const/high16 v15, 0xa000000

    .line 521
    .line 522
    :goto_9
    const/4 v1, 0x0

    .line 523
    goto :goto_a

    .line 524
    :cond_a
    move/from16 v15, v17

    .line 525
    .line 526
    goto :goto_9

    .line 527
    :goto_a
    invoke-static {v8, v1, v13, v15}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 528
    .line 529
    .line 530
    move-result-object v12

    .line 531
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v9, v0, v12}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 535
    .line 536
    .line 537
    :cond_b
    move-object/from16 v0, p0

    .line 538
    .line 539
    move-object/from16 v1, p3

    .line 540
    .line 541
    move/from16 v12, v18

    .line 542
    .line 543
    goto/16 :goto_8

    .line 544
    .line 545
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 546
    .line 547
    .line 548
    throw p2

    .line 549
    :cond_d
    new-instance v0, Landroid/content/Intent;

    .line 550
    .line 551
    invoke-direct {v0, v8, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 552
    .line 553
    .line 554
    const-string v1, "widget_settings"

    .line 555
    .line 556
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 557
    .line 558
    .line 559
    const-string v1, "appWidgetId"

    .line 560
    .line 561
    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 562
    .line 563
    .line 564
    const/4 v1, 0x1

    .line 565
    invoke-virtual {v0, v1}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 574
    .line 575
    .line 576
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 577
    .line 578
    const/16 v12, 0x1f

    .line 579
    .line 580
    if-lt v1, v12, :cond_e

    .line 581
    .line 582
    const/high16 v15, 0xa000000

    .line 583
    .line 584
    :goto_b
    const/4 v1, 0x0

    .line 585
    goto :goto_c

    .line 586
    :cond_e
    move/from16 v15, v17

    .line 587
    .line 588
    goto :goto_b

    .line 589
    :goto_c
    invoke-static {v8, v1, v0, v15}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    const v4, 0x7f0a0d94

    .line 597
    .line 598
    .line 599
    invoke-virtual {v9, v4, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 600
    .line 601
    .line 602
    invoke-static {v8}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v0, v7, v9}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 607
    .line 608
    .line 609
    add-int/lit8 v6, v6, 0x1

    .line 610
    .line 611
    move-object/from16 v0, p0

    .line 612
    .line 613
    move-object/from16 v1, p3

    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :cond_f
    const/16 p2, 0x0

    .line 618
    .line 619
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    throw p2

    .line 623
    :cond_10
    const/16 p2, 0x0

    .line 624
    .line 625
    const-string v0, "getSavedQuickAvailableSectionsUseCase"

    .line 626
    .line 627
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    throw p2

    .line 631
    :cond_11
    :goto_d
    return-void

    .line 632
    :cond_12
    const/16 p2, 0x0

    .line 633
    .line 634
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw p2
.end method
