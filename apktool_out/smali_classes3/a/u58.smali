.class public final La/u58;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kt2;


# direct methods
.method public constructor <init>(La/kt2;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/u58;->a:La/kt2;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;
    .locals 2

    .line 1
    and-int/lit8 v0, p8, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p5, v1

    .line 7
    :cond_0
    and-int/lit8 p8, p8, 0x20

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p7, v1

    .line 12
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, La/jo20;

    .line 16
    .line 17
    invoke-direct {p0}, La/jo20;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string p8, "game_id"

    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p8, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-string p1, "screen"

    .line 30
    .line 31
    invoke-virtual {p0, p1, p3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const-string p1, "category_id"

    .line 35
    .line 36
    invoke-virtual {p0, p1, p4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    if-eqz p5, :cond_2

    .line 40
    .line 41
    invoke-virtual {p5}, Ljava/lang/Number;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    const-string p3, "provider_id"

    .line 46
    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p3, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    if-eqz p6, :cond_3

    .line 55
    .line 56
    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const-string p2, "index"

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    if-eqz p7, :cond_4

    .line 70
    .line 71
    const-string p1, "element"

    .line 72
    .line 73
    invoke-virtual {p0, p1, p7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual {p0}, La/jo20;->b()La/jo20;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/Pair;

    .line 5
    .line 6
    const-string v1, "provider_id"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lkotlin/Pair;

    .line 12
    .line 13
    const-string v1, "screen"

    .line 14
    .line 15
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 27
    .line 28
    const-string p2, "provbrand_prov_open"

    .line 29
    .line 30
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public c(IILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "category_id"

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p1, "game_id"

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    const-string p1, "screen"

    .line 27
    .line 28
    invoke-virtual {v0, p1, p3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 36
    .line 37
    const-string p2, "aggregator_category_popular_call"

    .line 38
    .line 39
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "aggregator_category_more_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(IJ)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v1, "error_code"

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v1, "open_method"

    .line 15
    .line 16
    const-string v2, "OpenGame2"

    .line 17
    .line 18
    invoke-direct {p1, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance p3, Lkotlin/Pair;

    .line 26
    .line 27
    const-string v1, "game_id"

    .line 28
    .line 29
    invoke-direct {p3, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v0, p1, p3}, [Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 41
    .line 42
    const-string p2, "game_aggregator_error"

    .line 43
    .line 44
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "aggregator_month_provider_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(IIJ)V
    .locals 2

    .line 1
    sget-object v0, La/nw80;->a:La/nw80;

    .line 2
    .line 3
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmp-long v0, p3, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p3, "aggregator_live"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, La/nw80;->b:La/nw80;

    .line 15
    .line 16
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    cmp-long p3, p3, v0

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    const-string p3, "aggregator_slots"

    .line 25
    .line 26
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p1, p2, p3}, La/u58;->h(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public h(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "promo_id"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "index"

    .line 32
    .line 33
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    const-string p1, "screen"

    .line 37
    .line 38
    invoke-virtual {v0, p1, p3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 46
    .line 47
    const-string p2, "my_aggregator_banner_call"

    .line 48
    .line 49
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public i(I)V
    .locals 1

    .line 1
    sget-object v0, La/b9m0;->a:[La/b9m0;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const-string p1, "game_events"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x4

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    const-string p1, "team_nature"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x5

    .line 22
    if-ne p1, v0, :cond_2

    .line 23
    .line 24
    const-string p1, "latest_games"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    const/16 v0, 0x14

    .line 31
    .line 32
    if-ne p1, v0, :cond_3

    .line 33
    .line 34
    const-string p1, "finished_matches"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    const/16 v0, 0x27

    .line 41
    .line 42
    if-ne p1, v0, :cond_4

    .line 43
    .line 44
    const-string p1, "top_kabaddi"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    const/4 v0, 0x6

    .line 51
    if-ne p1, v0, :cond_5

    .line 52
    .line 53
    const-string p1, "text_broadcast"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    const/4 v0, 0x7

    .line 60
    if-ne p1, v0, :cond_6

    .line 61
    .line 62
    const-string p1, "tournament_bracket"

    .line 63
    .line 64
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_6
    const/16 v0, 0x8

    .line 69
    .line 70
    if-ne p1, v0, :cond_7

    .line 71
    .line 72
    const-string p1, "leaderboard"

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_7
    const/16 v0, 0x2c

    .line 79
    .line 80
    if-ne p1, v0, :cond_8

    .line 81
    .line 82
    const-string p1, "checkerboard"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_8
    const/16 v0, 0x9

    .line 89
    .line 90
    if-ne p1, v0, :cond_9

    .line 91
    .line 92
    const-string p1, "team_stats"

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_9
    const/16 v0, 0x26

    .line 99
    .line 100
    if-ne p1, v0, :cond_a

    .line 101
    .line 102
    const-string p1, "heatmap"

    .line 103
    .line 104
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_a
    const/16 v0, 0xa

    .line 109
    .line 110
    if-ne p1, v0, :cond_b

    .line 111
    .line 112
    const-string p1, "players_stats"

    .line 113
    .line 114
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_b
    const/16 v0, 0xb

    .line 119
    .line 120
    if-ne p1, v0, :cond_c

    .line 121
    .line 122
    const-string p1, "championship_stats"

    .line 123
    .line 124
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_c
    const/16 v0, 0x29

    .line 129
    .line 130
    if-ne p1, v0, :cond_d

    .line 131
    .line 132
    const-string p1, "championship_appearances"

    .line 133
    .line 134
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_d
    const/16 v0, 0x12

    .line 139
    .line 140
    if-ne p1, v0, :cond_e

    .line 141
    .line 142
    const-string p1, "stadium"

    .line 143
    .line 144
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_e
    const/16 v0, 0x2b

    .line 149
    .line 150
    if-ne p1, v0, :cond_f

    .line 151
    .line 152
    const-string p1, "facts"

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_f
    const/16 v0, 0x2a

    .line 159
    .line 160
    if-ne p1, v0, :cond_10

    .line 161
    .line 162
    const-string p1, "forecast"

    .line 163
    .line 164
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_10
    const/16 v0, 0xc

    .line 169
    .line 170
    if-ne p1, v0, :cond_11

    .line 171
    .line 172
    const-string p1, "battle_card"

    .line 173
    .line 174
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_11
    const/16 v0, 0x2d

    .line 179
    .line 180
    if-ne p1, v0, :cond_12

    .line 181
    .line 182
    const-string p1, "news"

    .line 183
    .line 184
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_12
    const/16 v0, 0xd

    .line 189
    .line 190
    if-ne p1, v0, :cond_13

    .line 191
    .line 192
    const-string p1, "rating"

    .line 193
    .line 194
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_13
    const/16 v0, 0x2e

    .line 199
    .line 200
    if-ne p1, v0, :cond_14

    .line 201
    .line 202
    const-string p1, "gates_breaks"

    .line 203
    .line 204
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_14
    const/16 v0, 0x2f

    .line 209
    .line 210
    if-ne p1, v0, :cond_15

    .line 211
    .line 212
    const-string p1, "court_card"

    .line 213
    .line 214
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_15
    const/16 v0, 0xe

    .line 219
    .line 220
    if-ne p1, v0, :cond_16

    .line 221
    .line 222
    const-string p1, "starting_lineups"

    .line 223
    .line 224
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_16
    const/4 v0, 0x1

    .line 229
    if-ne p1, v0, :cond_17

    .line 230
    .line 231
    const-string p1, "full_stats"

    .line 232
    .line 233
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_17
    const/16 v0, 0x28

    .line 238
    .line 239
    if-ne p1, v0, :cond_18

    .line 240
    .line 241
    const-string p1, "top_players"

    .line 242
    .line 243
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_18
    const/16 v0, 0x23

    .line 248
    .line 249
    if-ne p1, v0, :cond_19

    .line 250
    .line 251
    const-string p1, "match_progress_pbp"

    .line 252
    .line 253
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_19
    const/16 v0, 0x24

    .line 258
    .line 259
    if-ne p1, v0, :cond_1a

    .line 260
    .line 261
    const-string p1, "match_progress_bbb"

    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_1a
    sget-object v0, La/c9m0;->a:[La/c9m0;

    .line 268
    .line 269
    const/16 v0, 0x1b

    .line 270
    .line 271
    if-ne p1, v0, :cond_1b

    .line 272
    .line 273
    const-string p1, "tournament_participants"

    .line 274
    .line 275
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_1b
    const/16 v0, 0x1c

    .line 280
    .line 281
    if-ne p1, v0, :cond_1c

    .line 282
    .line 283
    const-string p1, "teams"

    .line 284
    .line 285
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_1c
    const/16 v0, 0x1d

    .line 290
    .line 291
    if-ne p1, v0, :cond_1d

    .line 292
    .line 293
    const-string p1, "matches"

    .line 294
    .line 295
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_1d
    const/16 v0, 0x18

    .line 300
    .line 301
    if-ne p1, v0, :cond_1e

    .line 302
    .line 303
    const-string p1, "career"

    .line 304
    .line 305
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_1e
    const/16 v0, 0x19

    .line 310
    .line 311
    if-ne p1, v0, :cond_1f

    .line 312
    .line 313
    const-string p1, "transitions"

    .line 314
    .line 315
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :cond_1f
    const/16 v0, 0x38

    .line 320
    .line 321
    if-ne p1, v0, :cond_20

    .line 322
    .line 323
    const-string p1, "last_matches"

    .line 324
    .line 325
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_20
    const/16 v0, 0x1a

    .line 330
    .line 331
    if-ne p1, v0, :cond_21

    .line 332
    .line 333
    const-string p1, "injury"

    .line 334
    .line 335
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :cond_21
    sget-object v0, La/d9m0;->a:[La/d9m0;

    .line 340
    .line 341
    const/16 v0, 0x15

    .line 342
    .line 343
    if-ne p1, v0, :cond_22

    .line 344
    .line 345
    const-string p1, "future_matches"

    .line 346
    .line 347
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_22
    const/16 v0, 0x16

    .line 352
    .line 353
    if-ne p1, v0, :cond_23

    .line 354
    .line 355
    const-string p1, "rating_history"

    .line 356
    .line 357
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_23
    const/16 v0, 0x11

    .line 362
    .line 363
    if-ne p1, v0, :cond_24

    .line 364
    .line 365
    const-string p1, "team_list"

    .line 366
    .line 367
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_24
    const/16 v0, 0x13

    .line 372
    .line 373
    if-ne p1, v0, :cond_25

    .line 374
    .line 375
    const-string p1, "team_transitions"

    .line 376
    .line 377
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_25
    sget-object v0, La/a9m0;->a:[La/a9m0;

    .line 382
    .line 383
    const/16 v0, 0x21

    .line 384
    .line 385
    if-ne p1, v0, :cond_26

    .line 386
    .line 387
    const-string p1, "finished6matches"

    .line 388
    .line 389
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_26
    const/16 v0, 0x22

    .line 394
    .line 395
    if-ne p1, v0, :cond_27

    .line 396
    .line 397
    const-string p1, "future6matches"

    .line 398
    .line 399
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :cond_27
    const/16 v0, 0x1f

    .line 404
    .line 405
    if-ne p1, v0, :cond_28

    .line 406
    .line 407
    const-string p1, "tournament_grids"

    .line 408
    .line 409
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :cond_28
    const/16 v0, 0x20

    .line 414
    .line 415
    if-ne p1, v0, :cond_29

    .line 416
    .line 417
    const-string p1, "tournament_tables"

    .line 418
    .line 419
    invoke-virtual {p0, p1}, La/u58;->r(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :cond_29
    return-void
.end method

.method public j(JZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "game_id"

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    const-string p1, "add_favor"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "remove"

    .line 21
    .line 22
    :goto_0
    const-string p2, "action"

    .line 23
    .line 24
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const-string p2, "category_id"

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    if-eqz p5, :cond_1

    .line 41
    .line 42
    const-string p1, "screen"

    .line 43
    .line 44
    invoke-virtual {v0, p1, p5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_1
    if-eqz p6, :cond_2

    .line 48
    .line 49
    const-string p1, "element"

    .line 50
    .line 51
    invoke-virtual {v0, p1, p6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 59
    .line 60
    const-string p2, "game_favor_add"

    .line 61
    .line 62
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public k(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/16 v5, 0x3f

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v0, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "games_cashback_game_choose"

    .line 13
    .line 14
    const-string v1, "game_id"

    .line 15
    .line 16
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 17
    .line 18
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "login_page_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "reg_page_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public n(JLjava/lang/Integer;)V
    .locals 10

    .line 1
    const/16 v0, 0x2009

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/4 v8, 0x0

    .line 8
    const/16 v9, 0x28

    .line 9
    .line 10
    const-string v4, "favorite"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-wide v2, p1

    .line 15
    move-object v7, p3

    .line 16
    invoke-static/range {v1 .. v9}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p1, v1, La/u58;->a:La/kt2;

    .line 21
    .line 22
    const-string p2, "game_aggregator_call"

    .line 23
    .line 24
    invoke-interface {p1, p2, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public o(Ljava/lang/String;JZ)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    const-string p4, "company"

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p4, "players"

    .line 10
    .line 11
    :goto_0
    new-instance v0, La/jo20;

    .line 12
    .line 13
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "game_id"

    .line 17
    .line 18
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {v0, v1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const-string p2, "option"

    .line 26
    .line 27
    invoke-virtual {v0, p2, p4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-lez p2, :cond_1

    .line 35
    .line 36
    const-string p2, "session_id"

    .line 37
    .line 38
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 46
    .line 47
    const-string p2, "games_cashback_game_play"

    .line 48
    .line 49
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public p(JLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    const/4 v7, 0x0

    .line 10
    const/16 v10, 0x8

    .line 11
    .line 12
    const-string v5, "popular_new_top"

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-wide v3, p1

    .line 16
    move-object v8, p4

    .line 17
    move-object/from16 v9, p5

    .line 18
    .line 19
    invoke-static/range {v2 .. v10}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 24
    .line 25
    const-string p2, "game_aggregator_call"

    .line 26
    .line 27
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public q(Ljava/lang/String;JJLjava/lang/Integer;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    const/4 v5, 0x0

    .line 6
    const/16 v8, 0x8

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v3, p1

    .line 10
    move-wide v1, p4

    .line 11
    move-object v6, p6

    .line 12
    move-object/from16 v7, p7

    .line 13
    .line 14
    invoke-static/range {v0 .. v8}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 19
    .line 20
    const-string p2, "game_aggregator_call"

    .line 21
    .line 22
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "bet_statistic_point_call"

    .line 2
    .line 3
    const-string v1, "option"

    .line 4
    .line 5
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
