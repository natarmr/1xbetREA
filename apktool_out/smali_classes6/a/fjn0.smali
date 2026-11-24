.class public final synthetic La/fjn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jjn0;


# direct methods
.method public synthetic constructor <init>(La/jjn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fjn0;->a:B

    iput-object p1, p0, La/fjn0;->b:La/jjn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fjn0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/fjn0;->b:La/jjn0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/jjn0;->S1:La/g9m0;

    .line 12
    .line 13
    new-instance v1, La/ejn0;

    .line 14
    .line 15
    new-instance v3, La/gjn0;

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    invoke-direct {v3, v0, v4}, La/gjn0;-><init>(La/jjn0;B)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/acm0;

    .line 25
    .line 26
    const/16 v4, 0xa

    .line 27
    .line 28
    invoke-direct {v0, v4}, La/acm0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    new-instance v4, La/t330;

    .line 32
    .line 33
    const/16 v5, 0xc

    .line 34
    .line 35
    invoke-direct {v4, v5}, La/t330;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v5, La/bjn0;

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    invoke-direct {v5, v3, v6}, La/bjn0;-><init>(La/gjn0;B)V

    .line 42
    .line 43
    .line 44
    sget-object v6, La/wjj0;->w:La/wjj0;

    .line 45
    .line 46
    new-instance v7, La/gbn;

    .line 47
    .line 48
    invoke-direct {v7, v0, v4, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 52
    .line 53
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/acm0;

    .line 57
    .line 58
    const/4 v5, 0x7

    .line 59
    invoke-direct {v4, v5}, La/acm0;-><init>(B)V

    .line 60
    .line 61
    .line 62
    new-instance v5, La/t330;

    .line 63
    .line 64
    const/16 v6, 0xb

    .line 65
    .line 66
    invoke-direct {v5, v6}, La/t330;-><init>(B)V

    .line 67
    .line 68
    .line 69
    new-instance v6, La/bjn0;

    .line 70
    .line 71
    invoke-direct {v6, v3, v2}, La/bjn0;-><init>(La/gjn0;B)V

    .line 72
    .line 73
    .line 74
    sget-object v2, La/wjj0;->t:La/wjj0;

    .line 75
    .line 76
    new-instance v3, La/gbn;

    .line 77
    .line 78
    invoke-direct {v3, v4, v5, v6, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_0
    sget-object v1, La/jjn0;->S1:La/g9m0;

    .line 86
    .line 87
    iget-object v0, v0, La/jjn0;->P1:La/a8z;

    .line 88
    .line 89
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/mvi;

    .line 94
    .line 95
    iget-object v0, v0, La/mvi;->v:La/n5d0;

    .line 96
    .line 97
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, La/lvi;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    sget-object v1, La/jjn0;->S1:La/g9m0;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    instance-of v3, v1, La/af3;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    if-eqz v3, :cond_0

    .line 121
    .line 122
    check-cast v1, La/af3;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    move-object v1, v4

    .line 126
    :goto_0
    const-class v3, La/kjn0;

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, La/o5d0;

    .line 139
    .line 140
    if-eqz v1, :cond_1

    .line 141
    .line 142
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, La/ze3;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    move-object v1, v4

    .line 150
    :goto_1
    instance-of v5, v1, La/kjn0;

    .line 151
    .line 152
    if-nez v5, :cond_2

    .line 153
    .line 154
    move-object v1, v4

    .line 155
    :cond_2
    check-cast v1, La/kjn0;

    .line 156
    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    iget-object v3, v0, La/jjn0;->L1:La/khf0;

    .line 164
    .line 165
    sget-object v4, La/jjn0;->U1:[La/iiy;

    .line 166
    .line 167
    aget-object v2, v4, v2

    .line 168
    .line 169
    invoke-virtual {v3, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move-object/from16 v25, v2

    .line 174
    .line 175
    check-cast v25, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 176
    .line 177
    iget-object v0, v0, La/jjn0;->N1:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v8, v1, La/kjn0;->b:La/e6e;

    .line 186
    .line 187
    iget-object v7, v1, La/kjn0;->a:La/tp9;

    .line 188
    .line 189
    iget-object v2, v1, La/kjn0;->n:La/ys70;

    .line 190
    .line 191
    iget-object v10, v1, La/kjn0;->h:La/gr70;

    .line 192
    .line 193
    iget-object v6, v1, La/kjn0;->c:La/mne;

    .line 194
    .line 195
    iget-object v14, v1, La/kjn0;->d:La/wdk0;

    .line 196
    .line 197
    iget-object v9, v1, La/kjn0;->e:La/iw20;

    .line 198
    .line 199
    iget-object v15, v1, La/kjn0;->f:La/iqt;

    .line 200
    .line 201
    iget-object v3, v1, La/kjn0;->g:La/s31;

    .line 202
    .line 203
    iget-object v4, v1, La/kjn0;->i:La/nmt0;

    .line 204
    .line 205
    iget-object v5, v1, La/kjn0;->j:La/ntu;

    .line 206
    .line 207
    iget-object v11, v1, La/kjn0;->k:La/ii;

    .line 208
    .line 209
    iget-object v13, v1, La/kjn0;->l:La/m1e;

    .line 210
    .line 211
    move-object/from16 v16, v11

    .line 212
    .line 213
    iget-object v11, v1, La/kjn0;->m:La/d1p;

    .line 214
    .line 215
    move-object/from16 v19, v13

    .line 216
    .line 217
    iget-object v13, v1, La/kjn0;->o:La/gle0;

    .line 218
    .line 219
    move-object/from16 v26, v0

    .line 220
    .line 221
    iget-object v0, v1, La/kjn0;->p:La/yfu;

    .line 222
    .line 223
    move-object/from16 v21, v0

    .line 224
    .line 225
    iget-object v0, v1, La/kjn0;->q:La/r9u;

    .line 226
    .line 227
    move-object/from16 v22, v0

    .line 228
    .line 229
    iget-object v0, v1, La/kjn0;->r:La/wgu;

    .line 230
    .line 231
    iget-object v1, v1, La/kjn0;->s:La/duj;

    .line 232
    .line 233
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-object/from16 v18, v5

    .line 264
    .line 265
    new-instance v5, La/mvi;

    .line 266
    .line 267
    move-object/from16 v23, v0

    .line 268
    .line 269
    move-object/from16 v24, v1

    .line 270
    .line 271
    move-object/from16 v20, v2

    .line 272
    .line 273
    move-object/from16 v16, v3

    .line 274
    .line 275
    move-object/from16 v17, v4

    .line 276
    .line 277
    invoke-direct/range {v5 .. v26}, La/mvi;-><init>(La/mne;La/tp9;La/e6e;La/iw20;La/gr70;La/d1p;La/i1w0;La/gle0;La/wdk0;La/iqt;La/s31;La/nmt0;La/ntu;La/m1e;La/ys70;La/yfu;La/r9u;La/wgu;La/duj;Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    move-object v4, v5

    .line 281
    goto :goto_2

    .line 282
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 283
    .line 284
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :goto_2
    return-object v4

    .line 292
    :pswitch_2
    sget-object v1, La/jjn0;->S1:La/g9m0;

    .line 293
    .line 294
    invoke-virtual {v0}, La/jjn0;->H0()La/mkn0;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/mkn0;->b:La/i1w0;

    .line 299
    .line 300
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    new-instance v3, La/c8d;

    .line 305
    .line 306
    sget-object v4, La/y7d;->a:La/v7d;

    .line 307
    .line 308
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 309
    .line 310
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    :goto_3
    move-object v2, v1

    .line 318
    check-cast v2, La/paw;

    .line 319
    .line 320
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_4

    .line 325
    .line 326
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, La/oe50;

    .line 331
    .line 332
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 333
    .line 334
    .line 335
    goto :goto_3

    .line 336
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
