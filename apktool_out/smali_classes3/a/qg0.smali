.class public final La/qg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/eh0;


# direct methods
.method public synthetic constructor <init>(La/eh0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qg0;->i:B

    iput-object p1, p0, La/qg0;->j:La/eh0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/qg0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qg0;->j:La/eh0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/qg0;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/qg0;-><init>(La/eh0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/qg0;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/qg0;-><init>(La/eh0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/qg0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/qg0;-><init>(La/eh0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/qg0;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/qg0;-><init>(La/eh0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
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
    iget-byte v0, p0, La/qg0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qg0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qg0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qg0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/qg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/qg0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/qg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qg0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/qg0;->j:La/eh0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v3, La/eh0;->J:La/g5k;

    .line 17
    .line 18
    iget-object v0, v0, La/g5k;->a:La/pzu;

    .line 19
    .line 20
    iget-object v0, v0, La/pzu;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/h840;

    .line 23
    .line 24
    iget-object v0, v0, La/h840;->h:La/p7m0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual {v0, v5, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget-object v0, v3, La/eh0;->r:La/mne;

    .line 49
    .line 50
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 51
    .line 52
    sget-object v7, La/pg0;->a:La/pg0;

    .line 53
    .line 54
    new-instance v10, La/qg0;

    .line 55
    .line 56
    invoke-direct {v10, v3, v5, v2}, La/qg0;-><init>(La/eh0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v11, 0xa

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 63
    .line 64
    .line 65
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, La/eh0;->e0:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, v3, La/eh0;->s:La/s91;

    .line 76
    .line 77
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 78
    .line 79
    sget-object v10, La/wgh0;->f:La/wgh0;

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x1e7

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    const-wide/16 v7, 0x0

    .line 88
    .line 89
    sget-object v9, La/vl1;->a:La/vl1;

    .line 90
    .line 91
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    const-wide/16 v13, 0x0

    .line 94
    .line 95
    const/4 v15, 0x0

    .line 96
    invoke-direct/range {v4 .. v17}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v4}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v3, La/eh0;->y:La/s31;

    .line 103
    .line 104
    invoke-virtual {v0, v10}, La/s31;->g(La/wgh0;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v3, La/eh0;->A:La/cyu;

    .line 108
    .line 109
    const-string v1, "aggregator_category"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 118
    .line 119
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v3, La/eh0;->p:La/oeg0;

    .line 123
    .line 124
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v3, La/c8d;

    .line 133
    .line 134
    sget-object v4, La/y7d;->a:La/v7d;

    .line 135
    .line 136
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 137
    .line 138
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_0
    move-object v2, v1

    .line 146
    check-cast v2, La/paw;

    .line 147
    .line 148
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_1

    .line 153
    .line 154
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, La/oe50;

    .line 159
    .line 160
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v0, La/qg0;->j:La/eh0;

    .line 173
    .line 174
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/hg0;

    .line 179
    .line 180
    iget-object v0, v0, La/hg0;->a:La/fs80;

    .line 181
    .line 182
    iget-wide v4, v0, La/fs80;->e:J

    .line 183
    .line 184
    const-wide/high16 v0, -0x8000000000000000L

    .line 185
    .line 186
    cmp-long v0, v4, v0

    .line 187
    .line 188
    if-eqz v0, :cond_3

    .line 189
    .line 190
    iget-object v6, v3, La/eh0;->o:La/q91;

    .line 191
    .line 192
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, v3, La/eh0;->b0:La/bby;

    .line 197
    .line 198
    invoke-virtual {v3}, La/eh0;->N()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    iget-object v2, v3, La/eh0;->r:La/mne;

    .line 203
    .line 204
    iget-object v10, v2, La/mne;->a:La/rwj;

    .line 205
    .line 206
    new-instance v11, La/lg0;

    .line 207
    .line 208
    const/4 v2, 0x3

    .line 209
    invoke-direct {v11, v3, v2}, La/lg0;-><init>(La/eh0;B)V

    .line 210
    .line 211
    .line 212
    new-instance v2, La/ir;

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    const/4 v8, 0x3

    .line 216
    invoke-direct/range {v2 .. v8}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 217
    .line 218
    .line 219
    const/16 v14, 0x28

    .line 220
    .line 221
    const/4 v12, 0x0

    .line 222
    move-object v7, v0

    .line 223
    move-object v8, v1

    .line 224
    move-object v13, v2

    .line 225
    invoke-static/range {v7 .. v14}, La/bww;->R(La/bvc;La/bby;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iput-object v0, v3, La/eh0;->b0:La/bby;

    .line 230
    .line 231
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 232
    .line 233
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 234
    .line 235
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object v2, v1

    .line 243
    check-cast v2, La/hg0;

    .line 244
    .line 245
    new-instance v3, La/fs80;

    .line 246
    .line 247
    const/4 v11, 0x0

    .line 248
    const/16 v12, 0x7f

    .line 249
    .line 250
    const/4 v4, 0x0

    .line 251
    const-wide/16 v5, 0x0

    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    const/4 v8, 0x0

    .line 255
    const-wide/16 v9, 0x0

    .line 256
    .line 257
    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 258
    .line 259
    .line 260
    const/4 v15, 0x0

    .line 261
    const v16, 0x3fffe

    .line 262
    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    const/4 v6, 0x0

    .line 266
    const/4 v8, 0x0

    .line 267
    const/4 v9, 0x0

    .line 268
    const/4 v10, 0x0

    .line 269
    const/4 v12, 0x0

    .line 270
    const/4 v13, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    invoke-static/range {v2 .. v16}, La/hg0;->a(La/hg0;La/fs80;Ljava/util/List;La/a4x;La/a4x;Ljava/util/List;ZZZZZZLa/mdm;La/ql5;I)La/hg0;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_2

    .line 281
    .line 282
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
