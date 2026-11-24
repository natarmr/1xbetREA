.class public final Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "games_list"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;->a:J

    .line 8
    .line 9
    iput-object p3, p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;->b:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/gs60;->R1:La/uuz;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/gs60;

    .line 15
    .line 16
    invoke-direct {v0}, La/gs60;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/gs60;->S1:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aget-object v1, v1, v2

    .line 23
    .line 24
    iget-object v2, v0, La/gs60;->K1:La/phf0;

    .line 25
    .line 26
    const-string v3, "OneXGamesTabContainerFragment.UM_RESULT_KEY"

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;->a:J

    .line 32
    .line 33
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v1, Lkotlin/Pair;

    .line 38
    .line 39
    const-string v2, "GAME_ID_TO_OPEN_BUNDLE_KEY"

    .line 40
    .line 41
    invoke-direct {v1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lkotlin/Pair;

    .line 45
    .line 46
    const-string v2, "WEB_GAME_SESSION_ID"

    .line 47
    .line 48
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    filled-new-array {v1, p0}, [Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
