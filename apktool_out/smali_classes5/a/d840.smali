.class public final synthetic La/d840;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f840;


# direct methods
.method public synthetic constructor <init>(La/f840;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d840;->a:B

    iput-object p1, p0, La/d840;->b:La/f840;

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
    iget-byte v1, v0, La/d840;->a:B

    .line 4
    .line 5
    sget-object v2, La/q740;->a:La/q740;

    .line 6
    .line 7
    sget-object v3, La/p740;->a:La/p740;

    .line 8
    .line 9
    iget-object v0, v0, La/d840;->b:La/f840;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/f840;->O1:La/atz;

    .line 15
    .line 16
    invoke-virtual {v0}, La/f840;->H0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    sget-object v1, La/f840;->O1:La/atz;

    .line 27
    .line 28
    invoke-virtual {v0}, La/f840;->H0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    sget-object v1, La/f840;->O1:La/atz;

    .line 39
    .line 40
    invoke-virtual {v0}, La/f840;->H0()La/k3t0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_2
    sget-object v1, La/f840;->O1:La/atz;

    .line 51
    .line 52
    invoke-virtual {v0}, La/f840;->H0()La/k3t0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_3
    sget-object v1, La/f840;->O1:La/atz;

    .line 63
    .line 64
    new-instance v1, La/q0h0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/f840;->G0()La/rli;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v0, v0, La/rli;->G:La/n5d0;

    .line 71
    .line 72
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/qli;

    .line 77
    .line 78
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_4
    sget-object v1, La/f840;->O1:La/atz;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    instance-of v2, v1, La/af3;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    check-cast v1, La/af3;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object v1, v3

    .line 104
    :goto_0
    const-class v2, La/g840;

    .line 105
    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/o5d0;

    .line 117
    .line 118
    if-eqz v1, :cond_1

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
    :cond_1
    move-object v1, v3

    .line 128
    :goto_1
    instance-of v4, v1, La/g840;

    .line 129
    .line 130
    if-nez v4, :cond_2

    .line 131
    .line 132
    move-object v1, v3

    .line 133
    :cond_2
    check-cast v1, La/g840;

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v14, v1, La/g840;->d:La/duj;

    .line 145
    .line 146
    iget-object v0, v1, La/g840;->b:La/tp9;

    .line 147
    .line 148
    iget-object v15, v1, La/g840;->e:La/grj;

    .line 149
    .line 150
    iget-object v2, v1, La/g840;->f:La/btt0;

    .line 151
    .line 152
    iget-object v3, v1, La/g840;->g:La/m1e;

    .line 153
    .line 154
    iget-object v4, v1, La/g840;->h:La/sa10;

    .line 155
    .line 156
    iget-object v5, v1, La/g840;->i:La/ctf0;

    .line 157
    .line 158
    iget-object v6, v1, La/g840;->j:La/gii0;

    .line 159
    .line 160
    iget-object v7, v1, La/g840;->k:La/oct;

    .line 161
    .line 162
    iget-object v8, v1, La/g840;->l:La/qv2;

    .line 163
    .line 164
    iget-object v9, v1, La/g840;->m:La/peg0;

    .line 165
    .line 166
    iget-object v10, v1, La/g840;->n:La/vjp;

    .line 167
    .line 168
    iget-object v11, v1, La/g840;->o:La/qgd;

    .line 169
    .line 170
    iget-object v13, v1, La/g840;->p:La/xwb0;

    .line 171
    .line 172
    move-object/from16 v16, v0

    .line 173
    .line 174
    iget-object v0, v1, La/g840;->q:La/pru;

    .line 175
    .line 176
    move-object/from16 v26, v0

    .line 177
    .line 178
    iget-object v0, v1, La/g840;->t:La/kt2;

    .line 179
    .line 180
    move-object/from16 v19, v5

    .line 181
    .line 182
    iget-object v5, v1, La/g840;->c:La/he1;

    .line 183
    .line 184
    move-object/from16 v23, v9

    .line 185
    .line 186
    iget-object v9, v1, La/g840;->s:La/wsf0;

    .line 187
    .line 188
    move-object/from16 v17, v13

    .line 189
    .line 190
    iget-object v13, v1, La/g840;->r:La/ii;

    .line 191
    .line 192
    move-object/from16 v27, v0

    .line 193
    .line 194
    iget-object v0, v1, La/g840;->u:La/vwb0;

    .line 195
    .line 196
    move-object/from16 v18, v0

    .line 197
    .line 198
    iget-object v0, v1, La/g840;->v:La/knf0;

    .line 199
    .line 200
    move-object/from16 v28, v0

    .line 201
    .line 202
    iget-object v0, v1, La/g840;->w:La/h840;

    .line 203
    .line 204
    move-object/from16 v20, v6

    .line 205
    .line 206
    iget-object v6, v1, La/g840;->a:La/cad;

    .line 207
    .line 208
    move-object/from16 v21, v7

    .line 209
    .line 210
    iget-object v7, v1, La/g840;->x:La/zx10;

    .line 211
    .line 212
    move-object/from16 v22, v8

    .line 213
    .line 214
    iget-object v8, v1, La/g840;->y:La/d1p;

    .line 215
    .line 216
    move-object/from16 v29, v0

    .line 217
    .line 218
    iget-object v0, v1, La/g840;->z:La/wdk0;

    .line 219
    .line 220
    move-object/from16 v30, v0

    .line 221
    .line 222
    iget-object v0, v1, La/g840;->A:La/uzc0;

    .line 223
    .line 224
    move-object/from16 v31, v0

    .line 225
    .line 226
    iget-object v0, v1, La/g840;->B:La/r990;

    .line 227
    .line 228
    move-object/from16 v24, v10

    .line 229
    .line 230
    iget-object v10, v1, La/g840;->C:La/v6k;

    .line 231
    .line 232
    move-object/from16 v25, v11

    .line 233
    .line 234
    iget-object v11, v1, La/g840;->D:La/pyg;

    .line 235
    .line 236
    move-object/from16 v32, v0

    .line 237
    .line 238
    iget-object v0, v1, La/g840;->E:La/r9u;

    .line 239
    .line 240
    move-object/from16 v33, v0

    .line 241
    .line 242
    iget-object v0, v1, La/g840;->F:La/s9m0;

    .line 243
    .line 244
    move-object/from16 v34, v0

    .line 245
    .line 246
    iget-object v0, v1, La/g840;->G:La/ouu;

    .line 247
    .line 248
    move-object/from16 v35, v0

    .line 249
    .line 250
    iget-object v0, v1, La/g840;->H:La/h3c;

    .line 251
    .line 252
    iget-object v1, v1, La/g840;->I:La/uf3;

    .line 253
    .line 254
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-object/from16 v18, v4

    .line 300
    .line 301
    new-instance v4, La/rli;

    .line 302
    .line 303
    move-object/from16 v36, v1

    .line 304
    .line 305
    move-object/from16 v16, v2

    .line 306
    .line 307
    move-object/from16 v17, v3

    .line 308
    .line 309
    move-object/from16 v33, v34

    .line 310
    .line 311
    move-object/from16 v34, v35

    .line 312
    .line 313
    move-object/from16 v35, v0

    .line 314
    .line 315
    invoke-direct/range {v4 .. v36}, La/rli;-><init>(La/he1;La/cad;La/zx10;La/d1p;La/wsf0;La/v6k;La/pyg;La/i1w0;La/ii;La/duj;La/grj;La/btt0;La/m1e;La/sa10;La/ctf0;La/gii0;La/oct;La/qv2;La/peg0;La/vjp;La/qgd;La/pru;La/kt2;La/knf0;La/h840;La/wdk0;La/uzc0;La/r990;La/s9m0;La/ouu;La/h3c;La/uf3;)V

    .line 316
    .line 317
    .line 318
    move-object v3, v4

    .line 319
    goto :goto_2

    .line 320
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 321
    .line 322
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :goto_2
    return-object v3

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
