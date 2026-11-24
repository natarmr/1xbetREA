.class public final La/uo10;
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

.field public final synthetic p:La/pz40;


# direct methods
.method public constructor <init>(La/vo10;La/t33;Lkotlin/jvm/functions/Function0;La/pz40;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uo10;->l:La/vo10;

    .line 2
    .line 3
    iput-object p2, p0, La/uo10;->m:La/t33;

    .line 4
    .line 5
    iput-object p3, p0, La/uo10;->n:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iput-object p4, p0, La/uo10;->o:La/pz40;

    .line 8
    .line 9
    iput-object p5, p0, La/uo10;->p:La/pz40;

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
    new-instance v0, La/uo10;

    .line 2
    .line 3
    iget-object v4, p0, La/uo10;->o:La/pz40;

    .line 4
    .line 5
    iget-object v5, p0, La/uo10;->p:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/uo10;->l:La/vo10;

    .line 8
    .line 9
    iget-object v2, p0, La/uo10;->m:La/t33;

    .line 10
    .line 11
    iget-object v3, p0, La/uo10;->n:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/uo10;-><init>(La/vo10;La/t33;Lkotlin/jvm/functions/Function0;La/pz40;La/pz40;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/uo10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uo10;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/uo10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/uo10;->k:B

    .line 4
    .line 5
    iget-object v2, p0, La/uo10;->p:La/pz40;

    .line 6
    .line 7
    iget-object v3, p0, La/uo10;->o:La/pz40;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v5, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v11, p0

    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    iget v1, p0, La/uo10;->j:F

    .line 31
    .line 32
    iget v4, p0, La/uo10;->i:F

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/uo10;->l:La/vo10;

    .line 42
    .line 43
    iget-object v1, p1, La/vo10;->c:La/esr;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_3
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/high16 v7, 0x43b40000    # 360.0f

    .line 61
    .line 62
    rem-float/2addr v6, v7

    .line 63
    const/4 v7, 0x7

    .line 64
    invoke-static {p1, v1, v7, v6}, La/y0x0;->E(La/vo10;La/esr;IF)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    new-instance p1, Ljava/lang/Float;

    .line 69
    .line 70
    invoke-direct {p1, v6}, Ljava/lang/Float;-><init>(F)V

    .line 71
    .line 72
    .line 73
    iput v6, p0, La/uo10;->i:F

    .line 74
    .line 75
    iput v1, p0, La/uo10;->j:F

    .line 76
    .line 77
    iput-byte v4, p0, La/uo10;->k:B

    .line 78
    .line 79
    iget-object v4, p0, La/uo10;->m:La/t33;

    .line 80
    .line 81
    invoke-virtual {v4, p0, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move v4, v6

    .line 89
    :goto_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 90
    .line 91
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {v2, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v7, Ljava/lang/Float;

    .line 99
    .line 100
    invoke-direct {v7, v1}, Ljava/lang/Float;-><init>(F)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    sget-object v6, La/ihn;->a:La/zsf;

    .line 105
    .line 106
    const/16 v8, 0x5dc

    .line 107
    .line 108
    invoke-static {v8, p1, v6, v5}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    new-instance v10, La/y9v;

    .line 113
    .line 114
    const/16 p1, 0x11

    .line 115
    .line 116
    invoke-direct {v10, v3, p1}, La/y9v;-><init>(La/pz40;B)V

    .line 117
    .line 118
    .line 119
    iput v4, p0, La/uo10;->i:F

    .line 120
    .line 121
    iput v1, p0, La/uo10;->j:F

    .line 122
    .line 123
    iput-byte v5, p0, La/uo10;->k:B

    .line 124
    .line 125
    iget-object v6, p0, La/uo10;->m:La/t33;

    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v12, 0x4

    .line 129
    move-object v11, p0

    .line 130
    invoke-static/range {v6 .. v12}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    if-ne p0, v0, :cond_5

    .line 135
    .line 136
    :goto_1
    return-object v0

    .line 137
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 138
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object p0, v11, La/uo10;->n:Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0
.end method
