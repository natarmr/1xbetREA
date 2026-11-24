.class public final La/gq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;La/djg;Lkotlin/jvm/functions/Function1;La/a4x;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/gq4;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/gq4;->b:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, La/gq4;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iput-object p4, p0, La/gq4;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/gq4;->a:B

    iput-object p1, p0, La/gq4;->b:Ljava/util/List;

    iput-object p2, p0, La/gq4;->d:Ljava/lang/Object;

    iput-object p3, p0, La/gq4;->e:Ljava/lang/Object;

    iput-object p4, p0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, La/gq4;->a:B

    iput-object p1, p0, La/gq4;->b:Ljava/util/List;

    iput-object p2, p0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/gq4;->d:Ljava/lang/Object;

    iput-object p4, p0, La/gq4;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    move-object v8, p3

    .line 10
    check-cast v8, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    and-int/lit8 p3, p2, 0x6

    .line 19
    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v8, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p2

    .line 34
    :goto_1
    and-int/lit8 p2, p2, 0x30

    .line 35
    .line 36
    const/16 p3, 0x20

    .line 37
    .line 38
    if-nez p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    move p2, p3

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 p2, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr p1, p2

    .line 51
    :cond_3
    and-int/lit16 p2, p1, 0x93

    .line 52
    .line 53
    const/16 p4, 0x92

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    const/4 v10, 0x0

    .line 57
    if-eq p2, p4, :cond_4

    .line 58
    .line 59
    move p2, v0

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move p2, v10

    .line 62
    :goto_3
    and-int/lit8 p4, p1, 0x1

    .line 63
    .line 64
    invoke-virtual {v8, p4, p2}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_14

    .line 69
    .line 70
    iget-object p2, p0, La/gq4;->b:Ljava/util/List;

    .line 71
    .line 72
    check-cast p2, La/a4x;

    .line 73
    .line 74
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    move-object v1, p2

    .line 79
    check-cast v1, La/p6t0;

    .line 80
    .line 81
    const p2, -0x2fbed332

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, p2}, La/fet;->e0(I)V

    .line 85
    .line 86
    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_5
    instance-of p2, v1, La/jzh0;

    .line 92
    .line 93
    const/4 p4, 0x0

    .line 94
    if-eqz p2, :cond_6

    .line 95
    .line 96
    const p0, 0x69d09200

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, p0}, La/fet;->e0(I)V

    .line 100
    .line 101
    .line 102
    check-cast v1, La/jzh0;

    .line 103
    .line 104
    invoke-static {p4, v1, v8, v10}, La/zvw;->t(La/mm40;La/jzh0;La/fet;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :cond_6
    instance-of p2, v1, La/uzh0;

    .line 113
    .line 114
    if-eqz p2, :cond_7

    .line 115
    .line 116
    const p0, 0x69d09c43

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, p0}, La/fet;->e0(I)V

    .line 120
    .line 121
    .line 122
    check-cast v1, La/uzh0;

    .line 123
    .line 124
    invoke-static {p4, v1, v8, v10}, La/cww;->l(La/mm40;La/uzh0;La/fet;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_6

    .line 131
    .line 132
    :cond_7
    instance-of p2, v1, La/ua5;

    .line 133
    .line 134
    if-eqz p2, :cond_13

    .line 135
    .line 136
    const p2, -0x2fbb9748

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, p2}, La/fet;->e0(I)V

    .line 140
    .line 141
    .line 142
    move-object p2, v1

    .line 143
    check-cast p2, La/ua5;

    .line 144
    .line 145
    iget-boolean p4, p2, La/ua5;->f:Z

    .line 146
    .line 147
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    and-int/lit8 v4, p1, 0x70

    .line 156
    .line 157
    xor-int/lit8 v4, v4, 0x30

    .line 158
    .line 159
    if-le v4, p3, :cond_8

    .line 160
    .line 161
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_a

    .line 166
    .line 167
    :cond_8
    and-int/lit8 p1, p1, 0x30

    .line 168
    .line 169
    if-ne p1, p3, :cond_9

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    move v0, v10

    .line 173
    :cond_a
    :goto_4
    or-int p1, v3, v0

    .line 174
    .line 175
    iget-object p3, p0, La/gq4;->d:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v0, p3

    .line 178
    check-cast v0, La/a4x;

    .line 179
    .line 180
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    or-int/2addr p1, v0

    .line 185
    iget-object v0, p0, La/gq4;->e:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v3, v0

    .line 188
    check-cast v3, La/xcz;

    .line 189
    .line 190
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    or-int/2addr p1, v3

    .line 195
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    sget-object v7, La/ukd;->a:La/cl5;

    .line 200
    .line 201
    if-nez p1, :cond_b

    .line 202
    .line 203
    if-ne v3, v7, :cond_c

    .line 204
    .line 205
    :cond_b
    move-object p1, v0

    .line 206
    new-instance v0, La/fs;

    .line 207
    .line 208
    move-object v3, p3

    .line 209
    check-cast v3, La/a4x;

    .line 210
    .line 211
    move-object v4, p1

    .line 212
    check-cast v4, La/xcz;

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    const/16 v6, 0xf

    .line 216
    .line 217
    invoke-direct/range {v0 .. v6}, La/fs;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    move-object v3, v0

    .line 224
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 225
    .line 226
    invoke-static {v8, p4, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    iget-object p0, p0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 230
    .line 231
    invoke-virtual {v8, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p3

    .line 239
    or-int/2addr p1, p3

    .line 240
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    const/16 p4, 0x13

    .line 245
    .line 246
    if-nez p1, :cond_d

    .line 247
    .line 248
    if-ne p3, v7, :cond_e

    .line 249
    .line 250
    :cond_d
    new-instance p3, La/z7;

    .line 251
    .line 252
    invoke-direct {p3, p0, v1, p4}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    move-object v5, p3

    .line 259
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 260
    .line 261
    invoke-virtual {v8, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    if-nez p1, :cond_f

    .line 270
    .line 271
    if-ne p3, v7, :cond_10

    .line 272
    .line 273
    :cond_f
    new-instance p3, La/v6a0;

    .line 274
    .line 275
    invoke-direct {p3, p0, p4}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v8, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_10
    move-object v6, p3

    .line 282
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 283
    .line 284
    invoke-virtual {v8, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p3

    .line 292
    if-nez p1, :cond_11

    .line 293
    .line 294
    if-ne p3, v7, :cond_12

    .line 295
    .line 296
    :cond_11
    new-instance p3, La/v6a0;

    .line 297
    .line 298
    const/16 p1, 0x14

    .line 299
    .line 300
    invoke-direct {p3, p0, p1}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_12
    move-object v7, p3

    .line 307
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 308
    .line 309
    const/4 v9, 0x0

    .line 310
    const/4 v3, 0x0

    .line 311
    move-object v4, p2

    .line 312
    invoke-static/range {v3 .. v9}, La/mrv;->m(La/mm40;La/ua5;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_13
    :goto_5
    const p0, -0x2fb1649f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v8, p0}, La/fet;->e0(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 326
    .line 327
    .line 328
    :goto_6
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_14
    invoke-virtual {v8}, La/fet;->X()V

    .line 333
    .line 334
    .line 335
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/gq4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/mm40;

    .line 4
    .line 5
    check-cast p1, La/g9z;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    move-object v6, p3

    .line 14
    check-cast v6, La/fet;

    .line 15
    .line 16
    check-cast p4, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    iget-object p4, p0, La/gq4;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p4, La/oer0;

    .line 25
    .line 26
    and-int/lit8 v1, p3, 0x6

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v6, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x2

    .line 39
    :goto_0
    or-int/2addr v1, p3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, p3

    .line 42
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 43
    .line 44
    if-nez p3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v6, p2}, La/fet;->e(I)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    const/16 p3, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 p3, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v1, p3

    .line 58
    :cond_3
    and-int/lit16 p3, v1, 0x93

    .line 59
    .line 60
    const/16 v2, 0x92

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    const/4 v9, 0x0

    .line 64
    if-eq p3, v2, :cond_4

    .line 65
    .line 66
    move p3, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move p3, v9

    .line 69
    :goto_3
    and-int/2addr v1, v3

    .line 70
    invoke-virtual {v6, v1, p3}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_c

    .line 75
    .line 76
    iget-object p3, p0, La/gq4;->b:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    check-cast p2, La/a2n;

    .line 83
    .line 84
    const p3, -0x661d93ae

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, p3}, La/fet;->e0(I)V

    .line 88
    .line 89
    .line 90
    if-nez p2, :cond_5

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_5
    instance-of p3, p2, La/y56;

    .line 95
    .line 96
    const/4 v1, 0x7

    .line 97
    const/4 v2, 0x0

    .line 98
    sget-object v3, La/ukd;->a:La/cl5;

    .line 99
    .line 100
    iget-object p0, p0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 101
    .line 102
    if-eqz p3, :cond_8

    .line 103
    .line 104
    const p3, 0x4707532e

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, p3}, La/fet;->e0(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v0, v2, v1}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v2, p2

    .line 115
    check-cast v2, La/y56;

    .line 116
    .line 117
    move-object p3, v3

    .line 118
    iget-boolean v3, p4, La/oer0;->c:Z

    .line 119
    .line 120
    invoke-virtual {v6, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-nez p1, :cond_6

    .line 129
    .line 130
    if-ne p2, p3, :cond_7

    .line 131
    .line 132
    :cond_6
    new-instance p2, La/v6a0;

    .line 133
    .line 134
    const/16 p1, 0x18

    .line 135
    .line 136
    invoke-direct {p2, p0, p1}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    move-object v4, p2

    .line 143
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const/16 v8, 0x10

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    invoke-static/range {v1 .. v8}, La/vcc;->i(La/mm40;La/y56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    move-object p3, v3

    .line 157
    instance-of v3, p2, La/c2o0;

    .line 158
    .line 159
    if-eqz v3, :cond_b

    .line 160
    .line 161
    const v3, 0x47078232

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v0, v2, v1}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    move-object v2, p2

    .line 172
    check-cast v2, La/c2o0;

    .line 173
    .line 174
    iget-boolean v3, p4, La/oer0;->c:Z

    .line 175
    .line 176
    invoke-virtual {v6, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    if-nez p1, :cond_9

    .line 185
    .line 186
    if-ne p2, p3, :cond_a

    .line 187
    .line 188
    :cond_9
    new-instance p2, La/v6a0;

    .line 189
    .line 190
    const/16 p1, 0x19

    .line 191
    .line 192
    invoke-direct {p2, p0, p1}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_a
    move-object v4, p2

    .line 199
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 200
    .line 201
    const/4 v7, 0x0

    .line 202
    const/16 v8, 0x10

    .line 203
    .line 204
    const/4 v5, 0x0

    .line 205
    invoke-static/range {v1 .. v8}, La/hkb;->n(La/mm40;La/c2o0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_b
    :goto_4
    const p0, -0x661210de

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 219
    .line 220
    .line 221
    :goto_5
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_c
    invoke-virtual {v6}, La/fet;->X()V

    .line 226
    .line 227
    .line 228
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v7, p3

    .line 16
    .line 17
    check-cast v7, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 28
    .line 29
    iget-object v5, v0, La/gq4;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/qj50;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v6, v3, 0x6

    .line 37
    .line 38
    const/4 v8, 0x2

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v6, v8

    .line 50
    :goto_0
    or-int/2addr v6, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v6, v3

    .line 53
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    invoke-virtual {v7, v2}, La/fet;->e(I)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    const/16 v3, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 v3, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v6, v3

    .line 69
    :cond_3
    and-int/lit16 v3, v6, 0x93

    .line 70
    .line 71
    const/16 v9, 0x92

    .line 72
    .line 73
    const/4 v10, 0x1

    .line 74
    const/4 v11, 0x0

    .line 75
    if-eq v3, v9, :cond_4

    .line 76
    .line 77
    move v3, v10

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    move v3, v11

    .line 80
    :goto_3
    and-int/2addr v6, v10

    .line 81
    invoke-virtual {v7, v6, v3}, La/fet;->U(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_1d

    .line 86
    .line 87
    iget-object v3, v0, La/gq4;->b:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, La/qdr0;

    .line 94
    .line 95
    const v3, -0x18b7d655

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    if-nez v2, :cond_5

    .line 102
    .line 103
    move v0, v11

    .line 104
    goto/16 :goto_8

    .line 105
    .line 106
    :cond_5
    instance-of v3, v2, La/t7r0;

    .line 107
    .line 108
    const/high16 v6, 0x3f800000    # 1.0f

    .line 109
    .line 110
    iget-object v9, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 111
    .line 112
    const/4 v12, 0x7

    .line 113
    const/4 v13, 0x0

    .line 114
    sget-object v14, La/jm40;->b:La/jm40;

    .line 115
    .line 116
    const/high16 v15, 0x41000000    # 8.0f

    .line 117
    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    const v0, 0xfb7e442

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v1, "TOP_HEADER_SECTION"

    .line 131
    .line 132
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 133
    .line 134
    .line 135
    move-result-object v16

    .line 136
    sget-object v0, La/qmk;->a:La/zcl;

    .line 137
    .line 138
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget v0, v0, La/wfn;->e:F

    .line 143
    .line 144
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget v1, v1, La/wfn;->e:F

    .line 149
    .line 150
    check-cast v2, La/t7r0;

    .line 151
    .line 152
    iget-object v3, v2, La/t7r0;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;

    .line 153
    .line 154
    instance-of v3, v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$BannerTape;

    .line 155
    .line 156
    if-eqz v3, :cond_6

    .line 157
    .line 158
    const/high16 v15, 0x40800000    # 4.0f

    .line 159
    .line 160
    :cond_6
    move/from16 v18, v15

    .line 161
    .line 162
    const/16 v20, 0x0

    .line 163
    .line 164
    const/16 v21, 0x8

    .line 165
    .line 166
    move/from16 v17, v0

    .line 167
    .line 168
    move/from16 v19, v1

    .line 169
    .line 170
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0, v2, v9, v7, v11}, La/s7r0;->a(La/mm40;La/t7r0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 182
    .line 183
    .line 184
    :goto_4
    move v0, v11

    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_7
    instance-of v3, v2, La/mer0;

    .line 188
    .line 189
    if-eqz v3, :cond_8

    .line 190
    .line 191
    const v0, 0xfb83c40

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v1, "SPORT_FILTER_TAPE_SECTION"

    .line 202
    .line 203
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    sget-object v0, La/qmk;->a:La/zcl;

    .line 208
    .line 209
    const/high16 v16, 0x41000000    # 8.0f

    .line 210
    .line 211
    const/16 v17, 0x7

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v14, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v2, La/mer0;

    .line 221
    .line 222
    invoke-static {v0, v2, v9, v7, v11}, La/ufx;->p(La/mm40;La/mer0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    instance-of v3, v2, La/azq0;

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    if-eqz v3, :cond_a

    .line 233
    .line 234
    const v3, 0xfb86d70

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 238
    .line 239
    .line 240
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 241
    .line 242
    .line 243
    move-result-object v16

    .line 244
    sget-object v1, La/qmk;->a:La/zcl;

    .line 245
    .line 246
    move-object v4, v2

    .line 247
    check-cast v4, La/azq0;

    .line 248
    .line 249
    iget-object v1, v4, La/azq0;->c:La/lq5;

    .line 250
    .line 251
    instance-of v1, v1, La/fq5;

    .line 252
    .line 253
    if-eqz v1, :cond_9

    .line 254
    .line 255
    move/from16 v18, v6

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_9
    move/from16 v18, v15

    .line 259
    .line 260
    :goto_5
    const/16 v19, 0x0

    .line 261
    .line 262
    const/16 v21, 0x5

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/high16 v20, 0x41000000    # 8.0f

    .line 267
    .line 268
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$BannerTape;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$BannerTape;

    .line 273
    .line 274
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 279
    .line 280
    const/4 v8, 0x0

    .line 281
    invoke-static/range {v3 .. v8}, La/hmw0;->g(La/mm40;La/azq0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_a
    instance-of v3, v2, La/v8r0;

    .line 289
    .line 290
    if-eqz v3, :cond_b

    .line 291
    .line 292
    const v0, 0xfb8b71e

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 296
    .line 297
    .line 298
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    const-string v1, "ONEXGAMES_TAPE_SECTION"

    .line 303
    .line 304
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v2, La/v8r0;

    .line 309
    .line 310
    invoke-static {v0, v2, v9, v7, v11}, La/p470;->a(La/mm40;La/v8r0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_4

    .line 317
    .line 318
    :cond_b
    instance-of v3, v2, La/f4r0;

    .line 319
    .line 320
    if-eqz v3, :cond_c

    .line 321
    .line 322
    const v0, 0xfb8deb6

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 326
    .line 327
    .line 328
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    const-string v1, "TOP_EVENTS_SECTION"

    .line 333
    .line 334
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v2, La/f4r0;

    .line 339
    .line 340
    invoke-static {v0, v2, v9, v7, v11}, La/dem0;->f(La/mm40;La/f4r0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v11}, La/fet;->r(Z)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_4

    .line 347
    .line 348
    :cond_c
    instance-of v3, v2, La/oer0;

    .line 349
    .line 350
    const/16 v11, 0xc

    .line 351
    .line 352
    if-eqz v3, :cond_d

    .line 353
    .line 354
    const v3, 0xfb9072f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 358
    .line 359
    .line 360
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v2, La/oer0;

    .line 365
    .line 366
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Live;

    .line 367
    .line 368
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    sget-object v1, La/qmk;->a:La/zcl;

    .line 373
    .line 374
    new-instance v1, La/qw3;

    .line 375
    .line 376
    new-instance v9, La/gne;

    .line 377
    .line 378
    invoke-direct {v9, v4, v11}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 379
    .line 380
    .line 381
    invoke-direct {v1, v15, v10, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    iget v4, v4, La/wfn;->c:F

    .line 389
    .line 390
    invoke-static {v4, v6, v8}, La/s5x0;->t(FFI)La/lh80;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    iget-object v8, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 395
    .line 396
    const/4 v10, 0x0

    .line 397
    move-object v6, v1

    .line 398
    move-object v9, v7

    .line 399
    move-object v7, v4

    .line 400
    move-object v4, v2

    .line 401
    invoke-static/range {v3 .. v10}, La/u7x;->s(La/mm40;La/oer0;La/xcz;La/qw3;La/lh80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 402
    .line 403
    .line 404
    move-object v7, v9

    .line 405
    const/4 v0, 0x0

    .line 406
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 407
    .line 408
    .line 409
    goto/16 :goto_9

    .line 410
    .line 411
    :cond_d
    instance-of v3, v2, La/ner0;

    .line 412
    .line 413
    if-eqz v3, :cond_e

    .line 414
    .line 415
    const v3, 0xfb94dcf

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 419
    .line 420
    .line 421
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    check-cast v2, La/ner0;

    .line 426
    .line 427
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Line;

    .line 428
    .line 429
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    sget-object v1, La/qmk;->a:La/zcl;

    .line 434
    .line 435
    new-instance v1, La/qw3;

    .line 436
    .line 437
    new-instance v9, La/gne;

    .line 438
    .line 439
    invoke-direct {v9, v4, v11}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 440
    .line 441
    .line 442
    invoke-direct {v1, v15, v10, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    iget v4, v4, La/wfn;->c:F

    .line 450
    .line 451
    invoke-static {v4, v6, v8}, La/s5x0;->t(FFI)La/lh80;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    iget-object v8, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 456
    .line 457
    const/4 v10, 0x0

    .line 458
    move-object v6, v1

    .line 459
    move-object v9, v7

    .line 460
    move-object v7, v4

    .line 461
    move-object v4, v2

    .line 462
    invoke-static/range {v3 .. v10}, La/r7x;->o(La/mm40;La/ner0;La/xcz;La/qw3;La/lh80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 463
    .line 464
    .line 465
    move-object v7, v9

    .line 466
    const/4 v0, 0x0

    .line 467
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_9

    .line 471
    .line 472
    :cond_e
    instance-of v3, v2, La/ker0;

    .line 473
    .line 474
    if-eqz v3, :cond_f

    .line 475
    .line 476
    const v3, 0xfb99411

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    const-string v3, "SPORT_CHAMPS_LIVE_SECTION"

    .line 487
    .line 488
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    move-object v4, v2

    .line 493
    check-cast v4, La/ker0;

    .line 494
    .line 495
    invoke-interface {v2}, La/qdr0;->getKey()Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v5, v1, v7}, La/qj50;->b(Ljava/lang/Object;La/fet;)La/d9z;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 504
    .line 505
    const/4 v8, 0x0

    .line 506
    invoke-static/range {v3 .. v8}, La/q8x;->t(La/mm40;La/ker0;La/d9z;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 507
    .line 508
    .line 509
    const/4 v0, 0x0

    .line 510
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_9

    .line 514
    .line 515
    :cond_f
    instance-of v3, v2, La/cyq0;

    .line 516
    .line 517
    if-eqz v3, :cond_10

    .line 518
    .line 519
    const v0, 0xfb9c916

    .line 520
    .line 521
    .line 522
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 523
    .line 524
    .line 525
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    const-string v1, "AGGREGATOR_MONTH_PROVIDER_SECTION"

    .line 530
    .line 531
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    sget-object v0, La/qmk;->a:La/zcl;

    .line 536
    .line 537
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    iget v11, v0, La/wfn;->c:F

    .line 542
    .line 543
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    iget v13, v0, La/wfn;->c:F

    .line 548
    .line 549
    const/high16 v14, 0x41000000    # 8.0f

    .line 550
    .line 551
    const/4 v15, 0x2

    .line 552
    const/4 v12, 0x0

    .line 553
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    const/high16 v1, 0x3f800000    # 1.0f

    .line 558
    .line 559
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    check-cast v2, La/cyq0;

    .line 564
    .line 565
    const/4 v1, 0x0

    .line 566
    invoke-static {v0, v2, v9, v7, v1}, La/y0x0;->b(La/mm40;La/cyq0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 570
    .line 571
    .line 572
    :goto_6
    move v0, v1

    .line 573
    goto/16 :goto_9

    .line 574
    .line 575
    :cond_10
    instance-of v3, v2, La/gyq0;

    .line 576
    .line 577
    iget-object v4, v0, La/gq4;->e:Ljava/lang/Object;

    .line 578
    .line 579
    if-eqz v3, :cond_11

    .line 580
    .line 581
    const v3, 0xfba19d1

    .line 582
    .line 583
    .line 584
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 585
    .line 586
    .line 587
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    const-string v3, "AGGREGATOR_RECOMMENDED_GAMES_SECTION"

    .line 592
    .line 593
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    const/high16 v3, 0x3f800000    # 1.0f

    .line 598
    .line 599
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    check-cast v2, La/gyq0;

    .line 604
    .line 605
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Recommended;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Recommended;

    .line 606
    .line 607
    invoke-virtual {v5, v1, v7}, La/qj50;->b(Ljava/lang/Object;La/fet;)La/d9z;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    move-object v6, v4

    .line 612
    check-cast v6, La/hh80;

    .line 613
    .line 614
    move-object v9, v7

    .line 615
    iget-object v7, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 616
    .line 617
    move-object v8, v9

    .line 618
    const/16 v9, 0xc00

    .line 619
    .line 620
    move-object v4, v2

    .line 621
    invoke-static/range {v3 .. v9}, La/xf0;->b(La/mm40;La/gyq0;La/d9z;La/hh80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 622
    .line 623
    .line 624
    move-object v7, v8

    .line 625
    const/4 v0, 0x0

    .line 626
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 627
    .line 628
    .line 629
    goto/16 :goto_9

    .line 630
    .line 631
    :cond_11
    instance-of v3, v2, La/jv60;

    .line 632
    .line 633
    if-eqz v3, :cond_12

    .line 634
    .line 635
    const v3, 0xfba5c98

    .line 636
    .line 637
    .line 638
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 639
    .line 640
    .line 641
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    const-string v3, "ONEXGAMES_CATEGORIES_SECTION"

    .line 646
    .line 647
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    move-object v4, v2

    .line 652
    check-cast v4, La/jv60;

    .line 653
    .line 654
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Categories;

    .line 655
    .line 656
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 661
    .line 662
    const/4 v8, 0x0

    .line 663
    invoke-static/range {v3 .. v8}, La/qxw;->h(La/mm40;La/jv60;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 664
    .line 665
    .line 666
    const/4 v0, 0x0

    .line 667
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_9

    .line 671
    .line 672
    :cond_12
    instance-of v3, v2, La/v370;

    .line 673
    .line 674
    if-eqz v3, :cond_13

    .line 675
    .line 676
    const v3, 0xfba9096

    .line 677
    .line 678
    .line 679
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 680
    .line 681
    .line 682
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    const-string v3, "ONEXGAMES_SPOTLIGHT_SECTION"

    .line 687
    .line 688
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    move-object v4, v2

    .line 693
    check-cast v4, La/v370;

    .line 694
    .line 695
    invoke-interface {v2}, La/qdr0;->getKey()Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 700
    .line 701
    .line 702
    move-result-object v5

    .line 703
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 704
    .line 705
    const/4 v8, 0x0

    .line 706
    invoke-static/range {v3 .. v8}, La/g1x;->g(La/mm40;La/v370;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 707
    .line 708
    .line 709
    const/4 v3, 0x0

    .line 710
    invoke-virtual {v7, v3}, La/fet;->r(Z)V

    .line 711
    .line 712
    .line 713
    :goto_7
    move v0, v3

    .line 714
    goto/16 :goto_9

    .line 715
    .line 716
    :cond_13
    const/4 v3, 0x0

    .line 717
    instance-of v11, v2, La/jyq0;

    .line 718
    .line 719
    if-eqz v11, :cond_14

    .line 720
    .line 721
    const v0, 0xfbac4fa

    .line 722
    .line 723
    .line 724
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 725
    .line 726
    .line 727
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    const-string v1, "AGGREGATOR_TOURNAMENTS_SECTION"

    .line 732
    .line 733
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    const/high16 v1, 0x3f800000    # 1.0f

    .line 738
    .line 739
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v2, La/jyq0;

    .line 744
    .line 745
    invoke-static {v0, v2, v9, v7, v3}, La/y860;->e(La/mm40;La/jyq0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v7, v3}, La/fet;->r(Z)V

    .line 749
    .line 750
    .line 751
    goto :goto_7

    .line 752
    :cond_14
    instance-of v3, v2, La/qfr0;

    .line 753
    .line 754
    if-eqz v3, :cond_15

    .line 755
    .line 756
    const v3, 0xfbaf528

    .line 757
    .line 758
    .line 759
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 760
    .line 761
    .line 762
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    const-string v3, "VIRTUAL_GAMES_SECTION"

    .line 767
    .line 768
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    check-cast v2, La/qfr0;

    .line 773
    .line 774
    iget-object v1, v2, La/qfr0;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;

    .line 775
    .line 776
    invoke-virtual {v5, v1, v7}, La/qj50;->b(Ljava/lang/Object;La/fet;)La/d9z;

    .line 777
    .line 778
    .line 779
    move-result-object v5

    .line 780
    move-object v6, v4

    .line 781
    check-cast v6, La/hh80;

    .line 782
    .line 783
    move-object v9, v7

    .line 784
    iget-object v7, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 785
    .line 786
    move-object v8, v9

    .line 787
    const/16 v9, 0xc00

    .line 788
    .line 789
    move-object v4, v2

    .line 790
    invoke-static/range {v3 .. v9}, La/hhm0;->j(La/mm40;La/qfr0;La/d9z;La/hh80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 791
    .line 792
    .line 793
    move-object v7, v8

    .line 794
    const/4 v0, 0x0

    .line 795
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_9

    .line 799
    .line 800
    :cond_15
    instance-of v3, v2, La/yxq0;

    .line 801
    .line 802
    if-eqz v3, :cond_16

    .line 803
    .line 804
    const v3, 0xfbb2f56

    .line 805
    .line 806
    .line 807
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 808
    .line 809
    .line 810
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    move-object v4, v2

    .line 815
    check-cast v4, La/yxq0;

    .line 816
    .line 817
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories;

    .line 818
    .line 819
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 820
    .line 821
    .line 822
    move-result-object v5

    .line 823
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 824
    .line 825
    const/4 v8, 0x0

    .line 826
    invoke-static/range {v3 .. v8}, La/y9a;->b(La/mm40;La/yxq0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 827
    .line 828
    .line 829
    const/4 v0, 0x0

    .line 830
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_9

    .line 834
    .line 835
    :cond_16
    instance-of v3, v2, La/fyq0;

    .line 836
    .line 837
    if-eqz v3, :cond_17

    .line 838
    .line 839
    const v0, 0xfbb5c08

    .line 840
    .line 841
    .line 842
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 843
    .line 844
    .line 845
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    iget v1, v1, La/wfn;->c:F

    .line 854
    .line 855
    invoke-static {v0, v1, v6, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    const-string v1, "AGGREGATOR_PROMO_GAMES_SECTION"

    .line 860
    .line 861
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    check-cast v2, La/fyq0;

    .line 866
    .line 867
    const/4 v1, 0x0

    .line 868
    invoke-static {v0, v2, v9, v7, v1}, La/cfx0;->a(La/mm40;La/fyq0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_6

    .line 875
    .line 876
    :cond_17
    instance-of v3, v2, La/o2r0;

    .line 877
    .line 878
    if-eqz v3, :cond_18

    .line 879
    .line 880
    const v3, 0xfbb9212

    .line 881
    .line 882
    .line 883
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 884
    .line 885
    .line 886
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    const-string v3, "CYBER_DISCIPLINES_SECTION"

    .line 891
    .line 892
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    move-object v4, v2

    .line 897
    check-cast v4, La/o2r0;

    .line 898
    .line 899
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines;

    .line 900
    .line 901
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 906
    .line 907
    const/4 v8, 0x0

    .line 908
    invoke-static/range {v3 .. v8}, La/bfb;->h(La/mm40;La/o2r0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 909
    .line 910
    .line 911
    const/4 v0, 0x0

    .line 912
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 913
    .line 914
    .line 915
    goto/16 :goto_9

    .line 916
    .line 917
    :cond_18
    instance-of v3, v2, La/q2r0;

    .line 918
    .line 919
    const/16 v6, 0xe

    .line 920
    .line 921
    if-eqz v3, :cond_19

    .line 922
    .line 923
    const v3, -0x18431160

    .line 924
    .line 925
    .line 926
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 927
    .line 928
    .line 929
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    const-string v3, "CYBER_GAMES_LIVE_SECTION"

    .line 934
    .line 935
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    check-cast v2, La/q2r0;

    .line 940
    .line 941
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Live;

    .line 942
    .line 943
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 944
    .line 945
    .line 946
    move-result-object v5

    .line 947
    sget-object v1, La/qmk;->a:La/zcl;

    .line 948
    .line 949
    move-object v9, v7

    .line 950
    new-instance v7, La/qw3;

    .line 951
    .line 952
    new-instance v1, La/jf4;

    .line 953
    .line 954
    invoke-direct {v1, v6}, La/jf4;-><init>(B)V

    .line 955
    .line 956
    .line 957
    invoke-direct {v7, v15, v10, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 958
    .line 959
    .line 960
    move-object v6, v4

    .line 961
    check-cast v6, La/hh80;

    .line 962
    .line 963
    iget-object v8, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 964
    .line 965
    const/16 v10, 0xc00

    .line 966
    .line 967
    move-object v4, v2

    .line 968
    invoke-static/range {v3 .. v10}, La/sj3;->f(La/mm40;La/q2r0;La/xcz;La/hh80;La/qw3;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 969
    .line 970
    .line 971
    move-object v7, v9

    .line 972
    const/4 v0, 0x0

    .line 973
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 974
    .line 975
    .line 976
    goto/16 :goto_9

    .line 977
    .line 978
    :cond_19
    instance-of v3, v2, La/p2r0;

    .line 979
    .line 980
    if-eqz v3, :cond_1a

    .line 981
    .line 982
    const v3, -0x183ab660

    .line 983
    .line 984
    .line 985
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 986
    .line 987
    .line 988
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    const-string v3, "CYBER_GAMES_LINE_SECTION"

    .line 993
    .line 994
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 995
    .line 996
    .line 997
    move-result-object v3

    .line 998
    check-cast v2, La/p2r0;

    .line 999
    .line 1000
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Line;

    .line 1001
    .line 1002
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v5

    .line 1006
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1007
    .line 1008
    move-object v9, v7

    .line 1009
    new-instance v7, La/qw3;

    .line 1010
    .line 1011
    new-instance v1, La/jf4;

    .line 1012
    .line 1013
    invoke-direct {v1, v6}, La/jf4;-><init>(B)V

    .line 1014
    .line 1015
    .line 1016
    invoke-direct {v7, v15, v10, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1017
    .line 1018
    .line 1019
    move-object v6, v4

    .line 1020
    check-cast v6, La/hh80;

    .line 1021
    .line 1022
    iget-object v8, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 1023
    .line 1024
    const/16 v10, 0xc00

    .line 1025
    .line 1026
    move-object v4, v2

    .line 1027
    invoke-static/range {v3 .. v10}, La/ulb;->e(La/mm40;La/p2r0;La/xcz;La/hh80;La/qw3;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1028
    .line 1029
    .line 1030
    move-object v7, v9

    .line 1031
    const/4 v0, 0x0

    .line 1032
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_9

    .line 1036
    :cond_1a
    instance-of v3, v2, La/k2r0;

    .line 1037
    .line 1038
    if-eqz v3, :cond_1b

    .line 1039
    .line 1040
    const v3, 0xfbc4f51

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 1044
    .line 1045
    .line 1046
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    const-string v3, "CYBER_CHAMPS_LIVE_SECTION"

    .line 1051
    .line 1052
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v3

    .line 1056
    move-object v4, v2

    .line 1057
    check-cast v4, La/k2r0;

    .line 1058
    .line 1059
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Live;

    .line 1060
    .line 1061
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v5

    .line 1065
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 1066
    .line 1067
    const/4 v8, 0x0

    .line 1068
    invoke-static/range {v3 .. v8}, La/obb;->j(La/mm40;La/k2r0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1069
    .line 1070
    .line 1071
    const/4 v0, 0x0

    .line 1072
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_9

    .line 1076
    :cond_1b
    instance-of v3, v2, La/i2r0;

    .line 1077
    .line 1078
    if-eqz v3, :cond_1c

    .line 1079
    .line 1080
    const v3, 0xfbc8271

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v1, v14, v13, v12}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    const-string v3, "CYBER_CHAMPS_LINE_SECTION"

    .line 1091
    .line 1092
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    move-object v4, v2

    .line 1097
    check-cast v4, La/i2r0;

    .line 1098
    .line 1099
    sget-object v1, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Line;

    .line 1100
    .line 1101
    invoke-virtual {v5, v1, v7}, La/qj50;->c(Ljava/lang/Object;La/fet;)La/xcz;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    iget-object v6, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 1106
    .line 1107
    const/4 v8, 0x0

    .line 1108
    invoke-static/range {v3 .. v8}, La/lmc;->g(La/mm40;La/i2r0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1109
    .line 1110
    .line 1111
    const/4 v0, 0x0

    .line 1112
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_9

    .line 1116
    :cond_1c
    const/4 v0, 0x0

    .line 1117
    :goto_8
    const v1, 0xfbcb131

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 1124
    .line 1125
    .line 1126
    :goto_9
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 1127
    .line 1128
    .line 1129
    goto :goto_a

    .line 1130
    :cond_1d
    invoke-virtual {v7}, La/fet;->X()V

    .line 1131
    .line 1132
    .line 1133
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1134
    .line 1135
    return-object v0
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gq4;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    sget-object v4, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    sget-object v9, La/ukd;->a:La/cl5;

    .line 15
    .line 16
    iget-object v10, v0, La/gq4;->e:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v11, v0, La/gq4;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v12, v0, La/gq4;->b:Ljava/util/List;

    .line 21
    .line 22
    const/16 v13, 0x92

    .line 23
    .line 24
    const/16 v15, 0x20

    .line 25
    .line 26
    const/high16 v16, 0x41000000    # 8.0f

    .line 27
    .line 28
    const/16 v17, 0x4

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, La/g9z;

    .line 38
    .line 39
    move-object/from16 v2, p2

    .line 40
    .line 41
    check-cast v2, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    move-object/from16 v6, p3

    .line 48
    .line 49
    check-cast v6, La/fet;

    .line 50
    .line 51
    move-object/from16 v7, p4

    .line 52
    .line 53
    check-cast v7, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    and-int/lit8 v8, v7, 0x6

    .line 60
    .line 61
    if-nez v8, :cond_1

    .line 62
    .line 63
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/16 v17, 0x2

    .line 71
    .line 72
    :goto_0
    or-int v1, v7, v17

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v1, v7

    .line 76
    :goto_1
    and-int/lit8 v7, v7, 0x30

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    invoke-virtual {v6, v2}, La/fet;->e(I)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    const/16 v15, 0x10

    .line 88
    .line 89
    :goto_2
    or-int/2addr v1, v15

    .line 90
    :cond_3
    and-int/lit16 v7, v1, 0x93

    .line 91
    .line 92
    if-eq v7, v13, :cond_4

    .line 93
    .line 94
    move v7, v5

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move v7, v14

    .line 97
    :goto_3
    and-int/2addr v1, v5

    .line 98
    invoke-virtual {v6, v1, v7}, La/fet;->U(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object/from16 v21, v1

    .line 109
    .line 110
    check-cast v21, La/awr0;

    .line 111
    .line 112
    const v1, -0x48adc6b4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v20

    .line 122
    move-object/from16 v23, v11

    .line 123
    .line 124
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    move-object/from16 v24, v10

    .line 127
    .line 128
    check-cast v24, La/xdr;

    .line 129
    .line 130
    const/16 v26, 0x6

    .line 131
    .line 132
    iget-object v0, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    move-object/from16 v22, v0

    .line 135
    .line 136
    move-object/from16 v25, v6

    .line 137
    .line 138
    invoke-static/range {v20 .. v26}, La/ltt0;->i(La/mm40;La/awr0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 139
    .line 140
    .line 141
    move-object/from16 v0, v25

    .line 142
    .line 143
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    move-object v0, v6

    .line 148
    invoke-virtual {v0}, La/fet;->X()V

    .line 149
    .line 150
    .line 151
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_0
    invoke-direct/range {p0 .. p4}, La/gq4;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_1
    invoke-direct/range {p0 .. p4}, La/gq4;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    return-object v0

    .line 164
    :pswitch_2
    check-cast v11, La/mm40;

    .line 165
    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, La/g9z;

    .line 169
    .line 170
    move-object/from16 v1, p2

    .line 171
    .line 172
    check-cast v1, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    move-object/from16 v3, p3

    .line 179
    .line 180
    check-cast v3, La/fet;

    .line 181
    .line 182
    move-object/from16 v4, p4

    .line 183
    .line 184
    check-cast v4, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    check-cast v10, La/ner0;

    .line 191
    .line 192
    and-int/lit8 v6, v4, 0x6

    .line 193
    .line 194
    if-nez v6, :cond_7

    .line 195
    .line 196
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-eqz v6, :cond_6

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_6
    const/16 v17, 0x2

    .line 204
    .line 205
    :goto_5
    or-int v6, v4, v17

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_7
    move v6, v4

    .line 209
    :goto_6
    and-int/lit8 v4, v4, 0x30

    .line 210
    .line 211
    if-nez v4, :cond_9

    .line 212
    .line 213
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_8

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_8
    const/16 v15, 0x10

    .line 221
    .line 222
    :goto_7
    or-int/2addr v6, v15

    .line 223
    :cond_9
    and-int/lit16 v4, v6, 0x93

    .line 224
    .line 225
    if-eq v4, v13, :cond_a

    .line 226
    .line 227
    move v4, v5

    .line 228
    goto :goto_8

    .line 229
    :cond_a
    move v4, v14

    .line 230
    :goto_8
    and-int/2addr v5, v6

    .line 231
    invoke-virtual {v3, v5, v4}, La/fet;->U(IZ)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_12

    .line 236
    .line 237
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, La/a2n;

    .line 242
    .line 243
    const v4, -0x730422be

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 247
    .line 248
    .line 249
    if-nez v1, :cond_b

    .line 250
    .line 251
    goto/16 :goto_9

    .line 252
    .line 253
    :cond_b
    instance-of v4, v1, La/y56;

    .line 254
    .line 255
    if-eqz v4, :cond_e

    .line 256
    .line 257
    const v4, -0x1c7bfbc2

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v0, v11, v7, v2}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 264
    .line 265
    .line 266
    move-result-object v20

    .line 267
    move-object/from16 v21, v1

    .line 268
    .line 269
    check-cast v21, La/y56;

    .line 270
    .line 271
    iget-boolean v0, v10, La/ner0;->b:Z

    .line 272
    .line 273
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    if-nez v1, :cond_c

    .line 282
    .line 283
    if-ne v2, v9, :cond_d

    .line 284
    .line 285
    :cond_c
    new-instance v2, La/v6a0;

    .line 286
    .line 287
    const/16 v1, 0x16

    .line 288
    .line 289
    invoke-direct {v2, v8, v1}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_d
    move-object/from16 v23, v2

    .line 296
    .line 297
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    const/16 v27, 0x10

    .line 302
    .line 303
    const/16 v24, 0x0

    .line 304
    .line 305
    move/from16 v22, v0

    .line 306
    .line 307
    move-object/from16 v25, v3

    .line 308
    .line 309
    invoke-static/range {v20 .. v27}, La/vcc;->i(La/mm40;La/y56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v14}, La/fet;->r(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_e
    instance-of v4, v1, La/c2o0;

    .line 317
    .line 318
    if-eqz v4, :cond_11

    .line 319
    .line 320
    const v4, -0x1c7bccbe

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v11, v7, v2}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 327
    .line 328
    .line 329
    move-result-object v20

    .line 330
    move-object/from16 v21, v1

    .line 331
    .line 332
    check-cast v21, La/c2o0;

    .line 333
    .line 334
    iget-boolean v0, v10, La/ner0;->b:Z

    .line 335
    .line 336
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    if-nez v1, :cond_f

    .line 345
    .line 346
    if-ne v2, v9, :cond_10

    .line 347
    .line 348
    :cond_f
    new-instance v2, La/v6a0;

    .line 349
    .line 350
    const/16 v1, 0x17

    .line 351
    .line 352
    invoke-direct {v2, v8, v1}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_10
    move-object/from16 v23, v2

    .line 359
    .line 360
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 361
    .line 362
    const/16 v26, 0x0

    .line 363
    .line 364
    const/16 v27, 0x10

    .line 365
    .line 366
    const/16 v24, 0x0

    .line 367
    .line 368
    move/from16 v22, v0

    .line 369
    .line 370
    move-object/from16 v25, v3

    .line 371
    .line 372
    invoke-static/range {v20 .. v27}, La/hkb;->n(La/mm40;La/c2o0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v14}, La/fet;->r(Z)V

    .line 376
    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_11
    :goto_9
    const v0, -0x72f89fee

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v14}, La/fet;->r(Z)V

    .line 386
    .line 387
    .line 388
    :goto_a
    invoke-virtual {v3, v14}, La/fet;->r(Z)V

    .line 389
    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_12
    invoke-virtual {v3}, La/fet;->X()V

    .line 393
    .line 394
    .line 395
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_3
    invoke-direct/range {p0 .. p4}, La/gq4;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    return-object v0

    .line 403
    :pswitch_4
    move-object/from16 v1, p1

    .line 404
    .line 405
    check-cast v1, La/g9z;

    .line 406
    .line 407
    move-object/from16 v2, p2

    .line 408
    .line 409
    check-cast v2, Ljava/lang/Number;

    .line 410
    .line 411
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    move-object/from16 v3, p3

    .line 416
    .line 417
    check-cast v3, La/fet;

    .line 418
    .line 419
    move-object/from16 v4, p4

    .line 420
    .line 421
    check-cast v4, Ljava/lang/Number;

    .line 422
    .line 423
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    check-cast v11, Ljava/util/List;

    .line 428
    .line 429
    and-int/lit8 v6, v4, 0x6

    .line 430
    .line 431
    if-nez v6, :cond_14

    .line 432
    .line 433
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_13

    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_13
    const/16 v17, 0x2

    .line 441
    .line 442
    :goto_c
    or-int v1, v4, v17

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :cond_14
    move v1, v4

    .line 446
    :goto_d
    and-int/lit8 v4, v4, 0x30

    .line 447
    .line 448
    if-nez v4, :cond_16

    .line 449
    .line 450
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    if-eqz v4, :cond_15

    .line 455
    .line 456
    goto :goto_e

    .line 457
    :cond_15
    const/16 v15, 0x10

    .line 458
    .line 459
    :goto_e
    or-int/2addr v1, v15

    .line 460
    :cond_16
    and-int/lit16 v4, v1, 0x93

    .line 461
    .line 462
    if-eq v4, v13, :cond_17

    .line 463
    .line 464
    move v4, v5

    .line 465
    goto :goto_f

    .line 466
    :cond_17
    move v4, v14

    .line 467
    :goto_f
    and-int/2addr v1, v5

    .line 468
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_1c

    .line 473
    .line 474
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    move-object/from16 v20, v1

    .line 479
    .line 480
    check-cast v20, La/iqh0;

    .line 481
    .line 482
    const v1, -0x1dd4c853

    .line 483
    .line 484
    .line 485
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 486
    .line 487
    .line 488
    invoke-static {v11}, La/q3d;->i(Ljava/util/List;)I

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-ne v2, v1, :cond_18

    .line 493
    .line 494
    move/from16 v24, v5

    .line 495
    .line 496
    goto :goto_10

    .line 497
    :cond_18
    move/from16 v24, v14

    .line 498
    .line 499
    :goto_10
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    move v4, v14

    .line 504
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    if-eqz v6, :cond_1a

    .line 509
    .line 510
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    check-cast v6, La/iqh0;

    .line 515
    .line 516
    instance-of v6, v6, La/dqh0;

    .line 517
    .line 518
    if-nez v6, :cond_19

    .line 519
    .line 520
    goto :goto_12

    .line 521
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 522
    .line 523
    goto :goto_11

    .line 524
    :cond_1a
    const/4 v4, -0x1

    .line 525
    :goto_12
    if-ne v2, v4, :cond_1b

    .line 526
    .line 527
    move/from16 v23, v5

    .line 528
    .line 529
    goto :goto_13

    .line 530
    :cond_1b
    move/from16 v23, v14

    .line 531
    .line 532
    :goto_13
    move-object/from16 v21, v10

    .line 533
    .line 534
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 535
    .line 536
    iget-object v0, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 537
    .line 538
    const/16 v26, 0x0

    .line 539
    .line 540
    move-object/from16 v22, v0

    .line 541
    .line 542
    move-object/from16 v25, v3

    .line 543
    .line 544
    invoke-static/range {v20 .. v26}, La/ccq0;->y(La/iqh0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZZLa/fet;I)V

    .line 545
    .line 546
    .line 547
    move-object/from16 v0, v25

    .line 548
    .line 549
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 550
    .line 551
    .line 552
    goto :goto_14

    .line 553
    :cond_1c
    move-object v0, v3

    .line 554
    invoke-virtual {v0}, La/fet;->X()V

    .line 555
    .line 556
    .line 557
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_5
    move-object/from16 v1, p1

    .line 561
    .line 562
    check-cast v1, La/g9z;

    .line 563
    .line 564
    move-object/from16 v3, p2

    .line 565
    .line 566
    check-cast v3, Ljava/lang/Number;

    .line 567
    .line 568
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    move-object/from16 v6, p3

    .line 573
    .line 574
    check-cast v6, La/fet;

    .line 575
    .line 576
    move-object/from16 v8, p4

    .line 577
    .line 578
    check-cast v8, Ljava/lang/Number;

    .line 579
    .line 580
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    and-int/lit8 v9, v8, 0x6

    .line 585
    .line 586
    if-nez v9, :cond_1e

    .line 587
    .line 588
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    if-eqz v9, :cond_1d

    .line 593
    .line 594
    goto :goto_15

    .line 595
    :cond_1d
    const/16 v17, 0x2

    .line 596
    .line 597
    :goto_15
    or-int v9, v8, v17

    .line 598
    .line 599
    goto :goto_16

    .line 600
    :cond_1e
    move v9, v8

    .line 601
    :goto_16
    and-int/lit8 v8, v8, 0x30

    .line 602
    .line 603
    if-nez v8, :cond_20

    .line 604
    .line 605
    invoke-virtual {v6, v3}, La/fet;->e(I)Z

    .line 606
    .line 607
    .line 608
    move-result v8

    .line 609
    if-eqz v8, :cond_1f

    .line 610
    .line 611
    goto :goto_17

    .line 612
    :cond_1f
    const/16 v15, 0x10

    .line 613
    .line 614
    :goto_17
    or-int/2addr v9, v15

    .line 615
    :cond_20
    and-int/lit16 v8, v9, 0x93

    .line 616
    .line 617
    if-eq v8, v13, :cond_21

    .line 618
    .line 619
    move v8, v5

    .line 620
    goto :goto_18

    .line 621
    :cond_21
    move v8, v14

    .line 622
    :goto_18
    and-int/2addr v9, v5

    .line 623
    invoke-virtual {v6, v9, v8}, La/fet;->U(IZ)Z

    .line 624
    .line 625
    .line 626
    move-result v8

    .line 627
    if-eqz v8, :cond_24

    .line 628
    .line 629
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    move-object/from16 v20, v8

    .line 634
    .line 635
    check-cast v20, La/ooh0;

    .line 636
    .line 637
    const v8, -0x65b7b0db

    .line 638
    .line 639
    .line 640
    invoke-virtual {v6, v8}, La/fet;->e0(I)V

    .line 641
    .line 642
    .line 643
    if-nez v3, :cond_22

    .line 644
    .line 645
    move/from16 v23, v5

    .line 646
    .line 647
    goto :goto_19

    .line 648
    :cond_22
    move/from16 v23, v14

    .line 649
    .line 650
    :goto_19
    check-cast v11, La/a4x;

    .line 651
    .line 652
    invoke-static {v11}, La/q3d;->i(Ljava/util/List;)I

    .line 653
    .line 654
    .line 655
    move-result v8

    .line 656
    if-ne v3, v8, :cond_23

    .line 657
    .line 658
    move/from16 v24, v5

    .line 659
    .line 660
    goto :goto_1a

    .line 661
    :cond_23
    move/from16 v24, v14

    .line 662
    .line 663
    :goto_1a
    move-object/from16 v21, v10

    .line 664
    .line 665
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 666
    .line 667
    invoke-static {v1, v4, v7, v2}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 668
    .line 669
    .line 670
    move-result-object v25

    .line 671
    const/16 v27, 0x0

    .line 672
    .line 673
    iget-object v0, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 674
    .line 675
    move-object/from16 v22, v0

    .line 676
    .line 677
    move-object/from16 v26, v6

    .line 678
    .line 679
    invoke-static/range {v20 .. v27}, La/dub;->j(La/ooh0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZZLa/mm40;La/fet;I)V

    .line 680
    .line 681
    .line 682
    move-object/from16 v0, v26

    .line 683
    .line 684
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 685
    .line 686
    .line 687
    goto :goto_1b

    .line 688
    :cond_24
    move-object v0, v6

    .line 689
    invoke-virtual {v0}, La/fet;->X()V

    .line 690
    .line 691
    .line 692
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    return-object v0

    .line 695
    :pswitch_6
    move-object/from16 v0, p1

    .line 696
    .line 697
    check-cast v0, La/g9z;

    .line 698
    .line 699
    move-object/from16 v1, p2

    .line 700
    .line 701
    check-cast v1, Ljava/lang/Number;

    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    move-object/from16 v2, p3

    .line 708
    .line 709
    check-cast v2, La/fet;

    .line 710
    .line 711
    move-object/from16 v3, p4

    .line 712
    .line 713
    check-cast v3, Ljava/lang/Number;

    .line 714
    .line 715
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    check-cast v10, La/vne;

    .line 720
    .line 721
    check-cast v11, La/xcz;

    .line 722
    .line 723
    and-int/lit8 v4, v3, 0x6

    .line 724
    .line 725
    if-nez v4, :cond_26

    .line 726
    .line 727
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-eqz v0, :cond_25

    .line 732
    .line 733
    goto :goto_1c

    .line 734
    :cond_25
    const/16 v17, 0x2

    .line 735
    .line 736
    :goto_1c
    or-int v0, v3, v17

    .line 737
    .line 738
    goto :goto_1d

    .line 739
    :cond_26
    move v0, v3

    .line 740
    :goto_1d
    and-int/lit8 v3, v3, 0x30

    .line 741
    .line 742
    if-nez v3, :cond_28

    .line 743
    .line 744
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-eqz v3, :cond_27

    .line 749
    .line 750
    move/from16 v18, v15

    .line 751
    .line 752
    goto :goto_1e

    .line 753
    :cond_27
    const/16 v18, 0x10

    .line 754
    .line 755
    :goto_1e
    or-int v0, v0, v18

    .line 756
    .line 757
    :cond_28
    and-int/lit16 v3, v0, 0x93

    .line 758
    .line 759
    if-eq v3, v13, :cond_29

    .line 760
    .line 761
    move v3, v5

    .line 762
    goto :goto_1f

    .line 763
    :cond_29
    move v3, v14

    .line 764
    :goto_1f
    and-int/lit8 v4, v0, 0x1

    .line 765
    .line 766
    invoke-virtual {v2, v4, v3}, La/fet;->U(IZ)Z

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    if-eqz v3, :cond_31

    .line 771
    .line 772
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    check-cast v3, La/beo0;

    .line 777
    .line 778
    const v4, -0x2f0d7adf

    .line 779
    .line 780
    .line 781
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    invoke-virtual {v2, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v7

    .line 792
    or-int/2addr v4, v7

    .line 793
    and-int/lit8 v7, v0, 0x70

    .line 794
    .line 795
    xor-int/lit8 v7, v7, 0x30

    .line 796
    .line 797
    if-le v7, v15, :cond_2a

    .line 798
    .line 799
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 800
    .line 801
    .line 802
    move-result v7

    .line 803
    if-nez v7, :cond_2c

    .line 804
    .line 805
    :cond_2a
    and-int/lit8 v0, v0, 0x30

    .line 806
    .line 807
    if-ne v0, v15, :cond_2b

    .line 808
    .line 809
    goto :goto_20

    .line 810
    :cond_2b
    move v5, v14

    .line 811
    :cond_2c
    :goto_20
    or-int v0, v4, v5

    .line 812
    .line 813
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    or-int/2addr v0, v4

    .line 818
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    if-nez v0, :cond_2d

    .line 823
    .line 824
    if-ne v4, v9, :cond_2e

    .line 825
    .line 826
    :cond_2d
    new-instance v4, La/qrb0;

    .line 827
    .line 828
    invoke-direct {v4, v11, v10, v1, v8}, La/qrb0;-><init>(La/xcz;La/vne;ILkotlin/jvm/functions/Function1;)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    :cond_2e
    move-object/from16 v25, v4

    .line 835
    .line 836
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 837
    .line 838
    const/16 v26, 0x1c

    .line 839
    .line 840
    sget-object v20, La/jm40;->b:La/jm40;

    .line 841
    .line 842
    const/16 v21, 0x0

    .line 843
    .line 844
    const/16 v22, 0x0

    .line 845
    .line 846
    const/16 v23, 0x0

    .line 847
    .line 848
    const/16 v24, 0x0

    .line 849
    .line 850
    invoke-static/range {v20 .. v26}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    sget-object v1, La/qmk;->a:La/zcl;

    .line 855
    .line 856
    const/high16 v1, 0x40800000    # 4.0f

    .line 857
    .line 858
    const/4 v4, 0x2

    .line 859
    invoke-static {v0, v1, v6, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    if-nez v1, :cond_2f

    .line 872
    .line 873
    if-ne v4, v9, :cond_30

    .line 874
    .line 875
    :cond_2f
    new-instance v4, La/caz;

    .line 876
    .line 877
    const/16 v1, 0xc

    .line 878
    .line 879
    invoke-direct {v4, v3, v1}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    :cond_30
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 886
    .line 887
    const v1, 0x7f140710

    .line 888
    .line 889
    .line 890
    invoke-static {v1, v14, v2, v0, v4}, La/fbc;->b(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2, v14}, La/fet;->r(Z)V

    .line 894
    .line 895
    .line 896
    goto :goto_21

    .line 897
    :cond_31
    invoke-virtual {v2}, La/fet;->X()V

    .line 898
    .line 899
    .line 900
    :goto_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 901
    .line 902
    return-object v0

    .line 903
    :pswitch_7
    move-object/from16 v0, p1

    .line 904
    .line 905
    check-cast v0, La/g9z;

    .line 906
    .line 907
    move-object/from16 v1, p2

    .line 908
    .line 909
    check-cast v1, Ljava/lang/Number;

    .line 910
    .line 911
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    move-object/from16 v2, p3

    .line 916
    .line 917
    check-cast v2, La/fet;

    .line 918
    .line 919
    move-object/from16 v3, p4

    .line 920
    .line 921
    check-cast v3, Ljava/lang/Number;

    .line 922
    .line 923
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    check-cast v11, La/kwj;

    .line 928
    .line 929
    and-int/lit8 v4, v3, 0x6

    .line 930
    .line 931
    if-nez v4, :cond_33

    .line 932
    .line 933
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-eqz v0, :cond_32

    .line 938
    .line 939
    goto :goto_22

    .line 940
    :cond_32
    const/16 v17, 0x2

    .line 941
    .line 942
    :goto_22
    or-int v0, v3, v17

    .line 943
    .line 944
    goto :goto_23

    .line 945
    :cond_33
    move v0, v3

    .line 946
    :goto_23
    and-int/lit8 v3, v3, 0x30

    .line 947
    .line 948
    if-nez v3, :cond_35

    .line 949
    .line 950
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    if-eqz v3, :cond_34

    .line 955
    .line 956
    move/from16 v18, v15

    .line 957
    .line 958
    goto :goto_24

    .line 959
    :cond_34
    const/16 v18, 0x10

    .line 960
    .line 961
    :goto_24
    or-int v0, v0, v18

    .line 962
    .line 963
    :cond_35
    and-int/lit16 v3, v0, 0x93

    .line 964
    .line 965
    if-eq v3, v13, :cond_36

    .line 966
    .line 967
    move v3, v5

    .line 968
    goto :goto_25

    .line 969
    :cond_36
    move v3, v14

    .line 970
    :goto_25
    and-int/lit8 v4, v0, 0x1

    .line 971
    .line 972
    invoke-virtual {v2, v4, v3}, La/fet;->U(IZ)Z

    .line 973
    .line 974
    .line 975
    move-result v3

    .line 976
    if-eqz v3, :cond_43

    .line 977
    .line 978
    check-cast v12, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    check-cast v3, La/mxl;

    .line 985
    .line 986
    const v4, 0x1eeef7a3

    .line 987
    .line 988
    .line 989
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v4

    .line 996
    and-int/lit8 v6, v0, 0x70

    .line 997
    .line 998
    xor-int/lit8 v6, v6, 0x30

    .line 999
    .line 1000
    if-le v6, v15, :cond_37

    .line 1001
    .line 1002
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v7

    .line 1006
    if-nez v7, :cond_38

    .line 1007
    .line 1008
    :cond_37
    and-int/lit8 v7, v0, 0x30

    .line 1009
    .line 1010
    if-ne v7, v15, :cond_39

    .line 1011
    .line 1012
    :cond_38
    move v7, v5

    .line 1013
    goto :goto_26

    .line 1014
    :cond_39
    move v7, v14

    .line 1015
    :goto_26
    or-int/2addr v4, v7

    .line 1016
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v7

    .line 1020
    if-nez v4, :cond_3a

    .line 1021
    .line 1022
    if-ne v7, v9, :cond_3b

    .line 1023
    .line 1024
    :cond_3a
    new-instance v7, La/bp40;

    .line 1025
    .line 1026
    invoke-direct {v7, v8, v1, v5}, La/bp40;-><init>(Lkotlin/jvm/functions/Function1;IB)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1030
    .line 1031
    .line 1032
    :cond_3b
    move-object/from16 v21, v7

    .line 1033
    .line 1034
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 1035
    .line 1036
    const/16 v22, 0x1c

    .line 1037
    .line 1038
    sget-object v16, La/jm40;->b:La/jm40;

    .line 1039
    .line 1040
    const/16 v17, 0x0

    .line 1041
    .line 1042
    const/16 v18, 0x0

    .line 1043
    .line 1044
    const/16 v19, 0x0

    .line 1045
    .line 1046
    const/16 v20, 0x0

    .line 1047
    .line 1048
    invoke-static/range {v16 .. v22}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    if-le v6, v15, :cond_3c

    .line 1053
    .line 1054
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v6

    .line 1058
    if-nez v6, :cond_3e

    .line 1059
    .line 1060
    :cond_3c
    and-int/lit8 v0, v0, 0x30

    .line 1061
    .line 1062
    if-ne v0, v15, :cond_3d

    .line 1063
    .line 1064
    goto :goto_27

    .line 1065
    :cond_3d
    move v5, v14

    .line 1066
    :cond_3e
    :goto_27
    invoke-virtual {v2, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    or-int/2addr v0, v5

    .line 1071
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    if-nez v0, :cond_3f

    .line 1076
    .line 1077
    if-ne v5, v9, :cond_40

    .line 1078
    .line 1079
    :cond_3f
    new-instance v5, La/ufe;

    .line 1080
    .line 1081
    check-cast v10, La/cgk0;

    .line 1082
    .line 1083
    invoke-direct {v5, v1, v11, v10}, La/ufe;-><init>(ILa/kwj;La/cgk0;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    :cond_40
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1090
    .line 1091
    invoke-static {v4, v5}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v20

    .line 1095
    invoke-virtual {v2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v0

    .line 1099
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    if-nez v0, :cond_41

    .line 1104
    .line 1105
    if-ne v1, v9, :cond_42

    .line 1106
    .line 1107
    :cond_41
    new-instance v1, La/caz;

    .line 1108
    .line 1109
    const/4 v0, 0x6

    .line 1110
    invoke-direct {v1, v3, v0}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    :cond_42
    move-object/from16 v22, v1

    .line 1117
    .line 1118
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 1119
    .line 1120
    const/16 v24, 0x0

    .line 1121
    .line 1122
    const/16 v25, 0x2

    .line 1123
    .line 1124
    const/16 v21, 0x0

    .line 1125
    .line 1126
    move-object/from16 v23, v2

    .line 1127
    .line 1128
    invoke-static/range {v20 .. v25}, La/v3c;->n(La/mm40;La/wxl;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1129
    .line 1130
    .line 1131
    move-object/from16 v0, v23

    .line 1132
    .line 1133
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_28

    .line 1137
    :cond_43
    move-object v0, v2

    .line 1138
    invoke-virtual {v0}, La/fet;->X()V

    .line 1139
    .line 1140
    .line 1141
    :goto_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1142
    .line 1143
    return-object v0

    .line 1144
    :pswitch_8
    move-object/from16 v0, p1

    .line 1145
    .line 1146
    check-cast v0, La/g9z;

    .line 1147
    .line 1148
    move-object/from16 v1, p2

    .line 1149
    .line 1150
    check-cast v1, Ljava/lang/Number;

    .line 1151
    .line 1152
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1153
    .line 1154
    .line 1155
    move-result v1

    .line 1156
    move-object/from16 v2, p3

    .line 1157
    .line 1158
    check-cast v2, La/fet;

    .line 1159
    .line 1160
    move-object/from16 v3, p4

    .line 1161
    .line 1162
    check-cast v3, Ljava/lang/Number;

    .line 1163
    .line 1164
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1165
    .line 1166
    .line 1167
    move-result v3

    .line 1168
    and-int/lit8 v4, v3, 0x6

    .line 1169
    .line 1170
    if-nez v4, :cond_45

    .line 1171
    .line 1172
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    if-eqz v0, :cond_44

    .line 1177
    .line 1178
    goto :goto_29

    .line 1179
    :cond_44
    const/16 v17, 0x2

    .line 1180
    .line 1181
    :goto_29
    or-int v0, v3, v17

    .line 1182
    .line 1183
    goto :goto_2a

    .line 1184
    :cond_45
    move v0, v3

    .line 1185
    :goto_2a
    and-int/lit8 v3, v3, 0x30

    .line 1186
    .line 1187
    if-nez v3, :cond_47

    .line 1188
    .line 1189
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v3

    .line 1193
    if-eqz v3, :cond_46

    .line 1194
    .line 1195
    goto :goto_2b

    .line 1196
    :cond_46
    const/16 v15, 0x10

    .line 1197
    .line 1198
    :goto_2b
    or-int/2addr v0, v15

    .line 1199
    :cond_47
    and-int/lit16 v3, v0, 0x93

    .line 1200
    .line 1201
    if-eq v3, v13, :cond_48

    .line 1202
    .line 1203
    move v3, v5

    .line 1204
    goto :goto_2c

    .line 1205
    :cond_48
    move v3, v14

    .line 1206
    :goto_2c
    and-int/2addr v0, v5

    .line 1207
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v0

    .line 1211
    if-eqz v0, :cond_4f

    .line 1212
    .line 1213
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    check-cast v0, La/m85;

    .line 1218
    .line 1219
    const v3, 0x30c1dcb9

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 1223
    .line 1224
    .line 1225
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v3

    .line 1229
    iget v3, v3, La/wfn;->d:F

    .line 1230
    .line 1231
    sget-object v4, La/jm40;->b:La/jm40;

    .line 1232
    .line 1233
    const/4 v12, 0x2

    .line 1234
    invoke-static {v4, v3, v6, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    check-cast v11, La/frz;

    .line 1239
    .line 1240
    iget-object v6, v11, La/frz;->a:La/a4x;

    .line 1241
    .line 1242
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1243
    .line 1244
    .line 1245
    move-result v6

    .line 1246
    sub-int/2addr v6, v5

    .line 1247
    if-ne v1, v6, :cond_49

    .line 1248
    .line 1249
    check-cast v10, La/hh80;

    .line 1250
    .line 1251
    invoke-interface {v10}, La/hh80;->a()F

    .line 1252
    .line 1253
    .line 1254
    move-result v6

    .line 1255
    sget-object v10, La/qmk;->a:La/zcl;

    .line 1256
    .line 1257
    add-float v24, v6, v16

    .line 1258
    .line 1259
    const/16 v25, 0x7

    .line 1260
    .line 1261
    const/16 v21, 0x0

    .line 1262
    .line 1263
    const/16 v22, 0x0

    .line 1264
    .line 1265
    const/16 v23, 0x0

    .line 1266
    .line 1267
    move-object/from16 v20, v4

    .line 1268
    .line 1269
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v4

    .line 1273
    goto :goto_2d

    .line 1274
    :cond_49
    move-object/from16 v20, v4

    .line 1275
    .line 1276
    :goto_2d
    invoke-interface {v3, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v3

    .line 1280
    if-nez v1, :cond_4a

    .line 1281
    .line 1282
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1283
    .line 1284
    const/16 v24, 0x0

    .line 1285
    .line 1286
    const/16 v25, 0xd

    .line 1287
    .line 1288
    const/16 v21, 0x0

    .line 1289
    .line 1290
    const/high16 v22, 0x41000000    # 8.0f

    .line 1291
    .line 1292
    const/16 v23, 0x0

    .line 1293
    .line 1294
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v4

    .line 1298
    goto :goto_2e

    .line 1299
    :cond_4a
    move-object/from16 v4, v20

    .line 1300
    .line 1301
    :goto_2e
    invoke-interface {v3, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v20

    .line 1305
    new-instance v21, La/rqm;

    .line 1306
    .line 1307
    new-instance v1, La/tui0;

    .line 1308
    .line 1309
    iget-object v3, v0, La/m85;->b:Ljava/lang/String;

    .line 1310
    .line 1311
    invoke-direct {v1, v3, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1312
    .line 1313
    .line 1314
    new-instance v3, La/nvi0;

    .line 1315
    .line 1316
    iget-boolean v4, v0, La/m85;->d:Z

    .line 1317
    .line 1318
    invoke-direct {v3, v4}, La/nvi0;-><init>(Z)V

    .line 1319
    .line 1320
    .line 1321
    iget-object v4, v0, La/m85;->c:La/wui0;

    .line 1322
    .line 1323
    const/16 v29, 0x0

    .line 1324
    .line 1325
    const/16 v30, 0x1ba

    .line 1326
    .line 1327
    const/16 v23, 0x0

    .line 1328
    .line 1329
    const/16 v25, 0x0

    .line 1330
    .line 1331
    const/16 v26, 0x0

    .line 1332
    .line 1333
    const/16 v28, 0x0

    .line 1334
    .line 1335
    move-object/from16 v22, v1

    .line 1336
    .line 1337
    move-object/from16 v24, v3

    .line 1338
    .line 1339
    move-object/from16 v27, v4

    .line 1340
    .line 1341
    invoke-direct/range {v21 .. v30}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1345
    .line 1346
    .line 1347
    move-result v1

    .line 1348
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v3

    .line 1352
    or-int/2addr v1, v3

    .line 1353
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    if-nez v1, :cond_4b

    .line 1358
    .line 1359
    if-ne v3, v9, :cond_4c

    .line 1360
    .line 1361
    :cond_4b
    new-instance v3, La/zqz;

    .line 1362
    .line 1363
    invoke-direct {v3, v8, v0, v14}, La/zqz;-><init>(Lkotlin/jvm/functions/Function1;La/m85;B)V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    :cond_4c
    move-object/from16 v24, v3

    .line 1370
    .line 1371
    check-cast v24, Lkotlin/jvm/functions/Function0;

    .line 1372
    .line 1373
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v1

    .line 1377
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v3

    .line 1381
    or-int/2addr v1, v3

    .line 1382
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v3

    .line 1386
    if-nez v1, :cond_4d

    .line 1387
    .line 1388
    if-ne v3, v9, :cond_4e

    .line 1389
    .line 1390
    :cond_4d
    new-instance v3, La/zqz;

    .line 1391
    .line 1392
    invoke-direct {v3, v8, v0, v5}, La/zqz;-><init>(Lkotlin/jvm/functions/Function1;La/m85;B)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1396
    .line 1397
    .line 1398
    :cond_4e
    move-object/from16 v26, v3

    .line 1399
    .line 1400
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 1401
    .line 1402
    const/16 v29, 0x180

    .line 1403
    .line 1404
    const/16 v30, 0xa8

    .line 1405
    .line 1406
    const/16 v22, 0x0

    .line 1407
    .line 1408
    const/16 v23, 0x0

    .line 1409
    .line 1410
    const/16 v25, 0x0

    .line 1411
    .line 1412
    const/16 v27, 0x0

    .line 1413
    .line 1414
    move-object/from16 v28, v2

    .line 1415
    .line 1416
    invoke-static/range {v20 .. v30}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1417
    .line 1418
    .line 1419
    move-object/from16 v0, v28

    .line 1420
    .line 1421
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 1422
    .line 1423
    .line 1424
    goto :goto_2f

    .line 1425
    :cond_4f
    move-object v0, v2

    .line 1426
    invoke-virtual {v0}, La/fet;->X()V

    .line 1427
    .line 1428
    .line 1429
    :goto_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1430
    .line 1431
    return-object v0

    .line 1432
    :pswitch_9
    move-object/from16 v0, p1

    .line 1433
    .line 1434
    check-cast v0, La/g9z;

    .line 1435
    .line 1436
    move-object/from16 v1, p2

    .line 1437
    .line 1438
    check-cast v1, Ljava/lang/Number;

    .line 1439
    .line 1440
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1441
    .line 1442
    .line 1443
    move-result v1

    .line 1444
    move-object/from16 v2, p3

    .line 1445
    .line 1446
    check-cast v2, La/fet;

    .line 1447
    .line 1448
    move-object/from16 v3, p4

    .line 1449
    .line 1450
    check-cast v3, Ljava/lang/Number;

    .line 1451
    .line 1452
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1453
    .line 1454
    .line 1455
    move-result v3

    .line 1456
    and-int/lit8 v4, v3, 0x6

    .line 1457
    .line 1458
    if-nez v4, :cond_51

    .line 1459
    .line 1460
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    move-result v0

    .line 1464
    if-eqz v0, :cond_50

    .line 1465
    .line 1466
    goto :goto_30

    .line 1467
    :cond_50
    const/16 v17, 0x2

    .line 1468
    .line 1469
    :goto_30
    or-int v0, v3, v17

    .line 1470
    .line 1471
    goto :goto_31

    .line 1472
    :cond_51
    move v0, v3

    .line 1473
    :goto_31
    and-int/lit8 v3, v3, 0x30

    .line 1474
    .line 1475
    if-nez v3, :cond_53

    .line 1476
    .line 1477
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v3

    .line 1481
    if-eqz v3, :cond_52

    .line 1482
    .line 1483
    goto :goto_32

    .line 1484
    :cond_52
    const/16 v15, 0x10

    .line 1485
    .line 1486
    :goto_32
    or-int/2addr v0, v15

    .line 1487
    :cond_53
    and-int/lit16 v3, v0, 0x93

    .line 1488
    .line 1489
    if-eq v3, v13, :cond_54

    .line 1490
    .line 1491
    move v3, v5

    .line 1492
    goto :goto_33

    .line 1493
    :cond_54
    move v3, v14

    .line 1494
    :goto_33
    and-int/2addr v0, v5

    .line 1495
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v0

    .line 1499
    if-eqz v0, :cond_5a

    .line 1500
    .line 1501
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    check-cast v0, La/w95;

    .line 1506
    .line 1507
    const v3, 0x343c1035

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 1511
    .line 1512
    .line 1513
    check-cast v11, La/kqz;

    .line 1514
    .line 1515
    iget-object v3, v11, La/kqz;->a:La/a4x;

    .line 1516
    .line 1517
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1518
    .line 1519
    .line 1520
    move-result v3

    .line 1521
    sub-int/2addr v3, v5

    .line 1522
    sget-object v17, La/jm40;->b:La/jm40;

    .line 1523
    .line 1524
    if-ne v1, v3, :cond_55

    .line 1525
    .line 1526
    check-cast v10, La/hh80;

    .line 1527
    .line 1528
    invoke-interface {v10}, La/hh80;->a()F

    .line 1529
    .line 1530
    .line 1531
    move-result v1

    .line 1532
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1533
    .line 1534
    add-float v21, v1, v16

    .line 1535
    .line 1536
    const/16 v22, 0x7

    .line 1537
    .line 1538
    const/16 v18, 0x0

    .line 1539
    .line 1540
    const/16 v19, 0x0

    .line 1541
    .line 1542
    const/16 v20, 0x0

    .line 1543
    .line 1544
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v17

    .line 1548
    :cond_55
    move-object/from16 v20, v17

    .line 1549
    .line 1550
    new-instance v21, La/rqm;

    .line 1551
    .line 1552
    new-instance v1, La/tui0;

    .line 1553
    .line 1554
    iget-object v3, v0, La/w95;->c:Ljava/lang/String;

    .line 1555
    .line 1556
    invoke-direct {v1, v3, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1557
    .line 1558
    .line 1559
    new-instance v3, La/nvi0;

    .line 1560
    .line 1561
    iget-boolean v4, v0, La/w95;->e:Z

    .line 1562
    .line 1563
    invoke-direct {v3, v4}, La/nvi0;-><init>(Z)V

    .line 1564
    .line 1565
    .line 1566
    iget-object v4, v0, La/w95;->d:La/wui0;

    .line 1567
    .line 1568
    const/16 v29, 0x0

    .line 1569
    .line 1570
    const/16 v30, 0x1ba

    .line 1571
    .line 1572
    const/16 v23, 0x0

    .line 1573
    .line 1574
    const/16 v25, 0x0

    .line 1575
    .line 1576
    const/16 v26, 0x0

    .line 1577
    .line 1578
    const/16 v28, 0x0

    .line 1579
    .line 1580
    move-object/from16 v22, v1

    .line 1581
    .line 1582
    move-object/from16 v24, v3

    .line 1583
    .line 1584
    move-object/from16 v27, v4

    .line 1585
    .line 1586
    invoke-direct/range {v21 .. v30}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v1

    .line 1593
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    or-int/2addr v1, v3

    .line 1598
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v3

    .line 1602
    if-nez v1, :cond_56

    .line 1603
    .line 1604
    if-ne v3, v9, :cond_57

    .line 1605
    .line 1606
    :cond_56
    new-instance v3, La/eqz;

    .line 1607
    .line 1608
    invoke-direct {v3, v8, v0, v14}, La/eqz;-><init>(Lkotlin/jvm/functions/Function1;La/w95;B)V

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1612
    .line 1613
    .line 1614
    :cond_57
    move-object/from16 v24, v3

    .line 1615
    .line 1616
    check-cast v24, Lkotlin/jvm/functions/Function0;

    .line 1617
    .line 1618
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v1

    .line 1622
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1623
    .line 1624
    .line 1625
    move-result v3

    .line 1626
    or-int/2addr v1, v3

    .line 1627
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v3

    .line 1631
    if-nez v1, :cond_58

    .line 1632
    .line 1633
    if-ne v3, v9, :cond_59

    .line 1634
    .line 1635
    :cond_58
    new-instance v3, La/eqz;

    .line 1636
    .line 1637
    invoke-direct {v3, v8, v0, v5}, La/eqz;-><init>(Lkotlin/jvm/functions/Function1;La/w95;B)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1641
    .line 1642
    .line 1643
    :cond_59
    move-object/from16 v26, v3

    .line 1644
    .line 1645
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 1646
    .line 1647
    const/16 v29, 0x180

    .line 1648
    .line 1649
    const/16 v30, 0xa8

    .line 1650
    .line 1651
    const/16 v22, 0x0

    .line 1652
    .line 1653
    const/16 v23, 0x0

    .line 1654
    .line 1655
    const/16 v25, 0x0

    .line 1656
    .line 1657
    const/16 v27, 0x0

    .line 1658
    .line 1659
    move-object/from16 v28, v2

    .line 1660
    .line 1661
    invoke-static/range {v20 .. v30}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1662
    .line 1663
    .line 1664
    move-object/from16 v0, v28

    .line 1665
    .line 1666
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 1667
    .line 1668
    .line 1669
    goto :goto_34

    .line 1670
    :cond_5a
    move-object v0, v2

    .line 1671
    invoke-virtual {v0}, La/fet;->X()V

    .line 1672
    .line 1673
    .line 1674
    :goto_34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1675
    .line 1676
    return-object v0

    .line 1677
    :pswitch_a
    move-object/from16 v0, p1

    .line 1678
    .line 1679
    check-cast v0, La/g9z;

    .line 1680
    .line 1681
    move-object/from16 v1, p2

    .line 1682
    .line 1683
    check-cast v1, Ljava/lang/Number;

    .line 1684
    .line 1685
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1686
    .line 1687
    .line 1688
    move-result v1

    .line 1689
    move-object/from16 v2, p3

    .line 1690
    .line 1691
    check-cast v2, La/fet;

    .line 1692
    .line 1693
    move-object/from16 v3, p4

    .line 1694
    .line 1695
    check-cast v3, Ljava/lang/Number;

    .line 1696
    .line 1697
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1698
    .line 1699
    .line 1700
    move-result v3

    .line 1701
    and-int/lit8 v4, v3, 0x6

    .line 1702
    .line 1703
    if-nez v4, :cond_5c

    .line 1704
    .line 1705
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    if-eqz v0, :cond_5b

    .line 1710
    .line 1711
    goto :goto_35

    .line 1712
    :cond_5b
    const/16 v17, 0x2

    .line 1713
    .line 1714
    :goto_35
    or-int v0, v3, v17

    .line 1715
    .line 1716
    goto :goto_36

    .line 1717
    :cond_5c
    move v0, v3

    .line 1718
    :goto_36
    and-int/lit8 v3, v3, 0x30

    .line 1719
    .line 1720
    if-nez v3, :cond_5e

    .line 1721
    .line 1722
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v3

    .line 1726
    if-eqz v3, :cond_5d

    .line 1727
    .line 1728
    goto :goto_37

    .line 1729
    :cond_5d
    const/16 v15, 0x10

    .line 1730
    .line 1731
    :goto_37
    or-int/2addr v0, v15

    .line 1732
    :cond_5e
    and-int/lit16 v3, v0, 0x93

    .line 1733
    .line 1734
    if-eq v3, v13, :cond_5f

    .line 1735
    .line 1736
    move v3, v5

    .line 1737
    goto :goto_38

    .line 1738
    :cond_5f
    move v3, v14

    .line 1739
    :goto_38
    and-int/2addr v0, v5

    .line 1740
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v0

    .line 1744
    if-eqz v0, :cond_65

    .line 1745
    .line 1746
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    check-cast v0, La/v95;

    .line 1751
    .line 1752
    const v3, 0x2afe4a23

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 1756
    .line 1757
    .line 1758
    check-cast v11, La/ppz;

    .line 1759
    .line 1760
    iget-object v3, v11, La/ppz;->a:La/a4x;

    .line 1761
    .line 1762
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1763
    .line 1764
    .line 1765
    move-result v3

    .line 1766
    sub-int/2addr v3, v5

    .line 1767
    sget-object v17, La/jm40;->b:La/jm40;

    .line 1768
    .line 1769
    if-ne v1, v3, :cond_60

    .line 1770
    .line 1771
    check-cast v10, La/hh80;

    .line 1772
    .line 1773
    invoke-interface {v10}, La/hh80;->a()F

    .line 1774
    .line 1775
    .line 1776
    move-result v1

    .line 1777
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1778
    .line 1779
    add-float v21, v1, v16

    .line 1780
    .line 1781
    const/16 v22, 0x7

    .line 1782
    .line 1783
    const/16 v18, 0x0

    .line 1784
    .line 1785
    const/16 v19, 0x0

    .line 1786
    .line 1787
    const/16 v20, 0x0

    .line 1788
    .line 1789
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v17

    .line 1793
    :cond_60
    move-object/from16 v20, v17

    .line 1794
    .line 1795
    new-instance v21, La/rqm;

    .line 1796
    .line 1797
    new-instance v1, La/tui0;

    .line 1798
    .line 1799
    iget-object v3, v0, La/v95;->c:Ljava/lang/String;

    .line 1800
    .line 1801
    invoke-direct {v1, v3, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1802
    .line 1803
    .line 1804
    new-instance v3, La/nvi0;

    .line 1805
    .line 1806
    iget-boolean v4, v0, La/v95;->e:Z

    .line 1807
    .line 1808
    invoke-direct {v3, v4}, La/nvi0;-><init>(Z)V

    .line 1809
    .line 1810
    .line 1811
    iget-object v4, v0, La/v95;->d:La/wui0;

    .line 1812
    .line 1813
    const/16 v29, 0x0

    .line 1814
    .line 1815
    const/16 v30, 0x1ba

    .line 1816
    .line 1817
    const/16 v23, 0x0

    .line 1818
    .line 1819
    const/16 v25, 0x0

    .line 1820
    .line 1821
    const/16 v26, 0x0

    .line 1822
    .line 1823
    const/16 v28, 0x0

    .line 1824
    .line 1825
    move-object/from16 v22, v1

    .line 1826
    .line 1827
    move-object/from16 v24, v3

    .line 1828
    .line 1829
    move-object/from16 v27, v4

    .line 1830
    .line 1831
    invoke-direct/range {v21 .. v30}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1835
    .line 1836
    .line 1837
    move-result v1

    .line 1838
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v3

    .line 1842
    or-int/2addr v1, v3

    .line 1843
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v3

    .line 1847
    if-nez v1, :cond_61

    .line 1848
    .line 1849
    if-ne v3, v9, :cond_62

    .line 1850
    .line 1851
    :cond_61
    new-instance v3, La/jpz;

    .line 1852
    .line 1853
    invoke-direct {v3, v8, v0, v14}, La/jpz;-><init>(Lkotlin/jvm/functions/Function1;La/v95;B)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1857
    .line 1858
    .line 1859
    :cond_62
    move-object/from16 v24, v3

    .line 1860
    .line 1861
    check-cast v24, Lkotlin/jvm/functions/Function0;

    .line 1862
    .line 1863
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1864
    .line 1865
    .line 1866
    move-result v1

    .line 1867
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1868
    .line 1869
    .line 1870
    move-result v3

    .line 1871
    or-int/2addr v1, v3

    .line 1872
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v3

    .line 1876
    if-nez v1, :cond_63

    .line 1877
    .line 1878
    if-ne v3, v9, :cond_64

    .line 1879
    .line 1880
    :cond_63
    new-instance v3, La/jpz;

    .line 1881
    .line 1882
    invoke-direct {v3, v8, v0, v5}, La/jpz;-><init>(Lkotlin/jvm/functions/Function1;La/v95;B)V

    .line 1883
    .line 1884
    .line 1885
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1886
    .line 1887
    .line 1888
    :cond_64
    move-object/from16 v26, v3

    .line 1889
    .line 1890
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 1891
    .line 1892
    const/16 v29, 0x180

    .line 1893
    .line 1894
    const/16 v30, 0xa8

    .line 1895
    .line 1896
    const/16 v22, 0x0

    .line 1897
    .line 1898
    const/16 v23, 0x0

    .line 1899
    .line 1900
    const/16 v25, 0x0

    .line 1901
    .line 1902
    const/16 v27, 0x0

    .line 1903
    .line 1904
    move-object/from16 v28, v2

    .line 1905
    .line 1906
    invoke-static/range {v20 .. v30}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1907
    .line 1908
    .line 1909
    move-object/from16 v0, v28

    .line 1910
    .line 1911
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 1912
    .line 1913
    .line 1914
    goto :goto_39

    .line 1915
    :cond_65
    move-object v0, v2

    .line 1916
    invoke-virtual {v0}, La/fet;->X()V

    .line 1917
    .line 1918
    .line 1919
    :goto_39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1920
    .line 1921
    return-object v0

    .line 1922
    :pswitch_b
    move-object/from16 v0, p1

    .line 1923
    .line 1924
    check-cast v0, La/g9z;

    .line 1925
    .line 1926
    move-object/from16 v1, p2

    .line 1927
    .line 1928
    check-cast v1, Ljava/lang/Number;

    .line 1929
    .line 1930
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1931
    .line 1932
    .line 1933
    move-result v1

    .line 1934
    move-object/from16 v2, p3

    .line 1935
    .line 1936
    check-cast v2, La/fet;

    .line 1937
    .line 1938
    move-object/from16 v3, p4

    .line 1939
    .line 1940
    check-cast v3, Ljava/lang/Number;

    .line 1941
    .line 1942
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1943
    .line 1944
    .line 1945
    move-result v3

    .line 1946
    and-int/lit8 v4, v3, 0x6

    .line 1947
    .line 1948
    if-nez v4, :cond_67

    .line 1949
    .line 1950
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1951
    .line 1952
    .line 1953
    move-result v0

    .line 1954
    if-eqz v0, :cond_66

    .line 1955
    .line 1956
    goto :goto_3a

    .line 1957
    :cond_66
    const/16 v17, 0x2

    .line 1958
    .line 1959
    :goto_3a
    or-int v0, v3, v17

    .line 1960
    .line 1961
    goto :goto_3b

    .line 1962
    :cond_67
    move v0, v3

    .line 1963
    :goto_3b
    and-int/lit8 v3, v3, 0x30

    .line 1964
    .line 1965
    if-nez v3, :cond_69

    .line 1966
    .line 1967
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1968
    .line 1969
    .line 1970
    move-result v3

    .line 1971
    if-eqz v3, :cond_68

    .line 1972
    .line 1973
    goto :goto_3c

    .line 1974
    :cond_68
    const/16 v15, 0x10

    .line 1975
    .line 1976
    :goto_3c
    or-int/2addr v0, v15

    .line 1977
    :cond_69
    and-int/lit16 v3, v0, 0x93

    .line 1978
    .line 1979
    if-eq v3, v13, :cond_6a

    .line 1980
    .line 1981
    move v3, v5

    .line 1982
    goto :goto_3d

    .line 1983
    :cond_6a
    move v3, v14

    .line 1984
    :goto_3d
    and-int/2addr v0, v5

    .line 1985
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 1986
    .line 1987
    .line 1988
    move-result v0

    .line 1989
    if-eqz v0, :cond_70

    .line 1990
    .line 1991
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v0

    .line 1995
    check-cast v0, La/y95;

    .line 1996
    .line 1997
    const v3, 0xe398cc9

    .line 1998
    .line 1999
    .line 2000
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 2001
    .line 2002
    .line 2003
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v3

    .line 2007
    iget v3, v3, La/wfn;->d:F

    .line 2008
    .line 2009
    sget-object v4, La/jm40;->b:La/jm40;

    .line 2010
    .line 2011
    const/4 v12, 0x2

    .line 2012
    invoke-static {v4, v3, v6, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v3

    .line 2016
    check-cast v11, La/voz;

    .line 2017
    .line 2018
    iget-object v6, v11, La/voz;->a:La/a4x;

    .line 2019
    .line 2020
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2021
    .line 2022
    .line 2023
    move-result v6

    .line 2024
    sub-int/2addr v6, v5

    .line 2025
    if-ne v1, v6, :cond_6b

    .line 2026
    .line 2027
    check-cast v10, La/hh80;

    .line 2028
    .line 2029
    invoke-interface {v10}, La/hh80;->a()F

    .line 2030
    .line 2031
    .line 2032
    move-result v1

    .line 2033
    sget-object v6, La/qmk;->a:La/zcl;

    .line 2034
    .line 2035
    add-float v24, v1, v16

    .line 2036
    .line 2037
    const/16 v25, 0x7

    .line 2038
    .line 2039
    const/16 v21, 0x0

    .line 2040
    .line 2041
    const/16 v22, 0x0

    .line 2042
    .line 2043
    const/16 v23, 0x0

    .line 2044
    .line 2045
    move-object/from16 v20, v4

    .line 2046
    .line 2047
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v4

    .line 2051
    goto :goto_3e

    .line 2052
    :cond_6b
    move-object/from16 v20, v4

    .line 2053
    .line 2054
    :goto_3e
    invoke-interface {v3, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v20

    .line 2058
    new-instance v21, La/rqm;

    .line 2059
    .line 2060
    new-instance v1, La/tui0;

    .line 2061
    .line 2062
    iget-object v3, v0, La/y95;->c:Ljava/lang/String;

    .line 2063
    .line 2064
    invoke-direct {v1, v3, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 2065
    .line 2066
    .line 2067
    new-instance v3, La/nvi0;

    .line 2068
    .line 2069
    iget-boolean v4, v0, La/y95;->e:Z

    .line 2070
    .line 2071
    invoke-direct {v3, v4}, La/nvi0;-><init>(Z)V

    .line 2072
    .line 2073
    .line 2074
    iget-object v4, v0, La/y95;->d:La/wui0;

    .line 2075
    .line 2076
    const/16 v29, 0x0

    .line 2077
    .line 2078
    const/16 v30, 0x1ba

    .line 2079
    .line 2080
    const/16 v23, 0x0

    .line 2081
    .line 2082
    const/16 v25, 0x0

    .line 2083
    .line 2084
    const/16 v26, 0x0

    .line 2085
    .line 2086
    const/16 v28, 0x0

    .line 2087
    .line 2088
    move-object/from16 v22, v1

    .line 2089
    .line 2090
    move-object/from16 v24, v3

    .line 2091
    .line 2092
    move-object/from16 v27, v4

    .line 2093
    .line 2094
    invoke-direct/range {v21 .. v30}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2098
    .line 2099
    .line 2100
    move-result v1

    .line 2101
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2102
    .line 2103
    .line 2104
    move-result v3

    .line 2105
    or-int/2addr v1, v3

    .line 2106
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v3

    .line 2110
    if-nez v1, :cond_6c

    .line 2111
    .line 2112
    if-ne v3, v9, :cond_6d

    .line 2113
    .line 2114
    :cond_6c
    new-instance v3, La/toz;

    .line 2115
    .line 2116
    invoke-direct {v3, v8, v0, v14}, La/toz;-><init>(Lkotlin/jvm/functions/Function1;La/y95;B)V

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2120
    .line 2121
    .line 2122
    :cond_6d
    move-object/from16 v24, v3

    .line 2123
    .line 2124
    check-cast v24, Lkotlin/jvm/functions/Function0;

    .line 2125
    .line 2126
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2127
    .line 2128
    .line 2129
    move-result v1

    .line 2130
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v3

    .line 2134
    or-int/2addr v1, v3

    .line 2135
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v3

    .line 2139
    if-nez v1, :cond_6e

    .line 2140
    .line 2141
    if-ne v3, v9, :cond_6f

    .line 2142
    .line 2143
    :cond_6e
    new-instance v3, La/toz;

    .line 2144
    .line 2145
    invoke-direct {v3, v8, v0, v5}, La/toz;-><init>(Lkotlin/jvm/functions/Function1;La/y95;B)V

    .line 2146
    .line 2147
    .line 2148
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2149
    .line 2150
    .line 2151
    :cond_6f
    move-object/from16 v26, v3

    .line 2152
    .line 2153
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 2154
    .line 2155
    const/16 v29, 0x180

    .line 2156
    .line 2157
    const/16 v30, 0xa8

    .line 2158
    .line 2159
    const/16 v22, 0x0

    .line 2160
    .line 2161
    const/16 v23, 0x0

    .line 2162
    .line 2163
    const/16 v25, 0x0

    .line 2164
    .line 2165
    const/16 v27, 0x0

    .line 2166
    .line 2167
    move-object/from16 v28, v2

    .line 2168
    .line 2169
    invoke-static/range {v20 .. v30}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2170
    .line 2171
    .line 2172
    move-object/from16 v0, v28

    .line 2173
    .line 2174
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2175
    .line 2176
    .line 2177
    goto :goto_3f

    .line 2178
    :cond_70
    move-object v0, v2

    .line 2179
    invoke-virtual {v0}, La/fet;->X()V

    .line 2180
    .line 2181
    .line 2182
    :goto_3f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2183
    .line 2184
    return-object v0

    .line 2185
    :pswitch_c
    move-object/from16 v0, p1

    .line 2186
    .line 2187
    check-cast v0, La/g9z;

    .line 2188
    .line 2189
    move-object/from16 v1, p2

    .line 2190
    .line 2191
    check-cast v1, Ljava/lang/Number;

    .line 2192
    .line 2193
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2194
    .line 2195
    .line 2196
    move-result v1

    .line 2197
    move-object/from16 v2, p3

    .line 2198
    .line 2199
    check-cast v2, La/fet;

    .line 2200
    .line 2201
    move-object/from16 v7, p4

    .line 2202
    .line 2203
    check-cast v7, Ljava/lang/Number;

    .line 2204
    .line 2205
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 2206
    .line 2207
    .line 2208
    move-result v7

    .line 2209
    and-int/lit8 v16, v7, 0x6

    .line 2210
    .line 2211
    if-nez v16, :cond_72

    .line 2212
    .line 2213
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2214
    .line 2215
    .line 2216
    move-result v0

    .line 2217
    if-eqz v0, :cond_71

    .line 2218
    .line 2219
    goto :goto_40

    .line 2220
    :cond_71
    const/16 v17, 0x2

    .line 2221
    .line 2222
    :goto_40
    or-int v0, v7, v17

    .line 2223
    .line 2224
    goto :goto_41

    .line 2225
    :cond_72
    move v0, v7

    .line 2226
    :goto_41
    and-int/lit8 v7, v7, 0x30

    .line 2227
    .line 2228
    if-nez v7, :cond_74

    .line 2229
    .line 2230
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 2231
    .line 2232
    .line 2233
    move-result v7

    .line 2234
    if-eqz v7, :cond_73

    .line 2235
    .line 2236
    goto :goto_42

    .line 2237
    :cond_73
    const/16 v15, 0x10

    .line 2238
    .line 2239
    :goto_42
    or-int/2addr v0, v15

    .line 2240
    :cond_74
    and-int/lit16 v7, v0, 0x93

    .line 2241
    .line 2242
    if-eq v7, v13, :cond_75

    .line 2243
    .line 2244
    move v7, v5

    .line 2245
    goto :goto_43

    .line 2246
    :cond_75
    move v7, v14

    .line 2247
    :goto_43
    and-int/2addr v0, v5

    .line 2248
    invoke-virtual {v2, v0, v7}, La/fet;->U(IZ)Z

    .line 2249
    .line 2250
    .line 2251
    move-result v0

    .line 2252
    if-eqz v0, :cond_79

    .line 2253
    .line 2254
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v0

    .line 2258
    check-cast v0, La/ejg;

    .line 2259
    .line 2260
    const v7, 0x3a6e684

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v2, v7}, La/fet;->e0(I)V

    .line 2264
    .line 2265
    .line 2266
    check-cast v11, La/djg;

    .line 2267
    .line 2268
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2269
    .line 2270
    .line 2271
    move-result v7

    .line 2272
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2273
    .line 2274
    .line 2275
    move-result v12

    .line 2276
    or-int/2addr v7, v12

    .line 2277
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v12

    .line 2281
    if-nez v7, :cond_76

    .line 2282
    .line 2283
    if-ne v12, v9, :cond_77

    .line 2284
    .line 2285
    :cond_76
    new-instance v12, La/lhf;

    .line 2286
    .line 2287
    const/4 v7, 0x5

    .line 2288
    invoke-direct {v12, v8, v0, v7}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual {v2, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2292
    .line 2293
    .line 2294
    :cond_77
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 2295
    .line 2296
    sget-object v7, La/iw5;->j2:[La/iiy;

    .line 2297
    .line 2298
    sget-object v7, La/djg;->n2:La/kwd;

    .line 2299
    .line 2300
    const/16 v7, 0x200

    .line 2301
    .line 2302
    invoke-virtual {v11, v0, v12, v2, v7}, La/djg;->P0(La/ejg;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 2303
    .line 2304
    .line 2305
    check-cast v10, La/a4x;

    .line 2306
    .line 2307
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 2308
    .line 2309
    .line 2310
    move-result v0

    .line 2311
    sub-int/2addr v0, v5

    .line 2312
    if-ge v1, v0, :cond_78

    .line 2313
    .line 2314
    const v0, 0x3a8e69e

    .line 2315
    .line 2316
    .line 2317
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 2318
    .line 2319
    .line 2320
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v0

    .line 2324
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2325
    .line 2326
    const/high16 v1, 0x41400000    # 12.0f

    .line 2327
    .line 2328
    const/4 v4, 0x2

    .line 2329
    invoke-static {v0, v1, v6, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v21

    .line 2333
    const/16 v24, 0x6

    .line 2334
    .line 2335
    const/16 v25, 0x4

    .line 2336
    .line 2337
    sget-object v20, La/zfi0;->a:La/zfi0;

    .line 2338
    .line 2339
    const/16 v22, 0x0

    .line 2340
    .line 2341
    move-object/from16 v23, v2

    .line 2342
    .line 2343
    invoke-static/range {v20 .. v25}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 2344
    .line 2345
    .line 2346
    move-object/from16 v0, v23

    .line 2347
    .line 2348
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2349
    .line 2350
    .line 2351
    goto :goto_44

    .line 2352
    :cond_78
    move-object v0, v2

    .line 2353
    const v1, 0x3acf4e0

    .line 2354
    .line 2355
    .line 2356
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2360
    .line 2361
    .line 2362
    :goto_44
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2363
    .line 2364
    .line 2365
    goto :goto_45

    .line 2366
    :cond_79
    move-object v0, v2

    .line 2367
    invoke-virtual {v0}, La/fet;->X()V

    .line 2368
    .line 2369
    .line 2370
    :goto_45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2371
    .line 2372
    return-object v0

    .line 2373
    :pswitch_d
    const/4 v4, 0x2

    .line 2374
    move-object/from16 v0, p1

    .line 2375
    .line 2376
    check-cast v0, La/g9z;

    .line 2377
    .line 2378
    move-object/from16 v1, p2

    .line 2379
    .line 2380
    check-cast v1, Ljava/lang/Number;

    .line 2381
    .line 2382
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2383
    .line 2384
    .line 2385
    move-result v1

    .line 2386
    move-object/from16 v2, p3

    .line 2387
    .line 2388
    check-cast v2, La/fet;

    .line 2389
    .line 2390
    move-object/from16 v3, p4

    .line 2391
    .line 2392
    check-cast v3, Ljava/lang/Number;

    .line 2393
    .line 2394
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2395
    .line 2396
    .line 2397
    move-result v3

    .line 2398
    check-cast v11, La/xhc;

    .line 2399
    .line 2400
    check-cast v10, La/wpq;

    .line 2401
    .line 2402
    and-int/lit8 v6, v3, 0x6

    .line 2403
    .line 2404
    if-nez v6, :cond_7b

    .line 2405
    .line 2406
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2407
    .line 2408
    .line 2409
    move-result v0

    .line 2410
    if-eqz v0, :cond_7a

    .line 2411
    .line 2412
    goto :goto_46

    .line 2413
    :cond_7a
    move/from16 v17, v4

    .line 2414
    .line 2415
    :goto_46
    or-int v0, v3, v17

    .line 2416
    .line 2417
    goto :goto_47

    .line 2418
    :cond_7b
    move v0, v3

    .line 2419
    :goto_47
    and-int/lit8 v3, v3, 0x30

    .line 2420
    .line 2421
    if-nez v3, :cond_7d

    .line 2422
    .line 2423
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 2424
    .line 2425
    .line 2426
    move-result v3

    .line 2427
    if-eqz v3, :cond_7c

    .line 2428
    .line 2429
    goto :goto_48

    .line 2430
    :cond_7c
    const/16 v15, 0x10

    .line 2431
    .line 2432
    :goto_48
    or-int/2addr v0, v15

    .line 2433
    :cond_7d
    and-int/lit16 v3, v0, 0x93

    .line 2434
    .line 2435
    if-eq v3, v13, :cond_7e

    .line 2436
    .line 2437
    move v3, v5

    .line 2438
    goto :goto_49

    .line 2439
    :cond_7e
    move v3, v14

    .line 2440
    :goto_49
    and-int/2addr v0, v5

    .line 2441
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 2442
    .line 2443
    .line 2444
    move-result v0

    .line 2445
    if-eqz v0, :cond_85

    .line 2446
    .line 2447
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2448
    .line 2449
    .line 2450
    move-result-object v0

    .line 2451
    check-cast v0, La/u95;

    .line 2452
    .line 2453
    const v3, 0x51086a86

    .line 2454
    .line 2455
    .line 2456
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 2457
    .line 2458
    .line 2459
    new-instance v15, La/rqm;

    .line 2460
    .line 2461
    new-instance v3, La/tui0;

    .line 2462
    .line 2463
    iget-wide v12, v0, La/u95;->a:J

    .line 2464
    .line 2465
    iget-object v4, v11, La/xhc;->c:Ljava/lang/String;

    .line 2466
    .line 2467
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2468
    .line 2469
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 2470
    .line 2471
    .line 2472
    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2473
    .line 2474
    .line 2475
    const-string v12, " "

    .line 2476
    .line 2477
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2478
    .line 2479
    .line 2480
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2481
    .line 2482
    .line 2483
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v4

    .line 2487
    invoke-direct {v3, v4, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 2488
    .line 2489
    .line 2490
    new-instance v4, La/nvi0;

    .line 2491
    .line 2492
    iget-boolean v6, v0, La/u95;->b:Z

    .line 2493
    .line 2494
    invoke-direct {v4, v6}, La/nvi0;-><init>(Z)V

    .line 2495
    .line 2496
    .line 2497
    iget-object v6, v11, La/xhc;->a:La/a4x;

    .line 2498
    .line 2499
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2500
    .line 2501
    .line 2502
    move-result v6

    .line 2503
    sub-int/2addr v6, v5

    .line 2504
    if-ne v1, v6, :cond_7f

    .line 2505
    .line 2506
    sget-object v1, La/wui0;->d:La/wui0;

    .line 2507
    .line 2508
    :goto_4a
    move-object/from16 v21, v1

    .line 2509
    .line 2510
    goto :goto_4b

    .line 2511
    :cond_7f
    if-nez v1, :cond_80

    .line 2512
    .line 2513
    sget-object v1, La/wui0;->b:La/wui0;

    .line 2514
    .line 2515
    goto :goto_4a

    .line 2516
    :cond_80
    sget-object v1, La/wui0;->c:La/wui0;

    .line 2517
    .line 2518
    goto :goto_4a

    .line 2519
    :goto_4b
    const/16 v23, 0x0

    .line 2520
    .line 2521
    const/16 v24, 0x1ba

    .line 2522
    .line 2523
    const/16 v17, 0x0

    .line 2524
    .line 2525
    const/16 v19, 0x0

    .line 2526
    .line 2527
    const/16 v20, 0x0

    .line 2528
    .line 2529
    const/16 v22, 0x0

    .line 2530
    .line 2531
    move-object/from16 v16, v3

    .line 2532
    .line 2533
    move-object/from16 v18, v4

    .line 2534
    .line 2535
    invoke-direct/range {v15 .. v24}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 2536
    .line 2537
    .line 2538
    invoke-virtual {v2, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2539
    .line 2540
    .line 2541
    move-result v1

    .line 2542
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2543
    .line 2544
    .line 2545
    move-result v3

    .line 2546
    or-int/2addr v1, v3

    .line 2547
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2548
    .line 2549
    .line 2550
    move-result v3

    .line 2551
    or-int/2addr v1, v3

    .line 2552
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v3

    .line 2556
    if-nez v1, :cond_81

    .line 2557
    .line 2558
    if-ne v3, v9, :cond_82

    .line 2559
    .line 2560
    :cond_81
    new-instance v3, La/rhc;

    .line 2561
    .line 2562
    invoke-direct {v3, v10, v8, v0, v14}, La/rhc;-><init>(La/wpq;Lkotlin/jvm/functions/Function1;La/u95;B)V

    .line 2563
    .line 2564
    .line 2565
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2566
    .line 2567
    .line 2568
    :cond_82
    move-object/from16 v23, v3

    .line 2569
    .line 2570
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 2571
    .line 2572
    invoke-virtual {v2, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2573
    .line 2574
    .line 2575
    move-result v1

    .line 2576
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2577
    .line 2578
    .line 2579
    move-result v3

    .line 2580
    or-int/2addr v1, v3

    .line 2581
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2582
    .line 2583
    .line 2584
    move-result v3

    .line 2585
    or-int/2addr v1, v3

    .line 2586
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v3

    .line 2590
    if-nez v1, :cond_83

    .line 2591
    .line 2592
    if-ne v3, v9, :cond_84

    .line 2593
    .line 2594
    :cond_83
    new-instance v3, La/rhc;

    .line 2595
    .line 2596
    invoke-direct {v3, v10, v8, v0, v5}, La/rhc;-><init>(La/wpq;Lkotlin/jvm/functions/Function1;La/u95;B)V

    .line 2597
    .line 2598
    .line 2599
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2600
    .line 2601
    .line 2602
    :cond_84
    move-object/from16 v25, v3

    .line 2603
    .line 2604
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 2605
    .line 2606
    const/16 v28, 0x180

    .line 2607
    .line 2608
    const/16 v29, 0xa9

    .line 2609
    .line 2610
    const/16 v19, 0x0

    .line 2611
    .line 2612
    const/16 v21, 0x1

    .line 2613
    .line 2614
    const/16 v22, 0x0

    .line 2615
    .line 2616
    const/16 v24, 0x0

    .line 2617
    .line 2618
    const/16 v26, 0x0

    .line 2619
    .line 2620
    move-object/from16 v27, v2

    .line 2621
    .line 2622
    move-object/from16 v20, v15

    .line 2623
    .line 2624
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2625
    .line 2626
    .line 2627
    move-object/from16 v0, v27

    .line 2628
    .line 2629
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2630
    .line 2631
    .line 2632
    goto :goto_4c

    .line 2633
    :cond_85
    move-object v0, v2

    .line 2634
    invoke-virtual {v0}, La/fet;->X()V

    .line 2635
    .line 2636
    .line 2637
    :goto_4c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2638
    .line 2639
    return-object v0

    .line 2640
    :pswitch_e
    const/4 v4, 0x2

    .line 2641
    move-object/from16 v1, p1

    .line 2642
    .line 2643
    check-cast v1, La/g9z;

    .line 2644
    .line 2645
    move-object/from16 v2, p2

    .line 2646
    .line 2647
    check-cast v2, Ljava/lang/Number;

    .line 2648
    .line 2649
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2650
    .line 2651
    .line 2652
    move-result v2

    .line 2653
    move-object/from16 v3, p3

    .line 2654
    .line 2655
    check-cast v3, La/fet;

    .line 2656
    .line 2657
    move-object/from16 v6, p4

    .line 2658
    .line 2659
    check-cast v6, Ljava/lang/Number;

    .line 2660
    .line 2661
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2662
    .line 2663
    .line 2664
    move-result v6

    .line 2665
    and-int/lit8 v7, v6, 0x6

    .line 2666
    .line 2667
    if-nez v7, :cond_87

    .line 2668
    .line 2669
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2670
    .line 2671
    .line 2672
    move-result v1

    .line 2673
    if-eqz v1, :cond_86

    .line 2674
    .line 2675
    goto :goto_4d

    .line 2676
    :cond_86
    move/from16 v17, v4

    .line 2677
    .line 2678
    :goto_4d
    or-int v1, v6, v17

    .line 2679
    .line 2680
    goto :goto_4e

    .line 2681
    :cond_87
    move v1, v6

    .line 2682
    :goto_4e
    and-int/lit8 v4, v6, 0x30

    .line 2683
    .line 2684
    if-nez v4, :cond_89

    .line 2685
    .line 2686
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 2687
    .line 2688
    .line 2689
    move-result v4

    .line 2690
    if-eqz v4, :cond_88

    .line 2691
    .line 2692
    goto :goto_4f

    .line 2693
    :cond_88
    const/16 v15, 0x10

    .line 2694
    .line 2695
    :goto_4f
    or-int/2addr v1, v15

    .line 2696
    :cond_89
    and-int/lit16 v4, v1, 0x93

    .line 2697
    .line 2698
    if-eq v4, v13, :cond_8a

    .line 2699
    .line 2700
    move v4, v5

    .line 2701
    goto :goto_50

    .line 2702
    :cond_8a
    move v4, v14

    .line 2703
    :goto_50
    and-int/2addr v1, v5

    .line 2704
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 2705
    .line 2706
    .line 2707
    move-result v1

    .line 2708
    if-eqz v1, :cond_8e

    .line 2709
    .line 2710
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v1

    .line 2714
    check-cast v1, La/p6t0;

    .line 2715
    .line 2716
    const v2, 0x520f3865

    .line 2717
    .line 2718
    .line 2719
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 2720
    .line 2721
    .line 2722
    if-nez v1, :cond_8c

    .line 2723
    .line 2724
    :cond_8b
    move-object v0, v3

    .line 2725
    goto :goto_51

    .line 2726
    :cond_8c
    instance-of v2, v1, La/iq4;

    .line 2727
    .line 2728
    sget-object v4, La/jm40;->b:La/jm40;

    .line 2729
    .line 2730
    if-eqz v2, :cond_8d

    .line 2731
    .line 2732
    const v0, 0x520fe477

    .line 2733
    .line 2734
    .line 2735
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 2736
    .line 2737
    .line 2738
    check-cast v1, La/iq4;

    .line 2739
    .line 2740
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2741
    .line 2742
    const/high16 v8, 0x40c00000    # 6.0f

    .line 2743
    .line 2744
    const/4 v9, 0x7

    .line 2745
    const/4 v5, 0x0

    .line 2746
    const/4 v6, 0x0

    .line 2747
    const/4 v7, 0x0

    .line 2748
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v0

    .line 2752
    invoke-static {v1, v0, v3, v14}, La/bsr0;->d(La/iq4;La/mm40;La/fet;I)V

    .line 2753
    .line 2754
    .line 2755
    invoke-virtual {v3, v14}, La/fet;->r(Z)V

    .line 2756
    .line 2757
    .line 2758
    move-object v0, v3

    .line 2759
    goto :goto_52

    .line 2760
    :cond_8d
    instance-of v2, v1, La/xo4;

    .line 2761
    .line 2762
    if-eqz v2, :cond_8b

    .line 2763
    .line 2764
    const v2, 0x5214874e

    .line 2765
    .line 2766
    .line 2767
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 2768
    .line 2769
    .line 2770
    move-object/from16 v19, v1

    .line 2771
    .line 2772
    check-cast v19, La/xo4;

    .line 2773
    .line 2774
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2775
    .line 2776
    const/high16 v8, 0x41400000    # 12.0f

    .line 2777
    .line 2778
    const/4 v9, 0x7

    .line 2779
    const/4 v5, 0x0

    .line 2780
    const/4 v6, 0x0

    .line 2781
    const/4 v7, 0x0

    .line 2782
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v23

    .line 2786
    move-object/from16 v21, v11

    .line 2787
    .line 2788
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 2789
    .line 2790
    move-object/from16 v22, v10

    .line 2791
    .line 2792
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 2793
    .line 2794
    const/16 v25, 0x0

    .line 2795
    .line 2796
    iget-object v0, v0, La/gq4;->c:Lkotlin/jvm/functions/Function1;

    .line 2797
    .line 2798
    move-object/from16 v20, v0

    .line 2799
    .line 2800
    move-object/from16 v24, v3

    .line 2801
    .line 2802
    invoke-static/range {v19 .. v25}, La/x4d0;->e(La/xo4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/mm40;La/fet;I)V

    .line 2803
    .line 2804
    .line 2805
    move-object/from16 v0, v24

    .line 2806
    .line 2807
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2808
    .line 2809
    .line 2810
    goto :goto_52

    .line 2811
    :goto_51
    const v1, -0x37286b16

    .line 2812
    .line 2813
    .line 2814
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2815
    .line 2816
    .line 2817
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2818
    .line 2819
    .line 2820
    :goto_52
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 2821
    .line 2822
    .line 2823
    goto :goto_53

    .line 2824
    :cond_8e
    move-object v0, v3

    .line 2825
    invoke-virtual {v0}, La/fet;->X()V

    .line 2826
    .line 2827
    .line 2828
    :goto_53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2829
    .line 2830
    return-object v0

    .line 2831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
