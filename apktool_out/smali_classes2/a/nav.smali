.class public abstract La/nav;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:La/fvt0;

.field public final d:La/yzn0;

.field public final e:La/ea3;

.field public final f:La/ua3;

.field public final g:Landroid/os/Looper;

.field public final h:I

.field public final i:La/j9w0;

.field public final j:La/rek0;

.field public final k:La/sav;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/nav;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/16 v3, 0x1e

    .line 34
    .line 35
    if-lt v1, v3, :cond_0

    .line 36
    .line 37
    if-lt v1, v3, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, La/e7;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v3, v2

    .line 45
    :goto_0
    iput-object v3, p0, La/nav;->b:Ljava/lang/String;

    .line 46
    .line 47
    const/16 v4, 0x1f

    .line 48
    .line 49
    if-lt v1, v4, :cond_1

    .line 50
    .line 51
    new-instance v2, La/fvt0;

    .line 52
    .line 53
    invoke-static {p1}, La/isj;->b(Landroid/content/Context;)Landroid/content/AttributionSource;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v2, p1}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iput-object v2, p0, La/nav;->c:La/fvt0;

    .line 61
    .line 62
    iput-object p2, p0, La/nav;->d:La/yzn0;

    .line 63
    .line 64
    iput-object p3, p0, La/nav;->e:La/ea3;

    .line 65
    .line 66
    iget-object p1, p4, La/mav;->b:Landroid/os/Looper;

    .line 67
    .line 68
    iput-object p1, p0, La/nav;->g:Landroid/os/Looper;

    .line 69
    .line 70
    new-instance p1, La/ua3;

    .line 71
    .line 72
    invoke-direct {p1, p2, p3, v3}, La/ua3;-><init>(La/yzn0;La/ea3;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, La/nav;->f:La/ua3;

    .line 76
    .line 77
    new-instance p1, La/j9w0;

    .line 78
    .line 79
    invoke-direct {p1, p0}, La/j9w0;-><init>(La/nav;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, La/nav;->i:La/j9w0;

    .line 83
    .line 84
    invoke-static {v0}, La/sav;->e(Landroid/content/Context;)La/sav;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, La/nav;->k:La/sav;

    .line 89
    .line 90
    iget-object p2, p1, La/sav;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iput p2, p0, La/nav;->h:I

    .line 97
    .line 98
    iget-object p2, p4, La/mav;->a:La/rek0;

    .line 99
    .line 100
    iput-object p2, p0, La/nav;->j:La/rek0;

    .line 101
    .line 102
    iget-object p1, p1, La/sav;->m:La/jaw0;

    .line 103
    .line 104
    const/4 p2, 0x7

    .line 105
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 110
    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final a()La/es;
    .locals 4

    .line 1
    new-instance v0, La/es;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 7
    .line 8
    iget-object v2, v0, La/es;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/lx3;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, La/lx3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v3}, La/lx3;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v0, La/es;->a:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v2, v1}, La/lx3;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/nav;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v0, La/es;->c:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v0, La/es;->b:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0
.end method

.method public final b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/nav;->k:La/sav;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-char v2, p2, La/s9w0;->c:C

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2, p0}, La/sav;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;ILa/nav;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/aaw0;

    .line 17
    .line 18
    iget-object v3, p0, La/nav;->j:La/rek0;

    .line 19
    .line 20
    invoke-direct {v2, p1, p2, v0, v3}, La/aaw0;-><init>(ILa/s9w0;Lcom/google/android/gms/tasks/TaskCompletionSource;La/rek0;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v1, La/sav;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    new-instance p2, La/p9w0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p2, v2, p1, p0}, La/p9w0;-><init>(La/caw0;ILa/nav;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, v1, La/sav;->m:La/jaw0;

    .line 35
    .line 36
    const/4 p1, 0x4

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
