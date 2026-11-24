.class public final La/q3v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r3v0;


# direct methods
.method public synthetic constructor <init>(La/r3v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q3v0;->a:B

    iput-object p1, p0, La/q3v0;->b:La/r3v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/q3v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q3v0;->b:La/r3v0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 15
    .line 16
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 22
    .line 23
    sget-object v2, La/zv70;->Companion:La/yv70;

    .line 24
    .line 25
    invoke-virtual {v2}, La/yv70;->serializer()La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/jiy;

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/wxw;

    .line 40
    .line 41
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 46
    .line 47
    new-instance p1, La/g0g0;

    .line 48
    .line 49
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p0, p1

    .line 53
    :goto_0
    nop

    .line 54
    instance-of p1, p0, La/g0g0;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    move-object p0, v1

    .line 59
    :cond_0
    if-eqz p0, :cond_2

    .line 60
    .line 61
    check-cast p0, La/zv70;

    .line 62
    .line 63
    iget-object p0, p0, La/zv70;->a:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    const-string p1, "type="

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :cond_1
    const-string p0, "://open/betonyournationalteam?"

    .line 74
    .line 75
    invoke-static {p0, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_2
    return-object v1

    .line 80
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 86
    .line 87
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 93
    .line 94
    sget-object v2, La/mx70;->Companion:La/lx70;

    .line 95
    .line 96
    invoke-virtual {v2}, La/lx70;->serializer()La/jiy;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/jiy;

    .line 105
    .line 106
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/wxw;

    .line 111
    .line 112
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_1
    move-exception p0

    .line 116
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 117
    .line 118
    new-instance p1, La/g0g0;

    .line 119
    .line 120
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object p0, p1

    .line 124
    :goto_1
    nop

    .line 125
    instance-of p1, p0, La/g0g0;

    .line 126
    .line 127
    if-eqz p1, :cond_3

    .line 128
    .line 129
    move-object p0, v1

    .line 130
    :cond_3
    if-eqz p0, :cond_4

    .line 131
    .line 132
    check-cast p0, La/mx70;

    .line 133
    .line 134
    invoke-static {p0}, La/m8x;->m0(La/mx70;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    :cond_4
    return-object v1

    .line 139
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 145
    .line 146
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 152
    .line 153
    sget-object v2, La/mv70;->Companion:La/lv70;

    .line 154
    .line 155
    invoke-virtual {v2}, La/lv70;->serializer()La/jiy;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, La/jiy;

    .line 164
    .line 165
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, La/wxw;

    .line 170
    .line 171
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :catchall_2
    move-exception p0

    .line 175
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 176
    .line 177
    new-instance p1, La/g0g0;

    .line 178
    .line 179
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    move-object p0, p1

    .line 183
    :goto_2
    nop

    .line 184
    instance-of p1, p0, La/g0g0;

    .line 185
    .line 186
    if-eqz p1, :cond_5

    .line 187
    .line 188
    move-object p0, v1

    .line 189
    :cond_5
    if-eqz p0, :cond_6

    .line 190
    .line 191
    check-cast p0, La/mv70;

    .line 192
    .line 193
    invoke-static {p0}, La/u7x;->I(La/mv70;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    :cond_6
    return-object v1

    .line 198
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 204
    .line 205
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 211
    .line 212
    sget-object v2, La/sw70;->Companion:La/rw70;

    .line 213
    .line 214
    invoke-virtual {v2}, La/rw70;->serializer()La/jiy;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, La/jiy;

    .line 223
    .line 224
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, La/wxw;

    .line 229
    .line 230
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :catchall_3
    move-exception p0

    .line 234
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 235
    .line 236
    new-instance p1, La/g0g0;

    .line 237
    .line 238
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    move-object p0, p1

    .line 242
    :goto_3
    nop

    .line 243
    instance-of p1, p0, La/g0g0;

    .line 244
    .line 245
    if-eqz p1, :cond_7

    .line 246
    .line 247
    move-object p0, v1

    .line 248
    :cond_7
    if-eqz p0, :cond_8

    .line 249
    .line 250
    check-cast p0, La/sw70;

    .line 251
    .line 252
    invoke-static {p0}, La/h8x;->S(La/sw70;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    :cond_8
    return-object v1

    .line 257
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    :try_start_4
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 263
    .line 264
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 265
    .line 266
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 270
    .line 271
    sget-object v2, La/ew70;->Companion:La/cw70;

    .line 272
    .line 273
    invoke-virtual {v2}, La/cw70;->serializer()La/jiy;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, La/jiy;

    .line 282
    .line 283
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    check-cast p0, La/wxw;

    .line 288
    .line 289
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :catchall_4
    move-exception p0

    .line 293
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 294
    .line 295
    new-instance p1, La/g0g0;

    .line 296
    .line 297
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    move-object p0, p1

    .line 301
    :goto_4
    nop

    .line 302
    instance-of p1, p0, La/g0g0;

    .line 303
    .line 304
    if-eqz p1, :cond_9

    .line 305
    .line 306
    move-object p0, v1

    .line 307
    :cond_9
    if-eqz p0, :cond_a

    .line 308
    .line 309
    check-cast p0, La/ew70;

    .line 310
    .line 311
    invoke-static {p0}, La/a8k0;->K(La/ew70;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    :cond_a
    return-object v1

    .line 316
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    :try_start_5
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 322
    .line 323
    iget-object p0, p0, La/r3v0;->a:La/vby;

    .line 324
    .line 325
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 329
    .line 330
    sget-object v2, La/jv70;->Companion:La/iv70;

    .line 331
    .line 332
    invoke-virtual {v2}, La/iv70;->serializer()La/jiy;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, La/jiy;

    .line 341
    .line 342
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    check-cast p0, La/wxw;

    .line 347
    .line 348
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :catchall_5
    move-exception p0

    .line 352
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 353
    .line 354
    new-instance p1, La/g0g0;

    .line 355
    .line 356
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    move-object p0, p1

    .line 360
    :goto_5
    nop

    .line 361
    instance-of p1, p0, La/g0g0;

    .line 362
    .line 363
    if-eqz p1, :cond_b

    .line 364
    .line 365
    move-object p0, v1

    .line 366
    :cond_b
    if-eqz p0, :cond_c

    .line 367
    .line 368
    check-cast p0, La/jv70;

    .line 369
    .line 370
    invoke-static {p0}, La/r7x;->I(La/jv70;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    :cond_c
    return-object v1

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
