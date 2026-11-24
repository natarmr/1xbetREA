.class public final La/xu;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "La/xu;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gfk0",
        "",
        "inputTextValue",
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
.field public static final Q1:La/gfk0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/kiu0;

.field public final P1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/xu;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/security/impl/databinding/FragmentAddTwoFactorAuthenticationBinding;"

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
    const-string v3, "resetHashResultKey"

    .line 16
    .line 17
    const-string v5, "getResetHashResultKey()Ljava/lang/String;"

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
    sput-object v1, La/xu;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gfk0;

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/xu;->Q1:La/gfk0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01e0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/xu;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/xu;->L1:La/hnm0;

    .line 20
    .line 21
    sget-object v0, La/vu;->a:La/vu;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/xu;->M1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/su;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, v1}, La/su;-><init>(La/xu;B)V

    .line 33
    .line 34
    .line 35
    sget-object v1, La/wez;->b:La/wez;

    .line 36
    .line 37
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/xu;->N1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/su;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v0, p0, v2}, La/su;-><init>(La/xu;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, La/o5;

    .line 50
    .line 51
    const/16 v3, 0x15

    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v0, La/o5;

    .line 57
    .line 58
    const/16 v3, 0x16

    .line 59
    .line 60
    invoke-direct {v0, p0, v3}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v3, La/o5;

    .line 64
    .line 65
    const/16 v4, 0x17

    .line 66
    .line 67
    invoke-direct {v3, v0, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-class v1, La/pv;

    .line 75
    .line 76
    sget-object v3, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v3, La/k8;

    .line 83
    .line 84
    const/16 v4, 0xe

    .line 85
    .line 86
    invoke-direct {v3, v0, v4}, La/k8;-><init>(La/a8z;B)V

    .line 87
    .line 88
    .line 89
    new-instance v4, La/k8;

    .line 90
    .line 91
    const/16 v5, 0xf

    .line 92
    .line 93
    invoke-direct {v4, v0, v5}, La/k8;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v1, v3, v4, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/xu;->O1:La/kiu0;

    .line 101
    .line 102
    new-instance v0, La/phf0;

    .line 103
    .line 104
    const-string v1, "resetHashKey"

    .line 105
    .line 106
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, La/xu;->P1:La/phf0;

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/xu;->H0()La/lxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/lxq;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/su;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, v1}, La/su;-><init>(La/xu;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/xu;->H0()La/lxq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/lxq;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 21
    .line 22
    new-instance v0, La/t0;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/16 v7, 0x12

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const-class v3, La/xu;

    .line 29
    .line 30
    const-string v4, "onOpenAuthenticatorClicked"

    .line 31
    .line 32
    const-string v5, "onOpenAuthenticatorClicked(Landroid/view/View;)V"

    .line 33
    .line 34
    move-object v2, p0

    .line 35
    invoke-direct/range {v0 .. v7}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, La/xu;->H0()La/lxq;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p0, p0, La/lxq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 46
    .line 47
    new-instance p1, La/su;

    .line 48
    .line 49
    const/4 v0, 0x4

    .line 50
    invoke-direct {p1, v2, v0}, La/su;-><init>(La/xu;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, La/xu;->H0()La/lxq;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iget-object p0, p0, La/lxq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    invoke-static {p0, v2, p1}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, La/xu;->H0()La/lxq;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget-object p0, p0, La/lxq;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 71
    .line 72
    new-instance p1, La/uu;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-direct {p1, v2, v0}, La/uu;-><init>(La/xu;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, La/xu;->I0()La/b6i;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance p0, La/su;

    .line 89
    .line 90
    const/4 p1, 0x5

    .line 91
    invoke-direct {p0, v2, p1}, La/su;-><init>(La/xu;B)V

    .line 92
    .line 93
    .line 94
    new-instance p1, La/uu;

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    invoke-direct {p1, v2, v0}, La/uu;-><init>(La/xu;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v3, La/hi;

    .line 105
    .line 106
    const-string v4, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 107
    .line 108
    invoke-direct {v3, v4, p0, p1}, La/hi;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v4, v2, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, La/xu;->H0()La/lxq;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p0, p0, La/lxq;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 119
    .line 120
    new-instance p1, La/tu;

    .line 121
    .line 122
    invoke-direct {p1, v2}, La/tu;-><init>(La/xu;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, La/ugd;

    .line 126
    .line 127
    const v2, 0x7cd1949

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v2, v0, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0, v1}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/xu;->J0()La/pv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pv;->o:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/wu;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/wu;-><init>(La/xu;La/yje;B)V

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
    new-instance v4, La/m1;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/m1;-><init>(La/gmq;La/clz;La/wu;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/xu;->J0()La/pv;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/pv;->p:La/ol60;

    .line 42
    .line 43
    new-instance v6, La/wu;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/wu;-><init>(La/xu;La/yje;B)V

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
    new-instance v3, La/m1;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/m1;-><init>(La/gmq;La/clz;La/wu;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0(ILa/fet;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    const v2, 0x1441b52d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v4

    .line 24
    :goto_0
    or-int/2addr v2, v1

    .line 25
    and-int/lit8 v5, v2, 0x3

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    if-eq v5, v4, :cond_1

    .line 30
    .line 31
    move v4, v8

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v6

    .line 34
    :goto_1
    and-int/lit8 v5, v2, 0x1

    .line 35
    .line 36
    invoke-virtual {v7, v5, v4}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v5, La/ukd;->a:La/cl5;

    .line 47
    .line 48
    if-ne v4, v5, :cond_2

    .line 49
    .line 50
    const-string v4, ""

    .line 51
    .line 52
    invoke-static {v4}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    check-cast v4, La/pz40;

    .line 60
    .line 61
    invoke-virtual {v0}, La/xu;->J0()La/pv;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    iget-object v9, v9, La/pv;->o:La/p7m0;

    .line 66
    .line 67
    invoke-static {v9, v7}, La/ydx;->F(La/n7m0;La/fet;)La/pz40;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    sget-object v10, La/jm40;->b:La/jm40;

    .line 72
    .line 73
    const/high16 v11, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-static {v10, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    sget-object v10, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x8

    .line 84
    .line 85
    const/high16 v13, 0x41800000    # 16.0f

    .line 86
    .line 87
    const/high16 v14, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v15, 0x41800000    # 16.0f

    .line 90
    .line 91
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    check-cast v9, La/jv;

    .line 100
    .line 101
    iget-object v9, v9, La/jv;->f:La/c6q0;

    .line 102
    .line 103
    and-int/lit8 v2, v2, 0xe

    .line 104
    .line 105
    if-eq v2, v3, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move v6, v8

    .line 109
    :goto_2
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-nez v6, :cond_4

    .line 114
    .line 115
    if-ne v2, v5, :cond_5

    .line 116
    .line 117
    :cond_4
    new-instance v2, La/k1;

    .line 118
    .line 119
    const/16 v3, 0x12

    .line 120
    .line 121
    invoke-direct {v2, v0, v4, v3}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    move-object v6, v2

    .line 128
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 129
    .line 130
    const/16 v8, 0x180

    .line 131
    .line 132
    move-object v3, v9

    .line 133
    const/16 v9, 0x8

    .line 134
    .line 135
    const/4 v4, 0x7

    .line 136
    const/4 v5, 0x0

    .line 137
    move-object v2, v10

    .line 138
    invoke-static/range {v2 .. v9}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 143
    .line 144
    .line 145
    :goto_3
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-eqz v2, :cond_7

    .line 150
    .line 151
    new-instance v3, La/tu;

    .line 152
    .line 153
    invoke-direct {v3, v0, v1}, La/tu;-><init>(La/xu;I)V

    .line 154
    .line 155
    .line 156
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 157
    .line 158
    :cond_7
    return-void
.end method

.method public final H0()La/lxq;
    .locals 2

    .line 1
    sget-object v0, La/xu;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/xu;->M1:La/s0r;

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
    check-cast p0, La/lxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/b6i;
    .locals 0

    .line 1
    iget-object p0, p0, La/xu;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/b6i;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0()La/pv;
    .locals 0

    .line 1
    iget-object p0, p0, La/xu;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pv;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/su;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, p0, v0}, La/su;-><init>(La/xu;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "ERROR_REQUEST_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const-string v3, "input_method"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :goto_0
    instance-of v3, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 40
    .line 41
    :cond_1
    if-eqz v2, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p0}, La/xu;->H0()La/lxq;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/lxq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 52
    .line 53
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 58
    .line 59
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/xu;->H0()La/lxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/lxq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g0()V
    .locals 11

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/xu;->J0()La/pv;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v1, "com.google.android.apps.authenticator2"

    .line 13
    .line 14
    invoke-static {p0, v1}, La/v3c;->R(Landroid/content/Context;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v1, v0, La/pv;->i:La/ctf0;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const p0, 0x7f130ebb

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const p0, 0x7f130a79

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 v2, 0x0

    .line 30
    new-array v3, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v1, p0, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const v3, 0x7f13099a

    .line 37
    .line 38
    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v1, v3, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v2, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object p0, v0, La/pv;->o:La/p7m0;

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v3, v0

    .line 67
    check-cast v3, La/jv;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    const/16 v10, 0x3d

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-static/range {v3 .. v10}, La/jv;->a(La/jv;ZLjava/lang/String;Ljava/lang/String;ZZLa/c6q0;I)La/jv;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xu;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xu;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
