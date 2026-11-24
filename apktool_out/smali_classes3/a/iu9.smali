.class public final La/iu9;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/ju9;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/Integer;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/ju9;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/iu9;->j:La/ju9;

    .line 2
    .line 3
    iput-object p2, p0, La/iu9;->k:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La/iu9;->l:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, La/iu9;->m:I

    .line 8
    .line 9
    iput-object p5, p0, La/iu9;->n:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, La/iu9;->o:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, La/iu9;->p:Ljava/lang/Integer;

    .line 14
    .line 15
    iput-object p8, p0, La/iu9;->q:Ljava/lang/String;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/iu9;

    .line 2
    .line 3
    iget-object v7, p0, La/iu9;->p:Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v8, p0, La/iu9;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/iu9;->j:La/ju9;

    .line 8
    .line 9
    iget-object v2, p0, La/iu9;->k:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, La/iu9;->l:Ljava/lang/String;

    .line 12
    .line 13
    iget v4, p0, La/iu9;->m:I

    .line 14
    .line 15
    iget-object v5, p0, La/iu9;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, p0, La/iu9;->o:Ljava/lang/String;

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, La/iu9;-><init>(La/ju9;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;La/yje;)V

    .line 21
    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, La/iu9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/iu9;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/iu9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/iu9;->i:Z

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
    goto :goto_1

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
    iget-object p1, p0, La/iu9;->j:La/ju9;

    .line 25
    .line 26
    iget-object v1, p1, La/ju9;->a:La/ok50;

    .line 27
    .line 28
    iget-object v3, p1, La/ju9;->d:La/btt0;

    .line 29
    .line 30
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, La/zin0;

    .line 35
    .line 36
    new-instance v5, La/yin0;

    .line 37
    .line 38
    iget-object v6, p0, La/iu9;->p:Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move v6, v2

    .line 48
    :goto_0
    iget v7, p0, La/iu9;->m:I

    .line 49
    .line 50
    iget-object v8, p0, La/iu9;->n:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v9, p0, La/iu9;->o:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v5, v7, v8, v6, v9}, La/yin0;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v6, p0, La/iu9;->k:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v7, p0, La/iu9;->l:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v4, v6, v7, v5}, La/zin0;-><init>(Ljava/lang/String;Ljava/lang/String;La/yin0;)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, La/iu9;->q:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    iget-object p1, p1, La/ju9;->b:La/knf0;

    .line 69
    .line 70
    invoke-virtual {p1}, La/knf0;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    :cond_3
    iput-boolean v2, p0, La/iu9;->i:Z

    .line 75
    .line 76
    iget-object p1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/zm;

    .line 79
    .line 80
    invoke-virtual {p1}, La/zm;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La/qu9;

    .line 85
    .line 86
    invoke-interface {p1, v3, v4, v5, p0}, La/qu9;->e(Ljava/lang/String;La/zin0;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_4
    :goto_1
    check-cast p1, La/q16;

    .line 94
    .line 95
    invoke-virtual {p1}, La/q16;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ht9;

    .line 100
    .line 101
    invoke-static {p0}, La/m0x0;->T(La/ht9;)La/nu9;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
