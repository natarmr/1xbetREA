.class public final La/ahu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rrd;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/rrd;La/gst0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ahu;->a:La/rrd;

    .line 8
    .line 9
    iput-object p2, p0, La/ahu;->b:La/gst0;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic c(La/ahu;La/yje;)Ljava/io/Serializable;
    .locals 1

    .line 1
    sget-object v0, La/bm5;->a:La/bm5;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p3, La/xgu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/xgu;

    .line 7
    .line 8
    iget v1, v0, La/xgu;->l:I

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
    iput v1, v0, La/xgu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xgu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/xgu;-><init>(La/ahu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/xgu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xgu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-wide p1, v0, La/xgu;->i:J

    .line 38
    .line 39
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p3, La/tl5;->c:La/tl5;

    .line 53
    .line 54
    iput-wide p1, v0, La/xgu;->i:J

    .line 55
    .line 56
    iput v4, v0, La/xgu;->l:I

    .line 57
    .line 58
    iget-object p0, p0, La/ahu;->a:La/rrd;

    .line 59
    .line 60
    invoke-virtual {p0, p3, v0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-ne p3, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    move-object v0, p3

    .line 84
    check-cast v0, La/ql5;

    .line 85
    .line 86
    iget-wide v0, v0, La/ql5;->a:J

    .line 87
    .line 88
    cmp-long v0, v0, p1

    .line 89
    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    move-object v3, p3

    .line 93
    :cond_5
    check-cast v3, La/ql5;

    .line 94
    .line 95
    if-eqz v3, :cond_6

    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_6
    new-instance p0, La/ss3;

    .line 99
    .line 100
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public final b(La/bm5;La/yje;)Ljava/io/Serializable;
    .locals 12

    .line 1
    instance-of v0, p2, La/ygu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ygu;

    .line 7
    .line 8
    iget v1, v0, La/ygu;->l:I

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
    iput v1, v0, La/ygu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ygu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ygu;-><init>(La/ahu;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ygu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ygu;->l:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    iget-object p1, v0, La/ygu;->i:La/bm5;

    .line 58
    .line 59
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :catch_0
    move-exception p2

    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_3
    iget-object p1, v0, La/ygu;->i:La/bm5;

    .line 68
    .line 69
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_4
    iget-object p1, v0, La/ygu;->i:La/bm5;

    .line 75
    .line 76
    :try_start_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :try_start_3
    iget-object p2, p0, La/ahu;->a:La/rrd;

    .line 84
    .line 85
    invoke-virtual {p2, p1}, La/rrd;->p(La/bm5;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v8

    .line 89
    new-instance p2, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-direct {p2, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    const-wide/16 v10, 0x0

    .line 99
    .line 100
    cmp-long v2, v8, v10

    .line 101
    .line 102
    if-lez v2, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    move-object p2, v7

    .line 106
    :goto_1
    if-eqz p2, :cond_d

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v8

    .line 112
    iput-object p1, v0, La/ygu;->i:La/bm5;

    .line 113
    .line 114
    iput v6, v0, La/ygu;->l:I

    .line 115
    .line 116
    invoke-virtual {p0, v8, v9, v0}, La/ahu;->a(JLa/zje;)Ljava/io/Serializable;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-ne p2, v1, :cond_7

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_7
    :goto_2
    check-cast p2, La/ql5;

    .line 124
    .line 125
    if-eqz p2, :cond_d

    .line 126
    .line 127
    iget-object v2, p2, La/ql5;->i:La/txs0;

    .line 128
    .line 129
    invoke-virtual {v2}, La/txs0;->a()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_9

    .line 134
    .line 135
    iget-boolean v2, p2, La/ql5;->l:Z

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    move-object p2, v7

    .line 141
    :cond_9
    :goto_3
    if-eqz p2, :cond_d

    .line 142
    .line 143
    iget-object v2, p2, La/ql5;->i:La/txs0;

    .line 144
    .line 145
    invoke-virtual {v2}, La/txs0;->a()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_c

    .line 150
    .line 151
    sget-object v2, La/bm5;->m:La/bm5;

    .line 152
    .line 153
    if-eq p1, v2, :cond_a

    .line 154
    .line 155
    sget-object v2, La/bm5;->k:La/bm5;

    .line 156
    .line 157
    if-eq p1, v2, :cond_a

    .line 158
    .line 159
    sget-object v2, La/bm5;->l:La/bm5;

    .line 160
    .line 161
    if-ne p1, v2, :cond_c

    .line 162
    .line 163
    :cond_a
    iput-object p1, v0, La/ygu;->i:La/bm5;

    .line 164
    .line 165
    iput v5, v0, La/ygu;->l:I

    .line 166
    .line 167
    iget-object p2, p0, La/ahu;->b:La/gst0;

    .line 168
    .line 169
    iget-object p2, p2, La/gst0;->a:La/rrt0;

    .line 170
    .line 171
    invoke-virtual {p2}, La/rrt0;->a()La/krt0;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    iget-wide v5, p2, La/krt0;->a:J

    .line 176
    .line 177
    invoke-virtual {p0, v5, v6, v0}, La/ahu;->a(JLa/zje;)Ljava/io/Serializable;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    if-ne p2, v1, :cond_b

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_b
    :goto_4
    check-cast p2, La/ql5;

    .line 185
    .line 186
    :cond_c
    if-eqz p2, :cond_d

    .line 187
    .line 188
    return-object p2

    .line 189
    :cond_d
    iput-object p1, v0, La/ygu;->i:La/bm5;

    .line 190
    .line 191
    iput v4, v0, La/ygu;->l:I

    .line 192
    .line 193
    invoke-virtual {p0, p1, v0}, La/ahu;->d(La/bm5;La/zje;)Ljava/io/Serializable;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    if-ne p2, v1, :cond_e

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_e
    :goto_5
    check-cast p2, La/ql5;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 201
    .line 202
    return-object p2

    .line 203
    :goto_6
    instance-of v2, p2, La/u660;

    .line 204
    .line 205
    if-nez v2, :cond_10

    .line 206
    .line 207
    iput-object v7, v0, La/ygu;->i:La/bm5;

    .line 208
    .line 209
    iput v3, v0, La/ygu;->l:I

    .line 210
    .line 211
    invoke-virtual {p0, p1, v0}, La/ahu;->d(La/bm5;La/zje;)Ljava/io/Serializable;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    if-ne p2, v1, :cond_f

    .line 216
    .line 217
    :goto_7
    return-object v1

    .line 218
    :cond_f
    :goto_8
    check-cast p2, La/ql5;

    .line 219
    .line 220
    return-object p2

    .line 221
    :cond_10
    throw p2
.end method

.method public final d(La/bm5;La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, La/zgu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/zgu;

    .line 7
    .line 8
    iget v1, v0, La/zgu;->l:I

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
    iput v1, v0, La/zgu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zgu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/zgu;-><init>(La/ahu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/zgu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zgu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, La/zgu;->i:La/bm5;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/zgu;->i:La/bm5;

    .line 53
    .line 54
    iput v3, v0, La/zgu;->l:I

    .line 55
    .line 56
    iget-object p2, p0, La/ahu;->b:La/gst0;

    .line 57
    .line 58
    iget-object p2, p2, La/gst0;->a:La/rrt0;

    .line 59
    .line 60
    invoke-virtual {p2}, La/rrt0;->a()La/krt0;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-wide v2, p2, La/krt0;->a:J

    .line 65
    .line 66
    invoke-virtual {p0, v2, v3, v0}, La/ahu;->a(JLa/zje;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p2, La/ql5;

    .line 74
    .line 75
    iget-object p0, p0, La/ahu;->a:La/rrd;

    .line 76
    .line 77
    iget-wide v0, p2, La/ql5;->a:J

    .line 78
    .line 79
    invoke-virtual {p0, p1, v0, v1}, La/rrd;->z(La/bm5;J)V

    .line 80
    .line 81
    .line 82
    return-object p2
.end method
