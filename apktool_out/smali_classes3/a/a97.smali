.class public final La/a97;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/f97;


# direct methods
.method public constructor <init>(La/f97;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/a97;->j:La/f97;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/a97;

    .line 2
    .line 3
    iget-object p0, p0, La/a97;->j:La/f97;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/a97;-><init>(La/f97;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/a97;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a97;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a97;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/a97;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/a97;->j:La/f97;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, La/i77;

    .line 31
    .line 32
    iget-object p1, p1, La/i77;->e:La/ql5;

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    iput-boolean v4, p0, La/a97;->i:Z

    .line 37
    .line 38
    invoke-virtual {v3, p0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 46
    .line 47
    :cond_3
    iget-object v4, v3, La/f97;->D:La/p37;

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x6

    .line 51
    sget-object v5, La/n1k;->a:La/n1k;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p1, La/ql5;->i:La/txs0;

    .line 58
    .line 59
    iget-wide v0, p1, La/ql5;->a:J

    .line 60
    .line 61
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    sget-object p0, La/k67;->a:La/k67;

    .line 68
    .line 69
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object p0, v3, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 74
    .line 75
    instance-of p1, p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object v4, v3, La/f97;->C:La/f47;

    .line 80
    .line 81
    new-instance v5, La/q0k;

    .line 82
    .line 83
    check-cast p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 84
    .line 85
    const/16 p1, 0xe

    .line 86
    .line 87
    invoke-static {p0, v0, v1, v2, p1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;->a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;I)Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {v5, p0}, La/q0k;-><init>(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)V

    .line 92
    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x6

    .line 96
    const/4 v6, 0x0

    .line 97
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    instance-of p1, p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 102
    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    iget-object v4, v3, La/f97;->C:La/f47;

    .line 106
    .line 107
    new-instance v5, La/q0k;

    .line 108
    .line 109
    check-cast p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 110
    .line 111
    const/16 p1, 0x3e

    .line 112
    .line 113
    invoke-static {p0, v0, v1, v2, p1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;I)Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-direct {v5, p0}, La/q0k;-><init>(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)V

    .line 118
    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x6

    .line 122
    const/4 v6, 0x0

    .line 123
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0
.end method
