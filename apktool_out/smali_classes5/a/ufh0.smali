.class public final synthetic La/ufh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xfh0;


# direct methods
.method public synthetic constructor <init>(La/xfh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ufh0;->a:B

    iput-object p1, p0, La/ufh0;->b:La/xfh0;

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
    iget-byte v1, v0, La/ufh0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ufh0;->b:La/xfh0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/xfh0;->V1:La/cge0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/xfh0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/ueh0;->a:La/ueh0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/xfh0;->V1:La/cge0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/xfh0;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/meh0;->a:La/meh0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget-object v1, La/xfh0;->V1:La/cge0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/xfh0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/peh0;->a:La/peh0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    iget-object v1, v0, La/xfh0;->S1:La/zz2;

    .line 54
    .line 55
    sget-object v3, La/xfh0;->V1:La/cge0;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v4, v3, La/af3;

    .line 69
    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    check-cast v3, La/af3;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move-object v3, v2

    .line 76
    :goto_0
    const-class v4, La/zeh0;

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, La/o5d0;

    .line 89
    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, La/ze3;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move-object v3, v2

    .line 100
    :goto_1
    instance-of v5, v3, La/zeh0;

    .line 101
    .line 102
    if-nez v5, :cond_2

    .line 103
    .line 104
    move-object v3, v2

    .line 105
    :cond_2
    check-cast v3, La/zeh0;

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    sget-object v2, La/xfh0;->W1:[La/iiy;

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    aget-object v5, v2, v4

    .line 117
    .line 118
    invoke-virtual {v1, v0, v5}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    sget-object v5, La/ifh0;->d:La/c0o;

    .line 123
    .line 124
    iget-object v6, v0, La/xfh0;->U1:La/zz2;

    .line 125
    .line 126
    const/4 v7, 0x2

    .line 127
    aget-object v7, v2, v7

    .line 128
    .line 129
    invoke-virtual {v6, v0, v7}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-virtual {v5, v6}, La/c0o;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    move-object/from16 v23, v5

    .line 142
    .line 143
    check-cast v23, La/ifh0;

    .line 144
    .line 145
    sget-object v5, La/xnk0;->a:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    aget-object v2, v2, v4

    .line 148
    .line 149
    invoke-virtual {v1, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, v2}, La/xnk0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, La/xnk0;->c(Landroid/app/Application;Ljava/lang/String;)La/cui;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v6, v3, La/zeh0;->n:La/itr;

    .line 189
    .line 190
    iget-object v7, v3, La/zeh0;->o:La/zx10;

    .line 191
    .line 192
    iget-object v8, v3, La/zeh0;->a:La/cad;

    .line 193
    .line 194
    iget-object v9, v3, La/zeh0;->b:La/d1p;

    .line 195
    .line 196
    iget-object v0, v3, La/zeh0;->c:La/yo4;

    .line 197
    .line 198
    iget-object v10, v3, La/zeh0;->d:La/iip;

    .line 199
    .line 200
    iget-object v1, v3, La/zeh0;->e:La/zfo;

    .line 201
    .line 202
    iget-object v2, v3, La/zeh0;->f:La/edo;

    .line 203
    .line 204
    iget-object v4, v3, La/zeh0;->g:La/sjl0;

    .line 205
    .line 206
    iget-object v5, v3, La/zeh0;->h:La/knf0;

    .line 207
    .line 208
    iget-object v11, v3, La/zeh0;->i:La/gii0;

    .line 209
    .line 210
    iget-object v13, v3, La/zeh0;->j:La/m1e;

    .line 211
    .line 212
    move-object/from16 v16, v0

    .line 213
    .line 214
    iget-object v0, v3, La/zeh0;->k:La/gst0;

    .line 215
    .line 216
    move-object/from16 v17, v0

    .line 217
    .line 218
    iget-object v0, v3, La/zeh0;->l:La/btt0;

    .line 219
    .line 220
    move-object/from16 v18, v0

    .line 221
    .line 222
    iget-object v0, v3, La/zeh0;->m:La/b3c0;

    .line 223
    .line 224
    move-object/from16 v19, v11

    .line 225
    .line 226
    iget-object v11, v3, La/zeh0;->p:La/iw20;

    .line 227
    .line 228
    move-object/from16 v20, v0

    .line 229
    .line 230
    iget-object v0, v3, La/zeh0;->q:La/y78;

    .line 231
    .line 232
    move-object/from16 v21, v0

    .line 233
    .line 234
    iget-object v0, v3, La/zeh0;->r:La/ctf0;

    .line 235
    .line 236
    move-object/from16 v22, v0

    .line 237
    .line 238
    iget-object v0, v3, La/zeh0;->s:La/j1q0;

    .line 239
    .line 240
    move-object/from16 v24, v0

    .line 241
    .line 242
    iget-object v0, v3, La/zeh0;->t:La/g2v;

    .line 243
    .line 244
    move-object/from16 v25, v18

    .line 245
    .line 246
    move-object/from16 v18, v13

    .line 247
    .line 248
    iget-object v13, v3, La/zeh0;->u:La/ugf0;

    .line 249
    .line 250
    move-object/from16 v26, v0

    .line 251
    .line 252
    iget-object v0, v3, La/zeh0;->v:La/wdk0;

    .line 253
    .line 254
    move-object/from16 p0, v0

    .line 255
    .line 256
    iget-object v0, v3, La/zeh0;->w:La/r9u;

    .line 257
    .line 258
    move-object/from16 v27, v0

    .line 259
    .line 260
    iget-object v0, v3, La/zeh0;->x:La/bzt;

    .line 261
    .line 262
    iget-object v3, v3, La/zeh0;->y:La/ewk;

    .line 263
    .line 264
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    new-instance v5, La/ssi;

    .line 316
    .line 317
    move-object/from16 v25, v0

    .line 318
    .line 319
    move-object/from16 v17, v4

    .line 320
    .line 321
    move-object/from16 v19, v21

    .line 322
    .line 323
    move-object/from16 v20, v22

    .line 324
    .line 325
    move-object/from16 v21, v26

    .line 326
    .line 327
    move-object/from16 v24, v27

    .line 328
    .line 329
    move-object/from16 v22, p0

    .line 330
    .line 331
    move-object/from16 v26, v3

    .line 332
    .line 333
    invoke-direct/range {v5 .. v26}, La/ssi;-><init>(La/itr;La/zx10;La/cad;La/d1p;La/iip;La/iw20;La/cui;La/ugf0;Ljava/lang/Integer;La/i1w0;La/yo4;La/sjl0;La/m1e;La/y78;La/ctf0;La/g2v;La/wdk0;La/ifh0;La/r9u;La/bzt;La/ewk;)V

    .line 334
    .line 335
    .line 336
    move-object v2, v5

    .line 337
    goto :goto_2

    .line 338
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 339
    .line 340
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    :goto_2
    return-object v2

    .line 348
    :pswitch_3
    new-instance v1, La/q0h0;

    .line 349
    .line 350
    iget-object v0, v0, La/xfh0;->M1:La/rsi;

    .line 351
    .line 352
    if-eqz v0, :cond_4

    .line 353
    .line 354
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 355
    .line 356
    .line 357
    return-object v1

    .line 358
    :cond_4
    const-string v0, "viewModelFactory"

    .line 359
    .line 360
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v2

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
