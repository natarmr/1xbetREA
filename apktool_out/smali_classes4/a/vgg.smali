.class public final La/vgg;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vgg;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qud",
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
.field public static final Q1:La/qud;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/ib50;

.field public L1:La/cog;

.field public final M1:La/khf0;

.field public final N1:La/a8z;

.field public final O1:La/kiu0;

.field public final P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vgg;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/vgg;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/qud;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/vgg;->Q1:La/qud;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "params_key"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/vgg;->M1:La/khf0;

    .line 15
    .line 16
    new-instance v0, La/tgg;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/tgg;-><init>(La/vgg;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/vgg;->N1:La/a8z;

    .line 29
    .line 30
    new-instance v0, La/tgg;

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v0, p0, v3}, La/tgg;-><init>(La/vgg;B)V

    .line 34
    .line 35
    .line 36
    new-instance v3, La/q7g;

    .line 37
    .line 38
    const/16 v4, 0xc

    .line 39
    .line 40
    invoke-direct {v3, p0, v4}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    new-instance v5, La/q7g;

    .line 44
    .line 45
    const/16 v6, 0xd

    .line 46
    .line 47
    invoke-direct {v5, v3, v6}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-class v3, La/aig;

    .line 55
    .line 56
    sget-object v5, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v5, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v5, La/r7g;

    .line 63
    .line 64
    invoke-direct {v5, v2, v4}, La/r7g;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    new-instance v4, La/r7g;

    .line 68
    .line 69
    invoke-direct {v4, v2, v6}, La/r7g;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v3, v5, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/vgg;->O1:La/kiu0;

    .line 77
    .line 78
    iput-boolean v1, p0, La/vgg;->P1:Z

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/tgg;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/tgg;-><init>(La/vgg;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/vgg;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/iei;

    .line 8
    .line 9
    iget-object v1, v0, La/iei;->a:La/ib50;

    .line 10
    .line 11
    iput-object v1, p0, La/vgg;->K1:La/ib50;

    .line 12
    .line 13
    iget-object v0, v0, La/iei;->g:La/n5d0;

    .line 14
    .line 15
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/cog;

    .line 20
    .line 21
    iput-object v0, p0, La/vgg;->L1:La/cog;

    .line 22
    .line 23
    new-instance v0, La/ugg;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/ugg;-><init>(La/vgg;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "REQUEST_CHAMPS_TIME_FILTER_RESULT_KEY"

    .line 30
    .line 31
    invoke-static {p0, v1, v0}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

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
    const/4 p3, 0x0

    .line 11
    const/4 v0, 0x6

    .line 12
    invoke-direct {p1, p2, p3, v0}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/sgg;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p3, p0, v0}, La/sgg;-><init>(La/vgg;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v0, -0x4a667beb

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {p0, v0, v1, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/vgg;->P1:Z

    .line 2
    .line 3
    return p0
.end method
