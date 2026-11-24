.class public final La/k52;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k52;->a:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/gmq;
    .locals 5

    .line 1
    iget-object p0, p0, La/k52;->a:La/chf0;

    .line 2
    .line 3
    iget-object p0, p0, La/chf0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/ou6;

    .line 6
    .line 7
    iget-object p0, p0, La/ou6;->a:La/zdg0;

    .line 8
    .line 9
    const-string v0, "bet_events"

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/pd;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const/16 v3, 0x16

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v1, v2, v4, v3}, La/pd;-><init>(ILa/yje;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0, v1}, La/wwb;->C(La/zdg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/zj2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-wide/16 v0, 0x32

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public b(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/j52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/j52;

    .line 7
    .line 8
    iget v1, v0, La/j52;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/j52;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/j52;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/j52;-><init>(La/k52;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/j52;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/j52;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/j52;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/k52;->a:La/chf0;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, v0}, La/chf0;->F(JLa/zje;)Ljava/io/Serializable;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    if-ne p3, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_5

    .line 68
    .line 69
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, La/qu6;

    .line 91
    .line 92
    iget-wide p1, p1, La/qu6;->x:J

    .line 93
    .line 94
    const-wide/16 v0, 0x2c3

    .line 95
    .line 96
    cmp-long p1, p1, v0

    .line 97
    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/4 v3, 0x0

    .line 102
    :cond_6
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
