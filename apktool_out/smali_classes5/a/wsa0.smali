.class public final La/wsa0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ata0;


# direct methods
.method public synthetic constructor <init>(La/ata0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wsa0;->i:B

    iput-object p1, p0, La/wsa0;->k:La/ata0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wsa0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wsa0;->k:La/ata0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wsa0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/wsa0;-><init>(La/ata0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/wsa0;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/wsa0;-><init>(La/ata0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/wsa0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/wsa0;-><init>(La/ata0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/wsa0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/wsa0;-><init>(La/ata0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wsa0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/wsa0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/wsa0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/wsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/wsa0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/wsa0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/wsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/wsa0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/wsa0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/wsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/wsa0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/wsa0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/wsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/wsa0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/wsa0;->k:La/ata0;

    .line 7
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
    iget-boolean v5, p0, La/wsa0;->j:Z

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
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v3, La/ata0;->z:La/vpu;

    .line 32
    .line 33
    invoke-virtual {p1}, La/vpu;->a()La/fnq;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, La/ysa0;

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    invoke-direct {v1, v3, v2}, La/ysa0;-><init>(La/ata0;B)V

    .line 41
    .line 42
    .line 43
    iput-boolean v4, p0, La/wsa0;->j:Z

    .line 44
    .line 45
    invoke-virtual {p1, v1, p0}, La/fnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    move-object v1, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v1

    .line 56
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v5, p0, La/wsa0;->j:Z

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    if-ne v5, v4, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v3, La/ata0;->t:La/x4u;

    .line 76
    .line 77
    iget-object p1, p1, La/x4u;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, La/n9s;

    .line 80
    .line 81
    invoke-virtual {p1}, La/n9s;->a()La/i89;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v1, La/ysa0;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, v3, v2}, La/ysa0;-><init>(La/ata0;B)V

    .line 89
    .line 90
    .line 91
    iput-boolean v4, p0, La/wsa0;->j:Z

    .line 92
    .line 93
    invoke-virtual {p1, v1, p0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v0, :cond_5

    .line 98
    .line 99
    move-object v1, v0

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_3
    return-object v1

    .line 104
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 105
    .line 106
    iget-boolean v5, p0, La/wsa0;->j:Z

    .line 107
    .line 108
    if-eqz v5, :cond_7

    .line 109
    .line 110
    if-ne v5, v4, :cond_6

    .line 111
    .line 112
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v3, La/ata0;->J:La/z8u;

    .line 124
    .line 125
    iget-object p1, p1, La/z8u;->a:La/m0o0;

    .line 126
    .line 127
    invoke-virtual {p1}, La/m0o0;->d()La/gmq;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v1, La/ysa0;

    .line 132
    .line 133
    invoke-direct {v1, v3, v4}, La/ysa0;-><init>(La/ata0;B)V

    .line 134
    .line 135
    .line 136
    iput-boolean v4, p0, La/wsa0;->j:Z

    .line 137
    .line 138
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_8

    .line 143
    .line 144
    move-object v1, v0

    .line 145
    goto :goto_5

    .line 146
    :cond_8
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_5
    return-object v1

    .line 149
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 150
    .line 151
    iget-boolean v5, p0, La/wsa0;->j:Z

    .line 152
    .line 153
    if-eqz v5, :cond_a

    .line 154
    .line 155
    if-ne v5, v4, :cond_9

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v3, La/ata0;->y:La/vpu;

    .line 169
    .line 170
    iput-boolean v4, p0, La/wsa0;->j:Z

    .line 171
    .line 172
    const/4 v1, 0x0

    .line 173
    invoke-virtual {p1, v1, p0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-ne p0, v0, :cond_b

    .line 178
    .line 179
    move-object v1, v0

    .line 180
    goto :goto_7

    .line 181
    :cond_b
    :goto_6
    sget p0, La/ata0;->S:I

    .line 182
    .line 183
    sget-object p0, La/lsa0;->a:La/lsa0;

    .line 184
    .line 185
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    :goto_7
    return-object v1

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
