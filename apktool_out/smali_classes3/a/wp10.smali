.class public final synthetic La/wp10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zp10;


# direct methods
.method public synthetic constructor <init>(La/zp10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wp10;->a:B

    iput-object p1, p0, La/wp10;->b:La/zp10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wp10;->a:B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/wp10;->b:La/zp10;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/zp10;->U1:La/htz;

    .line 15
    .line 16
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, v0, La/vq10;->z:La/c4m0;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0, v4}, La/vq10;->x(Z)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    sget-object v1, La/zp10;->U1:La/htz;

    .line 34
    .line 35
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, v0, La/vq10;->v:La/p7m0;

    .line 40
    .line 41
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    instance-of v6, v5, La/jq10;

    .line 46
    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    check-cast v5, La/jq10;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v5, v3

    .line 53
    :goto_0
    if-eqz v5, :cond_4

    .line 54
    .line 55
    iget-object v5, v5, La/jq10;->a:Ljava/util/List;

    .line 56
    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_3

    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    instance-of v8, v7, La/cr10;

    .line 79
    .line 80
    if-eqz v8, :cond_2

    .line 81
    .line 82
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    move-object v7, v5

    .line 91
    check-cast v7, La/kq10;

    .line 92
    .line 93
    sget-object v7, La/iq10;->a:La/iq10;

    .line 94
    .line 95
    invoke-virtual {v1, v5, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    new-instance v1, La/tq10;

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    invoke-direct {v1, v0, v3, v5}, La/tq10;-><init>(La/vq10;La/yje;B)V

    .line 105
    .line 106
    .line 107
    new-instance v5, La/vsg0;

    .line 108
    .line 109
    invoke-direct {v5, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    new-instance v1, La/tq10;

    .line 113
    .line 114
    invoke-direct {v1, v0, v3, v4}, La/tq10;-><init>(La/vq10;La/yje;B)V

    .line 115
    .line 116
    .line 117
    new-instance v7, La/fnq;

    .line 118
    .line 119
    const/4 v8, 0x4

    .line 120
    invoke-direct {v7, v5, v1, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 121
    .line 122
    .line 123
    new-instance v1, La/rf0;

    .line 124
    .line 125
    const/4 v5, 0x6

    .line 126
    invoke-direct {v1, v7, v5}, La/rf0;-><init>(La/fnq;B)V

    .line 127
    .line 128
    .line 129
    new-instance v5, La/mt00;

    .line 130
    .line 131
    invoke-direct {v5, v6, v0, v3}, La/mt00;-><init>(Ljava/util/ArrayList;La/vq10;La/yje;)V

    .line 132
    .line 133
    .line 134
    new-instance v6, La/fnq;

    .line 135
    .line 136
    invoke-direct {v6, v1, v5, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 137
    .line 138
    .line 139
    new-instance v1, La/qos;

    .line 140
    .line 141
    invoke-direct {v1, v0, v3, v2}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 142
    .line 143
    .line 144
    new-instance v2, La/dnq;

    .line 145
    .line 146
    invoke-direct {v2, v6, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v3, v0, La/vq10;->m:La/mne;

    .line 154
    .line 155
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 156
    .line 157
    invoke-static {v1, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v2, v1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iput-object v1, v0, La/vq10;->z:La/c4m0;

    .line 166
    .line 167
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_1
    sget-object v1, La/zp10;->U1:La/htz;

    .line 171
    .line 172
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, La/vq10;->y()V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_2
    sget-object v1, La/zp10;->U1:La/htz;

    .line 183
    .line 184
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, La/vq10;->y()V

    .line 189
    .line 190
    .line 191
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_3
    sget-object v1, La/zp10;->U1:La/htz;

    .line 195
    .line 196
    new-instance v1, La/vp10;

    .line 197
    .line 198
    new-instance v3, La/pf10;

    .line 199
    .line 200
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    const/4 v9, 0x0

    .line 205
    const/16 v10, 0x10

    .line 206
    .line 207
    const/4 v4, 0x1

    .line 208
    const-class v6, La/vq10;

    .line 209
    .line 210
    const-string v7, "onActivationItemClicked"

    .line 211
    .line 212
    const-string v8, "onActivationItemClicked(Lorg/xplatform/mailing/impl/presentation/mailingmanagment/model/ActivationUiModel;)V"

    .line 213
    .line 214
    invoke-direct/range {v3 .. v10}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 215
    .line 216
    .line 217
    new-instance v11, La/e000;

    .line 218
    .line 219
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0xb

    .line 226
    .line 227
    const/4 v12, 0x2

    .line 228
    const-string v15, "onMailingSettingsItemClicked"

    .line 229
    .line 230
    const-string v16, "onMailingSettingsItemClicked(Lorg/xplatform/mailing/impl/presentation/mailingmanagment/model/MailingSettingsUiModel;Z)V"

    .line 231
    .line 232
    move-object v14, v6

    .line 233
    invoke-direct/range {v11 .. v18}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 234
    .line 235
    .line 236
    sget-object v0, La/ek5;->e:La/ek5;

    .line 237
    .line 238
    invoke-direct {v1, v0}, La/zz3;-><init>(La/dtb;)V

    .line 239
    .line 240
    .line 241
    new-instance v0, La/hhd;

    .line 242
    .line 243
    const/16 v4, 0x17

    .line 244
    .line 245
    invoke-direct {v0, v4}, La/hhd;-><init>(B)V

    .line 246
    .line 247
    .line 248
    new-instance v4, La/t1;

    .line 249
    .line 250
    invoke-direct {v4, v3, v2}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 251
    .line 252
    .line 253
    new-instance v2, La/l9;

    .line 254
    .line 255
    const/16 v3, 0xf

    .line 256
    .line 257
    const/4 v5, 0x3

    .line 258
    invoke-direct {v2, v5, v3}, La/l9;-><init>(IB)V

    .line 259
    .line 260
    .line 261
    sget-object v3, La/m9;->q:La/m9;

    .line 262
    .line 263
    new-instance v6, La/gbn;

    .line 264
    .line 265
    invoke-direct {v6, v0, v2, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 266
    .line 267
    .line 268
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 269
    .line 270
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 271
    .line 272
    .line 273
    new-instance v2, La/gm10;

    .line 274
    .line 275
    invoke-direct {v2, v5}, La/gm10;-><init>(B)V

    .line 276
    .line 277
    .line 278
    new-instance v3, La/km00;

    .line 279
    .line 280
    const/16 v4, 0x8

    .line 281
    .line 282
    invoke-direct {v3, v11, v4}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    new-instance v4, La/tvx;

    .line 286
    .line 287
    const/16 v6, 0x11

    .line 288
    .line 289
    invoke-direct {v4, v5, v6}, La/tvx;-><init>(IB)V

    .line 290
    .line 291
    .line 292
    sget-object v6, La/gvy;->s:La/gvy;

    .line 293
    .line 294
    new-instance v7, La/gbn;

    .line 295
    .line 296
    invoke-direct {v7, v2, v4, v3, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 300
    .line 301
    .line 302
    new-instance v2, La/hhd;

    .line 303
    .line 304
    const/16 v3, 0x16

    .line 305
    .line 306
    invoke-direct {v2, v3}, La/hhd;-><init>(B)V

    .line 307
    .line 308
    .line 309
    new-instance v3, La/b5;

    .line 310
    .line 311
    const/4 v4, 0x7

    .line 312
    invoke-direct {v3, v4}, La/b5;-><init>(B)V

    .line 313
    .line 314
    .line 315
    new-instance v4, La/l9;

    .line 316
    .line 317
    const/16 v6, 0xe

    .line 318
    .line 319
    invoke-direct {v4, v5, v6}, La/l9;-><init>(IB)V

    .line 320
    .line 321
    .line 322
    sget-object v5, La/m9;->p:La/m9;

    .line 323
    .line 324
    new-instance v6, La/gbn;

    .line 325
    .line 326
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 330
    .line 331
    .line 332
    return-object v1

    .line 333
    :pswitch_4
    sget-object v1, La/zp10;->U1:La/htz;

    .line 334
    .line 335
    new-instance v1, La/ry3;

    .line 336
    .line 337
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iget-object v0, v0, La/zp10;->M1:La/qki;

    .line 342
    .line 343
    if-eqz v0, :cond_5

    .line 344
    .line 345
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 346
    .line 347
    .line 348
    return-object v1

    .line 349
    :cond_5
    const-string v0, "viewModelFactory"

    .line 350
    .line 351
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v3

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
