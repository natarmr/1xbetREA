.class public final La/eh1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:Z

.field public final synthetic l:J

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/lang/String;La/pz40;La/pz40;La/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/eh1;->i:B

    .line 25
    iput-wide p1, p0, La/eh1;->l:J

    iput-object p3, p0, La/eh1;->m:Ljava/lang/Object;

    iput-object p4, p0, La/eh1;->n:Ljava/lang/Object;

    iput-object p5, p0, La/eh1;->o:Ljava/lang/Object;

    iput-object p6, p0, La/eh1;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/h3v0;JJZLjava/lang/String;La/csr;Ljava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/eh1;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/eh1;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/eh1;->j:J

    .line 7
    .line 8
    iput-wide p4, p0, La/eh1;->l:J

    .line 9
    .line 10
    iput-boolean p6, p0, La/eh1;->k:Z

    .line 11
    .line 12
    iput-object p7, p0, La/eh1;->m:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p8, p0, La/eh1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p9, p0, La/eh1;->p:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(La/mh1;JLjava/lang/String;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/eh1;->i:B

    .line 23
    iput-object p1, p0, La/eh1;->o:Ljava/lang/Object;

    iput-wide p2, p0, La/eh1;->l:J

    iput-object p4, p0, La/eh1;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/pz40;La/a4x;La/pz40;Lkotlin/jvm/functions/Function0;JJLa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/eh1;->i:B

    .line 24
    iput-object p1, p0, La/eh1;->n:Ljava/lang/Object;

    iput-object p2, p0, La/eh1;->o:Ljava/lang/Object;

    iput-object p3, p0, La/eh1;->m:Ljava/lang/Object;

    iput-object p4, p0, La/eh1;->p:Ljava/lang/Object;

    iput-wide p5, p0, La/eh1;->j:J

    iput-wide p7, p0, La/eh1;->l:J

    invoke-direct {p0, v0, p9}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte p1, p0, La/eh1;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/eh1;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/eh1;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/eh1;

    .line 11
    .line 12
    iget-object p1, p0, La/eh1;->n:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    check-cast v3, La/h3v0;

    .line 16
    .line 17
    iget-wide v4, p0, La/eh1;->j:J

    .line 18
    .line 19
    iget-boolean v8, p0, La/eh1;->k:Z

    .line 20
    .line 21
    iget-object p1, p0, La/eh1;->m:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v9, p1

    .line 24
    check-cast v9, Ljava/lang/String;

    .line 25
    .line 26
    move-object v10, v1

    .line 27
    check-cast v10, La/csr;

    .line 28
    .line 29
    move-object v11, v0

    .line 30
    check-cast v11, Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v6, p0, La/eh1;->l:J

    .line 33
    .line 34
    move-object v12, p2

    .line 35
    invoke-direct/range {v2 .. v12}, La/eh1;-><init>(La/h3v0;JJZLjava/lang/String;La/csr;Ljava/lang/String;La/yje;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_0
    move-object v12, p2

    .line 40
    new-instance v3, La/eh1;

    .line 41
    .line 42
    iget-object p1, p0, La/eh1;->n:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, p1

    .line 45
    check-cast v4, La/pz40;

    .line 46
    .line 47
    move-object v5, v1

    .line 48
    check-cast v5, La/a4x;

    .line 49
    .line 50
    iget-object p1, p0, La/eh1;->m:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v6, p1

    .line 53
    check-cast v6, La/pz40;

    .line 54
    .line 55
    move-object v7, v0

    .line 56
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    iget-wide v8, p0, La/eh1;->j:J

    .line 59
    .line 60
    iget-wide v10, p0, La/eh1;->l:J

    .line 61
    .line 62
    invoke-direct/range {v3 .. v12}, La/eh1;-><init>(La/pz40;La/a4x;La/pz40;Lkotlin/jvm/functions/Function0;JJLa/yje;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :pswitch_1
    move-object v12, p2

    .line 67
    new-instance v3, La/eh1;

    .line 68
    .line 69
    iget-object p1, p0, La/eh1;->m:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v6, p1

    .line 72
    check-cast v6, Ljava/lang/String;

    .line 73
    .line 74
    iget-object p1, p0, La/eh1;->n:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v7, p1

    .line 77
    check-cast v7, La/pz40;

    .line 78
    .line 79
    move-object v8, v1

    .line 80
    check-cast v8, La/pz40;

    .line 81
    .line 82
    move-object v9, v0

    .line 83
    check-cast v9, La/pz40;

    .line 84
    .line 85
    iget-wide v4, p0, La/eh1;->l:J

    .line 86
    .line 87
    move-object v10, v12

    .line 88
    invoke-direct/range {v3 .. v10}, La/eh1;-><init>(JLjava/lang/String;La/pz40;La/pz40;La/pz40;La/yje;)V

    .line 89
    .line 90
    .line 91
    return-object v3

    .line 92
    :pswitch_2
    move-object v12, p2

    .line 93
    new-instance v3, La/eh1;

    .line 94
    .line 95
    move-object v4, v1

    .line 96
    check-cast v4, La/mh1;

    .line 97
    .line 98
    iget-wide v5, p0, La/eh1;->l:J

    .line 99
    .line 100
    move-object v7, v0

    .line 101
    check-cast v7, Ljava/lang/String;

    .line 102
    .line 103
    move-object v8, v12

    .line 104
    invoke-direct/range {v3 .. v8}, La/eh1;-><init>(La/mh1;JLjava/lang/String;La/yje;)V

    .line 105
    .line 106
    .line 107
    return-object v3

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/eh1;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/eh1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/eh1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/eh1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/eh1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/eh1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/eh1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/eh1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/eh1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/eh1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/eh1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/eh1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/eh1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eh1;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-wide v4, v0, La/eh1;->l:J

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, v0, La/eh1;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v9, v0, La/eh1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v10, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, La/eh1;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/h3v0;

    .line 28
    .line 29
    iget-wide v2, v0, La/eh1;->j:J

    .line 30
    .line 31
    iget-object v7, v1, La/h3v0;->a:La/btt0;

    .line 32
    .line 33
    invoke-virtual {v7}, La/btt0;->a()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    iget-boolean v11, v0, La/eh1;->k:Z

    .line 38
    .line 39
    iget-object v0, v0, La/eh1;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    check-cast v9, La/csr;

    .line 44
    .line 45
    check-cast v8, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, v1, La/h3v0;->e:La/knf0;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v12, v9, La/csr;->a:La/bsr;

    .line 56
    .line 57
    iget-object v13, v12, La/bsr;->a:La/esr;

    .line 58
    .line 59
    invoke-virtual {v13}, La/esr;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    if-nez v14, :cond_1

    .line 64
    .line 65
    invoke-virtual {v13}, La/esr;->b()Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-eqz v14, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v10, v6

    .line 73
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    const-string v15, ""

    .line 81
    .line 82
    if-lez v14, :cond_2

    .line 83
    .line 84
    const-string v14, "Bearer "

    .line 85
    .line 86
    invoke-static {v7, v14, v15, v6}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const-string v7, "&ut="

    .line 91
    .line 92
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    move-object v6, v15

    .line 98
    :goto_1
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v9}, La/csr;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_3

    .line 107
    .line 108
    move-object v7, v15

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    iget-short v7, v13, La/esr;->a:S

    .line 111
    .line 112
    const-string v9, "&games_bonuses_code="

    .line 113
    .line 114
    invoke-static {v7, v9}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    :goto_2
    if-eqz v10, :cond_4

    .line 119
    .line 120
    iget-wide v9, v12, La/bsr;->c:D

    .line 121
    .line 122
    new-instance v12, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v13, "&games_bonuses_value="

    .line 125
    .line 126
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    move-object v9, v15

    .line 138
    :goto_3
    if-eqz v11, :cond_5

    .line 139
    .line 140
    const-string v10, "&demo="

    .line 141
    .line 142
    invoke-static {v11, v10}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    :cond_5
    new-instance v10, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string v0, "/games-frame/games/"

    .line 152
    .line 153
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v0, "?view=Mobile&wh=22"

    .line 160
    .line 161
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v0, "&ai="

    .line 165
    .line 166
    invoke-static {v10, v4, v5, v6, v0}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "&lg="

    .line 170
    .line 171
    const-string v2, "&mpi=1357"

    .line 172
    .line 173
    invoke-static {v10, v0, v1, v2, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const-string v0, "&sid="

    .line 177
    .line 178
    invoke-static {v10, v9, v15, v0, v8}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v4, v0, La/eh1;->k:Z

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    if-ne v4, v10, :cond_6

    .line 190
    .line 191
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v3, v0, La/eh1;->n:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, La/pz40;

    .line 205
    .line 206
    new-instance v4, La/jxr0;

    .line 207
    .line 208
    invoke-direct {v4, v3, v2}, La/jxr0;-><init>(La/pz40;B)V

    .line 209
    .line 210
    .line 211
    invoke-static {v7, v4}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-instance v11, La/e2u;

    .line 216
    .line 217
    move-object v12, v9

    .line 218
    check-cast v12, La/a4x;

    .line 219
    .line 220
    iget-object v3, v0, La/eh1;->m:Ljava/lang/Object;

    .line 221
    .line 222
    move-object v13, v3

    .line 223
    check-cast v13, La/pz40;

    .line 224
    .line 225
    move-object v14, v8

    .line 226
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 227
    .line 228
    iget-wide v3, v0, La/eh1;->j:J

    .line 229
    .line 230
    iget-wide v5, v0, La/eh1;->l:J

    .line 231
    .line 232
    const/16 v19, 0x1

    .line 233
    .line 234
    move-wide v15, v3

    .line 235
    move-wide/from16 v17, v5

    .line 236
    .line 237
    invoke-direct/range {v11 .. v19}, La/e2u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJB)V

    .line 238
    .line 239
    .line 240
    iput-boolean v10, v0, La/eh1;->k:Z

    .line 241
    .line 242
    invoke-virtual {v2, v11, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-ne v0, v1, :cond_8

    .line 247
    .line 248
    move-object v7, v1

    .line 249
    goto :goto_5

    .line 250
    :cond_8
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    :goto_5
    return-object v7

    .line 253
    :pswitch_1
    iget-object v1, v0, La/eh1;->m:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, Ljava/lang/String;

    .line 256
    .line 257
    check-cast v9, La/pz40;

    .line 258
    .line 259
    iget-object v2, v0, La/eh1;->n:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v2, La/pz40;

    .line 262
    .line 263
    sget-object v6, La/wne;->a:La/wne;

    .line 264
    .line 265
    iget-boolean v11, v0, La/eh1;->k:Z

    .line 266
    .line 267
    const-wide/16 v12, 0x3e8

    .line 268
    .line 269
    if-eqz v11, :cond_a

    .line 270
    .line 271
    if-ne v11, v10, :cond_9

    .line 272
    .line 273
    iget-wide v3, v0, La/eh1;->j:J

    .line 274
    .line 275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-interface {v2, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :goto_6
    const-wide/16 v14, 0x0

    .line 292
    .line 293
    cmp-long v3, v4, v14

    .line 294
    .line 295
    if-lez v3, :cond_c

    .line 296
    .line 297
    const-wide/16 v14, 0x1f4

    .line 298
    .line 299
    add-long/2addr v14, v4

    .line 300
    div-long/2addr v14, v12

    .line 301
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-interface {v9, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    sget-object v3, La/wen;->b:La/uen;

    .line 321
    .line 322
    const/16 v3, 0x3e8

    .line 323
    .line 324
    sget-object v7, La/bfn;->d:La/bfn;

    .line 325
    .line 326
    invoke-static {v3, v7}, La/ibc;->v0(ILa/bfn;)J

    .line 327
    .line 328
    .line 329
    move-result-wide v14

    .line 330
    iput-wide v4, v0, La/eh1;->j:J

    .line 331
    .line 332
    iput-boolean v10, v0, La/eh1;->k:Z

    .line 333
    .line 334
    invoke-static {v14, v15, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    if-ne v3, v6, :cond_b

    .line 339
    .line 340
    move-object v7, v6

    .line 341
    goto :goto_8

    .line 342
    :cond_b
    move-wide v3, v4

    .line 343
    :goto_7
    sub-long v4, v3, v12

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 347
    .line 348
    invoke-interface {v2, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    const-string v0, "0"

    .line 352
    .line 353
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    check-cast v8, La/pz40;

    .line 369
    .line 370
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    check-cast v0, La/bby;

    .line 375
    .line 376
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 377
    .line 378
    .line 379
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    :goto_8
    return-object v7

    .line 382
    :pswitch_2
    check-cast v9, La/mh1;

    .line 383
    .line 384
    sget-object v1, La/wne;->a:La/wne;

    .line 385
    .line 386
    iget-boolean v11, v0, La/eh1;->k:Z

    .line 387
    .line 388
    if-eqz v11, :cond_e

    .line 389
    .line 390
    if-ne v11, v10, :cond_d

    .line 391
    .line 392
    iget-wide v1, v0, La/eh1;->j:J

    .line 393
    .line 394
    iget-object v3, v0, La/eh1;->m:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v3, Ljava/lang/String;

    .line 397
    .line 398
    iget-object v0, v0, La/eh1;->n:Ljava/lang/Object;

    .line 399
    .line 400
    move-object v9, v0

    .line 401
    check-cast v9, La/mh1;

    .line 402
    .line 403
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    move-wide v4, v1

    .line 407
    move-object v6, v3

    .line 408
    :goto_9
    move-object v3, v9

    .line 409
    goto/16 :goto_a

    .line 410
    .line 411
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_c

    .line 415
    .line 416
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iget-object v3, v9, La/mh1;->I:La/qu;

    .line 420
    .line 421
    iget-object v3, v3, La/qu;->a:La/kt2;

    .line 422
    .line 423
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    new-instance v11, Lkotlin/Pair;

    .line 428
    .line 429
    const-string v12, "tournament_id"

    .line 430
    .line 431
    invoke-direct {v11, v12, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    new-instance v7, Lkotlin/Pair;

    .line 435
    .line 436
    const-string v12, "screen"

    .line 437
    .line 438
    const-string v13, "promo"

    .line 439
    .line 440
    invoke-direct {v7, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    filled-new-array {v11, v7}, [Lkotlin/Pair;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-static {v7}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    const-string v11, "tournament_call"

    .line 452
    .line 453
    invoke-interface {v3, v11, v7}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 454
    .line 455
    .line 456
    iget-object v3, v9, La/mh1;->G:La/zr1;

    .line 457
    .line 458
    iget-object v3, v3, La/zr1;->a:La/s1p;

    .line 459
    .line 460
    new-instance v7, La/i1p;

    .line 461
    .line 462
    invoke-direct {v7, v2, v4, v5}, La/i1p;-><init>(BJ)V

    .line 463
    .line 464
    .line 465
    new-instance v11, La/j1p;

    .line 466
    .line 467
    invoke-direct {v11, v13, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 468
    .line 469
    .line 470
    new-array v2, v2, [La/k1p;

    .line 471
    .line 472
    aput-object v7, v2, v6

    .line 473
    .line 474
    aput-object v11, v2, v10

    .line 475
    .line 476
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const-wide/16 v6, 0xc17

    .line 481
    .line 482
    invoke-virtual {v3, v2, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    check-cast v2, La/pf1;

    .line 490
    .line 491
    iget-object v2, v2, La/pf1;->D:La/th90;

    .line 492
    .line 493
    new-instance v3, Ljava/lang/Long;

    .line 494
    .line 495
    invoke-direct {v3, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 496
    .line 497
    .line 498
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, La/myr0;

    .line 503
    .line 504
    if-eqz v2, :cond_11

    .line 505
    .line 506
    move-object v15, v8

    .line 507
    check-cast v15, Ljava/lang/String;

    .line 508
    .line 509
    iget-object v3, v2, La/myr0;->d:La/kyr0;

    .line 510
    .line 511
    instance-of v3, v3, La/jyr0;

    .line 512
    .line 513
    iget-object v2, v2, La/myr0;->b:La/z1s0;

    .line 514
    .line 515
    sget-object v4, La/z1s0;->b:La/z1s0;

    .line 516
    .line 517
    iget-wide v12, v0, La/eh1;->l:J

    .line 518
    .line 519
    if-ne v2, v4, :cond_10

    .line 520
    .line 521
    if-nez v3, :cond_10

    .line 522
    .line 523
    iget-object v2, v9, La/mh1;->O:La/ytt;

    .line 524
    .line 525
    sget-object v3, La/aue0;->d:La/aue0;

    .line 526
    .line 527
    iput-object v9, v0, La/eh1;->n:Ljava/lang/Object;

    .line 528
    .line 529
    iput-object v15, v0, La/eh1;->m:Ljava/lang/Object;

    .line 530
    .line 531
    iput-wide v12, v0, La/eh1;->j:J

    .line 532
    .line 533
    iput-boolean v10, v0, La/eh1;->k:Z

    .line 534
    .line 535
    invoke-virtual {v2, v3, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    if-ne v0, v1, :cond_f

    .line 540
    .line 541
    move-object v7, v1

    .line 542
    goto :goto_c

    .line 543
    :cond_f
    move-wide v4, v12

    .line 544
    move-object v6, v15

    .line 545
    goto/16 :goto_9

    .line 546
    .line 547
    :goto_a
    iget-object v0, v3, La/mh1;->Y:La/oeg0;

    .line 548
    .line 549
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    new-instance v2, La/mz0;

    .line 554
    .line 555
    const/4 v7, 0x1

    .line 556
    invoke-direct/range {v2 .. v7}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 560
    .line 561
    .line 562
    goto :goto_b

    .line 563
    :cond_10
    iget-object v0, v9, La/mh1;->C:La/s91;

    .line 564
    .line 565
    new-instance v1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 566
    .line 567
    new-instance v21, La/qm1;

    .line 568
    .line 569
    sget-object v14, La/s9s0;->a:La/s9s0;

    .line 570
    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    move-object/from16 v11, v21

    .line 574
    .line 575
    invoke-direct/range {v11 .. v16}, La/qm1;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 576
    .line 577
    .line 578
    const/16 v28, 0x0

    .line 579
    .line 580
    const/16 v29, 0x1f7

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/16 v18, 0x0

    .line 585
    .line 586
    const-wide/16 v19, 0x0

    .line 587
    .line 588
    const/16 v22, 0x0

    .line 589
    .line 590
    const-wide/16 v23, 0x0

    .line 591
    .line 592
    const-wide/16 v25, 0x0

    .line 593
    .line 594
    const/16 v27, 0x0

    .line 595
    .line 596
    move-object/from16 v16, v1

    .line 597
    .line 598
    invoke-direct/range {v16 .. v29}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0, v1}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 602
    .line 603
    .line 604
    :cond_11
    :goto_b
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 605
    .line 606
    :goto_c
    return-object v7

    .line 607
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
