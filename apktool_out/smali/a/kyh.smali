.class public final La/kyh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/yje;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/kyh;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/kyh;->l:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    const/4 p2, 0x2

    .line 7
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;La/yje;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, La/kyh;->i:B

    iput-object p1, p0, La/kyh;->l:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kyh;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kyh;->l:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kyh;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/kyh;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/kyh;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/kyh;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/kyh;

    .line 45
    .line 46
    invoke-direct {v0, p2, p0}, La/kyh;-><init>(La/yje;Lkotlin/jvm/functions/Function2;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_4
    new-instance v0, La/kyh;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, p0, p2, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-object p1, v0, La/kyh;->k:Ljava/lang/Object;

    .line 59
    .line 60
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kyh;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kyh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kyh;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/az40;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/kyh;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/az40;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/kyh;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/jz80;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/kyh;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/qpg0;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/kyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/kyh;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/kyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kyh;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/kyh;->l:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/kyh;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, La/kmq;

    .line 35
    .line 36
    new-instance v1, La/pnd0;

    .line 37
    .line 38
    const/16 v3, 0xc

    .line 39
    .line 40
    invoke-direct {v1, p1, v2, v5, v3}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 44
    .line 45
    invoke-static {p0, v1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v5

    .line 56
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v1, p0, La/kyh;->j:Z

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    if-ne v1, v4, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, La/vne;

    .line 78
    .line 79
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 80
    .line 81
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_5

    .line 86
    .line 87
    move-object v5, v0

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_3
    return-object v5

    .line 92
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 93
    .line 94
    iget-boolean v6, p0, La/kyh;->j:Z

    .line 95
    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    if-ne v6, v4, :cond_6

    .line 99
    .line 100
    iget-object p0, p0, La/kyh;->k:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v5, p0

    .line 103
    check-cast v5, La/az40;

    .line 104
    .line 105
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, La/az40;

    .line 119
    .line 120
    new-instance v5, La/az40;

    .line 121
    .line 122
    invoke-virtual {p1}, La/az40;->a()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-direct {v3, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v5, v3, v1}, La/az40;-><init>(Ljava/util/LinkedHashMap;Z)V

    .line 132
    .line 133
    .line 134
    iput-object v5, p0, La/kyh;->k:Ljava/lang/Object;

    .line 135
    .line 136
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 137
    .line 138
    invoke-interface {v2, v5, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_8

    .line 143
    .line 144
    move-object v5, v0

    .line 145
    :cond_8
    :goto_4
    return-object v5

    .line 146
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 147
    .line 148
    iget-boolean v1, p0, La/kyh;->j:Z

    .line 149
    .line 150
    if-eqz v1, :cond_a

    .line 151
    .line 152
    if-ne v1, v4, :cond_9

    .line 153
    .line 154
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, La/az40;

    .line 168
    .line 169
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 170
    .line 171
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-ne p1, v0, :cond_b

    .line 176
    .line 177
    move-object v5, v0

    .line 178
    goto :goto_6

    .line 179
    :cond_b
    :goto_5
    move-object v5, p1

    .line 180
    check-cast v5, La/az40;

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object p0, v5, La/az40;->b:La/y04;

    .line 186
    .line 187
    iget-object p0, p0, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 188
    .line 189
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 190
    .line 191
    .line 192
    :goto_6
    return-object v5

    .line 193
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 194
    .line 195
    iget-boolean v6, p0, La/kyh;->j:Z

    .line 196
    .line 197
    if-eqz v6, :cond_d

    .line 198
    .line 199
    if-ne v6, v4, :cond_c

    .line 200
    .line 201
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    move-object p1, v5

    .line 209
    goto :goto_7

    .line 210
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p1, La/jz80;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    check-cast p1, La/v9e0;

    .line 221
    .line 222
    new-instance v3, La/kyh;

    .line 223
    .line 224
    invoke-direct {v3, v2, v5, v1}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 225
    .line 226
    .line 227
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 228
    .line 229
    invoke-interface {p1, v3, p0}, La/v9e0;->c(La/kyh;La/yje;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    if-ne p1, v0, :cond_e

    .line 234
    .line 235
    move-object p1, v0

    .line 236
    :cond_e
    :goto_7
    return-object p1

    .line 237
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 238
    .line 239
    iget-boolean v1, p0, La/kyh;->j:Z

    .line 240
    .line 241
    if-eqz v1, :cond_10

    .line 242
    .line 243
    if-ne v1, v4, :cond_f

    .line 244
    .line 245
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    move-object p1, v5

    .line 253
    goto :goto_8

    .line 254
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    iget-object p1, p0, La/kyh;->k:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p1, La/qpg0;

    .line 260
    .line 261
    iput-boolean v4, p0, La/kyh;->j:Z

    .line 262
    .line 263
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-ne p1, v0, :cond_11

    .line 268
    .line 269
    move-object p1, v0

    .line 270
    :cond_11
    :goto_8
    return-object p1

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
