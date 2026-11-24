.class public final La/mm20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:D

.field public j:Z

.field public k:Z

.field public final synthetic l:La/on20;

.field public final synthetic m:La/jdc0;


# direct methods
.method public constructor <init>(La/on20;La/jdc0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mm20;->l:La/on20;

    .line 2
    .line 3
    iput-object p2, p0, La/mm20;->m:La/jdc0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/mm20;

    .line 2
    .line 3
    iget-object v0, p0, La/mm20;->l:La/on20;

    .line 4
    .line 5
    iget-object p0, p0, La/mm20;->m:La/jdc0;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/mm20;-><init>(La/on20;La/jdc0;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/mm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mm20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/mm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/mm20;->k:Z

    .line 4
    .line 5
    iget-object v3, p0, La/mm20;->m:La/jdc0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iget-object v4, p0, La/mm20;->l:La/on20;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, La/mm20;->j:Z

    .line 15
    .line 16
    iget-wide v1, p0, La/mm20;->i:D

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-wide v5, v1

    .line 22
    move-object v1, v4

    .line 23
    move v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v4, La/on20;->X:La/hsj;

    .line 36
    .line 37
    invoke-virtual {p1}, La/hsj;->i()D

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    invoke-virtual {v4, v5, v6}, La/on20;->g0(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    iget-object p1, v4, La/on20;->u:La/reu;

    .line 46
    .line 47
    invoke-virtual {p1}, La/reu;->c()La/nwo0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-boolean p1, p1, La/nwo0;->a:Z

    .line 52
    .line 53
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/a820;

    .line 58
    .line 59
    iget-object v1, v1, La/a820;->e:La/pvj0;

    .line 60
    .line 61
    iget-object v1, v1, La/pvj0;->a:La/bx6;

    .line 62
    .line 63
    iget-object v1, v1, La/bx6;->b:La/tw6;

    .line 64
    .line 65
    iget-boolean v1, v1, La/tw6;->p:Z

    .line 66
    .line 67
    iget-wide v5, v3, La/jdc0;->b:D

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 72
    .line 73
    div-double/2addr v5, v9

    .line 74
    :cond_2
    iput-wide v7, p0, La/mm20;->i:D

    .line 75
    .line 76
    iput-boolean p1, p0, La/mm20;->j:Z

    .line 77
    .line 78
    iput-boolean v2, p0, La/mm20;->k:Z

    .line 79
    .line 80
    move-object v9, p0

    .line 81
    invoke-virtual/range {v4 .. v9}, La/on20;->Q(DDLa/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    move-object v1, v4

    .line 86
    if-ne p0, v0, :cond_3

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_3
    move v4, p1

    .line 90
    move-wide v5, v7

    .line 91
    move-object p1, p0

    .line 92
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 95
    .line 96
    .line 97
    move-result-wide v7

    .line 98
    new-instance v2, La/lm20;

    .line 99
    .line 100
    const/4 v9, 0x2

    .line 101
    invoke-direct/range {v2 .. v9}, La/lm20;-><init>(La/jdc0;ZDDB)V

    .line 102
    .line 103
    .line 104
    sget p0, La/on20;->m1:I

    .line 105
    .line 106
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method
