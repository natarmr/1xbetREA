.class public final La/hy8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ty8;


# direct methods
.method public synthetic constructor <init>(La/ty8;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hy8;->i:B

    iput-object p1, p0, La/hy8;->k:La/ty8;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hy8;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/hy8;->k:La/ty8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/hy8;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/hy8;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/hy8;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/hy8;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/hy8;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/hy8;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/hy8;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/hy8;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/hy8;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/hy8;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/hy8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hy8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hy8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hy8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/hy8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/hy8;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/hy8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/sw00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/hy8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/hy8;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/hy8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/hy8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/hy8;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/hy8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/hy8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/hy8;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/hy8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hy8;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/hy8;->k:La/ty8;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v5, La/ty8;->o:La/vzg0;

    .line 14
    .line 15
    iget-object v0, v0, La/hy8;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    sget-object v2, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v6, 0x3

    .line 37
    if-lt v2, v6, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v3, v4

    .line 41
    :goto_0
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v2, v5, La/ty8;->w:La/u58;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v2, v2, La/u58;->a:La/kt2;

    .line 49
    .line 50
    const-string v4, "provbrand_prov_search"

    .line 51
    .line 52
    const-string v6, "search"

    .line 53
    .line 54
    invoke-static {v6, v0, v2, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v5, La/ty8;->z:La/au0;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 63
    .line 64
    const-wide/16 v6, 0x2ad0

    .line 65
    .line 66
    invoke-static {v0, v2, v6, v7}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 67
    .line 68
    .line 69
    :cond_1
    if-eqz v3, :cond_2

    .line 70
    .line 71
    move-object v2, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const-string v2, ""

    .line 74
    .line 75
    :goto_1
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, La/yx8;

    .line 80
    .line 81
    iget-object v3, v3, La/yx8;->c:La/xx8;

    .line 82
    .line 83
    iget-object v3, v3, La/xx8;->d:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    xor-int/lit8 v4, v3, 0x1

    .line 90
    .line 91
    new-instance v6, La/sw;

    .line 92
    .line 93
    invoke-direct {v6, v0, v2, v4}, La/sw;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v6}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/yx8;

    .line 104
    .line 105
    iget-object v0, v0, La/yx8;->c:La/xx8;

    .line 106
    .line 107
    iget-object v0, v0, La/xx8;->c:Ljava/lang/String;

    .line 108
    .line 109
    const-string v2, "SEARCH_QUERY_KEY"

    .line 110
    .line 111
    invoke-virtual {v1, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/yx8;

    .line 119
    .line 120
    iget-object v0, v0, La/yx8;->c:La/xx8;

    .line 121
    .line 122
    iget-object v0, v0, La/xx8;->d:Ljava/lang/String;

    .line 123
    .line 124
    const-string v2, "FILTER_QUERY_KEY"

    .line 125
    .line 126
    invoke-virtual {v1, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, La/yx8;

    .line 134
    .line 135
    iget-object v0, v0, La/yx8;->b:La/vx8;

    .line 136
    .line 137
    iget-wide v6, v0, La/vx8;->c:J

    .line 138
    .line 139
    new-instance v0, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-direct {v0, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 142
    .line 143
    .line 144
    const-string v2, "SELECTED_PARTITION_KEY"

    .line 145
    .line 146
    invoke-virtual {v1, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    if-nez v3, :cond_3

    .line 150
    .line 151
    invoke-virtual {v5}, La/ty8;->O()V

    .line 152
    .line 153
    .line 154
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_0
    iget-object v1, v0, La/hy8;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, La/sw00;

    .line 160
    .line 161
    sget-object v2, La/wne;->a:La/wne;

    .line 162
    .line 163
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-boolean v2, v1, La/sw00;->a:Z

    .line 167
    .line 168
    if-eqz v2, :cond_4

    .line 169
    .line 170
    iget-boolean v1, v1, La/sw00;->b:Z

    .line 171
    .line 172
    if-nez v1, :cond_4

    .line 173
    .line 174
    iget-object v2, v0, La/hy8;->k:La/ty8;

    .line 175
    .line 176
    iget-object v3, v2, La/ty8;->y:La/kb0;

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v7, 0x6

    .line 180
    sget-object v4, La/eb0;->a:La/eb0;

    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    invoke-static/range {v2 .. v7}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, La/ty8;->O()V

    .line 187
    .line 188
    .line 189
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_1
    iget-object v0, v0, La/hy8;->j:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v1, v0

    .line 195
    check-cast v1, La/sw00;

    .line 196
    .line 197
    sget-object v0, La/wne;->a:La/wne;

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-boolean v0, v1, La/sw00;->a:Z

    .line 203
    .line 204
    if-eqz v0, :cond_5

    .line 205
    .line 206
    iget-object v0, v5, La/ty8;->F:La/soc;

    .line 207
    .line 208
    invoke-virtual {v0}, La/soc;->b()V

    .line 209
    .line 210
    .line 211
    iget-object v0, v5, La/ty8;->E:La/ali;

    .line 212
    .line 213
    invoke-virtual {v0}, La/ali;->o()La/gmq;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    new-instance v3, La/hy8;

    .line 218
    .line 219
    invoke-direct {v3, v5, v2, v4}, La/hy8;-><init>(La/ty8;La/yje;B)V

    .line 220
    .line 221
    .line 222
    new-instance v2, La/fnq;

    .line 223
    .line 224
    const/4 v4, 0x4

    .line 225
    invoke-direct {v2, v0, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v3, v5, La/ty8;->v:La/mne;

    .line 233
    .line 234
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 235
    .line 236
    invoke-static {v0, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v3, La/iy8;->h:La/iy8;

    .line 241
    .line 242
    invoke-static {v2, v0, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 243
    .line 244
    .line 245
    :cond_5
    sget-object v0, La/ty8;->X:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 248
    .line 249
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 250
    .line 251
    :cond_6
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-object v7, v0

    .line 259
    check-cast v7, La/yx8;

    .line 260
    .line 261
    iget-boolean v11, v1, La/sw00;->a:Z

    .line 262
    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    const v17, 0xffff7

    .line 266
    .line 267
    .line 268
    const/4 v8, 0x0

    .line 269
    const/4 v9, 0x0

    .line 270
    const/4 v10, 0x0

    .line 271
    const/4 v12, 0x0

    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    invoke-static/range {v7 .. v17}, La/yx8;->a(La/yx8;La/wx8;La/vx8;La/xx8;ZLa/ql5;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)La/yx8;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v6, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_6

    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_2
    iget-object v0, v0, La/hy8;->j:Ljava/lang/Object;

    .line 289
    .line 290
    move-object v1, v0

    .line 291
    check-cast v1, Ljava/lang/Throwable;

    .line 292
    .line 293
    sget-object v0, La/wne;->a:La/wne;

    .line 294
    .line 295
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    sget-object v0, La/ty8;->X:Ljava/lang/String;

    .line 299
    .line 300
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 301
    .line 302
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 303
    .line 304
    :cond_7
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-object v7, v0

    .line 312
    check-cast v7, La/yx8;

    .line 313
    .line 314
    iget-object v8, v7, La/yx8;->a:La/wx8;

    .line 315
    .line 316
    const/16 v9, 0xc

    .line 317
    .line 318
    invoke-static {v8, v3, v4, v2, v9}, La/wx8;->a(La/wx8;ZZLjava/util/List;I)La/wx8;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    iget-object v9, v7, La/yx8;->b:La/vx8;

    .line 323
    .line 324
    const/4 v10, 0x6

    .line 325
    invoke-static {v9, v4, v10}, La/vx8;->a(La/vx8;ZI)La/vx8;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    const/16 v16, 0x0

    .line 330
    .line 331
    const v17, 0xffffc

    .line 332
    .line 333
    .line 334
    const/4 v10, 0x0

    .line 335
    const/4 v11, 0x0

    .line 336
    const/4 v12, 0x0

    .line 337
    const/4 v13, 0x0

    .line 338
    const/4 v14, 0x0

    .line 339
    const/4 v15, 0x0

    .line 340
    invoke-static/range {v7 .. v17}, La/yx8;->a(La/yx8;La/wx8;La/vx8;La/xx8;ZLa/ql5;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)La/yx8;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-virtual {v6, v0, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_7

    .line 349
    .line 350
    iget-object v0, v5, La/ty8;->q:La/duj;

    .line 351
    .line 352
    new-instance v2, La/im8;

    .line 353
    .line 354
    const/4 v3, 0x2

    .line 355
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_3
    iget-object v0, v0, La/hy8;->j:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, Ljava/util/List;

    .line 367
    .line 368
    sget-object v1, La/wne;->a:La/wne;

    .line 369
    .line 370
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    new-instance v1, La/bo0;

    .line 374
    .line 375
    const/16 v2, 0x9

    .line 376
    .line 377
    invoke-direct {v1, v0, v2}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 378
    .line 379
    .line 380
    sget-object v0, La/ty8;->X:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 383
    .line 384
    .line 385
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object v0

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
