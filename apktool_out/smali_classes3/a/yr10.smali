.class public final La/yr10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/yr10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
        "La/ru9;",
        "state",
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
.field public static final R1:La/wsz;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/yq9;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/cgx0;

.field public final P1:La/r34;

.field public final Q1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/yr10;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentCallbackBinding;"

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
    const-string v3, "showNavBarArg"

    .line 16
    .line 17
    const-string v5, "getShowNavBarArg()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "animatedItemId"

    .line 25
    .line 26
    const-string v6, "getAnimatedItemId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "initialPage"

    .line 34
    .line 35
    const-string v7, "getInitialPage()I"

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
    sput-object v1, La/yr10;->S1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/wsz;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/yr10;->R1:La/wsz;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d020f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/vr10;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/vr10;-><init>(La/yr10;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/be00;

    .line 14
    .line 15
    const/16 v2, 0x18

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/be00;

    .line 23
    .line 24
    const/16 v4, 0x19

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, La/ds10;

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
    new-instance v3, La/j210;

    .line 42
    .line 43
    const/16 v4, 0x10

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/j210;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/j210;

    .line 49
    .line 50
    const/16 v5, 0x11

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/yr10;->M1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/wr10;->a:La/wr10;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/yr10;->N1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/cgx0;

    .line 70
    .line 71
    const-string v1, "SHOW_NAV_BAR"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/yr10;->O1:La/cgx0;

    .line 77
    .line 78
    new-instance v0, La/r34;

    .line 79
    .line 80
    const-string v1, "CALLBACK_ANIMATED_ITEM_ID_KEY"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/yr10;->P1:La/r34;

    .line 86
    .line 87
    new-instance v0, La/zz2;

    .line 88
    .line 89
    const-string v1, "INITIAL_PAGE"

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/yr10;->Q1:La/zz2;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/yr10;->G0()La/vyq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/vyq;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/vr10;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/vr10;-><init>(La/yr10;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/yr10;->G0()La/vyq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/vyq;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    new-instance v2, La/pu9;

    .line 23
    .line 24
    sget-object v0, La/yr10;->S1:[La/iiy;

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    aget-object v3, v0, v8

    .line 28
    .line 29
    iget-object v4, p0, La/yr10;->O1:La/cgx0;

    .line 30
    .line 31
    invoke-virtual {v4, p0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/4 v3, 0x2

    .line 40
    aget-object v3, v0, v3

    .line 41
    .line 42
    iget-object v5, p0, La/yr10;->P1:La/r34;

    .line 43
    .line 44
    invoke-virtual {v5, p0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    iget-object v3, p0, La/yr10;->L1:La/yq9;

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    iget-boolean v7, v3, La/yq9;->a:Z

    .line 58
    .line 59
    move-object v3, p0

    .line 60
    invoke-direct/range {v2 .. v7}, La/pu9;-><init>(La/yr10;ZJZ)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, La/yr10;->G0()La/vyq;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget-object p0, p0, La/vyq;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 71
    .line 72
    invoke-virtual {p0, v8}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, La/yr10;->G0()La/vyq;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p0, p0, La/vyq;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 80
    .line 81
    new-instance p1, La/xp6;

    .line 82
    .line 83
    const/16 v2, 0x8

    .line 84
    .line 85
    invoke-direct {p1, v3, v2}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, La/yr10;->G0()La/vyq;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iget-object p0, p0, La/vyq;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 96
    .line 97
    invoke-virtual {v3}, La/yr10;->G0()La/vyq;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p1, p1, La/vyq;->d:Landroidx/compose/ui/platform/ComposeView;

    .line 102
    .line 103
    new-instance v4, La/k110;

    .line 104
    .line 105
    invoke-direct {v4, v3, p0, v2}, La/k110;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    new-instance p0, La/ugd;

    .line 109
    .line 110
    const v2, -0x7097046    # -4.000688E34f

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, v2, v8, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v9, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, La/yr10;->G0()La/vyq;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    iget-object p0, p0, La/vyq;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 124
    .line 125
    const/4 p1, 0x3

    .line 126
    aget-object p1, v0, p1

    .line 127
    .line 128
    iget-object v0, v3, La/yr10;->Q1:La/zz2;

    .line 129
    .line 130
    invoke-virtual {v0, v3, p1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {p0, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_0
    const-string p0, "callbackHistoryNewUiEnabled"

    .line 143
    .line 144
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v9
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/rp9;

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
    instance-of v3, v0, La/rp9;

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
    check-cast v2, La/rp9;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/rp9;->a(La/i1w0;)La/zai;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, La/fiu0;

    .line 64
    .line 65
    const-class v2, La/ds10;

    .line 66
    .line 67
    iget-object v3, v0, La/zai;->h:La/f7i;

    .line 68
    .line 69
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, La/yr10;->K1:La/fiu0;

    .line 77
    .line 78
    iget-object v0, v0, La/zai;->g:La/j1q0;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v1, La/yq9;

    .line 84
    .line 85
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v2, La/ygp;->n:La/ygp;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-direct {v1, v0}, La/yq9;-><init>(Z)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p0, La/yr10;->L1:La/yq9;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 103
    .line 104
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final G0()La/vyq;
    .locals 2

    .line 1
    sget-object v0, La/yr10;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/yr10;->N1:La/s0r;

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
    check-cast p0, La/vyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/yr10;->G0()La/vyq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/vyq;->b:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->setLoading(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/yr10;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/yr10;->O1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
