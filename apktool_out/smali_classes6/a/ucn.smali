.class public final La/ucn;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V
    .locals 6

    .line 1
    const v0, -0xcab0fa9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p5

    .line 23
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p4, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_6

    .line 42
    .line 43
    and-int/lit16 v1, p5, 0x200

    .line 44
    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p4, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    :goto_3
    if-eqz v1, :cond_5

    .line 57
    .line 58
    const/16 v1, 0x100

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_5
    const/16 v1, 0x80

    .line 62
    .line 63
    :goto_4
    or-int/2addr v0, v1

    .line 64
    :cond_6
    and-int/lit16 v1, v0, 0x93

    .line 65
    .line 66
    const/16 v2, 0x92

    .line 67
    .line 68
    if-eq v1, v2, :cond_7

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    goto :goto_5

    .line 72
    :cond_7
    const/4 v1, 0x0

    .line 73
    :goto_5
    and-int/lit8 v2, v0, 0x1

    .line 74
    .line 75
    invoke-virtual {p4, v2, v1}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_8

    .line 80
    .line 81
    and-int/lit16 v0, v0, 0x3fe

    .line 82
    .line 83
    invoke-static {p1, p2, p3, p4, v0}, La/tfa0;->a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V

    .line 84
    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_8
    invoke-virtual {p4}, La/fet;->X()V

    .line 88
    .line 89
    .line 90
    :goto_6
    invoke-virtual {p4}, La/fet;->u()La/yfe0;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    if-eqz p4, :cond_9

    .line 95
    .line 96
    new-instance v0, La/e0i;

    .line 97
    .line 98
    move-object v1, p0

    .line 99
    move-object v2, p1

    .line 100
    move-object v3, p2

    .line 101
    move-object v4, p3

    .line 102
    move v5, p5

    .line 103
    invoke-direct/range {v0 .. v5}, La/e0i;-><init>(La/ucn;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;I)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p4, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 107
    .line 108
    :cond_9
    return-void
.end method
