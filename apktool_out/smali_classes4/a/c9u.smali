.class public final La/c9u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Z

.field public final synthetic l:La/ali;

.field public final synthetic m:I

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:La/jvn;

.field public final synthetic p:J

.field public final synthetic q:Z

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(ZLa/ali;ILjava/util/List;La/jvn;JZZLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/c9u;->k:Z

    .line 2
    .line 3
    iput-object p2, p0, La/c9u;->l:La/ali;

    .line 4
    .line 5
    iput p3, p0, La/c9u;->m:I

    .line 6
    .line 7
    iput-object p4, p0, La/c9u;->n:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, La/c9u;->o:La/jvn;

    .line 10
    .line 11
    iput-wide p6, p0, La/c9u;->p:J

    .line 12
    .line 13
    iput-boolean p8, p0, La/c9u;->q:Z

    .line 14
    .line 15
    iput-boolean p9, p0, La/c9u;->r:Z

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/c9u;

    .line 2
    .line 3
    iget-boolean v8, p0, La/c9u;->q:Z

    .line 4
    .line 5
    iget-boolean v9, p0, La/c9u;->r:Z

    .line 6
    .line 7
    iget-boolean v1, p0, La/c9u;->k:Z

    .line 8
    .line 9
    iget-object v2, p0, La/c9u;->l:La/ali;

    .line 10
    .line 11
    iget v3, p0, La/c9u;->m:I

    .line 12
    .line 13
    iget-object v4, p0, La/c9u;->n:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, p0, La/c9u;->o:La/jvn;

    .line 16
    .line 17
    iget-wide v6, p0, La/c9u;->p:J

    .line 18
    .line 19
    move-object v10, p2

    .line 20
    invoke-direct/range {v0 .. v10}, La/c9u;-><init>(ZLa/ali;ILjava/util/List;La/jvn;JZZLa/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/c9u;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/c9u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c9u;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c9u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/c9u;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/kmq;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v3, v0, La/c9u;->i:Z

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    return-object v0

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v7, v0, La/c9u;->k:Z

    .line 32
    .line 33
    if-eqz v7, :cond_2

    .line 34
    .line 35
    const-wide/16 v5, 0x8

    .line 36
    .line 37
    :goto_0
    move-wide v14, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-wide/16 v5, 0x1e

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    new-instance v5, La/a9u;

    .line 43
    .line 44
    iget-wide v11, v0, La/c9u;->p:J

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    iget-object v6, v0, La/c9u;->l:La/ali;

    .line 48
    .line 49
    iget v8, v0, La/c9u;->m:I

    .line 50
    .line 51
    iget-object v9, v0, La/c9u;->n:Ljava/util/List;

    .line 52
    .line 53
    iget-object v10, v0, La/c9u;->o:La/jvn;

    .line 54
    .line 55
    invoke-direct/range {v5 .. v13}, La/a9u;-><init>(La/ali;ZILjava/util/List;La/jvn;JLa/yje;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v19, v6

    .line 59
    .line 60
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 61
    .line 62
    invoke-static {v14, v15, v3, v5}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    new-instance v16, La/b9u;

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    iget-boolean v5, v0, La/c9u;->q:Z

    .line 73
    .line 74
    iget-boolean v6, v0, La/c9u;->r:Z

    .line 75
    .line 76
    move/from16 v20, v5

    .line 77
    .line 78
    move/from16 v21, v6

    .line 79
    .line 80
    invoke-direct/range {v16 .. v21}, La/b9u;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 81
    .line 82
    .line 83
    move-object/from16 v5, v16

    .line 84
    .line 85
    move-object/from16 v6, v18

    .line 86
    .line 87
    invoke-static {v3, v5}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-boolean v3, v0, La/c9u;->k:Z

    .line 92
    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    const-string v3, "Live"

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    const-string v3, "Line"

    .line 99
    .line 100
    :goto_2
    const-string v5, "load "

    .line 101
    .line 102
    const-string v8, " GamesOfFavoritesChamps"

    .line 103
    .line 104
    invoke-static {v5, v3, v8}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-class v3, Ljava/net/SocketTimeoutException;

    .line 109
    .line 110
    const-class v5, Ljava/net/UnknownHostException;

    .line 111
    .line 112
    filled-new-array {v3, v5}, [Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    sget-object v3, La/i2o;->i1:La/i2o;

    .line 121
    .line 122
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    new-instance v5, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-direct {v5, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 129
    .line 130
    .line 131
    sget-object v3, La/i2o;->j1:La/i2o;

    .line 132
    .line 133
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    new-instance v9, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-direct {v9, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 140
    .line 141
    .line 142
    sget-object v3, La/i2o;->k1:La/i2o;

    .line 143
    .line 144
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    new-instance v10, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-direct {v10, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 151
    .line 152
    .line 153
    sget-object v3, La/i2o;->l1:La/i2o;

    .line 154
    .line 155
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    new-instance v11, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-direct {v11, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 162
    .line 163
    .line 164
    filled-new-array {v5, v9, v10, v11}, [Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    const/4 v14, 0x0

    .line 173
    const/16 v15, 0x20

    .line 174
    .line 175
    const/4 v9, 0x3

    .line 176
    const-wide/16 v10, 0x3

    .line 177
    .line 178
    invoke-static/range {v7 .. v15}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    iput-object v6, v0, La/c9u;->j:Ljava/lang/Object;

    .line 183
    .line 184
    iput-boolean v4, v0, La/c9u;->i:Z

    .line 185
    .line 186
    invoke-static {v1, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v2, :cond_4

    .line 191
    .line 192
    return-object v2

    .line 193
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0
.end method
