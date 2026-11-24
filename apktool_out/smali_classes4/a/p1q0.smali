.class public final La/p1q0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/p1q0;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/axi;

.field public M1:La/rl70;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/p1q0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentTestSectionNewBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/p1q0;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d02f0

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
    iput-object v0, p0, La/p1q0;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/o1q0;->a:La/o1q0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/p1q0;->N1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/n1q0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/n1q0;-><init>(La/p1q0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/mfo0;

    .line 26
    .line 27
    const/16 v2, 0xd

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/mfo0;

    .line 35
    .line 36
    const/16 v4, 0xe

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v3, La/x1q0;

    .line 46
    .line 47
    sget-object v4, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, La/r5p0;

    .line 54
    .line 55
    const/4 v5, 0x6

    .line 56
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    new-instance v5, La/r5p0;

    .line 60
    .line 61
    const/4 v6, 0x7

    .line 62
    invoke-direct {v5, v1, v6}, La/r5p0;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/p1q0;->O1:La/kiu0;

    .line 70
    .line 71
    new-instance v0, La/n1q0;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, v1}, La/n1q0;-><init>(La/p1q0;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/p1q0;->P1:La/a8z;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/p1q0;->G0()La/u5r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/u5r;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    new-instance v0, La/n1q0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/n1q0;-><init>(La/p1q0;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const v0, 0x7f05000f

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const v0, 0x7f070725

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    :goto_0
    move v1, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const v0, 0x7f0706ea

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    goto :goto_0

    .line 58
    :goto_1
    invoke-virtual {p0}, La/p1q0;->G0()La/u5r;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, p1, La/u5r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    const/16 v5, 0xa

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    move v3, v1

    .line 69
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/p1q0;->G0()La/u5r;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p1, p1, La/u5r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    iget-object v0, p0, La/p1q0;->P1:La/a8z;

    .line 79
    .line 80
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/k1q0;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/p1q0;->G0()La/u5r;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, La/u5r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 94
    .line 95
    const/4 v0, 0x3

    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-static {p1, v1, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 98
    .line 99
    .line 100
    new-instance p1, La/l7p0;

    .line 101
    .line 102
    const/16 v0, 0xf

    .line 103
    .line 104
    invoke-direct {p1, p0, v0}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 108
    .line 109
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final C0()V
    .locals 27

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
    const-class v2, La/q1q0;

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
    instance-of v4, v1, La/q1q0;

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
    check-cast v3, La/q1q0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v17

    .line 61
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v7, v3, La/q1q0;->a:La/peg0;

    .line 65
    .line 66
    iget-object v9, v3, La/q1q0;->b:La/rjo;

    .line 67
    .line 68
    iget-object v6, v3, La/q1q0;->i:La/bxi;

    .line 69
    .line 70
    iget-object v10, v3, La/q1q0;->c:La/yox;

    .line 71
    .line 72
    iget-object v11, v3, La/q1q0;->d:La/ilp0;

    .line 73
    .line 74
    iget-object v8, v3, La/q1q0;->e:La/epi0;

    .line 75
    .line 76
    iget-object v12, v3, La/q1q0;->f:La/n660;

    .line 77
    .line 78
    iget-object v13, v3, La/q1q0;->g:La/ou9;

    .line 79
    .line 80
    iget-object v14, v3, La/q1q0;->h:La/ntu;

    .line 81
    .line 82
    iget-object v1, v3, La/q1q0;->j:La/ctf0;

    .line 83
    .line 84
    iget-object v15, v3, La/q1q0;->w:La/tgk;

    .line 85
    .line 86
    iget-object v2, v3, La/q1q0;->k:La/h760;

    .line 87
    .line 88
    iget-object v4, v3, La/q1q0;->l:La/ntu;

    .line 89
    .line 90
    iget-object v5, v3, La/q1q0;->n:La/pp90;

    .line 91
    .line 92
    move-object/from16 v16, v1

    .line 93
    .line 94
    iget-object v1, v3, La/q1q0;->m:La/rl70;

    .line 95
    .line 96
    move-object/from16 v20, v1

    .line 97
    .line 98
    iget-object v1, v3, La/q1q0;->o:La/bzt;

    .line 99
    .line 100
    move-object/from16 v21, v1

    .line 101
    .line 102
    iget-object v1, v3, La/q1q0;->p:La/j1q0;

    .line 103
    .line 104
    move-object/from16 v18, v1

    .line 105
    .line 106
    iget-object v1, v3, La/q1q0;->q:La/xaq0;

    .line 107
    .line 108
    move-object/from16 v19, v1

    .line 109
    .line 110
    iget-object v1, v3, La/q1q0;->r:La/rek0;

    .line 111
    .line 112
    move-object/from16 v22, v1

    .line 113
    .line 114
    iget-object v1, v3, La/q1q0;->s:La/nhf0;

    .line 115
    .line 116
    move-object/from16 v23, v1

    .line 117
    .line 118
    iget-object v1, v3, La/q1q0;->t:La/bot;

    .line 119
    .line 120
    move-object/from16 v24, v1

    .line 121
    .line 122
    iget-object v1, v3, La/q1q0;->u:La/bbw0;

    .line 123
    .line 124
    move-object/from16 v25, v1

    .line 125
    .line 126
    iget-object v1, v3, La/q1q0;->v:La/sue;

    .line 127
    .line 128
    iget-object v3, v3, La/q1q0;->x:La/iqt;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-object/from16 v19, v4

    .line 152
    .line 153
    new-instance v4, La/v5i;

    .line 154
    .line 155
    move-object/from16 v18, v2

    .line 156
    .line 157
    move-object/from16 v26, v3

    .line 158
    .line 159
    invoke-direct/range {v4 .. v26}, La/v5i;-><init>(La/pp90;La/bxi;La/peg0;La/epi0;La/rjo;La/yox;La/ilp0;La/n660;La/ou9;La/ntu;La/tgk;La/ctf0;La/i1w0;La/h760;La/ntu;La/rl70;La/bzt;La/rek0;La/nhf0;La/bot;La/bbw0;La/iqt;)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v1, v20

    .line 163
    .line 164
    iget-object v2, v4, La/v5i;->v:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, La/n5d0;

    .line 167
    .line 168
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, La/axi;

    .line 173
    .line 174
    iput-object v2, v0, La/p1q0;->L1:La/axi;

    .line 175
    .line 176
    iput-object v1, v0, La/p1q0;->M1:La/rl70;

    .line 177
    .line 178
    return-void

    .line 179
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 180
    .line 181
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/p1q0;->H0()La/x1q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/x1q0;->t:La/p7m0;

    .line 6
    .line 7
    new-instance v3, La/bdl0;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/16 v10, 0xa

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    const-class v6, La/p1q0;

    .line 14
    .line 15
    const-string v7, "updateData"

    .line 16
    .line 17
    const-string v8, "updateData(Ljava/util/List;)V"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-direct/range {v3 .. v10}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    move-object v14, v6

    .line 25
    sget-object v0, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/lto0;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct/range {v1 .. v6}, La/lto0;-><init>(La/gmq;La/clz;La/bdl0;La/yje;C)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, La/p1q0;->H0()La/x1q0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v8, v0, La/x1q0;->u:La/p7m0;

    .line 56
    .line 57
    new-instance v10, La/bdl0;

    .line 58
    .line 59
    const/16 v17, 0x4

    .line 60
    .line 61
    const/16 v18, 0xb

    .line 62
    .line 63
    const/4 v12, 0x2

    .line 64
    const-string v15, "handleEvent"

    .line 65
    .line 66
    const-string v16, "handleEvent(Lorg/xplatform/feature/office/test_section/impl/presentation/models/ButtonClickEvents;)V"

    .line 67
    .line 68
    move-object/from16 v13, p0

    .line 69
    .line 70
    move-object v11, v10

    .line 71
    invoke-direct/range {v11 .. v18}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v7, La/lto0;

    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    move-object v11, v5

    .line 90
    invoke-direct/range {v7 .. v12}, La/lto0;-><init>(La/gmq;La/clz;La/bdl0;La/yje;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/u5r;
    .locals 2

    .line 1
    sget-object v0, La/p1q0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/p1q0;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/u5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/x1q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/p1q0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/x1q0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/p1q0;->G0()La/u5r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/u5r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/p1q0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
