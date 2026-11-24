.class public final La/b6v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m1e;

.field public final b:La/r2u;

.field public final c:La/ouu;

.field public final d:La/rtu;

.field public final e:La/lbu;

.field public final f:La/v7i;

.field public final g:La/j3c;

.field public final h:La/ieu;

.field public final i:La/n0o0;


# direct methods
.method public constructor <init>(La/m1e;La/r2u;La/ouu;La/rtu;La/lbu;La/v7i;La/j3c;La/pru;La/ieu;)V
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
    iput-object p1, p0, La/b6v;->a:La/m1e;

    .line 8
    .line 9
    iput-object p2, p0, La/b6v;->b:La/r2u;

    .line 10
    .line 11
    iput-object p3, p0, La/b6v;->c:La/ouu;

    .line 12
    .line 13
    iput-object p4, p0, La/b6v;->d:La/rtu;

    .line 14
    .line 15
    iput-object p5, p0, La/b6v;->e:La/lbu;

    .line 16
    .line 17
    iput-object p6, p0, La/b6v;->f:La/v7i;

    .line 18
    .line 19
    iput-object p7, p0, La/b6v;->g:La/j3c;

    .line 20
    .line 21
    iput-object p9, p0, La/b6v;->h:La/ieu;

    .line 22
    .line 23
    new-instance p1, La/b6u;

    .line 24
    .line 25
    const/16 p2, 0xc

    .line 26
    .line 27
    invoke-direct {p1, p8, p2}, La/b6u;-><init>(La/pru;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/b6v;->i:La/n0o0;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/r5v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/r5v;

    .line 7
    .line 8
    iget v1, v0, La/r5v;->l:I

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
    iput v1, v0, La/r5v;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r5v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/r5v;-><init>(La/b6v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/r5v;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r5v;->l:I

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
    iget p1, v0, La/r5v;->i:I

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p2, La/sip;->c:La/sip;

    .line 53
    .line 54
    invoke-static {p2}, La/kpb;->u(La/sip;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput p1, v0, La/r5v;->i:I

    .line 59
    .line 60
    iput v4, v0, La/r5v;->l:I

    .line 61
    .line 62
    iget-object v2, p0, La/b6v;->d:La/rtu;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-virtual {v2, p2, v5, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, La/c3c0;

    .line 73
    .line 74
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 75
    .line 76
    int-to-long v1, p1

    .line 77
    sget-object p1, La/sip;->c:La/sip;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v5, p0, La/b6v;->e:La/lbu;

    .line 86
    .line 87
    iget-object v6, v5, La/lbu;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, La/nru0;

    .line 90
    .line 91
    iget-object v5, v5, La/lbu;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, La/uzc;

    .line 94
    .line 95
    invoke-virtual {v5}, La/uzc;->b()La/jvn;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v7, v6, La/nru0;->c:La/knf0;

    .line 100
    .line 101
    invoke-virtual {v7}, La/knf0;->d()La/lnf0;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    new-instance v8, La/jo20;

    .line 106
    .line 107
    invoke-direct {v8}, La/jo20;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-static {v8, v5}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 111
    .line 112
    .line 113
    iget v5, p2, La/c3c0;->a:I

    .line 114
    .line 115
    invoke-static {v5, v8}, La/qbt;->c(ILjava/util/Map;)V

    .line 116
    .line 117
    .line 118
    iget v5, v7, La/lnf0;->b:I

    .line 119
    .line 120
    invoke-static {v5, v8}, La/qbt;->g(ILjava/util/Map;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v8}, La/qbt;->h(Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    iget-object v5, v7, La/lnf0;->a:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v5, v8}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v8}, La/qbt;->l(Ljava/util/Map;)V

    .line 132
    .line 133
    .line 134
    const-string v5, "sportCategoryId"

    .line 135
    .line 136
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v8, v5, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    iget-boolean v1, p2, La/c3c0;->b:Z

    .line 144
    .line 145
    iget-wide v9, p2, La/c3c0;->c:J

    .line 146
    .line 147
    invoke-static {v8, v1, v9, v10}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 148
    .line 149
    .line 150
    invoke-static {v8}, La/qbt;->p(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, La/jo20;->b()La/jo20;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    iget-object v1, v6, La/nru0;->b:La/jmb;

    .line 158
    .line 159
    iget-object v7, v1, La/jmb;->a:La/or30;

    .line 160
    .line 161
    invoke-static {p1}, La/kpb;->v(La/sip;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    new-instance v11, La/xg0;

    .line 166
    .line 167
    invoke-direct {v11, v6, v0, p2, v3}, La/xg0;-><init>(La/nru0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;La/jo20;La/yje;)V

    .line 168
    .line 169
    .line 170
    const/16 v12, 0xfc

    .line 171
    .line 172
    const/4 v10, 0x0

    .line 173
    invoke-static/range {v7 .. v12}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance p2, La/sot;

    .line 178
    .line 179
    const/16 v0, 0x13

    .line 180
    .line 181
    invoke-direct {p2, v3, p0, v0}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1, p2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    new-instance p1, La/rl2;

    .line 189
    .line 190
    const/4 p2, 0x3

    .line 191
    const/16 v0, 0x1d

    .line 192
    .line 193
    invoke-direct {p1, p2, v3, v0}, La/rl2;-><init>(ILa/yje;B)V

    .line 194
    .line 195
    .line 196
    new-instance p2, La/dnq;

    .line 197
    .line 198
    invoke-direct {p2, p0, p1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 199
    .line 200
    .line 201
    return-object p2
.end method

.method public final b(ILa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/w5v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/w5v;

    .line 7
    .line 8
    iget v1, v0, La/w5v;->n:I

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
    iput v1, v0, La/w5v;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/w5v;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/w5v;-><init>(La/b6v;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/w5v;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/w5v;->n:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v7, 0x1

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x3

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v7, :cond_3

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    if-ne v1, v9, :cond_1

    .line 44
    .line 45
    iget-object p0, v6, La/w5v;->j:La/rtu;

    .line 46
    .line 47
    check-cast p0, La/c3c0;

    .line 48
    .line 49
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_5

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v8

    .line 59
    :cond_2
    iget p1, v6, La/w5v;->i:I

    .line 60
    .line 61
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move v2, p1

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-boolean p1, v6, La/w5v;->k:Z

    .line 67
    .line 68
    iget v1, v6, La/w5v;->i:I

    .line 69
    .line 70
    iget-object v3, v6, La/w5v;->j:La/rtu;

    .line 71
    .line 72
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, La/sip;->c:La/sip;

    .line 80
    .line 81
    invoke-static {p2}, La/kpb;->u(La/sip;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    iget-object v3, p0, La/b6v;->d:La/rtu;

    .line 86
    .line 87
    iput-object v3, v6, La/w5v;->j:La/rtu;

    .line 88
    .line 89
    iput p1, v6, La/w5v;->i:I

    .line 90
    .line 91
    iput-boolean p2, v6, La/w5v;->k:Z

    .line 92
    .line 93
    iput v7, v6, La/w5v;->n:I

    .line 94
    .line 95
    iget-object v1, p0, La/b6v;->h:La/ieu;

    .line 96
    .line 97
    invoke-virtual {v1, v6}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v0, :cond_5

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move-object v10, v1

    .line 105
    move v1, p1

    .line 106
    move p1, p2

    .line 107
    move-object p2, v10

    .line 108
    :goto_2
    check-cast p2, La/elt;

    .line 109
    .line 110
    iget p2, p2, La/elt;->e:I

    .line 111
    .line 112
    iput-object v8, v6, La/w5v;->j:La/rtu;

    .line 113
    .line 114
    iput v1, v6, La/w5v;->i:I

    .line 115
    .line 116
    iput v2, v6, La/w5v;->n:I

    .line 117
    .line 118
    invoke-virtual {v3, p1, p2, v6}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-ne p2, v0, :cond_6

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    move v2, v1

    .line 126
    :goto_3
    check-cast p2, La/c3c0;

    .line 127
    .line 128
    sget-object v3, La/sip;->c:La/sip;

    .line 129
    .line 130
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 131
    .line 132
    iget v5, p2, La/c3c0;->a:I

    .line 133
    .line 134
    iput-object v8, v6, La/w5v;->j:La/rtu;

    .line 135
    .line 136
    iput v2, v6, La/w5v;->i:I

    .line 137
    .line 138
    iput v9, v6, La/w5v;->n:I

    .line 139
    .line 140
    iget-object v1, p0, La/b6v;->c:La/ouu;

    .line 141
    .line 142
    invoke-virtual/range {v1 .. v6}, La/ouu;->D(ILa/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;ILa/zje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    if-ne p2, v0, :cond_7

    .line 147
    .line 148
    :goto_4
    return-object v0

    .line 149
    :cond_7
    :goto_5
    check-cast p2, La/gmq;

    .line 150
    .line 151
    new-instance p0, La/a1t;

    .line 152
    .line 153
    const/16 p1, 0x15

    .line 154
    .line 155
    invoke-direct {p0, p2, p1}, La/a1t;-><init>(La/gmq;B)V

    .line 156
    .line 157
    .line 158
    new-instance p1, La/x5v;

    .line 159
    .line 160
    const/4 p2, 0x0

    .line 161
    invoke-direct {p1, v9, v8, p2}, La/x5v;-><init>(ILa/yje;B)V

    .line 162
    .line 163
    .line 164
    new-instance p2, La/dnq;

    .line 165
    .line 166
    invoke-direct {p2, p0, p1, v7}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 167
    .line 168
    .line 169
    return-object p2
.end method

.method public final c(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/z5v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/z5v;

    .line 7
    .line 8
    iget v1, v0, La/z5v;->n:I

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
    iput v1, v0, La/z5v;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z5v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/z5v;-><init>(La/b6v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/z5v;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z5v;->n:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/z5v;->j:La/gmq;

    .line 41
    .line 42
    check-cast p0, La/gmq;

    .line 43
    .line 44
    iget-object p1, v0, La/z5v;->i:La/gmq;

    .line 45
    .line 46
    check-cast p1, La/gmq;

    .line 47
    .line 48
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :cond_2
    iget p2, v0, La/z5v;->k:I

    .line 59
    .line 60
    iget-object p1, v0, La/z5v;->i:La/gmq;

    .line 61
    .line 62
    check-cast p1, La/gmq;

    .line 63
    .line 64
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance p3, La/y5v;

    .line 72
    .line 73
    invoke-direct {p3, p0, p1, v5}, La/y5v;-><init>(La/b6v;Ljava/util/List;La/yje;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/vsg0;

    .line 77
    .line 78
    invoke-direct {p1, p3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, v0, La/z5v;->i:La/gmq;

    .line 82
    .line 83
    iput p2, v0, La/z5v;->k:I

    .line 84
    .line 85
    iput v4, v0, La/z5v;->n:I

    .line 86
    .line 87
    invoke-virtual {p0, p2, v0}, La/b6v;->b(ILa/zje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    if-ne p3, v1, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    :goto_1
    check-cast p3, La/gmq;

    .line 95
    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, La/gmq;

    .line 98
    .line 99
    iput-object v2, v0, La/z5v;->i:La/gmq;

    .line 100
    .line 101
    move-object v2, p3

    .line 102
    check-cast v2, La/gmq;

    .line 103
    .line 104
    iput-object v2, v0, La/z5v;->j:La/gmq;

    .line 105
    .line 106
    iput p2, v0, La/z5v;->k:I

    .line 107
    .line 108
    iput v3, v0, La/z5v;->n:I

    .line 109
    .line 110
    invoke-virtual {p0, p2, v0}, La/b6v;->a(ILa/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v1, :cond_5

    .line 115
    .line 116
    :goto_2
    return-object v1

    .line 117
    :cond_5
    move-object v6, p3

    .line 118
    move-object p3, p0

    .line 119
    move-object p0, v6

    .line 120
    :goto_3
    check-cast p3, La/gmq;

    .line 121
    .line 122
    new-instance p2, La/ipt;

    .line 123
    .line 124
    const/4 v0, 0x4

    .line 125
    invoke-direct {p2, v0, v5, v3}, La/ipt;-><init>(ILa/yje;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, p0, p3, p2}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance p1, La/x5v;

    .line 133
    .line 134
    const/4 p2, 0x3

    .line 135
    invoke-direct {p1, p2, v5, v4}, La/x5v;-><init>(ILa/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance p2, La/dnq;

    .line 139
    .line 140
    invoke-direct {p2, p0, p1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 141
    .line 142
    .line 143
    return-object p2
.end method
