.class public final La/xej0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Lorg/xplatform/settings/impl/presentation/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xej0;->i:B

    iput-object p1, p0, La/xej0;->j:Lorg/xplatform/settings/impl/presentation/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xej0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xej0;->j:Lorg/xplatform/settings/impl/presentation/a;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xej0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xej0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/xej0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/xej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

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
    iget-byte v0, p0, La/xej0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xej0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/xej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/xej0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/xej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/xej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/xej0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/xej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xej0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/xej0;->j:Lorg/xplatform/settings/impl/presentation/a;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput v3, v0, Lorg/xplatform/settings/impl/presentation/a;->P0:I

    .line 19
    .line 20
    iput-boolean v4, v0, Lorg/xplatform/settings/impl/presentation/a;->O0:Z

    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->U:La/iqt;

    .line 31
    .line 32
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 33
    .line 34
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    move-object v5, v3

    .line 45
    check-cast v5, La/caj0;

    .line 46
    .line 47
    const/16 v27, 0x0

    .line 48
    .line 49
    const v28, 0x1fffff7

    .line 50
    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    const/16 v23, 0x0

    .line 76
    .line 77
    const/16 v24, 0x0

    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    const/16 v26, 0x0

    .line 82
    .line 83
    invoke-static/range {v5 .. v28}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v1, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_0

    .line 92
    .line 93
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->V:La/epc;

    .line 94
    .line 95
    invoke-virtual {v3}, La/epc;->a()La/hr4;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iget-boolean v3, v3, La/hr4;->a:Z

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v9, v5

    .line 106
    check-cast v9, La/caj0;

    .line 107
    .line 108
    const/16 v30, 0x0

    .line 109
    .line 110
    const v32, 0xffffff

    .line 111
    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/16 v23, 0x0

    .line 134
    .line 135
    const/16 v24, 0x0

    .line 136
    .line 137
    const/16 v25, 0x0

    .line 138
    .line 139
    const/16 v26, 0x0

    .line 140
    .line 141
    const/16 v27, 0x0

    .line 142
    .line 143
    const/16 v28, 0x0

    .line 144
    .line 145
    const/16 v29, 0x0

    .line 146
    .line 147
    move/from16 v31, v3

    .line 148
    .line 149
    invoke-static/range {v9 .. v32}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v1, v5, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_4

    .line 158
    .line 159
    if-eqz v8, :cond_1

    .line 160
    .line 161
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    const-class v3, La/oqt0;

    .line 166
    .line 167
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    new-instance v3, La/uu3;

    .line 172
    .line 173
    invoke-direct {v3, v0, v2}, La/uu3;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;)V

    .line 174
    .line 175
    .line 176
    new-instance v5, La/kej0;

    .line 177
    .line 178
    const/4 v6, 0x5

    .line 179
    invoke-direct {v5, v0, v6}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 180
    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    const/16 v21, 0x2d0

    .line 185
    .line 186
    const-string v10, "SettingsViewModel.getAuthorizedData"

    .line 187
    .line 188
    const/4 v11, 0x3

    .line 189
    const-wide/16 v12, 0x5

    .line 190
    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    move-object/from16 v16, v3

    .line 197
    .line 198
    move-object/from16 v19, v5

    .line 199
    .line 200
    invoke-static/range {v9 .. v21}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 201
    .line 202
    .line 203
    :cond_1
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->J0:La/sff0;

    .line 204
    .line 205
    iget-object v3, v3, La/sff0;->N:La/co4;

    .line 206
    .line 207
    iget-boolean v3, v3, La/co4;->i:Z

    .line 208
    .line 209
    if-nez v3, :cond_2

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_2
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->P:La/f4u;

    .line 213
    .line 214
    invoke-virtual {v3}, La/f4u;->c()La/j6d0;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    move-object v5, v3

    .line 223
    check-cast v5, La/caj0;

    .line 224
    .line 225
    const/16 v27, 0x0

    .line 226
    .line 227
    const v28, 0x1ffffdf

    .line 228
    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    const/4 v7, 0x0

    .line 232
    const/4 v8, 0x0

    .line 233
    const/4 v10, 0x0

    .line 234
    const/4 v11, 0x0

    .line 235
    const/4 v12, 0x0

    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    const/16 v17, 0x0

    .line 242
    .line 243
    const/16 v18, 0x0

    .line 244
    .line 245
    const/16 v19, 0x0

    .line 246
    .line 247
    const/16 v20, 0x0

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    const/16 v23, 0x0

    .line 254
    .line 255
    const/16 v24, 0x0

    .line 256
    .line 257
    const/16 v25, 0x0

    .line 258
    .line 259
    const/16 v26, 0x0

    .line 260
    .line 261
    invoke-static/range {v5 .. v28}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v1, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_3

    .line 270
    .line 271
    :goto_1
    invoke-virtual {v0, v4}, Lorg/xplatform/settings/impl/presentation/a;->x(Z)V

    .line 272
    .line 273
    .line 274
    new-instance v1, La/o0j0;

    .line 275
    .line 276
    invoke-direct {v1, v4}, La/o0j0;-><init>(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 280
    .line 281
    .line 282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :cond_4
    move/from16 v3, v31

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    new-instance v6, La/kej0;

    .line 299
    .line 300
    invoke-direct {v6, v0, v4}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 301
    .line 302
    .line 303
    new-instance v7, La/lej0;

    .line 304
    .line 305
    invoke-direct {v7, v0, v4}, La/lej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 306
    .line 307
    .line 308
    new-instance v9, La/xej0;

    .line 309
    .line 310
    invoke-direct {v9, v0, v2, v3}, La/xej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 311
    .line 312
    .line 313
    const/16 v10, 0xc

    .line 314
    .line 315
    const/4 v8, 0x0

    .line 316
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
