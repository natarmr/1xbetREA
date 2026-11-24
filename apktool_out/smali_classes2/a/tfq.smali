.class public final La/tfq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j8f;


# direct methods
.method public constructor <init>(La/j8f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tfq;->a:La/j8f;

    .line 5
    .line 6
    return-void
.end method

.method public static a()La/tfq;
    .locals 2

    .line 1
    invoke-static {}, La/nfq;->d()La/nfq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, La/tfq;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/tfq;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, "FirebaseCrashlytics component is not present."

    .line 17
    .line 18
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p0, p0, La/tfq;->a:La/j8f;

    .line 6
    .line 7
    iget-wide v2, p0, La/j8f;->d:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    iget-object v2, p0, La/j8f;->o:La/cu;

    .line 11
    .line 12
    iget-object v2, v2, La/cu;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/aaf;

    .line 15
    .line 16
    new-instance v3, La/h8f;

    .line 17
    .line 18
    invoke-direct {v3, p0, v0, v1, p1}, La/h8f;-><init>(La/j8f;JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, La/aaf;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    const-string p1, "FirebaseCrashlytics"

    .line 5
    .line 6
    const-string v0, "A null value was passed to recordException. Ignoring."

    .line 7
    .line 8
    invoke-static {p1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 13
    .line 14
    iget-object p0, p0, La/tfq;->a:La/j8f;

    .line 15
    .line 16
    iget-object v0, p0, La/j8f;->o:La/cu;

    .line 17
    .line 18
    iget-object v0, v0, La/cu;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/aaf;

    .line 21
    .line 22
    new-instance v1, La/b1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, La/b1;-><init>(La/j8f;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/tfq;->a:La/j8f;

    .line 2
    .line 3
    iget-object v0, p0, La/j8f;->o:La/cu;

    .line 4
    .line 5
    iget-object v0, v0, La/cu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/aaf;

    .line 8
    .line 9
    new-instance v1, La/b1;

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    return-void
.end method
