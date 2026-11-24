.class public final synthetic La/kaf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oaf;


# direct methods
.method public synthetic constructor <init>(La/oaf;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kaf;->a:B

    iput-object p1, p0, La/kaf;->b:La/oaf;

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
    iget-byte v1, v0, La/kaf;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/kaf;->b:La/oaf;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/oaf;->Q1:La/nwd;

    .line 13
    .line 14
    iget-object v0, v4, La/oaf;->M1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/odi;

    .line 21
    .line 22
    iget-object v0, v0, La/odi;->p:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/ndi;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    sget-object v0, La/oaf;->Q1:La/nwd;

    .line 32
    .line 33
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    instance-of v1, v0, La/af3;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    check-cast v0, La/af3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v3

    .line 52
    :goto_0
    const-class v1, La/jaf;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/o5d0;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/ze3;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v0, v3

    .line 76
    :goto_1
    instance-of v2, v0, La/jaf;

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    move-object v0, v3

    .line 81
    :cond_2
    check-cast v0, La/jaf;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-static {v4}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iget-object v1, v4, La/oaf;->P1:La/yzn0;

    .line 90
    .line 91
    sget-object v2, La/oaf;->R1:[La/iiy;

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    aget-object v2, v2, v3

    .line 95
    .line 96
    invoke-virtual {v1, v4, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v8, v1

    .line 101
    check-cast v8, La/paf;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v6, v0, La/jaf;->a:La/lef0;

    .line 107
    .line 108
    iget-object v9, v0, La/jaf;->b:La/rjo;

    .line 109
    .line 110
    iget-object v10, v0, La/jaf;->c:La/jh70;

    .line 111
    .line 112
    iget-object v11, v0, La/jaf;->d:La/mne;

    .line 113
    .line 114
    iget-object v12, v0, La/jaf;->e:La/duj;

    .line 115
    .line 116
    iget-object v13, v0, La/jaf;->i:La/m1e;

    .line 117
    .line 118
    iget-object v14, v0, La/jaf;->j:La/rou;

    .line 119
    .line 120
    iget-object v15, v0, La/jaf;->k:La/ii;

    .line 121
    .line 122
    iget-object v1, v0, La/jaf;->f:La/wdk0;

    .line 123
    .line 124
    iget-object v2, v0, La/jaf;->g:La/knf0;

    .line 125
    .line 126
    iget-object v3, v0, La/jaf;->h:La/gii0;

    .line 127
    .line 128
    iget-object v4, v0, La/jaf;->l:La/at4;

    .line 129
    .line 130
    iget-object v5, v0, La/jaf;->m:La/btt0;

    .line 131
    .line 132
    move-object/from16 v16, v1

    .line 133
    .line 134
    iget-object v1, v0, La/jaf;->n:La/nr;

    .line 135
    .line 136
    move-object/from16 v17, v1

    .line 137
    .line 138
    iget-object v1, v0, La/jaf;->o:La/s64;

    .line 139
    .line 140
    move-object/from16 v18, v1

    .line 141
    .line 142
    iget-object v1, v0, La/jaf;->p:La/mi70;

    .line 143
    .line 144
    iget-object v0, v0, La/jaf;->q:La/qud;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v5, La/odi;

    .line 168
    .line 169
    move-object/from16 v20, v0

    .line 170
    .line 171
    move-object/from16 v19, v1

    .line 172
    .line 173
    invoke-direct/range {v5 .. v20}, La/odi;-><init>(La/lef0;La/i1w0;La/paf;La/rjo;La/jh70;La/mne;La/duj;La/m1e;La/rou;La/ii;La/wdk0;La/nr;La/s64;La/mi70;La/qud;)V

    .line 174
    .line 175
    .line 176
    move-object v3, v5

    .line 177
    goto :goto_2

    .line 178
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 179
    .line 180
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_2
    return-object v3

    .line 188
    :pswitch_1
    sget-object v1, La/oaf;->Q1:La/nwd;

    .line 189
    .line 190
    iget-object v4, v0, La/kaf;->b:La/oaf;

    .line 191
    .line 192
    iget-object v0, v4, La/oaf;->M1:La/a8z;

    .line 193
    .line 194
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, La/odi;

    .line 199
    .line 200
    iget-object v2, v0, La/odi;->n:La/wdk0;

    .line 201
    .line 202
    new-instance v3, La/xdk0;

    .line 203
    .line 204
    sget-object v6, La/rek0;->b:La/rek0;

    .line 205
    .line 206
    const v0, 0x7f130dca

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const/4 v11, 0x0

    .line 217
    const/16 v12, 0x7c

    .line 218
    .line 219
    const/4 v8, 0x0

    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v10, 0x0

    .line 222
    move-object v5, v3

    .line 223
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 224
    .line 225
    .line 226
    const/16 v9, 0x3fc

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    const/4 v6, 0x0

    .line 230
    const/4 v7, 0x0

    .line 231
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 232
    .line 233
    .line 234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_2
    sget-object v0, La/oaf;->Q1:La/nwd;

    .line 238
    .line 239
    invoke-virtual {v4}, La/oaf;->H0()La/lbf;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v4}, La/oaf;->G0()La/qzq;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    iget-object v1, v1, La/qzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 248
    .line 249
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-boolean v4, v0, La/lbf;->v:Z

    .line 258
    .line 259
    if-nez v4, :cond_4

    .line 260
    .line 261
    iget-object v0, v0, La/lbf;->r:La/ol60;

    .line 262
    .line 263
    sget-object v1, La/taf;->a:La/taf;

    .line 264
    .line 265
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_4
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    iget-object v5, v0, La/lbf;->d:La/mne;

    .line 274
    .line 275
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 276
    .line 277
    new-instance v6, La/qaf;

    .line 278
    .line 279
    invoke-direct {v6, v0, v2}, La/qaf;-><init>(La/lbf;B)V

    .line 280
    .line 281
    .line 282
    move-object v2, v4

    .line 283
    new-instance v4, La/jwd;

    .line 284
    .line 285
    const/16 v7, 0xf

    .line 286
    .line 287
    invoke-direct {v4, v0, v7}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 288
    .line 289
    .line 290
    move-object v7, v6

    .line 291
    new-instance v6, La/xb2;

    .line 292
    .line 293
    const/16 v8, 0xb

    .line 294
    .line 295
    invoke-direct {v6, v0, v1, v3, v8}, La/xb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 296
    .line 297
    .line 298
    move-object v3, v7

    .line 299
    const/16 v7, 0x8

    .line 300
    .line 301
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 302
    .line 303
    .line 304
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_3
    sget-object v0, La/oaf;->Q1:La/nwd;

    .line 308
    .line 309
    invoke-virtual {v4}, La/oaf;->H0()La/lbf;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v0, v0, La/lbf;->h:La/i1w0;

    .line 314
    .line 315
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    new-instance v3, La/c8d;

    .line 320
    .line 321
    sget-object v4, La/y7d;->a:La/v7d;

    .line 322
    .line 323
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 324
    .line 325
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    :goto_4
    move-object v2, v1

    .line 333
    check-cast v2, La/paw;

    .line 334
    .line 335
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_5

    .line 340
    .line 341
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    check-cast v2, La/oe50;

    .line 346
    .line 347
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object v0

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
