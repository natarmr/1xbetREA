.class public abstract La/pfp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;)La/zs2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object p0, La/zs2;->b:La/zs2;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object p0, La/zs2;->i:La/zs2;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_2
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    sget-object p0, La/zs2;->g:La/zs2;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    :goto_0
    sget-object p0, La/zs2;->d:La/zs2;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_5
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;

    .line 41
    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_6
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;

    .line 46
    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    :goto_1
    sget-object p0, La/zs2;->c:La/zs2;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_7
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;

    .line 53
    .line 54
    if-eqz v0, :cond_8

    .line 55
    .line 56
    sget-object p0, La/zs2;->e:La/zs2;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_8
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;

    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    sget-object p0, La/zs2;->f:La/zs2;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_9
    instance-of p0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;

    .line 67
    .line 68
    if-eqz p0, :cond_a

    .line 69
    .line 70
    sget-object p0, La/zs2;->h:La/zs2;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_a
    :goto_2
    sget-object p0, La/zs2;->j:La/zs2;

    .line 74
    .line 75
    return-object p0
.end method

.method public static final b(Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;)La/ofp;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object p0, La/ofp;->b:La/ofp;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object p0, La/ofp;->i:La/ofp;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_2
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    sget-object p0, La/ofp;->g:La/ofp;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    :goto_0
    sget-object p0, La/ofp;->d:La/ofp;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_5
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;

    .line 41
    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_6
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;

    .line 46
    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    :goto_1
    sget-object p0, La/ofp;->c:La/ofp;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_7
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;

    .line 53
    .line 54
    if-eqz v0, :cond_8

    .line 55
    .line 56
    sget-object p0, La/ofp;->e:La/ofp;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_8
    instance-of v0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;

    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    sget-object p0, La/ofp;->f:La/ofp;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_9
    instance-of p0, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;

    .line 67
    .line 68
    if-eqz p0, :cond_a

    .line 69
    .line 70
    sget-object p0, La/ofp;->h:La/ofp;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_a
    :goto_2
    sget-object p0, La/ofp;->j:La/ofp;

    .line 74
    .line 75
    return-object p0
.end method
