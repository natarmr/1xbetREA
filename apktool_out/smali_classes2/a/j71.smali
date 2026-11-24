.class public final synthetic La/j71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m71;


# direct methods
.method public synthetic constructor <init>(La/m71;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j71;->a:B

    iput-object p1, p0, La/j71;->b:La/m71;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/j71;->a:B

    .line 2
    .line 3
    const-string v1, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 4
    .line 5
    sget-object v2, La/q61;->a:La/q61;

    .line 6
    .line 7
    const/16 v3, 0x21

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, La/j71;->b:La/m71;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/m71;->e2:La/rek0;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v0, "CHANGE_BALANCE_REQUEST_KEY"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_5

    .line 34
    .line 35
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    if-lt p2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    instance-of p2, p1, La/ql5;

    .line 49
    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    move-object p1, v4

    .line 53
    :cond_2
    check-cast p1, La/ql5;

    .line 54
    .line 55
    :goto_0
    instance-of p2, p1, La/ql5;

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    move-object v4, p1

    .line 60
    check-cast v4, La/ql5;

    .line 61
    .line 62
    :cond_3
    if-eqz v4, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/i61;

    .line 69
    .line 70
    invoke-direct {p1, v4}, La/i61;-><init>(La/ql5;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    :goto_1
    return-void

    .line 85
    :pswitch_0
    sget-object v0, La/m71;->e2:La/rek0;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v0, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY"

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    const-string p2, "GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE"

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance p2, La/p61;

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-direct {p2, p1, v0}, La/p61;-><init>(ZZ)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    const-string p2, "GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT"

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    new-instance p2, La/p61;

    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    invoke-direct {p2, p1, v0}, La/p61;-><init>(ZZ)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    :goto_2
    return-void

    .line 151
    :pswitch_1
    sget-object v0, La/m71;->e2:La/rek0;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 157
    .line 158
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-nez p2, :cond_9

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_e

    .line 170
    .line 171
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 172
    .line 173
    if-lt p2, v3, :cond_a

    .line 174
    .line 175
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    goto :goto_3

    .line 180
    :cond_a
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    instance-of p2, p1, La/ql5;

    .line 185
    .line 186
    if-nez p2, :cond_b

    .line 187
    .line 188
    move-object p1, v4

    .line 189
    :cond_b
    check-cast p1, La/ql5;

    .line 190
    .line 191
    :goto_3
    instance-of p2, p1, La/ql5;

    .line 192
    .line 193
    if-eqz p2, :cond_c

    .line 194
    .line 195
    move-object v4, p1

    .line 196
    check-cast v4, La/ql5;

    .line 197
    .line 198
    :cond_c
    if-eqz v4, :cond_d

    .line 199
    .line 200
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    new-instance p1, La/j61;

    .line 205
    .line 206
    invoke-direct {p1, v4}, La/j61;-><init>(La/ql5;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_d
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_e
    :goto_4
    return-void

    .line 221
    :pswitch_2
    sget-object p1, La/m71;->e2:La/rek0;

    .line 222
    .line 223
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    sget-object p1, La/t61;->a:La/t61;

    .line 231
    .line 232
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_3
    sget-object v0, La/m71;->e2:La/rek0;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    const-string v0, "PLAY_FOR_REAL_DIALOG_KEY"

    .line 242
    .line 243
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    if-nez p2, :cond_f

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_f
    const-string p2, "RESULT_PLAY_FOR_REAL_LISTENER_KEY"

    .line 251
    .line 252
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_14

    .line 257
    .line 258
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 259
    .line 260
    if-lt v1, v3, :cond_10

    .line 261
    .line 262
    invoke-static {p1}, La/c7;->w(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto :goto_5

    .line 267
    :cond_10
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    instance-of p2, p1, La/xw90;

    .line 272
    .line 273
    if-nez p2, :cond_11

    .line 274
    .line 275
    move-object p1, v4

    .line 276
    :cond_11
    check-cast p1, La/xw90;

    .line 277
    .line 278
    :goto_5
    instance-of p2, p1, La/xw90;

    .line 279
    .line 280
    if-eqz p2, :cond_12

    .line 281
    .line 282
    move-object v4, p1

    .line 283
    check-cast v4, La/xw90;

    .line 284
    .line 285
    :cond_12
    if-eqz v4, :cond_13

    .line 286
    .line 287
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    new-instance p2, La/b71;

    .line 292
    .line 293
    invoke-direct {p2, v4}, La/b71;-><init>(La/xw90;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_13
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    new-instance p2, La/b71;

    .line 305
    .line 306
    sget-object v1, La/xw90;->e:La/xw90;

    .line 307
    .line 308
    invoke-direct {p2, v1}, La/b71;-><init>(La/xw90;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :goto_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_14
    :goto_7
    return-void

    .line 322
    :pswitch_4
    sget-object v0, La/m71;->e2:La/rek0;

    .line 323
    .line 324
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    const-string v0, "GAME_NICKNAME_REQUEST_KEY"

    .line 328
    .line 329
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p2

    .line 333
    if-nez p2, :cond_15

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_15
    const-string p2, "RESULT_GAME_NICKNAME_LISTENER_KEY"

    .line 337
    .line 338
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_1a

    .line 343
    .line 344
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 345
    .line 346
    if-lt v1, v3, :cond_16

    .line 347
    .line 348
    invoke-static {p1}, La/c7;->x(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    goto :goto_8

    .line 353
    :cond_16
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    instance-of p2, p1, Ljava/lang/String;

    .line 358
    .line 359
    if-nez p2, :cond_17

    .line 360
    .line 361
    move-object p1, v4

    .line 362
    :cond_17
    check-cast p1, Ljava/lang/String;

    .line 363
    .line 364
    :goto_8
    instance-of p2, p1, Ljava/lang/String;

    .line 365
    .line 366
    if-eqz p2, :cond_18

    .line 367
    .line 368
    move-object v4, p1

    .line 369
    check-cast v4, Ljava/lang/String;

    .line 370
    .line 371
    :cond_18
    if-eqz v4, :cond_19

    .line 372
    .line 373
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    new-instance p2, La/g71;

    .line 378
    .line 379
    invoke-direct {p2, v4}, La/g71;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_19
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-virtual {p1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_1a
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {p1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :goto_9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    :goto_a
    return-void

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
