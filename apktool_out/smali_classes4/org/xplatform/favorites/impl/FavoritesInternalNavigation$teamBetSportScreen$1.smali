.class public final Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1",
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
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->a:J

    .line 5
    .line 6
    iput-object p7, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->d:J

    .line 11
    .line 12
    iput-object p8, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/i0p0;->Z1:La/j6m0;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 7
    .line 8
    iget-wide v5, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->d:J

    .line 9
    .line 10
    iget-object v8, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->e:Ljava/lang/String;

    .line 11
    .line 12
    iget-wide v1, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->a:J

    .line 13
    .line 14
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->c:J

    .line 15
    .line 16
    iget-object v7, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$teamBetSportScreen$1;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v8}, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;-><init>(JJJLjava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p0, La/i0p0;

    .line 25
    .line 26
    invoke-direct {p0}, La/i0p0;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object p1, La/i0p0;->a2:[La/iiy;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    aget-object p1, p1, v1

    .line 33
    .line 34
    iget-object v1, p0, La/i0p0;->M1:La/khf0;

    .line 35
    .line 36
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 37
    .line 38
    .line 39
    return-object p0
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
