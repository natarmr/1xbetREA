.class public final La/lv1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dk6;JZLa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/lv1;->i:B

    .line 17
    iput-object p1, p0, La/lv1;->n:Ljava/lang/Object;

    iput-wide p2, p0, La/lv1;->k:J

    iput-boolean p4, p0, La/lv1;->l:Z

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/f1b0;La/jic0;ZJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/lv1;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/lv1;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/lv1;->l:Z

    .line 9
    .line 10
    iput-wide p4, p0, La/lv1;->k:J

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 18
    iput-byte p7, p0, La/lv1;->i:B

    iput-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/lv1;->k:J

    iput-boolean p4, p0, La/lv1;->l:Z

    iput-object p5, p0, La/lv1;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lv1;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/lv1;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/lv1;

    .line 9
    .line 10
    iget-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, La/g9b0;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Ljava/lang/String;

    .line 17
    .line 18
    const/4 v9, 0x5

    .line 19
    iget-wide v4, p0, La/lv1;->k:J

    .line 20
    .line 21
    iget-boolean v6, p0, La/lv1;->l:Z

    .line 22
    .line 23
    move-object v8, p2

    .line 24
    invoke-direct/range {v2 .. v9}, La/lv1;-><init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    move-object v9, p2

    .line 29
    new-instance v3, La/lv1;

    .line 30
    .line 31
    iget-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    check-cast v4, La/f1b0;

    .line 35
    .line 36
    move-object v5, v1

    .line 37
    check-cast v5, La/jic0;

    .line 38
    .line 39
    iget-boolean v6, p0, La/lv1;->l:Z

    .line 40
    .line 41
    iget-wide v7, p0, La/lv1;->k:J

    .line 42
    .line 43
    invoke-direct/range {v3 .. v9}, La/lv1;-><init>(La/f1b0;La/jic0;ZJLa/yje;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :pswitch_1
    move-object v9, p2

    .line 48
    new-instance v3, La/lv1;

    .line 49
    .line 50
    iget-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v4, p1

    .line 53
    check-cast v4, La/ieu;

    .line 54
    .line 55
    move-object v8, v1

    .line 56
    check-cast v8, La/are;

    .line 57
    .line 58
    const/4 v10, 0x3

    .line 59
    iget-wide v5, p0, La/lv1;->k:J

    .line 60
    .line 61
    iget-boolean v7, p0, La/lv1;->l:Z

    .line 62
    .line 63
    invoke-direct/range {v3 .. v10}, La/lv1;-><init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :pswitch_2
    move-object v9, p2

    .line 68
    new-instance v3, La/lv1;

    .line 69
    .line 70
    move-object v4, v1

    .line 71
    check-cast v4, La/dk6;

    .line 72
    .line 73
    iget-wide v5, p0, La/lv1;->k:J

    .line 74
    .line 75
    iget-boolean v7, p0, La/lv1;->l:Z

    .line 76
    .line 77
    move-object v8, v9

    .line 78
    invoke-direct/range {v3 .. v8}, La/lv1;-><init>(La/dk6;JZLa/yje;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, v3, La/lv1;->m:Ljava/lang/Object;

    .line 82
    .line 83
    return-object v3

    .line 84
    :pswitch_3
    move-object v9, p2

    .line 85
    new-instance v3, La/lv1;

    .line 86
    .line 87
    iget-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v4, p1

    .line 90
    check-cast v4, La/yn2;

    .line 91
    .line 92
    move-object v8, v1

    .line 93
    check-cast v8, Ljava/lang/String;

    .line 94
    .line 95
    const/4 v10, 0x1

    .line 96
    iget-wide v5, p0, La/lv1;->k:J

    .line 97
    .line 98
    iget-boolean v7, p0, La/lv1;->l:Z

    .line 99
    .line 100
    invoke-direct/range {v3 .. v10}, La/lv1;-><init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :pswitch_4
    move-object v9, p2

    .line 105
    new-instance v3, La/lv1;

    .line 106
    .line 107
    iget-object p1, p0, La/lv1;->m:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v4, p1

    .line 110
    check-cast v4, La/uv1;

    .line 111
    .line 112
    move-object v8, v1

    .line 113
    check-cast v8, La/bv1;

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    iget-wide v5, p0, La/lv1;->k:J

    .line 117
    .line 118
    iget-boolean v7, p0, La/lv1;->l:Z

    .line 119
    .line 120
    invoke-direct/range {v3 .. v10}, La/lv1;-><init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    return-object v3

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lv1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lv1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lv1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/lv1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/lv1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/lv1;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/lv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/lv1;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/lv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/lv1;->i:B

    .line 4
    .line 5
    iget-boolean v6, v5, La/lv1;->l:Z

    .line 6
    .line 7
    iget-wide v1, v5, La/lv1;->k:J

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    iget-object v3, v5, La/lv1;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v10, v0

    .line 22
    check-cast v10, La/g9b0;

    .line 23
    .line 24
    sget-object v0, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-boolean v6, v5, La/lv1;->j:Z

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    if-ne v6, v8, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object/from16 v1, p1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v10, La/g9b0;->n:La/z4u;

    .line 46
    .line 47
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 48
    .line 49
    invoke-virtual {v4, v1, v2, v5}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-ne v1, v0, :cond_2

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    xor-int/lit8 v15, v0, 0x1

    .line 64
    .line 65
    iget-object v0, v10, La/g9b0;->y:La/i1w0;

    .line 66
    .line 67
    move-object v14, v3

    .line 68
    check-cast v14, Ljava/lang/String;

    .line 69
    .line 70
    new-instance v9, La/k1b;

    .line 71
    .line 72
    const/16 v16, 0x4

    .line 73
    .line 74
    iget-wide v11, v5, La/lv1;->k:J

    .line 75
    .line 76
    iget-boolean v13, v5, La/lv1;->l:Z

    .line 77
    .line 78
    invoke-direct/range {v9 .. v16}, La/k1b;-><init>(Ljava/lang/Object;JZLjava/lang/String;ZB)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v9}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_1
    return-object v4

    .line 87
    :pswitch_0
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v10, v0

    .line 90
    check-cast v10, La/f1b0;

    .line 91
    .line 92
    sget-object v11, La/wne;->a:La/wne;

    .line 93
    .line 94
    iget-boolean v0, v5, La/lv1;->j:Z

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    if-ne v0, v8, :cond_3

    .line 99
    .line 100
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v10, La/f1b0;->P:La/xr;

    .line 112
    .line 113
    check-cast v3, La/jic0;

    .line 114
    .line 115
    invoke-static {v3}, La/vdb;->o0(La/jic0;)La/mlr;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    xor-int/lit8 v2, v6, 0x1

    .line 120
    .line 121
    iget-object v3, v10, La/f1b0;->X:La/eyg0;

    .line 122
    .line 123
    new-instance v12, La/lu0;

    .line 124
    .line 125
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    const-string v4, "weekly_game"

    .line 128
    .line 129
    invoke-static {v13, v14, v4}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v17

    .line 133
    const/4 v15, 0x0

    .line 134
    const-string v16, "popular_new_aggregator"

    .line 135
    .line 136
    invoke-direct/range {v12 .. v17}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v12}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-ne v0, v11, :cond_5

    .line 151
    .line 152
    move-object v4, v11

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    :goto_2
    xor-int/lit8 v15, v6, 0x1

    .line 155
    .line 156
    sget v0, La/f1b0;->w0:I

    .line 157
    .line 158
    iget-object v12, v10, La/f1b0;->y:La/u58;

    .line 159
    .line 160
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v16

    .line 164
    const-string v17, "popular_new_aggregator"

    .line 165
    .line 166
    iget-wide v13, v5, La/lv1;->k:J

    .line 167
    .line 168
    const-string v18, "game_banner"

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, La/u58;->j(JZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v16, v18

    .line 174
    .line 175
    iget-object v12, v10, La/f1b0;->D:La/ix0;

    .line 176
    .line 177
    long-to-int v13, v13

    .line 178
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    sget-object v0, La/y1p;->b:La/y1p;

    .line 183
    .line 184
    move/from16 v17, v15

    .line 185
    .line 186
    const-string v15, "popular_new_aggregator"

    .line 187
    .line 188
    invoke-virtual/range {v12 .. v17}, La/ix0;->h(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    :goto_3
    return-object v4

    .line 194
    :pswitch_1
    sget-object v6, La/wne;->a:La/wne;

    .line 195
    .line 196
    iget-boolean v0, v5, La/lv1;->j:Z

    .line 197
    .line 198
    if-eqz v0, :cond_7

    .line 199
    .line 200
    if-ne v0, v8, :cond_6

    .line 201
    .line 202
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    move-object/from16 v0, p1

    .line 206
    .line 207
    check-cast v0, La/j0g0;

    .line 208
    .line 209
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, La/ieu;

    .line 222
    .line 223
    iget-object v0, v0, La/ieu;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/bl6;

    .line 226
    .line 227
    move-object v4, v3

    .line 228
    check-cast v4, La/are;

    .line 229
    .line 230
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 231
    .line 232
    iget-wide v1, v5, La/lv1;->k:J

    .line 233
    .line 234
    iget-boolean v3, v5, La/lv1;->l:Z

    .line 235
    .line 236
    invoke-virtual/range {v0 .. v5}, La/bl6;->c(JZLa/are;La/zje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ne v0, v6, :cond_8

    .line 241
    .line 242
    move-object v4, v6

    .line 243
    goto :goto_5

    .line 244
    :cond_8
    :goto_4
    new-instance v4, La/j0g0;

    .line 245
    .line 246
    invoke-direct {v4, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :goto_5
    return-object v4

    .line 250
    :pswitch_2
    move-object v11, v3

    .line 251
    check-cast v11, La/dk6;

    .line 252
    .line 253
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v10, v0

    .line 256
    check-cast v10, La/vne;

    .line 257
    .line 258
    sget-object v12, La/wne;->a:La/wne;

    .line 259
    .line 260
    iget-boolean v0, v5, La/lv1;->j:Z

    .line 261
    .line 262
    if-eqz v0, :cond_a

    .line 263
    .line 264
    if-ne v0, v8, :cond_9

    .line 265
    .line 266
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object/from16 v0, p1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_9
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v11, La/dk6;->s:La/pzu;

    .line 280
    .line 281
    iget-object v1, v11, La/dk6;->o:Lorg/xplatform/sportgame/markets/betbuilder/api/navigation/BetBuilderMarketsParams;

    .line 282
    .line 283
    iget-wide v3, v1, Lorg/xplatform/sportgame/markets/betbuilder/api/navigation/BetBuilderMarketsParams;->a:J

    .line 284
    .line 285
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, La/hj6;

    .line 290
    .line 291
    iget-boolean v7, v1, La/hj6;->l:Z

    .line 292
    .line 293
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, La/hj6;

    .line 298
    .line 299
    iget-boolean v1, v1, La/hj6;->m:Z

    .line 300
    .line 301
    iput-object v10, v5, La/lv1;->m:Ljava/lang/Object;

    .line 302
    .line 303
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 304
    .line 305
    move v8, v1

    .line 306
    iget-wide v1, v5, La/lv1;->k:J

    .line 307
    .line 308
    iget-boolean v6, v5, La/lv1;->l:Z

    .line 309
    .line 310
    invoke-virtual/range {v0 .. v8}, La/pzu;->c0(JJLa/zje;ZZZ)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-ne v0, v12, :cond_b

    .line 315
    .line 316
    move-object v4, v12

    .line 317
    goto :goto_7

    .line 318
    :cond_b
    :goto_6
    check-cast v0, La/gmq;

    .line 319
    .line 320
    new-instance v1, La/qj6;

    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    invoke-direct {v1, v11, v14, v9}, La/qj6;-><init>(La/dk6;La/yje;B)V

    .line 324
    .line 325
    .line 326
    new-instance v2, La/fnq;

    .line 327
    .line 328
    const/4 v3, 0x4

    .line 329
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 330
    .line 331
    .line 332
    move-object v0, v10

    .line 333
    new-instance v10, La/zg0;

    .line 334
    .line 335
    iget-wide v12, v5, La/lv1;->k:J

    .line 336
    .line 337
    const/4 v15, 0x1

    .line 338
    invoke-direct/range {v10 .. v15}, La/zg0;-><init>(La/diu0;JLa/yje;B)V

    .line 339
    .line 340
    .line 341
    invoke-static {v2, v0, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 342
    .line 343
    .line 344
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_7
    return-object v4

    .line 347
    :pswitch_3
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, La/yn2;

    .line 350
    .line 351
    sget-object v1, La/wne;->a:La/wne;

    .line 352
    .line 353
    iget-boolean v2, v5, La/lv1;->j:Z

    .line 354
    .line 355
    if-eqz v2, :cond_d

    .line 356
    .line 357
    if-ne v2, v8, :cond_c

    .line 358
    .line 359
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v2, p1

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_c
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    iget-object v2, v0, La/yn2;->F:La/uf3;

    .line 373
    .line 374
    move-object v15, v3

    .line 375
    check-cast v15, Ljava/lang/String;

    .line 376
    .line 377
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 378
    .line 379
    iget-object v2, v2, La/uf3;->a:La/oct;

    .line 380
    .line 381
    iget-object v10, v2, La/oct;->a:La/uxs0;

    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const/16 v16, 0x6

    .line 385
    .line 386
    iget-wide v11, v5, La/lv1;->k:J

    .line 387
    .line 388
    iget-boolean v14, v5, La/lv1;->l:Z

    .line 389
    .line 390
    invoke-static/range {v10 .. v16}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-ne v2, v1, :cond_e

    .line 395
    .line 396
    move-object v4, v1

    .line 397
    goto :goto_b

    .line 398
    :cond_e
    :goto_8
    check-cast v2, La/m7h0;

    .line 399
    .line 400
    iget-object v0, v0, La/yn2;->I:La/i1w0;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 406
    .line 407
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 414
    .line 415
    if-eqz v3, :cond_f

    .line 416
    .line 417
    new-instance v3, La/e1w0;

    .line 418
    .line 419
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 420
    .line 421
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 422
    .line 423
    .line 424
    new-instance v2, La/c8d;

    .line 425
    .line 426
    sget-object v4, La/y7d;->a:La/v7d;

    .line 427
    .line 428
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_f
    new-instance v3, La/w0w0;

    .line 436
    .line 437
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 438
    .line 439
    .line 440
    new-instance v2, La/c8d;

    .line 441
    .line 442
    sget-object v4, La/y7d;->a:La/v7d;

    .line 443
    .line 444
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    :goto_9
    invoke-static {v0, v1, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    :goto_a
    move-object v2, v1

    .line 455
    check-cast v2, La/paw;

    .line 456
    .line 457
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_10

    .line 462
    .line 463
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, La/oe50;

    .line 468
    .line 469
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 470
    .line 471
    .line 472
    goto :goto_a

    .line 473
    :cond_10
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    :goto_b
    return-object v4

    .line 476
    :pswitch_4
    iget-object v0, v5, La/lv1;->m:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v0, La/uv1;

    .line 479
    .line 480
    sget-object v9, La/wne;->a:La/wne;

    .line 481
    .line 482
    iget-boolean v10, v5, La/lv1;->j:Z

    .line 483
    .line 484
    if-eqz v10, :cond_12

    .line 485
    .line 486
    if-ne v10, v8, :cond_11

    .line 487
    .line 488
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_11
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_d

    .line 496
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    check-cast v4, La/yu1;

    .line 504
    .line 505
    iget-object v4, v4, La/yu1;->q:Ljava/util/Map;

    .line 506
    .line 507
    new-instance v7, Ljava/lang/Long;

    .line 508
    .line 509
    invoke-direct {v7, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 510
    .line 511
    .line 512
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    check-cast v4, La/mlr;

    .line 517
    .line 518
    if-eqz v4, :cond_13

    .line 519
    .line 520
    check-cast v3, La/bv1;

    .line 521
    .line 522
    iget-object v7, v0, La/uv1;->t:La/xr;

    .line 523
    .line 524
    xor-int/2addr v6, v8

    .line 525
    invoke-virtual {v0, v1, v2, v3}, La/uv1;->M(JLa/bv1;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    iput-boolean v8, v5, La/lv1;->j:Z

    .line 530
    .line 531
    const/4 v3, 0x0

    .line 532
    move-object v1, v4

    .line 533
    move v2, v6

    .line 534
    move-object v4, v0

    .line 535
    move-object v0, v7

    .line 536
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    if-ne v0, v9, :cond_13

    .line 541
    .line 542
    move-object v4, v9

    .line 543
    goto :goto_d

    .line 544
    :cond_13
    :goto_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 545
    .line 546
    :goto_d
    return-object v4

    .line 547
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
