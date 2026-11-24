.class public final synthetic La/ld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nd;


# direct methods
.method public synthetic constructor <init>(La/nd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ld;->a:B

    iput-object p1, p0, La/ld;->b:La/nd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ld;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x3

    .line 5
    iget-object p0, p0, La/ld;->b:La/nd;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 11
    .line 12
    iget-object v0, p0, La/nd;->M1:La/kiu0;

    .line 13
    .line 14
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/qd;

    .line 19
    .line 20
    iget-object v1, p0, La/nd;->Q1:La/yzn0;

    .line 21
    .line 22
    sget-object v3, La/nd;->U1:[La/iiy;

    .line 23
    .line 24
    aget-object v2, v3, v2

    .line 25
    .line 26
    invoke-virtual {v1, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/we50;

    .line 31
    .line 32
    iget-object v1, v0, La/qd;->b:La/i1w0;

    .line 33
    .line 34
    sget-object v2, La/od;->a:[I

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    aget p0, v2, p0

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v3, 0x0

    .line 44
    if-ne p0, v2, :cond_1

    .line 45
    .line 46
    iget-object p0, v0, La/qd;->c:La/joc;

    .line 47
    .line 48
    iget-object p0, p0, La/joc;->a:La/g090;

    .line 49
    .line 50
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/d190;

    .line 53
    .line 54
    iget-object p0, p0, La/d190;->e:La/pwf0;

    .line 55
    .line 56
    sget-object v2, La/pwf0;->c:La/pwf0;

    .line 57
    .line 58
    if-ne p0, v2, :cond_0

    .line 59
    .line 60
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object v0, v0, La/qd;->f:La/jh70;

    .line 65
    .line 66
    invoke-static {v0, v3}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v2, La/q0w0;

    .line 71
    .line 72
    invoke-direct {v2, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, La/c8d;

    .line 76
    .line 77
    sget-object v4, La/y7d;->a:La/v7d;

    .line 78
    .line 79
    invoke-direct {v0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v0, v1, p0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_0
    move-object v0, p0

    .line 87
    check-cast v0, La/paw;

    .line 88
    .line 89
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_2

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
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object v0, v0, La/qd;->e:La/qgd;

    .line 110
    .line 111
    invoke-virtual {v0}, La/qgd;->f0()Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v2, La/d1w0;

    .line 116
    .line 117
    invoke-direct {v2, v0}, La/d1w0;-><init>(La/m7h0;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, La/c8d;

    .line 121
    .line 122
    sget-object v4, La/y7d;->a:La/v7d;

    .line 123
    .line 124
    invoke-direct {v0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v0, v1, p0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_1
    move-object v0, p0

    .line 132
    check-cast v0, La/paw;

    .line 133
    .line 134
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, La/oe50;

    .line 145
    .line 146
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    iget-object v0, v0, La/qd;->d:La/zn00;

    .line 155
    .line 156
    sget-object v2, La/we50;->d:La/we50;

    .line 157
    .line 158
    invoke-virtual {v0, v2}, La/zn00;->G0(La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v2, La/d1w0;

    .line 163
    .line 164
    invoke-direct {v2, v0}, La/d1w0;-><init>(La/m7h0;)V

    .line 165
    .line 166
    .line 167
    new-instance v0, La/c8d;

    .line 168
    .line 169
    sget-object v4, La/y7d;->a:La/v7d;

    .line 170
    .line 171
    invoke-direct {v0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p0, v0, v1, p0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    :goto_2
    move-object v0, p0

    .line 179
    check-cast v0, La/paw;

    .line 180
    .line 181
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_2

    .line 186
    .line 187
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, La/oe50;

    .line 192
    .line 193
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_0
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 201
    .line 202
    new-instance v0, La/kd;

    .line 203
    .line 204
    new-instance v3, La/t0;

    .line 205
    .line 206
    iget-object v4, p0, La/nd;->M1:La/kiu0;

    .line 207
    .line 208
    invoke-virtual {v4}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    move-object v5, v4

    .line 213
    check-cast v5, La/qd;

    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    const/16 v10, 0xb

    .line 217
    .line 218
    const/4 v4, 0x1

    .line 219
    const-class v6, La/qd;

    .line 220
    .line 221
    const-string v7, "onAccountSelected"

    .line 222
    .line 223
    const-string v8, "onAccountSelected(J)V"

    .line 224
    .line 225
    invoke-direct/range {v3 .. v10}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 226
    .line 227
    .line 228
    const v4, 0x7f130032

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 239
    .line 240
    .line 241
    new-instance v4, La/hhd;

    .line 242
    .line 243
    const/16 v5, 0x11

    .line 244
    .line 245
    invoke-direct {v4, v5}, La/hhd;-><init>(B)V

    .line 246
    .line 247
    .line 248
    new-instance v5, La/k1;

    .line 249
    .line 250
    const/16 v6, 0xb

    .line 251
    .line 252
    invoke-direct {v5, v3, p0, v6}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    new-instance p0, La/l9;

    .line 256
    .line 257
    const/16 v3, 0xa

    .line 258
    .line 259
    invoke-direct {p0, v2, v3}, La/l9;-><init>(IB)V

    .line 260
    .line 261
    .line 262
    sget-object v3, La/m9;->l:La/m9;

    .line 263
    .line 264
    new-instance v6, La/gbn;

    .line 265
    .line 266
    invoke-direct {v6, v4, p0, v5, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 267
    .line 268
    .line 269
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 270
    .line 271
    invoke-virtual {p0, v6}, La/dp;->b(La/gbn;)V

    .line 272
    .line 273
    .line 274
    new-instance v3, La/shq0;

    .line 275
    .line 276
    const/16 v4, 0x9

    .line 277
    .line 278
    invoke-direct {v3, v4}, La/shq0;-><init>(B)V

    .line 279
    .line 280
    .line 281
    new-instance v4, La/t6q0;

    .line 282
    .line 283
    const/16 v5, 0x14

    .line 284
    .line 285
    invoke-direct {v4, v5}, La/t6q0;-><init>(B)V

    .line 286
    .line 287
    .line 288
    new-instance v5, La/d8q0;

    .line 289
    .line 290
    invoke-direct {v5, v2, v1}, La/d8q0;-><init>(IB)V

    .line 291
    .line 292
    .line 293
    sget-object v1, La/pfo0;->o:La/pfo0;

    .line 294
    .line 295
    new-instance v2, La/gbn;

    .line 296
    .line 297
    invoke-direct {v2, v3, v5, v4, v1}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0, v2}, La/dp;->b(La/gbn;)V

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_1
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 305
    .line 306
    new-instance v0, La/ry3;

    .line 307
    .line 308
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    iget-object p0, p0, La/nd;->K1:La/yfi;

    .line 313
    .line 314
    if-eqz p0, :cond_3

    .line 315
    .line 316
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 317
    .line 318
    .line 319
    return-object v0

    .line 320
    :cond_3
    const-string p0, "viewModelFactory"

    .line 321
    .line 322
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const/4 p0, 0x0

    .line 326
    throw p0

    .line 327
    :pswitch_2
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 328
    .line 329
    iget-object p0, p0, La/nd;->M1:La/kiu0;

    .line 330
    .line 331
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    check-cast p0, La/qd;

    .line 336
    .line 337
    iget-boolean v0, p0, La/qd;->l:Z

    .line 338
    .line 339
    if-nez v0, :cond_4

    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_4
    iget-object v0, p0, La/qd;->b:La/i1w0;

    .line 343
    .line 344
    new-instance v2, La/t1;

    .line 345
    .line 346
    invoke-direct {v2, p0, v1}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 350
    .line 351
    .line 352
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object p0

    .line 355
    :pswitch_3
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 356
    .line 357
    invoke-virtual {p0}, La/nd;->H0()V

    .line 358
    .line 359
    .line 360
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_4
    sget-object v0, La/nd;->S1:La/jdk0;

    .line 364
    .line 365
    invoke-virtual {p0}, La/nd;->H0()V

    .line 366
    .line 367
    .line 368
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object p0

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
