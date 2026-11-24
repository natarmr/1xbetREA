.class public final La/bu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bu;->i:B

    iput-object p1, p0, La/bu;->k:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/bu;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/rdn0;

    .line 6
    .line 7
    iget-object v2, v1, La/rdn0;->E:La/a8z;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v0, La/bu;->j:B

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    if-eq v4, v6, :cond_1

    .line 18
    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

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
    const/4 v0, 0x0

    .line 32
    return-object v0

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v4, p1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v1, La/rdn0;->o:La/j3c;

    .line 43
    .line 44
    iput-byte v6, v0, La/bu;->j:B

    .line 45
    .line 46
    invoke-virtual {v4, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-ne v4, v3, :cond_3

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_3
    :goto_0
    move-object v11, v4

    .line 55
    check-cast v11, La/wcb;

    .line 56
    .line 57
    iget-object v4, v1, La/rdn0;->p:La/luu;

    .line 58
    .line 59
    iget-object v4, v4, La/luu;->a:La/nok0;

    .line 60
    .line 61
    invoke-virtual {v4}, La/nok0;->a()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    iget-object v4, v1, La/rdn0;->r:La/lbu;

    .line 66
    .line 67
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, La/sff0;

    .line 76
    .line 77
    iget-boolean v15, v4, La/sff0;->J:Z

    .line 78
    .line 79
    iget-object v4, v1, La/rdn0;->A:La/svu;

    .line 80
    .line 81
    invoke-virtual {v4}, La/svu;->l()Z

    .line 82
    .line 83
    .line 84
    move-result v17

    .line 85
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, La/sff0;

    .line 90
    .line 91
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 92
    .line 93
    iget-object v2, v2, La/mum0;->y:La/v5l0;

    .line 94
    .line 95
    iget-object v4, v1, La/rdn0;->D:La/r9u;

    .line 96
    .line 97
    sget-object v6, La/ygp;->t:La/ygp;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v4, v4, La/r9u;->a:La/j1q0;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v4, v4, La/j1q0;->a:La/m1q0;

    .line 108
    .line 109
    invoke-virtual {v4, v6}, La/m1q0;->d(La/ygp;)Z

    .line 110
    .line 111
    .line 112
    move-result v19

    .line 113
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 114
    .line 115
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 116
    .line 117
    :goto_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object v7, v6

    .line 125
    move-object v6, v7

    .line 126
    check-cast v6, La/hdn0;

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v20, 0x88f

    .line 131
    .line 132
    move-object v8, v7

    .line 133
    const/4 v7, 0x0

    .line 134
    move-object v9, v8

    .line 135
    const/4 v8, 0x0

    .line 136
    move-object v10, v9

    .line 137
    const/4 v9, 0x0

    .line 138
    move-object v14, v10

    .line 139
    const/4 v10, 0x0

    .line 140
    move-object/from16 v16, v14

    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    move-object/from16 v21, v16

    .line 144
    .line 145
    move-object/from16 v16, v2

    .line 146
    .line 147
    move-object/from16 v2, v21

    .line 148
    .line 149
    invoke-static/range {v6 .. v20}, La/hdn0;->a(La/hdn0;Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/hdn0;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-virtual {v4, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_5

    .line 158
    .line 159
    iget-object v1, v1, La/rdn0;->B:La/hjd;

    .line 160
    .line 161
    new-instance v2, La/cid;

    .line 162
    .line 163
    new-instance v4, La/js2;

    .line 164
    .line 165
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v6, "sport_champ_games"

    .line 169
    .line 170
    invoke-direct {v2, v6, v4}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 171
    .line 172
    .line 173
    iput-byte v5, v0, La/bu;->j:B

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v2, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-ne v0, v3, :cond_4

    .line 183
    .line 184
    :goto_2
    return-object v3

    .line 185
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_5
    move-object/from16 v2, v16

    .line 189
    .line 190
    goto :goto_1
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/bu;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ven0;

    .line 6
    .line 7
    iget-object v2, v1, La/ven0;->F:La/a8z;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v0, La/bu;->j:B

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    if-eq v4, v6, :cond_1

    .line 18
    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

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
    const/4 v0, 0x0

    .line 32
    return-object v0

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v4, p1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v1, La/ven0;->p:La/j3c;

    .line 43
    .line 44
    iput-byte v6, v0, La/bu;->j:B

    .line 45
    .line 46
    invoke-virtual {v4, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-ne v4, v3, :cond_3

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_3
    :goto_0
    move-object v11, v4

    .line 55
    check-cast v11, La/wcb;

    .line 56
    .line 57
    iget-object v4, v1, La/ven0;->q:La/luu;

    .line 58
    .line 59
    iget-object v4, v4, La/luu;->a:La/nok0;

    .line 60
    .line 61
    invoke-virtual {v4}, La/nok0;->a()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    iget-object v4, v1, La/ven0;->s:La/lbu;

    .line 66
    .line 67
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, La/sff0;

    .line 76
    .line 77
    iget-boolean v15, v4, La/sff0;->J:Z

    .line 78
    .line 79
    iget-object v4, v1, La/ven0;->B:La/svu;

    .line 80
    .line 81
    invoke-virtual {v4}, La/svu;->l()Z

    .line 82
    .line 83
    .line 84
    move-result v17

    .line 85
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, La/sff0;

    .line 90
    .line 91
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 92
    .line 93
    iget-object v2, v2, La/mum0;->y:La/v5l0;

    .line 94
    .line 95
    iget-object v4, v1, La/ven0;->E:La/r9u;

    .line 96
    .line 97
    sget-object v6, La/ygp;->t:La/ygp;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v4, v4, La/r9u;->a:La/j1q0;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v4, v4, La/j1q0;->a:La/m1q0;

    .line 108
    .line 109
    invoke-virtual {v4, v6}, La/m1q0;->d(La/ygp;)Z

    .line 110
    .line 111
    .line 112
    move-result v19

    .line 113
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 114
    .line 115
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 116
    .line 117
    :goto_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object v7, v6

    .line 125
    move-object v6, v7

    .line 126
    check-cast v6, La/tbn0;

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v20, 0x88f

    .line 131
    .line 132
    move-object v8, v7

    .line 133
    const/4 v7, 0x0

    .line 134
    move-object v9, v8

    .line 135
    const/4 v8, 0x0

    .line 136
    move-object v10, v9

    .line 137
    const/4 v9, 0x0

    .line 138
    move-object v14, v10

    .line 139
    const/4 v10, 0x0

    .line 140
    move-object/from16 v16, v14

    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    move-object/from16 v21, v16

    .line 144
    .line 145
    move-object/from16 v16, v2

    .line 146
    .line 147
    move-object/from16 v2, v21

    .line 148
    .line 149
    invoke-static/range {v6 .. v20}, La/tbn0;->a(La/tbn0;Ljava/util/List;ZLa/tan0;La/zan0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/tbn0;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-virtual {v4, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_5

    .line 158
    .line 159
    iget-object v1, v1, La/ven0;->C:La/hjd;

    .line 160
    .line 161
    new-instance v2, La/cid;

    .line 162
    .line 163
    new-instance v4, La/is2;

    .line 164
    .line 165
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v6, "sport_champ_games"

    .line 169
    .line 170
    invoke-direct {v2, v6, v4}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 171
    .line 172
    .line 173
    iput-byte v5, v0, La/bu;->j:B

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v2, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-ne v0, v3, :cond_4

    .line 183
    .line 184
    :goto_2
    return-object v3

    .line 185
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_5
    move-object/from16 v2, v16

    .line 189
    .line 190
    goto :goto_1
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/bu;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/k7q0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/bu;->j:B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v5, :cond_1

    .line 15
    .line 16
    if-ne v2, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_5

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-byte v5, p0, La/bu;->j:B

    .line 36
    .line 37
    invoke-virtual {v0, p0}, La/k7q0;->t(La/zje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v1, :cond_3

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_3
    :goto_0
    invoke-virtual {v0}, La/k7q0;->f()Lkotlin/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_7

    .line 49
    .line 50
    iget-object v2, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v11, v2

    .line 53
    check-cast v11, Ljava/lang/String;

    .line 54
    .line 55
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, La/o9q0;

    .line 58
    .line 59
    iget-wide v7, p1, La/o9q0;->a:J

    .line 60
    .line 61
    iget-object p1, v0, La/k7q0;->j:La/hw90;

    .line 62
    .line 63
    if-eqz p1, :cond_7

    .line 64
    .line 65
    iput-byte v4, p0, La/bu;->j:B

    .line 66
    .line 67
    move-object v10, p1

    .line 68
    check-cast v10, La/lw90;

    .line 69
    .line 70
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-static {v7, v8}, La/o9q0;->c(J)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    new-instance v6, La/fl3;

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-direct/range {v6 .. v11}, La/fl3;-><init>(JLa/yje;La/lw90;Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, v10, La/lw90;->a:Lkotlin/coroutines/CoroutineContext;

    .line 93
    .line 94
    new-instance v2, La/o3s;

    .line 95
    .line 96
    const/16 v4, 0x1c

    .line 97
    .line 98
    invoke-direct {v2, v10, v6, v3, v4}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v2, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_2
    if-ne p0, v1, :cond_6

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_3
    if-ne p0, v1, :cond_7

    .line 111
    .line 112
    :goto_4
    return-object v1

    .line 113
    :cond_7
    :goto_5
    iput-boolean v5, v0, La/k7q0;->B:Z

    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/bu;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/l2r0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/bu;->j:B

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v0, La/l2r0;->b:La/pmi;

    .line 36
    .line 37
    iput-byte v4, p0, La/bu;->j:B

    .line 38
    .line 39
    invoke-virtual {p1, p0}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-object v0, v0, La/l2r0;->a:La/hsj;

    .line 53
    .line 54
    iput-byte v3, p0, La/bu;->j:B

    .line 55
    .line 56
    invoke-virtual {v0, p1, p0}, La/hsj;->n(ILa/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v1, :cond_4

    .line 61
    .line 62
    :goto_1
    return-object v1

    .line 63
    :cond_4
    return-object p0
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/bu;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ofr0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/bu;->j:B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v6, :cond_2

    .line 16
    .line 17
    if-eq v2, v5, :cond_1

    .line 18
    .line 19
    if-ne v2, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-byte v6, p0, La/bu;->j:B

    .line 43
    .line 44
    sget p1, La/ofr0;->U0:I

    .line 45
    .line 46
    invoke-virtual {v0, p0}, La/ofr0;->X(La/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v1, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    :goto_0
    iput-byte v5, p0, La/bu;->j:B

    .line 54
    .line 55
    sget p1, La/ofr0;->U0:I

    .line 56
    .line 57
    invoke-virtual {v0, p0}, La/ofr0;->W(La/zje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    :goto_1
    iget-object p1, v0, La/ofr0;->p:La/mne;

    .line 65
    .line 66
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 67
    .line 68
    new-instance v2, La/hfr0;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v2, v0, v3, v5}, La/hfr0;-><init>(La/ofr0;La/yje;B)V

    .line 72
    .line 73
    .line 74
    iput-byte v4, p0, La/bu;->j:B

    .line 75
    .line 76
    invoke-static {p1, v2, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v1, :cond_6

    .line 81
    .line 82
    :goto_2
    return-object v1

    .line 83
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/bu;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/wbt0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/bu;->j:B

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v9, p0

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move p1, v4

    .line 37
    iget-object v4, v0, La/wbt0;->w:La/y3v;

    .line 38
    .line 39
    iget-object v2, v0, La/wbt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 40
    .line 41
    iget-wide v5, v2, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->a:J

    .line 42
    .line 43
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/ubt0;

    .line 48
    .line 49
    iget-object v7, v2, La/ubt0;->b:Ljava/util/Date;

    .line 50
    .line 51
    iput-byte p1, p0, La/bu;->j:B

    .line 52
    .line 53
    const/16 v8, 0x5a

    .line 54
    .line 55
    move-object v9, p0

    .line 56
    invoke-virtual/range {v4 .. v9}, La/y3v;->m(JLjava/util/Date;ILa/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    check-cast p1, La/gmq;

    .line 64
    .line 65
    new-instance p0, La/x6s0;

    .line 66
    .line 67
    const/16 v2, 0xf

    .line 68
    .line 69
    invoke-direct {p0, v0, v2}, La/x6s0;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    iput-byte v3, v9, La/bu;->j:B

    .line 73
    .line 74
    invoke-interface {p1, p0, v9}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_4

    .line 79
    .line 80
    :goto_1
    return-object v1

    .line 81
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bu;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bu;

    .line 9
    .line 10
    check-cast p0, La/jdt0;

    .line 11
    .line 12
    const/16 v1, 0x1a

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, La/bu;

    .line 19
    .line 20
    check-cast p0, La/wbt0;

    .line 21
    .line 22
    const/16 v1, 0x19

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/bu;

    .line 29
    .line 30
    check-cast p0, La/ofr0;

    .line 31
    .line 32
    const/16 v1, 0x18

    .line 33
    .line 34
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_2
    new-instance v0, La/bu;

    .line 39
    .line 40
    check-cast p0, La/l2r0;

    .line 41
    .line 42
    const/16 v1, 0x17

    .line 43
    .line 44
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_3
    new-instance v0, La/bu;

    .line 49
    .line 50
    check-cast p0, La/k7q0;

    .line 51
    .line 52
    const/16 v1, 0x16

    .line 53
    .line 54
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_4
    new-instance v0, La/bu;

    .line 59
    .line 60
    check-cast p0, La/fin0;

    .line 61
    .line 62
    const/16 v1, 0x15

    .line 63
    .line 64
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_5
    new-instance v0, La/bu;

    .line 69
    .line 70
    check-cast p0, La/ven0;

    .line 71
    .line 72
    const/16 v1, 0x14

    .line 73
    .line 74
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_6
    new-instance v0, La/bu;

    .line 79
    .line 80
    check-cast p0, La/rdn0;

    .line 81
    .line 82
    const/16 v1, 0x13

    .line 83
    .line 84
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_7
    new-instance v0, La/bu;

    .line 89
    .line 90
    check-cast p0, La/iwk0;

    .line 91
    .line 92
    const/16 v1, 0x12

    .line 93
    .line 94
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_8
    new-instance v0, La/bu;

    .line 99
    .line 100
    check-cast p0, La/p1i0;

    .line 101
    .line 102
    const/16 v1, 0x11

    .line 103
    .line 104
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_9
    new-instance v0, La/bu;

    .line 109
    .line 110
    check-cast p0, La/sih0;

    .line 111
    .line 112
    const/16 v1, 0x10

    .line 113
    .line 114
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_a
    new-instance v0, La/bu;

    .line 119
    .line 120
    check-cast p0, La/hef0;

    .line 121
    .line 122
    const/16 v1, 0xf

    .line 123
    .line 124
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_b
    new-instance v0, La/bu;

    .line 129
    .line 130
    check-cast p0, La/d7f0;

    .line 131
    .line 132
    const/16 v1, 0xe

    .line 133
    .line 134
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_c
    new-instance v0, La/bu;

    .line 139
    .line 140
    check-cast p0, La/pmb0;

    .line 141
    .line 142
    const/16 v1, 0xd

    .line 143
    .line 144
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_d
    new-instance v0, La/bu;

    .line 149
    .line 150
    check-cast p0, La/d430;

    .line 151
    .line 152
    const/16 v1, 0xc

    .line 153
    .line 154
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_e
    new-instance v0, La/bu;

    .line 159
    .line 160
    check-cast p0, La/pn10;

    .line 161
    .line 162
    const/16 v1, 0xb

    .line 163
    .line 164
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 165
    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_f
    new-instance v0, La/bu;

    .line 169
    .line 170
    check-cast p0, La/qi00;

    .line 171
    .line 172
    const/16 v1, 0xa

    .line 173
    .line 174
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_10
    new-instance v0, La/bu;

    .line 179
    .line 180
    check-cast p0, La/eiz;

    .line 181
    .line 182
    const/16 v1, 0x9

    .line 183
    .line 184
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_11
    new-instance v0, La/bu;

    .line 189
    .line 190
    check-cast p0, La/f8y;

    .line 191
    .line 192
    const/16 v1, 0x8

    .line 193
    .line 194
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_12
    new-instance v0, La/bu;

    .line 199
    .line 200
    check-cast p0, La/tkw;

    .line 201
    .line 202
    const/4 v1, 0x7

    .line 203
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_13
    new-instance v0, La/bu;

    .line 208
    .line 209
    check-cast p0, La/a3f;

    .line 210
    .line 211
    const/4 v1, 0x6

    .line 212
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_14
    new-instance v0, La/bu;

    .line 217
    .line 218
    check-cast p0, La/yhc;

    .line 219
    .line 220
    const/4 v1, 0x5

    .line 221
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_15
    new-instance v0, La/bu;

    .line 226
    .line 227
    check-cast p0, La/hk4;

    .line 228
    .line 229
    const/4 v1, 0x4

    .line 230
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_16
    new-instance v0, La/bu;

    .line 235
    .line 236
    check-cast p0, La/kc4;

    .line 237
    .line 238
    const/4 v1, 0x3

    .line 239
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 240
    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_17
    new-instance v0, La/bu;

    .line 244
    .line 245
    check-cast p0, La/hh2;

    .line 246
    .line 247
    const/4 v1, 0x2

    .line 248
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_18
    new-instance v0, La/bu;

    .line 253
    .line 254
    check-cast p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 255
    .line 256
    const/4 v1, 0x1

    .line 257
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_19
    new-instance v0, La/bu;

    .line 262
    .line 263
    check-cast p0, La/cu;

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-direct {v0, p0, p1, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bu;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/bu;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/bu;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/bu;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/bu;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/bu;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/bu;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/bu;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/bu;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/bu;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/bu;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/bu;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_a
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/bu;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/bu;

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_c
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, La/bu;

    .line 182
    .line 183
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_d
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/bu;

    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_e
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/bu;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_f
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/bu;

    .line 221
    .line 222
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_10
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, La/bu;

    .line 234
    .line 235
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_11
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, La/bu;

    .line 247
    .line 248
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :pswitch_12
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, La/bu;

    .line 260
    .line 261
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_13
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/bu;

    .line 273
    .line 274
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_14
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/bu;

    .line 286
    .line 287
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_15
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, La/bu;

    .line 299
    .line 300
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_16
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, La/bu;

    .line 312
    .line 313
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    :pswitch_17
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    check-cast p0, La/bu;

    .line 325
    .line 326
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    return-object p0

    .line 333
    :pswitch_18
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/bu;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_19
    invoke-virtual {p0, p1}, La/bu;->create(La/yje;)La/yje;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    check-cast p0, La/bu;

    .line 351
    .line 352
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    invoke-virtual {p0, p1}, La/bu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    return-object p0

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    iget-byte v0, v14, La/bu;->i:B

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v7, v14, La/bu;->k:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v11, 0x2

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object v10, v7

    .line 22
    check-cast v10, La/jdt0;

    .line 23
    .line 24
    sget-object v12, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-byte v0, v14, La/bu;->j:B

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    if-eq v0, v8, :cond_1

    .line 31
    .line 32
    if-ne v0, v11, :cond_0

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v10, La/jdt0;->r:La/nc0;

    .line 52
    .line 53
    iget-object v1, v10, La/jdt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 54
    .line 55
    iget-wide v2, v1, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 56
    .line 57
    iget-wide v4, v1, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 58
    .line 59
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, La/cdt0;

    .line 64
    .line 65
    iget-object v1, v1, La/cdt0;->j:Ljava/util/Date;

    .line 66
    .line 67
    iput-byte v8, v14, La/bu;->j:B

    .line 68
    .line 69
    const/16 v6, 0x5a

    .line 70
    .line 71
    move-wide/from16 v35, v4

    .line 72
    .line 73
    move-object v5, v1

    .line 74
    move-wide v1, v2

    .line 75
    move-wide/from16 v3, v35

    .line 76
    .line 77
    move-object v7, v14

    .line 78
    invoke-virtual/range {v0 .. v7}, La/nc0;->v(JJLjava/util/Date;ILa/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v12, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    :goto_0
    check-cast v0, La/gmq;

    .line 86
    .line 87
    new-instance v1, La/x6s0;

    .line 88
    .line 89
    const/16 v2, 0x10

    .line 90
    .line 91
    invoke-direct {v1, v10, v2}, La/x6s0;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    iput-byte v11, v14, La/bu;->j:B

    .line 95
    .line 96
    invoke-interface {v0, v1, v14}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-ne v0, v12, :cond_4

    .line 101
    .line 102
    :goto_1
    move-object v9, v12

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_3
    return-object v9

    .line 107
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/bu;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/bu;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/bu;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/bu;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_4
    check-cast v7, La/fin0;

    .line 128
    .line 129
    sget-object v0, La/wne;->a:La/wne;

    .line 130
    .line 131
    iget-byte v1, v14, La/bu;->j:B

    .line 132
    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    if-eq v1, v8, :cond_6

    .line 136
    .line 137
    if-ne v1, v11, :cond_5

    .line 138
    .line 139
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v1, v7, La/fin0;->m:La/p7m0;

    .line 155
    .line 156
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 157
    .line 158
    iput-byte v8, v14, La/bu;->j:B

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v9, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    if-ne v1, v0, :cond_8

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_8
    :goto_4
    iget-object v1, v7, La/fin0;->l:La/p7m0;

    .line 172
    .line 173
    new-instance v2, La/zhn0;

    .line 174
    .line 175
    iget-object v3, v7, La/fin0;->n:La/ra10;

    .line 176
    .line 177
    invoke-direct {v2, v3}, La/zhn0;-><init>(La/ra10;)V

    .line 178
    .line 179
    .line 180
    iput-byte v11, v14, La/bu;->j:B

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v9, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    if-ne v1, v0, :cond_9

    .line 191
    .line 192
    :goto_5
    move-object v9, v0

    .line 193
    goto :goto_7

    .line 194
    :cond_9
    :goto_6
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    :goto_7
    return-object v9

    .line 197
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/bu;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/bu;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_7
    check-cast v7, La/iwk0;

    .line 208
    .line 209
    iget-object v0, v7, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 210
    .line 211
    sget-object v1, La/wne;->a:La/wne;

    .line 212
    .line 213
    iget-byte v2, v14, La/bu;->j:B

    .line 214
    .line 215
    if-eqz v2, :cond_d

    .line 216
    .line 217
    if-eq v2, v8, :cond_c

    .line 218
    .line 219
    if-eq v2, v11, :cond_b

    .line 220
    .line 221
    if-ne v2, v4, :cond_a

    .line 222
    .line 223
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_a
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_c

    .line 231
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v2, v7, La/iwk0;->g0:La/hjd;

    .line 243
    .line 244
    new-instance v3, La/cid;

    .line 245
    .line 246
    iget-object v5, v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 247
    .line 248
    iget-object v6, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->b:Ljava/lang/String;

    .line 249
    .line 250
    iget v9, v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 251
    .line 252
    invoke-virtual {v5, v9}, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a(I)La/ms2;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-direct {v3, v6, v5}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 257
    .line 258
    .line 259
    iput-byte v8, v14, La/bu;->j:B

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v3, v14}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-ne v2, v1, :cond_e

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_e
    :goto_8
    iget-object v2, v7, La/iwk0;->h0:La/rus;

    .line 272
    .line 273
    new-instance v3, La/ell0;

    .line 274
    .line 275
    iget-object v5, v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 276
    .line 277
    iget-object v5, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->b:Ljava/lang/String;

    .line 278
    .line 279
    invoke-direct {v3, v5}, La/ell0;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iput-byte v11, v14, La/bu;->j:B

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v3, v14}, La/rus;->k(La/jll0;La/zje;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    if-ne v2, v1, :cond_f

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_f
    :goto_9
    iget-object v2, v7, La/iwk0;->i0:La/ove;

    .line 295
    .line 296
    new-instance v3, La/dbv0;

    .line 297
    .line 298
    iget-object v5, v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 299
    .line 300
    iget-object v6, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->b:Ljava/lang/String;

    .line 301
    .line 302
    iget v0, v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 303
    .line 304
    invoke-virtual {v5, v0}, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a(I)La/ms2;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {v3, v6, v0}, La/dbv0;-><init>(Ljava/lang/String;La/ms2;)V

    .line 309
    .line 310
    .line 311
    iput-byte v4, v14, La/bu;->j:B

    .line 312
    .line 313
    invoke-virtual {v2, v3, v14}, La/ove;->r(La/mbv0;La/zje;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-ne v0, v1, :cond_10

    .line 318
    .line 319
    :goto_a
    move-object v9, v1

    .line 320
    goto :goto_c

    .line 321
    :cond_10
    :goto_b
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    :goto_c
    return-object v9

    .line 324
    :pswitch_8
    check-cast v7, La/p1i0;

    .line 325
    .line 326
    sget-object v0, La/wne;->a:La/wne;

    .line 327
    .line 328
    iget-byte v1, v14, La/bu;->j:B

    .line 329
    .line 330
    if-eqz v1, :cond_13

    .line 331
    .line 332
    if-eq v1, v8, :cond_12

    .line 333
    .line 334
    if-ne v1, v11, :cond_11

    .line 335
    .line 336
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_f

    .line 340
    :cond_11
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    goto :goto_11

    .line 344
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v1, p1

    .line 348
    .line 349
    goto :goto_d

    .line 350
    :cond_13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    iget-object v1, v7, La/p1i0;->r:La/lbu;

    .line 354
    .line 355
    iput-byte v8, v14, La/bu;->j:B

    .line 356
    .line 357
    invoke-virtual {v1, v14}, La/lbu;->e(La/zje;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    if-ne v1, v0, :cond_14

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :cond_14
    :goto_d
    check-cast v1, Ljava/util/Set;

    .line 365
    .line 366
    iget-object v2, v7, La/p1i0;->s:La/dpi0;

    .line 367
    .line 368
    iput-byte v11, v14, La/bu;->j:B

    .line 369
    .line 370
    invoke-virtual {v2, v1, v14}, La/dpi0;->i(Ljava/util/Set;La/bnn0;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    if-ne v1, v0, :cond_15

    .line 375
    .line 376
    :goto_e
    move-object v9, v0

    .line 377
    goto :goto_11

    .line 378
    :cond_15
    :goto_f
    iget-object v0, v7, La/p1i0;->v:La/i1w0;

    .line 379
    .line 380
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    new-instance v2, La/c8d;

    .line 385
    .line 386
    sget-object v4, La/y7d;->a:La/v7d;

    .line 387
    .line 388
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    :goto_10
    move-object v2, v1

    .line 396
    check-cast v2, La/paw;

    .line 397
    .line 398
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_16

    .line 403
    .line 404
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, La/oe50;

    .line 409
    .line 410
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_16
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    :goto_11
    return-object v9

    .line 417
    :pswitch_9
    check-cast v7, La/sih0;

    .line 418
    .line 419
    sget-object v0, La/wne;->a:La/wne;

    .line 420
    .line 421
    iget-byte v1, v14, La/bu;->j:B

    .line 422
    .line 423
    const-string v2, "top_champ"

    .line 424
    .line 425
    if-eqz v1, :cond_19

    .line 426
    .line 427
    if-eq v1, v8, :cond_18

    .line 428
    .line 429
    if-ne v1, v11, :cond_17

    .line 430
    .line 431
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto :goto_14

    .line 435
    :cond_17
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    goto :goto_15

    .line 439
    :cond_18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    goto :goto_12

    .line 443
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v1, v7, La/sih0;->s:La/hjd;

    .line 447
    .line 448
    new-instance v3, La/cid;

    .line 449
    .line 450
    sget-object v4, La/y1p;->b:La/y1p;

    .line 451
    .line 452
    new-instance v4, La/yr2;

    .line 453
    .line 454
    iget v5, v7, La/sih0;->p:I

    .line 455
    .line 456
    invoke-direct {v4, v5}, La/ds2;-><init>(I)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v3, v2, v4}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 460
    .line 461
    .line 462
    iput-byte v8, v14, La/bu;->j:B

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v3, v14}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    if-ne v1, v0, :cond_1a

    .line 472
    .line 473
    goto :goto_13

    .line 474
    :cond_1a
    :goto_12
    iget-object v1, v7, La/sih0;->t:La/rus;

    .line 475
    .line 476
    new-instance v3, La/ell0;

    .line 477
    .line 478
    sget-object v4, La/y1p;->b:La/y1p;

    .line 479
    .line 480
    invoke-direct {v3, v2}, La/ell0;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iput-byte v11, v14, La/bu;->j:B

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v3, v14}, La/rus;->k(La/jll0;La/zje;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    if-ne v1, v0, :cond_1b

    .line 493
    .line 494
    :goto_13
    move-object v9, v0

    .line 495
    goto :goto_15

    .line 496
    :cond_1b
    :goto_14
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    :goto_15
    return-object v9

    .line 499
    :pswitch_a
    move-object v12, v7

    .line 500
    check-cast v12, La/hef0;

    .line 501
    .line 502
    sget-object v13, La/wne;->a:La/wne;

    .line 503
    .line 504
    iget-byte v0, v14, La/bu;->j:B

    .line 505
    .line 506
    if-eqz v0, :cond_1e

    .line 507
    .line 508
    if-eq v0, v8, :cond_1d

    .line 509
    .line 510
    if-ne v0, v11, :cond_1c

    .line 511
    .line 512
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    goto :goto_18

    .line 516
    :cond_1c
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    goto :goto_19

    .line 520
    :cond_1d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v0, p1

    .line 524
    .line 525
    goto :goto_16

    .line 526
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iget-object v0, v12, La/hef0;->t:La/a6u;

    .line 530
    .line 531
    iget-object v1, v12, La/hef0;->o:Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 532
    .line 533
    iget-wide v2, v1, Lorg/xplatform/related/api/presentation/RelatedParams;->b:J

    .line 534
    .line 535
    move-wide v5, v2

    .line 536
    iget-wide v3, v1, Lorg/xplatform/related/api/presentation/RelatedParams;->c:J

    .line 537
    .line 538
    move-wide v9, v5

    .line 539
    iget-wide v5, v1, Lorg/xplatform/related/api/presentation/RelatedParams;->d:J

    .line 540
    .line 541
    iget-wide v1, v1, Lorg/xplatform/related/api/presentation/RelatedParams;->e:J

    .line 542
    .line 543
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    check-cast v7, La/aef0;

    .line 548
    .line 549
    iget-boolean v7, v7, La/aef0;->j:Z

    .line 550
    .line 551
    iput-byte v8, v14, La/bu;->j:B

    .line 552
    .line 553
    move-wide/from16 v35, v9

    .line 554
    .line 555
    move v9, v7

    .line 556
    move-wide v7, v1

    .line 557
    move-wide/from16 v1, v35

    .line 558
    .line 559
    move-object v10, v14

    .line 560
    invoke-virtual/range {v0 .. v10}, La/a6u;->y(JJJJZLa/zje;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    if-ne v0, v13, :cond_1f

    .line 565
    .line 566
    goto :goto_17

    .line 567
    :cond_1f
    :goto_16
    check-cast v0, La/gmq;

    .line 568
    .line 569
    new-instance v1, La/npe0;

    .line 570
    .line 571
    const/16 v2, 0x8

    .line 572
    .line 573
    invoke-direct {v1, v12, v2}, La/npe0;-><init>(Ljava/lang/Object;B)V

    .line 574
    .line 575
    .line 576
    iput-byte v11, v14, La/bu;->j:B

    .line 577
    .line 578
    invoke-interface {v0, v1, v14}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    if-ne v0, v13, :cond_20

    .line 583
    .line 584
    :goto_17
    move-object v9, v13

    .line 585
    goto :goto_19

    .line 586
    :cond_20
    :goto_18
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    :goto_19
    return-object v9

    .line 589
    :pswitch_b
    check-cast v7, La/d7f0;

    .line 590
    .line 591
    iget-object v15, v7, La/d7f0;->z:La/lrc;

    .line 592
    .line 593
    iget-object v0, v7, La/d7f0;->o:Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 594
    .line 595
    sget-object v1, La/wne;->a:La/wne;

    .line 596
    .line 597
    iget-byte v2, v14, La/bu;->j:B

    .line 598
    .line 599
    const-string v3, "CUSTOM_REFERRAL_TAG"

    .line 600
    .line 601
    const-string v4, "promo"

    .line 602
    .line 603
    const-string v5, "referral_dl"

    .line 604
    .line 605
    if-eqz v2, :cond_23

    .line 606
    .line 607
    if-eq v2, v8, :cond_22

    .line 608
    .line 609
    if-ne v2, v11, :cond_21

    .line 610
    .line 611
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 612
    .line 613
    .line 614
    move-object/from16 v22, v3

    .line 615
    .line 616
    move-object/from16 v23, v4

    .line 617
    .line 618
    move-object/from16 v24, v5

    .line 619
    .line 620
    move-object v1, v15

    .line 621
    goto/16 :goto_25

    .line 622
    .line 623
    :catchall_0
    move-exception v0

    .line 624
    move-object v8, v3

    .line 625
    :goto_1a
    move-object v10, v4

    .line 626
    :goto_1b
    move-object v2, v5

    .line 627
    move-object v1, v15

    .line 628
    goto/16 :goto_27

    .line 629
    .line 630
    :cond_21
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_26

    .line 634
    .line 635
    :cond_22
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 636
    .line 637
    .line 638
    move-object/from16 v2, p1

    .line 639
    .line 640
    goto :goto_1c

    .line 641
    :cond_23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    :try_start_2
    iget-object v2, v7, La/d7f0;->B:La/uyn;

    .line 645
    .line 646
    iput-byte v8, v14, La/bu;->j:B

    .line 647
    .line 648
    iget-object v2, v2, La/uyn;->a:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v2, La/on4;

    .line 651
    .line 652
    iget-object v2, v2, La/on4;->b:La/rn4;

    .line 653
    .line 654
    invoke-virtual {v2, v14}, La/rn4;->a(La/zje;)Ljava/lang/Enum;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    if-ne v2, v1, :cond_24

    .line 659
    .line 660
    move-object v15, v1

    .line 661
    goto/16 :goto_24

    .line 662
    .line 663
    :cond_24
    :goto_1c
    check-cast v2, La/fzs0;

    .line 664
    .line 665
    iget-object v6, v7, La/d7f0;->p:La/xte0;

    .line 666
    .line 667
    iget-object v8, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->a:Ljava/lang/String;

    .line 668
    .line 669
    invoke-static {v8}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 670
    .line 671
    .line 672
    move-result-object v8

    .line 673
    if-eqz v8, :cond_25

    .line 674
    .line 675
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 676
    .line 677
    .line 678
    move-result-wide v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 679
    :goto_1d
    move-object v8, v3

    .line 680
    goto :goto_1e

    .line 681
    :cond_25
    const-wide/16 v12, 0x0

    .line 682
    .line 683
    goto :goto_1d

    .line 684
    :goto_1e
    :try_start_3
    iget-object v3, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->h:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 685
    .line 686
    move-object v10, v4

    .line 687
    :try_start_4
    iget-object v4, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->g:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 688
    .line 689
    move-object/from16 v16, v5

    .line 690
    .line 691
    :try_start_5
    iget-object v5, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->i:Ljava/lang/String;

    .line 692
    .line 693
    move-object/from16 v17, v6

    .line 694
    .line 695
    iget-object v6, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->j:Ljava/lang/String;

    .line 696
    .line 697
    iget-object v9, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->k:Ljava/lang/String;

    .line 698
    .line 699
    if-eqz v2, :cond_26

    .line 700
    .line 701
    invoke-virtual {v2}, La/fzs0;->a()I

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    new-instance v11, Ljava/lang/Integer;

    .line 706
    .line 707
    invoke-direct {v11, v2}, Ljava/lang/Integer;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 708
    .line 709
    .line 710
    move-object v2, v8

    .line 711
    move-object v8, v11

    .line 712
    :goto_1f
    move-object v11, v9

    .line 713
    goto :goto_21

    .line 714
    :goto_20
    move-object v1, v15

    .line 715
    move-object/from16 v2, v16

    .line 716
    .line 717
    goto/16 :goto_27

    .line 718
    .line 719
    :catchall_1
    move-exception v0

    .line 720
    goto :goto_20

    .line 721
    :cond_26
    move-object v2, v8

    .line 722
    const/4 v8, 0x0

    .line 723
    goto :goto_1f

    .line 724
    :goto_21
    :try_start_6
    iget-object v9, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->f:La/q7f0;

    .line 725
    .line 726
    move-object/from16 v20, v1

    .line 727
    .line 728
    iget-object v1, v7, La/d7f0;->x:La/bk3;

    .line 729
    .line 730
    iget-object v1, v1, La/bk3;->a:La/sd60;

    .line 731
    .line 732
    invoke-virtual {v1}, La/sd60;->d()Z

    .line 733
    .line 734
    .line 735
    move-result v18
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 736
    const-string v21, ""

    .line 737
    .line 738
    if-eqz v18, :cond_27

    .line 739
    .line 740
    :try_start_7
    invoke-virtual {v1}, La/sd60;->p()Z

    .line 741
    .line 742
    .line 743
    move-result v18

    .line 744
    if-nez v18, :cond_27

    .line 745
    .line 746
    const-string v1, "original"

    .line 747
    .line 748
    :goto_22
    move-object/from16 p1, v1

    .line 749
    .line 750
    goto :goto_23

    .line 751
    :cond_27
    invoke-virtual {v1}, La/sd60;->d()Z

    .line 752
    .line 753
    .line 754
    move-result v18

    .line 755
    if-eqz v18, :cond_28

    .line 756
    .line 757
    invoke-virtual {v1}, La/sd60;->p()Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-eqz v1, :cond_28

    .line 762
    .line 763
    const-string v1, "signed"

    .line 764
    .line 765
    goto :goto_22

    .line 766
    :cond_28
    move-object/from16 p1, v21

    .line 767
    .line 768
    :goto_23
    iget-object v1, v7, La/d7f0;->y:La/f4u;

    .line 769
    .line 770
    iget-object v1, v1, La/f4u;->b:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v1, La/sd60;

    .line 773
    .line 774
    invoke-virtual {v1}, La/sd60;->p()Z

    .line 775
    .line 776
    .line 777
    move-result v18

    .line 778
    if-eqz v18, :cond_29

    .line 779
    .line 780
    invoke-virtual {v1}, La/sd60;->f()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v21

    .line 784
    :cond_29
    iget-object v0, v0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;->l:Ljava/lang/String;

    .line 785
    .line 786
    iget-object v1, v7, La/d7f0;->C:La/cmt;

    .line 787
    .line 788
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    const/4 v7, 0x2

    .line 793
    iput-byte v7, v14, La/bu;->j:B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 794
    .line 795
    move-object/from16 v22, v2

    .line 796
    .line 797
    move-object/from16 v23, v10

    .line 798
    .line 799
    move-object v7, v11

    .line 800
    move-object/from16 v19, v15

    .line 801
    .line 802
    move-object/from16 v24, v16

    .line 803
    .line 804
    move-object/from16 v15, v20

    .line 805
    .line 806
    move-object/from16 v11, v21

    .line 807
    .line 808
    move-object/from16 v10, p1

    .line 809
    .line 810
    move-wide/from16 v35, v12

    .line 811
    .line 812
    move-object v12, v0

    .line 813
    move-object v13, v1

    .line 814
    move-wide/from16 v1, v35

    .line 815
    .line 816
    move-object/from16 v0, v17

    .line 817
    .line 818
    :try_start_8
    invoke-virtual/range {v0 .. v14}, La/xte0;->p(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;La/q7f0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 822
    if-ne v0, v15, :cond_2a

    .line 823
    .line 824
    :goto_24
    move-object v9, v15

    .line 825
    goto :goto_26

    .line 826
    :cond_2a
    move-object/from16 v1, v19

    .line 827
    .line 828
    :goto_25
    iget-object v0, v1, La/lrc;->b:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v0, La/sd60;

    .line 831
    .line 832
    iget-object v1, v0, La/sd60;->d:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v1, La/vwb0;

    .line 835
    .line 836
    move-object/from16 v2, v24

    .line 837
    .line 838
    invoke-virtual {v1, v2}, La/vwb0;->i(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    move-object/from16 v10, v23

    .line 842
    .line 843
    invoke-virtual {v1, v10}, La/vwb0;->i(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    iget-object v0, v0, La/sd60;->c:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, La/ane0;

    .line 849
    .line 850
    iget-object v0, v0, La/ane0;->b:La/vwb0;

    .line 851
    .line 852
    move-object/from16 v8, v22

    .line 853
    .line 854
    invoke-virtual {v0, v8}, La/vwb0;->i(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    :goto_26
    return-object v9

    .line 860
    :catchall_2
    move-exception v0

    .line 861
    move-object/from16 v1, v19

    .line 862
    .line 863
    move-object/from16 v8, v22

    .line 864
    .line 865
    move-object/from16 v10, v23

    .line 866
    .line 867
    move-object/from16 v2, v24

    .line 868
    .line 869
    goto :goto_27

    .line 870
    :catchall_3
    move-exception v0

    .line 871
    move-object v8, v2

    .line 872
    goto/16 :goto_20

    .line 873
    .line 874
    :catchall_4
    move-exception v0

    .line 875
    goto/16 :goto_1b

    .line 876
    .line 877
    :catchall_5
    move-exception v0

    .line 878
    goto/16 :goto_1a

    .line 879
    .line 880
    :goto_27
    iget-object v1, v1, La/lrc;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v1, La/sd60;

    .line 883
    .line 884
    iget-object v3, v1, La/sd60;->d:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v3, La/vwb0;

    .line 887
    .line 888
    invoke-virtual {v3, v2}, La/vwb0;->i(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v3, v10}, La/vwb0;->i(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    iget-object v1, v1, La/sd60;->c:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v1, La/ane0;

    .line 897
    .line 898
    iget-object v1, v1, La/ane0;->b:La/vwb0;

    .line 899
    .line 900
    invoke-virtual {v1, v8}, La/vwb0;->i(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    throw v0

    .line 904
    :pswitch_c
    check-cast v7, La/pmb0;

    .line 905
    .line 906
    sget-object v0, La/wne;->a:La/wne;

    .line 907
    .line 908
    iget-byte v1, v14, La/bu;->j:B

    .line 909
    .line 910
    if-eqz v1, :cond_2d

    .line 911
    .line 912
    if-eq v1, v8, :cond_2c

    .line 913
    .line 914
    const/4 v2, 0x2

    .line 915
    if-ne v1, v2, :cond_2b

    .line 916
    .line 917
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    goto/16 :goto_30

    .line 921
    .line 922
    :cond_2b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 923
    .line 924
    .line 925
    const/4 v9, 0x0

    .line 926
    goto/16 :goto_33

    .line 927
    .line 928
    :cond_2c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    move-object/from16 v1, p1

    .line 932
    .line 933
    goto :goto_28

    .line 934
    :cond_2d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    iget-object v1, v7, La/pmb0;->W:La/rou;

    .line 938
    .line 939
    iput-byte v8, v14, La/bu;->j:B

    .line 940
    .line 941
    invoke-virtual {v1, v5, v14}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    if-ne v1, v0, :cond_2e

    .line 946
    .line 947
    goto/16 :goto_2f

    .line 948
    .line 949
    :cond_2e
    :goto_28
    check-cast v1, La/m2c0;

    .line 950
    .line 951
    iget-object v2, v1, La/m2c0;->e0:La/cau0;

    .line 952
    .line 953
    sget-object v3, La/cau0;->f:La/cau0;

    .line 954
    .line 955
    if-eq v2, v3, :cond_3a

    .line 956
    .line 957
    iget-boolean v3, v1, La/m2c0;->s0:Z

    .line 958
    .line 959
    if-eqz v3, :cond_2f

    .line 960
    .line 961
    goto/16 :goto_32

    .line 962
    .line 963
    :cond_2f
    sget-object v3, La/cau0;->h:La/cau0;

    .line 964
    .line 965
    if-ne v2, v3, :cond_30

    .line 966
    .line 967
    move v2, v8

    .line 968
    goto :goto_29

    .line 969
    :cond_30
    move v2, v5

    .line 970
    :goto_29
    iget-object v3, v1, La/m2c0;->k:La/jqt0;

    .line 971
    .line 972
    sget-object v4, La/jqt0;->e:La/jqt0;

    .line 973
    .line 974
    if-eq v3, v4, :cond_32

    .line 975
    .line 976
    sget-object v4, La/jqt0;->d:La/jqt0;

    .line 977
    .line 978
    if-ne v3, v4, :cond_31

    .line 979
    .line 980
    goto :goto_2a

    .line 981
    :cond_31
    move v3, v5

    .line 982
    goto :goto_2b

    .line 983
    :cond_32
    :goto_2a
    move v3, v8

    .line 984
    :goto_2b
    iget-boolean v4, v1, La/m2c0;->P:Z

    .line 985
    .line 986
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 987
    .line 988
    .line 989
    move-result-wide v9

    .line 990
    const-wide/16 v11, 0x3e8

    .line 991
    .line 992
    div-long/2addr v9, v11

    .line 993
    iget-object v1, v1, La/m2c0;->j:Ljava/lang/String;

    .line 994
    .line 995
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 996
    .line 997
    .line 998
    move-result-wide v11

    .line 999
    sub-long/2addr v9, v11

    .line 1000
    const-wide/32 v11, 0x15180

    .line 1001
    .line 1002
    .line 1003
    div-long/2addr v9, v11

    .line 1004
    const-wide/16 v11, 0x5a

    .line 1005
    .line 1006
    cmp-long v1, v9, v11

    .line 1007
    .line 1008
    if-gez v1, :cond_33

    .line 1009
    .line 1010
    move v1, v8

    .line 1011
    goto :goto_2c

    .line 1012
    :cond_33
    move v1, v5

    .line 1013
    :goto_2c
    if-eqz v2, :cond_35

    .line 1014
    .line 1015
    if-nez v3, :cond_34

    .line 1016
    .line 1017
    goto :goto_2d

    .line 1018
    :cond_34
    move v6, v5

    .line 1019
    goto :goto_2e

    .line 1020
    :cond_35
    :goto_2d
    move v6, v8

    .line 1021
    :goto_2e
    if-eqz v2, :cond_36

    .line 1022
    .line 1023
    if-nez v4, :cond_36

    .line 1024
    .line 1025
    if-eqz v1, :cond_36

    .line 1026
    .line 1027
    if-eqz v3, :cond_36

    .line 1028
    .line 1029
    move v5, v8

    .line 1030
    :cond_36
    if-eqz v6, :cond_37

    .line 1031
    .line 1032
    sget v0, La/pmb0;->D0:I

    .line 1033
    .line 1034
    sget-object v0, La/djb0;->a:La/djb0;

    .line 1035
    .line 1036
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_31

    .line 1040
    :cond_37
    if-eqz v5, :cond_39

    .line 1041
    .line 1042
    const/4 v2, 0x2

    .line 1043
    iput-byte v2, v14, La/bu;->j:B

    .line 1044
    .line 1045
    const-wide/16 v1, 0x5dc

    .line 1046
    .line 1047
    invoke-static {v1, v2, v14}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    if-ne v1, v0, :cond_38

    .line 1052
    .line 1053
    :goto_2f
    move-object v9, v0

    .line 1054
    goto :goto_33

    .line 1055
    :cond_38
    :goto_30
    sget v0, La/pmb0;->D0:I

    .line 1056
    .line 1057
    sget-object v0, La/cjb0;->a:La/cjb0;

    .line 1058
    .line 1059
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    :cond_39
    :goto_31
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1063
    .line 1064
    goto :goto_33

    .line 1065
    :cond_3a
    :goto_32
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1066
    .line 1067
    :goto_33
    return-object v9

    .line 1068
    :pswitch_d
    check-cast v7, La/d430;

    .line 1069
    .line 1070
    sget-object v0, La/wne;->a:La/wne;

    .line 1071
    .line 1072
    iget-byte v1, v14, La/bu;->j:B

    .line 1073
    .line 1074
    if-eqz v1, :cond_3d

    .line 1075
    .line 1076
    if-eq v1, v8, :cond_3c

    .line 1077
    .line 1078
    const/4 v2, 0x2

    .line 1079
    if-ne v1, v2, :cond_3b

    .line 1080
    .line 1081
    goto :goto_34

    .line 1082
    :cond_3b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    const/4 v9, 0x0

    .line 1086
    goto/16 :goto_39

    .line 1087
    .line 1088
    :cond_3c
    :goto_34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_37

    .line 1092
    :cond_3d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    check-cast v1, La/y330;

    .line 1100
    .line 1101
    iget-object v1, v1, La/y330;->c:La/aw20;

    .line 1102
    .line 1103
    iget-object v2, v7, La/d430;->r:La/art;

    .line 1104
    .line 1105
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    check-cast v4, La/y330;

    .line 1110
    .line 1111
    iget-object v4, v4, La/y330;->b:La/udl0;

    .line 1112
    .line 1113
    invoke-static {v4}, La/ufx;->N(La/udl0;)La/t730;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v4

    .line 1117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    invoke-static {v4}, La/art;->d(La/t730;)La/aw20;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    invoke-virtual {v1, v2}, La/aw20;->equals(Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    if-eqz v2, :cond_3e

    .line 1129
    .line 1130
    iget-object v1, v7, La/d430;->t:La/h03;

    .line 1131
    .line 1132
    iput-byte v8, v14, La/bu;->j:B

    .line 1133
    .line 1134
    invoke-virtual {v1}, La/h03;->E()Lkotlin/Unit;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1

    .line 1138
    if-ne v1, v0, :cond_40

    .line 1139
    .line 1140
    goto :goto_36

    .line 1141
    :cond_3e
    iget-object v2, v7, La/d430;->s:La/zru;

    .line 1142
    .line 1143
    const/4 v4, 0x2

    .line 1144
    iput-byte v4, v14, La/bu;->j:B

    .line 1145
    .line 1146
    iget-object v2, v2, La/zru;->a:La/pyu;

    .line 1147
    .line 1148
    invoke-virtual {v2, v1, v14}, La/pyu;->o(La/aw20;La/zje;)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    if-ne v1, v0, :cond_3f

    .line 1153
    .line 1154
    goto :goto_35

    .line 1155
    :cond_3f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1156
    .line 1157
    :goto_35
    if-ne v1, v0, :cond_40

    .line 1158
    .line 1159
    :goto_36
    move-object v9, v0

    .line 1160
    goto :goto_39

    .line 1161
    :cond_40
    :goto_37
    iget-object v0, v7, La/d430;->o:La/i1w0;

    .line 1162
    .line 1163
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    new-instance v2, La/c8d;

    .line 1168
    .line 1169
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1170
    .line 1171
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1172
    .line 1173
    .line 1174
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    :goto_38
    move-object v2, v1

    .line 1179
    check-cast v2, La/paw;

    .line 1180
    .line 1181
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1182
    .line 1183
    .line 1184
    move-result v3

    .line 1185
    if-eqz v3, :cond_41

    .line 1186
    .line 1187
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    check-cast v2, La/oe50;

    .line 1192
    .line 1193
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1194
    .line 1195
    .line 1196
    goto :goto_38

    .line 1197
    :cond_41
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1198
    .line 1199
    :goto_39
    return-object v9

    .line 1200
    :pswitch_e
    sget-object v0, La/wne;->a:La/wne;

    .line 1201
    .line 1202
    iget-byte v1, v14, La/bu;->j:B

    .line 1203
    .line 1204
    if-eqz v1, :cond_44

    .line 1205
    .line 1206
    if-eq v1, v8, :cond_43

    .line 1207
    .line 1208
    const/4 v2, 0x2

    .line 1209
    if-ne v1, v2, :cond_42

    .line 1210
    .line 1211
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_3c

    .line 1215
    :cond_42
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    const/4 v9, 0x0

    .line 1219
    goto :goto_3d

    .line 1220
    :cond_43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    goto :goto_3a

    .line 1224
    :cond_44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    iput-byte v8, v14, La/bu;->j:B

    .line 1228
    .line 1229
    const-wide/16 v1, 0x32

    .line 1230
    .line 1231
    invoke-static {v1, v2, v14}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    if-ne v1, v0, :cond_45

    .line 1236
    .line 1237
    goto :goto_3b

    .line 1238
    :cond_45
    :goto_3a
    check-cast v7, La/pn10;

    .line 1239
    .line 1240
    iget-object v1, v7, La/pn10;->u:La/fq;

    .line 1241
    .line 1242
    const/4 v2, 0x2

    .line 1243
    iput-byte v2, v14, La/bu;->j:B

    .line 1244
    .line 1245
    sget-object v2, La/ple;->a:La/ple;

    .line 1246
    .line 1247
    invoke-virtual {v1, v2, v14}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v1

    .line 1251
    if-ne v1, v0, :cond_46

    .line 1252
    .line 1253
    :goto_3b
    move-object v9, v0

    .line 1254
    goto :goto_3d

    .line 1255
    :cond_46
    :goto_3c
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1256
    .line 1257
    :goto_3d
    return-object v9

    .line 1258
    :pswitch_f
    check-cast v7, La/qi00;

    .line 1259
    .line 1260
    iget-object v0, v7, La/qi00;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;

    .line 1261
    .line 1262
    iget-object v1, v7, La/qi00;->C:La/n0o0;

    .line 1263
    .line 1264
    sget-object v2, La/wne;->a:La/wne;

    .line 1265
    .line 1266
    iget-byte v3, v14, La/bu;->j:B

    .line 1267
    .line 1268
    if-eqz v3, :cond_49

    .line 1269
    .line 1270
    if-eq v3, v8, :cond_48

    .line 1271
    .line 1272
    const/4 v4, 0x2

    .line 1273
    if-ne v3, v4, :cond_47

    .line 1274
    .line 1275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    goto/16 :goto_43

    .line 1279
    .line 1280
    :cond_47
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    :goto_3e
    const/4 v9, 0x0

    .line 1284
    goto/16 :goto_44

    .line 1285
    .line 1286
    :cond_48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    move-object/from16 v3, p1

    .line 1290
    .line 1291
    goto :goto_3f

    .line 1292
    :cond_49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    iget-object v3, v7, La/qi00;->s:La/j3c;

    .line 1296
    .line 1297
    iput-byte v8, v14, La/bu;->j:B

    .line 1298
    .line 1299
    invoke-virtual {v3, v14}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v3

    .line 1303
    if-ne v3, v2, :cond_4a

    .line 1304
    .line 1305
    goto/16 :goto_42

    .line 1306
    .line 1307
    :cond_4a
    :goto_3f
    move-object/from16 v21, v3

    .line 1308
    .line 1309
    check-cast v21, La/wcb;

    .line 1310
    .line 1311
    iget-object v3, v7, La/qi00;->t:La/luu;

    .line 1312
    .line 1313
    iget-object v3, v3, La/luu;->a:La/nok0;

    .line 1314
    .line 1315
    invoke-virtual {v3}, La/nok0;->a()Ljava/util/List;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v24

    .line 1319
    iget-boolean v3, v7, La/qi00;->H:Z

    .line 1320
    .line 1321
    iget-object v4, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;->c:Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v5

    .line 1327
    check-cast v5, La/sff0;

    .line 1328
    .line 1329
    iget-boolean v5, v5, La/sff0;->J:Z

    .line 1330
    .line 1331
    iget-object v6, v7, La/qi00;->y:La/svu;

    .line 1332
    .line 1333
    invoke-virtual {v6}, La/svu;->l()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v33

    .line 1337
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v6

    .line 1341
    check-cast v6, La/sff0;

    .line 1342
    .line 1343
    iget-object v6, v6, La/sff0;->g:La/mum0;

    .line 1344
    .line 1345
    iget-object v6, v6, La/mum0;->z:La/g8l0;

    .line 1346
    .line 1347
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v1

    .line 1351
    check-cast v1, La/sff0;

    .line 1352
    .line 1353
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 1354
    .line 1355
    iget-object v1, v1, La/mum0;->y:La/v5l0;

    .line 1356
    .line 1357
    iget-object v8, v7, La/qi00;->A:La/r9u;

    .line 1358
    .line 1359
    sget-object v9, La/ygp;->t:La/ygp;

    .line 1360
    .line 1361
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    iget-object v8, v8, La/r9u;->a:La/j1q0;

    .line 1365
    .line 1366
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 1370
    .line 1371
    invoke-virtual {v8, v9}, La/m1q0;->d(La/ygp;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v27

    .line 1375
    iget-object v0, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;->b:La/aj00;

    .line 1376
    .line 1377
    if-eqz v0, :cond_50

    .line 1378
    .line 1379
    instance-of v8, v0, La/wi00;

    .line 1380
    .line 1381
    if-eqz v8, :cond_4b

    .line 1382
    .line 1383
    new-instance v0, La/hq2;

    .line 1384
    .line 1385
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1386
    .line 1387
    .line 1388
    goto :goto_40

    .line 1389
    :cond_4b
    instance-of v8, v0, La/xi00;

    .line 1390
    .line 1391
    if-eqz v8, :cond_4c

    .line 1392
    .line 1393
    new-instance v0, La/iq2;

    .line 1394
    .line 1395
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1396
    .line 1397
    .line 1398
    goto :goto_40

    .line 1399
    :cond_4c
    instance-of v8, v0, La/zi00;

    .line 1400
    .line 1401
    if-eqz v8, :cond_4d

    .line 1402
    .line 1403
    new-instance v0, La/gq2;

    .line 1404
    .line 1405
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1406
    .line 1407
    .line 1408
    goto :goto_40

    .line 1409
    :cond_4d
    instance-of v0, v0, La/yi00;

    .line 1410
    .line 1411
    if-eqz v0, :cond_50

    .line 1412
    .line 1413
    new-instance v0, La/ls2;

    .line 1414
    .line 1415
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1416
    .line 1417
    .line 1418
    :goto_40
    iget-object v8, v7, La/i3t0;->i:La/ocj;

    .line 1419
    .line 1420
    iget-object v8, v8, La/ocj;->a:La/p7m0;

    .line 1421
    .line 1422
    :goto_41
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v9

    .line 1426
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    move-object v10, v9

    .line 1430
    check-cast v10, La/nj00;

    .line 1431
    .line 1432
    new-instance v20, La/mj00;

    .line 1433
    .line 1434
    move-object/from16 v22, v1

    .line 1435
    .line 1436
    move/from16 v25, v3

    .line 1437
    .line 1438
    move/from16 v26, v5

    .line 1439
    .line 1440
    move-object/from16 v23, v6

    .line 1441
    .line 1442
    invoke-direct/range {v20 .. v27}, La/mj00;-><init>(La/wcb;La/v5l0;La/g8l0;Ljava/util/List;ZZZ)V

    .line 1443
    .line 1444
    .line 1445
    move/from16 v1, v25

    .line 1446
    .line 1447
    move/from16 v3, v26

    .line 1448
    .line 1449
    move/from16 v5, v27

    .line 1450
    .line 1451
    const/16 v32, 0x0

    .line 1452
    .line 1453
    const/16 v34, 0xfc

    .line 1454
    .line 1455
    const/16 v28, 0x0

    .line 1456
    .line 1457
    const/16 v29, 0x0

    .line 1458
    .line 1459
    const/16 v30, 0x0

    .line 1460
    .line 1461
    const/16 v31, 0x0

    .line 1462
    .line 1463
    move-object/from16 v26, v4

    .line 1464
    .line 1465
    move-object/from16 v25, v10

    .line 1466
    .line 1467
    move-object/from16 v27, v20

    .line 1468
    .line 1469
    invoke-static/range {v25 .. v34}, La/nj00;->a(La/nj00;Ljava/lang/String;La/mj00;Ljava/util/List;La/ais;Ljava/util/Set;ZLjava/lang/String;ZI)La/nj00;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v4

    .line 1473
    invoke-virtual {v8, v9, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v4

    .line 1477
    if-eqz v4, :cond_4f

    .line 1478
    .line 1479
    iget-object v1, v7, La/qi00;->q:La/hjd;

    .line 1480
    .line 1481
    new-instance v3, La/cid;

    .line 1482
    .line 1483
    const-string v4, "sport_champ_games"

    .line 1484
    .line 1485
    invoke-direct {v3, v4, v0}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 1486
    .line 1487
    .line 1488
    const/4 v4, 0x2

    .line 1489
    iput-byte v4, v14, La/bu;->j:B

    .line 1490
    .line 1491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v1, v3, v14}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    if-ne v0, v2, :cond_4e

    .line 1499
    .line 1500
    :goto_42
    move-object v9, v2

    .line 1501
    goto :goto_44

    .line 1502
    :cond_4e
    :goto_43
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1503
    .line 1504
    goto :goto_44

    .line 1505
    :cond_4f
    move/from16 v27, v5

    .line 1506
    .line 1507
    move-object/from16 v6, v23

    .line 1508
    .line 1509
    move-object/from16 v4, v26

    .line 1510
    .line 1511
    move v5, v3

    .line 1512
    move v3, v1

    .line 1513
    move-object/from16 v1, v22

    .line 1514
    .line 1515
    goto :goto_41

    .line 1516
    :cond_50
    invoke-static {}, La/t9f;->b()V

    .line 1517
    .line 1518
    .line 1519
    goto/16 :goto_3e

    .line 1520
    .line 1521
    :goto_44
    return-object v9

    .line 1522
    :pswitch_10
    check-cast v7, La/eiz;

    .line 1523
    .line 1524
    sget-object v0, La/wne;->a:La/wne;

    .line 1525
    .line 1526
    iget-byte v1, v14, La/bu;->j:B

    .line 1527
    .line 1528
    if-eqz v1, :cond_53

    .line 1529
    .line 1530
    if-eq v1, v8, :cond_52

    .line 1531
    .line 1532
    const/4 v2, 0x2

    .line 1533
    if-ne v1, v2, :cond_51

    .line 1534
    .line 1535
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1536
    .line 1537
    .line 1538
    move-object/from16 v0, p1

    .line 1539
    .line 1540
    check-cast v0, La/j0g0;

    .line 1541
    .line 1542
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1543
    .line 1544
    const/4 v2, 0x2

    .line 1545
    goto :goto_47

    .line 1546
    :cond_51
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    const/4 v9, 0x0

    .line 1550
    goto :goto_49

    .line 1551
    :cond_52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1552
    .line 1553
    .line 1554
    move-object/from16 v0, p1

    .line 1555
    .line 1556
    check-cast v0, La/j0g0;

    .line 1557
    .line 1558
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1559
    .line 1560
    goto :goto_45

    .line 1561
    :cond_53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v1

    .line 1568
    check-cast v1, La/ihz;

    .line 1569
    .line 1570
    iget-wide v1, v1, La/ihz;->b:J

    .line 1571
    .line 1572
    const-wide/16 v3, 0x2e

    .line 1573
    .line 1574
    cmp-long v1, v1, v3

    .line 1575
    .line 1576
    if-nez v1, :cond_55

    .line 1577
    .line 1578
    iget-object v1, v7, La/eiz;->w:La/rpt;

    .line 1579
    .line 1580
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->get(I)I

    .line 1585
    .line 1586
    .line 1587
    move-result v2

    .line 1588
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v3

    .line 1592
    check-cast v3, La/ihz;

    .line 1593
    .line 1594
    iget-object v3, v3, La/ihz;->f:La/epe;

    .line 1595
    .line 1596
    iput-byte v8, v14, La/bu;->j:B

    .line 1597
    .line 1598
    invoke-virtual {v1, v2, v3, v14}, La/rpt;->m(ILa/epe;La/zje;)Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v1

    .line 1602
    if-ne v1, v0, :cond_54

    .line 1603
    .line 1604
    goto :goto_46

    .line 1605
    :cond_54
    move-object v0, v1

    .line 1606
    :goto_45
    new-instance v1, La/biz;

    .line 1607
    .line 1608
    invoke-direct {v1, v0, v8}, La/biz;-><init>(Ljava/lang/Object;B)V

    .line 1609
    .line 1610
    .line 1611
    sget v0, La/eiz;->E:I

    .line 1612
    .line 1613
    invoke-virtual {v7, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1614
    .line 1615
    .line 1616
    goto :goto_48

    .line 1617
    :cond_55
    iget-object v1, v7, La/eiz;->u:La/e1u;

    .line 1618
    .line 1619
    const/4 v2, 0x2

    .line 1620
    iput-byte v2, v14, La/bu;->j:B

    .line 1621
    .line 1622
    invoke-virtual {v1, v14}, La/e1u;->h(La/zje;)Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v1

    .line 1626
    if-ne v1, v0, :cond_56

    .line 1627
    .line 1628
    :goto_46
    move-object v9, v0

    .line 1629
    goto :goto_49

    .line 1630
    :cond_56
    move-object v0, v1

    .line 1631
    :goto_47
    new-instance v1, La/biz;

    .line 1632
    .line 1633
    invoke-direct {v1, v0, v2}, La/biz;-><init>(Ljava/lang/Object;B)V

    .line 1634
    .line 1635
    .line 1636
    sget v0, La/eiz;->E:I

    .line 1637
    .line 1638
    invoke-virtual {v7, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1639
    .line 1640
    .line 1641
    :goto_48
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1642
    .line 1643
    :goto_49
    return-object v9

    .line 1644
    :pswitch_11
    check-cast v7, La/f8y;

    .line 1645
    .line 1646
    iget-object v0, v7, La/f8y;->v:La/wsf0;

    .line 1647
    .line 1648
    sget-object v1, La/wne;->a:La/wne;

    .line 1649
    .line 1650
    iget-byte v2, v14, La/bu;->j:B

    .line 1651
    .line 1652
    if-eqz v2, :cond_59

    .line 1653
    .line 1654
    if-eq v2, v8, :cond_58

    .line 1655
    .line 1656
    const/4 v4, 0x2

    .line 1657
    if-ne v2, v4, :cond_57

    .line 1658
    .line 1659
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1660
    .line 1661
    .line 1662
    move-object/from16 v2, p1

    .line 1663
    .line 1664
    goto :goto_4d

    .line 1665
    :cond_57
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1666
    .line 1667
    .line 1668
    const/4 v9, 0x0

    .line 1669
    goto :goto_4e

    .line 1670
    :cond_58
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1671
    .line 1672
    .line 1673
    move-object/from16 v2, p1

    .line 1674
    .line 1675
    goto :goto_4a

    .line 1676
    :cond_59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1677
    .line 1678
    .line 1679
    iget-object v2, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v2, La/g45;

    .line 1682
    .line 1683
    invoke-virtual {v2}, La/g45;->y()La/ahu;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v2

    .line 1687
    sget-object v3, La/bm5;->d:La/bm5;

    .line 1688
    .line 1689
    iput-byte v8, v14, La/bu;->j:B

    .line 1690
    .line 1691
    invoke-virtual {v2, v3, v14}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v2

    .line 1695
    if-ne v2, v1, :cond_5a

    .line 1696
    .line 1697
    goto :goto_4c

    .line 1698
    :cond_5a
    :goto_4a
    move-object v3, v2

    .line 1699
    check-cast v3, La/ql5;

    .line 1700
    .line 1701
    iget-object v3, v3, La/ql5;->i:La/txs0;

    .line 1702
    .line 1703
    invoke-virtual {v3}, La/txs0;->f()Z

    .line 1704
    .line 1705
    .line 1706
    move-result v3

    .line 1707
    if-nez v3, :cond_5b

    .line 1708
    .line 1709
    move-object v9, v2

    .line 1710
    goto :goto_4b

    .line 1711
    :cond_5b
    const/4 v9, 0x0

    .line 1712
    :goto_4b
    check-cast v9, La/ql5;

    .line 1713
    .line 1714
    if-nez v9, :cond_5d

    .line 1715
    .line 1716
    iget-object v2, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 1717
    .line 1718
    check-cast v2, La/g45;

    .line 1719
    .line 1720
    invoke-virtual {v2}, La/g45;->E()La/nou;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v2

    .line 1724
    const/4 v4, 0x2

    .line 1725
    iput-byte v4, v14, La/bu;->j:B

    .line 1726
    .line 1727
    invoke-static {v2, v14}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v2

    .line 1731
    if-ne v2, v1, :cond_5c

    .line 1732
    .line 1733
    :goto_4c
    move-object v9, v1

    .line 1734
    goto :goto_4e

    .line 1735
    :cond_5c
    :goto_4d
    move-object v9, v2

    .line 1736
    check-cast v9, La/ql5;

    .line 1737
    .line 1738
    :cond_5d
    invoke-virtual {v0}, La/wsf0;->s()La/trm0;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    sget-object v1, La/bm5;->d:La/bm5;

    .line 1743
    .line 1744
    invoke-virtual {v0, v1, v9}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 1745
    .line 1746
    .line 1747
    iget-object v0, v7, La/f8y;->w:La/kyg0;

    .line 1748
    .line 1749
    iget-wide v1, v9, La/ql5;->a:J

    .line 1750
    .line 1751
    invoke-virtual {v0, v1, v2}, La/kyg0;->a(J)V

    .line 1752
    .line 1753
    .line 1754
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1755
    .line 1756
    :goto_4e
    return-object v9

    .line 1757
    :pswitch_12
    check-cast v7, La/tkw;

    .line 1758
    .line 1759
    sget-object v0, La/wne;->a:La/wne;

    .line 1760
    .line 1761
    iget-byte v1, v14, La/bu;->j:B

    .line 1762
    .line 1763
    if-eqz v1, :cond_60

    .line 1764
    .line 1765
    if-eq v1, v8, :cond_5f

    .line 1766
    .line 1767
    const/4 v2, 0x2

    .line 1768
    if-ne v1, v2, :cond_5e

    .line 1769
    .line 1770
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1771
    .line 1772
    .line 1773
    goto :goto_53

    .line 1774
    :cond_5e
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1775
    .line 1776
    .line 1777
    const/4 v9, 0x0

    .line 1778
    goto :goto_54

    .line 1779
    :cond_5f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1780
    .line 1781
    .line 1782
    move-object/from16 v1, p1

    .line 1783
    .line 1784
    goto :goto_4f

    .line 1785
    :cond_60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v1, v7, La/tkw;->p:La/a6u;

    .line 1789
    .line 1790
    iput-byte v8, v14, La/bu;->j:B

    .line 1791
    .line 1792
    invoke-virtual {v1, v14}, La/a6u;->C(La/zje;)Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    if-ne v1, v0, :cond_61

    .line 1797
    .line 1798
    goto :goto_52

    .line 1799
    :cond_61
    :goto_4f
    check-cast v1, La/gmq;

    .line 1800
    .line 1801
    new-instance v2, La/kaw;

    .line 1802
    .line 1803
    const/4 v3, 0x0

    .line 1804
    invoke-direct {v2, v7, v3, v4}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1805
    .line 1806
    .line 1807
    const/4 v4, 0x2

    .line 1808
    iput-byte v4, v14, La/bu;->j:B

    .line 1809
    .line 1810
    new-instance v3, La/vnq;

    .line 1811
    .line 1812
    sget-object v5, La/h660;->a:La/h660;

    .line 1813
    .line 1814
    invoke-direct {v3, v5, v2, v4}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1815
    .line 1816
    .line 1817
    invoke-interface {v1, v3, v14}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v1

    .line 1821
    if-ne v1, v0, :cond_62

    .line 1822
    .line 1823
    goto :goto_50

    .line 1824
    :cond_62
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1825
    .line 1826
    :goto_50
    if-ne v1, v0, :cond_63

    .line 1827
    .line 1828
    goto :goto_51

    .line 1829
    :cond_63
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1830
    .line 1831
    :goto_51
    if-ne v1, v0, :cond_64

    .line 1832
    .line 1833
    :goto_52
    move-object v9, v0

    .line 1834
    goto :goto_54

    .line 1835
    :cond_64
    :goto_53
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1836
    .line 1837
    :goto_54
    return-object v9

    .line 1838
    :pswitch_13
    move-object v0, v7

    .line 1839
    check-cast v0, La/a3f;

    .line 1840
    .line 1841
    sget-object v1, La/wne;->a:La/wne;

    .line 1842
    .line 1843
    iget-byte v2, v14, La/bu;->j:B

    .line 1844
    .line 1845
    if-eqz v2, :cond_67

    .line 1846
    .line 1847
    if-eq v2, v8, :cond_66

    .line 1848
    .line 1849
    const/4 v4, 0x2

    .line 1850
    if-ne v2, v4, :cond_65

    .line 1851
    .line 1852
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1853
    .line 1854
    .line 1855
    move-object/from16 v2, p1

    .line 1856
    .line 1857
    goto :goto_57

    .line 1858
    :cond_65
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    const/4 v9, 0x0

    .line 1862
    goto/16 :goto_5b

    .line 1863
    .line 1864
    :cond_66
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1865
    .line 1866
    .line 1867
    move-object/from16 v2, p1

    .line 1868
    .line 1869
    goto :goto_55

    .line 1870
    :cond_67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1871
    .line 1872
    .line 1873
    iget-object v2, v0, La/a3f;->G:La/bby;

    .line 1874
    .line 1875
    if-eqz v2, :cond_68

    .line 1876
    .line 1877
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 1878
    .line 1879
    .line 1880
    :cond_68
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v20

    .line 1884
    new-instance v2, La/u2f;

    .line 1885
    .line 1886
    invoke-direct {v2, v0, v4}, La/u2f;-><init>(La/a3f;B)V

    .line 1887
    .line 1888
    .line 1889
    new-instance v3, La/w2f;

    .line 1890
    .line 1891
    const/4 v9, 0x0

    .line 1892
    invoke-direct {v3, v0, v9, v8}, La/w2f;-><init>(La/a3f;La/yje;B)V

    .line 1893
    .line 1894
    .line 1895
    const/16 v27, 0x24

    .line 1896
    .line 1897
    const-wide/16 v21, 0x258

    .line 1898
    .line 1899
    sget-object v23, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1900
    .line 1901
    const/16 v24, 0x0

    .line 1902
    .line 1903
    move-object/from16 v25, v2

    .line 1904
    .line 1905
    move-object/from16 v26, v3

    .line 1906
    .line 1907
    invoke-static/range {v20 .. v27}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v2

    .line 1911
    iput-object v2, v0, La/a3f;->G:La/bby;

    .line 1912
    .line 1913
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v2

    .line 1917
    check-cast v2, La/l2f;

    .line 1918
    .line 1919
    iget-object v2, v2, La/l2f;->f:Ljava/util/List;

    .line 1920
    .line 1921
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v3

    .line 1925
    check-cast v3, La/l2f;

    .line 1926
    .line 1927
    iget v3, v3, La/l2f;->g:I

    .line 1928
    .line 1929
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v2

    .line 1933
    check-cast v2, La/k2f;

    .line 1934
    .line 1935
    instance-of v2, v2, La/j2f;

    .line 1936
    .line 1937
    if-eqz v2, :cond_6a

    .line 1938
    .line 1939
    iput-byte v8, v14, La/bu;->j:B

    .line 1940
    .line 1941
    invoke-virtual {v0, v14}, La/a3f;->O(La/zje;)Ljava/io/Serializable;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v2

    .line 1945
    if-ne v2, v1, :cond_69

    .line 1946
    .line 1947
    goto :goto_56

    .line 1948
    :cond_69
    :goto_55
    check-cast v2, Lkotlin/Pair;

    .line 1949
    .line 1950
    goto :goto_58

    .line 1951
    :cond_6a
    const/4 v2, 0x2

    .line 1952
    iput-byte v2, v14, La/bu;->j:B

    .line 1953
    .line 1954
    invoke-virtual {v0, v14}, La/a3f;->N(La/zje;)Ljava/io/Serializable;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v2

    .line 1958
    if-ne v2, v1, :cond_6b

    .line 1959
    .line 1960
    :goto_56
    move-object v9, v1

    .line 1961
    goto/16 :goto_5b

    .line 1962
    .line 1963
    :cond_6b
    :goto_57
    check-cast v2, Lkotlin/Pair;

    .line 1964
    .line 1965
    :goto_58
    iget-object v1, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1966
    .line 1967
    move-object v7, v1

    .line 1968
    check-cast v7, La/n3w;

    .line 1969
    .line 1970
    iget-object v1, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v1, Ljava/lang/Number;

    .line 1973
    .line 1974
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 1975
    .line 1976
    .line 1977
    move-result-wide v9

    .line 1978
    iget-object v1, v0, La/a3f;->G:La/bby;

    .line 1979
    .line 1980
    if-eqz v1, :cond_6c

    .line 1981
    .line 1982
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 1983
    .line 1984
    .line 1985
    :cond_6c
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 1986
    .line 1987
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 1988
    .line 1989
    :cond_6d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v2

    .line 1993
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1994
    .line 1995
    .line 1996
    move-object v11, v2

    .line 1997
    check-cast v11, La/l2f;

    .line 1998
    .line 1999
    const/16 v16, 0x0

    .line 2000
    .line 2001
    const/16 v17, 0x3ed

    .line 2002
    .line 2003
    const/4 v12, 0x0

    .line 2004
    const/4 v13, 0x0

    .line 2005
    const/4 v14, 0x0

    .line 2006
    const/4 v15, 0x0

    .line 2007
    invoke-static/range {v11 .. v17}, La/l2f;->a(La/l2f;Ljava/lang/String;ZZLjava/lang/String;II)La/l2f;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v3

    .line 2011
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v2

    .line 2015
    if-eqz v2, :cond_6d

    .line 2016
    .line 2017
    iget-object v0, v0, La/a3f;->p:La/i1w0;

    .line 2018
    .line 2019
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v1

    .line 2023
    new-instance v6, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;

    .line 2024
    .line 2025
    const/4 v11, 0x1

    .line 2026
    sget-object v12, La/sys0;->a:La/sys0;

    .line 2027
    .line 2028
    const/4 v8, 0x1

    .line 2029
    invoke-direct/range {v6 .. v12}, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;-><init>(La/n3w;ZJZLa/sys0;)V

    .line 2030
    .line 2031
    .line 2032
    instance-of v2, v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2033
    .line 2034
    if-eqz v2, :cond_6e

    .line 2035
    .line 2036
    new-instance v2, La/e1w0;

    .line 2037
    .line 2038
    check-cast v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2039
    .line 2040
    invoke-direct {v2, v6}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 2041
    .line 2042
    .line 2043
    new-instance v3, La/c8d;

    .line 2044
    .line 2045
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2046
    .line 2047
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2051
    .line 2052
    .line 2053
    goto :goto_59

    .line 2054
    :cond_6e
    new-instance v2, La/w0w0;

    .line 2055
    .line 2056
    invoke-direct {v2, v6}, La/w0w0;-><init>(La/m7h0;)V

    .line 2057
    .line 2058
    .line 2059
    new-instance v3, La/c8d;

    .line 2060
    .line 2061
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2062
    .line 2063
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2067
    .line 2068
    .line 2069
    :goto_59
    invoke-static {v0, v1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v1

    .line 2073
    :goto_5a
    move-object v2, v1

    .line 2074
    check-cast v2, La/paw;

    .line 2075
    .line 2076
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2077
    .line 2078
    .line 2079
    move-result v3

    .line 2080
    if-eqz v3, :cond_6f

    .line 2081
    .line 2082
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    check-cast v2, La/oe50;

    .line 2087
    .line 2088
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2089
    .line 2090
    .line 2091
    goto :goto_5a

    .line 2092
    :cond_6f
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2093
    .line 2094
    :goto_5b
    return-object v9

    .line 2095
    :pswitch_14
    move-object v0, v7

    .line 2096
    check-cast v0, La/yhc;

    .line 2097
    .line 2098
    sget-object v3, La/wne;->a:La/wne;

    .line 2099
    .line 2100
    iget-byte v1, v14, La/bu;->j:B

    .line 2101
    .line 2102
    if-eqz v1, :cond_73

    .line 2103
    .line 2104
    if-eq v1, v8, :cond_71

    .line 2105
    .line 2106
    const/4 v2, 0x2

    .line 2107
    if-ne v1, v2, :cond_70

    .line 2108
    .line 2109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2110
    .line 2111
    .line 2112
    goto/16 :goto_60

    .line 2113
    .line 2114
    :cond_70
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2115
    .line 2116
    .line 2117
    goto/16 :goto_61

    .line 2118
    .line 2119
    :cond_71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2120
    .line 2121
    .line 2122
    :cond_72
    const/4 v2, 0x2

    .line 2123
    goto :goto_5e

    .line 2124
    :cond_73
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2125
    .line 2126
    .line 2127
    sget v1, La/yhc;->t:I

    .line 2128
    .line 2129
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 2130
    .line 2131
    iget-object v4, v1, La/ocj;->a:La/p7m0;

    .line 2132
    .line 2133
    :cond_74
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v1

    .line 2137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2138
    .line 2139
    .line 2140
    move-object/from16 v20, v1

    .line 2141
    .line 2142
    check-cast v20, La/whc;

    .line 2143
    .line 2144
    const/16 v25, 0x1

    .line 2145
    .line 2146
    const/16 v26, 0xdf

    .line 2147
    .line 2148
    const-wide/16 v21, 0x0

    .line 2149
    .line 2150
    const/16 v23, 0x0

    .line 2151
    .line 2152
    const/16 v24, 0x0

    .line 2153
    .line 2154
    invoke-static/range {v20 .. v26}, La/whc;->a(La/whc;JLjava/lang/String;Ljava/util/ArrayList;ZI)La/whc;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v2

    .line 2158
    invoke-virtual {v4, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v1

    .line 2162
    if-eqz v1, :cond_74

    .line 2163
    .line 2164
    iget-object v1, v0, La/yhc;->o:La/rqi0;

    .line 2165
    .line 2166
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v2

    .line 2170
    check-cast v2, La/whc;

    .line 2171
    .line 2172
    iget-wide v4, v2, La/whc;->c:J

    .line 2173
    .line 2174
    iget-object v2, v0, La/yhc;->r:La/l810;

    .line 2175
    .line 2176
    iget-byte v2, v2, La/l810;->a:B

    .line 2177
    .line 2178
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v6

    .line 2182
    check-cast v6, La/whc;

    .line 2183
    .line 2184
    iget-object v6, v6, La/whc;->h:Ljava/lang/String;

    .line 2185
    .line 2186
    iput-byte v8, v14, La/bu;->j:B

    .line 2187
    .line 2188
    iget-object v1, v1, La/rqi0;->a:La/p200;

    .line 2189
    .line 2190
    iget-object v7, v1, La/p200;->a:La/b200;

    .line 2191
    .line 2192
    iget-object v1, v1, La/p200;->b:La/btt0;

    .line 2193
    .line 2194
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v1

    .line 2198
    new-instance v8, La/nqi0;

    .line 2199
    .line 2200
    new-instance v9, La/wp40;

    .line 2201
    .line 2202
    invoke-direct {v9, v6, v2, v4, v5}, La/wp40;-><init>(Ljava/lang/String;IJ)V

    .line 2203
    .line 2204
    .line 2205
    invoke-static {v9}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v2

    .line 2209
    invoke-direct {v8, v2}, La/nqi0;-><init>(Ljava/util/List;)V

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v7, v1, v8, v14}, La/b200;->a(Ljava/lang/String;La/nqi0;La/zje;)Ljava/lang/Object;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v1

    .line 2216
    if-ne v1, v3, :cond_75

    .line 2217
    .line 2218
    goto :goto_5c

    .line 2219
    :cond_75
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2220
    .line 2221
    :goto_5c
    if-ne v1, v3, :cond_76

    .line 2222
    .line 2223
    goto :goto_5d

    .line 2224
    :cond_76
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2225
    .line 2226
    :goto_5d
    if-ne v1, v3, :cond_72

    .line 2227
    .line 2228
    goto :goto_5f

    .line 2229
    :goto_5e
    iput-byte v2, v14, La/bu;->j:B

    .line 2230
    .line 2231
    const-wide/16 v1, 0xdac

    .line 2232
    .line 2233
    invoke-static {v1, v2, v14}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v1

    .line 2237
    if-ne v1, v3, :cond_77

    .line 2238
    .line 2239
    :goto_5f
    move-object v9, v3

    .line 2240
    goto :goto_61

    .line 2241
    :cond_77
    :goto_60
    sget v1, La/yhc;->t:I

    .line 2242
    .line 2243
    sget-object v1, La/thc;->a:La/thc;

    .line 2244
    .line 2245
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2246
    .line 2247
    .line 2248
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2249
    .line 2250
    :goto_61
    return-object v9

    .line 2251
    :pswitch_15
    check-cast v7, La/hk4;

    .line 2252
    .line 2253
    sget-object v0, La/wne;->a:La/wne;

    .line 2254
    .line 2255
    iget-byte v3, v14, La/bu;->j:B

    .line 2256
    .line 2257
    if-eqz v3, :cond_7a

    .line 2258
    .line 2259
    if-eq v3, v8, :cond_79

    .line 2260
    .line 2261
    const/4 v4, 0x2

    .line 2262
    if-ne v3, v4, :cond_78

    .line 2263
    .line 2264
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2265
    .line 2266
    .line 2267
    move-object/from16 v3, p1

    .line 2268
    .line 2269
    goto/16 :goto_66

    .line 2270
    .line 2271
    :cond_78
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2272
    .line 2273
    .line 2274
    goto/16 :goto_68

    .line 2275
    .line 2276
    :cond_79
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2277
    .line 2278
    .line 2279
    move-object/from16 v3, p1

    .line 2280
    .line 2281
    goto :goto_62

    .line 2282
    :cond_7a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2283
    .line 2284
    .line 2285
    iget-object v3, v7, La/hk4;->N:La/rou;

    .line 2286
    .line 2287
    iput-byte v8, v14, La/bu;->j:B

    .line 2288
    .line 2289
    invoke-virtual {v3, v5, v14}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v3

    .line 2293
    if-ne v3, v0, :cond_7b

    .line 2294
    .line 2295
    goto :goto_65

    .line 2296
    :cond_7b
    :goto_62
    check-cast v3, La/m2c0;

    .line 2297
    .line 2298
    iget-object v3, v3, La/m2c0;->e0:La/cau0;

    .line 2299
    .line 2300
    sget-object v4, La/cau0;->c:La/cau0;

    .line 2301
    .line 2302
    if-eq v3, v4, :cond_7d

    .line 2303
    .line 2304
    sget-object v4, La/cau0;->j:La/cau0;

    .line 2305
    .line 2306
    if-ne v3, v4, :cond_7c

    .line 2307
    .line 2308
    goto :goto_63

    .line 2309
    :cond_7c
    move v8, v5

    .line 2310
    :cond_7d
    :goto_63
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v3

    .line 2314
    check-cast v3, La/tj4;

    .line 2315
    .line 2316
    iget-object v3, v3, La/tj4;->m:La/jj4;

    .line 2317
    .line 2318
    iget-boolean v3, v3, La/jj4;->j:Z

    .line 2319
    .line 2320
    if-eqz v3, :cond_7e

    .line 2321
    .line 2322
    if-eqz v8, :cond_7e

    .line 2323
    .line 2324
    invoke-virtual {v7}, La/hk4;->N()V

    .line 2325
    .line 2326
    .line 2327
    iget-object v0, v7, La/hk4;->w:La/i1w0;

    .line 2328
    .line 2329
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v1

    .line 2333
    iget-object v2, v7, La/hk4;->M:La/drm0;

    .line 2334
    .line 2335
    invoke-static {v2}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v2

    .line 2339
    new-instance v3, La/f1w0;

    .line 2340
    .line 2341
    invoke-direct {v3, v2}, La/f1w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 2342
    .line 2343
    .line 2344
    new-instance v2, La/c8d;

    .line 2345
    .line 2346
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2347
    .line 2348
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2349
    .line 2350
    .line 2351
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v1

    .line 2355
    :goto_64
    move-object v2, v1

    .line 2356
    check-cast v2, La/paw;

    .line 2357
    .line 2358
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2359
    .line 2360
    .line 2361
    move-result v3

    .line 2362
    if-eqz v3, :cond_81

    .line 2363
    .line 2364
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v2

    .line 2368
    check-cast v2, La/oe50;

    .line 2369
    .line 2370
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2371
    .line 2372
    .line 2373
    goto :goto_64

    .line 2374
    :cond_7e
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v3

    .line 2378
    check-cast v3, La/tj4;

    .line 2379
    .line 2380
    iget-object v3, v3, La/tj4;->m:La/jj4;

    .line 2381
    .line 2382
    iget-boolean v3, v3, La/jj4;->k:Z

    .line 2383
    .line 2384
    if-eqz v3, :cond_80

    .line 2385
    .line 2386
    iget-object v3, v7, La/hk4;->I:La/nou;

    .line 2387
    .line 2388
    const/4 v4, 0x2

    .line 2389
    iput-byte v4, v14, La/bu;->j:B

    .line 2390
    .line 2391
    invoke-static {v3, v14}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v3

    .line 2395
    if-ne v3, v0, :cond_7f

    .line 2396
    .line 2397
    :goto_65
    move-object v9, v0

    .line 2398
    goto :goto_68

    .line 2399
    :cond_7f
    :goto_66
    check-cast v3, La/ql5;

    .line 2400
    .line 2401
    iget-wide v3, v3, La/ql5;->b:D

    .line 2402
    .line 2403
    cmpg-double v0, v3, v1

    .line 2404
    .line 2405
    if-nez v0, :cond_80

    .line 2406
    .line 2407
    new-instance v0, La/lj4;

    .line 2408
    .line 2409
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2410
    .line 2411
    .line 2412
    sget v1, La/hk4;->b0:I

    .line 2413
    .line 2414
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2415
    .line 2416
    .line 2417
    invoke-virtual {v7}, La/hk4;->N()V

    .line 2418
    .line 2419
    .line 2420
    goto :goto_67

    .line 2421
    :cond_80
    sget v0, La/hk4;->b0:I

    .line 2422
    .line 2423
    invoke-virtual {v7}, La/hk4;->N()V

    .line 2424
    .line 2425
    .line 2426
    :cond_81
    :goto_67
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2427
    .line 2428
    :goto_68
    return-object v9

    .line 2429
    :pswitch_16
    check-cast v7, La/kc4;

    .line 2430
    .line 2431
    iget-object v0, v7, La/kc4;->J:La/kd4;

    .line 2432
    .line 2433
    sget-object v3, La/wne;->a:La/wne;

    .line 2434
    .line 2435
    iget-byte v4, v14, La/bu;->j:B

    .line 2436
    .line 2437
    if-eqz v4, :cond_84

    .line 2438
    .line 2439
    if-eq v4, v8, :cond_83

    .line 2440
    .line 2441
    const/4 v8, 0x2

    .line 2442
    if-ne v4, v8, :cond_82

    .line 2443
    .line 2444
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2445
    .line 2446
    .line 2447
    move-object/from16 v4, p1

    .line 2448
    .line 2449
    goto/16 :goto_6c

    .line 2450
    .line 2451
    :cond_82
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2452
    .line 2453
    .line 2454
    goto/16 :goto_6e

    .line 2455
    .line 2456
    :cond_83
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2457
    .line 2458
    .line 2459
    move-object/from16 v4, p1

    .line 2460
    .line 2461
    goto :goto_69

    .line 2462
    :cond_84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2463
    .line 2464
    .line 2465
    iput-byte v8, v14, La/bu;->j:B

    .line 2466
    .line 2467
    sget v4, La/kc4;->Y:I

    .line 2468
    .line 2469
    invoke-virtual {v7, v14}, La/kc4;->P(La/zje;)Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v4

    .line 2473
    if-ne v4, v3, :cond_85

    .line 2474
    .line 2475
    goto :goto_6b

    .line 2476
    :cond_85
    :goto_69
    check-cast v4, Ljava/lang/Boolean;

    .line 2477
    .line 2478
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2479
    .line 2480
    .line 2481
    move-result v4

    .line 2482
    if-eqz v4, :cond_86

    .line 2483
    .line 2484
    iget-object v0, v7, La/kc4;->y:La/i1w0;

    .line 2485
    .line 2486
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v1

    .line 2490
    new-instance v2, La/c8d;

    .line 2491
    .line 2492
    sget-object v3, La/y7d;->a:La/v7d;

    .line 2493
    .line 2494
    sget-object v4, La/m0w0;->a:La/m0w0;

    .line 2495
    .line 2496
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2497
    .line 2498
    .line 2499
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2500
    .line 2501
    .line 2502
    iget-object v2, v7, La/kc4;->O:La/drm0;

    .line 2503
    .line 2504
    invoke-static {v2}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v2

    .line 2508
    new-instance v3, La/f1w0;

    .line 2509
    .line 2510
    invoke-direct {v3, v2}, La/f1w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 2511
    .line 2512
    .line 2513
    new-instance v2, La/c8d;

    .line 2514
    .line 2515
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2516
    .line 2517
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2518
    .line 2519
    .line 2520
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v1

    .line 2524
    :goto_6a
    move-object v2, v1

    .line 2525
    check-cast v2, La/paw;

    .line 2526
    .line 2527
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2528
    .line 2529
    .line 2530
    move-result v3

    .line 2531
    if-eqz v3, :cond_89

    .line 2532
    .line 2533
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v2

    .line 2537
    check-cast v2, La/oe50;

    .line 2538
    .line 2539
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2540
    .line 2541
    .line 2542
    goto :goto_6a

    .line 2543
    :cond_86
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v4

    .line 2547
    check-cast v4, La/mb4;

    .line 2548
    .line 2549
    iget-object v4, v4, La/mb4;->m:La/cb4;

    .line 2550
    .line 2551
    iget-boolean v4, v4, La/cb4;->j:Z

    .line 2552
    .line 2553
    if-eqz v4, :cond_88

    .line 2554
    .line 2555
    iget-object v4, v7, La/kc4;->K:La/nou;

    .line 2556
    .line 2557
    const/4 v8, 0x2

    .line 2558
    iput-byte v8, v14, La/bu;->j:B

    .line 2559
    .line 2560
    invoke-static {v4, v14}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v4

    .line 2564
    if-ne v4, v3, :cond_87

    .line 2565
    .line 2566
    :goto_6b
    move-object v9, v3

    .line 2567
    goto :goto_6e

    .line 2568
    :cond_87
    :goto_6c
    check-cast v4, La/ql5;

    .line 2569
    .line 2570
    iget-wide v3, v4, La/ql5;->b:D

    .line 2571
    .line 2572
    cmpg-double v1, v3, v1

    .line 2573
    .line 2574
    if-nez v1, :cond_88

    .line 2575
    .line 2576
    new-instance v1, La/eb4;

    .line 2577
    .line 2578
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2579
    .line 2580
    .line 2581
    sget v2, La/kc4;->Y:I

    .line 2582
    .line 2583
    invoke-virtual {v7, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2584
    .line 2585
    .line 2586
    invoke-virtual {v0}, La/kd4;->a()V

    .line 2587
    .line 2588
    .line 2589
    goto :goto_6d

    .line 2590
    :cond_88
    invoke-virtual {v0}, La/kd4;->a()V

    .line 2591
    .line 2592
    .line 2593
    :cond_89
    :goto_6d
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2594
    .line 2595
    :goto_6e
    return-object v9

    .line 2596
    :pswitch_17
    check-cast v7, La/hh2;

    .line 2597
    .line 2598
    iget-object v0, v7, La/hh2;->D:La/g2g0;

    .line 2599
    .line 2600
    sget-object v1, La/wne;->a:La/wne;

    .line 2601
    .line 2602
    iget-byte v2, v14, La/bu;->j:B

    .line 2603
    .line 2604
    if-eqz v2, :cond_8d

    .line 2605
    .line 2606
    if-eq v2, v8, :cond_8c

    .line 2607
    .line 2608
    const/4 v8, 0x2

    .line 2609
    if-eq v2, v8, :cond_8b

    .line 2610
    .line 2611
    if-ne v2, v4, :cond_8a

    .line 2612
    .line 2613
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2614
    .line 2615
    .line 2616
    goto :goto_72

    .line 2617
    :cond_8a
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2618
    .line 2619
    .line 2620
    goto :goto_73

    .line 2621
    :cond_8b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2622
    .line 2623
    .line 2624
    goto :goto_70

    .line 2625
    :cond_8c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2626
    .line 2627
    .line 2628
    goto :goto_6f

    .line 2629
    :cond_8d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2630
    .line 2631
    .line 2632
    iget-object v2, v7, La/hh2;->C:La/hjd;

    .line 2633
    .line 2634
    new-instance v3, La/cid;

    .line 2635
    .line 2636
    sget-object v6, La/y1p;->b:La/y1p;

    .line 2637
    .line 2638
    new-instance v6, La/bq2;

    .line 2639
    .line 2640
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 2641
    .line 2642
    .line 2643
    const-string v9, "bet_favor_events"

    .line 2644
    .line 2645
    invoke-direct {v3, v9, v6}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 2646
    .line 2647
    .line 2648
    iput-byte v8, v14, La/bu;->j:B

    .line 2649
    .line 2650
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2651
    .line 2652
    .line 2653
    invoke-virtual {v2, v3, v14}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v2

    .line 2657
    if-ne v2, v1, :cond_8e

    .line 2658
    .line 2659
    goto :goto_71

    .line 2660
    :cond_8e
    :goto_6f
    new-instance v2, La/v1g0;

    .line 2661
    .line 2662
    sget-object v3, La/y1p;->b:La/y1p;

    .line 2663
    .line 2664
    new-instance v3, La/wq2;

    .line 2665
    .line 2666
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2667
    .line 2668
    .line 2669
    iget-object v6, v7, La/hh2;->o:La/vzg0;

    .line 2670
    .line 2671
    const-string v8, "EXPANDED_IDS_KEY"

    .line 2672
    .line 2673
    invoke-virtual {v6, v8}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v6

    .line 2677
    check-cast v6, Ljava/util/Set;

    .line 2678
    .line 2679
    if-nez v6, :cond_8f

    .line 2680
    .line 2681
    sget-object v6, La/xun;->a:La/xun;

    .line 2682
    .line 2683
    :cond_8f
    invoke-direct {v2, v3, v6}, La/v1g0;-><init>(La/wq2;Ljava/util/Set;)V

    .line 2684
    .line 2685
    .line 2686
    const/4 v8, 0x2

    .line 2687
    iput-byte v8, v14, La/bu;->j:B

    .line 2688
    .line 2689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2690
    .line 2691
    .line 2692
    invoke-virtual {v0, v2, v14}, La/g2g0;->i(La/d2g0;La/zje;)Ljava/lang/Object;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v2

    .line 2696
    if-ne v2, v1, :cond_90

    .line 2697
    .line 2698
    goto :goto_71

    .line 2699
    :cond_90
    :goto_70
    invoke-virtual {v0}, La/x2t0;->c()La/i89;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v0

    .line 2703
    new-instance v2, La/yg2;

    .line 2704
    .line 2705
    invoke-direct {v2, v7, v5}, La/yg2;-><init>(La/hh2;B)V

    .line 2706
    .line 2707
    .line 2708
    iput-byte v4, v14, La/bu;->j:B

    .line 2709
    .line 2710
    invoke-virtual {v0, v2, v14}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v0

    .line 2714
    if-ne v0, v1, :cond_91

    .line 2715
    .line 2716
    :goto_71
    move-object v9, v1

    .line 2717
    goto :goto_73

    .line 2718
    :cond_91
    :goto_72
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2719
    .line 2720
    :goto_73
    return-object v9

    .line 2721
    :pswitch_18
    check-cast v7, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 2722
    .line 2723
    sget-object v0, La/wne;->a:La/wne;

    .line 2724
    .line 2725
    iget-byte v1, v14, La/bu;->j:B

    .line 2726
    .line 2727
    if-eqz v1, :cond_94

    .line 2728
    .line 2729
    if-eq v1, v8, :cond_93

    .line 2730
    .line 2731
    const/4 v2, 0x2

    .line 2732
    if-ne v1, v2, :cond_92

    .line 2733
    .line 2734
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2735
    .line 2736
    .line 2737
    goto :goto_77

    .line 2738
    :cond_92
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2739
    .line 2740
    .line 2741
    goto/16 :goto_78

    .line 2742
    .line 2743
    :cond_93
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2744
    .line 2745
    .line 2746
    goto :goto_75

    .line 2747
    :cond_94
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2748
    .line 2749
    .line 2750
    iget-object v1, v7, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->G:La/hjd;

    .line 2751
    .line 2752
    new-instance v2, La/cid;

    .line 2753
    .line 2754
    invoke-virtual {v7}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->N()Ljava/lang/String;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v3

    .line 2758
    iget-object v4, v7, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->q:Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 2759
    .line 2760
    if-eqz v4, :cond_99

    .line 2761
    .line 2762
    instance-of v5, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 2763
    .line 2764
    if-eqz v5, :cond_95

    .line 2765
    .line 2766
    new-instance v5, La/sr2;

    .line 2767
    .line 2768
    check-cast v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 2769
    .line 2770
    iget v4, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;->a:I

    .line 2771
    .line 2772
    invoke-direct {v5, v4}, La/ds2;-><init>(I)V

    .line 2773
    .line 2774
    .line 2775
    goto :goto_74

    .line 2776
    :cond_95
    instance-of v5, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 2777
    .line 2778
    if-eqz v5, :cond_96

    .line 2779
    .line 2780
    new-instance v5, La/vr2;

    .line 2781
    .line 2782
    check-cast v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 2783
    .line 2784
    iget v4, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;->a:I

    .line 2785
    .line 2786
    invoke-direct {v5, v4}, La/ds2;-><init>(I)V

    .line 2787
    .line 2788
    .line 2789
    goto :goto_74

    .line 2790
    :cond_96
    instance-of v5, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;

    .line 2791
    .line 2792
    if-eqz v5, :cond_99

    .line 2793
    .line 2794
    new-instance v5, La/zr2;

    .line 2795
    .line 2796
    check-cast v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;

    .line 2797
    .line 2798
    iget v4, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;->a:I

    .line 2799
    .line 2800
    invoke-direct {v5, v4}, La/ds2;-><init>(I)V

    .line 2801
    .line 2802
    .line 2803
    :goto_74
    invoke-direct {v2, v3, v5}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 2804
    .line 2805
    .line 2806
    iput-byte v8, v14, La/bu;->j:B

    .line 2807
    .line 2808
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2809
    .line 2810
    .line 2811
    invoke-virtual {v1, v2, v14}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 2812
    .line 2813
    .line 2814
    move-result-object v1

    .line 2815
    if-ne v1, v0, :cond_97

    .line 2816
    .line 2817
    goto :goto_76

    .line 2818
    :cond_97
    :goto_75
    iget-object v1, v7, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->H:La/rus;

    .line 2819
    .line 2820
    new-instance v2, La/ell0;

    .line 2821
    .line 2822
    invoke-virtual {v7}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->N()Ljava/lang/String;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v3

    .line 2826
    invoke-direct {v2, v3}, La/ell0;-><init>(Ljava/lang/String;)V

    .line 2827
    .line 2828
    .line 2829
    const/4 v4, 0x2

    .line 2830
    iput-byte v4, v14, La/bu;->j:B

    .line 2831
    .line 2832
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2833
    .line 2834
    .line 2835
    invoke-virtual {v1, v2, v14}, La/rus;->k(La/jll0;La/zje;)Ljava/lang/Object;

    .line 2836
    .line 2837
    .line 2838
    move-result-object v1

    .line 2839
    if-ne v1, v0, :cond_98

    .line 2840
    .line 2841
    :goto_76
    move-object v9, v0

    .line 2842
    goto :goto_78

    .line 2843
    :cond_98
    :goto_77
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2844
    .line 2845
    goto :goto_78

    .line 2846
    :cond_99
    invoke-static {}, La/t9f;->b()V

    .line 2847
    .line 2848
    .line 2849
    :goto_78
    return-object v9

    .line 2850
    :pswitch_19
    check-cast v7, La/cu;

    .line 2851
    .line 2852
    sget-object v0, La/wne;->a:La/wne;

    .line 2853
    .line 2854
    iget-byte v1, v14, La/bu;->j:B

    .line 2855
    .line 2856
    if-eqz v1, :cond_9c

    .line 2857
    .line 2858
    if-eq v1, v8, :cond_9b

    .line 2859
    .line 2860
    const/4 v2, 0x2

    .line 2861
    if-ne v1, v2, :cond_9a

    .line 2862
    .line 2863
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2864
    .line 2865
    .line 2866
    goto :goto_7b

    .line 2867
    :cond_9a
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 2868
    .line 2869
    .line 2870
    goto :goto_7c

    .line 2871
    :cond_9b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2872
    .line 2873
    .line 2874
    goto :goto_79

    .line 2875
    :cond_9c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2876
    .line 2877
    .line 2878
    iget-object v1, v7, La/cu;->c:Ljava/lang/Object;

    .line 2879
    .line 2880
    check-cast v1, La/y3v;

    .line 2881
    .line 2882
    iput-byte v8, v14, La/bu;->j:B

    .line 2883
    .line 2884
    invoke-virtual {v1, v14}, La/y3v;->y(La/zje;)Ljava/io/Serializable;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v1

    .line 2888
    if-ne v1, v0, :cond_9d

    .line 2889
    .line 2890
    goto :goto_7a

    .line 2891
    :cond_9d
    :goto_79
    iget-object v1, v7, La/cu;->b:Ljava/lang/Object;

    .line 2892
    .line 2893
    check-cast v1, La/nvu;

    .line 2894
    .line 2895
    const/4 v2, 0x2

    .line 2896
    iput-byte v2, v14, La/bu;->j:B

    .line 2897
    .line 2898
    invoke-virtual {v1, v14}, La/nvu;->E(La/zje;)Ljava/io/Serializable;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v1

    .line 2902
    if-ne v1, v0, :cond_9e

    .line 2903
    .line 2904
    :goto_7a
    move-object v9, v0

    .line 2905
    goto :goto_7c

    .line 2906
    :cond_9e
    :goto_7b
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2907
    .line 2908
    :goto_7c
    return-object v9

    .line 2909
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
