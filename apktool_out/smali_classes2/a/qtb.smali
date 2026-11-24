.class public abstract La/qtb;
.super La/ktb;
.source "SourceFile"


# instance fields
.field public final d:La/gmq;


# direct methods
.method public constructor <init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, La/ktb;-><init>(Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qtb;->d:La/gmq;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, La/ktb;->b:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    invoke-interface {p2}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    new-instance v2, La/bqd;

    .line 13
    .line 14
    const/4 v3, 0x7

    .line 15
    invoke-direct {v2, v3}, La/bqd;-><init>(B)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La/ktb;->a:Lkotlin/coroutines/CoroutineContext;

    .line 19
    .line 20
    invoke-interface {v3, v1, v2}, Lkotlin/coroutines/CoroutineContext;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0, v3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    invoke-static {v0, v3, v1}, La/jne;->a(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, La/qtb;->m(La/kmq;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, La/wne;->a:La/wne;

    .line 53
    .line 54
    if-ne p0, p1, :cond_1

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_2
    sget-object v2, Lkotlin/coroutines/d;->d1:La/ake;

    .line 61
    .line 62
    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {p2}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    instance-of v2, p1, La/mfi0;

    .line 81
    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    instance-of v2, p1, La/h660;

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    new-instance v2, La/cdm0;

    .line 90
    .line 91
    invoke-direct {v2, p1, v0}, La/cdm0;-><init>(La/kmq;Lkotlin/coroutines/CoroutineContext;)V

    .line 92
    .line 93
    .line 94
    move-object p1, v2

    .line 95
    :cond_4
    :goto_1
    new-instance v0, La/jtb;

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v3, 0x1

    .line 99
    invoke-direct {v0, p0, v2, v3}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, La/ecq0;->b(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {v1, p1, p0, v0, p2}, La/ntb;->d0(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object p1, La/wne;->a:La/wne;

    .line 111
    .line 112
    if-ne p0, p1, :cond_5

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_6
    invoke-super {p0, p1, p2}, La/ktb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object p1, La/wne;->a:La/wne;

    .line 123
    .line 124
    if-ne p0, p1, :cond_7

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0
.end method

.method public final h(La/hzb0;La/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, La/mfi0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/mfi0;-><init>(La/hzb0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, La/qtb;->m(La/kmq;La/yje;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, La/wne;->a:La/wne;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public m(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/qtb;->d:La/gmq;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/wne;->a:La/wne;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/qtb;->d:La/gmq;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, La/ktb;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
