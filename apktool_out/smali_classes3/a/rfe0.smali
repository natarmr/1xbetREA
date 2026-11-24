.class public final La/rfe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/wfe0;


# direct methods
.method public synthetic constructor <init>(La/wfe0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rfe0;->i:B

    iput-object p1, p0, La/rfe0;->j:La/wfe0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/rfe0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rfe0;->j:La/wfe0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rfe0;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rfe0;-><init>(La/wfe0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/rfe0;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/rfe0;-><init>(La/wfe0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/rfe0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/rfe0;-><init>(La/wfe0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/rfe0;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/rfe0;-><init>(La/wfe0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rfe0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rfe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rfe0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/rfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/rfe0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/rfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/rfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/rfe0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/rfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/rfe0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/rfe0;->j:La/wfe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, La/rfe0;->j:La/wfe0;

    .line 14
    .line 15
    iget-object v2, v1, La/wfe0;->w:La/kb0;

    .line 16
    .line 17
    new-instance v3, La/db0;

    .line 18
    .line 19
    sget-object p0, La/wfe0;->L:Ljava/lang/String;

    .line 20
    .line 21
    sget-object p1, La/k7k;->s1:La/k7k;

    .line 22
    .line 23
    iget-object v0, v1, La/wfe0;->C:La/cmt;

    .line 24
    .line 25
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v3, p0, p1, v0}, La/db0;-><init>(Ljava/lang/String;La/k7k;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, v1, La/wfe0;->u:La/mne;

    .line 33
    .line 34
    iget-object v4, p0, La/mne;->b:La/dvj;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x4

    .line 38
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    sget-object p0, La/wne;->a:La/wne;

    .line 45
    .line 46
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v1, La/wfe0;->A:La/s91;

    .line 50
    .line 51
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 52
    .line 53
    sget-object v6, La/wgh0;->Y:La/wgh0;

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    const/16 v13, 0x1e7

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    const/4 v2, 0x0

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    sget-object v5, La/vl1;->a:La/vl1;

    .line 63
    .line 64
    const-wide/16 v7, 0x0

    .line 65
    .line 66
    const-wide/16 v9, 0x0

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    invoke-direct/range {v0 .. v13}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_1
    sget-object p0, La/wne;->a:La/wne;

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v1, La/wfe0;->z:La/oeg0;

    .line 84
    .line 85
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v0, La/c8d;

    .line 94
    .line 95
    sget-object v1, La/y7d;->a:La/v7d;

    .line 96
    .line 97
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 98
    .line 99
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 100
    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_0
    move-object v0, p1

    .line 108
    check-cast v0, La/paw;

    .line 109
    .line 110
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_0

    .line 115
    .line 116
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/oe50;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 130
    .line 131
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p0, La/rfe0;->j:La/wfe0;

    .line 135
    .line 136
    iget-object v2, v1, La/wfe0;->w:La/kb0;

    .line 137
    .line 138
    new-instance v3, La/cb0;

    .line 139
    .line 140
    sget-object p0, La/wfe0;->L:Ljava/lang/String;

    .line 141
    .line 142
    const-string p1, "aggregator_recommended"

    .line 143
    .line 144
    invoke-direct {v3, p0, p1}, La/cb0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    const/4 v6, 0x6

    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
