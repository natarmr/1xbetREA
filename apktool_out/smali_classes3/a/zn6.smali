.class public final synthetic La/zn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fo6;


# direct methods
.method public synthetic constructor <init>(La/fo6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zn6;->a:B

    iput-object p1, p0, La/zn6;->b:La/fo6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zn6;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/zn6;->b:La/fo6;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 14
    .line 15
    invoke-virtual {v5}, La/fo6;->H0()La/po6;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/po6;->E:La/i1w0;

    .line 20
    .line 21
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, La/c8d;

    .line 26
    .line 27
    sget-object v4, La/y7d;->a:La/v7d;

    .line 28
    .line 29
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 30
    .line 31
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    move-object v2, v1

    .line 39
    check-cast v2, La/paw;

    .line 40
    .line 41
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/oe50;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 61
    .line 62
    invoke-virtual {v5}, La/fo6;->H0()La/po6;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, v0, La/po6;->Q:Ljava/lang/Long;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    invoke-virtual {v0, v2, v5, v6}, La/po6;->z(ZJ)V

    .line 75
    .line 76
    .line 77
    :cond_1
    iput-object v4, v0, La/po6;->Q:Ljava/lang/Long;

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 83
    .line 84
    new-instance v1, La/xv6;

    .line 85
    .line 86
    new-instance v5, La/pw4;

    .line 87
    .line 88
    iget-object v0, v0, La/zn6;->b:La/fo6;

    .line 89
    .line 90
    invoke-virtual {v0}, La/fo6;->H0()La/po6;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v12, 0x5

    .line 96
    const/4 v6, 0x0

    .line 97
    const-class v16, La/po6;

    .line 98
    .line 99
    const-string v9, "onTeamsHeaderClicked"

    .line 100
    .line 101
    const-string v10, "onTeamsHeaderClicked()V"

    .line 102
    .line 103
    move-object/from16 v8, v16

    .line 104
    .line 105
    invoke-direct/range {v5 .. v12}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 106
    .line 107
    .line 108
    new-instance v6, La/yj5;

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/16 v13, 0xa

    .line 112
    .line 113
    const/4 v7, 0x1

    .line 114
    const-class v9, La/fo6;

    .line 115
    .line 116
    const-string v10, "showSelectActionDialog"

    .line 117
    .line 118
    const-string v11, "showSelectActionDialog(Lorg/xplatform/bet_constructor/impl/core/domain/models/PlayerModel;)V"

    .line 119
    .line 120
    move-object v8, v0

    .line 121
    invoke-direct/range {v6 .. v13}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 122
    .line 123
    .line 124
    new-instance v13, La/yj5;

    .line 125
    .line 126
    invoke-virtual {v8}, La/fo6;->H0()La/po6;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    const/16 v20, 0xb

    .line 133
    .line 134
    const/4 v14, 0x1

    .line 135
    const-string v17, "onBetHeaderClick"

    .line 136
    .line 137
    const-string v18, "onBetHeaderClick(J)V"

    .line 138
    .line 139
    invoke-direct/range {v13 .. v20}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 140
    .line 141
    .line 142
    new-instance v0, La/ao6;

    .line 143
    .line 144
    invoke-direct {v0, v8, v2}, La/ao6;-><init>(La/fo6;B)V

    .line 145
    .line 146
    .line 147
    new-instance v2, La/bo6;

    .line 148
    .line 149
    const/4 v7, 0x2

    .line 150
    invoke-direct {v2, v8, v7}, La/bo6;-><init>(La/fo6;B)V

    .line 151
    .line 152
    .line 153
    iget-object v7, v8, La/fo6;->O1:La/z7z;

    .line 154
    .line 155
    if-eqz v7, :cond_2

    .line 156
    .line 157
    invoke-interface {v7}, La/z7z;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    check-cast v4, La/ctf0;

    .line 165
    .line 166
    sget-object v7, La/xv6;->f:La/ek5;

    .line 167
    .line 168
    invoke-direct {v1, v7}, La/zz3;-><init>(La/dtb;)V

    .line 169
    .line 170
    .line 171
    new-instance v7, La/zgp0;

    .line 172
    .line 173
    const/16 v8, 0xb

    .line 174
    .line 175
    invoke-direct {v7, v8}, La/zgp0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    new-instance v9, La/kpp0;

    .line 179
    .line 180
    invoke-direct {v9, v5, v3}, La/kpp0;-><init>(La/pw4;B)V

    .line 181
    .line 182
    .line 183
    new-instance v3, La/asj0;

    .line 184
    .line 185
    const/16 v5, 0x1c

    .line 186
    .line 187
    const/4 v10, 0x3

    .line 188
    invoke-direct {v3, v10, v5}, La/asj0;-><init>(IB)V

    .line 189
    .line 190
    .line 191
    sget-object v5, La/pfo0;->g:La/pfo0;

    .line 192
    .line 193
    new-instance v11, La/gbn;

    .line 194
    .line 195
    invoke-direct {v11, v7, v3, v9, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    iget-object v3, v1, La/zz3;->d:La/dp;

    .line 199
    .line 200
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 201
    .line 202
    .line 203
    new-instance v5, La/zgp0;

    .line 204
    .line 205
    const/16 v7, 0xc

    .line 206
    .line 207
    invoke-direct {v5, v7}, La/zgp0;-><init>(B)V

    .line 208
    .line 209
    .line 210
    new-instance v7, La/nop0;

    .line 211
    .line 212
    invoke-direct {v7, v6, v10}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    new-instance v6, La/asj0;

    .line 216
    .line 217
    const/16 v9, 0x1d

    .line 218
    .line 219
    invoke-direct {v6, v10, v9}, La/asj0;-><init>(IB)V

    .line 220
    .line 221
    .line 222
    sget-object v9, La/pfo0;->h:La/pfo0;

    .line 223
    .line 224
    new-instance v11, La/gbn;

    .line 225
    .line 226
    invoke-direct {v11, v5, v6, v7, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 230
    .line 231
    .line 232
    new-instance v5, La/os6;

    .line 233
    .line 234
    const/4 v6, 0x7

    .line 235
    invoke-direct {v5, v6}, La/os6;-><init>(B)V

    .line 236
    .line 237
    .line 238
    new-instance v7, La/os5;

    .line 239
    .line 240
    const/16 v9, 0xf

    .line 241
    .line 242
    invoke-direct {v7, v13, v9}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    new-instance v9, La/lq4;

    .line 246
    .line 247
    const/16 v11, 0x9

    .line 248
    .line 249
    invoke-direct {v9, v10, v11}, La/lq4;-><init>(IB)V

    .line 250
    .line 251
    .line 252
    sget-object v11, La/zx3;->s:La/zx3;

    .line 253
    .line 254
    new-instance v12, La/gbn;

    .line 255
    .line 256
    invoke-direct {v12, v5, v9, v7, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3, v12}, La/dp;->b(La/gbn;)V

    .line 260
    .line 261
    .line 262
    new-instance v5, La/i87;

    .line 263
    .line 264
    const/4 v7, 0x6

    .line 265
    invoke-direct {v5, v7}, La/i87;-><init>(B)V

    .line 266
    .line 267
    .line 268
    new-instance v7, La/os5;

    .line 269
    .line 270
    const/16 v9, 0x15

    .line 271
    .line 272
    invoke-direct {v7, v0, v9}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 273
    .line 274
    .line 275
    new-instance v9, La/lq4;

    .line 276
    .line 277
    invoke-direct {v9, v10, v8}, La/lq4;-><init>(IB)V

    .line 278
    .line 279
    .line 280
    sget-object v8, La/zx3;->u:La/zx3;

    .line 281
    .line 282
    new-instance v11, La/gbn;

    .line 283
    .line 284
    invoke-direct {v11, v5, v9, v7, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 288
    .line 289
    .line 290
    const v5, 0x7f0606d8

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v5}, La/ctf0;->a(I)I

    .line 294
    .line 295
    .line 296
    move-result v16

    .line 297
    const v5, 0x7f040ae1

    .line 298
    .line 299
    .line 300
    invoke-static {v5, v4}, La/ctf0;->b(ILa/ctf0;)I

    .line 301
    .line 302
    .line 303
    move-result v17

    .line 304
    new-instance v4, La/gh5;

    .line 305
    .line 306
    const/16 v5, 0xa

    .line 307
    .line 308
    invoke-direct {v4, v5}, La/gh5;-><init>(B)V

    .line 309
    .line 310
    .line 311
    new-instance v14, La/xc6;

    .line 312
    .line 313
    const/4 v15, 0x0

    .line 314
    move-object/from16 v18, v0

    .line 315
    .line 316
    move-object/from16 v19, v2

    .line 317
    .line 318
    invoke-direct/range {v14 .. v19}, La/xc6;-><init>(BIILjava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    new-instance v0, La/lq4;

    .line 322
    .line 323
    invoke-direct {v0, v10, v6}, La/lq4;-><init>(IB)V

    .line 324
    .line 325
    .line 326
    sget-object v2, La/zx3;->q:La/zx3;

    .line 327
    .line 328
    new-instance v5, La/gbn;

    .line 329
    .line 330
    invoke-direct {v5, v4, v0, v14, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v5}, La/dp;->b(La/gbn;)V

    .line 334
    .line 335
    .line 336
    return-object v1

    .line 337
    :cond_2
    const-string v0, "resourceManager"

    .line 338
    .line 339
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v4

    .line 343
    :pswitch_2
    iget-object v0, v5, La/fo6;->K1:La/fiu0;

    .line 344
    .line 345
    if-eqz v0, :cond_3

    .line 346
    .line 347
    return-object v0

    .line 348
    :cond_3
    const-string v0, "viewModelFactory"

    .line 349
    .line 350
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v4

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
