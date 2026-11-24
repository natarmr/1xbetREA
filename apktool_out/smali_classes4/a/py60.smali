.class public final La/py60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/py60;",
        "La/yx5;",
        "<init>",
        "()V",
        "games_list"
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
.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public N1:La/fiu0;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/py60;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/py60;->P1:[La/iiy;

    .line 19
    .line 20
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
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/py60;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/oy60;->a:La/oy60;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/py60;->L1:La/s0r;

    .line 24
    .line 25
    new-instance v0, La/ny60;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, La/ny60;-><init>(La/py60;B)V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/wez;->b:La/wez;

    .line 32
    .line 33
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/py60;->M1:La/a8z;

    .line 38
    .line 39
    const-class v0, La/vy60;

    .line 40
    .line 41
    sget-object v1, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, La/ny60;

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    invoke-direct {v1, p0, v2}, La/ny60;-><init>(La/py60;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/py60;->O1:La/a8z;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/ny60;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/ny60;-><init>(La/py60;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/py60;->P1:[La/iiy;

    .line 11
    .line 12
    aget-object v1, p1, v0

    .line 13
    .line 14
    iget-object v2, p0, La/py60;->L1:La/s0r;

    .line 15
    .line 16
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v1, La/aid;

    .line 24
    .line 25
    iget-object v1, v1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 29
    .line 30
    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast p1, La/aid;

    .line 41
    .line 42
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 43
    .line 44
    sget-object v0, La/qek0;->h:La/qek0;

    .line 45
    .line 46
    new-instance v1, La/ds60;

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    invoke-direct {v1, p0, v2}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    new-instance p0, La/ugd;

    .line 53
    .line 54
    const v2, 0x14f565cb

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/shd;

    .line 61
    .line 62
    const/16 v2, 0xe

    .line 63
    .line 64
    invoke-direct {v1, v2}, La/shd;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/py60;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ehi;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/vy60;

    .line 12
    .line 13
    iget-object v0, v0, La/ehi;->l:La/ugi;

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
    iput-object v1, p0, La/py60;->N1:La/fiu0;

    .line 23
    .line 24
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/py60;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
