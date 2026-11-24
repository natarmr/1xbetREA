.class public final La/xqn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/arn0;


# direct methods
.method public synthetic constructor <init>(La/arn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xqn0;->i:B

    iput-object p1, p0, La/xqn0;->k:La/arn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xqn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xqn0;->k:La/arn0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xqn0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xqn0;-><init>(La/arn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xqn0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xqn0;-><init>(La/arn0;La/yje;B)V

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
    iget-byte v0, p0, La/xqn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xqn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xqn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xqn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xqn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xqn0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xqn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/xqn0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/xqn0;->k:La/arn0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v2, La/arn0;->v:La/ol60;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/xqn0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

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
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/dqn0;->a:La/dqn0;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v3, p0, La/xqn0;->j:Z

    .line 40
    .line 41
    const-wide/16 v6, 0x1f4

    .line 42
    .line 43
    invoke-static {v6, v7, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v5, :cond_2

    .line 48
    .line 49
    move-object v4, v5

    .line 50
    goto :goto_5

    .line 51
    :cond_2
    :goto_0
    iget-object p0, v2, La/arn0;->u:La/p7m0;

    .line 52
    .line 53
    new-instance p1, La/rqn0;

    .line 54
    .line 55
    iget-object v1, v2, La/arn0;->c:La/ctf0;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    new-array v5, v3, [Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 61
    .line 62
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const v5, 0x7f131456

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v2, v2, La/arn0;->z:La/ksn0;

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    iget-object v3, v2, La/ksn0;->a:Ljava/lang/String;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v3, v4

    .line 81
    :goto_1
    const-string v5, ""

    .line 82
    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    move-object v3, v5

    .line 86
    :cond_4
    if-eqz v2, :cond_5

    .line 87
    .line 88
    iget-object v6, v2, La/ksn0;->c:Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object v6, v4

    .line 92
    :goto_2
    if-nez v6, :cond_6

    .line 93
    .line 94
    move-object v6, v5

    .line 95
    :cond_6
    if-eqz v2, :cond_7

    .line 96
    .line 97
    iget-object v2, v2, La/ksn0;->b:Ljava/lang/String;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_7
    move-object v2, v4

    .line 101
    :goto_3
    if-nez v2, :cond_8

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_8
    move-object v5, v2

    .line 105
    :goto_4
    invoke-direct {p1, v1, v3, v6, v5}, La/rqn0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    sget-object p0, La/iqn0;->a:La/iqn0;

    .line 115
    .line 116
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, La/zpn0;->a:La/zpn0;

    .line 120
    .line 121
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_5
    return-object v4

    .line 127
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 128
    .line 129
    iget-boolean v5, p0, La/xqn0;->j:Z

    .line 130
    .line 131
    if-eqz v5, :cond_a

    .line 132
    .line 133
    if-ne v5, v3, :cond_9

    .line 134
    .line 135
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, v2, La/arn0;->k:La/uii;

    .line 147
    .line 148
    iget-object v1, p1, La/uii;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, La/hnu;

    .line 151
    .line 152
    iget-object v1, v1, La/hnu;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, La/dpi0;

    .line 155
    .line 156
    iget-object v1, v1, La/dpi0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, La/xxn0;

    .line 159
    .line 160
    iget-object v1, v1, La/xxn0;->a:La/p7m0;

    .line 161
    .line 162
    new-instance v5, La/ewt;

    .line 163
    .line 164
    const/16 v6, 0xd

    .line 165
    .line 166
    invoke-direct {v5, v1, p1, v6}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    new-instance p1, La/agn0;

    .line 170
    .line 171
    invoke-direct {p1, v2, v4, v6}, La/agn0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 172
    .line 173
    .line 174
    iput-boolean v3, p0, La/xqn0;->j:Z

    .line 175
    .line 176
    invoke-static {v5, p1, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, v0, :cond_b

    .line 181
    .line 182
    move-object v4, v0

    .line 183
    goto :goto_7

    .line 184
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_7
    return-object v4

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
