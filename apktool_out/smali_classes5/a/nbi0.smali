.class public final synthetic La/nbi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rbi0;


# direct methods
.method public synthetic constructor <init>(La/rbi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nbi0;->a:B

    iput-object p1, p0, La/nbi0;->b:La/rbi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/nbi0;->a:B

    .line 2
    .line 3
    const-string v1, "point"

    .line 4
    .line 5
    const-string v2, "option"

    .line 6
    .line 7
    const-string v3, "acc_add_phone_code_send"

    .line 8
    .line 9
    iget-object p0, p0, La/nbi0;->b:La/rbi0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p1, p0, La/ldi0;->n:La/nr;

    .line 26
    .line 27
    invoke-virtual {p0}, La/ldi0;->A()La/ym4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, La/kt2;

    .line 37
    .line 38
    new-instance v4, La/jo20;

    .line 39
    .line 40
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v5, "\u0441all_code"

    .line 44
    .line 45
    invoke-virtual {v4, v2, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object v2, La/ym4;->h:La/ym4;

    .line 49
    .line 50
    if-eq v0, v2, :cond_0

    .line 51
    .line 52
    iget-object v0, v0, La/ym4;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v4, v1, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v3, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, La/hfi0;->f:La/hfi0;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, La/ldi0;->H(La/hfi0;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, La/ldi0;->I:La/ol60;

    .line 70
    .line 71
    sget-object p1, La/lci0;->a:La/lci0;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 80
    .line 81
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object p1, p0, La/ldi0;->n:La/nr;

    .line 91
    .line 92
    invoke-virtual {p0}, La/ldi0;->A()La/ym4;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, La/kt2;

    .line 102
    .line 103
    new-instance v4, La/jo20;

    .line 104
    .line 105
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v5, "telegram"

    .line 109
    .line 110
    invoke-virtual {v4, v2, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v2, La/ym4;->h:La/ym4;

    .line 114
    .line 115
    if-eq v0, v2, :cond_1

    .line 116
    .line 117
    iget-object v0, v0, La/ym4;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v4, v1, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {p1, v3, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    sget-object p1, La/hfi0;->c:La/hfi0;

    .line 130
    .line 131
    invoke-virtual {p0, p1}, La/ldi0;->H(La/hfi0;)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, La/ldi0;->I:La/ol60;

    .line 135
    .line 136
    sget-object p1, La/rci0;->a:La/rci0;

    .line 137
    .line 138
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 145
    .line 146
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iget-object p1, p0, La/ldi0;->n:La/nr;

    .line 156
    .line 157
    invoke-virtual {p0}, La/ldi0;->A()La/ym4;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, La/kt2;

    .line 167
    .line 168
    new-instance v4, La/jo20;

    .line 169
    .line 170
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v5, "voice_sms"

    .line 174
    .line 175
    invoke-virtual {v4, v2, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    sget-object v2, La/ym4;->h:La/ym4;

    .line 179
    .line 180
    if-eq v0, v2, :cond_2

    .line 181
    .line 182
    iget-object v0, v0, La/ym4;->a:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v4, v1, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_2
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {p1, v3, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 192
    .line 193
    .line 194
    sget-object p1, La/hfi0;->d:La/hfi0;

    .line 195
    .line 196
    invoke-virtual {p0, p1}, La/ldi0;->H(La/hfi0;)V

    .line 197
    .line 198
    .line 199
    iget-object p0, p0, La/ldi0;->I:La/ol60;

    .line 200
    .line 201
    sget-object p1, La/sci0;->a:La/sci0;

    .line 202
    .line 203
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 210
    .line 211
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iget-object p1, p0, La/ldi0;->n:La/nr;

    .line 221
    .line 222
    invoke-virtual {p0}, La/ldi0;->A()La/ym4;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, La/kt2;

    .line 232
    .line 233
    new-instance v4, La/jo20;

    .line 234
    .line 235
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v5, "sms"

    .line 239
    .line 240
    invoke-virtual {v4, v2, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    sget-object v2, La/ym4;->h:La/ym4;

    .line 244
    .line 245
    if-eq v0, v2, :cond_3

    .line 246
    .line 247
    iget-object v0, v0, La/ym4;->a:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v4, v1, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_3
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-interface {p1, v3, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 257
    .line 258
    .line 259
    sget-object p1, La/hfi0;->b:La/hfi0;

    .line 260
    .line 261
    invoke-virtual {p0, p1}, La/ldi0;->H(La/hfi0;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, La/ldi0;->E()V

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 271
    .line 272
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    iget-object p1, p0, La/ldi0;->n:La/nr;

    .line 282
    .line 283
    invoke-virtual {p0}, La/ldi0;->A()La/ym4;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object p1, p1, La/nr;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, La/kt2;

    .line 293
    .line 294
    new-instance v4, La/jo20;

    .line 295
    .line 296
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 297
    .line 298
    .line 299
    const-string v5, "authenticator"

    .line 300
    .line 301
    invoke-virtual {v4, v2, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    sget-object v2, La/ym4;->h:La/ym4;

    .line 305
    .line 306
    if-eq v0, v2, :cond_4

    .line 307
    .line 308
    iget-object v0, v0, La/ym4;->a:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v4, v1, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_4
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-interface {p1, v3, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 318
    .line 319
    .line 320
    sget-object p1, La/hfi0;->e:La/hfi0;

    .line 321
    .line 322
    invoke-virtual {p0, p1}, La/ldi0;->H(La/hfi0;)V

    .line 323
    .line 324
    .line 325
    iget-object p1, p0, La/ldi0;->F:La/bby;

    .line 326
    .line 327
    if-eqz p1, :cond_5

    .line 328
    .line 329
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    const/4 v0, 0x1

    .line 334
    if-ne p1, v0, :cond_5

    .line 335
    .line 336
    goto :goto_0

    .line 337
    :cond_5
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    sget-object v2, La/bdi0;->a:La/bdi0;

    .line 342
    .line 343
    new-instance v5, La/cdi0;

    .line 344
    .line 345
    const/4 p1, 0x0

    .line 346
    invoke-direct {v5, p1, p0}, La/cdi0;-><init>(La/yje;La/ldi0;)V

    .line 347
    .line 348
    .line 349
    const/16 v6, 0xe

    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    const/4 v4, 0x0

    .line 353
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    iput-object p1, p0, La/ldi0;->F:La/bby;

    .line 358
    .line 359
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_4
    check-cast p1, La/iqt0;

    .line 363
    .line 364
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0}, La/rbi0;->I0()La/ldi0;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    iget-object p0, p0, La/ldi0;->i:La/z4w0;

    .line 374
    .line 375
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 376
    .line 377
    .line 378
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object p0

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
