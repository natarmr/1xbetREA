.class public final La/umg0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

.field public final c:La/bdu;

.field public final d:La/mne;

.field public final e:La/j1q0;

.field public final f:La/oeg0;

.field public final g:La/qoj0;

.field public final h:La/ol60;

.field public final i:La/p7m0;


# direct methods
.method public constructor <init>(Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;La/bdu;La/m1e;La/mne;La/j1q0;La/oeg0;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/umg0;->b:Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 14
    .line 15
    iput-object p2, p0, La/umg0;->c:La/bdu;

    .line 16
    .line 17
    iput-object p4, p0, La/umg0;->d:La/mne;

    .line 18
    .line 19
    iput-object p5, p0, La/umg0;->e:La/j1q0;

    .line 20
    .line 21
    iput-object p6, p0, La/umg0;->f:La/oeg0;

    .line 22
    .line 23
    const/4 p1, 0x7

    .line 24
    const/4 p2, 0x0

    .line 25
    const/4 p5, 0x0

    .line 26
    invoke-static {p2, p2, p5, p1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/umg0;->g:La/qoj0;

    .line 31
    .line 32
    new-instance p1, La/ol60;

    .line 33
    .line 34
    sget-object p6, La/i99;->b:La/i99;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-direct {p1, v0, p6}, La/ol60;-><init>(ILa/i99;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/umg0;->h:La/ol60;

    .line 41
    .line 42
    sget-object p1, La/pmg0;->b:La/pmg0;

    .line 43
    .line 44
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/umg0;->i:La/p7m0;

    .line 49
    .line 50
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p3, La/rmg0;

    .line 55
    .line 56
    invoke-direct {p3, p0, p5, p2}, La/rmg0;-><init>(La/umg0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    new-instance p6, La/fnq;

    .line 60
    .line 61
    const/4 v1, 0x4

    .line 62
    invoke-direct {p6, p1, p3, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/pr60;

    .line 66
    .line 67
    const/4 p3, 0x3

    .line 68
    const/16 v1, 0x1a

    .line 69
    .line 70
    invoke-direct {p1, p3, p5, v1}, La/pr60;-><init>(ILa/yje;B)V

    .line 71
    .line 72
    .line 73
    new-instance p3, La/dnq;

    .line 74
    .line 75
    invoke-direct {p3, p6, p1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p6, p4, La/mne;->a:La/rwj;

    .line 83
    .line 84
    invoke-static {p1, p6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p6, La/st20;

    .line 89
    .line 90
    const/4 v0, 0x2

    .line 91
    const/16 v1, 0x1d

    .line 92
    .line 93
    invoke-direct {p6, v0, p5, v1}, La/st20;-><init>(ILa/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p3, p1, p6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v5, p4, La/mne;->a:La/rwj;

    .line 104
    .line 105
    new-instance v3, La/wtf0;

    .line 106
    .line 107
    const/16 p1, 0x18

    .line 108
    .line 109
    invoke-direct {v3, p1}, La/wtf0;-><init>(B)V

    .line 110
    .line 111
    .line 112
    new-instance v6, La/tmg0;

    .line 113
    .line 114
    invoke-direct {v6, p0, p5, p2}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 121
    .line 122
    .line 123
    return-void
.end method
