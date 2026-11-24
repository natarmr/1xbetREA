.class public final synthetic La/w22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w22;->a:B

    iput-object p1, p0, La/w22;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w22;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/w22;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/r22;->a:La/r22;

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
    sget-object v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/p22;->a:La/p22;

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
    sget-object v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/i22;->a:La/i22;

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
    sget-object v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 54
    .line 55
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/l22;->a:La/l22;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_3
    new-instance v1, La/q0h0;

    .line 68
    .line 69
    iget-object v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->L1:La/x7i;

    .line 70
    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_0
    const-string v0, "viewModelFactory"

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v2

    .line 83
    :pswitch_4
    sget-object v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    instance-of v3, v1, La/af3;

    .line 97
    .line 98
    if-eqz v3, :cond_1

    .line 99
    .line 100
    check-cast v1, La/af3;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move-object v1, v2

    .line 104
    :goto_0
    const-class v3, La/y22;

    .line 105
    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/o5d0;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, La/ze3;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    move-object v1, v2

    .line 128
    :goto_1
    instance-of v4, v1, La/y22;

    .line 129
    .line 130
    if-nez v4, :cond_3

    .line 131
    .line 132
    move-object v1, v2

    .line 133
    :cond_3
    check-cast v1, La/y22;

    .line 134
    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 138
    .line 139
    .line 140
    move-result-object v19

    .line 141
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    sget-object v2, La/xnk0;->a:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-interface {v2}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;->getEventId()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v3, v3, La/cb50;->a:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v2, v3}, La/xnk0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v2}, La/xnk0;->c(Landroid/app/Application;Ljava/lang/String;)La/cui;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v5, v1, La/y22;->a:La/itr;

    .line 184
    .line 185
    iget-object v6, v1, La/y22;->e:La/zx10;

    .line 186
    .line 187
    iget-object v7, v1, La/y22;->c:La/cad;

    .line 188
    .line 189
    iget-object v0, v1, La/y22;->i:La/ctf0;

    .line 190
    .line 191
    iget-object v2, v1, La/y22;->j:La/j1q0;

    .line 192
    .line 193
    iget-object v3, v1, La/y22;->f:La/edo;

    .line 194
    .line 195
    iget-object v4, v1, La/y22;->b:La/aqp0;

    .line 196
    .line 197
    iget-object v8, v1, La/y22;->h:La/zfo;

    .line 198
    .line 199
    iget-object v9, v1, La/y22;->g:La/gst0;

    .line 200
    .line 201
    move-object v10, v8

    .line 202
    iget-object v8, v1, La/y22;->d:La/iip;

    .line 203
    .line 204
    iget-object v11, v1, La/y22;->l:La/duj;

    .line 205
    .line 206
    iget-object v12, v1, La/y22;->k:La/m1e;

    .line 207
    .line 208
    iget-object v14, v1, La/y22;->m:La/knf0;

    .line 209
    .line 210
    move-object/from16 v17, v0

    .line 211
    .line 212
    iget-object v0, v1, La/y22;->n:La/gii0;

    .line 213
    .line 214
    move-object/from16 v16, v0

    .line 215
    .line 216
    iget-object v0, v1, La/y22;->o:La/y78;

    .line 217
    .line 218
    move-object/from16 v20, v0

    .line 219
    .line 220
    iget-object v0, v1, La/y22;->z:La/r9u;

    .line 221
    .line 222
    move-object/from16 v18, v9

    .line 223
    .line 224
    iget-object v9, v1, La/y22;->p:La/iw20;

    .line 225
    .line 226
    move-object/from16 v21, v10

    .line 227
    .line 228
    iget-object v10, v1, La/y22;->q:La/roi0;

    .line 229
    .line 230
    move-object/from16 v22, v18

    .line 231
    .line 232
    move-object/from16 v18, v11

    .line 233
    .line 234
    iget-object v11, v1, La/y22;->r:La/ilp0;

    .line 235
    .line 236
    move-object/from16 v23, v0

    .line 237
    .line 238
    iget-object v0, v1, La/y22;->s:La/yo4;

    .line 239
    .line 240
    move-object/from16 v24, v16

    .line 241
    .line 242
    move-object/from16 v16, v12

    .line 243
    .line 244
    iget-object v12, v1, La/y22;->t:La/d1p;

    .line 245
    .line 246
    move-object/from16 v25, v0

    .line 247
    .line 248
    iget-object v0, v1, La/y22;->u:La/sjl0;

    .line 249
    .line 250
    move-object/from16 p0, v0

    .line 251
    .line 252
    iget-object v0, v1, La/y22;->v:La/btt0;

    .line 253
    .line 254
    move-object/from16 v26, v0

    .line 255
    .line 256
    iget-object v0, v1, La/y22;->w:La/b3c0;

    .line 257
    .line 258
    move-object/from16 v27, v14

    .line 259
    .line 260
    iget-object v14, v1, La/y22;->x:La/ugf0;

    .line 261
    .line 262
    move-object/from16 v28, v0

    .line 263
    .line 264
    iget-object v0, v1, La/y22;->y:La/wdk0;

    .line 265
    .line 266
    move-object/from16 v29, v0

    .line 267
    .line 268
    iget-object v0, v1, La/y22;->A:La/fsd;

    .line 269
    .line 270
    iget-object v1, v1, La/y22;->B:La/ewk;

    .line 271
    .line 272
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    new-instance v4, La/y7i;

    .line 330
    .line 331
    move-object/from16 v24, v0

    .line 332
    .line 333
    move-object/from16 v22, v23

    .line 334
    .line 335
    move-object/from16 v21, v25

    .line 336
    .line 337
    move-object/from16 v23, v29

    .line 338
    .line 339
    move-object/from16 v25, v1

    .line 340
    .line 341
    invoke-direct/range {v4 .. v25}, La/y7i;-><init>(La/itr;La/zx10;La/cad;La/iip;La/iw20;La/roi0;La/ilp0;La/d1p;La/cui;La/ugf0;Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;La/m1e;La/ctf0;La/duj;La/i1w0;La/y78;La/yo4;La/r9u;La/wdk0;La/fsd;La/ewk;)V

    .line 342
    .line 343
    .line 344
    move-object v2, v4

    .line 345
    goto :goto_2

    .line 346
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 347
    .line 348
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :goto_2
    return-object v2

    .line 356
    nop

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
