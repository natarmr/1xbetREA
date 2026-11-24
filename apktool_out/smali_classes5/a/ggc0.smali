.class public final La/ggc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/k3t0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ggc0;->a:B

    iput-object p1, p0, La/ggc0;->b:La/vne;

    iput-object p2, p0, La/ggc0;->c:La/k3t0;

    iput-object p3, p0, La/ggc0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ggc0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/16 v3, 0xf

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    iget-object v5, p0, La/ggc0;->d:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v6, p0, La/ggc0;->c:La/k3t0;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    iget-object p0, p0, La/ggc0;->b:La/vne;

    .line 17
    .line 18
    const/4 v8, 0x3

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p1, La/lwk;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p1, La/egc0;

    .line 28
    .line 29
    invoke-direct {p1, v6, v5, v7, v4}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance p1, La/fgc0;

    .line 37
    .line 38
    const/16 v0, 0x11

    .line 39
    .line 40
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    check-cast p1, La/lwk;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p1, La/egc0;

    .line 50
    .line 51
    invoke-direct {p1, v6, v5, v7, v3}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, La/fgc0;

    .line 59
    .line 60
    invoke-direct {p1, p0, v4}, La/fgc0;-><init>(La/c4m0;B)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_1
    check-cast p1, La/lwk;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p1, La/egc0;

    .line 70
    .line 71
    invoke-direct {p1, v6, v5, v7, v2}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance p1, La/fgc0;

    .line 79
    .line 80
    invoke-direct {p1, p0, v3}, La/fgc0;-><init>(La/c4m0;B)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_2
    check-cast p1, La/lwk;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance p1, La/egc0;

    .line 90
    .line 91
    invoke-direct {p1, v6, v5, v7, v1}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance p1, La/fgc0;

    .line 99
    .line 100
    invoke-direct {p1, p0, v2}, La/fgc0;-><init>(La/c4m0;B)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :pswitch_3
    check-cast p1, La/lwk;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p1, La/egc0;

    .line 110
    .line 111
    const/16 v0, 0xc

    .line 112
    .line 113
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, La/fgc0;

    .line 121
    .line 122
    invoke-direct {p1, p0, v1}, La/fgc0;-><init>(La/c4m0;B)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_4
    check-cast p1, La/lwk;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance p1, La/egc0;

    .line 132
    .line 133
    const/16 v0, 0xb

    .line 134
    .line 135
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance p1, La/fgc0;

    .line 143
    .line 144
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :pswitch_5
    check-cast p1, La/lwk;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance p1, La/egc0;

    .line 154
    .line 155
    const/16 v0, 0xa

    .line 156
    .line 157
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    new-instance p1, La/fgc0;

    .line 165
    .line 166
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 167
    .line 168
    .line 169
    return-object p1

    .line 170
    :pswitch_6
    check-cast p1, La/lwk;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance p1, La/egc0;

    .line 176
    .line 177
    const/16 v0, 0x9

    .line 178
    .line 179
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    new-instance p1, La/fgc0;

    .line 187
    .line 188
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_7
    check-cast p1, La/lwk;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance p1, La/egc0;

    .line 198
    .line 199
    const/16 v0, 0x8

    .line 200
    .line 201
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    new-instance p1, La/fgc0;

    .line 209
    .line 210
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 211
    .line 212
    .line 213
    return-object p1

    .line 214
    :pswitch_8
    check-cast p1, La/lwk;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance p1, La/egc0;

    .line 220
    .line 221
    const/4 v0, 0x7

    .line 222
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 223
    .line 224
    .line 225
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    new-instance p1, La/fgc0;

    .line 230
    .line 231
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 232
    .line 233
    .line 234
    return-object p1

    .line 235
    :pswitch_9
    check-cast p1, La/lwk;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance p1, La/egc0;

    .line 241
    .line 242
    const/4 v0, 0x6

    .line 243
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 244
    .line 245
    .line 246
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    new-instance p1, La/fgc0;

    .line 251
    .line 252
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 253
    .line 254
    .line 255
    return-object p1

    .line 256
    :pswitch_a
    check-cast p1, La/lwk;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance p1, La/egc0;

    .line 262
    .line 263
    const/4 v0, 0x5

    .line 264
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 265
    .line 266
    .line 267
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    new-instance p1, La/fgc0;

    .line 272
    .line 273
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 274
    .line 275
    .line 276
    return-object p1

    .line 277
    :pswitch_b
    check-cast p1, La/lwk;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance p1, La/egc0;

    .line 283
    .line 284
    const/4 v0, 0x4

    .line 285
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 286
    .line 287
    .line 288
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    new-instance p1, La/fgc0;

    .line 293
    .line 294
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 295
    .line 296
    .line 297
    return-object p1

    .line 298
    :pswitch_c
    check-cast p1, La/lwk;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance p1, La/egc0;

    .line 304
    .line 305
    invoke-direct {p1, v6, v5, v7, v8}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 306
    .line 307
    .line 308
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    new-instance p1, La/fgc0;

    .line 313
    .line 314
    invoke-direct {p1, p0, v8}, La/fgc0;-><init>(La/c4m0;B)V

    .line 315
    .line 316
    .line 317
    return-object p1

    .line 318
    :pswitch_d
    check-cast p1, La/lwk;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    new-instance p1, La/egc0;

    .line 324
    .line 325
    const/4 v0, 0x2

    .line 326
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 327
    .line 328
    .line 329
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    new-instance p1, La/fgc0;

    .line 334
    .line 335
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 336
    .line 337
    .line 338
    return-object p1

    .line 339
    :pswitch_e
    check-cast p1, La/lwk;

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    new-instance p1, La/egc0;

    .line 345
    .line 346
    const/4 v0, 0x1

    .line 347
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 348
    .line 349
    .line 350
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    new-instance p1, La/fgc0;

    .line 355
    .line 356
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 357
    .line 358
    .line 359
    return-object p1

    .line 360
    :pswitch_f
    check-cast p1, La/lwk;

    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    new-instance p1, La/egc0;

    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    invoke-direct {p1, v6, v5, v7, v0}, La/egc0;-><init>(La/k3t0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 369
    .line 370
    .line 371
    invoke-static {p0, v7, v7, p1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    new-instance p1, La/fgc0;

    .line 376
    .line 377
    invoke-direct {p1, p0, v0}, La/fgc0;-><init>(La/c4m0;B)V

    .line 378
    .line 379
    .line 380
    return-object p1

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
