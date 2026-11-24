.class public final La/je1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/je1;",
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

.field public static final V1:Ljava/lang/String;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:Z

.field public P1:La/ynb;

.field public final Q1:La/yzn0;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/je1;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorPromoBinding;"

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
    const-string v3, "promoTypeToOpen"

    .line 16
    .line 17
    const-string v5, "getPromoTypeToOpen()Lorg/xplatform/aggregator/api/navigation/PromoTypeToOpen;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/je1;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/hfk0;

    .line 33
    .line 34
    const/16 v2, 0x11

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/hfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/je1;->S1:La/hfk0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/je1;->V1:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d01ea

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/ie1;->a:La/ie1;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/je1;->K1:La/s0r;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, La/je1;->O1:Z

    .line 17
    .line 18
    new-instance v0, La/yzn0;

    .line 19
    .line 20
    const-string v1, "PROMO_TYPE_ITEM"

    .line 21
    .line 22
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/je1;->Q1:La/yzn0;

    .line 26
    .line 27
    const-class v0, La/mh1;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/nc;

    .line 36
    .line 37
    const/16 v2, 0x12

    .line 38
    .line 39
    invoke-direct {v1, p0, v2}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/je1;->R1:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    sget-object p1, La/je1;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/je1;->Q1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La/fvc0;

    .line 13
    .line 14
    sget-object v3, La/bvc0;->a:La/bvc0;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, La/je1;->G0()La/k3t0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v4, La/id1;

    .line 27
    .line 28
    aget-object v5, p1, v0

    .line 29
    .line 30
    invoke-virtual {v2, p0, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, La/fvc0;

    .line 35
    .line 36
    invoke-direct {v4, v5}, La/id1;-><init>(La/fvc0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    aget-object v1, p1, v0

    .line 43
    .line 44
    invoke-virtual {v2, p0, v1, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    aget-object p1, p1, v1

    .line 49
    .line 50
    iget-object v1, p0, La/je1;->K1:La/s0r;

    .line 51
    .line 52
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p1, La/txq;

    .line 60
    .line 61
    iget-object p1, p1, La/txq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 62
    .line 63
    new-instance v1, La/owp0;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v1, v2}, La/owp0;-><init>(La/clz;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/tx;

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    invoke-direct {v2, p0, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    new-instance p0, La/ugd;

    .line 79
    .line 80
    const v3, 0x23064627

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final C0()V
    .locals 63

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
    const-class v2, La/fe1;

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
    instance-of v4, v1, La/fe1;

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
    check-cast v3, La/fe1;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/je1;->U1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/je1;->Q1:La/yzn0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/fvc0;

    .line 69
    .line 70
    sget-object v1, La/mr1;->a:La/mr1;

    .line 71
    .line 72
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 73
    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    const/16 v17, 0x1ff

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const-wide/16 v7, 0x0

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const-wide/16 v11, 0x0

    .line 85
    .line 86
    const-wide/16 v13, 0x0

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    invoke-direct/range {v4 .. v17}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v3, La/fe1;->b:La/cad;

    .line 93
    .line 94
    iget-object v2, v3, La/fe1;->p:La/oeg0;

    .line 95
    .line 96
    iget-object v4, v3, La/fe1;->F:La/wsf0;

    .line 97
    .line 98
    iget-object v5, v3, La/fe1;->c:La/uzc0;

    .line 99
    .line 100
    iget-object v6, v3, La/fe1;->d:La/kt2;

    .line 101
    .line 102
    iget-object v7, v3, La/fe1;->e:La/s31;

    .line 103
    .line 104
    iget-object v8, v3, La/fe1;->h:La/nv20;

    .line 105
    .line 106
    iget-object v9, v3, La/fe1;->g:La/xk0;

    .line 107
    .line 108
    iget-object v10, v3, La/fe1;->i:La/duj;

    .line 109
    .line 110
    iget-object v11, v3, La/fe1;->j:La/o91;

    .line 111
    .line 112
    iget-object v12, v3, La/fe1;->k:La/s91;

    .line 113
    .line 114
    iget-object v13, v3, La/fe1;->C:La/ii;

    .line 115
    .line 116
    iget-object v14, v3, La/fe1;->m:La/gii0;

    .line 117
    .line 118
    iget-object v15, v3, La/fe1;->n:La/m1e;

    .line 119
    .line 120
    move-object/from16 v19, v1

    .line 121
    .line 122
    iget-object v1, v3, La/fe1;->o:La/v88;

    .line 123
    .line 124
    move-object/from16 v38, v1

    .line 125
    .line 126
    iget-object v1, v3, La/fe1;->a:La/ehf0;

    .line 127
    .line 128
    move-object/from16 v20, v1

    .line 129
    .line 130
    iget-object v1, v3, La/fe1;->l:La/r9u;

    .line 131
    .line 132
    move-object/from16 v16, v1

    .line 133
    .line 134
    iget-object v1, v3, La/fe1;->f:La/h03;

    .line 135
    .line 136
    move-object/from16 v36, v1

    .line 137
    .line 138
    iget-object v1, v3, La/fe1;->q:La/pru;

    .line 139
    .line 140
    move-object/from16 v39, v1

    .line 141
    .line 142
    iget-object v1, v3, La/fe1;->r:La/btt0;

    .line 143
    .line 144
    move-object/from16 v17, v1

    .line 145
    .line 146
    iget-object v1, v3, La/fe1;->H:La/peg0;

    .line 147
    .line 148
    move-object/from16 v24, v1

    .line 149
    .line 150
    iget-object v1, v3, La/fe1;->s:La/ctf0;

    .line 151
    .line 152
    move-object/from16 v40, v1

    .line 153
    .line 154
    iget-object v1, v3, La/fe1;->t:La/xmt;

    .line 155
    .line 156
    move-object/from16 v41, v1

    .line 157
    .line 158
    iget-object v1, v3, La/fe1;->u:La/zr1;

    .line 159
    .line 160
    move-object/from16 v42, v1

    .line 161
    .line 162
    iget-object v1, v3, La/fe1;->v:La/ix0;

    .line 163
    .line 164
    move-object/from16 v43, v1

    .line 165
    .line 166
    iget-object v1, v3, La/fe1;->w:La/s64;

    .line 167
    .line 168
    move-object/from16 v44, v1

    .line 169
    .line 170
    iget-object v1, v3, La/fe1;->x:La/ntu;

    .line 171
    .line 172
    move-object/from16 v45, v1

    .line 173
    .line 174
    iget-object v1, v3, La/fe1;->y:La/fsd;

    .line 175
    .line 176
    move-object/from16 v46, v1

    .line 177
    .line 178
    iget-object v1, v3, La/fe1;->z:La/l7k;

    .line 179
    .line 180
    move-object/from16 v47, v1

    .line 181
    .line 182
    iget-object v1, v3, La/fe1;->N:La/gg5;

    .line 183
    .line 184
    move-object/from16 v53, v1

    .line 185
    .line 186
    iget-object v1, v3, La/fe1;->A:La/zx10;

    .line 187
    .line 188
    move-object/from16 v21, v1

    .line 189
    .line 190
    iget-object v1, v3, La/fe1;->B:La/kc60;

    .line 191
    .line 192
    move-object/from16 v48, v1

    .line 193
    .line 194
    iget-object v1, v3, La/fe1;->D:La/gst0;

    .line 195
    .line 196
    move-object/from16 v49, v1

    .line 197
    .line 198
    iget-object v1, v3, La/fe1;->E:La/wdk0;

    .line 199
    .line 200
    move-object/from16 v52, v1

    .line 201
    .line 202
    iget-object v1, v3, La/fe1;->I:La/dmt;

    .line 203
    .line 204
    move-object/from16 v51, v1

    .line 205
    .line 206
    iget-object v1, v3, La/fe1;->J:La/poq0;

    .line 207
    .line 208
    move-object/from16 v23, v1

    .line 209
    .line 210
    iget-object v1, v3, La/fe1;->K:La/b3c0;

    .line 211
    .line 212
    move-object/from16 v18, v1

    .line 213
    .line 214
    iget-object v1, v3, La/fe1;->L:La/nr00;

    .line 215
    .line 216
    move-object/from16 v26, v1

    .line 217
    .line 218
    iget-object v1, v3, La/fe1;->M:La/lrc;

    .line 219
    .line 220
    move-object/from16 v27, v1

    .line 221
    .line 222
    iget-object v1, v3, La/fe1;->O:La/grj;

    .line 223
    .line 224
    move-object/from16 v54, v1

    .line 225
    .line 226
    iget-object v1, v3, La/fe1;->P:La/jlx;

    .line 227
    .line 228
    move-object/from16 v55, v1

    .line 229
    .line 230
    iget-object v1, v3, La/fe1;->Q:La/pyt;

    .line 231
    .line 232
    move-object/from16 v56, v1

    .line 233
    .line 234
    iget-object v1, v3, La/fe1;->R:La/qyg0;

    .line 235
    .line 236
    move-object/from16 v57, v1

    .line 237
    .line 238
    iget-object v1, v3, La/fe1;->S:La/pyg0;

    .line 239
    .line 240
    move-object/from16 v58, v1

    .line 241
    .line 242
    iget-object v1, v3, La/fe1;->T:La/r9s0;

    .line 243
    .line 244
    move-object/from16 v22, v1

    .line 245
    .line 246
    iget-object v1, v3, La/fe1;->G:La/wiu;

    .line 247
    .line 248
    move-object/from16 v50, v1

    .line 249
    .line 250
    iget-object v1, v3, La/fe1;->U:La/cyu;

    .line 251
    .line 252
    move-object/from16 v59, v1

    .line 253
    .line 254
    iget-object v1, v3, La/fe1;->V:La/peg0;

    .line 255
    .line 256
    move-object/from16 v28, v1

    .line 257
    .line 258
    iget-object v1, v3, La/fe1;->W:La/ytt;

    .line 259
    .line 260
    move-object/from16 v60, v1

    .line 261
    .line 262
    iget-object v1, v3, La/fe1;->X:La/yfu;

    .line 263
    .line 264
    iget-object v3, v3, La/fe1;->Y:La/cmt;

    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v49 .. v49}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v52 .. v52}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    new-instance v18, La/u7i;

    .line 315
    .line 316
    move-object/from16 v61, v1

    .line 317
    .line 318
    move-object/from16 v30, v2

    .line 319
    .line 320
    move-object/from16 v62, v3

    .line 321
    .line 322
    move-object/from16 v25, v4

    .line 323
    .line 324
    move-object/from16 v31, v5

    .line 325
    .line 326
    move-object/from16 v32, v6

    .line 327
    .line 328
    move-object/from16 v33, v7

    .line 329
    .line 330
    move-object/from16 v22, v8

    .line 331
    .line 332
    move-object/from16 v34, v10

    .line 333
    .line 334
    move-object/from16 v35, v12

    .line 335
    .line 336
    move-object/from16 v29, v13

    .line 337
    .line 338
    move-object/from16 v37, v15

    .line 339
    .line 340
    invoke-direct/range {v18 .. v62}, La/u7i;-><init>(La/cad;La/ehf0;La/zx10;La/nv20;La/poq0;La/peg0;La/wsf0;La/nr00;La/lrc;La/peg0;La/ii;La/oeg0;La/uzc0;La/kt2;La/s31;La/duj;La/s91;La/h03;La/m1e;La/v88;La/pru;La/ctf0;La/xmt;La/zr1;La/ix0;La/s64;La/ntu;La/fsd;La/l7k;La/kc60;La/gst0;La/wiu;La/dmt;La/wdk0;La/gg5;La/grj;La/jlx;La/pyt;La/qyg0;La/pyg0;La/cyu;La/ytt;La/yfu;La/cmt;)V

    .line 341
    .line 342
    .line 343
    move-object/from16 v4, v18

    .line 344
    .line 345
    move-object/from16 v2, v24

    .line 346
    .line 347
    move-object/from16 v1, v29

    .line 348
    .line 349
    move-object/from16 v3, v52

    .line 350
    .line 351
    new-instance v5, La/fiu0;

    .line 352
    .line 353
    const-class v6, La/mh1;

    .line 354
    .line 355
    iget-object v4, v4, La/u7i;->O:La/f7i;

    .line 356
    .line 357
    invoke-static {v6, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-direct {v5, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 362
    .line 363
    .line 364
    iput-object v5, v0, La/je1;->L1:La/fiu0;

    .line 365
    .line 366
    iput-object v1, v0, La/je1;->M1:La/ii;

    .line 367
    .line 368
    iput-object v3, v0, La/je1;->N1:La/wdk0;

    .line 369
    .line 370
    iget-object v1, v2, La/peg0;->b:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v1, La/yzn0;

    .line 373
    .line 374
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    iput-object v1, v0, La/je1;->P1:La/ynb;

    .line 382
    .line 383
    return-void

    .line 384
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 385
    .line 386
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/je1;->R1:La/a8z;

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

.method public final H0(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 9
    .line 10
    new-instance v1, Landroid/content/Intent;

    .line 11
    .line 12
    const-string v2, "android.intent.action.VIEW"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x10000000

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 38
    .line 39
    new-instance v0, La/g0g0;

    .line 40
    .line 41
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :goto_0
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, La/je1;->N1:La/wdk0;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    new-instance v1, La/xdk0;

    .line 56
    .line 57
    sget-object v2, La/rek0;->b:La/rek0;

    .line 58
    .line 59
    const p1, 0x7f130ebc

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/16 v8, 0x7c

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 76
    .line 77
    .line 78
    const/16 v7, 0x3fc

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    move-object v2, p0

    .line 83
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    const-string p0, "snackbarManager"

    .line 88
    .line 89
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    throw p0

    .line 94
    :cond_1
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/je1;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/od1;->a:La/od1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

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
    invoke-virtual {p0}, La/je1;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/pd1;->a:La/pd1;

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
    iget-boolean p0, p0, La/je1;->O1:Z

    .line 2
    .line 3
    return p0
.end method
