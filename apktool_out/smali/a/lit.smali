.class public final synthetic La/lit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/vzg0;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/vzg0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/lit;->a:B

    iput-object p1, p0, La/lit;->b:La/ctf0;

    iput-object p2, p0, La/lit;->c:La/vzg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/vzg0;La/ctf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/lit;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lit;->c:La/vzg0;

    iput-object p2, p0, La/lit;->b:La/ctf0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lit;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/lit;->c:La/vzg0;

    .line 9
    .line 10
    iget-object v0, v0, La/lit;->b:La/ctf0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v1, La/ncn0;

    .line 16
    .line 17
    new-array v2, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 20
    .line 21
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v6, 0x7f131409

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "SELECTED_TAB_KEY"

    .line 35
    .line 36
    invoke-virtual {v4, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v4, v3

    .line 50
    :goto_0
    new-array v5, v3, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const v6, 0x7f1307e8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    new-array v6, v3, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const v7, 0x7f1314d2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    filled-new-array {v5, v0}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v1, v4, v2, v0, v3}, La/ncn0;-><init>(ILjava/lang/String;Ljava/util/List;Z)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :pswitch_0
    new-array v1, v3, [Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 91
    .line 92
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const v6, 0x7f1312fd

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    new-array v1, v3, [Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 106
    .line 107
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const v5, 0x7f1312fa

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const-string v0, "REQUEST_CODE"

    .line 119
    .line 120
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ljava/lang/String;

    .line 125
    .line 126
    if-nez v0, :cond_1

    .line 127
    .line 128
    move-object v12, v2

    .line 129
    goto :goto_1

    .line 130
    :cond_1
    move-object v12, v0

    .line 131
    :goto_1
    const-string v0, "REQUEST_GUID_KEY"

    .line 132
    .line 133
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Ljava/lang/String;

    .line 138
    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    move-object v13, v2

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    move-object v13, v0

    .line 144
    :goto_2
    const-string v0, "PAY_IN_OUT_KEY"

    .line 145
    .line 146
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/Boolean;

    .line 151
    .line 152
    if-eqz v0, :cond_3

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    :cond_3
    move v15, v3

    .line 159
    const-string v0, "BALANCE_ID"

    .line 160
    .line 161
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/Long;

    .line 166
    .line 167
    const-wide/16 v5, 0x0

    .line 168
    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    move-wide/from16 v16, v0

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_4
    move-wide/from16 v16, v5

    .line 179
    .line 180
    :goto_3
    const-string v0, "PRODUCT_ID"

    .line 181
    .line 182
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/Long;

    .line 187
    .line 188
    if-eqz v0, :cond_5

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 191
    .line 192
    .line 193
    move-result-wide v5

    .line 194
    :cond_5
    move-wide/from16 v18, v5

    .line 195
    .line 196
    const-string v0, "AMOUNT_KEY"

    .line 197
    .line 198
    invoke-virtual {v4, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/String;

    .line 203
    .line 204
    if-nez v0, :cond_6

    .line 205
    .line 206
    move-object/from16 v20, v2

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_6
    move-object/from16 v20, v0

    .line 210
    .line 211
    :goto_4
    new-instance v0, La/wck0;

    .line 212
    .line 213
    const-wide/16 v1, 0x12c

    .line 214
    .line 215
    invoke-direct {v0, v1, v2}, La/wck0;-><init>(J)V

    .line 216
    .line 217
    .line 218
    new-instance v7, La/cdk0;

    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const/16 v24, 0x0

    .line 223
    .line 224
    const-string v10, ""

    .line 225
    .line 226
    const-string v11, ""

    .line 227
    .line 228
    const-string v14, ""

    .line 229
    .line 230
    const/16 v21, 0x0

    .line 231
    .line 232
    move-object/from16 v23, v0

    .line 233
    .line 234
    invoke-direct/range {v7 .. v24}, La/cdk0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJLjava/lang/String;ZZLa/xck0;Z)V

    .line 235
    .line 236
    .line 237
    return-object v7

    .line 238
    :pswitch_1
    const-string v1, "MIN_BET_SUM_SAVED"

    .line 239
    .line 240
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, Ljava/lang/String;

    .line 245
    .line 246
    if-nez v1, :cond_7

    .line 247
    .line 248
    move-object v6, v2

    .line 249
    goto :goto_5

    .line 250
    :cond_7
    move-object v6, v1

    .line 251
    :goto_5
    const-string v1, "BET_SUM_SAVED"

    .line 252
    .line 253
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Ljava/lang/String;

    .line 258
    .line 259
    if-nez v1, :cond_8

    .line 260
    .line 261
    move-object v7, v2

    .line 262
    goto :goto_6

    .line 263
    :cond_8
    move-object v7, v1

    .line 264
    :goto_6
    const-string v1, "WONTED_SUM_SAVED"

    .line 265
    .line 266
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, Ljava/lang/String;

    .line 271
    .line 272
    if-nez v1, :cond_9

    .line 273
    .line 274
    move-object v8, v2

    .line 275
    goto :goto_7

    .line 276
    :cond_9
    move-object v8, v1

    .line 277
    :goto_7
    new-instance v5, La/zo80;

    .line 278
    .line 279
    new-instance v9, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 280
    .line 281
    invoke-direct {v9, v2, v3, v3}, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;-><init>(Ljava/lang/String;IZ)V

    .line 282
    .line 283
    .line 284
    new-instance v10, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 285
    .line 286
    invoke-direct {v10, v2, v3, v3}, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;-><init>(Ljava/lang/String;IZ)V

    .line 287
    .line 288
    .line 289
    const-string v11, ""

    .line 290
    .line 291
    invoke-direct/range {v5 .. v11}, La/zo80;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    new-instance v11, La/bdq;

    .line 295
    .line 296
    sget-object v1, La/iun;->a:La/iun;

    .line 297
    .line 298
    invoke-direct {v11, v1, v1, v1, v1}, La/bdq;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 299
    .line 300
    .line 301
    new-instance v13, La/yo80;

    .line 302
    .line 303
    const/4 v1, 0x0

    .line 304
    invoke-direct {v13, v1, v3}, La/yo80;-><init>(Ljava/lang/String;Z)V

    .line 305
    .line 306
    .line 307
    new-instance v14, La/yo80;

    .line 308
    .line 309
    invoke-direct {v14, v1, v3}, La/yo80;-><init>(Ljava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    sget-object v17, La/lak0;->c:La/lak0;

    .line 313
    .line 314
    new-array v1, v3, [Ljava/lang/Object;

    .line 315
    .line 316
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 317
    .line 318
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    const v2, 0x7f1300e4

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v19

    .line 329
    new-instance v9, La/zht;

    .line 330
    .line 331
    const/4 v15, 0x1

    .line 332
    const/16 v16, 0x0

    .line 333
    .line 334
    const/4 v12, 0x0

    .line 335
    move-object/from16 v18, v17

    .line 336
    .line 337
    move-object v10, v5

    .line 338
    invoke-direct/range {v9 .. v19}, La/zht;-><init>(La/zo80;La/bdq;ZLa/yo80;La/yo80;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return-object v9

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
