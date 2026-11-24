.class public final La/u7h0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Throwable;

.field public synthetic k:J

.field public final synthetic l:Z


# direct methods
.method public constructor <init>(ZLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/u7h0;->l:Z

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/u7h0;->j:Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-wide v1, p0, La/u7h0;->k:J

    .line 4
    .line 5
    sget-object v3, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v4, p0, La/u7h0;->i:Z

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    if-ne v4, v6, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v5

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    xor-int/2addr p1, v6

    .line 33
    instance-of v4, v0, La/zhi0;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v4, :cond_5

    .line 37
    .line 38
    iget-boolean p1, p0, La/u7h0;->l:Z

    .line 39
    .line 40
    check-cast v0, La/zhi0;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-boolean p1, v0, La/zhi0;->f:Z

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    iget-boolean p1, v0, La/zhi0;->e:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move p1, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    move p1, v6

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    iget-boolean p1, v0, La/zhi0;->e:Z

    .line 58
    .line 59
    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 60
    .line 61
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_6
    const-wide/16 v8, 0x3

    .line 65
    .line 66
    cmp-long p1, v1, v8

    .line 67
    .line 68
    if-gez p1, :cond_7

    .line 69
    .line 70
    move p1, v6

    .line 71
    goto :goto_2

    .line 72
    :cond_7
    move p1, v7

    .line 73
    :goto_2
    if-eqz p1, :cond_8

    .line 74
    .line 75
    sget-object p1, La/wen;->b:La/uen;

    .line 76
    .line 77
    sget-object p1, La/bfn;->e:La/bfn;

    .line 78
    .line 79
    invoke-static {v8, v9, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    iput-object v5, p0, La/u7h0;->j:Ljava/lang/Throwable;

    .line 84
    .line 85
    iput-wide v1, p0, La/u7h0;->k:J

    .line 86
    .line 87
    iput-boolean v6, p0, La/u7h0;->i:Z

    .line 88
    .line 89
    invoke-static {v7, v8, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-ne p0, v3, :cond_9

    .line 94
    .line 95
    return-object v3

    .line 96
    :cond_8
    move v6, v7

    .line 97
    :cond_9
    :goto_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

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
    move-result-wide v0

    .line 11
    check-cast p4, La/yje;

    .line 12
    .line 13
    new-instance p1, La/u7h0;

    .line 14
    .line 15
    iget-boolean p0, p0, La/u7h0;->l:Z

    .line 16
    .line 17
    invoke-direct {p1, p0, p4}, La/u7h0;-><init>(ZLa/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p1, La/u7h0;->j:Ljava/lang/Throwable;

    .line 21
    .line 22
    iput-wide v0, p1, La/u7h0;->k:J

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, La/u7h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
