.class public final synthetic La/inr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/inr;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/inr;->d:I

    iput-object p2, p0, La/inr;->b:Ljava/util/ArrayList;

    iput-object p3, p0, La/inr;->c:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;La/l7m0;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/inr;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/inr;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/inr;->c:La/l7m0;

    iput p3, p0, La/inr;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/inr;->a:B

    .line 2
    .line 3
    const-string v1, "COMPRESSED_CARD_ID"

    .line 4
    .line 5
    const-string v2, "SIMULATION"

    .line 6
    .line 7
    const-string v3, "INDICATOR_ID"

    .line 8
    .line 9
    const-string v4, "CARDS_ID"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    iget v7, p0, La/inr;->d:I

    .line 14
    .line 15
    iget-object v8, p0, La/inr;->c:La/l7m0;

    .line 16
    .line 17
    iget-object p0, p0, La/inr;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    check-cast p1, La/ou90;

    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move v0, v5

    .line 33
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    if-eqz v10, :cond_9

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    check-cast v10, La/pu90;

    .line 44
    .line 45
    invoke-virtual {v10}, La/pu90;->n()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    instance-of v12, v11, La/coc;

    .line 50
    .line 51
    if-eqz v12, :cond_1

    .line 52
    .line 53
    check-cast v11, La/coc;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v11, v6

    .line 57
    :goto_1
    if-eqz v11, :cond_2

    .line 58
    .line 59
    iget-object v11, v11, La/coc;->b:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v11, v6

    .line 63
    :goto_2
    if-eqz v11, :cond_0

    .line 64
    .line 65
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    sparse-switch v12, :sswitch_data_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :sswitch_0
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-nez v11, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {p1, v10, v5, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 81
    .line 82
    .line 83
    iget v10, v10, La/pu90;->b:I

    .line 84
    .line 85
    :goto_3
    add-int/2addr v0, v10

    .line 86
    goto :goto_0

    .line 87
    :sswitch_1
    const-string v12, "CARD_BACKGROUND_ID"

    .line 88
    .line 89
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-nez v11, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    invoke-virtual {p1, v10, v5, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :sswitch_2
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-nez v11, :cond_5

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    check-cast v11, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    add-int/2addr v11, v0

    .line 118
    invoke-virtual {p1, v10, v5, v11, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 119
    .line 120
    .line 121
    iget v0, v10, La/pu90;->b:I

    .line 122
    .line 123
    add-int/2addr v0, v7

    .line 124
    add-int/2addr v0, v11

    .line 125
    goto :goto_0

    .line 126
    :sswitch_3
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-nez v11, :cond_6

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    invoke-virtual {p1, v10, v5, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 134
    .line 135
    .line 136
    iget v10, v10, La/pu90;->b:I

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :sswitch_4
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-nez v11, :cond_7

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_7
    invoke-virtual {p1, v10, v5, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 147
    .line 148
    .line 149
    iget v10, v10, La/pu90;->b:I

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :sswitch_5
    const-string v12, "TAB_ID"

    .line 153
    .line 154
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-nez v11, :cond_8

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    invoke-virtual {p1, v10, v5, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 162
    .line 163
    .line 164
    iget v10, v10, La/pu90;->b:I

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :cond_a
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_14

    .line 182
    .line 183
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, La/pu90;

    .line 188
    .line 189
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    instance-of v11, v10, La/s40;

    .line 194
    .line 195
    if-eqz v11, :cond_b

    .line 196
    .line 197
    check-cast v10, La/s40;

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_b
    move-object v10, v6

    .line 201
    :goto_5
    if-eqz v10, :cond_c

    .line 202
    .line 203
    iget-object v10, v10, La/s40;->b:Ljava/lang/String;

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_c
    move-object v10, v6

    .line 207
    :goto_6
    if-eqz v10, :cond_a

    .line 208
    .line 209
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    sparse-switch v11, :sswitch_data_1

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :sswitch_6
    const-string v11, "BACKGROUND_ID"

    .line 218
    .line 219
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    if-nez v10, :cond_d

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_d
    invoke-virtual {p1, v0, v5, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :sswitch_7
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-nez v10, :cond_e

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_e
    invoke-virtual {p1, v0, v5, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 238
    .line 239
    .line 240
    iget v0, v0, La/pu90;->b:I

    .line 241
    .line 242
    :goto_7
    add-int/2addr v7, v0

    .line 243
    goto :goto_4

    .line 244
    :sswitch_8
    const-string v11, "TOOLBAR_ID"

    .line 245
    .line 246
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-nez v10, :cond_f

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_f
    invoke-virtual {p1, v0, v5, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 254
    .line 255
    .line 256
    iget v0, v0, La/pu90;->b:I

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :sswitch_9
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-nez v10, :cond_10

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_10
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    check-cast v10, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    iget v11, v0, La/pu90;->b:I

    .line 277
    .line 278
    const/4 v12, 0x2

    .line 279
    invoke-static {v10, v11, v12, v7}, La/hne;->d(IIII)I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual {p1, v0, v5, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    check-cast v0, Ljava/lang/Number;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    add-int/2addr v0, v7

    .line 297
    move v7, v0

    .line 298
    goto :goto_4

    .line 299
    :sswitch_a
    const-string v11, "BETTING_ID"

    .line 300
    .line 301
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-nez v10, :cond_11

    .line 306
    .line 307
    goto/16 :goto_4

    .line 308
    .line 309
    :cond_11
    invoke-virtual {p1, v0, v5, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_4

    .line 313
    .line 314
    :sswitch_b
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    if-nez v10, :cond_12

    .line 319
    .line 320
    goto/16 :goto_4

    .line 321
    .line 322
    :cond_12
    invoke-virtual {p1, v0, v5, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 323
    .line 324
    .line 325
    iget v0, v0, La/pu90;->b:I

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :sswitch_c
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-nez v10, :cond_13

    .line 333
    .line 334
    goto/16 :goto_4

    .line 335
    .line 336
    :cond_13
    invoke-virtual {p1, v0, v5, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 337
    .line 338
    .line 339
    iget v0, v0, La/pu90;->b:I

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    :sswitch_data_0
    .sparse-switch
        -0x6cf585db -> :sswitch_5
        -0x42827614 -> :sswitch_4
        -0x3014edf9 -> :sswitch_3
        -0x1368da95 -> :sswitch_2
        0x267f1edd -> :sswitch_1
        0x2e369397 -> :sswitch_0
    .end sparse-switch

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    :sswitch_data_1
    .sparse-switch
        -0x42827614 -> :sswitch_c
        -0x3014edf9 -> :sswitch_b
        -0x1c321d85 -> :sswitch_a
        -0x1368da95 -> :sswitch_9
        0x2068547f -> :sswitch_8
        0x2e369397 -> :sswitch_7
        0x48e075cc -> :sswitch_6
    .end sparse-switch
.end method
