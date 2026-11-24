.class public final La/afs0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/afs0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final P1:La/g9m0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/phf0;

.field public M1:La/fyi;

.field public final N1:La/a8z;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/afs0;

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
    const-string v3, "balanceId"

    .line 16
    .line 17
    const-string v5, "getBalanceId()Ljava/lang/String;"

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
    sput-object v1, La/afs0;->Q1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/g9m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/afs0;->P1:La/g9m0;

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
    const-string v1, "TRANSACTION_BET_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/afs0;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/phf0;

    .line 17
    .line 18
    const-string v1, "TRANSACTION_BALANCE_ID"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/afs0;->L1:La/phf0;

    .line 24
    .line 25
    const-class v0, La/wfs0;

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
    new-instance v1, La/wes0;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/wes0;-><init>(La/afs0;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/afs0;->N1:La/a8z;

    .line 47
    .line 48
    sget-object v0, La/yes0;->a:La/yes0;

    .line 49
    .line 50
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/afs0;->O1:La/s0r;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final V(Landroid/content/Context;)V
    .locals 23

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
    const-class v2, La/res0;

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
    instance-of v4, v1, La/res0;

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
    check-cast v3, La/res0;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    const/4 v1, 0x0

    .line 65
    sget-object v2, La/afs0;->Q1:[La/iiy;

    .line 66
    .line 67
    aget-object v1, v2, v1

    .line 68
    .line 69
    iget-object v4, v0, La/afs0;->K1:La/phf0;

    .line 70
    .line 71
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const/4 v1, 0x1

    .line 76
    aget-object v1, v2, v1

    .line 77
    .line 78
    iget-object v2, v0, La/afs0;->L1:La/phf0;

    .line 79
    .line 80
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v5, v3, La/res0;->a:La/cad;

    .line 94
    .line 95
    iget-object v10, v3, La/res0;->b:La/ctf0;

    .line 96
    .line 97
    iget-object v1, v3, La/res0;->c:La/ocl;

    .line 98
    .line 99
    iget-object v2, v3, La/res0;->e:La/r9u;

    .line 100
    .line 101
    iget-object v4, v3, La/res0;->d:La/b8u;

    .line 102
    .line 103
    iget-object v6, v3, La/res0;->r:La/fme;

    .line 104
    .line 105
    iget-object v7, v3, La/res0;->f:La/edo;

    .line 106
    .line 107
    iget-object v11, v3, La/res0;->h:La/gst0;

    .line 108
    .line 109
    iget-object v13, v3, La/res0;->k:La/duj;

    .line 110
    .line 111
    move-object v14, v11

    .line 112
    iget-object v11, v3, La/res0;->g:La/m1e;

    .line 113
    .line 114
    iget-object v15, v3, La/res0;->l:La/ii;

    .line 115
    .line 116
    move-object/from16 v16, v1

    .line 117
    .line 118
    iget-object v1, v3, La/res0;->m:La/wdk0;

    .line 119
    .line 120
    move-object/from16 v17, v1

    .line 121
    .line 122
    iget-object v1, v3, La/res0;->j:La/kt2;

    .line 123
    .line 124
    move-object/from16 v18, v1

    .line 125
    .line 126
    iget-object v1, v3, La/res0;->q:La/kuy;

    .line 127
    .line 128
    move-object/from16 v19, v14

    .line 129
    .line 130
    iget-object v14, v3, La/res0;->o:La/btt0;

    .line 131
    .line 132
    move-object/from16 p1, v1

    .line 133
    .line 134
    iget-object v1, v3, La/res0;->p:La/knf0;

    .line 135
    .line 136
    move-object/from16 v20, v15

    .line 137
    .line 138
    iget-object v15, v3, La/res0;->n:La/gii0;

    .line 139
    .line 140
    move-object/from16 v21, v1

    .line 141
    .line 142
    iget-object v1, v3, La/res0;->i:La/fsd;

    .line 143
    .line 144
    move-object/from16 v22, v18

    .line 145
    .line 146
    move-object/from16 v18, v6

    .line 147
    .line 148
    iget-object v6, v3, La/res0;->s:La/ugf0;

    .line 149
    .line 150
    iget-object v3, v3, La/res0;->t:La/wsf0;

    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-object/from16 v17, v4

    .line 195
    .line 196
    new-instance v4, La/h6i;

    .line 197
    .line 198
    move-object/from16 v19, v7

    .line 199
    .line 200
    move-object v7, v3

    .line 201
    invoke-direct/range {v4 .. v19}, La/h6i;-><init>(La/cad;La/ugf0;La/wsf0;Ljava/lang/String;Ljava/lang/String;La/ctf0;La/m1e;La/i1w0;La/duj;La/btt0;La/gii0;La/ocl;La/b8u;La/fme;La/edo;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v4, La/h6i;->c:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, La/n5d0;

    .line 207
    .line 208
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, La/fyi;

    .line 213
    .line 214
    iput-object v1, v0, La/afs0;->M1:La/fyi;

    .line 215
    .line 216
    return-void

    .line 217
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 218
    .line 219
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, La/wes0;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-direct {p1, p0, p2}, La/wes0;-><init>(La/afs0;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/afs0;->Q1:[La/iiy;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    aget-object p1, p1, v0

    .line 17
    .line 18
    iget-object v0, p0, La/afs0;->O1:La/s0r;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p1, La/aid;

    .line 28
    .line 29
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 30
    .line 31
    new-instance v0, La/owp0;

    .line 32
    .line 33
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, La/p6r0;

    .line 37
    .line 38
    const/16 v2, 0x12

    .line 39
    .line 40
    invoke-direct {v1, p0, v2}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    new-instance p0, La/ugd;

    .line 44
    .line 45
    const v2, -0x55d1ef02

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v2, p2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
