.class public final La/gk7;
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
        "La/gk7;",
        "La/yx5;",
        "La/ygt0;",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final U1:La/kl5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/khf0;

.field public M1:La/fiu0;

.field public N1:La/ynb;

.field public O1:La/wdk0;

.field public P1:La/ii;

.field public final Q1:La/a8z;

.field public final R1:Z

.field public final S1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/gk7;

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
    sput-object v1, La/gk7;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kl5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/gk7;->U1:La/kl5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/fk7;->a:La/fk7;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/gk7;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/khf0;

    .line 16
    .line 17
    const-string v1, "BET_HISTORY_SCREEN_MODEL_KEY"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/gk7;->L1:La/khf0;

    .line 23
    .line 24
    const-class v0, La/fm7;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/bk7;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/bk7;-><init>(La/gk7;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/gk7;->Q1:La/a8z;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, La/gk7;->R1:Z

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
    const/4 v2, 0x4

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
    iput-object v0, p0, La/gk7;->S1:La/ywq;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/gk7;->P1:La/ii;

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
    iget-object p0, p0, La/gk7;->O1:La/wdk0;

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
    iget-object p0, p0, La/gk7;->Q1:La/a8z;

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
    .locals 53

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
    const-class v2, La/pj7;

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
    instance-of v4, v1, La/pj7;

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
    check-cast v3, La/pj7;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v49

    .line 64
    sget-object v1, La/gk7;->V1:[La/iiy;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    aget-object v1, v1, v2

    .line 68
    .line 69
    iget-object v2, v0, La/gk7;->L1:La/khf0;

    .line 70
    .line 71
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object/from16 v16, v1

    .line 76
    .line 77
    check-cast v16, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 78
    .line 79
    invoke-virtual/range {v49 .. v49}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v15, v3, La/pj7;->U:La/y3v;

    .line 83
    .line 84
    iget-object v5, v3, La/pj7;->a:La/cad;

    .line 85
    .line 86
    iget-object v1, v3, La/pj7;->e:La/ctf0;

    .line 87
    .line 88
    iget-object v2, v3, La/pj7;->f:La/gst0;

    .line 89
    .line 90
    iget-object v4, v3, La/pj7;->b:La/gii0;

    .line 91
    .line 92
    iget-object v7, v3, La/pj7;->d:La/peg0;

    .line 93
    .line 94
    iget-object v6, v3, La/pj7;->H:La/t47;

    .line 95
    .line 96
    iget-object v8, v3, La/pj7;->o:La/k7u;

    .line 97
    .line 98
    iget-object v9, v3, La/pj7;->N:La/edo;

    .line 99
    .line 100
    iget-object v10, v3, La/pj7;->B:La/wdd0;

    .line 101
    .line 102
    iget-object v11, v3, La/pj7;->D:La/j1q0;

    .line 103
    .line 104
    iget-object v12, v3, La/pj7;->E:La/r9u;

    .line 105
    .line 106
    iget-object v13, v3, La/pj7;->u:La/au0;

    .line 107
    .line 108
    iget-object v14, v3, La/pj7;->v:La/s64;

    .line 109
    .line 110
    move-object/from16 v38, v1

    .line 111
    .line 112
    iget-object v1, v3, La/pj7;->w:La/ix0;

    .line 113
    .line 114
    move-object/from16 v22, v1

    .line 115
    .line 116
    iget-object v1, v3, La/pj7;->x:La/s64;

    .line 117
    .line 118
    move-object/from16 v26, v1

    .line 119
    .line 120
    iget-object v1, v3, La/pj7;->y:La/kt2;

    .line 121
    .line 122
    move-object/from16 v25, v1

    .line 123
    .line 124
    iget-object v1, v3, La/pj7;->R:La/s2m0;

    .line 125
    .line 126
    move-object/from16 v24, v1

    .line 127
    .line 128
    iget-object v1, v3, La/pj7;->I:La/hru;

    .line 129
    .line 130
    move-object/from16 v35, v1

    .line 131
    .line 132
    iget-object v1, v3, La/pj7;->G:La/o470;

    .line 133
    .line 134
    move-object/from16 v32, v1

    .line 135
    .line 136
    iget-object v1, v3, La/pj7;->m:La/sjl0;

    .line 137
    .line 138
    move-object/from16 v27, v1

    .line 139
    .line 140
    iget-object v1, v3, La/pj7;->L:La/q7d0;

    .line 141
    .line 142
    move-object/from16 v36, v1

    .line 143
    .line 144
    iget-object v1, v3, La/pj7;->K:La/us3;

    .line 145
    .line 146
    move-object/from16 v37, v1

    .line 147
    .line 148
    iget-object v1, v3, La/pj7;->F:La/b8u;

    .line 149
    .line 150
    move-object/from16 v33, v11

    .line 151
    .line 152
    iget-object v11, v3, La/pj7;->C:La/wsf0;

    .line 153
    .line 154
    move-object/from16 v30, v1

    .line 155
    .line 156
    iget-object v1, v3, La/pj7;->n:La/wdk0;

    .line 157
    .line 158
    move-object/from16 v51, v1

    .line 159
    .line 160
    iget-object v1, v3, La/pj7;->s:La/duj;

    .line 161
    .line 162
    move-object/from16 v42, v1

    .line 163
    .line 164
    iget-object v1, v3, La/pj7;->S:La/fme;

    .line 165
    .line 166
    move-object/from16 v29, v1

    .line 167
    .line 168
    iget-object v1, v3, La/pj7;->i:La/peg0;

    .line 169
    .line 170
    move-object/from16 v34, v12

    .line 171
    .line 172
    iget-object v12, v3, La/pj7;->P:La/iip;

    .line 173
    .line 174
    move-object/from16 v21, v9

    .line 175
    .line 176
    iget-object v9, v3, La/pj7;->O:La/sue;

    .line 177
    .line 178
    move-object/from16 v18, v1

    .line 179
    .line 180
    iget-object v1, v3, La/pj7;->j:La/btt0;

    .line 181
    .line 182
    move-object/from16 v44, v1

    .line 183
    .line 184
    iget-object v1, v3, La/pj7;->k:La/knf0;

    .line 185
    .line 186
    move-object/from16 v45, v1

    .line 187
    .line 188
    iget-object v1, v3, La/pj7;->r:La/ocl;

    .line 189
    .line 190
    move-object/from16 v40, v1

    .line 191
    .line 192
    iget-object v1, v3, La/pj7;->l:La/ii;

    .line 193
    .line 194
    move-object/from16 v31, v1

    .line 195
    .line 196
    iget-object v1, v3, La/pj7;->g:La/v88;

    .line 197
    .line 198
    move-object/from16 v43, v1

    .line 199
    .line 200
    iget-object v1, v3, La/pj7;->h:La/pru;

    .line 201
    .line 202
    move-object/from16 v48, v8

    .line 203
    .line 204
    iget-object v8, v3, La/pj7;->t:La/ugf0;

    .line 205
    .line 206
    move-object/from16 v46, v1

    .line 207
    .line 208
    iget-object v1, v3, La/pj7;->z:La/l7k;

    .line 209
    .line 210
    move-object/from16 v28, v1

    .line 211
    .line 212
    iget-object v1, v3, La/pj7;->p:La/jh70;

    .line 213
    .line 214
    move-object/from16 v47, v1

    .line 215
    .line 216
    iget-object v1, v3, La/pj7;->A:Lorg/xplatform/toto_bet/core/navigation/a;

    .line 217
    .line 218
    move-object/from16 v23, v1

    .line 219
    .line 220
    iget-object v1, v3, La/pj7;->J:La/tgk;

    .line 221
    .line 222
    move-object/from16 v41, v1

    .line 223
    .line 224
    iget-object v1, v3, La/pj7;->q:La/ouu;

    .line 225
    .line 226
    move-object/from16 v50, v1

    .line 227
    .line 228
    iget-object v1, v3, La/pj7;->Q:La/m1e;

    .line 229
    .line 230
    move-object/from16 v17, v6

    .line 231
    .line 232
    iget-object v6, v3, La/pj7;->c:La/wsf0;

    .line 233
    .line 234
    move-object/from16 v19, v13

    .line 235
    .line 236
    iget-object v13, v3, La/pj7;->T:La/evz;

    .line 237
    .line 238
    iget-object v3, v3, La/pj7;->M:La/onv;

    .line 239
    .line 240
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-object/from16 v52, v4

    .line 307
    .line 308
    new-instance v4, La/db;

    .line 309
    .line 310
    move-object/from16 v17, v1

    .line 311
    .line 312
    move-object/from16 v39, v2

    .line 313
    .line 314
    move-object/from16 v20, v14

    .line 315
    .line 316
    move-object v14, v3

    .line 317
    invoke-direct/range {v4 .. v52}, La/db;-><init>(La/cad;La/wsf0;La/peg0;La/ugf0;La/sue;La/wdd0;La/wsf0;La/iip;La/evz;La/onv;La/y3v;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;La/m1e;La/peg0;La/au0;La/s64;La/edo;La/ix0;Lorg/xplatform/toto_bet/core/navigation/a;La/s2m0;La/kt2;La/s64;La/sjl0;La/l7k;La/fme;La/b8u;La/ii;La/o470;La/j1q0;La/r9u;La/hru;La/q7d0;La/us3;La/ctf0;La/gst0;La/ocl;La/tgk;La/duj;La/v88;La/btt0;La/knf0;La/pru;La/jh70;La/k7u;La/i1w0;La/ouu;La/wdk0;La/gii0;)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v2, v31

    .line 321
    .line 322
    move-object/from16 v1, v51

    .line 323
    .line 324
    new-instance v3, La/fiu0;

    .line 325
    .line 326
    iget-object v4, v4, La/db;->V:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v4, La/f7i;

    .line 329
    .line 330
    const-class v5, La/fm7;

    .line 331
    .line 332
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 337
    .line 338
    .line 339
    iput-object v3, v0, La/gk7;->M1:La/fiu0;

    .line 340
    .line 341
    iget-object v3, v7, La/peg0;->b:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v3, La/yzn0;

    .line 344
    .line 345
    invoke-virtual {v3}, La/yzn0;->i()La/ynb;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iput-object v3, v0, La/gk7;->N1:La/ynb;

    .line 353
    .line 354
    iput-object v1, v0, La/gk7;->O1:La/wdk0;

    .line 355
    .line 356
    iput-object v2, v0, La/gk7;->P1:La/ii;

    .line 357
    .line 358
    return-void

    .line 359
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 360
    .line 361
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/pi7;->a:La/pi7;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/gk7;->S1:La/ywq;

    .line 11
    .line 12
    invoke-virtual {v0}, La/ywq;->b()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 17
    .line 18
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
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/cj7;->a:La/cj7;

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
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/lj7;->a:La/lj7;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/gk7;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/jj7;->a:La/jj7;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, La/bk7;

    .line 5
    .line 6
    const/4 p2, 0x3

    .line 7
    invoke-direct {p1, p0, p2}, La/bk7;-><init>(La/gk7;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/bk7;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {p1, p0, v1}, La/bk7;-><init>(La/gk7;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, La/dk7;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, v1}, La/dk7;-><init>(La/gk7;B)V

    .line 32
    .line 33
    .line 34
    const-string v2, "REQUEST_BET_HISTORY_MENU_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, La/bk7;

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    invoke-direct {p1, p0, v0}, La/bk7;-><init>(La/gk7;B)V

    .line 43
    .line 44
    .line 45
    const-string v2, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY"

    .line 46
    .line 47
    invoke-static {p0, v2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v2, La/dk7;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-direct {v2, p0, v3}, La/dk7;-><init>(La/gk7;B)V

    .line 58
    .line 59
    .line 60
    const-string v4, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 61
    .line 62
    invoke-virtual {p1, v4, p0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/ek7;

    .line 66
    .line 67
    invoke-direct {p1, p0, p2}, La/ek7;-><init>(La/gk7;B)V

    .line 68
    .line 69
    .line 70
    const-string p2, "REQUEST_KEY_SUCCESS_SALE"

    .line 71
    .line 72
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/ek7;

    .line 76
    .line 77
    invoke-direct {p1, p0, v3}, La/ek7;-><init>(La/gk7;B)V

    .line 78
    .line 79
    .line 80
    const-string p2, "REQUEST_EDIT_COUPON_DIALOG"

    .line 81
    .line 82
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, La/ek7;

    .line 86
    .line 87
    invoke-direct {p1, p0, v0}, La/ek7;-><init>(La/gk7;B)V

    .line 88
    .line 89
    .line 90
    const-string p2, "REQUEST_BET_UPDATE_BY_ID"

    .line 91
    .line 92
    invoke-static {p0, p2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, La/bk7;

    .line 96
    .line 97
    invoke-direct {p1, p0, v3}, La/bk7;-><init>(La/gk7;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, La/gk7;->V1:[La/iiy;

    .line 104
    .line 105
    aget-object p1, p1, v1

    .line 106
    .line 107
    iget-object p2, p0, La/gk7;->K1:La/s0r;

    .line 108
    .line 109
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast p1, La/aid;

    .line 117
    .line 118
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 119
    .line 120
    new-instance p2, La/owp0;

    .line 121
    .line 122
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/ek7;

    .line 126
    .line 127
    invoke-direct {v0, p0, v1}, La/ek7;-><init>(La/gk7;B)V

    .line 128
    .line 129
    .line 130
    new-instance p0, La/ugd;

    .line 131
    .line 132
    const v1, 0x284327fd

    .line 133
    .line 134
    .line 135
    invoke-direct {p0, v1, v3, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/gk7;->R1:Z

    .line 2
    .line 3
    return p0
.end method
