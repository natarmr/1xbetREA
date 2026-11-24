.class public final La/nwe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/l7m0;

.field public final synthetic l:La/cqq;

.field public final synthetic m:La/wpq;

.field public final synthetic n:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/cqq;La/wpq;La/pkk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/nwe0;->i:B

    iput-object p1, p0, La/nwe0;->k:La/l7m0;

    iput-object p2, p0, La/nwe0;->l:La/cqq;

    iput-object p3, p0, La/nwe0;->m:La/wpq;

    iput-object p4, p0, La/nwe0;->n:La/pkk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/nwe0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/nwe0;

    .line 7
    .line 8
    iget-object v4, p0, La/nwe0;->n:La/pkk0;

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    iget-object v1, p0, La/nwe0;->k:La/l7m0;

    .line 12
    .line 13
    iget-object v2, p0, La/nwe0;->l:La/cqq;

    .line 14
    .line 15
    iget-object v3, p0, La/nwe0;->m:La/wpq;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/nwe0;-><init>(La/l7m0;La/cqq;La/wpq;La/pkk0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v1, La/nwe0;

    .line 24
    .line 25
    iget-object v5, p0, La/nwe0;->n:La/pkk0;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    iget-object v2, p0, La/nwe0;->k:La/l7m0;

    .line 29
    .line 30
    iget-object v3, p0, La/nwe0;->l:La/cqq;

    .line 31
    .line 32
    iget-object v4, p0, La/nwe0;->m:La/wpq;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v7}, La/nwe0;-><init>(La/l7m0;La/cqq;La/wpq;La/pkk0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    move-object v6, p2

    .line 39
    new-instance v1, La/nwe0;

    .line 40
    .line 41
    iget-object v5, p0, La/nwe0;->n:La/pkk0;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    iget-object v2, p0, La/nwe0;->k:La/l7m0;

    .line 45
    .line 46
    iget-object v3, p0, La/nwe0;->l:La/cqq;

    .line 47
    .line 48
    iget-object v4, p0, La/nwe0;->m:La/wpq;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v7}, La/nwe0;-><init>(La/l7m0;La/cqq;La/wpq;La/pkk0;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nwe0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nwe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nwe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nwe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nwe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nwe0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nwe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/nwe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/nwe0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/nwe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/nwe0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    iget-object v2, p0, La/nwe0;->n:La/pkk0;

    .line 6
    .line 7
    iget-object v3, p0, La/nwe0;->m:La/wpq;

    .line 8
    .line 9
    iget-object v4, p0, La/nwe0;->l:La/cqq;

    .line 10
    .line 11
    iget-object v5, p0, La/nwe0;->k:La/l7m0;

    .line 12
    .line 13
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v9, p0, La/nwe0;->j:Z

    .line 23
    .line 24
    if-eqz v9, :cond_1

    .line 25
    .line 26
    if-ne v9, v7, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, La/f7f0;

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    invoke-direct {p1, v5, v6}, La/f7f0;-><init>(La/l7m0;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v8, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v5, La/wk30;

    .line 54
    .line 55
    invoke-direct {v5, p1, v1}, La/wk30;-><init>(La/gmq;B)V

    .line 56
    .line 57
    .line 58
    new-instance p1, La/kwe0;

    .line 59
    .line 60
    invoke-direct {p1, v4, v3, v2, v6}, La/kwe0;-><init>(La/cqq;La/wpq;La/pkk0;B)V

    .line 61
    .line 62
    .line 63
    iput-boolean v7, p0, La/nwe0;->j:Z

    .line 64
    .line 65
    invoke-virtual {v5, p1, p0}, La/wk30;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v0, :cond_2

    .line 70
    .line 71
    move-object v8, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_1
    return-object v8

    .line 76
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v9, p0, La/nwe0;->j:Z

    .line 79
    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    if-ne v9, v7, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, La/wda0;

    .line 96
    .line 97
    invoke-direct {p1, v5, v1}, La/wda0;-><init>(La/l7m0;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v8, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v1, La/wk30;

    .line 109
    .line 110
    const/16 v5, 0x1c

    .line 111
    .line 112
    invoke-direct {v1, p1, v5}, La/wk30;-><init>(La/gmq;B)V

    .line 113
    .line 114
    .line 115
    new-instance p1, La/kwe0;

    .line 116
    .line 117
    invoke-direct {p1, v4, v3, v2, v7}, La/kwe0;-><init>(La/cqq;La/wpq;La/pkk0;B)V

    .line 118
    .line 119
    .line 120
    iput-boolean v7, p0, La/nwe0;->j:Z

    .line 121
    .line 122
    invoke-virtual {v1, p1, p0}, La/wk30;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_5

    .line 127
    .line 128
    move-object v8, v0

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_3
    return-object v8

    .line 133
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget-boolean v1, p0, La/nwe0;->j:Z

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    if-ne v1, v7, :cond_6

    .line 140
    .line 141
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance p1, La/wda0;

    .line 153
    .line 154
    const/16 v1, 0x14

    .line 155
    .line 156
    invoke-direct {p1, v5, v1}, La/wda0;-><init>(La/l7m0;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {v8, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    new-instance v1, La/wk30;

    .line 168
    .line 169
    const/16 v5, 0x1a

    .line 170
    .line 171
    invoke-direct {v1, p1, v5}, La/wk30;-><init>(La/gmq;B)V

    .line 172
    .line 173
    .line 174
    new-instance p1, La/kwe0;

    .line 175
    .line 176
    const/4 v5, 0x0

    .line 177
    invoke-direct {p1, v4, v3, v2, v5}, La/kwe0;-><init>(La/cqq;La/wpq;La/pkk0;B)V

    .line 178
    .line 179
    .line 180
    iput-boolean v7, p0, La/nwe0;->j:Z

    .line 181
    .line 182
    invoke-virtual {v1, p1, p0}, La/wk30;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne p0, v0, :cond_8

    .line 187
    .line 188
    move-object v8, v0

    .line 189
    goto :goto_5

    .line 190
    :cond_8
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_5
    return-object v8

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
