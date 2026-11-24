.class public final La/es3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qvj;


# instance fields
.field public final synthetic a:Lorg/platform/app/ApplicationLoader;


# direct methods
.method public constructor <init>(Lorg/platform/app/ApplicationLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/es3;->a:Lorg/platform/app/ApplicationLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onStart(La/clz;)V
    .locals 7

    .line 1
    iget-object p0, p0, La/es3;->a:Lorg/platform/app/ApplicationLoader;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->y:La/z7z;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/o1w0;

    .line 13
    .line 14
    iget-object v0, p0, La/o1w0;->e:La/mne;

    .line 15
    .line 16
    iget-object v1, p0, La/o1w0;->f:La/sje;

    .line 17
    .line 18
    iget-object v2, p0, La/o1w0;->h:La/c4m0;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, La/pby;->isActive()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v2, p0, La/o1w0;->a:La/jqt;

    .line 31
    .line 32
    invoke-virtual {v2}, La/jqt;->a()La/h2c;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v4, La/l1w0;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct {v4, p0, p1, v5}, La/l1w0;-><init>(La/o1w0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/fnq;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    invoke-direct {v5, v2, v4, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 46
    .line 47
    .line 48
    sget-object v2, La/m1w0;->h:La/m1w0;

    .line 49
    .line 50
    iget-object v4, v0, La/mne;->a:La/rwj;

    .line 51
    .line 52
    invoke-static {v1, v4}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v5, v4, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, p0, La/o1w0;->h:La/c4m0;

    .line 61
    .line 62
    :goto_0
    iget-object v2, p0, La/o1w0;->i:La/bby;

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v3, :cond_1

    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    sget-object v2, La/n1w0;->a:La/n1w0;

    .line 74
    .line 75
    iget-object v4, v0, La/mne;->b:La/dvj;

    .line 76
    .line 77
    new-instance v5, La/l1w0;

    .line 78
    .line 79
    invoke-direct {v5, p0, p1, v3}, La/l1w0;-><init>(La/o1w0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v6, 0xa

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, La/o1w0;->i:La/bby;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    const-string p0, "authObserver"

    .line 93
    .line 94
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method

.method public final onStop(La/clz;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/es3;->a:Lorg/platform/app/ApplicationLoader;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->y:La/z7z;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/o1w0;

    .line 12
    .line 13
    iget-object p1, p0, La/o1w0;->h:La/c4m0;

    .line 14
    .line 15
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/o1w0;->i:La/bby;

    .line 19
    .line 20
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "authObserver"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method
