.class public final La/qzn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d9z;

.field public final synthetic l:La/d9z;

.field public final synthetic m:La/vne;

.field public final synthetic n:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/d9z;La/d9z;La/vne;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/qzn0;->i:B

    iput-object p1, p0, La/qzn0;->k:La/d9z;

    iput-object p2, p0, La/qzn0;->l:La/d9z;

    iput-object p3, p0, La/qzn0;->m:La/vne;

    iput-object p4, p0, La/qzn0;->n:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/qzn0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/qzn0;

    .line 7
    .line 8
    iget-object v4, p0, La/qzn0;->n:La/pz40;

    .line 9
    .line 10
    const/4 v6, 0x3

    .line 11
    iget-object v1, p0, La/qzn0;->k:La/d9z;

    .line 12
    .line 13
    iget-object v2, p0, La/qzn0;->l:La/d9z;

    .line 14
    .line 15
    iget-object v3, p0, La/qzn0;->m:La/vne;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/qzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v1, La/qzn0;

    .line 24
    .line 25
    iget-object v5, p0, La/qzn0;->n:La/pz40;

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    iget-object v2, p0, La/qzn0;->k:La/d9z;

    .line 29
    .line 30
    iget-object v3, p0, La/qzn0;->l:La/d9z;

    .line 31
    .line 32
    iget-object v4, p0, La/qzn0;->m:La/vne;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v7}, La/qzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    move-object v6, p2

    .line 39
    new-instance v1, La/qzn0;

    .line 40
    .line 41
    iget-object v5, p0, La/qzn0;->n:La/pz40;

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    iget-object v2, p0, La/qzn0;->k:La/d9z;

    .line 45
    .line 46
    iget-object v3, p0, La/qzn0;->l:La/d9z;

    .line 47
    .line 48
    iget-object v4, p0, La/qzn0;->m:La/vne;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v7}, La/qzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_2
    move-object v6, p2

    .line 55
    new-instance v1, La/qzn0;

    .line 56
    .line 57
    iget-object v5, p0, La/qzn0;->n:La/pz40;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    iget-object v2, p0, La/qzn0;->k:La/d9z;

    .line 61
    .line 62
    iget-object v3, p0, La/qzn0;->l:La/d9z;

    .line 63
    .line 64
    iget-object v4, p0, La/qzn0;->m:La/vne;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v7}, La/qzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;La/yje;B)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    nop

    .line 71
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
    iget-byte v0, p0, La/qzn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qzn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qzn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qzn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qzn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qzn0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qzn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qzn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qzn0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qzn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/qzn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/qzn0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/qzn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/qzn0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/qzn0;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, La/md0;

    .line 30
    .line 31
    const/16 v1, 0x14

    .line 32
    .line 33
    iget-object v5, p0, La/qzn0;->k:La/d9z;

    .line 34
    .line 35
    invoke-direct {p1, v5, v1}, La/md0;-><init>(La/d9z;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v4, La/pzn0;

    .line 43
    .line 44
    iget-object v8, p0, La/qzn0;->n:La/pz40;

    .line 45
    .line 46
    const/4 v9, 0x3

    .line 47
    iget-object v6, p0, La/qzn0;->l:La/d9z;

    .line 48
    .line 49
    iget-object v7, p0, La/qzn0;->m:La/vne;

    .line 50
    .line 51
    invoke-direct/range {v4 .. v9}, La/pzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;B)V

    .line 52
    .line 53
    .line 54
    iput-boolean v2, p0, La/qzn0;->j:Z

    .line 55
    .line 56
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v0, :cond_2

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v3

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v4, p0, La/qzn0;->j:Z

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    if-ne v4, v2, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, La/md0;

    .line 87
    .line 88
    const/16 v1, 0x13

    .line 89
    .line 90
    iget-object v5, p0, La/qzn0;->k:La/d9z;

    .line 91
    .line 92
    invoke-direct {p1, v5, v1}, La/md0;-><init>(La/d9z;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v3, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance v4, La/pzn0;

    .line 100
    .line 101
    iget-object v8, p0, La/qzn0;->n:La/pz40;

    .line 102
    .line 103
    const/4 v9, 0x2

    .line 104
    iget-object v6, p0, La/qzn0;->l:La/d9z;

    .line 105
    .line 106
    iget-object v7, p0, La/qzn0;->m:La/vne;

    .line 107
    .line 108
    invoke-direct/range {v4 .. v9}, La/pzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;B)V

    .line 109
    .line 110
    .line 111
    iput-boolean v2, p0, La/qzn0;->j:Z

    .line 112
    .line 113
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v0, :cond_5

    .line 118
    .line 119
    move-object v3, v0

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_3
    return-object v3

    .line 124
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 125
    .line 126
    iget-boolean v4, p0, La/qzn0;->j:Z

    .line 127
    .line 128
    if-eqz v4, :cond_7

    .line 129
    .line 130
    if-ne v4, v2, :cond_6

    .line 131
    .line 132
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance p1, La/md0;

    .line 144
    .line 145
    const/16 v1, 0x12

    .line 146
    .line 147
    iget-object v5, p0, La/qzn0;->k:La/d9z;

    .line 148
    .line 149
    invoke-direct {p1, v5, v1}, La/md0;-><init>(La/d9z;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    new-instance v4, La/pzn0;

    .line 157
    .line 158
    iget-object v8, p0, La/qzn0;->n:La/pz40;

    .line 159
    .line 160
    const/4 v9, 0x1

    .line 161
    iget-object v6, p0, La/qzn0;->l:La/d9z;

    .line 162
    .line 163
    iget-object v7, p0, La/qzn0;->m:La/vne;

    .line 164
    .line 165
    invoke-direct/range {v4 .. v9}, La/pzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;B)V

    .line 166
    .line 167
    .line 168
    iput-boolean v2, p0, La/qzn0;->j:Z

    .line 169
    .line 170
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    if-ne p0, v0, :cond_8

    .line 175
    .line 176
    move-object v3, v0

    .line 177
    goto :goto_5

    .line 178
    :cond_8
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    :goto_5
    return-object v3

    .line 181
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 182
    .line 183
    iget-boolean v4, p0, La/qzn0;->j:Z

    .line 184
    .line 185
    if-eqz v4, :cond_a

    .line 186
    .line 187
    if-ne v4, v2, :cond_9

    .line 188
    .line 189
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    new-instance p1, La/md0;

    .line 201
    .line 202
    const/16 v1, 0x11

    .line 203
    .line 204
    iget-object v5, p0, La/qzn0;->k:La/d9z;

    .line 205
    .line 206
    invoke-direct {p1, v5, v1}, La/md0;-><init>(La/d9z;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {v3, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    new-instance v4, La/pzn0;

    .line 214
    .line 215
    iget-object v8, p0, La/qzn0;->n:La/pz40;

    .line 216
    .line 217
    const/4 v9, 0x0

    .line 218
    iget-object v6, p0, La/qzn0;->l:La/d9z;

    .line 219
    .line 220
    iget-object v7, p0, La/qzn0;->m:La/vne;

    .line 221
    .line 222
    invoke-direct/range {v4 .. v9}, La/pzn0;-><init>(La/d9z;La/d9z;La/vne;La/pz40;B)V

    .line 223
    .line 224
    .line 225
    iput-boolean v2, p0, La/qzn0;->j:Z

    .line 226
    .line 227
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    if-ne p0, v0, :cond_b

    .line 232
    .line 233
    move-object v3, v0

    .line 234
    goto :goto_7

    .line 235
    :cond_b
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_7
    return-object v3

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
