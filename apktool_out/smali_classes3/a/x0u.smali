.class public final La/x0u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pmi;

.field public final b:La/j1q0;

.field public final c:La/b3c0;

.field public final d:La/gst0;


# direct methods
.method public constructor <init>(La/pmi;La/j1q0;La/b3c0;La/gst0;B)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch p5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/x0u;->a:La/pmi;

    .line 17
    .line 18
    iput-object p2, p0, La/x0u;->b:La/j1q0;

    .line 19
    .line 20
    iput-object p3, p0, La/x0u;->c:La/b3c0;

    .line 21
    .line 22
    iput-object p4, p0, La/x0u;->d:La/gst0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/x0u;->a:La/pmi;

    .line 29
    .line 30
    iput-object p2, p0, La/x0u;->b:La/j1q0;

    .line 31
    .line 32
    iput-object p3, p0, La/x0u;->c:La/b3c0;

    .line 33
    .line 34
    iput-object p4, p0, La/x0u;->d:La/gst0;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    iget-object v0, p0, La/x0u;->b:La/j1q0;

    .line 2
    .line 3
    instance-of v1, p1, La/a1u;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, La/a1u;

    .line 9
    .line 10
    iget v2, v1, La/a1u;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/a1u;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/a1u;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, La/a1u;-><init>(La/x0u;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, La/a1u;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/a1u;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p0, p0, La/x0u;->a:La/pmi;

    .line 55
    .line 56
    iget-object p1, v0, La/j1q0;->a:La/m1q0;

    .line 57
    .line 58
    invoke-virtual {p1}, La/m1q0;->c()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {v0}, La/j1q0;->j()La/cre;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput v4, v1, La/a1u;->k:I

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0, v1}, La/pmi;->r(ZLa/cre;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v2, :cond_3

    .line 73
    .line 74
    return-object v2

    .line 75
    :cond_3
    :goto_1
    check-cast p1, La/elt;

    .line 76
    .line 77
    iget p0, p1, La/elt;->e:I

    .line 78
    .line 79
    new-instance p1, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 82
    .line 83
    .line 84
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 89
    .line 90
    new-instance p1, La/g0g0;

    .line 91
    .line 92
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    new-instance p0, Ljava/lang/Integer;

    .line 96
    .line 97
    const/16 v0, 0xe1

    .line 98
    .line 99
    invoke-direct {p0, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 100
    .line 101
    .line 102
    instance-of v0, p1, La/g0g0;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    move-object p1, p0

    .line 107
    :cond_4
    return-object p1
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/v0u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/v0u;

    .line 7
    .line 8
    iget v1, v0, La/v0u;->k:I

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
    iput v1, v0, La/v0u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/v0u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/v0u;-><init>(La/x0u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/v0u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/v0u;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/x0u;->b:La/j1q0;

    .line 51
    .line 52
    iget-object v2, p1, La/j1q0;->a:La/m1q0;

    .line 53
    .line 54
    invoke-virtual {v2}, La/m1q0;->c()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p1}, La/j1q0;->j()La/cre;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput v3, v0, La/v0u;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/x0u;->a:La/pmi;

    .line 65
    .line 66
    invoke-virtual {p0, v2, p1, v0}, La/pmi;->r(ZLa/cre;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/elt;

    .line 74
    .line 75
    iget-object p0, p1, La/elt;->a:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0
.end method

.method public c(La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/b1u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/b1u;

    .line 7
    .line 8
    iget v1, v0, La/b1u;->k:I

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
    iput v1, v0, La/b1u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/b1u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/b1u;-><init>(La/x0u;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/b1u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/b1u;->k:I

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
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eq v2, v6, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, La/x0u;->d:La/gst0;

    .line 75
    .line 76
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_7

    .line 81
    .line 82
    iput v6, v0, La/b1u;->k:I

    .line 83
    .line 84
    invoke-virtual {p0, v0}, La/x0u;->a(La/zje;)Ljava/io/Serializable;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v1, :cond_6

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :cond_6
    return-object p0

    .line 92
    :cond_7
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 93
    .line 94
    iget-object p1, p0, La/x0u;->c:La/b3c0;

    .line 95
    .line 96
    iput v5, v0, La/b1u;->k:I

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {p1, v2, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v1, :cond_8

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_8
    :goto_1
    check-cast p1, La/m2c0;

    .line 107
    .line 108
    iget-object p1, p1, La/m2c0;->c:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :goto_2
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 118
    .line 119
    new-instance v2, La/g0g0;

    .line 120
    .line 121
    invoke-direct {v2, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object p1, v2

    .line 125
    :goto_3
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-nez v2, :cond_b

    .line 130
    .line 131
    check-cast p1, Ljava/lang/Integer;

    .line 132
    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    goto :goto_5

    .line 140
    :cond_9
    iput v4, v0, La/b1u;->k:I

    .line 141
    .line 142
    invoke-virtual {p0, v0}, La/x0u;->a(La/zje;)Ljava/io/Serializable;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v1, :cond_a

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_a
    :goto_4
    check-cast p1, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    :goto_5
    new-instance p1, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_b
    instance-of p1, v2, La/oqt0;

    .line 162
    .line 163
    if-nez p1, :cond_d

    .line 164
    .line 165
    iput v3, v0, La/b1u;->k:I

    .line 166
    .line 167
    invoke-virtual {p0, v0}, La/x0u;->a(La/zje;)Ljava/io/Serializable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v1, :cond_c

    .line 172
    .line 173
    :goto_6
    return-object v1

    .line 174
    :cond_c
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    new-instance p1, Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 183
    .line 184
    .line 185
    :goto_8
    return-object p1

    .line 186
    :cond_d
    throw v2
.end method

.method public d(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/w0u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/w0u;

    .line 7
    .line 8
    iget v1, v0, La/w0u;->k:I

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
    iput v1, v0, La/w0u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w0u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/w0u;-><init>(La/x0u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/w0u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w0u;->k:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/x0u;->d:La/gst0;

    .line 65
    .line 66
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_8

    .line 71
    .line 72
    iput v5, v0, La/w0u;->k:I

    .line 73
    .line 74
    iget-object p1, p0, La/x0u;->c:La/b3c0;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-virtual {p1, v2, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v1, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    :goto_1
    check-cast p1, La/m2c0;

    .line 85
    .line 86
    iget-object p1, p1, La/m2c0;->C:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_7

    .line 93
    .line 94
    iput v4, v0, La/w0u;->k:I

    .line 95
    .line 96
    invoke-virtual {p0, v0}, La/x0u;->b(La/zje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-ne p1, v1, :cond_6

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 104
    .line 105
    :cond_7
    return-object p1

    .line 106
    :cond_8
    iput v3, v0, La/w0u;->k:I

    .line 107
    .line 108
    invoke-virtual {p0, v0}, La/x0u;->b(La/zje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, v1, :cond_9

    .line 113
    .line 114
    :goto_3
    return-object v1

    .line 115
    :cond_9
    return-object p0
.end method
