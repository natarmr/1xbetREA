.class public final La/ul9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/k050;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/r7v;La/hl9;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ul9;->a:B

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/ul9;->c:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, La/ul9;->d:Ljava/lang/Object;

    .line 22
    new-instance p1, La/k050;

    invoke-direct {p1}, La/k050;-><init>()V

    .line 23
    iput-object p1, p0, La/ul9;->b:La/k050;

    return-void
.end method

.method public constructor <init>(La/zas0;La/s3t0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ul9;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ul9;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/ul9;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, La/k050;

    .line 12
    .line 13
    invoke-direct {p1}, La/k050;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ul9;->b:La/k050;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/yje;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 9
    .line 10
    check-cast v1, La/s3t0;

    .line 11
    .line 12
    iget-object p0, v1, La/s3t0;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 17
    .line 18
    new-instance p1, La/g0g0;

    .line 19
    .line 20
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    sget-object p1, La/iun;->a:La/iun;

    .line 25
    .line 26
    instance-of p2, p0, La/g0g0;

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    move-object p0, p1

    .line 31
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast v1, La/hl9;

    .line 35
    .line 36
    iget-object v0, v1, La/hl9;->e:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    instance-of v1, p2, La/pl9;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    move-object v1, p2

    .line 43
    check-cast v1, La/pl9;

    .line 44
    .line 45
    iget v2, v1, La/pl9;->l:I

    .line 46
    .line 47
    const/high16 v3, -0x80000000

    .line 48
    .line 49
    and-int v4, v2, v3

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    sub-int/2addr v2, v3

    .line 54
    iput v2, v1, La/pl9;->l:I

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v1, La/pl9;

    .line 58
    .line 59
    check-cast p2, La/zje;

    .line 60
    .line 61
    invoke-direct {v1, p0, p2}, La/pl9;-><init>(La/ul9;La/zje;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object p2, v1, La/pl9;->j:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object v2, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget v3, v1, La/pl9;->l:I

    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    if-ne v3, v4, :cond_2

    .line 74
    .line 75
    iget-object p1, v1, La/pl9;->i:Ljava/util/List;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception p0

    .line 82
    goto :goto_4

    .line 83
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :try_start_2
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Ljava/util/List;

    .line 104
    .line 105
    if-nez p2, :cond_5

    .line 106
    .line 107
    iget-object p0, p0, La/ul9;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, La/r7v;

    .line 110
    .line 111
    iput-object p1, v1, La/pl9;->i:Ljava/util/List;

    .line 112
    .line 113
    iput v4, v1, La/pl9;->l:I

    .line 114
    .line 115
    iget-object p0, p0, La/r7v;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, La/zm;

    .line 118
    .line 119
    invoke-virtual {p0}, La/zm;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, La/lk9;

    .line 124
    .line 125
    const/4 p2, 0x0

    .line 126
    invoke-interface {p0, p1, p2, v1}, La/lk9;->b(Ljava/util/List;ILa/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-ne p2, v2, :cond_4

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_4
    :goto_2
    check-cast p2, La/dx5;

    .line 134
    .line 135
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    check-cast p0, Ljava/lang/Iterable;

    .line 140
    .line 141
    new-instance p2, Ljava/util/ArrayList;

    .line 142
    .line 143
    const/16 v1, 0xa

    .line 144
    .line 145
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/r4g;

    .line 167
    .line 168
    invoke-static {v1}, La/d5c;->W(La/r4g;)La/k4g;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :goto_4
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 180
    .line 181
    new-instance p2, La/g0g0;

    .line 182
    .line 183
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_5
    sget-object p0, La/iun;->a:La/iun;

    .line 187
    .line 188
    instance-of v1, p2, La/g0g0;

    .line 189
    .line 190
    if-eqz v1, :cond_6

    .line 191
    .line 192
    move-object p2, p0

    .line 193
    :cond_6
    move-object v2, p2

    .line 194
    check-cast v2, Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_7

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_7
    :goto_6
    return-object v2

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()La/o4g;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s3t0;

    .line 9
    .line 10
    iget-object p0, p0, La/s3t0;->b:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/o4g;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, La/hl9;

    .line 20
    .line 21
    iget-object p0, p0, La/hl9;->b:La/p7m0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o4g;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s3t0;

    .line 9
    .line 10
    iget-object p0, p0, La/s3t0;->d:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, La/hl9;

    .line 20
    .line 21
    iget-object p0, p0, La/hl9;->d:La/p7m0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()La/p7m0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s3t0;

    .line 9
    .line 10
    iget-object p0, p0, La/s3t0;->d:La/p7m0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, La/hl9;

    .line 14
    .line 15
    iget-object p0, p0, La/hl9;->d:La/p7m0;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()La/p7m0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s3t0;

    .line 9
    .line 10
    iget-object p0, p0, La/s3t0;->c:La/p7m0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, La/hl9;

    .line 14
    .line 15
    iget-object p0, p0, La/hl9;->c:La/p7m0;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(IILa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-byte v4, v0, La/ul9;->a:B

    .line 10
    .line 11
    iget-object v5, v0, La/ul9;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/ul9;->b:La/k050;

    .line 14
    .line 15
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    const/high16 v8, -0x80000000

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x2

    .line 21
    iget-object v11, v0, La/ul9;->d:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    packed-switch v4, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v11, La/s3t0;

    .line 28
    .line 29
    iget-object v4, v11, La/s3t0;->a:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    instance-of v11, v3, La/t3t0;

    .line 32
    .line 33
    if-eqz v11, :cond_0

    .line 34
    .line 35
    move-object v11, v3

    .line 36
    check-cast v11, La/t3t0;

    .line 37
    .line 38
    iget v13, v11, La/t3t0;->n:I

    .line 39
    .line 40
    and-int v14, v13, v8

    .line 41
    .line 42
    if-eqz v14, :cond_0

    .line 43
    .line 44
    sub-int/2addr v13, v8

    .line 45
    iput v13, v11, La/t3t0;->n:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v11, La/t3t0;

    .line 49
    .line 50
    invoke-direct {v11, v0, v3}, La/t3t0;-><init>(La/ul9;La/zje;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, v11, La/t3t0;->l:Ljava/lang/Object;

    .line 54
    .line 55
    sget-object v3, La/wne;->a:La/wne;

    .line 56
    .line 57
    iget v8, v11, La/t3t0;->n:I

    .line 58
    .line 59
    if-eqz v8, :cond_3

    .line 60
    .line 61
    if-eq v8, v9, :cond_2

    .line 62
    .line 63
    if-ne v8, v10, :cond_1

    .line 64
    .line 65
    iget v1, v11, La/t3t0;->j:I

    .line 66
    .line 67
    iget v2, v11, La/t3t0;->i:I

    .line 68
    .line 69
    iget-object v3, v11, La/t3t0;->k:La/i050;

    .line 70
    .line 71
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_2
    iget v1, v11, La/t3t0;->j:I

    .line 85
    .line 86
    iget v2, v11, La/t3t0;->i:I

    .line 87
    .line 88
    iget-object v6, v11, La/t3t0;->k:La/i050;

    .line 89
    .line 90
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move/from16 v19, v2

    .line 94
    .line 95
    move v2, v1

    .line 96
    move/from16 v1, v19

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object v6, v11, La/t3t0;->k:La/i050;

    .line 103
    .line 104
    iput v1, v11, La/t3t0;->i:I

    .line 105
    .line 106
    iput v2, v11, La/t3t0;->j:I

    .line 107
    .line 108
    iput v9, v11, La/t3t0;->n:I

    .line 109
    .line 110
    invoke-virtual {v6, v11}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v3, :cond_4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    :goto_1
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-interface {v6, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    move-object v12, v0

    .line 144
    goto :goto_5

    .line 145
    :cond_5
    :try_start_2
    check-cast v5, La/zas0;

    .line 146
    .line 147
    iput-object v6, v11, La/t3t0;->k:La/i050;

    .line 148
    .line 149
    iput v1, v11, La/t3t0;->i:I

    .line 150
    .line 151
    iput v2, v11, La/t3t0;->j:I

    .line 152
    .line 153
    iput v10, v11, La/t3t0;->n:I

    .line 154
    .line 155
    iget-object v0, v5, La/zas0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, La/lkr0;

    .line 158
    .line 159
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, La/n3t0;

    .line 164
    .line 165
    invoke-interface {v0, v2, v1, v11}, La/n3t0;->a(IILa/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    if-ne v0, v3, :cond_6

    .line 170
    .line 171
    :goto_3
    move-object v12, v3

    .line 172
    goto :goto_5

    .line 173
    :cond_6
    move v3, v2

    .line 174
    move v2, v1

    .line 175
    move v1, v3

    .line 176
    move-object v3, v6

    .line 177
    :goto_4
    :try_start_3
    check-cast v0, La/dx5;

    .line 178
    .line 179
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Ljava/util/List;

    .line 184
    .line 185
    invoke-static {v0}, La/ebc;->c0(Ljava/util/List;)La/dag;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v0, v0, La/dag;->a:Ljava/util/List;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v5, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    .line 211
    .line 212
    invoke-interface {v3, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :goto_5
    return-object v12

    .line 217
    :goto_6
    move-object v3, v6

    .line 218
    goto :goto_7

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    goto :goto_6

    .line 221
    :goto_7
    invoke-interface {v3, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :pswitch_0
    check-cast v11, La/hl9;

    .line 226
    .line 227
    iget-object v4, v11, La/hl9;->a:Ljava/util/LinkedHashMap;

    .line 228
    .line 229
    instance-of v11, v3, La/sl9;

    .line 230
    .line 231
    if-eqz v11, :cond_7

    .line 232
    .line 233
    move-object v11, v3

    .line 234
    check-cast v11, La/sl9;

    .line 235
    .line 236
    iget v13, v11, La/sl9;->n:I

    .line 237
    .line 238
    and-int v14, v13, v8

    .line 239
    .line 240
    if-eqz v14, :cond_7

    .line 241
    .line 242
    sub-int/2addr v13, v8

    .line 243
    iput v13, v11, La/sl9;->n:I

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_7
    new-instance v11, La/sl9;

    .line 247
    .line 248
    invoke-direct {v11, v0, v3}, La/sl9;-><init>(La/ul9;La/zje;)V

    .line 249
    .line 250
    .line 251
    :goto_8
    iget-object v0, v11, La/sl9;->l:Ljava/lang/Object;

    .line 252
    .line 253
    sget-object v3, La/wne;->a:La/wne;

    .line 254
    .line 255
    iget v8, v11, La/sl9;->n:I

    .line 256
    .line 257
    if-eqz v8, :cond_a

    .line 258
    .line 259
    if-eq v8, v9, :cond_9

    .line 260
    .line 261
    if-ne v8, v10, :cond_8

    .line 262
    .line 263
    iget v1, v11, La/sl9;->j:I

    .line 264
    .line 265
    iget v2, v11, La/sl9;->i:I

    .line 266
    .line 267
    iget-object v3, v11, La/sl9;->k:La/i050;

    .line 268
    .line 269
    :try_start_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 270
    .line 271
    .line 272
    goto/16 :goto_c

    .line 273
    .line 274
    :catchall_2
    move-exception v0

    .line 275
    goto/16 :goto_f

    .line 276
    .line 277
    :cond_8
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_d

    .line 281
    .line 282
    :cond_9
    iget v1, v11, La/sl9;->j:I

    .line 283
    .line 284
    iget v2, v11, La/sl9;->i:I

    .line 285
    .line 286
    iget-object v6, v11, La/sl9;->k:La/i050;

    .line 287
    .line 288
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    move/from16 v19, v2

    .line 292
    .line 293
    move v2, v1

    .line 294
    move/from16 v1, v19

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    iput-object v6, v11, La/sl9;->k:La/i050;

    .line 301
    .line 302
    iput v1, v11, La/sl9;->i:I

    .line 303
    .line 304
    iput v2, v11, La/sl9;->j:I

    .line 305
    .line 306
    iput v9, v11, La/sl9;->n:I

    .line 307
    .line 308
    invoke-virtual {v6, v11}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-ne v0, v3, :cond_b

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_b
    :goto_9
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 335
    .line 336
    if-eqz v0, :cond_c

    .line 337
    .line 338
    invoke-interface {v6, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :goto_a
    move-object v12, v0

    .line 342
    goto :goto_d

    .line 343
    :cond_c
    :try_start_6
    check-cast v5, La/r7v;

    .line 344
    .line 345
    iput-object v6, v11, La/sl9;->k:La/i050;

    .line 346
    .line 347
    iput v1, v11, La/sl9;->i:I

    .line 348
    .line 349
    iput v2, v11, La/sl9;->j:I

    .line 350
    .line 351
    iput v10, v11, La/sl9;->n:I

    .line 352
    .line 353
    iget-object v0, v5, La/r7v;->a:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, La/zm;

    .line 356
    .line 357
    invoke-virtual {v0}, La/zm;->invoke()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    move-object v13, v0

    .line 362
    check-cast v13, La/lk9;

    .line 363
    .line 364
    new-instance v0, Ljava/lang/Long;

    .line 365
    .line 366
    const-wide/16 v7, 0x0

    .line 367
    .line 368
    invoke-direct {v0, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 369
    .line 370
    .line 371
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    const/4 v15, 0x0

    .line 376
    move/from16 v16, v1

    .line 377
    .line 378
    move/from16 v17, v2

    .line 379
    .line 380
    move-object/from16 v18, v11

    .line 381
    .line 382
    invoke-interface/range {v13 .. v18}, La/lk9;->a(Ljava/util/List;IIILa/yje;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 386
    if-ne v0, v3, :cond_d

    .line 387
    .line 388
    :goto_b
    move-object v12, v3

    .line 389
    goto :goto_d

    .line 390
    :cond_d
    move-object v3, v6

    .line 391
    move/from16 v2, v16

    .line 392
    .line 393
    move/from16 v1, v17

    .line 394
    .line 395
    :goto_c
    :try_start_7
    check-cast v0, La/dx5;

    .line 396
    .line 397
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, La/gag;

    .line 402
    .line 403
    invoke-static {v0}, La/fbc;->W(La/gag;)La/dag;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    iget-object v0, v0, La/dag;->a:Ljava/util/List;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance v5, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 428
    .line 429
    .line 430
    invoke-interface {v3, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto :goto_a

    .line 434
    :goto_d
    return-object v12

    .line 435
    :goto_e
    move-object v3, v6

    .line 436
    goto :goto_f

    .line 437
    :catchall_3
    move-exception v0

    .line 438
    goto :goto_e

    .line 439
    :goto_f
    invoke-interface {v3, v12}, La/i050;->c(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/ul9;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v2, La/s3t0;

    .line 15
    .line 16
    instance-of p1, p2, La/u3t0;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move-object p1, p2

    .line 21
    check-cast p1, La/u3t0;

    .line 22
    .line 23
    iget v0, p1, La/u3t0;->l:I

    .line 24
    .line 25
    and-int v6, v0, v3

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr v0, v3

    .line 30
    iput v0, p1, La/u3t0;->l:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, La/u3t0;

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, La/u3t0;-><init>(La/ul9;La/zje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, p1, La/u3t0;->j:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v0, p1, La/u3t0;->l:I

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    if-ne v0, v4, :cond_1

    .line 47
    .line 48
    iget-object p1, p1, La/u3t0;->i:La/o4g;

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, v2, La/s3t0;->e:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v0, La/o4g;

    .line 67
    .line 68
    const-wide/16 v6, 0xbd

    .line 69
    .line 70
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/k4g;

    .line 83
    .line 84
    iget-object p0, p0, La/k4g;->c:Ljava/util/List;

    .line 85
    .line 86
    invoke-direct {v0, v1, p0}, La/o4g;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p1, La/u3t0;->i:La/o4g;

    .line 90
    .line 91
    iput v4, p1, La/u3t0;->l:I

    .line 92
    .line 93
    iget-object p0, v2, La/s3t0;->d:La/p7m0;

    .line 94
    .line 95
    invoke-virtual {p0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    if-ne p0, p2, :cond_3

    .line 101
    .line 102
    move-object v5, p2

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object p1, v0

    .line 105
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object p0, v2, La/s3t0;->b:La/p7m0;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-object v5, p1

    .line 117
    :goto_2
    return-object v5

    .line 118
    :pswitch_0
    check-cast v2, La/hl9;

    .line 119
    .line 120
    instance-of v0, p2, La/tl9;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    move-object v0, p2

    .line 125
    check-cast v0, La/tl9;

    .line 126
    .line 127
    iget v6, v0, La/tl9;->m:I

    .line 128
    .line 129
    and-int v7, v6, v3

    .line 130
    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    sub-int/2addr v6, v3

    .line 134
    iput v6, v0, La/tl9;->m:I

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    new-instance v0, La/tl9;

    .line 138
    .line 139
    invoke-direct {v0, p0, p2}, La/tl9;-><init>(La/ul9;La/zje;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    iget-object p2, v0, La/tl9;->k:Ljava/lang/Object;

    .line 143
    .line 144
    sget-object v3, La/wne;->a:La/wne;

    .line 145
    .line 146
    iget v6, v0, La/tl9;->m:I

    .line 147
    .line 148
    const/4 v7, 0x2

    .line 149
    if-eqz v6, :cond_7

    .line 150
    .line 151
    if-eq v6, v4, :cond_6

    .line 152
    .line 153
    if-ne v6, v7, :cond_5

    .line 154
    .line 155
    iget-object p0, v0, La/tl9;->j:La/o4g;

    .line 156
    .line 157
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_d

    .line 161
    .line 162
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_e

    .line 166
    .line 167
    :cond_6
    iget-object p1, v0, La/tl9;->i:Ljava/util/List;

    .line 168
    .line 169
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object p2, p0, La/ul9;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p2, La/r7v;

    .line 179
    .line 180
    const-wide/16 v8, 0x0

    .line 181
    .line 182
    invoke-static {v8, v9}, La/cs0;->u(J)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iput-object p1, v0, La/tl9;->i:Ljava/util/List;

    .line 187
    .line 188
    iput v4, v0, La/tl9;->m:I

    .line 189
    .line 190
    iget-object p2, p2, La/r7v;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p2, La/zm;

    .line 193
    .line 194
    invoke-virtual {p2}, La/zm;->invoke()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    check-cast p2, La/lk9;

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    invoke-interface {p2, v1, v6, v0}, La/lk9;->b(Ljava/util/List;ILa/yje;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-ne p2, v3, :cond_8

    .line 206
    .line 207
    goto/16 :goto_c

    .line 208
    .line 209
    :cond_8
    :goto_4
    check-cast p2, La/dx5;

    .line 210
    .line 211
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    check-cast p2, Ljava/util/List;

    .line 216
    .line 217
    new-instance v1, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    :cond_9
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_a

    .line 231
    .line 232
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    check-cast v8, La/r4g;

    .line 237
    .line 238
    iget-object v8, v8, La/r4g;->a:Ljava/lang/Long;

    .line 239
    .line 240
    if-eqz v8, :cond_9

    .line 241
    .line 242
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    new-instance v6, La/sx3;

    .line 247
    .line 248
    invoke-direct {v6, p2, v4}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 249
    .line 250
    .line 251
    new-instance p2, La/vlf;

    .line 252
    .line 253
    const/16 v8, 0xf

    .line 254
    .line 255
    invoke-direct {p2, v8}, La/vlf;-><init>(B)V

    .line 256
    .line 257
    .line 258
    invoke-static {v6, p2}, La/pgi0;->q(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    new-instance v6, La/eoh0;

    .line 263
    .line 264
    const/16 v8, 0x17

    .line 265
    .line 266
    invoke-direct {v6, v8}, La/eoh0;-><init>(B)V

    .line 267
    .line 268
    .line 269
    invoke-static {p2, v6}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 274
    .line 275
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 276
    .line 277
    .line 278
    new-instance v8, La/bkq;

    .line 279
    .line 280
    invoke-direct {v8, p2}, La/bkq;-><init>(La/ckq;)V

    .line 281
    .line 282
    .line 283
    :goto_6
    invoke-virtual {v8}, La/bkq;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    if-eqz p2, :cond_c

    .line 288
    .line 289
    invoke-virtual {v8}, La/bkq;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    move-object v9, p2

    .line 294
    check-cast v9, La/n4g;

    .line 295
    .line 296
    iget-object v9, v9, La/n4g;->a:Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    if-nez v10, :cond_b

    .line 303
    .line 304
    new-instance v10, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_b
    check-cast v10, Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v10, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_c
    new-instance p2, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    :cond_d
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eqz v8, :cond_11

    .line 336
    .line 337
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    check-cast v8, Ljava/util/Map$Entry;

    .line 342
    .line 343
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    check-cast v9, Ljava/lang/Iterable;

    .line 348
    .line 349
    new-instance v10, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    :cond_e
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    if-eqz v11, :cond_f

    .line 363
    .line 364
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    check-cast v11, La/n4g;

    .line 369
    .line 370
    iget-object v11, v11, La/n4g;->b:Ljava/util/List;

    .line 371
    .line 372
    if-eqz v11, :cond_e

    .line 373
    .line 374
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_f
    invoke-static {v10}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    check-cast v9, Ljava/lang/Iterable;

    .line 387
    .line 388
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    check-cast v8, Ljava/lang/Integer;

    .line 397
    .line 398
    if-eqz v8, :cond_10

    .line 399
    .line 400
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    new-instance v10, La/d5g;

    .line 409
    .line 410
    invoke-direct {v10, v8, v9}, La/d5g;-><init>(ILjava/util/List;)V

    .line 411
    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_10
    move-object v10, v5

    .line 415
    :goto_9
    if-eqz v10, :cond_d

    .line 416
    .line 417
    invoke-virtual {p2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_11
    new-instance v6, La/vt5;

    .line 422
    .line 423
    const/16 v8, 0x12

    .line 424
    .line 425
    invoke-direct {v6, v8}, La/vt5;-><init>(B)V

    .line 426
    .line 427
    .line 428
    invoke-static {p2, v6}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object p2

    .line 436
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    check-cast v9, La/d5g;

    .line 449
    .line 450
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p2

    .line 454
    check-cast p2, La/d5g;

    .line 455
    .line 456
    iget v10, v9, La/d5g;->a:I

    .line 457
    .line 458
    invoke-virtual {v6, v4, v10}, Ljava/util/Calendar;->set(II)V

    .line 459
    .line 460
    .line 461
    iget-object v9, v9, La/d5g;->b:Ljava/util/List;

    .line 462
    .line 463
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    check-cast v9, Ljava/lang/Number;

    .line 468
    .line 469
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v9

    .line 473
    sub-int/2addr v9, v4

    .line 474
    invoke-virtual {v6, v7, v9}, Ljava/util/Calendar;->set(II)V

    .line 475
    .line 476
    .line 477
    const/4 v9, 0x5

    .line 478
    invoke-virtual {v6, v9, v4}, Ljava/util/Calendar;->set(II)V

    .line 479
    .line 480
    .line 481
    iget v10, p2, La/d5g;->a:I

    .line 482
    .line 483
    invoke-virtual {v8, v4, v10}, Ljava/util/Calendar;->set(II)V

    .line 484
    .line 485
    .line 486
    iget-object p2, p2, La/d5g;->b:Ljava/util/List;

    .line 487
    .line 488
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    check-cast p2, Ljava/lang/Number;

    .line 493
    .line 494
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result p2

    .line 498
    sub-int/2addr p2, v4

    .line 499
    invoke-virtual {v8, v7, p2}, Ljava/util/Calendar;->set(II)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v8, v9, v7}, Ljava/util/Calendar;->set(II)V

    .line 503
    .line 504
    .line 505
    new-instance p2, Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 508
    .line 509
    .line 510
    :goto_a
    invoke-virtual {v8, v6}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v9

    .line 514
    if-eqz v9, :cond_12

    .line 515
    .line 516
    invoke-virtual {v6, v4}, Ljava/util/Calendar;->get(I)I

    .line 517
    .line 518
    .line 519
    move-result v9

    .line 520
    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    new-instance v11, La/d5g;

    .line 525
    .line 526
    add-int/2addr v10, v4

    .line 527
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    invoke-static {v10}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    invoke-direct {v11, v9, v10}, La/d5g;-><init>(ILjava/util/List;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {p2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    invoke-virtual {v6, v7, v4}, Ljava/util/Calendar;->add(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :catch_0
    move-exception p2

    .line 546
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 547
    .line 548
    .line 549
    sget-object p2, La/iun;->a:La/iun;

    .line 550
    .line 551
    :cond_12
    new-instance v4, La/o4g;

    .line 552
    .line 553
    invoke-direct {v4, v1, p2}, La/o4g;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p0}, La/ul9;->c()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result p2

    .line 564
    if-nez p2, :cond_13

    .line 565
    .line 566
    move-object p1, p0

    .line 567
    goto :goto_b

    .line 568
    :cond_13
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 569
    .line 570
    .line 571
    move-result p0

    .line 572
    if-nez p0, :cond_14

    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_14
    move-object p1, v1

    .line 576
    :goto_b
    iput-object v5, v0, La/tl9;->i:Ljava/util/List;

    .line 577
    .line 578
    iput-object v4, v0, La/tl9;->j:La/o4g;

    .line 579
    .line 580
    iput v7, v0, La/tl9;->m:I

    .line 581
    .line 582
    iget-object p0, v2, La/hl9;->d:La/p7m0;

    .line 583
    .line 584
    invoke-virtual {p0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    sget-object p1, La/wne;->a:La/wne;

    .line 590
    .line 591
    if-ne p0, v3, :cond_15

    .line 592
    .line 593
    :goto_c
    move-object v5, v3

    .line 594
    goto :goto_e

    .line 595
    :cond_15
    move-object p0, v4

    .line 596
    :goto_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    iget-object p1, v2, La/hl9;->b:La/p7m0;

    .line 600
    .line 601
    invoke-virtual {p1, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-object v5, p0

    .line 605
    :goto_e
    return-object v5

    .line 606
    nop

    .line 607
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(La/c5g;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ul9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ul9;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s3t0;

    .line 9
    .line 10
    iget-object p0, p0, La/s3t0;->c:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p0, La/hl9;

    .line 21
    .line 22
    iget-object p0, p0, La/hl9;->c:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    sget-object p1, La/wne;->a:La/wne;

    .line 30
    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
