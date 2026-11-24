.class public final La/h750;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/p850;


# direct methods
.method public synthetic constructor <init>(La/p850;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h750;->i:B

    iput-object p1, p0, La/h750;->j:La/p850;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/h750;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h750;->j:La/p850;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/h750;

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, La/h750;

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/h750;

    .line 25
    .line 26
    const/4 v0, 0x7

    .line 27
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/h750;

    .line 32
    .line 33
    const/4 v0, 0x6

    .line 34
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_3
    new-instance p1, La/h750;

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_4
    new-instance p1, La/h750;

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_5
    new-instance p1, La/h750;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_6
    new-instance p1, La/h750;

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_7
    new-instance p1, La/h750;

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_8
    new-instance p1, La/h750;

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-direct {p1, p0, p2, v0}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h750;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h750;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/h750;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/h750;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/h750;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/h750;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/h750;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/h750;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/vne;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/h750;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/vne;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/h750;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, La/vne;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/h750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/h750;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/h750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h750;->i:B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "my_aggregator"

    .line 9
    .line 10
    iget-object v5, v0, La/h750;->j:La/p850;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/f650;->c:La/f650;

    .line 21
    .line 22
    sget v1, La/p850;->p0:I

    .line 23
    .line 24
    invoke-virtual {v5, v0}, La/p850;->a0(La/g650;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v5, La/p850;->D:La/soc;

    .line 36
    .line 37
    invoke-virtual {v0}, La/soc;->b()V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, La/f650;->d:La/f650;

    .line 49
    .line 50
    sget v1, La/p850;->p0:I

    .line 51
    .line 52
    invoke-virtual {v5, v0}, La/p850;->a0(La/g650;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v5, La/p850;->R:La/r8i;

    .line 64
    .line 65
    sget-object v1, La/fk60;->z:La/fk60;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/r8i;->r(La/fk60;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    new-instance v0, La/n650;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v5, v0, La/h750;->j:La/p850;

    .line 90
    .line 91
    iget-object v6, v5, La/p850;->r:La/kb0;

    .line 92
    .line 93
    new-instance v7, La/db0;

    .line 94
    .line 95
    sget-object v0, La/k7k;->B:La/k7k;

    .line 96
    .line 97
    iget-object v1, v5, La/p850;->m0:La/cmt;

    .line 98
    .line 99
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v7, v4, v0, v1}, La/db0;-><init>(Ljava/lang/String;La/k7k;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v5, La/p850;->p:La/mne;

    .line 107
    .line 108
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x4

    .line 112
    invoke-static/range {v5 .. v10}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 119
    .line 120
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v5, La/p850;->W:La/s91;

    .line 124
    .line 125
    new-instance v6, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 126
    .line 127
    sget-object v12, La/wgh0;->h:La/wgh0;

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x1e7

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const-wide/16 v9, 0x0

    .line 136
    .line 137
    sget-object v11, La/vl1;->a:La/vl1;

    .line 138
    .line 139
    const-wide/16 v13, 0x0

    .line 140
    .line 141
    const-wide/16 v15, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    invoke-direct/range {v6 .. v19}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v6}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v5, La/p850;->i0:La/s31;

    .line 152
    .line 153
    invoke-virtual {v0, v12}, La/s31;->g(La/wgh0;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v5, La/p850;->j0:La/cyu;

    .line 157
    .line 158
    const-string v1, "aggregator_promo"

    .line 159
    .line 160
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v5, La/p850;->c0:La/vd1;

    .line 172
    .line 173
    invoke-virtual {v0, v4}, La/vd1;->e(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v5, La/p850;->d0:La/ix0;

    .line 177
    .line 178
    sget-object v1, La/y1p;->A:La/y1p;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/ix0;->j(La/y1p;)V

    .line 181
    .line 182
    .line 183
    iget-object v0, v5, La/p850;->W:La/s91;

    .line 184
    .line 185
    new-instance v1, La/jr1;

    .line 186
    .line 187
    new-instance v4, La/cvc0;

    .line 188
    .line 189
    sget-object v5, La/d7v;->b:La/d7v;

    .line 190
    .line 191
    invoke-direct {v4, v5}, La/cvc0;-><init>(La/d7v;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v1, v4}, La/jr1;-><init>(La/fvc0;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v0, v1, v3, v3, v2}, La/s91;->d(La/s91;La/lr1;ZZI)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_6
    sget-object v0, La/wne;->a:La/wne;

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, v5, La/p850;->c0:La/vd1;

    .line 209
    .line 210
    invoke-virtual {v0, v4}, La/vd1;->d(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v5, La/p850;->d0:La/ix0;

    .line 214
    .line 215
    sget-object v1, La/y1p;->A:La/y1p;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, La/ix0;->l(La/y1p;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, v5, La/p850;->W:La/s91;

    .line 221
    .line 222
    new-instance v1, La/jr1;

    .line 223
    .line 224
    new-instance v4, La/dvc0;

    .line 225
    .line 226
    invoke-direct {v4, v3}, La/dvc0;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-direct {v1, v4}, La/jr1;-><init>(La/fvc0;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v1, v3, v3, v2}, La/s91;->d(La/s91;La/lr1;ZZI)V

    .line 233
    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 239
    .line 240
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object v0, v5, La/p850;->o:La/oeg0;

    .line 244
    .line 245
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    new-instance v2, La/c8d;

    .line 254
    .line 255
    sget-object v4, La/y7d;->a:La/v7d;

    .line 256
    .line 257
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 258
    .line 259
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    :goto_0
    move-object v2, v1

    .line 267
    check-cast v2, La/paw;

    .line 268
    .line 269
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_1

    .line 274
    .line 275
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, La/oe50;

    .line 280
    .line 281
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 282
    .line 283
    .line 284
    goto :goto_0

    .line 285
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_8
    sget-object v1, La/wne;->a:La/wne;

    .line 289
    .line 290
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iget-object v5, v0, La/h750;->j:La/p850;

    .line 294
    .line 295
    iget-object v6, v5, La/p850;->r:La/kb0;

    .line 296
    .line 297
    new-instance v7, La/cb0;

    .line 298
    .line 299
    invoke-direct {v7, v4, v4}, La/cb0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const/4 v9, 0x0

    .line 303
    const/4 v10, 0x6

    .line 304
    const/4 v8, 0x0

    .line 305
    invoke-static/range {v5 .. v10}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 306
    .line 307
    .line 308
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
