.class public final La/oz1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wz1;


# direct methods
.method public synthetic constructor <init>(La/wz1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oz1;->i:B

    iput-object p1, p0, La/oz1;->k:La/wz1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/oz1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oz1;->k:La/wz1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/oz1;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/oz1;-><init>(La/wz1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/oz1;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/oz1;-><init>(La/wz1;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/oz1;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/oz1;-><init>(La/wz1;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/oz1;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/oz1;-><init>(La/wz1;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance v0, La/oz1;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p2, v1}, La/oz1;-><init>(La/wz1;La/yje;B)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    iput-boolean p0, v0, La/oz1;->j:Z

    .line 49
    .line 50
    return-object v0

    .line 51
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
    iget-byte v0, p0, La/oz1;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/oz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oz1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/oz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/oz1;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/oz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/oz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/oz1;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/oz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/oz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/oz1;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/oz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/oz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/oz1;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/oz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oz1;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "screen"

    .line 7
    .line 8
    const-string v4, "aggregator_tournaments"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, La/oz1;->k:La/wz1;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-boolean v9, v0, La/oz1;->j:Z

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    if-ne v9, v7, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v5, v8, La/wz1;->r:La/qu;

    .line 39
    .line 40
    iget-object v5, v5, La/qu;->a:La/kt2;

    .line 41
    .line 42
    const-string v6, "reg_page_call"

    .line 43
    .line 44
    invoke-static {v3, v4, v5, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v8, La/wz1;->E:La/s64;

    .line 48
    .line 49
    sget-object v4, La/y1p;->Z:La/y1p;

    .line 50
    .line 51
    iget-object v5, v8, La/wz1;->F:La/cmt;

    .line 52
    .line 53
    invoke-virtual {v5}, La/cmt;->g()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v3, v4, v5}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v8, La/wz1;->G:La/ytt;

    .line 61
    .line 62
    sget-object v4, La/aue0;->d:La/aue0;

    .line 63
    .line 64
    iput-boolean v7, v0, La/oz1;->j:Z

    .line 65
    .line 66
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-ne v0, v1, :cond_2

    .line 71
    .line 72
    move-object v5, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_0
    iget-object v0, v8, La/wz1;->t:La/oeg0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/oeg0;->b()La/i1w0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v3, La/c8d;

    .line 85
    .line 86
    sget-object v4, La/y7d;->a:La/v7d;

    .line 87
    .line 88
    sget-object v5, La/o0w0;->a:La/o0w0;

    .line 89
    .line 90
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_1
    move-object v2, v1

    .line 102
    check-cast v2, La/paw;

    .line 103
    .line 104
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, La/oe50;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_2
    return-object v5

    .line 123
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 124
    .line 125
    iget-boolean v9, v0, La/oz1;->j:Z

    .line 126
    .line 127
    if-eqz v9, :cond_5

    .line 128
    .line 129
    if-ne v9, v7, :cond_4

    .line 130
    .line 131
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v5, v8, La/wz1;->r:La/qu;

    .line 143
    .line 144
    iget-object v5, v5, La/qu;->a:La/kt2;

    .line 145
    .line 146
    const-string v6, "login_page_call"

    .line 147
    .line 148
    invoke-static {v3, v4, v5, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v3, v8, La/wz1;->E:La/s64;

    .line 152
    .line 153
    sget-object v5, La/y1p;->b:La/y1p;

    .line 154
    .line 155
    invoke-virtual {v3, v4}, La/s64;->c(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v8, La/wz1;->G:La/ytt;

    .line 159
    .line 160
    sget-object v4, La/aue0;->d:La/aue0;

    .line 161
    .line 162
    iput-boolean v7, v0, La/oz1;->j:Z

    .line 163
    .line 164
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ne v0, v1, :cond_6

    .line 169
    .line 170
    move-object v5, v1

    .line 171
    goto :goto_5

    .line 172
    :cond_6
    :goto_3
    iget-object v0, v8, La/wz1;->t:La/oeg0;

    .line 173
    .line 174
    invoke-virtual {v0}, La/oeg0;->b()La/i1w0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v3, La/c8d;

    .line 183
    .line 184
    sget-object v4, La/y7d;->a:La/v7d;

    .line 185
    .line 186
    sget-object v5, La/n0w0;->a:La/n0w0;

    .line 187
    .line 188
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    :goto_4
    move-object v2, v1

    .line 200
    check-cast v2, La/paw;

    .line 201
    .line 202
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_7

    .line 207
    .line 208
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, La/oe50;

    .line 213
    .line 214
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_5
    return-object v5

    .line 221
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 222
    .line 223
    iget-boolean v2, v0, La/oz1;->j:Z

    .line 224
    .line 225
    if-eqz v2, :cond_9

    .line 226
    .line 227
    if-ne v2, v7, :cond_8

    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v2, v8, La/wz1;->o:La/kb0;

    .line 241
    .line 242
    new-instance v3, La/db0;

    .line 243
    .line 244
    sget-object v4, La/wz1;->T:Ljava/lang/String;

    .line 245
    .line 246
    sget-object v5, La/k7k;->n:La/k7k;

    .line 247
    .line 248
    iget-object v6, v8, La/wz1;->F:La/cmt;

    .line 249
    .line 250
    invoke-virtual {v6}, La/cmt;->g()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-direct {v3, v4, v5, v6}, La/db0;-><init>(Ljava/lang/String;La/k7k;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iput-boolean v7, v0, La/oz1;->j:Z

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3, v0}, La/kb0;->o(La/fb0;La/yje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v0, v1, :cond_a

    .line 267
    .line 268
    move-object v5, v1

    .line 269
    goto :goto_7

    .line 270
    :cond_a
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    :goto_7
    return-object v5

    .line 273
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 274
    .line 275
    iget-boolean v2, v0, La/oz1;->j:Z

    .line 276
    .line 277
    if-eqz v2, :cond_c

    .line 278
    .line 279
    if-ne v2, v7, :cond_b

    .line 280
    .line 281
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object v2, v8, La/wz1;->o:La/kb0;

    .line 293
    .line 294
    new-instance v3, La/cb0;

    .line 295
    .line 296
    sget-object v5, La/wz1;->T:Ljava/lang/String;

    .line 297
    .line 298
    sget-object v6, La/y1p;->b:La/y1p;

    .line 299
    .line 300
    invoke-direct {v3, v5, v4}, La/cb0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iput-boolean v7, v0, La/oz1;->j:Z

    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v3, v0}, La/kb0;->o(La/fb0;La/yje;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-ne v0, v1, :cond_d

    .line 313
    .line 314
    move-object v5, v1

    .line 315
    goto :goto_9

    .line 316
    :cond_d
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    :goto_9
    return-object v5

    .line 319
    :pswitch_3
    iget-boolean v11, v0, La/oz1;->j:Z

    .line 320
    .line 321
    sget-object v0, La/wne;->a:La/wne;

    .line 322
    .line 323
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, La/dz1;

    .line 331
    .line 332
    iget-boolean v0, v0, La/dz1;->g:Z

    .line 333
    .line 334
    if-nez v0, :cond_e

    .line 335
    .line 336
    if-eqz v11, :cond_e

    .line 337
    .line 338
    invoke-virtual {v8}, La/wz1;->N()V

    .line 339
    .line 340
    .line 341
    :cond_e
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 342
    .line 343
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 344
    .line 345
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-object v6, v1

    .line 353
    check-cast v6, La/dz1;

    .line 354
    .line 355
    const/4 v15, 0x0

    .line 356
    const/16 v16, 0xfbf

    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    const/4 v8, 0x0

    .line 360
    const/4 v9, 0x0

    .line 361
    const/4 v10, 0x0

    .line 362
    const/4 v12, 0x0

    .line 363
    const/4 v13, 0x0

    .line 364
    const/4 v14, 0x0

    .line 365
    invoke-static/range {v6 .. v16}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_f

    .line 374
    .line 375
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
