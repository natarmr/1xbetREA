.class public final La/nkn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qpg0;


# instance fields
.field public final a:La/w7r;


# direct methods
.method public constructor <init>(La/w7r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nkn0;->a:La/w7r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final P0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/nkn0;->a:La/w7r;

    .line 2
    .line 3
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final Z0(Ljava/lang/String;)La/xpg0;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nkn0;->a:La/w7r;

    .line 5
    .line 6
    iget-object v0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1b

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit8 v2, v2, -0x2

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, -0x1

    .line 40
    if-gez v2, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    move v5, v3

    .line 44
    :goto_0
    if-ge v5, v2, :cond_9

    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 v7, 0x20

    .line 51
    .line 52
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-gtz v7, :cond_2

    .line 57
    .line 58
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v7, 0x4

    .line 62
    const/16 v8, 0x2d

    .line 63
    .line 64
    if-ne v6, v8, :cond_4

    .line 65
    .line 66
    add-int/lit8 v6, v5, 0x1

    .line 67
    .line 68
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eq v6, v8, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    add-int/lit8 v5, v5, 0x2

    .line 76
    .line 77
    const/16 v6, 0xa

    .line 78
    .line 79
    invoke-static {v6, v5, v7, v0}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-gez v5, :cond_1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    const/16 v8, 0x2f

    .line 87
    .line 88
    if-ne v6, v8, :cond_8

    .line 89
    .line 90
    add-int/lit8 v6, v5, 0x1

    .line 91
    .line 92
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/16 v10, 0x2a

    .line 97
    .line 98
    if-eq v9, v10, :cond_5

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 102
    .line 103
    invoke-static {v10, v6, v7, v0}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-gez v6, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    add-int/lit8 v5, v6, 0x1

    .line 111
    .line 112
    if-ge v5, v2, :cond_7

    .line 113
    .line 114
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-ne v5, v8, :cond_5

    .line 119
    .line 120
    :cond_7
    add-int/lit8 v5, v6, 0x2

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_8
    :goto_1
    move v4, v5

    .line 124
    :cond_9
    :goto_2
    if-ltz v4, :cond_b

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-le v4, v2, :cond_a

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_a
    add-int/lit8 v2, v4, 0x3

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    goto :goto_4

    .line 148
    :cond_b
    :goto_3
    move-object v2, v1

    .line 149
    :goto_4
    if-nez v2, :cond_c

    .line 150
    .line 151
    new-instance v0, La/xkn0;

    .line 152
    .line 153
    invoke-direct {v0, p0, p1}, La/xkn0;-><init>(La/w7r;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    sparse-switch v4, :sswitch_data_0

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :sswitch_0
    const-string v4, "ROL"

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_d

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_d
    const-string v4, " TO "

    .line 175
    .line 176
    invoke-static {v0, v4, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_e

    .line 181
    .line 182
    :goto_5
    move-object v4, v1

    .line 183
    goto :goto_7

    .line 184
    :cond_e
    sget-object v4, La/wkn0;->b:La/wkn0;

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :sswitch_1
    const-string v4, "END"

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-nez v4, :cond_f

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :sswitch_2
    const-string v4, "COM"

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-nez v4, :cond_f

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_f
    sget-object v4, La/wkn0;->a:La/wkn0;

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :sswitch_3
    const-string v4, "BEG"

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_10

    .line 215
    .line 216
    :goto_6
    goto :goto_5

    .line 217
    :cond_10
    const-string v4, "EXCLUSIVE"

    .line 218
    .line 219
    invoke-static {v0, v4, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_11

    .line 224
    .line 225
    sget-object v4, La/wkn0;->c:La/wkn0;

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_11
    const-string v4, "IMMEDIATE"

    .line 229
    .line 230
    invoke-static {v0, v4, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_12

    .line 235
    .line 236
    sget-object v4, La/wkn0;->d:La/wkn0;

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_12
    sget-object v4, La/wkn0;->e:La/wkn0;

    .line 240
    .line 241
    :goto_7
    if-eqz v4, :cond_13

    .line 242
    .line 243
    new-instance v0, La/xkn0;

    .line 244
    .line 245
    invoke-direct {v0, p0, p1, v4}, La/xkn0;-><init>(La/w7r;Ljava/lang/String;La/wkn0;)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :cond_13
    const-string v4, "PRA"

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_14

    .line 256
    .line 257
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 258
    .line 259
    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    const-string v5, "journal_mode"

    .line 267
    .line 268
    const-string v6, ""

    .line 269
    .line 270
    invoke-static {v0, v5, v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    const-string v5, "="

    .line 275
    .line 276
    invoke-static {v0, v5, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_14

    .line 281
    .line 282
    sget-object v1, La/hfk0;->c:La/hfk0;

    .line 283
    .line 284
    :cond_14
    if-eqz v1, :cond_15

    .line 285
    .line 286
    new-instance v0, La/xkn0;

    .line 287
    .line 288
    new-instance v1, La/ykn0;

    .line 289
    .line 290
    invoke-direct {v1, p0, p1}, La/ykn0;-><init>(La/w7r;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, p0, p1, v1}, La/xkn0;-><init>(La/w7r;Ljava/lang/String;La/ykn0;)V

    .line 294
    .line 295
    .line 296
    return-object v0

    .line 297
    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    const v1, 0x1367f

    .line 302
    .line 303
    .line 304
    if-eq v0, v1, :cond_18

    .line 305
    .line 306
    const v1, 0x1403a

    .line 307
    .line 308
    .line 309
    if-eq v0, v1, :cond_17

    .line 310
    .line 311
    const v1, 0x14fc2

    .line 312
    .line 313
    .line 314
    if-eq v0, v1, :cond_16

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_16
    const-string v0, "WIT"

    .line 318
    .line 319
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_19

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_17
    const-string v0, "SEL"

    .line 327
    .line 328
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-nez v0, :cond_19

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_18
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_1a

    .line 340
    .line 341
    :cond_19
    new-instance v0, La/ykn0;

    .line 342
    .line 343
    invoke-direct {v0, p0, p1}, La/ykn0;-><init>(La/w7r;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :cond_1a
    :goto_8
    new-instance v0, La/xkn0;

    .line 348
    .line 349
    invoke-direct {v0, p0, p1}, La/xkn0;-><init>(La/w7r;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    return-object v0

    .line 353
    :cond_1b
    const/16 p0, 0x15

    .line 354
    .line 355
    const-string p1, "connection is closed"

    .line 356
    .line 357
    invoke-static {p0, p1}, La/m2x;->J(ILjava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v1

    .line 361
    :sswitch_data_0
    .sparse-switch
        0x10064 -> :sswitch_3
        0x10561 -> :sswitch_2
        0x10cbb -> :sswitch_1
        0x13daf -> :sswitch_0
    .end sparse-switch
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/nkn0;->a:La/w7r;

    .line 2
    .line 3
    invoke-virtual {p0}, La/w7r;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
