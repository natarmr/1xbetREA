.class public final La/xgq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gfq;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:La/krd;

.field public final d:La/krd;

.field public final e:La/rrd;

.field public final f:La/srd;

.field public final g:La/msd;

.field public final h:La/phf0;

.field public final i:La/n660;


# direct methods
.method public constructor <init>(La/gfq;Ljava/util/concurrent/Executor;La/krd;La/krd;La/krd;La/rrd;La/srd;La/msd;La/phf0;La/n660;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xgq;->a:La/gfq;

    .line 5
    .line 6
    iput-object p2, p0, La/xgq;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, La/xgq;->c:La/krd;

    .line 9
    .line 10
    iput-object p4, p0, La/xgq;->d:La/krd;

    .line 11
    .line 12
    iput-object p6, p0, La/xgq;->e:La/rrd;

    .line 13
    .line 14
    iput-object p7, p0, La/xgq;->f:La/srd;

    .line 15
    .line 16
    iput-object p8, p0, La/xgq;->g:La/msd;

    .line 17
    .line 18
    iput-object p9, p0, La/xgq;->h:La/phf0;

    .line 19
    .line 20
    iput-object p10, p0, La/xgq;->i:La/n660;

    .line 21
    .line 22
    return-void
.end method

.method public static d(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 11

    .line 1
    iget-object p0, p0, La/xgq;->f:La/srd;

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/srd;->c:La/krd;

    .line 9
    .line 10
    invoke-static {v1}, La/srd;->a(La/krd;)Ljava/util/HashSet;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, La/srd;->d:La/krd;

    .line 18
    .line 19
    invoke-static {v1}, La/srd;->a(La/krd;)Ljava/util/HashSet;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_6

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v3, p0, La/srd;->c:La/krd;

    .line 48
    .line 49
    invoke-virtual {v3}, La/krd;->c()La/mrd;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v4, 0x0

    .line 54
    if-nez v3, :cond_0

    .line 55
    .line 56
    :catch_0
    move-object v3, v4

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :try_start_0
    iget-object v3, v3, La/mrd;->b:Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_1
    if-eqz v3, :cond_3

    .line 65
    .line 66
    iget-object v4, p0, La/srd;->c:La/krd;

    .line 67
    .line 68
    invoke-virtual {v4}, La/krd;->c()La/mrd;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_1
    iget-object v5, p0, La/srd;->a:Ljava/util/HashSet;

    .line 76
    .line 77
    monitor-enter v5

    .line 78
    :try_start_1
    iget-object v6, p0, La/srd;->a:Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, La/off0;

    .line 95
    .line 96
    iget-object v8, p0, La/srd;->b:Ljava/util/concurrent/Executor;

    .line 97
    .line 98
    new-instance v9, La/b1;

    .line 99
    .line 100
    const/4 v10, 0x7

    .line 101
    invoke-direct {v9, v7, v2, v4, v10}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v8, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_0
    move-exception p0

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :goto_3
    new-instance v4, La/ehq;

    .line 112
    .line 113
    const/4 v5, 0x2

    .line 114
    invoke-direct {v4, v3, v5}, La/ehq;-><init>(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    goto :goto_6

    .line 118
    :goto_4
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    throw p0

    .line 120
    :cond_3
    iget-object v3, p0, La/srd;->d:La/krd;

    .line 121
    .line 122
    invoke-virtual {v3}, La/krd;->c()La/mrd;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-nez v3, :cond_4

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_4
    :try_start_3
    iget-object v3, v3, La/mrd;->b:Lorg/json/JSONObject;

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 135
    :catch_1
    :goto_5
    if-eqz v4, :cond_5

    .line 136
    .line 137
    new-instance v3, La/ehq;

    .line 138
    .line 139
    const/4 v5, 0x1

    .line 140
    invoke-direct {v3, v4, v5}, La/ehq;-><init>(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    move-object v4, v3

    .line 144
    goto :goto_6

    .line 145
    :cond_5
    const-string v3, "FirebaseRemoteConfig"

    .line 146
    .line 147
    new-instance v4, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v5, "No value of type \'FirebaseRemoteConfigValue\' exists for parameter key \'"

    .line 150
    .line 151
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v5, "\'."

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    new-instance v4, La/ehq;

    .line 170
    .line 171
    const-string v3, ""

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    invoke-direct {v4, v3, v5}, La/ehq;-><init>(Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    :goto_6
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_6
    return-object v1
.end method

.method public final b()La/x860;
    .locals 8

    .line 1
    iget-object p0, p0, La/xgq;->g:La/msd;

    .line 2
    .line 3
    iget-object v0, p0, La/msd;->b:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    const-string v2, "last_fetch_time_in_millis"

    .line 9
    .line 10
    const-wide/16 v3, -0x1

    .line 11
    .line 12
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v2, "last_fetch_status"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    const-string v4, "fetch_timeout_in_seconds"

    .line 27
    .line 28
    const-wide/16 v5, 0x3c

    .line 29
    .line 30
    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    const-wide/16 v6, 0x0

    .line 35
    .line 36
    cmp-long v2, v4, v6

    .line 37
    .line 38
    if-ltz v2, :cond_1

    .line 39
    .line 40
    iget-object p0, p0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v2, "minimum_fetch_interval_in_seconds"

    .line 43
    .line 44
    const-wide/32 v4, 0xa8c0

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    cmp-long p0, v4, v6

    .line 52
    .line 53
    if-ltz p0, :cond_0

    .line 54
    .line 55
    new-instance p0, La/x860;

    .line 56
    .line 57
    invoke-direct {p0, v1, v3}, La/x860;-><init>(IZ)V

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "Minimum interval between fetches has to be a non-negative number. "

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, " is an invalid argument"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    const-string v1, "Fetch connection timeout has to be a non-negative number. %d is an invalid argument"

    .line 92
    .line 93
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    throw p0
.end method

.method public final c(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, La/xgq;->h:La/phf0;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, La/phf0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/esd;

    .line 7
    .line 8
    iget-object v1, v0, La/esd;->q:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 11
    :try_start_1
    iput-boolean p1, v0, La/esd;->e:Z

    .line 12
    .line 13
    iget-object v2, v0, La/esd;->g:La/grd;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iput-boolean p1, v2, La/grd;->a:Z

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_4

    .line 22
    :cond_0
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v3, 0x1a

    .line 25
    .line 26
    if-lt v2, v3, :cond_1

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 35
    .line 36
    .line 37
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    :try_start_2
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    :try_start_3
    iget-object p1, p0, La/phf0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, La/phf0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, La/esd;

    .line 54
    .line 55
    const-wide/16 v0, 0x0

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, La/esd;->e(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 64
    goto :goto_3

    .line 65
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 66
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 67
    :cond_3
    :goto_3
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :goto_4
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 70
    :try_start_8
    throw p1

    .line 71
    :goto_5
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 72
    throw p1

    .line 73
    :catchall_2
    move-exception p1

    .line 74
    goto :goto_5
.end method
