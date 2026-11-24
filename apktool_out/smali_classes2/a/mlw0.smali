.class public abstract La/mlw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;

.field public static final c:La/gft0;

.field public static final d:Z

.field public static final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    invoke-static {}, La/mlw0;->e()Lsun/misc/Unsafe;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, La/mlw0;->a:Lsun/misc/Unsafe;

    .line 6
    .line 7
    sget-object v1, La/pjw0;->a:Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v1, La/mlw0;->b:Ljava/lang/Class;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {v1}, La/mlw0;->l(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v3}, La/mlw0;->l(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v2, La/llw0;

    .line 30
    .line 31
    invoke-direct {v2, v0, v5}, La/llw0;-><init>(Lsun/misc/Unsafe;B)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-eqz v4, :cond_1

    .line 36
    .line 37
    new-instance v2, La/llw0;

    .line 38
    .line 39
    invoke-direct {v2, v0, v6}, La/llw0;-><init>(Lsun/misc/Unsafe;B)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    :goto_0
    sput-object v2, La/mlw0;->c:La/gft0;

    .line 45
    .line 46
    const-string v0, "platform method missing - proto runtime falling back to safer methods: "

    .line 47
    .line 48
    const-string v4, "logMissingMethod"

    .line 49
    .line 50
    const-string v7, "com.google.protobuf.UnsafeUtil"

    .line 51
    .line 52
    const-class v8, La/mlw0;

    .line 53
    .line 54
    const-class v9, Ljava/lang/Object;

    .line 55
    .line 56
    const-string v10, "getLong"

    .line 57
    .line 58
    const-class v11, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    const-string v12, "objectFieldOffset"

    .line 61
    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object v2, v2, La/gft0;->b:Lsun/misc/Unsafe;

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    invoke-virtual {v2, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    filled-new-array {v9, v1}, [Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-virtual {v2, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    invoke-static {}, La/mlw0;->i()Ljava/lang/reflect/Field;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v2

    .line 93
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    invoke-static {v13}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    sget-object v14, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v13, v14, v7, v4, v2}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object v2, La/mlw0;->c:La/gft0;

    .line 115
    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    :goto_2
    move v0, v6

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    iget-object v2, v2, La/gft0;->b:Lsun/misc/Unsafe;

    .line 121
    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-virtual {v2, v12, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    const-string v11, "arrayBaseOffset"

    .line 137
    .line 138
    const-class v12, Ljava/lang/Class;

    .line 139
    .line 140
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    invoke-virtual {v2, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    const-string v11, "arrayIndexScale"

    .line 148
    .line 149
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-virtual {v2, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 154
    .line 155
    .line 156
    const-string v11, "getInt"

    .line 157
    .line 158
    filled-new-array {v9, v1}, [Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    invoke-virtual {v2, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    const-string v11, "putInt"

    .line 166
    .line 167
    filled-new-array {v9, v1, v3}, [Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v2, v11, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 172
    .line 173
    .line 174
    filled-new-array {v9, v1}, [Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v2, v10, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 179
    .line 180
    .line 181
    const-string v3, "putLong"

    .line 182
    .line 183
    filled-new-array {v9, v1, v1}, [Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v2, v3, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 188
    .line 189
    .line 190
    const-string v3, "getObject"

    .line 191
    .line 192
    filled-new-array {v9, v1}, [Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v2, v3, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    const-string v3, "putObject"

    .line 200
    .line 201
    filled-new-array {v9, v1, v9}, [Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    .line 207
    .line 208
    move v0, v5

    .line 209
    goto :goto_3

    .line 210
    :catchall_1
    move-exception v1

    .line 211
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 220
    .line 221
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v2, v3, v7, v4, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :goto_3
    sput-boolean v0, La/mlw0;->d:Z

    .line 234
    .line 235
    const-class v0, [B

    .line 236
    .line 237
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 238
    .line 239
    .line 240
    const-class v0, [Z

    .line 241
    .line 242
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 246
    .line 247
    .line 248
    const-class v0, [I

    .line 249
    .line 250
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 254
    .line 255
    .line 256
    const-class v0, [J

    .line 257
    .line 258
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 262
    .line 263
    .line 264
    const-class v0, [F

    .line 265
    .line 266
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 270
    .line 271
    .line 272
    const-class v0, [D

    .line 273
    .line 274
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 278
    .line 279
    .line 280
    const-class v0, [Ljava/lang/Object;

    .line 281
    .line 282
    invoke-static {v0}, La/mlw0;->f(Ljava/lang/Class;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v0}, La/mlw0;->j(Ljava/lang/Class;)V

    .line 286
    .line 287
    .line 288
    invoke-static {}, La/mlw0;->i()Ljava/lang/reflect/Field;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_7

    .line 293
    .line 294
    sget-object v1, La/mlw0;->c:La/gft0;

    .line 295
    .line 296
    if-nez v1, :cond_6

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_6
    iget-object v1, v1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 300
    .line 301
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 302
    .line 303
    .line 304
    :cond_7
    :goto_4
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 309
    .line 310
    if-ne v0, v1, :cond_8

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_8
    move v5, v6

    .line 314
    :goto_5
    sput-boolean v5, La/mlw0;->e:Z

    .line 315
    .line 316
    return-void
.end method

.method public static a(Ljava/lang/Object;IJ)V
    .locals 1

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p2, p3, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static b(Ljava/lang/Object;JJ)V
    .locals 7

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v1, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    move-object v2, p0

    .line 6
    move-wide v3, p1

    .line 7
    move-wide v5, p3

    .line 8
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static c(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;JZ)V
    .locals 4

    .line 1
    int-to-byte p3, p3

    .line 2
    const-wide/16 v0, -0x4

    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    invoke-static {p0, v0, v1}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    long-to-int p1, p1

    .line 10
    not-int p1, p1

    .line 11
    and-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    const/16 p2, 0xff

    .line 16
    .line 17
    shl-int v3, p2, p1

    .line 18
    .line 19
    not-int v3, v3

    .line 20
    and-int/2addr v2, v3

    .line 21
    and-int/2addr p2, p3

    .line 22
    shl-int p1, p2, p1

    .line 23
    .line 24
    or-int/2addr p1, v2

    .line 25
    invoke-static {p0, p1, v0, v1}, La/mlw0;->a(Ljava/lang/Object;IJ)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static e()Lsun/misc/Unsafe;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, La/cft0;

    .line 3
    .line 4
    const/4 v2, 0x4

    .line 5
    invoke-direct {v1, v2}, La/cft0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-object v1, v0

    .line 16
    :goto_0
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    :try_start_1
    const-class v2, [B

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :catch_0
    const-class v1, La/mlw0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 36
    .line 37
    const-string v3, "getUnsafe"

    .line 38
    .line 39
    const-string v4, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely."

    .line 40
    .line 41
    const-string v5, "com.google.protobuf.UnsafeUtil"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v5, v3, v4}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public static f(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, La/mlw0;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 6
    .line 7
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic g(Ljava/lang/Object;JZ)V
    .locals 4

    .line 1
    int-to-byte p3, p3

    .line 2
    const-wide/16 v0, -0x4

    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    invoke-static {p0, v0, v1}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    long-to-int p1, p1

    .line 10
    and-int/lit8 p1, p1, 0x3

    .line 11
    .line 12
    shl-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    const/16 p2, 0xff

    .line 15
    .line 16
    shl-int v3, p2, p1

    .line 17
    .line 18
    not-int v3, v3

    .line 19
    and-int/2addr v2, v3

    .line 20
    and-int/2addr p2, p3

    .line 21
    shl-int p1, p2, p1

    .line 22
    .line 23
    or-int/2addr p1, v2

    .line 24
    invoke-static {p0, p1, v0, v1}, La/mlw0;->a(Ljava/lang/Object;IJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static h(Ljava/lang/Object;J)I
    .locals 1

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static i()Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    const-class v0, Ljava/nio/Buffer;

    .line 2
    .line 3
    const-string v1, "effectiveDirectAddress"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-object v1, v2

    .line 12
    :goto_0
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const-string v1, "address"

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    goto :goto_1

    .line 22
    :catchall_1
    move-object v0, v2

    .line 23
    :goto_1
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne v1, v3, :cond_1

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    return-object v2
.end method

.method public static j(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, La/mlw0;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 6
    .line 7
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static k(Ljava/lang/Object;J)J
    .locals 1

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public static l(Ljava/lang/Class;)Z
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, La/mlw0;->b:Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "peekLong"

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    filled-new-array {p0, v2}, [Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    const-string v1, "pokeLong"

    .line 15
    .line 16
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    filled-new-array {p0, v3, v2}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    const-string v1, "pokeInt"

    .line 26
    .line 27
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    filled-new-array {p0, v3, v2}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    const-string v1, "peekInt"

    .line 37
    .line 38
    filled-new-array {p0, v2}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    const-string v1, "pokeByte"

    .line 46
    .line 47
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    filled-new-array {p0, v2}, [Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    const-string v1, "peekByte"

    .line 57
    .line 58
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    const-string v1, "pokeByteArray"

    .line 66
    .line 67
    const-class v2, [B

    .line 68
    .line 69
    filled-new-array {p0, v2, v3, v3}, [Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    const-string v1, "peekByteArray"

    .line 77
    .line 78
    filled-new-array {p0, v2, v3, v3}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, v1, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :catchall_0
    const/4 p0, 0x0

    .line 88
    return p0
.end method

.method public static m(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, La/mlw0;->c:La/gft0;

    .line 2
    .line 3
    iget-object v0, v0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
