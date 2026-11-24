.class public final synthetic La/n4p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q4p0;

.field public final synthetic c:La/xcp;

.field public final synthetic d:La/rnp0;


# direct methods
.method public synthetic constructor <init>(La/q4p0;La/rnp0;La/xcp;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/n4p0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n4p0;->b:La/q4p0;

    iput-object p2, p0, La/n4p0;->d:La/rnp0;

    iput-object p3, p0, La/n4p0;->c:La/xcp;

    return-void
.end method

.method public synthetic constructor <init>(La/q4p0;La/xcp;La/rnp0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/n4p0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n4p0;->b:La/q4p0;

    iput-object p2, p0, La/n4p0;->c:La/xcp;

    iput-object p3, p0, La/n4p0;->d:La/rnp0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/n4p0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n4p0;->d:La/rnp0;

    .line 4
    .line 5
    iget-object v2, p0, La/n4p0;->c:La/xcp;

    .line 6
    .line 7
    iget-object p0, p0, La/n4p0;->b:La/q4p0;

    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/q4p0;->v:La/ifp;

    .line 18
    .line 19
    new-instance v3, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 20
    .line 21
    iget-wide v4, v2, La/xcp;->a:J

    .line 22
    .line 23
    iget-object v10, v2, La/xcp;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v6, v2, La/xcp;->e:J

    .line 26
    .line 27
    iget-wide v8, v1, La/rnp0;->c:J

    .line 28
    .line 29
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 36
    .line 37
    invoke-direct {v0, p0, v3}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/q4p0;->z:La/vqc;

    .line 50
    .line 51
    new-instance v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 52
    .line 53
    iget-wide v4, v1, La/rnp0;->c:J

    .line 54
    .line 55
    iget-wide v6, v1, La/rnp0;->a:J

    .line 56
    .line 57
    iget-object v8, v2, La/xcp;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;

    .line 66
    .line 67
    invoke-direct {v0, p0, v3}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
