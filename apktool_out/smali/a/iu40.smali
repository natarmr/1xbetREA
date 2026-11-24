.class public final La/iu40;
.super La/d660;
.source "SourceFile"


# instance fields
.field public final f:La/do20;

.field public final g:La/q99;

.field public h:La/c4m0;


# direct methods
.method public constructor <init>(La/sch0;La/do20;La/jbh0;La/w6k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, La/d660;-><init>(La/sch0;Lkotlin/jvm/functions/Function2;La/w6k;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/iu40;->f:La/do20;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x6

    .line 8
    const p3, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p1, p1, p2}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, La/iu40;->g:La/q99;

    .line 16
    .line 17
    return-void
.end method

.method public static final e(La/iu40;La/mie0;La/jie0;La/sch0;La/mie0;JLa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-wide/from16 v1, p5

    .line 2
    .line 3
    move-object/from16 v3, p7

    .line 4
    .line 5
    instance-of v4, v3, La/hu40;

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    move-object v4, v3

    .line 10
    check-cast v4, La/hu40;

    .line 11
    .line 12
    iget v5, v4, La/hu40;->o:I

    .line 13
    .line 14
    const/high16 v6, -0x80000000

    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    sub-int/2addr v5, v6

    .line 21
    iput v5, v4, La/hu40;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v4, La/hu40;

    .line 25
    .line 26
    invoke-direct {v4, v3}, La/zje;-><init>(La/yje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v3, v4, La/hu40;->n:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v5, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v6, v4, La/hu40;->o:I

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    if-ne v6, v8, :cond_1

    .line 40
    .line 41
    iget-object v0, v4, La/hu40;->m:La/mie0;

    .line 42
    .line 43
    iget-object v1, v4, La/hu40;->l:La/sch0;

    .line 44
    .line 45
    iget-object v2, v4, La/hu40;->k:La/jie0;

    .line 46
    .line 47
    iget-object v5, v4, La/hu40;->j:La/mie0;

    .line 48
    .line 49
    iget-object v4, v4, La/hu40;->i:La/iu40;

    .line 50
    .line 51
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v10, v0

    .line 55
    move-object v9, v1

    .line 56
    move-object v0, v4

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v7

    .line 64
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v9, 0x0

    .line 68
    .line 69
    cmp-long v3, v1, v9

    .line 70
    .line 71
    if-gez v3, :cond_3

    .line 72
    .line 73
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    new-instance v3, La/w620;

    .line 77
    .line 78
    const/16 v6, 0xf

    .line 79
    .line 80
    invoke-direct {v3, p0, v7, v6}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 81
    .line 82
    .line 83
    iput-object p0, v4, La/hu40;->i:La/iu40;

    .line 84
    .line 85
    iput-object p1, v4, La/hu40;->j:La/mie0;

    .line 86
    .line 87
    iput-object p2, v4, La/hu40;->k:La/jie0;

    .line 88
    .line 89
    move-object/from16 v9, p3

    .line 90
    .line 91
    iput-object v9, v4, La/hu40;->l:La/sch0;

    .line 92
    .line 93
    move-object/from16 v10, p4

    .line 94
    .line 95
    iput-object v10, v4, La/hu40;->m:La/mie0;

    .line 96
    .line 97
    iput v8, v4, La/hu40;->o:I

    .line 98
    .line 99
    invoke-static {v1, v2, v3, v4}, La/msm0;->u(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-ne v3, v5, :cond_4

    .line 104
    .line 105
    return-object v5

    .line 106
    :cond_4
    move-object v0, p0

    .line 107
    move-object v5, p1

    .line 108
    move-object v2, p2

    .line 109
    :goto_1
    check-cast v3, La/eu40;

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    iget-object v1, v5, La/mie0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, La/eu40;

    .line 116
    .line 117
    iget-boolean v1, v1, La/eu40;->c:Z

    .line 118
    .line 119
    iget-wide v6, v3, La/eu40;->a:J

    .line 120
    .line 121
    iget-wide v11, v3, La/eu40;->b:J

    .line 122
    .line 123
    new-instance v4, La/eu40;

    .line 124
    .line 125
    move/from16 p3, v1

    .line 126
    .line 127
    move-object p0, v4

    .line 128
    move-wide p1, v6

    .line 129
    move-wide/from16 p4, v11

    .line 130
    .line 131
    invoke-direct/range {p0 .. p5}, La/eu40;-><init>(JZJ)V

    .line 132
    .line 133
    .line 134
    move-object v1, p0

    .line 135
    iput-object v1, v5, La/mie0;->a:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-virtual {v9, v6, v7}, La/sch0;->f(J)J

    .line 138
    .line 139
    .line 140
    move-result-wide v4

    .line 141
    invoke-virtual {v9, v4, v5}, La/sch0;->j(J)F

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    iput v1, v2, La/jie0;->a:F

    .line 146
    .line 147
    const/16 v1, 0x1e

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-static {v4, v4, v1}, La/x4d0;->d(FFI)La/l73;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, v10, La/mie0;->a:Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v0, v0, La/d660;->e:La/zri;

    .line 157
    .line 158
    iget-wide v4, v3, La/eu40;->b:J

    .line 159
    .line 160
    iget-wide v6, v3, La/eu40;->a:J

    .line 161
    .line 162
    iget-object v1, v0, La/zri;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, La/i6u0;

    .line 165
    .line 166
    const/16 v3, 0x20

    .line 167
    .line 168
    shr-long v9, v6, v3

    .line 169
    .line 170
    long-to-int v3, v9

    .line 171
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-virtual {v1, v3, v4, v5}, La/i6u0;->a(FJ)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, La/zri;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/i6u0;

    .line 181
    .line 182
    const-wide v9, 0xffffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    and-long/2addr v6, v9

    .line 188
    long-to-int v1, v6

    .line 189
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v0, v1, v4, v5}, La/i6u0;->a(FJ)V

    .line 194
    .line 195
    .line 196
    iget v0, v2, La/jie0;->a:F

    .line 197
    .line 198
    invoke-static {v0}, La/k7x;->Q(F)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    xor-int/2addr v0, v8

    .line 203
    goto :goto_2

    .line 204
    :cond_5
    const/4 v0, 0x0

    .line 205
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0
.end method

.method public static g(La/q99;)La/eu40;
    .locals 2

    .line 1
    new-instance v0, La/du40;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/du40;-><init>(La/q99;B)V

    .line 5
    .line 6
    .line 7
    new-instance p0, La/e660;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v1, v0}, La/e660;-><init>(La/yje;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, La/igi0;->a(Lkotlin/jvm/functions/Function2;)La/egi0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, La/egi0;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, La/egi0;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/eu40;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, La/eu40;->a(La/eu40;)La/eu40;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final c(La/rch0;F)F
    .locals 3

    .line 1
    iget-object p0, p0, La/d660;->a:La/sch0;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/sch0;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p2}, La/sch0;->i(F)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p1, p1, La/rch0;->a:La/sch0;

    .line 12
    .line 13
    iget-object p2, p1, La/sch0;->k:La/qah0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, p2, v0, v1, v2}, La/sch0;->d(La/qah0;JI)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    invoke-virtual {p0, p1, p2}, La/sch0;->f(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-virtual {p0, p1, p2}, La/sch0;->h(J)F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public final d(La/sch0;La/eu40;FFLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    instance-of v2, v1, La/fu40;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/fu40;

    .line 15
    .line 16
    iget v3, v2, La/fu40;->n:I

    .line 17
    .line 18
    const/high16 v4, -0x80000000

    .line 19
    .line 20
    and-int v6, v3, v4

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    iput v3, v2, La/fu40;->n:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v2, La/fu40;

    .line 30
    .line 31
    invoke-direct {v2, v5, v1}, La/fu40;-><init>(La/iu40;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v1, v9, La/fu40;->l:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v10, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v2, v9, La/fu40;->n:I

    .line 40
    .line 41
    iget-object v12, v5, La/d660;->e:La/zri;

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x2

    .line 45
    const/4 v15, 0x1

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    if-eq v2, v15, :cond_2

    .line 49
    .line 50
    if-ne v2, v14, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v13

    .line 63
    :cond_2
    iget v0, v9, La/fu40;->k:F

    .line 64
    .line 65
    iget-object v2, v9, La/fu40;->j:La/jie0;

    .line 66
    .line 67
    iget-object v3, v9, La/fu40;->i:La/sch0;

    .line 68
    .line 69
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v11, v12

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    invoke-static {v1}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    iget-wide v1, v0, La/eu40;->b:J

    .line 82
    .line 83
    iget-wide v13, v0, La/eu40;->a:J

    .line 84
    .line 85
    iget-object v0, v12, La/zri;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/i6u0;

    .line 88
    .line 89
    const/16 p2, 0x20

    .line 90
    .line 91
    shr-long v4, v13, p2

    .line 92
    .line 93
    long-to-int v4, v4

    .line 94
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v0, v4, v1, v2}, La/i6u0;->a(FJ)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v12, La/zri;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/i6u0;

    .line 104
    .line 105
    const-wide v4, 0xffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    and-long/2addr v13, v4

    .line 111
    long-to-int v6, v13

    .line 112
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v0, v6, v1, v2}, La/i6u0;->a(FJ)V

    .line 117
    .line 118
    .line 119
    move-object/from16 v0, p0

    .line 120
    .line 121
    iget-object v1, v0, La/iu40;->g:La/q99;

    .line 122
    .line 123
    invoke-static {v1}, La/iu40;->g(La/q99;)La/eu40;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_4

    .line 128
    .line 129
    iget-wide v13, v1, La/eu40;->b:J

    .line 130
    .line 131
    move-wide/from16 v16, v4

    .line 132
    .line 133
    iget-wide v4, v1, La/eu40;->a:J

    .line 134
    .line 135
    iget-object v2, v12, La/zri;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, La/i6u0;

    .line 138
    .line 139
    move-object/from16 v18, v12

    .line 140
    .line 141
    shr-long v11, v4, p2

    .line 142
    .line 143
    long-to-int v6, v11

    .line 144
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-virtual {v2, v6, v13, v14}, La/i6u0;->a(FJ)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v11, v18

    .line 152
    .line 153
    iget-object v2, v11, La/zri;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, La/i6u0;

    .line 156
    .line 157
    and-long v4, v4, v16

    .line 158
    .line 159
    long-to-int v4, v4

    .line 160
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    invoke-virtual {v2, v4, v13, v14}, La/i6u0;->a(FJ)V

    .line 165
    .line 166
    .line 167
    iget-object v2, v3, La/mie0;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, La/eu40;

    .line 170
    .line 171
    invoke-virtual {v2, v1}, La/eu40;->a(La/eu40;)La/eu40;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v3, La/mie0;->a:Ljava/lang/Object;

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    move-object v11, v12

    .line 179
    :goto_2
    new-instance v1, La/jie0;

    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    iget-object v2, v3, La/mie0;->a:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, La/eu40;

    .line 187
    .line 188
    iget-wide v4, v2, La/eu40;->a:J

    .line 189
    .line 190
    invoke-virtual {v7, v4, v5}, La/sch0;->f(J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    invoke-virtual {v7, v4, v5}, La/sch0;->h(J)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, v1, La/jie0;->a:F

    .line 199
    .line 200
    invoke-static {v2}, La/k7x;->Q(F)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_5

    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_5
    new-instance v2, La/mie0;

    .line 210
    .line 211
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    const/16 v4, 0x1e

    .line 215
    .line 216
    const/4 v5, 0x0

    .line 217
    invoke-static {v5, v5, v4}, La/x4d0;->d(FFI)La/l73;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    iput-object v4, v2, La/mie0;->a:Ljava/lang/Object;

    .line 222
    .line 223
    new-instance v0, La/gu40;

    .line 224
    .line 225
    const/4 v8, 0x0

    .line 226
    move-object/from16 v5, p0

    .line 227
    .line 228
    move/from16 v4, p3

    .line 229
    .line 230
    move/from16 v6, p4

    .line 231
    .line 232
    invoke-direct/range {v0 .. v8}, La/gu40;-><init>(La/jie0;La/mie0;La/mie0;FLa/iu40;FLa/sch0;La/yje;)V

    .line 233
    .line 234
    .line 235
    iput-object v7, v9, La/fu40;->i:La/sch0;

    .line 236
    .line 237
    iput-object v1, v9, La/fu40;->j:La/jie0;

    .line 238
    .line 239
    iput v6, v9, La/fu40;->k:F

    .line 240
    .line 241
    iput v15, v9, La/fu40;->n:I

    .line 242
    .line 243
    invoke-virtual {v5, v0, v9}, La/d660;->b(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, v10, :cond_6

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_6
    move-object v2, v1

    .line 251
    move v0, v6

    .line 252
    move-object v3, v7

    .line 253
    :goto_3
    iget-object v1, v11, La/zri;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, La/i6u0;

    .line 256
    .line 257
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v4}, La/i6u0;->c(F)F

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    iget-object v6, v11, La/zri;->c:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v6, La/i6u0;

    .line 267
    .line 268
    invoke-virtual {v6, v4}, La/i6u0;->c(F)F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-static {v1, v4}, La/wpm0;->g(FF)J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const-wide/16 v11, 0x0

    .line 277
    .line 278
    cmp-long v1, v6, v11

    .line 279
    .line 280
    if-nez v1, :cond_9

    .line 281
    .line 282
    iget v1, v2, La/jie0;->a:F

    .line 283
    .line 284
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    const/high16 v4, 0x42c80000    # 100.0f

    .line 289
    .line 290
    div-float/2addr v1, v4

    .line 291
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    iget v1, v2, La/jie0;->a:F

    .line 296
    .line 297
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-virtual {v3, v1}, La/sch0;->e(F)F

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    mul-float/2addr v1, v0

    .line 306
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 307
    .line 308
    mul-float/2addr v1, v0

    .line 309
    const/4 v0, 0x0

    .line 310
    cmpg-float v2, v1, v0

    .line 311
    .line 312
    if-nez v2, :cond_7

    .line 313
    .line 314
    move-wide v6, v11

    .line 315
    goto :goto_5

    .line 316
    :cond_7
    iget-object v2, v3, La/sch0;->d:La/ma80;

    .line 317
    .line 318
    sget-object v3, La/ma80;->b:La/ma80;

    .line 319
    .line 320
    if-ne v2, v3, :cond_8

    .line 321
    .line 322
    invoke-static {v1, v0}, La/wpm0;->g(FF)J

    .line 323
    .line 324
    .line 325
    move-result-wide v0

    .line 326
    :goto_4
    move-wide v6, v0

    .line 327
    goto :goto_5

    .line 328
    :cond_8
    invoke-static {v0, v1}, La/wpm0;->g(FF)J

    .line 329
    .line 330
    .line 331
    move-result-wide v0

    .line 332
    goto :goto_4

    .line 333
    :cond_9
    :goto_5
    new-instance v0, La/g6u0;

    .line 334
    .line 335
    invoke-direct {v0, v6, v7}, La/g6u0;-><init>(J)V

    .line 336
    .line 337
    .line 338
    const/4 v1, 0x0

    .line 339
    iput-object v1, v9, La/fu40;->i:La/sch0;

    .line 340
    .line 341
    iput-object v1, v9, La/fu40;->j:La/jie0;

    .line 342
    .line 343
    const/4 v1, 0x2

    .line 344
    iput v1, v9, La/fu40;->n:I

    .line 345
    .line 346
    iget-object v1, v5, La/d660;->b:Lkotlin/jvm/functions/Function2;

    .line 347
    .line 348
    invoke-interface {v1, v0, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v10, :cond_a

    .line 353
    .line 354
    :goto_6
    return-object v10

    .line 355
    :cond_a
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0
.end method

.method public final f(La/woa0;)Z
    .locals 11

    .line 1
    iget-object v0, p0, La/d660;->c:La/w6k;

    .line 2
    .line 3
    iget-object v1, p0, La/iu40;->f:La/do20;

    .line 4
    .line 5
    iget-object v1, v1, La/do20;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/ViewConfiguration;

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/high16 v3, 0x42800000    # 64.0f

    .line 12
    .line 13
    const/16 v4, 0x1a

    .line 14
    .line 15
    if-le v2, v4, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, La/ga3;->l(Landroid/view/ViewConfiguration;)F

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v0, v3}, La/w6k;->w0(F)F

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    :goto_0
    neg-float v5, v5

    .line 27
    if-le v2, v4, :cond_1

    .line 28
    .line 29
    invoke-static {v1}, La/ga3;->h(Landroid/view/ViewConfiguration;)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-interface {v0, v3}, La/w6k;->w0(F)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :goto_1
    neg-float v0, v0

    .line 39
    iget-object v1, p1, La/woa0;->a:Ljava/util/List;

    .line 40
    .line 41
    new-instance v2, La/ne60;

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    invoke-direct {v2, v3, v4}, La/ne60;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    move v6, v4

    .line 54
    :goto_2
    iget-wide v7, v2, La/ne60;->a:J

    .line 55
    .line 56
    if-ge v6, v3, :cond_2

    .line 57
    .line 58
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, La/dpa0;

    .line 63
    .line 64
    iget-wide v9, v2, La/dpa0;->j:J

    .line 65
    .line 66
    invoke-static {v7, v8, v9, v10}, La/ne60;->f(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    new-instance v2, La/ne60;

    .line 71
    .line 72
    invoke-direct {v2, v7, v8}, La/ne60;-><init>(J)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const/16 v1, 0x20

    .line 79
    .line 80
    shr-long v2, v7, v1

    .line 81
    .line 82
    long-to-int v2, v2

    .line 83
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    mul-float/2addr v2, v0

    .line 88
    const-wide v9, 0xffffffffL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    and-long v6, v7, v9

    .line 94
    .line 95
    long-to-int v0, v6

    .line 96
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    mul-float/2addr v0, v5

    .line 101
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    int-to-long v2, v2

    .line 106
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    int-to-long v5, v0

    .line 111
    shl-long v0, v2, v1

    .line 112
    .line 113
    and-long v2, v5, v9

    .line 114
    .line 115
    or-long v6, v0, v2

    .line 116
    .line 117
    iget-object v0, p0, La/d660;->a:La/sch0;

    .line 118
    .line 119
    invoke-virtual {v0, v6, v7}, La/sch0;->f(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    invoke-virtual {v0, v1, v2}, La/sch0;->j(J)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    const/4 v2, 0x0

    .line 128
    cmpg-float v3, v1, v2

    .line 129
    .line 130
    if-nez v3, :cond_3

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    cmpl-float v1, v1, v2

    .line 134
    .line 135
    iget-object v0, v0, La/sch0;->a:La/bch0;

    .line 136
    .line 137
    if-lez v1, :cond_4

    .line 138
    .line 139
    invoke-interface {v0}, La/bch0;->d()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    invoke-interface {v0}, La/bch0;->c()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    :goto_3
    if-eqz v4, :cond_5

    .line 149
    .line 150
    new-instance v5, La/eu40;

    .line 151
    .line 152
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 153
    .line 154
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, La/dpa0;

    .line 159
    .line 160
    iget-wide v9, p1, La/dpa0;->b:J

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    invoke-direct/range {v5 .. v10}, La/eu40;-><init>(JZJ)V

    .line 164
    .line 165
    .line 166
    iget-object p0, p0, La/iu40;->g:La/q99;

    .line 167
    .line 168
    invoke-interface {p0, v5}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    instance-of p0, p0, La/ytb;

    .line 173
    .line 174
    xor-int/lit8 p0, p0, 0x1

    .line 175
    .line 176
    return p0

    .line 177
    :cond_5
    iget-boolean p0, p0, La/d660;->d:Z

    .line 178
    .line 179
    return p0
.end method
