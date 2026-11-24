.class public final La/j6p;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/k6p;


# direct methods
.method public synthetic constructor <init>(La/k6p;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j6p;->i:B

    iput-object p1, p0, La/j6p;->k:La/k6p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j6p;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/j6p;->k:La/k6p;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/j6p;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/j6p;-><init>(La/k6p;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/j6p;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/j6p;-><init>(La/k6p;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/j6p;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/j6p;-><init>(La/k6p;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/j6p;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j6p;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/j6p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/j6p;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/j6p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/j6p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/j6p;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/j6p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    check-cast p2, La/yje;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, La/j6p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, La/j6p;

    .line 60
    .line 61
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, La/j6p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/j6p;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/j6p;->k:La/k6p;

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
    iget-boolean v5, p0, La/j6p;->j:Z

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
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, La/j6p;

    .line 32
    .line 33
    invoke-direct {p1, v2, v3, v4}, La/j6p;-><init>(La/k6p;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v1, 0x1e

    .line 37
    .line 38
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    invoke-static {v1, v2, v3, p1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v1, La/h3p;->c:La/h3p;

    .line 45
    .line 46
    iput-boolean v4, p0, La/j6p;->j:Z

    .line 47
    .line 48
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    move-object v3, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v3

    .line 59
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v5, p0, La/j6p;->j:Z

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    if-ne v5, v4, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v2, La/k6p;->e:La/yzn0;

    .line 79
    .line 80
    iput-boolean v4, p0, La/j6p;->j:Z

    .line 81
    .line 82
    invoke-virtual {p1, p0}, La/yzn0;->l(La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v0, :cond_5

    .line 87
    .line 88
    move-object v3, v0

    .line 89
    goto :goto_3

    .line 90
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_3
    return-object v3

    .line 93
    :pswitch_1
    iget-object v0, v2, La/k6p;->u:La/p7m0;

    .line 94
    .line 95
    iget-boolean p0, p0, La/j6p;->j:Z

    .line 96
    .line 97
    sget-object v1, La/wne;->a:La/wne;

    .line 98
    .line 99
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    if-eqz p0, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    instance-of p1, p1, La/c6p;

    .line 109
    .line 110
    if-nez p1, :cond_7

    .line 111
    .line 112
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move-object v1, p1

    .line 117
    check-cast v1, La/f6p;

    .line 118
    .line 119
    new-instance v1, La/e6p;

    .line 120
    .line 121
    sget-object v3, La/y5p;->a:La/y5p;

    .line 122
    .line 123
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-direct {v1, v3}, La/e6p;-><init>(Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    invoke-virtual {v2}, La/k6p;->x()V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_7
    if-eqz p0, :cond_9

    .line 141
    .line 142
    iget-object p1, v2, La/k6p;->p:La/bby;

    .line 143
    .line 144
    if-eqz p1, :cond_8

    .line 145
    .line 146
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-ne p1, v4, :cond_8

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    invoke-virtual {v2}, La/k6p;->x()V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_9
    :goto_4
    if-nez p0, :cond_b

    .line 158
    .line 159
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    instance-of p1, p1, La/e6p;

    .line 164
    .line 165
    if-eqz p1, :cond_b

    .line 166
    .line 167
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    move-object v1, p1

    .line 172
    check-cast v1, La/f6p;

    .line 173
    .line 174
    new-instance v1, La/d6p;

    .line 175
    .line 176
    invoke-virtual {v2}, La/k6p;->w()La/jkm;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-direct {v1, v3}, La/d6p;-><init>(La/jkm;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_a

    .line 188
    .line 189
    :cond_b
    :goto_5
    iput-boolean p0, v2, La/k6p;->s:Z

    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
