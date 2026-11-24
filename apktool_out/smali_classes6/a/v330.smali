.class public final La/v330;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/v330;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final Q1:La/xuz;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public N1:La/ii;

.field public O1:La/fiu0;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/v330;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/sportgame/markets/display_settings/impl/databinding/FragmentMarketsDisplaySettingsBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/v330;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/v330;->Q1:La/xuz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0264

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
    iput-object v0, p0, La/v330;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/u330;->a:La/u330;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/v330;->L1:La/s0r;

    .line 24
    .line 25
    new-instance v0, La/q330;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, p0, v1}, La/q330;-><init>(La/v330;B)V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/wez;->b:La/wez;

    .line 32
    .line 33
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/v330;->M1:La/a8z;

    .line 38
    .line 39
    const-class v0, La/d430;

    .line 40
    .line 41
    sget-object v1, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, La/q330;

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    invoke-direct {v1, p0, v2}, La/q330;-><init>(La/v330;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/v330;->P1:La/a8z;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/v330;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/v330;->L1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/y1r;

    .line 16
    .line 17
    iget-object p1, p1, La/y1r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/tx;

    .line 25
    .line 26
    const/16 v2, 0x19

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/ugd;

    .line 32
    .line 33
    const v3, 0x7ffd223a

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {v2, v3, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {p1, v0, v1, v2}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, La/q330;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-direct {p1, p0, v0}, La/q330;-><init>(La/v330;B)V

    .line 48
    .line 49
    .line 50
    const-string v0, "REQUEST_SAVE_SETTINGS_DIALOG_KEY"

    .line 51
    .line 52
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/q330;

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    invoke-direct {p1, p0, v1}, La/q330;-><init>(La/v330;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/q330;

    .line 65
    .line 66
    const/4 v0, 0x5

    .line 67
    invoke-direct {p1, p0, v0}, La/q330;-><init>(La/v330;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/v330;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/dli;

    .line 8
    .line 9
    iget-object v1, v0, La/dli;->a:La/ii;

    .line 10
    .line 11
    iput-object v1, p0, La/v330;->N1:La/ii;

    .line 12
    .line 13
    new-instance v1, La/fiu0;

    .line 14
    .line 15
    const-class v2, La/d430;

    .line 16
    .line 17
    iget-object v0, v0, La/dli;->l:La/rki;

    .line 18
    .line 19
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/v330;->O1:La/fiu0;

    .line 27
    .line 28
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v330;->P1:La/a8z;

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

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v330;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
