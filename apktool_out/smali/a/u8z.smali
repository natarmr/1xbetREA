.class public final La/u8z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qah0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qah0;

.field public final synthetic c:La/bch0;


# direct methods
.method public synthetic constructor <init>(La/qah0;La/bch0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u8z;->a:B

    iput-object p2, p0, La/u8z;->c:La/bch0;

    iput-object p1, p0, La/u8z;->b:La/qah0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/u8z;->b:La/qah0;

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/qah0;->a(F)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, La/u8z;->b:La/qah0;

    .line 14
    .line 15
    invoke-interface {p0, p1}, La/qah0;->a(F)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    iget-object p0, p0, La/u8z;->b:La/qah0;

    .line 21
    .line 22
    invoke-interface {p0, p1}, La/qah0;->a(F)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)I
    .locals 10

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/u8z;->c:La/bch0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, La/xk80;

    .line 11
    .line 12
    invoke-virtual {v3}, La/xk80;->k()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    sub-int/2addr p1, p0

    .line 17
    invoke-virtual {v3}, La/xk80;->p()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    mul-int/2addr p0, p1

    .line 22
    int-to-float p0, p0

    .line 23
    invoke-virtual {v3}, La/xk80;->l()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v3}, La/xk80;->p()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    mul-float/2addr p1, v0

    .line 33
    sub-float/2addr p0, p1

    .line 34
    const/4 p1, 0x0

    .line 35
    add-float/2addr p0, p1

    .line 36
    invoke-static {p0}, La/si30;->b(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {v3}, La/k7x;->B(La/xk80;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    int-to-long p0, p0

    .line 45
    add-long v4, v0, p0

    .line 46
    .line 47
    iget-wide v6, v3, La/xk80;->h:J

    .line 48
    .line 49
    iget-wide v8, v3, La/xk80;->g:J

    .line 50
    .line 51
    invoke-static/range {v4 .. v9}, La/l1e0;->f(JJJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p0

    .line 55
    invoke-static {v3}, La/k7x;->B(La/xk80;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sub-long/2addr p0, v0

    .line 60
    long-to-int p0, p0

    .line 61
    return p0

    .line 62
    :pswitch_0
    check-cast v3, La/xcz;

    .line 63
    .line 64
    invoke-virtual {v3}, La/xcz;->j()La/mcz;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v4, v0, La/mcz;->l:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_0
    invoke-virtual {v3}, La/xcz;->h()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {p0}, La/u8z;->e()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-gt p1, p0, :cond_3

    .line 86
    .line 87
    if-gt v4, p1, :cond_3

    .line 88
    .line 89
    iget-object p0, v0, La/mcz;->l:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v3, v2

    .line 96
    :goto_0
    if-ge v3, v0, :cond_2

    .line 97
    .line 98
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    move-object v5, v4

    .line 103
    check-cast v5, La/ncz;

    .line 104
    .line 105
    iget v5, v5, La/ncz;->a:I

    .line 106
    .line 107
    if-ne v5, p1, :cond_1

    .line 108
    .line 109
    move-object v1, v4

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    :goto_1
    check-cast v1, La/ncz;

    .line 115
    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    iget v2, v1, La/ncz;->p:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-static {v0}, La/idx;->Y(La/mcz;)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-virtual {v3}, La/xcz;->h()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sub-int/2addr p1, v0

    .line 130
    mul-int/2addr p1, p0

    .line 131
    invoke-virtual {v3}, La/xcz;->i()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    sub-int v2, p1, p0

    .line 136
    .line 137
    :cond_4
    :goto_2
    return v2

    .line 138
    :pswitch_1
    check-cast v3, La/d9z;

    .line 139
    .line 140
    invoke-virtual {v3}, La/d9z;->j()La/q8z;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v4, v0, La/q8z;->n:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_5

    .line 151
    .line 152
    goto/16 :goto_6

    .line 153
    .line 154
    :cond_5
    invoke-virtual {v3}, La/d9z;->h()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {p0}, La/u8z;->e()I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-gt p1, p0, :cond_a

    .line 163
    .line 164
    if-gt v4, p1, :cond_a

    .line 165
    .line 166
    iget-object p0, v0, La/q8z;->n:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    move v4, v2

    .line 173
    :goto_3
    if-ge v4, v3, :cond_7

    .line 174
    .line 175
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    move-object v6, v5

    .line 180
    check-cast v6, La/r8z;

    .line 181
    .line 182
    iget v6, v6, La/r8z;->a:I

    .line 183
    .line 184
    if-ne v6, p1, :cond_6

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    move-object v5, v1

    .line 191
    :goto_4
    check-cast v5, La/r8z;

    .line 192
    .line 193
    iget-object p0, v0, La/q8z;->r:La/ma80;

    .line 194
    .line 195
    sget-object p1, La/ma80;->a:La/ma80;

    .line 196
    .line 197
    if-ne p0, p1, :cond_8

    .line 198
    .line 199
    if-eqz v5, :cond_9

    .line 200
    .line 201
    iget-wide p0, v5, La/r8z;->x:J

    .line 202
    .line 203
    const-wide v0, 0xffffffffL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    and-long/2addr p0, v0

    .line 209
    long-to-int p0, p0

    .line 210
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    goto :goto_5

    .line 215
    :cond_8
    if-eqz v5, :cond_9

    .line 216
    .line 217
    iget-wide p0, v5, La/r8z;->x:J

    .line 218
    .line 219
    const/16 v0, 0x20

    .line 220
    .line 221
    shr-long/2addr p0, v0

    .line 222
    long-to-int p0, p0

    .line 223
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    :cond_9
    :goto_5
    if-eqz v1, :cond_d

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    goto :goto_6

    .line 234
    :cond_a
    iget-object p0, v3, La/d9z;->e:La/pz40;

    .line 235
    .line 236
    check-cast p0, La/hgk0;

    .line 237
    .line 238
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, La/q8z;

    .line 243
    .line 244
    iget p0, p0, La/q8z;->j:I

    .line 245
    .line 246
    invoke-static {v0}, La/l8x;->D0(La/q8z;)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    invoke-virtual {v3}, La/d9z;->h()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    const/4 v4, 0x1

    .line 255
    if-ge p1, v1, :cond_b

    .line 256
    .line 257
    move v2, v4

    .line 258
    :cond_b
    invoke-virtual {v3}, La/d9z;->h()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    sub-int/2addr p1, v1

    .line 263
    add-int/lit8 v1, p0, -0x1

    .line 264
    .line 265
    if-eqz v2, :cond_c

    .line 266
    .line 267
    const/4 v4, -0x1

    .line 268
    :cond_c
    mul-int/2addr v1, v4

    .line 269
    add-int/2addr v1, p1

    .line 270
    div-int/2addr v1, p0

    .line 271
    mul-int/2addr v1, v0

    .line 272
    invoke-virtual {v3}, La/d9z;->i()I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    sub-int v2, v1, p0

    .line 277
    .line 278
    :cond_d
    :goto_6
    return v2

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u8z;->c:La/bch0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xk80;

    .line 9
    .line 10
    iget p0, p0, La/xk80;->e:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, La/xcz;

    .line 14
    .line 15
    invoke-virtual {p0}, La/xcz;->h()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    check-cast p0, La/d9z;

    .line 21
    .line 22
    invoke-virtual {p0}, La/d9z;->h()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u8z;->c:La/bch0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xk80;

    .line 9
    .line 10
    iget p0, p0, La/xk80;->f:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, La/xcz;

    .line 14
    .line 15
    invoke-virtual {p0}, La/xcz;->i()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    check-cast p0, La/d9z;

    .line 21
    .line 22
    invoke-virtual {p0}, La/d9z;->i()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 2

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/u8z;->c:La/bch0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/xk80;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xk80;->m()La/pk80;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/pk80;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/wj30;

    .line 22
    .line 23
    iget p0, p0, La/wj30;->a:I

    .line 24
    .line 25
    return p0

    .line 26
    :pswitch_0
    check-cast p0, La/xcz;

    .line 27
    .line 28
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/ncz;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    iget v1, p0, La/ncz;->a:I

    .line 43
    .line 44
    :cond_0
    return v1

    .line 45
    :pswitch_1
    check-cast p0, La/d9z;

    .line 46
    .line 47
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/r8z;

    .line 58
    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    iget v1, p0, La/r8z;->a:I

    .line 62
    .line 63
    :cond_1
    return v1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(II)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/u8z;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/u8z;->c:La/bch0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/xk80;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xk80;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-float v0, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    cmpg-float v3, v0, v2

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    int-to-float p2, p2

    .line 23
    div-float v2, p2, v0

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0, v2, p1, v1}, La/xk80;->w(FIZ)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    check-cast p0, La/xcz;

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2, v1}, La/xcz;->m(IIZ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    check-cast p0, La/d9z;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2, v1}, La/d9z;->m(IIZ)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
