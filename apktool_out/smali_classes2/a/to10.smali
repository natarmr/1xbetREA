.class public final La/to10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:F

.field public j:F

.field public k:B

.field public final synthetic l:La/vo10;

.field public final synthetic m:La/t33;

.field public final synthetic n:Lkotlin/jvm/functions/Function0;

.field public final synthetic o:La/pz40;


# direct methods
.method public constructor <init>(La/vo10;La/t33;Lkotlin/jvm/functions/Function0;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/to10;->l:La/vo10;

    .line 2
    .line 3
    iput-object p2, p0, La/to10;->m:La/t33;

    .line 4
    .line 5
    iput-object p3, p0, La/to10;->n:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iput-object p4, p0, La/to10;->o:La/pz40;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/to10;

    .line 2
    .line 3
    iget-object v3, p0, La/to10;->n:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object v4, p0, La/to10;->o:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/to10;->l:La/vo10;

    .line 8
    .line 9
    iget-object v2, p0, La/to10;->m:La/t33;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/to10;-><init>(La/vo10;La/t33;Lkotlin/jvm/functions/Function0;La/pz40;La/yje;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/to10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/to10;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/to10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/to10;->k:B

    .line 4
    .line 5
    iget-object v2, p0, La/to10;->o:La/pz40;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v4, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object v10, p0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    iget v1, p0, La/to10;->j:F

    .line 28
    .line 29
    iget v3, p0, La/to10;->i:F

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, La/to10;->l:La/vo10;

    .line 39
    .line 40
    iget-object v1, p1, La/vo10;->b:La/esr;

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const/high16 v6, 0x43b40000    # 360.0f

    .line 58
    .line 59
    rem-float/2addr v5, v6

    .line 60
    invoke-static {p1, v1, v4, v5}, La/y0x0;->E(La/vo10;La/esr;IF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    new-instance p1, Ljava/lang/Float;

    .line 65
    .line 66
    invoke-direct {p1, v5}, Ljava/lang/Float;-><init>(F)V

    .line 67
    .line 68
    .line 69
    iput v5, p0, La/to10;->i:F

    .line 70
    .line 71
    iput v1, p0, La/to10;->j:F

    .line 72
    .line 73
    iput-byte v3, p0, La/to10;->k:B

    .line 74
    .line 75
    iget-object v3, p0, La/to10;->m:La/t33;

    .line 76
    .line 77
    invoke-virtual {v3, p0, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v3, v5

    .line 85
    :goto_0
    new-instance v6, Ljava/lang/Float;

    .line 86
    .line 87
    invoke-direct {v6, v1}, Ljava/lang/Float;-><init>(F)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    sget-object v5, La/ihn;->a:La/zsf;

    .line 92
    .line 93
    const/16 v7, 0x5dc

    .line 94
    .line 95
    invoke-static {v7, p1, v5, v4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    new-instance v9, La/y9v;

    .line 100
    .line 101
    const/16 p1, 0x10

    .line 102
    .line 103
    invoke-direct {v9, v2, p1}, La/y9v;-><init>(La/pz40;B)V

    .line 104
    .line 105
    .line 106
    iput v3, p0, La/to10;->i:F

    .line 107
    .line 108
    iput v1, p0, La/to10;->j:F

    .line 109
    .line 110
    iput-byte v4, p0, La/to10;->k:B

    .line 111
    .line 112
    iget-object v5, p0, La/to10;->m:La/t33;

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v11, 0x4

    .line 116
    move-object v10, p0

    .line 117
    invoke-static/range {v5 .. v11}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_5

    .line 122
    .line 123
    :goto_1
    return-object v0

    .line 124
    :cond_5
    :goto_2
    iget-object p0, v10, La/to10;->n:Lkotlin/jvm/functions/Function0;

    .line 125
    .line 126
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0
.end method
