.class public final La/csu0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/csu0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bzs0",
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
.field public static final R1:La/bzs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/g2v;

.field public L1:La/fiu0;

.field public final M1:Z

.field public final N1:La/a8z;

.field public final O1:La/kiu0;

.field public final P1:La/khf0;

.field public final Q1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/csu0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;"

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
    sput-object v1, La/csu0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bzs0;

    .line 33
    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/csu0;->R1:La/bzs0;

    .line 40
    .line 41
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/csu0;->M1:Z

    .line 9
    .line 10
    new-instance v1, La/asu0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, La/asu0;-><init>(La/csu0;B)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/wez;->b:La/wez;

    .line 17
    .line 18
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, La/csu0;->N1:La/a8z;

    .line 23
    .line 24
    new-instance v1, La/asu0;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, La/asu0;-><init>(La/csu0;B)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/cvs0;

    .line 30
    .line 31
    const/16 v3, 0x12

    .line 32
    .line 33
    invoke-direct {v0, p0, v3}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v3, La/cvs0;

    .line 37
    .line 38
    const/16 v4, 0x13

    .line 39
    .line 40
    invoke-direct {v3, v0, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v2, La/esu0;

    .line 48
    .line 49
    sget-object v3, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v3, La/w6u0;

    .line 56
    .line 57
    const/16 v4, 0xa

    .line 58
    .line 59
    invoke-direct {v3, v0, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v4, La/w6u0;

    .line 63
    .line 64
    const/16 v5, 0xb

    .line 65
    .line 66
    invoke-direct {v4, v0, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/csu0;->O1:La/kiu0;

    .line 74
    .line 75
    new-instance v0, La/khf0;

    .line 76
    .line 77
    const-string v1, "VIRTUAL_RECOMMENDED_EVENTS_PARAMS"

    .line 78
    .line 79
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/csu0;->P1:La/khf0;

    .line 83
    .line 84
    sget-object v0, La/bsu0;->a:La/bsu0;

    .line 85
    .line 86
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, La/csu0;->Q1:La/s0r;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/csu0;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/fzi;

    .line 8
    .line 9
    iget-object v1, v0, La/fzi;->a:La/g2v;

    .line 10
    .line 11
    iput-object v1, p0, La/csu0;->K1:La/g2v;

    .line 12
    .line 13
    new-instance v1, La/fiu0;

    .line 14
    .line 15
    const-class v2, La/esu0;

    .line 16
    .line 17
    iget-object v0, v0, La/fzi;->j:La/yxi;

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
    iput-object v1, p0, La/csu0;->L1:La/fiu0;

    .line 27
    .line 28
    return-void
.end method

.method public final D0()V
    .locals 4

    .line 1
    sget-object v0, La/csu0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/csu0;->Q1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v2, La/ggt0;

    .line 20
    .line 21
    const/16 v3, 0xb

    .line 22
    .line 23
    invoke-direct {v2, p0, v3}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v3, -0x1d328167

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/csu0;->M1:Z

    .line 2
    .line 3
    return p0
.end method
