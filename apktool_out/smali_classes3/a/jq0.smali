.class public final La/jq0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jq0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final P1:La/qek0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public final M1:La/r34;

.field public N1:La/l7i;

.field public final O1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jq0;

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
    const-string v3, "partitionId"

    .line 16
    .line 17
    const-string v5, "getPartitionId()J"

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
    sput-object v1, La/jq0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/qek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/jq0;->P1:La/qek0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

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
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const v2, 0x7f040b5d

    .line 13
    .line 14
    .line 15
    const/16 v3, 0xc

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/jq0;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/iq0;->a:La/iq0;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/jq0;->L1:La/s0r;

    .line 29
    .line 30
    new-instance v0, La/r34;

    .line 31
    .line 32
    const-string v1, "PARTITION_ID"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/jq0;->M1:La/r34;

    .line 38
    .line 39
    new-instance v0, La/nc;

    .line 40
    .line 41
    invoke-direct {v0, p0, v3}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/f80;

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    sget-object v2, La/wez;->b:La/wez;

    .line 51
    .line 52
    new-instance v3, La/f80;

    .line 53
    .line 54
    const/4 v4, 0x4

    .line 55
    invoke-direct {v3, v1, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-class v2, La/gs0;

    .line 63
    .line 64
    sget-object v3, La/sre0;->a:La/tre0;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v3, La/k8;

    .line 71
    .line 72
    const/16 v4, 0x18

    .line 73
    .line 74
    invoke-direct {v3, v1, v4}, La/k8;-><init>(La/a8z;B)V

    .line 75
    .line 76
    .line 77
    new-instance v4, La/k8;

    .line 78
    .line 79
    const/16 v5, 0x19

    .line 80
    .line 81
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/jq0;->O1:La/kiu0;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/hq0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/hq0;-><init>(La/jq0;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "SELECT_SORT_OPTION_REQUEST_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, La/t1;

    .line 25
    .line 26
    const/16 v3, 0x16

    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1, v2}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/jq0;->Q1:[La/iiy;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    aget-object p1, p1, v1

    .line 38
    .line 39
    iget-object v2, p0, La/jq0;->L1:La/s0r;

    .line 40
    .line 41
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p1, La/aid;

    .line 49
    .line 50
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 51
    .line 52
    new-instance v2, La/owp0;

    .line 53
    .line 54
    invoke-direct {v2, p0}, La/owp0;-><init>(La/clz;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, La/hq0;

    .line 58
    .line 59
    invoke-direct {v3, p0, v1}, La/hq0;-><init>(La/jq0;B)V

    .line 60
    .line 61
    .line 62
    new-instance p0, La/ugd;

    .line 63
    .line 64
    const v1, -0x40823c51

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v1, v0, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    sget-object v0, La/uo0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, La/jq0;->Q1:[La/iiy;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, La/jq0;->M1:La/r34;

    .line 9
    .line 10
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    new-instance v2, La/hgh0;

    .line 19
    .line 20
    sget-object v3, La/uzb0;->a:La/uzb0;

    .line 21
    .line 22
    invoke-static {v3}, La/r7x;->B(La/uzb0;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v2, v3}, La/hgh0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/uo0;->b(JLa/hgh0;Landroid/app/Application;)La/n7i;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/n7i;->W:La/n5d0;

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/l7i;

    .line 51
    .line 52
    iput-object v0, p0, La/jq0;->N1:La/l7i;

    .line 53
    .line 54
    return-void
.end method

.method public final G0()La/gs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jq0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gs0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jq0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
