.class public final synthetic La/tid0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wid0;


# direct methods
.method public synthetic constructor <init>(La/wid0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tid0;->a:B

    iput-object p1, p0, La/tid0;->b:La/wid0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/tid0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/tid0;->b:La/wid0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 13
    .line 14
    invoke-virtual {v4}, La/wid0;->H0()La/ijd0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/ijd0;->b:La/i1w0;

    .line 19
    .line 20
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v3, La/c8d;

    .line 25
    .line 26
    sget-object v4, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v3, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    move-object v1, v0

    .line 36
    check-cast v1, La/paw;

    .line 37
    .line 38
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/oe50;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 58
    .line 59
    invoke-virtual {v4}, La/wid0;->H0()La/ijd0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p0, p0, La/ijd0;->b:La/i1w0;

    .line 64
    .line 65
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v3, La/c8d;

    .line 70
    .line 71
    sget-object v4, La/y7d;->a:La/v7d;

    .line 72
    .line 73
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v3, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_1
    move-object v1, v0

    .line 81
    check-cast v1, La/paw;

    .line 82
    .line 83
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/oe50;

    .line 94
    .line 95
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1
    sget-object v0, La/wid0;->R1:La/jh70;

    .line 103
    .line 104
    iget-object v6, p0, La/tid0;->b:La/wid0;

    .line 105
    .line 106
    iget-object v4, v6, La/wid0;->M1:La/wdk0;

    .line 107
    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    new-instance v5, La/xdk0;

    .line 111
    .line 112
    sget-object v8, La/rek0;->b:La/rek0;

    .line 113
    .line 114
    const p0, 0x7f130dca

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/16 v14, 0x7c

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    const/4 v11, 0x0

    .line 129
    const/4 v12, 0x0

    .line 130
    move-object v7, v5

    .line 131
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 132
    .line 133
    .line 134
    const/16 v11, 0x3fc

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_2
    const-string p0, "snackbarManager"

    .line 146
    .line 147
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v3

    .line 151
    :pswitch_2
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 152
    .line 153
    invoke-virtual {v4}, La/wid0;->H0()La/ijd0;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance v5, La/prc0;

    .line 162
    .line 163
    const/4 v11, 0x0

    .line 164
    const/16 v12, 0xc

    .line 165
    .line 166
    const/4 v6, 0x1

    .line 167
    const-class v8, La/ijd0;

    .line 168
    .line 169
    const-string v9, "handleError"

    .line 170
    .line 171
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 172
    .line 173
    invoke-direct/range {v5 .. v12}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v7, La/ijd0;->f:La/mne;

    .line 177
    .line 178
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 179
    .line 180
    new-instance v12, La/coc0;

    .line 181
    .line 182
    const/4 v0, 0x5

    .line 183
    invoke-direct {v12, v7, v3, v0}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 184
    .line 185
    .line 186
    const/16 v13, 0xa

    .line 187
    .line 188
    const/4 v10, 0x0

    .line 189
    move-object v8, p0

    .line 190
    move-object v9, v5

    .line 191
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_3
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 198
    .line 199
    invoke-virtual {v4}, La/wid0;->H0()La/ijd0;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    sget-object v0, La/bjd0;->a:La/bjd0;

    .line 204
    .line 205
    invoke-virtual {p0, v0}, La/ijd0;->x(La/ejd0;)V

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_4
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 212
    .line 213
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    instance-of v0, p0, La/af3;

    .line 225
    .line 226
    if-eqz v0, :cond_3

    .line 227
    .line 228
    check-cast p0, La/af3;

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_3
    move-object p0, v3

    .line 232
    :goto_2
    const-class v0, La/xid0;

    .line 233
    .line 234
    if-eqz p0, :cond_6

    .line 235
    .line 236
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, La/o5d0;

    .line 245
    .line 246
    if-eqz p0, :cond_4

    .line 247
    .line 248
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/ze3;

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_4
    move-object p0, v3

    .line 256
    :goto_3
    instance-of v1, p0, La/xid0;

    .line 257
    .line 258
    if-nez v1, :cond_5

    .line 259
    .line 260
    move-object p0, v3

    .line 261
    :cond_5
    check-cast p0, La/xid0;

    .line 262
    .line 263
    if-eqz p0, :cond_6

    .line 264
    .line 265
    new-instance v8, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

    .line 266
    .line 267
    iget-object v0, v4, La/wid0;->Q1:La/yzn0;

    .line 268
    .line 269
    sget-object v1, La/wid0;->S1:[La/iiy;

    .line 270
    .line 271
    const/4 v2, 0x1

    .line 272
    aget-object v1, v1, v2

    .line 273
    .line 274
    invoke-virtual {v0, v4, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, La/swp0;

    .line 279
    .line 280
    invoke-direct {v8, v0}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;-><init>(La/swp0;)V

    .line 281
    .line 282
    .line 283
    iget-object v9, p0, La/xid0;->a:La/mne;

    .line 284
    .line 285
    iget-object v10, p0, La/xid0;->b:La/duj;

    .line 286
    .line 287
    iget-object v11, p0, La/xid0;->c:La/rou;

    .line 288
    .line 289
    iget-object v7, p0, La/xid0;->d:La/ii;

    .line 290
    .line 291
    iget-object v12, p0, La/xid0;->e:La/m1e;

    .line 292
    .line 293
    iget-object v13, p0, La/xid0;->f:La/wdk0;

    .line 294
    .line 295
    iget-object v6, p0, La/xid0;->g:La/lef0;

    .line 296
    .line 297
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v5, La/rqi;

    .line 307
    .line 308
    invoke-direct/range {v5 .. v13}, La/rqi;-><init>(La/lef0;La/ii;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;La/mne;La/duj;La/rou;La/m1e;La/wdk0;)V

    .line 309
    .line 310
    .line 311
    move-object v3, v5

    .line 312
    goto :goto_4

    .line 313
    :cond_6
    const-string p0, "Cannot create dependency "

    .line 314
    .line 315
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :goto_4
    return-object v3

    .line 323
    :pswitch_5
    sget-object p0, La/wid0;->R1:La/jh70;

    .line 324
    .line 325
    new-instance p0, La/ry3;

    .line 326
    .line 327
    invoke-static {v4}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iget-object v1, v4, La/wid0;->K1:La/qqi;

    .line 332
    .line 333
    if-eqz v1, :cond_7

    .line 334
    .line 335
    invoke-direct {p0, v0, v1}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 336
    .line 337
    .line 338
    return-object p0

    .line 339
    :cond_7
    const-string p0, "viewModelFactory"

    .line 340
    .line 341
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v3

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
