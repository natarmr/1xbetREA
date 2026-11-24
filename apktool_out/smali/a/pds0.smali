.class public final La/pds0;
.super La/d660;
.source "SourceFile"


# instance fields
.field public final f:La/q99;

.field public g:La/c4m0;


# direct methods
.method public constructor <init>(La/sch0;La/jbh0;La/w6k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, La/d660;-><init>(La/sch0;Lkotlin/jvm/functions/Function2;La/w6k;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    const/4 p2, 0x6

    .line 6
    const p3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    invoke-static {p3, p1, p1, p2}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/pds0;->f:La/q99;

    .line 14
    .line 15
    return-void
.end method

.method public static e(La/q99;)La/mds0;
    .locals 2

    .line 1
    new-instance v0, La/du40;

    .line 2
    .line 3
    const/4 v1, 0x1

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
    check-cast v0, La/mds0;

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
    invoke-virtual {v1, v0}, La/mds0;->a(La/mds0;)La/mds0;

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
.method public final c(La/sch0;La/mds0;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, La/nds0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/nds0;

    .line 13
    .line 14
    iget v4, v3, La/nds0;->k:I

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
    iput v4, v3, La/nds0;->k:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/nds0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/nds0;-><init>(La/pds0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/nds0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/nds0;->k:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    iget-object v7, v0, La/d660;->e:La/zri;

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    if-eq v5, v9, :cond_2

    .line 45
    .line 46
    if-ne v5, v8, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {v2}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iput-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    iget-wide v10, v1, La/mds0;->b:J

    .line 70
    .line 71
    iget-wide v12, v1, La/mds0;->a:J

    .line 72
    .line 73
    iget-object v1, v7, La/zri;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, La/i6u0;

    .line 76
    .line 77
    const/16 v5, 0x20

    .line 78
    .line 79
    shr-long v14, v12, v5

    .line 80
    .line 81
    long-to-int v14, v14

    .line 82
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    invoke-virtual {v1, v14, v10, v11}, La/i6u0;->a(FJ)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v7, La/zri;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, La/i6u0;

    .line 92
    .line 93
    const-wide v14, 0xffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long/2addr v12, v14

    .line 99
    long-to-int v12, v12

    .line 100
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    invoke-virtual {v1, v12, v10, v11}, La/i6u0;->a(FJ)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v0, La/pds0;->f:La/q99;

    .line 108
    .line 109
    invoke-static {v1}, La/pds0;->e(La/q99;)La/mds0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget-wide v10, v1, La/mds0;->b:J

    .line 116
    .line 117
    iget-wide v12, v1, La/mds0;->a:J

    .line 118
    .line 119
    move/from16 p2, v5

    .line 120
    .line 121
    iget-object v5, v7, La/zri;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, La/i6u0;

    .line 124
    .line 125
    move-wide/from16 v16, v14

    .line 126
    .line 127
    shr-long v14, v12, p2

    .line 128
    .line 129
    long-to-int v14, v14

    .line 130
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    invoke-virtual {v5, v14, v10, v11}, La/i6u0;->a(FJ)V

    .line 135
    .line 136
    .line 137
    iget-object v5, v7, La/zri;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, La/i6u0;

    .line 140
    .line 141
    and-long v12, v12, v16

    .line 142
    .line 143
    long-to-int v12, v12

    .line 144
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    invoke-virtual {v5, v12, v10, v11}, La/i6u0;->a(FJ)V

    .line 149
    .line 150
    .line 151
    iget-object v5, v2, La/mie0;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v5, La/mds0;

    .line 154
    .line 155
    invoke-virtual {v5, v1}, La/mds0;->a(La/mds0;)La/mds0;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iput-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 160
    .line 161
    :cond_4
    new-instance v1, La/ods0;

    .line 162
    .line 163
    move-object/from16 v5, p1

    .line 164
    .line 165
    invoke-direct {v1, v0, v5, v2, v6}, La/ods0;-><init>(La/pds0;La/sch0;La/mie0;La/yje;)V

    .line 166
    .line 167
    .line 168
    iput v9, v3, La/nds0;->k:I

    .line 169
    .line 170
    invoke-virtual {v0, v1, v3}, La/d660;->b(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-ne v1, v4, :cond_5

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    :goto_1
    iget-object v1, v7, La/zri;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, La/i6u0;

    .line 180
    .line 181
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, La/i6u0;->c(F)F

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    iget-object v5, v7, La/zri;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, La/i6u0;

    .line 191
    .line 192
    invoke-virtual {v5, v2}, La/i6u0;->c(F)F

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {v1, v2}, La/wpm0;->g(FF)J

    .line 197
    .line 198
    .line 199
    move-result-wide v1

    .line 200
    new-instance v5, La/g6u0;

    .line 201
    .line 202
    invoke-direct {v5, v1, v2}, La/g6u0;-><init>(J)V

    .line 203
    .line 204
    .line 205
    iput v8, v3, La/nds0;->k:I

    .line 206
    .line 207
    iget-object v0, v0, La/d660;->b:Lkotlin/jvm/functions/Function2;

    .line 208
    .line 209
    invoke-interface {v0, v5, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v4, :cond_6

    .line 214
    .line 215
    :goto_2
    return-object v4

    .line 216
    :cond_6
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0
.end method

.method public final d(La/woa0;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/woa0;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, La/dpa0;

    .line 12
    .line 13
    if-eqz v2, :cond_9

    .line 14
    .line 15
    invoke-virtual {v2}, La/dpa0;->b()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    :goto_0
    const/4 v9, 0x0

    .line 26
    iget-object v10, v0, La/pds0;->f:La/q99;

    .line 27
    .line 28
    iget-object v11, v0, La/d660;->a:La/sch0;

    .line 29
    .line 30
    const-wide v12, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    if-ge v7, v6, :cond_4

    .line 36
    .line 37
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v14

    .line 41
    check-cast v14, La/ayv;

    .line 42
    .line 43
    const/4 v15, 0x1

    .line 44
    const/16 v16, 0x0

    .line 45
    .line 46
    iget-wide v3, v14, La/ayv;->d:J

    .line 47
    .line 48
    xor-long/2addr v3, v12

    .line 49
    invoke-virtual {v11, v3, v4}, La/sch0;->f(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v12

    .line 53
    invoke-virtual {v11, v12, v13}, La/sch0;->j(J)F

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    cmpg-float v9, v11, v9

    .line 58
    .line 59
    if-nez v9, :cond_0

    .line 60
    .line 61
    move v9, v15

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    move/from16 v9, v16

    .line 64
    .line 65
    :goto_1
    if-nez v9, :cond_3

    .line 66
    .line 67
    new-instance v17, La/mds0;

    .line 68
    .line 69
    iget-wide v11, v14, La/ayv;->a:J

    .line 70
    .line 71
    const/16 v20, 0x0

    .line 72
    .line 73
    move-wide/from16 v18, v3

    .line 74
    .line 75
    move-wide/from16 v21, v11

    .line 76
    .line 77
    invoke-direct/range {v17 .. v22}, La/mds0;-><init>(JZJ)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v3, v17

    .line 81
    .line 82
    invoke-interface {v10, v3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    instance-of v3, v3, La/ytb;

    .line 87
    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_1
    move/from16 v8, v16

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_2
    :goto_2
    move v8, v15

    .line 97
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const/4 v15, 0x1

    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    iget-wide v3, v2, La/dpa0;->l:J

    .line 104
    .line 105
    xor-long/2addr v3, v12

    .line 106
    iget v1, v1, La/woa0;->f:I

    .line 107
    .line 108
    const/16 v5, 0xc

    .line 109
    .line 110
    if-ne v1, v5, :cond_5

    .line 111
    .line 112
    move/from16 v20, v15

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    move/from16 v20, v16

    .line 116
    .line 117
    :goto_4
    invoke-virtual {v11, v3, v4}, La/sch0;->f(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    invoke-virtual {v11, v5, v6}, La/sch0;->j(J)F

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    cmpg-float v1, v1, v9

    .line 126
    .line 127
    if-nez v1, :cond_6

    .line 128
    .line 129
    move v1, v15

    .line 130
    goto :goto_5

    .line 131
    :cond_6
    move/from16 v1, v16

    .line 132
    .line 133
    :goto_5
    if-eqz v1, :cond_7

    .line 134
    .line 135
    if-eqz v20, :cond_b

    .line 136
    .line 137
    :cond_7
    new-instance v17, La/mds0;

    .line 138
    .line 139
    iget-wide v1, v2, La/dpa0;->b:J

    .line 140
    .line 141
    move-wide/from16 v21, v1

    .line 142
    .line 143
    move-wide/from16 v18, v3

    .line 144
    .line 145
    invoke-direct/range {v17 .. v22}, La/mds0;-><init>(JZJ)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v1, v17

    .line 149
    .line 150
    invoke-interface {v10, v1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    instance-of v1, v1, La/ytb;

    .line 155
    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    if-eqz v8, :cond_a

    .line 159
    .line 160
    :cond_8
    move v8, v15

    .line 161
    goto :goto_6

    .line 162
    :cond_9
    const/4 v15, 0x1

    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    :cond_a
    move/from16 v8, v16

    .line 166
    .line 167
    :cond_b
    :goto_6
    if-nez v8, :cond_d

    .line 168
    .line 169
    iget-boolean v0, v0, La/d660;->d:Z

    .line 170
    .line 171
    if-eqz v0, :cond_c

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_c
    return v16

    .line 175
    :cond_d
    :goto_7
    return v15
.end method
