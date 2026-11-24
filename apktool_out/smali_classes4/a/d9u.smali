.class public final La/d9u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/ali;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:J

.field public final synthetic o:I

.field public final synthetic p:Z

.field public final synthetic q:Z


# direct methods
.method public constructor <init>(La/yje;La/ali;Ljava/util/List;JIZZ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/d9u;->l:La/ali;

    .line 2
    .line 3
    iput-object p3, p0, La/d9u;->m:Ljava/util/List;

    .line 4
    .line 5
    iput-wide p4, p0, La/d9u;->n:J

    .line 6
    .line 7
    iput p6, p0, La/d9u;->o:I

    .line 8
    .line 9
    iput-boolean p7, p0, La/d9u;->p:Z

    .line 10
    .line 11
    iput-boolean p8, p0, La/d9u;->q:Z

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/d9u;

    .line 7
    .line 8
    iget-boolean v7, p0, La/d9u;->p:Z

    .line 9
    .line 10
    iget-boolean v8, p0, La/d9u;->q:Z

    .line 11
    .line 12
    iget-object v2, p0, La/d9u;->l:La/ali;

    .line 13
    .line 14
    iget-object v3, p0, La/d9u;->m:Ljava/util/List;

    .line 15
    .line 16
    iget-wide v4, p0, La/d9u;->n:J

    .line 17
    .line 18
    iget v6, p0, La/d9u;->o:I

    .line 19
    .line 20
    invoke-direct/range {v0 .. v8}, La/d9u;-><init>(La/yje;La/ali;Ljava/util/List;JIZZ)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/d9u;->j:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/d9u;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/d9u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/d9u;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, La/d9u;->j:La/kmq;

    .line 27
    .line 28
    iget-object v5, v0, La/d9u;->k:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v11, v5

    .line 31
    check-cast v11, La/jvn;

    .line 32
    .line 33
    new-instance v6, La/c9u;

    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    iget-object v8, v0, La/d9u;->l:La/ali;

    .line 39
    .line 40
    iget v9, v0, La/d9u;->o:I

    .line 41
    .line 42
    iget-object v10, v0, La/d9u;->m:Ljava/util/List;

    .line 43
    .line 44
    iget-wide v12, v0, La/d9u;->n:J

    .line 45
    .line 46
    iget-boolean v14, v0, La/d9u;->p:Z

    .line 47
    .line 48
    iget-boolean v15, v0, La/d9u;->q:Z

    .line 49
    .line 50
    invoke-direct/range {v6 .. v16}, La/c9u;-><init>(ZLa/ali;ILjava/util/List;La/jvn;JZZLa/yje;)V

    .line 51
    .line 52
    .line 53
    new-instance v5, La/vsg0;

    .line 54
    .line 55
    invoke-direct {v5, v6}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 56
    .line 57
    .line 58
    new-instance v6, La/c9u;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    iget v9, v0, La/d9u;->o:I

    .line 62
    .line 63
    iget-object v10, v0, La/d9u;->m:Ljava/util/List;

    .line 64
    .line 65
    iget-wide v12, v0, La/d9u;->n:J

    .line 66
    .line 67
    iget-boolean v14, v0, La/d9u;->p:Z

    .line 68
    .line 69
    iget-boolean v15, v0, La/d9u;->q:Z

    .line 70
    .line 71
    invoke-direct/range {v6 .. v16}, La/c9u;-><init>(ZLa/ali;ILjava/util/List;La/jvn;JZZLa/yje;)V

    .line 72
    .line 73
    .line 74
    new-instance v7, La/vsg0;

    .line 75
    .line 76
    invoke-direct {v7, v6}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 77
    .line 78
    .line 79
    sget-object v6, La/e9u;->h:La/e9u;

    .line 80
    .line 81
    iput-object v3, v0, La/d9u;->j:La/kmq;

    .line 82
    .line 83
    iput-object v3, v0, La/d9u;->k:Ljava/lang/Object;

    .line 84
    .line 85
    iput-boolean v4, v0, La/d9u;->i:Z

    .line 86
    .line 87
    invoke-static {v2}, La/f7k;->J(La/kmq;)V

    .line 88
    .line 89
    .line 90
    const/4 v8, 0x2

    .line 91
    new-array v8, v8, [La/gmq;

    .line 92
    .line 93
    const/4 v9, 0x0

    .line 94
    aput-object v5, v8, v9

    .line 95
    .line 96
    aput-object v7, v8, v4

    .line 97
    .line 98
    sget-object v4, La/pul;->j:La/pul;

    .line 99
    .line 100
    new-instance v5, La/kh1;

    .line 101
    .line 102
    const/16 v7, 0x9

    .line 103
    .line 104
    invoke-direct {v5, v6, v3, v7}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v2, v5, v4, v8}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v2, La/wne;->a:La/wne;

    .line 112
    .line 113
    if-ne v0, v2, :cond_2

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_0
    sget-object v2, La/wne;->a:La/wne;

    .line 119
    .line 120
    if-ne v0, v2, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_1
    if-ne v0, v1, :cond_4

    .line 126
    .line 127
    return-object v1

    .line 128
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0
.end method
