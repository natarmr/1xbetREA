.class public final La/obl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/ncl0;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/ncl0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/obl0;->a:B

    iput-object p1, p0, La/obl0;->b:La/kmq;

    iput-object p2, p0, La/obl0;->c:La/ncl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/obl0;->a:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/obl0;->c:La/ncl0;

    .line 9
    .line 10
    iget-object v5, v0, La/obl0;->b:La/kmq;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/high16 v9, -0x80000000

    .line 17
    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    instance-of v2, v1, La/qbl0;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, La/qbl0;

    .line 27
    .line 28
    iget v10, v2, La/qbl0;->j:I

    .line 29
    .line 30
    and-int v11, v10, v9

    .line 31
    .line 32
    if-eqz v11, :cond_0

    .line 33
    .line 34
    sub-int/2addr v10, v9

    .line 35
    iput v10, v2, La/qbl0;->j:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, La/qbl0;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, La/qbl0;-><init>(La/obl0;La/yje;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, v2, La/qbl0;->i:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object v1, La/wne;->a:La/wne;

    .line 46
    .line 47
    iget v9, v2, La/qbl0;->j:I

    .line 48
    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    if-ne v9, v8, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, La/fsr;

    .line 67
    .line 68
    iget-object v4, v4, La/ncl0;->L:La/n0o0;

    .line 69
    .line 70
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-boolean v6, v0, La/fsr;->b:Z

    .line 84
    .line 85
    iget-boolean v7, v0, La/fsr;->c:Z

    .line 86
    .line 87
    new-instance v9, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    new-instance v6, La/w39;

    .line 95
    .line 96
    invoke-static {v0}, La/ozb;->f0(La/fsr;)Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    new-instance v11, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 101
    .line 102
    sget-object v12, La/jxs;->a:[La/jxs;

    .line 103
    .line 104
    const/4 v15, -0x1

    .line 105
    sget-object v16, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;->a:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;

    .line 106
    .line 107
    const-string v12, "16:9"

    .line 108
    .line 109
    const v13, 0x7f0700a5

    .line 110
    .line 111
    .line 112
    const/4 v14, -0x1

    .line 113
    invoke-direct/range {v11 .. v16}, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;-><init>(Ljava/lang/String;IIILorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v6, v10, v11}, La/w39;-><init>(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_3
    if-eqz v7, :cond_4

    .line 123
    .line 124
    new-instance v6, La/x39;

    .line 125
    .line 126
    invoke-static {v0}, La/ozb;->f0(La/fsr;)Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {v6, v0}, La/x39;-><init>(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_4
    new-instance v0, La/gsr;

    .line 137
    .line 138
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_5

    .line 143
    .line 144
    if-nez v4, :cond_5

    .line 145
    .line 146
    move v3, v8

    .line 147
    :cond_5
    invoke-direct {v0, v9, v3}, La/gsr;-><init>(Ljava/util/ArrayList;Z)V

    .line 148
    .line 149
    .line 150
    iput v8, v2, La/qbl0;->j:I

    .line 151
    .line 152
    invoke-interface {v5, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v1, :cond_6

    .line 157
    .line 158
    move-object v6, v1

    .line 159
    goto :goto_2

    .line 160
    :cond_6
    :goto_1
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    :goto_2
    return-object v6

    .line 163
    :pswitch_0
    instance-of v2, v1, La/nbl0;

    .line 164
    .line 165
    if-eqz v2, :cond_7

    .line 166
    .line 167
    move-object v2, v1

    .line 168
    check-cast v2, La/nbl0;

    .line 169
    .line 170
    iget v10, v2, La/nbl0;->j:I

    .line 171
    .line 172
    and-int v11, v10, v9

    .line 173
    .line 174
    if-eqz v11, :cond_7

    .line 175
    .line 176
    sub-int/2addr v10, v9

    .line 177
    iput v10, v2, La/nbl0;->j:I

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    new-instance v2, La/nbl0;

    .line 181
    .line 182
    invoke-direct {v2, v0, v1}, La/nbl0;-><init>(La/obl0;La/yje;)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iget-object v0, v2, La/nbl0;->i:Ljava/lang/Object;

    .line 186
    .line 187
    sget-object v1, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget v9, v2, La/nbl0;->j:I

    .line 190
    .line 191
    if-eqz v9, :cond_9

    .line 192
    .line 193
    if-ne v9, v8, :cond_8

    .line 194
    .line 195
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_6

    .line 199
    .line 200
    :cond_8
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    :cond_9
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    move-object/from16 v0, p1

    .line 209
    .line 210
    check-cast v0, La/zqs;

    .line 211
    .line 212
    iget-object v4, v4, La/ncl0;->h:La/ctf0;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    iget-boolean v6, v0, La/zqs;->a:Z

    .line 221
    .line 222
    if-nez v6, :cond_c

    .line 223
    .line 224
    new-instance v6, La/brs;

    .line 225
    .line 226
    iget-boolean v7, v0, La/zqs;->g:Z

    .line 227
    .line 228
    if-eqz v7, :cond_a

    .line 229
    .line 230
    new-instance v7, La/wef0;

    .line 231
    .line 232
    new-array v9, v3, [Ljava/lang/Object;

    .line 233
    .line 234
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 235
    .line 236
    invoke-static {v9, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    const v9, 0x7f13168b

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v9, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    iget-wide v9, v0, La/zqs;->i:J

    .line 248
    .line 249
    new-instance v0, La/znq0;

    .line 250
    .line 251
    invoke-direct {v0, v9, v10}, La/znq0;-><init>(J)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0}, La/aoq0;->b()J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    const-wide/16 v11, 0x3c

    .line 259
    .line 260
    div-long v13, v9, v11

    .line 261
    .line 262
    rem-long/2addr v9, v11

    .line 263
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 264
    .line 265
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    filled-new-array {v4, v9}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    const/4 v9, 0x2

    .line 278
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    const-string v9, "%02d:%02d"

    .line 283
    .line 284
    invoke-static {v0, v9, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-direct {v7, v3, v0}, La/wef0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_a
    iget-boolean v0, v0, La/zqs;->h:Z

    .line 293
    .line 294
    if-eqz v0, :cond_b

    .line 295
    .line 296
    new-instance v7, La/vef0;

    .line 297
    .line 298
    new-array v0, v3, [Ljava/lang/Object;

    .line 299
    .line 300
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 301
    .line 302
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const v3, 0x7f130933

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {v7, v0}, La/vef0;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_b
    new-instance v7, La/vef0;

    .line 318
    .line 319
    new-array v0, v3, [Ljava/lang/Object;

    .line 320
    .line 321
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 322
    .line 323
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const v3, 0x7f130921

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-direct {v7, v0}, La/vef0;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_4
    invoke-direct {v6, v7}, La/brs;-><init>(La/xef0;)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_c
    sget-object v6, La/ars;->a:La/ars;

    .line 342
    .line 343
    :goto_5
    iput v8, v2, La/nbl0;->j:I

    .line 344
    .line 345
    invoke-interface {v5, v6, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-ne v0, v1, :cond_d

    .line 350
    .line 351
    move-object v6, v1

    .line 352
    goto :goto_7

    .line 353
    :cond_d
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    :goto_7
    return-object v6

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
