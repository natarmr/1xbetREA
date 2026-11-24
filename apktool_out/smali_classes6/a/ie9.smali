.class public final La/ie9;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/t33;

.field public final synthetic k:F

.field public final synthetic l:Z

.field public final synthetic m:La/je9;

.field public final synthetic n:La/nlx;


# direct methods
.method public constructor <init>(La/t33;FZLa/je9;La/nlx;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ie9;->j:La/t33;

    .line 2
    .line 3
    iput p2, p0, La/ie9;->k:F

    .line 4
    .line 5
    iput-boolean p3, p0, La/ie9;->l:Z

    .line 6
    .line 7
    iput-object p4, p0, La/ie9;->m:La/je9;

    .line 8
    .line 9
    iput-object p5, p0, La/ie9;->n:La/nlx;

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
    new-instance v0, La/ie9;

    .line 2
    .line 3
    iget-object v4, p0, La/ie9;->m:La/je9;

    .line 4
    .line 5
    iget-object v5, p0, La/ie9;->n:La/nlx;

    .line 6
    .line 7
    iget-object v1, p0, La/ie9;->j:La/t33;

    .line 8
    .line 9
    iget v2, p0, La/ie9;->k:F

    .line 10
    .line 11
    iget-boolean v3, p0, La/ie9;->l:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/ie9;-><init>(La/t33;FZLa/je9;La/nlx;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/ie9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ie9;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ie9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/ie9;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

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
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/ie9;->j:La/t33;

    .line 29
    .line 30
    iget-object v1, p1, La/t33;->e:La/pz40;

    .line 31
    .line 32
    check-cast v1, La/hgk0;

    .line 33
    .line 34
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/ycl;

    .line 39
    .line 40
    iget v1, v1, La/ycl;->a:F

    .line 41
    .line 42
    iget v5, p0, La/ie9;->k:F

    .line 43
    .line 44
    invoke-static {v1, v5}, La/ycl;->b(FF)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_7

    .line 49
    .line 50
    iget-boolean v1, p0, La/ie9;->l:Z

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    new-instance v1, La/ycl;

    .line 55
    .line 56
    invoke-direct {v1, v5}, La/ycl;-><init>(F)V

    .line 57
    .line 58
    .line 59
    iput-byte v4, p0, La/ie9;->i:B

    .line 60
    .line 61
    invoke-virtual {p1, p0, v1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v0, :cond_7

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget-object v1, p1, La/t33;->e:La/pz40;

    .line 69
    .line 70
    check-cast v1, La/hgk0;

    .line 71
    .line 72
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ycl;

    .line 77
    .line 78
    iget v1, v1, La/ycl;->a:F

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-static {v1, v4}, La/ycl;->b(FF)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    new-instance v2, La/jub0;

    .line 88
    .line 89
    const-wide/16 v6, 0x0

    .line 90
    .line 91
    invoke-direct {v2, v6, v7}, La/jub0;-><init>(J)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v6, p0, La/ie9;->m:La/je9;

    .line 96
    .line 97
    iget v6, v6, La/je9;->a:F

    .line 98
    .line 99
    invoke-static {v1, v6}, La/ycl;->b(FF)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    new-instance v2, La/rsw;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    invoke-static {v1, v4}, La/ycl;->b(FF)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    new-instance v2, La/qpq;

    .line 118
    .line 119
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    :cond_6
    :goto_1
    iput-byte v3, p0, La/ie9;->i:B

    .line 123
    .line 124
    iget-object v1, p0, La/ie9;->n:La/nlx;

    .line 125
    .line 126
    invoke-static {p1, v5, v2, v1, p0}, La/bsn;->a(La/t33;FLa/nlx;La/nlx;La/zje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-ne p0, v0, :cond_7

    .line 131
    .line 132
    :goto_2
    return-object v0

    .line 133
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0
.end method
