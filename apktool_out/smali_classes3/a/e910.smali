.class public final La/e910;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/zx10;

.field public final c:La/x4u;

.field public final d:La/wsf0;

.field public final e:La/sqt;

.field public final f:La/mne;

.field public final g:La/duj;

.field public final h:La/i1w0;

.field public final i:La/ljf0;

.field public j:Z

.field public final k:La/p7m0;

.field public final l:La/qoj0;


# direct methods
.method public constructor <init>(La/zx10;La/x4u;La/wsf0;La/sqt;La/mne;La/duj;La/i1w0;La/ljf0;La/tpx;)V
    .locals 6

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/e910;->b:La/zx10;

    .line 8
    .line 9
    iput-object p2, p0, La/e910;->c:La/x4u;

    .line 10
    .line 11
    iput-object p3, p0, La/e910;->d:La/wsf0;

    .line 12
    .line 13
    iput-object p4, p0, La/e910;->e:La/sqt;

    .line 14
    .line 15
    iput-object p5, p0, La/e910;->f:La/mne;

    .line 16
    .line 17
    iput-object p6, p0, La/e910;->g:La/duj;

    .line 18
    .line 19
    iput-object p7, p0, La/e910;->h:La/i1w0;

    .line 20
    .line 21
    iput-object p8, p0, La/e910;->i:La/ljf0;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, La/e910;->j:Z

    .line 25
    .line 26
    sget-object p2, La/z810;->a:La/z810;

    .line 27
    .line 28
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, La/e910;->k:La/p7m0;

    .line 33
    .line 34
    const/4 p2, 0x7

    .line 35
    const/4 p3, 0x0

    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-static {p3, p3, p4, p2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, La/e910;->l:La/qoj0;

    .line 42
    .line 43
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, La/s810;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, La/s810;-><init>(La/e910;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/juy;

    .line 53
    .line 54
    const/16 p1, 0x13

    .line 55
    .line 56
    invoke-direct {v4, p9, p0, p4, p1}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v5, 0xe

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final w(La/i16;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/e910;->f:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 8
    .line 9
    sget-object v1, La/c910;->a:La/c910;

    .line 10
    .line 11
    new-instance v4, La/juy;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/16 v5, 0x14

    .line 15
    .line 16
    invoke-direct {v4, p0, p1, v2, v5}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xa

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final x(La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/d910;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/d910;

    .line 7
    .line 8
    iget v1, v0, La/d910;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/d910;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d910;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/d910;-><init>(La/e910;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/d910;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d910;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/e910;->l:La/qoj0;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    iput-boolean p1, p0, La/e910;->j:Z

    .line 61
    .line 62
    iget-object p0, p0, La/e910;->k:La/p7m0;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object p1, La/a910;->a:La/a910;

    .line 68
    .line 69
    invoke-virtual {p0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iput v6, v0, La/d910;->k:I

    .line 73
    .line 74
    sget-object p0, La/w810;->a:La/w810;

    .line 75
    .line 76
    invoke-virtual {v4, p0, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    new-instance p0, La/u810;

    .line 84
    .line 85
    invoke-direct {p0, v6}, La/u810;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    iput v5, v0, La/d910;->k:I

    .line 89
    .line 90
    invoke-virtual {v4, p0, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v1, :cond_5

    .line 95
    .line 96
    :goto_2
    return-object v1

    .line 97
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0
.end method
