.class public final La/o7h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/a8h;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/a8h;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/o7h;->i:B

    iput-object p3, p0, La/o7h;->k:La/a8h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/o7h;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/o7h;->k:La/a8h;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/o7h;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, v1, p2, p0}, La/o7h;-><init>(BLa/yje;La/a8h;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/o7h;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/o7h;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1, p2, p0}, La/o7h;-><init>(BLa/yje;La/a8h;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/o7h;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/o7h;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1, p2, p0}, La/o7h;-><init>(BLa/yje;La/a8h;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/o7h;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/o7h;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, v1, p2, p0}, La/o7h;-><init>(BLa/yje;La/a8h;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/o7h;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/o7h;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1, p2, p0}, La/o7h;-><init>(BLa/yje;La/a8h;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/o7h;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/o7h;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/Pair;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/o7h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o7h;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/jlr;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/o7h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/o7h;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/o7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lkotlin/Pair;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/o7h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/o7h;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/o7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/fs20;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/o7h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/o7h;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/o7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/o7h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/o7h;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/o7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/o7h;->i:B

    .line 2
    .line 3
    const-string v1, "KEY_CATEGORY_ID"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/o7h;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lkotlin/Pair;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iget-object p1, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ljava/util/Set;

    .line 30
    .line 31
    iget-object v3, p0, La/o7h;->k:La/a8h;

    .line 32
    .line 33
    iget-object v4, v3, La/a8h;->y:La/u230;

    .line 34
    .line 35
    new-instance v5, La/f230;

    .line 36
    .line 37
    invoke-direct {v5, p1, v1, v2}, La/f230;-><init>(Ljava/util/Set;J)V

    .line 38
    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x6

    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-object v0, p0, La/o7h;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, La/jlr;

    .line 52
    .line 53
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v4, p0, La/o7h;->k:La/a8h;

    .line 61
    .line 62
    sget p0, La/a8h;->O:I

    .line 63
    .line 64
    instance-of p0, v0, La/xkr;

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    check-cast v0, La/xkr;

    .line 69
    .line 70
    iget-object p0, v0, La/xkr;->d:La/m9s;

    .line 71
    .line 72
    iget-object v5, v4, La/a8h;->y:La/u230;

    .line 73
    .line 74
    new-instance v6, La/l230;

    .line 75
    .line 76
    iget-object p1, v4, La/a8h;->p:Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 77
    .line 78
    iget-object p1, p1, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;->g:La/ms2;

    .line 79
    .line 80
    iget-wide v0, v0, La/xkr;->e:J

    .line 81
    .line 82
    invoke-direct {v6, p0, p1, v0, v1}, La/l230;-><init>(La/m9s;La/ms2;J)V

    .line 83
    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x6

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-static/range {v4 .. v9}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/m9s;->H:Ljava/util/List;

    .line 92
    .line 93
    iget-object p1, v4, La/a8h;->L:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/xum0;

    .line 110
    .line 111
    iget-wide v5, v0, La/xum0;->b:J

    .line 112
    .line 113
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, La/bby;

    .line 122
    .line 123
    if-eqz v1, :cond_0

    .line 124
    .line 125
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ne v1, v2, :cond_0

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_0
    iget-wide v5, v0, La/xum0;->b:J

    .line 133
    .line 134
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v5, v4, La/a8h;->v:La/cmt;

    .line 139
    .line 140
    invoke-virtual {v5}, La/cmt;->a()La/p7m0;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    new-instance v6, La/i89;

    .line 145
    .line 146
    const/16 v7, 0x10

    .line 147
    .line 148
    invoke-direct {v6, v5, v7}, La/i89;-><init>(La/gmq;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v6}, La/i120;->W(La/gmq;)La/gmq;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    new-instance v6, La/fe0;

    .line 156
    .line 157
    const/4 v7, 0x4

    .line 158
    invoke-direct {v6, v3, v4, v0, v7}, La/fe0;-><init>(La/yje;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    new-instance v6, La/g6g;

    .line 170
    .line 171
    invoke-direct {v6, v4, v0, v3, v7}, La/g6g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 172
    .line 173
    .line 174
    new-instance v0, La/fnq;

    .line 175
    .line 176
    invoke-direct {v0, v5, v6, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 177
    .line 178
    .line 179
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object v6, v4, La/a8h;->B:La/mne;

    .line 184
    .line 185
    iget-object v6, v6, La/mne;->a:La/rwj;

    .line 186
    .line 187
    invoke-static {v5, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    sget-object v6, La/foe;->h:La/foe;

    .line 192
    .line 193
    invoke-static {v0, v5, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_1
    iget-object v0, p0, La/o7h;->j:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lkotlin/Pair;

    .line 207
    .line 208
    sget-object v1, La/wne;->a:La/wne;

    .line 209
    .line 210
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p1, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    iget-object p1, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Ljava/util/Map;

    .line 224
    .line 225
    iget-object v3, p0, La/o7h;->k:La/a8h;

    .line 226
    .line 227
    iget-object v4, v3, La/a8h;->y:La/u230;

    .line 228
    .line 229
    new-instance v5, La/d230;

    .line 230
    .line 231
    invoke-direct {v5, v1, v2, p1}, La/d230;-><init>(JLjava/util/Map;)V

    .line 232
    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v8, 0x6

    .line 236
    const/4 v6, 0x0

    .line 237
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_2
    iget-object v0, p0, La/o7h;->j:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, La/fs20;

    .line 246
    .line 247
    sget-object v2, La/wne;->a:La/wne;

    .line 248
    .line 249
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    instance-of p1, v0, La/ds20;

    .line 253
    .line 254
    if-eqz p1, :cond_2

    .line 255
    .line 256
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 257
    .line 258
    iget-object p1, p1, La/a8h;->N:Ljava/lang/Long;

    .line 259
    .line 260
    if-nez p1, :cond_3

    .line 261
    .line 262
    :cond_2
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 263
    .line 264
    iput-object v3, p1, La/a8h;->N:Ljava/lang/Long;

    .line 265
    .line 266
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 267
    .line 268
    iget-object p1, p1, La/a8h;->o:La/vzg0;

    .line 269
    .line 270
    invoke-interface {v0}, La/fs20;->a()J

    .line 271
    .line 272
    .line 273
    move-result-wide v2

    .line 274
    new-instance v4, Ljava/lang/Long;

    .line 275
    .line 276
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, v1, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_3
    iget-object v5, p0, La/o7h;->k:La/a8h;

    .line 283
    .line 284
    iget-object v6, v5, La/a8h;->y:La/u230;

    .line 285
    .line 286
    new-instance v7, La/b230;

    .line 287
    .line 288
    invoke-interface {v0}, La/fs20;->a()J

    .line 289
    .line 290
    .line 291
    move-result-wide p0

    .line 292
    invoke-direct {v7, p0, p1}, La/b230;-><init>(J)V

    .line 293
    .line 294
    .line 295
    const/4 v9, 0x0

    .line 296
    const/4 v10, 0x6

    .line 297
    const/4 v8, 0x0

    .line 298
    invoke-static/range {v5 .. v10}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_3
    iget-object v0, p0, La/o7h;->j:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Ljava/util/List;

    .line 307
    .line 308
    sget-object v4, La/wne;->a:La/wne;

    .line 309
    .line 310
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 314
    .line 315
    iget-object p1, p1, La/a8h;->N:Ljava/lang/Long;

    .line 316
    .line 317
    if-eqz p1, :cond_4

    .line 318
    .line 319
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-nez v4, :cond_4

    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_4
    move-object p1, v3

    .line 327
    :goto_1
    if-eqz p1, :cond_7

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 330
    .line 331
    .line 332
    move-result-wide v4

    .line 333
    if-eqz v0, :cond_5

    .line 334
    .line 335
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-eqz v7, :cond_7

    .line 351
    .line 352
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    check-cast v7, La/fs20;

    .line 357
    .line 358
    invoke-interface {v7}, La/fs20;->a()J

    .line 359
    .line 360
    .line 361
    move-result-wide v7

    .line 362
    cmp-long v7, v7, v4

    .line 363
    .line 364
    if-nez v7, :cond_6

    .line 365
    .line 366
    move-object v4, p1

    .line 367
    goto :goto_3

    .line 368
    :cond_7
    :goto_2
    move-object v4, v3

    .line 369
    :goto_3
    if-eqz p1, :cond_8

    .line 370
    .line 371
    if-nez v4, :cond_8

    .line 372
    .line 373
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 374
    .line 375
    iput-object v3, p1, La/a8h;->N:Ljava/lang/Long;

    .line 376
    .line 377
    iget-object p1, p0, La/o7h;->k:La/a8h;

    .line 378
    .line 379
    iget-object p1, p1, La/a8h;->o:La/vzg0;

    .line 380
    .line 381
    new-instance v3, Ljava/lang/Long;

    .line 382
    .line 383
    const-wide/16 v5, -0x1a

    .line 384
    .line 385
    invoke-direct {v3, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    :cond_8
    iget-object v7, p0, La/o7h;->k:La/a8h;

    .line 392
    .line 393
    iget-object v8, v7, La/a8h;->y:La/u230;

    .line 394
    .line 395
    if-eqz v4, :cond_9

    .line 396
    .line 397
    new-instance p0, La/a230;

    .line 398
    .line 399
    invoke-direct {p0, v0}, La/a230;-><init>(Ljava/util/List;)V

    .line 400
    .line 401
    .line 402
    new-instance p1, La/b230;

    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 405
    .line 406
    .line 407
    move-result-wide v0

    .line 408
    invoke-direct {p1, v0, v1}, La/b230;-><init>(J)V

    .line 409
    .line 410
    .line 411
    const/4 v0, 0x2

    .line 412
    new-array v0, v0, [La/m230;

    .line 413
    .line 414
    const/4 v1, 0x0

    .line 415
    aput-object p0, v0, v1

    .line 416
    .line 417
    aput-object p1, v0, v2

    .line 418
    .line 419
    invoke-static {v7, v8, v0}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 420
    .line 421
    .line 422
    goto :goto_4

    .line 423
    :cond_9
    new-instance v9, La/a230;

    .line 424
    .line 425
    invoke-direct {v9, v0}, La/a230;-><init>(Ljava/util/List;)V

    .line 426
    .line 427
    .line 428
    const/4 v11, 0x0

    .line 429
    const/4 v12, 0x6

    .line 430
    const/4 v10, 0x0

    .line 431
    invoke-static/range {v7 .. v12}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 432
    .line 433
    .line 434
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object p0

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
