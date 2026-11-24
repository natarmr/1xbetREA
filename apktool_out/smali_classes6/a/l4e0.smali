.class public final La/l4e0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/l4e0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final n2:La/fl70;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/lhf0;

.field public final m2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/l4e0;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    const-string v3, "selectors"

    .line 16
    .line 17
    const-string v5, "getSelectors()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "selectorUiType"

    .line 25
    .line 26
    const-string v6, "getSelectorUiType()Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/model/SelectorUiType;"

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
    sput-object v1, La/l4e0;->o2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/fl70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/l4e0;->n2:La/fl70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/l4e0;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/lhf0;

    .line 14
    .line 15
    const-string v1, "SELECTORS_MODEL_KEY"

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    invoke-direct {v0, v1, v2}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/l4e0;->l2:La/lhf0;

    .line 22
    .line 23
    new-instance v0, La/yzn0;

    .line 24
    .line 25
    const-string v1, "TITLE_ITEM"

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, La/l4e0;->m2:La/yzn0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x5d14c730

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/bw5;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, La/j4e0;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct {v3, p0, v7}, La/j4e0;-><init>(La/l4e0;B)V

    .line 18
    .line 19
    .line 20
    const v4, 0x2806417f

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/j4e0;

    .line 28
    .line 29
    invoke-direct {v4, p0, v0}, La/j4e0;-><init>(La/l4e0;B)V

    .line 30
    .line 31
    .line 32
    const p0, -0x28775dff

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public final P0(Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, La/l4e0;->o2:[La/iiy;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object v1, v0, v1

    .line 12
    .line 13
    iget-object v2, p0, La/l4e0;->k2:La/phf0;

    .line 14
    .line 15
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v3, "SELECTOR_RESULT"

    .line 22
    .line 23
    invoke-direct {v2, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    aget-object p1, v0, p1

    .line 28
    .line 29
    iget-object v0, p0, La/l4e0;->m2:La/yzn0;

    .line 30
    .line 31
    invoke-virtual {v0, p0, p1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, La/i6i0;

    .line 36
    .line 37
    new-instance v0, Lkotlin/Pair;

    .line 38
    .line 39
    const-string v3, "SELECTOR_RESULT_SELECTOR_TYPE"

    .line 40
    .line 41
    invoke-direct {v0, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {v2, v0}, [Lkotlin/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
