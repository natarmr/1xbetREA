.class public final La/snn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public final synthetic l:La/i3t0;


# direct methods
.method public constructor <init>(ILa/khp;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/snn;->i:B

    .line 3
    .line 4
    iput p1, p0, La/snn;->k:I

    .line 5
    .line 6
    iput-object p2, p0, La/snn;->l:La/i3t0;

    .line 7
    .line 8
    invoke-direct {p0, v0, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(La/i3t0;ILa/yje;B)V
    .locals 0

    .line 12
    iput-byte p4, p0, La/snn;->i:B

    iput-object p1, p0, La/snn;->l:La/i3t0;

    iput p2, p0, La/snn;->k:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/snn;->i:B

    .line 2
    .line 3
    iget v1, p0, La/snn;->k:I

    .line 4
    .line 5
    iget-object p0, p0, La/snn;->l:La/i3t0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/snn;

    .line 11
    .line 12
    check-cast p0, La/o9g0;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v0, p0, v1, p1, v2}, La/snn;-><init>(La/i3t0;ILa/yje;B)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/snn;

    .line 20
    .line 21
    check-cast p0, La/khp;

    .line 22
    .line 23
    invoke-direct {v0, v1, p0, p1}, La/snn;-><init>(ILa/khp;La/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    new-instance v0, La/snn;

    .line 28
    .line 29
    check-cast p0, La/wnn;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, p0, v1, p1, v2}, La/snn;-><init>(La/i3t0;ILa/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/snn;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/snn;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/snn;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/snn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/snn;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/snn;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/snn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/snn;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/snn;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/snn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/snn;->i:B

    .line 2
    .line 3
    iget v1, p0, La/snn;->k:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/snn;->l:La/i3t0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, La/o9g0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/snn;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v4, La/o9g0;->u:La/rpt;

    .line 36
    .line 37
    iget-object v2, v4, La/o9g0;->p:Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 38
    .line 39
    iget v2, v2, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;->a:I

    .line 40
    .line 41
    iput-boolean v3, p0, La/snn;->j:Z

    .line 42
    .line 43
    invoke-virtual {p1, v2, v1, p0}, La/rpt;->j(IILa/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    move-object v5, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    check-cast p1, La/rzv;

    .line 52
    .line 53
    iget-object p0, v4, La/o9g0;->v:La/w4p0;

    .line 54
    .line 55
    new-instance v0, La/cqk0;

    .line 56
    .line 57
    invoke-direct {v0, p1}, La/cqk0;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, La/b6t;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/b6t;->d(La/dqk0;)V

    .line 68
    .line 69
    .line 70
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_1
    return-object v5

    .line 73
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-boolean v6, p0, La/snn;->j:Z

    .line 76
    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    if-ne v6, v3, :cond_3

    .line 80
    .line 81
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, La/ygp;->N1:La/c0o;

    .line 95
    .line 96
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/ygp;

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    check-cast v4, La/khp;

    .line 105
    .line 106
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/hhp;

    .line 111
    .line 112
    iget-object v1, v1, La/hhp;->b:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move-object v6, v2

    .line 129
    check-cast v6, La/xgp;

    .line 130
    .line 131
    iget-object v6, v6, La/xgp;->a:La/ygp;

    .line 132
    .line 133
    if-ne v6, p1, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    move-object v2, v5

    .line 137
    :goto_2
    check-cast v2, La/xgp;

    .line 138
    .line 139
    if-eqz v2, :cond_8

    .line 140
    .line 141
    iget-object v1, v4, La/khp;->o:La/dot;

    .line 142
    .line 143
    iget-boolean v2, v2, La/xgp;->b:Z

    .line 144
    .line 145
    xor-int/2addr v2, v3

    .line 146
    iput-boolean v3, p0, La/snn;->j:Z

    .line 147
    .line 148
    iget-object p0, v1, La/dot;->a:La/j1q0;

    .line 149
    .line 150
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 151
    .line 152
    iget-object v1, p0, La/m1q0;->a:La/q7d0;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    new-instance v4, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v3, "FEATURE_TOGGLE_POSTFIX"

    .line 167
    .line 168
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v1, v3, v2}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, La/m1q0;->c:Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget-object p0, p0, La/m1q0;->d:La/p7m0;

    .line 188
    .line 189
    new-instance p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_7

    .line 211
    .line 212
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, Ljava/util/Map$Entry;

    .line 217
    .line 218
    new-instance v3, La/xgp;

    .line 219
    .line 220
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, La/ygp;

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-direct {v3, v4, v2}, La/xgp;-><init>(La/ygp;Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_7
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    sget-object p1, La/wne;->a:La/wne;

    .line 249
    .line 250
    if-ne p0, v0, :cond_8

    .line 251
    .line 252
    move-object v5, v0

    .line 253
    goto :goto_5

    .line 254
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_5
    return-object v5

    .line 257
    :pswitch_1
    check-cast v4, La/wnn;

    .line 258
    .line 259
    sget-object v0, La/wne;->a:La/wne;

    .line 260
    .line 261
    iget-boolean v6, p0, La/snn;->j:Z

    .line 262
    .line 263
    if-eqz v6, :cond_a

    .line 264
    .line 265
    if-ne v6, v3, :cond_9

    .line 266
    .line 267
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p1, La/inn;

    .line 283
    .line 284
    iget-object p1, p1, La/inn;->c:Ljava/util/List;

    .line 285
    .line 286
    if-ltz v1, :cond_d

    .line 287
    .line 288
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-ge v1, v2, :cond_d

    .line 293
    .line 294
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, La/q4f;

    .line 299
    .line 300
    iget-object v1, v4, La/wnn;->z:La/fht0;

    .line 301
    .line 302
    invoke-virtual {v1, p1}, La/fht0;->n(La/q4f;)V

    .line 303
    .line 304
    .line 305
    iget-object p1, v4, La/wnn;->r:La/m1e;

    .line 306
    .line 307
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    iput-boolean v3, p0, La/snn;->j:Z

    .line 312
    .line 313
    invoke-static {p1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    if-ne p1, v0, :cond_b

    .line 318
    .line 319
    move-object v5, v0

    .line 320
    goto :goto_7

    .line 321
    :cond_b
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    if-nez p0, :cond_c

    .line 328
    .line 329
    sget p0, La/wnn;->g0:I

    .line 330
    .line 331
    invoke-virtual {v4}, La/wnn;->S()V

    .line 332
    .line 333
    .line 334
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_c
    sget p0, La/wnn;->g0:I

    .line 338
    .line 339
    invoke-virtual {v4}, La/wnn;->T()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4}, La/wnn;->R()V

    .line 343
    .line 344
    .line 345
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_d
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    :goto_7
    return-object v5

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
