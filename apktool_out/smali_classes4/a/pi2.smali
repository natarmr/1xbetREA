.class public final La/pi2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:La/qi2;

.field public final synthetic k:J


# direct methods
.method public constructor <init>(ZLa/qi2;JLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/pi2;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, La/pi2;->j:La/qi2;

    .line 4
    .line 5
    iput-wide p3, p0, La/pi2;->k:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/pi2;

    .line 2
    .line 3
    iget-object v2, p0, La/pi2;->j:La/qi2;

    .line 4
    .line 5
    iget-wide v3, p0, La/pi2;->k:J

    .line 6
    .line 7
    iget-boolean v1, p0, La/pi2;->i:Z

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, La/pi2;-><init>(ZLa/qi2;JLa/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/pi2;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pi2;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/pi2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, La/pi2;->j:La/qi2;

    .line 7
    .line 8
    iget-object p1, v2, La/qi2;->p:La/i1w0;

    .line 9
    .line 10
    iget-wide v3, p0, La/pi2;->k:J

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iget-boolean p0, p0, La/pi2;->i:Z

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/ei2;

    .line 22
    .line 23
    iget-object p0, p0, La/ei2;->c:La/fqp0;

    .line 24
    .line 25
    instance-of v1, p0, La/cqp0;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    check-cast p0, La/cqp0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p0, v0

    .line 33
    :goto_0
    if-eqz p0, :cond_7

    .line 34
    .line 35
    iget-object p0, p0, La/cqp0;->a:Ljava/util/List;

    .line 36
    .line 37
    if-eqz p0, :cond_7

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v5, v1

    .line 54
    check-cast v5, La/xcp;

    .line 55
    .line 56
    iget-wide v5, v5, La/xcp;->a:J

    .line 57
    .line 58
    cmp-long v5, v5, v3

    .line 59
    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    :cond_2
    check-cast v0, La/xcp;

    .line 64
    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    new-instance v1, La/mz0;

    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    move-wide v4, v3

    .line 71
    move-object v3, v0

    .line 72
    invoke-direct/range {v1 .. v6}, La/mz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, La/ei2;

    .line 84
    .line 85
    iget-object p0, p0, La/ei2;->c:La/fqp0;

    .line 86
    .line 87
    instance-of v1, p0, La/eqp0;

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    check-cast p0, La/eqp0;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move-object p0, v0

    .line 95
    :goto_1
    if-eqz p0, :cond_7

    .line 96
    .line 97
    iget-object p0, p0, La/eqp0;->a:Ljava/util/List;

    .line 98
    .line 99
    if-eqz p0, :cond_7

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    move-object v5, v1

    .line 116
    check-cast v5, La/xde0;

    .line 117
    .line 118
    iget-wide v5, v5, La/xde0;->a:J

    .line 119
    .line 120
    cmp-long v5, v5, v3

    .line 121
    .line 122
    if-nez v5, :cond_5

    .line 123
    .line 124
    move-object v0, v1

    .line 125
    :cond_6
    move-object v5, v0

    .line 126
    check-cast v5, La/xde0;

    .line 127
    .line 128
    if-eqz v5, :cond_7

    .line 129
    .line 130
    new-instance v1, La/mz0;

    .line 131
    .line 132
    const/4 v6, 0x4

    .line 133
    invoke-direct/range {v1 .. v6}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 137
    .line 138
    .line 139
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0
.end method
