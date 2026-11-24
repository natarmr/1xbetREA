.class public final synthetic La/y020;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f120;


# direct methods
.method public synthetic constructor <init>(La/f120;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y020;->a:B

    iput-object p1, p0, La/y020;->b:La/f120;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/y020;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y020;->b:La/f120;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/f120;->H:La/nai;

    .line 14
    .line 15
    new-instance v2, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/v020;

    .line 22
    .line 23
    iget-object v1, v1, La/v020;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-wide v3, p0, La/f120;->p:J

    .line 29
    .line 30
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/v020;

    .line 35
    .line 36
    iget-object v1, v1, La/v020;->i:La/ixs0;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, La/ixs0;->a:La/znp0;

    .line 41
    .line 42
    iget-object v1, v1, La/znp0;->a:Ljava/lang/String;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    if-nez v1, :cond_1

    .line 47
    .line 48
    const-string v1, ""

    .line 49
    .line 50
    :cond_1
    move-object v5, v1

    .line 51
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/v020;

    .line 56
    .line 57
    iget-object p0, p0, La/v020;->h:La/xqj0;

    .line 58
    .line 59
    iget-wide v6, p0, La/xqj0;->s:J

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v1, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/main/screen/StageTableScreen;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v7}, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/main/screen/StageTableScreen;-><init>(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JLjava/lang/String;J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/f120;->Q:La/xuz;

    .line 79
    .line 80
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, La/v020;

    .line 85
    .line 86
    iget-object v1, v1, La/v020;->f:Ljava/lang/String;

    .line 87
    .line 88
    iget-wide v2, p0, La/f120;->p:J

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance p0, Lorg/xplatform/statistic/match_progress/match_progress_cricket/presentation/screen/MatchProgressCricketScreen;

    .line 94
    .line 95
    invoke-direct {p0, v1, v2, v3}, Lorg/xplatform/statistic/match_progress/match_progress_cricket/presentation/screen/MatchProgressCricketScreen;-><init>(Ljava/lang/String;J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, La/f120;->Q:La/xuz;

    .line 108
    .line 109
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, La/v020;

    .line 114
    .line 115
    iget-object v1, v1, La/v020;->f:Ljava/lang/String;

    .line 116
    .line 117
    iget-wide v2, p0, La/f120;->p:J

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance p0, Lorg/xplatform/statistic/match_progress/match_progress_main/presentation/screen/MatchProgressStatisticRefactoredScreen;

    .line 123
    .line 124
    invoke-direct {p0, v1, v2, v3}, Lorg/xplatform/statistic/match_progress/match_progress_main/presentation/screen/MatchProgressStatisticRefactoredScreen;-><init>(Ljava/lang/String;J)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
