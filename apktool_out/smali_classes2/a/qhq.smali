.class public final La/qhq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5d0;


# instance fields
.field public final a:La/lji0;

.field public final b:La/m5d0;

.field public final c:La/m5d0;

.field public final d:La/m5d0;


# direct methods
.method public constructor <init>(La/lji0;La/m5d0;La/m5d0;La/m5d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qhq;->a:La/lji0;

    .line 5
    .line 6
    iput-object p2, p0, La/qhq;->b:La/m5d0;

    .line 7
    .line 8
    iput-object p3, p0, La/qhq;->c:La/m5d0;

    .line 9
    .line 10
    iput-object p4, p0, La/qhq;->d:La/m5d0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/qhq;->a:La/lji0;

    .line 2
    .line 3
    iget-object v0, v0, La/lji0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/nfq;

    .line 6
    .line 7
    iget-object v1, p0, La/qhq;->b:La/m5d0;

    .line 8
    .line 9
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/xmi0;

    .line 14
    .line 15
    iget-object v2, p0, La/qhq;->c:La/m5d0;

    .line 16
    .line 17
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 22
    .line 23
    iget-object p0, p0, La/qhq;->d:La/m5d0;

    .line 24
    .line 25
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/vmi0;

    .line 30
    .line 31
    new-instance v3, La/ghq;

    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2, p0}, La/ghq;-><init>(La/nfq;La/xmi0;Lkotlin/coroutines/CoroutineContext;La/vmi0;)V

    .line 34
    .line 35
    .line 36
    return-object v3
.end method
