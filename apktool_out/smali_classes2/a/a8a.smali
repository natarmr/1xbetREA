.class public final La/a8a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iu5;


# instance fields
.field public final synthetic a:La/b8a;


# direct methods
.method public constructor <init>(La/b8a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a8a;->a:La/b8a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(La/lu5;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/a8a;->a:La/b8a;

    .line 2
    .line 3
    iget-object v0, v0, La/b8a;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/a8a;->a:La/b8a;

    .line 9
    .line 10
    iget-object v0, v0, La/b8a;->i:La/kb6;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-boolean v1, v0, La/kb6;->b:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/kb6;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    iget-object v0, p0, La/a8a;->a:La/b8a;

    .line 25
    .line 26
    iget-object v0, v0, La/b8a;->j:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v1, La/fy2;

    .line 29
    .line 30
    const/16 v2, 0x16

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, v2}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p0
.end method
