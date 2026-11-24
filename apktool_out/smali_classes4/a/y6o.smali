.class public final La/y6o;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/b7o;

.field public final synthetic k:La/hdb;


# direct methods
.method public constructor <init>(La/b7o;La/hdb;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/y6o;->j:La/b7o;

    .line 2
    .line 3
    iput-object p2, p0, La/y6o;->k:La/hdb;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/y6o;

    .line 2
    .line 3
    iget-object v0, p0, La/y6o;->j:La/b7o;

    .line 4
    .line 5
    iget-object p0, p0, La/y6o;->k:La/hdb;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/y6o;-><init>(La/b7o;La/hdb;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/y6o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/y6o;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/y6o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/y6o;->j:La/b7o;

    .line 4
    .line 5
    iget-object v2, v1, La/b7o;->p:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, La/y6o;->i:Z

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    if-ne v4, v5, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v6

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, v1, La/b7o;->G:La/j3c;

    .line 33
    .line 34
    iget-wide v7, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 35
    .line 36
    iput-boolean v5, v0, La/y6o;->i:Z

    .line 37
    .line 38
    invoke-virtual {v4, v7, v8, v0}, La/j3c;->b(JLa/zje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-ne v4, v3, :cond_2

    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget-object v4, v1, La/b7o;->p:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 52
    .line 53
    iget-wide v9, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 54
    .line 55
    const-wide/16 v7, 0x28

    .line 56
    .line 57
    cmp-long v7, v9, v7

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 62
    .line 63
    :goto_1
    move-object/from16 v20, v3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    if-eqz v3, :cond_4

    .line 67
    .line 68
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :goto_2
    iget-object v3, v1, La/b7o;->x:La/z0s;

    .line 75
    .line 76
    iget-wide v11, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 77
    .line 78
    iget-wide v13, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->j:J

    .line 79
    .line 80
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, La/l6o;

    .line 85
    .line 86
    iget-object v4, v4, La/l6o;->p:La/sff0;

    .line 87
    .line 88
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, La/l6o;

    .line 93
    .line 94
    iget-object v7, v7, La/l6o;->q:Ljava/util/List;

    .line 95
    .line 96
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, La/l6o;

    .line 101
    .line 102
    iget-object v8, v8, La/l6o;->e:La/ypl0;

    .line 103
    .line 104
    move-object/from16 v17, v8

    .line 105
    .line 106
    iget v8, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->k:I

    .line 107
    .line 108
    iget-boolean v15, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->b:Z

    .line 109
    .line 110
    iget-object v2, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->i:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    if-nez v16, :cond_8

    .line 117
    .line 118
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, La/l6o;

    .line 123
    .line 124
    iget-object v2, v2, La/l6o;->c:La/jlr;

    .line 125
    .line 126
    move/from16 v22, v5

    .line 127
    .line 128
    instance-of v5, v2, La/xkr;

    .line 129
    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    check-cast v2, La/xkr;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    move-object v2, v6

    .line 136
    :goto_3
    if-eqz v2, :cond_6

    .line 137
    .line 138
    iget-object v2, v2, La/xkr;->d:La/m9s;

    .line 139
    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    iget-object v2, v2, La/m9s;->f:Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    move-object v2, v6

    .line 146
    :goto_4
    if-nez v2, :cond_7

    .line 147
    .line 148
    const-string v2, ""

    .line 149
    .line 150
    :cond_7
    :goto_5
    move-object/from16 v18, v2

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_8
    move/from16 v22, v5

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :goto_6
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, La/l6o;

    .line 161
    .line 162
    iget-object v2, v2, La/l6o;->c:La/jlr;

    .line 163
    .line 164
    instance-of v5, v2, La/xkr;

    .line 165
    .line 166
    if-eqz v5, :cond_9

    .line 167
    .line 168
    check-cast v2, La/xkr;

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_9
    move-object v2, v6

    .line 172
    :goto_7
    if-eqz v2, :cond_a

    .line 173
    .line 174
    iget-object v6, v2, La/xkr;->d:La/m9s;

    .line 175
    .line 176
    :cond_a
    move-object/from16 v19, v7

    .line 177
    .line 178
    new-instance v7, La/ddb;

    .line 179
    .line 180
    move-object/from16 v16, v4

    .line 181
    .line 182
    move/from16 v21, v15

    .line 183
    .line 184
    move-object v15, v6

    .line 185
    invoke-direct/range {v7 .. v21}, La/ddb;-><init>(IJJJLa/m9s;La/sff0;La/ypl0;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 186
    .line 187
    .line 188
    const/4 v2, 0x2

    .line 189
    new-array v2, v2, [La/hdb;

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    aput-object v7, v2, v4

    .line 193
    .line 194
    iget-object v0, v0, La/y6o;->k:La/hdb;

    .line 195
    .line 196
    aput-object v0, v2, v22

    .line 197
    .line 198
    invoke-static {v1, v3, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 199
    .line 200
    .line 201
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0
.end method
