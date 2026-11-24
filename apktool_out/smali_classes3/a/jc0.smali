.class public final La/jc0;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B

.field public final i:La/oeg0;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/oeg0;La/h03;La/uzc0;La/grj;La/pru;La/ctf0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/jc0;->h:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, La/hc0;

    .line 11
    .line 12
    invoke-direct {v1, p5, v0}, La/hc0;-><init>(La/pru;B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v1}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/jc0;->i:La/oeg0;

    .line 19
    .line 20
    iput-object p2, p0, La/jc0;->j:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p3, p0, La/jc0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p4, p0, La/jc0;->l:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p6, p0, La/jc0;->m:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(La/oeg0;La/znt;La/gbi;La/std;La/ouu;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/jc0;->h:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v0, La/bmh;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, La/bmh;-><init>(B)V

    .line 30
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 31
    iput-object p1, p0, La/jc0;->i:La/oeg0;

    .line 32
    iput-object p2, p0, La/jc0;->j:Ljava/lang/Object;

    .line 33
    iput-object p3, p0, La/jc0;->k:Ljava/lang/Object;

    .line 34
    iput-object p4, p0, La/jc0;->l:Ljava/lang/Object;

    .line 35
    iput-object p5, p0, La/jc0;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jc0;->h:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/yfj;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/jc0;->k(La/yfj;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, La/sq5;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, La/jc0;->j(La/sq5;La/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    iget-object p0, p0, La/jc0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ctf0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v1, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 9
    .line 10
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f130690

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "://"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public j(La/sq5;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/ic0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ic0;

    .line 7
    .line 8
    iget v1, v0, La/ic0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ic0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ic0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ic0;-><init>(La/jc0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ic0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ic0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/ic0;->i:La/sq5;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/ic0;->i:La/sq5;

    .line 53
    .line 54
    iput v4, v0, La/ic0;->l:I

    .line 55
    .line 56
    invoke-static {p0, p1, v0}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-ne p2, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    instance-of p2, p1, La/rq5;

    .line 64
    .line 65
    if-eqz p2, :cond_1a

    .line 66
    .line 67
    check-cast p1, La/rq5;

    .line 68
    .line 69
    iget-object p2, p1, La/rq5;->a:La/lr5;

    .line 70
    .line 71
    iget v0, p1, La/rq5;->b:I

    .line 72
    .line 73
    iget-boolean p1, p1, La/rq5;->c:Z

    .line 74
    .line 75
    iget-object v1, p0, La/jc0;->j:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/h03;

    .line 78
    .line 79
    invoke-static {p2}, La/phu0;->U(La/lr5;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v5, p2, La/lr5;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-boolean v6, p2, La/lr5;->j:Z

    .line 86
    .line 87
    iget-object v7, p2, La/lr5;->l:La/or5;

    .line 88
    .line 89
    iget v8, p2, La/lr5;->a:I

    .line 90
    .line 91
    iget-object v9, p2, La/lr5;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p2}, La/phu0;->P(La/lr5;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_5

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-lez p2, :cond_5

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide p1

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    const-wide/high16 p1, -0x8000000000000000L

    .line 117
    .line 118
    :goto_2
    new-instance v0, La/tq5;

    .line 119
    .line 120
    invoke-direct {v0, p1, p2}, La/tq5;-><init>(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_c

    .line 127
    .line 128
    :cond_5
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    const/4 v2, 0x0

    .line 133
    if-lez p2, :cond_6

    .line 134
    .line 135
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-static {v9, p2, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_6

    .line 144
    .line 145
    move p2, v4

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    move p2, v2

    .line 148
    :goto_3
    instance-of v10, v7, La/mr5;

    .line 149
    .line 150
    if-eqz v10, :cond_7

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    if-eqz v6, :cond_8

    .line 154
    .line 155
    if-eqz p2, :cond_8

    .line 156
    .line 157
    move p2, v4

    .line 158
    goto :goto_4

    .line 159
    :cond_8
    move p2, v2

    .line 160
    :goto_4
    iget-object v10, p0, La/jc0;->i:La/oeg0;

    .line 161
    .line 162
    if-eqz p2, :cond_14

    .line 163
    .line 164
    iget-object p1, p0, La/jc0;->l:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, La/grj;

    .line 167
    .line 168
    invoke-virtual {p0, v9}, La/jc0;->i(Ljava/lang/String;)Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    const-string v0, "type"

    .line 173
    .line 174
    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-eqz v0, :cond_9

    .line 179
    .line 180
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 181
    .line 182
    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    move-object v0, v3

    .line 191
    :goto_5
    const-string v5, ""

    .line 192
    .line 193
    if-nez v0, :cond_a

    .line 194
    .line 195
    move-object v0, v5

    .line 196
    :cond_a
    const-string v6, "subtype"

    .line 197
    .line 198
    invoke-virtual {p2, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    if-eqz p2, :cond_b

    .line 203
    .line 204
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 205
    .line 206
    invoke-virtual {p2, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_b
    move-object p2, v3

    .line 215
    :goto_6
    if-nez p2, :cond_c

    .line 216
    .line 217
    move-object p2, v5

    .line 218
    :cond_c
    const-string v7, "iframe"

    .line 219
    .line 220
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_13

    .line 225
    .line 226
    const-string v0, "casinopromo"

    .line 227
    .line 228
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    if-eqz p2, :cond_13

    .line 233
    .line 234
    invoke-virtual {p0, v9}, La/jc0;->i(Ljava/lang/String;)Landroid/net/Uri;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    invoke-virtual {p2, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_d

    .line 243
    .line 244
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 245
    .line 246
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    :cond_d
    if-nez v3, :cond_e

    .line 254
    .line 255
    move-object v3, v5

    .line 256
    :cond_e
    const-string v0, "url"

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    if-nez p2, :cond_f

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_f
    move-object v5, p2

    .line 266
    :goto_7
    const-string p2, "promo"

    .line 267
    .line 268
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-eqz p2, :cond_10

    .line 273
    .line 274
    const-string p2, "/promo-frame/mobile-app/"

    .line 275
    .line 276
    invoke-static {p2, v5}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    const-string v0, "/promo-frame/"

    .line 281
    .line 282
    invoke-static {v0, p2}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    new-array v0, v4, [C

    .line 287
    .line 288
    const/16 v3, 0x2f

    .line 289
    .line 290
    aput-char v3, v0, v2

    .line 291
    .line 292
    invoke-static {p2, v0}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    :cond_10
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    if-nez p2, :cond_11

    .line 301
    .line 302
    invoke-virtual {p1, v9}, La/grj;->a(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_c

    .line 306
    .line 307
    :cond_11
    invoke-virtual {v10}, La/oeg0;->c()La/i1w0;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 315
    .line 316
    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-instance v0, Lorg/xplatform/client1/features/appactivity/AppScreens$PromoWebAggregatorFragmentScreen;

    .line 323
    .line 324
    invoke-direct {v0, v5}, Lorg/xplatform/client1/features/appactivity/AppScreens$PromoWebAggregatorFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 328
    .line 329
    if-eqz v1, :cond_12

    .line 330
    .line 331
    new-instance v1, La/e1w0;

    .line 332
    .line 333
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 334
    .line 335
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 336
    .line 337
    .line 338
    new-instance v0, La/c8d;

    .line 339
    .line 340
    sget-object v3, La/y7d;->a:La/v7d;

    .line 341
    .line 342
    invoke-direct {v0, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_12
    new-instance v1, La/w0w0;

    .line 350
    .line 351
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 352
    .line 353
    .line 354
    new-instance v0, La/c8d;

    .line 355
    .line 356
    sget-object v3, La/y7d;->a:La/v7d;

    .line 357
    .line 358
    invoke-direct {v0, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    :goto_8
    invoke-static {p1, p2, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 365
    .line 366
    .line 367
    move-result-object p2

    .line 368
    :goto_9
    move-object v0, p2

    .line 369
    check-cast v0, La/paw;

    .line 370
    .line 371
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_18

    .line 376
    .line 377
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, La/oe50;

    .line 382
    .line 383
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 384
    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_13
    invoke-virtual {p1, v9}, La/grj;->a(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_c

    .line 391
    .line 392
    :cond_14
    if-eqz v6, :cond_16

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 395
    .line 396
    .line 397
    move-result p2

    .line 398
    if-lez p2, :cond_16

    .line 399
    .line 400
    invoke-virtual {v10}, La/oeg0;->c()La/i1w0;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    invoke-virtual {v1, v5}, La/h03;->z(Ljava/lang/String;)Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 413
    .line 414
    if-eqz v1, :cond_15

    .line 415
    .line 416
    new-instance v1, La/e1w0;

    .line 417
    .line 418
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 419
    .line 420
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 421
    .line 422
    .line 423
    new-instance v0, La/c8d;

    .line 424
    .line 425
    sget-object v3, La/y7d;->a:La/v7d;

    .line 426
    .line 427
    invoke-direct {v0, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    goto :goto_a

    .line 434
    :cond_15
    new-instance v1, La/w0w0;

    .line 435
    .line 436
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 437
    .line 438
    .line 439
    new-instance v0, La/c8d;

    .line 440
    .line 441
    sget-object v3, La/y7d;->a:La/v7d;

    .line 442
    .line 443
    invoke-direct {v0, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    :goto_a
    invoke-static {p1, p2, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    :goto_b
    move-object v0, p2

    .line 454
    check-cast v0, La/paw;

    .line 455
    .line 456
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    if-eqz v1, :cond_18

    .line 461
    .line 462
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, La/oe50;

    .line 467
    .line 468
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 469
    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_16
    if-eqz v7, :cond_19

    .line 473
    .line 474
    instance-of p2, v7, La/nr5;

    .line 475
    .line 476
    if-eqz p2, :cond_17

    .line 477
    .line 478
    new-instance p2, La/uq5;

    .line 479
    .line 480
    check-cast v7, La/nr5;

    .line 481
    .line 482
    iget-object v1, v7, La/nr5;->a:La/kr5;

    .line 483
    .line 484
    invoke-direct {p2, v1, v0, p1}, La/uq5;-><init>(La/kr5;IZ)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_17
    instance-of p2, v7, La/mr5;

    .line 492
    .line 493
    if-eqz p2, :cond_19

    .line 494
    .line 495
    check-cast v7, La/mr5;

    .line 496
    .line 497
    iget-object p2, v7, La/mr5;->a:La/uvc;

    .line 498
    .line 499
    invoke-virtual {v10}, La/oeg0;->c()La/i1w0;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    new-instance v2, La/gc0;

    .line 504
    .line 505
    invoke-direct {v2, p0, p2, v0, p1}, La/gc0;-><init>(La/jc0;La/uvc;IZ)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 509
    .line 510
    .line 511
    :cond_18
    :goto_c
    new-instance p1, La/vq5;

    .line 512
    .line 513
    invoke-direct {p1, v8}, La/vq5;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 521
    .line 522
    .line 523
    return-object v3

    .line 524
    :cond_1a
    sget-object p2, La/qq5;->a:La/qq5;

    .line 525
    .line 526
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    if-eqz p1, :cond_1b

    .line 531
    .line 532
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 533
    .line 534
    .line 535
    :goto_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object p0

    .line 538
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 539
    .line 540
    .line 541
    return-object v3
.end method

.method public k(La/yfj;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/zfj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/zfj;

    .line 7
    .line 8
    iget v1, v0, La/zfj;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/zfj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zfj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/zfj;-><init>(La/jc0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/zfj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zfj;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v3, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v6

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget-object p1, v0, La/zfj;->i:La/yfj;

    .line 58
    .line 59
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v0, La/zfj;->i:La/yfj;

    .line 67
    .line 68
    iput v3, v0, La/zfj;->l:I

    .line 69
    .line 70
    invoke-static {p0, p1, v0}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_1
    sget-object p2, La/wfj;->a:La/wfj;

    .line 78
    .line 79
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_7

    .line 84
    .line 85
    iput-object v6, v0, La/zfj;->i:La/yfj;

    .line 86
    .line 87
    iput v5, v0, La/zfj;->l:I

    .line 88
    .line 89
    invoke-virtual {p0, v0}, La/jc0;->m(La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-ne p0, v1, :cond_6

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_7
    instance-of p2, p1, La/sfj;

    .line 100
    .line 101
    if-eqz p2, :cond_9

    .line 102
    .line 103
    check-cast p1, La/sfj;

    .line 104
    .line 105
    iget-wide p1, p1, La/sfj;->a:J

    .line 106
    .line 107
    iput-object v6, v0, La/zfj;->i:La/yfj;

    .line 108
    .line 109
    iput v4, v0, La/zfj;->l:I

    .line 110
    .line 111
    invoke-virtual {p0, p1, p2, v0}, La/jc0;->l(JLa/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v1, :cond_8

    .line 116
    .line 117
    :goto_3
    return-object v1

    .line 118
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_9
    instance-of p2, p1, La/tfj;

    .line 122
    .line 123
    if-eqz p2, :cond_a

    .line 124
    .line 125
    check-cast p1, La/tfj;

    .line 126
    .line 127
    iget-boolean p1, p1, La/tfj;->a:Z

    .line 128
    .line 129
    iget-object p2, p0, La/jc0;->i:La/oeg0;

    .line 130
    .line 131
    invoke-virtual {p2}, La/oeg0;->c()La/i1w0;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    new-instance v0, La/x9;

    .line 136
    .line 137
    const/16 v1, 0xd

    .line 138
    .line 139
    invoke-direct {v0, p0, p1, v1}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_5

    .line 146
    .line 147
    :cond_a
    sget-object p2, La/ufj;->a:La/ufj;

    .line 148
    .line 149
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_b

    .line 154
    .line 155
    iget-object p0, p0, La/jc0;->m:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, La/ouu;

    .line 158
    .line 159
    new-instance p1, La/xa50;

    .line 160
    .line 161
    invoke-direct {p1}, La/xa50;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p1, v3}, La/ouu;->q(La/cb50;Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_b
    instance-of p2, p1, La/vfj;

    .line 169
    .line 170
    if-eqz p2, :cond_f

    .line 171
    .line 172
    check-cast p1, La/vfj;

    .line 173
    .line 174
    iget-wide p1, p1, La/vfj;->a:J

    .line 175
    .line 176
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/hgj;

    .line 181
    .line 182
    iget-object v0, v0, La/hgj;->a:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_d

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    move-object v2, v1

    .line 199
    check-cast v2, La/bhj;

    .line 200
    .line 201
    iget-wide v2, v2, La/bhj;->a:J

    .line 202
    .line 203
    cmp-long v2, v2, p1

    .line 204
    .line 205
    if-nez v2, :cond_c

    .line 206
    .line 207
    move-object v6, v1

    .line 208
    :cond_d
    check-cast v6, La/bhj;

    .line 209
    .line 210
    if-nez v6, :cond_e

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_e
    new-instance p1, La/egj;

    .line 214
    .line 215
    invoke-direct {p1, v6}, La/egj;-><init>(La/bhj;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_f
    sget-object p2, La/qfj;->a:La/qfj;

    .line 223
    .line 224
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_10

    .line 229
    .line 230
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 231
    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_10
    instance-of p2, p1, La/rfj;

    .line 235
    .line 236
    if-eqz p2, :cond_12

    .line 237
    .line 238
    iget-object p0, p0, La/x2t0;->b:La/ocj;

    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 244
    .line 245
    :cond_11
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    move-object v0, p2

    .line 250
    check-cast v0, La/hgj;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-object v1, p1

    .line 256
    check-cast v1, La/rfj;

    .line 257
    .line 258
    iget-object v1, v1, La/rfj;->a:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-static {v0, v1, v6, v5}, La/hgj;->a(La/hgj;Ljava/util/ArrayList;Ljava/util/List;I)La/hgj;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {p0, p2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    if-eqz p2, :cond_11

    .line 269
    .line 270
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 274
    .line 275
    .line 276
    return-object v6
.end method

.method public l(JLa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    instance-of v4, v3, La/agj;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/agj;

    .line 13
    .line 14
    iget v5, v4, La/agj;->m:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, La/agj;->m:I

    .line 24
    .line 25
    :goto_0
    move-object v10, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v4, La/agj;

    .line 28
    .line 29
    invoke-direct {v4, v0, v3}, La/agj;-><init>(La/jc0;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v3, v10, La/agj;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v10, La/agj;->m:I

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x1

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    if-eq v5, v8, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_a

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    iget-wide v1, v10, La/agj;->i:J

    .line 60
    .line 61
    iget-object v5, v10, La/agj;->j:La/bhj;

    .line 62
    .line 63
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, La/hgj;

    .line 75
    .line 76
    iget-object v3, v3, La/hgj;->a:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_5

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    move-object v9, v5

    .line 93
    check-cast v9, La/bhj;

    .line 94
    .line 95
    iget-wide v11, v9, La/bhj;->a:J

    .line 96
    .line 97
    cmp-long v9, v11, v1

    .line 98
    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move-object v5, v7

    .line 103
    :goto_2
    check-cast v5, La/bhj;

    .line 104
    .line 105
    if-nez v5, :cond_6

    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_6
    iget-object v3, v0, La/jc0;->j:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, La/znt;

    .line 113
    .line 114
    iput-object v5, v10, La/agj;->j:La/bhj;

    .line 115
    .line 116
    iput-wide v1, v10, La/agj;->i:J

    .line 117
    .line 118
    iput v8, v10, La/agj;->m:I

    .line 119
    .line 120
    iget-object v3, v3, La/znt;->a:La/chf0;

    .line 121
    .line 122
    invoke-virtual {v3, v10}, La/chf0;->D(La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-ne v3, v4, :cond_7

    .line 127
    .line 128
    goto/16 :goto_9

    .line 129
    .line 130
    :cond_7
    :goto_3
    check-cast v3, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    const-wide/16 v13, 0x0

    .line 137
    .line 138
    cmp-long v3, v11, v13

    .line 139
    .line 140
    if-nez v3, :cond_e

    .line 141
    .line 142
    iget-object v3, v0, La/jc0;->k:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, La/gbi;

    .line 145
    .line 146
    iget-object v5, v5, La/bhj;->d:Ljava/util/List;

    .line 147
    .line 148
    new-instance v9, Ljava/util/ArrayList;

    .line 149
    .line 150
    const/16 v11, 0xa

    .line 151
    .line 152
    invoke-static {v5, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_9

    .line 168
    .line 169
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    check-cast v12, La/qhj;

    .line 174
    .line 175
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    check-cast v15, La/qhj;

    .line 180
    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    if-eqz v15, :cond_8

    .line 184
    .line 185
    iget-boolean v15, v15, La/qhj;->A:Z

    .line 186
    .line 187
    if-ne v15, v8, :cond_8

    .line 188
    .line 189
    move v15, v8

    .line 190
    goto :goto_5

    .line 191
    :cond_8
    move/from16 v15, v16

    .line 192
    .line 193
    :goto_5
    invoke-static {v12, v15}, La/vfc;->M(La/qhj;Z)La/jwe;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    sget-object v8, La/gwe;->s:La/gwe;

    .line 202
    .line 203
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-eqz v11, :cond_b

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    move-object v12, v11

    .line 218
    check-cast v12, La/qhj;

    .line 219
    .line 220
    move-wide/from16 p1, v13

    .line 221
    .line 222
    iget-wide v13, v12, La/qhj;->s:J

    .line 223
    .line 224
    cmp-long v12, v13, p1

    .line 225
    .line 226
    if-eqz v12, :cond_a

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_a
    move-wide/from16 v13, p1

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_b
    move-wide/from16 p1, v13

    .line 233
    .line 234
    move-object v11, v7

    .line 235
    :goto_7
    check-cast v11, La/qhj;

    .line 236
    .line 237
    if-eqz v11, :cond_c

    .line 238
    .line 239
    iget-wide v13, v11, La/qhj;->s:J

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_c
    move-wide/from16 v13, p1

    .line 243
    .line 244
    :goto_8
    iput-object v7, v10, La/agj;->j:La/bhj;

    .line 245
    .line 246
    iput-wide v1, v10, La/agj;->i:J

    .line 247
    .line 248
    iput v6, v10, La/agj;->m:I

    .line 249
    .line 250
    move-object v5, v3

    .line 251
    move-object v7, v8

    .line 252
    move-object v6, v9

    .line 253
    move-wide v8, v13

    .line 254
    invoke-virtual/range {v5 .. v10}, La/gbi;->B(Ljava/util/ArrayList;La/gwe;JLa/zje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    if-ne v1, v4, :cond_d

    .line 259
    .line 260
    :goto_9
    return-object v4

    .line 261
    :cond_d
    :goto_a
    sget-object v1, La/fgj;->a:La/fgj;

    .line 262
    .line 263
    invoke-virtual {v0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_b

    .line 267
    :cond_e
    iget-object v1, v0, La/x2t0;->b:La/ocj;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 273
    .line 274
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    move-object v3, v2

    .line 279
    check-cast v3, La/hgj;

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object v4, v5, La/bhj;->d:Ljava/util/List;

    .line 285
    .line 286
    invoke-static {v3, v7, v4, v8}, La/hgj;->a(La/hgj;Ljava/util/ArrayList;Ljava/util/List;I)La/hgj;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_f

    .line 295
    .line 296
    sget-object v1, La/fgj;->b:La/fgj;

    .line 297
    .line 298
    invoke-virtual {v0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0
.end method

.method public m(La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, La/bgj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/bgj;

    .line 7
    .line 8
    iget v1, v0, La/bgj;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/bgj;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/bgj;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/bgj;-><init>(La/jc0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, La/bgj;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/bgj;->k:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/hgj;

    .line 58
    .line 59
    iget-object p1, p1, La/hgj;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/qhj;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget-boolean v1, v1, La/qhj;->A:Z

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    const/4 v1, 0x0

    .line 73
    :goto_2
    iget-object v4, p0, La/jc0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, La/gbi;

    .line 76
    .line 77
    move-object v5, v2

    .line 78
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    const/16 v7, 0xa

    .line 81
    .line 82
    invoke-static {p1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, La/qhj;

    .line 104
    .line 105
    invoke-static {v8, v1}, La/vfc;->M(La/qhj;Z)La/jwe;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    sget-object v1, La/gwe;->s:La/gwe;

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    const-wide/16 v8, 0x0

    .line 124
    .line 125
    if-eqz v7, :cond_6

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    move-object v10, v7

    .line 132
    check-cast v10, La/qhj;

    .line 133
    .line 134
    iget-wide v10, v10, La/qhj;->s:J

    .line 135
    .line 136
    cmp-long v10, v10, v8

    .line 137
    .line 138
    if-eqz v10, :cond_5

    .line 139
    .line 140
    move-object v5, v7

    .line 141
    :cond_6
    check-cast v5, La/qhj;

    .line 142
    .line 143
    if-eqz v5, :cond_7

    .line 144
    .line 145
    iget-wide v8, v5, La/qhj;->s:J

    .line 146
    .line 147
    :cond_7
    iput v3, v6, La/bgj;->k:I

    .line 148
    .line 149
    move-object v3, v1

    .line 150
    move-object v1, v4

    .line 151
    move-wide v4, v8

    .line 152
    invoke-virtual/range {v1 .. v6}, La/gbi;->B(Ljava/util/ArrayList;La/gwe;JLa/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne p1, v0, :cond_8

    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_8
    :goto_4
    sget-object p1, La/fgj;->a:La/fgj;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0
.end method
