.class public final La/qen0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ren0;


# direct methods
.method public synthetic constructor <init>(La/ren0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qen0;->i:B

    iput-object p1, p0, La/qen0;->k:La/ren0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qen0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qen0;->k:La/ren0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qen0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qen0;-><init>(La/ren0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/qen0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/qen0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/qen0;-><init>(La/ren0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/qen0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/qen0;-><init>(La/ren0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qen0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/qen0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/qen0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/qen0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/qen0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qen0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/qen0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/qen0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/qen0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/qen0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/qen0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/qen0;->k:La/ren0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean v6, p0, La/qen0;->j:Z

    .line 13
    .line 14
    sget-object p0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget p0, La/ren0;->D:I

    .line 20
    .line 21
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    iget-object v12, v0, La/ocj;->a:La/p7m0;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v5, p0

    .line 33
    check-cast v5, La/jen0;

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const/16 v11, 0x1e

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    invoke-static/range {v5 .. v11}, La/jen0;->a(La/jen0;ZZZLjava/util/List;La/een0;I)La/jen0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v12, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    iget-object p0, v0, La/ocj;->a:La/p7m0;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-object v5, p1

    .line 63
    check-cast v5, La/jen0;

    .line 64
    .line 65
    sget-object v10, La/een0;->a:La/een0;

    .line 66
    .line 67
    const/16 v11, 0xf

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v5 .. v11}, La/jen0;->a(La/jen0;ZZZLjava/util/List;La/een0;I)La/jen0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v4}, La/ren0;->N()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iget-object p0, v0, La/ocj;->a:La/p7m0;

    .line 88
    .line 89
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-object v0, p1

    .line 97
    check-cast v0, La/jen0;

    .line 98
    .line 99
    sget-object v5, La/een0;->b:La/een0;

    .line 100
    .line 101
    const/16 v6, 0xf

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-static/range {v0 .. v6}, La/jen0;->a(La/jen0;ZZZLjava/util/List;La/een0;I)La/jen0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-boolean v5, p0, La/qen0;->j:Z

    .line 123
    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    if-ne v5, v2, :cond_4

    .line 127
    .line 128
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    sget p1, La/ren0;->D:I

    .line 140
    .line 141
    iget-object p1, v4, La/i3t0;->i:La/ocj;

    .line 142
    .line 143
    iget-object v5, p1, La/ocj;->a:La/p7m0;

    .line 144
    .line 145
    :cond_6
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-object v6, p1

    .line 153
    check-cast v6, La/jen0;

    .line 154
    .line 155
    const/4 v11, 0x0

    .line 156
    const/16 v12, 0x1d

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x1

    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    invoke-static/range {v6 .. v12}, La/jen0;->a(La/jen0;ZZZLjava/util/List;La/een0;I)La/jen0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v5, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_6

    .line 171
    .line 172
    iget-object p1, v4, La/ren0;->s:La/ehf0;

    .line 173
    .line 174
    iput-boolean v2, p0, La/qen0;->j:Z

    .line 175
    .line 176
    invoke-virtual {p1, p0}, La/ehf0;->l(La/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, v0, :cond_7

    .line 181
    .line 182
    move-object v3, v0

    .line 183
    goto :goto_2

    .line 184
    :cond_7
    :goto_1
    sget p0, La/ren0;->D:I

    .line 185
    .line 186
    invoke-virtual {v4}, La/ren0;->N()V

    .line 187
    .line 188
    .line 189
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    :goto_2
    return-object v3

    .line 192
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 193
    .line 194
    iget-boolean v5, p0, La/qen0;->j:Z

    .line 195
    .line 196
    if-eqz v5, :cond_9

    .line 197
    .line 198
    if-ne v5, v2, :cond_8

    .line 199
    .line 200
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v4, La/ren0;->p:La/ouu;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance v1, La/atj;

    .line 217
    .line 218
    const/16 v5, 0x12

    .line 219
    .line 220
    invoke-direct {v1, p1, v3, v5}, La/atj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    new-instance v6, La/vsg0;

    .line 224
    .line 225
    invoke-direct {v6, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, p1, La/ouu;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, La/j9u;

    .line 231
    .line 232
    iget-object v1, v1, La/j9u;->a:La/m0o0;

    .line 233
    .line 234
    invoke-virtual {v1}, La/m0o0;->e()La/gmq;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget-object p1, p1, La/ouu;->d:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p1, La/yfu;

    .line 241
    .line 242
    invoke-virtual {p1}, La/yfu;->b()La/gmq;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    new-instance v7, La/oyu;

    .line 247
    .line 248
    const/4 v8, 0x4

    .line 249
    const/4 v9, 0x0

    .line 250
    invoke-direct {v7, v8, v3, v9}, La/oyu;-><init>(ILa/yje;B)V

    .line 251
    .line 252
    .line 253
    invoke-static {v6, v1, p1, v7}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    new-instance v1, La/r0m0;

    .line 258
    .line 259
    invoke-direct {v1, v4, v5}, La/r0m0;-><init>(Ljava/lang/Object;B)V

    .line 260
    .line 261
    .line 262
    iput-boolean v2, p0, La/qen0;->j:Z

    .line 263
    .line 264
    invoke-virtual {p1, v1, p0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    if-ne p0, v0, :cond_a

    .line 269
    .line 270
    move-object v3, v0

    .line 271
    goto :goto_4

    .line 272
    :cond_a
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    :goto_4
    return-object v3

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
