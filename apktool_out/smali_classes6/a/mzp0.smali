.class public final La/mzp0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/nzp0;


# direct methods
.method public synthetic constructor <init>(La/nzp0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mzp0;->i:B

    iput-object p1, p0, La/mzp0;->k:La/nzp0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mzp0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mzp0;->k:La/nzp0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mzp0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mzp0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/mzp0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/mzp0;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mzp0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mzp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mzp0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mzp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mzp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mzp0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mzp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/mzp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/mzp0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/mzp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mzp0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/mzp0;->k:La/nzp0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v4, La/nzp0;->t:La/x4u;

    .line 15
    .line 16
    iget-object v6, v4, La/i3t0;->f:La/oyg0;

    .line 17
    .line 18
    iget-object v7, v4, La/i3t0;->i:La/ocj;

    .line 19
    .line 20
    sget-object v8, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v9, v0, La/mzp0;->j:Z

    .line 23
    .line 24
    if-eqz v9, :cond_1

    .line 25
    .line 26
    if-ne v9, v3, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_8

    .line 36
    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v4, La/nzp0;->u:La/psu;

    .line 41
    .line 42
    iget-object v9, v4, La/nzp0;->p:Ljava/lang/String;

    .line 43
    .line 44
    iput-boolean v3, v0, La/mzp0;->j:Z

    .line 45
    .line 46
    iget-object v2, v2, La/psu;->a:La/xyp0;

    .line 47
    .line 48
    invoke-virtual {v2, v9, v0}, La/xyp0;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v8, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    :goto_0
    if-ne v0, v8, :cond_3

    .line 58
    .line 59
    move-object v5, v8

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_3
    :goto_1
    sget v0, La/nzp0;->z:I

    .line 63
    .line 64
    iget-object v0, v4, La/nzp0;->o:La/vzg0;

    .line 65
    .line 66
    const-string v2, "SUMMARY_FILTER_KEY"

    .line 67
    .line 68
    invoke-virtual {v0, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 73
    .line 74
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, La/fzp0;

    .line 79
    .line 80
    iget-object v9, v9, La/fzp0;->f:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 81
    .line 82
    sget-object v10, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v10, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 88
    .line 89
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-nez v9, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    check-cast v8, La/fzp0;

    .line 100
    .line 101
    iget-object v8, v8, La/fzp0;->f:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 102
    .line 103
    :goto_2
    move-object v15, v8

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    check-cast v9, La/fzp0;

    .line 110
    .line 111
    iget-object v9, v9, La/fzp0;->f:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 112
    .line 113
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_5

    .line 118
    .line 119
    if-eqz v8, :cond_5

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    invoke-virtual {v1}, La/x4u;->f()Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    goto :goto_2

    .line 127
    :goto_3
    invoke-virtual {v0, v2, v15}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v2, La/lcl0;

    .line 135
    .line 136
    const/16 v8, 0x19

    .line 137
    .line 138
    invoke-direct {v2, v4, v15, v5, v8}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    const/4 v8, 0x3

    .line 142
    invoke-static {v0, v5, v5, v2, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 143
    .line 144
    .line 145
    iget-object v8, v7, La/ocj;->a:La/p7m0;

    .line 146
    .line 147
    :cond_6
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-object v9, v0

    .line 155
    check-cast v9, La/fzp0;

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const/16 v16, 0x3f

    .line 162
    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    const/4 v13, 0x0

    .line 167
    invoke-static/range {v9 .. v16}, La/fzp0;->a(La/fzp0;ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;I)La/fzp0;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v8, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_6

    .line 176
    .line 177
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, La/fzp0;

    .line 182
    .line 183
    iget-object v14, v0, La/fzp0;->f:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 184
    .line 185
    invoke-virtual {v1}, La/x4u;->f()Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    xor-int/lit8 v13, v0, 0x1

    .line 194
    .line 195
    iget-object v0, v4, La/nzp0;->x:La/b8u;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v0, v0, La/b8u;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, La/xyp0;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v0, v0, La/xyp0;->c:La/typ0;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v0, v0, La/typ0;->a:La/mxp0;

    .line 216
    .line 217
    iget-object v0, v0, La/mxp0;->a:Ljava/util/Map;

    .line 218
    .line 219
    iget-object v1, v14, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->a:Ljava/lang/String;

    .line 220
    .line 221
    iget-object v2, v14, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 222
    .line 223
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/util/List;

    .line 228
    .line 229
    if-nez v0, :cond_7

    .line 230
    .line 231
    :goto_4
    move-object v12, v5

    .line 232
    goto :goto_6

    .line 233
    :cond_7
    sget-object v1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->c:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 234
    .line 235
    if-eq v2, v1, :cond_b

    .line 236
    .line 237
    sget-object v1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 238
    .line 239
    if-ne v2, v1, :cond_8

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_a

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v3, v1

    .line 257
    check-cast v3, La/uyp0;

    .line 258
    .line 259
    iget-object v3, v3, La/uyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 260
    .line 261
    if-ne v3, v2, :cond_9

    .line 262
    .line 263
    move-object v5, v1

    .line 264
    :cond_a
    check-cast v5, La/uyp0;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_b
    :goto_5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object v5, v0

    .line 272
    check-cast v5, La/uyp0;

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :goto_6
    if-eqz v12, :cond_d

    .line 276
    .line 277
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 278
    .line 279
    :cond_c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-object v8, v1

    .line 287
    check-cast v8, La/fzp0;

    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const/4 v11, 0x0

    .line 293
    const/16 v15, 0x8

    .line 294
    .line 295
    const/4 v9, 0x0

    .line 296
    const/4 v10, 0x0

    .line 297
    invoke-static/range {v8 .. v15}, La/fzp0;->a(La/fzp0;ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;I)La/fzp0;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_c

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 309
    .line 310
    :cond_e
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-object v7, v1

    .line 318
    check-cast v7, La/fzp0;

    .line 319
    .line 320
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const/16 v14, 0x78

    .line 325
    .line 326
    const/4 v8, 0x0

    .line 327
    const/4 v9, 0x0

    .line 328
    const/4 v10, 0x1

    .line 329
    const/4 v11, 0x0

    .line 330
    const/4 v12, 0x0

    .line 331
    invoke-static/range {v7 .. v14}, La/fzp0;->a(La/fzp0;ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;I)La/fzp0;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_e

    .line 340
    .line 341
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    :goto_8
    return-object v5

    .line 344
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 345
    .line 346
    iget-boolean v6, v0, La/mzp0;->j:Z

    .line 347
    .line 348
    if-eqz v6, :cond_10

    .line 349
    .line 350
    if-ne v6, v3, :cond_f

    .line 351
    .line 352
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    goto :goto_9

    .line 356
    :cond_f
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    iget-object v2, v4, La/nzp0;->v:La/osc;

    .line 364
    .line 365
    iput-boolean v3, v0, La/mzp0;->j:Z

    .line 366
    .line 367
    iget-object v0, v2, La/osc;->a:La/xyp0;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    iget-object v0, v0, La/xyp0;->c:La/typ0;

    .line 373
    .line 374
    new-instance v2, La/mxp0;

    .line 375
    .line 376
    sget-object v3, La/lun;->a:La/lun;

    .line 377
    .line 378
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-direct {v2, v3}, La/mxp0;-><init>(Ljava/util/Map;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    iput-object v2, v0, La/typ0;->a:La/mxp0;

    .line 388
    .line 389
    sget-object v2, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    sget-object v2, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 395
    .line 396
    iget-object v0, v0, La/typ0;->b:La/p7m0;

    .line 397
    .line 398
    invoke-virtual {v0, v2}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    if-ne v0, v1, :cond_11

    .line 404
    .line 405
    move-object v5, v1

    .line 406
    goto :goto_a

    .line 407
    :cond_11
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    :goto_a
    return-object v5

    .line 410
    :pswitch_1
    iget-boolean v0, v0, La/mzp0;->j:Z

    .line 411
    .line 412
    sget-object v1, La/wne;->a:La/wne;

    .line 413
    .line 414
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, La/fzp0;

    .line 422
    .line 423
    iget-boolean v1, v1, La/fzp0;->a:Z

    .line 424
    .line 425
    if-nez v1, :cond_12

    .line 426
    .line 427
    if-eqz v0, :cond_13

    .line 428
    .line 429
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    check-cast v0, La/fzp0;

    .line 434
    .line 435
    iget-boolean v0, v0, La/fzp0;->b:Z

    .line 436
    .line 437
    if-eqz v0, :cond_13

    .line 438
    .line 439
    :cond_12
    invoke-virtual {v4}, La/nzp0;->M()V

    .line 440
    .line 441
    .line 442
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
