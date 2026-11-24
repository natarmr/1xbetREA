.class public final La/q72;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/s72;


# direct methods
.method public synthetic constructor <init>(La/s72;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q72;->i:B

    iput-object p1, p0, La/q72;->k:La/s72;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q72;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q72;->k:La/s72;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q72;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/q72;-><init>(La/s72;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/q72;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/q72;-><init>(La/s72;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/q72;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/q72;-><init>(La/s72;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/q72;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/q72;-><init>(La/s72;La/yje;B)V

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
    iget-byte v0, p0, La/q72;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/q72;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/q72;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/q72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/q72;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/q72;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/q72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, La/wne;->a:La/wne;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1}, La/q72;->create(La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/q72;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/q72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_2
    invoke-virtual {p0, p1}, La/q72;->create(La/yje;)La/yje;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/q72;

    .line 53
    .line 54
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/q72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

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
    iget-byte v0, p0, La/q72;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/q72;->k:La/s72;

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
    iget-boolean v5, p0, La/q72;->j:Z

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
    iget-object p1, v2, La/s72;->t:La/m1e;

    .line 32
    .line 33
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, La/p72;

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-direct {v1, v2, v3}, La/p72;-><init>(La/s72;B)V

    .line 41
    .line 42
    .line 43
    iput-boolean v4, p0, La/q72;->j:Z

    .line 44
    .line 45
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    move-object v3, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v3

    .line 56
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v5, p0, La/q72;->j:Z

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    if-eq v5, v4, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v2, La/s72;->p:La/hru;

    .line 76
    .line 77
    iget-object v1, v2, La/s72;->o:Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 78
    .line 79
    iget-boolean v1, v1, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;->d:Z

    .line 80
    .line 81
    invoke-virtual {p1, v1}, La/hru;->b(Z)La/xae0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v1, La/p72;

    .line 86
    .line 87
    const/4 v5, 0x2

    .line 88
    invoke-direct {v1, v2, v5}, La/p72;-><init>(La/s72;B)V

    .line 89
    .line 90
    .line 91
    iput-boolean v4, p0, La/q72;->j:Z

    .line 92
    .line 93
    iget-object p1, p1, La/xae0;->a:La/n7m0;

    .line 94
    .line 95
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v0, :cond_5

    .line 100
    .line 101
    move-object v3, v0

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    :goto_2
    invoke-static {}, La/csj;->b()V

    .line 104
    .line 105
    .line 106
    :goto_3
    return-object v3

    .line 107
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 108
    .line 109
    iget-boolean v5, p0, La/q72;->j:Z

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    if-ne v5, v4, :cond_6

    .line 114
    .line 115
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v2, La/s72;->C:La/xfu;

    .line 127
    .line 128
    iget-object p1, p1, La/xfu;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, La/sx40;

    .line 131
    .line 132
    iget-object p1, p1, La/sx40;->a:La/rx40;

    .line 133
    .line 134
    iget-object p1, p1, La/rx40;->a:La/p7m0;

    .line 135
    .line 136
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance v1, La/p72;

    .line 141
    .line 142
    invoke-direct {v1, v2, v4}, La/p72;-><init>(La/s72;B)V

    .line 143
    .line 144
    .line 145
    iput-boolean v4, p0, La/q72;->j:Z

    .line 146
    .line 147
    iget-object p1, p1, La/xae0;->a:La/n7m0;

    .line 148
    .line 149
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v0, :cond_8

    .line 154
    .line 155
    move-object v3, v0

    .line 156
    goto :goto_5

    .line 157
    :cond_8
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_5
    return-object v3

    .line 160
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 161
    .line 162
    iget-boolean v5, p0, La/q72;->j:Z

    .line 163
    .line 164
    if-eqz v5, :cond_a

    .line 165
    .line 166
    if-ne v5, v4, :cond_9

    .line 167
    .line 168
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v2, La/s72;->A:La/z8u;

    .line 180
    .line 181
    invoke-virtual {p1}, La/z8u;->a()La/a1t;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance v1, La/p72;

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-direct {v1, v2, v3}, La/p72;-><init>(La/s72;B)V

    .line 189
    .line 190
    .line 191
    iput-boolean v4, p0, La/q72;->j:Z

    .line 192
    .line 193
    invoke-virtual {p1, v1, p0}, La/a1t;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, v0, :cond_b

    .line 198
    .line 199
    move-object v3, v0

    .line 200
    goto :goto_7

    .line 201
    :cond_b
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_7
    return-object v3

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
