.class public final La/pw70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/oeg0;

.field public final b:La/ytt;


# direct methods
.method public constructor <init>(La/oeg0;La/jdk0;La/ytt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pw70;->a:La/oeg0;

    .line 8
    .line 9
    iput-object p3, p0, La/pw70;->b:La/ytt;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;
    .locals 4

    .line 1
    and-int/lit8 v0, p7, 0x10

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, p4

    .line 8
    move p4, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, p4

    .line 11
    move p4, v1

    .line 12
    :goto_0
    and-int/lit8 v3, p7, 0x20

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    move v0, v2

    .line 17
    :cond_1
    and-int/lit8 p7, p7, 0x40

    .line 18
    .line 19
    if-eqz p7, :cond_2

    .line 20
    .line 21
    move-object p7, p6

    .line 22
    move p6, v1

    .line 23
    :goto_1
    move p5, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object p7, p6

    .line 26
    move p6, p5

    .line 27
    goto :goto_1

    .line 28
    :goto_2
    invoke-virtual/range {p0 .. p7}, La/pw70;->a(La/mlr;Ljava/lang/String;IZZZLa/yje;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method


# virtual methods
.method public final a(La/mlr;Ljava/lang/String;IZZZLa/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, La/ow70;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/ow70;

    .line 11
    .line 12
    iget v3, v2, La/ow70;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/ow70;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/ow70;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/ow70;-><init>(La/pw70;La/yje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/ow70;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/ow70;->q:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    iget-boolean v3, v2, La/ow70;->n:Z

    .line 41
    .line 42
    iget-boolean v4, v2, La/ow70;->m:Z

    .line 43
    .line 44
    iget-boolean v5, v2, La/ow70;->l:Z

    .line 45
    .line 46
    iget v6, v2, La/ow70;->k:I

    .line 47
    .line 48
    iget-object v7, v2, La/ow70;->j:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, v2, La/ow70;->i:La/mlr;

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move/from16 v18, v3

    .line 56
    .line 57
    move/from16 v16, v4

    .line 58
    .line 59
    move v15, v5

    .line 60
    move v13, v6

    .line 61
    move-object/from16 v17, v7

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, La/aue0;->d:La/aue0;

    .line 75
    .line 76
    move-object/from16 v4, p1

    .line 77
    .line 78
    iput-object v4, v2, La/ow70;->i:La/mlr;

    .line 79
    .line 80
    move-object/from16 v6, p2

    .line 81
    .line 82
    iput-object v6, v2, La/ow70;->j:Ljava/lang/String;

    .line 83
    .line 84
    move/from16 v7, p3

    .line 85
    .line 86
    iput v7, v2, La/ow70;->k:I

    .line 87
    .line 88
    move/from16 v8, p4

    .line 89
    .line 90
    iput-boolean v8, v2, La/ow70;->l:Z

    .line 91
    .line 92
    move/from16 v9, p5

    .line 93
    .line 94
    iput-boolean v9, v2, La/ow70;->m:Z

    .line 95
    .line 96
    move/from16 v10, p6

    .line 97
    .line 98
    iput-boolean v10, v2, La/ow70;->n:Z

    .line 99
    .line 100
    iput v5, v2, La/ow70;->q:I

    .line 101
    .line 102
    iget-object v5, v0, La/pw70;->b:La/ytt;

    .line 103
    .line 104
    invoke-virtual {v5, v1, v2}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-ne v1, v3, :cond_3

    .line 109
    .line 110
    return-object v3

    .line 111
    :cond_3
    move-object v2, v4

    .line 112
    move-object/from16 v17, v6

    .line 113
    .line 114
    move v13, v7

    .line 115
    move v15, v8

    .line 116
    move/from16 v16, v9

    .line 117
    .line 118
    move/from16 v18, v10

    .line 119
    .line 120
    :goto_1
    iget-wide v3, v2, La/mlr;->a:J

    .line 121
    .line 122
    iget-object v5, v2, La/mlr;->f:Ljava/lang/String;

    .line 123
    .line 124
    iget-wide v6, v2, La/mlr;->c:J

    .line 125
    .line 126
    iget-boolean v8, v2, La/mlr;->l:Z

    .line 127
    .line 128
    iget-wide v9, v2, La/mlr;->b:J

    .line 129
    .line 130
    iget-boolean v11, v2, La/mlr;->m:Z

    .line 131
    .line 132
    const/4 v12, 0x1

    .line 133
    iget-boolean v14, v2, La/mlr;->n:Z

    .line 134
    .line 135
    invoke-static/range {v3 .. v18}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    move/from16 v9, v16

    .line 140
    .line 141
    iget-object v0, v0, La/pw70;->a:La/oeg0;

    .line 142
    .line 143
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v3, La/bt8;

    .line 148
    .line 149
    invoke-direct {v3, v1, v15, v9, v2}, La/bt8;-><init>(Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;ZZLa/mlr;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 153
    .line 154
    .line 155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0
.end method
