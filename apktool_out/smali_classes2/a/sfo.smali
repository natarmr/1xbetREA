.class public final La/sfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zv00;


# instance fields
.field public a:La/xen0;

.field public b:Ljava/util/concurrent/LinkedBlockingQueue;


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, La/yen0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, La/sfo;->a:La/xen0;

    .line 10
    .line 11
    iput-object v1, v0, La/yen0;->a:La/xen0;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/sfo;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 21
    .line 22
    invoke-interface {p0, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sfo;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final h(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sfo;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final k(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sfo;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final o(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sfo;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final q(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sfo;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
