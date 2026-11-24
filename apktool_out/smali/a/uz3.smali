.class public final La/uz3;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public a:Ljava/util/concurrent/ArrayBlockingQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/uz3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, La/uz3;->a:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 14
    .line 15
    const-string v1, "AsyncLayoutInflator"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :goto_0
    const-string v0, "AsyncLayoutInflater"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, La/uz3;->a:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/ArrayBlockingQueue;->take()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :try_start_1
    throw p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 13
    :catch_0
    move-exception v1

    .line 14
    const-string v2, "Failed to inflate resource in the background! Retrying on the UI thread"

    .line 15
    .line 16
    invoke-static {v0, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    :cond_0
    :try_start_2
    new-instance v1, Ljava/lang/ClassCastException;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 26
    :catch_1
    move-exception v1

    .line 27
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    goto :goto_0
.end method
