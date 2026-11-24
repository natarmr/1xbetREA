.class public final La/wfn0;
.super La/sik;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wfn0;",
        "La/sik;",
        "<init>",
        "()V",
        "a/s2m0",
        "core"
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
.field public static final e2:La/s2m0;

.field public static final synthetic f2:[La/iiy;

.field public static final g2:Ljava/lang/String;


# instance fields
.field public final Y1:La/khf0;

.field public final Z1:La/khf0;

.field public final a2:La/yzn0;

.field public final b2:La/yzn0;

.field public final c2:La/a8z;

.field public final d2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/wfn0;

    .line 4
    .line 5
    const-string v2, "successBetStringModel"

    .line 6
    .line 7
    const-string v3, "getSuccessBetStringModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;"

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
    const-string v3, "successBetAlertModel"

    .line 16
    .line 17
    const-string v5, "getSuccessBetAlertModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "betDoneIconStyle"

    .line 25
    .line 26
    const-string v6, "getBetDoneIconStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneIconStyle;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "betDoneScreenStyle"

    .line 34
    .line 35
    const-string v7, "getBetDoneScreenStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneScreenStyle;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    new-array v6, v6, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v6, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v6, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v6, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v6, v0

    .line 53
    .line 54
    sput-object v6, La/wfn0;->f2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/s2m0;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/wfn0;->e2:La/s2m0;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, La/wfn0;->g2:Ljava/lang/String;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/sik;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "SUCCESS_BET_STRING_MODEL"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/wfn0;->Y1:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/khf0;

    .line 14
    .line 15
    const-string v1, "SUCCESS_BET_ALERT_MODEL"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/wfn0;->Z1:La/khf0;

    .line 21
    .line 22
    new-instance v0, La/yzn0;

    .line 23
    .line 24
    const-string v1, "BET_DONE_ICON_STYLE"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/wfn0;->a2:La/yzn0;

    .line 30
    .line 31
    new-instance v0, La/yzn0;

    .line 32
    .line 33
    const-string v1, "BET_DONE_SCREEN_STYLE"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/wfn0;->b2:La/yzn0;

    .line 39
    .line 40
    new-instance v0, La/vfn0;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, La/vfn0;-><init>(La/wfn0;B)V

    .line 44
    .line 45
    .line 46
    sget-object v1, La/wez;->b:La/wez;

    .line 47
    .line 48
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/wfn0;->c2:La/a8z;

    .line 53
    .line 54
    const-class v0, La/sgn0;

    .line 55
    .line 56
    sget-object v1, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, La/vfn0;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-direct {v1, p0, v2}, La/vfn0;-><init>(La/wfn0;B)V

    .line 66
    .line 67
    .line 68
    const/16 v2, 0xe

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/wfn0;->d2:La/a8z;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/abn0;

    .line 16
    .line 17
    const/4 p3, 0x3

    .line 18
    invoke-direct {p2, p0, p3}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    new-instance p0, La/ugd;

    .line 22
    .line 23
    const p3, -0x2e31d3bb

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p0, p3, v1, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/view/Window;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const v2, 0x7f0606d8

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const v2, 0x7f14088d

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Landroid/view/View;->setElevation(F)V

    .line 59
    .line 60
    .line 61
    :cond_3
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, La/sik;->E0(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const v2, 0x7f0706aa

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const v3, 0x7f0706f8

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 105
    .line 106
    mul-int/lit8 v2, v2, 0x2

    .line 107
    .line 108
    sub-int/2addr p0, v2

    .line 109
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    const/4 v1, -0x2

    .line 114
    invoke-virtual {v0, p0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 115
    .line 116
    .line 117
    :cond_4
    return-void
.end method
