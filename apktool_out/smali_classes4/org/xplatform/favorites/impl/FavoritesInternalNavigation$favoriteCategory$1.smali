.class public final Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;
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
        "org/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1",
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
.field public final synthetic a:La/ifp;

.field public final synthetic b:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;


# direct methods
.method public constructor <init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;->a:La/ifp;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;->b:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;->a:La/ifp;

    .line 5
    .line 6
    iget-object v0, p1, La/ifp;->a:La/r9u;

    .line 7
    .line 8
    sget-object v1, La/ygp;->o:La/ygp;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    iget-object p0, p0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;->b:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, La/ifp;->b:La/pru;

    .line 30
    .line 31
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, La/sff0;->g:La/mum0;

    .line 36
    .line 37
    iget-object p1, p1, La/mum0;->B:La/vcp;

    .line 38
    .line 39
    sget-object v0, La/vcp;->b:La/vcp;

    .line 40
    .line 41
    if-eq p1, v0, :cond_0

    .line 42
    .line 43
    sget-object p1, La/m4p;->S1:La/bek;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p1, La/m4p;

    .line 49
    .line 50
    invoke-direct {p1}, La/m4p;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v0, La/m4p;->U1:[La/iiy;

    .line 54
    .line 55
    aget-object v0, v0, v1

    .line 56
    .line 57
    iget-object v1, p1, La/m4p;->L1:La/khf0;

    .line 58
    .line 59
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_0
    sget-object p1, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance p1, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 69
    .line 70
    invoke-direct {p1}, Lorg/xplatform/favorites/impl/presentation/category/e;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 74
    .line 75
    aget-object v0, v0, v1

    .line 76
    .line 77
    iget-object v1, p1, Lorg/xplatform/favorites/impl/presentation/category/e;->L1:La/khf0;

    .line 78
    .line 79
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 80
    .line 81
    .line 82
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
