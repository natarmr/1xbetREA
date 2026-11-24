.class public final La/sap0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/sap0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final R1:La/j6m0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:La/a8z;

.field public final O1:La/a8z;

.field public final P1:La/qdz;

.field public final Q1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/sap0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;"

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
    sput-object v1, La/sap0;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/j6m0;

    .line 21
    .line 22
    const/16 v1, 0xe

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/sap0;->R1:La/j6m0;

    .line 28
    .line 29
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
    iput-boolean v0, p0, La/sap0;->K1:Z

    .line 9
    .line 10
    const-class v1, La/zap0;

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
    new-instance v2, La/rap0;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p0, v3}, La/rap0;-><init>(La/sap0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, La/sap0;->N1:La/a8z;

    .line 29
    .line 30
    new-instance v1, La/rap0;

    .line 31
    .line 32
    invoke-direct {v1, p0, v0}, La/rap0;-><init>(La/sap0;B)V

    .line 33
    .line 34
    .line 35
    sget-object v0, La/wez;->b:La/wez;

    .line 36
    .line 37
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/sap0;->O1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/qdz;

    .line 44
    .line 45
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/sap0;->P1:La/qdz;

    .line 49
    .line 50
    new-instance v0, La/khf0;

    .line 51
    .line 52
    const-string v1, "TEAM_DETAILS_RESULTS_PARAMS"

    .line 53
    .line 54
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/sap0;->Q1:La/khf0;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/sap0;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/lwi;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/zap0;

    .line 12
    .line 13
    iget-object v3, v0, La/lwi;->o:La/xvi;

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
    iput-object v1, p0, La/sap0;->L1:La/fiu0;

    .line 23
    .line 24
    iget-object v0, v0, La/lwi;->n:La/wdk0;

    .line 25
    .line 26
    iput-object v0, p0, La/sap0;->M1:La/wdk0;

    .line 27
    .line 28
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sap0;->N1:La/a8z;

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
    new-instance p3, La/l7p0;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p3, p0, v0}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v0, -0x26507fd5

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
    iget-boolean p0, p0, La/sap0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
