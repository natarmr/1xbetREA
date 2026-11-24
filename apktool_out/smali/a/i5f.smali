.class public final La/i5f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/r7f;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/r7f;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/i5f;->i:B

    iput-object p1, p0, La/i5f;->k:La/r7f;

    iput-wide p2, p0, La/i5f;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/i5f;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/i5f;

    .line 7
    .line 8
    iget-wide v2, p0, La/i5f;->l:J

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    iget-object v1, p0, La/i5f;->k:La/r7f;

    .line 12
    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    move-object v5, p2

    .line 19
    new-instance v1, La/i5f;

    .line 20
    .line 21
    iget-wide v3, p0, La/i5f;->l:J

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    iget-object v2, p0, La/i5f;->k:La/r7f;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_1
    move-object v5, p2

    .line 31
    new-instance v1, La/i5f;

    .line 32
    .line 33
    iget-wide v3, p0, La/i5f;->l:J

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    iget-object v2, p0, La/i5f;->k:La/r7f;

    .line 37
    .line 38
    invoke-direct/range {v1 .. v6}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_2
    move-object v5, p2

    .line 43
    new-instance v1, La/i5f;

    .line 44
    .line 45
    iget-wide v3, p0, La/i5f;->l:J

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    iget-object v2, p0, La/i5f;->k:La/r7f;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i5f;->i:B

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
    invoke-virtual {p0, p1, p2}, La/i5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i5f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/i5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/i5f;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/i5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/i5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/i5f;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/i5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/i5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/i5f;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/i5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i5f;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/i5f;->k:La/r7f;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-wide v4, v0, La/i5f;->l:J

    .line 9
    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v2, v0, La/i5f;->j:Z

    .line 20
    .line 21
    iget-object v10, v0, La/i5f;->k:La/r7f;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    if-ne v2, v7, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v10, La/r7f;->e:La/znt;

    .line 42
    .line 43
    iput-boolean v7, v0, La/i5f;->j:Z

    .line 44
    .line 45
    iget-object v2, v2, La/znt;->a:La/chf0;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    move-object v8, v1

    .line 54
    goto :goto_3

    .line 55
    :cond_2
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v2, v1

    .line 72
    check-cast v2, La/qu6;

    .line 73
    .line 74
    iget-wide v11, v2, La/qu6;->c:J

    .line 75
    .line 76
    cmp-long v2, v11, v4

    .line 77
    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    move-object v8, v1

    .line 81
    :cond_4
    check-cast v8, La/qu6;

    .line 82
    .line 83
    if-eqz v8, :cond_7

    .line 84
    .line 85
    iget-object v0, v10, La/r7f;->d:La/j9c;

    .line 86
    .line 87
    invoke-virtual {v0}, La/j9c;->c()La/cit0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/cit0;->g0:La/vb9;

    .line 92
    .line 93
    iget-wide v13, v8, La/qu6;->c:J

    .line 94
    .line 95
    iget-wide v1, v8, La/qu6;->b:J

    .line 96
    .line 97
    iget-wide v11, v8, La/qu6;->e:J

    .line 98
    .line 99
    iget-object v4, v8, La/qu6;->w:La/uoy;

    .line 100
    .line 101
    sget-object v5, La/uoy;->d:La/uoy;

    .line 102
    .line 103
    if-ne v4, v5, :cond_6

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    iget-boolean v0, v0, La/vb9;->d:Z

    .line 108
    .line 109
    if-ne v0, v7, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move/from16 v19, v7

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    :goto_1
    move/from16 v19, v3

    .line 116
    .line 117
    :goto_2
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget-object v0, v10, La/r7f;->Y0:La/mne;

    .line 122
    .line 123
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 124
    .line 125
    new-instance v7, La/w6f;

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const-wide/16 v17, 0x0

    .line 130
    .line 131
    move-wide v15, v1

    .line 132
    move-object v9, v7

    .line 133
    invoke-direct/range {v9 .. v20}, La/w6f;-><init>(La/r7f;JJJJZLa/yje;)V

    .line 134
    .line 135
    .line 136
    const/16 v8, 0xb

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x0

    .line 140
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 141
    .line 142
    .line 143
    :cond_7
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_3
    return-object v8

    .line 146
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 147
    .line 148
    iget-boolean v2, v0, La/i5f;->j:Z

    .line 149
    .line 150
    iget-wide v11, v0, La/i5f;->l:J

    .line 151
    .line 152
    iget-object v10, v0, La/i5f;->k:La/r7f;

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    if-ne v2, v7, :cond_8

    .line 157
    .line 158
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sget-object v2, La/p0f;->c:La/p0f;

    .line 170
    .line 171
    iput-boolean v7, v0, La/i5f;->j:Z

    .line 172
    .line 173
    invoke-virtual {v10, v2, v11, v12, v0}, La/r7f;->U(La/p0f;JLa/zje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v1, :cond_a

    .line 178
    .line 179
    move-object v8, v1

    .line 180
    goto :goto_5

    .line 181
    :cond_a
    :goto_4
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-object v0, v10, La/r7f;->Y0:La/mne;

    .line 186
    .line 187
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 188
    .line 189
    sget-object v3, La/h5f;->a:La/h5f;

    .line 190
    .line 191
    new-instance v4, La/s4f;

    .line 192
    .line 193
    const/4 v0, 0x2

    .line 194
    invoke-direct {v4, v10, v0}, La/s4f;-><init>(La/r7f;B)V

    .line 195
    .line 196
    .line 197
    new-instance v6, La/i5f;

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    move-object v9, v6

    .line 202
    invoke-direct/range {v9 .. v14}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 203
    .line 204
    .line 205
    const/16 v7, 0x8

    .line 206
    .line 207
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 208
    .line 209
    .line 210
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_5
    return-object v8

    .line 213
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 214
    .line 215
    iget-boolean v3, v0, La/i5f;->j:Z

    .line 216
    .line 217
    if-eqz v3, :cond_c

    .line 218
    .line 219
    if-ne v3, v7, :cond_b

    .line 220
    .line 221
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sget-object v3, La/p0f;->b:La/p0f;

    .line 233
    .line 234
    iput-boolean v7, v0, La/i5f;->j:Z

    .line 235
    .line 236
    invoke-virtual {v2, v3, v4, v5, v0}, La/r7f;->U(La/p0f;JLa/zje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ne v0, v1, :cond_d

    .line 241
    .line 242
    move-object v8, v1

    .line 243
    goto :goto_7

    .line 244
    :cond_d
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    :goto_7
    return-object v8

    .line 247
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 248
    .line 249
    iget-boolean v9, v0, La/i5f;->j:Z

    .line 250
    .line 251
    if-eqz v9, :cond_f

    .line 252
    .line 253
    if-ne v9, v7, :cond_e

    .line 254
    .line 255
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_e
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, La/r7f;->g0()V

    .line 267
    .line 268
    .line 269
    iget-object v6, v2, La/r7f;->K:La/qv2;

    .line 270
    .line 271
    iput-boolean v7, v0, La/i5f;->j:Z

    .line 272
    .line 273
    invoke-virtual {v6, v4, v5, v0}, La/qv2;->s(JLa/zje;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-ne v0, v1, :cond_10

    .line 278
    .line 279
    move-object v8, v1

    .line 280
    goto :goto_9

    .line 281
    :cond_10
    :goto_8
    iget-object v0, v2, La/r7f;->b0:La/ni9;

    .line 282
    .line 283
    invoke-virtual {v0}, La/ni9;->b()V

    .line 284
    .line 285
    .line 286
    new-instance v0, La/s4f;

    .line 287
    .line 288
    const/16 v1, 0x8

    .line 289
    .line 290
    invoke-direct {v0, v2, v1}, La/s4f;-><init>(La/r7f;B)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3, v3, v0}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 294
    .line 295
    .line 296
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    :goto_9
    return-object v8

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
