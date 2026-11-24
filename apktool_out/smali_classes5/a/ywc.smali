.class public final La/ywc;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ywc;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final W1:La/kl5;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/wdk0;

.field public final M1:La/zz2;

.field public final N1:La/phf0;

.field public final O1:La/zz2;

.field public final P1:La/cgx0;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public S1:La/gxc;

.field public U1:Ljava/lang/String;

.field public final V1:La/xp6;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ywc;

    .line 4
    .line 5
    const-string v2, "bundleBannerId"

    .line 6
    .line 7
    const-string v3, "getBundleBannerId()I"

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
    const-string v3, "bundleCategoryCode"

    .line 16
    .line 17
    const-string v5, "getBundleCategoryCode()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundlePosition"

    .line 25
    .line 26
    const-string v6, "getBundlePosition()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bundleShowNavBar"

    .line 34
    .line 35
    const-string v7, "getBundleShowNavBar()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "binding"

    .line 43
    .line 44
    const-string v8, "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentCmsNewsBinding;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/ywc;->X1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/kl5;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/ywc;->W1:La/kl5;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0219

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/zz2;

    .line 8
    .line 9
    const-string v1, "BANNER_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/ywc;->M1:La/zz2;

    .line 15
    .line 16
    new-instance v0, La/phf0;

    .line 17
    .line 18
    const-string v1, "CATEGORY_CODE"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/ywc;->N1:La/phf0;

    .line 24
    .line 25
    new-instance v0, La/zz2;

    .line 26
    .line 27
    const-string v1, "cms_news_main_pager_position"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/ywc;->O1:La/zz2;

    .line 33
    .line 34
    new-instance v0, La/cgx0;

    .line 35
    .line 36
    const-string v1, "SHOW_NAVBAR"

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/ywc;->P1:La/cgx0;

    .line 43
    .line 44
    new-instance v0, La/vwc;

    .line 45
    .line 46
    invoke-direct {v0, p0, v2}, La/vwc;-><init>(La/ywc;B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/svc;

    .line 50
    .line 51
    invoke-direct {v1, p0, v2}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    sget-object v2, La/wez;->b:La/wez;

    .line 55
    .line 56
    new-instance v3, La/svc;

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    invoke-direct {v3, v1, v4}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-class v2, La/qxc;

    .line 67
    .line 68
    sget-object v3, La/sre0;->a:La/tre0;

    .line 69
    .line 70
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, La/wpb;

    .line 75
    .line 76
    const/16 v5, 0xc

    .line 77
    .line 78
    invoke-direct {v3, v1, v5}, La/wpb;-><init>(La/a8z;B)V

    .line 79
    .line 80
    .line 81
    new-instance v5, La/wpb;

    .line 82
    .line 83
    const/16 v6, 0xd

    .line 84
    .line 85
    invoke-direct {v5, v1, v6}, La/wpb;-><init>(La/a8z;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v2, v3, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/ywc;->Q1:La/kiu0;

    .line 93
    .line 94
    sget-object v0, La/wwc;->a:La/wwc;

    .line 95
    .line 96
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/ywc;->R1:La/s0r;

    .line 101
    .line 102
    const-string v0, ""

    .line 103
    .line 104
    iput-object v0, p0, La/ywc;->U1:Ljava/lang/String;

    .line 105
    .line 106
    new-instance v0, La/xp6;

    .line 107
    .line 108
    invoke-direct {v0, p0, v4}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/ywc;->V1:La/xp6;

    .line 112
    .line 113
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, La/ckb;->N(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/ywc;->U1:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, La/dzq;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 16
    .line 17
    const v0, 0x7f130abd

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/vwc;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, v1}, La/vwc;-><init>(La/ywc;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/gxc;

    .line 37
    .line 38
    iget-object v0, p0, La/ywc;->U1:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, La/qem0;->r(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    new-instance v3, La/lya;

    .line 49
    .line 50
    const/16 v4, 0x16

    .line 51
    .line 52
    invoke-direct {v3, p0, v4}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, v0, v2, v3}, La/gxc;-><init>(Ljava/lang/String;ZLa/lya;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/ywc;->S1:La/gxc;

    .line 59
    .line 60
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v0, p1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 65
    .line 66
    iget-object v2, p0, La/ywc;->S1:La/gxc;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 73
    .line 74
    .line 75
    new-instance v2, La/hhk;

    .line 76
    .line 77
    iget-object p1, p1, La/dzq;->c:Lcom/google/android/material/tabs/TabLayout;

    .line 78
    .line 79
    new-instance v3, La/c99;

    .line 80
    .line 81
    const/16 v4, 0xe

    .line 82
    .line 83
    invoke-direct {v3, v4}, La/c99;-><init>(B)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, p1, v0, v3}, La/hhk;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;La/ybo0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, La/hhk;->a()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object v0, p1, La/dzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 97
    .line 98
    const/16 v2, 0x8

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, La/ywc;->V1:La/xp6;

    .line 109
    .line 110
    invoke-virtual {p1, p0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final C0()V
    .locals 11

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
    const-class v1, La/iu50;

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
    instance-of v3, v0, La/iu50;

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
    move-object v3, v2

    .line 52
    check-cast v3, La/iu50;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sget-object v0, La/mvc;->b:La/cl5;

    .line 61
    .line 62
    sget-object v1, La/ywc;->X1:[La/iiy;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    aget-object v1, v1, v2

    .line 66
    .line 67
    iget-object v2, p0, La/ywc;->N1:La/phf0;

    .line 68
    .line 69
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, La/cl5;->r(Ljava/lang/String;)La/mvc;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    const/4 v9, 0x0

    .line 81
    const/16 v10, 0x5e

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    invoke-static/range {v3 .. v10}, La/iu50;->a(La/iu50;La/i1w0;IIILa/mvc;ZI)La/yli;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, La/yli;->a()La/fiu0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, p0, La/ywc;->K1:La/fiu0;

    .line 95
    .line 96
    iget-object v0, v0, La/yli;->y:La/wdk0;

    .line 97
    .line 98
    iput-object v0, p0, La/ywc;->L1:La/wdk0;

    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 102
    .line 103
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/qxc;->h:La/ntu;

    .line 6
    .line 7
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/xwc;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v1, p0, v3, v2}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, La/vxb;

    .line 37
    .line 38
    invoke-direct {v5, v0, v2, v1, v3}, La/vxb;-><init>(La/p7m0;La/clz;La/xwc;La/yje;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v1, v1, La/qxc;->l:La/ol60;

    .line 50
    .line 51
    new-instance v2, La/xwc;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    invoke-direct {v2, p0, v3, v4}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    new-instance v6, La/vxb;

    .line 70
    .line 71
    invoke-direct {v6, v1, v4, v2, v3}, La/vxb;-><init>(La/gmq;La/clz;La/xwc;La/yje;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v5, v3, v3, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v1, v1, La/qxc;->m:La/p7m0;

    .line 82
    .line 83
    new-instance v2, La/i89;

    .line 84
    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-direct {v2, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 87
    .line 88
    .line 89
    new-instance v1, La/xwc;

    .line 90
    .line 91
    const/4 v4, 0x2

    .line 92
    invoke-direct {v1, p0, v3, v4}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    new-instance v5, La/vxb;

    .line 108
    .line 109
    invoke-direct {v5, v2, p0, v1, v3}, La/vxb;-><init>(La/i89;La/clz;La/xwc;La/yje;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final G0()La/dzq;
    .locals 2

    .line 1
    sget-object v0, La/ywc;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ywc;->R1:La/s0r;

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
    check-cast p0, La/dzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/qxc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ywc;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qxc;

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
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 19
    .line 20
    iget-object p0, p0, La/ywc;->V1:La/xp6;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/ywc;->G0()La/dzq;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lkotlin/Pair;

    .line 19
    .line 20
    const-string v3, "cms_news_main_pager_position"

    .line 21
    .line 22
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/ywc;->X1:[La/iiy;

    .line 26
    .line 27
    aget-object v0, v1, v0

    .line 28
    .line 29
    iget-object v1, p0, La/ywc;->N1:La/phf0;

    .line 30
    .line 31
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lkotlin/Pair;

    .line 36
    .line 37
    const-string v3, "CATEGORY_CODE"

    .line 38
    .line 39
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    filled-new-array {v2, v1}, [Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object v0, p0, La/qxc;->o:La/bby;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object p0, p0, La/qxc;->n:La/c4m0;

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/qxc;->n:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/qxc;->d:La/m1e;

    .line 21
    .line 22
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, La/mxc;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, p0, v3, v1}, La/mxc;-><init>(La/qxc;La/yje;B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/fnq;

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    invoke-direct {v1, v0, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 36
    .line 37
    .line 38
    sget-object v0, La/pxc;->h:La/pxc;

    .line 39
    .line 40
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, p0, La/qxc;->e:La/mne;

    .line 45
    .line 46
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 47
    .line 48
    invoke-static {v2, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v2, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/qxc;->n:La/c4m0;

    .line 57
    .line 58
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/ywc;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ywc;->P1:La/cgx0;

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
