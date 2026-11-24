.class public final La/wg1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/mh1;


# direct methods
.method public synthetic constructor <init>(La/mh1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wg1;->i:B

    iput-object p1, p0, La/wg1;->j:La/mh1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wg1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wg1;->j:La/mh1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wg1;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wg1;-><init>(La/mh1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wg1;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wg1;-><init>(La/mh1;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/wg1;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/wg1;-><init>(La/mh1;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/wg1;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/wg1;-><init>(La/mh1;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/wg1;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/wg1;-><init>(La/mh1;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wg1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wg1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wg1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wg1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wg1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/wg1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/wg1;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/wg1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wg1;->i:B

    .line 4
    .line 5
    const-string v2, "aggregator_promo"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/wg1;->j:La/mh1;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/mf1;

    .line 19
    .line 20
    iget-object v2, v0, La/mh1;->N:La/ctf0;

    .line 21
    .line 22
    new-array v4, v3, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 25
    .line 26
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const v4, 0x7f1303d7

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v2}, La/mf1;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, La/mh1;->z:La/pwi;

    .line 52
    .line 53
    sget-object v2, La/fk60;->p:La/fk60;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, La/pwi;->r(La/fk60;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    sget-object v1, La/hf1;->a:La/hf1;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object v0, v0, La/mh1;->w:La/o470;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, La/o470;->i(Z)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object v1, La/mh1;->E0:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, v0, La/mh1;->C:La/s91;

    .line 82
    .line 83
    new-instance v3, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 84
    .line 85
    sget-object v9, La/wgh0;->h:La/wgh0;

    .line 86
    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v16, 0x1e7

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const-wide/16 v6, 0x0

    .line 93
    .line 94
    sget-object v8, La/vl1;->a:La/vl1;

    .line 95
    .line 96
    const-wide/16 v10, 0x0

    .line 97
    .line 98
    const-wide/16 v12, 0x0

    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    invoke-direct/range {v3 .. v16}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v3}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v0, La/mh1;->c0:La/s31;

    .line 108
    .line 109
    invoke-virtual {v1, v9}, La/s31;->g(La/wgh0;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v0, La/mh1;->d0:La/cyu;

    .line 113
    .line 114
    invoke-virtual {v0, v2}, La/cyu;->C(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 121
    .line 122
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v1, La/mh1;->E0:Ljava/lang/String;

    .line 126
    .line 127
    sget-object v1, La/jf1;->a:La/jf1;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 136
    .line 137
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v0, La/mh1;->A:La/vd1;

    .line 141
    .line 142
    iget-object v1, v1, La/vd1;->a:La/kt2;

    .line 143
    .line 144
    const-string v3, "tournaments_open"

    .line 145
    .line 146
    const-string v4, "screen"

    .line 147
    .line 148
    invoke-static {v4, v2, v1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, La/mh1;->G:La/zr1;

    .line 152
    .line 153
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 154
    .line 155
    const-wide/16 v3, 0xd01

    .line 156
    .line 157
    invoke-static {v2, v1, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v0, La/mh1;->C:La/s91;

    .line 161
    .line 162
    new-instance v1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 163
    .line 164
    new-instance v6, La/sm1;

    .line 165
    .line 166
    const-wide/16 v2, 0x0

    .line 167
    .line 168
    invoke-direct {v6, v2, v3}, La/sm1;-><init>(J)V

    .line 169
    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const/16 v14, 0x1f7

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    const/4 v3, 0x0

    .line 176
    const-wide/16 v4, 0x0

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const-wide/16 v8, 0x0

    .line 180
    .line 181
    const-wide/16 v10, 0x0

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-direct/range {v1 .. v14}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
