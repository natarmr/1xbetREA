.class public final synthetic La/yqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/crk;


# direct methods
.method public synthetic constructor <init>(La/crk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yqk;->a:B

    iput-object p1, p0, La/yqk;->b:La/crk;

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
    iget-byte v1, v0, La/yqk;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/yqk;->b:La/crk;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/crk;->W1:La/xak;

    .line 12
    .line 13
    invoke-virtual {v0}, La/crk;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/mok;->a:La/mok;

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
    sget-object v1, La/crk;->W1:La/xak;

    .line 26
    .line 27
    invoke-virtual {v0}, La/crk;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/nok;->a:La/nok;

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
    new-instance v1, La/q0h0;

    .line 40
    .line 41
    iget-object v0, v0, La/crk;->K1:La/qei;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    const-string v0, "viewModelFactory"

    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v2

    .line 55
    :pswitch_2
    sget-object v1, La/crk;->W1:La/xak;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v3, v1, La/af3;

    .line 69
    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    check-cast v1, La/af3;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v2

    .line 76
    :goto_0
    const-class v3, La/qyg;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/o5d0;

    .line 89
    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/ze3;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move-object v1, v2

    .line 100
    :goto_1
    instance-of v4, v1, La/qyg;

    .line 101
    .line 102
    if-nez v4, :cond_3

    .line 103
    .line 104
    move-object v1, v2

    .line 105
    :cond_3
    check-cast v1, La/qyg;

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    iget-object v2, v0, La/crk;->P1:La/khf0;

    .line 110
    .line 111
    sget-object v3, La/crk;->X1:[La/iiy;

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    aget-object v3, v3, v4

    .line 115
    .line 116
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v15, v0

    .line 121
    check-cast v15, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 122
    .line 123
    iget-object v13, v1, La/qyg;->a:La/duj;

    .line 124
    .line 125
    iget-object v3, v1, La/qyg;->d:La/cad;

    .line 126
    .line 127
    iget-object v12, v1, La/qyg;->e:La/gii0;

    .line 128
    .line 129
    iget-object v14, v1, La/qyg;->c:La/oeg0;

    .line 130
    .line 131
    iget-object v0, v1, La/qyg;->f:La/kt2;

    .line 132
    .line 133
    iget-object v2, v1, La/qyg;->g:La/m1e;

    .line 134
    .line 135
    iget-object v4, v1, La/qyg;->h:La/g2v;

    .line 136
    .line 137
    iget-object v5, v1, La/qyg;->i:La/pyg;

    .line 138
    .line 139
    iget-object v6, v1, La/qyg;->j:La/xri;

    .line 140
    .line 141
    iget-object v8, v1, La/qyg;->n:La/iip;

    .line 142
    .line 143
    iget-object v9, v1, La/qyg;->o:La/lsn;

    .line 144
    .line 145
    iget-object v7, v1, La/qyg;->k:La/n660;

    .line 146
    .line 147
    move-object/from16 v19, v7

    .line 148
    .line 149
    iget-object v7, v1, La/qyg;->l:La/itr;

    .line 150
    .line 151
    iget-object v10, v1, La/qyg;->m:La/y78;

    .line 152
    .line 153
    move-object/from16 v20, v10

    .line 154
    .line 155
    iget-object v10, v1, La/qyg;->p:La/vqc;

    .line 156
    .line 157
    iget-object v11, v1, La/qyg;->q:La/lbu;

    .line 158
    .line 159
    move-object/from16 v16, v0

    .line 160
    .line 161
    iget-object v0, v1, La/qyg;->r:La/ctf0;

    .line 162
    .line 163
    move-object/from16 v22, v0

    .line 164
    .line 165
    iget-object v0, v1, La/qyg;->s:La/pru;

    .line 166
    .line 167
    move-object/from16 v18, v4

    .line 168
    .line 169
    iget-object v4, v1, La/qyg;->b:La/ugf0;

    .line 170
    .line 171
    move-object/from16 v23, v0

    .line 172
    .line 173
    iget-object v0, v1, La/qyg;->t:La/sjl0;

    .line 174
    .line 175
    move-object/from16 v24, v0

    .line 176
    .line 177
    iget-object v0, v1, La/qyg;->u:La/wdk0;

    .line 178
    .line 179
    move-object/from16 v25, v0

    .line 180
    .line 181
    iget-object v0, v1, La/qyg;->v:La/rtu;

    .line 182
    .line 183
    move-object/from16 v26, v0

    .line 184
    .line 185
    iget-object v0, v1, La/qyg;->w:La/pmi;

    .line 186
    .line 187
    move-object/from16 v27, v0

    .line 188
    .line 189
    iget-object v0, v1, La/qyg;->x:La/r9u;

    .line 190
    .line 191
    move-object/from16 v28, v0

    .line 192
    .line 193
    iget-object v0, v1, La/qyg;->y:La/zr1;

    .line 194
    .line 195
    move-object/from16 v21, v11

    .line 196
    .line 197
    iget-object v11, v1, La/qyg;->z:La/bwl;

    .line 198
    .line 199
    move-object/from16 v29, v0

    .line 200
    .line 201
    iget-object v0, v1, La/qyg;->C:La/gst0;

    .line 202
    .line 203
    move-object/from16 v32, v0

    .line 204
    .line 205
    iget-object v0, v1, La/qyg;->A:La/ocl;

    .line 206
    .line 207
    move-object/from16 v30, v0

    .line 208
    .line 209
    iget-object v0, v1, La/qyg;->B:La/ivn;

    .line 210
    .line 211
    iget-object v1, v1, La/qyg;->D:La/ul9;

    .line 212
    .line 213
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-object/from16 v17, v2

    .line 256
    .line 257
    new-instance v2, La/rei;

    .line 258
    .line 259
    move-object/from16 v31, v0

    .line 260
    .line 261
    move-object/from16 v33, v1

    .line 262
    .line 263
    invoke-direct/range {v2 .. v33}, La/rei;-><init>(La/cad;La/ugf0;La/pyg;La/xri;La/itr;La/iip;La/lsn;La/vqc;La/bwl;La/gii0;La/duj;La/oeg0;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;La/kt2;La/m1e;La/g2v;La/n660;La/y78;La/lbu;La/ctf0;La/pru;La/sjl0;La/wdk0;La/rtu;La/pmi;La/r9u;La/zr1;La/ocl;La/ivn;La/gst0;La/ul9;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 268
    .line 269
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_2
    return-object v2

    .line 277
    :pswitch_3
    iget-object v0, v0, La/crk;->M1:La/pru;

    .line 278
    .line 279
    if-eqz v0, :cond_5

    .line 280
    .line 281
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iget-object v0, v0, La/sff0;->c:La/ech;

    .line 286
    .line 287
    iget-object v0, v0, La/ech;->q:La/n2o;

    .line 288
    .line 289
    return-object v0

    .line 290
    :cond_5
    const-string v0, "getRemoteConfigUseCase"

    .line 291
    .line 292
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v2

    .line 296
    :pswitch_4
    sget-object v1, La/crk;->W1:La/xak;

    .line 297
    .line 298
    invoke-virtual {v0}, La/crk;->G0()La/k3t0;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget-object v1, La/pok;->a:La/pok;

    .line 303
    .line 304
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
