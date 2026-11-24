.class public final synthetic La/i80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n80;


# direct methods
.method public synthetic constructor <init>(La/n80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i80;->a:B

    iput-object p1, p0, La/i80;->b:La/n80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/i80;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/i80;->b:La/n80;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/t70;

    .line 10
    .line 11
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v0, p0, La/u90;->b:La/p80;

    .line 21
    .line 22
    iget-object v2, p0, La/u90;->l:La/spx;

    .line 23
    .line 24
    invoke-virtual {v2}, La/spx;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_6

    .line 29
    .line 30
    iget-object v2, p0, La/u90;->m:La/lzt;

    .line 31
    .line 32
    invoke-virtual {v2}, La/lzt;->a()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_0
    iget-object v2, p0, La/u90;->e:La/vcu;

    .line 41
    .line 42
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v3, La/vrs;->a:La/vrs;

    .line 47
    .line 48
    if-ne v2, v3, :cond_6

    .line 49
    .line 50
    iget-object v2, p0, La/u90;->f:La/ztt;

    .line 51
    .line 52
    invoke-virtual {v2}, La/ztt;->a()La/csr;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v2, v2, La/csr;->a:La/bsr;

    .line 57
    .line 58
    iget-object v2, v2, La/bsr;->a:La/esr;

    .line 59
    .line 60
    invoke-virtual {v2}, La/esr;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    new-instance v2, La/iy5;

    .line 67
    .line 68
    sget-object v3, La/csr;->e:La/csr;

    .line 69
    .line 70
    invoke-direct {v2, v3}, La/iy5;-><init>(La/csr;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget-object v3, p0, La/u90;->n:La/mne;

    .line 78
    .line 79
    iget-object v7, v3, La/mne;->a:La/rwj;

    .line 80
    .line 81
    sget-object v5, La/o90;->a:La/o90;

    .line 82
    .line 83
    new-instance v8, La/l1;

    .line 84
    .line 85
    const/16 v3, 0x9

    .line 86
    .line 87
    invoke-direct {v8, p0, v2, v1, v3}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v9, 0xa

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object p0, v0, La/p80;->d:La/r80;

    .line 100
    .line 101
    iget-object v2, p0, La/r80;->c:La/d80;

    .line 102
    .line 103
    invoke-virtual {v2}, La/d80;->a()Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :cond_2
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_3

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    move-object v6, v5

    .line 126
    check-cast v6, La/t70;

    .line 127
    .line 128
    iget-object v7, p1, La/t70;->b:La/z70;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    iget-object v6, v6, La/t70;->b:La/z70;

    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-ne v7, v6, :cond_2

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    move-object v5, v1

    .line 144
    :goto_0
    check-cast v5, La/t70;

    .line 145
    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, La/t70;

    .line 157
    .line 158
    :cond_4
    iget-object p1, v2, La/d80;->a:La/p7m0;

    .line 159
    .line 160
    invoke-virtual {p1, v1, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    iget-object p1, v0, La/p80;->c:La/wkt0;

    .line 164
    .line 165
    invoke-virtual {v2}, La/d80;->a()Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-nez v1, :cond_5

    .line 174
    .line 175
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, La/t70;

    .line 180
    .line 181
    iget-wide v0, v0, La/t70;->a:D

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_5
    const-wide/16 v0, 0x0

    .line 185
    .line 186
    :goto_1
    invoke-virtual {p1, v0, v1}, La/wkt0;->a(D)V

    .line 187
    .line 188
    .line 189
    sget-object p1, La/z70;->v:La/z70;

    .line 190
    .line 191
    iget-object p0, p0, La/r80;->c:La/d80;

    .line 192
    .line 193
    iput-object p1, p0, La/d80;->b:La/z70;

    .line 194
    .line 195
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_0
    check-cast p1, La/z70;

    .line 199
    .line 200
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, La/n80;->Q1:La/ndk0;

    .line 206
    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 210
    .line 211
    .line 212
    :cond_7
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0, p1}, La/u90;->A(La/z70;)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 223
    .line 224
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    const/4 v0, 0x2

    .line 238
    if-eqz p1, :cond_8

    .line 239
    .line 240
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    new-instance v3, La/t32;

    .line 245
    .line 246
    const/16 v4, 0x1c

    .line 247
    .line 248
    invoke-direct {v3, v4}, La/t32;-><init>(B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    new-instance v4, Landroid/os/Handler;

    .line 256
    .line 257
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 262
    .line 263
    .line 264
    new-instance v5, La/b1;

    .line 265
    .line 266
    invoke-direct {v5, v2, p1, v3, v0}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 267
    .line 268
    .line 269
    const-wide/16 v2, 0x0

    .line 270
    .line 271
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 272
    .line 273
    .line 274
    :cond_8
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    iget-object p0, v8, La/u90;->l:La/spx;

    .line 279
    .line 280
    invoke-virtual {p0}, La/spx;->a()Z

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    if-nez p0, :cond_a

    .line 285
    .line 286
    iget-object p0, v8, La/u90;->m:La/lzt;

    .line 287
    .line 288
    invoke-virtual {p0}, La/lzt;->a()Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    if-nez p0, :cond_9

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_9
    iget-object p0, v8, La/u90;->h:La/fpi0;

    .line 296
    .line 297
    const/4 p1, 0x1

    .line 298
    invoke-virtual {p0, p1}, La/fpi0;->a(Z)V

    .line 299
    .line 300
    .line 301
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    new-instance v3, La/t90;

    .line 306
    .line 307
    const/4 v12, 0x0

    .line 308
    const/4 v13, 0x1

    .line 309
    const/4 v7, 0x1

    .line 310
    const-class v9, La/u90;

    .line 311
    .line 312
    const-string v10, "handleGameError"

    .line 313
    .line 314
    const-string v11, "handleGameError(Ljava/lang/Throwable;)V"

    .line 315
    .line 316
    move-object v6, v3

    .line 317
    invoke-direct/range {v6 .. v13}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 318
    .line 319
    .line 320
    iget-object p0, v8, La/u90;->n:La/mne;

    .line 321
    .line 322
    iget-object v5, p0, La/mne;->b:La/dvj;

    .line 323
    .line 324
    new-instance v6, La/p90;

    .line 325
    .line 326
    invoke-direct {v6, v8, v1, v0}, La/p90;-><init>(La/u90;La/yje;B)V

    .line 327
    .line 328
    .line 329
    const/16 v7, 0xa

    .line 330
    .line 331
    const/4 v4, 0x0

    .line 332
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 333
    .line 334
    .line 335
    :cond_a
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
