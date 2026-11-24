.class public final La/dnq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;

.field public final synthetic c:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/gmq;La/xdr;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dnq;->a:B

    iput-object p1, p0, La/dnq;->b:La/gmq;

    iput-object p2, p0, La/dnq;->c:La/xdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/dnq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/dnq;->c:La/xdr;

    .line 4
    .line 5
    iget-object v2, p0, La/dnq;->b:La/gmq;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La/ooq;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/ooq;

    .line 24
    .line 25
    iget v9, v0, La/ooq;->j:I

    .line 26
    .line 27
    and-int v10, v9, v5

    .line 28
    .line 29
    if-eqz v10, :cond_0

    .line 30
    .line 31
    sub-int/2addr v9, v5

    .line 32
    iput v9, v0, La/ooq;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La/ooq;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La/ooq;-><init>(La/dnq;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La/ooq;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v5, v0, La/ooq;->j:I

    .line 45
    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    if-eq v5, v7, :cond_2

    .line 49
    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_2
    iget v3, v0, La/ooq;->n:I

    .line 61
    .line 62
    iget-object p1, v0, La/ooq;->m:La/mie0;

    .line 63
    .line 64
    iget-object v4, v0, La/ooq;->l:La/kmq;

    .line 65
    .line 66
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p0}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iput-object v8, p0, La/mie0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, v0, La/ooq;->l:La/kmq;

    .line 77
    .line 78
    iput-object p0, v0, La/ooq;->m:La/mie0;

    .line 79
    .line 80
    iput v3, v0, La/ooq;->n:I

    .line 81
    .line 82
    iput v7, v0, La/ooq;->j:I

    .line 83
    .line 84
    invoke-interface {p1, v8, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-ne v4, p2, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move-object v4, p1

    .line 92
    move-object p1, p0

    .line 93
    :goto_1
    new-instance p0, La/pmq;

    .line 94
    .line 95
    invoke-direct {p0, p1, v1, v4, v7}, La/pmq;-><init>(La/mie0;La/xdr;La/kmq;B)V

    .line 96
    .line 97
    .line 98
    iput-object v8, v0, La/ooq;->l:La/kmq;

    .line 99
    .line 100
    iput-object v8, v0, La/ooq;->m:La/mie0;

    .line 101
    .line 102
    iput v3, v0, La/ooq;->n:I

    .line 103
    .line 104
    iput v6, v0, La/ooq;->j:I

    .line 105
    .line 106
    invoke-interface {v2, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, p2, :cond_5

    .line 111
    .line 112
    :goto_2
    move-object v8, p2

    .line 113
    goto :goto_4

    .line 114
    :cond_5
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    :goto_4
    return-object v8

    .line 117
    :pswitch_0
    instance-of v0, p2, La/gnq;

    .line 118
    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    move-object v0, p2

    .line 122
    check-cast v0, La/gnq;

    .line 123
    .line 124
    iget v9, v0, La/gnq;->j:I

    .line 125
    .line 126
    and-int v10, v9, v5

    .line 127
    .line 128
    if-eqz v10, :cond_6

    .line 129
    .line 130
    sub-int/2addr v9, v5

    .line 131
    iput v9, v0, La/gnq;->j:I

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_6
    new-instance v0, La/gnq;

    .line 135
    .line 136
    invoke-direct {v0, p0, p2}, La/gnq;-><init>(La/dnq;La/yje;)V

    .line 137
    .line 138
    .line 139
    :goto_5
    iget-object p0, v0, La/gnq;->i:Ljava/lang/Object;

    .line 140
    .line 141
    sget-object p2, La/wne;->a:La/wne;

    .line 142
    .line 143
    iget v5, v0, La/gnq;->j:I

    .line 144
    .line 145
    if-eqz v5, :cond_9

    .line 146
    .line 147
    if-eq v5, v7, :cond_8

    .line 148
    .line 149
    if-ne v5, v6, :cond_7

    .line 150
    .line 151
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_8
    iget v3, v0, La/gnq;->m:I

    .line 160
    .line 161
    iget-object p1, v0, La/gnq;->l:La/kmq;

    .line 162
    .line 163
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iput-object p1, v0, La/gnq;->l:La/kmq;

    .line 171
    .line 172
    iput v3, v0, La/gnq;->m:I

    .line 173
    .line 174
    iput v7, v0, La/gnq;->j:I

    .line 175
    .line 176
    invoke-static {v2, p1, v0}, La/kpb;->x(La/gmq;La/kmq;La/zje;)Ljava/io/Serializable;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, p2, :cond_a

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_a
    :goto_6
    check-cast p0, Ljava/lang/Throwable;

    .line 184
    .line 185
    if-eqz p0, :cond_b

    .line 186
    .line 187
    iput-object v8, v0, La/gnq;->l:La/kmq;

    .line 188
    .line 189
    iput v3, v0, La/gnq;->m:I

    .line 190
    .line 191
    iput v6, v0, La/gnq;->j:I

    .line 192
    .line 193
    invoke-interface {v1, p1, p0, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, p2, :cond_b

    .line 198
    .line 199
    :goto_7
    move-object v8, p2

    .line 200
    goto :goto_9

    .line 201
    :cond_b
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_9
    return-object v8

    .line 204
    :pswitch_1
    instance-of v0, p2, La/cnq;

    .line 205
    .line 206
    if-eqz v0, :cond_c

    .line 207
    .line 208
    move-object v0, p2

    .line 209
    check-cast v0, La/cnq;

    .line 210
    .line 211
    iget v9, v0, La/cnq;->j:I

    .line 212
    .line 213
    and-int v10, v9, v5

    .line 214
    .line 215
    if-eqz v10, :cond_c

    .line 216
    .line 217
    sub-int/2addr v9, v5

    .line 218
    iput v9, v0, La/cnq;->j:I

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_c
    new-instance v0, La/cnq;

    .line 222
    .line 223
    invoke-direct {v0, p0, p2}, La/cnq;-><init>(La/dnq;La/yje;)V

    .line 224
    .line 225
    .line 226
    :goto_a
    iget-object p0, v0, La/cnq;->i:Ljava/lang/Object;

    .line 227
    .line 228
    sget-object p2, La/wne;->a:La/wne;

    .line 229
    .line 230
    iget v5, v0, La/cnq;->j:I

    .line 231
    .line 232
    const/4 v9, 0x3

    .line 233
    if-eqz v5, :cond_10

    .line 234
    .line 235
    if-eq v5, v7, :cond_f

    .line 236
    .line 237
    if-eq v5, v6, :cond_e

    .line 238
    .line 239
    if-ne v5, v9, :cond_d

    .line 240
    .line 241
    iget-object p1, v0, La/cnq;->m:Ljava/io/Serializable;

    .line 242
    .line 243
    check-cast p1, La/qsg0;

    .line 244
    .line 245
    :try_start_0
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    .line 247
    .line 248
    goto :goto_c

    .line 249
    :catchall_0
    move-exception p0

    .line 250
    goto :goto_d

    .line 251
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_10

    .line 255
    :cond_e
    iget-object p1, v0, La/cnq;->m:Ljava/io/Serializable;

    .line 256
    .line 257
    check-cast p1, Ljava/lang/Throwable;

    .line 258
    .line 259
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_11

    .line 263
    :cond_f
    iget v3, v0, La/cnq;->n:I

    .line 264
    .line 265
    iget-object p1, v0, La/cnq;->l:La/kmq;

    .line 266
    .line 267
    :try_start_1
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 268
    .line 269
    .line 270
    goto :goto_b

    .line 271
    :catchall_1
    move-exception p0

    .line 272
    move-object p1, p0

    .line 273
    goto :goto_e

    .line 274
    :cond_10
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :try_start_2
    iput-object p1, v0, La/cnq;->l:La/kmq;

    .line 278
    .line 279
    iput v3, v0, La/cnq;->n:I

    .line 280
    .line 281
    iput v7, v0, La/cnq;->j:I

    .line 282
    .line 283
    invoke-interface {v2, p1, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 287
    if-ne p0, p2, :cond_11

    .line 288
    .line 289
    goto :goto_f

    .line 290
    :cond_11
    :goto_b
    new-instance p0, La/qsg0;

    .line 291
    .line 292
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-direct {p0, p1, v2}, La/qsg0;-><init>(La/kmq;Lkotlin/coroutines/CoroutineContext;)V

    .line 297
    .line 298
    .line 299
    :try_start_3
    iput-object v8, v0, La/cnq;->l:La/kmq;

    .line 300
    .line 301
    iput-object p0, v0, La/cnq;->m:Ljava/io/Serializable;

    .line 302
    .line 303
    iput v3, v0, La/cnq;->n:I

    .line 304
    .line 305
    iput v9, v0, La/cnq;->j:I

    .line 306
    .line 307
    invoke-interface {v1, p0, v8, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 311
    if-ne p1, p2, :cond_12

    .line 312
    .line 313
    goto :goto_f

    .line 314
    :cond_12
    move-object p1, p0

    .line 315
    :goto_c
    invoke-virtual {p1}, La/zje;->releaseIntercepted()V

    .line 316
    .line 317
    .line 318
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    goto :goto_10

    .line 321
    :catchall_2
    move-exception p1

    .line 322
    move-object v11, p1

    .line 323
    move-object p1, p0

    .line 324
    move-object p0, v11

    .line 325
    :goto_d
    invoke-virtual {p1}, La/zje;->releaseIntercepted()V

    .line 326
    .line 327
    .line 328
    throw p0

    .line 329
    :goto_e
    new-instance p0, La/edq0;

    .line 330
    .line 331
    invoke-direct {p0, p1}, La/edq0;-><init>(Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    iput-object v8, v0, La/cnq;->l:La/kmq;

    .line 335
    .line 336
    iput-object p1, v0, La/cnq;->m:Ljava/io/Serializable;

    .line 337
    .line 338
    iput v3, v0, La/cnq;->n:I

    .line 339
    .line 340
    iput v6, v0, La/cnq;->j:I

    .line 341
    .line 342
    invoke-static {p0, v1, p1, v0}, La/f7k;->V(La/edq0;La/xdr;Ljava/lang/Throwable;La/zje;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    if-ne p0, p2, :cond_13

    .line 347
    .line 348
    :goto_f
    move-object v8, p2

    .line 349
    :goto_10
    return-object v8

    .line 350
    :cond_13
    :goto_11
    throw p1

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
