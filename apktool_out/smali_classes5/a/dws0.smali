.class public final La/dws0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/mne;

.field public final c:La/ojj;

.field public final d:La/ctf0;

.field public final e:La/duj;

.field public final f:La/i1w0;

.field public final g:La/s9m0;

.field public final h:La/im4;

.field public final i:La/p7m0;

.field public final j:La/ol60;

.field public k:La/bby;

.field public final l:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;La/mne;La/ojj;La/ctf0;La/duj;La/i1w0;La/m1e;La/s9m0;La/im4;)V
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/dws0;->b:La/mne;

    .line 11
    .line 12
    iput-object p3, p0, La/dws0;->c:La/ojj;

    .line 13
    .line 14
    iput-object p4, p0, La/dws0;->d:La/ctf0;

    .line 15
    .line 16
    iput-object p5, p0, La/dws0;->e:La/duj;

    .line 17
    .line 18
    iput-object p6, p0, La/dws0;->f:La/i1w0;

    .line 19
    .line 20
    iput-object p8, p0, La/dws0;->g:La/s9m0;

    .line 21
    .line 22
    move-object/from16 p1, p9

    .line 23
    .line 24
    iput-object p1, p0, La/dws0;->h:La/im4;

    .line 25
    .line 26
    new-instance v0, La/bws0;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    const-string v1, ""

    .line 31
    .line 32
    const-string v2, ""

    .line 33
    .line 34
    const-string v3, ""

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct/range {v0 .. v6}, La/bws0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, La/dws0;->i:La/p7m0;

    .line 45
    .line 46
    new-instance p1, La/ol60;

    .line 47
    .line 48
    const/4 p3, 0x3

    .line 49
    invoke-direct {p1, p3}, La/ol60;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/dws0;->j:La/ol60;

    .line 53
    .line 54
    iget-object p1, p0, La/dws0;->l:La/c4m0;

    .line 55
    .line 56
    const/4 p3, 0x1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, p3, :cond_0

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    invoke-interface {p7}, La/m1e;->b()La/gmq;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p4, La/cws0;

    .line 71
    .line 72
    const/4 p5, 0x0

    .line 73
    invoke-direct {p4, p0, p5, p3}, La/cws0;-><init>(La/dws0;La/yje;B)V

    .line 74
    .line 75
    .line 76
    new-instance p3, La/fnq;

    .line 77
    .line 78
    const/4 p6, 0x4

    .line 79
    invoke-direct {p3, p1, p4, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 87
    .line 88
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, La/tri0;

    .line 93
    .line 94
    const/4 p4, 0x2

    .line 95
    const/16 p6, 0x18

    .line 96
    .line 97
    invoke-direct {p2, p4, p5, p6}, La/tri0;-><init>(ILa/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p3, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La/dws0;->l:La/c4m0;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/CharSequence;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    move-object v3, p1

    .line 11
    goto :goto_2

    .line 12
    :cond_1
    :goto_1
    const-string p1, ""

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    :goto_2
    iget-object p1, p0, La/dws0;->i:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    move-object v0, v8

    .line 22
    check-cast v0, La/bws0;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_3

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    :goto_3
    move v5, v1

    .line 32
    goto :goto_4

    .line 33
    :cond_3
    const/4 v1, 0x0

    .line 34
    goto :goto_3

    .line 35
    :goto_4
    const/4 v6, 0x0

    .line 36
    const/16 v7, 0x23

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    const-string v4, ""

    .line 41
    .line 42
    invoke-static/range {v0 .. v7}, La/bws0;->a(La/bws0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)La/bws0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v8, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    return-void
.end method
