.class public final synthetic La/p8r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:La/sff0;

.field public final synthetic f:Ljava/util/Map;

.field public final synthetic g:I

.field public final synthetic h:La/vh0;


# direct methods
.method public synthetic constructor <init>(ZZJILa/sff0;Ljava/util/Map;ILa/vh0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/p8r0;->a:Z

    iput-boolean p2, p0, La/p8r0;->b:Z

    iput-wide p3, p0, La/p8r0;->c:J

    iput p5, p0, La/p8r0;->d:I

    iput-object p6, p0, La/p8r0;->e:La/sff0;

    iput-object p7, p0, La/p8r0;->f:Ljava/util/Map;

    iput p8, p0, La/p8r0;->g:I

    iput-object p9, p0, La/p8r0;->h:La/vh0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/iz30;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    iget-boolean v2, p0, La/p8r0;->b:Z

    .line 13
    .line 14
    iget-object v3, p0, La/p8r0;->e:La/sff0;

    .line 15
    .line 16
    if-eq v0, v1, :cond_13

    .line 17
    .line 18
    const/16 v1, 0x15

    .line 19
    .line 20
    if-eq v0, v1, :cond_12

    .line 21
    .line 22
    const/16 v1, 0x18

    .line 23
    .line 24
    if-eq v0, v1, :cond_11

    .line 25
    .line 26
    const/16 v1, 0x27

    .line 27
    .line 28
    if-eq v0, v1, :cond_10

    .line 29
    .line 30
    const/16 v1, 0x32

    .line 31
    .line 32
    if-eq v0, v1, :cond_f

    .line 33
    .line 34
    const/16 v1, 0x3d

    .line 35
    .line 36
    if-eq v0, v1, :cond_e

    .line 37
    .line 38
    const/16 v1, 0x20

    .line 39
    .line 40
    const-string v4, ""

    .line 41
    .line 42
    if-eq v0, v1, :cond_c

    .line 43
    .line 44
    const/16 v1, 0x21

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    const/4 v6, 0x0

    .line 48
    const-string v7, "/"

    .line 49
    .line 50
    const-string v8, "https://"

    .line 51
    .line 52
    const/16 v9, 0x2f

    .line 53
    .line 54
    if-eq v0, v1, :cond_8

    .line 55
    .line 56
    const/16 v1, 0x2e

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    if-eq v0, v9, :cond_6

    .line 61
    .line 62
    const/16 v1, 0x41

    .line 63
    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    const/16 v1, 0x42

    .line 67
    .line 68
    if-eq v0, v1, :cond_1

    .line 69
    .line 70
    packed-switch v0, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    new-instance p0, La/sx10;

    .line 74
    .line 75
    invoke-direct {p0, p1, v2}, La/sx10;-><init>(La/iz30;Z)V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    new-instance v0, La/lx10;

    .line 80
    .line 81
    iget-object p0, p0, La/p8r0;->f:Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/String;

    .line 88
    .line 89
    if-nez p0, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    move-object v4, p0

    .line 93
    :goto_0
    invoke-direct {v0, p1, v4, v2}, La/lx10;-><init>(La/iz30;Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_1
    new-instance p0, La/qx10;

    .line 98
    .line 99
    invoke-direct {p0, p1}, La/qx10;-><init>(La/iz30;)V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    new-instance p0, La/rx10;

    .line 104
    .line 105
    invoke-direct {p0, p1}, La/rx10;-><init>(La/iz30;)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_1
    new-instance p0, La/ox10;

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 119
    .line 120
    const-string v2, "/static/img/ImgDefault/Polybet/polybet_menu_cell.png"

    .line 121
    .line 122
    invoke-static {v2, v1, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_4

    .line 127
    .line 128
    invoke-static {v2, v8, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-lez v1, :cond_3

    .line 140
    .line 141
    invoke-static {v0, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_3

    .line 146
    .line 147
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    :cond_3
    new-array v1, v5, [C

    .line 151
    .line 152
    aput-char v9, v1, v6

    .line 153
    .line 154
    invoke-static {v2, v1}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-direct {p0, p1, v0}, La/ox10;-><init>(La/iz30;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_5
    new-instance p0, La/vx10;

    .line 177
    .line 178
    invoke-direct {p0, p1}, La/vx10;-><init>(La/iz30;)V

    .line 179
    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_6
    new-instance p0, La/kx10;

    .line 183
    .line 184
    invoke-direct {p0, p1}, La/kx10;-><init>(La/iz30;)V

    .line 185
    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_7
    new-instance v0, La/px10;

    .line 189
    .line 190
    iget-object v1, v3, La/sff0;->l:La/toc0;

    .line 191
    .line 192
    iget-boolean v1, v1, La/toc0;->c:Z

    .line 193
    .line 194
    iget p0, p0, La/p8r0;->d:I

    .line 195
    .line 196
    invoke-direct {v0, p1, p0, v1}, La/px10;-><init>(La/iz30;IZ)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_8
    new-instance p0, La/wx10;

    .line 201
    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 210
    .line 211
    const-string v2, "/static/img/ImgDefault/MMA/UFC/Menu_Button.png"

    .line 212
    .line 213
    invoke-static {v2, v1, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-nez v1, :cond_b

    .line 218
    .line 219
    invoke-static {v2, v8, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_9

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-lez v1, :cond_a

    .line 231
    .line 232
    invoke-static {v0, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_a

    .line 237
    .line 238
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    :cond_a
    new-array v1, v5, [C

    .line 242
    .line 243
    aput-char v9, v1, v6

    .line 244
    .line 245
    invoke-static {v2, v1}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_b
    :goto_3
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    :goto_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {p0, p1, v0}, La/wx10;-><init>(La/iz30;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-object p0

    .line 267
    :cond_c
    new-instance p0, La/mx10;

    .line 268
    .line 269
    iget-object v0, v3, La/sff0;->c:La/ech;

    .line 270
    .line 271
    iget v0, v0, La/ech;->n:I

    .line 272
    .line 273
    if-eqz v0, :cond_d

    .line 274
    .line 275
    new-instance v1, La/bzu;

    .line 276
    .line 277
    const/16 v2, 0x17

    .line 278
    .line 279
    invoke-direct {v1, v2}, La/bzu;-><init>(B)V

    .line 280
    .line 281
    .line 282
    const-string v2, "static"

    .line 283
    .line 284
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    const-string v2, "img"

    .line 288
    .line 289
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-string v2, "ImgDefault"

    .line 293
    .line 294
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const-string v2, "Esports"

    .line 298
    .line 299
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const-string v2, "ButtonImage"

    .line 303
    .line 304
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    new-instance v2, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v0, ".png"

    .line 316
    .line 317
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v1, v0}, La/bzu;->g(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    iget-object v0, v1, La/bzu;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    :cond_d
    invoke-direct {p0, p1, v4}, La/mx10;-><init>(La/iz30;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-object p0

    .line 339
    :cond_e
    new-instance p1, La/gx10;

    .line 340
    .line 341
    sget-object v0, La/iz30;->A:La/iz30;

    .line 342
    .line 343
    iget-object p0, p0, La/p8r0;->h:La/vh0;

    .line 344
    .line 345
    invoke-direct {p1, v0, p0}, La/gx10;-><init>(La/iz30;La/vh0;)V

    .line 346
    .line 347
    .line 348
    return-object p1

    .line 349
    :cond_f
    new-instance p0, La/ux10;

    .line 350
    .line 351
    invoke-direct {p0, p1}, La/ux10;-><init>(La/iz30;)V

    .line 352
    .line 353
    .line 354
    return-object p0

    .line 355
    :cond_10
    new-instance v0, La/ix10;

    .line 356
    .line 357
    iget-wide v1, p0, La/p8r0;->c:J

    .line 358
    .line 359
    invoke-direct {v0, p1, v1, v2}, La/ix10;-><init>(La/iz30;J)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :cond_11
    new-instance v0, La/hx10;

    .line 364
    .line 365
    iget-boolean p0, p0, La/p8r0;->a:Z

    .line 366
    .line 367
    invoke-direct {v0, p1, p0, v2}, La/hx10;-><init>(La/iz30;ZZ)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :cond_12
    new-instance v0, La/xx10;

    .line 372
    .line 373
    iget p0, p0, La/p8r0;->g:I

    .line 374
    .line 375
    invoke-direct {v0, p1, p0}, La/xx10;-><init>(La/iz30;I)V

    .line 376
    .line 377
    .line 378
    return-object v0

    .line 379
    :cond_13
    new-instance p0, La/lx10;

    .line 380
    .line 381
    iget-object v0, v3, La/sff0;->d:La/q1w0;

    .line 382
    .line 383
    iget-object v0, v0, La/q1w0;->a:La/dyv0;

    .line 384
    .line 385
    iget-object v0, v0, La/dyv0;->b:Ljava/lang/String;

    .line 386
    .line 387
    invoke-direct {p0, p1, v0, v2}, La/lx10;-><init>(La/iz30;Ljava/lang/String;Z)V

    .line 388
    .line 389
    .line 390
    return-object p0

    .line 391
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
