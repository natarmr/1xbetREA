.class public final Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;
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
        "org/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1",
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
.field public final synthetic a:La/lk5;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/lk5;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->a:La/lk5;

    .line 5
    .line 6
    iput-wide p2, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->a:La/lk5;

    .line 5
    .line 6
    iget-object v0, p1, La/lk5;->b:La/r9u;

    .line 7
    .line 8
    sget-object v1, La/ygp;->o:La/ygp;

    .line 9
    .line 10
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, La/lk5;->a:La/pru;

    .line 25
    .line 26
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/sff0;->g:La/mum0;

    .line 31
    .line 32
    iget-object p1, p1, La/mum0;->B:La/vcp;

    .line 33
    .line 34
    sget-object v0, La/vcp;->b:La/vcp;

    .line 35
    .line 36
    if-eq p1, v0, :cond_0

    .line 37
    .line 38
    sget-object p1, La/m4p;->S1:La/bek;

    .line 39
    .line 40
    new-instance v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 41
    .line 42
    const-wide/16 v5, -0x1

    .line 43
    .line 44
    const-wide/16 v7, -0x1

    .line 45
    .line 46
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->b:J

    .line 47
    .line 48
    iget-object v9, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct/range {v2 .. v9}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance p0, La/m4p;

    .line 57
    .line 58
    invoke-direct {p0}, La/m4p;-><init>()V

    .line 59
    .line 60
    .line 61
    sget-object p1, La/m4p;->U1:[La/iiy;

    .line 62
    .line 63
    aget-object p1, p1, v1

    .line 64
    .line 65
    iget-object v0, p0, La/m4p;->L1:La/khf0;

    .line 66
    .line 67
    invoke-virtual {v0, p0, p1, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_0
    sget-object p1, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 72
    .line 73
    new-instance v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 74
    .line 75
    const-wide/16 v5, -0x1

    .line 76
    .line 77
    const-wide/16 v7, -0x1

    .line 78
    .line 79
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->b:J

    .line 80
    .line 81
    iget-object v9, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct/range {v2 .. v9}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance p0, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 90
    .line 91
    invoke-direct {p0}, Lorg/xplatform/favorites/impl/presentation/category/e;-><init>()V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 95
    .line 96
    aget-object p1, p1, v1

    .line 97
    .line 98
    iget-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->L1:La/khf0;

    .line 99
    .line 100
    invoke-virtual {v0, p0, p1, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 101
    .line 102
    .line 103
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
