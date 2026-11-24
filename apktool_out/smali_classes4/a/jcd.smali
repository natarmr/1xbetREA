.class public final synthetic La/jcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o3w;


# direct methods
.method public synthetic constructor <init>(La/o3w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jcd;->a:B

    iput-object p1, p0, La/jcd;->b:La/o3w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/jcd;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, La/jcd;->b:La/o3w;

    .line 10
    .line 11
    check-cast p1, La/u63;

    .line 12
    .line 13
    check-cast p2, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p1, p3, 0x11

    .line 28
    .line 29
    if-eq p1, v2, :cond_0

    .line 30
    .line 31
    move p1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v3

    .line 34
    :goto_0
    and-int/2addr p3, v4

    .line 35
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    sget-object p1, La/uc9;->c:La/mw3;

    .line 42
    .line 43
    sget-object p3, La/gqw0;->m:La/xx7;

    .line 44
    .line 45
    invoke-static {p1, p3, p2, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-wide v5, p2, La/fet;->T:J

    .line 50
    .line 51
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v5, La/jm40;->b:La/jm40;

    .line 60
    .line 61
    invoke-static {p2, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, La/fet;->i0()V

    .line 71
    .line 72
    .line 73
    iget-boolean v6, p2, La/fet;->S:Z

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p2}, La/fet;->r0()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 85
    .line 86
    invoke-static {p2, p1, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    sget-object p1, La/gqw0;->w:La/shd;

    .line 90
    .line 91
    invoke-static {p2, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object p3, La/gqw0;->y:La/shd;

    .line 99
    .line 100
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 104
    .line 105
    .line 106
    sget-object p1, La/gqw0;->v:La/shd;

    .line 107
    .line 108
    invoke-static {p2, v2, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, La/o3w;->a:Ljava/lang/String;

    .line 112
    .line 113
    new-instance p3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, "FULL_TAX_COLUMN_REMEMBER_ID"

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const p3, -0xa3b09ea

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p3, p1}, La/fet;->b0(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const p1, -0xa3af82f

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, La/o3w;->c:La/a4x;

    .line 143
    .line 144
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_2

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, La/f3w;

    .line 159
    .line 160
    sget-object p3, La/qmk;->a:La/zcl;

    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    const/16 v10, 0xd

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    const/high16 v7, 0x40c00000    # 6.0f

    .line 167
    .line 168
    const/4 v8, 0x0

    .line 169
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    invoke-static {p3, p1, p2, v3}, La/hp4;->c(La/mm40;La/f3w;La/fet;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_2
    invoke-static {p2, v3, v3, v4}, La/ohs0;->x(La/fet;ZZZ)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    and-int/lit8 p1, p3, 0x11

    .line 191
    .line 192
    if-eq p1, v2, :cond_4

    .line 193
    .line 194
    move p1, v4

    .line 195
    goto :goto_4

    .line 196
    :cond_4
    move p1, v3

    .line 197
    :goto_4
    and-int/2addr p3, v4

    .line 198
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_7

    .line 203
    .line 204
    sget-object p1, La/uc9;->c:La/mw3;

    .line 205
    .line 206
    sget-object p3, La/gqw0;->m:La/xx7;

    .line 207
    .line 208
    invoke-static {p1, p3, p2, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iget-wide v5, p2, La/fet;->T:J

    .line 213
    .line 214
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 215
    .line 216
    .line 217
    move-result p3

    .line 218
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    sget-object v5, La/jm40;->b:La/jm40;

    .line 223
    .line 224
    invoke-static {p2, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2}, La/fet;->i0()V

    .line 234
    .line 235
    .line 236
    iget-boolean v6, p2, La/fet;->S:Z

    .line 237
    .line 238
    if-eqz v6, :cond_5

    .line 239
    .line 240
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_5
    invoke-virtual {p2}, La/fet;->r0()V

    .line 245
    .line 246
    .line 247
    :goto_5
    sget-object v1, La/gqw0;->x:La/shd;

    .line 248
    .line 249
    invoke-static {p2, p1, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 250
    .line 251
    .line 252
    sget-object p1, La/gqw0;->w:La/shd;

    .line 253
    .line 254
    invoke-static {p2, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    sget-object p3, La/gqw0;->y:La/shd;

    .line 262
    .line 263
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 267
    .line 268
    .line 269
    sget-object p1, La/gqw0;->v:La/shd;

    .line 270
    .line 271
    invoke-static {p2, v2, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, p0, La/o3w;->a:Ljava/lang/String;

    .line 275
    .line 276
    new-instance p3, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p1, "TAX_COLUMN_REMEMBER_ID"

    .line 285
    .line 286
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const p3, 0x2a9aa939

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2, p3, p1}, La/fet;->b0(ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    const p1, 0x2a9abaf4

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 303
    .line 304
    .line 305
    iget-object p0, p0, La/o3w;->c:La/a4x;

    .line 306
    .line 307
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_6

    .line 316
    .line 317
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    check-cast p1, La/f3w;

    .line 322
    .line 323
    sget-object p3, La/qmk;->a:La/zcl;

    .line 324
    .line 325
    const/4 v9, 0x0

    .line 326
    const/16 v10, 0xd

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    const/high16 v7, 0x40c00000    # 6.0f

    .line 330
    .line 331
    const/4 v8, 0x0

    .line 332
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 333
    .line 334
    .line 335
    move-result-object p3

    .line 336
    invoke-static {p3, p1, p2, v3, v3}, La/jcb;->a(La/mm40;La/f3w;La/fet;II)V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_6
    invoke-static {p2, v3, v3, v4}, La/ohs0;->x(La/fet;ZZZ)V

    .line 341
    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 345
    .line 346
    .line 347
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object p0

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
