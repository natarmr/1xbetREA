.class public final La/l0n0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/l0n0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s2m0",
        "La/u2n0;",
        "uiState",
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
.field public static final P1:La/s2m0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/avi;

.field public L1:La/rl70;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l0n0;

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
    const-string v3, "subSectionType"

    .line 16
    .line 17
    const-string v5, "getSubSectionType()Lorg/xplatform/feature/office/test_section/impl/presentation/sub_section/models/SubSectionType;"

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
    sput-object v1, La/l0n0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s2m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/l0n0;->P1:La/s2m0;

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
    sget-object v0, La/k0n0;->a:La/k0n0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/l0n0;->M1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/a3n0;

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
    new-instance v1, La/i0n0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/i0n0;-><init>(La/l0n0;B)V

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
    iput-object v0, p0, La/l0n0;->N1:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/yzn0;

    .line 39
    .line 40
    const-string v1, "sub_section_params_key"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/l0n0;->O1:La/yzn0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/j0n0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/j0n0;-><init>(La/l0n0;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final C0()V
    .locals 22

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
    const-class v2, La/h0n0;

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
    instance-of v4, v1, La/h0n0;

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
    check-cast v3, La/h0n0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    sget-object v1, La/l0n0;->Q1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/l0n0;->O1:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v9, v1

    .line 73
    check-cast v9, La/o2n0;

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v10, v3, La/h0n0;->a:La/mne;

    .line 79
    .line 80
    iget-object v11, v3, La/h0n0;->b:La/ctf0;

    .line 81
    .line 82
    iget-object v5, v3, La/h0n0;->c:La/epi0;

    .line 83
    .line 84
    iget-object v6, v3, La/h0n0;->d:La/pp90;

    .line 85
    .line 86
    iget-object v12, v3, La/h0n0;->e:La/n660;

    .line 87
    .line 88
    iget-object v13, v3, La/h0n0;->f:La/bzt;

    .line 89
    .line 90
    iget-object v14, v3, La/h0n0;->g:La/gqc;

    .line 91
    .line 92
    iget-object v15, v3, La/h0n0;->h:La/ljt0;

    .line 93
    .line 94
    iget-object v1, v3, La/h0n0;->i:La/j1q0;

    .line 95
    .line 96
    iget-object v2, v3, La/h0n0;->j:La/ntu;

    .line 97
    .line 98
    iget-object v4, v3, La/h0n0;->k:La/rl70;

    .line 99
    .line 100
    iget-object v7, v3, La/h0n0;->l:La/rjo;

    .line 101
    .line 102
    move-object/from16 v16, v1

    .line 103
    .line 104
    iget-object v1, v3, La/h0n0;->m:La/bot;

    .line 105
    .line 106
    move-object/from16 v20, v1

    .line 107
    .line 108
    iget-object v1, v3, La/h0n0;->n:La/bbw0;

    .line 109
    .line 110
    iget-object v3, v3, La/h0n0;->o:La/sue;

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v18, v4

    .line 125
    .line 126
    new-instance v4, La/cr;

    .line 127
    .line 128
    move-object/from16 v21, v1

    .line 129
    .line 130
    move-object/from16 v17, v2

    .line 131
    .line 132
    move-object/from16 v19, v7

    .line 133
    .line 134
    move-object v7, v3

    .line 135
    invoke-direct/range {v4 .. v21}, La/cr;-><init>(La/epi0;La/pp90;La/sue;La/i1w0;La/o2n0;La/mne;La/ctf0;La/n660;La/bzt;La/gqc;La/ljt0;La/j1q0;La/ntu;La/rl70;La/rjo;La/bot;La/bbw0;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v1, v18

    .line 139
    .line 140
    iget-object v2, v4, La/cr;->r:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/n5d0;

    .line 143
    .line 144
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, La/avi;

    .line 149
    .line 150
    iput-object v2, v0, La/l0n0;->K1:La/avi;

    .line 151
    .line 152
    iput-object v1, v0, La/l0n0;->L1:La/rl70;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 156
    .line 157
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l0n0;->N1:La/a8z;

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

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/l0n0;->Q1:[La/iiy;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    aget-object p1, p1, p2

    .line 11
    .line 12
    iget-object p2, p0, La/l0n0;->M1:La/s0r;

    .line 13
    .line 14
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p1, La/aid;

    .line 22
    .line 23
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 24
    .line 25
    new-instance p2, La/j0n0;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-direct {p2, p0, v0}, La/j0n0;-><init>(La/l0n0;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v1, -0xf6c3667

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v1, v0, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
