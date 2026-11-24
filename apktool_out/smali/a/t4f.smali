.class public final synthetic La/t4f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r7f;


# direct methods
.method public synthetic constructor <init>(La/r7f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t4f;->a:B

    iput-object p1, p0, La/t4f;->b:La/r7f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t4f;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/t4f;->b:La/r7f;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    iget-object v1, v0, La/r7f;->W1:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    move-object v8, v7

    .line 28
    check-cast v8, La/n9h0;

    .line 29
    .line 30
    cmp-long v9, v5, v2

    .line 31
    .line 32
    if-nez v9, :cond_1

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    move v11, v9

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v11, v4

    .line 38
    :goto_0
    invoke-virtual {v0}, La/r7f;->L()I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    const/16 v18, 0x0

    .line 43
    .line 44
    const/16 v19, 0x7c3

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const-string v12, ""

    .line 49
    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    invoke-static/range {v8 .. v19}, La/n9h0;->a(La/n9h0;ZZZLjava/lang/String;IZZZZZI)La/n9h0;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v1, v7, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0}, La/r7f;->r0()V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Throwable;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v2, La/m2a;->m:La/m2a;

    .line 80
    .line 81
    invoke-virtual {v0, v4, v2}, La/r7f;->o0(ZLa/k3p;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_1
    move-object/from16 v1, p1

    .line 91
    .line 92
    check-cast v1, La/k0w0;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, La/r7f;->H0:La/y3j0;

    .line 98
    .line 99
    sget-object v2, La/bm5;->i:La/bm5;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v0, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 105
    .line 106
    invoke-direct {v0, v2}, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;-><init>(La/bm5;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_2
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    cmp-long v1, v4, v2

    .line 124
    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    iget-object v1, v0, La/r7f;->F1:La/bby;

    .line 128
    .line 129
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-virtual {v0, v4, v5}, La/r7f;->A(J)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_3
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Throwable;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, La/r7f;->U0:La/duj;

    .line 146
    .line 147
    new-instance v2, La/bqd;

    .line 148
    .line 149
    const/16 v3, 0x16

    .line 150
    .line 151
    invoke-direct {v2, v3}, La/bqd;-><init>(B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_4
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, Ljava/lang/Throwable;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v2, La/m2a;->m:La/m2a;

    .line 168
    .line 169
    invoke-virtual {v0, v4, v2}, La/r7f;->o0(ZLa/k3p;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 173
    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_5
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, Ljava/lang/Throwable;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object v2, La/m2a;->m:La/m2a;

    .line 186
    .line 187
    invoke-virtual {v0, v4, v2}, La/r7f;->o0(ZLa/k3p;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_6
    move-object/from16 v1, p1

    .line 197
    .line 198
    check-cast v1, Ljava/lang/Throwable;

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, La/r7f;->e0()V

    .line 207
    .line 208
    .line 209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_7
    move-object/from16 v1, p1

    .line 213
    .line 214
    check-cast v1, Ljava/lang/Long;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    iget-object v1, v0, La/r7f;->k1:La/bhu;

    .line 221
    .line 222
    invoke-virtual {v1}, La/bhu;->a()J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    cmp-long v1, v6, v4

    .line 227
    .line 228
    if-eqz v1, :cond_3

    .line 229
    .line 230
    invoke-virtual {v0, v4, v5}, La/r7f;->A(J)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_3
    iget-object v1, v0, La/r7f;->Z1:La/p7m0;

    .line 235
    .line 236
    iget-object v6, v0, La/r7f;->z:La/ni9;

    .line 237
    .line 238
    cmp-long v2, v4, v2

    .line 239
    .line 240
    if-eqz v2, :cond_6

    .line 241
    .line 242
    iget-object v2, v0, La/r7f;->h0:La/j9c;

    .line 243
    .line 244
    iget-object v2, v2, La/j9c;->a:La/g45;

    .line 245
    .line 246
    iget-object v3, v2, La/g45;->c:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v3, La/ave;

    .line 249
    .line 250
    iget-object v3, v3, La/ave;->a:La/q4f;

    .line 251
    .line 252
    sget-object v7, La/q4f;->m:La/q4f;

    .line 253
    .line 254
    if-eq v3, v7, :cond_4

    .line 255
    .line 256
    iget-object v2, v2, La/g45;->a:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v2, La/lye;

    .line 259
    .line 260
    iget-object v2, v2, La/lye;->b:La/cit0;

    .line 261
    .line 262
    invoke-static {}, La/knm0;->j()La/cit0;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v2, v3}, La/cit0;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    goto :goto_1

    .line 271
    :cond_4
    iget-object v2, v2, La/g45;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v2, La/m0f;

    .line 274
    .line 275
    iget-object v2, v2, La/m0f;->b:Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    :goto_1
    if-nez v2, :cond_6

    .line 282
    .line 283
    invoke-virtual {v6}, La/ni9;->c()Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_6

    .line 288
    .line 289
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    instance-of v2, v2, La/aje;

    .line 294
    .line 295
    if-nez v2, :cond_5

    .line 296
    .line 297
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    instance-of v1, v1, La/eje;

    .line 302
    .line 303
    if-eqz v1, :cond_6

    .line 304
    .line 305
    :cond_5
    invoke-virtual {v0}, La/r7f;->Z()V

    .line 306
    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_6
    invoke-virtual {v6}, La/ni9;->c()Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-nez v1, :cond_7

    .line 314
    .line 315
    invoke-virtual {v0, v4, v5}, La/r7f;->A(J)V

    .line 316
    .line 317
    .line 318
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_8
    move-object/from16 v1, p1

    .line 322
    .line 323
    check-cast v1, Ljava/lang/Throwable;

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
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
