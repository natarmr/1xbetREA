.class public final La/ufo0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ufo0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final Q1:La/s2m0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/kiu0;

.field public final O1:La/yzn0;

.field public P1:La/mii0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ufo0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedMenuBinding;"

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
    const-string v3, "menuSectionStart"

    .line 16
    .line 17
    const-string v5, "getMenuSectionStart()Lorg/xplatform/main_menu/api/domain/models/MenuSectionType;"

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
    sput-object v1, La/ufo0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s2m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ufo0;->Q1:La/s2m0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02ea

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/ufo0;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/rfo0;->a:La/rfo0;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/ufo0;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/qfo0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/qfo0;-><init>(La/ufo0;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, La/ufo0;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v1, La/qfo0;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, La/qfo0;-><init>(La/ufo0;B)V

    .line 35
    .line 36
    .line 37
    new-instance v3, La/mfo0;

    .line 38
    .line 39
    invoke-direct {v3, v1, v0}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v0, La/mfo0;

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-direct {v0, p0, v1}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance v1, La/mfo0;

    .line 49
    .line 50
    const/4 v4, 0x3

    .line 51
    invoke-direct {v1, v0, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-class v1, La/fho0;

    .line 59
    .line 60
    sget-object v2, La/sre0;->a:La/tre0;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, La/cdl0;

    .line 67
    .line 68
    const/16 v4, 0x1a

    .line 69
    .line 70
    invoke-direct {v2, v0, v4}, La/cdl0;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    new-instance v4, La/cdl0;

    .line 74
    .line 75
    const/16 v5, 0x1b

    .line 76
    .line 77
    invoke-direct {v4, v0, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1, v2, v4, v3}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/ufo0;->N1:La/kiu0;

    .line 85
    .line 86
    new-instance v0, La/yzn0;

    .line 87
    .line 88
    const-string v1, "MENU_SECTION_TAB_KEY"

    .line 89
    .line 90
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, La/ufo0;->O1:La/yzn0;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/ttn0;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-static {p1, p0, v1, v0}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/ufo0;->G0()La/o5r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/ufo0;->G0()La/o5r;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(La/oju0;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/ufo0;->H0()La/fho0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/fho0;->C0:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/sfo0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/sfo0;-><init>(La/ufo0;La/yje;B)V

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
    new-instance v4, La/agn0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/agn0;-><init>(La/gmq;La/clz;La/sfo0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ufo0;->H0()La/fho0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/fho0;->D0:La/ol60;

    .line 42
    .line 43
    new-instance v6, La/sfo0;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/sfo0;-><init>(La/ufo0;La/yje;B)V

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
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/agn0;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/agn0;-><init>(La/gmq;La/clz;La/sfo0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0()La/o5r;
    .locals 2

    .line 1
    sget-object v0, La/ufo0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ufo0;->L1:La/s0r;

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
    check-cast p0, La/o5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/fho0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ufo0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fho0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/b0l0;

    .line 9
    .line 10
    const/16 v1, 0xe

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "UPDATED_BALANCE_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ufo0;->P1:La/mii0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, La/mii0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/xp6;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, La/ufo0;->G0()La/o5r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 24
    .line 25
    .line 26
    invoke-super {p0}, La/yx5;->Z()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ufo0;->H0()La/fho0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/fho0;->B()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g0()V
    .locals 11

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mii0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/ufo0;->G0()La/o5r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 11
    .line 12
    invoke-virtual {p0}, La/ufo0;->G0()La/o5r;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 17
    .line 18
    new-instance v3, La/tfo0;

    .line 19
    .line 20
    invoke-virtual {p0}, La/ufo0;->H0()La/fho0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    const-class v6, La/fho0;

    .line 28
    .line 29
    const-string v7, "onSelectedTabPosition"

    .line 30
    .line 31
    const-string v8, "onSelectedTabPosition(I)V"

    .line 32
    .line 33
    invoke-direct/range {v3 .. v10}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2, v3}, La/mii0;-><init>(Lorg/xplatform/uikit/components/tabs/DsTabs;Landroidx/viewpager2/widget/ViewPager2;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, La/hfg;

    .line 40
    .line 41
    const/16 v4, 0x1d

    .line 42
    .line 43
    invoke-direct {v3, v0, v4}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v1, Lorg/xplatform/uikit/components/tabs/DsTabs;->v:Lkotlin/jvm/functions/Function1;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/ufo0;->P1:La/mii0;

    .line 56
    .line 57
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ufo0;->P1:La/mii0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, La/mii0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/xp6;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, La/ufo0;->P1:La/mii0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 21
    .line 22
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ufo0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
