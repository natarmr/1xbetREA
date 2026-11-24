.class public final La/r120;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/w220;


# direct methods
.method public synthetic constructor <init>(La/w220;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r120;->i:B

    iput-object p1, p0, La/r120;->j:La/w220;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/r120;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r120;->j:La/w220;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/r120;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/r120;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/r120;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/r120;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/r120;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance p1, La/r120;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, p2, v0}, La/r120;-><init>(La/w220;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r120;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r120;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/r120;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Lkotlin/Unit;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/r120;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Lkotlin/Unit;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/r120;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/r120;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_4
    check-cast p1, La/vne;

    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/r120;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/r120;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/r120;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
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
    iget-byte v1, v0, La/r120;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/r120;->j:La/w220;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/w220;->E0:La/cr;

    .line 19
    .line 20
    iget-object v1, v0, La/cr;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, La/us00;

    .line 23
    .line 24
    invoke-static {v1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v1}, La/ga3;->I(La/cpv0;La/us00;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, La/cr;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, La/us00;

    .line 37
    .line 38
    invoke-static {v0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v1, La/hl50;

    .line 46
    .line 47
    sget-object v1, La/sl50;->a:La/sl50;

    .line 48
    .line 49
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v7, La/sl50;->a:La/sl50;

    .line 55
    .line 56
    new-instance v6, La/hl50;

    .line 57
    .line 58
    invoke-direct {v6, v4}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v16

    .line 65
    new-instance v5, La/o4e;

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const-wide/16 v12, -0x1

    .line 72
    .line 73
    move-wide v14, v12

    .line 74
    invoke-direct/range {v5 .. v16}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, La/ag90;

    .line 78
    .line 79
    const-class v2, Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;

    .line 80
    .line 81
    invoke-direct {v1, v2}, La/ag90;-><init>(Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, La/v0;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, La/ppv0;

    .line 87
    .line 88
    iput-object v5, v2, La/ppv0;->j:La/o4e;

    .line 89
    .line 90
    invoke-virtual {v1}, La/v0;->k()La/lpv0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, La/bg90;

    .line 95
    .line 96
    sget-object v2, La/yko;->a:[La/yko;

    .line 97
    .line 98
    const-string v2, "DailyTaskFinishingNotificationWorker"

    .line 99
    .line 100
    invoke-virtual {v0, v2, v1}, La/cpv0;->b(Ljava/lang/String;La/bg90;)La/gqw0;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v0, La/w220;->s:La/ouu;

    .line 112
    .line 113
    invoke-virtual {v0}, La/ouu;->s()La/i1w0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v2, La/q0w0;

    .line 123
    .line 124
    invoke-direct {v2, v4}, La/q0w0;-><init>(La/m7h0;)V

    .line 125
    .line 126
    .line 127
    new-instance v4, La/c8d;

    .line 128
    .line 129
    sget-object v5, La/y7d;->a:La/v7d;

    .line 130
    .line 131
    invoke-direct {v4, v5, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    new-instance v2, La/c8d;

    .line 138
    .line 139
    sget-object v4, La/y7d;->a:La/v7d;

    .line 140
    .line 141
    sget-object v5, La/o0w0;->a:La/o0w0;

    .line 142
    .line 143
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v2, v2, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :goto_0
    move-object v2, v1

    .line 155
    check-cast v2, La/paw;

    .line 156
    .line 157
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_0

    .line 162
    .line 163
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, La/oe50;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 177
    .line 178
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, La/w220;->A()V

    .line 182
    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 188
    .line 189
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, La/w220;->z()V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 199
    .line 200
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, v0, La/w220;->x1:La/ol60;

    .line 204
    .line 205
    new-instance v1, La/v8h0;

    .line 206
    .line 207
    invoke-direct {v1, v2}, La/v8h0;-><init>(Z)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v0, La/w220;->V:La/lef0;

    .line 222
    .line 223
    iget-object v0, v0, La/w220;->c1:La/sff0;

    .line 224
    .line 225
    iget-boolean v0, v0, La/sff0;->v:Z

    .line 226
    .line 227
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v1, La/j400;

    .line 230
    .line 231
    if-eqz v0, :cond_1

    .line 232
    .line 233
    invoke-virtual {v1, v3}, La/j400;->d(Z)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_4

    .line 237
    .line 238
    :cond_1
    iget-object v0, v1, La/j400;->g:La/bby;

    .line 239
    .line 240
    if-eqz v0, :cond_2

    .line 241
    .line 242
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-ne v0, v2, :cond_2

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_2
    iget-object v5, v1, La/j400;->f:La/sje;

    .line 250
    .line 251
    sget-object v0, La/qlq0;->a:La/qlq0;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-object v0, La/rq40;->a:La/rq40;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {}, La/rq40;->b()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    new-instance v0, La/plq0;

    .line 266
    .line 267
    invoke-direct {v0, v6, v7}, La/plq0;-><init>(J)V

    .line 268
    .line 269
    .line 270
    iput-object v0, v1, La/j400;->k:La/plq0;

    .line 271
    .line 272
    const-class v0, La/oqt0;

    .line 273
    .line 274
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    iget-wide v6, v1, La/j400;->i:J

    .line 279
    .line 280
    sget-object v0, La/wen;->b:La/uen;

    .line 281
    .line 282
    sget-object v0, La/bfn;->e:La/bfn;

    .line 283
    .line 284
    const-wide/16 v8, 0x12c

    .line 285
    .line 286
    invoke-static {v8, v9, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 287
    .line 288
    .line 289
    move-result-wide v8

    .line 290
    sget-object v3, La/wen;->b:La/uen;

    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const-wide/16 v10, 0x0

    .line 296
    .line 297
    invoke-static {v6, v7, v10, v11}, La/wen;->d(JJ)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_3

    .line 302
    .line 303
    :goto_1
    move-wide v9, v10

    .line 304
    goto :goto_2

    .line 305
    :cond_3
    invoke-static {v8, v9, v6, v7}, La/wen;->j(JJ)J

    .line 306
    .line 307
    .line 308
    move-result-wide v6

    .line 309
    invoke-static {v6, v7, v0}, La/wen;->l(JLa/bfn;)J

    .line 310
    .line 311
    .line 312
    move-result-wide v10

    .line 313
    goto :goto_1

    .line 314
    :goto_2
    iget-object v0, v1, La/j400;->d:La/mne;

    .line 315
    .line 316
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 317
    .line 318
    new-instance v15, La/z8z;

    .line 319
    .line 320
    const/16 v0, 0x16

    .line 321
    .line 322
    invoke-direct {v15, v0}, La/z8z;-><init>(B)V

    .line 323
    .line 324
    .line 325
    new-instance v0, La/slx;

    .line 326
    .line 327
    const/16 v3, 0xd

    .line 328
    .line 329
    invoke-direct {v0, v1, v4, v3}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 330
    .line 331
    .line 332
    const/16 v17, 0x10

    .line 333
    .line 334
    const-string v6, "LimitsRsRepositoryImpl_getLimits"

    .line 335
    .line 336
    const-wide/16 v7, 0x12c

    .line 337
    .line 338
    const-wide/16 v12, 0x12c

    .line 339
    .line 340
    move-object/from16 v16, v0

    .line 341
    .line 342
    invoke-static/range {v5 .. v17}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    iput-object v0, v1, La/j400;->g:La/bby;

    .line 347
    .line 348
    :goto_3
    invoke-virtual {v1, v2}, La/j400;->d(Z)V

    .line 349
    .line 350
    .line 351
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object v0

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
