.class public final La/b6o0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/ctf0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/b6o0;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/b6o0;->j:J

    .line 5
    .line 6
    iput-object p3, p0, La/b6o0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/b6o0;->i:B

    iput-object p1, p0, La/b6o0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 4

    .line 1
    iget-byte v0, p0, La/b6o0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/b6o0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/b6o0;

    .line 9
    .line 10
    check-cast v1, La/kfv0;

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    invoke-direct {p0, v1, p2, v0}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    iput-wide p1, p0, La/b6o0;->j:J

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance p1, La/b6o0;

    .line 26
    .line 27
    iget-wide v2, p0, La/b6o0;->j:J

    .line 28
    .line 29
    check-cast v1, La/ctf0;

    .line 30
    .line 31
    invoke-direct {p1, v2, v3, v1, p2}, La/b6o0;-><init>(JLa/ctf0;La/yje;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    new-instance p0, La/b6o0;

    .line 36
    .line 37
    check-cast v1, La/fir0;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p0, v1, p2, v0}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iput-wide p1, p0, La/b6o0;->j:J

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_2
    new-instance p0, La/b6o0;

    .line 53
    .line 54
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {p0, v1, p2, v0}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    iput-wide p1, p0, La/b6o0;->j:J

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_3
    new-instance p0, La/b6o0;

    .line 70
    .line 71
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-direct {p0, v1, p2, v0}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    check-cast p1, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide p1

    .line 83
    iput-wide p1, p0, La/b6o0;->j:J

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b6o0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Number;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/b6o0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/b6o0;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/b6o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    check-cast p2, La/yje;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, p2}, La/b6o0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/b6o0;

    .line 46
    .line 47
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/b6o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    check-cast p2, La/yje;

    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1, p2}, La/b6o0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/b6o0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/b6o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    check-cast p2, La/yje;

    .line 82
    .line 83
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1, p2}, La/b6o0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/b6o0;

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/b6o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    check-cast p2, La/yje;

    .line 105
    .line 106
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1, p2}, La/b6o0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, La/b6o0;

    .line 115
    .line 116
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, La/b6o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/b6o0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/b6o0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-wide v2, p0, La/b6o0;->j:J

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, La/kfv0;

    .line 16
    .line 17
    new-instance p0, La/gfv0;

    .line 18
    .line 19
    invoke-direct {p0, v2, v3}, La/gfv0;-><init>(J)V

    .line 20
    .line 21
    .line 22
    sget p1, La/kfv0;->t:I

    .line 23
    .line 24
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-wide p0, p0, La/b6o0;->j:J

    .line 36
    .line 37
    const-wide/16 v2, 0x3e8

    .line 38
    .line 39
    mul-long/2addr p0, v2

    .line 40
    new-instance v0, Ljava/util/Date;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    sub-long/2addr p0, v4

    .line 50
    check-cast v1, La/ctf0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long v0, p0, v4

    .line 58
    .line 59
    if-gez v0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    new-array p1, p0, [Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v0, v1, La/ctf0;->b:La/lsm0;

    .line 65
    .line 66
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const p1, 0x7f13022d

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, p0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    div-long/2addr p0, v2

    .line 79
    const-wide/16 v0, 0x3c

    .line 80
    .line 81
    rem-long v2, p0, v0

    .line 82
    .line 83
    div-long/2addr p0, v0

    .line 84
    rem-long v4, p0, v0

    .line 85
    .line 86
    div-long/2addr p0, v0

    .line 87
    const-wide/16 v0, 0x18

    .line 88
    .line 89
    rem-long v6, p0, v0

    .line 90
    .line 91
    div-long/2addr p0, v0

    .line 92
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const/4 p1, 0x2

    .line 97
    invoke-static {p1, p0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {p1, v1}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {p1, v2}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p0, ":"

    .line 134
    .line 135
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-static {v2, p0, p1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :goto_0
    return-object p0

    .line 152
    :pswitch_1
    iget-wide v8, p0, La/b6o0;->j:J

    .line 153
    .line 154
    sget-object p0, La/wne;->a:La/wne;

    .line 155
    .line 156
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    check-cast v1, La/fir0;

    .line 160
    .line 161
    sget p0, La/fir0;->X:I

    .line 162
    .line 163
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 164
    .line 165
    iget-object v12, p0, La/ocj;->a:La/p7m0;

    .line 166
    .line 167
    :cond_1
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-object v0, p0

    .line 175
    check-cast v0, La/yhr0;

    .line 176
    .line 177
    const/4 v10, 0x0

    .line 178
    const/16 v11, 0x17f

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    const/4 v2, 0x0

    .line 182
    const/4 v3, 0x0

    .line 183
    const/4 v4, 0x0

    .line 184
    const/4 v5, 0x0

    .line 185
    const-wide/16 v6, 0x0

    .line 186
    .line 187
    invoke-static/range {v0 .. v11}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {v12, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_1

    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_2
    iget-wide v2, p0, La/b6o0;->j:J

    .line 201
    .line 202
    sget-object p0, La/wne;->a:La/wne;

    .line 203
    .line 204
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 208
    .line 209
    new-instance p0, Ljava/lang/Long;

    .line 210
    .line 211
    invoke-direct {p0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 212
    .line 213
    .line 214
    iput-object p0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->c:Ljava/lang/Long;

    .line 215
    .line 216
    invoke-static {v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->a(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;)La/x5o0;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iget-object p0, p0, La/x5o0;->b:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 221
    .line 222
    invoke-virtual {p0, v2, v3}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTime(J)V

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_3
    iget-wide v2, p0, La/b6o0;->j:J

    .line 229
    .line 230
    sget-object p0, La/wne;->a:La/wne;

    .line 231
    .line 232
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;

    .line 236
    .line 237
    new-instance p0, Ljava/lang/Long;

    .line 238
    .line 239
    invoke-direct {p0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 240
    .line 241
    .line 242
    iput-object p0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->v:Ljava/lang/Long;

    .line 243
    .line 244
    invoke-static {v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->u(Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;)La/c6o0;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    iget-object p0, p0, La/c6o0;->j:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 249
    .line 250
    invoke-virtual {p0, v2, v3}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTime(J)V

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
