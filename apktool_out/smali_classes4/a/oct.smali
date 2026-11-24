.class public final La/oct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/uxs0;

.field public final b:La/r9u;


# direct methods
.method public constructor <init>(La/uxs0;La/mj8;La/bj5;La/r9u;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/oct;->a:La/uxs0;

    .line 8
    .line 9
    iput-object p4, p0, La/oct;->b:La/r9u;

    .line 10
    .line 11
    return-void
.end method

.method public static f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;
    .locals 7

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p7, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    sget-object p3, La/d270;->j:La/d270;

    .line 13
    .line 14
    :cond_1
    move-object v3, p3

    .line 15
    and-int/lit8 p1, p7, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    :cond_2
    move v4, p4

    .line 21
    and-int/lit8 p1, p7, 0x8

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    sget-object p5, La/t270;->a:La/t270;

    .line 26
    .line 27
    :cond_3
    and-int/lit8 p1, p7, 0x10

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    const-string p6, ""

    .line 32
    .line 33
    :cond_4
    move-object v6, p6

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 47
    .line 48
    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_8

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    if-eq p0, p1, :cond_7

    .line 56
    .line 57
    const/4 p1, 0x2

    .line 58
    if-eq p0, p1, :cond_6

    .line 59
    .line 60
    const/4 p1, 0x3

    .line 61
    if-ne p0, p1, :cond_5

    .line 62
    .line 63
    sget-object p0, La/r270;->d:La/r270;

    .line 64
    .line 65
    :goto_0
    move-object v5, p0

    .line 66
    goto :goto_1

    .line 67
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_6
    sget-object p0, La/r270;->c:La/r270;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    sget-object p0, La/r270;->b:La/r270;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    sget-object p0, La/r270;->a:La/r270;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;-><init>(JLa/d270;ILa/r270;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method


# virtual methods
.method public final a(JLa/csr;Ljava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p4, La/s470;->Companion:La/r470;

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, La/r470;->a(J)La/s470;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    sget-object v0, La/s470;->p:La/s470;

    .line 17
    .line 18
    if-ne p4, v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    iget-object p0, p0, La/oct;->b:La/r9u;

    .line 26
    .line 27
    invoke-static {p1, p2, p3, p0}, La/jtv;->L0(JLa/csr;La/r9u;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final b(JLa/csr;ZLjava/lang/String;)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/oct;->a:La/uxs0;

    .line 8
    .line 9
    const/4 v6, 0x4

    .line 10
    move-wide v1, p1

    .line 11
    move-object v3, p3

    .line 12
    move v4, p4

    .line 13
    move-object v5, p5

    .line 14
    invoke-static/range {v0 .. v6}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final c(JLa/csr;Ljava/lang/String;)Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;-><init>(JLa/csr;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 1

    .line 1
    sget-object v0, La/ygp;->r1:La/ygp;

    .line 2
    .line 3
    iget-object p0, p0, La/oct;->b:La/r9u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$JackpotFragmentScreen;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$JackpotOldFragmentScreen;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public final e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 2

    .line 1
    sget-object v0, La/csr;->e:La/csr;

    .line 2
    .line 3
    iget-object p0, p0, La/oct;->b:La/r9u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v1, La/ygp;->s:La/ygp;

    .line 12
    .line 13
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    new-instance p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$LuckyWheelDsScreen;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lorg/xplatform/games_list/features/common/OneXGamesScreens$LuckyWheelDsScreen;-><init>(La/csr;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    new-instance p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$LuckyWheelScreen;

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lorg/xplatform/games_list/features/common/OneXGamesScreens$LuckyWheelScreen;-><init>(La/csr;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method
