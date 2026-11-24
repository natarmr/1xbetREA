.class public final synthetic La/zwe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dxe0;


# direct methods
.method public synthetic constructor <init>(La/dxe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zwe0;->a:B

    iput-object p1, p0, La/zwe0;->b:La/dxe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zwe0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/zwe0;->b:La/dxe0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/gwe0;->a:La/gwe0;

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
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 26
    .line 27
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, La/fve0;->a:La/fve0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 43
    .line 44
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, La/sve0;->a:La/sve0;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_2
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    instance-of v3, v1, La/af3;

    .line 73
    .line 74
    if-eqz v3, :cond_0

    .line 75
    .line 76
    check-cast v1, La/af3;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v1, v2

    .line 80
    :goto_0
    const-class v3, La/v1f0;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, La/o5d0;

    .line 93
    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, La/ze3;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move-object v1, v2

    .line 104
    :goto_1
    instance-of v4, v1, La/v1f0;

    .line 105
    .line 106
    if-nez v4, :cond_2

    .line 107
    .line 108
    move-object v1, v2

    .line 109
    :cond_2
    check-cast v1, La/v1f0;

    .line 110
    .line 111
    if-eqz v1, :cond_3

    .line 112
    .line 113
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 114
    .line 115
    .line 116
    move-result-object v27

    .line 117
    iget-object v2, v0, La/dxe0;->V1:La/khf0;

    .line 118
    .line 119
    sget-object v3, La/dxe0;->Z1:[La/iiy;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    aget-object v3, v3, v4

    .line 123
    .line 124
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v15, v0

    .line 129
    check-cast v15, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 130
    .line 131
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v0, v1, La/v1f0;->o:La/cyh;

    .line 135
    .line 136
    iget-object v12, v1, La/v1f0;->e:La/bzs0;

    .line 137
    .line 138
    iget-object v13, v1, La/v1f0;->d:La/yox;

    .line 139
    .line 140
    iget-object v2, v1, La/v1f0;->q:La/z4w0;

    .line 141
    .line 142
    iget-object v5, v1, La/v1f0;->b:La/cad;

    .line 143
    .line 144
    iget-object v6, v1, La/v1f0;->c:La/vue0;

    .line 145
    .line 146
    iget-object v14, v1, La/v1f0;->p:La/ii;

    .line 147
    .line 148
    iget-object v3, v1, La/v1f0;->s:La/lbu;

    .line 149
    .line 150
    iget-object v4, v1, La/v1f0;->t:La/lhf0;

    .line 151
    .line 152
    iget-object v7, v1, La/v1f0;->l:La/pru;

    .line 153
    .line 154
    iget-object v8, v1, La/v1f0;->n:La/b8u;

    .line 155
    .line 156
    iget-object v9, v1, La/v1f0;->m:La/ntu;

    .line 157
    .line 158
    iget-object v10, v1, La/v1f0;->r:La/g2v;

    .line 159
    .line 160
    iget-object v11, v1, La/v1f0;->u:La/ctf0;

    .line 161
    .line 162
    move-object/from16 v24, v0

    .line 163
    .line 164
    iget-object v0, v1, La/v1f0;->v:La/duj;

    .line 165
    .line 166
    move-object/from16 v21, v7

    .line 167
    .line 168
    iget-object v7, v1, La/v1f0;->i:La/pp90;

    .line 169
    .line 170
    move-object/from16 v22, v8

    .line 171
    .line 172
    iget-object v8, v1, La/v1f0;->j:La/lef0;

    .line 173
    .line 174
    move-object/from16 v23, v9

    .line 175
    .line 176
    iget-object v9, v1, La/v1f0;->k:La/wsf0;

    .line 177
    .line 178
    move-object/from16 v29, v0

    .line 179
    .line 180
    iget-object v0, v1, La/v1f0;->f:La/rl70;

    .line 181
    .line 182
    move-object/from16 v18, v0

    .line 183
    .line 184
    iget-object v0, v1, La/v1f0;->g:La/lme0;

    .line 185
    .line 186
    move-object/from16 v19, v0

    .line 187
    .line 188
    iget-object v0, v1, La/v1f0;->h:La/pek0;

    .line 189
    .line 190
    move-object/from16 v20, v0

    .line 191
    .line 192
    iget-object v0, v1, La/v1f0;->w:La/n4u;

    .line 193
    .line 194
    move-object/from16 v30, v0

    .line 195
    .line 196
    iget-object v0, v1, La/v1f0;->x:La/aqt;

    .line 197
    .line 198
    move-object/from16 v32, v0

    .line 199
    .line 200
    iget-object v0, v1, La/v1f0;->y:La/s64;

    .line 201
    .line 202
    move-object/from16 v33, v0

    .line 203
    .line 204
    iget-object v0, v1, La/v1f0;->A:La/gqc;

    .line 205
    .line 206
    move-object/from16 v34, v0

    .line 207
    .line 208
    iget-object v0, v1, La/v1f0;->B:La/wdk0;

    .line 209
    .line 210
    move-object/from16 v35, v0

    .line 211
    .line 212
    iget-object v0, v1, La/v1f0;->C:La/m1e;

    .line 213
    .line 214
    move-object/from16 v36, v0

    .line 215
    .line 216
    iget-object v0, v1, La/v1f0;->D:La/ieu;

    .line 217
    .line 218
    move-object/from16 v37, v0

    .line 219
    .line 220
    iget-object v0, v1, La/v1f0;->E:La/kd30;

    .line 221
    .line 222
    move-object/from16 v38, v0

    .line 223
    .line 224
    iget-object v0, v1, La/v1f0;->F:La/rpt;

    .line 225
    .line 226
    move-object/from16 v39, v0

    .line 227
    .line 228
    iget-object v0, v1, La/v1f0;->z:La/tqt;

    .line 229
    .line 230
    move-object/from16 v26, v10

    .line 231
    .line 232
    iget-object v10, v1, La/v1f0;->G:La/yox;

    .line 233
    .line 234
    move-object/from16 v40, v0

    .line 235
    .line 236
    iget-object v0, v1, La/v1f0;->H:La/sek;

    .line 237
    .line 238
    move-object/from16 v41, v0

    .line 239
    .line 240
    iget-object v0, v1, La/v1f0;->I:La/mi70;

    .line 241
    .line 242
    move-object/from16 v28, v11

    .line 243
    .line 244
    iget-object v11, v1, La/v1f0;->J:La/hru;

    .line 245
    .line 246
    move-object/from16 v42, v0

    .line 247
    .line 248
    iget-object v0, v1, La/v1f0;->a:La/daf;

    .line 249
    .line 250
    invoke-virtual {v0}, La/daf;->h()La/xte0;

    .line 251
    .line 252
    .line 253
    move-result-object v31

    .line 254
    iget-object v0, v1, La/v1f0;->K:La/nh70;

    .line 255
    .line 256
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-object/from16 v17, v4

    .line 278
    .line 279
    new-instance v4, La/iri;

    .line 280
    .line 281
    move-object/from16 v43, v0

    .line 282
    .line 283
    move-object/from16 v25, v2

    .line 284
    .line 285
    move-object/from16 v16, v3

    .line 286
    .line 287
    invoke-direct/range {v4 .. v43}, La/iri;-><init>(La/cad;La/vue0;La/pp90;La/lef0;La/wsf0;La/yox;La/hru;La/bzs0;La/yox;La/ii;Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;La/lbu;La/lhf0;La/rl70;La/lme0;La/pek0;La/pru;La/b8u;La/ntu;La/cyh;La/z4w0;La/g2v;La/i1w0;La/ctf0;La/duj;La/n4u;La/xte0;La/aqt;La/s64;La/gqc;La/wdk0;La/m1e;La/ieu;La/kd30;La/rpt;La/tqt;La/sek;La/mi70;La/nh70;)V

    .line 288
    .line 289
    .line 290
    move-object v2, v4

    .line 291
    goto :goto_2

    .line 292
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 293
    .line 294
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :goto_2
    return-object v2

    .line 302
    :pswitch_3
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 303
    .line 304
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    sget-object v1, La/ive0;->a:La/ive0;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_4
    sget-object v1, La/dxe0;->Y1:La/lme0;

    .line 317
    .line 318
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    sget-object v2, La/rve0;->a:La/rve0;

    .line 326
    .line 327
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, La/dxe0;->G0()La/k3t0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sget-object v1, La/mve0;->a:La/mve0;

    .line 335
    .line 336
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_5
    new-instance v1, La/q0h0;

    .line 343
    .line 344
    iget-object v0, v0, La/dxe0;->L1:La/hri;

    .line 345
    .line 346
    if-eqz v0, :cond_4

    .line 347
    .line 348
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 349
    .line 350
    .line 351
    return-object v1

    .line 352
    :cond_4
    const-string v0, "viewModelFactory"

    .line 353
    .line 354
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v2

    .line 358
    nop

    .line 359
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
