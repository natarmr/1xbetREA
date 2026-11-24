.class public final La/pi80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/ri80;

.field public k:La/k050;

.field public l:La/qi80;

.field public m:B

.field public final synthetic n:La/qi80;


# direct methods
.method public synthetic constructor <init>(La/qi80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pi80;->i:B

    iput-object p1, p0, La/pi80;->n:La/qi80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/pi80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pi80;->n:La/qi80;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pi80;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pi80;-><init>(La/qi80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/pi80;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/pi80;-><init>(La/qi80;La/yje;B)V

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
    iget-byte v0, p0, La/pi80;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pi80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pi80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pi80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pi80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pi80;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pi80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/pi80;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pi80;->n:La/qi80;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x2

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
    iget-byte v6, p0, La/pi80;->m:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v4, :cond_1

    .line 20
    .line 21
    if-ne v6, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    iget-object v1, p0, La/pi80;->l:La/qi80;

    .line 32
    .line 33
    iget-object v2, p0, La/pi80;->k:La/k050;

    .line 34
    .line 35
    iget-object v4, p0, La/pi80;->j:La/ri80;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v1, La/qi80;->j:La/ri80;

    .line 45
    .line 46
    iget-object v2, p1, La/ri80;->a:La/k050;

    .line 47
    .line 48
    iput-object p1, p0, La/pi80;->j:La/ri80;

    .line 49
    .line 50
    iput-object v2, p0, La/pi80;->k:La/k050;

    .line 51
    .line 52
    iput-object v1, p0, La/pi80;->l:La/qi80;

    .line 53
    .line 54
    iput-byte v4, p0, La/pi80;->m:B

    .line 55
    .line 56
    invoke-virtual {v2, p0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-ne v4, v0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-object v4, p1

    .line 64
    :goto_0
    :try_start_0
    iget-object p1, v4, La/ri80;->b:La/ti80;

    .line 65
    .line 66
    iget-object v4, p1, La/ti80;->g:La/q99;

    .line 67
    .line 68
    invoke-static {v4}, La/xkb;->K(La/q99;)La/itb;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v6, La/si80;

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-direct {v6, p1, v5, v7}, La/si80;-><init>(La/ti80;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance p1, La/fnq;

    .line 79
    .line 80
    invoke-direct {p1, v4, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    invoke-interface {v2, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v2, La/gp00;->c:La/gp00;

    .line 87
    .line 88
    iput-object v5, p0, La/pi80;->j:La/ri80;

    .line 89
    .line 90
    iput-object v5, p0, La/pi80;->k:La/k050;

    .line 91
    .line 92
    iput-object v5, p0, La/pi80;->l:La/qi80;

    .line 93
    .line 94
    iput-byte v3, p0, La/pi80;->m:B

    .line 95
    .line 96
    invoke-virtual {v1, p1, v2, p0}, La/qi80;->a(La/fnq;La/gp00;La/bnn0;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v0, :cond_4

    .line 101
    .line 102
    :goto_1
    move-object v5, v0

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_3
    return-object v5

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    invoke-interface {v2, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 113
    .line 114
    iget-byte v6, p0, La/pi80;->m:B

    .line 115
    .line 116
    if-eqz v6, :cond_7

    .line 117
    .line 118
    if-eq v6, v4, :cond_6

    .line 119
    .line 120
    if-ne v6, v3, :cond_5

    .line 121
    .line 122
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_6
    iget-object v1, p0, La/pi80;->l:La/qi80;

    .line 131
    .line 132
    iget-object v2, p0, La/pi80;->k:La/k050;

    .line 133
    .line 134
    iget-object v6, p0, La/pi80;->j:La/ri80;

    .line 135
    .line 136
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v6, v1, La/qi80;->j:La/ri80;

    .line 144
    .line 145
    iget-object v2, v6, La/ri80;->a:La/k050;

    .line 146
    .line 147
    iput-object v6, p0, La/pi80;->j:La/ri80;

    .line 148
    .line 149
    iput-object v2, p0, La/pi80;->k:La/k050;

    .line 150
    .line 151
    iput-object v1, p0, La/pi80;->l:La/qi80;

    .line 152
    .line 153
    iput-byte v4, p0, La/pi80;->m:B

    .line 154
    .line 155
    invoke-virtual {v2, p0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v0, :cond_8

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    :goto_4
    :try_start_1
    iget-object p1, v6, La/ri80;->b:La/ti80;

    .line 163
    .line 164
    iget-object v6, p1, La/ti80;->f:La/q99;

    .line 165
    .line 166
    invoke-static {v6}, La/xkb;->K(La/q99;)La/itb;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    new-instance v7, La/si80;

    .line 171
    .line 172
    invoke-direct {v7, p1, v5, v4}, La/si80;-><init>(La/ti80;La/yje;B)V

    .line 173
    .line 174
    .line 175
    new-instance p1, La/fnq;

    .line 176
    .line 177
    invoke-direct {p1, v6, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    invoke-interface {v2, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v2, La/gp00;->b:La/gp00;

    .line 184
    .line 185
    iput-object v5, p0, La/pi80;->j:La/ri80;

    .line 186
    .line 187
    iput-object v5, p0, La/pi80;->k:La/k050;

    .line 188
    .line 189
    iput-object v5, p0, La/pi80;->l:La/qi80;

    .line 190
    .line 191
    iput-byte v3, p0, La/pi80;->m:B

    .line 192
    .line 193
    invoke-virtual {v1, p1, v2, p0}, La/qi80;->a(La/fnq;La/gp00;La/bnn0;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, v0, :cond_9

    .line 198
    .line 199
    :goto_5
    move-object v5, v0

    .line 200
    goto :goto_7

    .line 201
    :cond_9
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_7
    return-object v5

    .line 204
    :catchall_1
    move-exception p0

    .line 205
    invoke-interface {v2, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
