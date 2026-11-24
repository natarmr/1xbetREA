.class public final synthetic La/fcn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/icn0;


# direct methods
.method public synthetic constructor <init>(La/icn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fcn0;->a:B

    iput-object p1, p0, La/fcn0;->b:La/icn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fcn0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/fcn0;->b:La/icn0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/icn0;->W1:La/g9m0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v3, v1, La/af3;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    check-cast v1, La/af3;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v2

    .line 32
    :goto_0
    const-class v3, La/jcn0;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/o5d0;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/ze3;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v1, v2

    .line 56
    :goto_1
    instance-of v4, v1, La/jcn0;

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :cond_2
    check-cast v1, La/jcn0;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v5, v1, La/jcn0;->b:La/iip;

    .line 73
    .line 74
    iget-object v6, v1, La/jcn0;->c:La/a1d;

    .line 75
    .line 76
    iget-object v7, v1, La/jcn0;->d:La/bwl;

    .line 77
    .line 78
    iget-object v8, v1, La/jcn0;->e:La/fvt0;

    .line 79
    .line 80
    iget-object v10, v1, La/jcn0;->f:La/itr;

    .line 81
    .line 82
    iget-object v9, v1, La/jcn0;->a:La/ugf0;

    .line 83
    .line 84
    iget-object v11, v1, La/jcn0;->A:La/xri;

    .line 85
    .line 86
    iget-object v15, v1, La/jcn0;->g:La/rou;

    .line 87
    .line 88
    iget-object v0, v1, La/jcn0;->h:La/knf0;

    .line 89
    .line 90
    iget-object v2, v1, La/jcn0;->i:La/gii0;

    .line 91
    .line 92
    iget-object v3, v1, La/jcn0;->j:La/ctf0;

    .line 93
    .line 94
    iget-object v4, v1, La/jcn0;->k:La/y78;

    .line 95
    .line 96
    iget-object v12, v1, La/jcn0;->l:La/lbu;

    .line 97
    .line 98
    iget-object v13, v1, La/jcn0;->m:La/pru;

    .line 99
    .line 100
    move-object/from16 v16, v0

    .line 101
    .line 102
    iget-object v0, v1, La/jcn0;->n:La/m1e;

    .line 103
    .line 104
    move-object/from16 v22, v0

    .line 105
    .line 106
    iget-object v0, v1, La/jcn0;->o:La/mne;

    .line 107
    .line 108
    move-object/from16 v23, v0

    .line 109
    .line 110
    iget-object v0, v1, La/jcn0;->p:La/duj;

    .line 111
    .line 112
    move-object/from16 v24, v0

    .line 113
    .line 114
    iget-object v0, v1, La/jcn0;->q:La/ii;

    .line 115
    .line 116
    move-object/from16 v25, v0

    .line 117
    .line 118
    iget-object v0, v1, La/jcn0;->r:La/x4v;

    .line 119
    .line 120
    move-object/from16 v26, v0

    .line 121
    .line 122
    iget-object v0, v1, La/jcn0;->s:La/iqt;

    .line 123
    .line 124
    move-object/from16 v27, v0

    .line 125
    .line 126
    iget-object v0, v1, La/jcn0;->t:La/b4j;

    .line 127
    .line 128
    move-object/from16 v20, v12

    .line 129
    .line 130
    iget-object v12, v1, La/jcn0;->u:La/d1p;

    .line 131
    .line 132
    move-object/from16 v28, v0

    .line 133
    .line 134
    iget-object v0, v1, La/jcn0;->v:La/wdk0;

    .line 135
    .line 136
    move-object/from16 v21, v13

    .line 137
    .line 138
    iget-object v13, v1, La/jcn0;->w:La/lsn;

    .line 139
    .line 140
    move-object/from16 v17, v0

    .line 141
    .line 142
    iget-object v0, v1, La/jcn0;->x:La/wdu;

    .line 143
    .line 144
    move-object/from16 v29, v0

    .line 145
    .line 146
    iget-object v0, v1, La/jcn0;->y:La/sue;

    .line 147
    .line 148
    move-object/from16 v18, v0

    .line 149
    .line 150
    iget-object v0, v1, La/jcn0;->z:La/gst0;

    .line 151
    .line 152
    move-object/from16 v30, v0

    .line 153
    .line 154
    iget-object v0, v1, La/jcn0;->B:La/g2v;

    .line 155
    .line 156
    move-object/from16 v31, v0

    .line 157
    .line 158
    iget-object v0, v1, La/jcn0;->C:La/r9u;

    .line 159
    .line 160
    move-object/from16 v32, v0

    .line 161
    .line 162
    iget-object v0, v1, La/jcn0;->D:La/viu;

    .line 163
    .line 164
    move-object/from16 v33, v0

    .line 165
    .line 166
    iget-object v0, v1, La/jcn0;->E:La/bzt;

    .line 167
    .line 168
    move-object/from16 v34, v0

    .line 169
    .line 170
    iget-object v0, v1, La/jcn0;->F:La/kys0;

    .line 171
    .line 172
    iget-object v1, v1, La/jcn0;->G:La/lk5;

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-object/from16 v19, v4

    .line 214
    .line 215
    new-instance v4, La/gvi;

    .line 216
    .line 217
    move-object/from16 v35, v0

    .line 218
    .line 219
    move-object/from16 v36, v1

    .line 220
    .line 221
    move-object/from16 v17, v2

    .line 222
    .line 223
    move-object/from16 v18, v3

    .line 224
    .line 225
    invoke-direct/range {v4 .. v36}, La/gvi;-><init>(La/iip;La/a1d;La/bwl;La/fvt0;La/ugf0;La/itr;La/xri;La/d1p;La/lsn;La/i1w0;La/rou;La/knf0;La/gii0;La/ctf0;La/y78;La/lbu;La/pru;La/m1e;La/mne;La/duj;La/ii;La/x4v;La/iqt;La/b4j;La/wdu;La/gst0;La/g2v;La/r9u;La/viu;La/bzt;La/kys0;La/lk5;)V

    .line 226
    .line 227
    .line 228
    move-object v2, v4

    .line 229
    goto :goto_2

    .line 230
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 231
    .line 232
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_2
    return-object v2

    .line 240
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 241
    .line 242
    iget-object v0, v0, La/icn0;->P1:La/fvi;

    .line 243
    .line 244
    if-eqz v0, :cond_4

    .line 245
    .line 246
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 247
    .line 248
    .line 249
    return-object v1

    .line 250
    :cond_4
    const-string v0, "teamsViewModelFactory"

    .line 251
    .line 252
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v2

    .line 256
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 257
    .line 258
    iget-object v0, v0, La/icn0;->O1:La/evi;

    .line 259
    .line 260
    if-eqz v0, :cond_5

    .line 261
    .line 262
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 263
    .line 264
    .line 265
    return-object v1

    .line 266
    :cond_5
    const-string v0, "eventsViewModelFactory"

    .line 267
    .line 268
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v2

    .line 272
    :pswitch_2
    new-instance v1, La/q0h0;

    .line 273
    .line 274
    iget-object v0, v0, La/icn0;->N1:La/dvi;

    .line 275
    .line 276
    if-eqz v0, :cond_6

    .line 277
    .line 278
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 279
    .line 280
    .line 281
    return-object v1

    .line 282
    :cond_6
    const-string v0, "viewModelFactory"

    .line 283
    .line 284
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v2

    .line 288
    :pswitch_3
    sget-object v1, La/icn0;->W1:La/g9m0;

    .line 289
    .line 290
    invoke-virtual {v0}, La/icn0;->G0()La/k3t0;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    sget-object v1, La/bcn0;->a:La/bcn0;

    .line 295
    .line 296
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_4
    sget-object v1, La/icn0;->W1:La/g9m0;

    .line 303
    .line 304
    iget-object v0, v0, La/icn0;->S1:La/a8z;

    .line 305
    .line 306
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, La/k3t0;

    .line 311
    .line 312
    sget-object v1, La/ydn0;->a:La/ydn0;

    .line 313
    .line 314
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_5
    sget-object v1, La/icn0;->W1:La/g9m0;

    .line 321
    .line 322
    invoke-virtual {v0}, La/icn0;->H0()La/k3t0;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sget-object v1, La/wcn0;->a:La/wcn0;

    .line 327
    .line 328
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    nop

    .line 335
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
