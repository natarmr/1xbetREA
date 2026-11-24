.class public final La/w9t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/t9t;

.field public final b:La/btt0;


# direct methods
.method public constructor <init>(La/t9t;La/btt0;)V
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
    iput-object p1, p0, La/w9t;->a:La/t9t;

    .line 8
    .line 9
    iput-object p2, p0, La/w9t;->b:La/btt0;

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
    instance-of v2, v1, La/u9t;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/u9t;

    .line 11
    .line 12
    iget v3, v2, La/u9t;->k:I

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
    iput v3, v2, La/u9t;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/u9t;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/u9t;-><init>(La/w9t;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/u9t;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/u9t;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/w9t;->b:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v4, La/d9t;

    .line 61
    .line 62
    move-wide/from16 v7, p1

    .line 63
    .line 64
    invoke-direct {v4, v7, v8}, La/d9t;-><init>(J)V

    .line 65
    .line 66
    .line 67
    iput v6, v2, La/u9t;->k:I

    .line 68
    .line 69
    iget-object v0, v0, La/w9t;->a:La/t9t;

    .line 70
    .line 71
    iget-object v0, v0, La/t9t;->b:La/jcs;

    .line 72
    .line 73
    invoke-virtual {v0}, La/jcs;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/d7t;

    .line 78
    .line 79
    invoke-interface {v0, v1, v4, v2}, La/d7t;->a(Ljava/lang/String;La/d9t;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v3, :cond_3

    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_3
    :goto_1
    check-cast v1, La/nz5;

    .line 87
    .line 88
    invoke-virtual {v1}, La/nz5;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/z9t;

    .line 99
    .line 100
    if-eqz v0, :cond_e

    .line 101
    .line 102
    iget-object v1, v0, La/z9t;->a:Ljava/lang/Integer;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    move v7, v1

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    move v7, v2

    .line 114
    :goto_2
    iget-object v1, v0, La/z9t;->b:Ljava/util/List;

    .line 115
    .line 116
    if-nez v1, :cond_5

    .line 117
    .line 118
    sget-object v1, La/iun;->a:La/iun;

    .line 119
    .line 120
    :cond_5
    move-object v8, v1

    .line 121
    iget-object v1, v0, La/z9t;->d:Ljava/lang/Integer;

    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    move v9, v1

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move v9, v2

    .line 132
    :goto_3
    iget-object v10, v0, La/z9t;->f:Ljava/util/List;

    .line 133
    .line 134
    if-eqz v10, :cond_d

    .line 135
    .line 136
    iget-object v0, v0, La/z9t;->h:La/l9t;

    .line 137
    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    iget-object v11, v0, La/l9t;->a:Ljava/util/List;

    .line 141
    .line 142
    if-eqz v11, :cond_c

    .line 143
    .line 144
    iget-object v0, v0, La/l9t;->b:Ljava/util/List;

    .line 145
    .line 146
    if-eqz v0, :cond_b

    .line 147
    .line 148
    new-instance v12, Ljava/util/ArrayList;

    .line 149
    .line 150
    const/16 v1, 0xa

    .line 151
    .line 152
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, La/h7t;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v13, La/e7t;

    .line 179
    .line 180
    iget-object v3, v1, La/h7t;->f:Ljava/lang/Double;

    .line 181
    .line 182
    const-wide/16 v4, 0x0

    .line 183
    .line 184
    if-eqz v3, :cond_7

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 187
    .line 188
    .line 189
    move-result-wide v14

    .line 190
    goto :goto_5

    .line 191
    :cond_7
    move-wide v14, v4

    .line 192
    :goto_5
    iget-object v3, v1, La/h7t;->e:Ljava/lang/Double;

    .line 193
    .line 194
    if-eqz v3, :cond_8

    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 197
    .line 198
    .line 199
    move-result-wide v4

    .line 200
    :cond_8
    move-wide/from16 v16, v4

    .line 201
    .line 202
    iget-object v1, v1, La/h7t;->c:Ljava/lang/Integer;

    .line 203
    .line 204
    if-eqz v1, :cond_9

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    move/from16 v18, v1

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_9
    move/from16 v18, v2

    .line 214
    .line 215
    :goto_6
    invoke-direct/range {v13 .. v18}, La/e7t;-><init>(DDI)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_a
    new-instance v6, La/k7t;

    .line 223
    .line 224
    invoke-direct/range {v6 .. v12}, La/k7t;-><init>(ILjava/util/List;ILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 225
    .line 226
    .line 227
    return-object v6

    .line 228
    :cond_b
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-object v5

    .line 232
    :cond_c
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object v5

    .line 236
    :cond_d
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-object v5

    .line 240
    :cond_e
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-object v5
.end method

.method public final b(DJLa/zje;La/csr;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, La/v9t;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/v9t;

    .line 11
    .line 12
    iget v3, v2, La/v9t;->k:I

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
    iput v3, v2, La/v9t;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/v9t;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/v9t;-><init>(La/w9t;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/v9t;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/v9t;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/w9t;->b:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v4, Ljava/lang/Double;

    .line 61
    .line 62
    move-wide/from16 v7, p1

    .line 63
    .line 64
    invoke-direct {v4, v7, v8}, Ljava/lang/Double;-><init>(D)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v7, p6

    .line 68
    .line 69
    iget-object v7, v7, La/csr;->a:La/bsr;

    .line 70
    .line 71
    iget-object v7, v7, La/bsr;->a:La/esr;

    .line 72
    .line 73
    invoke-virtual {v7}, La/esr;->a()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-nez v7, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v4, v5

    .line 81
    :goto_1
    new-instance v7, La/r9t;

    .line 82
    .line 83
    move-wide/from16 v8, p3

    .line 84
    .line 85
    invoke-direct {v7, v8, v9, v4}, La/r9t;-><init>(JLjava/lang/Double;)V

    .line 86
    .line 87
    .line 88
    iput v6, v2, La/v9t;->k:I

    .line 89
    .line 90
    iget-object v0, v0, La/w9t;->a:La/t9t;

    .line 91
    .line 92
    iget-object v0, v0, La/t9t;->b:La/jcs;

    .line 93
    .line 94
    invoke-virtual {v0}, La/jcs;->invoke()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/d7t;

    .line 99
    .line 100
    invoke-interface {v0, v1, v7, v2}, La/d7t;->b(Ljava/lang/String;La/r9t;La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-ne v1, v3, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    :goto_2
    check-cast v1, La/nz5;

    .line 108
    .line 109
    invoke-virtual {v1}, La/nz5;->a()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/r7t;

    .line 114
    .line 115
    iget-object v1, v0, La/r7t;->c:Ljava/lang/Double;

    .line 116
    .line 117
    iget-object v2, v0, La/r7t;->f:La/cat;

    .line 118
    .line 119
    const-wide/16 v3, 0x0

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    move-wide v9, v6

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move-wide v9, v3

    .line 130
    :goto_3
    iget-object v1, v0, La/r7t;->d:La/h9t;

    .line 131
    .line 132
    if-eqz v1, :cond_a

    .line 133
    .line 134
    new-instance v6, La/e9t;

    .line 135
    .line 136
    iget-object v7, v1, La/h9t;->a:Ljava/lang/String;

    .line 137
    .line 138
    const-string v8, ""

    .line 139
    .line 140
    if-nez v7, :cond_6

    .line 141
    .line 142
    move-object v7, v8

    .line 143
    :cond_6
    iget-object v11, v1, La/h9t;->b:Ljava/lang/String;

    .line 144
    .line 145
    if-nez v11, :cond_7

    .line 146
    .line 147
    move-object v11, v8

    .line 148
    :cond_7
    iget-object v12, v1, La/h9t;->c:Ljava/lang/String;

    .line 149
    .line 150
    if-nez v12, :cond_8

    .line 151
    .line 152
    move-object v12, v8

    .line 153
    :cond_8
    iget-object v1, v1, La/h9t;->d:Ljava/lang/String;

    .line 154
    .line 155
    if-nez v1, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    move-object v8, v1

    .line 159
    :goto_4
    invoke-direct {v6, v7, v11, v12, v8}, La/e9t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_5
    move-object v11, v6

    .line 163
    goto :goto_6

    .line 164
    :cond_a
    sget-object v6, La/e9t;->e:La/e9t;

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :goto_6
    iget-object v1, v0, La/r7t;->e:Ljava/lang/Double;

    .line 168
    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    move-wide v12, v6

    .line 176
    goto :goto_7

    .line 177
    :cond_b
    move-wide v12, v3

    .line 178
    :goto_7
    if-eqz v2, :cond_c

    .line 179
    .line 180
    iget-object v1, v2, La/cat;->a:Ljava/lang/Double;

    .line 181
    .line 182
    if-eqz v1, :cond_c

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    move-wide v14, v6

    .line 189
    goto :goto_8

    .line 190
    :cond_c
    move-wide v14, v3

    .line 191
    :goto_8
    if-eqz v2, :cond_1a

    .line 192
    .line 193
    iget-object v1, v2, La/cat;->b:Ljava/util/List;

    .line 194
    .line 195
    if-eqz v1, :cond_1a

    .line 196
    .line 197
    new-instance v2, Ljava/util/ArrayList;

    .line 198
    .line 199
    const/16 v6, 0xa

    .line 200
    .line 201
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_17

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    check-cast v6, La/z9t;

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v16, La/n9t;

    .line 228
    .line 229
    iget-object v7, v6, La/z9t;->a:Ljava/lang/Integer;

    .line 230
    .line 231
    const/4 v8, 0x0

    .line 232
    if-eqz v7, :cond_d

    .line 233
    .line 234
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    move/from16 v17, v7

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_d
    move/from16 v17, v8

    .line 242
    .line 243
    :goto_a
    iget-object v7, v6, La/z9t;->b:Ljava/util/List;

    .line 244
    .line 245
    if-nez v7, :cond_e

    .line 246
    .line 247
    sget-object v7, La/iun;->a:La/iun;

    .line 248
    .line 249
    :cond_e
    move-object/from16 v18, v7

    .line 250
    .line 251
    iget-object v7, v6, La/z9t;->c:Ljava/lang/Integer;

    .line 252
    .line 253
    if-eqz v7, :cond_f

    .line 254
    .line 255
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    move/from16 v19, v7

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_f
    move/from16 v19, v8

    .line 263
    .line 264
    :goto_b
    iget-object v7, v6, La/z9t;->d:Ljava/lang/Integer;

    .line 265
    .line 266
    if-eqz v7, :cond_10

    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    move/from16 v20, v7

    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_10
    move/from16 v20, v8

    .line 276
    .line 277
    :goto_c
    iget-object v7, v6, La/z9t;->e:Ljava/lang/Boolean;

    .line 278
    .line 279
    if-eqz v7, :cond_11

    .line 280
    .line 281
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    move/from16 v21, v7

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_11
    move/from16 v21, v8

    .line 289
    .line 290
    :goto_d
    iget-object v7, v6, La/z9t;->f:Ljava/util/List;

    .line 291
    .line 292
    if-nez v7, :cond_12

    .line 293
    .line 294
    sget-object v7, La/iun;->a:La/iun;

    .line 295
    .line 296
    :cond_12
    move-object/from16 v22, v7

    .line 297
    .line 298
    iget-object v7, v6, La/z9t;->g:Ljava/lang/Boolean;

    .line 299
    .line 300
    if-eqz v7, :cond_13

    .line 301
    .line 302
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    :cond_13
    move/from16 v23, v8

    .line 307
    .line 308
    iget-object v7, v6, La/z9t;->h:La/l9t;

    .line 309
    .line 310
    if-eqz v7, :cond_16

    .line 311
    .line 312
    invoke-static {v7}, La/kbc;->h0(La/l9t;)La/i9t;

    .line 313
    .line 314
    .line 315
    move-result-object v24

    .line 316
    iget-object v7, v6, La/z9t;->i:La/l9t;

    .line 317
    .line 318
    if-eqz v7, :cond_14

    .line 319
    .line 320
    invoke-static {v7}, La/kbc;->h0(La/l9t;)La/i9t;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    :goto_e
    move-object/from16 v25, v7

    .line 325
    .line 326
    goto :goto_f

    .line 327
    :cond_14
    sget-object v7, La/i9t;->c:La/i9t;

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :goto_f
    iget-object v6, v6, La/z9t;->j:La/l9t;

    .line 331
    .line 332
    if-eqz v6, :cond_15

    .line 333
    .line 334
    invoke-static {v6}, La/kbc;->h0(La/l9t;)La/i9t;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    :goto_10
    move-object/from16 v26, v6

    .line 339
    .line 340
    goto :goto_11

    .line 341
    :cond_15
    sget-object v6, La/i9t;->c:La/i9t;

    .line 342
    .line 343
    goto :goto_10

    .line 344
    :goto_11
    invoke-direct/range {v16 .. v26}, La/n9t;-><init>(ILjava/util/List;IIZLjava/util/List;ZLa/i9t;La/i9t;La/i9t;)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v6, v16

    .line 348
    .line 349
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto/16 :goto_9

    .line 353
    .line 354
    :cond_16
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-object v5

    .line 358
    :cond_17
    iget-object v1, v0, La/r7t;->b:Ljava/lang/Double;

    .line 359
    .line 360
    if-eqz v1, :cond_18

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 363
    .line 364
    .line 365
    move-result-wide v3

    .line 366
    :cond_18
    move-wide/from16 v17, v3

    .line 367
    .line 368
    iget-object v0, v0, La/r7t;->a:Ljava/lang/Long;

    .line 369
    .line 370
    if-eqz v0, :cond_19

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 373
    .line 374
    .line 375
    move-result-wide v0

    .line 376
    :goto_12
    move-wide/from16 v19, v0

    .line 377
    .line 378
    goto :goto_13

    .line 379
    :cond_19
    const-wide/16 v0, 0x0

    .line 380
    .line 381
    goto :goto_12

    .line 382
    :goto_13
    new-instance v8, La/s9t;

    .line 383
    .line 384
    move-object/from16 v16, v2

    .line 385
    .line 386
    invoke-direct/range {v8 .. v20}, La/s9t;-><init>(DLa/e9t;DDLjava/util/List;DJ)V

    .line 387
    .line 388
    .line 389
    return-object v8

    .line 390
    :cond_1a
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-object v5
.end method
