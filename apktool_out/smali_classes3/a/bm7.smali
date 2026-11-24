.class public final La/bm7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/fm7;


# direct methods
.method public constructor <init>(La/fm7;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bm7;->j:La/fm7;

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
    new-instance p1, La/bm7;

    .line 2
    .line 3
    iget-object p0, p0, La/bm7;->j:La/fm7;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/bm7;-><init>(La/fm7;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/bm7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bm7;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/bm7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p0, La/bm7;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/bm7;->j:La/fm7;

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
    goto :goto_1

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
    check-cast p1, La/jk7;

    .line 31
    .line 32
    iget-object p1, p1, La/jk7;->f:La/ql5;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    :goto_0
    iget-wide p0, p1, La/ql5;->a:J

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iput-boolean v4, p0, La/bm7;->i:Z

    .line 40
    .line 41
    invoke-virtual {v3, p0}, La/fm7;->N(La/zje;)Ljava/io/Serializable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    :goto_1
    check-cast p1, La/ql5;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_2
    iget-object v4, v3, La/fm7;->e0:La/f47;

    .line 52
    .line 53
    new-instance v5, La/q0k;

    .line 54
    .line 55
    iget-object v0, v3, La/fm7;->o:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    instance-of v1, v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    check-cast v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 64
    .line 65
    const/16 v1, 0xe

    .line 66
    .line 67
    invoke-static {v0, p0, p1, v2, v1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;->a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;I)Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    instance-of v1, v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    check-cast v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 77
    .line 78
    const/16 v1, 0x3e

    .line 79
    .line 80
    invoke-static {v0, p0, p1, v2, v1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;I)Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_3
    invoke-direct {v5, p0}, La/q0k;-><init>(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)V

    .line 85
    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x6

    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 97
    .line 98
    .line 99
    return-object v2
.end method
