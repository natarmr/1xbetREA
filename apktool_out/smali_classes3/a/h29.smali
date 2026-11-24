.class public final La/h29;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/s29;


# direct methods
.method public synthetic constructor <init>(La/s29;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h29;->i:B

    iput-object p1, p0, La/h29;->k:La/s29;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h29;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h29;->k:La/s29;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/h29;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/h29;-><init>(La/s29;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/h29;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/h29;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/h29;-><init>(La/s29;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/h29;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/h29;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/h29;-><init>(La/s29;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/h29;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/h29;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/h29;-><init>(La/s29;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/h29;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/h29;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/h29;-><init>(La/s29;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/h29;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/h29;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h29;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/h29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/h29;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/h29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/h29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/h29;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/h29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/h29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/h29;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/h29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/h29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/h29;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/h29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/h29;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/h29;->k:La/s29;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v3, La/s29;->o:La/vzg0;

    .line 11
    .line 12
    iget-object p0, p0, La/h29;->j:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p0

    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    sget-object p0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v5, 0x3

    .line 35
    if-lt p0, v5, :cond_0

    .line 36
    .line 37
    move-object v6, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p0, ""

    .line 40
    .line 41
    move-object v6, p0

    .line 42
    :goto_0
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/x19;

    .line 47
    .line 48
    iget-object p0, p0, La/x19;->a:La/w19;

    .line 49
    .line 50
    iget-object p0, p0, La/w19;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v6, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object v8, p0, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object p1, p0

    .line 68
    check-cast p1, La/x19;

    .line 69
    .line 70
    invoke-static {p1, v2, v4, v6, v1}, La/ay3;->N(La/x19;ZLjava/lang/String;Ljava/lang/String;I)La/x19;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v8, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    if-nez v7, :cond_2

    .line 81
    .line 82
    iget-object p0, v3, La/s29;->t:La/s31;

    .line 83
    .line 84
    sget-object p1, La/wgh0;->j:La/wgh0;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-direct {v1, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, v4, v1}, La/s31;->h(La/wgh0;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, v3, La/s29;->u:La/cyu;

    .line 95
    .line 96
    new-instance p1, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 99
    .line 100
    .line 101
    const-string v1, "providers_page"

    .line 102
    .line 103
    invoke-virtual {p0, p1, v1, v4}, La/cyu;->D(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, La/s29;->O()V

    .line 107
    .line 108
    .line 109
    :cond_2
    const-string p0, "SEARCH_QUERY_KEY"

    .line 110
    .line 111
    invoke-virtual {v0, p0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const-string p0, "FILTER_QUERY_KEY"

    .line 115
    .line 116
    invoke-virtual {v0, p0, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    iget-object p0, p0, La/h29;->j:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v0, p0

    .line 125
    check-cast v0, La/sw00;

    .line 126
    .line 127
    sget-object p0, La/wne;->a:La/wne;

    .line 128
    .line 129
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 133
    .line 134
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 135
    .line 136
    iget-object v2, p0, La/ocj;->a:La/p7m0;

    .line 137
    .line 138
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object v4, p0

    .line 146
    check-cast v4, La/x19;

    .line 147
    .line 148
    iget-boolean v8, v0, La/sw00;->a:Z

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/16 v11, 0x1f7

    .line 152
    .line 153
    const/4 v5, 0x0

    .line 154
    const/4 v6, 0x0

    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    invoke-static/range {v4 .. v11}, La/x19;->a(La/x19;La/w19;La/u19;La/v19;ZLa/ql5;La/uzb0;I)La/x19;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v2, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_3

    .line 166
    .line 167
    iget-boolean p0, v0, La/sw00;->a:Z

    .line 168
    .line 169
    if-eqz p0, :cond_4

    .line 170
    .line 171
    iget-boolean p0, v0, La/sw00;->b:Z

    .line 172
    .line 173
    if-nez p0, :cond_4

    .line 174
    .line 175
    invoke-virtual {v3, v1, v1}, La/s29;->P(ZZ)V

    .line 176
    .line 177
    .line 178
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_1
    iget-object p0, p0, La/h29;->j:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v0, p0

    .line 184
    check-cast v0, Ljava/lang/Throwable;

    .line 185
    .line 186
    sget-object p0, La/wne;->a:La/wne;

    .line 187
    .line 188
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 192
    .line 193
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 194
    .line 195
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 196
    .line 197
    :cond_5
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-object v5, p0

    .line 205
    check-cast v5, La/x19;

    .line 206
    .line 207
    iget-object p1, v5, La/x19;->c:La/v19;

    .line 208
    .line 209
    iget-object v10, p1, La/v19;->d:Ljava/util/List;

    .line 210
    .line 211
    iget-object v11, p1, La/v19;->e:La/th1;

    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v6, La/v19;

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x1

    .line 223
    const/4 v9, 0x1

    .line 224
    invoke-direct/range {v6 .. v11}, La/v19;-><init>(ZZZLjava/util/List;La/th1;)V

    .line 225
    .line 226
    .line 227
    const/4 v11, 0x0

    .line 228
    const/16 v12, 0x1fb

    .line 229
    .line 230
    move-object v8, v6

    .line 231
    const/4 v6, 0x0

    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v9, 0x0

    .line 234
    const/4 v10, 0x0

    .line 235
    invoke-static/range {v5 .. v12}, La/x19;->a(La/x19;La/w19;La/u19;La/v19;ZLa/ql5;La/uzb0;I)La/x19;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-eqz p0, :cond_5

    .line 244
    .line 245
    iget-object p0, v3, La/s29;->r:La/duj;

    .line 246
    .line 247
    new-instance p1, La/im8;

    .line 248
    .line 249
    const/4 v1, 0x6

    .line 250
    invoke-direct {p1, v1}, La/im8;-><init>(B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0, p1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_2
    iget-object p0, p0, La/h29;->j:Ljava/lang/Object;

    .line 260
    .line 261
    move-object v0, p0

    .line 262
    check-cast v0, Ljava/lang/Throwable;

    .line 263
    .line 264
    sget-object p0, La/wne;->a:La/wne;

    .line 265
    .line 266
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 270
    .line 271
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 272
    .line 273
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 274
    .line 275
    :cond_6
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object p1, p0

    .line 283
    check-cast p1, La/x19;

    .line 284
    .line 285
    const/4 v5, 0x0

    .line 286
    const/16 v6, 0x18

    .line 287
    .line 288
    invoke-static {p1, v2, v1, v5, v6}, La/ay3;->M(La/x19;ZZLjava/util/List;I)La/x19;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    if-eqz p0, :cond_6

    .line 297
    .line 298
    iget-object p0, v3, La/s29;->r:La/duj;

    .line 299
    .line 300
    new-instance p1, La/im8;

    .line 301
    .line 302
    const/4 v1, 0x5

    .line 303
    invoke-direct {p1, v1}, La/im8;-><init>(B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v0, p1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_3
    iget-object p0, p0, La/h29;->j:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast p0, Ljava/util/List;

    .line 315
    .line 316
    sget-object v0, La/wne;->a:La/wne;

    .line 317
    .line 318
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    sget-object p1, La/s29;->Y:Ljava/lang/String;

    .line 322
    .line 323
    iget-object p1, v3, La/i3t0;->i:La/ocj;

    .line 324
    .line 325
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 326
    .line 327
    :cond_7
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    move-object v1, v0

    .line 335
    check-cast v1, La/x19;

    .line 336
    .line 337
    const/16 v3, 0x10

    .line 338
    .line 339
    invoke-static {v1, v2, v2, p0, v3}, La/ay3;->M(La/x19;ZZLjava/util/List;I)La/x19;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_7

    .line 348
    .line 349
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object p0

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
