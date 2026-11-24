.class public final La/rmg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/umg0;


# direct methods
.method public synthetic constructor <init>(La/umg0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rmg0;->i:B

    iput-object p1, p0, La/rmg0;->k:La/umg0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rmg0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rmg0;->k:La/umg0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rmg0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rmg0;-><init>(La/umg0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/rmg0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/rmg0;-><init>(La/umg0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/rmg0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rmg0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rmg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rmg0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rmg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/rmg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/rmg0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/rmg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v1, p0, La/rmg0;->i:B

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, La/rmg0;->k:La/umg0;

    .line 5
    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v3, La/umg0;->i:La/p7m0;

    .line 10
    .line 11
    sget-object v4, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-boolean v3, p0, La/rmg0;->j:Z

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-ne v3, v5, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v3, v2

    .line 38
    check-cast v3, La/pmg0;

    .line 39
    .line 40
    sget-object v3, La/pmg0;->a:La/pmg0;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    iput-boolean v5, p0, La/rmg0;->j:Z

    .line 49
    .line 50
    const-wide/16 v2, 0x7d0

    .line 51
    .line 52
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-ne v0, v4, :cond_3

    .line 57
    .line 58
    move-object v2, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v2, v0

    .line 65
    check-cast v2, La/pmg0;

    .line 66
    .line 67
    sget-object v2, La/pmg0;->b:La/pmg0;

    .line 68
    .line 69
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object v2

    .line 78
    :pswitch_0
    iget-boolean v0, p0, La/rmg0;->j:Z

    .line 79
    .line 80
    sget-object v1, La/wne;->a:La/wne;

    .line 81
    .line 82
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    iget-object v0, v3, La/umg0;->d:La/mne;

    .line 88
    .line 89
    iget-object v1, v3, La/umg0;->b:Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 90
    .line 91
    iget v1, v1, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;->a:I

    .line 92
    .line 93
    const/16 v4, 0x18

    .line 94
    .line 95
    const/16 v5, 0x17

    .line 96
    .line 97
    if-ltz v1, :cond_4

    .line 98
    .line 99
    iget-object v6, v3, La/umg0;->c:La/bdu;

    .line 100
    .line 101
    invoke-virtual {v6, v1}, La/bdu;->b(I)Ljava/util/Map;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v6, La/mmg0;

    .line 106
    .line 107
    invoke-direct {v6, v1}, La/mmg0;-><init>(Ljava/util/Map;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    iget-object v10, v0, La/mne;->c:La/vs10;

    .line 115
    .line 116
    new-instance v8, La/wtf0;

    .line 117
    .line 118
    invoke-direct {v8, v5}, La/wtf0;-><init>(B)V

    .line 119
    .line 120
    .line 121
    new-instance v11, La/k6d0;

    .line 122
    .line 123
    invoke-direct {v11, v3, v6, v2, v4}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 124
    .line 125
    .line 126
    const/16 v12, 0xa

    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v0, v0, La/mne;->c:La/vs10;

    .line 138
    .line 139
    move-object v6, v0

    .line 140
    move-object v0, v1

    .line 141
    new-instance v1, La/wtf0;

    .line 142
    .line 143
    invoke-direct {v1, v5}, La/wtf0;-><init>(B)V

    .line 144
    .line 145
    .line 146
    new-instance v5, La/k6d0;

    .line 147
    .line 148
    sget-object v7, La/nmg0;->a:La/nmg0;

    .line 149
    .line 150
    invoke-direct {v5, v3, v7, v2, v4}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    move-object v4, v5

    .line 154
    const/16 v5, 0xa

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    move-object v3, v6

    .line 158
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 159
    .line 160
    .line 161
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
