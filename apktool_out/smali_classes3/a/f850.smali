.class public final La/f850;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/p850;

.field public final synthetic l:La/ha8;


# direct methods
.method public synthetic constructor <init>(La/p850;La/ha8;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/f850;->i:B

    iput-object p1, p0, La/f850;->k:La/p850;

    iput-object p2, p0, La/f850;->l:La/ha8;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/f850;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/f850;->l:La/ha8;

    .line 4
    .line 5
    iget-object p0, p0, La/f850;->k:La/p850;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/f850;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/f850;-><init>(La/p850;La/ha8;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/f850;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/f850;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/f850;-><init>(La/p850;La/ha8;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/f850;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/f850;

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-direct {v0, p0, v1, p2, v2}, La/f850;-><init>(La/p850;La/ha8;La/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/f850;->j:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/f850;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v0, p0, v1, p2, v2}, La/f850;-><init>(La/p850;La/ha8;La/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, La/f850;->j:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_3
    new-instance v0, La/f850;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v0, p0, v1, p2, v2}, La/f850;-><init>(La/p850;La/ha8;La/yje;B)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/f850;->j:Ljava/lang/Object;

    .line 53
    .line 54
    return-object v0

    .line 55
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
    iget-byte v0, p0, La/f850;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/w2j;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/f850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/f850;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/f850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/f850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/f850;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/f850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/f850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/f850;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/f850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/f850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/f850;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/f850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/f850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/f850;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/f850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/f850;->i:B

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/f850;->l:La/ha8;

    .line 7
    .line 8
    iget-object v4, p0, La/f850;->k:La/p850;

    .line 9
    .line 10
    iget-object p0, p0, La/f850;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/w2j;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of p1, p0, La/t2j;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, La/xrk;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, p1, v3, p0, v1}, La/xrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    sget p0, La/p850;->p0:I

    .line 40
    .line 41
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    instance-of p0, p0, La/u2j;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p1, La/l750;

    .line 54
    .line 55
    invoke-direct {p1, p0, v3, v1}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 56
    .line 57
    .line 58
    sget p0, La/p850;->p0:I

    .line 59
    .line 60
    invoke-virtual {v4, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v4, p0}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_2

    .line 72
    .line 73
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :goto_0
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance p1, La/l750;

    .line 89
    .line 90
    const/16 v0, 0xa

    .line 91
    .line 92
    invoke-direct {p1, p0, v3, v0}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 93
    .line 94
    .line 95
    sget p0, La/p850;->p0:I

    .line 96
    .line 97
    invoke-virtual {v4, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v4, p0}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_4

    .line 109
    .line 110
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_0
    check-cast p0, Ljava/lang/Throwable;

    .line 124
    .line 125
    sget-object v0, La/wne;->a:La/wne;

    .line 126
    .line 127
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v0, La/b850;

    .line 135
    .line 136
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 137
    .line 138
    .line 139
    sget p1, La/p850;->p0:I

    .line 140
    .line 141
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, v4, La/p850;->h0:La/duj;

    .line 145
    .line 146
    new-instance v0, La/o240;

    .line 147
    .line 148
    const/16 v1, 0x1a

    .line 149
    .line 150
    invoke-direct {v0, v1}, La/o240;-><init>(B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {v4, p0}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_5

    .line 165
    .line 166
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 180
    .line 181
    sget-object v0, La/wne;->a:La/wne;

    .line 182
    .line 183
    invoke-static {p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    move-object v1, v0

    .line 202
    check-cast v1, La/myr0;

    .line 203
    .line 204
    iget-boolean v1, v1, La/myr0;->g:Z

    .line 205
    .line 206
    if-eqz v1, :cond_6

    .line 207
    .line 208
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    const/16 p0, 0x8

    .line 213
    .line 214
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    new-instance v0, La/d850;

    .line 223
    .line 224
    const/4 v1, 0x3

    .line 225
    invoke-direct {v0, v1, p1, p0}, La/d850;-><init>(BLjava/lang/String;Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    sget p0, La/p850;->p0:I

    .line 229
    .line 230
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {v4, p0}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_8

    .line 242
    .line 243
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 244
    .line 245
    .line 246
    :cond_8
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_2
    check-cast p0, Ljava/lang/Throwable;

    .line 257
    .line 258
    sget-object v0, La/wne;->a:La/wne;

    .line 259
    .line 260
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object p1, v4, La/p850;->h0:La/duj;

    .line 264
    .line 265
    new-instance v0, La/o240;

    .line 266
    .line 267
    const/16 v1, 0x19

    .line 268
    .line 269
    invoke-direct {v0, v1}, La/o240;-><init>(B)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    new-instance p1, La/b850;

    .line 280
    .line 281
    const/4 v0, 0x5

    .line 282
    invoke-direct {p1, p0, v0}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_3
    check-cast p0, Ljava/util/List;

    .line 299
    .line 300
    sget-object v0, La/wne;->a:La/wne;

    .line 301
    .line 302
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    new-instance v0, La/d850;

    .line 310
    .line 311
    const/4 v1, 0x1

    .line 312
    invoke-direct {v0, v1, p1, p0}, La/d850;-><init>(BLjava/lang/String;Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    sget p0, La/p850;->p0:I

    .line 316
    .line 317
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-virtual {v4, p0}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    if-eqz p0, :cond_9

    .line 329
    .line 330
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 331
    .line 332
    .line 333
    :cond_9
    invoke-interface {v3}, La/ha8;->getKey()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-virtual {v4, p0}, La/p850;->b0(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
