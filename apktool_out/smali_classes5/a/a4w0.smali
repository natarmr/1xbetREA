.class public final La/a4w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w4p0;

.field public final b:La/mne;

.field public c:La/o3w0;


# direct methods
.method public constructor <init>(La/w4p0;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a4w0;->a:La/w4p0;

    .line 5
    .line 6
    iput-object p2, p0, La/a4w0;->b:La/mne;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/z3w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/z3w0;

    .line 7
    .line 8
    iget v1, v0, La/z3w0;->k:I

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
    iput v1, v0, La/z3w0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z3w0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/z3w0;-><init>(La/a4w0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/z3w0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z3w0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p1, p0, La/a4w0;->b:La/mne;

    .line 53
    .line 54
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 55
    .line 56
    new-instance v2, La/n7t0;

    .line 57
    .line 58
    const/16 v5, 0x19

    .line 59
    .line 60
    invoke-direct {v2, p0, p0, v3, v5}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    iput v4, v0, La/z3w0;->k:I

    .line 64
    .line 65
    invoke-static {p1, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p1, La/o3w0;

    .line 73
    .line 74
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 79
    .line 80
    new-instance p1, La/g0g0;

    .line 81
    .line 82
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_2
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    new-instance p1, La/o3w0;

    .line 93
    .line 94
    sget-object p0, La/iun;->a:La/iun;

    .line 95
    .line 96
    invoke-direct {p1, p0}, La/o3w0;-><init>(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    return-object p1
.end method
