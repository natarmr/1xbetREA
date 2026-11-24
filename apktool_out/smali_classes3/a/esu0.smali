.class public final La/esu0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

.field public final c:La/g2v;

.field public final d:La/hzg;

.field public final e:La/r2u;

.field public final f:La/duj;

.field public final g:La/ih5;

.field public final h:La/zr1;

.field public final i:La/bby;

.field public final j:Z

.field public final k:La/p7m0;

.field public final l:La/xae0;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;La/mne;La/g2v;La/hzg;La/r2u;La/duj;La/ih5;La/zr1;La/svu;)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/esu0;->b:Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 5
    .line 6
    iput-object p3, p0, La/esu0;->c:La/g2v;

    .line 7
    .line 8
    iput-object p4, p0, La/esu0;->d:La/hzg;

    .line 9
    .line 10
    iput-object p5, p0, La/esu0;->e:La/r2u;

    .line 11
    .line 12
    iput-object p6, p0, La/esu0;->f:La/duj;

    .line 13
    .line 14
    iput-object p7, p0, La/esu0;->g:La/ih5;

    .line 15
    .line 16
    iput-object p8, p0, La/esu0;->h:La/zr1;

    .line 17
    .line 18
    invoke-virtual {p9}, La/svu;->l()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput-boolean p1, p0, La/esu0;->j:Z

    .line 23
    .line 24
    sget-object p1, La/nch;->a:La/nch;

    .line 25
    .line 26
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, La/esu0;->k:La/p7m0;

    .line 31
    .line 32
    iget-object p4, p0, La/esu0;->i:La/bby;

    .line 33
    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    invoke-interface {p4}, La/bby;->isActive()Z

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    const/4 p5, 0x1

    .line 41
    if-ne p4, p5, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p4, p0, La/esu0;->i:La/bby;

    .line 45
    .line 46
    const/4 p5, 0x0

    .line 47
    if-eqz p4, :cond_1

    .line 48
    .line 49
    invoke-interface {p4, p5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v3, p2, La/mne;->b:La/dvj;

    .line 57
    .line 58
    new-instance v1, La/npt0;

    .line 59
    .line 60
    const/16 p4, 0x11

    .line 61
    .line 62
    invoke-direct {v1, p0, p4}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v4, La/k6s0;

    .line 66
    .line 67
    const/16 p4, 0x13

    .line 68
    .line 69
    invoke-direct {v4, p0, p5, p4}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/16 v5, 0xa

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    iput-object p4, p0, La/esu0;->i:La/bby;

    .line 80
    .line 81
    :goto_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 86
    .line 87
    invoke-static {p4, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    new-instance p4, La/o6m0;

    .line 92
    .line 93
    const-wide p5, 0x7fffffffffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-direct {p4, p5, p6}, La/o6m0;-><init>(J)V

    .line 99
    .line 100
    .line 101
    invoke-static {p3, p2, p4, p1}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, La/esu0;->l:La/xae0;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 14

    .line 1
    :cond_0
    iget-object v0, p0, La/esu0;->k:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/och;

    .line 9
    .line 10
    new-instance v2, La/mch;

    .line 11
    .line 12
    const-wide/16 v3, -0x1

    .line 13
    .line 14
    sget-object v5, La/pb10;->v:La/pb10;

    .line 15
    .line 16
    invoke-static {v3, v4, v5}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    const/4 v12, 0x0

    .line 21
    const/16 v13, 0x1de

    .line 22
    .line 23
    iget-object v6, p0, La/esu0;->c:La/g2v;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const v10, 0x7f1305c0

    .line 28
    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    invoke-direct {v2, v3, v4, v5}, La/mch;-><init>(La/jkm;J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    return-void
.end method
