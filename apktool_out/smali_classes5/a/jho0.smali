.class public final La/jho0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jho0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final R1:La/y2m0;

.field public static final synthetic S1:[La/iiy;

.field public static final U1:Ljava/lang/String;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/kiu0;

.field public final O1:La/yzn0;

.field public P1:La/mii0;

.field public Q1:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jho0;

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
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/jho0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/y2m0;

    .line 33
    .line 34
    const/16 v2, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/y2m0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/jho0;->R1:La/y2m0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/jho0;->U1:Ljava/lang/String;

    .line 46
    .line 47
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
    iput-boolean v0, p0, La/jho0;->K1:Z

    .line 9
    .line 10
    sget-object v0, La/hho0;->a:La/hho0;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/jho0;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v0, La/gho0;

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    invoke-direct {v0, p0, v1}, La/gho0;-><init>(La/jho0;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/jho0;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v0, La/gho0;

    .line 33
    .line 34
    const/4 v3, 0x6

    .line 35
    invoke-direct {v0, p0, v3}, La/gho0;-><init>(La/jho0;B)V

    .line 36
    .line 37
    .line 38
    new-instance v4, La/mfo0;

    .line 39
    .line 40
    const/4 v5, 0x4

    .line 41
    invoke-direct {v4, v0, v5}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/mfo0;

    .line 45
    .line 46
    invoke-direct {v0, p0, v1}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/mfo0;

    .line 50
    .line 51
    invoke-direct {v1, v0, v3}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-class v1, La/rio0;

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
    const/16 v3, 0x1c

    .line 69
    .line 70
    invoke-direct {v2, v0, v3}, La/cdl0;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    new-instance v3, La/cdl0;

    .line 74
    .line 75
    const/16 v5, 0x1d

    .line 76
    .line 77
    invoke-direct {v3, v0, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1, v2, v3, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/jho0;->N1:La/kiu0;

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
    iput-object v0, p0, La/jho0;->O1:La/yzn0;

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
    const/16 v1, 0x9

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
    invoke-virtual {p0}, La/jho0;->G0()La/o5r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/jho0;->G0()La/o5r;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(La/oju0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/jho0;->G0()La/o5r;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p1, p1, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 42
    .line 43
    iput-object p1, p0, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 44
    .line 45
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/jho0;->H0()La/rio0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/rio0;->L0:La/p7m0;

    .line 6
    .line 7
    sget-object v1, La/lkz;->a:La/lkz;

    .line 8
    .line 9
    new-instance v1, La/iho0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    invoke-direct {v1, p0, v7, v2}, La/iho0;-><init>(La/jho0;La/yje;B)V

    .line 14
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
    invoke-direct {v4, v0, v2, v1, v7}, La/agn0;-><init>(La/gmq;La/clz;La/iho0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/jho0;->H0()La/rio0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/rio0;->M0:La/ol60;

    .line 42
    .line 43
    new-instance v6, La/iho0;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/iho0;-><init>(La/jho0;La/yje;B)V

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
    invoke-direct/range {v3 .. v8}, La/agn0;-><init>(La/gmq;La/clz;La/iho0;La/yje;B)V

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
    sget-object v0, La/jho0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jho0;->L1:La/s0r;

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

.method public final H0()La/rio0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jho0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rio0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/b0l0;

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    invoke-direct {v1, p2, v2}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/gho0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, La/gho0;-><init>(La/jho0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "UPDATED_BALANCE_KEY"

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, La/jho0;->I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/gho0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, v0}, La/gho0;-><init>(La/jho0;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "REG_CLICK_REQUEST_KEY"

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, La/jho0;->I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, La/gho0;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-direct {p1, p0, v0}, La/gho0;-><init>(La/jho0;B)V

    .line 30
    .line 31
    .line 32
    const-string v0, "LOGIN_CLICK_REQUEST_KEY"

    .line 33
    .line 34
    invoke-virtual {p0, v0, p1}, La/jho0;->I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/gho0;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-direct {p1, p0, v0}, La/gho0;-><init>(La/jho0;B)V

    .line 41
    .line 42
    .line 43
    const-string v0, "PAYMENT_CLICK_REQUEST_KEY"

    .line 44
    .line 45
    invoke-virtual {p0, v0, p1}, La/jho0;->I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, La/gho0;

    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-direct {p1, p0, v0}, La/gho0;-><init>(La/jho0;B)V

    .line 52
    .line 53
    .line 54
    const-string v0, "CHANGE_BALANCE_CLICK_REQUEST_KEY"

    .line 55
    .line 56
    invoke-virtual {p0, v0, p1}, La/jho0;->I0(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/jho0;->H0()La/rio0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/rio0;->Q0:La/bby;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/jho0;->H0()La/rio0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/rio0;->z()La/r040;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, La/r040;->i:La/r040;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    move v0, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, La/rio0;->z()La/r040;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v4, La/r040;->k:La/r040;

    .line 26
    .line 27
    if-ne v1, v4, :cond_1

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v2

    .line 32
    :goto_1
    invoke-virtual {p0}, La/rio0;->z()La/r040;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget-object v5, La/r040;->g:La/r040;

    .line 37
    .line 38
    if-ne v4, v5, :cond_2

    .line 39
    .line 40
    move v2, v3

    .line 41
    :cond_2
    iget-object v3, p0, La/rio0;->S0:La/bby;

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    :cond_3
    invoke-virtual {p0}, La/rio0;->B()V

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object p0, p0, La/rio0;->s0:La/bbw0;

    .line 55
    .line 56
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/rrd;

    .line 59
    .line 60
    iget-object p0, p0, La/rrd;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, La/vwb0;

    .line 63
    .line 64
    const-string v0, "TEMPORARY_BALANCE_ID"

    .line 65
    .line 66
    const-wide/16 v1, 0x0

    .line 67
    .line 68
    invoke-virtual {p0, v0, v1, v2}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
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
    invoke-virtual {p0}, La/jho0;->G0()La/o5r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 11
    .line 12
    iget-object v2, p0, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v3, La/tfo0;

    .line 18
    .line 19
    invoke-virtual {p0}, La/jho0;->H0()La/rio0;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x6

    .line 25
    const/4 v4, 0x1

    .line 26
    const-class v6, La/rio0;

    .line 27
    .line 28
    const-string v7, "onSelectedTabPosition"

    .line 29
    .line 30
    const-string v8, "onSelectedTabPosition(I)V"

    .line 31
    .line 32
    invoke-direct/range {v3 .. v10}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3}, La/mii0;-><init>(Lorg/xplatform/uikit/components/tabs/DsTabs;Landroidx/viewpager2/widget/ViewPager2;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, La/hfg;

    .line 39
    .line 40
    const/16 v4, 0x1d

    .line 41
    .line 42
    invoke-direct {v3, v0, v4}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iput-object v3, v1, Lorg/xplatform/uikit/components/tabs/DsTabs;->v:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, La/jho0;->P1:La/mii0;

    .line 55
    .line 56
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/jho0;->P1:La/mii0;

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
    iput-object v0, p0, La/jho0;->P1:La/mii0;

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
    iget-boolean p0, p0, La/jho0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
