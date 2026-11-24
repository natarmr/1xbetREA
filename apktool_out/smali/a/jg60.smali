.class public final La/jg60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:La/n0o0;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jg60;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, La/pu50;

    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/jg60;->b:La/n0o0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/clz;La/eg60;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, La/glz;->i:La/lkz;

    .line 12
    .line 13
    sget-object v2, La/lkz;->a:La/lkz;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, La/fg60;

    .line 19
    .line 20
    invoke-direct {v1, p1, p2}, La/fg60;-><init>(La/clz;La/eg60;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/dg60;

    .line 24
    .line 25
    invoke-direct {p1, p2, v1}, La/dg60;-><init>(La/eg60;La/fg60;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p2, La/eg60;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v1}, La/dg60;->j(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v2, v2, La/hg60;->c:La/ye50;

    .line 42
    .line 43
    invoke-static {v2, p1}, La/ye50;->a(La/ye50;La/af50;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, La/lz2;

    .line 47
    .line 48
    invoke-direct {v2, p1, p0, v0}, La/lz2;-><init>(La/dg60;La/jg60;La/glz;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, La/glz;->a(La/blz;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, La/gg60;

    .line 55
    .line 56
    invoke-direct {p0, v0, v2, v1}, La/gg60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p2, La/eg60;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b(La/eg60;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fg60;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p1}, La/fg60;-><init>(La/clz;La/eg60;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/dg60;

    .line 11
    .line 12
    invoke-direct {v1, p1, v0}, La/dg60;-><init>(La/eg60;La/fg60;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, La/eg60;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/hg60;->c:La/ye50;

    .line 25
    .line 26
    invoke-static {p0, v1}, La/ye50;->a(La/ye50;La/af50;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c()La/hg60;
    .locals 0

    .line 1
    iget-object p0, p0, La/jg60;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hg60;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/hg60;->c:La/ye50;

    .line 9
    .line 10
    new-instance v1, La/ag60;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p1, v2}, La/ag60;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v0, v1, v3}, La/ye50;->c(La/ag60;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/hg60;->c:La/ye50;

    .line 25
    .line 26
    new-instance v0, La/ag60;

    .line 27
    .line 28
    const v1, 0xf4240

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p1, v1}, La/ag60;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v2}, La/ye50;->c(La/ag60;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
