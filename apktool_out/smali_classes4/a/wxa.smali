.class public final La/wxa;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wxa;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kl5",
        "cashback"
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
.field public static final U1:La/kl5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/r34;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/hnm0;

.field public final R1:La/n0o0;

.field public S1:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/wxa;

    .line 4
    .line 5
    const-string v2, "monthGameId"

    .line 6
    .line 7
    const-string v3, "getMonthGameId()J"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/wxa;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kl5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/wxa;->U1:La/kl5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/r34;

    .line 8
    .line 9
    const-string v1, "MONTH_GAME_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/wxa;->K1:La/r34;

    .line 15
    .line 16
    sget-object v0, La/vxa;->a:La/vxa;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/wxa;->L1:La/s0r;

    .line 23
    .line 24
    const-class v0, La/uya;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/uxa;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v1, p0, v2}, La/uxa;-><init>(La/wxa;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/wxa;->P1:La/a8z;

    .line 43
    .line 44
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 45
    .line 46
    iput-object v0, p0, La/wxa;->Q1:La/hnm0;

    .line 47
    .line 48
    new-instance v0, La/uxa;

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-direct {v0, p0, v1}, La/uxa;-><init>(La/wxa;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/wxa;->R1:La/n0o0;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/uxa;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {p1, p0, v0}, La/uxa;-><init>(La/wxa;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "SAVE_CONFIRMATION_REQUEST_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/uxa;

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    invoke-direct {p1, p0, v2}, La/uxa;-><init>(La/wxa;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/uxa;

    .line 22
    .line 23
    const/4 v1, 0x5

    .line 24
    invoke-direct {p1, p0, v1}, La/uxa;-><init>(La/wxa;B)V

    .line 25
    .line 26
    .line 27
    const-string v1, "SAVE_SUCCESS_REQUEST_KEY"

    .line 28
    .line 29
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, La/uxa;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {p1, p0, v1}, La/uxa;-><init>(La/wxa;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, La/wxa;->V1:[La/iiy;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    aget-object p1, p1, v1

    .line 45
    .line 46
    iget-object v2, p0, La/wxa;->L1:La/s0r;

    .line 47
    .line 48
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p1, La/aid;

    .line 56
    .line 57
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 58
    .line 59
    sget-object v2, La/qek0;->h:La/qek0;

    .line 60
    .line 61
    new-instance v3, La/bna;

    .line 62
    .line 63
    invoke-direct {v3, p0, v0}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance p0, La/ugd;

    .line 67
    .line 68
    const v0, 0x6abe5c84

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v0, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/shd;

    .line 75
    .line 76
    const/16 v1, 0xe

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/shd;-><init>(B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/wxa;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/rbi;

    .line 8
    .line 9
    invoke-virtual {v0}, La/rbi;->a()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/wxa;->M1:La/fiu0;

    .line 14
    .line 15
    iget-object v1, v0, La/rbi;->R:La/ii;

    .line 16
    .line 17
    iput-object v1, p0, La/wxa;->N1:La/ii;

    .line 18
    .line 19
    iget-object v0, v0, La/rbi;->S:La/wdk0;

    .line 20
    .line 21
    iput-object v0, p0, La/wxa;->O1:La/wdk0;

    .line 22
    .line 23
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wxa;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, La/wxa;->S1:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, La/yx5;->Z()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 17
    .line 18
    iput v0, p0, La/wxa;->S1:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {}, La/a8k0;->A()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    const/16 v1, 0x10

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v1, 0x30

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wxa;->Q1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
