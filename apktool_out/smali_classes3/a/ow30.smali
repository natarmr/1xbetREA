.class public final synthetic La/ow30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xw30;


# direct methods
.method public synthetic constructor <init>(La/xw30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ow30;->a:B

    iput-object p1, p0, La/ow30;->b:La/xw30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ow30;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ow30;->b:La/xw30;

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
    new-instance v0, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;

    .line 14
    .line 15
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/lx30;

    .line 20
    .line 21
    iget-object v1, v1, La/lx30;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lx30;

    .line 28
    .line 29
    iget-object p0, p0, La/lx30;->b:La/ql5;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    iget-wide v2, p0, La/ql5;->a:J

    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;-><init>(Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    :goto_0
    return-object p0

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, Lorg/xplatform/bet_history/powerbet/presentation/PowerBetScreen;

    .line 51
    .line 52
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/lx30;

    .line 57
    .line 58
    iget-object v1, v1, La/lx30;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/lx30;

    .line 65
    .line 66
    iget-object p0, p0, La/lx30;->b:La/ql5;

    .line 67
    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    iget-wide v2, p0, La/ql5;->a:J

    .line 71
    .line 72
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/bet_history/powerbet/presentation/PowerBetScreen;-><init>(Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_1
    return-object p0

    .line 84
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, La/xw30;->v:La/r9u;

    .line 88
    .line 89
    sget-object v1, La/ygp;->I1:La/ygp;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    new-instance v0, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreen;

    .line 108
    .line 109
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/lx30;

    .line 114
    .line 115
    iget-object p0, p0, La/lx30;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {v0, p0}, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreen;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    new-instance v0, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreenOld;

    .line 122
    .line 123
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, La/lx30;

    .line 128
    .line 129
    iget-object p0, p0, La/lx30;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-direct {v0, p0}, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreenOld;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
