.class public final La/fd60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:J

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fd60;->i:B

    iput-object p1, p0, La/fd60;->k:Ljava/lang/Object;

    iput-wide p2, p0, La/fd60;->j:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/fd60;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fd60;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/fd60;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/zco0;

    .line 12
    .line 13
    iget-wide v4, p0, La/fd60;->j:J

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    move-object v6, p1

    .line 17
    invoke-direct/range {v2 .. v7}, La/fd60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :pswitch_0
    move-object v7, p1

    .line 22
    new-instance v3, La/fd60;

    .line 23
    .line 24
    move-object v4, v1

    .line 25
    check-cast v4, La/rrd;

    .line 26
    .line 27
    iget-wide v5, p0, La/fd60;->j:J

    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    invoke-direct/range {v3 .. v8}, La/fd60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_1
    move-object v7, p1

    .line 35
    new-instance v3, La/fd60;

    .line 36
    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, La/rrd;

    .line 39
    .line 40
    iget-wide v5, p0, La/fd60;->j:J

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-direct/range {v3 .. v8}, La/fd60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fd60;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/fd60;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/fd60;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/fd60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/fd60;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/fd60;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/fd60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/fd60;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/fd60;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/fd60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/fd60;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/fd60;->j:J

    .line 4
    .line 5
    iget-object p0, p0, La/fd60;->k:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v5, p0

    .line 16
    check-cast v5, La/zco0;

    .line 17
    .line 18
    sget p0, La/zco0;->r0:I

    .line 19
    .line 20
    iget-object p0, v5, La/zco0;->q0:La/bby;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 p1, 0x1

    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v5, v1, v2}, La/zco0;->O(J)La/kxv;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v6, La/npn;

    .line 40
    .line 41
    iget-wide v7, p0, La/kxv;->a:J

    .line 42
    .line 43
    iget-wide v9, p0, La/kxv;->b:J

    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    iget-boolean v12, p0, La/kxv;->i:Z

    .line 52
    .line 53
    invoke-direct/range {v6 .. v12}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 54
    .line 55
    .line 56
    move-object p1, v6

    .line 57
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v3, La/ndn0;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    const/16 v10, 0x1c

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    const-class v6, La/zco0;

    .line 68
    .line 69
    const-string v7, "handleFavoriteError"

    .line 70
    .line 71
    const-string v8, "handleFavoriteError(Ljava/lang/Throwable;)V"

    .line 72
    .line 73
    invoke-direct/range {v3 .. v10}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    move-object v1, v3

    .line 77
    new-instance v3, La/kpb0;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    const/16 v8, 0x12

    .line 81
    .line 82
    move-object v4, p0

    .line 83
    move-object v6, p1

    .line 84
    invoke-direct/range {v3 .. v8}, La/kpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    const/16 v11, 0xe

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    move-object v6, v0

    .line 92
    move-object v7, v1

    .line 93
    move-object v10, v3

    .line 94
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iput-object p0, v5, La/zco0;->q0:La/bby;

    .line 99
    .line 100
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    check-cast p0, La/rrd;

    .line 109
    .line 110
    iget-object p0, p0, La/rrd;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, La/qvt;

    .line 113
    .line 114
    iget-object p0, p0, La/qvt;->a:La/y3v;

    .line 115
    .line 116
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p0, La/nx20;

    .line 119
    .line 120
    iget-object p0, p0, La/nx20;->a:La/ir30;

    .line 121
    .line 122
    invoke-virtual {p0}, La/ir30;->b()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Lkotlin/Pair;

    .line 127
    .line 128
    if-eqz p0, :cond_2

    .line 129
    .line 130
    iget-object p1, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    cmp-long p1, v3, v1

    .line 139
    .line 140
    if-nez p1, :cond_2

    .line 141
    .line 142
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Ljava/util/List;

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    sget-object p0, La/iun;->a:La/iun;

    .line 148
    .line 149
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 159
    .line 160
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    check-cast p0, La/rrd;

    .line 164
    .line 165
    iget-object p0, p0, La/rrd;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, La/pvt;

    .line 168
    .line 169
    iget-object p0, p0, La/pvt;->a:La/y3v;

    .line 170
    .line 171
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p0, La/nx20;

    .line 174
    .line 175
    iget-object p0, p0, La/nx20;->b:La/ir30;

    .line 176
    .line 177
    invoke-virtual {p0}, La/ir30;->b()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Lkotlin/Pair;

    .line 182
    .line 183
    if-eqz p0, :cond_3

    .line 184
    .line 185
    iget-object p1, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Ljava/lang/Number;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 190
    .line 191
    .line 192
    move-result-wide v3

    .line 193
    cmp-long p1, v3, v1

    .line 194
    .line 195
    if-nez p1, :cond_3

    .line 196
    .line 197
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Ljava/util/List;

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_3
    sget-object p0, La/iun;->a:La/iun;

    .line 203
    .line 204
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
