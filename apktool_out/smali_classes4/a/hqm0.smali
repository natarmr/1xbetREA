.class public final La/hqm0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hqm0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s9m0",
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
.field public static final V1:La/s9m0;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/epi0;

.field public M1:La/fiu0;

.field public N1:La/poq0;

.field public final O1:La/khf0;

.field public final P1:Z

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public final S1:La/b0l0;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hqm0;

    .line 4
    .line 5
    const-string v2, "page"

    .line 6
    .line 7
    const-string v3, "getPage()Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;"

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
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentStockBinding;"

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
    sput-object v1, La/hqm0;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s9m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/hqm0;->V1:La/s9m0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d00ed

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
    iput-object v0, p0, La/hqm0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/khf0;

    .line 12
    .line 13
    const-string v1, "params_key"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/hqm0;->O1:La/khf0;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, La/hqm0;->P1:Z

    .line 22
    .line 23
    new-instance v1, La/eqm0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/eqm0;-><init>(La/hqm0;B)V

    .line 27
    .line 28
    .line 29
    new-instance v2, La/fyk0;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-direct {v2, p0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v3, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v4, La/fyk0;

    .line 39
    .line 40
    const/16 v5, 0xb

    .line 41
    .line 42
    invoke-direct {v4, v2, v5}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-class v4, La/rqm0;

    .line 50
    .line 51
    sget-object v5, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, La/cdl0;

    .line 58
    .line 59
    const/16 v6, 0x8

    .line 60
    .line 61
    invoke-direct {v5, v2, v6}, La/cdl0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v6, La/cdl0;

    .line 65
    .line 66
    const/16 v7, 0x9

    .line 67
    .line 68
    invoke-direct {v6, v2, v7}, La/cdl0;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, La/hqm0;->Q1:La/kiu0;

    .line 76
    .line 77
    sget-object v1, La/fqm0;->a:La/fqm0;

    .line 78
    .line 79
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, La/hqm0;->R1:La/s0r;

    .line 84
    .line 85
    new-instance v1, La/b0l0;

    .line 86
    .line 87
    const/4 v2, 0x5

    .line 88
    invoke-direct {v1, p0, v2}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La/hqm0;->S1:La/b0l0;

    .line 92
    .line 93
    new-instance v1, La/eqm0;

    .line 94
    .line 95
    invoke-direct {v1, p0, v0}, La/eqm0;-><init>(La/hqm0;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, La/hqm0;->U1:La/a8z;

    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/hqm0;->G0()La/wth;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/wth;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 6
    .line 7
    new-instance v0, La/lph0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/hqm0;->I0()La/rqm0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v7, 0x1a

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-class v3, La/rqm0;

    .line 18
    .line 19
    const-string v4, "onRefreshClick"

    .line 20
    .line 21
    const-string v5, "onRefreshClick()V"

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/hqm0;->H0()La/epi0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, La/hqm0;->G0()La/wth;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, La/wth;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    iget-object v1, p0, La/hqm0;->U1:La/a8z;

    .line 40
    .line 41
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/bqm0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iput-object v1, p1, La/epi0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-direct {p1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const v2, 0x7f0706f8

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const v2, 0x7f070712

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    new-instance v3, La/qmk0;

    .line 102
    .line 103
    const/4 v11, 0x0

    .line 104
    const/16 v12, 0x1c0

    .line 105
    .line 106
    const/4 v9, 0x1

    .line 107
    const/4 v10, 0x0

    .line 108
    move v5, v4

    .line 109
    move v6, v4

    .line 110
    move v7, v4

    .line 111
    invoke-direct/range {v3 .. v12}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 115
    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    invoke-static {v0, v1, v1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, La/hqm0;->G0()La/wth;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, La/wth;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 126
    .line 127
    new-instance v2, La/owp0;

    .line 128
    .line 129
    invoke-direct {v2, p0}, La/owp0;-><init>(La/clz;)V

    .line 130
    .line 131
    .line 132
    new-instance v3, La/edk0;

    .line 133
    .line 134
    const/16 v4, 0x19

    .line 135
    .line 136
    invoke-direct {v3, p0, v4}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance p0, La/ugd;

    .line 140
    .line 141
    const v4, -0x7fe14008

    .line 142
    .line 143
    .line 144
    invoke-direct {p0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v2, p1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final C0()V
    .locals 19

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
    const-class v2, La/f0h;

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
    instance-of v4, v1, La/f0h;

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
    check-cast v3, La/f0h;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/hqm0;->W1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/hqm0;->O1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v14, v1

    .line 69
    check-cast v14, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 70
    .line 71
    iget-object v7, v3, La/f0h;->a:La/duj;

    .line 72
    .line 73
    iget-object v5, v3, La/f0h;->c:La/cad;

    .line 74
    .line 75
    iget-object v1, v3, La/f0h;->d:La/gii0;

    .line 76
    .line 77
    iget-object v2, v3, La/f0h;->b:La/oeg0;

    .line 78
    .line 79
    iget-object v8, v3, La/f0h;->e:La/kt2;

    .line 80
    .line 81
    iget-object v9, v3, La/f0h;->f:La/g2v;

    .line 82
    .line 83
    iget-object v10, v3, La/f0h;->g:La/m1e;

    .line 84
    .line 85
    iget-object v6, v3, La/f0h;->h:La/pyg;

    .line 86
    .line 87
    iget-object v11, v3, La/f0h;->i:La/n2u;

    .line 88
    .line 89
    iget-object v12, v3, La/f0h;->j:La/hvt;

    .line 90
    .line 91
    iget-object v13, v3, La/f0h;->k:La/poq0;

    .line 92
    .line 93
    iget-object v15, v3, La/f0h;->l:La/q8u;

    .line 94
    .line 95
    iget-object v4, v3, La/f0h;->m:La/cyg0;

    .line 96
    .line 97
    move-object/from16 v16, v1

    .line 98
    .line 99
    iget-object v1, v3, La/f0h;->n:La/pru;

    .line 100
    .line 101
    iget-object v3, v3, La/f0h;->o:La/zr1;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-object/from16 v16, v4

    .line 119
    .line 120
    new-instance v4, La/v7i;

    .line 121
    .line 122
    move-object/from16 v17, v1

    .line 123
    .line 124
    move-object/from16 v18, v3

    .line 125
    .line 126
    invoke-direct/range {v4 .. v18}, La/v7i;-><init>(La/cad;La/pyg;La/duj;La/kt2;La/g2v;La/m1e;La/n2u;La/hvt;La/poq0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/q8u;La/cyg0;La/pru;La/zr1;)V

    .line 127
    .line 128
    .line 129
    new-instance v1, La/epi0;

    .line 130
    .line 131
    const/16 v2, 0xc

    .line 132
    .line 133
    invoke-direct {v1, v2}, La/epi0;-><init>(B)V

    .line 134
    .line 135
    .line 136
    iput-object v1, v0, La/hqm0;->L1:La/epi0;

    .line 137
    .line 138
    new-instance v1, La/fiu0;

    .line 139
    .line 140
    iget-object v2, v4, La/v7i;->o:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/uci;

    .line 143
    .line 144
    const-class v3, La/rqm0;

    .line 145
    .line 146
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, v0, La/hqm0;->M1:La/fiu0;

    .line 154
    .line 155
    iput-object v13, v0, La/hqm0;->N1:La/poq0;

    .line 156
    .line 157
    return-void

    .line 158
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 159
    .line 160
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/hqm0;->I0()La/rqm0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/rqm0;->r:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/tmg0;

    .line 8
    .line 9
    const/16 v3, 0x17

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, v0, v4, v3}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v0, La/fnq;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/lkz;->a:La/lkz;

    .line 21
    .line 22
    new-instance v1, La/gqm0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v4, v2}, La/gqm0;-><init>(La/hqm0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v5, La/zol0;

    .line 41
    .line 42
    invoke-direct {v5, v0, v2, v1, v4}, La/zol0;-><init>(La/fnq;La/clz;La/gqm0;La/yje;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/hqm0;->I0()La/rqm0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v1, v1, La/rqm0;->w:La/ol60;

    .line 54
    .line 55
    new-instance v2, La/gqm0;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    invoke-direct {v2, p0, v4, v3}, La/gqm0;-><init>(La/hqm0;La/yje;B)V

    .line 59
    .line 60
    .line 61
    sget-object v3, La/lkz;->a:La/lkz;

    .line 62
    .line 63
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    new-instance v5, La/zol0;

    .line 76
    .line 77
    invoke-direct {v5, v1, p0, v2, v4}, La/zol0;-><init>(La/gmq;La/clz;La/gqm0;La/yje;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final G0()La/wth;
    .locals 2

    .line 1
    sget-object v0, La/hqm0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hqm0;->R1:La/s0r;

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
    check-cast p0, La/wth;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/epi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hqm0;->L1:La/epi0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "stockRecyclerFragmentDelegate"

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

.method public final I0()La/rqm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hqm0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rqm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/hqm0;->H0()La/epi0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/hqm0;->G0()La/wth;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/wth;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/hqm0;->I0()La/rqm0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/rqm0;->n:La/poq0;

    .line 9
    .line 10
    iget-object v0, v0, La/poq0;->a:La/jxi;

    .line 11
    .line 12
    invoke-virtual {v0}, La/jxi;->d()La/r8i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/fk60;->w:La/fk60;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/r8i;->r(La/fk60;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, La/rqm0;->w:La/ol60;

    .line 25
    .line 26
    sget-object v0, La/nqm0;->a:La/nqm0;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/hqm0;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hqm0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
