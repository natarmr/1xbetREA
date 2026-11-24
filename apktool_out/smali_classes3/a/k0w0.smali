.class public final La/k0w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(La/i1w0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    return-void
.end method

.method public static j(La/k0w0;La/jgc;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/onu0;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, La/onu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance p2, La/c1w0;

    .line 12
    .line 13
    invoke-direct {p2, p1, v0}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/g1w0;)La/okt0;
    .locals 2

    .line 1
    new-instance v0, La/c8d;

    .line 2
    .line 3
    sget-object v1, La/y7d;->a:La/v7d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    new-instance p0, La/okt0;

    .line 14
    .line 15
    invoke-direct {p0, v0}, La/okt0;-><init>(La/c8d;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final b(La/g1w0;)La/ikt0;
    .locals 2

    .line 1
    new-instance v0, La/c8d;

    .line 2
    .line 3
    sget-object v1, La/y7d;->a:La/v7d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    new-instance p0, La/ikt0;

    .line 14
    .line 15
    invoke-direct {p0, v0}, La/ikt0;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final c(La/m7h0;)V
    .locals 1

    .line 1
    new-instance v0, La/q0w0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/q0w0;-><init>(La/m7h0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    sget-object v0, La/r0w0;->a:La/r0w0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V
    .locals 1

    .line 1
    new-instance v0, La/s0w0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/s0w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    sget-object v0, La/m0w0;->a:La/m0w0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    sget-object v0, La/p0w0;->a:La/p0w0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(La/m7h0;)La/ikt0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La/e1w0;

    .line 9
    .line 10
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 11
    .line 12
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, La/w0w0;

    .line 21
    .line 22
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final varargs i([La/m7h0;)V
    .locals 1

    .line 1
    new-instance v0, La/x0w0;

    .line 2
    .line 3
    invoke-static {p1}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, La/x0w0;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final k(La/m7h0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/d1w0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/d1w0;-><init>(La/m7h0;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V
    .locals 1

    .line 1
    new-instance v0, La/e1w0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;
    .locals 1

    .line 1
    new-instance v0, La/f1w0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/f1w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
