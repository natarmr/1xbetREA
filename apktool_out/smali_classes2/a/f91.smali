.class public final La/f91;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/n91;

.field public j:Z

.field public k:B

.field public final synthetic l:La/n91;


# direct methods
.method public constructor <init>(La/n91;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f91;->l:La/n91;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/f91;

    .line 2
    .line 3
    iget-object p0, p0, La/f91;->l:La/n91;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/f91;-><init>(La/n91;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/f91;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/f91;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/f91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/f91;->k:B

    .line 6
    .line 7
    iget-object v3, v1, La/f91;->l:La/n91;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v5, :cond_1

    .line 15
    .line 16
    if-ne v0, v4, :cond_0

    .line 17
    .line 18
    iget-boolean v0, v1, La/f91;->j:Z

    .line 19
    .line 20
    iget-object v3, v1, La/f91;->i:La/n91;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v6

    .line 35
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 47
    .line 48
    iget-object v0, v3, La/n91;->t:La/khf0;

    .line 49
    .line 50
    sget-object v7, La/bm5;->e:La/bm5;

    .line 51
    .line 52
    iput-object v6, v1, La/f91;->i:La/n91;

    .line 53
    .line 54
    iput-byte v5, v1, La/f91;->k:B

    .line 55
    .line 56
    invoke-static {v0, v7, v1}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v2, :cond_3

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    :goto_0
    check-cast v0, La/ql5;

    .line 64
    .line 65
    sget-object v5, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_1
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 69
    .line 70
    new-instance v5, La/g0g0;

    .line 71
    .line 72
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object v0, v5

    .line 76
    :goto_2
    nop

    .line 77
    instance-of v5, v0, La/g0g0;

    .line 78
    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-object v6, v0

    .line 83
    :goto_3
    check-cast v6, La/ql5;

    .line 84
    .line 85
    if-eqz v6, :cond_9

    .line 86
    .line 87
    sget v0, La/n91;->f0:I

    .line 88
    .line 89
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object v7, v5

    .line 101
    check-cast v7, La/u81;

    .line 102
    .line 103
    iget-wide v14, v6, La/ql5;->a:J

    .line 104
    .line 105
    const/16 v23, 0x0

    .line 106
    .line 107
    const v24, 0x1ffeff

    .line 108
    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    const/16 v21, 0x0

    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    invoke-static/range {v7 .. v24}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v0, v5, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    iget-object v0, v6, La/ql5;->i:La/txs0;

    .line 141
    .line 142
    invoke-virtual {v0}, La/txs0;->a()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iget-object v5, v3, La/n91;->A:La/es;

    .line 147
    .line 148
    iput-object v3, v1, La/f91;->i:La/n91;

    .line 149
    .line 150
    iput-boolean v0, v1, La/f91;->j:Z

    .line 151
    .line 152
    iput-byte v4, v1, La/f91;->k:B

    .line 153
    .line 154
    invoke-virtual {v5, v1}, La/es;->t(La/zje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-ne v1, v2, :cond_6

    .line 159
    .line 160
    :goto_4
    return-object v2

    .line 161
    :cond_6
    :goto_5
    check-cast v1, Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    sget v0, La/n91;->f0:I

    .line 170
    .line 171
    sget-object v0, La/a81;->a:La/a81;

    .line 172
    .line 173
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_7
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/u81;

    .line 182
    .line 183
    iget-object v1, v1, La/u81;->a:La/mlr;

    .line 184
    .line 185
    iget-boolean v1, v1, La/mlr;->m:Z

    .line 186
    .line 187
    if-eqz v1, :cond_8

    .line 188
    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    sget-object v0, La/y71;->a:La/y71;

    .line 192
    .line 193
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_8
    invoke-virtual {v3}, La/n91;->U()V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    sget v0, La/n91;->f0:I

    .line 202
    .line 203
    sget-object v0, La/x71;->a:La/x71;

    .line 204
    .line 205
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0
.end method
