.class public final La/x3w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r0t;


# instance fields
.field public final a:La/xx;

.field public final b:La/ca6;

.field public final c:La/ca6;

.field public final d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(La/xx;La/ca6;La/ca6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x3w0;->a:La/xx;

    .line 5
    .line 6
    iput-object p2, p0, La/x3w0;->b:La/ca6;

    .line 7
    .line 8
    iput-object p3, p0, La/x3w0;->c:La/ca6;

    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/x3w0;->d:Landroid/os/Handler;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public canChangeViewZone(Z)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/hp2;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/x3w0;->d:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public getModeZone(I)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/n23;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, La/n23;-><init>(Ljava/lang/Object;IB)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/x3w0;->d:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public returnResult()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/apj0;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/x3w0;->d:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
