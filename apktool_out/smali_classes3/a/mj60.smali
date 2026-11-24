.class public final synthetic La/mj60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oj60;


# direct methods
.method public synthetic constructor <init>(La/oj60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mj60;->a:B

    iput-object p1, p0, La/mj60;->b:La/oj60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mj60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/mj60;->b:La/oj60;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {v0}, La/oj60;->G0()La/hl60;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v3}, La/hl60;->z(Z)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 25
    .line 26
    invoke-virtual {v0}, La/oj60;->G0()La/hl60;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, v0, La/hl60;->d:La/yo4;

    .line 31
    .line 32
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 33
    .line 34
    const-string v3, "authenticator_phone_alert_click"

    .line 35
    .line 36
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, La/hl60;->e:La/s64;

    .line 40
    .line 41
    iget-object v1, v1, La/s64;->a:La/s1p;

    .line 42
    .line 43
    const-wide/16 v3, 0xd0c

    .line 44
    .line 45
    sget-object v5, La/xun;->a:La/xun;

    .line 46
    .line 47
    invoke-virtual {v1, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, La/hl60;->n:La/i1w0;

    .line 51
    .line 52
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v3, La/c8d;

    .line 57
    .line 58
    sget-object v4, La/y7d;->a:La/v7d;

    .line 59
    .line 60
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 61
    .line 62
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    move-object v2, v1

    .line 70
    check-cast v2, La/paw;

    .line 71
    .line 72
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, La/oe50;

    .line 83
    .line 84
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 92
    .line 93
    invoke-virtual {v0}, La/oj60;->G0()La/hl60;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v1, v0, La/hl60;->r:La/ik4;

    .line 98
    .line 99
    iget-object v1, v1, La/ik4;->a:La/s1p;

    .line 100
    .line 101
    new-instance v4, La/j1p;

    .line 102
    .line 103
    const-string v5, "authenticator"

    .line 104
    .line 105
    invoke-direct {v4, v5, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 106
    .line 107
    .line 108
    new-instance v6, La/j1p;

    .line 109
    .line 110
    const-string v7, "authenticator_allert"

    .line 111
    .line 112
    invoke-direct {v6, v7, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 113
    .line 114
    .line 115
    const/4 v8, 0x2

    .line 116
    new-array v9, v8, [La/k1p;

    .line 117
    .line 118
    aput-object v4, v9, v2

    .line 119
    .line 120
    aput-object v6, v9, v3

    .line 121
    .line 122
    invoke-static {v9}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-wide/16 v3, 0xc9f

    .line 127
    .line 128
    invoke-virtual {v1, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v0, La/hl60;->s:La/vd1;

    .line 132
    .line 133
    iget-object v1, v1, La/vd1;->a:La/kt2;

    .line 134
    .line 135
    new-instance v2, Lkotlin/Pair;

    .line 136
    .line 137
    const-string v3, "screen"

    .line 138
    .line 139
    invoke-direct {v2, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance v3, Lkotlin/Pair;

    .line 143
    .line 144
    const-string v4, "element"

    .line 145
    .line 146
    invoke-direct {v3, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    filled-new-array {v2, v3}, [Lkotlin/Pair;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const-string v3, "acc_add_phone_call"

    .line 158
    .line 159
    invoke-interface {v1, v3, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v0, La/hl60;->n:La/i1w0;

    .line 163
    .line 164
    new-instance v2, La/yk60;

    .line 165
    .line 166
    invoke-direct {v2, v0, v8}, La/yk60;-><init>(La/hl60;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_2
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 176
    .line 177
    invoke-virtual {v0}, La/oj60;->G0()La/hl60;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, v3}, La/hl60;->y(Z)V

    .line 182
    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_3
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 188
    .line 189
    iget-object v0, v0, La/oj60;->M1:La/a8z;

    .line 190
    .line 191
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, La/imi;

    .line 196
    .line 197
    iget-object v0, v0, La/imi;->p:La/n5d0;

    .line 198
    .line 199
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/hmi;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_4
    sget-object v1, La/oj60;->P1:[La/iiy;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    instance-of v2, v1, La/af3;

    .line 220
    .line 221
    const/4 v4, 0x0

    .line 222
    if-eqz v2, :cond_1

    .line 223
    .line 224
    check-cast v1, La/af3;

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_1
    move-object v1, v4

    .line 228
    :goto_1
    const-class v2, La/pj60;

    .line 229
    .line 230
    if-eqz v1, :cond_4

    .line 231
    .line 232
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, La/o5d0;

    .line 241
    .line 242
    if-eqz v1, :cond_2

    .line 243
    .line 244
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, La/ze3;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_2
    move-object v1, v4

    .line 252
    :goto_2
    instance-of v5, v1, La/pj60;

    .line 253
    .line 254
    if-nez v5, :cond_3

    .line 255
    .line 256
    move-object v1, v4

    .line 257
    :cond_3
    check-cast v1, La/pj60;

    .line 258
    .line 259
    if-eqz v1, :cond_4

    .line 260
    .line 261
    iget-object v2, v0, La/oj60;->O1:La/cgx0;

    .line 262
    .line 263
    sget-object v4, La/oj60;->P1:[La/iiy;

    .line 264
    .line 265
    aget-object v3, v4, v3

    .line 266
    .line 267
    invoke-virtual {v2, v0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v16

    .line 271
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 272
    .line 273
    .line 274
    move-result-object v17

    .line 275
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v5, v1, La/pj60;->a:La/d1p;

    .line 279
    .line 280
    iget-object v13, v1, La/pj60;->d:La/duj;

    .line 281
    .line 282
    iget-object v9, v1, La/pj60;->b:La/ctf0;

    .line 283
    .line 284
    iget-object v10, v1, La/pj60;->h:La/uyu;

    .line 285
    .line 286
    iget-object v11, v1, La/pj60;->i:La/z4w0;

    .line 287
    .line 288
    iget-object v0, v1, La/pj60;->f:La/m1e;

    .line 289
    .line 290
    iget-object v6, v1, La/pj60;->j:La/mne;

    .line 291
    .line 292
    iget-object v7, v1, La/pj60;->k:La/sp4;

    .line 293
    .line 294
    iget-object v8, v1, La/pj60;->g:La/rou;

    .line 295
    .line 296
    iget-object v14, v1, La/pj60;->e:La/kt2;

    .line 297
    .line 298
    iget-object v12, v1, La/pj60;->c:La/gst0;

    .line 299
    .line 300
    iget-object v15, v1, La/pj60;->l:La/ii;

    .line 301
    .line 302
    iget-object v2, v1, La/pj60;->m:La/wdk0;

    .line 303
    .line 304
    iget-object v3, v1, La/pj60;->n:La/zn00;

    .line 305
    .line 306
    iget-object v1, v1, La/pj60;->o:La/mi70;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    new-instance v4, La/imi;

    .line 330
    .line 331
    move-object/from16 v19, v1

    .line 332
    .line 333
    move-object/from16 v18, v3

    .line 334
    .line 335
    invoke-direct/range {v4 .. v19}, La/imi;-><init>(La/d1p;La/mne;La/sp4;La/rou;La/ctf0;La/uyu;La/z4w0;La/gst0;La/duj;La/kt2;La/ii;Ljava/lang/Boolean;La/i1w0;La/zn00;La/mi70;)V

    .line 336
    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 340
    .line 341
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :goto_3
    return-object v4

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
