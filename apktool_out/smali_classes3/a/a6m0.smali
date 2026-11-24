.class public final La/a6m0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/zsf;

.field public final synthetic l:La/t33;

.field public final synthetic m:La/t33;

.field public final synthetic n:La/t33;

.field public final synthetic o:F

.field public final synthetic p:F

.field public final synthetic q:La/t33;

.field public final synthetic r:La/t33;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(La/zsf;La/t33;La/t33;La/t33;FFLa/t33;La/t33;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/a6m0;->k:La/zsf;

    .line 2
    .line 3
    iput-object p2, p0, La/a6m0;->l:La/t33;

    .line 4
    .line 5
    iput-object p3, p0, La/a6m0;->m:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/a6m0;->n:La/t33;

    .line 8
    .line 9
    iput p5, p0, La/a6m0;->o:F

    .line 10
    .line 11
    iput p6, p0, La/a6m0;->p:F

    .line 12
    .line 13
    iput-object p7, p0, La/a6m0;->q:La/t33;

    .line 14
    .line 15
    iput-object p8, p0, La/a6m0;->r:La/t33;

    .line 16
    .line 17
    iput-wide p9, p0, La/a6m0;->s:J

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/a6m0;

    .line 2
    .line 3
    iget-object v8, p0, La/a6m0;->r:La/t33;

    .line 4
    .line 5
    iget-wide v9, p0, La/a6m0;->s:J

    .line 6
    .line 7
    iget-object v1, p0, La/a6m0;->k:La/zsf;

    .line 8
    .line 9
    iget-object v2, p0, La/a6m0;->l:La/t33;

    .line 10
    .line 11
    iget-object v3, p0, La/a6m0;->m:La/t33;

    .line 12
    .line 13
    iget-object v4, p0, La/a6m0;->n:La/t33;

    .line 14
    .line 15
    iget v5, p0, La/a6m0;->o:F

    .line 16
    .line 17
    iget v6, p0, La/a6m0;->p:F

    .line 18
    .line 19
    iget-object v7, p0, La/a6m0;->q:La/t33;

    .line 20
    .line 21
    move-object v11, p2

    .line 22
    invoke-direct/range {v0 .. v11}, La/a6m0;-><init>(La/zsf;La/t33;La/t33;La/t33;FFLa/t33;La/t33;JLa/yje;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/a6m0;->j:Ljava/lang/Object;

    .line 26
    .line 27
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
    invoke-virtual {p0, p1, p2}, La/a6m0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a6m0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a6m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/a6m0;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/a6m0;->i:B

    .line 10
    .line 11
    iget-object v6, v0, La/a6m0;->k:La/zsf;

    .line 12
    .line 13
    const/4 v12, 0x3

    .line 14
    const/4 v13, 0x2

    .line 15
    const/4 v14, 0x1

    .line 16
    const/4 v15, 0x0

    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    if-eq v3, v14, :cond_1

    .line 20
    .line 21
    if-ne v3, v13, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v15

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/x5m0;

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    iget-object v5, v0, La/a6m0;->l:La/t33;

    .line 44
    .line 45
    iget-object v7, v0, La/a6m0;->m:La/t33;

    .line 46
    .line 47
    iget v8, v0, La/a6m0;->o:F

    .line 48
    .line 49
    iget-object v9, v0, La/a6m0;->n:La/t33;

    .line 50
    .line 51
    iget v10, v0, La/a6m0;->p:F

    .line 52
    .line 53
    invoke-direct/range {v4 .. v11}, La/x5m0;-><init>(La/t33;La/zsf;La/t33;FLa/t33;FLa/yje;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v15, v15, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v1, v0, La/a6m0;->j:Ljava/lang/Object;

    .line 61
    .line 62
    iput-byte v14, v0, La/a6m0;->i:B

    .line 63
    .line 64
    invoke-virtual {v3, v0}, La/pby;->join(La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-ne v3, v2, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    iput-object v1, v0, La/a6m0;->j:Ljava/lang/Object;

    .line 72
    .line 73
    iput-byte v13, v0, La/a6m0;->i:B

    .line 74
    .line 75
    const-wide/16 v3, 0xfa0

    .line 76
    .line 77
    invoke-static {v3, v4, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-ne v3, v2, :cond_4

    .line 82
    .line 83
    :goto_1
    return-object v2

    .line 84
    :cond_4
    :goto_2
    new-instance v4, La/oxn;

    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x5

    .line 88
    iget-object v5, v0, La/a6m0;->r:La/t33;

    .line 89
    .line 90
    move-object v8, v6

    .line 91
    iget-wide v6, v0, La/a6m0;->s:J

    .line 92
    .line 93
    invoke-direct/range {v4 .. v10}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 94
    .line 95
    .line 96
    move-object v6, v8

    .line 97
    invoke-static {v1, v15, v15, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    new-instance v2, La/pxn;

    .line 101
    .line 102
    const/4 v3, 0x7

    .line 103
    iget-object v4, v0, La/a6m0;->q:La/t33;

    .line 104
    .line 105
    invoke-direct {v2, v4, v6, v15, v3}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v15, v15, v2, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 109
    .line 110
    .line 111
    new-instance v2, La/pxn;

    .line 112
    .line 113
    const/16 v3, 0x8

    .line 114
    .line 115
    iget-object v0, v0, La/a6m0;->m:La/t33;

    .line 116
    .line 117
    invoke-direct {v2, v0, v6, v15, v3}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v15, v15, v2, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 121
    .line 122
    .line 123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0
.end method
