.class public final synthetic La/mrj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/hdz;

.field public final synthetic b:La/kie0;

.field public final synthetic c:I

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/hdz;La/kie0;ILkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mrj0;->a:La/hdz;

    iput-object p2, p0, La/mrj0;->b:La/kie0;

    iput p3, p0, La/mrj0;->c:I

    iput-object p4, p0, La/mrj0;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, La/mrj0;->e:Z

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v3, p3

    .line 10
    check-cast v3, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    and-int/lit8 p1, p3, 0x30

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3, p2}, La/fet;->e(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/16 p1, 0x20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 p1, 0x10

    .line 35
    .line 36
    :goto_0
    or-int/2addr p3, p1

    .line 37
    :cond_1
    and-int/lit16 p1, p3, 0x91

    .line 38
    .line 39
    const/16 p4, 0x90

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    const/4 v7, 0x0

    .line 43
    if-eq p1, p4, :cond_2

    .line 44
    .line 45
    move p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move p1, v7

    .line 48
    :goto_1
    and-int/2addr p3, v0

    .line 49
    invoke-virtual {v3, p3, p1}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_11

    .line 54
    .line 55
    iget-object p1, p0, La/mrj0;->a:La/hdz;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, La/hdz;->b(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, La/vk5;

    .line 62
    .line 63
    instance-of p2, p1, La/ogs0;

    .line 64
    .line 65
    iget-object p3, p0, La/mrj0;->d:Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    sget-object p4, La/ukd;->a:La/cl5;

    .line 68
    .line 69
    if-eqz p2, :cond_9

    .line 70
    .line 71
    const p2, 0x4f24ee6c    # 2.7670886E9f

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p2}, La/fet;->e0(I)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, La/mrj0;->b:La/kie0;

    .line 78
    .line 79
    iget v1, p2, La/kie0;->a:I

    .line 80
    .line 81
    const/4 v2, 0x5

    .line 82
    if-ge v1, v2, :cond_8

    .line 83
    .line 84
    const v1, 0x4f25d7c5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 88
    .line 89
    .line 90
    iget v1, p2, La/kie0;->a:I

    .line 91
    .line 92
    add-int/2addr v1, v0

    .line 93
    iput v1, p2, La/kie0;->a:I

    .line 94
    .line 95
    iget p0, p0, La/mrj0;->c:I

    .line 96
    .line 97
    sub-int/2addr p0, v1

    .line 98
    if-eqz p0, :cond_4

    .line 99
    .line 100
    if-ne v1, v2, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    move v0, v7

    .line 104
    :cond_4
    :goto_2
    move-object v1, p1

    .line 105
    check-cast v1, La/ogs0;

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v6, 0x5

    .line 109
    move-object v4, v3

    .line 110
    move v3, v0

    .line 111
    const/4 v0, 0x0

    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-static/range {v0 .. v6}, La/dtb;->a(La/mm40;La/ogs0;ZZLa/fet;II)V

    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_7

    .line 117
    .line 118
    const p0, 0x4f2af9c2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-nez p0, :cond_5

    .line 133
    .line 134
    if-ne p1, p4, :cond_6

    .line 135
    .line 136
    :cond_5
    new-instance p1, La/nrj0;

    .line 137
    .line 138
    invoke-direct {p1, p3, v7}, La/nrj0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 145
    .line 146
    const/4 p0, 0x0

    .line 147
    invoke-static {v7, v4, p0, p1}, La/ucx;->H(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    const p0, 0x4f2e60aa    # 2.9255706E9f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 161
    .line 162
    .line 163
    :goto_3
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    move-object v4, v3

    .line 168
    const p0, 0x4f2ed4ea    # 2.933189E9f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_6

    .line 181
    .line 182
    :cond_9
    move-object v4, v3

    .line 183
    sget-object p2, La/ues0;->a:La/ues0;

    .line 184
    .line 185
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_a

    .line 190
    .line 191
    const p0, -0x795106f9

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 195
    .line 196
    .line 197
    sget-object p0, La/qmk;->a:La/zcl;

    .line 198
    .line 199
    const/high16 p0, 0x41800000    # 16.0f

    .line 200
    .line 201
    invoke-static {p0, v4, v7, v7}, La/egm0;->c(FLa/fet;II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_a
    sget-object p2, La/gxn;->a:La/gxn;

    .line 210
    .line 211
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_f

    .line 216
    .line 217
    const p1, 0x4f32638a    # 2.9928678E9f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, p1}, La/fet;->e0(I)V

    .line 221
    .line 222
    .line 223
    iget-boolean p0, p0, La/mrj0;->e:Z

    .line 224
    .line 225
    if-eqz p0, :cond_e

    .line 226
    .line 227
    const p0, 0x4f33c161

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 231
    .line 232
    .line 233
    sget-object p0, La/jm40;->b:La/jm40;

    .line 234
    .line 235
    const/high16 p1, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-static {p0, p1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    sget-object p1, La/qmk;->a:La/zcl;

    .line 242
    .line 243
    const/high16 p1, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-static {p0, p1}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    const/high16 p1, 0x42200000    # 40.0f

    .line 250
    .line 251
    invoke-static {p0, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    if-ne p0, p4, :cond_b

    .line 260
    .line 261
    new-instance p0, La/thj0;

    .line 262
    .line 263
    const/16 p1, 0x8

    .line 264
    .line 265
    invoke-direct {p0, p1}, La/thj0;-><init>(B)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, p0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_b
    move-object v0, p0

    .line 272
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 273
    .line 274
    invoke-virtual {v4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p0

    .line 278
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-nez p0, :cond_c

    .line 283
    .line 284
    if-ne p1, p4, :cond_d

    .line 285
    .line 286
    :cond_c
    new-instance p1, La/abh0;

    .line 287
    .line 288
    const/16 p0, 0xd

    .line 289
    .line 290
    invoke-direct {p1, p3, p0}, La/abh0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_d
    move-object v2, p1

    .line 297
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 298
    .line 299
    move-object v3, v4

    .line 300
    const/4 v4, 0x6

    .line 301
    const/4 v5, 0x0

    .line 302
    invoke-static/range {v0 .. v5}, La/dwi0;->b(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 303
    .line 304
    .line 305
    move-object v4, v3

    .line 306
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_e
    const p0, 0x4f462c2a

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 317
    .line 318
    .line 319
    :goto_5
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_f
    if-nez p1, :cond_10

    .line 324
    .line 325
    const p0, -0x795049a4

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_10
    const p0, -0x79504504

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_11
    move-object v4, v3

    .line 346
    invoke-virtual {v4}, La/fet;->X()V

    .line 347
    .line 348
    .line 349
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object p0
.end method
