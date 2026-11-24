.class public final La/osj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:I

.field public E:I

.field public F:J

.field public G:Z

.field public H:Z

.field public I:J

.field public J:J

.field public K:F

.field public L:Ljava/nio/ByteBuffer;

.field public M:I

.field public N:Ljava/nio/ByteBuffer;

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:I

.field public U:Z

.field public V:La/y55;

.field public W:Landroid/media/AudioDeviceInfo;

.field public X:I

.field public Y:Z

.field public Z:J

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public final b:La/khf0;

.field public b0:Z

.field public final c:La/wtb;

.field public c0:J

.field public final d:La/ors0;

.field public d0:J

.field public final e:La/ytq0;

.field public e0:Landroid/os/Handler;

.field public final f:La/ytq0;

.field public final g:La/rcf0;

.field public final h:Ljava/util/ArrayDeque;

.field public i:B

.field public j:La/ksj;

.field public final k:La/dr8;

.field public final l:La/dr8;

.field public m:La/a4a0;

.field public n:La/yox;

.field public o:La/msj;

.field public p:La/msj;

.field public q:La/p34;

.field public r:La/n44;

.field public s:La/jsj;

.field public t:La/l44;

.field public u:La/m24;

.field public v:La/nsj;

.field public w:La/nsj;

.field public x:La/zx90;

.field public y:Z

.field public z:J


# direct methods
.method public constructor <init>(La/lsj;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/lsj;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    iput-object v1, p0, La/osj;->a:Landroid/content/Context;

    .line 17
    .line 18
    sget-object v1, La/m24;->b:La/m24;

    .line 19
    .line 20
    iput-object v1, p0, La/osj;->u:La/m24;

    .line 21
    .line 22
    iget-object v1, p1, La/lsj;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/khf0;

    .line 25
    .line 26
    iput-object v1, p0, La/osj;->b:La/khf0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-byte v1, p0, La/osj;->i:B

    .line 30
    .line 31
    iget-object p1, p1, La/lsj;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, La/n44;

    .line 34
    .line 35
    iput-object p1, p0, La/osj;->r:La/n44;

    .line 36
    .line 37
    new-instance p1, La/wtb;

    .line 38
    .line 39
    invoke-direct {p1}, La/rv5;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/osj;->c:La/wtb;

    .line 43
    .line 44
    new-instance v2, La/ors0;

    .line 45
    .line 46
    invoke-direct {v2}, La/rv5;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v3, La/vtt0;->b:[B

    .line 50
    .line 51
    iput-object v3, v2, La/ors0;->m:[B

    .line 52
    .line 53
    iput-object v2, p0, La/osj;->d:La/ors0;

    .line 54
    .line 55
    new-instance v3, La/ytq0;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v3, v4}, La/ytq0;-><init>(B)V

    .line 59
    .line 60
    .line 61
    iput-object v3, p0, La/osj;->e:La/ytq0;

    .line 62
    .line 63
    new-instance v3, La/ytq0;

    .line 64
    .line 65
    invoke-direct {v3, v1}, La/ytq0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, La/osj;->f:La/ytq0;

    .line 69
    .line 70
    invoke-static {v2, p1}, La/b4x;->v(Ljava/lang/Object;Ljava/lang/Object;)La/rcf0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, La/osj;->g:La/rcf0;

    .line 75
    .line 76
    const/high16 p1, 0x3f800000    # 1.0f

    .line 77
    .line 78
    iput p1, p0, La/osj;->K:F

    .line 79
    .line 80
    iput v1, p0, La/osj;->T:I

    .line 81
    .line 82
    new-instance p1, La/y55;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, La/osj;->V:La/y55;

    .line 88
    .line 89
    new-instance v2, La/nsj;

    .line 90
    .line 91
    sget-object v3, La/zx90;->d:La/zx90;

    .line 92
    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    const-wide/16 v6, 0x0

    .line 96
    .line 97
    invoke-direct/range {v2 .. v7}, La/nsj;-><init>(La/zx90;JJ)V

    .line 98
    .line 99
    .line 100
    iput-object v2, p0, La/osj;->w:La/nsj;

    .line 101
    .line 102
    iput-object v3, p0, La/osj;->x:La/zx90;

    .line 103
    .line 104
    iput-boolean v1, p0, La/osj;->y:Z

    .line 105
    .line 106
    new-instance p1, Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, La/osj;->h:Ljava/util/ArrayDeque;

    .line 112
    .line 113
    new-instance p1, La/dr8;

    .line 114
    .line 115
    invoke-direct {p1, p0}, La/dr8;-><init>(La/osj;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, La/osj;->k:La/dr8;

    .line 119
    .line 120
    new-instance p1, La/dr8;

    .line 121
    .line 122
    invoke-direct {p1, p0}, La/dr8;-><init>(La/osj;)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, La/osj;->l:La/dr8;

    .line 126
    .line 127
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 128
    .line 129
    const/16 v1, 0x22

    .line 130
    .line 131
    const/4 v2, -0x1

    .line 132
    if-lt p1, v1, :cond_2

    .line 133
    .line 134
    if-nez v0, :cond_1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-static {v0}, La/b03;->b(Landroid/content/Context;)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_2

    .line 142
    .line 143
    if-eq p1, v2, :cond_2

    .line 144
    .line 145
    move v2, p1

    .line 146
    :cond_2
    :goto_1
    iput v2, p0, La/osj;->X:I

    .line 147
    .line 148
    return-void
.end method

.method public static i(ILjava/nio/ByteBuffer;)I
    .locals 10

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eq p0, v0, :cond_19

    .line 8
    .line 9
    const/16 v0, 0x1e

    .line 10
    .line 11
    const/4 v5, -0x2

    .line 12
    const/4 v6, -0x1

    .line 13
    if-eq p0, v0, :cond_12

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    const/16 v7, 0xa

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    packed-switch p0, :pswitch_data_1

    .line 24
    .line 25
    .line 26
    const-string p1, "Unexpected audio encoding: "

    .line 27
    .line 28
    invoke-static {p0, p1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return v3

    .line 36
    :pswitch_0
    new-array p0, v1, [B

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    new-instance p1, La/q8b;

    .line 49
    .line 50
    invoke-direct {p1, p0, v1}, La/q8b;-><init>([BI)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, La/b34;->p0(La/q8b;)La/j6;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget p0, p0, La/j6;->c:I

    .line 58
    .line 59
    return p0

    .line 60
    :pswitch_1
    const/16 p0, 0x200

    .line 61
    .line 62
    return p0

    .line 63
    :pswitch_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sub-int/2addr v0, v7

    .line 72
    move v2, p0

    .line 73
    :goto_0
    if-gt v2, v0, :cond_2

    .line 74
    .line 75
    add-int/lit8 v7, v2, 0x4

    .line 76
    .line 77
    sget-object v8, La/vtt0;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    if-ne v8, v9, :cond_0

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_0
    invoke-static {v7}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    :goto_1
    and-int/2addr v7, v5

    .line 97
    const v8, -0x78d9046

    .line 98
    .line 99
    .line 100
    if-ne v7, v8, :cond_1

    .line 101
    .line 102
    sub-int/2addr v2, p0

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move v2, v6

    .line 108
    :goto_2
    if-ne v2, v6, :cond_3

    .line 109
    .line 110
    return v3

    .line 111
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    add-int/2addr p0, v2

    .line 116
    add-int/lit8 p0, p0, 0x7

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    and-int/lit16 p0, p0, 0xff

    .line 123
    .line 124
    const/16 v0, 0xbb

    .line 125
    .line 126
    if-ne p0, v0, :cond_4

    .line 127
    .line 128
    move v3, v4

    .line 129
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    add-int/2addr p0, v2

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    const/16 v0, 0x9

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    const/16 v0, 0x8

    .line 140
    .line 141
    :goto_3
    add-int/2addr p0, v0

    .line 142
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    shr-int/lit8 p0, p0, 0x4

    .line 147
    .line 148
    and-int/lit8 p0, p0, 0x7

    .line 149
    .line 150
    const/16 p1, 0x28

    .line 151
    .line 152
    shl-int p0, p1, p0

    .line 153
    .line 154
    mul-int/2addr p0, v1

    .line 155
    return p0

    .line 156
    :pswitch_3
    const/16 p0, 0x800

    .line 157
    .line 158
    return p0

    .line 159
    :pswitch_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 174
    .line 175
    if-ne p1, v2, :cond_6

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    :goto_4
    const/high16 p1, -0x200000

    .line 183
    .line 184
    and-int v2, p0, p1

    .line 185
    .line 186
    if-ne v2, p1, :cond_7

    .line 187
    .line 188
    ushr-int/lit8 p1, p0, 0x13

    .line 189
    .line 190
    and-int/2addr p1, v0

    .line 191
    if-ne p1, v4, :cond_8

    .line 192
    .line 193
    :cond_7
    :goto_5
    move p0, v6

    .line 194
    goto :goto_6

    .line 195
    :cond_8
    ushr-int/lit8 v2, p0, 0x11

    .line 196
    .line 197
    and-int/2addr v2, v0

    .line 198
    if-nez v2, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    ushr-int/lit8 v5, p0, 0xc

    .line 202
    .line 203
    const/16 v8, 0xf

    .line 204
    .line 205
    and-int/2addr v5, v8

    .line 206
    ushr-int/2addr p0, v7

    .line 207
    and-int/2addr p0, v0

    .line 208
    if-eqz v5, :cond_7

    .line 209
    .line 210
    if-eq v5, v8, :cond_7

    .line 211
    .line 212
    if-ne p0, v0, :cond_a

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_a
    const/16 p0, 0x480

    .line 216
    .line 217
    if-eq v2, v4, :cond_c

    .line 218
    .line 219
    if-eq v2, v1, :cond_e

    .line 220
    .line 221
    if-ne v2, v0, :cond_b

    .line 222
    .line 223
    const/16 p0, 0x180

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_b
    invoke-static {}, La/e9d0;->o()V

    .line 227
    .line 228
    .line 229
    return v3

    .line 230
    :cond_c
    if-ne p1, v0, :cond_d

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_d
    const/16 p0, 0x240

    .line 234
    .line 235
    :cond_e
    :goto_6
    if-eq p0, v6, :cond_f

    .line 236
    .line 237
    return p0

    .line 238
    :cond_f
    invoke-static {}, La/e9d0;->o()V

    .line 239
    .line 240
    .line 241
    return v3

    .line 242
    :pswitch_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    add-int/2addr p0, v2

    .line 247
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    and-int/lit16 p0, p0, 0xf8

    .line 252
    .line 253
    shr-int/2addr p0, v0

    .line 254
    if-le p0, v7, :cond_11

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    add-int/lit8 p0, p0, 0x4

    .line 261
    .line 262
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    and-int/lit16 p0, p0, 0xc0

    .line 267
    .line 268
    shr-int/lit8 p0, p0, 0x6

    .line 269
    .line 270
    if-ne p0, v0, :cond_10

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_10
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    add-int/lit8 p0, p0, 0x4

    .line 278
    .line 279
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    and-int/lit8 p0, p0, 0x30

    .line 284
    .line 285
    shr-int/lit8 v0, p0, 0x4

    .line 286
    .line 287
    :goto_7
    sget-object p0, La/ay3;->a:[I

    .line 288
    .line 289
    aget p0, p0, v0

    .line 290
    .line 291
    mul-int/lit16 p0, p0, 0x100

    .line 292
    .line 293
    return p0

    .line 294
    :cond_11
    const/16 p0, 0x600

    .line 295
    .line 296
    return p0

    .line 297
    :cond_12
    :pswitch_6
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    const v0, -0xde4bec0

    .line 302
    .line 303
    .line 304
    if-eq p0, v0, :cond_18

    .line 305
    .line 306
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    const v0, -0x17bd3b8f

    .line 311
    .line 312
    .line 313
    if-ne p0, v0, :cond_13

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_13
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    const v0, 0x25205864

    .line 321
    .line 322
    .line 323
    if-ne p0, v0, :cond_14

    .line 324
    .line 325
    const/16 p0, 0x1000

    .line 326
    .line 327
    return p0

    .line 328
    :cond_14
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eq v0, v5, :cond_17

    .line 337
    .line 338
    if-eq v0, v6, :cond_16

    .line 339
    .line 340
    const/16 v3, 0x1f

    .line 341
    .line 342
    if-eq v0, v3, :cond_15

    .line 343
    .line 344
    add-int/lit8 v0, p0, 0x4

    .line 345
    .line 346
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    and-int/2addr v0, v4

    .line 351
    shl-int/lit8 v0, v0, 0x6

    .line 352
    .line 353
    add-int/2addr p0, v2

    .line 354
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    :goto_8
    and-int/lit16 p0, p0, 0xfc

    .line 359
    .line 360
    :goto_9
    shr-int/2addr p0, v1

    .line 361
    or-int/2addr p0, v0

    .line 362
    goto :goto_b

    .line 363
    :cond_15
    add-int/lit8 v0, p0, 0x5

    .line 364
    .line 365
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    and-int/lit8 v0, v0, 0x7

    .line 370
    .line 371
    shl-int/lit8 v0, v0, 0x4

    .line 372
    .line 373
    add-int/lit8 p0, p0, 0x6

    .line 374
    .line 375
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    :goto_a
    and-int/lit8 p0, p0, 0x3c

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_16
    add-int/lit8 v0, p0, 0x4

    .line 383
    .line 384
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    and-int/lit8 v0, v0, 0x7

    .line 389
    .line 390
    shl-int/lit8 v0, v0, 0x4

    .line 391
    .line 392
    add-int/lit8 p0, p0, 0x7

    .line 393
    .line 394
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    goto :goto_a

    .line 399
    :cond_17
    add-int/lit8 v0, p0, 0x5

    .line 400
    .line 401
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    and-int/2addr v0, v4

    .line 406
    shl-int/lit8 v0, v0, 0x6

    .line 407
    .line 408
    add-int/lit8 p0, p0, 0x4

    .line 409
    .line 410
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    goto :goto_8

    .line 415
    :goto_b
    add-int/2addr p0, v4

    .line 416
    mul-int/lit8 p0, p0, 0x20

    .line 417
    .line 418
    return p0

    .line 419
    :cond_18
    :goto_c
    :pswitch_7
    const/16 p0, 0x400

    .line 420
    .line 421
    return p0

    .line 422
    :cond_19
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 423
    .line 424
    .line 425
    move-result p0

    .line 426
    and-int/2addr p0, v1

    .line 427
    if-nez p0, :cond_1a

    .line 428
    .line 429
    move v2, v3

    .line 430
    goto :goto_f

    .line 431
    :cond_1a
    const/16 p0, 0x1a

    .line 432
    .line 433
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    const/16 v0, 0x1c

    .line 438
    .line 439
    move v2, v0

    .line 440
    move v1, v3

    .line 441
    :goto_d
    if-ge v1, p0, :cond_1b

    .line 442
    .line 443
    add-int/lit8 v5, v1, 0x1b

    .line 444
    .line 445
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    add-int/2addr v2, v5

    .line 450
    add-int/lit8 v1, v1, 0x1

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_1b
    add-int/lit8 p0, v2, 0x1a

    .line 454
    .line 455
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 456
    .line 457
    .line 458
    move-result p0

    .line 459
    move v1, v3

    .line 460
    :goto_e
    if-ge v1, p0, :cond_1c

    .line 461
    .line 462
    add-int/lit8 v5, v2, 0x1b

    .line 463
    .line 464
    add-int/2addr v5, v1

    .line 465
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    add-int/2addr v0, v5

    .line 470
    add-int/lit8 v1, v1, 0x1

    .line 471
    .line 472
    goto :goto_e

    .line 473
    :cond_1c
    add-int/2addr v2, v0

    .line 474
    :goto_f
    add-int/lit8 p0, v2, 0x1a

    .line 475
    .line 476
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 477
    .line 478
    .line 479
    move-result p0

    .line 480
    add-int/lit8 p0, p0, 0x1b

    .line 481
    .line 482
    add-int/2addr p0, v2

    .line 483
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    sub-int/2addr v1, p0

    .line 492
    if-le v1, v4, :cond_1d

    .line 493
    .line 494
    add-int/2addr p0, v4

    .line 495
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    :cond_1d
    invoke-static {v0, v3}, La/zvw;->U(BB)J

    .line 500
    .line 501
    .line 502
    move-result-wide p0

    .line 503
    const-wide/32 v0, 0xbb80

    .line 504
    .line 505
    .line 506
    mul-long/2addr p0, v0

    .line 507
    const-wide/32 v0, 0xf4240

    .line 508
    .line 509
    .line 510
    div-long/2addr p0, v0

    .line 511
    long-to-int p0, p0

    .line 512
    return p0

    .line 513
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final a(J)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/osj;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, La/osj;->b:La/khf0;

    .line 8
    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    iget-boolean v0, p0, La/osj;->Y:Z

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 16
    .line 17
    invoke-virtual {v0}, La/msj;->f()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 24
    .line 25
    iget-object v0, v0, La/msj;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroidx/media3/common/b;

    .line 28
    .line 29
    iget v0, v0, Landroidx/media3/common/b;->M:I

    .line 30
    .line 31
    iget-object v0, p0, La/osj;->x:La/zx90;

    .line 32
    .line 33
    iget-object v4, v3, La/khf0;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, La/zkk0;

    .line 36
    .line 37
    iget v5, v0, La/zx90;->a:F

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    cmpl-float v7, v5, v6

    .line 41
    .line 42
    if-lez v7, :cond_0

    .line 43
    .line 44
    move v7, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v7, v2

    .line 47
    :goto_0
    invoke-static {v7}, La/x0x;->A(Z)V

    .line 48
    .line 49
    .line 50
    iget v7, v4, La/zkk0;->b:F

    .line 51
    .line 52
    cmpl-float v7, v7, v5

    .line 53
    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    iput v5, v4, La/zkk0;->b:F

    .line 57
    .line 58
    iput-boolean v1, v4, La/zkk0;->h:Z

    .line 59
    .line 60
    :cond_1
    iget v5, v0, La/zx90;->b:F

    .line 61
    .line 62
    cmpl-float v6, v5, v6

    .line 63
    .line 64
    if-lez v6, :cond_2

    .line 65
    .line 66
    move v6, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v6, v2

    .line 69
    :goto_1
    invoke-static {v6}, La/x0x;->A(Z)V

    .line 70
    .line 71
    .line 72
    iget v6, v4, La/zkk0;->c:F

    .line 73
    .line 74
    cmpl-float v6, v6, v5

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    iput v5, v4, La/zkk0;->c:F

    .line 79
    .line 80
    iput-boolean v1, v4, La/zkk0;->h:Z

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    sget-object v0, La/zx90;->d:La/zx90;

    .line 84
    .line 85
    :cond_4
    :goto_2
    iput-object v0, p0, La/osj;->x:La/zx90;

    .line 86
    .line 87
    :goto_3
    move-object v5, v0

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    sget-object v0, La/zx90;->d:La/zx90;

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :goto_4
    iget-boolean v0, p0, La/osj;->Y:Z

    .line 93
    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 97
    .line 98
    invoke-virtual {v0}, La/msj;->f()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 105
    .line 106
    iget-object v0, v0, La/msj;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroidx/media3/common/b;

    .line 109
    .line 110
    iget v0, v0, Landroidx/media3/common/b;->M:I

    .line 111
    .line 112
    iget-boolean v2, p0, La/osj;->y:Z

    .line 113
    .line 114
    iget-object v0, v3, La/khf0;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/muj0;

    .line 117
    .line 118
    iput-boolean v2, v0, La/muj0;->j:Z

    .line 119
    .line 120
    :cond_6
    iput-boolean v2, p0, La/osj;->y:Z

    .line 121
    .line 122
    new-instance v4, La/nsj;

    .line 123
    .line 124
    const-wide/16 v2, 0x0

    .line 125
    .line 126
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 131
    .line 132
    invoke-virtual {p0}, La/osj;->j()J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    iget-object v0, v0, La/msj;->e:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, La/k34;

    .line 139
    .line 140
    iget v0, v0, La/k34;->b:I

    .line 141
    .line 142
    invoke-static {v0, v2, v3}, La/vtt0;->R(IJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v8

    .line 146
    invoke-direct/range {v4 .. v9}, La/nsj;-><init>(La/zx90;JJ)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, La/osj;->h:Ljava/util/ArrayDeque;

    .line 150
    .line 151
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1, p2}, La/osj;->u(J)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, La/osj;->n:La/yox;

    .line 158
    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    iget-boolean p0, p0, La/osj;->y:Z

    .line 162
    .line 163
    iget-object p1, p1, La/yox;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, La/fm30;

    .line 166
    .line 167
    iget-object p1, p1, La/fm30;->l2:La/xex;

    .line 168
    .line 169
    iget-object p2, p1, La/xex;->a:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p2, Landroid/os/Handler;

    .line 172
    .line 173
    if-eqz p2, :cond_7

    .line 174
    .line 175
    new-instance v0, La/hp2;

    .line 176
    .line 177
    invoke-direct {v0, p1, p0, v1}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 181
    .line 182
    .line 183
    :cond_7
    return-void
.end method

.method public final b(La/k34;)La/l44;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, La/osj;->r:La/n44;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/n44;->a(La/k34;)La/l44;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch La/i34; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    move-object v8, v0

    .line 10
    new-instance v1, La/b44;

    .line 11
    .line 12
    iget v2, p1, La/k34;->b:I

    .line 13
    .line 14
    iget v3, p1, La/k34;->c:I

    .line 15
    .line 16
    iget v4, p1, La/k34;->a:I

    .line 17
    .line 18
    iget v5, p1, La/k34;->f:I

    .line 19
    .line 20
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 21
    .line 22
    iget-object v0, v0, La/msj;->c:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, v0

    .line 25
    check-cast v6, Landroidx/media3/common/b;

    .line 26
    .line 27
    iget-boolean v7, p1, La/k34;->e:Z

    .line 28
    .line 29
    invoke-direct/range {v1 .. v8}, La/b44;-><init>(IIIILandroidx/media3/common/b;ZLa/i34;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/osj;->n:La/yox;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/yox;->s(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    throw v1
.end method

.method public final c(La/z34;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/osj;->s:La/jsj;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/osj;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    new-instance v0, La/jsj;

    .line 10
    .line 11
    invoke-direct {v0, p0}, La/jsj;-><init>(La/osj;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/osj;->s:La/jsj;

    .line 15
    .line 16
    iget-object v1, p0, La/osj;->r:La/n44;

    .line 17
    .line 18
    invoke-virtual {v1}, La/n44;->f()V

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, La/n44;->e:La/vg00;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, La/vg00;

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v2, v3}, La/vg00;-><init>(Ljava/lang/Thread;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, La/n44;->e:La/vg00;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v0}, La/vg00;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v4, p1, La/z34;->a:Landroidx/media3/common/b;

    .line 40
    .line 41
    iget-object v0, v4, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 42
    .line 43
    iget v1, v4, Landroidx/media3/common/b;->J:I

    .line 44
    .line 45
    iget v2, v4, Landroidx/media3/common/b;->M:I

    .line 46
    .line 47
    const-string v3, "audio/raw"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v5, -0x1

    .line 55
    if-eqz v0, :cond_7

    .line 56
    .line 57
    invoke-static {v2}, La/vtt0;->I(I)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, La/vtt0;->q(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    mul-int/2addr v0, v1

    .line 69
    new-instance v6, La/u3x;

    .line 70
    .line 71
    const/4 v7, 0x4

    .line 72
    invoke-direct {v6, v7}, La/r3x;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object v7, p0, La/osj;->g:La/rcf0;

    .line 76
    .line 77
    invoke-virtual {v6, v7}, La/r3x;->c(Ljava/lang/Iterable;)V

    .line 78
    .line 79
    .line 80
    iget-object v7, p0, La/osj;->e:La/ytq0;

    .line 81
    .line 82
    invoke-virtual {v6, v7}, La/r3x;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v7, p0, La/osj;->b:La/khf0;

    .line 86
    .line 87
    iget-object v7, v7, La/khf0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v7, [La/u34;

    .line 90
    .line 91
    invoke-virtual {v6, v7}, La/u3x;->f([Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v7, La/p34;

    .line 95
    .line 96
    invoke-virtual {v6}, La/u3x;->g()La/rcf0;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-direct {v7, v6}, La/p34;-><init>(La/b4x;)V

    .line 101
    .line 102
    .line 103
    iget-object v6, p0, La/osj;->q:La/p34;

    .line 104
    .line 105
    invoke-virtual {v7, v6}, La/p34;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    iget-object v7, p0, La/osj;->q:La/p34;

    .line 112
    .line 113
    :cond_2
    iget v6, v4, Landroidx/media3/common/b;->N:I

    .line 114
    .line 115
    iget v8, v4, Landroidx/media3/common/b;->O:I

    .line 116
    .line 117
    iget-object v9, p0, La/osj;->d:La/ors0;

    .line 118
    .line 119
    iput v6, v9, La/ors0;->i:I

    .line 120
    .line 121
    iput v8, v9, La/ors0;->j:I

    .line 122
    .line 123
    iget-object v6, p0, La/osj;->c:La/wtb;

    .line 124
    .line 125
    iget-object v8, p1, La/z34;->b:La/t3x;

    .line 126
    .line 127
    iput-object v8, v6, La/wtb;->i:La/t3x;

    .line 128
    .line 129
    new-instance v6, La/q34;

    .line 130
    .line 131
    iget v8, v4, Landroidx/media3/common/b;->L:I

    .line 132
    .line 133
    invoke-direct {v6, v8, v1, v2}, La/q34;-><init>(III)V

    .line 134
    .line 135
    .line 136
    :try_start_0
    iget-object v2, v7, La/p34;->a:La/b4x;

    .line 137
    .line 138
    sget-object v8, La/q34;->e:La/q34;

    .line 139
    .line 140
    invoke-virtual {v6, v8}, La/q34;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_6

    .line 145
    .line 146
    move v8, v3

    .line 147
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-ge v8, v9, :cond_4

    .line 152
    .line 153
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    check-cast v9, La/u34;

    .line 158
    .line 159
    invoke-interface {v9, v6}, La/u34;->f(La/q34;)La/q34;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-interface {v9}, La/u34;->isActive()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_3

    .line 168
    .line 169
    sget-object v6, La/q34;->e:La/q34;

    .line 170
    .line 171
    invoke-virtual {v10, v6}, La/q34;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    xor-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    invoke-static {v6}, La/x0x;->K(Z)V
    :try_end_0
    .catch La/t34; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    .line 179
    .line 180
    move-object v6, v10

    .line 181
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    iget v2, v6, La/q34;->b:I

    .line 185
    .line 186
    iget v8, v6, La/q34;->c:I

    .line 187
    .line 188
    invoke-virtual {v4}, Landroidx/media3/common/b;->a()La/awq;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    iput v8, v9, La/awq;->L:I

    .line 193
    .line 194
    iget v6, v6, La/q34;->a:I

    .line 195
    .line 196
    iput v6, v9, La/awq;->K:I

    .line 197
    .line 198
    iput v2, v9, La/awq;->I:I

    .line 199
    .line 200
    if-ne v2, v1, :cond_5

    .line 201
    .line 202
    iget v5, v4, Landroidx/media3/common/b;->K:I

    .line 203
    .line 204
    :cond_5
    iput v5, v9, La/awq;->J:I

    .line 205
    .line 206
    new-instance v1, Landroidx/media3/common/b;

    .line 207
    .line 208
    invoke-direct {v1, v9}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v8}, La/vtt0;->q(I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    mul-int/2addr v5, v2

    .line 216
    move v6, v0

    .line 217
    move-object v9, v7

    .line 218
    move v7, v5

    .line 219
    move-object v5, v1

    .line 220
    goto :goto_1

    .line 221
    :cond_6
    :try_start_1
    new-instance p0, La/t34;

    .line 222
    .line 223
    invoke-direct {p0, v6}, La/t34;-><init>(La/q34;)V

    .line 224
    .line 225
    .line 226
    throw p0
    :try_end_1
    .catch La/t34; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    :catch_0
    move-exception v0

    .line 228
    move-object p0, v0

    .line 229
    new-instance p1, La/a44;

    .line 230
    .line 231
    invoke-direct {p1, p0, v4}, La/a44;-><init>(Ljava/lang/Exception;Landroidx/media3/common/b;)V

    .line 232
    .line 233
    .line 234
    throw p1

    .line 235
    :cond_7
    new-instance v7, La/p34;

    .line 236
    .line 237
    sget-object v0, La/b4x;->b:La/v3x;

    .line 238
    .line 239
    sget-object v0, La/rcf0;->e:La/rcf0;

    .line 240
    .line 241
    invoke-direct {v7, v0}, La/p34;-><init>(La/b4x;)V

    .line 242
    .line 243
    .line 244
    move v6, v5

    .line 245
    move-object v9, v7

    .line 246
    move-object v5, v4

    .line 247
    move v7, v6

    .line 248
    :goto_1
    invoke-virtual {p0, v5}, La/osj;->g(Landroidx/media3/common/b;)La/g34;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v1, v0, La/g34;->a:Landroidx/media3/common/b;

    .line 253
    .line 254
    :try_start_2
    iget-object v2, p0, La/osj;->r:La/n44;

    .line 255
    .line 256
    invoke-virtual {v2, v0}, La/n44;->c(La/g34;)La/k34;

    .line 257
    .line 258
    .line 259
    move-result-object v8
    :try_end_2
    .catch La/f34; {:try_start_2 .. :try_end_2} :catch_1

    .line 260
    iget-boolean v0, v8, La/k34;->e:Z

    .line 261
    .line 262
    iget v2, v8, La/k34;->a:I

    .line 263
    .line 264
    const-string v10, ")"

    .line 265
    .line 266
    if-eqz v2, :cond_b

    .line 267
    .line 268
    iget v2, v8, La/k34;->c:I

    .line 269
    .line 270
    if-eqz v2, :cond_a

    .line 271
    .line 272
    iput-boolean v3, p0, La/osj;->a0:Z

    .line 273
    .line 274
    new-instance v3, La/msj;

    .line 275
    .line 276
    iget-object v10, p1, La/z34;->c:La/bmq0;

    .line 277
    .line 278
    iget-object p1, p1, La/z34;->d:La/vn30;

    .line 279
    .line 280
    if-eqz p1, :cond_8

    .line 281
    .line 282
    iget-object p1, p1, La/vn30;->a:Ljava/lang/Object;

    .line 283
    .line 284
    :goto_2
    move-object v11, p1

    .line 285
    goto :goto_3

    .line 286
    :cond_8
    const/4 p1, 0x0

    .line 287
    goto :goto_2

    .line 288
    :goto_3
    invoke-direct/range {v3 .. v11}, La/msj;-><init>(Landroidx/media3/common/b;Landroidx/media3/common/b;IILa/k34;La/p34;La/bmq0;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0}, La/osj;->m()Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-eqz p1, :cond_9

    .line 296
    .line 297
    iput-object v3, p0, La/osj;->o:La/msj;

    .line 298
    .line 299
    return-void

    .line 300
    :cond_9
    iput-object v3, p0, La/osj;->p:La/msj;

    .line 301
    .line 302
    return-void

    .line 303
    :cond_a
    new-instance p0, La/a44;

    .line 304
    .line 305
    const-string p1, "Invalid output channel config (isOffload="

    .line 306
    .line 307
    invoke-static {p1, v10, v0}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-direct {p0, p1, v1}, La/a44;-><init>(Ljava/lang/String;Landroidx/media3/common/b;)V

    .line 312
    .line 313
    .line 314
    throw p0

    .line 315
    :cond_b
    new-instance p0, La/a44;

    .line 316
    .line 317
    const-string p1, "Invalid output encoding (isOffload="

    .line 318
    .line 319
    invoke-static {p1, v10, v0}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-direct {p0, p1, v1}, La/a44;-><init>(Ljava/lang/String;Landroidx/media3/common/b;)V

    .line 324
    .line 325
    .line 326
    throw p0

    .line 327
    :catch_1
    move-exception v0

    .line 328
    move-object p0, v0

    .line 329
    new-instance p1, La/a44;

    .line 330
    .line 331
    invoke-direct {p1, p0, v4}, La/a44;-><init>(Ljava/lang/Exception;Landroidx/media3/common/b;)V

    .line 332
    .line 333
    .line 334
    throw p1
.end method

.method public final d(J)V
    .locals 10

    .line 1
    iget-object v1, p0, La/osj;->l:La/dr8;

    .line 2
    .line 3
    iget-object v0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, v1, La/dr8;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Exception;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v0, v1, La/dr8;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/osj;

    .line 21
    .line 22
    iget-object v0, v0, La/osj;->r:La/n44;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v4, La/l44;->r:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v4

    .line 30
    :try_start_0
    sget v0, La/l44;->t:I

    .line 31
    .line 32
    if-lez v0, :cond_2

    .line 33
    .line 34
    move v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v0, v2

    .line 37
    :goto_0
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    iget-wide v6, v1, La/dr8;->b:J

    .line 47
    .line 48
    cmp-long v0, v4, v6

    .line 49
    .line 50
    if-gez v0, :cond_4

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_4
    :goto_1
    iget-object v0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const-wide/16 v4, 0x0

    .line 61
    .line 62
    :try_start_1
    iget-object v6, p0, La/osj;->t:La/l44;

    .line 63
    .line 64
    iget-object v7, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    iget v8, p0, La/osj;->M:I

    .line 67
    .line 68
    invoke-virtual {v6, v7, v8, p1, p2}, La/l44;->d(Ljava/nio/ByteBuffer;IJ)Z

    .line 69
    .line 70
    .line 71
    move-result p1
    :try_end_1
    .catch La/e34; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    iput-wide v6, p0, La/osj;->Z:J

    .line 77
    .line 78
    const/4 p2, 0x0

    .line 79
    iput-object p2, v1, La/dr8;->c:Ljava/lang/Object;

    .line 80
    .line 81
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    iput-wide v6, v1, La/dr8;->a:J

    .line 87
    .line 88
    iput-wide v6, v1, La/dr8;->b:J

    .line 89
    .line 90
    iget-object v1, p0, La/osj;->t:La/l44;

    .line 91
    .line 92
    invoke-virtual {v1}, La/l44;->c()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-wide v6, p0, La/osj;->C:J

    .line 99
    .line 100
    cmp-long v1, v6, v4

    .line 101
    .line 102
    if-lez v1, :cond_5

    .line 103
    .line 104
    iput-boolean v2, p0, La/osj;->b0:Z

    .line 105
    .line 106
    :cond_5
    iget-boolean v1, p0, La/osj;->R:Z

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    iget-object v1, p0, La/osj;->n:La/yox;

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    if-nez p1, :cond_6

    .line 115
    .line 116
    iget-boolean v6, p0, La/osj;->b0:Z

    .line 117
    .line 118
    if-nez v6, :cond_6

    .line 119
    .line 120
    iget-object v1, v1, La/yox;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, La/fm30;

    .line 123
    .line 124
    iget-object v1, v1, La/mm30;->i1:La/ylo;

    .line 125
    .line 126
    if-eqz v1, :cond_6

    .line 127
    .line 128
    iget-object v1, v1, La/ylo;->a:La/dmo;

    .line 129
    .line 130
    iput-boolean v3, v1, La/dmo;->t1:Z

    .line 131
    .line 132
    :cond_6
    iget-object v1, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    sub-int/2addr v0, v1

    .line 139
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 140
    .line 141
    invoke-virtual {v1}, La/msj;->f()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_7

    .line 146
    .line 147
    iget-wide v6, p0, La/osj;->B:J

    .line 148
    .line 149
    int-to-long v8, v0

    .line 150
    add-long/2addr v6, v8

    .line 151
    iput-wide v6, p0, La/osj;->B:J

    .line 152
    .line 153
    :cond_7
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 154
    .line 155
    if-eqz p1, :cond_a

    .line 156
    .line 157
    invoke-virtual {v1}, La/msj;->f()Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_9

    .line 162
    .line 163
    iget-object p1, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    iget-object v0, p0, La/osj;->L:Ljava/nio/ByteBuffer;

    .line 166
    .line 167
    if-ne p1, v0, :cond_8

    .line 168
    .line 169
    move v2, v3

    .line 170
    :cond_8
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 171
    .line 172
    .line 173
    iget-wide v0, p0, La/osj;->C:J

    .line 174
    .line 175
    iget p1, p0, La/osj;->D:I

    .line 176
    .line 177
    int-to-long v2, p1

    .line 178
    iget p1, p0, La/osj;->M:I

    .line 179
    .line 180
    int-to-long v6, p1

    .line 181
    mul-long/2addr v2, v6

    .line 182
    iget-wide v6, p0, La/osj;->F:J

    .line 183
    .line 184
    sub-long/2addr v2, v6

    .line 185
    add-long/2addr v2, v0

    .line 186
    iput-wide v2, p0, La/osj;->C:J

    .line 187
    .line 188
    iput-wide v4, p0, La/osj;->F:J

    .line 189
    .line 190
    :cond_9
    iput-object p2, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_a
    invoke-virtual {v1}, La/msj;->f()Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-nez p1, :cond_c

    .line 198
    .line 199
    if-lez v0, :cond_c

    .line 200
    .line 201
    iget p1, p0, La/osj;->E:I

    .line 202
    .line 203
    if-lez p1, :cond_b

    .line 204
    .line 205
    move v2, v3

    .line 206
    :cond_b
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 207
    .line 208
    .line 209
    iget p1, p0, La/osj;->E:I

    .line 210
    .line 211
    iget-object p2, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    sub-int/2addr p1, p2

    .line 218
    int-to-long v0, p1

    .line 219
    iget p1, p0, La/osj;->D:I

    .line 220
    .line 221
    int-to-long p1, p1

    .line 222
    iget v2, p0, La/osj;->M:I

    .line 223
    .line 224
    int-to-long v2, v2

    .line 225
    mul-long/2addr v2, p1

    .line 226
    iget p1, p0, La/osj;->E:I

    .line 227
    .line 228
    int-to-long v4, p1

    .line 229
    sget-object v6, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 230
    .line 231
    invoke-static/range {v0 .. v6}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 232
    .line 233
    .line 234
    move-result-wide p1

    .line 235
    iget-wide v0, p0, La/osj;->F:J

    .line 236
    .line 237
    sub-long v0, p1, v0

    .line 238
    .line 239
    iget-wide v2, p0, La/osj;->C:J

    .line 240
    .line 241
    add-long/2addr v2, v0

    .line 242
    iput-wide v2, p0, La/osj;->C:J

    .line 243
    .line 244
    iput-wide p1, p0, La/osj;->F:J

    .line 245
    .line 246
    :cond_c
    :goto_2
    return-void

    .line 247
    :catch_0
    move-exception v0

    .line 248
    move-object p1, v0

    .line 249
    iget-boolean p2, p1, La/e34;->b:Z

    .line 250
    .line 251
    if-eqz p2, :cond_f

    .line 252
    .line 253
    invoke-virtual {p0}, La/osj;->j()J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    cmp-long v0, v6, v4

    .line 258
    .line 259
    if-lez v0, :cond_d

    .line 260
    .line 261
    :goto_3
    move v2, v3

    .line 262
    goto :goto_4

    .line 263
    :cond_d
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 264
    .line 265
    invoke-virtual {v0}, La/l44;->c()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 272
    .line 273
    iget-object v0, v0, La/msj;->e:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, La/k34;

    .line 276
    .line 277
    iget-boolean v0, v0, La/k34;->e:Z

    .line 278
    .line 279
    if-nez v0, :cond_e

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_e
    iput-boolean v3, p0, La/osj;->a0:Z

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_f
    :goto_4
    new-instance v0, La/d44;

    .line 286
    .line 287
    iget p1, p1, La/e34;->a:I

    .line 288
    .line 289
    iget-object v3, p0, La/osj;->p:La/msj;

    .line 290
    .line 291
    iget-object v3, v3, La/msj;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v3, Landroidx/media3/common/b;

    .line 294
    .line 295
    invoke-direct {v0, p1, v3, v2}, La/d44;-><init>(ILandroidx/media3/common/b;Z)V

    .line 296
    .line 297
    .line 298
    iget-object p0, p0, La/osj;->n:La/yox;

    .line 299
    .line 300
    if-eqz p0, :cond_10

    .line 301
    .line 302
    invoke-virtual {p0, v0}, La/yox;->s(Ljava/lang/Exception;)V

    .line 303
    .line 304
    .line 305
    :cond_10
    if-nez p2, :cond_11

    .line 306
    .line 307
    invoke-virtual {v1, v0}, La/dr8;->p(Ljava/lang/Exception;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :cond_11
    throw v0

    .line 312
    :catchall_0
    move-exception v0

    .line 313
    move-object p0, v0

    .line 314
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 315
    throw p0
.end method

.method public final e()Z
    .locals 6

    .line 1
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p34;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, La/osj;->d(J)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez p0, :cond_4

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 22
    .line 23
    invoke-virtual {v0}, La/p34;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-boolean v5, v0, La/p34;->d:Z

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-boolean v4, v0, La/p34;->d:Z

    .line 35
    .line 36
    iget-object v0, v0, La/p34;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/u34;

    .line 43
    .line 44
    invoke-interface {v0}, La/u34;->e()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, La/osj;->p(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 51
    .line 52
    invoke-virtual {v0}, La/p34;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object p0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    return v4

    .line 69
    :cond_4
    return v3
.end method

.method public final f()V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/osj;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iput-wide v3, p0, La/osj;->z:J

    .line 16
    .line 17
    iput-wide v3, p0, La/osj;->A:J

    .line 18
    .line 19
    iput-wide v3, p0, La/osj;->B:J

    .line 20
    .line 21
    iput-wide v3, p0, La/osj;->C:J

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, La/osj;->b0:Z

    .line 25
    .line 26
    iput v0, p0, La/osj;->D:I

    .line 27
    .line 28
    iput v0, p0, La/osj;->E:I

    .line 29
    .line 30
    iput-wide v3, p0, La/osj;->F:J

    .line 31
    .line 32
    new-instance v6, La/nsj;

    .line 33
    .line 34
    iget-object v7, p0, La/osj;->x:La/zx90;

    .line 35
    .line 36
    const-wide/16 v8, 0x0

    .line 37
    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    invoke-direct/range {v6 .. v11}, La/nsj;-><init>(La/zx90;JJ)V

    .line 41
    .line 42
    .line 43
    iput-object v6, p0, La/osj;->w:La/nsj;

    .line 44
    .line 45
    iput-wide v3, p0, La/osj;->I:J

    .line 46
    .line 47
    iput-object v5, p0, La/osj;->v:La/nsj;

    .line 48
    .line 49
    iget-object v6, p0, La/osj;->h:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->clear()V

    .line 52
    .line 53
    .line 54
    iput-object v5, p0, La/osj;->L:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    iput v0, p0, La/osj;->M:I

    .line 57
    .line 58
    iput-object v5, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    iput-boolean v0, p0, La/osj;->P:Z

    .line 61
    .line 62
    iput-boolean v0, p0, La/osj;->O:Z

    .line 63
    .line 64
    iput-boolean v0, p0, La/osj;->Q:Z

    .line 65
    .line 66
    iget-object v6, p0, La/osj;->d:La/ors0;

    .line 67
    .line 68
    iput-wide v3, v6, La/ors0;->o:J

    .line 69
    .line 70
    invoke-virtual {p0, v1, v2}, La/osj;->u(J)V

    .line 71
    .line 72
    .line 73
    iput-object v5, p0, La/osj;->j:La/ksj;

    .line 74
    .line 75
    iget-object v6, p0, La/osj;->o:La/msj;

    .line 76
    .line 77
    if-eqz v6, :cond_0

    .line 78
    .line 79
    iput-object v6, p0, La/osj;->p:La/msj;

    .line 80
    .line 81
    iput-object v5, p0, La/osj;->o:La/msj;

    .line 82
    .line 83
    :cond_0
    iget-object v6, p0, La/osj;->t:La/l44;

    .line 84
    .line 85
    iget-object v7, v6, La/l44;->e:La/o44;

    .line 86
    .line 87
    iget-object v7, v7, La/o44;->d:Landroid/media/AudioTrack;

    .line 88
    .line 89
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getPlayState()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    const/4 v8, 0x3

    .line 94
    if-ne v7, v8, :cond_1

    .line 95
    .line 96
    iget-object v7, v6, La/l44;->a:Landroid/media/AudioTrack;

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/media/AudioTrack;->pause()V

    .line 99
    .line 100
    .line 101
    :cond_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v9, 0x1d

    .line 104
    .line 105
    if-lt v7, v9, :cond_2

    .line 106
    .line 107
    invoke-virtual {v6}, La/l44;->c()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_2

    .line 112
    .line 113
    iget-object v7, v6, La/l44;->h:La/oif0;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v9, v7, La/oif0;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v9, La/l44;

    .line 121
    .line 122
    iget-object v9, v9, La/l44;->a:Landroid/media/AudioTrack;

    .line 123
    .line 124
    iget-object v10, v7, La/oif0;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v10, La/k44;

    .line 127
    .line 128
    invoke-static {v9, v10}, La/kw2;->q(Landroid/media/AudioTrack;La/k44;)V

    .line 129
    .line 130
    .line 131
    iget-object v7, v7, La/oif0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, Landroid/os/Handler;

    .line 134
    .line 135
    invoke-virtual {v7, v5}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    iget-object v7, v6, La/l44;->d:La/nhf0;

    .line 139
    .line 140
    if-eqz v7, :cond_3

    .line 141
    .line 142
    iget-object v9, v7, La/nhf0;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v9, Landroid/media/AudioTrack;

    .line 145
    .line 146
    iget-object v10, v7, La/nhf0;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v10, La/h44;

    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v10}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 154
    .line 155
    .line 156
    iput-object v5, v7, La/nhf0;->d:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v5, v6, La/l44;->d:La/nhf0;

    .line 159
    .line 160
    :cond_3
    iget-object v7, v6, La/l44;->a:Landroid/media/AudioTrack;

    .line 161
    .line 162
    iget-object v6, v6, La/l44;->i:La/vg00;

    .line 163
    .line 164
    invoke-static {v5}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    sget-object v10, La/l44;->r:Ljava/lang/Object;

    .line 169
    .line 170
    monitor-enter v10

    .line 171
    :try_start_0
    sget-object v11, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 172
    .line 173
    if-nez v11, :cond_4

    .line 174
    .line 175
    new-instance v11, La/stt0;

    .line 176
    .line 177
    invoke-direct {v11, v0}, La/stt0;-><init>(B)V

    .line 178
    .line 179
    .line 180
    invoke-static {v11}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    sput-object v11, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    move-object p0, v0

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    :goto_0
    sget v0, La/l44;->t:I

    .line 191
    .line 192
    add-int/lit8 v0, v0, 0x1

    .line 193
    .line 194
    sput v0, La/l44;->t:I

    .line 195
    .line 196
    new-instance v0, La/b1;

    .line 197
    .line 198
    invoke-direct {v0, v7, v9, v6, v8}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 199
    .line 200
    .line 201
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 202
    .line 203
    const-wide/16 v7, 0x14

    .line 204
    .line 205
    invoke-interface {v11, v0, v7, v8, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 206
    .line 207
    .line 208
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    iput-object v5, p0, La/osj;->t:La/l44;

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :goto_1
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    throw p0

    .line 214
    :cond_5
    :goto_2
    iget-object v0, p0, La/osj;->l:La/dr8;

    .line 215
    .line 216
    iput-object v5, v0, La/dr8;->c:Ljava/lang/Object;

    .line 217
    .line 218
    iput-wide v1, v0, La/dr8;->a:J

    .line 219
    .line 220
    iput-wide v1, v0, La/dr8;->b:J

    .line 221
    .line 222
    iget-object v0, p0, La/osj;->k:La/dr8;

    .line 223
    .line 224
    iput-object v5, v0, La/dr8;->c:Ljava/lang/Object;

    .line 225
    .line 226
    iput-wide v1, v0, La/dr8;->a:J

    .line 227
    .line 228
    iput-wide v1, v0, La/dr8;->b:J

    .line 229
    .line 230
    iput-wide v3, p0, La/osj;->c0:J

    .line 231
    .line 232
    iput-wide v3, p0, La/osj;->d0:J

    .line 233
    .line 234
    iget-object p0, p0, La/osj;->e0:Landroid/os/Handler;

    .line 235
    .line 236
    if-eqz p0, :cond_6

    .line 237
    .line 238
    invoke-virtual {p0, v5}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_6
    return-void
.end method

.method public final g(Landroidx/media3/common/b;)La/g34;
    .locals 1

    .line 1
    new-instance v0, La/g34;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/g34;-><init>(Landroidx/media3/common/b;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/osj;->u:La/m24;

    .line 7
    .line 8
    iput-object p1, v0, La/g34;->b:La/m24;

    .line 9
    .line 10
    iget-byte p1, p0, La/osj;->i:B

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iput-boolean p1, v0, La/g34;->d:Z

    .line 18
    .line 19
    iget-object p1, p0, La/osj;->W:Landroid/media/AudioDeviceInfo;

    .line 20
    .line 21
    iput-object p1, v0, La/g34;->c:Landroid/media/AudioDeviceInfo;

    .line 22
    .line 23
    iget p1, p0, La/osj;->T:I

    .line 24
    .line 25
    iput p1, v0, La/g34;->e:I

    .line 26
    .line 27
    iget-boolean p1, p0, La/osj;->Y:Z

    .line 28
    .line 29
    iput-boolean p1, v0, La/g34;->g:Z

    .line 30
    .line 31
    iget p0, p0, La/osj;->X:I

    .line 32
    .line 33
    iput p0, v0, La/g34;->f:I

    .line 34
    .line 35
    new-instance p0, La/g34;

    .line 36
    .line 37
    invoke-direct {p0, v0}, La/g34;-><init>(La/g34;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public final h(Landroidx/media3/common/b;)I
    .locals 5

    .line 1
    iget v0, p1, Landroidx/media3/common/b;->M:I

    .line 2
    .line 3
    invoke-static {v0}, La/vtt0;->I(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p1, Landroidx/media3/common/b;->M:I

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/media3/common/b;->a()La/awq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput v1, p1, La/awq;->L:I

    .line 21
    .line 22
    new-instance v0, Landroidx/media3/common/b;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v0

    .line 28
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v0, v3

    .line 31
    :goto_0
    iget-object v4, p0, La/osj;->r:La/n44;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/osj;->g(Landroidx/media3/common/b;)La/g34;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v4, p0}, La/n44;->b(La/g34;)La/h34;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget p0, p0, La/h34;->d:I

    .line 42
    .line 43
    if-eq p0, v2, :cond_3

    .line 44
    .line 45
    if-eq p0, v1, :cond_1

    .line 46
    .line 47
    return v3

    .line 48
    :cond_1
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return v1

    .line 52
    :cond_3
    :goto_1
    return v2
.end method

.method public final j()J
    .locals 6

    .line 1
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 2
    .line 3
    invoke-virtual {v0}, La/msj;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, La/osj;->B:J

    .line 10
    .line 11
    iget-object p0, p0, La/osj;->p:La/msj;

    .line 12
    .line 13
    iget p0, p0, La/msj;->b:I

    .line 14
    .line 15
    int-to-long v2, p0

    .line 16
    add-long/2addr v0, v2

    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    sub-long/2addr v0, v4

    .line 20
    div-long/2addr v0, v2

    .line 21
    return-wide v0

    .line 22
    :cond_0
    iget-wide v0, p0, La/osj;->C:J

    .line 23
    .line 24
    return-wide v0
.end method

.method public final k()Z
    .locals 10

    .line 1
    invoke-virtual {p0}, La/osj;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 14
    .line 15
    invoke-virtual {v0}, La/l44;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, La/osj;->Q:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, La/osj;->j()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-object v2, p0, La/osj;->t:La/l44;

    .line 30
    .line 31
    invoke-virtual {v2}, La/l44;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object p0, p0, La/osj;->t:La/l44;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/l44;->a:Landroid/media/AudioTrack;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long v5, p0

    .line 47
    const-wide/32 v7, 0xf4240

    .line 48
    .line 49
    .line 50
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 51
    .line 52
    invoke-static/range {v3 .. v9}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long p0, v0, v2

    .line 57
    .line 58
    if-lez p0, :cond_1

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_1
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public final l()Z
    .locals 9

    .line 1
    iget-object v0, p0, La/osj;->k:La/dr8;

    .line 2
    .line 3
    iget-object v1, v0, La/dr8;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Exception;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v1, v0, La/dr8;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/osj;

    .line 15
    .line 16
    iget-object v1, v1, La/osj;->r:La/n44;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, La/l44;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    sget v4, La/l44;->t:I

    .line 25
    .line 26
    if-lez v4, :cond_1

    .line 27
    .line 28
    move v4, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v4, v2

    .line 31
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    iget-wide v0, v0, La/dr8;->b:J

    .line 40
    .line 41
    cmp-long v0, v4, v0

    .line 42
    .line 43
    if-gez v0, :cond_3

    .line 44
    .line 45
    :goto_1
    return v2

    .line 46
    :cond_3
    :goto_2
    :try_start_1
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 47
    .line 48
    iget-object v0, v0, La/msj;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/k34;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/osj;->b(La/k34;)La/l44;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_1
    .catch La/b44; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 60
    .line 61
    iget-object v1, v1, La/msj;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, La/k34;

    .line 64
    .line 65
    iget v4, v1, La/k34;->f:I

    .line 66
    .line 67
    iget v1, v1, La/k34;->a:I

    .line 68
    .line 69
    invoke-static {v1}, La/vtt0;->I(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget-object v5, p0, La/osj;->p:La/msj;

    .line 74
    .line 75
    const/4 v6, -0x1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v1, v5, La/msj;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/k34;

    .line 81
    .line 82
    iget v1, v1, La/k34;->b:I

    .line 83
    .line 84
    iget v5, v5, La/msj;->b:I

    .line 85
    .line 86
    mul-int/2addr v1, v5

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    iget-object v1, v5, La/msj;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroidx/media3/common/b;

    .line 91
    .line 92
    iget v1, v1, Landroidx/media3/common/b;->k:I

    .line 93
    .line 94
    if-eq v1, v6, :cond_5

    .line 95
    .line 96
    div-int/lit8 v1, v1, 0x8

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    iget-object v1, v5, La/msj;->e:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, La/k34;

    .line 102
    .line 103
    iget v1, v1, La/k34;->a:I

    .line 104
    .line 105
    invoke-static {v1}, La/obc;->Q(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    const v5, -0x7fffffff

    .line 110
    .line 111
    .line 112
    if-eq v1, v5, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    const v1, 0xf4240

    .line 116
    .line 117
    .line 118
    :goto_3
    iget-object v5, p0, La/osj;->p:La/msj;

    .line 119
    .line 120
    iget-object v5, v5, La/msj;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, La/k34;

    .line 123
    .line 124
    iget v7, v5, La/k34;->b:I

    .line 125
    .line 126
    iget v8, v5, La/k34;->c:I

    .line 127
    .line 128
    iget v5, v5, La/k34;->a:I

    .line 129
    .line 130
    invoke-static {v7, v8, v5}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    iget-object v5, p0, La/osj;->p:La/msj;

    .line 139
    .line 140
    iget v5, v5, La/msj;->b:I

    .line 141
    .line 142
    if-eq v5, v6, :cond_7

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    move v5, v3

    .line 146
    :goto_4
    if-le v4, v1, :cond_14

    .line 147
    .line 148
    div-int/lit8 v4, v4, 0x2

    .line 149
    .line 150
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    rem-int v6, v4, v5

    .line 155
    .line 156
    if-eqz v6, :cond_8

    .line 157
    .line 158
    sub-int v6, v5, v6

    .line 159
    .line 160
    add-int/2addr v6, v4

    .line 161
    move v4, v6

    .line 162
    :cond_8
    iget-object v6, p0, La/osj;->p:La/msj;

    .line 163
    .line 164
    iget-object v6, v6, La/msj;->e:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v6, La/k34;

    .line 167
    .line 168
    invoke-virtual {v6}, La/k34;->a()La/j34;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    iput v4, v6, La/j34;->f:I

    .line 173
    .line 174
    new-instance v7, La/k34;

    .line 175
    .line 176
    invoke-direct {v7, v6}, La/k34;-><init>(La/j34;)V

    .line 177
    .line 178
    .line 179
    :try_start_2
    invoke-virtual {p0, v7}, La/osj;->b(La/k34;)La/l44;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    iget-object v8, p0, La/osj;->p:La/msj;

    .line 184
    .line 185
    invoke-virtual {v8, v7}, La/msj;->c(La/k34;)La/msj;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    iput-object v7, p0, La/osj;->p:La/msj;
    :try_end_2
    .catch La/b44; {:try_start_2 .. :try_end_2} :catch_1

    .line 190
    .line 191
    move-object v0, v6

    .line 192
    :goto_5
    iput-object v0, p0, La/osj;->t:La/l44;

    .line 193
    .line 194
    new-instance v1, La/ksj;

    .line 195
    .line 196
    iget-object v4, p0, La/osj;->p:La/msj;

    .line 197
    .line 198
    iget-object v4, v4, La/msj;->e:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v4, La/k34;

    .line 201
    .line 202
    invoke-direct {v1, p0, v4}, La/ksj;-><init>(La/osj;La/k34;)V

    .line 203
    .line 204
    .line 205
    iput-object v1, p0, La/osj;->j:La/ksj;

    .line 206
    .line 207
    iget-object v0, v0, La/l44;->i:La/vg00;

    .line 208
    .line 209
    invoke-virtual {v0, v1}, La/vg00;->a(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 213
    .line 214
    invoke-virtual {v0}, La/l44;->c()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 221
    .line 222
    iget-object v1, v0, La/msj;->e:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, La/k34;

    .line 225
    .line 226
    iget-boolean v1, v1, La/k34;->k:Z

    .line 227
    .line 228
    if-eqz v1, :cond_a

    .line 229
    .line 230
    iget-object v1, p0, La/osj;->t:La/l44;

    .line 231
    .line 232
    iget-object v0, v0, La/msj;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Landroidx/media3/common/b;

    .line 235
    .line 236
    iget v4, v0, Landroidx/media3/common/b;->N:I

    .line 237
    .line 238
    iget v0, v0, Landroidx/media3/common/b;->O:I

    .line 239
    .line 240
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 241
    .line 242
    const/16 v6, 0x1d

    .line 243
    .line 244
    if-ge v5, v6, :cond_9

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_9
    iget-object v1, v1, La/l44;->a:Landroid/media/AudioTrack;

    .line 251
    .line 252
    invoke-static {v1, v4, v0}, La/kw2;->o(Landroid/media/AudioTrack;II)V

    .line 253
    .line 254
    .line 255
    :cond_a
    :goto_6
    iget-object v0, p0, La/osj;->m:La/a4a0;

    .line 256
    .line 257
    if-eqz v0, :cond_c

    .line 258
    .line 259
    iget-object v1, p0, La/osj;->t:La/l44;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 265
    .line 266
    const/16 v5, 0x1f

    .line 267
    .line 268
    if-ge v4, v5, :cond_b

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_b
    invoke-virtual {v0}, La/a4a0;->a()Landroid/media/metrics/LogSessionId;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {}, La/tl50;->n()Landroid/media/metrics/LogSessionId;

    .line 276
    .line 277
    .line 278
    invoke-static {v0}, La/tl50;->z(Landroid/media/metrics/LogSessionId;)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-nez v4, :cond_c

    .line 283
    .line 284
    iget-object v1, v1, La/l44;->a:Landroid/media/AudioTrack;

    .line 285
    .line 286
    invoke-static {v1, v0}, La/ow2;->r(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 287
    .line 288
    .line 289
    :cond_c
    :goto_7
    invoke-virtual {p0}, La/osj;->m()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_d

    .line 294
    .line 295
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 296
    .line 297
    iget v1, p0, La/osj;->K:F

    .line 298
    .line 299
    iget-object v0, v0, La/l44;->a:Landroid/media/AudioTrack;

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 302
    .line 303
    .line 304
    :cond_d
    iget-object v0, p0, La/osj;->V:La/y55;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v0, p0, La/osj;->W:Landroid/media/AudioDeviceInfo;

    .line 310
    .line 311
    if-eqz v0, :cond_e

    .line 312
    .line 313
    iget-object v1, p0, La/osj;->t:La/l44;

    .line 314
    .line 315
    iget-object v1, v1, La/l44;->a:Landroid/media/AudioTrack;

    .line 316
    .line 317
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 318
    .line 319
    .line 320
    :cond_e
    iput-boolean v3, p0, La/osj;->H:Z

    .line 321
    .line 322
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 323
    .line 324
    iget-object v0, v0, La/l44;->a:Landroid/media/AudioTrack;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    iget v1, p0, La/osj;->T:I

    .line 331
    .line 332
    if-eq v0, v1, :cond_f

    .line 333
    .line 334
    move v2, v3

    .line 335
    :cond_f
    iput v0, p0, La/osj;->T:I

    .line 336
    .line 337
    iget-object v0, p0, La/osj;->n:La/yox;

    .line 338
    .line 339
    if-eqz v0, :cond_13

    .line 340
    .line 341
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 342
    .line 343
    new-instance v4, La/rek0;

    .line 344
    .line 345
    iget-object v1, v1, La/msj;->e:Ljava/lang/Object;

    .line 346
    .line 347
    const/16 v1, 0x18

    .line 348
    .line 349
    invoke-direct {v4, v1}, La/rek0;-><init>(B)V

    .line 350
    .line 351
    .line 352
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, La/fm30;

    .line 355
    .line 356
    iget-object v0, v0, La/fm30;->l2:La/xex;

    .line 357
    .line 358
    iget-object v1, v0, La/xex;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, Landroid/os/Handler;

    .line 361
    .line 362
    if-eqz v1, :cond_10

    .line 363
    .line 364
    new-instance v5, La/w34;

    .line 365
    .line 366
    const/16 v6, 0x9

    .line 367
    .line 368
    invoke-direct {v5, v0, v4, v6}, La/w34;-><init>(La/xex;Ljava/lang/Object;B)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 372
    .line 373
    .line 374
    :cond_10
    if-eqz v2, :cond_13

    .line 375
    .line 376
    iput-boolean v3, p0, La/osj;->U:Z

    .line 377
    .line 378
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 379
    .line 380
    iget-object v1, v0, La/msj;->e:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, La/k34;

    .line 383
    .line 384
    invoke-virtual {v1}, La/k34;->a()La/j34;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    iget v2, p0, La/osj;->T:I

    .line 389
    .line 390
    iput v2, v1, La/j34;->h:I

    .line 391
    .line 392
    new-instance v2, La/k34;

    .line 393
    .line 394
    invoke-direct {v2, v1}, La/k34;-><init>(La/j34;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v2}, La/msj;->c(La/k34;)La/msj;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    iput-object v0, p0, La/osj;->p:La/msj;

    .line 402
    .line 403
    iget-object v0, p0, La/osj;->o:La/msj;

    .line 404
    .line 405
    if-eqz v0, :cond_11

    .line 406
    .line 407
    iget-object v1, v0, La/msj;->e:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, La/k34;

    .line 410
    .line 411
    invoke-virtual {v1}, La/k34;->a()La/j34;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iget v2, p0, La/osj;->T:I

    .line 416
    .line 417
    iput v2, v1, La/j34;->h:I

    .line 418
    .line 419
    new-instance v2, La/k34;

    .line 420
    .line 421
    invoke-direct {v2, v1}, La/k34;-><init>(La/j34;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v2}, La/msj;->c(La/k34;)La/msj;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    iput-object v0, p0, La/osj;->o:La/msj;

    .line 429
    .line 430
    :cond_11
    iget-object v0, p0, La/osj;->n:La/yox;

    .line 431
    .line 432
    iget p0, p0, La/osj;->T:I

    .line 433
    .line 434
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, La/fm30;

    .line 437
    .line 438
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 439
    .line 440
    const/16 v2, 0x23

    .line 441
    .line 442
    if-lt v1, v2, :cond_12

    .line 443
    .line 444
    iget-object v1, v0, La/fm30;->n2:La/dq00;

    .line 445
    .line 446
    if-eqz v1, :cond_12

    .line 447
    .line 448
    invoke-virtual {v1, p0}, La/dq00;->j(I)V

    .line 449
    .line 450
    .line 451
    :cond_12
    iget-object v0, v0, La/fm30;->l2:La/xex;

    .line 452
    .line 453
    iget-object v1, v0, La/xex;->a:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v1, Landroid/os/Handler;

    .line 456
    .line 457
    if-eqz v1, :cond_13

    .line 458
    .line 459
    new-instance v2, La/n23;

    .line 460
    .line 461
    const/4 v4, 0x3

    .line 462
    invoke-direct {v2, v0, p0, v4}, La/n23;-><init>(Ljava/lang/Object;IB)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 466
    .line 467
    .line 468
    :cond_13
    return v3

    .line 469
    :catch_1
    move-exception v6

    .line 470
    invoke-virtual {v0, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_4

    .line 474
    .line 475
    :cond_14
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 476
    .line 477
    iget-object v1, v1, La/msj;->e:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v1, La/k34;

    .line 480
    .line 481
    iget-boolean v1, v1, La/k34;->e:Z

    .line 482
    .line 483
    if-nez v1, :cond_15

    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_15
    iput-boolean v3, p0, La/osj;->a0:Z

    .line 487
    .line 488
    :goto_8
    throw v0

    .line 489
    :catchall_0
    move-exception p0

    .line 490
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 491
    throw p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/osj;->t:La/l44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final n()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/osj;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/osj;->m()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, La/osj;->t:La/l44;

    .line 11
    .line 12
    iget-object v0, p0, La/l44;->e:La/o44;

    .line 13
    .line 14
    iget-wide v1, v0, La/o44;->u:J

    .line 15
    .line 16
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, La/o44;->b:La/l9o0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, La/vtt0;->M(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, v0, La/o44;->u:J

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, La/o44;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iget v3, v0, La/o44;->e:I

    .line 45
    .line 46
    invoke-static {v3, v1, v2}, La/vtt0;->R(IJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    iput-wide v1, v0, La/o44;->j:J

    .line 51
    .line 52
    iget-object v0, v0, La/o44;->h:La/g44;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, v1}, La/g44;->a(I)V

    .line 56
    .line 57
    .line 58
    iget-boolean v0, p0, La/l44;->j:Z

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, La/l44;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    :cond_1
    iget-object p0, p0, La/l44;->a:Landroid/media/AudioTrack;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/media/AudioTrack;->play()V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final o()V
    .locals 7

    .line 1
    iget-boolean v0, p0, La/osj;->P:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/osj;->P:Z

    .line 7
    .line 8
    iget-object v1, p0, La/osj;->t:La/l44;

    .line 9
    .line 10
    invoke-virtual {v1}, La/l44;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-boolean v2, p0, La/osj;->Q:Z

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, La/osj;->t:La/l44;

    .line 20
    .line 21
    iget-boolean v1, p0, La/l44;->j:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-boolean v0, p0, La/l44;->j:Z

    .line 27
    .line 28
    iget-object v0, p0, La/l44;->e:La/o44;

    .line 29
    .line 30
    invoke-virtual {p0}, La/l44;->b()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v0}, La/o44;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iput-wide v5, v0, La/o44;->w:J

    .line 39
    .line 40
    iget-object v1, v0, La/o44;->b:La/l9o0;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-static {v5, v6}, La/vtt0;->M(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    iput-wide v5, v0, La/o44;->u:J

    .line 54
    .line 55
    iput-wide v3, v0, La/o44;->x:J

    .line 56
    .line 57
    iget-object v0, p0, La/l44;->a:Landroid/media/AudioTrack;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 60
    .line 61
    .line 62
    iput v2, p0, La/l44;->o:I

    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
.end method

.method public final p(J)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, La/osj;->d(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 11
    .line 12
    invoke-virtual {v0}, La/p34;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, La/osj;->L:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/osj;->t(Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, La/osj;->d(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 30
    .line 31
    invoke-virtual {v0}, La/p34;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 38
    .line 39
    invoke-virtual {v0}, La/p34;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    sget-object v0, La/u34;->a:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v1, v0, La/p34;->c:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, La/p34;->a()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, La/u34;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/p34;->d(Ljava/nio/ByteBuffer;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, La/p34;->c:[Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, La/p34;->a()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, v0}, La/osj;->t(Ljava/nio/ByteBuffer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, La/osj;->d(J)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    iget-object v0, p0, La/osj;->L:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 106
    .line 107
    iget-object v1, p0, La/osj;->L:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0}, La/p34;->c()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    iget-boolean v2, v0, La/p34;->d:Z

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-virtual {v0, v1}, La/p34;->d(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/osj;->o:La/msj;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/osj;->p:La/msj;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, La/osj;->o:La/msj;

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    :try_start_0
    iget-object v1, p0, La/osj;->r:La/n44;

    .line 16
    .line 17
    iget-object v0, v0, La/msj;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroidx/media3/common/b;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/osj;->g(Landroidx/media3/common/b;)La/g34;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, La/n44;->c(La/g34;)La/k34;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch La/f34; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/msj;->c(La/k34;)La/msj;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/osj;->p:La/msj;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    new-instance v1, La/a44;

    .line 40
    .line 41
    iget-object p0, p0, La/osj;->p:La/msj;

    .line 42
    .line 43
    iget-object p0, p0, La/msj;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Landroidx/media3/common/b;

    .line 46
    .line 47
    invoke-direct {v1, v0, p0}, La/a44;-><init>(Ljava/lang/Exception;Landroidx/media3/common/b;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/osj;->f()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final r()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/osj;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/osj;->g:La/rcf0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, La/b4x;->r(I)La/v3x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-virtual {v0}, La/v3x;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/v3x;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/u34;

    .line 22
    .line 23
    invoke-interface {v2}, La/u34;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, La/osj;->e:La/ytq0;

    .line 28
    .line 29
    invoke-virtual {v0}, La/rv5;->reset()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/osj;->f:La/ytq0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/rv5;->reset()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v2, v0, La/p34;->a:La/b4x;

    .line 42
    .line 43
    move v3, v1

    .line 44
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v3, v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, La/u34;

    .line 55
    .line 56
    sget-object v5, La/s34;->d:La/s34;

    .line 57
    .line 58
    invoke-interface {v4, v5}, La/u34;->c(La/s34;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v4}, La/u34;->reset()V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object v2, v0, La/p34;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    new-array v2, v1, [Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    iput-object v2, v0, La/p34;->c:[Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    sget-object v2, La/q34;->e:La/q34;

    .line 77
    .line 78
    iput-boolean v1, v0, La/p34;->d:Z

    .line 79
    .line 80
    :cond_2
    iput-boolean v1, p0, La/osj;->R:Z

    .line 81
    .line 82
    iput-boolean v1, p0, La/osj;->a0:Z

    .line 83
    .line 84
    return-void
.end method

.method public final s()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/osj;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 8
    .line 9
    iget-object v1, p0, La/osj;->x:La/zx90;

    .line 10
    .line 11
    iget-object v2, v0, La/l44;->a:Landroid/media/AudioTrack;

    .line 12
    .line 13
    new-instance v3, Landroid/media/PlaybackParams;

    .line 14
    .line 15
    invoke-direct {v3}, Landroid/media/PlaybackParams;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget v4, v1, La/zx90;->a:F

    .line 23
    .line 24
    const v5, 0x3dcccccd    # 0.1f

    .line 25
    .line 26
    .line 27
    const/high16 v6, 0x41000000    # 8.0f

    .line 28
    .line 29
    invoke-static {v4, v5, v6}, La/vtt0;->h(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v3, v4}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v1, v1, La/zx90;->b:F

    .line 38
    .line 39
    invoke-static {v1, v5, v6}, La/vtt0;->h(FFF)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v3, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-virtual {v1, v3}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v1

    .line 57
    const-string v3, "AudioTrackAudioOutput"

    .line 58
    .line 59
    const-string v4, "Failed to set playback params"

    .line 60
    .line 61
    invoke-static {v3, v4, v1}, La/f1t0;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v0, v0, La/l44;->e:La/o44;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput v1, v0, La/o44;->i:F

    .line 75
    .line 76
    iget-object v1, v0, La/o44;->h:La/g44;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {v1, v2}, La/g44;->a(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/o44;->e()V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, La/osj;->t:La/l44;

    .line 86
    .line 87
    iget-object v0, v0, La/l44;->a:Landroid/media/AudioTrack;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, La/zx90;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getPitch()F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-direct {v1, v2, v0}, La/zx90;-><init>(FF)V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, La/osj;->x:La/zx90;

    .line 107
    .line 108
    :cond_0
    return-void
.end method

.method public final t(Ljava/nio/ByteBuffer;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, v0, La/osj;->p:La/msj;

    .line 21
    .line 22
    invoke-virtual {v1}, La/msj;->f()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const-wide/16 v1, 0x14

    .line 30
    .line 31
    invoke-static {v1, v2}, La/vtt0;->M(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object v1, v0, La/osj;->p:La/msj;

    .line 36
    .line 37
    iget-object v1, v1, La/msj;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, La/k34;

    .line 40
    .line 41
    iget v1, v1, La/k34;->b:I

    .line 42
    .line 43
    int-to-long v5, v1

    .line 44
    const-wide/32 v7, 0xf4240

    .line 45
    .line 46
    .line 47
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 48
    .line 49
    invoke-static/range {v3 .. v9}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    long-to-int v1, v1

    .line 54
    invoke-virtual {v0}, La/osj;->j()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    int-to-long v4, v1

    .line 59
    cmp-long v6, v2, v4

    .line 60
    .line 61
    if-ltz v6, :cond_3

    .line 62
    .line 63
    :goto_1
    move-object/from16 v3, p1

    .line 64
    .line 65
    goto/16 :goto_d

    .line 66
    .line 67
    :cond_3
    iget-object v6, v0, La/osj;->p:La/msj;

    .line 68
    .line 69
    iget-object v7, v6, La/msj;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v7, La/k34;

    .line 72
    .line 73
    iget v7, v7, La/k34;->a:I

    .line 74
    .line 75
    iget v6, v6, La/msj;->b:I

    .line 76
    .line 77
    long-to-int v2, v2

    .line 78
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_21

    .line 103
    .line 104
    if-ge v2, v1, :cond_21

    .line 105
    .line 106
    const/high16 v13, 0x50000000

    .line 107
    .line 108
    const/high16 v14, 0x10000000

    .line 109
    .line 110
    const/16 v15, 0x16

    .line 111
    .line 112
    const/16 v9, 0x15

    .line 113
    .line 114
    const/4 v10, 0x4

    .line 115
    const/4 v11, 0x3

    .line 116
    const/4 v12, 0x2

    .line 117
    const-wide/high16 v16, -0x3e20000000000000L    # -2.147483648E9

    .line 118
    .line 119
    const-wide v18, 0x41dfffffffc00000L    # 2.147483647E9

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    const/high16 v20, -0x31000000

    .line 125
    .line 126
    const/high16 v21, 0x4f000000

    .line 127
    .line 128
    if-eq v7, v12, :cond_11

    .line 129
    .line 130
    if-eq v7, v11, :cond_10

    .line 131
    .line 132
    const/16 v22, 0x0

    .line 133
    .line 134
    const/high16 v11, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v12, -0x40800000    # -1.0f

    .line 137
    .line 138
    if-eq v7, v10, :cond_f

    .line 139
    .line 140
    if-eq v7, v9, :cond_e

    .line 141
    .line 142
    if-eq v7, v15, :cond_d

    .line 143
    .line 144
    if-eq v7, v14, :cond_c

    .line 145
    .line 146
    if-eq v7, v13, :cond_b

    .line 147
    .line 148
    const/high16 v13, 0x60000000

    .line 149
    .line 150
    if-eq v7, v13, :cond_a

    .line 151
    .line 152
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 153
    .line 154
    const-wide/high16 v9, -0x4010000000000000L    # -1.0

    .line 155
    .line 156
    const-wide/16 v23, 0x0

    .line 157
    .line 158
    const/high16 v13, 0x70000000

    .line 159
    .line 160
    if-eq v7, v13, :cond_9

    .line 161
    .line 162
    const/high16 v13, 0x71000000

    .line 163
    .line 164
    if-eq v7, v13, :cond_7

    .line 165
    .line 166
    const/high16 v13, 0x72000000

    .line 167
    .line 168
    if-ne v7, v13, :cond_6

    .line 169
    .line 170
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 171
    .line 172
    .line 173
    move-result-wide v11

    .line 174
    invoke-static {v11, v12}, Ljava/lang/Long;->reverseBytes(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v11

    .line 178
    invoke-static {v11, v12}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 179
    .line 180
    .line 181
    move-result-wide v11

    .line 182
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(DD)D

    .line 183
    .line 184
    .line 185
    move-result-wide v11

    .line 186
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(DD)D

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    cmpg-double v11, v9, v23

    .line 191
    .line 192
    if-gez v11, :cond_5

    .line 193
    .line 194
    :goto_3
    neg-double v9, v9

    .line 195
    mul-double v9, v9, v16

    .line 196
    .line 197
    :goto_4
    double-to-int v9, v9

    .line 198
    goto/16 :goto_9

    .line 199
    .line 200
    :cond_5
    mul-double v9, v9, v18

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    invoke-static {}, La/v4i0;->e()V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    invoke-static {v9}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    invoke-static {v9, v12, v11}, La/vtt0;->h(FFF)F

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    cmpg-float v10, v9, v22

    .line 224
    .line 225
    if-gez v10, :cond_8

    .line 226
    .line 227
    :goto_5
    neg-float v9, v9

    .line 228
    mul-float v9, v9, v20

    .line 229
    .line 230
    :goto_6
    float-to-int v9, v9

    .line 231
    goto/16 :goto_9

    .line 232
    .line 233
    :cond_8
    mul-float v9, v9, v21

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 237
    .line 238
    .line 239
    move-result-wide v11

    .line 240
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(DD)D

    .line 241
    .line 242
    .line 243
    move-result-wide v11

    .line 244
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(DD)D

    .line 245
    .line 246
    .line 247
    move-result-wide v9

    .line 248
    cmpg-double v11, v9, v23

    .line 249
    .line 250
    if-gez v11, :cond_5

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    and-int/lit16 v9, v9, 0xff

    .line 258
    .line 259
    shl-int/lit8 v9, v9, 0x18

    .line 260
    .line 261
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    and-int/lit16 v10, v10, 0xff

    .line 266
    .line 267
    shl-int/lit8 v10, v10, 0x10

    .line 268
    .line 269
    or-int/2addr v9, v10

    .line 270
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    and-int/lit16 v10, v10, 0xff

    .line 275
    .line 276
    shl-int/lit8 v10, v10, 0x8

    .line 277
    .line 278
    or-int/2addr v9, v10

    .line 279
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    and-int/lit16 v10, v10, 0xff

    .line 284
    .line 285
    :goto_7
    or-int/2addr v9, v10

    .line 286
    goto/16 :goto_9

    .line 287
    .line 288
    :cond_b
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    and-int/lit16 v9, v9, 0xff

    .line 293
    .line 294
    shl-int/lit8 v9, v9, 0x18

    .line 295
    .line 296
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    and-int/lit16 v10, v10, 0xff

    .line 301
    .line 302
    shl-int/lit8 v10, v10, 0x10

    .line 303
    .line 304
    or-int/2addr v9, v10

    .line 305
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    and-int/lit16 v10, v10, 0xff

    .line 310
    .line 311
    shl-int/lit8 v10, v10, 0x8

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    and-int/lit16 v9, v9, 0xff

    .line 319
    .line 320
    shl-int/lit8 v9, v9, 0x18

    .line 321
    .line 322
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    and-int/lit16 v10, v10, 0xff

    .line 327
    .line 328
    shl-int/lit8 v10, v10, 0x10

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    and-int/lit16 v9, v9, 0xff

    .line 336
    .line 337
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    and-int/lit16 v10, v10, 0xff

    .line 342
    .line 343
    shl-int/lit8 v10, v10, 0x8

    .line 344
    .line 345
    or-int/2addr v9, v10

    .line 346
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    and-int/lit16 v10, v10, 0xff

    .line 351
    .line 352
    shl-int/lit8 v10, v10, 0x10

    .line 353
    .line 354
    or-int/2addr v9, v10

    .line 355
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    :goto_8
    and-int/lit16 v10, v10, 0xff

    .line 360
    .line 361
    shl-int/lit8 v10, v10, 0x18

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_e
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    and-int/lit16 v9, v9, 0xff

    .line 369
    .line 370
    shl-int/lit8 v9, v9, 0x8

    .line 371
    .line 372
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    and-int/lit16 v10, v10, 0xff

    .line 377
    .line 378
    shl-int/lit8 v10, v10, 0x10

    .line 379
    .line 380
    or-int/2addr v9, v10

    .line 381
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    goto :goto_8

    .line 386
    :cond_f
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    invoke-static {v9, v12, v11}, La/vtt0;->h(FFF)F

    .line 391
    .line 392
    .line 393
    move-result v9

    .line 394
    cmpg-float v10, v9, v22

    .line 395
    .line 396
    if-gez v10, :cond_8

    .line 397
    .line 398
    goto/16 :goto_5

    .line 399
    .line 400
    :cond_10
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    and-int/lit16 v9, v9, 0xff

    .line 405
    .line 406
    add-int/lit8 v9, v9, -0x80

    .line 407
    .line 408
    shl-int/lit8 v9, v9, 0x18

    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_11
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    and-int/lit16 v9, v9, 0xff

    .line 416
    .line 417
    shl-int/lit8 v9, v9, 0x10

    .line 418
    .line 419
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    goto :goto_8

    .line 424
    :goto_9
    int-to-long v9, v9

    .line 425
    int-to-long v11, v2

    .line 426
    mul-long/2addr v9, v11

    .line 427
    div-long/2addr v9, v4

    .line 428
    long-to-int v9, v9

    .line 429
    const/4 v10, 0x2

    .line 430
    if-eq v7, v10, :cond_20

    .line 431
    .line 432
    const/4 v10, 0x3

    .line 433
    if-eq v7, v10, :cond_1f

    .line 434
    .line 435
    const/4 v10, 0x4

    .line 436
    if-eq v7, v10, :cond_1d

    .line 437
    .line 438
    const/16 v10, 0x15

    .line 439
    .line 440
    if-eq v7, v10, :cond_1c

    .line 441
    .line 442
    const/16 v10, 0x16

    .line 443
    .line 444
    if-eq v7, v10, :cond_1b

    .line 445
    .line 446
    const/high16 v13, 0x10000000

    .line 447
    .line 448
    if-eq v7, v13, :cond_1a

    .line 449
    .line 450
    const/high16 v10, 0x50000000

    .line 451
    .line 452
    if-eq v7, v10, :cond_19

    .line 453
    .line 454
    const/high16 v13, 0x60000000

    .line 455
    .line 456
    if-eq v7, v13, :cond_18

    .line 457
    .line 458
    const/high16 v13, 0x70000000

    .line 459
    .line 460
    if-eq v7, v13, :cond_16

    .line 461
    .line 462
    const/high16 v13, 0x71000000

    .line 463
    .line 464
    if-eq v7, v13, :cond_14

    .line 465
    .line 466
    const/high16 v13, 0x72000000

    .line 467
    .line 468
    if-ne v7, v13, :cond_13

    .line 469
    .line 470
    if-gez v9, :cond_12

    .line 471
    .line 472
    int-to-double v9, v9

    .line 473
    neg-double v9, v9

    .line 474
    div-double v9, v9, v16

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_12
    int-to-double v9, v9

    .line 478
    div-double v9, v9, v18

    .line 479
    .line 480
    :goto_a
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 481
    .line 482
    .line 483
    move-result-wide v9

    .line 484
    invoke-static {v9, v10}, Ljava/lang/Long;->reverseBytes(J)J

    .line 485
    .line 486
    .line 487
    move-result-wide v9

    .line 488
    invoke-virtual {v3, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 489
    .line 490
    .line 491
    goto/16 :goto_c

    .line 492
    .line 493
    :cond_13
    invoke-static {}, La/v4i0;->e()V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_14
    if-gez v9, :cond_15

    .line 498
    .line 499
    int-to-float v9, v9

    .line 500
    neg-float v9, v9

    .line 501
    div-float v9, v9, v20

    .line 502
    .line 503
    goto :goto_b

    .line 504
    :cond_15
    int-to-float v9, v9

    .line 505
    div-float v9, v9, v21

    .line 506
    .line 507
    :goto_b
    invoke-static {v9}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    invoke-static {v9}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 516
    .line 517
    .line 518
    goto/16 :goto_c

    .line 519
    .line 520
    :cond_16
    if-gez v9, :cond_17

    .line 521
    .line 522
    int-to-double v9, v9

    .line 523
    neg-double v9, v9

    .line 524
    div-double v9, v9, v16

    .line 525
    .line 526
    invoke-virtual {v3, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 527
    .line 528
    .line 529
    goto/16 :goto_c

    .line 530
    .line 531
    :cond_17
    int-to-double v9, v9

    .line 532
    div-double v9, v9, v18

    .line 533
    .line 534
    invoke-virtual {v3, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 535
    .line 536
    .line 537
    goto/16 :goto_c

    .line 538
    .line 539
    :cond_18
    shr-int/lit8 v10, v9, 0x18

    .line 540
    .line 541
    int-to-byte v10, v10

    .line 542
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 543
    .line 544
    .line 545
    shr-int/lit8 v10, v9, 0x10

    .line 546
    .line 547
    int-to-byte v10, v10

    .line 548
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 549
    .line 550
    .line 551
    shr-int/lit8 v10, v9, 0x8

    .line 552
    .line 553
    int-to-byte v10, v10

    .line 554
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 555
    .line 556
    .line 557
    int-to-byte v9, v9

    .line 558
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 559
    .line 560
    .line 561
    goto/16 :goto_c

    .line 562
    .line 563
    :cond_19
    shr-int/lit8 v10, v9, 0x18

    .line 564
    .line 565
    int-to-byte v10, v10

    .line 566
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 567
    .line 568
    .line 569
    shr-int/lit8 v10, v9, 0x10

    .line 570
    .line 571
    int-to-byte v10, v10

    .line 572
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 573
    .line 574
    .line 575
    shr-int/lit8 v9, v9, 0x8

    .line 576
    .line 577
    int-to-byte v9, v9

    .line 578
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 579
    .line 580
    .line 581
    goto :goto_c

    .line 582
    :cond_1a
    shr-int/lit8 v10, v9, 0x18

    .line 583
    .line 584
    int-to-byte v10, v10

    .line 585
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 586
    .line 587
    .line 588
    shr-int/lit8 v9, v9, 0x10

    .line 589
    .line 590
    int-to-byte v9, v9

    .line 591
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 592
    .line 593
    .line 594
    goto :goto_c

    .line 595
    :cond_1b
    int-to-byte v10, v9

    .line 596
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 597
    .line 598
    .line 599
    shr-int/lit8 v10, v9, 0x8

    .line 600
    .line 601
    int-to-byte v10, v10

    .line 602
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 603
    .line 604
    .line 605
    shr-int/lit8 v10, v9, 0x10

    .line 606
    .line 607
    int-to-byte v10, v10

    .line 608
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 609
    .line 610
    .line 611
    shr-int/lit8 v9, v9, 0x18

    .line 612
    .line 613
    int-to-byte v9, v9

    .line 614
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 615
    .line 616
    .line 617
    goto :goto_c

    .line 618
    :cond_1c
    shr-int/lit8 v10, v9, 0x8

    .line 619
    .line 620
    int-to-byte v10, v10

    .line 621
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 622
    .line 623
    .line 624
    shr-int/lit8 v10, v9, 0x10

    .line 625
    .line 626
    int-to-byte v10, v10

    .line 627
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 628
    .line 629
    .line 630
    shr-int/lit8 v9, v9, 0x18

    .line 631
    .line 632
    int-to-byte v9, v9

    .line 633
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 634
    .line 635
    .line 636
    goto :goto_c

    .line 637
    :cond_1d
    if-gez v9, :cond_1e

    .line 638
    .line 639
    int-to-float v9, v9

    .line 640
    neg-float v9, v9

    .line 641
    div-float v9, v9, v20

    .line 642
    .line 643
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 644
    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_1e
    int-to-float v9, v9

    .line 648
    div-float v9, v9, v21

    .line 649
    .line 650
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 651
    .line 652
    .line 653
    goto :goto_c

    .line 654
    :cond_1f
    shr-int/lit8 v9, v9, 0x18

    .line 655
    .line 656
    add-int/lit16 v9, v9, 0x80

    .line 657
    .line 658
    int-to-byte v9, v9

    .line 659
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 660
    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_20
    shr-int/lit8 v10, v9, 0x10

    .line 664
    .line 665
    int-to-byte v10, v10

    .line 666
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 667
    .line 668
    .line 669
    shr-int/lit8 v9, v9, 0x18

    .line 670
    .line 671
    int-to-byte v9, v9

    .line 672
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 673
    .line 674
    .line 675
    :goto_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 676
    .line 677
    .line 678
    move-result v9

    .line 679
    add-int v10, v8, v6

    .line 680
    .line 681
    if-ne v9, v10, :cond_4

    .line 682
    .line 683
    add-int/lit8 v2, v2, 0x1

    .line 684
    .line 685
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 686
    .line 687
    .line 688
    move-result v8

    .line 689
    goto/16 :goto_2

    .line 690
    .line 691
    :cond_21
    move-object/from16 v1, p1

    .line 692
    .line 693
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 697
    .line 698
    .line 699
    :goto_d
    iput-object v3, v0, La/osj;->N:Ljava/nio/ByteBuffer;

    .line 700
    .line 701
    return-void
.end method

.method public final u(J)V
    .locals 8

    .line 1
    iget-object v0, p0, La/osj;->p:La/msj;

    .line 2
    .line 3
    iget-object v1, v0, La/msj;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/p34;

    .line 6
    .line 7
    iput-object v1, p0, La/osj;->q:La/p34;

    .line 8
    .line 9
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v1, p1, v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-wide/16 p1, 0x0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-wide v1, p0, La/osj;->J:J

    .line 22
    .line 23
    sub-long/2addr p1, v1

    .line 24
    iget-object v1, v0, La/msj;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/bmq0;

    .line 27
    .line 28
    sget-object v2, La/bmq0;->a:La/zlq0;

    .line 29
    .line 30
    if-eq v1, v2, :cond_1

    .line 31
    .line 32
    iget-object v0, v0, La/msj;->h:Ljava/lang/Object;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    new-instance v0, La/amq0;

    .line 37
    .line 38
    invoke-direct {v0}, La/amq0;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, La/osj;->p:La/msj;

    .line 42
    .line 43
    iget-object v2, v1, La/msj;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, La/bmq0;

    .line 46
    .line 47
    iget-object v1, v1, La/msj;->h:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v2, v1, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 50
    .line 51
    .line 52
    iget-wide v0, v0, La/amq0;->e:J

    .line 53
    .line 54
    add-long/2addr p1, v0

    .line 55
    :cond_1
    :goto_0
    iget-object v0, p0, La/osj;->q:La/p34;

    .line 56
    .line 57
    new-instance v1, La/r34;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {v1, v2}, La/r34;-><init>(B)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, La/osj;->p:La/msj;

    .line 64
    .line 65
    iget-object v3, p0, La/msj;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, La/bmq0;

    .line 68
    .line 69
    iput-object v3, v1, La/r34;->b:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object p0, p0, La/msj;->h:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object p0, v1, La/r34;->c:Ljava/lang/Object;

    .line 74
    .line 75
    iput-wide p1, v1, La/r34;->a:J

    .line 76
    .line 77
    invoke-virtual {v1}, La/r34;->d()La/s34;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object p1, v0, La/p34;->a:La/b4x;

    .line 82
    .line 83
    iget-object p2, v0, La/p34;->b:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 86
    .line 87
    .line 88
    iput-boolean v2, v0, La/p34;->d:Z

    .line 89
    .line 90
    move v1, v2

    .line 91
    :goto_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ge v1, v3, :cond_3

    .line 96
    .line 97
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, La/u34;

    .line 102
    .line 103
    invoke-interface {v3, p0}, La/u34;->c(La/s34;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v3}, La/u34;->isActive()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    new-instance v4, La/r34;

    .line 114
    .line 115
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-wide v5, p0, La/s34;->a:J

    .line 119
    .line 120
    iput-wide v5, v4, La/r34;->a:J

    .line 121
    .line 122
    iget-object v7, p0, La/s34;->b:La/bmq0;

    .line 123
    .line 124
    iput-object v7, v4, La/r34;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object p0, p0, La/s34;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p0, v4, La/r34;->c:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-interface {v3, v5, v6}, La/u34;->g(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    iput-wide v5, v4, La/r34;->a:J

    .line 135
    .line 136
    invoke-virtual {v4}, La/r34;->d()La/s34;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    new-array p0, p0, [Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    iput-object p0, v0, La/p34;->c:[Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    :goto_3
    invoke-virtual {v0}, La/p34;->a()I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-gt v2, p0, :cond_4

    .line 159
    .line 160
    iget-object p0, v0, La/p34;->c:[Ljava/nio/ByteBuffer;

    .line 161
    .line 162
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, La/u34;

    .line 167
    .line 168
    invoke-interface {p1}, La/u34;->b()Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    aput-object p1, p0, v2

    .line 173
    .line 174
    add-int/lit8 v2, v2, 0x1

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_4
    return-void
.end method

.method public final v()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/osj;->p:La/msj;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/msj;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/k34;

    .line 8
    .line 9
    iget-boolean p0, p0, La/k34;->j:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method
