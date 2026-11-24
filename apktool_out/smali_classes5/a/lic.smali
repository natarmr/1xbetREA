.class public final La/lic;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/eyg0;

.field public final p:La/s64;

.field public final q:La/qu;

.field public final r:Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;


# direct methods
.method public constructor <init>(La/ctf0;La/mne;La/ntt;La/eyg0;La/oif0;La/s64;La/qu;Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/yw9;

    .line 5
    .line 6
    const/16 v0, 0xd

    .line 7
    .line 8
    invoke-direct {v2, p3, p5, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/ep4;

    .line 12
    .line 13
    const/16 p3, 0x13

    .line 14
    .line 15
    invoke-direct {v3, p1, p3}, La/ep4;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p2, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p4, v0, La/lic;->o:La/eyg0;

    .line 33
    .line 34
    iput-object p6, v0, La/lic;->p:La/s64;

    .line 35
    .line 36
    iput-object p7, v0, La/lic;->q:La/qu;

    .line 37
    .line 38
    iput-object p8, v0, La/lic;->r:Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/bic;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/aic;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, La/aic;

    .line 14
    .line 15
    iget-wide v0, p1, La/aic;->a:J

    .line 16
    .line 17
    iget-object p1, p0, La/lic;->r:Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 18
    .line 19
    iget-wide v2, p1, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;->b:J

    .line 20
    .line 21
    iget-object v4, p0, La/lic;->q:La/qu;

    .line 22
    .line 23
    iget-object v4, v4, La/qu;->a:La/kt2;

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Lkotlin/Pair;

    .line 30
    .line 31
    const-string v5, "sport_id"

    .line 32
    .line 33
    invoke-direct {v3, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v5, Lkotlin/Pair;

    .line 41
    .line 42
    const-string v6, "option"

    .line 43
    .line 44
    invoke-direct {v5, v6, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    filled-new-array {v3, v5}, [Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "bet_player_type_choose"

    .line 56
    .line 57
    invoke-interface {v4, v3, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    iget-wide v2, p1, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;->b:J

    .line 61
    .line 62
    iget-object p1, p0, La/lic;->p:La/s64;

    .line 63
    .line 64
    iget-object p1, p1, La/s64;->a:La/s1p;

    .line 65
    .line 66
    new-instance v4, La/i1p;

    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    invoke-direct {v4, v5, v2, v3}, La/i1p;-><init>(BJ)V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/i1p;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-direct {v2, v3, v0, v1}, La/i1p;-><init>(BJ)V

    .line 76
    .line 77
    .line 78
    new-array v5, v5, [La/k1p;

    .line 79
    .line 80
    aput-object v4, v5, v3

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    aput-object v2, v5, v3

    .line 84
    .line 85
    invoke-static {v5}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-wide/16 v3, 0x2c58

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, La/lic;->o:La/eyg0;

    .line 95
    .line 96
    iget-object p1, p1, La/eyg0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, La/b8h0;

    .line 99
    .line 100
    iget-object p1, p1, La/b8h0;->a:La/w7h0;

    .line 101
    .line 102
    iget-object p1, p1, La/w7h0;->b:La/p7m0;

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    sget-object p1, La/iic;->a:La/iic;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_0
    sget-object v0, La/zhc;->a:La/zhc;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_1

    .line 125
    .line 126
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 131
    .line 132
    .line 133
    return-void
.end method
