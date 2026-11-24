.class public final La/qw9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:La/qcq0;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/hardware/camera2/CameraManager;

.field public final d:La/sje;

.field public final e:La/x04;

.field public final f:La/p7m0;

.field public final g:La/xae0;

.field public final h:La/qoj0;

.field public final i:La/vae0;

.field public final j:La/bq9;

.field public final k:La/c4m0;


# direct methods
.method public constructor <init>(La/o5d0;La/qcq0;Ljava/lang/String;La/bby;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/qw9;->a:La/qcq0;

    .line 11
    .line 12
    iput-object p3, p0, La/qw9;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/hardware/camera2/CameraManager;

    .line 19
    .line 20
    iput-object p1, p0, La/qw9;->c:Landroid/hardware/camera2/CameraManager;

    .line 21
    .line 22
    new-instance p1, La/kin0;

    .line 23
    .line 24
    invoke-direct {p1, p4}, La/dby;-><init>(La/bby;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p2, La/qcq0;->h:La/lne;

    .line 28
    .line 29
    new-instance p3, La/rne;

    .line 30
    .line 31
    const-string p4, "CXCP-CameraStatusMonitor"

    .line 32
    .line 33
    invoke-direct {p3, p4}, La/rne;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/qw9;->d:La/sje;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-static {p2}, La/o2e;->X(Z)La/x04;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iput-object p3, p0, La/qw9;->e:La/x04;

    .line 56
    .line 57
    sget-object p3, La/c3a;->a:La/c3a;

    .line 58
    .line 59
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iput-object p3, p0, La/qw9;->f:La/p7m0;

    .line 64
    .line 65
    invoke-static {p3}, La/vtb;->N(La/qz40;)La/xae0;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    iput-object p3, p0, La/qw9;->g:La/xae0;

    .line 70
    .line 71
    const/4 p3, 0x7

    .line 72
    const/4 p4, 0x0

    .line 73
    invoke-static {p2, p2, p4, p3}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p0, La/qw9;->h:La/qoj0;

    .line 78
    .line 79
    invoke-static {p2}, La/vtb;->M(La/mz40;)La/vae0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object p2, p0, La/qw9;->i:La/vae0;

    .line 84
    .line 85
    new-instance p2, La/d09;

    .line 86
    .line 87
    const/16 p3, 0xd

    .line 88
    .line 89
    invoke-direct {p2, p0, p4, p3}, La/d09;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, La/nkb;->y(Lkotlin/jvm/functions/Function2;)La/bq9;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iput-object p2, p0, La/qw9;->j:La/bq9;

    .line 97
    .line 98
    new-instance p2, La/qv3;

    .line 99
    .line 100
    const/16 p3, 0x18

    .line 101
    .line 102
    invoke-direct {p2, p0, p4, p3}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    const/4 p3, 0x3

    .line 106
    invoke-static {p1, p4, p4, p2, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, La/qw9;->k:La/c4m0;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, La/qw9;->e:La/x04;

    .line 2
    .line 3
    invoke-virtual {v0}, La/x04;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/qw9;->k:La/c4m0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/qw9;->d:La/sje;

    .line 16
    .line 17
    invoke-static {p0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
