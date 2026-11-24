.class public final synthetic La/k3k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m3k;

.field public final synthetic c:Ljava/lang/Runnable;

.field public final synthetic d:La/prc;


# direct methods
.method public synthetic constructor <init>(La/m3k;Ljava/lang/Runnable;La/prc;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/k3k;->a:B

    iput-object p1, p0, La/k3k;->b:La/m3k;

    iput-object p2, p0, La/k3k;->c:Ljava/lang/Runnable;

    iput-object p3, p0, La/k3k;->d:La/prc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/k3k;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/k3k;->d:La/prc;

    .line 4
    .line 5
    iget-object v2, p0, La/k3k;->c:Ljava/lang/Runnable;

    .line 6
    .line 7
    iget-object p0, p0, La/k3k;->b:La/m3k;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/m3k;->a:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    new-instance v0, La/i3k;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v2, v1, v3}, La/i3k;-><init>(Ljava/lang/Runnable;La/prc;B)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object p0, p0, La/m3k;->a:Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    new-instance v0, La/i3k;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v0, v2, v1, v3}, La/i3k;-><init>(Ljava/lang/Runnable;La/prc;B)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object p0, p0, La/m3k;->a:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    new-instance v0, La/i3k;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {v0, v2, v1, v3}, La/i3k;-><init>(Ljava/lang/Runnable;La/prc;B)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
