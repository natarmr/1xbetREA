.class public final La/wt1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cv1;

.field public final synthetic l:La/xk80;


# direct methods
.method public synthetic constructor <init>(La/cv1;La/xk80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wt1;->i:B

    iput-object p1, p0, La/wt1;->k:La/cv1;

    iput-object p2, p0, La/wt1;->l:La/xk80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/wt1;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/wt1;

    .line 7
    .line 8
    iget-object v0, p0, La/wt1;->l:La/xk80;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object p0, p0, La/wt1;->k:La/cv1;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/wt1;-><init>(La/cv1;La/xk80;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/wt1;

    .line 18
    .line 19
    iget-object v0, p0, La/wt1;->l:La/xk80;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object p0, p0, La/wt1;->k:La/cv1;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/wt1;-><init>(La/cv1;La/xk80;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/wt1;

    .line 29
    .line 30
    iget-object v0, p0, La/wt1;->l:La/xk80;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object p0, p0, La/wt1;->k:La/cv1;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/wt1;-><init>(La/cv1;La/xk80;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, La/wt1;

    .line 40
    .line 41
    iget-object v0, p0, La/wt1;->l:La/xk80;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object p0, p0, La/wt1;->k:La/cv1;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, p2, v1}, La/wt1;-><init>(La/cv1;La/xk80;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
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
    iget-byte v0, p0, La/wt1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wt1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wt1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wt1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wt1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wt1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wt1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wt1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wt1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wt1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wt1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wt1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wt1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/wt1;->i:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    iget-object v2, p0, La/wt1;->k:La/cv1;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/wt1;->l:La/xk80;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, p0, La/wt1;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v2, La/cv1;->b:La/bv1;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v5}, La/xk80;->k()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eq v2, p1, :cond_2

    .line 45
    .line 46
    iput-boolean v4, p0, La/wt1;->j:Z

    .line 47
    .line 48
    invoke-static {v5, p1, v6, p0, v1}, La/xk80;->g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    move-object v6, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v6

    .line 59
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v7, p0, La/wt1;->j:Z

    .line 62
    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    if-ne v7, v4, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v2, La/cv1;->b:La/bv1;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-virtual {v5}, La/xk80;->k()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eq v2, p1, :cond_5

    .line 89
    .line 90
    iput-boolean v4, p0, La/wt1;->j:Z

    .line 91
    .line 92
    invoke-static {v5, p1, v6, p0, v1}, La/xk80;->g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v0, :cond_5

    .line 97
    .line 98
    move-object v6, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_3
    return-object v6

    .line 103
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v7, p0, La/wt1;->j:Z

    .line 106
    .line 107
    if-eqz v7, :cond_7

    .line 108
    .line 109
    if-ne v7, v4, :cond_6

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v2, La/cv1;->b:La/bv1;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-virtual {v5}, La/xk80;->k()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eq v2, p1, :cond_8

    .line 133
    .line 134
    iput-boolean v4, p0, La/wt1;->j:Z

    .line 135
    .line 136
    invoke-static {v5, p1, v6, p0, v1}, La/xk80;->g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-ne p0, v0, :cond_8

    .line 141
    .line 142
    move-object v6, v0

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    :goto_5
    return-object v6

    .line 147
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 148
    .line 149
    iget-boolean v7, p0, La/wt1;->j:Z

    .line 150
    .line 151
    if-eqz v7, :cond_a

    .line 152
    .line 153
    if-ne v7, v4, :cond_9

    .line 154
    .line 155
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object p1, v2, La/cv1;->b:La/bv1;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    invoke-virtual {v5}, La/xk80;->k()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eq v2, p1, :cond_b

    .line 177
    .line 178
    iput-boolean v4, p0, La/wt1;->j:Z

    .line 179
    .line 180
    invoke-static {v5, p1, v6, p0, v1}, La/xk80;->g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-ne p0, v0, :cond_b

    .line 185
    .line 186
    move-object v6, v0

    .line 187
    goto :goto_7

    .line 188
    :cond_b
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    :goto_7
    return-object v6

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
