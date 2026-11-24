.class public final La/y560;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/mne;

.field public final p:La/bmu;

.field public final q:La/duj;

.field public final r:La/i1w0;

.field public final s:La/ilp0;

.field public final t:La/ntu;

.field public final u:La/i7u0;

.field public final v:La/q7u0;


# direct methods
.method public constructor <init>(La/mne;La/bmu;La/duj;La/j1q0;La/i1w0;La/ilp0;La/ntu;La/i7u0;La/q7u0;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/yd10;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {v2, p4, v0}, La/yd10;-><init>(La/j1q0;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/mb50;

    .line 14
    .line 15
    const/16 p4, 0x18

    .line 16
    .line 17
    invoke-direct {v3, p4}, La/mb50;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iget-object p4, p1, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p4, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/y560;->o:La/mne;

    .line 35
    .line 36
    iput-object p2, v0, La/y560;->p:La/bmu;

    .line 37
    .line 38
    iput-object p3, v0, La/y560;->q:La/duj;

    .line 39
    .line 40
    iput-object p5, v0, La/y560;->r:La/i1w0;

    .line 41
    .line 42
    iput-object p6, v0, La/y560;->s:La/ilp0;

    .line 43
    .line 44
    iput-object p7, v0, La/y560;->t:La/ntu;

    .line 45
    .line 46
    iput-object p8, v0, La/y560;->u:La/i7u0;

    .line 47
    .line 48
    iput-object p9, v0, La/y560;->v:La/q7u0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/i560;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/a560;->a:La/a560;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p1, p0, La/y560;->o:La/mne;

    .line 20
    .line 21
    iget-object v5, p1, La/mne;->b:La/dvj;

    .line 22
    .line 23
    new-instance v3, La/x560;

    .line 24
    .line 25
    invoke-direct {v3, p0, v1}, La/x560;-><init>(La/y560;B)V

    .line 26
    .line 27
    .line 28
    new-instance v6, La/w620;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    const/16 v0, 0x19

    .line 32
    .line 33
    invoke-direct {v6, p0, p1, v0}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    instance-of v0, p1, La/c560;

    .line 44
    .line 45
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 46
    .line 47
    iget-object v3, p0, La/y560;->r:La/i1w0;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    check-cast p1, La/c560;

    .line 52
    .line 53
    iget-boolean p1, p1, La/c560;->a:Z

    .line 54
    .line 55
    const-string v0, "action"

    .line 56
    .line 57
    const-string v4, "verification_back_click"

    .line 58
    .line 59
    const-wide/16 v5, 0x3059

    .line 60
    .line 61
    iget-object v7, p0, La/y560;->u:La/i7u0;

    .line 62
    .line 63
    iget-object p0, p0, La/y560;->v:La/q7u0;

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    iget-object p0, p0, La/q7u0;->a:La/s1p;

    .line 68
    .line 69
    const-string p1, "system"

    .line 70
    .line 71
    invoke-static {p1, p0, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 72
    .line 73
    .line 74
    iget-object p0, v7, La/i7u0;->a:La/kt2;

    .line 75
    .line 76
    invoke-static {v0, p1, p0, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iget-object p0, p0, La/q7u0;->a:La/s1p;

    .line 81
    .line 82
    const-string p1, "arrow"

    .line 83
    .line 84
    invoke-static {p1, p0, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 85
    .line 86
    .line 87
    iget-object p0, v7, La/i7u0;->a:La/kt2;

    .line 88
    .line 89
    invoke-static {v0, p1, p0, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance p1, La/c8d;

    .line 97
    .line 98
    sget-object v0, La/y7d;->a:La/v7d;

    .line 99
    .line 100
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_1
    move-object p1, p0

    .line 108
    check-cast p1, La/paw;

    .line 109
    .line 110
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, La/oe50;

    .line 121
    .line 122
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    sget-object v0, La/b560;->a:La/b560;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    sget-object v0, La/f560;->a:La/f560;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    iget-object p1, p0, La/y560;->t:La/ntu;

    .line 147
    .line 148
    invoke-virtual {p1}, La/ntu;->a()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object v0, p0, La/y560;->p:La/bmu;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v0, v0, La/bmu;->a:La/k560;

    .line 161
    .line 162
    const-string v2, "/nomapay/office/identification?skip-lang-redirect=1&set-base-url=v3-api"

    .line 163
    .line 164
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    iget-object p1, v0, La/k560;->a:La/btt0;

    .line 169
    .line 170
    invoke-virtual {p1}, La/btt0;->a()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-instance v2, Lkotlin/Pair;

    .line 175
    .line 176
    const-string v3, "X-Auth"

    .line 177
    .line 178
    invoke-direct {v2, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    new-instance p1, Lkotlin/Pair;

    .line 182
    .line 183
    const-string v3, "mf-render-mode"

    .line 184
    .line 185
    const-string v5, "html"

    .line 186
    .line 187
    invoke-direct {p1, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v3, v0, La/k560;->c:La/kuy;

    .line 191
    .line 192
    invoke-virtual {v3}, La/kuy;->a()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    new-instance v5, Lkotlin/Pair;

    .line 197
    .line 198
    const-string v6, "X-Language"

    .line 199
    .line 200
    invoke-direct {v5, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, v0, La/k560;->b:La/knf0;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const/16 v0, 0x54d

    .line 209
    .line 210
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v3, Lkotlin/Pair;

    .line 215
    .line 216
    const-string v6, "X-Mobile-Project-Id"

    .line 217
    .line 218
    invoke-direct {v3, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    filled-new-array {v2, p1, v5, v3}, [Lkotlin/Pair;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 230
    .line 231
    iget-object v5, p1, La/ocj;->a:La/p7m0;

    .line 232
    .line 233
    :cond_4
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-object v2, p1

    .line 241
    check-cast v2, La/p560;

    .line 242
    .line 243
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    const/16 v3, 0x12

    .line 249
    .line 250
    invoke-static {v2, v1, v4, v0, v3}, La/p560;->a(La/p560;ZLjava/lang/String;Ljava/util/Map;I)La/p560;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v5, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_4

    .line 259
    .line 260
    return-void

    .line 261
    :cond_5
    sget-object v0, La/e560;->a:La/e560;

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_6

    .line 268
    .line 269
    sget-object p1, La/n560;->a:La/n560;

    .line 270
    .line 271
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_6
    sget-object v0, La/g560;->a:La/g560;

    .line 276
    .line 277
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_7

    .line 282
    .line 283
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    new-instance p1, La/c8d;

    .line 288
    .line 289
    sget-object v0, La/y7d;->a:La/v7d;

    .line 290
    .line 291
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 292
    .line 293
    .line 294
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    :goto_2
    move-object p1, p0

    .line 299
    check-cast p1, La/paw;

    .line 300
    .line 301
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_8

    .line 306
    .line 307
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, La/oe50;

    .line 312
    .line 313
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 314
    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_7
    sget-object v0, La/d560;->a:La/d560;

    .line 318
    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_9

    .line 324
    .line 325
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    new-instance p1, La/c8d;

    .line 330
    .line 331
    sget-object v0, La/y7d;->a:La/v7d;

    .line 332
    .line 333
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 334
    .line 335
    .line 336
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    :goto_3
    move-object p1, p0

    .line 341
    check-cast p1, La/paw;

    .line 342
    .line 343
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_8

    .line 348
    .line 349
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    check-cast p1, La/oe50;

    .line 354
    .line 355
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 356
    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_8
    return-void

    .line 360
    :cond_9
    instance-of v0, p1, La/h560;

    .line 361
    .line 362
    if-eqz v0, :cond_a

    .line 363
    .line 364
    check-cast p1, La/h560;

    .line 365
    .line 366
    iget-object p1, p1, La/h560;->a:Ljava/lang/String;

    .line 367
    .line 368
    new-instance v0, La/l560;

    .line 369
    .line 370
    invoke-direct {v0, p1}, La/l560;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 378
    .line 379
    .line 380
    return-void
.end method
