.class public final La/xvj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:La/rcf0;


# instance fields
.field public final a:Landroidx/media3/common/Timeline$Window;

.field public final b:La/amq0;

.field public final c:La/hu5;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:J

.field public final m:La/wcf0;

.field public final n:Ljava/util/concurrent/ConcurrentHashMap;

.field public o:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, La/b4x;->b:La/v3x;

    .line 2
    .line 3
    const-string v1, "file"

    .line 4
    .line 5
    const-string v2, "content"

    .line 6
    .line 7
    const-string v3, "data"

    .line 8
    .line 9
    const-string v4, "android.resource"

    .line 10
    .line 11
    const-string v5, "rawresource"

    .line 12
    .line 13
    const-string v6, "asset"

    .line 14
    .line 15
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-static {v1, v0}, La/h8x;->w(I[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, La/b4x;->k(I[Ljava/lang/Object;)La/rcf0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, La/xvj;->p:La/rcf0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    new-instance v0, La/hu5;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/hu5;-><init>(B)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, v0, La/hu5;->d:I

    .line 9
    .line 10
    const/16 v2, 0x64

    .line 11
    .line 12
    new-array v2, v2, [La/o52;

    .line 13
    .line 14
    iput-object v2, v0, La/hu5;->e:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3e8

    .line 20
    .line 21
    const-string v3, "bufferForPlaybackMs"

    .line 22
    .line 23
    const-string v4, "0"

    .line 24
    .line 25
    invoke-static {v2, v3, v1, v4}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v5, "bufferForPlaybackForLocalPlaybackMs"

    .line 29
    .line 30
    invoke-static {v2, v5, v1, v4}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/16 v6, 0x7d0

    .line 34
    .line 35
    const-string v7, "bufferForPlaybackAfterRebufferMs"

    .line 36
    .line 37
    invoke-static {v6, v7, v1, v4}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs"

    .line 41
    .line 42
    invoke-static {v2, v8, v1, v4}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const v9, 0xc350

    .line 46
    .line 47
    .line 48
    const-string v10, "minBufferMs"

    .line 49
    .line 50
    invoke-static {v9, v10, v2, v3}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v3, "minBufferForLocalPlaybackMs"

    .line 54
    .line 55
    invoke-static {v2, v3, v2, v5}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v9, v10, v6, v7}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3, v2, v8}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v5, "maxBufferMs"

    .line 65
    .line 66
    invoke-static {v9, v5, v9, v10}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v5, "maxBufferForLocalPlaybackMs"

    .line 70
    .line 71
    invoke-static {v9, v5, v2, v3}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v2, "backBufferDurationMs"

    .line 75
    .line 76
    invoke-static {v1, v2, v1, v4}, La/xvj;->a(ILjava/lang/String;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Landroidx/media3/common/Timeline$Window;

    .line 80
    .line 81
    invoke-direct {v1}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, La/xvj;->a:Landroidx/media3/common/Timeline$Window;

    .line 85
    .line 86
    new-instance v1, La/amq0;

    .line 87
    .line 88
    invoke-direct {v1}, La/amq0;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La/xvj;->b:La/amq0;

    .line 92
    .line 93
    iput-object v0, p0, La/xvj;->c:La/hu5;

    .line 94
    .line 95
    const-wide/32 v0, 0xc350

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, La/vtt0;->M(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    iput-wide v0, p0, La/xvj;->d:J

    .line 103
    .line 104
    const-wide/16 v2, 0x3e8

    .line 105
    .line 106
    invoke-static {v2, v3}, La/vtt0;->M(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    iput-wide v2, p0, La/xvj;->e:J

    .line 111
    .line 112
    iput-wide v0, p0, La/xvj;->f:J

    .line 113
    .line 114
    iput-wide v0, p0, La/xvj;->g:J

    .line 115
    .line 116
    iput-wide v2, p0, La/xvj;->h:J

    .line 117
    .line 118
    iput-wide v2, p0, La/xvj;->i:J

    .line 119
    .line 120
    const-wide/16 v0, 0x7d0

    .line 121
    .line 122
    invoke-static {v0, v1}, La/vtt0;->M(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    iput-wide v0, p0, La/xvj;->j:J

    .line 127
    .line 128
    iput-wide v2, p0, La/xvj;->k:J

    .line 129
    .line 130
    const-wide/16 v0, 0x0

    .line 131
    .line 132
    invoke-static {v0, v1}, La/vtt0;->M(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    iput-wide v0, p0, La/xvj;->l:J

    .line 137
    .line 138
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 144
    .line 145
    sget-object v0, La/wcf0;->g:La/wcf0;

    .line 146
    .line 147
    invoke-static {v0}, La/wcf0;->b(Ljava/util/Map;)La/wcf0;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, La/xvj;->m:La/wcf0;

    .line 152
    .line 153
    const-wide/16 v0, -0x1

    .line 154
    .line 155
    iput-wide v0, p0, La/xvj;->o:J

    .line 156
    .line 157
    return-void
.end method

.method public static a(ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    if-lt p0, p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    :goto_0
    const-string p2, "%s cannot be less than %s"

    .line 7
    .line 8
    invoke-static {p0, p2, p1, p3}, La/x0x;->C(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Comparable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(La/rl00;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/rl00;->a:La/a4a0;

    .line 6
    .line 7
    iget-object v3, v0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, La/wvj;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v4, v0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, La/wvj;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    monitor-enter v4

    .line 30
    :try_start_0
    iget v5, v4, La/wvj;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    monitor-exit v4

    .line 33
    const/high16 v4, 0x10000

    .line 34
    .line 35
    mul-int/2addr v5, v4

    .line 36
    iget-object v6, v0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, La/wvj;

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget v6, v6, La/wvj;->c:I

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x1

    .line 51
    if-lt v5, v6, :cond_0

    .line 52
    .line 53
    move v5, v8

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v5, v7

    .line 56
    :goto_0
    sget-object v6, La/a4a0;->c:La/a4a0;

    .line 57
    .line 58
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    xor-int/lit8 v0, v5, 0x1

    .line 65
    .line 66
    return v0

    .line 67
    :cond_1
    iget-object v2, v1, La/rl00;->b:La/bmq0;

    .line 68
    .line 69
    iget-object v6, v1, La/rl00;->c:La/vn30;

    .line 70
    .line 71
    iget-object v6, v6, La/vn30;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v9, v0, La/xvj;->b:La/amq0;

    .line 74
    .line 75
    invoke-virtual {v2, v6, v9}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    iget v6, v6, La/amq0;->c:I

    .line 80
    .line 81
    iget-object v9, v0, La/xvj;->a:Landroidx/media3/common/Timeline$Window;

    .line 82
    .line 83
    const-wide/16 v10, 0x0

    .line 84
    .line 85
    invoke-virtual {v2, v6, v9, v10, v11}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object v2, v2, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 90
    .line 91
    iget-object v2, v2, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget-object v2, v2, La/en30;->a:Landroid/net/Uri;

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_4

    .line 107
    .line 108
    sget-object v6, La/xvj;->p:La/rcf0;

    .line 109
    .line 110
    invoke-virtual {v6, v2}, La/b4x;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    :goto_1
    move v2, v7

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    :goto_2
    move v2, v8

    .line 120
    :goto_3
    if-eqz v2, :cond_5

    .line 121
    .line 122
    iget-wide v9, v0, La/xvj;->e:J

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    iget-wide v9, v0, La/xvj;->d:J

    .line 126
    .line 127
    :goto_4
    if-eqz v2, :cond_6

    .line 128
    .line 129
    iget-wide v11, v0, La/xvj;->g:J

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_6
    iget-wide v11, v0, La/xvj;->f:J

    .line 133
    .line 134
    :goto_5
    iget v6, v1, La/rl00;->e:F

    .line 135
    .line 136
    const/high16 v13, 0x3f800000    # 1.0f

    .line 137
    .line 138
    cmpl-float v13, v6, v13

    .line 139
    .line 140
    if-lez v13, :cond_7

    .line 141
    .line 142
    invoke-static {v6, v9, v10}, La/vtt0;->y(FJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 147
    .line 148
    .line 149
    move-result-wide v9

    .line 150
    :cond_7
    const-wide/32 v13, 0x7a120

    .line 151
    .line 152
    .line 153
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 154
    .line 155
    .line 156
    move-result-wide v9

    .line 157
    move v6, v4

    .line 158
    move v15, v5

    .line 159
    iget-wide v4, v1, La/rl00;->d:J

    .line 160
    .line 161
    cmp-long v9, v4, v9

    .line 162
    .line 163
    if-gez v9, :cond_e

    .line 164
    .line 165
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Ljava/lang/Runtime;->maxMemory()J

    .line 170
    .line 171
    .line 172
    move-result-wide v9

    .line 173
    invoke-virtual {v4}, Ljava/lang/Runtime;->totalMemory()J

    .line 174
    .line 175
    .line 176
    move-result-wide v11

    .line 177
    cmp-long v5, v11, v9

    .line 178
    .line 179
    if-ltz v5, :cond_9

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Runtime;->freeMemory()J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    iget-object v11, v0, La/xvj;->c:La/hu5;

    .line 186
    .line 187
    monitor-enter v11

    .line 188
    :try_start_1
    iget v0, v11, La/hu5;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    mul-int/2addr v0, v6

    .line 191
    monitor-exit v11

    .line 192
    int-to-long v11, v0

    .line 193
    add-long/2addr v4, v11

    .line 194
    const-wide/16 v11, 0x19

    .line 195
    .line 196
    div-long/2addr v9, v11

    .line 197
    cmp-long v0, v4, v9

    .line 198
    .line 199
    if-ltz v0, :cond_8

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    move v0, v7

    .line 203
    goto :goto_7

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    throw v0

    .line 207
    :cond_9
    :goto_6
    move v0, v8

    .line 208
    :goto_7
    if-eqz v2, :cond_a

    .line 209
    .line 210
    if-nez v0, :cond_b

    .line 211
    .line 212
    :cond_a
    if-nez v15, :cond_c

    .line 213
    .line 214
    :cond_b
    move v7, v8

    .line 215
    :cond_c
    iput-boolean v7, v3, La/wvj;->b:Z

    .line 216
    .line 217
    if-nez v7, :cond_d

    .line 218
    .line 219
    if-eqz v2, :cond_d

    .line 220
    .line 221
    if-nez v0, :cond_d

    .line 222
    .line 223
    const-string v0, "DefaultLoadControl"

    .line 224
    .line 225
    const-string v2, "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true."

    .line 226
    .line 227
    invoke-static {v0, v2}, La/f1t0;->a0(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_d
    iget-boolean v0, v3, La/wvj;->b:Z

    .line 231
    .line 232
    if-nez v0, :cond_10

    .line 233
    .line 234
    iget-wide v0, v1, La/rl00;->d:J

    .line 235
    .line 236
    cmp-long v0, v0, v13

    .line 237
    .line 238
    if-gez v0, :cond_10

    .line 239
    .line 240
    const-string v0, "DefaultLoadControl"

    .line 241
    .line 242
    const-string v1, "Target buffer size reached with less than 500ms of buffered media data."

    .line 243
    .line 244
    invoke-static {v0, v1}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_e
    cmp-long v0, v4, v11

    .line 249
    .line 250
    if-gez v0, :cond_f

    .line 251
    .line 252
    if-eqz v15, :cond_10

    .line 253
    .line 254
    :cond_f
    iput-boolean v7, v3, La/wvj;->b:Z

    .line 255
    .line 256
    :cond_10
    :goto_8
    iget-boolean v0, v3, La/wvj;->b:Z

    .line 257
    .line 258
    return v0

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 261
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/xvj;->c:La/hu5;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    invoke-virtual {v1, v2}, La/hu5;->Y(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit v1

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p0

    .line 21
    :cond_0
    iget-object p0, p0, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/wvj;

    .line 42
    .line 43
    iget v0, v0, La/wvj;->c:I

    .line 44
    .line 45
    add-int/2addr v2, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v2}, La/hu5;->Y(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
