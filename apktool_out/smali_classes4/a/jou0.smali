.class public final La/jou0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jou0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/sxs0",
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
.field public static final R1:La/sxs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:Z

.field public final M1:La/khf0;

.field public final N1:La/a8z;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public final Q1:La/qdz;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/jou0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;"

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
    sput-object v1, La/jou0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/sxs0;

    .line 33
    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/jou0;->R1:La/sxs0;

    .line 40
    .line 41
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/jou0;->L1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "VIRTUAL_CATEGORY_DISCIPLINE_PARAMS"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/jou0;->M1:La/khf0;

    .line 18
    .line 19
    new-instance v1, La/hou0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, La/hou0;-><init>(La/jou0;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, La/jou0;->N1:La/a8z;

    .line 32
    .line 33
    const-class v1, La/oou0;

    .line 34
    .line 35
    sget-object v2, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, La/hou0;

    .line 42
    .line 43
    invoke-direct {v2, p0, v0}, La/hou0;-><init>(La/jou0;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/jou0;->O1:La/a8z;

    .line 51
    .line 52
    sget-object v0, La/iou0;->a:La/iou0;

    .line 53
    .line 54
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/jou0;->P1:La/s0r;

    .line 59
    .line 60
    new-instance v0, La/qdz;

    .line 61
    .line 62
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/jou0;->Q1:La/qdz;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/hou0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/hou0;-><init>(La/jou0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/jou0;->S1:[La/iiy;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    aget-object p1, p1, v0

    .line 14
    .line 15
    iget-object v1, p0, La/jou0;->P1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/aid;

    .line 25
    .line 26
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 27
    .line 28
    new-instance v1, La/owp0;

    .line 29
    .line 30
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/ggt0;

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    invoke-direct {v2, p0, v3}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/ugd;

    .line 41
    .line 42
    const v3, -0x5f048d6a

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/jou0;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/czi;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/oou0;

    .line 12
    .line 13
    iget-object v0, v0, La/czi;->i:La/yxi;

    .line 14
    .line 15
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/jou0;->K1:La/fiu0;

    .line 23
    .line 24
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/jou0;->L1:Z

    .line 2
    .line 3
    return p0
.end method
