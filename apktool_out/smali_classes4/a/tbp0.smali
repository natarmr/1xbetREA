.class public final synthetic La/tbp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wbp0;


# direct methods
.method public synthetic constructor <init>(La/wbp0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tbp0;->a:B

    iput-object p1, p0, La/tbp0;->b:La/wbp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/tbp0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tbp0;->b:La/wbp0;

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
    iget-object v0, p0, La/wbp0;->u:La/vqc;

    .line 14
    .line 15
    new-instance v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 16
    .line 17
    iget-object v2, p0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 18
    .line 19
    move-object v4, v2

    .line 20
    iget-wide v2, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 21
    .line 22
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->b:J

    .line 23
    .line 24
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/mbp0;

    .line 29
    .line 30
    iget-object v6, p0, La/mbp0;->m:Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;-><init>(JJLjava/lang/Integer;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsResultsScreen$1;

    .line 39
    .line 40
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsResultsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/wbp0;->u:La/vqc;

    .line 53
    .line 54
    iget-object p0, p0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 55
    .line 56
    iget-wide v1, p0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 57
    .line 58
    new-instance p0, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 59
    .line 60
    const-wide/16 v3, 0x28

    .line 61
    .line 62
    invoke-direct {p0, v1, v2, v3, v4}, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;-><init>(JJ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v1, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$transferScreen$1;

    .line 69
    .line 70
    invoke-direct {v1, v0, p0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$transferScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, La/wbp0;->u:La/vqc;

    .line 83
    .line 84
    new-instance v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

    .line 85
    .line 86
    iget-object p0, p0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 87
    .line 88
    iget-wide v2, p0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 89
    .line 90
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->c:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v1, v2, v3, p0}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;-><init>(JLjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsAchievementScreen$1;

    .line 99
    .line 100
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsAchievementScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
