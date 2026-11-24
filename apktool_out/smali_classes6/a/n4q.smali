.class public final La/n4q;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n4q;",
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
.field public static final R1:La/bek;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/phf0;

.field public final M1:La/s0r;

.field public N1:La/fiu0;

.field public O1:La/ii;

.field public final P1:La/a8z;

.field public final Q1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/n4q;

    .line 4
    .line 5
    const-string v2, "playerId"

    .line 6
    .line 7
    const-string v3, "getPlayerId()Ljava/lang/String;"

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
    sput-object v1, La/n4q;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/n4q;->R1:La/bek;

    .line 38
    .line 39
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
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/n4q;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/phf0;

    .line 12
    .line 13
    const-string v1, "PLAYER_ID_BUNDLE_KEY"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/n4q;->L1:La/phf0;

    .line 19
    .line 20
    sget-object v0, La/m4q;->a:La/m4q;

    .line 21
    .line 22
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/n4q;->M1:La/s0r;

    .line 27
    .line 28
    const-class v0, La/y4q;

    .line 29
    .line 30
    sget-object v1, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La/k4q;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v1, p0, v2}, La/k4q;-><init>(La/n4q;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/n4q;->P1:La/a8z;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, La/n4q;->Q1:Z

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/n4q;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/n4q;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/owp0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/l4q;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, La/l4q;-><init>(La/n4q;B)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/ugd;

    .line 31
    .line 32
    const v4, 0x54ea2f2d

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v4, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/shd;

    .line 39
    .line 40
    const/16 v4, 0xe

    .line 41
    .line 42
    invoke-direct {v2, v4}, La/shd;-><init>(B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1, v2, v3}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, La/l4q;

    .line 49
    .line 50
    invoke-direct {p1, p0, v0}, La/l4q;-><init>(La/n4q;B)V

    .line 51
    .line 52
    .line 53
    const-string v1, "REQUEST_MATCH_TYPES_DIALOG_KEY"

    .line 54
    .line 55
    invoke-static {p0, v1, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, La/l4q;

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-direct {p1, p0, v1}, La/l4q;-><init>(La/n4q;B)V

    .line 62
    .line 63
    .line 64
    const-string v1, "REQUEST_SEASONS_DIALOG_KEY"

    .line 65
    .line 66
    invoke-static {p0, v1, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, La/k4q;

    .line 70
    .line 71
    invoke-direct {p1, p0, v0}, La/k4q;-><init>(La/n4q;B)V

    .line 72
    .line 73
    .line 74
    const-string v0, "REQUEST_RESET_DIALOG_KEY"

    .line 75
    .line 76
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final C0()V
    .locals 5

    .line 1
    sget-object v0, La/d0q0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, La/n4q;->S1:[La/iiy;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v2, v0, v1

    .line 7
    .line 8
    iget-object v3, p0, La/n4q;->L1:La/phf0;

    .line 9
    .line 10
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v2, v4}, La/d0q0;->a(Ljava/lang/String;La/cb50;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    aget-object v0, v0, v1

    .line 23
    .line 24
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v2, p0, v0, v1}, La/d0q0;->b(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;La/i1w0;)La/xwi;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, La/xwi;->a()La/fiu0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, La/n4q;->N1:La/fiu0;

    .line 41
    .line 42
    iget-object v0, v0, La/xwi;->k:La/ii;

    .line 43
    .line 44
    iput-object v0, p0, La/n4q;->O1:La/ii;

    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n4q;->P1:La/a8z;

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
    iget-boolean p0, p0, La/n4q;->Q1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n4q;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
