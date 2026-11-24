.class public final synthetic La/eaf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iaf0;


# direct methods
.method public synthetic constructor <init>(La/iaf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eaf0;->a:B

    iput-object p1, p0, La/eaf0;->b:La/iaf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eaf0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/eaf0;->b:La/iaf0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/r9f0;->a:La/r9f0;

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
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 26
    .line 27
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, La/s8f0;->a:La/s8f0;

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
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 43
    .line 44
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, La/f9f0;->a:La/f9f0;

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
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 60
    .line 61
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, La/v8f0;->a:La/v8f0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_3
    new-instance v1, La/q0h0;

    .line 74
    .line 75
    iget-object v0, v0, La/iaf0;->L1:La/ori;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_0
    const-string v0, "viewModelFactory"

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :pswitch_4
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    instance-of v3, v1, La/af3;

    .line 103
    .line 104
    if-eqz v3, :cond_1

    .line 105
    .line 106
    check-cast v1, La/af3;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    move-object v1, v2

    .line 110
    :goto_0
    const-class v3, La/jaf0;

    .line 111
    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/o5d0;

    .line 123
    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, La/ze3;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    move-object v1, v2

    .line 134
    :goto_1
    instance-of v4, v1, La/jaf0;

    .line 135
    .line 136
    if-nez v4, :cond_3

    .line 137
    .line 138
    move-object v1, v2

    .line 139
    :cond_3
    check-cast v1, La/jaf0;

    .line 140
    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 144
    .line 145
    .line 146
    move-result-object v41

    .line 147
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v10, v1, La/jaf0;->p:La/cyh;

    .line 151
    .line 152
    iget-object v0, v1, La/jaf0;->e:La/bzs0;

    .line 153
    .line 154
    iget-object v2, v1, La/jaf0;->d:La/yox;

    .line 155
    .line 156
    iget-object v3, v1, La/jaf0;->r:La/z4w0;

    .line 157
    .line 158
    iget-object v8, v1, La/jaf0;->b:La/cad;

    .line 159
    .line 160
    iget-object v4, v1, La/jaf0;->c:La/vue0;

    .line 161
    .line 162
    iget-object v5, v1, La/jaf0;->q:La/ii;

    .line 163
    .line 164
    iget-object v6, v1, La/jaf0;->s:La/lbu;

    .line 165
    .line 166
    iget-object v7, v1, La/jaf0;->t:La/lhf0;

    .line 167
    .line 168
    iget-object v9, v1, La/jaf0;->m:La/pru;

    .line 169
    .line 170
    iget-object v11, v1, La/jaf0;->o:La/b8u;

    .line 171
    .line 172
    iget-object v12, v1, La/jaf0;->n:La/ntu;

    .line 173
    .line 174
    iget-object v13, v1, La/jaf0;->u:La/ctf0;

    .line 175
    .line 176
    move-object/from16 v17, v11

    .line 177
    .line 178
    iget-object v11, v1, La/jaf0;->v:La/duj;

    .line 179
    .line 180
    iget-object v14, v1, La/jaf0;->j:La/pp90;

    .line 181
    .line 182
    iget-object v15, v1, La/jaf0;->k:La/lef0;

    .line 183
    .line 184
    move-object/from16 v40, v0

    .line 185
    .line 186
    iget-object v0, v1, La/jaf0;->l:La/wsf0;

    .line 187
    .line 188
    move-object/from16 v36, v0

    .line 189
    .line 190
    iget-object v0, v1, La/jaf0;->f:La/rl70;

    .line 191
    .line 192
    move-object/from16 v28, v0

    .line 193
    .line 194
    iget-object v0, v1, La/jaf0;->g:La/eke0;

    .line 195
    .line 196
    move-object/from16 v30, v0

    .line 197
    .line 198
    iget-object v0, v1, La/jaf0;->h:La/lme0;

    .line 199
    .line 200
    move-object/from16 v31, v0

    .line 201
    .line 202
    iget-object v0, v1, La/jaf0;->i:La/pek0;

    .line 203
    .line 204
    move-object/from16 v39, v0

    .line 205
    .line 206
    iget-object v0, v1, La/jaf0;->w:La/n4u;

    .line 207
    .line 208
    move-object/from16 v16, v0

    .line 209
    .line 210
    iget-object v0, v1, La/jaf0;->a:La/daf;

    .line 211
    .line 212
    invoke-virtual {v0}, La/daf;->h()La/xte0;

    .line 213
    .line 214
    .line 215
    move-result-object v32

    .line 216
    move-object/from16 v29, v14

    .line 217
    .line 218
    iget-object v14, v1, La/jaf0;->x:La/aqt;

    .line 219
    .line 220
    move-object/from16 v18, v6

    .line 221
    .line 222
    iget-object v6, v1, La/jaf0;->y:La/s64;

    .line 223
    .line 224
    move-object/from16 v35, v7

    .line 225
    .line 226
    iget-object v7, v1, La/jaf0;->A:La/gqc;

    .line 227
    .line 228
    iget-object v0, v1, La/jaf0;->B:La/wdk0;

    .line 229
    .line 230
    move-object/from16 v21, v9

    .line 231
    .line 232
    iget-object v9, v1, La/jaf0;->C:La/m1e;

    .line 233
    .line 234
    move-object/from16 v38, v0

    .line 235
    .line 236
    iget-object v0, v1, La/jaf0;->D:La/ieu;

    .line 237
    .line 238
    move-object/from16 v19, v0

    .line 239
    .line 240
    iget-object v0, v1, La/jaf0;->E:La/kd30;

    .line 241
    .line 242
    move-object/from16 v37, v13

    .line 243
    .line 244
    iget-object v13, v1, La/jaf0;->F:La/rpt;

    .line 245
    .line 246
    move-object/from16 v34, v15

    .line 247
    .line 248
    iget-object v15, v1, La/jaf0;->z:La/tqt;

    .line 249
    .line 250
    move-object/from16 v25, v0

    .line 251
    .line 252
    iget-object v0, v1, La/jaf0;->G:La/yox;

    .line 253
    .line 254
    move-object/from16 v22, v12

    .line 255
    .line 256
    iget-object v12, v1, La/jaf0;->H:La/sek;

    .line 257
    .line 258
    move-object/from16 v23, v0

    .line 259
    .line 260
    iget-object v0, v1, La/jaf0;->I:La/mi70;

    .line 261
    .line 262
    move-object/from16 v27, v0

    .line 263
    .line 264
    iget-object v0, v1, La/jaf0;->J:La/hru;

    .line 265
    .line 266
    iget-object v1, v1, La/jaf0;->K:La/nh70;

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-object/from16 v33, v4

    .line 290
    .line 291
    new-instance v4, La/pri;

    .line 292
    .line 293
    move-object/from16 v20, v0

    .line 294
    .line 295
    move-object/from16 v26, v1

    .line 296
    .line 297
    move-object/from16 v24, v2

    .line 298
    .line 299
    move-object/from16 v42, v3

    .line 300
    .line 301
    invoke-direct/range {v4 .. v42}, La/pri;-><init>(La/ii;La/s64;La/gqc;La/cad;La/m1e;La/cyh;La/duj;La/sek;La/rpt;La/aqt;La/tqt;La/n4u;La/b8u;La/lbu;La/ieu;La/hru;La/pru;La/ntu;La/yox;La/yox;La/kd30;La/nh70;La/mi70;La/rl70;La/pp90;La/eke0;La/lme0;La/xte0;La/vue0;La/lef0;La/lhf0;La/wsf0;La/ctf0;La/wdk0;La/pek0;La/bzs0;La/i1w0;La/z4w0;)V

    .line 302
    .line 303
    .line 304
    move-object v2, v4

    .line 305
    goto :goto_2

    .line 306
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 307
    .line 308
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :goto_2
    return-object v2

    .line 316
    :pswitch_5
    sget-object v1, La/iaf0;->Z1:La/zie0;

    .line 317
    .line 318
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    sget-object v2, La/e9f0;->a:La/e9f0;

    .line 326
    .line 327
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, La/iaf0;->H0()La/k3t0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sget-object v1, La/z8f0;->a:La/z8f0;

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
    nop

    .line 343
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
