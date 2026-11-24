.class public final synthetic La/eye0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eze0;


# direct methods
.method public synthetic constructor <init>(La/eze0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eye0;->a:B

    iput-object p1, p0, La/eye0;->b:La/eze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eye0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/eye0;->b:La/eze0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/d7a;

    .line 16
    .line 17
    new-instance v2, La/qxe0;

    .line 18
    .line 19
    invoke-direct {v2, v1}, La/qxe0;-><init>(La/d7a;)V

    .line 20
    .line 21
    .line 22
    sget v1, La/eze0;->y0:I

    .line 23
    .line 24
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/k0w0;

    .line 33
    .line 34
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 35
    .line 36
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 37
    .line 38
    new-instance v6, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;

    .line 39
    .line 40
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, La/aye0;

    .line 45
    .line 46
    iget-object v7, v7, La/aye0;->h:La/q1f0;

    .line 47
    .line 48
    iget-object v7, v7, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 49
    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    iget v4, v7, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->a:I

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_0
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/aye0;

    .line 63
    .line 64
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 65
    .line 66
    iget-object v0, v0, La/q1f0;->M:La/q7f0;

    .line 67
    .line 68
    sget-object v7, La/q7f0;->e:La/q7f0;

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-ne v0, v7, :cond_1

    .line 72
    .line 73
    move v3, v8

    .line 74
    :cond_1
    invoke-direct {v6, v4, v8, v3}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 78
    .line 79
    invoke-direct {v5, v6, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v5}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_1
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, La/k0w0;

    .line 98
    .line 99
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 100
    .line 101
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 102
    .line 103
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Region;

    .line 104
    .line 105
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/aye0;

    .line 110
    .line 111
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 112
    .line 113
    iget-object v0, v0, La/q1f0;->v:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 114
    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;->a:I

    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    :cond_2
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Region;-><init>(Ljava/lang/Integer;)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 127
    .line 128
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_2
    move-object/from16 v1, p1

    .line 145
    .line 146
    check-cast v1, La/k0w0;

    .line 147
    .line 148
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 149
    .line 150
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 151
    .line 152
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Document;

    .line 153
    .line 154
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/aye0;

    .line 159
    .line 160
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 161
    .line 162
    iget-object v0, v0, La/q1f0;->j:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;

    .line 163
    .line 164
    if-eqz v0, :cond_3

    .line 165
    .line 166
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;->a:I

    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    :cond_3
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Document;-><init>(Ljava/lang/Integer;)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 176
    .line 177
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_3
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, La/k0w0;

    .line 196
    .line 197
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 198
    .line 199
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 200
    .line 201
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Currency;

    .line 202
    .line 203
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/aye0;

    .line 208
    .line 209
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 210
    .line 211
    iget-object v0, v0, La/q1f0;->h:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 212
    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;->a:I

    .line 216
    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    :cond_4
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Currency;-><init>(Ljava/lang/Integer;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 225
    .line 226
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_4
    move-object/from16 v1, p1

    .line 243
    .line 244
    check-cast v1, La/k0w0;

    .line 245
    .line 246
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 247
    .line 248
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 249
    .line 250
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Country;

    .line 251
    .line 252
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, La/aye0;

    .line 257
    .line 258
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 259
    .line 260
    iget-object v0, v0, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 261
    .line 262
    if-eqz v0, :cond_5

    .line 263
    .line 264
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->a:I

    .line 265
    .line 266
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    :cond_5
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Country;-><init>(Ljava/lang/Integer;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 274
    .line 275
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_5
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/k0w0;

    .line 294
    .line 295
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 296
    .line 297
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 298
    .line 299
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$City;

    .line 300
    .line 301
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, La/aye0;

    .line 306
    .line 307
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 308
    .line 309
    iget-object v0, v0, La/q1f0;->d:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;

    .line 310
    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;->a:I

    .line 314
    .line 315
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    :cond_6
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$City;-><init>(Ljava/lang/Integer;)V

    .line 320
    .line 321
    .line 322
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 323
    .line 324
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 335
    .line 336
    .line 337
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_6
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, La/k0w0;

    .line 343
    .line 344
    iget-object v2, v0, La/eze0;->s0:La/nh70;

    .line 345
    .line 346
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 347
    .line 348
    new-instance v5, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Citizenship;

    .line 349
    .line 350
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, La/aye0;

    .line 355
    .line 356
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 357
    .line 358
    iget-object v0, v0, La/q1f0;->o:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 359
    .line 360
    if-eqz v0, :cond_7

    .line 361
    .line 362
    iget v0, v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;->a:I

    .line 363
    .line 364
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    :cond_7
    invoke-direct {v5, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Citizenship;-><init>(Ljava/lang/Integer;)V

    .line 369
    .line 370
    .line 371
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 372
    .line 373
    invoke-direct {v3, v5, v0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v3}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v1, v0}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_7
    move-object/from16 v1, p1

    .line 390
    .line 391
    check-cast v1, Ljava/lang/Throwable;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, La/aye0;

    .line 404
    .line 405
    iget-object v1, v1, La/aye0;->e:Ljava/util/List;

    .line 406
    .line 407
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-eqz v1, :cond_9

    .line 412
    .line 413
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 414
    .line 415
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 416
    .line 417
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 425
    .line 426
    move-object v4, v2

    .line 427
    check-cast v4, La/aye0;

    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    const/16 v25, 0x0

    .line 433
    .line 434
    const v26, 0x7ffffff9

    .line 435
    .line 436
    .line 437
    const/4 v5, 0x0

    .line 438
    const/4 v6, 0x0

    .line 439
    const/4 v7, 0x1

    .line 440
    const/4 v8, 0x0

    .line 441
    const/4 v9, 0x0

    .line 442
    const/4 v10, 0x0

    .line 443
    const/4 v11, 0x0

    .line 444
    const/4 v12, 0x0

    .line 445
    const/4 v13, 0x0

    .line 446
    const/4 v14, 0x0

    .line 447
    const/4 v15, 0x0

    .line 448
    const/16 v16, 0x0

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    const/16 v19, 0x0

    .line 455
    .line 456
    const/16 v20, 0x0

    .line 457
    .line 458
    const/16 v21, 0x0

    .line 459
    .line 460
    const/16 v22, 0x0

    .line 461
    .line 462
    const/16 v23, 0x0

    .line 463
    .line 464
    const/16 v24, 0x0

    .line 465
    .line 466
    invoke-static/range {v4 .. v26}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    if-eqz v2, :cond_8

    .line 475
    .line 476
    goto :goto_0

    .line 477
    :cond_9
    iget-object v0, v0, La/eze0;->x0:La/dq00;

    .line 478
    .line 479
    iget-object v1, v0, La/dq00;->c:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v1, La/eye0;

    .line 482
    .line 483
    new-instance v3, La/uwe0;

    .line 484
    .line 485
    invoke-direct {v3, v0, v2}, La/uwe0;-><init>(La/dq00;B)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v3}, La/eye0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0

    .line 494
    :pswitch_8
    move-object/from16 v1, p1

    .line 495
    .line 496
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    new-instance v2, La/ru80;

    .line 502
    .line 503
    const/16 v3, 0x8

    .line 504
    .line 505
    invoke-direct {v2, v1, v3}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 509
    .line 510
    .line 511
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_9
    move-object/from16 v1, p1

    .line 515
    .line 516
    check-cast v1, Ljava/lang/Throwable;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    new-instance v2, La/uxe0;

    .line 522
    .line 523
    invoke-direct {v2, v3}, La/uxe0;-><init>(Z)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_a
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, Ljava/lang/Throwable;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 543
    .line 544
    .line 545
    iget-object v0, v0, La/eze0;->x0:La/dq00;

    .line 546
    .line 547
    iget-object v1, v0, La/dq00;->c:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v1, La/eye0;

    .line 550
    .line 551
    new-instance v3, La/uwe0;

    .line 552
    .line 553
    invoke-direct {v3, v0, v2}, La/uwe0;-><init>(La/dq00;B)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1, v3}, La/eye0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object v0

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
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
