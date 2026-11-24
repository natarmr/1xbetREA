.class public final La/ifp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;

.field public final b:La/pru;

.field public final c:La/vqc;


# direct methods
.method public constructor <init>(La/r9u;La/pru;La/vqc;La/kys0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ifp;->a:La/r9u;

    .line 8
    .line 9
    iput-object p2, p0, La/ifp;->b:La/pru;

    .line 10
    .line 11
    iput-object p3, p0, La/ifp;->c:La/vqc;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JLa/tnp0;Ljava/lang/String;JJLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 11

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ifp;->b:La/pru;

    .line 5
    .line 6
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-boolean v1, v1, La/sff0;->B0:Z

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    sget-object v1, La/ygp;->u:La/ygp;

    .line 15
    .line 16
    iget-object v2, p0, La/ifp;->a:La/r9u;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    instance-of v0, p3, La/rnp0;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-wide/16 v0, 0x28

    .line 39
    .line 40
    cmp-long v0, p5, v0

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    new-instance v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 45
    .line 46
    move-wide v4, p1

    .line 47
    move-object v6, p4

    .line 48
    move-wide/from16 v2, p7

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/ifp;->c:La/vqc;

    .line 54
    .line 55
    new-instance p1, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;

    .line 56
    .line 57
    invoke-direct {p1, p0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_0
    new-instance v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 62
    .line 63
    move-object p1, p3

    .line 64
    check-cast p1, La/rnp0;

    .line 65
    .line 66
    iget-wide v3, p1, La/rnp0;->a:J

    .line 67
    .line 68
    iget-wide v5, p1, La/rnp0;->b:J

    .line 69
    .line 70
    move-object v9, p4

    .line 71
    move-wide/from16 v7, p7

    .line 72
    .line 73
    invoke-direct/range {v2 .. v9}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 77
    .line 78
    invoke-direct {p1, p0, v2}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_1
    instance-of p0, p3, La/snp0;

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    new-instance v2, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;

    .line 87
    .line 88
    move-wide v3, p1

    .line 89
    move-object v9, p4

    .line 90
    move-wide/from16 v5, p5

    .line 91
    .line 92
    move-wide/from16 v7, p7

    .line 93
    .line 94
    move-object/from16 v10, p9

    .line 95
    .line 96
    invoke-direct/range {v2 .. v10}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;-><init>(JJJLjava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    return-object p0

    .line 105
    :cond_3
    invoke-interface {p3}, La/tnp0;->c()J

    .line 106
    .line 107
    .line 108
    move-result-wide p1

    .line 109
    const-wide/16 v1, 0xbd

    .line 110
    .line 111
    cmp-long p1, p1, v1

    .line 112
    .line 113
    if-nez p1, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object p1, p1, La/sff0;->c:La/ech;

    .line 120
    .line 121
    iget-boolean p1, p1, La/ech;->d:Z

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    invoke-interface {p3}, La/tnp0;->a()J

    .line 126
    .line 127
    .line 128
    move-result-wide p0

    .line 129
    new-instance p2, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 130
    .line 131
    invoke-direct {p2, p0, p1}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 132
    .line 133
    .line 134
    return-object p2

    .line 135
    :cond_4
    new-instance v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 136
    .line 137
    invoke-interface {p3}, La/tnp0;->a()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    invoke-interface {p3}, La/tnp0;->c()J

    .line 142
    .line 143
    .line 144
    move-result-wide v5

    .line 145
    move-object v9, p4

    .line 146
    move-wide/from16 v7, p7

    .line 147
    .line 148
    invoke-direct/range {v2 .. v9}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance p1, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 152
    .line 153
    invoke-direct {p1, p0, v2}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 154
    .line 155
    .line 156
    return-object p1
.end method
