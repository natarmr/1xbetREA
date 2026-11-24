.class public La/dto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jhv0;


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/concurrent/Executor;La/sbe;)V
    .locals 0

    .line 1
    new-instance p0, La/ccf;

    .line 2
    .line 3
    const/16 p1, 0x16

    .line 4
    .line 5
    invoke-direct {p0, p3, p1}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(La/sbe;)V
    .locals 0

    .line 1
    return-void
.end method
