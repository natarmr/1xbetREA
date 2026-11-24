.class public final La/ih5;
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
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/ih5;->a:La/kt2;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Ljava/lang/String;La/x3t;Ljava/lang/String;La/lz60;Ljava/lang/Integer;)V
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
    const-string v1, "game_id"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    if-eqz p2, :cond_1

    .line 14
    .line 15
    const-string p1, "filter"

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_1
    const-string p1, "screen"

    .line 21
    .line 22
    iget-object p2, p3, La/x3t;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    if-eqz p4, :cond_2

    .line 28
    .line 29
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-lez p1, :cond_2

    .line 34
    .line 35
    const-string p1, "session_id"

    .line 36
    .line 37
    invoke-virtual {v0, p1, p4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    if-eqz p5, :cond_3

    .line 41
    .line 42
    sget-object p1, La/lz60;->Companion:La/iz60;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {p5}, La/iz60;->b(La/lz60;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "point"

    .line 56
    .line 57
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_3
    if-eqz p6, :cond_4

    .line 61
    .line 62
    const-string p1, "action"

    .line 63
    .line 64
    invoke-virtual {v0, p1, p6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 72
    .line 73
    const-string p2, "games_promos_bonus_activated"

    .line 74
    .line 75
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public b(JJJLa/r1g;ZZ)V
    .locals 1

    .line 1
    if-eqz p8, :cond_0

    .line 2
    .line 3
    const-string p8, "live"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p8, "line"

    .line 7
    .line 8
    :goto_0
    if-eqz p9, :cond_1

    .line 9
    .line 10
    const-string p9, "remove"

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    const-string p9, "add_favor"

    .line 14
    .line 15
    :goto_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v0, "sport_id"

    .line 22
    .line 23
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p3, Lkotlin/Pair;

    .line 31
    .line 32
    const-string p4, "sub_sport_id"

    .line 33
    .line 34
    invoke-direct {p3, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance p4, Lkotlin/Pair;

    .line 42
    .line 43
    const-string p5, "championship_id"

    .line 44
    .line 45
    invoke-direct {p4, p5, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p7, La/r1g;->a:Ljava/lang/String;

    .line 49
    .line 50
    new-instance p5, Lkotlin/Pair;

    .line 51
    .line 52
    const-string p6, "screen"

    .line 53
    .line 54
    invoke-direct {p5, p6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p6, Lkotlin/Pair;

    .line 58
    .line 59
    const-string p1, "point"

    .line 60
    .line 61
    invoke-direct {p6, p1, p8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p7, Lkotlin/Pair;

    .line 65
    .line 66
    const-string p1, "action"

    .line 67
    .line 68
    invoke-direct {p7, p1, p9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    filled-new-array/range {p2 .. p7}, [Lkotlin/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 80
    .line 81
    const-string p2, "cyber_champ_favor_add"

    .line 82
    .line 83
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "change_bill_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "cybersport_filter_call"

    .line 2
    .line 3
    const-string v1, "filter"

    .line 4
    .line 5
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(ILa/k7k;)V
    .locals 2

    .line 1
    iget-object p2, p2, La/k7k;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v1, "screen"

    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v1, "game_id"

    .line 17
    .line 18
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, p2}, [Lkotlin/Pair;

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
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 30
    .line 31
    const-string p2, "deposit_call"

    .line 32
    .line 33
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public f(La/k7k;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "screen"

    .line 5
    .line 6
    iget-object p1, p1, La/k7k;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 9
    .line 10
    const-string v1, "deposit_call"

    .line 11
    .line 12
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    const-string v1, "acc_settings"

    .line 4
    .line 5
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 6
    .line 7
    const-string v2, "deposit_call"

    .line 8
    .line 9
    invoke-static {v0, v1, p0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "option"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 16
    .line 17
    const-string v0, "cyber_discipline_section_switch"

    .line 18
    .line 19
    invoke-interface {p0, v0, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public i(ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v1, "index"

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v1, "action"

    .line 15
    .line 16
    invoke-direct {p1, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, p1}, [Lkotlin/Pair;

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
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 28
    .line 29
    const-string p2, "onboarding_sport_click"

    .line 30
    .line 31
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public j(ILa/r1g;)V
    .locals 2

    .line 1
    iget-object p2, p2, La/r1g;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v1, "screen"

    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v1, "promo_id"

    .line 17
    .line 18
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, p2}, [Lkotlin/Pair;

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
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 30
    .line 31
    const-string p2, "cybersport_actions_choose"

    .line 32
    .line 33
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public k(JLa/r1g;JJZ)V
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
    const-string v0, "championship_id"

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p3, La/r1g;->a:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p3, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v0, "screen"

    .line 17
    .line 18
    invoke-direct {p3, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p4, Lkotlin/Pair;

    .line 26
    .line 27
    const-string p5, "sport_id"

    .line 28
    .line 29
    invoke-direct {p4, p5, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p5, Lkotlin/Pair;

    .line 37
    .line 38
    const-string p6, "sub_sport_id"

    .line 39
    .line 40
    invoke-direct {p5, p6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const-string p1, "point"

    .line 44
    .line 45
    if-eqz p8, :cond_0

    .line 46
    .line 47
    new-instance p6, Lkotlin/Pair;

    .line 48
    .line 49
    const-string p7, "live"

    .line 50
    .line 51
    invoke-direct {p6, p1, p7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p6, Lkotlin/Pair;

    .line 56
    .line 57
    const-string p7, "line"

    .line 58
    .line 59
    invoke-direct {p6, p1, p7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    filled-new-array {p2, p3, p4, p5, p6}, [Lkotlin/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 71
    .line 72
    const-string p2, "cyber_champ_call"

    .line 73
    .line 74
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V
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
    const-wide/16 p1, -0x1

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
    const-string p1, "screen"

    .line 31
    .line 32
    iget-object p2, p5, La/r1g;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    if-eqz p6, :cond_1

    .line 38
    .line 39
    const-string p1, "championship_id"

    .line 40
    .line 41
    invoke-virtual {v0, p1, p6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    if-eqz p7, :cond_3

    .line 45
    .line 46
    invoke-virtual {p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-string p1, "live"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string p1, "line"

    .line 56
    .line 57
    :goto_0
    const-string p2, "point"

    .line 58
    .line 59
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 67
    .line 68
    const-string p2, "cybersport_popular_choose"

    .line 69
    .line 70
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public m(IZLjava/lang/String;La/lz60;)V
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
    const-string p1, "single"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "multy"

    .line 21
    .line 22
    :goto_0
    const-string p2, "filter"

    .line 23
    .line 24
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p1, "screen"

    .line 28
    .line 29
    const-string p2, "lucky_wheel"

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-lez p1, :cond_1

    .line 39
    .line 40
    const-string p1, "session_id"

    .line 41
    .line 42
    invoke-virtual {v0, p1, p3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    sget-object p1, La/lz60;->Companion:La/iz60;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p4}, La/iz60;->b(La/lz60;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "point"

    .line 59
    .line 60
    invoke-virtual {v0, p2, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 68
    .line 69
    const-string p2, "games_promos_bonus_activated"

    .line 70
    .line 71
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/r1g;->b:La/r1g;

    .line 5
    .line 6
    new-instance v0, La/jo20;

    .line 7
    .line 8
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "option"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 21
    .line 22
    const-string v0, "cyber_result_date"

    .line 23
    .line 24
    invoke-interface {p0, v0, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "cyber_result_bracket_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(La/r1g;J)V
    .locals 3

    .line 1
    new-instance v0, La/jo20;

    .line 2
    .line 3
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "screen"

    .line 7
    .line 8
    iget-object p1, p1, La/r1g;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string p1, "sport_id"

    .line 14
    .line 15
    const-wide/16 v1, 0x28

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, p1, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    const-string p1, "sub_sport_id"

    .line 25
    .line 26
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {v0, p1, p2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p0, p0, La/ih5;->a:La/kt2;

    .line 38
    .line 39
    const-string p2, "cyber_team_call"

    .line 40
    .line 41
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
