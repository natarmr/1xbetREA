.class public final La/xm30;
.super La/mm30;
.source "SourceFile"


# static fields
.field public static final f3:[I

.field public static g3:Z

.field public static h3:Z


# instance fields
.field public A2:Z

.field public B2:La/pfu0;

.field public C2:Z

.field public D2:I

.field public E2:Ljava/util/List;

.field public F2:Landroid/view/Surface;

.field public G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

.field public H2:La/e7k0;

.field public I2:Z

.field public J2:I

.field public K2:I

.field public L2:J

.field public M2:I

.field public N2:I

.field public O2:I

.field public P2:La/uch0;

.field public Q2:J

.field public R2:Z

.field public S2:J

.field public T2:I

.field public U2:J

.field public V2:La/qfu0;

.field public W2:La/qfu0;

.field public X2:I

.field public Y2:Z

.field public Z2:I

.field public a3:La/wm30;

.field public b3:La/seu0;

.field public c3:J

.field public d3:Z

.field public e3:I

.field public final k2:Landroid/content/Context;

.field public final l2:Z

.field public final m2:La/fck0;

.field public final n2:B

.field public final o2:Z

.field public final p2:La/ueu0;

.field public final q2:La/br8;

.field public final r2:La/fiq;

.field public final s2:La/yzn0;

.field public final t2:J

.field public final u2:La/veu0;

.field public final v2:Ljava/util/PriorityQueue;

.field public w2:La/j6;

.field public x2:Z

.field public y2:Z

.field public z2:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, La/xm30;->f3:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(La/vm30;)V
    .locals 7

    .line 1
    iget-object v0, p1, La/vm30;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x2

    .line 8
    iget-object v3, p1, La/vm30;->c:La/dwj;

    .line 9
    .line 10
    invoke-direct {p0, v1, v2, v3}, La/mm30;-><init>(Landroid/content/Context;ILa/cm30;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/xm30;->k2:Landroid/content/Context;

    .line 18
    .line 19
    iget-byte v1, p1, La/vm30;->g:B

    .line 20
    .line 21
    iput-byte v1, p0, La/xm30;->n2:B

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, La/xm30;->B2:La/pfu0;

    .line 25
    .line 26
    new-instance v2, La/fck0;

    .line 27
    .line 28
    iget-object v3, p1, La/vm30;->e:Landroid/os/Handler;

    .line 29
    .line 30
    iget-object v4, p1, La/vm30;->f:La/qlo;

    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, La/fck0;-><init>(Landroid/os/Handler;La/qlo;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, La/xm30;->m2:La/fck0;

    .line 36
    .line 37
    iget-object v2, p0, La/xm30;->B2:La/pfu0;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    move v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v2, v4

    .line 46
    :goto_0
    iput-boolean v2, p0, La/xm30;->l2:Z

    .line 47
    .line 48
    new-instance v2, La/ueu0;

    .line 49
    .line 50
    iget-short p1, p1, La/vm30;->d:S

    .line 51
    .line 52
    int-to-long v5, p1

    .line 53
    invoke-direct {v2, v0, p0, v5, v6}, La/ueu0;-><init>(Landroid/content/Context;La/xm30;J)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, La/xm30;->p2:La/ueu0;

    .line 57
    .line 58
    new-instance p1, La/br8;

    .line 59
    .line 60
    invoke-direct {p1}, La/br8;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/xm30;->q2:La/br8;

    .line 64
    .line 65
    new-instance p1, La/fiq;

    .line 66
    .line 67
    new-instance v0, La/viq;

    .line 68
    .line 69
    const/16 v2, 0x15

    .line 70
    .line 71
    invoke-direct {v0, p0, v2}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v0}, La/fiq;-><init>(La/diq;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, La/xm30;->r2:La/fiq;

    .line 78
    .line 79
    sget-object p1, La/hn30;->a:Ljava/util/HashSet;

    .line 80
    .line 81
    const-string p1, "NVIDIA"

    .line 82
    .line 83
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput-boolean p1, p0, La/xm30;->o2:Z

    .line 90
    .line 91
    sget-object p1, La/e7k0;->c:La/e7k0;

    .line 92
    .line 93
    iput-object p1, p0, La/xm30;->H2:La/e7k0;

    .line 94
    .line 95
    iput v3, p0, La/xm30;->J2:I

    .line 96
    .line 97
    iput v4, p0, La/xm30;->K2:I

    .line 98
    .line 99
    sget-object p1, La/qfu0;->d:La/qfu0;

    .line 100
    .line 101
    iput-object p1, p0, La/xm30;->V2:La/qfu0;

    .line 102
    .line 103
    iput v4, p0, La/xm30;->Z2:I

    .line 104
    .line 105
    iput-object v1, p0, La/xm30;->W2:La/qfu0;

    .line 106
    .line 107
    const/16 p1, -0x3e8

    .line 108
    .line 109
    iput p1, p0, La/xm30;->X2:I

    .line 110
    .line 111
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    iput-wide v2, p0, La/xm30;->c3:J

    .line 117
    .line 118
    new-instance p1, La/yzn0;

    .line 119
    .line 120
    const/16 v0, 0xa

    .line 121
    .line 122
    invoke-direct {p1, v0}, La/yzn0;-><init>(B)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, La/xm30;->s2:La/yzn0;

    .line 126
    .line 127
    new-instance p1, Ljava/util/PriorityQueue;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, La/xm30;->v2:Ljava/util/PriorityQueue;

    .line 133
    .line 134
    const-wide/16 v2, -0x3a98

    .line 135
    .line 136
    iput-wide v2, p0, La/xm30;->t2:J

    .line 137
    .line 138
    new-instance p1, La/veu0;

    .line 139
    .line 140
    invoke-direct {p1}, La/veu0;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, La/xm30;->u2:La/veu0;

    .line 144
    .line 145
    iput-object v1, p0, La/xm30;->P2:La/uch0;

    .line 146
    .line 147
    return-void
.end method

.method public static G0(Ljava/lang/String;)Z
    .locals 17

    .line 1
    const-string v0, "OMX.google"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-class v2, La/xm30;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    sget-boolean v0, La/xm30;->g3:Z

    .line 17
    .line 18
    if-nez v0, :cond_a2

    .line 19
    .line 20
    sget-object v0, La/hn30;->a:Ljava/util/HashSet;

    .line 21
    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v3, 0x1c

    .line 25
    .line 26
    const/4 v4, 0x7

    .line 27
    const/4 v5, 0x6

    .line 28
    const/4 v6, 0x5

    .line 29
    const/4 v7, 0x4

    .line 30
    const/4 v8, 0x3

    .line 31
    const/4 v9, 0x2

    .line 32
    const/4 v10, -0x1

    .line 33
    const/4 v11, 0x1

    .line 34
    if-gt v0, v3, :cond_a

    .line 35
    .line 36
    sget-object v12, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v13

    .line 45
    sparse-switch v13, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    :goto_0
    move v12, v10

    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :sswitch_0
    const-string v13, "machuca"

    .line 52
    .line 53
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v12, v4

    .line 61
    goto :goto_1

    .line 62
    :sswitch_1
    const-string v13, "once"

    .line 63
    .line 64
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-nez v12, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v12, v5

    .line 72
    goto :goto_1

    .line 73
    :sswitch_2
    const-string v13, "magnolia"

    .line 74
    .line 75
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-nez v12, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move v12, v6

    .line 83
    goto :goto_1

    .line 84
    :sswitch_3
    const-string v13, "aquaman"

    .line 85
    .line 86
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-nez v12, :cond_4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    move v12, v7

    .line 94
    goto :goto_1

    .line 95
    :sswitch_4
    const-string v13, "oneday"

    .line 96
    .line 97
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-nez v12, :cond_5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    move v12, v8

    .line 105
    goto :goto_1

    .line 106
    :sswitch_5
    const-string v13, "dangalUHD"

    .line 107
    .line 108
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-nez v12, :cond_6

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    move v12, v9

    .line 116
    goto :goto_1

    .line 117
    :sswitch_6
    const-string v13, "dangalFHD"

    .line 118
    .line 119
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    if-nez v12, :cond_7

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    move v12, v11

    .line 127
    goto :goto_1

    .line 128
    :sswitch_7
    const-string v13, "dangal"

    .line 129
    .line 130
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-nez v12, :cond_8

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_8
    move v12, v1

    .line 138
    :goto_1
    packed-switch v12, :pswitch_data_0

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    :goto_2
    :pswitch_0
    move v1, v11

    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_a
    :goto_3
    const/16 v12, 0x1b

    .line 146
    .line 147
    if-gt v0, v12, :cond_b

    .line 148
    .line 149
    :try_start_1
    const-string v13, "HWEML"

    .line 150
    .line 151
    sget-object v14, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_b

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_b
    sget-object v13, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 163
    .line 164
    .line 165
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    const/16 v15, 0x8

    .line 170
    .line 171
    sparse-switch v14, :sswitch_data_1

    .line 172
    .line 173
    .line 174
    :goto_4
    move v14, v10

    .line 175
    goto/16 :goto_5

    .line 176
    .line 177
    :sswitch_8
    const-string v14, "AFTEUFF014"

    .line 178
    .line 179
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-nez v14, :cond_c

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_c
    move v14, v15

    .line 187
    goto/16 :goto_5

    .line 188
    .line 189
    :sswitch_9
    const-string v14, "AFTSO001"

    .line 190
    .line 191
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    if-nez v14, :cond_d

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_d
    move v14, v4

    .line 199
    goto :goto_5

    .line 200
    :sswitch_a
    const-string v14, "AFTEU014"

    .line 201
    .line 202
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-nez v14, :cond_e

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_e
    move v14, v5

    .line 210
    goto :goto_5

    .line 211
    :sswitch_b
    const-string v14, "AFTEU011"

    .line 212
    .line 213
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v14

    .line 217
    if-nez v14, :cond_f

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_f
    move v14, v6

    .line 221
    goto :goto_5

    .line 222
    :sswitch_c
    const-string v14, "AFTR"

    .line 223
    .line 224
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-nez v14, :cond_10

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_10
    move v14, v7

    .line 232
    goto :goto_5

    .line 233
    :sswitch_d
    const-string v14, "AFTN"

    .line 234
    .line 235
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-nez v14, :cond_11

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_11
    move v14, v8

    .line 243
    goto :goto_5

    .line 244
    :sswitch_e
    const-string v14, "AFTA"

    .line 245
    .line 246
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v14

    .line 250
    if-nez v14, :cond_12

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_12
    move v14, v9

    .line 254
    goto :goto_5

    .line 255
    :sswitch_f
    const-string v14, "AFTKMST12"

    .line 256
    .line 257
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    if-nez v14, :cond_13

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_13
    move v14, v11

    .line 265
    goto :goto_5

    .line 266
    :sswitch_10
    const-string v14, "AFTJMST12"

    .line 267
    .line 268
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    if-nez v14, :cond_14

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_14
    move v14, v1

    .line 276
    :goto_5
    packed-switch v14, :pswitch_data_1

    .line 277
    .line 278
    .line 279
    const/16 v14, 0x1a

    .line 280
    .line 281
    if-gt v0, v14, :cond_a1

    .line 282
    .line 283
    :try_start_2
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 289
    .line 290
    .line 291
    move-result v16

    .line 292
    sparse-switch v16, :sswitch_data_2

    .line 293
    .line 294
    .line 295
    :goto_6
    move v3, v10

    .line 296
    goto/16 :goto_7

    .line 297
    .line 298
    :sswitch_11
    const-string v3, "HWWAS-H"

    .line 299
    .line 300
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-nez v0, :cond_15

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_15
    const/16 v3, 0x8b

    .line 308
    .line 309
    goto/16 :goto_7

    .line 310
    .line 311
    :sswitch_12
    const-string v3, "HWVNS-H"

    .line 312
    .line 313
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_16

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_16
    const/16 v3, 0x8a

    .line 321
    .line 322
    goto/16 :goto_7

    .line 323
    .line 324
    :sswitch_13
    const-string v3, "ELUGA_Prim"

    .line 325
    .line 326
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_17

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_17
    const/16 v3, 0x89

    .line 334
    .line 335
    goto/16 :goto_7

    .line 336
    .line 337
    :sswitch_14
    const-string v3, "ELUGA_Note"

    .line 338
    .line 339
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-nez v0, :cond_18

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_18
    const/16 v3, 0x88

    .line 347
    .line 348
    goto/16 :goto_7

    .line 349
    .line 350
    :sswitch_15
    const-string v3, "ASUS_X00AD_2"

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_19

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_19
    const/16 v3, 0x87

    .line 360
    .line 361
    goto/16 :goto_7

    .line 362
    .line 363
    :sswitch_16
    const-string v3, "HWCAM-H"

    .line 364
    .line 365
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_1a

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_1a
    const/16 v3, 0x86

    .line 373
    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :sswitch_17
    const-string v3, "HWBLN-H"

    .line 377
    .line 378
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_1b

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_1b
    const/16 v3, 0x85

    .line 386
    .line 387
    goto/16 :goto_7

    .line 388
    .line 389
    :sswitch_18
    const-string v3, "DM-01K"

    .line 390
    .line 391
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-nez v0, :cond_1c

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_1c
    const/16 v3, 0x84

    .line 399
    .line 400
    goto/16 :goto_7

    .line 401
    .line 402
    :sswitch_19
    const-string v3, "BRAVIA_ATV3_4K"

    .line 403
    .line 404
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_1d

    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_1d
    const/16 v3, 0x83

    .line 412
    .line 413
    goto/16 :goto_7

    .line 414
    .line 415
    :sswitch_1a
    const-string v3, "Infinix-X572"

    .line 416
    .line 417
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_1e

    .line 422
    .line 423
    goto/16 :goto_6

    .line 424
    .line 425
    :cond_1e
    const/16 v3, 0x82

    .line 426
    .line 427
    goto/16 :goto_7

    .line 428
    .line 429
    :sswitch_1b
    const-string v3, "PB2-670M"

    .line 430
    .line 431
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_1f

    .line 436
    .line 437
    goto/16 :goto_6

    .line 438
    .line 439
    :cond_1f
    const/16 v3, 0x81

    .line 440
    .line 441
    goto/16 :goto_7

    .line 442
    .line 443
    :sswitch_1c
    const-string v3, "santoni"

    .line 444
    .line 445
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-nez v0, :cond_20

    .line 450
    .line 451
    goto/16 :goto_6

    .line 452
    .line 453
    :cond_20
    const/16 v3, 0x80

    .line 454
    .line 455
    goto/16 :goto_7

    .line 456
    .line 457
    :sswitch_1d
    const-string v3, "iball8735_9806"

    .line 458
    .line 459
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-nez v0, :cond_21

    .line 464
    .line 465
    goto/16 :goto_6

    .line 466
    .line 467
    :cond_21
    const/16 v3, 0x7f

    .line 468
    .line 469
    goto/16 :goto_7

    .line 470
    .line 471
    :sswitch_1e
    const-string v3, "CPH1715"

    .line 472
    .line 473
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-nez v0, :cond_22

    .line 478
    .line 479
    goto/16 :goto_6

    .line 480
    .line 481
    :cond_22
    const/16 v3, 0x7e

    .line 482
    .line 483
    goto/16 :goto_7

    .line 484
    .line 485
    :sswitch_1f
    const-string v3, "CPH1609"

    .line 486
    .line 487
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-nez v0, :cond_23

    .line 492
    .line 493
    goto/16 :goto_6

    .line 494
    .line 495
    :cond_23
    const/16 v3, 0x7d

    .line 496
    .line 497
    goto/16 :goto_7

    .line 498
    .line 499
    :sswitch_20
    const-string v3, "woods_f"

    .line 500
    .line 501
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-nez v0, :cond_24

    .line 506
    .line 507
    goto/16 :goto_6

    .line 508
    .line 509
    :cond_24
    const/16 v3, 0x7c

    .line 510
    .line 511
    goto/16 :goto_7

    .line 512
    .line 513
    :sswitch_21
    const-string v3, "htc_e56ml_dtul"

    .line 514
    .line 515
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-nez v0, :cond_25

    .line 520
    .line 521
    goto/16 :goto_6

    .line 522
    .line 523
    :cond_25
    const/16 v3, 0x7b

    .line 524
    .line 525
    goto/16 :goto_7

    .line 526
    .line 527
    :sswitch_22
    const-string v3, "EverStar_S"

    .line 528
    .line 529
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-nez v0, :cond_26

    .line 534
    .line 535
    goto/16 :goto_6

    .line 536
    .line 537
    :cond_26
    const/16 v3, 0x7a

    .line 538
    .line 539
    goto/16 :goto_7

    .line 540
    .line 541
    :sswitch_23
    const-string v3, "hwALE-H"

    .line 542
    .line 543
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-nez v0, :cond_27

    .line 548
    .line 549
    goto/16 :goto_6

    .line 550
    .line 551
    :cond_27
    const/16 v3, 0x79

    .line 552
    .line 553
    goto/16 :goto_7

    .line 554
    .line 555
    :sswitch_24
    const-string v3, "itel_S41"

    .line 556
    .line 557
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-nez v0, :cond_28

    .line 562
    .line 563
    goto/16 :goto_6

    .line 564
    .line 565
    :cond_28
    const/16 v3, 0x78

    .line 566
    .line 567
    goto/16 :goto_7

    .line 568
    .line 569
    :sswitch_25
    const-string v3, "LS-5017"

    .line 570
    .line 571
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-nez v0, :cond_29

    .line 576
    .line 577
    goto/16 :goto_6

    .line 578
    .line 579
    :cond_29
    const/16 v3, 0x77

    .line 580
    .line 581
    goto/16 :goto_7

    .line 582
    .line 583
    :sswitch_26
    const-string v3, "panell_d"

    .line 584
    .line 585
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-nez v0, :cond_2a

    .line 590
    .line 591
    goto/16 :goto_6

    .line 592
    .line 593
    :cond_2a
    const/16 v3, 0x76

    .line 594
    .line 595
    goto/16 :goto_7

    .line 596
    .line 597
    :sswitch_27
    const-string v3, "j2xlteins"

    .line 598
    .line 599
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-nez v0, :cond_2b

    .line 604
    .line 605
    goto/16 :goto_6

    .line 606
    .line 607
    :cond_2b
    const/16 v3, 0x75

    .line 608
    .line 609
    goto/16 :goto_7

    .line 610
    .line 611
    :sswitch_28
    const-string v3, "A7000plus"

    .line 612
    .line 613
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-nez v0, :cond_2c

    .line 618
    .line 619
    goto/16 :goto_6

    .line 620
    .line 621
    :cond_2c
    const/16 v3, 0x74

    .line 622
    .line 623
    goto/16 :goto_7

    .line 624
    .line 625
    :sswitch_29
    const-string v3, "manning"

    .line 626
    .line 627
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-nez v0, :cond_2d

    .line 632
    .line 633
    goto/16 :goto_6

    .line 634
    .line 635
    :cond_2d
    const/16 v3, 0x73

    .line 636
    .line 637
    goto/16 :goto_7

    .line 638
    .line 639
    :sswitch_2a
    const-string v3, "GIONEE_WBL7519"

    .line 640
    .line 641
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    if-nez v0, :cond_2e

    .line 646
    .line 647
    goto/16 :goto_6

    .line 648
    .line 649
    :cond_2e
    const/16 v3, 0x72

    .line 650
    .line 651
    goto/16 :goto_7

    .line 652
    .line 653
    :sswitch_2b
    const-string v3, "GIONEE_WBL7365"

    .line 654
    .line 655
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-nez v0, :cond_2f

    .line 660
    .line 661
    goto/16 :goto_6

    .line 662
    .line 663
    :cond_2f
    const/16 v3, 0x71

    .line 664
    .line 665
    goto/16 :goto_7

    .line 666
    .line 667
    :sswitch_2c
    const-string v3, "GIONEE_WBL5708"

    .line 668
    .line 669
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-nez v0, :cond_30

    .line 674
    .line 675
    goto/16 :goto_6

    .line 676
    .line 677
    :cond_30
    const/16 v3, 0x70

    .line 678
    .line 679
    goto/16 :goto_7

    .line 680
    .line 681
    :sswitch_2d
    const-string v3, "QM16XE_U"

    .line 682
    .line 683
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-nez v0, :cond_31

    .line 688
    .line 689
    goto/16 :goto_6

    .line 690
    .line 691
    :cond_31
    const/16 v3, 0x6f

    .line 692
    .line 693
    goto/16 :goto_7

    .line 694
    .line 695
    :sswitch_2e
    const-string v3, "Pixi5-10_4G"

    .line 696
    .line 697
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-nez v0, :cond_32

    .line 702
    .line 703
    goto/16 :goto_6

    .line 704
    .line 705
    :cond_32
    const/16 v3, 0x6e

    .line 706
    .line 707
    goto/16 :goto_7

    .line 708
    .line 709
    :sswitch_2f
    const-string v3, "TB3-850M"

    .line 710
    .line 711
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-nez v0, :cond_33

    .line 716
    .line 717
    goto/16 :goto_6

    .line 718
    .line 719
    :cond_33
    const/16 v3, 0x6d

    .line 720
    .line 721
    goto/16 :goto_7

    .line 722
    .line 723
    :sswitch_30
    const-string v3, "TB3-850F"

    .line 724
    .line 725
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    if-nez v0, :cond_34

    .line 730
    .line 731
    goto/16 :goto_6

    .line 732
    .line 733
    :cond_34
    const/16 v3, 0x6c

    .line 734
    .line 735
    goto/16 :goto_7

    .line 736
    .line 737
    :sswitch_31
    const-string v3, "TB3-730X"

    .line 738
    .line 739
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-nez v0, :cond_35

    .line 744
    .line 745
    goto/16 :goto_6

    .line 746
    .line 747
    :cond_35
    const/16 v3, 0x6b

    .line 748
    .line 749
    goto/16 :goto_7

    .line 750
    .line 751
    :sswitch_32
    const-string v3, "TB3-730F"

    .line 752
    .line 753
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    if-nez v0, :cond_36

    .line 758
    .line 759
    goto/16 :goto_6

    .line 760
    .line 761
    :cond_36
    const/16 v3, 0x6a

    .line 762
    .line 763
    goto/16 :goto_7

    .line 764
    .line 765
    :sswitch_33
    const-string v3, "A7020a48"

    .line 766
    .line 767
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-nez v0, :cond_37

    .line 772
    .line 773
    goto/16 :goto_6

    .line 774
    .line 775
    :cond_37
    const/16 v3, 0x69

    .line 776
    .line 777
    goto/16 :goto_7

    .line 778
    .line 779
    :sswitch_34
    const-string v3, "A7010a48"

    .line 780
    .line 781
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-nez v0, :cond_38

    .line 786
    .line 787
    goto/16 :goto_6

    .line 788
    .line 789
    :cond_38
    const/16 v3, 0x68

    .line 790
    .line 791
    goto/16 :goto_7

    .line 792
    .line 793
    :sswitch_35
    const-string v3, "griffin"

    .line 794
    .line 795
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    if-nez v0, :cond_39

    .line 800
    .line 801
    goto/16 :goto_6

    .line 802
    .line 803
    :cond_39
    const/16 v3, 0x67

    .line 804
    .line 805
    goto/16 :goto_7

    .line 806
    .line 807
    :sswitch_36
    const-string v3, "marino_f"

    .line 808
    .line 809
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    if-nez v0, :cond_3a

    .line 814
    .line 815
    goto/16 :goto_6

    .line 816
    .line 817
    :cond_3a
    const/16 v3, 0x66

    .line 818
    .line 819
    goto/16 :goto_7

    .line 820
    .line 821
    :sswitch_37
    const-string v3, "CPY83_I00"

    .line 822
    .line 823
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-nez v0, :cond_3b

    .line 828
    .line 829
    goto/16 :goto_6

    .line 830
    .line 831
    :cond_3b
    const/16 v3, 0x65

    .line 832
    .line 833
    goto/16 :goto_7

    .line 834
    .line 835
    :sswitch_38
    const-string v3, "A2016a40"

    .line 836
    .line 837
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    if-nez v0, :cond_3c

    .line 842
    .line 843
    goto/16 :goto_6

    .line 844
    .line 845
    :cond_3c
    const/16 v3, 0x64

    .line 846
    .line 847
    goto/16 :goto_7

    .line 848
    .line 849
    :sswitch_39
    const-string v3, "le_x6"

    .line 850
    .line 851
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    if-nez v0, :cond_3d

    .line 856
    .line 857
    goto/16 :goto_6

    .line 858
    .line 859
    :cond_3d
    const/16 v3, 0x63

    .line 860
    .line 861
    goto/16 :goto_7

    .line 862
    .line 863
    :sswitch_3a
    const-string v3, "l5460"

    .line 864
    .line 865
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    if-nez v0, :cond_3e

    .line 870
    .line 871
    goto/16 :goto_6

    .line 872
    .line 873
    :cond_3e
    const/16 v3, 0x62

    .line 874
    .line 875
    goto/16 :goto_7

    .line 876
    .line 877
    :sswitch_3b
    const-string v3, "i9031"

    .line 878
    .line 879
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-nez v0, :cond_3f

    .line 884
    .line 885
    goto/16 :goto_6

    .line 886
    .line 887
    :cond_3f
    const/16 v3, 0x61

    .line 888
    .line 889
    goto/16 :goto_7

    .line 890
    .line 891
    :sswitch_3c
    const-string v3, "X3_HK"

    .line 892
    .line 893
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v0

    .line 897
    if-nez v0, :cond_40

    .line 898
    .line 899
    goto/16 :goto_6

    .line 900
    .line 901
    :cond_40
    const/16 v3, 0x60

    .line 902
    .line 903
    goto/16 :goto_7

    .line 904
    .line 905
    :sswitch_3d
    const-string v3, "V23GB"

    .line 906
    .line 907
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-nez v0, :cond_41

    .line 912
    .line 913
    goto/16 :goto_6

    .line 914
    .line 915
    :cond_41
    const/16 v3, 0x5f

    .line 916
    .line 917
    goto/16 :goto_7

    .line 918
    .line 919
    :sswitch_3e
    const-string v3, "Q4310"

    .line 920
    .line 921
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    if-nez v0, :cond_42

    .line 926
    .line 927
    goto/16 :goto_6

    .line 928
    .line 929
    :cond_42
    const/16 v3, 0x5e

    .line 930
    .line 931
    goto/16 :goto_7

    .line 932
    .line 933
    :sswitch_3f
    const-string v3, "Q4260"

    .line 934
    .line 935
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    if-nez v0, :cond_43

    .line 940
    .line 941
    goto/16 :goto_6

    .line 942
    .line 943
    :cond_43
    const/16 v3, 0x5d

    .line 944
    .line 945
    goto/16 :goto_7

    .line 946
    .line 947
    :sswitch_40
    const-string v3, "PRO7S"

    .line 948
    .line 949
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    if-nez v0, :cond_44

    .line 954
    .line 955
    goto/16 :goto_6

    .line 956
    .line 957
    :cond_44
    const/16 v3, 0x5c

    .line 958
    .line 959
    goto/16 :goto_7

    .line 960
    .line 961
    :sswitch_41
    const-string v3, "F3311"

    .line 962
    .line 963
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v0

    .line 967
    if-nez v0, :cond_45

    .line 968
    .line 969
    goto/16 :goto_6

    .line 970
    .line 971
    :cond_45
    const/16 v3, 0x5b

    .line 972
    .line 973
    goto/16 :goto_7

    .line 974
    .line 975
    :sswitch_42
    const-string v3, "F3215"

    .line 976
    .line 977
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    if-nez v0, :cond_46

    .line 982
    .line 983
    goto/16 :goto_6

    .line 984
    .line 985
    :cond_46
    const/16 v3, 0x5a

    .line 986
    .line 987
    goto/16 :goto_7

    .line 988
    .line 989
    :sswitch_43
    const-string v3, "F3213"

    .line 990
    .line 991
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    if-nez v0, :cond_47

    .line 996
    .line 997
    goto/16 :goto_6

    .line 998
    .line 999
    :cond_47
    const/16 v3, 0x59

    .line 1000
    .line 1001
    goto/16 :goto_7

    .line 1002
    .line 1003
    :sswitch_44
    const-string v3, "F3211"

    .line 1004
    .line 1005
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    if-nez v0, :cond_48

    .line 1010
    .line 1011
    goto/16 :goto_6

    .line 1012
    .line 1013
    :cond_48
    const/16 v3, 0x58

    .line 1014
    .line 1015
    goto/16 :goto_7

    .line 1016
    .line 1017
    :sswitch_45
    const-string v3, "F3116"

    .line 1018
    .line 1019
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    if-nez v0, :cond_49

    .line 1024
    .line 1025
    goto/16 :goto_6

    .line 1026
    .line 1027
    :cond_49
    const/16 v3, 0x57

    .line 1028
    .line 1029
    goto/16 :goto_7

    .line 1030
    .line 1031
    :sswitch_46
    const-string v3, "F3113"

    .line 1032
    .line 1033
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    if-nez v0, :cond_4a

    .line 1038
    .line 1039
    goto/16 :goto_6

    .line 1040
    .line 1041
    :cond_4a
    const/16 v3, 0x56

    .line 1042
    .line 1043
    goto/16 :goto_7

    .line 1044
    .line 1045
    :sswitch_47
    const-string v3, "F3111"

    .line 1046
    .line 1047
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-nez v0, :cond_4b

    .line 1052
    .line 1053
    goto/16 :goto_6

    .line 1054
    .line 1055
    :cond_4b
    const/16 v3, 0x55

    .line 1056
    .line 1057
    goto/16 :goto_7

    .line 1058
    .line 1059
    :sswitch_48
    const-string v3, "E5643"

    .line 1060
    .line 1061
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v0

    .line 1065
    if-nez v0, :cond_4c

    .line 1066
    .line 1067
    goto/16 :goto_6

    .line 1068
    .line 1069
    :cond_4c
    const/16 v3, 0x54

    .line 1070
    .line 1071
    goto/16 :goto_7

    .line 1072
    .line 1073
    :sswitch_49
    const-string v3, "A1601"

    .line 1074
    .line 1075
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    if-nez v0, :cond_4d

    .line 1080
    .line 1081
    goto/16 :goto_6

    .line 1082
    .line 1083
    :cond_4d
    const/16 v3, 0x53

    .line 1084
    .line 1085
    goto/16 :goto_7

    .line 1086
    .line 1087
    :sswitch_4a
    const-string v3, "Aura_Note_2"

    .line 1088
    .line 1089
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    if-nez v0, :cond_4e

    .line 1094
    .line 1095
    goto/16 :goto_6

    .line 1096
    .line 1097
    :cond_4e
    const/16 v3, 0x52

    .line 1098
    .line 1099
    goto/16 :goto_7

    .line 1100
    .line 1101
    :sswitch_4b
    const-string v3, "602LV"

    .line 1102
    .line 1103
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v0

    .line 1107
    if-nez v0, :cond_4f

    .line 1108
    .line 1109
    goto/16 :goto_6

    .line 1110
    .line 1111
    :cond_4f
    const/16 v3, 0x51

    .line 1112
    .line 1113
    goto/16 :goto_7

    .line 1114
    .line 1115
    :sswitch_4c
    const-string v3, "601LV"

    .line 1116
    .line 1117
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-nez v0, :cond_50

    .line 1122
    .line 1123
    goto/16 :goto_6

    .line 1124
    .line 1125
    :cond_50
    const/16 v3, 0x50

    .line 1126
    .line 1127
    goto/16 :goto_7

    .line 1128
    .line 1129
    :sswitch_4d
    const-string v3, "MEIZU_M5"

    .line 1130
    .line 1131
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v0

    .line 1135
    if-nez v0, :cond_51

    .line 1136
    .line 1137
    goto/16 :goto_6

    .line 1138
    .line 1139
    :cond_51
    const/16 v3, 0x4f

    .line 1140
    .line 1141
    goto/16 :goto_7

    .line 1142
    .line 1143
    :sswitch_4e
    const-string v3, "p212"

    .line 1144
    .line 1145
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v0

    .line 1149
    if-nez v0, :cond_52

    .line 1150
    .line 1151
    goto/16 :goto_6

    .line 1152
    .line 1153
    :cond_52
    const/16 v3, 0x4e

    .line 1154
    .line 1155
    goto/16 :goto_7

    .line 1156
    .line 1157
    :sswitch_4f
    const-string v3, "mido"

    .line 1158
    .line 1159
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    if-nez v0, :cond_53

    .line 1164
    .line 1165
    goto/16 :goto_6

    .line 1166
    .line 1167
    :cond_53
    const/16 v3, 0x4d

    .line 1168
    .line 1169
    goto/16 :goto_7

    .line 1170
    .line 1171
    :sswitch_50
    const-string v3, "kate"

    .line 1172
    .line 1173
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    if-nez v0, :cond_54

    .line 1178
    .line 1179
    goto/16 :goto_6

    .line 1180
    .line 1181
    :cond_54
    const/16 v3, 0x4c

    .line 1182
    .line 1183
    goto/16 :goto_7

    .line 1184
    .line 1185
    :sswitch_51
    const-string v3, "fugu"

    .line 1186
    .line 1187
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    if-nez v0, :cond_55

    .line 1192
    .line 1193
    goto/16 :goto_6

    .line 1194
    .line 1195
    :cond_55
    const/16 v3, 0x4b

    .line 1196
    .line 1197
    goto/16 :goto_7

    .line 1198
    .line 1199
    :sswitch_52
    const-string v3, "XE2X"

    .line 1200
    .line 1201
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    if-nez v0, :cond_56

    .line 1206
    .line 1207
    goto/16 :goto_6

    .line 1208
    .line 1209
    :cond_56
    const/16 v3, 0x4a

    .line 1210
    .line 1211
    goto/16 :goto_7

    .line 1212
    .line 1213
    :sswitch_53
    const-string v3, "Q427"

    .line 1214
    .line 1215
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v0

    .line 1219
    if-nez v0, :cond_57

    .line 1220
    .line 1221
    goto/16 :goto_6

    .line 1222
    .line 1223
    :cond_57
    const/16 v3, 0x49

    .line 1224
    .line 1225
    goto/16 :goto_7

    .line 1226
    .line 1227
    :sswitch_54
    const-string v3, "Q350"

    .line 1228
    .line 1229
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    if-nez v0, :cond_58

    .line 1234
    .line 1235
    goto/16 :goto_6

    .line 1236
    .line 1237
    :cond_58
    const/16 v3, 0x48

    .line 1238
    .line 1239
    goto/16 :goto_7

    .line 1240
    .line 1241
    :sswitch_55
    const-string v3, "P681"

    .line 1242
    .line 1243
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-nez v0, :cond_59

    .line 1248
    .line 1249
    goto/16 :goto_6

    .line 1250
    .line 1251
    :cond_59
    const/16 v3, 0x47

    .line 1252
    .line 1253
    goto/16 :goto_7

    .line 1254
    .line 1255
    :sswitch_56
    const-string v3, "F04J"

    .line 1256
    .line 1257
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v0

    .line 1261
    if-nez v0, :cond_5a

    .line 1262
    .line 1263
    goto/16 :goto_6

    .line 1264
    .line 1265
    :cond_5a
    const/16 v3, 0x46

    .line 1266
    .line 1267
    goto/16 :goto_7

    .line 1268
    .line 1269
    :sswitch_57
    const-string v3, "F04H"

    .line 1270
    .line 1271
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v0

    .line 1275
    if-nez v0, :cond_5b

    .line 1276
    .line 1277
    goto/16 :goto_6

    .line 1278
    .line 1279
    :cond_5b
    const/16 v3, 0x45

    .line 1280
    .line 1281
    goto/16 :goto_7

    .line 1282
    .line 1283
    :sswitch_58
    const-string v3, "F03H"

    .line 1284
    .line 1285
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    if-nez v0, :cond_5c

    .line 1290
    .line 1291
    goto/16 :goto_6

    .line 1292
    .line 1293
    :cond_5c
    const/16 v3, 0x44

    .line 1294
    .line 1295
    goto/16 :goto_7

    .line 1296
    .line 1297
    :sswitch_59
    const-string v3, "F02H"

    .line 1298
    .line 1299
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v0

    .line 1303
    if-nez v0, :cond_5d

    .line 1304
    .line 1305
    goto/16 :goto_6

    .line 1306
    .line 1307
    :cond_5d
    const/16 v3, 0x43

    .line 1308
    .line 1309
    goto/16 :goto_7

    .line 1310
    .line 1311
    :sswitch_5a
    const-string v3, "F01J"

    .line 1312
    .line 1313
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    if-nez v0, :cond_5e

    .line 1318
    .line 1319
    goto/16 :goto_6

    .line 1320
    .line 1321
    :cond_5e
    const/16 v3, 0x42

    .line 1322
    .line 1323
    goto/16 :goto_7

    .line 1324
    .line 1325
    :sswitch_5b
    const-string v3, "F01H"

    .line 1326
    .line 1327
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v0

    .line 1331
    if-nez v0, :cond_5f

    .line 1332
    .line 1333
    goto/16 :goto_6

    .line 1334
    .line 1335
    :cond_5f
    const/16 v3, 0x41

    .line 1336
    .line 1337
    goto/16 :goto_7

    .line 1338
    .line 1339
    :sswitch_5c
    const-string v3, "1714"

    .line 1340
    .line 1341
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v0

    .line 1345
    if-nez v0, :cond_60

    .line 1346
    .line 1347
    goto/16 :goto_6

    .line 1348
    .line 1349
    :cond_60
    const/16 v3, 0x40

    .line 1350
    .line 1351
    goto/16 :goto_7

    .line 1352
    .line 1353
    :sswitch_5d
    const-string v3, "1713"

    .line 1354
    .line 1355
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v0

    .line 1359
    if-nez v0, :cond_61

    .line 1360
    .line 1361
    goto/16 :goto_6

    .line 1362
    .line 1363
    :cond_61
    const/16 v3, 0x3f

    .line 1364
    .line 1365
    goto/16 :goto_7

    .line 1366
    .line 1367
    :sswitch_5e
    const-string v3, "1601"

    .line 1368
    .line 1369
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    if-nez v0, :cond_62

    .line 1374
    .line 1375
    goto/16 :goto_6

    .line 1376
    .line 1377
    :cond_62
    const/16 v3, 0x3e

    .line 1378
    .line 1379
    goto/16 :goto_7

    .line 1380
    .line 1381
    :sswitch_5f
    const-string v3, "flo"

    .line 1382
    .line 1383
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1384
    .line 1385
    .line 1386
    move-result v0

    .line 1387
    if-nez v0, :cond_63

    .line 1388
    .line 1389
    goto/16 :goto_6

    .line 1390
    .line 1391
    :cond_63
    const/16 v3, 0x3d

    .line 1392
    .line 1393
    goto/16 :goto_7

    .line 1394
    .line 1395
    :sswitch_60
    const-string v3, "deb"

    .line 1396
    .line 1397
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v0

    .line 1401
    if-nez v0, :cond_64

    .line 1402
    .line 1403
    goto/16 :goto_6

    .line 1404
    .line 1405
    :cond_64
    const/16 v3, 0x3c

    .line 1406
    .line 1407
    goto/16 :goto_7

    .line 1408
    .line 1409
    :sswitch_61
    const-string v3, "cv3"

    .line 1410
    .line 1411
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v0

    .line 1415
    if-nez v0, :cond_65

    .line 1416
    .line 1417
    goto/16 :goto_6

    .line 1418
    .line 1419
    :cond_65
    const/16 v3, 0x3b

    .line 1420
    .line 1421
    goto/16 :goto_7

    .line 1422
    .line 1423
    :sswitch_62
    const-string v3, "cv1"

    .line 1424
    .line 1425
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v0

    .line 1429
    if-nez v0, :cond_66

    .line 1430
    .line 1431
    goto/16 :goto_6

    .line 1432
    .line 1433
    :cond_66
    const/16 v3, 0x3a

    .line 1434
    .line 1435
    goto/16 :goto_7

    .line 1436
    .line 1437
    :sswitch_63
    const-string v3, "Z80"

    .line 1438
    .line 1439
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1440
    .line 1441
    .line 1442
    move-result v0

    .line 1443
    if-nez v0, :cond_67

    .line 1444
    .line 1445
    goto/16 :goto_6

    .line 1446
    .line 1447
    :cond_67
    const/16 v3, 0x39

    .line 1448
    .line 1449
    goto/16 :goto_7

    .line 1450
    .line 1451
    :sswitch_64
    const-string v3, "QX1"

    .line 1452
    .line 1453
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1454
    .line 1455
    .line 1456
    move-result v0

    .line 1457
    if-nez v0, :cond_68

    .line 1458
    .line 1459
    goto/16 :goto_6

    .line 1460
    .line 1461
    :cond_68
    const/16 v3, 0x38

    .line 1462
    .line 1463
    goto/16 :goto_7

    .line 1464
    .line 1465
    :sswitch_65
    const-string v3, "PLE"

    .line 1466
    .line 1467
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v0

    .line 1471
    if-nez v0, :cond_69

    .line 1472
    .line 1473
    goto/16 :goto_6

    .line 1474
    .line 1475
    :cond_69
    const/16 v3, 0x37

    .line 1476
    .line 1477
    goto/16 :goto_7

    .line 1478
    .line 1479
    :sswitch_66
    const-string v3, "P85"

    .line 1480
    .line 1481
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1482
    .line 1483
    .line 1484
    move-result v0

    .line 1485
    if-nez v0, :cond_6a

    .line 1486
    .line 1487
    goto/16 :goto_6

    .line 1488
    .line 1489
    :cond_6a
    const/16 v3, 0x36

    .line 1490
    .line 1491
    goto/16 :goto_7

    .line 1492
    .line 1493
    :sswitch_67
    const-string v3, "MX6"

    .line 1494
    .line 1495
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v0

    .line 1499
    if-nez v0, :cond_6b

    .line 1500
    .line 1501
    goto/16 :goto_6

    .line 1502
    .line 1503
    :cond_6b
    const/16 v3, 0x35

    .line 1504
    .line 1505
    goto/16 :goto_7

    .line 1506
    .line 1507
    :sswitch_68
    const-string v3, "M5c"

    .line 1508
    .line 1509
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v0

    .line 1513
    if-nez v0, :cond_6c

    .line 1514
    .line 1515
    goto/16 :goto_6

    .line 1516
    .line 1517
    :cond_6c
    const/16 v3, 0x34

    .line 1518
    .line 1519
    goto/16 :goto_7

    .line 1520
    .line 1521
    :sswitch_69
    const-string v3, "M04"

    .line 1522
    .line 1523
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v0

    .line 1527
    if-nez v0, :cond_6d

    .line 1528
    .line 1529
    goto/16 :goto_6

    .line 1530
    .line 1531
    :cond_6d
    const/16 v3, 0x33

    .line 1532
    .line 1533
    goto/16 :goto_7

    .line 1534
    .line 1535
    :sswitch_6a
    const-string v3, "JGZ"

    .line 1536
    .line 1537
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result v0

    .line 1541
    if-nez v0, :cond_6e

    .line 1542
    .line 1543
    goto/16 :goto_6

    .line 1544
    .line 1545
    :cond_6e
    const/16 v3, 0x32

    .line 1546
    .line 1547
    goto/16 :goto_7

    .line 1548
    .line 1549
    :sswitch_6b
    const-string v3, "mh"

    .line 1550
    .line 1551
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1552
    .line 1553
    .line 1554
    move-result v0

    .line 1555
    if-nez v0, :cond_6f

    .line 1556
    .line 1557
    goto/16 :goto_6

    .line 1558
    .line 1559
    :cond_6f
    const/16 v3, 0x31

    .line 1560
    .line 1561
    goto/16 :goto_7

    .line 1562
    .line 1563
    :sswitch_6c
    const-string v3, "b5"

    .line 1564
    .line 1565
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v0

    .line 1569
    if-nez v0, :cond_70

    .line 1570
    .line 1571
    goto/16 :goto_6

    .line 1572
    .line 1573
    :cond_70
    const/16 v3, 0x30

    .line 1574
    .line 1575
    goto/16 :goto_7

    .line 1576
    .line 1577
    :sswitch_6d
    const-string v3, "V5"

    .line 1578
    .line 1579
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v0

    .line 1583
    if-nez v0, :cond_71

    .line 1584
    .line 1585
    goto/16 :goto_6

    .line 1586
    .line 1587
    :cond_71
    const/16 v3, 0x2f

    .line 1588
    .line 1589
    goto/16 :goto_7

    .line 1590
    .line 1591
    :sswitch_6e
    const-string v3, "V1"

    .line 1592
    .line 1593
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v0

    .line 1597
    if-nez v0, :cond_72

    .line 1598
    .line 1599
    goto/16 :goto_6

    .line 1600
    .line 1601
    :cond_72
    const/16 v3, 0x2e

    .line 1602
    .line 1603
    goto/16 :goto_7

    .line 1604
    .line 1605
    :sswitch_6f
    const-string v3, "Q5"

    .line 1606
    .line 1607
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    if-nez v0, :cond_73

    .line 1612
    .line 1613
    goto/16 :goto_6

    .line 1614
    .line 1615
    :cond_73
    const/16 v3, 0x2d

    .line 1616
    .line 1617
    goto/16 :goto_7

    .line 1618
    .line 1619
    :sswitch_70
    const-string v3, "C1"

    .line 1620
    .line 1621
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v0

    .line 1625
    if-nez v0, :cond_74

    .line 1626
    .line 1627
    goto/16 :goto_6

    .line 1628
    .line 1629
    :cond_74
    const/16 v3, 0x2c

    .line 1630
    .line 1631
    goto/16 :goto_7

    .line 1632
    .line 1633
    :sswitch_71
    const-string v3, "woods_fn"

    .line 1634
    .line 1635
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v0

    .line 1639
    if-nez v0, :cond_75

    .line 1640
    .line 1641
    goto/16 :goto_6

    .line 1642
    .line 1643
    :cond_75
    const/16 v3, 0x2b

    .line 1644
    .line 1645
    goto/16 :goto_7

    .line 1646
    .line 1647
    :sswitch_72
    const-string v3, "ELUGA_A3_Pro"

    .line 1648
    .line 1649
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v0

    .line 1653
    if-nez v0, :cond_76

    .line 1654
    .line 1655
    goto/16 :goto_6

    .line 1656
    .line 1657
    :cond_76
    const/16 v3, 0x2a

    .line 1658
    .line 1659
    goto/16 :goto_7

    .line 1660
    .line 1661
    :sswitch_73
    const-string v3, "Z12_PRO"

    .line 1662
    .line 1663
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v0

    .line 1667
    if-nez v0, :cond_77

    .line 1668
    .line 1669
    goto/16 :goto_6

    .line 1670
    .line 1671
    :cond_77
    const/16 v3, 0x29

    .line 1672
    .line 1673
    goto/16 :goto_7

    .line 1674
    .line 1675
    :sswitch_74
    const-string v3, "BLACK-1X"

    .line 1676
    .line 1677
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v0

    .line 1681
    if-nez v0, :cond_78

    .line 1682
    .line 1683
    goto/16 :goto_6

    .line 1684
    .line 1685
    :cond_78
    const/16 v3, 0x28

    .line 1686
    .line 1687
    goto/16 :goto_7

    .line 1688
    .line 1689
    :sswitch_75
    const-string v3, "taido_row"

    .line 1690
    .line 1691
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1692
    .line 1693
    .line 1694
    move-result v0

    .line 1695
    if-nez v0, :cond_79

    .line 1696
    .line 1697
    goto/16 :goto_6

    .line 1698
    .line 1699
    :cond_79
    const/16 v3, 0x27

    .line 1700
    .line 1701
    goto/16 :goto_7

    .line 1702
    .line 1703
    :sswitch_76
    const-string v3, "Pixi4-7_3G"

    .line 1704
    .line 1705
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    if-nez v0, :cond_7a

    .line 1710
    .line 1711
    goto/16 :goto_6

    .line 1712
    .line 1713
    :cond_7a
    const/16 v3, 0x26

    .line 1714
    .line 1715
    goto/16 :goto_7

    .line 1716
    .line 1717
    :sswitch_77
    const-string v3, "GIONEE_GBL7360"

    .line 1718
    .line 1719
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1720
    .line 1721
    .line 1722
    move-result v0

    .line 1723
    if-nez v0, :cond_7b

    .line 1724
    .line 1725
    goto/16 :goto_6

    .line 1726
    .line 1727
    :cond_7b
    const/16 v3, 0x25

    .line 1728
    .line 1729
    goto/16 :goto_7

    .line 1730
    .line 1731
    :sswitch_78
    const-string v3, "GiONEE_CBL7513"

    .line 1732
    .line 1733
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    if-nez v0, :cond_7c

    .line 1738
    .line 1739
    goto/16 :goto_6

    .line 1740
    .line 1741
    :cond_7c
    const/16 v3, 0x24

    .line 1742
    .line 1743
    goto/16 :goto_7

    .line 1744
    .line 1745
    :sswitch_79
    const-string v3, "OnePlus5T"

    .line 1746
    .line 1747
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v0

    .line 1751
    if-nez v0, :cond_7d

    .line 1752
    .line 1753
    goto/16 :goto_6

    .line 1754
    .line 1755
    :cond_7d
    const/16 v3, 0x23

    .line 1756
    .line 1757
    goto/16 :goto_7

    .line 1758
    .line 1759
    :sswitch_7a
    const-string v3, "whyred"

    .line 1760
    .line 1761
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v0

    .line 1765
    if-nez v0, :cond_7e

    .line 1766
    .line 1767
    goto/16 :goto_6

    .line 1768
    .line 1769
    :cond_7e
    const/16 v3, 0x22

    .line 1770
    .line 1771
    goto/16 :goto_7

    .line 1772
    .line 1773
    :sswitch_7b
    const-string v3, "watson"

    .line 1774
    .line 1775
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v0

    .line 1779
    if-nez v0, :cond_7f

    .line 1780
    .line 1781
    goto/16 :goto_6

    .line 1782
    .line 1783
    :cond_7f
    const/16 v3, 0x21

    .line 1784
    .line 1785
    goto/16 :goto_7

    .line 1786
    .line 1787
    :sswitch_7c
    const-string v3, "SVP-DTV15"

    .line 1788
    .line 1789
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v0

    .line 1793
    if-nez v0, :cond_80

    .line 1794
    .line 1795
    goto/16 :goto_6

    .line 1796
    .line 1797
    :cond_80
    const/16 v3, 0x20

    .line 1798
    .line 1799
    goto/16 :goto_7

    .line 1800
    .line 1801
    :sswitch_7d
    const-string v3, "A7000-a"

    .line 1802
    .line 1803
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1804
    .line 1805
    .line 1806
    move-result v0

    .line 1807
    if-nez v0, :cond_81

    .line 1808
    .line 1809
    goto/16 :goto_6

    .line 1810
    .line 1811
    :cond_81
    const/16 v3, 0x1f

    .line 1812
    .line 1813
    goto/16 :goto_7

    .line 1814
    .line 1815
    :sswitch_7e
    const-string v3, "nicklaus_f"

    .line 1816
    .line 1817
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1818
    .line 1819
    .line 1820
    move-result v0

    .line 1821
    if-nez v0, :cond_82

    .line 1822
    .line 1823
    goto/16 :goto_6

    .line 1824
    .line 1825
    :cond_82
    const/16 v3, 0x1e

    .line 1826
    .line 1827
    goto/16 :goto_7

    .line 1828
    .line 1829
    :sswitch_7f
    const-string v3, "tcl_eu"

    .line 1830
    .line 1831
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v0

    .line 1835
    if-nez v0, :cond_83

    .line 1836
    .line 1837
    goto/16 :goto_6

    .line 1838
    .line 1839
    :cond_83
    const/16 v3, 0x1d

    .line 1840
    .line 1841
    goto/16 :goto_7

    .line 1842
    .line 1843
    :sswitch_80
    const-string v4, "ELUGA_Ray_X"

    .line 1844
    .line 1845
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v0

    .line 1849
    if-nez v0, :cond_a0

    .line 1850
    .line 1851
    goto/16 :goto_6

    .line 1852
    .line 1853
    :sswitch_81
    const-string v3, "s905x018"

    .line 1854
    .line 1855
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v0

    .line 1859
    if-nez v0, :cond_84

    .line 1860
    .line 1861
    goto/16 :goto_6

    .line 1862
    .line 1863
    :cond_84
    move v3, v12

    .line 1864
    goto/16 :goto_7

    .line 1865
    .line 1866
    :sswitch_82
    const-string v3, "A10-70L"

    .line 1867
    .line 1868
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1869
    .line 1870
    .line 1871
    move-result v0

    .line 1872
    if-nez v0, :cond_85

    .line 1873
    .line 1874
    goto/16 :goto_6

    .line 1875
    .line 1876
    :cond_85
    move v3, v14

    .line 1877
    goto/16 :goto_7

    .line 1878
    .line 1879
    :sswitch_83
    const-string v3, "A10-70F"

    .line 1880
    .line 1881
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1882
    .line 1883
    .line 1884
    move-result v0

    .line 1885
    if-nez v0, :cond_86

    .line 1886
    .line 1887
    goto/16 :goto_6

    .line 1888
    .line 1889
    :cond_86
    const/16 v3, 0x19

    .line 1890
    .line 1891
    goto/16 :goto_7

    .line 1892
    .line 1893
    :sswitch_84
    const-string v3, "namath"

    .line 1894
    .line 1895
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1896
    .line 1897
    .line 1898
    move-result v0

    .line 1899
    if-nez v0, :cond_87

    .line 1900
    .line 1901
    goto/16 :goto_6

    .line 1902
    .line 1903
    :cond_87
    const/16 v3, 0x18

    .line 1904
    .line 1905
    goto/16 :goto_7

    .line 1906
    .line 1907
    :sswitch_85
    const-string v3, "Slate_Pro"

    .line 1908
    .line 1909
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1910
    .line 1911
    .line 1912
    move-result v0

    .line 1913
    if-nez v0, :cond_88

    .line 1914
    .line 1915
    goto/16 :goto_6

    .line 1916
    .line 1917
    :cond_88
    const/16 v3, 0x17

    .line 1918
    .line 1919
    goto/16 :goto_7

    .line 1920
    .line 1921
    :sswitch_86
    const-string v3, "iris60"

    .line 1922
    .line 1923
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v0

    .line 1927
    if-nez v0, :cond_89

    .line 1928
    .line 1929
    goto/16 :goto_6

    .line 1930
    .line 1931
    :cond_89
    const/16 v3, 0x16

    .line 1932
    .line 1933
    goto/16 :goto_7

    .line 1934
    .line 1935
    :sswitch_87
    const-string v3, "BRAVIA_ATV2"

    .line 1936
    .line 1937
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v0

    .line 1941
    if-nez v0, :cond_8a

    .line 1942
    .line 1943
    goto/16 :goto_6

    .line 1944
    .line 1945
    :cond_8a
    const/16 v3, 0x15

    .line 1946
    .line 1947
    goto/16 :goto_7

    .line 1948
    .line 1949
    :sswitch_88
    const-string v3, "GiONEE_GBL7319"

    .line 1950
    .line 1951
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1952
    .line 1953
    .line 1954
    move-result v0

    .line 1955
    if-nez v0, :cond_8b

    .line 1956
    .line 1957
    goto/16 :goto_6

    .line 1958
    .line 1959
    :cond_8b
    const/16 v3, 0x14

    .line 1960
    .line 1961
    goto/16 :goto_7

    .line 1962
    .line 1963
    :sswitch_89
    const-string v3, "panell_dt"

    .line 1964
    .line 1965
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1966
    .line 1967
    .line 1968
    move-result v0

    .line 1969
    if-nez v0, :cond_8c

    .line 1970
    .line 1971
    goto/16 :goto_6

    .line 1972
    .line 1973
    :cond_8c
    const/16 v3, 0x13

    .line 1974
    .line 1975
    goto/16 :goto_7

    .line 1976
    .line 1977
    :sswitch_8a
    const-string v3, "panell_ds"

    .line 1978
    .line 1979
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1980
    .line 1981
    .line 1982
    move-result v0

    .line 1983
    if-nez v0, :cond_8d

    .line 1984
    .line 1985
    goto/16 :goto_6

    .line 1986
    .line 1987
    :cond_8d
    const/16 v3, 0x12

    .line 1988
    .line 1989
    goto/16 :goto_7

    .line 1990
    .line 1991
    :sswitch_8b
    const-string v3, "panell_dl"

    .line 1992
    .line 1993
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1994
    .line 1995
    .line 1996
    move-result v0

    .line 1997
    if-nez v0, :cond_8e

    .line 1998
    .line 1999
    goto/16 :goto_6

    .line 2000
    .line 2001
    :cond_8e
    const/16 v3, 0x11

    .line 2002
    .line 2003
    goto/16 :goto_7

    .line 2004
    .line 2005
    :sswitch_8c
    const-string v3, "vernee_M5"

    .line 2006
    .line 2007
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2008
    .line 2009
    .line 2010
    move-result v0

    .line 2011
    if-nez v0, :cond_8f

    .line 2012
    .line 2013
    goto/16 :goto_6

    .line 2014
    .line 2015
    :cond_8f
    const/16 v3, 0x10

    .line 2016
    .line 2017
    goto/16 :goto_7

    .line 2018
    .line 2019
    :sswitch_8d
    const-string v3, "pacificrim"

    .line 2020
    .line 2021
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2022
    .line 2023
    .line 2024
    move-result v0

    .line 2025
    if-nez v0, :cond_90

    .line 2026
    .line 2027
    goto/16 :goto_6

    .line 2028
    .line 2029
    :cond_90
    const/16 v3, 0xf

    .line 2030
    .line 2031
    goto/16 :goto_7

    .line 2032
    .line 2033
    :sswitch_8e
    const-string v3, "Phantom6"

    .line 2034
    .line 2035
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2036
    .line 2037
    .line 2038
    move-result v0

    .line 2039
    if-nez v0, :cond_91

    .line 2040
    .line 2041
    goto/16 :goto_6

    .line 2042
    .line 2043
    :cond_91
    const/16 v3, 0xe

    .line 2044
    .line 2045
    goto/16 :goto_7

    .line 2046
    .line 2047
    :sswitch_8f
    const-string v3, "ComioS1"

    .line 2048
    .line 2049
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2050
    .line 2051
    .line 2052
    move-result v0

    .line 2053
    if-nez v0, :cond_92

    .line 2054
    .line 2055
    goto/16 :goto_6

    .line 2056
    .line 2057
    :cond_92
    const/16 v3, 0xd

    .line 2058
    .line 2059
    goto/16 :goto_7

    .line 2060
    .line 2061
    :sswitch_90
    const-string v3, "XT1663"

    .line 2062
    .line 2063
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2064
    .line 2065
    .line 2066
    move-result v0

    .line 2067
    if-nez v0, :cond_93

    .line 2068
    .line 2069
    goto/16 :goto_6

    .line 2070
    .line 2071
    :cond_93
    const/16 v3, 0xc

    .line 2072
    .line 2073
    goto/16 :goto_7

    .line 2074
    .line 2075
    :sswitch_91
    const-string v3, "RAIJIN"

    .line 2076
    .line 2077
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2078
    .line 2079
    .line 2080
    move-result v0

    .line 2081
    if-nez v0, :cond_94

    .line 2082
    .line 2083
    goto/16 :goto_6

    .line 2084
    .line 2085
    :cond_94
    const/16 v3, 0xb

    .line 2086
    .line 2087
    goto/16 :goto_7

    .line 2088
    .line 2089
    :sswitch_92
    const-string v3, "AquaPowerM"

    .line 2090
    .line 2091
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2092
    .line 2093
    .line 2094
    move-result v0

    .line 2095
    if-nez v0, :cond_95

    .line 2096
    .line 2097
    goto/16 :goto_6

    .line 2098
    .line 2099
    :cond_95
    const/16 v3, 0xa

    .line 2100
    .line 2101
    goto/16 :goto_7

    .line 2102
    .line 2103
    :sswitch_93
    const-string v3, "PGN611"

    .line 2104
    .line 2105
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2106
    .line 2107
    .line 2108
    move-result v0

    .line 2109
    if-nez v0, :cond_96

    .line 2110
    .line 2111
    goto/16 :goto_6

    .line 2112
    .line 2113
    :cond_96
    const/16 v3, 0x9

    .line 2114
    .line 2115
    goto/16 :goto_7

    .line 2116
    .line 2117
    :sswitch_94
    const-string v3, "PGN610"

    .line 2118
    .line 2119
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v0

    .line 2123
    if-nez v0, :cond_97

    .line 2124
    .line 2125
    goto/16 :goto_6

    .line 2126
    .line 2127
    :cond_97
    move v3, v15

    .line 2128
    goto/16 :goto_7

    .line 2129
    .line 2130
    :sswitch_95
    const-string v3, "PGN528"

    .line 2131
    .line 2132
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2133
    .line 2134
    .line 2135
    move-result v0

    .line 2136
    if-nez v0, :cond_98

    .line 2137
    .line 2138
    goto/16 :goto_6

    .line 2139
    .line 2140
    :cond_98
    move v3, v4

    .line 2141
    goto :goto_7

    .line 2142
    :sswitch_96
    const-string v3, "NX573J"

    .line 2143
    .line 2144
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2145
    .line 2146
    .line 2147
    move-result v0

    .line 2148
    if-nez v0, :cond_99

    .line 2149
    .line 2150
    goto/16 :goto_6

    .line 2151
    .line 2152
    :cond_99
    move v3, v5

    .line 2153
    goto :goto_7

    .line 2154
    :sswitch_97
    const-string v3, "NX541J"

    .line 2155
    .line 2156
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2157
    .line 2158
    .line 2159
    move-result v0

    .line 2160
    if-nez v0, :cond_9a

    .line 2161
    .line 2162
    goto/16 :goto_6

    .line 2163
    .line 2164
    :cond_9a
    move v3, v6

    .line 2165
    goto :goto_7

    .line 2166
    :sswitch_98
    const-string v3, "CP8676_I02"

    .line 2167
    .line 2168
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2169
    .line 2170
    .line 2171
    move-result v0

    .line 2172
    if-nez v0, :cond_9b

    .line 2173
    .line 2174
    goto/16 :goto_6

    .line 2175
    .line 2176
    :cond_9b
    move v3, v7

    .line 2177
    goto :goto_7

    .line 2178
    :sswitch_99
    const-string v3, "K50a40"

    .line 2179
    .line 2180
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2181
    .line 2182
    .line 2183
    move-result v0

    .line 2184
    if-nez v0, :cond_9c

    .line 2185
    .line 2186
    goto/16 :goto_6

    .line 2187
    .line 2188
    :cond_9c
    move v3, v8

    .line 2189
    goto :goto_7

    .line 2190
    :sswitch_9a
    const-string v3, "GIONEE_SWW1631"

    .line 2191
    .line 2192
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2193
    .line 2194
    .line 2195
    move-result v0

    .line 2196
    if-nez v0, :cond_9d

    .line 2197
    .line 2198
    goto/16 :goto_6

    .line 2199
    .line 2200
    :cond_9d
    move v3, v9

    .line 2201
    goto :goto_7

    .line 2202
    :sswitch_9b
    const-string v3, "GIONEE_SWW1627"

    .line 2203
    .line 2204
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    move-result v0

    .line 2208
    if-nez v0, :cond_9e

    .line 2209
    .line 2210
    goto/16 :goto_6

    .line 2211
    .line 2212
    :cond_9e
    move v3, v11

    .line 2213
    goto :goto_7

    .line 2214
    :sswitch_9c
    const-string v3, "GIONEE_SWW1609"

    .line 2215
    .line 2216
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2217
    .line 2218
    .line 2219
    move-result v0

    .line 2220
    if-nez v0, :cond_9f

    .line 2221
    .line 2222
    goto/16 :goto_6

    .line 2223
    .line 2224
    :cond_9f
    move v3, v1

    .line 2225
    :cond_a0
    :goto_7
    packed-switch v3, :pswitch_data_2

    .line 2226
    .line 2227
    .line 2228
    const-string v0, "JSN-L21"

    .line 2229
    .line 2230
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2231
    .line 2232
    .line 2233
    move-result v0

    .line 2234
    if-nez v0, :cond_9

    .line 2235
    .line 2236
    :cond_a1
    :goto_8
    :try_start_3
    sput-boolean v1, La/xm30;->h3:Z

    .line 2237
    .line 2238
    sput-boolean v11, La/xm30;->g3:Z

    .line 2239
    .line 2240
    goto :goto_9

    .line 2241
    :catchall_0
    move-exception v0

    .line 2242
    goto :goto_a

    .line 2243
    :cond_a2
    :goto_9
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2244
    sget-boolean v0, La/xm30;->h3:Z

    .line 2245
    .line 2246
    return v0

    .line 2247
    :goto_a
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 2248
    throw v0

    .line 2249
    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static H0(La/jm30;Landroidx/media3/common/b;)I
    .locals 11

    .line 1
    iget v0, p1, Landroidx/media3/common/b;->w:I

    .line 2
    .line 3
    iget v1, p1, Landroidx/media3/common/b;->x:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v0, v2, :cond_d

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-object v3, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v4, "video/dolby-vision"

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const-string v5, "video/avc"

    .line 24
    .line 25
    const-string v6, "video/av01"

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    const-string v8, "video/hevc"

    .line 29
    .line 30
    const/4 v9, 0x2

    .line 31
    if-eqz v4, :cond_4

    .line 32
    .line 33
    invoke-static {p1}, La/jyc;->b(Landroidx/media3/common/b;)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/16 v3, 0x200

    .line 48
    .line 49
    if-eq p1, v3, :cond_2

    .line 50
    .line 51
    if-eq p1, v7, :cond_2

    .line 52
    .line 53
    if-ne p1, v9, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/16 v3, 0x400

    .line 57
    .line 58
    if-ne p1, v3, :cond_3

    .line 59
    .line 60
    move-object v3, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    move-object v3, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-object v3, v8

    .line 65
    :cond_4
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/4 v4, 0x4

    .line 70
    const/4 v10, 0x3

    .line 71
    sparse-switch p1, :sswitch_data_0

    .line 72
    .line 73
    .line 74
    :goto_2
    move v7, v2

    .line 75
    goto :goto_3

    .line 76
    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    .line 77
    .line 78
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const/4 v7, 0x6

    .line 86
    goto :goto_3

    .line 87
    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    .line 88
    .line 89
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    const/4 v7, 0x5

    .line 97
    goto :goto_3

    .line 98
    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_7

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    move v7, v4

    .line 106
    goto :goto_3

    .line 107
    :sswitch_3
    const-string p1, "video/mp4v-es"

    .line 108
    .line 109
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    move v7, v10

    .line 117
    goto :goto_3

    .line 118
    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_9

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_9
    move v7, v9

    .line 126
    goto :goto_3

    .line 127
    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_b

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :sswitch_6
    const-string p1, "video/3gpp"

    .line 135
    .line 136
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_a

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_a
    const/4 v7, 0x0

    .line 144
    :cond_b
    :goto_3
    packed-switch v7, :pswitch_data_0

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :pswitch_0
    mul-int/2addr v0, v1

    .line 149
    mul-int/2addr v0, v10

    .line 150
    div-int/lit8 v0, v0, 0x8

    .line 151
    .line 152
    return v0

    .line 153
    :pswitch_1
    sget-object p1, La/hn30;->a:Ljava/util/HashSet;

    .line 154
    .line 155
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 156
    .line 157
    const-string v3, "BRAVIA 4K 2015"

    .line 158
    .line 159
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_d

    .line 164
    .line 165
    const-string v3, "Amazon"

    .line 166
    .line 167
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_c

    .line 174
    .line 175
    const-string v3, "KFSOWI"

    .line 176
    .line 177
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_d

    .line 182
    .line 183
    const-string v3, "AFTS"

    .line 184
    .line 185
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_c

    .line 190
    .line 191
    iget-boolean p0, p0, La/jm30;->f:Z

    .line 192
    .line 193
    if-eqz p0, :cond_c

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_c
    const/16 p0, 0x10

    .line 197
    .line 198
    invoke-static {v0, p0}, La/vtt0;->g(II)I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-static {v1, p0}, La/vtt0;->g(II)I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    mul-int/2addr p0, p1

    .line 207
    mul-int/lit16 p0, p0, 0x300

    .line 208
    .line 209
    div-int/2addr p0, v4

    .line 210
    return p0

    .line 211
    :pswitch_2
    mul-int/2addr v0, v1

    .line 212
    mul-int/2addr v0, v10

    .line 213
    div-int/2addr v0, v4

    .line 214
    const/high16 p0, 0x200000

    .line 215
    .line 216
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    return p0

    .line 221
    :pswitch_3
    mul-int/2addr v0, v1

    .line 222
    mul-int/2addr v0, v10

    .line 223
    div-int/2addr v0, v4

    .line 224
    return v0

    .line 225
    :cond_d
    :goto_4
    return v2

    .line 226
    nop

    .line 227
    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static I0(Landroid/content/Context;Landroidx/media3/common/b;ZZ)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/b4x;->b:La/v3x;

    .line 6
    .line 7
    sget-object p0, La/rcf0;->e:La/rcf0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    if-lt v1, v2, :cond_2

    .line 15
    .line 16
    const-string v1, "video/dolby-vision"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, La/x8x;->l(Landroid/content/Context;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    invoke-static {p1}, La/qm30;->c(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    sget-object p0, La/b4x;->b:La/v3x;

    .line 37
    .line 38
    sget-object p0, La/rcf0;->e:La/rcf0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p0, p2, p3}, La/qm30;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p1, p2, p3}, La/qm30;->g(Landroidx/media3/common/b;ZZ)La/rcf0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public static J0(La/jm30;Landroidx/media3/common/b;)I
    .locals 4

    .line 1
    iget v0, p1, Landroidx/media3/common/b;->q:I

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v0, v2, :cond_1

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v0, 0x0

    .line 13
    move v2, v0

    .line 14
    :goto_0
    if-ge v0, p0, :cond_0

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, [B

    .line 21
    .line 22
    array-length v3, v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget p0, p1, Landroidx/media3/common/b;->q:I

    .line 28
    .line 29
    add-int/2addr p0, v2

    .line 30
    return p0

    .line 31
    :cond_1
    invoke-static {p0, p1}, La/xm30;->H0(La/jm30;Landroidx/media3/common/b;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method


# virtual methods
.method public final A0()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/mm30;->t1:La/jm30;

    .line 2
    .line 3
    iget-object v1, p0, La/xm30;->B2:La/pfu0;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, La/jm30;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "c2.mtk.avc.decoder"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "c2.mtk.hevc.decoder"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string v1, "c2.mtk.vp9.decoder"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    invoke-super {p0}, La/mm30;->A0()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final C(FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, La/mm30;->C(FF)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, La/xm30;->B2:La/pfu0;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p2, p1}, La/pfu0;->q(F)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p0, La/xm30;->p2:La/ueu0;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, La/ueu0;->g(F)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object p0, p0, La/xm30;->u2:La/veu0;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/veu0;->c(F)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final C0(Landroidx/media3/common/b;)I
    .locals 10

    .line 1
    iget-object v0, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, La/mg40;->m(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1, v1, v1, v1}, La/j16;->f(IIII)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    iget-object v0, p1, Landroidx/media3/common/b;->t:Landroidx/media3/common/DrmInitData;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_0
    iget-object p0, p0, La/xm30;->k2:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p0, p1, v0, v1}, La/xm30;->I0(Landroid/content/Context;Landroidx/media3/common/b;ZZ)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-static {p0, p1, v1, v1}, La/xm30;->I0(Landroid/content/Context;Landroidx/media3/common/b;ZZ)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-static {v2, v1, v1, v1}, La/j16;->f(IIII)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_3
    iget v4, p1, Landroidx/media3/common/b;->T:I

    .line 53
    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    if-ne v4, v5, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    invoke-static {v5, v1, v1, v1}, La/j16;->f(IIII)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_5
    :goto_1
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, La/jm30;

    .line 70
    .line 71
    invoke-virtual {v4, p0, p1}, La/jm30;->e(Landroid/content/Context;Landroidx/media3/common/b;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_7

    .line 76
    .line 77
    move v6, v2

    .line 78
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-ge v6, v7, :cond_7

    .line 83
    .line 84
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    check-cast v7, La/jm30;

    .line 89
    .line 90
    invoke-virtual {v7, p0, p1}, La/jm30;->e(Landroid/content/Context;Landroidx/media3/common/b;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_6

    .line 95
    .line 96
    move v3, v1

    .line 97
    move v5, v2

    .line 98
    move-object v4, v7

    .line 99
    goto :goto_3

    .line 100
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move v3, v2

    .line 104
    :goto_3
    if-eqz v5, :cond_8

    .line 105
    .line 106
    const/4 v6, 0x4

    .line 107
    goto :goto_4

    .line 108
    :cond_8
    const/4 v6, 0x3

    .line 109
    :goto_4
    invoke-virtual {v4, p1}, La/jm30;->f(Landroidx/media3/common/b;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_9

    .line 114
    .line 115
    const/16 v7, 0x10

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    const/16 v7, 0x8

    .line 119
    .line 120
    :goto_5
    iget-boolean v4, v4, La/jm30;->g:Z

    .line 121
    .line 122
    if-eqz v4, :cond_a

    .line 123
    .line 124
    const/16 v4, 0x40

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    move v4, v1

    .line 128
    :goto_6
    if-eqz v3, :cond_b

    .line 129
    .line 130
    const/16 v3, 0x80

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_b
    move v3, v1

    .line 134
    :goto_7
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    const/16 v9, 0x1a

    .line 137
    .line 138
    if-lt v8, v9, :cond_c

    .line 139
    .line 140
    const-string v8, "video/dolby-vision"

    .line 141
    .line 142
    iget-object v9, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-eqz v8, :cond_c

    .line 149
    .line 150
    invoke-static {p0}, La/x8x;->l(Landroid/content/Context;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-nez v8, :cond_c

    .line 155
    .line 156
    const/16 v3, 0x100

    .line 157
    .line 158
    :cond_c
    if-eqz v5, :cond_d

    .line 159
    .line 160
    invoke-static {p0, p1, v0, v2}, La/xm30;->I0(Landroid/content/Context;Landroidx/media3/common/b;ZZ)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_d

    .line 169
    .line 170
    sget-object v2, La/qm30;->a:Ljava/util/HashMap;

    .line 171
    .line 172
    new-instance v2, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 175
    .line 176
    .line 177
    new-instance v0, La/uq;

    .line 178
    .line 179
    const/16 v5, 0x13

    .line 180
    .line 181
    invoke-direct {v0, p0, p1, v5}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    new-instance v5, La/gi2;

    .line 185
    .line 186
    const/4 v8, 0x6

    .line 187
    invoke-direct {v5, v0, v8}, La/gi2;-><init>(Ljava/lang/Object;B)V

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/jm30;

    .line 198
    .line 199
    invoke-virtual {v0, p0, p1}, La/jm30;->e(Landroid/content/Context;Landroidx/media3/common/b;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_d

    .line 204
    .line 205
    invoke-virtual {v0, p1}, La/jm30;->f(Landroidx/media3/common/b;)Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-eqz p0, :cond_d

    .line 210
    .line 211
    const/16 v1, 0x20

    .line 212
    .line 213
    :cond_d
    or-int p0, v6, v7

    .line 214
    .line 215
    or-int/2addr p0, v1

    .line 216
    or-int/2addr p0, v4

    .line 217
    or-int/2addr p0, v3

    .line 218
    return p0
.end method

.method public final F(J)Z
    .locals 6

    .line 1
    iget-wide v0, p0, La/mm30;->Q1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-wide v4, p0, La/xm30;->Q2:J

    .line 15
    .line 16
    cmp-long v0, p1, v4

    .line 17
    .line 18
    if-gez v0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    iget-wide v4, p0, La/mm30;->a2:J

    .line 22
    .line 23
    cmp-long p0, v4, v2

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    cmp-long p0, p1, v4

    .line 30
    .line 31
    if-lez p0, :cond_3

    .line 32
    .line 33
    return v0

    .line 34
    :cond_3
    return v1
.end method

.method public final J(La/jm30;Landroidx/media3/common/b;Landroidx/media3/common/b;Z)La/alj;
    .locals 10

    .line 1
    invoke-virtual {p1, p2, p3}, La/jm30;->b(Landroidx/media3/common/b;Landroidx/media3/common/b;)La/alj;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p2, Landroidx/media3/common/b;->B:F

    .line 6
    .line 7
    iget v2, p3, Landroidx/media3/common/b;->B:F

    .line 8
    .line 9
    iget v3, v0, La/alj;->e:I

    .line 10
    .line 11
    iget-object v4, p0, La/xm30;->w2:La/j6;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v5, p3, Landroidx/media3/common/b;->w:I

    .line 17
    .line 18
    iget v6, v4, La/j6;->a:I

    .line 19
    .line 20
    if-gt v5, v6, :cond_0

    .line 21
    .line 22
    iget v5, p3, Landroidx/media3/common/b;->x:I

    .line 23
    .line 24
    iget v6, v4, La/j6;->b:I

    .line 25
    .line 26
    if-le v5, v6, :cond_1

    .line 27
    .line 28
    :cond_0
    or-int/lit16 v3, v3, 0x100

    .line 29
    .line 30
    :cond_1
    invoke-static {p1, p3}, La/xm30;->J0(La/jm30;Landroidx/media3/common/b;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    iget v4, v4, La/j6;->c:I

    .line 35
    .line 36
    if-le v5, v4, :cond_2

    .line 37
    .line 38
    or-int/lit8 v3, v3, 0x40

    .line 39
    .line 40
    :cond_2
    iget p0, p0, La/xm30;->K2:I

    .line 41
    .line 42
    const/high16 v4, -0x80000000

    .line 43
    .line 44
    if-ne p0, v4, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v4, 0x1f

    .line 50
    .line 51
    if-ge p0, v4, :cond_7

    .line 52
    .line 53
    const/16 v4, 0x1e

    .line 54
    .line 55
    if-ne p0, v4, :cond_4

    .line 56
    .line 57
    sget-object p0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 58
    .line 59
    const-string v4, "MiTV"

    .line 60
    .line 61
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/high16 p0, -0x40800000    # -1.0f

    .line 69
    .line 70
    cmpl-float v4, v1, p0

    .line 71
    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    cmpl-float p0, v2, p0

    .line 75
    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    iget-boolean p0, p1, La/jm30;->f:Z

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    if-eqz p4, :cond_6

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    div-float/2addr p0, p4

    .line 95
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 96
    .line 97
    .line 98
    move-result p4

    .line 99
    int-to-float p4, p4

    .line 100
    sub-float/2addr p0, p4

    .line 101
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    const p4, 0x3c23d70a    # 0.01f

    .line 106
    .line 107
    .line 108
    cmpl-float p0, p0, p4

    .line 109
    .line 110
    if-lez p0, :cond_7

    .line 111
    .line 112
    const/high16 p0, 0x10000

    .line 113
    .line 114
    or-int/2addr v3, p0

    .line 115
    :cond_7
    :goto_0
    move v9, v3

    .line 116
    new-instance v4, La/alj;

    .line 117
    .line 118
    iget-object v5, p1, La/jm30;->a:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v9, :cond_8

    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    :goto_1
    move v8, p0

    .line 124
    move-object v6, p2

    .line 125
    move-object v7, p3

    .line 126
    goto :goto_2

    .line 127
    :cond_8
    iget p0, v0, La/alj;->d:I

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_2
    invoke-direct/range {v4 .. v9}, La/alj;-><init>(Ljava/lang/String;Landroidx/media3/common/b;Landroidx/media3/common/b;II)V

    .line 131
    .line 132
    .line 133
    return-object v4
.end method

.method public final K(Ljava/lang/IllegalStateException;La/jm30;)La/hm30;
    .locals 1

    .line 1
    new-instance v0, La/rm30;

    .line 2
    .line 3
    iget-object p0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, La/hm30;-><init>(Ljava/lang/IllegalStateException;La/jm30;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/Surface;->isValid()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public final K0(La/jm30;)Landroid/view/Surface;
    .locals 5

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/pfu0;->getInputSurface()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-boolean v0, p1, La/jm30;->h:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_2
    invoke-virtual {p0, p1}, La/xm30;->S0(La/jm30;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    iget-boolean v1, v0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->a:Z

    .line 39
    .line 40
    iget-boolean v3, p1, La/jm30;->f:Z

    .line 41
    .line 42
    if-eq v1, v3, :cond_4

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->release()V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move-object v2, v0

    .line 53
    :goto_0
    move-object v0, v2

    .line 54
    :cond_4
    if-nez v0, :cond_c

    .line 55
    .line 56
    iget-object v0, p0, La/xm30;->k2:Landroid/content/Context;

    .line 57
    .line 58
    iget-boolean p1, p1, La/jm30;->f:Z

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->b(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    move v0, v2

    .line 72
    goto :goto_2

    .line 73
    :cond_6
    sget v0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->d:I

    .line 74
    .line 75
    :goto_1
    move v0, v1

    .line 76
    :goto_2
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v3, La/wu90;

    .line 80
    .line 81
    const-string v0, "ExoPlayer:PlaceholderSurface"

    .line 82
    .line 83
    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    if-eqz p1, :cond_7

    .line 87
    .line 88
    sget p1, Landroidx/media3/exoplayer/video/PlaceholderSurface;->d:I

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    move p1, v2

    .line 92
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 93
    .line 94
    .line 95
    new-instance v0, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-direct {v0, v4, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, v3, La/wu90;->b:Landroid/os/Handler;

    .line 105
    .line 106
    new-instance v4, La/sgn;

    .line 107
    .line 108
    invoke-direct {v4, v0}, La/sgn;-><init>(Landroid/os/Handler;)V

    .line 109
    .line 110
    .line 111
    iput-object v4, v3, La/wu90;->a:La/sgn;

    .line 112
    .line 113
    monitor-enter v3

    .line 114
    :try_start_0
    iget-object v0, v3, La/wu90;->b:Landroid/os/Handler;

    .line 115
    .line 116
    invoke-virtual {v0, v1, p1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 121
    .line 122
    .line 123
    :goto_4
    iget-object p1, v3, La/wu90;->e:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 124
    .line 125
    if-nez p1, :cond_8

    .line 126
    .line 127
    iget-object p1, v3, La/wu90;->d:Ljava/lang/RuntimeException;

    .line 128
    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    iget-object p1, v3, La/wu90;->c:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    if-nez p1, :cond_8

    .line 134
    .line 135
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_0
    move-exception p0

    .line 140
    goto :goto_5

    .line 141
    :catch_0
    move v2, v1

    .line 142
    goto :goto_4

    .line 143
    :cond_8
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 151
    .line 152
    .line 153
    :cond_9
    iget-object p1, v3, La/wu90;->d:Ljava/lang/RuntimeException;

    .line 154
    .line 155
    if-nez p1, :cond_b

    .line 156
    .line 157
    iget-object p1, v3, La/wu90;->c:Ljava/lang/Error;

    .line 158
    .line 159
    if-nez p1, :cond_a

    .line 160
    .line 161
    iget-object p1, v3, La/wu90;->e:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iput-object p1, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_a
    throw p1

    .line 170
    :cond_b
    throw p1

    .line 171
    :goto_5
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    throw p0

    .line 173
    :cond_c
    return-object v0
.end method

.method public final L0(La/jm30;)Z
    .locals 2

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    if-lt v0, v1, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p1, La/jm30;->h:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, La/xm30;->S0(La/jm30;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public final M0(La/wkj;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/j16;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const/high16 v0, 0x20000000

    .line 8
    .line 9
    invoke-virtual {p1, v0}, La/syx;->m(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v0, p0, La/j16;->r:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v2, v0, v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-wide v2, p1, La/wkj;->i:J

    .line 29
    .line 30
    iget-object p0, p0, La/mm30;->Z1:La/lm30;

    .line 31
    .line 32
    iget-wide p0, p0, La/lm30;->c:J

    .line 33
    .line 34
    sub-long/2addr v2, p0

    .line 35
    sub-long/2addr v0, v2

    .line 36
    const-wide/32 p0, 0x186a0

    .line 37
    .line 38
    .line 39
    cmp-long p0, v0, p0

    .line 40
    .line 41
    if-gtz p0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return p0

    .line 46
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public final N0()V
    .locals 8

    .line 1
    iget v0, p0, La/xm30;->M2:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/j16;->g:La/l9o0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, La/xm30;->L2:J

    .line 15
    .line 16
    sub-long v2, v0, v2

    .line 17
    .line 18
    iget v4, p0, La/xm30;->M2:I

    .line 19
    .line 20
    iget-object v5, p0, La/xm30;->m2:La/fck0;

    .line 21
    .line 22
    iget-object v6, v5, La/fck0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, Landroid/os/Handler;

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    new-instance v7, La/ffu0;

    .line 29
    .line 30
    invoke-direct {v7, v5, v4, v2, v3}, La/ffu0;-><init>(La/fck0;IJ)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v2, 0x0

    .line 37
    iput v2, p0, La/xm30;->M2:I

    .line 38
    .line 39
    iput-wide v0, p0, La/xm30;->L2:J

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final O0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/xm30;->Y2:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    new-instance v1, La/wm30;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, La/wm30;-><init>(La/xm30;La/dm30;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La/xm30;->a3:La/wm30;

    .line 17
    .line 18
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v1, 0x21

    .line 21
    .line 22
    if-lt p0, v1, :cond_2

    .line 23
    .line 24
    new-instance p0, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "tunnel-peek"

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, p0}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void
.end method

.method public final P0(La/dm30;IJ)V
    .locals 6

    .line 1
    const-string v0, "releaseOutputBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p3, p4}, La/dm30;->n(IJ)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 13
    .line 14
    iget p2, p1, La/tkj;->e:I

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    add-int/2addr p2, p3

    .line 18
    iput p2, p1, La/tkj;->e:I

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, La/xm30;->N2:I

    .line 22
    .line 23
    iget-object p2, p0, La/xm30;->B2:La/pfu0;

    .line 24
    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    iget-object p2, p0, La/xm30;->V2:La/qfu0;

    .line 28
    .line 29
    sget-object p4, La/qfu0;->d:La/qfu0;

    .line 30
    .line 31
    invoke-virtual {p2, p4}, La/qfu0;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    iget-object v1, p0, La/xm30;->m2:La/fck0;

    .line 36
    .line 37
    if-nez p4, :cond_0

    .line 38
    .line 39
    iget-object p4, p0, La/xm30;->W2:La/qfu0;

    .line 40
    .line 41
    invoke-virtual {p2, p4}, La/qfu0;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    if-nez p4, :cond_0

    .line 46
    .line 47
    iput-object p2, p0, La/xm30;->W2:La/qfu0;

    .line 48
    .line 49
    invoke-virtual {v1, p2}, La/fck0;->j(La/qfu0;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object p2, p0, La/xm30;->p2:La/ueu0;

    .line 53
    .line 54
    iget p4, p2, La/ueu0;->e:I

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    if-eq p4, v0, :cond_1

    .line 58
    .line 59
    move p1, p3

    .line 60
    :cond_1
    iput v0, p2, La/ueu0;->e:I

    .line 61
    .line 62
    iget-object p4, p2, La/ueu0;->k:La/l9o0;

    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    invoke-static {v2, v3}, La/vtt0;->M(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    iput-wide v2, p2, La/ueu0;->g:J

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-object v2, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    iget-object p1, v1, La/fck0;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Landroid/os/Handler;

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    new-instance v0, La/tx9;

    .line 94
    .line 95
    const/4 v5, 0x3

    .line 96
    invoke-direct/range {v0 .. v5}, La/tx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 100
    .line 101
    .line 102
    :cond_2
    iput-boolean p3, p0, La/xm30;->I2:Z

    .line 103
    .line 104
    :cond_3
    return-void
.end method

.method public final Q0(Ljava/lang/Object;)V
    .locals 9

    .line 1
    instance-of v0, p1, Landroid/view/Surface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/view/Surface;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    iget-object v0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 11
    .line 12
    iget-object v3, p0, La/xm30;->m2:La/fck0;

    .line 13
    .line 14
    if-eq v0, p1, :cond_b

    .line 15
    .line 16
    iput-object p1, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 17
    .line 18
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 19
    .line 20
    iget-object v2, p0, La/xm30;->p2:La/ueu0;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, p1}, La/ueu0;->f(Landroid/view/Surface;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, La/xm30;->I2:Z

    .line 29
    .line 30
    iget-byte v4, p0, La/j16;->h:B

    .line 31
    .line 32
    iget-object v5, p0, La/mm30;->m1:La/dm30;

    .line 33
    .line 34
    if-eqz v5, :cond_6

    .line 35
    .line 36
    iget-object v6, p0, La/xm30;->B2:La/pfu0;

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-nez v6, :cond_5

    .line 40
    .line 41
    iget-object v6, p0, La/mm30;->t1:La/jm30;

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v6}, La/xm30;->L0(La/jm30;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_4

    .line 51
    .line 52
    iget-boolean v8, p0, La/xm30;->x2:Z

    .line 53
    .line 54
    if-nez v8, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, v6}, La/xm30;->K0(La/jm30;)Landroid/view/Surface;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-interface {v5, v0}, La/dm30;->i(Landroid/view/Surface;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/16 v6, 0x23

    .line 69
    .line 70
    if-lt v0, v6, :cond_3

    .line 71
    .line 72
    invoke-interface {v5}, La/dm30;->f()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-static {}, La/v4i0;->e()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    :goto_1
    move v0, v7

    .line 88
    :cond_6
    :goto_2
    if-eqz p1, :cond_7

    .line 89
    .line 90
    iget-object p1, p0, La/xm30;->W2:La/qfu0;

    .line 91
    .line 92
    if-eqz p1, :cond_8

    .line 93
    .line 94
    invoke-virtual {v3, p1}, La/fck0;->j(La/qfu0;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_7
    iput-object v1, p0, La/xm30;->W2:La/qfu0;

    .line 99
    .line 100
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    invoke-interface {p1}, La/pfu0;->r()V

    .line 105
    .line 106
    .line 107
    :cond_8
    :goto_3
    const/4 p1, 0x2

    .line 108
    if-ne v4, p1, :cond_a

    .line 109
    .line 110
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 111
    .line 112
    if-eqz p1, :cond_9

    .line 113
    .line 114
    invoke-interface {p1, v0}, La/pfu0;->v(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_9
    invoke-virtual {v2, v0}, La/ueu0;->c(Z)V

    .line 119
    .line 120
    .line 121
    :cond_a
    :goto_4
    invoke-virtual {p0}, La/xm30;->O0()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_b
    if-eqz p1, :cond_d

    .line 126
    .line 127
    iget-object p1, p0, La/xm30;->W2:La/qfu0;

    .line 128
    .line 129
    if-eqz p1, :cond_c

    .line 130
    .line 131
    invoke-virtual {v3, p1}, La/fck0;->j(La/qfu0;)V

    .line 132
    .line 133
    .line 134
    :cond_c
    iget-object v4, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 135
    .line 136
    if-eqz v4, :cond_d

    .line 137
    .line 138
    iget-boolean p0, p0, La/xm30;->I2:Z

    .line 139
    .line 140
    if-eqz p0, :cond_d

    .line 141
    .line 142
    iget-object p0, v3, La/fck0;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Landroid/os/Handler;

    .line 145
    .line 146
    if-eqz p0, :cond_d

    .line 147
    .line 148
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 149
    .line 150
    .line 151
    move-result-wide v5

    .line 152
    new-instance v2, La/tx9;

    .line 153
    .line 154
    const/4 v7, 0x3

    .line 155
    invoke-direct/range {v2 .. v7}, La/tx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    :cond_d
    return-void
.end method

.method public final R(La/wkj;)I
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La/xm30;->P2:La/uch0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, La/xm30;->Y2:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    iget-wide v0, p1, La/wkj;->i:J

    .line 17
    .line 18
    iget-wide v2, p0, La/j16;->l:J

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/xm30;->M0(La/wkj;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    const/16 p0, 0x20

    .line 31
    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final R0(JJZZ)Z
    .locals 7

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/xm30;->l2:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, La/xm30;->c3:J

    .line 10
    .line 11
    neg-long v0, v0

    .line 12
    sub-long/2addr p3, v0

    .line 13
    :cond_0
    const-wide/32 v0, -0x7a120

    .line 14
    .line 15
    .line 16
    cmp-long p1, p1, v0

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-gez p1, :cond_8

    .line 20
    .line 21
    if-nez p5, :cond_8

    .line 22
    .line 23
    iget-object p1, p0, La/j16;->i:La/ixg0;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p1, La/ixg0;

    .line 29
    .line 30
    iget-wide v0, p0, La/j16;->k:J

    .line 31
    .line 32
    sub-long v0, p3, v0

    .line 33
    .line 34
    invoke-interface {p1, v0, v1}, La/ixg0;->d(J)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    iput-wide p3, p0, La/xm30;->Q2:J

    .line 43
    .line 44
    iget-object p3, p0, La/xm30;->p2:La/ueu0;

    .line 45
    .line 46
    iget-wide p3, p3, La/ueu0;->h:J

    .line 47
    .line 48
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long p3, p3, v0

    .line 54
    .line 55
    const/4 p4, 0x1

    .line 56
    if-eqz p3, :cond_2

    .line 57
    .line 58
    move p3, p4

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move p3, p2

    .line 61
    :goto_0
    iget-object p5, p0, La/xm30;->v2:Ljava/util/PriorityQueue;

    .line 62
    .line 63
    invoke-virtual {p5}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move v1, p2

    .line 68
    move v2, v1

    .line 69
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    iget-wide v5, p0, La/j16;->l:J

    .line 86
    .line 87
    cmp-long v3, v3, v5

    .line 88
    .line 89
    if-ltz v3, :cond_3

    .line 90
    .line 91
    if-nez p3, :cond_3

    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p5}, Ljava/util/PriorityQueue;->clear()V

    .line 100
    .line 101
    .line 102
    iget-object p3, p0, La/mm30;->Y1:La/tkj;

    .line 103
    .line 104
    if-eqz p6, :cond_5

    .line 105
    .line 106
    iget p5, p3, La/tkj;->d:I

    .line 107
    .line 108
    add-int/2addr p5, p1

    .line 109
    iget p1, p3, La/tkj;->f:I

    .line 110
    .line 111
    iget p6, p0, La/xm30;->O2:I

    .line 112
    .line 113
    add-int/2addr p1, p6

    .line 114
    iput p1, p3, La/tkj;->f:I

    .line 115
    .line 116
    add-int/2addr p5, v1

    .line 117
    add-int/2addr p5, v2

    .line 118
    iput p5, p3, La/tkj;->d:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    iget p5, p3, La/tkj;->j:I

    .line 122
    .line 123
    add-int/2addr p5, p4

    .line 124
    iput p5, p3, La/tkj;->j:I

    .line 125
    .line 126
    add-int/2addr p1, v1

    .line 127
    iget p3, p0, La/xm30;->O2:I

    .line 128
    .line 129
    invoke-virtual {p0, p1, p3}, La/xm30;->U0(II)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 133
    .line 134
    iget p3, p1, La/tkj;->d:I

    .line 135
    .line 136
    add-int/2addr p3, v2

    .line 137
    iput p3, p1, La/tkj;->d:I

    .line 138
    .line 139
    :goto_2
    invoke-virtual {p0}, La/mm30;->P()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 146
    .line 147
    .line 148
    :cond_6
    iget-object p0, p0, La/xm30;->B2:La/pfu0;

    .line 149
    .line 150
    if-eqz p0, :cond_7

    .line 151
    .line 152
    invoke-interface {p0, p2}, La/pfu0;->s(Z)V

    .line 153
    .line 154
    .line 155
    :cond_7
    return p4

    .line 156
    :cond_8
    :goto_3
    return p2
.end method

.method public final S(FLandroidx/media3/common/b;[Landroidx/media3/common/b;)F
    .locals 8

    .line 1
    array-length v0, p3

    .line 2
    const/high16 v1, -0x40800000    # -1.0f

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    aget-object v4, p3, v2

    .line 9
    .line 10
    iget v4, v4, Landroidx/media3/common/b;->B:F

    .line 11
    .line 12
    cmpl-float v5, v4, v1

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    cmpl-float p3, v3, v1

    .line 24
    .line 25
    if-nez p3, :cond_2

    .line 26
    .line 27
    iget-object p3, p0, La/mm30;->m1:La/dm30;

    .line 28
    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    iget-object p3, p0, La/xm30;->r2:La/fiq;

    .line 32
    .line 33
    invoke-virtual {p3}, La/fiq;->a()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v0, v4, v6

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p3}, La/fiq;->a()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    long-to-float p3, v2

    .line 51
    const v0, 0x4e6e6b28    # 1.0E9f

    .line 52
    .line 53
    .line 54
    div-float v3, v0, p3

    .line 55
    .line 56
    :cond_2
    cmpl-float p3, v3, v1

    .line 57
    .line 58
    if-nez p3, :cond_3

    .line 59
    .line 60
    move v3, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    mul-float/2addr v3, p1

    .line 63
    :goto_1
    iget-object p1, p0, La/xm30;->P2:La/uch0;

    .line 64
    .line 65
    if-eqz p1, :cond_a

    .line 66
    .line 67
    iget-object p0, p0, La/mm30;->t1:La/jm30;

    .line 68
    .line 69
    if-eqz p0, :cond_a

    .line 70
    .line 71
    iget p1, p2, Landroidx/media3/common/b;->w:I

    .line 72
    .line 73
    iget p2, p2, Landroidx/media3/common/b;->x:I

    .line 74
    .line 75
    iget-boolean p3, p0, La/jm30;->i:Z

    .line 76
    .line 77
    const v0, -0x800001

    .line 78
    .line 79
    .line 80
    if-nez p3, :cond_4

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    iget p3, p0, La/jm30;->l:F

    .line 84
    .line 85
    cmpl-float v0, p3, v0

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget v0, p0, La/jm30;->j:I

    .line 90
    .line 91
    if-ne v0, p1, :cond_5

    .line 92
    .line 93
    iget v0, p0, La/jm30;->k:I

    .line 94
    .line 95
    if-ne v0, p2, :cond_5

    .line 96
    .line 97
    move v0, p3

    .line 98
    goto :goto_4

    .line 99
    :cond_5
    const-wide/high16 v4, 0x4090000000000000L    # 1024.0

    .line 100
    .line 101
    invoke-virtual {p0, v4, v5, p1, p2}, La/jm30;->g(DII)Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    const/high16 v0, 0x44800000    # 1024.0f

    .line 106
    .line 107
    if-eqz p3, :cond_6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    const/4 p3, 0x0

    .line 111
    :goto_2
    sub-float v2, v0, p3

    .line 112
    .line 113
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    const/high16 v5, 0x40a00000    # 5.0f

    .line 118
    .line 119
    cmpl-float v4, v4, v5

    .line 120
    .line 121
    if-lez v4, :cond_8

    .line 122
    .line 123
    const/high16 v4, 0x40000000    # 2.0f

    .line 124
    .line 125
    div-float/2addr v2, v4

    .line 126
    add-float/2addr v2, p3

    .line 127
    float-to-double v4, v2

    .line 128
    invoke-virtual {p0, v4, v5, p1, p2}, La/jm30;->g(DII)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    move p3, v2

    .line 135
    goto :goto_2

    .line 136
    :cond_7
    move v0, v2

    .line 137
    goto :goto_2

    .line 138
    :cond_8
    move v0, p3

    .line 139
    :goto_3
    iput v0, p0, La/jm30;->l:F

    .line 140
    .line 141
    iput p1, p0, La/jm30;->j:I

    .line 142
    .line 143
    iput p2, p0, La/jm30;->k:I

    .line 144
    .line 145
    :goto_4
    cmpl-float p0, v3, v1

    .line 146
    .line 147
    if-eqz p0, :cond_9

    .line 148
    .line 149
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    return p0

    .line 154
    :cond_9
    return v0

    .line 155
    :cond_a
    return v3
.end method

.method public final S0(La/jm30;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/xm30;->Y2:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p1, La/jm30;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, La/xm30;->G0(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p1, La/jm30;->f:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/xm30;->k2:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {p0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->b(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final T(Landroidx/media3/common/b;Z)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/xm30;->Y2:Z

    .line 2
    .line 3
    iget-object p0, p0, La/xm30;->k2:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p0, p1, p2, v0}, La/xm30;->I0(Landroid/content/Context;Landroidx/media3/common/b;ZZ)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget-object v0, La/qm30;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, La/uq;

    .line 17
    .line 18
    const/16 v1, 0x13

    .line 19
    .line 20
    invoke-direct {p2, p0, p1, v1}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance p0, La/gi2;

    .line 24
    .line 25
    const/4 p1, 0x6

    .line 26
    invoke-direct {p0, p2, p1}, La/gi2;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final T0(La/dm30;I)V
    .locals 1

    .line 1
    const-string v0, "skipVideoBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, La/dm30;->k(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/mm30;->Y1:La/tkj;

    .line 13
    .line 14
    iget p1, p0, La/tkj;->f:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, p0, La/tkj;->f:I

    .line 19
    .line 20
    return-void
.end method

.method public final U0(II)V
    .locals 2

    .line 1
    iget-object v0, p0, La/mm30;->Y1:La/tkj;

    .line 2
    .line 3
    iget v1, v0, La/tkj;->h:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    iput v1, v0, La/tkj;->h:I

    .line 7
    .line 8
    add-int/2addr p1, p2

    .line 9
    iget p2, v0, La/tkj;->g:I

    .line 10
    .line 11
    add-int/2addr p2, p1

    .line 12
    iput p2, v0, La/tkj;->g:I

    .line 13
    .line 14
    iget p2, p0, La/xm30;->M2:I

    .line 15
    .line 16
    add-int/2addr p2, p1

    .line 17
    iput p2, p0, La/xm30;->M2:I

    .line 18
    .line 19
    iget p2, p0, La/xm30;->N2:I

    .line 20
    .line 21
    add-int/2addr p2, p1

    .line 22
    iput p2, p0, La/xm30;->N2:I

    .line 23
    .line 24
    iget p1, v0, La/tkj;->i:I

    .line 25
    .line 26
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, v0, La/tkj;->i:I

    .line 31
    .line 32
    iget-byte p1, p0, La/xm30;->n2:B

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    iget p2, p0, La/xm30;->M2:I

    .line 37
    .line 38
    if-lt p2, p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, La/xm30;->N0()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final V0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, La/mm30;->Y1:La/tkj;

    .line 2
    .line 3
    iget-wide v1, v0, La/tkj;->k:J

    .line 4
    .line 5
    add-long/2addr v1, p1

    .line 6
    iput-wide v1, v0, La/tkj;->k:J

    .line 7
    .line 8
    iget v1, v0, La/tkj;->l:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iput v1, v0, La/tkj;->l:I

    .line 13
    .line 14
    iget-wide v0, p0, La/xm30;->S2:J

    .line 15
    .line 16
    add-long/2addr v0, p1

    .line 17
    iput-wide v0, p0, La/xm30;->S2:J

    .line 18
    .line 19
    iget p1, p0, La/xm30;->T2:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    iput p1, p0, La/xm30;->T2:I

    .line 24
    .line 25
    return-void
.end method

.method public final W(La/jm30;Landroidx/media3/common/b;Landroid/media/MediaCrypto;F)La/pzu;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget-object v4, v1, La/jm30;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, v0, La/j16;->j:[Landroidx/media3/common/b;

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v6, v3, Landroidx/media3/common/b;->w:I

    .line 15
    .line 16
    iget v7, v3, Landroidx/media3/common/b;->B:F

    .line 17
    .line 18
    iget-object v8, v3, Landroidx/media3/common/b;->H:La/c4d;

    .line 19
    .line 20
    iget v9, v3, Landroidx/media3/common/b;->x:I

    .line 21
    .line 22
    invoke-static/range {p1 .. p2}, La/xm30;->J0(La/jm30;Landroidx/media3/common/b;)I

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    array-length v11, v5

    .line 27
    const/4 v13, -0x1

    .line 28
    const/4 v14, 0x1

    .line 29
    if-ne v11, v14, :cond_1

    .line 30
    .line 31
    if-eq v10, v13, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p2}, La/xm30;->H0(La/jm30;Landroidx/media3/common/b;)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eq v5, v13, :cond_0

    .line 38
    .line 39
    int-to-float v10, v10

    .line 40
    const/high16 v11, 0x3fc00000    # 1.5f

    .line 41
    .line 42
    mul-float/2addr v10, v11

    .line 43
    float-to-int v10, v10

    .line 44
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    :cond_0
    new-instance v5, La/j6;

    .line 49
    .line 50
    invoke-direct {v5, v6, v9, v10}, La/j6;-><init>(III)V

    .line 51
    .line 52
    .line 53
    move-object/from16 v19, v8

    .line 54
    .line 55
    move v15, v9

    .line 56
    goto/16 :goto_11

    .line 57
    .line 58
    :cond_1
    array-length v11, v5

    .line 59
    move v14, v6

    .line 60
    move v12, v9

    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    :goto_0
    if-ge v15, v11, :cond_6

    .line 65
    .line 66
    aget-object v13, v5, v15

    .line 67
    .line 68
    move-object/from16 v18, v5

    .line 69
    .line 70
    if-eqz v8, :cond_2

    .line 71
    .line 72
    iget-object v5, v13, Landroidx/media3/common/b;->H:La/c4d;

    .line 73
    .line 74
    if-nez v5, :cond_2

    .line 75
    .line 76
    invoke-virtual {v13}, Landroidx/media3/common/b;->a()La/awq;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iput-object v8, v5, La/awq;->G:La/c4d;

    .line 81
    .line 82
    new-instance v13, Landroidx/media3/common/b;

    .line 83
    .line 84
    invoke-direct {v13, v5}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {v1, v3, v13}, La/jm30;->b(Landroidx/media3/common/b;Landroidx/media3/common/b;)La/alj;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move/from16 v19, v11

    .line 92
    .line 93
    iget v11, v13, Landroidx/media3/common/b;->x:I

    .line 94
    .line 95
    iget v5, v5, La/alj;->d:I

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    iget v5, v13, Landroidx/media3/common/b;->w:I

    .line 100
    .line 101
    move/from16 v20, v15

    .line 102
    .line 103
    const/4 v15, -0x1

    .line 104
    if-eq v5, v15, :cond_4

    .line 105
    .line 106
    if-ne v11, v15, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/16 v17, 0x0

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    :goto_1
    const/16 v17, 0x1

    .line 113
    .line 114
    :goto_2
    or-int v16, v16, v17

    .line 115
    .line 116
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    invoke-static {v1, v13}, La/xm30;->J0(La/jm30;Landroidx/media3/common/b;)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    move v10, v5

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move/from16 v20, v15

    .line 135
    .line 136
    const/4 v15, -0x1

    .line 137
    :goto_3
    add-int/lit8 v5, v20, 0x1

    .line 138
    .line 139
    move v13, v15

    .line 140
    move/from16 v11, v19

    .line 141
    .line 142
    move v15, v5

    .line 143
    move-object/from16 v5, v18

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_6
    if-eqz v16, :cond_12

    .line 147
    .line 148
    new-instance v5, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v11, "Resolutions unknown. Codec max resolution: "

    .line 151
    .line 152
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v11, "x"

    .line 159
    .line 160
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    const-string v13, "MediaCodecVideoRenderer"

    .line 171
    .line 172
    invoke-static {v13, v5}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    if-le v9, v6, :cond_7

    .line 176
    .line 177
    const/4 v5, 0x1

    .line 178
    goto :goto_4

    .line 179
    :cond_7
    const/4 v5, 0x0

    .line 180
    :goto_4
    if-eqz v5, :cond_8

    .line 181
    .line 182
    move v15, v9

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    move v15, v6

    .line 185
    :goto_5
    move/from16 v16, v5

    .line 186
    .line 187
    if-eqz v5, :cond_9

    .line 188
    .line 189
    move v5, v6

    .line 190
    goto :goto_6

    .line 191
    :cond_9
    move v5, v9

    .line 192
    :goto_6
    int-to-float v2, v5

    .line 193
    move/from16 v17, v2

    .line 194
    .line 195
    int-to-float v2, v15

    .line 196
    div-float v2, v17, v2

    .line 197
    .line 198
    move/from16 v17, v2

    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    :goto_7
    const/16 v18, 0x0

    .line 202
    .line 203
    move-object/from16 v19, v8

    .line 204
    .line 205
    const/16 v8, 0x9

    .line 206
    .line 207
    if-ge v2, v8, :cond_11

    .line 208
    .line 209
    sget-object v8, La/xm30;->f3:[I

    .line 210
    .line 211
    aget v8, v8, v2

    .line 212
    .line 213
    move/from16 v20, v2

    .line 214
    .line 215
    int-to-float v2, v8

    .line 216
    mul-float v2, v2, v17

    .line 217
    .line 218
    float-to-int v2, v2

    .line 219
    if-le v8, v15, :cond_11

    .line 220
    .line 221
    if-gt v2, v5, :cond_a

    .line 222
    .line 223
    goto/16 :goto_e

    .line 224
    .line 225
    :cond_a
    move/from16 v21, v2

    .line 226
    .line 227
    if-eqz v16, :cond_b

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_b
    move v2, v8

    .line 231
    :goto_8
    if-eqz v16, :cond_c

    .line 232
    .line 233
    :goto_9
    move/from16 v21, v5

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_c
    move/from16 v8, v21

    .line 237
    .line 238
    goto :goto_9

    .line 239
    :goto_a
    iget-object v5, v1, La/jm30;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 240
    .line 241
    if-nez v5, :cond_d

    .line 242
    .line 243
    :goto_b
    move/from16 v23, v15

    .line 244
    .line 245
    move-object/from16 v3, v18

    .line 246
    .line 247
    goto :goto_c

    .line 248
    :cond_d
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    if-nez v5, :cond_e

    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_e
    move-object/from16 v22, v5

    .line 256
    .line 257
    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    move/from16 v23, v15

    .line 262
    .line 263
    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    new-instance v3, Landroid/graphics/Point;

    .line 268
    .line 269
    invoke-static {v2, v5}, La/vtt0;->g(II)I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    mul-int/2addr v2, v5

    .line 274
    invoke-static {v8, v15}, La/vtt0;->g(II)I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    mul-int/2addr v5, v15

    .line 279
    invoke-direct {v3, v2, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 280
    .line 281
    .line 282
    :goto_c
    if-eqz v3, :cond_f

    .line 283
    .line 284
    iget v2, v3, Landroid/graphics/Point;->x:I

    .line 285
    .line 286
    iget v5, v3, Landroid/graphics/Point;->y:I

    .line 287
    .line 288
    move v15, v9

    .line 289
    float-to-double v8, v7

    .line 290
    invoke-virtual {v1, v8, v9, v2, v5}, La/jm30;->g(DII)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_10

    .line 295
    .line 296
    goto :goto_f

    .line 297
    :cond_f
    move v15, v9

    .line 298
    :cond_10
    add-int/lit8 v2, v20, 0x1

    .line 299
    .line 300
    move-object/from16 v3, p2

    .line 301
    .line 302
    move v9, v15

    .line 303
    move-object/from16 v8, v19

    .line 304
    .line 305
    move/from16 v5, v21

    .line 306
    .line 307
    move/from16 v15, v23

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :goto_d
    move-object/from16 v3, v18

    .line 311
    .line 312
    goto :goto_f

    .line 313
    :cond_11
    :goto_e
    move v15, v9

    .line 314
    goto :goto_d

    .line 315
    :goto_f
    if-eqz v3, :cond_13

    .line 316
    .line 317
    iget v2, v3, Landroid/graphics/Point;->x:I

    .line 318
    .line 319
    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    iget v2, v3, Landroid/graphics/Point;->y:I

    .line 324
    .line 325
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    .line 326
    .line 327
    .line 328
    move-result v12

    .line 329
    invoke-virtual/range {p2 .. p2}, Landroidx/media3/common/b;->a()La/awq;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    iput v14, v2, La/awq;->v:I

    .line 334
    .line 335
    iput v12, v2, La/awq;->w:I

    .line 336
    .line 337
    new-instance v3, Landroidx/media3/common/b;

    .line 338
    .line 339
    invoke-direct {v3, v2}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v1, v3}, La/xm30;->H0(La/jm30;Landroidx/media3/common/b;)I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v3, "Codec max resolution adjusted to: "

    .line 353
    .line 354
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-static {v13, v2}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_10

    .line 374
    :cond_12
    move-object/from16 v19, v8

    .line 375
    .line 376
    move v15, v9

    .line 377
    :cond_13
    :goto_10
    new-instance v5, La/j6;

    .line 378
    .line 379
    invoke-direct {v5, v14, v12, v10}, La/j6;-><init>(III)V

    .line 380
    .line 381
    .line 382
    :goto_11
    iput-object v5, v0, La/xm30;->w2:La/j6;

    .line 383
    .line 384
    iget-boolean v2, v0, La/xm30;->Y2:Z

    .line 385
    .line 386
    if-eqz v2, :cond_14

    .line 387
    .line 388
    iget v2, v0, La/xm30;->Z2:I

    .line 389
    .line 390
    goto :goto_12

    .line 391
    :cond_14
    const/4 v2, 0x0

    .line 392
    :goto_12
    new-instance v3, Landroid/media/MediaFormat;

    .line 393
    .line 394
    invoke-direct {v3}, Landroid/media/MediaFormat;-><init>()V

    .line 395
    .line 396
    .line 397
    const-string v8, "mime"

    .line 398
    .line 399
    invoke-virtual {v3, v8, v4}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    const-string v4, "width"

    .line 403
    .line 404
    invoke-virtual {v3, v4, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 405
    .line 406
    .line 407
    const-string v4, "height"

    .line 408
    .line 409
    invoke-virtual {v3, v4, v15}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v4, p2

    .line 413
    .line 414
    iget-object v6, v4, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 415
    .line 416
    invoke-static {v3, v6}, La/c9x;->K(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 417
    .line 418
    .line 419
    const/high16 v6, -0x40800000    # -1.0f

    .line 420
    .line 421
    cmpl-float v8, v7, v6

    .line 422
    .line 423
    if-eqz v8, :cond_15

    .line 424
    .line 425
    const-string v8, "frame-rate"

    .line 426
    .line 427
    invoke-virtual {v3, v8, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 428
    .line 429
    .line 430
    :cond_15
    const-string v7, "rotation-degrees"

    .line 431
    .line 432
    iget v8, v4, Landroidx/media3/common/b;->C:I

    .line 433
    .line 434
    invoke-static {v3, v7, v8}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 435
    .line 436
    .line 437
    if-eqz v19, :cond_16

    .line 438
    .line 439
    const-string v7, "color-transfer"

    .line 440
    .line 441
    move-object/from16 v8, v19

    .line 442
    .line 443
    iget v9, v8, La/c4d;->c:I

    .line 444
    .line 445
    invoke-static {v3, v7, v9}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 446
    .line 447
    .line 448
    const-string v7, "color-standard"

    .line 449
    .line 450
    iget v9, v8, La/c4d;->a:I

    .line 451
    .line 452
    invoke-static {v3, v7, v9}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 453
    .line 454
    .line 455
    const-string v7, "color-range"

    .line 456
    .line 457
    iget v9, v8, La/c4d;->b:I

    .line 458
    .line 459
    invoke-static {v3, v7, v9}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 460
    .line 461
    .line 462
    iget-object v7, v8, La/c4d;->d:[B

    .line 463
    .line 464
    if-eqz v7, :cond_16

    .line 465
    .line 466
    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    const-string v8, "hdr-static-info"

    .line 471
    .line 472
    invoke-virtual {v3, v8, v7}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 473
    .line 474
    .line 475
    :cond_16
    const-string v7, "video/dolby-vision"

    .line 476
    .line 477
    iget-object v8, v4, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    if-eqz v7, :cond_17

    .line 484
    .line 485
    invoke-static {v4}, La/jyc;->b(Landroidx/media3/common/b;)Landroid/util/Pair;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    if-eqz v7, :cond_17

    .line 490
    .line 491
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v7, Ljava/lang/Integer;

    .line 494
    .line 495
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    const-string v8, "profile"

    .line 500
    .line 501
    invoke-static {v3, v8, v7}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 502
    .line 503
    .line 504
    :cond_17
    const-string v7, "max-width"

    .line 505
    .line 506
    iget v8, v5, La/j6;->a:I

    .line 507
    .line 508
    invoke-virtual {v3, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 509
    .line 510
    .line 511
    const-string v7, "max-height"

    .line 512
    .line 513
    iget v8, v5, La/j6;->b:I

    .line 514
    .line 515
    invoke-virtual {v3, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 516
    .line 517
    .line 518
    const-string v7, "max-input-size"

    .line 519
    .line 520
    iget v5, v5, La/j6;->c:I

    .line 521
    .line 522
    invoke-static {v3, v7, v5}, La/c9x;->A(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 523
    .line 524
    .line 525
    const-string v5, "priority"

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    invoke-virtual {v3, v5, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 529
    .line 530
    .line 531
    cmpl-float v5, p4, v6

    .line 532
    .line 533
    if-eqz v5, :cond_18

    .line 534
    .line 535
    const-string v5, "operating-rate"

    .line 536
    .line 537
    move/from16 v6, p4

    .line 538
    .line 539
    invoke-virtual {v3, v5, v6}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 540
    .line 541
    .line 542
    :cond_18
    iget-boolean v5, v0, La/xm30;->o2:Z

    .line 543
    .line 544
    if-eqz v5, :cond_19

    .line 545
    .line 546
    const-string v5, "no-post-process"

    .line 547
    .line 548
    const/4 v6, 0x1

    .line 549
    invoke-virtual {v3, v5, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 550
    .line 551
    .line 552
    const-string v5, "auto-frc"

    .line 553
    .line 554
    const/4 v7, 0x0

    .line 555
    invoke-virtual {v3, v5, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 556
    .line 557
    .line 558
    goto :goto_13

    .line 559
    :cond_19
    const/4 v6, 0x1

    .line 560
    :goto_13
    if-eqz v2, :cond_1a

    .line 561
    .line 562
    const-string v5, "tunneled-playback"

    .line 563
    .line 564
    invoke-virtual {v3, v5, v6}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    .line 565
    .line 566
    .line 567
    const-string v5, "audio-session-id"

    .line 568
    .line 569
    invoke-virtual {v3, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 570
    .line 571
    .line 572
    :cond_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 573
    .line 574
    const/16 v5, 0x23

    .line 575
    .line 576
    if-lt v2, v5, :cond_1b

    .line 577
    .line 578
    iget v2, v0, La/xm30;->X2:I

    .line 579
    .line 580
    neg-int v2, v2

    .line 581
    const/4 v7, 0x0

    .line 582
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    const-string v5, "importance"

    .line 587
    .line 588
    invoke-virtual {v3, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 589
    .line 590
    .line 591
    :cond_1b
    invoke-virtual {v0, v3}, La/mm30;->H(Landroid/media/MediaFormat;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {p0 .. p1}, La/xm30;->K0(La/jm30;)Landroid/view/Surface;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    iget-object v2, v0, La/xm30;->B2:La/pfu0;

    .line 599
    .line 600
    if-eqz v2, :cond_1c

    .line 601
    .line 602
    iget-object v0, v0, La/xm30;->k2:Landroid/content/Context;

    .line 603
    .line 604
    invoke-static {v0}, La/vtt0;->J(Landroid/content/Context;)Z

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    if-nez v0, :cond_1c

    .line 609
    .line 610
    const-string v0, "allow-frame-drop"

    .line 611
    .line 612
    const/4 v7, 0x0

    .line 613
    invoke-virtual {v3, v0, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 614
    .line 615
    .line 616
    :cond_1c
    new-instance v0, La/pzu;

    .line 617
    .line 618
    const/4 v6, 0x0

    .line 619
    move-object/from16 v5, p3

    .line 620
    .line 621
    move-object v2, v3

    .line 622
    move-object/from16 v3, p2

    .line 623
    .line 624
    invoke-direct/range {v0 .. v6}, La/pzu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    return-object v0
.end method

.method public final X(La/wkj;)V
    .locals 8

    .line 1
    iget-object p1, p1, La/wkj;->j:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x7

    .line 12
    if-lt v0, v1, :cond_7

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 36
    .line 37
    .line 38
    const/16 v6, -0x4b

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    if-ne v0, v6, :cond_2

    .line 42
    .line 43
    const/16 v0, 0x3c

    .line 44
    .line 45
    if-ne v1, v0, :cond_2

    .line 46
    .line 47
    if-ne v2, v7, :cond_2

    .line 48
    .line 49
    const/4 v0, 0x4

    .line 50
    if-ne v3, v0, :cond_2

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    if-ne v4, v7, :cond_2

    .line 55
    .line 56
    :cond_1
    iget-boolean v0, p0, La/xm30;->z2:Z

    .line 57
    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    new-array v0, v0, [B

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, La/mm30;->m1:La/dm30;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p1, Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v1, "hdr10-plus-info"

    .line 83
    .line 84
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, p1}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v1, 0x25

    .line 94
    .line 95
    if-lt v0, v1, :cond_7

    .line 96
    .line 97
    sget-object v0, La/jyc;->a:[B

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    sget-object v1, La/jyc;->d:[B

    .line 104
    .line 105
    array-length v2, v1

    .line 106
    if-ge v0, v2, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    move v2, v5

    .line 114
    :goto_0
    array-length v3, v1

    .line 115
    if-ge v2, v3, :cond_5

    .line 116
    .line 117
    add-int v3, v0, v2

    .line 118
    .line 119
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    aget-byte v4, v1, v2

    .line 124
    .line 125
    if-eq v3, v4, :cond_4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    const/4 v0, 0x5

    .line 132
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    new-array v1, v0, [B

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 145
    .line 146
    .line 147
    if-lez v0, :cond_6

    .line 148
    .line 149
    move v5, v7

    .line 150
    :cond_6
    iput-boolean v5, p0, La/xm30;->A2:Z

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    new-instance p1, Landroid/os/Bundle;

    .line 155
    .line 156
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v0, "hdr-st2094-50-info"

    .line 160
    .line 161
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 162
    .line 163
    .line 164
    iget-object p0, p0, La/mm30;->m1:La/dm30;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-interface {p0, p1}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    :goto_1
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    if-eq p1, v1, :cond_c

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-eq p1, v1, :cond_b

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p1, v1, :cond_a

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    if-eq p1, v1, :cond_7

    .line 16
    .line 17
    const/16 v1, 0xd

    .line 18
    .line 19
    if-eq p1, v1, :cond_4

    .line 20
    .line 21
    const/16 v1, 0xe

    .line 22
    .line 23
    if-eq p1, v1, :cond_3

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    packed-switch p1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    invoke-super {p0, p1, p2}, La/mm30;->c(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object p1, p0, La/xm30;->P2:La/uch0;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    move p1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move p1, v1

    .line 40
    :goto_0
    check-cast p2, La/uch0;

    .line 41
    .line 42
    iput-object p2, p0, La/xm30;->P2:La/uch0;

    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v0, v1

    .line 48
    :goto_1
    if-eq p1, v0, :cond_d

    .line 49
    .line 50
    iget-object p1, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    iget-object p1, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {p0, v1}, La/xm30;->Q0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast p2, La/xm30;

    .line 66
    .line 67
    invoke-virtual {p2, v0, p1}, La/xm30;->c(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput p1, p0, La/xm30;->X2:I

    .line 81
    .line 82
    iget-object p1, p0, La/mm30;->m1:La/dm30;

    .line 83
    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    const/16 v0, 0x23

    .line 91
    .line 92
    if-lt p2, v0, :cond_d

    .line 93
    .line 94
    new-instance p2, Landroid/os/Bundle;

    .line 95
    .line 96
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 97
    .line 98
    .line 99
    iget p0, p0, La/xm30;->X2:I

    .line 100
    .line 101
    neg-int p0, p0

    .line 102
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const-string v0, "importance"

    .line 107
    .line 108
    invoke-virtual {p2, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, p2}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    check-cast p2, La/e7k0;

    .line 119
    .line 120
    iget p1, p2, La/e7k0;->a:I

    .line 121
    .line 122
    if-eqz p1, :cond_d

    .line 123
    .line 124
    iget p1, p2, La/e7k0;->b:I

    .line 125
    .line 126
    if-eqz p1, :cond_d

    .line 127
    .line 128
    iput-object p2, p0, La/xm30;->H2:La/e7k0;

    .line 129
    .line 130
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 131
    .line 132
    if-eqz p1, :cond_d

    .line 133
    .line 134
    iget-object p0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, p0, p2}, La/pfu0;->l(Landroid/view/Surface;La/e7k0;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast p2, Ljava/util/List;

    .line 147
    .line 148
    sget-object p1, La/teu0;->a:La/rcf0;

    .line 149
    .line 150
    invoke-interface {p2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 157
    .line 158
    if-eqz p1, :cond_d

    .line 159
    .line 160
    invoke-interface {p1}, La/pfu0;->b()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_5

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    iget-object p0, p0, La/xm30;->B2:La/pfu0;

    .line 168
    .line 169
    invoke-interface {p0}, La/pfu0;->j()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_6
    iput-object p2, p0, La/xm30;->E2:Ljava/util/List;

    .line 174
    .line 175
    iget-object p0, p0, La/xm30;->B2:La/pfu0;

    .line 176
    .line 177
    if-eqz p0, :cond_d

    .line 178
    .line 179
    invoke-interface {p0, p2}, La/pfu0;->g(Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    check-cast p2, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iput p1, p0, La/xm30;->K2:I

    .line 193
    .line 194
    iget-object p2, p0, La/xm30;->B2:La/pfu0;

    .line 195
    .line 196
    if-eqz p2, :cond_8

    .line 197
    .line 198
    invoke-interface {p2, p1}, La/pfu0;->p(I)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_8
    iget-object p0, p0, La/xm30;->p2:La/ueu0;

    .line 203
    .line 204
    iget-object p0, p0, La/ueu0;->b:La/zeu0;

    .line 205
    .line 206
    iget p2, p0, La/zeu0;->i:I

    .line 207
    .line 208
    if-ne p2, p1, :cond_9

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_9
    iput p1, p0, La/zeu0;->i:I

    .line 212
    .line 213
    invoke-virtual {p0, v0}, La/zeu0;->c(Z)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    check-cast p2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    iput p1, p0, La/xm30;->J2:I

    .line 227
    .line 228
    iget-object p0, p0, La/mm30;->m1:La/dm30;

    .line 229
    .line 230
    if-eqz p0, :cond_d

    .line 231
    .line 232
    invoke-interface {p0, p1}, La/dm30;->g(I)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    check-cast p2, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    iget p2, p0, La/xm30;->Z2:I

    .line 246
    .line 247
    if-eq p2, p1, :cond_d

    .line 248
    .line 249
    iput p1, p0, La/xm30;->Z2:I

    .line 250
    .line 251
    iget-boolean p1, p0, La/xm30;->Y2:Z

    .line 252
    .line 253
    if-eqz p1, :cond_d

    .line 254
    .line 255
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_c
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    check-cast p2, La/seu0;

    .line 263
    .line 264
    iput-object p2, p0, La/xm30;->b3:La/seu0;

    .line 265
    .line 266
    iget-object p0, p0, La/xm30;->B2:La/pfu0;

    .line 267
    .line 268
    if-eqz p0, :cond_d

    .line 269
    .line 270
    invoke-interface {p0, p2}, La/pfu0;->u(La/seu0;)V

    .line 271
    .line 272
    .line 273
    :cond_d
    :goto_2
    return-void

    .line 274
    :cond_e
    invoke-virtual {p0, p2}, La/xm30;->Q0(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c0(Landroidx/media3/common/b;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/pfu0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 12
    .line 13
    invoke-interface {v0, p1}, La/pfu0;->k(Landroidx/media3/common/b;)Z

    .line 14
    .line 15
    .line 16
    move-result p0
    :try_end_0
    .catch La/ofu0; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return p0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    const/16 v1, 0x1b58

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p0, v0, p1, v2, v1}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0

    .line 27
    :cond_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final d0(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "MediaCodecVideoRenderer"

    .line 2
    .line 3
    const-string v1, "Video codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/xm30;->m2:La/fck0;

    .line 9
    .line 10
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, La/ffu0;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, p0, p1, v2}, La/ffu0;-><init>(La/fck0;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final e0(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, La/xm30;->m2:La/fck0;

    .line 2
    .line 3
    iget-object v0, v1, La/fck0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    new-instance v0, La/ffu0;

    .line 11
    .line 12
    move-wide v3, p1

    .line 13
    move-wide v5, p3

    .line 14
    move-object v2, p5

    .line 15
    invoke-direct/range {v0 .. v6}, La/ffu0;-><init>(La/fck0;Ljava/lang/String;JJ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, p5

    .line 23
    :goto_0
    invoke-static {v2}, La/xm30;->G0(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, La/xm30;->x2:Z

    .line 28
    .line 29
    iget-object p1, p0, La/mm30;->t1:La/jm30;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 p3, 0x1d

    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    const/4 p5, 0x1

    .line 40
    if-lt p2, p3, :cond_4

    .line 41
    .line 42
    const-string p2, "video/x-vnd.on2.vp9"

    .line 43
    .line 44
    iget-object p3, p1, La/jm30;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_4

    .line 51
    .line 52
    iget-object p1, p1, La/jm30;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    iget-object p1, p1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    :cond_1
    new-array p1, p4, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 61
    .line 62
    :cond_2
    array-length p2, p1

    .line 63
    move p3, p4

    .line 64
    :goto_1
    if-ge p3, p2, :cond_4

    .line 65
    .line 66
    aget-object v0, p1, p3

    .line 67
    .line 68
    iget v0, v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 69
    .line 70
    const/16 v1, 0x4000

    .line 71
    .line 72
    if-ne v0, v1, :cond_3

    .line 73
    .line 74
    move p1, p5

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move p1, p4

    .line 80
    :goto_2
    iput-boolean p1, p0, La/xm30;->z2:Z

    .line 81
    .line 82
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 p2, 0x25

    .line 85
    .line 86
    if-ge p1, p2, :cond_5

    .line 87
    .line 88
    iget-object p1, p0, La/mm30;->t1:La/jm30;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, La/jm30;->b:Ljava/lang/String;

    .line 94
    .line 95
    const-string p2, "video/av01"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    move p4, p5

    .line 104
    :cond_5
    iput-boolean p4, p0, La/xm30;->y2:Z

    .line 105
    .line 106
    invoke-virtual {p0}, La/xm30;->O0()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final f0(La/hyc;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/xm30;->m2:La/fck0;

    .line 2
    .line 3
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, La/qaq0;

    .line 10
    .line 11
    const/16 v2, 0x11

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, v2}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final g0(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/xm30;->m2:La/fck0;

    .line 2
    .line 3
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, La/ffu0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p0, p1, v2}, La/ffu0;-><init>(La/fck0;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget v2, p0, La/xm30;->D2:I

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {v0}, La/pfu0;->m()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 18
    iput v0, p0, La/xm30;->D2:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    iget-object p0, p0, La/xm30;->p2:La/ueu0;

    .line 22
    .line 23
    iget v0, p0, La/ueu0;->e:I

    .line 24
    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    iput v1, p0, La/ueu0;->e:I

    .line 28
    .line 29
    :cond_3
    return-void
.end method

.method public final h0(La/hsj;)La/alj;
    .locals 4

    .line 1
    invoke-super {p0, p1}, La/mm30;->h0(La/hsj;)La/alj;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, La/xm30;->A2:Z

    .line 7
    .line 8
    iget-object p1, p1, La/hsj;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Landroidx/media3/common/b;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/xm30;->m2:La/fck0;

    .line 16
    .line 17
    iget-object v2, v1, La/fck0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Landroid/os/Handler;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v3, La/ffu0;

    .line 24
    .line 25
    invoke-direct {v3, v1, p1, v0}, La/ffu0;-><init>(La/fck0;Landroidx/media3/common/b;La/alj;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, La/xm30;->u2:La/veu0;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, La/veu0;->b()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-object v0
.end method

.method public final i0(Landroidx/media3/common/b;Landroid/media/MediaFormat;)V
    .locals 11

    .line 1
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, La/xm30;->J2:I

    .line 6
    .line 7
    invoke-interface {v0, v1}, La/dm30;->g(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, La/xm30;->Y2:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget p2, p1, Landroidx/media3/common/b;->w:I

    .line 16
    .line 17
    iget v0, p1, Landroidx/media3/common/b;->x:I

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v0, "crop-right"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "crop-top"

    .line 30
    .line 31
    const-string v4, "crop-bottom"

    .line 32
    .line 33
    const-string v5, "crop-left"

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    move v2, v6

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v2, v1

    .line 59
    :goto_0
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    sub-int/2addr v0, v5

    .line 70
    add-int/2addr v0, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string v0, "width"

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    :goto_1
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    sub-int/2addr v2, p2

    .line 89
    add-int/2addr v2, v6

    .line 90
    move p2, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const-string v2, "height"

    .line 93
    .line 94
    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    :goto_2
    move v10, v0

    .line 99
    move v0, p2

    .line 100
    move p2, v10

    .line 101
    :goto_3
    iget v2, p1, Landroidx/media3/common/b;->E:F

    .line 102
    .line 103
    iget v3, p1, Landroidx/media3/common/b;->C:I

    .line 104
    .line 105
    const/16 v4, 0x5a

    .line 106
    .line 107
    if-eq v3, v4, :cond_5

    .line 108
    .line 109
    const/16 v4, 0x10e

    .line 110
    .line 111
    if-ne v3, v4, :cond_6

    .line 112
    .line 113
    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 114
    .line 115
    div-float v2, v3, v2

    .line 116
    .line 117
    move v10, v0

    .line 118
    move v0, p2

    .line 119
    move p2, v10

    .line 120
    :cond_6
    new-instance v3, La/qfu0;

    .line 121
    .line 122
    invoke-direct {v3, p2, v2, v0}, La/qfu0;-><init>(IFI)V

    .line 123
    .line 124
    .line 125
    iput-object v3, p0, La/xm30;->V2:La/qfu0;

    .line 126
    .line 127
    iget-object v4, p0, La/xm30;->B2:La/pfu0;

    .line 128
    .line 129
    if-eqz v4, :cond_a

    .line 130
    .line 131
    iget-boolean v3, p0, La/xm30;->d3:Z

    .line 132
    .line 133
    if-eqz v3, :cond_a

    .line 134
    .line 135
    if-lez p2, :cond_9

    .line 136
    .line 137
    if-gtz v0, :cond_7

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_7
    invoke-virtual {p1}, Landroidx/media3/common/b;->a()La/awq;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput p2, p1, La/awq;->v:I

    .line 145
    .line 146
    iput v0, p1, La/awq;->w:I

    .line 147
    .line 148
    iput v2, p1, La/awq;->D:F

    .line 149
    .line 150
    new-instance v5, Landroidx/media3/common/b;

    .line 151
    .line 152
    invoke-direct {v5, p1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 153
    .line 154
    .line 155
    iget v8, p0, La/xm30;->D2:I

    .line 156
    .line 157
    iget-object p1, p0, La/xm30;->E2:Ljava/util/List;

    .line 158
    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    :goto_4
    move-object v9, p1

    .line 162
    goto :goto_5

    .line 163
    :cond_8
    sget-object p1, La/b4x;->b:La/v3x;

    .line 164
    .line 165
    sget-object p1, La/rcf0;->e:La/rcf0;

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :goto_5
    iget-object p1, p0, La/mm30;->Z1:La/lm30;

    .line 169
    .line 170
    iget-wide v6, p1, La/lm30;->b:J

    .line 171
    .line 172
    invoke-interface/range {v4 .. v9}, La/pfu0;->f(Landroidx/media3/common/b;JILjava/util/List;)V

    .line 173
    .line 174
    .line 175
    const/4 p1, 0x2

    .line 176
    iput p1, p0, La/xm30;->D2:I

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_9
    :goto_6
    return-void

    .line 180
    :cond_a
    iget p1, p1, Landroidx/media3/common/b;->B:F

    .line 181
    .line 182
    iget-object p2, p0, La/xm30;->r2:La/fiq;

    .line 183
    .line 184
    iput p1, p2, La/fiq;->f:F

    .line 185
    .line 186
    iget-object p1, p2, La/fiq;->a:La/eiq;

    .line 187
    .line 188
    invoke-virtual {p1}, La/eiq;->c()V

    .line 189
    .line 190
    .line 191
    iget-object p1, p2, La/fiq;->b:La/eiq;

    .line 192
    .line 193
    invoke-virtual {p1}, La/eiq;->c()V

    .line 194
    .line 195
    .line 196
    iput-boolean v1, p2, La/fiq;->c:Z

    .line 197
    .line 198
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    iput-wide v2, p2, La/fiq;->d:J

    .line 204
    .line 205
    iput v1, p2, La/fiq;->e:I

    .line 206
    .line 207
    invoke-virtual {p2}, La/fiq;->c()V

    .line 208
    .line 209
    .line 210
    :goto_7
    iput-boolean v1, p0, La/xm30;->d3:Z

    .line 211
    .line 212
    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "MediaCodecVideoRenderer"

    .line 2
    .line 3
    return-object p0
.end method

.method public final k0(J)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, La/mm30;->k0(J)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, La/xm30;->Y2:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget p1, p0, La/xm30;->O2:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    iput p1, p0, La/xm30;->O2:I

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final l0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, La/pfu0;->e()V

    .line 6
    .line 7
    .line 8
    iget-wide v0, p0, La/xm30;->c3:J

    .line 9
    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, La/mm30;->Z1:La/lm30;

    .line 20
    .line 21
    iget-wide v0, v0, La/lm30;->b:J

    .line 22
    .line 23
    iput-wide v0, p0, La/xm30;->c3:J

    .line 24
    .line 25
    :cond_0
    iget-object v2, p0, La/xm30;->B2:La/pfu0;

    .line 26
    .line 27
    neg-long v0, v0

    .line 28
    invoke-interface {v2, v0, v1}, La/pfu0;->d(J)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, La/xm30;->p2:La/ueu0;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    invoke-virtual {v0, v1}, La/ueu0;->e(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, La/xm30;->d3:Z

    .line 40
    .line 41
    invoke-virtual {p0}, La/xm30;->O0()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/mm30;->U1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/xm30;->B2:La/pfu0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, La/pfu0;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final m0(La/wkj;)V
    .locals 14

    .line 1
    iget-object v0, p0, La/mm30;->t1:La/jm30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/jm30;->b:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "video/av01"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    iget-object v1, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/media3/common/b;->H:La/c4d;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget v0, v0, La/c4d;->e:I

    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-le v0, v4, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v0, v2

    .line 39
    :goto_0
    iget-boolean v4, p0, La/xm30;->A2:Z

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    invoke-static {v1, v2}, La/lv00;->V(Ljava/nio/ByteBuffer;Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-boolean v0, p0, La/xm30;->y2:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    invoke-static {v1, v3}, La/lv00;->V(Ljava/nio/ByteBuffer;Z)V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    iget-object v0, p0, La/xm30;->s2:La/yzn0;

    .line 69
    .line 70
    if-eqz v0, :cond_17

    .line 71
    .line 72
    invoke-virtual {p1, v3}, La/syx;->m(I)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_17

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    add-int/lit16 v6, v4, 0x1f4

    .line 87
    .line 88
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 93
    .line 94
    .line 95
    iget-object v0, v0, La/yzn0;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 112
    .line 113
    .line 114
    goto/16 :goto_c

    .line 115
    .line 116
    :cond_3
    const-string v1, "video/hevc"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_17

    .line 123
    .line 124
    iget-object v0, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    if-eqz v0, :cond_17

    .line 127
    .line 128
    iget-boolean v1, p0, La/xm30;->A2:Z

    .line 129
    .line 130
    if-eqz v1, :cond_17

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_17

    .line 137
    .line 138
    iget-object v0, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    sub-int v5, v4, v1

    .line 149
    .line 150
    const/4 v6, 0x4

    .line 151
    if-ge v5, v6, :cond_4

    .line 152
    .line 153
    goto/16 :goto_c

    .line 154
    .line 155
    :cond_4
    :goto_2
    if-ge v1, v4, :cond_17

    .line 156
    .line 157
    invoke-static {v0, v1, v4}, La/ibc;->d0(Ljava/nio/ByteBuffer;II)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-ne v1, v4, :cond_5

    .line 162
    .line 163
    goto/16 :goto_c

    .line 164
    .line 165
    :cond_5
    add-int/lit8 v5, v1, 0x3

    .line 166
    .line 167
    if-lt v5, v4, :cond_6

    .line 168
    .line 169
    goto/16 :goto_c

    .line 170
    .line 171
    :cond_6
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    and-int/lit8 v7, v7, 0x7e

    .line 176
    .line 177
    shr-int/2addr v7, v3

    .line 178
    if-ltz v7, :cond_7

    .line 179
    .line 180
    const/16 v8, 0x1f

    .line 181
    .line 182
    if-gt v7, v8, :cond_7

    .line 183
    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :cond_7
    const/16 v8, 0x27

    .line 187
    .line 188
    if-ne v7, v8, :cond_16

    .line 189
    .line 190
    add-int/lit8 v1, v1, 0x5

    .line 191
    .line 192
    invoke-static {v0, v1, v4}, La/ibc;->d0(Ljava/nio/ByteBuffer;II)I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    move v7, v2

    .line 197
    :cond_8
    :goto_3
    if-ge v1, v5, :cond_16

    .line 198
    .line 199
    move v8, v2

    .line 200
    :goto_4
    const/4 v9, 0x2

    .line 201
    const/4 v10, 0x3

    .line 202
    const/16 v11, 0xff

    .line 203
    .line 204
    if-ge v1, v5, :cond_d

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    and-int/2addr v12, v11

    .line 211
    if-ne v12, v10, :cond_9

    .line 212
    .line 213
    if-lt v7, v9, :cond_9

    .line 214
    .line 215
    add-int/lit8 v1, v1, 0x1

    .line 216
    .line 217
    move v7, v2

    .line 218
    goto :goto_4

    .line 219
    :cond_9
    if-nez v12, :cond_a

    .line 220
    .line 221
    add-int/lit8 v7, v7, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    move v7, v2

    .line 225
    :goto_5
    add-int/lit8 v13, v1, 0x1

    .line 226
    .line 227
    add-int/2addr v8, v12

    .line 228
    if-eq v12, v11, :cond_c

    .line 229
    .line 230
    if-ne v8, v6, :cond_b

    .line 231
    .line 232
    const/4 v8, -0x2

    .line 233
    invoke-virtual {v0, v1, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    .line 236
    :cond_b
    move v1, v13

    .line 237
    goto :goto_6

    .line 238
    :cond_c
    move v1, v13

    .line 239
    goto :goto_4

    .line 240
    :cond_d
    :goto_6
    if-lt v1, v5, :cond_e

    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_e
    move v8, v2

    .line 244
    :cond_f
    :goto_7
    if-ge v1, v5, :cond_12

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    and-int/2addr v12, v11

    .line 251
    if-ne v12, v10, :cond_10

    .line 252
    .line 253
    if-lt v7, v9, :cond_10

    .line 254
    .line 255
    add-int/lit8 v1, v1, 0x1

    .line 256
    .line 257
    move v7, v2

    .line 258
    goto :goto_7

    .line 259
    :cond_10
    if-nez v12, :cond_11

    .line 260
    .line 261
    add-int/lit8 v7, v7, 0x1

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_11
    move v7, v2

    .line 265
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 266
    .line 267
    add-int/2addr v8, v12

    .line 268
    if-eq v12, v11, :cond_f

    .line 269
    .line 270
    :cond_12
    move v12, v2

    .line 271
    :goto_9
    if-ge v12, v8, :cond_8

    .line 272
    .line 273
    if-lt v1, v5, :cond_13

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_13
    add-int/lit8 v13, v1, 0x1

    .line 277
    .line 278
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    and-int/2addr v1, v11

    .line 283
    if-ne v1, v10, :cond_15

    .line 284
    .line 285
    if-lt v7, v9, :cond_15

    .line 286
    .line 287
    add-int/lit8 v12, v12, -0x1

    .line 288
    .line 289
    :cond_14
    move v7, v2

    .line 290
    goto :goto_a

    .line 291
    :cond_15
    if-nez v1, :cond_14

    .line 292
    .line 293
    add-int/lit8 v7, v7, 0x1

    .line 294
    .line 295
    :goto_a
    add-int/2addr v12, v3

    .line 296
    move v1, v13

    .line 297
    goto :goto_9

    .line 298
    :cond_16
    :goto_b
    move v1, v5

    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_17
    :goto_c
    iput v2, p0, La/xm30;->e3:I

    .line 302
    .line 303
    invoke-virtual {p0, p1}, La/xm30;->R(La/wkj;)I

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 308
    .line 309
    const/16 v1, 0x22

    .line 310
    .line 311
    if-lt v0, v1, :cond_18

    .line 312
    .line 313
    and-int/lit8 p1, p1, 0x20

    .line 314
    .line 315
    if-nez p1, :cond_19

    .line 316
    .line 317
    :cond_18
    iget-boolean p1, p0, La/xm30;->Y2:Z

    .line 318
    .line 319
    if-nez p1, :cond_19

    .line 320
    .line 321
    iget p1, p0, La/xm30;->O2:I

    .line 322
    .line 323
    add-int/2addr p1, v3

    .line 324
    iput p1, p0, La/xm30;->O2:I

    .line 325
    .line 326
    :cond_19
    return-void
.end method

.method public final o()Z
    .locals 6

    .line 1
    iget-object v0, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, La/j16;->l()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, La/j16;->n:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, La/j16;->i:La/ixg0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, La/ixg0;

    .line 21
    .line 22
    invoke-interface {v0}, La/ixg0;->isReady()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget v0, p0, La/mm30;->D1:I

    .line 29
    .line 30
    if-ltz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-wide v2, p0, La/mm30;->B1:J

    .line 34
    .line 35
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v0, v2, v4

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v0, p0, La/j16;->g:La/l9o0;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    iget-wide v4, p0, La/mm30;->B1:J

    .line 54
    .line 55
    cmp-long v0, v2, v4

    .line 56
    .line 57
    if-gez v0, :cond_3

    .line 58
    .line 59
    :cond_2
    :goto_1
    move v0, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    :goto_2
    iget-object v2, p0, La/xm30;->B2:La/pfu0;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-interface {v2, v0}, La/pfu0;->h(Z)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    :cond_4
    if-eqz v0, :cond_6

    .line 72
    .line 73
    iget-object v2, p0, La/mm30;->m1:La/dm30;

    .line 74
    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    iget-boolean v2, p0, La/xm30;->Y2:Z

    .line 78
    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    :cond_5
    return v1

    .line 82
    :cond_6
    iget-object p0, p0, La/xm30;->p2:La/ueu0;

    .line 83
    .line 84
    invoke-virtual {p0, v0}, La/ueu0;->b(Z)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public final o0(JJLa/dm30;Ljava/nio/ByteBuffer;IIIJZZLandroidx/media3/common/b;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    move/from16 v3, p7

    .line 6
    .line 7
    move-wide/from16 v6, p10

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, La/mm30;->Z1:La/lm30;

    .line 13
    .line 14
    iget-wide v4, v0, La/lm30;->c:J

    .line 15
    .line 16
    sub-long v4, v6, v4

    .line 17
    .line 18
    iget-object v0, v1, La/xm30;->p2:La/ueu0;

    .line 19
    .line 20
    iget-wide v8, v0, La/ueu0;->h:J

    .line 21
    .line 22
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v8, v10

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v9

    .line 35
    :goto_0
    move v10, v9

    .line 36
    move v11, v10

    .line 37
    :goto_1
    iget-object v12, v1, La/xm30;->v2:Ljava/util/PriorityQueue;

    .line 38
    .line 39
    invoke-virtual {v12}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v13

    .line 43
    check-cast v13, Ljava/lang/Long;

    .line 44
    .line 45
    const-wide/16 v14, 0x3e8

    .line 46
    .line 47
    const/16 p6, 0x1

    .line 48
    .line 49
    iget-object v8, v1, La/xm30;->r2:La/fiq;

    .line 50
    .line 51
    if-eqz v13, :cond_2

    .line 52
    .line 53
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v16

    .line 57
    cmp-long v16, v16, v6

    .line 58
    .line 59
    if-gez v16, :cond_2

    .line 60
    .line 61
    invoke-virtual {v12}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v16

    .line 68
    mul-long v14, v14, v16

    .line 69
    .line 70
    invoke-virtual {v8, v14, v15}, La/fiq;->b(J)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v12

    .line 77
    iget-wide v14, v1, La/j16;->l:J

    .line 78
    .line 79
    cmp-long v8, v12, v14

    .line 80
    .line 81
    if-ltz v8, :cond_1

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    add-int/lit8 v10, v10, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v1, v10, v9}, La/xm30;->U0(II)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v1, La/mm30;->Y1:La/tkj;

    .line 95
    .line 96
    iget v10, v0, La/tkj;->d:I

    .line 97
    .line 98
    add-int/2addr v10, v11

    .line 99
    iput v10, v0, La/tkj;->d:I

    .line 100
    .line 101
    mul-long v10, v6, v14

    .line 102
    .line 103
    invoke-virtual {v8, v10, v11}, La/fiq;->b(J)V

    .line 104
    .line 105
    .line 106
    iget-object v10, v1, La/xm30;->B2:La/pfu0;

    .line 107
    .line 108
    if-eqz v10, :cond_4

    .line 109
    .line 110
    if-eqz p12, :cond_3

    .line 111
    .line 112
    if-nez p13, :cond_3

    .line 113
    .line 114
    invoke-virtual {v1, v2, v3}, La/xm30;->T0(La/dm30;I)V

    .line 115
    .line 116
    .line 117
    return p6

    .line 118
    :cond_3
    new-instance v0, La/tm30;

    .line 119
    .line 120
    invoke-direct/range {v0 .. v5}, La/tm30;-><init>(La/xm30;La/dm30;IJ)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v10, v6, v7, v0}, La/pfu0;->c(JLa/tm30;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    return v0

    .line 128
    :cond_4
    move-object v0, v1

    .line 129
    move-wide/from16 v17, v4

    .line 130
    .line 131
    iget-object v1, v0, La/mm30;->Z1:La/lm30;

    .line 132
    .line 133
    iget-wide v1, v1, La/lm30;->b:J

    .line 134
    .line 135
    invoke-virtual {v8}, La/fiq;->a()J

    .line 136
    .line 137
    .line 138
    move-result-wide v12

    .line 139
    iget-wide v14, v8, La/fiq;->h:J

    .line 140
    .line 141
    iget-object v3, v0, La/xm30;->q2:La/br8;

    .line 142
    .line 143
    move-wide/from16 v19, v1

    .line 144
    .line 145
    move v2, v9

    .line 146
    move-wide/from16 v8, v19

    .line 147
    .line 148
    iget-object v1, v0, La/xm30;->p2:La/ueu0;

    .line 149
    .line 150
    move-wide/from16 v4, p1

    .line 151
    .line 152
    move/from16 v10, p12

    .line 153
    .line 154
    move/from16 v11, p13

    .line 155
    .line 156
    move-object/from16 v16, v3

    .line 157
    .line 158
    move-wide v2, v6

    .line 159
    move-wide/from16 v6, p3

    .line 160
    .line 161
    invoke-virtual/range {v1 .. v16}, La/ueu0;->a(JJJJZZJJLa/br8;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    const/4 v4, 0x4

    .line 166
    const/4 v5, 0x5

    .line 167
    iget-object v13, v0, La/xm30;->q2:La/br8;

    .line 168
    .line 169
    iget-object v6, v0, La/xm30;->u2:La/veu0;

    .line 170
    .line 171
    if-eqz v6, :cond_5

    .line 172
    .line 173
    if-eq v1, v5, :cond_5

    .line 174
    .line 175
    if-eq v1, v4, :cond_5

    .line 176
    .line 177
    iget-wide v7, v13, La/br8;->b:J

    .line 178
    .line 179
    invoke-virtual {v6, v2, v3, v7, v8}, La/veu0;->a(JJ)V

    .line 180
    .line 181
    .line 182
    :cond_5
    if-eqz v1, :cond_d

    .line 183
    .line 184
    const/4 v2, 0x1

    .line 185
    if-eq v1, v2, :cond_a

    .line 186
    .line 187
    const/4 v3, 0x2

    .line 188
    if-eq v1, v3, :cond_9

    .line 189
    .line 190
    const/4 v3, 0x3

    .line 191
    if-eq v1, v3, :cond_8

    .line 192
    .line 193
    if-eq v1, v4, :cond_6

    .line 194
    .line 195
    if-ne v1, v5, :cond_7

    .line 196
    .line 197
    :cond_6
    const/4 v1, 0x0

    .line 198
    goto :goto_2

    .line 199
    :cond_7
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const/4 v1, 0x0

    .line 207
    :goto_2
    return v1

    .line 208
    :cond_8
    move-object/from16 v3, p5

    .line 209
    .line 210
    move/from16 v4, p7

    .line 211
    .line 212
    invoke-virtual {v0, v3, v4}, La/xm30;->T0(La/dm30;I)V

    .line 213
    .line 214
    .line 215
    iget-wide v3, v13, La/br8;->b:J

    .line 216
    .line 217
    invoke-virtual {v0, v3, v4}, La/xm30;->V0(J)V

    .line 218
    .line 219
    .line 220
    return v2

    .line 221
    :cond_9
    move-object/from16 v3, p5

    .line 222
    .line 223
    move/from16 v4, p7

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    const-string v5, "dropVideoBuffer"

    .line 227
    .line 228
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v3, v4}, La/dm30;->k(I)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, La/xm30;->U0(II)V

    .line 238
    .line 239
    .line 240
    iget-wide v3, v13, La/br8;->b:J

    .line 241
    .line 242
    invoke-virtual {v0, v3, v4}, La/xm30;->V0(J)V

    .line 243
    .line 244
    .line 245
    return v2

    .line 246
    :cond_a
    move-object/from16 v3, p5

    .line 247
    .line 248
    move/from16 v4, p7

    .line 249
    .line 250
    iget-wide v9, v13, La/br8;->c:J

    .line 251
    .line 252
    iget-wide v13, v13, La/br8;->b:J

    .line 253
    .line 254
    iget-wide v5, v0, La/xm30;->U2:J

    .line 255
    .line 256
    cmp-long v1, v9, v5

    .line 257
    .line 258
    if-nez v1, :cond_b

    .line 259
    .line 260
    invoke-virtual {v0, v3, v4}, La/xm30;->T0(La/dm30;I)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_b
    iget-object v6, v0, La/xm30;->b3:La/seu0;

    .line 265
    .line 266
    if-eqz v6, :cond_c

    .line 267
    .line 268
    iget-object v12, v0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 269
    .line 270
    move-object/from16 v11, p14

    .line 271
    .line 272
    move-wide/from16 v7, v17

    .line 273
    .line 274
    invoke-interface/range {v6 .. v12}, La/seu0;->d(JJLandroidx/media3/common/b;Landroid/media/MediaFormat;)V

    .line 275
    .line 276
    .line 277
    :cond_c
    invoke-virtual {v0, v3, v4, v9, v10}, La/xm30;->P0(La/dm30;IJ)V

    .line 278
    .line 279
    .line 280
    :goto_3
    invoke-virtual {v0, v13, v14}, La/xm30;->V0(J)V

    .line 281
    .line 282
    .line 283
    iput-wide v9, v0, La/xm30;->U2:J

    .line 284
    .line 285
    return v2

    .line 286
    :cond_d
    move-object/from16 v3, p5

    .line 287
    .line 288
    move/from16 v4, p7

    .line 289
    .line 290
    move-wide/from16 v7, v17

    .line 291
    .line 292
    const/4 v2, 0x1

    .line 293
    iget-object v1, v0, La/j16;->g:La/l9o0;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 299
    .line 300
    .line 301
    move-result-wide v9

    .line 302
    iget-object v6, v0, La/xm30;->b3:La/seu0;

    .line 303
    .line 304
    if-eqz v6, :cond_e

    .line 305
    .line 306
    iget-object v12, v0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 307
    .line 308
    move-object/from16 v11, p14

    .line 309
    .line 310
    invoke-interface/range {v6 .. v12}, La/seu0;->d(JJLandroidx/media3/common/b;Landroid/media/MediaFormat;)V

    .line 311
    .line 312
    .line 313
    :cond_e
    invoke-virtual {v0, v3, v4, v9, v10}, La/xm30;->P0(La/dm30;IJ)V

    .line 314
    .line 315
    .line 316
    iget-wide v3, v13, La/br8;->b:J

    .line 317
    .line 318
    invoke-virtual {v0, v3, v4}, La/xm30;->V0(J)V

    .line 319
    .line 320
    .line 321
    return v2
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, La/xm30;->m2:La/fck0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, La/xm30;->W2:La/qfu0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/xm30;->O0()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-boolean v2, p0, La/xm30;->I2:Z

    .line 11
    .line 12
    iput-object v1, p0, La/xm30;->a3:La/wm30;

    .line 13
    .line 14
    invoke-virtual {p0}, La/xm30;->y0()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput-boolean v1, p0, La/xm30;->R2:Z

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    :try_start_0
    invoke-super {p0}, La/mm30;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/mm30;->Y1:La/tkj;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    monitor-enter p0

    .line 31
    monitor-exit p0

    .line 32
    iget-object v2, v0, La/fck0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Landroid/os/Handler;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    new-instance v3, La/qaq0;

    .line 39
    .line 40
    invoke-direct {v3, v0, p0, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p0, La/qfu0;->d:La/qfu0;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, La/fck0;->j(La/qfu0;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v2

    .line 53
    iget-object p0, p0, La/mm30;->Y1:La/tkj;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    monitor-enter p0

    .line 59
    monitor-exit p0

    .line 60
    iget-object v3, v0, La/fck0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Landroid/os/Handler;

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    new-instance v4, La/qaq0;

    .line 67
    .line 68
    invoke-direct {v4, v0, p0, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    sget-object p0, La/qfu0;->d:La/qfu0;

    .line 75
    .line 76
    invoke-virtual {v0, p0}, La/fck0;->j(La/qfu0;)V

    .line 77
    .line 78
    .line 79
    throw v2
.end method

.method public final q(ZZ)V
    .locals 8

    .line 1
    new-instance p1, La/tkj;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 7
    .line 8
    iget-object p1, p0, La/j16;->d:La/tjf0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p1, La/tjf0;->b:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget v2, p0, La/xm30;->Z2:I

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v2, v1

    .line 27
    :goto_1
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, p0, La/xm30;->Y2:Z

    .line 31
    .line 32
    if-eq v2, p1, :cond_2

    .line 33
    .line 34
    iput-boolean p1, p0, La/xm30;->Y2:Z

    .line 35
    .line 36
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 40
    .line 41
    iget-object v2, p0, La/xm30;->m2:La/fck0;

    .line 42
    .line 43
    iget-object v3, v2, La/fck0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Landroid/os/Handler;

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    new-instance v4, La/ffu0;

    .line 50
    .line 51
    const/4 v5, 0x5

    .line 52
    invoke-direct {v4, v2, p1, v5}, La/ffu0;-><init>(La/fck0;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-boolean p1, p0, La/xm30;->C2:Z

    .line 59
    .line 60
    iget-object v2, p0, La/xm30;->p2:La/ueu0;

    .line 61
    .line 62
    if-nez p1, :cond_9

    .line 63
    .line 64
    iget-object p1, p0, La/xm30;->E2:Ljava/util/List;

    .line 65
    .line 66
    if-eqz p1, :cond_8

    .line 67
    .line 68
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 69
    .line 70
    if-nez p1, :cond_8

    .line 71
    .line 72
    new-instance p1, La/by90;

    .line 73
    .line 74
    iget-object v3, p0, La/xm30;->k2:Landroid/content/Context;

    .line 75
    .line 76
    invoke-direct {p1, v3, v2}, La/by90;-><init>(Landroid/content/Context;La/ueu0;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p1, La/by90;->d:Z

    .line 80
    .line 81
    iget-wide v3, p0, La/xm30;->t2:J

    .line 82
    .line 83
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    cmp-long v7, v3, v5

    .line 89
    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    neg-long v5, v3

    .line 93
    :cond_4
    iput-wide v5, p1, La/by90;->g:J

    .line 94
    .line 95
    iget-object v3, p0, La/j16;->g:La/l9o0;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iput-object v3, p1, La/by90;->e:La/l9o0;

    .line 101
    .line 102
    iget-boolean v3, p1, La/by90;->f:Z

    .line 103
    .line 104
    xor-int/2addr v3, v1

    .line 105
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v3, p1, La/by90;->c:La/ey90;

    .line 109
    .line 110
    if-nez v3, :cond_5

    .line 111
    .line 112
    new-instance v3, La/ey90;

    .line 113
    .line 114
    invoke-direct {v3}, La/ey90;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v3, p1, La/by90;->c:La/ey90;

    .line 118
    .line 119
    :cond_5
    new-instance v3, La/gy90;

    .line 120
    .line 121
    invoke-direct {v3, p1}, La/gy90;-><init>(La/by90;)V

    .line 122
    .line 123
    .line 124
    iput-boolean v1, p1, La/by90;->f:Z

    .line 125
    .line 126
    iget p1, v3, La/gy90;->p:I

    .line 127
    .line 128
    if-ge v1, p1, :cond_6

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    iput v1, v3, La/gy90;->p:I

    .line 132
    .line 133
    :goto_2
    iget-object p1, v3, La/gy90;->c:Landroid/util/SparseArray;

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-ltz v4, :cond_7

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, La/pfu0;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    new-instance v4, La/cy90;

    .line 149
    .line 150
    iget-object v5, v3, La/gy90;->a:Landroid/content/Context;

    .line 151
    .line 152
    invoke-direct {v4, v3, v5}, La/cy90;-><init>(La/gy90;Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, v3, La/gy90;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object p1, v4

    .line 164
    :goto_3
    iput-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 165
    .line 166
    :cond_8
    iput-boolean v1, p0, La/xm30;->C2:Z

    .line 167
    .line 168
    :cond_9
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 169
    .line 170
    if-eqz p1, :cond_d

    .line 171
    .line 172
    new-instance v0, La/sm30;

    .line 173
    .line 174
    invoke-direct {v0, p0}, La/sm30;-><init>(La/xm30;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {p1, v0}, La/pfu0;->i(La/sm30;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, La/xm30;->b3:La/seu0;

    .line 181
    .line 182
    if-eqz p1, :cond_a

    .line 183
    .line 184
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 185
    .line 186
    invoke-interface {v0, p1}, La/pfu0;->u(La/seu0;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    iget-object p1, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 190
    .line 191
    if-eqz p1, :cond_b

    .line 192
    .line 193
    iget-object p1, p0, La/xm30;->H2:La/e7k0;

    .line 194
    .line 195
    sget-object v0, La/e7k0;->c:La/e7k0;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, La/e7k0;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-nez p1, :cond_b

    .line 202
    .line 203
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 204
    .line 205
    iget-object v0, p0, La/xm30;->F2:Landroid/view/Surface;

    .line 206
    .line 207
    iget-object v2, p0, La/xm30;->H2:La/e7k0;

    .line 208
    .line 209
    invoke-interface {p1, v0, v2}, La/pfu0;->l(Landroid/view/Surface;La/e7k0;)V

    .line 210
    .line 211
    .line 212
    :cond_b
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 213
    .line 214
    iget v0, p0, La/xm30;->K2:I

    .line 215
    .line 216
    invoke-interface {p1, v0}, La/pfu0;->p(I)V

    .line 217
    .line 218
    .line 219
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 220
    .line 221
    iget v0, p0, La/mm30;->k1:F

    .line 222
    .line 223
    invoke-interface {p1, v0}, La/pfu0;->q(F)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, La/xm30;->E2:Ljava/util/List;

    .line 227
    .line 228
    if-eqz p1, :cond_c

    .line 229
    .line 230
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 231
    .line 232
    invoke-interface {v0, p1}, La/pfu0;->g(Ljava/util/List;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    xor-int/lit8 p1, p2, 0x1

    .line 236
    .line 237
    iput p1, p0, La/xm30;->D2:I

    .line 238
    .line 239
    iput-boolean v1, p0, La/mm30;->c2:Z

    .line 240
    .line 241
    return-void

    .line 242
    :cond_d
    iget-object p0, p0, La/j16;->g:La/l9o0;

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iput-object p0, v2, La/ueu0;->k:La/l9o0;

    .line 248
    .line 249
    xor-int/lit8 p0, p2, 0x1

    .line 250
    .line 251
    invoke-virtual {v2, p0}, La/ueu0;->e(I)V

    .line 252
    .line 253
    .line 254
    return-void
.end method

.method public final r(JZZ)V
    .locals 4

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, v1}, La/pfu0;->s(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p4, :cond_1

    .line 12
    .line 13
    iput-wide p1, p0, La/xm30;->Q2:J

    .line 14
    .line 15
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, La/mm30;->r(JZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 19
    .line 20
    iget-object p2, p0, La/xm30;->p2:La/ueu0;

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p2, La/ueu0;->b:La/zeu0;

    .line 26
    .line 27
    invoke-virtual {p1}, La/zeu0;->b()V

    .line 28
    .line 29
    .line 30
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v2, p2, La/ueu0;->f:J

    .line 36
    .line 37
    iget p1, p2, La/ueu0;->e:I

    .line 38
    .line 39
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p2, La/ueu0;->e:I

    .line 44
    .line 45
    iput-wide v2, p2, La/ueu0;->h:J

    .line 46
    .line 47
    iput-boolean p4, p2, La/ueu0;->m:Z

    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, La/xm30;->u2:La/veu0;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1}, La/veu0;->b()V

    .line 54
    .line 55
    .line 56
    :cond_3
    if-eqz p3, :cond_5

    .line 57
    .line 58
    iget-object p1, p0, La/xm30;->B2:La/pfu0;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    invoke-interface {p1, p4}, La/pfu0;->v(Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-virtual {p2, p4}, La/ueu0;->c(Z)V

    .line 67
    .line 68
    .line 69
    :cond_5
    :goto_0
    invoke-virtual {p0}, La/xm30;->O0()V

    .line 70
    .line 71
    .line 72
    iput p4, p0, La/xm30;->N2:I

    .line 73
    .line 74
    return-void
.end method

.method public final r0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/pfu0;->e()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, La/mm30;->Z1:La/lm30;

    .line 10
    .line 11
    iget-wide v0, p0, La/lm30;->h:J

    .line 12
    .line 13
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, La/xm30;->l2:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, La/pfu0;->release()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final t()V
    .locals 6

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    iput-boolean v2, p0, La/mm30;->G1:Z

    .line 9
    .line 10
    invoke-virtual {p0}, La/mm30;->s0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/mm30;->q0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_1
    iget-object v4, p0, La/mm30;->h1:La/ivn;

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v4, v3}, La/ivn;->m(La/zhl;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iput-object v3, p0, La/mm30;->h1:La/ivn;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    iput-boolean v2, p0, La/xm30;->C2:Z

    .line 27
    .line 28
    iput-wide v0, p0, La/xm30;->c3:J

    .line 29
    .line 30
    iput-boolean v2, p0, La/xm30;->A2:Z

    .line 31
    .line 32
    iget-object v0, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->release()V

    .line 37
    .line 38
    .line 39
    iput-object v3, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :catchall_0
    move-exception v4

    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception v4

    .line 45
    :try_start_2
    iget-object v5, p0, La/mm30;->h1:La/ivn;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    invoke-virtual {v5, v3}, La/ivn;->m(La/zhl;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iput-object v3, p0, La/mm30;->h1:La/ivn;

    .line 53
    .line 54
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :goto_1
    iput-boolean v2, p0, La/xm30;->C2:Z

    .line 56
    .line 57
    iput-wide v0, p0, La/xm30;->c3:J

    .line 58
    .line 59
    iput-boolean v2, p0, La/xm30;->A2:Z

    .line 60
    .line 61
    iget-object v0, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->release()V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, La/xm30;->G2:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    .line 69
    .line 70
    :cond_3
    throw v4
.end method

.method public final t0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/mm30;->t0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/xm30;->v2:Ljava/util/PriorityQueue;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, La/xm30;->O2:I

    .line 11
    .line 12
    iput v0, p0, La/xm30;->e3:I

    .line 13
    .line 14
    iput-boolean v0, p0, La/xm30;->R2:Z

    .line 15
    .line 16
    iget-object p0, p0, La/xm30;->s2:La/yzn0;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, La/yzn0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p0, p0, La/yzn0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final u()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/xm30;->M2:I

    .line 3
    .line 4
    iget-object v1, p0, La/j16;->g:La/l9o0;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, p0, La/xm30;->L2:J

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    iput-wide v1, p0, La/xm30;->S2:J

    .line 18
    .line 19
    iput v0, p0, La/xm30;->T2:I

    .line 20
    .line 21
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, La/pfu0;->o()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p0, p0, La/xm30;->p2:La/ueu0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/ueu0;->d()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final v()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/xm30;->N0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/xm30;->T2:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v2, p0, La/xm30;->S2:J

    .line 10
    .line 11
    iget-object v4, p0, La/xm30;->m2:La/fck0;

    .line 12
    .line 13
    iget-object v5, v4, La/fck0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Landroid/os/Handler;

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    new-instance v6, La/ffu0;

    .line 20
    .line 21
    invoke-direct {v6, v4, v2, v3, v0}, La/ffu0;-><init>(La/fck0;JI)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    iput-wide v2, p0, La/xm30;->S2:J

    .line 30
    .line 31
    iput v1, p0, La/xm30;->T2:I

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, La/pfu0;->n()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object v0, p0, La/xm30;->p2:La/ueu0;

    .line 42
    .line 43
    iput-boolean v1, v0, La/ueu0;->d:Z

    .line 44
    .line 45
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    iput-wide v2, v0, La/ueu0;->h:J

    .line 51
    .line 52
    iget-object v0, v0, La/ueu0;->b:La/zeu0;

    .line 53
    .line 54
    iput-boolean v1, v0, La/zeu0;->d:Z

    .line 55
    .line 56
    iget-object v1, v0, La/zeu0;->c:La/weu0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, La/weu0;->b()V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {v0}, La/zeu0;->a()V

    .line 64
    .line 65
    .line 66
    :goto_0
    iget-object p0, p0, La/xm30;->u2:La/veu0;

    .line 67
    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, La/veu0;->b()V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public final w([Landroidx/media3/common/b;JJLa/vn30;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, La/mm30;->w([Landroidx/media3/common/b;JJLa/vn30;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/xm30;->u2:La/veu0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/veu0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final x0(La/wkj;)Z
    .locals 14

    .line 1
    invoke-virtual {p0, p1}, La/xm30;->M0(La/wkj;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    iget-wide v2, p1, La/wkj;->i:J

    .line 10
    .line 11
    iget-wide v4, p0, La/j16;->l:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    move v0, v4

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v0, v1

    .line 21
    :goto_0
    iget-object v5, p0, La/xm30;->u2:La/veu0;

    .line 22
    .line 23
    if-eqz v5, :cond_3

    .line 24
    .line 25
    iget-wide v6, v5, La/veu0;->a:J

    .line 26
    .line 27
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v10, v6, v8

    .line 33
    .line 34
    if-nez v10, :cond_2

    .line 35
    .line 36
    move-wide v2, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-wide v10, v5, La/veu0;->b:J

    .line 39
    .line 40
    long-to-double v10, v10

    .line 41
    sub-long/2addr v2, v6

    .line 42
    long-to-double v2, v2

    .line 43
    iget-wide v5, v5, La/veu0;->c:D

    .line 44
    .line 45
    mul-double/2addr v2, v5

    .line 46
    add-double/2addr v2, v10

    .line 47
    double-to-long v2, v2

    .line 48
    :goto_1
    cmp-long v5, v2, v8

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    iget-wide v5, p0, La/xm30;->t2:J

    .line 53
    .line 54
    cmp-long v2, v2, v5

    .line 55
    .line 56
    if-gez v2, :cond_3

    .line 57
    .line 58
    move v2, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move v2, v1

    .line 61
    :goto_2
    if-nez v0, :cond_4

    .line 62
    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/high16 v2, 0x10000000

    .line 67
    .line 68
    invoke-virtual {p1, v2}, La/syx;->m(I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    :goto_3
    return v1

    .line 75
    :cond_5
    const/high16 v2, 0x4000000

    .line 76
    .line 77
    invoke-virtual {p1, v2}, La/syx;->m(I)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1}, La/wkj;->v()V

    .line 84
    .line 85
    .line 86
    :goto_4
    move v1, v4

    .line 87
    goto/16 :goto_d

    .line 88
    .line 89
    :cond_6
    iget-object v2, p0, La/xm30;->s2:La/yzn0;

    .line 90
    .line 91
    if-eqz v2, :cond_15

    .line 92
    .line 93
    iget-object v3, v2, La/yzn0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    iget-object v5, p0, La/mm30;->t1:La/jm30;

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v5, v5, La/jm30;->b:Ljava/lang/String;

    .line 103
    .line 104
    const-string v6, "video/av01"

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_15

    .line 111
    .line 112
    iget-object v5, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    if-eqz v5, :cond_15

    .line 115
    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    iget v6, p0, La/xm30;->e3:I

    .line 119
    .line 120
    if-gtz v6, :cond_7

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_7
    move v6, v1

    .line 124
    goto :goto_6

    .line 125
    :cond_8
    :goto_5
    move v6, v4

    .line 126
    :goto_6
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_9

    .line 138
    .line 139
    invoke-static {v3}, La/d9x;->T(Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v2, v7}, La/yzn0;->x(Ljava/util/ArrayList;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 151
    .line 152
    .line 153
    :cond_9
    invoke-static {v5}, La/d9x;->T(Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v2, v3}, La/yzn0;->x(Ljava/util/ArrayList;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    sub-int/2addr v7, v4

    .line 165
    move v8, v1

    .line 166
    :goto_7
    if-ltz v7, :cond_10

    .line 167
    .line 168
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    check-cast v9, La/je60;

    .line 173
    .line 174
    iget v10, v9, La/je60;->a:I

    .line 175
    .line 176
    const/4 v11, 0x2

    .line 177
    const/4 v12, 0x6

    .line 178
    const/4 v13, 0x3

    .line 179
    if-eq v10, v11, :cond_d

    .line 180
    .line 181
    const/16 v11, 0xf

    .line 182
    .line 183
    if-ne v10, v11, :cond_a

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_a
    if-ne v10, v13, :cond_b

    .line 187
    .line 188
    if-nez v6, :cond_b

    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_b
    if-eq v10, v12, :cond_c

    .line 192
    .line 193
    if-ne v10, v13, :cond_10

    .line 194
    .line 195
    :cond_c
    iget-object v10, v2, La/yzn0;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v10, La/ke60;

    .line 198
    .line 199
    if-eqz v10, :cond_10

    .line 200
    .line 201
    :try_start_0
    new-instance v11, La/nqd;

    .line 202
    .line 203
    invoke-direct {v11, v10, v9}, La/nqd;-><init>(La/ke60;La/je60;)V
    :try_end_0
    .catch La/ie60; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    .line 205
    .line 206
    goto :goto_8

    .line 207
    :catch_0
    const/4 v11, 0x0

    .line 208
    :goto_8
    if-eqz v11, :cond_10

    .line 209
    .line 210
    iget-boolean v9, v11, La/nqd;->b:Z

    .line 211
    .line 212
    if-nez v9, :cond_10

    .line 213
    .line 214
    :cond_d
    :goto_9
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    check-cast v9, La/je60;

    .line 219
    .line 220
    iget v9, v9, La/je60;->a:I

    .line 221
    .line 222
    if-eq v9, v12, :cond_e

    .line 223
    .line 224
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    check-cast v9, La/je60;

    .line 229
    .line 230
    iget v9, v9, La/je60;->a:I

    .line 231
    .line 232
    if-ne v9, v13, :cond_f

    .line 233
    .line 234
    :cond_e
    add-int/lit8 v8, v8, 0x1

    .line 235
    .line 236
    :cond_f
    add-int/lit8 v7, v7, -0x1

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_10
    :goto_a
    if-gt v8, v4, :cond_13

    .line 240
    .line 241
    add-int/lit8 v2, v7, 0x1

    .line 242
    .line 243
    const/16 v6, 0x8

    .line 244
    .line 245
    if-lt v2, v6, :cond_11

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_11
    if-ltz v7, :cond_12

    .line 249
    .line 250
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, La/je60;

    .line 255
    .line 256
    iget-object v2, v2, La/je60;->b:Ljava/nio/ByteBuffer;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    goto :goto_c

    .line 263
    :cond_12
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    goto :goto_c

    .line 268
    :cond_13
    :goto_b
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    :goto_c
    if-nez v2, :cond_14

    .line 273
    .line 274
    invoke-virtual {p1}, La/wkj;->v()V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_4

    .line 278
    .line 279
    :cond_14
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eq v2, v3, :cond_15

    .line 284
    .line 285
    iget-object v3, p0, La/xm30;->w2:La/j6;

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget v3, v3, La/j6;->c:I

    .line 291
    .line 292
    add-int/2addr v3, v2

    .line 293
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-ge v3, v5, :cond_15

    .line 298
    .line 299
    const/high16 v3, 0x40000000    # 2.0f

    .line 300
    .line 301
    invoke-virtual {p1, v3}, La/syx;->m(I)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-nez v3, :cond_15

    .line 306
    .line 307
    iget-object v1, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 313
    .line 314
    .line 315
    goto/16 :goto_4

    .line 316
    .line 317
    :cond_15
    :goto_d
    if-eqz v1, :cond_17

    .line 318
    .line 319
    if-nez v0, :cond_16

    .line 320
    .line 321
    iget v0, p0, La/xm30;->e3:I

    .line 322
    .line 323
    add-int/2addr v0, v4

    .line 324
    iput v0, p0, La/xm30;->e3:I

    .line 325
    .line 326
    :cond_16
    iget-wide v2, p1, La/wkj;->i:J

    .line 327
    .line 328
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    iget-object p0, p0, La/xm30;->v2:Ljava/util/PriorityQueue;

    .line 333
    .line 334
    invoke-virtual {p0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    :cond_17
    return v1
.end method

.method public final y0()Z
    .locals 12

    .line 1
    iget-boolean v0, p0, La/mm30;->N1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    iget-object v0, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 8
    .line 9
    iget-wide v2, p0, La/j16;->r:J

    .line 10
    .line 11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v6, v2, v4

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    if-eqz v6, :cond_2

    .line 20
    .line 21
    const-wide/16 v8, 0x1

    .line 22
    .line 23
    add-long/2addr v8, v2

    .line 24
    iget-object v6, p0, La/mm30;->Z1:La/lm30;

    .line 25
    .line 26
    iget-wide v10, v6, La/lm30;->c:J

    .line 27
    .line 28
    add-long/2addr v10, v2

    .line 29
    iget-wide v2, p0, La/mm30;->e2:J

    .line 30
    .line 31
    add-long/2addr v2, v8

    .line 32
    const-wide v8, 0x7fffffffffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    sub-long/2addr v8, v10

    .line 38
    cmp-long v2, v2, v8

    .line 39
    .line 40
    if-lez v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v2, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    move v2, v7

    .line 46
    :goto_1
    iget-object v3, p0, La/xm30;->P2:La/uch0;

    .line 47
    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    iget-boolean v3, p0, La/xm30;->R2:Z

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    iget-boolean v3, p0, La/xm30;->Y2:Z

    .line 55
    .line 56
    if-nez v3, :cond_5

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget v0, v0, Landroidx/media3/common/b;->r:I

    .line 61
    .line 62
    if-gtz v0, :cond_5

    .line 63
    .line 64
    :cond_3
    if-nez v2, :cond_5

    .line 65
    .line 66
    iget-object p0, p0, La/mm30;->Z1:La/lm30;

    .line 67
    .line 68
    iget-wide v2, p0, La/lm30;->h:J

    .line 69
    .line 70
    cmp-long p0, v2, v4

    .line 71
    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    :goto_2
    return v1

    .line 76
    :cond_5
    :goto_3
    return v7
.end method

.method public final z(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, La/xm30;->B2:La/pfu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0, p1, p2, p3, p4}, La/pfu0;->t(JJ)V
    :try_end_0
    .catch La/ofu0; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    const/16 p2, 0x1b59

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    iget-object p4, p1, La/ofu0;->a:Landroidx/media3/common/b;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p4, p3, p2}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    throw p0

    .line 20
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, La/mm30;->z(JJ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final z0(La/jm30;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/xm30;->L0(La/jm30;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
