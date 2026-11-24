.class public final La/u9w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/naw;


# direct methods
.method public synthetic constructor <init>(La/naw;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u9w;->i:B

    iput-object p1, p0, La/u9w;->k:La/naw;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/u9w;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u9w;->k:La/naw;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/u9w;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/u9w;-><init>(La/naw;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/u9w;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/u9w;-><init>(La/naw;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u9w;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u9w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u9w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u9w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u9w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u9w;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u9w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/u9w;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, La/u9w;->k:La/naw;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/u9w;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v4, :cond_1

    .line 20
    .line 21
    if-ne v6, v2, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v3, La/naw;->f:La/a6u;

    .line 39
    .line 40
    iget-object v1, v3, La/naw;->z0:La/s77;

    .line 41
    .line 42
    iput-byte v4, p0, La/u9w;->j:B

    .line 43
    .line 44
    iget-object v6, p1, La/a6u;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v6, La/g2v;

    .line 47
    .line 48
    sget-object v7, La/bm5;->c:La/bm5;

    .line 49
    .line 50
    invoke-virtual {v6, v7}, La/g2v;->i(La/bm5;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v1, p0}, La/a6u;->o(La/s77;La/zje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p1, p0}, La/a6u;->K(La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_1
    check-cast p1, La/ql5;

    .line 69
    .line 70
    iget-object v1, v3, La/naw;->L:La/mne;

    .line 71
    .line 72
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 73
    .line 74
    new-instance v6, La/haw;

    .line 75
    .line 76
    invoke-direct {v6, v3, p1, v5, v4}, La/haw;-><init>(La/naw;La/ql5;La/yje;B)V

    .line 77
    .line 78
    .line 79
    iput-byte v2, p0, La/u9w;->j:B

    .line 80
    .line 81
    invoke-static {v1, v6, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_5

    .line 86
    .line 87
    :goto_2
    move-object v5, v0

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_4
    return-object v5

    .line 92
    :pswitch_0
    iget-wide v6, v3, La/naw;->y0:J

    .line 93
    .line 94
    sget-object v0, La/wne;->a:La/wne;

    .line 95
    .line 96
    iget-byte v8, p0, La/u9w;->j:B

    .line 97
    .line 98
    const-wide/16 v9, 0x0

    .line 99
    .line 100
    if-eqz v8, :cond_8

    .line 101
    .line 102
    if-eq v8, v4, :cond_7

    .line 103
    .line 104
    if-ne v8, v2, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v3, La/naw;->d:La/sys0;

    .line 122
    .line 123
    sget-object v1, La/sys0;->c:La/sys0;

    .line 124
    .line 125
    iget-object v8, v3, La/naw;->q:La/ehf0;

    .line 126
    .line 127
    if-ne p1, v1, :cond_9

    .line 128
    .line 129
    iput-byte v4, p0, La/u9w;->j:B

    .line 130
    .line 131
    invoke-virtual {v8, v6, v7, p0}, La/ehf0;->k(JLa/zje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v0, :cond_d

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_9
    iget-object p1, v3, La/naw;->i0:La/ocl;

    .line 139
    .line 140
    invoke-virtual {p1}, La/ocl;->d()J

    .line 141
    .line 142
    .line 143
    move-result-wide v11

    .line 144
    new-instance p1, Ljava/lang/Long;

    .line 145
    .line 146
    invoke-direct {p1, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v11

    .line 153
    cmp-long v1, v11, v9

    .line 154
    .line 155
    if-eqz v1, :cond_a

    .line 156
    .line 157
    move-object v5, p1

    .line 158
    :cond_a
    if-eqz v5, :cond_b

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v6

    .line 164
    :cond_b
    iput-byte v2, p0, La/u9w;->j:B

    .line 165
    .line 166
    invoke-virtual {v8, v6, v7, p0}, La/ehf0;->k(JLa/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v0, :cond_c

    .line 171
    .line 172
    :goto_5
    move-object v5, v0

    .line 173
    goto :goto_8

    .line 174
    :cond_c
    :goto_6
    iget-object p0, v3, La/naw;->j0:La/hpc;

    .line 175
    .line 176
    iget-object p0, p0, La/hpc;->a:La/rrd;

    .line 177
    .line 178
    iget-object p0, p0, La/rrd;->g:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p0, La/m0w;

    .line 181
    .line 182
    iput-wide v9, p0, La/m0w;->h:J

    .line 183
    .line 184
    :cond_d
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_8
    return-object v5

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
