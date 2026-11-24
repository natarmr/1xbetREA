.class public final La/ccv0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ccv0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uxs0",
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
.field public static final Q1:La/uxs0;

.field public static final synthetic R1:[La/iiy;

.field public static final S1:Ljava/lang/String;


# instance fields
.field public K1:La/pzi;

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public final N1:Z

.field public final O1:La/khf0;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ccv0;

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
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

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
    sput-object v3, La/ccv0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/uxs0;

    .line 33
    .line 34
    const/16 v2, 0xe

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/uxs0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/ccv0;->Q1:La/uxs0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/ccv0;->S1:Ljava/lang/String;

    .line 46
    .line 47
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
    const-class v0, La/vcv0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/zbv0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, v2}, La/zbv0;-><init>(La/ccv0;B)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0xe

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ccv0;->L1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/bcv0;->a:La/bcv0;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/ccv0;->M1:La/s0r;

    .line 37
    .line 38
    iput-boolean v2, p0, La/ccv0;->N1:Z

    .line 39
    .line 40
    new-instance v0, La/khf0;

    .line 41
    .line 42
    const-string v1, "BUNDLE_PARAMS"

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/ccv0;->O1:La/khf0;

    .line 48
    .line 49
    new-instance v0, La/zbv0;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, p0, v1}, La/zbv0;-><init>(La/ccv0;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/ccv0;->P1:La/n0o0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/ccv0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/ccv0;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/ekd;

    .line 16
    .line 17
    iget-object p1, p1, La/ekd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    iget-object v0, p0, La/ccv0;->P1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/qzi;

    .line 26
    .line 27
    iget-object v0, v0, La/qzi;->k:La/ewk;

    .line 28
    .line 29
    iget-object v0, v0, La/ewk;->a:La/cy40;

    .line 30
    .line 31
    new-instance v1, La/iob0;

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    invoke-direct {v1, p0, v2}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ugd;

    .line 39
    .line 40
    const v2, 0x5decb07a

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, p0}, La/pkd;->k(Landroidx/compose/ui/platform/ComposeView;La/cy40;La/ugd;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ccv0;->P1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qzi;

    .line 8
    .line 9
    iget-object v0, v0, La/qzi;->l:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/pzi;

    .line 16
    .line 17
    iput-object v0, p0, La/ccv0;->K1:La/pzi;

    .line 18
    .line 19
    return-void
.end method

.method public final G0()Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/ccv0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ccv0;->O1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ccv0;->L1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ccv0;->N1:Z

    .line 2
    .line 3
    return p0
.end method
