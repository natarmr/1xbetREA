.class public final La/y3c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mn30;
.implements La/huo;
.implements La/iq00;
.implements La/lq00;
.implements La/gxg0;


# static fields
.field public static final u1:Ljava/util/Map;

.field public static final v1:Landroidx/media3/common/b;


# instance fields
.field public A:La/z220;

.field public B:La/fvh0;

.field public Y:J

.field public Z:Z

.field public final a:Landroid/net/Uri;

.field public final b:La/jbj;

.field public final c:La/cil;

.field public final d:La/x860;

.field public final e:La/zhl;

.field public final f:La/zhl;

.field public f1:I

.field public final g:La/b4c0;

.field public final g1:J

.field public final h:La/lhf0;

.field public h1:Z

.field public final i:J

.field public i1:Z

.field public final j:Landroidx/media3/common/b;

.field public j1:Z

.field public final k:J

.field public k1:Z

.field public final l:La/lhf0;

.field public l1:I

.field public final m:La/oif0;

.field public final m1:Ljava/util/ArrayList;

.field public final n:La/brd;

.field public n1:Z

.field public final o:La/s3c0;

.field public o1:J

.field public final p:La/s3c0;

.field public p1:J

.field public final q:Landroid/os/Handler;

.field public q1:Z

.field public r:La/ln30;

.field public r1:I

.field public s:La/axw;

.field public s1:Z

.field public t:[La/u3c0;

.field public t1:Z

.field public u:[La/hxg0;

.field public v:[La/x3c0;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/y3c0;->u1:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, La/awq;

    .line 20
    .line 21
    invoke-direct {v0}, La/awq;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, La/awq;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    invoke-static {v1}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, La/awq;->o:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v1, Landroidx/media3/common/b;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, La/y3c0;->v1:Landroidx/media3/common/b;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;La/jbj;La/oif0;La/cil;La/zhl;La/x860;La/zhl;La/b4c0;La/lhf0;Landroidx/media3/common/b;JLa/gff0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y3c0;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, La/y3c0;->b:La/jbj;

    .line 7
    .line 8
    iput-object p4, p0, La/y3c0;->c:La/cil;

    .line 9
    .line 10
    iput-object p5, p0, La/y3c0;->f:La/zhl;

    .line 11
    .line 12
    iput-object p6, p0, La/y3c0;->d:La/x860;

    .line 13
    .line 14
    iput-object p7, p0, La/y3c0;->e:La/zhl;

    .line 15
    .line 16
    iput-object p8, p0, La/y3c0;->g:La/b4c0;

    .line 17
    .line 18
    iput-object p9, p0, La/y3c0;->h:La/lhf0;

    .line 19
    .line 20
    const-wide/32 p1, 0x100000

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, La/y3c0;->i:J

    .line 24
    .line 25
    iput-object p10, p0, La/y3c0;->j:Landroidx/media3/common/b;

    .line 26
    .line 27
    const-wide/high16 p1, -0x8000000000000000L

    .line 28
    .line 29
    iput-wide p1, p0, La/y3c0;->g1:J

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    if-eqz p13, :cond_0

    .line 33
    .line 34
    new-instance p2, La/lhf0;

    .line 35
    .line 36
    invoke-direct {p2, p13}, La/lhf0;-><init>(La/gff0;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p2, La/lhf0;

    .line 41
    .line 42
    const-string p4, "ProgressiveMediaPeriod"

    .line 43
    .line 44
    invoke-direct {p2, p4, p1}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iput-object p2, p0, La/y3c0;->l:La/lhf0;

    .line 48
    .line 49
    iput-object p3, p0, La/y3c0;->m:La/oif0;

    .line 50
    .line 51
    iput-wide p11, p0, La/y3c0;->k:J

    .line 52
    .line 53
    new-instance p2, La/brd;

    .line 54
    .line 55
    invoke-direct {p2}, La/brd;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, La/y3c0;->n:La/brd;

    .line 59
    .line 60
    new-instance p2, La/s3c0;

    .line 61
    .line 62
    invoke-direct {p2, p0, p1}, La/s3c0;-><init>(La/y3c0;B)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, La/y3c0;->o:La/s3c0;

    .line 66
    .line 67
    new-instance p2, La/s3c0;

    .line 68
    .line 69
    const/4 p3, 0x2

    .line 70
    invoke-direct {p2, p0, p3}, La/s3c0;-><init>(La/y3c0;B)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, La/y3c0;->p:La/s3c0;

    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    invoke-static {p2}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, p0, La/y3c0;->q:Landroid/os/Handler;

    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    new-array p3, p2, [La/x3c0;

    .line 84
    .line 85
    iput-object p3, p0, La/y3c0;->v:[La/x3c0;

    .line 86
    .line 87
    new-array p3, p2, [La/hxg0;

    .line 88
    .line 89
    iput-object p3, p0, La/y3c0;->u:[La/hxg0;

    .line 90
    .line 91
    new-array p2, p2, [La/u3c0;

    .line 92
    .line 93
    iput-object p2, p0, La/y3c0;->t:[La/u3c0;

    .line 94
    .line 95
    new-instance p2, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, La/y3c0;->m1:Ljava/util/ArrayList;

    .line 101
    .line 102
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    iput-wide p2, p0, La/y3c0;->p1:J

    .line 108
    .line 109
    iput p1, p0, La/y3c0;->f1:I

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La/y3c0;->p1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final B()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, La/y3c0;->k:J

    .line 4
    .line 5
    iget-boolean v3, v0, La/y3c0;->t1:Z

    .line 6
    .line 7
    if-nez v3, :cond_17

    .line 8
    .line 9
    iget-boolean v3, v0, La/y3c0;->x:Z

    .line 10
    .line 11
    if-nez v3, :cond_17

    .line 12
    .line 13
    iget-boolean v3, v0, La/y3c0;->w:Z

    .line 14
    .line 15
    if-eqz v3, :cond_17

    .line 16
    .line 17
    iget-object v3, v0, La/y3c0;->B:La/fvh0;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    iget-object v3, v0, La/y3c0;->u:[La/hxg0;

    .line 24
    .line 25
    array-length v4, v3

    .line 26
    const/4 v5, 0x0

    .line 27
    move v6, v5

    .line 28
    :goto_0
    if-ge v6, v4, :cond_2

    .line 29
    .line 30
    aget-object v7, v3, v6

    .line 31
    .line 32
    invoke-virtual {v7}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    if-nez v7, :cond_1

    .line 37
    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v3, v0, La/y3c0;->n:La/brd;

    .line 44
    .line 45
    monitor-enter v3

    .line 46
    :try_start_0
    iput-boolean v5, v3, La/brd;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    monitor-exit v3

    .line 49
    iget-object v3, v0, La/y3c0;->u:[La/hxg0;

    .line 50
    .line 51
    array-length v3, v3

    .line 52
    const/4 v4, -0x1

    .line 53
    move v7, v4

    .line 54
    move v6, v5

    .line 55
    move v8, v6

    .line 56
    :goto_1
    const/4 v9, 0x1

    .line 57
    if-ge v6, v3, :cond_c

    .line 58
    .line 59
    iget-object v10, v0, La/y3c0;->u:[La/hxg0;

    .line 60
    .line 61
    aget-object v10, v10, v6

    .line 62
    .line 63
    invoke-virtual {v10}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v10, v10, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v10}, La/mg40;->h(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    const/4 v11, 0x2

    .line 77
    const/4 v12, 0x3

    .line 78
    const/4 v13, 0x4

    .line 79
    if-eq v10, v9, :cond_6

    .line 80
    .line 81
    if-eq v10, v11, :cond_5

    .line 82
    .line 83
    if-eq v10, v12, :cond_4

    .line 84
    .line 85
    if-eq v10, v13, :cond_3

    .line 86
    .line 87
    move v14, v5

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v14, v11

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move v14, v9

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move v14, v13

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    move v14, v12

    .line 96
    :goto_2
    if-eq v7, v9, :cond_9

    .line 97
    .line 98
    if-eq v7, v11, :cond_8

    .line 99
    .line 100
    if-eq v7, v12, :cond_a

    .line 101
    .line 102
    if-eq v7, v13, :cond_7

    .line 103
    .line 104
    move v9, v5

    .line 105
    goto :goto_3

    .line 106
    :cond_7
    move v9, v11

    .line 107
    goto :goto_3

    .line 108
    :cond_8
    move v9, v13

    .line 109
    goto :goto_3

    .line 110
    :cond_9
    move v9, v12

    .line 111
    :cond_a
    :goto_3
    if-le v14, v9, :cond_b

    .line 112
    .line 113
    move v8, v6

    .line 114
    move v7, v10

    .line 115
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_c
    new-array v6, v3, [La/ccs0;

    .line 119
    .line 120
    new-array v7, v3, [Z

    .line 121
    .line 122
    move v10, v5

    .line 123
    :goto_4
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    if-ge v10, v3, :cond_15

    .line 129
    .line 130
    iget-object v13, v0, La/y3c0;->u:[La/hxg0;

    .line 131
    .line 132
    aget-object v13, v13, v10

    .line 133
    .line 134
    invoke-virtual {v13}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v14, v13, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v14}, La/mg40;->i(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-nez v15, :cond_e

    .line 148
    .line 149
    invoke-static {v14}, La/mg40;->m(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    if-eqz v16, :cond_d

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_d
    move/from16 v16, v5

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_e
    :goto_5
    move/from16 v16, v9

    .line 160
    .line 161
    :goto_6
    aput-boolean v16, v7, v10

    .line 162
    .line 163
    move/from16 v17, v5

    .line 164
    .line 165
    iget-boolean v5, v0, La/y3c0;->y:Z

    .line 166
    .line 167
    or-int v5, v5, v16

    .line 168
    .line 169
    iput-boolean v5, v0, La/y3c0;->y:Z

    .line 170
    .line 171
    invoke-static {v14}, La/mg40;->k(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    cmp-long v11, v1, v11

    .line 176
    .line 177
    if-eqz v11, :cond_f

    .line 178
    .line 179
    if-ne v3, v9, :cond_f

    .line 180
    .line 181
    if-eqz v5, :cond_f

    .line 182
    .line 183
    move v5, v9

    .line 184
    goto :goto_7

    .line 185
    :cond_f
    move/from16 v5, v17

    .line 186
    .line 187
    :goto_7
    iput-boolean v5, v0, La/y3c0;->z:Z

    .line 188
    .line 189
    iget-object v5, v0, La/y3c0;->s:La/axw;

    .line 190
    .line 191
    if-eqz v5, :cond_13

    .line 192
    .line 193
    iget v11, v5, La/axw;->a:I

    .line 194
    .line 195
    if-nez v15, :cond_10

    .line 196
    .line 197
    iget-object v12, v0, La/y3c0;->v:[La/x3c0;

    .line 198
    .line 199
    aget-object v12, v12, v10

    .line 200
    .line 201
    iget-boolean v12, v12, La/x3c0;->b:Z

    .line 202
    .line 203
    if-eqz v12, :cond_12

    .line 204
    .line 205
    :cond_10
    iget-object v12, v13, Landroidx/media3/common/b;->m:La/ed40;

    .line 206
    .line 207
    if-nez v12, :cond_11

    .line 208
    .line 209
    new-instance v12, La/ed40;

    .line 210
    .line 211
    new-array v14, v9, [La/cd40;

    .line 212
    .line 213
    aput-object v5, v14, v17

    .line 214
    .line 215
    invoke-direct {v12, v14}, La/ed40;-><init>([La/cd40;)V

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_11
    new-array v14, v9, [La/cd40;

    .line 220
    .line 221
    aput-object v5, v14, v17

    .line 222
    .line 223
    invoke-virtual {v12, v14}, La/ed40;->a([La/cd40;)La/ed40;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    :goto_8
    invoke-virtual {v13}, Landroidx/media3/common/b;->a()La/awq;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    iput-object v12, v5, La/awq;->l:La/ed40;

    .line 232
    .line 233
    new-instance v13, Landroidx/media3/common/b;

    .line 234
    .line 235
    invoke-direct {v13, v5}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 236
    .line 237
    .line 238
    :cond_12
    if-eqz v15, :cond_13

    .line 239
    .line 240
    iget v5, v13, Landroidx/media3/common/b;->i:I

    .line 241
    .line 242
    if-ne v5, v4, :cond_13

    .line 243
    .line 244
    iget v5, v13, Landroidx/media3/common/b;->j:I

    .line 245
    .line 246
    if-ne v5, v4, :cond_13

    .line 247
    .line 248
    if-eq v11, v4, :cond_13

    .line 249
    .line 250
    invoke-virtual {v13}, Landroidx/media3/common/b;->a()La/awq;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    iput v11, v5, La/awq;->i:I

    .line 255
    .line 256
    new-instance v13, Landroidx/media3/common/b;

    .line 257
    .line 258
    invoke-direct {v13, v5}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 259
    .line 260
    .line 261
    :cond_13
    iget-object v5, v0, La/y3c0;->c:La/cil;

    .line 262
    .line 263
    invoke-interface {v5, v13}, La/cil;->d(Landroidx/media3/common/b;)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    invoke-virtual {v13}, Landroidx/media3/common/b;->a()La/awq;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    iput v5, v11, La/awq;->S:I

    .line 272
    .line 273
    new-instance v5, Landroidx/media3/common/b;

    .line 274
    .line 275
    invoke-direct {v5, v11}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 276
    .line 277
    .line 278
    if-eq v10, v8, :cond_14

    .line 279
    .line 280
    invoke-virtual {v5}, Landroidx/media3/common/b;->a()La/awq;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    iput-object v11, v5, La/awq;->m:Ljava/lang/String;

    .line 289
    .line 290
    new-instance v11, Landroidx/media3/common/b;

    .line 291
    .line 292
    invoke-direct {v11, v5}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 293
    .line 294
    .line 295
    move-object v5, v11

    .line 296
    :cond_14
    new-instance v11, La/ccs0;

    .line 297
    .line 298
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    filled-new-array {v5}, [Landroidx/media3/common/b;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-direct {v11, v12, v5}, La/ccs0;-><init>(Ljava/lang/String;[Landroidx/media3/common/b;)V

    .line 307
    .line 308
    .line 309
    aput-object v11, v6, v10

    .line 310
    .line 311
    iget-object v5, v0, La/y3c0;->u:[La/hxg0;

    .line 312
    .line 313
    aget-object v5, v5, v10

    .line 314
    .line 315
    iget-wide v11, v0, La/y3c0;->g1:J

    .line 316
    .line 317
    invoke-virtual {v5, v11, v12}, La/hxg0;->A(J)V

    .line 318
    .line 319
    .line 320
    add-int/lit8 v10, v10, 0x1

    .line 321
    .line 322
    move/from16 v5, v17

    .line 323
    .line 324
    goto/16 :goto_4

    .line 325
    .line 326
    :cond_15
    new-instance v3, La/z220;

    .line 327
    .line 328
    new-instance v4, La/dcs0;

    .line 329
    .line 330
    invoke-direct {v4, v6}, La/dcs0;-><init>([La/ccs0;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v3, v4, v7}, La/z220;-><init>(La/dcs0;[Z)V

    .line 334
    .line 335
    .line 336
    iput-object v3, v0, La/y3c0;->A:La/z220;

    .line 337
    .line 338
    iget-boolean v3, v0, La/y3c0;->z:Z

    .line 339
    .line 340
    if-eqz v3, :cond_16

    .line 341
    .line 342
    iget-wide v3, v0, La/y3c0;->Y:J

    .line 343
    .line 344
    cmp-long v3, v3, v11

    .line 345
    .line 346
    if-nez v3, :cond_16

    .line 347
    .line 348
    iput-wide v1, v0, La/y3c0;->Y:J

    .line 349
    .line 350
    new-instance v1, La/t3c0;

    .line 351
    .line 352
    iget-object v2, v0, La/y3c0;->B:La/fvh0;

    .line 353
    .line 354
    invoke-direct {v1, v0, v2}, La/t3c0;-><init>(La/y3c0;La/fvh0;)V

    .line 355
    .line 356
    .line 357
    iput-object v1, v0, La/y3c0;->B:La/fvh0;

    .line 358
    .line 359
    :cond_16
    iget-object v1, v0, La/y3c0;->g:La/b4c0;

    .line 360
    .line 361
    iget-wide v2, v0, La/y3c0;->Y:J

    .line 362
    .line 363
    iget-object v4, v0, La/y3c0;->B:La/fvh0;

    .line 364
    .line 365
    iget-boolean v5, v0, La/y3c0;->Z:Z

    .line 366
    .line 367
    invoke-virtual {v1, v2, v3, v4, v5}, La/b4c0;->t(JLa/fvh0;Z)V

    .line 368
    .line 369
    .line 370
    iput-boolean v9, v0, La/y3c0;->x:Z

    .line 371
    .line 372
    iget-object v1, v0, La/y3c0;->r:La/ln30;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-interface {v1, v0}, La/ln30;->f(La/mn30;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :catchall_0
    move-exception v0

    .line 382
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    throw v0

    .line 384
    :cond_17
    :goto_9
    return-void
.end method

.method public final C(I)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/y3c0;->A:La/z220;

    .line 5
    .line 6
    iget-object v1, v0, La/z220;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, [Z

    .line 9
    .line 10
    aget-boolean v2, v1, p1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, La/z220;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/dcs0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, La/dcs0;->a(I)La/ccs0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v0, v0, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 24
    .line 25
    aget-object v6, v0, v2

    .line 26
    .line 27
    iget-object v0, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, La/mg40;->h(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iget-wide v2, p0, La/y3c0;->o1:J

    .line 34
    .line 35
    move-wide v7, v2

    .line 36
    new-instance v3, La/in30;

    .line 37
    .line 38
    invoke-static {v7, v8}, La/vtt0;->Y(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v9

    .line 42
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-direct/range {v3 .. v12}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 51
    .line 52
    .line 53
    new-instance v0, La/uq;

    .line 54
    .line 55
    const/16 v2, 0x14

    .line 56
    .line 57
    iget-object p0, p0, La/y3c0;->e:La/zhl;

    .line 58
    .line 59
    invoke-direct {v0, p0, v3, v2}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/zhl;->a(La/rbe;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    aput-boolean p0, v1, p1

    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method public final D(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/y3c0;->q1:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, La/y3c0;->y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La/y3c0;->A:La/z220;

    .line 13
    .line 14
    iget-object v0, v0, La/z220;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, [Z

    .line 17
    .line 18
    aget-boolean v0, v0, p1

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, La/y3c0;->u:[La/hxg0;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, La/hxg0;->s(Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, La/y3c0;->p1:J

    .line 37
    .line 38
    iput-boolean v0, p0, La/y3c0;->q1:Z

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, La/y3c0;->i1:Z

    .line 42
    .line 43
    iput-wide v1, p0, La/y3c0;->o1:J

    .line 44
    .line 45
    iput v0, p0, La/y3c0;->r1:I

    .line 46
    .line 47
    iget-object p1, p0, La/y3c0;->u:[La/hxg0;

    .line 48
    .line 49
    array-length v1, p1

    .line 50
    move v2, v0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_2

    .line 52
    .line 53
    aget-object v3, p1, v2

    .line 54
    .line 55
    invoke-virtual {v3, v0}, La/hxg0;->x(Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object p1, p0, La/y3c0;->r:La/ln30;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, La/ggi0;->a(La/hgi0;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
.end method

.method public final E(La/x3c0;)La/ncs0;
    .locals 5

    .line 1
    iget-object v0, p0, La/y3c0;->u:[La/hxg0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, La/y3c0;->v:[La/x3c0;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, La/x3c0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/y3c0;->u:[La/hxg0;

    .line 18
    .line 19
    aget-object p0, p0, v1

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, La/y3c0;->w:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, "Extractor added new track (id="

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p1, p1, La/x3c0;->a:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ") after finishing tracks."

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "ProgressiveMediaPeriod"

    .line 51
    .line 52
    invoke-static {p1, p0}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/pnk;

    .line 56
    .line 57
    invoke-direct {p0}, La/pnk;-><init>()V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    new-instance v1, La/hxg0;

    .line 62
    .line 63
    iget-object v2, p0, La/y3c0;->h:La/lhf0;

    .line 64
    .line 65
    iget-object v3, p0, La/y3c0;->c:La/cil;

    .line 66
    .line 67
    iget-object v4, p0, La/y3c0;->f:La/zhl;

    .line 68
    .line 69
    invoke-direct {v1, v2, v3, v4}, La/hxg0;-><init>(La/lhf0;La/cil;La/zhl;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/u3c0;

    .line 73
    .line 74
    invoke-direct {v2, v1}, La/u3c0;-><init>(La/hxg0;)V

    .line 75
    .line 76
    .line 77
    iput-object p0, v1, La/hxg0;->f:La/gxg0;

    .line 78
    .line 79
    iget-object v3, p0, La/y3c0;->v:[La/x3c0;

    .line 80
    .line 81
    add-int/lit8 v4, v0, 0x1

    .line 82
    .line 83
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, [La/x3c0;

    .line 88
    .line 89
    aput-object p1, v3, v0

    .line 90
    .line 91
    sget-object p1, La/vtt0;->a:Ljava/lang/String;

    .line 92
    .line 93
    iput-object v3, p0, La/y3c0;->v:[La/x3c0;

    .line 94
    .line 95
    iget-object p1, p0, La/y3c0;->u:[La/hxg0;

    .line 96
    .line 97
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, [La/hxg0;

    .line 102
    .line 103
    aput-object v1, p1, v0

    .line 104
    .line 105
    iput-object p1, p0, La/y3c0;->u:[La/hxg0;

    .line 106
    .line 107
    iget-object p1, p0, La/y3c0;->t:[La/u3c0;

    .line 108
    .line 109
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, [La/u3c0;

    .line 114
    .line 115
    aput-object v2, p1, v0

    .line 116
    .line 117
    iput-object p1, p0, La/y3c0;->t:[La/u3c0;

    .line 118
    .line 119
    return-object v2
.end method

.method public final F(La/fvh0;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/y3c0;->s:La/axw;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, La/ca5;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/ca5;-><init>(J)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, La/y3c0;->B:La/fvh0;

    .line 18
    .line 19
    invoke-interface {p1}, La/fvh0;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, La/y3c0;->Y:J

    .line 24
    .line 25
    iget-boolean v0, p0, La/y3c0;->n1:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, La/fvh0;->g()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v0, v4, v1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    iput-boolean v0, p0, La/y3c0;->Z:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x7

    .line 46
    :cond_2
    iput v3, p0, La/y3c0;->f1:I

    .line 47
    .line 48
    iget-boolean v1, p0, La/y3c0;->x:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, La/y3c0;->g:La/b4c0;

    .line 53
    .line 54
    iget-wide v2, p0, La/y3c0;->Y:J

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3, p1, v0}, La/b4c0;->t(JLa/fvh0;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-virtual {p0}, La/y3c0;->B()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final G()V
    .locals 9

    .line 1
    new-instance v0, La/v3c0;

    .line 2
    .line 3
    iget-object v4, p0, La/y3c0;->m:La/oif0;

    .line 4
    .line 5
    iget-object v6, p0, La/y3c0;->n:La/brd;

    .line 6
    .line 7
    iget-object v2, p0, La/y3c0;->a:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v3, p0, La/y3c0;->b:La/jbj;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v0 .. v6}, La/v3c0;-><init>(La/y3c0;Landroid/net/Uri;La/jbj;La/oif0;La/y3c0;La/brd;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p0, v1, La/y3c0;->x:Z

    .line 17
    .line 18
    if-eqz p0, :cond_3

    .line 19
    .line 20
    invoke-virtual {v1}, La/y3c0;->A()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, La/x0x;->K(Z)V

    .line 25
    .line 26
    .line 27
    const-wide/high16 v2, -0x8000000000000000L

    .line 28
    .line 29
    iget-wide v4, v1, La/y3c0;->g1:J

    .line 30
    .line 31
    cmp-long p0, v4, v2

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide v4, v1, La/y3c0;->Y:J

    .line 37
    .line 38
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long p0, v4, v2

    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-wide v7, v1, La/y3c0;->p1:J

    .line 49
    .line 50
    cmp-long p0, v7, v4

    .line 51
    .line 52
    if-lez p0, :cond_1

    .line 53
    .line 54
    iput-boolean v6, v1, La/y3c0;->s1:Z

    .line 55
    .line 56
    iput-wide v2, v1, La/y3c0;->p1:J

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget-object p0, v1, La/y3c0;->B:La/fvh0;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-wide v4, v1, La/y3c0;->p1:J

    .line 65
    .line 66
    invoke-interface {p0, v4, v5}, La/fvh0;->b(J)La/evh0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget-object p0, p0, La/evh0;->a:La/hvh0;

    .line 71
    .line 72
    iget-wide v4, p0, La/hvh0;->b:J

    .line 73
    .line 74
    iget-wide v7, v1, La/y3c0;->p1:J

    .line 75
    .line 76
    iget-object p0, v0, La/v3c0;->g:La/mtc;

    .line 77
    .line 78
    iput-wide v4, p0, La/mtc;->a:J

    .line 79
    .line 80
    iput-wide v7, v0, La/v3c0;->j:J

    .line 81
    .line 82
    iput-boolean v6, v0, La/v3c0;->i:Z

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    iput-boolean p0, v0, La/v3c0;->m:Z

    .line 86
    .line 87
    iget-object v4, v1, La/y3c0;->u:[La/hxg0;

    .line 88
    .line 89
    array-length v5, v4

    .line 90
    :goto_1
    if-ge p0, v5, :cond_2

    .line 91
    .line 92
    aget-object v6, v4, p0

    .line 93
    .line 94
    iget-wide v7, v1, La/y3c0;->p1:J

    .line 95
    .line 96
    iput-wide v7, v6, La/hxg0;->t:J

    .line 97
    .line 98
    add-int/lit8 p0, p0, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    iput-wide v2, v1, La/y3c0;->p1:J

    .line 102
    .line 103
    :cond_3
    invoke-virtual {v1}, La/y3c0;->y()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    iput p0, v1, La/y3c0;->r1:I

    .line 108
    .line 109
    iget-object p0, v1, La/y3c0;->d:La/x860;

    .line 110
    .line 111
    iget v2, v1, La/y3c0;->f1:I

    .line 112
    .line 113
    invoke-virtual {p0, v2}, La/x860;->e(I)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    iget-object v2, v1, La/y3c0;->l:La/lhf0;

    .line 118
    .line 119
    invoke-virtual {v2, v0, v1, p0}, La/lhf0;->J(La/kq00;La/iq00;I)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/y3c0;->i1:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/y3c0;->A()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public final a(La/kq00;JJI)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/v3c0;

    .line 6
    .line 7
    iget-object v2, v1, La/v3c0;->c:La/enm0;

    .line 8
    .line 9
    new-instance v3, La/vn00;

    .line 10
    .line 11
    iget-wide v4, v1, La/v3c0;->a:J

    .line 12
    .line 13
    iget-object v6, v1, La/v3c0;->k:La/mbj;

    .line 14
    .line 15
    move-wide/from16 v7, p2

    .line 16
    .line 17
    invoke-direct/range {v3 .. v8}, La/vn00;-><init>(JLa/mbj;J)V

    .line 18
    .line 19
    .line 20
    if-eqz p6, :cond_0

    .line 21
    .line 22
    iget-object v4, v2, La/enm0;->c:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v4, v3, La/vn00;->f:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v4, v2, La/enm0;->d:Ljava/util/Map;

    .line 27
    .line 28
    iput-object v4, v3, La/vn00;->g:Ljava/lang/Object;

    .line 29
    .line 30
    move-wide/from16 v4, p4

    .line 31
    .line 32
    iput-wide v4, v3, La/vn00;->c:J

    .line 33
    .line 34
    iget-wide v4, v2, La/enm0;->b:J

    .line 35
    .line 36
    iput-wide v4, v3, La/vn00;->d:J

    .line 37
    .line 38
    :cond_0
    new-instance v7, La/wn00;

    .line 39
    .line 40
    invoke-direct {v7, v3}, La/wn00;-><init>(La/vn00;)V

    .line 41
    .line 42
    .line 43
    iget-wide v13, v1, La/v3c0;->j:J

    .line 44
    .line 45
    iget-wide v1, v0, La/y3c0;->Y:J

    .line 46
    .line 47
    iget-object v6, v0, La/y3c0;->e:La/zhl;

    .line 48
    .line 49
    const/4 v8, 0x1

    .line 50
    const/4 v9, -0x1

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    move/from16 v17, p6

    .line 55
    .line 56
    move-wide v15, v1

    .line 57
    invoke-virtual/range {v6 .. v17}, La/zhl;->f(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJI)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final b()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/y3c0;->s()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final c(JLa/gvh0;)J
    .locals 8

    .line 1
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/y3c0;->B:La/fvh0;

    .line 5
    .line 6
    invoke-interface {v0}, La/fvh0;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 p0, 0x0

    .line 13
    .line 14
    return-wide p0

    .line 15
    :cond_0
    iget-object p0, p0, La/y3c0;->B:La/fvh0;

    .line 16
    .line 17
    invoke-interface {p0, p1, p2}, La/fvh0;->b(J)La/evh0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v0, p0, La/evh0;->a:La/hvh0;

    .line 22
    .line 23
    iget-wide v4, v0, La/hvh0;->a:J

    .line 24
    .line 25
    iget-object p0, p0, La/evh0;->b:La/hvh0;

    .line 26
    .line 27
    iget-wide v6, p0, La/hvh0;->a:J

    .line 28
    .line 29
    move-wide v2, p1

    .line 30
    move-object v1, p3

    .line 31
    invoke-virtual/range {v1 .. v7}, La/gvh0;->a(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    return-wide p0
.end method

.method public final d(J)J
    .locals 12

    .line 1
    iget-object v0, p0, La/y3c0;->m1:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/t340;

    .line 20
    .line 21
    iget-object v4, v1, La/t340;->e:Landroid/util/LongSparseArray;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/util/LongSparseArray;->clear()V

    .line 24
    .line 25
    .line 26
    iput-object v2, v1, La/t340;->g:[B

    .line 27
    .line 28
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v4, v1, La/t340;->h:J

    .line 34
    .line 35
    iput-boolean v3, v1, La/t340;->i:Z

    .line 36
    .line 37
    iput-boolean v3, v1, La/t340;->j:Z

    .line 38
    .line 39
    iget-object v1, v1, La/t340;->d:La/wkj;

    .line 40
    .line 41
    invoke-virtual {v1}, La/wkj;->v()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/y3c0;->A:La/z220;

    .line 49
    .line 50
    iget-object v0, v0, La/z220;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, [Z

    .line 53
    .line 54
    iget-object v1, p0, La/y3c0;->B:La/fvh0;

    .line 55
    .line 56
    invoke-interface {v1}, La/fvh0;->d()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-wide/16 p1, 0x0

    .line 64
    .line 65
    :goto_1
    iput-boolean v3, p0, La/y3c0;->i1:Z

    .line 66
    .line 67
    iget-wide v4, p0, La/y3c0;->o1:J

    .line 68
    .line 69
    cmp-long v1, v4, p1

    .line 70
    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v1, v3

    .line 76
    :goto_2
    iput-wide p1, p0, La/y3c0;->o1:J

    .line 77
    .line 78
    invoke-virtual {p0}, La/y3c0;->A()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    iput-wide p1, p0, La/y3c0;->p1:J

    .line 85
    .line 86
    return-wide p1

    .line 87
    :cond_3
    iget v4, p0, La/y3c0;->f1:I

    .line 88
    .line 89
    const/4 v5, 0x7

    .line 90
    if-eq v4, v5, :cond_a

    .line 91
    .line 92
    iget-boolean v4, p0, La/y3c0;->s1:Z

    .line 93
    .line 94
    if-nez v4, :cond_4

    .line 95
    .line 96
    iget-object v4, p0, La/y3c0;->l:La/lhf0;

    .line 97
    .line 98
    invoke-virtual {v4}, La/lhf0;->C()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_a

    .line 103
    .line 104
    :cond_4
    iget-object v4, p0, La/y3c0;->u:[La/hxg0;

    .line 105
    .line 106
    array-length v4, v4

    .line 107
    move v5, v3

    .line 108
    :goto_3
    if-ge v5, v4, :cond_d

    .line 109
    .line 110
    iget-object v6, p0, La/y3c0;->u:[La/hxg0;

    .line 111
    .line 112
    aget-object v6, v6, v5

    .line 113
    .line 114
    iget-object v7, p0, La/y3c0;->t:[La/u3c0;

    .line 115
    .line 116
    aget-object v7, v7, v5

    .line 117
    .line 118
    iget-object v7, v7, La/u3c0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_5

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_5
    iget-boolean v7, p0, La/y3c0;->z:Z

    .line 128
    .line 129
    if-eqz v7, :cond_6

    .line 130
    .line 131
    iget v7, v6, La/hxg0;->q:I

    .line 132
    .line 133
    invoke-virtual {v6, v7}, La/hxg0;->y(I)Z

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    monitor-enter v6

    .line 138
    :try_start_0
    iget v7, v6, La/hxg0;->p:I

    .line 139
    .line 140
    const-wide/high16 v8, -0x8000000000000000L

    .line 141
    .line 142
    if-nez v7, :cond_7

    .line 143
    .line 144
    move-wide v10, v8

    .line 145
    goto :goto_4

    .line 146
    :cond_7
    iget-object v7, v6, La/hxg0;->n:[J

    .line 147
    .line 148
    iget v10, v6, La/hxg0;->r:I

    .line 149
    .line 150
    aget-wide v10, v7, v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    :goto_4
    monitor-exit v6

    .line 153
    cmp-long v7, v10, v8

    .line 154
    .line 155
    if-eqz v7, :cond_8

    .line 156
    .line 157
    cmp-long v7, p1, v10

    .line 158
    .line 159
    if-gtz v7, :cond_8

    .line 160
    .line 161
    iget v7, v6, La/hxg0;->q:I

    .line 162
    .line 163
    if-nez v7, :cond_8

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    invoke-virtual {v6, v7}, La/hxg0;->y(I)Z

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_8
    iget-boolean v7, p0, La/y3c0;->s1:Z

    .line 172
    .line 173
    invoke-virtual {v6, v7, p1, p2}, La/hxg0;->z(ZJ)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-nez v6, :cond_9

    .line 178
    .line 179
    aget-boolean v6, v0, v5

    .line 180
    .line 181
    if-nez v6, :cond_a

    .line 182
    .line 183
    iget-boolean v6, p0, La/y3c0;->y:Z

    .line 184
    .line 185
    if-nez v6, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_0
    move-exception p0

    .line 192
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    throw p0

    .line 194
    :cond_a
    :goto_6
    iput-boolean v3, p0, La/y3c0;->q1:Z

    .line 195
    .line 196
    iput-wide p1, p0, La/y3c0;->p1:J

    .line 197
    .line 198
    iput-boolean v3, p0, La/y3c0;->s1:Z

    .line 199
    .line 200
    iput-boolean v3, p0, La/y3c0;->j1:Z

    .line 201
    .line 202
    iget-object v0, p0, La/y3c0;->l:La/lhf0;

    .line 203
    .line 204
    invoke-virtual {v0}, La/lhf0;->C()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    iget-object v0, p0, La/y3c0;->u:[La/hxg0;

    .line 211
    .line 212
    array-length v1, v0

    .line 213
    :goto_7
    if-ge v3, v1, :cond_b

    .line 214
    .line 215
    aget-object v2, v0, v3

    .line 216
    .line 217
    invoke-virtual {v2}, La/hxg0;->j()V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v3, v3, 0x1

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_b
    iget-object p0, p0, La/y3c0;->l:La/lhf0;

    .line 224
    .line 225
    invoke-virtual {p0}, La/lhf0;->a()V

    .line 226
    .line 227
    .line 228
    return-wide p1

    .line 229
    :cond_c
    iget-object v0, p0, La/y3c0;->l:La/lhf0;

    .line 230
    .line 231
    iput-object v2, v0, La/lhf0;->d:Ljava/lang/Object;

    .line 232
    .line 233
    iget-object p0, p0, La/y3c0;->u:[La/hxg0;

    .line 234
    .line 235
    array-length v0, p0

    .line 236
    move v1, v3

    .line 237
    :goto_8
    if-ge v1, v0, :cond_d

    .line 238
    .line 239
    aget-object v2, p0, v1

    .line 240
    .line 241
    invoke-virtual {v2, v3}, La/hxg0;->x(Z)V

    .line 242
    .line 243
    .line 244
    add-int/lit8 v1, v1, 0x1

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_d
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/y3c0;->s1:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/y3c0;->l:La/lhf0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/lhf0;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/y3c0;->n:La/brd;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    iget-boolean v0, p0, La/brd;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final f(La/fvh0;)V
    .locals 2

    .line 1
    new-instance v0, La/oh60;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/y3c0;->q:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g(La/yq00;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, La/y3c0;->s1:Z

    .line 2
    .line 3
    if-nez p1, :cond_4

    .line 4
    .line 5
    iget-object p1, p0, La/y3c0;->l:La/lhf0;

    .line 6
    .line 7
    iget-object v0, p1, La/lhf0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/io/IOException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v0, p0, La/y3c0;->q1:Z

    .line 15
    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    iget-boolean v0, p0, La/y3c0;->x:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, La/y3c0;->j:Landroidx/media3/common/b;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :cond_1
    iget v0, p0, La/y3c0;->l1:I

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v0, p0, La/y3c0;->n:La/brd;

    .line 32
    .line 33
    invoke-virtual {v0}, La/brd;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, La/lhf0;->C()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, La/y3c0;->G()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    return v0

    .line 49
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method public final h()J
    .locals 3

    .line 1
    iget-boolean v0, p0, La/y3c0;->k1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, La/y3c0;->j1:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-boolean v1, p0, La/y3c0;->j1:Z

    .line 11
    .line 12
    iget-wide v0, p0, La/y3c0;->o1:J

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    iget-boolean v0, p0, La/y3c0;->i1:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, La/y3c0;->s1:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, La/y3c0;->y()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v2, p0, La/y3c0;->r1:I

    .line 28
    .line 29
    if-le v0, v2, :cond_2

    .line 30
    .line 31
    :cond_1
    iput-boolean v1, p0, La/y3c0;->i1:Z

    .line 32
    .line 33
    iget-wide v0, p0, La/y3c0;->o1:J

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    return-wide v0
.end method

.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, La/y3c0;->u:[La/hxg0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    invoke-virtual {v4, v5}, La/hxg0;->x(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, La/hxg0;->h:La/ivn;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v6, v4, La/hxg0;->e:La/zhl;

    .line 19
    .line 20
    invoke-virtual {v5, v6}, La/ivn;->m(La/zhl;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v4, La/hxg0;->h:La/ivn;

    .line 24
    .line 25
    iput-object v3, v4, La/hxg0;->g:Landroidx/media3/common/b;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p0, p0, La/y3c0;->m:La/oif0;

    .line 31
    .line 32
    iget-object v0, p0, La/oif0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/fuo;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, La/fuo;->release()V

    .line 39
    .line 40
    .line 41
    iput-object v3, p0, La/oif0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_2
    iput-object v3, p0, La/oif0;->d:Ljava/lang/Object;

    .line 44
    .line 45
    return-void
.end method

.method public final j([La/fmo;[Z[La/ixg0;[ZJ)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v3, p5

    .line 8
    .line 9
    invoke-virtual {v0}, La/y3c0;->x()V

    .line 10
    .line 11
    .line 12
    iget-object v5, v0, La/y3c0;->A:La/z220;

    .line 13
    .line 14
    iget-object v6, v5, La/z220;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v6, La/dcs0;

    .line 17
    .line 18
    iget-object v5, v5, La/z220;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, [Z

    .line 21
    .line 22
    iget v7, v0, La/y3c0;->l1:I

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    move v9, v8

    .line 26
    :goto_0
    array-length v10, v1

    .line 27
    const/4 v11, 0x1

    .line 28
    if-ge v9, v10, :cond_1

    .line 29
    .line 30
    aget-object v10, v1, v9

    .line 31
    .line 32
    if-eqz v10, :cond_0

    .line 33
    .line 34
    invoke-interface {v10}, La/fmo;->n()La/ccs0;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v6, v10}, La/dcs0;->b(La/ccs0;)I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    invoke-virtual {v6, v10}, La/dcs0;->a(I)La/ccs0;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    iget-object v10, v10, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 47
    .line 48
    aget-object v10, v10, v8

    .line 49
    .line 50
    iget-object v10, v10, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 51
    .line 52
    const-string v12, "application/x-itut-t35"

    .line 53
    .line 54
    invoke-static {v10, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_0

    .line 59
    .line 60
    move v9, v11

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v9, v8

    .line 66
    :goto_1
    move v10, v8

    .line 67
    :goto_2
    array-length v12, v1

    .line 68
    const/4 v13, 0x0

    .line 69
    iget-object v14, v0, La/y3c0;->m1:Ljava/util/ArrayList;

    .line 70
    .line 71
    if-ge v10, v12, :cond_5

    .line 72
    .line 73
    aget-object v12, v2, v10

    .line 74
    .line 75
    if-eqz v12, :cond_4

    .line 76
    .line 77
    aget-object v15, v1, v10

    .line 78
    .line 79
    if-eqz v15, :cond_2

    .line 80
    .line 81
    aget-boolean v15, p2, v10

    .line 82
    .line 83
    if-eqz v15, :cond_2

    .line 84
    .line 85
    if-eqz v9, :cond_4

    .line 86
    .line 87
    instance-of v15, v12, La/t340;

    .line 88
    .line 89
    if-eqz v15, :cond_4

    .line 90
    .line 91
    :cond_2
    instance-of v15, v12, La/t340;

    .line 92
    .line 93
    if-eqz v15, :cond_3

    .line 94
    .line 95
    check-cast v12, La/t340;

    .line 96
    .line 97
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iget-object v14, v12, La/t340;->a:La/w3c0;

    .line 101
    .line 102
    iget v14, v14, La/w3c0;->a:I

    .line 103
    .line 104
    aget-boolean v15, v5, v14

    .line 105
    .line 106
    invoke-static {v15}, La/x0x;->K(Z)V

    .line 107
    .line 108
    .line 109
    iget v15, v0, La/y3c0;->l1:I

    .line 110
    .line 111
    sub-int/2addr v15, v11

    .line 112
    iput v15, v0, La/y3c0;->l1:I

    .line 113
    .line 114
    aput-boolean v8, v5, v14

    .line 115
    .line 116
    iget-object v12, v12, La/t340;->b:La/w3c0;

    .line 117
    .line 118
    iget v12, v12, La/w3c0;->a:I

    .line 119
    .line 120
    aget-boolean v14, v5, v12

    .line 121
    .line 122
    invoke-static {v14}, La/x0x;->K(Z)V

    .line 123
    .line 124
    .line 125
    iget v14, v0, La/y3c0;->l1:I

    .line 126
    .line 127
    sub-int/2addr v14, v11

    .line 128
    iput v14, v0, La/y3c0;->l1:I

    .line 129
    .line 130
    aput-boolean v8, v5, v12

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    check-cast v12, La/w3c0;

    .line 134
    .line 135
    iget v12, v12, La/w3c0;->a:I

    .line 136
    .line 137
    aget-boolean v14, v5, v12

    .line 138
    .line 139
    invoke-static {v14}, La/x0x;->K(Z)V

    .line 140
    .line 141
    .line 142
    iget v14, v0, La/y3c0;->l1:I

    .line 143
    .line 144
    sub-int/2addr v14, v11

    .line 145
    iput v14, v0, La/y3c0;->l1:I

    .line 146
    .line 147
    aput-boolean v8, v5, v12

    .line 148
    .line 149
    :goto_3
    aput-object v13, v2, v10

    .line 150
    .line 151
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    iget-boolean v10, v0, La/y3c0;->h1:Z

    .line 155
    .line 156
    if-eqz v10, :cond_7

    .line 157
    .line 158
    if-nez v7, :cond_6

    .line 159
    .line 160
    :goto_4
    move v7, v11

    .line 161
    goto :goto_5

    .line 162
    :cond_6
    move v7, v8

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    const-wide/16 v15, 0x0

    .line 165
    .line 166
    cmp-long v7, v3, v15

    .line 167
    .line 168
    if-eqz v7, :cond_6

    .line 169
    .line 170
    iget-boolean v7, v0, La/y3c0;->z:Z

    .line 171
    .line 172
    if-nez v7, :cond_6

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :goto_5
    move v10, v8

    .line 176
    move v12, v10

    .line 177
    :goto_6
    array-length v15, v1

    .line 178
    if-ge v10, v15, :cond_f

    .line 179
    .line 180
    aget-object v15, v2, v10

    .line 181
    .line 182
    if-nez v15, :cond_d

    .line 183
    .line 184
    aget-object v15, v1, v10

    .line 185
    .line 186
    if-eqz v15, :cond_d

    .line 187
    .line 188
    invoke-interface {v15}, La/fmo;->length()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-ne v13, v11, :cond_8

    .line 193
    .line 194
    move v13, v11

    .line 195
    goto :goto_7

    .line 196
    :cond_8
    move v13, v8

    .line 197
    :goto_7
    invoke-static {v13}, La/x0x;->K(Z)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v15, v8}, La/fmo;->g(I)I

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-nez v13, :cond_9

    .line 205
    .line 206
    move v13, v11

    .line 207
    goto :goto_8

    .line 208
    :cond_9
    move v13, v8

    .line 209
    :goto_8
    invoke-static {v13}, La/x0x;->K(Z)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v15}, La/fmo;->n()La/ccs0;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-virtual {v6, v13}, La/dcs0;->b(La/ccs0;)I

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    aget-boolean v17, v5, v13

    .line 221
    .line 222
    xor-int/lit8 v17, v17, 0x1

    .line 223
    .line 224
    invoke-static/range {v17 .. v17}, La/x0x;->K(Z)V

    .line 225
    .line 226
    .line 227
    move/from16 v17, v11

    .line 228
    .line 229
    iget v11, v0, La/y3c0;->l1:I

    .line 230
    .line 231
    add-int/lit8 v11, v11, 0x1

    .line 232
    .line 233
    iput v11, v0, La/y3c0;->l1:I

    .line 234
    .line 235
    aput-boolean v17, v5, v13

    .line 236
    .line 237
    invoke-interface {v15}, La/fmo;->r()Landroidx/media3/common/b;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    iget-boolean v11, v11, Landroidx/media3/common/b;->v:Z

    .line 242
    .line 243
    or-int/2addr v12, v11

    .line 244
    new-instance v11, La/w3c0;

    .line 245
    .line 246
    move/from16 v18, v8

    .line 247
    .line 248
    invoke-interface {v15}, La/fmo;->r()Landroidx/media3/common/b;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    iget-boolean v8, v8, Landroidx/media3/common/b;->v:Z

    .line 253
    .line 254
    invoke-direct {v11, v0, v13, v8}, La/w3c0;-><init>(La/y3c0;IZ)V

    .line 255
    .line 256
    .line 257
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 258
    .line 259
    const/16 v1, 0x25

    .line 260
    .line 261
    if-lt v8, v1, :cond_b

    .line 262
    .line 263
    if-nez v9, :cond_b

    .line 264
    .line 265
    invoke-interface {v15}, La/fmo;->r()Landroidx/media3/common/b;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget-object v1, v1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v1}, La/mg40;->m(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_b

    .line 276
    .line 277
    move/from16 v1, v18

    .line 278
    .line 279
    :goto_9
    iget v8, v6, La/dcs0;->a:I

    .line 280
    .line 281
    if-ge v1, v8, :cond_b

    .line 282
    .line 283
    invoke-virtual {v6, v1}, La/dcs0;->a(I)La/ccs0;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    iget-object v8, v8, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 288
    .line 289
    aget-object v8, v8, v18

    .line 290
    .line 291
    invoke-static {v8}, La/jyc;->e(Landroidx/media3/common/b;)Z

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    if-eqz v8, :cond_a

    .line 296
    .line 297
    aget-boolean v8, v5, v1

    .line 298
    .line 299
    xor-int/lit8 v8, v8, 0x1

    .line 300
    .line 301
    invoke-static {v8}, La/x0x;->K(Z)V

    .line 302
    .line 303
    .line 304
    iget v8, v0, La/y3c0;->l1:I

    .line 305
    .line 306
    add-int/lit8 v8, v8, 0x1

    .line 307
    .line 308
    iput v8, v0, La/y3c0;->l1:I

    .line 309
    .line 310
    aput-boolean v17, v5, v1

    .line 311
    .line 312
    new-instance v8, La/t340;

    .line 313
    .line 314
    move-object/from16 v19, v5

    .line 315
    .line 316
    new-instance v5, La/w3c0;

    .line 317
    .line 318
    move-object/from16 v20, v6

    .line 319
    .line 320
    move/from16 v6, v18

    .line 321
    .line 322
    invoke-direct {v5, v0, v1, v6}, La/w3c0;-><init>(La/y3c0;IZ)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v15}, La/fmo;->r()Landroidx/media3/common/b;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-direct {v8, v11, v5, v1}, La/t340;-><init>(La/w3c0;La/w3c0;Landroidx/media3/common/b;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-object v11, v8

    .line 336
    goto :goto_a

    .line 337
    :cond_a
    move-object/from16 v19, v5

    .line 338
    .line 339
    move-object/from16 v20, v6

    .line 340
    .line 341
    add-int/lit8 v1, v1, 0x1

    .line 342
    .line 343
    const/16 v18, 0x0

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_b
    move-object/from16 v19, v5

    .line 347
    .line 348
    move-object/from16 v20, v6

    .line 349
    .line 350
    :goto_a
    aput-object v11, v2, v10

    .line 351
    .line 352
    aput-boolean v17, p4, v10

    .line 353
    .line 354
    if-nez v7, :cond_e

    .line 355
    .line 356
    iget-object v1, v0, La/y3c0;->u:[La/hxg0;

    .line 357
    .line 358
    aget-object v1, v1, v13

    .line 359
    .line 360
    invoke-virtual {v1}, La/hxg0;->o()I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_c

    .line 365
    .line 366
    move/from16 v5, v17

    .line 367
    .line 368
    invoke-virtual {v1, v5, v3, v4}, La/hxg0;->z(ZJ)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-nez v1, :cond_c

    .line 373
    .line 374
    const/4 v1, 0x1

    .line 375
    goto :goto_b

    .line 376
    :cond_c
    const/4 v1, 0x0

    .line 377
    :goto_b
    move v7, v1

    .line 378
    goto :goto_c

    .line 379
    :cond_d
    move-object/from16 v19, v5

    .line 380
    .line 381
    move-object/from16 v20, v6

    .line 382
    .line 383
    :cond_e
    :goto_c
    add-int/lit8 v10, v10, 0x1

    .line 384
    .line 385
    move-object/from16 v1, p1

    .line 386
    .line 387
    move-object/from16 v5, v19

    .line 388
    .line 389
    move-object/from16 v6, v20

    .line 390
    .line 391
    const/4 v8, 0x0

    .line 392
    const/4 v11, 0x1

    .line 393
    const/4 v13, 0x0

    .line 394
    goto/16 :goto_6

    .line 395
    .line 396
    :cond_f
    iget-boolean v1, v0, La/y3c0;->j1:Z

    .line 397
    .line 398
    if-nez v1, :cond_10

    .line 399
    .line 400
    iget-boolean v1, v0, La/y3c0;->h1:Z

    .line 401
    .line 402
    if-nez v1, :cond_11

    .line 403
    .line 404
    :cond_10
    iput-boolean v12, v0, La/y3c0;->j1:Z

    .line 405
    .line 406
    :cond_11
    iget v1, v0, La/y3c0;->l1:I

    .line 407
    .line 408
    if-nez v1, :cond_14

    .line 409
    .line 410
    const/4 v6, 0x0

    .line 411
    iput-boolean v6, v0, La/y3c0;->q1:Z

    .line 412
    .line 413
    iput-boolean v6, v0, La/y3c0;->i1:Z

    .line 414
    .line 415
    iput-boolean v6, v0, La/y3c0;->j1:Z

    .line 416
    .line 417
    iget-object v1, v0, La/y3c0;->l:La/lhf0;

    .line 418
    .line 419
    invoke-virtual {v1}, La/lhf0;->C()Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-eqz v2, :cond_13

    .line 424
    .line 425
    iget-object v2, v0, La/y3c0;->u:[La/hxg0;

    .line 426
    .line 427
    array-length v5, v2

    .line 428
    const/4 v8, 0x0

    .line 429
    :goto_d
    if-ge v8, v5, :cond_12

    .line 430
    .line 431
    aget-object v6, v2, v8

    .line 432
    .line 433
    invoke-virtual {v6}, La/hxg0;->j()V

    .line 434
    .line 435
    .line 436
    add-int/lit8 v8, v8, 0x1

    .line 437
    .line 438
    goto :goto_d

    .line 439
    :cond_12
    invoke-virtual {v1}, La/lhf0;->a()V

    .line 440
    .line 441
    .line 442
    goto :goto_11

    .line 443
    :cond_13
    const/4 v6, 0x0

    .line 444
    iput-boolean v6, v0, La/y3c0;->s1:Z

    .line 445
    .line 446
    iget-object v1, v0, La/y3c0;->u:[La/hxg0;

    .line 447
    .line 448
    array-length v2, v1

    .line 449
    move v5, v6

    .line 450
    :goto_e
    if-ge v5, v2, :cond_16

    .line 451
    .line 452
    aget-object v7, v1, v5

    .line 453
    .line 454
    invoke-virtual {v7, v6}, La/hxg0;->x(Z)V

    .line 455
    .line 456
    .line 457
    add-int/lit8 v5, v5, 0x1

    .line 458
    .line 459
    const/4 v6, 0x0

    .line 460
    goto :goto_e

    .line 461
    :cond_14
    if-eqz v7, :cond_16

    .line 462
    .line 463
    invoke-virtual {v0, v3, v4}, La/y3c0;->d(J)J

    .line 464
    .line 465
    .line 466
    move-result-wide v3

    .line 467
    const/4 v6, 0x0

    .line 468
    :goto_f
    array-length v1, v2

    .line 469
    if-ge v6, v1, :cond_16

    .line 470
    .line 471
    aget-object v1, v2, v6

    .line 472
    .line 473
    if-eqz v1, :cond_15

    .line 474
    .line 475
    const/16 v17, 0x1

    .line 476
    .line 477
    aput-boolean v17, p4, v6

    .line 478
    .line 479
    instance-of v5, v1, La/t340;

    .line 480
    .line 481
    if-eqz v5, :cond_15

    .line 482
    .line 483
    check-cast v1, La/t340;

    .line 484
    .line 485
    iget-object v5, v1, La/t340;->e:Landroid/util/LongSparseArray;

    .line 486
    .line 487
    invoke-virtual {v5}, Landroid/util/LongSparseArray;->clear()V

    .line 488
    .line 489
    .line 490
    const/4 v5, 0x0

    .line 491
    iput-object v5, v1, La/t340;->g:[B

    .line 492
    .line 493
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    iput-wide v7, v1, La/t340;->h:J

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    iput-boolean v7, v1, La/t340;->i:Z

    .line 502
    .line 503
    iput-boolean v7, v1, La/t340;->j:Z

    .line 504
    .line 505
    iget-object v1, v1, La/t340;->d:La/wkj;

    .line 506
    .line 507
    invoke-virtual {v1}, La/wkj;->v()V

    .line 508
    .line 509
    .line 510
    goto :goto_10

    .line 511
    :cond_15
    const/4 v5, 0x0

    .line 512
    const/4 v7, 0x0

    .line 513
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 514
    .line 515
    goto :goto_f

    .line 516
    :cond_16
    :goto_11
    const/4 v5, 0x1

    .line 517
    iput-boolean v5, v0, La/y3c0;->h1:Z

    .line 518
    .line 519
    return-wide v3
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/y3c0;->k1:Z

    .line 3
    .line 4
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, La/y3c0;->d:La/x860;

    .line 2
    .line 3
    iget v1, p0, La/y3c0;->f1:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/x860;->e(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, La/y3c0;->l:La/lhf0;

    .line 10
    .line 11
    iget-object v2, v1, La/lhf0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/io/IOException;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-object v1, v1, La/lhf0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/jq00;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/high16 v2, -0x80000000

    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    iget v0, v1, La/jq00;->a:I

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, La/jq00;->e:Ljava/io/IOException;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget v1, v1, La/jq00;->f:I

    .line 34
    .line 35
    if-gt v1, v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    throw v2

    .line 39
    :cond_2
    :goto_0
    iget-boolean v0, p0, La/y3c0;->s1:Z

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-boolean p0, p0, La/y3c0;->x:Z

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string p0, "Loading finished before preparation is complete."

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {p0, v0}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_4
    :goto_1
    return-void

    .line 57
    :cond_5
    throw v2
.end method

.method public final m(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/y3c0;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/y3c0;->A()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object v0, p0, La/y3c0;->A:La/z220;

    .line 17
    .line 18
    iget-object v0, v0, La/z220;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, [Z

    .line 21
    .line 22
    iget-object v1, p0, La/y3c0;->u:[La/hxg0;

    .line 23
    .line 24
    array-length v1, v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    iget-object v3, p0, La/y3c0;->u:[La/hxg0;

    .line 29
    .line 30
    aget-object v3, v3, v2

    .line 31
    .line 32
    aget-boolean v4, v0, v2

    .line 33
    .line 34
    invoke-virtual {v3, v4, p1, p2}, La/hxg0;->i(ZJ)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void
.end method

.method public final n(La/kq00;JJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/v3c0;

    .line 6
    .line 7
    iget-object v2, v1, La/v3c0;->c:La/enm0;

    .line 8
    .line 9
    new-instance v3, La/vn00;

    .line 10
    .line 11
    iget-wide v4, v1, La/v3c0;->a:J

    .line 12
    .line 13
    iget-object v6, v1, La/v3c0;->k:La/mbj;

    .line 14
    .line 15
    move-wide/from16 v7, p2

    .line 16
    .line 17
    invoke-direct/range {v3 .. v8}, La/vn00;-><init>(JLa/mbj;J)V

    .line 18
    .line 19
    .line 20
    iget-object v4, v2, La/enm0;->c:Landroid/net/Uri;

    .line 21
    .line 22
    iput-object v4, v3, La/vn00;->f:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v4, v2, La/enm0;->d:Ljava/util/Map;

    .line 25
    .line 26
    iput-object v4, v3, La/vn00;->g:Ljava/lang/Object;

    .line 27
    .line 28
    move-wide/from16 v4, p4

    .line 29
    .line 30
    iput-wide v4, v3, La/vn00;->c:J

    .line 31
    .line 32
    iget-wide v4, v2, La/enm0;->b:J

    .line 33
    .line 34
    iput-wide v4, v3, La/vn00;->d:J

    .line 35
    .line 36
    new-instance v7, La/wn00;

    .line 37
    .line 38
    invoke-direct {v7, v3}, La/wn00;-><init>(La/vn00;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, La/y3c0;->d:La/x860;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-wide v13, v1, La/v3c0;->j:J

    .line 47
    .line 48
    iget-wide v1, v0, La/y3c0;->Y:J

    .line 49
    .line 50
    iget-object v6, v0, La/y3c0;->e:La/zhl;

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v9, -0x1

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    move-wide v15, v1

    .line 58
    invoke-virtual/range {v6 .. v16}, La/zhl;->b(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 59
    .line 60
    .line 61
    if-nez p6, :cond_1

    .line 62
    .line 63
    iget-object v1, v0, La/y3c0;->u:[La/hxg0;

    .line 64
    .line 65
    array-length v2, v1

    .line 66
    const/4 v3, 0x0

    .line 67
    move v4, v3

    .line 68
    :goto_0
    if-ge v4, v2, :cond_0

    .line 69
    .line 70
    aget-object v5, v1, v4

    .line 71
    .line 72
    invoke-virtual {v5, v3}, La/hxg0;->x(Z)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget v1, v0, La/y3c0;->l1:I

    .line 79
    .line 80
    if-lez v1, :cond_1

    .line 81
    .line 82
    iget-object v1, v0, La/y3c0;->r:La/ln30;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-interface {v1, v0}, La/ggi0;->a(La/hgi0;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/y3c0;->w:Z

    .line 3
    .line 4
    iget-object v0, p0, La/y3c0;->q:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object p0, p0, La/y3c0;->o:La/s3c0;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final p()La/dcs0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/y3c0;->A:La/z220;

    .line 5
    .line 6
    iget-object p0, p0, La/z220;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/dcs0;

    .line 9
    .line 10
    return-object p0
.end method

.method public final q(II)La/ncs0;
    .locals 1

    .line 1
    new-instance p2, La/x3c0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, La/x3c0;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, La/y3c0;->E(La/x3c0;)La/ncs0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final r(La/ln30;J)V
    .locals 5

    .line 1
    iput-object p1, p0, La/y3c0;->r:La/ln30;

    .line 2
    .line 3
    iget-object p1, p0, La/y3c0;->j:Landroidx/media3/common/b;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, La/y3c0;->q(II)La/ncs0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/e5x;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    new-array v2, v0, [J

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    aput-wide v3, v2, v1

    .line 24
    .line 25
    new-array v0, v0, [J

    .line 26
    .line 27
    aput-wide v3, v0, v1

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v3, v4, v2, v0}, La/e5x;-><init>(J[J[J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/y3c0;->F(La/fvh0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, La/y3c0;->o()V

    .line 41
    .line 42
    .line 43
    iput-wide p2, p0, La/y3c0;->p1:J

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p1, p0, La/y3c0;->n:La/brd;

    .line 47
    .line 48
    invoke-virtual {p1}, La/brd;->c()Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/y3c0;->G()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final s()J
    .locals 12

    .line 1
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/y3c0;->s1:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, La/y3c0;->l1:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, La/y3c0;->A()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, La/y3c0;->p1:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, La/y3c0;->y:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, La/y3c0;->u:[La/hxg0;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, La/y3c0;->A:La/z220;

    .line 42
    .line 43
    iget-object v10, v9, La/z220;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, [Z

    .line 46
    .line 47
    aget-boolean v10, v10, v6

    .line 48
    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    iget-object v9, v9, La/z220;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, [Z

    .line 54
    .line 55
    aget-boolean v9, v9, v6

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    iget-object v9, p0, La/y3c0;->u:[La/hxg0;

    .line 60
    .line 61
    aget-object v9, v9, v6

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    iget-boolean v10, v9, La/hxg0;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    monitor-exit v9

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    iget-object v9, p0, La/y3c0;->u:[La/hxg0;

    .line 70
    .line 71
    aget-object v9, v9, v6

    .line 72
    .line 73
    monitor-enter v9

    .line 74
    :try_start_1
    iget-wide v10, v9, La/hxg0;->w:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    monitor-exit v9

    .line 77
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    throw p0

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    throw p0

    .line 88
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-wide v7, v4

    .line 92
    :cond_4
    cmp-long v0, v7, v4

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0, v3}, La/y3c0;->z(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    :cond_5
    cmp-long v0, v7, v1

    .line 101
    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    iget-wide v0, p0, La/y3c0;->o1:J

    .line 105
    .line 106
    return-wide v0

    .line 107
    :cond_6
    return-wide v7

    .line 108
    :cond_7
    :goto_2
    return-wide v1
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, La/y3c0;->q:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object p0, p0, La/y3c0;->o:La/s3c0;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(La/kq00;JJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/v3c0;

    .line 6
    .line 7
    iget-wide v2, v0, La/y3c0;->Y:J

    .line 8
    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, La/y3c0;->B:La/fvh0;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v3}, La/y3c0;->z(Z)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide/high16 v6, -0x8000000000000000L

    .line 28
    .line 29
    cmp-long v2, v4, v6

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-wide/16 v6, 0x2710

    .line 37
    .line 38
    add-long/2addr v4, v6

    .line 39
    :goto_0
    iput-wide v4, v0, La/y3c0;->Y:J

    .line 40
    .line 41
    iget-object v2, v0, La/y3c0;->B:La/fvh0;

    .line 42
    .line 43
    iget-boolean v6, v0, La/y3c0;->Z:Z

    .line 44
    .line 45
    iget-object v7, v0, La/y3c0;->g:La/b4c0;

    .line 46
    .line 47
    invoke-virtual {v7, v4, v5, v2, v6}, La/b4c0;->t(JLa/fvh0;Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v2, v1, La/v3c0;->c:La/enm0;

    .line 51
    .line 52
    new-instance v4, La/vn00;

    .line 53
    .line 54
    iget-wide v5, v1, La/v3c0;->a:J

    .line 55
    .line 56
    iget-object v7, v1, La/v3c0;->k:La/mbj;

    .line 57
    .line 58
    move-wide/from16 v8, p2

    .line 59
    .line 60
    invoke-direct/range {v4 .. v9}, La/vn00;-><init>(JLa/mbj;J)V

    .line 61
    .line 62
    .line 63
    iget-object v5, v2, La/enm0;->c:Landroid/net/Uri;

    .line 64
    .line 65
    iput-object v5, v4, La/vn00;->f:Ljava/lang/Object;

    .line 66
    .line 67
    iget-object v5, v2, La/enm0;->d:Ljava/util/Map;

    .line 68
    .line 69
    iput-object v5, v4, La/vn00;->g:Ljava/lang/Object;

    .line 70
    .line 71
    move-wide/from16 v5, p4

    .line 72
    .line 73
    iput-wide v5, v4, La/vn00;->c:J

    .line 74
    .line 75
    iget-wide v5, v2, La/enm0;->b:J

    .line 76
    .line 77
    iput-wide v5, v4, La/vn00;->d:J

    .line 78
    .line 79
    new-instance v8, La/wn00;

    .line 80
    .line 81
    invoke-direct {v8, v4}, La/wn00;-><init>(La/vn00;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v0, La/y3c0;->d:La/x860;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-wide v14, v1, La/v3c0;->j:J

    .line 90
    .line 91
    iget-wide v1, v0, La/y3c0;->Y:J

    .line 92
    .line 93
    iget-object v7, v0, La/y3c0;->e:La/zhl;

    .line 94
    .line 95
    const/4 v9, 0x1

    .line 96
    const/4 v10, -0x1

    .line 97
    const/4 v11, 0x0

    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    move-wide/from16 v16, v1

    .line 101
    .line 102
    invoke-virtual/range {v7 .. v17}, La/zhl;->c(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 103
    .line 104
    .line 105
    iput-boolean v3, v0, La/y3c0;->s1:Z

    .line 106
    .line 107
    iget-object v1, v0, La/y3c0;->r:La/ln30;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v0}, La/ggi0;->a(La/hgi0;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final v(J)V
    .locals 5

    .line 1
    iget p1, p0, La/y3c0;->l1:I

    .line 2
    .line 3
    if-lez p1, :cond_5

    .line 4
    .line 5
    invoke-virtual {p0}, La/y3c0;->A()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_5

    .line 10
    .line 11
    iget-wide p1, p0, La/y3c0;->g1:J

    .line 12
    .line 13
    const-wide/high16 v0, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p1, p1, v0

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    invoke-virtual {p0}, La/y3c0;->x()V

    .line 23
    .line 24
    .line 25
    move v1, p2

    .line 26
    move p1, v0

    .line 27
    :goto_0
    iget-object v2, p0, La/y3c0;->u:[La/hxg0;

    .line 28
    .line 29
    array-length v3, v2

    .line 30
    if-ge p1, v3, :cond_4

    .line 31
    .line 32
    iget-object v3, p0, La/y3c0;->A:La/z220;

    .line 33
    .line 34
    iget-object v4, v3, La/z220;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, [Z

    .line 37
    .line 38
    aget-boolean v4, v4, p1

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    iget-object v3, v3, La/z220;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Z

    .line 45
    .line 46
    aget-boolean v3, v3, p1

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    iget-boolean v3, p0, La/y3c0;->y:Z

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    :cond_1
    aget-object v2, v2, p1

    .line 55
    .line 56
    monitor-enter v2

    .line 57
    :try_start_0
    iget v3, v2, La/hxg0;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    const/4 v4, -0x1

    .line 60
    if-eq v3, v4, :cond_2

    .line 61
    .line 62
    move v3, p2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v3, v0

    .line 65
    :goto_1
    monitor-exit v2

    .line 66
    and-int/2addr v1, v3

    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p0

    .line 71
    :cond_3
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    move v0, v1

    .line 75
    :goto_3
    if-eqz v0, :cond_5

    .line 76
    .line 77
    iput-boolean p2, p0, La/y3c0;->s1:Z

    .line 78
    .line 79
    :cond_5
    return-void
.end method

.method public final w(La/kq00;JJLjava/io/IOException;I)La/ejx;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/v3c0;

    .line 6
    .line 7
    iget-object v2, v1, La/v3c0;->c:La/enm0;

    .line 8
    .line 9
    new-instance v3, La/vn00;

    .line 10
    .line 11
    iget-wide v4, v1, La/v3c0;->a:J

    .line 12
    .line 13
    iget-object v6, v1, La/v3c0;->k:La/mbj;

    .line 14
    .line 15
    move-wide/from16 v7, p2

    .line 16
    .line 17
    invoke-direct/range {v3 .. v8}, La/vn00;-><init>(JLa/mbj;J)V

    .line 18
    .line 19
    .line 20
    iget-object v4, v2, La/enm0;->c:Landroid/net/Uri;

    .line 21
    .line 22
    iput-object v4, v3, La/vn00;->f:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v4, v2, La/enm0;->d:Ljava/util/Map;

    .line 25
    .line 26
    iput-object v4, v3, La/vn00;->g:Ljava/lang/Object;

    .line 27
    .line 28
    move-wide/from16 v4, p4

    .line 29
    .line 30
    iput-wide v4, v3, La/vn00;->c:J

    .line 31
    .line 32
    iget-wide v4, v2, La/enm0;->b:J

    .line 33
    .line 34
    iput-wide v4, v3, La/vn00;->d:J

    .line 35
    .line 36
    new-instance v7, La/wn00;

    .line 37
    .line 38
    invoke-direct {v7, v3}, La/wn00;-><init>(La/vn00;)V

    .line 39
    .line 40
    .line 41
    iget-wide v2, v1, La/v3c0;->j:J

    .line 42
    .line 43
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 44
    .line 45
    .line 46
    iget-wide v2, v0, La/y3c0;->Y:J

    .line 47
    .line 48
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 49
    .line 50
    .line 51
    new-instance v2, La/y78;

    .line 52
    .line 53
    const/4 v3, 0x7

    .line 54
    move-object/from16 v4, p6

    .line 55
    .line 56
    move/from16 v5, p7

    .line 57
    .line 58
    invoke-direct {v2, v4, v5, v3}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, La/y3c0;->d:La/x860;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, La/x860;->f(La/y78;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    cmp-long v8, v2, v5

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x1

    .line 76
    if-nez v8, :cond_0

    .line 77
    .line 78
    sget-object v2, La/lhf0;->g:La/ejx;

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_0
    invoke-virtual {v0}, La/y3c0;->y()I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    iget v11, v0, La/y3c0;->r1:I

    .line 86
    .line 87
    if-le v8, v11, :cond_1

    .line 88
    .line 89
    move v11, v10

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move v11, v9

    .line 92
    :goto_0
    iget-boolean v12, v0, La/y3c0;->n1:Z

    .line 93
    .line 94
    if-nez v12, :cond_5

    .line 95
    .line 96
    iget-object v12, v0, La/y3c0;->B:La/fvh0;

    .line 97
    .line 98
    if-eqz v12, :cond_2

    .line 99
    .line 100
    invoke-interface {v12}, La/fvh0;->g()J

    .line 101
    .line 102
    .line 103
    move-result-wide v12

    .line 104
    cmp-long v5, v12, v5

    .line 105
    .line 106
    if-eqz v5, :cond_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    iget-boolean v5, v0, La/y3c0;->x:Z

    .line 110
    .line 111
    if-eqz v5, :cond_3

    .line 112
    .line 113
    invoke-virtual {v0}, La/y3c0;->H()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_3

    .line 118
    .line 119
    iput-boolean v10, v0, La/y3c0;->q1:Z

    .line 120
    .line 121
    sget-object v2, La/lhf0;->f:La/ejx;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_3
    iget-boolean v5, v0, La/y3c0;->x:Z

    .line 125
    .line 126
    iput-boolean v5, v0, La/y3c0;->i1:Z

    .line 127
    .line 128
    const-wide/16 v5, 0x0

    .line 129
    .line 130
    iput-wide v5, v0, La/y3c0;->o1:J

    .line 131
    .line 132
    iput v9, v0, La/y3c0;->r1:I

    .line 133
    .line 134
    iget-object v8, v0, La/y3c0;->u:[La/hxg0;

    .line 135
    .line 136
    array-length v12, v8

    .line 137
    move v13, v9

    .line 138
    :goto_1
    if-ge v13, v12, :cond_4

    .line 139
    .line 140
    aget-object v14, v8, v13

    .line 141
    .line 142
    invoke-virtual {v14, v9}, La/hxg0;->x(Z)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v13, v13, 0x1

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    iget-object v8, v1, La/v3c0;->g:La/mtc;

    .line 149
    .line 150
    iput-wide v5, v8, La/mtc;->a:J

    .line 151
    .line 152
    iput-wide v5, v1, La/v3c0;->j:J

    .line 153
    .line 154
    iput-boolean v10, v1, La/v3c0;->i:Z

    .line 155
    .line 156
    iput-boolean v9, v1, La/v3c0;->m:Z

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    :goto_2
    iput v8, v0, La/y3c0;->r1:I

    .line 160
    .line 161
    :goto_3
    new-instance v5, La/ejx;

    .line 162
    .line 163
    invoke-direct {v5, v11, v2, v3}, La/ejx;-><init>(IJ)V

    .line 164
    .line 165
    .line 166
    move-object v2, v5

    .line 167
    :goto_4
    iget v3, v2, La/ejx;->a:I

    .line 168
    .line 169
    if-eqz v3, :cond_6

    .line 170
    .line 171
    if-ne v3, v10, :cond_7

    .line 172
    .line 173
    :cond_6
    move v9, v10

    .line 174
    :cond_7
    xor-int/lit8 v18, v9, 0x1

    .line 175
    .line 176
    iget-wide v13, v1, La/v3c0;->j:J

    .line 177
    .line 178
    iget-wide v5, v0, La/y3c0;->Y:J

    .line 179
    .line 180
    iget-object v0, v0, La/y3c0;->e:La/zhl;

    .line 181
    .line 182
    const/4 v8, 0x1

    .line 183
    const/4 v9, -0x1

    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v11, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    move-object/from16 v17, v4

    .line 188
    .line 189
    move-wide v15, v5

    .line 190
    move-object v6, v0

    .line 191
    invoke-virtual/range {v6 .. v18}, La/zhl;->d(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 192
    .line 193
    .line 194
    return-object v2
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/y3c0;->x:Z

    .line 2
    .line 3
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/y3c0;->A:La/z220;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/y3c0;->B:La/fvh0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final y()I
    .locals 5

    .line 1
    iget-object p0, p0, La/y3c0;->u:[La/hxg0;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    aget-object v3, p0, v1

    .line 9
    .line 10
    iget v4, v3, La/hxg0;->q:I

    .line 11
    .line 12
    iget v3, v3, La/hxg0;->p:I

    .line 13
    .line 14
    add-int/2addr v4, v3

    .line 15
    add-int/2addr v2, v4

    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v2
.end method

.method public final z(Z)J
    .locals 6

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, La/y3c0;->u:[La/hxg0;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, La/y3c0;->A:La/z220;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v3, La/z220;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, [Z

    .line 19
    .line 20
    aget-boolean v3, v3, v2

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v3, p0, La/y3c0;->u:[La/hxg0;

    .line 25
    .line 26
    aget-object v3, v3, v2

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    iget-wide v4, v3, La/hxg0;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v3

    .line 32
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0

    .line 42
    :cond_2
    return-wide v0
.end method
