.class public final synthetic La/rh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ij3;


# direct methods
.method public synthetic constructor <init>(La/ij3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rh3;->a:B

    iput-object p1, p0, La/rh3;->b:La/ij3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/rh3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/rh3;->b:La/ij3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/ij3;->m0:La/jo20;

    .line 11
    .line 12
    sget-object v2, La/kh3;->e:La/kh3;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/g8d;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v2, La/rh3;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1}, La/rh3;-><init>(La/ij3;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, v2}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    iget-object p0, p0, La/ij3;->f0:La/p7m0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v0, v0, La/mg3;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/lg3;->a:La/lg3;

    .line 47
    .line 48
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    iget-object p0, p0, La/ij3;->d:La/pru;

    .line 55
    .line 56
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_2
    iget-object v0, p0, La/ij3;->m0:La/jo20;

    .line 62
    .line 63
    sget-object v1, La/kh3;->d:La/kh3;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/g8d;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    new-instance v1, La/rh3;

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v1, p0, v2}, La/rh3;-><init>(La/ij3;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0, v1}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_3
    iget-object v0, p0, La/ij3;->m0:La/jo20;

    .line 86
    .line 87
    sget-object v3, La/kh3;->f:La/kh3;

    .line 88
    .line 89
    invoke-virtual {v0, v3}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, La/g8d;

    .line 94
    .line 95
    if-eqz v3, :cond_7

    .line 96
    .line 97
    sget-object v4, La/kh3;->g:La/kh3;

    .line 98
    .line 99
    invoke-virtual {v0, v4}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, La/g8d;

    .line 104
    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    sget-object v5, La/kh3;->h:La/kh3;

    .line 108
    .line 109
    invoke-virtual {v0, v5}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, La/g8d;

    .line 114
    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    sget-object v6, La/kh3;->i:La/kh3;

    .line 118
    .line 119
    invoke-virtual {v0, v6}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, La/g8d;

    .line 124
    .line 125
    if-eqz v6, :cond_4

    .line 126
    .line 127
    sget-object v7, La/kh3;->k:La/kh3;

    .line 128
    .line 129
    invoke-virtual {v0, v7}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, La/g8d;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    iget-object v7, p0, La/ij3;->i0:Ljava/util/ArrayList;

    .line 138
    .line 139
    iget-object v8, v3, La/g8d;->c:La/gmq;

    .line 140
    .line 141
    iget-object v9, v4, La/g8d;->c:La/gmq;

    .line 142
    .line 143
    iget-object v10, v5, La/g8d;->c:La/gmq;

    .line 144
    .line 145
    iget-object v11, v6, La/g8d;->c:La/gmq;

    .line 146
    .line 147
    iget-object v12, v0, La/g8d;->c:La/gmq;

    .line 148
    .line 149
    const/4 v13, 0x5

    .line 150
    new-array v13, v13, [La/gmq;

    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    aput-object v8, v13, v14

    .line 154
    .line 155
    const/4 v8, 0x1

    .line 156
    aput-object v9, v13, v8

    .line 157
    .line 158
    const/4 v8, 0x2

    .line 159
    aput-object v10, v13, v8

    .line 160
    .line 161
    aput-object v11, v13, v1

    .line 162
    .line 163
    const/4 v1, 0x4

    .line 164
    aput-object v12, v13, v1

    .line 165
    .line 166
    invoke-static {v13}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-array v8, v14, [La/gmq;

    .line 175
    .line 176
    invoke-interface {v1, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, [La/gmq;

    .line 181
    .line 182
    new-instance v8, La/c00;

    .line 183
    .line 184
    const/16 v9, 0x8

    .line 185
    .line 186
    invoke-direct {v8, v1, p0, v9}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-object v9, p0, La/ij3;->e:La/mne;

    .line 194
    .line 195
    iget-object v9, v9, La/mne;->c:La/vs10;

    .line 196
    .line 197
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v9, La/ui3;->h:La/ui3;

    .line 202
    .line 203
    invoke-static {v8, v1, v9}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v3, v2}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La/mc;

    .line 214
    .line 215
    const/16 v3, 0x1a

    .line 216
    .line 217
    invoke-direct {v1, p0, v5, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v4, v1}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v6, v2}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0, v2}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 227
    .line 228
    .line 229
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_3
    invoke-static {}, La/itt0;->a()V

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_4
    invoke-static {}, La/itt0;->a()V

    .line 237
    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_5
    invoke-static {}, La/itt0;->a()V

    .line 241
    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_6
    invoke-static {}, La/itt0;->a()V

    .line 245
    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_7
    invoke-static {}, La/itt0;->a()V

    .line 249
    .line 250
    .line 251
    :goto_0
    return-object v2

    .line 252
    :pswitch_4
    iget-object p0, p0, La/ij3;->f0:La/p7m0;

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    sget-object v0, La/ng3;->a:La/ng3;

    .line 258
    .line 259
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_5
    iget-object v0, p0, La/ij3;->M:La/rkt0;

    .line 266
    .line 267
    new-instance v1, La/smi0;

    .line 268
    .line 269
    sget-object v2, La/umi0;->c:La/umi0;

    .line 270
    .line 271
    iget-object p0, p0, La/ij3;->d:La/pru;

    .line 272
    .line 273
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    iget-boolean p0, p0, La/sff0;->P0:Z

    .line 278
    .line 279
    invoke-direct {v1, v2, p0}, La/smi0;-><init>(La/umi0;Z)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v1}, La/rkt0;->f(La/smi0;)V

    .line 283
    .line 284
    .line 285
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_6
    iget-object v0, p0, La/ij3;->b:La/vzg0;

    .line 289
    .line 290
    const-class v1, La/veo;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {v0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iget-object p0, p0, La/ij3;->j0:La/p7m0;

    .line 302
    .line 303
    :cond_8
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v1, v0

    .line 308
    check-cast v1, La/jh3;

    .line 309
    .line 310
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    move-object v2, v1

    .line 315
    check-cast v2, La/jh3;

    .line 316
    .line 317
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, La/jh3;

    .line 322
    .line 323
    iget-object v1, v1, La/jh3;->j:Ljava/util/Set;

    .line 324
    .line 325
    sget-object v3, La/veo;->a:La/veo;

    .line 326
    .line 327
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Ljava/lang/Iterable;

    .line 332
    .line 333
    invoke-static {v1, v3}, La/eui0;->g(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 334
    .line 335
    .line 336
    move-result-object v10

    .line 337
    const/4 v12, 0x0

    .line 338
    const/16 v13, 0xdff

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    const/4 v4, 0x0

    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    const/4 v7, 0x0

    .line 345
    const/4 v8, 0x0

    .line 346
    const/4 v9, 0x0

    .line 347
    const/4 v11, 0x0

    .line 348
    invoke-static/range {v2 .. v13}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_8

    .line 357
    .line 358
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
