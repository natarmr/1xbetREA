.class public final synthetic La/rvn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vvn0;


# direct methods
.method public synthetic constructor <init>(La/vvn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rvn0;->a:B

    iput-object p1, p0, La/rvn0;->b:La/vvn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/rvn0;->a:B

    .line 2
    .line 3
    sget-object v1, La/trn0;->a:La/trn0;

    .line 4
    .line 5
    iget-object p0, p0, La/rvn0;->b:La/vvn0;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->H0()V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance p1, La/esn0;

    .line 39
    .line 40
    const/4 v0, -0x1

    .line 41
    invoke-direct {p1, v0}, La/esn0;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_3
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p0, p0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    instance-of v0, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 96
    .line 97
    if-eqz v0, :cond_0

    .line 98
    .line 99
    check-cast p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const/4 p1, 0x0

    .line 103
    :goto_0
    if-nez p1, :cond_1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    iget-object v0, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 107
    .line 108
    sget-object v1, La/zj;->a:La/zj;

    .line 109
    .line 110
    sget-object v1, La/ven;->b:La/pek;

    .line 111
    .line 112
    sget-object v1, La/bpn0;->a:La/bpn0;

    .line 113
    .line 114
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    .line 115
    .line 116
    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 117
    .line 118
    .line 119
    sget-object v2, La/zj;->a:La/zj;

    .line 120
    .line 121
    sget-object v3, La/bpn0;->b:La/bpn0;

    .line 122
    .line 123
    new-instance v4, La/ron0;

    .line 124
    .line 125
    const/16 v5, 0x258

    .line 126
    .line 127
    invoke-direct {v4, v2, v5, v3, v1}, La/ron0;-><init>(La/zj;ILa/bpn0;Landroid/view/animation/Interpolator;)V

    .line 128
    .line 129
    .line 130
    iput-object v4, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->s:La/ron0;

    .line 131
    .line 132
    iget-object p1, v0, La/xna;->a:La/wna;

    .line 133
    .line 134
    invoke-virtual {p1}, La/wna;->a()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_2

    .line 139
    .line 140
    iget p1, v0, La/xna;->f:I

    .line 141
    .line 142
    add-int/lit8 p1, p1, 0x1

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 145
    .line 146
    .line 147
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
