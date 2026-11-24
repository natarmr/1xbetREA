.class public final La/p170;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/p170;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
        "promo"
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
.field public static final Q1:La/xuz;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/rmi;

.field public M1:La/ynb;

.field public final N1:La/kiu0;

.field public final O1:La/a8z;

.field public final P1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/p170;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "umResultKey"

    .line 16
    .line 17
    const-string v5, "getUmResultKey()Ljava/lang/String;"

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
    sput-object v1, La/p170;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xuz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/p170;->Q1:La/xuz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/o170;->a:La/o170;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/p170;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/n170;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/n170;-><init>(La/p170;B)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v2, La/ej50;

    .line 24
    .line 25
    const/16 v3, 0x17

    .line 26
    .line 27
    invoke-direct {v2, v0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    const-class v2, La/k370;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, La/co60;

    .line 43
    .line 44
    const/16 v4, 0x12

    .line 45
    .line 46
    invoke-direct {v3, v0, v4}, La/co60;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/co60;

    .line 50
    .line 51
    const/16 v5, 0x13

    .line 52
    .line 53
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    new-instance v5, La/ha30;

    .line 57
    .line 58
    const/16 v6, 0x10

    .line 59
    .line 60
    invoke-direct {v5, p0, v0, v6}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v2, v3, v4, v5}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/p170;->N1:La/kiu0;

    .line 68
    .line 69
    const-class v0, La/n270;

    .line 70
    .line 71
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, La/n170;

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-direct {v1, p0, v2}, La/n170;-><init>(La/p170;B)V

    .line 79
    .line 80
    .line 81
    const/16 v2, 0xe

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/p170;->O1:La/a8z;

    .line 89
    .line 90
    new-instance v0, La/phf0;

    .line 91
    .line 92
    const-string v1, "OneXGamesPromo.BUNDLE_UM_RESULT_KEY"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/p170;->P1:La/phf0;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/ex60;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const-string v1, "SELECT_BALANCE_REQUEST_KEY"

    .line 12
    .line 13
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/cd60;

    .line 21
    .line 22
    const/16 v1, 0xc

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    const-string v1, ""

    .line 28
    .line 29
    invoke-static {p1, p0, v1, v0}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/p170;->G0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, La/x070;->a:La/x070;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, La/p170;->R1:[La/iiy;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    aget-object p1, p1, v0

    .line 45
    .line 46
    iget-object v0, p0, La/p170;->K1:La/s0r;

    .line 47
    .line 48
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p1, La/aid;

    .line 56
    .line 57
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 58
    .line 59
    sget-object v0, La/qek0;->h:La/qek0;

    .line 60
    .line 61
    new-instance v1, La/tx;

    .line 62
    .line 63
    const/16 v2, 0x1c

    .line 64
    .line 65
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    new-instance p0, La/ugd;

    .line 69
    .line 70
    const v2, -0x2a3f7e05

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, La/shd;

    .line 78
    .line 79
    const/16 v2, 0xe

    .line 80
    .line 81
    invoke-direct {v1, v2}, La/shd;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final C0()V
    .locals 35

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v2, v1, La/af3;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v3

    .line 21
    :goto_0
    const-class v2, La/l170;

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/o5d0;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v1, v3

    .line 45
    :goto_1
    instance-of v4, v1, La/l170;

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v3, v1

    .line 51
    :goto_2
    check-cast v3, La/l170;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-static/range {p0 .. p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v2, v3, La/l170;->a:La/j5t;

    .line 63
    .line 64
    iget-object v4, v3, La/l170;->b:La/g7d;

    .line 65
    .line 66
    iget-object v5, v3, La/l170;->c:La/yvs;

    .line 67
    .line 68
    iget-object v6, v3, La/l170;->d:La/knf0;

    .line 69
    .line 70
    iget-object v7, v3, La/l170;->e:La/btt0;

    .line 71
    .line 72
    iget-object v8, v3, La/l170;->f:La/p2t;

    .line 73
    .line 74
    iget-object v9, v3, La/l170;->g:La/gst0;

    .line 75
    .line 76
    iget-object v10, v3, La/l170;->h:La/pbt;

    .line 77
    .line 78
    iget-object v11, v3, La/l170;->i:La/ls;

    .line 79
    .line 80
    iget-object v12, v3, La/l170;->j:La/scu;

    .line 81
    .line 82
    iget-object v13, v3, La/l170;->k:La/ntu;

    .line 83
    .line 84
    iget-object v14, v3, La/l170;->l:La/bzt;

    .line 85
    .line 86
    iget-object v15, v3, La/l170;->m:La/yoc;

    .line 87
    .line 88
    move-object/from16 v16, v2

    .line 89
    .line 90
    iget-object v2, v3, La/l170;->n:La/yoc;

    .line 91
    .line 92
    move-object/from16 v17, v4

    .line 93
    .line 94
    iget-object v4, v3, La/l170;->o:La/lbu;

    .line 95
    .line 96
    move-object/from16 v18, v5

    .line 97
    .line 98
    iget-object v5, v3, La/l170;->p:La/kt2;

    .line 99
    .line 100
    move-object/from16 v19, v6

    .line 101
    .line 102
    iget-object v6, v3, La/l170;->q:La/x20;

    .line 103
    .line 104
    move-object/from16 v20, v7

    .line 105
    .line 106
    iget-object v7, v3, La/l170;->r:La/l7k;

    .line 107
    .line 108
    move-object/from16 v21, v8

    .line 109
    .line 110
    iget-object v8, v3, La/l170;->s:La/gg5;

    .line 111
    .line 112
    iget-object v0, v3, La/l170;->t:La/uf3;

    .line 113
    .line 114
    move-object/from16 v22, v1

    .line 115
    .line 116
    iget-object v1, v3, La/l170;->u:La/v88;

    .line 117
    .line 118
    move-object/from16 v23, v1

    .line 119
    .line 120
    iget-object v1, v3, La/l170;->v:La/m1e;

    .line 121
    .line 122
    move-object/from16 v24, v1

    .line 123
    .line 124
    iget-object v1, v3, La/l170;->w:La/r2t;

    .line 125
    .line 126
    move-object/from16 v25, v1

    .line 127
    .line 128
    iget-object v1, v3, La/l170;->x:La/g2v;

    .line 129
    .line 130
    move-object/from16 v26, v1

    .line 131
    .line 132
    iget-object v1, v3, La/l170;->y:La/gii0;

    .line 133
    .line 134
    move-object/from16 v27, v1

    .line 135
    .line 136
    iget-object v1, v3, La/l170;->z:La/duj;

    .line 137
    .line 138
    move-object/from16 v28, v1

    .line 139
    .line 140
    iget-object v1, v3, La/l170;->A:La/ctf0;

    .line 141
    .line 142
    move-object/from16 v29, v1

    .line 143
    .line 144
    iget-object v1, v3, La/l170;->B:La/ouu;

    .line 145
    .line 146
    move-object/from16 v30, v1

    .line 147
    .line 148
    iget-object v1, v3, La/l170;->C:La/oeg0;

    .line 149
    .line 150
    move-object/from16 v31, v1

    .line 151
    .line 152
    iget-object v1, v3, La/l170;->D:La/wsf0;

    .line 153
    .line 154
    move-object/from16 v32, v0

    .line 155
    .line 156
    iget-object v0, v3, La/l170;->E:La/peg0;

    .line 157
    .line 158
    move-object/from16 v33, v0

    .line 159
    .line 160
    iget-object v0, v3, La/l170;->F:La/cad;

    .line 161
    .line 162
    move-object/from16 v34, v0

    .line 163
    .line 164
    iget-object v0, v3, La/l170;->G:La/iw20;

    .line 165
    .line 166
    iget-object v3, v3, La/l170;->H:La/cmt;

    .line 167
    .line 168
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-object/from16 v16, v8

    .line 211
    .line 212
    new-instance v8, La/hbi;

    .line 213
    .line 214
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    iput-object v10, v8, La/hbi;->b:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v9, v8, La/hbi;->c:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v13, v8, La/hbi;->d:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v12, v8, La/hbi;->e:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v1, v8, La/hbi;->f:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v4, v8, La/hbi;->g:Ljava/lang/Object;

    .line 228
    .line 229
    iput-object v15, v8, La/hbi;->h:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v2, v8, La/hbi;->i:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v11, v8, La/hbi;->j:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v0, v8, La/hbi;->k:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v14, v8, La/hbi;->l:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v5, v8, La/hbi;->m:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v6, v8, La/hbi;->n:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v7, v8, La/hbi;->o:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v3, v8, La/hbi;->p:Ljava/lang/Object;

    .line 246
    .line 247
    move-object/from16 v0, v16

    .line 248
    .line 249
    iput-object v0, v8, La/hbi;->q:Ljava/lang/Object;

    .line 250
    .line 251
    move-object/from16 v0, v32

    .line 252
    .line 253
    iput-object v0, v8, La/hbi;->r:Ljava/lang/Object;

    .line 254
    .line 255
    move-object/from16 v0, v22

    .line 256
    .line 257
    iput-object v0, v8, La/hbi;->s:Ljava/lang/Object;

    .line 258
    .line 259
    move-object/from16 v0, v30

    .line 260
    .line 261
    iput-object v0, v8, La/hbi;->t:Ljava/lang/Object;

    .line 262
    .line 263
    move-object/from16 v0, v28

    .line 264
    .line 265
    iput-object v0, v8, La/hbi;->u:Ljava/lang/Object;

    .line 266
    .line 267
    move-object/from16 v0, v29

    .line 268
    .line 269
    iput-object v0, v8, La/hbi;->v:Ljava/lang/Object;

    .line 270
    .line 271
    move-object/from16 v0, v26

    .line 272
    .line 273
    iput-object v0, v8, La/hbi;->w:Ljava/lang/Object;

    .line 274
    .line 275
    move-object/from16 v0, v24

    .line 276
    .line 277
    iput-object v0, v8, La/hbi;->x:Ljava/lang/Object;

    .line 278
    .line 279
    move-object/from16 v0, v34

    .line 280
    .line 281
    iput-object v0, v8, La/hbi;->y:Ljava/lang/Object;

    .line 282
    .line 283
    move-object/from16 v0, v31

    .line 284
    .line 285
    iput-object v0, v8, La/hbi;->z:Ljava/lang/Object;

    .line 286
    .line 287
    move-object/from16 v0, v23

    .line 288
    .line 289
    iput-object v0, v8, La/hbi;->A:Ljava/lang/Object;

    .line 290
    .line 291
    new-instance v0, La/rki;

    .line 292
    .line 293
    const/16 v1, 0x1b

    .line 294
    .line 295
    invoke-direct {v0, v8, v1}, La/rki;-><init>(Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iput-object v0, v8, La/hbi;->a:Ljava/lang/Object;

    .line 303
    .line 304
    iget-object v0, v8, La/hbi;->a:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, La/n5d0;

    .line 307
    .line 308
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/rmi;

    .line 313
    .line 314
    move-object/from16 v1, p0

    .line 315
    .line 316
    iput-object v0, v1, La/p170;->L1:La/rmi;

    .line 317
    .line 318
    move-object/from16 v0, v33

    .line 319
    .line 320
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, La/yzn0;

    .line 323
    .line 324
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iput-object v0, v1, La/p170;->M1:La/ynb;

    .line 332
    .line 333
    return-void

    .line 334
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 335
    .line 336
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/p170;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/k370;

    .line 8
    .line 9
    invoke-virtual {v0}, La/k370;->w()La/gmq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/nf60;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, La/az60;

    .line 36
    .line 37
    check-cast v0, La/i89;

    .line 38
    .line 39
    invoke-direct {v4, v0, p0, v1, v3}, La/az60;-><init>(La/i89;La/clz;La/nf60;La/yje;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/p170;->O1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
