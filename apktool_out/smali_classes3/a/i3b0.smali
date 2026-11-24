.class public final La/i3b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:Ljava/lang/Object;

.field public l:B

.field public final synthetic m:La/v3b0;

.field public final synthetic n:J


# direct methods
.method public constructor <init>(La/v3b0;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i3b0;->m:La/v3b0;

    .line 2
    .line 3
    iput-wide p2, p0, La/i3b0;->n:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance p1, La/i3b0;

    .line 2
    .line 3
    iget-object v0, p0, La/i3b0;->m:La/v3b0;

    .line 4
    .line 5
    iget-wide v1, p0, La/i3b0;->n:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, La/i3b0;-><init>(La/v3b0;JLa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/i3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/i3b0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/i3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/i3b0;->l:B

    .line 6
    .line 7
    iget-wide v3, v1, La/i3b0;->n:J

    .line 8
    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object v8, v1, La/i3b0;->m:La/v3b0;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, v7, :cond_2

    .line 17
    .line 18
    if-eq v0, v6, :cond_1

    .line 19
    .line 20
    if-eq v0, v5, :cond_0

    .line 21
    .line 22
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
    :cond_0
    iget-object v0, v1, La/i3b0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    iget-object v0, v1, La/i3b0;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/List;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v17, v8

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    iget-wide v9, v1, La/i3b0;->j:J

    .line 50
    .line 51
    iget-wide v11, v1, La/i3b0;->i:J

    .line 52
    .line 53
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    move-object/from16 v17, v8

    .line 57
    .line 58
    move-wide v5, v9

    .line 59
    move-object/from16 v10, p1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-wide v5, v9

    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, La/e3b0;

    .line 70
    .line 71
    invoke-direct {v0, v7, v3, v4}, La/e3b0;-><init>(BJ)V

    .line 72
    .line 73
    .line 74
    sget v9, La/v3b0;->W:I

    .line 75
    .line 76
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 77
    .line 78
    .line 79
    iget-wide v11, v1, La/i3b0;->n:J

    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    const-wide/16 v13, 0x3e8

    .line 86
    .line 87
    move-wide v15, v9

    .line 88
    :try_start_1
    iget-object v10, v8, La/v3b0;->N:La/cu;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 89
    .line 90
    move-wide/from16 v17, v13

    .line 91
    .line 92
    :try_start_2
    sget-object v13, La/iun;->a:La/iun;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 93
    .line 94
    move-wide/from16 v19, v15

    .line 95
    .line 96
    const/16 v15, 0x8

    .line 97
    .line 98
    move-object v14, v13

    .line 99
    move-wide/from16 v5, v17

    .line 100
    .line 101
    move-object/from16 v17, v8

    .line 102
    .line 103
    move-wide v7, v5

    .line 104
    move-wide/from16 v5, v19

    .line 105
    .line 106
    :try_start_3
    invoke-virtual/range {v10 .. v15}, La/cu;->i(JLjava/util/List;La/iun;I)La/a1g;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    iput-wide v7, v1, La/i3b0;->i:J

    .line 111
    .line 112
    iput-wide v5, v1, La/i3b0;->j:J

    .line 113
    .line 114
    const/4 v11, 0x1

    .line 115
    iput-byte v11, v1, La/i3b0;->l:B

    .line 116
    .line 117
    invoke-static {v10, v1}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    if-ne v10, v2, :cond_4

    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_4
    move-wide v11, v7

    .line 126
    :goto_0
    :try_start_4
    check-cast v10, Ljava/util/List;

    .line 127
    .line 128
    if-nez v10, :cond_5

    .line 129
    .line 130
    sget-object v10, La/iun;->a:La/iun;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    :goto_1
    const/16 v7, 0x8

    .line 136
    .line 137
    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 142
    .line 143
    .line 144
    move-result-wide v8

    .line 145
    sub-long/2addr v8, v5

    .line 146
    cmp-long v10, v8, v11

    .line 147
    .line 148
    if-gez v10, :cond_7

    .line 149
    .line 150
    sub-long v8, v11, v8

    .line 151
    .line 152
    iput-object v7, v1, La/i3b0;->k:Ljava/lang/Object;

    .line 153
    .line 154
    iput-wide v11, v1, La/i3b0;->i:J

    .line 155
    .line 156
    iput-wide v5, v1, La/i3b0;->j:J

    .line 157
    .line 158
    const/4 v0, 0x2

    .line 159
    iput-byte v0, v1, La/i3b0;->l:B

    .line 160
    .line 161
    invoke-static {v8, v9, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-ne v0, v2, :cond_6

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_6
    move-object v0, v7

    .line 169
    :goto_2
    move-object v7, v0

    .line 170
    :cond_7
    new-instance v0, La/ub4;

    .line 171
    .line 172
    const/4 v1, 0x6

    .line 173
    invoke-direct {v0, v3, v4, v7, v1}, La/ub4;-><init>(JLjava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    sget v1, La/v3b0;->W:I

    .line 177
    .line 178
    move-object/from16 v1, v17

    .line 179
    .line 180
    invoke-virtual {v1, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object v0

    .line 186
    :catchall_2
    move-exception v0

    .line 187
    :goto_3
    move-wide v11, v7

    .line 188
    goto :goto_4

    .line 189
    :catchall_3
    move-exception v0

    .line 190
    move-wide v5, v15

    .line 191
    move-wide/from16 v7, v17

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :catchall_4
    move-exception v0

    .line 195
    move-wide v7, v13

    .line 196
    move-wide v5, v15

    .line 197
    goto :goto_3

    .line 198
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    sub-long/2addr v3, v5

    .line 203
    cmp-long v7, v3, v11

    .line 204
    .line 205
    if-gez v7, :cond_8

    .line 206
    .line 207
    sub-long v3, v11, v3

    .line 208
    .line 209
    iput-object v0, v1, La/i3b0;->k:Ljava/lang/Object;

    .line 210
    .line 211
    iput-wide v11, v1, La/i3b0;->i:J

    .line 212
    .line 213
    iput-wide v5, v1, La/i3b0;->j:J

    .line 214
    .line 215
    const/4 v9, 0x3

    .line 216
    iput-byte v9, v1, La/i3b0;->l:B

    .line 217
    .line 218
    invoke-static {v3, v4, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-ne v1, v2, :cond_8

    .line 223
    .line 224
    :goto_5
    return-object v2

    .line 225
    :cond_8
    :goto_6
    throw v0
.end method
