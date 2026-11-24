.class public final La/dls0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:B

.field public final synthetic j:La/els0;

.field public final synthetic k:J

.field public final synthetic l:Z


# direct methods
.method public constructor <init>(La/els0;JZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dls0;->j:La/els0;

    .line 2
    .line 3
    iput-wide p2, p0, La/dls0;->k:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/dls0;->l:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/dls0;

    .line 2
    .line 3
    iget-wide v2, p0, La/dls0;->k:J

    .line 4
    .line 5
    iget-boolean v4, p0, La/dls0;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, La/dls0;->j:La/els0;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, La/dls0;-><init>(La/els0;JZLa/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dls0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dls0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/dls0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/dls0;->i:B

    .line 6
    .line 7
    const/4 v7, 0x2

    .line 8
    const/4 v8, 0x1

    .line 9
    iget-object v9, v5, La/dls0;->j:La/els0;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v8, :cond_1

    .line 14
    .line 15
    if-ne v0, v7, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v9, La/els0;->s:La/j3c;

    .line 39
    .line 40
    iget-object v1, v9, La/els0;->o:Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 41
    .line 42
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;->b:J

    .line 43
    .line 44
    iput-byte v8, v5, La/dls0;->i:B

    .line 45
    .line 46
    iget-wide v3, v5, La/dls0;->k:J

    .line 47
    .line 48
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v6, :cond_3

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_3
    :goto_0
    move-object v14, v0

    .line 57
    check-cast v14, La/ypl0;

    .line 58
    .line 59
    sget v0, La/els0;->w:I

    .line 60
    .line 61
    iget-object v0, v9, La/i3t0;->i:La/ocj;

    .line 62
    .line 63
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 64
    .line 65
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-object v10, v1

    .line 73
    check-cast v10, La/pks0;

    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/16 v20, 0xfcd

    .line 78
    .line 79
    iget-wide v11, v5, La/dls0;->k:J

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    invoke-static/range {v10 .. v20}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-wide/from16 v23, v11

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object v0, v9, La/els0;->q:La/lbu;

    .line 102
    .line 103
    iget-object v1, v0, La/lbu;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, La/m1e;

    .line 106
    .line 107
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v21, La/ey;

    .line 112
    .line 113
    const/16 v26, 0x1b

    .line 114
    .line 115
    const/16 v25, 0x0

    .line 116
    .line 117
    move-object/from16 v22, v0

    .line 118
    .line 119
    invoke-direct/range {v21 .. v26}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v0, v21

    .line 123
    .line 124
    move-object/from16 v2, v25

    .line 125
    .line 126
    invoke-static {v1, v0}, La/aoq;->a(La/gmq;Lkotlin/jvm/functions/Function2;)La/utb;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, La/rl2;

    .line 131
    .line 132
    const/4 v3, 0x3

    .line 133
    const/16 v4, 0x1a

    .line 134
    .line 135
    invoke-direct {v1, v3, v2, v4}, La/rl2;-><init>(ILa/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance v3, La/dnq;

    .line 139
    .line 140
    invoke-direct {v3, v0, v1, v8}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 141
    .line 142
    .line 143
    new-instance v0, La/meq0;

    .line 144
    .line 145
    iget-boolean v1, v5, La/dls0;->l:Z

    .line 146
    .line 147
    invoke-direct {v0, v9, v1, v2}, La/meq0;-><init>(La/els0;ZLa/yje;)V

    .line 148
    .line 149
    .line 150
    iput-byte v7, v5, La/dls0;->i:B

    .line 151
    .line 152
    new-instance v1, La/vnq;

    .line 153
    .line 154
    sget-object v2, La/h660;->a:La/h660;

    .line 155
    .line 156
    invoke-direct {v1, v2, v0, v7}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v1, v5}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v6, :cond_5

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_1
    if-ne v0, v6, :cond_6

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    :goto_2
    if-ne v0, v6, :cond_7

    .line 174
    .line 175
    :goto_3
    return-object v6

    .line 176
    :cond_7
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0
.end method
