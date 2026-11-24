.class public final La/ptk;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ptk;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/ddk",
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
.field public static final U1:La/ddk;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/vqc;

.field public L1:La/fiu0;

.field public final M1:Z

.field public final N1:La/khf0;

.field public final O1:La/kiu0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public final R1:La/z9f;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ptk;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;"

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
    const-string v5, "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentDisciplineListBinding;"

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
    sput-object v1, La/ptk;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/ddk;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ptk;->U1:La/ddk;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const v0, 0x7f0d00eb

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/ptk;->M1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "params"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/ptk;->N1:La/khf0;

    .line 18
    .line 19
    new-instance v1, La/mtk;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, La/mtk;-><init>(La/ptk;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/v9k;

    .line 26
    .line 27
    const/16 v3, 0x10

    .line 28
    .line 29
    invoke-direct {v2, p0, v3}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v3, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v4, La/v9k;

    .line 35
    .line 36
    const/16 v5, 0x11

    .line 37
    .line 38
    invoke-direct {v4, v2, v5}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v4, La/sre0;->a:La/tre0;

    .line 46
    .line 47
    const-class v6, La/xtk;

    .line 48
    .line 49
    invoke-virtual {v4, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v7, La/b9k;

    .line 54
    .line 55
    const/4 v8, 0x6

    .line 56
    invoke-direct {v7, v2, v8}, La/b9k;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    new-instance v8, La/b9k;

    .line 60
    .line 61
    const/4 v9, 0x7

    .line 62
    invoke-direct {v8, v2, v9}, La/b9k;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v6, v7, v8, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, La/ptk;->O1:La/kiu0;

    .line 70
    .line 71
    new-instance v6, La/wej;

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    const/16 v13, 0x8

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    const-class v9, La/ptk;

    .line 78
    .line 79
    const-string v10, "requireParentFragment"

    .line 80
    .line 81
    const-string v11, "requireParentFragment()Landroidx/fragment/app/Fragment;"

    .line 82
    .line 83
    move-object v8, p0

    .line 84
    invoke-direct/range {v6 .. v13}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 85
    .line 86
    .line 87
    new-instance p0, La/v9k;

    .line 88
    .line 89
    const/16 v1, 0x12

    .line 90
    .line 91
    invoke-direct {p0, v6, v1}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3, p0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-class v1, La/luk;

    .line 99
    .line 100
    invoke-virtual {v4, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, La/b9k;

    .line 105
    .line 106
    const/16 v4, 0x8

    .line 107
    .line 108
    invoke-direct {v2, p0, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 109
    .line 110
    .line 111
    new-instance v4, La/b9k;

    .line 112
    .line 113
    const/16 v6, 0x9

    .line 114
    .line 115
    invoke-direct {v4, p0, v6}, La/b9k;-><init>(La/a8z;B)V

    .line 116
    .line 117
    .line 118
    new-instance v6, La/lhf;

    .line 119
    .line 120
    invoke-direct {v6, v8, p0, v5}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {v8, v1, v2, v4, v6}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput-object p0, v8, La/ptk;->P1:La/kiu0;

    .line 128
    .line 129
    sget-object p0, La/ntk;->a:La/ntk;

    .line 130
    .line 131
    invoke-static {v8, p0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iput-object p0, v8, La/ptk;->Q1:La/s0r;

    .line 136
    .line 137
    new-instance p0, La/z9f;

    .line 138
    .line 139
    const/16 v1, 0xd

    .line 140
    .line 141
    invoke-direct {p0, v8, v1}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    iput-object p0, v8, La/ptk;->R1:La/z9f;

    .line 145
    .line 146
    new-instance p0, La/mtk;

    .line 147
    .line 148
    invoke-direct {p0, v8, v0}, La/mtk;-><init>(La/ptk;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v3, p0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iput-object p0, v8, La/ptk;->S1:La/a8z;

    .line 156
    .line 157
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/ptk;->H0()La/vqc;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, La/ptk;->G0()La/uth;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/uth;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    iget-object p0, p0, La/ptk;->S1:La/a8z;

    .line 12
    .line 13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/ltk;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object p0, p1, La/vqc;->b:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const p1, 0x7f070717

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    new-instance v1, La/qmk0;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/16 v10, 0x1c0

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v8, 0x0

    .line 65
    move v3, v2

    .line 66
    move v4, v2

    .line 67
    move v5, v2

    .line 68
    move v6, v2

    .line 69
    invoke-direct/range {v1 .. v10}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    invoke-static {v0, p0, p0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 77
    .line 78
    .line 79
    new-instance p0, La/qtk;

    .line 80
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final C0()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/uyg;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/uyg;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/uyg;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/ptk;->V1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/ptk;->N1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v8, v0

    .line 67
    check-cast v8, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 68
    .line 69
    iget-object v7, v2, La/uyg;->a:La/duj;

    .line 70
    .line 71
    iget-object v4, v2, La/uyg;->c:La/cad;

    .line 72
    .line 73
    iget-object v0, v2, La/uyg;->d:La/gii0;

    .line 74
    .line 75
    iget-object v1, v2, La/uyg;->b:La/oeg0;

    .line 76
    .line 77
    iget-object v11, v2, La/uyg;->e:La/kt2;

    .line 78
    .line 79
    iget-object v12, v2, La/uyg;->f:La/pmi;

    .line 80
    .line 81
    iget-object v9, v2, La/uyg;->j:La/cyu;

    .line 82
    .line 83
    iget-object v10, v2, La/uyg;->k:La/zr1;

    .line 84
    .line 85
    iget-object v13, v2, La/uyg;->g:La/g2v;

    .line 86
    .line 87
    iget-object v14, v2, La/uyg;->h:La/m1e;

    .line 88
    .line 89
    iget-object v5, v2, La/uyg;->i:La/pyg;

    .line 90
    .line 91
    iget-object v3, v2, La/uyg;->l:La/xri;

    .line 92
    .line 93
    iget-object v6, v2, La/uyg;->m:La/iip;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v3, La/daf;

    .line 117
    .line 118
    invoke-direct/range {v3 .. v14}, La/daf;-><init>(La/cad;La/pyg;La/iip;La/duj;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;La/cyu;La/zr1;La/kt2;La/pmi;La/g2v;La/m1e;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, La/vqc;

    .line 122
    .line 123
    const/16 v1, 0x1a

    .line 124
    .line 125
    invoke-direct {v0, v1}, La/vqc;-><init>(B)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, La/ptk;->K1:La/vqc;

    .line 129
    .line 130
    new-instance v0, La/fiu0;

    .line 131
    .line 132
    iget-object v1, v3, La/daf;->m:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, La/uci;

    .line 135
    .line 136
    const-class v2, La/xtk;

    .line 137
    .line 138
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, La/ptk;->L1:La/fiu0;

    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 149
    .line 150
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    iget-object v0, p0, La/ptk;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/xtk;

    .line 8
    .line 9
    iget-object v0, v0, La/xtk;->l:La/p7m0;

    .line 10
    .line 11
    new-instance v1, La/otk;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-direct {v1, p0, v7, v2}, La/otk;-><init>(La/ptk;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, La/xsj;

    .line 33
    .line 34
    invoke-direct {v4, v0, v2, v1, v7}, La/xsj;-><init>(La/gmq;La/clz;La/otk;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, La/ptk;->P1:La/kiu0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/luk;

    .line 48
    .line 49
    iget-object v4, v1, La/luk;->b:La/p7m0;

    .line 50
    .line 51
    new-instance v6, La/otk;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-direct {v6, p0, v7, v1}, La/otk;-><init>(La/ptk;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v3, La/xsj;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-direct/range {v3 .. v8}, La/xsj;-><init>(La/gmq;La/clz;La/otk;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final G0()La/uth;
    .locals 2

    .line 1
    sget-object v0, La/ptk;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ptk;->Q1:La/s0r;

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
    check-cast p0, La/uth;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vqc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ptk;->K1:La/vqc;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "disciplineListRecyclerFragmentDelegate"

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

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ptk;->H0()La/vqc;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/ptk;->G0()La/uth;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/uth;->c:Landroidx/recyclerview/widget/RecyclerView;

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ptk;->M1:Z

    .line 2
    .line 3
    return p0
.end method
