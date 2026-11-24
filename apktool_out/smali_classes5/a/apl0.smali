.class public final La/apl0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/apl0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gle0",
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
.field public static final P1:La/gle0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/n0o0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/khf0;

.field public final O1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/apl0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "settings"

    .line 16
    .line 17
    const-string v5, "getSettings()Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;"

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
    sput-object v1, La/apl0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gle0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/apl0;->P1:La/gle0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/wol0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/wol0;-><init>(La/apl0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/apl0;->K1:La/n0o0;

    .line 18
    .line 19
    sget-object v0, La/yol0;->a:La/yol0;

    .line 20
    .line 21
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/apl0;->L1:La/s0r;

    .line 26
    .line 27
    const-class v0, La/xpl0;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/wol0;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, La/wol0;-><init>(La/apl0;B)V

    .line 39
    .line 40
    .line 41
    const/16 v3, 0xe

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/apl0;->M1:La/a8z;

    .line 49
    .line 50
    new-instance v0, La/khf0;

    .line 51
    .line 52
    const-string v1, "SETTINGS_BUNDLE_KEY"

    .line 53
    .line 54
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/apl0;->N1:La/khf0;

    .line 58
    .line 59
    iput-boolean v2, p0, La/apl0;->O1:Z

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/apl0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/apl0;->N1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;

    .line 13
    .line 14
    iget-object p1, p1, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;->b:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 15
    .line 16
    instance-of p1, p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FromBetSlip;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, La/qr2;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, La/pr2;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, p0, La/apl0;->K1:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/sui;

    .line 38
    .line 39
    iget-object v1, v1, La/sui;->m:La/itr;

    .line 40
    .line 41
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/xol0;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p0, v3}, La/xol0;-><init>(La/apl0;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p0, p1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/apl0;->G0()La/aid;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/apl0;->G0()La/aid;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/apl0;->G0()La/aid;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 80
    .line 81
    new-instance v1, La/edk0;

    .line 82
    .line 83
    const/16 v2, 0xe

    .line 84
    .line 85
    invoke-direct {v1, p0, v2}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    new-instance v2, La/ugd;

    .line 89
    .line 90
    const v3, 0x50c4fb82

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, v3, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-static {p1, v0, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/apl0;->H0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget-object p1, La/mol0;->a:La/mol0;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final G0()La/aid;
    .locals 2

    .line 1
    sget-object v0, La/apl0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/apl0;->L1:La/s0r;

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
    check-cast p0, La/aid;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/apl0;->M1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/apl0;->O1:Z

    .line 2
    .line 3
    return p0
.end method
