.class public final La/crk;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/crk;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xak",
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
.field public static final W1:La/xak;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public K1:La/qei;

.field public L1:La/ujd;

.field public M1:La/pru;

.field public N1:La/wdk0;

.field public final O1:Z

.field public final P1:La/khf0;

.field public final Q1:La/n0o0;

.field public final R1:La/a8z;

.field public final S1:La/a8z;

.field public final U1:La/s0r;

.field public final V1:La/qdz;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/crk;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;"

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
    new-array v3, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/crk;->X1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xak;

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/xak;-><init>(B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/crk;->W1:La/xak;

    .line 38
    .line 39
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
    iput-boolean v0, p0, La/crk;->O1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "params_key"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/crk;->P1:La/khf0;

    .line 18
    .line 19
    new-instance v1, La/yqk;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, La/yqk;-><init>(La/crk;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/crk;->Q1:La/n0o0;

    .line 29
    .line 30
    new-instance v0, La/yqk;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {v0, p0, v1}, La/yqk;-><init>(La/crk;B)V

    .line 34
    .line 35
    .line 36
    sget-object v1, La/wez;->b:La/wez;

    .line 37
    .line 38
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/crk;->R1:La/a8z;

    .line 43
    .line 44
    const-class v0, La/atk;

    .line 45
    .line 46
    sget-object v1, La/sre0;->a:La/tre0;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, La/yqk;

    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    invoke-direct {v1, p0, v2}, La/yqk;-><init>(La/crk;B)V

    .line 56
    .line 57
    .line 58
    const/16 v2, 0xe

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/crk;->S1:La/a8z;

    .line 66
    .line 67
    sget-object v0, La/ark;->a:La/ark;

    .line 68
    .line 69
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/crk;->U1:La/s0r;

    .line 74
    .line 75
    new-instance v0, La/qdz;

    .line 76
    .line 77
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/crk;->V1:La/qdz;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/yqk;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/yqk;-><init>(La/crk;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/crk;->N1:La/wdk0;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, La/crk;->O1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "snackbarManager"

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

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/crk;->R1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/rei;

    .line 8
    .line 9
    iget-object v1, v0, La/rei;->G:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/qei;

    .line 16
    .line 17
    iput-object v1, p0, La/crk;->K1:La/qei;

    .line 18
    .line 19
    iget-object v1, v0, La/rei;->u:La/itr;

    .line 20
    .line 21
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/crk;->L1:La/ujd;

    .line 29
    .line 30
    iget-object v1, v0, La/rei;->m:La/pru;

    .line 31
    .line 32
    iput-object v1, p0, La/crk;->M1:La/pru;

    .line 33
    .line 34
    iget-object v0, v0, La/rei;->E:La/wdk0;

    .line 35
    .line 36
    iput-object v0, p0, La/crk;->N1:La/wdk0;

    .line 37
    .line 38
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/crk;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/crk;->U1:La/s0r;

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
    new-instance v2, La/owp0;

    .line 20
    .line 21
    invoke-direct {v2, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, La/yfg;

    .line 25
    .line 26
    const/16 v4, 0x1b

    .line 27
    .line 28
    invoke-direct {v3, p0, v4}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v4, -0x445f0650

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, v2, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/crk;->S1:La/a8z;

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

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/crk;->L1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/ls2;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/zqk;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v3}, La/zqk;-><init>(La/crk;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/crk;->O1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 3

    .line 1
    new-instance v0, La/e9o0;

    .line 2
    .line 3
    iget-object p0, p0, La/crk;->Q1:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/n2o;

    .line 10
    .line 11
    sget-object v1, La/n2o;->d:La/n2o;

    .line 12
    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const p0, 0x7f040ae1

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p0, 0x7f040b5d

    .line 20
    .line 21
    .line 22
    :goto_0
    const v1, 0x7f040ae3

    .line 23
    .line 24
    .line 25
    const/16 v2, 0xc

    .line 26
    .line 27
    invoke-direct {v0, p0, v1, v2}, La/e9o0;-><init>(III)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
