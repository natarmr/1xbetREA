.class public final La/qcq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vne;

.field public final b:La/vne;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:La/lne;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:La/lne;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:La/lne;

.field public final i:La/n0o0;

.field public final j:La/n0o0;


# direct methods
.method public constructor <init>(La/vne;La/vne;Ljava/util/concurrent/Executor;La/lne;Ljava/util/concurrent/Executor;La/lne;Ljava/util/concurrent/Executor;La/lne;Lkotlin/jvm/functions/Function0;La/yip0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/qcq0;->a:La/vne;

    .line 20
    .line 21
    iput-object p2, p0, La/qcq0;->b:La/vne;

    .line 22
    .line 23
    iput-object p3, p0, La/qcq0;->c:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    iput-object p4, p0, La/qcq0;->d:La/lne;

    .line 26
    .line 27
    iput-object p5, p0, La/qcq0;->e:Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    iput-object p6, p0, La/qcq0;->f:La/lne;

    .line 30
    .line 31
    iput-object p7, p0, La/qcq0;->g:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    iput-object p8, p0, La/qcq0;->h:La/lne;

    .line 34
    .line 35
    new-instance p1, La/xhl0;

    .line 36
    .line 37
    const/16 p2, 0xc

    .line 38
    .line 39
    invoke-direct {p1, p9, p2}, La/xhl0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/qcq0;->i:La/n0o0;

    .line 47
    .line 48
    new-instance p1, La/h3q0;

    .line 49
    .line 50
    const/16 p2, 0xa

    .line 51
    .line 52
    invoke-direct {p1, p10, p2}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/qcq0;->j:La/n0o0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, La/qcq0;->i:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, La/qcq0;->d:La/lne;

    .line 2
    .line 3
    new-instance v1, La/pcq0;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-wide v4, p1

    .line 8
    move-object v3, p3

    .line 9
    invoke-direct/range {v1 .. v6}, La/pcq0;-><init>(La/qcq0;Lkotlin/jvm/functions/Function1;JLa/yje;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, La/eeq;->U(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    move-object p0, v0

    .line 19
    const-string p1, "CXCP"

    .line 20
    .line 21
    const-string p2, "runBlockingCheckedOrNull cancelled by thread interruption"

    .line 22
    .line 23
    invoke-static {p1, p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method
