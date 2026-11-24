.class public final La/v1c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ehf0;

.field public final synthetic l:La/mlr;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/ehf0;La/mlr;Ljava/lang/String;ZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v1c;->k:La/ehf0;

    .line 2
    .line 3
    iput-object p2, p0, La/v1c;->l:La/mlr;

    .line 4
    .line 5
    iput-object p3, p0, La/v1c;->m:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, La/v1c;->n:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/v1c;->o:Z

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
    new-instance v0, La/v1c;

    .line 2
    .line 3
    iget-boolean v4, p0, La/v1c;->n:Z

    .line 4
    .line 5
    iget-boolean v5, p0, La/v1c;->o:Z

    .line 6
    .line 7
    iget-object v1, p0, La/v1c;->k:La/ehf0;

    .line 8
    .line 9
    iget-object v2, p0, La/v1c;->l:La/mlr;

    .line 10
    .line 11
    iget-object v3, p0, La/v1c;->m:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/v1c;-><init>(La/ehf0;La/mlr;Ljava/lang/String;ZZLa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/v1c;->j:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/v1c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v1c;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v1c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/v1c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v0, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v1, p0, La/v1c;->i:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/v1c;->k:La/ehf0;

    .line 29
    .line 30
    iget-object v5, p0, La/v1c;->l:La/mlr;

    .line 31
    .line 32
    iget-object v6, p0, La/v1c;->m:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v7, p0, La/v1c;->n:Z

    .line 35
    .line 36
    iget-boolean v8, p0, La/v1c;->o:Z

    .line 37
    .line 38
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 39
    .line 40
    iget-object p1, p1, La/ehf0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v4, p1

    .line 43
    check-cast v4, La/dn0;

    .line 44
    .line 45
    iput-object v2, p0, La/v1c;->j:Ljava/lang/Object;

    .line 46
    .line 47
    iput-boolean v3, p0, La/v1c;->i:Z

    .line 48
    .line 49
    move-object v9, p0

    .line 50
    invoke-virtual/range {v4 .. v9}, La/dn0;->p(La/mlr;Ljava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 68
    .line 69
    new-instance p1, La/g0g0;

    .line 70
    .line 71
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    :goto_2
    return-object p1
.end method
