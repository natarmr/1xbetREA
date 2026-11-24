.class public final synthetic La/zzo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b0p0;


# direct methods
.method public synthetic constructor <init>(La/b0p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zzo0;->a:B

    iput-object p1, p0, La/zzo0;->b:La/b0p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/zzo0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zzo0;->b:La/b0p0;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/b0p0;->C:La/kud;

    .line 14
    .line 15
    iget-object p0, p0, La/b0p0;->o:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 16
    .line 17
    iget-wide v1, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 18
    .line 19
    long-to-int p0, v1

    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lorg/xplatform/coupon/impl/generate_coupon/presentation/screen/GenerateCouponsScreen;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lorg/xplatform/coupon/impl/generate_coupon/presentation/screen/GenerateCouponsScreen;-><init>(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/b0p0;->y:La/lk5;

    .line 49
    .line 50
    iget-object p0, p0, La/b0p0;->o:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 51
    .line 52
    iget-wide v1, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 53
    .line 54
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v3, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;

    .line 63
    .line 64
    invoke-direct {v3, v0, v1, v2, p0}, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;-><init>(La/lk5;JLjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
