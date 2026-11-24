.class public final La/jhc0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/p4u;

.field public final c:La/ctf0;

.field public final d:La/mne;

.field public final e:La/fht0;

.field public final f:La/nou;

.field public final g:La/rqt;

.field public final h:La/x4u;

.field public final i:La/epi0;

.field public final j:La/peg0;

.field public final k:La/ort;

.field public final l:La/pru;

.field public final m:La/bby;

.field public final n:La/p7m0;

.field public final o:La/ol60;


# direct methods
.method public constructor <init>(La/p4u;La/ctf0;La/mne;La/fht0;La/nou;La/rqt;La/x4u;La/epi0;La/peg0;La/ort;La/m1e;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/jhc0;->b:La/p4u;

    .line 11
    .line 12
    iput-object p2, p0, La/jhc0;->c:La/ctf0;

    .line 13
    .line 14
    iput-object p3, p0, La/jhc0;->d:La/mne;

    .line 15
    .line 16
    iput-object p4, p0, La/jhc0;->e:La/fht0;

    .line 17
    .line 18
    iput-object p5, p0, La/jhc0;->f:La/nou;

    .line 19
    .line 20
    iput-object p6, p0, La/jhc0;->g:La/rqt;

    .line 21
    .line 22
    iput-object p7, p0, La/jhc0;->h:La/x4u;

    .line 23
    .line 24
    iput-object p8, p0, La/jhc0;->i:La/epi0;

    .line 25
    .line 26
    iput-object p9, p0, La/jhc0;->j:La/peg0;

    .line 27
    .line 28
    iput-object p10, p0, La/jhc0;->k:La/ort;

    .line 29
    .line 30
    iput-object p12, p0, La/jhc0;->l:La/pru;

    .line 31
    .line 32
    sget-object p1, La/zgc0;->a:La/zgc0;

    .line 33
    .line 34
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/jhc0;->n:La/p7m0;

    .line 39
    .line 40
    new-instance p2, La/ol60;

    .line 41
    .line 42
    const/4 p4, 0x3

    .line 43
    invoke-direct {p2, p4}, La/ol60;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, La/jhc0;->o:La/ol60;

    .line 47
    .line 48
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of p1, p1, La/ahc0;

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    move-object p1, p3

    .line 58
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    iget-object p7, p1, La/mne;->b:La/dvj;

    .line 63
    .line 64
    sget-object p8, La/hhc0;->a:La/hhc0;

    .line 65
    .line 66
    new-instance p9, La/d7a0;

    .line 67
    .line 68
    const/4 p1, 0x5

    .line 69
    invoke-direct {p9, p0, p2, p1}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/16 p10, 0x20

    .line 73
    .line 74
    const-wide/16 p4, 0xc8

    .line 75
    .line 76
    sget-object p6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 77
    .line 78
    invoke-static/range {p3 .. p10}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/jhc0;->m:La/bby;

    .line 83
    .line 84
    :cond_0
    invoke-interface {p11}, La/m1e;->b()La/gmq;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p3, La/c670;

    .line 89
    .line 90
    const/16 p4, 0x1c

    .line 91
    .line 92
    invoke-direct {p3, p0, p2, p4}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 93
    .line 94
    .line 95
    new-instance p2, La/fnq;

    .line 96
    .line 97
    const/4 p4, 0x4

    .line 98
    invoke-direct {p2, p1, p3, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p1, La/ehc0;->h:La/ehc0;

    .line 106
    .line 107
    invoke-static {p2, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 108
    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, La/jhc0;->m:La/bby;

    .line 2
    .line 3
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/jhc0;->j:La/peg0;

    .line 7
    .line 8
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/onv;

    .line 11
    .line 12
    iget-object p0, p0, La/onv;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/lgc0;

    .line 15
    .line 16
    iget-object p0, p0, La/lgc0;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
