.class public final La/tcf;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:F

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/hea;

.field public final synthetic m:La/xcf;

.field public final synthetic n:La/t33;

.field public final synthetic o:La/t33;

.field public final synthetic p:La/t33;


# direct methods
.method public constructor <init>(La/hea;La/xcf;La/t33;La/t33;La/t33;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tcf;->l:La/hea;

    .line 2
    .line 3
    iput-object p2, p0, La/tcf;->m:La/xcf;

    .line 4
    .line 5
    iput-object p3, p0, La/tcf;->n:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/tcf;->o:La/t33;

    .line 8
    .line 9
    iput-object p5, p0, La/tcf;->p:La/t33;

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
    new-instance v0, La/tcf;

    .line 2
    .line 3
    iget-object v4, p0, La/tcf;->o:La/t33;

    .line 4
    .line 5
    iget-object v5, p0, La/tcf;->p:La/t33;

    .line 6
    .line 7
    iget-object v1, p0, La/tcf;->l:La/hea;

    .line 8
    .line 9
    iget-object v2, p0, La/tcf;->m:La/xcf;

    .line 10
    .line 11
    iget-object v3, p0, La/tcf;->n:La/t33;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/tcf;-><init>(La/hea;La/xcf;La/t33;La/t33;La/t33;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/tcf;->k:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/tcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/tcf;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/tcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/tcf;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/tcf;->j:B

    .line 8
    .line 9
    iget-object v3, p0, La/tcf;->n:La/t33;

    .line 10
    .line 11
    iget-object v4, p0, La/tcf;->o:La/t33;

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-eq v2, v6, :cond_1

    .line 19
    .line 20
    if-ne v2, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    iget v0, p0, La/tcf;->i:F

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/tcf;->l:La/hea;

    .line 42
    .line 43
    sget-object v2, La/hea;->a:La/hea;

    .line 44
    .line 45
    if-ne p1, v2, :cond_3

    .line 46
    .line 47
    const/high16 p1, -0x40800000    # -1.0f

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 51
    .line 52
    :goto_0
    new-instance v2, La/ly7;

    .line 53
    .line 54
    invoke-direct {v2, v4, p1, v7, v6}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 55
    .line 56
    .line 57
    const/4 v8, 0x3

    .line 58
    invoke-static {v0, v7, v7, v2, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v9, La/my7;

    .line 63
    .line 64
    const/16 v10, 0x10

    .line 65
    .line 66
    invoke-direct {v9, v3, v7, v10}, La/my7;-><init>(La/t33;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v7, v7, v9, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    new-instance v10, La/my7;

    .line 74
    .line 75
    iget-object v11, p0, La/tcf;->p:La/t33;

    .line 76
    .line 77
    const/16 v12, 0xf

    .line 78
    .line 79
    invoke-direct {v10, v11, v7, v12}, La/my7;-><init>(La/t33;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v7, v7, v10, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-array v8, v8, [La/bby;

    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    aput-object v9, v8, v10

    .line 90
    .line 91
    aput-object v0, v8, v6

    .line 92
    .line 93
    aput-object v2, v8, v5

    .line 94
    .line 95
    iput-object v7, p0, La/tcf;->k:Ljava/lang/Object;

    .line 96
    .line 97
    iput p1, p0, La/tcf;->i:F

    .line 98
    .line 99
    iput-byte v6, p0, La/tcf;->j:B

    .line 100
    .line 101
    invoke-static {v8, p0}, La/qjj;->U([La/bby;La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v1, :cond_4

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    move v0, p1

    .line 109
    :goto_1
    iput-object v7, p0, La/tcf;->k:Ljava/lang/Object;

    .line 110
    .line 111
    iput v0, p0, La/tcf;->i:F

    .line 112
    .line 113
    iput-byte v5, p0, La/tcf;->j:B

    .line 114
    .line 115
    new-instance p1, La/fr9;

    .line 116
    .line 117
    const/16 v0, 0xa

    .line 118
    .line 119
    invoke-direct {p1, v4, v3, v7, v0}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0, p1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v1, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_2
    if-ne p0, v1, :cond_6

    .line 132
    .line 133
    :goto_3
    return-object v1

    .line 134
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0
.end method
