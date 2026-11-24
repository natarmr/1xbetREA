.class public final La/opk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/tpk0;


# direct methods
.method public synthetic constructor <init>(La/tpk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/opk0;->i:B

    iput-object p1, p0, La/opk0;->k:La/tpk0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/opk0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/opk0;->k:La/tpk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/opk0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/opk0;-><init>(La/tpk0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/opk0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/opk0;-><init>(La/tpk0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/opk0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/opk0;-><init>(La/tpk0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/opk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/opk0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/opk0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/opk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/opk0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/opk0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/opk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/opk0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/opk0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/opk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/opk0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/opk0;->k:La/tpk0;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v3, La/tpk0;->R:La/sff0;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/opk0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v7, v3, La/tpk0;->P:La/pwi;

    .line 34
    .line 35
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, La/jpk0;

    .line 40
    .line 41
    iget v8, p1, La/jpk0;->a:I

    .line 42
    .line 43
    iget-boolean v10, v0, La/sff0;->J1:Z

    .line 44
    .line 45
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    iget-object p1, v3, La/tpk0;->Q:La/yiu;

    .line 50
    .line 51
    invoke-virtual {p1}, La/yiu;->a()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    iget-boolean p1, v0, La/sff0;->O1:Z

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 p1, 0x0

    .line 63
    move v11, p1

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    move v11, v4

    .line 66
    :goto_1
    iput-boolean v4, p0, La/opk0;->j:Z

    .line 67
    .line 68
    const/4 v12, 0x1

    .line 69
    move-object v13, p0

    .line 70
    invoke-virtual/range {v7 .. v13}, La/pwi;->n(ILa/bvc;ZZZLa/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v5, :cond_4

    .line 75
    .line 76
    move-object v1, v5

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_3
    return-object v1

    .line 81
    :pswitch_0
    move-object v7, p0

    .line 82
    sget-object p0, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v0, v7, La/opk0;->j:Z

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    if-ne v0, v4, :cond_5

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, v3, La/tpk0;->F:La/i6m0;

    .line 102
    .line 103
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/jpk0;

    .line 108
    .line 109
    iget-wide v0, v0, La/jpk0;->j:J

    .line 110
    .line 111
    iput-boolean v4, v7, La/opk0;->j:Z

    .line 112
    .line 113
    iget-object p1, p1, La/i6m0;->a:La/d5m0;

    .line 114
    .line 115
    iget-object p1, p1, La/d5m0;->a:La/c5m0;

    .line 116
    .line 117
    invoke-virtual {p1, v0, v1, v7}, La/c5m0;->a(JLa/zje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, p0, :cond_7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_4
    if-ne p1, p0, :cond_8

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_5
    if-ne p1, p0, :cond_9

    .line 132
    .line 133
    move-object v1, p0

    .line 134
    goto :goto_7

    .line 135
    :cond_9
    :goto_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_7
    return-object v1

    .line 138
    :pswitch_1
    move-object v7, p0

    .line 139
    sget-object p0, La/wne;->a:La/wne;

    .line 140
    .line 141
    iget-boolean v0, v7, La/opk0;->j:Z

    .line 142
    .line 143
    if-eqz v0, :cond_b

    .line 144
    .line 145
    if-ne v0, v4, :cond_a

    .line 146
    .line 147
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v3, La/tpk0;->t:La/yhi;

    .line 159
    .line 160
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, La/jpk0;

    .line 165
    .line 166
    iget p1, p1, La/jpk0;->a:I

    .line 167
    .line 168
    move v0, v4

    .line 169
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    sget-object v5, La/n0w;->a:La/n0w;

    .line 174
    .line 175
    iget-object v1, v3, La/tpk0;->R:La/sff0;

    .line 176
    .line 177
    iget-boolean v6, v1, La/sff0;->J1:Z

    .line 178
    .line 179
    iput-boolean v0, v7, La/opk0;->j:Z

    .line 180
    .line 181
    move v3, p1

    .line 182
    invoke-virtual/range {v2 .. v7}, La/yhi;->e(ILa/bvc;La/n0w;ZLa/zje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, p0, :cond_c

    .line 187
    .line 188
    move-object v1, p0

    .line 189
    goto :goto_9

    .line 190
    :cond_c
    :goto_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_9
    return-object v1

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
