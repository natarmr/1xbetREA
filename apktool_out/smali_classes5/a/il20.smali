.class public final La/il20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/mn20;


# direct methods
.method public synthetic constructor <init>(La/mn20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/il20;->i:B

    iput-object p1, p0, La/il20;->k:La/mn20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/il20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/il20;->k:La/mn20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/il20;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/il20;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/il20;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/il20;-><init>(La/mn20;La/yje;B)V

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
    iput-boolean p0, v0, La/il20;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/il20;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v0, La/il20;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_3
    new-instance p1, La/il20;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/il20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ql5;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/il20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/il20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/il20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/il20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/il20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/il20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/il20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/il20;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/il20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/il20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/il20;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/il20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, La/vne;

    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/il20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/il20;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/il20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/il20;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/il20;->k:La/mn20;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/il20;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v2, :cond_0

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
    iget-object p1, v4, La/mn20;->p:La/sd60;

    .line 32
    .line 33
    iput-boolean v2, p0, La/il20;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/sd60;->h(La/zje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v3

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v5, p0, La/il20;->j:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v2, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, v4, La/mn20;->u:La/esg0;

    .line 66
    .line 67
    iput-boolean v2, p0, La/il20;->j:Z

    .line 68
    .line 69
    invoke-virtual {p1, p0}, La/esg0;->Y(La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v0, :cond_5

    .line 74
    .line 75
    move-object v3, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_2
    iget-object p0, v4, La/mn20;->P:La/ol60;

    .line 78
    .line 79
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :goto_3
    return-object v3

    .line 85
    :pswitch_1
    iget-boolean p0, p0, La/il20;->j:Z

    .line 86
    .line 87
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    if-eqz p0, :cond_6

    .line 93
    .line 94
    iget-object p0, v4, La/mn20;->r:La/b8u;

    .line 95
    .line 96
    sget-object p1, La/bm5;->b:La/bm5;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, La/b8u;->a(La/bm5;)La/i89;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance p1, La/mt00;

    .line 103
    .line 104
    const/16 v0, 0x11

    .line 105
    .line 106
    invoke-direct {p1, v4, v3, v0}, La/mt00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 107
    .line 108
    .line 109
    new-instance v0, La/fnq;

    .line 110
    .line 111
    invoke-direct {v0, p0, p1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    new-instance p0, La/fd20;

    .line 115
    .line 116
    const/16 p1, 0x13

    .line 117
    .line 118
    invoke-direct {p0, p1}, La/fd20;-><init>(B)V

    .line 119
    .line 120
    .line 121
    sget-object p1, La/i120;->f:La/eoh0;

    .line 122
    .line 123
    const/4 v1, 0x2

    .line 124
    invoke-static {v1, p0}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-static {v0, p1, p0}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    new-instance p1, La/il20;

    .line 132
    .line 133
    const/4 v0, 0x4

    .line 134
    invoke-direct {p1, v4, v3, v0}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 135
    .line 136
    .line 137
    new-instance v2, La/fnq;

    .line 138
    .line 139
    invoke-direct {v2, p0, p1, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    iget-object p1, v4, La/mn20;->i:La/mne;

    .line 147
    .line 148
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 149
    .line 150
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    new-instance p1, La/sax;

    .line 155
    .line 156
    const/16 v0, 0x1b

    .line 157
    .line 158
    invoke-direct {p1, v1, v3, v0}, La/sax;-><init>(ILa/yje;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {v2, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 162
    .line 163
    .line 164
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_2
    iget-boolean p0, p0, La/il20;->j:Z

    .line 168
    .line 169
    sget-object v0, La/wne;->a:La/wne;

    .line 170
    .line 171
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    if-nez p0, :cond_7

    .line 175
    .line 176
    iget-object p0, v4, La/mn20;->X:La/ol60;

    .line 177
    .line 178
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-boolean v5, p0, La/il20;->j:Z

    .line 189
    .line 190
    if-eqz v5, :cond_9

    .line 191
    .line 192
    if-ne v5, v2, :cond_8

    .line 193
    .line 194
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, v4, La/mn20;->n:La/f3c;

    .line 206
    .line 207
    iput-boolean v2, p0, La/il20;->j:Z

    .line 208
    .line 209
    invoke-virtual {p1, p0}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-ne p1, v0, :cond_a

    .line 214
    .line 215
    move-object v3, v0

    .line 216
    goto :goto_5

    .line 217
    :cond_a
    :goto_4
    check-cast p1, La/m97;

    .line 218
    .line 219
    iget-wide p0, p1, La/m97;->h:J

    .line 220
    .line 221
    iget-object v0, v4, La/mn20;->F:La/mii0;

    .line 222
    .line 223
    sget-object v1, La/f680;->a:[La/f680;

    .line 224
    .line 225
    const-string v1, "placement_bet"

    .line 226
    .line 227
    invoke-virtual {v0, p0, p1, v1}, La/mii0;->T(JLjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v4, La/mn20;->G:La/x20;

    .line 231
    .line 232
    invoke-virtual {v0, p0, p1, v1}, La/x20;->u(JLjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_5
    return-object v3

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
