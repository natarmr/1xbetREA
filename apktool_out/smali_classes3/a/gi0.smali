.class public final synthetic La/gi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:La/kie0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gi0;->a:B

    iput-object p1, p0, La/gi0;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/gi0;->c:Ljava/util/ArrayList;

    iput-object p3, p0, La/gi0;->d:La/kie0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/gi0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/gi0;->d:La/kie0;

    .line 5
    .line 6
    iget-object v3, p0, La/gi0;->c:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, La/gi0;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    check-cast p1, La/ou90;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v5, v1

    .line 24
    :goto_0
    if-ge v5, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, La/pu90;

    .line 31
    .line 32
    iget v7, v2, La/kie0;->a:I

    .line 33
    .line 34
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    move v0, v1

    .line 45
    :goto_1
    if-ge v0, p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/pu90;

    .line 52
    .line 53
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    move v5, v1

    .line 70
    :goto_2
    if-ge v5, v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, La/pu90;

    .line 77
    .line 78
    iget v7, v2, La/kie0;->a:I

    .line 79
    .line 80
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    move v0, v1

    .line 91
    :goto_3
    if-ge v0, p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, La/pu90;

    .line 98
    .line 99
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    move v5, v1

    .line 116
    :goto_4
    if-ge v5, v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, La/pu90;

    .line 123
    .line 124
    iget v7, v2, La/kie0;->a:I

    .line 125
    .line 126
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    move v0, v1

    .line 137
    :goto_5
    if-ge v0, p0, :cond_5

    .line 138
    .line 139
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/pu90;

    .line 144
    .line 145
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v0, v0, 0x1

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    move v5, v1

    .line 162
    :goto_6
    if-ge v5, v0, :cond_6

    .line 163
    .line 164
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    check-cast v6, La/pu90;

    .line 169
    .line 170
    iget v7, v2, La/kie0;->a:I

    .line 171
    .line 172
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v5, v5, 0x1

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    move v0, v1

    .line 183
    :goto_7
    if-ge v0, p0, :cond_7

    .line 184
    .line 185
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, La/pu90;

    .line 190
    .line 191
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v0, v0, 0x1

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    move v5, v1

    .line 208
    :goto_8
    if-ge v5, v0, :cond_8

    .line 209
    .line 210
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    check-cast v6, La/pu90;

    .line 215
    .line 216
    iget v7, v2, La/kie0;->a:I

    .line 217
    .line 218
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 219
    .line 220
    .line 221
    add-int/lit8 v5, v5, 0x1

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    move v0, v1

    .line 229
    :goto_9
    if-ge v0, p0, :cond_9

    .line 230
    .line 231
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, La/pu90;

    .line 236
    .line 237
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 238
    .line 239
    .line 240
    add-int/lit8 v0, v0, 0x1

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    move v5, v1

    .line 254
    :goto_a
    if-ge v5, v0, :cond_a

    .line 255
    .line 256
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    check-cast v6, La/pu90;

    .line 261
    .line 262
    iget v7, v2, La/kie0;->a:I

    .line 263
    .line 264
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 265
    .line 266
    .line 267
    add-int/lit8 v5, v5, 0x1

    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    move v0, v1

    .line 275
    :goto_b
    if-ge v0, p0, :cond_b

    .line 276
    .line 277
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    check-cast v2, La/pu90;

    .line 282
    .line 283
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 284
    .line 285
    .line 286
    add-int/lit8 v0, v0, 0x1

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    move v5, v1

    .line 300
    :goto_c
    if-ge v5, v0, :cond_d

    .line 301
    .line 302
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    check-cast v6, La/pu90;

    .line 307
    .line 308
    iget v7, v2, La/kie0;->a:I

    .line 309
    .line 310
    if-gez v7, :cond_c

    .line 311
    .line 312
    move v7, v1

    .line 313
    :cond_c
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 314
    .line 315
    .line 316
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    goto :goto_c

    .line 319
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    move v0, v1

    .line 324
    :goto_d
    if-ge v0, p0, :cond_e

    .line 325
    .line 326
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, La/pu90;

    .line 331
    .line 332
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 333
    .line 334
    .line 335
    add-int/lit8 v0, v0, 0x1

    .line 336
    .line 337
    goto :goto_d

    .line 338
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    move v5, v1

    .line 349
    :goto_e
    if-ge v5, v0, :cond_f

    .line 350
    .line 351
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    check-cast v6, La/pu90;

    .line 356
    .line 357
    iget v7, v2, La/kie0;->a:I

    .line 358
    .line 359
    invoke-virtual {p1, v6, v1, v7, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 360
    .line 361
    .line 362
    add-int/lit8 v5, v5, 0x1

    .line 363
    .line 364
    goto :goto_e

    .line 365
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    move v0, v1

    .line 370
    :goto_f
    if-ge v0, p0, :cond_10

    .line 371
    .line 372
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, La/pu90;

    .line 377
    .line 378
    invoke-virtual {p1, v2, v1, v1, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 379
    .line 380
    .line 381
    add-int/lit8 v0, v0, 0x1

    .line 382
    .line 383
    goto :goto_f

    .line 384
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object p0

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
