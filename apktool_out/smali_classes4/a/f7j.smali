.class public final La/f7j;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/bzu;

.field public final c:La/yqc;

.field public final d:La/ntu;

.field public final e:La/mne;

.field public final f:La/g2v;

.field public final g:La/duj;

.field public final h:La/p7m0;

.field public final i:La/c4m0;

.field public j:La/bby;

.field public k:Z


# direct methods
.method public constructor <init>(La/bzu;La/abu;La/yqc;La/ntu;La/i1w0;La/mne;La/g2v;La/duj;La/m1e;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/f7j;->b:La/bzu;

    .line 8
    .line 9
    iput-object p3, p0, La/f7j;->c:La/yqc;

    .line 10
    .line 11
    iput-object p4, p0, La/f7j;->d:La/ntu;

    .line 12
    .line 13
    iput-object p6, p0, La/f7j;->e:La/mne;

    .line 14
    .line 15
    iput-object p7, p0, La/f7j;->f:La/g2v;

    .line 16
    .line 17
    iput-object p8, p0, La/f7j;->g:La/duj;

    .line 18
    .line 19
    sget-object p1, La/z6j;->a:La/z6j;

    .line 20
    .line 21
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/f7j;->h:La/p7m0;

    .line 26
    .line 27
    iget-object p1, p0, La/f7j;->i:La/c4m0;

    .line 28
    .line 29
    const/4 p3, 0x4

    .line 30
    const/4 p4, 0x1

    .line 31
    const/4 p5, 0x0

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, p4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {p9}, La/m1e;->b()La/gmq;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p7, La/e7j;

    .line 46
    .line 47
    invoke-direct {p7, p0, p5, p4}, La/e7j;-><init>(La/f7j;La/yje;B)V

    .line 48
    .line 49
    .line 50
    new-instance p8, La/fnq;

    .line 51
    .line 52
    invoke-direct {p8, p1, p7, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p8, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, La/f7j;->i:La/c4m0;

    .line 64
    .line 65
    :goto_0
    iget-object p1, p2, La/abu;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, La/hnu;

    .line 68
    .line 69
    iget-object p1, p1, La/hnu;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, La/ali;

    .line 72
    .line 73
    iget-object p1, p1, La/ali;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, La/yzi;

    .line 76
    .line 77
    iget-object p1, p1, La/yzi;->a:La/qoj0;

    .line 78
    .line 79
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p2, La/abu;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, La/v4v;

    .line 86
    .line 87
    iget-object p2, p2, La/v4v;->a:La/ali;

    .line 88
    .line 89
    iget-object p2, p2, La/ali;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, La/yzi;

    .line 92
    .line 93
    iget-object p2, p2, La/yzi;->b:La/qoj0;

    .line 94
    .line 95
    invoke-static {p2}, La/vtb;->M(La/mz40;)La/vae0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    new-instance p7, La/qos;

    .line 100
    .line 101
    const/4 p8, 0x3

    .line 102
    const/16 p9, 0x8

    .line 103
    .line 104
    invoke-direct {p7, p8, p5, p9}, La/qos;-><init>(ILa/yje;B)V

    .line 105
    .line 106
    .line 107
    new-instance p8, La/p6d;

    .line 108
    .line 109
    invoke-direct {p8, p1, p2, p7, p4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 110
    .line 111
    .line 112
    new-instance p1, La/e9g;

    .line 113
    .line 114
    const/16 p2, 0xe

    .line 115
    .line 116
    invoke-direct {p1, p0, p5, p2}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 117
    .line 118
    .line 119
    new-instance p2, La/fnq;

    .line 120
    .line 121
    invoke-direct {p2, p8, p1, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object p1, p6, La/mne;->a:La/rwj;

    .line 129
    .line 130
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 135
    .line 136
    .line 137
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 14

    .line 1
    iget-object v0, p0, La/f7j;->j:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/f7j;->e:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/y6h;

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/16 v13, 0xf

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const-class v9, La/f7j;

    .line 28
    .line 29
    const-string v10, "handleErrorWithLottie"

    .line 30
    .line 31
    const-string v11, "handleErrorWithLottie(Ljava/lang/Throwable;)V"

    .line 32
    .line 33
    move-object v8, p0

    .line 34
    move-object v6, v3

    .line 35
    invoke-direct/range {v6 .. v13}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    new-instance v6, La/e7j;

    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v6, v8, p0, v0}, La/e7j;-><init>(La/f7j;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/16 v7, 0xa

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iput-object p0, v8, La/f7j;->j:La/bby;

    .line 53
    .line 54
    return-void
.end method

.method public final x(La/d7j;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/f7j;->e:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/x2i;

    .line 10
    .line 11
    const/16 v2, 0x9

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/x2i;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/b1f;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v5, 0x10

    .line 20
    .line 21
    invoke-direct {v4, p0, p1, v2, v5}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method
