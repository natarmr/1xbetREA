.class public final La/bgr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final g:Ljava/lang/Object;

.field public static h:Ljava/lang/Boolean;

.field public static i:Ljava/lang/Boolean;


# instance fields
.field public final synthetic a:B

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


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
    sput-object v0, La/bgr0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/c2x0;Landroid/os/Bundle;La/r1x0;La/r1x0;J)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/bgr0;->a:B

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/bgr0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/bgr0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/bgr0;->e:Ljava/lang/Object;

    iput-wide p5, p0, La/bgr0;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La/bgr0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zfr0;Landroid/content/Context;La/fd40;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/bgr0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bgr0;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/bgr0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p4, p0, La/bgr0;->b:J

    .line 12
    .line 13
    iput-object p3, p0, La/bgr0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const-string p1, "power"

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/os/PowerManager;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    const-string p3, "wake:com.google.firebase.messaging"

    .line 25
    .line 26
    invoke-virtual {p1, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/bgr0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JB)V
    .locals 0

    .line 34
    iput-byte p7, p0, La/bgr0;->a:B

    iput-object p2, p0, La/bgr0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/bgr0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/bgr0;->e:Ljava/lang/Object;

    iput-wide p5, p0, La/bgr0;->b:J

    iput-object p1, p0, La/bgr0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget-object v0, La/bgr0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/bgr0;->i:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, La/bgr0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sput-object p0, La/bgr0;->i:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    monitor-exit v0

    .line 32
    return p0

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Z
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_2

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    const-string v0, "FirebaseMessaging"

    .line 21
    .line 22
    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Missing Permission: "

    .line 31
    .line 32
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_2
    return p0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget-object v0, La/bgr0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/bgr0;->h:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v2, "android.permission.WAKE_LOCK"

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, La/bgr0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sput-object p0, La/bgr0;->h:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    monitor-exit v0

    .line 32
    return p0

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method


# virtual methods
.method public declared-synchronized d()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/bgr0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "connectivity"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 27
    .line 28
    .line 29
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    return v0

    .line 37
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bgr0;->a:B

    .line 4
    .line 5
    iget-wide v2, v0, La/bgr0;->b:J

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v0, La/bgr0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, v0, La/bgr0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, La/bgr0;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, v0, La/bgr0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v9, Landroid/os/Bundle;

    .line 21
    .line 22
    const-string v1, "screen_name"

    .line 23
    .line 24
    invoke-virtual {v9, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "screen_class"

    .line 28
    .line 29
    invoke-virtual {v9, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v10, v8

    .line 33
    check-cast v10, La/c2x0;

    .line 34
    .line 35
    iget-object v1, v10, La/p4;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, La/kxw0;

    .line 38
    .line 39
    iget-object v1, v1, La/kxw0;->i:La/x6x0;

    .line 40
    .line 41
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 42
    .line 43
    .line 44
    const-string v2, "screen_view"

    .line 45
    .line 46
    invoke-virtual {v1, v2, v9, v5, v4}, La/x6x0;->w1(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object v16

    .line 50
    move-object v11, v7

    .line 51
    check-cast v11, La/r1x0;

    .line 52
    .line 53
    move-object v12, v6

    .line 54
    check-cast v12, La/r1x0;

    .line 55
    .line 56
    iget-wide v13, v0, La/bgr0;->b:J

    .line 57
    .line 58
    const/4 v15, 0x1

    .line 59
    invoke-virtual/range {v10 .. v16}, La/c2x0;->r1(La/r1x0;La/r1x0;JZLandroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    check-cast v8, La/b1x0;

    .line 64
    .line 65
    move-object v4, v9

    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    move-object v5, v7

    .line 69
    check-cast v5, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, v0, La/bgr0;->e:Ljava/lang/Object;

    .line 72
    .line 73
    iget-wide v1, v0, La/bgr0;->b:J

    .line 74
    .line 75
    move-object v0, v8

    .line 76
    invoke-virtual/range {v0 .. v5}, La/b1x0;->w1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    check-cast v7, Ljava/lang/String;

    .line 81
    .line 82
    check-cast v8, La/oyw0;

    .line 83
    .line 84
    iget-object v0, v8, La/oyw0;->a:La/m6x0;

    .line 85
    .line 86
    check-cast v9, Ljava/lang/String;

    .line 87
    .line 88
    if-nez v9, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0}, La/m6x0;->J()La/fxw0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, La/fxw0;->m1()V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, La/m6x0;->h1:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v1, :cond_0

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    iput-object v7, v0, La/m6x0;->h1:Ljava/lang/String;

    .line 109
    .line 110
    iput-object v5, v0, La/m6x0;->g1:La/r1x0;

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    check-cast v6, Ljava/lang/String;

    .line 114
    .line 115
    new-instance v1, La/r1x0;

    .line 116
    .line 117
    invoke-direct {v1, v6, v9, v2, v3}, La/r1x0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, La/m6x0;->J()La/fxw0;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2}, La/fxw0;->m1()V

    .line 125
    .line 126
    .line 127
    iget-object v2, v0, La/m6x0;->h1:Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_2
    iput-object v7, v0, La/m6x0;->h1:Ljava/lang/String;

    .line 135
    .line 136
    iput-object v1, v0, La/m6x0;->g1:La/r1x0;

    .line 137
    .line 138
    :goto_0
    return-void

    .line 139
    :pswitch_2
    const-string v1, "TopicsSyncTask\'s wakelock was already released due to timeout."

    .line 140
    .line 141
    check-cast v8, La/zfr0;

    .line 142
    .line 143
    const-string v5, "FirebaseMessaging"

    .line 144
    .line 145
    check-cast v6, Landroid/os/PowerManager$WakeLock;

    .line 146
    .line 147
    const-string v10, "Failed to sync topics. Won\'t retry sync. "

    .line 148
    .line 149
    check-cast v9, Landroid/content/Context;

    .line 150
    .line 151
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-eqz v11, :cond_3

    .line 156
    .line 157
    const-wide/32 v11, 0x2bf20

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v11, v12}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 161
    .line 162
    .line 163
    :cond_3
    const/4 v11, 0x1

    .line 164
    :try_start_0
    invoke-virtual {v8, v11}, La/zfr0;->a(Z)V

    .line 165
    .line 166
    .line 167
    check-cast v7, La/fd40;

    .line 168
    .line 169
    invoke-virtual {v7}, La/fd40;->e()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-nez v7, :cond_4

    .line 174
    .line 175
    invoke-virtual {v8, v4}, La/zfr0;->a(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .line 177
    .line 178
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_7

    .line 183
    .line 184
    :goto_1
    :try_start_1
    invoke-virtual {v6}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catch_0
    invoke-static {v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_0
    move-exception v0

    .line 193
    goto :goto_5

    .line 194
    :catch_1
    move-exception v0

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    :try_start_2
    invoke-static {v9}, La/bgr0;->a(Landroid/content/Context;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eqz v7, :cond_5

    .line 201
    .line 202
    invoke-virtual {v0}, La/bgr0;->d()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-nez v7, :cond_5

    .line 207
    .line 208
    new-instance v2, La/agr0;

    .line 209
    .line 210
    invoke-direct {v2, v0, v0}, La/agr0;-><init>(La/bgr0;La/bgr0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, La/agr0;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    .line 215
    .line 216
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_7

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_5
    :try_start_3
    invoke-virtual {v8}, La/zfr0;->b()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_6

    .line 228
    .line 229
    invoke-virtual {v8, v4}, La/zfr0;->a(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_6
    invoke-virtual {v8, v2, v3}, La/zfr0;->c(J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 234
    .line 235
    .line 236
    :goto_2
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_7

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :goto_3
    :try_start_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    invoke-virtual {v8, v4}, La/zfr0;->a(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 263
    .line 264
    .line 265
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_7

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_7
    :goto_4
    return-void

    .line 273
    :goto_5
    invoke-static {v9}, La/bgr0;->c(Landroid/content/Context;)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_8

    .line 278
    .line 279
    :try_start_5
    invoke-virtual {v6}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :catch_2
    invoke-static {v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    :cond_8
    :goto_6
    throw v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
