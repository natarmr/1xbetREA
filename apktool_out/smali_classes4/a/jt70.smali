.class public final La/jt70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/rt70;


# direct methods
.method public synthetic constructor <init>(La/rt70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jt70;->i:B

    iput-object p1, p0, La/jt70;->k:La/rt70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jt70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jt70;->k:La/rt70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/jt70;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/jt70;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/jt70;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/jt70;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance v0, La/jt70;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v0, La/jt70;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_3
    new-instance p1, La/jt70;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
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
    iget-byte v0, p0, La/jt70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jt70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jt70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jt70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jt70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/jt70;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/jt70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/jt70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/jt70;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/jt70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/jt70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/jt70;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/jt70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, La/vne;

    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/jt70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/jt70;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/jt70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/jt70;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x2

    .line 6
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/jt70;->k:La/rt70;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v1, p0, La/jt70;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v6, La/rt70;->r:La/uq70;

    .line 35
    .line 36
    invoke-interface {p1}, La/uq70;->h()La/gmq;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v1, La/wk30;

    .line 45
    .line 46
    const/16 v2, 0x9

    .line 47
    .line 48
    invoke-direct {v1, p1, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 49
    .line 50
    .line 51
    new-instance p1, La/e3p;

    .line 52
    .line 53
    const/16 v2, 0x1a

    .line 54
    .line 55
    invoke-direct {p1, v6, v7, v2}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-boolean v5, p0, La/jt70;->j:Z

    .line 59
    .line 60
    invoke-static {v1, p1, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v0, :cond_2

    .line 65
    .line 66
    move-object v7, v0

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_1
    return-object v7

    .line 71
    :pswitch_0
    iget-boolean p0, p0, La/jt70;->j:Z

    .line 72
    .line 73
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    sget p0, La/rt70;->z:I

    .line 81
    .line 82
    iget-object p0, v6, La/rt70;->w:La/c4m0;

    .line 83
    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-ne p0, v5, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    new-instance p0, La/coe;

    .line 94
    .line 95
    invoke-direct {p0, v3, v7}, La/coe;-><init>(ILa/yje;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, La/vsg0;

    .line 99
    .line 100
    invoke-direct {p1, p0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/wn10;

    .line 104
    .line 105
    const/4 v0, 0x5

    .line 106
    invoke-direct {p0, v6, v7, v0}, La/wn10;-><init>(La/diu0;La/yje;B)V

    .line 107
    .line 108
    .line 109
    new-instance v0, La/fnq;

    .line 110
    .line 111
    invoke-direct {v0, p1, p0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 112
    .line 113
    .line 114
    new-instance p0, La/y0g;

    .line 115
    .line 116
    const/4 p1, 0x7

    .line 117
    invoke-direct {p0, v6, v7, p1}, La/y0g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/dnq;

    .line 121
    .line 122
    invoke-direct {p1, v0, p0, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iget-object v0, v6, La/rt70;->o:La/mne;

    .line 130
    .line 131
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 132
    .line 133
    invoke-static {p0, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    sget-object v0, La/qt70;->h:La/qt70;

    .line 138
    .line 139
    invoke-static {p1, p0, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iput-object p0, v6, La/rt70;->w:La/c4m0;

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    sget p0, La/rt70;->z:I

    .line 147
    .line 148
    iget-object p0, v6, La/rt70;->w:La/c4m0;

    .line 149
    .line 150
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-boolean v2, p0, La/jt70;->j:Z

    .line 159
    .line 160
    if-eqz v2, :cond_6

    .line 161
    .line 162
    if-ne v2, v5, :cond_5

    .line 163
    .line 164
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget p1, La/rt70;->z:I

    .line 176
    .line 177
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    sget-object v9, La/it70;->a:La/it70;

    .line 182
    .line 183
    iget-object p1, v6, La/rt70;->o:La/mne;

    .line 184
    .line 185
    iget-object v11, p1, La/mne;->a:La/rwj;

    .line 186
    .line 187
    new-instance v12, La/jt70;

    .line 188
    .line 189
    invoke-direct {v12, v6, v7, v1}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 190
    .line 191
    .line 192
    const/16 v13, 0xa

    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 196
    .line 197
    .line 198
    iget-object p1, v6, La/rt70;->r:La/uq70;

    .line 199
    .line 200
    invoke-interface {p1}, La/uq70;->h()La/gmq;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance v1, La/lh70;

    .line 205
    .line 206
    const/16 v2, 0x17

    .line 207
    .line 208
    invoke-direct {v1, v6, v2}, La/lh70;-><init>(Ljava/lang/Object;B)V

    .line 209
    .line 210
    .line 211
    iput-boolean v5, p0, La/jt70;->j:Z

    .line 212
    .line 213
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-ne p0, v0, :cond_7

    .line 218
    .line 219
    move-object v7, v0

    .line 220
    goto :goto_4

    .line 221
    :cond_7
    :goto_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_4
    return-object v7

    .line 224
    :pswitch_2
    iget-boolean p0, p0, La/jt70;->j:Z

    .line 225
    .line 226
    sget-object v0, La/wne;->a:La/wne;

    .line 227
    .line 228
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    if-eqz p0, :cond_9

    .line 232
    .line 233
    sget p0, La/rt70;->z:I

    .line 234
    .line 235
    iget-object p0, v6, La/rt70;->o:La/mne;

    .line 236
    .line 237
    iget-object p1, v6, La/rt70;->x:La/c4m0;

    .line 238
    .line 239
    if-eqz p1, :cond_8

    .line 240
    .line 241
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-ne p1, v5, :cond_8

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_8
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    sget-object v9, La/lt70;->a:La/lt70;

    .line 253
    .line 254
    iget-object v11, p0, La/mne;->a:La/rwj;

    .line 255
    .line 256
    new-instance v12, La/jt70;

    .line 257
    .line 258
    invoke-direct {v12, v6, v7, v3}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 259
    .line 260
    .line 261
    const/16 v13, 0xa

    .line 262
    .line 263
    const/4 v10, 0x0

    .line 264
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 265
    .line 266
    .line 267
    iget-object p1, v6, La/rt70;->q:La/hqx;

    .line 268
    .line 269
    invoke-virtual {p1}, La/hqx;->a()La/p7m0;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    new-instance v0, La/jt70;

    .line 274
    .line 275
    const/4 v1, 0x3

    .line 276
    invoke-direct {v0, v6, v7, v1}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 277
    .line 278
    .line 279
    new-instance v1, La/fnq;

    .line 280
    .line 281
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    iget-object p0, p0, La/mne;->a:La/rwj;

    .line 289
    .line 290
    invoke-static {p1, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    sget-object p1, La/mt70;->h:La/mt70;

    .line 295
    .line 296
    invoke-static {v1, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    iput-object p0, v6, La/rt70;->x:La/c4m0;

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_9
    sget p0, La/rt70;->z:I

    .line 304
    .line 305
    invoke-virtual {v6}, La/rt70;->N()V

    .line 306
    .line 307
    .line 308
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_3
    iget-object v0, v6, La/rt70;->r:La/uq70;

    .line 312
    .line 313
    sget-object v1, La/wne;->a:La/wne;

    .line 314
    .line 315
    iget-boolean v2, p0, La/jt70;->j:Z

    .line 316
    .line 317
    if-eqz v2, :cond_b

    .line 318
    .line 319
    if-ne v2, v5, :cond_a

    .line 320
    .line 321
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    sget-object p1, La/wen;->b:La/uen;

    .line 333
    .line 334
    const-wide/16 v2, 0x2328

    .line 335
    .line 336
    sget-object p1, La/bfn;->d:La/bfn;

    .line 337
    .line 338
    invoke-static {v2, v3, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 339
    .line 340
    .line 341
    move-result-wide v2

    .line 342
    iput-boolean v5, p0, La/jt70;->j:Z

    .line 343
    .line 344
    invoke-static {v2, v3, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    if-ne p0, v1, :cond_c

    .line 349
    .line 350
    move-object v7, v1

    .line 351
    goto :goto_7

    .line 352
    :cond_c
    :goto_6
    invoke-interface {v0}, La/uq70;->g()Z

    .line 353
    .line 354
    .line 355
    move-result p0

    .line 356
    if-nez p0, :cond_d

    .line 357
    .line 358
    invoke-interface {v0}, La/uq70;->f()Z

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-nez p0, :cond_d

    .line 363
    .line 364
    invoke-virtual {v6}, La/rt70;->N()V

    .line 365
    .line 366
    .line 367
    :cond_d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    :goto_7
    return-object v7

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
