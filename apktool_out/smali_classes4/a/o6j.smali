.class public final La/o6j;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/v4v;

.field public final c:La/tru;

.field public final d:La/i1w0;

.field public final e:La/mne;

.field public final f:La/uyn;

.field public final g:La/duj;

.field public final h:La/c4m0;

.field public i:La/bby;

.field public final j:La/p7m0;

.field public final k:La/p7m0;


# direct methods
.method public constructor <init>(La/v4v;La/v4v;La/tru;La/i1w0;La/mne;La/uyn;La/m1e;La/duj;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/o6j;->b:La/v4v;

    .line 8
    .line 9
    iput-object p3, p0, La/o6j;->c:La/tru;

    .line 10
    .line 11
    iput-object p4, p0, La/o6j;->d:La/i1w0;

    .line 12
    .line 13
    iput-object p5, p0, La/o6j;->e:La/mne;

    .line 14
    .line 15
    iput-object p6, p0, La/o6j;->f:La/uyn;

    .line 16
    .line 17
    iput-object p8, p0, La/o6j;->g:La/duj;

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/o6j;->j:La/p7m0;

    .line 26
    .line 27
    sget-object p3, La/k6j;->a:La/k6j;

    .line 28
    .line 29
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, La/o6j;->k:La/p7m0;

    .line 34
    .line 35
    iget-object p3, p0, La/o6j;->h:La/c4m0;

    .line 36
    .line 37
    const/4 p4, 0x1

    .line 38
    const/4 p6, 0x0

    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    invoke-virtual {p3}, La/pby;->isActive()Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-ne p3, p4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {p7}, La/m1e;->b()La/gmq;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    new-instance p7, La/n6j;

    .line 53
    .line 54
    invoke-direct {p7, p0, p6, p4}, La/n6j;-><init>(La/o6j;La/yje;B)V

    .line 55
    .line 56
    .line 57
    new-instance p8, La/fnq;

    .line 58
    .line 59
    const/4 v0, 0x4

    .line 60
    invoke-direct {p8, p3, p7, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p8, p3}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    iput-object p3, p0, La/o6j;->h:La/c4m0;

    .line 72
    .line 73
    :goto_0
    iget-object p2, p2, La/v4v;->a:La/ali;

    .line 74
    .line 75
    iget-object p2, p2, La/ali;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p2, La/yzi;

    .line 78
    .line 79
    iget-object p2, p2, La/yzi;->b:La/qoj0;

    .line 80
    .line 81
    invoke-static {p2}, La/vtb;->M(La/mz40;)La/vae0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance p3, La/ko0;

    .line 86
    .line 87
    const/16 p7, 0xb

    .line 88
    .line 89
    invoke-direct {p3, p0, p6, p7}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 90
    .line 91
    .line 92
    new-instance p6, La/p6d;

    .line 93
    .line 94
    invoke-direct {p6, p2, p1, p3, p4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-object p1, p5, La/mne;->a:La/rwj;

    .line 102
    .line 103
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p6, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 108
    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/o6j;->d:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method
