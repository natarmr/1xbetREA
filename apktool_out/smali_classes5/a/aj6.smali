.class public final La/aj6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/aj6;->i:B

    iput-object p1, p0, La/aj6;->k:La/xcz;

    iput-object p2, p0, La/aj6;->l:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/aj6;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/aj6;->l:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/aj6;->k:La/xcz;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/aj6;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/aj6;-><init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/aj6;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/aj6;-><init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/aj6;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/aj6;-><init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/aj6;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/aj6;-><init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_3
    new-instance p1, La/aj6;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, p0, v0, p2, v1}, La/aj6;-><init>(La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
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
    iget-byte v0, p0, La/aj6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/aj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/aj6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/aj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/aj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/aj6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/aj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/aj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/aj6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/aj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/aj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/aj6;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/aj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/aj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/aj6;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/aj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/aj6;->i:B

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    iget-object v2, p0, La/aj6;->l:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, p0, La/aj6;->k:La/xcz;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v1, p0, La/aj6;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-ne v1, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p1, La/gg90;

    .line 36
    .line 37
    const/16 v1, 0xc

    .line 38
    .line 39
    invoke-direct {p1, v3, v1}, La/gg90;-><init>(La/xcz;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v1, La/x6h;

    .line 51
    .line 52
    const/16 v3, 0x12

    .line 53
    .line 54
    invoke-direct {v1, v2, v3}, La/x6h;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 55
    .line 56
    .line 57
    iput-boolean v5, p0, La/aj6;->j:Z

    .line 58
    .line 59
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v0, :cond_2

    .line 64
    .line 65
    move-object v6, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    return-object v6

    .line 70
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v7, p0, La/aj6;->j:Z

    .line 73
    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    if-ne v7, v5, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, La/eb;

    .line 90
    .line 91
    const/16 v4, 0x1d

    .line 92
    .line 93
    invoke-direct {p1, v3, v4}, La/eb;-><init>(La/xcz;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v3, La/i89;

    .line 101
    .line 102
    invoke-direct {v3, p1, v1}, La/i89;-><init>(La/gmq;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, La/i120;->W(La/gmq;)La/gmq;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v1, La/x6h;

    .line 110
    .line 111
    const/4 v3, 0x7

    .line 112
    invoke-direct {v1, v2, v3}, La/x6h;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 113
    .line 114
    .line 115
    iput-boolean v5, p0, La/aj6;->j:Z

    .line 116
    .line 117
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_5

    .line 122
    .line 123
    move-object v6, v0

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_3
    return-object v6

    .line 128
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v1, p0, La/aj6;->j:Z

    .line 131
    .line 132
    if-eqz v1, :cond_7

    .line 133
    .line 134
    if-ne v1, v5, :cond_6

    .line 135
    .line 136
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, La/eb;

    .line 148
    .line 149
    const/16 v1, 0x10

    .line 150
    .line 151
    invoke-direct {p1, v3, v1}, La/eb;-><init>(La/xcz;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance v1, La/bt;

    .line 159
    .line 160
    const/16 v3, 0x18

    .line 161
    .line 162
    invoke-direct {v1, v2, v3}, La/bt;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 163
    .line 164
    .line 165
    iput-boolean v5, p0, La/aj6;->j:Z

    .line 166
    .line 167
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-ne p0, v0, :cond_8

    .line 172
    .line 173
    move-object v6, v0

    .line 174
    goto :goto_5

    .line 175
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    :goto_5
    return-object v6

    .line 178
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 179
    .line 180
    iget-boolean v7, p0, La/aj6;->j:Z

    .line 181
    .line 182
    if-eqz v7, :cond_a

    .line 183
    .line 184
    if-ne v7, v5, :cond_9

    .line 185
    .line 186
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    new-instance p1, La/eb;

    .line 198
    .line 199
    const/16 v4, 0xf

    .line 200
    .line 201
    invoke-direct {p1, v3, v4}, La/eb;-><init>(La/xcz;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    new-instance v3, La/i89;

    .line 209
    .line 210
    invoke-direct {v3, p1, v1}, La/i89;-><init>(La/gmq;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v3}, La/i120;->W(La/gmq;)La/gmq;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    new-instance v1, La/bt;

    .line 218
    .line 219
    invoke-direct {v1, v2, v4}, La/bt;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 220
    .line 221
    .line 222
    iput-boolean v5, p0, La/aj6;->j:Z

    .line 223
    .line 224
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

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
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 236
    .line 237
    iget-boolean v1, p0, La/aj6;->j:Z

    .line 238
    .line 239
    if-eqz v1, :cond_d

    .line 240
    .line 241
    if-ne v1, v5, :cond_c

    .line 242
    .line 243
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance p1, La/eb;

    .line 255
    .line 256
    const/4 v1, 0x3

    .line 257
    invoke-direct {p1, v3, v1}, La/eb;-><init>(La/xcz;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    new-instance v1, La/bt;

    .line 265
    .line 266
    const/4 v3, 0x5

    .line 267
    invoke-direct {v1, v2, v3}, La/bt;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 268
    .line 269
    .line 270
    iput-boolean v5, p0, La/aj6;->j:Z

    .line 271
    .line 272
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    if-ne p0, v0, :cond_e

    .line 277
    .line 278
    move-object v6, v0

    .line 279
    goto :goto_9

    .line 280
    :cond_e
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    :goto_9
    return-object v6

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
