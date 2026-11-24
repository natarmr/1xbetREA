.class public final Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
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
.field public final a:Ljava/lang/String;

.field public final b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;->b:J

    .line 7
    .line 8
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
    sget-object p1, La/hnv0;->Q1:La/kys0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/hnv0;

    .line 10
    .line 11
    invoke-direct {p1}, La/hnv0;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/hnv0;->R1:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    iget-object v2, p1, La/hnv0;->K1:La/phf0;

    .line 20
    .line 21
    iget-object v3, p0, Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    aget-object v0, v0, v1

    .line 28
    .line 29
    iget-object v1, p1, La/hnv0;->L1:La/r34;

    .line 30
    .line 31
    iget-wide v2, p0, Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;->b:J

    .line 32
    .line 33
    invoke-virtual {v1, p1, v0, v2, v3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 34
    .line 35
    .line 36
    return-object p1
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
