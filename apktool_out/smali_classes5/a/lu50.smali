.class public final La/lu50;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/lu50;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uuz",
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
.field public static final V1:La/uuz;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public final M1:La/s0r;

.field public final N1:La/zz2;

.field public final O1:La/zz2;

.field public final P1:La/zz2;

.field public final Q1:La/cgx0;

.field public final R1:La/cgx0;

.field public final S1:La/n0o0;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/lu50;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsBinding;"

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
    const-string v3, "bundleBannerId"

    .line 16
    .line 17
    const-string v5, "getBundleBannerId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleBannerType"

    .line 25
    .line 26
    const-string v6, "getBundleBannerType()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bundlePosition"

    .line 34
    .line 35
    const-string v7, "getBundlePosition()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "bundleFromAggregator"

    .line 43
    .line 44
    const-string v8, "getBundleFromAggregator()Z"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "bundleShowNavBar"

    .line 52
    .line 53
    const-string v9, "getBundleShowNavBar()Z"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    new-array v1, v1, [La/iiy;

    .line 60
    .line 61
    aput-object v0, v1, v4

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    aput-object v2, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    aput-object v3, v1, v0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aput-object v5, v1, v0

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    aput-object v6, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x5

    .line 76
    aput-object v7, v1, v0

    .line 77
    .line 78
    sput-object v1, La/lu50;->W1:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/uuz;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    sput-object v0, La/lu50;->V1:La/uuz;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0268

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040ae3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/lu50;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/ku50;->a:La/ku50;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/lu50;->M1:La/s0r;

    .line 29
    .line 30
    new-instance v0, La/zz2;

    .line 31
    .line 32
    const-string v1, "BANNER_ID"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/lu50;->N1:La/zz2;

    .line 38
    .line 39
    new-instance v0, La/zz2;

    .line 40
    .line 41
    const-string v1, "BANNER_TYPE"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/lu50;->O1:La/zz2;

    .line 47
    .line 48
    new-instance v0, La/zz2;

    .line 49
    .line 50
    const-string v1, "news_main_pager_position"

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/lu50;->P1:La/zz2;

    .line 56
    .line 57
    new-instance v0, La/cgx0;

    .line 58
    .line 59
    const-string v1, "FROM_AGGREGATOR"

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/lu50;->Q1:La/cgx0;

    .line 66
    .line 67
    new-instance v0, La/cgx0;

    .line 68
    .line 69
    const-string v1, "SHOW_NAVBAR"

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/lu50;->R1:La/cgx0;

    .line 75
    .line 76
    new-instance v0, La/ju50;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-direct {v0, p0, v1}, La/ju50;-><init>(La/lu50;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, La/lu50;->S1:La/n0o0;

    .line 87
    .line 88
    const-class v0, La/wu50;

    .line 89
    .line 90
    sget-object v1, La/sre0;->a:La/tre0;

    .line 91
    .line 92
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, La/ju50;

    .line 97
    .line 98
    invoke-direct {v1, p0, v2}, La/ju50;-><init>(La/lu50;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, La/lu50;->U1:La/a8z;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/lu50;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/lu50;->M1:La/s0r;

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
    check-cast p1, La/c2r;

    .line 16
    .line 17
    iget-object p1, p1, La/c2r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/pi40;

    .line 25
    .line 26
    const/16 v2, 0x12

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0xabb1d83

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/lu50;->S1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/yli;

    .line 8
    .line 9
    invoke-virtual {v0}, La/yli;->a()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/lu50;->L1:La/fiu0;

    .line 14
    .line 15
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lu50;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
