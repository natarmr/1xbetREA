.class public final La/qj6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dk6;


# direct methods
.method public synthetic constructor <init>(La/dk6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qj6;->i:B

    iput-object p1, p0, La/qj6;->k:La/dk6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qj6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qj6;->k:La/dk6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qj6;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qj6;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qj6;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/qj6;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/qj6;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/qj6;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/qj6;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/qj6;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/qj6;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/qj6;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
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
    iget-byte v0, p0, La/qj6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qj6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/qj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qj6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/qj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/qj6;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/qj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/l9s;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/qj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/qj6;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/qj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/ji6;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/qj6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/qj6;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/qj6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/qj6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/qj6;->k:La/dk6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/qj6;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v10, p0

    .line 11
    check-cast v10, Ljava/util/List;

    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p0, La/dk6;->K:I

    .line 19
    .line 20
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object v2, p0

    .line 32
    check-cast v2, La/hj6;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/16 v11, 0x1dff

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-static/range {v2 .. v11}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    iget-object p0, p0, La/qj6;->j:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v8, p0

    .line 59
    check-cast v8, Ljava/lang/String;

    .line 60
    .line 61
    sget-object p0, La/wne;->a:La/wne;

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget p0, La/dk6;->K:I

    .line 67
    .line 68
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 69
    .line 70
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 71
    .line 72
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-object v2, p0

    .line 80
    check-cast v2, La/hj6;

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/16 v11, 0x1fdf

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    invoke-static/range {v2 .. v11}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    iget-object p0, p0, La/qj6;->j:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v6, p0

    .line 107
    check-cast v6, Ljava/util/List;

    .line 108
    .line 109
    sget-object p0, La/wne;->a:La/wne;

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget p0, La/dk6;->K:I

    .line 115
    .line 116
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 117
    .line 118
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 119
    .line 120
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-object v2, p0

    .line 128
    check-cast v2, La/hj6;

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    const/16 v11, 0x1ff7

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-static/range {v2 .. v11}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_2

    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_2
    iget-object p0, p0, La/qj6;->j:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v5, p0

    .line 155
    check-cast v5, La/l9s;

    .line 156
    .line 157
    sget-object p0, La/wne;->a:La/wne;

    .line 158
    .line 159
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget p0, La/dk6;->K:I

    .line 163
    .line 164
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 165
    .line 166
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 167
    .line 168
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-object v2, p0

    .line 176
    check-cast v2, La/hj6;

    .line 177
    .line 178
    const/4 v10, 0x0

    .line 179
    const/16 v11, 0x1ffb

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v6, 0x0

    .line 184
    const/4 v7, 0x0

    .line 185
    const/4 v8, 0x0

    .line 186
    const/4 v9, 0x0

    .line 187
    invoke-static/range {v2 .. v11}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_3

    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_3
    iget-object v0, v1, La/dk6;->x:La/ikt0;

    .line 201
    .line 202
    iget-object p0, p0, La/qj6;->j:Ljava/lang/Object;

    .line 203
    .line 204
    move-object v4, p0

    .line 205
    check-cast v4, La/ji6;

    .line 206
    .line 207
    sget-object p0, La/wne;->a:La/wne;

    .line 208
    .line 209
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    instance-of p0, v4, La/hi6;

    .line 213
    .line 214
    if-nez p0, :cond_5

    .line 215
    .line 216
    instance-of p0, v4, La/gi6;

    .line 217
    .line 218
    if-eqz p0, :cond_4

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_4
    iget-object p0, v1, La/dk6;->w:La/owp0;

    .line 222
    .line 223
    sget-object p1, La/idf0;->a:La/idf0;

    .line 224
    .line 225
    invoke-virtual {p0, p1}, La/owp0;->g(La/ldf0;)V

    .line 226
    .line 227
    .line 228
    sget-object p0, La/lx7;->a:La/lx7;

    .line 229
    .line 230
    invoke-virtual {v0, p0}, La/ikt0;->b(La/px7;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    :goto_0
    sget-object p0, La/ox7;->a:La/ox7;

    .line 235
    .line 236
    invoke-virtual {v0, p0}, La/ikt0;->b(La/px7;)V

    .line 237
    .line 238
    .line 239
    :goto_1
    sget p0, La/dk6;->K:I

    .line 240
    .line 241
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 242
    .line 243
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 244
    .line 245
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-object v2, p1

    .line 253
    check-cast v2, La/hj6;

    .line 254
    .line 255
    const/4 v10, 0x0

    .line 256
    const/16 v11, 0x1ffd

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    const/4 v5, 0x0

    .line 260
    const/4 v6, 0x0

    .line 261
    const/4 v7, 0x0

    .line 262
    const/4 v8, 0x0

    .line 263
    const/4 v9, 0x0

    .line 264
    invoke-static/range {v2 .. v11}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-eqz p1, :cond_6

    .line 273
    .line 274
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
