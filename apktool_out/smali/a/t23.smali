.class public final La/t23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qq40;


# instance fields
.field public final a:Landroid/view/Choreographer;

.field public final b:La/r23;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;La/r23;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t23;->a:Landroid/view/Choreographer;

    .line 5
    .line 6
    iput-object p2, p0, La/t23;->b:La/r23;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/t23;->b:La/r23;

    .line 2
    .line 3
    new-instance v1, La/n5a;

    .line 4
    .line 5
    invoke-static {p2}, La/pnx;->b(La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v2, p2}, La/n5a;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, La/n5a;->r()V

    .line 14
    .line 15
    .line 16
    new-instance p2, La/s23;

    .line 17
    .line 18
    invoke-direct {p2, v1, p0, p1}, La/s23;-><init>(La/n5a;La/t23;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, La/r23;->c:Landroid/view/Choreographer;

    .line 22
    .line 23
    iget-object v3, p0, La/t23;->a:Landroid/view/Choreographer;

    .line 24
    .line 25
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p0, v0, La/r23;->e:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter p0

    .line 34
    :try_start_0
    iget-object p1, v0, La/r23;->g:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-boolean p1, v0, La/r23;->j:Z

    .line 40
    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    iput-boolean v2, v0, La/r23;->j:Z

    .line 44
    .line 45
    iget-object p1, v0, La/r23;->c:Landroid/view/Choreographer;

    .line 46
    .line 47
    iget-object v2, v0, La/r23;->k:La/q23;

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit p0

    .line 56
    new-instance p0, La/ci2;

    .line 57
    .line 58
    const/16 p1, 0xc

    .line 59
    .line 60
    invoke-direct {p0, v0, p2, p1}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p0}, La/n5a;->t(Lkotlin/jvm/functions/Function1;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :goto_1
    monitor-exit p0

    .line 68
    throw p1

    .line 69
    :cond_1
    iget-object p1, p0, La/t23;->a:Landroid/view/Choreographer;

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, La/ci2;

    .line 75
    .line 76
    const/16 v0, 0xd

    .line 77
    .line 78
    invoke-direct {p1, p0, p2, v0}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1}, La/n5a;->t(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {v1}, La/n5a;->p()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p1, La/wne;->a:La/wne;

    .line 89
    .line 90
    return-object p0
.end method

.method public final fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->a(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final minusKey(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->b(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
