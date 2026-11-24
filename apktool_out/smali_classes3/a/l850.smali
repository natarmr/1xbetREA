.class public final La/l850;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/p850;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(La/p850;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/l850;->i:B

    iput-object p1, p0, La/l850;->k:La/p850;

    iput-boolean p2, p0, La/l850;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/l850;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/l850;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/l850;->k:La/p850;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/l850;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/l850;-><init>(La/p850;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/l850;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/l850;-><init>(La/p850;ZLa/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l850;->i:B

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
    invoke-virtual {p0, p1, p2}, La/l850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l850;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/l850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/l850;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/l850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/l850;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/l850;->l:Z

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v5, p0, La/l850;->k:La/p850;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, p0, La/l850;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v6, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v5, La/p850;->N:La/ytt;

    .line 35
    .line 36
    sget-object v3, La/aue0;->d:La/aue0;

    .line 37
    .line 38
    iput-boolean v6, p0, La/l850;->j:Z

    .line 39
    .line 40
    invoke-virtual {p1, v3, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-ne p0, v0, :cond_2

    .line 45
    .line 46
    move-object v3, v0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_0
    iget-object p0, v5, La/p850;->o:La/oeg0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v0, La/rd7;

    .line 59
    .line 60
    const/16 v3, 0xb

    .line 61
    .line 62
    invoke-direct {v0, v5, v2, v3}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 63
    .line 64
    .line 65
    new-instance v2, La/a1w0;

    .line 66
    .line 67
    invoke-direct {v2, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, La/c8d;

    .line 71
    .line 72
    sget-object v3, La/y7d;->a:La/v7d;

    .line 73
    .line 74
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_1
    move-object v0, p1

    .line 82
    check-cast v0, La/paw;

    .line 83
    .line 84
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/oe50;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_2
    return-object v3

    .line 103
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v7, p0, La/l850;->j:Z

    .line 106
    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    if-ne v7, v6, :cond_4

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v5, La/p850;->z:La/rou;

    .line 123
    .line 124
    iput-boolean v6, p0, La/l850;->j:Z

    .line 125
    .line 126
    invoke-virtual {p1, v1, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_6

    .line 131
    .line 132
    move-object v3, v0

    .line 133
    goto :goto_4

    .line 134
    :cond_6
    :goto_3
    check-cast p1, La/m2c0;

    .line 135
    .line 136
    iget-boolean p0, p1, La/m2c0;->o0:Z

    .line 137
    .line 138
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, La/p650;

    .line 143
    .line 144
    iget-boolean p1, p1, La/p650;->k:Z

    .line 145
    .line 146
    if-eqz p0, :cond_8

    .line 147
    .line 148
    if-eqz p1, :cond_8

    .line 149
    .line 150
    if-nez v2, :cond_7

    .line 151
    .line 152
    iget-object p0, v5, La/p850;->X:La/gg5;

    .line 153
    .line 154
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 155
    .line 156
    const-wide/16 v0, 0xcf1

    .line 157
    .line 158
    sget-object p1, La/xun;->a:La/xun;

    .line 159
    .line 160
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 161
    .line 162
    .line 163
    iget-object p0, v5, La/p850;->U:La/u58;

    .line 164
    .line 165
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 166
    .line 167
    const-string p1, "my_aggregator_VIP_cashback_call"

    .line 168
    .line 169
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    iget-object p0, v5, La/p850;->W:La/s91;

    .line 173
    .line 174
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 175
    .line 176
    const/4 v12, 0x0

    .line 177
    const/16 v13, 0x1f7

    .line 178
    .line 179
    const/4 v1, 0x0

    .line 180
    const/4 v2, 0x0

    .line 181
    const-wide/16 v3, 0x0

    .line 182
    .line 183
    sget-object v5, La/em1;->a:La/em1;

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    const-wide/16 v7, 0x0

    .line 187
    .line 188
    const-wide/16 v9, 0x0

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    invoke-direct/range {v0 .. v13}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 195
    .line 196
    .line 197
    :cond_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_4
    return-object v3

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
