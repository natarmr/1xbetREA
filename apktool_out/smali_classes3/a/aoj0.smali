.class public final La/aoj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/eoj0;


# direct methods
.method public synthetic constructor <init>(La/eoj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aoj0;->i:B

    iput-object p1, p0, La/aoj0;->k:La/eoj0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/aoj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/aoj0;->k:La/eoj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/aoj0;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/aoj0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/aoj0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/aoj0;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, La/aoj0;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p1, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

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
    iget-byte v0, p0, La/aoj0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/aoj0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/aoj0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/aoj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/aoj0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/aoj0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/aoj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/aoj0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/aoj0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/aoj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/aoj0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/aoj0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/aoj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/aoj0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/aoj0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/aoj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/aoj0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/aoj0;->k:La/eoj0;

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
    iget-boolean v5, p0, La/aoj0;->j:Z

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
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p1, La/aoj0;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {p1, v3, v4, v1}, La/aoj0;-><init>(La/eoj0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    iput-boolean v2, p0, La/aoj0;->j:Z

    .line 38
    .line 39
    sget v1, La/eoj0;->D:I

    .line 40
    .line 41
    invoke-virtual {v3, p1, p0}, La/eoj0;->N(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 50
    .line 51
    new-instance p0, La/nnj0;

    .line 52
    .line 53
    iget-object v0, v3, La/eoj0;->t:La/aqt;

    .line 54
    .line 55
    invoke-virtual {v0}, La/aqt;->a()V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p1}, La/nnj0;-><init>(Ljava/io/File;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v4

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v5, p0, La/aoj0;->j:Z

    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    if-ne v5, v2, :cond_3

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
    move-object p1, v4

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v3, La/eoj0;->p:La/e1u;

    .line 88
    .line 89
    iget-object v1, v3, La/eoj0;->w:Ljava/io/File;

    .line 90
    .line 91
    iget-object v3, v3, La/eoj0;->v:Ljava/lang/String;

    .line 92
    .line 93
    iput-boolean v2, p0, La/aoj0;->j:Z

    .line 94
    .line 95
    invoke-virtual {p1, v1, v3, p0}, La/e1u;->b(Ljava/io/File;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v0, :cond_5

    .line 100
    .line 101
    move-object p1, v0

    .line 102
    :cond_5
    :goto_2
    return-object p1

    .line 103
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v5, p0, La/aoj0;->j:Z

    .line 106
    .line 107
    if-eqz v5, :cond_7

    .line 108
    .line 109
    if-ne v5, v2, :cond_6

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, La/hr;

    .line 123
    .line 124
    const/16 v1, 0x1d

    .line 125
    .line 126
    invoke-direct {p1, v3, v4, v1}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    iput-boolean v2, p0, La/aoj0;->j:Z

    .line 130
    .line 131
    sget v1, La/eoj0;->D:I

    .line 132
    .line 133
    invoke-virtual {v3, p1, p0}, La/eoj0;->N(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_8

    .line 138
    .line 139
    move-object v4, v0

    .line 140
    goto :goto_4

    .line 141
    :cond_8
    :goto_3
    check-cast p1, La/onj0;

    .line 142
    .line 143
    sget p0, La/eoj0;->D:I

    .line 144
    .line 145
    invoke-virtual {v3, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_4
    return-object v4

    .line 151
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 152
    .line 153
    iget-boolean v5, p0, La/aoj0;->j:Z

    .line 154
    .line 155
    if-eqz v5, :cond_a

    .line 156
    .line 157
    if-ne v5, v2, :cond_9

    .line 158
    .line 159
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    goto :goto_6

    .line 166
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 174
    .line 175
    iget-object p1, v3, La/eoj0;->p:La/e1u;

    .line 176
    .line 177
    iget-object v1, v3, La/eoj0;->w:Ljava/io/File;

    .line 178
    .line 179
    iget-object v4, v3, La/eoj0;->v:Ljava/lang/String;

    .line 180
    .line 181
    iput-boolean v2, p0, La/aoj0;->j:Z

    .line 182
    .line 183
    invoke-virtual {p1, v1, v4, p0}, La/e1u;->b(Ljava/io/File;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-ne p1, v0, :cond_b

    .line 188
    .line 189
    move-object v4, v0

    .line 190
    goto :goto_8

    .line 191
    :cond_b
    :goto_5
    check-cast p1, Ljava/io/File;

    .line 192
    .line 193
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :goto_6
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 197
    .line 198
    new-instance p1, La/g0g0;

    .line 199
    .line 200
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    :goto_7
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    instance-of p0, p0, La/cxe;

    .line 208
    .line 209
    if-eqz p0, :cond_c

    .line 210
    .line 211
    sget p0, La/eoj0;->D:I

    .line 212
    .line 213
    invoke-virtual {v3}, La/eoj0;->M()V

    .line 214
    .line 215
    .line 216
    :cond_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    :goto_8
    return-object v4

    .line 219
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 220
    .line 221
    iget-boolean v5, p0, La/aoj0;->j:Z

    .line 222
    .line 223
    if-eqz v5, :cond_e

    .line 224
    .line 225
    if-ne v5, v2, :cond_d

    .line 226
    .line 227
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_d
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, v3, La/eoj0;->o:La/ieu;

    .line 239
    .line 240
    iget-object v1, v3, La/eoj0;->v:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v4, v3, La/eoj0;->w:Ljava/io/File;

    .line 243
    .line 244
    iput-boolean v2, p0, La/aoj0;->j:Z

    .line 245
    .line 246
    invoke-virtual {p1, v1, v4, p0}, La/ieu;->m(Ljava/lang/String;Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    if-ne p1, v0, :cond_f

    .line 251
    .line 252
    move-object v4, v0

    .line 253
    goto :goto_a

    .line 254
    :cond_f
    :goto_9
    move-object v5, p1

    .line 255
    check-cast v5, Ljava/io/File;

    .line 256
    .line 257
    sget p0, La/eoj0;->D:I

    .line 258
    .line 259
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 260
    .line 261
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 262
    .line 263
    :cond_10
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-object v4, p1

    .line 271
    check-cast v4, La/rnj0;

    .line 272
    .line 273
    const/4 v8, 0x0

    .line 274
    const/16 v9, 0xc

    .line 275
    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v7, 0x0

    .line 278
    invoke-static/range {v4 .. v9}, La/rnj0;->a(La/rnj0;Ljava/io/File;ZZZI)La/rnj0;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_10

    .line 287
    .line 288
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    :goto_a
    return-object v4

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
