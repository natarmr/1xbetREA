.class public final La/sav;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final o:Lcom/google/android/gms/common/api/Status;

.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Ljava/lang/Object;

.field public static r:La/sav;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lcom/google/android/gms/common/internal/TelemetryData;

.field public d:La/mmx;

.field public final e:Landroid/content/Context;

.field public final f:La/oav;

.field public final g:La/nmt0;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:La/lx3;

.field public final l:La/lx3;

.field public final m:La/jaw0;

.field public volatile n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/sav;->o:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, La/sav;->p:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/sav;->q:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, La/oav;->e:La/oav;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, La/sav;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, La/sav;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, La/sav;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, La/sav;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, La/lx3;

    .line 39
    .line 40
    invoke-direct {v2, v1}, La/lx3;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, La/sav;->k:La/lx3;

    .line 44
    .line 45
    new-instance v2, La/lx3;

    .line 46
    .line 47
    invoke-direct {v2, v1}, La/lx3;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, La/sav;->l:La/lx3;

    .line 51
    .line 52
    iput-boolean v3, p0, La/sav;->n:Z

    .line 53
    .line 54
    iput-object p1, p0, La/sav;->e:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, La/jaw0;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, La/sav;->m:La/jaw0;

    .line 65
    .line 66
    iput-object v0, p0, La/sav;->f:La/oav;

    .line 67
    .line 68
    new-instance p2, La/nmt0;

    .line 69
    .line 70
    sget-object v0, La/oav;->d:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v0, Landroid/util/SparseIntArray;

    .line 76
    .line 77
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p2, La/nmt0;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p2, p0, La/sav;->g:La/nmt0;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object p2, La/zjb;->d:Ljava/lang/Boolean;

    .line 89
    .line 90
    if-nez p2, :cond_1

    .line 91
    .line 92
    invoke-static {}, La/ufx;->F()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_0

    .line 97
    .line 98
    const-string p2, "android.hardware.type.automotive"

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    move v3, v1

    .line 108
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    sput-object p2, La/zjb;->d:Ljava/lang/Boolean;

    .line 113
    .line 114
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    iput-boolean v1, p0, La/sav;->n:Z

    .line 121
    .line 122
    :cond_2
    const/4 p0, 0x6

    .line 123
    invoke-virtual {v2, p0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v2, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, La/sav;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/sav;->r:La/sav;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, La/sav;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, La/sav;->m:La/jaw0;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public static d(La/ua3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, La/ua3;->b:La/yzn0;

    .line 4
    .line 5
    iget-object p0, p0, La/yzn0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x3f

    .line 24
    .line 25
    add-int/2addr v2, v3

    .line 26
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-string v2, "API: "

    .line 30
    .line 31
    const-string v3, " is not available on this device. Connection failed with: "

    .line 32
    .line 33
    invoke-static {v4, v2, p0, v3, v1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/16 v1, 0x11

    .line 38
    .line 39
    iget-object v2, p1, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 40
    .line 41
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static e(Landroid/content/Context;)La/sav;
    .locals 4

    .line 1
    sget-object v0, La/sav;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/sav;->r:La/sav;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, La/d7x0;->b()Landroid/os/HandlerThread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    new-instance v2, La/sav;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v3, La/oav;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, La/sav;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v2, La/sav;->e:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {p0}, La/haw0;->a(Landroid/content/Context;)La/haw0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sput-object p0, La/b9v;->A:La/haw0;

    .line 37
    .line 38
    sput-object v2, La/sav;->r:La/sav;

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-object v1

    .line 46
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p0
.end method


# virtual methods
.method public final b(La/nav;)La/h9w0;
    .locals 3

    .line 1
    iget-object v0, p1, La/nav;->f:La/ua3;

    .line 2
    .line 3
    iget-object v1, p0, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, La/h9w0;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, La/h9w0;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, La/h9w0;-><init>(La/sav;La/nav;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, La/h9w0;->b:La/b9v;

    .line 22
    .line 23
    invoke-virtual {p1}, La/hz5;->r()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, La/sav;->l:La/lx3;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/lx3;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, La/h9w0;->p()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final c(Lcom/google/android/gms/tasks/TaskCompletionSource;ILa/nav;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    iget-object v3, p3, La/nav;->f:La/ua3;

    .line 4
    .line 5
    invoke-virtual {p0}, La/sav;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, La/peg0;->m()La/peg0;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iget-object p3, p3, La/peg0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-boolean v1, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->b:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-boolean p3, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->c:Z

    .line 28
    .line 29
    iget-object v1, p0, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/h9w0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, La/h9w0;->b:La/b9v;

    .line 40
    .line 41
    instance-of v4, v2, La/hz5;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    check-cast v2, La/hz5;

    .line 46
    .line 47
    iget-object v4, v2, La/hz5;->w:Lcom/google/android/gms/common/internal/zzj;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, La/hz5;->q()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    invoke-static {v1, v2, p2}, La/k9w0;->a(La/h9w0;La/hz5;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    iget v2, v1, La/h9w0;->q:I

    .line 64
    .line 65
    add-int/2addr v2, v0

    .line 66
    iput v2, v1, La/h9w0;->q:I

    .line 67
    .line 68
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->c:Z

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v0, p3

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 74
    move-object v1, p0

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    :goto_1
    new-instance p3, La/k9w0;

    .line 77
    .line 78
    const-wide/16 v1, 0x0

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-wide v4, v1

    .line 88
    :goto_2
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    :cond_5
    move-object v0, p3

    .line 95
    move-wide v6, v1

    .line 96
    move-object v1, p0

    .line 97
    move v2, p2

    .line 98
    invoke-direct/range {v0 .. v7}, La/k9w0;-><init>(La/sav;ILa/ua3;JJ)V

    .line 99
    .line 100
    .line 101
    move-object p2, v0

    .line 102
    :goto_3
    if-eqz p2, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    iget-object p1, v1, La/sav;->m:La/jaw0;

    .line 109
    .line 110
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    new-instance p3, La/k03;

    .line 114
    .line 115
    const/4 v0, 0x4

    .line 116
    invoke-direct {p3, p1, v0}, La/k03;-><init>(Landroid/os/Handler;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 120
    .line 121
    .line 122
    :cond_6
    return-void
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, La/sav;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, La/peg0;->m()La/peg0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->b:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p0, p0, La/sav;->g:La/nmt0;

    .line 22
    .line 23
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Landroid/util/SparseIntArray;

    .line 26
    .line 27
    monitor-enter p0

    .line 28
    const/4 v0, -0x1

    .line 29
    const v1, 0xc1fa340

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p0, v1, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    monitor-exit p0

    .line 37
    if-eq v1, v0, :cond_3

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw v0
.end method

.method public final g(Lcom/google/android/gms/common/ConnectionResult;I)Z
    .locals 10

    .line 1
    iget v0, p1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 2
    .line 3
    iget-object v1, p0, La/sav;->f:La/oav;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x9

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "GoogleApiManager"

    .line 24
    .line 25
    const-string p2, "Not showing notification since connectionResult is not user-facing: "

    .line 26
    .line 27
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    return v3

    .line 35
    :cond_0
    :pswitch_0
    iget-object p0, p0, La/sav;->e:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {p0}, La/cjx;->U(Landroid/content/Context;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget v0, p1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v2, p1, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x0

    .line 54
    invoke-virtual {v1, p0, v0, v2}, La/oav;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/high16 v2, 0xc000000

    .line 62
    .line 63
    invoke-static {p0, v3, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v2, v0

    .line 68
    :goto_0
    if-eqz v2, :cond_4

    .line 69
    .line 70
    new-instance v4, Lcom/google/android/gms/common/ConnectionResult;

    .line 71
    .line 72
    iget v6, p1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 73
    .line 74
    sget v0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 75
    .line 76
    new-instance v0, Landroid/content/Intent;

    .line 77
    .line 78
    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 79
    .line 80
    invoke-direct {v0, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    const-string v5, "pending_intent"

    .line 84
    .line 85
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const-string v2, "failing_client_id"

    .line 89
    .line 90
    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    const-string p2, "notify_manager"

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-virtual {v0, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    sget p2, La/iaw0;->a:I

    .line 100
    .line 101
    const/high16 v5, 0x8000000

    .line 102
    .line 103
    or-int/2addr p2, v5

    .line 104
    invoke-static {p0, v3, v0, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    iget-object v8, p1, Lcom/google/android/gms/common/ConnectionResult;->d:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v9, p1, Lcom/google/android/gms/common/ConnectionResult;->e:Ljava/lang/Integer;

    .line 111
    .line 112
    const/4 v5, 0x1

    .line 113
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/ConnectionResult;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p0, v4}, La/oav;->g(Landroid/content/Context;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 117
    .line 118
    .line 119
    return v2

    .line 120
    :cond_4
    :goto_1
    return v3

    .line 121
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, La/sav;->g(Lcom/google/android/gms/common/ConnectionResult;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, La/sav;->m:La/jaw0;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 14

    .line 1
    sget-object v0, La/mmx;->n:La/yzn0;

    .line 2
    .line 3
    iget v1, p1, Landroid/os/Message;->what:I

    .line 4
    .line 5
    sget-object v2, La/mwp0;->b:La/mwp0;

    .line 6
    .line 7
    iget-object v3, p0, La/sav;->e:Landroid/content/Context;

    .line 8
    .line 9
    const-wide/32 v4, 0x493e0

    .line 10
    .line 11
    .line 12
    const-string v6, "GoogleApiManager"

    .line 13
    .line 14
    const/16 v7, 0x11

    .line 15
    .line 16
    iget-object v8, p0, La/sav;->m:La/jaw0;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x1

    .line 21
    iget-object v12, p0, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x14

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const-string p0, "Unknown message id: "

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v6, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    return v9

    .line 57
    :pswitch_0
    iput-boolean v9, p0, La/sav;->b:Z

    .line 58
    .line 59
    return v11

    .line 60
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, La/l9w0;

    .line 63
    .line 64
    iget-wide v4, p1, La/l9w0;->c:J

    .line 65
    .line 66
    iget-object v1, p1, La/l9w0;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 67
    .line 68
    iget v6, p1, La/l9w0;->b:I

    .line 69
    .line 70
    const-wide/16 v12, 0x0

    .line 71
    .line 72
    cmp-long v9, v4, v12

    .line 73
    .line 74
    if-nez v9, :cond_1

    .line 75
    .line 76
    new-instance p1, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 77
    .line 78
    filled-new-array {v1}, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p1, v6, v1}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/sav;->d:La/mmx;

    .line 90
    .line 91
    if-nez v1, :cond_0

    .line 92
    .line 93
    new-instance v1, La/mmx;

    .line 94
    .line 95
    sget-object v4, La/mav;->c:La/mav;

    .line 96
    .line 97
    invoke-direct {v1, v3, v0, v2, v4}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, La/sav;->d:La/mmx;

    .line 101
    .line 102
    :cond_0
    invoke-virtual {v1, p1}, La/mmx;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    return v11

    .line 106
    :cond_1
    iget-object v9, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 107
    .line 108
    if-eqz v9, :cond_8

    .line 109
    .line 110
    iget-object v12, v9, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 111
    .line 112
    iget v9, v9, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 113
    .line 114
    if-ne v9, v6, :cond_4

    .line 115
    .line 116
    if-eqz v12, :cond_2

    .line 117
    .line 118
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    iget p1, p1, La/l9w0;->d:I

    .line 123
    .line 124
    if-lt v9, p1, :cond_2

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    iget-object p1, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 128
    .line 129
    iget-object v0, p1, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 130
    .line 131
    if-nez v0, :cond_3

    .line 132
    .line 133
    new-instance v0, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v0, p1, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 139
    .line 140
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    :goto_0
    invoke-virtual {v8, v7}, Landroid/os/Handler;->removeMessages(I)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 148
    .line 149
    if-eqz p1, :cond_8

    .line 150
    .line 151
    iget v9, p1, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 152
    .line 153
    if-gtz v9, :cond_5

    .line 154
    .line 155
    invoke-virtual {p0}, La/sav;->f()Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_7

    .line 160
    .line 161
    :cond_5
    iget-object v9, p0, La/sav;->d:La/mmx;

    .line 162
    .line 163
    if-nez v9, :cond_6

    .line 164
    .line 165
    new-instance v9, La/mmx;

    .line 166
    .line 167
    sget-object v12, La/mav;->c:La/mav;

    .line 168
    .line 169
    invoke-direct {v9, v3, v0, v2, v12}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 170
    .line 171
    .line 172
    iput-object v9, p0, La/sav;->d:La/mmx;

    .line 173
    .line 174
    :cond_6
    invoke-virtual {v9, p1}, La/mmx;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 175
    .line 176
    .line 177
    :cond_7
    iput-object v10, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 178
    .line 179
    :cond_8
    :goto_1
    iget-object p1, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 180
    .line 181
    if-nez p1, :cond_24

    .line 182
    .line 183
    new-instance p1, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    new-instance v0, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 192
    .line 193
    invoke-direct {v0, v6, p1}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 194
    .line 195
    .line 196
    iput-object v0, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 197
    .line 198
    invoke-virtual {v8, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {v8, p0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 203
    .line 204
    .line 205
    return v11

    .line 206
    :pswitch_2
    iget-object p1, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 207
    .line 208
    if-eqz p1, :cond_24

    .line 209
    .line 210
    iget v1, p1, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 211
    .line 212
    if-gtz v1, :cond_9

    .line 213
    .line 214
    invoke-virtual {p0}, La/sav;->f()Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_b

    .line 219
    .line 220
    :cond_9
    iget-object v1, p0, La/sav;->d:La/mmx;

    .line 221
    .line 222
    if-nez v1, :cond_a

    .line 223
    .line 224
    new-instance v1, La/mmx;

    .line 225
    .line 226
    sget-object v4, La/mav;->c:La/mav;

    .line 227
    .line 228
    invoke-direct {v1, v3, v0, v2, v4}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 229
    .line 230
    .line 231
    iput-object v1, p0, La/sav;->d:La/mmx;

    .line 232
    .line 233
    :cond_a
    invoke-virtual {v1, p1}, La/mmx;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 234
    .line 235
    .line 236
    :cond_b
    iput-object v10, p0, La/sav;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 237
    .line 238
    return v11

    .line 239
    :pswitch_3
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, La/i9w0;

    .line 242
    .line 243
    iget-object p1, p0, La/i9w0;->a:La/ua3;

    .line 244
    .line 245
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_24

    .line 250
    .line 251
    iget-object p1, p0, La/i9w0;->a:La/ua3;

    .line 252
    .line 253
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, La/h9w0;

    .line 258
    .line 259
    iget-object v0, p1, La/h9w0;->o:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_24

    .line 266
    .line 267
    iget-object v0, p1, La/h9w0;->r:La/sav;

    .line 268
    .line 269
    iget-object v1, v0, La/sav;->m:La/jaw0;

    .line 270
    .line 271
    const/16 v2, 0xf

    .line 272
    .line 273
    invoke-virtual {v1, v2, p0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    iget-object v0, v0, La/sav;->m:La/jaw0;

    .line 277
    .line 278
    const/16 v1, 0x10

    .line 279
    .line 280
    invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget-object p0, p0, La/i9w0;->b:Lcom/google/android/gms/common/Feature;

    .line 284
    .line 285
    iget-object v0, p1, La/h9w0;->a:Ljava/util/LinkedList;

    .line 286
    .line 287
    new-instance v1, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_e

    .line 305
    .line 306
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, La/caw0;

    .line 311
    .line 312
    instance-of v4, v3, La/n9w0;

    .line 313
    .line 314
    if-eqz v4, :cond_c

    .line 315
    .line 316
    move-object v4, v3

    .line 317
    check-cast v4, La/n9w0;

    .line 318
    .line 319
    invoke-virtual {v4, p1}, La/n9w0;->f(La/h9w0;)[Lcom/google/android/gms/common/Feature;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    if-eqz v4, :cond_c

    .line 324
    .line 325
    array-length v5, v4

    .line 326
    move v6, v9

    .line 327
    :goto_3
    if-ge v6, v5, :cond_c

    .line 328
    .line 329
    aget-object v7, v4, v6

    .line 330
    .line 331
    invoke-static {v7, p0}, La/l8x;->Z(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    if-eqz v7, :cond_d

    .line 336
    .line 337
    if-ltz v6, :cond_c

    .line 338
    .line 339
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    :goto_4
    if-ge v9, p1, :cond_24

    .line 351
    .line 352
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    check-cast v2, La/caw0;

    .line 357
    .line 358
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    new-instance v3, La/qft0;

    .line 362
    .line 363
    invoke-direct {v3, p0}, La/qft0;-><init>(Lcom/google/android/gms/common/Feature;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v3}, La/caw0;->b(Ljava/lang/Exception;)V

    .line 367
    .line 368
    .line 369
    add-int/lit8 v9, v9, 0x1

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :pswitch_4
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast p0, La/i9w0;

    .line 375
    .line 376
    iget-object p1, p0, La/i9w0;->a:La/ua3;

    .line 377
    .line 378
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-eqz p1, :cond_24

    .line 383
    .line 384
    iget-object p1, p0, La/i9w0;->a:La/ua3;

    .line 385
    .line 386
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    check-cast p1, La/h9w0;

    .line 391
    .line 392
    iget-object v0, p1, La/h9w0;->o:Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    if-nez p0, :cond_f

    .line 399
    .line 400
    goto/16 :goto_f

    .line 401
    .line 402
    :cond_f
    iget-boolean p0, p1, La/h9w0;->n:Z

    .line 403
    .line 404
    if-nez p0, :cond_24

    .line 405
    .line 406
    iget-object p0, p1, La/h9w0;->b:La/b9v;

    .line 407
    .line 408
    check-cast p0, La/hz5;

    .line 409
    .line 410
    invoke-virtual {p0}, La/hz5;->p()Z

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    if-nez p0, :cond_10

    .line 415
    .line 416
    invoke-virtual {p1}, La/h9w0;->p()V

    .line 417
    .line 418
    .line 419
    return v11

    .line 420
    :cond_10
    invoke-virtual {p1}, La/h9w0;->e()V

    .line 421
    .line 422
    .line 423
    return v11

    .line 424
    :pswitch_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static {p0}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    throw p0

    .line 431
    :pswitch_6
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 432
    .line 433
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    if-eqz p0, :cond_24

    .line 438
    .line 439
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    check-cast p0, La/h9w0;

    .line 446
    .line 447
    iget-object p1, p0, La/h9w0;->r:La/sav;

    .line 448
    .line 449
    iget-object p1, p1, La/sav;->m:La/jaw0;

    .line 450
    .line 451
    invoke-static {p1}, La/s0x;->D(Landroid/os/Handler;)V

    .line 452
    .line 453
    .line 454
    iget-object p1, p0, La/h9w0;->b:La/b9v;

    .line 455
    .line 456
    move-object v0, p1

    .line 457
    check-cast v0, La/hz5;

    .line 458
    .line 459
    invoke-virtual {v0}, La/hz5;->p()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_13

    .line 464
    .line 465
    iget-object v0, p0, La/h9w0;->f:Ljava/util/HashMap;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-eqz v0, :cond_13

    .line 472
    .line 473
    iget-object v0, p0, La/h9w0;->d:La/fuj0;

    .line 474
    .line 475
    iget-object v1, v0, La/fuj0;->a:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v1, Ljava/util/Map;

    .line 478
    .line 479
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-eqz v1, :cond_12

    .line 484
    .line 485
    iget-object v0, v0, La/fuj0;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Ljava/util/Map;

    .line 488
    .line 489
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-nez v0, :cond_11

    .line 494
    .line 495
    goto :goto_5

    .line 496
    :cond_11
    const-string p0, "Timing out service connection."

    .line 497
    .line 498
    check-cast p1, La/hz5;

    .line 499
    .line 500
    invoke-virtual {p1, p0}, La/hz5;->d(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return v11

    .line 504
    :cond_12
    :goto_5
    invoke-virtual {p0}, La/h9w0;->i()V

    .line 505
    .line 506
    .line 507
    :cond_13
    return v11

    .line 508
    :pswitch_7
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 509
    .line 510
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result p0

    .line 514
    if-eqz p0, :cond_24

    .line 515
    .line 516
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 517
    .line 518
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    check-cast p0, La/h9w0;

    .line 523
    .line 524
    iget-object p1, p0, La/h9w0;->r:La/sav;

    .line 525
    .line 526
    iget-object v0, p1, La/sav;->m:La/jaw0;

    .line 527
    .line 528
    invoke-static {v0}, La/s0x;->D(Landroid/os/Handler;)V

    .line 529
    .line 530
    .line 531
    iget-boolean v0, p0, La/h9w0;->n:Z

    .line 532
    .line 533
    if-eqz v0, :cond_24

    .line 534
    .line 535
    if-eqz v0, :cond_14

    .line 536
    .line 537
    iget-object v0, p0, La/h9w0;->r:La/sav;

    .line 538
    .line 539
    iget-object v1, p0, La/h9w0;->c:La/ua3;

    .line 540
    .line 541
    iget-object v2, v0, La/sav;->m:La/jaw0;

    .line 542
    .line 543
    const/16 v3, 0xb

    .line 544
    .line 545
    invoke-virtual {v2, v3, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    iget-object v0, v0, La/sav;->m:La/jaw0;

    .line 549
    .line 550
    const/16 v2, 0x9

    .line 551
    .line 552
    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    iput-boolean v9, p0, La/h9w0;->n:Z

    .line 556
    .line 557
    :cond_14
    iget-object v0, p1, La/sav;->e:Landroid/content/Context;

    .line 558
    .line 559
    iget-object p1, p1, La/sav;->f:La/oav;

    .line 560
    .line 561
    sget v1, La/pav;->a:I

    .line 562
    .line 563
    invoke-virtual {p1, v0, v1}, La/pav;->c(Landroid/content/Context;I)I

    .line 564
    .line 565
    .line 566
    move-result p1

    .line 567
    const/16 v0, 0x12

    .line 568
    .line 569
    if-ne p1, v0, :cond_15

    .line 570
    .line 571
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 572
    .line 573
    const/16 v0, 0x15

    .line 574
    .line 575
    const-string v1, "Connection timed out waiting for Google Play services update to complete."

    .line 576
    .line 577
    invoke-direct {p1, v0, v1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 578
    .line 579
    .line 580
    goto :goto_6

    .line 581
    :cond_15
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 582
    .line 583
    const/16 v0, 0x16

    .line 584
    .line 585
    const-string v1, "API failed to connect while resuming due to an unknown error."

    .line 586
    .line 587
    invoke-direct {p1, v0, v1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 588
    .line 589
    .line 590
    :goto_6
    invoke-virtual {p0, p1}, La/h9w0;->h(Lcom/google/android/gms/common/api/Status;)V

    .line 591
    .line 592
    .line 593
    iget-object p0, p0, La/h9w0;->b:La/b9v;

    .line 594
    .line 595
    const-string p1, "Timing out connection while resuming."

    .line 596
    .line 597
    check-cast p0, La/hz5;

    .line 598
    .line 599
    invoke-virtual {p0, p1}, La/hz5;->d(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return v11

    .line 603
    :pswitch_8
    iget-object p0, p0, La/sav;->l:La/lx3;

    .line 604
    .line 605
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    new-instance p1, La/bx3;

    .line 609
    .line 610
    invoke-direct {p1, p0}, La/bx3;-><init>(La/lx3;)V

    .line 611
    .line 612
    .line 613
    :cond_16
    :goto_7
    invoke-virtual {p1}, La/bx3;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-eqz v0, :cond_17

    .line 618
    .line 619
    invoke-virtual {p1}, La/bx3;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, La/ua3;

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v0, La/h9w0;

    .line 630
    .line 631
    if-eqz v0, :cond_16

    .line 632
    .line 633
    invoke-virtual {v0}, La/h9w0;->o()V

    .line 634
    .line 635
    .line 636
    goto :goto_7

    .line 637
    :cond_17
    invoke-virtual {p0}, La/lx3;->clear()V

    .line 638
    .line 639
    .line 640
    return v11

    .line 641
    :pswitch_9
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 642
    .line 643
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result p0

    .line 647
    if-eqz p0, :cond_24

    .line 648
    .line 649
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 650
    .line 651
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    check-cast p0, La/h9w0;

    .line 656
    .line 657
    iget-object p1, p0, La/h9w0;->r:La/sav;

    .line 658
    .line 659
    iget-object p1, p1, La/sav;->m:La/jaw0;

    .line 660
    .line 661
    invoke-static {p1}, La/s0x;->D(Landroid/os/Handler;)V

    .line 662
    .line 663
    .line 664
    iget-boolean p1, p0, La/h9w0;->n:Z

    .line 665
    .line 666
    if-eqz p1, :cond_24

    .line 667
    .line 668
    invoke-virtual {p0}, La/h9w0;->p()V

    .line 669
    .line 670
    .line 671
    return v11

    .line 672
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast p1, La/nav;

    .line 675
    .line 676
    invoke-virtual {p0, p1}, La/sav;->b(La/nav;)La/h9w0;

    .line 677
    .line 678
    .line 679
    return v11

    .line 680
    :pswitch_b
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    instance-of p1, p1, Landroid/app/Application;

    .line 685
    .line 686
    if-eqz p1, :cond_24

    .line 687
    .line 688
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    check-cast p1, Landroid/app/Application;

    .line 693
    .line 694
    invoke-static {p1}, La/fc5;->b(Landroid/app/Application;)V

    .line 695
    .line 696
    .line 697
    sget-object p1, La/fc5;->e:La/fc5;

    .line 698
    .line 699
    new-instance v0, La/g9w0;

    .line 700
    .line 701
    invoke-direct {v0, p0, v9}, La/g9w0;-><init>(Ljava/lang/Object;B)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {p1, v0}, La/fc5;->a(La/ec5;)V

    .line 705
    .line 706
    .line 707
    iget-object v0, p1, La/fc5;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 708
    .line 709
    iget-object p1, p1, La/fc5;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 710
    .line 711
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    if-nez v1, :cond_1c

    .line 716
    .line 717
    sget-object v1, La/p7x;->f:Ljava/lang/Boolean;

    .line 718
    .line 719
    if-nez v1, :cond_1a

    .line 720
    .line 721
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 722
    .line 723
    const/16 v2, 0x1c

    .line 724
    .line 725
    if-lt v1, v2, :cond_18

    .line 726
    .line 727
    invoke-static {}, La/uvk;->m()Z

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    goto :goto_8

    .line 736
    :cond_18
    :try_start_0
    const-class v1, Landroid/os/Process;

    .line 737
    .line 738
    const-string v2, "isIsolated"

    .line 739
    .line 740
    invoke-virtual {v1, v2, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-virtual {v1, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    new-array v2, v9, [Ljava/lang/Object;

    .line 749
    .line 750
    const-string v3, "expected a non-null reference"

    .line 751
    .line 752
    if-eqz v1, :cond_19

    .line 753
    .line 754
    check-cast v1, Ljava/lang/Boolean;

    .line 755
    .line 756
    goto :goto_8

    .line 757
    :cond_19
    new-instance v1, La/tiu0;

    .line 758
    .line 759
    invoke-static {v3, v2}, La/qem0;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/4 v3, 0x6

    .line 764
    invoke-direct {v1, v2, v3}, La/tiu0;-><init>(Ljava/lang/String;B)V

    .line 765
    .line 766
    .line 767
    throw v1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 768
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 769
    .line 770
    :goto_8
    sput-object v1, La/p7x;->f:Ljava/lang/Boolean;

    .line 771
    .line 772
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-nez v1, :cond_1b

    .line 777
    .line 778
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 779
    .line 780
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 781
    .line 782
    .line 783
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {p1, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 787
    .line 788
    .line 789
    move-result p1

    .line 790
    if-nez p1, :cond_1c

    .line 791
    .line 792
    iget p1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 793
    .line 794
    const/16 v1, 0x64

    .line 795
    .line 796
    if-le p1, v1, :cond_1c

    .line 797
    .line 798
    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 799
    .line 800
    .line 801
    goto :goto_9

    .line 802
    :cond_1b
    move p1, v11

    .line 803
    goto :goto_a

    .line 804
    :cond_1c
    :goto_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 805
    .line 806
    .line 807
    move-result p1

    .line 808
    :goto_a
    if-nez p1, :cond_24

    .line 809
    .line 810
    iput-wide v4, p0, La/sav;->a:J

    .line 811
    .line 812
    goto/16 :goto_f

    .line 813
    .line 814
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 815
    .line 816
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 819
    .line 820
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    :cond_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    if-eqz v2, :cond_1e

    .line 833
    .line 834
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    check-cast v2, La/h9w0;

    .line 839
    .line 840
    iget v3, v2, La/h9w0;->l:I

    .line 841
    .line 842
    if-ne v3, v0, :cond_1d

    .line 843
    .line 844
    goto :goto_b

    .line 845
    :cond_1e
    move-object v2, v10

    .line 846
    :goto_b
    if-eqz v2, :cond_20

    .line 847
    .line 848
    iget v0, p1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 849
    .line 850
    const/16 v1, 0xd

    .line 851
    .line 852
    if-ne v0, v1, :cond_1f

    .line 853
    .line 854
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 855
    .line 856
    iget-object p0, p0, La/sav;->f:La/oav;

    .line 857
    .line 858
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    sget-object p0, La/bbv;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 862
    .line 863
    invoke-static {v0}, Lcom/google/android/gms/common/ConnectionResult;->m(I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object p0

    .line 867
    iget-object p1, p1, Lcom/google/android/gms/common/ConnectionResult;->d:Ljava/lang/String;

    .line 868
    .line 869
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    add-int/lit8 v0, v0, 0x45

    .line 878
    .line 879
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    new-instance v4, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    add-int/2addr v0, v3

    .line 886
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 887
    .line 888
    .line 889
    const-string v0, "Error resolution was canceled by the user, original error message: "

    .line 890
    .line 891
    const-string v3, ": "

    .line 892
    .line 893
    invoke-static {v4, v0, p0, v3, p1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object p0

    .line 897
    invoke-direct {v1, v7, p0, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v2, v1}, La/h9w0;->h(Lcom/google/android/gms/common/api/Status;)V

    .line 901
    .line 902
    .line 903
    return v11

    .line 904
    :cond_1f
    iget-object p0, v2, La/h9w0;->c:La/ua3;

    .line 905
    .line 906
    invoke-static {p0, p1}, La/sav;->d(La/ua3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    .line 907
    .line 908
    .line 909
    move-result-object p0

    .line 910
    invoke-virtual {v2, p0}, La/h9w0;->h(Lcom/google/android/gms/common/api/Status;)V

    .line 911
    .line 912
    .line 913
    return v11

    .line 914
    :cond_20
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object p0

    .line 918
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 919
    .line 920
    .line 921
    move-result p0

    .line 922
    new-instance p1, Ljava/lang/StringBuilder;

    .line 923
    .line 924
    add-int/lit8 p0, p0, 0x41

    .line 925
    .line 926
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 927
    .line 928
    .line 929
    const-string p0, "Could not find API instance "

    .line 930
    .line 931
    const-string v1, " while trying to fail enqueued calls."

    .line 932
    .line 933
    invoke-static {p1, p0, v0, v1}, La/vqd;->p(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object p0

    .line 937
    new-instance p1, Ljava/lang/Exception;

    .line 938
    .line 939
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 940
    .line 941
    .line 942
    invoke-static {v6, p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 943
    .line 944
    .line 945
    return v11

    .line 946
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast p1, La/p9w0;

    .line 949
    .line 950
    iget-object v0, p1, La/p9w0;->c:La/nav;

    .line 951
    .line 952
    iget-object v1, p1, La/p9w0;->a:La/caw0;

    .line 953
    .line 954
    iget-object v2, v0, La/nav;->f:La/ua3;

    .line 955
    .line 956
    invoke-virtual {v12, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    check-cast v2, La/h9w0;

    .line 961
    .line 962
    if-nez v2, :cond_21

    .line 963
    .line 964
    invoke-virtual {p0, v0}, La/sav;->b(La/nav;)La/h9w0;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    :cond_21
    iget-object v0, v2, La/h9w0;->b:La/b9v;

    .line 969
    .line 970
    invoke-virtual {v0}, La/hz5;->r()Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    if-eqz v0, :cond_22

    .line 975
    .line 976
    iget-object p0, p0, La/sav;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 977
    .line 978
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 979
    .line 980
    .line 981
    move-result p0

    .line 982
    iget p1, p1, La/p9w0;->b:I

    .line 983
    .line 984
    if-eq p0, p1, :cond_22

    .line 985
    .line 986
    sget-object p0, La/sav;->o:Lcom/google/android/gms/common/api/Status;

    .line 987
    .line 988
    invoke-virtual {v1, p0}, La/caw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2}, La/h9w0;->o()V

    .line 992
    .line 993
    .line 994
    return v11

    .line 995
    :cond_22
    invoke-virtual {v2, v1}, La/h9w0;->n(La/caw0;)V

    .line 996
    .line 997
    .line 998
    return v11

    .line 999
    :pswitch_e
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p0

    .line 1003
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1004
    .line 1005
    .line 1006
    move-result-object p0

    .line 1007
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1008
    .line 1009
    .line 1010
    move-result p1

    .line 1011
    if-eqz p1, :cond_24

    .line 1012
    .line 1013
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object p1

    .line 1017
    check-cast p1, La/h9w0;

    .line 1018
    .line 1019
    iget-object v0, p1, La/h9w0;->r:La/sav;

    .line 1020
    .line 1021
    iget-object v0, v0, La/sav;->m:La/jaw0;

    .line 1022
    .line 1023
    invoke-static {v0}, La/s0x;->D(Landroid/os/Handler;)V

    .line 1024
    .line 1025
    .line 1026
    iput-object v10, p1, La/h9w0;->p:Lcom/google/android/gms/common/ConnectionResult;

    .line 1027
    .line 1028
    invoke-virtual {p1}, La/h9w0;->p()V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_c

    .line 1032
    :pswitch_f
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1033
    .line 1034
    invoke-static {p0}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p0

    .line 1038
    throw p0

    .line 1039
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast p1, Ljava/lang/Boolean;

    .line 1042
    .line 1043
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1044
    .line 1045
    .line 1046
    move-result p1

    .line 1047
    if-eq v11, p1, :cond_23

    .line 1048
    .line 1049
    goto :goto_d

    .line 1050
    :cond_23
    const-wide/16 v4, 0x2710

    .line 1051
    .line 1052
    :goto_d
    iput-wide v4, p0, La/sav;->a:J

    .line 1053
    .line 1054
    const/16 p1, 0xc

    .line 1055
    .line 1056
    invoke-virtual {v8, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v1

    .line 1071
    if-eqz v1, :cond_24

    .line 1072
    .line 1073
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    check-cast v1, La/ua3;

    .line 1078
    .line 1079
    invoke-virtual {v8, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    iget-wide v2, p0, La/sav;->a:J

    .line 1084
    .line 1085
    invoke-virtual {v8, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1086
    .line 1087
    .line 1088
    goto :goto_e

    .line 1089
    :cond_24
    :goto_f
    return v11

    .line 1090
    nop

    .line 1091
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
