.class public final La/v6d;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/gmq;


# direct methods
.method public synthetic constructor <init>(La/gmq;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v6d;->i:B

    iput-object p1, p0, La/v6d;->l:La/gmq;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v6d;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/v6d;->l:La/gmq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/v6d;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/v6d;-><init>(La/gmq;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/v6d;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/v6d;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/v6d;-><init>(La/gmq;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/v6d;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/v6d;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/v6d;-><init>(La/gmq;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/v6d;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/v6d;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/v6d;-><init>(La/gmq;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/v6d;->k:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/v6d;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/v6d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/v6d;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/v6d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hzb0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/v6d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/v6d;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/v6d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/v6d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/v6d;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/v6d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/hzb0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/v6d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/v6d;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/v6d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
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
    iget-byte v0, p0, La/v6d;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/v6d;->l:La/gmq;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-object v0, p0, La/v6d;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/kmq;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/v6d;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, La/uap;

    .line 36
    .line 37
    const/16 v2, 0xb

    .line 38
    .line 39
    invoke-direct {p1, v0, v2}, La/uap;-><init>(La/kmq;B)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, La/v6d;->k:Ljava/lang/Object;

    .line 43
    .line 44
    iput-boolean v3, p0, La/v6d;->j:Z

    .line 45
    .line 46
    invoke-interface {v1, p1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v5, :cond_2

    .line 51
    .line 52
    move-object v4, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v4

    .line 57
    :pswitch_0
    iget-object v0, p0, La/v6d;->k:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, La/hzb0;

    .line 60
    .line 61
    sget-object v5, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v6, p0, La/v6d;->j:Z

    .line 64
    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    if-ne v6, v3, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, La/u6d;

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    invoke-direct {p1, v0, v2}, La/u6d;-><init>(La/hzb0;B)V

    .line 84
    .line 85
    .line 86
    iput-object v4, p0, La/v6d;->k:Ljava/lang/Object;

    .line 87
    .line 88
    iput-boolean v3, p0, La/v6d;->j:Z

    .line 89
    .line 90
    invoke-interface {v1, p1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v5, :cond_5

    .line 95
    .line 96
    move-object v4, v5

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_3
    return-object v4

    .line 101
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget-boolean v5, p0, La/v6d;->j:Z

    .line 104
    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    if-ne v5, v3, :cond_6

    .line 108
    .line 109
    iget-object p0, p0, La/v6d;->k:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, La/kmq;

    .line 112
    .line 113
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, La/v6d;->k:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, La/kmq;

    .line 127
    .line 128
    new-instance v2, La/k0f;

    .line 129
    .line 130
    const/16 v5, 0xd

    .line 131
    .line 132
    invoke-direct {v2, p1, v5}, La/k0f;-><init>(La/kmq;B)V

    .line 133
    .line 134
    .line 135
    iput-object v4, p0, La/v6d;->k:Ljava/lang/Object;

    .line 136
    .line 137
    iput-boolean v3, p0, La/v6d;->j:Z

    .line 138
    .line 139
    invoke-interface {v1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-ne p0, v0, :cond_8

    .line 144
    .line 145
    move-object v4, v0

    .line 146
    goto :goto_5

    .line 147
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_5
    return-object v4

    .line 150
    :pswitch_2
    iget-object v0, p0, La/v6d;->k:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, La/hzb0;

    .line 153
    .line 154
    sget-object v5, La/wne;->a:La/wne;

    .line 155
    .line 156
    iget-boolean v6, p0, La/v6d;->j:Z

    .line 157
    .line 158
    if-eqz v6, :cond_a

    .line 159
    .line 160
    if-ne v6, v3, :cond_9

    .line 161
    .line 162
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    new-instance p1, La/u6d;

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-direct {p1, v0, v2}, La/u6d;-><init>(La/hzb0;B)V

    .line 177
    .line 178
    .line 179
    iput-object v4, p0, La/v6d;->k:Ljava/lang/Object;

    .line 180
    .line 181
    iput-boolean v3, p0, La/v6d;->j:Z

    .line 182
    .line 183
    invoke-interface {v1, p1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-ne p0, v5, :cond_b

    .line 188
    .line 189
    move-object v4, v5

    .line 190
    goto :goto_7

    .line 191
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    :goto_7
    return-object v4

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
