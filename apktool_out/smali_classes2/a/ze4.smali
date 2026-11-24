.class public final La/ze4;
.super La/of80;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0008\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/ze4;",
        "La/of80;",
        "<init>",
        "()V",
        "a/qek0",
        "",
        "isOtherEntryPointsNotEmpty",
        "La/wul;",
        "loginWayButtonUiModel",
        "forgetPasswordButtonUiModel",
        "La/if4;",
        "registration",
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
.field public static final g2:La/qek0;

.field public static final synthetic h2:[La/iiy;

.field public static final i2:Ljava/lang/String;


# instance fields
.field public Y1:La/y8i;

.field public Z1:La/pek0;

.field public a2:La/rl70;

.field public b2:La/gl5;

.field public c2:La/ii;

.field public d2:La/kd30;

.field public final e2:La/a8z;

.field public final f2:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ze4;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/login/simple/impl/databinding/DialogFragmentAuthLoginSimpleBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/ze4;->h2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/qek0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ze4;->g2:La/qek0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/ze4;->i2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0147

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/sik;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/fh4;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/pe4;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p0, v2}, La/pe4;-><init>(La/ze4;B)V

    .line 19
    .line 20
    .line 21
    const/16 v2, 0xe

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ze4;->e2:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/ye4;->a:La/ye4;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/ze4;->f2:La/s0r;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final K0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ze4;->e2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/of80;->V(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/bf4;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/bf4;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/bf4;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v18

    .line 64
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, v3, La/bf4;->Z:La/dpc;

    .line 68
    .line 69
    iget-object v6, v3, La/bf4;->b:La/ok50;

    .line 70
    .line 71
    iget-object v2, v3, La/bf4;->T:La/rpt;

    .line 72
    .line 73
    iget-object v14, v3, La/bf4;->N:La/epi0;

    .line 74
    .line 75
    iget-object v4, v3, La/bf4;->W:La/sqx;

    .line 76
    .line 77
    iget-object v5, v3, La/bf4;->a:La/cad;

    .line 78
    .line 79
    iget-object v7, v3, La/bf4;->X:La/b8u;

    .line 80
    .line 81
    iget-object v8, v3, La/bf4;->Y:La/n4u;

    .line 82
    .line 83
    iget-object v11, v3, La/bf4;->e:La/zx10;

    .line 84
    .line 85
    iget-object v9, v3, La/bf4;->d:La/pru;

    .line 86
    .line 87
    iget-object v10, v3, La/bf4;->f:La/pek;

    .line 88
    .line 89
    iget-object v12, v3, La/bf4;->t:La/fsd;

    .line 90
    .line 91
    iget-object v13, v3, La/bf4;->g:La/pek0;

    .line 92
    .line 93
    iget-object v15, v3, La/bf4;->h:La/rl70;

    .line 94
    .line 95
    move-object/from16 v20, v1

    .line 96
    .line 97
    iget-object v1, v3, La/bf4;->i:La/bzt;

    .line 98
    .line 99
    move-object/from16 v27, v1

    .line 100
    .line 101
    iget-object v1, v3, La/bf4;->j:La/knf0;

    .line 102
    .line 103
    move-object/from16 v24, v10

    .line 104
    .line 105
    iget-object v10, v3, La/bf4;->y:La/wsf0;

    .line 106
    .line 107
    move-object/from16 v16, v1

    .line 108
    .line 109
    iget-object v1, v3, La/bf4;->k:La/tgk;

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    iget-object v1, v3, La/bf4;->l:La/us3;

    .line 114
    .line 115
    move-object/from16 v19, v1

    .line 116
    .line 117
    iget-object v1, v3, La/bf4;->m:La/wwb0;

    .line 118
    .line 119
    move-object/from16 v21, v1

    .line 120
    .line 121
    iget-object v1, v3, La/bf4;->n:La/gii0;

    .line 122
    .line 123
    move-object/from16 v22, v1

    .line 124
    .line 125
    iget-object v1, v3, La/bf4;->o:La/btt0;

    .line 126
    .line 127
    move-object/from16 v23, v1

    .line 128
    .line 129
    iget-object v1, v3, La/bf4;->p:La/b3c0;

    .line 130
    .line 131
    move-object/from16 v28, v1

    .line 132
    .line 133
    iget-object v1, v3, La/bf4;->q:La/vwb0;

    .line 134
    .line 135
    move-object/from16 v25, v1

    .line 136
    .line 137
    iget-object v1, v3, La/bf4;->r:La/xwb0;

    .line 138
    .line 139
    move-object/from16 v26, v1

    .line 140
    .line 141
    iget-object v1, v3, La/bf4;->s:La/gst0;

    .line 142
    .line 143
    move-object/from16 v29, v1

    .line 144
    .line 145
    iget-object v1, v3, La/bf4;->D:La/ii;

    .line 146
    .line 147
    move-object/from16 v30, v16

    .line 148
    .line 149
    move-object/from16 v16, v7

    .line 150
    .line 151
    iget-object v7, v3, La/bf4;->c:La/pp90;

    .line 152
    .line 153
    move-object/from16 v31, v1

    .line 154
    .line 155
    iget-object v1, v3, La/bf4;->u:La/ctf0;

    .line 156
    .line 157
    move-object/from16 v32, v1

    .line 158
    .line 159
    iget-object v1, v3, La/bf4;->v:La/ojj;

    .line 160
    .line 161
    move-object/from16 v33, v17

    .line 162
    .line 163
    move-object/from16 v17, v8

    .line 164
    .line 165
    iget-object v8, v3, La/bf4;->w:La/yox;

    .line 166
    .line 167
    move-object/from16 v34, v23

    .line 168
    .line 169
    move-object/from16 v23, v9

    .line 170
    .line 171
    iget-object v9, v3, La/bf4;->x:La/d1p;

    .line 172
    .line 173
    move-object/from16 v35, v1

    .line 174
    .line 175
    iget-object v1, v3, La/bf4;->z:La/cyh;

    .line 176
    .line 177
    move-object/from16 v36, v1

    .line 178
    .line 179
    iget-object v1, v3, La/bf4;->B:La/kt2;

    .line 180
    .line 181
    move-object/from16 v37, v1

    .line 182
    .line 183
    iget-object v1, v3, La/bf4;->A:La/qe50;

    .line 184
    .line 185
    move-object/from16 v38, v1

    .line 186
    .line 187
    iget-object v1, v3, La/bf4;->C:La/z4w0;

    .line 188
    .line 189
    move-object/from16 v39, v1

    .line 190
    .line 191
    iget-object v1, v3, La/bf4;->E:La/kd30;

    .line 192
    .line 193
    move-object/from16 v40, v1

    .line 194
    .line 195
    iget-object v1, v3, La/bf4;->F:La/n4u;

    .line 196
    .line 197
    move-object/from16 v41, v12

    .line 198
    .line 199
    iget-object v12, v3, La/bf4;->G:La/v6k;

    .line 200
    .line 201
    move-object/from16 v42, v1

    .line 202
    .line 203
    iget-object v1, v3, La/bf4;->H:La/m1e;

    .line 204
    .line 205
    move-object/from16 v43, v25

    .line 206
    .line 207
    move-object/from16 v25, v13

    .line 208
    .line 209
    iget-object v13, v3, La/bf4;->I:La/lp4;

    .line 210
    .line 211
    move-object/from16 v44, v1

    .line 212
    .line 213
    iget-object v1, v3, La/bf4;->J:La/ieu;

    .line 214
    .line 215
    move-object/from16 v45, v1

    .line 216
    .line 217
    iget-object v1, v3, La/bf4;->K:La/u8u;

    .line 218
    .line 219
    move-object/from16 p1, v1

    .line 220
    .line 221
    iget-object v1, v3, La/bf4;->L:La/rpt;

    .line 222
    .line 223
    move-object/from16 v46, v1

    .line 224
    .line 225
    iget-object v1, v3, La/bf4;->M:La/bot;

    .line 226
    .line 227
    move-object/from16 v47, v1

    .line 228
    .line 229
    iget-object v1, v3, La/bf4;->O:La/usd;

    .line 230
    .line 231
    move-object/from16 v48, v1

    .line 232
    .line 233
    iget-object v1, v3, La/bf4;->P:La/mi70;

    .line 234
    .line 235
    move-object/from16 v49, v1

    .line 236
    .line 237
    iget-object v1, v3, La/bf4;->Q:La/svs0;

    .line 238
    .line 239
    move-object/from16 v50, v1

    .line 240
    .line 241
    iget-object v1, v3, La/bf4;->R:La/zn00;

    .line 242
    .line 243
    move-object/from16 v51, v26

    .line 244
    .line 245
    move-object/from16 v26, v15

    .line 246
    .line 247
    iget-object v15, v3, La/bf4;->S:La/ilp0;

    .line 248
    .line 249
    move-object/from16 v52, v1

    .line 250
    .line 251
    iget-object v1, v3, La/bf4;->U:La/nh70;

    .line 252
    .line 253
    move-object/from16 v53, v1

    .line 254
    .line 255
    iget-object v1, v3, La/bf4;->V:La/j1q0;

    .line 256
    .line 257
    iget-object v3, v3, La/bf4;->a0:La/kwd;

    .line 258
    .line 259
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-object/from16 v19, v4

    .line 320
    .line 321
    new-instance v4, La/z8i;

    .line 322
    .line 323
    move-object/from16 v37, p1

    .line 324
    .line 325
    move-object/from16 v21, v2

    .line 326
    .line 327
    move-object/from16 v22, v31

    .line 328
    .line 329
    move-object/from16 v29, v32

    .line 330
    .line 331
    move-object/from16 v30, v35

    .line 332
    .line 333
    move-object/from16 v31, v36

    .line 334
    .line 335
    move-object/from16 v32, v39

    .line 336
    .line 337
    move-object/from16 v33, v40

    .line 338
    .line 339
    move-object/from16 v34, v42

    .line 340
    .line 341
    move-object/from16 v35, v44

    .line 342
    .line 343
    move-object/from16 v36, v45

    .line 344
    .line 345
    move-object/from16 v38, v46

    .line 346
    .line 347
    move-object/from16 v39, v47

    .line 348
    .line 349
    move-object/from16 v40, v48

    .line 350
    .line 351
    move-object/from16 v41, v49

    .line 352
    .line 353
    move-object/from16 v42, v50

    .line 354
    .line 355
    move-object/from16 v43, v52

    .line 356
    .line 357
    move-object/from16 v44, v53

    .line 358
    .line 359
    move-object/from16 v45, v3

    .line 360
    .line 361
    invoke-direct/range {v4 .. v45}, La/z8i;-><init>(La/cad;La/ok50;La/pp90;La/yox;La/d1p;La/wsf0;La/zx10;La/v6k;La/lp4;La/epi0;La/ilp0;La/b8u;La/n4u;La/i1w0;La/sqx;La/dpc;La/rpt;La/ii;La/pru;La/pek;La/pek0;La/rl70;La/bzt;La/b3c0;La/ctf0;La/ojj;La/cyh;La/z4w0;La/kd30;La/n4u;La/m1e;La/ieu;La/u8u;La/rpt;La/bot;La/usd;La/mi70;La/svs0;La/zn00;La/nh70;La/kwd;)V

    .line 362
    .line 363
    .line 364
    move-object v5, v4

    .line 365
    move-object/from16 v3, v22

    .line 366
    .line 367
    move-object/from16 v1, v25

    .line 368
    .line 369
    move-object/from16 v2, v26

    .line 370
    .line 371
    move-object/from16 v4, v33

    .line 372
    .line 373
    iget-object v5, v5, La/z8i;->H:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v5, La/n5d0;

    .line 376
    .line 377
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    check-cast v5, La/y8i;

    .line 382
    .line 383
    iput-object v5, v0, La/ze4;->Y1:La/y8i;

    .line 384
    .line 385
    iput-object v1, v0, La/ze4;->Z1:La/pek0;

    .line 386
    .line 387
    iput-object v2, v0, La/ze4;->a2:La/rl70;

    .line 388
    .line 389
    new-instance v1, La/gl5;

    .line 390
    .line 391
    const/16 v2, 0x11

    .line 392
    .line 393
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 394
    .line 395
    .line 396
    iput-object v1, v0, La/ze4;->b2:La/gl5;

    .line 397
    .line 398
    iput-object v3, v0, La/ze4;->c2:La/ii;

    .line 399
    .line 400
    iput-object v4, v0, La/ze4;->d2:La/kd30;

    .line 401
    .line 402
    return-void

    .line 403
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 404
    .line 405
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/of80;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    const v0, 0x7f140026

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/sik;->F0(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "AUTH_DIALOG_CLOSED_RESULT_KEY"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "OTP_CONFIRMATION_RESULT_KEY"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "KEY_REQUEST_SUPPORT"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "KEY_PICKER_MODEL_REQUEST"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, La/ze4;->a2:La/rl70;

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    const-string v1, "PICKER_DIALOG_TAG"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 83
    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    const/16 v1, 0x20

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-super {p0}, La/sik;->Z()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_1
    const-string p0, "pickerDialogFactory"

    .line 102
    .line 103
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-static {p1, p2}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, La/a8k0;->A()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x10

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x30

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v0, La/te4;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, La/te4;-><init>(La/ze4;B)V

    .line 43
    .line 44
    .line 45
    const-string v1, "OTP_CONFIRMATION_RESULT_KEY"

    .line 46
    .line 47
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/re4;

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-direct {v0, p0, v1}, La/re4;-><init>(La/ze4;B)V

    .line 54
    .line 55
    .line 56
    const-string v2, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 57
    .line 58
    invoke-static {p0, v2, v0}, La/vdb;->j0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/pe4;

    .line 62
    .line 63
    invoke-direct {v0, p0, v1}, La/pe4;-><init>(La/ze4;B)V

    .line 64
    .line 65
    .line 66
    const-string v2, "KEY_REQUEST_SUPPORT"

    .line 67
    .line 68
    invoke-static {p0, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, La/pe4;

    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    invoke-direct {v0, p0, v3}, La/pe4;-><init>(La/ze4;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v2, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La/se4;

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    invoke-direct {v0, p0, v2}, La/se4;-><init>(La/ze4;B)V

    .line 84
    .line 85
    .line 86
    const-string v4, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 87
    .line 88
    invoke-static {p0, v4, v0}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, La/te4;

    .line 92
    .line 93
    invoke-direct {v0, p0, v2}, La/te4;-><init>(La/ze4;B)V

    .line 94
    .line 95
    .line 96
    const-string v4, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 97
    .line 98
    invoke-virtual {p1, v4, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 99
    .line 100
    .line 101
    new-instance p1, La/se4;

    .line 102
    .line 103
    invoke-direct {p1, p0, v1}, La/se4;-><init>(La/ze4;B)V

    .line 104
    .line 105
    .line 106
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 107
    .line 108
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    new-instance p1, La/se4;

    .line 112
    .line 113
    invoke-direct {p1, p0, v3}, La/se4;-><init>(La/ze4;B)V

    .line 114
    .line 115
    .line 116
    const-string v0, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 117
    .line 118
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, La/ze4;->a2:La/rl70;

    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    new-instance p1, La/se4;

    .line 127
    .line 128
    const/4 v1, 0x4

    .line 129
    invoke-direct {p1, p0, v1}, La/se4;-><init>(La/ze4;B)V

    .line 130
    .line 131
    .line 132
    const-string v1, "PICKER_DIALOG_TAG"

    .line 133
    .line 134
    invoke-static {p0, v1, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, La/ze4;->b2:La/gl5;

    .line 138
    .line 139
    if-eqz p1, :cond_2

    .line 140
    .line 141
    new-instance p1, La/pe4;

    .line 142
    .line 143
    const/4 v1, 0x5

    .line 144
    invoke-direct {p1, p0, v1}, La/pe4;-><init>(La/ze4;B)V

    .line 145
    .line 146
    .line 147
    new-instance v1, La/re4;

    .line 148
    .line 149
    invoke-direct {v1, p0, v2}, La/re4;-><init>(La/ze4;B)V

    .line 150
    .line 151
    .line 152
    const-string v3, "KEY_REQUEST_CAPTCHA_CODE_DIALOG"

    .line 153
    .line 154
    invoke-static {p0, v3, p1, v1}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, La/ze4;->h2:[La/iiy;

    .line 158
    .line 159
    aget-object p1, p1, p2

    .line 160
    .line 161
    iget-object v1, p0, La/ze4;->f2:La/s0r;

    .line 162
    .line 163
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    check-cast p1, La/tik;

    .line 171
    .line 172
    iget-object p1, p1, La/tik;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 173
    .line 174
    sget-object v1, La/qek0;->h:La/qek0;

    .line 175
    .line 176
    new-instance v3, La/se4;

    .line 177
    .line 178
    invoke-direct {v3, p0, p2}, La/se4;-><init>(La/ze4;B)V

    .line 179
    .line 180
    .line 181
    new-instance p0, La/ugd;

    .line 182
    .line 183
    const p2, 0x635d51fb

    .line 184
    .line 185
    .line 186
    invoke-direct {p0, p2, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_2
    const-string p0, "captchaDialogDelegate"

    .line 194
    .line 195
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :cond_3
    const-string p0, "pickerDialogFactory"

    .line 200
    .line 201
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v0
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "AUTH_DIALOG_CLOSED_RESULT_KEY"

    .line 9
    .line 10
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
