.class public final La/ndu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/wdu;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(La/wdu;ZLjava/lang/String;ZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ndu;->j:La/wdu;

    .line 2
    .line 3
    iput-boolean p2, p0, La/ndu;->k:Z

    .line 4
    .line 5
    iput-object p3, p0, La/ndu;->l:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, La/ndu;->m:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/ndu;->n:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/ndu;

    .line 2
    .line 3
    iget-boolean v4, p0, La/ndu;->m:Z

    .line 4
    .line 5
    iget-boolean v5, p0, La/ndu;->n:Z

    .line 6
    .line 7
    iget-object v1, p0, La/ndu;->j:La/wdu;

    .line 8
    .line 9
    iget-boolean v2, p0, La/ndu;->k:Z

    .line 10
    .line 11
    iget-object v3, p0, La/ndu;->l:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/ndu;-><init>(La/wdu;ZLjava/lang/String;ZZLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ndu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ndu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ndu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/ndu;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, La/j0g0;

    .line 14
    .line 15
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-boolean v2, p0, La/ndu;->i:Z

    .line 29
    .line 30
    iget-object v1, p0, La/ndu;->j:La/wdu;

    .line 31
    .line 32
    iget-boolean v2, p0, La/ndu;->k:Z

    .line 33
    .line 34
    iget-object v3, p0, La/ndu;->l:Ljava/lang/String;

    .line 35
    .line 36
    iget-boolean v4, p0, La/ndu;->m:Z

    .line 37
    .line 38
    iget-boolean v5, p0, La/ndu;->n:Z

    .line 39
    .line 40
    move-object v6, p0

    .line 41
    invoke-virtual/range {v1 .. v6}, La/wdu;->D(ZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-ne p0, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    new-instance p1, La/j0g0;

    .line 49
    .line 50
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method
