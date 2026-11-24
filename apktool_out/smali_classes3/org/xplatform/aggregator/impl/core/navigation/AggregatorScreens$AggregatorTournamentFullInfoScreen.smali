.class public final Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen",
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
.field public final a:J

.field public final b:La/s9s0;

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method public constructor <init>(JLa/s9s0;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->a:J

    .line 11
    .line 12
    iput-object p3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->b:La/s9s0;

    .line 13
    .line 14
    iput-object p4, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p5, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->d:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/au1;->Z1:La/jdk0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->b:La/s9s0;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/au1;

    .line 20
    .line 21
    invoke-direct {v1}, La/au1;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/au1;->a2:[La/iiy;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    aget-object v3, v2, v3

    .line 28
    .line 29
    iget-object v4, v1, La/au1;->S1:La/r34;

    .line 30
    .line 31
    iget-wide v5, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->a:J

    .line 32
    .line 33
    invoke-virtual {v4, v1, v3, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    aget-object v3, v2, v3

    .line 38
    .line 39
    iget-object v4, v1, La/au1;->U1:La/phf0;

    .line 40
    .line 41
    invoke-virtual {v4, v1, v3, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x3

    .line 45
    aget-object p1, v2, p1

    .line 46
    .line 47
    iget-object v3, v1, La/au1;->V1:La/yzn0;

    .line 48
    .line 49
    invoke-virtual {v3, v1, p1, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x4

    .line 53
    aget-object p1, v2, p1

    .line 54
    .line 55
    iget-object v0, v1, La/au1;->W1:La/cgx0;

    .line 56
    .line 57
    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;->d:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1, p1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 60
    .line 61
    .line 62
    return-object v1
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
