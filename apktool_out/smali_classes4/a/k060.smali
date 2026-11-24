.class public final synthetic La/k060;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m060;


# direct methods
.method public synthetic constructor <init>(La/m060;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k060;->a:B

    iput-object p1, p0, La/k060;->b:La/m060;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k060;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/k060;->b:La/m060;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/m060;->O1:La/xuz;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/m060;->L1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/cmi;

    .line 21
    .line 22
    iget-object v0, v0, La/cmi;->r:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/bmi;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/m060;->O1:La/xuz;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v2, v1, La/af3;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, La/af3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v3

    .line 56
    :goto_0
    const-class v2, La/n060;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/o5d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ze3;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v1, v3

    .line 80
    :goto_1
    instance-of v4, v1, La/n060;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/n060;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v1, La/n060;->a:La/sue;

    .line 97
    .line 98
    iget-object v6, v1, La/n060;->b:La/bwl;

    .line 99
    .line 100
    iget-object v7, v1, La/n060;->c:La/a1d;

    .line 101
    .line 102
    iget-object v2, v1, La/n060;->d:La/iip;

    .line 103
    .line 104
    iget-object v5, v1, La/n060;->e:La/fvt0;

    .line 105
    .line 106
    iget-object v8, v1, La/n060;->f:La/iw20;

    .line 107
    .line 108
    iget-object v3, v1, La/n060;->g:La/btt0;

    .line 109
    .line 110
    iget-object v13, v1, La/n060;->h:La/g2v;

    .line 111
    .line 112
    iget-object v11, v1, La/n060;->i:La/mne;

    .line 113
    .line 114
    iget-object v14, v1, La/n060;->j:La/duj;

    .line 115
    .line 116
    iget-object v4, v1, La/n060;->m:La/j1q0;

    .line 117
    .line 118
    iget-object v9, v1, La/n060;->k:La/gii0;

    .line 119
    .line 120
    iget-object v15, v1, La/n060;->l:La/ort;

    .line 121
    .line 122
    iget-object v12, v1, La/n060;->n:La/m1e;

    .line 123
    .line 124
    move-object/from16 v16, v0

    .line 125
    .line 126
    iget-object v0, v1, La/n060;->p:La/sjl0;

    .line 127
    .line 128
    move-object/from16 v17, v9

    .line 129
    .line 130
    iget-object v9, v1, La/n060;->A:La/clc;

    .line 131
    .line 132
    move-object/from16 v18, v0

    .line 133
    .line 134
    iget-object v0, v1, La/n060;->q:La/ctf0;

    .line 135
    .line 136
    move-object/from16 v19, v0

    .line 137
    .line 138
    iget-object v0, v1, La/n060;->r:La/ii;

    .line 139
    .line 140
    move-object/from16 v20, v0

    .line 141
    .line 142
    iget-object v0, v1, La/n060;->s:La/ali;

    .line 143
    .line 144
    move-object/from16 v21, v0

    .line 145
    .line 146
    iget-object v0, v1, La/n060;->v:La/gst0;

    .line 147
    .line 148
    move-object/from16 p0, v0

    .line 149
    .line 150
    iget-object v0, v1, La/n060;->w:La/ntu;

    .line 151
    .line 152
    move-object/from16 v22, v0

    .line 153
    .line 154
    iget-object v0, v1, La/n060;->z:La/knf0;

    .line 155
    .line 156
    move-object/from16 v23, v0

    .line 157
    .line 158
    iget-object v0, v1, La/n060;->C:La/d1p;

    .line 159
    .line 160
    move-object/from16 v24, v0

    .line 161
    .line 162
    iget-object v0, v1, La/n060;->D:La/xri;

    .line 163
    .line 164
    move-object/from16 v25, v0

    .line 165
    .line 166
    iget-object v0, v1, La/n060;->E:La/wdk0;

    .line 167
    .line 168
    move-object/from16 v26, v0

    .line 169
    .line 170
    iget-object v0, v1, La/n060;->y:La/edo;

    .line 171
    .line 172
    move-object/from16 v27, v0

    .line 173
    .line 174
    iget-object v0, v1, La/n060;->o:La/r9u;

    .line 175
    .line 176
    move-object/from16 v28, v0

    .line 177
    .line 178
    iget-object v0, v1, La/n060;->t:La/abp;

    .line 179
    .line 180
    move-object/from16 v29, v0

    .line 181
    .line 182
    iget-object v0, v1, La/n060;->u:La/t6p;

    .line 183
    .line 184
    move-object/from16 v30, v0

    .line 185
    .line 186
    iget-object v0, v1, La/n060;->B:La/q7d0;

    .line 187
    .line 188
    move-object/from16 v31, v0

    .line 189
    .line 190
    iget-object v0, v1, La/n060;->x:La/kt2;

    .line 191
    .line 192
    move-object/from16 v32, v0

    .line 193
    .line 194
    iget-object v0, v1, La/n060;->G:La/uzc;

    .line 195
    .line 196
    move-object/from16 v33, v16

    .line 197
    .line 198
    move-object/from16 v16, v12

    .line 199
    .line 200
    iget-object v12, v1, La/n060;->F:La/xep;

    .line 201
    .line 202
    move-object/from16 v34, v0

    .line 203
    .line 204
    iget-object v0, v1, La/n060;->H:La/rmu0;

    .line 205
    .line 206
    iget-object v1, v1, La/n060;->I:La/qho;

    .line 207
    .line 208
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    new-instance v4, La/cmi;

    .line 278
    .line 279
    move-object/from16 v17, v19

    .line 280
    .line 281
    move-object/from16 v18, v20

    .line 282
    .line 283
    move-object/from16 v19, v21

    .line 284
    .line 285
    move-object/from16 v20, v22

    .line 286
    .line 287
    move-object/from16 v21, v1

    .line 288
    .line 289
    invoke-direct/range {v4 .. v21}, La/cmi;-><init>(La/fvt0;La/bwl;La/a1d;La/iw20;La/clc;La/i1w0;La/mne;La/xep;La/g2v;La/duj;La/ort;La/m1e;La/ctf0;La/ii;La/ali;La/ntu;La/qho;)V

    .line 290
    .line 291
    .line 292
    move-object v3, v4

    .line 293
    goto :goto_2

    .line 294
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 295
    .line 296
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :goto_2
    return-object v3

    .line 304
    :pswitch_1
    sget-object v1, La/m060;->O1:La/xuz;

    .line 305
    .line 306
    iget-object v0, v0, La/m060;->N1:La/a8z;

    .line 307
    .line 308
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/k3t0;

    .line 313
    .line 314
    sget-object v1, La/c060;->a:La/c060;

    .line 315
    .line 316
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
