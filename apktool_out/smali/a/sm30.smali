.class public final La/sm30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nfu0;


# instance fields
.field public final synthetic b:La/xm30;


# direct methods
.method public constructor <init>(La/xm30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sm30;->b:La/xm30;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/qfu0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object p0, p0, La/sm30;->b:La/xm30;

    .line 2
    .line 3
    iget-object v2, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, La/xm30;->m2:La/fck0;

    .line 8
    .line 9
    iget-object v0, v1, La/fck0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v6, v0

    .line 12
    check-cast v6, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    new-instance v0, La/tx9;

    .line 21
    .line 22
    const/4 v5, 0x3

    .line 23
    invoke-direct/range {v0 .. v5}, La/tx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, La/xm30;->I2:Z

    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object p0, p0, La/sm30;->b:La/xm30;

    .line 2
    .line 3
    iget-object v0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, La/xm30;->U0(II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, La/sm30;->b:La/xm30;

    .line 2
    .line 3
    iget-object p0, p0, La/mm30;->i1:La/ylo;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/ylo;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
