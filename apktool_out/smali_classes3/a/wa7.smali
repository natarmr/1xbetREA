.class public final La/wa7;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wa7;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kj5",
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
.field public static final U1:La/kj5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/khf0;

.field public final M1:La/s0r;

.field public N1:La/x9i;

.field public O1:La/wdk0;

.field public P1:La/ii;

.field public final Q1:La/a8z;

.field public final R1:La/ywq;

.field public final S1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/wa7;

    .line 4
    .line 5
    const-string v2, "betId"

    .line 6
    .line 7
    const-string v3, "getBetId()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "betInfoScreenModel"

    .line 16
    .line 17
    const-string v5, "getBetInfoScreenModel()Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/wa7;->V1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kj5;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/wa7;->U1:La/kj5;

    .line 50
    .line 51
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
    new-instance v0, La/phf0;

    .line 8
    .line 9
    const-string v1, "BET_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/wa7;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/khf0;

    .line 17
    .line 18
    const-string v1, "BET_INFO_HISTORY_SCREEN_MODEL_KEY"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/wa7;->L1:La/khf0;

    .line 24
    .line 25
    sget-object v0, La/va7;->a:La/va7;

    .line 26
    .line 27
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/wa7;->M1:La/s0r;

    .line 32
    .line 33
    const-class v0, La/kd7;

    .line 34
    .line 35
    sget-object v1, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, La/ta7;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, p0, v2}, La/ta7;-><init>(La/wa7;B)V

    .line 45
    .line 46
    .line 47
    const/16 v2, 0xe

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/wa7;->Q1:La/a8z;

    .line 55
    .line 56
    new-instance v0, La/xn;

    .line 57
    .line 58
    const/4 v1, 0x7

    .line 59
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 60
    .line 61
    .line 62
    new-instance v1, La/yl3;

    .line 63
    .line 64
    const/4 v2, 0x3

    .line 65
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/wa7;->R1:La/ywq;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, La/wa7;->S1:Z

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/wa7;->P1:La/ii;

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

.method public final H0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/wa7;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wa7;->K1:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wa7;->Q1:La/a8z;

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
    .locals 65

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
    const-class v2, La/pa7;

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
    instance-of v4, v1, La/pa7;

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
    check-cast v3, La/pa7;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v51

    .line 64
    invoke-virtual {v0}, La/wa7;->H0()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v63

    .line 68
    sget-object v1, La/wa7;->V1:[La/iiy;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    aget-object v1, v1, v2

    .line 72
    .line 73
    iget-object v2, v0, La/wa7;->L1:La/khf0;

    .line 74
    .line 75
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object/from16 v64, v1

    .line 80
    .line 81
    check-cast v64, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 82
    .line 83
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v63 .. v63}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v5, v3, La/pa7;->a:La/cad;

    .line 90
    .line 91
    iget-object v15, v3, La/pa7;->c:La/ctf0;

    .line 92
    .line 93
    iget-object v1, v3, La/pa7;->e:La/k7u;

    .line 94
    .line 95
    iget-object v2, v3, La/pa7;->b:La/gii0;

    .line 96
    .line 97
    iget-object v4, v3, La/pa7;->i:La/m1e;

    .line 98
    .line 99
    iget-object v6, v3, La/pa7;->B:La/tgk;

    .line 100
    .line 101
    iget-object v7, v3, La/pa7;->C:La/q7d0;

    .line 102
    .line 103
    iget-object v14, v3, La/pa7;->D:La/onv;

    .line 104
    .line 105
    iget-object v8, v3, La/pa7;->F:La/us3;

    .line 106
    .line 107
    iget-object v9, v3, La/pa7;->j:La/duj;

    .line 108
    .line 109
    iget-object v10, v3, La/pa7;->E:La/t47;

    .line 110
    .line 111
    iget-object v11, v3, La/pa7;->l:La/sjl0;

    .line 112
    .line 113
    iget-object v12, v3, La/pa7;->m:La/j1q0;

    .line 114
    .line 115
    iget-object v13, v3, La/pa7;->t:La/wyu;

    .line 116
    .line 117
    move-object/from16 v44, v1

    .line 118
    .line 119
    iget-object v1, v3, La/pa7;->q:La/kuy;

    .line 120
    .line 121
    move-object/from16 v31, v6

    .line 122
    .line 123
    iget-object v6, v3, La/pa7;->n:La/ugf0;

    .line 124
    .line 125
    move-object/from16 v32, v7

    .line 126
    .line 127
    iget-object v7, v3, La/pa7;->s:La/wsf0;

    .line 128
    .line 129
    move-object/from16 v48, v1

    .line 130
    .line 131
    iget-object v1, v3, La/pa7;->G:La/bn6;

    .line 132
    .line 133
    move-object/from16 v52, v1

    .line 134
    .line 135
    iget-object v1, v3, La/pa7;->p:La/ocl;

    .line 136
    .line 137
    move-object/from16 v34, v8

    .line 138
    .line 139
    iget-object v8, v3, La/pa7;->k:La/wsf0;

    .line 140
    .line 141
    move-object/from16 v45, v1

    .line 142
    .line 143
    iget-object v1, v3, La/pa7;->Q:La/peg0;

    .line 144
    .line 145
    move-object/from16 v55, v1

    .line 146
    .line 147
    iget-object v1, v3, La/pa7;->y:La/au0;

    .line 148
    .line 149
    move-object/from16 v25, v11

    .line 150
    .line 151
    iget-object v11, v3, La/pa7;->N:La/s2m0;

    .line 152
    .line 153
    move-object/from16 v19, v1

    .line 154
    .line 155
    iget-object v1, v3, La/pa7;->b0:La/wdk0;

    .line 156
    .line 157
    move-object/from16 v30, v1

    .line 158
    .line 159
    iget-object v1, v3, La/pa7;->x:La/s64;

    .line 160
    .line 161
    move-object/from16 v28, v1

    .line 162
    .line 163
    iget-object v1, v3, La/pa7;->w:La/o470;

    .line 164
    .line 165
    move-object/from16 v27, v1

    .line 166
    .line 167
    iget-object v1, v3, La/pa7;->r:La/edo;

    .line 168
    .line 169
    move-object/from16 v43, v1

    .line 170
    .line 171
    iget-object v1, v3, La/pa7;->o:La/b8u;

    .line 172
    .line 173
    move-object/from16 v46, v1

    .line 174
    .line 175
    iget-object v1, v3, La/pa7;->H:La/ix0;

    .line 176
    .line 177
    move-object/from16 v38, v1

    .line 178
    .line 179
    iget-object v1, v3, La/pa7;->J:La/kt2;

    .line 180
    .line 181
    move-object/from16 v37, v1

    .line 182
    .line 183
    iget-object v1, v3, La/pa7;->I:La/gst0;

    .line 184
    .line 185
    move-object/from16 v26, v1

    .line 186
    .line 187
    iget-object v1, v3, La/pa7;->R:La/fsd;

    .line 188
    .line 189
    move-object/from16 v16, v1

    .line 190
    .line 191
    iget-object v1, v3, La/pa7;->S:La/b3c0;

    .line 192
    .line 193
    move-object/from16 v17, v1

    .line 194
    .line 195
    iget-object v1, v3, La/pa7;->W:La/h3c;

    .line 196
    .line 197
    move-object/from16 v23, v1

    .line 198
    .line 199
    iget-object v1, v3, La/pa7;->X:La/gr00;

    .line 200
    .line 201
    move-object/from16 v20, v13

    .line 202
    .line 203
    iget-object v13, v3, La/pa7;->Y:La/roi0;

    .line 204
    .line 205
    move-object/from16 v22, v1

    .line 206
    .line 207
    iget-object v1, v3, La/pa7;->Z:La/qv2;

    .line 208
    .line 209
    move-object/from16 v24, v1

    .line 210
    .line 211
    iget-object v1, v3, La/pa7;->a0:La/vqc;

    .line 212
    .line 213
    move-object/from16 v21, v1

    .line 214
    .line 215
    iget-object v1, v3, La/pa7;->M:La/ouu;

    .line 216
    .line 217
    move-object/from16 v54, v9

    .line 218
    .line 219
    iget-object v9, v3, La/pa7;->L:La/sue;

    .line 220
    .line 221
    move-object/from16 v39, v1

    .line 222
    .line 223
    iget-object v1, v3, La/pa7;->U:La/jh70;

    .line 224
    .line 225
    move-object/from16 v49, v1

    .line 226
    .line 227
    iget-object v1, v3, La/pa7;->O:Lorg/xplatform/toto_bet/core/navigation/a;

    .line 228
    .line 229
    move-object/from16 v29, v1

    .line 230
    .line 231
    iget-object v1, v3, La/pa7;->z:La/l7k;

    .line 232
    .line 233
    move-object/from16 v18, v1

    .line 234
    .line 235
    iget-object v1, v3, La/pa7;->K:La/v88;

    .line 236
    .line 237
    move-object/from16 v36, v1

    .line 238
    .line 239
    iget-object v1, v3, La/pa7;->A:La/s64;

    .line 240
    .line 241
    move-object/from16 v33, v10

    .line 242
    .line 243
    iget-object v10, v3, La/pa7;->e0:La/wdd0;

    .line 244
    .line 245
    move-object/from16 v40, v1

    .line 246
    .line 247
    iget-object v1, v3, La/pa7;->u:La/cmt;

    .line 248
    .line 249
    move-object/from16 v60, v1

    .line 250
    .line 251
    iget-object v1, v3, La/pa7;->c0:La/hru;

    .line 252
    .line 253
    move-object/from16 v61, v1

    .line 254
    .line 255
    iget-object v1, v3, La/pa7;->d0:La/ocl;

    .line 256
    .line 257
    move-object/from16 v62, v1

    .line 258
    .line 259
    iget-object v1, v3, La/pa7;->v:La/r9u;

    .line 260
    .line 261
    move-object/from16 v57, v1

    .line 262
    .line 263
    iget-object v1, v3, La/pa7;->f:La/fme;

    .line 264
    .line 265
    move-object/from16 v58, v1

    .line 266
    .line 267
    iget-object v1, v3, La/pa7;->T:La/y3v;

    .line 268
    .line 269
    move-object/from16 v42, v12

    .line 270
    .line 271
    iget-object v12, v3, La/pa7;->P:La/evz;

    .line 272
    .line 273
    move-object/from16 v50, v1

    .line 274
    .line 275
    iget-object v1, v3, La/pa7;->V:La/ii;

    .line 276
    .line 277
    move-object/from16 v35, v1

    .line 278
    .line 279
    iget-object v1, v3, La/pa7;->g:La/btt0;

    .line 280
    .line 281
    move-object/from16 v59, v1

    .line 282
    .line 283
    iget-object v1, v3, La/pa7;->d:La/knf0;

    .line 284
    .line 285
    iget-object v3, v3, La/pa7;->h:La/pru;

    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v57 .. v57}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v58 .. v58}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v59 .. v59}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    move-object/from16 v53, v4

    .line 363
    .line 364
    new-instance v4, La/y9i;

    .line 365
    .line 366
    move-object/from16 v47, v1

    .line 367
    .line 368
    move-object/from16 v41, v2

    .line 369
    .line 370
    move-object/from16 v56, v3

    .line 371
    .line 372
    invoke-direct/range {v4 .. v64}, La/y9i;-><init>(La/cad;La/ugf0;La/wsf0;La/wsf0;La/sue;La/wdd0;La/s2m0;La/evz;La/roi0;La/onv;La/ctf0;La/fsd;La/b3c0;La/l7k;La/au0;La/wyu;La/vqc;La/gr00;La/h3c;La/qv2;La/sjl0;La/gst0;La/o470;La/s64;Lorg/xplatform/toto_bet/core/navigation/a;La/wdk0;La/tgk;La/q7d0;La/t47;La/us3;La/ii;La/v88;La/kt2;La/ix0;La/ouu;La/s64;La/gii0;La/j1q0;La/edo;La/k7u;La/ocl;La/b8u;La/knf0;La/kuy;La/jh70;La/y3v;La/i1w0;La/bn6;La/m1e;La/duj;La/peg0;La/pru;La/r9u;La/fme;La/btt0;La/cmt;La/hru;La/ocl;Ljava/lang/String;Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v1, v30

    .line 376
    .line 377
    move-object/from16 v2, v35

    .line 378
    .line 379
    iget-object v3, v4, La/y9i;->g0:La/n5d0;

    .line 380
    .line 381
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    check-cast v3, La/x9i;

    .line 386
    .line 387
    iput-object v3, v0, La/wa7;->N1:La/x9i;

    .line 388
    .line 389
    iput-object v1, v0, La/wa7;->O1:La/wdk0;

    .line 390
    .line 391
    iput-object v2, v0, La/wa7;->P1:La/ii;

    .line 392
    .line 393
    return-void

    .line 394
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 395
    .line 396
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
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
    iget-object p0, p0, La/wa7;->R1:La/ywq;

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
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ea7;->a:La/ea7;

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
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ga7;->a:La/ga7;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

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
    new-instance p2, La/sa7;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p2, p0, v0}, La/sa7;-><init>(La/wa7;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, La/ta7;

    .line 20
    .line 21
    const/4 p2, 0x7

    .line 22
    invoke-direct {p1, p0, p2}, La/ta7;-><init>(La/wa7;B)V

    .line 23
    .line 24
    .line 25
    const-string p2, "REQUEST_COUPON_DIALOG_KEY"

    .line 26
    .line 27
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, La/ta7;

    .line 31
    .line 32
    const/4 p2, 0x5

    .line 33
    invoke-direct {p1, p0, p2}, La/ta7;-><init>(La/wa7;B)V

    .line 34
    .line 35
    .line 36
    const-string p2, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 37
    .line 38
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/ta7;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-direct {p1, p0, v1}, La/ta7;-><init>(La/wa7;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, p2, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/ta7;

    .line 51
    .line 52
    const/4 p2, 0x4

    .line 53
    invoke-direct {p1, p0, p2}, La/ta7;-><init>(La/wa7;B)V

    .line 54
    .line 55
    .line 56
    const-string p2, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY"

    .line 57
    .line 58
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/ta7;

    .line 62
    .line 63
    const/16 p2, 0x8

    .line 64
    .line 65
    invoke-direct {p1, p0, p2}, La/ta7;-><init>(La/wa7;B)V

    .line 66
    .line 67
    .line 68
    const-string p2, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 69
    .line 70
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, La/ta7;

    .line 74
    .line 75
    invoke-direct {p1, p0, v0}, La/ta7;-><init>(La/wa7;B)V

    .line 76
    .line 77
    .line 78
    const-string p2, "REQUEST_AUTO_BET_CANCEL_DIALOG_KEY"

    .line 79
    .line 80
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    new-instance p1, La/ta7;

    .line 84
    .line 85
    const/4 p2, 0x1

    .line 86
    invoke-direct {p1, p0, p2}, La/ta7;-><init>(La/wa7;B)V

    .line 87
    .line 88
    .line 89
    const-string v1, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 90
    .line 91
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance v1, La/sa7;

    .line 99
    .line 100
    invoke-direct {v1, p0, p2}, La/sa7;-><init>(La/wa7;B)V

    .line 101
    .line 102
    .line 103
    const-string v2, "REQUEST_MENU_ITEM_KEY"

    .line 104
    .line 105
    invoke-virtual {p1, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/ra7;

    .line 109
    .line 110
    invoke-direct {p1, p0, v0}, La/ra7;-><init>(La/wa7;B)V

    .line 111
    .line 112
    .line 113
    const-string v0, "REQUEST_KEY_SUCCESS_SALE"

    .line 114
    .line 115
    invoke-static {p0, v0, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    new-instance p1, La/ta7;

    .line 119
    .line 120
    const/4 v0, 0x3

    .line 121
    invoke-direct {p1, p0, v0}, La/ta7;-><init>(La/wa7;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 125
    .line 126
    .line 127
    sget-object p1, La/wa7;->V1:[La/iiy;

    .line 128
    .line 129
    const/4 v0, 0x2

    .line 130
    aget-object p1, p1, v0

    .line 131
    .line 132
    iget-object v0, p0, La/wa7;->M1:La/s0r;

    .line 133
    .line 134
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    check-cast p1, La/aid;

    .line 142
    .line 143
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 144
    .line 145
    new-instance v0, La/owp0;

    .line 146
    .line 147
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, La/ra7;

    .line 151
    .line 152
    invoke-direct {v1, p0, p2}, La/ra7;-><init>(La/wa7;B)V

    .line 153
    .line 154
    .line 155
    new-instance p0, La/ugd;

    .line 156
    .line 157
    const v2, 0x2c0c2016

    .line 158
    .line 159
    .line 160
    invoke-direct {p0, v2, p2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/wa7;->S1:Z

    .line 2
    .line 3
    return p0
.end method
