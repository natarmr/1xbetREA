.class public final La/zsd;
.super La/obb;
.source "SourceFile"


# static fields
.field public static a:La/zsd;


# direct methods
.method public static declared-synchronized q0()La/zsd;
    .locals 2

    .line 1
    const-class v0, La/zsd;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/zsd;->a:La/zsd;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/zsd;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/zsd;->a:La/zsd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method


# virtual methods
.method public final a0()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.firebase.perf.ExperimentTTID"

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "experiment_app_start_ttid"

    .line 2
    .line 3
    return-object p0
.end method
