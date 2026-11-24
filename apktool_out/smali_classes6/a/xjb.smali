.class public final La/xjb;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xjb;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kj5",
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
.field public static final U1:La/kj5;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ujd;

.field public M1:La/oll0;

.field public final N1:La/khf0;

.field public final O1:La/a8z;

.field public final P1:La/a8z;

.field public final Q1:La/qdz;

.field public final R1:Z

.field public final S1:La/e9o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xjb;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;"

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
    sput-object v1, La/xjb;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/xjb;->U1:La/kj5;

    .line 26
    .line 27
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
    iput-object v0, p0, La/xjb;->N1:La/khf0;

    .line 15
    .line 16
    new-instance v0, La/wjb;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/wjb;-><init>(La/xjb;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/xjb;->O1:La/a8z;

    .line 29
    .line 30
    const-class v0, La/plb;

    .line 31
    .line 32
    sget-object v1, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/wjb;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, p0, v2}, La/wjb;-><init>(La/xjb;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/xjb;->P1:La/a8z;

    .line 49
    .line 50
    new-instance v0, La/qdz;

    .line 51
    .line 52
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/xjb;->Q1:La/qdz;

    .line 56
    .line 57
    iput-boolean v2, p0, La/xjb;->R1:Z

    .line 58
    .line 59
    new-instance v0, La/e9o0;

    .line 60
    .line 61
    const v1, 0x7f040ae3

    .line 62
    .line 63
    .line 64
    const/16 v2, 0xc

    .line 65
    .line 66
    const v3, 0x7f040b5d

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/xjb;->S1:La/e9o0;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/xjb;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/eci;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, La/eci;->a(La/xjb;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final D0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/xjb;->L1:La/ujd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/ls2;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/vjb;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, p0, v3}, La/vjb;-><init>(La/xjb;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/xjb;->O1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/eci;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/eci;->a(La/xjb;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

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
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/bna;

    .line 21
    .line 22
    const/16 v1, 0x13

    .line 23
    .line 24
    invoke-direct {p3, p0, v1}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const v1, -0x27a3d68e

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/xjb;->R1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xjb;->S1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
