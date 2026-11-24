.class public final La/is;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gfi0;


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/is;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/a640;ZLa/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/amv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/amv;

    .line 7
    .line 8
    iget v1, v0, La/amv;->m:I

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
    iput v1, v0, La/amv;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/amv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/amv;-><init>(La/is;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/amv;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/amv;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iget-object p0, p0, La/is;->a:La/g45;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, La/amv;->j:La/gxb;

    .line 39
    .line 40
    iget-object p2, v0, La/amv;->i:La/a640;

    .line 41
    .line 42
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p3, p1

    .line 46
    move-object p1, p2

    .line 47
    goto :goto_1

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p3, p0, La/g45;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p3, La/i7e;

    .line 61
    .line 62
    iget-object p3, p3, La/i7e;->i:La/p7m0;

    .line 63
    .line 64
    invoke-virtual {p3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    check-cast p3, La/gxb;

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iput-object p1, v0, La/amv;->i:La/a640;

    .line 73
    .line 74
    iput-object p3, v0, La/amv;->j:La/gxb;

    .line 75
    .line 76
    iput v3, v0, La/amv;->m:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/g45;->c(La/a640;)Lkotlin/Unit;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-ne p2, v1, :cond_3

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    :goto_1
    move-object v0, p3

    .line 86
    invoke-virtual {p1}, La/a640;->e()La/xrt0;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    instance-of p2, p2, La/srt0;

    .line 91
    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    iget p3, v0, La/gxb;->d:I

    .line 95
    .line 96
    invoke-virtual {p1}, La/a640;->b()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    :goto_2
    move v2, p3

    .line 105
    goto :goto_3

    .line 106
    :cond_4
    iget p3, v0, La/gxb;->d:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    new-instance v7, La/vxy;

    .line 110
    .line 111
    invoke-virtual {p1}, La/a640;->b()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-direct {v7, p1, p2}, La/vxy;-><init>(IZ)V

    .line 116
    .line 117
    .line 118
    const/16 v8, 0x1f7

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v4, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-static/range {v0 .. v8}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, La/g45;->j0(La/gxb;)V

    .line 130
    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0
.end method

.method public d(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/vnf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/vnf0;

    .line 7
    .line 8
    iget v1, v0, La/vnf0;->m:I

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
    iput v1, v0, La/vnf0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vnf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/vnf0;-><init>(La/is;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/vnf0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vnf0;->m:I

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
    iget-object v7, p0, La/is;->a:La/g45;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v6, :cond_4

    .line 41
    .line 42
    if-eq v2, v5, :cond_3

    .line 43
    .line 44
    if-eq v2, v4, :cond_2

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    iget-object p0, v0, La/vnf0;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    iget-object p1, v0, La/vnf0;->j:La/rei0;

    .line 66
    .line 67
    iget-object v2, v0, La/vnf0;->i:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget-object p1, v0, La/vnf0;->j:La/rei0;

    .line 74
    .line 75
    iget-object v2, v0, La/vnf0;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, v7, La/g45;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p2, La/i7e;

    .line 87
    .line 88
    iget-object p2, p2, La/i7e;->g:La/p7m0;

    .line 89
    .line 90
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Ljava/util/Map;

    .line 95
    .line 96
    invoke-virtual {v7, p2}, La/g45;->V(Ljava/util/Map;)Ljava/util/HashMap;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, La/rei0;

    .line 105
    .line 106
    if-nez p2, :cond_6

    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_6
    iput-object p1, v0, La/vnf0;->i:Ljava/lang/String;

    .line 112
    .line 113
    iput-object p2, v0, La/vnf0;->j:La/rei0;

    .line 114
    .line 115
    iput v6, v0, La/vnf0;->m:I

    .line 116
    .line 117
    invoke-static {v7}, La/gfi0;->b(La/g45;)Lkotlin/Unit;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-ne v2, v1, :cond_7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    move-object v2, p1

    .line 125
    move-object p1, p2

    .line 126
    :goto_1
    iput-object v2, v0, La/vnf0;->i:Ljava/lang/String;

    .line 127
    .line 128
    iput-object p1, v0, La/vnf0;->j:La/rei0;

    .line 129
    .line 130
    iput v5, v0, La/vnf0;->m:I

    .line 131
    .line 132
    invoke-virtual {v7, p1, v0}, La/g45;->f0(La/rei0;La/zje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-ne p2, v1, :cond_8

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    :goto_2
    check-cast p2, La/qtf0;

    .line 140
    .line 141
    instance-of v5, p2, La/ntf0;

    .line 142
    .line 143
    if-eqz v5, :cond_a

    .line 144
    .line 145
    iput-object v8, v0, La/vnf0;->i:Ljava/lang/String;

    .line 146
    .line 147
    iput-object v8, v0, La/vnf0;->j:La/rei0;

    .line 148
    .line 149
    iput v4, v0, La/vnf0;->m:I

    .line 150
    .line 151
    invoke-static {p0, v2, p1, v7, v0}, La/gfi0;->a(La/gfi0;Ljava/lang/String;La/rei0;La/g45;La/zje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-ne p0, v1, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_a
    instance-of p0, p2, La/ptf0;

    .line 162
    .line 163
    if-eqz p0, :cond_c

    .line 164
    .line 165
    check-cast p2, La/ptf0;

    .line 166
    .line 167
    iget-object p0, p2, La/ptf0;->a:La/a640;

    .line 168
    .line 169
    iput-object v2, v0, La/vnf0;->i:Ljava/lang/String;

    .line 170
    .line 171
    iput-object v8, v0, La/vnf0;->j:La/rei0;

    .line 172
    .line 173
    iput v3, v0, La/vnf0;->m:I

    .line 174
    .line 175
    invoke-virtual {v7, p0}, La/g45;->c(La/a640;)Lkotlin/Unit;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-ne p0, v1, :cond_b

    .line 180
    .line 181
    :goto_4
    return-object v1

    .line 182
    :cond_b
    move-object p0, v2

    .line 183
    :goto_5
    invoke-virtual {v7, p0}, La/g45;->b0(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_c
    sget-object p0, La/otf0;->a:La/otf0;

    .line 188
    .line 189
    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-eqz p0, :cond_d

    .line 194
    .line 195
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 199
    .line 200
    .line 201
    return-object v8
.end method

.method public e(ZLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/tmu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/tmu;

    .line 7
    .line 8
    iget v1, v0, La/tmu;->m:I

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
    iput v1, v0, La/tmu;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tmu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/tmu;-><init>(La/is;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/tmu;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tmu;->m:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_7

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
    return-object v6

    .line 57
    :cond_2
    iget-boolean p0, v0, La/tmu;->i:Z

    .line 58
    .line 59
    iget-object p1, v0, La/tmu;->j:La/is;

    .line 60
    .line 61
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    move-object v7, p1

    .line 65
    move p1, p0

    .line 66
    move-object p0, v7

    .line 67
    goto :goto_4

    .line 68
    :cond_3
    iget-boolean p1, v0, La/tmu;->i:Z

    .line 69
    .line 70
    :try_start_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception p2

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :try_start_3
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 80
    .line 81
    iget-object p2, p0, La/is;->a:La/g45;

    .line 82
    .line 83
    iput-object v6, v0, La/tmu;->j:La/is;

    .line 84
    .line 85
    iput-boolean p1, v0, La/tmu;->i:Z

    .line 86
    .line 87
    iput v5, v0, La/tmu;->m:I

    .line 88
    .line 89
    invoke-virtual {p2, v0}, La/g45;->D(La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-ne p2, v1, :cond_5

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    :goto_1
    check-cast p2, La/l14;

    .line 97
    .line 98
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :goto_2
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 102
    .line 103
    new-instance v2, La/g0g0;

    .line 104
    .line 105
    invoke-direct {v2, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object p2, v2

    .line 109
    :goto_3
    nop

    .line 110
    instance-of v2, p2, La/g0g0;

    .line 111
    .line 112
    if-eqz v2, :cond_6

    .line 113
    .line 114
    move-object p2, v6

    .line 115
    :cond_6
    check-cast p2, La/l14;

    .line 116
    .line 117
    if-nez p2, :cond_b

    .line 118
    .line 119
    if-eqz p1, :cond_a

    .line 120
    .line 121
    :try_start_4
    iput-object p0, v0, La/tmu;->j:La/is;

    .line 122
    .line 123
    iput-boolean p1, v0, La/tmu;->i:Z

    .line 124
    .line 125
    iput v4, v0, La/tmu;->m:I

    .line 126
    .line 127
    const-wide/16 v4, 0xbb8

    .line 128
    .line 129
    invoke-static {v4, v5, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    if-ne p2, v1, :cond_7

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_7
    :goto_4
    iget-object p0, p0, La/is;->a:La/g45;

    .line 137
    .line 138
    iput-object v6, v0, La/tmu;->j:La/is;

    .line 139
    .line 140
    iput-boolean p1, v0, La/tmu;->i:Z

    .line 141
    .line 142
    iput v3, v0, La/tmu;->m:I

    .line 143
    .line 144
    invoke-virtual {p0, v0}, La/g45;->D(La/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-ne p2, v1, :cond_8

    .line 149
    .line 150
    :goto_5
    return-object v1

    .line 151
    :cond_8
    :goto_6
    check-cast p2, La/l14;

    .line 152
    .line 153
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :goto_7
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 157
    .line 158
    new-instance p2, La/g0g0;

    .line 159
    .line 160
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    :goto_8
    instance-of p0, p2, La/g0g0;

    .line 164
    .line 165
    if-eqz p0, :cond_9

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_9
    move-object v6, p2

    .line 169
    :goto_9
    check-cast v6, La/l14;

    .line 170
    .line 171
    :cond_a
    move-object p2, v6

    .line 172
    :cond_b
    return-object p2
.end method
