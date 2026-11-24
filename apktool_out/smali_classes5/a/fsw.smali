.class public final synthetic La/fsw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pz40;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pz40;JB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fsw;->a:B

    iput-object p1, p0, La/fsw;->b:La/mm40;

    iput-object p2, p0, La/fsw;->c:La/pz40;

    iput-wide p3, p0, La/fsw;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/fsw;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    check-cast p1, La/fet;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, p2, 0x3

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    and-int/2addr p2, v2

    .line 25
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_7

    .line 30
    .line 31
    sget-object p2, La/qmk;->a:La/zcl;

    .line 32
    .line 33
    new-instance p2, La/qw3;

    .line 34
    .line 35
    new-instance v0, La/jf4;

    .line 36
    .line 37
    const/16 v1, 0xe

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/jf4;-><init>(B)V

    .line 40
    .line 41
    .line 42
    const/high16 v1, 0x40000000    # 2.0f

    .line 43
    .line 44
    invoke-direct {p2, v1, v2, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, La/fsw;->b:La/mm40;

    .line 48
    .line 49
    invoke-static {v0}, La/hp4;->B(La/mm40;)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/4 v8, 0x0

    .line 54
    const/16 v9, 0xd

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const/high16 v6, 0x40000000    # 2.0f

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, La/gqw0;->m:La/xx7;

    .line 65
    .line 66
    invoke-static {p2, v1, p1, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-wide v4, p1, La/fet;->T:J

    .line 71
    .line 72
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {p1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, La/fet;->i0()V

    .line 90
    .line 91
    .line 92
    iget-boolean v5, p1, La/fet;->S:Z

    .line 93
    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 97
    .line 98
    invoke-virtual {p1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 103
    .line 104
    .line 105
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 106
    .line 107
    invoke-static {p1, p2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    sget-object p2, La/gqw0;->w:La/shd;

    .line 111
    .line 112
    invoke-static {p1, v4, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    sget-object v1, La/gqw0;->y:La/shd;

    .line 120
    .line 121
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 125
    .line 126
    .line 127
    sget-object p2, La/gqw0;->v:La/shd;

    .line 128
    .line 129
    invoke-static {p1, v0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    const p2, -0x2f0e740d

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 136
    .line 137
    .line 138
    iget-object v9, p0, La/fsw;->c:La/pz40;

    .line 139
    .line 140
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Ljava/lang/Iterable;

    .line 145
    .line 146
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    move v6, v3

    .line 151
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    add-int/lit8 v1, v6, 0x1

    .line 162
    .line 163
    if-ltz v6, :cond_5

    .line 164
    .line 165
    check-cast v0, La/elo0;

    .line 166
    .line 167
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-virtual {p1, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    or-int/2addr v4, v5

    .line 176
    iget-wide v7, p0, La/fsw;->d:J

    .line 177
    .line 178
    invoke-virtual {p1, v7, v8}, La/fet;->f(J)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    or-int/2addr v4, v5

    .line 183
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    sget-object v10, La/ukd;->a:La/cl5;

    .line 188
    .line 189
    if-nez v4, :cond_2

    .line 190
    .line 191
    if-ne v5, v10, :cond_3

    .line 192
    .line 193
    :cond_2
    new-instance v4, La/mu7;

    .line 194
    .line 195
    const/4 v5, 0x4

    .line 196
    invoke-direct/range {v4 .. v9}, La/mu7;-><init>(BIJLjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    move-object v5, v4

    .line 203
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 204
    .line 205
    sget-object v4, La/jm40;->b:La/jm40;

    .line 206
    .line 207
    invoke-static {v4, v5}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    if-ne v5, v10, :cond_4

    .line 216
    .line 217
    new-instance v5, La/h7w;

    .line 218
    .line 219
    const/16 v6, 0xd

    .line 220
    .line 221
    invoke-direct {v5, v6}, La/h7w;-><init>(B)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 228
    .line 229
    const/16 v6, 0x180

    .line 230
    .line 231
    invoke-static {v4, v0, v5, p1, v6}, La/vko0;->a(La/mm40;La/elo0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 232
    .line 233
    .line 234
    move v6, v1

    .line 235
    goto :goto_2

    .line 236
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 237
    .line 238
    .line 239
    const/4 p0, 0x0

    .line 240
    throw p0

    .line 241
    :cond_6
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v2}, La/fet;->r(Z)V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 249
    .line 250
    .line 251
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 255
    .line 256
    if-eq v0, v1, :cond_8

    .line 257
    .line 258
    move v3, v2

    .line 259
    :cond_8
    and-int/2addr p2, v2

    .line 260
    invoke-virtual {p1, p2, v3}, La/fet;->U(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    if-eqz p2, :cond_9

    .line 265
    .line 266
    new-instance v0, La/fsw;

    .line 267
    .line 268
    const/4 v5, 0x1

    .line 269
    iget-object v1, p0, La/fsw;->b:La/mm40;

    .line 270
    .line 271
    iget-object v2, p0, La/fsw;->c:La/pz40;

    .line 272
    .line 273
    iget-wide v3, p0, La/fsw;->d:J

    .line 274
    .line 275
    invoke-direct/range {v0 .. v5}, La/fsw;-><init>(La/mm40;La/pz40;JB)V

    .line 276
    .line 277
    .line 278
    const p0, -0x33b184cf    # -5.4127812E7f

    .line 279
    .line 280
    .line 281
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    const/4 p2, 0x6

    .line 286
    invoke-static {p0, p1, p2}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 291
    .line 292
    .line 293
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
