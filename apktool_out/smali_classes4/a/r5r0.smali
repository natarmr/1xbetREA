.class public final La/r5r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Lkotlin/Unit;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance p0, La/r5r0;

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/r5r0;->j:La/kmq;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/r5r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/r5r0;->j:La/kmq;

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, p0, La/r5r0;->i:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    if-eq v2, v6, :cond_2

    .line 14
    .line 15
    if-eq v2, v5, :cond_1

    .line 16
    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    iput-object v0, p0, La/r5r0;->j:La/kmq;

    .line 43
    .line 44
    iput-byte v6, p0, La/r5r0;->i:B

    .line 45
    .line 46
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v1, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    :goto_0
    sget-object p1, La/wen;->b:La/uen;

    .line 54
    .line 55
    const-wide/16 v6, 0x7530

    .line 56
    .line 57
    sget-object p1, La/bfn;->d:La/bfn;

    .line 58
    .line 59
    invoke-static {v6, v7, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    iput-object v0, p0, La/r5r0;->j:La/kmq;

    .line 64
    .line 65
    iput-byte v5, p0, La/r5r0;->i:B

    .line 66
    .line 67
    invoke-static {v6, v7, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    iput-object v3, p0, La/r5r0;->j:La/kmq;

    .line 77
    .line 78
    iput-byte v4, p0, La/r5r0;->i:B

    .line 79
    .line 80
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v1, :cond_6

    .line 85
    .line 86
    :goto_2
    return-object v1

    .line 87
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0
.end method
