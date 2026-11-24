.class public final synthetic La/ji8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ni8;


# direct methods
.method public synthetic constructor <init>(La/ni8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ji8;->a:B

    iput-object p1, p0, La/ji8;->b:La/ni8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ji8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ji8;->b:La/ni8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 9
    .line 10
    sget-object v0, La/ni8;->U1:La/yk5;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/ni8;->Q1:La/phf0;

    .line 16
    .line 17
    sget-object v1, La/ni8;->V1:[La/iiy;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    invoke-virtual {v0, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-lez v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aget-object v1, v1, v2

    .line 37
    .line 38
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v3, p1, v0}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    instance-of v0, p1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, La/ni8;->G0()La/k3t0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v0, La/mh8;

    .line 54
    .line 55
    check-cast p1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 56
    .line 57
    iget-wide v1, p1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;->a:J

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, La/mh8;-><init>(J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget-object v0, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, La/ni8;->G0()La/k3t0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    sget-object p1, La/oh8;->a:La/oh8;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    sget-object p0, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    :goto_1
    return-object p0

    .line 100
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    sget-object p1, La/ni8;->U1:La/yk5;

    .line 107
    .line 108
    invoke-virtual {p0}, La/ni8;->G0()La/k3t0;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance p1, La/rh8;

    .line 113
    .line 114
    invoke-direct {p1, v0, v1}, La/rh8;-><init>(J)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
