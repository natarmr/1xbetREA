.class public final La/pd0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d9z;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/d9z;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pd0;->i:B

    iput-object p1, p0, La/pd0;->k:La/d9z;

    iput-object p2, p0, La/pd0;->l:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/pd0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/pd0;->l:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/pd0;->k:La/d9z;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/pd0;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/pd0;-><init>(La/d9z;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/pd0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/pd0;-><init>(La/d9z;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/pd0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/pd0;-><init>(La/d9z;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/pd0;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/pd0;-><init>(La/d9z;Lkotlin/jvm/functions/Function1;La/yje;B)V

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
    iget-byte v0, p0, La/pd0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pd0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pd0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pd0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/pd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/pd0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/pd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

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
    iget-byte v0, p0, La/pd0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/pd0;->l:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/pd0;->k:La/d9z;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

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
    iget-boolean v1, p0, La/pd0;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p1, La/md0;

    .line 35
    .line 36
    const/16 v1, 0x18

    .line 37
    .line 38
    invoke-direct {p1, v3, v1}, La/md0;-><init>(La/d9z;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v1, La/qaf0;

    .line 50
    .line 51
    const/16 v3, 0x13

    .line 52
    .line 53
    invoke-direct {v1, p1, v3}, La/qaf0;-><init>(La/gmq;B)V

    .line 54
    .line 55
    .line 56
    new-instance p1, La/f0p0;

    .line 57
    .line 58
    const/4 v3, 0x6

    .line 59
    invoke-direct {p1, v2, v3}, La/f0p0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 60
    .line 61
    .line 62
    iput-boolean v5, p0, La/pd0;->j:Z

    .line 63
    .line 64
    invoke-virtual {v1, p1, p0}, La/qaf0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v0, :cond_2

    .line 69
    .line 70
    move-object v6, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    :goto_1
    return-object v6

    .line 75
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 76
    .line 77
    iget-boolean v1, p0, La/pd0;->j:Z

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    if-ne v1, v5, :cond_3

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, La/md0;

    .line 95
    .line 96
    const/16 v1, 0xe

    .line 97
    .line 98
    invoke-direct {p1, v3, v1}, La/md0;-><init>(La/d9z;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v1, La/x6h;

    .line 110
    .line 111
    const/16 v3, 0x19

    .line 112
    .line 113
    invoke-direct {v1, v2, v3}, La/x6h;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 114
    .line 115
    .line 116
    iput-boolean v5, p0, La/pd0;->j:Z

    .line 117
    .line 118
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-ne p0, v0, :cond_5

    .line 123
    .line 124
    move-object v6, v0

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    :goto_3
    return-object v6

    .line 129
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 130
    .line 131
    iget-boolean v7, p0, La/pd0;->j:Z

    .line 132
    .line 133
    if-eqz v7, :cond_7

    .line 134
    .line 135
    if-ne v7, v5, :cond_6

    .line 136
    .line 137
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-instance p1, La/md0;

    .line 149
    .line 150
    invoke-direct {p1, v3, v5}, La/md0;-><init>(La/d9z;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance v3, La/bt;

    .line 162
    .line 163
    invoke-direct {v3, v2, v1}, La/bt;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 164
    .line 165
    .line 166
    iput-boolean v5, p0, La/pd0;->j:Z

    .line 167
    .line 168
    invoke-interface {p1, v3, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-ne p0, v0, :cond_8

    .line 173
    .line 174
    move-object v6, v0

    .line 175
    goto :goto_5

    .line 176
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_5
    return-object v6

    .line 179
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget-boolean v7, p0, La/pd0;->j:Z

    .line 182
    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    if-ne v7, v5, :cond_9

    .line 186
    .line 187
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    new-instance p1, La/md0;

    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    invoke-direct {p1, v3, v4}, La/md0;-><init>(La/d9z;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    new-instance v3, La/lr;

    .line 213
    .line 214
    invoke-direct {v3, p1, v1}, La/lr;-><init>(La/gmq;B)V

    .line 215
    .line 216
    .line 217
    new-instance p1, La/bt;

    .line 218
    .line 219
    invoke-direct {p1, v2, v5}, La/bt;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 220
    .line 221
    .line 222
    iput-boolean v5, p0, La/pd0;->j:Z

    .line 223
    .line 224
    invoke-virtual {v3, p1, p0}, La/lr;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-ne p0, v0, :cond_b

    .line 229
    .line 230
    move-object v6, v0

    .line 231
    goto :goto_7

    .line 232
    :cond_b
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    :goto_7
    return-object v6

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
