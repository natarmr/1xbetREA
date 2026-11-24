.class public final La/s8g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/u8g;


# direct methods
.method public synthetic constructor <init>(La/u8g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s8g;->i:B

    iput-object p1, p0, La/s8g;->j:La/u8g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/s8g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/s8g;->j:La/u8g;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/s8g;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/s8g;-><init>(La/u8g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/s8g;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/s8g;-><init>(La/u8g;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/s8g;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/s8g;-><init>(La/u8g;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s8g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/s8g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/s8g;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/s8g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/kmq;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/s8g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/s8g;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/s8g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/s8g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/s8g;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/s8g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/s8g;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/s8g;->j:La/u8g;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, v3, La/u8g;->n:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of p0, p0, La/n8g;

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, La/p8g;

    .line 30
    .line 31
    invoke-direct {v5, v3, v2}, La/p8g;-><init>(La/u8g;B)V

    .line 32
    .line 33
    .line 34
    iget-object p0, v3, La/u8g;->j:La/mne;

    .line 35
    .line 36
    iget-object v7, p0, La/mne;->b:La/dvj;

    .line 37
    .line 38
    new-instance v8, La/s8g;

    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    invoke-direct {v8, v3, p0, v1}, La/s8g;-><init>(La/u8g;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/16 v9, 0xa

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 48
    .line 49
    .line 50
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    sget-object p0, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, La/u8g;->y()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, La/s8g;->j:La/u8g;

    .line 70
    .line 71
    iget-object p0, v4, La/u8g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 72
    .line 73
    iget-wide v5, p0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 74
    .line 75
    invoke-static {v5, v6}, La/fre0;->O(J)Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-wide v5, p0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 80
    .line 81
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p0, v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x5

    .line 97
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-virtual {p0, v0, v3}, Ljava/util/Calendar;->set(II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v7, 0x7

    .line 112
    invoke-virtual {p0, v7, v3}, Ljava/util/Calendar;->set(II)V

    .line 113
    .line 114
    .line 115
    const/16 v3, 0xb

    .line 116
    .line 117
    invoke-virtual {p0, v3, v1}, Ljava/util/Calendar;->set(II)V

    .line 118
    .line 119
    .line 120
    const/16 v8, 0xc

    .line 121
    .line 122
    invoke-virtual {p0, v8, v1}, Ljava/util/Calendar;->set(II)V

    .line 123
    .line 124
    .line 125
    const/16 v9, 0xd

    .line 126
    .line 127
    invoke-virtual {p0, v9, v1}, Ljava/util/Calendar;->set(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {p0, v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {p0, v7, v1}, Ljava/util/Calendar;->set(II)V

    .line 164
    .line 165
    .line 166
    const/4 v1, 0x6

    .line 167
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 168
    .line 169
    .line 170
    const/16 v0, 0x17

    .line 171
    .line 172
    invoke-virtual {p0, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 173
    .line 174
    .line 175
    const/16 v0, 0x3b

    .line 176
    .line 177
    invoke-virtual {p0, v8, v0}, Ljava/util/Calendar;->set(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v9, v0}, Ljava/util/Calendar;->set(II)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 184
    .line 185
    .line 186
    move-result-wide v5

    .line 187
    move-wide v8, v5

    .line 188
    new-instance v6, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 189
    .line 190
    invoke-direct {v6, v10, v11, v8, v9}, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;-><init>(JJ)V

    .line 191
    .line 192
    .line 193
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {p0, v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 206
    .line 207
    .line 208
    new-instance v5, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    :goto_0
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 214
    .line 215
    .line 216
    move-result-wide v8

    .line 217
    iget-wide v10, v6, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 218
    .line 219
    cmp-long v0, v8, v10

    .line 220
    .line 221
    if-gez v0, :cond_2

    .line 222
    .line 223
    invoke-static {p0}, La/fre0;->Q(Ljava/util/Calendar;)Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    filled-new-array {v0}, [Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    move v3, v2

    .line 236
    :goto_1
    if-ge v3, v7, :cond_1

    .line 237
    .line 238
    invoke-virtual {p0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 239
    .line 240
    .line 241
    invoke-static {p0}, La/fre0;->Q(Ljava/util/Calendar;)Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    add-int/lit8 v3, v3, 0x1

    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_1
    invoke-virtual {p0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_2
    iget-object p0, v4, La/u8g;->m:La/p7m0;

    .line 259
    .line 260
    new-instance v0, La/x5g;

    .line 261
    .line 262
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Ljava/util/List;

    .line 267
    .line 268
    sget-object v2, La/y5g;->a:La/y5g;

    .line 269
    .line 270
    invoke-direct {v0, v1, p1, v2}, La/x5g;-><init>(Ljava/util/List;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;La/y5g;)V

    .line 271
    .line 272
    .line 273
    new-instance v1, Ljava/util/ArrayList;

    .line 274
    .line 275
    const/16 v2, 0xa

    .line 276
    .line 277
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_3

    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    check-cast v3, Ljava/util/List;

    .line 299
    .line 300
    new-instance v7, La/x5g;

    .line 301
    .line 302
    sget-object v8, La/y5g;->b:La/y5g;

    .line 303
    .line 304
    invoke-direct {v7, v3, p1, v8}, La/x5g;-><init>(Ljava/util/List;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;La/y5g;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_3
    new-instance p1, La/r8g;

    .line 312
    .line 313
    invoke-direct {p1, v0, v1}, La/r8g;-><init>(La/x5g;Ljava/util/List;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    invoke-virtual {p0, v7, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    iget-object p0, v4, La/u8g;->r:La/bby;

    .line 324
    .line 325
    if-eqz p0, :cond_4

    .line 326
    .line 327
    invoke-interface {p0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 328
    .line 329
    .line 330
    :cond_4
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    iget-object p1, v4, La/u8g;->j:La/mne;

    .line 335
    .line 336
    iget-object v11, p1, La/mne;->b:La/dvj;

    .line 337
    .line 338
    new-instance v9, La/p8g;

    .line 339
    .line 340
    const/4 p1, 0x2

    .line 341
    invoke-direct {v9, v4, p1}, La/p8g;-><init>(La/u8g;B)V

    .line 342
    .line 343
    .line 344
    new-instance v3, La/g6g;

    .line 345
    .line 346
    const/4 v8, 0x2

    .line 347
    invoke-direct/range {v3 .. v8}, La/g6g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 348
    .line 349
    .line 350
    const/16 v13, 0xa

    .line 351
    .line 352
    const/4 v10, 0x0

    .line 353
    move-object v8, p0

    .line 354
    move-object v12, v3

    .line 355
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    iput-object p0, v4, La/u8g;->r:La/bby;

    .line 360
    .line 361
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object p0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
