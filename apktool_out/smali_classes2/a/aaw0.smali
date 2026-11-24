.class public final La/aaw0;
.super La/n9w0;
.source "SourceFile"


# instance fields
.field public final b:La/s9w0;

.field public final c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final d:La/rek0;


# direct methods
.method public constructor <init>(ILa/s9w0;Lcom/google/android/gms/tasks/TaskCompletionSource;La/rek0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/caw0;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/aaw0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    .line 6
    iput-object p2, p0, La/aaw0;->b:La/s9w0;

    .line 7
    .line 8
    iput-object p4, p0, La/aaw0;->d:La/rek0;

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    if-ne p1, p0, :cond_1

    .line 12
    .line 13
    iget-boolean p0, p2, La/s9w0;->b:Z

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/aaw0;->d:La/rek0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->c:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/lsf0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, La/qa3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, La/qa3;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/qa3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p0, p0, La/aaw0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/aaw0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(La/fuj0;Z)V
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p1, La/fuj0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    iget-object p0, p0, La/aaw0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 10
    .line 11
    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance v0, La/afm0;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, La/afm0;-><init>(La/fuj0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final d(La/h9w0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/aaw0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, La/aaw0;->b:La/s9w0;

    .line 4
    .line 5
    iget-object p1, p1, La/h9w0;->b:La/b9v;

    .line 6
    .line 7
    iget-object v1, v1, La/s9w0;->d:La/euo0;

    .line 8
    .line 9
    iget-object v1, v1, La/euo0;->a:La/mff0;

    .line 10
    .line 11
    invoke-interface {v1, p1, v0}, La/mff0;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :catch_1
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :goto_0
    invoke-virtual {v0, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :goto_1
    invoke-static {p1}, La/caw0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, La/aaw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_2
    move-exception p0

    .line 32
    throw p0
.end method

.method public final f(La/h9w0;)[Lcom/google/android/gms/common/Feature;
    .locals 0

    .line 1
    iget-object p0, p0, La/aaw0;->b:La/s9w0;

    .line 2
    .line 3
    iget-object p0, p0, La/s9w0;->a:[Lcom/google/android/gms/common/Feature;

    .line 4
    .line 5
    return-object p0
.end method

.method public final g(La/h9w0;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/aaw0;->b:La/s9w0;

    .line 2
    .line 3
    iget-boolean p0, p0, La/s9w0;->b:Z

    .line 4
    .line 5
    return p0
.end method

.method public final h(La/h9w0;)I
    .locals 0

    .line 1
    iget-object p0, p0, La/aaw0;->b:La/s9w0;

    .line 2
    .line 3
    iget-char p0, p0, La/s9w0;->c:C

    .line 4
    .line 5
    return p0
.end method
