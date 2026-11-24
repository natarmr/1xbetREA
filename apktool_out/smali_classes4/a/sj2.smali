.class public final synthetic La/sj2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fk2;

.field public final synthetic c:La/tj2;


# direct methods
.method public synthetic constructor <init>(La/fk2;La/tj2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sj2;->a:B

    iput-object p1, p0, La/sj2;->b:La/fk2;

    iput-object p2, p0, La/sj2;->c:La/tj2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/sj2;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/sj2;->c:La/tj2;

    .line 4
    .line 5
    iget-object p0, p0, La/sj2;->b:La/fk2;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/fk2;->y:La/ifp;

    .line 16
    .line 17
    new-instance v0, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;

    .line 18
    .line 19
    iget-wide v2, v1, La/tj2;->a:J

    .line 20
    .line 21
    iget-object v1, v1, La/tj2;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;-><init>(JLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v1, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 30
    .line 31
    invoke-direct {v1, p0, v0}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/fk2;->H:La/kys0;

    .line 44
    .line 45
    iget-object v0, v1, La/tj2;->f:La/sgb;

    .line 46
    .line 47
    invoke-interface {v0}, La/sgb;->b()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    iget-object v0, v1, La/tj2;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, v2, v3, v0}, La/kys0;->d(JLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
