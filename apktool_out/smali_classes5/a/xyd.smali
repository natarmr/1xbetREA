.class public final La/xyd;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xyd;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kud",
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
.field public static final U1:La/kud;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/gl5;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/s0r;

.field public final Q1:La/a8z;

.field public final R1:La/kiu0;

.field public final S1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/xyd;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSendConfirmationEmailBinding;"

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
    const-string v3, "confirmSendEmailScreenParams"

    .line 16
    .line 17
    const-string v5, "getConfirmSendEmailScreenParams()Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;"

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
    sput-object v1, La/xyd;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kud;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/xyd;->U1:La/kud;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02cb

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
    iput-object v0, p0, La/xyd;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/xyd;->L1:La/hnm0;

    .line 20
    .line 21
    sget-object v0, La/vyd;->a:La/vyd;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/xyd;->P1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/uyd;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, v1}, La/uyd;-><init>(La/xyd;B)V

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
    iput-object v0, p0, La/xyd;->Q1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/uyd;

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, p0, v2}, La/uyd;-><init>(La/xyd;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, La/svc;

    .line 50
    .line 51
    const/16 v3, 0xc

    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v0, La/svc;

    .line 57
    .line 58
    const/16 v3, 0xd

    .line 59
    .line 60
    invoke-direct {v0, p0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v3, La/svc;

    .line 64
    .line 65
    const/16 v4, 0xe

    .line 66
    .line 67
    invoke-direct {v3, v0, v4}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-class v1, La/kzd;

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
    new-instance v3, La/wpb;

    .line 83
    .line 84
    const/16 v4, 0x14

    .line 85
    .line 86
    invoke-direct {v3, v0, v4}, La/wpb;-><init>(La/a8z;B)V

    .line 87
    .line 88
    .line 89
    new-instance v4, La/wpb;

    .line 90
    .line 91
    const/16 v5, 0x15

    .line 92
    .line 93
    invoke-direct {v4, v0, v5}, La/wpb;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v1, v3, v4, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/xyd;->R1:La/kiu0;

    .line 101
    .line 102
    new-instance v0, La/khf0;

    .line 103
    .line 104
    const-string v1, "TYPE_KEY"

    .line 105
    .line 106
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, La/xyd;->S1:La/khf0;

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xyd;->G0()La/q4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/q4r;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    new-instance v0, La/uyd;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-direct {v0, p0, v1}, La/uyd;-><init>(La/xyd;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/xyd;->G0()La/q4r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/q4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 21
    .line 22
    new-instance v0, La/uyd;

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-direct {v0, p0, v1}, La/uyd;-><init>(La/xyd;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/xyd;->M1:La/gl5;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    new-instance p1, La/uyd;

    .line 36
    .line 37
    const/4 v0, 0x7

    .line 38
    invoke-direct {p1, p0, v0}, La/uyd;-><init>(La/xyd;B)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/ejd;

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    const-string v1, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 49
    .line 50
    invoke-static {p0, v1, p1, v0}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    const-string p0, "captchaDialogDelegate"

    .line 55
    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/xyd;->Q1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/zci;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, La/gl5;

    .line 13
    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, La/xyd;->M1:La/gl5;

    .line 20
    .line 21
    iget-object v1, v0, La/zci;->q:La/ii;

    .line 22
    .line 23
    iput-object v1, p0, La/xyd;->N1:La/ii;

    .line 24
    .line 25
    iget-object v0, v0, La/zci;->r:La/wdk0;

    .line 26
    .line 27
    iput-object v0, p0, La/xyd;->O1:La/wdk0;

    .line 28
    .line 29
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/xyd;->H0()La/kzd;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/kzd;->s:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/wib;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, v0, v4, v3}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/fnq;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/e00;

    .line 21
    .line 22
    const/16 v2, 0xc

    .line 23
    .line 24
    invoke-direct {v1, v0, v4, v2}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/dnq;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, La/wyd;

    .line 34
    .line 35
    invoke-direct {v1, p0, v4, v2}, La/wyd;-><init>(La/xyd;La/yje;B)V

    .line 36
    .line 37
    .line 38
    sget-object v2, La/lkz;->a:La/lkz;

    .line 39
    .line 40
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-instance v5, La/cxd;

    .line 53
    .line 54
    invoke-direct {v5, v0, v2, v1, v4}, La/cxd;-><init>(La/dnq;La/clz;La/wyd;La/yje;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/xyd;->H0()La/kzd;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v1, v1, La/kzd;->r:La/ol60;

    .line 66
    .line 67
    new-instance v2, La/wyd;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, v4, v3}, La/wyd;-><init>(La/xyd;La/yje;B)V

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
    move-result-object v3

    .line 81
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v5, La/cxd;

    .line 86
    .line 87
    invoke-direct {v5, v1, p0, v2, v4}, La/cxd;-><init>(La/gmq;La/clz;La/wyd;La/yje;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final G0()La/q4r;
    .locals 2

    .line 1
    sget-object v0, La/xyd;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/xyd;->P1:La/s0r;

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
    check-cast p0, La/q4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/kzd;
    .locals 0

    .line 1
    iget-object p0, p0, La/xyd;->R1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kzd;

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
    new-instance p1, La/uyd;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, La/uyd;-><init>(La/xyd;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_REQUEST_ERROR_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/uyd;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, v0}, La/uyd;-><init>(La/xyd;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "REQUEST_BACK_DIALOG_KEY"

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, La/uyd;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-direct {p1, p0, v0}, La/uyd;-><init>(La/xyd;B)V

    .line 30
    .line 31
    .line 32
    const-string v0, "TOKEN_EXPIRED_ERROR_KEY"

    .line 33
    .line 34
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    const/16 v1, 0x20

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 62
    .line 63
    .line 64
    :cond_3
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 66
    .line 67
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0}, La/yx5;->e0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xyd;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xyd;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
