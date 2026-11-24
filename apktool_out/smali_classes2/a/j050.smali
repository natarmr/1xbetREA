.class public final La/j050;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5a;
.implements La/nvu0;


# instance fields
.field public final a:La/n5a;

.field public final synthetic b:La/k050;


# direct methods
.method public constructor <init>(La/k050;La/n5a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j050;->b:La/k050;

    .line 5
    .line 6
    iput-object p2, p0, La/j050;->a:La/n5a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/wvh0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/n5a;->a(La/wvh0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/Object;La/xdr;)La/pfw;
    .locals 1

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    new-instance p2, La/p0z;

    .line 4
    .line 5
    iget-object v0, p0, La/j050;->b:La/k050;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, La/p0z;-><init>(La/k050;La/j050;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La/n5a;->F(Ljava/lang/Object;La/xdr;)La/pfw;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, La/k050;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 2
    .line 3
    iget-object p0, p0, La/n5a;->e:Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Ljava/lang/Object;La/xdr;)V
    .locals 3

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    sget-object p2, La/k050;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, La/j050;->b:La/k050;

    .line 7
    .line 8
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, La/b530;

    .line 12
    .line 13
    invoke-direct {p2, v1, p0}, La/b530;-><init>(La/k050;La/j050;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 17
    .line 18
    iget v0, p0, La/qvk;->c:I

    .line 19
    .line 20
    new-instance v1, La/sd8;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, p2, v2}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v0, v1}, La/n5a;->C(Ljava/lang/Object;ILa/xdr;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final w(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/j050;->a:La/n5a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/n5a;->w(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
