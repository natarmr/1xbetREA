.class public final La/mfr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/f04;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/mfr;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mfr;->c:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/mfr;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/f46;Landroid/view/ViewGroup;La/rrm;)V
    .locals 0

    const/4 p1, 0x6

    iput-byte p1, p0, La/mfr;->a:B

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/mfr;->b:Ljava/lang/Object;

    iput-object p3, p0, La/mfr;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tlw0;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/mfr;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mfr;->c:Ljava/lang/Object;

    .line 21
    invoke-static {p2}, La/s0x;->E(Ljava/lang/String;)V

    iput-object p2, p0, La/mfr;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vyx;La/qyx;I)V
    .locals 0

    const/16 p3, 0x9

    iput-byte p3, p0, La/mfr;->a:B

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mfr;->c:Ljava/lang/Object;

    iput-object p2, p0, La/mfr;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zvw0;La/enw0;La/zvw0;)V
    .locals 0

    const/16 p3, 0x15

    iput-byte p3, p0, La/mfr;->a:B

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/mfr;->b:Ljava/lang/Object;

    iput-object p1, p0, La/mfr;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 18
    iput-byte p3, p0, La/mfr;->a:B

    iput-object p1, p0, La/mfr;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mfr;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 19
    iput-byte p4, p0, La/mfr;->a:B

    iput-object p1, p0, La/mfr;->c:Ljava/lang/Object;

    iput-object p2, p0, La/mfr;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 12

    .line 1
    iget-object v0, p0, La/mfr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/fbv;

    .line 4
    .line 5
    iget-object p0, p0, La/mfr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/nmt0;

    .line 8
    .line 9
    iget-object v0, v0, La/fbv;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/qg00;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, v0, La/qg00;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/k7x0;

    .line 19
    .line 20
    :try_start_0
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, [B

    .line 23
    .line 24
    sget-object v1, La/bew0;->b:La/bew0;

    .line 25
    .line 26
    sget v1, La/ldw0;->a:I

    .line 27
    .line 28
    sget-object v1, La/bew0;->c:La/bew0;

    .line 29
    .line 30
    invoke-static {p0, v1}, La/t6x0;->s([BLa/bew0;)La/t6x0;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catch La/zew0; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    iget-object v1, v0, La/k7x0;->b:La/l7x0;

    .line 35
    .line 36
    iget-object v1, v1, La/l7x0;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    move v3, v2

    .line 44
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_d

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, La/y5x0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/t6x0;->r()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v4, La/l6x0;->h:La/zas0;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    if-eqz v5, :cond_b

    .line 70
    .line 71
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_2

    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_2
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    move v7, v2

    .line 84
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_c

    .line 89
    .line 90
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    check-cast v8, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v9, v4, La/zas0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    .line 100
    invoke-virtual {v9, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    check-cast v8, La/p5x0;

    .line 105
    .line 106
    if-eqz v8, :cond_3

    .line 107
    .line 108
    iget-object v8, v8, La/p5x0;->a:La/l6x0;

    .line 109
    .line 110
    iget-boolean v9, v8, La/l6x0;->d:Z

    .line 111
    .line 112
    if-nez v9, :cond_4

    .line 113
    .line 114
    move v8, v6

    .line 115
    goto :goto_6

    .line 116
    :cond_4
    iget-object v9, v8, La/l6x0;->a:La/td9;

    .line 117
    .line 118
    if-eqz v9, :cond_a

    .line 119
    .line 120
    iget-boolean v10, v9, La/td9;->a:Z

    .line 121
    .line 122
    const/4 v11, 0x3

    .line 123
    if-nez v10, :cond_6

    .line 124
    .line 125
    iget-object v9, v9, La/td9;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v9, La/un00;

    .line 128
    .line 129
    iget-byte v9, v9, La/un00;->a:B

    .line 130
    .line 131
    if-ne v9, v11, :cond_5

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    iget-object v9, v8, La/l6x0;->g:La/glt0;

    .line 135
    .line 136
    invoke-virtual {v9}, La/glt0;->l()Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_a

    .line 141
    .line 142
    :cond_6
    :goto_2
    monitor-enter v8

    .line 143
    :try_start_1
    iget-object v9, v8, La/l6x0;->a:La/td9;

    .line 144
    .line 145
    if-eqz v9, :cond_9

    .line 146
    .line 147
    iget-boolean v10, v9, La/td9;->a:Z

    .line 148
    .line 149
    if-nez v10, :cond_8

    .line 150
    .line 151
    iget-object v9, v9, La/td9;->e:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v9, La/un00;

    .line 154
    .line 155
    iget-byte v9, v9, La/un00;->a:B

    .line 156
    .line 157
    if-ne v9, v11, :cond_7

    .line 158
    .line 159
    move v9, v6

    .line 160
    goto :goto_3

    .line 161
    :cond_7
    move v9, v2

    .line 162
    :goto_3
    if-nez v9, :cond_8

    .line 163
    .line 164
    iget-object v9, v8, La/l6x0;->g:La/glt0;

    .line 165
    .line 166
    invoke-virtual {v9}, La/glt0;->l()Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-eqz v9, :cond_9

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :catchall_0
    move-exception p0

    .line 174
    goto :goto_5

    .line 175
    :cond_8
    :goto_4
    const/4 v9, 0x0

    .line 176
    iput-object v9, v8, La/l6x0;->a:La/td9;

    .line 177
    .line 178
    iget-object v9, v8, La/l6x0;->f:La/yvj;

    .line 179
    .line 180
    iget-object v9, v9, La/yvj;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 183
    .line 184
    .line 185
    :cond_9
    monitor-exit v8

    .line 186
    :cond_a
    move v8, v2

    .line 187
    goto :goto_6

    .line 188
    :goto_5
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    throw p0

    .line 190
    :goto_6
    or-int/2addr v7, v8

    .line 191
    goto :goto_1

    .line 192
    :cond_b
    :goto_7
    move v7, v2

    .line 193
    :cond_c
    if-eqz v7, :cond_1

    .line 194
    .line 195
    if-nez v3, :cond_1

    .line 196
    .line 197
    iget-object v3, v0, La/k7x0;->a:La/r7x0;

    .line 198
    .line 199
    invoke-interface {v3}, La/r7x0;->zza()V

    .line 200
    .line 201
    .line 202
    move v3, v6

    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :catch_0
    :cond_d
    return-void
.end method

.method private final b()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/mfr;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/kxw0;

    .line 7
    .line 8
    iget-object v0, v0, La/mfr;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/bzw0;

    .line 11
    .line 12
    iget-object v1, v3, La/kxw0;->g:La/fxw0;

    .line 13
    .line 14
    iget-object v9, v3, La/kxw0;->f:La/uuw0;

    .line 15
    .line 16
    iget-object v10, v3, La/kxw0;->e:La/wvw0;

    .line 17
    .line 18
    iget-object v11, v3, La/kxw0;->i:La/x6x0;

    .line 19
    .line 20
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, La/fxw0;->m1()V

    .line 24
    .line 25
    .line 26
    iget-object v12, v3, La/kxw0;->d:La/bkw0;

    .line 27
    .line 28
    iget-object v2, v12, La/p4;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, La/kxw0;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, La/kmw0;

    .line 36
    .line 37
    invoke-direct {v2, v3}, La/p4;-><init>(La/kxw0;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v2, La/p4;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, La/kxw0;

    .line 43
    .line 44
    iget v5, v4, La/kxw0;->A:I

    .line 45
    .line 46
    const/4 v13, 0x1

    .line 47
    add-int/2addr v5, v13

    .line 48
    iput v5, v4, La/kxw0;->A:I

    .line 49
    .line 50
    invoke-virtual {v2}, La/ryw0;->p1()V

    .line 51
    .line 52
    .line 53
    iput-object v2, v3, La/kxw0;->s:La/kmw0;

    .line 54
    .line 55
    iget-object v2, v0, La/bzw0;->d:Lcom/google/android/gms/internal/measurement/zzdb;

    .line 56
    .line 57
    if-nez v2, :cond_0

    .line 58
    .line 59
    const-wide/16 v6, 0x0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-wide v4, v2, Lcom/google/android/gms/internal/measurement/zzdb;->a:J

    .line 63
    .line 64
    move-wide v6, v4

    .line 65
    :goto_0
    const-string v4, ""

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzdb;->d:Landroid/os/Bundle;

    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const-string v5, "runtime_google_app_id"

    .line 75
    .line 76
    invoke-virtual {v2, v5, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move-object v8, v2

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    :goto_1
    move-object v8, v4

    .line 83
    :goto_2
    new-instance v2, La/vtw0;

    .line 84
    .line 85
    const-wide/16 v16, 0x0

    .line 86
    .line 87
    iget-wide v14, v0, La/bzw0;->c:J

    .line 88
    .line 89
    move-object v0, v4

    .line 90
    move-wide v4, v14

    .line 91
    invoke-direct/range {v2 .. v8}, La/vtw0;-><init>(La/kxw0;JJLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, La/etw0;->f1()V

    .line 95
    .line 96
    .line 97
    iput-object v2, v3, La/kxw0;->t:La/vtw0;

    .line 98
    .line 99
    new-instance v4, La/euw0;

    .line 100
    .line 101
    invoke-direct {v4, v3}, La/euw0;-><init>(La/kxw0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, La/etw0;->f1()V

    .line 105
    .line 106
    .line 107
    iput-object v4, v3, La/kxw0;->q:La/euw0;

    .line 108
    .line 109
    new-instance v4, La/a4x0;

    .line 110
    .line 111
    invoke-direct {v4, v3}, La/a4x0;-><init>(La/kxw0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, La/etw0;->f1()V

    .line 115
    .line 116
    .line 117
    iput-object v4, v3, La/kxw0;->r:La/a4x0;

    .line 118
    .line 119
    iget-boolean v4, v11, La/ryw0;->c:Z

    .line 120
    .line 121
    iget-object v5, v11, La/p4;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, La/kxw0;

    .line 124
    .line 125
    const-string v6, "Can\'t initialize twice"

    .line 126
    .line 127
    if-nez v4, :cond_48

    .line 128
    .line 129
    invoke-virtual {v11}, La/p4;->m1()V

    .line 130
    .line 131
    .line 132
    new-instance v4, Ljava/security/SecureRandom;

    .line 133
    .line 134
    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/util/Random;->nextLong()J

    .line 138
    .line 139
    .line 140
    move-result-wide v7

    .line 141
    cmp-long v14, v7, v16

    .line 142
    .line 143
    if-nez v14, :cond_3

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/util/Random;->nextLong()J

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    cmp-long v4, v7, v16

    .line 150
    .line 151
    if-nez v4, :cond_3

    .line 152
    .line 153
    iget-object v4, v11, La/p4;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, La/kxw0;

    .line 156
    .line 157
    iget-object v4, v4, La/kxw0;->f:La/uuw0;

    .line 158
    .line 159
    invoke-static {v4}, La/kxw0;->g(La/ryw0;)V

    .line 160
    .line 161
    .line 162
    iget-object v4, v4, La/uuw0;->j:La/quw0;

    .line 163
    .line 164
    const-string v14, "Utils falling back to Random for random id"

    .line 165
    .line 166
    invoke-virtual {v4, v14}, La/quw0;->a(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    iget-object v4, v11, La/x6x0;->e:Ljava/util/concurrent/atomic/AtomicLong;

    .line 170
    .line 171
    invoke-virtual {v4, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 172
    .line 173
    .line 174
    iget-object v4, v5, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 177
    .line 178
    .line 179
    iput-boolean v13, v11, La/ryw0;->c:Z

    .line 180
    .line 181
    iget-boolean v4, v10, La/ryw0;->c:Z

    .line 182
    .line 183
    if-nez v4, :cond_47

    .line 184
    .line 185
    iget-object v4, v10, La/p4;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v4, La/kxw0;

    .line 188
    .line 189
    iget-object v4, v4, La/kxw0;->a:Landroid/content/Context;

    .line 190
    .line 191
    const-string v7, "com.google.android.gms.measurement.prefs"

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    invoke-virtual {v4, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    iput-object v4, v10, La/wvw0;->d:Landroid/content/SharedPreferences;

    .line 199
    .line 200
    const-string v7, "has_been_opened"

    .line 201
    .line 202
    invoke-interface {v4, v7, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    iput-boolean v4, v10, La/wvw0;->s:Z

    .line 207
    .line 208
    if-nez v4, :cond_4

    .line 209
    .line 210
    iget-object v4, v10, La/wvw0;->d:Landroid/content/SharedPreferences;

    .line 211
    .line 212
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v4, v7, v13}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 220
    .line 221
    .line 222
    :cond_4
    new-instance v4, La/hac;

    .line 223
    .line 224
    sget-object v7, La/btw0;->d:La/atw0;

    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    invoke-virtual {v7, v14}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    check-cast v7, Ljava/lang/Long;

    .line 232
    .line 233
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 234
    .line 235
    .line 236
    move-result-wide v14

    .line 237
    move-object v7, v9

    .line 238
    move-wide/from16 v8, v16

    .line 239
    .line 240
    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 241
    .line 242
    .line 243
    move-result-wide v14

    .line 244
    invoke-direct {v4, v10, v14, v15}, La/hac;-><init>(La/wvw0;J)V

    .line 245
    .line 246
    .line 247
    iput-object v4, v10, La/wvw0;->f:La/hac;

    .line 248
    .line 249
    iget-object v4, v10, La/p4;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v4, La/kxw0;

    .line 252
    .line 253
    iget-object v4, v4, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 256
    .line 257
    .line 258
    iput-boolean v13, v10, La/ryw0;->c:Z

    .line 259
    .line 260
    iget-object v4, v3, La/kxw0;->t:La/vtw0;

    .line 261
    .line 262
    iget-boolean v8, v4, La/etw0;->c:Z

    .line 263
    .line 264
    if-nez v8, :cond_46

    .line 265
    .line 266
    iget-object v8, v4, La/p4;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v8, La/kxw0;

    .line 269
    .line 270
    iget-object v9, v8, La/kxw0;->f:La/uuw0;

    .line 271
    .line 272
    iget-object v14, v8, La/kxw0;->f:La/uuw0;

    .line 273
    .line 274
    invoke-static {v9}, La/kxw0;->g(La/ryw0;)V

    .line 275
    .line 276
    .line 277
    iget-object v9, v9, La/uuw0;->o:La/quw0;

    .line 278
    .line 279
    move-object/from16 v18, v14

    .line 280
    .line 281
    iget-wide v13, v4, La/vtw0;->k:J

    .line 282
    .line 283
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    move-object v14, v1

    .line 288
    move-object/from16 v19, v2

    .line 289
    .line 290
    iget-wide v1, v4, La/vtw0;->j:J

    .line 291
    .line 292
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    const-string v2, "sdkVersion bundled with app, dynamiteVersion"

    .line 297
    .line 298
    invoke-virtual {v9, v13, v1, v2}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    iget-object v1, v8, La/kxw0;->a:Landroid/content/Context;

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    const-string v20, "Unknown"

    .line 312
    .line 313
    const-string v21, "unknown"

    .line 314
    .line 315
    if-nez v9, :cond_5

    .line 316
    .line 317
    invoke-static/range {v18 .. v18}, La/kxw0;->g(La/ryw0;)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v13, v18

    .line 321
    .line 322
    iget-object v15, v13, La/uuw0;->g:La/quw0;

    .line 323
    .line 324
    move-object/from16 v23, v6

    .line 325
    .line 326
    invoke-static {v2}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    move-object/from16 v24, v7

    .line 331
    .line 332
    const-string v7, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 333
    .line 334
    invoke-virtual {v15, v6, v7}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_3
    move-object/from16 v25, v9

    .line 338
    .line 339
    move-object/from16 v6, v20

    .line 340
    .line 341
    move-object v15, v6

    .line 342
    :goto_4
    move-object/from16 v9, v21

    .line 343
    .line 344
    const/high16 v7, -0x80000000

    .line 345
    .line 346
    goto/16 :goto_b

    .line 347
    .line 348
    :cond_5
    move-object/from16 v23, v6

    .line 349
    .line 350
    move-object/from16 v24, v7

    .line 351
    .line 352
    move-object/from16 v13, v18

    .line 353
    .line 354
    :try_start_0
    invoke-virtual {v9, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 358
    goto :goto_5

    .line 359
    :catch_0
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 360
    .line 361
    .line 362
    iget-object v6, v13, La/uuw0;->g:La/quw0;

    .line 363
    .line 364
    invoke-static {v2}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    const-string v15, "Error retrieving app installer package name. appId"

    .line 369
    .line 370
    invoke-virtual {v6, v7, v15}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v6, v21

    .line 374
    .line 375
    :goto_5
    if-nez v6, :cond_6

    .line 376
    .line 377
    const-string v6, "manual_install"

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_6
    const-string v7, "com.android.vending"

    .line 381
    .line 382
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    if-eqz v7, :cond_7

    .line 387
    .line 388
    move-object v6, v0

    .line 389
    :cond_7
    :goto_6
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    const/4 v15, 0x0

    .line 394
    invoke-virtual {v9, v7, v15}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    if-eqz v7, :cond_9

    .line 399
    .line 400
    iget-object v15, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 401
    .line 402
    invoke-virtual {v9, v15}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 403
    .line 404
    .line 405
    move-result-object v15

    .line 406
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 407
    .line 408
    .line 409
    move-result v21

    .line 410
    if-nez v21, :cond_8

    .line 411
    .line 412
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v15
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 416
    :goto_7
    move-object/from16 v21, v6

    .line 417
    .line 418
    goto :goto_8

    .line 419
    :catch_1
    move-object/from16 v21, v6

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_8
    move-object/from16 v15, v20

    .line 423
    .line 424
    goto :goto_7

    .line 425
    :goto_8
    :try_start_2
    iget-object v6, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    .line 426
    .line 427
    :try_start_3
    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    .line 428
    .line 429
    move-object/from16 v25, v9

    .line 430
    .line 431
    move-object/from16 v9, v21

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :catch_2
    move-object/from16 v20, v6

    .line 435
    .line 436
    goto :goto_a

    .line 437
    :cond_9
    move-object/from16 v21, v6

    .line 438
    .line 439
    goto :goto_3

    .line 440
    :goto_9
    move-object/from16 v15, v20

    .line 441
    .line 442
    :catch_3
    :goto_a
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 443
    .line 444
    .line 445
    iget-object v6, v13, La/uuw0;->g:La/quw0;

    .line 446
    .line 447
    invoke-static {v2}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    move-object/from16 v25, v9

    .line 452
    .line 453
    const-string v9, "Error retrieving package info. appId, appName"

    .line 454
    .line 455
    invoke-virtual {v6, v7, v15, v9}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    move-object/from16 v6, v20

    .line 459
    .line 460
    goto :goto_4

    .line 461
    :goto_b
    iput-object v2, v4, La/vtw0;->d:Ljava/lang/String;

    .line 462
    .line 463
    iput-object v9, v4, La/vtw0;->g:Ljava/lang/String;

    .line 464
    .line 465
    iput-object v6, v4, La/vtw0;->e:Ljava/lang/String;

    .line 466
    .line 467
    iput v7, v4, La/vtw0;->f:I

    .line 468
    .line 469
    iput-object v15, v4, La/vtw0;->h:Ljava/lang/String;

    .line 470
    .line 471
    const-wide/16 v6, 0x0

    .line 472
    .line 473
    iput-wide v6, v4, La/vtw0;->i:J

    .line 474
    .line 475
    invoke-virtual {v8}, La/kxw0;->b()I

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-eqz v6, :cond_10

    .line 480
    .line 481
    const/4 v15, 0x1

    .line 482
    if-eq v6, v15, :cond_f

    .line 483
    .line 484
    const/4 v7, 0x3

    .line 485
    if-eq v6, v7, :cond_e

    .line 486
    .line 487
    const/4 v7, 0x4

    .line 488
    if-eq v6, v7, :cond_d

    .line 489
    .line 490
    const/4 v7, 0x6

    .line 491
    if-eq v6, v7, :cond_c

    .line 492
    .line 493
    const/4 v7, 0x7

    .line 494
    if-eq v6, v7, :cond_b

    .line 495
    .line 496
    const/16 v7, 0x8

    .line 497
    .line 498
    if-eq v6, v7, :cond_a

    .line 499
    .line 500
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 501
    .line 502
    .line 503
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 504
    .line 505
    const-string v9, "App measurement disabled"

    .line 506
    .line 507
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 511
    .line 512
    .line 513
    iget-object v7, v13, La/uuw0;->h:La/quw0;

    .line 514
    .line 515
    const-string v9, "Invalid scion state in identity"

    .line 516
    .line 517
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_a
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 522
    .line 523
    .line 524
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 525
    .line 526
    const-string v9, "App measurement disabled due to denied storage consent"

    .line 527
    .line 528
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_b
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 533
    .line 534
    .line 535
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 536
    .line 537
    const-string v9, "App measurement disabled via the global data collection setting"

    .line 538
    .line 539
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    goto :goto_c

    .line 543
    :cond_c
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 544
    .line 545
    .line 546
    iget-object v7, v13, La/uuw0;->l:La/quw0;

    .line 547
    .line 548
    const-string v9, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 549
    .line 550
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_d
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 555
    .line 556
    .line 557
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 558
    .line 559
    const-string v9, "App measurement disabled via the manifest"

    .line 560
    .line 561
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    goto :goto_c

    .line 565
    :cond_e
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 566
    .line 567
    .line 568
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 569
    .line 570
    const-string v9, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 571
    .line 572
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    goto :goto_c

    .line 576
    :cond_f
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 577
    .line 578
    .line 579
    iget-object v7, v13, La/uuw0;->m:La/quw0;

    .line 580
    .line 581
    const-string v9, "App measurement deactivated via the manifest"

    .line 582
    .line 583
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_10
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 588
    .line 589
    .line 590
    iget-object v7, v13, La/uuw0;->o:La/quw0;

    .line 591
    .line 592
    const-string v9, "App measurement collection enabled"

    .line 593
    .line 594
    invoke-virtual {v7, v9}, La/quw0;->a(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    :goto_c
    iput-object v0, v4, La/vtw0;->p:Ljava/lang/String;

    .line 598
    .line 599
    :try_start_4
    iget-object v7, v4, La/vtw0;->n:Ljava/lang/String;

    .line 600
    .line 601
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    if-nez v9, :cond_11

    .line 606
    .line 607
    goto :goto_d

    .line 608
    :cond_11
    iget-object v7, v8, La/kxw0;->p:Ljava/lang/String;

    .line 609
    .line 610
    invoke-static {v1, v7}, La/o5n0;->w(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    :goto_d
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    if-eqz v9, :cond_12

    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_12
    move-object v0, v7

    .line 622
    :goto_e
    iput-object v0, v4, La/vtw0;->p:Ljava/lang/String;

    .line 623
    .line 624
    if-nez v6, :cond_13

    .line 625
    .line 626
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 627
    .line 628
    .line 629
    iget-object v0, v13, La/uuw0;->o:La/quw0;

    .line 630
    .line 631
    const-string v6, "App measurement enabled for app package, google app id"

    .line 632
    .line 633
    iget-object v7, v4, La/vtw0;->d:Ljava/lang/String;

    .line 634
    .line 635
    iget-object v9, v4, La/vtw0;->p:Ljava/lang/String;

    .line 636
    .line 637
    invoke-virtual {v0, v7, v9, v6}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 638
    .line 639
    .line 640
    :cond_13
    :goto_f
    const/4 v2, 0x0

    .line 641
    goto :goto_10

    .line 642
    :catch_4
    move-exception v0

    .line 643
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 644
    .line 645
    .line 646
    iget-object v6, v13, La/uuw0;->g:La/quw0;

    .line 647
    .line 648
    invoke-static {v2}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    const-string v7, "Fetching Google App Id failed with exception. appId"

    .line 653
    .line 654
    invoke-virtual {v6, v2, v0, v7}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    goto :goto_f

    .line 658
    :goto_10
    iput-object v2, v4, La/vtw0;->l:Ljava/util/List;

    .line 659
    .line 660
    iget-object v0, v8, La/kxw0;->d:La/bkw0;

    .line 661
    .line 662
    iget-object v2, v0, La/p4;->b:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v2, La/kxw0;

    .line 665
    .line 666
    const-string v6, "analytics.safelisted_events"

    .line 667
    .line 668
    invoke-static {v6}, La/s0x;->E(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, La/bkw0;->y1()Landroid/os/Bundle;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    if-nez v0, :cond_14

    .line 676
    .line 677
    iget-object v0, v2, La/kxw0;->f:La/uuw0;

    .line 678
    .line 679
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 680
    .line 681
    .line 682
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 683
    .line 684
    const-string v6, "Failed to load metadata: Metadata bundle is null"

    .line 685
    .line 686
    invoke-virtual {v0, v6}, La/quw0;->a(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    :goto_11
    const/4 v0, 0x0

    .line 690
    goto :goto_12

    .line 691
    :cond_14
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    if-nez v7, :cond_15

    .line 696
    .line 697
    goto :goto_11

    .line 698
    :cond_15
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    :goto_12
    if-eqz v0, :cond_16

    .line 707
    .line 708
    :try_start_5
    iget-object v6, v2, La/kxw0;->a:Landroid/content/Context;

    .line 709
    .line 710
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    if-nez v0, :cond_17

    .line 723
    .line 724
    :cond_16
    :goto_13
    const/4 v0, 0x0

    .line 725
    goto :goto_14

    .line 726
    :cond_17
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v0
    :try_end_5
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 730
    goto :goto_14

    .line 731
    :catch_5
    move-exception v0

    .line 732
    iget-object v2, v2, La/kxw0;->f:La/uuw0;

    .line 733
    .line 734
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 735
    .line 736
    .line 737
    iget-object v2, v2, La/uuw0;->g:La/quw0;

    .line 738
    .line 739
    const-string v6, "Failed to load string array from metadata: resource not found"

    .line 740
    .line 741
    invoke-virtual {v2, v0, v6}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    goto :goto_13

    .line 745
    :goto_14
    if-nez v0, :cond_18

    .line 746
    .line 747
    goto :goto_15

    .line 748
    :cond_18
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    if-eqz v2, :cond_19

    .line 753
    .line 754
    invoke-static {v13}, La/kxw0;->g(La/ryw0;)V

    .line 755
    .line 756
    .line 757
    iget-object v0, v13, La/uuw0;->l:La/quw0;

    .line 758
    .line 759
    const-string v2, "Safelisted event list is empty. Ignoring"

    .line 760
    .line 761
    invoke-virtual {v0, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    goto :goto_16

    .line 765
    :cond_19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v6

    .line 773
    if-eqz v6, :cond_1b

    .line 774
    .line 775
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    check-cast v6, Ljava/lang/String;

    .line 780
    .line 781
    iget-object v7, v8, La/kxw0;->i:La/x6x0;

    .line 782
    .line 783
    invoke-static {v7}, La/kxw0;->e(La/p4;)V

    .line 784
    .line 785
    .line 786
    const-string v9, "safelisted event"

    .line 787
    .line 788
    invoke-virtual {v7, v9, v6}, La/x6x0;->q2(Ljava/lang/String;Ljava/lang/String;)Z

    .line 789
    .line 790
    .line 791
    move-result v6

    .line 792
    if-nez v6, :cond_1a

    .line 793
    .line 794
    goto :goto_16

    .line 795
    :cond_1b
    :goto_15
    iput-object v0, v4, La/vtw0;->l:Ljava/util/List;

    .line 796
    .line 797
    :goto_16
    if-eqz v25, :cond_1c

    .line 798
    .line 799
    invoke-static {v1}, La/cjx;->U(Landroid/content/Context;)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    iput v0, v4, La/vtw0;->o:I

    .line 804
    .line 805
    goto :goto_17

    .line 806
    :cond_1c
    const/4 v1, 0x0

    .line 807
    iput v1, v4, La/vtw0;->o:I

    .line 808
    .line 809
    :goto_17
    iget-object v0, v4, La/p4;->b:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, La/kxw0;

    .line 812
    .line 813
    iget-object v0, v0, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 814
    .line 815
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 816
    .line 817
    .line 818
    const/4 v15, 0x1

    .line 819
    iput-boolean v15, v4, La/etw0;->c:Z

    .line 820
    .line 821
    new-instance v0, La/o1x0;

    .line 822
    .line 823
    invoke-direct {v0, v3}, La/p4;-><init>(La/kxw0;)V

    .line 824
    .line 825
    .line 826
    iget-object v1, v0, La/p4;->b:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v1, La/kxw0;

    .line 829
    .line 830
    iget v2, v1, La/kxw0;->A:I

    .line 831
    .line 832
    add-int/2addr v2, v15

    .line 833
    iput v2, v1, La/kxw0;->A:I

    .line 834
    .line 835
    invoke-virtual {v0}, La/etw0;->f1()V

    .line 836
    .line 837
    .line 838
    iput-object v0, v3, La/kxw0;->u:La/o1x0;

    .line 839
    .line 840
    iget-boolean v2, v0, La/etw0;->c:Z

    .line 841
    .line 842
    if-nez v2, :cond_45

    .line 843
    .line 844
    iget-object v2, v0, La/p4;->b:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v2, La/kxw0;

    .line 847
    .line 848
    iget-object v2, v2, La/kxw0;->a:Landroid/content/Context;

    .line 849
    .line 850
    const-string v4, "jobscheduler"

    .line 851
    .line 852
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    check-cast v2, Landroid/app/job/JobScheduler;

    .line 857
    .line 858
    iput-object v2, v0, La/o1x0;->d:Landroid/app/job/JobScheduler;

    .line 859
    .line 860
    iget-object v1, v1, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 861
    .line 862
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 863
    .line 864
    .line 865
    const/4 v15, 0x1

    .line 866
    iput-boolean v15, v0, La/etw0;->c:Z

    .line 867
    .line 868
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 869
    .line 870
    .line 871
    move-object/from16 v7, v24

    .line 872
    .line 873
    iget-object v0, v7, La/uuw0;->n:La/quw0;

    .line 874
    .line 875
    iget-object v1, v7, La/uuw0;->m:La/quw0;

    .line 876
    .line 877
    iget-object v2, v7, La/uuw0;->o:La/quw0;

    .line 878
    .line 879
    iget-object v4, v7, La/uuw0;->g:La/quw0;

    .line 880
    .line 881
    invoke-virtual {v12}, La/bkw0;->s1()V

    .line 882
    .line 883
    .line 884
    const-wide/32 v8, 0x274e8

    .line 885
    .line 886
    .line 887
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    const-string v8, "App measurement initialized, version"

    .line 892
    .line 893
    invoke-virtual {v1, v6, v8}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 897
    .line 898
    .line 899
    const-string v6, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 900
    .line 901
    invoke-virtual {v1, v6}, La/quw0;->a(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v19 .. v19}, La/vtw0;->r1()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v6

    .line 908
    iget-object v8, v12, La/bkw0;->d:Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v11, v6, v8}, La/x6x0;->R1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 911
    .line 912
    .line 913
    move-result v8

    .line 914
    if-eqz v8, :cond_1d

    .line 915
    .line 916
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 917
    .line 918
    .line 919
    const-string v6, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 920
    .line 921
    invoke-virtual {v1, v6}, La/quw0;->a(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    goto :goto_18

    .line 925
    :cond_1d
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 926
    .line 927
    .line 928
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v6

    .line 932
    const-string v8, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 933
    .line 934
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v6

    .line 938
    invoke-virtual {v1, v6}, La/quw0;->a(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    :goto_18
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 942
    .line 943
    .line 944
    const-string v6, "Debug-level message logging enabled"

    .line 945
    .line 946
    invoke-virtual {v0, v6}, La/quw0;->a(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    iget v6, v3, La/kxw0;->A:I

    .line 950
    .line 951
    iget-object v8, v3, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 952
    .line 953
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 954
    .line 955
    .line 956
    move-result v9

    .line 957
    if-eq v6, v9, :cond_1e

    .line 958
    .line 959
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 960
    .line 961
    .line 962
    iget v6, v3, La/kxw0;->A:I

    .line 963
    .line 964
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 965
    .line 966
    .line 967
    move-result-object v6

    .line 968
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 969
    .line 970
    .line 971
    move-result v8

    .line 972
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 973
    .line 974
    .line 975
    move-result-object v8

    .line 976
    const-string v9, "Not all components initialized"

    .line 977
    .line 978
    invoke-virtual {v4, v6, v8, v9}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    :cond_1e
    const/4 v15, 0x1

    .line 982
    iput-boolean v15, v3, La/kxw0;->v:Z

    .line 983
    .line 984
    iget-wide v8, v3, La/kxw0;->Z:J

    .line 985
    .line 986
    iget-object v6, v3, La/kxw0;->m:La/b1x0;

    .line 987
    .line 988
    invoke-static {v14}, La/kxw0;->g(La/ryw0;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v14}, La/fxw0;->m1()V

    .line 992
    .line 993
    .line 994
    iget-object v13, v3, La/kxw0;->u:La/o1x0;

    .line 995
    .line 996
    invoke-static {v13}, La/kxw0;->d(La/zrw0;)V

    .line 997
    .line 998
    .line 999
    iget-object v13, v3, La/kxw0;->u:La/o1x0;

    .line 1000
    .line 1001
    invoke-virtual {v13}, La/o1x0;->q1()I

    .line 1002
    .line 1003
    .line 1004
    move-result v13

    .line 1005
    invoke-static {}, La/miw0;->a()V

    .line 1006
    .line 1007
    .line 1008
    sget-object v14, La/btw0;->P0:La/atw0;

    .line 1009
    .line 1010
    const/4 v15, 0x0

    .line 1011
    invoke-virtual {v12, v15, v14}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v14

    .line 1015
    const/4 v15, 0x2

    .line 1016
    if-ne v13, v15, :cond_1f

    .line 1017
    .line 1018
    const/4 v13, 0x1

    .line 1019
    goto :goto_19

    .line 1020
    :cond_1f
    const/4 v13, 0x0

    .line 1021
    :goto_19
    const-wide/16 v19, 0x1

    .line 1022
    .line 1023
    if-eqz v14, :cond_20

    .line 1024
    .line 1025
    invoke-virtual {v11}, La/p4;->m1()V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v11}, La/x6x0;->J1()J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v21

    .line 1032
    cmp-long v14, v21, v19

    .line 1033
    .line 1034
    if-nez v14, :cond_20

    .line 1035
    .line 1036
    goto :goto_1a

    .line 1037
    :cond_20
    if-eqz v13, :cond_21

    .line 1038
    .line 1039
    const/4 v13, 0x1

    .line 1040
    :goto_1a
    invoke-virtual {v11}, La/p4;->m1()V

    .line 1041
    .line 1042
    .line 1043
    new-instance v14, Landroid/content/IntentFilter;

    .line 1044
    .line 1045
    invoke-direct {v14}, Landroid/content/IntentFilter;-><init>()V

    .line 1046
    .line 1047
    .line 1048
    const-string v15, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 1049
    .line 1050
    invoke-virtual {v14, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    const-string v15, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 1054
    .line 1055
    invoke-virtual {v14, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    new-instance v15, La/md3;

    .line 1059
    .line 1060
    move/from16 v22, v13

    .line 1061
    .line 1062
    const/16 v13, 0x9

    .line 1063
    .line 1064
    move-object/from16 v24, v7

    .line 1065
    .line 1066
    const/4 v7, 0x0

    .line 1067
    invoke-direct {v15, v5, v13, v7}, La/md3;-><init>(Ljava/lang/Object;BZ)V

    .line 1068
    .line 1069
    .line 1070
    iget-object v7, v5, La/kxw0;->a:Landroid/content/Context;

    .line 1071
    .line 1072
    invoke-static {v7, v15, v14}, La/jiq0;->t0(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1073
    .line 1074
    .line 1075
    iget-object v7, v5, La/kxw0;->f:La/uuw0;

    .line 1076
    .line 1077
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 1078
    .line 1079
    .line 1080
    iget-object v7, v7, La/uuw0;->n:La/quw0;

    .line 1081
    .line 1082
    const-string v13, "Registered app receiver"

    .line 1083
    .line 1084
    invoke-virtual {v7, v13}, La/quw0;->a(Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    if-eqz v22, :cond_22

    .line 1088
    .line 1089
    iget-object v7, v3, La/kxw0;->u:La/o1x0;

    .line 1090
    .line 1091
    invoke-static {v7}, La/kxw0;->d(La/zrw0;)V

    .line 1092
    .line 1093
    .line 1094
    iget-object v7, v3, La/kxw0;->u:La/o1x0;

    .line 1095
    .line 1096
    sget-object v13, La/btw0;->C:La/atw0;

    .line 1097
    .line 1098
    const/4 v15, 0x0

    .line 1099
    invoke-virtual {v13, v15}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v13

    .line 1103
    check-cast v13, Ljava/lang/Long;

    .line 1104
    .line 1105
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v13

    .line 1109
    invoke-virtual {v7, v13, v14}, La/o1x0;->p1(J)V

    .line 1110
    .line 1111
    .line 1112
    goto :goto_1b

    .line 1113
    :cond_21
    move-object/from16 v24, v7

    .line 1114
    .line 1115
    :cond_22
    :goto_1b
    iget-object v7, v10, La/wvw0;->h:La/o24;

    .line 1116
    .line 1117
    invoke-virtual {v10}, La/wvw0;->t1()La/xyw0;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v13

    .line 1121
    iget v14, v13, La/xyw0;->b:I

    .line 1122
    .line 1123
    const-string v15, "google_analytics_default_allow_ad_storage"

    .line 1124
    .line 1125
    move-object/from16 v22, v13

    .line 1126
    .line 1127
    const/4 v13, 0x0

    .line 1128
    invoke-virtual {v12, v15, v13}, La/bkw0;->C1(Ljava/lang/String;Z)La/tyw0;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v15

    .line 1132
    move-object/from16 v25, v5

    .line 1133
    .line 1134
    const-string v5, "google_analytics_default_allow_analytics_storage"

    .line 1135
    .line 1136
    invoke-virtual {v12, v5, v13}, La/bkw0;->C1(Ljava/lang/String;Z)La/tyw0;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    sget-object v13, La/wyw0;->c:La/wyw0;

    .line 1141
    .line 1142
    move-object/from16 v26, v7

    .line 1143
    .line 1144
    const-class v7, La/wyw0;

    .line 1145
    .line 1146
    move-object/from16 v27, v1

    .line 1147
    .line 1148
    sget-object v1, La/tyw0;->b:La/tyw0;

    .line 1149
    .line 1150
    if-ne v15, v1, :cond_23

    .line 1151
    .line 1152
    if-eq v5, v1, :cond_24

    .line 1153
    .line 1154
    :cond_23
    move-object/from16 v28, v3

    .line 1155
    .line 1156
    goto :goto_1c

    .line 1157
    :cond_24
    move-object/from16 v28, v3

    .line 1158
    .line 1159
    move-object/from16 v29, v4

    .line 1160
    .line 1161
    move-object/from16 v30, v11

    .line 1162
    .line 1163
    goto :goto_1d

    .line 1164
    :goto_1c
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v3

    .line 1168
    move-object/from16 v29, v4

    .line 1169
    .line 1170
    const-string v4, "consent_source"

    .line 1171
    .line 1172
    move-object/from16 v30, v11

    .line 1173
    .line 1174
    const/16 v11, 0x64

    .line 1175
    .line 1176
    invoke-interface {v3, v4, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1177
    .line 1178
    .line 1179
    move-result v3

    .line 1180
    const/16 v4, -0xa

    .line 1181
    .line 1182
    invoke-static {v4, v3}, La/xyw0;->l(II)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    if-eqz v3, :cond_25

    .line 1187
    .line 1188
    new-instance v3, Ljava/util/EnumMap;

    .line 1189
    .line 1190
    invoke-direct {v3, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1191
    .line 1192
    .line 1193
    sget-object v11, La/wyw0;->b:La/wyw0;

    .line 1194
    .line 1195
    invoke-virtual {v3, v11, v15}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v3, v13, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    new-instance v5, La/xyw0;

    .line 1202
    .line 1203
    invoke-direct {v5, v3, v4}, La/xyw0;-><init>(Ljava/util/EnumMap;I)V

    .line 1204
    .line 1205
    .line 1206
    goto :goto_20

    .line 1207
    :cond_25
    :goto_1d
    invoke-virtual/range {v28 .. v28}, La/kxw0;->k()La/vtw0;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v3

    .line 1211
    invoke-virtual {v3}, La/vtw0;->s1()Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v3

    .line 1215
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v3

    .line 1219
    if-nez v3, :cond_26

    .line 1220
    .line 1221
    if-eqz v14, :cond_27

    .line 1222
    .line 1223
    const/16 v3, 0x1e

    .line 1224
    .line 1225
    if-eq v14, v3, :cond_27

    .line 1226
    .line 1227
    const/16 v3, 0xa

    .line 1228
    .line 1229
    if-eq v14, v3, :cond_27

    .line 1230
    .line 1231
    const/16 v3, 0x28

    .line 1232
    .line 1233
    if-ne v14, v3, :cond_26

    .line 1234
    .line 1235
    goto :goto_1f

    .line 1236
    :cond_26
    :goto_1e
    const/4 v5, 0x0

    .line 1237
    goto :goto_20

    .line 1238
    :cond_27
    :goto_1f
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1239
    .line 1240
    .line 1241
    new-instance v3, La/xyw0;

    .line 1242
    .line 1243
    const/16 v4, -0xa

    .line 1244
    .line 1245
    invoke-direct {v3, v4}, La/xyw0;-><init>(I)V

    .line 1246
    .line 1247
    .line 1248
    const/4 v15, 0x0

    .line 1249
    invoke-virtual {v6, v3, v15}, La/b1x0;->H1(La/xyw0;Z)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_1e

    .line 1253
    :goto_20
    if-eqz v5, :cond_28

    .line 1254
    .line 1255
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1256
    .line 1257
    .line 1258
    const/4 v15, 0x1

    .line 1259
    invoke-virtual {v6, v5, v15}, La/b1x0;->H1(La/xyw0;Z)V

    .line 1260
    .line 1261
    .line 1262
    :goto_21
    const/4 v3, 0x2

    .line 1263
    goto :goto_22

    .line 1264
    :cond_28
    move-object/from16 v5, v22

    .line 1265
    .line 1266
    goto :goto_21

    .line 1267
    :goto_22
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1268
    .line 1269
    .line 1270
    iget-object v4, v6, La/p4;->b:Ljava/lang/Object;

    .line 1271
    .line 1272
    check-cast v4, La/kxw0;

    .line 1273
    .line 1274
    invoke-virtual {v6, v5}, La/b1x0;->L1(La/xyw0;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    const-string v11, "dma_consent_settings"

    .line 1285
    .line 1286
    const/4 v14, 0x0

    .line 1287
    invoke-interface {v5, v11, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v5

    .line 1291
    invoke-static {v5}, La/jmw0;->b(Ljava/lang/String;)La/jmw0;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v5

    .line 1295
    iget v5, v5, La/jmw0;->a:I

    .line 1296
    .line 1297
    const-string v11, "google_analytics_default_allow_ad_personalization_signals"

    .line 1298
    .line 1299
    const/4 v15, 0x1

    .line 1300
    invoke-virtual {v12, v11, v15}, La/bkw0;->C1(Ljava/lang/String;Z)La/tyw0;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v11

    .line 1304
    if-eq v11, v1, :cond_29

    .line 1305
    .line 1306
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1307
    .line 1308
    .line 1309
    const-string v14, "Default ad personalization consent from Manifest"

    .line 1310
    .line 1311
    invoke-virtual {v2, v11, v14}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1312
    .line 1313
    .line 1314
    :cond_29
    const-string v11, "google_analytics_default_allow_ad_user_data"

    .line 1315
    .line 1316
    invoke-virtual {v12, v11, v15}, La/bkw0;->C1(Ljava/lang/String;Z)La/tyw0;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v11

    .line 1320
    if-eq v11, v1, :cond_2a

    .line 1321
    .line 1322
    const/16 v1, -0xa

    .line 1323
    .line 1324
    invoke-static {v1, v5}, La/xyw0;->l(II)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v14

    .line 1328
    if-eqz v14, :cond_2a

    .line 1329
    .line 1330
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1331
    .line 1332
    .line 1333
    new-instance v5, Ljava/util/EnumMap;

    .line 1334
    .line 1335
    invoke-direct {v5, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1336
    .line 1337
    .line 1338
    sget-object v7, La/wyw0;->d:La/wyw0;

    .line 1339
    .line 1340
    invoke-virtual {v5, v7, v11}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    new-instance v7, La/jmw0;

    .line 1344
    .line 1345
    const/4 v14, 0x0

    .line 1346
    invoke-direct {v7, v5, v1, v14, v14}, La/jmw0;-><init>(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v6, v7, v15}, La/b1x0;->G1(La/jmw0;Z)V

    .line 1350
    .line 1351
    .line 1352
    goto :goto_23

    .line 1353
    :cond_2a
    invoke-virtual/range {v28 .. v28}, La/kxw0;->k()La/vtw0;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    invoke-virtual {v1}, La/vtw0;->s1()Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v1

    .line 1361
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v1

    .line 1365
    if-nez v1, :cond_2c

    .line 1366
    .line 1367
    if-eqz v5, :cond_2b

    .line 1368
    .line 1369
    const/16 v1, 0x1e

    .line 1370
    .line 1371
    if-ne v5, v1, :cond_2c

    .line 1372
    .line 1373
    :cond_2b
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1374
    .line 1375
    .line 1376
    new-instance v1, La/jmw0;

    .line 1377
    .line 1378
    const/16 v5, -0xa

    .line 1379
    .line 1380
    const/4 v14, 0x0

    .line 1381
    invoke-direct {v1, v5, v14, v14, v14}, La/jmw0;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 1382
    .line 1383
    .line 1384
    const/4 v15, 0x1

    .line 1385
    invoke-virtual {v6, v1, v15}, La/b1x0;->G1(La/jmw0;Z)V

    .line 1386
    .line 1387
    .line 1388
    :cond_2c
    :goto_23
    const-string v1, "google_analytics_tcf_data_enabled"

    .line 1389
    .line 1390
    invoke-virtual {v12, v1}, La/bkw0;->z1(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    if-eqz v1, :cond_2d

    .line 1395
    .line 1396
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v1

    .line 1400
    if-eqz v1, :cond_2f

    .line 1401
    .line 1402
    :cond_2d
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1403
    .line 1404
    .line 1405
    const-string v1, "TCF client enabled."

    .line 1406
    .line 1407
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v6}, La/zrw0;->m1()V

    .line 1414
    .line 1415
    .line 1416
    iget-object v0, v4, La/kxw0;->f:La/uuw0;

    .line 1417
    .line 1418
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 1419
    .line 1420
    .line 1421
    iget-object v0, v0, La/uuw0;->n:La/quw0;

    .line 1422
    .line 1423
    const-string v1, "Register tcfPrefChangeListener."

    .line 1424
    .line 1425
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 1426
    .line 1427
    .line 1428
    iget-object v0, v6, La/b1x0;->u:La/x0x0;

    .line 1429
    .line 1430
    if-nez v0, :cond_2e

    .line 1431
    .line 1432
    new-instance v0, La/ezw0;

    .line 1433
    .line 1434
    invoke-direct {v0, v6, v4, v3}, La/ezw0;-><init>(La/b1x0;La/syw0;B)V

    .line 1435
    .line 1436
    .line 1437
    iput-object v0, v6, La/b1x0;->v:La/ezw0;

    .line 1438
    .line 1439
    new-instance v0, La/x0x0;

    .line 1440
    .line 1441
    invoke-direct {v0, v6}, La/x0x0;-><init>(La/b1x0;)V

    .line 1442
    .line 1443
    .line 1444
    iput-object v0, v6, La/b1x0;->u:La/x0x0;

    .line 1445
    .line 1446
    :cond_2e
    iget-object v0, v4, La/kxw0;->e:La/wvw0;

    .line 1447
    .line 1448
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v0}, La/wvw0;->r1()Landroid/content/SharedPreferences;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    iget-object v1, v6, La/b1x0;->u:La/x0x0;

    .line 1456
    .line 1457
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v6}, La/b1x0;->r1()V

    .line 1464
    .line 1465
    .line 1466
    :cond_2f
    iget-object v0, v10, La/wvw0;->g:La/rvw0;

    .line 1467
    .line 1468
    invoke-virtual {v0}, La/rvw0;->a()J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v21

    .line 1472
    const-wide/16 v16, 0x0

    .line 1473
    .line 1474
    cmp-long v1, v21, v16

    .line 1475
    .line 1476
    if-nez v1, :cond_30

    .line 1477
    .line 1478
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1479
    .line 1480
    .line 1481
    const-string v1, "Persisting first open"

    .line 1482
    .line 1483
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    invoke-virtual {v2, v3, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v0, v8, v9}, La/rvw0;->b(J)V

    .line 1491
    .line 1492
    .line 1493
    :cond_30
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1494
    .line 1495
    .line 1496
    iget-object v1, v6, La/b1x0;->r:La/zlt0;

    .line 1497
    .line 1498
    invoke-virtual {v1}, La/zlt0;->t()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v3

    .line 1502
    if-eqz v3, :cond_31

    .line 1503
    .line 1504
    invoke-virtual {v1}, La/zlt0;->s()Z

    .line 1505
    .line 1506
    .line 1507
    move-result v3

    .line 1508
    if-eqz v3, :cond_31

    .line 1509
    .line 1510
    iget-object v1, v1, La/zlt0;->b:Ljava/lang/Object;

    .line 1511
    .line 1512
    check-cast v1, La/kxw0;

    .line 1513
    .line 1514
    iget-object v1, v1, La/kxw0;->e:La/wvw0;

    .line 1515
    .line 1516
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 1517
    .line 1518
    .line 1519
    iget-object v1, v1, La/wvw0;->x:La/o24;

    .line 1520
    .line 1521
    const/4 v14, 0x0

    .line 1522
    invoke-virtual {v1, v14}, La/o24;->u(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    :cond_31
    invoke-virtual/range {v28 .. v28}, La/kxw0;->c()Z

    .line 1526
    .line 1527
    .line 1528
    move-result v1

    .line 1529
    if-nez v1, :cond_37

    .line 1530
    .line 1531
    invoke-virtual/range {v28 .. v28}, La/kxw0;->a()Z

    .line 1532
    .line 1533
    .line 1534
    move-result v0

    .line 1535
    if-eqz v0, :cond_36

    .line 1536
    .line 1537
    const-string v0, "android.permission.INTERNET"

    .line 1538
    .line 1539
    move-object/from16 v1, v30

    .line 1540
    .line 1541
    invoke-virtual {v1, v0}, La/x6x0;->P1(Ljava/lang/String;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v0

    .line 1545
    if-nez v0, :cond_32

    .line 1546
    .line 1547
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1548
    .line 1549
    .line 1550
    const-string v0, "App is missing INTERNET permission"

    .line 1551
    .line 1552
    move-object/from16 v3, v29

    .line 1553
    .line 1554
    invoke-virtual {v3, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 1555
    .line 1556
    .line 1557
    goto :goto_24

    .line 1558
    :cond_32
    move-object/from16 v3, v29

    .line 1559
    .line 1560
    :goto_24
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 1561
    .line 1562
    invoke-virtual {v1, v0}, La/x6x0;->P1(Ljava/lang/String;)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v0

    .line 1566
    if-nez v0, :cond_33

    .line 1567
    .line 1568
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1569
    .line 1570
    .line 1571
    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    .line 1572
    .line 1573
    invoke-virtual {v3, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 1574
    .line 1575
    .line 1576
    :cond_33
    move-object/from16 v5, v28

    .line 1577
    .line 1578
    iget-object v0, v5, La/kxw0;->a:Landroid/content/Context;

    .line 1579
    .line 1580
    invoke-static {v0}, La/grv0;->a(Landroid/content/Context;)La/o58;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v7

    .line 1584
    invoke-virtual {v7}, La/o58;->c()Z

    .line 1585
    .line 1586
    .line 1587
    move-result v7

    .line 1588
    if-nez v7, :cond_35

    .line 1589
    .line 1590
    invoke-virtual {v12}, La/bkw0;->p1()Z

    .line 1591
    .line 1592
    .line 1593
    move-result v7

    .line 1594
    if-nez v7, :cond_35

    .line 1595
    .line 1596
    invoke-static {v0}, La/x6x0;->h2(Landroid/content/Context;)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v7

    .line 1600
    if-nez v7, :cond_34

    .line 1601
    .line 1602
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1603
    .line 1604
    .line 1605
    const-string v7, "AppMeasurementReceiver not registered/enabled"

    .line 1606
    .line 1607
    invoke-virtual {v3, v7}, La/quw0;->a(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    :cond_34
    invoke-static {v0}, La/x6x0;->H1(Landroid/content/Context;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v0

    .line 1614
    if-nez v0, :cond_35

    .line 1615
    .line 1616
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1617
    .line 1618
    .line 1619
    const-string v0, "AppMeasurementService not registered/enabled"

    .line 1620
    .line 1621
    invoke-virtual {v3, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    :cond_35
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1625
    .line 1626
    .line 1627
    const-string v0, "Uploading is not possible. App measurement disabled"

    .line 1628
    .line 1629
    invoke-virtual {v3, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    :goto_25
    move-object/from16 v7, v24

    .line 1633
    .line 1634
    goto/16 :goto_2b

    .line 1635
    .line 1636
    :cond_36
    move-object/from16 v5, v28

    .line 1637
    .line 1638
    move-object/from16 v1, v30

    .line 1639
    .line 1640
    goto :goto_25

    .line 1641
    :cond_37
    move-object/from16 v5, v28

    .line 1642
    .line 1643
    move-object/from16 v1, v30

    .line 1644
    .line 1645
    invoke-virtual {v5}, La/kxw0;->k()La/vtw0;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v3

    .line 1649
    invoke-virtual {v3}, La/vtw0;->s1()Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v3

    .line 1653
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v3

    .line 1657
    if-nez v3, :cond_3b

    .line 1658
    .line 1659
    invoke-virtual {v5}, La/kxw0;->k()La/vtw0;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v3

    .line 1663
    invoke-virtual {v3}, La/vtw0;->s1()Ljava/lang/String;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v3

    .line 1667
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v7

    .line 1674
    const-string v11, "gmp_app_id"

    .line 1675
    .line 1676
    const/4 v14, 0x0

    .line 1677
    invoke-interface {v7, v11, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v7

    .line 1681
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v14

    .line 1685
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v16

    .line 1689
    if-nez v14, :cond_3a

    .line 1690
    .line 1691
    if-nez v16, :cond_3a

    .line 1692
    .line 1693
    invoke-static {v3}, La/s0x;->H(Ljava/lang/Object;)V

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1697
    .line 1698
    .line 1699
    move-result v3

    .line 1700
    if-nez v3, :cond_3a

    .line 1701
    .line 1702
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1703
    .line 1704
    .line 1705
    const-string v3, "Rechecking which service to use due to a GMP App Id change"

    .line 1706
    .line 1707
    move-object/from16 v7, v27

    .line 1708
    .line 1709
    invoke-virtual {v7, v3}, La/quw0;->a(Ljava/lang/String;)V

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v3

    .line 1722
    const-string v7, "measurement_enabled"

    .line 1723
    .line 1724
    invoke-interface {v3, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1725
    .line 1726
    .line 1727
    move-result v3

    .line 1728
    if-eqz v3, :cond_38

    .line 1729
    .line 1730
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v3

    .line 1734
    const/4 v15, 0x1

    .line 1735
    invoke-interface {v3, v7, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1736
    .line 1737
    .line 1738
    move-result v3

    .line 1739
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v3

    .line 1743
    goto :goto_26

    .line 1744
    :cond_38
    const/4 v3, 0x0

    .line 1745
    :goto_26
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v14

    .line 1749
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v14

    .line 1753
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1754
    .line 1755
    .line 1756
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1757
    .line 1758
    .line 1759
    if-eqz v3, :cond_39

    .line 1760
    .line 1761
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v14

    .line 1768
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v14

    .line 1772
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1773
    .line 1774
    .line 1775
    move-result v3

    .line 1776
    invoke-interface {v14, v7, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1777
    .line 1778
    .line 1779
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1780
    .line 1781
    .line 1782
    :cond_39
    invoke-virtual {v5}, La/kxw0;->h()La/euw0;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    invoke-virtual {v3}, La/euw0;->p1()V

    .line 1787
    .line 1788
    .line 1789
    iget-object v3, v5, La/kxw0;->r:La/a4x0;

    .line 1790
    .line 1791
    invoke-virtual {v3}, La/a4x0;->t1()V

    .line 1792
    .line 1793
    .line 1794
    iget-object v3, v5, La/kxw0;->r:La/a4x0;

    .line 1795
    .line 1796
    invoke-virtual {v3}, La/a4x0;->r1()V

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v0, v8, v9}, La/rvw0;->b(J)V

    .line 1800
    .line 1801
    .line 1802
    move-object/from16 v0, v26

    .line 1803
    .line 1804
    const/4 v14, 0x0

    .line 1805
    invoke-virtual {v0, v14}, La/o24;->u(Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    goto :goto_27

    .line 1809
    :cond_3a
    move-object/from16 v0, v26

    .line 1810
    .line 1811
    :goto_27
    invoke-virtual {v5}, La/kxw0;->k()La/vtw0;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v3

    .line 1815
    invoke-virtual {v3}, La/vtw0;->s1()Ljava/lang/String;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v3

    .line 1819
    invoke-virtual {v10}, La/p4;->m1()V

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v10}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v7

    .line 1826
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v7

    .line 1830
    invoke-interface {v7, v11, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1831
    .line 1832
    .line 1833
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1834
    .line 1835
    .line 1836
    goto :goto_28

    .line 1837
    :cond_3b
    move-object/from16 v0, v26

    .line 1838
    .line 1839
    :goto_28
    invoke-virtual {v10}, La/wvw0;->t1()La/xyw0;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v3

    .line 1843
    invoke-virtual {v3, v13}, La/xyw0;->i(La/wyw0;)Z

    .line 1844
    .line 1845
    .line 1846
    move-result v3

    .line 1847
    if-nez v3, :cond_3c

    .line 1848
    .line 1849
    const/4 v14, 0x0

    .line 1850
    invoke-virtual {v0, v14}, La/o24;->u(Ljava/lang/String;)V

    .line 1851
    .line 1852
    .line 1853
    :cond_3c
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v0}, La/o24;->t()Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    iget-object v3, v6, La/b1x0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1861
    .line 1862
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1863
    .line 1864
    .line 1865
    move-object/from16 v3, v25

    .line 1866
    .line 1867
    :try_start_6
    iget-object v0, v3, La/kxw0;->a:Landroid/content/Context;

    .line 1868
    .line 1869
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    const-string v3, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    .line 1874
    .line 1875
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1876
    .line 1877
    .line 1878
    :cond_3d
    move-object/from16 v7, v24

    .line 1879
    .line 1880
    goto :goto_29

    .line 1881
    :catch_6
    iget-object v0, v10, La/wvw0;->w:La/o24;

    .line 1882
    .line 1883
    invoke-virtual {v0}, La/o24;->t()Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v3

    .line 1887
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v3

    .line 1891
    if-nez v3, :cond_3d

    .line 1892
    .line 1893
    invoke-static/range {v24 .. v24}, La/kxw0;->g(La/ryw0;)V

    .line 1894
    .line 1895
    .line 1896
    move-object/from16 v7, v24

    .line 1897
    .line 1898
    iget-object v3, v7, La/uuw0;->j:La/quw0;

    .line 1899
    .line 1900
    const-string v8, "Remote config removed with active feature rollouts"

    .line 1901
    .line 1902
    invoke-virtual {v3, v8}, La/quw0;->a(Ljava/lang/String;)V

    .line 1903
    .line 1904
    .line 1905
    const/4 v14, 0x0

    .line 1906
    invoke-virtual {v0, v14}, La/o24;->u(Ljava/lang/String;)V

    .line 1907
    .line 1908
    .line 1909
    :goto_29
    invoke-virtual {v5}, La/kxw0;->k()La/vtw0;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    invoke-virtual {v0}, La/vtw0;->s1()Ljava/lang/String;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v0

    .line 1917
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1918
    .line 1919
    .line 1920
    move-result v0

    .line 1921
    if-nez v0, :cond_41

    .line 1922
    .line 1923
    invoke-virtual {v5}, La/kxw0;->a()Z

    .line 1924
    .line 1925
    .line 1926
    move-result v0

    .line 1927
    iget-object v3, v10, La/wvw0;->d:Landroid/content/SharedPreferences;

    .line 1928
    .line 1929
    if-nez v3, :cond_3e

    .line 1930
    .line 1931
    const/4 v3, 0x0

    .line 1932
    goto :goto_2a

    .line 1933
    :cond_3e
    const-string v8, "deferred_analytics_collection"

    .line 1934
    .line 1935
    invoke-interface {v3, v8}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v3

    .line 1939
    :goto_2a
    if-nez v3, :cond_3f

    .line 1940
    .line 1941
    invoke-virtual {v12}, La/bkw0;->A1()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v3

    .line 1945
    if-nez v3, :cond_3f

    .line 1946
    .line 1947
    xor-int/lit8 v3, v0, 0x1

    .line 1948
    .line 1949
    invoke-virtual {v10, v3}, La/wvw0;->u1(Z)V

    .line 1950
    .line 1951
    .line 1952
    :cond_3f
    if-eqz v0, :cond_40

    .line 1953
    .line 1954
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {v6}, La/b1x0;->x1()V

    .line 1958
    .line 1959
    .line 1960
    :cond_40
    iget-object v0, v5, La/kxw0;->h:La/w4x0;

    .line 1961
    .line 1962
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 1963
    .line 1964
    .line 1965
    iget-object v0, v0, La/w4x0;->f:La/ikt0;

    .line 1966
    .line 1967
    invoke-virtual {v0}, La/ikt0;->e()V

    .line 1968
    .line 1969
    .line 1970
    invoke-virtual {v5}, La/kxw0;->i()La/a4x0;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1975
    .line 1976
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v0, v3}, La/a4x0;->p1(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 1980
    .line 1981
    .line 1982
    invoke-virtual {v5}, La/kxw0;->i()La/a4x0;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v0

    .line 1986
    iget-object v3, v10, La/wvw0;->z:La/fht0;

    .line 1987
    .line 1988
    invoke-virtual {v3}, La/fht0;->s()Landroid/os/Bundle;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v3

    .line 1992
    invoke-virtual {v0, v3}, La/a4x0;->q1(Landroid/os/Bundle;)V

    .line 1993
    .line 1994
    .line 1995
    :cond_41
    :goto_2b
    invoke-static {}, La/miw0;->a()V

    .line 1996
    .line 1997
    .line 1998
    sget-object v0, La/btw0;->P0:La/atw0;

    .line 1999
    .line 2000
    const/4 v14, 0x0

    .line 2001
    invoke-virtual {v12, v14, v0}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 2002
    .line 2003
    .line 2004
    move-result v0

    .line 2005
    if-eqz v0, :cond_44

    .line 2006
    .line 2007
    invoke-virtual {v1}, La/p4;->m1()V

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual {v1}, La/x6x0;->J1()J

    .line 2011
    .line 2012
    .line 2013
    move-result-wide v0

    .line 2014
    cmp-long v0, v0, v19

    .line 2015
    .line 2016
    if-nez v0, :cond_44

    .line 2017
    .line 2018
    sget-object v0, La/btw0;->w0:La/atw0;

    .line 2019
    .line 2020
    invoke-virtual {v0, v14}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v0

    .line 2024
    check-cast v0, Ljava/lang/Integer;

    .line 2025
    .line 2026
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2027
    .line 2028
    .line 2029
    move-result v0

    .line 2030
    int-to-long v0, v0

    .line 2031
    new-instance v3, Ljava/util/Random;

    .line 2032
    .line 2033
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 2034
    .line 2035
    .line 2036
    const/16 v8, 0x1388

    .line 2037
    .line 2038
    invoke-virtual {v3, v8}, Ljava/util/Random;->nextInt(I)I

    .line 2039
    .line 2040
    .line 2041
    move-result v3

    .line 2042
    const-wide/16 v8, 0x3e8

    .line 2043
    .line 2044
    mul-long/2addr v0, v8

    .line 2045
    int-to-long v8, v3

    .line 2046
    iget-object v3, v5, La/kxw0;->k:La/lwf;

    .line 2047
    .line 2048
    add-long/2addr v0, v8

    .line 2049
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2050
    .line 2051
    .line 2052
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2053
    .line 2054
    .line 2055
    move-result-wide v8

    .line 2056
    sub-long/2addr v0, v8

    .line 2057
    const-wide/16 v8, 0x1f4

    .line 2058
    .line 2059
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 2060
    .line 2061
    .line 2062
    move-result-wide v0

    .line 2063
    cmp-long v3, v0, v8

    .line 2064
    .line 2065
    if-lez v3, :cond_42

    .line 2066
    .line 2067
    invoke-static {v7}, La/kxw0;->g(La/ryw0;)V

    .line 2068
    .line 2069
    .line 2070
    const-string v3, "Waiting to fetch trigger URIs until some time after boot. Delay in millis"

    .line 2071
    .line 2072
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v5

    .line 2076
    invoke-virtual {v2, v5, v3}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2077
    .line 2078
    .line 2079
    :cond_42
    invoke-static {v6}, La/kxw0;->f(La/etw0;)V

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v6}, La/zrw0;->m1()V

    .line 2083
    .line 2084
    .line 2085
    iget-object v2, v6, La/b1x0;->m:La/ezw0;

    .line 2086
    .line 2087
    if-nez v2, :cond_43

    .line 2088
    .line 2089
    new-instance v2, La/ezw0;

    .line 2090
    .line 2091
    const/4 v7, 0x0

    .line 2092
    invoke-direct {v2, v6, v4, v7}, La/ezw0;-><init>(La/b1x0;La/syw0;B)V

    .line 2093
    .line 2094
    .line 2095
    iput-object v2, v6, La/b1x0;->m:La/ezw0;

    .line 2096
    .line 2097
    :cond_43
    invoke-virtual {v2, v0, v1}, La/bmw0;->b(J)V

    .line 2098
    .line 2099
    .line 2100
    :cond_44
    iget-object v0, v10, La/wvw0;->p:La/mvw0;

    .line 2101
    .line 2102
    const/4 v15, 0x1

    .line 2103
    invoke-virtual {v0, v15}, La/mvw0;->b(Z)V

    .line 2104
    .line 2105
    .line 2106
    return-void

    .line 2107
    :cond_45
    invoke-static/range {v23 .. v23}, La/jf4;->n(Ljava/lang/String;)V

    .line 2108
    .line 2109
    .line 2110
    return-void

    .line 2111
    :cond_46
    move-object/from16 v23, v6

    .line 2112
    .line 2113
    invoke-static/range {v23 .. v23}, La/jf4;->n(Ljava/lang/String;)V

    .line 2114
    .line 2115
    .line 2116
    return-void

    .line 2117
    :cond_47
    move-object/from16 v23, v6

    .line 2118
    .line 2119
    invoke-static/range {v23 .. v23}, La/jf4;->n(Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    return-void

    .line 2123
    :cond_48
    move-object/from16 v23, v6

    .line 2124
    .line 2125
    invoke-static/range {v23 .. v23}, La/jf4;->n(Ljava/lang/String;)V

    .line 2126
    .line 2127
    .line 2128
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/mfr;->a:B

    .line 4
    .line 5
    const/16 v2, 0x5c

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 16
    .line 17
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 18
    .line 19
    iget-object v2, v2, La/kxw0;->i:La/x6x0;

    .line 20
    .line 21
    invoke-static {v2}, La/kxw0;->e(La/p4;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 25
    .line 26
    iget-object v3, v0, La/kxw0;->y:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, La/kxw0;->y:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    move v4, v5

    .line 39
    :cond_0
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, La/gpw0;

    .line 42
    .line 43
    invoke-virtual {v2, v0, v4}, La/x6x0;->d2(La/gpw0;Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/b1x0;

    .line 50
    .line 51
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/kxw0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/kxw0;->k()La/vtw0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, v2, La/vtw0;->s:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_1

    .line 72
    .line 73
    move v4, v5

    .line 74
    :cond_1
    iput-object v1, v2, La/vtw0;->s:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, La/kxw0;->k()La/vtw0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, La/vtw0;->q1()V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void

    .line 86
    :pswitch_1
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/b1x0;

    .line 89
    .line 90
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 91
    .line 92
    .line 93
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v3, 0x1e

    .line 96
    .line 97
    if-ge v2, v3, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Ljava/util/List;

    .line 103
    .line 104
    iget-object v2, v0, La/p4;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, La/kxw0;

    .line 107
    .line 108
    iget-object v2, v2, La/kxw0;->e:La/wvw0;

    .line 109
    .line 110
    invoke-static {v2}, La/kxw0;->e(La/p4;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, La/wvw0;->s1()Landroid/util/SparseArray;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzoh;

    .line 132
    .line 133
    iget v4, v3, Lcom/google/android/gms/measurement/internal/zzoh;->c:I

    .line 134
    .line 135
    invoke-static {v2, v4}, La/zhv0;->l(Landroid/util/SparseArray;I)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_5

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/Long;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    iget-wide v6, v3, Lcom/google/android/gms/measurement/internal/zzoh;->b:J

    .line 152
    .line 153
    cmp-long v4, v4, v6

    .line 154
    .line 155
    if-gez v4, :cond_4

    .line 156
    .line 157
    :cond_5
    invoke-virtual {v0}, La/b1x0;->J1()Ljava/util/PriorityQueue;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v4, v3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_6
    invoke-virtual {v0}, La/b1x0;->K1()V

    .line 166
    .line 167
    .line 168
    :goto_1
    return-void

    .line 169
    :pswitch_2
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 172
    .line 173
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 174
    .line 175
    iget-object v0, v0, La/kxw0;->m:La/b1x0;

    .line 176
    .line 177
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 178
    .line 179
    .line 180
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v1, La/hcp0;

    .line 183
    .line 184
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, La/etw0;->n1()V

    .line 188
    .line 189
    .line 190
    iget-object v2, v0, La/b1x0;->e:La/hcp0;

    .line 191
    .line 192
    if-eq v1, v2, :cond_8

    .line 193
    .line 194
    if-nez v2, :cond_7

    .line 195
    .line 196
    move v4, v5

    .line 197
    :cond_7
    const-string v2, "EventInterceptor already set."

    .line 198
    .line 199
    invoke-static {v2, v4}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    :cond_8
    iput-object v1, v0, La/b1x0;->e:La/hcp0;

    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_3
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, La/b1x0;

    .line 208
    .line 209
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v0, v1, v5}, La/b1x0;->C1(Ljava/lang/Boolean;Z)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_4
    const-string v0, "creation_timestamp"

    .line 218
    .line 219
    const-string v2, "app_id"

    .line 220
    .line 221
    iget-object v3, v1, La/mfr;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v3, La/b1x0;

    .line 224
    .line 225
    invoke-virtual {v3}, La/zrw0;->m1()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, La/etw0;->n1()V

    .line 229
    .line 230
    .line 231
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Landroid/os/Bundle;

    .line 234
    .line 235
    const-string v4, "name"

    .line 236
    .line 237
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v9}, La/s0x;->E(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-object v3, v3, La/p4;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v3, La/kxw0;

    .line 247
    .line 248
    invoke-virtual {v3}, La/kxw0;->a()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_9

    .line 253
    .line 254
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 255
    .line 256
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 257
    .line 258
    .line 259
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 260
    .line 261
    const-string v1, "Conditional property not cleared since app measurement is disabled"

    .line 262
    .line 263
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_9
    const-string v10, ""

    .line 268
    .line 269
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzpl;

    .line 270
    .line 271
    const-wide/16 v6, 0x0

    .line 272
    .line 273
    const/4 v8, 0x0

    .line 274
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :try_start_0
    iget-object v6, v3, La/kxw0;->i:La/x6x0;

    .line 278
    .line 279
    invoke-static {v6}, La/kxw0;->e(La/p4;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    const-string v4, "expired_event_name"

    .line 286
    .line 287
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    const-string v4, "expired_event_params"

    .line 292
    .line 293
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    const-string v9, ""

    .line 298
    .line 299
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 300
    .line 301
    .line 302
    move-result-wide v10

    .line 303
    const-wide/16 v12, 0x0

    .line 304
    .line 305
    const/4 v14, 0x1

    .line 306
    invoke-virtual/range {v6 .. v14}, La/x6x0;->T1(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JJZ)Lcom/google/android/gms/measurement/internal/zzbh;

    .line 307
    .line 308
    .line 309
    move-result-object v25
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzah;

    .line 311
    .line 312
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v15

    .line 320
    const-string v0, "active"

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v17

    .line 326
    const-string v0, "trigger_event_name"

    .line 327
    .line 328
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v18

    .line 332
    const-string v0, "trigger_timeout"

    .line 333
    .line 334
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 335
    .line 336
    .line 337
    move-result-wide v20

    .line 338
    const-string v0, "time_to_live"

    .line 339
    .line 340
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 341
    .line 342
    .line 343
    move-result-wide v23

    .line 344
    const-string v13, ""

    .line 345
    .line 346
    const/16 v19, 0x0

    .line 347
    .line 348
    const/16 v22, 0x0

    .line 349
    .line 350
    move-object v14, v5

    .line 351
    invoke-direct/range {v11 .. v25}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpl;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbh;JLcom/google/android/gms/measurement/internal/zzbh;JLcom/google/android/gms/measurement/internal/zzbh;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3}, La/kxw0;->i()La/a4x0;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0, v11}, La/a4x0;->E1(Lcom/google/android/gms/measurement/internal/zzah;)V

    .line 359
    .line 360
    .line 361
    :catch_0
    :goto_2
    return-void

    .line 362
    :pswitch_5
    invoke-direct {v1}, La/mfr;->b()V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_6
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, La/zvw0;

    .line 369
    .line 370
    iget-object v2, v0, La/zvw0;->b:La/drm0;

    .line 371
    .line 372
    iget-object v2, v2, La/drm0;->a:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, La/kxw0;

    .line 375
    .line 376
    iget-object v3, v2, La/kxw0;->g:La/fxw0;

    .line 377
    .line 378
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, La/fxw0;->m1()V

    .line 382
    .line 383
    .line 384
    new-instance v3, Landroid/os/Bundle;

    .line 385
    .line 386
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 387
    .line 388
    .line 389
    const-string v4, "package_name"

    .line 390
    .line 391
    iget-object v0, v0, La/zvw0;->a:Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, La/enw0;

    .line 399
    .line 400
    :try_start_1
    check-cast v0, La/zmw0;

    .line 401
    .line 402
    invoke-virtual {v0}, La/y4w0;->G()Landroid/os/Parcel;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-static {v1, v3}, La/wmw0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v1, v5}, La/y4w0;->F(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 414
    .line 415
    invoke-static {v0, v1}, La/wmw0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    check-cast v1, Landroid/os/Bundle;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 422
    .line 423
    .line 424
    if-nez v1, :cond_a

    .line 425
    .line 426
    iget-object v0, v2, La/kxw0;->f:La/uuw0;

    .line 427
    .line 428
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 429
    .line 430
    .line 431
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 432
    .line 433
    const-string v1, "Install Referrer Service returned a null response"

    .line 434
    .line 435
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 436
    .line 437
    .line 438
    goto :goto_3

    .line 439
    :catch_1
    move-exception v0

    .line 440
    iget-object v1, v2, La/kxw0;->f:La/uuw0;

    .line 441
    .line 442
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 443
    .line 444
    .line 445
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 446
    .line 447
    const-string v3, "Exception occurred while retrieving the Install Referrer"

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v1, v0, v3}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :cond_a
    :goto_3
    iget-object v0, v2, La/kxw0;->g:La/fxw0;

    .line 457
    .line 458
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 462
    .line 463
    .line 464
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 465
    .line 466
    const-string v1, "Unexpected call on client side"

    .line 467
    .line 468
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    throw v0

    .line 472
    :pswitch_7
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v0}, La/nfq;->e(Ljava/lang/String;)La/nfq;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    const-class v2, La/zdw0;

    .line 481
    .line 482
    invoke-virtual {v0, v2}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    check-cast v2, La/zdw0;

    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(La/nfq;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->a()Lcom/google/firebase/auth/FirebaseUser;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    if-eqz v2, :cond_b

    .line 500
    .line 501
    move v2, v5

    .line 502
    goto :goto_4

    .line 503
    :cond_b
    move v2, v4

    .line 504
    :goto_4
    if-eqz v2, :cond_c

    .line 505
    .line 506
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/FirebaseUser;

    .line 507
    .line 508
    invoke-virtual {v0, v2, v5}, Lcom/google/firebase/auth/FirebaseAuth;->d(Lcom/google/firebase/auth/FirebaseUser;Z)Lcom/google/android/gms/tasks/Task;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sget-object v2, La/tlw0;->e:La/zz2;

    .line 513
    .line 514
    const-string v3, "Token refreshing started"

    .line 515
    .line 516
    new-array v4, v4, [Ljava/lang/Object;

    .line 517
    .line 518
    invoke-virtual {v2, v3, v4}, La/zz2;->K(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    new-instance v2, La/ilp0;

    .line 522
    .line 523
    invoke-direct {v2, v1}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 527
    .line 528
    .line 529
    :cond_c
    return-void

    .line 530
    :pswitch_8
    invoke-direct {v1}, La/mfr;->a()V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_9
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 535
    .line 536
    move-object v2, v0

    .line 537
    check-cast v2, La/fuo0;

    .line 538
    .line 539
    :try_start_2
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 542
    .line 543
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v2, v0}, La/fuo0;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 548
    .line 549
    .line 550
    goto :goto_5

    .line 551
    :catch_2
    move-exception v0

    .line 552
    invoke-virtual {v2, v0}, La/fuo0;->a(Ljava/lang/Exception;)V

    .line 553
    .line 554
    .line 555
    :goto_5
    return-void

    .line 556
    :pswitch_a
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, La/e6w0;

    .line 559
    .line 560
    iget-object v2, v0, La/e6w0;->c:Ljava/lang/Object;

    .line 561
    .line 562
    monitor-enter v2

    .line 563
    :try_start_3
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, La/e6w0;

    .line 566
    .line 567
    iget-object v0, v0, La/e6w0;->d:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v0, La/fh60;

    .line 570
    .line 571
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v1, La/u6w0;

    .line 574
    .line 575
    invoke-virtual {v1}, La/u6w0;->b()Ljava/lang/Exception;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-interface {v0, v1}, La/fh60;->onFailure(Ljava/lang/Exception;)V

    .line 580
    .line 581
    .line 582
    monitor-exit v2

    .line 583
    return-void

    .line 584
    :catchall_0
    move-exception v0

    .line 585
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 586
    throw v0

    .line 587
    :pswitch_b
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, La/glz;

    .line 590
    .line 591
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v1, La/kov0;

    .line 594
    .line 595
    invoke-virtual {v0, v1}, La/glz;->f(La/blz;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_c
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, La/ig00;

    .line 602
    .line 603
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, La/n5a;

    .line 610
    .line 611
    if-eqz v2, :cond_d

    .line 612
    .line 613
    invoke-virtual {v1, v3}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 614
    .line 615
    .line 616
    goto :goto_6

    .line 617
    :cond_d
    :try_start_4
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 618
    .line 619
    invoke-static {v0}, La/y4;->i(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v1, v0}, La/n5a;->resumeWith(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_3

    .line 624
    .line 625
    .line 626
    goto :goto_6

    .line 627
    :catch_3
    move-exception v0

    .line 628
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    new-instance v2, La/g0g0;

    .line 638
    .line 639
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v2}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    :goto_6
    return-void

    .line 646
    :pswitch_d
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Landroid/view/View;

    .line 649
    .line 650
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    sub-int/2addr v2, v3

    .line 659
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    sub-int/2addr v2, v0

    .line 664
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v0, La/c3k;

    .line 667
    .line 668
    iget-object v1, v0, La/c3k;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 669
    .line 670
    invoke-virtual {v1}, Landroid/view/View;->getPaddingEnd()I

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    sub-int/2addr v2, v3

    .line 675
    invoke-virtual {v1}, Landroid/view/View;->getPaddingStart()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    sub-int/2addr v2, v3

    .line 680
    if-lez v2, :cond_e

    .line 681
    .line 682
    iget-object v0, v0, La/c3k;->b:Landroid/widget/LinearLayout;

    .line 683
    .line 684
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    check-cast v0, La/a3e;

    .line 692
    .line 693
    iput v2, v0, La/a3e;->N:I

    .line 694
    .line 695
    invoke-virtual {v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 696
    .line 697
    .line 698
    :cond_e
    return-void

    .line 699
    :pswitch_e
    :try_start_5
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v0, Ljava/lang/Runnable;

    .line 702
    .line 703
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 704
    .line 705
    .line 706
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, La/xgi0;

    .line 709
    .line 710
    iget-object v2, v0, La/xgi0;->d:Ljava/lang/Object;

    .line 711
    .line 712
    monitor-enter v2

    .line 713
    :try_start_6
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, La/xgi0;

    .line 716
    .line 717
    invoke-virtual {v0}, La/xgi0;->a()V

    .line 718
    .line 719
    .line 720
    monitor-exit v2

    .line 721
    return-void

    .line 722
    :catchall_1
    move-exception v0

    .line 723
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 724
    throw v0

    .line 725
    :catchall_2
    move-exception v0

    .line 726
    iget-object v2, v1, La/mfr;->b:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v2, La/xgi0;

    .line 729
    .line 730
    iget-object v2, v2, La/xgi0;->d:Ljava/lang/Object;

    .line 731
    .line 732
    monitor-enter v2

    .line 733
    :try_start_7
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v1, La/xgi0;

    .line 736
    .line 737
    invoke-virtual {v1}, La/xgi0;->a()V

    .line 738
    .line 739
    .line 740
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 741
    throw v0

    .line 742
    :catchall_3
    move-exception v0

    .line 743
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 744
    throw v0

    .line 745
    :pswitch_f
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v0, La/n5a;

    .line 748
    .line 749
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v1, La/cko;

    .line 752
    .line 753
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    invoke-virtual {v0, v1, v2}, La/n5a;->D(La/lne;Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_10
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v0, La/h04;

    .line 762
    .line 763
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 764
    .line 765
    iget-object v2, v0, La/h04;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 766
    .line 767
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    iget-object v4, v0, La/h04;->e:La/saw0;

    .line 772
    .line 773
    if-eqz v2, :cond_f

    .line 774
    .line 775
    iget-object v1, v4, La/saw0;->h:La/h04;

    .line 776
    .line 777
    if-ne v1, v0, :cond_13

    .line 778
    .line 779
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 780
    .line 781
    .line 782
    iput-object v3, v4, La/saw0;->h:La/h04;

    .line 783
    .line 784
    invoke-virtual {v4}, La/saw0;->a()V

    .line 785
    .line 786
    .line 787
    goto :goto_7

    .line 788
    :cond_f
    iget-object v2, v4, La/saw0;->g:La/h04;

    .line 789
    .line 790
    if-eq v2, v0, :cond_10

    .line 791
    .line 792
    iget-object v1, v4, La/saw0;->h:La/h04;

    .line 793
    .line 794
    if-ne v1, v0, :cond_13

    .line 795
    .line 796
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 797
    .line 798
    .line 799
    iput-object v3, v4, La/saw0;->h:La/h04;

    .line 800
    .line 801
    invoke-virtual {v4}, La/saw0;->a()V

    .line 802
    .line 803
    .line 804
    goto :goto_7

    .line 805
    :cond_10
    iget-boolean v2, v4, La/saw0;->c:Z

    .line 806
    .line 807
    if-eqz v2, :cond_11

    .line 808
    .line 809
    goto :goto_7

    .line 810
    :cond_11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 811
    .line 812
    .line 813
    iput-object v3, v4, La/saw0;->g:La/h04;

    .line 814
    .line 815
    iget-object v2, v4, La/saw0;->a:La/pq00;

    .line 816
    .line 817
    if-eqz v2, :cond_13

    .line 818
    .line 819
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    if-ne v3, v4, :cond_12

    .line 828
    .line 829
    invoke-virtual {v2, v1}, La/wh00;->l(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    goto :goto_7

    .line 833
    :cond_12
    invoke-virtual {v2, v1}, La/wh00;->i(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    :cond_13
    :goto_7
    const/4 v1, 0x3

    .line 837
    iput v1, v0, La/h04;->b:I

    .line 838
    .line 839
    return-void

    .line 840
    :cond_14
    :pswitch_11
    :try_start_9
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 841
    .line 842
    check-cast v0, Ljava/lang/Runnable;

    .line 843
    .line 844
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 845
    .line 846
    .line 847
    goto :goto_8

    .line 848
    :catchall_4
    move-exception v0

    .line 849
    :try_start_a
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 850
    .line 851
    invoke-static {v0, v2}, La/u1c;->H(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 852
    .line 853
    .line 854
    :goto_8
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, La/hsz;

    .line 857
    .line 858
    invoke-virtual {v0}, La/hsz;->x()Ljava/lang/Runnable;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    if-nez v0, :cond_15

    .line 863
    .line 864
    goto :goto_9

    .line 865
    :cond_15
    iput-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 866
    .line 867
    add-int/2addr v4, v5

    .line 868
    const/16 v0, 0x10

    .line 869
    .line 870
    if-lt v4, v0, :cond_14

    .line 871
    .line 872
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, La/hsz;

    .line 875
    .line 876
    iget-object v2, v0, La/hsz;->d:La/lne;

    .line 877
    .line 878
    invoke-static {v2, v0}, La/ovk;->c(La/lne;Lkotlin/coroutines/CoroutineContext;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_14

    .line 883
    .line 884
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, La/hsz;

    .line 887
    .line 888
    iget-object v2, v0, La/hsz;->d:La/lne;

    .line 889
    .line 890
    invoke-static {v2, v0, v1}, La/ovk;->b(La/lne;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 891
    .line 892
    .line 893
    :goto_9
    return-void

    .line 894
    :catchall_5
    move-exception v0

    .line 895
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v1, La/hsz;

    .line 898
    .line 899
    iget-object v2, v1, La/hsz;->g:Ljava/lang/Object;

    .line 900
    .line 901
    monitor-enter v2

    .line 902
    :try_start_b
    sget-object v3, La/hsz;->h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 903
    .line 904
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 905
    .line 906
    .line 907
    monitor-exit v2

    .line 908
    throw v0

    .line 909
    :catchall_6
    move-exception v0

    .line 910
    monitor-exit v2

    .line 911
    throw v0

    .line 912
    :pswitch_12
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v0, La/qyx;

    .line 915
    .line 916
    iget-object v2, v0, La/qyx;->e:La/xhe0;

    .line 917
    .line 918
    iget-object v3, v1, La/mfr;->c:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v3, La/vyx;

    .line 921
    .line 922
    iget-object v5, v3, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 923
    .line 924
    if-eqz v5, :cond_1a

    .line 925
    .line 926
    iget-boolean v5, v5, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 927
    .line 928
    if-eqz v5, :cond_1a

    .line 929
    .line 930
    iget-boolean v0, v0, La/qyx;->k:Z

    .line 931
    .line 932
    if-nez v0, :cond_1a

    .line 933
    .line 934
    invoke-virtual {v2}, La/xhe0;->c()I

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    const/4 v5, -0x1

    .line 939
    if-eq v0, v5, :cond_1a

    .line 940
    .line 941
    iget-object v0, v3, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 942
    .line 943
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()La/ehe0;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    if-eqz v0, :cond_16

    .line 948
    .line 949
    invoke-virtual {v0}, La/ehe0;->f()Z

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    if-nez v0, :cond_17

    .line 954
    .line 955
    :cond_16
    iget-object v0, v3, La/vyx;->p:Ljava/util/ArrayList;

    .line 956
    .line 957
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 958
    .line 959
    .line 960
    move-result v5

    .line 961
    :goto_a
    if-ge v4, v5, :cond_19

    .line 962
    .line 963
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    check-cast v6, La/qyx;

    .line 968
    .line 969
    iget-boolean v6, v6, La/qyx;->l:Z

    .line 970
    .line 971
    if-nez v6, :cond_18

    .line 972
    .line 973
    :cond_17
    iget-object v0, v3, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 974
    .line 975
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 976
    .line 977
    .line 978
    goto :goto_b

    .line 979
    :cond_18
    add-int/lit8 v4, v4, 0x1

    .line 980
    .line 981
    goto :goto_a

    .line 982
    :cond_19
    iget-object v0, v3, La/vyx;->m:La/syx;

    .line 983
    .line 984
    invoke-virtual {v0, v2}, La/syx;->u(La/xhe0;)V

    .line 985
    .line 986
    .line 987
    :cond_1a
    :goto_b
    return-void

    .line 988
    :pswitch_13
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, La/d2k;

    .line 991
    .line 992
    iget-object v1, v0, La/d2k;->a:Landroid/widget/LinearLayout;

    .line 993
    .line 994
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 995
    .line 996
    .line 997
    move-result v1

    .line 998
    invoke-static {v2}, La/sj3;->X(I)I

    .line 999
    .line 1000
    .line 1001
    move-result v2

    .line 1002
    sub-int/2addr v1, v2

    .line 1003
    iget-object v0, v0, La/d2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 1004
    .line 1005
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1014
    .line 1015
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 1016
    .line 1017
    .line 1018
    move-result v0

    .line 1019
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1020
    .line 1021
    return-void

    .line 1022
    :pswitch_14
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, La/b2k;

    .line 1025
    .line 1026
    iget-object v1, v0, La/b2k;->a:Landroid/widget/LinearLayout;

    .line 1027
    .line 1028
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    invoke-static {v2}, La/sj3;->X(I)I

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    sub-int/2addr v1, v2

    .line 1037
    iget-object v0, v0, La/b2k;->d:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1038
    .line 1039
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v3

    .line 1047
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1048
    .line 1049
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 1050
    .line 1051
    .line 1052
    move-result v3

    .line 1053
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1054
    .line 1055
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1064
    .line 1065
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1070
    .line 1071
    return-void

    .line 1072
    :pswitch_15
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v0, La/rrm;

    .line 1075
    .line 1076
    iget-object v0, v0, La/g46;->i:La/f46;

    .line 1077
    .line 1078
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v1, Landroid/view/ViewGroup;

    .line 1081
    .line 1082
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 1083
    .line 1084
    invoke-static {v1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    if-eqz v1, :cond_1b

    .line 1089
    .line 1090
    const/4 v2, 0x2

    .line 1091
    iget-object v1, v1, La/xiv0;->a:La/uiv0;

    .line 1092
    .line 1093
    invoke-virtual {v1, v2}, La/uiv0;->i(I)La/pfx;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    if-eqz v1, :cond_1b

    .line 1098
    .line 1099
    iget v1, v1, La/pfx;->d:I

    .line 1100
    .line 1101
    goto :goto_c

    .line 1102
    :cond_1b
    move v1, v4

    .line 1103
    :goto_c
    sget-object v2, La/rrm;->B:La/sje;

    .line 1104
    .line 1105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    instance-of v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1113
    .line 1114
    if-eqz v5, :cond_1c

    .line 1115
    .line 1116
    move-object v3, v2

    .line 1117
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1118
    .line 1119
    :cond_1c
    if-eqz v3, :cond_1d

    .line 1120
    .line 1121
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1122
    .line 1123
    :cond_1d
    if-eq v4, v1, :cond_1f

    .line 1124
    .line 1125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    if-eqz v2, :cond_1e

    .line 1133
    .line 1134
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1135
    .line 1136
    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1137
    .line 1138
    invoke-virtual {v0, v2}, La/f46;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_d

    .line 1142
    :cond_1e
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 1143
    .line 1144
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    :cond_1f
    :goto_d
    return-void

    .line 1148
    :pswitch_16
    :try_start_c
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v0, La/qbb;

    .line 1151
    .line 1152
    iget-object v2, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v2, La/ig00;

    .line 1155
    .line 1156
    invoke-static {v2}, La/ro4;->Z(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    iget-object v0, v0, La/dfr;->b:La/tu9;

    .line 1161
    .line 1162
    if-eqz v0, :cond_20

    .line 1163
    .line 1164
    invoke-virtual {v0, v2}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 1165
    .line 1166
    .line 1167
    :cond_20
    :goto_e
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1168
    .line 1169
    check-cast v0, La/qbb;

    .line 1170
    .line 1171
    iput-object v3, v0, La/qbb;->g:La/ig00;

    .line 1172
    .line 1173
    goto :goto_f

    .line 1174
    :catchall_7
    move-exception v0

    .line 1175
    goto :goto_10

    .line 1176
    :catch_4
    move-exception v0

    .line 1177
    :try_start_d
    iget-object v2, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v2, La/qbb;

    .line 1180
    .line 1181
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    iget-object v2, v2, La/dfr;->b:La/tu9;

    .line 1186
    .line 1187
    if-eqz v2, :cond_20

    .line 1188
    .line 1189
    invoke-virtual {v2, v0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 1190
    .line 1191
    .line 1192
    goto :goto_e

    .line 1193
    :catch_5
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v0, La/qbb;

    .line 1196
    .line 1197
    invoke-virtual {v0, v4}, La/qbb;->cancel(Z)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1198
    .line 1199
    .line 1200
    goto :goto_e

    .line 1201
    :goto_f
    return-void

    .line 1202
    :goto_10
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v1, La/qbb;

    .line 1205
    .line 1206
    iput-object v3, v1, La/qbb;->g:La/ig00;

    .line 1207
    .line 1208
    throw v0

    .line 1209
    :pswitch_17
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1212
    .line 1213
    iget-object v1, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->q:La/vd7;

    .line 1214
    .line 1215
    iget-object v2, v1, La/vd7;->c:Landroid/view/View;

    .line 1216
    .line 1217
    check-cast v2, Landroid/widget/ImageView;

    .line 1218
    .line 1219
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1220
    .line 1221
    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    .line 1222
    .line 1223
    .line 1224
    iget-object v2, v1, La/vd7;->c:Landroid/view/View;

    .line 1225
    .line 1226
    check-cast v2, Landroid/widget/ImageView;

    .line 1227
    .line 1228
    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v2, v1, La/vd7;->c:Landroid/view/View;

    .line 1232
    .line 1233
    check-cast v2, Landroid/widget/ImageView;

    .line 1234
    .line 1235
    iget-object v3, v1, La/vd7;->b:Landroid/view/ViewGroup;

    .line 1236
    .line 1237
    check-cast v3, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1238
    .line 1239
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    int-to-float v3, v3

    .line 1244
    const/high16 v4, 0x40000000    # 2.0f

    .line 1245
    .line 1246
    div-float/2addr v3, v4

    .line 1247
    iget-object v5, v1, La/vd7;->c:Landroid/view/View;

    .line 1248
    .line 1249
    check-cast v5, Landroid/widget/ImageView;

    .line 1250
    .line 1251
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 1252
    .line 1253
    .line 1254
    move-result v5

    .line 1255
    int-to-float v5, v5

    .line 1256
    div-float/2addr v5, v4

    .line 1257
    sub-float/2addr v3, v5

    .line 1258
    invoke-virtual {v2, v3}, Landroid/view/View;->setX(F)V

    .line 1259
    .line 1260
    .line 1261
    iget-object v2, v1, La/vd7;->c:Landroid/view/View;

    .line 1262
    .line 1263
    check-cast v2, Landroid/widget/ImageView;

    .line 1264
    .line 1265
    iget-object v3, v1, La/vd7;->b:Landroid/view/ViewGroup;

    .line 1266
    .line 1267
    check-cast v3, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1268
    .line 1269
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 1270
    .line 1271
    .line 1272
    move-result v3

    .line 1273
    int-to-float v3, v3

    .line 1274
    iget-object v1, v1, La/vd7;->c:Landroid/view/View;

    .line 1275
    .line 1276
    check-cast v1, Landroid/widget/ImageView;

    .line 1277
    .line 1278
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 1279
    .line 1280
    .line 1281
    move-result v1

    .line 1282
    int-to-float v1, v1

    .line 1283
    sub-float/2addr v3, v1

    .line 1284
    iget v0, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->w:I

    .line 1285
    .line 1286
    int-to-float v0, v0

    .line 1287
    sub-float/2addr v3, v0

    .line 1288
    invoke-virtual {v2, v3}, Landroid/view/View;->setY(F)V

    .line 1289
    .line 1290
    .line 1291
    return-void

    .line 1292
    :pswitch_18
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1295
    .line 1296
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    check-cast v0, La/h7d;

    .line 1301
    .line 1302
    if-eqz v0, :cond_21

    .line 1303
    .line 1304
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v1, La/f04;

    .line 1307
    .line 1308
    iget-object v1, v1, La/f04;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1309
    .line 1310
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v1

    .line 1314
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1315
    .line 1316
    .line 1317
    move-result v2

    .line 1318
    if-eqz v2, :cond_21

    .line 1319
    .line 1320
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1325
    .line 1326
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    goto :goto_11

    .line 1330
    :cond_21
    return-void

    .line 1331
    :pswitch_19
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1332
    .line 1333
    iget-object v1, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1334
    .line 1335
    :try_start_e
    sget-object v2, La/vn;->d:Ljava/lang/reflect/Method;

    .line 1336
    .line 1337
    if-eqz v2, :cond_22

    .line 1338
    .line 1339
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1340
    .line 1341
    const-string v4, "AppCompat recreation"

    .line 1342
    .line 1343
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    goto :goto_12

    .line 1351
    :cond_22
    sget-object v2, La/vn;->e:Ljava/lang/reflect/Method;

    .line 1352
    .line 1353
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1354
    .line 1355
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1360
    .line 1361
    .line 1362
    goto :goto_12

    .line 1363
    :catchall_8
    move-exception v0

    .line 1364
    const-string v1, "ActivityRecreator"

    .line 1365
    .line 1366
    const-string v2, "Exception while invoking performStopActivity"

    .line 1367
    .line 1368
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1369
    .line 1370
    .line 1371
    goto :goto_12

    .line 1372
    :catch_6
    move-exception v0

    .line 1373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    const-class v2, Ljava/lang/RuntimeException;

    .line 1378
    .line 1379
    if-ne v1, v2, :cond_24

    .line 1380
    .line 1381
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v1

    .line 1385
    if-eqz v1, :cond_24

    .line 1386
    .line 1387
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    const-string v2, "Unable to stop"

    .line 1392
    .line 1393
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v1

    .line 1397
    if-nez v1, :cond_23

    .line 1398
    .line 1399
    goto :goto_12

    .line 1400
    :cond_23
    throw v0

    .line 1401
    :cond_24
    :goto_12
    return-void

    .line 1402
    :pswitch_1a
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v0, La/un;

    .line 1405
    .line 1406
    iget-object v1, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1407
    .line 1408
    iput-object v1, v0, La/un;->a:Ljava/lang/Object;

    .line 1409
    .line 1410
    return-void

    .line 1411
    :pswitch_1b
    iget-object v0, v1, La/mfr;->c:Ljava/lang/Object;

    .line 1412
    .line 1413
    move-object v2, v0

    .line 1414
    check-cast v2, La/cfr;

    .line 1415
    .line 1416
    :try_start_f
    iget-object v0, v1, La/mfr;->b:Ljava/lang/Object;

    .line 1417
    .line 1418
    check-cast v0, Ljava/util/concurrent/Future;

    .line 1419
    .line 1420
    invoke-static {v0}, La/ro4;->Y(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0
    :try_end_f
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/lang/Error; {:try_start_f .. :try_end_f} :catch_7

    .line 1424
    invoke-interface {v2, v0}, La/cfr;->onSuccess(Ljava/lang/Object;)V

    .line 1425
    .line 1426
    .line 1427
    goto :goto_15

    .line 1428
    :catch_7
    move-exception v0

    .line 1429
    goto :goto_13

    .line 1430
    :catch_8
    move-exception v0

    .line 1431
    goto :goto_13

    .line 1432
    :catch_9
    move-exception v0

    .line 1433
    goto :goto_14

    .line 1434
    :goto_13
    invoke-interface {v2, v0}, La/cfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1435
    .line 1436
    .line 1437
    goto :goto_15

    .line 1438
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    if-nez v1, :cond_25

    .line 1443
    .line 1444
    invoke-interface {v2, v0}, La/cfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1445
    .line 1446
    .line 1447
    goto :goto_15

    .line 1448
    :cond_25
    invoke-interface {v2, v1}, La/cfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1449
    .line 1450
    .line 1451
    :goto_15
    return-void

    .line 1452
    nop

    .line 1453
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mfr;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-class v1, La/mfr;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ","

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/mfr;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/cfr;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
