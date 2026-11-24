.class public final La/c5m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/c5m0;->a:La/p7m0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/b5m0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/b5m0;

    .line 11
    .line 12
    iget v3, v2, La/b5m0;->n:I

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
    iput v3, v2, La/b5m0;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/b5m0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/b5m0;-><init>(La/c5m0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/b5m0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/b5m0;->n:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v8, 0x3

    .line 37
    const/4 v9, 0x2

    .line 38
    iget-object v10, v0, La/c5m0;->a:La/p7m0;

    .line 39
    .line 40
    const/4 v11, 0x1

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v11, :cond_3

    .line 44
    .line 45
    if-eq v4, v9, :cond_2

    .line 46
    .line 47
    if-ne v4, v8, :cond_1

    .line 48
    .line 49
    iget-wide v11, v2, La/b5m0;->k:J

    .line 50
    .line 51
    iget-wide v13, v2, La/b5m0;->j:J

    .line 52
    .line 53
    const-wide/16 v15, 0x2710

    .line 54
    .line 55
    iget-wide v6, v2, La/b5m0;->i:J

    .line 56
    .line 57
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move v1, v8

    .line 61
    move-object v8, v5

    .line 62
    move v5, v1

    .line 63
    move-wide/from16 v17, v13

    .line 64
    .line 65
    move-wide v13, v6

    .line 66
    move-wide v6, v11

    .line 67
    move-wide/from16 v11, v17

    .line 68
    .line 69
    move v1, v9

    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    :cond_2
    const-wide/16 v15, 0x2710

    .line 79
    .line 80
    iget-wide v6, v2, La/b5m0;->k:J

    .line 81
    .line 82
    iget-wide v11, v2, La/b5m0;->j:J

    .line 83
    .line 84
    iget-wide v13, v2, La/b5m0;->i:J

    .line 85
    .line 86
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move v1, v9

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const-wide/16 v15, 0x2710

    .line 92
    .line 93
    iget-wide v6, v2, La/b5m0;->k:J

    .line 94
    .line 95
    iget-wide v11, v2, La/b5m0;->j:J

    .line 96
    .line 97
    iget-wide v13, v2, La/b5m0;->i:J

    .line 98
    .line 99
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    const-wide/16 v15, 0x2710

    .line 104
    .line 105
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-boolean v11, v0, La/c5m0;->b:Z

    .line 109
    .line 110
    invoke-static/range {p1 .. p2}, La/znq0;->f(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    sub-long v8, v6, v12

    .line 119
    .line 120
    new-instance v4, La/ynq0;

    .line 121
    .line 122
    invoke-direct {v4, v8, v9}, La/ynq0;-><init>(J)V

    .line 123
    .line 124
    .line 125
    move-wide/from16 v8, p1

    .line 126
    .line 127
    iput-wide v8, v2, La/b5m0;->i:J

    .line 128
    .line 129
    iput-wide v6, v2, La/b5m0;->j:J

    .line 130
    .line 131
    iput-wide v12, v2, La/b5m0;->k:J

    .line 132
    .line 133
    iput v11, v2, La/b5m0;->n:I

    .line 134
    .line 135
    invoke-virtual {v10, v5, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    if-ne v4, v3, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    move-wide/from16 v17, v12

    .line 144
    .line 145
    move-wide v11, v6

    .line 146
    move-wide/from16 v6, v17

    .line 147
    .line 148
    move-wide v13, v8

    .line 149
    :goto_1
    iget-boolean v4, v0, La/c5m0;->b:Z

    .line 150
    .line 151
    if-eqz v4, :cond_a

    .line 152
    .line 153
    invoke-static/range {v15 .. v16}, La/ynq0;->e(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    iput-wide v13, v2, La/b5m0;->i:J

    .line 158
    .line 159
    iput-wide v11, v2, La/b5m0;->j:J

    .line 160
    .line 161
    iput-wide v6, v2, La/b5m0;->k:J

    .line 162
    .line 163
    const/4 v1, 0x2

    .line 164
    iput v1, v2, La/b5m0;->n:I

    .line 165
    .line 166
    invoke-static {v8, v9, v2}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-ne v4, v3, :cond_6

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    :goto_2
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, La/ynq0;

    .line 178
    .line 179
    const-wide/16 v8, 0x0

    .line 180
    .line 181
    move-wide/from16 p1, v6

    .line 182
    .line 183
    if-eqz v4, :cond_7

    .line 184
    .line 185
    iget-wide v5, v4, La/ynq0;->a:J

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    move-wide v5, v8

    .line 189
    :goto_3
    sub-long/2addr v5, v15

    .line 190
    invoke-static {v5, v6, v8, v9}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-lez v4, :cond_9

    .line 195
    .line 196
    new-instance v4, La/ynq0;

    .line 197
    .line 198
    invoke-direct {v4, v5, v6}, La/ynq0;-><init>(J)V

    .line 199
    .line 200
    .line 201
    iput-wide v13, v2, La/b5m0;->i:J

    .line 202
    .line 203
    iput-wide v11, v2, La/b5m0;->j:J

    .line 204
    .line 205
    move-wide/from16 v6, p1

    .line 206
    .line 207
    iput-wide v6, v2, La/b5m0;->k:J

    .line 208
    .line 209
    const/4 v5, 0x3

    .line 210
    iput v5, v2, La/b5m0;->n:I

    .line 211
    .line 212
    const/4 v8, 0x0

    .line 213
    invoke-virtual {v10, v8, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    if-ne v4, v3, :cond_8

    .line 219
    .line 220
    :goto_4
    return-object v3

    .line 221
    :cond_8
    :goto_5
    move-object v5, v8

    .line 222
    goto :goto_1

    .line 223
    :cond_9
    move-wide/from16 v6, p1

    .line 224
    .line 225
    const/4 v5, 0x3

    .line 226
    const/4 v8, 0x0

    .line 227
    const/4 v4, 0x0

    .line 228
    iput-boolean v4, v0, La/c5m0;->b:Z

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0
.end method
