.class public final La/rxn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Z

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Enum;


# direct methods
.method public constructor <init>(La/o43;ZLa/k43;ZLa/c0d;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/rxn;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/rxn;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/rxn;->j:Z

    .line 7
    .line 8
    iput-object p3, p0, La/rxn;->n:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, La/rxn;->l:Z

    .line 11
    .line 12
    iput-object p5, p0, La/rxn;->o:Ljava/lang/Enum;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/vff0;La/rhi0;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/rxn;->i:B

    .line 19
    iput-object p1, p0, La/rxn;->n:Ljava/lang/Object;

    iput-object p2, p0, La/rxn;->o:Ljava/lang/Enum;

    iput-boolean p3, p0, La/rxn;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rxn;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/rxn;->o:Ljava/lang/Enum;

    .line 4
    .line 5
    iget-object v2, p0, La/rxn;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/rxn;

    .line 11
    .line 12
    check-cast v2, La/vff0;

    .line 13
    .line 14
    check-cast v1, La/rhi0;

    .line 15
    .line 16
    iget-boolean p0, p0, La/rxn;->l:Z

    .line 17
    .line 18
    invoke-direct {v0, v2, v1, p0, p2}, La/rxn;-><init>(La/vff0;La/rhi0;ZLa/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/rxn;->k:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v3, La/rxn;

    .line 25
    .line 26
    iget-object v0, p0, La/rxn;->m:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, La/o43;

    .line 30
    .line 31
    iget-boolean v5, p0, La/rxn;->j:Z

    .line 32
    .line 33
    move-object v6, v2

    .line 34
    check-cast v6, La/k43;

    .line 35
    .line 36
    iget-boolean v7, p0, La/rxn;->l:Z

    .line 37
    .line 38
    move-object v8, v1

    .line 39
    check-cast v8, La/c0d;

    .line 40
    .line 41
    move-object v9, p2

    .line 42
    invoke-direct/range {v3 .. v9}, La/rxn;-><init>(La/o43;ZLa/k43;ZLa/c0d;La/yje;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v3, La/rxn;->k:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v3

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rxn;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rxn;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rxn;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/rxn;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/rxn;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/vne;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-boolean v3, p0, La/rxn;->j:Z

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, La/rxn;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object v10, p0

    .line 28
    move-object v8, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/rxn;->n:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, La/vff0;

    .line 43
    .line 44
    iget-object p1, p1, La/vff0;->f:La/us3;

    .line 45
    .line 46
    invoke-virtual {p1}, La/us3;->c()La/go3;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, La/go3;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    iget-object p1, p0, La/rxn;->n:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/vff0;

    .line 57
    .line 58
    iget-object p1, p1, La/vff0;->b:La/a1d;

    .line 59
    .line 60
    iput-object v0, p0, La/rxn;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v8, p0, La/rxn;->m:Ljava/lang/Object;

    .line 63
    .line 64
    iput-boolean v4, p0, La/rxn;->j:Z

    .line 65
    .line 66
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, La/sza;

    .line 69
    .line 70
    invoke-virtual {p1}, La/sza;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v5, p1

    .line 75
    check-cast v5, La/zff0;

    .line 76
    .line 77
    const-string v9, "application/vnd.xenvelop+json"

    .line 78
    .line 79
    const-string v6, "org.xbet.client1"

    .line 80
    .line 81
    const/16 v7, 0x16

    .line 82
    .line 83
    move-object v10, p0

    .line 84
    invoke-interface/range {v5 .. v10}, La/zff0;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v2, :cond_2

    .line 89
    .line 90
    move-object v1, v2

    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_2
    :goto_0
    check-cast p1, La/dx5;

    .line 94
    .line 95
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/mwn;

    .line 100
    .line 101
    iget-object p1, v10, La/rxn;->n:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, La/vff0;

    .line 104
    .line 105
    iget-object v0, v10, La/rxn;->o:Ljava/lang/Enum;

    .line 106
    .line 107
    check-cast v0, La/rhi0;

    .line 108
    .line 109
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 110
    .line 111
    iget-object v2, p1, La/vff0;->g:La/nrd;

    .line 112
    .line 113
    iget-object p1, p1, La/vff0;->h:La/vby;

    .line 114
    .line 115
    invoke-virtual {v2, p0, v0, p1}, La/nrd;->a(La/mwn;La/rhi0;La/vby;)La/yff0;

    .line 116
    .line 117
    .line 118
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 123
    .line 124
    new-instance v0, La/g0g0;

    .line 125
    .line 126
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object p1, v0

    .line 130
    :goto_1
    nop

    .line 131
    instance-of v0, p1, La/g0g0;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    move-object p1, v1

    .line 136
    :cond_3
    check-cast p1, La/yff0;

    .line 137
    .line 138
    if-nez p1, :cond_4

    .line 139
    .line 140
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    goto/16 :goto_4

    .line 143
    .line 144
    :cond_4
    iget-object v0, v10, La/rxn;->n:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/vff0;

    .line 147
    .line 148
    iget-object v2, v10, La/rxn;->o:Ljava/lang/Enum;

    .line 149
    .line 150
    check-cast v2, La/rhi0;

    .line 151
    .line 152
    iget-object v3, v0, La/vff0;->g:La/nrd;

    .line 153
    .line 154
    iget-object v5, v0, La/vff0;->h:La/vby;

    .line 155
    .line 156
    iget-object v6, p0, La/mwn;->b:Ljava/lang/String;

    .line 157
    .line 158
    if-nez v6, :cond_5

    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_5
    iget-object p0, v0, La/vff0;->e:La/wti;

    .line 163
    .line 164
    invoke-virtual {p0}, La/wti;->s()La/mwn;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {v3, p0, v2, v5}, La/nrd;->a(La/mwn;La/rhi0;La/vby;)La/yff0;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    iget-object p0, p0, La/yff0;->a:La/wrd;

    .line 173
    .line 174
    invoke-static {p0, v5}, La/lmc;->Y(La/wrd;La/vby;)La/edy;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-direct {v7, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 181
    .line 182
    .line 183
    :try_start_1
    invoke-virtual {v0, v2}, La/vff0;->b(La/rhi0;)La/yff0;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, La/yff0;->a:La/wrd;

    .line 188
    .line 189
    invoke-static {p0, v5}, La/lmc;->Y(La/wrd;La/vby;)La/edy;

    .line 190
    .line 191
    .line 192
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    goto :goto_2

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    move-object p0, v0

    .line 196
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 197
    .line 198
    new-instance v0, La/g0g0;

    .line 199
    .line 200
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    move-object p0, v0

    .line 204
    :goto_2
    sget-object v0, La/lun;->a:La/lun;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    instance-of v9, p0, La/g0g0;

    .line 210
    .line 211
    if-eqz v9, :cond_6

    .line 212
    .line 213
    move-object p0, v0

    .line 214
    :cond_6
    check-cast p0, Ljava/util/Map;

    .line 215
    .line 216
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 217
    .line 218
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 219
    .line 220
    .line 221
    iget-object p0, p1, La/yff0;->a:La/wrd;

    .line 222
    .line 223
    invoke-static {p0, v5}, La/lmc;->Y(La/wrd;La/vby;)La/edy;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    new-instance p1, Ljava/util/HashMap;

    .line 228
    .line 229
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    add-int/2addr v11, v9

    .line 238
    iget-object v9, p0, La/edy;->a:Ljava/util/Map;

    .line 239
    .line 240
    invoke-interface {v9}, Ljava/util/Map;->size()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    add-int/2addr v9, v11

    .line 245
    invoke-direct {p1, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v7}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    new-instance p0, La/yff0;

    .line 258
    .line 259
    invoke-static {p1, v5}, La/lmc;->X(Ljava/util/HashMap;La/vby;)La/wrd;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-direct {p0, p1}, La/yff0;-><init>(La/wrd;)V

    .line 264
    .line 265
    .line 266
    sget-object p1, La/yff0;->Companion:La/xff0;

    .line 267
    .line 268
    invoke-virtual {p1}, La/xff0;->serializer()La/jiy;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    check-cast p1, La/jiy;

    .line 273
    .line 274
    invoke-virtual {v5, p1, p0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 279
    .line 280
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v0, v3, La/nrd;->a:La/ref;

    .line 288
    .line 289
    :try_start_2
    invoke-virtual {v0, v2}, La/ref;->b(La/rhi0;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v6}, La/zvv;->c(Ljava/lang/String;)[B

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 305
    .line 306
    const-string v3, "AES"

    .line 307
    .line 308
    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 309
    .line 310
    .line 311
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 312
    .line 313
    invoke-direct {v3, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 314
    .line 315
    .line 316
    const-string v5, "AES/CBC/PKCS5Padding"

    .line 317
    .line 318
    invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-virtual {v5, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {p0}, La/zvv;->g([B)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-static {p1, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 341
    .line 342
    .line 343
    new-instance p1, La/mwn;

    .line 344
    .line 345
    invoke-direct {p1, p0, v6}, La/mwn;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    move-object p0, p1

    .line 349
    :goto_3
    iget-object p1, v10, La/rxn;->n:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p1, La/vff0;

    .line 352
    .line 353
    iget-object p1, p1, La/vff0;->d:La/asd;

    .line 354
    .line 355
    iget-object v0, v10, La/rxn;->o:Ljava/lang/Enum;

    .line 356
    .line 357
    check-cast v0, La/rhi0;

    .line 358
    .line 359
    invoke-virtual {p1, p0, v8, v0}, La/asd;->e(La/mwn;Ljava/lang/String;La/rhi0;)V

    .line 360
    .line 361
    .line 362
    iget-object p1, v10, La/rxn;->n:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p1, La/vff0;

    .line 365
    .line 366
    iget-object v0, v10, La/rxn;->o:Ljava/lang/Enum;

    .line 367
    .line 368
    check-cast v0, La/rhi0;

    .line 369
    .line 370
    iget-boolean v1, v10, La/rxn;->l:Z

    .line 371
    .line 372
    iget-object v2, p1, La/vff0;->g:La/nrd;

    .line 373
    .line 374
    iget-object v3, p1, La/vff0;->h:La/vby;

    .line 375
    .line 376
    invoke-virtual {v2, p0, v0, v3}, La/nrd;->a(La/mwn;La/rhi0;La/vby;)La/yff0;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    iget-object v2, p1, La/vff0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 381
    .line 382
    invoke-virtual {v2, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    iget-object v0, p1, La/vff0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1, p0, v1}, La/vff0;->c(La/yff0;Z)La/sff0;

    .line 391
    .line 392
    .line 393
    invoke-static {p0}, La/vff0;->i(La/yff0;)Ljava/util/ArrayList;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    iput-object p0, p1, La/vff0;->o:Ljava/util/List;

    .line 398
    .line 399
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    goto :goto_4

    .line 402
    :catchall_2
    move-exception v0

    .line 403
    move-object p0, v0

    .line 404
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 405
    .line 406
    new-instance p1, La/g0g0;

    .line 407
    .line 408
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    if-nez p0, :cond_7

    .line 416
    .line 417
    invoke-static {}, La/csj;->b()V

    .line 418
    .line 419
    .line 420
    goto :goto_4

    .line 421
    :cond_7
    const-string p0, "Config encryption error"

    .line 422
    .line 423
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    :goto_4
    return-object v1

    .line 427
    :pswitch_0
    move-object v10, p0

    .line 428
    iget-object p0, v10, La/rxn;->k:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p0, La/vne;

    .line 431
    .line 432
    sget-object v0, La/wne;->a:La/wne;

    .line 433
    .line 434
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance v4, La/zsf;

    .line 438
    .line 439
    const/4 p1, 0x0

    .line 440
    const/high16 v0, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v2, 0x3ed70a3d    # 0.42f

    .line 443
    .line 444
    .line 445
    invoke-direct {v4, v2, p1, v0, v0}, La/zsf;-><init>(FFFF)V

    .line 446
    .line 447
    .line 448
    iget-object p1, v10, La/rxn;->m:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast p1, La/o43;

    .line 451
    .line 452
    iget-boolean v0, v10, La/rxn;->j:Z

    .line 453
    .line 454
    iget-object v2, v10, La/rxn;->n:Ljava/lang/Object;

    .line 455
    .line 456
    move-object v11, v2

    .line 457
    check-cast v11, La/k43;

    .line 458
    .line 459
    iget-boolean v9, v10, La/rxn;->l:Z

    .line 460
    .line 461
    iget-object v2, v10, La/rxn;->o:Ljava/lang/Enum;

    .line 462
    .line 463
    move-object v12, v2

    .line 464
    check-cast v12, La/c0d;

    .line 465
    .line 466
    const/4 v13, 0x3

    .line 467
    if-eqz v0, :cond_8

    .line 468
    .line 469
    iget-object v0, p1, La/o43;->g:La/wz40;

    .line 470
    .line 471
    iget-object v0, v0, La/wz40;->a:Ljava/lang/Object;

    .line 472
    .line 473
    move-object v3, v0

    .line 474
    check-cast v3, La/t33;

    .line 475
    .line 476
    iget-object v7, p1, La/o43;->e:La/t33;

    .line 477
    .line 478
    move-object v6, v4

    .line 479
    invoke-interface {v11}, La/k43;->i()J

    .line 480
    .line 481
    .line 482
    move-result-wide v4

    .line 483
    new-instance v2, La/qxn;

    .line 484
    .line 485
    const/4 v8, 0x0

    .line 486
    invoke-direct/range {v2 .. v8}, La/qxn;-><init>(La/t33;JLa/zsf;La/t33;La/yje;)V

    .line 487
    .line 488
    .line 489
    move-object v4, v6

    .line 490
    invoke-static {p0, v1, v1, v2, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 491
    .line 492
    .line 493
    :cond_8
    if-eqz v9, :cond_9

    .line 494
    .line 495
    iget-object v0, p1, La/o43;->g:La/wz40;

    .line 496
    .line 497
    iget-object v0, v0, La/wz40;->a:Ljava/lang/Object;

    .line 498
    .line 499
    move-object v5, v0

    .line 500
    check-cast v5, La/t33;

    .line 501
    .line 502
    iget-object v3, p1, La/o43;->e:La/t33;

    .line 503
    .line 504
    invoke-interface {v11}, La/k43;->d()J

    .line 505
    .line 506
    .line 507
    move-result-wide v6

    .line 508
    new-instance v2, La/se5;

    .line 509
    .line 510
    const/4 v8, 0x0

    .line 511
    const/4 v9, 0x3

    .line 512
    invoke-direct/range {v2 .. v9}, La/se5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 513
    .line 514
    .line 515
    invoke-static {p0, v1, v1, v2, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 516
    .line 517
    .line 518
    :cond_9
    sget-object v0, La/c0d;->b:La/c0d;

    .line 519
    .line 520
    if-eq v12, v0, :cond_a

    .line 521
    .line 522
    sget-object v0, La/c0d;->c:La/c0d;

    .line 523
    .line 524
    if-ne v12, v0, :cond_b

    .line 525
    .line 526
    :cond_a
    iget-object v0, p1, La/o43;->g:La/wz40;

    .line 527
    .line 528
    iget-object v0, v0, La/wz40;->a:Ljava/lang/Object;

    .line 529
    .line 530
    move-object v5, v0

    .line 531
    check-cast v5, La/t33;

    .line 532
    .line 533
    iget-object v3, p1, La/o43;->f:La/t33;

    .line 534
    .line 535
    iget-object v8, p1, La/o43;->d:La/t33;

    .line 536
    .line 537
    invoke-interface {v11}, La/k43;->d()J

    .line 538
    .line 539
    .line 540
    move-result-wide v6

    .line 541
    new-instance v2, La/mee;

    .line 542
    .line 543
    const/4 v9, 0x0

    .line 544
    const/4 v10, 0x2

    .line 545
    invoke-direct/range {v2 .. v10}, La/mee;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 546
    .line 547
    .line 548
    invoke-static {p0, v1, v1, v2, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 549
    .line 550
    .line 551
    :cond_b
    sget-object v0, La/c0d;->e:La/c0d;

    .line 552
    .line 553
    if-ne v12, v0, :cond_c

    .line 554
    .line 555
    iget-object p1, p1, La/o43;->f:La/t33;

    .line 556
    .line 557
    new-instance v0, La/o73;

    .line 558
    .line 559
    const/4 v2, 0x4

    .line 560
    invoke-direct {v0, p1, v4, v1, v2}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 561
    .line 562
    .line 563
    invoke-static {p0, v1, v1, v0, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 564
    .line 565
    .line 566
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object p0

    .line 569
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
