.class public final synthetic La/jxm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kxm0;


# direct methods
.method public synthetic constructor <init>(La/kxm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jxm0;->a:B

    iput-object p1, p0, La/jxm0;->b:La/kxm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/jxm0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jxm0;->b:La/kxm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, La/kxm0;->n2:La/m6m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/kxm0;->Q0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/cxm0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/cxm0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/sxm0;

    .line 31
    .line 32
    sget-object v0, La/kxm0;->n2:La/m6m0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v0, La/qxm0;->a:La/qxm0;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    instance-of v0, p1, La/rxm0;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p0}, La/kxm0;->P0()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p0}, La/kxm0;->P0()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v1, v1, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;->b:Ljava/lang/String;

    .line 78
    .line 79
    check-cast p1, La/rxm0;

    .line 80
    .line 81
    iget-wide v2, p1, La/rxm0;->a:J

    .line 82
    .line 83
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v2, Lkotlin/Pair;

    .line 88
    .line 89
    invoke-direct {v2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 104
    .line 105
    .line 106
    :goto_0
    invoke-virtual {p0}, La/kxm0;->Q0()La/k3t0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object p1, La/zwm0;->a:La/zwm0;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    :goto_1
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
