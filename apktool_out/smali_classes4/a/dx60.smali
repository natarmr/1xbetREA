.class public final synthetic La/dx60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gx60;


# direct methods
.method public synthetic constructor <init>(La/gx60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dx60;->a:B

    iput-object p1, p0, La/dx60;->b:La/gx60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dx60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/dx60;->b:La/gx60;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/gx60;->R1:La/atz;

    .line 12
    .line 13
    invoke-virtual {v0}, La/gx60;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/vw60;->a:La/vw60;

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
    sget-object v1, La/gx60;->R1:La/atz;

    .line 26
    .line 27
    invoke-virtual {v0}, La/gx60;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/ww60;->a:La/ww60;

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
    sget-object v1, La/gx60;->R1:La/atz;

    .line 40
    .line 41
    iget-object v0, v0, La/gx60;->N1:La/fiu0;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "viewModelFactory"

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :pswitch_2
    sget-object v1, La/gx60;->R1:La/atz;

    .line 53
    .line 54
    invoke-static {v0}, La/qxw;->y(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_3
    sget-object v1, La/gx60;->R1:La/atz;

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
    if-eqz v3, :cond_1

    .line 75
    .line 76
    check-cast v1, La/af3;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    move-object v1, v2

    .line 80
    :goto_0
    const-class v3, La/o5t;

    .line 81
    .line 82
    if-eqz v1, :cond_4

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
    if-eqz v1, :cond_2

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
    :cond_2
    move-object v1, v2

    .line 104
    :goto_1
    instance-of v4, v1, La/o5t;

    .line 105
    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    move-object v1, v2

    .line 109
    :cond_3
    check-cast v1, La/o5t;

    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v5, v1, La/o5t;->l:La/wsf0;

    .line 121
    .line 122
    iget-object v7, v1, La/o5t;->n:La/iw20;

    .line 123
    .line 124
    iget-object v6, v1, La/o5t;->m:La/peg0;

    .line 125
    .line 126
    iget-object v9, v1, La/o5t;->k:La/cad;

    .line 127
    .line 128
    iget-object v0, v1, La/o5t;->a:La/gst0;

    .line 129
    .line 130
    iget-object v13, v1, La/o5t;->x:La/ih5;

    .line 131
    .line 132
    iget-object v14, v1, La/o5t;->y:La/bn6;

    .line 133
    .line 134
    iget-object v15, v1, La/o5t;->z:La/s64;

    .line 135
    .line 136
    iget-object v2, v1, La/o5t;->A:La/cmt;

    .line 137
    .line 138
    iget-object v3, v1, La/o5t;->B:La/gg5;

    .line 139
    .line 140
    iget-object v4, v1, La/o5t;->b:La/btt0;

    .line 141
    .line 142
    iget-object v11, v1, La/o5t;->c:La/duj;

    .line 143
    .line 144
    iget-object v12, v1, La/o5t;->d:La/m1e;

    .line 145
    .line 146
    iget-object v8, v1, La/o5t;->r:La/bw60;

    .line 147
    .line 148
    move-object/from16 v16, v0

    .line 149
    .line 150
    iget-object v0, v1, La/o5t;->e:La/v88;

    .line 151
    .line 152
    move-object/from16 v18, v0

    .line 153
    .line 154
    iget-object v0, v1, La/o5t;->f:La/g2v;

    .line 155
    .line 156
    move-object/from16 v19, v0

    .line 157
    .line 158
    iget-object v0, v1, La/o5t;->g:La/oeg0;

    .line 159
    .line 160
    move-object/from16 v20, v0

    .line 161
    .line 162
    iget-object v0, v1, La/o5t;->h:La/ctf0;

    .line 163
    .line 164
    move-object/from16 v21, v0

    .line 165
    .line 166
    iget-object v0, v1, La/o5t;->q:La/r9u;

    .line 167
    .line 168
    move-object/from16 v17, v0

    .line 169
    .line 170
    iget-object v0, v1, La/o5t;->i:La/ii;

    .line 171
    .line 172
    move-object/from16 v22, v0

    .line 173
    .line 174
    iget-object v0, v1, La/o5t;->j:La/wdk0;

    .line 175
    .line 176
    move-object/from16 v23, v0

    .line 177
    .line 178
    iget-object v0, v1, La/o5t;->C:La/j1q0;

    .line 179
    .line 180
    move-object/from16 v24, v0

    .line 181
    .line 182
    iget-object v0, v1, La/o5t;->t:La/jqt;

    .line 183
    .line 184
    move-object/from16 v25, v0

    .line 185
    .line 186
    iget-object v0, v1, La/o5t;->o:La/ali;

    .line 187
    .line 188
    move-object/from16 v26, v0

    .line 189
    .line 190
    iget-object v0, v1, La/o5t;->p:La/ih5;

    .line 191
    .line 192
    move-object/from16 v27, v0

    .line 193
    .line 194
    iget-object v0, v1, La/o5t;->u:La/yoc;

    .line 195
    .line 196
    move-object/from16 v28, v0

    .line 197
    .line 198
    iget-object v0, v1, La/o5t;->v:La/yoc;

    .line 199
    .line 200
    move-object/from16 v29, v0

    .line 201
    .line 202
    iget-object v0, v1, La/o5t;->s:La/l7k;

    .line 203
    .line 204
    move-object/from16 v30, v0

    .line 205
    .line 206
    iget-object v0, v1, La/o5t;->w:La/foi0;

    .line 207
    .line 208
    move-object/from16 p0, v0

    .line 209
    .line 210
    iget-object v0, v1, La/o5t;->D:La/ouu;

    .line 211
    .line 212
    iget-object v1, v1, La/o5t;->E:La/bzt;

    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    new-instance v4, La/bii;

    .line 245
    .line 246
    move-object/from16 v16, v2

    .line 247
    .line 248
    move-object/from16 v17, v3

    .line 249
    .line 250
    move-object/from16 v23, v25

    .line 251
    .line 252
    move-object/from16 v22, v26

    .line 253
    .line 254
    move-object/from16 v24, v27

    .line 255
    .line 256
    move-object/from16 v25, v28

    .line 257
    .line 258
    move-object/from16 v26, v29

    .line 259
    .line 260
    move-object/from16 v27, v30

    .line 261
    .line 262
    move-object/from16 v28, p0

    .line 263
    .line 264
    move-object/from16 v29, v0

    .line 265
    .line 266
    move-object/from16 v30, v1

    .line 267
    .line 268
    invoke-direct/range {v4 .. v30}, La/bii;-><init>(La/wsf0;La/peg0;La/iw20;La/bw60;La/cad;La/i1w0;La/duj;La/m1e;La/ih5;La/bn6;La/s64;La/cmt;La/gg5;La/v88;La/g2v;La/oeg0;La/ctf0;La/ali;La/jqt;La/ih5;La/yoc;La/yoc;La/l7k;La/foi0;La/ouu;La/bzt;)V

    .line 269
    .line 270
    .line 271
    move-object v2, v4

    .line 272
    goto :goto_2

    .line 273
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 274
    .line 275
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :goto_2
    return-object v2

    .line 283
    :pswitch_4
    sget-object v1, La/gx60;->R1:La/atz;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    iget-object v2, v0, La/gx60;->K1:La/phf0;

    .line 290
    .line 291
    sget-object v3, La/gx60;->S1:[La/iiy;

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    aget-object v3, v3, v4

    .line 295
    .line 296
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object v3, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 304
    .line 305
    invoke-static {v1, v3, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0}, La/gx60;->G0()La/k3t0;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    sget-object v1, La/nw60;->a:La/nw60;

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
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
