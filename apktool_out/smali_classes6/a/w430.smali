.class public final La/w430;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/w430;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/u430",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Y1:La/u430;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/ndf0;

.field public M1:La/vq;

.field public N1:La/e720;

.field public O1:La/x430;

.field public P1:La/qta0;

.field public Q1:La/ii;

.field public R1:La/wdk0;

.field public S1:La/lgn0;

.field public final U1:La/s0r;

.field public final V1:La/a8z;

.field public final W1:Z

.field public final X1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/w430;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/sportgame/markets/base/impl/databinding/FragmentMarketsBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/w430;->Z1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/u430;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/w430;->Y1:La/u430;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0263

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/w430;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/v430;->a:La/v430;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/w430;->U1:La/s0r;

    .line 18
    .line 19
    const-class v0, La/l830;

    .line 20
    .line 21
    sget-object v1, La/sre0;->a:La/tre0;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, La/t430;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, p0, v2}, La/t430;-><init>(La/w430;B)V

    .line 31
    .line 32
    .line 33
    const/16 v3, 0xe

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/w430;->V1:La/a8z;

    .line 41
    .line 42
    iput-boolean v2, p0, La/w430;->W1:Z

    .line 43
    .line 44
    new-instance v0, La/khf0;

    .line 45
    .line 46
    const-string v1, "MARKETS_SCREEN_PARAMS_KEY"

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/w430;->X1:La/khf0;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/w430;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/w430;->U1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/x1r;

    .line 16
    .line 17
    iget-object p1, p1, La/x1r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/tx;

    .line 25
    .line 26
    const/16 v2, 0x1a

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0x7b70feca

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final C0()V
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    instance-of v3, v2, La/af3;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    check-cast v2, La/af3;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v4

    .line 27
    :goto_0
    const-class v3, La/y430;

    .line 28
    .line 29
    if-eqz v2, :cond_7

    .line 30
    .line 31
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/o5d0;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/ze3;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v2, v4

    .line 51
    :goto_1
    instance-of v5, v2, La/y430;

    .line 52
    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v4, v2

    .line 57
    :goto_2
    check-cast v4, La/y430;

    .line 58
    .line 59
    if-eqz v4, :cond_7

    .line 60
    .line 61
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 62
    .line 63
    .line 64
    move-result-object v25

    .line 65
    move-object v2, v0

    .line 66
    :goto_3
    const-string v3, "Can\'t find feature provider!"

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    instance-of v5, v2, La/ocl0;

    .line 71
    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    check-cast v2, La/ocl0;

    .line 75
    .line 76
    move-object v5, v0

    .line 77
    :goto_4
    if-eqz v5, :cond_4

    .line 78
    .line 79
    instance-of v6, v5, La/odf0;

    .line 80
    .line 81
    if-eqz v6, :cond_3

    .line 82
    .line 83
    check-cast v5, La/odf0;

    .line 84
    .line 85
    sget-object v3, La/w430;->Z1:[La/iiy;

    .line 86
    .line 87
    const/4 v6, 0x1

    .line 88
    aget-object v3, v3, v6

    .line 89
    .line 90
    iget-object v6, v0, La/w430;->X1:La/khf0;

    .line 91
    .line 92
    invoke-virtual {v6, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    move-object/from16 v24, v3

    .line 97
    .line 98
    check-cast v24, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 99
    .line 100
    new-instance v3, La/t430;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-direct {v3, v0, v6}, La/t430;-><init>(La/w430;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v2, v3}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    iget-object v6, v4, La/y430;->a:La/cad;

    .line 117
    .line 118
    iget-object v1, v4, La/y430;->b:La/wdk0;

    .line 119
    .line 120
    iget-object v2, v4, La/y430;->c:La/lgn0;

    .line 121
    .line 122
    invoke-interface {v5}, La/odf0;->b()La/pdf0;

    .line 123
    .line 124
    .line 125
    move-result-object v19

    .line 126
    iget-object v8, v4, La/y430;->d:La/sue;

    .line 127
    .line 128
    iget-object v3, v4, La/y430;->e:La/m1e;

    .line 129
    .line 130
    iget-object v5, v4, La/y430;->f:La/duj;

    .line 131
    .line 132
    iget-object v9, v4, La/y430;->g:La/ctf0;

    .line 133
    .line 134
    iget-object v15, v4, La/y430;->p:La/wsf0;

    .line 135
    .line 136
    iget-object v10, v4, La/y430;->h:La/gst0;

    .line 137
    .line 138
    iget-object v11, v4, La/y430;->i:La/btt0;

    .line 139
    .line 140
    iget-object v12, v4, La/y430;->j:La/b3c0;

    .line 141
    .line 142
    iget-object v13, v4, La/y430;->k:La/j1q0;

    .line 143
    .line 144
    iget-object v14, v4, La/y430;->l:La/r9u;

    .line 145
    .line 146
    move-object/from16 v26, v1

    .line 147
    .line 148
    iget-object v1, v4, La/y430;->M:La/ndf0;

    .line 149
    .line 150
    move-object/from16 v44, v1

    .line 151
    .line 152
    iget-object v1, v4, La/y430;->m:La/reu;

    .line 153
    .line 154
    move-object/from16 v29, v9

    .line 155
    .line 156
    iget-object v9, v4, La/y430;->n:La/rmd0;

    .line 157
    .line 158
    move-object/from16 v33, v1

    .line 159
    .line 160
    iget-object v1, v4, La/y430;->o:La/ii;

    .line 161
    .line 162
    move-object/from16 v34, v1

    .line 163
    .line 164
    iget-object v1, v4, La/y430;->q:La/knf0;

    .line 165
    .line 166
    move-object/from16 v30, v10

    .line 167
    .line 168
    iget-object v10, v4, La/y430;->r:La/iip;

    .line 169
    .line 170
    move-object/from16 v16, v11

    .line 171
    .line 172
    iget-object v11, v4, La/y430;->s:La/iw20;

    .line 173
    .line 174
    move-object/from16 v17, v12

    .line 175
    .line 176
    iget-object v12, v4, La/y430;->t:La/fvt0;

    .line 177
    .line 178
    move-object/from16 v31, v13

    .line 179
    .line 180
    iget-object v13, v4, La/y430;->u:La/onv;

    .line 181
    .line 182
    move-object/from16 v32, v14

    .line 183
    .line 184
    iget-object v14, v4, La/y430;->v:La/d1p;

    .line 185
    .line 186
    move-object/from16 v35, v1

    .line 187
    .line 188
    iget-object v1, v4, La/y430;->w:La/drm0;

    .line 189
    .line 190
    move-object/from16 v18, v1

    .line 191
    .line 192
    iget-object v1, v4, La/y430;->x:La/v88;

    .line 193
    .line 194
    move-object/from16 v36, v1

    .line 195
    .line 196
    iget-object v1, v4, La/y430;->y:La/onv;

    .line 197
    .line 198
    move-object/from16 v20, v1

    .line 199
    .line 200
    iget-object v1, v4, La/y430;->z:La/kt2;

    .line 201
    .line 202
    move-object/from16 v37, v1

    .line 203
    .line 204
    iget-object v1, v4, La/y430;->A:La/peg0;

    .line 205
    .line 206
    move-object/from16 v38, v1

    .line 207
    .line 208
    iget-object v1, v4, La/y430;->B:La/vwb0;

    .line 209
    .line 210
    move-object/from16 v21, v1

    .line 211
    .line 212
    iget-object v1, v4, La/y430;->C:La/ouu;

    .line 213
    .line 214
    move-object/from16 v39, v1

    .line 215
    .line 216
    iget-object v1, v4, La/y430;->D:La/jw20;

    .line 217
    .line 218
    move-object/from16 v22, v1

    .line 219
    .line 220
    iget-object v1, v4, La/y430;->E:La/cs00;

    .line 221
    .line 222
    move-object/from16 v23, v1

    .line 223
    .line 224
    iget-object v1, v4, La/y430;->F:La/edo;

    .line 225
    .line 226
    move-object/from16 v40, v1

    .line 227
    .line 228
    iget-object v1, v4, La/y430;->G:La/zfo;

    .line 229
    .line 230
    move-object/from16 v41, v1

    .line 231
    .line 232
    iget-object v1, v4, La/y430;->H:La/u8u;

    .line 233
    .line 234
    move-object/from16 v42, v1

    .line 235
    .line 236
    iget-object v1, v4, La/y430;->I:La/edu;

    .line 237
    .line 238
    move-object/from16 v43, v1

    .line 239
    .line 240
    iget-object v1, v4, La/y430;->J:La/bzu;

    .line 241
    .line 242
    move-object/from16 v27, v1

    .line 243
    .line 244
    iget-object v1, v4, La/y430;->K:La/o2j0;

    .line 245
    .line 246
    move-object/from16 v28, v1

    .line 247
    .line 248
    iget-object v1, v4, La/y430;->L:La/vqc;

    .line 249
    .line 250
    iget-object v4, v4, La/y430;->N:La/qoi;

    .line 251
    .line 252
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-object/from16 v17, v22

    .line 319
    .line 320
    move-object/from16 v22, v28

    .line 321
    .line 322
    move-object/from16 v28, v5

    .line 323
    .line 324
    new-instance v5, La/hli;

    .line 325
    .line 326
    move-object/from16 v23, v1

    .line 327
    .line 328
    move-object/from16 v21, v4

    .line 329
    .line 330
    move-object/from16 v16, v20

    .line 331
    .line 332
    move-object/from16 v20, v27

    .line 333
    .line 334
    move-object/from16 v27, v2

    .line 335
    .line 336
    invoke-direct/range {v5 .. v44}, La/hli;-><init>(La/cad;La/pcl0;La/sue;La/rmd0;La/iip;La/iw20;La/fvt0;La/onv;La/d1p;La/wsf0;La/onv;La/jw20;La/drm0;La/pdf0;La/bzu;La/qoi;La/o2j0;La/vqc;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;La/i1w0;La/wdk0;La/lgn0;La/duj;La/ctf0;La/gst0;La/j1q0;La/r9u;La/reu;La/ii;La/knf0;La/v88;La/kt2;La/peg0;La/ouu;La/edo;La/zfo;La/u8u;La/edu;La/ndf0;)V

    .line 337
    .line 338
    .line 339
    move-object v6, v5

    .line 340
    move-object/from16 v5, v16

    .line 341
    .line 342
    move-object/from16 v1, v26

    .line 343
    .line 344
    move-object/from16 v4, v34

    .line 345
    .line 346
    move-object/from16 v3, v44

    .line 347
    .line 348
    iput-object v3, v0, La/w430;->L1:La/ndf0;

    .line 349
    .line 350
    invoke-interface {v8}, La/sue;->w()La/vq;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iput-object v3, v0, La/w430;->M1:La/vq;

    .line 358
    .line 359
    iget-object v3, v5, La/onv;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v3, La/ali;

    .line 362
    .line 363
    invoke-virtual {v3}, La/ali;->z()La/e720;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    iput-object v3, v0, La/w430;->N1:La/e720;

    .line 368
    .line 369
    iget-object v3, v6, La/hli;->I:La/n5d0;

    .line 370
    .line 371
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, La/x430;

    .line 376
    .line 377
    iput-object v3, v0, La/w430;->O1:La/x430;

    .line 378
    .line 379
    invoke-virtual/range {v21 .. v21}, La/qoi;->a()La/qta0;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    iput-object v3, v0, La/w430;->P1:La/qta0;

    .line 384
    .line 385
    iput-object v4, v0, La/w430;->Q1:La/ii;

    .line 386
    .line 387
    iput-object v1, v0, La/w430;->R1:La/wdk0;

    .line 388
    .line 389
    iput-object v2, v0, La/w430;->S1:La/lgn0;

    .line 390
    .line 391
    return-void

    .line 392
    :cond_3
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 393
    .line 394
    goto/16 :goto_4

    .line 395
    .line 396
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :cond_5
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :cond_7
    const-string v0, "Cannot create dependency "

    .line 409
    .line 410
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w430;->V1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/w430;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/my20;->a:La/my20;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/w430;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ly20;->a:La/ly20;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/z430;

    .line 8
    .line 9
    iget-object v2, p0, La/w430;->M1:La/vq;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-eqz v2, :cond_5

    .line 13
    .line 14
    iget-object v3, p0, La/w430;->Q1:La/ii;

    .line 15
    .line 16
    if-eqz v3, :cond_4

    .line 17
    .line 18
    iget-object v4, p0, La/w430;->N1:La/e720;

    .line 19
    .line 20
    if-eqz v4, :cond_3

    .line 21
    .line 22
    iget-object v5, p0, La/w430;->S1:La/lgn0;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    iget-object v6, p0, La/w430;->R1:La/wdk0;

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    iget-object v7, p0, La/w430;->P1:La/qta0;

    .line 31
    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    move-object v1, p0

    .line 35
    invoke-direct/range {v0 .. v7}, La/z430;-><init>(Landroidx/fragment/app/Fragment;La/vq;La/ii;La/e720;La/lgn0;La/wdk0;La/qta0;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/zq2;

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance p2, La/r430;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {p2, v1, v2}, La/r430;-><init>(La/w430;B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0, p2}, La/z430;->b(La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, La/w430;->G0()La/k3t0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/i3t0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/i3t0;->C()La/gmq;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p2, La/khx;

    .line 63
    .line 64
    const/16 v2, 0xe

    .line 65
    .line 66
    invoke-direct {p2, v1, v0, p1, v2}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    sget-object v0, La/lkz;->a:La/lkz;

    .line 70
    .line 71
    invoke-static {v1}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, La/mw20;

    .line 84
    .line 85
    check-cast p0, La/i89;

    .line 86
    .line 87
    invoke-direct {v2, p0, v0, p2, p1}, La/mw20;-><init>(La/i89;La/clz;La/khx;La/yje;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x3

    .line 91
    invoke-static {v1, p1, p1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_0
    const-string p0, "polybetRulesDialogFactory"

    .line 96
    .line 97
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_1
    const-string p0, "snackbarManager"

    .line 102
    .line 103
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    const-string p0, "successBetAlertManager"

    .line 108
    .line 109
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_3
    const-string p0, "makeBetBottomSheetProvider"

    .line 114
    .line 115
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :cond_4
    const-string p0, "actionDialogManager"

    .line 120
    .line 121
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_5
    const-string p0, "addEventToCouponDelegate"

    .line 126
    .line 127
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/w430;->W1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w430;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
