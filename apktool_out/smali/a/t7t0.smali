.class public final La/t7t0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Throwable;

.field public synthetic k:J


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/t7t0;->i:Z

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
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/t7t0;->j:Ljava/lang/Throwable;

    .line 25
    .line 26
    iget-wide v3, p0, La/t7t0;->k:J

    .line 27
    .line 28
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v5, La/u7t0;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string v6, "Cannot check for unfinished work"

    .line 35
    .line 36
    invoke-virtual {v1, v5, v6, p1}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v5, 0x7530

    .line 40
    .line 41
    mul-long/2addr v3, v5

    .line 42
    sget p1, La/u7t0;->b:I

    .line 43
    .line 44
    int-to-long v5, p1

    .line 45
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    iput-boolean v2, p0, La/t7t0;->i:Z

    .line 50
    .line 51
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    check-cast p4, La/yje;

    .line 12
    .line 13
    new-instance p3, La/t7t0;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p3, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p3, La/t7t0;->j:Ljava/lang/Throwable;

    .line 20
    .line 21
    iput-wide p0, p3, La/t7t0;->k:J

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {p3, p0}, La/t7t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
