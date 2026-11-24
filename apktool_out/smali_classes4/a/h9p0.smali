.class public final La/h9p0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/h9p0;",
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
.field public static final V1:La/y2m0;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:Z

.field public M1:La/fiu0;

.field public N1:La/ujd;

.field public O1:La/wdk0;

.field public P1:La/poq0;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/qdz;

.field public final U1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/h9p0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;"

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
    sput-object v1, La/h9p0;->W1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/y2m0;

    .line 21
    .line 22
    const/16 v1, 0xe

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/h9p0;->V1:La/y2m0;

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
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/h9p0;->K1:La/e9o0;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, La/h9p0;->L1:Z

    .line 24
    .line 25
    const-class v1, La/wbp0;

    .line 26
    .line 27
    sget-object v2, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, La/g9p0;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, p0, v3}, La/g9p0;-><init>(La/h9p0;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, La/h9p0;->Q1:La/a8z;

    .line 44
    .line 45
    new-instance v1, La/g9p0;

    .line 46
    .line 47
    invoke-direct {v1, p0, v0}, La/g9p0;-><init>(La/h9p0;B)V

    .line 48
    .line 49
    .line 50
    sget-object v0, La/wez;->b:La/wez;

    .line 51
    .line 52
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/h9p0;->R1:La/a8z;

    .line 57
    .line 58
    new-instance v0, La/qdz;

    .line 59
    .line 60
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/h9p0;->S1:La/qdz;

    .line 64
    .line 65
    new-instance v0, La/khf0;

    .line 66
    .line 67
    const-string v1, "TEAM_DETAILS_PARAMS"

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/h9p0;->U1:La/khf0;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/f9p0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/f9p0;-><init>(La/h9p0;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "TEAM_DETAILS_DISCIPLINE_DIALOG_RESULT_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/h9p0;->R1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/kwi;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/wbp0;

    .line 12
    .line 13
    iget-object v3, v0, La/kwi;->B:La/xvi;

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
    iput-object v1, p0, La/h9p0;->M1:La/fiu0;

    .line 23
    .line 24
    iget-object v1, v0, La/kwi;->o:La/itr;

    .line 25
    .line 26
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, La/h9p0;->N1:La/ujd;

    .line 34
    .line 35
    iget-object v1, v0, La/kwi;->A:La/wdk0;

    .line 36
    .line 37
    iput-object v1, p0, La/h9p0;->O1:La/wdk0;

    .line 38
    .line 39
    iget-object v0, v0, La/kwi;->y:La/poq0;

    .line 40
    .line 41
    iput-object v0, p0, La/h9p0;->P1:La/poq0;

    .line 42
    .line 43
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9p0;->Q1:La/a8z;

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
    iget-object p2, p0, La/h9p0;->O1:La/wdk0;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-boolean p3, p0, La/h9p0;->L1:Z

    .line 20
    .line 21
    invoke-static {p2, p0, p3}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 22
    .line 23
    .line 24
    new-instance p2, La/owp0;

    .line 25
    .line 26
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 27
    .line 28
    .line 29
    new-instance p3, La/l7p0;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {p3, p0, v1}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v2, 0x7b1463e2

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v2, v1, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    const-string p0, "snackbarManager"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/h9p0;->N1:La/ujd;

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
    new-instance v2, La/f9p0;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p0, v3}, La/f9p0;-><init>(La/h9p0;B)V

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
    iget-boolean p0, p0, La/h9p0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h9p0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
