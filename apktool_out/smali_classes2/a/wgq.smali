.class public final synthetic La/wgq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:La/xgq;


# direct methods
.method public synthetic constructor <init>(La/xgq;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wgq;->a:La/xgq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    check-cast p1, Ljava/lang/Void;

    .line 147
    iget-object p0, p0, La/wgq;->a:La/xgq;

    iget-object p1, p0, La/xgq;->c:La/krd;

    invoke-virtual {p1}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 148
    iget-object v0, p0, La/xgq;->d:La/krd;

    invoke-virtual {v0}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 149
    filled-new-array {p1, v0}, [Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    iget-object v2, p0, La/xgq;->b:Ljava/util/concurrent/Executor;

    new-instance v3, La/hi;

    const/4 v4, 0x7

    invoke-direct {v3, p0, p1, v0, v4}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 150
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, La/wgq;->a:La/xgq;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, La/xgq;->c:La/krd;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, v0, La/krd;->c:Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    iget-object v2, v0, La/krd;->b:La/nsd;

    .line 25
    .line 26
    monitor-enter v2

    .line 27
    :try_start_1
    iget-object v0, v2, La/nsd;->a:Landroid/content/Context;

    .line 28
    .line 29
    iget-object v3, v2, La/nsd;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v2

    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, La/mrd;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object v0, p1, La/mrd;->d:Lorg/json/JSONArray;

    .line 44
    .line 45
    const-string v2, "FirebaseRemoteConfig"

    .line 46
    .line 47
    iget-object v3, p0, La/xgq;->a:La/gfq;

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    :try_start_2
    invoke-static {v0}, La/xgq;->d(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v3, v0}, La/gfq;->c(Ljava/util/ArrayList;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch La/d6; {:try_start_2 .. :try_end_2} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_0

    .line 62
    :catch_1
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :goto_0
    const-string v3, "Could not update ABT experiments."

    .line 65
    .line 66
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_1
    const-string v3, "Could not parse ABT experiments from the JSON response."

    .line 71
    .line 72
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    :goto_2
    iget-object p0, p0, La/xgq;->i:La/n660;

    .line 76
    .line 77
    :try_start_3
    iget-object v0, p0, La/n660;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/j910;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, La/j910;->h(La/mrd;)La/x45;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, La/n660;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Ljava/util/Set;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, La/p8f;

    .line 104
    .line 105
    iget-object v3, p0, La/n660;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 108
    .line 109
    new-instance v4, La/kdg0;

    .line 110
    .line 111
    invoke-direct {v4, v2, p1, v1}, La/kdg0;-><init>(La/p8f;La/x45;B)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch La/zgq; {:try_start_3 .. :try_end_3} :catch_2

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catch_2
    move-exception p0

    .line 119
    const-string p1, "FirebaseRemoteConfig"

    .line 120
    .line 121
    const-string v0, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes."

    .line 122
    .line 123
    invoke-static {p1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_1
    const-string p0, "FirebaseRemoteConfig"

    .line 128
    .line 129
    const-string p1, "Activated configs written to disk are null."

    .line 130
    .line 131
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_2
    :goto_4
    const/4 v1, 0x1

    .line 135
    goto :goto_5

    .line 136
    :catchall_0
    move-exception p0

    .line 137
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    throw p0

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 141
    throw p0

    .line 142
    :cond_3
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
.end method
