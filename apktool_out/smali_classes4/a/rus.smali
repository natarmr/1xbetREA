.class public final La/rus;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B

.field public final i:La/oeg0;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/iqt;La/lbu;La/vpu;La/yk50;La/h3c;La/oeg0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/rus;->h:B

    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/sqs;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v0, v1}, La/sqs;-><init>(B)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/rus;->j:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, p0, La/rus;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p3, p0, La/rus;->l:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p4, p0, La/rus;->m:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p5, p0, La/rus;->n:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p6, p0, La/rus;->i:La/oeg0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(La/oeg0;La/yfm0;La/gr00;La/pv00;La/bn6;La/je;La/luu;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/rus;->h:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v1, La/rlg;

    invoke-direct {v1, p7, v0}, La/rlg;-><init>(La/luu;B)V

    .line 30
    invoke-direct {p0, v1}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 31
    iput-object p1, p0, La/rus;->i:La/oeg0;

    .line 32
    iput-object p2, p0, La/rus;->j:Ljava/lang/Object;

    .line 33
    iput-object p3, p0, La/rus;->k:Ljava/lang/Object;

    .line 34
    iput-object p4, p0, La/rus;->l:Ljava/lang/Object;

    .line 35
    iput-object p5, p0, La/rus;->m:Ljava/lang/Object;

    .line 36
    iput-object p6, p0, La/rus;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rus;->h:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/jll0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/rus;->k(La/jll0;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, La/nus;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, La/rus;->j(La/nus;La/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(La/zje;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, La/ous;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/ous;

    .line 11
    .line 12
    iget v3, v2, La/ous;->l:I

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
    iput v3, v2, La/ous;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/ous;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/ous;-><init>(La/rus;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, La/ous;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v8, La/ous;->l:I

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v9, :cond_1

    .line 41
    .line 42
    iget-object v2, v8, La/ous;->i:La/m9s;

    .line 43
    .line 44
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0

    .line 55
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/xus;

    .line 63
    .line 64
    iget-object v1, v1, La/xus;->e:La/m9s;

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    iget-object v3, v0, La/rus;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, La/h3c;

    .line 74
    .line 75
    iget-wide v4, v1, La/m9s;->o:J

    .line 76
    .line 77
    iget-wide v6, v1, La/m9s;->p:J

    .line 78
    .line 79
    iput-object v1, v8, La/ous;->i:La/m9s;

    .line 80
    .line 81
    iput v9, v8, La/ous;->l:I

    .line 82
    .line 83
    invoke-virtual/range {v3 .. v8}, La/h3c;->a(JJLa/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-ne v3, v2, :cond_4

    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_4
    move-object v2, v1

    .line 91
    move-object v1, v3

    .line 92
    :goto_2
    move-object/from16 v26, v1

    .line 93
    .line 94
    check-cast v26, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v10, La/tus;

    .line 97
    .line 98
    iget-object v1, v2, La/m9s;->c:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/lang/Long;

    .line 105
    .line 106
    const-wide/16 v3, 0x0

    .line 107
    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    move-wide v12, v5

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move-wide v12, v3

    .line 117
    :goto_3
    iget-object v1, v2, La/m9s;->d:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Ljava/lang/Long;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    :cond_6
    move-wide v14, v3

    .line 132
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, La/xus;

    .line 137
    .line 138
    iget-object v1, v1, La/xus;->d:La/owq0;

    .line 139
    .line 140
    iget-object v1, v1, La/owq0;->a:Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, La/xus;

    .line 147
    .line 148
    iget-object v3, v3, La/xus;->d:La/owq0;

    .line 149
    .line 150
    iget-object v3, v3, La/owq0;->b:Ljava/util/List;

    .line 151
    .line 152
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, La/xus;

    .line 157
    .line 158
    iget-object v4, v4, La/xus;->d:La/owq0;

    .line 159
    .line 160
    iget-boolean v4, v4, La/owq0;->c:Z

    .line 161
    .line 162
    iget-object v5, v2, La/m9s;->G:Ljava/lang/String;

    .line 163
    .line 164
    iget-wide v6, v2, La/m9s;->a:J

    .line 165
    .line 166
    move-object v8, v10

    .line 167
    iget-wide v9, v2, La/m9s;->b:J

    .line 168
    .line 169
    iget-boolean v11, v2, La/m9s;->x:Z

    .line 170
    .line 171
    move-object/from16 v29, v1

    .line 172
    .line 173
    iget-object v1, v2, La/m9s;->u:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-lez v1, :cond_7

    .line 180
    .line 181
    const/16 v33, 0x1

    .line 182
    .line 183
    :goto_4
    move-object/from16 v30, v3

    .line 184
    .line 185
    move/from16 v31, v4

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_7
    const/4 v1, 0x0

    .line 189
    move/from16 v33, v1

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :goto_5
    iget-wide v3, v2, La/m9s;->o:J

    .line 193
    .line 194
    move-wide/from16 v20, v3

    .line 195
    .line 196
    iget-wide v3, v2, La/m9s;->p:J

    .line 197
    .line 198
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, La/xus;

    .line 203
    .line 204
    iget v1, v1, La/xus;->c:I

    .line 205
    .line 206
    move-wide/from16 v22, v3

    .line 207
    .line 208
    iget-wide v3, v2, La/m9s;->A:J

    .line 209
    .line 210
    iget-object v2, v2, La/m9s;->f:Ljava/lang/String;

    .line 211
    .line 212
    move-object/from16 v28, v2

    .line 213
    .line 214
    move-wide/from16 v24, v3

    .line 215
    .line 216
    move-object/from16 v27, v5

    .line 217
    .line 218
    move-wide/from16 v16, v6

    .line 219
    .line 220
    move-wide/from16 v18, v9

    .line 221
    .line 222
    move/from16 v32, v11

    .line 223
    .line 224
    move v11, v1

    .line 225
    move-object v10, v8

    .line 226
    invoke-direct/range {v10 .. v33}, La/tus;-><init>(IJJJJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v8}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0
.end method

.method public j(La/nus;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/pus;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/pus;

    .line 13
    .line 14
    iget v4, v3, La/pus;->l:I

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
    iput v4, v3, La/pus;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/pus;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/pus;-><init>(La/rus;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/pus;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/pus;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    if-eq v5, v9, :cond_3

    .line 44
    .line 45
    if-eq v5, v8, :cond_2

    .line 46
    .line 47
    if-ne v5, v7, :cond_1

    .line 48
    .line 49
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v6

    .line 60
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    iget-object v1, v3, La/pus;->i:La/nus;

    .line 65
    .line 66
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, v3, La/pus;->i:La/nus;

    .line 74
    .line 75
    iput v9, v3, La/pus;->l:I

    .line 76
    .line 77
    invoke-static {v0, v1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-ne v2, v4, :cond_5

    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_5
    :goto_1
    if-eqz v1, :cond_13

    .line 86
    .line 87
    instance-of v2, v1, La/kus;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    iget-object v9, v0, La/rus;->i:La/oeg0;

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v2, La/c8d;

    .line 103
    .line 104
    sget-object v3, La/y7d;->a:La/v7d;

    .line 105
    .line 106
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 107
    .line 108
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :goto_2
    move-object v2, v1

    .line 116
    check-cast v2, La/paw;

    .line 117
    .line 118
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_12

    .line 123
    .line 124
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, La/oe50;

    .line 129
    .line 130
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    instance-of v2, v1, La/lus;

    .line 135
    .line 136
    if-eqz v2, :cond_8

    .line 137
    .line 138
    iput-object v6, v3, La/pus;->i:La/nus;

    .line 139
    .line 140
    iput v8, v3, La/pus;->l:I

    .line 141
    .line 142
    invoke-virtual {v0, v3}, La/rus;->i(La/zje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v4, :cond_7

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_8
    instance-of v2, v1, La/mus;

    .line 154
    .line 155
    if-eqz v2, :cond_f

    .line 156
    .line 157
    iput-object v6, v3, La/pus;->i:La/nus;

    .line 158
    .line 159
    iput v7, v3, La/pus;->l:I

    .line 160
    .line 161
    iget-object v1, v0, La/rus;->k:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, La/lbu;

    .line 164
    .line 165
    invoke-virtual {v1}, La/lbu;->j()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_9

    .line 170
    .line 171
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_9
    iget-object v1, v0, La/rus;->j:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v2, v1

    .line 177
    check-cast v2, La/iqt;

    .line 178
    .line 179
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 180
    .line 181
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-nez v2, :cond_a

    .line 186
    .line 187
    new-instance v10, La/wej;

    .line 188
    .line 189
    move-object v12, v1

    .line 190
    check-cast v12, La/iqt;

    .line 191
    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const/16 v17, 0x14

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    const-class v13, La/iqt;

    .line 198
    .line 199
    const-string v14, "invoke"

    .line 200
    .line 201
    const-string v15, "invoke()Z"

    .line 202
    .line 203
    invoke-direct/range {v10 .. v17}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 204
    .line 205
    .line 206
    sget-object v1, La/sus;->a:La/sus;

    .line 207
    .line 208
    invoke-virtual {v0, v1, v10}, La/x2t0;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 219
    .line 220
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance v2, La/c8d;

    .line 224
    .line 225
    sget-object v3, La/y7d;->a:La/v7d;

    .line 226
    .line 227
    sget-object v6, La/n0w0;->a:La/n0w0;

    .line 228
    .line 229
    invoke-direct {v2, v3, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v1, v2}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    sget-object v3, La/wez;->b:La/wez;

    .line 237
    .line 238
    invoke-static {v3, v2, v0, v1, v5}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :goto_4
    move-object v2, v1

    .line 243
    check-cast v2, La/paw;

    .line 244
    .line 245
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_d

    .line 250
    .line 251
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, La/oe50;

    .line 256
    .line 257
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_a
    iget-object v1, v0, La/rus;->m:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, La/yk50;

    .line 264
    .line 265
    invoke-virtual {v1}, La/yk50;->g()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_c

    .line 270
    .line 271
    invoke-virtual {v0, v3}, La/rus;->l(La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-ne v0, v4, :cond_b

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_c
    sget-object v1, La/uus;->a:La/uus;

    .line 282
    .line 283
    invoke-virtual {v0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    :goto_5
    if-ne v0, v4, :cond_e

    .line 289
    .line 290
    :goto_6
    return-object v4

    .line 291
    :cond_e
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_f
    instance-of v2, v1, La/ius;

    .line 295
    .line 296
    if-eqz v2, :cond_10

    .line 297
    .line 298
    invoke-virtual {v0}, La/x2t0;->e()V

    .line 299
    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_10
    instance-of v2, v1, La/jus;

    .line 303
    .line 304
    if-eqz v2, :cond_13

    .line 305
    .line 306
    iget-object v0, v0, La/x2t0;->b:La/ocj;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 312
    .line 313
    :cond_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    move-object v3, v2

    .line 318
    check-cast v3, La/xus;

    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-object v4, v1

    .line 324
    check-cast v4, La/jus;

    .line 325
    .line 326
    iget-object v5, v4, La/jus;->a:La/m9s;

    .line 327
    .line 328
    iget-object v6, v4, La/jus;->b:La/owq0;

    .line 329
    .line 330
    iget v4, v4, La/jus;->c:I

    .line 331
    .line 332
    const/16 v7, 0xf

    .line 333
    .line 334
    invoke-static {v3, v4, v6, v5, v7}, La/xus;->a(La/xus;ILa/owq0;La/m9s;I)La/xus;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-eqz v2, :cond_11

    .line 343
    .line 344
    :cond_12
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object v0

    .line 347
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 348
    .line 349
    .line 350
    return-object v6
.end method

.method public k(La/jll0;La/zje;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/lll0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/lll0;

    .line 13
    .line 14
    iget v4, v3, La/lll0;->l:I

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
    iput v4, v3, La/lll0;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/lll0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/lll0;-><init>(La/rus;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/lll0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/lll0;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-object v1, v3, La/lll0;->i:La/jll0;

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, v3, La/lll0;->i:La/jll0;

    .line 59
    .line 60
    iput v7, v3, La/lll0;->l:I

    .line 61
    .line 62
    invoke-static {v0, v1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-ne v2, v4, :cond_3

    .line 67
    .line 68
    return-object v4

    .line 69
    :cond_3
    :goto_1
    sget-object v2, La/dll0;->a:La/dll0;

    .line 70
    .line 71
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0}, La/x2t0;->e()V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_c

    .line 81
    .line 82
    :cond_4
    instance-of v2, v1, La/ell0;

    .line 83
    .line 84
    iget-object v3, v0, La/x2t0;->b:La/ocj;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v3, v0

    .line 98
    check-cast v3, La/mll0;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-object v4, v1

    .line 104
    check-cast v4, La/ell0;

    .line 105
    .line 106
    iget-object v4, v4, La/ell0;->a:Ljava/lang/String;

    .line 107
    .line 108
    const/4 v5, 0x3

    .line 109
    invoke-static {v3, v6, v4, v5}, La/mll0;->a(La/mll0;Ljava/util/List;Ljava/lang/String;I)La/mll0;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    goto/16 :goto_c

    .line 120
    .line 121
    :cond_6
    instance-of v2, v1, La/fll0;

    .line 122
    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 129
    .line 130
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    move-object v3, v0

    .line 135
    check-cast v3, La/mll0;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-object v4, v1

    .line 141
    check-cast v4, La/fll0;

    .line 142
    .line 143
    iget-object v4, v4, La/fll0;->a:Ljava/util/List;

    .line 144
    .line 145
    const/4 v5, 0x5

    .line 146
    invoke-static {v3, v4, v6, v5}, La/mll0;->a(La/mll0;Ljava/util/List;Ljava/lang/String;I)La/mll0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    goto/16 :goto_c

    .line 157
    .line 158
    :cond_8
    instance-of v2, v1, La/gll0;

    .line 159
    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_9
    instance-of v2, v1, La/hll0;

    .line 166
    .line 167
    if-eqz v2, :cond_22

    .line 168
    .line 169
    check-cast v1, La/hll0;

    .line 170
    .line 171
    iget-wide v1, v1, La/hll0;->a:J

    .line 172
    .line 173
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, La/mll0;

    .line 178
    .line 179
    iget-object v3, v3, La/mll0;->b:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_b

    .line 190
    .line 191
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    move-object v5, v4

    .line 196
    check-cast v5, La/d2w;

    .line 197
    .line 198
    invoke-virtual {v5}, La/d2w;->b()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    cmp-long v5, v8, v1

    .line 203
    .line 204
    if-nez v5, :cond_a

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_b
    move-object v4, v6

    .line 208
    :goto_2
    check-cast v4, La/d2w;

    .line 209
    .line 210
    if-eqz v4, :cond_21

    .line 211
    .line 212
    iget-object v1, v0, La/rus;->n:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v8, v1

    .line 215
    check-cast v8, La/je;

    .line 216
    .line 217
    invoke-virtual {v4}, La/d2w;->d()J

    .line 218
    .line 219
    .line 220
    move-result-wide v9

    .line 221
    invoke-virtual {v4}, La/d2w;->g()J

    .line 222
    .line 223
    .line 224
    move-result-wide v11

    .line 225
    invoke-virtual {v4}, La/d2w;->a()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    int-to-long v13, v1

    .line 230
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, La/mll0;

    .line 235
    .line 236
    iget-object v15, v1, La/mll0;->c:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual/range {v8 .. v15}, La/je;->h(JJJLjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iget-object v1, v0, La/rus;->m:Ljava/lang/Object;

    .line 242
    .line 243
    move-object v8, v1

    .line 244
    check-cast v8, La/bn6;

    .line 245
    .line 246
    invoke-virtual {v4}, La/d2w;->d()J

    .line 247
    .line 248
    .line 249
    move-result-wide v9

    .line 250
    invoke-virtual {v4}, La/d2w;->g()J

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    invoke-virtual {v4}, La/d2w;->a()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    int-to-long v13, v1

    .line 259
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, La/mll0;

    .line 264
    .line 265
    iget-object v1, v1, La/mll0;->c:Ljava/lang/String;

    .line 266
    .line 267
    const/16 v19, 0x0

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    const/4 v15, 0x1

    .line 272
    const/16 v16, 0x0

    .line 273
    .line 274
    move-object/from16 v17, v1

    .line 275
    .line 276
    invoke-virtual/range {v8 .. v19}, La/bn6;->e(JJJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    iget-object v1, v0, La/rus;->l:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v1, La/pv00;

    .line 282
    .line 283
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    check-cast v2, La/mll0;

    .line 288
    .line 289
    iget-object v2, v2, La/mll0;->a:Ljava/util/List;

    .line 290
    .line 291
    sget-object v3, La/wcm0;->a:Ljava/util/List;

    .line 292
    .line 293
    invoke-virtual {v4}, La/d2w;->c()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    const-string v5, ":"

    .line 298
    .line 299
    filled-new-array {v5}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    const/4 v8, 0x2

    .line 304
    invoke-static {v3, v5, v8, v8}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    new-instance v5, Ljava/util/ArrayList;

    .line 309
    .line 310
    const/16 v8, 0xa

    .line 311
    .line 312
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-eqz v8, :cond_c

    .line 328
    .line 329
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    check-cast v8, Ljava/lang/String;

    .line 334
    .line 335
    invoke-static {v8}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_c
    instance-of v3, v4, La/u1w;

    .line 348
    .line 349
    if-eqz v3, :cond_d

    .line 350
    .line 351
    move-object v8, v4

    .line 352
    check-cast v8, La/u1w;

    .line 353
    .line 354
    iget-object v9, v8, La/u1w;->o:La/a2w;

    .line 355
    .line 356
    invoke-static {v9}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    iget-object v8, v8, La/u1w;->p:La/a2w;

    .line 361
    .line 362
    invoke-static {v8}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    new-instance v10, Lkotlin/Pair;

    .line 367
    .line 368
    invoke-direct {v10, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_d
    instance-of v8, v4, La/x1w;

    .line 373
    .line 374
    if-eqz v8, :cond_e

    .line 375
    .line 376
    move-object v8, v4

    .line 377
    check-cast v8, La/x1w;

    .line 378
    .line 379
    iget-object v9, v8, La/x1w;->n:La/a2w;

    .line 380
    .line 381
    invoke-static {v9}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    iget-object v8, v8, La/x1w;->o:La/a2w;

    .line 386
    .line 387
    invoke-static {v8}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    new-instance v10, Lkotlin/Pair;

    .line 392
    .line 393
    invoke-direct {v10, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_e
    instance-of v8, v4, La/c2w;

    .line 398
    .line 399
    if-eqz v8, :cond_f

    .line 400
    .line 401
    move-object v8, v4

    .line 402
    check-cast v8, La/c2w;

    .line 403
    .line 404
    iget-object v9, v8, La/c2w;->o:La/a2w;

    .line 405
    .line 406
    invoke-static {v9}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    iget-object v8, v8, La/c2w;->p:La/a2w;

    .line 411
    .line 412
    invoke-static {v8}, La/wcm0;->a(La/a2w;)La/y6p0;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    new-instance v10, Lkotlin/Pair;

    .line 417
    .line 418
    invoke-direct {v10, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto :goto_4

    .line 422
    :cond_f
    sget-object v8, La/y6p0;->e:La/y6p0;

    .line 423
    .line 424
    new-instance v10, Lkotlin/Pair;

    .line 425
    .line 426
    invoke-direct {v10, v8, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :goto_4
    new-instance v11, La/vcm0;

    .line 430
    .line 431
    invoke-virtual {v4}, La/d2w;->f()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    invoke-virtual {v4}, La/d2w;->d()J

    .line 436
    .line 437
    .line 438
    move-result-wide v13

    .line 439
    instance-of v8, v4, La/y1w;

    .line 440
    .line 441
    if-eqz v8, :cond_10

    .line 442
    .line 443
    move-object v9, v4

    .line 444
    check-cast v9, La/y1w;

    .line 445
    .line 446
    move-object/from16 p2, v6

    .line 447
    .line 448
    iget-wide v6, v9, La/y1w;->l:J

    .line 449
    .line 450
    :goto_5
    move-wide/from16 v16, v6

    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_10
    move-object/from16 p2, v6

    .line 454
    .line 455
    instance-of v6, v4, La/z1w;

    .line 456
    .line 457
    if-eqz v6, :cond_11

    .line 458
    .line 459
    const-wide/16 v6, 0x0

    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_11
    if-eqz v3, :cond_12

    .line 463
    .line 464
    move-object v6, v4

    .line 465
    check-cast v6, La/u1w;

    .line 466
    .line 467
    iget-wide v6, v6, La/u1w;->l:J

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_12
    instance-of v6, v4, La/x1w;

    .line 471
    .line 472
    if-eqz v6, :cond_13

    .line 473
    .line 474
    move-object v6, v4

    .line 475
    check-cast v6, La/x1w;

    .line 476
    .line 477
    iget-wide v6, v6, La/x1w;->l:J

    .line 478
    .line 479
    goto :goto_5

    .line 480
    :cond_13
    instance-of v6, v4, La/c2w;

    .line 481
    .line 482
    if-eqz v6, :cond_20

    .line 483
    .line 484
    move-object v6, v4

    .line 485
    check-cast v6, La/c2w;

    .line 486
    .line 487
    iget-wide v6, v6, La/c2w;->l:J

    .line 488
    .line 489
    goto :goto_5

    .line 490
    :goto_6
    invoke-virtual {v4}, La/d2w;->c()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v18

    .line 494
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    check-cast v6, Ljava/lang/String;

    .line 499
    .line 500
    const-string v7, "0"

    .line 501
    .line 502
    if-nez v6, :cond_14

    .line 503
    .line 504
    move-object/from16 v19, v7

    .line 505
    .line 506
    goto :goto_7

    .line 507
    :cond_14
    move-object/from16 v19, v6

    .line 508
    .line 509
    :goto_7
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    check-cast v6, Ljava/lang/String;

    .line 514
    .line 515
    if-nez v6, :cond_15

    .line 516
    .line 517
    move-object/from16 v20, v7

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_15
    move-object/from16 v20, v6

    .line 521
    .line 522
    :goto_8
    iget-object v6, v10, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 523
    .line 524
    move-object/from16 v21, v6

    .line 525
    .line 526
    check-cast v21, La/y6p0;

    .line 527
    .line 528
    iget-object v6, v10, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 529
    .line 530
    move-object/from16 v22, v6

    .line 531
    .line 532
    check-cast v22, La/y6p0;

    .line 533
    .line 534
    invoke-virtual {v4}, La/d2w;->h()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    invoke-virtual {v4}, La/d2w;->a()I

    .line 539
    .line 540
    .line 541
    move-result v9

    .line 542
    if-eqz v8, :cond_16

    .line 543
    .line 544
    move-object v3, v4

    .line 545
    check-cast v3, La/y1w;

    .line 546
    .line 547
    iget-object v3, v3, La/y1w;->i:Ljava/util/HashMap;

    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_16
    instance-of v8, v4, La/z1w;

    .line 551
    .line 552
    if-eqz v8, :cond_17

    .line 553
    .line 554
    sget-object v3, La/lun;->a:La/lun;

    .line 555
    .line 556
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_17
    if-eqz v3, :cond_18

    .line 561
    .line 562
    move-object v3, v4

    .line 563
    check-cast v3, La/u1w;

    .line 564
    .line 565
    iget-object v3, v3, La/u1w;->i:Ljava/util/HashMap;

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_18
    instance-of v3, v4, La/x1w;

    .line 569
    .line 570
    if-eqz v3, :cond_19

    .line 571
    .line 572
    move-object v3, v4

    .line 573
    check-cast v3, La/x1w;

    .line 574
    .line 575
    iget-object v3, v3, La/x1w;->i:Ljava/util/HashMap;

    .line 576
    .line 577
    goto :goto_9

    .line 578
    :cond_19
    instance-of v3, v4, La/c2w;

    .line 579
    .line 580
    if-eqz v3, :cond_1f

    .line 581
    .line 582
    move-object v3, v4

    .line 583
    check-cast v3, La/c2w;

    .line 584
    .line 585
    iget-object v3, v3, La/c2w;->i:Ljava/util/HashMap;

    .line 586
    .line 587
    :goto_9
    sget-object v8, La/w1w;->b:La/w1w;

    .line 588
    .line 589
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    check-cast v3, Ljava/lang/String;

    .line 594
    .line 595
    if-nez v3, :cond_1a

    .line 596
    .line 597
    const-string v3, ""

    .line 598
    .line 599
    :cond_1a
    const/4 v8, 0x0

    .line 600
    invoke-static {v9, v6, v3, v2, v8}, La/k7x;->D(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v26

    .line 604
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    check-cast v2, Ljava/lang/String;

    .line 609
    .line 610
    if-nez v2, :cond_1b

    .line 611
    .line 612
    move-object/from16 v29, v7

    .line 613
    .line 614
    goto :goto_a

    .line 615
    :cond_1b
    move-object/from16 v29, v2

    .line 616
    .line 617
    :goto_a
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    check-cast v2, Ljava/lang/String;

    .line 622
    .line 623
    if-nez v2, :cond_1c

    .line 624
    .line 625
    move-object/from16 v30, v7

    .line 626
    .line 627
    goto :goto_b

    .line 628
    :cond_1c
    move-object/from16 v30, v2

    .line 629
    .line 630
    :goto_b
    const-string v15, ""

    .line 631
    .line 632
    const/16 v23, 0x0

    .line 633
    .line 634
    const/16 v24, 0x0

    .line 635
    .line 636
    const/16 v25, 0x1

    .line 637
    .line 638
    const/16 v27, 0x1

    .line 639
    .line 640
    const/16 v28, 0x0

    .line 641
    .line 642
    invoke-direct/range {v11 .. v30}, La/vcm0;-><init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y6p0;La/y6p0;IIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1, v11}, La/pv00;->n(La/vcm0;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v4}, La/d2w;->f()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    if-nez v1, :cond_1d

    .line 657
    .line 658
    new-instance v1, La/nll0;

    .line 659
    .line 660
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    goto :goto_c

    .line 667
    :cond_1d
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-virtual {v4}, La/d2w;->g()J

    .line 672
    .line 673
    .line 674
    move-result-wide v2

    .line 675
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    iget-object v2, v0, La/rus;->i:La/oeg0;

    .line 684
    .line 685
    if-eqz v1, :cond_1e

    .line 686
    .line 687
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    new-instance v2, La/kll0;

    .line 692
    .line 693
    invoke-direct {v2, v0, v4, v8}, La/kll0;-><init>(La/rus;La/d2w;B)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 697
    .line 698
    .line 699
    goto :goto_c

    .line 700
    :cond_1e
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    new-instance v2, La/kll0;

    .line 705
    .line 706
    const/4 v3, 0x1

    .line 707
    invoke-direct {v2, v0, v4, v3}, La/kll0;-><init>(La/rus;La/d2w;B)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 711
    .line 712
    .line 713
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 717
    .line 718
    .line 719
    return-object p2

    .line 720
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 721
    .line 722
    .line 723
    return-object p2

    .line 724
    :cond_21
    move-object/from16 p2, v6

    .line 725
    .line 726
    const-string v0, "Game not found"

    .line 727
    .line 728
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    return-object p2

    .line 732
    :cond_22
    move-object/from16 p2, v6

    .line 733
    .line 734
    invoke-static {}, La/t9f;->b()V

    .line 735
    .line 736
    .line 737
    return-object p2
.end method

.method public l(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/qus;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/qus;

    .line 7
    .line 8
    iget v1, v0, La/qus;->k:I

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
    iput v1, v0, La/qus;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qus;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/qus;-><init>(La/rus;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/qus;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/qus;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/rus;->l:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, La/vpu;

    .line 54
    .line 55
    iput v5, v0, La/qus;->k:I

    .line 56
    .line 57
    invoke-virtual {p1, v4, v0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    iget-object p1, p0, La/x2t0;->b:La/ocj;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 70
    .line 71
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v1, v0

    .line 76
    check-cast v1, La/xus;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const/16 v2, 0x77

    .line 82
    .line 83
    invoke-static {v1, v4, v3, v3, v2}, La/xus;->a(La/xus;ILa/owq0;La/m9s;I)La/xus;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    sget-object p1, La/vus;->a:La/vus;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method
