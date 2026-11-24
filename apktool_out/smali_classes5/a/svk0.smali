.class public final synthetic La/svk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iwk0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/iwk0;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/svk0;->a:B

    iput-object p1, p0, La/svk0;->b:La/iwk0;

    iput-object p2, p0, La/svk0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/svk0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/svk0;->b:La/iwk0;

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
    iget-object v0, v1, La/iwk0;->e0:La/g9m0;

    .line 14
    .line 15
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, La/dvk0;

    .line 20
    .line 21
    iget-object v2, v2, La/dvk0;->C:La/ttk0;

    .line 22
    .line 23
    iget-wide v2, v2, La/ttk0;->d:J

    .line 24
    .line 25
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/dvk0;

    .line 30
    .line 31
    iget-object v1, v1, La/dvk0;->C:La/ttk0;

    .line 32
    .line 33
    iget v1, v1, La/ttk0;->c:I

    .line 34
    .line 35
    new-instance v4, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;

    .line 36
    .line 37
    iget-object p0, p0, La/svk0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v4, p0, v1, v2, v3}, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;-><init>(Ljava/lang/String;IJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p0, Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/screen/RatingStatisticScreen;

    .line 46
    .line 47
    invoke-direct {p0, v4}, Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/screen/RatingStatisticScreen;-><init>(Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v0, v1, La/iwk0;->P:La/gcv0;

    .line 60
    .line 61
    new-instance v2, Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;

    .line 62
    .line 63
    iget-object v3, v1, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 64
    .line 65
    iget v4, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 66
    .line 67
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, La/dvk0;

    .line 72
    .line 73
    iget-object v3, v3, La/dvk0;->C:La/ttk0;

    .line 74
    .line 75
    iget-wide v6, v3, La/ttk0;->d:J

    .line 76
    .line 77
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/dvk0;

    .line 82
    .line 83
    iget-object v1, v1, La/dvk0;->C:La/ttk0;

    .line 84
    .line 85
    iget v5, v1, La/ttk0;->c:I

    .line 86
    .line 87
    iget-object v3, p0, La/svk0;->c:Ljava/lang/String;

    .line 88
    .line 89
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance p0, Lorg/xplatform/special_event/impl/who_win/navigation/WhoWinScreenFactoryImpl$getScreen$1;

    .line 96
    .line 97
    invoke-direct {p0, v2}, Lorg/xplatform/special_event/impl/who_win/navigation/WhoWinScreenFactoryImpl$getScreen$1;-><init>(Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
