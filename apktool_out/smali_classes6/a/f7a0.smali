.class public final La/f7a0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/util/List;

.field public synthetic k:J

.field public final synthetic l:La/g7a0;


# direct methods
.method public constructor <init>(La/g7a0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f7a0;->l:La/g7a0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    new-instance p2, La/f7a0;

    .line 12
    .line 13
    iget-object p0, p0, La/f7a0;->l:La/g7a0;

    .line 14
    .line 15
    invoke-direct {p2, p0, p3}, La/f7a0;-><init>(La/g7a0;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p2, La/f7a0;->j:Ljava/util/List;

    .line 19
    .line 20
    iput-wide v0, p2, La/f7a0;->k:J

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {p2, p0}, La/f7a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/f7a0;->j:Ljava/util/List;

    .line 2
    .line 3
    iget-wide v1, p0, La/f7a0;->k:J

    .line 4
    .line 5
    sget-object v3, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v4, p0, La/f7a0;->i:Z

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    if-ne v4, v5, :cond_0

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
    return-object v6

    .line 25
    :cond_1
    invoke-static {p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    instance-of v7, v4, La/uvm0;

    .line 44
    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v4, v0

    .line 66
    check-cast v4, La/uvm0;

    .line 67
    .line 68
    iget-wide v7, v4, La/uvm0;->a:J

    .line 69
    .line 70
    cmp-long v4, v7, v1

    .line 71
    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    move-object v0, v6

    .line 76
    :goto_1
    check-cast v0, La/uvm0;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    iget-object p1, v0, La/uvm0;->d:Ljava/lang/String;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_6
    move-object p1, v6

    .line 84
    :goto_2
    iget-object v0, p0, La/f7a0;->l:La/g7a0;

    .line 85
    .line 86
    iget-object v0, v0, La/g7a0;->o:La/o030;

    .line 87
    .line 88
    if-nez p1, :cond_7

    .line 89
    .line 90
    const-string p1, ""

    .line 91
    .line 92
    :cond_7
    sget-object v4, La/oy20;->d:La/oy20;

    .line 93
    .line 94
    new-instance v7, La/r030;

    .line 95
    .line 96
    invoke-direct {v7, v1, v2, v4, p1}, La/r030;-><init>(JLa/oy20;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, La/f7a0;->j:Ljava/util/List;

    .line 100
    .line 101
    iput-wide v1, p0, La/f7a0;->k:J

    .line 102
    .line 103
    iput-boolean v5, p0, La/f7a0;->i:Z

    .line 104
    .line 105
    invoke-virtual {v0, v7, p0}, La/o030;->w(La/h130;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v3, :cond_8

    .line 110
    .line 111
    return-object v3

    .line 112
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0
.end method
