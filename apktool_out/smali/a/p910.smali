.class public final La/p910;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/ea10;

.field public final synthetic k:La/bby;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:La/u910;


# direct methods
.method public constructor <init>(La/ea10;La/bby;IILa/u910;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p910;->j:La/ea10;

    .line 2
    .line 3
    iput-object p2, p0, La/p910;->k:La/bby;

    .line 4
    .line 5
    iput p3, p0, La/p910;->l:I

    .line 6
    .line 7
    iput p4, p0, La/p910;->m:I

    .line 8
    .line 9
    iput-object p5, p0, La/p910;->n:La/u910;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/p910;

    .line 2
    .line 3
    iget v4, p0, La/p910;->m:I

    .line 4
    .line 5
    iget-object v5, p0, La/p910;->n:La/u910;

    .line 6
    .line 7
    iget-object v1, p0, La/p910;->j:La/ea10;

    .line 8
    .line 9
    iget-object v2, p0, La/p910;->k:La/bby;

    .line 10
    .line 11
    iget v3, p0, La/p910;->l:I

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/p910;-><init>(La/ea10;La/bby;IILa/u910;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/p910;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/p910;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/p910;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/p910;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    sget-object p1, La/o910;->a:[I

    .line 25
    .line 26
    iget-object v1, p0, La/p910;->j:La/ea10;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    aget p1, p1, v1

    .line 33
    .line 34
    iget v1, p0, La/p910;->l:I

    .line 35
    .line 36
    if-ne p1, v2, :cond_4

    .line 37
    .line 38
    iget-object p1, p0, La/p910;->k:La/bby;

    .line 39
    .line 40
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    iget v1, p0, La/p910;->m:I

    .line 48
    .line 49
    :cond_4
    :goto_0
    iput-boolean v2, p0, La/p910;->i:Z

    .line 50
    .line 51
    const p1, 0x7fffffff

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, La/p910;->n:La/u910;

    .line 55
    .line 56
    if-ne v1, p1, :cond_5

    .line 57
    .line 58
    new-instance p1, La/r910;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {p1, v3, v1, v4}, La/r910;-><init>(La/u910;IB)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p0}, La/r7x;->K(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_1

    .line 69
    :cond_5
    new-instance p1, La/r910;

    .line 70
    .line 71
    invoke-direct {p1, v3, v1, v2}, La/r910;-><init>(La/u910;IB)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1, p1, p0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_1
    if-ne p1, v0, :cond_6

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0
.end method
