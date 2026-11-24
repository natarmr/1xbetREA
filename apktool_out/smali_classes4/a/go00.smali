.class public final La/go00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/j700;

.field public final synthetic m:La/pzu;

.field public final synthetic n:I

.field public final synthetic o:Ljava/util/Set;

.field public final synthetic p:Z

.field public final synthetic q:J

.field public final synthetic r:Ljava/util/Set;

.field public final synthetic s:Z

.field public final synthetic t:J


# direct methods
.method public constructor <init>(La/yje;La/j700;La/pzu;ILjava/util/Set;ZJLjava/util/Set;ZJ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/go00;->l:La/j700;

    .line 2
    .line 3
    iput-object p3, p0, La/go00;->m:La/pzu;

    .line 4
    .line 5
    iput p4, p0, La/go00;->n:I

    .line 6
    .line 7
    iput-object p5, p0, La/go00;->o:Ljava/util/Set;

    .line 8
    .line 9
    iput-boolean p6, p0, La/go00;->p:Z

    .line 10
    .line 11
    iput-wide p7, p0, La/go00;->q:J

    .line 12
    .line 13
    iput-object p9, p0, La/go00;->r:Ljava/util/Set;

    .line 14
    .line 15
    iput-boolean p10, p0, La/go00;->s:Z

    .line 16
    .line 17
    iput-wide p11, p0, La/go00;->t:J

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/kmq;

    .line 3
    .line 4
    move-object/from16 v2, p3

    .line 5
    .line 6
    check-cast v2, La/yje;

    .line 7
    .line 8
    new-instance v1, La/go00;

    .line 9
    .line 10
    iget-boolean v11, p0, La/go00;->s:Z

    .line 11
    .line 12
    iget-wide v12, p0, La/go00;->t:J

    .line 13
    .line 14
    iget-object v3, p0, La/go00;->l:La/j700;

    .line 15
    .line 16
    iget-object v4, p0, La/go00;->m:La/pzu;

    .line 17
    .line 18
    iget v5, p0, La/go00;->n:I

    .line 19
    .line 20
    iget-object v6, p0, La/go00;->o:Ljava/util/Set;

    .line 21
    .line 22
    iget-boolean v7, p0, La/go00;->p:Z

    .line 23
    .line 24
    iget-wide v8, p0, La/go00;->q:J

    .line 25
    .line 26
    iget-object v10, p0, La/go00;->r:Ljava/util/Set;

    .line 27
    .line 28
    invoke-direct/range {v1 .. v13}, La/go00;-><init>(La/yje;La/j700;La/pzu;ILjava/util/Set;ZJLjava/util/Set;ZJ)V

    .line 29
    .line 30
    .line 31
    iput-object v0, v1, La/go00;->j:La/kmq;

    .line 32
    .line 33
    move-object/from16 p0, p2

    .line 34
    .line 35
    iput-object p0, v1, La/go00;->k:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    invoke-virtual {v1, p0}, La/go00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/go00;->i:Z

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
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/go00;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/go00;->k:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v11, v5

    .line 32
    check-cast v11, La/jvn;

    .line 33
    .line 34
    iget-object v8, v0, La/go00;->l:La/j700;

    .line 35
    .line 36
    invoke-static {v8}, La/t9x;->J(La/j700;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget-object v9, v0, La/go00;->m:La/pzu;

    .line 41
    .line 42
    iget-object v6, v9, La/pzu;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, La/lef0;

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    iget-object v5, v6, La/lef0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, La/m8l0;

    .line 51
    .line 52
    iget-object v5, v5, La/m8l0;->a:La/p7m0;

    .line 53
    .line 54
    new-instance v6, La/jo00;

    .line 55
    .line 56
    iget v10, v0, La/go00;->n:I

    .line 57
    .line 58
    move-object v12, v11

    .line 59
    iget-object v11, v0, La/go00;->o:Ljava/util/Set;

    .line 60
    .line 61
    iget-boolean v13, v0, La/go00;->p:Z

    .line 62
    .line 63
    iget-wide v14, v0, La/go00;->q:J

    .line 64
    .line 65
    iget-object v7, v0, La/go00;->r:Ljava/util/Set;

    .line 66
    .line 67
    move-object/from16 v16, v7

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-direct/range {v6 .. v16}, La/jo00;-><init>(La/yje;La/j700;La/pzu;ILjava/util/Set;La/jvn;ZJLjava/util/Set;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move-object v8, v9

    .line 79
    move-object v12, v11

    .line 80
    iget-boolean v5, v0, La/go00;->s:Z

    .line 81
    .line 82
    invoke-virtual {v6, v5}, La/lef0;->f(Z)La/p7m0;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v6}, La/lef0;->g()La/p6d;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    sget-object v7, La/io00;->h:La/io00;

    .line 91
    .line 92
    new-instance v9, La/p6d;

    .line 93
    .line 94
    invoke-direct {v9, v5, v6, v7, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 95
    .line 96
    .line 97
    new-instance v6, La/ho00;

    .line 98
    .line 99
    move-object v5, v9

    .line 100
    iget v9, v0, La/go00;->n:I

    .line 101
    .line 102
    iget-object v10, v0, La/go00;->o:Ljava/util/Set;

    .line 103
    .line 104
    iget-boolean v12, v0, La/go00;->p:Z

    .line 105
    .line 106
    iget-wide v13, v0, La/go00;->q:J

    .line 107
    .line 108
    iget-object v15, v0, La/go00;->r:Ljava/util/Set;

    .line 109
    .line 110
    move-object/from16 p1, v8

    .line 111
    .line 112
    iget-wide v7, v0, La/go00;->t:J

    .line 113
    .line 114
    move-wide/from16 v16, v7

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    move-object/from16 v8, p1

    .line 118
    .line 119
    invoke-direct/range {v6 .. v17}, La/ho00;-><init>(La/yje;La/pzu;ILjava/util/Set;La/jvn;ZJLjava/util/Set;J)V

    .line 120
    .line 121
    .line 122
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    :goto_0
    iput-object v3, v0, La/go00;->j:La/kmq;

    .line 127
    .line 128
    iput-object v3, v0, La/go00;->k:Ljava/lang/Object;

    .line 129
    .line 130
    iput-boolean v4, v0, La/go00;->i:Z

    .line 131
    .line 132
    invoke-static {v2, v5, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-ne v0, v1, :cond_3

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0
.end method
