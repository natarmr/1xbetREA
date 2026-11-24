.class public final La/gco0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zco0;


# direct methods
.method public synthetic constructor <init>(La/zco0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gco0;->i:B

    iput-object p1, p0, La/gco0;->k:La/zco0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gco0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gco0;->k:La/zco0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gco0;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, La/gco0;

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, La/gco0;

    .line 25
    .line 26
    const/4 v1, 0x7

    .line 27
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_2
    new-instance v0, La/gco0;

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    new-instance v0, La/gco0;

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_4
    new-instance v0, La/gco0;

    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_5
    new-instance v0, La/gco0;

    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_6
    new-instance v0, La/gco0;

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_7
    new-instance v0, La/gco0;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_8
    new-instance v0, La/gco0;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {v0, p0, p1, v1}, La/gco0;-><init>(La/zco0;La/yje;B)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gco0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/gco0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/gco0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/gco0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/gco0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/gco0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/gco0;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/gco0;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/gco0;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/gco0;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/gco0;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/gco0;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/gco0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/gco0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/gco0;->k:La/zco0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-boolean v5, p0, La/gco0;->j:Z

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
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v1, La/zco0;->R:La/spc;

    .line 32
    .line 33
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/spc;->a(La/bnn0;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v2, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v2

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v4, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object p1, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 67
    .line 68
    sget p1, La/zco0;->r0:I

    .line 69
    .line 70
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_5

    .line 75
    .line 76
    move-object p1, v0

    .line 77
    :cond_5
    :goto_2
    return-object p1

    .line 78
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 79
    .line 80
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 81
    .line 82
    if-eqz v5, :cond_7

    .line 83
    .line 84
    if-ne v5, v4, :cond_6

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v2

    .line 94
    goto :goto_3

    .line 95
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 99
    .line 100
    sget p1, La/zco0;->r0:I

    .line 101
    .line 102
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_8

    .line 107
    .line 108
    move-object p1, v0

    .line 109
    :cond_8
    :goto_3
    return-object p1

    .line 110
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 111
    .line 112
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 113
    .line 114
    if-eqz v5, :cond_a

    .line 115
    .line 116
    if-ne v5, v4, :cond_9

    .line 117
    .line 118
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object p1, v2

    .line 126
    goto :goto_4

    .line 127
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 131
    .line 132
    sget p1, La/zco0;->r0:I

    .line 133
    .line 134
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_b

    .line 139
    .line 140
    move-object p1, v0

    .line 141
    :cond_b
    :goto_4
    return-object p1

    .line 142
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 143
    .line 144
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 145
    .line 146
    if-eqz v5, :cond_d

    .line 147
    .line 148
    if-ne v5, v4, :cond_c

    .line 149
    .line 150
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object p1, v2

    .line 158
    goto :goto_5

    .line 159
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 163
    .line 164
    sget p1, La/zco0;->r0:I

    .line 165
    .line 166
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-ne p1, v0, :cond_e

    .line 171
    .line 172
    move-object p1, v0

    .line 173
    :cond_e
    :goto_5
    return-object p1

    .line 174
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 175
    .line 176
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 177
    .line 178
    if-eqz v5, :cond_10

    .line 179
    .line 180
    if-ne v5, v4, :cond_f

    .line 181
    .line 182
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    move-object p1, v2

    .line 190
    goto :goto_6

    .line 191
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 195
    .line 196
    sget p1, La/zco0;->r0:I

    .line 197
    .line 198
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-ne p1, v0, :cond_11

    .line 203
    .line 204
    move-object p1, v0

    .line 205
    :cond_11
    :goto_6
    return-object p1

    .line 206
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 207
    .line 208
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 209
    .line 210
    if-eqz v5, :cond_13

    .line 211
    .line 212
    if-ne v5, v4, :cond_12

    .line 213
    .line 214
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_12
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    move-object p1, v2

    .line 222
    goto :goto_7

    .line 223
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 227
    .line 228
    sget p1, La/zco0;->r0:I

    .line 229
    .line 230
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v0, :cond_14

    .line 235
    .line 236
    move-object p1, v0

    .line 237
    :cond_14
    :goto_7
    return-object p1

    .line 238
    :pswitch_6
    sget-object v0, La/wne;->a:La/wne;

    .line 239
    .line 240
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 241
    .line 242
    if-eqz v5, :cond_16

    .line 243
    .line 244
    if-ne v5, v4, :cond_15

    .line 245
    .line 246
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    move-object p1, v2

    .line 254
    goto :goto_8

    .line 255
    :cond_16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 259
    .line 260
    sget p1, La/zco0;->r0:I

    .line 261
    .line 262
    invoke-virtual {v1, p0}, La/zco0;->N(La/zje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, v0, :cond_17

    .line 267
    .line 268
    move-object p1, v0

    .line 269
    :cond_17
    :goto_8
    return-object p1

    .line 270
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 271
    .line 272
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 273
    .line 274
    if-eqz v5, :cond_19

    .line 275
    .line 276
    if-ne v5, v4, :cond_18

    .line 277
    .line 278
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_18
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object p1, v1, La/zco0;->I:La/z7z;

    .line 290
    .line 291
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, La/hjd;

    .line 296
    .line 297
    new-instance v1, La/cid;

    .line 298
    .line 299
    sget-object v2, La/y1p;->b:La/y1p;

    .line 300
    .line 301
    new-instance v2, La/kr2;

    .line 302
    .line 303
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    const-string v3, "popular_new_sport"

    .line 307
    .line 308
    invoke-direct {v1, v3, v2}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 309
    .line 310
    .line 311
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v1, p0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    if-ne p0, v0, :cond_1a

    .line 321
    .line 322
    move-object v2, v0

    .line 323
    goto :goto_a

    .line 324
    :cond_1a
    :goto_9
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    :goto_a
    return-object v2

    .line 327
    :pswitch_8
    sget-object v0, La/wne;->a:La/wne;

    .line 328
    .line 329
    iget-boolean v5, p0, La/gco0;->j:Z

    .line 330
    .line 331
    if-eqz v5, :cond_1c

    .line 332
    .line 333
    if-ne v5, v4, :cond_1b

    .line 334
    .line 335
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_1b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto :goto_c

    .line 343
    :cond_1c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    iget-object p1, v1, La/zco0;->R:La/spc;

    .line 347
    .line 348
    iput-boolean v4, p0, La/gco0;->j:Z

    .line 349
    .line 350
    invoke-virtual {p1, p0}, La/spc;->a(La/bnn0;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    if-ne p0, v0, :cond_1d

    .line 355
    .line 356
    move-object v2, v0

    .line 357
    goto :goto_c

    .line 358
    :cond_1d
    :goto_b
    sget p0, La/zco0;->r0:I

    .line 359
    .line 360
    invoke-virtual {v1}, La/i3t0;->E()V

    .line 361
    .line 362
    .line 363
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    :goto_c
    return-object v2

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
