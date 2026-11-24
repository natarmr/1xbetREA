.class public final synthetic La/es60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gs60;


# direct methods
.method public synthetic constructor <init>(La/gs60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/es60;->a:B

    iput-object p1, p0, La/es60;->b:La/gs60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/es60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/es60;->b:La/gs60;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/gs60;->R1:La/uuz;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, La/gs60;->K1:La/phf0;

    .line 18
    .line 19
    sget-object v3, La/gs60;->S1:[La/iiy;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aget-object v3, v3, v4

    .line 23
    .line 24
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v3, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, La/gs60;->G0()La/k3t0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, La/ip60;->a:La/ip60;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    sget-object v1, La/gs60;->R1:La/uuz;

    .line 49
    .line 50
    iget-object v0, v0, La/gs60;->N1:La/fiu0;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_0
    const-string v0, "viewModelFactory"

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v2

    .line 61
    :pswitch_1
    sget-object v1, La/gs60;->R1:La/uuz;

    .line 62
    .line 63
    invoke-static {v0}, La/qxw;->y(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_2
    sget-object v1, La/gs60;->R1:La/uuz;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    instance-of v3, v1, La/af3;

    .line 82
    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    check-cast v1, La/af3;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object v1, v2

    .line 89
    :goto_0
    const-class v3, La/i52;

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, La/o5d0;

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, La/ze3;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v1, v2

    .line 113
    :goto_1
    instance-of v4, v1, La/i52;

    .line 114
    .line 115
    if-nez v4, :cond_3

    .line 116
    .line 117
    move-object v1, v2

    .line 118
    :cond_3
    check-cast v1, La/i52;

    .line 119
    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    iget-object v10, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 127
    .line 128
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v5, v1, La/i52;->l:La/wsf0;

    .line 132
    .line 133
    iget-object v7, v1, La/i52;->n:La/iw20;

    .line 134
    .line 135
    iget-object v6, v1, La/i52;->m:La/peg0;

    .line 136
    .line 137
    iget-object v9, v1, La/i52;->k:La/cad;

    .line 138
    .line 139
    iget-object v12, v1, La/i52;->a:La/gst0;

    .line 140
    .line 141
    iget-object v0, v1, La/i52;->b:La/btt0;

    .line 142
    .line 143
    iget-object v13, v1, La/i52;->c:La/duj;

    .line 144
    .line 145
    iget-object v14, v1, La/i52;->d:La/m1e;

    .line 146
    .line 147
    iget-object v8, v1, La/i52;->v:La/bw60;

    .line 148
    .line 149
    iget-object v2, v1, La/i52;->I:La/l570;

    .line 150
    .line 151
    iget-object v15, v1, La/i52;->e:La/v88;

    .line 152
    .line 153
    iget-object v3, v1, La/i52;->f:La/g2v;

    .line 154
    .line 155
    iget-object v4, v1, La/i52;->g:La/oeg0;

    .line 156
    .line 157
    move-object/from16 v16, v0

    .line 158
    .line 159
    iget-object v0, v1, La/i52;->h:La/ctf0;

    .line 160
    .line 161
    move-object/from16 v18, v0

    .line 162
    .line 163
    iget-object v0, v1, La/i52;->s:La/r9u;

    .line 164
    .line 165
    move-object/from16 v17, v0

    .line 166
    .line 167
    iget-object v0, v1, La/i52;->i:La/ii;

    .line 168
    .line 169
    move-object/from16 v19, v0

    .line 170
    .line 171
    iget-object v0, v1, La/i52;->j:La/wdk0;

    .line 172
    .line 173
    move-object/from16 v20, v0

    .line 174
    .line 175
    iget-object v0, v1, La/i52;->J:La/j1q0;

    .line 176
    .line 177
    move-object/from16 v21, v0

    .line 178
    .line 179
    iget-object v0, v1, La/i52;->o:La/jtj;

    .line 180
    .line 181
    move-object/from16 v22, v0

    .line 182
    .line 183
    iget-object v0, v1, La/i52;->p:La/ali;

    .line 184
    .line 185
    move-object/from16 v23, v0

    .line 186
    .line 187
    iget-object v0, v1, La/i52;->q:La/hs60;

    .line 188
    .line 189
    move-object/from16 v24, v0

    .line 190
    .line 191
    iget-object v0, v1, La/i52;->r:La/ih5;

    .line 192
    .line 193
    move-object/from16 v25, v0

    .line 194
    .line 195
    iget-object v0, v1, La/i52;->H:La/kyg0;

    .line 196
    .line 197
    move-object/from16 v28, v0

    .line 198
    .line 199
    iget-object v0, v1, La/i52;->t:La/hnu;

    .line 200
    .line 201
    move-object/from16 v26, v0

    .line 202
    .line 203
    iget-object v0, v1, La/i52;->u:La/b8u;

    .line 204
    .line 205
    move-object/from16 v27, v0

    .line 206
    .line 207
    iget-object v0, v1, La/i52;->w:La/s31;

    .line 208
    .line 209
    move-object/from16 v29, v0

    .line 210
    .line 211
    iget-object v0, v1, La/i52;->x:La/lqc;

    .line 212
    .line 213
    move-object/from16 v30, v0

    .line 214
    .line 215
    iget-object v0, v1, La/i52;->y:La/nr;

    .line 216
    .line 217
    move-object/from16 v31, v0

    .line 218
    .line 219
    iget-object v0, v1, La/i52;->z:La/yuu;

    .line 220
    .line 221
    move-object/from16 v32, v0

    .line 222
    .line 223
    iget-object v0, v1, La/i52;->A:La/x4u;

    .line 224
    .line 225
    move-object/from16 v33, v0

    .line 226
    .line 227
    iget-object v0, v1, La/i52;->B:La/lqc;

    .line 228
    .line 229
    move-object/from16 v34, v0

    .line 230
    .line 231
    iget-object v0, v1, La/i52;->C:La/gw60;

    .line 232
    .line 233
    move-object/from16 v35, v0

    .line 234
    .line 235
    iget-object v0, v1, La/i52;->D:La/l7k;

    .line 236
    .line 237
    move-object/from16 v36, v0

    .line 238
    .line 239
    iget-object v0, v1, La/i52;->E:La/cyu;

    .line 240
    .line 241
    move-object/from16 v37, v0

    .line 242
    .line 243
    iget-object v0, v1, La/i52;->F:La/cmt;

    .line 244
    .line 245
    move-object/from16 v38, v0

    .line 246
    .line 247
    iget-object v0, v1, La/i52;->G:La/foi0;

    .line 248
    .line 249
    iget-object v1, v1, La/i52;->K:La/ouu;

    .line 250
    .line 251
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-object/from16 v17, v4

    .line 282
    .line 283
    new-instance v4, La/z7i;

    .line 284
    .line 285
    move-object/from16 v16, v3

    .line 286
    .line 287
    move-object/from16 v19, v22

    .line 288
    .line 289
    move-object/from16 v20, v23

    .line 290
    .line 291
    move-object/from16 v21, v24

    .line 292
    .line 293
    move-object/from16 v22, v25

    .line 294
    .line 295
    move-object/from16 v24, v26

    .line 296
    .line 297
    move-object/from16 v25, v27

    .line 298
    .line 299
    move-object/from16 v26, v29

    .line 300
    .line 301
    move-object/from16 v27, v30

    .line 302
    .line 303
    move-object/from16 v29, v31

    .line 304
    .line 305
    move-object/from16 v30, v32

    .line 306
    .line 307
    move-object/from16 v31, v33

    .line 308
    .line 309
    move-object/from16 v32, v34

    .line 310
    .line 311
    move-object/from16 v33, v35

    .line 312
    .line 313
    move-object/from16 v34, v36

    .line 314
    .line 315
    move-object/from16 v35, v37

    .line 316
    .line 317
    move-object/from16 v36, v0

    .line 318
    .line 319
    move-object/from16 v37, v1

    .line 320
    .line 321
    move-object/from16 v23, v2

    .line 322
    .line 323
    invoke-direct/range {v4 .. v38}, La/z7i;-><init>(La/wsf0;La/peg0;La/iw20;La/bw60;La/cad;Landroid/os/Bundle;La/i1w0;La/gst0;La/duj;La/m1e;La/v88;La/g2v;La/oeg0;La/ctf0;La/jtj;La/ali;La/hs60;La/ih5;La/l570;La/hnu;La/b8u;La/s31;La/lqc;La/kyg0;La/nr;La/yuu;La/x4u;La/lqc;La/gw60;La/l7k;La/cyu;La/foi0;La/ouu;La/cmt;)V

    .line 324
    .line 325
    .line 326
    move-object v2, v4

    .line 327
    goto :goto_2

    .line 328
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 329
    .line 330
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_2
    return-object v2

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
