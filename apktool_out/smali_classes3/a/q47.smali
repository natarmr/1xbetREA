.class public final La/q47;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ygt0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/q47;",
        "La/yx5;",
        "La/ygt0;",
        "<init>",
        "()V",
        "a/gl5",
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
.field public static final U1:La/gl5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/pii;

.field public M1:La/ynb;

.field public N1:La/wdk0;

.field public O1:La/ii;

.field public final P1:La/a8z;

.field public final Q1:La/khf0;

.field public final R1:La/ywq;

.field public final S1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/q47;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "betHistoryScreenModel"

    .line 16
    .line 17
    const-string v5, "getBetHistoryScreenModel()Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;"

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
    sput-object v1, La/q47;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gl5;

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    invoke-direct {v0, v1}, La/gl5;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/q47;->U1:La/gl5;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/p47;->a:La/p47;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/q47;->K1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/f97;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/l47;

    .line 24
    .line 25
    const/4 v2, 0x5

    .line 26
    invoke-direct {v1, p0, v2}, La/l47;-><init>(La/q47;B)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/q47;->P1:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/khf0;

    .line 39
    .line 40
    const-string v1, "BET_HISTORY_SCREEN_MODEL_KEY"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/q47;->Q1:La/khf0;

    .line 46
    .line 47
    new-instance v0, La/xn;

    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/yl3;

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/q47;->R1:La/ywq;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, La/q47;->S1:Z

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/q47;->O1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final H0()La/wdk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q47;->N1:La/wdk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "snackbarManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q47;->P1:La/a8z;

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
    .locals 63

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/yx5;->V(Landroid/content/Context;)V

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
    const-class v2, La/u37;

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
    instance-of v4, v1, La/u37;

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
    check-cast v3, La/u37;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v56

    .line 64
    sget-object v1, La/q47;->V1:[La/iiy;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    aget-object v1, v1, v2

    .line 68
    .line 69
    iget-object v2, v0, La/q47;->Q1:La/khf0;

    .line 70
    .line 71
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object/from16 v55, v1

    .line 76
    .line 77
    check-cast v55, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 78
    .line 79
    invoke-virtual/range {v56 .. v56}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v1, v3, La/u37;->c0:La/y3v;

    .line 83
    .line 84
    iget-object v5, v3, La/u37;->a:La/cad;

    .line 85
    .line 86
    iget-object v2, v3, La/u37;->e:La/ctf0;

    .line 87
    .line 88
    iget-object v4, v3, La/u37;->f:La/gst0;

    .line 89
    .line 90
    iget-object v6, v3, La/u37;->b:La/gii0;

    .line 91
    .line 92
    iget-object v7, v3, La/u37;->d:La/peg0;

    .line 93
    .line 94
    iget-object v8, v3, La/u37;->M:La/t47;

    .line 95
    .line 96
    iget-object v9, v3, La/u37;->x:La/k7u;

    .line 97
    .line 98
    iget-object v11, v3, La/u37;->G:La/wdd0;

    .line 99
    .line 100
    iget-object v10, v3, La/u37;->I:La/j1q0;

    .line 101
    .line 102
    iget-object v12, v3, La/u37;->J:La/r9u;

    .line 103
    .line 104
    iget-object v13, v3, La/u37;->w:La/fme;

    .line 105
    .line 106
    iget-object v14, v3, La/u37;->v:La/v6j0;

    .line 107
    .line 108
    iget-object v15, v3, La/u37;->q:La/l7k;

    .line 109
    .line 110
    move-object/from16 v16, v1

    .line 111
    .line 112
    iget-object v1, v3, La/u37;->n:La/au0;

    .line 113
    .line 114
    move-object/from16 v18, v1

    .line 115
    .line 116
    iget-object v1, v3, La/u37;->r:La/s64;

    .line 117
    .line 118
    move-object/from16 v25, v1

    .line 119
    .line 120
    iget-object v1, v3, La/u37;->O:La/sjl0;

    .line 121
    .line 122
    move-object/from16 v23, v1

    .line 123
    .line 124
    iget-object v1, v3, La/u37;->s:La/ix0;

    .line 125
    .line 126
    move-object/from16 v26, v1

    .line 127
    .line 128
    iget-object v1, v3, La/u37;->o:La/s64;

    .line 129
    .line 130
    move-object/from16 v19, v1

    .line 131
    .line 132
    iget-object v1, v3, La/u37;->p:La/cmt;

    .line 133
    .line 134
    move-object/from16 v20, v1

    .line 135
    .line 136
    iget-object v1, v3, La/u37;->u:La/kt2;

    .line 137
    .line 138
    move-object/from16 v27, v1

    .line 139
    .line 140
    iget-object v1, v3, La/u37;->i:La/m1e;

    .line 141
    .line 142
    move-object/from16 v22, v1

    .line 143
    .line 144
    iget-object v1, v3, La/u37;->P:La/hru;

    .line 145
    .line 146
    move-object/from16 v36, v1

    .line 147
    .line 148
    iget-object v1, v3, La/u37;->L:La/o470;

    .line 149
    .line 150
    move-object/from16 v33, v1

    .line 151
    .line 152
    iget-object v1, v3, La/u37;->S:La/q7d0;

    .line 153
    .line 154
    move-object/from16 v37, v1

    .line 155
    .line 156
    iget-object v1, v3, La/u37;->R:La/us3;

    .line 157
    .line 158
    move-object/from16 v39, v1

    .line 159
    .line 160
    iget-object v1, v3, La/u37;->K:La/b8u;

    .line 161
    .line 162
    move-object/from16 v35, v12

    .line 163
    .line 164
    iget-object v12, v3, La/u37;->H:La/wsf0;

    .line 165
    .line 166
    move-object/from16 v30, v1

    .line 167
    .line 168
    iget-object v1, v3, La/u37;->m:La/wdk0;

    .line 169
    .line 170
    move-object/from16 v58, v1

    .line 171
    .line 172
    iget-object v1, v3, La/u37;->C:La/duj;

    .line 173
    .line 174
    move-object/from16 v47, v1

    .line 175
    .line 176
    iget-object v1, v3, La/u37;->T:La/edo;

    .line 177
    .line 178
    move-object/from16 v40, v1

    .line 179
    .line 180
    iget-object v1, v3, La/u37;->X:La/j77;

    .line 181
    .line 182
    move-object/from16 v24, v13

    .line 183
    .line 184
    iget-object v13, v3, La/u37;->V:La/iip;

    .line 185
    .line 186
    move-object/from16 v29, v1

    .line 187
    .line 188
    iget-object v1, v3, La/u37;->N:La/fsd;

    .line 189
    .line 190
    move-object/from16 v34, v10

    .line 191
    .line 192
    iget-object v10, v3, La/u37;->U:La/sue;

    .line 193
    .line 194
    move-object/from16 v54, v9

    .line 195
    .line 196
    iget-object v9, v3, La/u37;->A:La/onv;

    .line 197
    .line 198
    move-object/from16 v28, v1

    .line 199
    .line 200
    iget-object v1, v3, La/u37;->j:La/btt0;

    .line 201
    .line 202
    move-object/from16 v50, v1

    .line 203
    .line 204
    iget-object v1, v3, La/u37;->k:La/knf0;

    .line 205
    .line 206
    move-object/from16 v51, v1

    .line 207
    .line 208
    iget-object v1, v3, La/u37;->B:La/ocl;

    .line 209
    .line 210
    move-object/from16 v45, v1

    .line 211
    .line 212
    iget-object v1, v3, La/u37;->l:La/ii;

    .line 213
    .line 214
    move-object/from16 v31, v1

    .line 215
    .line 216
    iget-object v1, v3, La/u37;->g:La/v88;

    .line 217
    .line 218
    move-object/from16 v49, v1

    .line 219
    .line 220
    iget-object v1, v3, La/u37;->h:La/pru;

    .line 221
    .line 222
    move-object/from16 v52, v1

    .line 223
    .line 224
    iget-object v1, v3, La/u37;->t:La/rou;

    .line 225
    .line 226
    move-object/from16 v32, v8

    .line 227
    .line 228
    iget-object v8, v3, La/u37;->D:La/ugf0;

    .line 229
    .line 230
    move-object/from16 v48, v1

    .line 231
    .line 232
    iget-object v1, v3, La/u37;->E:Lorg/xplatform/toto_bet/core/navigation/a;

    .line 233
    .line 234
    move-object/from16 v41, v1

    .line 235
    .line 236
    iget-object v1, v3, La/u37;->W:La/s2m0;

    .line 237
    .line 238
    move-object/from16 v42, v1

    .line 239
    .line 240
    iget-object v1, v3, La/u37;->y:La/jh70;

    .line 241
    .line 242
    move-object/from16 v53, v1

    .line 243
    .line 244
    iget-object v1, v3, La/u37;->F:La/peg0;

    .line 245
    .line 246
    move-object/from16 v17, v1

    .line 247
    .line 248
    iget-object v1, v3, La/u37;->Q:La/tgk;

    .line 249
    .line 250
    move-object/from16 v46, v1

    .line 251
    .line 252
    iget-object v1, v3, La/u37;->z:La/ouu;

    .line 253
    .line 254
    move-object/from16 v59, v6

    .line 255
    .line 256
    iget-object v6, v3, La/u37;->c:La/wsf0;

    .line 257
    .line 258
    move-object/from16 v57, v1

    .line 259
    .line 260
    iget-object v1, v3, La/u37;->Y:La/t37;

    .line 261
    .line 262
    move-object/from16 v60, v1

    .line 263
    .line 264
    iget-object v1, v3, La/u37;->Z:La/xdj;

    .line 265
    .line 266
    move-object/from16 v61, v1

    .line 267
    .line 268
    iget-object v1, v3, La/u37;->a0:La/wgu;

    .line 269
    .line 270
    move-object/from16 v38, v14

    .line 271
    .line 272
    iget-object v14, v3, La/u37;->b0:La/evz;

    .line 273
    .line 274
    iget-object v3, v3, La/u37;->d0:La/nr00;

    .line 275
    .line 276
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v54 .. v54}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v58 .. v58}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v59 .. v59}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v60 .. v60}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v61 .. v61}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-object/from16 v44, v4

    .line 361
    .line 362
    new-instance v4, La/mdi;

    .line 363
    .line 364
    move-object/from16 v62, v1

    .line 365
    .line 366
    move-object/from16 v43, v2

    .line 367
    .line 368
    move-object/from16 v21, v15

    .line 369
    .line 370
    move-object v15, v3

    .line 371
    invoke-direct/range {v4 .. v62}, La/mdi;-><init>(La/cad;La/wsf0;La/peg0;La/ugf0;La/onv;La/sue;La/wdd0;La/wsf0;La/iip;La/evz;La/nr00;La/y3v;La/peg0;La/au0;La/s64;La/cmt;La/l7k;La/m1e;La/sjl0;La/fme;La/s64;La/ix0;La/kt2;La/fsd;La/j77;La/b8u;La/ii;La/t47;La/o470;La/j1q0;La/r9u;La/hru;La/q7d0;La/v6j0;La/us3;La/edo;Lorg/xplatform/toto_bet/core/navigation/a;La/s2m0;La/ctf0;La/gst0;La/ocl;La/tgk;La/duj;La/rou;La/v88;La/btt0;La/knf0;La/pru;La/jh70;La/k7u;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;La/i1w0;La/ouu;La/wdk0;La/gii0;La/t37;La/xdj;La/wgu;)V

    .line 372
    .line 373
    .line 374
    move-object/from16 v2, v31

    .line 375
    .line 376
    move-object/from16 v1, v58

    .line 377
    .line 378
    iget-object v3, v4, La/mdi;->t:La/n5d0;

    .line 379
    .line 380
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    check-cast v3, La/pii;

    .line 385
    .line 386
    iput-object v3, v0, La/q47;->L1:La/pii;

    .line 387
    .line 388
    iget-object v3, v7, La/peg0;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v3, La/yzn0;

    .line 391
    .line 392
    invoke-virtual {v3}, La/yzn0;->i()La/ynb;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    iput-object v3, v0, La/q47;->M1:La/ynb;

    .line 400
    .line 401
    iput-object v1, v0, La/q47;->N1:La/wdk0;

    .line 402
    .line 403
    iput-object v2, v0, La/q47;->O1:La/ii;

    .line 404
    .line 405
    return-void

    .line 406
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 407
    .line 408
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/q47;->R1:La/ywq;

    .line 5
    .line 6
    invoke-virtual {p0}, La/ywq;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/w27;->a:La/w27;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/f37;->a:La/f37;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/y27;->a:La/y27;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/c37;->a:La/c37;

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, La/k47;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p2, p0, v0}, La/k47;-><init>(La/q47;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "REQUEST_BET_HISTORY_TYPE_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, La/k47;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p2, p0, v1}, La/k47;-><init>(La/q47;B)V

    .line 27
    .line 28
    .line 29
    const-string v2, "REQUEST_BET_HISTORY_HIDE_TYME_KEY"

    .line 30
    .line 31
    invoke-virtual {p1, v2, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, La/k47;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p2, p0, v2}, La/k47;-><init>(La/q47;B)V

    .line 42
    .line 43
    .line 44
    const-string v3, "HISTORY_DATE_FILTER_REQUEST_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v3, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, La/l47;

    .line 50
    .line 51
    invoke-direct {p1, p0, v0}, La/l47;-><init>(La/q47;B)V

    .line 52
    .line 53
    .line 54
    const-string p2, "REQUEST_BIND_EMAIL_DIALOG_KEY"

    .line 55
    .line 56
    invoke-static {p0, p2, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, La/l47;

    .line 60
    .line 61
    const/4 v3, 0x3

    .line 62
    invoke-direct {p1, p0, v3}, La/l47;-><init>(La/q47;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, La/k47;

    .line 73
    .line 74
    const/4 v4, 0x5

    .line 75
    invoke-direct {p2, p0, v4}, La/k47;-><init>(La/q47;B)V

    .line 76
    .line 77
    .line 78
    const-string v5, "HISTORY_DATE_PICKER_KEY"

    .line 79
    .line 80
    invoke-virtual {p1, v5, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, La/k47;

    .line 88
    .line 89
    const/4 v5, 0x6

    .line 90
    invoke-direct {p2, p0, v5}, La/k47;-><init>(La/q47;B)V

    .line 91
    .line 92
    .line 93
    const-string v6, "HISTORY_DATE_PICKER_MAIL_KEY"

    .line 94
    .line 95
    invoke-virtual {p1, v6, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, La/n47;

    .line 99
    .line 100
    invoke-direct {p1, p0, v3}, La/n47;-><init>(La/q47;B)V

    .line 101
    .line 102
    .line 103
    const-string p2, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 104
    .line 105
    invoke-static {p0, p2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance p2, La/k47;

    .line 113
    .line 114
    const/4 v6, 0x4

    .line 115
    invoke-direct {p2, p0, v6}, La/k47;-><init>(La/q47;B)V

    .line 116
    .line 117
    .line 118
    const-string v7, "REQUEST_BET_HISTORY_MENU_KEY"

    .line 119
    .line 120
    invoke-virtual {p1, v7, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance p2, La/k47;

    .line 128
    .line 129
    const/4 v7, 0x7

    .line 130
    invoke-direct {p2, p0, v7}, La/k47;-><init>(La/q47;B)V

    .line 131
    .line 132
    .line 133
    const-string v7, "REQUEST_BET_HISTORY_STATUS_FILTER_KEY"

    .line 134
    .line 135
    invoke-virtual {p1, v7, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, La/n47;

    .line 139
    .line 140
    invoke-direct {p1, p0, v5}, La/n47;-><init>(La/q47;B)V

    .line 141
    .line 142
    .line 143
    const-string p2, "REQUEST_EDIT_COUPON_DIALOG"

    .line 144
    .line 145
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    new-instance p1, La/l47;

    .line 149
    .line 150
    invoke-direct {p1, p0, v6}, La/l47;-><init>(La/q47;B)V

    .line 151
    .line 152
    .line 153
    const-string p2, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY"

    .line 154
    .line 155
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, La/l47;

    .line 159
    .line 160
    invoke-direct {p1, p0, v1}, La/l47;-><init>(La/q47;B)V

    .line 161
    .line 162
    .line 163
    const-string p2, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 164
    .line 165
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 166
    .line 167
    .line 168
    new-instance p1, La/l47;

    .line 169
    .line 170
    invoke-direct {p1, p0, v2}, La/l47;-><init>(La/q47;B)V

    .line 171
    .line 172
    .line 173
    invoke-static {p0, p2, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance p2, La/k47;

    .line 185
    .line 186
    const/16 v5, 0x9

    .line 187
    .line 188
    invoke-direct {p2, p0, v5}, La/k47;-><init>(La/q47;B)V

    .line 189
    .line 190
    .line 191
    const-string v5, "BET_INFO_FRAGMENT_REQUEST_KEY"

    .line 192
    .line 193
    invoke-virtual {p1, v5, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    new-instance p2, La/k47;

    .line 201
    .line 202
    const/16 v5, 0x8

    .line 203
    .line 204
    invoke-direct {p2, p0, v5}, La/k47;-><init>(La/q47;B)V

    .line 205
    .line 206
    .line 207
    const-string v5, "REQUEST_ALL_FILTERS_DIALOG_KEY"

    .line 208
    .line 209
    invoke-virtual {p1, v5, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 210
    .line 211
    .line 212
    new-instance p1, La/n47;

    .line 213
    .line 214
    invoke-direct {p1, p0, v2}, La/n47;-><init>(La/q47;B)V

    .line 215
    .line 216
    .line 217
    const-string p2, "REQUEST_BET_UPDATE_BY_ID"

    .line 218
    .line 219
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, La/n47;

    .line 223
    .line 224
    invoke-direct {p1, p0, v6}, La/n47;-><init>(La/q47;B)V

    .line 225
    .line 226
    .line 227
    const-string p2, "HISTORY_DAY_PICKER_KEY"

    .line 228
    .line 229
    invoke-static {p0, p2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    new-instance p1, La/n47;

    .line 233
    .line 234
    invoke-direct {p1, p0, v4}, La/n47;-><init>(La/q47;B)V

    .line 235
    .line 236
    .line 237
    const-string p2, "RESULT_KEY_CALENDAR_RANGE_REQUEST"

    .line 238
    .line 239
    invoke-static {p0, p2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    new-instance p2, La/k47;

    .line 247
    .line 248
    invoke-direct {p2, p0, v3}, La/k47;-><init>(La/q47;B)V

    .line 249
    .line 250
    .line 251
    const-string v3, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 252
    .line 253
    invoke-virtual {p1, v3, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 254
    .line 255
    .line 256
    new-instance p1, La/n47;

    .line 257
    .line 258
    invoke-direct {p1, p0, v0}, La/n47;-><init>(La/q47;B)V

    .line 259
    .line 260
    .line 261
    const-string p2, "REQUEST_KEY_SUCCESS_SALE"

    .line 262
    .line 263
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    sget-object p1, La/q47;->V1:[La/iiy;

    .line 267
    .line 268
    aget-object p1, p1, v1

    .line 269
    .line 270
    iget-object p2, p0, La/q47;->K1:La/s0r;

    .line 271
    .line 272
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    check-cast p1, La/aid;

    .line 280
    .line 281
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 282
    .line 283
    new-instance p2, La/owp0;

    .line 284
    .line 285
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 286
    .line 287
    .line 288
    new-instance v0, La/n47;

    .line 289
    .line 290
    invoke-direct {v0, p0, v1}, La/n47;-><init>(La/q47;B)V

    .line 291
    .line 292
    .line 293
    new-instance p0, La/ugd;

    .line 294
    .line 295
    const v1, -0x324de37a    # -3.7352672E8f

    .line 296
    .line 297
    .line 298
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-static {p1, p2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 302
    .line 303
    .line 304
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/q47;->S1:Z

    .line 2
    .line 3
    return p0
.end method
