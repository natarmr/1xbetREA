.class public final Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen",
        "",
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
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->a:J

    .line 5
    .line 6
    iput-object p5, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/a6s0;->S1:La/j6m0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/a6s0;

    .line 10
    .line 11
    invoke-direct {p1}, La/a6s0;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/a6s0;->U1:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    iget-object v2, p1, La/a6s0;->N1:La/r34;

    .line 20
    .line 21
    iget-wide v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->a:J

    .line 22
    .line 23
    invoke-virtual {v2, p1, v1, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    aget-object v1, v0, v1

    .line 28
    .line 29
    iget-object v2, p1, La/a6s0;->O1:La/phf0;

    .line 30
    .line 31
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, p1, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    aget-object v0, v0, v1

    .line 38
    .line 39
    iget-object v1, p1, La/a6s0;->P1:La/r34;

    .line 40
    .line 41
    iget-wide v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;->c:J

    .line 42
    .line 43
    invoke-virtual {v1, p1, v0, v2, v3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/vfc;->I(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)Ljava/lang/String;

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
