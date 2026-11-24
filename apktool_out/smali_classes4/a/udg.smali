.class public final La/udg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/do20;

.field public final b:La/tcg;

.field public final c:La/knf0;


# direct methods
.method public constructor <init>(La/do20;La/tcg;La/knf0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/udg;->a:La/do20;

    .line 11
    .line 12
    iput-object p2, p0, La/udg;->b:La/tcg;

    .line 13
    .line 14
    iput-object p3, p0, La/udg;->c:La/knf0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/pdg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/pdg;

    .line 7
    .line 8
    iget v1, v0, La/pdg;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/pdg;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pdg;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/pdg;-><init>(La/udg;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/pdg;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pdg;->m:I

    .line 30
    .line 31
    iget-object v3, p0, La/udg;->b:La/tcg;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, La/pdg;->j:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v7

    .line 58
    :cond_2
    iget-wide p0, v0, La/pdg;->i:J

    .line 59
    .line 60
    iget-object p2, v0, La/pdg;->j:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_3
    iget-wide p1, v0, La/pdg;->i:J

    .line 68
    .line 69
    iget-object p0, v0, La/pdg;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/udg;

    .line 72
    .line 73
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 83
    .line 84
    iget-object p3, p0, La/udg;->a:La/do20;

    .line 85
    .line 86
    iget-object p0, p0, La/udg;->c:La/knf0;

    .line 87
    .line 88
    invoke-virtual {p0}, La/knf0;->c()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iput-object v7, v0, La/pdg;->j:Ljava/lang/Object;

    .line 93
    .line 94
    iput-wide p1, v0, La/pdg;->i:J

    .line 95
    .line 96
    iput v6, v0, La/pdg;->m:I

    .line 97
    .line 98
    invoke-virtual {p3, p1, p2, v0, p0}, La/do20;->i(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-ne p3, v1, :cond_5

    .line 103
    .line 104
    goto/16 :goto_7

    .line 105
    .line 106
    :cond_5
    :goto_1
    check-cast p3, La/hsh;

    .line 107
    .line 108
    invoke-static {p3}, La/thb;->V(La/hsh;)La/esh;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    sget-object p3, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    move-wide v8, p1

    .line 115
    move-object p2, p0

    .line 116
    move-wide p0, v8

    .line 117
    goto :goto_3

    .line 118
    :goto_2
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 119
    .line 120
    new-instance p3, La/g0g0;

    .line 121
    .line 122
    invoke-direct {p3, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-wide p0, p1

    .line 126
    move-object p2, p3

    .line 127
    :goto_3
    nop

    .line 128
    instance-of p3, p2, La/g0g0;

    .line 129
    .line 130
    if-nez p3, :cond_7

    .line 131
    .line 132
    move-object p3, p2

    .line 133
    check-cast p3, La/esh;

    .line 134
    .line 135
    iput-object p2, v0, La/pdg;->j:Ljava/lang/Object;

    .line 136
    .line 137
    iput-wide p0, v0, La/pdg;->i:J

    .line 138
    .line 139
    iput v5, v0, La/pdg;->m:I

    .line 140
    .line 141
    iget-object v2, v3, La/tcg;->c:La/a8z;

    .line 142
    .line 143
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, La/mz40;

    .line 148
    .line 149
    new-instance v5, La/j0g0;

    .line 150
    .line 151
    invoke-direct {v5, p3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v2, v5, v0}, La/mz40;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    sget-object v2, La/wne;->a:La/wne;

    .line 159
    .line 160
    if-ne p3, v2, :cond_6

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_6
    sget-object p3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_4
    if-ne p3, v1, :cond_7

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_7
    :goto_5
    move-wide v8, p0

    .line 169
    move-object p0, p2

    .line 170
    move-wide p1, v8

    .line 171
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    if-eqz p3, :cond_9

    .line 176
    .line 177
    new-instance v2, La/g0g0;

    .line 178
    .line 179
    invoke-direct {v2, p3}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    iput-object p0, v0, La/pdg;->j:Ljava/lang/Object;

    .line 183
    .line 184
    iput-wide p1, v0, La/pdg;->i:J

    .line 185
    .line 186
    iput v4, v0, La/pdg;->m:I

    .line 187
    .line 188
    iget-object p1, v3, La/tcg;->c:La/a8z;

    .line 189
    .line 190
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, La/mz40;

    .line 195
    .line 196
    new-instance p2, La/j0g0;

    .line 197
    .line 198
    invoke-direct {p2, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p1, p2, v0}, La/mz40;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    sget-object p2, La/wne;->a:La/wne;

    .line 206
    .line 207
    if-ne p1, p2, :cond_8

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_6
    if-ne p1, v1, :cond_9

    .line 213
    .line 214
    :goto_7
    return-object v1

    .line 215
    :cond_9
    :goto_8
    return-object p0
.end method

.method public final b(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, La/qdg;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, La/qdg;

    iget v3, v2, La/qdg;->f1:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, La/qdg;->f1:I

    goto :goto_0

    :cond_0
    new-instance v2, La/qdg;

    invoke-direct {v2, v0, v1}, La/qdg;-><init>(La/udg;La/zje;)V

    :goto_0
    iget-object v1, v2, La/qdg;->Y:Ljava/lang/Object;

    .line 1
    sget-object v3, La/wne;->a:La/wne;

    .line 2
    iget v4, v2, La/qdg;->f1:I

    const-string v5, "Unexpected error"

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    iget-object v12, v0, La/udg;->b:La/tcg;

    const/4 v14, 0x1

    if-eqz v4, :cond_6

    if-eq v4, v14, :cond_5

    if-eq v4, v11, :cond_4

    if-eq v4, v10, :cond_3

    if-eq v4, v9, :cond_2

    if-ne v4, v8, :cond_1

    iget v0, v2, La/qdg;->r:I

    iget v4, v2, La/qdg;->q:I

    iget v6, v2, La/qdg;->p:I

    iget-wide v8, v2, La/qdg;->k:J

    move-wide/from16 p0, v8

    iget-wide v7, v2, La/qdg;->j:J

    iget-byte v9, v2, La/qdg;->o:B

    iget v15, v2, La/qdg;->n:I

    iget-wide v10, v2, La/qdg;->i:J

    const/16 v16, 0x0

    iget-object v13, v2, La/qdg;->A:La/qdg;

    check-cast v13, Ljava/lang/Throwable;

    iget-object v13, v2, La/qdg;->z:Ljava/lang/Throwable;

    iget-object v14, v2, La/qdg;->y:La/qdg;

    move/from16 p2, v0

    iget-object v0, v2, La/qdg;->x:La/udg;

    move-object/from16 p3, v0

    iget-object v0, v2, La/qdg;->w:Ljava/util/Map;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v17, v1

    iget-object v1, v2, La/qdg;->v:Ljava/util/Date;

    :try_start_0
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v22, v5

    move/from16 v20, v6

    move-wide/from16 v18, v7

    move-wide v6, v10

    move-object/from16 v21, v12

    move-object/from16 v17, v13

    move-object v11, v14

    move-wide/from16 v13, p0

    move-object v8, v1

    move-object v10, v2

    move-object v1, v3

    move v3, v4

    move v4, v9

    move v2, v15

    move-object/from16 v15, p3

    move-object v9, v0

    move/from16 v0, p2

    goto/16 :goto_23

    :catchall_0
    move-exception v0

    move-object v8, v1

    move-object/from16 v21, v12

    goto/16 :goto_27

    :cond_1
    const/16 v16, 0x0

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    :cond_2
    move-object/from16 v17, v1

    const/16 v16, 0x0

    iget v0, v2, La/qdg;->r:I

    iget v1, v2, La/qdg;->q:I

    iget v4, v2, La/qdg;->p:I

    iget-wide v6, v2, La/qdg;->k:J

    iget-wide v8, v2, La/qdg;->j:J

    iget-byte v10, v2, La/qdg;->o:B

    iget v11, v2, La/qdg;->n:I

    iget-wide v13, v2, La/qdg;->i:J

    iget-object v15, v2, La/qdg;->A:La/qdg;

    check-cast v15, Ljava/lang/Throwable;

    iget-object v15, v2, La/qdg;->z:Ljava/lang/Throwable;

    move/from16 p0, v0

    iget-object v0, v2, La/qdg;->y:La/qdg;

    move-object/from16 p1, v0

    iget-object v0, v2, La/qdg;->x:La/udg;

    move-object/from16 p2, v0

    iget-object v0, v2, La/qdg;->w:Ljava/util/Map;

    check-cast v0, Ljava/util/Map;

    move/from16 p3, v1

    iget-object v1, v2, La/qdg;->v:Ljava/util/Date;

    :try_start_1
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v22, v5

    move-wide/from16 v17, v6

    move-wide/from16 v19, v8

    move-object/from16 v21, v12

    move-wide v6, v13

    move-object v5, v15

    const/4 v13, 0x4

    move-object/from16 v15, p2

    move-object v9, v0

    move-object v8, v1

    move-object v1, v3

    move v14, v4

    move v4, v10

    move/from16 v0, p0

    move/from16 v3, p3

    move-object v10, v2

    move v2, v11

    move-object/from16 v11, p1

    goto/16 :goto_1f

    :cond_3
    move-object/from16 v17, v1

    const/16 v16, 0x0

    iget v0, v2, La/qdg;->u:I

    iget v1, v2, La/qdg;->t:I

    iget v4, v2, La/qdg;->s:I

    iget-wide v6, v2, La/qdg;->m:J

    iget-wide v8, v2, La/qdg;->l:J

    iget v10, v2, La/qdg;->r:I

    iget v11, v2, La/qdg;->q:I

    iget v13, v2, La/qdg;->p:I

    iget-wide v14, v2, La/qdg;->k:J

    move-wide/from16 p0, v6

    iget-wide v6, v2, La/qdg;->j:J

    move/from16 p2, v1

    iget-byte v1, v2, La/qdg;->o:B

    move/from16 p3, v1

    iget v1, v2, La/qdg;->n:I

    move-wide/from16 v18, v6

    iget-wide v6, v2, La/qdg;->i:J

    move/from16 p4, v0

    iget-object v0, v2, La/qdg;->B:Ljava/lang/Throwable;

    move-object/from16 p6, v0

    iget-object v0, v2, La/qdg;->A:La/qdg;

    move/from16 v20, v1

    iget-object v1, v2, La/qdg;->z:Ljava/lang/Throwable;

    move-object/from16 v21, v1

    iget-object v1, v2, La/qdg;->y:La/qdg;

    move-object/from16 v22, v1

    iget-object v1, v2, La/qdg;->x:La/udg;

    move-object/from16 v23, v0

    iget-object v0, v2, La/qdg;->w:Ljava/util/Map;

    move-object/from16 v24, v0

    check-cast v24, Ljava/util/Map;

    move-object/from16 v25, v1

    iget-object v1, v2, La/qdg;->v:Ljava/util/Date;

    :try_start_2
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v0, v22

    move-object/from16 v22, v5

    move v5, v11

    move-object v11, v0

    move-wide/from16 v30, p0

    move/from16 v17, p2

    move/from16 v0, p4

    move-wide/from16 v32, v8

    move-wide/from16 v34, v14

    move-wide/from16 v28, v18

    move-object/from16 v9, v24

    move-object/from16 v19, v25

    move-object v15, v1

    move-object v8, v2

    move-object v1, v3

    move/from16 v18, v4

    move v3, v13

    move/from16 v4, v20

    move-object/from16 v2, v21

    move-wide v13, v6

    move-object/from16 v21, v12

    move/from16 v6, p3

    move-object/from16 v7, p6

    move v12, v10

    move-object/from16 v10, v23

    goto/16 :goto_16

    :catchall_1
    move-exception v0

    move/from16 v4, p3

    move-object v8, v1

    move-object v10, v2

    move-object v1, v3

    move v3, v11

    move/from16 v2, v20

    move-object/from16 v11, v22

    move-object/from16 v9, v24

    move-object/from16 v22, v5

    move-object v5, v0

    move-object/from16 v0, v21

    move-object/from16 v21, v12

    move-wide/from16 v40, v14

    move v14, v13

    move-wide/from16 v12, v18

    move-object/from16 v15, v25

    :goto_1
    move-wide/from16 v17, v40

    goto/16 :goto_1d

    :cond_4
    move-object/from16 v17, v1

    const/16 v16, 0x0

    iget v0, v2, La/qdg;->u:I

    iget v1, v2, La/qdg;->t:I

    iget v4, v2, La/qdg;->s:I

    iget-wide v6, v2, La/qdg;->m:J

    iget-wide v8, v2, La/qdg;->l:J

    iget v10, v2, La/qdg;->r:I

    iget v11, v2, La/qdg;->q:I

    iget v13, v2, La/qdg;->p:I

    iget-wide v14, v2, La/qdg;->k:J

    move-wide/from16 v18, v6

    iget-wide v6, v2, La/qdg;->j:J

    move/from16 v20, v1

    iget-byte v1, v2, La/qdg;->o:B

    move/from16 v21, v1

    iget v1, v2, La/qdg;->n:I

    move-wide/from16 v22, v6

    iget-wide v6, v2, La/qdg;->i:J

    move/from16 v24, v0

    iget-object v0, v2, La/qdg;->B:Ljava/lang/Throwable;

    move-object/from16 v25, v0

    iget-object v0, v2, La/qdg;->A:La/qdg;

    move/from16 p0, v1

    iget-object v1, v2, La/qdg;->z:Ljava/lang/Throwable;

    move-object/from16 p1, v1

    iget-object v1, v2, La/qdg;->y:La/qdg;

    move-object/from16 p2, v1

    iget-object v1, v2, La/qdg;->x:La/udg;

    move-object/from16 p3, v0

    iget-object v0, v2, La/qdg;->w:Ljava/util/Map;

    move-object/from16 v26, v0

    check-cast v26, Ljava/util/Map;

    move-object/from16 p4, v1

    iget-object v1, v2, La/qdg;->v:Ljava/util/Date;

    :try_start_3
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-wide/from16 v32, v8

    move-wide/from16 v34, v14

    move-wide/from16 v30, v18

    move/from16 v17, v20

    move/from16 v9, v21

    move-wide/from16 v28, v22

    move/from16 v0, v24

    move-object v15, v1

    move-object v8, v2

    move/from16 v18, v4

    move-object/from16 v22, v5

    move v5, v11

    move-object/from16 v21, v12

    move/from16 v4, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    move-object/from16 v1, p4

    move v12, v10

    move-object/from16 v10, p3

    move-wide/from16 v40, v6

    move-object v6, v3

    move v3, v13

    move-object/from16 v7, v25

    move-wide/from16 v13, v40

    goto/16 :goto_12

    :catchall_2
    move-exception v0

    move-object v8, v1

    move-object v10, v2

    move-object v1, v3

    move v3, v11

    move-wide/from16 v17, v14

    move/from16 v4, v21

    move-object/from16 v9, v26

    move/from16 v2, p0

    move-object/from16 v11, p2

    move-object/from16 v15, p4

    move-object/from16 v21, v12

    move v14, v13

    move-wide/from16 v12, v22

    move-object/from16 v22, v5

    move-object v5, v0

    move-object/from16 v0, p1

    goto/16 :goto_1d

    :cond_5
    move-object/from16 v17, v1

    const/16 v16, 0x0

    iget v1, v2, La/qdg;->t:I

    iget v4, v2, La/qdg;->s:I

    iget-wide v6, v2, La/qdg;->m:J

    iget-wide v8, v2, La/qdg;->l:J

    iget v10, v2, La/qdg;->r:I

    iget v11, v2, La/qdg;->q:I

    iget v13, v2, La/qdg;->p:I

    iget-wide v14, v2, La/qdg;->k:J

    move-wide/from16 v18, v6

    iget-wide v6, v2, La/qdg;->j:J

    move/from16 v20, v1

    iget-byte v1, v2, La/qdg;->o:B

    move/from16 v21, v1

    iget v1, v2, La/qdg;->n:I

    move-wide/from16 v22, v6

    iget-wide v6, v2, La/qdg;->i:J

    move/from16 v24, v1

    iget-object v1, v2, La/qdg;->B:Ljava/lang/Throwable;

    move-object/from16 v25, v1

    iget-object v1, v2, La/qdg;->A:La/qdg;

    move-object/from16 v26, v1

    iget-object v1, v2, La/qdg;->z:Ljava/lang/Throwable;

    move-object/from16 p0, v1

    iget-object v1, v2, La/qdg;->y:La/qdg;

    move-object/from16 p1, v1

    iget-object v1, v2, La/qdg;->x:La/udg;

    iget-object v0, v2, La/qdg;->w:Ljava/util/Map;

    move-object/from16 v27, v0

    check-cast v27, Ljava/util/Map;

    move-object/from16 p2, v1

    iget-object v1, v2, La/qdg;->v:Ljava/util/Date;

    :try_start_4
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-wide/from16 v28, v8

    move-object/from16 v0, v17

    move-wide/from16 v30, v18

    move-wide/from16 v17, v22

    move-object v8, v2

    move-object v9, v3

    move-object/from16 v22, v5

    move v5, v11

    move v3, v13

    move-object/from16 v2, p0

    move-object/from16 v11, p1

    move-wide/from16 v40, v14

    move-object/from16 v15, p2

    move-wide v13, v6

    move/from16 v6, v21

    move-object/from16 v7, v27

    move-object/from16 v21, v12

    move v12, v10

    move-object/from16 v10, v26

    move-wide/from16 v26, v40

    goto/16 :goto_7

    :catchall_3
    move-exception v0

    move/from16 v17, v10

    move-wide/from16 v38, v18

    move/from16 v19, v21

    move-wide/from16 v36, v22

    move-object/from16 v10, v26

    move-object/from16 v23, v3

    move-object/from16 v22, v5

    move/from16 v18, v11

    move-object/from16 v21, v12

    move v3, v13

    move-object/from16 v11, p1

    move v12, v4

    move/from16 v4, v24

    move-object/from16 v40, v2

    move-object/from16 v2, p0

    move-wide/from16 p0, v8

    move/from16 v9, v20

    move-object/from16 v8, v40

    move-object/from16 v40, v1

    move-object/from16 v1, p2

    move-wide/from16 v41, v14

    move-object/from16 v15, v40

    move-wide v13, v6

    move-wide/from16 v5, v41

    :goto_2
    move-object/from16 v7, v25

    goto/16 :goto_f

    :cond_6
    move-object/from16 v17, v1

    const/16 v16, 0x0

    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iget-object v1, v0, La/udg;->c:La/knf0;

    invoke-virtual {v1}, La/knf0;->d()La/lnf0;

    move-result-object v6

    .line 6
    invoke-virtual/range {p6 .. p6}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    div-long/2addr v7, v9

    .line 7
    new-instance v10, Ljava/lang/Long;

    invoke-direct {v10, v7, v8}, Ljava/lang/Long;-><init>(J)V

    move/from16 v9, p1

    move/from16 v11, p2

    move-wide/from16 v7, p3

    .line 8
    invoke-static/range {v6 .. v11}, La/tdc;->E(La/lnf0;JILjava/lang/Long;I)La/jo20;

    move-result-object v1

    .line 9
    :try_start_5
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 10
    iget-object v4, v12, La/tcg;->e:Ljava/util/LinkedHashMap;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2e

    move-object/from16 v6, p6

    .line 11
    :try_start_6
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/vdg;

    if-nez v4, :cond_1f

    .line 12
    sget-wide v7, La/cag0;->a:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2c

    move/from16 v4, p2

    move-object v9, v1

    move-object v10, v2

    move-object v11, v10

    move-wide v13, v7

    move-object/from16 v17, v16

    const/4 v15, 0x0

    const-wide/16 v18, 0x3

    const/16 v20, 0x0

    move/from16 v2, p1

    move-object v1, v0

    move-object v8, v6

    const/4 v0, 0x1

    move-wide/from16 v6, p3

    :goto_3
    if-eqz v0, :cond_1d

    .line 13
    :try_start_7
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v21

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_27

    cmp-long v21, v21, v23

    if-lez v21, :cond_7

    .line 14
    :try_start_8
    sget-object v0, La/j0g0;->b:La/e0g0;

    new-instance v0, Ljava/lang/IllegalStateException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 p0, v1

    :try_start_9
    const-string v1, "Selected date is in the future"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    new-instance v1, La/g0g0;

    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    return-object v1

    :goto_4
    move-object v1, v3

    move-object/from16 v22, v5

    move-object/from16 v21, v12

    move v3, v15

    move-object/from16 v15, p0

    move-object v5, v0

    move-object/from16 v0, v17

    :goto_5
    move-wide/from16 v40, v13

    move/from16 v14, v20

    move-wide/from16 v12, v18

    goto/16 :goto_1

    :catchall_4
    move-exception v0

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object/from16 p0, v1

    goto :goto_4

    :cond_7
    move-object/from16 p0, v1

    .line 16
    :try_start_a
    sget-wide v21, La/cag0;->a:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_26

    move-object/from16 v1, p0

    move-object/from16 v23, v3

    move-wide/from16 v34, v13

    move-wide/from16 v28, v18

    move/from16 v3, v20

    move-wide/from16 v30, v21

    const/16 v18, 0x0

    const-wide/16 v32, 0x3

    move-object/from16 v22, v5

    move-wide v13, v6

    move-object/from16 v21, v12

    move v5, v15

    move-object/from16 v7, v16

    move v12, v0

    move v6, v4

    move-object v15, v8

    move-object v8, v10

    const/4 v0, 0x1

    move v4, v2

    move-object/from16 v2, v17

    const/16 v17, 0x0

    :goto_6
    if-eqz v0, :cond_12

    move-object/from16 p0, v9

    .line 17
    :try_start_b
    iget-object v9, v1, La/udg;->a:La/do20;

    iput-object v15, v8, La/qdg;->v:Ljava/util/Date;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_11

    move-object/from16 v19, v15

    :try_start_c
    move-object/from16 v15, p0

    check-cast v15, Ljava/util/Map;

    iput-object v15, v8, La/qdg;->w:Ljava/util/Map;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_10

    :try_start_d
    iput-object v1, v8, La/qdg;->x:La/udg;

    iput-object v11, v8, La/qdg;->y:La/qdg;

    iput-object v2, v8, La/qdg;->z:Ljava/lang/Throwable;

    iput-object v10, v8, La/qdg;->A:La/qdg;

    iput-object v7, v8, La/qdg;->B:Ljava/lang/Throwable;

    iput-wide v13, v8, La/qdg;->i:J

    iput v4, v8, La/qdg;->n:I

    iput-byte v6, v8, La/qdg;->o:B
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_f

    move-object v15, v1

    move-object/from16 v20, v2

    move-wide/from16 v1, v28

    :try_start_e
    iput-wide v1, v8, La/qdg;->j:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    move-wide/from16 v24, v1

    move-wide/from16 v1, v34

    :try_start_f
    iput-wide v1, v8, La/qdg;->k:J

    iput v3, v8, La/qdg;->p:I

    iput v5, v8, La/qdg;->q:I

    iput v12, v8, La/qdg;->r:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    move-wide/from16 v26, v1

    move-wide/from16 v1, v32

    :try_start_10
    iput-wide v1, v8, La/qdg;->l:J
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    move-wide/from16 v28, v1

    move-wide/from16 v1, v30

    :try_start_11
    iput-wide v1, v8, La/qdg;->m:J
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    move-wide/from16 v30, v1

    move/from16 v1, v18

    :try_start_12
    iput v1, v8, La/qdg;->s:I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    move/from16 v2, v17

    :try_start_13
    iput v2, v8, La/qdg;->t:I

    iput v0, v8, La/qdg;->u:I
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    move/from16 v17, v1

    const/4 v1, 0x1

    :try_start_14
    iput v1, v8, La/qdg;->f1:I
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    move-object/from16 v1, p0

    :try_start_15
    invoke-virtual {v9, v1, v8}, La/do20;->g(Ljava/util/Map;La/zje;)Ljava/lang/Object;

    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    move-object/from16 v9, v23

    if-ne v0, v9, :cond_8

    move-object v1, v9

    goto/16 :goto_22

    :cond_8
    move-wide/from16 v40, v24

    move/from16 v24, v4

    move/from16 v4, v17

    move-wide/from16 v17, v40

    move-object/from16 v40, v20

    move/from16 v20, v2

    move-object/from16 v2, v40

    move-object/from16 v25, v7

    move-object v7, v1

    move-object/from16 v1, v19

    .line 18
    :goto_7
    :try_start_16
    check-cast v0, La/ydg;

    .line 19
    invoke-static {v0, v1}, La/vcc;->j0(La/ydg;Ljava/util/Date;)La/vdg;

    move-result-object v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    goto/16 :goto_26

    :catchall_6
    move-exception v0

    move-object/from16 p0, v15

    move-object v15, v1

    move-object/from16 v1, p0

    move/from16 v19, v6

    move-object/from16 v23, v9

    move-wide/from16 v36, v17

    move/from16 v9, v20

    move-wide/from16 p0, v28

    move-wide/from16 v38, v30

    move/from16 v18, v5

    move/from16 v17, v12

    move-wide/from16 v5, v26

    move v12, v4

    move-object/from16 v27, v7

    move/from16 v4, v24

    goto/16 :goto_2

    :catchall_7
    move-exception v0

    :goto_8
    move-object/from16 v9, v23

    :goto_9
    move/from16 p0, v17

    move/from16 v17, v12

    move/from16 v12, p0

    move/from16 v18, v5

    :goto_a
    move-wide/from16 v36, v24

    move-wide/from16 p0, v28

    move-wide/from16 v38, v30

    move v9, v2

    move-object/from16 v2, v20

    move-wide/from16 v40, v26

    move-object/from16 v27, v1

    move-object v1, v15

    move-object/from16 v15, v19

    move/from16 v19, v6

    move-wide/from16 v5, v40

    goto/16 :goto_f

    :catchall_8
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_8

    :catchall_9
    move-exception v0

    move/from16 v17, v1

    :goto_b
    move-object/from16 v9, v23

    :goto_c
    move-object/from16 v1, p0

    goto :goto_9

    :catchall_a
    move-exception v0

    move/from16 v2, v17

    move-object/from16 v9, v23

    move/from16 v17, v1

    goto :goto_c

    :catchall_b
    move-exception v0

    move-wide/from16 v30, v1

    :goto_d
    move/from16 v2, v17

    move/from16 v17, v18

    goto :goto_b

    :catchall_c
    move-exception v0

    move-wide/from16 v28, v1

    goto :goto_d

    :catchall_d
    move-exception v0

    move-wide/from16 v26, v1

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v9, v23

    move-wide/from16 v28, v32

    goto :goto_c

    :catchall_e
    move-exception v0

    move-wide/from16 v24, v1

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v9, v23

    :goto_e
    move-wide/from16 v28, v32

    move-wide/from16 v26, v34

    goto :goto_c

    :catchall_f
    move-exception v0

    move-object v15, v1

    move-object/from16 v20, v2

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v9, v23

    move-wide/from16 v24, v28

    goto :goto_e

    :catchall_10
    move-exception v0

    move-object v15, v1

    move-object/from16 v20, v2

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v9, v23

    move-wide/from16 v24, v28

    move-wide/from16 v28, v32

    move-wide/from16 v26, v34

    move-object/from16 v1, p0

    move/from16 p0, v17

    move/from16 v17, v12

    move/from16 v12, p0

    move/from16 v18, v5

    move-object/from16 v23, v9

    goto :goto_a

    :catchall_11
    move-exception v0

    move-object/from16 v20, v2

    move-object/from16 v19, v15

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v9, v23

    move-wide/from16 v24, v28

    move-wide/from16 v28, v32

    move-wide/from16 v26, v34

    move-object v15, v1

    goto :goto_c

    .line 20
    :goto_f
    :try_start_17
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    move-result v20
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_23

    if-eqz v20, :cond_d

    if-nez v12, :cond_9

    .line 21
    :try_start_18
    new-instance v7, La/el50;

    invoke-direct {v7, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_12

    move-wide/from16 v32, p0

    move-wide/from16 v34, v5

    move/from16 v5, v18

    move/from16 v6, v19

    move-wide/from16 v28, v36

    move-wide/from16 v30, v38

    const/4 v0, 0x0

    move/from16 v18, v12

    move/from16 v12, v17

    move/from16 v17, v9

    :goto_10
    move-object/from16 v9, v27

    goto/16 :goto_6

    :catchall_12
    move-exception v0

    move-wide v9, v13

    move v14, v3

    move/from16 v3, v18

    move-wide/from16 v17, v5

    move-wide v6, v9

    move-object v5, v0

    move-object v0, v2

    move v2, v4

    move-object v10, v8

    move-object v8, v15

    move/from16 v4, v19

    move-object/from16 v9, v27

    move-wide/from16 v12, v36

    move-object v15, v1

    move-object/from16 v1, v23

    goto/16 :goto_1d

    :cond_9
    move-wide/from16 v24, v5

    int-to-long v5, v9

    cmp-long v5, v5, p0

    if-gez v5, :cond_a

    const/4 v5, 0x1

    goto :goto_11

    :cond_a
    const/4 v5, 0x0

    :goto_11
    add-int/lit8 v6, v9, 0x1

    if-eqz v5, :cond_c

    .line 22
    :try_start_19
    iput-object v15, v8, La/qdg;->v:Ljava/util/Date;

    move-object/from16 v0, v27

    check-cast v0, Ljava/util/Map;

    iput-object v0, v8, La/qdg;->w:Ljava/util/Map;

    iput-object v1, v8, La/qdg;->x:La/udg;

    iput-object v11, v8, La/qdg;->y:La/qdg;

    iput-object v2, v8, La/qdg;->z:Ljava/lang/Throwable;

    iput-object v10, v8, La/qdg;->A:La/qdg;

    iput-object v7, v8, La/qdg;->B:Ljava/lang/Throwable;

    iput-wide v13, v8, La/qdg;->i:J

    iput v4, v8, La/qdg;->n:I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_18

    move/from16 v9, v19

    :try_start_1a
    iput-byte v9, v8, La/qdg;->o:B
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_17

    move-wide/from16 v19, v13

    move-wide/from16 v13, v36

    :try_start_1b
    iput-wide v13, v8, La/qdg;->j:J
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_16

    move-wide/from16 v28, v13

    move-wide/from16 v13, v24

    :try_start_1c
    iput-wide v13, v8, La/qdg;->k:J

    iput v3, v8, La/qdg;->p:I
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_15

    move/from16 v24, v3

    move/from16 v3, v18

    :try_start_1d
    iput v3, v8, La/qdg;->q:I

    move/from16 v0, v17

    iput v0, v8, La/qdg;->r:I
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_14

    move-wide/from16 v17, v13

    move-wide/from16 v13, p0

    :try_start_1e
    iput-wide v13, v8, La/qdg;->l:J

    move-wide/from16 v25, v13

    move-wide/from16 v13, v38

    iput-wide v13, v8, La/qdg;->m:J

    iput v12, v8, La/qdg;->s:I

    iput v6, v8, La/qdg;->t:I

    iput v5, v8, La/qdg;->u:I

    move/from16 p0, v5

    const/4 v5, 0x2

    iput v5, v8, La/qdg;->f1:I

    invoke-static {v13, v14, v10}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    move-result-object v5
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_13

    move/from16 p1, v6

    move-object/from16 v6, v23

    if-ne v5, v6, :cond_b

    move-object v1, v6

    goto/16 :goto_22

    :cond_b
    move v5, v3

    move-wide/from16 v30, v13

    move-wide/from16 v34, v17

    move-wide/from16 v13, v19

    move/from16 v3, v24

    move-wide/from16 v32, v25

    move-object/from16 v26, v27

    move/from16 v17, p1

    move/from16 v18, v12

    move v12, v0

    move/from16 v0, p0

    :goto_12
    move-object/from16 v23, v6

    move v6, v9

    move-object/from16 v9, v26

    goto/16 :goto_6

    :catchall_13
    move-exception v0

    :goto_13
    move-object/from16 v6, v23

    :goto_14
    move-object v5, v0

    move-object v0, v2

    move v2, v4

    move-object v10, v8

    move v4, v9

    move-object v8, v15

    move/from16 v14, v24

    move-object/from16 v9, v27

    move-wide/from16 v12, v28

    move-object v15, v1

    move-object v1, v6

    move-wide/from16 v6, v19

    goto/16 :goto_1d

    :catchall_14
    move-exception v0

    move-wide/from16 v17, v13

    goto :goto_13

    :catchall_15
    move-exception v0

    move/from16 v24, v3

    move/from16 v3, v18

    move-object/from16 v6, v23

    move-wide/from16 v17, v13

    goto :goto_14

    :catchall_16
    move-exception v0

    move-wide/from16 v28, v24

    move/from16 v24, v3

    move/from16 v3, v18

    move-wide/from16 v17, v28

    move-wide/from16 v28, v13

    goto :goto_13

    :catchall_17
    move-exception v0

    move-wide/from16 v19, v24

    move/from16 v24, v3

    move/from16 v3, v18

    move-wide/from16 v17, v19

    move-wide/from16 v19, v13

    move-object/from16 v6, v23

    move-wide/from16 v28, v36

    goto :goto_14

    :catchall_18
    move-exception v0

    move-wide/from16 v28, v24

    move/from16 v24, v3

    move/from16 v3, v18

    move-wide/from16 v17, v28

    move/from16 v9, v19

    move-object/from16 v6, v23

    move-wide/from16 v28, v36

    move-wide/from16 v19, v13

    goto :goto_14

    :cond_c
    move/from16 v9, v19

    move-wide/from16 v28, v36

    move-wide/from16 v19, v13

    move-wide/from16 v13, v38

    move-wide/from16 v40, v24

    move/from16 v24, v3

    move-wide/from16 v25, p0

    move/from16 p0, v5

    move/from16 p1, v6

    move/from16 v5, v17

    move/from16 v3, v18

    move-object/from16 v6, v23

    move-wide/from16 v17, v40

    .line 23
    :try_start_1f
    new-instance v7, La/el50;

    invoke-direct {v7, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_19

    move/from16 v0, p0

    move-object/from16 v23, v6

    move v6, v9

    move-wide/from16 v30, v13

    move-wide/from16 v34, v17

    move-wide/from16 v13, v19

    move-wide/from16 v32, v25

    move-object/from16 v9, v27

    move/from16 v17, p1

    move/from16 v18, v12

    move v12, v5

    move v5, v3

    move/from16 v3, v24

    goto/16 :goto_6

    :catchall_19
    move-exception v0

    goto/16 :goto_14

    :cond_d
    move-wide/from16 v25, p0

    move/from16 v24, v3

    move/from16 v3, v18

    move-wide/from16 v28, v36

    move-wide/from16 v40, v5

    move/from16 v5, v17

    move-wide/from16 v17, v40

    move/from16 v6, v19

    move-wide/from16 v19, v13

    move-wide/from16 v13, v38

    .line 24
    :try_start_20
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    move-result v30

    if-eqz v30, :cond_11

    move/from16 p0, v12

    move-wide/from16 v30, v13

    int-to-long v12, v9

    cmp-long v12, v12, v25

    if-gez v12, :cond_e

    const/4 v12, 0x1

    goto :goto_15

    :cond_e
    const/4 v12, 0x0

    :goto_15
    add-int/lit8 v9, v9, 0x1

    if-eqz v12, :cond_10

    .line 25
    iput-object v15, v8, La/qdg;->v:Ljava/util/Date;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_20

    :try_start_21
    move-object/from16 v0, v27

    check-cast v0, Ljava/util/Map;

    iput-object v0, v8, La/qdg;->w:Ljava/util/Map;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_21

    :try_start_22
    iput-object v1, v8, La/qdg;->x:La/udg;

    iput-object v11, v8, La/qdg;->y:La/qdg;

    iput-object v2, v8, La/qdg;->z:Ljava/lang/Throwable;

    iput-object v10, v8, La/qdg;->A:La/qdg;

    iput-object v7, v8, La/qdg;->B:Ljava/lang/Throwable;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_20

    move-wide/from16 v13, v19

    :try_start_23
    iput-wide v13, v8, La/qdg;->i:J

    iput v4, v8, La/qdg;->n:I

    iput-byte v6, v8, La/qdg;->o:B
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1f

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-wide/from16 v1, v28

    :try_start_24
    iput-wide v1, v8, La/qdg;->j:J
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1e

    move-wide/from16 v28, v1

    move-wide/from16 v1, v17

    :try_start_25
    iput-wide v1, v8, La/qdg;->k:J
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_1d

    move-wide/from16 v17, v1

    move/from16 v1, v24

    :try_start_26
    iput v1, v8, La/qdg;->p:I

    iput v3, v8, La/qdg;->q:I

    iput v5, v8, La/qdg;->r:I
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1c

    move/from16 v24, v1

    move-wide/from16 v1, v25

    :try_start_27
    iput-wide v1, v8, La/qdg;->l:J

    move-wide/from16 v25, v1

    move-wide/from16 v1, v30

    iput-wide v1, v8, La/qdg;->m:J

    move/from16 v0, p0

    iput v0, v8, La/qdg;->s:I

    iput v9, v8, La/qdg;->t:I

    iput v12, v8, La/qdg;->u:I
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_1b

    move/from16 v30, v3

    const/4 v3, 0x3

    :try_start_28
    iput v3, v8, La/qdg;->f1:I

    invoke-static {v1, v2, v10}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    move-result-object v3
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_1a

    move-wide/from16 v31, v1

    move-object/from16 v1, v23

    if-ne v3, v1, :cond_f

    goto/16 :goto_22

    :cond_f
    move-wide/from16 v34, v17

    move-object/from16 v2, v20

    move/from16 v3, v24

    move/from16 v18, v0

    move/from16 v17, v9

    move v0, v12

    move-object/from16 v9, v27

    move v12, v5

    move/from16 v5, v30

    move-wide/from16 v30, v31

    move-wide/from16 v32, v25

    :goto_16
    move-object/from16 v23, v1

    move-object/from16 v1, v19

    goto/16 :goto_6

    :catchall_1a
    move-exception v0

    :goto_17
    move-object/from16 v1, v23

    :goto_18
    move-object v5, v0

    move v2, v4

    move v4, v6

    move-object v10, v8

    move-wide v6, v13

    move-object v8, v15

    move-object/from16 v15, v19

    move-object/from16 v0, v20

    move/from16 v14, v24

    move-object/from16 v9, v27

    move-wide/from16 v12, v28

    move/from16 v3, v30

    goto/16 :goto_1d

    :catchall_1b
    move-exception v0

    :goto_19
    move/from16 v30, v3

    :goto_1a
    move-object/from16 v1, v23

    move-object v5, v0

    move v2, v4

    move v4, v6

    move-object v10, v8

    move-wide v6, v13

    move-object v8, v15

    move-object/from16 v15, v19

    move-object/from16 v0, v20

    move/from16 v14, v24

    move-object/from16 v9, v27

    move-wide/from16 v12, v28

    goto/16 :goto_1d

    :catchall_1c
    move-exception v0

    move/from16 v24, v1

    goto :goto_19

    :catchall_1d
    move-exception v0

    move-wide/from16 v17, v1

    goto :goto_19

    :catchall_1e
    move-exception v0

    move-wide/from16 v28, v1

    goto :goto_19

    :catchall_1f
    move-exception v0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto :goto_19

    :catchall_20
    move-exception v0

    move/from16 v30, v3

    move-wide/from16 v13, v19

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto :goto_1a

    :catchall_21
    move-exception v0

    move/from16 v30, v3

    move-wide/from16 v13, v19

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto :goto_17

    :cond_10
    move-wide/from16 v13, v19

    move-wide/from16 v31, v30

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move/from16 v30, v3

    move-object/from16 v1, v23

    move/from16 v2, p0

    .line 26
    :try_start_29
    new-instance v7, La/dag0;

    invoke-direct {v7, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    move-object/from16 v23, v1

    move v0, v12

    move-wide/from16 v34, v17

    move-object/from16 v1, v19

    move/from16 v3, v24

    move/from16 v18, v2

    move v12, v5

    move/from16 v17, v9

    move-object/from16 v2, v20

    move-object/from16 v9, v27

    move/from16 v5, v30

    move-wide/from16 v30, v31

    move-wide/from16 v32, v25

    goto/16 :goto_6

    :catchall_22
    move-exception v0

    goto :goto_18

    :cond_11
    move/from16 v30, v3

    move-wide/from16 v31, v13

    move-wide/from16 v13, v19

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move v2, v12

    move-object/from16 v1, v23

    .line 27
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_22

    move-object v7, v0

    move-object/from16 v23, v1

    move v12, v5

    move-wide/from16 v34, v17

    move-object/from16 v1, v19

    move/from16 v3, v24

    move/from16 v5, v30

    move-wide/from16 v30, v31

    const/4 v0, 0x0

    move/from16 v18, v2

    move/from16 v17, v9

    move-object/from16 v2, v20

    move-wide/from16 v32, v25

    goto/16 :goto_10

    :catchall_23
    move-exception v0

    move-object/from16 v20, v2

    move/from16 v24, v3

    move/from16 v30, v18

    move-wide/from16 v28, v36

    move-wide/from16 v17, v5

    move/from16 v6, v19

    move-object/from16 v19, v1

    goto/16 :goto_17

    :cond_12
    move-object/from16 v20, v2

    move-object/from16 v19, v15

    move-wide/from16 v24, v28

    move-wide/from16 v26, v34

    move-object v15, v1

    move-object/from16 v1, v23

    if-nez v7, :cond_13

    .line 28
    :try_start_2a
    new-instance v0, Ljava/lang/IllegalStateException;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_25

    move-object/from16 v12, v22

    :try_start_2b
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_24
    move-exception v0

    move v2, v4

    move v4, v6

    move-object v10, v8

    move-object/from16 v22, v12

    :goto_1b
    move-wide v6, v13

    move-object/from16 v8, v19

    move-wide/from16 v12, v24

    move-wide/from16 v17, v26

    move v14, v3

    move v3, v5

    move-object v5, v0

    move-object/from16 v0, v20

    goto :goto_1d

    :catchall_25
    move-exception v0

    move-object/from16 v12, v22

    move v2, v4

    move v4, v6

    move-object v10, v8

    goto :goto_1b

    :cond_13
    move-object/from16 v12, v22

    throw v7
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_24

    :catchall_26
    move-exception v0

    :goto_1c
    move-object v1, v3

    move-object/from16 v21, v12

    move-object v12, v5

    move-object v5, v0

    move-object/from16 v22, v12

    move v3, v15

    move-object/from16 v0, v17

    move-object/from16 v15, p0

    goto/16 :goto_5

    :catchall_27
    move-exception v0

    move-object/from16 p0, v1

    goto :goto_1c

    .line 29
    :goto_1d
    :try_start_2c
    invoke-static {v5}, La/agc;->M(Ljava/lang/Throwable;)Z

    move-result v19
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_2a

    if-eqz v19, :cond_18

    if-nez v14, :cond_14

    .line 30
    :try_start_2d
    new-instance v0, La/el50;

    invoke-direct {v0, v5}, La/el50;-><init>(Ljava/lang/Throwable;)V

    move v5, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v5

    move/from16 v20, v14

    move-object/from16 v5, v22

    move-wide/from16 v40, v17

    move-object/from16 v17, v0

    move-wide/from16 v18, v12

    move-wide/from16 v13, v40

    move-object/from16 v12, v21

    const/4 v0, 0x0

    goto/16 :goto_3

    :catchall_28
    move-exception v0

    goto/16 :goto_27

    :cond_14
    move-wide/from16 p0, v12

    int-to-long v12, v3

    cmp-long v12, v12, p0

    if-gez v12, :cond_15

    const/4 v12, 0x1

    goto :goto_1e

    :cond_15
    const/4 v12, 0x0

    :goto_1e
    add-int/lit8 v3, v3, 0x1

    if-eqz v12, :cond_17

    .line 31
    iput-object v8, v10, La/qdg;->v:Ljava/util/Date;

    move-object v5, v9

    check-cast v5, Ljava/util/Map;

    iput-object v5, v10, La/qdg;->w:Ljava/util/Map;

    iput-object v15, v10, La/qdg;->x:La/udg;

    iput-object v11, v10, La/qdg;->y:La/qdg;

    iput-object v0, v10, La/qdg;->z:Ljava/lang/Throwable;

    move-object/from16 v5, v16

    iput-object v5, v10, La/qdg;->A:La/qdg;

    iput-object v5, v10, La/qdg;->B:Ljava/lang/Throwable;

    iput-wide v6, v10, La/qdg;->i:J

    iput v2, v10, La/qdg;->n:I

    iput-byte v4, v10, La/qdg;->o:B

    move-wide/from16 v19, v6

    move-wide/from16 v6, p0

    iput-wide v6, v10, La/qdg;->j:J

    move-wide/from16 p0, v6

    move-wide/from16 v6, v17

    iput-wide v6, v10, La/qdg;->k:J

    iput v14, v10, La/qdg;->p:I

    iput v3, v10, La/qdg;->q:I

    iput v12, v10, La/qdg;->r:I

    const/4 v13, 0x4

    iput v13, v10, La/qdg;->f1:I

    invoke-static {v6, v7, v11}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_16

    goto/16 :goto_22

    :cond_16
    move-object v5, v0

    move-wide/from16 v17, v6

    move v0, v12

    move-wide/from16 v6, v19

    move-wide/from16 v19, p0

    :goto_1f
    move v12, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v12

    move-wide/from16 v40, v19

    move/from16 v20, v14

    move-wide/from16 v13, v17

    move-wide/from16 v18, v40

    move-object/from16 v17, v5

    :goto_20
    move-object/from16 v12, v21

    move-object/from16 v5, v22

    const/16 v16, 0x0

    goto/16 :goto_3

    :cond_17
    move-wide/from16 v19, v6

    move-wide/from16 v6, v17

    const/4 v13, 0x4

    .line 32
    new-instance v0, La/el50;

    invoke-direct {v0, v5}, La/el50;-><init>(Ljava/lang/Throwable;)V
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_28

    move-wide/from16 v17, v19

    move/from16 v20, v14

    move-wide v13, v6

    move-wide/from16 v6, v17

    move v5, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v5

    move-wide/from16 v18, p0

    move-object/from16 v17, v0

    move v0, v12

    goto :goto_20

    :cond_18
    move-wide/from16 v19, v6

    move-wide/from16 p0, v12

    move-wide/from16 v6, v17

    const/4 v13, 0x4

    .line 33
    :try_start_2e
    invoke-static {v5}, La/agc;->N(Ljava/lang/Throwable;)Z

    move-result v12

    if-eqz v12, :cond_1c

    move/from16 p2, v14

    int-to-long v13, v3

    cmp-long v12, v13, p0

    if-gez v12, :cond_19

    const/4 v12, 0x1

    goto :goto_21

    :cond_19
    const/4 v12, 0x0

    :goto_21
    add-int/lit8 v3, v3, 0x1

    if-eqz v12, :cond_1b

    .line 34
    iput-object v8, v10, La/qdg;->v:Ljava/util/Date;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_2a

    :try_start_2f
    move-object v5, v9

    check-cast v5, Ljava/util/Map;

    iput-object v5, v10, La/qdg;->w:Ljava/util/Map;
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_2b

    :try_start_30
    iput-object v15, v10, La/qdg;->x:La/udg;

    iput-object v11, v10, La/qdg;->y:La/qdg;

    iput-object v0, v10, La/qdg;->z:Ljava/lang/Throwable;

    const/4 v13, 0x0

    iput-object v13, v10, La/qdg;->A:La/qdg;

    iput-object v13, v10, La/qdg;->B:Ljava/lang/Throwable;

    move-wide/from16 v13, v19

    iput-wide v13, v10, La/qdg;->i:J

    iput v2, v10, La/qdg;->n:I

    iput-byte v4, v10, La/qdg;->o:B
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_2a

    move-object/from16 v17, v8

    move-object/from16 p3, v9

    move-wide/from16 v8, p0

    :try_start_31
    iput-wide v8, v10, La/qdg;->j:J

    iput-wide v6, v10, La/qdg;->k:J

    move/from16 v5, p2

    iput v5, v10, La/qdg;->p:I

    iput v3, v10, La/qdg;->q:I

    iput v12, v10, La/qdg;->r:I

    move/from16 v18, v2

    const/4 v2, 0x5

    iput v2, v10, La/qdg;->f1:I

    invoke-static {v6, v7, v11}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1a

    :goto_22
    return-object v1

    :cond_1a
    move-wide/from16 v19, v13

    move-wide v13, v6

    move-wide/from16 v6, v19

    move/from16 v20, v5

    move/from16 v2, v18

    move-wide/from16 v18, v8

    move-object/from16 v8, v17

    move-object/from16 v9, p3

    move-object/from16 v17, v0

    move v0, v12

    :goto_23
    move v5, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v5

    goto/16 :goto_20

    :catchall_29
    move-exception v0

    :goto_24
    move-object/from16 v8, v17

    goto/16 :goto_27

    :catchall_2a
    move-exception v0

    move-object/from16 v17, v8

    goto/16 :goto_27

    :catchall_2b
    move-exception v0

    move-object/from16 v17, v8

    goto :goto_24

    :cond_1b
    move/from16 v24, p2

    move/from16 v18, v2

    move-object/from16 v17, v8

    move-object/from16 p3, v9

    move-wide/from16 v13, v19

    move-wide/from16 v8, p0

    .line 35
    new-instance v0, La/dag0;

    invoke-direct {v0, v5}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    move v2, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v2

    move-wide/from16 v19, v13

    move-wide v13, v6

    move-wide/from16 v6, v19

    move/from16 v2, v18

    move-object/from16 v5, v22

    move/from16 v20, v24

    const/16 v16, 0x0

    move-wide/from16 v18, v8

    move-object/from16 v8, v17

    move-object/from16 v9, p3

    move-object/from16 v17, v0

    move v0, v12

    move-object/from16 v12, v21

    goto/16 :goto_3

    :cond_1c
    move/from16 v18, v2

    move-object/from16 v17, v8

    move-object/from16 p3, v9

    move/from16 v24, v14

    move-wide/from16 v13, v19

    move-wide/from16 v8, p0

    .line 36
    invoke-static {v5}, La/agc;->L(Ljava/lang/Throwable;)Z
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_29

    move v0, v3

    move-object v3, v1

    move-object v1, v15

    move v15, v0

    move-wide/from16 v19, v13

    move-wide v13, v6

    move-wide/from16 v6, v19

    move/from16 v2, v18

    move-object/from16 v12, v21

    move/from16 v20, v24

    const/4 v0, 0x0

    const/16 v16, 0x0

    move-wide/from16 v18, v8

    move-object/from16 v8, v17

    move-object/from16 v9, p3

    move-object/from16 v17, v5

    move-object/from16 v5, v22

    goto/16 :goto_3

    :cond_1d
    move-object/from16 v22, v5

    move-object/from16 v21, v12

    if-nez v17, :cond_1e

    .line 37
    :try_start_32
    new-instance v0, Ljava/lang/IllegalStateException;

    move-object/from16 v12, v22

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    throw v17
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_28

    :catchall_2c
    move-exception v0

    :goto_25
    move-object/from16 v21, v12

    move-object v8, v6

    goto :goto_27

    :cond_1f
    move-object/from16 v21, v12

    move-object v1, v6

    .line 38
    :goto_26
    :try_start_33
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_2d

    goto :goto_28

    :catchall_2d
    move-exception v0

    move-object v8, v1

    goto :goto_27

    :catchall_2e
    move-exception v0

    move-object/from16 v6, p6

    goto :goto_25

    :goto_27
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 39
    new-instance v4, La/g0g0;

    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v8

    .line 40
    :goto_28
    instance-of v0, v4, La/g0g0;

    if-nez v0, :cond_20

    .line 41
    move-object v0, v4

    check-cast v0, La/vdg;

    .line 42
    iget-object v2, v0, La/vdg;->b:Ljava/util/ArrayList;

    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_20

    .line 44
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v2, v21

    .line 46
    iget-object v2, v2, La/tcg;->e:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_20
    return-object v4
.end method

.method public final c(IIJLa/zje;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, La/rdg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/rdg;

    .line 11
    .line 12
    iget v3, v2, La/rdg;->w:I

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
    iput v3, v2, La/rdg;->w:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/rdg;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/rdg;-><init>(La/udg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/rdg;->u:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/rdg;->w:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v8, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/rdg;->p:I

    .line 47
    .line 48
    iget v10, v2, La/rdg;->o:I

    .line 49
    .line 50
    iget v11, v2, La/rdg;->n:I

    .line 51
    .line 52
    iget-wide v12, v2, La/rdg;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/rdg;->j:J

    .line 55
    .line 56
    iget-byte v7, v2, La/rdg;->m:B

    .line 57
    .line 58
    iget v5, v2, La/rdg;->l:I

    .line 59
    .line 60
    move/from16 p1, v7

    .line 61
    .line 62
    iget-wide v6, v2, La/rdg;->i:J

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    iget-object v9, v2, La/rdg;->t:Ljava/lang/Throwable;

    .line 67
    .line 68
    iget-object v8, v2, La/rdg;->s:La/rdg;

    .line 69
    .line 70
    move-object/from16 v18, v0

    .line 71
    .line 72
    iget-object v0, v2, La/rdg;->r:La/udg;

    .line 73
    .line 74
    move-object/from16 p2, v0

    .line 75
    .line 76
    iget-object v0, v2, La/rdg;->q:Ljava/util/Map;

    .line 77
    .line 78
    check-cast v0, Ljava/util/Map;

    .line 79
    .line 80
    :try_start_0
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    move-object v1, v3

    .line 84
    move-wide/from16 v18, v14

    .line 85
    .line 86
    move-object v3, v0

    .line 87
    move v0, v4

    .line 88
    move-object v14, v9

    .line 89
    move-object/from16 v9, p2

    .line 90
    .line 91
    move-object v4, v2

    .line 92
    :goto_1
    move/from16 v2, p1

    .line 93
    .line 94
    goto/16 :goto_c

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto/16 :goto_e

    .line 98
    .line 99
    :cond_1
    const/16 v17, 0x0

    .line 100
    .line 101
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 102
    .line 103
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v17

    .line 107
    :cond_2
    move-object/from16 v18, v0

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    iget v0, v2, La/rdg;->p:I

    .line 112
    .line 113
    iget v4, v2, La/rdg;->o:I

    .line 114
    .line 115
    iget v5, v2, La/rdg;->n:I

    .line 116
    .line 117
    iget-wide v6, v2, La/rdg;->k:J

    .line 118
    .line 119
    iget-wide v8, v2, La/rdg;->j:J

    .line 120
    .line 121
    iget-byte v10, v2, La/rdg;->m:B

    .line 122
    .line 123
    iget v11, v2, La/rdg;->l:I

    .line 124
    .line 125
    iget-wide v12, v2, La/rdg;->i:J

    .line 126
    .line 127
    iget-object v14, v2, La/rdg;->t:Ljava/lang/Throwable;

    .line 128
    .line 129
    iget-object v15, v2, La/rdg;->s:La/rdg;

    .line 130
    .line 131
    move/from16 p1, v0

    .line 132
    .line 133
    iget-object v0, v2, La/rdg;->r:La/udg;

    .line 134
    .line 135
    move-object/from16 p2, v0

    .line 136
    .line 137
    iget-object v0, v2, La/rdg;->q:Ljava/util/Map;

    .line 138
    .line 139
    check-cast v0, Ljava/util/Map;

    .line 140
    .line 141
    :try_start_1
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    .line 143
    .line 144
    move v1, v4

    .line 145
    move-object v4, v2

    .line 146
    move v2, v10

    .line 147
    move v10, v1

    .line 148
    move-wide/from16 v18, v8

    .line 149
    .line 150
    move-object v1, v14

    .line 151
    move-object v8, v15

    .line 152
    move-object/from16 v9, p2

    .line 153
    .line 154
    move-object/from16 v20, v0

    .line 155
    .line 156
    move/from16 v0, p1

    .line 157
    .line 158
    move-object/from16 v21, v3

    .line 159
    .line 160
    move-object/from16 v3, v20

    .line 161
    .line 162
    move/from16 v20, v11

    .line 163
    .line 164
    move-object/from16 v11, v21

    .line 165
    .line 166
    move-wide/from16 v21, v12

    .line 167
    .line 168
    move v12, v5

    .line 169
    move-wide v13, v6

    .line 170
    move/from16 v5, v20

    .line 171
    .line 172
    move-wide/from16 v6, v21

    .line 173
    .line 174
    goto/16 :goto_8

    .line 175
    .line 176
    :cond_3
    move-object/from16 v18, v0

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    iget v4, v2, La/rdg;->o:I

    .line 181
    .line 182
    iget v5, v2, La/rdg;->n:I

    .line 183
    .line 184
    iget-wide v6, v2, La/rdg;->k:J

    .line 185
    .line 186
    iget-wide v8, v2, La/rdg;->j:J

    .line 187
    .line 188
    iget-byte v10, v2, La/rdg;->m:B

    .line 189
    .line 190
    iget v11, v2, La/rdg;->l:I

    .line 191
    .line 192
    iget-wide v12, v2, La/rdg;->i:J

    .line 193
    .line 194
    iget-object v14, v2, La/rdg;->t:Ljava/lang/Throwable;

    .line 195
    .line 196
    iget-object v15, v2, La/rdg;->s:La/rdg;

    .line 197
    .line 198
    move/from16 p1, v4

    .line 199
    .line 200
    iget-object v4, v2, La/rdg;->r:La/udg;

    .line 201
    .line 202
    iget-object v0, v2, La/rdg;->q:Ljava/util/Map;

    .line 203
    .line 204
    move-object/from16 v19, v0

    .line 205
    .line 206
    check-cast v19, Ljava/util/Map;

    .line 207
    .line 208
    :try_start_2
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    .line 210
    .line 211
    move-object v1, v3

    .line 212
    move v3, v10

    .line 213
    move-object/from16 v0, v18

    .line 214
    .line 215
    move/from16 v10, p1

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :catchall_1
    move-exception v0

    .line 220
    move v1, v11

    .line 221
    move v11, v5

    .line 222
    move v5, v1

    .line 223
    move-wide/from16 v20, v12

    .line 224
    .line 225
    move-wide v12, v6

    .line 226
    move-wide/from16 v6, v20

    .line 227
    .line 228
    move-object v1, v3

    .line 229
    move/from16 v20, v10

    .line 230
    .line 231
    move/from16 v10, p1

    .line 232
    .line 233
    move-object/from16 v21, v4

    .line 234
    .line 235
    move-object v4, v2

    .line 236
    move-wide v2, v8

    .line 237
    move-object v8, v15

    .line 238
    move-object/from16 v9, v21

    .line 239
    .line 240
    move/from16 v15, v20

    .line 241
    .line 242
    goto/16 :goto_6

    .line 243
    .line 244
    :cond_4
    move-object/from16 v18, v0

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    invoke-static/range {v18 .. v18}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, v1, La/udg;->c:La/knf0;

    .line 252
    .line 253
    invoke-virtual {v0}, La/knf0;->d()La/lnf0;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    new-instance v4, La/jo20;

    .line 258
    .line 259
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 260
    .line 261
    .line 262
    const-wide/16 v5, 0x0

    .line 263
    .line 264
    cmp-long v5, p3, v5

    .line 265
    .line 266
    if-lez v5, :cond_5

    .line 267
    .line 268
    const-string v5, "champId"

    .line 269
    .line 270
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-virtual {v4, v5, v6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    :cond_5
    move/from16 v5, p1

    .line 278
    .line 279
    invoke-static {v5, v4}, La/qbt;->c(ILjava/util/Map;)V

    .line 280
    .line 281
    .line 282
    const-string v6, "gr"

    .line 283
    .line 284
    const/16 v7, 0x54d

    .line 285
    .line 286
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-virtual {v4, v6, v7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    const-string v6, "limit"

    .line 294
    .line 295
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v4, v6, v7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    iget-object v0, v0, La/lnf0;->a:Ljava/lang/String;

    .line 303
    .line 304
    const-string v6, "lng"

    .line 305
    .line 306
    invoke-virtual {v4, v6, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    invoke-static {v4}, La/qbt;->l(Ljava/util/Map;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    :try_start_3
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 317
    .line 318
    sget-wide v6, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 319
    .line 320
    const-wide/16 v8, 0x3

    .line 321
    .line 322
    move-object v4, v2

    .line 323
    move-object/from16 v18, v3

    .line 324
    .line 325
    move-wide v12, v6

    .line 326
    move-wide v14, v8

    .line 327
    const/4 v10, 0x0

    .line 328
    const/4 v11, 0x0

    .line 329
    move/from16 v2, p2

    .line 330
    .line 331
    move-wide/from16 v6, p3

    .line 332
    .line 333
    move-object v3, v0

    .line 334
    move-object v9, v1

    .line 335
    move-object v8, v4

    .line 336
    move-object/from16 v1, v17

    .line 337
    .line 338
    const/4 v0, 0x1

    .line 339
    :goto_2
    if-eqz v0, :cond_10

    .line 340
    .line 341
    move-object/from16 p1, v3

    .line 342
    .line 343
    :try_start_4
    iget-object v3, v9, La/udg;->a:La/do20;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 344
    .line 345
    move-object/from16 v19, v3

    .line 346
    .line 347
    :try_start_5
    move-object/from16 v3, p1

    .line 348
    .line 349
    check-cast v3, Ljava/util/Map;

    .line 350
    .line 351
    iput-object v3, v4, La/rdg;->q:Ljava/util/Map;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 352
    .line 353
    :try_start_6
    iput-object v9, v4, La/rdg;->r:La/udg;

    .line 354
    .line 355
    iput-object v8, v4, La/rdg;->s:La/rdg;

    .line 356
    .line 357
    iput-object v1, v4, La/rdg;->t:Ljava/lang/Throwable;

    .line 358
    .line 359
    iput-wide v6, v4, La/rdg;->i:J

    .line 360
    .line 361
    iput v5, v4, La/rdg;->l:I

    .line 362
    .line 363
    iput-byte v2, v4, La/rdg;->m:B

    .line 364
    .line 365
    iput-wide v14, v4, La/rdg;->j:J

    .line 366
    .line 367
    iput-wide v12, v4, La/rdg;->k:J

    .line 368
    .line 369
    iput v11, v4, La/rdg;->n:I

    .line 370
    .line 371
    iput v10, v4, La/rdg;->o:I

    .line 372
    .line 373
    iput v0, v4, La/rdg;->p:I

    .line 374
    .line 375
    const/4 v3, 0x1

    .line 376
    iput v3, v4, La/rdg;->w:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 377
    .line 378
    move-object/from16 v3, p1

    .line 379
    .line 380
    move-object/from16 v0, v19

    .line 381
    .line 382
    :try_start_7
    invoke-virtual {v0, v3, v4}, La/do20;->g(Ljava/util/Map;La/zje;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 386
    move-object/from16 v19, v1

    .line 387
    .line 388
    move-object/from16 v1, v18

    .line 389
    .line 390
    if-ne v0, v1, :cond_6

    .line 391
    .line 392
    goto/16 :goto_b

    .line 393
    .line 394
    :cond_6
    move/from16 v20, v11

    .line 395
    .line 396
    move v11, v5

    .line 397
    move/from16 v5, v20

    .line 398
    .line 399
    move-wide/from16 v20, v12

    .line 400
    .line 401
    move-wide v12, v6

    .line 402
    move-wide/from16 v6, v20

    .line 403
    .line 404
    move-object/from16 v20, v3

    .line 405
    .line 406
    move v3, v2

    .line 407
    move-object v2, v4

    .line 408
    move-object v4, v9

    .line 409
    move-object/from16 v21, v19

    .line 410
    .line 411
    move-object/from16 v19, v20

    .line 412
    .line 413
    move-wide/from16 v22, v14

    .line 414
    .line 415
    move-object v15, v8

    .line 416
    move-wide/from16 v8, v22

    .line 417
    .line 418
    move-object/from16 v14, v21

    .line 419
    .line 420
    :goto_3
    :try_start_8
    check-cast v0, La/ydg;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 421
    .line 422
    move-object/from16 p1, v2

    .line 423
    .line 424
    move-object/from16 v2, v17

    .line 425
    .line 426
    :try_start_9
    invoke-static {v0, v2}, La/vcc;->j0(La/ydg;Ljava/util/Date;)La/vdg;

    .line 427
    .line 428
    .line 429
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 430
    :try_start_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 431
    .line 432
    goto/16 :goto_f

    .line 433
    .line 434
    :catchall_2
    move-exception v0

    .line 435
    :goto_4
    move-object/from16 v20, v15

    .line 436
    .line 437
    move v15, v3

    .line 438
    move-wide v2, v8

    .line 439
    move-object/from16 v8, v20

    .line 440
    .line 441
    move/from16 v20, v11

    .line 442
    .line 443
    move v11, v5

    .line 444
    move/from16 v5, v20

    .line 445
    .line 446
    move-wide/from16 v20, v12

    .line 447
    .line 448
    move-wide v12, v6

    .line 449
    move-wide/from16 v6, v20

    .line 450
    .line 451
    move-object v9, v4

    .line 452
    move-object/from16 v4, p1

    .line 453
    .line 454
    goto :goto_6

    .line 455
    :catchall_3
    move-exception v0

    .line 456
    move-object/from16 p1, v2

    .line 457
    .line 458
    move-object/from16 v2, v17

    .line 459
    .line 460
    goto :goto_4

    .line 461
    :catchall_4
    move-exception v0

    .line 462
    move-object/from16 v19, v17

    .line 463
    .line 464
    move/from16 v17, v2

    .line 465
    .line 466
    move-object/from16 v2, v19

    .line 467
    .line 468
    :goto_5
    move-object/from16 v19, v1

    .line 469
    .line 470
    move-object/from16 v1, v18

    .line 471
    .line 472
    move-object/from16 v20, v19

    .line 473
    .line 474
    move-object/from16 v19, v3

    .line 475
    .line 476
    move-wide v2, v14

    .line 477
    move-object/from16 v14, v20

    .line 478
    .line 479
    move/from16 v15, v17

    .line 480
    .line 481
    goto :goto_6

    .line 482
    :catchall_5
    move-exception v0

    .line 483
    move-object/from16 v3, v17

    .line 484
    .line 485
    move/from16 v17, v2

    .line 486
    .line 487
    move-object v2, v3

    .line 488
    move-object/from16 v3, p1

    .line 489
    .line 490
    goto :goto_5

    .line 491
    :catchall_6
    move-exception v0

    .line 492
    move-object/from16 v3, v17

    .line 493
    .line 494
    move/from16 v17, v2

    .line 495
    .line 496
    move-object v2, v3

    .line 497
    move-object/from16 v3, p1

    .line 498
    .line 499
    goto :goto_5

    .line 500
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 501
    .line 502
    .line 503
    move-result v18

    .line 504
    if-eqz v18, :cond_b

    .line 505
    .line 506
    if-nez v11, :cond_7

    .line 507
    .line 508
    new-instance v14, La/el50;

    .line 509
    .line 510
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v18, v1

    .line 514
    .line 515
    move-object v1, v14

    .line 516
    const/4 v0, 0x0

    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    move-wide/from16 v20, v2

    .line 520
    .line 521
    move v2, v15

    .line 522
    move-wide/from16 v14, v20

    .line 523
    .line 524
    move-object/from16 v3, v19

    .line 525
    .line 526
    goto/16 :goto_2

    .line 527
    .line 528
    :cond_7
    move-object/from16 p1, v0

    .line 529
    .line 530
    move-object/from16 v18, v1

    .line 531
    .line 532
    int-to-long v0, v10

    .line 533
    cmp-long v0, v0, v2

    .line 534
    .line 535
    if-gez v0, :cond_8

    .line 536
    .line 537
    const/4 v0, 0x1

    .line 538
    goto :goto_7

    .line 539
    :cond_8
    const/4 v0, 0x0

    .line 540
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 541
    .line 542
    if-eqz v0, :cond_a

    .line 543
    .line 544
    move-object/from16 v1, v19

    .line 545
    .line 546
    check-cast v1, Ljava/util/Map;

    .line 547
    .line 548
    iput-object v1, v4, La/rdg;->q:Ljava/util/Map;

    .line 549
    .line 550
    iput-object v9, v4, La/rdg;->r:La/udg;

    .line 551
    .line 552
    iput-object v8, v4, La/rdg;->s:La/rdg;

    .line 553
    .line 554
    iput-object v14, v4, La/rdg;->t:Ljava/lang/Throwable;

    .line 555
    .line 556
    iput-wide v6, v4, La/rdg;->i:J

    .line 557
    .line 558
    iput v5, v4, La/rdg;->l:I

    .line 559
    .line 560
    move v1, v15

    .line 561
    iput-byte v1, v4, La/rdg;->m:B

    .line 562
    .line 563
    iput-wide v2, v4, La/rdg;->j:J

    .line 564
    .line 565
    iput-wide v12, v4, La/rdg;->k:J

    .line 566
    .line 567
    iput v11, v4, La/rdg;->n:I

    .line 568
    .line 569
    iput v10, v4, La/rdg;->o:I

    .line 570
    .line 571
    iput v0, v4, La/rdg;->p:I

    .line 572
    .line 573
    const/4 v15, 0x2

    .line 574
    iput v15, v4, La/rdg;->w:I

    .line 575
    .line 576
    invoke-static {v12, v13, v8}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v15

    .line 580
    move/from16 p2, v11

    .line 581
    .line 582
    move-object/from16 v11, v18

    .line 583
    .line 584
    if-ne v15, v11, :cond_9

    .line 585
    .line 586
    move-object v1, v11

    .line 587
    goto/16 :goto_b

    .line 588
    .line 589
    :cond_9
    move-wide/from16 v20, v2

    .line 590
    .line 591
    move-object/from16 v3, v19

    .line 592
    .line 593
    move-wide/from16 v18, v20

    .line 594
    .line 595
    move v2, v1

    .line 596
    move-object v1, v14

    .line 597
    move-wide v13, v12

    .line 598
    move/from16 v12, p2

    .line 599
    .line 600
    :goto_8
    move-wide/from16 v20, v18

    .line 601
    .line 602
    move-object/from16 v18, v11

    .line 603
    .line 604
    move v11, v12

    .line 605
    move-wide v12, v13

    .line 606
    :goto_9
    move-wide/from16 v14, v20

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    goto/16 :goto_2

    .line 611
    .line 612
    :cond_a
    move/from16 p2, v11

    .line 613
    .line 614
    move v1, v15

    .line 615
    move-object/from16 v11, v18

    .line 616
    .line 617
    new-instance v14, La/el50;

    .line 618
    .line 619
    move-object/from16 v15, p1

    .line 620
    .line 621
    invoke-direct {v14, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 622
    .line 623
    .line 624
    move-wide/from16 v20, v2

    .line 625
    .line 626
    move v2, v1

    .line 627
    move-object v1, v14

    .line 628
    move-wide/from16 v14, v20

    .line 629
    .line 630
    move-object/from16 v18, v11

    .line 631
    .line 632
    move-object/from16 v3, v19

    .line 633
    .line 634
    const/16 v17, 0x0

    .line 635
    .line 636
    move/from16 v11, p2

    .line 637
    .line 638
    goto/16 :goto_2

    .line 639
    .line 640
    :cond_b
    move/from16 p2, v11

    .line 641
    .line 642
    move-object v11, v1

    .line 643
    move v1, v15

    .line 644
    move-object v15, v0

    .line 645
    invoke-static {v15}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    if-eqz v0, :cond_f

    .line 650
    .line 651
    move-object/from16 v18, v11

    .line 652
    .line 653
    move-wide/from16 p3, v12

    .line 654
    .line 655
    int-to-long v11, v10

    .line 656
    cmp-long v0, v11, v2

    .line 657
    .line 658
    if-gez v0, :cond_c

    .line 659
    .line 660
    const/4 v0, 0x1

    .line 661
    goto :goto_a

    .line 662
    :cond_c
    const/4 v0, 0x0

    .line 663
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 664
    .line 665
    if-eqz v0, :cond_e

    .line 666
    .line 667
    move-object/from16 v11, v19

    .line 668
    .line 669
    check-cast v11, Ljava/util/Map;

    .line 670
    .line 671
    iput-object v11, v4, La/rdg;->q:Ljava/util/Map;

    .line 672
    .line 673
    iput-object v9, v4, La/rdg;->r:La/udg;

    .line 674
    .line 675
    iput-object v8, v4, La/rdg;->s:La/rdg;

    .line 676
    .line 677
    iput-object v14, v4, La/rdg;->t:Ljava/lang/Throwable;

    .line 678
    .line 679
    iput-wide v6, v4, La/rdg;->i:J

    .line 680
    .line 681
    iput v5, v4, La/rdg;->l:I

    .line 682
    .line 683
    iput-byte v1, v4, La/rdg;->m:B

    .line 684
    .line 685
    iput-wide v2, v4, La/rdg;->j:J

    .line 686
    .line 687
    move-wide/from16 v12, p3

    .line 688
    .line 689
    iput-wide v12, v4, La/rdg;->k:J

    .line 690
    .line 691
    move/from16 v11, p2

    .line 692
    .line 693
    iput v11, v4, La/rdg;->n:I

    .line 694
    .line 695
    iput v10, v4, La/rdg;->o:I

    .line 696
    .line 697
    iput v0, v4, La/rdg;->p:I

    .line 698
    .line 699
    const/4 v15, 0x3

    .line 700
    iput v15, v4, La/rdg;->w:I

    .line 701
    .line 702
    invoke-static {v12, v13, v8}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v15

    .line 706
    move/from16 p1, v1

    .line 707
    .line 708
    move-object/from16 v1, v18

    .line 709
    .line 710
    if-ne v15, v1, :cond_d

    .line 711
    .line 712
    :goto_b
    return-object v1

    .line 713
    :cond_d
    move-wide/from16 v20, v2

    .line 714
    .line 715
    move-object/from16 v3, v19

    .line 716
    .line 717
    move-wide/from16 v18, v20

    .line 718
    .line 719
    goto/16 :goto_1

    .line 720
    .line 721
    :goto_c
    move-wide/from16 v20, v18

    .line 722
    .line 723
    move-object/from16 v18, v1

    .line 724
    .line 725
    move-object v1, v14

    .line 726
    goto :goto_9

    .line 727
    :cond_e
    move/from16 v11, p2

    .line 728
    .line 729
    move-wide/from16 v12, p3

    .line 730
    .line 731
    move/from16 p1, v1

    .line 732
    .line 733
    move-object/from16 v1, v18

    .line 734
    .line 735
    const/16 v16, 0x3

    .line 736
    .line 737
    new-instance v14, La/dag0;

    .line 738
    .line 739
    invoke-direct {v14, v15}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 740
    .line 741
    .line 742
    move-object/from16 v18, v1

    .line 743
    .line 744
    move-object v1, v14

    .line 745
    :goto_d
    const/16 v17, 0x0

    .line 746
    .line 747
    move-wide v14, v2

    .line 748
    move-object/from16 v3, v19

    .line 749
    .line 750
    move/from16 v2, p1

    .line 751
    .line 752
    goto/16 :goto_2

    .line 753
    .line 754
    :cond_f
    move/from16 p1, v1

    .line 755
    .line 756
    move-object v1, v11

    .line 757
    const/16 v16, 0x3

    .line 758
    .line 759
    move/from16 v11, p2

    .line 760
    .line 761
    invoke-static {v15}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 762
    .line 763
    .line 764
    move-object/from16 v18, v1

    .line 765
    .line 766
    move-object v1, v15

    .line 767
    const/4 v0, 0x0

    .line 768
    goto :goto_d

    .line 769
    :cond_10
    move-object/from16 v19, v1

    .line 770
    .line 771
    if-nez v19, :cond_11

    .line 772
    .line 773
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 774
    .line 775
    const-string v1, "Unexpected error"

    .line 776
    .line 777
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    throw v0

    .line 781
    :cond_11
    throw v19
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 782
    :goto_e
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 783
    .line 784
    new-instance v1, La/g0g0;

    .line 785
    .line 786
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 787
    .line 788
    .line 789
    move-object v0, v1

    .line 790
    :goto_f
    nop

    .line 791
    instance-of v1, v0, La/g0g0;

    .line 792
    .line 793
    if-nez v1, :cond_14

    .line 794
    .line 795
    move-object v1, v0

    .line 796
    check-cast v1, La/vdg;

    .line 797
    .line 798
    iget-object v2, v1, La/vdg;->a:Ljava/util/ArrayList;

    .line 799
    .line 800
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    check-cast v3, Ljava/util/Date;

    .line 805
    .line 806
    if-nez v3, :cond_12

    .line 807
    .line 808
    new-instance v3, Ljava/util/Date;

    .line 809
    .line 810
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 811
    .line 812
    .line 813
    :cond_12
    move-object/from16 v3, p0

    .line 814
    .line 815
    iget-object v3, v3, La/udg;->b:La/tcg;

    .line 816
    .line 817
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    check-cast v2, Ljava/util/Date;

    .line 825
    .line 826
    if-nez v2, :cond_13

    .line 827
    .line 828
    new-instance v2, Ljava/util/Date;

    .line 829
    .line 830
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 831
    .line 832
    .line 833
    :cond_13
    iget-object v3, v3, La/tcg;->e:Ljava/util/LinkedHashMap;

    .line 834
    .line 835
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    :cond_14
    return-object v0
.end method

.method public final d(JLa/zje;)Ljava/io/Serializable;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/sdg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/sdg;

    .line 11
    .line 12
    iget v3, v2, La/sdg;->r:I

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
    iput v3, v2, La/sdg;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/sdg;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/sdg;-><init>(La/udg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/sdg;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/sdg;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/sdg;->n:I

    .line 47
    .line 48
    iget v10, v2, La/sdg;->m:I

    .line 49
    .line 50
    iget v11, v2, La/sdg;->l:I

    .line 51
    .line 52
    iget-wide v12, v2, La/sdg;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/sdg;->j:J

    .line 55
    .line 56
    const/16 p3, 0x0

    .line 57
    .line 58
    iget-wide v7, v2, La/sdg;->i:J

    .line 59
    .line 60
    iget-object v5, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move v0, v4

    .line 66
    const/4 v1, 0x3

    .line 67
    move-wide/from16 v16, v14

    .line 68
    .line 69
    move-object v14, v5

    .line 70
    move-wide v4, v7

    .line 71
    move v7, v10

    .line 72
    move v8, v11

    .line 73
    move-wide v10, v12

    .line 74
    move-wide/from16 v12, v16

    .line 75
    .line 76
    goto/16 :goto_f

    .line 77
    .line 78
    :cond_1
    const/16 p3, 0x0

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p3

    .line 86
    :cond_2
    const/16 p3, 0x0

    .line 87
    .line 88
    iget v4, v2, La/sdg;->n:I

    .line 89
    .line 90
    iget v5, v2, La/sdg;->m:I

    .line 91
    .line 92
    iget v7, v2, La/sdg;->l:I

    .line 93
    .line 94
    iget-wide v10, v2, La/sdg;->k:J

    .line 95
    .line 96
    iget-wide v12, v2, La/sdg;->j:J

    .line 97
    .line 98
    iget-wide v14, v2, La/sdg;->i:J

    .line 99
    .line 100
    iget-object v8, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 101
    .line 102
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move v0, v4

    .line 106
    move/from16 v16, v7

    .line 107
    .line 108
    move v7, v5

    .line 109
    move-wide v4, v14

    .line 110
    move-object v14, v8

    .line 111
    move/from16 v8, v16

    .line 112
    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_3
    const/16 p3, 0x0

    .line 116
    .line 117
    iget v4, v2, La/sdg;->m:I

    .line 118
    .line 119
    iget v5, v2, La/sdg;->l:I

    .line 120
    .line 121
    iget-wide v7, v2, La/sdg;->k:J

    .line 122
    .line 123
    iget-wide v10, v2, La/sdg;->j:J

    .line 124
    .line 125
    iget-wide v12, v2, La/sdg;->i:J

    .line 126
    .line 127
    iget-object v14, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 128
    .line 129
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-wide/from16 v16, v7

    .line 135
    .line 136
    move v7, v4

    .line 137
    move v8, v5

    .line 138
    move-wide v4, v12

    .line 139
    move-wide v12, v10

    .line 140
    move-wide/from16 v10, v16

    .line 141
    .line 142
    goto/16 :goto_a

    .line 143
    .line 144
    :cond_4
    const/16 p3, 0x0

    .line 145
    .line 146
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-wide v4, La/cag0;->a:J

    .line 150
    .line 151
    const-wide/16 v7, 0x3

    .line 152
    .line 153
    move-object/from16 v14, p3

    .line 154
    .line 155
    move-wide v10, v4

    .line 156
    move-wide v12, v7

    .line 157
    move v0, v9

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    move-wide/from16 v4, p1

    .line 161
    .line 162
    :goto_1
    if-eqz v0, :cond_15

    .line 163
    .line 164
    :try_start_1
    iget-object v15, v1, La/udg;->a:La/do20;

    .line 165
    .line 166
    iput-object v14, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 167
    .line 168
    iput-wide v4, v2, La/sdg;->i:J

    .line 169
    .line 170
    iput-wide v12, v2, La/sdg;->j:J

    .line 171
    .line 172
    iput-wide v10, v2, La/sdg;->k:J

    .line 173
    .line 174
    iput v8, v2, La/sdg;->l:I

    .line 175
    .line 176
    iput v7, v2, La/sdg;->m:I

    .line 177
    .line 178
    iput v0, v2, La/sdg;->n:I

    .line 179
    .line 180
    iput v9, v2, La/sdg;->r:I

    .line 181
    .line 182
    invoke-virtual {v15, v4, v5, v2}, La/do20;->e(JLa/zje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    if-ne v0, v3, :cond_5

    .line 187
    .line 188
    goto/16 :goto_e

    .line 189
    .line 190
    :cond_5
    move-wide/from16 v16, v4

    .line 191
    .line 192
    move v4, v7

    .line 193
    move v5, v8

    .line 194
    move-wide v7, v10

    .line 195
    move-wide v10, v12

    .line 196
    move-wide/from16 v12, v16

    .line 197
    .line 198
    :goto_2
    :try_start_2
    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    .line 200
    new-instance v1, Ljava/util/ArrayList;

    .line 201
    .line 202
    const/16 v2, 0xa

    .line 203
    .line 204
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_b

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, La/scg;

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    new-instance v3, La/pcg;

    .line 231
    .line 232
    iget-object v4, v2, La/scg;->a:Ljava/lang/Long;

    .line 233
    .line 234
    iget-object v2, v2, La/scg;->b:La/i3x;

    .line 235
    .line 236
    if-eqz v4, :cond_6

    .line 237
    .line 238
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide v4

    .line 242
    :goto_4
    move-wide v8, v4

    .line 243
    goto :goto_5

    .line 244
    :cond_6
    const-wide/16 v4, 0x0

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :goto_5
    if-eqz v2, :cond_7

    .line 248
    .line 249
    iget-object v4, v2, La/i3x;->a:Ljava/lang/String;

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_7
    move-object/from16 v4, p3

    .line 253
    .line 254
    :goto_6
    invoke-static {v4}, La/qcc;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-eqz v2, :cond_8

    .line 259
    .line 260
    iget-object v5, v2, La/i3x;->b:Ljava/lang/String;

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_8
    move-object/from16 v5, p3

    .line 264
    .line 265
    :goto_7
    invoke-static {v5}, La/qcc;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    if-eqz v2, :cond_9

    .line 270
    .line 271
    iget-object v6, v2, La/i3x;->c:Ljava/lang/String;

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_9
    move-object/from16 v6, p3

    .line 275
    .line 276
    :goto_8
    invoke-static {v6}, La/qcc;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    if-eqz v2, :cond_a

    .line 281
    .line 282
    iget-object v2, v2, La/i3x;->d:Ljava/lang/String;

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_a
    move-object/from16 v2, p3

    .line 286
    .line 287
    :goto_9
    invoke-static {v2}, La/qcc;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-direct/range {v3 .. v9}, La/pcg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_b
    return-object v1

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    :goto_a
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    if-eqz v15, :cond_10

    .line 305
    .line 306
    if-nez v8, :cond_c

    .line 307
    .line 308
    new-instance v14, La/el50;

    .line 309
    .line 310
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :cond_c
    move-wide/from16 p1, v10

    .line 317
    .line 318
    int-to-long v9, v7

    .line 319
    cmp-long v9, v9, v12

    .line 320
    .line 321
    if-gez v9, :cond_d

    .line 322
    .line 323
    const/4 v9, 0x1

    .line 324
    goto :goto_b

    .line 325
    :cond_d
    const/4 v9, 0x0

    .line 326
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 327
    .line 328
    if-eqz v9, :cond_e

    .line 329
    .line 330
    iput-object v14, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 331
    .line 332
    iput-wide v4, v2, La/sdg;->i:J

    .line 333
    .line 334
    iput-wide v12, v2, La/sdg;->j:J

    .line 335
    .line 336
    move-wide/from16 v10, p1

    .line 337
    .line 338
    iput-wide v10, v2, La/sdg;->k:J

    .line 339
    .line 340
    iput v8, v2, La/sdg;->l:I

    .line 341
    .line 342
    iput v7, v2, La/sdg;->m:I

    .line 343
    .line 344
    iput v9, v2, La/sdg;->n:I

    .line 345
    .line 346
    iput v6, v2, La/sdg;->r:I

    .line 347
    .line 348
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v3, :cond_f

    .line 353
    .line 354
    goto :goto_e

    .line 355
    :goto_c
    const/4 v9, 0x1

    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :cond_e
    move-wide/from16 v10, p1

    .line 359
    .line 360
    new-instance v14, La/el50;

    .line 361
    .line 362
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    :cond_f
    move v0, v9

    .line 366
    goto :goto_c

    .line 367
    :cond_10
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    if-eqz v9, :cond_14

    .line 372
    .line 373
    move-object/from16 p1, v0

    .line 374
    .line 375
    int-to-long v0, v7

    .line 376
    cmp-long v0, v0, v12

    .line 377
    .line 378
    if-gez v0, :cond_11

    .line 379
    .line 380
    const/4 v0, 0x1

    .line 381
    goto :goto_d

    .line 382
    :cond_11
    const/4 v0, 0x0

    .line 383
    :goto_d
    add-int/lit8 v7, v7, 0x1

    .line 384
    .line 385
    if-eqz v0, :cond_13

    .line 386
    .line 387
    iput-object v14, v2, La/sdg;->o:Ljava/lang/Throwable;

    .line 388
    .line 389
    iput-wide v4, v2, La/sdg;->i:J

    .line 390
    .line 391
    iput-wide v12, v2, La/sdg;->j:J

    .line 392
    .line 393
    iput-wide v10, v2, La/sdg;->k:J

    .line 394
    .line 395
    iput v8, v2, La/sdg;->l:I

    .line 396
    .line 397
    iput v7, v2, La/sdg;->m:I

    .line 398
    .line 399
    iput v0, v2, La/sdg;->n:I

    .line 400
    .line 401
    const/4 v1, 0x3

    .line 402
    iput v1, v2, La/sdg;->r:I

    .line 403
    .line 404
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    if-ne v9, v3, :cond_12

    .line 409
    .line 410
    :goto_e
    return-object v3

    .line 411
    :cond_12
    :goto_f
    move-object/from16 v1, p0

    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_13
    const/4 v1, 0x3

    .line 415
    new-instance v14, La/dag0;

    .line 416
    .line 417
    move-object/from16 v9, p1

    .line 418
    .line 419
    invoke-direct {v14, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    goto :goto_f

    .line 423
    :cond_14
    move-object v9, v0

    .line 424
    const/4 v1, 0x3

    .line 425
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 426
    .line 427
    .line 428
    const/4 v0, 0x0

    .line 429
    move-object/from16 v1, p0

    .line 430
    .line 431
    move-object v14, v9

    .line 432
    goto :goto_c

    .line 433
    :cond_15
    if-nez v14, :cond_16

    .line 434
    .line 435
    const-string v0, "Unexpected error"

    .line 436
    .line 437
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-object p3

    .line 441
    :cond_16
    throw v14
.end method

.method public final e(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    iget-object v2, v1, La/udg;->c:La/knf0;

    .line 6
    .line 7
    instance-of v3, v0, La/tdg;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, La/tdg;

    .line 13
    .line 14
    iget v4, v3, La/tdg;->u:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/tdg;->u:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/tdg;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, La/tdg;-><init>(La/udg;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, La/tdg;->s:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/tdg;->u:I

    .line 36
    .line 37
    iget-object v6, v1, La/udg;->b:La/tcg;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v10, 0x1

    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    if-eq v5, v10, :cond_3

    .line 45
    .line 46
    if-eq v5, v8, :cond_2

    .line 47
    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    iget v5, v3, La/tdg;->m:I

    .line 51
    .line 52
    iget v12, v3, La/tdg;->l:I

    .line 53
    .line 54
    iget v13, v3, La/tdg;->k:I

    .line 55
    .line 56
    iget-wide v14, v3, La/tdg;->p:J

    .line 57
    .line 58
    move/from16 p1, v12

    .line 59
    .line 60
    const/16 p5, 0x0

    .line 61
    .line 62
    iget-wide v11, v3, La/tdg;->o:J

    .line 63
    .line 64
    iget v9, v3, La/tdg;->j:I

    .line 65
    .line 66
    iget-wide v7, v3, La/tdg;->n:J

    .line 67
    .line 68
    iget v10, v3, La/tdg;->i:I

    .line 69
    .line 70
    move-object/from16 v17, v0

    .line 71
    .line 72
    iget-object v0, v3, La/tdg;->r:Ljava/lang/Throwable;

    .line 73
    .line 74
    move-object/from16 p2, v0

    .line 75
    .line 76
    iget-object v0, v3, La/tdg;->q:Ljava/util/Date;

    .line 77
    .line 78
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move/from16 v17, v5

    .line 82
    .line 83
    move-object v5, v0

    .line 84
    move/from16 v0, v17

    .line 85
    .line 86
    move-object/from16 v18, v2

    .line 87
    .line 88
    move v2, v10

    .line 89
    move/from16 v17, v13

    .line 90
    .line 91
    move-wide v13, v14

    .line 92
    move/from16 v15, p1

    .line 93
    .line 94
    move-object v10, v3

    .line 95
    move v3, v9

    .line 96
    move-object/from16 v9, p2

    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_1
    const/16 p5, 0x0

    .line 101
    .line 102
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object p5

    .line 108
    :cond_2
    move-object/from16 v17, v0

    .line 109
    .line 110
    const/16 p5, 0x0

    .line 111
    .line 112
    iget v0, v3, La/tdg;->m:I

    .line 113
    .line 114
    iget v5, v3, La/tdg;->l:I

    .line 115
    .line 116
    iget v7, v3, La/tdg;->k:I

    .line 117
    .line 118
    iget-wide v8, v3, La/tdg;->p:J

    .line 119
    .line 120
    iget-wide v10, v3, La/tdg;->o:J

    .line 121
    .line 122
    iget v12, v3, La/tdg;->j:I

    .line 123
    .line 124
    iget-wide v13, v3, La/tdg;->n:J

    .line 125
    .line 126
    iget v15, v3, La/tdg;->i:I

    .line 127
    .line 128
    move/from16 p1, v0

    .line 129
    .line 130
    iget-object v0, v3, La/tdg;->r:Ljava/lang/Throwable;

    .line 131
    .line 132
    move-object/from16 p2, v0

    .line 133
    .line 134
    iget-object v0, v3, La/tdg;->q:Ljava/util/Date;

    .line 135
    .line 136
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-wide/from16 v17, v10

    .line 140
    .line 141
    move-object v10, v3

    .line 142
    move v3, v12

    .line 143
    move-wide/from16 v11, v17

    .line 144
    .line 145
    move-object/from16 v18, v2

    .line 146
    .line 147
    move/from16 v17, v7

    .line 148
    .line 149
    move-wide/from16 v19, v8

    .line 150
    .line 151
    move-wide v7, v13

    .line 152
    move v2, v15

    .line 153
    const/4 v14, 0x2

    .line 154
    move-object/from16 v9, p2

    .line 155
    .line 156
    move v15, v5

    .line 157
    move-object v5, v0

    .line 158
    move/from16 v0, p1

    .line 159
    .line 160
    goto/16 :goto_9

    .line 161
    .line 162
    :cond_3
    move-object/from16 v17, v0

    .line 163
    .line 164
    const/16 p5, 0x0

    .line 165
    .line 166
    iget v5, v3, La/tdg;->l:I

    .line 167
    .line 168
    iget v7, v3, La/tdg;->k:I

    .line 169
    .line 170
    iget-wide v8, v3, La/tdg;->p:J

    .line 171
    .line 172
    iget-wide v10, v3, La/tdg;->o:J

    .line 173
    .line 174
    iget v12, v3, La/tdg;->j:I

    .line 175
    .line 176
    iget-wide v13, v3, La/tdg;->n:J

    .line 177
    .line 178
    iget v15, v3, La/tdg;->i:I

    .line 179
    .line 180
    move-object/from16 v18, v2

    .line 181
    .line 182
    iget-object v2, v3, La/tdg;->r:Ljava/lang/Throwable;

    .line 183
    .line 184
    move-object/from16 p1, v2

    .line 185
    .line 186
    iget-object v2, v3, La/tdg;->q:Ljava/util/Date;

    .line 187
    .line 188
    :try_start_0
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    .line 191
    move-wide/from16 v20, v13

    .line 192
    .line 193
    move-object/from16 v0, v17

    .line 194
    .line 195
    const/4 v1, 0x1

    .line 196
    move-wide v13, v8

    .line 197
    move-object/from16 v9, p1

    .line 198
    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :catchall_0
    move-exception v0

    .line 202
    move v1, v5

    .line 203
    move-object v5, v2

    .line 204
    move v2, v15

    .line 205
    move v15, v1

    .line 206
    move-wide/from16 v32, v10

    .line 207
    .line 208
    move-object v10, v3

    .line 209
    move v3, v12

    .line 210
    move-wide/from16 v11, v32

    .line 211
    .line 212
    move v1, v7

    .line 213
    move-object/from16 v32, v0

    .line 214
    .line 215
    move-object/from16 v0, p1

    .line 216
    .line 217
    move-wide/from16 v33, v8

    .line 218
    .line 219
    move-object/from16 v9, v32

    .line 220
    .line 221
    move-wide v7, v13

    .line 222
    move-wide/from16 v13, v33

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_4
    move-object/from16 v17, v0

    .line 227
    .line 228
    move-object/from16 v18, v2

    .line 229
    .line 230
    const/16 p5, 0x0

    .line 231
    .line 232
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v6, La/tcg;->d:Ljava/util/LinkedHashMap;

    .line 236
    .line 237
    move-object/from16 v2, p6

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Ljava/util/List;

    .line 244
    .line 245
    if-nez v0, :cond_15

    .line 246
    .line 247
    sget-wide v7, La/cag0;->a:J

    .line 248
    .line 249
    const-wide/16 v9, 0x3

    .line 250
    .line 251
    move-object v5, v2

    .line 252
    move-wide v13, v7

    .line 253
    move-wide v11, v9

    .line 254
    const/4 v0, 0x1

    .line 255
    const/4 v15, 0x0

    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    move/from16 v2, p1

    .line 259
    .line 260
    move-wide/from16 v7, p3

    .line 261
    .line 262
    move-object/from16 v9, p5

    .line 263
    .line 264
    move-object v10, v3

    .line 265
    move/from16 v3, p2

    .line 266
    .line 267
    :goto_1
    if-eqz v0, :cond_13

    .line 268
    .line 269
    move/from16 p1, v15

    .line 270
    .line 271
    :try_start_1
    iget-object v15, v1, La/udg;->a:La/do20;

    .line 272
    .line 273
    sget-object v1, La/rv00;->k:La/rv00;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 274
    .line 275
    move-wide/from16 p2, v13

    .line 276
    .line 277
    :try_start_2
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 278
    .line 279
    .line 280
    move-result-wide v13

    .line 281
    move-object/from16 v19, v15

    .line 282
    .line 283
    const/16 v15, 0xe

    .line 284
    .line 285
    invoke-static {v1, v13, v14, v15}, La/rv00;->n(La/rv00;JI)J

    .line 286
    .line 287
    .line 288
    move-result-wide v13

    .line 289
    const-wide/16 v20, 0x3e8

    .line 290
    .line 291
    div-long v22, v13, v20

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 294
    .line 295
    .line 296
    move-result-wide v13

    .line 297
    const/16 v15, 0xc

    .line 298
    .line 299
    invoke-static {v1, v13, v14, v15}, La/rv00;->n(La/rv00;JI)J

    .line 300
    .line 301
    .line 302
    move-result-wide v13

    .line 303
    div-long v24, v13, v20

    .line 304
    .line 305
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v18 .. v18}, La/knf0;->c()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v30

    .line 312
    iput-object v5, v10, La/tdg;->q:Ljava/util/Date;

    .line 313
    .line 314
    iput-object v9, v10, La/tdg;->r:Ljava/lang/Throwable;

    .line 315
    .line 316
    iput v2, v10, La/tdg;->i:I

    .line 317
    .line 318
    iput-wide v7, v10, La/tdg;->n:J

    .line 319
    .line 320
    iput v3, v10, La/tdg;->j:I

    .line 321
    .line 322
    iput-wide v11, v10, La/tdg;->o:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 323
    .line 324
    move-wide/from16 v13, p2

    .line 325
    .line 326
    :try_start_3
    iput-wide v13, v10, La/tdg;->p:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 327
    .line 328
    move/from16 v1, v17

    .line 329
    .line 330
    :try_start_4
    iput v1, v10, La/tdg;->k:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 331
    .line 332
    move/from16 v15, p1

    .line 333
    .line 334
    :try_start_5
    iput v15, v10, La/tdg;->l:I

    .line 335
    .line 336
    iput v0, v10, La/tdg;->m:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 337
    .line 338
    move/from16 v17, v1

    .line 339
    .line 340
    const/4 v1, 0x1

    .line 341
    :try_start_6
    iput v1, v10, La/tdg;->u:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 342
    .line 343
    const/16 v28, 0x54d

    .line 344
    .line 345
    const/16 v29, 0x1

    .line 346
    .line 347
    move/from16 v27, v2

    .line 348
    .line 349
    move/from16 v26, v3

    .line 350
    .line 351
    move-wide/from16 v20, v7

    .line 352
    .line 353
    move-object/from16 v31, v10

    .line 354
    .line 355
    :try_start_7
    invoke-virtual/range {v19 .. v31}, La/do20;->h(JJJIIIILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 359
    if-ne v0, v4, :cond_5

    .line 360
    .line 361
    goto/16 :goto_b

    .line 362
    .line 363
    :cond_5
    move-object v2, v5

    .line 364
    move-wide v10, v11

    .line 365
    move v5, v15

    .line 366
    move/from16 v7, v17

    .line 367
    .line 368
    move/from16 v12, v26

    .line 369
    .line 370
    move/from16 v15, v27

    .line 371
    .line 372
    move-object/from16 v3, v31

    .line 373
    .line 374
    :goto_2
    :try_start_8
    check-cast v0, La/geg;

    .line 375
    .line 376
    iget-object v0, v0, La/geg;->b:Ljava/util/List;

    .line 377
    .line 378
    if-eqz v0, :cond_6

    .line 379
    .line 380
    new-instance v8, Ljava/util/ArrayList;

    .line 381
    .line 382
    const/16 v1, 0xa

    .line 383
    .line 384
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_7

    .line 400
    .line 401
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    check-cast v1, La/mcg;

    .line 406
    .line 407
    invoke-static {v1}, La/qbc;->X(La/mcg;)La/icg;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_3

    .line 415
    :catchall_1
    move-exception v0

    .line 416
    move-object v1, v9

    .line 417
    move-object v9, v0

    .line 418
    move-object v0, v1

    .line 419
    move v1, v5

    .line 420
    move-object v5, v2

    .line 421
    move v2, v15

    .line 422
    move v15, v1

    .line 423
    move-wide/from16 v32, v10

    .line 424
    .line 425
    move-object v10, v3

    .line 426
    move v3, v12

    .line 427
    move-wide/from16 v11, v32

    .line 428
    .line 429
    move v1, v7

    .line 430
    move-wide/from16 v7, v20

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_6
    move-object/from16 v8, p5

    .line 434
    .line 435
    :cond_7
    if-nez v8, :cond_8

    .line 436
    .line 437
    sget-object v8, La/iun;->a:La/iun;

    .line 438
    .line 439
    :cond_8
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-nez v0, :cond_9

    .line 444
    .line 445
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget-object v0, v6, La/tcg;->d:Ljava/util/LinkedHashMap;

    .line 452
    .line 453
    invoke-interface {v0, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 454
    .line 455
    .line 456
    :cond_9
    return-object v8

    .line 457
    :catchall_2
    move-exception v0

    .line 458
    move-object v1, v9

    .line 459
    move-object v9, v0

    .line 460
    move-object v0, v1

    .line 461
    move/from16 v1, v17

    .line 462
    .line 463
    move-wide/from16 v7, v20

    .line 464
    .line 465
    move/from16 v3, v26

    .line 466
    .line 467
    move/from16 v2, v27

    .line 468
    .line 469
    move-object/from16 v10, v31

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :catchall_3
    move-exception v0

    .line 473
    :goto_4
    move/from16 v27, v2

    .line 474
    .line 475
    move/from16 v26, v3

    .line 476
    .line 477
    move-wide/from16 v20, v7

    .line 478
    .line 479
    move-object/from16 v31, v10

    .line 480
    .line 481
    move-object v1, v9

    .line 482
    move-object v9, v0

    .line 483
    move-object v0, v1

    .line 484
    move/from16 v1, v17

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :catchall_4
    move-exception v0

    .line 488
    :goto_5
    move/from16 v17, v1

    .line 489
    .line 490
    goto :goto_4

    .line 491
    :catchall_5
    move-exception v0

    .line 492
    move/from16 v15, p1

    .line 493
    .line 494
    goto :goto_5

    .line 495
    :catchall_6
    move-exception v0

    .line 496
    move/from16 v15, p1

    .line 497
    .line 498
    goto :goto_4

    .line 499
    :catchall_7
    move-exception v0

    .line 500
    move/from16 v15, p1

    .line 501
    .line 502
    move-wide/from16 v13, p2

    .line 503
    .line 504
    goto :goto_4

    .line 505
    :goto_6
    invoke-static {v9}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 506
    .line 507
    .line 508
    move-result v17

    .line 509
    if-eqz v17, :cond_e

    .line 510
    .line 511
    if-nez v1, :cond_a

    .line 512
    .line 513
    new-instance v0, La/el50;

    .line 514
    .line 515
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    move-object v9, v0

    .line 519
    move/from16 v17, v1

    .line 520
    .line 521
    const/4 v0, 0x0

    .line 522
    :goto_7
    move-object/from16 v1, p0

    .line 523
    .line 524
    goto/16 :goto_1

    .line 525
    .line 526
    :cond_a
    move-wide/from16 v19, v13

    .line 527
    .line 528
    int-to-long v13, v15

    .line 529
    cmp-long v13, v13, v11

    .line 530
    .line 531
    if-gez v13, :cond_b

    .line 532
    .line 533
    const/4 v13, 0x1

    .line 534
    goto :goto_8

    .line 535
    :cond_b
    const/4 v13, 0x0

    .line 536
    :goto_8
    add-int/lit8 v15, v15, 0x1

    .line 537
    .line 538
    if-eqz v13, :cond_d

    .line 539
    .line 540
    iput-object v5, v10, La/tdg;->q:Ljava/util/Date;

    .line 541
    .line 542
    iput-object v0, v10, La/tdg;->r:Ljava/lang/Throwable;

    .line 543
    .line 544
    iput v2, v10, La/tdg;->i:I

    .line 545
    .line 546
    iput-wide v7, v10, La/tdg;->n:J

    .line 547
    .line 548
    iput v3, v10, La/tdg;->j:I

    .line 549
    .line 550
    iput-wide v11, v10, La/tdg;->o:J

    .line 551
    .line 552
    move-wide/from16 p1, v11

    .line 553
    .line 554
    move-wide/from16 v11, v19

    .line 555
    .line 556
    iput-wide v11, v10, La/tdg;->p:J

    .line 557
    .line 558
    iput v1, v10, La/tdg;->k:I

    .line 559
    .line 560
    iput v15, v10, La/tdg;->l:I

    .line 561
    .line 562
    iput v13, v10, La/tdg;->m:I

    .line 563
    .line 564
    const/4 v14, 0x2

    .line 565
    iput v14, v10, La/tdg;->u:I

    .line 566
    .line 567
    invoke-static {v11, v12, v10}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v9

    .line 571
    if-ne v9, v4, :cond_c

    .line 572
    .line 573
    goto/16 :goto_b

    .line 574
    .line 575
    :cond_c
    move-object v9, v0

    .line 576
    move/from16 v17, v1

    .line 577
    .line 578
    move-wide/from16 v19, v11

    .line 579
    .line 580
    move v0, v13

    .line 581
    move-wide/from16 v11, p1

    .line 582
    .line 583
    :goto_9
    move-object/from16 v1, p0

    .line 584
    .line 585
    move-wide/from16 v13, v19

    .line 586
    .line 587
    goto/16 :goto_1

    .line 588
    .line 589
    :cond_d
    move-wide/from16 p1, v11

    .line 590
    .line 591
    move-wide/from16 v11, v19

    .line 592
    .line 593
    const/4 v14, 0x2

    .line 594
    new-instance v0, La/el50;

    .line 595
    .line 596
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 597
    .line 598
    .line 599
    move-object v9, v0

    .line 600
    move/from16 v17, v1

    .line 601
    .line 602
    move v0, v13

    .line 603
    move-object/from16 v1, p0

    .line 604
    .line 605
    move-wide v13, v11

    .line 606
    move-wide/from16 v11, p1

    .line 607
    .line 608
    goto/16 :goto_1

    .line 609
    .line 610
    :cond_e
    move-wide/from16 p1, v11

    .line 611
    .line 612
    move-wide v11, v13

    .line 613
    const/4 v14, 0x2

    .line 614
    invoke-static {v9}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 615
    .line 616
    .line 617
    move-result v13

    .line 618
    if-eqz v13, :cond_12

    .line 619
    .line 620
    int-to-long v13, v15

    .line 621
    cmp-long v13, v13, p1

    .line 622
    .line 623
    if-gez v13, :cond_f

    .line 624
    .line 625
    const/4 v13, 0x1

    .line 626
    goto :goto_a

    .line 627
    :cond_f
    const/4 v13, 0x0

    .line 628
    :goto_a
    add-int/lit8 v15, v15, 0x1

    .line 629
    .line 630
    if-eqz v13, :cond_11

    .line 631
    .line 632
    iput-object v5, v10, La/tdg;->q:Ljava/util/Date;

    .line 633
    .line 634
    iput-object v0, v10, La/tdg;->r:Ljava/lang/Throwable;

    .line 635
    .line 636
    iput v2, v10, La/tdg;->i:I

    .line 637
    .line 638
    iput-wide v7, v10, La/tdg;->n:J

    .line 639
    .line 640
    iput v3, v10, La/tdg;->j:I

    .line 641
    .line 642
    move v14, v2

    .line 643
    move/from16 v17, v3

    .line 644
    .line 645
    move-wide/from16 v2, p1

    .line 646
    .line 647
    iput-wide v2, v10, La/tdg;->o:J

    .line 648
    .line 649
    iput-wide v11, v10, La/tdg;->p:J

    .line 650
    .line 651
    iput v1, v10, La/tdg;->k:I

    .line 652
    .line 653
    iput v15, v10, La/tdg;->l:I

    .line 654
    .line 655
    iput v13, v10, La/tdg;->m:I

    .line 656
    .line 657
    const/4 v9, 0x3

    .line 658
    iput v9, v10, La/tdg;->u:I

    .line 659
    .line 660
    invoke-static {v11, v12, v10}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    if-ne v9, v4, :cond_10

    .line 665
    .line 666
    :goto_b
    return-object v4

    .line 667
    :cond_10
    move-object v9, v0

    .line 668
    move v0, v13

    .line 669
    move/from16 v32, v17

    .line 670
    .line 671
    move/from16 v17, v1

    .line 672
    .line 673
    move-wide/from16 v33, v2

    .line 674
    .line 675
    move v2, v14

    .line 676
    move-wide v13, v11

    .line 677
    move/from16 v3, v32

    .line 678
    .line 679
    move-wide/from16 v11, v33

    .line 680
    .line 681
    goto/16 :goto_7

    .line 682
    .line 683
    :cond_11
    move v14, v2

    .line 684
    move/from16 v17, v3

    .line 685
    .line 686
    const/16 v16, 0x3

    .line 687
    .line 688
    move-wide/from16 v2, p1

    .line 689
    .line 690
    new-instance v0, La/dag0;

    .line 691
    .line 692
    invoke-direct {v0, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 693
    .line 694
    .line 695
    move-object v9, v0

    .line 696
    move v0, v13

    .line 697
    move/from16 v32, v1

    .line 698
    .line 699
    move-object/from16 v1, p0

    .line 700
    .line 701
    move/from16 v33, v17

    .line 702
    .line 703
    move/from16 v17, v32

    .line 704
    .line 705
    move-wide/from16 v34, v2

    .line 706
    .line 707
    move v2, v14

    .line 708
    move-wide v13, v11

    .line 709
    move/from16 v3, v33

    .line 710
    .line 711
    move-wide/from16 v11, v34

    .line 712
    .line 713
    goto/16 :goto_1

    .line 714
    .line 715
    :cond_12
    move v14, v2

    .line 716
    move/from16 v17, v3

    .line 717
    .line 718
    const/16 v16, 0x3

    .line 719
    .line 720
    move-wide/from16 v2, p1

    .line 721
    .line 722
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 723
    .line 724
    .line 725
    move-wide/from16 v32, v2

    .line 726
    .line 727
    move v2, v14

    .line 728
    move-wide v13, v11

    .line 729
    move-wide/from16 v11, v32

    .line 730
    .line 731
    const/4 v0, 0x0

    .line 732
    move/from16 v3, v17

    .line 733
    .line 734
    move/from16 v17, v1

    .line 735
    .line 736
    goto/16 :goto_7

    .line 737
    .line 738
    :cond_13
    if-nez v9, :cond_14

    .line 739
    .line 740
    const-string v0, "Unexpected error"

    .line 741
    .line 742
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    return-object p5

    .line 746
    :cond_14
    throw v9

    .line 747
    :cond_15
    return-object v0
.end method
