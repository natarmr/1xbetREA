.class public final synthetic La/lw6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a8q0;

.field public final synthetic c:La/agk0;

.field public final synthetic d:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/a8q0;La/agk0;La/cgk0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/lw6;->a:B

    iput-object p1, p0, La/lw6;->b:La/a8q0;

    iput-object p2, p0, La/lw6;->c:La/agk0;

    iput-object p3, p0, La/lw6;->d:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lw6;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x41800000    # 16.0f

    .line 4
    .line 5
    const/high16 v2, 0x41000000    # 8.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    const/high16 v6, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iget-object v7, p0, La/lw6;->d:La/cgk0;

    .line 14
    .line 15
    iget-object v8, p0, La/lw6;->c:La/agk0;

    .line 16
    .line 17
    iget-object p0, p0, La/lw6;->b:La/a8q0;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/a8q0;->a:La/j83;

    .line 23
    .line 24
    check-cast p1, La/a9q0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, La/a9q0;->b:La/bw40;

    .line 30
    .line 31
    iget-object v0, v0, La/bw40;->a:La/w5z;

    .line 32
    .line 33
    invoke-virtual {v0}, La/w5z;->e()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-wide v9, p1, La/a9q0;->c:J

    .line 38
    .line 39
    shr-long/2addr v9, v5

    .line 40
    long-to-int p1, v9

    .line 41
    int-to-float p1, p1

    .line 42
    cmpl-float p1, v0, p1

    .line 43
    .line 44
    if-ltz p1, :cond_0

    .line 45
    .line 46
    move v3, v4

    .line 47
    :cond_0
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v8}, La/agk0;->l()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    cmpl-float p1, p1, v2

    .line 54
    .line 55
    if-lez p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, La/j83;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-le p1, v0, :cond_1

    .line 68
    .line 69
    invoke-virtual {v8}, La/agk0;->l()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    sub-float/2addr p1, v6

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    if-nez v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {v8}, La/agk0;->l()F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    cmpg-float p1, p1, v1

    .line 82
    .line 83
    if-gez p1, :cond_2

    .line 84
    .line 85
    iget-object p1, p0, La/j83;->b:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-ge p1, v0, :cond_2

    .line 96
    .line 97
    invoke-virtual {v8}, La/agk0;->l()F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    add-float/2addr p1, v6

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v8}, La/agk0;->l()F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    :goto_0
    invoke-virtual {v8, p1}, La/agk0;->m(F)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {v7, p0}, La/cgk0;->m(I)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    check-cast p1, La/a9q0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/a9q0;->b:La/bw40;

    .line 128
    .line 129
    iget-object v0, v0, La/bw40;->a:La/w5z;

    .line 130
    .line 131
    invoke-virtual {v0}, La/w5z;->e()F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget-wide v9, p1, La/a9q0;->c:J

    .line 136
    .line 137
    shr-long/2addr v9, v5

    .line 138
    long-to-int p1, v9

    .line 139
    int-to-float p1, p1

    .line 140
    cmpl-float p1, v0, p1

    .line 141
    .line 142
    if-ltz p1, :cond_3

    .line 143
    .line 144
    move v3, v4

    .line 145
    :cond_3
    if-eqz v3, :cond_4

    .line 146
    .line 147
    invoke-virtual {v8}, La/agk0;->l()F

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    cmpl-float p1, p1, v2

    .line 152
    .line 153
    if-lez p1, :cond_4

    .line 154
    .line 155
    iget-object p1, p0, La/a8q0;->a:La/j83;

    .line 156
    .line 157
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-le p1, v0, :cond_4

    .line 168
    .line 169
    invoke-virtual {v8}, La/agk0;->l()F

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    sub-float/2addr p1, v6

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    if-nez v3, :cond_5

    .line 176
    .line 177
    invoke-virtual {v8}, La/agk0;->l()F

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    cmpg-float p1, p1, v1

    .line 182
    .line 183
    if-gez p1, :cond_5

    .line 184
    .line 185
    iget-object p1, p0, La/a8q0;->a:La/j83;

    .line 186
    .line 187
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-ge p1, v0, :cond_5

    .line 198
    .line 199
    invoke-virtual {v8}, La/agk0;->l()F

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    add-float/2addr p1, v6

    .line 204
    goto :goto_1

    .line 205
    :cond_5
    invoke-virtual {v8}, La/agk0;->l()F

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    :goto_1
    invoke-virtual {v8, p1}, La/agk0;->m(F)V

    .line 210
    .line 211
    .line 212
    iget-object p0, p0, La/a8q0;->a:La/j83;

    .line 213
    .line 214
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    invoke-virtual {v7, p0}, La/cgk0;->m(I)V

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_1
    check-cast p1, La/a9q0;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, p1, La/a9q0;->b:La/bw40;

    .line 232
    .line 233
    iget-object v0, v0, La/bw40;->a:La/w5z;

    .line 234
    .line 235
    invoke-virtual {v0}, La/w5z;->e()F

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iget-wide v9, p1, La/a9q0;->c:J

    .line 240
    .line 241
    shr-long/2addr v9, v5

    .line 242
    long-to-int p1, v9

    .line 243
    int-to-float p1, p1

    .line 244
    cmpl-float p1, v0, p1

    .line 245
    .line 246
    if-ltz p1, :cond_6

    .line 247
    .line 248
    move v3, v4

    .line 249
    :cond_6
    if-eqz v3, :cond_7

    .line 250
    .line 251
    invoke-virtual {v8}, La/agk0;->l()F

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    cmpl-float p1, p1, v2

    .line 256
    .line 257
    if-lez p1, :cond_7

    .line 258
    .line 259
    iget-object p1, p0, La/a8q0;->a:La/j83;

    .line 260
    .line 261
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-le p1, v0, :cond_7

    .line 272
    .line 273
    invoke-virtual {v8}, La/agk0;->l()F

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    sub-float/2addr p1, v6

    .line 278
    goto :goto_2

    .line 279
    :cond_7
    if-nez v3, :cond_8

    .line 280
    .line 281
    invoke-virtual {v8}, La/agk0;->l()F

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    cmpg-float p1, p1, v1

    .line 286
    .line 287
    if-gez p1, :cond_8

    .line 288
    .line 289
    iget-object p1, p0, La/a8q0;->a:La/j83;

    .line 290
    .line 291
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ge p1, v0, :cond_8

    .line 302
    .line 303
    invoke-virtual {v8}, La/agk0;->l()F

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    add-float/2addr p1, v6

    .line 308
    goto :goto_2

    .line 309
    :cond_8
    invoke-virtual {v8}, La/agk0;->l()F

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    :goto_2
    invoke-virtual {v8, p1}, La/agk0;->m(F)V

    .line 314
    .line 315
    .line 316
    iget-object p0, p0, La/a8q0;->a:La/j83;

    .line 317
    .line 318
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    invoke-virtual {v7, p0}, La/cgk0;->m(I)V

    .line 325
    .line 326
    .line 327
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object p0

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
