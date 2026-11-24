.class public final La/jdr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/skb0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;La/mm40;La/skb0;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jdr0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, La/jdr0;->b:La/mm40;

    .line 7
    .line 8
    iput-object p3, p0, La/jdr0;->c:La/skb0;

    .line 9
    .line 10
    iput-object p4, p0, La/jdr0;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iput-boolean p5, p0, La/jdr0;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    move-result p2

    .line 9
    move-object v5, p3

    .line 10
    check-cast v5, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

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
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v5, p2}, La/fet;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v8

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v5, p1, p3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_12

    .line 67
    .line 68
    iget-object p1, p0, La/jdr0;->a:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/a2n;

    .line 75
    .line 76
    const p3, -0x34d06314    # -1.1508972E7f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 80
    .line 81
    .line 82
    const p3, 0x61649ddf

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 86
    .line 87
    .line 88
    sget-object p3, La/skb0;->c:La/skb0;

    .line 89
    .line 90
    iget-object p4, p0, La/jdr0;->c:La/skb0;

    .line 91
    .line 92
    sget-object v0, La/ukd;->a:La/cl5;

    .line 93
    .line 94
    iget-object v1, p0, La/jdr0;->d:Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    iget-object v2, p0, La/jdr0;->b:La/mm40;

    .line 97
    .line 98
    if-ne p4, p3, :cond_7

    .line 99
    .line 100
    if-nez p2, :cond_7

    .line 101
    .line 102
    const p3, 0x35a9fec8

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-nez p3, :cond_5

    .line 117
    .line 118
    if-ne v3, v0, :cond_6

    .line 119
    .line 120
    :cond_5
    new-instance v3, La/dpl0;

    .line 121
    .line 122
    const/16 p3, 0xd

    .line 123
    .line 124
    invoke-direct {v3, v1, p3}, La/dpl0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 131
    .line 132
    invoke-static {v2, v3}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    const p3, 0x35af940d

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 147
    .line 148
    .line 149
    :goto_4
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 150
    .line 151
    .line 152
    sget-object p3, La/skb0;->d:La/skb0;

    .line 153
    .line 154
    if-ne p4, p3, :cond_a

    .line 155
    .line 156
    if-nez p2, :cond_a

    .line 157
    .line 158
    const p2, -0x34c5eaac

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, p2}, La/fet;->e0(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    or-int/2addr p2, p3

    .line 173
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    if-nez p2, :cond_8

    .line 178
    .line 179
    if-ne p3, v0, :cond_9

    .line 180
    .line 181
    :cond_8
    new-instance p3, La/zcn0;

    .line 182
    .line 183
    const/16 p2, 0x18

    .line 184
    .line 185
    invoke-direct {p3, p1, v1, p2}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    check-cast p3, Lkotlin/jvm/functions/Function1;

    .line 192
    .line 193
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 194
    .line 195
    .line 196
    :goto_5
    move-object v4, p3

    .line 197
    goto :goto_6

    .line 198
    :cond_a
    const p2, -0x34b66d37    # -1.3210313E7f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5, p2}, La/fet;->e0(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 205
    .line 206
    .line 207
    const/4 p3, 0x0

    .line 208
    goto :goto_5

    .line 209
    :goto_6
    if-nez p1, :cond_b

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_b
    instance-of p2, p1, La/y56;

    .line 213
    .line 214
    if-eqz p2, :cond_e

    .line 215
    .line 216
    const p2, -0x34b4c582    # -1.3318782E7f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, p2}, La/fet;->e0(I)V

    .line 220
    .line 221
    .line 222
    check-cast p1, La/y56;

    .line 223
    .line 224
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    if-nez p2, :cond_c

    .line 233
    .line 234
    if-ne p3, v0, :cond_d

    .line 235
    .line 236
    :cond_c
    new-instance p3, La/dpl0;

    .line 237
    .line 238
    const/16 p2, 0xb

    .line 239
    .line 240
    invoke-direct {p3, v1, p2}, La/dpl0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_d
    move-object v3, p3

    .line 247
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    const/4 v7, 0x0

    .line 251
    move-object v0, v2

    .line 252
    iget-boolean v2, p0, La/jdr0;->e:Z

    .line 253
    .line 254
    move-object v1, p1

    .line 255
    invoke-static/range {v0 .. v7}, La/vcc;->i(La/mm40;La/y56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_e
    move-object p2, v0

    .line 263
    move-object v0, v2

    .line 264
    instance-of p3, p1, La/c2o0;

    .line 265
    .line 266
    if-eqz p3, :cond_11

    .line 267
    .line 268
    const p3, -0x34af1026    # -1.369289E7f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 272
    .line 273
    .line 274
    check-cast p1, La/c2o0;

    .line 275
    .line 276
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p4

    .line 284
    if-nez p3, :cond_f

    .line 285
    .line 286
    if-ne p4, p2, :cond_10

    .line 287
    .line 288
    :cond_f
    new-instance p4, La/dpl0;

    .line 289
    .line 290
    const/16 p2, 0xc

    .line 291
    .line 292
    invoke-direct {p4, v1, p2}, La/dpl0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5, p4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_10
    move-object v3, p4

    .line 299
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    const/4 v7, 0x0

    .line 303
    iget-boolean v2, p0, La/jdr0;->e:Z

    .line 304
    .line 305
    move-object v1, p1

    .line 306
    invoke-static/range {v0 .. v7}, La/hkb;->n(La/mm40;La/c2o0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_11
    :goto_7
    const p0, -0x34a9e153    # -1.4032557E7f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v5, p0}, La/fet;->e0(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 320
    .line 321
    .line 322
    :goto_8
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_12
    invoke-virtual {v5}, La/fet;->X()V

    .line 327
    .line 328
    .line 329
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object p0
.end method
