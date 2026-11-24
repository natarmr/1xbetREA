.class public final La/nta0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/nta0;",
        "La/iw5;",
        "<init>",
        "()V",
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
.field public static final synthetic m2:I


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mta0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/mta0;-><init>(La/nta0;B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wez;->b:La/wez;

    .line 11
    .line 12
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/nta0;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/ota0;

    .line 19
    .line 20
    sget-object v1, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/mta0;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/mta0;-><init>(La/nta0;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/nta0;->l2:La/a8z;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, -0x41abff1f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/nta0;->l2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/k3t0;

    .line 14
    .line 15
    check-cast v0, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/bw5;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v2, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, La/ri1;

    .line 29
    .line 30
    const/16 v4, 0xb

    .line 31
    .line 32
    invoke-direct {v3, v0, p0, v4}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    const p0, 0x4bdb39d0    # 2.8734368E7f

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/16 v6, 0xe

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nta0;->l2:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/k3t0;

    .line 11
    .line 12
    sget-object p1, La/dqa0;->a:La/dqa0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
