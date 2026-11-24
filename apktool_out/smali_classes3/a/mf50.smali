.class public final La/mf50;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:[La/iiy;


# instance fields
.field public final a:La/wu4;

.field public final b:La/p7m0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mf50;

    .line 4
    .line 5
    const-string v2, "stack"

    .line 6
    .line 7
    const-string v3, "getStack()Lorg/xplatform/core/navigation/router/navigation_stack/model/NavigationStack;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/mf50;->c:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/wu4;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mf50;->a:La/wu4;

    .line 8
    .line 9
    new-instance p1, La/lf50;

    .line 10
    .line 11
    sget-object v5, La/iun;->a:La/iun;

    .line 12
    .line 13
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 14
    .line 15
    new-instance v4, La/pu4;

    .line 16
    .line 17
    invoke-direct {v4, v3}, La/pu4;-><init>(La/bjk;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/pe50;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    move-object v6, v5

    .line 25
    invoke-direct/range {v0 .. v6}, La/pe50;-><init>(La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v5, v1, v0}, La/lf50;-><init>(Ljava/util/List;La/re50;La/pe50;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/mf50;->b:La/p7m0;

    .line 36
    .line 37
    return-void
.end method

.method public static f(La/m7h0;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/sre0;->a:La/tre0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, La/sgy;->v()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    new-instance v1, Lkotlin/text/Regex;

    .line 26
    .line 27
    const-string v2, "[A-Z][a-zA-Z]+"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, La/bh30;->getValue()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0

    .line 46
    :cond_2
    :goto_0
    invoke-interface {p0}, La/m7h0;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method


# virtual methods
.method public final a(La/g1w0;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-eqz v1, :cond_42

    .line 9
    .line 10
    instance-of v2, v1, La/a1w0;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    new-instance v0, La/sd50;

    .line 15
    .line 16
    check-cast v1, La/a1w0;

    .line 17
    .line 18
    iget-object v1, v1, La/a1w0;->a:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/sd50;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    instance-of v2, v1, La/b1w0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    new-instance v0, La/ne50;

    .line 33
    .line 34
    check-cast v1, La/b1w0;

    .line 35
    .line 36
    iget-object v1, v1, La/b1w0;->a:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/ne50;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    instance-of v2, v1, La/w0w0;

    .line 47
    .line 48
    iget-object v8, v0, La/mf50;->b:La/p7m0;

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    check-cast v1, La/w0w0;

    .line 53
    .line 54
    iget-object v2, v1, La/w0w0;->a:La/m7h0;

    .line 55
    .line 56
    :cond_2
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v3, v1

    .line 61
    check-cast v3, La/lf50;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v2}, La/qxw;->N(La/lf50;La/m7h0;)La/lf50;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v8, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    instance-of v1, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    new-instance v1, La/le50;

    .line 81
    .line 82
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 83
    .line 84
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, La/lf50;->c:La/pe50;

    .line 89
    .line 90
    iget-object v0, v0, La/pe50;->c:La/bjk;

    .line 91
    .line 92
    invoke-direct {v1, v2, v0}, La/le50;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;La/bjk;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    new-instance v1, La/fe50;

    .line 97
    .line 98
    invoke-direct {v1, v2}, La/fe50;-><init>(La/m7h0;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :cond_4
    instance-of v2, v1, La/d1w0;

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    check-cast v1, La/d1w0;

    .line 112
    .line 113
    iget-object v1, v1, La/d1w0;->a:La/m7h0;

    .line 114
    .line 115
    new-instance v2, La/rrj;

    .line 116
    .line 117
    invoke-direct {v2, v1, v4}, La/rrj;-><init>(La/m7h0;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, La/mf50;->g(Lkotlin/jvm/functions/Function1;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, La/ke50;

    .line 124
    .line 125
    invoke-direct {v0, v1}, La/ke50;-><init>(La/m7h0;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :cond_5
    instance-of v2, v1, La/y0w0;

    .line 134
    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    move-object v0, v1

    .line 138
    check-cast v0, La/y0w0;

    .line 139
    .line 140
    iget-object v9, v0, La/y0w0;->a:La/m7h0;

    .line 141
    .line 142
    :cond_6
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    move-object v0, v10

    .line 147
    check-cast v0, La/lf50;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v0, La/vul0;

    .line 153
    .line 154
    invoke-direct {v0, v9}, La/vul0;-><init>(La/m7h0;)V

    .line 155
    .line 156
    .line 157
    new-instance v1, La/ue50;

    .line 158
    .line 159
    invoke-direct {v1, v0}, La/ue50;-><init>(La/wul0;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    new-instance v4, La/pu4;

    .line 167
    .line 168
    invoke-direct {v4, v3}, La/pu4;-><init>(La/bjk;)V

    .line 169
    .line 170
    .line 171
    sget-object v5, La/iun;->a:La/iun;

    .line 172
    .line 173
    new-instance v0, La/pe50;

    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    const/4 v2, 0x0

    .line 177
    move-object v6, v5

    .line 178
    invoke-direct/range {v0 .. v6}, La/pe50;-><init>(La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    new-instance v1, La/lf50;

    .line 185
    .line 186
    invoke-direct {v1, v11, v7, v0}, La/lf50;-><init>(Ljava/util/List;La/re50;La/pe50;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v10, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    new-instance v0, La/he50;

    .line 196
    .line 197
    invoke-direct {v0, v9}, La/he50;-><init>(La/m7h0;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :cond_7
    instance-of v2, v1, La/p0w0;

    .line 206
    .line 207
    if-eqz v2, :cond_b

    .line 208
    .line 209
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object v1, v1, La/lf50;->b:La/re50;

    .line 214
    .line 215
    if-eqz v1, :cond_8

    .line 216
    .line 217
    :goto_1
    move v2, v4

    .line 218
    goto :goto_2

    .line 219
    :cond_8
    const/4 v4, 0x0

    .line 220
    goto :goto_1

    .line 221
    :goto_2
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iget-object v1, v1, La/lf50;->c:La/pe50;

    .line 226
    .line 227
    iget-object v5, v1, La/pe50;->f:Ljava/util/List;

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    move-object v3, v1

    .line 234
    check-cast v3, La/lf50;

    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v3}, La/qxw;->t(La/lf50;)La/lf50;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v8, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_9

    .line 248
    .line 249
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    sget-object v3, La/td50;->a:La/td50;

    .line 254
    .line 255
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_a

    .line 259
    .line 260
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iget-object v0, v0, La/lf50;->b:La/re50;

    .line 265
    .line 266
    if-nez v0, :cond_a

    .line 267
    .line 268
    new-instance v0, La/ce50;

    .line 269
    .line 270
    invoke-direct {v0, v5}, La/ce50;-><init>(Ljava/util/List;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    :cond_a
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0

    .line 281
    :cond_b
    instance-of v2, v1, La/q0w0;

    .line 282
    .line 283
    if-eqz v2, :cond_d

    .line 284
    .line 285
    move-object v0, v1

    .line 286
    check-cast v0, La/q0w0;

    .line 287
    .line 288
    iget-object v2, v0, La/q0w0;->a:La/m7h0;

    .line 289
    .line 290
    :cond_c
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    move-object v1, v0

    .line 295
    check-cast v1, La/lf50;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v1, v2}, La/qxw;->u(La/lf50;La/m7h0;)La/lf50;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_c

    .line 309
    .line 310
    new-instance v0, La/ud50;

    .line 311
    .line 312
    invoke-direct {v0, v2}, La/ud50;-><init>(La/m7h0;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    return-object v0

    .line 320
    :cond_d
    instance-of v2, v1, La/f1w0;

    .line 321
    .line 322
    const/4 v5, 0x6

    .line 323
    if-eqz v2, :cond_f

    .line 324
    .line 325
    move-object v0, v1

    .line 326
    check-cast v0, La/f1w0;

    .line 327
    .line 328
    iget-object v2, v0, La/f1w0;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 329
    .line 330
    :cond_e
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    move-object v1, v0

    .line 335
    check-cast v1, La/lf50;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v3, La/vul0;

    .line 341
    .line 342
    invoke-direct {v3, v2}, La/vul0;-><init>(La/m7h0;)V

    .line 343
    .line 344
    .line 345
    new-instance v4, La/se50;

    .line 346
    .line 347
    sget-object v6, La/iun;->a:La/iun;

    .line 348
    .line 349
    invoke-direct {v4, v3, v6}, La/se50;-><init>(La/wul0;Ljava/util/List;)V

    .line 350
    .line 351
    .line 352
    iget-object v3, v1, La/lf50;->a:Ljava/util/List;

    .line 353
    .line 354
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-static {v1, v3, v7, v7, v5}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_e

    .line 367
    .line 368
    new-instance v0, La/me50;

    .line 369
    .line 370
    invoke-direct {v0, v2}, La/me50;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 371
    .line 372
    .line 373
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    return-object v0

    .line 378
    :cond_f
    instance-of v2, v1, La/u0w0;

    .line 379
    .line 380
    if-eqz v2, :cond_13

    .line 381
    .line 382
    :cond_10
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    move-object v1, v0

    .line 387
    check-cast v1, La/lf50;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object v2, v1, La/lf50;->a:Ljava/util/List;

    .line 393
    .line 394
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    check-cast v3, La/ve50;

    .line 399
    .line 400
    if-nez v3, :cond_11

    .line 401
    .line 402
    goto :goto_3

    .line 403
    :cond_11
    instance-of v3, v3, La/se50;

    .line 404
    .line 405
    if-eqz v3, :cond_12

    .line 406
    .line 407
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-static {v1, v2, v7, v7, v5}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    :cond_12
    :goto_3
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_10

    .line 420
    .line 421
    sget-object v0, La/de50;->a:La/de50;

    .line 422
    .line 423
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    return-object v0

    .line 428
    :cond_13
    instance-of v2, v1, La/v0w0;

    .line 429
    .line 430
    if-eqz v2, :cond_15

    .line 431
    .line 432
    :cond_14
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    move-object v0, v9

    .line 437
    check-cast v0, La/lf50;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance v10, La/lf50;

    .line 443
    .line 444
    sget-object v5, La/iun;->a:La/iun;

    .line 445
    .line 446
    new-instance v4, La/pu4;

    .line 447
    .line 448
    invoke-direct {v4, v3}, La/pu4;-><init>(La/bjk;)V

    .line 449
    .line 450
    .line 451
    new-instance v0, La/pe50;

    .line 452
    .line 453
    const/4 v1, 0x0

    .line 454
    const/4 v2, 0x0

    .line 455
    move-object v6, v5

    .line 456
    invoke-direct/range {v0 .. v6}, La/pe50;-><init>(La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v10, v5, v7, v0}, La/lf50;-><init>(Ljava/util/List;La/re50;La/pe50;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v8, v9, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_14

    .line 467
    .line 468
    sget-object v0, La/ee50;->a:La/ee50;

    .line 469
    .line 470
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :cond_15
    instance-of v2, v1, La/z0w0;

    .line 476
    .line 477
    if-eqz v2, :cond_16

    .line 478
    .line 479
    check-cast v1, La/z0w0;

    .line 480
    .line 481
    iget-object v1, v1, La/z0w0;->a:Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 482
    .line 483
    new-instance v2, La/b530;

    .line 484
    .line 485
    const/16 v3, 0x11

    .line 486
    .line 487
    invoke-direct {v2, v1, v3}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v2}, La/mf50;->g(Lkotlin/jvm/functions/Function1;)V

    .line 491
    .line 492
    .line 493
    new-instance v0, La/ie50;

    .line 494
    .line 495
    invoke-direct {v0, v1}, La/ie50;-><init>(Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;)V

    .line 496
    .line 497
    .line 498
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :cond_16
    instance-of v2, v1, La/s0w0;

    .line 504
    .line 505
    if-eqz v2, :cond_17

    .line 506
    .line 507
    check-cast v1, La/s0w0;

    .line 508
    .line 509
    iget-object v1, v1, La/s0w0;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 510
    .line 511
    new-instance v2, La/srj;

    .line 512
    .line 513
    const/4 v3, 0x2

    .line 514
    invoke-direct {v2, v1, v3}, La/srj;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;B)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v2}, La/mf50;->g(Lkotlin/jvm/functions/Function1;)V

    .line 518
    .line 519
    .line 520
    new-instance v0, La/vd50;

    .line 521
    .line 522
    invoke-direct {v0, v1}, La/vd50;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0

    .line 530
    :cond_17
    instance-of v2, v1, La/x0w0;

    .line 531
    .line 532
    if-eqz v2, :cond_1a

    .line 533
    .line 534
    check-cast v1, La/x0w0;

    .line 535
    .line 536
    iget-object v2, v1, La/x0w0;->a:Ljava/util/List;

    .line 537
    .line 538
    :cond_18
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    move-object v3, v1

    .line 543
    check-cast v3, La/lf50;

    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 557
    .line 558
    .line 559
    move-result v5

    .line 560
    if-eqz v5, :cond_19

    .line 561
    .line 562
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    check-cast v5, La/m7h0;

    .line 567
    .line 568
    invoke-static {v3, v5}, La/qxw;->N(La/lf50;La/m7h0;)La/lf50;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    goto :goto_4

    .line 573
    :cond_19
    invoke-virtual {v8, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    if-eqz v1, :cond_18

    .line 578
    .line 579
    new-instance v0, La/ge50;

    .line 580
    .line 581
    invoke-direct {v0, v2}, La/ge50;-><init>(Ljava/util/List;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    return-object v0

    .line 589
    :cond_1a
    instance-of v2, v1, La/e1w0;

    .line 590
    .line 591
    if-eqz v2, :cond_1c

    .line 592
    .line 593
    check-cast v1, La/e1w0;

    .line 594
    .line 595
    iget-object v2, v1, La/e1w0;->a:Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 596
    .line 597
    :cond_1b
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    move-object v3, v1

    .line 602
    check-cast v3, La/lf50;

    .line 603
    .line 604
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-static {v3, v2}, La/qxw;->N(La/lf50;La/m7h0;)La/lf50;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    invoke-virtual {v8, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    if-eqz v1, :cond_1b

    .line 616
    .line 617
    new-instance v1, La/le50;

    .line 618
    .line 619
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    iget-object v0, v0, La/lf50;->c:La/pe50;

    .line 624
    .line 625
    iget-object v0, v0, La/pe50;->c:La/bjk;

    .line 626
    .line 627
    invoke-direct {v1, v2, v0}, La/le50;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;La/bjk;)V

    .line 628
    .line 629
    .line 630
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
    :cond_1c
    instance-of v2, v1, La/t0w0;

    .line 636
    .line 637
    if-eqz v2, :cond_24

    .line 638
    .line 639
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-static {v1}, La/qxw;->I(La/lf50;)Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-eqz v1, :cond_1f

    .line 648
    .line 649
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    iget-object v1, v1, La/lf50;->b:La/re50;

    .line 654
    .line 655
    if-eqz v1, :cond_1e

    .line 656
    .line 657
    iget-object v1, v1, La/re50;->b:La/wul0;

    .line 658
    .line 659
    invoke-static {v1}, La/s0x;->L(La/wul0;)La/bjk;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    if-nez v1, :cond_1d

    .line 664
    .line 665
    goto :goto_6

    .line 666
    :cond_1d
    :goto_5
    move-object v2, v1

    .line 667
    goto :goto_7

    .line 668
    :cond_1e
    :goto_6
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    iget-object v0, v0, La/lf50;->c:La/pe50;

    .line 673
    .line 674
    iget-object v0, v0, La/pe50;->d:La/pu4;

    .line 675
    .line 676
    iget-object v1, v0, La/pu4;->a:La/bjk;

    .line 677
    .line 678
    goto :goto_5

    .line 679
    :cond_1f
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    iget-object v0, v0, La/lf50;->c:La/pe50;

    .line 684
    .line 685
    iget-object v1, v0, La/pe50;->c:La/bjk;

    .line 686
    .line 687
    goto :goto_5

    .line 688
    :cond_20
    :goto_7
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    move-object v1, v0

    .line 693
    check-cast v1, La/lf50;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    iget-object v3, v1, La/lf50;->b:La/re50;

    .line 699
    .line 700
    if-eqz v3, :cond_21

    .line 701
    .line 702
    goto :goto_8

    .line 703
    :cond_21
    iget-object v3, v1, La/lf50;->a:Ljava/util/List;

    .line 704
    .line 705
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    check-cast v3, La/ve50;

    .line 710
    .line 711
    :goto_8
    if-eqz v3, :cond_23

    .line 712
    .line 713
    invoke-interface {v3}, La/ve50;->b()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-eqz v3, :cond_22

    .line 722
    .line 723
    goto :goto_9

    .line 724
    :cond_22
    invoke-static {v1}, La/qxw;->t(La/lf50;)La/lf50;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    :cond_23
    :goto_9
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_20

    .line 733
    .line 734
    new-instance v0, La/yd50;

    .line 735
    .line 736
    invoke-direct {v0, v2}, La/yd50;-><init>(La/bjk;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    return-object v0

    .line 744
    :cond_24
    instance-of v2, v1, La/c1w0;

    .line 745
    .line 746
    if-eqz v2, :cond_25

    .line 747
    .line 748
    move-object v0, v1

    .line 749
    check-cast v0, La/c1w0;

    .line 750
    .line 751
    iget-object v1, v0, La/c1w0;->a:La/lwv0;

    .line 752
    .line 753
    iget-object v0, v0, La/c1w0;->b:Lkotlin/jvm/functions/Function2;

    .line 754
    .line 755
    new-instance v2, La/je50;

    .line 756
    .line 757
    invoke-direct {v2, v1, v0}, La/je50;-><init>(La/lwv0;Lkotlin/jvm/functions/Function2;)V

    .line 758
    .line 759
    .line 760
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    return-object v0

    .line 765
    :cond_25
    instance-of v2, v1, La/n0w0;

    .line 766
    .line 767
    iget-object v3, v0, La/mf50;->a:La/wu4;

    .line 768
    .line 769
    if-eqz v2, :cond_27

    .line 770
    .line 771
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v3, v0, v7}, La/wu4;->a(La/lf50;La/g1w0;)Lkotlin/Pair;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 780
    .line 781
    move-object v2, v1

    .line 782
    check-cast v2, La/lf50;

    .line 783
    .line 784
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 785
    .line 786
    move-object v4, v0

    .line 787
    check-cast v4, Ljava/util/List;

    .line 788
    .line 789
    :cond_26
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    move-object v1, v0

    .line 794
    check-cast v1, La/lf50;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v8, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_26

    .line 804
    .line 805
    return-object v4

    .line 806
    :cond_27
    instance-of v2, v1, La/o0w0;

    .line 807
    .line 808
    if-eqz v2, :cond_2f

    .line 809
    .line 810
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    iget-object v1, v3, La/wu4;->b:La/gdv0;

    .line 821
    .line 822
    sget-object v2, Lorg/xplatform/core/navigation/authorization/model/AuthType;->b:Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 823
    .line 824
    invoke-virtual {v1, v2}, La/gdv0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    check-cast v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization;

    .line 829
    .line 830
    invoke-static {v0}, La/qxw;->A(La/lf50;)La/wul0;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    if-eqz v2, :cond_28

    .line 835
    .line 836
    invoke-interface {v2}, La/wul0;->a()La/m7h0;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    goto :goto_a

    .line 841
    :cond_28
    move-object v2, v7

    .line 842
    :goto_a
    instance-of v2, v2, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login;

    .line 843
    .line 844
    instance-of v3, v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 845
    .line 846
    const/4 v4, 0x3

    .line 847
    if-eqz v3, :cond_2a

    .line 848
    .line 849
    check-cast v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 850
    .line 851
    iget-object v9, v0, La/lf50;->c:La/pe50;

    .line 852
    .line 853
    invoke-static {v0}, La/qxw;->A(La/lf50;)La/wul0;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    if-eqz v2, :cond_29

    .line 858
    .line 859
    invoke-interface {v2}, La/wul0;->a()La/m7h0;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    move-object v10, v2

    .line 864
    goto :goto_b

    .line 865
    :cond_29
    move-object v10, v7

    .line 866
    :goto_b
    const/4 v15, 0x0

    .line 867
    const/16 v16, 0x3c

    .line 868
    .line 869
    const/4 v11, 0x0

    .line 870
    const/4 v12, 0x0

    .line 871
    const/4 v13, 0x0

    .line 872
    const/4 v14, 0x0

    .line 873
    invoke-static/range {v9 .. v16}, La/pe50;->a(La/pe50;La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;I)La/pe50;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-static {v0, v7, v7, v2, v4}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    sget-object v2, La/nu4;->b:La/nu4;

    .line 882
    .line 883
    iget-object v3, v0, La/lf50;->c:La/pe50;

    .line 884
    .line 885
    iget-object v3, v3, La/pe50;->d:La/pu4;

    .line 886
    .line 887
    iget-object v3, v3, La/pu4;->a:La/bjk;

    .line 888
    .line 889
    invoke-static {v0, v2, v1, v3}, La/qxw;->P(La/lf50;La/nu4;Lorg/xplatform/core/navigation/authorization/screen/Authorization;La/bjk;)La/lf50;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    new-instance v2, La/fe50;

    .line 894
    .line 895
    invoke-direct {v2, v1}, La/fe50;-><init>(La/m7h0;)V

    .line 896
    .line 897
    .line 898
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    new-instance v2, Lkotlin/Pair;

    .line 903
    .line 904
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    goto :goto_d

    .line 908
    :cond_2a
    instance-of v3, v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 909
    .line 910
    if-nez v3, :cond_2b

    .line 911
    .line 912
    sget-object v1, La/iun;->a:La/iun;

    .line 913
    .line 914
    new-instance v2, Lkotlin/Pair;

    .line 915
    .line 916
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    goto :goto_d

    .line 920
    :cond_2b
    if-nez v2, :cond_2d

    .line 921
    .line 922
    check-cast v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 923
    .line 924
    iget-object v9, v0, La/lf50;->c:La/pe50;

    .line 925
    .line 926
    invoke-static {v0}, La/qxw;->A(La/lf50;)La/wul0;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    if-eqz v2, :cond_2c

    .line 931
    .line 932
    invoke-interface {v2}, La/wul0;->a()La/m7h0;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    move-object v10, v2

    .line 937
    goto :goto_c

    .line 938
    :cond_2c
    move-object v10, v7

    .line 939
    :goto_c
    const/4 v15, 0x0

    .line 940
    const/16 v16, 0x3c

    .line 941
    .line 942
    const/4 v11, 0x0

    .line 943
    const/4 v12, 0x0

    .line 944
    const/4 v13, 0x0

    .line 945
    const/4 v14, 0x0

    .line 946
    invoke-static/range {v9 .. v16}, La/pe50;->a(La/pe50;La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;I)La/pe50;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    invoke-static {v0, v7, v7, v2, v4}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    sget-object v2, La/nu4;->b:La/nu4;

    .line 955
    .line 956
    iget-object v3, v0, La/lf50;->c:La/pe50;

    .line 957
    .line 958
    iget-object v3, v3, La/pe50;->d:La/pu4;

    .line 959
    .line 960
    iget-object v3, v3, La/pu4;->a:La/bjk;

    .line 961
    .line 962
    invoke-static {v0, v2, v1, v3}, La/qxw;->P(La/lf50;La/nu4;Lorg/xplatform/core/navigation/authorization/screen/Authorization;La/bjk;)La/lf50;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    new-instance v2, La/fe50;

    .line 967
    .line 968
    invoke-direct {v2, v1}, La/fe50;-><init>(La/m7h0;)V

    .line 969
    .line 970
    .line 971
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    new-instance v2, Lkotlin/Pair;

    .line 976
    .line 977
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    goto :goto_d

    .line 981
    :cond_2d
    check-cast v1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 982
    .line 983
    new-instance v2, La/ae50;

    .line 984
    .line 985
    new-instance v3, La/w0w0;

    .line 986
    .line 987
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 988
    .line 989
    .line 990
    invoke-direct {v2, v3}, La/ae50;-><init>(La/g1w0;)V

    .line 991
    .line 992
    .line 993
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    new-instance v2, Lkotlin/Pair;

    .line 998
    .line 999
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    :goto_d
    iget-object v0, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1003
    .line 1004
    move-object v4, v0

    .line 1005
    check-cast v4, La/lf50;

    .line 1006
    .line 1007
    iget-object v0, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1008
    .line 1009
    move-object v2, v0

    .line 1010
    check-cast v2, Ljava/util/List;

    .line 1011
    .line 1012
    :cond_2e
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    move-object v1, v0

    .line 1017
    check-cast v1, La/lf50;

    .line 1018
    .line 1019
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v8, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    if-eqz v0, :cond_2e

    .line 1027
    .line 1028
    return-object v2

    .line 1029
    :cond_2f
    instance-of v2, v1, La/r0w0;

    .line 1030
    .line 1031
    if-eqz v2, :cond_33

    .line 1032
    .line 1033
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    iget-object v0, v0, La/lf50;->b:La/re50;

    .line 1038
    .line 1039
    if-eqz v0, :cond_31

    .line 1040
    .line 1041
    iget-object v0, v0, La/re50;->b:La/wul0;

    .line 1042
    .line 1043
    invoke-interface {v0}, La/wul0;->a()La/m7h0;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    if-nez v0, :cond_30

    .line 1048
    .line 1049
    goto :goto_f

    .line 1050
    :cond_30
    :goto_e
    move-object v2, v0

    .line 1051
    goto :goto_10

    .line 1052
    :cond_31
    :goto_f
    iget-object v0, v3, La/wu4;->b:La/gdv0;

    .line 1053
    .line 1054
    sget-object v1, Lorg/xplatform/core/navigation/authorization/model/AuthType;->a:Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 1055
    .line 1056
    invoke-virtual {v0, v1}, La/gdv0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    check-cast v0, La/m7h0;

    .line 1061
    .line 1062
    goto :goto_e

    .line 1063
    :cond_32
    :goto_10
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    move-object v1, v0

    .line 1068
    check-cast v1, La/lf50;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v1, v2}, La/qxw;->u(La/lf50;La/m7h0;)La/lf50;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_32

    .line 1082
    .line 1083
    new-instance v0, La/ud50;

    .line 1084
    .line 1085
    invoke-direct {v0, v2}, La/ud50;-><init>(La/m7h0;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    return-object v0

    .line 1093
    :cond_33
    instance-of v2, v1, La/m0w0;

    .line 1094
    .line 1095
    if-eqz v2, :cond_3c

    .line 1096
    .line 1097
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    iget-object v1, v0, La/lf50;->c:La/pe50;

    .line 1108
    .line 1109
    iget-object v2, v1, La/pe50;->b:La/g1w0;

    .line 1110
    .line 1111
    iget-object v3, v1, La/pe50;->e:Ljava/util/List;

    .line 1112
    .line 1113
    iget-object v4, v1, La/pe50;->f:Ljava/util/List;

    .line 1114
    .line 1115
    iget-object v5, v0, La/lf50;->b:La/re50;

    .line 1116
    .line 1117
    if-eqz v5, :cond_34

    .line 1118
    .line 1119
    iget-object v5, v5, La/re50;->b:La/wul0;

    .line 1120
    .line 1121
    invoke-static {v5}, La/s0x;->L(La/wul0;)La/bjk;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v5

    .line 1125
    if-nez v5, :cond_35

    .line 1126
    .line 1127
    :cond_34
    iget-object v5, v1, La/pe50;->d:La/pu4;

    .line 1128
    .line 1129
    iget-object v5, v5, La/pu4;->a:La/bjk;

    .line 1130
    .line 1131
    :cond_35
    iget-object v1, v1, La/pe50;->a:La/m7h0;

    .line 1132
    .line 1133
    invoke-static {v0}, La/qxw;->I(La/lf50;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v6

    .line 1137
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v9

    .line 1141
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1142
    .line 1143
    .line 1144
    move-result v10

    .line 1145
    if-nez v10, :cond_37

    .line 1146
    .line 1147
    if-eqz v6, :cond_36

    .line 1148
    .line 1149
    new-instance v1, La/yd50;

    .line 1150
    .line 1151
    invoke-direct {v1, v5}, La/yd50;-><init>(La/bjk;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1155
    .line 1156
    .line 1157
    :cond_36
    new-instance v1, La/be50;

    .line 1158
    .line 1159
    invoke-direct {v1, v3}, La/be50;-><init>(Ljava/util/List;)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1163
    .line 1164
    .line 1165
    new-instance v1, La/ce50;

    .line 1166
    .line 1167
    invoke-direct {v1, v4}, La/ce50;-><init>(Ljava/util/List;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    goto :goto_12

    .line 1174
    :cond_37
    if-eqz v1, :cond_38

    .line 1175
    .line 1176
    new-instance v3, La/ud50;

    .line 1177
    .line 1178
    invoke-direct {v3, v1}, La/ud50;-><init>(La/m7h0;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_11

    .line 1182
    :cond_38
    new-instance v3, La/ud50;

    .line 1183
    .line 1184
    invoke-direct {v3, v7}, La/ud50;-><init>(La/m7h0;)V

    .line 1185
    .line 1186
    .line 1187
    :goto_11
    invoke-virtual {v9, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    if-eqz v6, :cond_39

    .line 1191
    .line 1192
    new-instance v1, La/yd50;

    .line 1193
    .line 1194
    invoke-direct {v1, v5}, La/yd50;-><init>(La/bjk;)V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    :cond_39
    if-eqz v2, :cond_3a

    .line 1201
    .line 1202
    new-instance v1, La/ae50;

    .line 1203
    .line 1204
    invoke-direct {v1, v2}, La/ae50;-><init>(La/g1w0;)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    :cond_3a
    new-instance v1, La/ce50;

    .line 1211
    .line 1212
    invoke-direct {v1, v4}, La/ce50;-><init>(Ljava/util/List;)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    :goto_12
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v2

    .line 1222
    invoke-static {v0}, La/qxw;->z(La/lf50;)La/lf50;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v4

    .line 1226
    :cond_3b
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    move-object v1, v0

    .line 1231
    check-cast v1, La/lf50;

    .line 1232
    .line 1233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v8, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    if-eqz v0, :cond_3b

    .line 1241
    .line 1242
    return-object v2

    .line 1243
    :cond_3c
    instance-of v1, v1, La/l0w0;

    .line 1244
    .line 1245
    if-eqz v1, :cond_42

    .line 1246
    .line 1247
    invoke-virtual {v0}, La/mf50;->b()La/lf50;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    iget-object v1, v0, La/lf50;->b:La/re50;

    .line 1258
    .line 1259
    iget-object v2, v0, La/lf50;->c:La/pe50;

    .line 1260
    .line 1261
    if-eqz v1, :cond_3d

    .line 1262
    .line 1263
    iget-object v1, v1, La/re50;->b:La/wul0;

    .line 1264
    .line 1265
    invoke-static {v1}, La/s0x;->L(La/wul0;)La/bjk;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    if-nez v1, :cond_3e

    .line 1270
    .line 1271
    :cond_3d
    iget-object v1, v2, La/pe50;->d:La/pu4;

    .line 1272
    .line 1273
    iget-object v1, v1, La/pu4;->a:La/bjk;

    .line 1274
    .line 1275
    :cond_3e
    iget-object v2, v2, La/pe50;->a:La/m7h0;

    .line 1276
    .line 1277
    invoke-static {v0}, La/qxw;->I(La/lf50;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v3

    .line 1281
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v4

    .line 1285
    if-eqz v2, :cond_3f

    .line 1286
    .line 1287
    new-instance v5, La/ud50;

    .line 1288
    .line 1289
    invoke-direct {v5, v2}, La/ud50;-><init>(La/m7h0;)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_13

    .line 1293
    :cond_3f
    new-instance v5, La/ud50;

    .line 1294
    .line 1295
    invoke-direct {v5, v7}, La/ud50;-><init>(La/m7h0;)V

    .line 1296
    .line 1297
    .line 1298
    :goto_13
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    if-eqz v3, :cond_40

    .line 1302
    .line 1303
    new-instance v2, La/yd50;

    .line 1304
    .line 1305
    invoke-direct {v2, v1}, La/yd50;-><init>(La/bjk;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    :cond_40
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v1

    .line 1315
    invoke-static {v0}, La/qxw;->z(La/lf50;)La/lf50;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    :cond_41
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v2

    .line 1323
    move-object v3, v2

    .line 1324
    check-cast v3, La/lf50;

    .line 1325
    .line 1326
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v8, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v2

    .line 1333
    if-eqz v2, :cond_41

    .line 1334
    .line 1335
    return-object v1

    .line 1336
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 1337
    .line 1338
    .line 1339
    return-object v7
.end method

.method public final b()La/lf50;
    .locals 2

    .line 1
    sget-object v0, La/mf50;->c:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/mf50;->b:La/p7m0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/lf50;

    .line 13
    .line 14
    return-object p0
.end method

.method public final c(Ljava/util/List;)V
    .locals 8

    .line 1
    new-instance v4, La/b530;

    .line 2
    .line 3
    const/16 v0, 0x12

    .line 4
    .line 5
    invoke-direct {v4, p0, v0}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x1f

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v0, p1

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, La/mf50;->b()La/lf50;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/lf50;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {p0}, La/mf50;->b()La/lf50;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, La/lf50;->b:La/re50;

    .line 29
    .line 30
    invoke-static {v1}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v6, La/mb50;

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-direct {v6, p0, v0}, La/mb50;-><init>(La/mf50;B)V

    .line 42
    .line 43
    .line 44
    const/16 v7, 0x19

    .line 45
    .line 46
    const-string v4, "["

    .line 47
    .line 48
    const-string v5, "]"

    .line 49
    .line 50
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "XPlatformRouter ["

    .line 55
    .line 56
    const-string v1, "] -> "

    .line 57
    .line 58
    invoke-static {v0, p1, v1, p0}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final d(Ljava/util/List;)La/lc00;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v4, v2, 0x1

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-ltz v2, :cond_2

    .line 27
    .line 28
    check-cast v3, La/c8d;

    .line 29
    .line 30
    iget-object v2, v3, La/c8d;->a:La/w7d;

    .line 31
    .line 32
    iget-object v3, v3, La/c8d;->b:La/g1w0;

    .line 33
    .line 34
    invoke-virtual {p0, v2, v3}, La/mf50;->e(La/w7d;La/g1w0;)Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/util/List;

    .line 41
    .line 42
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v0, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    :cond_0
    iget-object v1, p0, La/mf50;->b:La/p7m0;

    .line 56
    .line 57
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v3, v2

    .line 62
    check-cast v3, La/lf50;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v6, v3, La/lf50;->c:La/pe50;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    invoke-interface {p1, v4, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    const/16 v13, 0x1f

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x0

    .line 84
    invoke-static/range {v6 .. v13}, La/pe50;->a(La/pe50;La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;I)La/pe50;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const/4 v7, 0x3

    .line 89
    invoke-static {v3, v5, v5, v6, v7}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move v2, v4

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 103
    .line 104
    .line 105
    throw v5

    .line 106
    :cond_3
    :goto_1
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, p1}, La/mf50;->c(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    return-object v0
.end method

.method public final e(La/w7d;La/g1w0;)Lkotlin/Pair;
    .locals 3

    .line 1
    new-instance v0, La/rw40;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, La/mf50;->g(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/mf50;->a:La/wu4;

    .line 12
    .line 13
    iget-object v1, v0, La/wu4;->a:La/h1w0;

    .line 14
    .line 15
    invoke-virtual {v1}, La/h1w0;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    instance-of v1, p2, La/q0w0;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v1, p2

    .line 33
    check-cast v1, La/q0w0;

    .line 34
    .line 35
    iget-object v1, v1, La/q0w0;->a:La/m7h0;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v1, p1, La/v7d;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    check-cast p1, La/v7d;

    .line 45
    .line 46
    iget-boolean v2, p1, La/v7d;->a:Z

    .line 47
    .line 48
    :cond_1
    :goto_0
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, La/mf50;->b()La/lf50;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1, p2}, La/wu4;->a(La/lf50;La/g1w0;)Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p2, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v0, p2

    .line 61
    check-cast v0, La/lf50;

    .line 62
    .line 63
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/util/List;

    .line 66
    .line 67
    :cond_2
    iget-object p2, p0, La/mf50;->b:La/p7m0;

    .line 68
    .line 69
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object v2, v1

    .line 74
    check-cast v2, La/lf50;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    xor-int/lit8 p0, p0, 0x1

    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance p2, Lkotlin/Pair;

    .line 96
    .line 97
    invoke-direct {p2, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_3
    instance-of p1, p2, La/n0w0;

    .line 102
    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    instance-of p1, p2, La/o0w0;

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-virtual {p0, p2}, La/mf50;->a(La/g1w0;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    new-instance p2, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object p2

    .line 122
    :cond_5
    :goto_1
    invoke-virtual {p0, p2}, La/mf50;->a(La/g1w0;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    xor-int/lit8 p1, p1, 0x1

    .line 131
    .line 132
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance p2, Lkotlin/Pair;

    .line 137
    .line 138
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object p2
.end method

.method public final g(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, La/mf50;->b:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void
.end method
