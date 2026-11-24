.class public final La/s4e0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/t4e0;


# direct methods
.method public synthetic constructor <init>(La/t4e0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s4e0;->i:B

    iput-object p1, p0, La/s4e0;->k:La/t4e0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/s4e0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/s4e0;->k:La/t4e0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/s4e0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/s4e0;-><init>(La/t4e0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/s4e0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/s4e0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/s4e0;-><init>(La/t4e0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/s4e0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/s4e0;-><init>(La/t4e0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s4e0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/s4e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/s4e0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/s4e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/s4e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/s4e0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/s4e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/s4e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/s4e0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/s4e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/s4e0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/s4e0;->k:La/t4e0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/s4e0;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/n4e0;

    .line 26
    .line 27
    iget-boolean p0, p0, La/n4e0;->b:Z

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/n4e0;

    .line 36
    .line 37
    iget-boolean p0, p0, La/n4e0;->c:Z

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v4}, La/t4e0;->N()V

    .line 42
    .line 43
    .line 44
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 48
    .line 49
    sget-object v5, La/wne;->a:La/wne;

    .line 50
    .line 51
    iget-boolean v6, p0, La/s4e0;->j:Z

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    if-ne v6, v2, :cond_2

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget p1, La/t4e0;->x:I

    .line 70
    .line 71
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 72
    .line 73
    :cond_4
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-object v1, p1

    .line 81
    check-cast v1, La/n4e0;

    .line 82
    .line 83
    const/16 v8, 0xd

    .line 84
    .line 85
    invoke-static {v1, v3, v2, v7, v8}, La/n4e0;->a(La/n4e0;La/j6i0;ZZI)La/n4e0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v6, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    iget-object p1, v4, La/t4e0;->r:La/b8u;

    .line 96
    .line 97
    iget-object v1, v4, La/t4e0;->o:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

    .line 98
    .line 99
    iput-boolean v2, p0, La/s4e0;->j:Z

    .line 100
    .line 101
    invoke-virtual {p1, v1, p0}, La/b8u;->f(Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v5, :cond_5

    .line 106
    .line 107
    move-object v3, v5

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    :goto_0
    check-cast p1, La/j6i0;

    .line 110
    .line 111
    sget p0, La/t4e0;->x:I

    .line 112
    .line 113
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 114
    .line 115
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-object v0, p0

    .line 123
    check-cast v0, La/n4e0;

    .line 124
    .line 125
    const/16 v2, 0x8

    .line 126
    .line 127
    invoke-static {v0, p1, v7, v7, v2}, La/n4e0;->a(La/n4e0;La/j6i0;ZZI)La/n4e0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_6

    .line 136
    .line 137
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_1
    return-object v3

    .line 140
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 141
    .line 142
    iget-boolean v5, p0, La/s4e0;->j:Z

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    if-ne v5, v2, :cond_7

    .line 147
    .line 148
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, La/n4e0;

    .line 164
    .line 165
    iget-object p1, p1, La/n4e0;->a:La/j6i0;

    .line 166
    .line 167
    if-eqz p1, :cond_9

    .line 168
    .line 169
    iget-object v1, v4, La/t4e0;->w:La/eyg0;

    .line 170
    .line 171
    iput-boolean v2, p0, La/s4e0;->j:Z

    .line 172
    .line 173
    iget-object p0, v1, La/eyg0;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, La/z220;

    .line 176
    .line 177
    iget-object p0, p0, La/z220;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, La/r7e0;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, La/r7e0;->c:La/qoj0;

    .line 185
    .line 186
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    if-ne p0, v0, :cond_9

    .line 192
    .line 193
    move-object v3, v0

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_3
    return-object v3

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
