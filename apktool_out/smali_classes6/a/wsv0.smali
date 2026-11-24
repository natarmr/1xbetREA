.class public final La/wsv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final a:La/ywv0;

.field public final b:La/pz40;

.field public final c:La/pz40;


# direct methods
.method public constructor <init>(La/ywv0;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wsv0;->a:La/ywv0;

    .line 8
    .line 9
    iput-object p2, p0, La/wsv0;->b:La/pz40;

    .line 10
    .line 11
    iput-object p3, p0, La/wsv0;->c:La/pz40;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, La/ejv0;

    .line 12
    .line 13
    const/16 p2, 0x11

    .line 14
    .line 15
    invoke-direct {p0, p2}, La/ejv0;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1, v1, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object v0, p0, La/wsv0;->b:La/pz40;

    .line 24
    .line 25
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/nuv0;

    .line 30
    .line 31
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, La/pj30;

    .line 40
    .line 41
    invoke-interface {p1}, La/cnx;->M()Z

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    iget-object v2, p0, La/wsv0;->a:La/ywv0;

    .line 46
    .line 47
    if-eqz p4, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget p0, v0, La/nuv0;->a:I

    .line 53
    .line 54
    iget p4, v0, La/nuv0;->b:I

    .line 55
    .line 56
    sub-int/2addr p0, p4

    .line 57
    if-gez p0, :cond_1

    .line 58
    .line 59
    move p0, v1

    .line 60
    :cond_1
    invoke-static {p3, p3, v1, p0}, La/r4e;->a(IIII)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-interface {p2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iget-object p2, v2, La/ywv0;->c:La/fht0;

    .line 69
    .line 70
    iget v2, v0, La/nuv0;->a:I

    .line 71
    .line 72
    iget v3, v0, La/nuv0;->b:I

    .line 73
    .line 74
    iget v4, v0, La/nuv0;->c:I

    .line 75
    .line 76
    iget v5, v0, La/nuv0;->d:I

    .line 77
    .line 78
    iget v6, v0, La/nuv0;->e:I

    .line 79
    .line 80
    iget v7, p0, La/pu90;->b:I

    .line 81
    .line 82
    invoke-virtual {p2}, La/fht0;->f()La/cvv0;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    if-eqz p4, :cond_2

    .line 87
    .line 88
    iget v0, p4, La/cvv0;->a:I

    .line 89
    .line 90
    if-ne v0, v2, :cond_2

    .line 91
    .line 92
    iget v0, p4, La/cvv0;->b:I

    .line 93
    .line 94
    if-ne v0, v3, :cond_2

    .line 95
    .line 96
    iget v0, p4, La/cvv0;->c:I

    .line 97
    .line 98
    if-ne v0, v4, :cond_2

    .line 99
    .line 100
    iget v0, p4, La/cvv0;->d:I

    .line 101
    .line 102
    if-ne v0, v5, :cond_2

    .line 103
    .line 104
    iget v0, p4, La/cvv0;->e:I

    .line 105
    .line 106
    if-ne v0, v6, :cond_2

    .line 107
    .line 108
    iget v0, p4, La/cvv0;->f:I

    .line 109
    .line 110
    if-ne v0, v7, :cond_2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    if-eqz p4, :cond_3

    .line 114
    .line 115
    iget-object p4, p2, La/fht0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p4, La/duv0;

    .line 118
    .line 119
    invoke-virtual {p4}, La/duv0;->b()La/l7m0;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    invoke-interface {p4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    check-cast p4, La/tly;

    .line 128
    .line 129
    iget-boolean p4, p4, La/tly;->a:Z

    .line 130
    .line 131
    if-eqz p4, :cond_3

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    new-instance v1, La/cvv0;

    .line 135
    .line 136
    iget-object p4, p2, La/fht0;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p4, La/h0q0;

    .line 139
    .line 140
    invoke-virtual {p4}, La/h0q0;->l()La/bsv0;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-direct/range {v1 .. v8}, La/cvv0;-><init>(IIIIIILa/bsv0;)V

    .line 145
    .line 146
    .line 147
    iget-object p4, p2, La/fht0;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p4, La/pz40;

    .line 150
    .line 151
    check-cast p4, La/hgk0;

    .line 152
    .line 153
    invoke-virtual {p4, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, La/nsm0;->x(La/cvv0;)La/hu5;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    iput-object p4, p2, La/fht0;->d:Ljava/lang/Object;

    .line 161
    .line 162
    :goto_0
    iget p2, p0, La/pu90;->b:I

    .line 163
    .line 164
    new-instance p4, La/klo0;

    .line 165
    .line 166
    const/16 v0, 0x9

    .line 167
    .line 168
    invoke-direct {p4, p0, v0}, La/klo0;-><init>(La/pu90;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {p1, p3, p2, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :cond_4
    iget-object p4, v2, La/ywv0;->m:La/vkr0;

    .line 177
    .line 178
    iget-object p0, p0, La/wsv0;->c:La/pz40;

    .line 179
    .line 180
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    iget-object p4, p4, La/vkr0;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p4, La/trm0;

    .line 193
    .line 194
    iget-object v3, p4, La/trm0;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v3, La/pz40;

    .line 197
    .line 198
    iget-object v4, p4, La/trm0;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v4, La/pz40;

    .line 201
    .line 202
    check-cast v3, La/hgk0;

    .line 203
    .line 204
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    check-cast v3, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-ne v3, p0, :cond_5

    .line 215
    .line 216
    move-object v3, v4

    .line 217
    check-cast v3, La/hgk0;

    .line 218
    .line 219
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Ljava/lang/Number;

    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-ne v3, p3, :cond_5

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_5
    iget-object p4, p4, La/trm0;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p4, La/pz40;

    .line 235
    .line 236
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    check-cast p4, La/hgk0;

    .line 241
    .line 242
    invoke-virtual {p4, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    check-cast v4, La/hgk0;

    .line 250
    .line 251
    invoke-virtual {v4, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget p0, v0, La/nuv0;->a:I

    .line 258
    .line 259
    iget p4, v0, La/nuv0;->b:I

    .line 260
    .line 261
    sub-int/2addr p0, p4

    .line 262
    if-gez p0, :cond_6

    .line 263
    .line 264
    move p0, v1

    .line 265
    :cond_6
    iget-object p4, v2, La/ywv0;->d:La/glt0;

    .line 266
    .line 267
    iget-object p4, p4, La/glt0;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p4, La/t33;

    .line 270
    .line 271
    invoke-virtual {p4}, La/t33;->d()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p4

    .line 275
    check-cast p4, Ljava/lang/Number;

    .line 276
    .line 277
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 278
    .line 279
    .line 280
    move-result p4

    .line 281
    invoke-static {p4}, La/si30;->b(F)I

    .line 282
    .line 283
    .line 284
    move-result p4

    .line 285
    invoke-static {p4, v1, p0}, La/l1e0;->d(III)I

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    const/4 p4, 0x1

    .line 290
    if-ltz p3, :cond_7

    .line 291
    .line 292
    move v0, p4

    .line 293
    goto :goto_2

    .line 294
    :cond_7
    move v0, v1

    .line 295
    :goto_2
    if-ltz p0, :cond_8

    .line 296
    .line 297
    move v1, p4

    .line 298
    :cond_8
    and-int p4, v0, v1

    .line 299
    .line 300
    if-nez p4, :cond_9

    .line 301
    .line 302
    const-string p4, "width and height must be >= 0"

    .line 303
    .line 304
    invoke-static {p4}, La/zcx;->a(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_9
    invoke-static {p3, p3, p0, p0}, La/r4e;->h(IIII)J

    .line 308
    .line 309
    .line 310
    move-result-wide v0

    .line 311
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    new-instance p4, La/klo0;

    .line 316
    .line 317
    const/16 v0, 0x8

    .line 318
    .line 319
    invoke-direct {p4, p2, v0}, La/klo0;-><init>(La/pu90;B)V

    .line 320
    .line 321
    .line 322
    invoke-static {p1, p3, p0, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0
.end method
