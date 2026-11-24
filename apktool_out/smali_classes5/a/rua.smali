.class public final La/rua;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:La/pz40;

.field public final synthetic m:La/l7m0;


# direct methods
.method public constructor <init>(La/pz40;La/l7m0;La/xcz;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/rua;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/rua;->l:La/pz40;

    .line 5
    .line 6
    iput-object p2, p0, La/rua;->m:La/l7m0;

    .line 7
    .line 8
    iput-object p3, p0, La/rua;->k:La/xcz;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(La/xcz;La/pz40;La/l7m0;La/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/rua;->i:B

    iput-object p1, p0, La/rua;->k:La/xcz;

    iput-object p2, p0, La/rua;->l:La/pz40;

    iput-object p3, p0, La/rua;->m:La/l7m0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/rua;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/rua;

    .line 7
    .line 8
    iget-object v3, p0, La/rua;->m:La/l7m0;

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    iget-object v1, p0, La/rua;->k:La/xcz;

    .line 12
    .line 13
    iget-object v2, p0, La/rua;->l:La/pz40;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/rua;-><init>(La/xcz;La/pz40;La/l7m0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v1, La/rua;

    .line 22
    .line 23
    iget-object v4, p0, La/rua;->m:La/l7m0;

    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    iget-object v2, p0, La/rua;->k:La/xcz;

    .line 27
    .line 28
    iget-object v3, p0, La/rua;->l:La/pz40;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, La/rua;-><init>(La/xcz;La/pz40;La/l7m0;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v5, p2

    .line 35
    new-instance v1, La/rua;

    .line 36
    .line 37
    iget-object v4, p0, La/rua;->m:La/l7m0;

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    iget-object v2, p0, La/rua;->k:La/xcz;

    .line 41
    .line 42
    iget-object v3, p0, La/rua;->l:La/pz40;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, La/rua;-><init>(La/xcz;La/pz40;La/l7m0;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_2
    move-object v5, p2

    .line 49
    new-instance v1, La/rua;

    .line 50
    .line 51
    iget-object v4, p0, La/rua;->m:La/l7m0;

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    iget-object v2, p0, La/rua;->k:La/xcz;

    .line 55
    .line 56
    iget-object v3, p0, La/rua;->l:La/pz40;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v6}, La/rua;-><init>(La/xcz;La/pz40;La/l7m0;La/yje;B)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_3
    move-object v5, p2

    .line 63
    new-instance p1, La/rua;

    .line 64
    .line 65
    iget-object p2, p0, La/rua;->m:La/l7m0;

    .line 66
    .line 67
    iget-object v0, p0, La/rua;->k:La/xcz;

    .line 68
    .line 69
    iget-object p0, p0, La/rua;->l:La/pz40;

    .line 70
    .line 71
    invoke-direct {p1, p0, p2, v0, v5}, La/rua;-><init>(La/pz40;La/l7m0;La/xcz;La/yje;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
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
    iget-byte v0, p0, La/rua;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rua;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rua;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/rua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/rua;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/rua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/rua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/rua;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/rua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/rua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/rua;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/rua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/rua;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/rua;->m:La/l7m0;

    .line 5
    .line 6
    iget-object v3, p0, La/rua;->l:La/pz40;

    .line 7
    .line 8
    iget-object v4, p0, La/rua;->k:La/xcz;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v1, p0, La/rua;->j:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    if-ne v1, v6, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/a7s;

    .line 37
    .line 38
    const/16 v1, 0xa

    .line 39
    .line 40
    invoke-direct {p1, v4, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, La/pf30;

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-direct {v1, v3, v2, v4}, La/pf30;-><init>(La/pz40;La/l7m0;B)V

    .line 55
    .line 56
    .line 57
    iput-boolean v6, p0, La/rua;->j:Z

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
    move-object v7, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    return-object v7

    .line 70
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v1, p0, La/rua;->j:Z

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    if-ne v1, v6, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p1, La/a7s;

    .line 90
    .line 91
    const/16 v1, 0x9

    .line 92
    .line 93
    invoke-direct {p1, v4, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v1, La/pf30;

    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    invoke-direct {v1, v3, v2, v4}, La/pf30;-><init>(La/pz40;La/l7m0;B)V

    .line 108
    .line 109
    .line 110
    iput-boolean v6, p0, La/rua;->j:Z

    .line 111
    .line 112
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v0, :cond_5

    .line 117
    .line 118
    move-object v7, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_3
    return-object v7

    .line 123
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 124
    .line 125
    iget-boolean v1, p0, La/rua;->j:Z

    .line 126
    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    if-ne v1, v6, :cond_6

    .line 130
    .line 131
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, La/a7s;

    .line 143
    .line 144
    const/16 v1, 0x8

    .line 145
    .line 146
    invoke-direct {p1, v4, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 147
    .line 148
    .line 149
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v1, La/pf30;

    .line 158
    .line 159
    invoke-direct {v1, v3, v2, v6}, La/pf30;-><init>(La/pz40;La/l7m0;B)V

    .line 160
    .line 161
    .line 162
    iput-boolean v6, p0, La/rua;->j:Z

    .line 163
    .line 164
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-ne p0, v0, :cond_8

    .line 169
    .line 170
    move-object v7, v0

    .line 171
    goto :goto_5

    .line 172
    :cond_8
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_5
    return-object v7

    .line 175
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 176
    .line 177
    iget-boolean v8, p0, La/rua;->j:Z

    .line 178
    .line 179
    if-eqz v8, :cond_a

    .line 180
    .line 181
    if-ne v8, v6, :cond_9

    .line 182
    .line 183
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance p1, La/a7s;

    .line 195
    .line 196
    const/4 v5, 0x6

    .line 197
    invoke-direct {p1, v4, v5}, La/a7s;-><init>(La/xcz;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    new-instance v4, La/pf30;

    .line 209
    .line 210
    invoke-direct {v4, v3, v2, v1}, La/pf30;-><init>(La/pz40;La/l7m0;B)V

    .line 211
    .line 212
    .line 213
    iput-boolean v6, p0, La/rua;->j:Z

    .line 214
    .line 215
    invoke-interface {p1, v4, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-ne p0, v0, :cond_b

    .line 220
    .line 221
    move-object v7, v0

    .line 222
    goto :goto_7

    .line 223
    :cond_b
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_7
    return-object v7

    .line 226
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v8, p0, La/rua;->j:Z

    .line 229
    .line 230
    if-eqz v8, :cond_d

    .line 231
    .line 232
    if-ne v8, v6, :cond_c

    .line 233
    .line 234
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_c
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_e

    .line 256
    .line 257
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_e
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    check-cast p1, La/unr;

    .line 265
    .line 266
    iget-object p1, p1, La/unr;->e:La/a4x;

    .line 267
    .line 268
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    move v2, v1

    .line 273
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    const/4 v7, -0x1

    .line 278
    if-eqz v5, :cond_10

    .line 279
    .line 280
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    check-cast v5, La/cja;

    .line 285
    .line 286
    invoke-interface {v5}, La/cja;->getType()La/dja;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    sget-object v8, La/dja;->b:La/dja;

    .line 291
    .line 292
    if-ne v5, v8, :cond_f

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_10
    move v2, v7

    .line 299
    :goto_9
    if-eq v2, v7, :cond_11

    .line 300
    .line 301
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-interface {v3, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iput-boolean v6, p0, La/rua;->j:Z

    .line 307
    .line 308
    sget-object p1, La/xcz;->y:La/v0h0;

    .line 309
    .line 310
    invoke-virtual {v4, v2, v1, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    if-ne p0, v0, :cond_11

    .line 315
    .line 316
    move-object v7, v0

    .line 317
    goto :goto_b

    .line 318
    :cond_11
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    :goto_b
    return-object v7

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
