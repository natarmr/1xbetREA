.class public final La/noq0;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/qjk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/noq0;",
        "La/nw5;",
        "La/qjk;",
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
.field public static final m2:La/y2m0;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final e2:La/nae0;

.field public final f2:La/zz2;

.field public final g2:La/cgx0;

.field public final h2:La/zz2;

.field public final i2:La/phf0;

.field public j2:La/fiu0;

.field public final k2:La/n0o0;

.field public final l2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/noq0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/onboarding/impl/databinding/DialogTipsBinding;"

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
    const-string v3, "currentPage"

    .line 16
    .line 17
    const-string v5, "getCurrentPage()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "fromOnboardScreen"

    .line 25
    .line 26
    const-string v6, "getFromOnboardScreen()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "onboardSectionId"

    .line 34
    .line 35
    const-string v7, "getOnboardSectionId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "openedScreenName"

    .line 43
    .line 44
    const-string v8, "getOpenedScreenName()Ljava/lang/String;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/noq0;->n2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/y2m0;

    .line 69
    .line 70
    const/16 v1, 0x15

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    sput-object v0, La/noq0;->m2:La/y2m0;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/loq0;->a:La/loq0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/noq0;->e2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/zz2;

    .line 13
    .line 14
    const-string v1, "CURRENT_PAGE"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/noq0;->f2:La/zz2;

    .line 21
    .line 22
    new-instance v0, La/cgx0;

    .line 23
    .line 24
    const-string v1, "BUNDLE_FROM_ONBOARD_SECTION"

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/noq0;->g2:La/cgx0;

    .line 30
    .line 31
    new-instance v0, La/zz2;

    .line 32
    .line 33
    const-string v1, "BUNDLE_ONBOARD_SECTION_ID"

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    invoke-direct {v0, v1, v3}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/noq0;->h2:La/zz2;

    .line 40
    .line 41
    new-instance v0, La/phf0;

    .line 42
    .line 43
    const-string v1, "BUNDLE_OPENED_SCREEN_NAME"

    .line 44
    .line 45
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/noq0;->i2:La/phf0;

    .line 49
    .line 50
    new-instance v0, La/joq0;

    .line 51
    .line 52
    invoke-direct {v0, v2}, La/joq0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/noq0;->k2:La/n0o0;

    .line 60
    .line 61
    new-instance v0, La/h3q0;

    .line 62
    .line 63
    const/16 v1, 0x10

    .line 64
    .line 65
    invoke-direct {v0, p0, v1}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    new-instance v1, La/mfo0;

    .line 69
    .line 70
    const/16 v3, 0x1d

    .line 71
    .line 72
    invoke-direct {v1, p0, v3}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    sget-object v3, La/wez;->b:La/wez;

    .line 76
    .line 77
    new-instance v4, La/moq0;

    .line 78
    .line 79
    invoke-direct {v4, v1, v2}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-class v2, La/xoq0;

    .line 87
    .line 88
    sget-object v3, La/sre0;->a:La/tre0;

    .line 89
    .line 90
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v3, La/r5p0;

    .line 95
    .line 96
    const/16 v4, 0x16

    .line 97
    .line 98
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 99
    .line 100
    .line 101
    new-instance v4, La/r5p0;

    .line 102
    .line 103
    const/16 v5, 0x17

    .line 104
    .line 105
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, La/noq0;->l2:La/kiu0;

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/noq0;->U0()La/qjk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final P0()V
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
    const-class v1, La/qoq0;

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
    instance-of v3, v0, La/qoq0;

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
    check-cast v2, La/qoq0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/noq0;->n2:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/noq0;->g2:La/cgx0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0}, La/noq0;->X0()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v1, v3, v0}, La/qoq0;->a(ILa/i1w0;Z)La/lxi;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, La/fiu0;

    .line 83
    .line 84
    const-class v2, La/xoq0;

    .line 85
    .line 86
    iget-object v0, v0, La/lxi;->t:La/psi;

    .line 87
    .line 88
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, p0, La/noq0;->j2:La/fiu0;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 99
    .line 100
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/ioq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/noq0;->k2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ioq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final U0()La/qjk;
    .locals 2

    .line 1
    sget-object v0, La/noq0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/noq0;->e2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/qjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final V0()I
    .locals 2

    .line 1
    sget-object v0, La/noq0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/noq0;->f2:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final W0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La/noq0;->V0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, La/noq0;->T0()La/ioq0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x1

    .line 18
    sub-int/2addr p0, v1

    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final X0()I
    .locals 2

    .line 1
    sget-object v0, La/noq0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/noq0;->h2:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final Y0()La/xoq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/noq0;->l2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xoq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/16 p2, 0x8

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, La/noq0;->U0()La/qjk;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p1, La/qjk;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 33
    .line 34
    invoke-virtual {p0}, La/noq0;->T0()La/ioq0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p2, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->setOverScrollMode(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, La/noq0;->V0()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p2, v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 57
    .line 58
    .line 59
    new-instance v1, La/xp6;

    .line 60
    .line 61
    const/16 v2, 0xd

    .line 62
    .line 63
    invoke-direct {v1, p0, v2}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/hhk;

    .line 70
    .line 71
    iget-object p1, p1, La/qjk;->f:Lcom/google/android/material/tabs/TabLayout;

    .line 72
    .line 73
    new-instance v2, La/v4i0;

    .line 74
    .line 75
    const/16 v3, 0xf

    .line 76
    .line 77
    invoke-direct {v2, v3}, La/v4i0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, p1, p2, v2}, La/hhk;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;La/ybo0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, La/hhk;->a()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, La/noq0;->U0()La/qjk;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p2, p1, La/qjk;->d:Lcom/google/android/material/button/MaterialButton;

    .line 91
    .line 92
    new-instance v1, La/koq0;

    .line 93
    .line 94
    invoke-direct {v1, p0, v0}, La/koq0;-><init>(La/noq0;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p2, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 98
    .line 99
    .line 100
    iget-object p2, p1, La/qjk;->c:Lcom/google/android/material/button/MaterialButton;

    .line 101
    .line 102
    new-instance v0, La/b8q0;

    .line 103
    .line 104
    const/16 v1, 0x9

    .line 105
    .line 106
    invoke-direct {v0, p1, p0, v1}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p2, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 110
    .line 111
    .line 112
    iget-object p1, p1, La/qjk;->b:Lcom/google/android/material/button/MaterialButton;

    .line 113
    .line 114
    new-instance p2, La/koq0;

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-direct {p2, p0, v0}, La/koq0;-><init>(La/noq0;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, p2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, La/noq0;->Y0()La/xoq0;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iget-object p1, p1, La/xoq0;->i0:La/p7m0;

    .line 128
    .line 129
    new-instance p2, La/ssl0;

    .line 130
    .line 131
    const/16 v0, 0x1b

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    invoke-direct {p2, p0, v1, v0}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 135
    .line 136
    .line 137
    sget-object v0, La/lkz;->a:La/lkz;

    .line 138
    .line 139
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-instance v2, La/hlq0;

    .line 152
    .line 153
    invoke-direct {v2, p1, p0, p2, v1}, La/hlq0;-><init>(La/gmq;La/clz;La/ssl0;La/yje;)V

    .line 154
    .line 155
    .line 156
    const/4 p0, 0x3

    .line 157
    invoke-static {v0, v1, v1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/noq0;->Y0()La/xoq0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p1, p0, La/xoq0;->K:La/ocl;

    .line 9
    .line 10
    invoke-virtual {p1}, La/ocl;->m()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/xoq0;->y()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, La/xoq0;->L:La/lsn;

    .line 21
    .line 22
    invoke-virtual {p1}, La/lsn;->f()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/xoq0;->x()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method
