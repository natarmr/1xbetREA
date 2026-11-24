.class public final synthetic La/s8x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v8x;


# direct methods
.method public synthetic constructor <init>(La/v8x;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s8x;->a:B

    iput-object p1, p0, La/s8x;->b:La/v8x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/s8x;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/s8x;->b:La/v8x;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/v8x;->U1:La/gst;

    .line 12
    .line 13
    invoke-virtual {v0}, La/v8x;->H0()La/tax;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/tax;->b:La/i1w0;

    .line 18
    .line 19
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v3, La/c8d;

    .line 24
    .line 25
    sget-object v4, La/y7d;->a:La/v7d;

    .line 26
    .line 27
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 28
    .line 29
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    move-object v2, v1

    .line 37
    check-cast v2, La/paw;

    .line 38
    .line 39
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, La/oe50;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    sget-object v1, La/v8x;->U1:La/gst;

    .line 59
    .line 60
    new-instance v1, La/h9x;

    .line 61
    .line 62
    new-instance v3, La/adw;

    .line 63
    .line 64
    const/16 v4, 0xb

    .line 65
    .line 66
    invoke-direct {v3, v0, v4}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/v1x;

    .line 73
    .line 74
    const/16 v4, 0x9

    .line 75
    .line 76
    invoke-direct {v0, v4}, La/v1x;-><init>(B)V

    .line 77
    .line 78
    .line 79
    new-instance v4, La/thd;

    .line 80
    .line 81
    const/16 v5, 0x1b

    .line 82
    .line 83
    invoke-direct {v4, v5}, La/thd;-><init>(B)V

    .line 84
    .line 85
    .line 86
    new-instance v5, La/y8x;

    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    invoke-direct {v5, v3, v6}, La/y8x;-><init>(La/adw;B)V

    .line 90
    .line 91
    .line 92
    sget-object v6, La/btv;->A:La/btv;

    .line 93
    .line 94
    new-instance v7, La/gbn;

    .line 95
    .line 96
    invoke-direct {v7, v0, v4, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 100
    .line 101
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 102
    .line 103
    .line 104
    new-instance v4, La/v1x;

    .line 105
    .line 106
    const/16 v5, 0x8

    .line 107
    .line 108
    invoke-direct {v4, v5}, La/v1x;-><init>(B)V

    .line 109
    .line 110
    .line 111
    new-instance v5, La/thd;

    .line 112
    .line 113
    const/16 v6, 0x1a

    .line 114
    .line 115
    invoke-direct {v5, v6}, La/thd;-><init>(B)V

    .line 116
    .line 117
    .line 118
    new-instance v6, La/y8x;

    .line 119
    .line 120
    invoke-direct {v6, v3, v2}, La/y8x;-><init>(La/adw;B)V

    .line 121
    .line 122
    .line 123
    sget-object v2, La/btv;->z:La/btv;

    .line 124
    .line 125
    new-instance v3, La/gbn;

    .line 126
    .line 127
    invoke-direct {v3, v4, v5, v6, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :pswitch_1
    sget-object v1, La/v8x;->U1:La/gst;

    .line 135
    .line 136
    iget-object v0, v0, La/v8x;->P1:La/a8z;

    .line 137
    .line 138
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/bji;

    .line 143
    .line 144
    iget-object v0, v0, La/bji;->v:La/n5d0;

    .line 145
    .line 146
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/aji;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_2
    sget-object v1, La/v8x;->U1:La/gst;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    instance-of v2, v1, La/af3;

    .line 167
    .line 168
    const/4 v3, 0x0

    .line 169
    if-eqz v2, :cond_1

    .line 170
    .line 171
    check-cast v1, La/af3;

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_1
    move-object v1, v3

    .line 175
    :goto_1
    const-class v2, La/w8x;

    .line 176
    .line 177
    if-eqz v1, :cond_4

    .line 178
    .line 179
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, La/o5d0;

    .line 188
    .line 189
    if-eqz v1, :cond_2

    .line 190
    .line 191
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, La/ze3;

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_2
    move-object v1, v3

    .line 199
    :goto_2
    instance-of v4, v1, La/w8x;

    .line 200
    .line 201
    if-nez v4, :cond_3

    .line 202
    .line 203
    move-object v1, v3

    .line 204
    :cond_3
    check-cast v1, La/w8x;

    .line 205
    .line 206
    if-eqz v1, :cond_4

    .line 207
    .line 208
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    iget-object v2, v0, La/v8x;->N1:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 219
    .line 220
    .line 221
    move-result-object v26

    .line 222
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v5, v1, La/w8x;->a:La/mne;

    .line 232
    .line 233
    iget-object v12, v1, La/w8x;->b:La/wdk0;

    .line 234
    .line 235
    iget-object v13, v1, La/w8x;->c:La/b8u;

    .line 236
    .line 237
    iget-object v14, v1, La/w8x;->d:La/u58;

    .line 238
    .line 239
    iget-object v6, v1, La/w8x;->e:La/zx10;

    .line 240
    .line 241
    iget-object v15, v1, La/w8x;->f:La/lbu;

    .line 242
    .line 243
    iget-object v0, v1, La/w8x;->g:La/pru;

    .line 244
    .line 245
    iget-object v3, v1, La/w8x;->h:La/aqt;

    .line 246
    .line 247
    iget-object v4, v1, La/w8x;->i:La/nv20;

    .line 248
    .line 249
    iget-object v7, v1, La/w8x;->j:La/db9;

    .line 250
    .line 251
    iget-object v8, v1, La/w8x;->k:La/edu;

    .line 252
    .line 253
    iget-object v9, v1, La/w8x;->l:La/m1e;

    .line 254
    .line 255
    move-object/from16 v19, v7

    .line 256
    .line 257
    iget-object v7, v1, La/w8x;->m:La/v6k;

    .line 258
    .line 259
    move-object/from16 v20, v8

    .line 260
    .line 261
    iget-object v8, v1, La/w8x;->n:La/zx10;

    .line 262
    .line 263
    move-object/from16 v21, v9

    .line 264
    .line 265
    iget-object v9, v1, La/w8x;->o:La/d1p;

    .line 266
    .line 267
    iget-object v10, v1, La/w8x;->p:La/gle0;

    .line 268
    .line 269
    move-object/from16 v16, v0

    .line 270
    .line 271
    iget-object v0, v1, La/w8x;->q:La/bzs0;

    .line 272
    .line 273
    move-object/from16 v23, v0

    .line 274
    .line 275
    iget-object v0, v1, La/w8x;->r:La/yox;

    .line 276
    .line 277
    move-object/from16 v22, v10

    .line 278
    .line 279
    iget-object v10, v1, La/w8x;->s:La/wxs0;

    .line 280
    .line 281
    iget-object v1, v1, La/w8x;->t:La/gst0;

    .line 282
    .line 283
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-object/from16 v18, v4

    .line 299
    .line 300
    new-instance v4, La/bji;

    .line 301
    .line 302
    move-object/from16 v24, v0

    .line 303
    .line 304
    move-object/from16 v27, v1

    .line 305
    .line 306
    move-object/from16 v25, v2

    .line 307
    .line 308
    move-object/from16 v17, v3

    .line 309
    .line 310
    invoke-direct/range {v4 .. v27}, La/bji;-><init>(La/mne;La/zx10;La/v6k;La/zx10;La/d1p;La/wxs0;La/i1w0;La/wdk0;La/b8u;La/u58;La/lbu;La/pru;La/aqt;La/nv20;La/db9;La/edu;La/m1e;La/gle0;La/bzs0;La/yox;Ljava/lang/String;Ljava/io/File;La/gst0;)V

    .line 311
    .line 312
    .line 313
    move-object v3, v4

    .line 314
    goto :goto_3

    .line 315
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 316
    .line 317
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :goto_3
    return-object v3

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
