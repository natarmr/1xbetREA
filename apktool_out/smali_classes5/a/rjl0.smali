.class public final La/rjl0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/he1;

.field public final b:La/mne;

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(La/he1;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rjl0;->a:La/he1;

    .line 5
    .line 6
    iput-object p2, p0, La/rjl0;->b:La/mne;

    .line 7
    .line 8
    sget-object p1, La/iun;->a:La/iun;

    .line 9
    .line 10
    iput-object p1, p0, La/rjl0;->c:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/ljl0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ljl0;

    .line 7
    .line 8
    iget v1, v0, La/ljl0;->k:I

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
    iput v1, v0, La/ljl0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ljl0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ljl0;-><init>(La/rjl0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ljl0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ljl0;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    iget-object p1, p0, La/rjl0;->c:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iget-object p1, p0, La/rjl0;->b:La/mne;

    .line 59
    .line 60
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 61
    .line 62
    new-instance v2, La/lcl0;

    .line 63
    .line 64
    const/4 v5, 0x2

    .line 65
    invoke-direct {v2, p0, v3, v5}, La/lcl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput v4, v0, La/ljl0;->k:I

    .line 69
    .line 70
    invoke-static {p1, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    iget-object p0, p0, La/rjl0;->c:Ljava/util/List;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    return-object p1
.end method
