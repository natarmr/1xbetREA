.class public final La/ul7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/fm7;

.field public j:La/htt;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/fm7;


# direct methods
.method public constructor <init>(La/fm7;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ul7;->m:La/fm7;

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
    .locals 1

    .line 1
    new-instance v0, La/ul7;

    .line 2
    .line 3
    iget-object p0, p0, La/ul7;->m:La/fm7;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/ul7;-><init>(La/fm7;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/ul7;->l:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/ul7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ul7;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ul7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/ul7;->m:La/fm7;

    .line 2
    .line 3
    iget-object v1, v0, La/fm7;->p:La/mne;

    .line 4
    .line 5
    iget-object v2, p0, La/ul7;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/vne;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, p0, La/ul7;->k:B

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    if-eq v4, v5, :cond_1

    .line 19
    .line 20
    if-ne v4, v6, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, La/ul7;->j:La/htt;

    .line 23
    .line 24
    iget-object p0, p0, La/ul7;->i:La/fm7;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v8, v3

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v7

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, La/ul7;->l:Ljava/lang/Object;

    .line 45
    .line 46
    iput-byte v5, p0, La/ul7;->k:B

    .line 47
    .line 48
    sget p1, La/fm7;->p0:I

    .line 49
    .line 50
    invoke-virtual {v0, p0}, La/fm7;->P(La/zje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v3, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    iget-object p1, v0, La/fm7;->r:La/htt;

    .line 58
    .line 59
    iput-object v2, p0, La/ul7;->l:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v0, p0, La/ul7;->i:La/fm7;

    .line 62
    .line 63
    iput-object p1, p0, La/ul7;->j:La/htt;

    .line 64
    .line 65
    iput-byte v6, p0, La/ul7;->k:B

    .line 66
    .line 67
    invoke-virtual {v0, p0}, La/fm7;->N(La/zje;)Ljava/io/Serializable;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, v3, :cond_4

    .line 72
    .line 73
    :goto_1
    return-object v3

    .line 74
    :cond_4
    move-object v8, p1

    .line 75
    move-object p1, p0

    .line 76
    move-object p0, v0

    .line 77
    :goto_2
    check-cast p1, La/ql5;

    .line 78
    .line 79
    iget-wide v9, p1, La/ql5;->a:J

    .line 80
    .line 81
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, La/jk7;

    .line 86
    .line 87
    iget-wide v11, p1, La/jk7;->c:J

    .line 88
    .line 89
    iget-object p1, v0, La/fm7;->o:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 90
    .line 91
    instance-of v3, p1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    check-cast p1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    move-object p1, v7

    .line 99
    :goto_3
    if-eqz p1, :cond_6

    .line 100
    .line 101
    iget-object p1, p1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->f:Ljava/lang/String;

    .line 102
    .line 103
    move-object v13, p1

    .line 104
    goto :goto_4

    .line 105
    :cond_6
    move-object v13, v7

    .line 106
    :goto_4
    invoke-virtual/range {v8 .. v13}, La/htt;->a(JJLjava/lang/String;)La/lhf0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iget-object v4, v1, La/mne;->b:La/dvj;

    .line 115
    .line 116
    new-instance v5, La/ek80;

    .line 117
    .line 118
    invoke-direct {v5, p1, v3, v4}, La/ek80;-><init>(La/lhf0;La/bvc;La/lne;)V

    .line 119
    .line 120
    .line 121
    iput-object v5, p0, La/fm7;->j0:La/ek80;

    .line 122
    .line 123
    iget-object p0, v0, La/fm7;->j0:La/ek80;

    .line 124
    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    iget-object p0, p0, La/ek80;->e:La/p7m0;

    .line 128
    .line 129
    if-eqz p0, :cond_7

    .line 130
    .line 131
    new-instance p1, La/xw5;

    .line 132
    .line 133
    const/16 v3, 0x14

    .line 134
    .line 135
    invoke-direct {p1, v0, v7, v3}, La/xw5;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance v0, La/fnq;

    .line 139
    .line 140
    const/4 v3, 0x4

    .line 141
    invoke-direct {v0, p0, p1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 142
    .line 143
    .line 144
    iget-object p0, v1, La/mne;->a:La/rwj;

    .line 145
    .line 146
    invoke-static {v2, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {v0, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 151
    .line 152
    .line 153
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0
.end method
