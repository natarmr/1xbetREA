.class public final La/ls;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/svu;


# direct methods
.method public synthetic constructor <init>(La/svu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ls;->a:La/svu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLa/zje;Z)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v1, La/pgl0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, La/pgl0;

    .line 13
    .line 14
    iget v4, v3, La/pgl0;->o:I

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
    iput v4, v3, La/pgl0;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/pgl0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v1}, La/pgl0;-><init>(La/ls;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v3, La/pgl0;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/pgl0;->o:I

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    iget-object v0, v0, La/ls;->a:La/svu;

    .line 42
    .line 43
    const/4 v10, 0x4

    .line 44
    if-eqz v5, :cond_5

    .line 45
    .line 46
    if-eq v5, v8, :cond_4

    .line 47
    .line 48
    if-eq v5, v7, :cond_3

    .line 49
    .line 50
    if-eq v5, v6, :cond_2

    .line 51
    .line 52
    if-ne v5, v10, :cond_1

    .line 53
    .line 54
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    return-object v0

    .line 66
    :cond_2
    iget-wide v5, v3, La/pgl0;->k:J

    .line 67
    .line 68
    iget v2, v3, La/pgl0;->l:I

    .line 69
    .line 70
    iget-wide v7, v3, La/pgl0;->j:J

    .line 71
    .line 72
    iget-boolean v11, v3, La/pgl0;->i:Z

    .line 73
    .line 74
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    iget v2, v3, La/pgl0;->l:I

    .line 80
    .line 81
    iget-wide v7, v3, La/pgl0;->j:J

    .line 82
    .line 83
    iget-boolean v5, v3, La/pgl0;->i:Z

    .line 84
    .line 85
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move v11, v5

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    iget v2, v3, La/pgl0;->l:I

    .line 91
    .line 92
    iget-wide v11, v3, La/pgl0;->j:J

    .line 93
    .line 94
    iget-boolean v5, v3, La/pgl0;->i:Z

    .line 95
    .line 96
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move v1, v2

    .line 100
    move v2, v5

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/txy;->a:La/txy;

    .line 106
    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    move v12, v10

    .line 110
    goto :goto_1

    .line 111
    :cond_6
    move v12, v9

    .line 112
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide v15

    .line 116
    iput-boolean v2, v3, La/pgl0;->i:Z

    .line 117
    .line 118
    move-wide/from16 v13, p1

    .line 119
    .line 120
    iput-wide v13, v3, La/pgl0;->j:J

    .line 121
    .line 122
    iput v12, v3, La/pgl0;->l:I

    .line 123
    .line 124
    iput v8, v3, La/pgl0;->o:I

    .line 125
    .line 126
    iget-object v1, v0, La/svu;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, La/jxy;

    .line 129
    .line 130
    new-instance v11, La/hxy;

    .line 131
    .line 132
    invoke-direct/range {v11 .. v16}, La/hxy;-><init>(IJJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v3, v11}, La/jxy;->a(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-ne v1, v4, :cond_7

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    :goto_2
    if-ne v1, v4, :cond_8

    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_8
    move v1, v12

    .line 148
    move-wide/from16 v11, p1

    .line 149
    .line 150
    :goto_3
    sget-object v5, La/txy;->a:La/txy;

    .line 151
    .line 152
    iput-boolean v2, v3, La/pgl0;->i:Z

    .line 153
    .line 154
    iput-wide v11, v3, La/pgl0;->j:J

    .line 155
    .line 156
    iput v1, v3, La/pgl0;->l:I

    .line 157
    .line 158
    iput v7, v3, La/pgl0;->o:I

    .line 159
    .line 160
    invoke-virtual {v0, v10, v3}, La/svu;->b(ILa/zje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    if-ne v5, v4, :cond_9

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_9
    move-wide v7, v11

    .line 168
    move v11, v2

    .line 169
    move v2, v1

    .line 170
    move-object v1, v5

    .line 171
    :goto_4
    check-cast v1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v12

    .line 177
    sget-object v1, La/txy;->a:La/txy;

    .line 178
    .line 179
    iput-boolean v11, v3, La/pgl0;->i:Z

    .line 180
    .line 181
    iput-wide v7, v3, La/pgl0;->j:J

    .line 182
    .line 183
    iput v2, v3, La/pgl0;->l:I

    .line 184
    .line 185
    iput-wide v12, v3, La/pgl0;->k:J

    .line 186
    .line 187
    iput v6, v3, La/pgl0;->o:I

    .line 188
    .line 189
    invoke-virtual {v0, v9, v3}, La/svu;->b(ILa/zje;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-ne v1, v4, :cond_a

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_a
    move-wide v5, v12

    .line 197
    :goto_5
    check-cast v1, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v12

    .line 203
    add-long v14, v5, v12

    .line 204
    .line 205
    const-wide/16 v16, 0x32

    .line 206
    .line 207
    cmp-long v1, v14, v16

    .line 208
    .line 209
    if-lez v1, :cond_d

    .line 210
    .line 211
    cmp-long v1, v12, v5

    .line 212
    .line 213
    if-lez v1, :cond_b

    .line 214
    .line 215
    sget-object v1, La/txy;->a:La/txy;

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    sget-object v1, La/txy;->a:La/txy;

    .line 219
    .line 220
    move v9, v10

    .line 221
    :goto_6
    iput-boolean v11, v3, La/pgl0;->i:Z

    .line 222
    .line 223
    iput-wide v7, v3, La/pgl0;->j:J

    .line 224
    .line 225
    iput v2, v3, La/pgl0;->l:I

    .line 226
    .line 227
    iput-wide v5, v3, La/pgl0;->k:J

    .line 228
    .line 229
    iput v10, v3, La/pgl0;->o:I

    .line 230
    .line 231
    invoke-virtual {v0, v9, v3}, La/svu;->d(ILa/zje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-ne v0, v4, :cond_c

    .line 236
    .line 237
    :goto_7
    return-object v4

    .line 238
    :cond_c
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0
.end method

.method public b(JLa/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, La/ks;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/ks;

    .line 7
    .line 8
    iget v1, v0, La/ks;->l:I

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
    iput v1, v0, La/ks;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ks;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/ks;-><init>(La/ls;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/ks;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ks;->l:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x1

    .line 33
    iget-object p0, p0, La/ls;->a:La/svu;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_5

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    iget-wide p1, v0, La/ks;->i:J

    .line 56
    .line 57
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    iget-wide p1, v0, La/ks;->i:J

    .line 62
    .line 63
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p3, La/txy;->a:La/txy;

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v10

    .line 76
    iput-wide p1, v0, La/ks;->i:J

    .line 77
    .line 78
    iput v4, v0, La/ks;->l:I

    .line 79
    .line 80
    iget-object p3, p0, La/svu;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p3, La/jxy;

    .line 83
    .line 84
    new-instance v6, La/hxy;

    .line 85
    .line 86
    const/4 v7, 0x2

    .line 87
    move-wide v8, p1

    .line 88
    invoke-direct/range {v6 .. v11}, La/hxy;-><init>(IJJ)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, v0, v6}, La/jxy;->a(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v1, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_1
    if-ne p1, v1, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move-wide p1, v8

    .line 104
    :goto_2
    sget-object p3, La/txy;->a:La/txy;

    .line 105
    .line 106
    iput-wide p1, v0, La/ks;->i:J

    .line 107
    .line 108
    iput v5, v0, La/ks;->l:I

    .line 109
    .line 110
    invoke-virtual {p0, v5, v0}, La/svu;->b(ILa/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    if-ne p3, v1, :cond_7

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    :goto_3
    check-cast p3, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    const-wide/16 v8, 0x32

    .line 124
    .line 125
    cmp-long p3, v6, v8

    .line 126
    .line 127
    if-lez p3, :cond_9

    .line 128
    .line 129
    sget-object p3, La/txy;->a:La/txy;

    .line 130
    .line 131
    iput-wide p1, v0, La/ks;->i:J

    .line 132
    .line 133
    iput v3, v0, La/ks;->l:I

    .line 134
    .line 135
    invoke-virtual {p0, v5, v0}, La/svu;->d(ILa/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v1, :cond_8

    .line 140
    .line 141
    :goto_4
    return-object v1

    .line 142
    :cond_8
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0
.end method
