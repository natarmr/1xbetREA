.class public final La/cm4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:B

.field public final synthetic j:La/im4;

.field public final synthetic k:La/uu4;

.field public final synthetic l:La/ynb0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/im4;La/uu4;La/ynb0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cm4;->j:La/im4;

    .line 2
    .line 3
    iput-object p2, p0, La/cm4;->k:La/uu4;

    .line 4
    .line 5
    iput-object p3, p0, La/cm4;->l:La/ynb0;

    .line 6
    .line 7
    iput-object p4, p0, La/cm4;->m:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, La/cm4;->n:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/cm4;

    .line 2
    .line 3
    iget-object v4, p0, La/cm4;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, La/cm4;->n:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iget-object v1, p0, La/cm4;->j:La/im4;

    .line 8
    .line 9
    iget-object v2, p0, La/cm4;->k:La/uu4;

    .line 10
    .line 11
    iget-object v3, p0, La/cm4;->l:La/ynb0;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, La/cm4;-><init>(La/im4;La/uu4;La/ynb0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/cm4;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cm4;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/cm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/cm4;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/cm4;->j:La/im4;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v5, :cond_2

    .line 13
    .line 14
    if-eq v1, v4, :cond_1

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v2, La/im4;->i:La/tyu;

    .line 41
    .line 42
    invoke-virtual {v2}, La/x2t0;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/um4;

    .line 47
    .line 48
    iget-boolean v8, v1, La/um4;->b:Z

    .line 49
    .line 50
    iput-byte v5, p0, La/cm4;->i:B

    .line 51
    .line 52
    iget-object v7, p1, La/tyu;->a:La/pzu;

    .line 53
    .line 54
    iget-object p1, v7, La/pzu;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/mne;

    .line 57
    .line 58
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v6, La/tu3;

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    iget-object v9, p0, La/cm4;->k:La/uu4;

    .line 64
    .line 65
    iget-object v10, p0, La/cm4;->l:La/ynb0;

    .line 66
    .line 67
    invoke-direct/range {v6 .. v11}, La/tu3;-><init>(La/pzu;ZLa/uu4;La/ynb0;La/yje;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v6, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_0
    check-cast p1, La/kx00;

    .line 78
    .line 79
    iput-byte v4, p0, La/cm4;->i:B

    .line 80
    .line 81
    sget v1, La/im4;->u:I

    .line 82
    .line 83
    invoke-virtual {v2, p1, p0}, La/im4;->n(La/kx00;La/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    :goto_1
    iput-byte v3, p0, La/cm4;->i:B

    .line 91
    .line 92
    sget p1, La/im4;->u:I

    .line 93
    .line 94
    iget-object v3, p0, La/cm4;->k:La/uu4;

    .line 95
    .line 96
    iget-object v4, p0, La/cm4;->m:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v5, p0, La/cm4;->n:Lkotlin/jvm/functions/Function2;

    .line 99
    .line 100
    const-string v6, ""

    .line 101
    .line 102
    move-object v7, p0

    .line 103
    invoke-virtual/range {v2 .. v7}, La/im4;->i(La/uu4;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v0, :cond_6

    .line 108
    .line 109
    :goto_2
    return-object v0

    .line 110
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0
.end method
