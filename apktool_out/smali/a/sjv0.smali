.class public abstract La/sjv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/hz40;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/u1h0;->a:[J

    .line 2
    .line 3
    new-instance v0, La/hz40;

    .line 4
    .line 5
    invoke-direct {v0}, La/hz40;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sjv0;->a:La/hz40;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Landroid/view/View;)La/nld;
    .locals 1

    .line 1
    const v0, 0x7f0a00ac

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, La/nld;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, La/nld;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static final b(Landroid/view/View;)La/fge0;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Cannot locate windowRecomposer; View "

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " is not attached to a window"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {p0}, La/k7n0;->v(Landroid/view/View;)Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    instance-of v1, v0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    check-cast v0, Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const v2, 0x1020002

    .line 44
    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    move-object v9, v0

    .line 54
    move-object v0, p0

    .line 55
    move-object p0, v9

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    invoke-static {p0}, La/sjv0;->a(Landroid/view/View;)La/nld;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x0

    .line 62
    if-nez v0, :cond_a

    .line 63
    .line 64
    sget-object v0, La/qjv0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/pjv0;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 76
    .line 77
    sget-object v2, Lkotlin/coroutines/d;->d1:La/ake;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v2, La/r23;->m:La/n0o0;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-ne v2, v3, :cond_3

    .line 96
    .line 97
    sget-object v2, La/r23;->m:La/n0o0;

    .line 98
    .line 99
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    sget-object v2, La/r23;->n:La/y50;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 113
    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    :goto_2
    invoke-interface {v2, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, La/lwf;->t:La/lwf;

    .line 121
    .line 122
    invoke-interface {v2, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, La/qq40;

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    new-instance v5, La/f390;

    .line 132
    .line 133
    invoke-direct {v5, v3}, La/f390;-><init>(La/qq40;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, v5, La/f390;->b:La/o24;

    .line 137
    .line 138
    iget-object v6, v3, La/o24;->b:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter v6

    .line 141
    :try_start_0
    iput-boolean v4, v3, La/o24;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    monitor-exit v6

    .line 144
    goto :goto_3

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    monitor-exit v6

    .line 147
    throw p0

    .line 148
    :cond_4
    move-object v5, v1

    .line 149
    :goto_3
    new-instance v3, La/mie0;

    .line 150
    .line 151
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 152
    .line 153
    .line 154
    sget-object v6, La/ujn;->u:La/ujn;

    .line 155
    .line 156
    invoke-interface {v2, v6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, La/ks40;

    .line 161
    .line 162
    if-nez v6, :cond_5

    .line 163
    .line 164
    new-instance v6, La/ls40;

    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-direct {v6, v7}, La/ls40;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    iput-object v6, v3, La/mie0;->a:Ljava/lang/Object;

    .line 178
    .line 179
    :cond_5
    if-eqz v5, :cond_6

    .line 180
    .line 181
    move-object v0, v5

    .line 182
    :cond_6
    invoke-interface {v2, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {v0, v6}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    new-instance v2, La/fge0;

    .line 191
    .line 192
    invoke-direct {v2, v0}, La/fge0;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 193
    .line 194
    .line 195
    iget-object v6, v2, La/fge0;->c:Ljava/lang/Object;

    .line 196
    .line 197
    monitor-enter v6

    .line 198
    const/4 v7, 0x1

    .line 199
    :try_start_1
    iput-boolean v7, v2, La/fge0;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    monitor-exit v6

    .line 202
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {p0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    if-eqz v6, :cond_7

    .line 211
    .line 212
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    goto :goto_4

    .line 217
    :cond_7
    move-object v6, v1

    .line 218
    :goto_4
    if-eqz v6, :cond_8

    .line 219
    .line 220
    new-instance v7, La/j14;

    .line 221
    .line 222
    const/4 v8, 0x7

    .line 223
    invoke-direct {v7, p0, v2, v8}, La/j14;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v7}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 227
    .line 228
    .line 229
    new-instance v7, La/n1r;

    .line 230
    .line 231
    invoke-direct {v7, v0, v5, v2, v3}, La/n1r;-><init>(La/sje;La/f390;La/fge0;La/mie0;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v7}, La/glz;->a(La/blz;)V

    .line 235
    .line 236
    .line 237
    const v0, 0x7f0a00ac

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    sget-object v0, La/v7v;->a:La/v7v;

    .line 244
    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const-string v5, "windowRecomposer cleanup"

    .line 250
    .line 251
    sget v6, La/imv;->a:I

    .line 252
    .line 253
    new-instance v6, La/hmv;

    .line 254
    .line 255
    invoke-direct {v6, v3, v5, v4}, La/hmv;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 256
    .line 257
    .line 258
    iget-object v3, v6, La/hmv;->f:La/hmv;

    .line 259
    .line 260
    new-instance v4, La/n7t0;

    .line 261
    .line 262
    const/16 v5, 0x11

    .line 263
    .line 264
    invoke-direct {v4, v2, p0, v1, v5}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 265
    .line 266
    .line 267
    const/4 v5, 0x2

    .line 268
    invoke-static {v0, v3, v1, v4, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v1, La/bc0;

    .line 273
    .line 274
    const/16 v3, 0xe

    .line 275
    .line 276
    invoke-direct {v1, v0, v3}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 280
    .line 281
    .line 282
    return-object v2

    .line 283
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v2, "ViewTreeLifecycleOwner not found from "

    .line 286
    .line 287
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-static {p0}, La/xcx;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 298
    .line 299
    .line 300
    invoke-static {}, La/csj;->b()V

    .line 301
    .line 302
    .line 303
    return-object v1

    .line 304
    :catchall_1
    move-exception p0

    .line 305
    monitor-exit v6

    .line 306
    throw p0

    .line 307
    :cond_9
    const-string p0, "no AndroidUiDispatcher for this thread"

    .line 308
    .line 309
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-object v1

    .line 313
    :cond_a
    instance-of p0, v0, La/fge0;

    .line 314
    .line 315
    if-eqz p0, :cond_b

    .line 316
    .line 317
    check-cast v0, La/fge0;

    .line 318
    .line 319
    return-object v0

    .line 320
    :cond_b
    const-string p0, "root viewTreeParentCompositionContext is not a Recomposer"

    .line 321
    .line 322
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-object v1
.end method
