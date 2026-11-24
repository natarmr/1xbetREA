.class public final La/y1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/c2x0;La/r1x0;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/y1x0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/y1x0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p3, p0, La/y1x0;->b:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/y1x0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/o7x0;La/tsn;La/fr40;J)V
    .locals 0

    const/4 p1, 0x1

    iput-byte p1, p0, La/y1x0;->a:B

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/y1x0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/y1x0;->d:Ljava/lang/Object;

    iput-wide p4, p0, La/y1x0;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-byte v0, p0, La/y1x0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/y1x0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-wide v3, p0, La/y1x0;->b:J

    .line 7
    .line 8
    iget-object v5, p0, La/y1x0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, La/tsn;

    .line 14
    .line 15
    invoke-virtual {v5}, La/tsn;->run()V

    .line 16
    .line 17
    .line 18
    check-cast v2, La/fr40;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, La/trs0;

    .line 24
    .line 25
    invoke-static {p0, v1}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, La/trs0;-><init>(Ljava/util/concurrent/Callable;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, v2, La/fr40;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    invoke-interface {p0, v0, v3, v4, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v1, La/dr40;

    .line 41
    .line 42
    invoke-direct {v1, v0, p0}, La/dr40;-><init>(La/l2;Ljava/util/concurrent/ScheduledFuture;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/kfr;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-direct {p0, v1, v0}, La/kfr;-><init>(La/ig00;B)V

    .line 49
    .line 50
    .line 51
    sget-object v0, La/ank;->a:La/ank;

    .line 52
    .line 53
    invoke-virtual {v1, p0, v0}, La/dr40;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    check-cast v2, La/c2x0;

    .line 58
    .line 59
    check-cast v5, La/r1x0;

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {v2, v5, p0, v3, v4}, La/c2x0;->u1(La/r1x0;ZJ)V

    .line 63
    .line 64
    .line 65
    iput-object v1, v2, La/c2x0;->f:La/r1x0;

    .line 66
    .line 67
    iget-object p0, v2, La/p4;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/kxw0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/kxw0;->i()La/a4x0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/etw0;->n1()V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/lfr;

    .line 82
    .line 83
    invoke-direct {v0, p0, v1}, La/lfr;-><init>(La/a4x0;La/r1x0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
