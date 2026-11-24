.class public final La/qd;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/joc;

.field public final d:La/zn00;

.field public final e:La/qgd;

.field public final f:La/jh70;

.field public final g:La/otn;

.field public final h:La/ctf0;

.field public final i:La/p7m0;

.field public final j:La/p7m0;

.field public final k:La/c4m0;

.field public l:Z


# direct methods
.method public constructor <init>(La/i1w0;La/joc;La/zn00;La/qgd;La/jh70;La/otn;La/ctf0;La/m1e;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/qd;->b:La/i1w0;

    .line 14
    .line 15
    iput-object p2, p0, La/qd;->c:La/joc;

    .line 16
    .line 17
    iput-object p3, p0, La/qd;->d:La/zn00;

    .line 18
    .line 19
    iput-object p4, p0, La/qd;->e:La/qgd;

    .line 20
    .line 21
    iput-object p5, p0, La/qd;->f:La/jh70;

    .line 22
    .line 23
    iput-object p6, p0, La/qd;->g:La/otn;

    .line 24
    .line 25
    iput-object p7, p0, La/qd;->h:La/ctf0;

    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/qd;->i:La/p7m0;

    .line 34
    .line 35
    iget-object p1, p6, La/otn;->b:Ljava/util/List;

    .line 36
    .line 37
    const-wide/16 p2, -0x1

    .line 38
    .line 39
    invoke-static {p2, p3, p7, p1}, La/o050;->Y(JLa/ctf0;Ljava/util/List;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/qd;->j:La/p7m0;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, La/qd;->l:Z

    .line 51
    .line 52
    iget-object p2, p0, La/qd;->k:La/c4m0;

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-ne p2, p1, :cond_0

    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    invoke-interface {p8}, La/m1e;->b()La/gmq;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, La/pa;

    .line 68
    .line 69
    const/4 p3, 0x0

    .line 70
    const/4 p4, 0x2

    .line 71
    invoke-direct {p2, p0, p3, p4}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    new-instance p5, La/fnq;

    .line 75
    .line 76
    const/4 p6, 0x4

    .line 77
    invoke-direct {p5, p1, p2, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p2, p9, La/mne;->a:La/rwj;

    .line 85
    .line 86
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p2, La/pd;

    .line 91
    .line 92
    const/4 p6, 0x0

    .line 93
    invoke-direct {p2, p4, p3, p6}, La/pd;-><init>(ILa/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p5, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, La/qd;->k:La/c4m0;

    .line 101
    .line 102
    return-void
.end method
