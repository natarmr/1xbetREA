.class public final La/tun0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tun0;",
        "La/yx5;",
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
.field public static final P1:La/y2m0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public final N1:La/r34;

.field public final O1:La/r34;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/tun0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/swipex/impl/databinding/FiltersFragmentBinding;"

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
    const-string v3, "expandSportId"

    .line 16
    .line 17
    const-string v5, "getExpandSportId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "expandSubSportId"

    .line 25
    .line 26
    const-string v6, "getExpandSubSportId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/tun0;->Q1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/y2m0;

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/tun0;->P1:La/y2m0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const v0, 0x7f0d01cc

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/tun0;->K1:Z

    .line 9
    .line 10
    new-instance v0, La/jfm0;

    .line 11
    .line 12
    const/16 v1, 0x12

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wez;->b:La/wez;

    .line 18
    .line 19
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/tun0;->L1:La/a8z;

    .line 24
    .line 25
    sget-object v0, La/sun0;->a:La/sun0;

    .line 26
    .line 27
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/tun0;->M1:La/s0r;

    .line 32
    .line 33
    new-instance v0, La/r34;

    .line 34
    .line 35
    const-string v1, "EXPAND_SPORT_ID_KEY"

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/tun0;->N1:La/r34;

    .line 41
    .line 42
    new-instance v0, La/r34;

    .line 43
    .line 44
    const-string v1, "EXPAND_SUB_SPORT_ID_KEY"

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/tun0;->O1:La/r34;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/a7n0;

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    invoke-direct {p1, v0}, La/a7n0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    const-string v0, "CHANGE_FILTERS_KEY"

    .line 9
    .line 10
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/tun0;->Q1:[La/iiy;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    aget-object p1, p1, v0

    .line 17
    .line 18
    iget-object v0, p0, La/tun0;->M1:La/s0r;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p1, La/w5q;

    .line 28
    .line 29
    iget-object p1, p1, La/w5q;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 30
    .line 31
    new-instance v0, La/abn0;

    .line 32
    .line 33
    const/16 v1, 0xb

    .line 34
    .line 35
    invoke-direct {v0, p0, v1}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ugd;

    .line 39
    .line 40
    const v1, -0x6c9ba89a

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tun0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
