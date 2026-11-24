.class public final synthetic La/bbn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dbn0;


# direct methods
.method public synthetic constructor <init>(La/dbn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bbn0;->a:B

    iput-object p1, p0, La/bbn0;->b:La/dbn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bbn0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/bbn0;->b:La/dbn0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/dbn0;->S1:La/j6m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/dbn0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/kan0;->a:La/kan0;

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
    sget-object v1, La/dbn0;->S1:La/j6m0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/dbn0;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/man0;->a:La/man0;

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
    sget-object v1, La/dbn0;->S1:La/j6m0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/dbn0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/nan0;->a:La/nan0;

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
    sget-object v1, La/dbn0;->S1:La/j6m0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/dbn0;->G0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/qan0;->a:La/qan0;

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
    sget-object v1, La/dbn0;->S1:La/j6m0;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    instance-of v3, v1, La/af3;

    .line 81
    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    check-cast v1, La/af3;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move-object v1, v2

    .line 88
    :goto_0
    const-class v3, La/ebn0;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, La/o5d0;

    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, La/ze3;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    move-object v1, v2

    .line 112
    :goto_1
    instance-of v4, v1, La/ebn0;

    .line 113
    .line 114
    if-nez v4, :cond_2

    .line 115
    .line 116
    move-object v1, v2

    .line 117
    :cond_2
    check-cast v1, La/ebn0;

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v5, v1, La/ebn0;->b:La/iip;

    .line 129
    .line 130
    iget-object v6, v1, La/ebn0;->c:La/fvt0;

    .line 131
    .line 132
    iget-object v8, v1, La/ebn0;->d:La/itr;

    .line 133
    .line 134
    iget-object v7, v1, La/ebn0;->a:La/ugf0;

    .line 135
    .line 136
    iget-object v9, v1, La/ebn0;->y:La/xri;

    .line 137
    .line 138
    iget-object v13, v1, La/ebn0;->e:La/rou;

    .line 139
    .line 140
    iget-object v14, v1, La/ebn0;->f:La/knf0;

    .line 141
    .line 142
    iget-object v15, v1, La/ebn0;->g:La/gii0;

    .line 143
    .line 144
    iget-object v0, v1, La/ebn0;->h:La/ctf0;

    .line 145
    .line 146
    iget-object v2, v1, La/ebn0;->i:La/y78;

    .line 147
    .line 148
    iget-object v3, v1, La/ebn0;->j:La/lbu;

    .line 149
    .line 150
    iget-object v4, v1, La/ebn0;->k:La/pru;

    .line 151
    .line 152
    iget-object v10, v1, La/ebn0;->l:La/m1e;

    .line 153
    .line 154
    iget-object v11, v1, La/ebn0;->m:La/mne;

    .line 155
    .line 156
    move-object/from16 v16, v0

    .line 157
    .line 158
    iget-object v0, v1, La/ebn0;->n:La/duj;

    .line 159
    .line 160
    move-object/from16 v22, v0

    .line 161
    .line 162
    iget-object v0, v1, La/ebn0;->o:La/ii;

    .line 163
    .line 164
    move-object/from16 v23, v0

    .line 165
    .line 166
    iget-object v0, v1, La/ebn0;->p:La/x4v;

    .line 167
    .line 168
    move-object/from16 v24, v0

    .line 169
    .line 170
    iget-object v0, v1, La/ebn0;->q:La/iqt;

    .line 171
    .line 172
    move-object/from16 v25, v0

    .line 173
    .line 174
    iget-object v0, v1, La/ebn0;->r:La/b4j;

    .line 175
    .line 176
    move-object/from16 v20, v10

    .line 177
    .line 178
    iget-object v10, v1, La/ebn0;->s:La/d1p;

    .line 179
    .line 180
    move-object/from16 v26, v0

    .line 181
    .line 182
    iget-object v0, v1, La/ebn0;->t:La/wdk0;

    .line 183
    .line 184
    move-object/from16 v21, v11

    .line 185
    .line 186
    iget-object v11, v1, La/ebn0;->u:La/lsn;

    .line 187
    .line 188
    move-object/from16 v27, v0

    .line 189
    .line 190
    iget-object v0, v1, La/ebn0;->v:La/wdu;

    .line 191
    .line 192
    move-object/from16 v28, v0

    .line 193
    .line 194
    iget-object v0, v1, La/ebn0;->w:La/sue;

    .line 195
    .line 196
    move-object/from16 v17, v0

    .line 197
    .line 198
    iget-object v0, v1, La/ebn0;->x:La/gst0;

    .line 199
    .line 200
    move-object/from16 v29, v0

    .line 201
    .line 202
    iget-object v0, v1, La/ebn0;->z:La/g2v;

    .line 203
    .line 204
    move-object/from16 v30, v0

    .line 205
    .line 206
    iget-object v0, v1, La/ebn0;->A:La/r9u;

    .line 207
    .line 208
    iget-object v1, v1, La/ebn0;->B:La/viu;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-object/from16 v19, v4

    .line 250
    .line 251
    new-instance v4, La/cvi;

    .line 252
    .line 253
    move-object/from16 v31, v0

    .line 254
    .line 255
    move-object/from16 v32, v1

    .line 256
    .line 257
    move-object/from16 v17, v2

    .line 258
    .line 259
    move-object/from16 v18, v3

    .line 260
    .line 261
    invoke-direct/range {v4 .. v32}, La/cvi;-><init>(La/iip;La/fvt0;La/ugf0;La/itr;La/xri;La/d1p;La/lsn;La/i1w0;La/rou;La/knf0;La/gii0;La/ctf0;La/y78;La/lbu;La/pru;La/m1e;La/mne;La/duj;La/ii;La/x4v;La/iqt;La/b4j;La/wdk0;La/wdu;La/gst0;La/g2v;La/r9u;La/viu;)V

    .line 262
    .line 263
    .line 264
    move-object v2, v4

    .line 265
    goto :goto_2

    .line 266
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 267
    .line 268
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :goto_2
    return-object v2

    .line 276
    :pswitch_4
    new-instance v1, La/q0h0;

    .line 277
    .line 278
    iget-object v0, v0, La/dbn0;->M1:La/bvi;

    .line 279
    .line 280
    if-eqz v0, :cond_4

    .line 281
    .line 282
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 283
    .line 284
    .line 285
    return-object v1

    .line 286
    :cond_4
    const-string v0, "viewModelFactory"

    .line 287
    .line 288
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v2

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
