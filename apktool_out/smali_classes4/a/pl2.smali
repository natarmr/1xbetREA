.class public final La/pl2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ul2;


# direct methods
.method public synthetic constructor <init>(La/ul2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pl2;->i:B

    iput-object p1, p0, La/pl2;->k:La/ul2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pl2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pl2;->k:La/ul2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pl2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/pl2;-><init>(La/ul2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/pl2;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/pl2;-><init>(La/ul2;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pl2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/pl2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/pl2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/pl2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/pl2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/pl2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/pl2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/pl2;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/pl2;->k:La/ul2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/pl2;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget p1, La/ul2;->S:I

    .line 34
    .line 35
    iget-object p1, v2, La/ul2;->D:La/a6u;

    .line 36
    .line 37
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, La/nl2;

    .line 42
    .line 43
    iget-boolean v1, v1, La/nl2;->f:Z

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    iput-object v3, p1, La/a6u;->f:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :goto_0
    new-instance v1, La/gkr;

    .line 54
    .line 55
    const/16 v5, 0x11

    .line 56
    .line 57
    invoke-direct {v1, p1, v3, v5}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    const-wide/16 v5, 0x8

    .line 61
    .line 62
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 63
    .line 64
    invoke-static {v5, v6, p1, v1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, v2, La/ul2;->B:La/bzu;

    .line 69
    .line 70
    invoke-virtual {v1, v4}, La/bzu;->b(Z)La/gmq;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v5, v2, La/ul2;->C:La/abu;

    .line 75
    .line 76
    iget-object v6, v5, La/abu;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, La/gst0;

    .line 79
    .line 80
    iget-object v6, v6, La/gst0;->a:La/rrt0;

    .line 81
    .line 82
    iget-object v6, v6, La/rrt0;->c:La/p7m0;

    .line 83
    .line 84
    new-instance v7, La/ewt;

    .line 85
    .line 86
    const/16 v8, 0xb

    .line 87
    .line 88
    invoke-direct {v7, v6, v5, v8}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    new-instance v5, La/ql2;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    invoke-direct {v5, v2, v3, v6}, La/ql2;-><init>(La/i3t0;La/yje;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v1, v7, v5}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1, v6}, La/uvw;->Q(La/gmq;Z)La/a1g;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v1, La/rl2;

    .line 106
    .line 107
    const/4 v5, 0x3

    .line 108
    invoke-direct {v1, v5, v3, v6}, La/rl2;-><init>(ILa/yje;B)V

    .line 109
    .line 110
    .line 111
    new-instance v5, La/dnq;

    .line 112
    .line 113
    invoke-direct {v5, p1, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v1, La/zo1;

    .line 121
    .line 122
    invoke-direct {v1, v3, v2, v4}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v1, La/mn1;

    .line 130
    .line 131
    const/16 v3, 0xf

    .line 132
    .line 133
    invoke-direct {v1, v2, v3}, La/mn1;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    iput-boolean v4, p0, La/pl2;->j:Z

    .line 137
    .line 138
    invoke-virtual {p1, v1, p0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_3

    .line 143
    .line 144
    move-object v3, v0

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_2
    return-object v3

    .line 149
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 150
    .line 151
    iget-boolean v5, p0, La/pl2;->j:Z

    .line 152
    .line 153
    if-eqz v5, :cond_5

    .line 154
    .line 155
    if-ne v5, v4, :cond_4

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v2, La/ul2;->E:La/hjd;

    .line 169
    .line 170
    new-instance v1, La/cid;

    .line 171
    .line 172
    sget-object v2, La/y1p;->b:La/y1p;

    .line 173
    .line 174
    new-instance v2, La/fq2;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v3, "bet_favor_events"

    .line 180
    .line 181
    invoke-direct {v1, v3, v2}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 182
    .line 183
    .line 184
    iput-boolean v4, p0, La/pl2;->j:Z

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v1, p0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    if-ne p0, v0, :cond_6

    .line 194
    .line 195
    move-object v3, v0

    .line 196
    goto :goto_4

    .line 197
    :cond_6
    :goto_3
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
