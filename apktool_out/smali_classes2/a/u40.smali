.class public La/u40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/lang/Object;

.field public static volatile i:La/u40;


# instance fields
.field public a:La/va8;

.field public b:La/yrw0;

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:La/imw0;

.field public final f:Landroid/content/Context;

.field public final g:S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u40;->h:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/u40;->d:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/u40;->f:Landroid/content/Context;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, La/u40;->c:Z

    .line 22
    .line 23
    const/16 p1, 0x7530

    .line 24
    .line 25
    iput-short p1, p0, La/u40;->g:S

    .line 26
    .line 27
    return-void
.end method

.method public static a(Landroid/content/Context;)La/t40;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "ms"

    .line 4
    .line 5
    const-string v2, "GetInfoInternal elapse "

    .line 6
    .line 7
    sget-object v3, La/u40;->i:La/u40;

    .line 8
    .line 9
    if-nez v3, :cond_1

    .line 10
    .line 11
    sget-object v4, La/u40;->h:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v4

    .line 14
    :try_start_0
    sget-object v3, La/u40;->i:La/u40;

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    const-string v3, "AdvertisingIdClient"

    .line 19
    .line 20
    const-string v5, "Creating AdvertisingIdClient"

    .line 21
    .line 22
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    new-instance v3, La/u40;

    .line 26
    .line 27
    invoke-direct {v3, v0}, La/u40;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    sput-object v3, La/u40;->i:La/u40;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v4

    .line 36
    goto :goto_2

    .line 37
    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw v0

    .line 39
    :cond_1
    :goto_2
    const-string v4, "AdvertisingIdClient"

    .line 40
    .line 41
    const-string v5, "AdvertisingIdClient already created."

    .line 42
    .line 43
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    sget-object v4, La/xex;->c:La/xex;

    .line 47
    .line 48
    const-wide/16 v5, -0x1

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    sget-object v4, La/xex;->d:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v4

    .line 55
    :try_start_1
    sget-object v7, La/xex;->c:La/xex;

    .line 56
    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    new-instance v7, La/xex;

    .line 60
    .line 61
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v8, Ljava/util/concurrent/atomic/AtomicLong;

    .line 65
    .line 66
    invoke-direct {v8, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 67
    .line 68
    .line 69
    iput-object v8, v7, La/xex;->b:Ljava/lang/Object;

    .line 70
    .line 71
    const-string v8, "ads_identifier:api"

    .line 72
    .line 73
    new-instance v9, La/mwp0;

    .line 74
    .line 75
    invoke-direct {v9, v8}, La/mwp0;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v8, La/mmx;

    .line 79
    .line 80
    sget-object v10, La/mmx;->n:La/yzn0;

    .line 81
    .line 82
    sget-object v11, La/mav;->c:La/mav;

    .line 83
    .line 84
    invoke-direct {v8, v0, v10, v9, v11}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 85
    .line 86
    .line 87
    iput-object v8, v7, La/xex;->a:Ljava/lang/Object;

    .line 88
    .line 89
    sput-object v7, La/xex;->c:La/xex;

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    goto :goto_4

    .line 94
    :cond_2
    :goto_3
    monitor-exit v4

    .line 95
    goto :goto_5

    .line 96
    :goto_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    throw v0

    .line 98
    :cond_3
    :goto_5
    sget-object v7, La/xex;->c:La/xex;

    .line 99
    .line 100
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 101
    .line 102
    .line 103
    move-result-wide v8

    .line 104
    const/4 v4, 0x0

    .line 105
    :try_start_2
    invoke-virtual {v3}, La/u40;->f()La/t40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v10

    .line 113
    sub-long v14, v10, v8

    .line 114
    .line 115
    invoke-virtual {v3, v0, v14, v15, v4}, La/u40;->d(La/t40;JLjava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 123
    .line 124
    .line 125
    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 126
    sub-long/2addr v10, v8

    .line 127
    move-wide/from16 v16, v8

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    long-to-int v9, v10

    .line 131
    move-wide/from16 v10, v16

    .line 132
    .line 133
    :try_start_3
    invoke-virtual/range {v7 .. v13}, La/xex;->P(IIJJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 134
    .line 135
    .line 136
    :try_start_4
    const-string v8, "AdvertisingIdClient"

    .line 137
    .line 138
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    add-int/lit8 v9, v9, 0x19

    .line 147
    .line 148
    new-instance v10, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v8, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 167
    .line 168
    .line 169
    return-object v0

    .line 170
    :catchall_2
    move-exception v0

    .line 171
    goto :goto_6

    .line 172
    :catchall_3
    move-exception v0

    .line 173
    move-wide/from16 v16, v10

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :catchall_4
    move-exception v0

    .line 177
    move-wide/from16 v16, v8

    .line 178
    .line 179
    :goto_6
    invoke-virtual {v3, v4, v5, v6, v0}, La/u40;->d(La/t40;JLjava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    instance-of v1, v0, Ljava/io/IOException;

    .line 183
    .line 184
    if-nez v1, :cond_6

    .line 185
    .line 186
    instance-of v1, v0, La/abv;

    .line 187
    .line 188
    if-nez v1, :cond_5

    .line 189
    .line 190
    instance-of v1, v0, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    if-eqz v1, :cond_4

    .line 193
    .line 194
    const/16 v1, 0x8

    .line 195
    .line 196
    :goto_7
    move v6, v1

    .line 197
    goto :goto_8

    .line 198
    :cond_4
    const/4 v1, -0x1

    .line 199
    goto :goto_7

    .line 200
    :cond_5
    const/16 v1, 0x9

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_6
    const/4 v1, 0x1

    .line 204
    goto :goto_7

    .line 205
    :goto_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v10

    .line 209
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 210
    .line 211
    .line 212
    move-result-wide v1

    .line 213
    sub-long v1, v1, v16

    .line 214
    .line 215
    long-to-int v1, v1

    .line 216
    move-object v5, v7

    .line 217
    move-wide/from16 v8, v16

    .line 218
    .line 219
    move v7, v1

    .line 220
    invoke-virtual/range {v5 .. v11}, La/xex;->P(IIJJ)V

    .line 221
    .line 222
    .line 223
    throw v0
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    const-string v0, "Calling this from your main thread can lead to deadlock"

    .line 2
    .line 3
    invoke-static {v0}, La/s0x;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, La/u40;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/u40;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "com.android.vending"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    :try_start_2
    sget-object v1, La/pav;->b:La/pav;

    .line 29
    .line 30
    const v2, 0xbdfcb8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, La/pav;->c(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 44
    .line 45
    const-string v1, "Google Play services not available"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    :goto_0
    const-string v1, "com.google.android.gms.ads.identifier.service.START"

    .line 52
    .line 53
    new-instance v2, La/va8;

    .line 54
    .line 55
    invoke-direct {v2}, La/va8;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v3, Landroid/content/Intent;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v1, "com.google.android.gms"

    .line 64
    .line 65
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_3
    invoke-static {}, La/bbw0;->m()La/bbw0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-virtual {v1, v0, v3, v2, v4}, La/bbw0;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 74
    .line 75
    .line 76
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    :try_start_4
    iput-object v2, p0, La/u40;->a:La/va8;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 80
    .line 81
    :try_start_5
    invoke-virtual {v2}, La/va8;->a()Landroid/os/IBinder;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget v1, La/grw0;->a:I

    .line 86
    .line 87
    const-string v1, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    .line 88
    .line 89
    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    instance-of v2, v1, La/yrw0;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    check-cast v1, La/yrw0;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    new-instance v1, La/aqw0;

    .line 101
    .line 102
    invoke-direct {v1, v0}, La/aqw0;-><init>(Landroid/os/IBinder;)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 103
    .line 104
    .line 105
    :goto_1
    :try_start_6
    iput-object v1, p0, La/u40;->b:La/yrw0;

    .line 106
    .line 107
    iput-boolean v4, p0, La/u40;->c:Z

    .line 108
    .line 109
    monitor-exit p0

    .line 110
    return-void

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    new-instance v1, Ljava/io/IOException;

    .line 113
    .line 114
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 119
    .line 120
    const-string v1, "Interrupted exception"

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 127
    .line 128
    const-string v1, "Connection failure"

    .line 129
    .line 130
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :catchall_2
    move-exception v0

    .line 135
    new-instance v1, Ljava/io/IOException;

    .line 136
    .line 137
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :catch_1
    new-instance v0, La/abv;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :goto_2
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 148
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    const-string v0, "Calling this from your main thread can lead to deadlock"

    .line 2
    .line 3
    invoke-static {v0}, La/s0x;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, La/u40;->f:Landroid/content/Context;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, La/u40;->a:La/va8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :try_start_1
    iget-boolean v1, p0, La/u40;->c:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {}, La/bbw0;->m()La/bbw0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, La/u40;->a:La/va8;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, La/bbw0;->s(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_2
    const-string v1, "AdvertisingIdClient"

    .line 32
    .line 33
    const-string v2, "AdvertisingIdClient unbindService failed."

    .line 34
    .line 35
    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, La/u40;->c:Z

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, La/u40;->b:La/yrw0;

    .line 43
    .line 44
    iput-object v0, p0, La/u40;->a:La/va8;

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :goto_1
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    throw v0
.end method

.method public final d(La/t40;JLjava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-gtz v0, :cond_3

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "app_context"

    .line 17
    .line 18
    const-string v2, "1"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-boolean v1, p1, La/t40;->b:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eq v3, v1, :cond_0

    .line 29
    .line 30
    const-string v2, "0"

    .line 31
    .line 32
    :cond_0
    const-string v1, "limit_ad_tracking"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, La/t40;->c:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const-string v1, "ad_id_size"

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz p4, :cond_2

    .line 55
    .line 56
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p4, "error"

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_2
    const-string p1, "tag"

    .line 70
    .line 71
    const-string p4, "AdvertisingIdClient"

    .line 72
    .line 73
    invoke-virtual {v0, p1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p2, "time_spent"

    .line 81
    .line 82
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    new-instance p1, La/byj0;

    .line 86
    .line 87
    invoke-direct {p1, p0, v0}, La/byj0;-><init>(La/u40;Ljava/util/HashMap;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
.end method

.method public final declared-synchronized e()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La/u40;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    :try_start_1
    const-string v0, "AdvertisingIdClient"

    .line 7
    .line 8
    const-string v1, "AdvertisingIdClient is not bounded. Starting to bind it..."

    .line 9
    .line 10
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/u40;->b()V

    .line 14
    .line 15
    .line 16
    const-string v0, "AdvertisingIdClient"

    .line 17
    .line 18
    const-string v1, "AdvertisingIdClient is bounded"

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    iget-boolean v0, p0, La/u40;->c:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 29
    .line 30
    const-string v1, "AdvertisingIdClient cannot reconnect."

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/io/IOException;

    .line 40
    .line 41
    const-string v2, "AdvertisingIdClient cannot reconnect."

    .line 42
    .line 43
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    :cond_1
    :goto_0
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    throw v0
.end method

.method public final f()La/t40;
    .locals 6

    .line 1
    const-string v0, "Calling this from your main thread can lead to deadlock"

    .line 2
    .line 3
    invoke-static {v0}, La/s0x;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    invoke-virtual {p0}, La/u40;->e()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/u40;->a:La/va8;

    .line 11
    .line 12
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/u40;->b:La/yrw0;

    .line 16
    .line 17
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_1
    new-instance v0, La/t40;

    .line 21
    .line 22
    iget-object v1, p0, La/u40;->b:La/yrw0;

    .line 23
    .line 24
    check-cast v1, La/aqw0;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v1, v2, v3}, La/aqw0;->b(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/u40;->b:La/yrw0;

    .line 51
    .line 52
    check-cast v1, La/aqw0;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget v5, La/xnw0;->a:I

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    invoke-virtual {v1, v4, v5}, La/aqw0;->b(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/4 v5, 0x0

    .line 81
    if-eqz v4, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move v3, v5

    .line 85
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v5, v2, v3}, La/t40;-><init>(BLjava/lang/String;Z)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    iget-object v1, p0, La/u40;->d:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter v1

    .line 95
    :try_start_3
    iget-object v2, p0, La/u40;->e:La/imw0;

    .line 96
    .line 97
    if-eqz v2, :cond_1

    .line 98
    .line 99
    iget-object v2, v2, La/imw0;->c:Ljava/util/concurrent/CountDownLatch;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    .line 104
    :try_start_4
    iget-object v2, p0, La/u40;->e:La/imw0;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Thread;->join()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    goto :goto_2

    .line 112
    :catch_0
    :cond_1
    :goto_1
    :try_start_5
    iget-short v2, p0, La/u40;->g:S

    .line 113
    .line 114
    int-to-long v2, v2

    .line 115
    const-wide/16 v4, 0x0

    .line 116
    .line 117
    cmp-long v4, v2, v4

    .line 118
    .line 119
    if-lez v4, :cond_2

    .line 120
    .line 121
    new-instance v4, La/imw0;

    .line 122
    .line 123
    invoke-direct {v4, p0, v2, v3}, La/imw0;-><init>(La/u40;J)V

    .line 124
    .line 125
    .line 126
    iput-object v4, p0, La/u40;->e:La/imw0;

    .line 127
    .line 128
    :cond_2
    monitor-exit v1

    .line 129
    return-object v0

    .line 130
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 131
    throw p0

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    goto :goto_3

    .line 134
    :catch_1
    move-exception v0

    .line 135
    :try_start_6
    const-string v1, "AdvertisingIdClient"

    .line 136
    .line 137
    const-string v2, "GMS remote exception "

    .line 138
    .line 139
    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 140
    .line 141
    .line 142
    new-instance v1, Ljava/io/IOException;

    .line 143
    .line 144
    const-string v2, "Remote exception"

    .line 145
    .line 146
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :goto_3
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 151
    throw v0
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u40;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
