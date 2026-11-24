.class public final La/jko;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/ArrayList;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/jko;->b:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/jko;->c:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/jko;->d:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    new-instance v0, La/hko;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, La/hko;-><init>(B)V

    .line 29
    .line 30
    .line 31
    iput v1, v0, La/hko;->b:I

    .line 32
    .line 33
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/jko;->e:Ljava/util/ArrayList;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/hko;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, La/hko;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, v0, La/hko;->b:I

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/jko;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/util/Pair;
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, -0x1

    .line 23
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v7, ","

    .line 28
    .line 29
    invoke-virtual {p0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x1

    .line 35
    if-eqz v8, :cond_9

    .line 36
    .line 37
    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    aget-object v0, p0, v9

    .line 42
    .line 43
    invoke-static {v0}, La/jko;->a(Ljava/lang/String;)Landroid/util/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ne v1, v3, :cond_0

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_0
    :goto_0
    array-length v1, p0

    .line 59
    if-ge v10, v1, :cond_8

    .line 60
    .line 61
    aget-object v1, p0, v10

    .line 62
    .line 63
    invoke-static {v1}, La/jko;->a(Ljava/lang/String;)Landroid/util/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/lang/Integer;

    .line 70
    .line 71
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Ljava/lang/Integer;

    .line 82
    .line 83
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move v2, v5

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    :goto_1
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_2
    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eq v3, v5, :cond_4

    .line 111
    .line 112
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Ljava/lang/Integer;

    .line 115
    .line 116
    iget-object v7, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v3, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Ljava/lang/Integer;

    .line 127
    .line 128
    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    :cond_3
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    move v1, v5

    .line 146
    :goto_3
    if-ne v2, v5, :cond_5

    .line 147
    .line 148
    if-ne v1, v5, :cond_5

    .line 149
    .line 150
    new-instance p0, Landroid/util/Pair;

    .line 151
    .line 152
    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_5
    if-ne v2, v5, :cond_6

    .line 157
    .line 158
    new-instance v0, Landroid/util/Pair;

    .line 159
    .line 160
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    if-ne v1, v5, :cond_7

    .line 169
    .line 170
    new-instance v0, Landroid/util/Pair;

    .line 171
    .line 172
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_8
    return-object v0

    .line 183
    :cond_9
    const-string v7, "/"

    .line 184
    .line 185
    invoke-virtual {p0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    const-wide/16 v11, 0x0

    .line 190
    .line 191
    if-eqz v8, :cond_f

    .line 192
    .line 193
    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    array-length v0, p0

    .line 198
    if-ne v0, v3, :cond_e

    .line 199
    .line 200
    :try_start_0
    aget-object v0, p0, v9

    .line 201
    .line 202
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    double-to-long v7, v7

    .line 207
    aget-object p0, p0, v10

    .line 208
    .line 209
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 210
    .line 211
    .line 212
    move-result-wide v9

    .line 213
    double-to-long v9, v9

    .line 214
    cmp-long p0, v7, v11

    .line 215
    .line 216
    if-ltz p0, :cond_d

    .line 217
    .line 218
    cmp-long p0, v9, v11

    .line 219
    .line 220
    if-gez p0, :cond_a

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    const-wide/32 v11, 0x7fffffff

    .line 224
    .line 225
    .line 226
    cmp-long p0, v7, v11

    .line 227
    .line 228
    if-gtz p0, :cond_c

    .line 229
    .line 230
    cmp-long p0, v9, v11

    .line 231
    .line 232
    if-lez p0, :cond_b

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_b
    new-instance p0, Landroid/util/Pair;

    .line 236
    .line 237
    invoke-direct {p0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object p0

    .line 241
    :cond_c
    :goto_5
    new-instance p0, Landroid/util/Pair;

    .line 242
    .line 243
    invoke-direct {p0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    return-object p0

    .line 247
    :cond_d
    :goto_6
    new-instance p0, Landroid/util/Pair;

    .line 248
    .line 249
    invoke-direct {p0, v2, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    .line 251
    .line 252
    return-object p0

    .line 253
    :catch_0
    :cond_e
    new-instance p0, Landroid/util/Pair;

    .line 254
    .line 255
    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    return-object p0

    .line 259
    :cond_f
    :try_start_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    cmp-long v3, v1, v11

    .line 264
    .line 265
    if-ltz v3, :cond_10

    .line 266
    .line 267
    const-wide/32 v7, 0xffff

    .line 268
    .line 269
    .line 270
    cmp-long v1, v1, v7

    .line 271
    .line 272
    if-gtz v1, :cond_10

    .line 273
    .line 274
    new-instance v1, Landroid/util/Pair;

    .line 275
    .line 276
    const/4 v2, 0x3

    .line 277
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v1

    .line 285
    :cond_10
    if-gez v3, :cond_11

    .line 286
    .line 287
    new-instance v0, Landroid/util/Pair;

    .line 288
    .line 289
    const/16 v1, 0x9

    .line 290
    .line 291
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    return-object v0

    .line 299
    :cond_11
    new-instance v1, Landroid/util/Pair;

    .line 300
    .line 301
    invoke-direct {v1, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 302
    .line 303
    .line 304
    return-object v1

    .line 305
    :catch_1
    :try_start_2
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 306
    .line 307
    .line 308
    new-instance p0, Landroid/util/Pair;

    .line 309
    .line 310
    const/16 v0, 0xc

    .line 311
    .line 312
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-direct {p0, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :catch_2
    new-instance p0, Landroid/util/Pair;

    .line 321
    .line 322
    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, p3, p1, p2}, La/jko;->c(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final c(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "/10000"

    .line 8
    .line 9
    sget-object v4, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 10
    .line 11
    const-string v5, "DateTime"

    .line 12
    .line 13
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const-string v6, " : "

    .line 18
    .line 19
    const-string v7, "Invalid value for "

    .line 20
    .line 21
    const-string v8, "ExifData"

    .line 22
    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    const-string v5, "DateTimeOriginal"

    .line 26
    .line 27
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    const-string v5, "DateTimeDigitized"

    .line 34
    .line 35
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    :cond_0
    if-eqz v2, :cond_3

    .line 42
    .line 43
    sget-object v5, La/jko;->c:Ljava/util/regex/Pattern;

    .line 44
    .line 45
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    sget-object v9, La/jko;->d:Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-virtual {v9, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    const/16 v11, 0x13

    .line 68
    .line 69
    if-ne v10, v11, :cond_2

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    if-nez v9, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    if-eqz v9, :cond_3

    .line 77
    .line 78
    const-string v5, "-"

    .line 79
    .line 80
    const-string v9, ":"

    .line 81
    .line 82
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v8, v0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    :goto_1
    const-string v5, "ISOSpeedRatings"

    .line 110
    .line 111
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    const-string v1, "PhotographicSensitivity"

    .line 118
    .line 119
    :cond_4
    const/4 v5, 0x3

    .line 120
    const/4 v9, 0x2

    .line 121
    const/4 v10, 0x1

    .line 122
    if-eqz v2, :cond_7

    .line 123
    .line 124
    sget-object v11, La/lko;->d:Ljava/util/HashSet;

    .line 125
    .line 126
    invoke-virtual {v11, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-eqz v11, :cond_7

    .line 131
    .line 132
    const-string v11, "GPSTimeStamp"

    .line 133
    .line 134
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_6

    .line 139
    .line 140
    sget-object v3, La/jko;->b:Ljava/util/regex/Pattern;

    .line 141
    .line 142
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-nez v11, :cond_5

    .line 151
    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v8, v0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v6, "/1,"

    .line 194
    .line 195
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v3, "/1"

    .line 230
    .line 231
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto :goto_2

    .line 239
    :cond_6
    :try_start_0
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 240
    .line 241
    .line 242
    move-result-wide v11

    .line 243
    const-wide v13, 0x40c3880000000000L    # 10000.0

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    mul-double/2addr v11, v13

    .line 249
    double-to-long v11, v11

    .line 250
    new-instance v13, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    goto :goto_2

    .line 266
    :catch_0
    move-exception v0

    .line 267
    invoke-static {v7, v1, v6, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-static {v8, v1, v0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_7
    :goto_2
    const/4 v3, 0x0

    .line 276
    move v6, v3

    .line 277
    :goto_3
    sget-object v7, La/lko;->b:[La/wko;

    .line 278
    .line 279
    const/4 v7, 0x4

    .line 280
    if-ge v6, v7, :cond_1b

    .line 281
    .line 282
    sget-object v7, La/jko;->e:Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    check-cast v7, Ljava/util/HashMap;

    .line 289
    .line 290
    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    check-cast v7, La/wko;

    .line 295
    .line 296
    if-eqz v7, :cond_8

    .line 297
    .line 298
    iget v8, v7, La/wko;->d:I

    .line 299
    .line 300
    iget-byte v7, v7, La/wko;->c:B

    .line 301
    .line 302
    if-nez v2, :cond_9

    .line 303
    .line 304
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    check-cast v7, Ljava/util/Map;

    .line 309
    .line 310
    invoke-interface {v7, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_8
    :goto_4
    move-object v7, v4

    .line 314
    move v13, v5

    .line 315
    move v5, v3

    .line 316
    move v3, v6

    .line 317
    move v6, v10

    .line 318
    goto/16 :goto_17

    .line 319
    .line 320
    :cond_9
    invoke-static {v2}, La/jko;->a(Ljava/lang/String;)Landroid/util/Pair;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v12, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    const/4 v13, -0x1

    .line 333
    if-eq v7, v12, :cond_c

    .line 334
    .line 335
    iget-object v12, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v12, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    if-ne v7, v12, :cond_a

    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_a
    if-eq v8, v13, :cond_b

    .line 347
    .line 348
    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v12, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    if-eq v8, v12, :cond_d

    .line 357
    .line 358
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v11, Ljava/lang/Integer;

    .line 361
    .line 362
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    if-ne v8, v11, :cond_b

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :cond_b
    if-eq v7, v10, :cond_c

    .line 370
    .line 371
    const/4 v8, 0x7

    .line 372
    if-eq v7, v8, :cond_c

    .line 373
    .line 374
    if-ne v7, v9, :cond_8

    .line 375
    .line 376
    :cond_c
    :goto_5
    move v8, v7

    .line 377
    :cond_d
    :goto_6
    const-string v7, "/"

    .line 378
    .line 379
    const-string v11, ","

    .line 380
    .line 381
    packed-switch v8, :pswitch_data_0

    .line 382
    .line 383
    .line 384
    :pswitch_0
    goto :goto_4

    .line 385
    :pswitch_1
    invoke-virtual {v2, v11, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    array-length v8, v7

    .line 390
    new-array v11, v8, [D

    .line 391
    .line 392
    move v12, v3

    .line 393
    :goto_7
    array-length v13, v7

    .line 394
    if-ge v12, v13, :cond_e

    .line 395
    .line 396
    aget-object v13, v7, v12

    .line 397
    .line 398
    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 399
    .line 400
    .line 401
    move-result-wide v13

    .line 402
    aput-wide v13, v11, v12

    .line 403
    .line 404
    add-int/lit8 v12, v12, 0x1

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_e
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, Ljava/util/Map;

    .line 412
    .line 413
    sget-object v12, La/gko;->f:[I

    .line 414
    .line 415
    const/16 v13, 0xc

    .line 416
    .line 417
    aget v12, v12, v13

    .line 418
    .line 419
    mul-int/2addr v12, v8

    .line 420
    new-array v12, v12, [B

    .line 421
    .line 422
    invoke-static {v12}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    invoke-virtual {v12, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 427
    .line 428
    .line 429
    move v14, v3

    .line 430
    :goto_8
    if-ge v14, v8, :cond_f

    .line 431
    .line 432
    move/from16 p0, v10

    .line 433
    .line 434
    move-object/from16 p2, v11

    .line 435
    .line 436
    aget-wide v10, p2, v14

    .line 437
    .line 438
    invoke-virtual {v12, v10, v11}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 439
    .line 440
    .line 441
    add-int/lit8 v14, v14, 0x1

    .line 442
    .line 443
    move/from16 v10, p0

    .line 444
    .line 445
    move-object/from16 v11, p2

    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_f
    move/from16 p0, v10

    .line 449
    .line 450
    new-instance v10, La/gko;

    .line 451
    .line 452
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->array()[B

    .line 453
    .line 454
    .line 455
    move-result-object v11

    .line 456
    invoke-direct {v10, v11, v13, v8}, La/gko;-><init>([BII)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v7, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    :goto_9
    move-object v7, v4

    .line 463
    move v13, v5

    .line 464
    move v5, v3

    .line 465
    move v3, v6

    .line 466
    :goto_a
    move/from16 v6, p0

    .line 467
    .line 468
    goto/16 :goto_17

    .line 469
    .line 470
    :pswitch_2
    move/from16 p0, v10

    .line 471
    .line 472
    invoke-virtual {v2, v11, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    array-length v10, v8

    .line 477
    new-array v11, v10, [La/br8;

    .line 478
    .line 479
    move v12, v3

    .line 480
    :goto_b
    array-length v14, v8

    .line 481
    if-ge v12, v14, :cond_10

    .line 482
    .line 483
    aget-object v14, v8, v12

    .line 484
    .line 485
    invoke-virtual {v14, v7, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v14

    .line 489
    new-instance v15, La/br8;

    .line 490
    .line 491
    aget-object v16, v14, v3

    .line 492
    .line 493
    move-object/from16 p3, v14

    .line 494
    .line 495
    invoke-static/range {v16 .. v16}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 496
    .line 497
    .line 498
    move-result-wide v13

    .line 499
    double-to-long v13, v13

    .line 500
    aget-object v16, p3, p0

    .line 501
    .line 502
    move/from16 v21, v10

    .line 503
    .line 504
    invoke-static/range {v16 .. v16}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 505
    .line 506
    .line 507
    move-result-wide v9

    .line 508
    double-to-long v9, v9

    .line 509
    const/16 v16, 0x3

    .line 510
    .line 511
    move-wide/from16 v19, v9

    .line 512
    .line 513
    move-wide/from16 v17, v13

    .line 514
    .line 515
    invoke-direct/range {v15 .. v20}, La/br8;-><init>(BJJ)V

    .line 516
    .line 517
    .line 518
    aput-object v15, v11, v12

    .line 519
    .line 520
    add-int/lit8 v12, v12, 0x1

    .line 521
    .line 522
    move/from16 v10, v21

    .line 523
    .line 524
    const/4 v9, 0x2

    .line 525
    const/4 v13, -0x1

    .line 526
    goto :goto_b

    .line 527
    :cond_10
    move/from16 v21, v10

    .line 528
    .line 529
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    check-cast v7, Ljava/util/Map;

    .line 534
    .line 535
    sget-object v8, La/gko;->f:[I

    .line 536
    .line 537
    const/16 v9, 0xa

    .line 538
    .line 539
    aget v8, v8, v9

    .line 540
    .line 541
    mul-int v8, v8, v21

    .line 542
    .line 543
    new-array v8, v8, [B

    .line 544
    .line 545
    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 550
    .line 551
    .line 552
    move v12, v3

    .line 553
    :goto_c
    if-ge v12, v10, :cond_11

    .line 554
    .line 555
    aget-object v13, v11, v12

    .line 556
    .line 557
    iget-wide v14, v13, La/br8;->b:J

    .line 558
    .line 559
    long-to-int v14, v14

    .line 560
    invoke-virtual {v8, v14}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 561
    .line 562
    .line 563
    iget-wide v13, v13, La/br8;->c:J

    .line 564
    .line 565
    long-to-int v13, v13

    .line 566
    invoke-virtual {v8, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 567
    .line 568
    .line 569
    add-int/lit8 v12, v12, 0x1

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_11
    new-instance v11, La/gko;

    .line 573
    .line 574
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    invoke-direct {v11, v8, v9, v10}, La/gko;-><init>([BII)V

    .line 579
    .line 580
    .line 581
    invoke-interface {v7, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    :goto_d
    const/4 v9, 0x2

    .line 585
    goto :goto_9

    .line 586
    :pswitch_3
    move/from16 p0, v10

    .line 587
    .line 588
    move v7, v13

    .line 589
    invoke-virtual {v2, v11, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    array-length v8, v7

    .line 594
    new-array v9, v8, [I

    .line 595
    .line 596
    move v10, v3

    .line 597
    :goto_e
    array-length v11, v7

    .line 598
    if-ge v10, v11, :cond_12

    .line 599
    .line 600
    aget-object v11, v7, v10

    .line 601
    .line 602
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 603
    .line 604
    .line 605
    move-result v11

    .line 606
    aput v11, v9, v10

    .line 607
    .line 608
    add-int/lit8 v10, v10, 0x1

    .line 609
    .line 610
    goto :goto_e

    .line 611
    :cond_12
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    check-cast v7, Ljava/util/Map;

    .line 616
    .line 617
    sget-object v10, La/gko;->f:[I

    .line 618
    .line 619
    const/16 v11, 0x9

    .line 620
    .line 621
    aget v10, v10, v11

    .line 622
    .line 623
    mul-int/2addr v10, v8

    .line 624
    new-array v10, v10, [B

    .line 625
    .line 626
    invoke-static {v10}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 627
    .line 628
    .line 629
    move-result-object v10

    .line 630
    invoke-virtual {v10, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 631
    .line 632
    .line 633
    move v12, v3

    .line 634
    :goto_f
    if-ge v12, v8, :cond_13

    .line 635
    .line 636
    aget v13, v9, v12

    .line 637
    .line 638
    invoke-virtual {v10, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 639
    .line 640
    .line 641
    add-int/lit8 v12, v12, 0x1

    .line 642
    .line 643
    goto :goto_f

    .line 644
    :cond_13
    new-instance v9, La/gko;

    .line 645
    .line 646
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    .line 647
    .line 648
    .line 649
    move-result-object v10

    .line 650
    invoke-direct {v9, v10, v11, v8}, La/gko;-><init>([BII)V

    .line 651
    .line 652
    .line 653
    invoke-interface {v7, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    goto :goto_d

    .line 657
    :pswitch_4
    move/from16 p0, v10

    .line 658
    .line 659
    move v8, v13

    .line 660
    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    array-length v10, v9

    .line 665
    new-array v11, v10, [La/br8;

    .line 666
    .line 667
    move v12, v3

    .line 668
    :goto_10
    array-length v13, v9

    .line 669
    if-ge v12, v13, :cond_14

    .line 670
    .line 671
    aget-object v13, v9, v12

    .line 672
    .line 673
    invoke-virtual {v13, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v13

    .line 677
    new-instance v14, La/br8;

    .line 678
    .line 679
    aget-object v8, v13, v3

    .line 680
    .line 681
    move-object/from16 v20, v4

    .line 682
    .line 683
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 684
    .line 685
    .line 686
    move-result-wide v3

    .line 687
    double-to-long v3, v3

    .line 688
    aget-object v8, v13, p0

    .line 689
    .line 690
    move v13, v5

    .line 691
    move/from16 v22, v6

    .line 692
    .line 693
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 694
    .line 695
    .line 696
    move-result-wide v5

    .line 697
    double-to-long v5, v5

    .line 698
    const/4 v15, 0x3

    .line 699
    move-wide/from16 v16, v3

    .line 700
    .line 701
    move-wide/from16 v18, v5

    .line 702
    .line 703
    invoke-direct/range {v14 .. v19}, La/br8;-><init>(BJJ)V

    .line 704
    .line 705
    .line 706
    aput-object v14, v11, v12

    .line 707
    .line 708
    add-int/lit8 v12, v12, 0x1

    .line 709
    .line 710
    move v5, v13

    .line 711
    move-object/from16 v4, v20

    .line 712
    .line 713
    move/from16 v6, v22

    .line 714
    .line 715
    const/4 v3, 0x0

    .line 716
    const/4 v8, -0x1

    .line 717
    goto :goto_10

    .line 718
    :cond_14
    move-object/from16 v20, v4

    .line 719
    .line 720
    move v13, v5

    .line 721
    move v3, v6

    .line 722
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    check-cast v4, Ljava/util/Map;

    .line 727
    .line 728
    sget-object v5, La/gko;->f:[I

    .line 729
    .line 730
    const/4 v6, 0x5

    .line 731
    aget v5, v5, v6

    .line 732
    .line 733
    mul-int/2addr v5, v10

    .line 734
    new-array v5, v5, [B

    .line 735
    .line 736
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    move-object/from16 v7, v20

    .line 741
    .line 742
    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 743
    .line 744
    .line 745
    const/4 v8, 0x0

    .line 746
    :goto_11
    if-ge v8, v10, :cond_15

    .line 747
    .line 748
    aget-object v9, v11, v8

    .line 749
    .line 750
    iget-wide v14, v9, La/br8;->b:J

    .line 751
    .line 752
    long-to-int v12, v14

    .line 753
    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 754
    .line 755
    .line 756
    iget-wide v14, v9, La/br8;->c:J

    .line 757
    .line 758
    long-to-int v9, v14

    .line 759
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 760
    .line 761
    .line 762
    add-int/lit8 v8, v8, 0x1

    .line 763
    .line 764
    goto :goto_11

    .line 765
    :cond_15
    new-instance v8, La/gko;

    .line 766
    .line 767
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 768
    .line 769
    .line 770
    move-result-object v5

    .line 771
    invoke-direct {v8, v5, v6, v10}, La/gko;-><init>([BII)V

    .line 772
    .line 773
    .line 774
    invoke-interface {v4, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    :goto_12
    const/4 v5, 0x0

    .line 778
    const/4 v9, 0x2

    .line 779
    goto/16 :goto_a

    .line 780
    .line 781
    :pswitch_5
    move-object v7, v4

    .line 782
    move v3, v6

    .line 783
    move/from16 p0, v10

    .line 784
    .line 785
    move v8, v13

    .line 786
    move v13, v5

    .line 787
    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v4

    .line 791
    array-length v5, v4

    .line 792
    new-array v5, v5, [J

    .line 793
    .line 794
    const/4 v6, 0x0

    .line 795
    :goto_13
    array-length v8, v4

    .line 796
    if-ge v6, v8, :cond_16

    .line 797
    .line 798
    aget-object v8, v4, v6

    .line 799
    .line 800
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 801
    .line 802
    .line 803
    move-result-wide v8

    .line 804
    aput-wide v8, v5, v6

    .line 805
    .line 806
    add-int/lit8 v6, v6, 0x1

    .line 807
    .line 808
    goto :goto_13

    .line 809
    :cond_16
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    check-cast v4, Ljava/util/Map;

    .line 814
    .line 815
    invoke-static {v5, v7}, La/gko;->b([JLjava/nio/ByteOrder;)La/gko;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    goto :goto_12

    .line 823
    :pswitch_6
    move-object v7, v4

    .line 824
    move v3, v6

    .line 825
    move/from16 p0, v10

    .line 826
    .line 827
    move v8, v13

    .line 828
    move v13, v5

    .line 829
    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v4

    .line 833
    array-length v5, v4

    .line 834
    new-array v6, v5, [I

    .line 835
    .line 836
    const/4 v8, 0x0

    .line 837
    :goto_14
    array-length v9, v4

    .line 838
    if-ge v8, v9, :cond_17

    .line 839
    .line 840
    aget-object v9, v4, v8

    .line 841
    .line 842
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 843
    .line 844
    .line 845
    move-result v9

    .line 846
    aput v9, v6, v8

    .line 847
    .line 848
    add-int/lit8 v8, v8, 0x1

    .line 849
    .line 850
    goto :goto_14

    .line 851
    :cond_17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    check-cast v4, Ljava/util/Map;

    .line 856
    .line 857
    sget-object v8, La/gko;->f:[I

    .line 858
    .line 859
    aget v8, v8, v13

    .line 860
    .line 861
    mul-int/2addr v8, v5

    .line 862
    new-array v8, v8, [B

    .line 863
    .line 864
    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 865
    .line 866
    .line 867
    move-result-object v8

    .line 868
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 869
    .line 870
    .line 871
    const/4 v9, 0x0

    .line 872
    :goto_15
    if-ge v9, v5, :cond_18

    .line 873
    .line 874
    aget v10, v6, v9

    .line 875
    .line 876
    int-to-short v10, v10

    .line 877
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 878
    .line 879
    .line 880
    add-int/lit8 v9, v9, 0x1

    .line 881
    .line 882
    goto :goto_15

    .line 883
    :cond_18
    new-instance v6, La/gko;

    .line 884
    .line 885
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 886
    .line 887
    .line 888
    move-result-object v8

    .line 889
    invoke-direct {v6, v8, v13, v5}, La/gko;-><init>([BII)V

    .line 890
    .line 891
    .line 892
    invoke-interface {v4, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    goto :goto_12

    .line 896
    :pswitch_7
    move-object v7, v4

    .line 897
    move v13, v5

    .line 898
    move v3, v6

    .line 899
    move/from16 p0, v10

    .line 900
    .line 901
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v4

    .line 905
    check-cast v4, Ljava/util/Map;

    .line 906
    .line 907
    sget-object v5, La/gko;->d:Ljava/nio/charset/Charset;

    .line 908
    .line 909
    const-string v5, "\u0000"

    .line 910
    .line 911
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v5

    .line 915
    sget-object v6, La/gko;->d:Ljava/nio/charset/Charset;

    .line 916
    .line 917
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    new-instance v6, La/gko;

    .line 922
    .line 923
    array-length v8, v5

    .line 924
    const/4 v9, 0x2

    .line 925
    invoke-direct {v6, v5, v9, v8}, La/gko;-><init>([BII)V

    .line 926
    .line 927
    .line 928
    invoke-interface {v4, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    const/4 v5, 0x0

    .line 932
    goto/16 :goto_a

    .line 933
    .line 934
    :pswitch_8
    move-object v7, v4

    .line 935
    move v13, v5

    .line 936
    move v3, v6

    .line 937
    move/from16 p0, v10

    .line 938
    .line 939
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v4

    .line 943
    check-cast v4, Ljava/util/Map;

    .line 944
    .line 945
    sget-object v5, La/gko;->d:Ljava/nio/charset/Charset;

    .line 946
    .line 947
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 948
    .line 949
    .line 950
    move-result v5

    .line 951
    move/from16 v6, p0

    .line 952
    .line 953
    if-ne v5, v6, :cond_19

    .line 954
    .line 955
    const/4 v5, 0x0

    .line 956
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 957
    .line 958
    .line 959
    move-result v8

    .line 960
    const/16 v10, 0x30

    .line 961
    .line 962
    if-lt v8, v10, :cond_1a

    .line 963
    .line 964
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 965
    .line 966
    .line 967
    move-result v8

    .line 968
    const/16 v11, 0x31

    .line 969
    .line 970
    if-gt v8, v11, :cond_1a

    .line 971
    .line 972
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 973
    .line 974
    .line 975
    move-result v8

    .line 976
    sub-int/2addr v8, v10

    .line 977
    int-to-byte v8, v8

    .line 978
    new-array v10, v6, [B

    .line 979
    .line 980
    aput-byte v8, v10, v5

    .line 981
    .line 982
    new-instance v8, La/gko;

    .line 983
    .line 984
    invoke-direct {v8, v10, v6, v6}, La/gko;-><init>([BII)V

    .line 985
    .line 986
    .line 987
    goto :goto_16

    .line 988
    :cond_19
    const/4 v5, 0x0

    .line 989
    :cond_1a
    sget-object v8, La/gko;->d:Ljava/nio/charset/Charset;

    .line 990
    .line 991
    invoke-virtual {v2, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 992
    .line 993
    .line 994
    move-result-object v8

    .line 995
    new-instance v10, La/gko;

    .line 996
    .line 997
    array-length v11, v8

    .line 998
    invoke-direct {v10, v8, v6, v11}, La/gko;-><init>([BII)V

    .line 999
    .line 1000
    .line 1001
    move-object v8, v10

    .line 1002
    :goto_16
    invoke-interface {v4, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    :goto_17
    add-int/lit8 v3, v3, 0x1

    .line 1006
    .line 1007
    move v10, v6

    .line 1008
    move-object v4, v7

    .line 1009
    move v6, v3

    .line 1010
    move v3, v5

    .line 1011
    move v5, v13

    .line 1012
    goto/16 :goto_3

    .line 1013
    .line 1014
    :cond_1b
    return-void

    .line 1015
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final d(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/16 v0, 0x5a

    .line 4
    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    const/16 v0, 0xb4

    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x10e

    .line 12
    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Unexpected orientation value: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ". Must be one of 0, 90, 180, 270."

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "ExifData"

    .line 35
    .line 36
    invoke-static {v0, p1}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/16 p1, 0x8

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p1, 0x3

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p1, 0x6

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const/4 p1, 0x1

    .line 49
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, La/jko;->a:Ljava/util/ArrayList;

    .line 54
    .line 55
    const-string v1, "Orientation"

    .line 56
    .line 57
    invoke-virtual {p0, v0, v1, p1}, La/jko;->c(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
