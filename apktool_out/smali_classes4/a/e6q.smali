.class public final synthetic La/e6q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i6q;


# direct methods
.method public synthetic constructor <init>(La/i6q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e6q;->a:B

    iput-object p1, p0, La/e6q;->b:La/i6q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/e6q;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/e6q;->b:La/i6q;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 11
    .line 12
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget v0, p1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->a:I

    .line 22
    .line 23
    iget-object v3, p1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->b:Ljava/lang/String;

    .line 24
    .line 25
    iput v0, p0, La/r8q;->W:I

    .line 26
    .line 27
    iget-object v0, p0, La/r8q;->e:La/mii0;

    .line 28
    .line 29
    iget-object v4, p0, La/r8q;->N:La/zr1;

    .line 30
    .line 31
    iget-object v5, p1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->d:La/fcq;

    .line 32
    .line 33
    invoke-virtual {v5}, La/fcq;->C()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v4, v4, La/zr1;->a:La/s1p;

    .line 38
    .line 39
    new-instance v7, La/j1p;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    invoke-direct {v7, v6, v8}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v7}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-wide/16 v9, 0xd19

    .line 50
    .line 51
    invoke-virtual {v4, v6, v9, v10}, La/s1p;->a(Ljava/util/Set;J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x3

    .line 59
    const/4 v6, 0x2

    .line 60
    const-string v7, "option"

    .line 61
    .line 62
    const-string v9, "finbet_type_choose"

    .line 63
    .line 64
    if-eq v4, v2, :cond_2

    .line 65
    .line 66
    if-eq v4, v6, :cond_1

    .line 67
    .line 68
    if-eq v4, v5, :cond_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    iget-object v0, v0, La/mii0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/kt2;

    .line 74
    .line 75
    const-string v4, "bull"

    .line 76
    .line 77
    :goto_0
    invoke-static {v7, v4, v0, v9}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object v0, v0, La/mii0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/kt2;

    .line 84
    .line 85
    const-string v4, "bear"

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    iget-object v0, v0, La/mii0;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/kt2;

    .line 91
    .line 92
    const-string v4, "random"

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :goto_1
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v4, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, La/l7q;->c:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_6

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 121
    .line 122
    iget-boolean v9, v7, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->e:Z

    .line 123
    .line 124
    iget-object v10, v7, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->b:Ljava/lang/String;

    .line 125
    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_3

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    iget-boolean v9, v7, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->e:Z

    .line 136
    .line 137
    if-eqz v9, :cond_4

    .line 138
    .line 139
    invoke-static {v7, v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->a(Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;Z)Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_5

    .line 152
    .line 153
    invoke-static {p1, v2}, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->a(Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;Z)Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    iget-object p1, p0, La/r8q;->U:La/p7m0;

    .line 166
    .line 167
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0, v8, v4, v5}, La/l7q;->a(La/l7q;ZLjava/util/List;I)La/l7q;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, La/r8q;->X:La/sje;

    .line 182
    .line 183
    iget-object v0, p0, La/r8q;->i:La/mne;

    .line 184
    .line 185
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 186
    .line 187
    new-instance v2, La/j0l;

    .line 188
    .line 189
    const/16 v3, 0x1d

    .line 190
    .line 191
    invoke-direct {v2, p0, v4, v1, v3}, La/j0l;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1, v0, v1, v2, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 195
    .line 196
    .line 197
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 207
    .line 208
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    iget-object p0, p0, La/r8q;->R:La/p7m0;

    .line 213
    .line 214
    new-instance v0, La/s7q;

    .line 215
    .line 216
    new-instance v2, La/p0d;

    .line 217
    .line 218
    sget-object v3, La/qic;->c:La/qic;

    .line 219
    .line 220
    invoke-direct {v2, p1, v3}, La/p0d;-><init>(ILa/qic;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, v2}, La/s7q;-><init>(La/p0d;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 236
    .line 237
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0}, La/r8q;->E()V

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 253
    .line 254
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iget-object p1, p1, La/l7q;->c:Ljava/util/List;

    .line 268
    .line 269
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-boolean v0, v0, La/l7q;->b:Z

    .line 274
    .line 275
    iget-object p0, p0, La/r8q;->T:La/ol60;

    .line 276
    .line 277
    new-instance v1, La/w7q;

    .line 278
    .line 279
    xor-int/2addr v0, v2

    .line 280
    invoke-direct {v1, p1, v0}, La/w7q;-><init>(Ljava/util/List;Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 290
    .line 291
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    iget-object p1, p1, La/l7q;->c:Ljava/util/List;

    .line 305
    .line 306
    invoke-virtual {p0}, La/r8q;->x()La/l7q;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iget-boolean v0, v0, La/l7q;->b:Z

    .line 311
    .line 312
    iget-object p0, p0, La/r8q;->T:La/ol60;

    .line 313
    .line 314
    new-instance v1, La/w7q;

    .line 315
    .line 316
    xor-int/2addr v0, v2

    .line 317
    invoke-direct {v1, p1, v0}, La/w7q;-><init>(Ljava/util/List;Z)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 327
    .line 328
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-virtual {p0}, La/r8q;->E()V

    .line 338
    .line 339
    .line 340
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
