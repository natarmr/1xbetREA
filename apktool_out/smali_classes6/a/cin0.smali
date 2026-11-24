.class public final La/cin0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/fin0;


# direct methods
.method public synthetic constructor <init>(La/fin0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cin0;->i:B

    iput-object p1, p0, La/cin0;->k:La/fin0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cin0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cin0;->k:La/fin0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/cin0;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/cin0;-><init>(La/fin0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/cin0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/cin0;-><init>(La/fin0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/cin0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/cin0;-><init>(La/fin0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/cin0;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/cin0;-><init>(La/fin0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, La/cin0;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p1, v1}, La/cin0;-><init>(La/fin0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cin0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/cin0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/cin0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/cin0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/cin0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/cin0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/cin0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/cin0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/cin0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/cin0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/cin0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/cin0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/cin0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/cin0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/cin0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/cin0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/cin0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/cin0;->k:La/fin0;

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
    iget-boolean v5, p0, La/cin0;->j:Z

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
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v3, La/fin0;->l:La/p7m0;

    .line 34
    .line 35
    new-instance v1, La/ain0;

    .line 36
    .line 37
    iget-object v5, v3, La/fin0;->d:La/ntu;

    .line 38
    .line 39
    invoke-virtual {v5}, La/ntu;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "/verification/sumsub?skip-lang-redirect=1&set-base-url=v3-api"

    .line 44
    .line 45
    invoke-static {v5, v6}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v6, v3, La/fin0;->g:La/wgu;

    .line 50
    .line 51
    invoke-virtual {v6}, La/wgu;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    new-instance v7, La/jo20;

    .line 56
    .line 57
    invoke-direct {v7}, La/jo20;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v8, v3, La/fin0;->h:La/n4u;

    .line 61
    .line 62
    invoke-virtual {v8}, La/n4u;->e()V

    .line 63
    .line 64
    .line 65
    const/16 v8, 0x54d

    .line 66
    .line 67
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    const-string v9, "X-Mobile-Project-Id"

    .line 72
    .line 73
    invoke-virtual {v7, v9, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    iget-object v8, v3, La/fin0;->i:La/iqt;

    .line 77
    .line 78
    iget-object v8, v8, La/iqt;->a:La/gst0;

    .line 79
    .line 80
    invoke-virtual {v8}, La/gst0;->a()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_2

    .line 85
    .line 86
    iget-object v3, v3, La/fin0;->j:La/hru;

    .line 87
    .line 88
    iget-object v3, v3, La/hru;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, La/okt0;

    .line 91
    .line 92
    iget-object v3, v3, La/okt0;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, La/btt0;

    .line 95
    .line 96
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-string v3, ""

    .line 102
    .line 103
    :goto_0
    const-string v8, "X-Auth"

    .line 104
    .line 105
    invoke-virtual {v7, v8, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    const-string v3, "mf-render-mode"

    .line 109
    .line 110
    const-string v8, "html"

    .line 111
    .line 112
    invoke-virtual {v7, v3, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-lez v3, :cond_3

    .line 120
    .line 121
    const-string v3, "X-Language"

    .line 122
    .line 123
    invoke-virtual {v7, v3, v6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_3
    invoke-virtual {v7}, La/jo20;->b()La/jo20;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-direct {v1, v5, v3}, La/ain0;-><init>(Ljava/lang/String;La/jo20;)V

    .line 131
    .line 132
    .line 133
    iput-boolean v2, p0, La/cin0;->j:Z

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    if-ne p0, v0, :cond_4

    .line 144
    .line 145
    move-object v4, v0

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_2
    return-object v4

    .line 150
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 151
    .line 152
    iget-boolean v5, p0, La/cin0;->j:Z

    .line 153
    .line 154
    if-eqz v5, :cond_6

    .line 155
    .line 156
    if-ne v5, v2, :cond_5

    .line 157
    .line 158
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, v3, La/fin0;->m:La/p7m0;

    .line 170
    .line 171
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 172
    .line 173
    iput-boolean v2, p0, La/cin0;->j:Z

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    if-ne p0, v0, :cond_7

    .line 184
    .line 185
    move-object v4, v0

    .line 186
    goto :goto_4

    .line 187
    :cond_7
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_4
    return-object v4

    .line 190
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 191
    .line 192
    iget-boolean v5, p0, La/cin0;->j:Z

    .line 193
    .line 194
    if-eqz v5, :cond_9

    .line 195
    .line 196
    if-ne v5, v2, :cond_8

    .line 197
    .line 198
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, v3, La/fin0;->l:La/p7m0;

    .line 210
    .line 211
    new-instance v1, La/zhn0;

    .line 212
    .line 213
    iget-object v3, v3, La/fin0;->n:La/ra10;

    .line 214
    .line 215
    invoke-direct {v1, v3}, La/zhn0;-><init>(La/ra10;)V

    .line 216
    .line 217
    .line 218
    iput-boolean v2, p0, La/cin0;->j:Z

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    if-ne p0, v0, :cond_a

    .line 229
    .line 230
    move-object v4, v0

    .line 231
    goto :goto_6

    .line 232
    :cond_a
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    :goto_6
    return-object v4

    .line 235
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 236
    .line 237
    iget-boolean v5, p0, La/cin0;->j:Z

    .line 238
    .line 239
    if-eqz v5, :cond_c

    .line 240
    .line 241
    if-ne v5, v2, :cond_b

    .line 242
    .line 243
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_b
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    iget-object p1, v3, La/fin0;->m:La/p7m0;

    .line 255
    .line 256
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 257
    .line 258
    iput-boolean v2, p0, La/cin0;->j:Z

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    if-ne p0, v0, :cond_d

    .line 269
    .line 270
    move-object v4, v0

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    :goto_8
    return-object v4

    .line 275
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 276
    .line 277
    iget-boolean v5, p0, La/cin0;->j:Z

    .line 278
    .line 279
    if-eqz v5, :cond_f

    .line 280
    .line 281
    if-ne v5, v2, :cond_e

    .line 282
    .line 283
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_e
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-object p1, v3, La/fin0;->l:La/p7m0;

    .line 295
    .line 296
    iput-boolean v2, p0, La/cin0;->j:Z

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    sget-object p0, La/yhn0;->a:La/yhn0;

    .line 302
    .line 303
    invoke-virtual {p1, v4, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    if-ne p0, v0, :cond_10

    .line 309
    .line 310
    move-object v4, v0

    .line 311
    goto :goto_a

    .line 312
    :cond_10
    :goto_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    :goto_a
    return-object v4

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
