.class public final La/nf0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/nf0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final S1:La/hfk0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/yzn0;

.field public final L1:La/yzn0;

.field public M1:La/fiu0;

.field public N1:La/ynb;

.field public O1:La/ii;

.field public final P1:La/a8z;

.field public final Q1:La/s0r;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/nf0;

    .line 4
    .line 5
    const-string v2, "bundlePartitionToOpen"

    .line 6
    .line 7
    const-string v3, "getBundlePartitionToOpen()Lorg/xplatform/aggregator/api/navigation/PartTypeOneModel;"

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
    const-string v3, "bundleNavigationSource"

    .line 16
    .line 17
    const-string v5, "getBundleNavigationSource()Lorg/xplatform/aggregator/api/navigation/AggregatorNavigationSource;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/nf0;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/hfk0;

    .line 45
    .line 46
    const/16 v1, 0xd

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/nf0;->S1:La/hfk0;

    .line 52
    .line 53
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
    new-instance v0, La/yzn0;

    .line 8
    .line 9
    const-string v1, "CATEGORY_TO_OPEN_ITEM"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/nf0;->K1:La/yzn0;

    .line 15
    .line 16
    new-instance v0, La/yzn0;

    .line 17
    .line 18
    const-string v1, "NAVIGATION_SOURCE_KEY"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/nf0;->L1:La/yzn0;

    .line 24
    .line 25
    const-class v0, La/eh0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/lf0;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, La/lf0;-><init>(La/nf0;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/nf0;->P1:La/a8z;

    .line 44
    .line 45
    sget-object v0, La/mf0;->a:La/mf0;

    .line 46
    .line 47
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/nf0;->Q1:La/s0r;

    .line 52
    .line 53
    iput-boolean v2, p0, La/nf0;->R1:Z

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/nf0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/nf0;->Q1:La/s0r;

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
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/o00;

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    invoke-direct {v0, p0, v1}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/ugd;

    .line 26
    .line 27
    const v1, -0x1fa52079

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final C0()V
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/qh0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/qh0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/qh0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    sget-object v2, La/nf0;->U1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/nf0;->K1:La/yzn0;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v12, v1

    .line 69
    check-cast v12, La/fs80;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    aget-object v1, v2, v1

    .line 73
    .line 74
    iget-object v2, v0, La/nf0;->L1:La/yzn0;

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v13, v1

    .line 81
    check-cast v13, La/q91;

    .line 82
    .line 83
    iget-object v5, v3, La/qh0;->b:La/cad;

    .line 84
    .line 85
    iget-object v15, v3, La/qh0;->p:La/oeg0;

    .line 86
    .line 87
    iget-object v7, v3, La/qh0;->E:La/wsf0;

    .line 88
    .line 89
    iget-object v1, v3, La/qh0;->c:La/uzc0;

    .line 90
    .line 91
    iget-object v2, v3, La/qh0;->d:La/kt2;

    .line 92
    .line 93
    iget-object v4, v3, La/qh0;->e:La/s31;

    .line 94
    .line 95
    iget-object v6, v3, La/qh0;->g:La/xk0;

    .line 96
    .line 97
    iget-object v8, v3, La/qh0;->h:La/duj;

    .line 98
    .line 99
    iget-object v9, v3, La/qh0;->i:La/o91;

    .line 100
    .line 101
    iget-object v10, v3, La/qh0;->j:La/s91;

    .line 102
    .line 103
    iget-object v14, v3, La/qh0;->A:La/ii;

    .line 104
    .line 105
    iget-object v11, v3, La/qh0;->l:La/gii0;

    .line 106
    .line 107
    move-object/from16 v16, v1

    .line 108
    .line 109
    iget-object v1, v3, La/qh0;->m:La/m1e;

    .line 110
    .line 111
    move-object/from16 v22, v1

    .line 112
    .line 113
    iget-object v1, v3, La/qh0;->n:La/v88;

    .line 114
    .line 115
    move-object/from16 v23, v1

    .line 116
    .line 117
    iget-object v1, v3, La/qh0;->o:La/g2v;

    .line 118
    .line 119
    move-object/from16 v17, v6

    .line 120
    .line 121
    iget-object v6, v3, La/qh0;->a:La/ehf0;

    .line 122
    .line 123
    move-object/from16 v24, v1

    .line 124
    .line 125
    iget-object v1, v3, La/qh0;->k:La/r9u;

    .line 126
    .line 127
    move-object/from16 v18, v1

    .line 128
    .line 129
    iget-object v1, v3, La/qh0;->f:La/h03;

    .line 130
    .line 131
    move-object/from16 v21, v1

    .line 132
    .line 133
    iget-object v1, v3, La/qh0;->q:La/pru;

    .line 134
    .line 135
    move-object/from16 v25, v1

    .line 136
    .line 137
    iget-object v1, v3, La/qh0;->r:La/btt0;

    .line 138
    .line 139
    move-object/from16 v19, v8

    .line 140
    .line 141
    iget-object v8, v3, La/qh0;->F:La/peg0;

    .line 142
    .line 143
    move-object/from16 v20, v9

    .line 144
    .line 145
    iget-object v9, v3, La/qh0;->G:La/wsf0;

    .line 146
    .line 147
    move-object/from16 v26, v20

    .line 148
    .line 149
    move-object/from16 v20, v10

    .line 150
    .line 151
    iget-object v10, v3, La/qh0;->H:La/peg0;

    .line 152
    .line 153
    move-object/from16 v27, v1

    .line 154
    .line 155
    iget-object v1, v3, La/qh0;->s:La/ctf0;

    .line 156
    .line 157
    move-object/from16 v28, v1

    .line 158
    .line 159
    iget-object v1, v3, La/qh0;->t:La/xmt;

    .line 160
    .line 161
    move-object/from16 v29, v1

    .line 162
    .line 163
    iget-object v1, v3, La/qh0;->u:La/ix0;

    .line 164
    .line 165
    move-object/from16 v30, v1

    .line 166
    .line 167
    iget-object v1, v3, La/qh0;->v:La/fsd;

    .line 168
    .line 169
    move-object/from16 v31, v1

    .line 170
    .line 171
    iget-object v1, v3, La/qh0;->w:La/gg5;

    .line 172
    .line 173
    move-object/from16 v32, v1

    .line 174
    .line 175
    iget-object v1, v3, La/qh0;->x:La/l7k;

    .line 176
    .line 177
    move-object/from16 v33, v1

    .line 178
    .line 179
    iget-object v1, v3, La/qh0;->y:La/cyu;

    .line 180
    .line 181
    move-object/from16 v34, v1

    .line 182
    .line 183
    iget-object v1, v3, La/qh0;->z:La/wgu;

    .line 184
    .line 185
    move-object/from16 v35, v1

    .line 186
    .line 187
    iget-object v1, v3, La/qh0;->B:La/gst0;

    .line 188
    .line 189
    move-object/from16 v36, v1

    .line 190
    .line 191
    iget-object v1, v3, La/qh0;->D:La/wdk0;

    .line 192
    .line 193
    move-object/from16 v37, v1

    .line 194
    .line 195
    iget-object v1, v3, La/qh0;->C:La/wyu;

    .line 196
    .line 197
    move-object/from16 v38, v1

    .line 198
    .line 199
    iget-object v1, v3, La/qh0;->I:La/dmt;

    .line 200
    .line 201
    move-object/from16 v39, v1

    .line 202
    .line 203
    iget-object v1, v3, La/qh0;->J:La/b3c0;

    .line 204
    .line 205
    move-object/from16 v40, v1

    .line 206
    .line 207
    iget-object v1, v3, La/qh0;->K:La/grj;

    .line 208
    .line 209
    move-object/from16 v41, v1

    .line 210
    .line 211
    iget-object v1, v3, La/qh0;->L:La/jlx;

    .line 212
    .line 213
    move-object/from16 v42, v1

    .line 214
    .line 215
    iget-object v1, v3, La/qh0;->M:La/pyt;

    .line 216
    .line 217
    move-object/from16 v43, v1

    .line 218
    .line 219
    iget-object v1, v3, La/qh0;->N:La/qyg0;

    .line 220
    .line 221
    move-object/from16 v44, v1

    .line 222
    .line 223
    iget-object v1, v3, La/qh0;->O:La/pyg0;

    .line 224
    .line 225
    move-object/from16 v45, v1

    .line 226
    .line 227
    iget-object v1, v3, La/qh0;->Q:La/knf0;

    .line 228
    .line 229
    move-object/from16 v46, v1

    .line 230
    .line 231
    iget-object v1, v3, La/qh0;->R:La/x0u;

    .line 232
    .line 233
    move-object/from16 v47, v1

    .line 234
    .line 235
    iget-object v1, v3, La/qh0;->P:La/r9s0;

    .line 236
    .line 237
    move-object/from16 v48, v1

    .line 238
    .line 239
    iget-object v1, v3, La/qh0;->S:La/gg5;

    .line 240
    .line 241
    move-object/from16 v49, v1

    .line 242
    .line 243
    iget-object v1, v3, La/qh0;->T:La/s64;

    .line 244
    .line 245
    move-object/from16 v50, v1

    .line 246
    .line 247
    iget-object v1, v3, La/qh0;->U:La/cmt;

    .line 248
    .line 249
    move-object/from16 v51, v1

    .line 250
    .line 251
    iget-object v1, v3, La/qh0;->V:La/ytt;

    .line 252
    .line 253
    iget-object v3, v3, La/qh0;->W:La/nr00;

    .line 254
    .line 255
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-object/from16 v18, v4

    .line 313
    .line 314
    new-instance v4, La/g7i;

    .line 315
    .line 316
    move-object/from16 v17, v2

    .line 317
    .line 318
    move-object v11, v3

    .line 319
    move-object/from16 v26, v28

    .line 320
    .line 321
    move-object/from16 v27, v29

    .line 322
    .line 323
    move-object/from16 v28, v30

    .line 324
    .line 325
    move-object/from16 v29, v32

    .line 326
    .line 327
    move-object/from16 v30, v33

    .line 328
    .line 329
    move-object/from16 v31, v34

    .line 330
    .line 331
    move-object/from16 v32, v36

    .line 332
    .line 333
    move-object/from16 v33, v39

    .line 334
    .line 335
    move-object/from16 v34, v41

    .line 336
    .line 337
    move-object/from16 v35, v42

    .line 338
    .line 339
    move-object/from16 v36, v43

    .line 340
    .line 341
    move-object/from16 v37, v44

    .line 342
    .line 343
    move-object/from16 v38, v45

    .line 344
    .line 345
    move-object/from16 v39, v47

    .line 346
    .line 347
    move-object/from16 v40, v49

    .line 348
    .line 349
    move-object/from16 v41, v50

    .line 350
    .line 351
    move-object/from16 v42, v51

    .line 352
    .line 353
    move-object/from16 v43, v1

    .line 354
    .line 355
    invoke-direct/range {v4 .. v43}, La/g7i;-><init>(La/cad;La/ehf0;La/wsf0;La/peg0;La/wsf0;La/peg0;La/nr00;La/fs80;La/q91;La/ii;La/oeg0;La/uzc0;La/kt2;La/s31;La/duj;La/s91;La/h03;La/m1e;La/v88;La/g2v;La/pru;La/ctf0;La/xmt;La/ix0;La/gg5;La/l7k;La/cyu;La/gst0;La/dmt;La/grj;La/jlx;La/pyt;La/qyg0;La/pyg0;La/x0u;La/gg5;La/s64;La/cmt;La/ytt;)V

    .line 356
    .line 357
    .line 358
    new-instance v1, La/fiu0;

    .line 359
    .line 360
    iget-object v2, v4, La/g7i;->L:La/n5d0;

    .line 361
    .line 362
    check-cast v2, La/f7i;

    .line 363
    .line 364
    const-class v3, La/eh0;

    .line 365
    .line 366
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 371
    .line 372
    .line 373
    iput-object v1, v0, La/nf0;->M1:La/fiu0;

    .line 374
    .line 375
    iget-object v1, v8, La/peg0;->b:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v1, La/yzn0;

    .line 378
    .line 379
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iput-object v1, v0, La/nf0;->N1:La/ynb;

    .line 387
    .line 388
    iput-object v14, v0, La/nf0;->O1:La/ii;

    .line 389
    .line 390
    return-void

    .line 391
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 392
    .line 393
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nf0;->P1:La/a8z;

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

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of v0, p1, La/yc3;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, La/yc3;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    new-instance v0, La/lf0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, La/lf0;-><init>(La/nf0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, La/ccq0;->U(La/yc3;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    :cond_1
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
    invoke-virtual {p0}, La/nf0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/df0;->a:La/df0;

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
    invoke-virtual {p0}, La/nf0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ff0;->a:La/ff0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/nf0;->R1:Z

    .line 2
    .line 3
    return p0
.end method
