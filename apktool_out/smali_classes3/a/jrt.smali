.class public final La/jrt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g2v;

.field public final b:La/ot;

.field public final c:La/khf0;

.field public final d:La/bsu;

.field public final e:La/urt;

.field public final f:La/nrt;


# direct methods
.method public synthetic constructor <init>(La/g2v;La/ot;La/khf0;La/bsu;La/urt;La/nrt;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jrt;->a:La/g2v;

    iput-object p2, p0, La/jrt;->b:La/ot;

    iput-object p3, p0, La/jrt;->c:La/khf0;

    iput-object p4, p0, La/jrt;->d:La/bsu;

    iput-object p5, p0, La/jrt;->e:La/urt;

    iput-object p6, p0, La/jrt;->f:La/nrt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLa/zje;)Ljava/io/Serializable;
    .locals 12

    .line 1
    instance-of v0, p3, La/wru;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/wru;

    .line 7
    .line 8
    iget v1, v0, La/wru;->p:I

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
    iput v1, v0, La/wru;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wru;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/wru;-><init>(La/jrt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/wru;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wru;->p:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v6, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, La/wru;->k:La/ql5;

    .line 47
    .line 48
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    iget-boolean p1, v0, La/wru;->j:Z

    .line 60
    .line 61
    iget-wide v4, v0, La/wru;->i:J

    .line 62
    .line 63
    iget-object p2, v0, La/wru;->m:La/bm5;

    .line 64
    .line 65
    iget-object v2, v0, La/wru;->l:La/bsu;

    .line 66
    .line 67
    iget-object v6, v0, La/wru;->k:La/ql5;

    .line 68
    .line 69
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v10, v2

    .line 73
    move v2, p1

    .line 74
    move-object p1, v6

    .line 75
    move-object v6, v10

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    iget-boolean p1, v0, La/wru;->j:Z

    .line 83
    .line 84
    iget-wide v8, v0, La/wru;->i:J

    .line 85
    .line 86
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move v2, p1

    .line 90
    move-wide p1, v8

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object p3, La/bm5;->c:La/bm5;

    .line 96
    .line 97
    iget-object v2, p0, La/jrt;->a:La/g2v;

    .line 98
    .line 99
    invoke-virtual {v2, p3}, La/g2v;->i(La/bm5;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iput-wide p1, v0, La/wru;->i:J

    .line 104
    .line 105
    iput-boolean v2, v0, La/wru;->j:Z

    .line 106
    .line 107
    iput v6, v0, La/wru;->p:I

    .line 108
    .line 109
    iget-object v6, p0, La/jrt;->c:La/khf0;

    .line 110
    .line 111
    invoke-static {v6, p3, v0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-ne p3, v1, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    :goto_1
    check-cast p3, La/ql5;

    .line 119
    .line 120
    const-wide/16 v8, 0x0

    .line 121
    .line 122
    cmp-long v6, p1, v8

    .line 123
    .line 124
    if-eqz v6, :cond_8

    .line 125
    .line 126
    iput-object v7, v0, La/wru;->k:La/ql5;

    .line 127
    .line 128
    iput-wide p1, v0, La/wru;->i:J

    .line 129
    .line 130
    iput-boolean v2, v0, La/wru;->j:Z

    .line 131
    .line 132
    iput v5, v0, La/wru;->p:I

    .line 133
    .line 134
    iget-object p3, p0, La/jrt;->f:La/nrt;

    .line 135
    .line 136
    invoke-static {p3, p1, p2, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    if-ne p3, v1, :cond_7

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    :goto_2
    check-cast p3, La/ql5;

    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_8
    if-eqz v2, :cond_e

    .line 148
    .line 149
    sget-object v5, La/bm5;->c:La/bm5;

    .line 150
    .line 151
    iput-object p3, v0, La/wru;->k:La/ql5;

    .line 152
    .line 153
    iget-object v6, p0, La/jrt;->d:La/bsu;

    .line 154
    .line 155
    iput-object v6, v0, La/wru;->l:La/bsu;

    .line 156
    .line 157
    iput-object v5, v0, La/wru;->m:La/bm5;

    .line 158
    .line 159
    iput-wide p1, v0, La/wru;->i:J

    .line 160
    .line 161
    iput-boolean v2, v0, La/wru;->j:Z

    .line 162
    .line 163
    iput v4, v0, La/wru;->p:I

    .line 164
    .line 165
    iget-object v4, p0, La/jrt;->e:La/urt;

    .line 166
    .line 167
    invoke-static {v4, v0}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-ne v4, v1, :cond_9

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_9
    move-wide v10, p1

    .line 175
    move-object p1, p3

    .line 176
    move-object p3, v4

    .line 177
    move-object p2, v5

    .line 178
    move-wide v4, v10

    .line 179
    :goto_3
    check-cast p3, Ljava/util/List;

    .line 180
    .line 181
    iput-object p1, v0, La/wru;->k:La/ql5;

    .line 182
    .line 183
    iput-object v7, v0, La/wru;->l:La/bsu;

    .line 184
    .line 185
    iput-object v7, v0, La/wru;->m:La/bm5;

    .line 186
    .line 187
    iput-wide v4, v0, La/wru;->i:J

    .line 188
    .line 189
    iput-boolean v2, v0, La/wru;->j:Z

    .line 190
    .line 191
    iput v3, v0, La/wru;->p:I

    .line 192
    .line 193
    invoke-static {v6, p2, p3, v0}, La/bsu;->b(La/bsu;La/bm5;Ljava/util/List;La/zje;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    if-ne p3, v1, :cond_a

    .line 198
    .line 199
    :goto_4
    return-object v1

    .line 200
    :cond_a
    :goto_5
    check-cast p3, Ljava/util/List;

    .line 201
    .line 202
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    :cond_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_c

    .line 211
    .line 212
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    move-object v1, v0

    .line 217
    check-cast v1, La/ql5;

    .line 218
    .line 219
    iget-wide v1, v1, La/ql5;->a:J

    .line 220
    .line 221
    iget-wide v3, p1, La/ql5;->a:J

    .line 222
    .line 223
    cmp-long v1, v1, v3

    .line 224
    .line 225
    if-nez v1, :cond_b

    .line 226
    .line 227
    move-object v7, v0

    .line 228
    :cond_c
    move-object p2, v7

    .line 229
    check-cast p2, La/ql5;

    .line 230
    .line 231
    if-nez p2, :cond_d

    .line 232
    .line 233
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    move-object p3, p2

    .line 238
    check-cast p3, La/ql5;

    .line 239
    .line 240
    if-nez p3, :cond_e

    .line 241
    .line 242
    move-object p3, p1

    .line 243
    goto :goto_6

    .line 244
    :cond_d
    move-object p3, p2

    .line 245
    :cond_e
    :goto_6
    iget-object p0, p0, La/jrt;->b:La/ot;

    .line 246
    .line 247
    sget-object p1, La/bm5;->c:La/bm5;

    .line 248
    .line 249
    invoke-virtual {p0, p1, p3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 250
    .line 251
    .line 252
    return-object p3
.end method

.method public b(JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/yje;)Ljava/io/Serializable;
    .locals 11

    .line 1
    instance-of v0, p4, La/irt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/irt;

    .line 7
    .line 8
    iget v1, v0, La/irt;->q:I

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
    iput v1, v0, La/irt;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/irt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/irt;-><init>(La/jrt;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/irt;->o:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/irt;->q:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v6, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, La/irt;->k:La/ql5;

    .line 47
    .line 48
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    iget-boolean p1, v0, La/irt;->n:Z

    .line 60
    .line 61
    iget-wide p2, v0, La/irt;->i:J

    .line 62
    .line 63
    iget-object v2, v0, La/irt;->m:La/bm5;

    .line 64
    .line 65
    iget-object v4, v0, La/irt;->l:La/bsu;

    .line 66
    .line 67
    iget-object v5, v0, La/irt;->k:La/ql5;

    .line 68
    .line 69
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v10, v2

    .line 73
    move v2, p1

    .line 74
    move-object p1, v5

    .line 75
    move-object v5, v4

    .line 76
    move-object v4, v10

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    iget-boolean p1, v0, La/irt;->n:Z

    .line 84
    .line 85
    iget-wide p2, v0, La/irt;->i:J

    .line 86
    .line 87
    iget-object v2, v0, La/irt;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 88
    .line 89
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v10, v2

    .line 93
    move v2, p1

    .line 94
    move-wide p1, p2

    .line 95
    move-object p3, v10

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object p4, La/bm5;->c:La/bm5;

    .line 101
    .line 102
    iget-object v2, p0, La/jrt;->a:La/g2v;

    .line 103
    .line 104
    invoke-virtual {v2, p4}, La/g2v;->i(La/bm5;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    iput-object p3, v0, La/irt;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 109
    .line 110
    iput-wide p1, v0, La/irt;->i:J

    .line 111
    .line 112
    iput-boolean v2, v0, La/irt;->n:Z

    .line 113
    .line 114
    iput v6, v0, La/irt;->q:I

    .line 115
    .line 116
    iget-object v6, p0, La/jrt;->c:La/khf0;

    .line 117
    .line 118
    invoke-static {v6, p4, v0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    if-ne p4, v1, :cond_6

    .line 123
    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :cond_6
    :goto_1
    check-cast p4, La/ql5;

    .line 127
    .line 128
    const-wide/16 v8, 0x0

    .line 129
    .line 130
    cmp-long v6, p1, v8

    .line 131
    .line 132
    if-eqz v6, :cond_8

    .line 133
    .line 134
    iput-object v7, v0, La/irt;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 135
    .line 136
    iput-object v7, v0, La/irt;->k:La/ql5;

    .line 137
    .line 138
    iput-wide p1, v0, La/irt;->i:J

    .line 139
    .line 140
    iput-boolean v2, v0, La/irt;->n:Z

    .line 141
    .line 142
    iput v5, v0, La/irt;->q:I

    .line 143
    .line 144
    iget-object p3, p0, La/jrt;->f:La/nrt;

    .line 145
    .line 146
    invoke-static {p3, p1, p2, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 147
    .line 148
    .line 149
    move-result-object p4

    .line 150
    if-ne p4, v1, :cond_7

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_7
    :goto_2
    check-cast p4, La/ql5;

    .line 154
    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :cond_8
    if-eqz v2, :cond_10

    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 163
    .line 164
    if-eq p3, v5, :cond_a

    .line 165
    .line 166
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 167
    .line 168
    if-eq p3, v5, :cond_a

    .line 169
    .line 170
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 171
    .line 172
    if-ne p3, v5, :cond_9

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_9
    sget-object p3, La/bm5;->c:La/bm5;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_a
    :goto_3
    sget-object p3, La/bm5;->a:La/bm5;

    .line 179
    .line 180
    :goto_4
    iput-object v7, v0, La/irt;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 181
    .line 182
    iput-object p4, v0, La/irt;->k:La/ql5;

    .line 183
    .line 184
    iget-object v5, p0, La/jrt;->d:La/bsu;

    .line 185
    .line 186
    iput-object v5, v0, La/irt;->l:La/bsu;

    .line 187
    .line 188
    iput-object p3, v0, La/irt;->m:La/bm5;

    .line 189
    .line 190
    iput-wide p1, v0, La/irt;->i:J

    .line 191
    .line 192
    iput-boolean v2, v0, La/irt;->n:Z

    .line 193
    .line 194
    iput v4, v0, La/irt;->q:I

    .line 195
    .line 196
    iget-object v4, p0, La/jrt;->e:La/urt;

    .line 197
    .line 198
    invoke-static {v4, v0}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-ne v4, v1, :cond_b

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_b
    move-object v10, v4

    .line 206
    move-object v4, p3

    .line 207
    move-wide p2, p1

    .line 208
    move-object p1, p4

    .line 209
    move-object p4, v10

    .line 210
    :goto_5
    check-cast p4, Ljava/util/List;

    .line 211
    .line 212
    iput-object v7, v0, La/irt;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 213
    .line 214
    iput-object p1, v0, La/irt;->k:La/ql5;

    .line 215
    .line 216
    iput-object v7, v0, La/irt;->l:La/bsu;

    .line 217
    .line 218
    iput-object v7, v0, La/irt;->m:La/bm5;

    .line 219
    .line 220
    iput-wide p2, v0, La/irt;->i:J

    .line 221
    .line 222
    iput-boolean v2, v0, La/irt;->n:Z

    .line 223
    .line 224
    iput v3, v0, La/irt;->q:I

    .line 225
    .line 226
    invoke-static {v5, v4, p4, v0}, La/bsu;->b(La/bsu;La/bm5;Ljava/util/List;La/zje;)Ljava/util/ArrayList;

    .line 227
    .line 228
    .line 229
    move-result-object p4

    .line 230
    if-ne p4, v1, :cond_c

    .line 231
    .line 232
    :goto_6
    return-object v1

    .line 233
    :cond_c
    :goto_7
    check-cast p4, Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    :cond_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result p3

    .line 243
    if-eqz p3, :cond_e

    .line 244
    .line 245
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    move-object v0, p3

    .line 250
    check-cast v0, La/ql5;

    .line 251
    .line 252
    iget-wide v0, v0, La/ql5;->a:J

    .line 253
    .line 254
    iget-wide v2, p1, La/ql5;->a:J

    .line 255
    .line 256
    cmp-long v0, v0, v2

    .line 257
    .line 258
    if-nez v0, :cond_d

    .line 259
    .line 260
    move-object v7, p3

    .line 261
    :cond_e
    move-object p2, v7

    .line 262
    check-cast p2, La/ql5;

    .line 263
    .line 264
    if-nez p2, :cond_f

    .line 265
    .line 266
    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    move-object p4, p2

    .line 271
    check-cast p4, La/ql5;

    .line 272
    .line 273
    if-nez p4, :cond_10

    .line 274
    .line 275
    move-object p4, p1

    .line 276
    goto :goto_8

    .line 277
    :cond_f
    move-object p4, p2

    .line 278
    :cond_10
    :goto_8
    iget-object p0, p0, La/jrt;->b:La/ot;

    .line 279
    .line 280
    sget-object p1, La/bm5;->c:La/bm5;

    .line 281
    .line 282
    invoke-virtual {p0, p1, p4}, La/ot;->a(La/bm5;La/ql5;)V

    .line 283
    .line 284
    .line 285
    return-object p4
.end method
