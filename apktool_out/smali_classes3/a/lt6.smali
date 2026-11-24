.class public final synthetic La/lt6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/st6;


# direct methods
.method public synthetic constructor <init>(La/st6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lt6;->a:B

    iput-object p1, p0, La/lt6;->b:La/st6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lt6;->a:B

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 8
    .line 9
    const/16 v5, 0xd

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    iget-object v0, v0, La/lt6;->b:La/st6;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v1, La/st6;->R1:La/yk5;

    .line 20
    .line 21
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    new-instance v10, La/hd20;

    .line 30
    .line 31
    invoke-direct {v10, v0, v6}, La/hd20;-><init>(La/rg20;B)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, La/rg20;->o:La/mne;

    .line 35
    .line 36
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 37
    .line 38
    new-instance v13, La/fj3;

    .line 39
    .line 40
    invoke-direct {v13, v0, v7, v8, v5}, La/fj3;-><init>(La/diu0;ZLa/yje;B)V

    .line 41
    .line 42
    .line 43
    const/16 v14, 0xa

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 47
    .line 48
    .line 49
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    sget-object v1, La/st6;->R1:La/yk5;

    .line 53
    .line 54
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, v0, La/rg20;->O:La/p7m0;

    .line 59
    .line 60
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v5, v0

    .line 65
    check-cast v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 66
    .line 67
    iget-wide v6, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->a:D

    .line 68
    .line 69
    cmpg-double v2, v6, v3

    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    iget-wide v6, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->b:D

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-wide v8, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->c:D

    .line 77
    .line 78
    sub-double v8, v6, v8

    .line 79
    .line 80
    iget-wide v10, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->d:D

    .line 81
    .line 82
    cmpg-double v2, v8, v10

    .line 83
    .line 84
    if-gez v2, :cond_2

    .line 85
    .line 86
    :goto_0
    move-wide v6, v10

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    iget-wide v10, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->e:D

    .line 89
    .line 90
    cmpl-double v2, v6, v10

    .line 91
    .line 92
    if-lez v2, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    move-wide v6, v8

    .line 96
    :goto_1
    const/16 v21, 0x0

    .line 97
    .line 98
    const/16 v22, 0xffe

    .line 99
    .line 100
    const-wide/16 v8, 0x0

    .line 101
    .line 102
    const-wide/16 v10, 0x0

    .line 103
    .line 104
    const-wide/16 v12, 0x0

    .line 105
    .line 106
    const-wide/16 v14, 0x0

    .line 107
    .line 108
    const-wide/16 v16, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    invoke-static/range {v5 .. v22}, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->a(Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;DDDDDJLjava/lang/String;ZZZI)Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_0

    .line 125
    .line 126
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_1
    sget-object v1, La/st6;->R1:La/yk5;

    .line 130
    .line 131
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v1, v0, La/rg20;->O:La/p7m0;

    .line 136
    .line 137
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v5, v0

    .line 142
    check-cast v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 143
    .line 144
    iget-wide v6, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->a:D

    .line 145
    .line 146
    iget-wide v8, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->e:D

    .line 147
    .line 148
    iget-wide v10, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->c:D

    .line 149
    .line 150
    cmpg-double v2, v6, v3

    .line 151
    .line 152
    if-nez v2, :cond_7

    .line 153
    .line 154
    iget-boolean v2, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->i:Z

    .line 155
    .line 156
    iget-wide v6, v5, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->b:D

    .line 157
    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    add-double/2addr v6, v10

    .line 162
    cmpl-double v2, v6, v8

    .line 163
    .line 164
    if-lez v2, :cond_6

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_6
    move-wide v8, v6

    .line 168
    :goto_2
    move-wide v6, v8

    .line 169
    goto :goto_3

    .line 170
    :cond_7
    add-double/2addr v6, v10

    .line 171
    cmpl-double v2, v6, v8

    .line 172
    .line 173
    if-lez v2, :cond_6

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :goto_3
    const/16 v21, 0x0

    .line 177
    .line 178
    const/16 v22, 0xffe

    .line 179
    .line 180
    const-wide/16 v8, 0x0

    .line 181
    .line 182
    const-wide/16 v10, 0x0

    .line 183
    .line 184
    const-wide/16 v12, 0x0

    .line 185
    .line 186
    const-wide/16 v14, 0x0

    .line 187
    .line 188
    const-wide/16 v16, 0x0

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    invoke-static/range {v5 .. v22}, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->a(Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;DDDDDJLjava/lang/String;ZZZI)Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_4

    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_2
    sget-object v1, La/st6;->R1:La/yk5;

    .line 210
    .line 211
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v1, v0, La/rg20;->v:La/ih5;

    .line 216
    .line 217
    sget-object v3, La/k7k;->p1:La/k7k;

    .line 218
    .line 219
    invoke-virtual {v1, v3}, La/ih5;->f(La/k7k;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, v0, La/rg20;->w:La/l7k;

    .line 223
    .line 224
    sget-object v3, La/y1p;->b:La/y1p;

    .line 225
    .line 226
    iget-object v3, v0, La/rg20;->E:La/cmt;

    .line 227
    .line 228
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    const-string v4, "no_money_bet_constructor"

    .line 233
    .line 234
    invoke-virtual {v1, v4, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    new-instance v10, La/hd20;

    .line 242
    .line 243
    invoke-direct {v10, v0, v7}, La/hd20;-><init>(La/rg20;B)V

    .line 244
    .line 245
    .line 246
    iget-object v1, v0, La/rg20;->o:La/mne;

    .line 247
    .line 248
    iget-object v12, v1, La/mne;->a:La/rwj;

    .line 249
    .line 250
    new-instance v13, La/v620;

    .line 251
    .line 252
    invoke-direct {v13, v0, v8, v2}, La/v620;-><init>(La/w46;La/yje;B)V

    .line 253
    .line 254
    .line 255
    const/16 v14, 0xa

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 259
    .line 260
    .line 261
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_3
    iget-object v0, v0, La/st6;->K1:La/yki;

    .line 265
    .line 266
    if-eqz v0, :cond_8

    .line 267
    .line 268
    return-object v0

    .line 269
    :cond_8
    const-string v0, "viewModelFactory"

    .line 270
    .line 271
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v8

    .line 275
    :pswitch_4
    sget-object v1, La/st6;->R1:La/yk5;

    .line 276
    .line 277
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget-object v1, v0, La/rg20;->v:La/ih5;

    .line 282
    .line 283
    sget-object v3, La/k7k;->j1:La/k7k;

    .line 284
    .line 285
    invoke-virtual {v1, v3}, La/ih5;->f(La/k7k;)V

    .line 286
    .line 287
    .line 288
    iget-object v1, v0, La/rg20;->w:La/l7k;

    .line 289
    .line 290
    sget-object v3, La/y1p;->b:La/y1p;

    .line 291
    .line 292
    iget-object v3, v0, La/rg20;->E:La/cmt;

    .line 293
    .line 294
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    const-string v4, "bet_constructor"

    .line 299
    .line 300
    invoke-virtual {v1, v4, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    new-instance v10, La/hd20;

    .line 308
    .line 309
    invoke-direct {v10, v0, v7}, La/hd20;-><init>(La/rg20;B)V

    .line 310
    .line 311
    .line 312
    iget-object v1, v0, La/rg20;->o:La/mne;

    .line 313
    .line 314
    iget-object v12, v1, La/mne;->a:La/rwj;

    .line 315
    .line 316
    new-instance v13, La/v620;

    .line 317
    .line 318
    invoke-direct {v13, v0, v8, v2}, La/v620;-><init>(La/w46;La/yje;B)V

    .line 319
    .line 320
    .line 321
    const/16 v14, 0xa

    .line 322
    .line 323
    const/4 v11, 0x0

    .line 324
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_5
    sget-object v1, La/st6;->R1:La/yk5;

    .line 331
    .line 332
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    new-instance v10, La/hd20;

    .line 341
    .line 342
    invoke-direct {v10, v0, v6}, La/hd20;-><init>(La/rg20;B)V

    .line 343
    .line 344
    .line 345
    iget-object v1, v0, La/rg20;->o:La/mne;

    .line 346
    .line 347
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 348
    .line 349
    new-instance v13, La/fj3;

    .line 350
    .line 351
    const/4 v1, 0x1

    .line 352
    invoke-direct {v13, v0, v1, v8, v5}, La/fj3;-><init>(La/diu0;ZLa/yje;B)V

    .line 353
    .line 354
    .line 355
    const/16 v14, 0xa

    .line 356
    .line 357
    const/4 v11, 0x0

    .line 358
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
