.class public final La/wpj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:Z

.field public synthetic j:La/mv2;

.field public synthetic k:La/no20;

.field public synthetic l:La/ypj0;

.field public final synthetic m:La/xpj0;

.field public final synthetic n:F

.field public final synthetic o:La/cfq;


# direct methods
.method public constructor <init>(La/xpj0;FLa/cfq;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wpj0;->m:La/xpj0;

    .line 2
    .line 3
    iput p2, p0, La/wpj0;->n:F

    .line 4
    .line 5
    iput-object p3, p0, La/wpj0;->o:La/cfq;

    .line 6
    .line 7
    const/4 p1, 0x4

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/wpj0;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/wpj0;->j:La/mv2;

    .line 25
    .line 26
    iget-object v1, p0, La/wpj0;->k:La/no20;

    .line 27
    .line 28
    iget-object v4, p0, La/wpj0;->l:La/ypj0;

    .line 29
    .line 30
    invoke-virtual {v1, v4}, La/no20;->d(Ljava/lang/Object;)F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    new-instance v1, La/jie0;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, La/wpj0;->m:La/xpj0;

    .line 46
    .line 47
    iget-object v5, v4, La/xpj0;->e:La/qv2;

    .line 48
    .line 49
    iget-object v5, v5, La/qv2;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, La/agk0;

    .line 52
    .line 53
    invoke-virtual {v5}, La/agk0;->l()F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    :goto_0
    move v5, v4

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v4, v4, La/xpj0;->e:La/qv2;

    .line 67
    .line 68
    iget-object v4, v4, La/qv2;->l:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, La/agk0;

    .line 71
    .line 72
    invoke-virtual {v4}, La/agk0;->l()F

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    iput v5, v1, La/jie0;->a:F

    .line 78
    .line 79
    new-instance v9, La/su2;

    .line 80
    .line 81
    invoke-direct {v9, p1, v1, v3}, La/su2;-><init>(La/mv2;La/jie0;B)V

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, La/wpj0;->j:La/mv2;

    .line 85
    .line 86
    iput-object v2, p0, La/wpj0;->k:La/no20;

    .line 87
    .line 88
    iput-boolean v3, p0, La/wpj0;->i:Z

    .line 89
    .line 90
    iget v7, p0, La/wpj0;->n:F

    .line 91
    .line 92
    iget-object v8, p0, La/wpj0;->o:La/cfq;

    .line 93
    .line 94
    move-object v10, p0

    .line 95
    invoke-static/range {v5 .. v10}, La/hhm0;->l(FFFLa/j73;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v0, :cond_3

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/mv2;

    .line 2
    .line 3
    check-cast p2, La/no20;

    .line 4
    .line 5
    check-cast p3, La/ypj0;

    .line 6
    .line 7
    check-cast p4, La/yje;

    .line 8
    .line 9
    new-instance v0, La/wpj0;

    .line 10
    .line 11
    iget v1, p0, La/wpj0;->n:F

    .line 12
    .line 13
    iget-object v2, p0, La/wpj0;->o:La/cfq;

    .line 14
    .line 15
    iget-object p0, p0, La/wpj0;->m:La/xpj0;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1, v2, p4}, La/wpj0;-><init>(La/xpj0;FLa/cfq;La/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/wpj0;->j:La/mv2;

    .line 21
    .line 22
    iput-object p2, v0, La/wpj0;->k:La/no20;

    .line 23
    .line 24
    iput-object p3, v0, La/wpj0;->l:La/ypj0;

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, La/wpj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
