.class public final La/m4p;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m4p;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bek",
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
.field public static final S1:La/bek;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/khf0;

.field public final M1:La/s0r;

.field public final N1:La/n0o0;

.field public O1:La/sgi;

.field public P1:La/wdk0;

.field public Q1:La/ujd;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/m4p;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;"

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
    sput-object v1, La/m4p;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/m4p;->S1:La/bek;

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
    iput-boolean v0, p0, La/m4p;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "category_state_param_key"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/m4p;->L1:La/khf0;

    .line 18
    .line 19
    sget-object v1, La/j4p;->a:La/j4p;

    .line 20
    .line 21
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, La/m4p;->M1:La/s0r;

    .line 26
    .line 27
    new-instance v1, La/i4p;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, p0, v2}, La/i4p;-><init>(La/m4p;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, La/m4p;->N1:La/n0o0;

    .line 38
    .line 39
    const-class v1, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 40
    .line 41
    sget-object v2, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, La/i4p;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0}, La/i4p;-><init>(La/m4p;B)V

    .line 50
    .line 51
    .line 52
    const/16 v0, 0xe

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {p0, v1, v3, v2, v0}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/m4p;->R1:La/a8z;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/i4p;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/i4p;-><init>(La/m4p;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/m4p;->U1:[La/iiy;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    aget-object p1, p1, v0

    .line 14
    .line 15
    iget-object v1, p0, La/m4p;->M1:La/s0r;

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
    new-instance v1, La/f5o;

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v2, 0x5779e801

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/m4p;->N1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tgi;

    .line 8
    .line 9
    iget-object v1, v0, La/tgi;->y:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/sgi;

    .line 16
    .line 17
    iput-object v1, p0, La/m4p;->O1:La/sgi;

    .line 18
    .line 19
    iget-object v1, v0, La/tgi;->t:La/wdk0;

    .line 20
    .line 21
    iput-object v1, p0, La/m4p;->P1:La/wdk0;

    .line 22
    .line 23
    iget-object v0, v0, La/tgi;->g:La/itr;

    .line 24
    .line 25
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/m4p;->Q1:La/ujd;

    .line 33
    .line 34
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m4p;->R1:La/a8z;

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

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/m4p;->P1:La/wdk0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, La/m4p;->K1:Z

    .line 9
    .line 10
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "snackbarManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/m4p;->Q1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    sget-object v1, La/m4p;->U1:[La/iiy;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    iget-object v2, p0, La/m4p;->L1:La/khf0;

    .line 14
    .line 15
    invoke-virtual {v2, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 20
    .line 21
    invoke-static {v1}, Lorg/xplatform/favorites/impl/presentation/category/b;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)La/d5p;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    new-instance v1, La/aq2;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    new-instance v1, La/cq2;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    :goto_0
    new-instance v2, La/yhn;

    .line 50
    .line 51
    const/16 v3, 0x1b

    .line 52
    .line 53
    invoke-direct {v2, p0, v3}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const-string p0, "gameCardFragmentDelegate"

    .line 61
    .line 62
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/m4p;->K1:Z

    .line 2
    .line 3
    return p0
.end method
