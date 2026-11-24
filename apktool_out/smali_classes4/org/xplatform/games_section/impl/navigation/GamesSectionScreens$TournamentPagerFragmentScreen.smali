.class public final Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen",
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

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->c:Ljava/lang/String;

    .line 9
    .line 10
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
    sget-object p1, La/u2s0;->X1:La/s2m0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/u2s0;

    .line 10
    .line 11
    invoke-direct {p1}, La/u2s0;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/u2s0;->Y1:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    iget-object v2, p1, La/u2s0;->P1:La/cgx0;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, p1, v1, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p1, La/u2s0;->Q1:La/phf0;

    .line 26
    .line 27
    aget-object v2, v0, v3

    .line 28
    .line 29
    iget-object v3, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, p1, v2, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    aget-object v1, v0, v1

    .line 36
    .line 37
    iget-object v2, p1, La/u2s0;->R1:La/phf0;

    .line 38
    .line 39
    iget-object v3, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, p1, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    aget-object v0, v0, v1

    .line 46
    .line 47
    iget-object v1, p1, La/u2s0;->S1:La/phf0;

    .line 48
    .line 49
    iget-object p0, p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$TournamentPagerFragmentScreen;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, p1, v0, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
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
