.class public final La/oj5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dk5;


# direct methods
.method public synthetic constructor <init>(La/dk5;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oj5;->i:B

    iput-object p1, p0, La/oj5;->k:La/dk5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/oj5;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oj5;->k:La/dk5;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/oj5;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/oj5;-><init>(La/dk5;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/oj5;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/oj5;-><init>(La/dk5;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/oj5;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/oj5;-><init>(La/dk5;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/oj5;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/oj5;-><init>(La/dk5;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/oj5;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/oj5;-><init>(La/dk5;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
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
    iget-byte v0, p0, La/oj5;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oj5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oj5;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/oj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/oj5;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/oj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/oj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/oj5;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/oj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/oj5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/oj5;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/oj5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
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
    iget-byte v0, p0, La/oj5;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/oj5;->k:La/dk5;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/oj5;->j:Z

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
    iget-object p1, v3, La/dk5;->L:La/hse0;

    .line 32
    .line 33
    iget-object v1, v3, La/dk5;->M:La/btt0;

    .line 34
    .line 35
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-boolean v2, p0, La/oj5;->j:Z

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v4, 0x6

    .line 43
    invoke-static {p1, v1, v2, p0, v4}, La/hse0;->a(La/hse0;Ljava/lang/String;ZLa/yje;I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v0, :cond_2

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    iget-object p0, v3, La/dk5;->b0:La/ol60;

    .line 52
    .line 53
    new-instance p1, La/hj5;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_1
    return-object v4

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    iget-boolean v5, p0, La/oj5;->j:Z

    .line 67
    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    if-ne v5, v2, :cond_3

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v3, La/dk5;->D:La/ahu;

    .line 84
    .line 85
    iput-boolean v2, p0, La/oj5;->j:Z

    .line 86
    .line 87
    invoke-static {p1, p0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_5

    .line 92
    .line 93
    move-object v4, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    check-cast p1, La/ql5;

    .line 96
    .line 97
    iget-object p0, v3, La/dk5;->G:La/ot;

    .line 98
    .line 99
    sget-object v0, La/bm5;->g:La/bm5;

    .line 100
    .line 101
    invoke-virtual {p0, v0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, v3, La/dk5;->F:La/jyg0;

    .line 105
    .line 106
    iget-wide v1, p1, La/ql5;->a:J

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, La/jyg0;->a:La/rrd;

    .line 112
    .line 113
    invoke-virtual {p0, v0, v1, v2}, La/rrd;->z(La/bm5;J)V

    .line 114
    .line 115
    .line 116
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_3
    return-object v4

    .line 119
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 120
    .line 121
    iget-boolean v5, p0, La/oj5;->j:Z

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    if-ne v5, v2, :cond_6

    .line 126
    .line 127
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, v3, La/dk5;->C:La/phf0;

    .line 139
    .line 140
    invoke-virtual {p1}, La/phf0;->m()La/i89;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance v1, La/vj5;

    .line 145
    .line 146
    const/4 v5, 0x2

    .line 147
    invoke-direct {v1, v3, v4, v5}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 148
    .line 149
    .line 150
    iput-boolean v2, p0, La/oj5;->j:Z

    .line 151
    .line 152
    invoke-static {p1, v1, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, v0, :cond_8

    .line 157
    .line 158
    move-object v4, v0

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    :goto_5
    return-object v4

    .line 163
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 164
    .line 165
    iget-boolean v5, p0, La/oj5;->j:Z

    .line 166
    .line 167
    if-eqz v5, :cond_a

    .line 168
    .line 169
    if-ne v5, v2, :cond_9

    .line 170
    .line 171
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, v3, La/dk5;->v:La/m1e;

    .line 183
    .line 184
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    new-instance v1, La/nw4;

    .line 189
    .line 190
    const/16 v4, 0x17

    .line 191
    .line 192
    invoke-direct {v1, v3, v4}, La/nw4;-><init>(Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    iput-boolean v2, p0, La/oj5;->j:Z

    .line 196
    .line 197
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-ne p0, v0, :cond_b

    .line 202
    .line 203
    move-object v4, v0

    .line 204
    goto :goto_7

    .line 205
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_7
    return-object v4

    .line 208
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 209
    .line 210
    iget-boolean v5, p0, La/oj5;->j:Z

    .line 211
    .line 212
    if-eqz v5, :cond_d

    .line 213
    .line 214
    if-ne v5, v2, :cond_c

    .line 215
    .line 216
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_c
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, v3, La/dk5;->V:Ljava/lang/Boolean;

    .line 228
    .line 229
    if-eqz p1, :cond_f

    .line 230
    .line 231
    iget-object p1, v3, La/dk5;->x:La/bzu;

    .line 232
    .line 233
    iput-boolean v2, p0, La/oj5;->j:Z

    .line 234
    .line 235
    invoke-virtual {p1, p0}, La/bzu;->d(La/zje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-ne p1, v0, :cond_e

    .line 240
    .line 241
    move-object v4, v0

    .line 242
    goto :goto_9

    .line 243
    :cond_e
    :goto_8
    iget-object p0, v3, La/dk5;->V:Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-nez p0, :cond_f

    .line 250
    .line 251
    invoke-virtual {v3}, La/dk5;->z()V

    .line 252
    .line 253
    .line 254
    :cond_f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_9
    return-object v4

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
