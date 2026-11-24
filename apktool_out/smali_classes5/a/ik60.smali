.class public final La/ik60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ik60;",
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

.field public L1:La/lmi;

.field public final M1:La/kiu0;

.field public N1:La/roq0;

.field public final O1:La/s0r;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ik60;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/onboarding_section/impl/databinding/FragmentOnboardingSectionsBinding;"

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
    sput-object v1, La/ik60;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d026e

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
    iput-object v0, p0, La/ik60;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/gk60;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, La/gk60;-><init>(La/ik60;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ej50;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, p0, v2}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/ej50;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v3, La/pk60;

    .line 37
    .line 38
    sget-object v4, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, La/y620;

    .line 45
    .line 46
    const/16 v5, 0x1a

    .line 47
    .line 48
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/y620;

    .line 52
    .line 53
    const/16 v6, 0x1b

    .line 54
    .line 55
    invoke-direct {v5, v1, v6}, La/y620;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/ik60;->M1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/hk60;->a:La/hk60;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/ik60;->O1:La/s0r;

    .line 71
    .line 72
    new-instance v0, La/gk60;

    .line 73
    .line 74
    const/4 v1, 0x2

    .line 75
    invoke-direct {v0, p0, v1}, La/gk60;-><init>(La/ik60;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/ik60;->P1:La/a8z;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/ik60;->G0()La/i2r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/i2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/gk60;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/gk60;-><init>(La/ik60;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const v1, 0x7f05000f

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const v0, 0x7f070714

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const v0, 0x7f0706ea

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0}, La/ik60;->G0()La/i2r;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/i2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v0, p1, v1, p1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/ik60;->P1:La/a8z;

    .line 78
    .line 79
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, La/kk60;

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 86
    .line 87
    .line 88
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
    const-class v2, La/jk60;

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
    instance-of v4, v1, La/jk60;

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
    check-cast v3, La/jk60;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v5, v3, La/jk60;->a:La/d1p;

    .line 58
    .line 59
    iget-object v8, v3, La/jk60;->b:La/zx10;

    .line 60
    .line 61
    iget-object v9, v3, La/jk60;->c:La/peg0;

    .line 62
    .line 63
    iget-object v10, v3, La/jk60;->d:La/pek;

    .line 64
    .line 65
    iget-object v11, v3, La/jk60;->e:La/zg;

    .line 66
    .line 67
    iget-object v12, v3, La/jk60;->f:La/czt;

    .line 68
    .line 69
    iget-object v13, v3, La/jk60;->g:La/pmi0;

    .line 70
    .line 71
    iget-object v14, v3, La/jk60;->h:La/ouu;

    .line 72
    .line 73
    iget-object v15, v3, La/jk60;->i:La/lbu;

    .line 74
    .line 75
    iget-object v1, v3, La/jk60;->j:La/kj5;

    .line 76
    .line 77
    iget-object v2, v3, La/jk60;->k:La/mne;

    .line 78
    .line 79
    iget-object v4, v3, La/jk60;->l:La/bst;

    .line 80
    .line 81
    iget-object v6, v3, La/jk60;->m:La/ctf0;

    .line 82
    .line 83
    iget-object v7, v3, La/jk60;->n:La/pru;

    .line 84
    .line 85
    move-object/from16 v16, v1

    .line 86
    .line 87
    iget-object v1, v3, La/jk60;->o:La/btt0;

    .line 88
    .line 89
    move-object/from16 v17, v1

    .line 90
    .line 91
    iget-object v1, v3, La/jk60;->p:La/b3c0;

    .line 92
    .line 93
    move-object/from16 v19, v6

    .line 94
    .line 95
    iget-object v6, v3, La/jk60;->r:La/poq0;

    .line 96
    .line 97
    move-object/from16 v20, v7

    .line 98
    .line 99
    iget-object v7, v3, La/jk60;->s:La/epi0;

    .line 100
    .line 101
    iget-object v3, v3, La/jk60;->q:La/gst0;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-object/from16 v18, v4

    .line 119
    .line 120
    new-instance v4, La/mci;

    .line 121
    .line 122
    move-object/from16 v17, v2

    .line 123
    .line 124
    move-object/from16 v21, v3

    .line 125
    .line 126
    invoke-direct/range {v4 .. v21}, La/mci;-><init>(La/d1p;La/poq0;La/epi0;La/zx10;La/peg0;La/pek;La/zg;La/czt;La/pmi0;La/ouu;La/lbu;La/kj5;La/mne;La/bst;La/ctf0;La/pru;La/gst0;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v4, La/mci;->k:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, La/n5d0;

    .line 132
    .line 133
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/lmi;

    .line 138
    .line 139
    iput-object v1, v0, La/ik60;->L1:La/lmi;

    .line 140
    .line 141
    new-instance v1, La/roq0;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v1, v0, La/ik60;->N1:La/roq0;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 150
    .line 151
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    iget-object v8, p0, La/ik60;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/pk60;

    .line 8
    .line 9
    iget-object v0, v0, La/pk60;->p:La/p7m0;

    .line 10
    .line 11
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    new-instance v0, La/vf20;

    .line 16
    .line 17
    const/4 v6, 0x4

    .line 18
    const/16 v7, 0xc

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    const-class v3, La/ik60;

    .line 22
    .line 23
    const-string v4, "showContent"

    .line 24
    .line 25
    const-string v5, "showContent(Ljava/util/List;)V"

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v4, La/yd60;

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    invoke-direct {v4, v9, v1, v0, v10}, La/yd60;-><init>(La/xae0;La/clz;La/vf20;La/yje;)V

    .line 49
    .line 50
    .line 51
    const/4 v9, 0x3

    .line 52
    invoke-static {v2, v10, v10, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/pk60;

    .line 60
    .line 61
    iget-object v8, v0, La/pk60;->q:La/ol60;

    .line 62
    .line 63
    new-instance v0, La/vf20;

    .line 64
    .line 65
    const/16 v7, 0xd

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    const-string v4, "handleOpenTips"

    .line 69
    .line 70
    const-string v5, "handleOpenTips(I)V"

    .line 71
    .line 72
    move-object v2, p0

    .line 73
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, La/yd60;

    .line 89
    .line 90
    invoke-direct {v3, v8, v1, v0, v10}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v10, v10, v3, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/i2r;
    .locals 2

    .line 1
    sget-object v0, La/ik60;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ik60;->O1:La/s0r;

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
    check-cast p0, La/i2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ik60;->G0()La/i2r;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/i2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ik60;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
