.class public final synthetic La/kbp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/ccp;

.field public final synthetic c:La/tnp0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(ZLa/ccp;La/tnp0;Ljava/lang/String;JLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/kbp;->a:Z

    iput-object p2, p0, La/kbp;->b:La/ccp;

    iput-object p3, p0, La/kbp;->c:La/tnp0;

    iput-object p4, p0, La/kbp;->d:Ljava/lang/String;

    iput-wide p5, p0, La/kbp;->e:J

    iput-object p7, p0, La/kbp;->f:Ljava/lang/String;

    iput-boolean p8, p0, La/kbp;->g:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, La/kbp;->a:Z

    .line 7
    .line 8
    iget-object v1, p0, La/kbp;->b:La/ccp;

    .line 9
    .line 10
    iget-object v5, p0, La/kbp;->c:La/tnp0;

    .line 11
    .line 12
    iget-object v6, p0, La/kbp;->d:Ljava/lang/String;

    .line 13
    .line 14
    iget-wide v9, p0, La/kbp;->e:J

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v2, v1, La/ccp;->K:La/ifp;

    .line 19
    .line 20
    invoke-interface {v5}, La/tnp0;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-interface {v5}, La/tnp0;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    iget-object v11, p0, La/kbp;->f:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual/range {v2 .. v11}, La/ifp;->a(JLa/tnp0;Ljava/lang/String;JJLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-boolean p0, p0, La/kbp;->g:Z

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    iget-object p0, v1, La/ccp;->o0:La/kys0;

    .line 40
    .line 41
    invoke-interface {v5}, La/tnp0;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 49
    .line 50
    invoke-direct {p0, v0, v1}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p0, v1, La/ccp;->K:La/ifp;

    .line 55
    .line 56
    move-object v13, v6

    .line 57
    new-instance v6, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 58
    .line 59
    invoke-interface {v5}, La/tnp0;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v7

    .line 63
    invoke-interface {v5}, La/tnp0;->c()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    move-wide v11, v9

    .line 68
    move-wide v9, v0

    .line 69
    invoke-direct/range {v6 .. v13}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 76
    .line 77
    invoke-direct {v0, p0, v6}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 78
    .line 79
    .line 80
    move-object p0, v0

    .line 81
    :goto_0
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0
.end method
