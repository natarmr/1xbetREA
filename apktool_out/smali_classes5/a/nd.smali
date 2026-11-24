.class public final La/nd;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/nd;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jdk0",
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
.field public static final S1:La/jdk0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/yfi;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/khf0;

.field public final P1:La/cu;

.field public final Q1:La/yzn0;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/nd;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentAccountChoiceBinding;"

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
    const-string v3, "tokenRestoreData"

    .line 16
    .line 17
    const-string v5, "getTokenRestoreData()Lorg/xplatform/security/api/presentation/models/TokenRestoreData;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "accounts"

    .line 25
    .line 26
    const-string v6, "getAccounts()[J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "navigation"

    .line 34
    .line 35
    const-string v7, "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/nd;->U1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/jdk0;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/nd;->S1:La/jdk0;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01de

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/ld;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, v1}, La/ld;-><init>(La/nd;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/o5;

    .line 14
    .line 15
    const/16 v2, 0xf

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/o5;

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, La/qd;

    .line 34
    .line 35
    sget-object v3, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, La/k8;

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/k8;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/k8;

    .line 49
    .line 50
    const/16 v5, 0x9

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/nd;->M1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/md;->a:La/md;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/nd;->N1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/khf0;

    .line 70
    .line 71
    const-string v1, "TOKEN"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/nd;->O1:La/khf0;

    .line 77
    .line 78
    new-instance v0, La/cu;

    .line 79
    .line 80
    const-string v1, "ACCOUNTS"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/cu;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/nd;->P1:La/cu;

    .line 86
    .line 87
    new-instance v0, La/yzn0;

    .line 88
    .line 89
    const-string v1, "NAVIGATION"

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/nd;->Q1:La/yzn0;

    .line 95
    .line 96
    new-instance v0, La/ld;

    .line 97
    .line 98
    const/4 v1, 0x4

    .line 99
    invoke-direct {v0, p0, v1}, La/ld;-><init>(La/nd;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, La/nd;->R1:La/n0o0;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/gxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La/gxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p1, p1, La/gxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    iget-object v0, p0, La/nd;->R1:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/kd;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/gxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const v1, 0x7f040ae3

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-static {v0, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const v3, 0x7f0700a5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    int-to-float v1, v1

    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const v4, 0x7f070717

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    new-instance v4, La/lrh0;

    .line 86
    .line 87
    invoke-direct {v4, v1, v0, v3, v2}, La/lrh0;-><init>(FIII)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, La/ld;

    .line 94
    .line 95
    invoke-direct {p1, p0, v2}, La/ld;-><init>(La/nd;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, La/gxq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 106
    .line 107
    new-instance v0, La/ld;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    invoke-direct {v0, p0, v1}, La/ld;-><init>(La/nd;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/nd;->G0()La/gxq;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object p1, p1, La/gxq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 121
    .line 122
    new-instance v0, La/ld;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    invoke-direct {v0, p0, v1}, La/ld;-><init>(La/nd;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final C0()V
    .locals 13

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
    const-class v1, La/ntn;

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
    instance-of v3, v0, La/ntn;

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
    check-cast v2, La/ntn;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v8, La/otn;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    sget-object v1, La/nd;->U1:[La/iiy;

    .line 59
    .line 60
    aget-object v0, v1, v0

    .line 61
    .line 62
    iget-object v3, p0, La/nd;->O1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v3, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 69
    .line 70
    const/4 v3, 0x2

    .line 71
    aget-object v1, v1, v3

    .line 72
    .line 73
    iget-object v3, p0, La/nd;->P1:La/cu;

    .line 74
    .line 75
    invoke-virtual {v3, p0, v1}, La/cu;->h(Landroidx/fragment/app/Fragment;La/iiy;)[J

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, La/tx3;->f0([J)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v8, v0, v1}, La/otn;-><init>(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    iget-object v6, v2, La/ntn;->a:La/cad;

    .line 87
    .line 88
    iget-object v5, v2, La/ntn;->b:La/lef0;

    .line 89
    .line 90
    iget-object v9, v2, La/ntn;->c:La/qgd;

    .line 91
    .line 92
    iget-object v4, v2, La/ntn;->d:La/onv;

    .line 93
    .line 94
    iget-object v7, v2, La/ntn;->g:La/ii;

    .line 95
    .line 96
    iget-object v0, v2, La/ntn;->e:La/d190;

    .line 97
    .line 98
    iget-object v1, v2, La/ntn;->f:La/gii0;

    .line 99
    .line 100
    iget-object v10, v2, La/ntn;->h:La/ctf0;

    .line 101
    .line 102
    iget-object v11, v2, La/ntn;->i:La/m1e;

    .line 103
    .line 104
    iget-object v12, v2, La/ntn;->j:La/zn00;

    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v3, La/rrd;

    .line 122
    .line 123
    invoke-direct/range {v3 .. v12}, La/rrd;-><init>(La/onv;La/lef0;La/cad;La/ii;La/otn;La/qgd;La/ctf0;La/m1e;La/zn00;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, v3, La/rrd;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/n5d0;

    .line 129
    .line 130
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/yfi;

    .line 135
    .line 136
    iput-object v0, p0, La/nd;->K1:La/yfi;

    .line 137
    .line 138
    iput-object v7, p0, La/nd;->L1:La/ii;

    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 142
    .line 143
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final D0()V
    .locals 8

    .line 1
    iget-object v0, p0, La/nd;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/qd;

    .line 8
    .line 9
    iget-object v1, v1, La/qd;->i:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/pa;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-direct {v2, p0, v3, v4}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v5, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {v6}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    new-instance v7, La/m1;

    .line 33
    .line 34
    invoke-direct {v7, v1, v5, v2, v3}, La/m1;-><init>(La/gmq;La/clz;La/pa;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-static {v6, v3, v3, v7, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/qd;

    .line 46
    .line 47
    iget-object v0, v0, La/qd;->j:La/p7m0;

    .line 48
    .line 49
    new-instance v2, La/qa;

    .line 50
    .line 51
    invoke-direct {v2, p0, v3, v4}, La/qa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v5, La/m1;

    .line 67
    .line 68
    invoke-direct {v5, v0, p0, v2, v3}, La/m1;-><init>(La/gmq;La/clz;La/qa;La/yje;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v3, v3, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final G0()La/gxq;
    .locals 2

    .line 1
    sget-object v0, La/nd;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/nd;->N1:La/s0r;

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
    check-cast p0, La/gxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()V
    .locals 14

    .line 1
    iget-object v0, p0, La/nd;->L1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v1, 0x7f1317d9

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const v1, 0x7f13047e

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const v1, 0x7f130a86

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const v1, 0x7f13032f

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    sget-object v11, La/n12;->b:La/n12;

    .line 37
    .line 38
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    const/16 v13, 0x5d0

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const-string v8, "REQUEST_BACK_DIALOG_KEY"

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "actionDialogManager"

    .line 63
    .line 64
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/ld;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, p0, v0}, La/ld;-><init>(La/nd;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_BACK_DIALOG_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
