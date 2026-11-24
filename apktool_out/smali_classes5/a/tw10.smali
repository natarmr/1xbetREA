.class public final La/tw10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cx10;

.field public final synthetic l:La/ql5;


# direct methods
.method public synthetic constructor <init>(La/cx10;La/ql5;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tw10;->i:B

    iput-object p1, p0, La/tw10;->k:La/cx10;

    iput-object p2, p0, La/tw10;->l:La/ql5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/tw10;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/tw10;->l:La/ql5;

    .line 4
    .line 5
    iget-object p0, p0, La/tw10;->k:La/cx10;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/tw10;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/tw10;-><init>(La/cx10;La/ql5;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/tw10;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/tw10;-><init>(La/cx10;La/ql5;La/yje;B)V

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
    iget-byte v0, p0, La/tw10;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tw10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/tw10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/tw10;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/tw10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/tw10;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/tw10;->k:La/cx10;

    .line 6
    .line 7
    iget-object v3, p0, La/tw10;->l:La/ql5;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/tw10;->j:Z

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
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v2, La/cx10;->q:La/ahu;

    .line 35
    .line 36
    iput-boolean v4, p0, La/tw10;->j:Z

    .line 37
    .line 38
    invoke-static {p1, p0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    move-object v5, v0

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 47
    .line 48
    iget-wide p0, p1, La/ql5;->a:J

    .line 49
    .line 50
    iget-wide v0, v3, La/ql5;->a:J

    .line 51
    .line 52
    cmp-long p0, p0, v0

    .line 53
    .line 54
    if-eqz p0, :cond_5

    .line 55
    .line 56
    iget-object p0, v2, La/cx10;->s:La/zlt0;

    .line 57
    .line 58
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/vlk;

    .line 61
    .line 62
    invoke-virtual {p0}, La/vlk;->b()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 p1, 0x0

    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    iget-object p0, v2, La/cx10;->w:La/ctf0;

    .line 70
    .line 71
    new-array v0, p1, [Ljava/lang/Object;

    .line 72
    .line 73
    const v1, 0x7f13002e

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, v3, La/ql5;->i:La/txs0;

    .line 81
    .line 82
    invoke-virtual {v1}, La/txs0;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const v1, 0x7f13002f

    .line 90
    .line 91
    .line 92
    new-array p1, p1, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {p0, v1, p1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const/4 p1, 0x2

    .line 99
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "%s\n\n%s"

    .line 108
    .line 109
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_1
    iget-object p0, v2, La/cx10;->G:La/ol60;

    .line 114
    .line 115
    new-instance p1, La/iw10;

    .line 116
    .line 117
    invoke-direct {p1, v3, v0}, La/iw10;-><init>(La/ql5;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    move-object v0, v5

    .line 129
    sget-object v5, La/sw10;->a:La/sw10;

    .line 130
    .line 131
    new-instance v8, La/tw10;

    .line 132
    .line 133
    invoke-direct {v8, v2, v3, v0, p1}, La/tw10;-><init>(La/cx10;La/ql5;La/yje;B)V

    .line 134
    .line 135
    .line 136
    const/16 v9, 0xe

    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_3
    return-object v5

    .line 146
    :pswitch_0
    move-object v0, v5

    .line 147
    sget-object v5, La/wne;->a:La/wne;

    .line 148
    .line 149
    iget-boolean v6, p0, La/tw10;->j:Z

    .line 150
    .line 151
    if-eqz v6, :cond_7

    .line 152
    .line 153
    if-ne v6, v4, :cond_6

    .line 154
    .line 155
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    move-object v5, v0

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, v2, La/cx10;->r:La/mnb;

    .line 168
    .line 169
    iput-boolean v4, p0, La/tw10;->j:Z

    .line 170
    .line 171
    invoke-virtual {p1, v3, p0}, La/mnb;->a(La/ql5;La/zje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-ne p0, v5, :cond_8

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    :goto_4
    invoke-virtual {v2}, La/cx10;->z()V

    .line 179
    .line 180
    .line 181
    iget-object p0, v2, La/cx10;->z:La/tzi;

    .line 182
    .line 183
    iget-object p0, p0, La/tzi;->h:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, La/ag3;

    .line 186
    .line 187
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 188
    .line 189
    const-string p1, "change_bill_done"

    .line 190
    .line 191
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object p0, v2, La/cx10;->G:La/ol60;

    .line 195
    .line 196
    sget-object p1, La/gw10;->a:La/gw10;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_5
    return-object v5

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
