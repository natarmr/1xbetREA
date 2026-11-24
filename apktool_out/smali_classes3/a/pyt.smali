.class public final La/pyt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tyt;

.field public final b:La/iqt;

.field public final c:La/ieu;

.field public final d:La/rou;

.field public final e:La/ahu;

.field public final f:La/ntu;

.field public final g:La/ctf0;

.field public final h:La/m0u;

.field public final i:La/ocl;

.field public final j:La/rqc;

.field public final k:La/mne;


# direct methods
.method public constructor <init>(La/tyt;La/iqt;La/ieu;La/rou;La/ahu;La/ntu;La/ctf0;La/m0u;La/ocl;La/rqc;La/mne;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/pyt;->a:La/tyt;

    .line 11
    .line 12
    iput-object p2, p0, La/pyt;->b:La/iqt;

    .line 13
    .line 14
    iput-object p3, p0, La/pyt;->c:La/ieu;

    .line 15
    .line 16
    iput-object p4, p0, La/pyt;->d:La/rou;

    .line 17
    .line 18
    iput-object p5, p0, La/pyt;->e:La/ahu;

    .line 19
    .line 20
    iput-object p6, p0, La/pyt;->f:La/ntu;

    .line 21
    .line 22
    iput-object p7, p0, La/pyt;->g:La/ctf0;

    .line 23
    .line 24
    iput-object p8, p0, La/pyt;->h:La/m0u;

    .line 25
    .line 26
    iput-object p9, p0, La/pyt;->i:La/ocl;

    .line 27
    .line 28
    iput-object p10, p0, La/pyt;->j:La/rqc;

    .line 29
    .line 30
    iput-object p11, p0, La/pyt;->k:La/mne;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/oyt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/oyt;

    .line 7
    .line 8
    iget v1, v0, La/oyt;->l:I

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
    iput v1, v0, La/oyt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/oyt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/oyt;-><init>(La/pyt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/oyt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/oyt;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-wide v4, v0, La/oyt;->i:J

    .line 51
    .line 52
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
    iget-object p1, p0, La/pyt;->j:La/rqc;

    .line 60
    .line 61
    invoke-virtual {p1}, La/rqc;->a()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    int-to-long v5, p1

    .line 66
    iput-wide v5, v0, La/oyt;->i:J

    .line 67
    .line 68
    iput v4, v0, La/oyt;->l:I

    .line 69
    .line 70
    iget-object p1, p0, La/pyt;->i:La/ocl;

    .line 71
    .line 72
    invoke-virtual {p1, v5, v6, v0}, La/ocl;->g(JLa/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-wide v4, v5

    .line 80
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    iput-wide v4, v0, La/oyt;->i:J

    .line 87
    .line 88
    iput v3, v0, La/oyt;->l:I

    .line 89
    .line 90
    iget-object p0, p0, La/pyt;->h:La/m0u;

    .line 91
    .line 92
    iget-object p0, p0, La/m0u;->a:La/xr;

    .line 93
    .line 94
    invoke-virtual {p0, v6, v7, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v1, :cond_5

    .line 99
    .line 100
    :goto_2
    return-object v1

    .line 101
    :cond_5
    :goto_3
    check-cast p1, La/xuf;

    .line 102
    .line 103
    iget-object p0, p1, La/xuf;->b:Ljava/lang/String;

    .line 104
    .line 105
    return-object p0
.end method

.method public final b(La/mvc;)La/gmq;
    .locals 2

    .line 1
    new-instance v0, La/zyb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/zyb;-><init>(La/pyt;La/mvc;La/yje;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/vsg0;

    .line 8
    .line 9
    invoke-direct {p1, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/pyt;->k:La/mne;

    .line 13
    .line 14
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 15
    .line 16
    invoke-static {p1, p0}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
