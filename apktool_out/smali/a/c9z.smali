.class public final La/c9z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:La/bch0;


# direct methods
.method public synthetic constructor <init>(La/bch0;IILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/c9z;->i:B

    iput-object p1, p0, La/c9z;->l:La/bch0;

    iput p2, p0, La/c9z;->j:I

    iput p3, p0, La/c9z;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/c9z;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/c9z;->l:La/bch0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/c9z;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/mez;

    .line 12
    .line 13
    iget v4, p0, La/c9z;->k:I

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    iget v3, p0, La/c9z;->j:I

    .line 17
    .line 18
    move-object v5, p2

    .line 19
    invoke-direct/range {v1 .. v6}, La/c9z;-><init>(La/bch0;IILa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v6, p2

    .line 24
    new-instance v2, La/c9z;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, La/xcz;

    .line 28
    .line 29
    iget v5, p0, La/c9z;->k:I

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    iget v4, p0, La/c9z;->j:I

    .line 33
    .line 34
    invoke-direct/range {v2 .. v7}, La/c9z;-><init>(La/bch0;IILa/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_1
    move-object v6, p2

    .line 39
    new-instance v2, La/c9z;

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, La/d9z;

    .line 43
    .line 44
    iget v5, p0, La/c9z;->k:I

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    iget v4, p0, La/c9z;->j:I

    .line 48
    .line 49
    invoke-direct/range {v2 .. v7}, La/c9z;-><init>(La/bch0;IILa/yje;B)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c9z;->i:B

    .line 2
    .line 3
    check-cast p1, La/qah0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/c9z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/c9z;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/c9z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/c9z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/c9z;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/c9z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/c9z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/c9z;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/c9z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/c9z;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/c9z;->k:I

    .line 5
    .line 6
    iget v3, p0, La/c9z;->j:I

    .line 7
    .line 8
    iget-object p0, p0, La/c9z;->l:La/bch0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    check-cast p0, La/mez;

    .line 19
    .line 20
    iget-object p1, p0, La/mez;->c:La/hhk;

    .line 21
    .line 22
    iget-object v0, p1, La/hhk;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/cgk0;

    .line 25
    .line 26
    iget-object v4, p1, La/hhk;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, La/cgk0;

    .line 29
    .line 30
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v5, 0x0

    .line 35
    if-ne v0, v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eq v0, v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v0, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move v0, v1

    .line 47
    :goto_1
    const/4 v6, 0x0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v7, p0, La/mez;->t:La/dbz;

    .line 51
    .line 52
    invoke-virtual {v7}, La/dbz;->e()V

    .line 53
    .line 54
    .line 55
    iput-object v6, v7, La/dbz;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 56
    .line 57
    const/4 v8, -0x1

    .line 58
    iput v8, v7, La/dbz;->c:I

    .line 59
    .line 60
    :cond_2
    iget-object v7, p0, La/mez;->d:La/pz40;

    .line 61
    .line 62
    check-cast v7, La/hgk0;

    .line 63
    .line 64
    invoke-virtual {v7}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, La/fez;

    .line 69
    .line 70
    sget-object v8, La/gez;->a:La/fez;

    .line 71
    .line 72
    iget-object v8, v7, La/fez;->m:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_4

    .line 79
    .line 80
    :cond_3
    move-object v1, v6

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, La/hez;

    .line 87
    .line 88
    iget v9, v9, La/hez;->a:I

    .line 89
    .line 90
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    check-cast v10, La/hez;

    .line 95
    .line 96
    iget v10, v10, La/hez;->a:I

    .line 97
    .line 98
    if-gt v3, v10, :cond_3

    .line 99
    .line 100
    if-gt v9, v3, :cond_3

    .line 101
    .line 102
    iget-object v9, v7, La/fez;->m:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    invoke-static {v11, v10}, La/q3d;->n(II)V

    .line 113
    .line 114
    .line 115
    sub-int/2addr v10, v1

    .line 116
    move v11, v5

    .line 117
    :goto_2
    if-gt v11, v10, :cond_6

    .line 118
    .line 119
    add-int v12, v11, v10

    .line 120
    .line 121
    ushr-int/2addr v12, v1

    .line 122
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    check-cast v13, La/hez;

    .line 127
    .line 128
    iget v13, v13, La/hez;->a:I

    .line 129
    .line 130
    sub-int/2addr v13, v3

    .line 131
    if-gez v13, :cond_5

    .line 132
    .line 133
    add-int/lit8 v11, v12, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    if-lez v13, :cond_7

    .line 137
    .line 138
    add-int/lit8 v10, v12, -0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    add-int/2addr v11, v1

    .line 142
    neg-int v12, v11

    .line 143
    :cond_7
    invoke-static {v12, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, La/hez;

    .line 148
    .line 149
    :goto_3
    if-eqz v1, :cond_a

    .line 150
    .line 151
    if-eqz v0, :cond_a

    .line 152
    .line 153
    iget-object v0, v7, La/fez;->u:La/ma80;

    .line 154
    .line 155
    iget-object v3, v7, La/fez;->b:[I

    .line 156
    .line 157
    sget-object v6, La/ma80;->a:La/ma80;

    .line 158
    .line 159
    iget-wide v7, v1, La/hez;->w:J

    .line 160
    .line 161
    if-ne v0, v6, :cond_8

    .line 162
    .line 163
    const-wide v0, 0xffffffffL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    and-long/2addr v0, v7

    .line 169
    :goto_4
    long-to-int v0, v0

    .line 170
    goto :goto_5

    .line 171
    :cond_8
    const/16 v0, 0x20

    .line 172
    .line 173
    shr-long v0, v7, v0

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :goto_5
    add-int/2addr v0, v2

    .line 177
    array-length v1, v3

    .line 178
    new-array v2, v1, [I

    .line 179
    .line 180
    :goto_6
    if-ge v5, v1, :cond_9

    .line 181
    .line 182
    aget v6, v3, v5

    .line 183
    .line 184
    add-int/2addr v6, v0

    .line 185
    aput v6, v2, v5

    .line 186
    .line 187
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    iput-object v2, p1, La/hhk;->e:Ljava/lang/Object;

    .line 191
    .line 192
    iget-object p1, p1, La/hhk;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, [I

    .line 195
    .line 196
    invoke-static {p1, v2}, La/hhk;->c([I[I)I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    invoke-virtual {v4, p1}, La/cgk0;->m(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_a
    iget-object v0, p1, La/hhk;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, La/ens;

    .line 207
    .line 208
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget-object v7, p1, La/hhk;->c:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v7, [I

    .line 215
    .line 216
    array-length v7, v7

    .line 217
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-virtual {v0, v1, v7}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, [I

    .line 226
    .line 227
    array-length v1, v0

    .line 228
    new-array v7, v1, [I

    .line 229
    .line 230
    :goto_7
    if-ge v5, v1, :cond_b

    .line 231
    .line 232
    aput v2, v7, v5

    .line 233
    .line 234
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_b
    iput-object v0, p1, La/hhk;->c:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v0}, La/hhk;->b([I)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    iget-object v2, p1, La/hhk;->d:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, La/cgk0;

    .line 246
    .line 247
    invoke-virtual {v2, v1}, La/cgk0;->m(I)V

    .line 248
    .line 249
    .line 250
    iput-object v7, p1, La/hhk;->e:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v0, v7}, La/hhk;->c([I[I)I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    invoke-virtual {v4, v0}, La/cgk0;->m(I)V

    .line 257
    .line 258
    .line 259
    iget-object v0, p1, La/hhk;->h:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, La/lbz;

    .line 262
    .line 263
    invoke-virtual {v0, v3}, La/lbz;->b(I)V

    .line 264
    .line 265
    .line 266
    iput-object v6, p1, La/hhk;->g:Ljava/lang/Object;

    .line 267
    .line 268
    :goto_8
    iget-object p0, p0, La/mez;->h:La/e7z;

    .line 269
    .line 270
    if-eqz p0, :cond_c

    .line 271
    .line 272
    invoke-virtual {p0}, La/e7z;->l()V

    .line 273
    .line 274
    .line 275
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 279
    .line 280
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    check-cast p0, La/xcz;

    .line 284
    .line 285
    invoke-virtual {p0, v3, v2, v1}, La/xcz;->m(IIZ)V

    .line 286
    .line 287
    .line 288
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 292
    .line 293
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    check-cast p0, La/d9z;

    .line 297
    .line 298
    invoke-virtual {p0, v3, v2, v1}, La/d9z;->m(IIZ)V

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
