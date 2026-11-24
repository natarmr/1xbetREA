.class public final La/f04;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dtb;

.field public final b:La/fvt0;

.field public final c:Lkotlin/coroutines/CoroutineContext;

.field public final d:Lkotlin/coroutines/CoroutineContext;

.field public final e:La/p7m0;

.field public f:I

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:La/d04;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:La/gmq;

.field public final k:La/vae0;

.field public final l:Ljava/util/concurrent/atomic/AtomicReference;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:La/b33;

.field public final o:La/n0o0;

.field public final p:La/mfr;


# direct methods
.method public constructor <init>(La/dtb;La/fvt0;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/f04;->a:La/dtb;

    .line 5
    .line 6
    iput-object p2, p0, La/f04;->b:La/fvt0;

    .line 7
    .line 8
    iput-object p3, p0, La/f04;->c:Lkotlin/coroutines/CoroutineContext;

    .line 9
    .line 10
    iput-object p4, p0, La/f04;->d:Lkotlin/coroutines/CoroutineContext;

    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/f04;->e:La/p7m0;

    .line 19
    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/f04;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    new-instance p1, La/d04;

    .line 29
    .line 30
    invoke-direct {p1, p0, p3}, La/d04;-><init>(La/f04;Lkotlin/coroutines/CoroutineContext;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/f04;->h:La/d04;

    .line 34
    .line 35
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    const/4 p4, 0x0

    .line 38
    invoke-direct {p3, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, La/f04;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    .line 43
    new-instance p3, La/i89;

    .line 44
    .line 45
    const/16 v0, 0x16

    .line 46
    .line 47
    iget-object v1, p1, La/d04;->k:La/xae0;

    .line 48
    .line 49
    invoke-direct {p3, v1, v0}, La/i89;-><init>(La/gmq;B)V

    .line 50
    .line 51
    .line 52
    const/4 v0, -0x1

    .line 53
    invoke-static {p3, v0}, La/ulb;->D(La/gmq;I)La/gmq;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    new-instance v0, La/tg3;

    .line 58
    .line 59
    invoke-direct {v0, p3, p2, p0}, La/tg3;-><init>(La/gmq;La/yje;La/f04;)V

    .line 60
    .line 61
    .line 62
    new-instance p3, La/vsg0;

    .line 63
    .line 64
    invoke-direct {p3, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, La/tvk;->a:La/rwj;

    .line 68
    .line 69
    sget-object v0, La/ys10;->a:La/vs10;

    .line 70
    .line 71
    invoke-static {p3, v0}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    iput-object p3, p0, La/f04;->j:La/gmq;

    .line 76
    .line 77
    iget-object p1, p1, La/d04;->l:La/qoj0;

    .line 78
    .line 79
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, La/f04;->k:La/vae0;

    .line 84
    .line 85
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, La/f04;->l:Ljava/util/concurrent/atomic/AtomicReference;

    .line 91
    .line 92
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, La/f04;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 98
    .line 99
    new-instance p1, La/b33;

    .line 100
    .line 101
    const/16 p2, 0xa

    .line 102
    .line 103
    invoke-direct {p1, p0, p2}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, La/f04;->n:La/b33;

    .line 107
    .line 108
    new-instance p1, La/a04;

    .line 109
    .line 110
    invoke-direct {p1, p4}, La/a04;-><init>(B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, La/f04;->o:La/n0o0;

    .line 118
    .line 119
    new-instance p1, La/mfr;

    .line 120
    .line 121
    invoke-direct {p1, p0}, La/mfr;-><init>(La/f04;)V

    .line 122
    .line 123
    .line 124
    iput-object p1, p0, La/f04;->p:La/mfr;

    .line 125
    .line 126
    return-void
.end method
