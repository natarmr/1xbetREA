.class public final La/q1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/s1;

.field public final synthetic l:La/jub0;


# direct methods
.method public synthetic constructor <init>(La/s1;La/jub0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/q1;->i:B

    iput-object p1, p0, La/q1;->k:La/s1;

    iput-object p2, p0, La/q1;->l:La/jub0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/q1;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/q1;->l:La/jub0;

    .line 4
    .line 5
    iget-object p0, p0, La/q1;->k:La/s1;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/q1;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/q1;-><init>(La/s1;La/jub0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/q1;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/q1;-><init>(La/s1;La/jub0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/q1;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/q1;-><init>(La/s1;La/jub0;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/q1;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/q1;-><init>(La/s1;La/jub0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/q1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/q1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/q1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/q1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/q1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/q1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/q1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/q1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/q1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/q1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/q1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/q1;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/q1;->l:La/jub0;

    .line 4
    .line 5
    iget-object v2, p0, La/q1;->k:La/s1;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-boolean v6, p0, La/q1;->j:Z

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
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v2, La/s1;->q:La/gy40;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    new-instance v2, La/kub0;

    .line 38
    .line 39
    invoke-direct {v2, v1}, La/kub0;-><init>(La/jub0;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v5, p0, La/q1;->j:Z

    .line 43
    .line 44
    invoke-virtual {p1, v2, p0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, v0, :cond_2

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    :goto_1
    return-object v3

    .line 55
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 56
    .line 57
    iget-boolean v6, p0, La/q1;->j:Z

    .line 58
    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    if-ne v6, v5, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, v2, La/s1;->q:La/gy40;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    iput-boolean v5, p0, La/q1;->j:Z

    .line 79
    .line 80
    invoke-virtual {p1, v1, p0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v0, :cond_5

    .line 85
    .line 86
    move-object v3, v0

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_3
    return-object v3

    .line 91
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 92
    .line 93
    iget-boolean v6, p0, La/q1;->j:Z

    .line 94
    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    if-ne v6, v5, :cond_6

    .line 98
    .line 99
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v2, La/s1;->q:La/gy40;

    .line 111
    .line 112
    if-eqz p1, :cond_8

    .line 113
    .line 114
    new-instance v2, La/iub0;

    .line 115
    .line 116
    invoke-direct {v2, v1}, La/iub0;-><init>(La/jub0;)V

    .line 117
    .line 118
    .line 119
    iput-boolean v5, p0, La/q1;->j:Z

    .line 120
    .line 121
    invoke-virtual {p1, v2, p0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-ne p0, v0, :cond_8

    .line 126
    .line 127
    move-object v3, v0

    .line 128
    goto :goto_5

    .line 129
    :cond_8
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_5
    return-object v3

    .line 132
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 133
    .line 134
    iget-boolean v6, p0, La/q1;->j:Z

    .line 135
    .line 136
    if-eqz v6, :cond_a

    .line 137
    .line 138
    if-ne v6, v5, :cond_9

    .line 139
    .line 140
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, v2, La/s1;->q:La/gy40;

    .line 152
    .line 153
    if-eqz p1, :cond_b

    .line 154
    .line 155
    new-instance v2, La/iub0;

    .line 156
    .line 157
    invoke-direct {v2, v1}, La/iub0;-><init>(La/jub0;)V

    .line 158
    .line 159
    .line 160
    iput-boolean v5, p0, La/q1;->j:Z

    .line 161
    .line 162
    invoke-virtual {p1, v2, p0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v0, :cond_b

    .line 167
    .line 168
    move-object v3, v0

    .line 169
    goto :goto_7

    .line 170
    :cond_b
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    :goto_7
    return-object v3

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
