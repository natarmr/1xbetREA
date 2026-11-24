.class public final La/uy80;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uy80;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final W1:La/jh70;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/wdk0;

.field public M1:La/poq0;

.field public final N1:Z

.field public final O1:La/a8z;

.field public final P1:La/qdz;

.field public final Q1:La/phf0;

.field public final R1:La/r34;

.field public final S1:La/cgx0;

.field public final U1:La/s0r;

.field public final V1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/uy80;

    .line 4
    .line 5
    const-string v2, "selectedTeamName"

    .line 6
    .line 7
    const-string v3, "getSelectedTeamName()Ljava/lang/String;"

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
    const-string v3, "selectedFeedId"

    .line 16
    .line 17
    const-string v5, "getSelectedFeedId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "fromDeepLink"

    .line 25
    .line 26
    const-string v6, "getFromDeepLink()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/uy80;->X1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/jh70;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/uy80;->W1:La/jh70;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/uy80;->N1:Z

    .line 9
    .line 10
    const-class v1, La/gz80;

    .line 11
    .line 12
    sget-object v2, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, La/sy80;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p0, v3}, La/sy80;-><init>(La/uy80;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, La/uy80;->O1:La/a8z;

    .line 29
    .line 30
    new-instance v1, La/qdz;

    .line 31
    .line 32
    invoke-direct {v1}, La/qdz;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, La/uy80;->P1:La/qdz;

    .line 36
    .line 37
    new-instance v1, La/phf0;

    .line 38
    .line 39
    const-string v2, "selected_team_name"

    .line 40
    .line 41
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, La/uy80;->Q1:La/phf0;

    .line 45
    .line 46
    new-instance v1, La/r34;

    .line 47
    .line 48
    const-string v2, "selected_feed_id"

    .line 49
    .line 50
    invoke-direct {v1, v2}, La/r34;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, La/uy80;->R1:La/r34;

    .line 54
    .line 55
    new-instance v1, La/cgx0;

    .line 56
    .line 57
    const-string v2, "from_deep_link"

    .line 58
    .line 59
    invoke-direct {v1, v2}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, La/uy80;->S1:La/cgx0;

    .line 63
    .line 64
    sget-object v1, La/ty80;->a:La/ty80;

    .line 65
    .line 66
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v1, p0, La/uy80;->U1:La/s0r;

    .line 71
    .line 72
    new-instance v1, La/sy80;

    .line 73
    .line 74
    invoke-direct {v1, p0, v0}, La/sy80;-><init>(La/uy80;B)V

    .line 75
    .line 76
    .line 77
    sget-object v0, La/wez;->b:La/wez;

    .line 78
    .line 79
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/uy80;->V1:La/a8z;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/uy80;->V1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/hni;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/gz80;

    .line 12
    .line 13
    iget-object v3, v0, La/hni;->z:La/eni;

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/uy80;->K1:La/fiu0;

    .line 23
    .line 24
    iget-object v1, v0, La/hni;->y:La/wdk0;

    .line 25
    .line 26
    iput-object v1, p0, La/uy80;->L1:La/wdk0;

    .line 27
    .line 28
    iget-object v0, v0, La/hni;->t:La/poq0;

    .line 29
    .line 30
    iput-object v0, p0, La/uy80;->M1:La/poq0;

    .line 31
    .line 32
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/uy80;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/uy80;->U1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/aid;

    .line 16
    .line 17
    iget-object v0, v0, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/owp0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/ds60;

    .line 25
    .line 26
    const/16 v3, 0x14

    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v3, -0x37f54c29

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v0, v1, v2, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/uy80;->O1:La/a8z;

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
    iget-boolean p0, p0, La/uy80;->N1:Z

    .line 2
    .line 3
    return p0
.end method
