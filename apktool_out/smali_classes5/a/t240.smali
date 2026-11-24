.class public final La/t240;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/j340;

.field public final synthetic l:La/ql5;


# direct methods
.method public synthetic constructor <init>(La/j340;La/ql5;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/t240;->i:B

    iput-object p1, p0, La/t240;->k:La/j340;

    iput-object p2, p0, La/t240;->l:La/ql5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/t240;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/t240;->l:La/ql5;

    .line 4
    .line 5
    iget-object p0, p0, La/t240;->k:La/j340;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/t240;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/t240;-><init>(La/j340;La/ql5;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/t240;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/t240;-><init>(La/j340;La/ql5;La/yje;B)V

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
    iget-byte v0, p0, La/t240;->i:B

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
    invoke-virtual {p0, p1, p2}, La/t240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t240;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t240;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/t240;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/t240;->k:La/j340;

    .line 7
    .line 8
    iget-object v4, p0, La/t240;->l:La/ql5;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/t240;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

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
    iget-object p1, v3, La/j340;->D:La/ahu;

    .line 34
    .line 35
    iput-boolean v5, p0, La/t240;->j:Z

    .line 36
    .line 37
    invoke-static {p1, p0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 46
    .line 47
    iget-wide p0, p1, La/ql5;->a:J

    .line 48
    .line 49
    iget-wide v0, v4, La/ql5;->a:J

    .line 50
    .line 51
    cmp-long p0, p0, v0

    .line 52
    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    iget-object p0, v3, La/j340;->F:La/zlt0;

    .line 56
    .line 57
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/vlk;

    .line 60
    .line 61
    invoke-virtual {p0}, La/vlk;->b()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    iget-object p0, v3, La/j340;->J:La/ctf0;

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    new-array v0, p1, [Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v1, p0, La/ctf0;->b:La/lsm0;

    .line 73
    .line 74
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v2, 0x7f13002e

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v1, v4, La/ql5;->i:La/txs0;

    .line 86
    .line 87
    invoke-virtual {v1}, La/txs0;->e()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    new-array v1, p1, [Ljava/lang/Object;

    .line 95
    .line 96
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 97
    .line 98
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const v1, 0x7f13002f

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const/4 p1, 0x2

    .line 110
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string p1, "%s\n\n%s"

    .line 119
    .line 120
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :goto_1
    new-instance p0, La/w040;

    .line 125
    .line 126
    invoke-direct {p0, v4, v0}, La/w040;-><init>(La/ql5;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    invoke-virtual {v3, v4}, La/j340;->M(La/ql5;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_3
    return-object v1

    .line 139
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 140
    .line 141
    iget-boolean v6, p0, La/t240;->j:Z

    .line 142
    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    if-ne v6, v5, :cond_6

    .line 146
    .line 147
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object p1, v3, La/j340;->E:La/mnb;

    .line 159
    .line 160
    iput-boolean v5, p0, La/t240;->j:Z

    .line 161
    .line 162
    invoke-virtual {p1, v4, p0}, La/mnb;->a(La/ql5;La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v0, :cond_8

    .line 167
    .line 168
    move-object v1, v0

    .line 169
    goto :goto_5

    .line 170
    :cond_8
    :goto_4
    iget-object p0, v3, La/j340;->L:La/tzi;

    .line 171
    .line 172
    iget-object p0, p0, La/tzi;->h:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, La/ag3;

    .line 175
    .line 176
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 177
    .line 178
    const-string p1, "change_bill_done"

    .line 179
    .line 180
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, La/u040;->a:La/u040;

    .line 184
    .line 185
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    :goto_5
    return-object v1

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
