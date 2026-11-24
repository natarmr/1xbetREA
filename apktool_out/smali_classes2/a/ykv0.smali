.class public final La/ykv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/zuw0;


# static fields
.field public static d:La/ykv0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/m6x0;Ljava/lang/String;La/p6x0;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/ykv0;->a:Ljava/lang/Object;

    iput-object p3, p0, La/ykv0;->b:Ljava/lang/Object;

    iput-object p1, p0, La/ykv0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/trm0;La/knf0;La/mne;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, La/ykv0;->a:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, La/ykv0;->b:Ljava/lang/Object;

    .line 39
    iput-object p3, p0, La/ykv0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/kxw0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ykv0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, La/mwp0;

    .line 14
    .line 15
    const-string v1, "measurement:api"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/mwp0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/mmx;

    .line 21
    .line 22
    sget-object v2, La/mmx;->n:La/yzn0;

    .line 23
    .line 24
    sget-object v3, La/mav;->c:La/mav;

    .line 25
    .line 26
    invoke-direct {v1, p1, v2, v0, v3}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, La/ykv0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p2, p0, La/ykv0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Comparable;)V
    .locals 0

    .line 35
    iput-object p1, p0, La/ykv0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/ykv0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/ykv0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(IIJJ)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, v1, La/ykv0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/kxw0;

    .line 7
    .line 8
    iget-object v0, v0, La/kxw0;->k:La/lwf;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v0, v1, La/ykv0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    const-wide/16 v6, -0x1

    .line 26
    .line 27
    cmp-long v4, v4, v6

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    sub-long v4, v2, v4

    .line 37
    .line 38
    const-wide/32 v6, 0x1b7740

    .line 39
    .line 40
    .line 41
    cmp-long v0, v4, v6

    .line 42
    .line 43
    if-gtz v0, :cond_1

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, v1, La/ykv0;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/mmx;

    .line 50
    .line 51
    new-instance v4, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 52
    .line 53
    new-instance v5, Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 54
    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const v6, 0x8dcd

    .line 59
    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    move/from16 v7, p1

    .line 64
    .line 65
    move/from16 v10, p2

    .line 66
    .line 67
    move-wide/from16 v11, p3

    .line 68
    .line 69
    move-wide/from16 v13, p5

    .line 70
    .line 71
    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIIIJJLjava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    filled-new-array {v5}, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-direct {v4, v6, v5}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4}, La/mmx;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v4, La/hac;

    .line 91
    .line 92
    const/4 v5, 0x7

    .line 93
    invoke-direct {v4, v1, v2, v3, v5}, La/hac;-><init>(Ljava/lang/Object;JB)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit p0

    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    throw v0
.end method

.method public c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/ykv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, La/p6x0;

    .line 4
    .line 5
    iget-wide v0, p1, La/p6x0;->a:J

    .line 6
    .line 7
    iget-object p1, p0, La/ykv0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/m6x0;

    .line 10
    .line 11
    iget-object p0, p0, La/ykv0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1}, La/m6x0;->J()La/fxw0;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    invoke-virtual {p5}, La/fxw0;->m1()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, La/m6x0;->l0()V

    .line 23
    .line 24
    .line 25
    const/4 p5, 0x0

    .line 26
    if-nez p4, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-array p4, p5, [B

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    :goto_0
    const/16 v2, 0xc8

    .line 35
    .line 36
    if-eq p2, v2, :cond_1

    .line 37
    .line 38
    const/16 v2, 0xcc

    .line 39
    .line 40
    if-ne p2, v2, :cond_3

    .line 41
    .line 42
    move p2, v2

    .line 43
    :cond_1
    if-nez p3, :cond_3

    .line 44
    .line 45
    iget-object p3, p1, La/m6x0;->c:La/zlw0;

    .line 46
    .line 47
    invoke-static {p3}, La/m6x0;->T(La/u5x0;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    invoke-virtual {p3, p4}, La/zlw0;->t1(Ljava/lang/Long;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, La/m6x0;->r()La/uuw0;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    iget-object p3, p3, La/uuw0;->o:La/quw0;

    .line 62
    .line 63
    const-string p4, "Successfully uploaded batch from upload queue. appId, status"

    .line 64
    .line 65
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p3, p0, p2, p4}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p1, La/m6x0;->b:La/fvw0;

    .line 73
    .line 74
    invoke-static {p2}, La/m6x0;->T(La/u5x0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, La/fvw0;->q1()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_2

    .line 82
    .line 83
    iget-object p2, p1, La/m6x0;->c:La/zlw0;

    .line 84
    .line 85
    invoke-static {p2}, La/m6x0;->T(La/u5x0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, p0}, La/zlw0;->s1(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1, p0}, La/m6x0;->o(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {p1}, La/m6x0;->M()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    new-instance v2, Ljava/lang/String;

    .line 103
    .line 104
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 105
    .line 106
    invoke-direct {v2, p4, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result p4

    .line 113
    const/16 v3, 0x20

    .line 114
    .line 115
    invoke-static {v3, p4}, Ljava/lang/Math;->min(II)I

    .line 116
    .line 117
    .line 118
    move-result p4

    .line 119
    invoke-virtual {v2, p5, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    invoke-virtual {p1}, La/m6x0;->r()La/uuw0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v2, v2, La/uuw0;->l:La/quw0;

    .line 128
    .line 129
    const-string v3, "Network upload failed. Will retry later. appId, status, error"

    .line 130
    .line 131
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    if-nez p3, :cond_4

    .line 136
    .line 137
    move-object p3, p4

    .line 138
    :cond_4
    invoke-virtual {v2, v3, p0, p2, p3}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object p0, p1, La/m6x0;->c:La/zlw0;

    .line 142
    .line 143
    invoke-static {p0}, La/m6x0;->T(La/u5x0;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p0, p2}, La/zlw0;->y1(Ljava/lang/Long;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, La/m6x0;->M()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    :goto_1
    iput-boolean p5, p1, La/m6x0;->u:Z

    .line 157
    .line 158
    invoke-virtual {p1}, La/m6x0;->N()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_2
    iput-boolean p5, p1, La/m6x0;->u:Z

    .line 163
    .line 164
    invoke-virtual {p1}, La/m6x0;->N()V

    .line 165
    .line 166
    .line 167
    throw p0
.end method

.method public synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget-object p1, p0, La/ykv0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, La/cig0;

    .line 4
    .line 5
    iget-object v0, p0, La/ykv0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, La/ykv0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    iget-object p1, p1, La/cig0;->a:La/nuj0;

    .line 14
    .line 15
    monitor-enter p1

    .line 16
    :try_start_0
    invoke-virtual {p1, v0}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method
