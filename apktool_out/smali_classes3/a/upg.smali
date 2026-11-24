.class public final La/upg;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/upg;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final X1:La/kwd;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public K1:La/nei;

.field public L1:La/g2v;

.field public M1:La/wdk0;

.field public final N1:La/cgx0;

.field public final O1:La/usd;

.field public final P1:La/qud;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public final S1:La/khf0;

.field public U1:La/h5m;

.field public final V1:La/a8z;

.field public final W1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/upg;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/cyberstatistic/impl/databinding/CybergameStatisticFragmentBinding;"

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
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;"

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
    sput-object v1, La/upg;->Y1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kwd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/upg;->X1:La/kwd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d00e0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/cgx0;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(BZ)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/upg;->N1:La/cgx0;

    .line 15
    .line 16
    new-instance v0, La/usd;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/upg;->O1:La/usd;

    .line 22
    .line 23
    new-instance v0, La/qud;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/upg;->P1:La/qud;

    .line 29
    .line 30
    new-instance v0, La/mpg;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, v1}, La/mpg;-><init>(La/upg;B)V

    .line 34
    .line 35
    .line 36
    new-instance v2, La/q7g;

    .line 37
    .line 38
    const/16 v3, 0xe

    .line 39
    .line 40
    invoke-direct {v2, p0, v3}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    sget-object v4, La/wez;->b:La/wez;

    .line 44
    .line 45
    new-instance v5, La/q7g;

    .line 46
    .line 47
    const/16 v6, 0xf

    .line 48
    .line 49
    invoke-direct {v5, v2, v6}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-class v5, La/vqg;

    .line 57
    .line 58
    sget-object v7, La/sre0;->a:La/tre0;

    .line 59
    .line 60
    invoke-virtual {v7, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    new-instance v7, La/r7g;

    .line 65
    .line 66
    invoke-direct {v7, v2, v3}, La/r7g;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    new-instance v3, La/r7g;

    .line 70
    .line 71
    invoke-direct {v3, v2, v6}, La/r7g;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v5, v7, v3, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, La/upg;->Q1:La/kiu0;

    .line 79
    .line 80
    sget-object v0, La/npg;->a:La/npg;

    .line 81
    .line 82
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, La/upg;->R1:La/s0r;

    .line 87
    .line 88
    new-instance v0, La/khf0;

    .line 89
    .line 90
    const-string v2, "KEY_SCREEN_PARAMS"

    .line 91
    .line 92
    invoke-direct {v0, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, La/upg;->S1:La/khf0;

    .line 96
    .line 97
    new-instance v0, La/mpg;

    .line 98
    .line 99
    const/4 v2, 0x2

    .line 100
    invoke-direct {v0, p0, v2}, La/mpg;-><init>(La/upg;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, La/upg;->V1:La/a8z;

    .line 108
    .line 109
    iput-boolean v1, p0, La/upg;->W1:Z

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/h5m;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, v0}, La/h5m;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/upg;->U1:La/h5m;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, La/psc;

    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/psc;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    invoke-static {p1, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, La/upg;->O1:La/usd;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, La/usd;->d(Landroidx/fragment/app/Fragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/upg;->G0()La/rth;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/rth;->e:Lorg/xplatform/uikit/components/toolbar/statical/DsNavigationBarStatic;

    .line 38
    .line 39
    new-instance v1, La/mpg;

    .line 40
    .line 41
    invoke-direct {v1, p0, v0}, La/mpg;-><init>(La/upg;B)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p1, Lorg/xplatform/uikit/components/toolbar/statical/DsNavigationBarStatic;->b:La/s96;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-interface {p1, v1}, La/s96;->c(Lkotlin/jvm/functions/Function0;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0}, La/upg;->G0()La/rth;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 56
    .line 57
    iget-object v0, p0, La/upg;->V1:La/a8z;

    .line 58
    .line 59
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/jpg;

    .line 64
    .line 65
    iget-object p0, p0, La/upg;->N1:La/cgx0;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/cgx0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    new-instance v1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 76
    .line 77
    invoke-direct {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/cgx0;->d:Ljava/lang/Object;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 84
    .line 85
    .line 86
    new-instance v1, La/aqg;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-direct {v1, v2}, La/aqg;-><init>(Landroid/content/res/Resources;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 99
    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-static {p1, v1, v1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/cgx0;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 113
    .line 114
    .line 115
    new-instance p0, La/hfg;

    .line 116
    .line 117
    const/16 v1, 0x8

    .line 118
    .line 119
    invoke-direct {p0, v0, v1}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->setShouldInterceptTouch(Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final C0()V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wpg;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, La/upg;->Y1:[La/iiy;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    iget-object v4, v0, La/upg;->S1:La/khf0;

    .line 11
    .line 12
    invoke-virtual {v4, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 17
    .line 18
    iget-object v3, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v5, v5, La/cb50;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aget-object v1, v1, v2

    .line 37
    .line 38
    invoke-virtual {v4, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object/from16 v17, v1

    .line 43
    .line 44
    check-cast v17, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 v2, 0x0

    .line 79
    :goto_0
    sget-object v4, La/wpg;->a:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, La/oei;

    .line 86
    .line 87
    if-nez v5, :cond_5

    .line 88
    .line 89
    instance-of v5, v1, La/af3;

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    if-eqz v5, :cond_1

    .line 93
    .line 94
    check-cast v1, La/af3;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v1, v6

    .line 98
    :goto_1
    const-class v5, La/vpg;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/o5d0;

    .line 111
    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, La/ze3;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move-object v1, v6

    .line 122
    :goto_2
    instance-of v7, v1, La/vpg;

    .line 123
    .line 124
    if-nez v7, :cond_3

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    move-object v6, v1

    .line 128
    :goto_3
    check-cast v6, La/vpg;

    .line 129
    .line 130
    if-eqz v6, :cond_4

    .line 131
    .line 132
    iget-object v1, v6, La/vpg;->a:La/duj;

    .line 133
    .line 134
    iget-object v5, v6, La/vpg;->b:La/g2v;

    .line 135
    .line 136
    iget-object v7, v6, La/vpg;->c:La/cad;

    .line 137
    .line 138
    iget-object v8, v6, La/vpg;->d:La/m1e;

    .line 139
    .line 140
    iget-object v9, v6, La/vpg;->e:La/gii0;

    .line 141
    .line 142
    iget-object v10, v6, La/vpg;->f:La/oeg0;

    .line 143
    .line 144
    move-object/from16 v20, v9

    .line 145
    .line 146
    iget-object v9, v6, La/vpg;->g:La/pyg;

    .line 147
    .line 148
    move-object/from16 v19, v8

    .line 149
    .line 150
    iget-object v8, v6, La/vpg;->h:La/clc;

    .line 151
    .line 152
    iget-object v11, v6, La/vpg;->i:La/ctf0;

    .line 153
    .line 154
    move-object/from16 v21, v10

    .line 155
    .line 156
    iget-object v10, v6, La/vpg;->j:La/roi0;

    .line 157
    .line 158
    iget-object v12, v6, La/vpg;->k:La/knf0;

    .line 159
    .line 160
    iget-object v13, v6, La/vpg;->l:La/pru;

    .line 161
    .line 162
    move-object/from16 v23, v11

    .line 163
    .line 164
    iget-object v11, v6, La/vpg;->m:La/xri;

    .line 165
    .line 166
    move-object v14, v12

    .line 167
    iget-object v12, v6, La/vpg;->n:La/iip;

    .line 168
    .line 169
    iget-object v15, v6, La/vpg;->o:La/r9u;

    .line 170
    .line 171
    move-object/from16 v16, v1

    .line 172
    .line 173
    iget-object v1, v6, La/vpg;->p:La/wdk0;

    .line 174
    .line 175
    move-object/from16 v25, v13

    .line 176
    .line 177
    iget-object v13, v6, La/vpg;->q:La/ugf0;

    .line 178
    .line 179
    move-object/from16 v27, v1

    .line 180
    .line 181
    iget-object v1, v6, La/vpg;->r:La/dwu;

    .line 182
    .line 183
    move-object/from16 v28, v1

    .line 184
    .line 185
    iget-object v1, v6, La/vpg;->s:La/kt2;

    .line 186
    .line 187
    move-object/from16 v29, v1

    .line 188
    .line 189
    iget-object v1, v6, La/vpg;->t:La/zr1;

    .line 190
    .line 191
    move-object/from16 v30, v1

    .line 192
    .line 193
    iget-object v1, v6, La/vpg;->u:La/lbu;

    .line 194
    .line 195
    move-object/from16 v18, v14

    .line 196
    .line 197
    iget-object v14, v6, La/vpg;->v:La/bwl;

    .line 198
    .line 199
    move-object/from16 v26, v15

    .line 200
    .line 201
    iget-object v15, v6, La/vpg;->w:La/a1d;

    .line 202
    .line 203
    iget-object v6, v6, La/vpg;->x:La/qgh;

    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object/from16 v32, v6

    .line 239
    .line 240
    new-instance v6, La/oei;

    .line 241
    .line 242
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v24

    .line 246
    move-object/from16 v31, v1

    .line 247
    .line 248
    move-object/from16 v22, v3

    .line 249
    .line 250
    move-object/from16 v18, v5

    .line 251
    .line 252
    invoke-direct/range {v6 .. v32}, La/oei;-><init>(La/cad;La/clc;La/pyg;La/roi0;La/xri;La/iip;La/ugf0;La/bwl;La/a1d;La/duj;Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/g2v;La/m1e;La/gii0;La/oeg0;Ljava/lang/String;La/ctf0;Ljava/lang/Integer;La/pru;La/r9u;La/wdk0;La/dwu;La/kt2;La/zr1;La/lbu;La/qgh;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v1, v22

    .line 256
    .line 257
    invoke-interface {v4, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-object v5, v6

    .line 261
    goto :goto_4

    .line 262
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 263
    .line 264
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_5
    :goto_4
    iget-object v1, v5, La/oei;->A:La/n5d0;

    .line 273
    .line 274
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, La/nei;

    .line 279
    .line 280
    iput-object v1, v0, La/upg;->K1:La/nei;

    .line 281
    .line 282
    iget-object v1, v5, La/oei;->l:La/g2v;

    .line 283
    .line 284
    iput-object v1, v0, La/upg;->L1:La/g2v;

    .line 285
    .line 286
    iget-object v1, v5, La/oei;->z:La/wdk0;

    .line 287
    .line 288
    iput-object v1, v0, La/upg;->M1:La/wdk0;

    .line 289
    .line 290
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/upg;->H0()La/vqg;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vqg;->I:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/tpg;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/g8g;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/g8g;-><init>(La/gmq;La/clz;La/tpg;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/upg;->H0()La/vqg;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/vqg;->J:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/tpg;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/g8g;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(La/gmq;La/clz;La/tpg;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/upg;->H0()La/vqg;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v4, v1, La/vqg;->D:La/ol60;

    .line 75
    .line 76
    new-instance v6, La/tpg;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v6, p0, v7, v1}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v3, La/g8g;

    .line 95
    .line 96
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(La/gmq;La/clz;La/tpg;La/yje;C)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final G0()La/rth;
    .locals 2

    .line 1
    sget-object v0, La/upg;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/upg;->R1:La/s0r;

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
    check-cast p0, La/rth;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vqg;
    .locals 0

    .line 1
    iget-object p0, p0, La/upg;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vqg;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/upg;->G0()La/rth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 9
    .line 10
    iget-object p0, p0, La/upg;->N1:La/cgx0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, La/cgx0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/upg;->W1:Z

    .line 2
    .line 3
    return p0
.end method
