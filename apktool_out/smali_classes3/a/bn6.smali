.class public final La/bn6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gst0;

.field public final b:La/kt2;

.field public final c:La/knf0;

.field public final d:La/peg0;


# direct methods
.method public constructor <init>(La/gst0;La/kt2;La/knf0;La/peg0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch p5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/bn6;->a:La/gst0;

    .line 17
    .line 18
    iput-object p2, p0, La/bn6;->b:La/kt2;

    .line 19
    .line 20
    iput-object p3, p0, La/bn6;->c:La/knf0;

    .line 21
    .line 22
    iput-object p4, p0, La/bn6;->d:La/peg0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/bn6;->a:La/gst0;

    .line 32
    .line 33
    iput-object p2, p0, La/bn6;->b:La/kt2;

    .line 34
    .line 35
    iput-object p3, p0, La/bn6;->c:La/knf0;

    .line 36
    .line 37
    iput-object p4, p0, La/bn6;->d:La/peg0;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static l(La/bn6;JLjava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    :goto_0
    and-int/lit8 p5, p5, 0x4

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    const-string p3, ""

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p5, p0, La/bn6;->a:La/gst0;

    .line 18
    .line 19
    iget-object p5, p5, La/gst0;->a:La/rrt0;

    .line 20
    .line 21
    invoke-virtual {p5}, La/rrt0;->a()La/krt0;

    .line 22
    .line 23
    .line 24
    move-result-object p5

    .line 25
    iget-wide v1, p5, La/krt0;->a:J

    .line 26
    .line 27
    iget-object p5, p0, La/bn6;->b:La/kt2;

    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v3, Lkotlin/Pair;

    .line 34
    .line 35
    const-string p2, "bet_type"

    .line 36
    .line 37
    invoke-direct {v3, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lkotlin/Pair;

    .line 41
    .line 42
    const-string p1, "promocode"

    .line 43
    .line 44
    invoke-direct {v4, p1, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v5, Lkotlin/Pair;

    .line 52
    .line 53
    const-string p2, "oneclick"

    .line 54
    .line 55
    invoke-direct {v5, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v6, Lkotlin/Pair;

    .line 63
    .line 64
    const-string p2, "id_user"

    .line 65
    .line 66
    invoke-direct {v6, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v7, Lkotlin/Pair;

    .line 70
    .line 71
    const-string p1, "bet_id"

    .line 72
    .line 73
    invoke-direct {v7, p1, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, La/bn6;->c:La/knf0;

    .line 77
    .line 78
    invoke-virtual {p1}, La/knf0;->a()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v8, Lkotlin/Pair;

    .line 83
    .line 84
    const-string p2, "af_id"

    .line 85
    .line 86
    invoke-direct {v8, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/bn6;->d:La/peg0;

    .line 90
    .line 91
    invoke-virtual {p0}, La/peg0;->i()V

    .line 92
    .line 93
    .line 94
    new-instance v9, Lkotlin/Pair;

    .line 95
    .line 96
    const-string p0, "af_dev_key"

    .line 97
    .line 98
    const-string p1, "iGjRWepvHRRUkVX6DYuTPC"

    .line 99
    .line 100
    invoke-direct {v9, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    filled-new-array/range {v3 .. v9}, [Lkotlin/Pair;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "betkit_bet_done"

    .line 112
    .line 113
    invoke-interface {p5, p1, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "sport_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v0, "filter"

    .line 15
    .line 16
    const-string v1, "insight"

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {p2, p1}, [Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 30
    .line 31
    const-string p2, "bet_game_filter_call"

    .line 32
    .line 33
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public b(Ljava/lang/Long;J)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "sport_id"

    .line 7
    .line 8
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {v0, v1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    const-string p3, "sub_sport_id"

    .line 22
    .line 23
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p3, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    const-string p1, "option"

    .line 31
    .line 32
    const-string p2, "video"

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 42
    .line 43
    const-string p2, "broadcasting_first_play"

    .line 44
    .line 45
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public c(JZZ)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "sport_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    const-string p1, "system"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "arrow"

    .line 18
    .line 19
    :goto_0
    new-instance p3, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v0, "action"

    .line 22
    .line 23
    invoke-direct {p3, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    const-string p1, "live"

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string p1, "line"

    .line 32
    .line 33
    :goto_1
    new-instance p4, Lkotlin/Pair;

    .line 34
    .line 35
    const-string v0, "type"

    .line 36
    .line 37
    invoke-direct {p4, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {p2, p3, p4}, [Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 49
    .line 50
    const-string p2, "game_page_exit"

    .line 51
    .line 52
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public d(JJJLjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/jo20;

    .line 5
    .line 6
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "sport_id"

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v1, "championship_id"

    .line 19
    .line 20
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p5

    .line 24
    invoke-virtual {v0, v1, p5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p5, "screen"

    .line 28
    .line 29
    invoke-virtual {v0, p5, p7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    if-eqz p8, :cond_0

    .line 33
    .line 34
    const-string p5, "live"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p5, "line"

    .line 38
    .line 39
    :goto_0
    const-string p6, "option"

    .line 40
    .line 41
    invoke-virtual {v0, p6, p5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const-wide/16 p5, 0x28

    .line 45
    .line 46
    cmp-long p1, p1, p5

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    const-string p1, "sub_sport_id"

    .line 51
    .line 52
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 64
    .line 65
    const-string p2, "bet_game_open"

    .line 66
    .line 67
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public e(JJJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p7, :cond_0

    .line 2
    .line 3
    const-string p7, "result"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p8, :cond_1

    .line 7
    .line 8
    const-string p7, "live"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string p7, "line"

    .line 12
    .line 13
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object p8

    .line 17
    new-instance v0, Lkotlin/Pair;

    .line 18
    .line 19
    const-string v1, "sport_id"

    .line 20
    .line 21
    invoke-direct {v0, v1, p8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    new-instance p6, Lkotlin/Pair;

    .line 29
    .line 30
    const-string p8, "championship_id"

    .line 31
    .line 32
    invoke-direct {p6, p8, p5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p5, Lkotlin/Pair;

    .line 36
    .line 37
    const-string p8, "screen"

    .line 38
    .line 39
    invoke-direct {p5, p8, p9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p8, Lkotlin/Pair;

    .line 43
    .line 44
    const-string p9, "option"

    .line 45
    .line 46
    invoke-direct {p8, p9, p7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    filled-new-array {v0, p6, p5, p8}, [Lkotlin/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object p5

    .line 53
    invoke-static {p5}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    .line 56
    move-result-object p5

    .line 57
    const-wide/16 p6, 0x28

    .line 58
    .line 59
    cmp-long p1, p1, p6

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    const-string p1, "sub_sport_id"

    .line 64
    .line 65
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p5, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_2
    if-eqz p10, :cond_4

    .line 73
    .line 74
    invoke-virtual {p10}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-static {p10}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    const-string p1, "bet_id"

    .line 88
    .line 89
    invoke-interface {p5, p1, p10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_4
    :goto_1
    if-eqz p11, :cond_6

    .line 93
    .line 94
    invoke-virtual {p11}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const-string p1, "point"

    .line 102
    .line 103
    invoke-interface {p5, p1, p11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_6
    :goto_2
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 107
    .line 108
    const-string p1, "bet_game_open"

    .line 109
    .line 110
    invoke-interface {p0, p1, p5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public f(JJ)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "game_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance p3, Lkotlin/Pair;

    .line 17
    .line 18
    const-string p4, "option"

    .line 19
    .line 20
    invoke-direct {p3, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {p2, p3}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 32
    .line 33
    const-string p2, "bet_market_cathegory_info"

    .line 34
    .line 35
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "game_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v0, "point"

    .line 15
    .line 16
    invoke-direct {p1, v0, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {p2, p1}, [Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 28
    .line 29
    const-string p2, "bet_market_cathegory_click"

    .line 30
    .line 31
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public h(JLjava/lang/Long;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "option"

    .line 5
    .line 6
    const-string v1, "sub_sport_id"

    .line 7
    .line 8
    const-string v2, "sport_id"

    .line 9
    .line 10
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 11
    .line 12
    if-eqz p5, :cond_1

    .line 13
    .line 14
    new-instance p5, La/jo20;

    .line 15
    .line 16
    invoke-direct {p5}, La/jo20;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p5, v2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p5, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p5, v0, p4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p5}, La/jo20;->b()La/jo20;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "bet_gameview_market_unpin"

    .line 47
    .line 48
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    new-instance p5, La/jo20;

    .line 53
    .line 54
    invoke-direct {p5}, La/jo20;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p5, v2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    if-eqz p3, :cond_2

    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p5, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p5, v0, p4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p5}, La/jo20;->b()La/jo20;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "bet_gameview_market_pin"

    .line 85
    .line 86
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/Pair;

    .line 5
    .line 6
    const-string v1, "category_id"

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lkotlin/Pair;

    .line 12
    .line 13
    const-string v1, "screen"

    .line 14
    .line 15
    invoke-direct {p1, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    filled-new-array {v0, p1}, [Lkotlin/Pair;

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
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 27
    .line 28
    const-string p2, "main_block_more_call"

    .line 29
    .line 30
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public j(JJLjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "sport_id"

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
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    cmp-long p1, p3, p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "sub_sport_id"

    .line 22
    .line 23
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz p5, :cond_1

    .line 31
    .line 32
    const-string p1, "screen"

    .line 33
    .line 34
    invoke-virtual {v0, p1, p5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 42
    .line 43
    const-string p2, "bet_open_broadcast"

    .line 44
    .line 45
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public k(JJLjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "sport_id"

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
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    cmp-long p1, p3, p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "sub_sport_id"

    .line 22
    .line 23
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz p5, :cond_1

    .line 31
    .line 32
    const-string p1, "screen"

    .line 33
    .line 34
    invoke-virtual {v0, p1, p5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 42
    .line 43
    const-string p2, "bet_open_notifications"

    .line 44
    .line 45
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public m(JJLjava/lang/Long;Z)V
    .locals 2

    .line 1
    if-eqz p6, :cond_0

    .line 2
    .line 3
    const-string p6, "simulation"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p6, "real_match"

    .line 7
    .line 8
    :goto_0
    new-instance v0, La/jo20;

    .line 9
    .line 10
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "game_id"

    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "sport_id"

    .line 23
    .line 24
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    if-eqz p5, :cond_1

    .line 32
    .line 33
    invoke-virtual {p5}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    const-string p3, "sub_sport_id"

    .line 38
    .line 39
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p3, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    const-string p1, "option"

    .line 47
    .line 48
    invoke-virtual {v0, p1, p6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 56
    .line 57
    const-string p2, "simulation_match_call"

    .line 58
    .line 59
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public n(J)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "sport_id"

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
    const-string p1, "option"

    .line 16
    .line 17
    const-string p2, "zone"

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 27
    .line 28
    const-string p2, "broadcasting_first_play"

    .line 29
    .line 30
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public o(JJ)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "sport_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance p3, Lkotlin/Pair;

    .line 17
    .line 18
    const-string p4, "filter"

    .line 19
    .line 20
    invoke-direct {p3, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {p2, p3}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 32
    .line 33
    const-string p2, "bet_game_filter_call"

    .line 34
    .line 35
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public p(JJ)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v0, "sport_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance p3, Lkotlin/Pair;

    .line 17
    .line 18
    const-string p4, "filter"

    .line 19
    .line 20
    invoke-direct {p3, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {p2, p3}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 32
    .line 33
    const-string p2, "bet_subgame_call"

    .line 34
    .line 35
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "bet_game_point_call"

    .line 2
    .line 3
    const-string v1, "point"

    .line 4
    .line 5
    iget-object p0, p0, La/bn6;->b:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
