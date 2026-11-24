.class public final La/s730;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/s730;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final Q1:La/atz;

.field public static final synthetic R1:[La/iiy;

.field public static final S1:Ljava/util/List;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/khf0;

.field public final P1:La/bg5;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s730;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/market_statistic/impl/databinding/FragmentMarketsStatisticBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;"

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
    sput-object v1, La/s730;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/atz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/s730;->Q1:La/atz;

    .line 38
    .line 39
    const v0, 0x7f0606d6

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const v0, 0x7f0606c6

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const v0, 0x7f0606c7

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const v0, 0x7f0606e5

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const v0, 0x7f0606b6

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const v0, 0x7f0606ae

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const v0, 0x7f0606d9

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    const v0, 0x7f0606cd

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const v0, 0x7f0606bb

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    move-object v10, v8

    .line 103
    filled-new-array/range {v1 .. v10}, [Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, La/s730;->S1:Ljava/util/List;

    .line 112
    .line 113
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0265

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
    iput-object v0, p0, La/s730;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/o730;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/o730;-><init>(La/s730;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/pv10;

    .line 18
    .line 19
    const/16 v3, 0x11

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/pv10;

    .line 27
    .line 28
    const/16 v5, 0x12

    .line 29
    .line 30
    invoke-direct {v4, v2, v5}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-class v3, La/dy20;

    .line 38
    .line 39
    sget-object v4, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/y620;

    .line 46
    .line 47
    const/16 v5, 0x8

    .line 48
    .line 49
    invoke-direct {v4, v2, v5}, La/y620;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/y620;

    .line 53
    .line 54
    const/16 v6, 0x9

    .line 55
    .line 56
    invoke-direct {v5, v2, v6}, La/y620;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/s730;->M1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/q730;->a:La/q730;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/s730;->N1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/khf0;

    .line 74
    .line 75
    const-string v2, "PARAMS"

    .line 76
    .line 77
    invoke-direct {v0, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/s730;->O1:La/khf0;

    .line 81
    .line 82
    new-instance v0, La/bg5;

    .line 83
    .line 84
    new-instance v2, La/p730;

    .line 85
    .line 86
    invoke-direct {v2, p0, v1}, La/p730;-><init>(La/s730;B)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v3, La/ei20;

    .line 93
    .line 94
    const/16 v4, 0x10

    .line 95
    .line 96
    invoke-direct {v3, v4}, La/ei20;-><init>(B)V

    .line 97
    .line 98
    .line 99
    new-instance v4, La/b530;

    .line 100
    .line 101
    invoke-direct {v4, v2, v1}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    new-instance v1, La/tvx;

    .line 105
    .line 106
    const/4 v2, 0x3

    .line 107
    const/16 v5, 0x16

    .line 108
    .line 109
    invoke-direct {v1, v2, v5}, La/tvx;-><init>(IB)V

    .line 110
    .line 111
    .line 112
    sget-object v2, La/gvy;->x:La/gvy;

    .line 113
    .line 114
    new-instance v5, La/gbn;

    .line 115
    .line 116
    invoke-direct {v5, v3, v1, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 120
    .line 121
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, La/s730;->P1:La/bg5;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/z1r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/l910;

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-direct {v0, p0, v1}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/z1r;->c:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {p1, v0}, La/knm0;->h(Landroid/view/View;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/z1r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    iget-object v0, p0, La/s730;->P1:La/bg5;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/kq8;

    .line 38
    .line 39
    invoke-direct {p1}, La/kq8;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v0, -0x1

    .line 43
    iput v0, p1, La/kq8;->b:I

    .line 44
    .line 45
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/z1r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 59
    .line 60
    new-instance v0, La/jw5;

    .line 61
    .line 62
    const/16 v1, 0xa

    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 68
    .line 69
    .line 70
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
    const-class v2, La/ix20;

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
    instance-of v4, v1, La/ix20;

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
    check-cast v3, La/ix20;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/s730;->R1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/s730;->O1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v10, v1

    .line 69
    check-cast v10, Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;

    .line 70
    .line 71
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v5, v3, La/ix20;->a:La/cad;

    .line 79
    .line 80
    iget-object v9, v3, La/ix20;->b:La/knf0;

    .line 81
    .line 82
    iget-object v11, v3, La/ix20;->c:La/zfo;

    .line 83
    .line 84
    iget-object v12, v3, La/ix20;->d:La/gii0;

    .line 85
    .line 86
    iget-object v1, v3, La/ix20;->e:La/kt2;

    .line 87
    .line 88
    iget-object v6, v3, La/ix20;->f:La/vqc;

    .line 89
    .line 90
    iget-object v13, v3, La/ix20;->g:La/g2v;

    .line 91
    .line 92
    iget-object v14, v3, La/ix20;->h:La/m1e;

    .line 93
    .line 94
    iget-object v8, v3, La/ix20;->i:La/ctf0;

    .line 95
    .line 96
    iget-object v15, v3, La/ix20;->j:La/rou;

    .line 97
    .line 98
    iget-object v2, v3, La/ix20;->k:La/ieu;

    .line 99
    .line 100
    iget-object v4, v3, La/ix20;->l:La/pru;

    .line 101
    .line 102
    move-object/from16 v16, v1

    .line 103
    .line 104
    iget-object v1, v3, La/ix20;->m:La/gst0;

    .line 105
    .line 106
    move-object/from16 v18, v1

    .line 107
    .line 108
    iget-object v1, v3, La/ix20;->o:La/x0u;

    .line 109
    .line 110
    move-object/from16 v19, v1

    .line 111
    .line 112
    iget-object v1, v3, La/ix20;->n:La/nx20;

    .line 113
    .line 114
    iget-object v3, v3, La/ix20;->p:La/j1q0;

    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object/from16 v17, v4

    .line 144
    .line 145
    new-instance v4, La/mci;

    .line 146
    .line 147
    move-object/from16 v20, v1

    .line 148
    .line 149
    move-object/from16 v16, v2

    .line 150
    .line 151
    move-object/from16 v21, v3

    .line 152
    .line 153
    invoke-direct/range {v4 .. v21}, La/mci;-><init>(La/cad;La/vqc;La/i1w0;La/ctf0;La/knf0;Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;La/zfo;La/gii0;La/g2v;La/m1e;La/rou;La/ieu;La/pru;La/gst0;La/x0u;La/nx20;La/j1q0;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, La/fiu0;

    .line 157
    .line 158
    iget-object v2, v4, La/mci;->r:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, La/rki;

    .line 161
    .line 162
    const-class v3, La/dy20;

    .line 163
    .line 164
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    iput-object v1, v0, La/s730;->L1:La/fiu0;

    .line 172
    .line 173
    return-void

    .line 174
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 175
    .line 176
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public final D0()V
    .locals 8

    .line 1
    iget-object v0, p0, La/s730;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/dy20;

    .line 8
    .line 9
    iget-object v1, v1, La/dy20;->t:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/r730;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v2, p0, v3, v4}, La/r730;-><init>(La/s730;La/yje;B)V

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
    new-instance v7, La/mw20;

    .line 33
    .line 34
    invoke-direct {v7, v1, v5, v2, v3}, La/mw20;-><init>(La/gmq;La/clz;La/r730;La/yje;)V

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
    check-cast v0, La/dy20;

    .line 46
    .line 47
    iget-object v2, v0, La/dy20;->s:La/p7m0;

    .line 48
    .line 49
    new-instance v5, La/zx20;

    .line 50
    .line 51
    invoke-direct {v5, v0, v3, v4}, La/zx20;-><init>(La/dy20;La/yje;B)V

    .line 52
    .line 53
    .line 54
    new-instance v6, La/u6n0;

    .line 55
    .line 56
    invoke-direct {v6, v2, v5}, La/u6n0;-><init>(La/p7m0;Lkotlin/jvm/functions/Function2;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, La/gbv;

    .line 60
    .line 61
    const/16 v5, 0x8

    .line 62
    .line 63
    invoke-direct {v2, v0, v3, v5}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    new-instance v0, La/dnq;

    .line 67
    .line 68
    invoke-direct {v0, v6, v2, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 69
    .line 70
    .line 71
    new-instance v2, La/r730;

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-direct {v2, p0, v3, v4}, La/r730;-><init>(La/s730;La/yje;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-instance v5, La/mw20;

    .line 90
    .line 91
    invoke-direct {v5, v0, p0, v2, v3}, La/mw20;-><init>(La/dnq;La/clz;La/r730;La/yje;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v3, v3, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final G0()La/z1r;
    .locals 2

    .line 1
    sget-object v0, La/s730;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/s730;->N1:La/s0r;

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
    check-cast p0, La/z1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->v:Z

    .line 12
    .line 13
    iget-object v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->B:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/high16 v1, -0x40800000    # -1.0f

    .line 19
    .line 20
    iput v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->x:F

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 27
    .line 28
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s730;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
