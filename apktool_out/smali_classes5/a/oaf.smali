.class public final La/oaf;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/oaf;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nwd",
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
.field public static final Q1:La/nwd;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public final M1:La/a8z;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/oaf;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentCreateNewPasswordBinding;"

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
    const-string v3, "createNewPasswordParams"

    .line 16
    .line 17
    const-string v5, "getCreateNewPasswordParams()Lorg/xplatform/security/impl/presentation/password/change/create_password/models/CreateNewPasswordParams;"

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
    sput-object v1, La/oaf;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nwd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/oaf;->Q1:La/nwd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0227

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
    iput-object v0, p0, La/oaf;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/oaf;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/kaf;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-direct {v0, p0, v1}, La/kaf;-><init>(La/oaf;B)V

    .line 25
    .line 26
    .line 27
    sget-object v1, La/wez;->b:La/wez;

    .line 28
    .line 29
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/oaf;->M1:La/a8z;

    .line 34
    .line 35
    sget-object v0, La/naf;->a:La/naf;

    .line 36
    .line 37
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/oaf;->N1:La/s0r;

    .line 42
    .line 43
    new-instance v0, La/kaf;

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, p0, v2}, La/kaf;-><init>(La/oaf;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, La/aqe;

    .line 50
    .line 51
    const/16 v3, 0xd

    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v0, La/aqe;

    .line 57
    .line 58
    const/16 v3, 0xe

    .line 59
    .line 60
    invoke-direct {v0, p0, v3}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/aqe;

    .line 64
    .line 65
    const/16 v5, 0xf

    .line 66
    .line 67
    invoke-direct {v4, v0, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-class v1, La/lbf;

    .line 75
    .line 76
    sget-object v4, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v4, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v4, La/cce;

    .line 83
    .line 84
    invoke-direct {v4, v0, v3}, La/cce;-><init>(La/a8z;B)V

    .line 85
    .line 86
    .line 87
    new-instance v3, La/cce;

    .line 88
    .line 89
    invoke-direct {v3, v0, v5}, La/cce;-><init>(La/a8z;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0, v1, v4, v3, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, La/oaf;->O1:La/kiu0;

    .line 97
    .line 98
    new-instance v0, La/yzn0;

    .line 99
    .line 100
    const-string v1, "CHANGE_PASSWORD_PARAMS_KEY"

    .line 101
    .line 102
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, La/oaf;->P1:La/yzn0;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/qzq;->d:Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 6
    .line 7
    const v0, 0x7f130f13

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/qzq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 22
    .line 23
    new-instance v0, La/kaf;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/kaf;-><init>(La/oaf;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, La/qzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 37
    .line 38
    new-instance v0, La/da0;

    .line 39
    .line 40
    new-instance v2, La/laf;

    .line 41
    .line 42
    invoke-direct {v2, p0, v1}, La/laf;-><init>(La/oaf;B)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/qzq;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 56
    .line 57
    new-instance v0, La/da0;

    .line 58
    .line 59
    new-instance v1, La/laf;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v1, p0, v2}, La/laf;-><init>(La/oaf;B)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p1, p1, La/qzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {p1, p0, v0}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p1, p1, La/qzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 86
    .line 87
    new-instance v0, La/kaf;

    .line 88
    .line 89
    invoke-direct {v0, p0, v2}, La/kaf;-><init>(La/oaf;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/oaf;->H0()La/lbf;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/lbf;->r:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/maf;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v2, v3}, La/maf;-><init>(La/oaf;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v4, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    new-instance v6, La/fze;

    .line 29
    .line 30
    invoke-direct {v6, v0, v4, v1, v2}, La/fze;-><init>(La/gmq;La/clz;La/maf;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v5, v2, v2, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/oaf;->H0()La/lbf;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/lbf;->q:La/p7m0;

    .line 42
    .line 43
    new-instance v5, La/wib;

    .line 44
    .line 45
    const/16 v6, 0xd

    .line 46
    .line 47
    invoke-direct {v5, v1, v2, v6}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 48
    .line 49
    .line 50
    new-instance v6, La/s6n0;

    .line 51
    .line 52
    invoke-direct {v6, v4, v5}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/e00;

    .line 56
    .line 57
    const/16 v5, 0xe

    .line 58
    .line 59
    invoke-direct {v4, v1, v2, v5}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 60
    .line 61
    .line 62
    new-instance v1, La/dnq;

    .line 63
    .line 64
    invoke-direct {v1, v6, v4, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/maf;

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    invoke-direct {v3, p0, v2, v4}, La/maf;-><init>(La/oaf;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    new-instance v5, La/fze;

    .line 86
    .line 87
    invoke-direct {v5, v1, p0, v3, v2}, La/fze;-><init>(La/dnq;La/clz;La/maf;La/yje;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v2, v2, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final G0()La/qzq;
    .locals 2

    .line 1
    sget-object v0, La/oaf;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/oaf;->N1:La/s0r;

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
    check-cast p0, La/qzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/lbf;
    .locals 0

    .line 1
    iget-object p0, p0, La/oaf;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/lbf;

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
    new-instance p1, La/kaf;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, p0, v0}, La/kaf;-><init>(La/oaf;B)V

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
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/qzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/oaf;->G0()La/qzq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/qzq;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/16 v0, 0x10

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oaf;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oaf;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
