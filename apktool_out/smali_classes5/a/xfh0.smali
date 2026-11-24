.class public final La/xfh0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xfh0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final V1:La/cge0;

.field public static final synthetic W1:[La/iiy;

.field public static final X1:Ljava/lang/String;


# instance fields
.field public K1:La/oll0;

.field public L1:La/ujd;

.field public M1:La/rsi;

.field public N1:La/wdk0;

.field public final O1:Z

.field public final P1:La/s0r;

.field public final Q1:La/a8z;

.field public final R1:La/n0o0;

.field public final S1:La/zz2;

.field public final U1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/xfh0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;"

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
    const-string v3, "eventId"

    .line 16
    .line 17
    const-string v5, "getEventId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "searchEntryPointOrdinal"

    .line 25
    .line 26
    const-string v6, "getSearchEntryPointOrdinal()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v5, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v5, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v5, v0

    .line 41
    .line 42
    sput-object v5, La/xfh0;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/cge0;

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    invoke-direct {v0, v2}, La/cge0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/xfh0;->V1:La/cge0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, La/xfh0;->X1:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d008b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/xfh0;->O1:Z

    .line 9
    .line 10
    sget-object v1, La/wfh0;->a:La/wfh0;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/xfh0;->P1:La/s0r;

    .line 17
    .line 18
    const-class v1, La/sih0;

    .line 19
    .line 20
    sget-object v2, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, La/ufh0;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, p0, v3}, La/ufh0;-><init>(La/xfh0;B)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0xe

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static {p0, v1, v4, v2, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, La/xfh0;->Q1:La/a8z;

    .line 40
    .line 41
    new-instance v1, La/ufh0;

    .line 42
    .line 43
    invoke-direct {v1, p0, v0}, La/ufh0;-><init>(La/xfh0;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/xfh0;->R1:La/n0o0;

    .line 51
    .line 52
    new-instance v0, La/zz2;

    .line 53
    .line 54
    const-string v1, "SEARCH_FRAGMENT_EVENT_ID_BUNDLE_KEY"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/xfh0;->S1:La/zz2;

    .line 60
    .line 61
    new-instance v0, La/zz2;

    .line 62
    .line 63
    const-string v1, "SEARCH_FRAGMENT_ENTRY_POINT_BUNDLE_KEY"

    .line 64
    .line 65
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, La/xfh0;->U1:La/zz2;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/xfh0;->L1:La/ujd;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v0, La/yr2;

    .line 6
    .line 7
    sget-object v1, La/xfh0;->W1:[La/iiy;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    iget-object v4, p0, La/xfh0;->S1:La/zz2;

    .line 13
    .line 14
    invoke-virtual {v4, p0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v0, v3}, La/ds2;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, La/vfh0;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, p0, v4}, La/vfh0;-><init>(La/xfh0;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0, v0, v3}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/xfh0;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, La/oeh0;->a:La/oeh0;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, La/xfh0;->P1:La/s0r;

    .line 44
    .line 45
    aget-object v0, v1, v4

    .line 46
    .line 47
    invoke-virtual {p1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast p1, La/ekd;

    .line 55
    .line 56
    iget-object p1, p1, La/ekd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 57
    .line 58
    iget-object v0, p0, La/xfh0;->R1:La/n0o0;

    .line 59
    .line 60
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/ssi;

    .line 65
    .line 66
    iget-object v0, v0, La/ssi;->t:La/ewk;

    .line 67
    .line 68
    iget-object v0, v0, La/ewk;->a:La/cy40;

    .line 69
    .line 70
    new-instance v1, La/iob0;

    .line 71
    .line 72
    const/16 v3, 0x8

    .line 73
    .line 74
    invoke-direct {v1, p0, v3}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    new-instance p0, La/ugd;

    .line 78
    .line 79
    const v3, -0x77fb3a79

    .line 80
    .line 81
    .line 82
    invoke-direct {p0, v3, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v0, p0}, La/pkd;->k(Landroidx/compose/ui/platform/ComposeView;La/cy40;La/ugd;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    const-string p0, "altDesignGameCardFragmentDelegate"

    .line 90
    .line 91
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    throw p0
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/xfh0;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ssi;

    .line 8
    .line 9
    iget-object v1, v0, La/ssi;->a:La/zx10;

    .line 10
    .line 11
    iget-object v1, v1, La/zx10;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/g45;

    .line 14
    .line 15
    invoke-virtual {v1}, La/g45;->K()La/oll0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, La/xfh0;->K1:La/oll0;

    .line 20
    .line 21
    iget-object v1, v0, La/ssi;->b:La/itr;

    .line 22
    .line 23
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, La/xfh0;->L1:La/ujd;

    .line 31
    .line 32
    iget-object v1, v0, La/ssi;->w:La/n5d0;

    .line 33
    .line 34
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/rsi;

    .line 39
    .line 40
    iput-object v1, p0, La/xfh0;->M1:La/rsi;

    .line 41
    .line 42
    iget-object v0, v0, La/ssi;->s:La/wdk0;

    .line 43
    .line 44
    iput-object v0, p0, La/xfh0;->N1:La/wdk0;

    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xfh0;->Q1:La/a8z;

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

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/xfh0;->L1:La/ujd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, La/yx5;->Z()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "altDesignGameCardFragmentDelegate"

    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/xfh0;->N1:La/wdk0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p0, La/xfh0;->O1:Z

    .line 12
    .line 13
    invoke-static {p1, p0, p2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "snackbarManager"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/xfh0;->O1:Z

    .line 2
    .line 3
    return p0
.end method
