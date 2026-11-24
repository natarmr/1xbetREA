.class public final La/avg0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/avg0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final P1:La/cge0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/osi;

.field public L1:La/wdk0;

.field public final M1:La/khf0;

.field public final N1:La/s0r;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/avg0;

    .line 4
    .line 5
    const-string v2, "saleScreenModel"

    .line 6
    .line 7
    const-string v3, "getSaleScreenModel()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;"

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
    sput-object v1, La/avg0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cge0;

    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/avg0;->P1:La/cge0;

    .line 40
    .line 41
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
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "BUNDLE_SALE_SCREEN"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/avg0;->M1:La/khf0;

    .line 15
    .line 16
    sget-object v0, La/yug0;->a:La/yug0;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/avg0;->N1:La/s0r;

    .line 23
    .line 24
    const-class v0, La/dxg0;

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
    new-instance v1, La/tug0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/tug0;-><init>(La/avg0;B)V

    .line 36
    .line 37
    .line 38
    const/16 v2, 0xe

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/avg0;->O1:La/a8z;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final G0()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;
    .locals 2

    .line 1
    sget-object v0, La/avg0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/avg0;->M1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/avg0;->O1:La/a8z;

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
    .locals 27

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
    const-class v2, La/fug0;

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
    instance-of v4, v1, La/fug0;

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
    check-cast v3, La/fug0;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v0}, La/avg0;->G0()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v5, v3, La/fug0;->a:La/cad;

    .line 72
    .line 73
    iget-object v9, v3, La/fug0;->b:La/ctf0;

    .line 74
    .line 75
    iget-object v1, v3, La/fug0;->c:La/ocl;

    .line 76
    .line 77
    iget-object v2, v3, La/fug0;->d:La/pru;

    .line 78
    .line 79
    iget-object v4, v3, La/fug0;->e:La/r9u;

    .line 80
    .line 81
    iget-object v6, v3, La/fug0;->f:La/b8u;

    .line 82
    .line 83
    iget-object v7, v3, La/fug0;->t:La/fme;

    .line 84
    .line 85
    iget-object v10, v3, La/fug0;->g:La/edo;

    .line 86
    .line 87
    iget-object v11, v3, La/fug0;->i:La/gst0;

    .line 88
    .line 89
    iget-object v15, v3, La/fug0;->m:La/duj;

    .line 90
    .line 91
    iget-object v12, v3, La/fug0;->h:La/m1e;

    .line 92
    .line 93
    iget-object v14, v3, La/fug0;->n:La/ii;

    .line 94
    .line 95
    move-object/from16 v22, v1

    .line 96
    .line 97
    iget-object v1, v3, La/fug0;->o:La/wdk0;

    .line 98
    .line 99
    move-object/from16 v19, v1

    .line 100
    .line 101
    iget-object v1, v3, La/fug0;->l:La/au0;

    .line 102
    .line 103
    move-object/from16 v26, v10

    .line 104
    .line 105
    iget-object v10, v3, La/fug0;->k:La/kt2;

    .line 106
    .line 107
    move-object/from16 v21, v11

    .line 108
    .line 109
    iget-object v11, v3, La/fug0;->s:La/kuy;

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    iget-object v1, v3, La/fug0;->q:La/btt0;

    .line 114
    .line 115
    move-object/from16 v18, v14

    .line 116
    .line 117
    iget-object v14, v3, La/fug0;->r:La/knf0;

    .line 118
    .line 119
    move-object/from16 v16, v1

    .line 120
    .line 121
    iget-object v1, v3, La/fug0;->p:La/gii0;

    .line 122
    .line 123
    move-object/from16 v20, v1

    .line 124
    .line 125
    iget-object v1, v3, La/fug0;->j:La/fsd;

    .line 126
    .line 127
    move-object/from16 v24, v6

    .line 128
    .line 129
    iget-object v6, v3, La/fug0;->u:La/ugf0;

    .line 130
    .line 131
    iget-object v3, v3, La/fug0;->v:La/wsf0;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v4, La/v5i;

    .line 176
    .line 177
    move-object/from16 v23, v2

    .line 178
    .line 179
    move-object/from16 v25, v7

    .line 180
    .line 181
    move-object v7, v3

    .line 182
    invoke-direct/range {v4 .. v26}, La/v5i;-><init>(La/cad;La/ugf0;La/wsf0;Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;La/ctf0;La/kt2;La/kuy;La/m1e;La/i1w0;La/knf0;La/duj;La/btt0;La/au0;La/ii;La/wdk0;La/gii0;La/gst0;La/ocl;La/pru;La/b8u;La/fme;La/edo;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v1, v19

    .line 186
    .line 187
    iget-object v2, v4, La/v5i;->v:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, La/n5d0;

    .line 190
    .line 191
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    check-cast v2, La/osi;

    .line 196
    .line 197
    iput-object v2, v0, La/avg0;->K1:La/osi;

    .line 198
    .line 199
    iput-object v1, v0, La/avg0;->L1:La/wdk0;

    .line 200
    .line 201
    return-void

    .line 202
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 203
    .line 204
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/avg0;->G0()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/avg0;->G0()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, Lkotlin/Pair;

    .line 16
    .line 17
    const-string v2, "BUNDLE_BET_ID"

    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "REQUEST_BET_UPDATE_BY_ID"

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 36
    .line 37
    .line 38
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
    new-instance p2, La/ex60;

    .line 9
    .line 10
    const/16 v0, 0x15

    .line 11
    .line 12
    invoke-direct {p2, p0, v0}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v0, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/tug0;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-direct {p1, p0, p2}, La/tug0;-><init>(La/avg0;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, La/avg0;->Q1:[La/iiy;

    .line 30
    .line 31
    aget-object p1, p1, p2

    .line 32
    .line 33
    iget-object v0, p0, La/avg0;->N1:La/s0r;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast p1, La/aid;

    .line 43
    .line 44
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 45
    .line 46
    new-instance v0, La/owp0;

    .line 47
    .line 48
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, La/iob0;

    .line 52
    .line 53
    const/4 v2, 0x7

    .line 54
    invoke-direct {v1, p0, v2}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/ugd;

    .line 58
    .line 59
    const v2, 0x6a538081

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v2, p2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
