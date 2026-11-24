.class public final synthetic La/l620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a720;


# direct methods
.method public synthetic constructor <init>(La/a720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l620;->a:B

    iput-object p1, p0, La/l620;->b:La/a720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/l620;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/l620;->b:La/a720;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    sget-object v0, La/a720;->x2:La/xuz;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, La/hl20;->a:La/hl20;

    .line 26
    .line 27
    iget-object p1, p0, La/mn20;->i:La/mne;

    .line 28
    .line 29
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 30
    .line 31
    new-instance v7, La/il20;

    .line 32
    .line 33
    invoke-direct {v7, p0, v2, v1}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v8, 0xa

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/mn20;->Y:La/ol60;

    .line 43
    .line 44
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 51
    .line 52
    sget-object v0, La/a720;->x2:La/xuz;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, La/mn20;->e:La/i1w0;

    .line 62
    .line 63
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v0, La/c8d;

    .line 68
    .line 69
    sget-object v2, La/y7d;->a:La/v7d;

    .line 70
    .line 71
    sget-object v3, La/o0w0;->a:La/o0w0;

    .line 72
    .line 73
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v2, La/wez;->b:La/wez;

    .line 81
    .line 82
    invoke-static {v2, v0, p0, p1, v1}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    move-object v0, p1

    .line 87
    check-cast v0, La/paw;

    .line 88
    .line 89
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_0

    .line 94
    .line 95
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/oe50;

    .line 100
    .line 101
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 109
    .line 110
    sget-object v0, La/a720;->x2:La/xuz;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-object p0, p0, La/mn20;->e:La/i1w0;

    .line 120
    .line 121
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance v0, La/c8d;

    .line 126
    .line 127
    sget-object v2, La/y7d;->a:La/v7d;

    .line 128
    .line 129
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 130
    .line 131
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v0}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v2, La/wez;->b:La/wez;

    .line 139
    .line 140
    invoke-static {v2, v0, p0, p1, v1}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_1
    move-object v0, p1

    .line 145
    check-cast v0, La/paw;

    .line 146
    .line 147
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_1

    .line 152
    .line 153
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/oe50;

    .line 158
    .line 159
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 167
    .line 168
    sget-object v0, La/a720;->x2:La/xuz;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, La/a720;->m2:La/kiu0;

    .line 174
    .line 175
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, La/ya20;

    .line 180
    .line 181
    iget-object p1, p1, La/ya20;->b:La/p7m0;

    .line 182
    .line 183
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget-object p1, p0, La/mn20;->F:La/mii0;

    .line 196
    .line 197
    iget-object p1, p1, La/mii0;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, La/kt2;

    .line 200
    .line 201
    const-string v0, "bet_place_settings"

    .line 202
    .line 203
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-object p1, p0, La/mn20;->G:La/x20;

    .line 207
    .line 208
    iget-object p1, p1, La/x20;->a:La/s1p;

    .line 209
    .line 210
    const-wide/16 v0, 0xc66

    .line 211
    .line 212
    sget-object v2, La/xun;->a:La/xun;

    .line 213
    .line 214
    invoke-virtual {p1, v2, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, La/mn20;->e:La/i1w0;

    .line 218
    .line 219
    new-instance v0, La/km00;

    .line 220
    .line 221
    const/16 v1, 0x16

    .line 222
    .line 223
    invoke-direct {v0, p0, v1}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object p1, La/a720;->x2:La/xuz;

    .line 238
    .line 239
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    new-instance v4, La/r520;

    .line 248
    .line 249
    const/16 p1, 0x19

    .line 250
    .line 251
    invoke-direct {v4, p1}, La/r520;-><init>(B)V

    .line 252
    .line 253
    .line 254
    iget-object p1, p0, La/mn20;->i:La/mne;

    .line 255
    .line 256
    iget-object v6, p1, La/mne;->b:La/dvj;

    .line 257
    .line 258
    new-instance v7, La/mt00;

    .line 259
    .line 260
    const/16 p1, 0x10

    .line 261
    .line 262
    invoke-direct {v7, p0, v2, p1}, La/mt00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 263
    .line 264
    .line 265
    const/16 v8, 0xa

    .line 266
    .line 267
    const/4 v5, 0x0

    .line 268
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 269
    .line 270
    .line 271
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object p0

    .line 274
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    sget-object p1, La/a720;->x2:La/xuz;

    .line 281
    .line 282
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    iget-object p1, p0, La/mn20;->G:La/x20;

    .line 287
    .line 288
    iget-object v0, p0, La/mn20;->h:La/ms2;

    .line 289
    .line 290
    invoke-static {v0}, La/q8x;->J(La/ms2;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    iget-object v0, p0, La/mn20;->b:La/m0k0;

    .line 295
    .line 296
    iget-wide v8, v0, La/m0k0;->B:J

    .line 297
    .line 298
    iget-wide v6, v0, La/m0k0;->a:J

    .line 299
    .line 300
    const-wide/16 v10, 0x0

    .line 301
    .line 302
    cmp-long v1, v8, v10

    .line 303
    .line 304
    iget-object v3, p0, La/mn20;->F:La/mii0;

    .line 305
    .line 306
    if-nez v1, :cond_2

    .line 307
    .line 308
    invoke-virtual {v3, v5, v6, v7, v4}, La/mii0;->R(Ljava/lang/String;JZ)V

    .line 309
    .line 310
    .line 311
    long-to-int v0, v6

    .line 312
    invoke-virtual {p1, v5, v0, v4}, La/x20;->r(Ljava/lang/String;IZ)V

    .line 313
    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_2
    invoke-virtual/range {v3 .. v9}, La/mii0;->S(ZLjava/lang/String;JJ)V

    .line 317
    .line 318
    .line 319
    long-to-int v1, v6

    .line 320
    iget-wide v6, v0, La/m0k0;->B:J

    .line 321
    .line 322
    long-to-int v0, v6

    .line 323
    invoke-virtual {p1, v1, v0, v5, v4}, La/x20;->q(IILjava/lang/String;Z)V

    .line 324
    .line 325
    .line 326
    :goto_2
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    new-instance v7, La/r520;

    .line 331
    .line 332
    const/16 p1, 0x1a

    .line 333
    .line 334
    invoke-direct {v7, p1}, La/r520;-><init>(B)V

    .line 335
    .line 336
    .line 337
    iget-object p1, p0, La/mn20;->i:La/mne;

    .line 338
    .line 339
    iget-object v9, p1, La/mne;->b:La/dvj;

    .line 340
    .line 341
    new-instance v10, La/ys8;

    .line 342
    .line 343
    const/16 p1, 0x14

    .line 344
    .line 345
    invoke-direct {v10, p0, v4, v2, p1}, La/ys8;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 346
    .line 347
    .line 348
    const/16 v11, 0xa

    .line 349
    .line 350
    const/4 v8, 0x0

    .line 351
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 352
    .line 353
    .line 354
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    return-object p0

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
