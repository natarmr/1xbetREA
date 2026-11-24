.class public final synthetic La/d0p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i0p0;


# direct methods
.method public synthetic constructor <init>(La/i0p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d0p0;->a:B

    iput-object p1, p0, La/d0p0;->b:La/i0p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d0p0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/d0p0;->b:La/i0p0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/i0p0;->Z1:La/j6m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/i0p0;->I0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/bzo0;->a:La/bzo0;

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
    new-instance v1, La/q0h0;

    .line 26
    .line 27
    iget-object v0, v0, La/i0p0;->R1:La/fwi;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    const-string v0, "statisticsViewModelFactory"

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v2

    .line 41
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 42
    .line 43
    iget-object v0, v0, La/i0p0;->Q1:La/ewi;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    const-string v0, "eventsViewModelFactory"

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v2

    .line 57
    :pswitch_2
    new-instance v1, La/q0h0;

    .line 58
    .line 59
    iget-object v0, v0, La/i0p0;->P1:La/dwi;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_2
    const-string v0, "containerViewModelFactory"

    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2

    .line 73
    :pswitch_3
    sget-object v1, La/i0p0;->Z1:La/j6m0;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    instance-of v3, v1, La/af3;

    .line 87
    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    check-cast v1, La/af3;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    move-object v1, v2

    .line 94
    :goto_0
    const-class v3, La/j0p0;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/o5d0;

    .line 107
    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, La/ze3;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move-object v1, v2

    .line 118
    :goto_1
    instance-of v4, v1, La/j0p0;

    .line 119
    .line 120
    if-nez v4, :cond_5

    .line 121
    .line 122
    move-object v1, v2

    .line 123
    :cond_5
    check-cast v1, La/j0p0;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    iget-object v2, v0, La/i0p0;->M1:La/khf0;

    .line 128
    .line 129
    sget-object v3, La/i0p0;->a2:[La/iiy;

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    aget-object v3, v3, v4

    .line 133
    .line 134
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object v13, v2

    .line 139
    check-cast v13, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 140
    .line 141
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v5, v1, La/j0p0;->c:La/sue;

    .line 149
    .line 150
    iget-object v6, v1, La/j0p0;->a:La/bwl;

    .line 151
    .line 152
    iget-object v7, v1, La/j0p0;->b:La/a1d;

    .line 153
    .line 154
    iget-object v8, v1, La/j0p0;->d:La/itr;

    .line 155
    .line 156
    iget-object v9, v1, La/j0p0;->e:La/lsn;

    .line 157
    .line 158
    iget-object v10, v1, La/j0p0;->f:La/vqc;

    .line 159
    .line 160
    iget-object v0, v1, La/j0p0;->g:La/xri;

    .line 161
    .line 162
    iget-object v4, v1, La/j0p0;->h:La/roi0;

    .line 163
    .line 164
    iget-object v11, v1, La/j0p0;->i:La/ugf0;

    .line 165
    .line 166
    iget-object v12, v1, La/j0p0;->j:La/iip;

    .line 167
    .line 168
    iget-object v15, v1, La/j0p0;->k:La/y78;

    .line 169
    .line 170
    iget-object v2, v1, La/j0p0;->l:La/gii0;

    .line 171
    .line 172
    iget-object v3, v1, La/j0p0;->u:La/viu;

    .line 173
    .line 174
    move-object/from16 v16, v0

    .line 175
    .line 176
    iget-object v0, v1, La/j0p0;->m:La/knf0;

    .line 177
    .line 178
    move-object/from16 v18, v0

    .line 179
    .line 180
    iget-object v0, v1, La/j0p0;->n:La/x2c0;

    .line 181
    .line 182
    move-object/from16 v19, v0

    .line 183
    .line 184
    iget-object v0, v1, La/j0p0;->o:La/gst0;

    .line 185
    .line 186
    move-object/from16 v20, v0

    .line 187
    .line 188
    iget-object v0, v1, La/j0p0;->p:La/rtu;

    .line 189
    .line 190
    move-object/from16 v21, v0

    .line 191
    .line 192
    iget-object v0, v1, La/j0p0;->q:La/ieu;

    .line 193
    .line 194
    move-object/from16 v22, v0

    .line 195
    .line 196
    iget-object v0, v1, La/j0p0;->r:La/pru;

    .line 197
    .line 198
    move-object/from16 v23, v0

    .line 199
    .line 200
    iget-object v0, v1, La/j0p0;->s:La/lbu;

    .line 201
    .line 202
    move-object/from16 v24, v0

    .line 203
    .line 204
    iget-object v0, v1, La/j0p0;->t:La/r9u;

    .line 205
    .line 206
    move-object/from16 v25, v0

    .line 207
    .line 208
    iget-object v0, v1, La/j0p0;->v:La/lk5;

    .line 209
    .line 210
    move-object/from16 v26, v0

    .line 211
    .line 212
    iget-object v0, v1, La/j0p0;->w:La/g2v;

    .line 213
    .line 214
    move-object/from16 v27, v0

    .line 215
    .line 216
    iget-object v0, v1, La/j0p0;->x:La/mne;

    .line 217
    .line 218
    move-object/from16 v28, v0

    .line 219
    .line 220
    iget-object v0, v1, La/j0p0;->y:La/m1e;

    .line 221
    .line 222
    move-object/from16 v29, v0

    .line 223
    .line 224
    iget-object v0, v1, La/j0p0;->z:La/ctf0;

    .line 225
    .line 226
    move-object/from16 v30, v0

    .line 227
    .line 228
    iget-object v0, v1, La/j0p0;->A:La/duj;

    .line 229
    .line 230
    move-object/from16 v31, v0

    .line 231
    .line 232
    iget-object v0, v1, La/j0p0;->B:La/wdk0;

    .line 233
    .line 234
    iget-object v1, v1, La/j0p0;->C:La/ii;

    .line 235
    .line 236
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-object/from16 v16, v3

    .line 276
    .line 277
    new-instance v3, La/gwi;

    .line 278
    .line 279
    move-object/from16 v32, v0

    .line 280
    .line 281
    move-object/from16 v33, v1

    .line 282
    .line 283
    move-object/from16 v17, v2

    .line 284
    .line 285
    invoke-direct/range {v3 .. v33}, La/gwi;-><init>(La/roi0;La/sue;La/bwl;La/a1d;La/itr;La/lsn;La/vqc;La/ugf0;La/iip;Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;La/i1w0;La/y78;La/viu;La/gii0;La/knf0;La/x2c0;La/gst0;La/rtu;La/ieu;La/pru;La/lbu;La/r9u;La/lk5;La/g2v;La/mne;La/m1e;La/ctf0;La/duj;La/wdk0;La/ii;)V

    .line 286
    .line 287
    .line 288
    move-object v2, v3

    .line 289
    goto :goto_2

    .line 290
    :cond_6
    const-string v0, "Cannot create dependency "

    .line 291
    .line 292
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :goto_2
    return-object v2

    .line 300
    :pswitch_4
    sget-object v1, La/i0p0;->Z1:La/j6m0;

    .line 301
    .line 302
    iget-object v0, v0, La/i0p0;->W1:La/a8z;

    .line 303
    .line 304
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, La/k3t0;

    .line 309
    .line 310
    sget-object v1, La/eyo0;->a:La/eyo0;

    .line 311
    .line 312
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
