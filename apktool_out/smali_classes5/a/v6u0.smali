.class public final synthetic La/v6u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y6u0;


# direct methods
.method public synthetic constructor <init>(La/y6u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v6u0;->a:B

    iput-object p1, p0, La/v6u0;->b:La/y6u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/v6u0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v6u0;->b:La/y6u0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/y6u0;->R1:La/bzs0;

    .line 9
    .line 10
    new-instance v0, La/s6u0;

    .line 11
    .line 12
    new-instance v1, La/las0;

    .line 13
    .line 14
    iget-object p0, p0, La/y6u0;->O1:La/kiu0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object v3, p0

    .line 21
    check-cast v3, La/g7u0;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x10

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const-class v4, La/g7u0;

    .line 28
    .line 29
    const-string v5, "onVenueClick"

    .line 30
    .line 31
    const-string v6, "onVenueClick(Lorg/xplatform/special_event/impl/venues/presentation/adapters/VenueUiModel;)V"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/b4u0;

    .line 40
    .line 41
    const/4 v2, 0x5

    .line 42
    invoke-direct {p0, v2}, La/b4u0;-><init>(B)V

    .line 43
    .line 44
    .line 45
    new-instance v2, La/npt0;

    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    invoke-direct {v2, v1, v3}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v1, La/d8q0;

    .line 52
    .line 53
    const/16 v4, 0x13

    .line 54
    .line 55
    invoke-direct {v1, v3, v4}, La/d8q0;-><init>(IB)V

    .line 56
    .line 57
    .line 58
    sget-object v3, La/pfo0;->B:La/pfo0;

    .line 59
    .line 60
    new-instance v4, La/gbn;

    .line 61
    .line 62
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 66
    .line 67
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 72
    .line 73
    iget-object p0, p0, La/y6u0;->M1:La/tyi;

    .line 74
    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_0
    const-string p0, "viewModelFactory"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    :pswitch_1
    sget-object v0, La/y6u0;->R1:La/bzs0;

    .line 89
    .line 90
    iget-object p0, p0, La/y6u0;->O1:La/kiu0;

    .line 91
    .line 92
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/g7u0;

    .line 97
    .line 98
    iget-object p0, p0, La/g7u0;->g:La/i1w0;

    .line 99
    .line 100
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, La/c8d;

    .line 105
    .line 106
    sget-object v2, La/y7d;->a:La/v7d;

    .line 107
    .line 108
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 109
    .line 110
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 111
    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_0
    move-object v1, v0

    .line 119
    check-cast v1, La/paw;

    .line 120
    .line 121
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_1

    .line 126
    .line 127
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, La/oe50;

    .line 132
    .line 133
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
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
