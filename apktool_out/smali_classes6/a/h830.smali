.class public final La/h830;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/l830;


# direct methods
.method public constructor <init>(La/l830;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/h830;->k:La/l830;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/h830;

    .line 2
    .line 3
    iget-object p0, p0, La/h830;->k:La/l830;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/h830;-><init>(La/l830;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/h830;->j:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/cx7;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/h830;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/h830;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/h830;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/h830;->k:La/l830;

    .line 4
    .line 5
    iget-object v2, v1, La/l830;->q:La/ikt0;

    .line 6
    .line 7
    iget-object v3, v0, La/h830;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/cx7;

    .line 10
    .line 11
    sget-object v4, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-boolean v5, v0, La/h830;->i:Z

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    if-ne v5, v7, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v6

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    instance-of v5, v3, La/ww7;

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    instance-of v5, v3, La/uw7;

    .line 44
    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    :goto_0
    sget-object v5, La/ox7;->a:La/ox7;

    .line 48
    .line 49
    invoke-virtual {v2, v5}, La/ikt0;->b(La/px7;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    :goto_1
    iget-object v5, v1, La/l830;->u:La/owp0;

    .line 54
    .line 55
    sget-object v8, La/idf0;->a:La/idf0;

    .line 56
    .line 57
    invoke-virtual {v5, v8}, La/owp0;->g(La/ldf0;)V

    .line 58
    .line 59
    .line 60
    sget-object v5, La/lx7;->a:La/lx7;

    .line 61
    .line 62
    invoke-virtual {v2, v5}, La/ikt0;->b(La/px7;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    sget v2, La/l830;->A:I

    .line 66
    .line 67
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 68
    .line 69
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 70
    .line 71
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-object v8, v5

    .line 79
    check-cast v8, La/m730;

    .line 80
    .line 81
    iget-object v9, v8, La/m730;->b:Ljava/util/Map;

    .line 82
    .line 83
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    invoke-direct {v10, v9}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v1, La/l830;->x:Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 89
    .line 90
    iget-wide v11, v9, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;->c:J

    .line 91
    .line 92
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-interface {v10, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0xfd

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    const-wide/16 v12, 0x0

    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    invoke-static/range {v8 .. v16}, La/m730;->a(La/m730;Ljava/util/List;Ljava/util/LinkedHashMap;La/l9s;JLa/aw20;La/ycs;I)La/m730;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v2, v5, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    instance-of v2, v3, La/ww7;

    .line 118
    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    iget-object v1, v1, La/l830;->r:La/o030;

    .line 122
    .line 123
    check-cast v3, La/ww7;

    .line 124
    .line 125
    iget-object v2, v3, La/ww7;->a:Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance v3, Ljava/util/ArrayList;

    .line 128
    .line 129
    const/16 v5, 0xa

    .line 130
    .line 131
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, La/ou20;

    .line 153
    .line 154
    iget-object v5, v5, La/ou20;->a:Ljava/util/List;

    .line 155
    .line 156
    invoke-static {v5}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    invoke-static {v3}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-instance v3, La/s030;

    .line 169
    .line 170
    invoke-direct {v3, v2}, La/s030;-><init>(Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    iput-object v6, v0, La/h830;->j:Ljava/lang/Object;

    .line 174
    .line 175
    iput-boolean v7, v0, La/h830;->i:Z

    .line 176
    .line 177
    invoke-virtual {v1, v3, v0}, La/o030;->w(La/h130;La/yje;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-ne v0, v4, :cond_7

    .line 182
    .line 183
    return-object v4

    .line 184
    :cond_7
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0
.end method
