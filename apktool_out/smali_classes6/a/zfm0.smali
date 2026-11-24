.class public final La/zfm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfm0;


# instance fields
.field public final a:La/nai;

.field public final b:La/qzt;

.field public final c:La/pru;


# direct methods
.method public constructor <init>(La/bzs0;La/nwd;La/y2m0;La/bst;La/nai;La/rl70;La/qzt;La/htz;La/pru;La/s2m0;La/cge0;La/g9m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, La/zfm0;->a:La/nai;

    .line 5
    .line 6
    iput-object p7, p0, La/zfm0;->b:La/qzt;

    .line 7
    .line 8
    iput-object p9, p0, La/zfm0;->c:La/pru;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/zfm0;->c:La/pru;

    .line 5
    .line 6
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 11
    .line 12
    iget-object v0, v0, La/mum0;->t:La/llm0;

    .line 13
    .line 14
    const-wide/16 v1, 0x2c

    .line 15
    .line 16
    cmp-long v1, p1, v1

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    const-wide/16 v1, 0x85

    .line 21
    .line 22
    cmp-long v1, p1, v1

    .line 23
    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    const-wide/16 v1, 0x84

    .line 27
    .line 28
    cmp-long v1, p1, v1

    .line 29
    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    const-wide/16 v1, 0x5c

    .line 33
    .line 34
    cmp-long v1, p1, v1

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-wide/16 v1, 0x1a

    .line 40
    .line 41
    cmp-long v1, p1, v1

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    new-instance v0, Lorg/xplatform/statistic/races/presentation/screens/RacesStatisticScreen;

    .line 46
    .line 47
    iget-object p0, p0, La/zfm0;->b:La/qzt;

    .line 48
    .line 49
    iget-object p0, p0, La/qzt;->a:La/pru;

    .line 50
    .line 51
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 56
    .line 57
    iget-object p0, p0, La/mum0;->t:La/llm0;

    .line 58
    .line 59
    invoke-direct {v0, p3, p1, p2, p0}, Lorg/xplatform/statistic/races/presentation/screens/RacesStatisticScreen;-><init>(Ljava/lang/String;JLa/llm0;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    const-wide/16 v1, 0x24

    .line 64
    .line 65
    cmp-long p0, p1, v1

    .line 66
    .line 67
    if-nez p0, :cond_2

    .line 68
    .line 69
    new-instance p0, Lorg/xplatform/statistic/cycling/impl/cycling_menu/presentation/screen/CyclingMainFragmentScreen;

    .line 70
    .line 71
    invoke-direct {p0, p3, p1, p2}, Lorg/xplatform/statistic/cycling/impl/cycling_menu/presentation/screen/CyclingMainFragmentScreen;-><init>(Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_2
    sget p0, La/gql0;->a:I

    .line 76
    .line 77
    const-wide/16 v1, 0x13

    .line 78
    .line 79
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-wide/16 v1, 0x17

    .line 84
    .line 85
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-wide/16 v2, 0x18

    .line 90
    .line 91
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-wide/16 v3, 0x16

    .line 96
    .line 97
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    filled-new-array {p0, v1, v2, v3}, [Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_3

    .line 118
    .line 119
    new-instance p0, Lorg/xplatform/statistic/winter_games/impl/winter_game/presentation/screen/WinterGamesMainFragmentScreen;

    .line 120
    .line 121
    invoke-direct {p0, p3, p1, p2}, Lorg/xplatform/statistic/winter_games/impl/winter_game/presentation/screen/WinterGamesMainFragmentScreen;-><init>(Ljava/lang/String;J)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_3
    new-instance p0, Lorg/xplatform/statistic/common/presentation/MainStatisticScreen;

    .line 126
    .line 127
    invoke-direct {p0, p3, p1, p2, v0}, Lorg/xplatform/statistic/common/presentation/MainStatisticScreen;-><init>(Ljava/lang/String;JLa/llm0;)V

    .line 128
    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_4
    :goto_0
    new-instance p0, Lorg/xplatform/statistic/horses_race_menu/presentation/screen/HorsesRaceMenuScreen;

    .line 132
    .line 133
    invoke-direct {p0, p3, p1, p2, v0}, Lorg/xplatform/statistic/horses_race_menu/presentation/screen/HorsesRaceMenuScreen;-><init>(Ljava/lang/String;JLa/llm0;)V

    .line 134
    .line 135
    .line 136
    return-object p0
.end method
