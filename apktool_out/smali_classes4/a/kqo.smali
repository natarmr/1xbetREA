.class public final La/kqo;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kqo;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek",
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
.field public static final P1:La/pek;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/cgx0;

.field public final M1:La/n0o0;

.field public final N1:La/a8z;

.field public final O1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kqo;

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
    const-string v3, "line"

    .line 16
    .line 17
    const-string v5, "getLine()Z"

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
    sput-object v1, La/kqo;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/kqo;->P1:La/pek;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/jqo;->a:La/jqo;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/kqo;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/cgx0;

    .line 16
    .line 17
    const-string v1, "OPEN_LINE"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/kqo;->L1:La/cgx0;

    .line 23
    .line 24
    new-instance v0, La/iqo;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/iqo;-><init>(La/kqo;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/kqo;->M1:La/n0o0;

    .line 35
    .line 36
    const-class v0, La/tqo;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/iqo;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, v2}, La/iqo;-><init>(La/kqo;B)V

    .line 48
    .line 49
    .line 50
    const/16 v3, 0xe

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/kqo;->N1:La/a8z;

    .line 58
    .line 59
    iput-boolean v2, p0, La/kqo;->O1:Z

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/kqo;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/kqo;->K1:La/s0r;

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
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/f5o;

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    invoke-direct {v0, p0, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/ugd;

    .line 26
    .line 27
    const v2, 0x6ed4095c

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v1, v2, v3, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, La/shd;

    .line 35
    .line 36
    const/16 v2, 0xf

    .line 37
    .line 38
    invoke-direct {v0, v2}, La/shd;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0, v1}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, La/iqo;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-direct {p1, p0, v0}, La/iqo;-><init>(La/kqo;B)V

    .line 48
    .line 49
    .line 50
    const-string v0, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 51
    .line 52
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final G0()La/dfi;
    .locals 0

    .line 1
    iget-object p0, p0, La/kqo;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dfi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/kqo;->O1:Z

    .line 2
    .line 3
    return p0
.end method
