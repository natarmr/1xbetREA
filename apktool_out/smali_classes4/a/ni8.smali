.class public final La/ni8;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ni8;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/yk5",
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
.field public static final U1:La/yk5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/kai;

.field public L1:La/ynb;

.field public M1:La/wdk0;

.field public N1:La/uxs0;

.field public O1:La/sxs0;

.field public final P1:La/hnm0;

.field public final Q1:La/phf0;

.field public final R1:La/s0r;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ni8;

    .line 4
    .line 5
    const-string v2, "umResultKey"

    .line 6
    .line 7
    const-string v3, "getUmResultKey()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/ni8;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/yk5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ni8;->U1:La/yk5;

    .line 38
    .line 39
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
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/ni8;->P1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/phf0;

    .line 12
    .line 13
    const-string v1, "OneXGamesBonusesFragment.UM_RESULT_KEY"

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ni8;->Q1:La/phf0;

    .line 21
    .line 22
    sget-object v0, La/mi8;->a:La/mi8;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ni8;->R1:La/s0r;

    .line 29
    .line 30
    const-class v0, La/jm8;

    .line 31
    .line 32
    sget-object v1, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/hi8;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v1, p0, v2}, La/hi8;-><init>(La/ni8;B)V

    .line 42
    .line 43
    .line 44
    const/16 v2, 0xe

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/ni8;->S1:La/a8z;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/ii8;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/ii8;-><init>(La/ni8;B)V

    .line 9
    .line 10
    .line 11
    const-string v2, "SELECT_BALANCE_REQUEST_KEY"

    .line 12
    .line 13
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/ni8;->O1:La/sxs0;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, La/ji8;

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, La/ji8;-><init>(La/ni8;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p0, v0}, La/sxs0;->d(Landroidx/fragment/app/e;La/yx5;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, La/ji8;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, p0, v1}, La/ji8;-><init>(La/ni8;B)V

    .line 43
    .line 44
    .line 45
    const-string v2, ""

    .line 46
    .line 47
    invoke-static {p1, p0, v2, v0}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, La/ii8;

    .line 55
    .line 56
    invoke-direct {v0, p0, v1}, La/ii8;-><init>(La/ni8;B)V

    .line 57
    .line 58
    .line 59
    const-string v2, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

    .line 60
    .line 61
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, La/ni8;->V1:[La/iiy;

    .line 65
    .line 66
    aget-object p1, p1, v1

    .line 67
    .line 68
    iget-object v0, p0, La/ni8;->R1:La/s0r;

    .line 69
    .line 70
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p1, La/aid;

    .line 78
    .line 79
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 80
    .line 81
    new-instance v0, La/tx;

    .line 82
    .line 83
    const/16 v2, 0xa

    .line 84
    .line 85
    invoke-direct {v0, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    new-instance p0, La/ugd;

    .line 89
    .line 90
    const v2, -0x6b1bf18e

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    const-string p0, "wildFreeBetResultListener"

    .line 101
    .line 102
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    throw p0
.end method

.method public final C0()V
    .locals 40

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
    const-class v2, La/ei8;

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
    instance-of v4, v1, La/ei8;

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
    check-cast v3, La/ei8;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v38

    .line 61
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v12, v3, La/ei8;->a:La/ls;

    .line 65
    .line 66
    iget-object v13, v3, La/ei8;->b:La/k9c;

    .line 67
    .line 68
    iget-object v14, v3, La/ei8;->c:La/p4u;

    .line 69
    .line 70
    iget-object v15, v3, La/ei8;->d:La/kyg0;

    .line 71
    .line 72
    iget-object v1, v3, La/ei8;->e:La/yoc;

    .line 73
    .line 74
    iget-object v2, v3, La/ei8;->f:La/yoc;

    .line 75
    .line 76
    iget-object v4, v3, La/ei8;->g:La/cdu;

    .line 77
    .line 78
    iget-object v5, v3, La/ei8;->h:La/ntu;

    .line 79
    .line 80
    iget-object v6, v3, La/ei8;->i:La/lbu;

    .line 81
    .line 82
    iget-object v7, v3, La/ei8;->j:La/ycu;

    .line 83
    .line 84
    iget-object v8, v3, La/ei8;->k:La/dcu;

    .line 85
    .line 86
    iget-object v9, v3, La/ei8;->l:La/ix0;

    .line 87
    .line 88
    iget-object v10, v3, La/ei8;->m:La/l7k;

    .line 89
    .line 90
    iget-object v11, v3, La/ei8;->n:La/ih5;

    .line 91
    .line 92
    move-object/from16 v16, v1

    .line 93
    .line 94
    iget-object v1, v3, La/ei8;->o:La/hs60;

    .line 95
    .line 96
    move-object/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v3, La/ei8;->p:La/ih5;

    .line 99
    .line 100
    move-object/from16 v27, v1

    .line 101
    .line 102
    iget-object v1, v3, La/ei8;->q:La/duj;

    .line 103
    .line 104
    move-object/from16 v28, v1

    .line 105
    .line 106
    iget-object v1, v3, La/ei8;->r:La/ctf0;

    .line 107
    .line 108
    move-object/from16 v29, v1

    .line 109
    .line 110
    iget-object v1, v3, La/ei8;->s:La/ocl;

    .line 111
    .line 112
    move-object/from16 v30, v1

    .line 113
    .line 114
    iget-object v1, v3, La/ei8;->t:La/m1e;

    .line 115
    .line 116
    move-object/from16 v32, v1

    .line 117
    .line 118
    iget-object v1, v3, La/ei8;->u:La/gii0;

    .line 119
    .line 120
    move-object/from16 v33, v1

    .line 121
    .line 122
    iget-object v1, v3, La/ei8;->v:La/q7d0;

    .line 123
    .line 124
    move-object/from16 v17, v1

    .line 125
    .line 126
    iget-object v1, v3, La/ei8;->w:La/btt0;

    .line 127
    .line 128
    move-object/from16 v34, v1

    .line 129
    .line 130
    iget-object v1, v3, La/ei8;->x:La/pbt;

    .line 131
    .line 132
    move-object/from16 v35, v1

    .line 133
    .line 134
    iget-object v1, v3, La/ei8;->y:La/gst0;

    .line 135
    .line 136
    move-object/from16 v36, v1

    .line 137
    .line 138
    iget-object v1, v3, La/ei8;->z:La/wdk0;

    .line 139
    .line 140
    move-object/from16 v31, v1

    .line 141
    .line 142
    iget-object v1, v3, La/ei8;->A:La/v88;

    .line 143
    .line 144
    move-object/from16 v20, v6

    .line 145
    .line 146
    iget-object v6, v3, La/ei8;->B:La/mct;

    .line 147
    .line 148
    move-object/from16 v19, v5

    .line 149
    .line 150
    iget-object v5, v3, La/ei8;->C:La/cad;

    .line 151
    .line 152
    move-object/from16 v21, v7

    .line 153
    .line 154
    iget-object v7, v3, La/ei8;->D:La/wsf0;

    .line 155
    .line 156
    move-object/from16 v22, v8

    .line 157
    .line 158
    iget-object v8, v3, La/ei8;->E:La/sxs0;

    .line 159
    .line 160
    move-object/from16 v23, v9

    .line 161
    .line 162
    iget-object v9, v3, La/ei8;->F:La/peg0;

    .line 163
    .line 164
    move-object/from16 v24, v10

    .line 165
    .line 166
    iget-object v10, v3, La/ei8;->G:La/svs0;

    .line 167
    .line 168
    move-object/from16 v25, v11

    .line 169
    .line 170
    iget-object v11, v3, La/ei8;->H:La/iw20;

    .line 171
    .line 172
    iget-object v3, v3, La/ei8;->I:La/cmt;

    .line 173
    .line 174
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-object/from16 v18, v4

    .line 202
    .line 203
    new-instance v4, La/mai;

    .line 204
    .line 205
    move-object/from16 v37, v1

    .line 206
    .line 207
    move-object/from16 v17, v2

    .line 208
    .line 209
    move-object/from16 v39, v3

    .line 210
    .line 211
    invoke-direct/range {v4 .. v39}, La/mai;-><init>(La/cad;La/mct;La/wsf0;La/sxs0;La/peg0;La/svs0;La/iw20;La/ls;La/k9c;La/p4u;La/kyg0;La/yoc;La/yoc;La/cdu;La/ntu;La/lbu;La/ycu;La/dcu;La/ix0;La/l7k;La/ih5;La/hs60;La/ih5;La/duj;La/ctf0;La/ocl;La/wdk0;La/m1e;La/gii0;La/btt0;La/pbt;La/gst0;La/v88;La/i1w0;La/cmt;)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v1, v31

    .line 215
    .line 216
    iget-object v2, v4, La/mai;->j:La/n5d0;

    .line 217
    .line 218
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, La/kai;

    .line 223
    .line 224
    iput-object v2, v0, La/ni8;->K1:La/kai;

    .line 225
    .line 226
    iget-object v2, v9, La/peg0;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v2, La/yzn0;

    .line 229
    .line 230
    invoke-virtual {v2}, La/yzn0;->i()La/ynb;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    iput-object v2, v0, La/ni8;->L1:La/ynb;

    .line 238
    .line 239
    iput-object v1, v0, La/ni8;->M1:La/wdk0;

    .line 240
    .line 241
    new-instance v1, La/uxs0;

    .line 242
    .line 243
    const/16 v2, 0xf

    .line 244
    .line 245
    invoke-direct {v1, v2}, La/uxs0;-><init>(B)V

    .line 246
    .line 247
    .line 248
    iput-object v1, v0, La/ni8;->N1:La/uxs0;

    .line 249
    .line 250
    new-instance v1, La/sxs0;

    .line 251
    .line 252
    invoke-direct {v1, v2}, La/sxs0;-><init>(B)V

    .line 253
    .line 254
    .line 255
    iput-object v1, v0, La/ni8;->O1:La/sxs0;

    .line 256
    .line 257
    return-void

    .line 258
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 259
    .line 260
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ni8;->S1:La/a8z;

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

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x21

    .line 12
    .line 13
    if-lt v2, v3, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, La/uq6;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string v2, "BonusesFeature.SOURCE_SCREEN"

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v2, v0, La/w3t;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, v0

    .line 32
    :goto_0
    move-object v0, v1

    .line 33
    check-cast v0, La/w3t;

    .line 34
    .line 35
    :goto_1
    move-object v1, v0

    .line 36
    check-cast v1, La/w3t;

    .line 37
    .line 38
    :cond_2
    instance-of v0, v1, La/u3t;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/yx5;->E0(Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ni8;->P1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
