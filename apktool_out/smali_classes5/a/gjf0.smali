.class public final La/gjf0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/usd;

.field public final c:La/zn00;

.field public final d:La/mne;

.field public final e:La/duj;

.field public final f:La/ctf0;

.field public final g:La/i1w0;

.field public final h:Z

.field public final i:La/p7m0;

.field public final j:La/ol60;

.field public k:La/bby;

.field public final l:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;La/usd;La/zn00;La/mne;La/duj;La/ctf0;La/i1w0;La/m1e;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/gjf0;->b:La/usd;

    .line 11
    .line 12
    iput-object p3, p0, La/gjf0;->c:La/zn00;

    .line 13
    .line 14
    iput-object p4, p0, La/gjf0;->d:La/mne;

    .line 15
    .line 16
    iput-object p5, p0, La/gjf0;->e:La/duj;

    .line 17
    .line 18
    iput-object p6, p0, La/gjf0;->f:La/ctf0;

    .line 19
    .line 20
    iput-object p7, p0, La/gjf0;->g:La/i1w0;

    .line 21
    .line 22
    iput-boolean p9, p0, La/gjf0;->h:Z

    .line 23
    .line 24
    new-instance p1, La/ejf0;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    const-string p3, ""

    .line 28
    .line 29
    invoke-direct {p1, p3, p2, p2, p2}, La/ejf0;-><init>(Ljava/lang/String;ZZZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/gjf0;->i:La/p7m0;

    .line 37
    .line 38
    new-instance p1, La/ol60;

    .line 39
    .line 40
    const/4 p2, 0x3

    .line 41
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, La/gjf0;->j:La/ol60;

    .line 45
    .line 46
    iget-object p1, p0, La/gjf0;->l:La/c4m0;

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-ne p1, p2, :cond_0

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    invoke-interface {p8}, La/m1e;->b()La/gmq;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p3, La/fjf0;

    .line 63
    .line 64
    const/4 p5, 0x0

    .line 65
    invoke-direct {p3, p0, p5, p2}, La/fjf0;-><init>(La/gjf0;La/yje;B)V

    .line 66
    .line 67
    .line 68
    new-instance p2, La/fnq;

    .line 69
    .line 70
    const/4 p6, 0x4

    .line 71
    invoke-direct {p2, p1, p3, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p3, p4, La/mne;->a:La/rwj;

    .line 79
    .line 80
    invoke-static {p1, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p3, La/st20;

    .line 85
    .line 86
    const/4 p4, 0x2

    .line 87
    const/16 p6, 0x1b

    .line 88
    .line 89
    invoke-direct {p3, p4, p5, p6}, La/st20;-><init>(ILa/yje;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p2, p1, p3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, La/gjf0;->l:La/c4m0;

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/CharSequence;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    :cond_1
    move-object v2, p1

    .line 14
    :cond_2
    iget-object p1, p0, La/gjf0;->i:La/p7m0;

    .line 15
    .line 16
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    move-object v0, v6

    .line 21
    check-cast v0, La/ejf0;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lez v1, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :goto_1
    move v3, v1

    .line 31
    goto :goto_2

    .line 32
    :cond_3
    const/4 v1, 0x0

    .line 33
    goto :goto_1

    .line 34
    :goto_2
    const/4 v4, 0x0

    .line 35
    const/16 v5, 0x9

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static/range {v0 .. v5}, La/ejf0;->a(La/ejf0;ZLjava/lang/String;ZZI)La/ejf0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v6, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p0, p0, La/gjf0;->j:La/ol60;

    .line 49
    .line 50
    sget-object p1, La/xif0;->a:La/xif0;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
