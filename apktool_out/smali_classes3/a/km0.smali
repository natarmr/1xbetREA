.class public final La/km0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/dn0;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Z

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(La/dn0;Ljava/lang/String;ZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/km0;->j:La/dn0;

    .line 2
    .line 3
    iput-object p2, p0, La/km0;->k:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, La/km0;->l:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/km0;->m:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/km0;

    .line 2
    .line 3
    iget-boolean v3, p0, La/km0;->l:Z

    .line 4
    .line 5
    iget-boolean v4, p0, La/km0;->m:Z

    .line 6
    .line 7
    iget-object v1, p0, La/km0;->j:La/dn0;

    .line 8
    .line 9
    iget-object v2, p0, La/km0;->k:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, La/km0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/km0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/km0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/km0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/km0;->i:Z

    .line 4
    .line 5
    iget-object v2, p0, La/km0;->j:La/dn0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v3, p0, La/km0;->i:Z

    .line 27
    .line 28
    iget-object p1, p0, La/km0;->k:Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v1, p0, La/km0;->l:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/km0;->m:Z

    .line 33
    .line 34
    invoke-virtual {v2, p0, p1, v1, v4}, La/dn0;->m(La/zje;Ljava/lang/String;ZZ)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-ne p1, v0, :cond_2

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    iget-object p0, v2, La/dn0;->c:La/xk0;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, La/xk0;->c:Z

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, La/xk0;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/xk0;->c()V

    .line 60
    .line 61
    .line 62
    iput-boolean v3, p0, La/xk0;->a:Z

    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0
.end method
